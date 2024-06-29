import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class135 {

    @OriginalMember(owner = "client!ch", name = "q", descriptor = "[I")
    private int[] field2267;

    @OriginalMember(owner = "client!ch", name = "n", descriptor = "[I")
    private int[] field2264;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "Lok;")
    public static class146 field2257 = null;

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "[Lte;")
    public static class288[] field2259 = new class288[6];

    @OriginalMember(owner = "client!ch", name = "u", descriptor = "[Lok;")
    public static class146[] field2271 = new class146[5];

    @OriginalMember(owner = "client!ch", name = "p", descriptor = "Lld;")
    public static class118 field2266 = new class118(8);

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "F")
    public static float field2261;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
    private int field2253;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
    private int field2256;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "I")
    private int field2260;

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "I")
    private int field2268;

    @OriginalMember(owner = "client!ch", name = "s", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!ch", name = "t", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "Lma;")
    public static class280 field2255;

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "[I")
    public static int[] field2265;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IB)V", line = 6)
    public static final void method995(int arg0, byte arg1) {
        field2270++;
        int var2 = 108 / ((arg1 + 34) / 63);
        class158 var3 = class206.method1564(arg0, 12, -112);
        var3.method1238(123);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V", line = 18)
    public static void method996(int arg0) {
        field2259 = null;
        field2266 = null;
        field2265 = null;
        if (arg0 == -7168) {
            field2271 = null;
            field2255 = null;
            field2257 = null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IZ)V", line = 33)
    public static final void method997(int arg0, boolean arg1) {
        field2251++;
        if (arg0 == -21623 && class101.field1626 != arg1) {
            class101.field1626 = arg1;
            class313.method2196(-128);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)V", line = 56)
    private final void method998(byte arg0) {
        field2262++;
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
            int var15 = var5 + var14;
            int var16 = var7 + var12;
            int var17 = var16 ^ var12 << 8;
            int var18 = var4 + var17;
            int var19 = var12 + var15;
            var6 = var19 ^ var15 >>> 16;
            int var20 = var15 + var18;
            int var21 = var3 + var6;
            var5 = var20 ^ var18 << 10;
            int var22 = var18 + var21;
            int var23 = var2 + var5;
            var4 = var22 ^ var21 >>> 4;
            int var24 = var4 + var11;
            int var25 = var21 + var23;
            var3 = var25 ^ var23 << 8;
            var8 = var3 + var14;
            int var26 = var23 + var24;
            var2 = var26 ^ var24 >>> 9;
            var7 = var2 + var17;
            var9 = var8 + var24;
        }
        for (int var27 = 0; var27 < 256; var27 += 8) {
            int var28 = this.field2264[var27 + 7] + var2;
            int var29 = this.field2264[var27 + 4] + var5;
            int var30 = this.field2264[var27 + 6] + var3;
            int var31 = this.field2264[var27 + 2] + var7;
            int var32 = this.field2264[var27] + var9;
            int var33 = this.field2264[var27 + 1] + var8;
            int var34 = this.field2264[var27 + 3] + var6;
            int var35 = var32 ^ var33 << 11;
            int var36 = this.field2264[var27 + 5] + var4;
            int var37 = var31 + var33;
            int var38 = var37 ^ var31 >>> 2;
            int var39 = var29 + var38;
            int var40 = var34 + var35;
            int var41 = var31 + var40;
            int var42 = var41 ^ var40 << 8;
            int var43 = var39 + var40;
            int var44 = var36 + var42;
            var6 = var43 ^ var39 >>> 16;
            int var45 = var6 + var30;
            int var46 = var39 + var44;
            var5 = var46 ^ var44 << 10;
            int var47 = var44 + var45;
            int var48 = var5 + var28;
            var4 = var47 ^ var45 >>> 4;
            int var49 = var45 + var48;
            var3 = var49 ^ var48 << 8;
            var8 = var3 + var38;
            int var50 = var4 + var35;
            int var51 = var48 + var50;
            var2 = var51 ^ var50 >>> 9;
            var9 = var8 + var50;
            this.field2267[var27] = var9;
            this.field2267[var27 + 1] = var8;
            var7 = var2 + var42;
            this.field2267[var27 + 2] = var7;
            this.field2267[var27 + 3] = var6;
            this.field2267[var27 + 4] = var5;
            this.field2267[var27 + 5] = var4;
            this.field2267[var27 + 6] = var3;
            this.field2267[var27 + 7] = var2;
        }
        if (arg0 >= -67) {
            method996(-97);
        }
        for (int var52 = 0; var52 < 256; var52 += 8) {
            int var53 = this.field2267[var52 + 7] + var2;
            int var54 = this.field2267[var52 + 4] + var5;
            int var55 = this.field2267[var52 + 2] + var7;
            int var56 = this.field2267[var52 + 3] + var6;
            int var57 = this.field2267[var52] + var9;
            int var58 = this.field2267[var52 + 1] + var8;
            int var59 = this.field2267[var52 + 6] + var3;
            int var60 = this.field2267[var52 + 5] + var4;
            int var61 = var57 ^ var58 << 11;
            int var62 = var55 + var58;
            int var63 = var56 + var61;
            int var64 = var62 ^ var55 >>> 2;
            int var65 = var54 + var64;
            int var66 = var55 + var63;
            int var67 = var66 ^ var63 << 8;
            int var68 = var63 + var65;
            var6 = var68 ^ var65 >>> 16;
            int var69 = var60 + var67;
            int var70 = var6 + var59;
            int var71 = var65 + var69;
            var5 = var71 ^ var69 << 10;
            int var72 = var5 + var53;
            int var73 = var69 + var70;
            var4 = var73 ^ var70 >>> 4;
            int var74 = var4 + var61;
            int var75 = var70 + var72;
            var3 = var75 ^ var72 << 8;
            int var76 = var72 + var74;
            var8 = var3 + var64;
            var2 = var76 ^ var74 >>> 9;
            var9 = var8 + var74;
            this.field2267[var52] = var9;
            var7 = var2 + var67;
            this.field2267[var52 + 1] = var8;
            this.field2267[var52 + 2] = var7;
            this.field2267[var52 + 3] = var6;
            this.field2267[var52 + 4] = var5;
            this.field2267[var52 + 5] = var4;
            this.field2267[var52 + 6] = var3;
            this.field2267[var52 + 7] = var2;
        }
        this.method999((byte) 116);
        this.field2256 = 256;
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(B)V", line = 212)
    private final void method999(byte arg0) {
        if (arg0 != 116) {
            return;
        }
        this.field2260 += ++this.field2253;
        field2263++;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field2267[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field2268 ^= this.field2268 << 13;
                } else {
                    this.field2268 ^= this.field2268 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field2268 ^= this.field2268 << 2;
            } else {
                this.field2268 ^= this.field2268 >>> 16;
            }
            this.field2268 += this.field2267[var2 + 128 & 0xFF];
            int var4;
            this.field2267[var2] = var4 = this.field2267[class82.method582(255, var3 >> 2)] + this.field2268 + this.field2260;
            this.field2264[var2] = this.field2260 = this.field2267[class82.method582(var4, 261363) >> 8 >> 2] + var3;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Z)I", line = 253)
    public final int method1000(boolean arg0) {
        if (this.field2256-- == 0) {
            this.method999((byte) 116);
            this.field2256 = 255;
        }
        if (arg0) {
            return -10;
        } else {
            field2252++;
            return this.field2264[this.field2256];
        }
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V", line = 296)
    private class135() {
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(B)Lok;", line = 300)
    public static final class146 method1001(byte arg0) {
        field2254++;
        if (arg0 != 41) {
            method996(113);
        }
        class146 var1;
        if (class161.field2736 == 1 && class45.field763 < 2) {
            var1 = class112.method758(-93, new class146[] { class224.field3735, class83.field1320, class281.field4825, class32.field617 });
        } else if (class272.field4668 && class45.field763 < 2) {
            var1 = class112.method758(-99, new class146[] { field2257, class83.field1320, class238.field3968, class32.field617 });
        } else if (class115.field1851 && class113.field1813[81] && class45.field763 > 2) {
            var1 = class45.method311(class45.field763 - 2, (byte) 110);
        } else {
            var1 = class45.method311(class45.field763 - 1, (byte) 110);
        }
        if (class45.field763 > 2) {
            var1 = class112.method758(arg0 ^ 0x56, new class146[] { var1, class261.field4340, class82.method585(14744, class45.field763 - 2), class215.field3548 });
        }
        return var1;
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "([I)V", line = 329)
    public class135(int[] arg0) {
        this.field2267 = new int[256];
        this.field2264 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field2264[var2] = arg0[var2];
        }
        this.method998((byte) -93);
    }
}
