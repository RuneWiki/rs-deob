import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class179 extends class440 {

    @OriginalMember(owner = "client!tj", name = "G", descriptor = "Ldg;")
    public static class376 field2543 = new class376(52, 8);

    @OriginalMember(owner = "client!tj", name = "P", descriptor = "Z")
    public static boolean field2551 = false;

    @OriginalMember(owner = "client!tj", name = "C", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!tj", name = "E", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!tj", name = "I", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!tj", name = "K", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!tj", name = "L", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!tj", name = "M", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!tj", name = "O", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!tj", name = "N", descriptor = "Lr;")
    public static class166 field2549;

    @OriginalMember(owner = "client!tj", name = "J", descriptor = "[Lfo;")
    private class478[] field2545;

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "()V")
    public class179() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(II)Lrca;")
    public static final class418 method1213(int arg0, int arg1) {
        ++field2541;
        class418[] var2 = class500.method2890((byte) 111);
        int var3 = 0;
        int var4 = -55 % ((-16 - arg1) / 36);
        while (var3 < var2.length) {
            class418 var5 = var2[var3];
            if (~var5.field6100 == ~arg0) {
                return var5;
            }
            ++var3;
        }
        return null;
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(III)Z")
    public static final boolean method1214(int arg0, int arg1, int arg2) {
        ++field2544;
        if (arg2 <= 99) {
            return false;
        } else {
            return ~(32 & arg0) != -1;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)[[I")
    public final int[][] method763(int arg0, int arg1) {
        ++field2542;
        int[][] var3 = super.field6417.method3769(arg1, -26435);
        if (arg0 != -5766) {
            this.method763(-31, -109);
        }
        if (super.field6417.field9606) {
            int var4 = class549.field7715;
            int var5 = class221.field3098;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field6417.method3767(120);
            this.method1216(var6, false);
            for (int var8 = 0; ~class221.field3098 < ~var8; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; var14 < class549.field7715; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class689.method3797(4080, var15 << 4);
                    var12[var14] = class689.method3797(4080, var15 >> 4);
                    var11[var14] = class689.method3797(16711680, var15) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "(I)V")
    public static void method1215(int arg0) {
        field2543 = null;
        if (arg0 != 2) {
            field2543 = null;
        }
        field2549 = null;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(BI)[I")
    public final int[] method229(byte arg0, int arg1) {
        ++field2548;
        int[] var3 = super.field6412.method3250((byte) 5, arg1);
        int var4 = -37 / ((arg0 - -56) / 41);
        if (super.field6412.field8047) {
            this.method1216(super.field6412.method3249(-29306), false);
        }
        return var3;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILmo;I)V")
    public final void method234(int arg0, class695 arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 == -2) {
                super.field6424 = ~arg1.method3826(false) == -2;
            }
        } else {
            this.field2545 = new class478[arg1.method3826(false)];
            for (int var4 = 0; ~this.field2545.length < ~var4; ++var4) {
                int var5 = arg1.method3826(false);
                if (var5 != 0) {
                    if (var5 != 1) {
                        if (var5 != 2) {
                            if (~var5 == -4) {
                                this.field2545[var4] = class663.method3667(-26879, arg1);
                            }
                        } else {
                            this.field2545[var4] = class647.method3593(arg1, arg0 + -3);
                        }
                    } else {
                        this.field2545[var4] = class165.method1139(10091, arg1);
                    }
                } else {
                    this.field2545[var4] = class32.method356(arg1, 99);
                }
            }
        }
        ++field2546;
        if (arg0 != 5) {
            this.field2545 = null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "([[IZ)V")
    private final void method1216(int[][] arg0, boolean arg1) {
        ++field2547;
        int var3 = class549.field7715;
        int var4 = class221.field3098;
        class176.method1195(arg0, (byte) 76);
        class100.method810(0, class420.field6112, arg1, 0, class651.field9116);
        if (this.field2545 != null) {
            for (int var5 = 0; var5 < this.field2545.length; ++var5) {
                class478 var6 = this.field2545[var5];
                int var7 = var6.field6796;
                int var8 = var6.field6795;
                if (var7 < 0) {
                    if (var8 >= 0) {
                        var6.method1340(var4, 0, var3);
                    }
                } else if (var8 < 0) {
                    var6.method1343(var4, (byte) 56, var3);
                } else {
                    var6.method1339(var3, 0, var4);
                }
            }
        }
        if (arg1) {
            this.method1216((int[][]) null, true);
        }
    }
}
