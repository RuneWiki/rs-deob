import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class59 extends class27 {

    @OriginalMember(owner = "client!gb", name = "O", descriptor = "Lag;")
    public static class8 field942 = new class8(5000);

    @OriginalMember(owner = "client!gb", name = "Q", descriptor = "Lkb;")
    public static class93 field944 = class76.method390("Unerwartete Antwort vom Anmelde)2Server", 0);

    @OriginalMember(owner = "client!gb", name = "T", descriptor = "[I")
    public static int[] field947 = new int[50];

    @OriginalMember(owner = "client!gb", name = "U", descriptor = "[I")
    public static int[] field948 = new int[128];

    @OriginalMember(owner = "client!gb", name = "V", descriptor = "Lkb;")
    public static class93 field949 = class76.method390("Bitte laden Sie die Seite neu)3", 0);

    @OriginalMember(owner = "client!gb", name = "W", descriptor = "[[[I")
    public static int[][][] field950 = new int[4][13][13];

    @OriginalMember(owner = "client!gb", name = "M", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!gb", name = "N", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!gb", name = "R", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!gb", name = "S", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!gb", name = "P", descriptor = "Lef;")
    public static class45 field943;

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
    public class59() {
        super(3, false);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)[[I")
    public final int[][] method19(int arg0, int arg1) {
        ++field940;
        int[][] var3 = super.field436.method537(0, arg1);
        if (super.field436.field1771) {
            int[] var4 = this.method145(2, (byte) 120, arg1);
            int[][] var5 = this.method152(arg1, 0, 81);
            int[][] var6 = this.method152(arg1, 1, 119);
            int[] var7 = var3[2];
            int[] var8 = var5[1];
            int[] var9 = var5[0];
            int[] var10 = var3[1];
            int[] var11 = var3[0];
            int[] var12 = var6[2];
            int[] var13 = var5[2];
            int[] var14 = var6[1];
            int[] var15 = var6[0];
            for (int var16 = 0; class159.field3209 > var16; ++var16) {
                int var17 = var4[var16];
                if (~var17 == -4097) {
                    var11[var16] = var9[var16];
                    var10[var16] = var8[var16];
                    var7[var16] = var13[var16];
                } else if (~var17 != -1) {
                    int var18 = 4096 - var17;
                    var11[var16] = var9[var16] * var17 - -(var15[var16] * var18) >> 12;
                    var10[var16] = var8[var16] * var17 + var14[var16] * var18 >> 12;
                    var7[var16] = var12[var16] * var18 + var13[var16] * var17 >> 12;
                } else {
                    var11[var16] = var15[var16];
                    var10[var16] = var14[var16];
                    var7[var16] = var12[var16];
                }
            }
        }
        int var19 = 22 % ((42 - arg0) / 54);
        return var3;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BILrd;)V")
    public final void method15(byte arg0, int arg1, class158 arg2) {
        if (arg1 == 0) {
            super.field435 = arg2.method1054(128) == 1;
        }
        ++field941;
        if (arg0 < 106) {
            field948 = null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIB)V")
    public static final void method309(int arg0, int arg1, byte arg2) {
        class135 var3 = class34.method191(arg1, 115);
        int var4 = var3.field2617;
        ++field946;
        int var5 = var3.field2630;
        int var6 = var3.field2622;
        int var7 = class130.field2455[-var6 + var5];
        if (~arg0 > -1 || ~var7 > ~arg0) {
            arg0 = 0;
        }
        int var8 = var7 << var6;
        if (arg2 == 54) {
            class47.field758[var4] = class112.method607(class91.method479(~var8, class47.field758[var4]), class91.method479(var8, arg0 << var6));
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IZ)[I")
    public final int[] method55(int arg0, boolean arg1) {
        ++field945;
        if (arg1) {
            return null;
        } else {
            int[] var3 = super.field447.method1238(arg1, arg0);
            if (super.field447.field3737) {
                int[] var4 = this.method145(0, (byte) 127, arg0);
                int[] var5 = this.method145(1, (byte) 126, arg0);
                int[] var6 = this.method145(2, (byte) 126, arg0);
                for (int var7 = 0; var7 < class159.field3209; ++var7) {
                    int var8 = var6[var7];
                    if (var8 != 4096) {
                        if (var8 == 0) {
                            var3[var7] = var5[var7];
                        } else {
                            var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                        }
                    } else {
                        var3[var7] = var4[var7];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(Z)V")
    public static void method310(boolean arg0) {
        field944 = null;
        field950 = null;
        field942 = null;
        field947 = null;
        field943 = null;
        field949 = null;
        field948 = null;
        if (arg0) {
            method309(124, 5, (byte) 22);
        }
    }
}
