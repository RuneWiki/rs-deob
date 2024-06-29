import jaggl.OpenGL;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class90 extends class325 {

    @OriginalMember(owner = "client!cd", name = "D", descriptor = "I")
    private int field908 = -1;

    @OriginalMember(owner = "client!cd", name = "z", descriptor = "I")
    private int field904 = -1;

    @OriginalMember(owner = "client!cd", name = "v", descriptor = "I")
    public int field900;

    @OriginalMember(owner = "client!cd", name = "w", descriptor = "I")
    public int field901;

    @OriginalMember(owner = "client!cd", name = "C", descriptor = "I")
    public int field907;

    @OriginalMember(owner = "client!cd", name = "y", descriptor = "I")
    public static int field903 = 0;

    @OriginalMember(owner = "client!cd", name = "E", descriptor = "Lht;")
    public static class607 field909 = new class607("", 16);

    @OriginalMember(owner = "client!cd", name = "x", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!cd", name = "A", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!cd", name = "B", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!cd", name = "F", descriptor = "Z")
    public static boolean field910;

    @OriginalMember(owner = "client!cd", name = "u", descriptor = "[[S")
    public static short[][] field899;

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lvj;IIII)V", line = 6)
    public class90(class422 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg2 * arg4 * arg3, false);
        this.field900 = arg4;
        this.field901 = arg3;
        this.field907 = arg2;
        super.field3991.method2396((byte) 36, this);
        OpenGL.glTexImage3Dub(super.field3988, 0, super.field4000, this.field907, this.field901, this.field900, 0, class396.method2242(super.field4000, false), 5121, (byte[]) null, 0);
        this.method1839(true, (byte) 63);
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lvj;IIII[BI)V", line = 20)
    public class90(class422 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field901 = arg3;
        this.field900 = arg4;
        this.field907 = arg2;
        super.field3991.method2396((byte) 36, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field3988, 0, super.field4000, this.field907, this.field901, this.field900, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method1839(true, (byte) 52);
    }

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "(I)V", line = 35)
    public static void method457(int arg0) {
        field899 = null;
        field909 = null;
        if (arg0 != -1) {
            field899 = null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)Z", line = 48)
    public static final boolean method458(boolean arg0) throws IOException {
        ++field905;
        if (class99.field1061 == null) {
            return false;
        } else {
            if (class223.field2773 == null) {
                if (class551.field7877) {
                    if (!class99.field1061.method1514(-28728, 1)) {
                        return false;
                    }
                    class99.field1061.method1508(1, (byte) 60, class626.field8849.field1269, 0);
                    class551.field7877 = false;
                    class617.field8702 = 0;
                    ++class412.field5532;
                }
                class626.field8849.field1218 = 0;
                if (class626.field8849.method2582(95)) {
                    if (!class99.field1061.method1514(-28728, 1)) {
                        return false;
                    }
                    class99.field1061.method1508(1, (byte) 120, class626.field8849.field1269, 1);
                    class617.field8702 = 0;
                    ++class412.field5532;
                }
                class551.field7877 = true;
                class110[] var1 = class236.method1407(-1);
                int var2 = class626.field8849.method2580((byte) -56);
                if (var2 < 0 || ~var1.length >= ~var2) {
                    throw new IOException("invo:" + var2 + " ip:" + class626.field8849.field1218);
                }
                class223.field2773 = var1[var2];
                class257.field3209 = class223.field2773.field1176;
            }
            if (~class257.field3209 == 0) {
                if (!class99.field1061.method1514(-28728, 1)) {
                    return false;
                }
                class99.field1061.method1508(1, (byte) -71, class626.field8849.field1269, 0);
                class617.field8702 = 0;
                ++class412.field5532;
                class257.field3209 = class626.field8849.field1269[0] & 255;
            }
            if (~class257.field3209 == 1) {
                if (!class99.field1061.method1514(-28728, 2)) {
                    return false;
                }
                class99.field1061.method1508(2, (byte) 80, class626.field8849.field1269, 0);
                class626.field8849.field1218 = 0;
                class257.field3209 = class626.field8849.method643((byte) -77);
                class412.field5532 += 2;
                class617.field8702 = 0;
            }
            if (class257.field3209 > 0) {
                if (!class99.field1061.method1514(-28728, class257.field3209)) {
                    return false;
                }
                class626.field8849.field1218 = 0;
                class99.field1061.method1508(class257.field3209, (byte) 71, class626.field8849.field1269, 0);
                class412.field5532 += class257.field3209;
                class617.field8702 = 0;
            }
            class336.field4227 = class152.field1677;
            class152.field1677 = class338.field4255;
            class338.field4255 = class223.field2773;
            if (class575.field8160 == class223.field2773) {
                int var3 = class626.field8849.method643((byte) -77);
                int var4 = class626.field8849.method620((byte) -126);
                int[] var5 = new int[4];
                for (int var6 = 0; ~var6 > -5; ++var6) {
                    var5[var6] = class626.field8849.method623(-118);
                }
                class214 var7 = (class214) class274.field3433.method3669((long) var3, -1);
                if (var7 != null) {
                    class386.method2207(-3, var7.field2601, var5, var4);
                }
                class223.field2773 = null;
                return true;
            } else if (class223.field2773 == class181.field2026) {
                class180.field2025 = class626.field8849.method620((byte) -126);
                class301.field3745 = class626.field8849.method618(105) << 3;
                class411.field5523 = class626.field8849.method618(101) << 3;
                for (class310 var8 = (class310) class200.field2354.method3674(-111); var8 != null; var8 = (class310) class200.field2354.method3672(-1)) {
                    int var10 = (int) (3L & var8.field4176 >> 28);
                    int var11 = (int) (var8.field4176 & 16383L);
                    int var12 = -class26.field245 + var11;
                    int var13 = (int) (var8.field4176 >> 14 & 16383L);
                    int var14 = var13 - class231.field2860;
                    if (~class180.field2025 == ~var10 && ~var12 <= ~class301.field3745 && ~(class301.field3745 - -8) < ~var12 && ~class411.field5523 >= ~var14 && ~(class411.field5523 + 8) < ~var14) {
                        var8.method1922(111);
                        if (~var12 <= -1 && ~var14 <= -1 && ~class142.field1574 < ~var12 && class140.field1550 > var14) {
                            class443.method2566(var14, var12, -2098890839, class180.field2025);
                        }
                    }
                }
                for (class323 var9 = (class323) class412.field5527.method3434((byte) 2); var9 != null; var9 = (class323) class412.field5527.method3430(true)) {
                    if (class301.field3745 <= var9.field3971 && ~var9.field3971 > ~(class301.field3745 - -8) && class411.field5523 <= var9.field3968 && class411.field5523 - -8 > var9.field3968 && ~class180.field2025 == ~var9.field3973) {
                        var9.field3967 = 0;
                    }
                }
                class223.field2773 = null;
                return true;
            } else if (client.field9556 == class223.field2773) {
                class301.field3745 = class626.field8849.method657(false) << 3;
                class411.field5523 = class626.field8849.method618(82) << 3;
                class180.field2025 = class626.field8849.method620((byte) 60);
                while (class626.field8849.field1218 < class257.field3209) {
                    class469 var15 = class152.method827((byte) 45)[class626.field8849.method620((byte) 15)];
                    class245.method1446(65535, var15);
                }
                class223.field2773 = null;
                return true;
            } else if (class296.field3700 == class223.field2773) {
                int var16 = class626.field8849.method643((byte) -77);
                int var17 = class626.field8849.method650((byte) -102);
                int var18 = class626.field8849.method631(arg0);
                int var19 = class626.field8849.method674(-16777216);
                if (class162.method879(var16, false)) {
                    class265.method1565(var18, 5, var17, 4, var19);
                }
                class223.field2773 = null;
                return true;
            } else if (class223.field2773 == class103.field1117) {
                class478.method2754((byte) 42, class626.field8849.method626(118));
                class223.field2773 = null;
                return true;
            } else if (class83.field854 == class223.field2773) {
                boolean var20 = ~class626.field8849.method620((byte) -128) == -2;
                String var21 = class626.field8849.method626(121);
                String var22 = var21;
                if (var20) {
                    var22 = class626.field8849.method626(79);
                }
                int var23 = class626.field8849.method620((byte) 25);
                int var24 = class626.field8849.method643((byte) -77);
                boolean var25 = false;
                if (var23 <= 1 && class16.method67((byte) 124, var22)) {
                    var25 = true;
                }
                if (!var25 && class260.field3265 == 0) {
                    String var26 = class83.field859.method2211(var24, -27582).method1692(-1, class626.field8849);
                    if (var23 != 2) {
                        if (var23 == 1) {
                            class322.method1825(var21, "<img=0>" + var22, (String) null, var24, "<img=0>" + var21, 25, 0, var26, 125);
                        } else {
                            class322.method1825(var21, var22, (String) null, var24, var21, 25, 0, var26, 126);
                        }
                    } else {
                        class322.method1825(var21, "<img=1>" + var22, (String) null, var24, "<img=1>" + var21, 25, 0, var26, 115);
                    }
                }
                class223.field2773 = null;
                return true;
            } else if (class223.field2773 == class122.field1360) {
                class245.method1446(65535, class120.field1340);
                class223.field2773 = null;
                return true;
            } else if (class560.field7994 == class223.field2773) {
                int var27 = class626.field8849.method619((byte) -80);
                if (var27 == 65535) {
                    var27 = -1;
                }
                int var28 = class626.field8849.method620((byte) -128);
                int var29 = class626.field8849.method649(255);
                String var30 = class626.field8849.method626(72);
                if (var28 >= 1 && var28 <= 8) {
                    if (var30.equalsIgnoreCase("null")) {
                        var30 = null;
                    }
                    class364.field4890[var28 + -1] = var30;
                    class518.field7378[var28 - 1] = var27;
                    class421.field5612[var28 + -1] = var29 == 0;
                }
                class223.field2773 = null;
                return true;
            } else if (class382.field5165 == class223.field2773) {
                class204.method1225(78, class626.field8849, class257.field3209);
                class223.field2773 = null;
                return true;
            } else if (class508.field7288 == class223.field2773) {
                class626.field8849.field1218 += 28;
                if (class626.field8849.method635((byte) 39)) {
                    class41.method215(0, class626.field8849.field1218 - 28, class626.field8849);
                }
                class223.field2773 = null;
                return true;
            } else if (class285.field3567 == class223.field2773) {
                class245.method1446(65535, class116.field1284);
                class223.field2773 = null;
                return true;
            } else if (class487.field7092 == class223.field2773) {
                int var31 = class626.field8849.method643((byte) -77);
                if (var31 == 65535) {
                    var31 = -1;
                }
                int var32 = class626.field8849.method620((byte) 94);
                int var33 = class626.field8849.method643((byte) -77);
                int var34 = class626.field8849.method620((byte) 121);
                class247.method1454(var34, var33, var31, var32, -23, false);
                class223.field2773 = null;
                return true;
            } else if (class645.field9101 == class223.field2773) {
                int var35 = class626.field8849.method619((byte) -59);
                int var36 = class626.field8849.method673((byte) 126);
                int var37 = class626.field8849.method620((byte) -126);
                if (class162.method879(var35, false)) {
                    class117.method685(var37, (byte) 45, var36);
                }
                class223.field2773 = null;
                return true;
            } else if (class376.field5113 == class223.field2773) {
                class106.method573(class353.field4757, class626.field8849, (byte) -56, class257.field3209);
                class223.field2773 = null;
                return true;
            } else if (class96.field978 == class223.field2773) {
                class223.field2772 = ~class257.field3209 < -3 ? class626.field8849.method626(116) : class198.field2311.method1195((byte) 62, class504.field7267);
                class676.field9407 = ~class257.field3209 >= -1 ? -1 : class626.field8849.method643((byte) -77);
                class223.field2773 = null;
                if (~class676.field9407 == -65536) {
                    class676.field9407 = -1;
                }
                return true;
            } else if (class300.field3740 == class223.field2773) {
                int var38 = class626.field8849.method643((byte) -77);
                int var39 = class626.field8849.method631(false);
                int var40 = class626.field8849.method664(-11604);
                int var41 = class626.field8849.method619((byte) -43);
                if (~var41 == -65536) {
                    var41 = -1;
                }
                if (class162.method879(var38, false)) {
                    class93.method474(true, var41, var40, var39);
                    class487 var42 = class19.field153.method272(var41, -11824);
                    class646.method3620(var42.field7029, var40, -1, var42.field7067, var42.field7072);
                    class231.method1387(var42.field7040, var42.field7006, var42.field7046, (byte) 127, var40);
                }
                class223.field2773 = null;
                return true;
            } else if (class223.field2773 == class162.field1809) {
                int var43 = class626.field8849.method620((byte) 78);
                if (class626.field8849.method620((byte) -126) != 0) {
                    --class626.field8849.field1218;
                    class383.field5170[var43] = new class61(class626.field8849);
                } else {
                    class383.field5170[var43] = new class61();
                }
                class223.field2773 = null;
                class409.field5469 = class158.field1780;
                return true;
            } else if (class558.field7960 == class223.field2773) {
                int var44 = class626.field8849.method620((byte) -28);
                boolean var45 = (var44 & 1) == 1;
                String var46 = class626.field8849.method626(94);
                String var47 = class626.field8849.method626(83);
                if (var47.equals("")) {
                    var47 = var46;
                }
                String var48 = class626.field8849.method626(96);
                String var49 = class626.field8849.method626(122);
                if (var49.equals("")) {
                    var49 = var48;
                }
                if (!var45) {
                    class319.field3937[class46.field482] = var46;
                    class80.field832[class46.field482] = var47;
                    class551.field7876[class46.field482] = var48;
                    class157.field1756[class46.field482] = var49;
                    class692.field9720[class46.field482] = class105.method572(2, var44) == 2;
                    ++class46.field482;
                } else {
                    for (int var50 = 0; var50 < class46.field482; ++var50) {
                        if (class80.field832[var50].equals(var49)) {
                            class319.field3937[var50] = var46;
                            class80.field832[var50] = var47;
                            class551.field7876[var50] = var48;
                            class157.field1756[var50] = var49;
                            break;
                        }
                    }
                }
                class245.field3028 = class158.field1780;
                class223.field2773 = null;
                return true;
            } else if (class470.field6722 == class223.field2773) {
                int var51 = class626.field8849.method664(-11604);
                int var52 = class626.field8849.method650((byte) -43);
                int var53 = class626.field8849.method674(-16777216);
                if (class162.method879(var52, arg0)) {
                    class633 var54 = (class633) class14.field117.method3669((long) var51, -1);
                    class633 var55 = (class633) class14.field117.method3669((long) var53, -1);
                    if (var55 != null) {
                        class604.method3377((byte) -6, var55, false, var54 == null || ~var54.field8920 != ~var55.field8920);
                    }
                    if (var54 != null) {
                        var54.method1922(126);
                        class14.field117.method3671(false, var54, (long) var53);
                    }
                    class452 var56 = class92.method464(var51, -167823504);
                    if (var56 != null) {
                        class130.method741(var56, 26034);
                    }
                    class452 var57 = class92.method464(var53, -167823504);
                    if (var57 != null) {
                        class130.method741(var57, 26034);
                        class8.method50(true, var57, -17006);
                    }
                    if (~class209.field2466 != 0) {
                        class633.method3561(false, class209.field2466, 1);
                    }
                }
                class223.field2773 = null;
                return true;
            } else if (class662.field9280 == class223.field2773) {
                int var58 = class626.field8849.method623(80);
                int var59 = class626.field8849.method673((byte) 123);
                int var60 = class626.field8849.method643((byte) -77);
                if (~var60 == -65536) {
                    var60 = -1;
                }
                if (class162.method879(var58, arg0)) {
                    class265.method1565(var59, 2, var60, 4, -1);
                }
                class223.field2773 = null;
                return true;
            } else if (class257.field3217 == class223.field2773) {
                class245.method1446(65535, class469.field6705);
                class223.field2773 = null;
                return true;
            } else if (class380.field5147 == class223.field2773) {
                int var61 = class626.field8849.method631(false);
                int var62 = class626.field8849.method643((byte) -77);
                int var63 = class626.field8849.method650((byte) -19);
                if (class162.method879(var62, false)) {
                    class296.method1734(var63, -111, var61);
                }
                class223.field2773 = null;
                return true;
            } else if (class663.field9287 == class223.field2773) {
                int var64 = class626.field8849.method643((byte) -77);
                if (~var64 == -65536) {
                    var64 = -1;
                }
                int var65 = class626.field8849.method620((byte) -128);
                int var66 = class626.field8849.method643((byte) -77);
                int var67 = class626.field8849.method620((byte) -128);
                class421.method2355(-86, var67, var64, var66, var65);
                class223.field2773 = null;
                return true;
            } else if (class384.field5185 == class223.field2773) {
                if (!class2.method12(class421.field5601, 10755)) {
                    class311.field3842 = 30 * class626.field8849.method643((byte) -77);
                } else {
                    class311.field3842 = (int) (2.5F * (float) class626.field8849.method643((byte) -77));
                }
                class153.field1695 = class158.field1780;
                class223.field2773 = null;
                return true;
            } else if (class223.field2773 == class221.field2704) {
                class73.method394(0, false);
                class223.field2773 = null;
                return false;
            } else if (class223.field2773 == class170.field1896) {
                class136.field1496 = class626.field8849.method637(255);
                class443.field6260 = class626.field8849.method620((byte) 87) == 1;
                class223.field2773 = null;
                return true;
            } else if (class463.field6590 == class223.field2773) {
                int var68 = class626.field8849.method643((byte) -77);
                int var69 = class626.field8849.method620((byte) -128);
                int var70 = class626.field8849.method620((byte) -128);
                int var71 = class626.field8849.method643((byte) -77) << 2;
                int var72 = class626.field8849.method620((byte) -27);
                int var73 = class626.field8849.method620((byte) -127);
                if (class162.method879(var68, false)) {
                    class236.method1406(var70, var73, -18279, true, var72, var71, var69);
                }
                class223.field2773 = null;
                return true;
            } else if (class670.field9342 == class223.field2773) {
                class409.method2291(87);
                class223.field2773 = null;
                return false;
            } else if (class311.field3845 == class223.field2773) {
                int var74 = class626.field8849.method643((byte) -77);
                int var75 = class626.field8849.method620((byte) -127);
                int var76 = class626.field8849.method620((byte) -126);
                int var77 = class626.field8849.method643((byte) -77) << 2;
                int var78 = class626.field8849.method620((byte) -21);
                int var79 = class626.field8849.method620((byte) -127);
                if (class162.method879(var74, false)) {
                    class552.method3131(var78, var77, var79, 3072, var76, var75);
                }
                class223.field2773 = null;
                return true;
            } else if (class223.field2773 == class140.field1547) {
                int var80 = class626.field8849.method623(23);
                String var81 = class626.field8849.method626(86);
                int var82 = class626.field8849.method619((byte) -68);
                if (class162.method879(var80, false)) {
                    class580.method3283(var82, var81, -75);
                }
                class223.field2773 = null;
                return true;
            } else if (class310.field3835 == class223.field2773) {
                class180.field2025 = class626.field8849.method630(30426);
                class301.field3745 = class626.field8849.method632(true) << 3;
                class411.field5523 = class626.field8849.method632(true) << 3;
                class223.field2773 = null;
                return true;
            } else if (class53.field519 == class223.field2773) {
                int var83 = class626.field8849.method650((byte) -83);
                int var84 = class626.field8849.method674(-16777216);
                class628.field8859.method1726(124, var83, var84);
                class223.field2773 = null;
                return true;
            } else if (class223.field2773 == class158.field1783) {
                class245.method1446(65535, class375.field5097);
                class223.field2773 = null;
                return true;
            } else if (class223.field2773 == class138.field1521) {
                class245.method1446(65535, class200.field2358);
                class223.field2773 = null;
                return true;
            } else if (class223.field2773 == class201.field2364) {
                class245.method1446(65535, class687.field9660);
                class223.field2773 = null;
                return true;
            } else if (class223.field2773 == class110.field1174) {
                int var85 = class626.field8849.method643((byte) -77);
                int var86 = class626.field8849.method620((byte) -128);
                int var87 = class626.field8849.method620((byte) 75);
                int var88 = class626.field8849.method620((byte) -126);
                int var89 = class626.field8849.method620((byte) 40);
                int var90 = class626.field8849.method643((byte) -77);
                if (class162.method879(var85, arg0)) {
                    class689.field9699[var86] = true;
                    class319.field3935[var86] = var87;
                    class280.field3482[var86] = var88;
                    class566.field8076[var86] = var89;
                    class480.field6907[var86] = var90;
                }
                class223.field2773 = null;
                return true;
            } else if (class48.field502 == class223.field2773) {
                class36.field369 = class626.field8849.method676(-5);
                class223.field2773 = null;
                class153.field1695 = class158.field1780;
                return true;
            } else if (class91.field911 == class223.field2773) {
                int var91 = class626.field8849.method650((byte) -78);
                String var92 = class626.field8849.method626(112);
                int var93 = class626.field8849.method619((byte) -99);
                if (class162.method879(var93, false)) {
                    class580.method3283(var91, var92, -106);
                }
                class223.field2773 = null;
                return true;
            } else if (class443.field6254 == class223.field2773) {
                boolean var94 = class626.field8849.method620((byte) -127) == 1;
                String var95 = class626.field8849.method626(101);
                String var96 = var95;
                if (var94) {
                    var96 = class626.field8849.method626(112);
                }
                long var97 = class626.field8849.method671(0);
                long var99 = (long) class626.field8849.method643((byte) -77);
                long var101 = (long) class626.field8849.method675(-125);
                int var103 = class626.field8849.method620((byte) 121);
                int var104 = class626.field8849.method643((byte) -77);
                long var105 = (var99 << 32) + var101;
                boolean var107 = false;
                int var108 = 0;
                while (true) {
                    if (var108 >= 100) {
                        if (~var103 >= -2 && class16.method67((byte) 113, var96)) {
                            var107 = true;
                        }
                        break;
                    }
                    if (class682.field9622[var108] == var105) {
                        var107 = true;
                        break;
                    }
                    ++var108;
                }
                if (!var107 && class260.field3265 == 0) {
                    class682.field9622[class510.field7325] = var105;
                    class510.field7325 = (class510.field7325 + 1) % 100;
                    String var109 = class83.field859.method2211(var104, -27582).method1692(-1, class626.field8849);
                    if (~var103 != -3) {
                        if (var103 != 1) {
                            class322.method1825(var95, var96, class105.method571(37, var97), var104, var95, 20, 0, var109, 123);
                        } else {
                            class322.method1825(var95, "<img=0>" + var96, class105.method571(37, var97), var104, "<img=0>" + var95, 20, 0, var109, 111);
                        }
                    } else {
                        class322.method1825(var95, "<img=1>" + var96, class105.method571(37, var97), var104, "<img=1>" + var95, 20, 0, var109, 125);
                    }
                }
                class223.field2773 = null;
                return true;
            } else if (class602.field8472 == class223.field2773) {
                int var110 = class626.field8849.method673((byte) 126);
                int var111 = class626.field8849.method643((byte) -77);
                if (var111 == 65535) {
                    var111 = -1;
                }
                int var112 = class626.field8849.method643((byte) -77);
                if (class162.method879(var112, false)) {
                    class87.method453(var111, -120, var110);
                }
                class223.field2773 = null;
                return true;
            } else if (class244.field3023 == class223.field2773) {
                class628.field8859.method1733(0);
                class424.field5981 += 32;
                class223.field2773 = null;
                return true;
            } else if (class223.field2773 == class123.field1380) {
                int var113 = class626.field8849.method650((byte) -24);
                int var114 = class626.field8849.method631(false);
                int var115 = class626.field8849.method643((byte) -77);
                int var116 = class626.field8849.method651((byte) -94);
                int var117 = class626.field8849.method650((byte) -56);
                boolean var118 = (128 & var116) != 0;
                if (~(var114 >> 30) == -1) {
                    if (~(var114 >> 29) == -1) {
                        if (~(var114 >> 28) != -1) {
                            int var119 = 65535 & var114;
                            class236 var120;
                            if (~class392.field5314 == ~var119) {
                                var120 = class362.field4859;
                            } else {
                                var120 = class139.field1540[var119];
                            }
                            if (var120 != null) {
                                if (~var115 == -65536) {
                                    var115 = -1;
                                }
                                boolean var121 = true;
                                int var122 = !var118 ? var120.field9504 : var120.field9447;
                                if (~var115 != 0 && var122 != -1) {
                                    if (var115 == var122) {
                                        class681 var123 = class63.field654.method2191(arg0, var115);
                                        if (var123.field9596 && ~var123.field9611 != 0) {
                                            class257 var124 = class265.field3301.method3043(var123.field9611, -8191);
                                            int var125 = var124.field3220;
                                            if (var125 != 0 && var125 != 2) {
                                                if (~var125 == -2) {
                                                    var121 = true;
                                                }
                                            } else {
                                                var121 = false;
                                            }
                                        }
                                    } else {
                                        class681 var126 = class63.field654.method2191(arg0, var115);
                                        class681 var127 = class63.field654.method2191(false, var122);
                                        if (~var126.field9611 != 0 && ~var127.field9611 != 0) {
                                            class257 var128 = class265.field3301.method3043(var126.field9611, -8191);
                                            class257 var129 = class265.field3301.method3043(var127.field9611, -8191);
                                            if (~var129.field3225 < ~var128.field3225) {
                                                var121 = false;
                                            }
                                        }
                                    }
                                }
                                if (var121) {
                                    if (var118) {
                                        var120.field9440 = 1;
                                        var120.field9447 = var115;
                                        var120.field9416 = 0;
                                        var120.field9429 = class678.field9539 - -var113;
                                        var120.field9498 = 0;
                                        var120.field9467 = var117;
                                        var120.field9428 = var116 & 7;
                                        if (~var120.field9429 < ~class678.field9539) {
                                            var120.field9416 = -1;
                                        }
                                        if (~var120.field9447 == -65536) {
                                            var120.field9447 = -1;
                                        }
                                        if (~var120.field9447 != 0 && class678.field9539 == var120.field9429) {
                                            int var130 = class63.field654.method2191(false, var120.field9447).field9611;
                                            if (~var130 != 0) {
                                                class257 var131 = class265.field3301.method3043(var130, -8191);
                                                if (var131 != null && var131.field3218 != null) {
                                                    class635.method3570((byte) -123, class362.field4859 == var120, var120.field5179, var131, var120.field5166, var120.field5176, 0);
                                                }
                                            }
                                        }
                                    } else {
                                        var120.field9490 = 7 & var116;
                                        var120.field9431 = 0;
                                        var120.field9504 = var115;
                                        var120.field9415 = var117;
                                        var120.field9501 = 0;
                                        var120.field9420 = class678.field9539 + var113;
                                        var120.field9468 = 1;
                                        if (class678.field9539 < var120.field9420) {
                                            var120.field9501 = -1;
                                        }
                                        if (~var120.field9504 == -65536) {
                                            var120.field9504 = -1;
                                        }
                                        if (~var120.field9504 != 0 && ~class678.field9539 == ~var120.field9420) {
                                            int var132 = class63.field654.method2191(false, var120.field9504).field9611;
                                            if (~var132 != 0) {
                                                class257 var133 = class265.field3301.method3043(var132, -8191);
                                                if (var133 != null && var133.field3218 != null) {
                                                    class635.method3570((byte) -79, class362.field4859 == var120, var120.field5179, var133, var120.field5166, var120.field5176, 0);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        int var134 = var114 & 65535;
                        class214 var135 = (class214) class274.field3433.method3669((long) var134, -1);
                        if (var135 != null) {
                            class600 var136 = var135.field2601;
                            if (~var115 == -65536) {
                                var115 = -1;
                            }
                            boolean var137 = true;
                            int var138 = !var118 ? var136.field9504 : var136.field9447;
                            if (var115 != -1 && var138 != -1) {
                                if (var115 == var138) {
                                    class681 var139 = class63.field654.method2191(false, var115);
                                    if (var139.field9596 && ~var139.field9611 != 0) {
                                        class257 var140 = class265.field3301.method3043(var139.field9611, -8191);
                                        int var141 = var140.field3220;
                                        if (var141 != 0 && var141 != 2) {
                                            if (~var141 == -2) {
                                                var137 = true;
                                            }
                                        } else {
                                            var137 = false;
                                        }
                                    }
                                } else {
                                    class681 var142 = class63.field654.method2191(false, var115);
                                    class681 var143 = class63.field654.method2191(false, var138);
                                    if (~var142.field9611 != 0 && var143.field9611 != -1) {
                                        class257 var144 = class265.field3301.method3043(var142.field9611, -8191);
                                        class257 var145 = class265.field3301.method3043(var143.field9611, -8191);
                                        if (~var144.field3225 > ~var145.field3225) {
                                            var137 = false;
                                        }
                                    }
                                }
                            }
                            if (var137) {
                                if (var118) {
                                    var136.field9416 = 0;
                                    var136.field9467 = var117;
                                    var136.field9428 = var116 & 7;
                                    var136.field9447 = var115;
                                    var136.field9440 = 1;
                                    var136.field9498 = 0;
                                    var136.field9429 = class678.field9539 + var113;
                                    if (class678.field9539 < var136.field9429) {
                                        var136.field9416 = -1;
                                    }
                                    if (~var136.field9447 != 0 && class678.field9539 == var136.field9429) {
                                        int var146 = class63.field654.method2191(false, var136.field9447).field9611;
                                        if (~var146 != 0) {
                                            class257 var147 = class265.field3301.method3043(var146, -8191);
                                            if (var147 != null && var147.field3218 != null) {
                                                class635.method3570((byte) -93, false, var136.field5179, var147, var136.field5166, var136.field5176, 0);
                                            }
                                        }
                                    }
                                } else {
                                    var136.field9501 = 0;
                                    var136.field9431 = 0;
                                    var136.field9504 = var115;
                                    var136.field9415 = var117;
                                    var136.field9490 = var116 & 7;
                                    var136.field9468 = 1;
                                    var136.field9420 = class678.field9539 + var113;
                                    if (var136.field9420 > class678.field9539) {
                                        var136.field9501 = -1;
                                    }
                                    if (~var136.field9504 != 0 && class678.field9539 == var136.field9420) {
                                        int var148 = class63.field654.method2191(arg0, var136.field9504).field9611;
                                        if (~var148 != 0) {
                                            class257 var149 = class265.field3301.method3043(var148, -8191);
                                            if (var149 != null && var149.field3218 != null) {
                                                class635.method3570((byte) -84, false, var136.field5179, var149, var136.field5166, var136.field5176, 0);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int var150 = var114 >> 28 & 3;
                    int var151 = ((268420194 & var114) >> 14) + -class26.field245;
                    int var152 = (var114 & 16383) + -class231.field2860;
                    if (var151 >= 0 && var152 >= 0 && ~class142.field1574 < ~var151 && ~var152 > ~class140.field1550) {
                        int var153 = var151 * 512 - -256;
                        int var154 = var152 * 512 + 256;
                        int var155 = var150;
                        if (var150 < 3 && class568.method3221(var152, var151, 0)) {
                            var155 = var150 + 1;
                        }
                        class34 var156 = new class34(var115, 0, class678.field9539, var150, var155, var153, -var117 + class593.method3335(var154, var150, 27648, var153), var154, var151, var151, var152, var152, var116 & 7);
                        class372.field5072.method3425(new class152(var156), false);
                    }
                }
                class223.field2773 = null;
                return true;
            } else if (class356.field4782 == class223.field2773) {
                int var157 = class626.field8849.method643((byte) -77);
                if (class162.method879(var157, false)) {
                    class269.method1585(false);
                }
                class223.field2773 = null;
                return true;
            } else if (class405.field5418 == class223.field2773) {
                class471.field6759 = 1;
                class245.field3028 = class158.field1780;
                class223.field2773 = null;
                return true;
            } else if (class477.field6871 == class223.field2773) {
                int var158 = class626.field8849.method643((byte) -77);
                int var159 = class626.field8849.method643((byte) -77);
                int var160 = class626.field8849.method643((byte) -77);
                int var161 = class626.field8849.method643((byte) -77);
                if (class162.method879(var158, false) && class102.field1106[var159] != null) {
                    for (int var162 = var160; ~var161 < ~var162; ++var162) {
                        int var163 = class626.field8849.method675(-126);
                        if (class102.field1106[var159].length > var162 && class102.field1106[var159][var162] != null) {
                            class102.field1106[var159][var162].field6450 = var163;
                        }
                    }
                }
                class223.field2773 = null;
                return true;
            } else if (class342.field4324 == class223.field2773) {
                String var164 = class626.field8849.method626(116);
                boolean var165 = ~class626.field8849.method620((byte) 2) == -2;
                String var166;
                if (var165) {
                    var166 = class626.field8849.method626(79);
                } else {
                    var166 = var164;
                }
                int var167 = class626.field8849.method643((byte) -77);
                byte var168 = class626.field8849.method657(false);
                boolean var169 = false;
                if (~var168 == 127) {
                    var169 = true;
                }
                if (var169) {
                    if (~class288.field3603 == -1) {
                        class223.field2773 = null;
                        return true;
                    }
                    boolean var170 = false;
                    int var171;
                    for (var171 = 0; ~class288.field3603 < ~var171 && (!class145.field1611[var171].field9239.equals(var166) || ~class145.field1611[var171].field9236 != ~var167); ++var171) {
                    }
                    if (var171 < class288.field3603) {
                        while (~(class288.field3603 + -1) < ~var171) {
                            class145.field1611[var171] = class145.field1611[var171 + 1];
                            ++var171;
                        }
                        --class288.field3603;
                        class145.field1611[class288.field3603] = null;
                    }
                } else {
                    String var172 = class626.field8849.method626(77);
                    class656 var173 = new class656();
                    var173.field9239 = var166;
                    var173.field9242 = var164;
                    var173.field9238 = class6.method44(var173.field9239, (byte) -83);
                    var173.field9236 = var167;
                    var173.field9234 = var172;
                    var173.field9240 = var168;
                    int var174;
                    for (var174 = class288.field3603 - 1; var174 >= 0; --var174) {
                        int var175 = class145.field1611[var174].field9238.compareTo(var173.field9238);
                        if (~var175 == -1) {
                            class145.field1611[var174].field9236 = var167;
                            class145.field1611[var174].field9240 = var168;
                            class145.field1611[var174].field9234 = var172;
                            if (var166.equals(class362.field4859.field2893)) {
                                class285.field3565 = var168;
                            }
                            class171.field1903 = class158.field1780;
                            class223.field2773 = null;
                            return true;
                        }
                        if (~var175 > -1) {
                            break;
                        }
                    }
                    if (class145.field1611.length <= class288.field3603) {
                        class223.field2773 = null;
                        return true;
                    }
                    for (int var176 = class288.field3603 + -1; ~var176 < ~var174; --var176) {
                        class145.field1611[var176 + 1] = class145.field1611[var176];
                    }
                    if (~class288.field3603 == -1) {
                        class145.field1611 = new class656[100];
                    }
                    class145.field1611[var174 - -1] = var173;
                    ++class288.field3603;
                    if (var166.equals(class362.field4859.field2893)) {
                        class285.field3565 = var168;
                    }
                }
                class223.field2773 = null;
                class171.field1903 = class158.field1780;
                return true;
            } else if (class373.field5086 == class223.field2773) {
                boolean var177 = ~class626.field8849.method620((byte) 117) == -2;
                String var178 = class626.field8849.method626(125);
                String var179 = var178;
                if (var177) {
                    var179 = class626.field8849.method626(81);
                }
                int var180 = class626.field8849.method620((byte) -127);
                boolean var181 = false;
                if (var180 <= 1) {
                    if ((!class443.field6260 || class329.field4036) && !class383.field5175) {
                        if (var180 <= 1 && class16.method67((byte) 126, var179)) {
                            var181 = true;
                        }
                    } else {
                        var181 = true;
                    }
                }
                if (!var181 && class260.field3265 == 0) {
                    String var182 = class531.method2982((byte) 113, class143.method788(!arg0, class626.field8849));
                    if (~var180 == -3) {
                        class322.method1825(var178, "<img=1>" + var179, (String) null, -1, "<img=1>" + var178, 24, 0, var182, 116);
                    } else if (~var180 == -2) {
                        class322.method1825(var178, "<img=0>" + var179, (String) null, -1, "<img=0>" + var178, 24, 0, var182, 115);
                    } else {
                        class322.method1825(var178, var179, (String) null, -1, var178, 24, 0, var182, 120);
                    }
                }
                class223.field2773 = null;
                return true;
            } else if (class376.field5114 == class223.field2773) {
                int var183 = class626.field8849.method631(arg0);
                int var184 = class626.field8849.method619((byte) -29);
                int var185 = class626.field8849.method619((byte) -37);
                if (class162.method879(var184, false)) {
                    class255.method1510((byte) 121, var183, var185);
                }
                class223.field2773 = null;
                return true;
            } else if (class223.field2773 == class206.field2447) {
                int var186 = class626.field8849.method620((byte) 79);
                int var187 = var186 >> 5;
                int var188 = var186 & 31;
                if (~var188 == -1) {
                    class497.field7195[var187] = null;
                    class223.field2773 = null;
                    return true;
                } else {
                    class99 var189 = new class99();
                    var189.field1066 = var188;
                    var189.field1059 = class626.field8849.method620((byte) -128);
                    if (var189.field1059 >= 0 && var189.field1059 < class678.field9535.length) {
                        if (~var189.field1066 != -2 && ~var189.field1066 != -11) {
                            if (var189.field1066 >= 2 && ~var189.field1066 >= -7) {
                                if (~var189.field1066 == -3) {
                                    var189.field1070 = 256;
                                    var189.field1063 = 256;
                                }
                                if (~var189.field1066 == -4) {
                                    var189.field1070 = 0;
                                    var189.field1063 = 256;
                                }
                                if (~var189.field1066 == -5) {
                                    var189.field1063 = 256;
                                    var189.field1070 = 512;
                                }
                                if (var189.field1066 == 5) {
                                    var189.field1070 = 256;
                                    var189.field1063 = 0;
                                }
                                if (var189.field1066 == 6) {
                                    var189.field1063 = 512;
                                    var189.field1070 = 256;
                                }
                                var189.field1066 = 2;
                                var189.field1065 = class626.field8849.method620((byte) 32);
                                var189.field1070 += class626.field8849.method643((byte) -77) - class26.field245 << 9;
                                var189.field1063 += class626.field8849.method643((byte) -77) + -class231.field2860 << 9;
                                var189.field1069 = class626.field8849.method620((byte) -126) << 2;
                                var189.field1062 = class626.field8849.method643((byte) -77);
                            }
                        } else {
                            var189.field1071 = class626.field8849.method643((byte) -77);
                            class626.field8849.field1218 += 6;
                        }
                        var189.field1067 = class626.field8849.method643((byte) -77);
                        if (var189.field1067 == 65535) {
                            var189.field1067 = -1;
                        }
                        class497.field7195[var187] = var189;
                    }
                    class223.field2773 = null;
                    return true;
                }
            } else if (class71.field701 == class223.field2773) {
                for (int var190 = 0; ~class139.field1540.length < ~var190; ++var190) {
                    if (class139.field1540[var190] != null) {
                        class139.field1540[var190].field9466 = null;
                        class139.field1540[var190].field9455 = -1;
                    }
                }
                for (int var191 = 0; var191 < class53.field533; ++var191) {
                    class653.field9160[var191].field2601.field9466 = null;
                    class653.field9160[var191].field2601.field9455 = -1;
                }
                class223.field2773 = null;
                return true;
            } else if (class223.field2773 == class101.field1094) {
                int var192 = class626.field8849.method673((byte) 125);
                int var193 = class626.field8849.method619((byte) -82);
                if (class162.method879(var193, false)) {
                    class265.method1565(var192, 3, -1, 4, -1);
                }
                class223.field2773 = null;
                return true;
            } else if (class680.field9588 == class223.field2773) {
                int var194 = class626.field8849.method643((byte) -77);
                int var195 = class626.field8849.method643((byte) -77);
                int var196 = class626.field8849.method650((byte) -69);
                int var197 = class626.field8849.method619((byte) -102);
                int var198 = class626.field8849.method673((byte) 127);
                if (class162.method879(var194, false)) {
                    class265.method1565(var198, 7, var196 | var195 << 16, 4, var197);
                }
                class223.field2773 = null;
                return true;
            } else if (class352.field4745 == class223.field2773) {
                class245.method1446(65535, class642.field9081);
                class223.field2773 = null;
                return true;
            } else if (class304.field3763 == class223.field2773) {
                String var199 = class626.field8849.method626(79);
                int var200 = class626.field8849.method643((byte) -77);
                String var201 = class83.field859.method2211(var200, -27582).method1692(-1, class626.field8849);
                class322.method1825(var199, var199, (String) null, var200, var199, 19, 0, var201, 110);
                class223.field2773 = null;
                return true;
            } else if (class336.field4222 == class223.field2773) {
                int var202 = class626.field8849.method643((byte) -77);
                int var203 = class626.field8849.method620((byte) -126);
                boolean var204 = (var203 & 1) == 1;
                class89.method456(var202, var204, -106);
                int var205 = class626.field8849.method643((byte) -77);
                for (int var206 = 0; ~var206 > ~var205; ++var206) {
                    int var207 = class626.field8849.method651((byte) -126);
                    if (~var207 == -256) {
                        var207 = class626.field8849.method673((byte) 124);
                    }
                    int var208 = class626.field8849.method650((byte) -80);
                    class603.method3375(var207, var204, var208 - 1, var206, var202, -124);
                }
                class119.field1324[class105.method572(class673.field9369++, 31)] = var202;
                class223.field2773 = null;
                return true;
            } else if (class223.field2773 == class210.field2529) {
                int var209 = class626.field8849.method631(false);
                int var210 = (1014479409 & var209) >> 28;
                int var211 = (var209 & 268435244) >> 14;
                int var212 = var209 & 16383;
                int var213 = class626.field8849.method623(-104);
                if (~var213 == -65536) {
                    var213 = -1;
                }
                int var214 = class626.field8849.method651((byte) -126);
                int var215 = var214 >> 2;
                int var216 = var214 & 3;
                int var217 = var212 - class231.field2860;
                int var218 = var211 - class26.field245;
                int var219 = class505.field7272[var215];
                class587.method3313((byte) 18, var215, var219, var216, var213, var217, var210, var218);
                class223.field2773 = null;
                return true;
            } else if (class434.field6124 == class223.field2773) {
                int var220 = class626.field8849.method650((byte) -52);
                int var221 = class626.field8849.method619((byte) -57);
                int var222 = class626.field8849.method623(-100);
                if (class162.method879(var220, false)) {
                    class700.method3847((byte) -109, var222, 0, var221);
                }
                class223.field2773 = null;
                return true;
            } else if (class313.field3890 == class223.field2773) {
                while (~class257.field3209 < ~class626.field8849.field1218) {
                    boolean var233 = class626.field8849.method620((byte) 94) == 1;
                    String var234 = class626.field8849.method626(118);
                    String var235 = class626.field8849.method626(93);
                    int var236 = class626.field8849.method643((byte) -77);
                    int var237 = class626.field8849.method620((byte) 15);
                    String var238 = "";
                    boolean var239 = false;
                    if (var236 > 0) {
                        var238 = class626.field8849.method626(77);
                        var239 = ~class626.field8849.method620((byte) 121) == -2;
                    }
                    for (int var240 = 0; ~class699.field9804 < ~var240; ++var240) {
                        if (!var233) {
                            if (var234.equals(class703.field9867[var240])) {
                                if (class380.field5151[var240] != var236) {
                                    boolean var241 = true;
                                    for (class596 var242 = (class596) class355.field4776.method1672((byte) 121); var242 != null; var242 = (class596) class355.field4776.method1669(-2747)) {
                                        if (var242.field8395.equals(var234)) {
                                            if (var236 != 0 && var242.field8391 == 0) {
                                                var242.method1821(68);
                                                var241 = false;
                                            } else if (~var236 == -1 && ~var242.field8391 != -1) {
                                                var241 = false;
                                                var242.method1821(91);
                                            }
                                        }
                                    }
                                    if (var241) {
                                        class355.field4776.method1670((byte) -82, new class596(var234, var236));
                                    }
                                    class380.field5151[var240] = var236;
                                }
                                class597.field8405[var240] = var235;
                                class164.field1823[var240] = var238;
                                class486.field7001[var240] = var237;
                                var234 = null;
                                class392.field5325[var240] = var239;
                                break;
                            }
                        } else if (var235.equals(class703.field9867[var240])) {
                            class703.field9867[var240] = var234;
                            var234 = null;
                            class597.field8405[var240] = var235;
                            break;
                        }
                    }
                    if (var234 != null && ~class699.field9804 > -201) {
                        class703.field9867[class699.field9804] = var234;
                        class597.field8405[class699.field9804] = var235;
                        class380.field5151[class699.field9804] = var236;
                        class164.field1823[class699.field9804] = var238;
                        class486.field7001[class699.field9804] = var237;
                        class392.field5325[class699.field9804] = var239;
                        ++class699.field9804;
                    }
                }
                class471.field6759 = 2;
                class245.field3028 = class158.field1780;
                boolean var223 = false;
                int var224 = class699.field9804;
                while (var224 > 0) {
                    --var224;
                    boolean var225 = true;
                    for (int var226 = 0; var226 < var224; ++var226) {
                        if (~class380.field5151[var226] != ~class117.field1294.field2001 && ~class380.field5151[var226 + 1] == ~class117.field1294.field2001 || ~class380.field5151[var226] == -1 && class380.field5151[var226 - -1] != 0) {
                            int var227 = class380.field5151[var226];
                            class380.field5151[var226] = class380.field5151[var226 + 1];
                            class380.field5151[var226 - -1] = var227;
                            String var228 = class164.field1823[var226];
                            class164.field1823[var226] = class164.field1823[var226 - -1];
                            class164.field1823[var226 + 1] = var228;
                            String var229 = class703.field9867[var226];
                            class703.field9867[var226] = class703.field9867[var226 - -1];
                            class703.field9867[var226 + 1] = var229;
                            String var230 = class597.field8405[var226];
                            class597.field8405[var226] = class597.field8405[var226 + 1];
                            class597.field8405[var226 + 1] = var230;
                            int var231 = class486.field7001[var226];
                            class486.field7001[var226] = class486.field7001[var226 + 1];
                            class486.field7001[var226 + 1] = var231;
                            boolean var232 = class392.field5325[var226];
                            class392.field5325[var226] = class392.field5325[var226 + 1];
                            class392.field5325[var226 + 1] = var232;
                            var225 = false;
                        }
                    }
                    if (var225) {
                        break;
                    }
                }
                class223.field2773 = null;
                return true;
            } else if (class670.field9328 == class223.field2773) {
                boolean var243 = ~class626.field8849.method620((byte) -31) == -2;
                byte[] var244 = new byte[class257.field3209 - 1];
                class626.field8849.method628(0, class257.field3209 - 1, var244, (byte) -105);
                class570.method3225(-41, var244, var243);
                class223.field2773 = null;
                return true;
            } else if (class223.field2773 == class11.field107) {
                int var245 = class626.field8849.method619((byte) -88);
                int var246 = class626.field8849.method623(113);
                int var247 = class626.field8849.method619((byte) -95);
                int var248 = class626.field8849.method674(-16777216);
                if (class162.method879(var247, false)) {
                    class254.method1499(110, var248, (var246 << 16) + var245);
                }
                class223.field2773 = null;
                return true;
            } else if (class472.field6805 == class223.field2773) {
                if (class209.field2466 != -1) {
                    class633.method3561(false, class209.field2466, 0);
                }
                class223.field2773 = null;
                return true;
            } else if (class442.field6243 == class223.field2773) {
                class245.method1446(65535, class273.field3415);
                class223.field2773 = null;
                return true;
            } else if (class578.field8183 == class223.field2773) {
                class171.field1903 = class158.field1780;
                if (class257.field3209 == 0) {
                    class288.field3603 = 0;
                    class563.field8045 = null;
                    class126.field1422 = null;
                    class223.field2773 = null;
                    class145.field1611 = null;
                    return true;
                } else {
                    class126.field1422 = class626.field8849.method626(107);
                    boolean var249 = ~class626.field8849.method620((byte) -128) == -2;
                    if (var249) {
                        class626.field8849.method626(99);
                    }
                    long var250 = class626.field8849.method671(0);
                    class563.field8045 = class645.method3614(124, var250);
                    class278.field3454 = class626.field8849.method657(false);
                    int var252 = class626.field8849.method620((byte) 87);
                    if (var252 == 255) {
                        class223.field2773 = null;
                        return true;
                    } else {
                        class288.field3603 = var252;
                        class656[] var253 = new class656[100];
                        for (int var254 = 0; ~var254 > ~class288.field3603; ++var254) {
                            var253[var254] = new class656();
                            var253[var254].field9242 = class626.field8849.method626(93);
                            boolean var260 = ~class626.field8849.method620((byte) 126) == -2;
                            if (!var260) {
                                var253[var254].field9239 = var253[var254].field9242;
                            } else {
                                var253[var254].field9239 = class626.field8849.method626(84);
                            }
                            var253[var254].field9238 = class6.method44(var253[var254].field9239, (byte) -83);
                            var253[var254].field9236 = class626.field8849.method643((byte) -77);
                            var253[var254].field9240 = class626.field8849.method657(false);
                            var253[var254].field9234 = class626.field8849.method626(79);
                            if (var253[var254].field9239.equals(class362.field4859.field2893)) {
                                class285.field3565 = var253[var254].field9240;
                            }
                        }
                        boolean var255 = false;
                        int var256 = class288.field3603;
                        while (~var256 < -1) {
                            boolean var257 = true;
                            --var256;
                            for (int var258 = 0; var256 > var258; ++var258) {
                                if (var253[var258].field9238.compareTo(var253[var258 + 1].field9238) > 0) {
                                    class656 var259 = var253[var258];
                                    var253[var258] = var253[var258 + 1];
                                    var257 = false;
                                    var253[var258 + 1] = var259;
                                }
                            }
                            if (var257) {
                                break;
                            }
                        }
                        class223.field2773 = null;
                        class145.field1611 = var253;
                        return true;
                    }
                }
            } else if (class266.field3322 == class223.field2773) {
                class223.field2773 = null;
                return false;
            } else if (class223.field2773 == class176.field1974) {
                int var261 = class626.field8849.method662(true);
                int var262 = class626.field8849.method631(false);
                int var263 = class626.field8849.method620((byte) -127);
                String var264 = "";
                String var265 = var264;
                if ((1 & var263) != 0) {
                    var264 = class626.field8849.method626(127);
                    if ((2 & var263) == 0) {
                        var265 = var264;
                    } else {
                        var265 = class626.field8849.method626(84);
                    }
                }
                String var266 = class626.field8849.method626(90);
                if (~var261 == -100) {
                    class415.method2335(var266, 11);
                } else {
                    if (!var265.equals("") && class16.method67((byte) 125, var265)) {
                        class223.field2773 = null;
                        return true;
                    }
                    class416.method2341(0, var266, var264, var265, var262, var261, var264);
                }
                class223.field2773 = null;
                return true;
            } else if (class309.field3827 == class223.field2773) {
                class245.method1446(65535, class595.field8390);
                class223.field2773 = null;
                return true;
            } else if (class487.field7091 == class223.field2773) {
                class245.method1446(65535, class247.field3051);
                class223.field2773 = null;
                return true;
            } else if (class299.field3728 == class223.field2773) {
                boolean var267 = ~class626.field8849.method620((byte) -128) == -2;
                String var268 = class626.field8849.method626(73);
                String var269 = var268;
                if (var267) {
                    var269 = class626.field8849.method626(124);
                }
                long var270 = (long) class626.field8849.method643((byte) -77);
                long var272 = (long) class626.field8849.method675(-127);
                int var274 = class626.field8849.method620((byte) 39);
                long var275 = (var270 << 32) + var272;
                boolean var277 = false;
                int var278 = 0;
                while (true) {
                    if (~var278 <= -101) {
                        if (~var274 >= -2) {
                            if ((!class443.field6260 || class329.field4036) && !class383.field5175) {
                                if (class16.method67((byte) 125, var269)) {
                                    var277 = true;
                                }
                            } else {
                                var277 = true;
                            }
                        }
                        break;
                    }
                    if (~class682.field9622[var278] == ~var275) {
                        var277 = true;
                        break;
                    }
                    ++var278;
                }
                if (!var277 && ~class260.field3265 == -1) {
                    class682.field9622[class510.field7325] = var275;
                    class510.field7325 = (class510.field7325 - -1) % 100;
                    String var279 = class531.method2982((byte) 113, class143.method788(true, class626.field8849));
                    if (var274 != 2) {
                        if (var274 == 1) {
                            class322.method1825(var268, "<img=0>" + var269, (String) null, -1, "<img=0>" + var268, 7, 0, var279, 109);
                        } else {
                            class322.method1825(var268, var269, (String) null, -1, var268, 3, 0, var279, 120);
                        }
                    } else {
                        class322.method1825(var268, "<img=1>" + var269, (String) null, -1, "<img=1>" + var268, 7, 0, var279, 127);
                    }
                }
                class223.field2773 = null;
                return true;
            } else if (class446.field6293 == class223.field2773) {
                class182.field2050 = class626.field8849.method649(255);
                class593.field8376 = class626.field8849.method630(30426);
                class223.field2773 = null;
                return true;
            } else if (class223.field2773 == class146.field1612) {
                int var280 = class626.field8849.method643((byte) -77);
                if (~var280 == -65536) {
                    var280 = -1;
                }
                int var281 = class626.field8849.method673((byte) 123);
                int var282 = class626.field8849.method619((byte) -122);
                if (class162.method879(var282, false)) {
                    class265.method1565(var281, 1, var280, 4, -1);
                }
                class223.field2773 = null;
                return true;
            } else if (class234.field2870 == class223.field2773) {
                int var283 = class626.field8849.method643((byte) -77);
                int var284 = class626.field8849.method650((byte) -22);
                byte var285 = class626.field8849.method657(false);
                if (class162.method879(var283, false)) {
                    class255.method1510((byte) 121, var285, var284);
                }
                class223.field2773 = null;
                return true;
            } else if (class223.field2773 == class156.field1728) {
                int var286 = class626.field8849.method631(false);
                class100.field1077 = class353.field4757.method2680(3, var286);
                class223.field2773 = null;
                return true;
            } else if (class530.field7456 == class223.field2773) {
                class245.method1446(65535, class364.field4889);
                class223.field2773 = null;
                return true;
            } else if (class581.field8230 == class223.field2773) {
                int var287 = class626.field8849.method619((byte) -124);
                int var288 = class626.field8849.method673((byte) 124);
                int var289 = class626.field8849.method650((byte) -108);
                if (class162.method879(var289, false)) {
                    class31.method164(var288, (byte) 110, var287);
                }
                class223.field2773 = null;
                return true;
            } else if (class684.field9638 == class223.field2773) {
                class169.method921(-22833);
                class223.field2773 = null;
                return true;
            } else if (class444.field6266 == class223.field2773) {
                int var290 = class626.field8849.method619((byte) -112);
                if (~var290 == -65536) {
                    var290 = -1;
                }
                int var291 = class626.field8849.method664(-11604);
                int var292 = class626.field8849.method623(17);
                if (~var292 == -65536) {
                    var292 = -1;
                }
                int var293 = class626.field8849.method623(60);
                int var294 = class626.field8849.method619((byte) -100);
                if (class162.method879(var294, arg0)) {
                    for (int var295 = var292; ~var295 >= ~var290; ++var295) {
                        long var296 = ((long) var291 << 32) - -((long) var295);
                        class314 var298 = (class314) class595.field8386.method3669(var296, -1);
                        class314 var299;
                        if (var298 != null) {
                            var299 = new class314(var298.field3898, var293);
                            var298.method1922(101);
                        } else if (var295 == -1) {
                            var299 = new class314(class92.method464(var291, -167823504).field6409.field3898, var293);
                        } else {
                            var299 = new class314(0, var293);
                        }
                        class595.field8386.method3671(false, var299, var296);
                    }
                }
                class223.field2773 = null;
                return true;
            } else if (class487.field7020 == class223.field2773) {
                class46.field482 = class626.field8849.method620((byte) -127);
                for (int var300 = 0; class46.field482 > var300; ++var300) {
                    class319.field3937[var300] = class626.field8849.method626(71);
                    class80.field832[var300] = class626.field8849.method626(89);
                    if (class80.field832[var300].equals("")) {
                        class80.field832[var300] = class319.field3937[var300];
                    }
                    class551.field7876[var300] = class626.field8849.method626(87);
                    class157.field1756[var300] = class626.field8849.method626(114);
                    if (class157.field1756[var300].equals("")) {
                        class157.field1756[var300] = class551.field7876[var300];
                    }
                    class692.field9720[var300] = false;
                }
                class245.field3028 = class158.field1780;
                class223.field2773 = null;
                return true;
            } else if (class378.field5125 == class223.field2773) {
                class245.method1446(65535, class572.field8122);
                class223.field2773 = null;
                return true;
            } else if (class486.field6992 == class223.field2773) {
                int var301 = class626.field8849.method649(255);
                int var302 = class626.field8849.method623(85);
                if (class162.method879(var302, false)) {
                    class705.field9904 = var301;
                }
                class223.field2773 = null;
                return true;
            } else if (class51.field510 == class223.field2773) {
                int var303 = class626.field8849.method619((byte) -91);
                int var304 = class626.field8849.method619((byte) -122);
                int var305 = class626.field8849.method673((byte) 127);
                if (class162.method879(var303, false)) {
                    class168.method919(var304, (byte) 12, var305);
                }
                class223.field2773 = null;
                return true;
            } else if (class29.field289 == class223.field2773) {
                String var306 = class626.field8849.method626(111);
                int var307 = class626.field8849.method619((byte) -32);
                int var308 = class626.field8849.method664(-11604);
                if (class162.method879(var307, false)) {
                    class32.method168((byte) 81, var306, var308);
                }
                class223.field2773 = null;
                return true;
            } else if (class223.field2773 == class102.field1105) {
                class245.method1446(65535, class474.field6828);
                class223.field2773 = null;
                return true;
            } else if (class9.field95 == class223.field2773) {
                boolean var309 = class626.field8849.method620((byte) -128) == 1;
                String var310 = class626.field8849.method626(109);
                String var311 = var310;
                if (var309) {
                    var311 = class626.field8849.method626(82);
                }
                long var312 = (long) class626.field8849.method643((byte) -77);
                long var314 = (long) class626.field8849.method675(-128);
                int var316 = class626.field8849.method620((byte) -127);
                int var317 = class626.field8849.method643((byte) -77);
                long var318 = (var312 << 32) + var314;
                boolean var320 = false;
                int var321 = 0;
                while (true) {
                    if (~var321 <= -101) {
                        if (~var316 >= -2 && class16.method67((byte) 122, var311)) {
                            var320 = true;
                        }
                        break;
                    }
                    if (~class682.field9622[var321] == ~var318) {
                        var320 = true;
                        break;
                    }
                    ++var321;
                }
                if (!var320 && class260.field3265 == 0) {
                    class682.field9622[class510.field7325] = var318;
                    class510.field7325 = (class510.field7325 + 1) % 100;
                    String var322 = class83.field859.method2211(var317, -27582).method1692(-1, class626.field8849);
                    if (~var316 == -3) {
                        class322.method1825(var310, "<img=1>" + var311, (String) null, var317, "<img=1>" + var310, 18, 0, var322, 122);
                    } else if (var316 != 1) {
                        class322.method1825(var310, var311, (String) null, var317, var310, 18, 0, var322, 116);
                    } else {
                        class322.method1825(var310, "<img=0>" + var311, (String) null, var317, "<img=0>" + var310, 18, 0, var322, 105);
                    }
                }
                class223.field2773 = null;
                return true;
            } else if (class63.field650 == class223.field2773) {
                int var323 = class626.field8849.method620((byte) 71);
                int var324 = class626.field8849.method651((byte) -112);
                if (var323 == 255) {
                    var324 = -1;
                    var323 = -1;
                }
                class304.method1757(var323, var324, (byte) 44);
                class223.field2773 = null;
                return true;
            } else if (class290.field3628 == class223.field2773) {
                int var325 = class626.field8849.method674(-16777216);
                int var326 = class626.field8849.method643((byte) -77);
                class628.field8859.method1737(var326, -101, var325);
                class223.field2773 = null;
                return true;
            } else if (class223.field2773 == class188.field2147) {
                int var327 = class626.field8849.method643((byte) -77);
                if (class162.method879(var327, false)) {
                    class573.method3235(-85);
                }
                class223.field2773 = null;
                return true;
            } else if (class536.field7500 == class223.field2773) {
                int var328 = class626.field8849.method649(255);
                int var329 = class626.field8849.method651((byte) -113);
                int var330 = class626.field8849.method673((byte) 125);
                class203.field2403[var328] = var330;
                class368.field5034[var328] = var329;
                class217.field2616[var328] = 1;
                int var331 = class306.field3787[var328] - 1;
                for (int var332 = 0; ~var332 > ~var331; ++var332) {
                    if (~class531.field7479[var332] >= ~var330) {
                        class217.field2616[var328] = var332 - -2;
                    }
                }
                class182.field2049[class105.method572(class313.field3892++, 31)] = var328;
                class223.field2773 = null;
                return true;
            } else if (class494.field7164 == class223.field2773) {
                int var333 = class626.field8849.method673((byte) 123);
                int var334 = class626.field8849.method643((byte) -77);
                if (class162.method879(var334, arg0)) {
                    class265.method1565(var333, 5, class392.field5314, 4, 0);
                }
                class223.field2773 = null;
                return true;
            } else if (class341.field4304 == class223.field2773) {
                String var335 = class626.field8849.method626(121);
                String var336 = class531.method2982((byte) 113, class143.method788(true, class626.field8849));
                class416.method2341(0, var336, var335, var335, 0, 6, var335);
                class223.field2773 = null;
                return true;
            } else if (class223.field2773 == class147.field1626) {
                int var337 = class626.field8849.method620((byte) -15);
                int var338 = class626.field8849.method650((byte) -102);
                int var339 = class626.field8849.method674(-16777216);
                int var340 = class626.field8849.method650((byte) -124);
                if (class162.method879(var338, arg0)) {
                    class633 var341 = (class633) class14.field117.method3669((long) var339, -1);
                    if (var341 != null) {
                        class604.method3377((byte) 124, var341, false, var341.field8920 != var340);
                    }
                    class453.method2613(1, var340, false, var337, var339);
                }
                class223.field2773 = null;
                return true;
            } else if (class510.field7316 == class223.field2773) {
                int var342 = class626.field8849.method643((byte) -77);
                int var343 = class626.field8849.method620((byte) 42);
                boolean var344 = (var343 & 1) == 1;
                while (~class257.field3209 < ~class626.field8849.field1218) {
                    int var345 = class626.field8849.method662(!arg0);
                    int var346 = class626.field8849.method643((byte) -77);
                    int var347 = 0;
                    if (~var346 != -1) {
                        var347 = class626.field8849.method620((byte) -127);
                        if (~var347 == -256) {
                            var347 = class626.field8849.method631(false);
                        }
                    }
                    class603.method3375(var347, var344, var346 - 1, var345, var342, -121);
                }
                class119.field1324[class105.method572(31, class673.field9369++)] = var342;
                class223.field2773 = null;
                return true;
            } else if (class700.field9810 == class223.field2773) {
                int var348 = class626.field8849.method623(80);
                byte var349 = class626.field8849.method618(67);
                class628.field8859.method1737(var348, -38, var349);
                class223.field2773 = null;
                return true;
            } else if (class223.field2773 == class138.field1518) {
                int var350 = class626.field8849.method619((byte) -120);
                int var351 = class626.field8849.method619((byte) -28);
                int var352 = class626.field8849.method664(-11604);
                int var353 = class626.field8849.method650((byte) -102);
                int var354 = class626.field8849.method650((byte) -128);
                if (class162.method879(var353, arg0)) {
                    class646.method3620(var350, var352, -1, var354, var351);
                }
                class223.field2773 = null;
                return true;
            } else if (class81.field836 == class223.field2773) {
                int var355 = class626.field8849.method651((byte) -95);
                int var356 = class626.field8849.method643((byte) -77);
                if (var356 == 65535) {
                    var356 = -1;
                }
                int var357 = class626.field8849.method649(255);
                class693.method3816(-119, var357, var355, var356);
                class223.field2773 = null;
                return true;
            } else if (class365.field4893 == class223.field2773) {
                int var358 = class626.field8849.method619((byte) -117);
                if (var358 == 65535) {
                    var358 = -1;
                }
                int var359 = class626.field8849.method640(false);
                int var360 = class626.field8849.method651((byte) -104);
                class59.method319(true, var359, var358, var360);
                class223.field2773 = null;
                return true;
            } else if (class537.field7547 == class223.field2773) {
                int var361 = class626.field8849.method649(255);
                int var362 = class626.field8849.method650((byte) -14);
                class628.field8859.method1726(-88, var362, var361);
                class223.field2773 = null;
                return true;
            } else if (class240.field2971 == class223.field2773) {
                class245.method1446(65535, class35.field352);
                class223.field2773 = null;
                return true;
            } else if (class236.field2912 == class223.field2773) {
                int var363 = class626.field8849.method673((byte) 127);
                int var364 = class626.field8849.method619((byte) -72);
                if (class162.method879(var364, arg0)) {
                    if (~var363 != 0) {
                        int var365 = (268421824 & var363) >> 14;
                        int var366 = 16383 & var363;
                        int var367 = var365 - class26.field245;
                        int var368 = var366 - class231.field2860;
                        if (var367 < 0) {
                            var367 = 0;
                        } else if (~var367 <= ~class142.field1574) {
                            var367 = class142.field1574;
                        }
                        class307.field3791 = (var367 << 9) + 256;
                        if (var368 >= 0) {
                            if (var368 >= class140.field1550) {
                                var368 = class140.field1550;
                            }
                        } else {
                            var368 = 0;
                        }
                        class510.field7319 = (var368 << 9) + 256;
                    } else {
                        class307.field3791 = -1;
                        class510.field7319 = -1;
                    }
                }
                class223.field2773 = null;
                return true;
            } else if (class413.field5537 == class223.field2773) {
                int var369 = class626.field8849.method650((byte) -99);
                int var370 = class626.field8849.method620((byte) 79);
                int var371 = class626.field8849.method650((byte) -20);
                if (class162.method879(var371, arg0)) {
                    if (var370 == 2) {
                        class352.method2086((byte) 90);
                    }
                    class209.field2466 = var369;
                    class346.method2063(24329, var369);
                    class175.method1067(false, 2620);
                    class281.method1637(class209.field2466);
                    for (int var372 = 0; var372 < 100; ++var372) {
                        class313.field3894[var372] = true;
                    }
                }
                class223.field2773 = null;
                return true;
            } else if (class73.field769 == class223.field2773) {
                class8.field87 = class626.field8849.method620((byte) -126);
                class153.field1695 = class158.field1780;
                class223.field2773 = null;
                return true;
            } else if (class674.field9381 == class223.field2773) {
                class571.field8109 = class415.method2337(10, class626.field8849.method620((byte) -127));
                class223.field2773 = null;
                return true;
            } else if (class655.field9232 == class223.field2773) {
                int var373 = class626.field8849.method643((byte) -77);
                if (~var373 == -65536) {
                    var373 = -1;
                }
                int var374 = class626.field8849.method620((byte) -126);
                int var375 = class626.field8849.method643((byte) -77);
                int var376 = class626.field8849.method620((byte) -127);
                class247.method1454(var376, var375, var373, var374, -23, true);
                class223.field2773 = null;
                return true;
            } else if (class411.field5522 == class223.field2773) {
                class245.method1446(65535, class678.field9534);
                class223.field2773 = null;
                return true;
            } else if (class223.field2773 == class180.field2019) {
                class180.method1095((byte) 94);
                class223.field2773 = null;
                return false;
            } else if (class223.field2773 == class19.field149) {
                boolean var377 = ~class626.field8849.method620((byte) 68) == -2;
                String var378 = class626.field8849.method626(113);
                String var379 = var378;
                if (var377) {
                    var379 = class626.field8849.method626(76);
                }
                long var380 = class626.field8849.method671(0);
                long var382 = (long) class626.field8849.method643((byte) -77);
                long var384 = (long) class626.field8849.method675(-126);
                int var386 = class626.field8849.method620((byte) 81);
                long var387 = (var382 << 32) + var384;
                boolean var389 = false;
                int var390 = 0;
                while (true) {
                    if (var390 >= 100) {
                        if (~var386 >= -2) {
                            if ((!class443.field6260 || class329.field4036) && !class383.field5175) {
                                if (class16.method67((byte) 110, var379)) {
                                    var389 = true;
                                }
                            } else {
                                var389 = true;
                            }
                        }
                        break;
                    }
                    if (~class682.field9622[var390] == ~var387) {
                        var389 = true;
                        break;
                    }
                    ++var390;
                }
                if (!var389 && ~class260.field3265 == -1) {
                    class682.field9622[class510.field7325] = var387;
                    class510.field7325 = (class510.field7325 + 1) % 100;
                    String var391 = class531.method2982((byte) 113, class143.method788(true, class626.field8849));
                    if (var386 != 2 && ~var386 != -4) {
                        if (var386 != 1) {
                            class322.method1825(var378, var379, class105.method571(37, var380), -1, var378, 9, 0, var391, 108);
                        } else {
                            class322.method1825(var378, "<img=0>" + var379, class105.method571(37, var380), -1, "<img=0>" + var378, 9, 0, var391, 109);
                        }
                    } else {
                        class322.method1825(var378, "<img=1>" + var379, class105.method571(37, var380), -1, "<img=1>" + var378, 9, 0, var391, 126);
                    }
                }
                class223.field2773 = null;
                return true;
            } else if (class669.field9323 == class223.field2773) {
                if (class619.field8759 != null) {
                    class103.method561(false, (byte) 15, -1, -1, class639.field9075.field6791);
                }
                byte[] var392 = new byte[class257.field3209];
                class626.field8849.method2577(var392, 0, 0, class257.field3209);
                String var393 = class204.method1224(94, 0, class257.field3209, var392);
                class94.method482(true, (byte) -75, class353.field4757, var393, class430.field6109 == 1);
                class223.field2773 = null;
                return true;
            } else if (class223.field2773 == class125.field1408) {
                class73.method394(0, class637.field8960);
                class223.field2773 = null;
                return false;
            } else if (class672.field9352 == class223.field2773) {
                int var394 = class626.field8849.method643((byte) -77);
                int var395 = class626.field8849.method631(false);
                if (class162.method879(var394, false)) {
                    class633 var396 = (class633) class14.field117.method3669((long) var395, -1);
                    if (var396 != null) {
                        class604.method3377((byte) 125, var396, false, true);
                    }
                    if (class250.field3132 != null) {
                        class130.method741(class250.field3132, 26034);
                        class250.field3132 = null;
                    }
                }
                class223.field2773 = null;
                return true;
            } else if (class223.field2773 == class168.field1883) {
                int var397 = class626.field8849.method627(86);
                int var398 = class626.field8849.method665((byte) -119);
                int var399 = class626.field8849.method673((byte) 125);
                int var400 = class626.field8849.method643((byte) -77);
                if (class162.method879(var400, arg0)) {
                    class616.method3433(var399, var397, var398, 112);
                }
                class223.field2773 = null;
                return true;
            } else if (class223.field2773 == class142.field1567) {
                int var401 = class626.field8849.method619((byte) -108);
                int var402 = class626.field8849.method630(30426);
                boolean var403 = ~(var402 & 1) == -2;
                class626.method3521(var403, -35, var401);
                class119.field1324[class105.method572(31, class673.field9369++)] = var401;
                class223.field2773 = null;
                return true;
            } else if (class248.field3075 == class223.field2773) {
                int var404 = class626.field8849.method627(108);
                int var405 = class626.field8849.method643((byte) -77);
                int var406 = class626.field8849.method631(false);
                if (class162.method879(var405, arg0)) {
                    class208.method1238(var406, !arg0, var404);
                }
                class223.field2773 = null;
                return true;
            } else if (class352.field4749 == class223.field2773) {
                class16.field130 = class626.field8849.method620((byte) -127);
                class223.field2773 = null;
                return true;
            } else if (class223.field2773 == class123.field1378) {
                int var407 = class626.field8849.method673((byte) 123);
                int var408 = class626.field8849.method643((byte) -77);
                if (var408 == 65535) {
                    var408 = -1;
                }
                int var409 = class626.field8849.method673((byte) 123);
                int var410 = class626.field8849.method623(-96);
                if (~var410 == -65536) {
                    var410 = -1;
                }
                int var411 = class626.field8849.method623(-111);
                if (class162.method879(var411, false)) {
                    for (int var412 = var408; ~var412 >= ~var410; ++var412) {
                        long var413 = ((long) var409 << 32) - -((long) var412);
                        class314 var415 = (class314) class595.field8386.method3669(var413, -1);
                        class314 var416;
                        if (var415 == null) {
                            if (~var412 == 0) {
                                var416 = new class314(var407, class92.method464(var409, -167823504).field6409.field3897);
                            } else {
                                var416 = new class314(var407, -1);
                            }
                        } else {
                            var416 = new class314(var407, var415.field3897);
                            var415.method1922(81);
                        }
                        class595.field8386.method3671(false, var416, var413);
                    }
                }
                class223.field2773 = null;
                return true;
            } else if (class223.field2773 == class138.field1519) {
                int var417 = class626.field8849.method643((byte) -77);
                String var418 = class626.field8849.method626(82);
                Object[] var419 = new Object[1 + var418.length()];
                for (int var420 = var418.length() - 1; var420 >= 0; --var420) {
                    if (~var418.charAt(var420) != -116) {
                        var419[var420 + 1] = new Integer(class626.field8849.method631(false));
                    } else {
                        var419[var420 + 1] = class626.field8849.method626(108);
                    }
                }
                var419[0] = new Integer(class626.field8849.method631(false));
                if (class162.method879(var417, false)) {
                    class213 var421 = new class213();
                    var421.field2587 = var419;
                    class281.method1642(var421);
                }
                class223.field2773 = null;
                return true;
            } else if (class275.field3436 == class223.field2773) {
                class277.method1621(0);
                class223.field2773 = null;
                return true;
            } else if (class620.field8761 == class223.field2773) {
                int var422 = class626.field8849.method643((byte) -77);
                class236 var423;
                if (class392.field5314 == var422) {
                    var423 = class362.field4859;
                } else {
                    var423 = class139.field1540[var422];
                }
                if (var423 == null) {
                    class223.field2773 = null;
                    return true;
                } else {
                    int var424 = class626.field8849.method643((byte) -77);
                    int var425 = class626.field8849.method620((byte) 86);
                    boolean var426 = (var424 & 32768) != 0;
                    if (var423.field2893 != null && var423.field2897 != null) {
                        boolean var427 = false;
                        if (~var425 >= -2) {
                            if (!var426 && (class443.field6260 && !class329.field4036 || class383.field5175)) {
                                var427 = true;
                            } else if (class16.method67((byte) 116, var423.field2893)) {
                                var427 = true;
                            }
                        }
                        if (!var427 && class260.field3265 == 0) {
                            int var428 = -1;
                            String var430;
                            if (var426) {
                                var424 &= 32767;
                                class403 var429 = class625.method3516(-125, class626.field8849);
                                var428 = var429.field5400;
                                var430 = var429.field5396.method1692(-1, class626.field8849);
                            } else {
                                var430 = class531.method2982((byte) 113, class143.method788(true, class626.field8849));
                            }
                            var423.field9454 = var430.trim();
                            var423.field9462 = var424 >> 8;
                            var423.field9437 = 255 & var424;
                            var423.field9461 = 150;
                            int var431;
                            if (var425 != 1 && var425 != 2) {
                                var431 = var426 ? 17 : 2;
                            } else {
                                var431 = var426 ? 17 : 1;
                            }
                            if (~var425 == -3) {
                                class322.method1825(var423.field2927, "<img=1>" + var423.method1412(false, 131072), (String) null, var428, "<img=1>" + var423.method1418(-26900, true), var431, 0, var430, 116);
                            } else if (var425 == 1) {
                                class322.method1825(var423.field2927, "<img=0>" + var423.method1412(false, 131072), (String) null, var428, "<img=0>" + var423.method1418(-26900, true), var431, 0, var430, 124);
                            } else {
                                class322.method1825(var423.field2927, var423.method1412(false, 131072), (String) null, var428, var423.method1418(-26900, true), var431, 0, var430, 106);
                            }
                        }
                    }
                    class223.field2773 = null;
                    return true;
                }
            } else {
                class333.method1923((Throwable) null, true, "T1 - " + (class223.field2773 == null ? -1 : class223.field2773.method593((byte) 89)) + "," + (class152.field1677 == null ? -1 : class152.field1677.method593((byte) 89)) + "," + (class336.field4227 == null ? -1 : class336.field4227.method593((byte) 89)) + " - " + class257.field3209);
                class73.method394(0, arg0);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V", line = 3362)
    public final void method459(int arg0) {
        if (arg0 != Integer.MIN_VALUE) {
            field910 = true;
        }
        OpenGL.glFramebufferTexture3DEXT(this.field908, this.field904, super.field3988, 0, 0, 0);
        ++field902;
        this.field908 = -1;
        this.field904 = -1;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIIII)V", line = 3387)
    public final void method460(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field906;
        super.field3991.method2396((byte) 36, this);
        OpenGL.glCopyTexSubImage3D(super.field3988, arg7, arg2, arg4, arg3, arg5, arg0, arg1, arg6);
        OpenGL.glFlush();
    }
}
