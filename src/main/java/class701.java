import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class701 {

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "Lqp;")
    private class715 field9884 = new class715(256);

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "Lqp;")
    private class715 field9889 = new class715(256);

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "Lla;")
    private class423 field9878;

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "Lla;")
    private class423 field9880;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "I")
    public static int field9879;

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "I")
    public static int field9881;

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
    public static int field9882;

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "I")
    public static int field9883;

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "I")
    public static int field9885;

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "I")
    public static int field9886;

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "I")
    public static int field9887;

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "I")
    public static int field9888;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIIIZ)V")
    public static final void method3935(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        class559.field8124 = arg5;
        class697.field9856 = arg1;
        class674.field9597 = arg3;
        class136.field1875 = arg0;
        class389.field5611 = arg4;
        field9886++;
        if (arg6 && class697.field9856 >= 100) {
            class518.field7473 = class559.field8124 * 512 + 256;
            class123.field1698 = class136.field1875 * 512 + 256;
            class564.field8174 = class530.method3211(class123.field1698, 2, class518.field7473, class687.field9758) - class674.field9597;
        }
        if (arg2 == 10198) {
            class165.field2351 = 2;
            class616.field8773 = -1;
            class539.field7824 = -1;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(BI[II)Ljda;")
    private final class673 method3936(byte arg0, int arg1, int[] arg2, int arg3) {
        field9885++;
        int var5 = (arg3 >>> 12 | (arg3 & 0xFFF) << 4) ^ arg1;
        if (arg0 != -128) {
            method3939(false);
        }
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6;
        class673 var9 = (class673) this.field9889.method4020(var7, (byte) -82);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class29 var10 = class29.method147(this.field9880, arg3, arg1);
            if (var10 == null) {
                return null;
            }
            class673 var11 = var10.method146();
            this.field9889.method4022(var11, -42, var7);
            if (arg2 != null) {
                arg2[0] -= var11.field9579.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "([IIB)Ljda;")
    public final class673 method3937(int[] arg0, int arg1, byte arg2) {
        field9887++;
        if (this.field9878.method2623(-1) == 1) {
            return this.method3940((byte) 107, arg0, arg1, 0);
        } else if (this.field9878.method2616(arg1, 0) == 1) {
            return this.method3940((byte) 124, arg0, 0, arg1);
        } else if (arg2 == -106) {
            throw new RuntimeException();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)Llb;")
    public static final class634 method3938(int arg0) {
        field9881++;
        try {
            return arg0 >= -107 ? null : (class634) Class.forName("nq").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Z)V")
    public static final void method3939(boolean arg0) {
        field9882++;
        if (arg0) {
            return;
        }
        class481.field6878 = 0;
        int var1 = (class108.field1536.field3923 >> 9) + class41.field693;
        int var2 = (class108.field1536.field3916 >> 9) + class71.field1085;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class481.field6878 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class481.field6878 = 1;
        }
        if (class481.field6878 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class481.field6878 = 0;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(B[III)Ljda;")
    private final class673 method3940(byte arg0, int[] arg1, int arg2, int arg3) {
        field9888++;
        int var5 = arg2 ^ ((arg3 & 0x20000FFF) << 4 | arg3 >>> 12);
        int var6 = var5 | arg3 << 16;
        if (arg0 <= 96) {
            return null;
        }
        long var7 = (long) var6 ^ 0x100000000L;
        class673 var9 = (class673) this.field9889.method4020(var7, (byte) -63);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class531 var10 = (class531) this.field9884.method4020(var7, (byte) -96);
            if (var10 == null) {
                var10 = class531.method3228(this.field9878, arg3, arg2);
                if (var10 == null) {
                    return null;
                }
                this.field9884.method4022(var10, -38, var7);
            }
            class673 var11 = var10.method3229(arg1);
            if (var11 == null) {
                return null;
            } else {
                var10.method2656((byte) 118);
                this.field9889.method4022(var11, -109, var7);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILvo;BLjw;)V")
    public static final void method3941(int arg0, class131 arg1, byte arg2, class280 arg3) {
        field9879++;
        if (class279.field3914 >= 50 || arg1 == null || arg1.field1797 == null || arg1.field1797.length <= arg0 || arg1.field1797[arg0] == null) {
            return;
        }
        int var4 = arg1.field1797[arg0][0];
        if (arg2 != 101) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = (var4 & 0xF0) >> 5;
        int var7 = var4 & 0x1F;
        if (arg1.field1797[arg0].length > 1) {
            int var8 = (int) ((double) arg1.field1797[arg0].length * Math.random());
            if (var8 > 0) {
                var5 = arg1.field1797[arg0][var8];
            }
        }
        int var9 = 256;
        if (arg1.field1804 != null && arg1.field1785 != null) {
            var9 = (int) (Math.random() * (double) (arg1.field1785[arg0] - arg1.field1804[arg0])) + arg1.field1804[arg0];
        }
        int var10 = arg1.field1808 == null ? 255 : arg1.field1808[arg0];
        if (var7 == 0) {
            if (class108.field1536 == arg3) {
                if (arg1.field1787) {
                    class588.method3458(var6, var5, 0, false, var9, (byte) -64, var10);
                    return;
                }
                class298.method1856(var5, 0, var9, var10, var6, arg2 ^ 0x57);
            }
        } else if (class243.field3580.field8000.method3577(false) != 0) {
            int var11 = arg3.field3923 - 256 >> 9;
            int var12 = arg3.field3916 - 256 >> 9;
            int var13 = class108.field1536 == arg3 ? 0 : (var12 << 8) + ((arg3.field3920 << 24) + var7 + (var11 << 16));
            class585.field8346[class279.field3914++] = new class105((byte) (arg1.field1787 ? 2 : 1), var5, var6, 0, var10, var13, var9, arg3);
        }
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lla;Lla;)V")
    public class701(class423 arg0, class423 arg1) {
        this.field9878 = arg1;
        this.field9880 = arg0;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "([IZI)Ljda;")
    public final class673 method3942(int[] arg0, boolean arg1, int arg2) {
        field9883++;
        if (this.field9880.method2623(-1) == 1) {
            return this.method3936((byte) -128, arg2, arg0, 0);
        } else if (this.field9880.method2616(arg2, 0) == 1) {
            return this.method3936((byte) -128, 0, arg0, arg2);
        } else {
            if (!arg1) {
                this.method3940((byte) -65, null, -102, -23);
            }
            throw new RuntimeException();
        }
    }
}
