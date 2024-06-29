import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class507 extends class189 {

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "Z")
    public boolean field7254 = false;

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "I")
    public int field7257 = -1;

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "Lqfa;")
    public static class98 field7259 = new class98(101, -1);

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "I")
    public static int field7255;

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "I")
    public static int field7256;

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "I")
    public int field7258;

    @OriginalMember(owner = "client!ek", name = "p", descriptor = "I")
    public int field7260;

    @OriginalMember(owner = "client!ek", name = "q", descriptor = "I")
    public int field7261;

    @OriginalMember(owner = "client!ek", name = "r", descriptor = "I")
    public int field7262;

    @OriginalMember(owner = "client!ek", name = "s", descriptor = "I")
    public int field7263;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(B)Z")
    public static final boolean method2996(byte arg0) {
        field7255++;
        Hashtable var1 = new Hashtable();
        Enumeration var2 = class427.field5995.keys();
        while (var2.hasMoreElements()) {
            Object var3 = var2.nextElement();
            var1.put(var3, class427.field5995.get(var3));
        }
        try {
            Class var4 = Class.forName("java.lang.reflect.AccessibleObject");
            Class var5 = Class.forName("java.lang.ClassLoader");
            Field var6 = var5.getDeclaredField("nativeLibraries");
            Method var7 = var4.getDeclaredMethod("setAccessible", Boolean.TYPE);
            var7.invoke(var6, Boolean.TRUE);
            try {
                Enumeration var8 = class427.field5995.keys();
                while (var8.hasMoreElements()) {
                    String var9 = (String) var8.nextElement();
                    try {
                        File var10 = (File) class197.field2615.get(var9);
                        Class var11 = (Class) class427.field5995.get(var9);
                        Vector var12 = (Vector) var6.get(var11.getClassLoader());
                        for (int var13 = 0; var12.size() > var13; var13++) {
                            try {
                                Object var14 = var12.elementAt(var13);
                                Field var15 = var14.getClass().getDeclaredField("name");
                                var7.invoke(var15, Boolean.TRUE);
                                try {
                                    String var16 = (String) var15.get(var14);
                                    if (var16 != null && var16.equalsIgnoreCase(var10.getCanonicalPath())) {
                                        Field var17 = var14.getClass().getDeclaredField("handle");
                                        Method var18 = var14.getClass().getDeclaredMethod("finalize");
                                        var7.invoke(var17, Boolean.TRUE);
                                        var7.invoke(var18, Boolean.TRUE);
                                        try {
                                            var18.invoke(var14);
                                            var17.set(var14, Integer.valueOf(0));
                                            var1.remove(var9);
                                        } catch (Throwable var19) {
                                        }
                                        var7.invoke(var18, Boolean.FALSE);
                                        var7.invoke(var17, Boolean.FALSE);
                                    }
                                } catch (Throwable var20) {
                                }
                                var7.invoke(var15, Boolean.FALSE);
                            } catch (Throwable var21) {
                            }
                        }
                    } catch (Throwable var22) {
                    }
                }
            } catch (Throwable var23) {
            }
            var7.invoke(var6, Boolean.FALSE);
            if (arg0 >= -66) {
                method2998(81);
            }
        } catch (Throwable var24) {
        }
        class427.field5995 = var1;
        return class427.field5995.isEmpty();
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BLeea;)V")
    public static final void method2997(byte arg0, class131 arg1) {
        if (class288.field4075 == null) {
            class587 var2 = new class587();
            byte[] var3 = var2.method3327(128, 128, 16, false);
            class288.field4075 = class273.method1777(104, false, var3);
        }
        if (arg0 != -82) {
            method2997((byte) 79, null);
        }
        field7256++;
        if (class404.field5717 == null) {
            class388 var4 = new class388();
            byte[] var5 = var4.method2441(128, (byte) -56, 16, 128);
            class404.field5717 = class273.method1777(110, false, var5);
        }
        class561 var6 = arg1.field1789;
        if (var6.method3232(true) && class195.field2601 == null) {
            byte[] var7 = class4.method21(0.5F, 16, 128, new class203(419684), 128, 8, 16.0F, 4.0F, 0, 0.6F, 4.0F);
            class195.field2601 = class273.method1777(123, false, var7);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
    public static void method2998(int arg0) {
        field7259 = null;
        if (arg0 != 128) {
            method2998(8);
        }
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(I)V")
    public class507(int arg0) {
        this.field7257 = arg0;
    }
}
