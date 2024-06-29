import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public class class45 extends class4 {

    @OriginalMember(owner = "client!jca", name = "E", descriptor = "I")
    private int field634 = 409;

    @OriginalMember(owner = "client!jca", name = "H", descriptor = "I")
    private int field636 = 4096;

    @OriginalMember(owner = "client!jca", name = "K", descriptor = "[I")
    private int[] field639 = new int[3];

    @OriginalMember(owner = "client!jca", name = "L", descriptor = "I")
    private int field640 = 4096;

    @OriginalMember(owner = "client!jca", name = "M", descriptor = "I")
    private int field641 = 4096;

    @OriginalMember(owner = "client!jca", name = "I", descriptor = "Luv;")
    public static class3 field637 = new class3(8, 0);

    @OriginalMember(owner = "client!jca", name = "Q", descriptor = "I")
    public static int field645 = -1;

    @OriginalMember(owner = "client!jca", name = "G", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!jca", name = "J", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!jca", name = "N", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!jca", name = "O", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!jca", name = "R", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!jca", name = "S", descriptor = "Lvk;")
    public static class414 field647;

    @OriginalMember(owner = "client!jca", name = "P", descriptor = "[Ljava/lang/String;")
    public static String[] field644;

    @OriginalMember(owner = "client!jca", name = "<init>", descriptor = "()V")
    public class45() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jca", name = "i", descriptor = "(I)V")
    public static void method242(int arg0) {
        if (arg0 == 409) {
            field644 = null;
            field647 = null;
            field637 = null;
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(Ldc;B)V")
    public static final void method243(class23 arg0, byte arg1) {
        ++field642;
        int var2 = -class7.field61 + arg0.field397;
        if (arg1 == -85) {
            int var3 = arg0.field330 * 512 + arg0.method104((byte) -92) * 256;
            int var4 = arg0.field353 * 512 - -(arg0.method104((byte) -92) * 256);
            arg0.field6368 += (-arg0.field6368 + var4) / var2;
            arg0.field420 = 0;
            arg0.field6362 += (-arg0.field6362 + var3) / var2;
            if (arg0.field336 == 0) {
                arg0.method130(-106, 8192);
            }
            if (arg0.field336 == 1) {
                arg0.method130(-95, 12288);
            }
            if (arg0.field336 == 2) {
                arg0.method130(arg1 + -28, 0);
            }
            if (~arg0.field336 == -4) {
                arg0.method130(arg1 + -12, 4096);
            }
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(Z)V")
    public static final void method244(boolean arg0) {
        ++field635;
        class507.field7063 = new class245(class165.field2094.method2157(class245.field3103, 4074), "", class48.field659, 1007, -1, 0L, 0, 0, arg0, false);
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(IB)[[I")
    public final int[][] method17(int arg0, byte arg1) {
        ++field643;
        if (arg1 >= -83) {
            this.field634 = 76;
        }
        int[][] var3 = super.field38.method3021((byte) 89, arg0);
        if (super.field38.field7618) {
            int[][] var4 = this.method22(arg0, (byte) -114, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class132.field1627 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field639[0] + var12;
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (~this.field634 > ~var13) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = var14 - this.field639[1];
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (~this.field634 > ~var15) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field639[2] + var16;
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (var17 > this.field634) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field641 * var12 >> 12;
                            var9[var11] = this.field640 * var14 >> 12;
                            var10[var11] = this.field636 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(IBLkr;)Lpe;")
    public static final class157 method245(int arg0, byte arg1, class329 arg2) {
        ++field638;
        byte[] var3 = arg2.method2076(1, arg0);
        if (var3 == null) {
            return null;
        } else {
            return arg1 != 119 ? null : new class157(var3);
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(ILge;I)V")
    public final void method13(int arg0, class551 arg1, int arg2) {
        if (arg0 > -89) {
            this.field640 = 30;
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (~arg2 == -5) {
                            int var5 = arg1.method3043((byte) 49);
                            this.field639[2] = class143.method783(255, var5) >> 12;
                            this.field639[0] = class143.method783(267386880, var5 << 4);
                            this.field639[1] = class143.method783(var5 >> 4, 4080);
                        }
                    } else {
                        this.field641 = arg1.method3090(-95);
                    }
                } else {
                    this.field640 = arg1.method3090(-94);
                }
            } else {
                this.field636 = arg1.method3090(-96);
            }
        } else {
            this.field634 = arg1.method3090(-98);
        }
        ++field646;
    }
}
