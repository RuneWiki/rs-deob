import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class191 extends class335 {

    @OriginalMember(owner = "client!qf", name = "B", descriptor = "[I")
    public static int[] field2642 = new int[3];

    @OriginalMember(owner = "client!qf", name = "I", descriptor = "Lsj;")
    public static class666 field2649 = new class666();

    @OriginalMember(owner = "client!qf", name = "K", descriptor = "[I")
    public static int[] field2651 = new int[4];

    @OriginalMember(owner = "client!qf", name = "C", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!qf", name = "D", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!qf", name = "F", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!qf", name = "G", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!qf", name = "H", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!qf", name = "J", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!qf", name = "L", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!qf", name = "M", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!qf", name = "E", descriptor = "[[B")
    public static byte[][] field2645;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(JIIZI)Ljava/lang/String;")
    public static final String method1255(long arg0, int arg1, int arg2, boolean arg3, int arg4) {
        ++field2647;
        char var6 = ',';
        char var7 = '.';
        if (arg2 == 0) {
            var7 = ',';
            var6 = '.';
        }
        if (~arg2 == -3) {
            var7 = 160;
        }
        int var8 = -91 / (-arg1 / 54);
        boolean var9 = false;
        if (arg0 < 0L) {
            var9 = true;
            arg0 = -arg0;
        }
        StringBuffer var10 = new StringBuffer(26);
        if (~arg4 < -1) {
            for (int var11 = 0; arg4 > var11; ++var11) {
                int var12 = (int) arg0;
                arg0 /= 10L;
                var10.append((char) (var12 + 48 - (int) arg0 * 10));
            }
            var10.append(var6);
        }
        int var13 = 0;
        while (true) {
            int var14 = (int) arg0;
            arg0 /= 10L;
            var10.append((char) (48 - -var14 + -((int) arg0 * 10)));
            if (~arg0 == -1L) {
                if (var9) {
                    var10.append('-');
                }
                return var10.reverse().toString();
            }
            if (arg3) {
                ++var13;
                if (~(var13 % 3) == -1) {
                    var10.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILio;I)V")
    public final void method2(int arg0, class157 arg1, int arg2) {
        ++field2648;
        if (arg2 != -66) {
            this.method1(40, true);
        }
        if (arg0 == 0) {
            super.field4537 = ~arg1.method930(255) == -2;
        }
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "(I)V")
    public static final void method1256(int arg0) {
        ++field2644;
        if (class540.field7407 != null) {
            class540.field7407.method2859(16777215);
        }
        if (class604.field8439 != null) {
            while (true) {
                try {
                    class604.field8439.join();
                    break;
                } catch (InterruptedException var1) {
                }
            }
        }
        if (arg0 != 13788) {
            field2645 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(Z)V")
    public static final void method1257(boolean arg0) {
        ++field2650;
        int[] var1 = new int[class87.field1058.field2902];
        int var2 = 0;
        for (int var3 = 0; ~class87.field1058.field2902 < ~var3; ++var3) {
            class584 var5 = class87.field1058.method1394(-80, var3);
            if (var5.field8020 >= 0 || ~var5.field8021 <= -1) {
                var1[var2++] = var3;
            }
        }
        if (!arg0) {
            class284.field3740 = new int[var2];
            for (int var4 = 0; ~var4 > ~var2; ++var4) {
                class284.field3740[var4] = var1[var4];
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BII)V")
    public static final void method1258(byte arg0, int arg1, int arg2) {
        ++field2653;
        class256 var3 = class592.method3279((byte) -112, 7, arg1);
        var3.method1549(-32042);
        var3.field3358 = arg2;
        int var4 = -34 % ((35 - arg0) / 59);
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(B)V")
    public static void method1259(byte arg0) {
        field2642 = null;
        field2649 = null;
        field2645 = null;
        int var1 = 11 / ((arg0 - -70) / 32);
        field2651 = null;
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "(III)V")
    private final void method1260(int arg0, int arg1, int arg2) {
        ++field2646;
        if (arg0 != -2) {
            this.method1(38, true);
        }
        int var4 = class376.field4981[arg2];
        int var5 = class686.field9697[arg1];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 - 2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class130.field1804 = arg1;
            class54.field705 = arg2;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class130.field1804 = arg2;
            class54.field705 = arg1;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class130.field1804 = arg2;
            class54.field705 = -arg1 + class649.field8968;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class130.field1804 = -arg1 + class316.field4237;
            class54.field705 = arg2;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class130.field1804 = -arg1 + class316.field4237;
            class54.field705 = -arg2 + class649.field8968;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class130.field1804 = -arg2 + class316.field4237;
            class54.field705 = class649.field8968 - arg1;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class54.field705 = arg1;
            class130.field1804 = -arg2 + class316.field4237;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class130.field1804 = arg1;
            class54.field705 = class649.field8968 - arg2;
        }
        class130.field1804 &= class326.field4386;
        class54.field705 &= class29.field413;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZI)[I")
    public final int[] method3(boolean arg0, int arg1) {
        ++field2643;
        if (!arg0) {
            method1255(92L, 72, 125, false, 53);
        }
        int[] var3 = super.field4525.method2344(-2, arg1);
        if (super.field4525.field5435) {
            for (int var4 = 0; ~var4 > ~class649.field8968; ++var4) {
                this.method1260(-2, arg1, var4);
                int[] var5 = this.method1969(0, class130.field1804, -128);
                var3[var4] = var5[class54.field705];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method1(int arg0, boolean arg1) {
        ++field2652;
        if (arg1) {
            field2651 = null;
        }
        int[][] var3 = super.field4527.method669(arg0, (byte) 2);
        if (super.field4527.field1468) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~var7 > ~class649.field8968; ++var7) {
                this.method1260(-2, arg0, var7);
                int[][] var8 = this.method1968(class130.field1804, 3, 0);
                var4[var7] = var8[0][class54.field705];
                var5[var7] = var8[1][class54.field705];
                var6[var7] = var8[2][class54.field705];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V")
    public class191() {
        super(1, false);
    }
}
