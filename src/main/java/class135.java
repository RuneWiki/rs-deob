import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class135 extends class306 {

    @OriginalMember(owner = "client!ic", name = "J", descriptor = "I")
    private int field2006 = 16;

    @OriginalMember(owner = "client!ic", name = "R", descriptor = "I")
    private int field2013 = 0;

    @OriginalMember(owner = "client!ic", name = "S", descriptor = "I")
    private int field2014 = 2000;

    @OriginalMember(owner = "client!ic", name = "T", descriptor = "I")
    private int field2015 = 0;

    @OriginalMember(owner = "client!ic", name = "X", descriptor = "I")
    private int field2018 = 4096;

    @OriginalMember(owner = "client!ic", name = "Q", descriptor = "[Z")
    public static boolean[] field2012 = new boolean[100];

    @OriginalMember(owner = "client!ic", name = "bb", descriptor = "Lam;")
    public static class282 field2022 = new class282();

    @OriginalMember(owner = "client!ic", name = "cb", descriptor = "Lnf;")
    public static class76 field2023 = new class76(0, -1);

    @OriginalMember(owner = "client!ic", name = "eb", descriptor = "Ljava/lang/String;")
    public static String field2025 = "Discard";

    @OriginalMember(owner = "client!ic", name = "gb", descriptor = "Lvh;")
    public static class62 field2027 = new class62(20);

    @OriginalMember(owner = "client!ic", name = "G", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!ic", name = "H", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!ic", name = "I", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!ic", name = "L", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!ic", name = "M", descriptor = "I")
    public static int field2009;

    @OriginalMember(owner = "client!ic", name = "N", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!ic", name = "O", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!ic", name = "U", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!ic", name = "V", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!ic", name = "Y", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!ic", name = "Z", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!ic", name = "ab", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!ic", name = "db", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!ic", name = "fb", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!ic", name = "K", descriptor = "Lwd;")
    public static class93 field2007;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "(B)V", line = 4)
    public static void method926(byte arg0) {
        field2012 = null;
        field2023 = null;
        if (arg0 != -15) {
            method934(59);
        }
        field2022 = null;
        field2025 = null;
        field2007 = null;
        field2027 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILlf;I)V", line = 34)
    public final void method45(int arg0, class143 arg1, int arg2) {
        if (arg2 == 0) {
            this.field2015 = arg1.method1043(true);
        } else if (arg2 == 1) {
            this.field2014 = arg1.method1051(1);
        } else if (arg2 == 2) {
            this.field2006 = arg1.method1043(true);
        } else if (arg2 == 3) {
            this.field2013 = arg1.method1051(arg0 ^ 0xFFFFC41B);
        } else if (arg2 == 4) {
            this.field2018 = arg1.method1051(1);
        }
        if (arg0 != -15334) {
            method933(73, 22, (byte) -1, -48);
        }
        field2010++;
    }

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "(B)V", line = 81)
    public static final void method927(byte arg0) {
        field2020++;
        if (class50.field571) {
            return;
        }
        int var1 = -37 % ((14 - arg0) / 54);
        class50.field571 = true;
        if (class222.field3355) {
            class190.field2855 = (float) ((int) class190.field2855 + 191 & 0xFFFFFF80);
        } else {
            class296.field4650 += (24.0F - class296.field4650) / 2.0F;
        }
        class234.field3560 = true;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)[I", line = 109)
    public final int[] method47(int arg0, int arg1) {
        field2003++;
        if (arg1 != -1546337535) {
            return (int[]) null;
        }
        int[] var3 = this.field4757.method903(arg0, -91);
        if (this.field4757.field1898) {
            int var4 = this.field2018 >> 1;
            int[][] var5 = this.field4757.method899(87);
            Random var6 = new Random((long) this.field2015);
            for (int var7 = 0; var7 < this.field2014; var7++) {
                int var8 = this.field2018 <= 0 ? this.field2013 : this.field2013 + class220.method1534(this.field2018, var6, 2) - var4;
                int var9 = (var8 & 0xFF6) >> 4;
                int var10 = class220.method1534(class31.field367, var6, 2);
                int var11 = class220.method1534(class99.field1344, var6, 2);
                int var12 = (class304.field4741[var9] * this.field2006 >> 12) + var11;
                int var13 = (class323.field5147[var9] * this.field2006 >> 12) + var10;
                int var14 = var12 - var11;
                int var15 = var13 - var10;
                if (var15 != 0 || var14 != 0) {
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    boolean var16 = var15 < var14;
                    if (var16) {
                        int var17 = var10;
                        var10 = var11;
                        int var18 = var13;
                        var13 = var12;
                        var11 = var17;
                        var12 = var18;
                    }
                    if (var13 < var10) {
                        int var19 = var10;
                        int var20 = var11;
                        var11 = var12;
                        var12 = var20;
                        var10 = var13;
                        var13 = var19;
                    }
                    int var21 = var11;
                    int var22 = var13 - var10;
                    int var23 = var12 - var11;
                    int var24 = -var22 / 2;
                    int var25 = 1024 - (class220.method1534(4096, var6, 2) >> 2);
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var26 = 2048 / var22;
                    int var27 = var12 <= var11 ? -1 : 1;
                    for (int var28 = var10; var28 < var13; var28++) {
                        var24 += var23;
                        int var29 = class311.field4878 & var28;
                        int var30 = var21 & class56.field663;
                        if (var24 > 0) {
                            var24 -= var22;
                            var21 += var27;
                        }
                        int var31 = (var28 - var10) * var26 + (var25 + 1024);
                        if (var16) {
                            var5[var30][var29] = var31;
                        } else {
                            var5[var29][var30] = var31;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V", line = 481)
    public class135() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lnk;Lnk;B)V", line = 255)
    public static final void method928(class16 arg0, class16 arg1, byte arg2) {
        field2017++;
        class14.field140 = arg1;
        class208.field3147 = arg0;
        if (arg2 == -71) {
            class14.field140.method110(false, 36);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIII)V", line = 271)
    public static final void method929(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2016++;
        class328.field5282.field2295 = 0;
        class328.field5282.method1055(20, 121);
        if (arg0 != 255) {
            method933(47, -60, (byte) -59, -12);
        }
        class328.field5282.method1055(arg1, 110);
        class328.field5282.method1055(arg4, 87);
        class328.field5282.method1003(arg2, arg0 - 257);
        class328.field5282.method1003(arg3, -2);
        class172.field2609 = 0;
        class212.field3217 = 0;
        class285.field4527 = -3;
        class148.field2354 = 1;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(IB)V", line = 293)
    public static final void method930(int arg0, byte arg1) {
        field2021++;
        class279 var2 = class147.method1085(arg0, -19443, 8);
        int var3 = -101 / ((arg1 + 1) / 58);
        var2.method1996(true);
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(IIII)I", line = 305)
    public static final int method931(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 / arg2;
        field2005++;
        int var5 = arg1 + arg2 & arg3;
        int var6 = arg0 / arg2;
        int var7 = arg0 & arg2 - 1;
        int var8 = class86.method548(8, var6, var4);
        int var9 = class86.method548(8, var6, var4 + 1);
        int var10 = class86.method548(arg1 ^ 0xFFFFFFF7, var6 + 1, var4);
        int var11 = class86.method548(8, var6 + 1, var4 - -1);
        int var12 = class225.method1564(var8, var9, (byte) -115, var5, arg2);
        int var13 = class225.method1564(var10, var11, (byte) -81, var5, arg2);
        return class225.method1564(var12, var13, (byte) 43, var7, arg2);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(III)V", line = 337)
    public static final void method932(int arg0, int arg1, int arg2) {
        class168.field2579 = class336.field5354 + class336.field5350 - arg2 - 1;
        if (arg0 <= -118) {
            class311.field4880 = arg1 - class336.field5346;
            field2009++;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIBI)V", line = 354)
    public static final void method933(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = class31.field365 * arg3 >> 8;
        field2019++;
        if (arg2 != 83) {
            method930(126, (byte) -70);
        }
        if (var4 != 0 && arg0 != -1) {
            class132.method904(var4, false, arg0, class276.field4351, 1, 0);
            class327.field5234 = true;
        }
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(B)V", line = 381)
    public final void method43(byte arg0) {
        class105.method682((byte) -72);
        if (arg0 <= -103) {
            field2008++;
        }
    }

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "(I)V", line = 400)
    public static final void method934(int arg0) {
        field2004++;
        class298.method2111(class75.field966, false);
        int var1 = (class280.field4415 >> 10) + (class16.field160 >> 3);
        int var2 = (class10.field96 >> 10) + (class322.field4999 >> 3);
        byte var3 = 0;
        byte var4 = 8;
        byte var5 = 8;
        byte var6 = 18;
        class128.field1874 = new int[var6];
        class84.field1098 = new int[var6];
        class185.field2787 = new int[var6];
        class253.field4009 = new int[var6];
        if (arg0 != 2048) {
            method929(69, 55, 81, -42, -88);
        }
        class218.field3277 = new int[var6];
        class203.field3090 = new int[var6];
        class316.field4951 = new byte[var6][];
        class67.field834 = new byte[var6][];
        class108.field1490 = new byte[var6][];
        class119.field1658 = new byte[var6][];
        class256.field4049 = new byte[var6][];
        class312.field4893 = new int[var6][4];
        int var7 = 0;
        for (int var8 = (var2 - 6) / 8; var8 <= ((var2 + 6) / 8); var8++) {
            for (int var9 = (var1 - 6) / 8; var9 <= (var1 + 6) / 8; var9++) {
                int var10 = (var8 << 8) + var9;
                class218.field3277[var7] = var10;
                class185.field2787[var7] = class102.field1380.method93(-109, "m" + var8 + "_" + var9);
                class253.field4009[var7] = class102.field1380.method93(-67, "l" + var8 + "_" + var9);
                class128.field1874[var7] = class102.field1380.method93(-55, "n" + var8 + "_" + var9);
                class203.field3090[var7] = class102.field1380.method93(arg0 - 2103, "um" + var8 + "_" + var9);
                class84.field1098[var7] = class102.field1380.method93(-65, "ul" + var8 + "_" + var9);
                if (class128.field1874[var7] == -1) {
                    class185.field2787[var7] = -1;
                    class253.field4009[var7] = -1;
                    class203.field3090[var7] = -1;
                    class84.field1098[var7] = -1;
                }
                var7++;
            }
        }
        for (int var11 = var7; var11 < class128.field1874.length; var11++) {
            class128.field1874[var11] = -1;
            class185.field2787[var11] = -1;
            class253.field4009[var11] = -1;
            class203.field3090[var11] = -1;
            class84.field1098[var11] = -1;
        }
        class229.method1587(false, var5, var1, var4, var2, true, arg0 ^ 0x808, var3);
    }
}
