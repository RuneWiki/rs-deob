import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public class class453 extends class573 {

    @OriginalMember(owner = "client!lda", name = "I", descriptor = "I")
    private int field6460 = 4096;

    @OriginalMember(owner = "client!lda", name = "K", descriptor = "I")
    private int field6462 = 0;

    @OriginalMember(owner = "client!lda", name = "L", descriptor = "I")
    private int field6463 = 2048;

    @OriginalMember(owner = "client!lda", name = "S", descriptor = "I")
    private int field6470 = 12288;

    @OriginalMember(owner = "client!lda", name = "U", descriptor = "I")
    private int field6472 = 0;

    @OriginalMember(owner = "client!lda", name = "P", descriptor = "I")
    private int field6467 = 2048;

    @OriginalMember(owner = "client!lda", name = "W", descriptor = "I")
    private int field6474 = 8192;

    @OriginalMember(owner = "client!lda", name = "J", descriptor = "I")
    public static int field6461 = -1;

    @OriginalMember(owner = "client!lda", name = "M", descriptor = "I")
    public static int field6464;

    @OriginalMember(owner = "client!lda", name = "N", descriptor = "I")
    public static int field6465;

    @OriginalMember(owner = "client!lda", name = "O", descriptor = "I")
    public static int field6466;

    @OriginalMember(owner = "client!lda", name = "Q", descriptor = "I")
    public static int field6468;

    @OriginalMember(owner = "client!lda", name = "R", descriptor = "I")
    public static int field6469;

    @OriginalMember(owner = "client!lda", name = "T", descriptor = "I")
    public static int field6471;

    @OriginalMember(owner = "client!lda", name = "V", descriptor = "I")
    public static int field6473;

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(Lqh;II)V")
    public final void method443(class61 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (arg1 == 6) {
                                    this.field6474 = arg0.method723((byte) -25);
                                }
                            } else {
                                this.field6460 = arg0.method723((byte) -25);
                            }
                        } else {
                            this.field6470 = arg0.method723((byte) -25);
                        }
                    } else {
                        this.field6467 = arg0.method723((byte) -25);
                    }
                } else {
                    this.field6462 = arg0.method723((byte) -25);
                }
            } else {
                this.field6472 = arg0.method723((byte) -25);
            }
        } else {
            this.field6463 = arg0.method723((byte) -25);
        }
        if (arg2 != 3) {
            this.method2730(-60, -5, 43);
        }
        ++field6473;
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(I)V")
    public final void method617(int arg0) {
        ++field6471;
        class136.method1117((byte) 63);
        if (arg0 != 4095) {
            this.method619(103, -96);
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(II)[I")
    public final int[] method619(int arg0, int arg1) {
        if (arg1 != 1) {
            return null;
        } else {
            ++field6466;
            int[] var3 = super.field8321.method3164(arg0, arg1 ^ -110);
            if (super.field8321.field7825) {
                int var4 = class230.field3460[arg0] + -2048;
                for (int var5 = 0; ~var5 > ~class540.field7555; ++var5) {
                    int var6 = class51.field1194[var5] + -2048;
                    int var7 = this.field6463 + var6;
                    int var8 = var7 < -2048 ? var7 + 4096 : var7;
                    int var9 = var8 > 2048 ? var8 + -4096 : var8;
                    int var10 = this.field6472 + var4;
                    int var11 = var10 >= -2048 ? var10 : var10 + 4096;
                    int var12 = ~var11 < -2049 ? var11 + -4096 : var11;
                    int var13 = this.field6462 + var6;
                    int var14 = var13 < -2048 ? var13 + 4096 : var13;
                    int var15 = var14 <= 2048 ? var14 : var14 - 4096;
                    int var16 = this.field6467 + var4;
                    int var17 = var16 >= -2048 ? var16 : var16 - -4096;
                    int var18 = var17 > 2048 ? var17 + -4096 : var17;
                    var3[var5] = !this.method2730(var9, var12, class691.method3871(arg1, -2047)) && !this.method2729(var15, 97, var18) ? 0 : 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(IIB)V")
    public static final void method2728(int arg0, int arg1, byte arg2) {
        ++field6465;
        if (~class540.field7555 != ~arg1) {
            class51.field1194 = new int[arg1];
            for (int var3 = 0; arg1 > var3; ++var3) {
                class51.field1194[var3] = (var3 << 12) / arg1;
            }
            class613.field8922 = arg1 * 32;
            class591.field8492 = arg1 + -1;
            class540.field7555 = arg1;
        }
        if (arg2 != 109) {
            method2728(-7, 108, (byte) 0);
        }
        if (class419.field6037 != arg0) {
            if (~class540.field7555 != ~arg0) {
                class230.field3460 = new int[arg0];
                for (int var4 = 0; arg0 > var4; ++var4) {
                    class230.field3460[var4] = (var4 << 12) / arg0;
                }
            } else {
                class230.field3460 = class51.field1194;
            }
            class189.field3019 = arg0 + -1;
            class419.field6037 = arg0;
        }
    }

    @OriginalMember(owner = "client!lda", name = "c", descriptor = "(III)Z")
    private final boolean method2729(int arg0, int arg1, int arg2) {
        ++field6468;
        int var4 = (arg0 + arg2) * this.field6470 >> 12;
        int var5 = class335.field5011[(1048191 & var4 * 255) >> 12];
        int var6 = (var5 << 12) / this.field6470;
        int var7 = (var6 << 12) / this.field6474;
        if (arg1 < 14) {
            return true;
        } else {
            int var8 = this.field6460 * var7 >> 12;
            return -arg0 + arg2 < var8 && arg2 - arg0 > -var8;
        }
    }

    @OriginalMember(owner = "client!lda", name = "d", descriptor = "(III)Z")
    private final boolean method2730(int arg0, int arg1, int arg2) {
        ++field6469;
        int var4 = (-arg0 + arg1) * this.field6470 >> 12;
        int var5 = class335.field5011[255 & var4 * 255 >> 12];
        int var6 = (var5 << 12) / this.field6470;
        int var7 = (var6 << 12) / this.field6474;
        if (arg2 != -2048) {
            return true;
        } else {
            int var8 = this.field6460 * var7 >> 12;
            return var8 > arg0 + arg1 && ~(-var8) > ~(arg0 - -arg1);
        }
    }

    @OriginalMember(owner = "client!lda", name = "<init>", descriptor = "()V")
    public class453() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lda", name = "e", descriptor = "(III)Lpc;")
    public static final class624 method2731(int arg0, int arg1, int arg2) {
        class370 var3 = class257.field3792[arg0][arg1][arg2];
        return var3 == null ? null : var3.field5493;
    }
}
