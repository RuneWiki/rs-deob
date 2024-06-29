import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class39 extends class27 {

    @OriginalMember(owner = "client!e", name = "Y", descriptor = "I")
    private int field653 = 4096;

    @OriginalMember(owner = "client!e", name = "O", descriptor = "I")
    private int field643 = 4096;

    @OriginalMember(owner = "client!e", name = "bb", descriptor = "I")
    private int field656 = 4096;

    @OriginalMember(owner = "client!e", name = "R", descriptor = "Lkb;")
    public static class93 field646 = class76.method390("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3", 0);

    @OriginalMember(owner = "client!e", name = "N", descriptor = "I")
    public static int field642 = 0;

    @OriginalMember(owner = "client!e", name = "U", descriptor = "Lkb;")
    public static class93 field649 = class76.method390(":duelstake:", 0);

    @OriginalMember(owner = "client!e", name = "X", descriptor = "Lkb;")
    private static class93 field652 = class76.method390(" from your ignore list first)3", 0);

    @OriginalMember(owner = "client!e", name = "M", descriptor = "Lkb;")
    public static class93 field641 = class76.method390(":", 0);

    @OriginalMember(owner = "client!e", name = "Z", descriptor = "Lkb;")
    public static class93 field654 = field652;

    @OriginalMember(owner = "client!e", name = "T", descriptor = "[[I")
    public static int[][] field648 = new int[][] { { 1, 1 }, { -1, 1 }, { 1, -1 }, { -1, -1 } };

    @OriginalMember(owner = "client!e", name = "P", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!e", name = "Q", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!e", name = "S", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!e", name = "V", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!e", name = "W", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!e", name = "ab", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!e", name = "cb", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BILrd;)V")
    public final void method15(byte arg0, int arg1, class158 arg2) {
        if (arg0 < 106) {
            method213(0, -88);
        }
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    this.field653 = arg2.method1071(28101);
                }
            } else {
                this.field643 = arg2.method1071(28101);
            }
        } else {
            this.field656 = arg2.method1071(28101);
        }
        ++field655;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II)[[I")
    public final int[][] method19(int arg0, int arg1) {
        int var3 = 47 / ((42 - arg0) / 54);
        ++field651;
        int[][] var4 = super.field436.method537(0, arg1);
        if (super.field436.field1771) {
            int[][] var5 = this.method152(arg1, 0, 109);
            int[] var6 = var5[0];
            int[] var7 = var5[2];
            int[] var8 = var5[1];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            for (int var12 = 0; class159.field3209 > var12; ++var12) {
                int var13 = var6[var12];
                int var14 = var7[var12];
                int var15 = var8[var12];
                if (var13 == var14 && var14 == var15) {
                    var9[var12] = this.field656 * var13 >> 12;
                    var10[var12] = this.field643 * var14 >> 12;
                    var11[var12] = this.field653 * var15 >> 12;
                } else {
                    var9[var12] = this.field656;
                    var10[var12] = this.field643;
                    var11[var12] = this.field653;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V")
    public class39() {
        super(1, false);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IJ)V")
    public static final void method211(int arg0, long arg1) {
        ++field644;
        if (arg1 != 0L) {
            if (arg0 <= 31) {
                field652 = null;
            }
            ++class138.field2674;
            class151.field2908.method47(86, 8);
            class151.field2908.method1064(arg1, -1);
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(IJ)V")
    public static final void method212(int arg0, long arg1) {
        ++field657;
        int var3 = 27 / ((arg0 - -67) / 32);
        if (arg1 > 0L) {
            if (arg1 % 10L != 0L) {
                class65.method339(1, arg1);
            } else {
                class65.method339(1, arg1 + -1L);
                class65.method339(1, 1L);
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(II)Ldg;")
    public static final class37 method213(int arg0, int arg1) {
        if (arg0 != -10639) {
            method213(57, 36);
        }
        ++field647;
        class37 var2 = (class37) class102.field1879.method680((long) arg1, (byte) 127);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class68.field1256.method461(12, (byte) 124, arg1);
            class37 var4 = new class37();
            if (var3 != null) {
                var4.method203(new class158(var3), false);
            }
            var4.method201((byte) 103);
            class102.field1879.method678(true, var4, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(Z)V")
    public static void method214(boolean arg0) {
        field649 = null;
        field652 = null;
        if (arg0) {
            method213(124, 65);
        }
        field646 = null;
        field641 = null;
        field654 = null;
        field648 = null;
    }
}
