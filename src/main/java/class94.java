import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class94 {

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "[I")
    private int[] field2011 = new int[256];

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "[I")
    private int[] field2016 = new int[256];

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "Lod;")
    public static class101 field2020 = class46.method335(-71, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
    public static int field2024 = 0;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "Lod;")
    private static class101 field2021 = class46.method335(97, "Drop");

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "Lod;")
    public static class101 field2028 = field2021;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "Lod;")
    public static class101 field2027 = class46.method335(-89, "Die Verbindung konnte");

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "Lcb;")
    public static class17 field2014 = new class17(64);

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "I")
    public static volatile int field2029 = 0;

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "I")
    public static int field2030 = 0;

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "I")
    public static int field2033 = 0;

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "[Lbe;")
    public static class13[] field2032 = new class13[2048];

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    private int field2012;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    private int field2013;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "I")
    private int field2015;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
    private int field2017;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "[Lrd;")
    public static class122[] field2031;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
    private final void method650(int arg0) {
        field2023++;
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
            int var62 = var6 + var61;
            int var63 = var7 + var8;
            int var64 = var63 ^ var7 >>> 2;
            int var65 = var7 + var62;
            int var66 = var5 + var64;
            int var67 = var65 ^ var62 << 8;
            int var68 = var62 + var66;
            int var69 = var4 + var67;
            var6 = var68 ^ var66 >>> 16;
            int var70 = var66 + var69;
            int var71 = var3 + var6;
            var5 = var70 ^ var69 << 10;
            int var72 = var69 + var71;
            var4 = var72 ^ var71 >>> 4;
            int var73 = var2 + var5;
            int var74 = var4 + var61;
            int var75 = var71 + var73;
            var3 = var75 ^ var73 << 8;
            int var76 = var73 + var74;
            var2 = var76 ^ var74 >>> 9;
            var8 = var3 + var64;
            var9 = var8 + var74;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field2016[var11 + 3] + var6;
            int var38 = this.field2016[var11 + 7] + var2;
            int var39 = this.field2016[var11] + var9;
            int var40 = this.field2016[var11 + 5] + var4;
            int var41 = this.field2016[var11 + 6] + var3;
            int var42 = this.field2016[var11 + 4] + var5;
            int var43 = this.field2016[var11 + 1] + var8;
            int var44 = var39 ^ var43 << 11;
            int var45 = this.field2016[var11 + 2] + var7;
            int var46 = var43 + var45;
            int var47 = var46 ^ var45 >>> 2;
            int var48 = var42 + var47;
            int var49 = var37 + var44;
            int var50 = var45 + var49;
            int var51 = var50 ^ var49 << 8;
            int var52 = var40 + var51;
            int var53 = var48 + var49;
            var6 = var53 ^ var48 >>> 16;
            int var54 = var48 + var52;
            var5 = var54 ^ var52 << 10;
            int var55 = var6 + var41;
            int var56 = var5 + var38;
            int var57 = var52 + var55;
            var4 = var57 ^ var55 >>> 4;
            int var58 = var55 + var56;
            int var59 = var4 + var44;
            var3 = var58 ^ var56 << 8;
            var8 = var3 + var47;
            int var60 = var56 + var59;
            var2 = var60 ^ var59 >>> 9;
            var9 = var8 + var59;
            this.field2011[var11] = var9;
            var7 = var2 + var51;
            this.field2011[var11 + 1] = var8;
            this.field2011[var11 + 2] = var7;
            this.field2011[var11 + 3] = var6;
            this.field2011[var11 + 4] = var5;
            this.field2011[var11 + 5] = var4;
            this.field2011[var11 + 6] = var3;
            this.field2011[var11 + 7] = var2;
        }
        if (arg0 != 1344013988) {
            this.field2011 = null;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field2011[var12 + 3] + var6;
            int var14 = this.field2011[var12 + 7] + var2;
            int var15 = this.field2011[var12 + 1] + var8;
            int var16 = this.field2011[var12 + 6] + var3;
            int var17 = this.field2011[var12 + 4] + var5;
            int var18 = this.field2011[var12 + 5] + var4;
            int var19 = this.field2011[var12] + var9;
            int var20 = var19 ^ var15 << 11;
            int var21 = var13 + var20;
            int var22 = this.field2011[var12 + 2] + var7;
            int var23 = var15 + var22;
            int var24 = var23 ^ var22 >>> 2;
            int var25 = var17 + var24;
            int var26 = var21 + var22;
            int var27 = var26 ^ var21 << 8;
            int var28 = var18 + var27;
            int var29 = var21 + var25;
            var6 = var29 ^ var25 >>> 16;
            int var30 = var6 + var16;
            int var31 = var25 + var28;
            var5 = var31 ^ var28 << 10;
            int var32 = var5 + var14;
            int var33 = var28 + var30;
            var4 = var33 ^ var30 >>> 4;
            int var34 = var4 + var20;
            int var35 = var30 + var32;
            var3 = var35 ^ var32 << 8;
            int var36 = var32 + var34;
            var8 = var3 + var24;
            var2 = var36 ^ var34 >>> 9;
            var9 = var8 + var34;
            this.field2011[var12] = var9;
            var7 = var2 + var27;
            this.field2011[var12 + 1] = var8;
            this.field2011[var12 + 2] = var7;
            this.field2011[var12 + 3] = var6;
            this.field2011[var12 + 4] = var5;
            this.field2011[var12 + 5] = var4;
            this.field2011[var12 + 6] = var3;
            this.field2011[var12 + 7] = var2;
        }
        this.method655(-1344584254);
        this.field2013 = 256;
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "([I)V")
    public class94(int[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field2016[var2] = arg0[var2];
        }
        this.method650(1344013988);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
    public static void method651(byte arg0) {
        field2014 = null;
        field2028 = null;
        field2021 = null;
        field2032 = null;
        field2027 = null;
        field2031 = null;
        field2020 = null;
        if (arg0 != 43) {
            method651((byte) 65);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)Ldb;")
    public static final class24 method652(int arg0, int arg1) {
        field2022++;
        class24 var2 = (class24) class56.field1261.method140(true, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class142.field3268.method114((byte) 99, 6, arg0);
        if (arg1 != 0) {
            return null;
        }
        class24 var4 = new class24();
        var4.field624 = arg0;
        if (var3 != null) {
            var4.method195((byte) 124, new class138(var3));
        }
        var4.method188(46);
        if (var4.field572) {
            var4.field570 = 0;
            var4.field592 = false;
        }
        class56.field1261.method141(var4, (long) arg0, (byte) 82);
        return var4;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V")
    public static final void method653(int arg0) {
        class133.field3051 = 0;
        field2018++;
        int var1 = (class82.field1778.field1341 >> 7) + class56.field1260;
        if (arg0 != 7) {
            field2028 = null;
        }
        int var2 = (class82.field1778.field1298 >> 7) + class75.field1597;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class133.field3051 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class133.field3051 = 1;
        }
        if (class133.field3051 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class133.field3051 = 0;
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(B)I")
    public final int method654(byte arg0) {
        if (arg0 > -102) {
            field2030 = 11;
        }
        field2010++;
        if (this.field2013-- == 0) {
            this.method655(-1344584254);
            this.field2013 = 255;
        }
        return this.field2016[this.field2013];
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)V")
    private final void method655(int arg0) {
        this.field2015 += ++this.field2012;
        field2026++;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field2011[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field2017 ^= this.field2017 << 13;
                } else {
                    this.field2017 ^= this.field2017 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field2017 ^= this.field2017 << 2;
            } else {
                this.field2017 ^= this.field2017 >>> 16;
            }
            this.field2017 += this.field2011[var2 + 128 & 0xFF];
            int var4;
            this.field2011[var2] = var4 = this.field2011[class41.method307(var3, 1020) >> 2] + this.field2017 + this.field2015;
            this.field2016[var2] = this.field2015 = this.field2011[class41.method307(261124, var4) >> 8 >> 2] + var3;
        }
        if (arg0 != -1344584254) {
            this.field2013 = -76;
        }
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(B)V")
    public static final void method656(byte arg0) {
        field2025++;
        if (arg0 == 81) {
            class118.field2607.method135(arg0 - 81);
            class98.field2128.method135(0);
        }
    }
}
