import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class681 extends class362 {

    @OriginalMember(owner = "client!mj", name = "z", descriptor = "I")
    private int field9482 = 2048;

    @OriginalMember(owner = "client!mj", name = "y", descriptor = "I")
    private int field9481 = 0;

    @OriginalMember(owner = "client!mj", name = "F", descriptor = "I")
    private int field9487 = 12288;

    @OriginalMember(owner = "client!mj", name = "E", descriptor = "I")
    private int field9486 = 4096;

    @OriginalMember(owner = "client!mj", name = "L", descriptor = "I")
    private int field9492 = 8192;

    @OriginalMember(owner = "client!mj", name = "N", descriptor = "I")
    private int field9494 = 2048;

    @OriginalMember(owner = "client!mj", name = "J", descriptor = "I")
    private int field9491 = 0;

    @OriginalMember(owner = "client!mj", name = "I", descriptor = "[I")
    public static int[] field9490 = new int[3];

    @OriginalMember(owner = "client!mj", name = "A", descriptor = "I")
    public static int field9483;

    @OriginalMember(owner = "client!mj", name = "B", descriptor = "I")
    public static int field9484;

    @OriginalMember(owner = "client!mj", name = "G", descriptor = "I")
    public static int field9488;

    @OriginalMember(owner = "client!mj", name = "H", descriptor = "I")
    public static int field9489;

    @OriginalMember(owner = "client!mj", name = "M", descriptor = "I")
    public static int field9493;

    @OriginalMember(owner = "client!mj", name = "C", descriptor = "Lnf;")
    public static class604 field9485;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "(III)Z")
    private final boolean method3838(int arg0, int arg1, int arg2) {
        ++field9484;
        if (arg2 > -5) {
            return true;
        } else {
            int var4 = (arg0 + arg1) * this.field9487 >> 12;
            int var5 = class551.field7540[255 & var4 * 255 >> 12];
            int var6 = (var5 << 12) / this.field9487;
            int var7 = (var6 << 12) / this.field9492;
            int var8 = this.field9486 * var7 >> 12;
            return -arg0 + arg1 < var8 && -arg0 + arg1 > -var8;
        }
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "()V")
    public class681() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lfca;II)V")
    public final void method154(class93 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (~arg1 == -7) {
                                    this.field9492 = arg0.method763(arg2 + 80);
                                }
                            } else {
                                this.field9486 = arg0.method763(arg2 ^ -102);
                            }
                        } else {
                            this.field9487 = arg0.method763(101);
                        }
                    } else {
                        this.field9494 = arg0.method763(-77);
                    }
                } else {
                    this.field9481 = arg0.method763(81);
                }
            } else {
                this.field9491 = arg0.method763(arg2 ^ 39);
            }
        } else {
            this.field9482 = arg0.method763(arg2 ^ -108);
        }
        ++field9493;
        if (arg2 != -1) {
            this.method3841((byte) -22, -83, -122);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V")
    public final void method160(int arg0) {
        if (arg0 == -996226836) {
            ++field9483;
            class713.method3968(0);
        }
    }

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "(III)V")
    public static final void method3839(int arg0, int arg1, int arg2) {
        boolean var3 = class325.field4448[0][arg1][arg2] != null && class325.field4448[0][arg1][arg2].field7465 != null;
        for (int var4 = arg0; var4 >= 0; --var4) {
            if (class325.field4448[var4][arg1][arg2] == null) {
                class549 var5 = class325.field4448[var4][arg1][arg2] = new class549(var4);
                if (var3) {
                    ++var5.field7459;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(I)V")
    public static void method3840(int arg0) {
        if (arg0 <= -78) {
            field9490 = null;
            field9485 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BII)Z")
    private final boolean method3841(byte arg0, int arg1, int arg2) {
        ++field9488;
        int var4 = (arg2 - arg1) * this.field9487 >> 12;
        int var5 = class551.field7540[(var4 * 255 & 1047409) >> 12];
        if (arg0 <= 27) {
            this.field9491 = 3;
        }
        int var6 = (var5 << 12) / this.field9487;
        int var7 = (var6 << 12) / this.field9492;
        int var8 = this.field9486 * var7 >> 12;
        return var8 > arg1 + arg2 && arg1 - -arg2 > -var8;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)[I")
    public final int[] method156(int arg0, int arg1) {
        ++field9489;
        if (arg0 != -2026769311) {
            this.field9481 = 18;
        }
        int[] var3 = super.field4927.method808(-125, arg1);
        if (super.field4927.field1471) {
            int var4 = class135.field2287[arg1] - 2048;
            for (int var5 = 0; class769.field10597 > var5; ++var5) {
                int var6 = class172.field2750[var5] - 2048;
                int var7 = this.field9482 + var6;
                int var8 = var7 >= -2048 ? var7 : var7 + 4096;
                int var9 = ~var8 >= -2049 ? var8 : var8 + -4096;
                int var10 = var4 - -this.field9491;
                int var11 = ~var10 > 2047 ? var10 + 4096 : var10;
                int var12 = var11 <= 2048 ? var11 : var11 + -4096;
                int var13 = var6 - -this.field9481;
                int var14 = var13 < -2048 ? var13 + 4096 : var13;
                int var15 = var14 > 2048 ? var14 + -4096 : var14;
                int var16 = this.field9494 + var4;
                int var17 = ~var16 > 2047 ? var16 + 4096 : var16;
                int var18 = var17 > 2048 ? var17 - 4096 : var17;
                var3[var5] = !this.method3841((byte) 124, var9, var12) && !this.method3838(var15, var18, -121) ? 0 : 4096;
            }
        }
        return var3;
    }
}
