import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class155 extends class202 {

    @OriginalMember(owner = "client!vj", name = "K", descriptor = "[I")
    public static int[] field2060 = new int[50];

    @OriginalMember(owner = "client!vj", name = "I", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!vj", name = "J", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!vj", name = "L", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!vj", name = "M", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "()V")
    public class155() {
        super(1, true);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IZ)[I")
    public final int[] method41(int arg0, boolean arg1) {
        ++field2058;
        int[] var3 = super.field3064.method2452((byte) 29, arg0);
        if (!arg1) {
            this.method41(80, false);
        }
        if (super.field3064.field5837) {
            int[][] var4 = this.method1382(0, arg0, 52);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; class276.field4375 > var8; ++var8) {
                var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILqc;II)V")
    public static final void method944(int arg0, class140 arg1, int arg2, int arg3) {
        ++field2062;
        if (arg1 != null && class392.field5958.field4939 != arg1) {
            if (arg0 != 0) {
                field2061 = -56;
            }
            int var4 = arg1.field1897;
            int var5 = arg1.field1905;
            int var6 = arg1.field1894;
            int var7 = (int) arg1.field1895;
            if (~var6 <= -2001) {
                var6 -= 2000;
            }
            long var8 = arg1.field1895;
            if (var6 == 15) {
                class462.field7109 = 0;
                ++class276.field4376;
                class36.field373 = arg3;
                class189.field2753 = arg2;
                class303.field4748 = 2;
                class81.method578((byte) 66, class237.field3884);
                class170.field2488.method1419(-10147, var7);
                class170.field2488.method1419(arg0 + -10147, var4 - -class453.field7018);
                class170.field2488.method1479((byte) -117, class36.field376.method927(82, -1234) ? 1 : 0);
                class170.field2488.method1442(arg0 ^ 4499, class126.field1718 + var5);
                class62.method459(var4, var5, (byte) 112);
            }
            if (~var6 == -23) {
                class350 var10 = class264.field4276[var7];
                if (var10 != null) {
                    class303.field4748 = 2;
                    class189.field2753 = arg2;
                    class36.field373 = arg3;
                    ++class201.field3053;
                    class462.field7109 = 0;
                    class81.method578((byte) 66, class154.field2056);
                    class170.field2488.method1419(-10147, var7);
                    class170.field2488.method1468(arg0 + 128, !class36.field376.method927(82, -1234) ? 0 : 1);
                    class83.method585(var10.field894[0], 0, var10.method415(-4), var10.field899[0], -2, (byte) -82, 0, var10.method415(arg0 + -4), true);
                }
            }
            if (var6 == 11) {
                class38 var11 = (class38) class365.field5659.method1122((byte) 59, (long) var7);
                if (var11 != null) {
                    ++class204.field3119;
                    class36.field373 = arg3;
                    class303.field4748 = 2;
                    class189.field2753 = arg2;
                    class378 var12 = var11.field378;
                    class462.field7109 = 0;
                    class81.method578((byte) 66, class114.field1606);
                    class170.field2488.method1479((byte) -87, !class36.field376.method927(82, -1234) ? 0 : 1);
                    class170.field2488.method1419(-10147, var7);
                    class83.method585(var12.field894[0], 0, var12.method415(arg0 + -4), var12.field899[0], -2, (byte) -82, 0, var12.method415(-4), true);
                }
            }
            if (var6 == 58) {
                class350 var13 = class264.field4276[var7];
                if (var13 != null) {
                    ++class449.field6960;
                    class303.field4748 = 2;
                    class462.field7109 = 0;
                    class189.field2753 = arg2;
                    class36.field373 = arg3;
                    class81.method578((byte) 66, class432.field6533);
                    class170.field2488.method1444(-1, class36.field376.method927(82, arg0 ^ -1234) ? 1 : 0);
                    class170.field2488.method1442(4499, var7);
                    class83.method585(var13.field894[0], 0, var13.method415(-4), var13.field899[0], -2, (byte) -82, 0, var13.method415(-4), true);
                }
            }
            if (var6 == 3) {
                class462.field7109 = 0;
                class189.field2753 = arg2;
                class303.field4748 = 2;
                ++class419.field6351;
                class36.field373 = arg3;
                class81.method578((byte) 66, class193.field2855);
                class170.field2488.method1437(var7, arg0);
                class170.field2488.method1437(class126.field1718 + var5, 0);
                class170.field2488.method1479((byte) -109, !class36.field376.method927(82, -1234) ? 0 : 1);
                class170.field2488.method1442(4499, class453.field7018 + var4);
                class62.method459(var4, var5, (byte) 113);
            }
            if (var6 == 23) {
                ++class59.field942;
                class462.field7109 = 0;
                class36.field373 = arg3;
                class189.field2753 = arg2;
                class303.field4748 = 2;
                class81.method578((byte) 66, class445.field6912);
                class170.field2488.method1442(4499, var7);
                class170.field2488.method1437(var5 - -class126.field1718, 0);
                class170.field2488.method1468(128, !class36.field376.method927(82, -1234) ? 0 : 1);
                class170.field2488.method1424(false, var4 - -class453.field7018);
                class62.method459(var4, var5, (byte) 71);
            }
            if (~var6 == -22) {
                class350 var14 = class264.field4276[var7];
                if (var14 != null) {
                    class189.field2753 = arg2;
                    class462.field7109 = 0;
                    class303.field4748 = 2;
                    ++class59.field940;
                    class36.field373 = arg3;
                    class81.method578((byte) 66, class259.field4187);
                    class170.field2488.method1468(128, class36.field376.method927(82, -1234) ? 1 : 0);
                    class170.field2488.method1437(var7, 0);
                    class83.method585(var14.field894[0], 0, var14.method415(-4), var14.field899[0], -2, (byte) -82, 0, var14.method415(-4), true);
                }
            }
            if (var6 == 1006) {
                ++class23.field254;
                class36.field373 = arg3;
                class462.field7109 = 0;
                class303.field4748 = 2;
                class189.field2753 = arg2;
                class81.method578((byte) 66, class504.field7544);
                class170.field2488.method1437(var7, 0);
            }
            if (var6 == 18) {
                class350 var15 = class264.field4276[var7];
                if (var15 != null) {
                    class36.field373 = arg3;
                    ++class73.field1102;
                    class189.field2753 = arg2;
                    class462.field7109 = 0;
                    class303.field4748 = 2;
                    class81.method578((byte) 66, class169.field2469);
                    class170.field2488.method1437(var7, 0);
                    class170.field2488.method1433(class36.field376.method927(82, -1234) ? 1 : 0, -116);
                    class83.method585(var15.field894[0], 0, var15.method415(-4), var15.field899[0], -2, (byte) -82, 0, var15.method415(-4), true);
                }
            }
            if (var6 == 2) {
                ++class467.field7152;
                class36.field373 = arg3;
                class189.field2753 = arg2;
                class462.field7109 = 0;
                class303.field4748 = 2;
                class81.method578((byte) 66, class354.field5501);
                class170.field2488.method1442(4499, class453.field7018 + var4);
                class170.field2488.method1437(class31.field327, 0);
                class170.field2488.method1444(~arg0, !class36.field376.method927(82, arg0 ^ -1234) ? 0 : 1);
                class170.field2488.method1429(class398.field6007, arg0 ^ -27168);
                class170.field2488.method1419(-10147, class264.field4277);
                class170.field2488.method1442(4499, class126.field1718 + var5);
                class170.field2488.method1419(-10147, (int) (var8 >>> 32) & Integer.MAX_VALUE);
                class506.method3072(var8, var4, (byte) -114, var5);
            }
            if (var6 == 1004) {
                class462.field7109 = 0;
                class303.field4748 = 2;
                class189.field2753 = arg2;
                class36.field373 = arg3;
                class38 var16 = (class38) class365.field5659.method1122((byte) 59, (long) var7);
                if (var16 != null) {
                    class378 var17 = var16.field378;
                    class191 var18 = var17.field5809;
                    if (var18.field2798 != null) {
                        var18 = var18.method1190(-1, class96.field1394);
                    }
                    if (var18 != null) {
                        class81.method578((byte) 66, class360.field5580);
                        ++class121.field1651;
                        class170.field2488.method1437(var18.field2781, arg0);
                    }
                }
            }
            if (~var6 == -45) {
                class189.field2753 = arg2;
                class462.field7109 = 0;
                class303.field4748 = 2;
                ++class462.field7107;
                class36.field373 = arg3;
                class81.method578((byte) 66, class401.field6042);
                class170.field2488.method1424(false, var7);
                class170.field2488.method1437(class126.field1718 + var5, arg0);
                class170.field2488.method1424(false, class453.field7018 + var4);
                class170.field2488.method1433(!class36.field376.method927(82, -1234) ? 0 : 1, arg0 ^ 115);
                class62.method459(var4, var5, (byte) 87);
            }
            if (var6 == 49) {
                class350 var19 = class264.field4276[var7];
                if (var19 != null) {
                    class462.field7109 = 0;
                    class189.field2753 = arg2;
                    class36.field373 = arg3;
                    class303.field4748 = 2;
                    ++class64.field1011;
                    class81.method578((byte) 66, class316.field4930);
                    class170.field2488.method1419(-10147, var7);
                    class170.field2488.method1433(class36.field376.method927(82, -1234) ? 1 : 0, -58);
                    class170.field2488.method1437(class264.field4277, 0);
                    class170.field2488.method1437(class31.field327, 0);
                    class170.field2488.method1443(class398.field6007, (byte) 94);
                    class83.method585(var19.field894[0], 0, var19.method415(-4), var19.field899[0], -2, (byte) -82, 0, var19.method415(-4), true);
                }
            }
            if (var6 == 1002) {
                ++class388.field5922;
                class189.field2753 = arg2;
                class462.field7109 = 0;
                class36.field373 = arg3;
                class303.field4748 = 2;
                class81.method578((byte) 66, class30.field320);
                class170.field2488.method1424(false, Integer.MAX_VALUE & (int) (var8 >>> 32));
                class170.field2488.method1437(class453.field7018 + var4, 0);
                class170.field2488.method1442(4499, class126.field1718 + var5);
                class170.field2488.method1468(128, !class36.field376.method927(82, -1234) ? 0 : 1);
                class506.method3072(var8, var4, (byte) -122, var5);
            }
            if (~var6 == -61) {
                if (~class439.field6815 < -1 && class36.field376.method927(82, arg0 ^ -1234) && class36.field376.method927(81, -1234)) {
                    class330.method2208(119, class453.field7018 + var4, class358.field5565.field6419, class126.field1718 + var5);
                } else {
                    ++class256.field4143;
                    class303.field4748 = 1;
                    class36.field373 = arg3;
                    class189.field2753 = arg2;
                    class462.field7109 = 0;
                    class81.method578((byte) 66, class315.field4925);
                    class170.field2488.method1424(false, class126.field1718 + var5);
                    class170.field2488.method1419(-10147, class453.field7018 - -var4);
                }
            }
            if (~var6 == -47) {
                class462.field7109 = 0;
                class36.field373 = arg3;
                class189.field2753 = arg2;
                ++class64.field1011;
                class303.field4748 = 2;
                class81.method578((byte) 66, class316.field4930);
                class170.field2488.method1419(arg0 ^ -10147, class358.field5565.field847);
                class170.field2488.method1433(!class36.field376.method927(82, -1234) ? 0 : 1, arg0 + -97);
                class170.field2488.method1437(class264.field4277, 0);
                class170.field2488.method1437(class31.field327, 0);
                class170.field2488.method1443(class398.field6007, (byte) 94);
            }
            if (~var6 == -10) {
                class462.field7109 = 0;
                class36.field373 = arg3;
                class303.field4748 = 2;
                class189.field2753 = arg2;
                ++class132.field1784;
                class81.method578((byte) 66, class481.field7327);
                class170.field2488.method1442(arg0 + 4499, Integer.MAX_VALUE & (int) (var8 >>> 32));
                class170.field2488.method1479((byte) -95, class36.field376.method927(82, -1234) ? 1 : 0);
                class170.field2488.method1442(4499, class453.field7018 + var4);
                class170.field2488.method1424(false, class126.field1718 + var5);
                class506.method3072(var8, var4, (byte) -121, var5);
            }
            if (~var6 == -6) {
                class437 var20 = class24.method150(true, var4, var5);
                if (var20 != null) {
                    class497.method3038(arg0 + 123);
                    class467 var21 = client.method492(var20);
                    class262.method1795(true, var21.field7145, var21.method2913(arg0 ^ -72), var20);
                    class427.field6450 = class210.method1484(var20, arg0);
                    if (class427.field6450 == null) {
                        class427.field6450 = "Null";
                    }
                    class283.field4459 = var20.field6632 + "<col=ffffff>";
                }
            } else {
                if (var6 == 48) {
                    class38 var22 = (class38) class365.field5659.method1122((byte) 59, (long) var7);
                    if (var22 != null) {
                        class189.field2753 = arg2;
                        class36.field373 = arg3;
                        class303.field4748 = 2;
                        ++class452.field6998;
                        class378 var23 = var22.field378;
                        class462.field7109 = 0;
                        class81.method578((byte) 66, class295.field4647);
                        class170.field2488.method1442(4499, class31.field327);
                        class170.field2488.method1424(false, var7);
                        class170.field2488.method1468(128, !class36.field376.method927(82, -1234) ? 0 : 1);
                        class170.field2488.method1477(65280, class398.field6007);
                        class170.field2488.method1419(arg0 ^ -10147, class264.field4277);
                        class83.method585(var23.field894[0], 0, var23.method415(-4), var23.field899[0], -2, (byte) -82, 0, var23.method415(arg0 ^ -4), true);
                    }
                }
                if (var6 == 10) {
                    class350 var24 = class264.field4276[var7];
                    if (var24 != null) {
                        class303.field4748 = 2;
                        class189.field2753 = arg2;
                        class462.field7109 = 0;
                        class36.field373 = arg3;
                        ++class410.field6209;
                        class81.method578((byte) 66, class268.field4298);
                        class170.field2488.method1433(class36.field376.method927(82, -1234) ? 1 : 0, arg0 ^ 74);
                        class170.field2488.method1419(-10147, var7);
                        class83.method585(var24.field894[0], 0, var24.method415(-4), var24.field899[0], -2, (byte) -82, 0, var24.method415(-4), true);
                    }
                }
                if (var6 == 51) {
                    class303.field4748 = 2;
                    ++class136.field1854;
                    class36.field373 = arg3;
                    class462.field7109 = 0;
                    class189.field2753 = arg2;
                    class81.method578((byte) 66, class314.field4916);
                    class170.field2488.method1424(false, class126.field1718 + var5);
                    class170.field2488.method1419(arg0 + -10147, var4 - -class453.field7018);
                    class170.field2488.method1442(4499, Integer.MAX_VALUE & (int) (var8 >>> 32));
                    class170.field2488.method1479((byte) -122, !class36.field376.method927(82, arg0 ^ -1234) ? 0 : 1);
                    class506.method3072(var8, var4, (byte) -124, var5);
                }
                if (~var6 == -9 && class322.field5031 == null) {
                    class50.method360(var4, var5, arg0 ^ 124);
                    class322.field5031 = class24.method150(true, var4, var5);
                    class479.method2962(arg0 + -109, class322.field5031);
                }
                if (~var6 == -7) {
                    class38 var25 = (class38) class365.field5659.method1122((byte) 59, (long) var7);
                    if (var25 != null) {
                        class189.field2753 = arg2;
                        class462.field7109 = 0;
                        class378 var26 = var25.field378;
                        ++class67.field1025;
                        class36.field373 = arg3;
                        class303.field4748 = 2;
                        class81.method578((byte) 66, class279.field4399);
                        class170.field2488.method1437(var7, arg0);
                        class170.field2488.method1468(128, class36.field376.method927(82, -1234) ? 1 : 0);
                        class83.method585(var26.field894[0], 0, var26.method415(arg0 + -4), var26.field899[0], -2, (byte) -82, 0, var26.method415(-4), true);
                    }
                }
                if (var6 == 19) {
                    class38 var27 = (class38) class365.field5659.method1122((byte) 59, (long) var7);
                    if (var27 != null) {
                        class303.field4748 = 2;
                        class462.field7109 = 0;
                        class378 var28 = var27.field378;
                        class189.field2753 = arg2;
                        class36.field373 = arg3;
                        ++class171.field2504;
                        class81.method578((byte) 66, class389.field5926);
                        class170.field2488.method1442(4499, var7);
                        class170.field2488.method1468(128, class36.field376.method927(82, -1234) ? 1 : 0);
                        class83.method585(var28.field894[0], 0, var28.method415(arg0 ^ -4), var28.field899[0], -2, (byte) -82, 0, var28.method415(arg0 ^ -4), true);
                    }
                }
                if (~var6 == -14) {
                    class437 var29 = class24.method150(true, var4, var5);
                    if (var29 != null) {
                        client.method511(25, var29);
                    }
                }
                if (~var6 == -18) {
                    class38 var30 = (class38) class365.field5659.method1122((byte) 59, (long) var7);
                    if (var30 != null) {
                        class189.field2753 = arg2;
                        class462.field7109 = 0;
                        class36.field373 = arg3;
                        class378 var31 = var30.field378;
                        class303.field4748 = 2;
                        ++class262.field4218;
                        class81.method578((byte) 66, class411.field6219);
                        class170.field2488.method1442(4499, var7);
                        class170.field2488.method1479((byte) -106, !class36.field376.method927(82, -1234) ? 0 : 1);
                        class83.method585(var31.field894[0], 0, var31.method415(arg0 + -4), var31.field899[0], -2, (byte) -82, 0, var31.method415(-4), true);
                    }
                }
                if (~var6 == -5) {
                    class350 var32 = class264.field4276[var7];
                    if (var32 != null) {
                        class189.field2753 = arg2;
                        ++class490.field7417;
                        class462.field7109 = 0;
                        class36.field373 = arg3;
                        class303.field4748 = 2;
                        class81.method578((byte) 66, class76.field1124);
                        class170.field2488.method1437(var7, 0);
                        class170.field2488.method1444(-1, class36.field376.method927(82, -1234) ? 1 : 0);
                        class83.method585(var32.field894[0], 0, var32.method415(-4), var32.field899[0], -2, (byte) -82, 0, var32.method415(arg0 + -4), true);
                    }
                }
                if (var6 == 50) {
                    ++class441.field6860;
                    class462.field7109 = 0;
                    class303.field4748 = 2;
                    class36.field373 = arg3;
                    class189.field2753 = arg2;
                    class81.method578((byte) 66, class315.field4921);
                    class170.field2488.method1437(class126.field1718 + var5, 0);
                    class170.field2488.method1442(4499, Integer.MAX_VALUE & (int) (var8 >>> 32));
                    class170.field2488.method1419(-10147, class453.field7018 + var4);
                    class170.field2488.method1444(-1, class36.field376.method927(82, -1234) ? 1 : 0);
                    class506.method3072(var8, var4, (byte) -128, var5);
                }
                if (var6 == 30) {
                    class350 var33 = class264.field4276[var7];
                    if (var33 != null) {
                        class303.field4748 = 2;
                        class36.field373 = arg3;
                        ++class491.field7425;
                        class189.field2753 = arg2;
                        class462.field7109 = 0;
                        class81.method578((byte) 66, class348.field5401);
                        class170.field2488.method1444(arg0 + -1, class36.field376.method927(82, arg0 ^ -1234) ? 1 : 0);
                        class170.field2488.method1419(-10147, var7);
                        class83.method585(var33.field894[0], 0, var33.method415(arg0 + -4), var33.field899[0], -2, (byte) -82, 0, var33.method415(-4), true);
                    }
                }
                if (~var6 == -58) {
                    ++class316.field4931;
                    class303.field4748 = 2;
                    class462.field7109 = 0;
                    class36.field373 = arg3;
                    class189.field2753 = arg2;
                    class81.method578((byte) 66, class293.field4624);
                    class170.field2488.method1442(4499, var4 - -class453.field7018);
                    class170.field2488.method1433(class36.field376.method927(82, -1234) ? 1 : 0, -78);
                    class170.field2488.method1424(false, class126.field1718 + var5);
                    class170.field2488.method1437(var7, 0);
                    class62.method459(var4, var5, (byte) 124);
                }
                if (var6 == 16) {
                    class350 var34 = class264.field4276[var7];
                    if (var34 != null) {
                        ++class306.field4808;
                        class36.field373 = arg3;
                        class462.field7109 = 0;
                        class303.field4748 = 2;
                        class189.field2753 = arg2;
                        class81.method578((byte) 66, class88.field1270);
                        class170.field2488.method1433(!class36.field376.method927(82, -1234) ? 0 : 1, -112);
                        class170.field2488.method1437(var7, 0);
                        class83.method585(var34.field894[0], 0, var34.method415(-4), var34.field899[0], -2, (byte) -82, 0, var34.method415(-4), true);
                    }
                }
                if (var6 == 20) {
                    class38 var35 = (class38) class365.field5659.method1122((byte) 59, (long) var7);
                    if (var35 != null) {
                        class462.field7109 = 0;
                        class303.field4748 = 2;
                        class378 var36 = var35.field378;
                        ++class423.field6409;
                        class189.field2753 = arg2;
                        class36.field373 = arg3;
                        class81.method578((byte) 66, class45.field588);
                        class170.field2488.method1444(arg0 + -1, !class36.field376.method927(82, -1234) ? 0 : 1);
                        class170.field2488.method1437(var7, 0);
                        class83.method585(var36.field894[0], 0, var36.method415(-4), var36.field899[0], -2, (byte) -82, 0, var36.method415(arg0 ^ -4), true);
                    }
                }
                if (~var6 == -1008) {
                    class303.field4748 = 2;
                    class189.field2753 = arg2;
                    class462.field7109 = 0;
                    class36.field373 = arg3;
                    ++class309.field4829;
                    class81.method578((byte) 66, class326.field5123);
                    class170.field2488.method1437(var7, 0);
                }
                if (~var6 == -1010 || ~var6 == -1009 || var6 == 1001 || ~var6 == -1011 || var6 == 1003) {
                    class289.method1948(var4, var7, arg0 + 91, var6);
                }
                if (var6 == 45) {
                    class303.field4748 = 2;
                    class36.field373 = arg3;
                    class189.field2753 = arg2;
                    class462.field7109 = 0;
                    ++class36.field370;
                    class81.method578((byte) 66, class318.field4960);
                    class170.field2488.method1437(class453.field7018 + var4, 0);
                    class170.field2488.method1437(class264.field4277, 0);
                    class170.field2488.method1429(class398.field6007, arg0 ^ -27168);
                    class170.field2488.method1424(false, class126.field1718 + var5);
                    class170.field2488.method1437(var7, 0);
                    class170.field2488.method1437(class31.field327, arg0);
                    class170.field2488.method1444(-1, class36.field376.method927(82, arg0 ^ -1234) ? 1 : 0);
                    class62.method459(var4, var5, (byte) 112);
                }
                if (var6 == 59 || ~var6 == -1013) {
                    class311.method2093(false, var4, var7, var5, arg1.field1902);
                }
                if (~var6 == -13) {
                    class36.field373 = arg3;
                    class189.field2753 = arg2;
                    class462.field7109 = 0;
                    ++class211.field3421;
                    class303.field4748 = 2;
                    class81.method578((byte) 66, class264.field4274);
                    class170.field2488.method1437(var5 - -class126.field1718, 0);
                    class170.field2488.method1468(128, class36.field376.method927(82, -1234) ? 1 : 0);
                    class170.field2488.method1419(-10147, Integer.MAX_VALUE & (int) (var8 >>> 32));
                    class170.field2488.method1419(-10147, class453.field7018 + var4);
                    class506.method3072(var8, var4, (byte) -128, var5);
                }
                if (var6 == 25) {
                    class462.field7109 = 0;
                    class189.field2753 = arg2;
                    ++class34.field356;
                    class36.field373 = arg3;
                    class303.field4748 = 1;
                    class81.method578((byte) 66, class63.field999);
                    class170.field2488.method1443(class398.field6007, (byte) 94);
                    class170.field2488.method1442(4499, class31.field327);
                    class170.field2488.method1419(-10147, class453.field7018 + var4);
                    class170.field2488.method1442(4499, class126.field1718 - -var5);
                    class170.field2488.method1424(false, class264.field4277);
                    class83.method585(var4, 0, 1, var5, -4, (byte) -82, 0, 1, true);
                }
                if (~var6 == -48) {
                    if (class439.field6815 > 0 && class36.field376.method927(82, arg0 ^ -1234) && class36.field376.method927(81, -1234)) {
                        class330.method2208(122, class453.field7018 - -var4, class358.field5565.field6419, class126.field1718 + var5);
                    } else {
                        class460.method2891(var5, var7, 30649, var4);
                        if (~var7 != -2) {
                            class189.field2753 = arg2;
                            class36.field373 = arg3;
                            class462.field7109 = 0;
                            class303.field4748 = 1;
                        } else {
                            class170.field2488.method1479((byte) -108, -1);
                            class170.field2488.method1479((byte) -90, -1);
                            class170.field2488.method1437((int) class388.field5918, arg0);
                            class170.field2488.method1479((byte) -103, 57);
                            class170.field2488.method1479((byte) -124, class386.field5903);
                            class170.field2488.method1479((byte) -95, class326.field5126);
                            class170.field2488.method1479((byte) -122, 89);
                            class170.field2488.method1437(class358.field5565.field6417, 0);
                            class170.field2488.method1437(class358.field5565.field6410, arg0);
                            class170.field2488.method1479((byte) -119, 63);
                        }
                        class83.method585(var4, 0, 1, var5, -4, (byte) -82, 0, 1, true);
                    }
                }
                if (class128.field1732) {
                    class497.method3038(115);
                }
                if (class380.field5840 != null && class463.field7121 == 0) {
                    class479.method2962(arg0 ^ -100, class380.field5840);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZIIII)V")
    public static final void method945(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2059;
        if (arg2 == 340) {
            if (class385.method2479(arg2 + -340, arg1)) {
                class101.method682(class433.field6540[arg1], arg3, -1, -1, arg4, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "(I)V")
    public static void method946(int arg0) {
        field2060 = null;
        if (arg0 != -2) {
            method946(-49);
        }
    }
}
