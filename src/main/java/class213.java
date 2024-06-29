import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class213 {

    @OriginalMember(owner = "client!te", name = "q", descriptor = "[I")
    private int[] field3881;

    @OriginalMember(owner = "client!te", name = "n", descriptor = "[I")
    private int[] field3878;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "Lkh;")
    public static class117 field3870 = class224.method1450((byte) 15, "und haben es deaktiviert)3 Klicken Sie auf der");

    @OriginalMember(owner = "client!te", name = "i", descriptor = "Lkh;")
    public static class117 field3873 = class224.method1450((byte) 125, "(Y<)4col>");

    @OriginalMember(owner = "client!te", name = "j", descriptor = "I")
    public static int field3874 = -1;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "Lge;")
    public static class71 field3868 = new class71(128);

    @OriginalMember(owner = "client!te", name = "a", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "I")
    private int field3866;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "I")
    private int field3867;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "I")
    private int field3869;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "I")
    private int field3871;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!te", name = "k", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!te", name = "m", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!te", name = "p", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!te", name = "o", descriptor = "Lai;")
    public static class10 field3879;

    @OriginalMember(owner = "client!te", name = "l", descriptor = "[[S")
    public static short[][] field3876;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V")
    private final void method1397(byte arg0) {
        field3875++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var61 = var9 ^ var8 << 11;
            int var62 = var7 + var8;
            int var63 = var6 + var61;
            int var64 = var62 ^ var7 >>> 2;
            int var65 = var7 + var63;
            int var66 = var65 ^ var63 << 8;
            int var67 = var5 + var64;
            int var68 = var4 + var66;
            int var69 = var63 + var67;
            var6 = var69 ^ var67 >>> 16;
            int var70 = var67 + var68;
            int var71 = var3 + var6;
            var5 = var70 ^ var68 << 10;
            int var72 = var2 + var5;
            int var73 = var68 + var71;
            var4 = var73 ^ var71 >>> 4;
            int var74 = var71 + var72;
            int var75 = var4 + var61;
            var3 = var74 ^ var72 << 8;
            int var76 = var72 + var75;
            var2 = var76 ^ var75 >>> 9;
            var8 = var3 + var64;
            var7 = var2 + var66;
            var9 = var8 + var75;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field3878[var11 + 4] + var5;
            int var38 = this.field3878[var11 + 1] + var8;
            int var39 = this.field3878[var11 + 2] + var7;
            int var40 = this.field3878[var11 + 6] + var3;
            int var41 = this.field3878[var11 + 3] + var6;
            int var42 = this.field3878[var11 + 5] + var4;
            int var43 = this.field3878[var11] + var9;
            int var44 = var43 ^ var38 << 11;
            int var45 = this.field3878[var11 + 7] + var2;
            int var46 = var38 + var39;
            int var47 = var41 + var44;
            int var48 = var46 ^ var39 >>> 2;
            int var49 = var39 + var47;
            int var50 = var37 + var48;
            int var51 = var49 ^ var47 << 8;
            int var52 = var47 + var50;
            var6 = var52 ^ var50 >>> 16;
            int var53 = var42 + var51;
            int var54 = var6 + var40;
            int var55 = var50 + var53;
            var5 = var55 ^ var53 << 10;
            int var56 = var5 + var45;
            int var57 = var53 + var54;
            var4 = var57 ^ var54 >>> 4;
            int var58 = var54 + var56;
            int var59 = var4 + var44;
            var3 = var58 ^ var56 << 8;
            int var60 = var56 + var59;
            var2 = var60 ^ var59 >>> 9;
            var7 = var2 + var51;
            var8 = var3 + var48;
            var9 = var8 + var59;
            this.field3881[var11] = var9;
            this.field3881[var11 + 1] = var8;
            this.field3881[var11 + 2] = var7;
            this.field3881[var11 + 3] = var6;
            this.field3881[var11 + 4] = var5;
            this.field3881[var11 + 5] = var4;
            this.field3881[var11 + 6] = var3;
            this.field3881[var11 + 7] = var2;
        }
        if (arg0 >= -34) {
            return;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field3881[var12 + 7] + var2;
            int var14 = this.field3881[var12] + var9;
            int var15 = this.field3881[var12 + 1] + var8;
            int var16 = this.field3881[var12 + 5] + var4;
            int var17 = this.field3881[var12 + 4] + var5;
            int var18 = this.field3881[var12 + 6] + var3;
            int var19 = var14 ^ var15 << 11;
            int var20 = this.field3881[var12 + 3] + var6;
            int var21 = var19 + var20;
            int var22 = this.field3881[var12 + 2] + var7;
            int var23 = var15 + var22;
            int var24 = var23 ^ var22 >>> 2;
            int var25 = var17 + var24;
            int var26 = var21 + var22;
            int var27 = var26 ^ var21 << 8;
            int var28 = var21 + var25;
            var6 = var28 ^ var25 >>> 16;
            int var29 = var16 + var27;
            int var30 = var25 + var29;
            int var31 = var6 + var18;
            var5 = var30 ^ var29 << 10;
            int var32 = var29 + var31;
            int var33 = var5 + var13;
            var4 = var32 ^ var31 >>> 4;
            int var34 = var4 + var19;
            int var35 = var31 + var33;
            var3 = var35 ^ var33 << 8;
            int var36 = var33 + var34;
            var8 = var3 + var24;
            var2 = var36 ^ var34 >>> 9;
            var9 = var8 + var34;
            var7 = var2 + var27;
            this.field3881[var12] = var9;
            this.field3881[var12 + 1] = var8;
            this.field3881[var12 + 2] = var7;
            this.field3881[var12 + 3] = var6;
            this.field3881[var12 + 4] = var5;
            this.field3881[var12 + 5] = var4;
            this.field3881[var12 + 6] = var3;
            this.field3881[var12 + 7] = var2;
        }
        this.method1402(256);
        this.field3866 = 256;
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(B)V")
    public static final void method1398(byte arg0) {
        field3880++;
        class62.method457(class67.field1290, 0);
        class61.field1227++;
        if (class133.field2404 && class143.field2599) {
            int var1 = class137.field2479;
            int var2 = var1 - class32.field757;
            if (var2 < field3874) {
                var2 = field3874;
            }
            if (class67.field1290.field256 + var2 > field3874 + class93.field1700.field256) {
                var2 = field3874 + class93.field1700.field256 - class67.field1290.field256;
            }
            int var3 = class199.field3571;
            int var4 = var2 - class240.field4360;
            int var5 = 98 / ((36 - arg0) / 62);
            int var6 = class67.field1290.field259;
            int var7 = var3 - class207.field3710;
            if (class92.field1695 > var7) {
                var7 = class92.field1695;
            }
            int var8 = var2 + class93.field1700.field255 - field3874;
            if (class92.field1695 + class93.field1700.field207 < var7 - -class67.field1290.field207) {
                var7 = class92.field1695 + class93.field1700.field207 - class67.field1290.field207;
            }
            int var9 = var7 - class166.field3003;
            if (class61.field1227 > class67.field1290.field251 && (var4 > var6 || var4 < -var6 || var6 < var9 || -var6 > var9)) {
                class39.field893 = true;
            }
            int var10 = var7 + class93.field1700.field247 - class92.field1695;
            if (class67.field1290.field153 != null && class39.field893) {
                class51 var11 = new class51();
                var11.field1055 = var10;
                var11.field1046 = class67.field1290;
                var11.field1048 = class67.field1290.field153;
                var11.field1051 = var8;
                class102.method689(var11, -123);
            }
            if (class30.field719 == 0) {
                if (class39.field893) {
                    if (class67.field1290.field172 != null) {
                        class51 var12 = new class51();
                        var12.field1048 = class67.field1290.field172;
                        var12.field1051 = var8;
                        var12.field1057 = class51.field1045;
                        var12.field1055 = var10;
                        var12.field1046 = class67.field1290;
                        class102.method689(var12, -121);
                    }
                    if (class51.field1045 != null && class180.method1245((byte) -58, class67.field1290) != null) {
                        class105.field1911.method400(135, 8);
                        class194.field3460++;
                        class105.field1911.method1017(class67.field1290.field239, false);
                        class105.field1911.method1013(class67.field1290.field218, (byte) -61);
                        class105.field1911.method1013(class51.field1045.field218, (byte) -60);
                        class105.field1911.method1005(27318, class51.field1045.field239);
                    }
                } else if ((class196.field3493 == 1 || class171.method1201((byte) 3, class100.field1825 - 1)) && class100.field1825 > 2) {
                    class184.method1261(123);
                } else if (class100.field1825 > 0) {
                    class72.method511(class100.field1825 - 1, -127);
                }
                class67.field1290 = null;
            }
        } else if (class61.field1227 > 1) {
            class67.field1290 = null;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
    public static void method1399(int arg0) {
        field3868 = null;
        field3870 = null;
        if (arg0 > 68) {
            field3873 = null;
            field3876 = null;
            field3879 = null;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IB)Z")
    public static final boolean method1400(int arg0, byte arg1) {
        if (arg1 != -84) {
            method1398((byte) 101);
        }
        field3877++;
        return (arg0 >> 29 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(III)V")
    public static final void method1401(int arg0, int arg1, int arg2) {
        class170 var3 = class109.field2063[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < var3.field3065; var4++) {
            class57 var5 = var3.field3063[var4];
            if ((var5.field1171 >> 29 & 0x3L) == 2L && var5.field1186 == arg1 && var5.field1170 == arg2) {
                class228.method1480(var5);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V")
    private final void method1402(int arg0) {
        if (arg0 != 256) {
            this.method1402(92);
        }
        field3865++;
        this.field3871 += ++this.field3867;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field3881[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field3869 ^= this.field3869 << 13;
                } else {
                    this.field3869 ^= this.field3869 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field3869 ^= this.field3869 << 2;
            } else {
                this.field3869 ^= this.field3869 >>> 16;
            }
            this.field3869 += this.field3881[var2 + 128 & 0xFF];
            int var4;
            this.field3881[var2] = var4 = this.field3881[class209.method1370(var3, 1020) >> 2] + this.field3869 + this.field3871;
            this.field3878[var2] = this.field3871 = var3 + this.field3881[class209.method1370(var4 >> 8 >> 2, 255)];
        }
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(I)I")
    public final int method1403(int arg0) {
        if (this.field3866-- == 0) {
            this.method1402(arg0);
            this.field3866 = 255;
        }
        field3872++;
        if (arg0 != 256) {
            this.field3871 = -18;
        }
        return this.field3878[this.field3866];
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V")
    private class213() {
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "([I)V")
    public class213(int[] arg0) {
        this.field3881 = new int[256];
        this.field3878 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field3878[var2] = arg0[var2];
        }
        this.method1397((byte) -126);
    }
}
