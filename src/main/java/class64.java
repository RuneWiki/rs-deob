import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class64 {

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "[I")
    private int[] field1254;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "[I")
    private int[] field1257;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "J")
    public static long field1258 = 0L;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "Lr;")
    public static class66 field1256 = class93.method641(43, "<col=ffb000>");

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "Lr;")
    public static class66 field1266 = class93.method641(43, "<col=ff3000>");

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "I")
    public static int field1267 = -1;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "Z")
    public static boolean field1265 = true;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "Lr;")
    public static class66 field1259 = class93.method641(43, "details");

    @OriginalMember(owner = "client!ng", name = "x", descriptor = "[B")
    public static byte[] field1274 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
    private int field1255;

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "I")
    private int field1260;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "I")
    private int field1264;

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!ng", name = "s", descriptor = "I")
    private int field1269;

    @OriginalMember(owner = "client!ng", name = "t", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!ng", name = "u", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!ng", name = "v", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!ng", name = "w", descriptor = "J")
    public static long field1273;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
    private final void method430(int arg0) {
        field1253++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        if (arg0 != -1944247670) {
            return;
        }
        for (int var10 = 0; var10 < 4; var10++) {
            int var61 = var9 ^ var8 << 11;
            int var62 = var7 + var8;
            int var63 = var6 + var61;
            int var64 = var62 ^ var7 >>> 2;
            int var65 = var5 + var64;
            int var66 = var7 + var63;
            int var67 = var66 ^ var63 << 8;
            int var68 = var63 + var65;
            int var69 = var4 + var67;
            var6 = var68 ^ var65 >>> 16;
            int var70 = var65 + var69;
            var5 = var70 ^ var69 << 10;
            int var71 = var2 + var5;
            int var72 = var3 + var6;
            int var73 = var69 + var72;
            var4 = var73 ^ var72 >>> 4;
            int var74 = var4 + var61;
            int var75 = var71 + var72;
            var3 = var75 ^ var71 << 8;
            int var76 = var71 + var74;
            var2 = var76 ^ var74 >>> 9;
            var7 = var2 + var67;
            var8 = var3 + var64;
            var9 = var8 + var74;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field1257[var11 + 2] + var7;
            int var38 = this.field1257[var11 + 4] + var5;
            int var39 = this.field1257[var11 + 1] + var8;
            int var40 = this.field1257[var11 + 6] + var3;
            int var41 = this.field1257[var11 + 3] + var6;
            int var42 = this.field1257[var11 + 7] + var2;
            int var43 = this.field1257[var11 + 5] + var4;
            int var44 = this.field1257[var11] + var9;
            int var45 = var44 ^ var39 << 11;
            int var46 = var37 + var39;
            int var47 = var41 + var45;
            int var48 = var46 ^ var37 >>> 2;
            int var49 = var37 + var47;
            int var50 = var38 + var48;
            int var51 = var49 ^ var47 << 8;
            int var52 = var47 + var50;
            int var53 = var43 + var51;
            var6 = var52 ^ var50 >>> 16;
            int var54 = var6 + var40;
            int var55 = var50 + var53;
            var5 = var55 ^ var53 << 10;
            int var56 = var5 + var42;
            int var57 = var53 + var54;
            var4 = var57 ^ var54 >>> 4;
            int var58 = var54 + var56;
            var3 = var58 ^ var56 << 8;
            var8 = var3 + var48;
            int var59 = var4 + var45;
            int var60 = var56 + var59;
            var2 = var60 ^ var59 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var59;
            this.field1254[var11] = var9;
            this.field1254[var11 + 1] = var8;
            this.field1254[var11 + 2] = var7;
            this.field1254[var11 + 3] = var6;
            this.field1254[var11 + 4] = var5;
            this.field1254[var11 + 5] = var4;
            this.field1254[var11 + 6] = var3;
            this.field1254[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field1254[var12 + 2] + var7;
            int var14 = this.field1254[var12 + 7] + var2;
            int var15 = this.field1254[var12] + var9;
            int var16 = this.field1254[var12 + 5] + var4;
            int var17 = this.field1254[var12 + 4] + var5;
            int var18 = this.field1254[var12 + 1] + var8;
            int var19 = this.field1254[var12 + 3] + var6;
            int var20 = var15 ^ var18 << 11;
            int var21 = var13 + var18;
            int var22 = var19 + var20;
            int var23 = this.field1254[var12 + 6] + var3;
            int var24 = var21 ^ var13 >>> 2;
            int var25 = var17 + var24;
            int var26 = var13 + var22;
            int var27 = var26 ^ var22 << 8;
            int var28 = var22 + var25;
            int var29 = var16 + var27;
            var6 = var28 ^ var25 >>> 16;
            int var30 = var25 + var29;
            var5 = var30 ^ var29 << 10;
            int var31 = var5 + var14;
            int var32 = var6 + var23;
            int var33 = var29 + var32;
            var4 = var33 ^ var32 >>> 4;
            int var34 = var31 + var32;
            var3 = var34 ^ var31 << 8;
            var8 = var3 + var24;
            int var35 = var4 + var20;
            int var36 = var31 + var35;
            var2 = var36 ^ var35 >>> 9;
            var9 = var8 + var35;
            var7 = var2 + var27;
            this.field1254[var12] = var9;
            this.field1254[var12 + 1] = var8;
            this.field1254[var12 + 2] = var7;
            this.field1254[var12 + 3] = var6;
            this.field1254[var12 + 4] = var5;
            this.field1254[var12 + 5] = var4;
            this.field1254[var12 + 6] = var3;
            this.field1254[var12 + 7] = var2;
        }
        this.method435(41);
        this.field1255 = 256;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BLcj;)I")
    public static final int method431(byte arg0, class28 arg1) {
        if (arg0 != -126) {
            field1258 = -41L;
        }
        field1263++;
        int var2 = 0;
        if (arg1.method157(class112.field2149, arg0 + 126)) {
            var2++;
        }
        if (arg1.method157(class70.field1408, 0)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BIIZIII)V")
    public static final void method432(byte arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field1272++;
        if (class157.field2816 == arg5 && class155.field2755 == arg6 && class105.field2030 == arg2 || class88.method625(24781)) {
            return;
        }
        class105.field2030 = arg2;
        class155.field2755 = arg6;
        class157.field2816 = arg5;
        if (class88.method625(24781)) {
            class105.field2030 = 0;
        }
        if (arg3) {
            class112.method755(28, (byte) -76);
        } else {
            class112.method755(25, (byte) -85);
        }
        if (arg0 >= -1) {
            field1273 = -24L;
        }
        class250.method1693(true, class199.field3428, -16678);
        int var7 = class3.field39;
        class3.field39 = arg5 * 8 - 48;
        int var8 = class34.field512;
        class34.field512 = arg6 * 8 - 48;
        class11.field124 = class83.method580(class155.field2755 * 8, class157.field2816 * 8, 111);
        int var9 = class3.field39 - var7;
        int var10 = class3.field39;
        int var11 = class34.field512 - var8;
        int var12 = class34.field512;
        if (arg3) {
            class160.field2869 = 0;
            for (int var13 = 0; var13 < 32768; var13++) {
                class37 var14 = class178.field3112[var13];
                if (var14 != null) {
                    var14.field2077 -= var9 * 128;
                    var14.field2053 -= var11 * 128;
                    if (var14.field2077 >= 0 && var14.field2077 <= 13184 && var14.field2053 >= 0 && var14.field2053 <= 13184) {
                        for (int var15 = 0; var15 < 10; var15++) {
                            var14.field2039[var15] -= var9;
                            var14.field2086[var15] -= var11;
                        }
                        class49.field877[class160.field2869++] = var13;
                    } else {
                        class178.field3112[var13].field548 = null;
                        class178.field3112[var13] = null;
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < 32768; var16++) {
                class37 var32 = class178.field3112[var16];
                if (var32 != null) {
                    for (int var33 = 0; var33 < 10; var33++) {
                        var32.field2039[var33] -= var9;
                        var32.field2086[var33] -= var11;
                    }
                    var32.field2077 -= var9 * 128;
                    var32.field2053 -= var11 * 128;
                }
            }
        }
        for (int var17 = 0; var17 < 2048; var17++) {
            class45 var30 = class59.field988[var17];
            if (var30 != null) {
                for (int var31 = 0; var31 < 10; var31++) {
                    var30.field2039[var31] -= var9;
                    var30.field2086[var31] -= var11;
                }
                var30.field2053 -= var11 * 128;
                var30.field2077 -= var9 * 128;
            }
        }
        class196.field3401 = arg2;
        class207.field3595.method731(arg1, (byte) -68, arg4, false);
        byte var18 = 1;
        byte var19 = 0;
        byte var20 = 0;
        byte var21 = 104;
        if (var9 < 0) {
            var21 = -1;
            var19 = 103;
            var18 = -1;
        }
        byte var22 = 1;
        byte var23 = 104;
        if (var11 < 0) {
            var23 = -1;
            var22 = -1;
            var20 = 103;
        }
        for (int var24 = var19; var24 != var21; var24 += var18) {
            for (int var26 = var20; var26 != var23; var26 += var22) {
                int var27 = var26 + var11;
                int var28 = var9 + var24;
                for (int var29 = 0; var29 < 4; var29++) {
                    if (var28 >= 0 && var27 >= 0 && var28 < 104 && var27 < 104) {
                        class63.field1249[var29][var24][var26] = class63.field1249[var29][var28][var27];
                    } else {
                        class63.field1249[var29][var24][var26] = null;
                    }
                }
            }
        }
        for (class14 var25 = (class14) class180.field3146.method873((byte) 76); var25 != null; var25 = (class14) class180.field3146.method870((byte) -108)) {
            var25.field168 -= var11;
            var25.field175 -= var9;
            if (var25.field175 < 0 || var25.field168 < 0 || var25.field175 >= 104 || var25.field168 >= 104) {
                var25.method560(-17554);
            }
        }
        if (class32.field481 != 0) {
            class72.field1426 -= var11;
            class32.field481 -= var9;
        }
        if (arg3) {
            class259.field4560 -= var9;
            class101.field1973 -= var11;
            class188.field3264 -= var11;
            class249.field4344 -= var9;
        } else {
            class167.field2995 = 1;
        }
        class220.field3771 = -1;
        class7.field64 = 0;
        class246.field4288.method864(105);
        class63.field1209.method864(105);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IJ)V")
    public static final void method433(int arg0, long arg1) {
        field1261++;
        class28.field412.field4335 = 0;
        class28.field412.method1638(32, 118);
        class28.field412.method1651(true, arg1);
        class69.field1400 = 1;
        class91.field1750 = arg0;
        class121.field2289 = 0;
        class47.field858 = 0;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)[Ldh;")
    public static final class265[] method434(int arg0) {
        field1270++;
        class265[] var1 = new class265[class249.field4397];
        for (int var2 = 0; var2 < class249.field4397; var2++) {
            var1[var2] = new class265(class11.field125, class54.field950, class36.field541[var2], class231.field4029[var2], class2.field25[var2], class199.field3443[var2], class44.field777[var2], class136.field2517);
        }
        class211.method1365((byte) -93);
        return arg0 < 11 ? null : var1;
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(I)V")
    private final void method435(int arg0) {
        this.field1269 += ++this.field1264;
        if (arg0 < 11) {
            field1258 = 42L;
        }
        field1252++;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field1254[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field1260 ^= this.field1260 << 13;
                } else {
                    this.field1260 ^= this.field1260 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field1260 ^= this.field1260 << 2;
            } else {
                this.field1260 ^= this.field1260 >>> 16;
            }
            this.field1260 += this.field1254[var2 + 128 & 0xFF];
            int var4;
            this.field1254[var2] = var4 = this.field1260 + this.field1254[class115.method767(var3 >> 2, 255)] + this.field1269;
            this.field1257[var2] = this.field1269 = var3 + this.field1254[class115.method767(var4 >> 8 >> 2, 255)];
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)V")
    public static void method436(byte arg0) {
        field1274 = null;
        if (arg0 < 80) {
            field1271 = 48;
        }
        field1259 = null;
        field1256 = null;
        field1266 = null;
    }

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "(I)Z")
    public static final boolean method437(int arg0) {
        if (arg0 != -15855) {
            field1258 = 17L;
        }
        field1268++;
        if (class150.field2704 != 0) {
            try {
                if ((Boolean) class54.field935.method474(class95.field1835.field2184, (byte) -123)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZIILcj;)[Lni;")
    public static final class168[] method438(boolean arg0, int arg1, int arg2, class28 arg3) {
        field1251++;
        if (arg0) {
            field1271 = 43;
        }
        return class31.method174(-29381, arg1, arg3, arg2) ? class255.method1711(true) : null;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(B)I")
    public final int method439(byte arg0) {
        if (this.field1255-- == 0) {
            this.method435(87);
            this.field1255 = 255;
        }
        int var2 = 14 / ((arg0 - 20) / 35);
        field1262++;
        return this.field1257[this.field1255];
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V")
    private class64() {
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "([I)V")
    public class64(int[] arg0) {
        this.field1254 = new int[256];
        this.field1257 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field1257[var2] = arg0[var2];
        }
        this.method430(-1944247670);
    }
}
