import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class333 {

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "[[I")
    private int[][] field4976;

    @OriginalMember(owner = "client!nm", name = "g", descriptor = "I")
    private int field4977;

    @OriginalMember(owner = "client!nm", name = "m", descriptor = "I")
    private int field4983;

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "I")
    public static int field4974 = 0;

    @OriginalMember(owner = "client!nm", name = "l", descriptor = "I")
    public static int field4982 = 13156520;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "I")
    public static int field4971;

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "I")
    public static int field4973;

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "I")
    public static int field4975;

    @OriginalMember(owner = "client!nm", name = "h", descriptor = "I")
    public static int field4978;

    @OriginalMember(owner = "client!nm", name = "i", descriptor = "I")
    public static int field4979;

    @OriginalMember(owner = "client!nm", name = "j", descriptor = "I")
    public static int field4980;

    @OriginalMember(owner = "client!nm", name = "k", descriptor = "I")
    public static int field4981;

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "[I")
    public static int[] field4972;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)V", line = 8)
    public static final void method2102(int arg0) {
        field4979++;
        class505.method3009();
        for (int var1 = 0; var1 < 4; var1++) {
            class184.field2758[var1].method1161(-113);
        }
        class77.method668(false);
        class123.method912(true);
        if (arg0 == 25374) {
            System.gc();
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)Lqr;", line = 29)
    public static final class48 method2103(byte arg0) {
        field4978++;
        if (arg0 < 11) {
            method2108(55);
        }
        return class7.field80;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "([BI)[B", line = 40)
    public final byte[] method2104(byte[] arg0, int arg1) {
        field4971++;
        if (this.field4976 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field4977 / (long) this.field4983) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field4976[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field4977 + var6;
                int var14 = var13 / this.field4983;
                var6 = var13 - this.field4983 * var14;
                var5 += var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 > 127) {
                    arg0[var8] = 127;
                } else {
                    arg0[var8] = (byte) var9;
                }
            }
        }
        if (arg1 != -15) {
            field4972 = null;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIII)V", line = 126)
    public static final void method2105(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4975++;
        if (arg1 != 3) {
            method2102(43);
        }
        for (class101 var5 = (class101) class251.field3891.method1004((byte) -84); var5 != null; var5 = (class101) class251.field3891.method996(arg1 - 2)) {
            class96.method779(-1, arg3, arg4, arg2, var5, arg0);
        }
        for (class101 var6 = (class101) class360.field5347.method1004((byte) -85); var6 != null; var6 = (class101) class360.field5347.method996(1)) {
            byte var11 = 1;
            class376 var12 = var6.field1446.method948(false);
            if (var6.field1446.field1926) {
                var11 = 0;
            } else if (var6.field1446.field1925 == var12.field5662 || var6.field1446.field1925 == var12.field5672 || var6.field1446.field1925 == var12.field5673 || var6.field1446.field1925 == var12.field5650) {
                var11 = 2;
            } else if (var6.field1446.field1925 == var12.field5652 || var6.field1446.field1925 == var12.field5643 || var6.field1446.field1925 == var12.field5648 || var6.field1446.field1925 == var12.field5638) {
                var11 = 3;
            }
            if (var6.field1449 != var11) {
                int var13 = class202.method1416(var6.field1446, -1);
                if (var6.field1436 != var13) {
                    if (var6.field1443 != null) {
                        class359.field5328.method385(var6.field1443);
                        var6.field1443 = null;
                    }
                    var6.field1436 = var13;
                }
                var6.field1449 = var11;
            }
            var6.field1451 = var6.field1446.field5837;
            var6.field1442 = var6.field1446.field5837 + (var6.field1446.method953(arg1 ^ 0xFFFFFFC6) << 6);
            var6.field1433 = var6.field1446.field5833;
            var6.field1450 = var6.field1446.field5833 + (var6.field1446.method953(-109) << 6);
            class96.method779(arg1 ^ 0xFFFFFFFC, arg3, arg4, arg2, var6, arg0);
        }
        for (class101 var7 = (class101) class25.field314.method2592(118); var7 != null; var7 = (class101) class25.field314.method2589(-1)) {
            byte var8 = 1;
            class376 var9 = var7.field1455.method948(false);
            if (var7.field1455.field1926) {
                var8 = 0;
            } else if (var7.field1455.field1925 == var9.field5662 || var7.field1455.field1925 == var9.field5672 || var7.field1455.field1925 == var9.field5673 || var7.field1455.field1925 == var9.field5650) {
                var8 = 2;
            } else if (var7.field1455.field1925 == var9.field5652 || var7.field1455.field1925 == var9.field5643 || var7.field1455.field1925 == var9.field5648 || var7.field1455.field1925 == var9.field5638) {
                var8 = 3;
            }
            if (var7.field1449 != var8) {
                int var10 = class289.method1864(var7.field1455, true);
                if (var7.field1436 != var10) {
                    if (var7.field1443 != null) {
                        class359.field5328.method385(var7.field1443);
                        var7.field1443 = null;
                    }
                    var7.field1436 = var10;
                }
                var7.field1449 = var8;
            }
            var7.field1451 = var7.field1455.field5837;
            var7.field1442 = var7.field1455.field5837 + (var7.field1455.method953(-64) << 6);
            var7.field1433 = var7.field1455.field5833;
            var7.field1450 = var7.field1455.field5833 + (var7.field1455.method953(-77) << 6);
            class96.method779(arg1 - 4, arg3, arg4, arg2, var7, arg0);
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)I", line = 238)
    public final int method2106(int arg0, int arg1) {
        field4973++;
        if (this.field4976 != null) {
            arg1 = (int) ((long) this.field4977 * (long) arg1 / (long) this.field4983);
        }
        if (arg0 != 14) {
            method2102(-59);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(II)V", line = 252)
    public class333(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class507.method3024(arg0, arg1, (byte) -106);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field4976 = new int[var4][14];
            this.field4977 = var5;
            this.field4983 = var4;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field4976[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var5 / (double) var4;
                while (var10 < var11) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(BI)I", line = 311)
    public final int method2107(byte arg0, int arg1) {
        field4980++;
        if (this.field4976 != null) {
            arg1 = (int) ((long) this.field4977 * (long) arg1 / (long) this.field4983) + 6;
        }
        if (arg0 > -18) {
            method2102(-115);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)V", line = 325)
    public static void method2108(int arg0) {
        field4972 = null;
        if (arg0 < 63) {
            field4982 = -123;
        }
    }
}
