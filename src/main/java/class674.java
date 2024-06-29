import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public class class674 {

    @OriginalMember(owner = "client!lw", name = "o", descriptor = "[I")
    private int[] field9387;

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "[I")
    private int[] field9373;

    @OriginalMember(owner = "client!lw", name = "k", descriptor = "I")
    public static int field9383 = 1403;

    @OriginalMember(owner = "client!lw", name = "i", descriptor = "Lcq;")
    public static class110 field9381 = new class110(37, 1);

    @OriginalMember(owner = "client!lw", name = "t", descriptor = "Z")
    public static boolean field9392 = false;

    @OriginalMember(owner = "client!lw", name = "u", descriptor = "[I")
    public static int[] field9393 = new int[] { 25000, 2000 };

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "I")
    public static int field9374;

    @OriginalMember(owner = "client!lw", name = "c", descriptor = "I")
    public static int field9375;

    @OriginalMember(owner = "client!lw", name = "d", descriptor = "I")
    public static int field9376;

    @OriginalMember(owner = "client!lw", name = "e", descriptor = "I")
    public static int field9377;

    @OriginalMember(owner = "client!lw", name = "g", descriptor = "I")
    private int field9379;

    @OriginalMember(owner = "client!lw", name = "h", descriptor = "I")
    private int field9380;

    @OriginalMember(owner = "client!lw", name = "j", descriptor = "I")
    public static int field9382;

    @OriginalMember(owner = "client!lw", name = "l", descriptor = "I")
    private int field9384;

    @OriginalMember(owner = "client!lw", name = "m", descriptor = "I")
    public static int field9385;

    @OriginalMember(owner = "client!lw", name = "n", descriptor = "I")
    public static int field9386;

    @OriginalMember(owner = "client!lw", name = "p", descriptor = "I")
    public static int field9388;

    @OriginalMember(owner = "client!lw", name = "q", descriptor = "I")
    private int field9389;

    @OriginalMember(owner = "client!lw", name = "r", descriptor = "I")
    public static int field9390;

    @OriginalMember(owner = "client!lw", name = "s", descriptor = "I")
    public static int field9391;

    @OriginalMember(owner = "client!lw", name = "f", descriptor = "Lf;")
    public static class534 field9378;

    @OriginalMember(owner = "client!lw", name = "v", descriptor = "[Lgu;")
    public static class130[] field9394;

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(Z)I", line = 9)
    public final int method3718(boolean arg0) {
        if (this.field9379 == 0) {
            this.method3719(15689);
            this.field9379 = 256;
        }
        field9375++;
        if (!arg0) {
            this.field9389 = -29;
        }
        return this.field9387[--this.field9379];
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(I)V", line = 32)
    private final void method3719(int arg0) {
        field9388++;
        this.field9380 += ++this.field9384;
        if (arg0 != 15689) {
            return;
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field9373[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field9389 ^= this.field9389 << 13;
                } else {
                    this.field9389 ^= this.field9389 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field9389 ^= this.field9389 << 2;
            } else {
                this.field9389 ^= this.field9389 >>> 16;
            }
            this.field9389 += this.field9373[var2 + 128 & 0xFF];
            int var4;
            this.field9373[var2] = var4 = this.field9389 + this.field9373[class105.method572(255, var3 >> 2)] + this.field9380;
            this.field9387[var2] = this.field9380 = var3 + this.field9373[class105.method572(var4 >> 8 >> 2, 255)];
        }
    }

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "(I)I", line = 75)
    public final int method3720(int arg0) {
        field9376++;
        if (~this.field9379 == arg0) {
            this.method3719(15689);
            this.field9379 = 256;
        }
        return this.field9387[this.field9379 - 1];
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(III)Z", line = 93)
    public static final boolean method3721(int arg0, int arg1, int arg2) {
        field9382++;
        if (arg0 != 1457751848) {
            method3721(74, 96, 23);
        }
        return class490.method2841(arg1, arg2, 71) & (class575.method3253(arg2, arg1, (byte) 127) | (arg2 & 0x2000) != 0 | class404.method2268(-44, arg1, arg2));
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(IIB)Z", line = 107)
    public static final boolean method3722(int arg0, int arg1, byte arg2) {
        field9385++;
        if (arg2 != -34) {
            method3722(16, -10, (byte) -48);
        }
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(B)V", line = 119)
    public static void method3723(byte arg0) {
        field9394 = null;
        field9393 = null;
        field9381 = null;
        field9378 = null;
        if (arg0 <= 78) {
            field9392 = false;
        }
    }

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "(B)V", line = 133)
    public static final void method3724(byte arg0) {
        class445.field6273 = -1;
        if (arg0 != -30) {
            return;
        }
        class533.field7494 = 1;
        field9390++;
        long var1 = 0L;
        if (class463.field6589 == null) {
            class123.method707(35, -4);
        } else {
            class115 var3 = new class115(class446.method2586(true, class507.method2902(false, class463.field6589)));
            long var4 = var3.method671(arg0 + 30);
            class357.field4791 = var3.method671(0);
            class483.method2795(19326, true, class645.method3614(arg0 + 128, var4), "");
        }
    }

    @OriginalMember(owner = "client!lw", name = "<init>", descriptor = "()V", line = 165)
    private class674() {
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(BLjava/lang/String;ILjava/lang/String;)I", line = 168)
    public static final int method3725(byte arg0, String arg1, int arg2, String arg3) {
        field9374++;
        int var4 = arg1.length();
        int var5 = arg3.length();
        int var6 = 0;
        if (arg0 != 64) {
            return -6;
        }
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (var4 > var6 - var8 || var7 - var9 < var5) {
            if (var4 <= var6 - var8) {
                return -1;
            }
            if ((var7 - var9) >= var5) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg1.charAt(var6++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg3.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class355.method2096(var22, (byte) -119);
            var9 = class355.method2096(var24, (byte) -128);
            char var26 = class248.method1462(arg2, var22, -14799);
            char var27 = class248.method1462(arg2, var24, -14799);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class419.method2350((byte) 73, arg2, var28) - class419.method2350((byte) 73, arg2, var29);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg2 == 2) {
                var16 = var5 - var11 - 1;
                var17 = var4 - var11 - 1;
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg1.charAt(var17);
            char var19 = arg3.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class419.method2350((byte) 73, arg2, var20) - class419.method2350((byte) 73, arg2, var21);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg1.charAt(var13);
            char var15 = arg3.charAt(var13);
            if (var14 != var15) {
                return class419.method2350((byte) 73, arg2, var14) - class419.method2350((byte) 73, arg2, var15);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!lw", name = "<init>", descriptor = "([I)V", line = 290)
    public class674(int[] arg0) {
        this.field9387 = new int[256];
        this.field9373 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field9387[var2] = arg0[var2];
        }
        this.method3726((byte) -121);
    }

    @OriginalMember(owner = "client!lw", name = "c", descriptor = "(B)V", line = 319)
    private final void method3726(byte arg0) {
        field9386++;
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
            int var72 = var2 + var5;
            int var73 = var69 + var71;
            var4 = var73 ^ var71 >>> 4;
            int var74 = var71 + var72;
            int var75 = var4 + var61;
            var3 = var74 ^ var72 << 8;
            int var76 = var72 + var75;
            var8 = var3 + var64;
            var2 = var76 ^ var75 >>> 9;
            var9 = var8 + var75;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field9387[var11 + 2] + var7;
            int var38 = this.field9387[var11 + 4] + var5;
            int var39 = this.field9387[var11 + 1] + var8;
            int var40 = this.field9387[var11 + 6] + var3;
            int var41 = this.field9387[var11 + 7] + var2;
            int var42 = this.field9387[var11] + var9;
            int var43 = this.field9387[var11 + 3] + var6;
            int var44 = this.field9387[var11 + 5] + var4;
            int var45 = var42 ^ var39 << 11;
            int var46 = var37 + var39;
            int var47 = var43 + var45;
            int var48 = var46 ^ var37 >>> 2;
            int var49 = var37 + var47;
            int var50 = var38 + var48;
            int var51 = var49 ^ var47 << 8;
            int var52 = var44 + var51;
            int var53 = var47 + var50;
            var6 = var53 ^ var50 >>> 16;
            int var54 = var6 + var40;
            int var55 = var50 + var52;
            var5 = var55 ^ var52 << 10;
            int var56 = var52 + var54;
            int var57 = var5 + var41;
            var4 = var56 ^ var54 >>> 4;
            int var58 = var4 + var45;
            int var59 = var54 + var57;
            var3 = var59 ^ var57 << 8;
            int var60 = var57 + var58;
            var8 = var3 + var48;
            var2 = var60 ^ var58 >>> 9;
            var9 = var8 + var58;
            var7 = var2 + var51;
            this.field9373[var11] = var9;
            this.field9373[var11 + 1] = var8;
            this.field9373[var11 + 2] = var7;
            this.field9373[var11 + 3] = var6;
            this.field9373[var11 + 4] = var5;
            this.field9373[var11 + 5] = var4;
            this.field9373[var11 + 6] = var3;
            this.field9373[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field9373[var12 + 7] + var2;
            int var14 = this.field9373[var12 + 5] + var4;
            int var15 = this.field9373[var12 + 1] + var8;
            int var16 = this.field9373[var12] + var9;
            int var17 = this.field9373[var12 + 6] + var3;
            int var18 = this.field9373[var12 + 4] + var5;
            int var19 = this.field9373[var12 + 2] + var7;
            int var20 = this.field9373[var12 + 3] + var6;
            int var21 = var16 ^ var15 << 11;
            int var22 = var15 + var19;
            int var23 = var20 + var21;
            int var24 = var22 ^ var19 >>> 2;
            int var25 = var18 + var24;
            int var26 = var19 + var23;
            int var27 = var26 ^ var23 << 8;
            int var28 = var14 + var27;
            int var29 = var23 + var25;
            var6 = var29 ^ var25 >>> 16;
            int var30 = var6 + var17;
            int var31 = var25 + var28;
            var5 = var31 ^ var28 << 10;
            int var32 = var5 + var13;
            int var33 = var28 + var30;
            var4 = var33 ^ var30 >>> 4;
            int var34 = var4 + var21;
            int var35 = var30 + var32;
            var3 = var35 ^ var32 << 8;
            var8 = var3 + var24;
            int var36 = var32 + var34;
            var2 = var36 ^ var34 >>> 9;
            var9 = var8 + var34;
            var7 = var2 + var27;
            this.field9373[var12] = var9;
            this.field9373[var12 + 1] = var8;
            this.field9373[var12 + 2] = var7;
            this.field9373[var12 + 3] = var6;
            this.field9373[var12 + 4] = var5;
            this.field9373[var12 + 5] = var4;
            this.field9373[var12 + 6] = var3;
            this.field9373[var12 + 7] = var2;
        }
        this.method3719(15689);
        if (arg0 > -108) {
            this.method3720(95);
        }
        this.field9379 = 256;
    }
}
