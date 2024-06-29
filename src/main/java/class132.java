import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class132 {

    @OriginalMember(owner = "client!la", name = "j", descriptor = "[I")
    private int[] field2241;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "[I")
    private int[] field2245;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "J")
    public static long field2237 = 0L;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "Z")
    public static boolean field2243 = false;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "B")
    public static byte field2234;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    private int field2233;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    private int field2235;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    private int field2238;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "I")
    private int field2244;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lce;I)V", line = 13)
    public static final void method972(class239 arg0, int arg1) {
        int var2 = 77 / ((-arg1 - 64) / 39);
        class7.field97 = arg0;
        class275.field4581 = class7.field97.method1664(16, (byte) 30);
        field2247++;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)V", line = 28)
    private final void method973(boolean arg0) {
        field2239++;
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
            int var20 = var3 + var6;
            int var21 = var15 + var18;
            var5 = var21 ^ var18 << 10;
            int var22 = var18 + var20;
            var4 = var22 ^ var20 >>> 4;
            int var23 = var4 + var11;
            int var24 = var2 + var5;
            int var25 = var20 + var24;
            var3 = var25 ^ var24 << 8;
            var8 = var3 + var14;
            int var26 = var23 + var24;
            var2 = var26 ^ var23 >>> 9;
            var9 = var8 + var23;
            var7 = var2 + var17;
        }
        for (int var27 = 0; var27 < 256; var27 += 8) {
            int var28 = this.field2241[var27 + 2] + var7;
            int var29 = this.field2241[var27] + var9;
            int var30 = this.field2241[var27 + 4] + var5;
            int var31 = this.field2241[var27 + 3] + var6;
            int var32 = this.field2241[var27 + 5] + var4;
            int var33 = this.field2241[var27 + 7] + var2;
            int var34 = this.field2241[var27 + 1] + var8;
            int var35 = this.field2241[var27 + 6] + var3;
            int var36 = var29 ^ var34 << 11;
            int var37 = var28 + var34;
            int var38 = var31 + var36;
            int var39 = var37 ^ var28 >>> 2;
            int var40 = var28 + var38;
            int var41 = var30 + var39;
            int var42 = var40 ^ var38 << 8;
            int var43 = var32 + var42;
            int var44 = var38 + var41;
            var6 = var44 ^ var41 >>> 16;
            int var45 = var41 + var43;
            int var46 = var6 + var35;
            var5 = var45 ^ var43 << 10;
            int var47 = var5 + var33;
            int var48 = var43 + var46;
            var4 = var48 ^ var46 >>> 4;
            int var49 = var46 + var47;
            int var50 = var4 + var36;
            var3 = var49 ^ var47 << 8;
            int var51 = var47 + var50;
            var2 = var51 ^ var50 >>> 9;
            var7 = var2 + var42;
            var8 = var3 + var39;
            var9 = var8 + var50;
            this.field2245[var27] = var9;
            this.field2245[var27 + 1] = var8;
            this.field2245[var27 + 2] = var7;
            this.field2245[var27 + 3] = var6;
            this.field2245[var27 + 4] = var5;
            this.field2245[var27 + 5] = var4;
            this.field2245[var27 + 6] = var3;
            this.field2245[var27 + 7] = var2;
        }
        int var52 = 0;
        if (arg0) {
            return;
        }
        while (var52 < 256) {
            int var53 = this.field2245[var52 + 5] + var4;
            int var54 = this.field2245[var52] + var9;
            int var55 = this.field2245[var52 + 2] + var7;
            int var56 = this.field2245[var52 + 3] + var6;
            int var57 = this.field2245[var52 + 1] + var8;
            int var58 = var54 ^ var57 << 11;
            int var59 = this.field2245[var52 + 6] + var3;
            int var60 = var56 + var58;
            int var61 = this.field2245[var52 + 7] + var2;
            int var62 = var55 + var57;
            int var63 = this.field2245[var52 + 4] + var5;
            int var64 = var62 ^ var55 >>> 2;
            int var65 = var63 + var64;
            int var66 = var55 + var60;
            int var67 = var66 ^ var60 << 8;
            int var68 = var53 + var67;
            int var69 = var60 + var65;
            var6 = var69 ^ var65 >>> 16;
            int var70 = var65 + var68;
            int var71 = var6 + var59;
            var5 = var70 ^ var68 << 10;
            int var72 = var5 + var61;
            int var73 = var68 + var71;
            var4 = var73 ^ var71 >>> 4;
            int var74 = var4 + var58;
            int var75 = var71 + var72;
            var3 = var75 ^ var72 << 8;
            int var76 = var72 + var74;
            var2 = var76 ^ var74 >>> 9;
            var8 = var3 + var64;
            var7 = var2 + var67;
            var9 = var8 + var74;
            this.field2245[var52] = var9;
            this.field2245[var52 + 1] = var8;
            this.field2245[var52 + 2] = var7;
            this.field2245[var52 + 3] = var6;
            this.field2245[var52 + 4] = var5;
            this.field2245[var52 + 5] = var4;
            this.field2245[var52 + 6] = var3;
            this.field2245[var52 + 7] = var2;
            var52 += 8;
        }
        this.method975(true);
        this.field2244 = 256;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILqd;)V", line = 178)
    public static final void method974(int arg0, class40 arg1) {
        field2236++;
        if (class162.field2689 >= 2) {
            if (arg1.method327(class53.field1022, -21581)) {
                class177.method1305(-96);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class303.method2071((class40) null, 61, 0, class153.method1192(new class40[] { class6.field93, class276.method1927((byte) -91, var4), class33.field671 }, (byte) 14));
            }
            if (class21.field350 && arg1.method327(class268.field4471, arg0 ^ 0xFFFFABD4)) {
                System.out.println("oncard_geometry:" + class136.field2304);
                System.out.println("oncard_2d:" + class136.field2301);
                System.out.println("oncard_texture:" + class136.field2303);
            }
            if (arg1.method327(class278.field4695, -21581)) {
                class280.method1957((byte) -76);
            }
            if (arg1.method327(class301.field5055, -21581)) {
                class123.field2139.method2082((byte) -125);
            }
            if (arg1.method327(class301.field5045, -21581)) {
                class123.field2139.method2083(79);
            }
            if (arg1.method327(class271.field4499, arg0 - 21684)) {
                class275.field4573.method814(0);
                class140.field2369.method787(-127);
                class123.field2139.method2078(8);
            }
            if (arg1.method327(class59.field1130, -21581)) {
                class156.field2617 = true;
            }
            if (arg1.method327(class306.field5136, arg0 - 21684)) {
                class271.method1879(25, 17646);
            }
            if (arg1.method327(class126.field2185, -21581)) {
                class89.field1598 = true;
            }
            if (arg1.method327(class277.field4650, -21581)) {
                class89.field1598 = false;
            }
            if (arg1.method327(class282.field4749, arg0 - 21684)) {
                class289.method1997(-1, 0, false, true, -1);
            }
            if (arg1.method327(class236.field3863, arg0 ^ 0xFFFFABD4)) {
                class289.method1997(-1, 1, false, true, -1);
            }
            if (arg1.method327(class65.field1230, -21581)) {
                class289.method1997(-1, 2, false, true, -1);
            }
            if (arg1.method327(class27.field543, -21581)) {
                class289.method1997(768, 3, false, true, 1024);
            }
            if (arg1.method327(class134.field2274, -21581)) {
                for (int var5 = 0; var5 < 4; var5++) {
                    for (int var6 = 1; var6 < 103; var6++) {
                        for (int var7 = 1; var7 < 103; var7++) {
                            class255.field4247[var5].field839[var6][var7] = 0;
                        }
                    }
                }
            }
            if (arg1.method365(class41.field789, 0) && class188.field3049 != 0) {
                class243.method1710(0, arg1.method371(6, false).method349(arg0 - 137));
            }
            if (arg1.method327(class288.field4837, arg0 ^ 0xFFFFABD4) && class188.field3049 == 2) {
                throw new RuntimeException();
            }
            if (arg1.method365(class230.field3788, arg0 ^ 0x67)) {
                class48.field938 = arg1.method371(12, false).method364(-91).method349(arg0 - 137);
                class303.method2071((class40) null, arg0 ^ 0x7, 0, class153.method1192(new class40[] { class14.field211, class276.method1927((byte) -96, class48.field938) }, (byte) 122));
            }
            if (arg1.method327(class239.field3930, arg0 ^ 0xFFFFABD4)) {
                class126.field2176 = true;
            }
        }
        class204.field3226++;
        class19.field295.method1464(arg0, arg0 - 103);
        class19.field295.method218(arg1.method350(true) - 1, arg0 + -20017);
        class19.field295.method206(arg1.method371(2, false), (byte) -108);
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(Z)V", line = 323)
    private final void method975(boolean arg0) {
        this.field2235 += ++this.field2238;
        field2246++;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field2245[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field2233 ^= this.field2233 << 13;
                } else {
                    this.field2233 ^= this.field2233 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field2233 ^= this.field2233 << 2;
            } else {
                this.field2233 ^= this.field2233 >>> 16;
            }
            this.field2233 += this.field2245[var2 + 128 & 0xFF];
            int var4;
            this.field2245[var2] = var4 = this.field2235 + this.field2233 + this.field2245[class276.method1923(var3, 1020) >> 2];
            this.field2241[var2] = this.field2235 = var3 + this.field2245[class276.method1923(var4 >> 8 >> 2, 255)];
        }
        if (!arg0) {
            field2234 = -68;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(III)Lgi;", line = 365)
    public static final class208 method976(int arg0, int arg1, int arg2) {
        field2240++;
        for (class208 var3 = (class208) class80.field1386.method1971(arg2 ^ 0xFFFFDDEC); var3 != null; var3 = (class208) class80.field1386.method1967(arg2 ^ 0xFFFFDDEC)) {
            if (var3.field3332 && var3.method1474(arg0, arg1, (byte) 120)) {
                return var3;
            }
        }
        if (arg2 != -8824) {
            method976(-4, -38, 26);
        }
        return null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)I", line = 403)
    public final int method977(int arg0) {
        if (this.field2244-- == 0) {
            this.method975(true);
            this.field2244 = 255;
        }
        if (arg0 < 14) {
            this.field2238 = 112;
        }
        field2232++;
        return this.field2241[this.field2244];
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "()V", line = 422)
    private class132() {
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "([I)V", line = 425)
    public class132(int[] arg0) {
        this.field2241 = new int[256];
        this.field2245 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field2241[var2] = arg0[var2];
        }
        this.method973(false);
    }
}
