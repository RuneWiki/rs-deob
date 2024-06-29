import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class205 {

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "[I")
    private int[] field4019 = new int[256];

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "[I")
    private int[] field4014 = new int[256];

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "Lrf;")
    public static class163 field4005 = class53.method392(97, "<col=00ff00>");

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "Lrf;")
    public static class163 field4011 = class53.method392(46, "Schlie-8en");

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "Lrf;")
    public static class163 field4016 = class53.method392(103, "::noclip");

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "Lrf;")
    public static class163 field4021 = class53.method392(100, "::fps ");

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "I")
    public static int field4022 = 0;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "B")
    public static byte field4006;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    private int field4010;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "I")
    private int field4017;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
    private int field4018;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
    private int field4020;

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "Lae;")
    public static class6 field4013;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)I")
    public final int method1343(int arg0) {
        field4012++;
        if (this.field4017-- == 0) {
            this.method1346(arg0 + 29235);
            this.field4017 = 255;
        }
        if (arg0 != 2) {
            this.field4017 = -86;
        }
        return this.field4019[this.field4017];
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)V")
    public static void method1344(int arg0) {
        field4005 = null;
        field4021 = null;
        field4016 = null;
        field4013 = null;
        field4011 = null;
        if (arg0 >= -100) {
            field4008 = 7;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)V")
    public static final void method1345(int arg0, int arg1, int arg2) {
        field4007++;
        long var3 = (long) ((arg0 << 16) + arg2);
        class39 var5 = (class39) class150.field3098.method465(var3, (byte) -60);
        if (var5 != null) {
            class140.field2883.method420(arg1 ^ arg1, var5);
        }
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)V")
    private final void method1346(int arg0) {
        this.field4010 += ++this.field4020;
        field4023++;
        if (arg0 != 29237) {
            this.field4020 = -10;
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field4014[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field4018 ^= this.field4018 << 13;
                } else {
                    this.field4018 ^= this.field4018 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field4018 ^= this.field4018 << 2;
            } else {
                this.field4018 ^= this.field4018 >>> 16;
            }
            this.field4018 += this.field4014[var2 + 128 & 0xFF];
            int var4;
            this.field4014[var2] = var4 = this.field4010 + this.field4014[class133.method887(var3, 1020) >> 2] + this.field4018;
            this.field4019[var2] = this.field4010 = var3 + this.field4014[class133.method887(var4 >> 8, 1020) >> 2];
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V")
    private final void method1347(byte arg0) {
        if (arg0 < 40) {
            return;
        }
        field4009++;
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
            int var65 = var5 + var64;
            int var66 = var7 + var62;
            int var67 = var66 ^ var62 << 8;
            int var68 = var62 + var65;
            var6 = var68 ^ var65 >>> 16;
            int var69 = var3 + var6;
            int var70 = var4 + var67;
            int var71 = var65 + var70;
            var5 = var71 ^ var70 << 10;
            int var72 = var2 + var5;
            int var73 = var69 + var70;
            var4 = var73 ^ var69 >>> 4;
            int var74 = var4 + var61;
            int var75 = var69 + var72;
            var3 = var75 ^ var72 << 8;
            var8 = var3 + var64;
            int var76 = var72 + var74;
            var2 = var76 ^ var74 >>> 9;
            var9 = var8 + var74;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field4019[var11 + 4] + var5;
            int var38 = this.field4019[var11 + 5] + var4;
            int var39 = this.field4019[var11 + 1] + var8;
            int var40 = this.field4019[var11 + 6] + var3;
            int var41 = this.field4019[var11 + 2] + var7;
            int var42 = this.field4019[var11 + 3] + var6;
            int var43 = this.field4019[var11] + var9;
            int var44 = this.field4019[var11 + 7] + var2;
            int var45 = var43 ^ var39 << 11;
            int var46 = var39 + var41;
            int var47 = var46 ^ var41 >>> 2;
            int var48 = var37 + var47;
            int var49 = var42 + var45;
            int var50 = var41 + var49;
            int var51 = var50 ^ var49 << 8;
            int var52 = var48 + var49;
            int var53 = var38 + var51;
            var6 = var52 ^ var48 >>> 16;
            int var54 = var6 + var40;
            int var55 = var48 + var53;
            var5 = var55 ^ var53 << 10;
            int var56 = var5 + var44;
            int var57 = var53 + var54;
            var4 = var57 ^ var54 >>> 4;
            int var58 = var54 + var56;
            var3 = var58 ^ var56 << 8;
            int var59 = var4 + var45;
            int var60 = var56 + var59;
            var2 = var60 ^ var59 >>> 9;
            var8 = var3 + var47;
            var9 = var8 + var59;
            var7 = var2 + var51;
            this.field4014[var11] = var9;
            this.field4014[var11 + 1] = var8;
            this.field4014[var11 + 2] = var7;
            this.field4014[var11 + 3] = var6;
            this.field4014[var11 + 4] = var5;
            this.field4014[var11 + 5] = var4;
            this.field4014[var11 + 6] = var3;
            this.field4014[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field4014[var12 + 1] + var8;
            int var14 = this.field4014[var12 + 3] + var6;
            int var15 = this.field4014[var12] + var9;
            int var16 = this.field4014[var12 + 5] + var4;
            int var17 = this.field4014[var12 + 6] + var3;
            int var18 = this.field4014[var12 + 4] + var5;
            int var19 = this.field4014[var12 + 7] + var2;
            int var20 = this.field4014[var12 + 2] + var7;
            int var21 = var15 ^ var13 << 11;
            int var22 = var14 + var21;
            int var23 = var13 + var20;
            int var24 = var23 ^ var20 >>> 2;
            int var25 = var18 + var24;
            int var26 = var20 + var22;
            int var27 = var26 ^ var22 << 8;
            int var28 = var22 + var25;
            int var29 = var16 + var27;
            var6 = var28 ^ var25 >>> 16;
            int var30 = var6 + var17;
            int var31 = var25 + var29;
            var5 = var31 ^ var29 << 10;
            int var32 = var5 + var19;
            int var33 = var29 + var30;
            var4 = var33 ^ var30 >>> 4;
            int var34 = var4 + var21;
            int var35 = var30 + var32;
            var3 = var35 ^ var32 << 8;
            int var36 = var32 + var34;
            var2 = var36 ^ var34 >>> 9;
            var7 = var2 + var27;
            var8 = var3 + var24;
            var9 = var8 + var34;
            this.field4014[var12] = var9;
            this.field4014[var12 + 1] = var8;
            this.field4014[var12 + 2] = var7;
            this.field4014[var12 + 3] = var6;
            this.field4014[var12 + 4] = var5;
            this.field4014[var12 + 5] = var4;
            this.field4014[var12 + 6] = var3;
            this.field4014[var12 + 7] = var2;
        }
        this.method1346(29237);
        this.field4017 = 256;
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "([I)V")
    public class205(int[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field4019[var2] = arg0[var2];
        }
        this.method1347((byte) 103);
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)V")
    public static final void method1348(int arg0) {
        int var1 = -69 / ((arg0 + 51) / 50);
        if (class175.field3528 != null) {
            class137 var2 = class175.field3528;
            synchronized (class175.field3528) {
                class175.field3528 = null;
            }
        }
        field4015++;
    }
}
