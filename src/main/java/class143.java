import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class143 extends class205 {

    @OriginalMember(owner = "client!ne", name = "X", descriptor = "Lvd;")
    private static class222 field2765 = class212.method1357("wishes to trade with you)3", 10731);

    @OriginalMember(owner = "client!ne", name = "Y", descriptor = "Lvd;")
    public static class222 field2766 = field2765;

    @OriginalMember(owner = "client!ne", name = "bb", descriptor = "[I")
    public static int[] field2769 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!ne", name = "fb", descriptor = "I")
    public static int field2773 = 0;

    @OriginalMember(owner = "client!ne", name = "db", descriptor = "I")
    public static int field2771 = 0;

    @OriginalMember(owner = "client!ne", name = "jb", descriptor = "Lvd;")
    public static class222 field2777 = class212.method1357("Ihr Charakter)2Profil wird in:", 10731);

    @OriginalMember(owner = "client!ne", name = "gb", descriptor = "Lvd;")
    public static class222 field2774 = class212.method1357("<col=00ff80>", 10731);

    @OriginalMember(owner = "client!ne", name = "hb", descriptor = "Lvd;")
    private static class222 field2775 = class212.method1357("Please wait 1 minute and try again)3", 10731);

    @OriginalMember(owner = "client!ne", name = "kb", descriptor = "Lvd;")
    public static class222 field2778 = field2775;

    @OriginalMember(owner = "client!ne", name = "lb", descriptor = "Lvd;")
    private static class222 field2779 = class212.method1357("Could not complete login)3", 10731);

    @OriginalMember(owner = "client!ne", name = "Z", descriptor = "Lvd;")
    public static class222 field2767 = field2779;

    @OriginalMember(owner = "client!ne", name = "cb", descriptor = "Lvd;")
    public static class222 field2770 = field2775;

    @OriginalMember(owner = "client!ne", name = "V", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!ne", name = "ab", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!ne", name = "eb", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!ne", name = "ib", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!ne", name = "W", descriptor = "[I")
    public static int[] field2764;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IB)[[I")
    public final int[][] method96(int arg0, byte arg1) {
        ++field2768;
        if (arg1 <= 98) {
            this.method4(-66, 76);
        }
        int[][] var3 = super.field3815.method1003(-8357, arg0);
        if (super.field3815.field3015) {
            int[] var4 = this.method1322(arg0, (byte) 119, 2);
            int[][] var5 = this.method1323(0, arg0, -5920);
            int[][] var6 = this.method1323(1, arg0, -5920);
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var3[0];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; ~var16 > ~class118.field2245; ++var16) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var9[var16] = var10[var16];
                    var7[var16] = var11[var16];
                    var8[var16] = var12[var16];
                } else if (var17 == 0) {
                    var9[var16] = var13[var16];
                    var7[var16] = var14[var16];
                    var8[var16] = var15[var16];
                } else {
                    int var18 = -var17 + 4096;
                    var9[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                    var7[var16] = var11[var16] * var17 - -(var14[var16] * var18) >> 12;
                    var8[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(B)V")
    public static void method912(byte arg0) {
        field2765 = null;
        field2777 = null;
        field2778 = null;
        int var1 = -100 % ((54 - arg0) / 46);
        field2766 = null;
        field2775 = null;
        field2774 = null;
        field2767 = null;
        field2779 = null;
        field2764 = null;
        field2769 = null;
        field2770 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lka;BI)V")
    public final void method2(class109 arg0, byte arg1, int arg2) {
        int var4 = -11 % ((-47 - arg1) / 34);
        if (~arg2 == -1) {
            super.field3812 = ~arg0.method662((byte) -111) == -2;
        }
        ++field2763;
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
    public class143() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)[I")
    public final int[] method4(int arg0, int arg1) {
        ++field2772;
        int[] var3 = super.field3810.method557(6978, arg1);
        if (arg0 != 0) {
            field2764 = null;
        }
        if (super.field3810.field1635) {
            int[] var4 = this.method1322(arg1, (byte) 125, 0);
            int[] var5 = this.method1322(arg1, (byte) 114, 1);
            int[] var6 = this.method1322(arg1, (byte) 100, 2);
            for (int var7 = 0; class118.field2245 > var7; ++var7) {
                int var8 = var6[var7];
                if (~var8 == -4097) {
                    var3[var7] = var4[var7];
                } else if (~var8 == -1) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = var4[var7] * var8 - -((-var8 + 4096) * var5[var7]) >> 12;
                }
            }
        }
        return var3;
    }
}
