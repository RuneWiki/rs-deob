import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class83 {

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "[I")
    private int[] field1357;

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "[I")
    private int[] field1359;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "Lna;")
    public static class26 field1349 = class69.method505(":duelfriend:", (byte) -126);

    @OriginalMember(owner = "client!ij", name = "n", descriptor = "Lna;")
    public static class26 field1362 = class69.method505(" de votre liste noire)3", (byte) -122);

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    private int field1350;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    private int field1352;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
    private int field1354;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "I")
    private int field1360;

    @OriginalMember(owner = "client!ij", name = "m", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Z)V", line = 6)
    private final void method644(boolean arg0) {
        if (!arg0) {
            this.method646(82);
        }
        field1351++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var11 = var9 ^ var8 << 11;
            int var12 = var6 + var11;
            int var13 = var7 + var8;
            int var14 = var13 ^ var7 >>> 2;
            int var15 = var7 + var12;
            int var16 = var15 ^ var12 << 8;
            int var17 = var4 + var16;
            int var18 = var5 + var14;
            int var19 = var12 + var18;
            var6 = var19 ^ var18 >>> 16;
            int var20 = var17 + var18;
            int var21 = var3 + var6;
            var5 = var20 ^ var17 << 10;
            int var22 = var2 + var5;
            int var23 = var17 + var21;
            var4 = var23 ^ var21 >>> 4;
            int var24 = var21 + var22;
            var3 = var24 ^ var22 << 8;
            var8 = var3 + var14;
            int var25 = var4 + var11;
            int var26 = var22 + var25;
            var2 = var26 ^ var25 >>> 9;
            var7 = var2 + var16;
            var9 = var8 + var25;
        }
        for (int var27 = 0; var27 < 256; var27 += 8) {
            int var28 = this.field1357[var27 + 3] + var6;
            int var29 = this.field1357[var27 + 4] + var5;
            int var30 = this.field1357[var27 + 6] + var3;
            int var31 = this.field1357[var27] + var9;
            int var32 = this.field1357[var27 + 2] + var7;
            int var33 = this.field1357[var27 + 5] + var4;
            int var34 = this.field1357[var27 + 7] + var2;
            int var35 = this.field1357[var27 + 1] + var8;
            int var36 = var31 ^ var35 << 11;
            int var37 = var32 + var35;
            int var38 = var37 ^ var32 >>> 2;
            int var39 = var28 + var36;
            int var40 = var32 + var39;
            int var41 = var40 ^ var39 << 8;
            int var42 = var29 + var38;
            int var43 = var39 + var42;
            var6 = var43 ^ var42 >>> 16;
            int var44 = var33 + var41;
            int var45 = var42 + var44;
            var5 = var45 ^ var44 << 10;
            int var46 = var5 + var34;
            int var47 = var6 + var30;
            int var48 = var44 + var47;
            var4 = var48 ^ var47 >>> 4;
            int var49 = var46 + var47;
            var3 = var49 ^ var46 << 8;
            int var50 = var4 + var36;
            int var51 = var46 + var50;
            var8 = var3 + var38;
            var2 = var51 ^ var50 >>> 9;
            var9 = var8 + var50;
            this.field1359[var27] = var9;
            this.field1359[var27 + 1] = var8;
            var7 = var2 + var41;
            this.field1359[var27 + 2] = var7;
            this.field1359[var27 + 3] = var6;
            this.field1359[var27 + 4] = var5;
            this.field1359[var27 + 5] = var4;
            this.field1359[var27 + 6] = var3;
            this.field1359[var27 + 7] = var2;
        }
        for (int var52 = 0; var52 < 256; var52 += 8) {
            int var53 = this.field1359[var52 + 6] + var3;
            int var54 = this.field1359[var52 + 5] + var4;
            int var55 = this.field1359[var52 + 4] + var5;
            int var56 = this.field1359[var52 + 1] + var8;
            int var57 = this.field1359[var52 + 2] + var7;
            int var58 = this.field1359[var52] + var9;
            int var59 = var58 ^ var56 << 11;
            int var60 = this.field1359[var52 + 3] + var6;
            int var61 = this.field1359[var52 + 7] + var2;
            int var62 = var59 + var60;
            int var63 = var56 + var57;
            int var64 = var63 ^ var57 >>> 2;
            int var65 = var57 + var62;
            int var66 = var55 + var64;
            int var67 = var65 ^ var62 << 8;
            int var68 = var54 + var67;
            int var69 = var62 + var66;
            var6 = var69 ^ var66 >>> 16;
            int var70 = var66 + var68;
            var5 = var70 ^ var68 << 10;
            int var71 = var6 + var53;
            int var72 = var68 + var71;
            var4 = var72 ^ var71 >>> 4;
            int var73 = var5 + var61;
            int var74 = var71 + var73;
            int var75 = var4 + var59;
            var3 = var74 ^ var73 << 8;
            var8 = var3 + var64;
            int var76 = var73 + var75;
            var2 = var76 ^ var75 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var75;
            this.field1359[var52] = var9;
            this.field1359[var52 + 1] = var8;
            this.field1359[var52 + 2] = var7;
            this.field1359[var52 + 3] = var6;
            this.field1359[var52 + 4] = var5;
            this.field1359[var52 + 5] = var4;
            this.field1359[var52 + 6] = var3;
            this.field1359[var52 + 7] = var2;
        }
        this.method646(-1879);
        this.field1354 = 256;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)I", line = 160)
    public final int method645(int arg0) {
        if (this.field1354-- == 0) {
            this.method646(-1879);
            this.field1354 = 255;
        }
        field1356++;
        if (arg0 != -9356) {
            this.method645(-128);
        }
        return this.field1357[this.field1354];
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)V", line = 184)
    private final void method646(int arg0) {
        field1358++;
        this.field1352 += ++this.field1350;
        int var2 = 0;
        if (arg0 != -1879) {
            this.field1354 = -98;
        }
        while (var2 < 256) {
            int var3 = this.field1359[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field1360 ^= this.field1360 << 13;
                } else {
                    this.field1360 ^= this.field1360 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field1360 ^= this.field1360 << 2;
            } else {
                this.field1360 ^= this.field1360 >>> 16;
            }
            this.field1360 += this.field1359[var2 + 128 & 0xFF];
            int var4;
            this.field1359[var2] = var4 = this.field1352 + this.field1360 + this.field1359[class4.method23(var3, 1020) >> 2];
            this.field1357[var2] = this.field1352 = var3 + this.field1359[class4.method23(261347, var4) >> 8 >> 2];
            var2++;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V", line = 239)
    public static final void method647(byte arg0) {
        int var1 = class150.field2342;
        field1353++;
        int var2 = class315.field5395;
        int var3 = class118.field1861;
        int var4 = class66.field1034;
        if (class142.field2182 == null || class317.field5431 == null) {
            if (class319.field5464.method1900(0, class279.field4652) && class319.field5464.method1900(0, class67.field1055)) {
                class142.field2182 = class8.method48(class319.field5464, 0, class279.field4652, (byte) 39);
                class317.field5431 = class8.method48(class319.field5464, 0, class67.field1055, (byte) 39);
                if (class255.field4184) {
                    if (class142.field2182 instanceof class253) {
                        class142.field2182 = new class119((class256) class142.field2182);
                    } else {
                        class142.field2182 = new class130((class256) class142.field2182);
                    }
                    if (class317.field5431 instanceof class253) {
                        class317.field5431 = new class119((class256) class317.field5431);
                    } else {
                        class317.field5431 = new class130((class256) class317.field5431);
                    }
                }
            } else if (class255.field4184) {
                class326.method2274(var1, var2, var4, 20, class120.field1882, 256 - class212.field3301);
            } else {
                class34.method275(var1, var2, var4, 20, class120.field1882, 256 - class212.field3301);
            }
        }
        if (class142.field2182 != null && class317.field5431 != null) {
            int var5 = var4 / class142.field2182.field2320;
            for (int var6 = 0; var6 < var5; var6++) {
                class142.field2182.method876(class142.field2182.field2320 * var6 + var1, var2);
            }
            class317.field5431.method876(var1, var2);
            class317.field5431.method875(var1 + var4 - class317.field5431.field2320, var2);
        }
        class89.field1474.method1198(class196.field3046, var1 + 3, var2 + 14, class112.field1768, -1);
        if (class255.field4184) {
            class326.method2274(var1, var2 + 20, var4, var3 - 20, class120.field1882, 256 - class212.field3301);
        } else {
            class34.method275(var1, var2 + 20, var4, var3 - 20, class120.field1882, 256 - class212.field3301);
        }
        int var7 = class259.field4235;
        int var8 = class136.field2090;
        if (arg0 < 85) {
            field1349 = (class26) null;
        }
        for (int var9 = 0; var9 < class126.field1955; var9++) {
            int var10 = (class126.field1955 - var9 - 1) * 15 + var2 + 35;
            if (var1 < var8 && var8 < var1 + var4 && var7 > (var10 - 13) && var7 < (var10 + 3)) {
                if (class255.field4184) {
                    class326.method2274(var1, var10 - 13, var4, 16, class305.field5264, 256 - class157.field2446);
                } else {
                    class34.method275(var1, var10 - 13, var4, 16, class305.field5264, 256 - class157.field2446);
                }
            }
        }
        if ((class313.field5351 == null || class121.field1888 == null || class301.field5192 == null) && class319.field5464.method1900(0, class191.field2992) && class319.field5464.method1900(0, class232.field3676) && class319.field5464.method1900(0, class141.field2156)) {
            class313.field5351 = class8.method48(class319.field5464, 0, class191.field2992, (byte) 39);
            class121.field1888 = class8.method48(class319.field5464, 0, class232.field3676, (byte) 39);
            class301.field5192 = class8.method48(class319.field5464, 0, class141.field2156, (byte) 39);
            if (class255.field4184) {
                if ((class313.field5351 instanceof class253)) {
                    class313.field5351 = new class119((class256) class313.field5351);
                } else {
                    class313.field5351 = new class130((class256) class313.field5351);
                }
                if ((class121.field1888 instanceof class253)) {
                    class121.field1888 = new class119((class256) class121.field1888);
                } else {
                    class121.field1888 = new class130((class256) class121.field1888);
                }
                if ((class301.field5192 instanceof class253)) {
                    class301.field5192 = new class119((class256) class301.field5192);
                } else {
                    class301.field5192 = new class130((class256) class301.field5192);
                }
            }
        }
        if (class313.field5351 != null && class121.field1888 != null && class301.field5192 != null) {
            int var11 = var4 / class313.field5351.field2320;
            for (int var12 = 0; var12 < var11; var12++) {
                class313.field5351.method876(class313.field5351.field2320 * var12 + var1, -class313.field5351.field2308 + var2 + var3);
            }
            int var13 = (var3 - 20) / class121.field1888.field2308;
            for (int var14 = 0; var14 < var13; var14++) {
                class121.field1888.method876(var1, class121.field1888.field2308 * var14 + var2 + 20);
                class121.field1888.method875(var1 - (class121.field1888.field2320 - var4), class121.field1888.field2308 * var14 + 20 + var2);
            }
            class301.field5192.method876(var1, var2 + var3 - class301.field5192.field2308);
            class301.field5192.method875(var1 + var4 - class301.field5192.field2320, var2 - -var3 + -class301.field5192.field2308);
        }
        for (int var15 = 0; var15 < class126.field1955; var15++) {
            int var16 = (class126.field1955 - var15 - 1) * 15 + var2 + 35;
            int var17 = class112.field1768;
            if (var1 < var8 && var1 + var4 > var8 && (var16 - 13) < var7 && var7 < (var16 + 3)) {
                var17 = class307.field5283;
            }
            class89.field1474.method1198(class82.method641(var15, true), var1 + 3, var16, var17, 0);
        }
        class299.method2109(class150.field2342, (byte) 122, class315.field5395, class118.field1861, class66.field1034);
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(I)V", line = 413)
    public static void method648(int arg0) {
        field1362 = null;
        field1349 = null;
        if (arg0 <= 116) {
            method647((byte) -73);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lkm;I)I", line = 424)
    public static final int method649(class324 arg0, int arg1) {
        field1361++;
        if (arg1 != -1) {
            return 103;
        }
        class187 var2 = arg0.field5565;
        if (var2.field2953 != null) {
            var2 = var2.method1273((byte) -108);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field2954;
        class236 var4 = arg0.method1656(false);
        if (arg0.field3901 == var4.field3751) {
            var3 = var2.field2920;
        } else if (arg0.field3901 == var4.field3780 || arg0.field3901 == var4.field3773 || arg0.field3901 == var4.field3760 || arg0.field3901 == var4.field3757) {
            var3 = var2.field2934;
        } else if (arg0.field3901 == var4.field3786 || arg0.field3901 == var4.field3756 || arg0.field3901 == var4.field3765 || arg0.field3901 == var4.field3794) {
            var3 = var2.field2951;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V", line = 462)
    private class83() {
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "([I)V", line = 464)
    public class83(int[] arg0) {
        this.field1357 = new int[256];
        this.field1359 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field1357[var2] = arg0[var2];
        }
        this.method644(true);
    }
}
