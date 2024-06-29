import jagex3.jagmisc.jagmisc;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public class class197 {

    @OriginalMember(owner = "client!uw", name = "d", descriptor = "[Lqf;")
    private static class194[] field2475 = new class194[50];

    @OriginalMember(owner = "client!uw", name = "j", descriptor = "I")
    private static int field2481 = 0;

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "I")
    private static int field2473 = 0;

    @OriginalMember(owner = "client!uw", name = "q", descriptor = "[Ljava/lang/String;")
    private static String[] field2488 = new String[1000];

    @OriginalMember(owner = "client!uw", name = "e", descriptor = "[[I")
    private static int[][] field2476 = new int[5][5000];

    @OriginalMember(owner = "client!uw", name = "m", descriptor = "[I")
    private static int[] field2484 = new int[5];

    @OriginalMember(owner = "client!uw", name = "h", descriptor = "I")
    private static int field2479 = 0;

    @OriginalMember(owner = "client!uw", name = "w", descriptor = "[I")
    private static int[] field2494 = new int[1000];

    @OriginalMember(owner = "client!uw", name = "p", descriptor = "Ljava/util/Calendar;")
    private static Calendar field2487 = Calendar.getInstance();

    @OriginalMember(owner = "client!uw", name = "B", descriptor = "[Ljava/lang/String;")
    private static String[] field2499 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!uw", name = "A", descriptor = "[I")
    private static int[] field2498 = new int[3];

    @OriginalMember(owner = "client!uw", name = "z", descriptor = "Ltb;")
    public static class450 field2497 = new class450(4);

    @OriginalMember(owner = "client!uw", name = "C", descriptor = "I")
    private static int field2500 = 0;

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "I")
    public static int field2472;

    @OriginalMember(owner = "client!uw", name = "c", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!uw", name = "f", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!uw", name = "g", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!uw", name = "i", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!uw", name = "k", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!uw", name = "l", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!uw", name = "o", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!uw", name = "s", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!uw", name = "u", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!uw", name = "y", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!uw", name = "t", descriptor = "Loe;")
    private static class127 field2491;

    @OriginalMember(owner = "client!uw", name = "n", descriptor = "Lkp;")
    private static class507 field2485;

    @OriginalMember(owner = "client!uw", name = "x", descriptor = "Lkp;")
    private static class507 field2495;

    @OriginalMember(owner = "client!uw", name = "r", descriptor = "[I")
    private static int[] field2489;

    @OriginalMember(owner = "client!uw", name = "v", descriptor = "[Ljava/lang/String;")
    private static String[] field2493;

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 3)
    private static final void method1188(String arg0, int arg1) {
        if (class199.field2531 == 0 && !(!class242.field3012 || class450.field5747) || class553.field7703) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class83.field1155.method476((byte) 117, 0))) {
            var3 = 0;
            arg0 = arg0.substring(class83.field1155.method476((byte) 117, 0).length());
        } else if (var2.startsWith(class83.field1156.method476((byte) -42, 0))) {
            var3 = 1;
            arg0 = arg0.substring(class83.field1156.method476((byte) -32, 0).length());
        } else if (var2.startsWith(class83.field1157.method476((byte) -42, 0))) {
            var3 = 2;
            arg0 = arg0.substring(class83.field1157.method476((byte) -57, 0).length());
        } else if (var2.startsWith(class83.field1158.method476((byte) -64, 0))) {
            var3 = 3;
            arg0 = arg0.substring(class83.field1158.method476((byte) 105, 0).length());
        } else if (var2.startsWith(class83.field1159.method476((byte) -70, 0))) {
            var3 = 4;
            arg0 = arg0.substring(class83.field1159.method476((byte) 103, 0).length());
        } else if (var2.startsWith(class83.field1160.method476((byte) -95, 0))) {
            var3 = 5;
            arg0 = arg0.substring(class83.field1160.method476((byte) -94, 0).length());
        } else if (var2.startsWith(class83.field1161.method476((byte) -57, 0))) {
            var3 = 6;
            arg0 = arg0.substring(class83.field1161.method476((byte) -75, 0).length());
        } else if (var2.startsWith(class83.field1162.method476((byte) -118, 0))) {
            var3 = 7;
            arg0 = arg0.substring(class83.field1162.method476((byte) 125, 0).length());
        } else if (var2.startsWith(class83.field1163.method476((byte) 112, 0))) {
            var3 = 8;
            arg0 = arg0.substring(class83.field1163.method476((byte) -63, 0).length());
        } else if (var2.startsWith(class83.field1164.method476((byte) 75, 0))) {
            var3 = 9;
            arg0 = arg0.substring(class83.field1164.method476((byte) -118, 0).length());
        } else if (var2.startsWith(class83.field1165.method476((byte) 97, 0))) {
            var3 = 10;
            arg0 = arg0.substring(class83.field1165.method476((byte) -35, 0).length());
        } else if (var2.startsWith(class83.field1166.method476((byte) -33, 0))) {
            var3 = 11;
            arg0 = arg0.substring(class83.field1166.method476((byte) -47, 0).length());
        } else if (class250.field3068 != 0) {
            if (var2.startsWith(class83.field1155.method476((byte) 80, class250.field3068))) {
                var3 = 0;
                arg0 = arg0.substring(class83.field1155.method476((byte) 105, class250.field3068).length());
            } else if (var2.startsWith(class83.field1156.method476((byte) 79, class250.field3068))) {
                var3 = 1;
                arg0 = arg0.substring(class83.field1156.method476((byte) -34, class250.field3068).length());
            } else if (var2.startsWith(class83.field1157.method476((byte) 100, class250.field3068))) {
                var3 = 2;
                arg0 = arg0.substring(class83.field1157.method476((byte) -126, class250.field3068).length());
            } else if (var2.startsWith(class83.field1158.method476((byte) -22, class250.field3068))) {
                var3 = 3;
                arg0 = arg0.substring(class83.field1158.method476((byte) -110, class250.field3068).length());
            } else if (var2.startsWith(class83.field1159.method476((byte) 72, class250.field3068))) {
                var3 = 4;
                arg0 = arg0.substring(class83.field1159.method476((byte) 82, class250.field3068).length());
            } else if (var2.startsWith(class83.field1160.method476((byte) 70, class250.field3068))) {
                var3 = 5;
                arg0 = arg0.substring(class83.field1160.method476((byte) 124, class250.field3068).length());
            } else if (var2.startsWith(class83.field1161.method476((byte) 114, class250.field3068))) {
                var3 = 6;
                arg0 = arg0.substring(class83.field1161.method476((byte) -62, class250.field3068).length());
            } else if (var2.startsWith(class83.field1162.method476((byte) -77, class250.field3068))) {
                var3 = 7;
                arg0 = arg0.substring(class83.field1162.method476((byte) -121, class250.field3068).length());
            } else if (var2.startsWith(class83.field1163.method476((byte) 90, class250.field3068))) {
                var3 = 8;
                arg0 = arg0.substring(class83.field1163.method476((byte) 77, class250.field3068).length());
            } else if (var2.startsWith(class83.field1164.method476((byte) -102, class250.field3068))) {
                var3 = 9;
                arg0 = arg0.substring(class83.field1164.method476((byte) 125, class250.field3068).length());
            } else if (var2.startsWith(class83.field1165.method476((byte) 80, class250.field3068))) {
                var3 = 10;
                arg0 = arg0.substring(class83.field1165.method476((byte) -113, class250.field3068).length());
            } else if (var2.startsWith(class83.field1166.method476((byte) 116, class250.field3068))) {
                var3 = 11;
                arg0 = arg0.substring(class83.field1166.method476((byte) -118, class250.field3068).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class83.field1167.method476((byte) 91, 0))) {
            var5 = 1;
            arg0 = arg0.substring(class83.field1167.method476((byte) -122, 0).length());
        } else if (var4.startsWith(class83.field1168.method476((byte) -45, 0))) {
            var5 = 2;
            arg0 = arg0.substring(class83.field1168.method476((byte) 101, 0).length());
        } else if (var4.startsWith(class83.field1169.method476((byte) 119, 0))) {
            var5 = 3;
            arg0 = arg0.substring(class83.field1169.method476((byte) -31, 0).length());
        } else if (var4.startsWith(class83.field1170.method476((byte) 125, 0))) {
            var5 = 4;
            arg0 = arg0.substring(class83.field1170.method476((byte) -48, 0).length());
        } else if (var4.startsWith(class83.field1171.method476((byte) -45, 0))) {
            var5 = 5;
            arg0 = arg0.substring(class83.field1171.method476((byte) 110, 0).length());
        } else if (class250.field3068 != 0) {
            if (var4.startsWith(class83.field1167.method476((byte) -123, class250.field3068))) {
                var5 = 1;
                arg0 = arg0.substring(class83.field1167.method476((byte) -64, class250.field3068).length());
            } else if (var4.startsWith(class83.field1168.method476((byte) 78, class250.field3068))) {
                var5 = 2;
                arg0 = arg0.substring(class83.field1168.method476((byte) -127, class250.field3068).length());
            } else if (var4.startsWith(class83.field1169.method476((byte) -25, class250.field3068))) {
                var5 = 3;
                arg0 = arg0.substring(class83.field1169.method476((byte) 97, class250.field3068).length());
            } else if (var4.startsWith(class83.field1170.method476((byte) 126, class250.field3068))) {
                var5 = 4;
                arg0 = arg0.substring(class83.field1170.method476((byte) -41, class250.field3068).length());
            } else if (var4.startsWith(class83.field1171.method476((byte) 72, class250.field3068))) {
                var5 = 5;
                arg0 = arg0.substring(class83.field1171.method476((byte) -34, class250.field3068).length());
            }
        }
        field2480++;
        class704 var6 = class314.method1820(class88.field1232, class400.field5014, (byte) -56);
        var6.field9929.method3509(0, (byte) -120);
        int var7 = var6.field9929.field8812;
        var6.field9929.method3509(var3, (byte) -118);
        var6.field9929.method3509(var5, (byte) -116);
        class57.method358(-1, arg0, var6.field9929);
        var6.field9929.method3487(var6.field9929.field8812 - var7, 2105852);
        class122.method654(var6, (byte) -36);
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(I)V", line = 283)
    public static final void method1189(int arg0) {
        if (arg0 == -1 || !class525.method2860((byte) 109, arg0)) {
            return;
        }
        class507[] var1 = class103.field1390[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class507 var3 = var1[var2];
            if (var3.field6796 != null) {
                class71 var4 = new class71();
                var4.field952 = var3;
                var4.field963 = var3.field6796;
                method1200(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "(I)V", line = 317)
    private static final void method1190(int arg0) {
        class507 var1 = class156.method894(-1018745488, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class507[] var3 = class688.field9760[var2];
        if (var3 == null) {
            class507[] var4 = class103.field1390[var2];
            int var5 = var4.length;
            var3 = class688.field9760[var2] = new class507[var5];
            class293.method1639(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class293.method1639(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(Lmea;)V", line = 355)
    public static final void method1191(class71 arg0) {
        method1200(arg0, 200000);
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(IZ)V", line = 359)
    private static final void method1192(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field2494[field2481++] = class148.field1900;
                return;
            }
            if (arg0 == 5001) {
                field2481 -= 3;
                class148.field1900 = field2494[field2481];
                class239.field2987 = class18.method119(34067, field2494[field2481 + 1]);
                if (class239.field2987 == null) {
                    class239.field2987 = class270.field3417;
                }
                class102.field1365 = field2494[field2481 + 2];
                field2482++;
                class704 var2 = class314.method1820(class611.field8573, class400.field5014, (byte) -107);
                var2.field9929.method3509(class148.field1900, (byte) -124);
                var2.field9929.method3509(class239.field2987.field262, (byte) -119);
                var2.field9929.method3509(class102.field1365, (byte) -118);
                class122.method654(var2, (byte) -36);
                return;
            }
            if (arg0 == 5002) {
                field2479 -= 2;
                String var3 = field2488[field2479];
                String var4 = field2488[field2479 + 1];
                field2481 -= 2;
                int var5 = field2494[field2481];
                int var6 = field2494[field2481 + 1];
                if (var4 == null) {
                    var4 = "";
                }
                if (var4.length() > 80) {
                    var4 = var4.substring(0, 80);
                }
                field2486++;
                class704 var7 = class314.method1820(class297.field3662, class400.field5014, (byte) 120);
                var7.field9929.method3509(class109.method611(var3, (byte) 2) + class109.method611(var4, (byte) 2) + 2, (byte) -127);
                var7.field9929.method3489(var3, -121);
                var7.field9929.method3509(var5 - 1, (byte) -117);
                var7.field9929.method3509(var6, (byte) -110);
                var7.field9929.method3489(var4, -35);
                class122.method654(var7, (byte) -36);
                return;
            }
            if (arg0 == 5003) {
                int var8 = field2494[--field2481];
                class364 var9 = class672.method3773(var8, (byte) -64);
                String var10 = "";
                if (var9 != null && var9.field4627 != null) {
                    var10 = var9.field4627;
                }
                field2488[field2479++] = var10;
                return;
            }
            if (arg0 == 5004) {
                int var11 = field2494[--field2481];
                class364 var12 = class672.method3773(var11, (byte) -101);
                int var13 = -1;
                if (var12 != null) {
                    var13 = var12.field4631;
                }
                field2494[field2481++] = var13;
                return;
            }
            if (arg0 == 5005) {
                if (class239.field2987 == null) {
                    field2494[field2481++] = -1;
                    return;
                }
                field2494[field2481++] = class239.field2987.field262;
                return;
            }
            if (arg0 == 5006) {
                int var14 = field2494[--field2481];
                class704 var15 = class314.method1820(class645.field9073, class400.field5014, (byte) -74);
                var15.field9929.method3509(var14, (byte) -115);
                class122.method654(var15, (byte) -36);
                return;
            }
            if (arg0 == 5008) {
                String var16 = field2488[--field2479];
                method1188(var16, arg0);
                return;
            }
            if (arg0 == 5009) {
                field2479 -= 2;
                String var17 = field2488[field2479];
                String var18 = field2488[field2479 + 1];
                if (class199.field2531 != 0 || (!class242.field3012 || class450.field5747) && !class553.field7703) {
                    field2492++;
                    class704 var19 = class314.method1820(class279.field3505, class400.field5014, (byte) -81);
                    var19.field9929.method3509(0, (byte) -119);
                    int var20 = var19.field9929.field8812;
                    var19.field9929.method3489(var17, -18);
                    class57.method358(-1, var18, var19.field9929);
                    var19.field9929.method3487(var19.field9929.field8812 - var20, 2105852);
                    class122.method654(var19, (byte) -36);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var21 = field2494[--field2481];
                class364 var22 = class672.method3773(var21, (byte) -45);
                String var23 = "";
                if (var22 != null && var22.field4630 != null) {
                    var23 = var22.field4630;
                }
                field2488[field2479++] = var23;
                return;
            }
            if (arg0 == 5011) {
                int var24 = field2494[--field2481];
                class364 var25 = class672.method3773(var24, (byte) 117);
                String var26 = "";
                if (var25 != null && var25.field4624 != null) {
                    var26 = var25.field4624;
                }
                field2488[field2479++] = var26;
                return;
            }
            if (arg0 == 5012) {
                int var27 = field2494[--field2481];
                class364 var28 = class672.method3773(var27, (byte) 101);
                int var29 = -1;
                if (var28 != null) {
                    var29 = var28.field4626;
                }
                field2494[field2481++] = var29;
                return;
            }
            if (arg0 == 5015) {
                String var30;
                if (class376.field4748 == null || class376.field4748.field6990 == null) {
                    var30 = class402.field5035;
                } else {
                    var30 = class376.field4748.method2777((byte) -122, true);
                }
                field2488[field2479++] = var30;
                return;
            }
            if (arg0 == 5016) {
                field2494[field2481++] = class102.field1365;
                return;
            }
            if (arg0 == 5017) {
                field2494[field2481++] = class183.method1142(1818);
                return;
            }
            if (arg0 == 5018) {
                int var31 = field2494[--field2481];
                class364 var32 = class672.method3773(var31, (byte) -115);
                int var33 = 0;
                if (var32 != null) {
                    var33 = var32.field4633;
                }
                field2494[field2481++] = var33;
                return;
            }
            if (arg0 == 5019) {
                int var34 = field2494[--field2481];
                class364 var35 = class672.method3773(var34, (byte) 113);
                String var36 = "";
                if (var35 != null && var35.field4623 != null) {
                    var36 = var35.field4623;
                }
                field2488[field2479++] = var36;
                return;
            }
            if (arg0 == 5020) {
                String var37;
                if (class376.field4748 == null || class376.field4748.field6990 == null) {
                    var37 = class402.field5035;
                } else {
                    var37 = class376.field4748.method2781(false, (byte) -7);
                }
                field2488[field2479++] = var37;
                return;
            }
            if (arg0 == 5023) {
                int var38 = field2494[--field2481];
                class364 var39 = class672.method3773(var38, (byte) -98);
                int var40 = -1;
                if (var39 != null) {
                    var40 = var39.field4621;
                }
                field2494[field2481++] = var40;
                return;
            }
            if (arg0 == 5024) {
                int var41 = field2494[--field2481];
                class364 var42 = class672.method3773(var41, (byte) -120);
                int var43 = -1;
                if (var42 != null) {
                    var43 = var42.field4632;
                }
                field2494[field2481++] = var43;
                return;
            }
            if (arg0 == 5025) {
                int var44 = field2494[--field2481];
                class364 var45 = class672.method3773(var44, (byte) 121);
                String var46 = "";
                if (var45 != null && var45.field4625 != null) {
                    var46 = var45.field4625;
                }
                field2488[field2479++] = var46;
                return;
            }
            if (arg0 == 5050) {
                int var47 = field2494[--field2481];
                field2488[field2479++] = class343.field4402.method1398(120, var47).field5050;
                return;
            }
            if (arg0 == 5051) {
                int var48 = field2494[--field2481];
                class403 var49 = class343.field4402.method1398(28, var48);
                if (var49.field5051 == null) {
                    field2494[field2481++] = 0;
                    return;
                }
                field2494[field2481++] = var49.field5051.length;
                return;
            }
            if (arg0 == 5052) {
                field2481 -= 2;
                int var50 = field2494[field2481];
                int var51 = field2494[field2481 + 1];
                class403 var52 = class343.field4402.method1398(69, var50);
                int var53 = var52.field5051[var51];
                field2494[field2481++] = var53;
                return;
            }
            if (arg0 == 5053) {
                int var54 = field2494[--field2481];
                class403 var55 = class343.field4402.method1398(72, var54);
                if (var55.field5047 == null) {
                    field2494[field2481++] = 0;
                    return;
                }
                field2494[field2481++] = var55.field5047.length;
                return;
            }
            if (arg0 == 5054) {
                field2481 -= 2;
                int var56 = field2494[field2481];
                int var57 = field2494[field2481 + 1];
                field2494[field2481++] = class343.field4402.method1398(103, var56).field5047[var57];
                return;
            }
            if (arg0 == 5055) {
                int var58 = field2494[--field2481];
                field2488[field2479++] = class428.field5360.method3781(var58, (byte) 14).method3455((byte) -107);
                return;
            }
            if (arg0 == 5056) {
                int var59 = field2494[--field2481];
                class629 var60 = class428.field5360.method3781(var59, (byte) 105);
                if (var60.field8763 == null) {
                    field2494[field2481++] = 0;
                    return;
                }
                field2494[field2481++] = var60.field8763.length;
                return;
            }
            if (arg0 == 5057) {
                field2481 -= 2;
                int var61 = field2494[field2481];
                int var62 = field2494[field2481 + 1];
                field2494[field2481++] = class428.field5360.method3781(var61, (byte) 9).field8763[var62];
                return;
            }
            if (arg0 == 5058) {
                field2491 = new class127();
                field2491.field1589 = field2494[--field2481];
                field2491.field1592 = class428.field5360.method3781(field2491.field1589, (byte) 65);
                field2491.field1595 = new int[field2491.field1592.method3460((byte) 3)];
                return;
            }
            if (arg0 == 5059) {
                field2474++;
                class704 var63 = class314.method1820(class364.field4629, class400.field5014, (byte) -89);
                var63.field9929.method3509(0, (byte) -121);
                int var64 = var63.field9929.field8812;
                var63.field9929.method3509(0, (byte) -112);
                var63.field9929.method3526(field2491.field1589, 13469);
                field2491.field1592.method3452(field2491.field1595, 0, var63.field9929);
                var63.field9929.method3487(var63.field9929.field8812 - var64, 2105852);
                class122.method654(var63, (byte) -36);
                return;
            }
            if (arg0 == 5060) {
                String var65 = field2488[--field2479];
                field2483++;
                class704 var66 = class314.method1820(class673.field9465, class400.field5014, (byte) 101);
                var66.field9929.method3509(0, (byte) -114);
                int var67 = var66.field9929.field8812;
                var66.field9929.method3489(var65, -112);
                var66.field9929.method3526(field2491.field1589, 13469);
                field2491.field1592.method3452(field2491.field1595, 0, var66.field9929);
                var66.field9929.method3487(var66.field9929.field8812 - var67, 2105852);
                class122.method654(var66, (byte) -36);
                return;
            }
            if (arg0 == 5061) {
                field2474++;
                class704 var68 = class314.method1820(class364.field4629, class400.field5014, (byte) 91);
                var68.field9929.method3509(0, (byte) -127);
                int var69 = var68.field9929.field8812;
                var68.field9929.method3509(1, (byte) -108);
                var68.field9929.method3526(field2491.field1589, 13469);
                field2491.field1592.method3452(field2491.field1595, 0, var68.field9929);
                var68.field9929.method3487(var68.field9929.field8812 - var69, 2105852);
                class122.method654(var68, (byte) -36);
                return;
            }
            if (arg0 == 5062) {
                field2481 -= 2;
                int var70 = field2494[field2481];
                int var71 = field2494[field2481 + 1];
                field2494[field2481++] = class343.field4402.method1398(49, var70).field5046[var71];
                return;
            }
            if (arg0 == 5063) {
                field2481 -= 2;
                int var72 = field2494[field2481];
                int var73 = field2494[field2481 + 1];
                field2494[field2481++] = class343.field4402.method1398(50, var72).field5054[var73];
                return;
            }
            if (arg0 == 5064) {
                field2481 -= 2;
                int var74 = field2494[field2481];
                int var75 = field2494[field2481 + 1];
                if (var75 == -1) {
                    field2494[field2481++] = -1;
                    return;
                }
                field2494[field2481++] = class343.field4402.method1398(102, var74).method2143((char) var75, 3766);
                return;
            }
            if (arg0 == 5065) {
                field2481 -= 2;
                int var76 = field2494[field2481];
                int var77 = field2494[field2481 + 1];
                if (var77 == -1) {
                    field2494[field2481++] = -1;
                    return;
                }
                field2494[field2481++] = class343.field4402.method1398(36, var76).method2147((byte) 40, (char) var77);
                return;
            }
            if (arg0 == 5066) {
                int var78 = field2494[--field2481];
                field2494[field2481++] = class428.field5360.method3781(var78, (byte) 102).method3460((byte) 3);
                return;
            }
            if (arg0 == 5067) {
                field2481 -= 2;
                int var79 = field2494[field2481];
                int var80 = field2494[field2481 + 1];
                int var81 = class428.field5360.method3781(var79, (byte) 75).method3451(-127, var80).field8333;
                field2494[field2481++] = var81;
                return;
            }
            if (arg0 == 5068) {
                field2481 -= 2;
                int var82 = field2494[field2481];
                int var83 = field2494[field2481 + 1];
                field2491.field1595[var82] = var83;
                return;
            }
            if (arg0 == 5069) {
                field2481 -= 2;
                int var84 = field2494[field2481];
                int var85 = field2494[field2481 + 1];
                field2491.field1595[var84] = var85;
                return;
            }
            if (arg0 == 5070) {
                field2481 -= 3;
                int var86 = field2494[field2481];
                int var87 = field2494[field2481 + 1];
                int var88 = field2494[field2481 + 2];
                class629 var89 = class428.field5360.method3781(var86, (byte) 34);
                if (var89.method3451(-121, var87).field8333 != 0) {
                    throw new RuntimeException("bad command");
                }
                field2494[field2481++] = var89.method3454(66, var88, var87);
                return;
            }
            if (arg0 == 5071) {
                String var90 = field2488[--field2479];
                boolean var91 = field2494[--field2481] == 1;
                class179.method1129(true, var90, var91);
                field2494[field2481++] = class530.field7163;
                return;
            }
            if (arg0 == 5072) {
                if (class182.field2328 != null && class467.field5936 < class530.field7163) {
                    field2494[field2481++] = class182.field2328[class467.field5936++] & 0xFFFF;
                    return;
                }
                field2494[field2481++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class467.field5936 = 0;
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class277.field3470.method448((byte) -68, 86)) {
                    field2494[field2481++] = 1;
                    return;
                }
                field2494[field2481++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class277.field3470.method448((byte) -68, 82)) {
                    field2494[field2481++] = 1;
                    return;
                }
                field2494[field2481++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class277.field3470.method448((byte) -68, 81)) {
                    field2494[field2481++] = 1;
                    return;
                }
                field2494[field2481++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class598.method3288(field2494[--field2481], (byte) -123);
                return;
            }
            if (arg0 == 5201) {
                field2494[field2481++] = class430.method2274(3411);
                return;
            }
            if (arg0 == 5205) {
                class239.method1431(field2494[--field2481], -1, -1, false, -1);
                return;
            }
            if (arg0 == 5206) {
                int var92 = field2494[--field2481];
                class43 var93 = class656.method3691(var92 >> 14 & 0x3FFF, var92 & 0x3FFF);
                if (var93 == null) {
                    field2494[field2481++] = -1;
                    return;
                }
                field2494[field2481++] = var93.field559;
                return;
            }
            if (arg0 == 5207) {
                class43 var94 = class656.method3671(field2494[--field2481]);
                if (var94 != null && var94.field572 != null) {
                    field2488[field2479++] = var94.field572;
                    return;
                }
                field2488[field2479++] = "";
                return;
            }
            if (arg0 == 5208) {
                field2494[field2481++] = class553.field7701;
                field2494[field2481++] = class447.field5742;
                return;
            }
            if (arg0 == 5209) {
                field2494[field2481++] = class656.field9265 + class198.field2501;
                field2494[field2481++] = class656.field9264 + class635.field8898;
                return;
            }
            if (arg0 == 5210) {
                int var95 = field2494[--field2481];
                class43 var96 = class656.method3671(var95);
                if (var96 == null) {
                    field2494[field2481++] = 0;
                    field2494[field2481++] = 0;
                    return;
                }
                field2494[field2481++] = var96.field560 >> 14 & 0x3FFF;
                field2494[field2481++] = var96.field560 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var97 = field2494[--field2481];
                class43 var98 = class656.method3671(var97);
                if (var98 == null) {
                    field2494[field2481++] = 0;
                    field2494[field2481++] = 0;
                    return;
                }
                field2494[field2481++] = var98.field571 - var98.field558;
                field2494[field2481++] = var98.field568 - var98.field573;
                return;
            }
            if (arg0 == 5212) {
                class316 var99 = class31.method211(2048);
                if (var99 == null) {
                    field2494[field2481++] = -1;
                    field2494[field2481++] = -1;
                    return;
                }
                field2494[field2481++] = var99.field4057;
                int var100 = var99.field4062 << 28 | class656.field9265 + var99.field4055 << 14 | class656.field9264 + var99.field4056;
                field2494[field2481++] = var100;
                return;
            }
            if (arg0 == 5213) {
                class316 var101 = class491.method2646(-102);
                if (var101 == null) {
                    field2494[field2481++] = -1;
                    field2494[field2481++] = -1;
                    return;
                }
                field2494[field2481++] = var101.field4057;
                int var102 = var101.field4062 << 28 | class656.field9265 + var101.field4055 << 14 | class656.field9264 + var101.field4056;
                field2494[field2481++] = var102;
                return;
            }
            if (arg0 == 5214) {
                int var103 = field2494[--field2481];
                class43 var104 = class671.method3769((byte) 103);
                if (var104 != null) {
                    boolean var105 = var104.method262(var103 >> 14 & 0x3FFF, var103 & 0x3FFF, field2498, 255, var103 >> 28 & 0x3);
                    if (var105) {
                        class655.method3666(field2498[2], field2498[1], 113);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field2481 -= 2;
                int var106 = field2494[field2481];
                int var107 = field2494[field2481 + 1];
                class265 var108 = class656.method3677(var106 >> 14 & 0x3FFF, var106 & 0x3FFF);
                boolean var109 = false;
                for (class43 var110 = (class43) var108.method1546((byte) -75); var110 != null; var110 = (class43) var108.method1536(1252027233)) {
                    if (var110.field559 == var107) {
                        var109 = true;
                        break;
                    }
                }
                if (var109) {
                    field2494[field2481++] = 1;
                    return;
                }
                field2494[field2481++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var111 = field2494[--field2481];
                class43 var112 = class656.method3671(var111);
                if (var112 == null) {
                    field2494[field2481++] = -1;
                    return;
                }
                field2494[field2481++] = var112.field562;
                return;
            }
            if (arg0 == 5220) {
                field2494[field2481++] = class294.field3634 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var113 = field2494[--field2481];
                class655.method3666(var113 & 0x3FFF, var113 >> 14 & 0x3FFF, -17);
                return;
            }
            if (arg0 == 5222) {
                class43 var114 = class671.method3769((byte) 103);
                if (var114 != null) {
                    boolean var115 = var114.method264(class656.field9264 + class635.field8898, class656.field9265 + class198.field2501, field2498, (byte) -125);
                    if (var115) {
                        field2494[field2481++] = field2498[1];
                        field2494[field2481++] = field2498[2];
                        return;
                    }
                    field2494[field2481++] = -1;
                    field2494[field2481++] = -1;
                    return;
                }
                field2494[field2481++] = -1;
                field2494[field2481++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field2481 -= 2;
                int var116 = field2494[field2481];
                int var117 = field2494[field2481 + 1];
                class239.method1431(var116, -1, var117 & 0x3FFF, false, var117 >> 14 & 0x3FFF);
                return;
            }
            if (arg0 == 5224) {
                int var118 = field2494[--field2481];
                class43 var119 = class671.method3769((byte) 103);
                if (var119 != null) {
                    boolean var120 = var119.method262(var118 >> 14 & 0x3FFF, var118 & 0x3FFF, field2498, 255, var118 >> 28 & 0x3);
                    if (var120) {
                        field2494[field2481++] = field2498[1];
                        field2494[field2481++] = field2498[2];
                        return;
                    }
                    field2494[field2481++] = -1;
                    field2494[field2481++] = -1;
                    return;
                }
                field2494[field2481++] = -1;
                field2494[field2481++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var121 = field2494[--field2481];
                class43 var122 = class671.method3769((byte) 103);
                if (var122 != null) {
                    boolean var123 = var122.method264(var121 & 0x3FFF, var121 >> 14 & 0x3FFF, field2498, (byte) -114);
                    if (var123) {
                        field2494[field2481++] = field2498[1];
                        field2494[field2481++] = field2498[2];
                        return;
                    }
                    field2494[field2481++] = -1;
                    field2494[field2481++] = -1;
                    return;
                }
                field2494[field2481++] = -1;
                field2494[field2481++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class702.method3938(field2494[--field2481], 9192);
                return;
            }
            if (arg0 == 5227) {
                field2481 -= 2;
                int var124 = field2494[field2481];
                int var125 = field2494[field2481 + 1];
                class239.method1431(var124, -1, var125 & 0x3FFF, true, var125 >> 14 & 0x3FFF);
                return;
            }
            if (arg0 == 5228) {
                class493.field6504 = field2494[--field2481] == 1;
                return;
            }
            if (arg0 == 5229) {
                field2494[field2481++] = class493.field6504 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var126 = field2494[--field2481];
                class404.method2154(3, var126);
                return;
            }
            if (arg0 == 5231) {
                field2481 -= 2;
                int var127 = field2494[field2481];
                boolean var128 = field2494[field2481 + 1] == 1;
                if (class227.field2834 != null) {
                    class329 var129 = class227.field2834.method399(-32748, (long) var127);
                    if (var129 != null && !var128) {
                        var129.method1871(-14);
                        return;
                    }
                    if (var129 == null && var128) {
                        class329 var130 = new class329();
                        class227.field2834.method402(var130, (byte) -50, (long) var127);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var131 = field2494[--field2481];
                if (class227.field2834 != null) {
                    class329 var132 = class227.field2834.method399(-32748, (long) var131);
                    field2494[field2481++] = var132 == null ? 0 : 1;
                    return;
                }
                field2494[field2481++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field2481 -= 2;
                int var133 = field2494[field2481];
                boolean var134 = field2494[field2481 + 1] == 1;
                if (class175.field2268 != null) {
                    class329 var135 = class175.field2268.method399(-32748, (long) var133);
                    if (var135 != null && !var134) {
                        var135.method1871(-121);
                        return;
                    }
                    if (var135 == null && var134) {
                        class329 var136 = new class329();
                        class175.field2268.method402(var136, (byte) -87, (long) var133);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var137 = field2494[--field2481];
                if (class175.field2268 != null) {
                    class329 var138 = class175.field2268.method399(-32748, (long) var137);
                    field2494[field2481++] = var138 == null ? 0 : 1;
                    return;
                }
                field2494[field2481++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field2494[field2481++] = class656.field9236 == null ? -1 : class656.field9236.field559;
                return;
            }
            if (arg0 == 5236) {
                field2481 -= 2;
                int var139 = field2494[field2481];
                int var140 = field2494[field2481 + 1];
                int var141 = var140 >> 14 & 0x3FFF;
                int var142 = var140 & 0x3FFF;
                int var143 = class253.method1481(var142, -100, var139, var141);
                if (var143 < 0) {
                    field2494[field2481++] = -1;
                    return;
                }
                field2494[field2481++] = var143;
                return;
            }
            if (arg0 == 5237) {
                class496.method2669(-108);
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field2481 -= 2;
                int var144 = field2494[field2481];
                int var145 = field2494[field2481 + 1];
                class220.method1301(false, (byte) 126, var144, var145, 3);
                field2494[field2481++] = class655.field9229 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class655.field9229 != null) {
                    class220.method1301(false, (byte) 126, -1, -1, class301.field3698.field6616);
                }
                return;
            }
            if (arg0 == 5302) {
                class170[] var146 = class475.method2513((byte) 58);
                field2494[field2481++] = var146.length;
                return;
            }
            if (arg0 == 5303) {
                int var147 = field2494[--field2481];
                class170[] var148 = class475.method2513((byte) 58);
                field2494[field2481++] = var148[var147].field2216;
                field2494[field2481++] = var148[var147].field2213;
                return;
            }
            if (arg0 == 5305) {
                int var149 = class301.field3698.field6642;
                int var150 = class301.field3698.field6625;
                int var151 = -1;
                class170[] var152 = class475.method2513((byte) 58);
                for (int var153 = 0; var153 < var152.length; var153++) {
                    class170 var154 = var152[var153];
                    if (var154.field2216 == var149 && var154.field2213 == var150) {
                        var151 = var153;
                        break;
                    }
                }
                field2494[field2481++] = var151;
                return;
            }
            if (arg0 == 5306) {
                field2494[field2481++] = class193.method1167(110);
                return;
            }
            if (arg0 == 5307) {
                int var155 = field2494[--field2481];
                if (var155 >= 1 && var155 <= 2) {
                    class220.method1301(false, (byte) 126, -1, -1, var155);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field2494[field2481++] = class301.field3698.field6616;
                return;
            }
            if (arg0 == 5309) {
                int var156 = field2494[--field2481];
                if (var156 >= 1 && var156 <= 2) {
                    class301.field3698.field6616 = var156;
                    class301.field3698.method138(class590.field8289, (byte) 32);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field2479 -= 2;
                String var157 = field2488[field2479];
                String var158 = field2488[field2479 + 1];
                int var159 = field2494[--field2481];
                field2477++;
                class704 var160 = class314.method1820(class275.field3455, class400.field5014, (byte) -69);
                var160.field9929.method3509(class109.method611(var157, (byte) 2) + class109.method611(var158, (byte) 2) + 1, (byte) -123);
                var160.field9929.method3489(var157, -43);
                var160.field9929.method3489(var158, -21);
                var160.field9929.method3509(var159, (byte) -120);
                class122.method654(var160, (byte) -36);
                return;
            }
            if (arg0 == 5401) {
                field2481 -= 2;
                class676.field9500[field2494[field2481]] = (short) class32.method215(53, field2494[field2481 + 1]);
                class633.field8881.method429(0);
                class633.field8881.method425(-34);
                class287.field3581.method1492((byte) -122);
                class544.method2941(0);
                return;
            }
            if (arg0 == 5405) {
                field2481 -= 2;
                int var161 = field2494[field2481];
                int var162 = field2494[field2481 + 1];
                if (var161 >= 0 && var161 < 2) {
                    class639.field8992[var161] = new int[var162 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field2481 -= 7;
                int var163 = field2494[field2481];
                int var164 = field2494[field2481 + 1] << 1;
                int var165 = field2494[field2481 + 2];
                int var166 = field2494[field2481 + 3];
                int var167 = field2494[field2481 + 4];
                int var168 = field2494[field2481 + 5];
                int var169 = field2494[field2481 + 6];
                if (var163 >= 0 && var163 < 2 && class639.field8992[var163] != null && var164 >= 0 && var164 < class639.field8992[var163].length) {
                    class639.field8992[var163][var164] = new int[] { (var165 >> 14 & 0x3FFF) << 9, var166 << 2, (var165 & 0x3FFF) << 9, var169 };
                    class639.field8992[var163][var164 + 1] = new int[] { (var167 >> 14 & 0x3FFF) << 9, var168 << 2, (var167 & 0x3FFF) << 9 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var170 = class639.field8992[field2494[--field2481]].length >> 1;
                field2494[field2481++] = var170;
                return;
            }
            if (arg0 == 5411) {
                if (class655.field9229 != null) {
                    class220.method1301(false, (byte) 126, -1, -1, class301.field3698.field6616);
                }
                if (class582.field8140 != null) {
                    class469.method2484(false);
                    System.exit(0);
                    return;
                }
                String var171 = class117.field1515 == null ? class133.method773(-9316) : class117.field1515;
                class313.method1818(126, var171, class590.field8289, class651.field9191 == 1, false);
                return;
            }
            if (arg0 == 5419) {
                String var172 = "";
                if (class595.field8377 != null) {
                    if (class595.field8377.field3356 == null) {
                        var172 = class7.method60((byte) 82, class595.field8377.field3354);
                    } else {
                        var172 = (String) class595.field8377.field3356;
                    }
                }
                field2488[field2479++] = var172;
                return;
            }
            if (arg0 == 5420) {
                field2494[field2481++] = class590.field8289.field9151 ? 0 : 1;
                return;
            }
            if (arg0 == 5421) {
                if (class655.field9229 != null) {
                    class220.method1301(false, (byte) 126, -1, -1, class301.field3698.field6616);
                }
                String var173 = field2488[--field2479];
                boolean var174 = field2494[--field2481] == 1;
                String var175 = class133.method773(-9316) + var173;
                class313.method1818(125, var175, class590.field8289, class651.field9191 == 1, var174);
                return;
            }
            if (arg0 == 5422) {
                field2479 -= 2;
                String var176 = field2488[field2479];
                String var177 = field2488[field2479 + 1];
                int var178 = field2494[--field2481];
                if (var176.length() > 0) {
                    if (class358.field4566 == null) {
                        class358.field4566 = new String[class545.field7264[class98.field1337.field1469]];
                    }
                    class358.field4566[var178] = var176;
                }
                if (var177.length() > 0) {
                    if (class348.field4459 == null) {
                        class348.field4459 = new String[class545.field7264[class98.field1337.field1469]];
                    }
                    class348.field4459[var178] = var177;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field2488[--field2479]);
                return;
            }
            if (arg0 == 5424) {
                field2481 -= 11;
                class551.field7670 = field2494[field2481];
                class107.field1429 = field2494[field2481 + 1];
                class633.field8879 = field2494[field2481 + 2];
                class16.field263 = field2494[field2481 + 3];
                class700.field9908 = field2494[field2481 + 4];
                class50.field705 = field2494[field2481 + 5];
                class65.field890 = field2494[field2481 + 6];
                class67.field913 = field2494[field2481 + 7];
                class629.field8761 = field2494[field2481 + 8];
                class408.field5120 = field2494[field2481 + 9];
                class446.field5666 = field2494[field2481 + 10];
                class631.field8846.method3368(1912, class700.field9908);
                class631.field8846.method3368(1912, class50.field705);
                class631.field8846.method3368(1912, class65.field890);
                class631.field8846.method3368(1912, class67.field913);
                class631.field8846.method3368(1912, class629.field8761);
                class238.field2972 = null;
                class160.field2101 = null;
                class514.field6997 = null;
                class157.field2048 = null;
                class596.field8385 = null;
                class423.field5310 = null;
                class645.field9071 = null;
                class188.field2362 = null;
                class9.field186 = true;
                return;
            }
            if (arg0 == 5425) {
                class27.method184(17381);
                class9.field186 = false;
                return;
            }
            if (arg0 == 5426) {
                field2481 -= 2;
                class224.field2810 = field2494[field2481];
                class533.field7186 = field2494[field2481 + 1];
                return;
            }
            if (arg0 == 5427) {
                field2481 -= 2;
                class36.field495 = field2494[field2481 + 1];
                return;
            }
            if (arg0 == 5428) {
                field2481 -= 2;
                int var179 = field2494[field2481];
                int var180 = field2494[field2481 + 1];
                field2494[field2481++] = class475.method2515(false, var179, var180) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class483.method2626(0, false, field2488[--field2479], false);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class371.method2028(true, "accountcreated", class422.field5308);
                    return;
                } catch (Throwable var316) {
                    return;
                }
            }
            if (arg0 == 5431) {
                try {
                    class371.method2028(true, "accountcreatestarted", class422.field5308);
                    return;
                } catch (Throwable var317) {
                    return;
                }
            }
            if (arg0 == 5432) {
                String var181 = "";
                if (class434.field5437 != null) {
                    Transferable var182 = class434.field5437.getContents(null);
                    if (var182 != null) {
                        try {
                            var181 = (String) var182.getTransferData(DataFlavor.stringFlavor);
                            if (var181 == null) {
                                var181 = "";
                            }
                        } catch (Exception var318) {
                        }
                    }
                }
                field2488[field2479++] = var181;
                return;
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field2481 -= 4;
                int var183 = field2494[field2481];
                int var184 = field2494[field2481 + 1];
                int var185 = field2494[field2481 + 2];
                int var186 = field2494[field2481 + 3];
                class407.method2165(false, (var183 >> 14 & 0x3FFF) - class145.field1879, var185, var186, false, (var183 & 0x3FFF) - class630.field8817, var184 << 2);
                return;
            }
            if (arg0 == 5501) {
                field2481 -= 4;
                int var187 = field2494[field2481];
                int var188 = field2494[field2481 + 1];
                int var189 = field2494[field2481 + 2];
                int var190 = field2494[field2481 + 3];
                class517.method2799((byte) -16, var189, (var187 >> 14 & 0x3FFF) - class145.field1879, (var187 & 0x3FFF) - class630.field8817, var188 << 2, var190);
                return;
            }
            if (arg0 == 5502) {
                field2481 -= 6;
                int var191 = field2494[field2481];
                if (var191 >= 2) {
                    throw new RuntimeException();
                }
                class697.field9866 = var191;
                int var192 = field2494[field2481 + 1];
                if (var192 + 1 >= class639.field8992[class697.field9866].length >> 1) {
                    throw new RuntimeException();
                }
                class335.field4263 = var192;
                class284.field3531 = 0;
                class693.field9827 = field2494[field2481 + 2];
                class310.field3964 = field2494[field2481 + 3];
                int var193 = field2494[field2481 + 4];
                if (var193 >= 2) {
                    throw new RuntimeException();
                }
                class465.field5928 = var193;
                int var194 = field2494[field2481 + 5];
                if (var194 + 1 >= class639.field8992[class465.field5928].length >> 1) {
                    throw new RuntimeException();
                }
                class285.field3542 = var194;
                class296.field3661 = 3;
                class196.field2471 = -1;
                class306.field3890 = -1;
                return;
            }
            if (arg0 == 5503) {
                class479.method2608((byte) -110);
                return;
            }
            if (arg0 == 5504) {
                field2481 -= 2;
                class256.method1496(0, field2494[field2481 + 1], field2494[field2481], 8);
                return;
            }
            if (arg0 == 5505) {
                field2494[field2481++] = (int) class133.field1739 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field2494[field2481++] = (int) class331.field4223 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class602.method3304((byte) -87);
                return;
            }
            if (arg0 == 5508) {
                class250.method1467(-17);
                return;
            }
            if (arg0 == 5509) {
                class454.method2432(191);
                return;
            }
            if (arg0 == 5510) {
                class705.method3952((byte) 6);
                return;
            }
            if (arg0 == 5511) {
                int var195 = field2494[--field2481];
                int var196 = var195 >> 14 & 0x3FFF;
                int var197 = var195 & 0x3FFF;
                int var198 = var196 - class145.field1879;
                if (var198 < 0) {
                    var198 = 0;
                } else if (var198 >= class431.field5395) {
                    var198 = class431.field5395;
                }
                int var199 = var197 - class630.field8817;
                if (var199 < 0) {
                    var199 = 0;
                } else if (var199 >= class452.field5802) {
                    var199 = class452.field5802;
                }
                class493.field6499 = (var198 << 9) + 256;
                class214.field2661 = (var199 << 9) + 256;
                class296.field3661 = 4;
                class196.field2471 = -1;
                class306.field3890 = -1;
                return;
            }
            if (arg0 == 5512) {
                class205.method1236(5);
                return;
            }
            if (arg0 == 5517) {
                int var200 = field2494[--field2481];
                if (var200 == -1) {
                    int var201 = var200 >> 14 & 0x3FFF;
                    int var202 = var200 & 0x3FFF;
                    int var203 = var201 - class145.field1879;
                    if (var203 < 0) {
                        var203 = 0;
                    } else if (var203 >= class431.field5395) {
                        var203 = class431.field5395;
                    }
                    int var204 = var202 - class630.field8817;
                    if (var204 < 0) {
                        var204 = 0;
                    } else if (var204 >= class452.field5802) {
                        var204 = class452.field5802;
                    }
                    class306.field3890 = (var203 << 9) + 256;
                    class196.field2471 = (var204 << 9) + 256;
                    return;
                }
                class306.field3890 = -1;
                class196.field2471 = -1;
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field2479 -= 2;
                String var205 = field2488[field2479];
                String var206 = field2488[field2479 + 1];
                int var207 = field2494[--field2481];
                if (class504.field6675 != 3) {
                    return;
                }
                if (class367.field4671 == 0 && class82.field1097 == 0) {
                    class402.field5035 = var205;
                    class507.field6866 = var206;
                    class304.field3746 = var207;
                    class361.method1987(6, -117);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class668.method3754(false);
                return;
            }
            if (arg0 == 5602) {
                if (class367.field4671 == 0) {
                    class503.field6663 = -2;
                    class195.field2453 = -2;
                }
                return;
            }
            if (arg0 == 5603) {
                field2481 -= 4;
                if (class504.field6675 != 3) {
                    return;
                }
                if (class367.field4671 == 0 && class82.field1097 == 0) {
                    class566.method3116(field2494[field2481], field2494[field2481 + 3], field2494[field2481 + 2], field2494[field2481 + 1], (byte) 99);
                    return;
                }
                return;
            }
            if (arg0 == 5604) {
                field2479--;
                if (class504.field6675 != 3) {
                    return;
                }
                if (class367.field4671 == 0 && class82.field1097 == 0) {
                    class571.method3152(-119, class102.method576(0, field2488[field2479]));
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field2479 -= 2;
                if (class504.field6675 != 3) {
                    return;
                }
                if (class367.field4671 == 0 && class82.field1097 == 0) {
                    class386.method2077(field2488[field2479 + 1], class102.method576(0, field2488[field2479]), false, (byte) 110);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class82.field1097 == 0) {
                    class76.field1046 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field2494[field2481++] = class195.field2453;
                return;
            }
            if (arg0 == 5608) {
                field2494[field2481++] = class589.field8276;
                return;
            }
            if (arg0 == 5609) {
                field2494[field2481++] = class76.field1046;
                return;
            }
            if (arg0 == 5610) {
                for (int var208 = 0; var208 < 5; var208++) {
                    field2488[field2479++] = class373.field4708 == null || class373.field4708.length <= var208 ? "" : class615.method3397((byte) 111, class373.field4708[var208]);
                }
                class373.field4708 = null;
                return;
            }
            if (arg0 == 5611) {
                field2494[field2481++] = class433.field5421;
                return;
            }
            if (arg0 == 5612) {
                int var209 = field2494[--field2481];
                if (class504.field6675 != 7) {
                    return;
                }
                if (class367.field4671 == 0 && class82.field1097 == 0) {
                    if (class446.field5686 != null) {
                        class446.field5686.method1235(0);
                        class446.field5686 = null;
                    }
                    class304.field3746 = var209;
                    class361.method1987(9, -104);
                    return;
                }
                return;
            }
            if (arg0 == 5613) {
                field2494[field2481++] = class195.field2453;
                return;
            }
            if (arg0 == 5615) {
                field2479 -= 2;
                String var210 = field2488[field2479];
                String var211 = field2488[field2479 + 1];
                if (class504.field6675 != 3) {
                    return;
                }
                if (class367.field4671 == 0 && class82.field1097 == 0) {
                    if (class446.field5686 != null) {
                        class446.field5686.method1235(0);
                        class446.field5686 = null;
                    }
                    class402.field5035 = var210;
                    class507.field6866 = var211;
                    class361.method1987(5, -122);
                    return;
                }
                return;
            }
            if (arg0 == 5616) {
                class413.method2189((byte) 21, false);
                return;
            }
            if (arg0 == 5617) {
                field2494[field2481++] = class503.field6663;
                return;
            }
            if (arg0 == 5618) {
                int var212 = field2494[--field2481];
                class148.method860(false, var212, 3);
                return;
            }
            if (arg0 == 5619) {
                int var213 = field2494[--field2481];
                class148.method860(true, var213, 3);
                return;
            }
            if (arg0 == 5620) {
                class667.method3747(-95);
                if (class355.field4528 != "" && class355.field4528 != "") {
                    field2494[field2481++] = 1;
                    return;
                }
                field2494[field2481++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field2479 -= 2;
                if (class504.field6675 != 3) {
                    return;
                }
                if (class367.field4671 == 0 && class82.field1097 == 0) {
                    class386.method2077(field2488[field2479 + 1], class102.method576(0, field2488[field2479]), true, (byte) 103);
                    return;
                }
                return;
            }
            if (arg0 == 5622) {
                class264 var214 = class590.field8289.method3641("3", (byte) -28, false);
                while (var214.field3358 == 0) {
                    class419.method2233(-28448, 1L);
                }
                if (var214.field3358 == 2) {
                    throw new RuntimeException("Error opening file");
                }
                class479 var215 = (class479) var214.field3356;
                if (var215.method2606((byte) -114).exists()) {
                    class630 var216 = new class630(50);
                    try {
                        var215.method2605(0, (byte) -123, 50, var216.field8804);
                    } catch (IOException var320) {
                    }
                }
                try {
                    var215.method2603((byte) -127);
                    return;
                } catch (Exception var319) {
                    return;
                }
            }
            if (arg0 == 5623) {
                if (class180.field2319 != null) {
                    field2494[field2481++] = 1;
                    return;
                }
                field2494[field2481++] = 0;
                return;
            }
            if (arg0 == 5624) {
                field2494[field2481++] = (int) (class49.field702 >> 32);
                field2494[field2481++] = (int) (class49.field702 & 0xFFFFL);
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var217 = field2494[--field2481];
                if (var217 < 1) {
                    var217 = 1;
                }
                if (var217 > 4) {
                    var217 = 4;
                }
                class301.field3698.field6649 = var217;
                class626.method3443((byte) 49);
                class301.field3698.method138(class590.field8289, (byte) 119);
                class206.field2617 = false;
                return;
            }
            if (arg0 == 6002) {
                class301.field3698.method142(field2494[--field2481] == 1, 1000);
                class626.method3443((byte) 46);
                class512.method2766(-99);
                class301.field3698.method138(class590.field8289, (byte) 105);
                class206.field2617 = false;
                return;
            }
            if (arg0 == 6003) {
                class301.field3698.field6637 = field2494[--field2481] == 1;
                class512.method2766(-118);
                class301.field3698.method138(class590.field8289, (byte) 121);
                class206.field2617 = false;
                return;
            }
            if (arg0 == 6005) {
                class301.field3698.field6646 = field2494[--field2481] == 1;
                class626.method3443((byte) -114);
                class301.field3698.method138(class590.field8289, (byte) 42);
                class206.field2617 = false;
                return;
            }
            if (arg0 == 6006) {
                class301.field3698.field6630 = field2494[--field2481] == 1;
                class32.field452.method1005(!class301.field3698.field6630);
                class301.field3698.method138(class590.field8289, (byte) 39);
                class206.field2617 = false;
                return;
            }
            if (arg0 == 6007) {
                class301.field3698.field6610 = field2494[--field2481];
                class301.field3698.method138(class590.field8289, (byte) 114);
                class206.field2617 = false;
                return;
            }
            if (arg0 == 6008) {
                class301.field3698.field6618 = field2494[--field2481] == 1;
                class301.field3698.method138(class590.field8289, (byte) 75);
                class206.field2617 = false;
                return;
            }
            if (arg0 == 6009) {
                class301.field3698.field6621 = field2494[--field2481] == 1;
                class626.method3443((byte) -120);
                class301.field3698.method138(class590.field8289, (byte) 112);
                class206.field2617 = false;
                return;
            }
            if (arg0 == 6010) {
                class301.field3698.field6613 = field2494[--field2481] == 1;
                class301.field3698.method138(class590.field8289, (byte) 78);
                class206.field2617 = false;
                return;
            }
            if (arg0 == 6011) {
                int var218 = field2494[--field2481];
                if (var218 < 0 || var218 > 2) {
                    var218 = 0;
                }
                class301.field3698.method2699(var218, 2, class651.field9191);
                class626.method3443((byte) 59);
                class301.field3698.method138(class590.field8289, (byte) 79);
                class206.field2617 = false;
                return;
            }
            if (arg0 == 6012) {
                class301.field3698.method2704((byte) -119, field2494[--field2481] == 1, class651.field9191);
                class309.method1785((byte) 103);
                class19.method122(-104);
                class301.field3698.method138(class590.field8289, (byte) 90);
                class206.field2617 = false;
                return;
            }
            if (arg0 == 6014) {
                class301.field3698.field6631 = field2494[--field2481] == 1;
                class626.method3443((byte) -115);
                class301.field3698.method138(class590.field8289, (byte) 71);
                class206.field2617 = false;
                return;
            }
            if (arg0 == 6015) {
                class301.field3698.field6609 = field2494[--field2481] == 1;
                class626.method3443((byte) -109);
                class301.field3698.method138(class590.field8289, (byte) 89);
                class206.field2617 = false;
                return;
            }
            if (arg0 == 6016) {
                int var219 = field2494[--field2481];
                if (var219 < 0 || var219 > 2) {
                    var219 = 0;
                }
                class301.field3698.field6645 = var219;
                class393.method2111(class651.field9191, true);
                class301.field3698.method138(class590.field8289, (byte) 35);
                return;
            }
            if (arg0 == 6017) {
                class301.field3698.field6612 = field2494[--field2481] == 1;
                class504.method2711(true);
                class301.field3698.method138(class590.field8289, (byte) 116);
                class206.field2617 = false;
                return;
            }
            if (arg0 == 6018) {
                int var220 = field2494[--field2481];
                if (var220 < 0) {
                    var220 = 0;
                }
                if (var220 > 127) {
                    var220 = 127;
                }
                class301.field3698.field6628 = var220;
                class301.field3698.method138(class590.field8289, (byte) 32);
                class206.field2617 = false;
                return;
            }
            if (arg0 == 6019) {
                int var221 = field2494[--field2481];
                if (var221 < 0) {
                    var221 = 0;
                }
                if (var221 > 255) {
                    var221 = 255;
                }
                if (class301.field3698.field6633 != var221) {
                    if (class301.field3698.field6633 == 0 && class582.field8137 != -1) {
                        class627.method3447(false, 0, var221, class81.field1086, (byte) -48, class582.field8137);
                        class639.field8989 = false;
                    } else if (var221 == 0) {
                        class538.method2919(true);
                        class639.field8989 = false;
                    } else {
                        class680.method3827(var221, (byte) -119);
                    }
                    class301.field3698.field6633 = var221;
                }
                class301.field3698.method138(class590.field8289, (byte) 38);
                class206.field2617 = false;
                return;
            }
            if (arg0 == 6020) {
                int var222 = field2494[--field2481];
                if (var222 < 0) {
                    var222 = 0;
                }
                if (var222 > 127) {
                    var222 = 127;
                }
                class301.field3698.field6644 = var222;
                class301.field3698.method138(class590.field8289, (byte) 40);
                class206.field2617 = false;
                return;
            }
            if (arg0 == 6021) {
                class301.field3698.field302 = field2494[--field2481] == 1;
                class512.method2766(-120);
                return;
            }
            if (arg0 == 6023) {
                int var223 = field2494[--field2481];
                boolean var224 = false;
                if (var223 < 0) {
                    var223 = 0;
                }
                if (var223 > 2) {
                    var223 = 2;
                }
                if (class380.field4801 < 96) {
                    var223 = 0;
                    var224 = true;
                }
                class304.method1746(0, var223);
                class301.field3698.method138(class590.field8289, (byte) 115);
                class206.field2617 = false;
                field2494[field2481++] = var224 ? 0 : 1;
                return;
            }
            if (arg0 == 6024) {
                int var225 = field2494[--field2481];
                if (var225 < 0 || var225 > 2) {
                    var225 = 0;
                }
                class301.field3698.field6638 = var225;
                class301.field3698.method138(class590.field8289, (byte) 43);
                return;
            }
            if (arg0 == 6025) {
                int var226 = field2494[--field2481];
                if (var226 < 0 || var226 > class557.method3066(-69, class380.field4801)) {
                    var226 = 0;
                }
                class301.field3698.field6606 = var226;
                class301.field3698.method138(class590.field8289, (byte) 101);
                class206.field2617 = false;
                return;
            }
            if (arg0 == 6027) {
                int var227 = field2494[--field2481];
                if (var227 < 0 || var227 > 1) {
                    var227 = 0;
                }
                class700.method3932(-49, var227 == 1);
                return;
            }
            if (arg0 == 6028) {
                class301.field3698.field6629 = field2494[--field2481] != 0;
                class301.field3698.method138(class590.field8289, (byte) 98);
                return;
            }
            if (arg0 == 6029) {
                class301.field3698.field6610 = field2494[--field2481];
                class301.field3698.method138(class590.field8289, (byte) 62);
                return;
            }
            if (arg0 == 6030) {
                class301.field3698.field6636 = field2494[--field2481] != 0;
                class301.field3698.method138(class590.field8289, (byte) 45);
                class626.method3443((byte) -122);
                return;
            }
            if (arg0 == 6031) {
                int var228 = field2494[--field2481];
                if (var228 < 0 || var228 > 5) {
                    var228 = 2;
                }
                class393.method2111(var228, true);
                return;
            }
            if (arg0 == 6032) {
                int var229 = field2494[--field2481];
                if (var229 < 0 || var229 > 5) {
                    var229 = 2;
                }
                class301.field3698.field6632 = var229;
                class301.field3698.method138(class590.field8289, (byte) 53);
                class206.field2617 = false;
                return;
            }
            if (arg0 == 6033) {
                int var230 = field2494[--field2481];
                if (var230 < 0 || var230 > 4) {
                    var230 = 2;
                }
                class301.field3698.field6617 = var230;
                class301.field3698.method138(class590.field8289, (byte) 45);
                return;
            }
            if (arg0 == 6034) {
                class301.field3698.field6604 = field2494[--field2481] == 1;
                class301.field3698.method138(class590.field8289, (byte) 57);
                class309.method1785((byte) 50);
                class206.field2617 = false;
                return;
            }
            if (arg0 == 6035) {
                class301.field3698.field319 = field2494[--field2481] == 1;
                class626.method3443((byte) 12);
                class512.method2766(-110);
                return;
            }
            if (arg0 == 6036) {
                int var231 = field2494[--field2481];
                if (var231 < 0 || var231 > 2) {
                    var231 = 0;
                }
                class301.field3698.method140((byte) 122, var231);
                class301.field3698.method138(class590.field8289, (byte) 31);
                return;
            }
            if (arg0 == 6037) {
                int var232 = field2494[--field2481];
                if (var232 < 0) {
                    var232 = 0;
                }
                if (var232 > 127) {
                    var232 = 127;
                }
                class301.field3698.field6635 = var232;
                class301.field3698.method138(class590.field8289, (byte) 44);
                class206.field2617 = false;
                return;
            }
            if (arg0 == 6038) {
                int var233 = field2494[--field2481];
                if (var233 < 0) {
                    var233 = 0;
                }
                if (var233 > 255) {
                    var233 = 255;
                }
                if (class301.field3698.field6641 != var233 && class86.field1219 == class582.field8137) {
                    if (class301.field3698.field6641 == 0) {
                        class627.method3447(false, 0, var233, class81.field1086, (byte) -63, class582.field8137);
                        class639.field8989 = false;
                    } else if (var233 == 0) {
                        class538.method2919(true);
                        class639.field8989 = false;
                    } else {
                        class680.method3827(var233, (byte) -119);
                    }
                }
                class301.field3698.field6641 = var233;
                class301.field3698.method138(class590.field8289, (byte) 120);
                class206.field2617 = false;
                return;
            }
            if (arg0 == 6039) {
                int var234 = field2494[--field2481];
                if (var234 > 255 || var234 < 0) {
                    var234 = 0;
                }
                if (class301.field3698.field6619 != var234) {
                    class301.field3698.field6619 = var234;
                    class301.field3698.method138(class590.field8289, (byte) 79);
                    class206.field2617 = false;
                }
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field2494[field2481++] = class301.field3698.field6649;
                return;
            }
            if (arg0 == 6102) {
                field2494[field2481++] = class301.field3698.method131(class651.field9191, -2) ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field2494[field2481++] = class301.field3698.field6637 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field2494[field2481++] = class301.field3698.field6646 ? 1 : 0;
                return;
            }
            if (arg0 == 6106) {
                field2494[field2481++] = class301.field3698.field6630 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field2494[field2481++] = class301.field3698.field6610;
                return;
            }
            if (arg0 == 6108) {
                field2494[field2481++] = class301.field3698.field6618 ? 1 : 0;
                return;
            }
            if (arg0 == 6109) {
                field2494[field2481++] = class301.field3698.field6621 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field2494[field2481++] = class301.field3698.field6613 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field2494[field2481++] = class301.field3698.method2703(class651.field9191, -110);
                return;
            }
            if (arg0 == 6112) {
                field2494[field2481++] = class301.field3698.method2700(-126, class651.field9191) ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field2494[field2481++] = class301.field3698.field6631 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field2494[field2481++] = class301.field3698.field6609 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field2494[field2481++] = class301.field3698.field6645;
                return;
            }
            if (arg0 == 6117) {
                field2494[field2481++] = class301.field3698.field6612 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field2494[field2481++] = class301.field3698.field6628;
                return;
            }
            if (arg0 == 6119) {
                field2494[field2481++] = class301.field3698.field6633;
                return;
            }
            if (arg0 == 6120) {
                field2494[field2481++] = class301.field3698.field6644;
                return;
            }
            if (arg0 == 6121) {
                field2494[field2481++] = class32.field452.method985() ? 1 : 0;
                return;
            }
            if (arg0 == 6123) {
                field2494[field2481++] = class164.method936(0);
                return;
            }
            if (arg0 == 6124) {
                field2494[field2481++] = class301.field3698.field6638;
                return;
            }
            if (arg0 == 6125) {
                field2494[field2481++] = class301.field3698.field6606;
                return;
            }
            if (arg0 == 6126) {
                field2494[field2481++] = class32.field452.method1049() ? 1 : 0;
                return;
            }
            if (arg0 == 6127) {
                field2494[field2481++] = class301.field3698.field6648 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field2494[field2481++] = class301.field3698.field6629 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field2494[field2481++] = class301.field3698.field6610;
                return;
            }
            if (arg0 == 6130) {
                field2494[field2481++] = class301.field3698.field6636 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field2494[field2481++] = class651.field9191;
                return;
            }
            if (arg0 == 6132) {
                field2494[field2481++] = class301.field3698.field6632;
                return;
            }
            if (arg0 == 6133) {
                field2494[field2481++] = class590.field8289.field9151 && !class590.field8289.field9138 ? 1 : 0;
                return;
            }
            if (arg0 == 6134) {
                field2494[field2481++] = class557.method3066(-77, class380.field4801);
                return;
            }
            if (arg0 == 6135) {
                field2494[field2481++] = class301.field3698.field6617;
                return;
            }
            if (arg0 == 6136) {
                field2494[field2481++] = class301.field3698.field6604 ? 1 : 0;
                return;
            }
            if (arg0 == 6137) {
                boolean var235 = true;
                try {
                    var235 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                } catch (Throwable var321) {
                }
                field2494[field2481++] = var235 ? 1 : 0;
                return;
            }
            if (arg0 == 6138) {
                field2494[field2481++] = class3.method33(class651.field9191, (byte) -128, 200);
                return;
            }
            if (arg0 == 6139) {
                field2494[field2481++] = class301.field3698.method136(class651.field9191, (byte) 121);
                return;
            }
            if (arg0 == 6140) {
                byte var236 = 0;
                if (class697.method3923(-1, class651.field9191) && class380.field4801 < 96) {
                    var236 = 1;
                }
                field2494[field2481++] = var236;
                return;
            }
            if (arg0 == 6141) {
                if (class380.field4801 < 96) {
                    field2494[field2481++] = 0;
                    return;
                }
                field2494[field2481++] = 2;
                return;
            }
            if (arg0 == 6142) {
                field2494[field2481++] = class301.field3698.field6635;
                return;
            }
            if (arg0 == 6143) {
                field2494[field2481++] = class301.field3698.field6641;
                return;
            }
            if (arg0 == 6144) {
                field2494[field2481++] = class527.field7136 ? 1 : 0;
                return;
            }
            if (arg0 == 6145) {
                field2494[field2481++] = class301.field3698.field6619;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field2481 -= 2;
                class149.field1922 = (short) field2494[field2481];
                if (class149.field1922 <= 0) {
                    class149.field1922 = 256;
                }
                class537.field7219 = (short) field2494[field2481 + 1];
                if (class537.field7219 <= 0) {
                    class537.field7219 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field2481 -= 2;
                class430.field5384 = (short) field2494[field2481];
                if (class430.field5384 <= 0) {
                    class430.field5384 = 256;
                }
                class525.field7130 = (short) field2494[field2481 + 1];
                if (class525.field7130 <= 0) {
                    class525.field7130 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field2481 -= 4;
                class509.field6891 = (short) field2494[field2481];
                if (class509.field6891 <= 0) {
                    class509.field6891 = 1;
                }
                class611.field8574 = (short) field2494[field2481 + 1];
                if (class611.field8574 <= 0) {
                    class611.field8574 = 32767;
                } else if (class611.field8574 < class509.field6891) {
                    class611.field8574 = class509.field6891;
                }
                class127.field1593 = (short) field2494[field2481 + 2];
                if (class127.field1593 <= 0) {
                    class127.field1593 = 1;
                }
                class504.field6671 = (short) field2494[field2481 + 3];
                if (class504.field6671 <= 0) {
                    class504.field6671 = 32767;
                    return;
                }
                if (class504.field6671 < class127.field1593) {
                    class504.field6671 = class127.field1593;
                }
                return;
            }
            if (arg0 == 6203) {
                class561.method3083(class31.field443.field6700, 0, -16777216, 0, class31.field443.field6793, false);
                field2494[field2481++] = class396.field4997;
                field2494[field2481++] = class475.field6029;
                return;
            }
            if (arg0 == 6204) {
                field2494[field2481++] = class430.field5384;
                field2494[field2481++] = class525.field7130;
                return;
            }
            if (arg0 == 6205) {
                field2494[field2481++] = class149.field1922;
                field2494[field2481++] = class537.field7219;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field2494[field2481++] = (int) (class571.method3150(115) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field2494[field2481++] = (int) (class571.method3150(96) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field2481 -= 3;
                int var237 = field2494[field2481];
                int var238 = field2494[field2481 + 1];
                int var239 = field2494[field2481 + 2];
                field2487.clear();
                field2487.set(11, 12);
                field2487.set(var239, var238, var237);
                int var240 = (int) (field2487.getTime().getTime() / 86400000L) - 11745;
                if (var239 < 1970) {
                    var240--;
                }
                field2494[field2481++] = var240;
                return;
            }
            if (arg0 == 6303) {
                field2487.clear();
                field2487.setTime(new Date(class571.method3150(113)));
                field2494[field2481++] = field2487.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var241 = field2494[--field2481];
                boolean var242 = true;
                if (var241 < 0) {
                    var242 = (var241 + 1) % 4 == 0;
                } else if (var241 < 1582) {
                    var242 = var241 % 4 == 0;
                } else if (var241 % 4 != 0) {
                    var242 = false;
                } else if (var241 % 100 != 0) {
                    var242 = true;
                } else if (var241 % 400 != 0) {
                    var242 = false;
                }
                field2494[field2481++] = var242 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field2494[field2481++] = class639.method3575((byte) 124) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field2494[field2481++] = class146.method844(103) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class504.field6675 == 7 && class367.field4671 == 0 && class82.field1097 == 0) {
                    if (class68.field933) {
                        field2494[field2481++] = 0;
                        return;
                    }
                    if (class374.field4710 > class571.method3150(125) - 1000L) {
                        field2494[field2481++] = 1;
                        return;
                    }
                    class68.field933 = true;
                    class704 var243 = class314.method1820(class406.field5081, class400.field5014, (byte) -100);
                    var243.field9929.method3464(class195.field2456, -100);
                    class122.method654(var243, (byte) -36);
                    field2494[field2481++] = 0;
                    return;
                }
                field2494[field2481++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class532 var244 = class350.method1931(6684);
                if (var244 != null) {
                    field2494[field2481++] = var244.field7180;
                    field2494[field2481++] = var244.field2905;
                    field2488[field2479++] = var244.field7183;
                    class11 var245 = var244.method2889((byte) 123);
                    field2494[field2481++] = var245.field194;
                    field2488[field2479++] = var245.field193;
                    field2494[field2481++] = var244.field2901;
                    field2494[field2481++] = var244.field7177;
                    field2488[field2479++] = var244.field7178;
                    return;
                }
                field2494[field2481++] = -1;
                field2494[field2481++] = 0;
                field2488[field2479++] = "";
                field2494[field2481++] = 0;
                field2488[field2479++] = "";
                field2494[field2481++] = 0;
                field2494[field2481++] = 0;
                field2488[field2479++] = "";
                return;
            }
            if (arg0 == 6502) {
                class532 var246 = class280.method1587(55);
                if (var246 != null) {
                    field2494[field2481++] = var246.field7180;
                    field2494[field2481++] = var246.field2905;
                    field2488[field2479++] = var246.field7183;
                    class11 var247 = var246.method2889((byte) 126);
                    field2494[field2481++] = var247.field194;
                    field2488[field2479++] = var247.field193;
                    field2494[field2481++] = var246.field2901;
                    field2494[field2481++] = var246.field7177;
                    field2488[field2479++] = var246.field7178;
                    return;
                }
                field2494[field2481++] = -1;
                field2494[field2481++] = 0;
                field2488[field2479++] = "";
                field2494[field2481++] = 0;
                field2488[field2479++] = "";
                field2494[field2481++] = 0;
                field2494[field2481++] = 0;
                field2488[field2479++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var248 = field2494[--field2481];
                String var249 = field2488[--field2479];
                if (class504.field6675 == 7 && class367.field4671 == 0 && class82.field1097 == 0) {
                    field2494[field2481++] = class168.method962(var248, var249, 55) ? 1 : 0;
                    return;
                }
                field2494[field2481++] = 0;
                return;
            }
            if (arg0 == 6504) {
                class301.field3698.field6605 = field2494[--field2481];
                class301.field3698.method138(class590.field8289, (byte) 95);
                return;
            }
            if (arg0 == 6505) {
                field2494[field2481++] = class301.field3698.field6605;
                return;
            }
            if (arg0 == 6506) {
                int var250 = field2494[--field2481];
                class532 var251 = class537.method2915(var250, true);
                if (var251 != null) {
                    field2494[field2481++] = var251.field2905;
                    field2488[field2479++] = var251.field7183;
                    class11 var252 = var251.method2889((byte) 121);
                    field2494[field2481++] = var252.field194;
                    field2488[field2479++] = var252.field193;
                    field2494[field2481++] = var251.field2901;
                    field2494[field2481++] = var251.field7177;
                    field2488[field2479++] = var251.field7178;
                    return;
                }
                field2494[field2481++] = -1;
                field2488[field2479++] = "";
                field2494[field2481++] = 0;
                field2488[field2479++] = "";
                field2494[field2481++] = 0;
                field2494[field2481++] = 0;
                field2488[field2479++] = "";
                return;
            }
            if (arg0 == 6507) {
                field2481 -= 4;
                int var253 = field2494[field2481];
                boolean var254 = field2494[field2481 + 1] == 1;
                int var255 = field2494[field2481 + 2];
                boolean var256 = field2494[field2481 + 3] == 1;
                class36.method226((byte) -25, var253, var254, var255, var256);
                return;
            }
            if (arg0 == 6508) {
                class13.method105((byte) -29);
                return;
            }
            if (arg0 == 6509) {
                if (class504.field6675 != 7) {
                    return;
                }
                class691.field9783 = field2494[--field2481] == 1;
                return;
            }
            if (arg0 == 6510) {
                field2494[field2481++] = class89.field1237;
                return;
            }
        } else if (arg0 < 6700) {
            if (arg0 == 6600) {
                class301.field3698.field6607 = field2494[--field2481] == 1;
                class301.field3698.method138(class590.field8289, (byte) 36);
                return;
            }
            if (arg0 == 6601) {
                field2494[field2481++] = class301.field3698.field6607 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6800 && class356.field4534 == class325.field4177) {
            if (arg0 == 6700) {
                int var257 = class138.field1797.method404((byte) -26);
                if (class316.field4063 != -1) {
                    var257++;
                }
                field2494[field2481++] = var257;
                return;
            }
            if (arg0 == 6701) {
                int var258 = field2494[--field2481];
                if (class316.field4063 != -1) {
                    if (var258 == 0) {
                        field2494[field2481++] = class316.field4063;
                        return;
                    }
                    var258--;
                }
                class340 var259 = (class340) class138.field1797.method407((byte) 124);
                while (var258-- > 0) {
                    var259 = (class340) class138.field1797.method403(12561);
                }
                field2494[field2481++] = var259.field4392;
                return;
            }
            if (arg0 == 6702) {
                int var260 = field2494[--field2481];
                if (class103.field1390[var260] == null) {
                    field2488[field2479++] = "";
                    return;
                }
                String var261 = class103.field1390[var260][0].field6784;
                if (var261 == null) {
                    field2488[field2479++] = "";
                    return;
                }
                field2488[field2479++] = var261.substring(0, var261.indexOf(58));
                return;
            }
            if (arg0 == 6703) {
                int var262 = field2494[--field2481];
                if (class103.field1390[var262] == null) {
                    field2494[field2481++] = 0;
                    return;
                }
                field2494[field2481++] = class103.field1390[var262].length;
                return;
            }
            if (arg0 == 6704) {
                field2481 -= 2;
                int var263 = field2494[field2481];
                int var264 = field2494[field2481 + 1];
                if (class103.field1390[var263] == null) {
                    field2488[field2479++] = "";
                    return;
                }
                String var265 = class103.field1390[var263][var264].field6784;
                if (var265 == null) {
                    field2488[field2479++] = "";
                    return;
                }
                field2488[field2479++] = var265;
                return;
            }
            if (arg0 == 6705) {
                field2481 -= 2;
                int var266 = field2494[field2481];
                int var267 = field2494[field2481 + 1];
                if (class103.field1390[var266] == null) {
                    field2494[field2481++] = 0;
                    return;
                }
                field2494[field2481++] = class103.field1390[var266][var267].field6804;
                return;
            }
            if (arg0 == 6706) {
                return;
            }
            if (arg0 == 6707) {
                field2481 -= 3;
                int var268 = field2494[field2481];
                int var269 = field2494[field2481 + 1];
                int var270 = field2494[field2481 + 2];
                class430.method2273(var270, 18365, 1, "", var268 << 16 | var269);
                return;
            }
            if (arg0 == 6708) {
                field2481 -= 3;
                int var271 = field2494[field2481];
                int var272 = field2494[field2481 + 1];
                int var273 = field2494[field2481 + 2];
                class430.method2273(var273, 18365, 2, "", var271 << 16 | var272);
                return;
            }
            if (arg0 == 6709) {
                field2481 -= 3;
                int var274 = field2494[field2481];
                int var275 = field2494[field2481 + 1];
                int var276 = field2494[field2481 + 2];
                class430.method2273(var276, 18365, 3, "", var274 << 16 | var275);
                return;
            }
            if (arg0 == 6710) {
                field2481 -= 3;
                int var277 = field2494[field2481];
                int var278 = field2494[field2481 + 1];
                int var279 = field2494[field2481 + 2];
                class430.method2273(var279, 18365, 4, "", var277 << 16 | var278);
                return;
            }
            if (arg0 == 6711) {
                field2481 -= 3;
                int var280 = field2494[field2481];
                int var281 = field2494[field2481 + 1];
                int var282 = field2494[field2481 + 2];
                class430.method2273(var282, 18365, 5, "", var280 << 16 | var281);
                return;
            }
            if (arg0 == 6712) {
                field2481 -= 3;
                int var283 = field2494[field2481];
                int var284 = field2494[field2481 + 1];
                int var285 = field2494[field2481 + 2];
                class430.method2273(var285, 18365, 6, "", var283 << 16 | var284);
                return;
            }
            if (arg0 == 6713) {
                field2481 -= 3;
                int var286 = field2494[field2481];
                int var287 = field2494[field2481 + 1];
                int var288 = field2494[field2481 + 2];
                class430.method2273(var288, 18365, 7, "", var286 << 16 | var287);
                return;
            }
            if (arg0 == 6714) {
                field2481 -= 3;
                int var289 = field2494[field2481];
                int var290 = field2494[field2481 + 1];
                int var291 = field2494[field2481 + 2];
                class430.method2273(var291, 18365, 8, "", var289 << 16 | var290);
                return;
            }
            if (arg0 == 6715) {
                field2481 -= 3;
                int var292 = field2494[field2481];
                int var293 = field2494[field2481 + 1];
                int var294 = field2494[field2481 + 2];
                class430.method2273(var294, 18365, 9, "", var292 << 16 | var293);
                return;
            }
            if (arg0 == 6716) {
                field2481 -= 3;
                int var295 = field2494[field2481];
                int var296 = field2494[field2481 + 1];
                int var297 = field2494[field2481 + 2];
                class430.method2273(var297, 18365, 10, "", var295 << 16 | var296);
                return;
            }
            if (arg0 == 6717) {
                field2481 -= 3;
                int var298 = field2494[field2481];
                int var299 = field2494[field2481 + 1];
                int var300 = field2494[field2481 + 2];
                class507 var301 = class138.method795(var298 << 16 | var299, var300, (byte) 47);
                class476.method2518((byte) 31);
                class369 var302 = client.method3819(var301);
                class359.method1978(0, var301, var302.method2018(-1035661311), var302.field4683);
                return;
            }
        } else if (arg0 < 6900) {
            if (arg0 == 6800) {
                int var303 = field2494[--field2481];
                class647 var304 = class556.field7727.method3771(var303, -83);
                if (var304.field9106 == null) {
                    field2488[field2479++] = "";
                    return;
                }
                field2488[field2479++] = var304.field9106;
                return;
            }
            if (arg0 == 6801) {
                int var305 = field2494[--field2481];
                class647 var306 = class556.field7727.method3771(var305, 108);
                field2494[field2481++] = var306.field9127;
                return;
            }
            if (arg0 == 6802) {
                int var307 = field2494[--field2481];
                class647 var308 = class556.field7727.method3771(var307, 65);
                field2494[field2481++] = var308.field9094;
                return;
            }
            if (arg0 == 6803) {
                int var309 = field2494[--field2481];
                class647 var310 = class556.field7727.method3771(var309, 16);
                field2494[field2481++] = var310.field9118;
                return;
            }
            if (arg0 == 6804) {
                field2481 -= 2;
                int var311 = field2494[field2481];
                int var312 = field2494[field2481 + 1];
                class207 var313 = class705.field9939.method2477((byte) 6, var312);
                if (var313.method1245(0)) {
                    field2488[field2479++] = class556.field7727.method3771(var311, 0).method3616(124, var313.field2632, var312);
                    return;
                }
                field2494[field2481++] = class556.field7727.method3771(var311, 123).method3623((byte) 26, var312, var313.field2627);
                return;
            }
        } else if (arg0 < 7000) {
            if (arg0 == 6900) {
                field2494[field2481++] = class242.field3012 && !class450.field5747 ? 1 : 0;
                return;
            }
            if (arg0 == 6901) {
                field2494[field2481++] = class567.field7931;
                return;
            }
            if (arg0 == 6902) {
                field2494[field2481++] = class86.field1211;
                return;
            }
            if (arg0 == 6903) {
                field2494[field2481++] = class10.field189;
                return;
            }
            if (arg0 == 6904) {
                field2494[field2481++] = class362.field4609;
                return;
            }
            if (arg0 == 6905) {
                String var314 = "";
                if (class595.field8377 != null) {
                    if (class595.field8377.field3356 == null) {
                        var314 = class7.method60((byte) 82, class595.field8377.field3354);
                    } else {
                        var314 = (String) class595.field8377.field3356;
                    }
                }
                field2488[field2479++] = var314;
                return;
            }
            if (arg0 == 6906) {
                field2494[field2481++] = class361.field4593;
                return;
            }
            if (arg0 == 6907) {
                field2494[field2481++] = class209.field2634;
                return;
            }
            if (arg0 == 6908) {
                field2494[field2481++] = class124.field1564;
                return;
            }
            if (arg0 == 6909) {
                field2494[field2481++] = class598.field8399 ? 1 : 0;
                return;
            }
            if (arg0 == 6910) {
                field2494[field2481++] = class83.field1172;
                return;
            }
            if (arg0 == 6911) {
                field2494[field2481++] = class636.field8928;
                return;
            }
            if (arg0 == 6912) {
                field2494[field2481++] = class350.field4466;
                return;
            }
        } else if (arg0 < 7100) {
            if (arg0 == 7000) {
                int var315 = class301.field3698.method137((byte) 109);
                field2494[field2481++] = class301.field3698.field295 = class651.field9191;
                field2494[field2481++] = var315;
                class626.method3443((byte) -107);
                class301.field3698.method138(class590.field8289, (byte) 77);
                class206.field2617 = false;
                return;
            }
            if (arg0 == 7001) {
                class301.field3698.method141(119);
                class626.method3443((byte) -9);
                class301.field3698.method138(class590.field8289, (byte) 32);
                class206.field2617 = false;
                return;
            }
            if (arg0 == 7002) {
                class301.field3698.method130(-29520);
                class626.method3443((byte) -117);
                class301.field3698.method138(class590.field8289, (byte) 90);
                class206.field2617 = false;
                return;
            }
            if (arg0 == 7003) {
                class301.field3698.method139(false);
                class626.method3443((byte) 77);
                class301.field3698.method138(class590.field8289, (byte) 97);
                class206.field2617 = false;
                return;
            }
            if (arg0 == 7004) {
                class301.field3698.method145(true, (byte) -56);
                class626.method3443((byte) -113);
                class301.field3698.method138(class590.field8289, (byte) 120);
                class206.field2617 = false;
                return;
            }
            if (arg0 == 7005) {
                class301.field3698.field6643 = 0;
                class301.field3698.method138(class590.field8289, (byte) 33);
                class206.field2617 = false;
                return;
            }
            if (arg0 == 7006) {
                if (class301.field3698.field295 == 2) {
                    class301.field3698.field315 = true;
                    return;
                }
                if (class301.field3698.field295 == 1) {
                    class301.field3698.field309 = true;
                    return;
                }
                if (class301.field3698.field295 == 3) {
                    class301.field3698.field299 = true;
                }
                return;
            }
            if (arg0 == 7007) {
                field2494[field2481++] = class301.field3698.field6643;
                return;
            }
            if (arg0 == 7008) {
                if (class651.field9191 == 0 && class380.field4801 < 96) {
                    field2494[field2481++] = 1;
                    return;
                }
                field2494[field2481++] = 4;
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!uw", name = "c", descriptor = "(I)V", line = 3994)
    private static final void method1193(int arg0) {
        class507 var1 = class156.method894(-1018745488, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class507[] var3 = class688.field9760[var2];
        if (var3 == null) {
            class507[] var4 = class103.field1390[var2];
            int var5 = var4.length;
            var3 = class688.field9760[var2] = new class507[var5];
            class293.method1639(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class293.method1639(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(Lit;I)V", line = 4044)
    private static final void method1194(class517 arg0, int arg1) {
        field2481 = 0;
        field2479 = 0;
        int var2 = -1;
        int[] var3 = arg0.field7060;
        int[] var4 = arg0.field7054;
        byte var5 = -1;
        field2473 = 0;
        try {
            int var6 = 0;
            label260: while (true) {
                var6++;
                if (var6 > arg1) {
                    throw new RuntimeException("slow");
                }
                var2++;
                int var43 = var3[var2];
                if (var43 >= 100) {
                    boolean var35;
                    if (var4[var2] == 1) {
                        var35 = true;
                    } else {
                        var35 = false;
                    }
                    if (var43 >= 100 && var43 < 5000) {
                        method1196(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method1192(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field2494[field2481++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field2494[field2481++] = class684.field9606.field2467[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class684.field9606.method1180(true, field2494[--field2481], var8);
                } else if (var43 == 3) {
                    field2488[field2479++] = arg0.field7064[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field2481 -= 2;
                    if (field2494[field2481 + 1] != field2494[field2481]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field2481 -= 2;
                    if (field2494[field2481 + 1] == field2494[field2481]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field2481 -= 2;
                    if (field2494[field2481] < field2494[field2481 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field2481 -= 2;
                    if (field2494[field2481] > field2494[field2481 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field2473 == 0) {
                        return;
                    }
                    class194 var9 = field2475[--field2473];
                    arg0 = var9.field2435;
                    var3 = arg0.field7060;
                    var4 = arg0.field7054;
                    var2 = var9.field2436;
                    field2489 = var9.field2439;
                    field2493 = var9.field2437;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field2494[field2481++] = class684.field9606.method465(121, var10);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class684.field9606.method1183(var11, field2494[--field2481], 16383);
                } else if (var43 == 31) {
                    field2481 -= 2;
                    if (field2494[field2481] <= field2494[field2481 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field2481 -= 2;
                    if (field2494[field2481] >= field2494[field2481 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field2494[field2481++] = field2489[var4[var2]];
                } else if (var43 == 34) {
                    field2489[var4[var2]] = field2494[--field2481];
                } else if (var43 == 35) {
                    field2488[field2479++] = field2493[var4[var2]];
                } else if (var43 == 36) {
                    field2493[var4[var2]] = field2488[--field2479];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field2479 -= var12;
                    String var13 = class280.method1589(field2488, var12, 4, field2479);
                    field2488[field2479++] = var13;
                } else if (var43 == 38) {
                    field2481--;
                } else if (var43 == 39) {
                    field2479--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class517 var15 = class505.method2718(var14, true);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field7058];
                    String[] var17 = new String[var15.field7059];
                    for (int var18 = 0; var18 < var15.field7056; var18++) {
                        var16[var18] = field2494[field2481 + var18 - var15.field7056];
                    }
                    for (int var19 = 0; var19 < var15.field7051; var19++) {
                        var17[var19] = field2488[field2479 + var19 - var15.field7051];
                    }
                    field2481 -= var15.field7056;
                    field2479 -= var15.field7051;
                    class194 var20 = new class194();
                    var20.field2435 = arg0;
                    var20.field2436 = var2;
                    var20.field2439 = field2489;
                    var20.field2437 = field2493;
                    if (field2473 >= field2475.length) {
                        throw new RuntimeException();
                    }
                    field2475[field2473++] = var20;
                    arg0 = var15;
                    var3 = var15.field7060;
                    var4 = var15.field7054;
                    var2 = -1;
                    field2489 = var16;
                    field2493 = var17;
                } else if (var43 == 42) {
                    field2494[field2481++] = class412.field5150[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class412.field5150[var21] = field2494[--field2481];
                    class138.method793((byte) 93, var21);
                    class665.field9381 |= class287.field3574[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field2494[--field2481];
                    if (var24 >= 0 && var24 <= 5000) {
                        field2484[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label260;
                            }
                            field2476[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field2494[--field2481];
                    if (var28 < 0 || var28 >= field2484[var27]) {
                        throw new RuntimeException();
                    }
                    field2494[field2481++] = field2476[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field2481 -= 2;
                    int var30 = field2494[field2481];
                    if (var30 < 0 || var30 >= field2484[var29]) {
                        throw new RuntimeException();
                    }
                    field2476[var29][var30] = field2494[field2481 + 1];
                } else if (var43 == 47) {
                    String var31 = client.field9541[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field2488[field2479++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    client.field9541[var32] = field2488[--field2479];
                    class650.method3649(var32, (byte) -126);
                } else if (var43 == 51) {
                    class68 var33 = arg0.field7057[var4[var2]];
                    class262 var34 = (class262) var33.method399(-32748, (long) field2494[--field2481]);
                    if (var34 != null) {
                        var2 += var34.field3229;
                    }
                }
            }
        } catch (Exception var42) {
            if (arg0.field7066 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field4199).append(" ");
                for (int var41 = field2473 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field2475[var41].field2435.field4199).append(" ");
                }
                var40.append("op: ").append(var5);
                class106.method597(var40.toString(), -2, var42);
            } else {
                class250.method1468(4, false, "Clientscript error in: " + arg0.field7066);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field7066).append("\n");
                for (int var38 = field2473 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field2475[var38].field2435.field7066).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class106.method597(var37.toString(), -2, var42);
                class193.method1171(4, var37.toString());
            }
        }
    }

    @OriginalMember(owner = "client!uw", name = "d", descriptor = "(I)Ljava/lang/String;", line = 4474)
    private static final String method1195(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field2487.setTime(new Date(var1));
        int var3 = field2487.get(5);
        int var4 = field2487.get(2);
        int var5 = field2487.get(1);
        return var3 + "-" + field2499[var4] + "-" + var5;
    }

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "(IZ)V", line = 4488)
    private static final void method1196(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field2481 -= 3;
                int var2 = field2494[field2481];
                int var3 = field2494[field2481 + 1];
                int var4 = field2494[field2481 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class507 var5 = class156.method894(-1018745488, var2);
                if (var5.field6707 == null) {
                    var5.field6707 = new class507[var4 + 1];
                }
                if (var5.field6707.length <= var4) {
                    class507[] var6 = new class507[var4 + 1];
                    for (int var7 = 0; var7 < var5.field6707.length; var7++) {
                        var6[var7] = var5.field6707[var7];
                    }
                    var5.field6707 = var6;
                }
                if (var4 > 0 && var5.field6707[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class507 var8 = new class507();
                var8.field6735 = var3;
                var8.field6719 = var8.field6764 = var5.field6764;
                var8.field6834 = var4;
                var5.field6707[var4] = var8;
                if (arg1) {
                    field2485 = var8;
                } else {
                    field2495 = var8;
                }
                class572.method3158(var5, 1023);
                return;
            }
            if (arg0 == 101) {
                class507 var9 = arg1 ? field2485 : field2495;
                if (var9.field6834 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class507 var10 = class156.method894(-1018745488, var9.field6764);
                var10.field6707[var9.field6834] = null;
                class572.method3158(var10, 1023);
                return;
            }
            if (arg0 == 102) {
                class507 var11 = class156.method894(-1018745488, field2494[--field2481]);
                var11.field6707 = null;
                class572.method3158(var11, 1023);
                return;
            }
            if (arg0 == 200) {
                field2481 -= 2;
                int var12 = field2494[field2481];
                int var13 = field2494[field2481 + 1];
                class507 var14 = class138.method795(var12, var13, (byte) 78);
                if (var14 != null && var13 != -1) {
                    field2494[field2481++] = 1;
                    if (arg1) {
                        field2485 = var14;
                        return;
                    }
                    field2495 = var14;
                    return;
                }
                field2494[field2481++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field2494[--field2481];
                class507 var16 = class156.method894(-1018745488, var15);
                if (var16 != null) {
                    field2494[field2481++] = 1;
                    if (arg1) {
                        field2485 = var16;
                        return;
                    }
                    field2495 = var16;
                    return;
                }
                field2494[field2481++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field2494[--field2481];
                method1193(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field2494[--field2481];
                method1190(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field2481 -= 2;
                int var19 = field2494[field2481];
                int var20 = field2494[field2481 + 1];
                for (int var21 = 0; var21 < class20.field300.length; var21++) {
                    if (class20.field300[var21] == var19) {
                        class376.field4748.field7008.method2686(var21, var20, class40.field540, -108);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class16.field267.length; var22++) {
                    if (class16.field267[var22] == var19) {
                        class376.field4748.field7008.method2686(var22, var20, class40.field540, -44);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field2481 -= 2;
                int var23 = field2494[field2481];
                int var24 = field2494[field2481 + 1];
                class376.field4748.field7008.method2678(var24, var23, 31622);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field2494[--field2481] != 0;
                class376.field4748.field7008.method2685(var25, -23851);
                return;
            }
            if (arg0 == 411) {
                field2481 -= 2;
                int var26 = field2494[field2481];
                int var27 = field2494[field2481 + 1];
                class376.field4748.field7008.method2684(var27, var26, class633.field8881, true);
                return;
            }
        } else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
            class507 var28;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var28 = class156.method894(-1018745488, field2494[--field2481]);
            } else {
                var28 = arg1 ? field2485 : field2495;
            }
            if (arg0 == 1000) {
                field2481 -= 4;
                var28.field6810 = field2494[field2481];
                var28.field6851 = field2494[field2481 + 1];
                int var29 = field2494[field2481 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 5) {
                    var29 = 5;
                }
                int var30 = field2494[field2481 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 5) {
                    var30 = 5;
                }
                var28.field6862 = (byte) var29;
                var28.field6751 = (byte) var30;
                class572.method3158(var28, 1023);
                class378.method2055((byte) -125, var28);
                if (var28.field6834 == -1) {
                    class341.method1908(var28.field6764, 11);
                }
                return;
            }
            if (arg0 == 1001) {
                field2481 -= 4;
                var28.field6823 = field2494[field2481];
                var28.field6706 = field2494[field2481 + 1];
                var28.field6712 = 0;
                var28.field6806 = 0;
                int var31 = field2494[field2481 + 2];
                if (var31 < 0) {
                    var31 = 0;
                } else if (var31 > 4) {
                    var31 = 4;
                }
                int var32 = field2494[field2481 + 3];
                if (var32 < 0) {
                    var32 = 0;
                } else if (var32 > 4) {
                    var32 = 4;
                }
                var28.field6704 = (byte) var31;
                var28.field6713 = (byte) var32;
                class572.method3158(var28, 1023);
                class378.method2055((byte) -125, var28);
                if (var28.field6735 == 0) {
                    class285.method1605(var28, false, false);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var33 = field2494[--field2481] == 1;
                if (var28.field6859 != var33) {
                    var28.field6859 = var33;
                    class572.method3158(var28, 1023);
                }
                if (var28.field6834 == -1) {
                    class404.method2150(var28.field6764, (byte) 75);
                }
                return;
            }
            if (arg0 == 1004) {
                field2481 -= 2;
                var28.field6794 = field2494[field2481];
                var28.field6849 = field2494[field2481 + 1];
                class572.method3158(var28, 1023);
                class378.method2055((byte) -121, var28);
                if (var28.field6735 == 0) {
                    class285.method1605(var28, false, false);
                }
                return;
            }
            if (arg0 == 1005) {
                var28.field6824 = field2494[--field2481] == 1;
                return;
            }
        } else if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
            class507 var34;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var34 = class156.method894(-1018745488, field2494[--field2481]);
            } else {
                var34 = arg1 ? field2485 : field2495;
            }
            if (arg0 == 1100) {
                field2481 -= 2;
                var34.field6785 = field2494[field2481];
                if (var34.field6785 > var34.field6816 - var34.field6793) {
                    var34.field6785 = var34.field6816 - var34.field6793;
                }
                if (var34.field6785 < 0) {
                    var34.field6785 = 0;
                }
                var34.field6769 = field2494[field2481 + 1];
                if (var34.field6769 > var34.field6852 - var34.field6700) {
                    var34.field6769 = var34.field6852 - var34.field6700;
                }
                if (var34.field6769 < 0) {
                    var34.field6769 = 0;
                }
                class572.method3158(var34, 1023);
                if (var34.field6834 == -1) {
                    class3.method28(var34.field6764, -10095);
                }
                return;
            }
            if (arg0 == 1101) {
                var34.field6710 = field2494[--field2481];
                class572.method3158(var34, 1023);
                if (var34.field6834 == -1) {
                    class577.method3180((byte) -43, var34.field6764);
                }
                return;
            }
            if (arg0 == 1102) {
                var34.field6701 = field2494[--field2481] == 1;
                class572.method3158(var34, 1023);
                return;
            }
            if (arg0 == 1103) {
                var34.field6763 = field2494[--field2481];
                class572.method3158(var34, 1023);
                return;
            }
            if (arg0 == 1104) {
                var34.field6748 = field2494[--field2481];
                class572.method3158(var34, 1023);
                return;
            }
            if (arg0 == 1105) {
                int var35 = field2494[--field2481];
                if (var34.field6783 != var35) {
                    var34.field6783 = var35;
                    class572.method3158(var34, 1023);
                }
                if (var34.field6834 == -1) {
                    class344.method1916(var34.field6764, true);
                }
                return;
            }
            if (arg0 == 1106) {
                var34.field6754 = field2494[--field2481];
                class572.method3158(var34, 1023);
                return;
            }
            if (arg0 == 1107) {
                var34.field6864 = field2494[--field2481] == 1;
                class572.method3158(var34, 1023);
                return;
            }
            if (arg0 == 1108) {
                var34.field6714 = 1;
                var34.field6798 = field2494[--field2481];
                class572.method3158(var34, 1023);
                if (var34.field6834 == -1) {
                    class554.method3057(-1, var34.field6764);
                }
                return;
            }
            if (arg0 == 1109) {
                field2481 -= 6;
                var34.field6833 = field2494[field2481];
                var34.field6825 = field2494[field2481 + 1];
                var34.field6813 = field2494[field2481 + 2];
                var34.field6799 = field2494[field2481 + 3];
                var34.field6867 = field2494[field2481 + 4];
                var34.field6850 = field2494[field2481 + 5];
                class572.method3158(var34, 1023);
                if (var34.field6834 == -1) {
                    class462.method2459(var34.field6764, -23477);
                    class182.method1137(var34.field6764, 112);
                }
                return;
            }
            if (arg0 == 1110) {
                int var36 = field2494[--field2481];
                if (var34.field6746 != var36) {
                    var34.field6746 = var36;
                    var34.field6717 = 0;
                    var34.field6820 = 1;
                    var34.field6742 = 0;
                    class395 var37 = var34.field6746 == -1 ? null : class583.field8149.method1844(64, var34.field6746);
                    if (var37 != null) {
                        class106.method602(var37, (byte) 84, var34.field6717);
                    }
                    class572.method3158(var34, 1023);
                }
                if (var34.field6834 == -1) {
                    class72.method424(var34.field6764, 0);
                }
                return;
            }
            if (arg0 == 1111) {
                var34.field6721 = field2494[--field2481] == 1;
                class572.method3158(var34, 1023);
                return;
            }
            if (arg0 == 1112) {
                String var38 = field2488[--field2479];
                if (!var38.equals(var34.field6840)) {
                    var34.field6840 = var38;
                    class572.method3158(var34, 1023);
                }
                if (var34.field6834 == -1) {
                    class581.method3204(var34.field6764, true);
                }
                return;
            }
            if (arg0 == 1113) {
                var34.field6777 = field2494[--field2481];
                class572.method3158(var34, 1023);
                if (var34.field6834 == -1) {
                    class593.method3260((byte) 74, var34.field6764);
                }
                return;
            }
            if (arg0 == 1114) {
                field2481 -= 3;
                var34.field6782 = field2494[field2481];
                var34.field6750 = field2494[field2481 + 1];
                var34.field6780 = field2494[field2481 + 2];
                class572.method3158(var34, 1023);
                return;
            }
            if (arg0 == 1115) {
                var34.field6826 = field2494[--field2481] == 1;
                class572.method3158(var34, 1023);
                return;
            }
            if (arg0 == 1116) {
                var34.field6812 = field2494[--field2481];
                class572.method3158(var34, 1023);
                return;
            }
            if (arg0 == 1117) {
                var34.field6843 = field2494[--field2481];
                class572.method3158(var34, 1023);
                return;
            }
            if (arg0 == 1118) {
                var34.field6737 = field2494[--field2481] == 1;
                class572.method3158(var34, 1023);
                return;
            }
            if (arg0 == 1119) {
                var34.field6801 = field2494[--field2481] == 1;
                class572.method3158(var34, 1023);
                return;
            }
            if (arg0 == 1120) {
                field2481 -= 2;
                var34.field6816 = field2494[field2481];
                var34.field6852 = field2494[field2481 + 1];
                class572.method3158(var34, 1023);
                if (var34.field6735 == 0) {
                    class285.method1605(var34, false, false);
                }
                return;
            }
            if (arg0 == 1122) {
                var34.field6774 = field2494[--field2481] == 1;
                class572.method3158(var34, 1023);
                return;
            }
            if (arg0 == 1123) {
                var34.field6850 = field2494[--field2481];
                class572.method3158(var34, 1023);
                if (var34.field6834 == -1) {
                    class462.method2459(var34.field6764, -23477);
                }
                return;
            }
            if (arg0 == 1124) {
                int var39 = field2494[--field2481];
                var34.field6817 = var39 == 1;
                class572.method3158(var34, 1023);
                return;
            }
            if (arg0 == 1125) {
                field2481 -= 2;
                var34.field6772 = field2494[field2481];
                var34.field6732 = field2494[field2481 + 1];
                class572.method3158(var34, 1023);
                return;
            }
            if (arg0 == 1126) {
                var34.field6716 = field2494[--field2481];
                class572.method3158(var34, 1023);
                return;
            }
            if (arg0 == 1127) {
                field2481 -= 2;
                int var40 = field2494[field2481];
                int var41 = field2494[field2481 + 1];
                class207 var42 = class705.field9939.method2477((byte) 6, var40);
                if (var42.field2627 != var41) {
                    var34.method2726((byte) 96, var41, var40);
                    return;
                }
                var34.method2736(var40, (byte) -106);
                return;
            }
            if (arg0 == 1128) {
                int var43 = field2494[--field2481];
                String var44 = field2488[--field2479];
                class207 var45 = class705.field9939.method2477((byte) 6, var43);
                if (!var45.field2632.equals(var44)) {
                    var34.method2724(var43, var44, 100);
                    return;
                }
                var34.method2736(var43, (byte) -106);
                return;
            }
        } else if (!(arg0 < 1200 || arg0 >= 1300) || !(arg0 < 2200 || arg0 >= 2300)) {
            class507 var46;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var46 = class156.method894(-1018745488, field2494[--field2481]);
            } else {
                var46 = arg1 ? field2485 : field2495;
            }
            class572.method3158(var46, 1023);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field2481 -= 2;
                int var47 = field2494[field2481];
                int var48 = field2494[field2481 + 1];
                if (var46.field6834 == -1) {
                    class458.method2448(var46.field6764, true);
                    class462.method2459(var46.field6764, -23477);
                    class182.method1137(var46.field6764, 105);
                }
                if (var47 == -1) {
                    var46.field6714 = 1;
                    var46.field6798 = -1;
                    var46.field6832 = -1;
                    return;
                }
                var46.field6832 = var47;
                var46.field6858 = var48;
                if (arg0 == 1208 || arg0 == 1209) {
                    var46.field6759 = true;
                } else {
                    var46.field6759 = false;
                }
                class3 var49 = class633.field8881.method434(12388, var47);
                var46.field6813 = var49.field49;
                var46.field6799 = var49.field103;
                var46.field6867 = var49.field89;
                var46.field6833 = var49.field68;
                var46.field6825 = var49.field102;
                var46.field6850 = var49.field91;
                if (arg0 == 1205 || arg0 == 1209) {
                    var46.field6846 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var46.field6846 = 1;
                } else {
                    var46.field6846 = 2;
                }
                if (var46.field6712 > 0) {
                    var46.field6850 = var46.field6850 * 32 / var46.field6712;
                    return;
                }
                if (var46.field6823 > 0) {
                    var46.field6850 = var46.field6850 * 32 / var46.field6823;
                }
                return;
            }
            if (arg0 == 1201) {
                var46.field6714 = 2;
                var46.field6798 = field2494[--field2481];
                if (var46.field6834 == -1) {
                    class554.method3057(-1, var46.field6764);
                }
                return;
            }
            if (arg0 == 1202) {
                var46.field6714 = 3;
                var46.field6798 = -1;
                if (var46.field6834 == -1) {
                    class554.method3057(-1, var46.field6764);
                }
                return;
            }
            if (arg0 == 1203) {
                var46.field6714 = 6;
                var46.field6798 = field2494[--field2481];
                if (var46.field6834 == -1) {
                    class554.method3057(-1, var46.field6764);
                }
                return;
            }
            if (arg0 == 1204) {
                var46.field6714 = 5;
                var46.field6798 = field2494[--field2481];
                if (var46.field6834 == -1) {
                    class554.method3057(-1, var46.field6764);
                }
                return;
            }
            if (arg0 == 1206) {
                field2481 -= 4;
                var46.field6827 = field2494[field2481];
                var46.field6723 = field2494[field2481 + 1];
                var46.field6728 = field2494[field2481 + 2];
                var46.field6848 = field2494[field2481 + 3];
                class572.method3158(var46, 1023);
                return;
            }
            if (arg0 == 1207) {
                field2481 -= 2;
                var46.field6809 = field2494[field2481];
                var46.field6802 = field2494[field2481 + 1];
                class572.method3158(var46, 1023);
                return;
            }
            if (arg0 == 1210) {
                field2481 -= 4;
                var46.field6798 = field2494[field2481];
                var46.field6745 = field2494[field2481 + 1];
                if (field2494[field2481 + 2] == 1) {
                    var46.field6714 = 9;
                } else {
                    var46.field6714 = 8;
                }
                if (field2494[field2481 + 3] == 1) {
                    var46.field6759 = true;
                } else {
                    var46.field6759 = false;
                }
                if (var46.field6834 == -1) {
                    class554.method3057(-1, var46.field6764);
                }
                return;
            }
            if (arg0 == 1211) {
                var46.field6714 = 5;
                var46.field6798 = class167.field2200;
                var46.field6745 = 0;
                if (var46.field6834 == -1) {
                    class554.method3057(-1, var46.field6764);
                }
                return;
            }
        } else if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
            class507 var50;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var50 = class156.method894(-1018745488, field2494[--field2481]);
            } else {
                var50 = arg1 ? field2485 : field2495;
            }
            if (arg0 == 1300) {
                int var51 = field2494[--field2481] - 1;
                if (var51 >= 0 && var51 <= 9) {
                    var50.method2723(var51, field2488[--field2479], -114);
                    return;
                }
                field2479--;
                return;
            }
            if (arg0 == 1301) {
                field2481 -= 2;
                int var52 = field2494[field2481];
                int var53 = field2494[field2481 + 1];
                if (var52 == -1 && var53 == -1) {
                    var50.field6860 = null;
                    return;
                }
                var50.field6860 = class138.method795(var52, var53, (byte) 45);
                return;
            }
            if (arg0 == 1302) {
                int var54 = field2494[--field2481];
                if (class405.field5076 != var54 && class398.field5008 != var54 && class415.field5182 != var54) {
                    return;
                }
                var50.field6869 = var54;
                return;
            }
            if (arg0 == 1303) {
                var50.field6722 = field2494[--field2481];
                return;
            }
            if (arg0 == 1304) {
                var50.field6762 = field2494[--field2481];
                return;
            }
            if (arg0 == 1305) {
                var50.field6828 = field2488[--field2479];
                return;
            }
            if (arg0 == 1306) {
                var50.field6731 = field2488[--field2479];
                return;
            }
            if (arg0 == 1307) {
                var50.field6830 = null;
                return;
            }
            if (arg0 == 1308) {
                var50.field6805 = field2494[--field2481];
                var50.field6770 = field2494[--field2481];
                return;
            }
            if (arg0 == 1309) {
                int var55 = field2494[--field2481];
                int var56 = field2494[--field2481];
                if (var56 >= 1 && var56 <= 10) {
                    var50.method2728(0, var56 - 1, var55);
                }
                return;
            }
            if (arg0 == 1310) {
                var50.field6856 = field2488[--field2479];
                return;
            }
            if (arg0 == 1311) {
                var50.field6699 = field2494[--field2481];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var57;
                int var58;
                int var59;
                if (arg0 == 1312) {
                    field2481 -= 3;
                    var57 = field2494[field2481] - 1;
                    var58 = field2494[field2481 + 1];
                    var59 = field2494[field2481 + 2];
                    if (var57 < 0 || var57 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field2481 -= 2;
                    var57 = 10;
                    var58 = field2494[field2481];
                    var59 = field2494[field2481 + 1];
                }
                if (var50.field6771 == null) {
                    if (var58 == 0) {
                        return;
                    }
                    var50.field6771 = new byte[11];
                    var50.field6842 = new byte[11];
                    var50.field6822 = new int[11];
                }
                var50.field6771[var57] = (byte) var58;
                if (var58 == 0) {
                    var50.field6837 = false;
                    for (int var60 = 0; var60 < var50.field6771.length; var60++) {
                        if (var50.field6771[var60] != 0) {
                            var50.field6837 = true;
                            break;
                        }
                    }
                } else {
                    var50.field6837 = true;
                }
                var50.field6842[var57] = (byte) var59;
                return;
            }
            if (arg0 == 1314) {
                var50.field6841 = field2494[--field2481];
                return;
            }
        } else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
            class507 var61;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var61 = class156.method894(-1018745488, field2494[--field2481]);
            } else {
                var61 = arg1 ? field2485 : field2495;
            }
            if (arg0 == 1499) {
                var61.method2722(0);
                return;
            }
            String var62 = field2488[--field2479];
            int[] var63 = null;
            if (var62.length() > 0 && var62.charAt(var62.length() - 1) == 'Y') {
                int var64 = field2494[--field2481];
                if (var64 > 0) {
                    var63 = new int[var64];
                    while (var64-- > 0) {
                        var63[var64] = field2494[--field2481];
                    }
                }
                var62 = var62.substring(0, var62.length() - 1);
            }
            Object[] var65 = new Object[var62.length() + 1];
            for (int var66 = var65.length - 1; var66 >= 1; var66--) {
                if (var62.charAt(var66 - 1) == 's') {
                    var65[var66] = field2488[--field2479];
                } else {
                    var65[var66] = Integer.valueOf(field2494[--field2481]);
                }
            }
            int var67 = field2494[--field2481];
            if (var67 == -1) {
                var65 = null;
            } else {
                var65[0] = Integer.valueOf(var67);
            }
            if (arg0 == 1400) {
                var61.field6792 = var65;
            } else if (arg0 == 1401) {
                var61.field6795 = var65;
            } else if (arg0 == 1402) {
                var61.field6753 = var65;
            } else if (arg0 == 1403) {
                var61.field6703 = var65;
            } else if (arg0 == 1404) {
                var61.field6778 = var65;
            } else if (arg0 == 1405) {
                var61.field6736 = var65;
            } else if (arg0 == 1406) {
                var61.field6729 = var65;
            } else if (arg0 == 1407) {
                var61.field6854 = var65;
                var61.field6715 = var63;
            } else if (arg0 == 1408) {
                var61.field6741 = var65;
            } else if (arg0 == 1409) {
                var61.field6868 = var65;
            } else if (arg0 == 1410) {
                var61.field6861 = var65;
            } else if (arg0 == 1411) {
                var61.field6844 = var65;
            } else if (arg0 == 1412) {
                var61.field6773 = var65;
            } else if (arg0 == 1414) {
                var61.field6831 = var65;
                var61.field6740 = var63;
            } else if (arg0 == 1415) {
                var61.field6807 = var65;
                var61.field6819 = var63;
            } else if (arg0 == 1416) {
                var61.field6760 = var65;
            } else if (arg0 == 1417) {
                var61.field6744 = var65;
            } else if (arg0 == 1418) {
                var61.field6733 = var65;
            } else if (arg0 == 1419) {
                var61.field6857 = var65;
            } else if (arg0 == 1420) {
                var61.field6734 = var65;
            } else if (arg0 == 1421) {
                var61.field6758 = var65;
            } else if (arg0 == 1422) {
                var61.field6789 = var65;
            } else if (arg0 == 1423) {
                var61.field6835 = var65;
            } else if (arg0 == 1424) {
                var61.field6839 = var65;
            } else if (arg0 == 1425) {
                var61.field6821 = var65;
            } else if (arg0 == 1426) {
                var61.field6730 = var65;
            } else if (arg0 == 1427) {
                var61.field6872 = var65;
            } else if (arg0 == 1428) {
                var61.field6709 = var65;
                var61.field6814 = var63;
            } else if (arg0 == 1429) {
                var61.field6743 = var65;
                var61.field6766 = var63;
            } else if (arg0 == 1430) {
                var61.field6776 = var65;
            }
            var61.field6787 = true;
            return;
        } else if (arg0 < 1600) {
            class507 var68 = arg1 ? field2485 : field2495;
            if (arg0 == 1500) {
                field2494[field2481++] = var68.field6726;
                return;
            }
            if (arg0 == 1501) {
                field2494[field2481++] = var68.field6724;
                return;
            }
            if (arg0 == 1502) {
                field2494[field2481++] = var68.field6793;
                return;
            }
            if (arg0 == 1503) {
                field2494[field2481++] = var68.field6700;
                return;
            }
            if (arg0 == 1504) {
                field2494[field2481++] = var68.field6859 ? 1 : 0;
                return;
            }
            if (arg0 == 1505) {
                field2494[field2481++] = var68.field6719;
                return;
            }
            if (arg0 == 1506) {
                class507 var69 = class309.method1787((byte) 126, var68);
                field2494[field2481++] = var69 == null ? -1 : var69.field6764;
                return;
            }
        } else if (arg0 < 1700) {
            class507 var70 = arg1 ? field2485 : field2495;
            if (arg0 == 1600) {
                field2494[field2481++] = var70.field6785;
                return;
            }
            if (arg0 == 1601) {
                field2494[field2481++] = var70.field6769;
                return;
            }
            if (arg0 == 1602) {
                field2488[field2479++] = var70.field6840;
                return;
            }
            if (arg0 == 1603) {
                field2494[field2481++] = var70.field6816;
                return;
            }
            if (arg0 == 1604) {
                field2494[field2481++] = var70.field6852;
                return;
            }
            if (arg0 == 1605) {
                field2494[field2481++] = var70.field6850;
                return;
            }
            if (arg0 == 1606) {
                field2494[field2481++] = var70.field6813;
                return;
            }
            if (arg0 == 1607) {
                field2494[field2481++] = var70.field6867;
                return;
            }
            if (arg0 == 1608) {
                field2494[field2481++] = var70.field6799;
                return;
            }
            if (arg0 == 1609) {
                field2494[field2481++] = var70.field6763;
                return;
            }
            if (arg0 == 1610) {
                field2494[field2481++] = var70.field6833;
                return;
            }
            if (arg0 == 1611) {
                field2494[field2481++] = var70.field6825;
                return;
            }
            if (arg0 == 1612) {
                field2494[field2481++] = var70.field6783;
                return;
            }
            if (arg0 == 1613) {
                int var71 = field2494[--field2481];
                class207 var72 = class705.field9939.method2477((byte) 6, var71);
                if (var72.method1245(0)) {
                    field2488[field2479++] = var70.method2733(var72.field2632, var71, 4095);
                    return;
                }
                field2494[field2481++] = var70.method2739(121, var72.field2627, var71);
                return;
            }
            if (arg0 == 1614) {
                field2494[field2481++] = var70.field6754;
                return;
            }
        } else if (arg0 < 1800) {
            class507 var73 = arg1 ? field2485 : field2495;
            if (arg0 == 1700) {
                field2494[field2481++] = var73.field6832;
                return;
            }
            if (arg0 == 1701) {
                if (var73.field6832 != -1) {
                    field2494[field2481++] = var73.field6858;
                    return;
                }
                field2494[field2481++] = 0;
                return;
            }
            if (arg0 == 1702) {
                field2494[field2481++] = var73.field6834;
                return;
            }
        } else if (arg0 < 1900) {
            class507 var74 = arg1 ? field2485 : field2495;
            if (arg0 == 1800) {
                field2494[field2481++] = client.method3819(var74).method2018(-1035661311);
                return;
            }
            if (arg0 == 1801) {
                int var75 = field2494[--field2481];
                int var352 = var75 - 1;
                if (var74.field6830 != null && var352 < var74.field6830.length && var74.field6830[var352] != null) {
                    field2488[field2479++] = var74.field6830[var352];
                    return;
                }
                field2488[field2479++] = "";
                return;
            }
            if (arg0 == 1802) {
                if (var74.field6828 == null) {
                    field2488[field2479++] = "";
                    return;
                }
                field2488[field2479++] = var74.field6828;
                return;
            }
        } else if (arg0 < 2000 || !(arg0 < 2900 || arg0 >= 3000)) {
            class507 var350;
            if (arg0 >= 2000) {
                var350 = class156.method894(-1018745488, field2494[--field2481]);
                arg0 -= 1000;
            } else {
                var350 = arg1 ? field2485 : field2495;
            }
            if (field2500 >= 10) {
                throw new RuntimeException("C29xx-1");
            }
            if (arg0 == 1927) {
                if (var350.field6872 == null) {
                    return;
                }
                class71 var351 = new class71();
                var351.field952 = var350;
                var351.field963 = var350.field6872;
                var351.field961 = field2500 + 1;
                class231.field2884.method239(var351, (byte) 93);
                return;
            }
        } else if (arg0 < 2600) {
            class507 var76 = class156.method894(-1018745488, field2494[--field2481]);
            if (arg0 == 2500) {
                field2494[field2481++] = var76.field6726;
                return;
            }
            if (arg0 == 2501) {
                field2494[field2481++] = var76.field6724;
                return;
            }
            if (arg0 == 2502) {
                field2494[field2481++] = var76.field6793;
                return;
            }
            if (arg0 == 2503) {
                field2494[field2481++] = var76.field6700;
                return;
            }
            if (arg0 == 2504) {
                field2494[field2481++] = var76.field6859 ? 1 : 0;
                return;
            }
            if (arg0 == 2505) {
                field2494[field2481++] = var76.field6719;
                return;
            }
            if (arg0 == 1506) {
                class507 var77 = class309.method1787((byte) 127, var76);
                field2494[field2481++] = var77 == null ? -1 : var77.field6764;
                return;
            }
        } else if (arg0 < 2700) {
            class507 var78 = class156.method894(-1018745488, field2494[--field2481]);
            if (arg0 == 2600) {
                field2494[field2481++] = var78.field6785;
                return;
            }
            if (arg0 == 2601) {
                field2494[field2481++] = var78.field6769;
                return;
            }
            if (arg0 == 2602) {
                field2488[field2479++] = var78.field6840;
                return;
            }
            if (arg0 == 2603) {
                field2494[field2481++] = var78.field6816;
                return;
            }
            if (arg0 == 2604) {
                field2494[field2481++] = var78.field6852;
                return;
            }
            if (arg0 == 2605) {
                field2494[field2481++] = var78.field6850;
                return;
            }
            if (arg0 == 2606) {
                field2494[field2481++] = var78.field6813;
                return;
            }
            if (arg0 == 2607) {
                field2494[field2481++] = var78.field6867;
                return;
            }
            if (arg0 == 2608) {
                field2494[field2481++] = var78.field6799;
                return;
            }
            if (arg0 == 2609) {
                field2494[field2481++] = var78.field6763;
                return;
            }
            if (arg0 == 2610) {
                field2494[field2481++] = var78.field6833;
                return;
            }
            if (arg0 == 2611) {
                field2494[field2481++] = var78.field6825;
                return;
            }
            if (arg0 == 2612) {
                field2494[field2481++] = var78.field6783;
                return;
            }
            if (arg0 == 2613) {
                field2494[field2481++] = var78.field6754;
                return;
            }
        } else if (arg0 < 2800) {
            if (arg0 == 2700) {
                class507 var79 = class156.method894(-1018745488, field2494[--field2481]);
                field2494[field2481++] = var79.field6832;
                return;
            }
            if (arg0 == 2701) {
                class507 var80 = class156.method894(-1018745488, field2494[--field2481]);
                if (var80.field6832 != -1) {
                    field2494[field2481++] = var80.field6858;
                    return;
                }
                field2494[field2481++] = 0;
                return;
            }
            if (arg0 == 2702) {
                int var81 = field2494[--field2481];
                class340 var82 = (class340) class138.field1797.method399(-32748, (long) var81);
                if (var82 != null) {
                    field2494[field2481++] = 1;
                    return;
                }
                field2494[field2481++] = 0;
                return;
            }
            if (arg0 == 2703) {
                class507 var83 = class156.method894(-1018745488, field2494[--field2481]);
                if (var83.field6707 == null) {
                    field2494[field2481++] = 0;
                    return;
                }
                int var84 = var83.field6707.length;
                for (int var85 = 0; var85 < var83.field6707.length; var85++) {
                    if (var83.field6707[var85] == null) {
                        var84 = var85;
                        break;
                    }
                }
                field2494[field2481++] = var84;
                return;
            }
            if (arg0 == 2704 || arg0 == 2705) {
                field2481 -= 2;
                int var86 = field2494[field2481];
                int var87 = field2494[field2481 + 1];
                class340 var88 = (class340) class138.field1797.method399(-32748, (long) var86);
                if (var88 != null && var88.field4392 == var87) {
                    field2494[field2481++] = 1;
                    return;
                }
                field2494[field2481++] = 0;
                return;
            }
        } else if (arg0 < 2900) {
            class507 var89 = class156.method894(-1018745488, field2494[--field2481]);
            if (arg0 == 2800) {
                field2494[field2481++] = client.method3819(var89).method2018(-1035661311);
                return;
            }
            if (arg0 == 2801) {
                int var90 = field2494[--field2481];
                int var353 = var90 - 1;
                if (var89.field6830 != null && var353 < var89.field6830.length && var89.field6830[var353] != null) {
                    field2488[field2479++] = var89.field6830[var353];
                    return;
                }
                field2488[field2479++] = "";
                return;
            }
            if (arg0 == 2802) {
                if (var89.field6828 == null) {
                    field2488[field2479++] = "";
                    return;
                }
                field2488[field2479++] = var89.field6828;
                return;
            }
        } else if (arg0 < 3200) {
            if (arg0 == 3100) {
                String var91 = field2488[--field2479];
                class26.method178(-93, var91);
                return;
            }
            if (arg0 == 3101) {
                field2481 -= 2;
                class51.method327(field2494[field2481 + 1], class376.field4748, (byte) -123, field2494[field2481]);
                return;
            }
            if (arg0 == 3103) {
                class533.method2892(true, -1);
                return;
            }
            if (arg0 == 3104) {
                String var92 = field2488[--field2479];
                int var93 = 0;
                if (class537.method2912((byte) 98, var92)) {
                    var93 = class557.method3065(128, var92);
                }
                field2496++;
                class704 var94 = class314.method1820(class323.field4156, class400.field5014, (byte) -103);
                var94.field9929.method3464(var93, -107);
                class122.method654(var94, (byte) -36);
                return;
            }
            if (arg0 == 3105) {
                String var95 = field2488[--field2479];
                field2472++;
                class704 var96 = class314.method1820(class601.field8441, class400.field5014, (byte) 90);
                var96.field9929.method3509(var95.length() + 1, (byte) -122);
                var96.field9929.method3489(var95, -57);
                class122.method654(var96, (byte) -36);
                return;
            }
            if (arg0 == 3106) {
                String var97 = field2488[--field2479];
                field2490++;
                class704 var98 = class314.method1820(class663.field9372, class400.field5014, (byte) -68);
                var98.field9929.method3509(var97.length() + 1, (byte) -126);
                var98.field9929.method3489(var97, -29);
                class122.method654(var98, (byte) -36);
                return;
            }
            if (arg0 == 3107) {
                int var99 = field2494[--field2481];
                String var100 = field2488[--field2479];
                class603.method3309(-8, var99, var100);
                return;
            }
            if (arg0 == 3108) {
                field2481 -= 3;
                int var101 = field2494[field2481];
                int var102 = field2494[field2481 + 1];
                int var103 = field2494[field2481 + 2];
                class507 var104 = class156.method894(-1018745488, var103);
                class46.method281(var101, (byte) -104, var104, var102);
                return;
            }
            if (arg0 == 3109) {
                field2481 -= 2;
                int var105 = field2494[field2481];
                int var106 = field2494[field2481 + 1];
                class507 var107 = arg1 ? field2485 : field2495;
                class46.method281(var105, (byte) -119, var107, var106);
                return;
            }
            if (arg0 == 3110) {
                int var108 = field2494[--field2481];
                field2478++;
                class704 var109 = class314.method1820(class503.field6660, class400.field5014, (byte) -56);
                var109.field9929.method3526(var108, 13469);
                class122.method654(var109, (byte) -36);
                return;
            }
            if (arg0 == 3111) {
                field2481 -= 2;
                int var110 = field2494[field2481];
                int var111 = field2494[field2481 + 1];
                class340 var112 = (class340) class138.field1797.method399(-32748, (long) var110);
                if (var112 != null) {
                    class426.method2260(true, var112.field4392 != var111, false, var112);
                }
                class484.method2629(true, 3, var110, (byte) 126, var111);
                return;
            }
            if (arg0 == 3112) {
                field2481--;
                int var113 = field2494[field2481];
                class340 var114 = (class340) class138.field1797.method399(-32748, (long) var113);
                if (var114 != null && var114.field4391 == 3) {
                    class426.method2260(true, true, false, var114);
                }
                return;
            }
            if (arg0 == 3113) {
                class107.method605(field2488[--field2479], true);
                return;
            }
            if (arg0 == 3114) {
                field2481 -= 2;
                int var115 = field2494[field2481];
                int var116 = field2494[field2481 + 1];
                String var117 = field2488[--field2479];
                class1.method3("", var117, var115, -1, "", var116, "");
                return;
            }
            if (arg0 == 3115) {
                field2481 -= 11;
                class414[] var118 = class349.method1929((byte) 87);
                class29[] var119 = class20.method132(98);
                class269.method1552(field2494[field2481 + 2], field2494[field2481 + 4], var119[field2494[field2481 + 1]], -128, var118[field2494[field2481]], field2494[field2481 + 10], field2494[field2481 + 7], field2494[field2481 + 5], field2494[field2481 + 8], field2494[field2481 + 3], field2494[field2481 + 9], field2494[field2481 + 6]);
                return;
            }
        } else if (arg0 < 3300) {
            if (arg0 == 3200) {
                field2481 -= 3;
                class160.method925(255, field2494[field2481], field2494[field2481 + 1], field2494[field2481 + 2], 29830);
                return;
            }
            if (arg0 == 3201) {
                class405.method2156(field2494[--field2481], 255, 50, (byte) -123);
                return;
            }
            if (arg0 == 3202) {
                field2481 -= 2;
                class554.method3055(6567, 255, field2494[field2481 + 1], field2494[field2481]);
                return;
            }
            if (arg0 == 3203) {
                field2481 -= 4;
                class160.method925(field2494[field2481 + 3], field2494[field2481], field2494[field2481 + 1], field2494[field2481 + 2], 29830);
                return;
            }
            if (arg0 == 3204) {
                field2481 -= 3;
                class405.method2156(field2494[field2481], field2494[field2481 + 1], field2494[field2481 + 2], (byte) -123);
                return;
            }
            if (arg0 == 3205) {
                field2481 -= 3;
                class554.method3055(6567, field2494[field2481 + 2], field2494[field2481 + 1], field2494[field2481]);
                return;
            }
            if (arg0 == 3206) {
                field2481 -= 4;
                class602.method3306(field2494[field2481], field2494[field2481 + 1], field2494[field2481 + 2], false, field2494[field2481 + 3], false);
                return;
            }
            if (arg0 == 3207) {
                field2481 -= 4;
                class602.method3306(field2494[field2481], field2494[field2481 + 1], field2494[field2481 + 2], false, field2494[field2481 + 3], true);
                return;
            }
        } else if (arg0 < 3400) {
            if (arg0 == 3300) {
                field2494[field2481++] = class133.field1735;
                return;
            }
            if (arg0 == 3301) {
                field2481 -= 2;
                int var120 = field2494[field2481];
                int var121 = field2494[field2481 + 1];
                field2494[field2481++] = class57.method363(var121, false, var120, true);
                return;
            }
            if (arg0 == 3302) {
                field2481 -= 2;
                int var122 = field2494[field2481];
                int var123 = field2494[field2481 + 1];
                field2494[field2481++] = class224.method1350(var122, var123, (byte) -52, false);
                return;
            }
            if (arg0 == 3303) {
                field2481 -= 2;
                int var124 = field2494[field2481];
                int var125 = field2494[field2481 + 1];
                field2494[field2481++] = class248.method1463(0, false, var124, var125);
                return;
            }
            if (arg0 == 3304) {
                int var126 = field2494[--field2481];
                field2494[field2481++] = class354.field4508.method3529(-88, var126).field7131;
                return;
            }
            if (arg0 == 3305) {
                int var127 = field2494[--field2481];
                field2494[field2481++] = class564.field7838[var127];
                return;
            }
            if (arg0 == 3306) {
                int var128 = field2494[--field2481];
                field2494[field2481++] = class15.field257[var128];
                return;
            }
            if (arg0 == 3307) {
                int var129 = field2494[--field2481];
                field2494[field2481++] = class576.field8048[var129];
                return;
            }
            if (arg0 == 3308) {
                byte var130 = class376.field4748.field6470;
                int var131 = (class376.field4748.field6461 >> 9) + class145.field1879;
                int var132 = (class376.field4748.field6464 >> 9) + class630.field8817;
                field2494[field2481++] = (var130 << 28) + (var131 << 14) + var132;
                return;
            }
            if (arg0 == 3309) {
                int var133 = field2494[--field2481];
                field2494[field2481++] = var133 >> 14 & 0x3FFF;
                return;
            }
            if (arg0 == 3310) {
                int var134 = field2494[--field2481];
                field2494[field2481++] = var134 >> 28;
                return;
            }
            if (arg0 == 3311) {
                int var135 = field2494[--field2481];
                field2494[field2481++] = var135 & 0x3FFF;
                return;
            }
            if (arg0 == 3312) {
                field2494[field2481++] = class66.field896 ? 1 : 0;
                return;
            }
            if (arg0 == 3313) {
                field2481 -= 2;
                int var136 = field2494[field2481];
                int var137 = field2494[field2481 + 1];
                field2494[field2481++] = class57.method363(var137, true, var136, true);
                return;
            }
            if (arg0 == 3314) {
                field2481 -= 2;
                int var138 = field2494[field2481];
                int var139 = field2494[field2481 + 1];
                field2494[field2481++] = class224.method1350(var138, var139, (byte) 124, true);
                return;
            }
            if (arg0 == 3315) {
                field2481 -= 2;
                int var140 = field2494[field2481];
                int var141 = field2494[field2481 + 1];
                field2494[field2481++] = class248.method1463(0, true, var140, var141);
                return;
            }
            if (arg0 == 3316) {
                if (class199.field2531 >= 2) {
                    field2494[field2481++] = class199.field2531;
                    return;
                }
                field2494[field2481++] = 0;
                return;
            }
            if (arg0 == 3317) {
                field2494[field2481++] = class196.field2458;
                return;
            }
            if (arg0 == 3318) {
                field2494[field2481++] = class131.field1628.field3685;
                return;
            }
            if (arg0 == 3321) {
                field2494[field2481++] = class287.field3575;
                return;
            }
            if (arg0 == 3322) {
                field2494[field2481++] = class346.field4436;
                return;
            }
            if (arg0 == 3323) {
                if (class135.field1770 >= 5 && class135.field1770 <= 9) {
                    field2494[field2481++] = 1;
                    return;
                }
                field2494[field2481++] = 0;
                return;
            }
            if (arg0 == 3324) {
                if (class135.field1770 >= 5 && class135.field1770 <= 9) {
                    field2494[field2481++] = class135.field1770;
                    return;
                }
                field2494[field2481++] = 0;
                return;
            }
            if (arg0 == 3325) {
                field2494[field2481++] = class162.field2138 ? 1 : 0;
                return;
            }
            if (arg0 == 3326) {
                field2494[field2481++] = class376.field4748.field6981;
                return;
            }
            if (arg0 == 3327) {
                field2494[field2481++] = class376.field4748.field7008.field6572 ? 1 : 0;
                return;
            }
            if (arg0 == 3329) {
                field2494[field2481++] = class553.field7703 ? 1 : 0;
                return;
            }
            if (arg0 == 3330) {
                int var142 = field2494[--field2481];
                field2494[field2481++] = class564.method3100(1, var142, false);
                return;
            }
            if (arg0 == 3331) {
                field2481 -= 2;
                int var143 = field2494[field2481];
                int var144 = field2494[field2481 + 1];
                field2494[field2481++] = class700.method3934(false, false, var144, var143, true);
                return;
            }
            if (arg0 == 3332) {
                field2481 -= 2;
                int var145 = field2494[field2481];
                int var146 = field2494[field2481 + 1];
                field2494[field2481++] = class700.method3934(false, true, var146, var145, true);
                return;
            }
            if (arg0 == 3333) {
                field2494[field2481++] = class304.field3746;
                return;
            }
            if (arg0 == 3335) {
                field2494[field2481++] = class250.field3068;
                return;
            }
            if (arg0 == 3336) {
                field2481 -= 4;
                int var147 = field2494[field2481];
                int var148 = field2494[field2481 + 1];
                int var149 = field2494[field2481 + 2];
                int var150 = field2494[field2481 + 3];
                int var151 = (var148 << 14) + var147;
                int var152 = (var149 << 28) + var151;
                int var153 = var150 + var152;
                field2494[field2481++] = var153;
                return;
            }
            if (arg0 == 3337) {
                field2494[field2481++] = class322.field4130;
                return;
            }
            if (arg0 == 3338) {
                field2494[field2481++] = class393.method2109(-116);
                return;
            }
            if (arg0 == 3339) {
                field2494[field2481++] = class341.field4399 ? 1 : 0;
                return;
            }
            if (arg0 == 3340) {
                field2494[field2481++] = class588.field8273 ? 1 : 0;
                return;
            }
            if (arg0 == 3341) {
                field2494[field2481++] = class112.field1467 ? 1 : 0;
                return;
            }
            if (arg0 == 3342) {
                field2494[field2481++] = class289.field3592.method944(2000);
                return;
            }
            if (arg0 == 3343) {
                field2494[field2481++] = class289.field3592.method941(100);
                return;
            }
            if (arg0 == 3344) {
                field2488[field2479++] = class159.method923((byte) -95);
                return;
            }
            if (arg0 == 3345) {
                field2488[field2479++] = class376.method2043(58);
                return;
            }
            if (arg0 == 3346) {
                field2494[field2481++] = class550.method3036(4);
                return;
            }
            if (arg0 == 3347) {
                field2494[field2481++] = class179.field2313;
                return;
            }
        } else if (arg0 < 3500) {
            if (arg0 == 3400) {
                field2481 -= 2;
                int var154 = field2494[field2481];
                int var155 = field2494[field2481 + 1];
                class440 var156 = class397.field5005.method1623(var154, -8727);
                field2488[field2479++] = var156.method2349(-24908, var155);
                return;
            }
            if (arg0 == 3408) {
                field2481 -= 4;
                int var157 = field2494[field2481];
                int var158 = field2494[field2481 + 1];
                int var159 = field2494[field2481 + 2];
                int var160 = field2494[field2481 + 3];
                class440 var161 = class397.field5005.method1623(var159, -8727);
                if (var161.field5495 == var157 && var161.field5478 == var158) {
                    if (var158 == 115) {
                        field2488[field2479++] = var161.method2349(-24908, var160);
                        return;
                    }
                    field2494[field2481++] = var161.method2347(var160, 438412161);
                    return;
                }
                throw new RuntimeException("C3408-1");
            }
            if (arg0 == 3409) {
                field2481 -= 3;
                int var162 = field2494[field2481];
                int var163 = field2494[field2481 + 1];
                int var164 = field2494[field2481 + 2];
                if (var163 == -1) {
                    throw new RuntimeException("C3409-2");
                }
                class440 var165 = class397.field5005.method1623(var163, -8727);
                if (var165.field5478 != var162) {
                    throw new RuntimeException("C3409-1");
                }
                field2494[field2481++] = var165.method2344(var164, -110) ? 1 : 0;
                return;
            }
            if (arg0 == 3410) {
                int var166 = field2494[--field2481];
                String var167 = field2488[--field2479];
                if (var166 == -1) {
                    throw new RuntimeException("C3410-2");
                }
                class440 var168 = class397.field5005.method1623(var166, -8727);
                if (var168.field5478 != 's') {
                    throw new RuntimeException("C3410-1");
                }
                field2494[field2481++] = var168.method2334(var167, 5) ? 1 : 0;
                return;
            }
            if (arg0 == 3411) {
                int var169 = field2494[--field2481];
                class440 var170 = class397.field5005.method1623(var169, -8727);
                field2494[field2481++] = var170.field5481.method404((byte) -26);
                return;
            }
        } else if (arg0 < 3700) {
            if (arg0 == 3600) {
                if (class148.field1917 == 0) {
                    field2494[field2481++] = -2;
                    return;
                }
                if (class148.field1917 == 1) {
                    field2494[field2481++] = -1;
                    return;
                }
                field2494[field2481++] = class66.field904;
                return;
            }
            if (arg0 == 3601) {
                int var171 = field2494[--field2481];
                if (class148.field1917 == 2 && var171 < class66.field904) {
                    field2488[field2479++] = class50.field708[var171];
                    if (class531.field7172[var171] != null) {
                        field2488[field2479++] = class531.field7172[var171];
                        return;
                    }
                    field2488[field2479++] = "";
                    return;
                }
                field2488[field2479++] = "";
                field2488[field2479++] = "";
                return;
            }
            if (arg0 == 3602) {
                int var172 = field2494[--field2481];
                if (class148.field1917 == 2 && var172 < class66.field904) {
                    field2494[field2481++] = class223.field2796[var172];
                    return;
                }
                field2494[field2481++] = 0;
                return;
            }
            if (arg0 == 3603) {
                int var173 = field2494[--field2481];
                if (class148.field1917 == 2 && var173 < class66.field904) {
                    field2494[field2481++] = class441.field5568[var173];
                    return;
                }
                field2494[field2481++] = 0;
                return;
            }
            if (arg0 == 3604) {
                String var174 = field2488[--field2479];
                int var175 = field2494[--field2481];
                class232.method1396(var175, (byte) -9, var174);
                return;
            }
            if (arg0 == 3605) {
                String var176 = field2488[--field2479];
                class44.method269(-108, var176);
                return;
            }
            if (arg0 == 3606) {
                String var177 = field2488[--field2479];
                class367.method2010(var177, 1);
                return;
            }
            if (arg0 == 3607) {
                String var178 = field2488[--field2479];
                class689.method3882(false, var178, -127);
                return;
            }
            if (arg0 == 3608) {
                String var179 = field2488[--field2479];
                class551.method3050(1, var179);
                return;
            }
            if (arg0 == 3609) {
                String var180 = field2488[--field2479];
                if (var180.startsWith("<img=0>") || var180.startsWith("<img=1>")) {
                    var180 = var180.substring(7);
                }
                field2494[field2481++] = class259.method1511(var180, -128) ? 1 : 0;
                return;
            }
            if (arg0 == 3610) {
                int var181 = field2494[--field2481];
                if (class148.field1917 == 2 && var181 < class66.field904) {
                    field2488[field2479++] = class241.field3010[var181];
                    return;
                }
                field2488[field2479++] = "";
                return;
            }
            if (arg0 == 3611) {
                if (class29.field416 != null) {
                    field2488[field2479++] = class615.method3397((byte) 98, class29.field416);
                    return;
                }
                field2488[field2479++] = "";
                return;
            }
            if (arg0 == 3612) {
                if (class29.field416 != null) {
                    field2494[field2481++] = class313.field4023;
                    return;
                }
                field2494[field2481++] = 0;
                return;
            }
            if (arg0 == 3613) {
                int var182 = field2494[--field2481];
                if (class29.field416 != null && var182 < class313.field4023) {
                    field2488[field2479++] = class516.field7046[var182].field6958;
                    return;
                }
                field2488[field2479++] = "";
                return;
            }
            if (arg0 == 3614) {
                int var183 = field2494[--field2481];
                if (class29.field416 != null && var183 < class313.field4023) {
                    field2494[field2481++] = class516.field7046[var183].field6971;
                    return;
                }
                field2494[field2481++] = 0;
                return;
            }
            if (arg0 == 3615) {
                int var184 = field2494[--field2481];
                if (class29.field416 != null && var184 < class313.field4023) {
                    field2494[field2481++] = class516.field7046[var184].field6964;
                    return;
                }
                field2494[field2481++] = 0;
                return;
            }
            if (arg0 == 3616) {
                field2494[field2481++] = class608.field8531;
                return;
            }
            if (arg0 == 3617) {
                String var185 = field2488[--field2479];
                class317.method1826((byte) 78, var185);
                return;
            }
            if (arg0 == 3618) {
                field2494[field2481++] = class649.field9167;
                return;
            }
            if (arg0 == 3619) {
                String var186 = field2488[--field2479];
                class513.method2768(var186, (byte) -109);
                return;
            }
            if (arg0 == 3620) {
                class3.method25((byte) 69);
                return;
            }
            if (arg0 == 3621) {
                if (class148.field1917 == 0) {
                    field2494[field2481++] = -1;
                    return;
                }
                field2494[field2481++] = class238.field2980;
                return;
            }
            if (arg0 == 3622) {
                int var187 = field2494[--field2481];
                if (class148.field1917 != 0 && var187 < class238.field2980) {
                    field2488[field2479++] = class680.field9564[var187];
                    if (class215.field2669[var187] != null) {
                        field2488[field2479++] = class215.field2669[var187];
                        return;
                    }
                    field2488[field2479++] = "";
                    return;
                }
                field2488[field2479++] = "";
                field2488[field2479++] = "";
                return;
            }
            if (arg0 == 3623) {
                String var188 = field2488[--field2479];
                if (var188.startsWith("<img=0>") || var188.startsWith("<img=1>")) {
                    var188 = var188.substring(7);
                }
                field2494[field2481++] = class194.method1172(var188, -99) ? 1 : 0;
                return;
            }
            if (arg0 == 3624) {
                int var189 = field2494[--field2481];
                if (class516.field7046 != null && var189 < class313.field4023 && class516.field7046[var189].field6965.equalsIgnoreCase(class376.field4748.field7017)) {
                    field2494[field2481++] = 1;
                    return;
                }
                field2494[field2481++] = 0;
                return;
            }
            if (arg0 == 3625) {
                if (class425.field5337 != null) {
                    field2488[field2479++] = class425.field5337;
                    return;
                }
                field2488[field2479++] = "";
                return;
            }
            if (arg0 == 3626) {
                int var190 = field2494[--field2481];
                if (class29.field416 != null && var190 < class313.field4023) {
                    field2488[field2479++] = class516.field7046[var190].field6961;
                    return;
                }
                field2488[field2479++] = "";
                return;
            }
            if (arg0 == 3627) {
                int var191 = field2494[--field2481];
                if (class148.field1917 == 2 && var191 >= 0 && var191 < class66.field904) {
                    field2494[field2481++] = class599.field8411[var191] ? 1 : 0;
                    return;
                }
                field2494[field2481++] = 0;
                return;
            }
            if (arg0 == 3628) {
                String var192 = field2488[--field2479];
                if (var192.startsWith("<img=0>") || var192.startsWith("<img=1>")) {
                    var192 = var192.substring(7);
                }
                field2494[field2481++] = class571.method3154(1, var192);
                return;
            }
            if (arg0 == 3629) {
                field2494[field2481++] = class157.field2045;
                return;
            }
            if (arg0 == 3630) {
                String var193 = field2488[--field2479];
                class689.method3882(true, var193, -123);
                return;
            }
            if (arg0 == 3631) {
                int var194 = field2494[--field2481];
                field2494[field2481++] = class670.field9442[var194] ? 1 : 0;
                return;
            }
            if (arg0 == 3632) {
                int var195 = field2494[--field2481];
                if (class29.field416 != null && var195 < class313.field4023) {
                    field2488[field2479++] = class516.field7046[var195].field6965;
                    return;
                }
                field2488[field2479++] = "";
                return;
            }
            if (arg0 == 3633) {
                int var196 = field2494[--field2481];
                if (class148.field1917 != 0 && var196 < class238.field2980) {
                    field2488[field2479++] = class280.field3509[var196];
                    return;
                }
                field2488[field2479++] = "";
                return;
            }
        } else if (arg0 < 4000) {
            if (arg0 == 3903) {
                int var197 = field2494[--field2481];
                field2494[field2481++] = class507.field6863[var197].method3338(false);
                return;
            }
            if (arg0 == 3904) {
                int var198 = field2494[--field2481];
                field2494[field2481++] = class507.field6863[var198].field8565;
                return;
            }
            if (arg0 == 3905) {
                int var199 = field2494[--field2481];
                field2494[field2481++] = class507.field6863[var199].field8569;
                return;
            }
            if (arg0 == 3906) {
                int var200 = field2494[--field2481];
                field2494[field2481++] = class507.field6863[var200].field8570;
                return;
            }
            if (arg0 == 3907) {
                int var201 = field2494[--field2481];
                field2494[field2481++] = class507.field6863[var201].field8571;
                return;
            }
            if (arg0 == 3908) {
                int var202 = field2494[--field2481];
                field2494[field2481++] = class507.field6863[var202].field8566;
                return;
            }
            if (arg0 == 3910) {
                int var203 = field2494[--field2481];
                int var204 = class507.field6863[var203].method3335(2183);
                field2494[field2481++] = var204 == 0 ? 1 : 0;
                return;
            }
            if (arg0 == 3911) {
                int var205 = field2494[--field2481];
                int var206 = class507.field6863[var205].method3335(2183);
                field2494[field2481++] = var206 == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 3912) {
                int var207 = field2494[--field2481];
                int var208 = class507.field6863[var207].method3335(2183);
                field2494[field2481++] = var208 == 5 ? 1 : 0;
                return;
            }
            if (arg0 == 3913) {
                int var209 = field2494[--field2481];
                int var210 = class507.field6863[var209].method3335(2183);
                field2494[field2481++] = var210 == 1 ? 1 : 0;
                return;
            }
        } else if (arg0 < 4100) {
            if (arg0 == 4000) {
                field2481 -= 2;
                int var211 = field2494[field2481];
                int var212 = field2494[field2481 + 1];
                field2494[field2481++] = var211 + var212;
                return;
            }
            if (arg0 == 4001) {
                field2481 -= 2;
                int var213 = field2494[field2481];
                int var214 = field2494[field2481 + 1];
                field2494[field2481++] = var213 - var214;
                return;
            }
            if (arg0 == 4002) {
                field2481 -= 2;
                int var215 = field2494[field2481];
                int var216 = field2494[field2481 + 1];
                field2494[field2481++] = var215 * var216;
                return;
            }
            if (arg0 == 4003) {
                field2481 -= 2;
                int var217 = field2494[field2481];
                int var218 = field2494[field2481 + 1];
                field2494[field2481++] = var217 / var218;
                return;
            }
            if (arg0 == 4004) {
                int var219 = field2494[--field2481];
                field2494[field2481++] = (int) (Math.random() * (double) var219);
                return;
            }
            if (arg0 == 4005) {
                int var220 = field2494[--field2481];
                field2494[field2481++] = (int) (Math.random() * (double) (var220 + 1));
                return;
            }
            if (arg0 == 4006) {
                field2481 -= 5;
                int var221 = field2494[field2481];
                int var222 = field2494[field2481 + 1];
                int var223 = field2494[field2481 + 2];
                int var224 = field2494[field2481 + 3];
                int var225 = field2494[field2481 + 4];
                field2494[field2481++] = (var222 - var221) * (var225 - var223) / (var224 - var223) + var221;
                return;
            }
            if (arg0 == 4007) {
                field2481 -= 2;
                long var226 = (long) field2494[field2481];
                long var228 = (long) field2494[field2481 + 1];
                field2494[field2481++] = (int) (var226 * var228 / 100L + var226);
                return;
            }
            if (arg0 == 4008) {
                field2481 -= 2;
                int var230 = field2494[field2481];
                int var231 = field2494[field2481 + 1];
                field2494[field2481++] = var230 | 0x1 << var231;
                return;
            }
            if (arg0 == 4009) {
                field2481 -= 2;
                int var232 = field2494[field2481];
                int var233 = field2494[field2481 + 1];
                field2494[field2481++] = var232 & -(0x1 << var233) - 1;
                return;
            }
            if (arg0 == 4010) {
                field2481 -= 2;
                int var234 = field2494[field2481];
                int var235 = field2494[field2481 + 1];
                field2494[field2481++] = (var234 & 0x1 << var235) == 0 ? 0 : 1;
                return;
            }
            if (arg0 == 4011) {
                field2481 -= 2;
                int var236 = field2494[field2481];
                int var237 = field2494[field2481 + 1];
                field2494[field2481++] = var236 % var237;
                return;
            }
            if (arg0 == 4012) {
                field2481 -= 2;
                int var238 = field2494[field2481];
                int var239 = field2494[field2481 + 1];
                if (var238 == 0) {
                    field2494[field2481++] = 0;
                    return;
                }
                field2494[field2481++] = (int) Math.pow((double) var238, (double) var239);
                return;
            }
            if (arg0 == 4013) {
                field2481 -= 2;
                int var240 = field2494[field2481];
                int var241 = field2494[field2481 + 1];
                if (var240 == 0) {
                    field2494[field2481++] = 0;
                    return;
                }
                if (var241 == 0) {
                    field2494[field2481++] = Integer.MAX_VALUE;
                    return;
                }
                field2494[field2481++] = (int) Math.pow((double) var240, 1.0D / (double) var241);
                return;
            }
            if (arg0 == 4014) {
                field2481 -= 2;
                int var242 = field2494[field2481];
                int var243 = field2494[field2481 + 1];
                field2494[field2481++] = var242 & var243;
                return;
            }
            if (arg0 == 4015) {
                field2481 -= 2;
                int var244 = field2494[field2481];
                int var245 = field2494[field2481 + 1];
                field2494[field2481++] = var244 | var245;
                return;
            }
            if (arg0 == 4016) {
                field2481 -= 2;
                int var246 = field2494[field2481];
                int var247 = field2494[field2481 + 1];
                field2494[field2481++] = var246 < var247 ? var246 : var247;
                return;
            }
            if (arg0 == 4017) {
                field2481 -= 2;
                int var248 = field2494[field2481];
                int var249 = field2494[field2481 + 1];
                field2494[field2481++] = var248 > var249 ? var248 : var249;
                return;
            }
            if (arg0 == 4018) {
                field2481 -= 3;
                long var250 = (long) field2494[field2481];
                long var252 = (long) field2494[field2481 + 1];
                long var254 = (long) field2494[field2481 + 2];
                field2494[field2481++] = (int) (var250 * var254 / var252);
                return;
            }
        } else if (arg0 < 4200) {
            if (arg0 == 4100) {
                String var256 = field2488[--field2479];
                int var257 = field2494[--field2481];
                field2488[field2479++] = var256 + var257;
                return;
            }
            if (arg0 == 4101) {
                field2479 -= 2;
                String var258 = field2488[field2479];
                String var259 = field2488[field2479 + 1];
                field2488[field2479++] = var258 + var259;
                return;
            }
            if (arg0 == 4102) {
                String var260 = field2488[--field2479];
                int var261 = field2494[--field2481];
                field2488[field2479++] = var260 + class593.method3262((byte) 78, true, var261);
                return;
            }
            if (arg0 == 4103) {
                String var262 = field2488[--field2479];
                field2488[field2479++] = var262.toLowerCase();
                return;
            }
            if (arg0 == 4104) {
                field2488[field2479++] = method1195(field2494[--field2481]);
                return;
            }
            if (arg0 == 4105) {
                field2479 -= 2;
                String var263 = field2488[field2479];
                String var264 = field2488[field2479 + 1];
                if (class376.field4748.field7008 != null && class376.field4748.field7008.field6572) {
                    field2488[field2479++] = var264;
                    return;
                }
                field2488[field2479++] = var263;
                return;
            }
            if (arg0 == 4106) {
                int var265 = field2494[--field2481];
                field2488[field2479++] = Integer.toString(var265);
                return;
            }
            if (arg0 == 4107) {
                field2479 -= 2;
                field2494[field2481++] = class454.method2431(class250.field3068, field2488[field2479 + 1], field2488[field2479], -119);
                return;
            }
            if (arg0 == 4108) {
                String var266 = field2488[--field2479];
                field2481 -= 2;
                int var267 = field2494[field2481];
                int var268 = field2494[field2481 + 1];
                class595 var269 = class548.method2964((byte) 11, class301.field3700, 0, var268);
                field2494[field2481++] = var269.method3277(var267, var266, class677.field9502, -123);
                return;
            }
            if (arg0 == 4109) {
                String var270 = field2488[--field2479];
                field2481 -= 2;
                int var271 = field2494[field2481];
                int var272 = field2494[field2481 + 1];
                class595 var273 = class548.method2964((byte) 11, class301.field3700, 0, var272);
                field2494[field2481++] = var273.method3273(var270, class677.field9502, var271, 96);
                return;
            }
            if (arg0 == 4110) {
                field2479 -= 2;
                String var274 = field2488[field2479];
                String var275 = field2488[field2479 + 1];
                if (field2494[--field2481] == 1) {
                    field2488[field2479++] = var274;
                    return;
                }
                field2488[field2479++] = var275;
                return;
            }
            if (arg0 == 4111) {
                String var276 = field2488[--field2479];
                field2488[field2479++] = class447.method2388(19317, var276);
                return;
            }
            if (arg0 == 4112) {
                String var277 = field2488[--field2479];
                int var278 = field2494[--field2481];
                if (var278 == -1) {
                    throw new RuntimeException("null char");
                }
                field2488[field2479++] = var277 + (char) var278;
                return;
            }
            if (arg0 == 4113) {
                int var279 = field2494[--field2481];
                field2494[field2481++] = class344.method1918((byte) -53, (char) var279) ? 1 : 0;
                return;
            }
            if (arg0 == 4114) {
                int var280 = field2494[--field2481];
                field2494[field2481++] = class653.method3663(-115, (char) var280) ? 1 : 0;
                return;
            }
            if (arg0 == 4115) {
                int var281 = field2494[--field2481];
                field2494[field2481++] = class201.method1214((char) var281, true) ? 1 : 0;
                return;
            }
            if (arg0 == 4116) {
                int var282 = field2494[--field2481];
                field2494[field2481++] = class135.method783((char) var282, 20454) ? 1 : 0;
                return;
            }
            if (arg0 == 4117) {
                String var283 = field2488[--field2479];
                if (var283 != null) {
                    field2494[field2481++] = var283.length();
                    return;
                }
                field2494[field2481++] = 0;
                return;
            }
            if (arg0 == 4118) {
                String var284 = field2488[--field2479];
                field2481 -= 2;
                int var285 = field2494[field2481];
                int var286 = field2494[field2481 + 1];
                field2488[field2479++] = var284.substring(var285, var286);
                return;
            }
            if (arg0 == 4119) {
                String var287 = field2488[--field2479];
                StringBuffer var288 = new StringBuffer(var287.length());
                boolean var289 = false;
                for (int var290 = 0; var290 < var287.length(); var290++) {
                    char var291 = var287.charAt(var290);
                    if (var291 == '<') {
                        var289 = true;
                    } else if (var291 == '>') {
                        var289 = false;
                    } else if (!var289) {
                        var288.append(var291);
                    }
                }
                field2488[field2479++] = var288.toString();
                return;
            }
            if (arg0 == 4120) {
                String var292 = field2488[--field2479];
                field2481 -= 2;
                int var293 = field2494[field2481];
                int var294 = field2494[field2481 + 1];
                field2494[field2481++] = var292.indexOf(var293, var294);
                return;
            }
            if (arg0 == 4121) {
                field2479 -= 2;
                String var295 = field2488[field2479];
                String var296 = field2488[field2479 + 1];
                int var297 = field2494[--field2481];
                field2494[field2481++] = var295.indexOf(var296, var297);
                return;
            }
            if (arg0 == 4122) {
                int var298 = field2494[--field2481];
                field2494[field2481++] = Character.toLowerCase((char) var298);
                return;
            }
            if (arg0 == 4123) {
                int var299 = field2494[--field2481];
                field2494[field2481++] = Character.toUpperCase((char) var299);
                return;
            }
            if (arg0 == 4124) {
                boolean var300 = field2494[--field2481] != 0;
                int var301 = field2494[--field2481];
                field2488[field2479++] = class145.method843(class250.field3068, 7110, (long) var301, var300, 0);
                return;
            }
            if (arg0 == 4125) {
                String var302 = field2488[--field2479];
                int var303 = field2494[--field2481];
                class595 var304 = class548.method2964((byte) 11, class301.field3700, 0, var303);
                field2494[field2481++] = var304.method3271(class677.field9502, var302, 68);
                return;
            }
        } else if (arg0 < 4300) {
            if (arg0 == 4200) {
                int var305 = field2494[--field2481];
                field2488[field2479++] = class633.field8881.method434(12388, var305).field34;
                return;
            }
            if (arg0 == 4201) {
                field2481 -= 2;
                int var306 = field2494[field2481];
                int var307 = field2494[field2481 + 1];
                class3 var308 = class633.field8881.method434(12388, var306);
                if (var307 >= 1 && var307 <= 5 && var308.field39[var307 - 1] != null) {
                    field2488[field2479++] = var308.field39[var307 - 1];
                    return;
                }
                field2488[field2479++] = "";
                return;
            }
            if (arg0 == 4202) {
                field2481 -= 2;
                int var309 = field2494[field2481];
                int var310 = field2494[field2481 + 1];
                class3 var311 = class633.field8881.method434(12388, var309);
                if (var310 >= 1 && var310 <= 5 && var311.field53[var310 - 1] != null) {
                    field2488[field2479++] = var311.field53[var310 - 1];
                    return;
                }
                field2488[field2479++] = "";
                return;
            }
            if (arg0 == 4203) {
                int var312 = field2494[--field2481];
                field2494[field2481++] = class633.field8881.method434(12388, var312).field99;
                return;
            }
            if (arg0 == 4204) {
                int var313 = field2494[--field2481];
                field2494[field2481++] = class633.field8881.method434(12388, var313).field88 == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 4205) {
                int var314 = field2494[--field2481];
                class3 var315 = class633.field8881.method434(12388, var314);
                if (var315.field38 == -1 && var315.field100 >= 0) {
                    field2494[field2481++] = var315.field100;
                    return;
                }
                field2494[field2481++] = var314;
                return;
            }
            if (arg0 == 4206) {
                int var316 = field2494[--field2481];
                class3 var317 = class633.field8881.method434(12388, var316);
                if (var317.field38 >= 0 && var317.field100 >= 0) {
                    field2494[field2481++] = var317.field100;
                    return;
                }
                field2494[field2481++] = var316;
                return;
            }
            if (arg0 == 4207) {
                int var318 = field2494[--field2481];
                field2494[field2481++] = class633.field8881.method434(12388, var318).field33 ? 1 : 0;
                return;
            }
            if (arg0 == 4208) {
                field2481 -= 2;
                int var319 = field2494[field2481];
                int var320 = field2494[field2481 + 1];
                class207 var321 = class705.field9939.method2477((byte) 6, var320);
                if (var321.method1245(0)) {
                    field2488[field2479++] = class633.field8881.method434(12388, var319).method16(var321.field2632, var320, true);
                    return;
                }
                field2494[field2481++] = class633.field8881.method434(12388, var319).method18(var320, var321.field2627, -58);
                return;
            }
            if (arg0 == 4209) {
                field2481 -= 2;
                int var322 = field2494[field2481];
                int var323 = field2494[field2481 + 1] - 1;
                class3 var324 = class633.field8881.method434(12388, var322);
                if (var324.field61 == var323) {
                    field2494[field2481++] = var324.field97;
                    return;
                }
                if (var324.field79 == var323) {
                    field2494[field2481++] = var324.field75;
                    return;
                }
                field2494[field2481++] = -1;
                return;
            }
            if (arg0 == 4210) {
                String var325 = field2488[--field2479];
                int var326 = field2494[--field2481];
                class74.method442(-1, var326 == 1, var325);
                field2494[field2481++] = class530.field7163;
                return;
            }
            if (arg0 == 4211) {
                if (class182.field2328 != null && class467.field5936 < class530.field7163) {
                    field2494[field2481++] = class182.field2328[class467.field5936++] & 0xFFFF;
                    return;
                }
                field2494[field2481++] = -1;
                return;
            }
            if (arg0 == 4212) {
                class467.field5936 = 0;
                return;
            }
            if (arg0 == 4213) {
                int var327 = field2494[--field2481];
                field2494[field2481++] = class633.field8881.method434(12388, var327).field96;
                return;
            }
            if (arg0 == 4214) {
                String var328 = field2488[--field2479];
                field2481 -= 3;
                int var329 = field2494[field2481];
                int var330 = field2494[field2481 + 1];
                int var331 = field2494[field2481 + 2];
                class55.method353(var330, var329 == 1, var328, var331, 1986811992);
                field2494[field2481++] = class530.field7163;
                return;
            }
            if (arg0 == 4215) {
                field2479 -= 2;
                field2481 -= 2;
                String var332 = field2488[field2479];
                int var333 = field2494[field2481];
                int var334 = field2494[field2481 + 1];
                String var335 = field2488[field2479 + 1];
                class106.method601(var333 == 1, var335, 160, var334, var332);
                field2494[field2481++] = class530.field7163;
                return;
            }
        } else if (arg0 < 4400) {
            if (arg0 == 4300) {
                field2481 -= 2;
                int var336 = field2494[field2481];
                int var337 = field2494[field2481 + 1];
                class207 var338 = class705.field9939.method2477((byte) 6, var337);
                if (var338.method1245(0)) {
                    field2488[field2479++] = class287.field3581.method1490(var336, (byte) -64).method3224((byte) 122, var338.field2632, var337);
                    return;
                }
                field2494[field2481++] = class287.field3581.method1490(var336, (byte) -104).method3231(var338.field2627, var337, false);
                return;
            }
        } else if (arg0 < 4500) {
            if (arg0 == 4400) {
                field2481 -= 2;
                int var339 = field2494[field2481];
                int var340 = field2494[field2481 + 1];
                class207 var341 = class705.field9939.method2477((byte) 6, var340);
                if (var341.method1245(0)) {
                    field2488[field2479++] = class428.field5352.method3138((byte) 42, var339).method2358(var340, var341.field2632, 30569);
                    return;
                }
                field2494[field2481++] = class428.field5352.method3138((byte) 73, var339).method2351(var340, 118, var341.field2627);
                return;
            }
        } else if (arg0 < 4600) {
            if (arg0 == 4500) {
                field2481 -= 2;
                int var342 = field2494[field2481];
                int var343 = field2494[field2481 + 1];
                class207 var344 = class705.field9939.method2477((byte) 6, var343);
                if (var344.method1245(0)) {
                    field2488[field2479++] = class672.field9462.method1856(var342, 17796).method3032(false, var343, var344.field2632);
                    return;
                }
                field2494[field2481++] = class672.field9462.method1856(var342, 17796).method3029(var344.field2627, var343, -1);
                return;
            }
        } else if (arg0 < 4700 && arg0 == 4600) {
            int var345 = field2494[--field2481];
            class601 var346 = class591.field8297.method1900(var345, (byte) 124);
            if (var346.field8450 != null && var346.field8450.length > 0) {
                int var347 = 0;
                int var348 = var346.field8435[0];
                for (int var349 = 1; var349 < var346.field8450.length; var349++) {
                    if (var346.field8435[var349] > var348) {
                        var347 = var349;
                        var348 = var346.field8435[var349];
                    }
                }
                field2494[field2481++] = var346.field8450[var347];
                return;
            }
            field2494[field2481++] = var346.field8434;
            return;
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "()V")
    public static final void method1197() {
    }

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "()V")
    public static void method1198() {
        field2489 = null;
        field2493 = null;
        field2484 = null;
        field2476 = null;
        field2494 = null;
        field2488 = null;
        field2475 = null;
        field2495 = null;
        field2485 = null;
        field2491 = null;
        field2487 = null;
        field2499 = null;
        field2498 = null;
        field2497 = null;
    }

    @OriginalMember(owner = "client!uw", name = "c", descriptor = "(IZ)V")
    public static final void method1199(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(Lmea;I)V")
    private static final void method1200(class71 arg0, int arg1) {
        Object[] var2 = arg0.field963;
        int var3 = (Integer) var2[0];
        class517 var4 = class505.method2718(var3, true);
        if (var4 == null) {
            return;
        }
        field2489 = new int[var4.field7058];
        int var5 = 0;
        field2493 = new String[var4.field7059];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field957;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field956;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field952 == null ? -1 : arg0.field952.field6764;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field967;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field952 == null ? -1 : arg0.field952.field6834;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field954 == null ? -1 : arg0.field954.field6764;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field954 == null ? -1 : arg0.field954.field6834;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field964;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field955;
                }
                field2489[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field960;
                }
                field2493[var6++] = var9;
            }
        }
        field2500 = arg0.field961;
        method1194(var4, arg1);
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(Lqfa;II)V")
    public static final void method1201(class372 arg0, int arg1, int arg2) {
        class517 var3 = class122.method651(arg0, arg2, arg1, -6162);
        if (var3 == null) {
            return;
        }
        field2489 = new int[var3.field7058];
        field2493 = new String[var3.field7059];
        if (class367.field4669 == var3.field7061 || class654.field9222 == var3.field7061 || class444.field5608 == var3.field7061) {
            int var4 = 0;
            int var5 = 0;
            if (class147.field1887 != null) {
                var4 = class147.field1887.field6726;
                var5 = class147.field1887.field6724;
            }
            field2489[0] = class289.field3592.method944(2000) - var4;
            field2489[1] = class289.field3592.method941(108) - var5;
        }
        method1194(var3, 200000);
    }
}
