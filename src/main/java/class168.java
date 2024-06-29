import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class168 {

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "[I")
    private int[] field2535;

    @OriginalMember(owner = "client!ot", name = "l", descriptor = "[I")
    private int[] field2545;

    @OriginalMember(owner = "client!ot", name = "f", descriptor = "I")
    public static int field2539 = 0;

    @OriginalMember(owner = "client!ot", name = "m", descriptor = "Ljp;")
    public static class55 field2546 = new class55(103, 8);

    @OriginalMember(owner = "client!ot", name = "p", descriptor = "Ljp;")
    public static class55 field2549 = new class55(7, 2);

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "I")
    private int field2534;

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!ot", name = "d", descriptor = "I")
    private int field2537;

    @OriginalMember(owner = "client!ot", name = "e", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!ot", name = "g", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!ot", name = "h", descriptor = "I")
    private int field2541;

    @OriginalMember(owner = "client!ot", name = "j", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!ot", name = "k", descriptor = "I")
    private int field2544;

    @OriginalMember(owner = "client!ot", name = "n", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!ot", name = "o", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!ot", name = "i", descriptor = "Lfh;")
    public static class194 field2542;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)V")
    private final void method1195(int arg0) {
        if (arg0 < 88) {
            this.field2541 = 82;
        }
        field2538++;
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
            int var70 = var65 + var68;
            int var71 = var3 + var6;
            var5 = var70 ^ var68 << 10;
            int var72 = var2 + var5;
            int var73 = var68 + var71;
            var4 = var73 ^ var71 >>> 4;
            int var74 = var4 + var61;
            int var75 = var71 + var72;
            var3 = var75 ^ var72 << 8;
            int var76 = var72 + var74;
            var8 = var3 + var64;
            var2 = var76 ^ var74 >>> 9;
            var9 = var8 + var74;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field2535[var11 + 7] + var2;
            int var38 = this.field2535[var11 + 4] + var5;
            int var39 = this.field2535[var11 + 3] + var6;
            int var40 = this.field2535[var11 + 6] + var3;
            int var41 = this.field2535[var11] + var9;
            int var42 = this.field2535[var11 + 2] + var7;
            int var43 = this.field2535[var11 + 5] + var4;
            int var44 = this.field2535[var11 + 1] + var8;
            int var45 = var41 ^ var44 << 11;
            int var46 = var39 + var45;
            int var47 = var42 + var44;
            int var48 = var47 ^ var42 >>> 2;
            int var49 = var38 + var48;
            int var50 = var42 + var46;
            int var51 = var50 ^ var46 << 8;
            int var52 = var43 + var51;
            int var53 = var46 + var49;
            var6 = var53 ^ var49 >>> 16;
            int var54 = var49 + var52;
            int var55 = var6 + var40;
            var5 = var54 ^ var52 << 10;
            int var56 = var5 + var37;
            int var57 = var52 + var55;
            var4 = var57 ^ var55 >>> 4;
            int var58 = var55 + var56;
            int var59 = var4 + var45;
            var3 = var58 ^ var56 << 8;
            int var60 = var56 + var59;
            var8 = var3 + var48;
            var2 = var60 ^ var59 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var59;
            this.field2545[var11] = var9;
            this.field2545[var11 + 1] = var8;
            this.field2545[var11 + 2] = var7;
            this.field2545[var11 + 3] = var6;
            this.field2545[var11 + 4] = var5;
            this.field2545[var11 + 5] = var4;
            this.field2545[var11 + 6] = var3;
            this.field2545[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field2545[var12 + 4] + var5;
            int var14 = this.field2545[var12 + 2] + var7;
            int var15 = this.field2545[var12 + 3] + var6;
            int var16 = this.field2545[var12] + var9;
            int var17 = this.field2545[var12 + 1] + var8;
            int var18 = this.field2545[var12 + 7] + var2;
            int var19 = this.field2545[var12 + 5] + var4;
            int var20 = this.field2545[var12 + 6] + var3;
            int var21 = var16 ^ var17 << 11;
            int var22 = var15 + var21;
            int var23 = var14 + var17;
            int var24 = var23 ^ var14 >>> 2;
            int var25 = var14 + var22;
            int var26 = var13 + var24;
            int var27 = var25 ^ var22 << 8;
            int var28 = var22 + var26;
            int var29 = var19 + var27;
            var6 = var28 ^ var26 >>> 16;
            int var30 = var26 + var29;
            int var31 = var6 + var20;
            var5 = var30 ^ var29 << 10;
            int var32 = var29 + var31;
            int var33 = var5 + var18;
            var4 = var32 ^ var31 >>> 4;
            int var34 = var31 + var33;
            int var35 = var4 + var21;
            var3 = var34 ^ var33 << 8;
            var8 = var3 + var24;
            int var36 = var33 + var35;
            var2 = var36 ^ var35 >>> 9;
            var9 = var8 + var35;
            var7 = var2 + var27;
            this.field2545[var12] = var9;
            this.field2545[var12 + 1] = var8;
            this.field2545[var12 + 2] = var7;
            this.field2545[var12 + 3] = var6;
            this.field2545[var12 + 4] = var5;
            this.field2545[var12 + 5] = var4;
            this.field2545[var12 + 6] = var3;
            this.field2545[var12 + 7] = var2;
        }
        this.method1198(true);
        this.field2544 = 256;
    }

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "(I)I")
    public final int method1196(int arg0) {
        field2540++;
        int var2 = 9 / ((arg0 + 37) / 46);
        if (this.field2544 == 0) {
            this.method1198(true);
            this.field2544 = 256;
        }
        return this.field2535[--this.field2544];
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(B)V")
    public static void method1197(byte arg0) {
        if (arg0 != 55) {
            method1200(true, null, false, -78);
        }
        field2542 = null;
        field2549 = null;
        field2546 = null;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Z)V")
    private final void method1198(boolean arg0) {
        field2547++;
        this.field2537 += ++this.field2534;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field2545[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field2541 ^= this.field2541 << 13;
                } else {
                    this.field2541 ^= this.field2541 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field2541 ^= this.field2541 << 2;
            } else {
                this.field2541 ^= this.field2541 >>> 16;
            }
            this.field2541 += this.field2545[var2 + 128 & 0xFF];
            int var4;
            this.field2545[var2] = var4 = this.field2541 + this.field2545[class307.method2028(1020, var3) >> 2] + this.field2537;
            this.field2535[var2] = this.field2537 = this.field2545[class307.method2028(var4, 261305) >> 8 >> 2] + var3;
        }
        if (!arg0) {
            this.method1196(-85);
        }
    }

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "(B)I")
    public final int method1199(byte arg0) {
        if (this.field2544 == 0) {
            this.method1198(true);
            this.field2544 = 256;
        }
        field2536++;
        if (arg0 > -25) {
            field2549 = null;
        }
        return this.field2535[this.field2544 - 1];
    }

    @OriginalMember(owner = "client!ot", name = "<init>", descriptor = "()V")
    private class168() {
    }

    @OriginalMember(owner = "client!ot", name = "<init>", descriptor = "([I)V")
    public class168(int[] arg0) {
        this.field2535 = new int[256];
        this.field2545 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field2535[var2] = arg0[var2];
        }
        this.method1195(109);
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(ZLjava/lang/String;ZI)I")
    public static final int method1200(boolean arg0, String arg1, boolean arg2, int arg3) {
        field2543++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        boolean var4 = false;
        boolean var5 = arg0;
        int var6 = 0;
        int var7 = arg1.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg1.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg2) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (arg3 <= var11) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg3 * var6 + var11;
            if ((var10 / arg3) != var6) {
                throw new NumberFormatException();
            }
            var5 = true;
            var6 = var10;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }
}
