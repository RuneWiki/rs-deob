import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class31 extends class585 {

    @OriginalMember(owner = "client!o", name = "M", descriptor = "Loo;")
    public static class652 field430 = new class652(8);

    @OriginalMember(owner = "client!o", name = "N", descriptor = "[Ljava/lang/String;")
    public static String[] field431 = new String[100];

    @OriginalMember(owner = "client!o", name = "E", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!o", name = "F", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!o", name = "G", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!o", name = "H", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!o", name = "J", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!o", name = "K", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!o", name = "L", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V", line = 5)
    public class31() {
        super(1, false);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IZLha;Z)Lda;", line = 11)
    public static final class66 method256(int arg0, boolean arg1, class65 arg2, boolean arg3) {
        if (arg1) {
            return null;
        } else {
            ++field427;
            class717 var4 = class58.method395(arg0, true, arg2, arg3);
            return var4 == null ? null : var4.field9941;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BIILvn;I)V", line = 28)
    public static final void method257(byte arg0, int arg1, int arg2, class330 arg3, int arg4) {
        ++field428;
        class539 var5 = arg3.method2096(0);
        int var6 = 16383 & -arg3.field4647.field10428 + arg3.field4628;
        if (arg2 == -1) {
            if (var6 == 0 && arg3.field4593 <= 25) {
                if (!arg3.field4615 || !var5.method3240((byte) 126, arg3.field4659)) {
                    arg3.field4659 = var5.method3239(6077);
                    arg3.field4615 = ~arg3.field4659 != 0;
                }
            } else {
                if (~arg4 > -1 && ~var5.field7781 != 0) {
                    arg3.field4659 = var5.field7781;
                    arg3.field4615 = false;
                } else if (arg4 > 0 && ~var5.field7772 != 0) {
                    arg3.field4659 = var5.field7772;
                } else {
                    arg3.field4659 = var5.field7741;
                }
                arg3.field4615 = false;
            }
        } else if (~arg3.field4584 == 0 || ~var6 > -10241 && ~var6 < -2049) {
            if (var6 == 0 && ~arg3.field4593 >= -26) {
                arg3.field4615 = false;
                if (~arg2 == -3 && ~var5.field7770 != 0) {
                    arg3.field4659 = var5.field7770;
                } else if (~arg2 == -1 && ~var5.field7783 != 0) {
                    arg3.field4659 = var5.field7783;
                } else {
                    arg3.field4659 = var5.field7741;
                }
            } else {
                arg3.field4615 = false;
                if (~arg2 == -3 && var5.field7770 != -1) {
                    if (arg4 < 0 && ~var5.field7767 != 0) {
                        arg3.field4659 = var5.field7767;
                    } else if (~arg4 < -1 && ~var5.field7752 != 0) {
                        arg3.field4659 = var5.field7752;
                    } else {
                        arg3.field4659 = var5.field7770;
                    }
                } else if (~arg2 == -1 && ~var5.field7783 != 0) {
                    if (~arg4 > -1 && ~var5.field7784 != 0) {
                        arg3.field4659 = var5.field7784;
                    } else if (arg4 > 0 && var5.field7744 != -1) {
                        arg3.field4659 = var5.field7744;
                    } else {
                        arg3.field4659 = var5.field7783;
                    }
                } else if (~arg4 > -1 && ~var5.field7745 != 0) {
                    arg3.field4659 = var5.field7745;
                } else if (~arg4 < -1 && var5.field7789 != -1) {
                    arg3.field4659 = var5.field7789;
                } else {
                    arg3.field4659 = var5.field7741;
                }
            }
        } else {
            int var7 = 16383 & class193.field2981[arg1] + -arg3.field4647.field10428;
            if (~arg2 == -3 && ~var5.field7770 != 0) {
                if (var7 > 2048 && ~var7 >= -6145 && var5.field7765 != -1) {
                    arg3.field4659 = var5.field7765;
                } else if (~var7 <= -10241 && ~var7 > -14337 && var5.field7777 != -1) {
                    arg3.field4659 = var5.field7777;
                } else if (~var7 < -6145 && var7 < 10240 && var5.field7776 != -1) {
                    arg3.field4659 = var5.field7776;
                } else {
                    arg3.field4659 = var5.field7770;
                }
            } else if (~arg2 == -1 && var5.field7783 != -1) {
                if (~var7 < -2049 && ~var7 >= -6145 && ~var5.field7753 != 0) {
                    arg3.field4659 = var5.field7753;
                } else if (~var7 <= -10241 && ~var7 > -14337 && var5.field7769 != -1) {
                    arg3.field4659 = var5.field7769;
                } else if (~var7 < -6145 && var7 < 10240 && var5.field7740 != -1) {
                    arg3.field4659 = var5.field7740;
                } else {
                    arg3.field4659 = var5.field7783;
                }
            } else if (var7 > 2048 && ~var7 >= -6145 && ~var5.field7754 != 0) {
                arg3.field4659 = var5.field7754;
            } else if (var7 >= 10240 && ~var7 > -14337 && var5.field7743 != -1) {
                arg3.field4659 = var5.field7743;
            } else if (var7 > 6144 && ~var7 > -10241 && ~var5.field7786 != 0) {
                arg3.field4659 = var5.field7786;
            } else {
                arg3.field4659 = var5.field7741;
            }
            arg3.field4615 = false;
        }
        if (arg0 != 57) {
            method257((byte) -89, 66, -108, (class330) null, -38);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IB)[B", line = 195)
    public static final byte[] method258(int arg0, byte arg1) {
        ++field429;
        if (arg1 != 32) {
            method258(117, (byte) 32);
        }
        class455 var2 = (class455) class576.field8113.method4039(0, (long) arg0);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; ++var5) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; ~var6 > -256; ++var6) {
                int var7 = -var6 + 255;
                int var8 = class7.method51(-122, var4, var7);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[-var6 + 511] = var9;
            }
            var2 = new class455(var3);
            class576.field8113.method4037(var2, (long) arg0, false);
        }
        return var2.field6378;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lso;II)V", line = 243)
    public final void method54(class494 arg0, int arg1, int arg2) {
        if (arg1 != 1) {
            field431 = null;
        }
        ++field424;
        if (~arg2 == -1) {
            super.field8266 = ~arg0.method2964((byte) 123) == -2;
        }
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(I)V", line = 257)
    public static void method259(int arg0) {
        if (arg0 != 0) {
            field430 = null;
        }
        field430 = null;
        field431 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZI)[[I", line = 268)
    public final int[][] method58(boolean arg0, int arg1) {
        if (arg0) {
            this.method55(79, 11);
        }
        ++field426;
        int[][] var3 = super.field8265.method1576((byte) -59, arg1);
        if (super.field8265.field3546) {
            int[][] var4 = this.method3417(0, arg1, (byte) 113);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class293.field4278; ++var11) {
                var8[var11] = 4096 - var5[var11];
                var9[var11] = 4096 - var6[var11];
                var10[var11] = -var7[var11] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(II)[I", line = 314)
    public final int[] method55(int arg0, int arg1) {
        ++field423;
        int[] var3 = super.field8255.method1637(-29827, arg0);
        if (arg1 <= 123) {
            field431 = null;
        }
        if (super.field8255.field3677) {
            int[] var4 = this.method3415(-127, 0, arg0);
            for (int var5 = 0; ~class293.field4278 < ~var5; ++var5) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        return var3;
    }
}
