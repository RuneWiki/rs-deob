import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class222 {

    @OriginalMember(owner = "client!um", name = "M", descriptor = "Lu;")
    private class34 field3874 = null;

    @OriginalMember(owner = "client!um", name = "D", descriptor = "Lwj;")
    private class165 field3865;

    @OriginalMember(owner = "client!um", name = "g", descriptor = "Z")
    private boolean field3842;

    @OriginalMember(owner = "client!um", name = "N", descriptor = "Z")
    private boolean field3875;

    @OriginalMember(owner = "client!um", name = "c", descriptor = "I")
    public static int field3838 = 0;

    @OriginalMember(owner = "client!um", name = "I", descriptor = "I")
    public static int field3870 = 0;

    @OriginalMember(owner = "client!um", name = "m", descriptor = "Lhi;")
    public static class82 field3848 = class95.method664((byte) -117, "Wordpack geladen)3");

    @OriginalMember(owner = "client!um", name = "U", descriptor = "[Lhi;")
    public static class82[] field3882 = new class82[200];

    @OriginalMember(owner = "client!um", name = "a", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!um", name = "b", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!um", name = "d", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!um", name = "e", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!um", name = "f", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!um", name = "i", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!um", name = "j", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!um", name = "l", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!um", name = "n", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!um", name = "o", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!um", name = "p", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!um", name = "q", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!um", name = "r", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!um", name = "s", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!um", name = "t", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!um", name = "u", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!um", name = "v", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!um", name = "w", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!um", name = "x", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!um", name = "y", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!um", name = "z", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!um", name = "A", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!um", name = "B", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!um", name = "C", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!um", name = "E", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!um", name = "G", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!um", name = "H", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!um", name = "J", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!um", name = "K", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!um", name = "L", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!um", name = "O", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!um", name = "P", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!um", name = "Q", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!um", name = "R", descriptor = "I")
    public static int field3879;

    @OriginalMember(owner = "client!um", name = "S", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!um", name = "T", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!um", name = "V", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!um", name = "h", descriptor = "Lum;")
    public static class222 field3843;

    @OriginalMember(owner = "client!um", name = "k", descriptor = "[Ljava/lang/Object;")
    private Object[] field3846;

    @OriginalMember(owner = "client!um", name = "F", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field3867;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(BI)Z", line = 4)
    private final boolean method1566(byte arg0, int arg1) {
        field3881++;
        if (!this.method1580(-1)) {
            return false;
        } else if (arg1 >= 0 && arg1 < this.field3874.field515.length && this.field3874.field515[arg1] != 0) {
            return arg0 == 76 ? true : true;
        } else if (class161.field2811) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ILhi;Lhi;)[B", line = 32)
    public final byte[] method1567(int arg0, class82 arg1, class82 arg2) {
        field3839++;
        if (!this.method1580(-1)) {
            return null;
        }
        class82 var4 = arg1.method538((byte) -80);
        class82 var5 = arg2.method538((byte) -80);
        if (arg0 != 0) {
            return (byte[]) null;
        }
        int var6 = this.field3874.field534.method646(112, var4.method546(arg0 ^ 0xFFFFFF8C));
        if (this.method1566((byte) 76, var6)) {
            int var7 = this.field3874.field522[var6].method646(63, var5.method546(arg0 - 53));
            return this.method1577(var6, var7, -29569);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(II)I", line = 58)
    public final int method1568(int arg0, int arg1) {
        field3836++;
        if (this.method1566((byte) 76, arg1)) {
            if (arg0 != 1673) {
                this.field3842 = false;
            }
            return this.field3874.field515[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Z)V", line = 74)
    public final void method1569(boolean arg0) {
        if (arg0) {
            field3838 = 7;
        }
        if (this.field3867 != null) {
            for (int var2 = 0; var2 < this.field3867.length; var2++) {
                this.field3867[var2] = null;
            }
        }
        field3853++;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I)Z", line = 105)
    public final boolean method1570(int arg0) {
        field3862++;
        if (arg0 != -20653) {
            this.field3867 = (Object[][]) ((Object[][]) null);
        }
        if (!this.method1580(-1)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field3874.field524.length; var3++) {
            int var4 = this.field3874.field524[var3];
            if (this.field3846[var4] == null) {
                this.method1593((byte) -124, var4);
                if (this.field3846[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(I)V", line = 142)
    public static final void method1571(int arg0) {
        if (class66.field1036 != null) {
            class66.field1036.method2085(true);
            class66.field1036 = null;
        }
        class166.method1196(0);
        field3855++;
        class88.method616();
        for (int var1 = 0; var1 < 4; var1++) {
            class180.field3071[var1].method1305(-1);
        }
        class143.method969((byte) 31, false);
        System.gc();
        class51.method367(2, 95);
        class35.field569 = -1;
        class66.field1027 = false;
        class65.method420((byte) 6, true);
        class226.field3916 = 0;
        class182.field3115 = false;
        class260.field4465 = 0;
        class230.field3976 = 0;
        class126.field2215 = arg0;
        for (int var2 = 0; var2 < class101.field1804.length; var2++) {
            class101.field1804[var2] = null;
        }
        class25.field333 = 0;
        class297.field5054 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class29.field405[var3] = null;
            class42.field748[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class99.field1777[var4] = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class107.field1889[var5][var6][var7] = null;
                }
            }
        }
        class39.method306((byte) -90);
        class27.field359 = 0;
        class47.method343((byte) -48);
        class300.method2072(false, true);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(BLhi;)I", line = 235)
    public final int method1572(byte arg0, class82 arg1) {
        field3854++;
        if (!this.method1580(-1)) {
            return 0;
        } else if (arg0 > -61) {
            return -103;
        } else {
            class82 var3 = arg1.method538((byte) -80);
            int var4 = this.field3874.field534.method646(-101, var3.method546(113));
            return this.method1573(var4, -75);
        }
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(II)I", line = 253)
    private final int method1573(int arg0, int arg1) {
        field3872++;
        if (this.method1566((byte) 76, arg0)) {
            int var3 = 67 / ((-arg1 - 7) / 53);
            return this.field3846[arg0] == null ? this.field3865.method1190(arg0, true) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ZI)Llb;", line = 275)
    public static final class233 method1574(boolean arg0, int arg1) {
        field3880++;
        class233 var2 = (class233) class263.field4493.method2175((long) arg1, 3008);
        if (!arg0) {
            return (class233) null;
        } else if (var2 == null) {
            byte[] var3 = class285.field4799.method1577(class34.method264((byte) -127, arg1), class166.method1195(arg1, 0), -29569);
            class233 var4 = new class233();
            var4.field4076 = arg1;
            if (var3 != null) {
                var4.method1659(new class153(var3), 22);
            }
            var4.method1657(128);
            class263.field4493.method2169(var4, (long) arg1, (byte) 94);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(II)V", line = 302)
    private final void method1575(int arg0, int arg1) {
        field3879++;
        this.field3865.method1193((byte) 3, arg0);
        if (arg1 != 1) {
            this.method1585(false, 49);
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Z[Luf;I)V", line = 314)
    public static final void method1576(boolean arg0, class189[] arg1, int arg2) {
        field3873++;
        if (!arg0) {
            for (int var3 = 0; var3 < 4; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    for (int var5 = 0; var5 < 104; var5++) {
                        if ((class204.field3567[var3][var4][var5] & 0x1) == 1) {
                            int var6 = var3;
                            if ((class204.field3567[1][var4][var5] & 0x2) == 2) {
                                var6 = var3 - 1;
                            }
                            if (var6 >= 0) {
                                arg1[var6].method1313(-20193, var4, var5);
                            }
                        }
                    }
                }
            }
            class230.field3970 += (int) (Math.random() * 5.0D) - 2;
            if (class230.field3970 < -16) {
                class230.field3970 = -16;
            }
            class54.field860 += (int) (Math.random() * 5.0D) - 2;
            if (class54.field860 < -8) {
                class54.field860 = -8;
            }
            if (class230.field3970 > 16) {
                class230.field3970 = 16;
            }
            if (class54.field860 > 8) {
                class54.field860 = 8;
            }
        }
        byte var7;
        if (arg0) {
            var7 = 1;
        } else {
            var7 = 4;
        }
        int var8 = class54.field860 >> 2 << 10;
        int var9 = class230.field3970 >> 1;
        if (arg2 != -21911) {
            method1596(true, -79, (class82[]) null, 1);
        }
        int[][] var10 = new int[104][104];
        int[][] var11 = new int[104][104];
        for (int var12 = 0; var12 < var7; var12++) {
            byte[][] var13 = class255.field4389[var12];
            if (!class147.field2485) {
                int var34 = (int) Math.sqrt(5100.0D);
                int var35 = var34 * 768 >> 8;
                for (int var36 = 1; var36 < 103; var36++) {
                    for (int var37 = 1; var37 < 103; var37++) {
                        byte var38 = 74;
                        int var39 = class245.field4255[var12][var37 + 1][var36] - class245.field4255[var12][var37 - 1][var36];
                        int var40 = class245.field4255[var12][var37][var36 + 1] - class245.field4255[var12][var37][var36 - 1];
                        int var41 = (int) Math.sqrt((double) (var40 * var40 + (var39 * var39 + 65536)));
                        int var42 = (var39 << 8) / var41;
                        int var43 = (var13[var37 + 1][var36] >> 3) + (var13[var37 - 1][var36] >> 2) + (var13[var37][var36] >> 1) - (-(var13[var37][var36 + -1] >> 2) - (var13[var37][var36 + 1] >> 3));
                        int var44 = (var40 << 8) / var41;
                        int var45 = -65536 / var41;
                        int var46 = (var44 * -50 + var42 * -50 + var45 * -10) / var35 + var38;
                        var11[var37][var36] = var46 - var43;
                    }
                }
            } else if (class75.field1303) {
                for (int var30 = 1; var30 < 103; var30++) {
                    for (int var31 = 1; var31 < 103; var31++) {
                        int var32 = (var13[var31][var30 - 1] >> 2) + (var13[var31][var30] >> 1) + (var13[var31 + 1][var30] >> 3) + (var13[var31 + -1][var30] >> 2) + (var13[var31][var30 + 1] >> 3);
                        byte var33 = 74;
                        var11[var31][var30] = var33 - var32;
                    }
                }
            } else {
                int var14 = (int) class85.field1529[1];
                int var15 = (int) class85.field1529[2];
                int var16 = (int) class85.field1529[0];
                int var17 = (int) Math.sqrt((double) (var14 * var14 + var16 * var16 + (var15 * var15)));
                int var18 = var17 * 1024 >> 8;
                for (int var19 = 1; var19 < 103; var19++) {
                    for (int var20 = 1; var20 < 103; var20++) {
                        byte var21 = 96;
                        int var22 = class245.field4255[var12][var20 + 1][var19] - class245.field4255[var12][var20 - 1][var19];
                        int var23 = class245.field4255[var12][var20][var19 + 1] - class245.field4255[var12][var20][var19 - 1];
                        int var24 = (int) Math.sqrt((double) (var22 * var22 + (var23 * var23) + 65536));
                        int var25 = (var23 << 8) / var24;
                        int var26 = (var13[var20 - 1][var19] >> 2) - (-(var13[var20 + 1][var19] >> 3) - ((var13[var20][var19 - 1] >> 2) - (-(var13[var20][var19 + 1] >> 3) - (var13[var20][var19] >> 1))));
                        int var27 = -65536 / var24;
                        int var28 = (var22 << 8) / var24;
                        int var29 = (var14 * var27 + var16 * var28 + (var15 * var25)) / var18 + var21;
                        var11[var20][var19] = var29 - ((int) ((float) var26 * 1.7F));
                    }
                }
            }
            for (int var47 = 0; var47 < 104; var47++) {
                class29.field401[var47] = 0;
                class296.field5006[var47] = 0;
                class9.field80[var47] = 0;
                class17.field185[var47] = 0;
                class311.field5314[var47] = 0;
            }
            for (int var48 = -5; var48 < 104; var48++) {
                for (int var49 = 0; var49 < 104; var49++) {
                    int var50 = var48 + 5;
                    int var10002;
                    if (var50 < 104) {
                        int var51 = class77.field1323[var12][var50][var49] & 0xFF;
                        if (var51 > 0) {
                            class124 var52 = class228.method1625(10415, var51 - 1);
                            class29.field401[var49] += var52.field2179;
                            class296.field5006[var49] += var52.field2163;
                            class9.field80[var49] += var52.field2167;
                            class17.field185[var49] += var52.field2172;
                            var10002 = class311.field5314[var49]++;
                        }
                    }
                    int var53 = var48 - 5;
                    if (var53 >= 0) {
                        int var54 = class77.field1323[var12][var53][var49] & 0xFF;
                        if (var54 > 0) {
                            class124 var55 = class228.method1625(10415, var54 - 1);
                            class29.field401[var49] -= var55.field2179;
                            class296.field5006[var49] -= var55.field2163;
                            class9.field80[var49] -= var55.field2167;
                            class17.field185[var49] -= var55.field2172;
                            var10002 = class311.field5314[var49]--;
                        }
                    }
                }
                if (var48 >= 0) {
                    int var56 = 0;
                    int var57 = 0;
                    int var58 = 0;
                    int var59 = 0;
                    int var60 = 0;
                    for (int var61 = -5; var61 < 104; var61++) {
                        int var62 = var61 + 5;
                        if (var62 < 104) {
                            var59 += class311.field5314[var62];
                            var56 += class296.field5006[var62];
                            var60 += class17.field185[var62];
                            var58 += class29.field401[var62];
                            var57 += class9.field80[var62];
                        }
                        int var63 = var61 - 5;
                        if (var63 >= 0) {
                            var59 -= class311.field5314[var63];
                            var56 -= class296.field5006[var63];
                            var58 -= class29.field401[var63];
                            var60 -= class17.field185[var63];
                            var57 -= class9.field80[var63];
                        }
                        if (var61 >= 0 && var59 > 0) {
                            var10[var48][var61] = class289.method1999(var57 / var59, true, var58 * 256 / var60, var56 / var59);
                        }
                    }
                }
            }
            for (int var64 = 1; var64 < 103; var64++) {
                label775: for (int var65 = 1; var65 < 103; var65++) {
                    if (arg0 || class123.method841(false) || (class204.field3567[0][var64][var65] & 0x2) != 0 || (class204.field3567[var12][var64][var65] & 0x10) == 0 && class82.method554(var64, var12, false, var65) == class287.field4826) {
                        if (var12 < class193.field3280) {
                            class193.field3280 = var12;
                        }
                        int var66 = class77.field1323[var12][var64][var65] & 0xFF;
                        int var67 = class256.field4405[var12][var64][var65] & 0xFF;
                        if (var66 > 0 || var67 > 0) {
                            int var68 = class245.field4255[var12][var64][var65];
                            int var69 = class245.field4255[var12][var64 + 1][var65];
                            int var70 = class245.field4255[var12][var64 + 1][var65 + 1];
                            int var71 = class245.field4255[var12][var64][var65 + 1];
                            if (var12 > 0) {
                                boolean var72 = true;
                                if (var66 == 0 && class138.field2371[var12][var64][var65] != 0) {
                                    var72 = false;
                                }
                                if (var67 > 0 && !class286.method1984(var67 - 1, 5269).field5170) {
                                    var72 = false;
                                }
                                if (var72 && var68 == var69 && var68 == var70 && var68 == var71) {
                                    class325.field5582[var12][var64][var65] = class98.method674(class325.field5582[var12][var64][var65], 4);
                                }
                            }
                            int var73;
                            int var74;
                            if (var66 <= 0) {
                                var73 = 0;
                                var74 = -1;
                            } else {
                                var74 = var10[var64][var65];
                                int var75 = (var74 & 0x7F) + var9;
                                if (var75 < 0) {
                                    var75 = 0;
                                } else if (var75 > 127) {
                                    var75 = 127;
                                }
                                int var76 = (var74 + var8 & 0xFC00) + (var74 & 0x380) + var75;
                                var73 = class102.field1805[class25.method162(var76, 96, -1)];
                            }
                            int var77 = var11[var64][var65];
                            int var78 = var11[var64 + 1][var65];
                            int var79 = var11[var64 + 1][var65 + 1];
                            int var80 = var11[var64][var65 + 1];
                            if (var67 == 0) {
                                class269.method1891(var12, var64, var65, 0, 0, -1, var68, var69, var70, var71, class25.method162(var74, var77, arg2 + 21910), class25.method162(var74, var78, -1), class25.method162(var74, var79, arg2 + 21910), class25.method162(var74, var80, arg2 ^ 0x5596), 0, 0, 0, 0, var73, 0);
                                if (class147.field2485 && var12 > 0 && var74 != -1 && class228.method1625(10415, var66 - 1).field2175) {
                                    class248.method1789(0, 0, true, false, var64, var65, var68 - class245.field4255[0][var64][var65], -class245.field4255[0][var64 - -1][var65] + var69, var70 - class245.field4255[0][var64 + 1][var65 + 1], var71 - class245.field4255[0][var64][var65 + 1]);
                                }
                                if (class147.field2485 && !arg0 && class283.field4746 != null && var12 == 0) {
                                    for (int var81 = var64 - 1; var81 <= (var64 + 1); var81++) {
                                        for (int var82 = var65 - 1; var82 <= var65 + 1; var82++) {
                                            if ((var64 != var81 || var65 != var82) && var81 >= 0 && var81 < 104 && var82 >= 0 && var82 < 104) {
                                                int var83 = class256.field4405[var12][var81][var82] & 0xFF;
                                                if (var83 != 0) {
                                                    class305 var84 = class286.method1984(var83 - 1, 5269);
                                                    if (var84.field5173 != -1 && class102.field1821.method628(arg2 + 22038, var84.field5173) == 4) {
                                                        class283.field4746[var64][var65] = (var84.field5180 << 24) + var84.field5182;
                                                        continue label775;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                byte var85 = class204.field3581[var12][var64][var65];
                                int var86 = class138.field2371[var12][var64][var65] + 1;
                                class305 var87 = class286.method1984(var67 - 1, arg2 + 27180);
                                if (class147.field2485 && !arg0 && class283.field4746 != null && var12 == 0) {
                                    if (var87.field5173 != -1 && class102.field1821.method628(127, var87.field5173) == 4) {
                                        class283.field4746[var64][var65] = (var87.field5180 << 24) + var87.field5182;
                                    } else {
                                        label756: for (int var88 = var64 - 1; var88 <= (var64 + 1); var88++) {
                                            for (int var89 = var65 - 1; var89 <= var65 + 1; var89++) {
                                                if ((var64 != var88 || var65 != var89) && var88 >= 0 && var88 < 104 && var89 >= 0 && var89 < 104) {
                                                    int var90 = class256.field4405[var12][var88][var89] & 0xFF;
                                                    if (var90 != 0) {
                                                        class305 var91 = class286.method1984(var90 - 1, 5269);
                                                        if (var91.field5173 != -1 && class102.field1821.method628(126, var91.field5173) == 4) {
                                                            class283.field4746[var64][var65] = (var91.field5180 << 24) + var91.field5182;
                                                            break label756;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                int var92 = var87.field5173;
                                if (var92 >= 0 && !class102.field1821.method625(arg2 ^ 0xFFFFAA27, var92)) {
                                    var92 = -1;
                                }
                                int var93;
                                int var96;
                                if (var92 >= 0) {
                                    var93 = -1;
                                    var96 = class102.field1805[class316.method2167(arg2 ^ 0x5594, class102.field1821.method627(var92, -114), 96)];
                                } else if (var87.field5168 == -1) {
                                    var93 = -2;
                                    var96 = 0;
                                } else {
                                    var93 = var87.field5168;
                                    int var94 = (var93 & 0x7F) + var9;
                                    if (var94 < 0) {
                                        var94 = 0;
                                    } else if (var94 > 127) {
                                        var94 = 127;
                                    }
                                    int var95 = (var8 + var93 & 0xFC00) + var94 + (var93 & 0x380);
                                    var96 = class102.field1805[class316.method2167(arg2 ^ 0x5594, var95, 96)];
                                }
                                if (var87.field5174 >= 0) {
                                    int var97 = var87.field5174;
                                    int var98 = (var97 & 0x7F) + var9;
                                    if (var98 < 0) {
                                        var98 = 0;
                                    } else if (var98 > 127) {
                                        var98 = 127;
                                    }
                                    int var99 = (var8 + var97 & 0xFC00) + (var97 & 0x380) + var98;
                                    var96 = class102.field1805[class316.method2167(-3, var99, 96)];
                                }
                                class269.method1891(var12, var64, var65, var86, var85, var92, var68, var69, var70, var71, class25.method162(var74, var77, arg2 + 21910), class25.method162(var74, var78, -1), class25.method162(var74, var79, -1), class25.method162(var74, var80, -1), class316.method2167(arg2 ^ 0x5594, var93, var77), class316.method2167(-3, var93, var78), class316.method2167(-3, var93, var79), class316.method2167(-3, var93, var80), var73, var96);
                                if (class147.field2485 && var12 > 0) {
                                    class248.method1789(var86, var85, var93 == -2 || !var87.field5184, var74 == -1 || !class228.method1625(10415, var66 - 1).field2175, var64, var65, var68 - class245.field4255[0][var64][var65], var69 - class245.field4255[0][var64 - -1][var65], var70 - class245.field4255[0][var64 + 1][var65 + 1], -class245.field4255[0][var64][var65 + 1] + var71);
                                }
                            }
                        }
                    }
                }
            }
            if (class147.field2485) {
                float[][] var100 = new float[105][105];
                int[][] var101 = class245.field4255[var12];
                float[][] var102 = new float[105][105];
                float[][] var103 = new float[105][105];
                int var104 = 1;
                while (true) {
                    if (var104 > 103) {
                        if (arg0) {
                            class108[] var114 = class5.method31(class180.field3073[0], var12, class204.field3581[var12], var102, class204.field3567, arg2 ^ 0x5596, class245.field4255[var12], class283.field4746, var10, class138.field2371[var12], class256.field4405[var12], var11, var100, var103, class77.field1323[var12]);
                            class183.method1269(var12, var114);
                            break;
                        }
                        class108[] var109 = class5.method31((int[][]) null, var12, class204.field3581[var12], var102, class204.field3567, -1, class245.field4255[var12], (int[][]) null, var10, class138.field2371[var12], class256.field4405[var12], var11, var100, var103, class77.field1323[var12]);
                        class108[] var110 = class92.method650(class245.field4255[var12], class138.field2371[var12], var100, var102, 3, class77.field1323[var12], class204.field3581[var12], class256.field4405[var12], var103, var12, class204.field3567, var11);
                        class108[] var111 = new class108[var109.length + var110.length];
                        for (int var112 = 0; var112 < var109.length; var112++) {
                            var111[var112] = var109[var112];
                        }
                        for (int var113 = 0; var113 < var110.length; var113++) {
                            var111[var109.length + var113] = var110[var113];
                        }
                        class183.method1269(var12, var111);
                        class312.method2137(var12, class77.field1323[var12], class2.field15, class245.field4255[var12], var103, class2.field12, class256.field4405[var12], class204.field3581[var12], var102, var100, class138.field2371[var12], -127);
                        break;
                    }
                    for (int var105 = 1; var105 <= 103; var105++) {
                        int var106 = var101[var105 + 1][var104] - var101[var105 - 1][var104];
                        int var107 = var101[var105][var104 + 1] - var101[var105][var104 - 1];
                        float var108 = (float) Math.sqrt((double) (var106 * var106 + var107 * var107 + 65536));
                        var100[var105][var104] = (float) var106 / var108;
                        var103[var105][var104] = -256.0F / var108;
                        var102[var105][var104] = (float) var107 / var108;
                    }
                    var104++;
                }
            }
            class77.field1323[var12] = (byte[][]) null;
            class256.field4405[var12] = (byte[][]) null;
            class138.field2371[var12] = (byte[][]) null;
            class204.field3581[var12] = (byte[][]) null;
            class255.field4389[var12] = (byte[][]) null;
        }
        class123.method838(-50, -10, -50);
        if (arg0) {
            return;
        }
        for (int var115 = 0; var115 < 104; var115++) {
            for (int var116 = 0; var116 < 104; var116++) {
                if ((class204.field3567[1][var115][var116] & 0x2) == 2) {
                    class61.method402(var115, var116);
                }
            }
        }
        for (int var117 = 0; var117 < 4; var117++) {
            for (int var118 = 0; var118 <= 104; var118++) {
                for (int var119 = 0; var119 <= 104; var119++) {
                    if ((class325.field5582[var117][var119][var118] & 0x1) != 0) {
                        int var120;
                        for (var120 = var118; var120 > 0 && (class325.field5582[var117][var119][var120 - 1] & 0x1) != 0; var120--) {
                        }
                        int var121 = var117;
                        int var122;
                        for (var122 = var118; var122 < 104 && (class325.field5582[var117][var119][var122 + 1] & 0x1) != 0; var122++) {
                        }
                        int var123 = var117;
                        label456: while (var121 > 0) {
                            for (int var124 = var120; var124 <= var122; var124++) {
                                if ((class325.field5582[var121 - 1][var119][var124] & 0x1) == 0) {
                                    break label456;
                                }
                            }
                            var121--;
                        }
                        label445: while (var123 < 3) {
                            for (int var125 = var120; var125 <= var122; var125++) {
                                if ((class325.field5582[var123 + 1][var119][var125] & 0x1) == 0) {
                                    break label445;
                                }
                            }
                            var123++;
                        }
                        int var126 = (var123 + 1 - var121) * (var122 + 1 - var120);
                        if (var126 >= 8) {
                            short var127 = 240;
                            int var128 = class245.field4255[var123][var119][var120] - var127;
                            int var129 = class245.field4255[var121][var119][var120];
                            class279.method1949(1, var119 * 128, var119 * 128, var120 * 128, var122 * 128 + 128, var128, var129);
                            for (int var130 = var121; var130 <= var123; var130++) {
                                for (int var131 = var120; var131 <= var122; var131++) {
                                    class325.field5582[var130][var119][var131] = class277.method1935(class325.field5582[var130][var119][var131], -2);
                                }
                            }
                        }
                    }
                    if ((class325.field5582[var117][var119][var118] & 0x2) != 0) {
                        int var132;
                        for (var132 = var119; var132 > 0 && (class325.field5582[var117][var132 - 1][var118] & 0x2) != 0; var132--) {
                        }
                        int var133 = var119;
                        int var134 = var117;
                        while (var133 < 104 && (class325.field5582[var117][var133 + 1][var118] & 0x2) != 0) {
                            var133++;
                        }
                        label512: while (var134 > 0) {
                            for (int var135 = var132; var135 <= var133; var135++) {
                                if ((class325.field5582[var134 - 1][var135][var118] & 0x2) == 0) {
                                    break label512;
                                }
                            }
                            var134--;
                        }
                        int var136;
                        label500: for (var136 = var117; var136 < 3; var136++) {
                            for (int var137 = var132; var137 <= var133; var137++) {
                                if ((class325.field5582[var136 + 1][var137][var118] & 0x2) == 0) {
                                    break label500;
                                }
                            }
                        }
                        int var138 = (var133 - (var132 - 1)) * (var136 + 1 - var134);
                        if (var138 >= 8) {
                            short var139 = 240;
                            int var140 = class245.field4255[var136][var132][var118] - var139;
                            int var141 = class245.field4255[var134][var132][var118];
                            class279.method1949(2, var132 * 128, var133 * 128 + 128, var118 * 128, var118 * 128, var140, var141);
                            for (int var142 = var134; var142 <= var136; var142++) {
                                for (int var143 = var132; var143 <= var133; var143++) {
                                    class325.field5582[var142][var143][var118] = class277.method1935(class325.field5582[var142][var143][var118], -3);
                                }
                            }
                        }
                    }
                    if ((class325.field5582[var117][var119][var118] & 0x4) != 0) {
                        int var144 = var119;
                        int var145 = var118;
                        int var146 = var119;
                        while (var145 > 0 && (class325.field5582[var117][var119][var145 - 1] & 0x4) != 0) {
                            var145--;
                        }
                        int var147;
                        for (var147 = var118; var147 < 104 && (class325.field5582[var117][var119][var147 + 1] & 0x4) != 0; var147++) {
                        }
                        label566: while (var144 > 0) {
                            for (int var148 = var145; var148 <= var147; var148++) {
                                if ((class325.field5582[var117][var144 - 1][var148] & 0x4) == 0) {
                                    break label566;
                                }
                            }
                            var144--;
                        }
                        label555: while (var146 < 104) {
                            for (int var149 = var145; var149 <= var147; var149++) {
                                if ((class325.field5582[var117][var146 + 1][var149] & 0x4) == 0) {
                                    break label555;
                                }
                            }
                            var146++;
                        }
                        if ((var147 - (var145 - 1)) * (var146 + 1 - var144) >= 4) {
                            int var150 = class245.field4255[var117][var144][var145];
                            class279.method1949(4, var144 * 128, var146 * 128 + 128, var145 * 128, var147 * 128 + 128, var150, var150);
                            for (int var151 = var144; var151 <= var146; var151++) {
                                for (int var152 = var145; var152 <= var147; var152++) {
                                    class325.field5582[var117][var151][var152] = class277.method1935(class325.field5582[var117][var151][var152], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(III)[B", line = 1288)
    public final byte[] method1577(int arg0, int arg1, int arg2) {
        field3849++;
        if (arg2 != -29569) {
            field3838 = -93;
        }
        return this.method1603(-118, arg1, arg0, (int[]) null);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IZZ)V", line = 1303)
    public final void method1578(int arg0, boolean arg1, boolean arg2) {
        field3861++;
        if (!this.method1580(-1)) {
            return;
        }
        if (arg0 != 65536) {
            this.method1579(-82, false);
        }
        if (arg2) {
            this.field3874.field519 = null;
            this.field3874.field534 = null;
        }
        if (arg1) {
            this.field3874.field518 = (int[][]) null;
            this.field3874.field522 = null;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IZ)[B", line = 1331)
    public final byte[] method1579(int arg0, boolean arg1) {
        field3852++;
        if (!this.method1580(-1)) {
            return null;
        } else if (this.field3874.field515.length == 1) {
            return this.method1577(0, arg0, -29569);
        } else {
            if (arg1) {
                this.method1595(40, 63, (byte) 117);
            }
            if (!this.method1566((byte) 76, arg0)) {
                return null;
            } else if (this.field3874.field515[arg0] == 1) {
                return this.method1577(arg0, 0, -29569);
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(I)Z", line = 1359)
    private final boolean method1580(int arg0) {
        if (arg0 != -1) {
            this.field3867 = (Object[][]) ((Object[][]) null);
        }
        field3840++;
        if (this.field3874 == null) {
            this.field3874 = this.field3865.method1188((byte) 107);
            if (this.field3874 == null) {
                return false;
            }
            this.field3867 = new Object[this.field3874.field505][];
            this.field3846 = new Object[this.field3874.field505];
        }
        return true;
    }

    @OriginalMember(owner = "client!um", name = "d", descriptor = "(I)V", line = 1385)
    public static void method1581(int arg0) {
        field3882 = null;
        if (arg0 != 0) {
            field3838 = -109;
        }
        field3848 = null;
        field3843 = null;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lhi;Lhi;I)Z", line = 1397)
    public final boolean method1582(class82 arg0, class82 arg1, int arg2) {
        field3864++;
        if (!this.method1580(-1)) {
            return false;
        }
        class82 var4 = arg0.method538((byte) -80);
        class82 var5 = arg1.method538((byte) -80);
        int var6 = this.field3874.field534.method646(115, var4.method546(78));
        if (this.method1566((byte) 76, var6)) {
            int var7 = -70 % ((2 - arg2) / 56);
            int var8 = this.field3874.field522[var6].method646(32, var5.method546(117));
            return this.method1587(var6, var8, (byte) 56);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ZIII)I", line = 1423)
    public static final int method1583(boolean arg0, int arg1, int arg2, int arg3) {
        class164 var4 = (class164) class67.field1038.method507((long) arg1, 602425312);
        field3841++;
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < var4.field2870.length; var6++) {
            if (var4.field2870[var6] >= 0 && var4.field2870[var6] < class183.field3125) {
                class312 var7 = class273.method1912(var4.field2870[var6], -111);
                if (var7.field5356 != null) {
                    class259 var8 = (class259) var7.field5356.method507((long) arg3, 602425312);
                    if (var8 != null) {
                        if (arg0) {
                            var5 += var4.field2864[var6] * var8.field4431;
                        } else {
                            var5 += var8.field4431;
                        }
                    }
                }
            }
        }
        int var9 = -85 / ((5 - arg2) / 47);
        return var5;
    }

    @OriginalMember(owner = "client!um", name = "e", descriptor = "(I)I", line = 1471)
    public final int method1584(int arg0) {
        field3869++;
        int var2 = -4 / ((19 - arg0) / 37);
        if (!this.method1580(-1)) {
            throw new IllegalStateException("");
        }
        return this.field3874.field529;
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(ZI)[I", line = 1487)
    public final int[] method1585(boolean arg0, int arg1) {
        field3844++;
        if (!this.method1566((byte) 76, arg1)) {
            return null;
        }
        int[] var3 = this.field3874.field511[arg1];
        if (var3 == null) {
            var3 = new int[this.field3874.field526[arg1]];
            int var4 = 0;
            while (var4 < var3.length) {
                var3[var4] = var4++;
            }
        }
        if (arg0) {
            this.method1601(82, -63, -51);
        }
        return var3;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;", line = 1517)
    public static final String method1586(Throwable arg0, int arg1) throws IOException {
        field3857++;
        String var2;
        if ((arg0 instanceof class32)) {
            class32 var3 = (class32) arg0;
            var2 = var3.field474 + " | ";
            arg0 = var3.field480;
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        if (arg1 != 1072411137) {
            method1571(37);
        }
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var2 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var2 = var2 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var2 = var2 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IIB)Z", line = 1598)
    public final boolean method1587(int arg0, int arg1, byte arg2) {
        field3850++;
        if (!this.method1595(arg0, arg1, (byte) -67)) {
            return false;
        }
        if (arg2 < 40) {
            field3882 = (class82[]) null;
        }
        if (this.field3867[arg0] != null && this.field3867[arg0][arg1] != null) {
            return true;
        } else if (this.field3846[arg0] == null) {
            this.method1593((byte) -123, arg0);
            return this.field3846[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(BIII)V", line = 1624)
    public static final void method1588(byte arg0, int arg1, int arg2, int arg3) {
        field3868++;
        if (class134.field2321 != 0 && arg2 != 0 && class21.field282 < 50 && arg3 != -1) {
            class184.field3130[class21.field282] = arg3;
            class22.field310[class21.field282] = arg2;
            class105.field1862[class21.field282] = arg1;
            class238.field4141[class21.field282] = null;
            class56.field897[class21.field282] = 0;
            class21.field282++;
        }
        if (arg0 != 85) {
            field3838 = 3;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lhi;I)V", line = 1648)
    public final void method1589(class82 arg0, int arg1) {
        int var3 = -27 / ((arg1 + 15) / 46);
        field3871++;
        if (this.method1580(-1)) {
            class82 var4 = arg0.method538((byte) -80);
            int var5 = this.field3874.field534.method646(23, var4.method546(75));
            this.method1575(var5, 1);
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I[II)Z", line = 1664)
    private final boolean method1590(int arg0, int[] arg1, int arg2) {
        field3856++;
        if (!this.method1566((byte) 76, arg2)) {
            return false;
        } else if (this.field3846[arg2] == null) {
            return false;
        } else {
            int var4 = this.field3874.field526[arg2];
            int[] var5 = this.field3874.field511[arg2];
            boolean var6 = true;
            if (this.field3867[arg2] == null) {
                this.field3867[arg2] = new Object[this.field3874.field515[arg2]];
            }
            Object[] var7 = this.field3867[arg2];
            for (int var8 = 0; var8 < var4; var8++) {
                int var9;
                if (var5 == null) {
                    var9 = var8;
                } else {
                    var9 = var5[var8];
                }
                if (var7[var9] == null) {
                    var6 = false;
                    break;
                }
            }
            if (var6) {
                return true;
            }
            byte[] var10;
            if (arg1 != null && (arg1[0] != 0 || arg1[1] != 0 || arg1[2] != 0 || arg1[3] != 0)) {
                var10 = class51.method359(true, this.field3846[arg2], false);
                class153 var11 = new class153(var10);
                var11.method1059(var11.field2598.length, arg0 - 252, 5, arg1);
            } else {
                var10 = class51.method359(false, this.field3846[arg2], false);
            }
            if (arg0 != 255) {
                return true;
            }
            byte[] var12;
            try {
                var12 = class126.method891(var10, (byte) 21);
            } catch (RuntimeException var31) {
                throw class330.method2258(var31, "T3 - " + (arg1 != null) + "," + arg2 + "," + var10.length + "," + class51.method368(var10.length, var10, true) + "," + class51.method368(var10.length - 2, var10, true) + "," + this.field3874.field512[arg2] + "," + this.field3874.field529);
            }
            if (this.field3875) {
                this.field3846[arg2] = null;
            }
            if (var4 > 1) {
                int var14 = var12.length;
                int var32 = var14 - 1;
                int var15 = var12[var32] & 0xFF;
                int var16 = var32 - var4 * var15 * 4;
                class153 var17 = new class153(var12);
                var17.field2611 = var16;
                int[] var18 = new int[var4];
                for (int var19 = 0; var19 < var15; var19++) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < var4; var21++) {
                        if (var5 != null) {
                        }
                        var20 += var17.method1097((byte) -128);
                        var18[var21] += var20;
                    }
                }
                byte[][] var22 = new byte[var4][];
                for (int var23 = 0; var23 < var4; var23++) {
                    var22[var23] = new byte[var18[var23]];
                    var18[var23] = 0;
                }
                int var24 = 0;
                var17.field2611 = var16;
                for (int var25 = 0; var25 < var15; var25++) {
                    int var26 = 0;
                    for (int var27 = 0; var27 < var4; var27++) {
                        var26 += var17.method1097((byte) -119);
                        class190.method1323(var12, var24, var22[var27], var18[var27], var26);
                        var24 += var26;
                        var18[var27] += var26;
                    }
                }
                for (int var28 = 0; var28 < var4; var28++) {
                    int var29;
                    if (var5 == null) {
                        var29 = var28;
                    } else {
                        var29 = var5[var28];
                    }
                    if (this.field3842) {
                        var7[var29] = var22[var28];
                    } else {
                        var7[var29] = class139.method947(6147, false, var22[var28]);
                    }
                }
            } else {
                int var30;
                if (var5 == null) {
                    var30 = 0;
                } else {
                    var30 = var5[0];
                }
                if (this.field3842) {
                    var7[var30] = var12;
                } else {
                    var7[var30] = class139.method947(class143.method974(arg0, 6396), false, var12);
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!um", name = "d", descriptor = "(II)Z", line = 1859)
    public final boolean method1591(int arg0, int arg1) {
        field3837++;
        if (!this.method1566((byte) 76, arg0)) {
            return false;
        } else if (this.field3846[arg0] == null) {
            this.method1593((byte) -126, arg0);
            if (this.field3846[arg0] == null) {
                if (arg1 != 0) {
                    method1574(true, 12);
                }
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(BI)V", line = 1905)
    public final void method1592(byte arg0, int arg1) {
        field3877++;
        if (arg0 >= 24 && this.method1566((byte) 76, arg1) && this.field3867 != null) {
            this.field3867[arg1] = null;
        }
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(BI)V", line = 1924)
    private final void method1593(byte arg0, int arg1) {
        field3858++;
        if (arg0 >= -120) {
            return;
        }
        if (this.field3875) {
            this.field3846[arg1] = this.field3865.method1192(2, arg1);
        } else {
            this.field3846[arg1] = class139.method947(6147, false, this.field3865.method1192(2, arg1));
        }
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(Lhi;I)I", line = 1943)
    public final int method1594(class82 arg0, int arg1) {
        field3863++;
        if (!this.method1580(-1)) {
            return -1;
        }
        class82 var3 = arg0.method538((byte) -80);
        if (arg1 > -13) {
            return -95;
        } else {
            int var4 = this.field3874.field534.method646(-106, var3.method546(62));
            return this.method1566((byte) 76, var4) ? var4 : -1;
        }
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(IIB)Z", line = 1966)
    private final boolean method1595(int arg0, int arg1, byte arg2) {
        if (arg2 != -67) {
            this.method1567(5, (class82) null, (class82) null);
        }
        field3866++;
        if (!this.method1580(-1)) {
            return false;
        } else if (arg0 >= 0 && arg1 >= 0 && this.field3874.field515.length > arg0 && arg1 < this.field3874.field515[arg0]) {
            return true;
        } else if (class161.field2811) {
            throw new IllegalArgumentException(arg0 + "," + arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ZI[Lhi;I)Lhi;", line = 1990)
    public static final class82 method1596(boolean arg0, int arg1, class82[] arg2, int arg3) {
        field3847++;
        int var4 = 0;
        for (int var5 = 0; var5 < arg3; var5++) {
            if (arg2[arg1 + var5] == null) {
                arg2[arg1 + var5] = class293.field4919;
            }
            var4 += arg2[arg1 + var5].field1468;
        }
        if (!arg0) {
            field3838 = -83;
        }
        int var6 = 0;
        byte[] var7 = new byte[var4];
        for (int var8 = 0; var8 < arg3; var8++) {
            class82 var9 = arg2[arg1 + var8];
            class190.method1323(var9.field1419, 0, var7, var6, var9.field1468);
            var6 += var9.field1468;
        }
        class82 var10 = new class82();
        var10.field1419 = var7;
        var10.field1468 = var4;
        return var10;
    }

    @OriginalMember(owner = "client!um", name = "f", descriptor = "(I)I", line = 2035)
    public final int method1597(int arg0) {
        field3883++;
        if (arg0 == -1) {
            return this.method1580(arg0 ^ 0x0) ? this.field3874.field515.length : -1;
        } else {
            return 34;
        }
    }

    @OriginalMember(owner = "client!um", name = "e", descriptor = "(II)Z", line = 2050)
    public final boolean method1598(int arg0, int arg1) {
        field3878++;
        if (!this.method1580(arg1)) {
            return false;
        } else if (this.field3874.field515.length == 1) {
            return this.method1587(0, arg0, (byte) 114);
        } else if (!this.method1566((byte) 76, arg0)) {
            return false;
        } else if (this.field3874.field515[arg0] == 1) {
            return this.method1587(arg0, 0, (byte) 94);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(Lhi;I)Z", line = 2074)
    public final boolean method1599(class82 arg0, int arg1) {
        field3851++;
        if (this.method1580(arg1)) {
            class82 var3 = arg0.method538((byte) -80);
            int var4 = this.field3874.field534.method646(-115, var3.method546(-115));
            return var4 >= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ZLhi;)Z", line = 2091)
    public final boolean method1600(boolean arg0, class82 arg1) {
        if (arg0) {
            return false;
        }
        field3876++;
        if (this.method1580(-1)) {
            class82 var3 = arg1.method538((byte) -80);
            int var4 = this.field3874.field534.method646(-93, var3.method546(89));
            return this.method1591(var4, 0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lwj;ZZ)V", line = 2183)
    public class222(class165 arg0, boolean arg1, boolean arg2) {
        this.field3865 = arg0;
        this.field3842 = arg2;
        this.field3875 = arg1;
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(III)[B", line = 2112)
    public final byte[] method1601(int arg0, int arg1, int arg2) {
        field3859++;
        if (!this.method1595(arg2, arg0, (byte) -67)) {
            return null;
        }
        if (this.field3867[arg2] == null || this.field3867[arg2][arg0] == null) {
            boolean var4 = this.method1590(arg1 ^ 0xFF, (int[]) null, arg2);
            if (!var4) {
                this.method1593((byte) -124, arg2);
                boolean var5 = this.method1590(255, (int[]) null, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class51.method359(false, this.field3867[arg2][arg0], false);
        if (arg1 != 0) {
            field3843 = (class222) null;
        }
        return var6;
    }

    @OriginalMember(owner = "client!um", name = "g", descriptor = "(I)I", line = 2144)
    public final int method1602(int arg0) {
        field3845++;
        if (!this.method1580(-1)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field3846.length; var4++) {
            if (this.field3874.field526[var4] > 0) {
                var2 += 100;
                var3 += this.method1573(var4, 93);
            }
        }
        if (arg0 != 25383) {
            return 76;
        } else if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(III[I)[B", line = 2205)
    public final byte[] method1603(int arg0, int arg1, int arg2, int[] arg3) {
        field3860++;
        if (arg0 >= -76) {
            field3838 = -12;
        }
        if (!this.method1595(arg2, arg1, (byte) -67)) {
            return null;
        }
        if (this.field3867[arg2] == null || this.field3867[arg2][arg1] == null) {
            boolean var5 = this.method1590(255, arg3, arg2);
            if (!var5) {
                this.method1593((byte) -121, arg2);
                boolean var6 = this.method1590(255, arg3, arg2);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class51.method359(false, this.field3867[arg2][arg1], false);
        if (this.field3842) {
            this.field3867[arg2][arg1] = null;
            if (this.field3874.field515[arg2] == 1) {
                this.field3867[arg2] = null;
            }
        }
        return var7;
    }
}
