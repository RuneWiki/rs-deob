import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class251 extends class203 {

    @OriginalMember(owner = "client!rn", name = "l", descriptor = "I")
    private int field3233 = 0;

    @OriginalMember(owner = "client!rn", name = "p", descriptor = "Lhs;")
    public static class304 field3237 = new class304();

    @OriginalMember(owner = "client!rn", name = "m", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!rn", name = "n", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!rn", name = "o", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!rn", name = "q", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "([III[ILkea;I)Ltd;")
    public static final class422 method1511(int[] arg0, int arg1, int arg2, int[] arg3, class223 arg4, int arg5) {
        ++field3234;
        if (arg1 != 0) {
            field3236 = 37;
        }
        if (!arg4.method357(arg1 + -22567, class100.field1288, class190.field2256)) {
            int[] var6 = new int[arg2 * arg5];
            for (int var7 = 0; var7 < arg5; ++var7) {
                int var8 = arg2 * var7 - -arg0[var7];
                for (int var9 = 0; ~arg3[var7] < ~var9; ++var9) {
                    var6[var8++] = -16777216;
                }
            }
            return new class422(arg4, arg2, arg5, var6);
        } else {
            byte[] var10 = new byte[arg2 * arg5];
            for (int var11 = 0; ~arg5 < ~var11; ++var11) {
                int var12 = arg2 * var11 + arg0[var11];
                for (int var13 = 0; ~var13 > ~arg3[var11]; ++var13) {
                    var10[var12++] = -1;
                }
            }
            return new class422(arg4, arg2, arg5, var10);
        }
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(Z)Z")
    public static final boolean method1512(boolean arg0) {
        ++field3238;
        if (!arg0) {
            method1511((int[]) null, -99, -121, (int[]) null, (class223) null, -84);
        }
        Hashtable var1 = new Hashtable();
        Enumeration var2 = class167.field1960.keys();
        while (var2.hasMoreElements()) {
            Object var3 = var2.nextElement();
            var1.put(var3, class167.field1960.get(var3));
        }
        try {
            Class var4 = Class.forName("java.lang.reflect.AccessibleObject");
            Class var5 = Class.forName("java.lang.ClassLoader");
            Field var6 = var5.getDeclaredField("nativeLibraries");
            Method var7 = var4.getDeclaredMethod("setAccessible", Boolean.TYPE);
            var7.invoke(var6, Boolean.TRUE);
            try {
                Enumeration var8 = class167.field1960.keys();
                while (var8.hasMoreElements()) {
                    String var9 = (String) var8.nextElement();
                    try {
                        File var10 = (File) class186.field2190.get(var9);
                        Class var11 = (Class) class167.field1960.get(var9);
                        Vector var12 = (Vector) var6.get(var11.getClassLoader());
                        for (int var13 = 0; var13 < var12.size(); ++var13) {
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
                                            var17.set(var14, new Integer(0));
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
        } catch (Throwable var24) {
        }
        class167.field1960 = var1;
        return class167.field1960.isEmpty();
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Lpfa;Lqg;)V")
    public class251(class275 arg0, class431 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(ZB)V")
    public final void method513(boolean arg0, byte arg1) {
        ++field3235;
        if (arg1 < 57) {
            this.method513(false, (byte) -47);
        }
        int var3 = super.field2356.field3385.method3205(class696.field9640, -7963, super.field2354.method1552()) + super.field2356.field3386;
        int var4 = super.field2356.field3383.method1445(2, class634.field8596, super.field2354.method1549()) + super.field2356.field3381;
        super.field2354.method2555((float) (var3 + super.field2354.method1552() / 2), (float) (super.field2354.method1549() / 2 + var4), 4096, this.field3233);
        this.field3233 += ((class431) super.field2356).field5438;
    }

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "(I)V")
    public static void method1513(int arg0) {
        field3237 = null;
        int var1 = 20 % ((-88 - arg0) / 33);
    }
}
