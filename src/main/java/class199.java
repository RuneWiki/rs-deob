import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class199 {

    @OriginalMember(owner = "client!oq", name = "o", descriptor = "[I")
    private int[] field2839;

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "[I")
    private int[] field2826;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "[[B")
    public static byte[][] field2825 = new byte[250][];

    @OriginalMember(owner = "client!oq", name = "m", descriptor = "I")
    public static int field2837 = 0;

    @OriginalMember(owner = "client!oq", name = "j", descriptor = "Lon;")
    public static class184 field2834 = null;

    @OriginalMember(owner = "client!oq", name = "n", descriptor = "I")
    public static int field2838 = 0;

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!oq", name = "d", descriptor = "I")
    private int field2828;

    @OriginalMember(owner = "client!oq", name = "e", descriptor = "I")
    private int field2829;

    @OriginalMember(owner = "client!oq", name = "f", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!oq", name = "g", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!oq", name = "h", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!oq", name = "i", descriptor = "I")
    private int field2833;

    @OriginalMember(owner = "client!oq", name = "k", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!oq", name = "l", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!oq", name = "p", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!oq", name = "q", descriptor = "I")
    private int field2841;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(B)V")
    public static void method1315(byte arg0) {
        field2834 = null;
        field2825 = null;
        if (arg0 <= 97) {
            method1318((byte) -120);
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(I)Z")
    public static final boolean method1316(int arg0) {
        field2827++;
        if (arg0 != 16032) {
            method1318((byte) -9);
        }
        return class235.field3298;
    }

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "(B)I")
    public final int method1317(byte arg0) {
        if (arg0 > -91) {
            field2825 = null;
        }
        if ((this.field2841--) == 0) {
            this.method1319(127);
            this.field2841 = 255;
        }
        field2831++;
        return this.field2839[this.field2841];
    }

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "(B)V")
    public static final void method1318(byte arg0) {
        field2840++;
        int var1 = class340.field4822.length;
        if (arg0 > -113) {
            field2838 = 102;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            if (class340.field4822[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class1.field9; var4++) {
                    if (class75.field884[var4] == class33.field380[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class75.field884[class1.field9] = class33.field380[var2];
                    var3 = class1.field9++;
                }
                class236 var5 = new class236(class340.field4822[var2]);
                int var6 = 0;
                while (var5.field3320 < class340.field4822[var2].length && var6 < 511 && class102.field1250 < 1023) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method1617((byte) 48);
                    int var9 = var8 >> 14;
                    int var10 = (var8 & 0x1F9F) >> 7;
                    int var11 = var8 & 0x3F;
                    int var12 = (class33.field380[var2] >> 8) * 64 + var10 - class114.field1403;
                    int var13 = (class33.field380[var2] & 0xFF) * 64 + var11 - class41.field496;
                    class135 var14 = class403.method2568(var5.method1617((byte) 48), (byte) -83);
                    if (class167.field2335[var7] == null && (var14.field1642 & 0x1) > 0 && class422.field6035 == var9 && var12 >= 0 && class176.field2403 > (var12 + var14.field1697) && var13 >= 0 && class383.field5395 > (var14.field1697 + var13)) {
                        class167.field2335[var7] = new class77();
                        class167.field2335[var7].field5620 = var7;
                        class77 var15 = class167.field2335[var7];
                        class86.field981[class102.field1250++] = var7;
                        var15.field5625 = class189.field2726;
                        var15.method431(var14, 104);
                        var15.method2532(0, var15.field912.field1697);
                        var15.field5577 = var15.field912.field1646 << 3;
                        if (var15.field5577 == 0) {
                            var15.method2533(0, -88);
                        } else {
                            var15.method2533(var15.field912.field1650 + 4 << 11 & 0x3EA0, 78);
                        }
                        var15.method2522(var9, var15.method242(-30129), var12, var13, true, (byte) 127);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "(I)V")
    private final void method1319(int arg0) {
        field2832++;
        this.field2833 += ++this.field2829;
        if (arg0 < 123) {
            this.field2833 = 60;
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field2826[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field2828 ^= this.field2828 << 13;
                } else {
                    this.field2828 ^= this.field2828 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field2828 ^= this.field2828 << 2;
            } else {
                this.field2828 ^= this.field2828 >>> 16;
            }
            this.field2828 += this.field2826[var2 + 128 & 0xFF];
            int var4;
            this.field2826[var2] = var4 = this.field2828 + (this.field2826[class33.method210(var3 >> 2, 255)] + this.field2833);
            this.field2839[var2] = this.field2833 = var3 + this.field2826[class33.method210(var4 >> 8 >> 2, 255)];
        }
    }

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "(I)V")
    private final void method1320(int arg0) {
        field2835++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        int var10 = -37 % ((-arg0 - 34) / 62);
        for (int var11 = 0; var11 < 4; var11++) {
            int var62 = var9 ^ var8 << 11;
            int var63 = var6 + var62;
            int var64 = var7 + var8;
            int var65 = var64 ^ var7 >>> 2;
            int var66 = var7 + var63;
            int var67 = var5 + var65;
            int var68 = var66 ^ var63 << 8;
            int var69 = var4 + var68;
            int var70 = var63 + var67;
            var6 = var70 ^ var67 >>> 16;
            int var71 = var67 + var69;
            int var72 = var3 + var6;
            var5 = var71 ^ var69 << 10;
            int var73 = var69 + var72;
            int var74 = var2 + var5;
            var4 = var73 ^ var72 >>> 4;
            int var75 = var72 + var74;
            int var76 = var4 + var62;
            var3 = var75 ^ var74 << 8;
            var8 = var3 + var65;
            int var77 = var74 + var76;
            var2 = var77 ^ var76 >>> 9;
            var7 = var2 + var68;
            var9 = var8 + var76;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var38 = this.field2839[var12 + 3] + var6;
            int var39 = this.field2839[var12 + 2] + var7;
            int var40 = this.field2839[var12] + var9;
            int var41 = this.field2839[var12 + 7] + var2;
            int var42 = this.field2839[var12 + 1] + var8;
            int var43 = this.field2839[var12 + 6] + var3;
            int var44 = this.field2839[var12 + 5] + var4;
            int var45 = this.field2839[var12 + 4] + var5;
            int var46 = var40 ^ var42 << 11;
            int var47 = var38 + var46;
            int var48 = var39 + var42;
            int var49 = var48 ^ var39 >>> 2;
            int var50 = var45 + var49;
            int var51 = var39 + var47;
            int var52 = var51 ^ var47 << 8;
            int var53 = var47 + var50;
            int var54 = var44 + var52;
            var6 = var53 ^ var50 >>> 16;
            int var55 = var6 + var43;
            int var56 = var50 + var54;
            var5 = var56 ^ var54 << 10;
            int var57 = var54 + var55;
            int var58 = var5 + var41;
            var4 = var57 ^ var55 >>> 4;
            int var59 = var55 + var58;
            int var60 = var4 + var46;
            var3 = var59 ^ var58 << 8;
            int var61 = var58 + var60;
            var8 = var3 + var49;
            var2 = var61 ^ var60 >>> 9;
            var9 = var8 + var60;
            var7 = var2 + var52;
            this.field2826[var12] = var9;
            this.field2826[var12 + 1] = var8;
            this.field2826[var12 + 2] = var7;
            this.field2826[var12 + 3] = var6;
            this.field2826[var12 + 4] = var5;
            this.field2826[var12 + 5] = var4;
            this.field2826[var12 + 6] = var3;
            this.field2826[var12 + 7] = var2;
        }
        for (int var13 = 0; var13 < 256; var13 += 8) {
            int var14 = this.field2826[var13 + 1] + var8;
            int var15 = this.field2826[var13] + var9;
            int var16 = this.field2826[var13 + 7] + var2;
            int var17 = this.field2826[var13 + 5] + var4;
            int var18 = this.field2826[var13 + 6] + var3;
            int var19 = this.field2826[var13 + 2] + var7;
            int var20 = this.field2826[var13 + 4] + var5;
            int var21 = this.field2826[var13 + 3] + var6;
            int var22 = var15 ^ var14 << 11;
            int var23 = var14 + var19;
            int var24 = var21 + var22;
            int var25 = var23 ^ var19 >>> 2;
            int var26 = var19 + var24;
            int var27 = var20 + var25;
            int var28 = var26 ^ var24 << 8;
            int var29 = var24 + var27;
            int var30 = var17 + var28;
            var6 = var29 ^ var27 >>> 16;
            int var31 = var27 + var30;
            int var32 = var6 + var18;
            var5 = var31 ^ var30 << 10;
            int var33 = var5 + var16;
            int var34 = var30 + var32;
            var4 = var34 ^ var32 >>> 4;
            int var35 = var32 + var33;
            int var36 = var4 + var22;
            var3 = var35 ^ var33 << 8;
            var8 = var3 + var25;
            int var37 = var33 + var36;
            var2 = var37 ^ var36 >>> 9;
            var7 = var2 + var28;
            var9 = var8 + var36;
            this.field2826[var13] = var9;
            this.field2826[var13 + 1] = var8;
            this.field2826[var13 + 2] = var7;
            this.field2826[var13 + 3] = var6;
            this.field2826[var13 + 4] = var5;
            this.field2826[var13 + 5] = var4;
            this.field2826[var13 + 6] = var3;
            this.field2826[var13 + 7] = var2;
        }
        this.method1319(124);
        this.field2841 = 256;
    }

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "()V")
    private class199() {
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(ILtq;)V")
    public static final void method1321(int arg0, class376 arg1) {
        field2836++;
        if (arg0 < 46) {
            field2825 = null;
        }
        class356.field5016 = arg1;
        class63.field730 = class356.field5016.method2415(16, (byte) 56);
    }

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "([I)V")
    public class199(int[] arg0) {
        this.field2839 = new int[256];
        this.field2826 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field2839[var2] = arg0[var2];
        }
        this.method1320(42);
    }
}
