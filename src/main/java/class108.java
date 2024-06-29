import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class108 {

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "[I")
    private int[] field1992;

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "[I")
    private int[] field1997;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public static int field1986 = 0;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
    public static int field1991 = 0;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "[S")
    public static short[] field1988 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    private int field1987;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    private int field1990;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
    private int field1999;

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "I")
    private int field2000;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
    private final void method916(int arg0) {
        field1996++;
        if (arg0 != 26035) {
            field1988 = null;
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
            int var72 = var68 + var71;
            int var73 = var2 + var5;
            var4 = var72 ^ var71 >>> 4;
            int var74 = var4 + var61;
            int var75 = var71 + var73;
            var3 = var75 ^ var73 << 8;
            int var76 = var73 + var74;
            var8 = var3 + var64;
            var2 = var76 ^ var74 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var74;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field1992[var11] + var9;
            int var38 = this.field1992[var11 + 2] + var7;
            int var39 = this.field1992[var11 + 7] + var2;
            int var40 = this.field1992[var11 + 4] + var5;
            int var41 = this.field1992[var11 + 3] + var6;
            int var42 = this.field1992[var11 + 6] + var3;
            int var43 = this.field1992[var11 + 5] + var4;
            int var44 = this.field1992[var11 + 1] + var8;
            int var45 = var37 ^ var44 << 11;
            int var46 = var41 + var45;
            int var47 = var38 + var44;
            int var48 = var47 ^ var38 >>> 2;
            int var49 = var38 + var46;
            int var50 = var40 + var48;
            int var51 = var49 ^ var46 << 8;
            int var52 = var43 + var51;
            int var53 = var46 + var50;
            var6 = var53 ^ var50 >>> 16;
            int var54 = var6 + var42;
            int var55 = var50 + var52;
            var5 = var55 ^ var52 << 10;
            int var56 = var5 + var39;
            int var57 = var52 + var54;
            var4 = var57 ^ var54 >>> 4;
            int var58 = var4 + var45;
            int var59 = var54 + var56;
            var3 = var59 ^ var56 << 8;
            int var60 = var56 + var58;
            var8 = var3 + var48;
            var2 = var60 ^ var58 >>> 9;
            var9 = var8 + var58;
            var7 = var2 + var51;
            this.field1997[var11] = var9;
            this.field1997[var11 + 1] = var8;
            this.field1997[var11 + 2] = var7;
            this.field1997[var11 + 3] = var6;
            this.field1997[var11 + 4] = var5;
            this.field1997[var11 + 5] = var4;
            this.field1997[var11 + 6] = var3;
            this.field1997[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field1997[var12 + 5] + var4;
            int var14 = this.field1997[var12 + 2] + var7;
            int var15 = this.field1997[var12 + 6] + var3;
            int var16 = this.field1997[var12 + 1] + var8;
            int var17 = this.field1997[var12] + var9;
            int var18 = this.field1997[var12 + 4] + var5;
            int var19 = this.field1997[var12 + 3] + var6;
            int var20 = this.field1997[var12 + 7] + var2;
            int var21 = var17 ^ var16 << 11;
            int var22 = var14 + var16;
            int var23 = var19 + var21;
            int var24 = var22 ^ var14 >>> 2;
            int var25 = var14 + var23;
            int var26 = var18 + var24;
            int var27 = var25 ^ var23 << 8;
            int var28 = var23 + var26;
            int var29 = var13 + var27;
            var6 = var28 ^ var26 >>> 16;
            int var30 = var26 + var29;
            int var31 = var6 + var15;
            var5 = var30 ^ var29 << 10;
            int var32 = var5 + var20;
            int var33 = var29 + var31;
            var4 = var33 ^ var31 >>> 4;
            int var34 = var4 + var21;
            int var35 = var31 + var32;
            var3 = var35 ^ var32 << 8;
            int var36 = var32 + var34;
            var8 = var3 + var24;
            var2 = var36 ^ var34 >>> 9;
            var9 = var8 + var34;
            var7 = var2 + var27;
            this.field1997[var12] = var9;
            this.field1997[var12 + 1] = var8;
            this.field1997[var12 + 2] = var7;
            this.field1997[var12 + 3] = var6;
            this.field1997[var12 + 4] = var5;
            this.field1997[var12 + 5] = var4;
            this.field1997[var12 + 6] = var3;
            this.field1997[var12 + 7] = var2;
        }
        this.method919(14965);
        this.field1999 = 256;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIILph;)Lao;")
    public static final class191 method917(int arg0, int arg1, int arg2, class459 arg3) {
        field1998++;
        class289 var4 = new class289(arg3.method2757(arg2, arg1, (byte) -120));
        class191 var5 = new class191(arg1, var4.method1834(-17823), var4.method1834(-17823), var4.method1815((byte) -91), var4.method1815((byte) -48), var4.method1858(-3256) == 1, var4.method1858(-3256), var4.method1858(-3256));
        if (arg0 < 3) {
            method920(null, -84, -107, true);
        }
        int var6 = var4.method1858(-3256);
        for (int var7 = 0; var7 < var6; var7++) {
            var5.field3079.method1885(false, new class447(var4.method1858(-3256), var4.method1841((byte) 58), var4.method1841((byte) 63), var4.method1841((byte) -118), var4.method1841((byte) 74), var4.method1841((byte) -126), var4.method1841((byte) 84), var4.method1841((byte) -120), var4.method1841((byte) -117)));
        }
        var5.method1296(0);
        return var5;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)I")
    public final int method918(byte arg0) {
        field1993++;
        if (arg0 != 58) {
            return 40;
        }
        if (this.field1999 == 0) {
            this.method919(14965);
            this.field1999 = 256;
        }
        return this.field1992[this.field1999 - 1];
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
    private final void method919(int arg0) {
        field1994++;
        if (arg0 != 14965) {
            this.field1997 = null;
        }
        this.field2000 += ++this.field1990;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field1997[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field1987 ^= this.field1987 << 13;
                } else {
                    this.field1987 ^= this.field1987 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field1987 ^= this.field1987 << 2;
            } else {
                this.field1987 ^= this.field1987 >>> 16;
            }
            this.field1987 += this.field1997[var2 + 128 & 0xFF];
            int var4;
            this.field1997[var2] = var4 = this.field1997[class490.method2960(1020, var3) >> 2] - (-this.field1987 - this.field2000);
            this.field1992[var2] = this.field2000 = var3 + this.field1997[class490.method2960(var4 >> 8, 1020) >> 2];
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lcd;IIZ)Lmd;")
    public static final class384 method920(class208 arg0, int arg1, int arg2, boolean arg3) {
        field1985++;
        int var4 = arg1 << 8 | arg0.field3328;
        if (!arg3) {
            field1986 = 47;
        }
        class384 var5 = (class384) class143.field2359.method38((long) var4 << 16, (byte) 41);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class510.field7434.method2760((byte) -107, class510.field7434.method2734(var4, (byte) 126));
        if (var6 == null) {
            int var8 = arg2 + 65536 << 8 | arg0.field3328;
            class384 var9 = (class384) class143.field2359.method38((long) var8 << 16, (byte) 41);
            if (var9 != null) {
                return var9;
            }
            byte[] var10 = class510.field7434.method2760((byte) 94, class510.field7434.method2734(var8, (byte) 96));
            if (var10 == null) {
                int var12 = arg0.field3328 | 0xFFFF00;
                class384 var13 = (class384) class143.field2359.method38((long) var12 << 16, (byte) 41);
                if (var13 != null) {
                    return var13;
                }
                byte[] var14 = class510.field7434.method2760((byte) -118, class510.field7434.method2734(var12, (byte) 91));
                if (var14 == null) {
                    return null;
                } else if (var14.length <= 1) {
                    return null;
                } else {
                    class384 var15 = class193.method1308(127, var14);
                    var15.field5604 = arg0;
                    class143.field2359.method35((long) var12 << 16, -1, var15);
                    return var15;
                }
            } else if (var10.length <= 1) {
                return null;
            } else {
                class384 var11 = class193.method1308(91, var10);
                var11.field5604 = arg0;
                class143.field2359.method35((long) var8 << 16, -1, var11);
                return var11;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class384 var7 = class193.method1308(114, var6);
            var7.field5604 = arg0;
            class143.field2359.method35((long) var4 << 16, -1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)V")
    public static void method921(int arg0) {
        field1988 = null;
        if (arg0 > -3) {
            method920(null, -47, -25, false);
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)I")
    public final int method922(byte arg0) {
        if (this.field1999 == 0) {
            this.method919(14965);
            this.field1999 = 256;
        }
        if (arg0 <= 61) {
            method920(null, -27, 61, false);
        }
        field1995++;
        return this.field1992[--this.field1999];
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V")
    private class108() {
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "([I)V")
    public class108(int[] arg0) {
        this.field1992 = new int[256];
        this.field1997 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field1992[var2] = arg0[var2];
        }
        this.method916(26035);
    }
}
