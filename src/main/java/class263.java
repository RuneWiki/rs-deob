import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class263 {

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "[I")
    private int[] field4072;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "[I")
    private int[] field4069;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "I")
    private int field4074;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "I")
    private int field4075;

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "I")
    private int field4076;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "I")
    private int field4078;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "[I")
    public static int[] field4071;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)Lsc;", line = 8)
    public static final class261 method1869(int arg0, int arg1) {
        field4079++;
        class261 var2 = (class261) class16.field303.method1830((long) arg0, (byte) 52);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class103.field1736.method467(arg0, 81, 1);
        class261 var4 = new class261();
        if (var3 != null) {
            var4.method1848(new class101(var3), arg1 + 832980187, arg0);
        }
        class16.field303.method1831((long) arg0, var4, -13897);
        return arg1 == -832959923 ? var4 : (class261) null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)I", line = 40)
    public final int method1870(int arg0) {
        if (arg0 != 255) {
            this.field4078 = -109;
        }
        if ((this.field4074--) == 0) {
            this.method1874((byte) 124);
            this.field4074 = 255;
        }
        field4070++;
        return this.field4069[this.field4074];
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)V", line = 61)
    private final void method1871(int arg0) {
        field4073++;
        if (arg0 != -468584757) {
            return;
        }
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
            int var12 = var7 + var8;
            int var13 = var12 ^ var7 >>> 2;
            int var14 = var5 + var13;
            int var15 = var6 + var11;
            int var16 = var7 + var15;
            int var17 = var16 ^ var15 << 8;
            int var18 = var14 + var15;
            var6 = var18 ^ var14 >>> 16;
            int var19 = var3 + var6;
            int var20 = var4 + var17;
            int var21 = var14 + var20;
            var5 = var21 ^ var20 << 10;
            int var22 = var19 + var20;
            var4 = var22 ^ var19 >>> 4;
            int var23 = var2 + var5;
            int var24 = var19 + var23;
            var3 = var24 ^ var23 << 8;
            var8 = var3 + var13;
            int var25 = var4 + var11;
            int var26 = var23 + var25;
            var2 = var26 ^ var25 >>> 9;
            var7 = var2 + var17;
            var9 = var8 + var25;
        }
        for (int var27 = 0; var27 < 256; var27 += 8) {
            int var28 = this.field4069[var27 + 5] + var4;
            int var29 = this.field4069[var27 + 7] + var2;
            int var30 = this.field4069[var27] + var9;
            int var31 = this.field4069[var27 + 1] + var8;
            int var32 = this.field4069[var27 + 3] + var6;
            int var33 = this.field4069[var27 + 2] + var7;
            int var34 = this.field4069[var27 + 4] + var5;
            int var35 = this.field4069[var27 + 6] + var3;
            int var36 = var30 ^ var31 << 11;
            int var37 = var32 + var36;
            int var38 = var31 + var33;
            int var39 = var38 ^ var33 >>> 2;
            int var40 = var34 + var39;
            int var41 = var33 + var37;
            int var42 = var41 ^ var37 << 8;
            int var43 = var37 + var40;
            var6 = var43 ^ var40 >>> 16;
            int var44 = var6 + var35;
            int var45 = var28 + var42;
            int var46 = var40 + var45;
            var5 = var46 ^ var45 << 10;
            int var47 = var5 + var29;
            int var48 = var44 + var45;
            var4 = var48 ^ var44 >>> 4;
            int var49 = var4 + var36;
            int var50 = var44 + var47;
            var3 = var50 ^ var47 << 8;
            var8 = var3 + var39;
            int var51 = var47 + var49;
            var2 = var51 ^ var49 >>> 9;
            var9 = var8 + var49;
            this.field4072[var27] = var9;
            this.field4072[var27 + 1] = var8;
            var7 = var2 + var42;
            this.field4072[var27 + 2] = var7;
            this.field4072[var27 + 3] = var6;
            this.field4072[var27 + 4] = var5;
            this.field4072[var27 + 5] = var4;
            this.field4072[var27 + 6] = var3;
            this.field4072[var27 + 7] = var2;
        }
        for (int var52 = 0; var52 < 256; var52 += 8) {
            int var53 = this.field4072[var52 + 4] + var5;
            int var54 = this.field4072[var52 + 5] + var4;
            int var55 = this.field4072[var52 + 2] + var7;
            int var56 = this.field4072[var52 + 1] + var8;
            int var57 = this.field4072[var52 + 7] + var2;
            int var58 = this.field4072[var52 + 3] + var6;
            int var59 = this.field4072[var52] + var9;
            int var60 = this.field4072[var52 + 6] + var3;
            int var61 = var59 ^ var56 << 11;
            int var62 = var58 + var61;
            int var63 = var55 + var56;
            int var64 = var63 ^ var55 >>> 2;
            int var65 = var55 + var62;
            int var66 = var53 + var64;
            int var67 = var65 ^ var62 << 8;
            int var68 = var62 + var66;
            var6 = var68 ^ var66 >>> 16;
            int var69 = var6 + var60;
            int var70 = var54 + var67;
            int var71 = var66 + var70;
            var5 = var71 ^ var70 << 10;
            int var72 = var69 + var70;
            int var73 = var5 + var57;
            var4 = var72 ^ var69 >>> 4;
            int var74 = var69 + var73;
            int var75 = var4 + var61;
            var3 = var74 ^ var73 << 8;
            var8 = var3 + var64;
            int var76 = var73 + var75;
            var2 = var76 ^ var75 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var75;
            this.field4072[var52] = var9;
            this.field4072[var52 + 1] = var8;
            this.field4072[var52 + 2] = var7;
            this.field4072[var52 + 3] = var6;
            this.field4072[var52 + 4] = var5;
            this.field4072[var52 + 5] = var4;
            this.field4072[var52 + 6] = var3;
            this.field4072[var52 + 7] = var2;
        }
        this.method1874((byte) 120);
        this.field4074 = 256;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIII)Z", line = 207)
    public static final boolean method1872(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var9 = arg3; var9 <= arg4; var9++) {
                    if (class324.field5027[arg0][var8][var9] == -class94.field1531) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << 7) + 1;
            int var11 = (arg3 << 7) + 2;
            int var12 = class29.field475[arg0][arg1][arg3] + arg5;
            if (!class2.method4(var10, var12, var11)) {
                return false;
            }
            int var13 = (arg2 << 7) - 1;
            if (!class2.method4(var13, var12, var11)) {
                return false;
            }
            int var14 = (arg4 << 7) - 1;
            if (!class2.method4(var10, var12, var14)) {
                return false;
            } else if (class2.method4(var13, var12, var14)) {
                return true;
            } else {
                return false;
            }
        } else if (class68.method513(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class2.method4(var6 + 1, class29.field475[arg0][arg1][arg3] + arg5, var7 + 1) && class2.method4(var6 + 128 - 1, class29.field475[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class2.method4(var6 + 128 - 1, class29.field475[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class2.method4(var6 + 1, class29.field475[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(I)V", line = 269)
    public static void method1873(int arg0) {
        field4071 = null;
        if (arg0 != 29508) {
            field4071 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V", line = 283)
    private final void method1874(byte arg0) {
        field4080++;
        if (arg0 < 109) {
            method1876(28, 12, 80);
        }
        this.field4078 += ++this.field4076;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field4072[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field4075 ^= this.field4075 << 13;
                } else {
                    this.field4075 ^= this.field4075 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field4075 ^= this.field4075 << 2;
            } else {
                this.field4075 ^= this.field4075 >>> 16;
            }
            this.field4075 += this.field4072[var2 + 128 & 0xFF];
            int var4;
            this.field4072[var2] = var4 = this.field4075 + this.field4072[class280.method2001(var3, 1020) >> 2] + this.field4078;
            this.field4069[var2] = this.field4078 = var3 + this.field4072[class280.method2001(var4, 261212) >> 8 >> 2];
        }
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "()V", line = 322)
    private class263() {
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "([I)V", line = 324)
    public class263(int[] arg0) {
        this.field4072 = new int[256];
        this.field4069 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field4069[var2] = arg0[var2];
        }
        this.method1871(-468584757);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIII)I", line = 345)
    public static final int method1875(int arg0, int arg1, int arg2, int arg3) {
        field4068++;
        int var4 = arg0 / arg2;
        int var5 = arg0 & arg2 - 1;
        int var6 = arg2 - 1 & arg3;
        int var7 = arg3 / arg2;
        int var8 = class229.method1657(false, var4, var7);
        int var9 = 74 % ((37 - arg1) / 60);
        int var10 = class229.method1657(false, var4 + 1, var7);
        int var11 = class229.method1657(false, var4, var7 + 1);
        int var12 = class229.method1657(false, var4 + 1, var7 + 1);
        int var13 = client.method1784(var5, arg2, var10, (byte) 106, var8);
        int var14 = client.method1784(var5, arg2, var12, (byte) -94, var11);
        return client.method1784(var6, arg2, var14, (byte) -21, var13);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(III)V", line = 382)
    public static final void method1876(int arg0, int arg1, int arg2) {
        field4077++;
        class4 var3 = class67.method510(1, arg0, arg1);
        var3.method14(24710);
        var3.field20 = arg2;
    }
}
