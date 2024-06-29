import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class35 extends class739 {

    @OriginalMember(owner = "client!wv", name = "F", descriptor = "I")
    private int field553 = 4096;

    @OriginalMember(owner = "client!wv", name = "L", descriptor = "I")
    private int field559 = 4096;

    @OriginalMember(owner = "client!wv", name = "J", descriptor = "I")
    private int field557 = 4096;

    @OriginalMember(owner = "client!wv", name = "E", descriptor = "[[F")
    public static float[][] field552 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!wv", name = "H", descriptor = "Loea;")
    public static class599 field555 = new class599();

    @OriginalMember(owner = "client!wv", name = "N", descriptor = "[S")
    private static short[] field561 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!wv", name = "Q", descriptor = "[S")
    private static short[] field564 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!wv", name = "R", descriptor = "[S")
    private static short[] field565 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!wv", name = "O", descriptor = "[[S")
    public static short[][] field562 = new short[][] { field564, field561, field565 };

    @OriginalMember(owner = "client!wv", name = "G", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!wv", name = "I", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!wv", name = "K", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!wv", name = "M", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!wv", name = "P", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lsl;II)V")
    public final void method214(class461 arg0, int arg1, int arg2) {
        ++field558;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field553 = arg0.method2566(-2);
                }
            } else {
                this.field559 = arg0.method2566(-2);
            }
        } else {
            this.field557 = arg0.method2566(arg2 + 1);
        }
        if (arg2 != -3) {
            field561 = null;
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(BI)[[I")
    public final int[][] method223(byte arg0, int arg1) {
        ++field554;
        int[][] var3 = super.field10312.method2191((byte) 52, arg1);
        if (arg0 < 26) {
            this.method214((class461) null, 63, -94);
        }
        if (super.field10312.field4922) {
            int[][] var4 = this.method4119(2, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class29.field523 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (~var12 == ~var13 && var13 == var14) {
                    var8[var11] = this.field557 * var12 >> 12;
                    var9[var11] = this.field559 * var13 >> 12;
                    var10[var11] = this.field553 * var14 >> 12;
                } else {
                    var8[var11] = this.field557;
                    var9[var11] = this.field559;
                    var10[var11] = this.field553;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wv", name = "e", descriptor = "(I)V")
    public static void method224(int arg0) {
        if (arg0 != 1) {
            method224(-113);
        }
        field564 = null;
        field561 = null;
        field562 = null;
        field552 = null;
        field555 = null;
        field565 = null;
    }

    @OriginalMember(owner = "client!wv", name = "<init>", descriptor = "()V")
    public class35() {
        super(1, false);
    }
}
