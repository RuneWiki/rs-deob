import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class203 extends class27 {

    @OriginalMember(owner = "client!wd", name = "Q", descriptor = "Lkb;")
    private static class93 field3917 = class76.method390("Prepared sound engine", 0);

    @OriginalMember(owner = "client!wd", name = "V", descriptor = "I")
    public static int field3921 = 0;

    @OriginalMember(owner = "client!wd", name = "N", descriptor = "Lkb;")
    public static class93 field3914 = field3917;

    @OriginalMember(owner = "client!wd", name = "O", descriptor = "Lvd;")
    public static class194 field3915 = new class194();

    @OriginalMember(owner = "client!wd", name = "cb", descriptor = "I")
    public static int field3928 = 1;

    @OriginalMember(owner = "client!wd", name = "fb", descriptor = "Lkb;")
    public static class93 field3931 = class76.method390("Nehmen", 0);

    @OriginalMember(owner = "client!wd", name = "bb", descriptor = "[Z")
    public static boolean[] field3927 = new boolean[100];

    @OriginalMember(owner = "client!wd", name = "gb", descriptor = "Lkb;")
    private static class93 field3932 = class76.method390("Take", 0);

    @OriginalMember(owner = "client!wd", name = "eb", descriptor = "Lkb;")
    public static class93 field3930 = field3932;

    @OriginalMember(owner = "client!wd", name = "M", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!wd", name = "P", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!wd", name = "R", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!wd", name = "S", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!wd", name = "U", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!wd", name = "W", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!wd", name = "Y", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!wd", name = "Z", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!wd", name = "ab", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!wd", name = "hb", descriptor = "I")
    public static int field3933;

    @OriginalMember(owner = "client!wd", name = "db", descriptor = "Lme;")
    public static class114 field3929;

    @OriginalMember(owner = "client!wd", name = "X", descriptor = "Lef;")
    public static class45 field3923;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(B)V")
    public static void method1318(byte arg0) {
        field3917 = null;
        field3932 = null;
        field3915 = null;
        field3931 = null;
        if (arg0 <= 19) {
            method1318((byte) -101);
        }
        field3929 = null;
        field3914 = null;
        field3927 = null;
        field3930 = null;
        field3923 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BILrd;)V")
    public final void method15(byte arg0, int arg1, class158 arg2) {
        ++field3924;
        if (arg0 <= 106) {
            method1321((class93[]) null, -125);
        }
        if (~arg1 == -1) {
            super.field435 = arg2.method1054(128) == 1;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I[B)V")
    public static final void method1319(int arg0, byte[] arg1) {
        class158 var2 = new class158(arg1);
        ++field3920;
        var2.field3153 = arg1.length - 2;
        class8.field131 = var2.method1071(28101);
        class100.field1844 = new int[class8.field131];
        class64.field1010 = new int[class8.field131];
        class35.field577 = new byte[class8.field131][];
        class153.field2993 = new int[class8.field131];
        class82.field1513 = new int[class8.field131];
        var2.field3153 = arg1.length - 7 + -(class8.field131 * 8);
        class189.field3700 = var2.method1071(28101);
        class133.field2557 = var2.method1071(28101);
        int var3 = 1 + (var2.method1054(128) & 255);
        for (int var4 = 0; class8.field131 > var4; ++var4) {
            class153.field2993[var4] = var2.method1071(class29.method159(arg0, -1466));
        }
        for (int var5 = 0; class8.field131 > var5; ++var5) {
            class82.field1513[var5] = var2.method1071(28101);
        }
        for (int var6 = 0; var6 < class8.field131; ++var6) {
            class64.field1010[var6] = var2.method1071(28101);
        }
        if (arg0 != -26749) {
            field3933 = 12;
        }
        for (int var7 = 0; class8.field131 > var7; ++var7) {
            class100.field1844[var7] = var2.method1071(28101);
        }
        var2.field3153 = -(var3 * 3) - -3 + arg1.length + -7 + -(class8.field131 * 8);
        class103.field1895 = new int[var3];
        for (int var8 = 1; var8 < var3; ++var8) {
            class103.field1895[var8] = var2.method1060(255);
            if (~class103.field1895[var8] == -1) {
                class103.field1895[var8] = 1;
            }
        }
        var2.field3153 = 0;
        for (int var9 = 0; ~class8.field131 < ~var9; ++var9) {
            int var10 = class64.field1010[var9];
            int var11 = class100.field1844[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class35.field577[var9] = var13;
            int var14 = var2.method1054(128);
            if (var14 == 0) {
                for (int var17 = 0; var12 > var17; ++var17) {
                    var13[var17] = var2.method1066(true);
                }
            } else if (var14 == 1) {
                for (int var15 = 0; var10 > var15; ++var15) {
                    for (int var16 = 0; ~var16 > ~var11; ++var16) {
                        var13[var10 * var16 + var15] = var2.method1066(true);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(II)Lkb;")
    public static final class93 method1320(int arg0, int arg1) {
        if (arg0 <= 105) {
            method1321((class93[]) null, -107);
        }
        ++field3916;
        return ~class35.field575[arg1].method510(45) < -1 ? method1321(new class93[] { class171.field3391[arg1], class95.field1759, class35.field575[arg1] }, -89) : class171.field3391[arg1];
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IZ)[I")
    public final int[] method55(int arg0, boolean arg1) {
        ++field3919;
        if (arg1) {
            return null;
        } else {
            int[] var3 = super.field447.method1238(arg1, arg0);
            if (super.field447.field3737) {
                int[] var4 = this.method145(0, (byte) 125, arg0);
                for (int var5 = 0; ~var5 > ~class159.field3209; ++var5) {
                    var3[var5] = -var4[var5] + 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "([Lkb;I)Lkb;")
    public static final class93 method1321(class93[] arg0, int arg1) {
        int var2 = -96 % ((54 - arg1) / 36);
        ++field3922;
        if (~arg0.length > -3) {
            throw new IllegalArgumentException();
        } else {
            return class72.method379(0, arg0, arg0.length, -41);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)[[I")
    public final int[][] method19(int arg0, int arg1) {
        int var3 = -36 / ((arg0 - 42) / 54);
        ++field3913;
        int[][] var4 = super.field436.method537(0, arg1);
        if (super.field436.field1771) {
            int[][] var5 = this.method152(arg1, 0, 123);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var4[0];
            int[] var9 = var4[1];
            int[] var10 = var5[2];
            int[] var11 = var4[2];
            for (int var12 = 0; ~var12 > ~class159.field3209; ++var12) {
                var8[var12] = 4096 - var6[var12];
                var9[var12] = -var7[var12] + 4096;
                var11[var12] = -var10[var12] + 4096;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V")
    public class203() {
        super(1, false);
    }
}
