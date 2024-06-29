import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class232 {

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    public int field3471 = -1;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    private int field3478 = 0;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "Z")
    public boolean field3474 = true;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "Z")
    public boolean field3475 = true;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
    public int field3476 = 512;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "Lsb;")
    public static class266 field3480 = new class266(3, 4);

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
    public static int field3482 = 0;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public int field3470;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public int field3472;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public int field3477;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
    public int field3484;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
    public static void method1566(int arg0) {
        field3480 = null;
        if (arg0 != -1) {
            method1566(-18);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lqh;B)V")
    public final void method1567(class61 arg0, byte arg1) {
        if (arg1 <= 114) {
            this.field3474 = false;
        }
        while (true) {
            int var3 = arg0.method732(-559537960);
            if (var3 == 0) {
                field3481++;
                return;
            }
            this.method1570(true, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILog;IILbw;)V")
    public static final void method1568(int arg0, class602 arg1, int arg2, int arg3, class641 arg4) {
        field3473++;
        if ((arg3 & 0x10) != 0) {
            int var5 = arg4.method713(124);
            byte[] var6 = new byte[var5];
            class61 var7 = new class61(var6);
            arg4.method726(var5, arg2 ^ 0x5FCD4588, 0, var6);
            class577.field8397[arg0] = var7;
            arg1.method3450(var7, -27);
        }
        byte var8 = -1;
        if ((arg3 & 0x2) != 0) {
            int var9 = arg4.method752(arg2 - 27278);
            int var10 = arg4.method734((byte) -23);
            arg1.method3466(var10, class336.field5031, var9, 961237737);
            arg1.field8730 = class336.field5031 + 300;
            arg1.field8765 = arg4.method724(arg2 ^ 0x47);
        }
        if ((arg3 & 0x40) != 0) {
            arg1.field8652 = arg4.method729((byte) -95);
            if (arg1.field8779 == 0) {
                arg1.method3452(arg1.field8652, false);
                arg1.field8652 = -1;
            }
        }
        if ((arg3 & 0x200) != 0) {
            arg1.field8751 = arg4.method737(128);
            arg1.field8750 = arg4.method737(128);
            arg1.field8681 = arg4.method735(arg2 + 113);
            arg1.field8711 = arg4.method710((byte) 43);
            arg1.field8729 = arg4.method729((byte) -59) + class336.field5031;
            arg1.field8719 = arg4.method723((byte) -25) + class336.field5031;
            arg1.field8712 = arg4.method732(-559537960);
            if (arg1.field8635) {
                arg1.field8711 += arg1.field8660;
                arg1.field8751 += arg1.field8663;
                arg1.field8750 += arg1.field8660;
                arg1.field8681 += arg1.field8663;
                arg1.field8779 = 0;
            } else {
                arg1.field8681 += arg1.field8787[0];
                arg1.field8750 += arg1.field8785[0];
                arg1.field8711 += arg1.field8785[0];
                arg1.field8779 = 1;
                arg1.field8751 += arg1.field8787[0];
            }
            arg1.field8780 = 0;
        }
        if ((arg3 & 0x2000) != 0) {
            int var11 = arg4.method731(26585);
            arg1.field8746 = arg4.method713(124);
            arg1.field8701 = arg4.method724(103);
            arg1.field8708 = var11 & 0x7FFF;
            arg1.field8689 = (var11 & 0x8000) != 0;
            arg1.field8742 = arg1.field8708 + arg1.field8746 + class336.field5031;
        }
        if ((arg3 & 0x8) != 0) {
            int[] var12 = new int[4];
            for (int var13 = 0; var13 < 4; var13++) {
                var12[var13] = arg4.method753(true);
                if (var12[var13] == 65535) {
                    var12[var13] = -1;
                }
            }
            int var14 = arg4.method724(55);
            class4.method234(arg2, arg1, var12, var14);
        }
        if ((arg3 & 0x4) != 0) {
            class301.field4499[arg0] = arg4.method710((byte) 43);
        }
        if ((arg3 & 0x100) != 0) {
            arg1.field8756 = arg4.method747(14598);
            if (arg1.field8756.charAt(0) == '~') {
                arg1.field8756 = arg1.field8756.substring(1);
                class428.method2605(arg1.method3441(false, -29971), arg1.method3437(true, true), arg1.field8657, 2, 0, arg2 + 4096, arg1.field8756);
            } else if (class532.field7456 == arg1) {
                class428.method2605(arg1.method3441(false, -29971), arg1.method3437(true, true), arg1.field8657, 2, 0, 4096, arg1.field8756);
            }
            arg1.field8754 = 0;
            arg1.field8709 = 150;
            arg1.field8732 = 0;
        }
        if ((arg3 & 0x80) != 0) {
            int var15 = arg4.method753(true);
            if (var15 == 65535) {
                var15 = -1;
            }
            int var16 = arg4.method730(-107);
            int var17 = arg4.method732(-559537960);
            arg1.method3460(var16, false, var17, arg2 ^ 0x53, var15);
        }
        if ((arg3 & 0x10000) != arg2) {
            arg1.field8757 = arg4.method710((byte) 43);
            arg1.field8715 = arg4.method692(arg2 ^ 0xFFFFFF92);
            arg1.field8772 = arg4.method735(arg2 ^ 0xFFFFFF9B);
            arg1.field8697 = (byte) arg4.method732(-559537960);
            arg1.field8761 = class336.field5031 + arg4.method753(true);
            arg1.field8680 = class336.field5031 + arg4.method731(26585);
        }
        if ((arg3 & 0x8000) != 0) {
            int var18 = arg4.method732(arg2 ^ 0xDEA620D8);
            int[] var19 = new int[var18];
            int[] var20 = new int[var18];
            int[] var21 = new int[var18];
            for (int var22 = 0; var22 < var18; var22++) {
                int var23 = arg4.method753(true);
                if (var23 == 65535) {
                    var23 = -1;
                }
                var19[var22] = var23;
                var20[var22] = arg4.method734((byte) -23);
                var21[var22] = arg4.method753(true);
            }
            class304.method1994(var21, arg1, var20, var19, (byte) 38);
        }
        if ((arg3 & 0x400) != 0) {
            var8 = arg4.method737(arg2 + 128);
        }
        if ((arg3 & 0x800) != 0) {
            int var24 = arg4.method729((byte) -102);
            if (var24 == 65535) {
                var24 = -1;
            }
            int var25 = arg4.method688((byte) -109);
            int var26 = arg4.method724(arg2 ^ 0x2B);
            arg1.method3460(var25, true, var26, arg2 ^ 0xFFFFFFC8, var24);
        }
        if ((arg3 & 0x20000) != 0) {
            int var27 = class336.field5031;
            int var28 = arg4.method752(-27278);
            int var29 = arg4.method732(-559537960);
            arg1.method3466(var29, var27, var28, 961237737);
        }
        if ((arg3 & 0x1000) != 0) {
            arg1.field8645 = arg4.method732(-559537960) == 1;
        }
        if ((arg3 & 0x1) != 0) {
            int var30 = arg4.method723((byte) -25);
            if (var30 == 65535) {
                var30 = -1;
            }
            arg1.field8770 = var30;
        }
        if (!arg1.field8635) {
            return;
        }
        if (var8 == 127) {
            arg1.method3445(-30426, arg1.field8663, arg1.field8660);
            return;
        }
        byte var31;
        if (var8 == -1) {
            var31 = class301.field4499[arg0];
        } else {
            var31 = var8;
        }
        arg1.method3448(arg1.field8660, arg1.field8663, var31, -120);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZI)V")
    private final void method1569(boolean arg0, int arg1) {
        field3483++;
        if (arg0) {
            this.method1569(true, 114);
        }
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) ((arg1 & 0xFF49) >> 8) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var3 > var5) {
            var9 = var5;
        }
        if (var9 > var7) {
            var9 = var7;
        }
        double var11 = var3;
        if (var5 > var3) {
            var11 = var5;
        }
        if (var11 < var7) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
        }
        double var19 = var13 / 6.0D;
        this.field3470 = (int) (var17 * 256.0D);
        this.field3472 = (int) (var15 * 256.0D);
        if (this.field3470 < 0) {
            this.field3470 = 0;
        } else if (this.field3470 > 255) {
            this.field3470 = 255;
        }
        if (var17 > 0.5D) {
            this.field3477 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field3477 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field3472 < 0) {
            this.field3472 = 0;
        } else if (this.field3472 > 255) {
            this.field3472 = 255;
        }
        if (this.field3477 < 1) {
            this.field3477 = 1;
        }
        this.field3484 = (int) ((double) this.field3477 * var19);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZILqh;)V")
    private final void method1570(boolean arg0, int arg1, class61 arg2) {
        if (!arg0) {
            this.method1569(false, -76);
        }
        if (arg1 == 1) {
            this.field3478 = arg2.method740((byte) 80);
            this.method1569(false, this.field3478);
        } else if (arg1 == 2) {
            this.field3471 = arg2.method723((byte) -25);
            if (this.field3471 == 65535) {
                this.field3471 = -1;
            }
        } else if (arg1 == 3) {
            this.field3476 = arg2.method723((byte) -25) << 2;
        } else if (arg1 == 4) {
            this.field3475 = false;
        } else if (arg1 == 5) {
            this.field3474 = false;
        }
        field3479++;
    }
}
