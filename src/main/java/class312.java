import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class312 {

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "[I")
    private int[] field4327;

    @OriginalMember(owner = "client!aq", name = "d", descriptor = "[I")
    private int[] field4328;

    @OriginalMember(owner = "client!aq", name = "f", descriptor = "Lkr;")
    public static class602 field4330 = new class602(120, -1);

    @OriginalMember(owner = "client!aq", name = "l", descriptor = "Z")
    public static boolean field4336 = false;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "I")
    public static int field4326;

    @OriginalMember(owner = "client!aq", name = "e", descriptor = "I")
    private int field4329;

    @OriginalMember(owner = "client!aq", name = "g", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!aq", name = "h", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!aq", name = "i", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!aq", name = "j", descriptor = "I")
    private int field4334;

    @OriginalMember(owner = "client!aq", name = "k", descriptor = "I")
    private int field4335;

    @OriginalMember(owner = "client!aq", name = "m", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!aq", name = "n", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!aq", name = "o", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!aq", name = "q", descriptor = "I")
    private int field4341;

    @OriginalMember(owner = "client!aq", name = "p", descriptor = "[Lrk;")
    public static class201[] field4340;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Z)V", line = 3)
    private final void method2041(boolean arg0) {
        if (arg0) {
            this.method2044((byte) 33);
        }
        field4332++;
        this.field4334 += ++this.field4335;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field4327[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field4329 ^= this.field4329 << 13;
                } else {
                    this.field4329 ^= this.field4329 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field4329 ^= this.field4329 << 2;
            } else {
                this.field4329 ^= this.field4329 >>> 16;
            }
            this.field4329 += this.field4327[var2 + 128 & 0xFF];
            int var4;
            this.field4327[var2] = var4 = this.field4327[class665.method3759(255, var3 >> 2)] + this.field4334 + this.field4329;
            this.field4328[var2] = this.field4334 = var3 + this.field4327[class665.method3759(261361, var4) >> 8 >> 2];
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(B)I", line = 47)
    public final int method2042(byte arg0) {
        if (this.field4341 == 0) {
            this.method2041(false);
            this.field4341 = 256;
        }
        if (arg0 > -54) {
            method2043((byte) 123);
        }
        field4331++;
        return this.field4328[this.field4341 - 1];
    }

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "(B)V", line = 64)
    public static void method2043(byte arg0) {
        if (arg0 != -127) {
            method2045(-101, -101, (byte) -110);
        }
        field4330 = null;
        field4340 = null;
    }

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "(B)I", line = 75)
    public final int method2044(byte arg0) {
        if (arg0 != -49) {
            return 80;
        }
        if (this.field4341 == 0) {
            this.method2041(false);
            this.field4341 = 256;
        }
        field4333++;
        return this.field4328[--this.field4341];
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIB)Z", line = 98)
    public static final boolean method2045(int arg0, int arg1, byte arg2) {
        field4325++;
        if (arg0 >= 1000 && arg1 < 1000) {
            return true;
        } else if (arg2 != -110) {
            return false;
        } else if (arg0 >= 1000 || arg1 >= 1000) {
            return arg0 >= 1000 && arg1 >= 1000;
        } else if (class677.method3813(arg1, -658934376)) {
            return true;
        } else {
            return !class677.method3813(arg0, arg2 ^ 0x27468A0A);
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 137)
    public static final String method2046(int arg0, long arg1) {
        field4326++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % (long) arg0) == 0L) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                var6.append(class507.field7039[(int) (var7 - (arg1 * 37L))]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!aq", name = "d", descriptor = "(B)V", line = 185)
    private final void method2047(byte arg0) {
        field4337++;
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
            int var68 = var4 + var67;
            int var69 = var62 + var66;
            var6 = var69 ^ var66 >>> 16;
            int var70 = var66 + var68;
            int var71 = var3 + var6;
            var5 = var70 ^ var68 << 10;
            int var72 = var2 + var5;
            int var73 = var68 + var71;
            var4 = var73 ^ var71 >>> 4;
            int var74 = var71 + var72;
            int var75 = var4 + var61;
            var3 = var74 ^ var72 << 8;
            var8 = var3 + var64;
            int var76 = var72 + var75;
            var2 = var76 ^ var75 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var75;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field4328[var11 + 7] + var2;
            int var38 = this.field4328[var11] + var9;
            int var39 = this.field4328[var11 + 6] + var3;
            int var40 = this.field4328[var11 + 1] + var8;
            int var41 = this.field4328[var11 + 3] + var6;
            int var42 = this.field4328[var11 + 5] + var4;
            int var43 = this.field4328[var11 + 2] + var7;
            int var44 = this.field4328[var11 + 4] + var5;
            int var45 = var38 ^ var40 << 11;
            int var46 = var41 + var45;
            int var47 = var40 + var43;
            int var48 = var47 ^ var43 >>> 2;
            int var49 = var44 + var48;
            int var50 = var43 + var46;
            int var51 = var50 ^ var46 << 8;
            int var52 = var46 + var49;
            int var53 = var42 + var51;
            var6 = var52 ^ var49 >>> 16;
            int var54 = var6 + var39;
            int var55 = var49 + var53;
            var5 = var55 ^ var53 << 10;
            int var56 = var5 + var37;
            int var57 = var53 + var54;
            var4 = var57 ^ var54 >>> 4;
            int var58 = var54 + var56;
            int var59 = var4 + var45;
            var3 = var58 ^ var56 << 8;
            int var60 = var56 + var59;
            var8 = var3 + var48;
            var2 = var60 ^ var59 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var59;
            this.field4327[var11] = var9;
            this.field4327[var11 + 1] = var8;
            this.field4327[var11 + 2] = var7;
            this.field4327[var11 + 3] = var6;
            this.field4327[var11 + 4] = var5;
            this.field4327[var11 + 5] = var4;
            this.field4327[var11 + 6] = var3;
            this.field4327[var11 + 7] = var2;
        }
        if (arg0 != 25) {
            this.field4341 = -5;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field4327[var12 + 1] + var8;
            int var14 = this.field4327[var12] + var9;
            int var15 = this.field4327[var12 + 7] + var2;
            int var16 = this.field4327[var12 + 5] + var4;
            int var17 = this.field4327[var12 + 6] + var3;
            int var18 = this.field4327[var12 + 4] + var5;
            int var19 = this.field4327[var12 + 3] + var6;
            int var20 = this.field4327[var12 + 2] + var7;
            int var21 = var14 ^ var13 << 11;
            int var22 = var19 + var21;
            int var23 = var13 + var20;
            int var24 = var23 ^ var20 >>> 2;
            int var25 = var18 + var24;
            int var26 = var20 + var22;
            int var27 = var26 ^ var22 << 8;
            int var28 = var16 + var27;
            int var29 = var22 + var25;
            var6 = var29 ^ var25 >>> 16;
            int var30 = var25 + var28;
            int var31 = var6 + var17;
            var5 = var30 ^ var28 << 10;
            int var32 = var5 + var15;
            int var33 = var28 + var31;
            var4 = var33 ^ var31 >>> 4;
            int var34 = var4 + var21;
            int var35 = var31 + var32;
            var3 = var35 ^ var32 << 8;
            int var36 = var32 + var34;
            var8 = var3 + var24;
            var2 = var36 ^ var34 >>> 9;
            var9 = var8 + var34;
            var7 = var2 + var27;
            this.field4327[var12] = var9;
            this.field4327[var12 + 1] = var8;
            this.field4327[var12 + 2] = var7;
            this.field4327[var12 + 3] = var6;
            this.field4327[var12 + 4] = var5;
            this.field4327[var12 + 5] = var4;
            this.field4327[var12 + 6] = var3;
            this.field4327[var12 + 7] = var2;
        }
        this.method2041(false);
        this.field4341 = 256;
    }

    @OriginalMember(owner = "client!aq", name = "<init>", descriptor = "()V", line = 332)
    private class312() {
    }

    @OriginalMember(owner = "client!aq", name = "<init>", descriptor = "([I)V", line = 334)
    public class312(int[] arg0) {
        this.field4327 = new int[256];
        this.field4328 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field4328[var2] = arg0[var2];
        }
        this.method2047((byte) 25);
    }
}
