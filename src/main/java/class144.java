import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class144 {

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "[I")
    private int[] field2334;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "[I")
    private int[] field2335;

    @OriginalMember(owner = "client!lf", name = "p", descriptor = "Lsc;")
    private static class181 field2345 = class149.method967(255, " from your ignore list first)3");

    @OriginalMember(owner = "client!lf", name = "q", descriptor = "Lsc;")
    public static class181 field2346 = field2345;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "Lvb;")
    public static class247 field2333 = new class247();

    @OriginalMember(owner = "client!lf", name = "t", descriptor = "[I")
    public static int[] field2349 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!lf", name = "s", descriptor = "I")
    public static int field2348 = 0;

    @OriginalMember(owner = "client!lf", name = "u", descriptor = "Lsc;")
    public static class181 field2350 = class149.method967(255, "Fps:");

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    private int field2331;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    private int field2332;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "I")
    private int field2339;

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "I")
    private int field2340;

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!lf", name = "r", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
    public static void method925(int arg0) {
        field2350 = null;
        field2345 = null;
        field2333 = null;
        field2346 = null;
        if (arg0 == 8) {
            field2349 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)I")
    public final int method926(int arg0) {
        if (arg0 != 171) {
            this.field2335 = null;
        }
        field2344++;
        if ((this.field2332--) == 0) {
            this.method929((byte) 19);
            this.field2332 = 255;
        }
        return this.field2334[this.field2332];
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIII)Z")
    public static final boolean method927(int arg0, int arg1, int arg2, int arg3) {
        if (class5.method42(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class222.method1473(var4 + 1, class31.field505[arg0][arg1][arg2] + arg3, var5 + 1) && class222.method1473(var4 + 128 - 1, class31.field505[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class222.method1473(var4 + 128 - 1, class31.field505[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class222.method1473(var4 + 1, class31.field505[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)V")
    private final void method928(int arg0) {
        field2336++;
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
            int var65 = var5 + var64;
            int var66 = var7 + var63;
            int var67 = var66 ^ var63 << 8;
            int var68 = var4 + var67;
            int var69 = var63 + var65;
            var6 = var69 ^ var65 >>> 16;
            int var70 = var3 + var6;
            int var71 = var65 + var68;
            var5 = var71 ^ var68 << 10;
            int var72 = var2 + var5;
            int var73 = var68 + var70;
            var4 = var73 ^ var70 >>> 4;
            int var74 = var4 + var61;
            int var75 = var70 + var72;
            var3 = var75 ^ var72 << 8;
            int var76 = var72 + var74;
            var2 = var76 ^ var74 >>> 9;
            var8 = var3 + var64;
            var7 = var2 + var67;
            var9 = var8 + var74;
        }
        int var11 = 0;
        if (arg0 != -945294774) {
            method931(121, -37, -65, -127);
        }
        while (var11 < 256) {
            int var37 = this.field2334[var11 + 3] + var6;
            int var38 = this.field2334[var11 + 4] + var5;
            int var39 = this.field2334[var11 + 5] + var4;
            int var40 = this.field2334[var11 + 6] + var3;
            int var41 = this.field2334[var11 + 7] + var2;
            int var42 = this.field2334[var11 + 2] + var7;
            int var43 = this.field2334[var11 + 1] + var8;
            int var44 = this.field2334[var11] + var9;
            int var45 = var44 ^ var43 << 11;
            int var46 = var42 + var43;
            int var47 = var46 ^ var42 >>> 2;
            int var48 = var37 + var45;
            int var49 = var42 + var48;
            int var50 = var38 + var47;
            int var51 = var49 ^ var48 << 8;
            int var52 = var39 + var51;
            int var53 = var48 + var50;
            var6 = var53 ^ var50 >>> 16;
            int var54 = var50 + var52;
            var5 = var54 ^ var52 << 10;
            int var55 = var6 + var40;
            int var56 = var5 + var41;
            int var57 = var52 + var55;
            var4 = var57 ^ var55 >>> 4;
            int var58 = var55 + var56;
            var3 = var58 ^ var56 << 8;
            var8 = var3 + var47;
            int var59 = var4 + var45;
            int var60 = var56 + var59;
            var2 = var60 ^ var59 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var59;
            this.field2335[var11] = var9;
            this.field2335[var11 + 1] = var8;
            this.field2335[var11 + 2] = var7;
            this.field2335[var11 + 3] = var6;
            this.field2335[var11 + 4] = var5;
            this.field2335[var11 + 5] = var4;
            this.field2335[var11 + 6] = var3;
            this.field2335[var11 + 7] = var2;
            var11 += 8;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field2335[var12 + 4] + var5;
            int var14 = this.field2335[var12] + var9;
            int var15 = this.field2335[var12 + 2] + var7;
            int var16 = this.field2335[var12 + 3] + var6;
            int var17 = this.field2335[var12 + 5] + var4;
            int var18 = this.field2335[var12 + 6] + var3;
            int var19 = this.field2335[var12 + 1] + var8;
            int var20 = this.field2335[var12 + 7] + var2;
            int var21 = var14 ^ var19 << 11;
            int var22 = var15 + var19;
            int var23 = var22 ^ var15 >>> 2;
            int var24 = var16 + var21;
            int var25 = var15 + var24;
            int var26 = var13 + var23;
            int var27 = var25 ^ var24 << 8;
            int var28 = var17 + var27;
            int var29 = var24 + var26;
            var6 = var29 ^ var26 >>> 16;
            int var30 = var6 + var18;
            int var31 = var26 + var28;
            var5 = var31 ^ var28 << 10;
            int var32 = var28 + var30;
            var4 = var32 ^ var30 >>> 4;
            int var33 = var5 + var20;
            int var34 = var30 + var33;
            var3 = var34 ^ var33 << 8;
            var8 = var3 + var23;
            int var35 = var4 + var21;
            int var36 = var33 + var35;
            var2 = var36 ^ var35 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var35;
            this.field2335[var12] = var9;
            this.field2335[var12 + 1] = var8;
            this.field2335[var12 + 2] = var7;
            this.field2335[var12 + 3] = var6;
            this.field2335[var12 + 4] = var5;
            this.field2335[var12 + 5] = var4;
            this.field2335[var12 + 6] = var3;
            this.field2335[var12 + 7] = var2;
        }
        this.method929((byte) 19);
        this.field2332 = 256;
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V")
    private class144() {
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "([I)V")
    public class144(int[] arg0) {
        this.field2334 = new int[256];
        this.field2335 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field2334[var2] = arg0[var2];
        }
        this.method928(-945294774);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V")
    private final void method929(byte arg0) {
        field2338++;
        this.field2331 += ++this.field2340;
        if (arg0 != 19) {
            this.field2332 = 120;
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field2335[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field2339 ^= this.field2339 << 13;
                } else {
                    this.field2339 ^= this.field2339 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field2339 ^= this.field2339 << 2;
            } else {
                this.field2339 ^= this.field2339 >>> 16;
            }
            this.field2339 += this.field2335[var2 + 128 & 0xFF];
            int var4;
            this.field2335[var2] = var4 = this.field2339 + this.field2335[class5.method43(1020, var3) >> 2] + this.field2331;
            this.field2334[var2] = this.field2331 = this.field2335[class5.method43(255, var4 >> 8 >> 2)] + var3;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIII)V")
    public static final void method930(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 >= class11.field219 && class124.field2032 >= arg2 && class23.field408 <= arg0 && arg4 <= class125.field2056) {
            if (arg6 == 1) {
                class80.method557((byte) 73, arg0, arg5, arg2, arg1, arg4);
            } else {
                class222.method1470(arg2, arg6, 125, arg4, arg1, arg5, arg0);
            }
        } else if (arg6 == 1) {
            class23.method203(arg2, (byte) -119, arg5, arg1, arg4, arg0);
        } else {
            class190.method1317(arg5, arg6, arg4, arg2, arg1, (byte) -14, arg0);
        }
        field2341++;
        if (arg3 != -12858) {
            field2346 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(IIII)I")
    public static final int method931(int arg0, int arg1, int arg2, int arg3) {
        field2347++;
        int var4 = -45 / ((44 - arg0) / 49);
        if (arg2 > arg3) {
            return arg2;
        } else if (arg3 <= arg1) {
            return arg3;
        } else {
            return arg1;
        }
    }
}
