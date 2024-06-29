import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class257 extends class71 {

    @OriginalMember(owner = "client!id", name = "N", descriptor = "[I")
    private int[] field4564 = new int[257];

    @OriginalMember(owner = "client!id", name = "T", descriptor = "Lkb;")
    public static class34 field4570 = new class34();

    @OriginalMember(owner = "client!id", name = "U", descriptor = "Lud;")
    public static class279 field4571 = class130.method1024(":", 255);

    @OriginalMember(owner = "client!id", name = "W", descriptor = "[[[B")
    public static byte[][][] field4573 = new byte[4][104][104];

    @OriginalMember(owner = "client!id", name = "J", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!id", name = "M", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!id", name = "O", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!id", name = "P", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!id", name = "Q", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!id", name = "R", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!id", name = "S", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!id", name = "V", descriptor = "Lok;")
    public static class149 field4572;

    @OriginalMember(owner = "client!id", name = "X", descriptor = "Lvi;")
    public static class6 field4574;

    @OriginalMember(owner = "client!id", name = "K", descriptor = "Lom;")
    public static class70 field4561;

    @OriginalMember(owner = "client!id", name = "L", descriptor = "[[I")
    private int[][] field4562;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IZLvh;)V", line = 4)
    public final void method77(int arg0, boolean arg1, class53 arg2) {
        if (arg0 == 0) {
            int var4 = arg2.method483(-111);
            if (var4 == 0) {
                this.field4562 = new int[arg2.method483(-102)][4];
                for (int var5 = 0; var5 < this.field4562.length; var5++) {
                    this.field4562[var5][0] = arg2.method468(28214);
                    this.field4562[var5][1] = arg2.method483(-114) << 4;
                    this.field4562[var5][2] = arg2.method483(-121) << 4;
                    this.field4562[var5][3] = arg2.method483(-113) << 4;
                }
            } else {
                this.method1841(var4, true);
            }
        }
        field4567++;
        if (!arg1) {
            this.method86(38, 70);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IZ)V", line = 42)
    private final void method1841(int arg0, boolean arg1) {
        field4565++;
        if (arg0 != 0) {
            if (arg0 == 1) {
                this.field4562 = new int[2][4];
                this.field4562[0][2] = 0;
                this.field4562[0][3] = 0;
                this.field4562[0][0] = 0;
                this.field4562[0][1] = 0;
                this.field4562[1][0] = 4096;
                this.field4562[1][3] = 4096;
                this.field4562[1][1] = 4096;
                this.field4562[1][2] = 4096;
            } else if (arg0 == 2) {
                this.field4562 = new int[8][4];
                this.field4562[0][3] = 2361;
                this.field4562[0][0] = 0;
                this.field4562[1][0] = 2867;
                this.field4562[0][2] = 2602;
                this.field4562[1][2] = 1799;
                this.field4562[2][0] = 3072;
                this.field4562[3][0] = 3276;
                this.field4562[2][2] = 1734;
                this.field4562[1][3] = 1558;
                this.field4562[2][3] = 1413;
                this.field4562[3][2] = 1220;
                this.field4562[0][1] = 2650;
                this.field4562[3][3] = 947;
                this.field4562[4][3] = 722;
                this.field4562[4][2] = 963;
                this.field4562[5][3] = 1766;
                this.field4562[4][0] = 3481;
                this.field4562[5][2] = 2152;
                this.field4562[5][0] = 3686;
                this.field4562[6][2] = 1060;
                this.field4562[7][2] = 1413;
                this.field4562[1][1] = 2313;
                this.field4562[6][3] = 915;
                this.field4562[6][0] = 3891;
                this.field4562[7][3] = 1140;
                this.field4562[7][0] = 4096;
                this.field4562[2][1] = 2618;
                this.field4562[3][1] = 2296;
                this.field4562[4][1] = 2072;
                this.field4562[5][1] = 2730;
                this.field4562[6][1] = 2232;
                this.field4562[7][1] = 1686;
            } else if (arg0 == 3) {
                this.field4562 = new int[7][4];
                this.field4562[0][0] = 0;
                this.field4562[0][2] = 0;
                this.field4562[1][2] = 4096;
                this.field4562[1][0] = 663;
                this.field4562[2][0] = 1363;
                this.field4562[2][2] = 4096;
                this.field4562[3][2] = 4096;
                this.field4562[3][0] = 2048;
                this.field4562[0][3] = 4096;
                this.field4562[4][2] = 0;
                this.field4562[1][3] = 4096;
                this.field4562[0][1] = 0;
                this.field4562[2][3] = 0;
                this.field4562[5][2] = 0;
                this.field4562[6][2] = 0;
                this.field4562[1][1] = 0;
                this.field4562[2][1] = 0;
                this.field4562[3][1] = 4096;
                this.field4562[4][0] = 2727;
                this.field4562[5][0] = 3411;
                this.field4562[4][1] = 4096;
                this.field4562[3][3] = 0;
                this.field4562[4][3] = 0;
                this.field4562[5][1] = 4096;
                this.field4562[5][3] = 4096;
                this.field4562[6][1] = 0;
                this.field4562[6][3] = 4096;
                this.field4562[6][0] = 4096;
            } else if (arg0 == 4) {
                this.field4562 = new int[6][4];
                this.field4562[0][2] = 0;
                this.field4562[1][2] = 0;
                this.field4562[0][0] = 0;
                this.field4562[0][3] = 0;
                this.field4562[1][3] = 1493;
                this.field4562[1][0] = 1843;
                this.field4562[0][1] = 0;
                this.field4562[2][2] = 0;
                this.field4562[2][3] = 2939;
                this.field4562[3][2] = 1124;
                this.field4562[3][3] = 3565;
                this.field4562[4][2] = 3084;
                this.field4562[4][3] = 4031;
                this.field4562[5][2] = 4096;
                this.field4562[2][0] = 2457;
                this.field4562[3][0] = 2781;
                this.field4562[1][1] = 0;
                this.field4562[2][1] = 0;
                this.field4562[3][1] = 0;
                this.field4562[5][3] = 4096;
                this.field4562[4][1] = 546;
                this.field4562[4][0] = 3481;
                this.field4562[5][0] = 4096;
                this.field4562[5][1] = 4096;
            } else if (arg0 == 5) {
                this.field4562 = new int[16][4];
                this.field4562[0][1] = 80;
                this.field4562[0][2] = 192;
                this.field4562[1][2] = 449;
                this.field4562[1][1] = 321;
                this.field4562[0][0] = 0;
                this.field4562[0][3] = 321;
                this.field4562[1][3] = 562;
                this.field4562[2][3] = 803;
                this.field4562[2][2] = 690;
                this.field4562[2][1] = 578;
                this.field4562[3][1] = 947;
                this.field4562[3][3] = 1140;
                this.field4562[4][3] = 1509;
                this.field4562[1][0] = 155;
                this.field4562[2][0] = 389;
                this.field4562[5][3] = 1413;
                this.field4562[4][1] = 1285;
                this.field4562[6][3] = 1333;
                this.field4562[3][2] = 995;
                this.field4562[7][3] = 1702;
                this.field4562[3][0] = 671;
                this.field4562[5][1] = 1525;
                this.field4562[4][0] = 897;
                this.field4562[5][0] = 1175;
                this.field4562[6][0] = 1368;
                this.field4562[7][0] = 1507;
                this.field4562[6][1] = 1734;
                this.field4562[8][3] = 2056;
                this.field4562[4][2] = 1397;
                this.field4562[9][3] = 2666;
                this.field4562[7][1] = 1413;
                this.field4562[8][1] = 1108;
                this.field4562[5][2] = 1429;
                this.field4562[8][0] = 1736;
                this.field4562[9][0] = 2088;
                this.field4562[10][3] = 3276;
                this.field4562[6][2] = 1461;
                this.field4562[10][0] = 2355;
                this.field4562[9][1] = 1766;
                this.field4562[7][2] = 1525;
                this.field4562[10][1] = 2409;
                this.field4562[11][1] = 3116;
                this.field4562[8][2] = 1590;
                this.field4562[11][3] = 3228;
                this.field4562[9][2] = 2056;
                this.field4562[10][2] = 2586;
                this.field4562[11][2] = 3148;
                this.field4562[11][0] = 2691;
                this.field4562[12][3] = 3196;
                this.field4562[12][0] = 3031;
                this.field4562[13][3] = 3019;
                this.field4562[12][2] = 3710;
                this.field4562[13][0] = 3522;
                this.field4562[14][0] = 3727;
                this.field4562[12][1] = 3806;
                this.field4562[13][2] = 3421;
                this.field4562[14][2] = 3148;
                this.field4562[15][0] = 4096;
                this.field4562[13][1] = 3437;
                this.field4562[14][3] = 3228;
                this.field4562[14][1] = 3116;
                this.field4562[15][1] = 2377;
                this.field4562[15][2] = 2505;
                this.field4562[15][3] = 2746;
            } else if (arg0 == 6) {
                this.field4562 = new int[4][4];
                this.field4562[0][3] = 0;
                this.field4562[0][1] = 0;
                this.field4562[1][1] = 4096;
                this.field4562[0][0] = 2048;
                this.field4562[1][0] = 2867;
                this.field4562[2][0] = 3276;
                this.field4562[3][0] = 4096;
                this.field4562[2][1] = 4096;
                this.field4562[1][3] = 0;
                this.field4562[2][3] = 0;
                this.field4562[3][3] = 0;
                this.field4562[0][2] = 4096;
                this.field4562[1][2] = 4096;
                this.field4562[2][2] = 4096;
                this.field4562[3][1] = 4096;
                this.field4562[3][2] = 0;
            } else {
                throw new RuntimeException("Invalid gradient preset");
            }
        }
        if (!arg1) {
            field4573 = (byte[][][]) ((byte[][][]) null);
        }
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V", line = 294)
    public class257() {
        super(1, false);
    }

    @OriginalMember(owner = "client!id", name = "d", descriptor = "(I)V", line = 299)
    public final void method627(int arg0) {
        if (this.field4562 == null) {
            this.method1841(1, true);
        }
        field4566++;
        this.method1843(-111);
        if (arg0 != 7) {
            method1844(-12, -8, -20, 79);
        }
    }

    @OriginalMember(owner = "client!id", name = "d", descriptor = "(B)V", line = 314)
    public static void method1842(byte arg0) {
        field4571 = null;
        field4572 = null;
        if (arg0 < -95) {
            field4570 = null;
            field4561 = null;
            field4574 = null;
            field4573 = (byte[][][]) null;
        }
    }

    @OriginalMember(owner = "client!id", name = "f", descriptor = "(I)V", line = 346)
    private final void method1843(int arg0) {
        field4560++;
        int var2 = 7 % ((-arg0 - 62) / 37);
        int var3 = this.field4562.length;
        if (var3 <= 0) {
            return;
        }
        for (int var4 = 0; var4 < 257; var4++) {
            int var5 = 0;
            int var6 = var4 << 4;
            for (int var7 = 0; var7 < var3 && this.field4562[var7][0] <= var6; var7++) {
                var5++;
            }
            int var9;
            int var10;
            int var11;
            if (var3 <= var5) {
                int[] var8 = this.field4562[var3 - 1];
                var9 = var8[2];
                var10 = var8[3];
                var11 = var8[1];
            } else {
                int[] var12 = this.field4562[var5];
                if (var5 > 0) {
                    int[] var13 = this.field4562[var5 - 1];
                    int var14 = (var6 - var13[0] << 12) / (var12[0] - var13[0]);
                    int var15 = 4096 - var14;
                    var10 = var12[3] * var14 + var13[3] * var15 >> 12;
                    var11 = var12[1] * var14 + (var13[1] * var15) >> 12;
                    var9 = var12[2] * var14 + var13[2] * var15 >> 12;
                } else {
                    var9 = var12[2];
                    var11 = var12[1];
                    var10 = var12[3];
                }
            }
            int var16 = var10 >> 4;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 255) {
                var16 = 255;
            }
            int var17 = var11 >> 4;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            int var18 = var9 >> 4;
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            this.field4564[var4] = class301.method2139(class301.method2139(var18 << 8, var17 << 16), var16);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIII)I", line = 448)
    public static final int method1844(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        field4569++;
        if (arg2 >= -33) {
            return 114;
        } else if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return 7 - arg3;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIII)V", line = 482)
    public static final void method1845(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4568++;
        class52 var5 = (class52) class322.field5623.method2248(125);
        if (arg0 <= 39) {
            return;
        }
        while (var5 != null) {
            class181.method1403(var5, arg1, arg3, arg2, -1, arg4);
            var5 = (class52) class322.field5623.method2240(1138);
        }
        for (class52 var6 = (class52) class60.field1263.method2248(-57); var6 != null; var6 = (class52) class60.field1263.method2240(1138)) {
            byte var7 = 1;
            class34 var8 = var6.field1073.method15(51);
            if (var6.field1073.field25 == var8.field765) {
                var7 = 0;
            } else if (var6.field1073.field25 == var8.field751 || var6.field1073.field25 == var8.field759 || var6.field1073.field25 == var8.field782 || var6.field1073.field25 == var8.field758) {
                var7 = 2;
            } else if (var6.field1073.field25 == var8.field785 || var6.field1073.field25 == var8.field761 || var6.field1073.field25 == var8.field779 || var6.field1073.field25 == var8.field757) {
                var7 = 3;
            }
            if (var6.field1094 != var7) {
                int var9 = class130.method1027(var6.field1073, (byte) -67);
                if (var6.field1084 != var9) {
                    if (var6.field1083 != null) {
                        class322.field5630.method1957(var6.field1083);
                        var6.field1083 = null;
                    }
                    var6.field1084 = var9;
                }
                var6.field1094 = var7;
            }
            var6.field1079 = var6.field1073.field86;
            var6.field1078 = var6.field1073.field86 + (var6.field1073.method3((byte) -106) * 64);
            var6.field1076 = var6.field1073.field79;
            var6.field1068 = var6.field1073.field79 + var6.field1073.method3((byte) -90) * 64;
            class181.method1403(var6, arg1, arg3, arg2, -1, arg4);
        }
        for (class52 var10 = (class52) class15.field438.method609(-26368); var10 != null; var10 = (class52) class15.field438.method604(2)) {
            class34 var11 = var10.field1101.method15(89);
            byte var12 = 1;
            if (var10.field1101.field25 == var11.field765) {
                var12 = 0;
            } else if (var10.field1101.field25 == var11.field751 || var10.field1101.field25 == var11.field759 || var10.field1101.field25 == var11.field782 || var10.field1101.field25 == var11.field758) {
                var12 = 2;
            } else if (var10.field1101.field25 == var11.field785 || var10.field1101.field25 == var11.field761 || var10.field1101.field25 == var11.field779 || var10.field1101.field25 == var11.field757) {
                var12 = 3;
            }
            if (var10.field1094 != var12) {
                int var13 = class253.method1810(false, var10.field1101);
                if (var10.field1084 != var13) {
                    if (var10.field1083 != null) {
                        class322.field5630.method1957(var10.field1083);
                        var10.field1083 = null;
                    }
                    var10.field1084 = var13;
                }
                var10.field1094 = var12;
            }
            var10.field1079 = var10.field1101.field86;
            var10.field1078 = var10.field1101.field86 + (var10.field1101.method3((byte) -126) * 64);
            var10.field1076 = var10.field1101.field79;
            var10.field1068 = var10.field1101.field79 + (var10.field1101.method3((byte) -122) * 64);
            class181.method1403(var10, arg1, arg3, arg2, -1, arg4);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(II)[[I", line = 598)
    public final int[][] method86(int arg0, int arg1) {
        field4563++;
        int var3 = -69 / ((-arg1 - 70) / 54);
        int[][] var4 = this.field1400.method1746((byte) -3, arg0);
        if (this.field1400.field4363) {
            int[] var5 = this.method624(arg0, -3, 0);
            int[] var6 = var4[1];
            int[] var7 = var4[0];
            int[] var8 = var4[2];
            for (int var9 = 0; var9 < class215.field3787; var9++) {
                int var10 = var5[var9] >> 4;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var10 > 256) {
                    var10 = 256;
                }
                int var11 = this.field4564[var10];
                var7[var9] = class52.method442(4080, var11 >> 12);
                var6[var9] = class52.method442(65280, var11) >> 4;
                var8[var9] = class52.method442(4080, var11 << 4);
            }
        }
        return var4;
    }
}
