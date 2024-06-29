import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class206 extends class261 {

    @OriginalMember(owner = "client!wj", name = "M", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3536 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!wj", name = "R", descriptor = "I")
    public static int field3541 = 0;

    @OriginalMember(owner = "client!wj", name = "Q", descriptor = "Lve;")
    public static class255 field3540 = class87.method607(42, "<col=ffff00>");

    @OriginalMember(owner = "client!wj", name = "T", descriptor = "Lve;")
    public static class255 field3543 = class87.method607(74, "loginscreen");

    @OriginalMember(owner = "client!wj", name = "U", descriptor = "I")
    public static int field3544 = 0;

    @OriginalMember(owner = "client!wj", name = "S", descriptor = "J")
    public static long field3542 = 0L;

    @OriginalMember(owner = "client!wj", name = "V", descriptor = "Lve;")
    public static class255 field3545 = class87.method607(40, "blinken3:");

    @OriginalMember(owner = "client!wj", name = "F", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!wj", name = "G", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!wj", name = "H", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!wj", name = "I", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!wj", name = "J", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!wj", name = "K", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!wj", name = "L", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!wj", name = "N", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!wj", name = "O", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!wj", name = "P", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!wj", name = "W", descriptor = "Lrg;")
    public static class88 field3546;

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V", line = 5)
    public class206() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(BI)[I", line = 12)
    public final int[] method21(byte arg0, int arg1) {
        int var3 = -38 / ((arg0 + 49) / 33);
        field3529++;
        int[] var4 = this.field4425.method906(arg1, 8251);
        if (this.field4425.field2043) {
            for (int var5 = 0; var5 < class92.field1576; var5++) {
                this.method1494(-112, arg1, var5);
                int[] var6 = this.method1822(0, 117, class129.field2129);
                var4[var5] = var6[class310.field5296];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZI)[[I", line = 46)
    public final int[][] method13(boolean arg0, int arg1) {
        int[][] var3 = this.field4418.method35(arg1, 94);
        field3530++;
        if (!arg0) {
            return (int[][]) ((int[][]) null);
        }
        if (this.field4418.field94) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class92.field1576; var7++) {
                this.method1494(-13, arg1, var7);
                int[][] var8 = this.method1819(104, 0, class129.field2129);
                var4[var7] = var8[0][class310.field5296];
                var5[var7] = var8[1][class310.field5296];
                var6[var7] = var8[2][class310.field5296];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lrg;Lrg;I)I", line = 88)
    public static final int method1491(class88 arg0, class88 arg1, int arg2) {
        field3538++;
        int var3 = 0;
        if (arg1.method634(-19044, class63.field960)) {
            var3++;
        }
        if (arg1.method634(-19044, class75.field1239)) {
            var3++;
        }
        if (arg2 > -57) {
            field3543 = (class255) null;
        }
        if (arg1.method634(-19044, class123.field2046)) {
            var3++;
        }
        if (arg0.method634(-19044, class63.field960)) {
            var3++;
        }
        if (arg0.method634(-19044, class75.field1239)) {
            var3++;
        }
        if (arg0.method634(-19044, class123.field2046)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "(B)V", line = 136)
    public static void method1492(byte arg0) {
        field3540 = null;
        field3536 = null;
        field3545 = null;
        if (arg0 >= -90) {
            method1491((class88) null, (class88) null, -69);
        }
        field3546 = null;
        field3543 = null;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIILme;Lme;IIIIJ)V", line = 149)
    public static final void method1493(int arg0, int arg1, int arg2, int arg3, class177 arg4, class177 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class213 var12 = new class213();
        var12.field3625 = arg10;
        var12.field3622 = arg1 * 128 + 64;
        var12.field3639 = arg2 * 128 + 64;
        var12.field3638 = arg3;
        var12.field3634 = arg4;
        var12.field3637 = arg5;
        var12.field3635 = arg6;
        var12.field3627 = arg7;
        var12.field3636 = arg8;
        var12.field3640 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class118.field1984[var13][arg1][arg2] == null) {
                class118.field1984[var13][arg1][arg2] = new class249(var13, arg1, arg2);
            }
        }
        class118.field1984[arg0][arg1][arg2].field4183 = var12;
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(III)V", line = 180)
    private final void method1494(int arg0, int arg1, int arg2) {
        int var4 = -105 % ((45 - arg0) / 33);
        field3533++;
        int var5 = class245.field4120[arg2];
        int var6 = class20.field324[arg1];
        float var7 = (float) Math.atan2((double) (var5 - 2048), (double) (var6 - 2048));
        if (-3.141592653589793D <= (double) var7 && -2.356194490192345D >= (double) var7) {
            class129.field2129 = arg1;
            class310.field5296 = arg2;
        } else if ((double) var7 <= -1.5707963267948966D && (double) var7 >= -2.356194490192345D) {
            class129.field2129 = arg2;
            class310.field5296 = arg1;
        } else if ((double) var7 <= -0.7853981633974483D && (double) var7 >= -1.5707963267948966D) {
            class310.field5296 = class92.field1576 - arg1;
            class129.field2129 = arg2;
        } else if (var7 <= 0.0F && (double) var7 >= -0.7853981633974483D) {
            class129.field2129 = class210.field3590 - arg1;
            class310.field5296 = arg2;
        } else if (var7 >= 0.0F && (double) var7 <= 0.7853981633974483D) {
            class310.field5296 = class92.field1576 - arg2;
            class129.field2129 = class210.field3590 - arg1;
        } else if ((double) var7 >= 0.7853981633974483D && (double) var7 <= 1.5707963267948966D) {
            class129.field2129 = class210.field3590 - arg2;
            class310.field5296 = class92.field1576 - arg1;
        } else if ((double) var7 >= 1.5707963267948966D && (double) var7 <= 2.356194490192345D) {
            class310.field5296 = arg1;
            class129.field2129 = class210.field3590 - arg2;
        } else if ((double) var7 >= 2.356194490192345D && (double) var7 <= 3.141592653589793D) {
            class129.field2129 = arg1;
            class310.field5296 = class92.field1576 - arg2;
        }
        class310.field5296 &= class77.field1260;
        class129.field2129 &= class250.field4205;
    }

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "(B)V", line = 255)
    public static final void method1495(byte arg0) {
        class97 var1 = class60.field917;
        synchronized (class60.field917) {
            class32.field515++;
            class197.field3354 = class34.field541;
            if (class82.field1333 >= 0) {
                while (class82.field1333 != class100.field1699) {
                    int var3 = class309.field5268[class100.field1699];
                    class100.field1699 = class100.field1699 + 1 & 0x7F;
                    if (var3 < 0) {
                        class128.field2114[~var3] = false;
                    } else {
                        class128.field2114[var3] = true;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    class128.field2114[var2] = false;
                }
                class82.field1333 = class100.field1699;
            }
            class34.field541 = class115.field1957;
        }
        field3537++;
        if (arg0 >= -101) {
            field3536 = (BigInteger) null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lpb;BI)V", line = 297)
    public final void method20(class70 arg0, byte arg1, int arg2) {
        if (arg1 <= -115) {
            field3534++;
            if (arg2 == 0) {
                this.field4434 = arg0.method481(0) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIIIIIZ)V", line = 318)
    public static final void method1496(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        if (arg7) {
            return;
        }
        if (class281.field4827) {
            int var8 = arg4 - 334;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 100) {
                var8 = 100;
            }
            int var9 = (class129.field2125 - class187.field3028) * var8 / 100 + class187.field3028;
            arg3 = arg3 * var9 >> 8;
        }
        field3532++;
        int var10 = 0;
        int var11 = 2048 - arg0 & 0x7FF;
        int var12 = 2048 - arg5 & 0x7FF;
        int var13 = 0;
        int var14 = arg3;
        if (var12 != 0) {
            int var15 = class283.field4877[var12];
            var13 = -arg3 * var15 >> 16;
            int var16 = class283.field4870[var12];
            var14 = arg3 * var16 >> 16;
        }
        if (var11 != 0) {
            int var17 = class283.field4877[var11];
            var10 = var14 * var17 >> 16;
            int var18 = class283.field4870[var11];
            var14 = var14 * var18 >> 16;
        }
        class221.field3723 = arg6 - var10;
        class260.field4409 = arg5;
        class153.field2599 = arg2 - var13;
        class305.field5216 = arg0;
        class256.field4373 = arg1 - var14;
    }
}
