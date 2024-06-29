import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public abstract class class567 {

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "[S")
    private short[] field8064 = new short[512];

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "I")
    public int field8065 = 4;

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
    private int field8063 = 4;

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "I")
    private int field8069 = 4;

    @OriginalMember(owner = "client!hj", name = "r", descriptor = "I")
    private int field8074 = 0;

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "I")
    private int field8068 = 4;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "[[I")
    public static int[][] field8059 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
    public static int field8057;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
    public static int field8058;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
    public static int field8060;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
    public static int field8061;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "I")
    public static int field8062;

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "I")
    public static int field8067;

    @OriginalMember(owner = "client!hj", name = "o", descriptor = "I")
    public static int field8071;

    @OriginalMember(owner = "client!hj", name = "p", descriptor = "I")
    public static int field8072;

    @OriginalMember(owner = "client!hj", name = "q", descriptor = "Loh;")
    public static class404 field8073;

    @OriginalMember(owner = "client!hj", name = "n", descriptor = "Lda;")
    public static class59 field8070;

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "[S")
    private short[] field8066;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BIII)V", line = 6)
    public final void method3296(byte arg0, int arg1, int arg2, int arg3) {
        field8072++;
        if (arg0 != -48) {
            return;
        }
        int[] var5 = new int[arg2];
        int[] var6 = new int[arg1];
        for (int var7 = 0; var7 < arg2; var7++) {
            var5[var7] = (var7 << 12) / arg2;
        }
        int[] var8 = new int[arg3];
        for (int var9 = 0; var9 < arg1; var9++) {
            var6[var9] = (var9 << 12) / arg1;
        }
        for (int var10 = 0; var10 < arg3; var10++) {
            var8[var10] = (var10 << 12) / arg3;
        }
        this.method1576(9194);
        for (int var11 = 0; var11 < arg3; var11++) {
            for (int var12 = 0; var12 < arg1; var12++) {
                for (int var13 = 0; var13 < arg2; var13++) {
                    for (int var14 = 0; var14 < this.field8065; var14++) {
                        int var15 = this.field8066[var14] << 12;
                        int var16 = var6[var12] * var15 >> 12;
                        int var17 = var8[var11] * var15 >> 12;
                        int var18 = this.field8068 * var15 >> 12;
                        int var19 = this.field8069 * var15 >> 12;
                        int var20 = var5[var13] * var15 >> 12;
                        int var21 = this.field8063 * var15 >> 12;
                        int var22 = this.field8068 * var17;
                        int var23 = this.field8069 * var16;
                        int var24 = this.field8063 * var20;
                        int var25 = var24 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var25 & 0xFF;
                        int var28 = var23 >> 12;
                        int var29 = var28 + 1;
                        int var30 = var28 & 0xFF;
                        int var31 = var22 >> 12;
                        int var32 = var31 + 1;
                        int var33 = var31 & 0xFF;
                        int var34 = var24 & 0xFFF;
                        int var35;
                        if (var32 < var18) {
                            var35 = var32 & 0xFF;
                        } else {
                            var35 = 0;
                        }
                        int var36 = var22 & 0xFFF;
                        int var37 = var23 & 0xFFF;
                        int var38;
                        if (var29 < var19) {
                            var38 = var29 & 0xFF;
                        } else {
                            var38 = 0;
                        }
                        int var39;
                        if (var21 <= var26) {
                            var39 = 0;
                        } else {
                            var39 = var26 & 0xFF;
                        }
                        short var40 = this.field8064[var35];
                        int var41 = class1.field3[var34];
                        int var42 = var36 - 4096;
                        int var43 = var34 - 4096;
                        int var44 = class1.field3[var37];
                        int var45 = var37 - 4096;
                        short var46 = this.field8064[var33];
                        int var47 = class1.field3[var36];
                        short var48 = this.field8064[var38 + var46];
                        short var49 = this.field8064[var30 + var46];
                        short var50 = this.field8064[var38 + var40];
                        short var51 = this.field8064[var30 + var40];
                        int var52 = class623.method3561(this.field8064[var27 + var49], var37, true, var34, var36);
                        int var53 = class623.method3561(this.field8064[var39 + var49], var37, true, var43, var36);
                        int var54 = ((var53 - var52) * var41 >> 12) + var52;
                        int var55 = class623.method3561(this.field8064[var27 + var48], var45, true, var34, var36);
                        int var56 = class623.method3561(this.field8064[var39 + var48], var45, true, var43, var36);
                        int var57 = ((var56 - var55) * var41 >> 12) + var55;
                        int var58 = ((var57 - var54) * var44 >> 12) + var54;
                        int var59 = class623.method3561(this.field8064[var27 + var51], var37, true, var34, var42);
                        int var60 = class623.method3561(this.field8064[var39 + var51], var37, true, var43, var42);
                        int var61 = var59 + ((var60 - var59) * var41 >> 12);
                        int var62 = class623.method3561(this.field8064[var27 + var50], var45, true, var34, var42);
                        int var63 = class623.method3561(this.field8064[var39 + var50], var45, true, var43, var42);
                        int var64 = ((var63 - var62) * var41 >> 12) + var62;
                        int var65 = var61 + ((var64 - var61) * var44 >> 12);
                        this.method1579(((var65 - var58) * var47 >> 12) + var58, 4095, var14);
                    }
                    this.method1578(0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILcf;III)V", line = 174)
    public static final void method3297(int arg0, class602 arg1, int arg2, int arg3, int arg4) {
        field8058++;
        long var5 = (long) (arg4 | arg2 << 28 | arg0 << 14);
        class723 var7 = (class723) class450.field6490.method1754(false, var5);
        if (var7 == null) {
            class723 var8 = new class723();
            class450.field6490.method1751(var8, arg3 - 20718, var5);
            var8.field10131.method1721((byte) 106, arg1);
            return;
        }
        class431 var9 = class361.field4643.method912((byte) 1, arg1.field8567);
        if (arg3 != 24688) {
            field8059 = null;
        }
        int var10 = var9.field6251;
        if (var9.field6297 == 1) {
            var10 = (arg1.field8568 + 1) * var10;
        }
        for (class602 var11 = (class602) var7.field10131.method1719(65280); var11 != null; var11 = (class602) var7.field10131.method1723(-20665)) {
            class431 var12 = class361.field4643.method912((byte) 1, var11.field8567);
            int var13 = var12.field6251;
            if (var12.field6297 == 1) {
                var13 = (var11.field8568 + 1) * var13;
            }
            if (var13 < var10) {
                class109.method745(var11, (byte) -71, arg1);
                return;
            }
        }
        var7.field10131.method1721((byte) -120, arg1);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V", line = 232)
    private final void method3298(int arg0) {
        field8061++;
        Random var2 = new Random((long) this.field8074);
        if (arg0 != -19285) {
            return;
        }
        for (int var3 = 0; var3 < 255; var3++) {
            this.field8064[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class661.method3763(var5, 30356, var2);
            short var7 = this.field8064[var6];
            this.field8064[var6] = this.field8064[var5];
            this.field8064[var5] = this.field8064[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)V", line = 273)
    private final void method3299(int arg0) {
        field8057++;
        this.field8066 = new short[this.field8065];
        for (int var2 = 0; var2 < this.field8065; var2++) {
            this.field8066[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
        if (arg0 != 978822092) {
            field8073 = null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZIII)I", line = 297)
    public static final int method3300(boolean arg0, int arg1, int arg2, int arg3) {
        field8067++;
        class755 var4 = class149.method926(Integer.MIN_VALUE, arg0, arg1);
        if (var4 == null) {
            return 0;
        } else if (arg3 == -1) {
            return 0;
        } else {
            if (arg2 != 4730) {
                method3301(null, (byte) 14);
            }
            int var5 = 0;
            for (int var6 = 0; var6 < var4.field10534.length; var6++) {
                if (var4.field10531[var6] == arg3) {
                    var5 += var4.field10534[var6];
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lbda;B)I", line = 332)
    public static final int method3301(class504 arg0, byte arg1) {
        field8062++;
        if (arg0.field7135 == 0) {
            return 0;
        }
        if (arg1 != 28) {
            method3301(null, (byte) -98);
        }
        if (arg0.field7148 != -1) {
            class504 var2 = null;
            if (arg0.field7148 < 32768) {
                class151 var3 = (class151) class253.field3052.method1754(false, (long) arg0.field7148);
                if (var3 != null) {
                    var2 = var3.field1661;
                }
            } else if (arg0.field7148 >= 32768) {
                var2 = class75.field792[arg0.field7148 - 32768];
            }
            if (var2 != null) {
                int var4 = arg0.field4635 - var2.field4635;
                int var5 = arg0.field4629 - var2.field4629;
                if (var4 != 0 || var5 != 0) {
                    arg0.method3003((byte) -72, (int) (Math.atan2((double) var4, (double) var5) * 2607.5945876176133D) & 0x3FFF);
                }
            }
        }
        if (arg0 instanceof class183) {
            class183 var6 = (class183) arg0;
            if (var6.field2197 != -1 && (var6.field7184 == 0 || var6.field7185 > 0)) {
                var6.method3003((byte) 99, var6.field2197);
                var6.field2197 = -1;
            }
        } else if (arg0 instanceof class197) {
            class197 var7 = (class197) arg0;
            if (var7.field2299 != -1 && (var7.field7184 == 0 || var7.field7185 > 0)) {
                int var8 = var7.field4635 - ((var7.field2299 - class464.field6624 - class464.field6624) * 256);
                int var9 = var7.field4629 - (var7.field2297 - class181.field2144 - class181.field2144) * 256;
                if (var8 != 0 || var9 != 0) {
                    var7.method3003((byte) 98, (int) (Math.atan2((double) var8, (double) var9) * 2607.5945876176133D) & 0x3FFF);
                }
                var7.field2299 = -1;
            }
        }
        return arg0.method2998(0);
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(IIIII)V", line = 498)
    public class567(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field8069 = arg3;
        this.field8068 = arg4;
        this.field8074 = arg0;
        this.field8065 = arg1;
        this.field8063 = arg2;
        this.method3299(978822092);
        this.method3298(-19285);
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(III)Z", line = 415)
    public static final boolean method3302(int arg0, int arg1, int arg2) {
        if (arg1 == 16672) {
            field8060++;
            return class647.method3690(arg1 ^ 0x4163, arg2, arg0) | (arg0 & 0x40000) != 0 || class222.method1291(arg0, 121, arg2);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)V", line = 426)
    public static final void method3303(byte arg0) {
        field8071++;
        class35.field382.method966(5, (byte) -105);
        class147.field1641.method3242(5, (byte) -46);
        class606.field8619.method3192(115, 5);
        class445.field6442.method3980(5, true);
        class451.field6506.method141(5, -10170);
        class361.field4643.method908(102, 5);
        class637.field9158.method1907(true, 5);
        class173.field2036.method1219((byte) -82, 5);
        class628.field9019.method1406(5, 7);
        class422.field6147.method1996((byte) 116, 5);
        class182.field2148.method2675(5, 64);
        class337.field4323.method2052((byte) -113, 5);
        class119.field1233.method2345(5, (byte) 117);
        class84.field884.method96(11, 5);
        class579.field8200.method2112(5, 27704);
        class430.field6249.method2507(5, 117);
        class82.field857.method1302(5, -16382);
        class56.field565.method1967(-30610, 5);
        class184.field2207.method558(-120, 5);
        class724.field10140.method4096(5, 112);
        class726.method4040(-23677, 5);
        class245.method1482(-10117, 50);
        class448.method2770(50, (byte) -111);
        class123.method794((byte) 85, 5);
        class378.method2327(true, 5);
        class560.field7991.method3539((byte) 3, 5);
        int var1 = 112 / ((arg0 + 19) / 52);
        class592.field8346.method3539((byte) -79, 5);
        class209.field2467.method3539((byte) -73, 5);
        class634.field9110.method3539((byte) -56, 5);
        class133.field1513.method3539((byte) 119, 5);
    }

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "(I)V", line = 478)
    public static void method3304(int arg0) {
        if (arg0 == 2) {
            field8059 = null;
            field8073 = null;
            field8070 = null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(III)V")
    public abstract void method1579(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(I)V")
    public abstract void method1576(int arg0);

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(I)V")
    public abstract void method1578(int arg0);
}
