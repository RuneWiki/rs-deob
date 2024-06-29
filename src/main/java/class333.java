import java.io.File;
import java.lang.reflect.Method;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class333 extends class82 {

    @OriginalMember(owner = "client!hf", name = "P", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4318 = new BigInteger("cbaeec6ab1feb2b2a48da69ff3fbab8f8fee1376ad75cf2b19df40a196dec70675c0546173268f8b29b61142defd86a8863efb12cc60d72438f944402acd30d7", 16);

    @OriginalMember(owner = "client!hf", name = "R", descriptor = "Lvj;")
    public static class373 field4320 = new class373(107, -2);

    @OriginalMember(owner = "client!hf", name = "L", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!hf", name = "M", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!hf", name = "N", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!hf", name = "O", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!hf", name = "Q", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!hf", name = "S", descriptor = "I")
    public static int field4321;

    // $FF: synthetic field
    @OriginalMember(owner = "client!hf", name = "T", descriptor = "Ljava/lang/Class;")
    public static Class field4322;

    // $FF: synthetic method
    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1867(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(II)[I", line = 5)
    public final int[] method201(int arg0, int arg1) {
        ++field4319;
        int[] var3 = super.field990.method1566((byte) 116, arg0);
        if (arg1 != 12218) {
            field4321 = 73;
        }
        if (super.field990.field3641) {
            int[] var4 = this.method489(false, 0, arg0);
            int[] var5 = this.method489(false, 1, arg0);
            int[] var6 = this.method489(false, 2, arg0);
            for (int var7 = 0; ~var7 > ~class629.field9033; ++var7) {
                int var8 = var6[var7];
                if (~var8 == -4097) {
                    var3[var7] = var4[var7];
                } else if (var8 == 0) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V", line = 57)
    public class333() {
        super(3, false);
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(II)[[I", line = 60)
    public final int[][] method481(int arg0, int arg1) {
        ++field4316;
        int[][] var3 = super.field992.method3178(arg1, 0);
        if (arg0 != 1000) {
            method1865((Class) null, 42, (String) null);
        }
        if (super.field992.field7962) {
            int[] var4 = this.method489(false, 2, arg1);
            int[][] var5 = this.method488(0, arg1, 1);
            int[][] var6 = this.method488(1, arg1, 1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; ~class629.field9033 < ~var16; ++var16) {
                int var17 = var4[var16];
                if (var17 != 4096) {
                    if (var17 != 0) {
                        int var18 = -var17 + 4096;
                        var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                        var8[var16] = var11[var16] * var17 - -(var14[var16] * var18) >> 12;
                        var9[var16] = var12[var16] * var17 - -(var15[var16] * var18) >> 12;
                    } else {
                        var7[var16] = var13[var16];
                        var8[var16] = var14[var16];
                        var9[var16] = var15[var16];
                    }
                } else {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Z", line = 139)
    public static final boolean method1865(Class arg0, int arg1, String arg2) {
        if (arg1 != 3) {
            field4321 = -106;
        }
        ++field4317;
        Class var3 = (Class) class344.field4457.get(arg2);
        if (var3 != null) {
            if (var3.getClassLoader() != arg0.getClassLoader()) {
                throw new RuntimeException();
            } else {
                return true;
            }
        } else {
            Object var4 = null;
            File var5 = (File) class416.field5399.get(arg2);
            if (var5 != null) {
                try {
                    var5 = new File(var5.getCanonicalPath());
                    Class var6 = Class.forName("java.lang.Runtime");
                    Class var7 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var8 = var7.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    Method var9 = var6.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
                    var8.invoke(var9, Boolean.TRUE);
                    var9.invoke(Runtime.getRuntime(), arg0, var5.getPath());
                    var8.invoke(var9, Boolean.FALSE);
                    class344.field4457.put(arg2, arg0);
                    return true;
                } catch (NoSuchMethodException var10) {
                    System.load(var5.getPath());
                    class344.field4457.put(arg2, field4322 != null ? field4322 : (field4322 = method1867("cv")));
                    return true;
                } catch (Throwable var11) {
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IILos;)V", line = 203)
    public final void method198(int arg0, int arg1, class374 arg2) {
        if (~arg0 == -1) {
            super.field999 = ~arg2.method2129(-79) == -2;
        }
        int var4 = 114 % ((arg1 - -69) / 42);
        ++field4314;
    }

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "(I)V", line = 226)
    public static void method1866(int arg0) {
        if (arg0 != 1) {
            method1866(-75);
        }
        field4320 = null;
        field4318 = null;
    }
}
