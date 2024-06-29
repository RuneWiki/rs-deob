import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class379 extends class440 {

    @OriginalMember(owner = "client!nn", name = "E", descriptor = "I")
    private int field5371 = 0;

    @OriginalMember(owner = "client!nn", name = "D", descriptor = "I")
    private int field5370 = 4096;

    @OriginalMember(owner = "client!nn", name = "G", descriptor = "Z")
    public static boolean field5373 = false;

    @OriginalMember(owner = "client!nn", name = "J", descriptor = "[[I")
    public static int[][] field5376 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!nn", name = "H", descriptor = "I")
    public static int field5374;

    @OriginalMember(owner = "client!nn", name = "I", descriptor = "I")
    public static int field5375;

    @OriginalMember(owner = "client!nn", name = "K", descriptor = "I")
    public static int field5377;

    @OriginalMember(owner = "client!nn", name = "F", descriptor = "Lsn;")
    public static class583 field5372;

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "()V", line = 3)
    public class379() {
        super(1, false);
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(ILmo;I)V", line = 13)
    public final void method234(int arg0, class695 arg1, int arg2) {
        if (arg0 != 5) {
            field5373 = false;
        }
        ++field5377;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    super.field6424 = arg1.method3826(false) == 1;
                }
            } else {
                this.field5370 = arg1.method3847((byte) 118);
            }
        } else {
            this.field5371 = arg1.method3847((byte) 118);
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(II)[[I", line = 62)
    public final int[][] method763(int arg0, int arg1) {
        ++field5374;
        if (arg0 != -5766) {
            this.method234(127, (class695) null, 70);
        }
        int[][] var3 = super.field6417.method3769(arg1, -26435);
        if (super.field6417.field9606) {
            int[][] var4 = this.method2606(arg1, 0, -1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class549.field7715 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (this.field5371 <= var12) {
                    if (~this.field5370 <= ~var12) {
                        var8[var11] = var12;
                    } else {
                        var8[var11] = this.field5370;
                    }
                } else {
                    var8[var11] = this.field5371;
                }
                if (this.field5371 <= var13) {
                    if (~var13 >= ~this.field5370) {
                        var9[var11] = var13;
                    } else {
                        var9[var11] = this.field5370;
                    }
                } else {
                    var9[var11] = this.field5371;
                }
                if (this.field5371 <= var14) {
                    if (~this.field5370 <= ~var14) {
                        var10[var11] = var14;
                    } else {
                        var10[var11] = this.field5370;
                    }
                } else {
                    var10[var11] = this.field5371;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(B)V", line = 142)
    public static void method2273(byte arg0) {
        field5372 = null;
        if (arg0 != 75) {
            field5376 = null;
        }
        field5376 = null;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(BI)[I", line = 153)
    public final int[] method229(byte arg0, int arg1) {
        int var3 = -8 % ((arg0 - -56) / 41);
        ++field5375;
        int[] var4 = super.field6412.method3250((byte) 5, arg1);
        if (super.field6412.field8047) {
            int[] var5 = this.method2611(113, arg1, 0);
            for (int var6 = 0; class549.field7715 > var6; ++var6) {
                int var7 = var5[var6];
                if (~var7 > ~this.field5371) {
                    var4[var6] = this.field5371;
                } else if (this.field5370 < var7) {
                    var4[var6] = this.field5370;
                } else {
                    var4[var6] = var7;
                }
            }
        }
        return var4;
    }
}
