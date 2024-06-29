import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class130 {

    @OriginalMember(owner = "client!se", name = "m", descriptor = "[I")
    private int[] field2860 = new int[256];

    @OriginalMember(owner = "client!se", name = "l", descriptor = "[I")
    private int[] field2859 = new int[256];

    @OriginalMember(owner = "client!se", name = "k", descriptor = "I")
    public static int field2858 = 0;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "Lje;")
    public static class67 field2855 = class85.method592(255, "Mem:");

    @OriginalMember(owner = "client!se", name = "q", descriptor = "Lje;")
    public static class67 field2864 = class85.method592(255, "Nehmen");

    @OriginalMember(owner = "client!se", name = "j", descriptor = "Lje;")
    public static class67 field2857 = class85.method592(255, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!se", name = "s", descriptor = "Lje;")
    public static class67 field2866 = class85.method592(255, "Passwort: ");

    @OriginalMember(owner = "client!se", name = "v", descriptor = "Lje;")
    private static class67 field2869 = class85.method592(255, "Loading wordpack )2 ");

    @OriginalMember(owner = "client!se", name = "n", descriptor = "[I")
    public static int[] field2861 = new int[] { 0, 1, 2, 3 };

    @OriginalMember(owner = "client!se", name = "g", descriptor = "Lje;")
    public static class67 field2854 = field2869;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    private int field2850;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "I")
    private int field2856;

    @OriginalMember(owner = "client!se", name = "o", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!se", name = "p", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!se", name = "r", descriptor = "I")
    private int field2865;

    @OriginalMember(owner = "client!se", name = "t", descriptor = "I")
    private int field2867;

    @OriginalMember(owner = "client!se", name = "u", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)V")
    private final void method986(boolean arg0) {
        field2848++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        int var10 = 0;
        if (!arg0) {
            this.field2850 = 44;
        }
        while (var10 < 4) {
            int var61 = var9 ^ var8 << 11;
            int var62 = var7 + var8;
            int var63 = var62 ^ var7 >>> 2;
            int var64 = var5 + var63;
            int var65 = var6 + var61;
            int var66 = var7 + var65;
            int var67 = var66 ^ var65 << 8;
            int var68 = var4 + var67;
            int var69 = var64 + var65;
            var6 = var69 ^ var64 >>> 16;
            int var70 = var3 + var6;
            int var71 = var64 + var68;
            var5 = var71 ^ var68 << 10;
            int var72 = var2 + var5;
            int var73 = var68 + var70;
            var4 = var73 ^ var70 >>> 4;
            int var74 = var70 + var72;
            var3 = var74 ^ var72 << 8;
            var8 = var3 + var63;
            int var75 = var4 + var61;
            int var76 = var72 + var75;
            var2 = var76 ^ var75 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var75;
            var10++;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field2860[var11] + var9;
            int var38 = this.field2860[var11 + 1] + var8;
            int var39 = this.field2860[var11 + 4] + var5;
            int var40 = this.field2860[var11 + 6] + var3;
            int var41 = this.field2860[var11 + 3] + var6;
            int var42 = this.field2860[var11 + 7] + var2;
            int var43 = this.field2860[var11 + 5] + var4;
            int var44 = var37 ^ var38 << 11;
            int var45 = this.field2860[var11 + 2] + var7;
            int var46 = var41 + var44;
            int var47 = var38 + var45;
            int var48 = var47 ^ var45 >>> 2;
            int var49 = var39 + var48;
            int var50 = var45 + var46;
            int var51 = var50 ^ var46 << 8;
            int var52 = var46 + var49;
            var6 = var52 ^ var49 >>> 16;
            int var53 = var43 + var51;
            int var54 = var49 + var53;
            int var55 = var6 + var40;
            var5 = var54 ^ var53 << 10;
            int var56 = var53 + var55;
            var4 = var56 ^ var55 >>> 4;
            int var57 = var5 + var42;
            int var58 = var55 + var57;
            var3 = var58 ^ var57 << 8;
            int var59 = var4 + var44;
            var8 = var3 + var48;
            int var60 = var57 + var59;
            var2 = var60 ^ var59 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var59;
            this.field2859[var11] = var9;
            this.field2859[var11 + 1] = var8;
            this.field2859[var11 + 2] = var7;
            this.field2859[var11 + 3] = var6;
            this.field2859[var11 + 4] = var5;
            this.field2859[var11 + 5] = var4;
            this.field2859[var11 + 6] = var3;
            this.field2859[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field2859[var12 + 5] + var4;
            int var14 = this.field2859[var12 + 1] + var8;
            int var15 = this.field2859[var12] + var9;
            int var16 = this.field2859[var12 + 4] + var5;
            int var17 = this.field2859[var12 + 3] + var6;
            int var18 = this.field2859[var12 + 2] + var7;
            int var19 = this.field2859[var12 + 7] + var2;
            int var20 = var15 ^ var14 << 11;
            int var21 = var17 + var20;
            int var22 = this.field2859[var12 + 6] + var3;
            int var23 = var14 + var18;
            int var24 = var23 ^ var18 >>> 2;
            int var25 = var18 + var21;
            int var26 = var16 + var24;
            int var27 = var25 ^ var21 << 8;
            int var28 = var13 + var27;
            int var29 = var21 + var26;
            var6 = var29 ^ var26 >>> 16;
            int var30 = var26 + var28;
            int var31 = var6 + var22;
            var5 = var30 ^ var28 << 10;
            int var32 = var5 + var19;
            int var33 = var28 + var31;
            var4 = var33 ^ var31 >>> 4;
            int var34 = var4 + var20;
            int var35 = var31 + var32;
            var3 = var35 ^ var32 << 8;
            int var36 = var32 + var34;
            var8 = var3 + var24;
            var2 = var36 ^ var34 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var34;
            this.field2859[var12] = var9;
            this.field2859[var12 + 1] = var8;
            this.field2859[var12 + 2] = var7;
            this.field2859[var12 + 3] = var6;
            this.field2859[var12 + 4] = var5;
            this.field2859[var12 + 5] = var4;
            this.field2859[var12 + 6] = var3;
            this.field2859[var12 + 7] = var2;
        }
        this.method988(-105);
        this.field2867 = 256;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
    public static final void method987(byte arg0) {
        field2853++;
        class118.field2657.method767(1);
        class97.field2178.method767(1);
        if (arg0 != 58) {
            method987((byte) -124);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
    private final void method988(int arg0) {
        this.field2856 += ++this.field2865;
        field2852++;
        if (arg0 >= -19) {
            this.method986(false);
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field2859[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field2850 ^= this.field2850 << 13;
                } else {
                    this.field2850 ^= this.field2850 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field2850 ^= this.field2850 << 2;
            } else {
                this.field2850 ^= this.field2850 >>> 16;
            }
            this.field2850 += this.field2859[var2 + 128 & 0xFF];
            int var4;
            this.field2859[var2] = var4 = this.field2856 + this.field2859[class34.method213(var3, 1020) >> 2] + this.field2850;
            this.field2860[var2] = this.field2856 = var3 + this.field2859[class34.method213(var4 >> 8 >> 2, 255)];
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(I)I")
    public final int method989(int arg0) {
        field2862++;
        if (arg0 != 27398) {
            this.method986(false);
        }
        if (this.field2867-- == 0) {
            this.method988(-99);
            this.field2867 = 255;
        }
        return this.field2860[this.field2867];
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I[BII)Z")
    public static final boolean method990(int arg0, byte[] arg1, int arg2, int arg3) {
        field2851++;
        class91 var4 = new class91(arg1);
        int var5 = -1;
        boolean var6 = true;
        if (arg2 != -29949) {
            field2864 = null;
        }
        label72: while (true) {
            int var7 = var4.method662((byte) 74);
            if (var7 == 0) {
                return var6;
            }
            var5 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                int var13;
                class47 var16;
                do {
                    int var14;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var9) {
                                        int var17 = var4.method662((byte) 119);
                                        if (var17 == 0) {
                                            continue label72;
                                        }
                                        var4.method649(false);
                                    }
                                    int var10 = var4.method662((byte) 37);
                                    if (var10 == 0) {
                                        continue label72;
                                    }
                                    var8 += var10 - 1;
                                    int var11 = var8 >> 6 & 0x3F;
                                    int var12 = var8 & 0x3F;
                                    var13 = var4.method649(false) >> 2;
                                    var14 = arg3 + var12;
                                    var15 = arg0 + var11;
                                } while (var15 <= 0);
                            } while (var14 <= 0);
                        } while (var15 >= 103);
                    } while (var14 >= 103);
                    var16 = method993(var5, (byte) 120);
                } while (var13 == 22 && class41.field773 && var16.field932 == 0 && var16.field894 != 1 && !var16.field892);
                if (!var16.method311(-8399)) {
                    class27.field487++;
                    var6 = false;
                }
                var9 = true;
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BLm;III)V")
    public static final void method991(byte arg0, class83 arg1, int arg2, int arg3, int arg4) {
        field2868++;
        if (class37.field667 == arg1 || class69.field1419 >= 400) {
            return;
        }
        int var5 = -24 % ((-arg0 - 39) / 43);
        class67 var6;
        if (arg1.field1824 == 0) {
            var6 = class49.method314(new class67[] { arg1.field1854, class76.method545(30439, arg1.field1822, class37.field667.field1822), class122.field2726, class101.field2284, class60.method420(arg1.field1822, 28498), class18.field343 }, 0);
        } else {
            var6 = class49.method314(new class67[] { arg1.field1854, class122.field2726, class67.field1343, class60.method420(arg1.field1824, 28498), class18.field343 }, 0);
        }
        if (class134.field3027 == 1) {
            class56.method396(arg2, arg3, class49.method314(new class67[] { class3.field41, class118.field2668, var6 }, 0), arg4, 8, (byte) -95, class86.field1901);
            class67.field1345++;
        } else if (!class38.field691) {
            for (int var7 = 7; var7 >= 0; var7--) {
                if (class144.field3319[var7] != null) {
                    class29.field518++;
                    boolean var8 = false;
                    short var9 = 0;
                    if (class144.field3319[var7].method479(63, class137.field3085)) {
                        if (class37.field667.field1822 < arg1.field1822) {
                            var9 = 2000;
                        }
                        if (class37.field667.field1827 != 0 && arg1.field1827 != 0) {
                            if (class37.field667.field1827 == arg1.field1827) {
                                var9 = 2000;
                            } else {
                                var9 = 0;
                            }
                        }
                    } else if (class103.field2312[var7]) {
                        var9 = 2000;
                    }
                    int var10 = class148.field3395[var7] + var9;
                    class56.method396(arg2, arg3, class49.method314(new class67[] { class50.field964, var6 }, 0), arg4, var10, (byte) -69, class144.field3319[var7]);
                }
            }
        } else if ((class116.field2622 & 0x8) == 8) {
            class56.method396(arg2, arg3, class49.method314(new class67[] { class142.field3255, class118.field2668, var6 }, 0), arg4, 23, (byte) -98, class41.field777);
            class155.field3520++;
        }
        for (int var11 = 0; var11 < class69.field1419; var11++) {
            if (class101.field2267[var11] == 22) {
                class31.field543[var11] = class49.method314(new class67[] { class50.field964, var6 }, 0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(I)V")
    public static void method992(int arg0) {
        if (arg0 != -1) {
            method993(91, (byte) -15);
        }
        field2854 = null;
        field2869 = null;
        field2857 = null;
        field2855 = null;
        field2866 = null;
        field2861 = null;
        field2864 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IB)Lge;")
    public static final class47 method993(int arg0, byte arg1) {
        field2849++;
        class47 var2 = (class47) class79.field1746.method764((long) arg0, 24182);
        if (var2 != null) {
            return var2;
        } else if (arg1 < 99) {
            return null;
        } else {
            byte[] var3 = class115.field2596.method267((byte) -124, arg0, 6);
            class47 var4 = new class47();
            var4.field868 = arg0;
            if (var3 != null) {
                var4.method312(new class91(var3), (byte) -83);
            }
            var4.method307(-95);
            if (var4.field920) {
                var4.field894 = 0;
                var4.field918 = false;
            }
            class79.field1746.method765((long) arg0, var4, (byte) -36);
            return var4;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II)I")
    public static int method994(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "([I)V")
    public class130(int[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field2860[var2] = arg0[var2];
        }
        this.method986(true);
    }
}
