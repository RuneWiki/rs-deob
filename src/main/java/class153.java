import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class153 {

    @OriginalMember(owner = "client!w", name = "D", descriptor = "[I")
    private int[] field3449 = new int[256];

    @OriginalMember(owner = "client!w", name = "o", descriptor = "[I")
    private int[] field3434 = new int[256];

    @OriginalMember(owner = "client!w", name = "h", descriptor = "[S")
    public static short[] field3427 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!w", name = "p", descriptor = "Lid;")
    private static class60 field3435 = class11.method72("Prepared visibility map", (byte) -85);

    @OriginalMember(owner = "client!w", name = "j", descriptor = "Lid;")
    private static class60 field3429 = class11.method72("Examine", (byte) -125);

    @OriginalMember(owner = "client!w", name = "k", descriptor = "Lid;")
    public static class60 field3430 = class11.method72("Wordpack geladen)3", (byte) 104);

    @OriginalMember(owner = "client!w", name = "r", descriptor = "Lid;")
    private static class60 field3437 = class11.method72("Loaded config", (byte) -110);

    @OriginalMember(owner = "client!w", name = "u", descriptor = "[I")
    public static int[] field3440 = new int[5];

    @OriginalMember(owner = "client!w", name = "y", descriptor = "Lid;")
    public static class60 field3444 = class11.method72("headicons_pk", (byte) 124);

    @OriginalMember(owner = "client!w", name = "n", descriptor = "Lid;")
    public static class60 field3433 = field3437;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "I")
    public static int field3423 = 0;

    @OriginalMember(owner = "client!w", name = "E", descriptor = "Lid;")
    public static class60 field3450 = field3429;

    @OriginalMember(owner = "client!w", name = "C", descriptor = "I")
    public static int field3448 = 0;

    @OriginalMember(owner = "client!w", name = "s", descriptor = "Lid;")
    public static class60 field3438 = field3435;

    @OriginalMember(owner = "client!w", name = "F", descriptor = "J")
    public static volatile long field3451 = 0L;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    private int field3420;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!w", name = "q", descriptor = "I")
    private int field3436;

    @OriginalMember(owner = "client!w", name = "t", descriptor = "I")
    private int field3439;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "I")
    private int field3441;

    @OriginalMember(owner = "client!w", name = "w", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!w", name = "x", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!w", name = "z", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!w", name = "A", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "Lof;")
    public static class103 field3422;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "Lpa;")
    public static class105 field3428;

    @OriginalMember(owner = "client!w", name = "m", descriptor = "Lie;")
    public static class61 field3432;

    @OriginalMember(owner = "client!w", name = "B", descriptor = "Ln;")
    public static class90 field3447;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "Z")
    public static boolean field3426;

    @OriginalMember(owner = "client!w", name = "G", descriptor = "[Lid;")
    public static class60[] field3452;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)I")
    public final int method1161(int arg0) {
        field3446++;
        if (this.field3436-- == 0) {
            this.method1165(32);
            this.field3436 = 255;
        }
        int var2 = 107 / ((-arg0 - 27) / 60);
        return this.field3434[this.field3436];
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V")
    public static final void method1162(int arg0) {
        if (arg0 != 128) {
            field3430 = null;
        }
        field3442++;
        class87.field2172.method920((byte) 14);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIIB)I")
    public static final int method1163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        if ((arg5 & 0x1) == 1) {
            int var7 = arg3;
            arg3 = arg2;
            arg2 = var7;
        }
        int var8 = arg4 & 0x3;
        field3445++;
        if (var8 == 0) {
            return arg0;
        }
        if (arg6 >= -61) {
            method1164(true);
        }
        if (var8 == 1) {
            return 7 + 1 - arg1 - arg3;
        } else if (var8 == 2) {
            return 1 + 7 - arg2 - arg0;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)V")
    public static final void method1164(boolean arg0) {
        field3443++;
        while (class56.field1393.method1213(class94.field2310, (byte) 18) >= 27) {
            int var1 = class56.field1393.method1205(false, 15);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class5.field83[var1] == null) {
                class5.field83[var1] = new class53();
                var2 = true;
            }
            class53 var3 = class5.field83[var1];
            class1.field1[class72.field1748++] = var1;
            var3.field863 = class82.field2065;
            int var4 = class56.field1393.method1205(false, 5);
            int var5 = class48.field1269[class56.field1393.method1205(arg0, 3)];
            if (var2) {
                var3.field822 = var3.field864 = var5;
            }
            int var6 = class56.field1393.method1205(false, 5);
            if (var6 > 15) {
                var6 -= 32;
            }
            if (var4 > 15) {
                var4 -= 32;
            }
            int var7 = class56.field1393.method1205(arg0, 1);
            if (var7 == 1) {
                class19.field471[class35.field884++] = var1;
            }
            var3.field1337 = class73.method562(class56.field1393.method1205(false, 14), (byte) 103);
            int var8 = class56.field1393.method1205(false, 1);
            var3.field813 = var3.field1337.field3485;
            var3.field876 = var3.field1337.field3470;
            var3.field832 = var3.field1337.field3455;
            var3.field872 = var3.field1337.field3463;
            var3.field859 = var3.field1337.field3486;
            var3.field816 = var3.field1337.field3468;
            if (var3.field859 == 0) {
                var3.field864 = 0;
            }
            var3.field825 = var3.field1337.field3496;
            var3.field871 = var3.field1337.field3495;
            var3.field810 = var3.field1337.field3461;
            var3.method266(class107.field2640.field827[0] + var6, class107.field2640.field841[0] + var4, var8 == 1, -17715);
        }
        class56.field1393.method1204(arg0);
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V")
    private final void method1165(int arg0) {
        if (arg0 != 32) {
            return;
        }
        field3424++;
        this.field3420 += ++this.field3439;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field3449[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field3441 ^= this.field3441 << 13;
                } else {
                    this.field3441 ^= this.field3441 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field3441 ^= this.field3441 << 2;
            } else {
                this.field3441 ^= this.field3441 >>> 16;
            }
            this.field3441 += this.field3449[var2 + 128 & 0xFF];
            int var4;
            this.field3449[var2] = var4 = this.field3449[class80.method680(255, var3 >> 2)] + this.field3441 + this.field3420;
            this.field3434[var2] = this.field3420 = this.field3449[class80.method680(var4 >> 8 >> 2, 255)] + var3;
        }
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(I)V")
    public static void method1166(int arg0) {
        field3430 = null;
        field3432 = null;
        field3447 = null;
        field3438 = null;
        field3435 = null;
        field3427 = null;
        field3440 = null;
        field3444 = null;
        field3433 = null;
        field3450 = null;
        field3429 = null;
        field3422 = null;
        field3437 = null;
        field3452 = null;
        field3428 = null;
        if (arg0 != -66057173) {
            field3426 = true;
        }
    }

    @OriginalMember(owner = "client!w", name = "e", descriptor = "(I)V")
    private final void method1167(int arg0) {
        field3425++;
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
            int var68 = var4 + var67;
            int var69 = var62 + var65;
            var6 = var69 ^ var65 >>> 16;
            int var70 = var3 + var6;
            int var71 = var65 + var68;
            var5 = var71 ^ var68 << 10;
            int var72 = var2 + var5;
            int var73 = var68 + var70;
            var4 = var73 ^ var70 >>> 4;
            int var74 = var70 + var72;
            var3 = var74 ^ var72 << 8;
            int var75 = var4 + var61;
            var8 = var3 + var64;
            int var76 = var72 + var75;
            var2 = var76 ^ var75 >>> 9;
            var9 = var8 + var75;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field3434[var11 + 2] + var7;
            int var38 = this.field3434[var11 + 3] + var6;
            int var39 = this.field3434[var11 + 4] + var5;
            int var40 = this.field3434[var11 + 1] + var8;
            int var41 = this.field3434[var11] + var9;
            int var42 = this.field3434[var11 + 7] + var2;
            int var43 = this.field3434[var11 + 5] + var4;
            int var44 = var41 ^ var40 << 11;
            int var45 = var37 + var40;
            int var46 = var45 ^ var37 >>> 2;
            int var47 = var39 + var46;
            int var48 = var38 + var44;
            int var49 = var37 + var48;
            int var50 = var49 ^ var48 << 8;
            int var51 = var47 + var48;
            int var52 = this.field3434[var11 + 6] + var3;
            var6 = var51 ^ var47 >>> 16;
            int var53 = var43 + var50;
            int var54 = var47 + var53;
            int var55 = var6 + var52;
            var5 = var54 ^ var53 << 10;
            int var56 = var53 + var55;
            var4 = var56 ^ var55 >>> 4;
            int var57 = var5 + var42;
            int var58 = var55 + var57;
            int var59 = var4 + var44;
            var3 = var58 ^ var57 << 8;
            int var60 = var57 + var59;
            var8 = var3 + var46;
            var2 = var60 ^ var59 >>> 9;
            var7 = var2 + var50;
            var9 = var8 + var59;
            this.field3449[var11] = var9;
            this.field3449[var11 + 1] = var8;
            this.field3449[var11 + 2] = var7;
            this.field3449[var11 + 3] = var6;
            this.field3449[var11 + 4] = var5;
            this.field3449[var11 + 5] = var4;
            this.field3449[var11 + 6] = var3;
            this.field3449[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field3449[var12 + 7] + var2;
            int var14 = this.field3449[var12] + var9;
            int var15 = this.field3449[var12 + 2] + var7;
            int var16 = this.field3449[var12 + 6] + var3;
            int var17 = this.field3449[var12 + 3] + var6;
            int var18 = this.field3449[var12 + 4] + var5;
            int var19 = this.field3449[var12 + 5] + var4;
            int var20 = this.field3449[var12 + 1] + var8;
            int var21 = var14 ^ var20 << 11;
            int var22 = var17 + var21;
            int var23 = var15 + var20;
            int var24 = var23 ^ var15 >>> 2;
            int var25 = var15 + var22;
            int var26 = var25 ^ var22 << 8;
            int var27 = var19 + var26;
            int var28 = var18 + var24;
            int var29 = var22 + var28;
            var6 = var29 ^ var28 >>> 16;
            int var30 = var27 + var28;
            var5 = var30 ^ var27 << 10;
            int var31 = var5 + var13;
            int var32 = var6 + var16;
            int var33 = var27 + var32;
            var4 = var33 ^ var32 >>> 4;
            int var34 = var4 + var21;
            int var35 = var31 + var32;
            var3 = var35 ^ var31 << 8;
            int var36 = var31 + var34;
            var2 = var36 ^ var34 >>> 9;
            var7 = var2 + var26;
            var8 = var3 + var24;
            var9 = var8 + var34;
            this.field3449[var12] = var9;
            this.field3449[var12 + 1] = var8;
            this.field3449[var12 + 2] = var7;
            this.field3449[var12 + 3] = var6;
            this.field3449[var12 + 4] = var5;
            this.field3449[var12 + 5] = var4;
            this.field3449[var12 + 6] = var3;
            this.field3449[var12 + 7] = var2;
        }
        if (arg0 != 5) {
            method1166(10);
        }
        this.method1165(32);
        this.field3436 = 256;
    }

    @OriginalMember(owner = "client!w", name = "f", descriptor = "(I)V")
    public static final void method1168(int arg0) {
        class105.field2585.method920((byte) 14);
        field3431++;
        int var1 = -12 / ((64 - arg0) / 44);
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "([I)V")
    public class153(int[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field3434[var2] = arg0[var2];
        }
        this.method1167(5);
    }
}
