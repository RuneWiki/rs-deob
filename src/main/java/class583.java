import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class583 extends class4 {

    @OriginalMember(owner = "client!ri", name = "H", descriptor = "I")
    private int field8428 = 0;

    @OriginalMember(owner = "client!ri", name = "L", descriptor = "I")
    private int field8432 = 2048;

    @OriginalMember(owner = "client!ri", name = "M", descriptor = "I")
    private int field8433 = 4096;

    @OriginalMember(owner = "client!ri", name = "I", descriptor = "I")
    private int field8429 = 0;

    @OriginalMember(owner = "client!ri", name = "P", descriptor = "I")
    private int field8436 = 2048;

    @OriginalMember(owner = "client!ri", name = "R", descriptor = "I")
    private int field8438 = 8192;

    @OriginalMember(owner = "client!ri", name = "O", descriptor = "I")
    private int field8435 = 12288;

    @OriginalMember(owner = "client!ri", name = "Q", descriptor = "Lwg;")
    public static class58 field8437 = new class58(50);

    @OriginalMember(owner = "client!ri", name = "E", descriptor = "I")
    public static int field8425;

    @OriginalMember(owner = "client!ri", name = "F", descriptor = "I")
    public static int field8426;

    @OriginalMember(owner = "client!ri", name = "J", descriptor = "I")
    public static int field8430;

    @OriginalMember(owner = "client!ri", name = "K", descriptor = "I")
    public static int field8431;

    @OriginalMember(owner = "client!ri", name = "N", descriptor = "I")
    public static int field8434;

    @OriginalMember(owner = "client!ri", name = "G", descriptor = "Lqa;")
    public static class167 field8427;

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "(I)V")
    public static void method3364(int arg0) {
        field8427 = null;
        if (arg0 != 4096) {
            method3364(-109);
        }
        field8437 = null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILge;I)V")
    public final void method13(int arg0, class551 arg1, int arg2) {
        ++field8431;
        if (arg0 > -89) {
            this.field8428 = -7;
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (arg2 == 6) {
                                    this.field8438 = arg1.method3090(-86);
                                }
                            } else {
                                this.field8433 = arg1.method3090(-119);
                            }
                        } else {
                            this.field8435 = arg1.method3090(-100);
                        }
                    } else {
                        this.field8436 = arg1.method3090(-74);
                    }
                } else {
                    this.field8428 = arg1.method3090(-109);
                }
            } else {
                this.field8429 = arg1.method3090(-86);
            }
        } else {
            this.field8432 = arg1.method3090(-102);
        }
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(IZI)Z")
    private final boolean method3365(int arg0, boolean arg1, int arg2) {
        ++field8426;
        int var4 = (arg2 - arg0) * this.field8435 >> 12;
        int var5 = class125.field1560[var4 * 255 >> 12 & 255];
        int var6 = (var5 << 12) / this.field8435;
        if (arg1) {
            this.method13(-57, (class551) null, 82);
        }
        int var7 = (var6 << 12) / this.field8438;
        int var8 = this.field8433 * var7 >> 12;
        return var8 > arg0 + arg2 && arg0 + arg2 > -var8;
    }

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "(I)V")
    public final void method18(int arg0) {
        if (arg0 == -9) {
            class78.method446((byte) -86);
            ++field8425;
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(III)Z")
    private final boolean method3366(int arg0, int arg1, int arg2) {
        ++field8434;
        if (arg1 != -44898964) {
            this.field8433 = 81;
        }
        int var4 = (arg0 + arg2) * this.field8435 >> 12;
        int var5 = class125.field1560[var4 * 255 >> 12 & 255];
        int var6 = (var5 << 12) / this.field8435;
        int var7 = (var6 << 12) / this.field8438;
        int var8 = this.field8433 * var7 >> 12;
        return ~var8 < ~(-arg0 + arg2) && ~(-arg0 + arg2) < ~(-var8);
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "()V")
    public class583() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BI)[I")
    public final int[] method15(byte arg0, int arg1) {
        ++field8430;
        int[] var3 = super.field31.method2252(arg1, arg0 ^ 1);
        if (super.field31.field5127) {
            int var4 = class130.field1606[arg1] - 2048;
            for (int var5 = 0; class132.field1627 > var5; ++var5) {
                int var6 = class66.field881[var5] + -2048;
                int var7 = this.field8432 + var6;
                int var8 = ~var7 > 2047 ? var7 - -4096 : var7;
                int var9 = ~var8 >= -2049 ? var8 : var8 + -4096;
                int var10 = this.field8429 + var4;
                int var11 = var10 >= -2048 ? var10 : var10 + 4096;
                int var12 = ~var11 < -2049 ? var11 + -4096 : var11;
                int var13 = this.field8428 + var6;
                int var14 = ~var13 > 2047 ? var13 + 4096 : var13;
                int var15 = ~var14 < -2049 ? var14 - 4096 : var14;
                int var16 = this.field8436 + var4;
                int var17 = ~var16 <= 2047 ? var16 : var16 - -4096;
                int var18 = var17 <= 2048 ? var17 : var17 + -4096;
                var3[var5] = !this.method3365(var9, false, var12) && !this.method3366(var15, -44898964, var18) ? 0 : 4096;
            }
        }
        if (arg0 != 10) {
            this.field8432 = -98;
        }
        return var3;
    }
}
