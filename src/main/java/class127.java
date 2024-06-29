import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class127 {

    @OriginalMember(owner = "client!um", name = "e", descriptor = "[I")
    private int[] field1960 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

    @OriginalMember(owner = "client!um", name = "v", descriptor = "[I")
    private int[] field1977 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

    @OriginalMember(owner = "client!um", name = "k", descriptor = "Lqha;")
    private class231 field1966;

    @OriginalMember(owner = "client!um", name = "w", descriptor = "I")
    public int field1978;

    @OriginalMember(owner = "client!um", name = "m", descriptor = "Z")
    public boolean field1968;

    @OriginalMember(owner = "client!um", name = "A", descriptor = "I")
    public int field1982;

    @OriginalMember(owner = "client!um", name = "n", descriptor = "Lau;")
    private class245 field1969;

    @OriginalMember(owner = "client!um", name = "h", descriptor = "I")
    public int field1963;

    @OriginalMember(owner = "client!um", name = "l", descriptor = "[[[B")
    private byte[][][] field1967;

    @OriginalMember(owner = "client!um", name = "g", descriptor = "[[[I")
    public int[][][] field1962;

    @OriginalMember(owner = "client!um", name = "o", descriptor = "[[[B")
    public byte[][][] field1970;

    @OriginalMember(owner = "client!um", name = "G", descriptor = "[[[B")
    private byte[][][] field1988;

    @OriginalMember(owner = "client!um", name = "d", descriptor = "[[[B")
    private byte[][][] field1959;

    @OriginalMember(owner = "client!um", name = "c", descriptor = "[[[B")
    private byte[][][] field1958;

    @OriginalMember(owner = "client!um", name = "u", descriptor = "Lwe;")
    public static class357 field1976 = new class357();

    @OriginalMember(owner = "client!um", name = "B", descriptor = "Lcb;")
    public static class631 field1983 = new class631(25, 7);

    @OriginalMember(owner = "client!um", name = "D", descriptor = "Lraa;")
    public static class353 field1985 = null;

    @OriginalMember(owner = "client!um", name = "C", descriptor = "Z")
    public static boolean field1984 = false;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!um", name = "b", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!um", name = "f", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!um", name = "i", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!um", name = "j", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!um", name = "p", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!um", name = "q", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!um", name = "r", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!um", name = "t", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!um", name = "x", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!um", name = "y", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!um", name = "z", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!um", name = "E", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!um", name = "F", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!um", name = "s", descriptor = "[[[B")
    public byte[][][] field1974;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIIII)V", line = 3)
    public final void method974(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1987++;
        for (int var7 = arg5; var7 < (arg4 + arg5); var7++) {
            for (int var10 = arg2; var10 < (arg2 + arg3); var10++) {
                if (var10 >= 0 && this.field1978 > var10 && var7 >= 0 && var7 < this.field1982) {
                    this.field1962[arg1][var10][var7] = arg1 > 0 ? this.field1962[arg1 - 1][var10][var7] - 960 : 0;
                }
            }
        }
        if (arg2 > 0 && this.field1978 > arg2) {
            for (int var8 = arg5 + 1; var8 < arg5 + arg4; var8++) {
                if (var8 >= 0 && var8 < this.field1982) {
                    this.field1962[arg1][arg2][var8] = this.field1962[arg1][arg2 - 1][var8];
                }
            }
        }
        if (arg0 != 1) {
            this.method982(null, null, null, (byte) -36);
        }
        if (arg5 > 0 && arg5 < this.field1982) {
            for (int var9 = arg2 + 1; var9 < arg2 + arg3; var9++) {
                if (var9 >= 0 && var9 < this.field1978) {
                    this.field1962[arg1][var9][arg5] = this.field1962[arg1][var9][arg5 - 1];
                }
            }
        }
        if (arg2 < 0 || arg5 < 0 || this.field1978 <= arg2 || arg5 >= this.field1982) {
            return;
        }
        if (arg1 == 0) {
            if (arg2 <= 0 || this.field1962[arg1][arg2 - 1][arg5] == 0) {
                if (arg5 > 0 && this.field1962[arg1][arg2][arg5 - 1] != 0) {
                    this.field1962[arg1][arg2][arg5] = this.field1962[arg1][arg2][arg5 - 1];
                    return;
                }
                if (arg2 > 0 && arg5 > 0 && this.field1962[arg1][arg2 - 1][arg5 - 1] != 0) {
                    this.field1962[arg1][arg2][arg5] = this.field1962[arg1][arg2 - 1][arg5 - 1];
                    return;
                }
                return;
            }
            this.field1962[arg1][arg2][arg5] = this.field1962[arg1][arg2 - 1][arg5];
        } else if (arg2 <= 0 || this.field1962[arg1 - 1][arg2 - 1][arg5] == this.field1962[arg1][arg2 - 1][arg5]) {
            if (arg5 > 0 && this.field1962[arg1 - 1][arg2][arg5 - 1] != this.field1962[arg1][arg2][arg5 - 1]) {
                this.field1962[arg1][arg2][arg5] = this.field1962[arg1][arg2][arg5 - 1];
                return;
            }
            if (arg2 > 0 && arg5 > 0 && this.field1962[arg1][arg2 - 1][arg5 - 1] != this.field1962[arg1 - 1][arg2 - 1][arg5 - 1]) {
                this.field1962[arg1][arg2][arg5] = this.field1962[arg1][arg2 - 1][arg5 - 1];
                return;
            }
        } else {
            this.field1962[arg1][arg2][arg5] = this.field1962[arg1][arg2 - 1][arg5];
            return;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(B)V", line = 103)
    public static final void method975(byte arg0) {
        class497.field7205.method1604(83);
        field1956++;
        class338.field4951.method1702((byte) 124);
        class174.field2980.method994(false);
        class576.field8167.method3073(false);
        class740.field10382.method3429((byte) 13);
        class556.field7917.method742((byte) 36);
        class83.field1219.method2356(true);
        class41.field718.method1528(false);
        class52.field836.method1717((byte) -9);
        class346.field5119.method3696(0);
        class581.field8222.method1549(32);
        class629.field8840.method3848(6);
        class617.field8704.method2556(-126);
        class122.field1882.method3641(2);
        class382.field5728.method1992(23272);
        class691.field9803.method2538(false);
        class416.field6122.method4208((byte) 123);
        class451.field6568.method2394(255);
        class520.field7513.method1411((byte) -110);
        class184.field3100.method138(100);
        class430.field6290.method3993(-1);
        class23.method122((byte) -125);
        class604.method3459(0);
        class195.method1470(0);
        class458.method2806(85);
        if (class478.field6941 != class209.field3494) {
            for (int var1 = 0; var1 < class115.field1791.length; var1++) {
                class115.field1791[var1] = null;
            }
            class565.field8010 = 0;
        }
        class599.method3443(true);
        class632.method3581((byte) -115);
        class595.method3417((byte) -13);
        class390.method2439(true);
        int var2 = 2 / ((-arg0 - 33) / 41);
        class700.method3889(12294);
        class464.field6775.method76(-95);
        class364.field5573.method427();
        class435.method2691(-105);
        class187.method1425(0);
        class189.field3192.method2611((byte) 119);
        class131.field2130.method2611((byte) 108);
        class564.field7992.method2611((byte) 109);
        class460.field6677.method2611((byte) 111);
        class431.field6296.method2611((byte) 124);
        class193.field3342.method2611((byte) 99);
        class521.field7518.method2611((byte) 93);
        class532.field7662.method2611((byte) 125);
        class101.field1494.method2611((byte) 125);
        class159.field2460.method2611((byte) 126);
        class236.field3799.method2611((byte) 101);
        class110.field1724.method2611((byte) 98);
        class403.field5986.method2611((byte) 114);
        class312.field4704.method2611((byte) 117);
        class518.field7495.method2611((byte) 122);
        class621.field8730.method2611((byte) 89);
        class86.field1267.method2611((byte) 102);
        class68.field1065.method2611((byte) 124);
        class17.field182.method2611((byte) 121);
        class666.field9462.method2611((byte) 101);
        class383.field5748.method2611((byte) 125);
        class602.field8511.method2611((byte) 100);
        class92.field1375.method2611((byte) 102);
        class147.field2306.method2611((byte) 109);
        class714.field10034.method2611((byte) 102);
        class735.field10364.method2611((byte) 119);
        class695.field9862.method2611((byte) 110);
        class371.field5635.method2611((byte) 89);
        class686.field9693.method2611((byte) 112);
        class386.field5772.method2611((byte) 111);
        class182.field3079.method2611((byte) 101);
        class172.field2951.method2611((byte) 121);
        class637.field8949.method2611((byte) 107);
        class453.field6589.method76(6);
        class341.field5052.method76(21);
        class65.field1041.method76(51);
        class527.field7586.method76(-126);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I[Lup;IIIILofa;)V", line = 197)
    public final void method976(int arg0, class238[] arg1, int arg2, int arg3, int arg4, int arg5, class301 arg6) {
        field1981++;
        if (!this.field1968) {
            for (int var8 = 0; var8 < 4; var8++) {
                class238 var9 = arg1[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg3 + var10;
                        int var13 = arg4 + var11;
                        if (var12 >= 0 && var12 < this.field1978 && var13 >= 0 && var13 < this.field1982) {
                            var9.method1639(var12, var13, -2097153);
                        }
                    }
                }
            }
        }
        int var14 = -15 / ((12 - arg2) / 33);
        int var15 = arg3 + arg5;
        int var16 = arg0 + arg4;
        for (int var17 = 0; var17 < this.field1963; var17++) {
            for (int var18 = 0; var18 < 64; var18++) {
                for (int var19 = 0; var19 < 64; var19++) {
                    this.method988(var16 + var19, false, 0, 6, var17, arg3 + var18, var15 + var18, 0, 0, arg4 + var19, arg6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Ls;Lha;Ls;II[[ILs;)V", line = 276)
    private final void method977(class339 arg0, class544 arg1, class339 arg2, int arg3, int arg4, int[][] arg5, class339 arg6) {
        for (int var8 = 0; var8 < this.field1978; var8++) {
            for (int var10 = 0; var10 < this.field1982; var10++) {
                if (class435.field6352 == -1 || class26.method147((byte) -30, var10, class435.field6352, arg4, var8)) {
                    byte var11 = this.field1988[arg4][var8][var10];
                    byte var12 = this.field1958[arg4][var8][var10];
                    int var13 = this.field1967[arg4][var8][var10] & 0xFF;
                    int var14 = this.field1959[arg4][var8][var10] & 0xFF;
                    class658 var15 = var13 == 0 ? null : this.field1966.method1607(92, var13 - 1);
                    if (var11 == 0 && var15 == null) {
                        var11 = 12;
                    }
                    class52 var16 = var14 == 0 ? null : this.field1969.method1697((byte) -93, var14 - 1);
                    class658 var17 = var15;
                    if (var15 != null && var15.field9372 == -1 && var15.field9359 == -1) {
                        var17 = var15;
                        var15 = null;
                    }
                    if (var15 != null || var16 != null) {
                        int var18 = class483.field6973[var11];
                        int var19 = class202.field3427[var11];
                        int var20 = (var16 == null ? 0 : var18) + (var15 == null ? 0 : var19);
                        int var21 = 0;
                        int var22 = 0;
                        int var23 = var15 == null ? -1 : var15.field9374;
                        int var24 = var16 == null ? -1 : var16.field830;
                        int[] var25 = new int[var20];
                        int[] var26 = new int[var20];
                        int[] var27 = new int[var20];
                        int[] var28 = new int[var20];
                        int[] var29 = new int[var20];
                        int[] var30 = new int[var20];
                        int[] var31 = var15 == null || var15.field9359 == -1 ? null : new int[var20];
                        if (var15 == null) {
                            var22 += var19;
                        } else {
                            for (int var32 = 0; var32 < var19; var32++) {
                                var25[var21] = class140.field2189[var11][var22];
                                var26[var21] = class735.field10360[var11][var22];
                                var27[var21] = class213.field3529[var11][var22];
                                var29[var21] = var23;
                                var30[var21] = var15.field9371;
                                var28[var21] = var15.field9372;
                                if (var31 != null) {
                                    var31[var21] = var15.field9359;
                                }
                                var22++;
                                var21++;
                            }
                            if (!this.field1968 && arg4 == 0) {
                                class199.method1490(var8, var10, var15.field9362, var15.field9361 * 8, var15.field9356);
                            }
                        }
                        if (var16 != null) {
                            for (int var33 = 0; var33 < var18; var33++) {
                                var25[var21] = class140.field2189[var11][var22];
                                var26[var21] = class735.field10360[var11][var22];
                                var27[var21] = class213.field3529[var11][var22];
                                var29[var21] = var24;
                                var30[var21] = var16.field827;
                                var28[var21] = arg5[var8][var10];
                                if (var31 != null) {
                                    var31[var21] = var28[var21];
                                }
                                var22++;
                                var21++;
                            }
                        }
                        int var34 = this.field1960.length;
                        int[] var35 = new int[var34];
                        int[] var36 = new int[var34];
                        int[] var37 = arg2 == null ? null : new int[var34];
                        int[] var38 = arg2 == null && arg0 == null ? null : new int[var34];
                        for (int var39 = 0; var39 < var34; var39++) {
                            int var49 = this.field1960[var39];
                            int var50 = this.field1977[var39];
                            if (var12 == 0) {
                                var35[var39] = var49;
                                var36[var39] = var50;
                            } else if (var12 == 1) {
                                var35[var39] = var50;
                                var36[var39] = 512 - var49;
                            } else if (var12 == 2) {
                                var35[var39] = 512 - var49;
                                var36[var39] = 512 - var50;
                            } else if (var12 == 3) {
                                var35[var39] = 512 - var50;
                                var36[var39] = var49;
                            }
                            if (var37 != null && class346.field5114[var11][var39]) {
                                int var53 = (var8 << 9) + var35[var39];
                                int var54 = (var10 << 9) + var36[var39];
                                var37[var39] = arg2.method2162(var54, 1, var53) - arg6.method2162(var54, 1, var53);
                            }
                            if (var38 != null) {
                                if (arg2 != null && !class346.field5114[var11][var39]) {
                                    int var55 = (var8 << 9) + var35[var39];
                                    int var56 = (var10 << 9) + var36[var39];
                                    var38[var39] = arg6.method2162(var56, 1, var55) - arg2.method2162(var56, 1, var55);
                                } else if (arg0 != null && !class455.field6627[var11][var39]) {
                                    int var57 = (var8 << 9) + var35[var39];
                                    int var58 = (var10 << 9) + var36[var39];
                                    var38[var39] = arg0.method2162(var58, 1, var57) - arg6.method2162(var58, 1, var57);
                                }
                            }
                        }
                        int var40 = arg6.method2160(-71, var10, var8);
                        int var41 = arg6.method2160(-83, var10, var8 + 1);
                        int var42 = arg6.method2160(-74, var10 + 1, var8 + 1);
                        int var43 = arg6.method2160(-87, var10 + 1, var8);
                        boolean var44 = class584.method3365(false, var8, var10);
                        if (var44 && arg4 > 1 || !var44 && arg4 > 0) {
                            boolean var45 = true;
                            if (var16 != null && !var16.field840) {
                                var45 = false;
                            } else if (var14 == 0 && var11 != 0) {
                                var45 = false;
                            } else if (var13 > 0 && var17 != null && !var17.field9367) {
                                var45 = false;
                            }
                            if (var45 && var40 == var41 && var40 == var42 && var40 == var43) {
                                this.field1970[arg4][var8][var10] = (byte) class112.method903(this.field1970[arg4][var8][var10], 4);
                            }
                        }
                        int var46 = 0;
                        int var47 = 0;
                        int var48 = 0;
                        if (this.field1968) {
                            var46 = class675.method3766(var8, var10);
                            var47 = class567.method3295(var8, var10);
                            var48 = class388.method2427(var8, var10);
                        }
                        arg6.method632(var8, var10, var35, var37, var36, var38, var25, var26, var27, var28, var31, var29, var30, var46, var47, var48, false);
                        class736.method4107(arg4, var8, var10);
                    }
                }
            }
        }
        field1965++;
        int var9 = 7 % ((75 - arg3) / 32);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(II[Lup;IIIIILofa;B)V", line = 559)
    public final void method978(int arg0, int arg1, class238[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class301 arg8, byte arg9) {
        field1980++;
        int var11 = (arg1 & 0x7) * 8;
        int var12 = (arg4 & 0x7) * 8;
        if (!this.field1968) {
            class238 var13 = arg2[arg6];
            for (int var14 = 0; var14 < 8; var14++) {
                for (int var15 = 0; var15 < 8; var15++) {
                    int var16 = class673.method3759((byte) 85, var14 & 0x7, var15 & 0x7, arg7) + arg5;
                    int var17 = arg0 + class671.method3753(var15 & 0x7, var14 & 0x7, arg7, (byte) -126);
                    if (var16 > 0 && this.field1978 - 1 > var16 && var17 > 0 && var17 < this.field1982 - 1) {
                        var13.method1639(var16, var17, -2097153);
                    }
                }
            }
        }
        int var18 = arg1 & 0x1FFFFFF8 << 3;
        int var19 = arg4 & 0x1FFFFFF8 << 3;
        byte var20 = 0;
        byte var21 = 0;
        if (arg7 == 1) {
            var21 = 1;
        } else if (arg7 == 2) {
            var21 = 1;
            var20 = 1;
        } else if (arg7 == 3) {
            var20 = 1;
        }
        if (arg9 <= 121) {
            return;
        }
        for (int var22 = 0; var22 < this.field1963; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg3 == var22 && var11 <= var23 && (var11 + 8) >= var23 && var12 <= var24 && var12 + 8 >= var24) {
                        int var25;
                        int var26;
                        if ((var11 + 8) == var23 || (var12 + 8) == var24) {
                            if (arg7 == 0) {
                                var25 = var23 + arg5 - var11;
                                var26 = arg0 + var24 - var12;
                            } else if (arg7 == 1) {
                                var26 = var11 + arg0 + 8 - var23;
                                var25 = arg5 + var24 - var12;
                            } else if (arg7 == 2) {
                                var25 = arg5 + var11 + 8 - var23;
                                var26 = arg0 + 8 - (var24 - var12);
                            } else {
                                var26 = arg0 + var23 - var11;
                                var25 = arg5 + var12 + 8 - var24;
                            }
                            this.method988(var19 + var24, true, 0, 6, arg6, var25, var18 + var23, 0, 0, var26, arg8);
                        } else {
                            var25 = class673.method3759((byte) -120, var23 & 0x7, var24 & 0x7, arg7) + arg5;
                            var26 = class671.method3753(var24 & 0x7, var23 & 0x7, arg7, (byte) -128) + arg0;
                            this.method988(var19 + var24, false, arg7, 6, arg6, var25, var18 + var23, var21, var20, var26, arg8);
                        }
                        if (var23 == 63 || var24 == 63) {
                            byte var27 = 1;
                            if (var23 == 63 && var24 == 63) {
                                var27 = 3;
                            }
                            for (int var28 = 0; var28 < var27; var28++) {
                                int var29 = var23;
                                int var30 = var24;
                                if (var28 == 0) {
                                    var30 = var24 == 63 ? 64 : var24;
                                    var29 = var23 == 63 ? 64 : var23;
                                } else if (var28 == 1) {
                                    var29 = 64;
                                } else if (var28 == 2) {
                                    var30 = 64;
                                }
                                int var31;
                                int var32;
                                if (arg7 == 0) {
                                    var31 = arg0 - (var12 - var30);
                                    var32 = arg5 + var29 - var11;
                                } else if (arg7 == 1) {
                                    var31 = arg0 + var11 - (var29 - 8);
                                    var32 = arg5 + var30 - var12;
                                } else if (arg7 == 2) {
                                    var31 = arg0 + var12 + 8 - var30;
                                    var32 = arg5 + 8 - (var29 - var11);
                                } else {
                                    var32 = arg5 + var12 + 8 - var30;
                                    var31 = var29 + arg0 - var11;
                                }
                                if (var32 >= 0 && this.field1978 > var32 && var31 >= 0 && var31 < this.field1982) {
                                    this.field1962[arg6][var32][var31] = this.field1962[arg6][var20 + var25][var21 + var26];
                                }
                            }
                        }
                    } else {
                        this.method988(0, false, 0, 6, 0, -1, 0, 0, 0, -1, arg8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ZIIII)V", line = 765)
    public final void method979(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var6 = 0; var6 < this.field1963; var6++) {
            this.method974(1, var6, arg3, arg2, arg4, arg1);
        }
        field1971++;
        if (arg0) {
            this.field1978 = -5;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIILmo;)V", line = 783)
    public static final void method980(int arg0, int arg1, int arg2, int arg3, class733 arg4) {
        class114 var5 = class378.method2384(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        arg4.field9477 = (arg1 << class662.field9425) + class581.field8224;
        arg4.field9474 = arg3;
        arg4.field9475 = (arg2 << class662.field9425) + class581.field8224;
        var5.field1771 = arg4;
        int var6 = class211.field3511 == class152.field2374 ? 1 : 0;
        if (arg4.method95(0)) {
            if (arg4.method86(0)) {
                arg4.field9472 = class231.field3722[var6];
                class231.field3722[var6] = arg4;
                return;
            }
            arg4.field9472 = class335.field4904[var6];
            class335.field4904[var6] = arg4;
            class245.field3947 = true;
            return;
        }
        arg4.field9472 = class24.field240[var6];
        class24.field240[var6] = arg4;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IIB)V", line = 823)
    public static final void method981(int arg0, int arg1, byte arg2) {
        field1979++;
        if (class442.field6421 != 0) {
            if (arg1 < 0) {
                for (int var3 = 0; var3 < 16; var3++) {
                    class104.field1539[var3] = arg0;
                }
            } else {
                class104.field1539[arg1] = arg0;
            }
        }
        if (arg2 >= 107) {
            class208.field3480.method2330(arg0, (byte) 5, arg1);
        }
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "(IIIZLqha;Lau;)V", line = 2792)
    public class127(int arg0, int arg1, int arg2, boolean arg3, class231 arg4, class245 arg5) {
        this.field1966 = arg4;
        this.field1978 = arg1;
        this.field1968 = arg3;
        this.field1982 = arg2;
        this.field1969 = arg5;
        this.field1963 = arg0;
        this.field1967 = new byte[this.field1963][this.field1978][this.field1982];
        this.field1962 = new int[this.field1963][this.field1978 + 1][this.field1982 + 1];
        this.field1970 = new byte[this.field1963][this.field1978 + 1][this.field1982 + 1];
        this.field1988 = new byte[this.field1963][this.field1978][this.field1982];
        this.field1959 = new byte[this.field1963][this.field1978][this.field1982];
        this.field1958 = new byte[this.field1963][this.field1978][this.field1982];
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lha;[Lup;[[[IB)V", line = 859)
    public final void method982(class544 arg0, class238[] arg1, int[][][] arg2, byte arg3) {
        if (!this.field1968) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field1978; var6++) {
                    for (int var7 = 0; var7 < this.field1982; var7++) {
                        if ((class434.field6341[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class434.field6341[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg1[var8].method1653(var6, (byte) 7, var7);
                            }
                        }
                    }
                }
            }
        }
        field1972++;
        int var9 = 0;
        if (arg3 != 36) {
            this.method986(null, (byte) -75, 38);
        }
        while (var9 < this.field1963) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field1968) {
                if (class55.field873) {
                    var11 |= 0x8;
                }
                if (class691.field9801) {
                    var10 |= 0x2;
                }
                if (class130.field2128 != 0) {
                    var10 |= 0x1;
                    if (var9 == 0 | class281.field4367) {
                        var11 |= 0x10;
                    }
                }
            }
            if (class691.field9801) {
                var11 |= 0x7;
            }
            if (!class118.field1815) {
                var11 |= 0x20;
            }
            int[][] var12 = arg2 == null || var9 >= arg2.length ? this.field1962[var9] : arg2[var9];
            class542.method3173(var9, arg0.method419(this.field1978, this.field1982, this.field1962[var9], var12, 512, var10, var11));
            var9++;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(BC)B", line = 959)
    public static final byte method983(byte arg0, char arg1) {
        field1973++;
        int var2 = -19 / ((arg0 - 49) / 52);
        byte var3;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            var3 = (byte) arg1;
        } else if (arg1 == '€') {
            var3 = -128;
        } else if (arg1 == '‚') {
            var3 = -126;
        } else if (arg1 == 'ƒ') {
            var3 = -125;
        } else if (arg1 == '„') {
            var3 = -124;
        } else if (arg1 == '…') {
            var3 = -123;
        } else if (arg1 == '†') {
            var3 = -122;
        } else if (arg1 == '‡') {
            var3 = -121;
        } else if (arg1 == 'ˆ') {
            var3 = -120;
        } else if (arg1 == '‰') {
            var3 = -119;
        } else if (arg1 == 'Š') {
            var3 = -118;
        } else if (arg1 == '‹') {
            var3 = -117;
        } else if (arg1 == 'Œ') {
            var3 = -116;
        } else if (arg1 == 'Ž') {
            var3 = -114;
        } else if (arg1 == '‘') {
            var3 = -111;
        } else if (arg1 == '’') {
            var3 = -110;
        } else if (arg1 == '“') {
            var3 = -109;
        } else if (arg1 == '”') {
            var3 = -108;
        } else if (arg1 == '•') {
            var3 = -107;
        } else if (arg1 == '–') {
            var3 = -106;
        } else if (arg1 == '—') {
            var3 = -105;
        } else if (arg1 == '˜') {
            var3 = -104;
        } else if (arg1 == '™') {
            var3 = -103;
        } else if (arg1 == 'š') {
            var3 = -102;
        } else if (arg1 == '›') {
            var3 = -101;
        } else if (arg1 == 'œ') {
            var3 = -100;
        } else if (arg1 == 'ž') {
            var3 = -98;
        } else if (arg1 == 'Ÿ') {
            var3 = -97;
        } else {
            var3 = 63;
        }
        return var3;
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(B)V", line = 1084)
    public static void method984(byte arg0) {
        field1983 = null;
        field1985 = null;
        field1976 = null;
        if (arg0 <= 52) {
            field1976 = null;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ILha;Ls;Ls;)V", line = 1098)
    public final void method985(int arg0, class544 arg1, class339 arg2, class339 arg3) {
        field1961++;
        if (class625.field8763 == null || class625.field8763.length != this.field1982) {
            class625.field8763 = new int[this.field1982];
            class717.field10055 = new int[this.field1982];
            class685.field9688 = new int[this.field1982];
            class384.field5756 = new int[this.field1982];
            class702.field9934 = new int[this.field1982];
        }
        int[][] var5 = new int[this.field1978][this.field1982];
        for (int var6 = 0; var6 < this.field1963; var6++) {
            for (int var8 = 0; var8 < this.field1982; var8++) {
                class625.field8763[var8] = 0;
                class384.field5756[var8] = 0;
                class717.field10055[var8] = 0;
                class702.field9934[var8] = 0;
                class685.field9688[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field1978; var9++) {
                for (int var10 = 0; var10 < this.field1982; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (this.field1978 > var19) {
                        int var20 = this.field1959[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class52 var21 = this.field1969.method1697((byte) -121, var20 - 1);
                            class625.field8763[var10] += var21.field841;
                            class384.field5756[var10] += var21.field831;
                            class717.field10055[var10] += var21.field828;
                            class702.field9934[var10] += var21.field839;
                            var10002 = class685.field9688[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field1959[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class52 var24 = this.field1969.method1697((byte) -88, var23 - 1);
                            class625.field8763[var10] -= var24.field841;
                            class384.field5756[var10] -= var24.field831;
                            class717.field10055[var10] -= var24.field828;
                            class702.field9934[var10] -= var24.field839;
                            var10002 = class685.field9688[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field1982; var16++) {
                        int var17 = var16 + 5;
                        if (this.field1982 > var17) {
                            var11 += class625.field8763[var17];
                            var14 += class702.field9934[var17];
                            var15 += class685.field9688[var17];
                            var13 += class717.field10055[var17];
                            var12 += class384.field5756[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var13 -= class717.field10055[var18];
                            var11 -= class625.field8763[var18];
                            var12 -= class384.field5756[var18];
                            var14 -= class702.field9934[var18];
                            var15 -= class685.field9688[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class476.method2889(var11 * 256 / var14, 197891498, var12 / var15, var13 / var15);
                        }
                    }
                }
            }
            if (class35.field324) {
                this.method989(var6, 112, var6 == 0 ? arg2 : null, arg1, var5, var6 == 0 ? arg3 : null, class211.field3511[var6]);
            } else {
                this.method977(var6 == 0 ? arg2 : null, arg1, var6 == 0 ? arg3 : null, 5, var6, var5, class211.field3511[var6]);
            }
            this.field1959[var6] = null;
            this.field1967[var6] = null;
            this.field1988[var6] = null;
            this.field1958[var6] = null;
        }
        if (!this.field1968) {
            if (class130.field2128 != 0) {
                class49.method485();
            }
            if (class691.field9801) {
                class692.method3859();
            }
        }
        for (int var7 = 0; var7 < this.field1963; var7++) {
            class211.field3511[var7].method615();
        }
        if (arg0 != 25305) {
            method984((byte) -115);
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "([[IBI)V", line = 1276)
    public final void method986(int[][] arg0, byte arg1, int arg2) {
        field1975++;
        int[][] var4 = this.field1962[arg2];
        int var5 = 0;
        if (arg1 != 105) {
            return;
        }
        while (this.field1978 + 1 > var5) {
            for (int var6 = 0; var6 < this.field1982 + 1; var6++) {
                var4[var5][var6] += arg0[var5][var6];
            }
            var5++;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I[[BILmw;Lha;II[[BZ[[B[ZILrc;I)V", line = 1307)
    private final void method987(int arg0, byte[][] arg1, int arg2, class658 arg3, class544 arg4, int arg5, int arg6, byte[][] arg7, boolean arg8, byte[][] arg9, boolean[] arg10, int arg11, class52 arg12, int arg13) {
        field1964++;
        boolean[] var15 = arg3 != null && arg3.field9363 ? class694.field9848[arg13] : class104.field1538[arg13];
        if (arg0 > 0) {
            if (arg11 > 0) {
                int var16 = arg7[arg11 - 1][arg0 - 1] & 0xFF;
                if (var16 > 0) {
                    class658 var17 = this.field1966.method1607(69, var16 - 1);
                    if (var17.field9372 != -1 && var17.field9363) {
                        byte var18 = arg1[arg11 - 1][arg0 - 1];
                        int var19 = arg9[arg11 - 1][arg0 - 1] * 2 + 4 & 0x7;
                        int var20 = class474.method2884(var17, 12, arg4);
                        if (class346.field5114[var18][var19]) {
                            class17.field184[0] = var17.field9372;
                            class94.field1405[0] = var20;
                            class448.field6539[0] = var17.field9374;
                            class128.field1990[0] = var17.field9371;
                            class301.field4587[0] = var17.field9366;
                            class56.field887[0] = 256;
                        }
                    }
                }
            }
            if ((arg5 - 1) > arg11) {
                int var21 = arg7[arg11 + 1][arg0 - 1] & 0xFF;
                if (var21 > 0) {
                    class658 var22 = this.field1966.method1607(111, var21 - 1);
                    if (var22.field9372 != -1 && var22.field9363) {
                        byte var23 = arg1[arg11 + 1][arg0 - 1];
                        int var24 = (arg9[arg11 + 1][arg0 - 1] * 2) + 6 & 0x7;
                        int var25 = class474.method2884(var22, -117, arg4);
                        if (class346.field5114[var23][var24]) {
                            class17.field184[2] = var22.field9372;
                            class94.field1405[2] = var25;
                            class448.field6539[2] = var22.field9374;
                            class128.field1990[2] = var22.field9371;
                            class301.field4587[2] = var22.field9366;
                            class56.field887[2] = 512;
                        }
                    }
                }
            }
        }
        if (arg8) {
            field1976 = null;
        }
        if (arg2 - 1 > arg0) {
            if (arg11 > 0) {
                int var26 = arg7[arg11 - 1][arg0 + 1] & 0xFF;
                if (var26 > 0) {
                    class658 var27 = this.field1966.method1607(119, var26 - 1);
                    if (var27.field9372 != -1 && var27.field9363) {
                        byte var28 = arg1[arg11 - 1][arg0 + 1];
                        int var29 = (arg9[arg11 - 1][arg0 + 1] * 2) + 2 & 0x7;
                        int var30 = class474.method2884(var27, 126, arg4);
                        if (class346.field5114[var28][var29]) {
                            class17.field184[6] = var27.field9372;
                            class94.field1405[6] = var30;
                            class448.field6539[6] = var27.field9374;
                            class128.field1990[6] = var27.field9371;
                            class301.field4587[6] = var27.field9366;
                            class56.field887[6] = 64;
                        }
                    }
                }
            }
            if ((arg5 - 1) > arg11) {
                int var31 = arg7[arg11 + 1][arg0 + 1] & 0xFF;
                if (var31 > 0) {
                    class658 var32 = this.field1966.method1607(49, var31 - 1);
                    if (var32.field9372 != -1 && var32.field9363) {
                        byte var33 = arg1[arg11 + 1][arg0 + 1];
                        int var34 = -(-(arg9[arg11 + 1][arg0 + 1] * 2)) & 0x7;
                        int var35 = class474.method2884(var32, -107, arg4);
                        if (class346.field5114[var33][var34]) {
                            class17.field184[4] = var32.field9372;
                            class94.field1405[4] = var35;
                            class448.field6539[4] = var32.field9374;
                            class128.field1990[4] = var32.field9371;
                            class301.field4587[4] = var32.field9366;
                            class56.field887[4] = 128;
                        }
                    }
                }
            }
        }
        if (arg0 > 0) {
            int var36 = arg7[arg11][arg0 - 1] & 0xFF;
            if (var36 > 0) {
                class658 var37 = this.field1966.method1607(45, var36 - 1);
                if (var37.field9372 != -1) {
                    byte var38 = arg1[arg11][arg0 - 1];
                    byte var39 = arg9[arg11][arg0 - 1];
                    if (var37.field9363) {
                        int var40 = 2;
                        int var41 = var39 * 2 + 4;
                        int var42 = class474.method2884(var37, 126, arg4);
                        for (int var43 = 0; var43 < 3; var43++) {
                            var41 &= 0x7;
                            var40 &= 0x7;
                            if (class346.field5114[var38][var41] && class301.field4587[var40] <= var37.field9366) {
                                class17.field184[var40] = var37.field9372;
                                class94.field1405[var40] = var42;
                                class448.field6539[var40] = var37.field9374;
                                class128.field1990[var40] = var37.field9371;
                                if (class301.field4587[var40] == var37.field9366) {
                                    class56.field887[var40] = class112.method903(class56.field887[var40], 32);
                                } else {
                                    class56.field887[var40] = 32;
                                }
                                class301.field4587[var40] = var37.field9366;
                            }
                            var41++;
                            var40--;
                        }
                        if (!var15[arg6 & 0x3]) {
                            arg10[0] = class694.field9848[var38][class636.method3603(var39 + 2, 3)];
                        }
                    } else if (!var15[arg6 & 0x3]) {
                        arg10[0] = class104.field1538[var38][class636.method3603(3, var39 + 2)];
                    }
                }
            }
        }
        if (arg0 < arg2 - 1) {
            int var44 = arg7[arg11][arg0 + 1] & 0xFF;
            if (var44 > 0) {
                class658 var45 = this.field1966.method1607(83, var44 - 1);
                if (var45.field9372 != -1) {
                    byte var46 = arg1[arg11][arg0 + 1];
                    byte var47 = arg9[arg11][arg0 + 1];
                    if (var45.field9363) {
                        int var48 = 4;
                        int var49 = var47 * 2 + 2;
                        int var50 = class474.method2884(var45, 126, arg4);
                        for (int var51 = 0; var51 < 3; var51++) {
                            var48 &= 0x7;
                            var49 &= 0x7;
                            if (class346.field5114[var46][var49] && var45.field9366 >= class301.field4587[var48]) {
                                class17.field184[var48] = var45.field9372;
                                class94.field1405[var48] = var50;
                                class448.field6539[var48] = var45.field9374;
                                class128.field1990[var48] = var45.field9371;
                                if (class301.field4587[var48] == var45.field9366) {
                                    class56.field887[var48] = class112.method903(class56.field887[var48], 16);
                                } else {
                                    class56.field887[var48] = 16;
                                }
                                class301.field4587[var48] = var45.field9366;
                            }
                            var48++;
                            var49--;
                        }
                        if (!var15[arg6 + 2 & 0x3]) {
                            arg10[2] = class694.field9848[var46][class636.method3603(var47, 3)];
                        }
                    } else if (!var15[arg6 + 2 & 0x3]) {
                        arg10[2] = class104.field1538[var46][class636.method3603(-(-var47), 3)];
                    }
                }
            }
        }
        if (arg11 > 0) {
            int var52 = arg7[arg11 - 1][arg0] & 0xFF;
            if (var52 > 0) {
                class658 var53 = this.field1966.method1607(120, var52 - 1);
                if (var53.field9372 != -1) {
                    byte var54 = arg1[arg11 - 1][arg0];
                    byte var55 = arg9[arg11 - 1][arg0];
                    if (var53.field9363) {
                        int var56 = 6;
                        int var57 = var55 * 2 + 4;
                        int var58 = class474.method2884(var53, 125, arg4);
                        for (int var59 = 0; var59 < 3; var59++) {
                            var56 &= 0x7;
                            var57 &= 0x7;
                            if (class346.field5114[var54][var57] && var53.field9366 >= class301.field4587[var56]) {
                                class17.field184[var56] = var53.field9372;
                                class94.field1405[var56] = var58;
                                class448.field6539[var56] = var53.field9374;
                                class128.field1990[var56] = var53.field9371;
                                if (class301.field4587[var56] == var53.field9366) {
                                    class56.field887[var56] = class112.method903(class56.field887[var56], 8);
                                } else {
                                    class56.field887[var56] = 8;
                                }
                                class301.field4587[var56] = var53.field9366;
                            }
                            var56++;
                            var57--;
                        }
                        if (!var15[arg6 + 3 & 0x3]) {
                            arg10[3] = class694.field9848[var54][class636.method3603(var55 + 1, 3)];
                        }
                    } else if (!var15[arg6 + 3 & 0x3]) {
                        arg10[3] = class104.field1538[var54][class636.method3603(3, var55 + 1)];
                    }
                }
            }
        }
        if (arg11 < (arg5 - 1)) {
            int var60 = arg7[arg11 + 1][arg0] & 0xFF;
            if (var60 > 0) {
                class658 var61 = this.field1966.method1607(101, var60 - 1);
                if (var61.field9372 != -1) {
                    byte var62 = arg1[arg11 + 1][arg0];
                    byte var63 = arg9[arg11 + 1][arg0];
                    if (var61.field9363) {
                        int var64 = 4;
                        int var65 = var63 * 2 + 6;
                        int var66 = class474.method2884(var61, -61, arg4);
                        for (int var67 = 0; var67 < 3; var67++) {
                            var64 &= 0x7;
                            var65 &= 0x7;
                            if (class346.field5114[var62][var65] && var61.field9366 >= class301.field4587[var64]) {
                                class17.field184[var64] = var61.field9372;
                                class94.field1405[var64] = var66;
                                class448.field6539[var64] = var61.field9374;
                                class128.field1990[var64] = var61.field9371;
                                if (class301.field4587[var64] == var61.field9366) {
                                    class56.field887[var64] = class112.method903(class56.field887[var64], 4);
                                } else {
                                    class56.field887[var64] = 4;
                                }
                                class301.field4587[var64] = var61.field9366;
                            }
                            var64--;
                            var65++;
                        }
                        if (!var15[arg6 + 1 & 0x3]) {
                            arg10[1] = class694.field9848[var62][class636.method3603(3, var63 + 3)];
                        }
                    } else if (!var15[arg6 + 1 & 0x3]) {
                        arg10[1] = class104.field1538[var62][class636.method3603(var63 + 3, 3)];
                    }
                }
            }
        }
        if (arg3 == null) {
            return;
        }
        int var68 = class474.method2884(arg3, -108, arg4);
        if (!arg3.field9363) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - (arg6 * 2) & 0x7;
            if (class346.field5114[arg13][var69] && arg3.field9366 >= class301.field4587[var70]) {
                class17.field184[var70] = arg3.field9372;
                class94.field1405[var70] = var68;
                class448.field6539[var70] = arg3.field9374;
                class128.field1990[var70] = arg3.field9371;
                if (class301.field4587[var70] == arg3.field9366) {
                    class56.field887[var70] = class112.method903(class56.field887[var70], 2);
                } else {
                    class56.field887[var70] = 2;
                }
                class301.field4587[var70] = arg3.field9366;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IZIIIIIIIILofa;)V", line = 1776)
    private final void method988(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class301 arg10) {
        if (arg2 == 1) {
            arg7 = 1;
        } else if (arg2 == 2) {
            arg8 = 1;
            arg7 = 1;
        } else if (arg2 == 3) {
            arg8 = 1;
        }
        field1957++;
        if (arg5 >= 0 && this.field1978 > arg5 && arg9 >= 0 && this.field1982 > arg9) {
            if (!this.field1968 && !arg1) {
                class434.field6341[arg4][arg5][arg9] = 0;
            }
            while (true) {
                int var12 = arg10.method1987(-110);
                if (var12 == 0) {
                    if (this.field1968) {
                        this.field1962[0][arg5 + arg8][arg9 + arg7] = 0;
                    } else if (arg4 == 0) {
                        this.field1962[0][arg5 + arg8][arg7 + arg9] = -class268.method1777(60, arg0 + 556238, arg6 + 932731) * 8 << 2;
                    } else {
                        this.field1962[arg4][arg5 + arg8][arg7 + arg9] = this.field1962[arg4 - 1][arg5 + arg8][arg9 + arg7] - 960;
                    }
                    break;
                }
                if (var12 == 1) {
                    int var13 = arg10.method1987(-80);
                    if (this.field1968) {
                        this.field1962[0][arg5 + arg8][arg7 + arg9] = var13 * 8 << 2;
                    } else {
                        if (var13 == 1) {
                            var13 = 0;
                        }
                        if (arg4 == 0) {
                            this.field1962[0][arg5 + arg8][arg7 + arg9] = -var13 * 8 << 2;
                        } else {
                            this.field1962[arg4][arg5 + arg8][arg9 + arg7] = this.field1962[arg4 - 1][arg5 + arg8][arg7 + arg9] - (var13 * 8 << 2);
                        }
                    }
                    break;
                }
                if (var12 <= 49) {
                    if (arg1) {
                        arg10.method1987(arg3 - 126);
                    } else {
                        this.field1967[arg4][arg5][arg9] = arg10.method1984(4);
                        this.field1988[arg4][arg5][arg9] = (byte) ((var12 - 2) / 4);
                        this.field1958[arg4][arg5][arg9] = (byte) class636.method3603(3, var12 + arg2 - 2);
                    }
                } else if (var12 <= 81) {
                    if (!this.field1968 && !arg1) {
                        class434.field6341[arg4][arg5][arg9] = (byte) (var12 - 49);
                    }
                } else if (!arg1) {
                    this.field1959[arg4][arg5][arg9] = (byte) (var12 - 81);
                }
            }
        } else {
            while (true) {
                int var14 = arg10.method1987(-33);
                if (var14 == 0) {
                    break;
                }
                if (var14 == 1) {
                    arg10.method1987(-78);
                    break;
                }
                if (var14 <= 49) {
                    arg10.method1987(-78);
                }
            }
        }
        if (arg3 != 6) {
            this.field1967 = null;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IILs;Lha;[[ILs;Ls;)V", line = 1904)
    private final void method989(int arg0, int arg1, class339 arg2, class544 arg3, int[][] arg4, class339 arg5, class339 arg6) {
        field1986++;
        byte[][] var8 = this.field1988[arg0];
        byte[][] var9 = this.field1958[arg0];
        int var10 = -124 % ((34 - arg1) / 59);
        byte[][] var11 = this.field1959[arg0];
        byte[][] var12 = this.field1967[arg0];
        for (int var13 = 0; var13 < this.field1978; var13++) {
            int var14 = var13 < this.field1978 - 1 ? var13 + 1 : var13;
            for (int var15 = 0; var15 < this.field1982; var15++) {
                int var16 = (this.field1982 - 1) <= var15 ? var15 : var15 + 1;
                if (class435.field6352 == -1 || class26.method147((byte) -41, var15, class435.field6352, arg0, var13)) {
                    boolean var17 = false;
                    boolean var18 = false;
                    boolean[] var19 = new boolean[4];
                    int var20 = var8[var13][var15];
                    int var21 = var9[var13][var15];
                    int var22 = var12[var13][var15] & 0xFF;
                    int var23 = var11[var13][var15] & 0xFF;
                    int var24 = var11[var13][var16] & 0xFF;
                    int var25 = var11[var14][var16] & 0xFF;
                    int var26 = var11[var14][var15] & 0xFF;
                    if (var22 != 0 || var23 != 0) {
                        class658 var27 = var22 == 0 ? null : this.field1966.method1607(116, var22 - 1);
                        if (var20 == 0 && var27 == null) {
                            var20 = 12;
                        }
                        class52 var28 = var23 == 0 ? null : this.field1969.method1697((byte) -122, var23 - 1);
                        class658 var29 = var27;
                        if (var27 != null) {
                            if (var27.field9372 == -1 && var27.field9359 == -1) {
                                var29 = var27;
                                var27 = null;
                            } else if (var28 != null && var20 != 0) {
                                var18 = var27.field9363;
                            }
                        }
                        if ((var20 == 0 || var20 == 12) && var13 > 0 && var15 > 0 && var13 < this.field1978 && var15 < this.field1982) {
                            byte var30 = 0;
                            byte var31 = 0;
                            byte var32 = 0;
                            int var33 = var32 + (var11[var14][var16] == var23 ? 1 : -1);
                            int var34 = var30 + (var11[var13 - 1][var15 - 1] == var23 ? 1 : -1);
                            int var35 = var31 + (var11[var14][var15 - 1] == var23 ? 1 : -1);
                            byte var36 = 0;
                            int var37 = var36 + (var11[var13 - 1][var16] == var23 ? 1 : -1);
                            if (var11[var13][var15 - 1] == var23) {
                                var35++;
                                var34++;
                            } else {
                                var35--;
                                var34--;
                            }
                            if (var11[var14][var15] == var23) {
                                var35++;
                                var33++;
                            } else {
                                var35--;
                                var33--;
                            }
                            if (var11[var13][var16] == var23) {
                                var33++;
                                var37++;
                            } else {
                                var33--;
                                var37--;
                            }
                            if (var11[var13 - 1][var15] == var23) {
                                var34++;
                                var37++;
                            } else {
                                var34--;
                                var37--;
                            }
                            int var38 = var34 - var33;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            int var39 = var35 - var37;
                            if (var39 < 0) {
                                var39 = -var39;
                            }
                            if (var38 == var39) {
                                var38 = arg6.method2160(-100, var15, var13) - arg6.method2160(-79, var16, var14);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                                var39 = arg6.method2160(-108, var15, var14) - arg6.method2160(-85, var16, var13);
                                if (var39 < 0) {
                                    var39 = -var39;
                                }
                            }
                            var21 = var38 < var39 ? 1 : 0;
                        }
                        for (int var40 = 0; var40 < 13; var40++) {
                            class301.field4587[var40] = -1;
                            class56.field887[var40] = 1;
                        }
                        boolean[] var41 = var27 != null && var27.field9363 ? class694.field9848[var20] : class104.field1538[var20];
                        this.method987(var15, var8, this.field1982, var27, arg3, this.field1978, var21, var12, false, var9, var19, var13, var28, var20);
                        boolean var42 = var27 != null && var27.field9372 != var27.field9359;
                        if (!var42) {
                            for (int var43 = 0; var43 < 8; var43++) {
                                if (class301.field4587[var43] >= 0 && class94.field1405[var43] != class17.field184[var43]) {
                                    var42 = true;
                                    break;
                                }
                            }
                        }
                        if (!var41[var21 + 1 & 0x3]) {
                            var19[1] = class19.method112(var19[1], class636.method3603(class56.field887[4], class56.field887[2]) == 0);
                        }
                        if (!var41[var21 + 3 & 0x3]) {
                            var19[3] = class19.method112(var19[3], class636.method3603(class56.field887[6], class56.field887[0]) == 0);
                        }
                        if (!var41[var21 & 0x3]) {
                            var19[0] = class19.method112(var19[0], class636.method3603(class56.field887[0], class56.field887[2]) == 0);
                        }
                        if (!var41[var21 + 2 & 0x3]) {
                            var19[2] = class19.method112(var19[2], class636.method3603(class56.field887[6], class56.field887[4]) == 0);
                        }
                        if (!var18 && (var20 == 0 || var20 == 12)) {
                            if (var19[0] && !var19[1] && !var19[2] && var19[3]) {
                                var21 = 0;
                                var20 = var20 == 0 ? 13 : 14;
                                var19[0] = var19[3] = false;
                            } else if (var19[0] && var19[1] && !var19[2] && !var19[3]) {
                                var21 = 3;
                                var19[0] = var19[1] = false;
                                var20 = var20 == 0 ? 13 : 14;
                            } else if (!var19[0] && var19[1] && var19[2] && !var19[3]) {
                                var21 = 2;
                                var20 = var20 == 0 ? 13 : 14;
                                var19[1] = var19[2] = false;
                            } else if (!var19[0] && !var19[1] && var19[2] && var19[3]) {
                                var21 = 1;
                                var19[2] = var19[3] = false;
                                var20 = var20 == 0 ? 13 : 14;
                            }
                        }
                        boolean var44 = !var18 && !var19[0] && !var19[2] && !var19[1] && !var19[3];
                        int[] var45 = null;
                        int var46;
                        int[] var47;
                        int[] var48;
                        int var49;
                        int[] var50;
                        if (var44) {
                            var50 = class213.field3529[var20];
                            var47 = class735.field10360[var20];
                            var49 = var27 == null ? 0 : class202.field3427[var20];
                            var46 = var28 == null ? 0 : class483.field6973[var20];
                            var48 = class140.field2189[var20];
                        } else if (var18) {
                            var45 = class758.field10582[var20];
                            var50 = class648.field9221[var20];
                            var46 = var28 == null ? 0 : class25.field254[var20];
                            var49 = var27 == null ? 0 : class272.field4170[var20];
                            var48 = class540.field7710[var20];
                            var47 = class392.field5848[var20];
                        } else {
                            var46 = var28 == null ? 0 : class597.field8456[var20];
                            var45 = class169.field2930[var20];
                            var47 = class546.field7808[var20];
                            var48 = class443.field6437[var20];
                            var49 = var27 == null ? 0 : class352.field5173[var20];
                            var50 = class757.field10535[var20];
                        }
                        int var51 = var46 + var49;
                        if (var51 <= 0) {
                            class736.method4107(arg0, var13, var15);
                        } else {
                            if (var19[0]) {
                                var51++;
                            }
                            if (var19[2]) {
                                var51++;
                            }
                            if (var19[1]) {
                                var51++;
                            }
                            if (var19[3]) {
                                var51++;
                            }
                            int var52 = 0;
                            int var53 = 0;
                            int var54 = var51 * 3;
                            int[] var55 = var42 ? new int[var54] : null;
                            int[] var56 = new int[var54];
                            int[] var57 = new int[var54];
                            int[] var58 = new int[var54];
                            int[] var59 = new int[var54];
                            int[] var60 = new int[var54];
                            int[] var61 = arg5 == null ? null : new int[var54];
                            int[] var62 = arg5 == null && arg2 == null ? null : new int[var54];
                            int var63 = -1;
                            int var64 = -1;
                            int var65 = 256;
                            if (var27 != null) {
                                var65 = var27.field9371;
                                var64 = var27.field9374;
                                var63 = var27.field9372;
                                int var66 = class474.method2884(var27, -1, arg3);
                                for (int var67 = 0; var67 < var49; var67++) {
                                    boolean var68 = false;
                                    byte var69;
                                    if (var19[-var21 & 0x3] && var45[0] == var52) {
                                        class390.field5836[0] = var48[var52];
                                        class390.field5836[1] = 1;
                                        class390.field5836[2] = var50[var52];
                                        class390.field5836[3] = 1;
                                        class390.field5836[4] = var47[var52];
                                        var69 = 6;
                                        class390.field5836[5] = var50[var52];
                                    } else if (var19[2 - var21 & 0x3] && var45[2] == var52) {
                                        class390.field5836[0] = var48[var52];
                                        class390.field5836[1] = 5;
                                        class390.field5836[2] = var50[var52];
                                        class390.field5836[3] = 5;
                                        class390.field5836[4] = var47[var52];
                                        class390.field5836[5] = var50[var52];
                                        var69 = 6;
                                    } else if (var19[1 - var21 & 0x3] && var45[1] == var52) {
                                        class390.field5836[0] = var48[var52];
                                        class390.field5836[1] = 3;
                                        class390.field5836[2] = var50[var52];
                                        class390.field5836[3] = 3;
                                        class390.field5836[4] = var47[var52];
                                        class390.field5836[5] = var50[var52];
                                        var69 = 6;
                                    } else if (var19[3 - var21 & 0x3] && var45[3] == var52) {
                                        class390.field5836[0] = var48[var52];
                                        class390.field5836[1] = 7;
                                        class390.field5836[2] = var50[var52];
                                        class390.field5836[3] = 7;
                                        class390.field5836[4] = var47[var52];
                                        var69 = 6;
                                        class390.field5836[5] = var50[var52];
                                    } else {
                                        class390.field5836[0] = var48[var52];
                                        class390.field5836[1] = var47[var52];
                                        class390.field5836[2] = var50[var52];
                                        var69 = 3;
                                    }
                                    for (int var70 = 0; var70 < var69; var70++) {
                                        int var71 = class390.field5836[var70];
                                        int var72 = var71 - var21 * 2 & 0x7;
                                        int var73 = this.field1960[var71];
                                        int var74 = this.field1977[var71];
                                        int var75;
                                        int var76;
                                        if (var21 == 1) {
                                            var75 = var74;
                                            var76 = 512 - var73;
                                        } else if (var21 == 2) {
                                            var75 = 512 - var73;
                                            var76 = 512 - var74;
                                        } else if (var21 == 3) {
                                            var76 = var73;
                                            var75 = 512 - var74;
                                        } else {
                                            var76 = var74;
                                            var75 = var73;
                                        }
                                        var56[var53] = var75;
                                        var57[var53] = var76;
                                        if (var61 != null && class346.field5114[var20][var71]) {
                                            int var77 = (var13 << 9) + var75;
                                            int var78 = (var15 << 9) + var76;
                                            var61[var53] = arg5.method2162(var78, 1, var77) - arg6.method2162(var78, 1, var77);
                                        }
                                        if (var62 != null) {
                                            if (arg5 != null && !class346.field5114[var20][var71]) {
                                                int var79 = (var13 << 9) + var75;
                                                int var80 = (var15 << 9) + var76;
                                                var62[var53] = arg6.method2162(var80, 1, var79) - arg5.method2162(var80, 1, var79);
                                            } else if (arg2 != null && !class455.field6627[var20][var71]) {
                                                int var81 = (var13 << 9) + var75;
                                                int var82 = (var15 << 9) + var76;
                                                var62[var53] = arg2.method2162(var82, 1, var81) - arg6.method2162(var82, 1, var81);
                                            }
                                        }
                                        if (var71 < 8 && class301.field4587[var72] > var27.field9366) {
                                            if (var55 != null) {
                                                var55[var53] = class94.field1405[var72];
                                            }
                                            var60[var53] = class128.field1990[var72];
                                            var59[var53] = class448.field6539[var72];
                                            var58[var53] = class17.field184[var72];
                                        } else {
                                            if (var55 != null) {
                                                var55[var53] = var66;
                                            }
                                            var59[var53] = var27.field9374;
                                            var60[var53] = var27.field9371;
                                            var58[var53] = var63;
                                        }
                                        var53++;
                                    }
                                    var52++;
                                }
                                if (!this.field1968 && arg0 == 0) {
                                    class199.method1490(var13, var15, var27.field9362, var27.field9361 * 8, var27.field9356);
                                }
                                if (var20 != 12 && var27.field9372 != -1 && var27.field9360) {
                                    var17 = true;
                                }
                            } else if (var44) {
                                var52 += class202.field3427[var20];
                            } else if (var18) {
                                var52 += class272.field4170[var20];
                            } else {
                                var52 += class352.field5173[var20];
                            }
                            if (var28 != null) {
                                if (var25 == 0) {
                                    var25 = var23;
                                }
                                if (var26 == 0) {
                                    var26 = var23;
                                }
                                if (var24 == 0) {
                                    var24 = var23;
                                }
                                class52 var83 = this.field1969.method1697((byte) -91, var23 - 1);
                                class52 var84 = this.field1969.method1697((byte) -124, var24 - 1);
                                class52 var85 = this.field1969.method1697((byte) -106, var25 - 1);
                                class52 var86 = this.field1969.method1697((byte) -120, var26 - 1);
                                for (int var87 = 0; var87 < var46; var87++) {
                                    boolean var88 = false;
                                    byte var89;
                                    if (var19[-var21 & 0x3] && var45[0] == var52) {
                                        class390.field5836[0] = var48[var52];
                                        class390.field5836[1] = 1;
                                        class390.field5836[2] = var50[var52];
                                        class390.field5836[3] = 1;
                                        class390.field5836[4] = var47[var52];
                                        class390.field5836[5] = var50[var52];
                                        var89 = 6;
                                    } else if (var19[2 - var21 & 0x3] && var45[2] == var52) {
                                        class390.field5836[0] = var48[var52];
                                        class390.field5836[1] = 5;
                                        class390.field5836[2] = var50[var52];
                                        class390.field5836[3] = 5;
                                        class390.field5836[4] = var47[var52];
                                        var89 = 6;
                                        class390.field5836[5] = var50[var52];
                                    } else if (var19[1 - var21 & 0x3] && var45[1] == var52) {
                                        class390.field5836[0] = var48[var52];
                                        class390.field5836[1] = 3;
                                        class390.field5836[2] = var50[var52];
                                        class390.field5836[3] = 3;
                                        class390.field5836[4] = var47[var52];
                                        var89 = 6;
                                        class390.field5836[5] = var50[var52];
                                    } else if (var19[3 - var21 & 0x3] && var45[3] == var52) {
                                        class390.field5836[0] = var48[var52];
                                        class390.field5836[1] = 7;
                                        class390.field5836[2] = var50[var52];
                                        class390.field5836[3] = 7;
                                        class390.field5836[4] = var47[var52];
                                        var89 = 6;
                                        class390.field5836[5] = var50[var52];
                                    } else {
                                        class390.field5836[0] = var48[var52];
                                        class390.field5836[1] = var47[var52];
                                        var89 = 3;
                                        class390.field5836[2] = var50[var52];
                                    }
                                    var52++;
                                    for (int var90 = 0; var90 < var89; var90++) {
                                        int var91 = class390.field5836[var90];
                                        int var92 = var91 - (var21 * 2) & 0x7;
                                        int var93 = this.field1960[var91];
                                        int var94 = this.field1977[var91];
                                        int var95;
                                        int var96;
                                        if (var21 == 1) {
                                            var95 = var94;
                                            var96 = 512 - var93;
                                        } else if (var21 == 2) {
                                            var95 = 512 - var93;
                                            var96 = 512 - var94;
                                        } else if (var21 == 3) {
                                            var96 = var93;
                                            var95 = 512 - var94;
                                        } else {
                                            var95 = var93;
                                            var96 = var94;
                                        }
                                        var56[var53] = var95;
                                        var57[var53] = var96;
                                        if (var61 != null && class346.field5114[var20][var91]) {
                                            int var97 = (var13 << 9) + var95;
                                            int var98 = (var15 << 9) + var96;
                                            var61[var53] = arg5.method2162(var98, 1, var97) - arg6.method2162(var98, 1, var97);
                                        }
                                        if (var62 != null) {
                                            if (arg5 != null && !class346.field5114[var20][var91]) {
                                                int var99 = (var13 << 9) + var95;
                                                int var100 = (var15 << 9) + var96;
                                                var62[var53] = arg6.method2162(var100, 1, var99) - arg5.method2162(var100, 1, var99);
                                            } else if (arg2 != null && !class455.field6627[var20][var91]) {
                                                int var101 = (var13 << 9) + var95;
                                                int var102 = (var15 << 9) + var96;
                                                var62[var53] = arg2.method2162(var102, 1, var101) - arg6.method2162(var102, 1, var101);
                                            }
                                        }
                                        if (var91 < 8 && class301.field4587[var92] >= 0) {
                                            if (var55 != null) {
                                                var55[var53] = class94.field1405[var92];
                                            }
                                            var60[var53] = class128.field1990[var92];
                                            var59[var53] = class448.field6539[var92];
                                            var58[var53] = class17.field184[var92];
                                        } else {
                                            if (var18 && class346.field5114[var20][var91]) {
                                                var59[var53] = var64;
                                                var60[var53] = var65;
                                                var58[var53] = var63;
                                            } else if (var95 == 0 && var96 == 0) {
                                                var58[var53] = arg4[var13][var15];
                                                var59[var53] = var83.field830;
                                                var60[var53] = var83.field827;
                                            } else if (var95 == 0 && var96 == 512) {
                                                var58[var53] = arg4[var13][var16];
                                                var59[var53] = var84.field830;
                                                var60[var53] = var84.field827;
                                            } else if (var95 == 512 && var96 == 512) {
                                                var58[var53] = arg4[var14][var16];
                                                var59[var53] = var85.field830;
                                                var60[var53] = var85.field827;
                                            } else if (var95 == 512 && var96 == 0) {
                                                var58[var53] = arg4[var14][var15];
                                                var59[var53] = var86.field830;
                                                var60[var53] = var86.field827;
                                            } else {
                                                if (var95 < 256) {
                                                    if (var96 < 256) {
                                                        var59[var53] = var83.field830;
                                                        var60[var53] = var83.field827;
                                                    } else {
                                                        var59[var53] = var84.field830;
                                                        var60[var53] = var84.field827;
                                                    }
                                                } else if (var96 < 256) {
                                                    var59[var53] = var86.field830;
                                                    var60[var53] = var86.field827;
                                                } else {
                                                    var59[var53] = var85.field830;
                                                    var60[var53] = var85.field827;
                                                }
                                                int var103 = class457.method2795(arg4[var14][var15], var95 << 7 >> 9, 3, arg4[var13][var15]);
                                                int var104 = class457.method2795(arg4[var14][var16], var95 << 7 >> 9, 3, arg4[var13][var16]);
                                                var58[var53] = class457.method2795(var104, var96 << 7 >> 9, 3, var103);
                                            }
                                            if (var55 != null) {
                                                var55[var53] = var58[var53];
                                            }
                                        }
                                        var53++;
                                    }
                                }
                                if (var20 != 0 && var28.field832) {
                                    var17 = true;
                                }
                            }
                            int var105 = arg6.method2160(-105, var15, var13);
                            int var106 = arg6.method2160(-109, var15, var14);
                            int var107 = arg6.method2160(-100, var16, var14);
                            int var108 = arg6.method2160(-126, var16, var13);
                            boolean var109 = class584.method3365(false, var13, var15);
                            if (var109 && arg0 > 1 || !var109 && arg0 > 0) {
                                boolean var110 = true;
                                if (var28 != null && !var28.field840) {
                                    var110 = false;
                                } else if (var23 == 0 && var20 != 0) {
                                    var110 = false;
                                } else if (var22 > 0 && var29 != null && !var29.field9367) {
                                    var110 = false;
                                }
                                if (var110 && var105 == var106 && var105 == var107 && var105 == var108) {
                                    this.field1970[arg0][var13][var15] = (byte) class112.method903(this.field1970[arg0][var13][var15], 4);
                                }
                            }
                            int var111 = 0;
                            int var112 = 0;
                            int var113 = 0;
                            if (this.field1968) {
                                var111 = class675.method3766(var13, var15);
                                var112 = class567.method3295(var13, var15);
                                var113 = class388.method2427(var13, var15);
                            }
                            arg6.method623(var13, var15, var56, var61, var57, var62, var58, var55, var59, var60, var111, var112, var113, var17);
                            class736.method4107(arg0, var13, var15);
                        }
                    }
                }
            }
        }
    }
}
