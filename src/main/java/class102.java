import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class102 {

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "[I")
    private int[] field1842;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "[I")
    private int[] field1839;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "Lke;")
    public static class106 field1837 = new class106();

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "Lcd;")
    public static class64 field1840 = class44.method335((byte) 71, "headicons_pk");

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "Lcd;")
    public static class64 field1845 = class44.method335((byte) 71, "Loading world list data");

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    private int field1831;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    private int field1833;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
    private int field1834;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    private int field1836;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "Lqm;")
    public static class222 field1843;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)V", line = 14)
    public static final void method752(boolean arg0) {
        if (arg0) {
            field1843 = (class222) null;
        }
        class164 var1 = (class164) class227.field3865.method778(0);
        field1835++;
        while (var1 != null) {
            class59 var2 = var1.field2880;
            if (class20.field364 != var2.field998 || class29.field482 > var2.field995) {
                var1.method232(128);
            } else if (class29.field482 >= var2.field1005) {
                if (var2.field1000 > 0) {
                    class232 var3 = class2.field12[var2.field1000 - 1];
                    if (var3 != null && var3.field1859 >= 0 && var3.field1859 < 13312 && var3.field1865 >= 0 && var3.field1865 < 13312) {
                        var2.method453(var3.field1865, var3.field1859, -6924, class29.field482, class15.method169(var3.field1865, 13257, var2.field998, var3.field1859) - var2.field973);
                    }
                }
                if (var2.field1000 < 0) {
                    int var4 = -var2.field1000 - 1;
                    class41 var5;
                    if (class149.field2632 == var4) {
                        var5 = class139.field2472;
                    } else {
                        var5 = class284.field4888[var4];
                    }
                    if (var5 != null && var5.field1859 >= 0 && var5.field1859 < 13312 && var5.field1865 >= 0 && var5.field1865 < 13312) {
                        var2.method453(var5.field1865, var5.field1859, -6924, class29.field482, class15.method169(var5.field1865, 13257, var2.field998, var5.field1859) - var2.field973);
                    }
                }
                var2.method458(class249.field4327, 0);
                class11.method93(class20.field364, (int) var2.field984, (int) var2.field999, (int) var2.field980, 60, var2, var2.field993, -1L, false);
            }
            var1 = (class164) class227.field3865.method775(26517);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V", line = 68)
    private final void method753(int arg0) {
        field1841++;
        if (arg0 != -21028) {
            this.field1836 = 1;
        }
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
            int var12 = var7 + var8;
            int var13 = var12 ^ var7 >>> 2;
            int var14 = var6 + var11;
            int var15 = var5 + var13;
            int var16 = var7 + var14;
            int var17 = var16 ^ var14 << 8;
            int var18 = var4 + var17;
            int var19 = var14 + var15;
            var6 = var19 ^ var15 >>> 16;
            int var20 = var3 + var6;
            int var21 = var15 + var18;
            var5 = var21 ^ var18 << 10;
            int var22 = var18 + var20;
            var4 = var22 ^ var20 >>> 4;
            int var23 = var4 + var11;
            int var24 = var2 + var5;
            int var25 = var20 + var24;
            var3 = var25 ^ var24 << 8;
            var8 = var3 + var13;
            int var26 = var23 + var24;
            var2 = var26 ^ var23 >>> 9;
            var9 = var8 + var23;
            var7 = var2 + var17;
        }
        for (int var27 = 0; var27 < 256; var27 += 8) {
            int var28 = this.field1842[var27 + 1] + var8;
            int var29 = this.field1842[var27 + 4] + var5;
            int var30 = this.field1842[var27 + 3] + var6;
            int var31 = this.field1842[var27 + 5] + var4;
            int var32 = this.field1842[var27] + var9;
            int var33 = this.field1842[var27 + 2] + var7;
            int var34 = this.field1842[var27 + 6] + var3;
            int var35 = var32 ^ var28 << 11;
            int var36 = this.field1842[var27 + 7] + var2;
            int var37 = var30 + var35;
            int var38 = var28 + var33;
            int var39 = var38 ^ var33 >>> 2;
            int var40 = var33 + var37;
            int var41 = var29 + var39;
            int var42 = var40 ^ var37 << 8;
            int var43 = var31 + var42;
            int var44 = var37 + var41;
            var6 = var44 ^ var41 >>> 16;
            int var45 = var41 + var43;
            int var46 = var6 + var34;
            var5 = var45 ^ var43 << 10;
            int var47 = var43 + var46;
            int var48 = var5 + var36;
            var4 = var47 ^ var46 >>> 4;
            int var49 = var4 + var35;
            int var50 = var46 + var48;
            var3 = var50 ^ var48 << 8;
            var8 = var3 + var39;
            int var51 = var48 + var49;
            var2 = var51 ^ var49 >>> 9;
            var9 = var8 + var49;
            var7 = var2 + var42;
            this.field1839[var27] = var9;
            this.field1839[var27 + 1] = var8;
            this.field1839[var27 + 2] = var7;
            this.field1839[var27 + 3] = var6;
            this.field1839[var27 + 4] = var5;
            this.field1839[var27 + 5] = var4;
            this.field1839[var27 + 6] = var3;
            this.field1839[var27 + 7] = var2;
        }
        for (int var52 = 0; var52 < 256; var52 += 8) {
            int var53 = this.field1839[var52 + 4] + var5;
            int var54 = this.field1839[var52] + var9;
            int var55 = this.field1839[var52 + 7] + var2;
            int var56 = this.field1839[var52 + 2] + var7;
            int var57 = this.field1839[var52 + 5] + var4;
            int var58 = this.field1839[var52 + 3] + var6;
            int var59 = this.field1839[var52 + 6] + var3;
            int var60 = this.field1839[var52 + 1] + var8;
            int var61 = var54 ^ var60 << 11;
            int var62 = var56 + var60;
            int var63 = var62 ^ var56 >>> 2;
            int var64 = var53 + var63;
            int var65 = var58 + var61;
            int var66 = var56 + var65;
            int var67 = var66 ^ var65 << 8;
            int var68 = var64 + var65;
            var6 = var68 ^ var64 >>> 16;
            int var69 = var6 + var59;
            int var70 = var57 + var67;
            int var71 = var64 + var70;
            var5 = var71 ^ var70 << 10;
            int var72 = var5 + var55;
            int var73 = var69 + var70;
            var4 = var73 ^ var69 >>> 4;
            int var74 = var69 + var72;
            int var75 = var4 + var61;
            var3 = var74 ^ var72 << 8;
            int var76 = var72 + var75;
            var2 = var76 ^ var75 >>> 9;
            var7 = var2 + var67;
            var8 = var3 + var63;
            var9 = var8 + var75;
            this.field1839[var52] = var9;
            this.field1839[var52 + 1] = var8;
            this.field1839[var52 + 2] = var7;
            this.field1839[var52 + 3] = var6;
            this.field1839[var52 + 4] = var5;
            this.field1839[var52 + 5] = var4;
            this.field1839[var52 + 6] = var3;
            this.field1839[var52 + 7] = var2;
        }
        this.method755(128);
        this.field1833 = 256;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(Z)V", line = 219)
    public static void method754(boolean arg0) {
        field1837 = null;
        field1840 = null;
        if (!arg0) {
            field1843 = null;
            field1845 = null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V", line = 233)
    private final void method755(int arg0) {
        field1838++;
        this.field1834 += ++this.field1836;
        if (arg0 != 128) {
            this.method753(6);
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field1839[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field1831 ^= this.field1831 << 13;
                } else {
                    this.field1831 ^= this.field1831 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field1831 ^= this.field1831 << 2;
            } else {
                this.field1831 ^= this.field1831 >>> 16;
            }
            this.field1831 += this.field1839[var2 + 128 & 0xFF];
            int var4;
            this.field1839[var2] = var4 = this.field1839[class224.method1614(var3 >> 2, 255)] + this.field1831 + this.field1834;
            this.field1842[var2] = this.field1834 = var3 + this.field1839[class224.method1614(261189, var4) >> 8 >> 2];
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lcd;IILcd;)V", line = 313)
    public static final void method756(class64 arg0, int arg1, int arg2, class64 arg3) {
        class188.field3232 = arg3;
        class188.field3221 = arg0;
        field1832++;
        class101.field1824 = arg1;
        if (class188.field3232.method519((byte) 122, class188.field3240) || class188.field3221.method519((byte) 122, class188.field3240)) {
            class125.field2260 = 3;
        } else if (class76.field1433 == -1) {
            class106.field1955 = 0;
            class281.field4837 = 1;
            class125.field2260 = -3;
            class13 var4 = new class13(128);
            var4.method130(arg2 - 3431, 10);
            var4.method145(arg2 ^ 0xD1C, (int) (Math.random() * 99999.0D));
            var4.method145(arg2 ^ 0xD10, 514);
            var4.method161((byte) -94, class188.field3232.method509(31492));
            var4.method128((byte) -24, (int) (Math.random() * 9.9999999E7D));
            var4.method116(false, class188.field3221);
            var4.method128((byte) 120, (int) (Math.random() * 9.9999999E7D));
            var4.method144(class60.field1151, (byte) -126, class234.field3947);
            class17.field353.field281 = 0;
            class17.field353.method130(-1, 48);
            class17.field353.method130(-1, var4.field281);
            if (arg2 != 3430) {
                method752(true);
            }
            class17.field353.method157(var4.field281, true, var4.field254, 0);
        } else {
            class255.method1819(16234);
        }
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V", line = 354)
    private class102() {
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "([I)V", line = 359)
    public class102(int[] arg0) {
        this.field1842 = new int[256];
        this.field1839 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field1842[var2] = arg0[var2];
        }
        this.method753(-21028);
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(Z)I", line = 380)
    public final int method757(boolean arg0) {
        field1844++;
        if (arg0) {
            return 68;
        }
        if ((this.field1833--) == 0) {
            this.method755(128);
            this.field1833 = 255;
        }
        return this.field1842[this.field1833];
    }
}
