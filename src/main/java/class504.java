import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class504 extends class316 {

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "I")
    private int field7203 = -1;

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "B")
    private byte field7202;

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "I")
    public static int field7201;

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "I")
    public static int field7204;

    @OriginalMember(owner = "client!bi", name = "p", descriptor = "I")
    public static int field7205;

    @OriginalMember(owner = "client!bi", name = "q", descriptor = "I")
    private int field7206;

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "I")
    public static int field7207;

    @OriginalMember(owner = "client!bi", name = "s", descriptor = "I")
    public static int field7208;

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "I")
    public static int field7209;

    @OriginalMember(owner = "client!bi", name = "u", descriptor = "Ljava/lang/String;")
    private String field7210;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lua;I)V")
    public final void method819(class692 arg0, int arg1) {
        field7201++;
        class88 var3 = arg0.field9778[this.field7203];
        var3.field1147 = this.field7202;
        var3.field1148 = this.field7210;
        var3.field1145 = this.field7206;
        if (arg1 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2936(int arg0, byte arg1, int arg2) {
        int var3 = -112 % ((arg1 + 50) / 48);
        field7209++;
        return (arg0 & 0x800) != 0 | class345.method2193(arg2, arg0, (byte) -99) || class339.method2177(arg0, arg2, false);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILrv;)V")
    public final void method818(int arg0, class120 arg1) {
        if (arg0 != -2) {
            method2939(2);
        }
        this.field7203 = arg1.method898((byte) -95);
        field7204++;
        this.field7202 = arg1.method877(-252);
        this.field7206 = arg1.method898((byte) -124);
        arg1.method834(-8616);
        this.field7210 = arg1.method861(true);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)Lgq;")
    public static final class538 method2937(int arg0, int arg1) {
        field7208++;
        class538[] var2 = class73.method577(arg0 ^ 0x925A);
        if (arg0 != 6750) {
            method2937(-102, -75);
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class538 var4 = var2[var3];
            if (var4.field7565 == arg1) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "([I[JB)V")
    public static final void method2938(int[] arg0, long[] arg1, byte arg2) {
        field7207++;
        class587.method3403((byte) 16, arg1.length - 1, 0, arg0, arg1);
        if (arg2 != 40) {
            method2937(27, -101);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)Z")
    public static final boolean method2939(int arg0) {
        field7205++;
        Hashtable var1 = new Hashtable();
        Enumeration var2 = class219.field3121.keys();
        while (var2.hasMoreElements()) {
            Object var3 = var2.nextElement();
            var1.put(var3, class219.field3121.get(var3));
        }
        try {
            Class var4 = Class.forName("java.lang.reflect.AccessibleObject");
            Class var5 = Class.forName("java.lang.ClassLoader");
            Field var6 = var5.getDeclaredField("nativeLibraries");
            Method var7 = var4.getDeclaredMethod("setAccessible", Boolean.TYPE);
            int var8 = 64 / ((arg0 - 31) / 38);
            var7.invoke(var6, Boolean.TRUE);
            try {
                Enumeration var9 = class219.field3121.keys();
                while (var9.hasMoreElements()) {
                    String var10 = (String) var9.nextElement();
                    try {
                        File var11 = (File) class45.field658.get(var10);
                        Class var12 = (Class) class219.field3121.get(var10);
                        Vector var13 = (Vector) var6.get(var12.getClassLoader());
                        for (int var14 = 0; var14 < var13.size(); var14++) {
                            try {
                                Object var15 = var13.elementAt(var14);
                                Field var16 = var15.getClass().getDeclaredField("name");
                                var7.invoke(var16, Boolean.TRUE);
                                try {
                                    String var17 = (String) var16.get(var15);
                                    if (var17 != null && var17.equalsIgnoreCase(var11.getCanonicalPath())) {
                                        Field var18 = var15.getClass().getDeclaredField("handle");
                                        Method var19 = var15.getClass().getDeclaredMethod("finalize");
                                        var7.invoke(var18, Boolean.TRUE);
                                        var7.invoke(var19, Boolean.TRUE);
                                        try {
                                            var19.invoke(var15);
                                            var18.set(var15, Integer.valueOf(0));
                                            var1.remove(var10);
                                        } catch (Throwable var20) {
                                        }
                                        var7.invoke(var19, Boolean.FALSE);
                                        var7.invoke(var18, Boolean.FALSE);
                                    }
                                } catch (Throwable var21) {
                                }
                                var7.invoke(var16, Boolean.FALSE);
                            } catch (Throwable var22) {
                            }
                        }
                    } catch (Throwable var23) {
                    }
                }
            } catch (Throwable var24) {
            }
            var7.invoke(var6, Boolean.FALSE);
        } catch (Throwable var25) {
        }
        class219.field3121 = var1;
        return class219.field3121.isEmpty();
    }
}
