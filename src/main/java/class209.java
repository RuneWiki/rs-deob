import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class209 {

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "[I")
    private int[] field3335;

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "[I")
    private int[] field3341;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "Lvh;")
    public static class212 field3332 = new class212(4096);

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "Luj;")
    public static class156 field3342 = new class156();

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "Lck;")
    public static class119 field3345 = class298.method1987((byte) 31, "mapflag");

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "Lck;")
    private static class119 field3344 = class298.method1987((byte) 107, "Drop");

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "Lck;")
    public static class119 field3343 = field3344;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    private int field3331;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    private int field3334;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
    private int field3336;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "I")
    private int field3340;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V", line = 11)
    private final void method1310(int arg0) {
        this.field3336 += ++this.field3334;
        field3339++;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field3335[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field3340 ^= this.field3340 << 13;
                } else {
                    this.field3340 ^= this.field3340 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field3340 ^= this.field3340 << 2;
            } else {
                this.field3340 ^= this.field3340 >>> 16;
            }
            this.field3340 += this.field3335[var2 + 128 & 0xFF];
            int var4;
            this.field3335[var2] = var4 = this.field3335[class19.method151(var3, 1020) >> 2] + this.field3340 + this.field3336;
            this.field3341[var2] = this.field3336 = var3 + this.field3335[class19.method151(255, var4 >> 8 >> 2)];
        }
        if (arg0 != -2122856565) {
            this.method1310(78);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIII)V", line = 54)
    public static final void method1311(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3330++;
        if (arg1 >= arg4) {
            for (int var5 = arg4; var5 < arg1; var5++) {
                class256.field4113[var5][arg0] = arg2;
            }
        } else {
            for (int var6 = arg1; var6 < arg4; var6++) {
                class256.field4113[var6][arg0] = arg2;
            }
        }
        if (arg3 <= 96) {
            method1312(12, 26, (byte) 18, 109, 46, -127);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIBIII)V", line = 99)
    public static final void method1312(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        if (class236.field3800 >= arg0 && arg4 >= class108.field1650) {
            boolean var6;
            if (arg5 < class79.field1226) {
                arg5 = class79.field1226;
                var6 = false;
            } else if (arg5 > class59.field957) {
                var6 = false;
                arg5 = class59.field957;
            } else {
                var6 = true;
            }
            boolean var7;
            if (class79.field1226 > arg3) {
                var7 = false;
                arg3 = class79.field1226;
            } else if (arg3 <= class59.field957) {
                var7 = true;
            } else {
                var7 = false;
                arg3 = class59.field957;
            }
            if (arg0 >= class108.field1650) {
                class36.method282(arg3, arg5, arg1, class256.field4113[arg0++], 26175);
            } else {
                arg0 = class108.field1650;
            }
            if (arg4 <= class236.field3800) {
                class36.method282(arg3, arg5, arg1, class256.field4113[arg4--], arg2 + 26235);
            } else {
                arg4 = class236.field3800;
            }
            if (var6 && var7) {
                for (int var8 = arg0; var8 <= arg4; var8++) {
                    int[] var9 = class256.field4113[var8];
                    var9[arg5] = var9[arg3] = arg1;
                }
            } else if (var6) {
                for (int var10 = arg0; var10 <= arg4; var10++) {
                    class256.field4113[var10][arg5] = arg1;
                }
            } else if (var7) {
                for (int var11 = arg0; var11 <= arg4; var11++) {
                    class256.field4113[var11][arg3] = arg1;
                }
            }
        }
        field3337++;
        if (arg2 != -60) {
            field3343 = (class119) null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V", line = 213)
    public static void method1313(int arg0) {
        field3332 = null;
        field3344 = null;
        if (arg0 != 6) {
            method1312(47, -76, (byte) -32, -4, -3, -10);
        }
        field3345 = null;
        field3343 = null;
        field3342 = null;
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)I", line = 234)
    public final int method1314(int arg0) {
        if (this.field3331-- == 0) {
            this.method1310(-2122856565);
            this.field3331 = 255;
        }
        field3333++;
        if (arg0 != 7) {
            this.method1315((byte) 17);
        }
        return this.field3341[this.field3331];
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V", line = 260)
    private final void method1315(byte arg0) {
        field3338++;
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
            int var17 = var5 + var14;
            int var18 = var4 + var16;
            int var19 = var12 + var17;
            var6 = var19 ^ var17 >>> 16;
            int var20 = var3 + var6;
            int var21 = var17 + var18;
            var5 = var21 ^ var18 << 10;
            int var22 = var2 + var5;
            int var23 = var18 + var20;
            var4 = var23 ^ var20 >>> 4;
            int var24 = var4 + var11;
            int var25 = var20 + var22;
            var3 = var25 ^ var22 << 8;
            var8 = var3 + var14;
            int var26 = var22 + var24;
            var2 = var26 ^ var24 >>> 9;
            var7 = var2 + var16;
            var9 = var8 + var24;
        }
        for (int var27 = 0; var27 < 256; var27 += 8) {
            int var28 = this.field3341[var27 + 7] + var2;
            int var29 = this.field3341[var27 + 3] + var6;
            int var30 = this.field3341[var27 + 2] + var7;
            int var31 = this.field3341[var27 + 1] + var8;
            int var32 = this.field3341[var27 + 4] + var5;
            int var33 = this.field3341[var27] + var9;
            int var34 = var33 ^ var31 << 11;
            int var35 = this.field3341[var27 + 5] + var4;
            int var36 = var29 + var34;
            int var37 = this.field3341[var27 + 6] + var3;
            int var38 = var30 + var31;
            int var39 = var38 ^ var30 >>> 2;
            int var40 = var32 + var39;
            int var41 = var30 + var36;
            int var42 = var41 ^ var36 << 8;
            int var43 = var35 + var42;
            int var44 = var36 + var40;
            var6 = var44 ^ var40 >>> 16;
            int var45 = var6 + var37;
            int var46 = var40 + var43;
            var5 = var46 ^ var43 << 10;
            int var47 = var43 + var45;
            var4 = var47 ^ var45 >>> 4;
            int var48 = var5 + var28;
            int var49 = var4 + var34;
            int var50 = var45 + var48;
            var3 = var50 ^ var48 << 8;
            int var51 = var48 + var49;
            var2 = var51 ^ var49 >>> 9;
            var8 = var3 + var39;
            var7 = var2 + var42;
            var9 = var8 + var49;
            this.field3335[var27] = var9;
            this.field3335[var27 + 1] = var8;
            this.field3335[var27 + 2] = var7;
            this.field3335[var27 + 3] = var6;
            this.field3335[var27 + 4] = var5;
            this.field3335[var27 + 5] = var4;
            this.field3335[var27 + 6] = var3;
            this.field3335[var27 + 7] = var2;
        }
        for (int var52 = 0; var52 < 256; var52 += 8) {
            int var53 = this.field3335[var52 + 5] + var4;
            int var54 = this.field3335[var52 + 3] + var6;
            int var55 = this.field3335[var52 + 4] + var5;
            int var56 = this.field3335[var52 + 7] + var2;
            int var57 = this.field3335[var52 + 6] + var3;
            int var58 = this.field3335[var52 + 1] + var8;
            int var59 = this.field3335[var52 + 2] + var7;
            int var60 = this.field3335[var52] + var9;
            int var61 = var60 ^ var58 << 11;
            int var62 = var58 + var59;
            int var63 = var54 + var61;
            int var64 = var62 ^ var59 >>> 2;
            int var65 = var55 + var64;
            int var66 = var59 + var63;
            int var67 = var66 ^ var63 << 8;
            int var68 = var53 + var67;
            int var69 = var63 + var65;
            var6 = var69 ^ var65 >>> 16;
            int var70 = var6 + var57;
            int var71 = var65 + var68;
            var5 = var71 ^ var68 << 10;
            int var72 = var5 + var56;
            int var73 = var68 + var70;
            var4 = var73 ^ var70 >>> 4;
            int var74 = var4 + var61;
            int var75 = var70 + var72;
            var3 = var75 ^ var72 << 8;
            int var76 = var72 + var74;
            var8 = var3 + var64;
            var2 = var76 ^ var74 >>> 9;
            var9 = var8 + var74;
            var7 = var2 + var67;
            this.field3335[var52] = var9;
            this.field3335[var52 + 1] = var8;
            this.field3335[var52 + 2] = var7;
            this.field3335[var52 + 3] = var6;
            this.field3335[var52 + 4] = var5;
            this.field3335[var52 + 5] = var4;
            this.field3335[var52 + 6] = var3;
            this.field3335[var52 + 7] = var2;
        }
        this.method1310(-2122856565);
        this.field3331 = 256;
        int var77 = -17 % ((arg0 - 8) / 35);
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V", line = 405)
    private class209() {
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "([I)V", line = 410)
    public class209(int[] arg0) {
        this.field3335 = new int[256];
        this.field3341 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field3341[var2] = arg0[var2];
        }
        this.method1315((byte) -59);
    }
}
