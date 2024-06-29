import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public class class760 {

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "[I")
    private static int[] field10344 = new int[3];

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "[I")
    private static int[] field10343 = new int[5];

    @OriginalMember(owner = "client!wca", name = "f", descriptor = "[J")
    private static long[] field10348 = new long[1000];

    @OriginalMember(owner = "client!wca", name = "u", descriptor = "[[I")
    private static int[][] field10363 = new int[5][5000];

    @OriginalMember(owner = "client!wca", name = "x", descriptor = "[Lcga;")
    private static class150[] field10366 = new class150[50];

    @OriginalMember(owner = "client!wca", name = "s", descriptor = "[Ljava/lang/String;")
    private static String[] field10361 = new String[1000];

    @OriginalMember(owner = "client!wca", name = "y", descriptor = "[I")
    private static int[] field10367 = new int[1000];

    @OriginalMember(owner = "client!wca", name = "n", descriptor = "I")
    private static int field10356 = 0;

    @OriginalMember(owner = "client!wca", name = "c", descriptor = "I")
    private static int field10345 = 0;

    @OriginalMember(owner = "client!wca", name = "o", descriptor = "I")
    private static int field10357 = 0;

    @OriginalMember(owner = "client!wca", name = "C", descriptor = "I")
    private static int field10371 = 0;

    @OriginalMember(owner = "client!wca", name = "r", descriptor = "Ltq;")
    public static class536 field10360 = new class536(4);

    @OriginalMember(owner = "client!wca", name = "F", descriptor = "I")
    private static int field10374 = 0;

    @OriginalMember(owner = "client!wca", name = "d", descriptor = "I")
    public static int field10346;

    @OriginalMember(owner = "client!wca", name = "i", descriptor = "I")
    public static int field10351;

    @OriginalMember(owner = "client!wca", name = "j", descriptor = "I")
    public static int field10352;

    @OriginalMember(owner = "client!wca", name = "k", descriptor = "I")
    public static int field10353;

    @OriginalMember(owner = "client!wca", name = "q", descriptor = "I")
    public static int field10359;

    @OriginalMember(owner = "client!wca", name = "t", descriptor = "I")
    public static int field10362;

    @OriginalMember(owner = "client!wca", name = "v", descriptor = "I")
    public static int field10364;

    @OriginalMember(owner = "client!wca", name = "w", descriptor = "I")
    public static int field10365;

    @OriginalMember(owner = "client!wca", name = "A", descriptor = "I")
    public static int field10369;

    @OriginalMember(owner = "client!wca", name = "D", descriptor = "I")
    public static int field10372;

    @OriginalMember(owner = "client!wca", name = "E", descriptor = "I")
    public static int field10373;

    @OriginalMember(owner = "client!wca", name = "g", descriptor = "Luaa;")
    private static class391 field10349;

    @OriginalMember(owner = "client!wca", name = "m", descriptor = "Luaa;")
    private static class391 field10355;

    @OriginalMember(owner = "client!wca", name = "z", descriptor = "Lqc;")
    private static class400 field10368;

    @OriginalMember(owner = "client!wca", name = "e", descriptor = "Lim;")
    private static class652 field10347;

    @OriginalMember(owner = "client!wca", name = "l", descriptor = "Lwja;")
    private static class7 field10354;

    @OriginalMember(owner = "client!wca", name = "p", descriptor = "[I")
    private static int[] field10358;

    @OriginalMember(owner = "client!wca", name = "B", descriptor = "[J")
    private static long[] field10370;

    @OriginalMember(owner = "client!wca", name = "h", descriptor = "[Ljava/lang/String;")
    private static String[] field10350;

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(I)J", line = 4)
    private static final long method4134(int arg0) {
        Long var1 = field10347.method3515(-1, class201.field2799.field6153 << 16 | arg0);
        return var1 == null ? -1L : var1;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(C)I", line = 13)
    private static final int method4135(char arg0) {
        return class161.method1024(arg0, 10) ? 1 : 0;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(IZ)V", line = 18)
    private static final void method4136(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 150) {
                field10356 -= 3;
                int var2 = field10367[field10356];
                int var3 = field10367[field10356 + 1];
                int var4 = field10367[field10356 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class391 var5 = class738.method4006(54, var2);
                if (var5.field5145 == null) {
                    var5.field5145 = new class391[var4 + 1];
                }
                if (var5.field5145.length <= var4) {
                    class391[] var6 = new class391[var4 + 1];
                    for (int var7 = 0; var7 < var5.field5145.length; var7++) {
                        var6[var7] = var5.field5145[var7];
                    }
                    var5.field5145 = var6;
                }
                if (var4 > 0 && var5.field5145[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class391 var8 = new class391();
                var8.field5007 = var3;
                var8.field5136 = var8.field5151 = var5.field5151;
                var8.field5039 = var4;
                var5.field5145[var4] = var8;
                if (arg1) {
                    field10355 = var8;
                } else {
                    field10349 = var8;
                }
                class776.method4255(var5, -1007);
                return;
            }
            if (arg0 == 151) {
                class391 var9 = arg1 ? field10355 : field10349;
                if (var9.field5039 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class391 var10 = class738.method4006(79, var9.field5151);
                var10.field5145[var9.field5039] = null;
                class776.method4255(var10, -1007);
                return;
            }
            if (arg0 == 152) {
                class391 var11 = class738.method4006(96, field10367[--field10356]);
                var11.field5145 = null;
                class776.method4255(var11, -1007);
                return;
            }
            if (arg0 == 200) {
                field10356 -= 2;
                int var12 = field10367[field10356];
                int var13 = field10367[field10356 + 1];
                class391 var14 = class752.method4075(var12, (byte) -94, var13);
                if (var14 != null && var13 != -1) {
                    field10367[field10356++] = 1;
                    if (arg1) {
                        field10355 = var14;
                        return;
                    }
                    field10349 = var14;
                    return;
                }
                field10367[field10356++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field10367[--field10356];
                class391 var16 = class738.method4006(101, var15);
                if (var16 != null) {
                    field10367[field10356++] = 1;
                    if (arg1) {
                        field10355 = var16;
                        return;
                    }
                    field10349 = var16;
                    return;
                }
                field10367[field10356++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field10367[--field10356];
                method4147(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field10367[--field10356];
                method4144(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field10356 -= 2;
                int var19 = field10367[field10356];
                int var20 = field10367[field10356 + 1];
                if (class422.field5564.field352 == null) {
                    return;
                }
                for (int var21 = 0; var21 < class77.field1082.length; var21++) {
                    if (class77.field1082[var21] == var19) {
                        class422.field5564.field352.method4113(var20, class115.field1518, var21, -120);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class415.field5487.length; var22++) {
                    if (class415.field5487[var22] == var19) {
                        class422.field5564.field352.method4113(var20, class115.field1518, var22, -127);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field10356 -= 2;
                int var23 = field10367[field10356];
                int var24 = field10367[field10356 + 1];
                if (class422.field5564.field352 == null) {
                    return;
                }
                class422.field5564.field352.method4112(var24, (byte) 42, var23);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field10367[--field10356] != 0;
                if (class422.field5564.field352 == null) {
                    return;
                }
                class422.field5564.field352.method4108(var25, false);
                return;
            }
            if (arg0 == 411) {
                field10356 -= 2;
                int var26 = field10367[field10356];
                int var27 = field10367[field10356 + 1];
                if (class422.field5564.field352 == null) {
                    return;
                }
                class422.field5564.field352.method4111(var26, var27, (byte) -107, class640.field8189);
                return;
            }
        } else if (!(arg0 < 1000 || arg0 >= 1100) || !(arg0 < 2000 || arg0 >= 2100)) {
            class391 var28;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var28 = class738.method4006(68, field10367[--field10356]);
            } else {
                var28 = arg1 ? field10355 : field10349;
            }
            if (arg0 == 1000) {
                field10356 -= 4;
                var28.field4993 = field10367[field10356];
                var28.field5114 = field10367[field10356 + 1];
                int var29 = field10367[field10356 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 5) {
                    var29 = 5;
                }
                int var30 = field10367[field10356 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 5) {
                    var30 = 5;
                }
                var28.field5085 = (byte) var29;
                var28.field5035 = (byte) var30;
                class776.method4255(var28, -1007);
                class602.method3250(-28156, var28);
                if (var28.field5039 == -1) {
                    class170.method1077(73, var28.field5151);
                }
                return;
            }
            if (arg0 == 1001) {
                field10356 -= 4;
                var28.field5014 = field10367[field10356];
                var28.field5045 = field10367[field10356 + 1];
                var28.field5090 = 0;
                var28.field5019 = 0;
                int var31 = field10367[field10356 + 2];
                if (var31 < 0) {
                    var31 = 0;
                } else if (var31 > 4) {
                    var31 = 4;
                }
                int var32 = field10367[field10356 + 3];
                if (var32 < 0) {
                    var32 = 0;
                } else if (var32 > 4) {
                    var32 = 4;
                }
                var28.field5004 = (byte) var31;
                var28.field5034 = (byte) var32;
                class776.method4255(var28, -1007);
                class602.method3250(-28156, var28);
                if (var28.field5007 == 0) {
                    class564.method3052(var28, false, -1);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var33 = field10367[--field10356] == 1;
                if (var28.field4986 != var33) {
                    var28.field4986 = var33;
                    class776.method4255(var28, -1007);
                }
                if (var28.field5039 == -1) {
                    class549.method2973(var28.field5151, (byte) 123);
                }
                return;
            }
            if (arg0 == 1004) {
                field10356 -= 2;
                var28.field5112 = field10367[field10356];
                var28.field5071 = field10367[field10356 + 1];
                class776.method4255(var28, -1007);
                class602.method3250(-28156, var28);
                if (var28.field5007 == 0) {
                    class564.method3052(var28, false, -1);
                }
                return;
            }
            if (arg0 == 1005) {
                var28.field5121 = field10367[--field10356] == 1;
                return;
            }
        } else if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
            class391 var34;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var34 = class738.method4006(66, field10367[--field10356]);
            } else {
                var34 = arg1 ? field10355 : field10349;
            }
            if (arg0 == 1100) {
                field10356 -= 2;
                var34.field4994 = field10367[field10356];
                if (var34.field4994 > var34.field4991 - var34.field5117) {
                    var34.field4994 = var34.field4991 - var34.field5117;
                }
                if (var34.field4994 < 0) {
                    var34.field4994 = 0;
                }
                var34.field4984 = field10367[field10356 + 1];
                if (var34.field4984 > var34.field5010 - var34.field5031) {
                    var34.field4984 = var34.field5010 - var34.field5031;
                }
                if (var34.field4984 < 0) {
                    var34.field4984 = 0;
                }
                class776.method4255(var34, -1007);
                if (var34.field5039 == -1) {
                    class34.method192(true, var34.field5151);
                }
                return;
            }
            if (arg0 == 1101) {
                var34.field5132 = field10367[--field10356];
                class776.method4255(var34, -1007);
                if (var34.field5039 == -1) {
                    class273.method1694(var34.field5151, 6);
                }
                return;
            }
            if (arg0 == 1102) {
                var34.field5159 = field10367[--field10356] == 1;
                class776.method4255(var34, -1007);
                return;
            }
            if (arg0 == 1103) {
                var34.field5079 = field10367[--field10356];
                class776.method4255(var34, -1007);
                return;
            }
            if (arg0 == 1104) {
                var34.field5087 = field10367[--field10356];
                class776.method4255(var34, -1007);
                return;
            }
            if (arg0 == 1105) {
                int var35 = field10367[--field10356];
                if (var34.field5160 != var35) {
                    var34.field5160 = var35;
                    class776.method4255(var34, -1007);
                }
                if (var34.field5039 == -1) {
                    class419.method2414(var34.field5151, (byte) -122);
                }
                return;
            }
            if (arg0 == 1106) {
                var34.field5082 = field10367[--field10356];
                class776.method4255(var34, -1007);
                return;
            }
            if (arg0 == 1107) {
                var34.field5074 = field10367[--field10356] == 1;
                class776.method4255(var34, -1007);
                return;
            }
            if (arg0 == 1108) {
                var34.field5135 = 1;
                var34.field5069 = field10367[--field10356];
                class776.method4255(var34, -1007);
                if (var34.field5039 == -1) {
                    class748.method4063(-79, var34.field5151);
                }
                return;
            }
            if (arg0 == 1109) {
                field10356 -= 6;
                var34.field4992 = field10367[field10356];
                var34.field5154 = field10367[field10356 + 1];
                var34.field5149 = field10367[field10356 + 2];
                var34.field5068 = field10367[field10356 + 3];
                var34.field5088 = field10367[field10356 + 4];
                var34.field5150 = field10367[field10356 + 5];
                class776.method4255(var34, -1007);
                if (var34.field5039 == -1) {
                    class663.method3609(var34.field5151, -2302);
                    class564.method3051(var34.field5151, -2029241008);
                }
                return;
            }
            if (arg0 == 1110) {
                int var36 = field10367[--field10356];
                if (var34.field5024 != var36) {
                    var34.field5024 = var36;
                    var34.field5113 = 0;
                    var34.field5029 = 1;
                    var34.field5142 = 0;
                    class11 var37 = var34.field5024 == -1 ? null : class143.field1864.method4265(true, var34.field5024);
                    if (var37 != null) {
                        class216.method1423(var34.field5113, 0, var37);
                    }
                    class776.method4255(var34, -1007);
                }
                if (var34.field5039 == -1) {
                    class270.method1688(true, var34.field5151);
                }
                return;
            }
            if (arg0 == 1111) {
                var34.field5138 = field10367[--field10356] == 1;
                class776.method4255(var34, -1007);
                return;
            }
            if (arg0 == 1112) {
                String var38 = field10361[--field10345];
                if (!var38.equals(var34.field5141)) {
                    var34.field5141 = var38;
                    class776.method4255(var34, -1007);
                }
                if (var34.field5039 == -1) {
                    class245.method1601(9, var34.field5151);
                }
                return;
            }
            if (arg0 == 1113) {
                var34.field5049 = field10367[--field10356];
                class776.method4255(var34, -1007);
                if (var34.field5039 == -1) {
                    class480.method2698(var34.field5151, 16);
                }
                return;
            }
            if (arg0 == 1114) {
                field10356 -= 3;
                var34.field5080 = field10367[field10356];
                var34.field5018 = field10367[field10356 + 1];
                var34.field5096 = field10367[field10356 + 2];
                class776.method4255(var34, -1007);
                return;
            }
            if (arg0 == 1115) {
                var34.field5106 = field10367[--field10356] == 1;
                class776.method4255(var34, -1007);
                return;
            }
            if (arg0 == 1116) {
                var34.field5043 = field10367[--field10356];
                class776.method4255(var34, -1007);
                return;
            }
            if (arg0 == 1117) {
                var34.field5042 = field10367[--field10356];
                class776.method4255(var34, -1007);
                return;
            }
            if (arg0 == 1118) {
                var34.field4985 = field10367[--field10356] == 1;
                class776.method4255(var34, -1007);
                return;
            }
            if (arg0 == 1119) {
                var34.field5131 = field10367[--field10356] == 1;
                class776.method4255(var34, -1007);
                return;
            }
            if (arg0 == 1120) {
                field10356 -= 2;
                var34.field4991 = field10367[field10356];
                var34.field5010 = field10367[field10356 + 1];
                class776.method4255(var34, -1007);
                if (var34.field5007 == 0) {
                    class564.method3052(var34, false, -1);
                }
                return;
            }
            if (arg0 == 1122) {
                var34.field4999 = field10367[--field10356] == 1;
                class776.method4255(var34, -1007);
                return;
            }
            if (arg0 == 1123) {
                var34.field5150 = field10367[--field10356];
                class776.method4255(var34, -1007);
                if (var34.field5039 == -1) {
                    class663.method3609(var34.field5151, -2302);
                }
                return;
            }
            if (arg0 == 1124) {
                int var39 = field10367[--field10356];
                var34.field5139 = var39 == 1;
                class776.method4255(var34, -1007);
                return;
            }
            if (arg0 == 1125) {
                field10356 -= 2;
                var34.field5028 = field10367[field10356];
                var34.field5108 = field10367[field10356 + 1];
                class776.method4255(var34, -1007);
                return;
            }
            if (arg0 == 1126) {
                var34.field5097 = field10367[--field10356];
                class776.method4255(var34, -1007);
                return;
            }
            if (arg0 == 1127) {
                field10356 -= 2;
                int var40 = field10367[field10356];
                int var41 = field10367[field10356 + 1];
                class558 var42 = class761.field10377.method4101(var40, 11);
                if (var42.field7096 != var41) {
                    var34.method2264(var40, var41, 30211);
                    return;
                }
                var34.method2265(var40, (byte) 55);
                return;
            }
            if (arg0 == 1128) {
                int var43 = field10367[--field10356];
                String var44 = field10361[--field10345];
                class558 var45 = class761.field10377.method4101(var43, 11);
                if (!var45.field7095.equals(var44)) {
                    var34.method2267(var44, 0, var43);
                    return;
                }
                var34.method2265(var43, (byte) 126);
                return;
            }
            if (arg0 == 1129 || arg0 == 1130) {
                int var52 = field10367[--field10356];
                if ((var34.field5007 == 5 || arg0 != 1129) && (var34.field5007 == 4 || arg0 != 1130)) {
                    if (var34.field5051 != var52) {
                        var34.field5051 = var52;
                        class776.method4255(var34, -1007);
                    }
                    if (var34.field5039 == -1) {
                        class20.method89(var34.field5151, 17);
                    }
                    return;
                }
                return;
            }
            if (arg0 == 1131) {
                field10356 -= 3;
                int var46 = field10367[field10356];
                short var47 = (short) field10367[field10356 + 1];
                short var48 = (short) field10367[field10356 + 2];
                if (var46 >= 0 && var46 < 5) {
                    var34.method2254(var46, (byte) 8, var47, var48);
                    class776.method4255(var34, -1007);
                    if (var34.field5039 == -1) {
                        class68.method394((byte) 71, var46, var34.field5151);
                    }
                    return;
                }
                return;
            }
            if (arg0 == 1132) {
                field10356 -= 3;
                int var49 = field10367[field10356];
                short var50 = (short) field10367[field10356 + 1];
                short var51 = (short) field10367[field10356 + 2];
                if (var49 >= 0 && var49 < 5) {
                    var34.method2257(var51, -1, var49, var50);
                    class776.method4255(var34, -1007);
                    if (var34.field5039 == -1) {
                        class174.method1089(var34.field5151, var49, false);
                    }
                    return;
                }
                return;
            }
        } else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
            class391 var53;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var53 = class738.method4006(107, field10367[--field10356]);
            } else {
                var53 = arg1 ? field10355 : field10349;
            }
            class776.method4255(var53, -1007);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field10356 -= 2;
                int var54 = field10367[field10356];
                int var55 = field10367[field10356 + 1];
                if (var53.field5039 == -1) {
                    class535.method2917((byte) 124, var53.field5151);
                    class663.method3609(var53.field5151, -2302);
                    class564.method3051(var53.field5151, -2029241008);
                }
                if (var54 == -1) {
                    var53.field5135 = 1;
                    var53.field5069 = -1;
                    var53.field5128 = -1;
                    return;
                }
                var53.field5128 = var54;
                var53.field4997 = var55;
                if (arg0 == 1208 || arg0 == 1209) {
                    var53.field5103 = true;
                } else {
                    var53.field5103 = false;
                }
                class48 var56 = class640.field8189.method705(var54, -11467);
                var53.field5149 = var56.field595;
                var53.field5068 = var56.field627;
                var53.field5088 = var56.field560;
                var53.field4992 = var56.field592;
                var53.field5154 = var56.field571;
                var53.field5150 = var56.field578;
                if (arg0 == 1205 || arg0 == 1209) {
                    var53.field5123 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var53.field5123 = 1;
                } else {
                    var53.field5123 = 2;
                }
                if (var53.field5090 > 0) {
                    var53.field5150 = var53.field5150 * 32 / var53.field5090;
                    return;
                }
                if (var53.field5014 > 0) {
                    var53.field5150 = var53.field5150 * 32 / var53.field5014;
                }
                return;
            }
            if (arg0 == 1201) {
                var53.field5135 = 2;
                var53.field5069 = field10367[--field10356];
                if (var53.field5039 == -1) {
                    class748.method4063(-52, var53.field5151);
                }
                return;
            }
            if (arg0 == 1202) {
                var53.field5135 = 3;
                var53.field5069 = -1;
                if (var53.field5039 == -1) {
                    class748.method4063(-112, var53.field5151);
                }
                return;
            }
            if (arg0 == 1203) {
                var53.field5135 = 6;
                var53.field5069 = field10367[--field10356];
                if (var53.field5039 == -1) {
                    class748.method4063(-88, var53.field5151);
                }
                return;
            }
            if (arg0 == 1204) {
                var53.field5135 = 5;
                var53.field5069 = field10367[--field10356];
                if (var53.field5039 == -1) {
                    class748.method4063(-73, var53.field5151);
                }
                return;
            }
            if (arg0 == 1206) {
                field10356 -= 4;
                var53.field5012 = field10367[field10356];
                var53.field5057 = field10367[field10356 + 1];
                var53.field5037 = field10367[field10356 + 2];
                var53.field5102 = field10367[field10356 + 3];
                class776.method4255(var53, -1007);
                return;
            }
            if (arg0 == 1207) {
                field10356 -= 2;
                var53.field5093 = field10367[field10356];
                var53.field5104 = field10367[field10356 + 1];
                class776.method4255(var53, -1007);
                return;
            }
            if (arg0 == 1210) {
                field10356 -= 4;
                var53.field5069 = field10367[field10356];
                var53.field5027 = field10367[field10356 + 1];
                if (field10367[field10356 + 2] == 1) {
                    var53.field5135 = 9;
                } else {
                    var53.field5135 = 8;
                }
                if (field10367[field10356 + 3] == 1) {
                    var53.field5103 = true;
                } else {
                    var53.field5103 = false;
                }
                if (var53.field5039 == -1) {
                    class748.method4063(-124, var53.field5151);
                }
                return;
            }
            if (arg0 == 1211) {
                var53.field5135 = 5;
                var53.field5069 = class330.field4043;
                var53.field5027 = 0;
                if (var53.field5039 == -1) {
                    class748.method4063(-83, var53.field5151);
                }
                return;
            }
        } else if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
            class391 var57;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var57 = class738.method4006(73, field10367[--field10356]);
            } else {
                var57 = arg1 ? field10355 : field10349;
            }
            if (arg0 == 1300) {
                int var58 = field10367[--field10356] - 1;
                if (var58 >= 0 && var58 <= 9) {
                    var57.method2259(field10361[--field10345], var58, 0);
                    return;
                }
                field10345--;
                return;
            }
            if (arg0 == 1301) {
                field10356 -= 2;
                int var59 = field10367[field10356];
                int var60 = field10367[field10356 + 1];
                if (var59 == -1 && var60 == -1) {
                    var57.field4995 = null;
                    return;
                }
                var57.field4995 = class752.method4075(var59, (byte) -91, var60);
                return;
            }
            if (arg0 == 1302) {
                int var61 = field10367[--field10356];
                if (class674.field8724 != var61 && class243.field3339 != var61 && class719.field9454 != var61) {
                    return;
                }
                var57.field5152 = var61;
                return;
            }
            if (arg0 == 1303) {
                var57.field5124 = field10367[--field10356];
                return;
            }
            if (arg0 == 1304) {
                var57.field5009 = field10367[--field10356];
                return;
            }
            if (arg0 == 1305) {
                var57.field5008 = field10361[--field10345];
                return;
            }
            if (arg0 == 1306) {
                var57.field5116 = field10361[--field10345];
                return;
            }
            if (arg0 == 1307) {
                var57.field5013 = null;
                return;
            }
            if (arg0 == 1308) {
                var57.field5143 = field10367[--field10356];
                var57.field5156 = field10367[--field10356];
                return;
            }
            if (arg0 == 1309) {
                int var62 = field10367[--field10356];
                int var63 = field10367[--field10356];
                if (var63 >= 1 && var63 <= 10) {
                    var57.method2261((byte) 21, var62, var63 - 1);
                }
                return;
            }
            if (arg0 == 1310) {
                var57.field5134 = field10361[--field10345];
                return;
            }
            if (arg0 == 1311) {
                var57.field5036 = field10367[--field10356];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var64;
                int var65;
                int var66;
                if (arg0 == 1312) {
                    field10356 -= 3;
                    var64 = field10367[field10356] - 1;
                    var65 = field10367[field10356 + 1];
                    var66 = field10367[field10356 + 2];
                    if (var64 < 0 || var64 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field10356 -= 2;
                    var64 = 10;
                    var65 = field10367[field10356];
                    var66 = field10367[field10356 + 1];
                }
                if (var57.field5052 == null) {
                    if (var65 == 0) {
                        return;
                    }
                    var57.field5052 = new byte[11];
                    var57.field5076 = new byte[11];
                    var57.field5140 = new int[11];
                }
                var57.field5052[var64] = (byte) var65;
                if (var65 == 0) {
                    var57.field5060 = false;
                    for (int var67 = 0; var67 < var57.field5052.length; var67++) {
                        if (var57.field5052[var67] != 0) {
                            var57.field5060 = true;
                            break;
                        }
                    }
                } else {
                    var57.field5060 = true;
                }
                var57.field5076[var64] = (byte) var66;
                return;
            }
            if (arg0 == 1314) {
                var57.field5153 = field10367[--field10356];
                return;
            }
        } else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
            class391 var68;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var68 = class738.method4006(88, field10367[--field10356]);
            } else {
                var68 = arg1 ? field10355 : field10349;
            }
            if (arg0 == 1499) {
                var68.method2260(16);
                return;
            }
            String var69 = field10361[--field10345];
            int[] var70 = null;
            if (var69.length() > 0 && var69.charAt(var69.length() - 1) == 'Y') {
                int var71 = field10367[--field10356];
                if (var71 > 0) {
                    var70 = new int[var71];
                    while (var71-- > 0) {
                        var70[var71] = field10367[--field10356];
                    }
                }
                var69 = var69.substring(0, var69.length() - 1);
            }
            Object[] var72 = new Object[var69.length() + 1];
            for (int var73 = var72.length - 1; var73 >= 1; var73--) {
                if (var69.charAt(var73 - 1) == 's') {
                    var72[var73] = field10361[--field10345];
                } else if (var69.charAt(var73 - 1) == '§') {
                    var72[var73] = Long.valueOf(field10348[--field10357]);
                } else {
                    var72[var73] = Integer.valueOf(field10367[--field10356]);
                }
            }
            int var74 = field10367[--field10356];
            if (var74 == -1) {
                var72 = null;
            } else {
                var72[0] = Integer.valueOf(var74);
            }
            if (arg0 == 1400) {
                var68.field5158 = var72;
            } else if (arg0 == 1401) {
                var68.field5137 = var72;
            } else if (arg0 == 1402) {
                var68.field5026 = var72;
            } else if (arg0 == 1403) {
                var68.field5015 = var72;
            } else if (arg0 == 1404) {
                var68.field5059 = var72;
            } else if (arg0 == 1405) {
                var68.field5050 = var72;
            } else if (arg0 == 1406) {
                var68.field5061 = var72;
            } else if (arg0 == 1407) {
                var68.field5040 = var72;
                var68.field5081 = var70;
            } else if (arg0 == 1408) {
                var68.field5101 = var72;
            } else if (arg0 == 1409) {
                var68.field5146 = var72;
            } else if (arg0 == 1410) {
                var68.field5023 = var72;
            } else if (arg0 == 1411) {
                var68.field5111 = var72;
            } else if (arg0 == 1412) {
                var68.field5072 = var72;
            } else if (arg0 == 1414) {
                var68.field4988 = var72;
                var68.field5129 = var70;
            } else if (arg0 == 1415) {
                var68.field5091 = var72;
                var68.field5017 = var70;
            } else if (arg0 == 1416) {
                var68.field5157 = var72;
            } else if (arg0 == 1417) {
                var68.field5054 = var72;
            } else if (arg0 == 1418) {
                var68.field5077 = var72;
            } else if (arg0 == 1419) {
                var68.field5127 = var72;
            } else if (arg0 == 1420) {
                var68.field4990 = var72;
            } else if (arg0 == 1421) {
                var68.field5000 = var72;
            } else if (arg0 == 1422) {
                var68.field5064 = var72;
            } else if (arg0 == 1423) {
                var68.field5155 = var72;
            } else if (arg0 == 1424) {
                var68.field5147 = var72;
            } else if (arg0 == 1425) {
                var68.field5094 = var72;
            } else if (arg0 == 1426) {
                var68.field5044 = var72;
            } else if (arg0 == 1427) {
                var68.field5058 = var72;
            } else if (arg0 == 1428) {
                var68.field5021 = var72;
                var68.field5092 = var70;
            } else if (arg0 == 1429) {
                var68.field5099 = var72;
                var68.field5022 = var70;
            } else if (arg0 == 1430) {
                var68.field5002 = var72;
            } else if (arg0 == 1431) {
                var68.field5075 = var72;
            } else if (arg0 == 1432) {
                var68.field5122 = var72;
            }
            var68.field5098 = true;
            return;
        } else if (arg0 < 1600) {
            class391 var75 = arg1 ? field10355 : field10349;
            if (arg0 == 1500) {
                field10367[field10356++] = var75.field5119;
                return;
            }
            if (arg0 == 1501) {
                field10367[field10356++] = var75.field5003;
                return;
            }
            if (arg0 == 1502) {
                field10367[field10356++] = var75.field5117;
                return;
            }
            if (arg0 == 1503) {
                field10367[field10356++] = var75.field5031;
                return;
            }
            if (arg0 == 1504) {
                field10367[field10356++] = var75.field4986 ? 1 : 0;
                return;
            }
            if (arg0 == 1505) {
                field10367[field10356++] = var75.field5136;
                return;
            }
            if (arg0 == 1506) {
                class391 var76 = class679.method3655(var75, 0);
                field10367[field10356++] = var76 == null ? -1 : var76.field5151;
                return;
            }
        } else if (arg0 < 1700) {
            class391 var77 = arg1 ? field10355 : field10349;
            if (arg0 == 1600) {
                field10367[field10356++] = var77.field4994;
                return;
            }
            if (arg0 == 1601) {
                field10367[field10356++] = var77.field4984;
                return;
            }
            if (arg0 == 1602) {
                field10361[field10345++] = var77.field5141;
                return;
            }
            if (arg0 == 1603) {
                field10367[field10356++] = var77.field4991;
                return;
            }
            if (arg0 == 1604) {
                field10367[field10356++] = var77.field5010;
                return;
            }
            if (arg0 == 1605) {
                field10367[field10356++] = var77.field5150;
                return;
            }
            if (arg0 == 1606) {
                field10367[field10356++] = var77.field5149;
                return;
            }
            if (arg0 == 1607) {
                field10367[field10356++] = var77.field5088;
                return;
            }
            if (arg0 == 1608) {
                field10367[field10356++] = var77.field5068;
                return;
            }
            if (arg0 == 1609) {
                field10367[field10356++] = var77.field5079;
                return;
            }
            if (arg0 == 1610) {
                field10367[field10356++] = var77.field4992;
                return;
            }
            if (arg0 == 1611) {
                field10367[field10356++] = var77.field5154;
                return;
            }
            if (arg0 == 1612) {
                field10367[field10356++] = var77.field5160;
                return;
            }
            if (arg0 == 1613) {
                int var78 = field10367[--field10356];
                class558 var79 = class761.field10377.method4101(var78, 11);
                if (var79.method3029(true)) {
                    field10361[field10345++] = var77.method2256(var78, var79.field7095, -100);
                    return;
                }
                field10367[field10356++] = var77.method2258(var78, var79.field7096, -23907);
                return;
            }
            if (arg0 == 1614) {
                field10367[field10356++] = var77.field5082;
                return;
            }
            if (arg0 == 2614) {
                field10367[field10356++] = var77.field5135 == 1 ? var77.field5069 : -1;
                return;
            }
        } else if (arg0 < 1800) {
            class391 var80 = arg1 ? field10355 : field10349;
            if (arg0 == 1700) {
                field10367[field10356++] = var80.field5128;
                return;
            }
            if (arg0 == 1701) {
                if (var80.field5128 != -1) {
                    field10367[field10356++] = var80.field4997;
                    return;
                }
                field10367[field10356++] = 0;
                return;
            }
            if (arg0 == 1702) {
                field10367[field10356++] = var80.field5039;
                return;
            }
        } else if (arg0 < 1900) {
            class391 var81 = arg1 ? field10355 : field10349;
            if (arg0 == 1800) {
                field10367[field10356++] = client.method2637(var81).method2130((byte) -90);
                return;
            }
            if (arg0 == 1801) {
                int var82 = field10367[--field10356];
                int var383 = var82 - 1;
                if (var81.field5013 != null && var383 < var81.field5013.length && var81.field5013[var383] != null) {
                    field10361[field10345++] = var81.field5013[var383];
                    return;
                }
                field10361[field10345++] = "";
                return;
            }
            if (arg0 == 1802) {
                if (var81.field5008 == null) {
                    field10361[field10345++] = "";
                    return;
                }
                field10361[field10345++] = var81.field5008;
                return;
            }
        } else if (arg0 < 2000 || !(arg0 < 2900 || arg0 >= 3000)) {
            class391 var381;
            if (arg0 >= 2000) {
                var381 = class738.method4006(102, field10367[--field10356]);
                arg0 -= 1000;
            } else {
                var381 = arg1 ? field10355 : field10349;
            }
            if (field10374 >= 10) {
                throw new RuntimeException("C29xx-1");
            }
            if (arg0 == 1927) {
                if (var381.field5058 == null) {
                    return;
                }
                class244 var382 = new class244();
                var382.field3350 = var381;
                var382.field3349 = var381.field5058;
                var382.field3345 = field10374 + 1;
                class251.field3427.method3593(var382, 15);
                return;
            }
        } else if (arg0 < 2600) {
            class391 var83 = class738.method4006(28, field10367[--field10356]);
            if (arg0 == 2500) {
                field10367[field10356++] = var83.field5119;
                return;
            }
            if (arg0 == 2501) {
                field10367[field10356++] = var83.field5003;
                return;
            }
            if (arg0 == 2502) {
                field10367[field10356++] = var83.field5117;
                return;
            }
            if (arg0 == 2503) {
                field10367[field10356++] = var83.field5031;
                return;
            }
            if (arg0 == 2504) {
                field10367[field10356++] = var83.field4986 ? 1 : 0;
                return;
            }
            if (arg0 == 2505) {
                field10367[field10356++] = var83.field5136;
                return;
            }
            if (arg0 == 1506) {
                class391 var84 = class679.method3655(var83, 0);
                field10367[field10356++] = var84 == null ? -1 : var84.field5151;
                return;
            }
        } else if (arg0 < 2700) {
            class391 var85 = class738.method4006(52, field10367[--field10356]);
            if (arg0 == 2600) {
                field10367[field10356++] = var85.field4994;
                return;
            }
            if (arg0 == 2601) {
                field10367[field10356++] = var85.field4984;
                return;
            }
            if (arg0 == 2602) {
                field10361[field10345++] = var85.field5141;
                return;
            }
            if (arg0 == 2603) {
                field10367[field10356++] = var85.field4991;
                return;
            }
            if (arg0 == 2604) {
                field10367[field10356++] = var85.field5010;
                return;
            }
            if (arg0 == 2605) {
                field10367[field10356++] = var85.field5150;
                return;
            }
            if (arg0 == 2606) {
                field10367[field10356++] = var85.field5149;
                return;
            }
            if (arg0 == 2607) {
                field10367[field10356++] = var85.field5088;
                return;
            }
            if (arg0 == 2608) {
                field10367[field10356++] = var85.field5068;
                return;
            }
            if (arg0 == 2609) {
                field10367[field10356++] = var85.field5079;
                return;
            }
            if (arg0 == 2610) {
                field10367[field10356++] = var85.field4992;
                return;
            }
            if (arg0 == 2611) {
                field10367[field10356++] = var85.field5154;
                return;
            }
            if (arg0 == 2612) {
                field10367[field10356++] = var85.field5160;
                return;
            }
            if (arg0 == 2613) {
                field10367[field10356++] = var85.field5082;
                return;
            }
            if (arg0 == 2614) {
                field10367[field10356++] = var85.field5135 == 1 ? var85.field5069 : -1;
                return;
            }
        } else if (arg0 < 2800) {
            if (arg0 == 2700) {
                class391 var86 = class738.method4006(100, field10367[--field10356]);
                field10367[field10356++] = var86.field5128;
                return;
            }
            if (arg0 == 2701) {
                class391 var87 = class738.method4006(31, field10367[--field10356]);
                if (var87.field5128 != -1) {
                    field10367[field10356++] = var87.field4997;
                    return;
                }
                field10367[field10356++] = 0;
                return;
            }
            if (arg0 == 2702) {
                int var88 = field10367[--field10356];
                class278 var89 = (class278) class149.field1895.method2616((long) var88, (byte) -96);
                if (var89 != null) {
                    field10367[field10356++] = 1;
                    return;
                }
                field10367[field10356++] = 0;
                return;
            }
            if (arg0 == 2703) {
                class391 var90 = class738.method4006(28, field10367[--field10356]);
                if (var90.field5145 == null) {
                    field10367[field10356++] = 0;
                    return;
                }
                int var91 = var90.field5145.length;
                for (int var92 = 0; var92 < var90.field5145.length; var92++) {
                    if (var90.field5145[var92] == null) {
                        var91 = var92;
                        break;
                    }
                }
                field10367[field10356++] = var91;
                return;
            }
            if (arg0 == 2704 || arg0 == 2705) {
                field10356 -= 2;
                int var93 = field10367[field10356];
                int var94 = field10367[field10356 + 1];
                class278 var95 = (class278) class149.field1895.method2616((long) var93, (byte) 9);
                if (var95 != null && var95.field3617 == var94) {
                    field10367[field10356++] = 1;
                    return;
                } else {
                    field10367[field10356++] = 0;
                    return;
                }
            }
        } else if (arg0 < 2900) {
            class391 var96 = class738.method4006(64, field10367[--field10356]);
            if (arg0 == 2800) {
                field10367[field10356++] = client.method2637(var96).method2130((byte) 28);
                return;
            }
            if (arg0 == 2801) {
                int var97 = field10367[--field10356];
                int var384 = var97 - 1;
                if (var96.field5013 != null && var384 < var96.field5013.length && var96.field5013[var384] != null) {
                    field10361[field10345++] = var96.field5013[var384];
                    return;
                }
                field10361[field10345++] = "";
                return;
            }
            if (arg0 == 2802) {
                if (var96.field5008 == null) {
                    field10361[field10345++] = "";
                    return;
                }
                field10361[field10345++] = var96.field5008;
                return;
            }
        } else if (arg0 < 3200) {
            if (arg0 == 3100) {
                String var98 = field10361[--field10345];
                class310.method1824(var98, 10796);
                return;
            }
            if (arg0 == 3101) {
                field10356 -= 2;
                class547.method2959(field10367[field10356], field10367[field10356 + 1], class422.field5564, 0);
                return;
            }
            if (arg0 == 3103) {
                class541.method2945(-20621, true);
                return;
            }
            if (arg0 == 3104) {
                String var99 = field10361[--field10345];
                int var100 = 0;
                if (class296.method1771(var99, -125)) {
                    var100 = class530.method2908((byte) 59, var99);
                }
                field10359++;
                class13 var101 = class659.method3587(class68.field909, 98, class136.field1794);
                var101.field130.method1496(var100, (byte) -126);
                class116.method679(var101, 0);
                return;
            }
            if (arg0 == 3105) {
                String var102 = field10361[--field10345];
                field10352++;
                class13 var103 = class659.method3587(class68.field909, 98, class564.field7162);
                var103.field130.method1491(-129, var102.length() + 1);
                var103.field130.method1547(var102, -6457);
                class116.method679(var103, 0);
                return;
            }
            if (arg0 == 3106) {
                String var104 = field10361[--field10345];
                field10362++;
                class13 var105 = class659.method3587(class68.field909, 98, class583.field7371);
                var105.field130.method1491(-129, var104.length() + 1);
                var105.field130.method1547(var104, -6457);
                class116.method679(var105, 0);
                return;
            }
            if (arg0 == 3107) {
                int var106 = field10367[--field10356];
                String var107 = field10361[--field10345];
                class333.method1924(var107, -25860, var106);
                return;
            }
            if (arg0 == 3108) {
                field10356 -= 3;
                int var108 = field10367[field10356];
                int var109 = field10367[field10356 + 1];
                int var110 = field10367[field10356 + 2];
                class391 var111 = class738.method4006(105, var110);
                class515.method2852(var111, var109, var108, 118);
                return;
            }
            if (arg0 == 3109) {
                field10356 -= 2;
                int var112 = field10367[field10356];
                int var113 = field10367[field10356 + 1];
                class391 var114 = arg1 ? field10355 : field10349;
                class515.method2852(var114, var113, var112, 120);
                return;
            }
            if (arg0 == 3110) {
                int var115 = field10367[--field10356];
                field10351++;
                class13 var116 = class659.method3587(class68.field909, 98, class71.field963);
                var116.field130.method1541(374, var115);
                class116.method679(var116, 0);
                return;
            }
            if (arg0 == 3111) {
                field10356 -= 2;
                int var117 = field10367[field10356];
                int var118 = field10367[field10356 + 1];
                class278 var119 = (class278) class149.field1895.method2616((long) var117, (byte) 34);
                if (var119 != null) {
                    class24.method107((byte) -41, var119, var119.field3617 != var118, true);
                }
                class76.method471(true, 3, var117, (byte) -95, var118);
                return;
            }
            if (arg0 == 3112) {
                field10356--;
                int var120 = field10367[field10356];
                class278 var121 = (class278) class149.field1895.method2616((long) var120, (byte) -99);
                if (var121 != null && var121.field3613 == 3) {
                    class24.method107((byte) -93, var121, true, true);
                }
                return;
            }
            if (arg0 == 3113) {
                class306.method1809(field10361[--field10345], 35);
                return;
            }
            if (arg0 == 3114) {
                field10356 -= 2;
                int var122 = field10367[field10356];
                int var123 = field10367[field10356 + 1];
                String var124 = field10361[--field10345];
                class416.method2405(var123, "", "", "", var124, var122, -1);
                return;
            }
            if (arg0 == 3115) {
                field10356 -= 11;
                class759[] var125 = class166.method1061(0);
                class20[] var126 = class549.method2972(-2);
                class78.method484(field10367[field10356 + 2], field10367[field10356 + 6], field10367[field10356 + 5], field10367[field10356 + 4], field10367[field10356 + 8], field10367[field10356 + 3], var126[field10367[field10356 + 1]], field10367[field10356 + 9], field10367[field10356 + 7], (byte) -123, field10367[field10356 + 10], var125[field10367[field10356]]);
                return;
            }
            if (arg0 == 3116) {
                int var127 = field10367[--field10356];
                field10359++;
                class13 var128 = class659.method3587(class68.field909, 98, class459.field5987);
                var128.field130.method1541(374, var127);
                class116.method679(var128, 0);
                return;
            }
            if (arg0 == 3117) {
                String var129 = field10361[--field10345];
                class13 var130 = class659.method3587(class68.field909, 98, class264.field3518);
                var130.field130.method1491(-129, var129.length() + 1);
                var130.field130.method1547(var129, -6457);
                class116.method679(var130, 0);
                return;
            }
        } else if (arg0 < 3300) {
            if (arg0 == 3200) {
                field10356 -= 3;
                class380.method2165(9736, 255, field10367[field10356 + 1], 256, field10367[field10356], field10367[field10356 + 2]);
                return;
            }
            if (arg0 == 3201) {
                class117.method695(field10367[--field10356], 22610, 50, 255);
                return;
            }
            if (arg0 == 3202) {
                field10356 -= 2;
                class239.method1573(255, field10367[field10356], -1, field10367[field10356 + 1]);
                return;
            }
            if (arg0 == 3203) {
                field10356 -= 4;
                class380.method2165(9736, field10367[field10356 + 3], field10367[field10356 + 1], 256, field10367[field10356], field10367[field10356 + 2]);
                return;
            }
            if (arg0 == 3204) {
                field10356 -= 3;
                class117.method695(field10367[field10356], 22610, field10367[field10356 + 2], field10367[field10356 + 1]);
                return;
            }
            if (arg0 == 3205) {
                field10356 -= 3;
                class239.method1573(field10367[field10356 + 2], field10367[field10356], -1, field10367[field10356 + 1]);
                return;
            }
            if (arg0 == 3206) {
                field10356 -= 4;
                class590.method3173(field10367[field10356 + 3], 256, 0, field10367[field10356 + 2], false, field10367[field10356 + 1], field10367[field10356]);
                return;
            }
            if (arg0 == 3207) {
                field10356 -= 4;
                class590.method3173(field10367[field10356 + 3], 256, 0, field10367[field10356 + 2], true, field10367[field10356 + 1], field10367[field10356]);
                return;
            }
            if (arg0 == 3208) {
                field10356 -= 5;
                class380.method2165(9736, field10367[field10356 + 3], field10367[field10356 + 1], field10367[field10356 + 4], field10367[field10356], field10367[field10356 + 2]);
                return;
            }
            if (arg0 == 3209) {
                field10356 -= 5;
                class590.method3173(field10367[field10356 + 3], field10367[field10356 + 4], 0, field10367[field10356 + 2], false, field10367[field10356 + 1], field10367[field10356]);
                return;
            }
        } else if (arg0 < 3400) {
            if (arg0 == 3300) {
                field10367[field10356++] = class693.field8900;
                return;
            }
            if (arg0 == 3301) {
                field10356 -= 2;
                int var131 = field10367[field10356];
                int var132 = field10367[field10356 + 1];
                field10367[field10356++] = class63.method373(false, (byte) 70, var131, var132);
                return;
            }
            if (arg0 == 3302) {
                field10356 -= 2;
                int var133 = field10367[field10356];
                int var134 = field10367[field10356 + 1];
                field10367[field10356++] = class480.method2692(var134, var133, false, true);
                return;
            }
            if (arg0 == 3303) {
                field10356 -= 2;
                int var135 = field10367[field10356];
                int var136 = field10367[field10356 + 1];
                field10367[field10356++] = class582.method3117((byte) -55, false, var136, var135);
                return;
            }
            if (arg0 == 3304) {
                int var137 = field10367[--field10356];
                field10367[field10356++] = class515.field6571.method2823(var137, 5).field8246;
                return;
            }
            if (arg0 == 3305) {
                int var138 = field10367[--field10356];
                field10367[field10356++] = class776.field10598[var138];
                return;
            }
            if (arg0 == 3306) {
                int var139 = field10367[--field10356];
                field10367[field10356++] = class490.field6305[var139];
                return;
            }
            if (arg0 == 3307) {
                int var140 = field10367[--field10356];
                field10367[field10356++] = class704.field9309[var140];
                return;
            }
            if (arg0 == 3308) {
                byte var141 = class422.field5564.field2895;
                int var142 = (class422.field5564.field2896 >> 9) + class714.field9407;
                int var143 = (class422.field5564.field2900 >> 9) + class240.field3293;
                field10367[field10356++] = (var141 << 28) + (var142 << 14) + var143;
                return;
            }
            if (arg0 == 3309) {
                int var144 = field10367[--field10356];
                field10367[field10356++] = var144 >> 14 & 0x3FFF;
                return;
            }
            if (arg0 == 3310) {
                int var145 = field10367[--field10356];
                field10367[field10356++] = var145 >> 28;
                return;
            }
            if (arg0 == 3311) {
                int var146 = field10367[--field10356];
                field10367[field10356++] = var146 & 0x3FFF;
                return;
            }
            if (arg0 == 3312) {
                field10367[field10356++] = class216.field2939 ? 1 : 0;
                return;
            }
            if (arg0 == 3313) {
                field10356 -= 2;
                int var147 = field10367[field10356];
                int var148 = field10367[field10356 + 1];
                field10367[field10356++] = class63.method373(true, (byte) 70, var147, var148);
                return;
            }
            if (arg0 == 3314) {
                field10356 -= 2;
                int var149 = field10367[field10356];
                int var150 = field10367[field10356 + 1];
                field10367[field10356++] = class480.method2692(var150, var149, true, true);
                return;
            }
            if (arg0 == 3315) {
                field10356 -= 2;
                int var151 = field10367[field10356];
                int var152 = field10367[field10356 + 1];
                field10367[field10356++] = class582.method3117((byte) -55, true, var152, var151);
                return;
            }
            if (arg0 == 3316) {
                if (class20.field186 >= 2) {
                    field10367[field10356++] = class20.field186;
                    return;
                }
                field10367[field10356++] = 0;
                return;
            }
            if (arg0 == 3317) {
                field10367[field10356++] = class520.field6618;
                return;
            }
            if (arg0 == 3318) {
                field10367[field10356++] = class379.field4640.field3371;
                return;
            }
            if (arg0 == 3321) {
                field10367[field10356++] = class685.field8832;
                return;
            }
            if (arg0 == 3322) {
                field10367[field10356++] = class783.field10714;
                return;
            }
            if (arg0 == 3323) {
                if (class271.field3567 >= 5 && class271.field3567 <= 9) {
                    field10367[field10356++] = 1;
                    return;
                }
                field10367[field10356++] = 0;
                return;
            }
            if (arg0 == 3324) {
                if (class271.field3567 >= 5 && class271.field3567 <= 9) {
                    field10367[field10356++] = class271.field3567;
                    return;
                }
                field10367[field10356++] = 0;
                return;
            }
            if (arg0 == 3325) {
                field10367[field10356++] = class159.field2065 ? 1 : 0;
                return;
            }
            if (arg0 == 3326) {
                field10367[field10356++] = class422.field5564.field356;
                return;
            }
            if (arg0 == 3327) {
                field10367[field10356++] = class422.field5564.field352 != null && class422.field5564.field352.field10295 ? 1 : 0;
                return;
            }
            if (arg0 == 3329) {
                field10367[field10356++] = class776.field10593 ? 1 : 0;
                return;
            }
            if (arg0 == 3330) {
                int var153 = field10367[--field10356];
                field10367[field10356++] = class315.method1838(255, false, var153);
                return;
            }
            if (arg0 == 3331) {
                field10356 -= 2;
                int var154 = field10367[field10356];
                int var155 = field10367[field10356 + 1];
                field10367[field10356++] = class714.method3847(var155, var154, false, 1, false);
                return;
            }
            if (arg0 == 3332) {
                field10356 -= 2;
                int var156 = field10367[field10356];
                int var157 = field10367[field10356 + 1];
                field10367[field10356++] = class714.method3847(var157, var156, true, 1, false);
                return;
            }
            if (arg0 == 3333) {
                field10367[field10356++] = class530.field6723;
                return;
            }
            if (arg0 == 3335) {
                field10367[field10356++] = class496.field6338;
                return;
            }
            if (arg0 == 3336) {
                field10356 -= 4;
                int var158 = field10367[field10356];
                int var159 = field10367[field10356 + 1];
                int var160 = field10367[field10356 + 2];
                int var161 = field10367[field10356 + 3];
                int var162 = (var159 << 14) + var158;
                int var163 = (var160 << 28) + var162;
                int var164 = var161 + var163;
                field10367[field10356++] = var164;
                return;
            }
            if (arg0 == 3337) {
                field10367[field10356++] = class517.field6589;
                return;
            }
            if (arg0 == 3338) {
                field10367[field10356++] = class365.method2101(100);
                return;
            }
            if (arg0 == 3339) {
                field10367[field10356++] = 0;
                return;
            }
            if (arg0 == 3340) {
                field10367[field10356++] = class522.field6651 ? 1 : 0;
                return;
            }
            if (arg0 == 3341) {
                field10367[field10356++] = class597.field7580 ? 1 : 0;
                return;
            }
            if (arg0 == 3342) {
                field10367[field10356++] = class737.field9980.method210(0);
                return;
            }
            if (arg0 == 3343) {
                field10367[field10356++] = class737.field9980.method208(-67);
                return;
            }
            if (arg0 == 3344) {
                field10361[field10345++] = class135.method786(-55);
                return;
            }
            if (arg0 == 3345) {
                field10361[field10345++] = class56.method340(-107);
                return;
            }
            if (arg0 == 3346) {
                field10367[field10356++] = class781.method4282((byte) -73);
                return;
            }
            if (arg0 == 3347) {
                field10367[field10356++] = class96.field1305;
                return;
            }
            if (arg0 == 3349) {
                field10367[field10356++] = class422.field5564.field4728.method2797(23908) >> 3;
                return;
            }
        } else if (arg0 < 3500) {
            if (arg0 == 3400) {
                field10356 -= 2;
                int var165 = field10367[field10356];
                int var166 = field10367[field10356 + 1];
                class374 var167 = class407.field5416.method3669(var165, false);
                field10361[field10345++] = var167.method2148((byte) -88, var166);
                return;
            }
            if (arg0 == 3408) {
                field10356 -= 4;
                int var168 = field10367[field10356];
                int var169 = field10367[field10356 + 1];
                int var170 = field10367[field10356 + 2];
                int var171 = field10367[field10356 + 3];
                class374 var172 = class407.field5416.method3669(var170, false);
                if (var172.field4571 == var168 && var172.field4567 == var169) {
                    if (var169 == 115) {
                        field10361[field10345++] = var172.method2148((byte) -100, var171);
                        return;
                    }
                    field10367[field10356++] = var172.method2145(var171, -1);
                    return;
                }
                throw new RuntimeException("C3408-1 " + var170 + "-" + var171);
            }
            if (arg0 == 3409) {
                field10356 -= 3;
                int var173 = field10367[field10356];
                int var174 = field10367[field10356 + 1];
                int var175 = field10367[field10356 + 2];
                if (var174 == -1) {
                    throw new RuntimeException("C3409-2");
                }
                class374 var176 = class407.field5416.method3669(var174, false);
                if (var176.field4567 != var173) {
                    throw new RuntimeException("C3409-1");
                }
                field10367[field10356++] = var176.method2147(-21147, var175) ? 1 : 0;
                return;
            }
            if (arg0 == 3410) {
                int var177 = field10367[--field10356];
                String var178 = field10361[--field10345];
                if (var177 == -1) {
                    throw new RuntimeException("C3410-2");
                }
                class374 var179 = class407.field5416.method3669(var177, false);
                if (var179.field4567 != 's') {
                    throw new RuntimeException("C3410-1");
                }
                field10367[field10356++] = var179.method2146(49, var178) ? 1 : 0;
                return;
            }
            if (arg0 == 3411) {
                int var180 = field10367[--field10356];
                class374 var181 = class407.field5416.method3669(var180, false);
                field10367[field10356++] = var181.field4575.method2618(-1);
                return;
            }
        } else if (arg0 < 3700) {
            if (arg0 == 3600) {
                if (class317.field3951 == 0) {
                    field10367[field10356++] = -2;
                    return;
                }
                if (class317.field3951 == 1) {
                    field10367[field10356++] = -1;
                    return;
                }
                field10367[field10356++] = class703.field9297;
                return;
            }
            if (arg0 == 3601) {
                int var182 = field10367[--field10356];
                if (class317.field3951 == 2 && var182 < class703.field9297) {
                    field10361[field10345++] = class176.field2319[var182];
                    if (class686.field8837[var182] != null) {
                        field10361[field10345++] = class686.field8837[var182];
                        return;
                    }
                    field10361[field10345++] = "";
                    return;
                }
                field10361[field10345++] = "";
                field10361[field10345++] = "";
                return;
            }
            if (arg0 == 3602) {
                int var183 = field10367[--field10356];
                if (class317.field3951 == 2 && var183 < class703.field9297) {
                    field10367[field10356++] = class459.field5995[var183];
                    return;
                }
                field10367[field10356++] = 0;
                return;
            }
            if (arg0 == 3603) {
                int var184 = field10367[--field10356];
                if (class317.field3951 == 2 && var184 < class703.field9297) {
                    field10367[field10356++] = class645.field8248[var184];
                    return;
                }
                field10367[field10356++] = 0;
                return;
            }
            if (arg0 == 3604) {
                String var185 = field10361[--field10345];
                int var186 = field10367[--field10356];
                class246.method1606(1, var186, var185);
                return;
            }
            if (arg0 == 3605) {
                String var187 = field10361[--field10345];
                class338.method1950(var187, 0);
                return;
            }
            if (arg0 == 3606) {
                String var188 = field10361[--field10345];
                class547.method2962((byte) 4, var188);
                return;
            }
            if (arg0 == 3607) {
                String var189 = field10361[--field10345];
                class614.method3282(false, -86, var189);
                return;
            }
            if (arg0 == 3608) {
                String var190 = field10361[--field10345];
                class72.method432((byte) 74, var190);
                return;
            }
            if (arg0 == 3609) {
                String var191 = field10361[--field10345];
                if (var191.startsWith("<img=0>") || var191.startsWith("<img=1>")) {
                    var191 = var191.substring(7);
                }
                field10367[field10356++] = class345.method1999(121, var191) ? 1 : 0;
                return;
            }
            if (arg0 == 3610) {
                int var192 = field10367[--field10356];
                if (class317.field3951 == 2 && var192 < class703.field9297) {
                    field10361[field10345++] = class506.field6470[var192];
                    return;
                }
                field10361[field10345++] = "";
                return;
            }
            if (arg0 == 3611) {
                if (class221.field3005 != null) {
                    field10361[field10345++] = class374.method2139(class221.field3005, -3);
                    return;
                }
                field10361[field10345++] = "";
                return;
            }
            if (arg0 == 3612) {
                if (class221.field3005 != null) {
                    field10367[field10356++] = class566.field7170;
                    return;
                }
                field10367[field10356++] = 0;
                return;
            }
            if (arg0 == 3613) {
                int var193 = field10367[--field10356];
                if (class221.field3005 != null && var193 < class566.field7170) {
                    field10361[field10345++] = class638.field8105[var193].field1835;
                    return;
                }
                field10361[field10345++] = "";
                return;
            }
            if (arg0 == 3614) {
                int var194 = field10367[--field10356];
                if (class221.field3005 != null && var194 < class566.field7170) {
                    field10367[field10356++] = class638.field8105[var194].field1834;
                    return;
                }
                field10367[field10356++] = 0;
                return;
            }
            if (arg0 == 3615) {
                int var195 = field10367[--field10356];
                if (class221.field3005 != null && var195 < class566.field7170) {
                    field10367[field10356++] = class638.field8105[var195].field1831;
                    return;
                }
                field10367[field10356++] = 0;
                return;
            }
            if (arg0 == 3616) {
                field10367[field10356++] = class298.field3778;
                return;
            }
            if (arg0 == 3617) {
                String var196 = field10361[--field10345];
                class53.method330(-1, var196);
                return;
            }
            if (arg0 == 3618) {
                field10367[field10356++] = class77.field1083;
                return;
            }
            if (arg0 == 3619) {
                String var197 = field10361[--field10345];
                class504.method2795(false, var197);
                return;
            }
            if (arg0 == 3620) {
                class748.method4064(-107);
                return;
            }
            if (arg0 == 3621) {
                if (class317.field3951 == 0) {
                    field10367[field10356++] = -1;
                    return;
                }
                field10367[field10356++] = class738.field9988;
                return;
            }
            if (arg0 == 3622) {
                int var198 = field10367[--field10356];
                if (class317.field3951 != 0 && var198 < class738.field9988) {
                    field10361[field10345++] = class202.field2803[var198];
                    if (class281.field3634[var198] != null) {
                        field10361[field10345++] = class281.field3634[var198];
                        return;
                    }
                    field10361[field10345++] = "";
                    return;
                }
                field10361[field10345++] = "";
                field10361[field10345++] = "";
                return;
            }
            if (arg0 == 3623) {
                String var199 = field10361[--field10345];
                if (var199.startsWith("<img=0>") || var199.startsWith("<img=1>")) {
                    var199 = var199.substring(7);
                }
                field10367[field10356++] = class242.method1594(var199, true) ? 1 : 0;
                return;
            }
            if (arg0 == 3624) {
                int var200 = field10367[--field10356];
                if (class638.field8105 != null && var200 < class566.field7170 && class638.field8105[var200].field1829.equalsIgnoreCase(class422.field5564.field375)) {
                    field10367[field10356++] = 1;
                    return;
                }
                field10367[field10356++] = 0;
                return;
            }
            if (arg0 == 3625) {
                if (class357.field4353 != null) {
                    field10361[field10345++] = class357.field4353;
                    return;
                }
                field10361[field10345++] = "";
                return;
            }
            if (arg0 == 3626) {
                int var201 = field10367[--field10356];
                if (class221.field3005 != null && var201 < class566.field7170) {
                    field10361[field10345++] = class638.field8105[var201].field1832;
                    return;
                }
                field10361[field10345++] = "";
                return;
            }
            if (arg0 == 3627) {
                int var202 = field10367[--field10356];
                if (class317.field3951 == 2 && var202 >= 0 && var202 < class703.field9297) {
                    field10367[field10356++] = class341.field4181[var202] ? 1 : 0;
                    return;
                }
                field10367[field10356++] = 0;
                return;
            }
            if (arg0 == 3628) {
                String var203 = field10361[--field10345];
                if (var203.startsWith("<img=0>") || var203.startsWith("<img=1>")) {
                    var203 = var203.substring(7);
                }
                field10367[field10356++] = class479.method2687(var203, 9170);
                return;
            }
            if (arg0 == 3629) {
                field10367[field10356++] = class195.field2708;
                return;
            }
            if (arg0 == 3630) {
                String var204 = field10361[--field10345];
                class614.method3282(true, -64, var204);
                return;
            }
            if (arg0 == 3631) {
                int var205 = field10367[--field10356];
                field10367[field10356++] = class285.field3667[var205] ? 1 : 0;
                return;
            }
            if (arg0 == 3632) {
                int var206 = field10367[--field10356];
                if (class221.field3005 != null && var206 < class566.field7170) {
                    field10361[field10345++] = class638.field8105[var206].field1829;
                    return;
                }
                field10361[field10345++] = "";
                return;
            }
            if (arg0 == 3633) {
                int var207 = field10367[--field10356];
                if (class317.field3951 != 0 && var207 < class738.field9988) {
                    field10361[field10345++] = class278.field3616[var207];
                    return;
                }
                field10361[field10345++] = "";
                return;
            }
        } else if (arg0 < 3800) {
            if (arg0 == 3700) {
                if (class299.field3795 != null) {
                    field10367[field10356++] = 1;
                    field10347 = class299.field3795;
                    return;
                }
                field10367[field10356++] = 0;
                return;
            }
            if (arg0 == 3701) {
                if (class412.field5466 != null) {
                    field10367[field10356++] = 1;
                    field10347 = class412.field5466;
                    return;
                }
                field10367[field10356++] = 0;
                return;
            }
            if (arg0 == 3702) {
                field10361[field10345++] = field10347.field8315;
                return;
            }
            if (arg0 == 3703) {
                field10367[field10356++] = field10347.field8321 ? 1 : 0;
                return;
            }
            if (arg0 == 3704) {
                field10367[field10356++] = field10347.field8320;
                return;
            }
            if (arg0 == 3705) {
                field10367[field10356++] = field10347.field8317;
                return;
            }
            if (arg0 == 3706) {
                field10367[field10356++] = field10347.field8319;
                return;
            }
            if (arg0 == 3707) {
                field10367[field10356++] = field10347.field8324;
                return;
            }
            if (arg0 == 3709) {
                field10367[field10356++] = field10347.field8346;
                return;
            }
            if (arg0 == 3710) {
                int var208 = field10367[--field10356];
                field10361[field10345++] = field10347.field8343[var208];
                return;
            }
            if (arg0 == 3711) {
                int var209 = field10367[--field10356];
                field10367[field10356++] = field10347.field8341[var209];
                return;
            }
            if (arg0 == 3712) {
                field10367[field10356++] = field10347.field8333;
                return;
            }
            if (arg0 == 3713) {
                int var210 = field10367[--field10356];
                field10361[field10345++] = field10347.field8353[var210];
                return;
            }
            if (arg0 == 3714) {
                field10356 -= 3;
                int var211 = field10367[field10356];
                int var212 = field10367[field10356 + 1];
                int var213 = field10367[field10356 + 2];
                field10367[field10356++] = field10347.method3532(var212, (byte) -92, var211, var213);
                return;
            }
            if (arg0 == 3715) {
                field10367[field10356++] = field10347.field8348;
                return;
            }
            if (arg0 == 3716) {
                field10367[field10356++] = field10347.field8350;
                return;
            }
            if (arg0 == 3717) {
                field10367[field10356++] = field10347.method3514(31987, field10361[--field10345]);
                return;
            }
            if (arg0 == 3718) {
                field10367[field10356 - 1] = field10347.method3521(false)[field10367[field10356 - 1]];
                return;
            }
            if (arg0 == 3750) {
                if (class719.field9456 != null) {
                    field10367[field10356++] = 1;
                    field10368 = class719.field9456;
                    return;
                }
                field10367[field10356++] = 0;
                return;
            }
            if (arg0 == 3751) {
                if (class235.field3214 != null) {
                    field10367[field10356++] = 1;
                    field10368 = class235.field3214;
                    return;
                }
                field10367[field10356++] = 0;
                return;
            }
            if (arg0 == 3752) {
                field10361[field10345++] = field10368.field5299;
                return;
            }
            if (arg0 == 3753) {
                field10367[field10356++] = field10368.field5289;
                return;
            }
            if (arg0 == 3754) {
                field10367[field10356++] = field10368.field5287;
                return;
            }
            if (arg0 == 3755) {
                field10367[field10356++] = field10368.field5292;
                return;
            }
            if (arg0 == 3756) {
                int var214 = field10367[--field10356];
                field10361[field10345++] = field10368.field5293[var214].field10194;
                return;
            }
            if (arg0 == 3757) {
                int var215 = field10367[--field10356];
                field10367[field10356++] = field10368.field5293[var215].field10192;
                return;
            }
            if (arg0 == 3758) {
                int var216 = field10367[--field10356];
                field10367[field10356++] = field10368.field5293[var216].field10201;
                return;
            }
            if (arg0 == 3759) {
                int var217 = field10367[--field10356];
                class542.method2948(var217, 113, field10368 == class235.field3214);
                return;
            }
            if (arg0 == 3760) {
                field10367[field10356++] = field10368.method2315(field10361[--field10345], (byte) 121);
                return;
            }
            if (arg0 == 3761) {
                field10367[field10356 - 1] = field10368.method2312((byte) -126)[field10367[field10356 - 1]];
                return;
            }
        } else if (arg0 < 4000) {
            if (arg0 == 3903) {
                int var218 = field10367[--field10356];
                field10367[field10356++] = class704.field9311[var218].method115(8);
                return;
            }
            if (arg0 == 3904) {
                int var219 = field10367[--field10356];
                field10367[field10356++] = class704.field9311[var219].field236;
                return;
            }
            if (arg0 == 3905) {
                int var220 = field10367[--field10356];
                field10367[field10356++] = class704.field9311[var220].field234;
                return;
            }
            if (arg0 == 3906) {
                int var221 = field10367[--field10356];
                field10367[field10356++] = class704.field9311[var221].field231;
                return;
            }
            if (arg0 == 3907) {
                int var222 = field10367[--field10356];
                field10367[field10356++] = class704.field9311[var222].field232;
                return;
            }
            if (arg0 == 3908) {
                int var223 = field10367[--field10356];
                field10367[field10356++] = class704.field9311[var223].field235;
                return;
            }
            if (arg0 == 3910) {
                int var224 = field10367[--field10356];
                int var225 = class704.field9311[var224].method117(7);
                field10367[field10356++] = var225 == 0 ? 1 : 0;
                return;
            }
            if (arg0 == 3911) {
                int var226 = field10367[--field10356];
                int var227 = class704.field9311[var226].method117(7);
                field10367[field10356++] = var227 == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 3912) {
                int var228 = field10367[--field10356];
                int var229 = class704.field9311[var228].method117(7);
                field10367[field10356++] = var229 == 5 ? 1 : 0;
                return;
            }
            if (arg0 == 3913) {
                int var230 = field10367[--field10356];
                int var231 = class704.field9311[var230].method117(7);
                field10367[field10356++] = var231 == 1 ? 1 : 0;
                return;
            }
        } else if (arg0 < 4100) {
            if (arg0 == 4000) {
                field10356 -= 2;
                int var232 = field10367[field10356];
                int var233 = field10367[field10356 + 1];
                field10367[field10356++] = var232 + var233;
                return;
            }
            if (arg0 == 4001) {
                field10356 -= 2;
                int var234 = field10367[field10356];
                int var235 = field10367[field10356 + 1];
                field10367[field10356++] = var234 - var235;
                return;
            }
            if (arg0 == 4002) {
                field10356 -= 2;
                int var236 = field10367[field10356];
                int var237 = field10367[field10356 + 1];
                field10367[field10356++] = var236 * var237;
                return;
            }
            if (arg0 == 4003) {
                field10356 -= 2;
                int var238 = field10367[field10356];
                int var239 = field10367[field10356 + 1];
                field10367[field10356++] = var238 / var239;
                return;
            }
            if (arg0 == 4004) {
                int var240 = field10367[--field10356];
                field10367[field10356++] = (int) (Math.random() * (double) var240);
                return;
            }
            if (arg0 == 4005) {
                int var241 = field10367[--field10356];
                field10367[field10356++] = (int) (Math.random() * (double) (var241 + 1));
                return;
            }
            if (arg0 == 4006) {
                field10356 -= 5;
                int var242 = field10367[field10356];
                int var243 = field10367[field10356 + 1];
                int var244 = field10367[field10356 + 2];
                int var245 = field10367[field10356 + 3];
                int var246 = field10367[field10356 + 4];
                field10367[field10356++] = (var243 - var242) * (var246 - var244) / (var245 - var244) + var242;
                return;
            }
            if (arg0 == 4007) {
                field10356 -= 2;
                long var247 = (long) field10367[field10356];
                long var249 = (long) field10367[field10356 + 1];
                field10367[field10356++] = (int) (var247 * var249 / 100L + var247);
                return;
            }
            if (arg0 == 4008) {
                field10356 -= 2;
                int var251 = field10367[field10356];
                int var252 = field10367[field10356 + 1];
                field10367[field10356++] = var251 | 0x1 << var252;
                return;
            }
            if (arg0 == 4009) {
                field10356 -= 2;
                int var253 = field10367[field10356];
                int var254 = field10367[field10356 + 1];
                field10367[field10356++] = var253 & -(0x1 << var254) - 1;
                return;
            }
            if (arg0 == 4010) {
                field10356 -= 2;
                int var255 = field10367[field10356];
                int var256 = field10367[field10356 + 1];
                field10367[field10356++] = (var255 & 0x1 << var256) == 0 ? 0 : 1;
                return;
            }
            if (arg0 == 4011) {
                field10356 -= 2;
                int var257 = field10367[field10356];
                int var258 = field10367[field10356 + 1];
                field10367[field10356++] = var257 % var258;
                return;
            }
            if (arg0 == 4012) {
                field10356 -= 2;
                int var259 = field10367[field10356];
                int var260 = field10367[field10356 + 1];
                if (var259 == 0) {
                    field10367[field10356++] = 0;
                    return;
                }
                field10367[field10356++] = (int) Math.pow((double) var259, (double) var260);
                return;
            }
            if (arg0 == 4013) {
                field10356 -= 2;
                int var261 = field10367[field10356];
                int var262 = field10367[field10356 + 1];
                if (var261 == 0) {
                    field10367[field10356++] = 0;
                    return;
                }
                if (var262 == 0) {
                    field10367[field10356++] = Integer.MAX_VALUE;
                    return;
                }
                field10367[field10356++] = (int) Math.pow((double) var261, 1.0D / (double) var262);
                return;
            }
            if (arg0 == 4014) {
                field10356 -= 2;
                int var263 = field10367[field10356];
                int var264 = field10367[field10356 + 1];
                field10367[field10356++] = var263 & var264;
                return;
            }
            if (arg0 == 4015) {
                field10356 -= 2;
                int var265 = field10367[field10356];
                int var266 = field10367[field10356 + 1];
                field10367[field10356++] = var265 | var266;
                return;
            }
            if (arg0 == 4016) {
                field10356 -= 2;
                int var267 = field10367[field10356];
                int var268 = field10367[field10356 + 1];
                field10367[field10356++] = var267 < var268 ? var267 : var268;
                return;
            }
            if (arg0 == 4017) {
                field10356 -= 2;
                int var269 = field10367[field10356];
                int var270 = field10367[field10356 + 1];
                field10367[field10356++] = var269 > var270 ? var269 : var270;
                return;
            }
            if (arg0 == 4018) {
                field10356 -= 3;
                long var271 = (long) field10367[field10356];
                long var273 = (long) field10367[field10356 + 1];
                long var275 = (long) field10367[field10356 + 2];
                field10367[field10356++] = (int) (var271 * var275 / var273);
                return;
            }
            if (arg0 == 4019) {
                field10356 -= 2;
                int var277 = field10367[field10356];
                int var278 = field10367[field10356 + 1];
                if (var277 > 700 || var278 > 700) {
                    field10367[field10356++] = 256;
                }
                double var279 = (Math.random() * (double) (var277 + var278) + 800.0D - (double) var277) / 100.0D;
                field10367[field10356++] = (int) (Math.pow(2.0D, var279) + 0.5D);
                return;
            }
            if (arg0 == 4020) {
                int var281 = field10367[--field10356];
                field10367[field10356++] = class558.field7098[class645.method3487(-74, var281) & 0xFFFF];
                return;
            }
        } else if (arg0 < 4200) {
            if (arg0 == 4100) {
                String var282 = field10361[--field10345];
                int var283 = field10367[--field10356];
                field10361[field10345++] = var282 + var283;
                return;
            }
            if (arg0 == 4101) {
                field10345 -= 2;
                String var284 = field10361[field10345];
                String var285 = field10361[field10345 + 1];
                field10361[field10345++] = var284 + var285;
                return;
            }
            if (arg0 == 4102) {
                String var286 = field10361[--field10345];
                int var287 = field10367[--field10356];
                field10361[field10345++] = var286 + class62.method364(var287, true, (byte) 110);
                return;
            }
            if (arg0 == 4103) {
                String var288 = field10361[--field10345];
                field10361[field10345++] = var288.toLowerCase();
                return;
            }
            if (arg0 == 4104) {
                field10361[field10345++] = class224.method1450(2, class544.method2953((byte) 96, field10367[--field10356]), class496.field6338);
                return;
            }
            if (arg0 == 4105) {
                field10345 -= 2;
                String var289 = field10361[field10345];
                String var290 = field10361[field10345 + 1];
                if (class422.field5564.field352 != null && class422.field5564.field352.field10295) {
                    field10361[field10345++] = var290;
                    return;
                }
                field10361[field10345++] = var289;
                return;
            }
            if (arg0 == 4106) {
                int var291 = field10367[--field10356];
                field10361[field10345++] = Integer.toString(var291);
                return;
            }
            if (arg0 == 4107) {
                field10345 -= 2;
                field10367[field10356++] = class536.method2930(field10361[field10345], class496.field6338, field10361[field10345 + 1], 0);
                return;
            }
            if (arg0 == 4108) {
                String var292 = field10361[--field10345];
                field10356 -= 2;
                int var293 = field10367[field10356];
                int var294 = field10367[field10356 + 1];
                class166 var295 = class165.method1046(-125, 0, class171.field2264, var294);
                field10367[field10356++] = var295.method1056(var293, var292, -1, class662.field8639);
                return;
            }
            if (arg0 == 4109) {
                String var296 = field10361[--field10345];
                field10356 -= 2;
                int var297 = field10367[field10356];
                int var298 = field10367[field10356 + 1];
                class166 var299 = class165.method1046(-114, 0, class171.field2264, var298);
                field10367[field10356++] = var299.method1059((byte) -119, var296, class662.field8639, var297);
                return;
            }
            if (arg0 == 4110) {
                field10345 -= 2;
                String var300 = field10361[field10345];
                String var301 = field10361[field10345 + 1];
                if (field10367[--field10356] == 1) {
                    field10361[field10345++] = var300;
                    return;
                }
                field10361[field10345++] = var301;
                return;
            }
            if (arg0 == 4111) {
                String var302 = field10361[--field10345];
                field10361[field10345++] = class425.method2452(var302, 48);
                return;
            }
            if (arg0 == 4112) {
                String var303 = field10361[--field10345];
                int var304 = field10367[--field10356];
                if (var304 == -1) {
                    throw new RuntimeException("null char");
                }
                field10361[field10345++] = var303 + (char) var304;
                return;
            }
            if (arg0 == 4113) {
                int var305 = field10367[--field10356];
                field10367[field10356++] = method4135((char) var305);
                return;
            }
            if (arg0 == 4114) {
                int var306 = field10367[--field10356];
                field10367[field10356++] = class638.method3449((char) var306, -91) ? 1 : 0;
                return;
            }
            if (arg0 == 4115) {
                int var307 = field10367[--field10356];
                field10367[field10356++] = class606.method3258((char) var307, -123) ? 1 : 0;
                return;
            }
            if (arg0 == 4116) {
                int var308 = field10367[--field10356];
                field10367[field10356++] = class286.method1742((char) var308, (byte) 90) ? 1 : 0;
                return;
            }
            if (arg0 == 4117) {
                String var309 = field10361[--field10345];
                if (var309 != null) {
                    field10367[field10356++] = var309.length();
                    return;
                }
                field10367[field10356++] = 0;
                return;
            }
            if (arg0 == 4118) {
                String var310 = field10361[--field10345];
                field10356 -= 2;
                int var311 = field10367[field10356];
                int var312 = field10367[field10356 + 1];
                field10361[field10345++] = var310.substring(var311, var312);
                return;
            }
            if (arg0 == 4119) {
                String var313 = field10361[--field10345];
                StringBuffer var314 = new StringBuffer(var313.length());
                boolean var315 = false;
                for (int var316 = 0; var316 < var313.length(); var316++) {
                    char var317 = var313.charAt(var316);
                    if (var317 == '<') {
                        var315 = true;
                    } else if (var317 == '>') {
                        var315 = false;
                    } else if (!var315) {
                        var314.append(var317);
                    }
                }
                field10361[field10345++] = var314.toString();
                return;
            }
            if (arg0 == 4120) {
                String var318 = field10361[--field10345];
                field10356 -= 2;
                int var319 = field10367[field10356];
                int var320 = field10367[field10356 + 1];
                field10367[field10356++] = var318.indexOf(var319, var320);
                return;
            }
            if (arg0 == 4121) {
                field10345 -= 2;
                String var321 = field10361[field10345];
                String var322 = field10361[field10345 + 1];
                int var323 = field10367[--field10356];
                field10367[field10356++] = var321.indexOf(var322, var323);
                return;
            }
            if (arg0 == 4122) {
                int var324 = field10367[--field10356];
                field10367[field10356++] = Character.toLowerCase((char) var324);
                return;
            }
            if (arg0 == 4123) {
                int var325 = field10367[--field10356];
                field10367[field10356++] = Character.toUpperCase((char) var325);
                return;
            }
            if (arg0 == 4124) {
                boolean var326 = field10367[--field10356] != 0;
                int var327 = field10367[--field10356];
                field10361[field10345++] = class788.method4317(0, class496.field6338, var326, (long) var327, (byte) 75);
                return;
            }
            if (arg0 == 4125) {
                String var328 = field10361[--field10345];
                int var329 = field10367[--field10356];
                class166 var330 = class165.method1046(-117, 0, class171.field2264, var329);
                field10367[field10356++] = var330.method1054(var328, true, class662.field8639);
                return;
            }
            if (arg0 == 4126) {
                field10361[field10345++] = class759.method4133(class496.field6338, 5, (long) field10367[--field10356] * 60000L, true) + " UTC";
                return;
            }
            if (arg0 == 4127) {
                long var331 = field10348[--field10357];
                field10361[field10345++] = var331 == -1L ? "" : Long.toString(var331, 36).toUpperCase();
                return;
            }
        } else if (arg0 < 4300) {
            if (arg0 == 4200) {
                int var333 = field10367[--field10356];
                field10361[field10345++] = class640.field8189.method705(var333, -11467).field624;
                return;
            }
            if (arg0 == 4201) {
                field10356 -= 2;
                int var334 = field10367[field10356];
                int var335 = field10367[field10356 + 1];
                class48 var336 = class640.field8189.method705(var334, -11467);
                if (var335 >= 1 && var335 <= 5 && var336.field564[var335 - 1] != null) {
                    field10361[field10345++] = var336.field564[var335 - 1];
                    return;
                }
                field10361[field10345++] = "";
                return;
            }
            if (arg0 == 4202) {
                field10356 -= 2;
                int var337 = field10367[field10356];
                int var338 = field10367[field10356 + 1];
                class48 var339 = class640.field8189.method705(var337, -11467);
                if (var338 >= 1 && var338 <= 5 && var339.field600[var338 - 1] != null) {
                    field10361[field10345++] = var339.field600[var338 - 1];
                    return;
                }
                field10361[field10345++] = "";
                return;
            }
            if (arg0 == 4203) {
                int var340 = field10367[--field10356];
                field10367[field10356++] = class640.field8189.method705(var340, -11467).field574;
                return;
            }
            if (arg0 == 4204) {
                int var341 = field10367[--field10356];
                field10367[field10356++] = class640.field8189.method705(var341, -11467).field632 == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 4205) {
                int var342 = field10367[--field10356];
                class48 var343 = class640.field8189.method705(var342, -11467);
                if (var343.field584 == -1 && var343.field588 >= 0) {
                    field10367[field10356++] = var343.field588;
                    return;
                }
                field10367[field10356++] = var342;
                return;
            }
            if (arg0 == 4206) {
                int var344 = field10367[--field10356];
                class48 var345 = class640.field8189.method705(var344, -11467);
                if (var345.field584 >= 0 && var345.field588 >= 0) {
                    field10367[field10356++] = var345.field588;
                    return;
                }
                field10367[field10356++] = var344;
                return;
            }
            if (arg0 == 4207) {
                int var346 = field10367[--field10356];
                field10367[field10356++] = class640.field8189.method705(var346, -11467).field573 ? 1 : 0;
                return;
            }
            if (arg0 == 4208) {
                field10356 -= 2;
                int var347 = field10367[field10356];
                int var348 = field10367[field10356 + 1];
                class558 var349 = class761.field10377.method4101(var348, 11);
                if (var349.method3029(true)) {
                    field10361[field10345++] = class640.field8189.method705(var347, -11467).method307(var348, var349.field7095, -40);
                    return;
                }
                field10367[field10356++] = class640.field8189.method705(var347, -11467).method295(var348, (byte) 46, var349.field7096);
                return;
            }
            if (arg0 == 4209) {
                field10356 -= 2;
                int var350 = field10367[field10356];
                int var351 = field10367[field10356 + 1] - 1;
                class48 var352 = class640.field8189.method705(var350, -11467);
                if (var352.field621 == var351) {
                    field10367[field10356++] = var352.field611;
                    return;
                }
                if (var352.field553 == var351) {
                    field10367[field10356++] = var352.field638;
                    return;
                }
                field10367[field10356++] = -1;
                return;
            }
            if (arg0 == 4210) {
                String var353 = field10361[--field10345];
                int var354 = field10367[--field10356];
                class361.method2081(var353, -1, var354 == 1);
                field10367[field10356++] = class609.field7700;
                return;
            }
            if (arg0 == 4211) {
                if (class33.field377 != null && class545.field6821 < class609.field7700) {
                    field10367[field10356++] = class33.field377[class545.field6821++] & 0xFFFF;
                    return;
                }
                field10367[field10356++] = -1;
                return;
            }
            if (arg0 == 4212) {
                class545.field6821 = 0;
                return;
            }
            if (arg0 == 4213) {
                int var355 = field10367[--field10356];
                field10367[field10356++] = class640.field8189.method705(var355, -11467).field585;
                return;
            }
            if (arg0 == 4214) {
                String var356 = field10361[--field10345];
                field10356 -= 3;
                int var357 = field10367[field10356];
                int var358 = field10367[field10356 + 1];
                int var359 = field10367[field10356 + 2];
                class768.method4166(true, var356, var359, var358, var357 == 1);
                field10367[field10356++] = class609.field7700;
                return;
            }
            if (arg0 == 4215) {
                field10345 -= 2;
                field10356 -= 2;
                String var360 = field10361[field10345];
                int var361 = field10367[field10356];
                int var362 = field10367[field10356 + 1];
                String var363 = field10361[field10345 + 1];
                class507.method2805(0, var360, var361 == 1, var363, var362);
                field10367[field10356++] = class609.field7700;
                return;
            }
        } else if (arg0 < 4400) {
            if (arg0 == 4300) {
                field10356 -= 2;
                int var364 = field10367[field10356];
                int var365 = field10367[field10356 + 1];
                class558 var366 = class761.field10377.method4101(var365, 11);
                if (var366.method3029(true)) {
                    field10361[field10345++] = class595.field7561.method765((byte) -53, var364).method1586(var365, -102, var366.field7095);
                    return;
                }
                field10367[field10356++] = class595.field7561.method765((byte) -53, var364).method1588(var366.field7096, var365, false);
                return;
            }
        } else if (arg0 < 4500) {
            if (arg0 == 4400) {
                field10356 -= 2;
                int var367 = field10367[field10356];
                int var368 = field10367[field10356 + 1];
                class558 var369 = class761.field10377.method4101(var368, 11);
                if (var369.method3029(true)) {
                    field10361[field10345++] = class390.field4983.method4292(var367, (byte) -126).method4219(var369.field7095, var368, 23466);
                    return;
                }
                field10367[field10356++] = class390.field4983.method4292(var367, (byte) -86).method4211((byte) -41, var369.field7096, var368);
                return;
            }
        } else if (arg0 < 4600) {
            if (arg0 == 4500) {
                field10356 -= 2;
                int var370 = field10367[field10356];
                int var371 = field10367[field10356 + 1];
                class558 var372 = class761.field10377.method4101(var371, 11);
                if (var372.method3029(true)) {
                    field10361[field10345++] = class406.field5387.method1721(26, var370).method2876(var371, var372.field7095, true);
                    return;
                }
                field10367[field10356++] = class406.field5387.method1721(26, var370).method2880(var372.field7096, 38, var371);
                return;
            }
        } else if (arg0 < 4700) {
            if (arg0 == 4600) {
                int var373 = field10367[--field10356];
                class68 var374 = class66.field869.method2048(var373, (byte) 114);
                if (var374.field935 != null && var374.field935.length > 0) {
                    int var375 = 0;
                    int var376 = var374.field908[0];
                    for (int var377 = 1; var377 < var374.field935.length; var377++) {
                        if (var374.field908[var377] > var376) {
                            var375 = var377;
                            var376 = var374.field908[var377];
                        }
                    }
                    field10367[field10356++] = var374.field935[var375];
                    return;
                }
                field10367[field10356++] = var374.field907;
                return;
            }
        } else if (arg0 < 4800) {
            if (arg0 == 4700) {
                field10367[field10356++] = class405.field5382 ? 1 : 0;
                return;
            }
            if (arg0 == 4701) {
                String var378 = field10361[--field10345];
                if (class332.field4052 == 7 && class203.field2816 == 0) {
                    if (var378.length() > 20) {
                        class78.field1107 = -4;
                        return;
                    }
                    class78.field1107 = -1;
                    class13 var379 = class659.method3587(class68.field909, 98, class374.field4580);
                    var379.field130.method1491(-129, 0);
                    int var380 = var379.field130.field3133;
                    var379.field130.method1547(var378, -6457);
                    var379.field130.method1532(var379.field130.field3133 - var380, 86);
                    class116.method679(var379, 0);
                    return;
                }
                class78.field1107 = -5;
                return;
            }
            if (arg0 == 4702) {
                field10367[field10356++] = class78.field1107;
                if (class78.field1107 != -1) {
                    class78.field1107 = -6;
                }
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "(I)I", line = 4216)
    private static final int method4137(int arg0) {
        class475 var1 = class451.field5893.method264(arg0, 54);
        if (var1 == null) {
            throw new RuntimeException("sr-c113");
        }
        Integer var2 = field10347.method3530(var1.field6179, var1.field6174, class201.field2799.field6153 << 16 | var1.field6176, 32318);
        return var2 == null ? 0 : var2;
    }

    @OriginalMember(owner = "client!wca", name = "c", descriptor = "(I)Ljava/lang/String;", line = 4235)
    private static final String method4138(int arg0) {
        String var1 = field10347.method3536(110, class201.field2799.field6153 << 16 | arg0);
        return var1 == null ? "" : var1;
    }

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "(IZ)V", line = 4245)
    private static final void method4139(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field10367[field10356++] = class571.field7226;
                return;
            }
            if (arg0 == 5001) {
                field10356 -= 3;
                class571.field7226 = field10367[field10356];
                class306.field3851 = class675.method3636(0, field10367[field10356 + 1]);
                if (class306.field3851 == null) {
                    class306.field3851 = class443.field5805;
                }
                class725.field9523 = field10367[field10356 + 2];
                field10369++;
                class13 var2 = class659.method3587(class68.field909, 98, class169.field2253);
                var2.field130.method1491(-129, class571.field7226);
                var2.field130.method1491(-129, class306.field3851.field9520);
                var2.field130.method1491(-129, class725.field9523);
                class116.method679(var2, 0);
                return;
            }
            if (arg0 == 5002) {
                field10345 -= 2;
                String var3 = field10361[field10345];
                String var4 = field10361[field10345 + 1];
                field10356 -= 2;
                int var5 = field10367[field10356];
                int var6 = field10367[field10356 + 1];
                if (var4 == null) {
                    var4 = "";
                }
                if (var4.length() > 80) {
                    var4 = var4.substring(0, 80);
                }
                field10353++;
                class13 var7 = class659.method3587(class68.field909, 98, class141.field1843);
                var7.field130.method1491(-129, class32.method168(var3, 96) + class32.method168(var4, 30) + 2);
                var7.field130.method1547(var3, -6457);
                var7.field130.method1491(-129, var5 - 1);
                var7.field130.method1491(-129, var6);
                var7.field130.method1547(var4, -6457);
                class116.method679(var7, 0);
                return;
            }
            if (arg0 == 5003) {
                int var8 = field10367[--field10356];
                class446 var9 = class784.method4302(var8, 90);
                String var10 = "";
                if (var9 != null && var9.field5825 != null) {
                    var10 = var9.field5825;
                }
                field10361[field10345++] = var10;
                return;
            }
            if (arg0 == 5004) {
                int var11 = field10367[--field10356];
                class446 var12 = class784.method4302(var11, 122);
                int var13 = -1;
                if (var12 != null) {
                    var13 = var12.field5833;
                }
                field10367[field10356++] = var13;
                return;
            }
            if (arg0 == 5005) {
                if (class306.field3851 == null) {
                    field10367[field10356++] = -1;
                    return;
                }
                field10367[field10356++] = class306.field3851.field9520;
                return;
            }
            if (arg0 == 5006) {
                int var14 = field10367[--field10356];
                class13 var15 = class659.method3587(class68.field909, 98, class524.field6670);
                var15.field130.method1491(-129, var14);
                class116.method679(var15, 0);
                return;
            }
            if (arg0 == 5008) {
                String var16 = field10361[--field10345];
                method4143(var16, arg0);
                return;
            }
            if (arg0 == 5009) {
                field10345 -= 2;
                String var17 = field10361[field10345];
                String var18 = field10361[field10345 + 1];
                if (class20.field186 != 0 || (!class227.field3073 || class731.field9576) && !class776.field10593) {
                    field10346++;
                    class13 var19 = class659.method3587(class68.field909, 98, class3.field16);
                    var19.field130.method1491(-129, 0);
                    int var20 = var19.field130.field3133;
                    var19.field130.method1547(var17, -6457);
                    class292.method1763(var19.field130, var18, (byte) 33);
                    var19.field130.method1532(var19.field130.field3133 - var20, 123);
                    class116.method679(var19, 0);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var21 = field10367[--field10356];
                class446 var22 = class784.method4302(var21, 113);
                String var23 = "";
                if (var22 != null && var22.field5832 != null) {
                    var23 = var22.field5832;
                }
                field10361[field10345++] = var23;
                return;
            }
            if (arg0 == 5011) {
                int var24 = field10367[--field10356];
                class446 var25 = class784.method4302(var24, 126);
                String var26 = "";
                if (var25 != null && var25.field5823 != null) {
                    var26 = var25.field5823;
                }
                field10361[field10345++] = var26;
                return;
            }
            if (arg0 == 5012) {
                int var27 = field10367[--field10356];
                class446 var28 = class784.method4302(var27, 123);
                int var29 = -1;
                if (var28 != null) {
                    var29 = var28.field5830;
                }
                field10367[field10356++] = var29;
                return;
            }
            if (arg0 == 5015) {
                String var30;
                if (class422.field5564 == null || class422.field5564.field358 == null) {
                    var30 = "";
                } else {
                    var30 = class422.field5564.method180(true, -31);
                }
                field10361[field10345++] = var30;
                return;
            }
            if (arg0 == 5016) {
                field10367[field10356++] = class725.field9523;
                return;
            }
            if (arg0 == 5017) {
                field10367[field10356++] = client.method2626((byte) 56);
                return;
            }
            if (arg0 == 5018) {
                int var31 = field10367[--field10356];
                class446 var32 = class784.method4302(var31, 126);
                int var33 = 0;
                if (var32 != null) {
                    var33 = var32.field5835;
                }
                field10367[field10356++] = var33;
                return;
            }
            if (arg0 == 5019) {
                int var34 = field10367[--field10356];
                class446 var35 = class784.method4302(var34, 117);
                String var36 = "";
                if (var35 != null && var35.field5828 != null) {
                    var36 = var35.field5828;
                }
                field10361[field10345++] = var36;
                return;
            }
            if (arg0 == 5020) {
                String var37;
                if (class422.field5564 == null || class422.field5564.field358 == null) {
                    var37 = "";
                } else {
                    var37 = class422.field5564.method191(-107, false);
                }
                field10361[field10345++] = var37;
                return;
            }
            if (arg0 == 5023) {
                int var38 = field10367[--field10356];
                class446 var39 = class784.method4302(var38, 84);
                int var40 = -1;
                if (var39 != null) {
                    var40 = var39.field5821;
                }
                field10367[field10356++] = var40;
                return;
            }
            if (arg0 == 5024) {
                int var41 = field10367[--field10356];
                class446 var42 = class784.method4302(var41, 118);
                int var43 = -1;
                if (var42 != null) {
                    var43 = var42.field5827;
                }
                field10367[field10356++] = var43;
                return;
            }
            if (arg0 == 5025) {
                int var44 = field10367[--field10356];
                class446 var45 = class784.method4302(var44, 115);
                String var46 = "";
                if (var45 != null && var45.field5829 != null) {
                    var46 = var45.field5829;
                }
                field10361[field10345++] = var46;
                return;
            }
            if (arg0 == 5050) {
                int var47 = field10367[--field10356];
                field10361[field10345++] = class32.field318.method1382(var47, 32768).field8258;
                return;
            }
            if (arg0 == 5051) {
                int var48 = field10367[--field10356];
                class647 var49 = class32.field318.method1382(var48, 32768);
                if (var49.field8254 == null) {
                    field10367[field10356++] = 0;
                    return;
                }
                field10367[field10356++] = var49.field8254.length;
                return;
            }
            if (arg0 == 5052) {
                field10356 -= 2;
                int var50 = field10367[field10356];
                int var51 = field10367[field10356 + 1];
                class647 var52 = class32.field318.method1382(var50, 32768);
                int var53 = var52.field8254[var51];
                field10367[field10356++] = var53;
                return;
            }
            if (arg0 == 5053) {
                int var54 = field10367[--field10356];
                class647 var55 = class32.field318.method1382(var54, 32768);
                if (var55.field8263 == null) {
                    field10367[field10356++] = 0;
                    return;
                }
                field10367[field10356++] = var55.field8263.length;
                return;
            }
            if (arg0 == 5054) {
                field10356 -= 2;
                int var56 = field10367[field10356];
                int var57 = field10367[field10356 + 1];
                field10367[field10356++] = class32.field318.method1382(var56, 32768).field8263[var57];
                return;
            }
            if (arg0 == 5055) {
                int var58 = field10367[--field10356];
                field10361[field10345++] = class389.field4977.method2859((byte) -115, var58).method610(-8275);
                return;
            }
            if (arg0 == 5056) {
                int var59 = field10367[--field10356];
                class104 var60 = class389.field4977.method2859((byte) -113, var59);
                if (var60.field1402 == null) {
                    field10367[field10356++] = 0;
                    return;
                }
                field10367[field10356++] = var60.field1402.length;
                return;
            }
            if (arg0 == 5057) {
                field10356 -= 2;
                int var61 = field10367[field10356];
                int var62 = field10367[field10356 + 1];
                field10367[field10356++] = class389.field4977.method2859((byte) -123, var61).field1402[var62];
                return;
            }
            if (arg0 == 5058) {
                field10354 = new class7();
                field10354.field67 = field10367[--field10356];
                field10354.field70 = class389.field4977.method2859((byte) -120, field10354.field67);
                field10354.field69 = new int[field10354.field70.method609((byte) 47)];
                return;
            }
            if (arg0 == 5059) {
                field10365++;
                class13 var63 = class659.method3587(class68.field909, 98, class75.field1049);
                var63.field130.method1491(-129, 0);
                int var64 = var63.field130.field3133;
                var63.field130.method1491(-129, 0);
                var63.field130.method1541(374, field10354.field67);
                field10354.field70.method611(var63.field130, field10354.field69, true);
                var63.field130.method1532(var63.field130.field3133 - var64, 19);
                class116.method679(var63, 0);
                return;
            }
            if (arg0 == 5060) {
                String var65 = field10361[--field10345];
                field10372++;
                class13 var66 = class659.method3587(class68.field909, 98, class384.field4801);
                var66.field130.method1491(-129, 0);
                int var67 = var66.field130.field3133;
                var66.field130.method1547(var65, -6457);
                var66.field130.method1541(374, field10354.field67);
                field10354.field70.method611(var66.field130, field10354.field69, true);
                var66.field130.method1532(var66.field130.field3133 - var67, 86);
                class116.method679(var66, 0);
                return;
            }
            if (arg0 == 5061) {
                field10365++;
                class13 var68 = class659.method3587(class68.field909, 98, class75.field1049);
                var68.field130.method1491(-129, 0);
                int var69 = var68.field130.field3133;
                var68.field130.method1491(-129, 1);
                var68.field130.method1541(374, field10354.field67);
                field10354.field70.method611(var68.field130, field10354.field69, true);
                var68.field130.method1532(var68.field130.field3133 - var69, 91);
                class116.method679(var68, 0);
                return;
            }
            if (arg0 == 5062) {
                field10356 -= 2;
                int var70 = field10367[field10356];
                int var71 = field10367[field10356 + 1];
                field10367[field10356++] = class32.field318.method1382(var70, 32768).field8255[var71];
                return;
            }
            if (arg0 == 5063) {
                field10356 -= 2;
                int var72 = field10367[field10356];
                int var73 = field10367[field10356 + 1];
                field10367[field10356++] = class32.field318.method1382(var72, 32768).field8256[var73];
                return;
            }
            if (arg0 == 5064) {
                field10356 -= 2;
                int var74 = field10367[field10356];
                int var75 = field10367[field10356 + 1];
                if (var75 == -1) {
                    field10367[field10356++] = -1;
                    return;
                }
                field10367[field10356++] = class32.field318.method1382(var74, 32768).method3494((char) var75, (byte) 8);
                return;
            }
            if (arg0 == 5065) {
                field10356 -= 2;
                int var76 = field10367[field10356];
                int var77 = field10367[field10356 + 1];
                if (var77 == -1) {
                    field10367[field10356++] = -1;
                    return;
                }
                field10367[field10356++] = class32.field318.method1382(var76, 32768).method3493((char) var77, (byte) 120);
                return;
            }
            if (arg0 == 5066) {
                int var78 = field10367[--field10356];
                field10367[field10356++] = class389.field4977.method2859((byte) -119, var78).method609((byte) 33);
                return;
            }
            if (arg0 == 5067) {
                field10356 -= 2;
                int var79 = field10367[field10356];
                int var80 = field10367[field10356 + 1];
                int var81 = class389.field4977.method2859((byte) -110, var79).method603(var80, (byte) 105).field701;
                field10367[field10356++] = var81;
                return;
            }
            if (arg0 == 5068) {
                field10356 -= 2;
                int var82 = field10367[field10356];
                int var83 = field10367[field10356 + 1];
                field10354.field69[var82] = var83;
                return;
            }
            if (arg0 == 5069) {
                field10356 -= 2;
                int var84 = field10367[field10356];
                int var85 = field10367[field10356 + 1];
                field10354.field69[var84] = var85;
                return;
            }
            if (arg0 == 5070) {
                field10356 -= 3;
                int var86 = field10367[field10356];
                int var87 = field10367[field10356 + 1];
                int var88 = field10367[field10356 + 2];
                class104 var89 = class389.field4977.method2859((byte) -108, var86);
                if (var89.method603(var87, (byte) 83).field701 != 0) {
                    throw new RuntimeException("bad command");
                }
                field10367[field10356++] = var89.method607(var88, var87, 33);
                return;
            }
            if (arg0 == 5071) {
                String var90 = field10361[--field10345];
                boolean var91 = field10367[--field10356] == 1;
                class123.method729(var90, var91, -9589);
                field10367[field10356++] = class609.field7700;
                return;
            }
            if (arg0 == 5072) {
                if (class33.field377 != null && class545.field6821 < class609.field7700) {
                    field10367[field10356++] = class33.field377[class545.field6821++] & 0xFFFF;
                    return;
                }
                field10367[field10356++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class545.field6821 = 0;
                return;
            }
            if (arg0 == 5074) {
                class13 var92 = class659.method3587(class68.field909, 98, class75.field1049);
                var92.field130.method1491(-129, 0);
                int var93 = var92.field130.field3133;
                var92.field130.method1491(-129, 2);
                var92.field130.method1541(374, field10354.field67);
                field10354.field70.method611(var92.field130, field10354.field69, true);
                var92.field130.method1532(var92.field130.field3133 - var93, 117);
                class116.method679(var92, 0);
                return;
            }
            if (arg0 == 5075) {
                class13 var94 = class659.method3587(class68.field909, 98, class75.field1049);
                var94.field130.method1491(-129, 0);
                int var95 = var94.field130.field3133;
                var94.field130.method1491(-129, 3);
                var94.field130.method1541(374, field10354.field67);
                field10354.field70.method611(var94.field130, field10354.field69, true);
                var94.field130.method1532(var94.field130.field3133 - var95, 31);
                class116.method679(var94, 0);
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class679.field8781.method271((byte) 124, 86)) {
                    field10367[field10356++] = 1;
                    return;
                }
                field10367[field10356++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class679.field8781.method271((byte) 116, 82)) {
                    field10367[field10356++] = 1;
                    return;
                }
                field10367[field10356++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class679.field8781.method271((byte) 99, 81)) {
                    field10367[field10356++] = 1;
                    return;
                }
                field10367[field10356++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class401.method2328(field10367[--field10356], -111);
                return;
            }
            if (arg0 == 5201) {
                field10367[field10356++] = class624.method3346(37);
                return;
            }
            if (arg0 == 5205) {
                class386.method2220(-1, -1, field10367[--field10356], false, -1);
                return;
            }
            if (arg0 == 5206) {
                int var96 = field10367[--field10356];
                class389 var97 = class402.method2342(var96 >> 14 & 0x3FFF, var96 & 0x3FFF);
                if (var97 == null) {
                    field10367[field10356++] = -1;
                    return;
                }
                field10367[field10356++] = var97.field4973;
                return;
            }
            if (arg0 == 5207) {
                class389 var98 = class402.method2331(field10367[--field10356]);
                if (var98 != null && var98.field4964 != null) {
                    field10361[field10345++] = var98.field4964;
                    return;
                }
                field10361[field10345++] = "";
                return;
            }
            if (arg0 == 5208) {
                field10367[field10356++] = class152.field1936;
                field10367[field10356++] = class580.field7341;
                return;
            }
            if (arg0 == 5209) {
                field10367[field10356++] = class669.field8692 + class402.field5357;
                field10367[field10356++] = class402.field5347 + class238.field3238;
                return;
            }
            if (arg0 == 5210) {
                int var99 = field10367[--field10356];
                class389 var100 = class402.method2331(var99);
                if (var100 == null) {
                    field10367[field10356++] = 0;
                    field10367[field10356++] = 0;
                    return;
                }
                field10367[field10356++] = var100.field4974 >> 14 & 0x3FFF;
                field10367[field10356++] = var100.field4974 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var101 = field10367[--field10356];
                class389 var102 = class402.method2331(var101);
                if (var102 == null) {
                    field10367[field10356++] = 0;
                    field10367[field10356++] = 0;
                    return;
                }
                field10367[field10356++] = var102.field4954 - var102.field4967;
                field10367[field10356++] = var102.field4960 - var102.field4978;
                return;
            }
            if (arg0 == 5212) {
                class307 var103 = class17.method69(80);
                if (var103 == null) {
                    field10367[field10356++] = -1;
                    field10367[field10356++] = -1;
                    return;
                }
                field10367[field10356++] = var103.field3860;
                int var104 = var103.field3862 << 28 | class402.field5357 + var103.field3857 << 14 | class402.field5347 + var103.field3859;
                field10367[field10356++] = var104;
                return;
            }
            if (arg0 == 5213) {
                class307 var105 = class151.method859(0);
                if (var105 == null) {
                    field10367[field10356++] = -1;
                    field10367[field10356++] = -1;
                    return;
                }
                field10367[field10356++] = var105.field3860;
                int var106 = var105.field3862 << 28 | class402.field5357 + var105.field3857 << 14 | class402.field5347 + var105.field3859;
                field10367[field10356++] = var106;
                return;
            }
            if (arg0 == 5214) {
                int var107 = field10367[--field10356];
                class389 var108 = class757.method4115((byte) 45);
                if (var108 != null) {
                    boolean var109 = var108.method2246(var107 >> 28 & 0x3, var107 & 0x3FFF, (byte) 29, var107 >> 14 & 0x3FFF, field10344);
                    if (var109) {
                        class679.method3657(field10344[1], field10344[2], true);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field10356 -= 2;
                int var110 = field10367[field10356];
                int var111 = field10367[field10356 + 1];
                class719 var112 = class402.method2337(var110 >> 14 & 0x3FFF, var110 & 0x3FFF);
                boolean var113 = false;
                for (class389 var114 = (class389) var112.method3855(0); var114 != null; var114 = (class389) var112.method3861(true)) {
                    if (var114.field4973 == var111) {
                        var113 = true;
                        break;
                    }
                }
                if (var113) {
                    field10367[field10356++] = 1;
                    return;
                }
                field10367[field10356++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var115 = field10367[--field10356];
                class389 var116 = class402.method2331(var115);
                if (var116 == null) {
                    field10367[field10356++] = -1;
                    return;
                }
                field10367[field10356++] = var116.field4963;
                return;
            }
            if (arg0 == 5220) {
                field10367[field10356++] = class562.field7147 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var117 = field10367[--field10356];
                class679.method3657(var117 >> 14 & 0x3FFF, var117 & 0x3FFF, true);
                return;
            }
            if (arg0 == 5222) {
                class389 var118 = class757.method4115((byte) 45);
                if (var118 != null) {
                    boolean var119 = var118.method2242(field10344, 40, class669.field8692 + class402.field5357, class402.field5347 + class238.field3238);
                    if (var119) {
                        field10367[field10356++] = field10344[1];
                        field10367[field10356++] = field10344[2];
                        return;
                    }
                    field10367[field10356++] = -1;
                    field10367[field10356++] = -1;
                    return;
                }
                field10367[field10356++] = -1;
                field10367[field10356++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field10356 -= 2;
                int var120 = field10367[field10356];
                int var121 = field10367[field10356 + 1];
                class386.method2220(-1, var121 >> 14 & 0x3FFF, var120, false, var121 & 0x3FFF);
                return;
            }
            if (arg0 == 5224) {
                int var122 = field10367[--field10356];
                class389 var123 = class757.method4115((byte) 45);
                if (var123 != null) {
                    boolean var124 = var123.method2246(var122 >> 28 & 0x3, var122 & 0x3FFF, (byte) 29, var122 >> 14 & 0x3FFF, field10344);
                    if (var124) {
                        field10367[field10356++] = field10344[1];
                        field10367[field10356++] = field10344[2];
                        return;
                    }
                    field10367[field10356++] = -1;
                    field10367[field10356++] = -1;
                    return;
                }
                field10367[field10356++] = -1;
                field10367[field10356++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var125 = field10367[--field10356];
                class389 var126 = class757.method4115((byte) 45);
                if (var126 != null) {
                    boolean var127 = var126.method2242(field10344, 40, var125 >> 14 & 0x3FFF, var125 & 0x3FFF);
                    if (var127) {
                        field10367[field10356++] = field10344[1];
                        field10367[field10356++] = field10344[2];
                        return;
                    }
                    field10367[field10356++] = -1;
                    field10367[field10356++] = -1;
                    return;
                }
                field10367[field10356++] = -1;
                field10367[field10356++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class137.method790(field10367[--field10356], 117);
                return;
            }
            if (arg0 == 5227) {
                field10356 -= 2;
                int var128 = field10367[field10356];
                int var129 = field10367[field10356 + 1];
                class386.method2220(-1, var129 >> 14 & 0x3FFF, var128, true, var129 & 0x3FFF);
                return;
            }
            if (arg0 == 5228) {
                class576.field7321 = field10367[--field10356] == 1;
                return;
            }
            if (arg0 == 5229) {
                field10367[field10356++] = class576.field7321 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var130 = field10367[--field10356];
                class501.method2785(var130, false);
                return;
            }
            if (arg0 == 5231) {
                field10356 -= 2;
                int var131 = field10367[field10356];
                boolean var132 = field10367[field10356 + 1] == 1;
                if (class611.field7716 != null) {
                    class337 var133 = class611.field7716.method2616((long) var131, (byte) -123);
                    if (var133 != null && !var132) {
                        var133.method1946(-10364);
                        return;
                    }
                    if (var133 == null && var132) {
                        class337 var134 = new class337();
                        class611.field7716.method2619(var134, (long) var131, -1);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var135 = field10367[--field10356];
                if (class611.field7716 != null) {
                    class337 var136 = class611.field7716.method2616((long) var135, (byte) 80);
                    field10367[field10356++] = var136 == null ? 0 : 1;
                    return;
                }
                field10367[field10356++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field10356 -= 2;
                int var137 = field10367[field10356];
                boolean var138 = field10367[field10356 + 1] == 1;
                if (class206.field2838 != null) {
                    class337 var139 = class206.field2838.method2616((long) var137, (byte) -127);
                    if (var139 != null && !var138) {
                        var139.method1946(-10364);
                        return;
                    }
                    if (var139 == null && var138) {
                        class337 var140 = new class337();
                        class206.field2838.method2619(var140, (long) var137, -1);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var141 = field10367[--field10356];
                if (class206.field2838 != null) {
                    class337 var142 = class206.field2838.method2616((long) var141, (byte) -102);
                    field10367[field10356++] = var142 == null ? 0 : 1;
                    return;
                }
                field10367[field10356++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field10367[field10356++] = class402.field5326 == null ? -1 : class402.field5326.field4973;
                return;
            }
            if (arg0 == 5236) {
                field10356 -= 2;
                int var143 = field10367[field10356];
                int var144 = field10367[field10356 + 1];
                int var145 = var144 >> 14 & 0x3FFF;
                int var146 = var144 & 0x3FFF;
                int var147 = class759.method4132(var143, var146, var145, true);
                if (var147 < 0) {
                    field10367[field10356++] = -1;
                    return;
                }
                field10367[field10356++] = var147;
                return;
            }
            if (arg0 == 5237) {
                class354.method2036(-40);
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field10356 -= 2;
                int var148 = field10367[field10356];
                int var149 = field10367[field10356 + 1];
                class52.method329(var149, false, 3, var148, 0);
                field10367[field10356++] = class9.field80 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class9.field80 != null) {
                    class52.method329(-1, false, class485.field6252.field6935.method643(false), -1, 0);
                }
                return;
            }
            if (arg0 == 5302) {
                class264[] var150 = class107.method635((byte) -76);
                field10367[field10356++] = var150.length;
                return;
            }
            if (arg0 == 5303) {
                int var151 = field10367[--field10356];
                class264[] var152 = class107.method635((byte) -76);
                field10367[field10356++] = var152[var151].field3514;
                field10367[field10356++] = var152[var151].field3513;
                return;
            }
            if (arg0 == 5305) {
                int var153 = class365.field4461;
                int var154 = class90.field1232;
                int var155 = -1;
                class264[] var156 = class107.method635((byte) -76);
                for (int var157 = 0; var157 < var156.length; var157++) {
                    class264 var158 = var156[var157];
                    if (var158.field3514 == var153 && var158.field3513 == var154) {
                        var155 = var157;
                        break;
                    }
                }
                field10367[field10356++] = var155;
                return;
            }
            if (arg0 == 5306) {
                field10367[field10356++] = class400.method2313((byte) -101);
                return;
            }
            if (arg0 == 5307) {
                int var159 = field10367[--field10356];
                if (var159 >= 1 && var159 <= 2) {
                    class52.method329(-1, false, var159, -1, 0);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field10367[field10356++] = class485.field6252.field6935.method643(false);
                return;
            }
            if (arg0 == 5309) {
                int var160 = field10367[--field10356];
                if (var160 >= 1 && var160 <= 2) {
                    class485.field6252.method2986(var160, class485.field6252.field6935, (byte) -99);
                    class485.field6252.method2986(var160, class485.field6252.field6917, (byte) 82);
                    class627.method3356(57);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field10345 -= 2;
                String var161 = field10361[field10345];
                String var162 = field10361[field10345 + 1];
                int var163 = field10367[--field10356];
                field10364++;
                class13 var164 = class659.method3587(class68.field909, 98, class397.field5238);
                var164.field130.method1491(-129, class32.method168(var161, 100) + class32.method168(var162, 115) + 1);
                var164.field130.method1547(var161, -6457);
                var164.field130.method1547(var162, -6457);
                var164.field130.method1491(-129, var163);
                class116.method679(var164, 0);
                return;
            }
            if (arg0 == 5401) {
                field10356 -= 2;
                class155.field1972[field10367[field10356]] = (short) class561.method3037(field10367[field10356 + 1], 127);
                class640.field8189.method691(32);
                class640.field8189.method693(72);
                class595.field7561.method768(125);
                class135.method783(0);
                return;
            }
            if (arg0 == 5405) {
                field10356 -= 2;
                int var165 = field10367[field10356];
                int var166 = field10367[field10356 + 1];
                if (var165 >= 0 && var165 < 2) {
                    class790.field10811[var165] = new int[var166 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field10356 -= 7;
                int var167 = field10367[field10356];
                int var168 = field10367[field10356 + 1] << 1;
                int var169 = field10367[field10356 + 2];
                int var170 = field10367[field10356 + 3];
                int var171 = field10367[field10356 + 4];
                int var172 = field10367[field10356 + 5];
                int var173 = field10367[field10356 + 6];
                if (var167 >= 0 && var167 < 2 && class790.field10811[var167] != null && var168 >= 0 && var168 < class790.field10811[var167].length) {
                    class790.field10811[var167][var168] = new int[] { (var169 >> 14 & 0x3FFF) << 9, var170 << 2, (var169 & 0x3FFF) << 9, var173 };
                    class790.field10811[var167][var168 + 1] = new int[] { (var171 >> 14 & 0x3FFF) << 9, var172 << 2, (var171 & 0x3FFF) << 9 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var174 = class790.field10811[field10367[--field10356]].length >> 1;
                field10367[field10356++] = var174;
                return;
            }
            if (arg0 == 5411) {
                if (class9.field80 != null) {
                    class52.method329(-1, false, class485.field6252.field6935.method643(false), -1, 0);
                }
                if (class340.field4176 != null) {
                    class399.method2308((byte) -99);
                    System.exit(0);
                    return;
                }
                String var175 = class391.field5133 == null ? class496.method2757((byte) 127) : class391.field5133;
                class548.method2966(class485.field6252.field6949.method2402(false) == 1, (byte) 106, false, class740.field10014, var175);
                return;
            }
            if (arg0 == 5419) {
                String var176 = "";
                if (class73.field995 != null) {
                    if (class73.field995.field4142 == null) {
                        var176 = class401.method2320((byte) -111, class73.field995.field4147);
                    } else {
                        var176 = (String) class73.field995.field4142;
                    }
                }
                field10361[field10345++] = var176;
                return;
            }
            if (arg0 == 5420) {
                field10367[field10356++] = class740.field10014.field10571 ? 0 : 1;
                return;
            }
            if (arg0 == 5421) {
                if (class9.field80 != null) {
                    class52.method329(-1, false, class485.field6252.field6935.method643(false), -1, 0);
                }
                String var177 = field10361[--field10345];
                boolean var178 = field10367[--field10356] == 1;
                String var179 = class496.method2757((byte) -108) + var177;
                class548.method2966(class485.field6252.field6949.method2402(false) == 1, (byte) 89, var178, class740.field10014, var179);
                return;
            }
            if (arg0 == 5422) {
                field10345 -= 2;
                String var180 = field10361[field10345];
                String var181 = field10361[field10345 + 1];
                int var182 = field10367[--field10356];
                if (var180.length() > 0) {
                    if (class527.field6701 == null) {
                        class527.field6701 = new String[class77.field1081[class201.field2799.field6153]];
                    }
                    class527.field6701[var182] = var180;
                }
                if (var181.length() > 0) {
                    if (class443.field5809 == null) {
                        class443.field5809 = new String[class77.field1081[class201.field2799.field6153]];
                    }
                    class443.field5809[var182] = var181;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field10361[--field10345]);
                return;
            }
            if (arg0 == 5424) {
                field10356 -= 11;
                class189.field2618 = field10367[field10356];
                class719.field9445 = field10367[field10356 + 1];
                class48.field568 = field10367[field10356 + 2];
                class282.field3653 = field10367[field10356 + 3];
                class662.field8638 = field10367[field10356 + 4];
                class535.field6750 = field10367[field10356 + 5];
                class138.field1824 = field10367[field10356 + 6];
                class331.field4045 = field10367[field10356 + 7];
                class283.field3658 = field10367[field10356 + 8];
                class404.field5373 = field10367[field10356 + 9];
                class784.field10740 = field10367[field10356 + 10];
                class172.field2270.method130(-2, class662.field8638);
                class172.field2270.method130(-2, class535.field6750);
                class172.field2270.method130(-2, class138.field1824);
                class172.field2270.method130(-2, class331.field4045);
                class172.field2270.method130(-2, class283.field3658);
                class573.field7256 = null;
                class234.field3201 = null;
                class377.field4617 = null;
                class154.field1962 = null;
                class91.field1241 = null;
                class13.field139 = null;
                class192.field2685 = null;
                class444.field5815 = null;
                class689.field8857 = true;
                return;
            }
            if (arg0 == 5425) {
                class13.method56(-1);
                class689.field8857 = false;
                return;
            }
            if (arg0 == 5426) {
                field10356 -= 2;
                class32.field314 = field10367[field10356];
                class299.field3794 = field10367[field10356 + 1];
                return;
            }
            if (arg0 == 5427) {
                field10356 -= 2;
                class81.field1146 = field10367[field10356 + 1];
                return;
            }
            if (arg0 == 5428) {
                field10356 -= 2;
                int var183 = field10367[field10356];
                int var184 = field10367[field10356 + 1];
                field10367[field10356++] = class89.method542((byte) 6, var184, var183) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class458.method2591(false, field10361[--field10345], false, (byte) 46);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class586.method3137(8259, "accountcreated", class80.field1134);
                    return;
                } catch (Throwable var333) {
                    return;
                }
            }
            if (arg0 == 5431) {
                try {
                    class586.method3137(8259, "accountcreatestarted", class80.field1134);
                    return;
                } catch (Throwable var334) {
                    return;
                }
            }
            if (arg0 == 5432) {
                String var185 = "";
                if (class423.field5566 != null) {
                    Transferable var186 = class423.field5566.getContents(null);
                    if (var186 != null) {
                        try {
                            var185 = (String) var186.getTransferData(DataFlavor.stringFlavor);
                            if (var185 == null) {
                                var185 = "";
                            }
                        } catch (Exception var335) {
                        }
                    }
                }
                field10361[field10345++] = var185;
                return;
            }
            if (arg0 == 5433) {
                class113.field1502 = field10367[--field10356];
                return;
            }
            if (arg0 == 5435) {
                field10367[field10356++] = class87.field1218 ? 1 : 0;
                return;
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field10356 -= 4;
                int var187 = field10367[field10356];
                int var188 = field10367[field10356 + 1];
                int var189 = field10367[field10356 + 2];
                int var190 = field10367[field10356 + 3];
                class779.method4269(-13485, var190, (var187 >> 14 & 0x3FFF) - class714.field9407, false, var189, (var187 & 0x3FFF) - class240.field3293, var188 << 2);
                return;
            }
            if (arg0 == 5501) {
                field10356 -= 4;
                int var191 = field10367[field10356];
                int var192 = field10367[field10356 + 1];
                int var193 = field10367[field10356 + 2];
                int var194 = field10367[field10356 + 3];
                class753.method4088(var193, (var191 & 0x3FFF) - class240.field3293, (var191 >> 14 & 0x3FFF) - class714.field9407, var194, var192 << 2, 39);
                return;
            }
            if (arg0 == 5502) {
                field10356 -= 6;
                int var195 = field10367[field10356];
                if (var195 >= 2) {
                    throw new RuntimeException();
                }
                class209.field2883 = var195;
                int var196 = field10367[field10356 + 1];
                if (var196 + 1 >= class790.field10811[class209.field2883].length >> 1) {
                    throw new RuntimeException();
                }
                class287.field3674 = var196;
                class404.field5372 = 0;
                class404.field5370 = field10367[field10356 + 2];
                class301.field3801 = field10367[field10356 + 3];
                int var197 = field10367[field10356 + 4];
                if (var197 >= 2) {
                    throw new RuntimeException();
                }
                class721.field9472 = var197;
                int var198 = field10367[field10356 + 5];
                if (var198 + 1 >= class790.field10811[class721.field9472].length >> 1) {
                    throw new RuntimeException();
                }
                class786.field10777 = var198;
                class507.field6476 = 3;
                class525.field6679 = -1;
                class524.field6672 = -1;
                return;
            }
            if (arg0 == 5503) {
                class128.method755((byte) 126);
                return;
            }
            if (arg0 == 5504) {
                field10356 -= 2;
                class189.method1322(field10367[field10356], field10367[field10356 + 1], 0, (byte) 124);
                return;
            }
            if (arg0 == 5505) {
                field10367[field10356++] = (int) class297.field3762 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field10367[field10356++] = (int) class698.field9250 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class372.method2135(1);
                return;
            }
            if (arg0 == 5508) {
                class146.method838((byte) 65);
                return;
            }
            if (arg0 == 5509) {
                class443.method2548(110);
                return;
            }
            if (arg0 == 5510) {
                class461.method2600(16383);
                return;
            }
            if (arg0 == 5511) {
                int var199 = field10367[--field10356];
                int var200 = var199 >> 14 & 0x3FFF;
                int var201 = var199 & 0x3FFF;
                int var202 = var200 - class714.field9407;
                if (var202 < 0) {
                    var202 = 0;
                } else if (var202 >= class240.field3280) {
                    var202 = class240.field3280;
                }
                int var203 = var201 - class240.field3293;
                if (var203 < 0) {
                    var203 = 0;
                } else if (var203 >= class276.field3602) {
                    var203 = class276.field3602;
                }
                class12.field125 = (var202 << 9) + 256;
                class433.field5674 = (var203 << 9) + 256;
                class507.field6476 = 4;
                class525.field6679 = -1;
                class524.field6672 = -1;
                return;
            }
            if (arg0 == 5512) {
                class118.method707(118);
                return;
            }
            if (arg0 == 5514) {
                class628.field7979 = field10367[--field10356];
                return;
            }
            if (arg0 == 5516) {
                field10367[field10356++] = class628.field7979;
                return;
            }
            if (arg0 == 5517) {
                int var204 = field10367[--field10356];
                if (var204 == -1) {
                    int var205 = var204 >> 14 & 0x3FFF;
                    int var206 = var204 & 0x3FFF;
                    int var207 = var205 - class714.field9407;
                    if (var207 < 0) {
                        var207 = 0;
                    } else if (var207 >= class240.field3280) {
                        var207 = class240.field3280;
                    }
                    int var208 = var206 - class240.field3293;
                    if (var208 < 0) {
                        var208 = 0;
                    } else if (var208 >= class276.field3602) {
                        var208 = class276.field3602;
                    }
                    class524.field6672 = (var207 << 9) + 256;
                    class525.field6679 = (var208 << 9) + 256;
                    return;
                }
                class524.field6672 = -1;
                class525.field6679 = -1;
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field10345 -= 2;
                String var209 = field10361[field10345];
                String var210 = field10361[field10345 + 1];
                int var211 = field10367[--field10356];
                if (var209.length() > 320) {
                    return;
                }
                if (class332.field4052 != 3) {
                    return;
                }
                if (class203.field2816 == 0 && class778.field10629 == 0) {
                    class506.field6471 = var209;
                    class614.field7750 = var210;
                    class530.field6723 = var211;
                    class26.method113((byte) 95, 6);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class32.method166(12);
                return;
            }
            if (arg0 == 5602) {
                if (class203.field2816 == 0) {
                    class761.field10375 = -2;
                    class747.field10205 = -2;
                }
                return;
            }
            if (arg0 == 5604) {
                field10345--;
                if (class332.field4052 != 3) {
                    return;
                }
                if (class203.field2816 == 0 && class778.field10629 == 0) {
                    class596.method3212(0, field10361[field10345]);
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field10345 -= 2;
                field10356 -= 2;
                if (class332.field4052 != 3) {
                    return;
                }
                if (class203.field2816 == 0 && class778.field10629 == 0) {
                    class638.method3445(field10367[field10356], field10367[field10356 + 1] == 1, -1, field10361[field10345], field10361[field10345 + 1]);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class778.field10629 == 0) {
                    class223.field3035 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field10367[field10356++] = class747.field10205;
                return;
            }
            if (arg0 == 5608) {
                field10367[field10356++] = class553.field7021;
                return;
            }
            if (arg0 == 5609) {
                field10367[field10356++] = class223.field3035;
                return;
            }
            if (arg0 == 5611) {
                field10367[field10356++] = class135.field1792;
                return;
            }
            if (arg0 == 5612) {
                int var212 = field10367[--field10356];
                if (class332.field4052 != 7) {
                    return;
                }
                if (class203.field2816 == 0 && class778.field10629 == 0) {
                    if (class252.field3437 != null) {
                        class252.field3437.method1817(-107);
                        class252.field3437 = null;
                    }
                    class530.field6723 = var212;
                    class26.method113((byte) 95, 9);
                    return;
                }
                return;
            }
            if (arg0 == 5613) {
                field10367[field10356++] = class747.field10205;
                return;
            }
            if (arg0 == 5615) {
                field10345 -= 2;
                String var213 = field10361[field10345];
                String var214 = field10361[field10345 + 1];
                if (var213.length() > 320) {
                    return;
                }
                if (class332.field4052 != 3) {
                    return;
                }
                if (class203.field2816 == 0 && class778.field10629 == 0) {
                    if (class252.field3437 != null) {
                        class252.field3437.method1817(-107);
                        class252.field3437 = null;
                    }
                    class506.field6471 = var213;
                    class614.field7750 = var214;
                    class26.method113((byte) 95, 5);
                    return;
                }
                return;
            }
            if (arg0 == 5616) {
                class480.method2697((byte) -95, false);
                return;
            }
            if (arg0 == 5617) {
                field10367[field10356++] = class761.field10375;
                return;
            }
            if (arg0 == 5618) {
                field10356--;
                return;
            }
            if (arg0 == 5619) {
                field10356--;
                return;
            }
            if (arg0 == 5620) {
                field10367[field10356++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field10345 -= 2;
                field10356 -= 2;
                return;
            }
            if (arg0 == 5622) {
                return;
            }
            if (arg0 == 5623) {
                if (class528.field6708 != null) {
                    field10367[field10356++] = 1;
                    return;
                }
                field10367[field10356++] = 0;
                return;
            }
            if (arg0 == 5624) {
                field10367[field10356++] = (int) (class713.field9400 >> 32);
                field10367[field10356++] = (int) (class713.field9400 & 0xFFFFFFFFFFFFFFFFL);
                return;
            }
            if (arg0 == 5625) {
                field10367[field10356++] = class336.field4097 ? 1 : 0;
                return;
            }
            if (arg0 == 5626) {
                class336.field4097 = true;
                class110.method646((byte) 34);
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var215 = field10367[--field10356];
                class485.field6252.method2986(var215, class485.field6252.field6929, (byte) -105);
                class486.method2723(-8);
                class627.method3356(73);
                class165.field2184 = false;
                return;
            }
            if (arg0 == 6002) {
                boolean var216 = field10367[--field10356] == 1;
                class485.field6252.method2986(var216 ? 1 : 0, class485.field6252.field6940, (byte) -97);
                class485.field6252.method2986(var216 ? 1 : 0, class485.field6252.field6942, (byte) -72);
                class486.method2723(-8);
                class494.method2752((byte) -75);
                class627.method3356(18);
                class165.field2184 = false;
                return;
            }
            if (arg0 == 6003) {
                boolean var217 = field10367[--field10356] == 1;
                class485.field6252.method2986(var217 ? 2 : 1, class485.field6252.field6918, (byte) 100);
                class485.field6252.method2986(var217 ? 2 : 1, class485.field6252.field6954, (byte) -80);
                class494.method2752((byte) 74);
                class627.method3356(88);
                class165.field2184 = false;
                return;
            }
            if (arg0 == 6005) {
                class485.field6252.method2986(field10367[--field10356] == 1 ? 1 : 0, class485.field6252.field6938, (byte) 119);
                class486.method2723(-8);
                class627.method3356(98);
                class165.field2184 = false;
                return;
            }
            if (arg0 == 6007) {
                class485.field6252.method2986(field10367[--field10356], class485.field6252.field6945, (byte) 124);
                class627.method3356(87);
                class165.field2184 = false;
                return;
            }
            if (arg0 == 6008) {
                class485.field6252.method2986(field10367[--field10356] == 1 ? 1 : 0, class485.field6252.field6906, (byte) 126);
                class627.method3356(22);
                class165.field2184 = false;
                return;
            }
            if (arg0 == 6010) {
                class485.field6252.method2986(field10367[--field10356] == 1 ? 1 : 0, class485.field6252.field6923, (byte) 65);
                class627.method3356(64);
                class165.field2184 = false;
                return;
            }
            if (arg0 == 6011) {
                class485.field6252.method2986(field10367[--field10356], class485.field6252.field6952, (byte) -74);
                class486.method2723(-8);
                class627.method3356(29);
                class165.field2184 = false;
                return;
            }
            if (arg0 == 6012) {
                class485.field6252.method2986(field10367[--field10356] == 1 ? 1 : 0, class485.field6252.field6947, (byte) 55);
                class723.method3873(false);
                class193.method1346((byte) -43);
                class627.method3356(92);
                class165.field2184 = false;
                return;
            }
            if (arg0 == 6014) {
                class485.field6252.method2986(field10367[--field10356] == 1 ? 2 : 0, class485.field6252.field6951, (byte) 79);
                class486.method2723(-8);
                class627.method3356(27);
                class165.field2184 = false;
                return;
            }
            if (arg0 == 6015) {
                class485.field6252.method2986(field10367[--field10356] == 1 ? 1 : 0, class485.field6252.field6920, (byte) 59);
                class486.method2723(-8);
                class627.method3356(36);
                class165.field2184 = false;
                return;
            }
            if (arg0 == 6016) {
                class485.field6252.method2986(field10367[--field10356], class485.field6252.field6939, (byte) 70);
                class432.method2483((byte) 76, class485.field6252.field6949.method2402(false), false);
                class627.method3356(26);
                return;
            }
            if (arg0 == 6017) {
                class485.field6252.method2986(field10367[--field10356] == 1 ? 1 : 0, class485.field6252.field6930, (byte) -53);
                class317.method1855(-46);
                class627.method3356(34);
                class165.field2184 = false;
                return;
            }
            if (arg0 == 6018) {
                class485.field6252.method2986(field10367[--field10356], class485.field6252.field6946, (byte) 109);
                class627.method3356(72);
                class165.field2184 = false;
                return;
            }
            if (arg0 == 6019) {
                int var218 = field10367[--field10356];
                int var219 = class485.field6252.field6905.method1340(false);
                if (var218 != var219) {
                    if (class553.method3008(-22038, class332.field4052)) {
                        if (var219 == 0 && class136.field1797 != -1) {
                            class636.method3433(0, class788.field10798, var218, 0, false, class136.field1797);
                            class309.method1819(false);
                            class718.field9436 = false;
                        } else if (var218 == 0) {
                            class787.method4311((byte) -71);
                            class718.field9436 = false;
                        } else {
                            class12.method54(true, var218);
                        }
                    }
                    class485.field6252.method2986(var218, class485.field6252.field6905, (byte) -53);
                    class627.method3356(2);
                    class165.field2184 = false;
                }
                return;
            }
            if (arg0 == 6020) {
                class485.field6252.method2986(field10367[--field10356], class485.field6252.field6956, (byte) 105);
                class627.method3356(76);
                class165.field2184 = false;
                return;
            }
            if (arg0 == 6021) {
                int var220 = class485.field6252.field6918.method3616(false);
                class485.field6252.method2986(field10367[--field10356] == 1 ? 0 : var220, class485.field6252.field6954, (byte) 93);
                class494.method2752((byte) 101);
                return;
            }
            if (arg0 == 6023) {
                int var221 = field10367[--field10356];
                class485.field6252.method2986(var221, class485.field6252.field6908, (byte) -87);
                class627.method3356(117);
                class165.field2184 = false;
                return;
            }
            if (arg0 == 6024) {
                class485.field6252.method2986(field10367[--field10356], class485.field6252.field6953, (byte) -91);
                class627.method3356(10);
                return;
            }
            if (arg0 == 6025) {
                class485.field6252.method2986(field10367[--field10356], class485.field6252.field6916, (byte) 79);
                class627.method3356(36);
                class165.field2184 = false;
                return;
            }
            if (arg0 == 6027) {
                int var222 = field10367[--field10356];
                if (var222 < 0 || var222 > 1) {
                    var222 = 0;
                }
                class283.method1728(-2271, var222 == 1);
                return;
            }
            if (arg0 == 6028) {
                class485.field6252.method2986(field10367[--field10356] == 0 ? 0 : 1, class485.field6252.field6948, (byte) 85);
                class627.method3356(121);
                return;
            }
            if (arg0 == 6029) {
                class485.field6252.method2986(field10367[--field10356], class485.field6252.field6945, (byte) -99);
                class627.method3356(72);
                return;
            }
            if (arg0 == 6030) {
                class485.field6252.method2986(field10367[--field10356] == 0 ? 0 : 1, class485.field6252.field6915, (byte) 75);
                class627.method3356(105);
                class486.method2723(-8);
                return;
            }
            if (arg0 == 6031) {
                int var223 = field10367[--field10356];
                if (var223 < 0 || var223 > 5) {
                    var223 = 2;
                }
                class432.method2483((byte) 76, var223, false);
                return;
            }
            if (arg0 == 6032) {
                field10356 -= 2;
                int var224 = field10367[field10356];
                boolean var225 = field10367[field10356 + 1] == 1;
                class485.field6252.method2986(var224, class485.field6252.field6922, (byte) -44);
                if (!var225) {
                    class485.field6252.method2986(0, class485.field6252.field6933, (byte) 127);
                }
                class627.method3356(6);
                class165.field2184 = false;
                return;
            }
            if (arg0 == 6033) {
                class485.field6252.method2986(field10367[--field10356], class485.field6252.field6932, (byte) -80);
                class627.method3356(92);
                return;
            }
            if (arg0 == 6034) {
                class485.field6252.method2986(field10367[--field10356] == 1 ? 1 : 0, class485.field6252.field6913, (byte) -60);
                class627.method3356(75);
                class723.method3873(false);
                class165.field2184 = false;
                return;
            }
            if (arg0 == 6035) {
                int var226 = class485.field6252.field6940.method2278(false);
                class485.field6252.method2986(field10367[--field10356] == 1 ? 1 : var226, class485.field6252.field6942, (byte) 59);
                class486.method2723(-8);
                class494.method2752((byte) -69);
                return;
            }
            if (arg0 == 6036) {
                class485.field6252.method2986(field10367[--field10356], class485.field6252.field6955, (byte) 104);
                class627.method3356(113);
                class459.field5997 = true;
                return;
            }
            if (arg0 == 6037) {
                class485.field6252.method2986(field10367[--field10356], class485.field6252.field6928, (byte) 99);
                class627.method3356(105);
                class165.field2184 = false;
                return;
            }
            if (arg0 == 6038) {
                int var227 = field10367[--field10356];
                int var228 = class485.field6252.field6944.method1340(false);
                if (var227 != var228 && class780.field10643 == class136.field1797) {
                    if (!class553.method3008(-22038, class332.field4052)) {
                        if (var228 == 0) {
                            class636.method3433(0, class788.field10798, var227, 0, false, class136.field1797);
                            class309.method1819(false);
                            class718.field9436 = false;
                        } else if (var227 == 0) {
                            class787.method4311((byte) -71);
                            class718.field9436 = false;
                        } else {
                            class12.method54(true, var227);
                        }
                    }
                    class485.field6252.method2986(var227, class485.field6252.field6944, (byte) -125);
                    class627.method3356(31);
                    class165.field2184 = false;
                }
                return;
            }
            if (arg0 == 6039) {
                int var229 = field10367[--field10356];
                if (var229 > 255 || var229 < 0) {
                    var229 = 0;
                }
                if (var229 != class485.field6252.field6919.method3637(false)) {
                    class485.field6252.method2986(var229, class485.field6252.field6919, (byte) -95);
                    class627.method3356(82);
                    class165.field2184 = false;
                }
                return;
            }
            if (arg0 == 6040) {
                int var230 = field10367[--field10356];
                if (var230 != class485.field6252.field6927.method1821(false)) {
                    class485.field6252.method2986(var230, class485.field6252.field6927, (byte) -104);
                    class627.method3356(91);
                    class165.field2184 = false;
                    class243.method1597(2);
                }
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field10367[field10356++] = class485.field6252.field6929.method1802(false);
                return;
            }
            if (arg0 == 6102) {
                field10367[field10356++] = class485.field6252.field6940.method2278(false) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field10367[field10356++] = class485.field6252.field6918.method3616(false) == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field10367[field10356++] = class485.field6252.field6938.method2223(false) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field10367[field10356++] = class485.field6252.field6945.method2587(false);
                return;
            }
            if (arg0 == 6108) {
                field10367[field10356++] = class485.field6252.field6906.method731(false) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field10367[field10356++] = class485.field6252.field6923.method2789(false) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field10367[field10356++] = class485.field6252.field6952.method665(false);
                return;
            }
            if (arg0 == 6112) {
                field10367[field10356++] = class485.field6252.field6947.method106(false) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field10367[field10356++] = class485.field6252.field6951.method1703(false) == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field10367[field10356++] = class485.field6252.field6920.method75(false) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field10367[field10356++] = class485.field6252.field6939.method3350(false);
                return;
            }
            if (arg0 == 6117) {
                field10367[field10356++] = class485.field6252.field6930.method3991(false) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field10367[field10356++] = class485.field6252.field6946.method1340(false);
                return;
            }
            if (arg0 == 6119) {
                field10367[field10356++] = class485.field6252.field6905.method1340(false);
                return;
            }
            if (arg0 == 6120) {
                field10367[field10356++] = class485.field6252.field6956.method1340(false);
                return;
            }
            if (arg0 == 6123) {
                field10367[field10356++] = class609.method3264((byte) -101);
                return;
            }
            if (arg0 == 6124) {
                field10367[field10356++] = class485.field6252.field6953.method3350(false);
                return;
            }
            if (arg0 == 6125) {
                field10367[field10356++] = class485.field6252.field6916.method1641(false);
                return;
            }
            if (arg0 == 6127) {
                field10367[field10356++] = class485.field6252.field6936.method3272(false) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field10367[field10356++] = class485.field6252.field6948.method648(false) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field10367[field10356++] = class485.field6252.field6945.method2587(false);
                return;
            }
            if (arg0 == 6130) {
                field10367[field10356++] = class485.field6252.field6915.method2297(false) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field10367[field10356++] = class485.field6252.field6949.method2402(false);
                return;
            }
            if (arg0 == 6132) {
                field10367[field10356++] = class485.field6252.field6922.method2402(false);
                return;
            }
            if (arg0 == 6133) {
                field10367[field10356++] = class740.field10014.field10571 && !class740.field10014.field10581 ? 1 : 0;
                return;
            }
            if (arg0 == 6135) {
                field10367[field10356++] = class485.field6252.field6932.method2013(false);
                return;
            }
            if (arg0 == 6136) {
                field10367[field10356++] = class485.field6252.field6913.method3304(false) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6138) {
                field10367[field10356++] = class490.method2737(200, class485.field6252.field6949.method2402(false), -84);
                return;
            }
            if (arg0 == 6139) {
                field10367[field10356++] = class485.field6252.field6955.method1462(false);
                return;
            }
            if (arg0 == 6142) {
                field10367[field10356++] = class485.field6252.field6928.method1340(false);
                return;
            }
            if (arg0 == 6143) {
                field10367[field10356++] = class485.field6252.field6944.method1340(false);
                return;
            }
            if (arg0 == 6144) {
                field10367[field10356++] = class64.field836 ? 1 : 0;
                return;
            }
            if (arg0 == 6145) {
                field10367[field10356++] = class485.field6252.field6919.method3637(false);
                return;
            }
            if (arg0 == 6146) {
                field10367[field10356++] = class485.field6252.field6927.method1821(false);
                return;
            }
            if (arg0 == 6147) {
                field10367[field10356++] = class231.field3108.field4432 < 512 || class64.field836 || class251.field3422 ? 1 : 0;
                return;
            }
            if (arg0 == 6148) {
                field10367[field10356++] = class778.field10632 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field10356 -= 2;
                class698.field9257 = (short) field10367[field10356];
                if (class698.field9257 <= 0) {
                    class698.field9257 = 256;
                }
                class410.field5434 = (short) field10367[field10356 + 1];
                if (class410.field5434 <= 0) {
                    class410.field5434 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field10356 -= 2;
                class721.field9475 = (short) field10367[field10356];
                if (class721.field9475 <= 0) {
                    class721.field9475 = 256;
                }
                class178.field2341 = (short) field10367[field10356 + 1];
                if (class178.field2341 <= 0) {
                    class178.field2341 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field10356 -= 4;
                class336.field4093 = (short) field10367[field10356];
                if (class336.field4093 <= 0) {
                    class336.field4093 = 1;
                }
                class151.field1920 = (short) field10367[field10356 + 1];
                if (class151.field1920 <= 0) {
                    class151.field1920 = 32767;
                } else if (class151.field1920 < class336.field4093) {
                    class151.field1920 = class336.field4093;
                }
                class88.field1222 = (short) field10367[field10356 + 2];
                if (class88.field1222 <= 0) {
                    class88.field1222 = 1;
                }
                class365.field4464 = (short) field10367[field10356 + 3];
                if (class365.field4464 <= 0) {
                    class365.field4464 = 32767;
                    return;
                }
                if (class365.field4464 < class88.field1222) {
                    class365.field4464 = class88.field1222;
                }
                return;
            }
            if (arg0 == 6203) {
                class634.method3390(false, (byte) -90, class377.field4620.field5031, 0, class377.field4620.field5117, 0);
                field10367[field10356++] = class281.field3639;
                field10367[field10356++] = class368.field4503;
                return;
            }
            if (arg0 == 6204) {
                field10367[field10356++] = class721.field9475;
                field10367[field10356++] = class178.field2341;
                return;
            }
            if (arg0 == 6205) {
                field10367[field10356++] = class698.field9257;
                field10367[field10356++] = class410.field5434;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field10367[field10356++] = (int) (class502.method2786(-7114) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field10367[field10356++] = (int) (class502.method2786(-7114) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field10356 -= 3;
                int var231 = field10367[field10356];
                int var232 = field10367[field10356 + 1];
                int var233 = field10367[field10356 + 2];
                long var234 = class26.method112(12, 0, 0, var231, -2120, var233, var232);
                int var236 = class700.method3800(115, var234);
                if (var233 < 1970) {
                    var236--;
                }
                field10367[field10356++] = var236;
                return;
            }
            if (arg0 == 6303) {
                field10367[field10356++] = class24.method105(class502.method2786(-7114), false);
                return;
            }
            if (arg0 == 6304) {
                int var237 = field10367[--field10356];
                boolean var238 = true;
                if (var237 < 0) {
                    var238 = (var237 + 1) % 4 == 0;
                } else if (var237 < 1582) {
                    var238 = var237 % 4 == 0;
                } else if (var237 % 4 != 0) {
                    var238 = false;
                } else if (var237 % 100 != 0) {
                    var238 = true;
                } else if (var237 % 400 != 0) {
                    var238 = false;
                }
                field10367[field10356++] = var238 ? 1 : 0;
                return;
            }
            if (arg0 == 6305) {
                int var239 = field10367[--field10356];
                int[] var240 = class56.method339((byte) 117, var239);
                class642.method3475(var240, 0, field10367, field10356, 3);
                field10356 += 3;
                return;
            }
            if (arg0 == 6306) {
                int var241 = field10367[--field10356];
                field10367[field10356++] = (int) (class544.method2953((byte) 104, var241) / 60000L);
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field10367[field10356++] = class214.method1418(1) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field10367[field10356++] = class452.method2574(2020498764) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class332.field4052 == 7 && class203.field2816 == 0 && class778.field10629 == 0) {
                    if (class479.field6199) {
                        field10367[field10356++] = 0;
                        return;
                    }
                    if (class726.field9529 > class502.method2786(-7114) - 1000L) {
                        field10367[field10356++] = 1;
                        return;
                    }
                    class479.field6199 = true;
                    class13 var242 = class659.method3587(class68.field909, 98, class361.field4398);
                    var242.field130.method1496(class500.field6424, (byte) 14);
                    class116.method679(var242, 0);
                    field10367[field10356++] = 0;
                    return;
                }
                field10367[field10356++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class230 var243 = class721.method3864(-19036);
                if (var243 != null) {
                    field10367[field10356++] = var243.field3102;
                    field10367[field10356++] = var243.field2472;
                    field10361[field10345++] = var243.field3100;
                    class408 var244 = var243.method1475((byte) 119);
                    field10367[field10356++] = var244.field5420;
                    field10361[field10345++] = var244.field5419;
                    field10367[field10356++] = var243.field2468;
                    field10367[field10356++] = var243.field3099;
                    field10361[field10345++] = var243.field3101;
                    return;
                }
                field10367[field10356++] = -1;
                field10367[field10356++] = 0;
                field10361[field10345++] = "";
                field10367[field10356++] = 0;
                field10361[field10345++] = "";
                field10367[field10356++] = 0;
                field10367[field10356++] = 0;
                field10361[field10345++] = "";
                return;
            }
            if (arg0 == 6502) {
                class230 var245 = class595.method3207((byte) -126);
                if (var245 != null) {
                    field10367[field10356++] = var245.field3102;
                    field10367[field10356++] = var245.field2472;
                    field10361[field10345++] = var245.field3100;
                    class408 var246 = var245.method1475((byte) 92);
                    field10367[field10356++] = var246.field5420;
                    field10361[field10345++] = var246.field5419;
                    field10367[field10356++] = var245.field2468;
                    field10367[field10356++] = var245.field3099;
                    field10361[field10345++] = var245.field3101;
                    return;
                }
                field10367[field10356++] = -1;
                field10367[field10356++] = 0;
                field10361[field10345++] = "";
                field10367[field10356++] = 0;
                field10361[field10345++] = "";
                field10367[field10356++] = 0;
                field10367[field10356++] = 0;
                field10361[field10345++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var247 = field10367[--field10356];
                String var248 = field10361[--field10345];
                if (class332.field4052 == 7 && class203.field2816 == 0 && class778.field10629 == 0) {
                    field10367[field10356++] = class186.method1313(true, var247, var248) ? 1 : 0;
                    return;
                }
                field10367[field10356++] = 0;
                return;
            }
            if (arg0 == 6506) {
                int var249 = field10367[--field10356];
                class230 var250 = class190.method1331(var249, 7484);
                if (var250 != null) {
                    field10367[field10356++] = var250.field2472;
                    field10361[field10345++] = var250.field3100;
                    class408 var251 = var250.method1475((byte) 79);
                    field10367[field10356++] = var251.field5420;
                    field10361[field10345++] = var251.field5419;
                    field10367[field10356++] = var250.field2468;
                    field10367[field10356++] = var250.field3099;
                    field10361[field10345++] = var250.field3101;
                    return;
                }
                field10367[field10356++] = -1;
                field10361[field10345++] = "";
                field10367[field10356++] = 0;
                field10361[field10345++] = "";
                field10367[field10356++] = 0;
                field10367[field10356++] = 0;
                field10361[field10345++] = "";
                return;
            }
            if (arg0 == 6507) {
                field10356 -= 4;
                int var252 = field10367[field10356];
                boolean var253 = field10367[field10356 + 1] == 1;
                int var254 = field10367[field10356 + 2];
                boolean var255 = field10367[field10356 + 3] == 1;
                class668.method3619(var254, var255, var252, var253, 59);
                return;
            }
            if (arg0 == 6508) {
                class283.method1729((byte) -58);
                return;
            }
            if (arg0 == 6509) {
                if (class332.field4052 != 7) {
                    return;
                }
                class288.field3676 = field10367[--field10356] == 1;
                return;
            }
            if (arg0 == 6510) {
                field10367[field10356++] = class600.field7626;
                return;
            }
        } else if (arg0 >= 6700) {
            if (arg0 < 6800 && class652.field8357 == class463.field6015) {
                if (arg0 == 6700) {
                    int var256 = class149.field1895.method2618(-1);
                    if (client.field6070 != -1) {
                        var256++;
                    }
                    field10367[field10356++] = var256;
                    return;
                }
                if (arg0 == 6701) {
                    int var257 = field10367[--field10356];
                    if (client.field6070 != -1) {
                        if (var257 == 0) {
                            field10367[field10356++] = client.field6070;
                            return;
                        }
                        var257--;
                    }
                    class278 var258 = (class278) class149.field1895.method2610((byte) -81);
                    while (var257-- > 0) {
                        var258 = (class278) class149.field1895.method2620(0);
                    }
                    field10367[field10356++] = var258.field3617;
                    return;
                }
                if (arg0 == 6702) {
                    int var259 = field10367[--field10356];
                    if (class647.field8259[var259] == null) {
                        field10361[field10345++] = "";
                        return;
                    }
                    String var260 = class647.field8259[var259][0].field5065;
                    if (var260 == null) {
                        field10361[field10345++] = "";
                        return;
                    }
                    field10361[field10345++] = var260.substring(0, var260.indexOf(58));
                    return;
                }
                if (arg0 == 6703) {
                    int var261 = field10367[--field10356];
                    if (class647.field8259[var261] == null) {
                        field10367[field10356++] = 0;
                        return;
                    }
                    field10367[field10356++] = class647.field8259[var261].length;
                    return;
                }
                if (arg0 == 6704) {
                    field10356 -= 2;
                    int var262 = field10367[field10356];
                    int var263 = field10367[field10356 + 1];
                    if (class647.field8259[var262] == null) {
                        field10361[field10345++] = "";
                        return;
                    }
                    String var264 = class647.field8259[var262][var263].field5065;
                    if (var264 == null) {
                        field10361[field10345++] = "";
                        return;
                    }
                    field10361[field10345++] = var264;
                    return;
                }
                if (arg0 == 6705) {
                    field10356 -= 2;
                    int var265 = field10367[field10356];
                    int var266 = field10367[field10356 + 1];
                    if (class647.field8259[var265] == null) {
                        field10367[field10356++] = 0;
                        return;
                    }
                    field10367[field10356++] = class647.field8259[var265][var266].field5070;
                    return;
                }
                if (arg0 == 6706) {
                    return;
                }
                if (arg0 == 6707) {
                    field10356 -= 3;
                    int var267 = field10367[field10356];
                    int var268 = field10367[field10356 + 1];
                    int var269 = field10367[field10356 + 2];
                    class318.method1857(1, 0, "", var267 << 16 | var268, var269);
                    return;
                }
                if (arg0 == 6708) {
                    field10356 -= 3;
                    int var270 = field10367[field10356];
                    int var271 = field10367[field10356 + 1];
                    int var272 = field10367[field10356 + 2];
                    class318.method1857(2, 0, "", var270 << 16 | var271, var272);
                    return;
                }
                if (arg0 == 6709) {
                    field10356 -= 3;
                    int var273 = field10367[field10356];
                    int var274 = field10367[field10356 + 1];
                    int var275 = field10367[field10356 + 2];
                    class318.method1857(3, 0, "", var273 << 16 | var274, var275);
                    return;
                }
                if (arg0 == 6710) {
                    field10356 -= 3;
                    int var276 = field10367[field10356];
                    int var277 = field10367[field10356 + 1];
                    int var278 = field10367[field10356 + 2];
                    class318.method1857(4, 0, "", var276 << 16 | var277, var278);
                    return;
                }
                if (arg0 == 6711) {
                    field10356 -= 3;
                    int var279 = field10367[field10356];
                    int var280 = field10367[field10356 + 1];
                    int var281 = field10367[field10356 + 2];
                    class318.method1857(5, 0, "", var279 << 16 | var280, var281);
                    return;
                }
                if (arg0 == 6712) {
                    field10356 -= 3;
                    int var282 = field10367[field10356];
                    int var283 = field10367[field10356 + 1];
                    int var284 = field10367[field10356 + 2];
                    class318.method1857(6, 0, "", var282 << 16 | var283, var284);
                    return;
                }
                if (arg0 == 6713) {
                    field10356 -= 3;
                    int var285 = field10367[field10356];
                    int var286 = field10367[field10356 + 1];
                    int var287 = field10367[field10356 + 2];
                    class318.method1857(7, 0, "", var285 << 16 | var286, var287);
                    return;
                }
                if (arg0 == 6714) {
                    field10356 -= 3;
                    int var288 = field10367[field10356];
                    int var289 = field10367[field10356 + 1];
                    int var290 = field10367[field10356 + 2];
                    class318.method1857(8, 0, "", var288 << 16 | var289, var290);
                    return;
                }
                if (arg0 == 6715) {
                    field10356 -= 3;
                    int var291 = field10367[field10356];
                    int var292 = field10367[field10356 + 1];
                    int var293 = field10367[field10356 + 2];
                    class318.method1857(9, 0, "", var291 << 16 | var292, var293);
                    return;
                }
                if (arg0 == 6716) {
                    field10356 -= 3;
                    int var294 = field10367[field10356];
                    int var295 = field10367[field10356 + 1];
                    int var296 = field10367[field10356 + 2];
                    class318.method1857(10, 0, "", var294 << 16 | var295, var296);
                    return;
                }
                if (arg0 == 6717) {
                    field10356 -= 3;
                    int var297 = field10367[field10356];
                    int var298 = field10367[field10356 + 1];
                    int var299 = field10367[field10356 + 2];
                    class391 var300 = class752.method4075(var297 << 16 | var298, (byte) -105, var299);
                    class38.method230((byte) 110);
                    class372 var301 = client.method2637(var300);
                    class434.method2493(-106, var300, var301.field4548, var301.method2130((byte) 82));
                    return;
                }
            } else if (arg0 < 6900) {
                if (arg0 == 6800) {
                    int var302 = field10367[--field10356];
                    class624 var303 = class272.field3575.method2323(var302, true);
                    if (var303.field7946 == null) {
                        field10361[field10345++] = "";
                        return;
                    }
                    field10361[field10345++] = var303.field7946;
                    return;
                }
                if (arg0 == 6801) {
                    int var304 = field10367[--field10356];
                    class624 var305 = class272.field3575.method2323(var304, true);
                    field10367[field10356++] = var305.field7941;
                    return;
                }
                if (arg0 == 6802) {
                    int var306 = field10367[--field10356];
                    class624 var307 = class272.field3575.method2323(var306, true);
                    field10367[field10356++] = var307.field7939;
                    return;
                }
                if (arg0 == 6803) {
                    int var308 = field10367[--field10356];
                    class624 var309 = class272.field3575.method2323(var308, true);
                    field10367[field10356++] = var309.field7931;
                    return;
                }
                if (arg0 == 6804) {
                    field10356 -= 2;
                    int var310 = field10367[field10356];
                    int var311 = field10367[field10356 + 1];
                    class558 var312 = class761.field10377.method4101(var311, 11);
                    if (var312.method3029(true)) {
                        field10361[field10345++] = class272.field3575.method2323(var310, true).method3339(var311, 0, var312.field7095);
                        return;
                    }
                    field10367[field10356++] = class272.field3575.method2323(var310, true).method3340(0, var311, var312.field7096);
                    return;
                }
            } else if (arg0 < 7000) {
                if (arg0 == 6900) {
                    field10367[field10356++] = class227.field3073 && !class731.field9576 ? 1 : 0;
                    return;
                }
                if (arg0 == 6901) {
                    field10367[field10356++] = (int) (class419.field5522 / 60000L);
                    field10367[field10356++] = (int) ((class419.field5522 - class502.method2786(-7114) - class628.field7984) / 60000L);
                    field10367[field10356++] = class313.field3896 ? 1 : 0;
                    return;
                }
                if (arg0 == 6902) {
                    field10367[field10356++] = class733.field9692;
                    return;
                }
                if (arg0 == 6903) {
                    field10367[field10356++] = class562.field7135;
                    return;
                }
                if (arg0 == 6904) {
                    field10367[field10356++] = class736.field9974;
                    return;
                }
                if (arg0 == 6905) {
                    String var313 = "";
                    if (class73.field995 != null) {
                        if (class73.field995.field4142 == null) {
                            var313 = class401.method2320((byte) -119, class73.field995.field4147);
                        } else {
                            var313 = (String) class73.field995.field4142;
                        }
                    }
                    field10361[field10345++] = var313;
                    return;
                }
                if (arg0 == 6906) {
                    field10367[field10356++] = class386.field4935;
                    return;
                }
                if (arg0 == 6907) {
                    field10367[field10356++] = class422.field5562;
                    return;
                }
                if (arg0 == 6908) {
                    field10367[field10356++] = class80.field1129;
                    return;
                }
                if (arg0 == 6909) {
                    field10367[field10356++] = class72.field982 ? 1 : 0;
                    return;
                }
                if (arg0 == 6910) {
                    field10367[field10356++] = class563.field7157;
                    return;
                }
                if (arg0 == 6911) {
                    field10367[field10356++] = class765.field10414;
                    return;
                }
                if (arg0 == 6912) {
                    field10367[field10356++] = class113.field1496;
                    return;
                }
                if (arg0 == 6913) {
                    field10367[field10356++] = class470.field6130;
                    return;
                }
            } else if (arg0 < 7100) {
                if (arg0 == 7000) {
                    int var314 = class709.method3831(-101);
                    field10367[field10356++] = class254.field3448 = class485.field6252.field6949.method2402(false);
                    field10367[field10356++] = var314;
                    class486.method2723(-8);
                    class627.method3356(100);
                    class165.field2184 = false;
                    return;
                }
                if (arg0 == 7001) {
                    class104.method601(114);
                    class486.method2723(-8);
                    class627.method3356(86);
                    class165.field2184 = false;
                    return;
                }
                if (arg0 == 7002) {
                    class432.method2482(1);
                    class486.method2723(-8);
                    class627.method3356(119);
                    class165.field2184 = false;
                    return;
                }
                if (arg0 == 7003) {
                    class11.method46((byte) 119);
                    class486.method2723(-8);
                    class627.method3356(38);
                    class165.field2184 = false;
                    return;
                }
                if (arg0 == 7004) {
                    class588.method3149(0, true);
                    class486.method2723(-8);
                    class627.method3356(113);
                    class165.field2184 = false;
                    return;
                }
                if (arg0 == 7005) {
                    class485.field6252.method2986(0, class485.field6252.field6933, (byte) -105);
                    class627.method3356(60);
                    class165.field2184 = false;
                    return;
                }
                if (arg0 == 7006) {
                    if (class254.field3448 == 2) {
                        class101.field1346 = true;
                        return;
                    }
                    if (class254.field3448 == 1) {
                        class386.field4932 = true;
                        return;
                    }
                    if (class254.field3448 == 3) {
                        class746.field10195 = true;
                    }
                    return;
                }
                if (arg0 == 7007) {
                    field10367[field10356++] = class485.field6252.field6933.method1689(false);
                    return;
                }
            } else if (arg0 < 7200) {
                if (arg0 == 7100) {
                    field10356 -= 2;
                    int var315 = field10367[field10356];
                    int var316 = field10367[field10356 + 1];
                    if (var315 != -1) {
                        if (var316 > 255) {
                            var316 = 255;
                        } else if (var316 < 0) {
                            var316 = 0;
                        }
                        class278.method1711(true, var315, var316, false);
                    }
                    return;
                }
                if (arg0 == 7101) {
                    int var317 = field10367[--field10356];
                    if (var317 != -1) {
                        class595.method3210(var317, true);
                    }
                    return;
                }
                if (arg0 == 7102) {
                    int var318 = field10367[--field10356];
                    if (var318 != -1) {
                        class329.method1909((byte) 59, var318);
                    }
                    return;
                }
                if (arg0 == 7103) {
                    field10367[field10356++] = class659.method3588(-124, "jagtheora") ? 1 : 0;
                    return;
                }
            } else if (arg0 < 7300) {
                if (arg0 == 7201) {
                    field10367[field10356++] = class485.field6252.field6938.method2224(91) ? 1 : 0;
                    return;
                }
                if (arg0 == 7202) {
                    field10367[field10356++] = class485.field6252.field6923.method2787(-114) ? 1 : 0;
                    return;
                }
                if (arg0 == 7203) {
                    field10367[field10356++] = class485.field6252.field6952.method664(16) ? 1 : 0;
                    return;
                }
                if (arg0 == 7204) {
                    field10367[field10356++] = class485.field6252.field6951.method1701(-126) ? 1 : 0;
                    return;
                }
                if (arg0 == 7205) {
                    field10367[field10356++] = class485.field6252.field6953.method3355(-127) && class576.field7320.method903() ? 1 : 0;
                    return;
                }
                if (arg0 == 7206) {
                    field10367[field10356++] = class485.field6252.field6908.method3484(-119) ? 1 : 0;
                    return;
                }
                if (arg0 == 7207) {
                    field10367[field10356++] = class485.field6252.field6916.method1638(-114) ? 1 : 0;
                    return;
                }
                if (arg0 == 7208) {
                    field10367[field10356++] = class485.field6252.field6936.method3274(-126) && class576.field7320.method993() ? 1 : 0;
                    return;
                }
                if (arg0 == 7209) {
                    field10367[field10356++] = class485.field6252.field6915.method2296(-115) ? 1 : 0;
                    return;
                }
                if (arg0 == 7210) {
                    field10367[field10356++] = class485.field6252.field6913.method3303(15) ? 1 : 0;
                    return;
                }
                if (arg0 == 7211) {
                    field10367[field10356++] = class485.field6252.field6955.method1461(-116) ? 1 : 0;
                    return;
                }
                if (arg0 == 7212) {
                    field10367[field10356++] = class485.field6252.field6920.method77(25) ? 1 : 0;
                    return;
                }
                if (arg0 == 7213) {
                    field10367[field10356++] = class485.field6252.field6927.method1822(-119) ? 1 : 0;
                    return;
                }
                if (arg0 == 7214) {
                    field10367[field10356++] = class485.field6252.field6922.method2406(60) ? 1 : 0;
                    return;
                }
            } else if (arg0 < 7400) {
                if (arg0 == 7301) {
                    int var319 = field10367[--field10356];
                    field10367[field10356++] = class485.field6252.field6938.method72(var319, -2);
                    return;
                }
                if (arg0 == 7302) {
                    int var320 = field10367[--field10356];
                    field10367[field10356++] = class485.field6252.field6923.method72(var320, -2);
                    return;
                }
                if (arg0 == 7303) {
                    int var321 = field10367[--field10356];
                    field10367[field10356++] = class485.field6252.field6952.method72(var321, -2);
                    return;
                }
                if (arg0 == 7304) {
                    int var322 = field10367[--field10356];
                    field10367[field10356++] = class485.field6252.field6951.method72(var322, -2);
                    return;
                }
                if (arg0 == 7305) {
                    int var323 = field10367[--field10356];
                    if (!class576.field7320.method903()) {
                        field10367[field10356++] = 3;
                        return;
                    }
                    field10367[field10356++] = class485.field6252.field6953.method72(var323, -2);
                    return;
                }
                if (arg0 == 7306) {
                    int var324 = field10367[--field10356];
                    field10367[field10356++] = class485.field6252.field6908.method72(var324, -2);
                    return;
                }
                if (arg0 == 7307) {
                    int var325 = field10367[--field10356];
                    field10367[field10356++] = class485.field6252.field6916.method72(var325, -2);
                    return;
                }
                if (arg0 == 7308) {
                    int var326 = field10367[--field10356];
                    if (!class576.field7320.method993()) {
                        field10367[field10356++] = 3;
                        return;
                    }
                    field10367[field10356++] = class485.field6252.field6936.method72(var326, -2);
                    return;
                }
                if (arg0 == 7309) {
                    int var327 = field10367[--field10356];
                    field10367[field10356++] = class485.field6252.field6915.method72(var327, -2);
                    return;
                }
                if (arg0 == 7310) {
                    int var328 = field10367[--field10356];
                    field10367[field10356++] = class485.field6252.field6913.method72(var328, -2);
                    return;
                }
                if (arg0 == 7311) {
                    int var329 = field10367[--field10356];
                    field10367[field10356++] = class485.field6252.field6955.method72(var329, -2);
                    return;
                }
                if (arg0 == 7312) {
                    int var330 = field10367[--field10356];
                    field10367[field10356++] = class485.field6252.field6920.method72(var330, -2);
                    return;
                }
                if (arg0 == 7313) {
                    int var331 = field10367[--field10356];
                    field10367[field10356++] = class485.field6252.field6927.method72(var331, -2);
                    return;
                }
                if (arg0 == 7314) {
                    int var332 = field10367[--field10356];
                    field10367[field10356++] = class485.field6252.field6922.method72(var332, -2);
                    return;
                }
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!wca", name = "d", descriptor = "(I)I", line = 8036)
    private static final int method4140(int arg0) {
        class475 var1 = class451.field5893.method264(arg0, 54);
        if (var1 == null) {
            throw new RuntimeException("sr-c112");
        }
        Integer var2 = field10347.method3519(-1, class201.field2799.field6153 << 16 | arg0);
        if (var2 == null) {
            return var1.field6180 == 'i' || var1.field6180 == '1' ? 0 : -1;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lfba;I)V", line = 8072)
    private static final void method4141(class368 arg0, int arg1) {
        field10356 = 0;
        field10345 = 0;
        int var2 = -1;
        int[] var3 = arg0.field4512;
        int[] var4 = arg0.field4498;
        byte var5 = -1;
        field10371 = 0;
        try {
            int var6 = 0;
            label333: while (true) {
                var6++;
                if (var6 > arg1) {
                    throw new RuntimeException("slow");
                }
                var2++;
                int var45 = var3[var2];
                if (var45 >= 150) {
                    boolean var37;
                    if (var4[var2] == 1) {
                        var37 = true;
                    } else {
                        var37 = false;
                    }
                    if (var45 >= 150 && var45 < 5000) {
                        method4136(var45, var37);
                    } else if (var45 >= 5000 && var45 < 10000) {
                        method4139(var45, var37);
                    } else {
                        throw new IllegalStateException("Command: " + var45);
                    }
                } else if (var45 == 0) {
                    field10367[field10356++] = var4[var2];
                } else if (var45 == 1) {
                    int var7 = var4[var2];
                    field10367[field10356++] = class381.field4705.field3081[var7];
                } else if (var45 == 2) {
                    int var8 = var4[var2];
                    class381.field4705.method1466(field10367[--field10356], 53, var8);
                } else if (var45 == 3) {
                    field10361[field10345++] = arg0.field4509[var2];
                } else if (var45 == 6) {
                    var2 += var4[var2];
                } else if (var45 == 7) {
                    field10356 -= 2;
                    if (field10367[field10356 + 1] != field10367[field10356]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 8) {
                    field10356 -= 2;
                    if (field10367[field10356 + 1] == field10367[field10356]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 9) {
                    field10356 -= 2;
                    if (field10367[field10356] < field10367[field10356 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 10) {
                    field10356 -= 2;
                    if (field10367[field10356] > field10367[field10356 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 21) {
                    if (field10371 == 0) {
                        return;
                    }
                    class150 var9 = field10366[--field10371];
                    arg0 = var9.field1908;
                    var3 = arg0.field4512;
                    var4 = arg0.field4498;
                    var2 = var9.field1910;
                    field10358 = var9.field1906;
                    field10350 = var9.field1905;
                    field10370 = var9.field1909;
                } else if (var45 == 25) {
                    int var10 = var4[var2];
                    field10367[field10356++] = class381.field4705.method1467(false, var10);
                } else if (var45 == 27) {
                    int var11 = var4[var2];
                    class381.field4705.method1464(field10367[--field10356], var11, -69);
                } else if (var45 == 31) {
                    field10356 -= 2;
                    if (field10367[field10356] <= field10367[field10356 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 32) {
                    field10356 -= 2;
                    if (field10367[field10356] >= field10367[field10356 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 33) {
                    field10367[field10356++] = field10358[var4[var2]];
                } else if (var45 == 34) {
                    field10358[var4[var2]] = field10367[--field10356];
                } else if (var45 == 35) {
                    field10361[field10345++] = field10350[var4[var2]];
                } else if (var45 == 36) {
                    field10350[var4[var2]] = field10361[--field10345];
                } else if (var45 == 37) {
                    int var12 = var4[var2];
                    field10345 -= var12;
                    String var13 = class510.method2818(field10361, field10345, var12, -77);
                    field10361[field10345++] = var13;
                } else if (var45 == 38) {
                    field10356--;
                } else if (var45 == 39) {
                    field10345--;
                } else if (var45 == 40) {
                    int var14 = var4[var2];
                    class368 var15 = class230.method1477((byte) -103, var14);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field4510];
                    String[] var17 = new String[var15.field4501];
                    long[] var18 = new long[var15.field4504];
                    for (int var19 = 0; var19 < var15.field4505; var19++) {
                        var16[var19] = field10367[field10356 + var19 - var15.field4505];
                    }
                    for (int var20 = 0; var20 < var15.field4513; var20++) {
                        var17[var20] = field10361[field10345 + var20 - var15.field4513];
                    }
                    for (int var21 = 0; var21 < var15.field4497; var21++) {
                        var18[var21] = field10348[field10357 + var21 - var15.field4497];
                    }
                    field10356 -= var15.field4505;
                    field10345 -= var15.field4513;
                    field10357 -= var15.field4497;
                    class150 var22 = new class150();
                    var22.field1908 = arg0;
                    var22.field1910 = var2;
                    var22.field1906 = field10358;
                    var22.field1905 = field10350;
                    var22.field1909 = field10370;
                    if (field10371 >= field10366.length) {
                        throw new RuntimeException();
                    }
                    field10366[field10371++] = var22;
                    arg0 = var15;
                    var3 = var15.field4512;
                    var4 = var15.field4498;
                    var2 = -1;
                    field10358 = var16;
                    field10350 = var17;
                    field10370 = var18;
                } else if (var45 == 42) {
                    field10367[field10356++] = class176.field2317[var4[var2]];
                } else if (var45 == 43) {
                    int var23 = var4[var2];
                    class176.field2317[var23] = field10367[--field10356];
                    class530.method2907(var23, -127);
                    class564.field7164 |= class681.field8791[var23];
                } else if (var45 == 44) {
                    int var24 = var4[var2] >> 16;
                    int var25 = var4[var2] & 0xFFFF;
                    int var26 = field10367[--field10356];
                    if (var26 >= 0 && var26 <= 5000) {
                        field10343[var24] = var26;
                        byte var27 = -1;
                        if (var25 == 105) {
                            var27 = 0;
                        }
                        int var28 = 0;
                        while (true) {
                            if (var28 >= var26) {
                                continue label333;
                            }
                            field10363[var24][var28] = var27;
                            var28++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var45 == 45) {
                    int var29 = var4[var2];
                    int var30 = field10367[--field10356];
                    if (var30 < 0 || var30 >= field10343[var29]) {
                        throw new RuntimeException();
                    }
                    field10367[field10356++] = field10363[var29][var30];
                } else if (var45 == 46) {
                    int var31 = var4[var2];
                    field10356 -= 2;
                    int var32 = field10367[field10356];
                    if (var32 < 0 || var32 >= field10343[var31]) {
                        throw new RuntimeException();
                    }
                    field10363[var31][var32] = field10367[field10356 + 1];
                } else if (var45 == 47) {
                    String var33 = class27.field230[var4[var2]];
                    if (var33 == null) {
                        var33 = "null";
                    }
                    field10361[field10345++] = var33;
                } else if (var45 == 48) {
                    int var34 = var4[var2];
                    class27.field230[var34] = field10361[--field10345];
                    class705.method3816(var34, (byte) -90);
                } else if (var45 == 51) {
                    class467 var35 = arg0.field4507[var4[var2]];
                    class405 var36 = (class405) var35.method2616((long) field10367[--field10356], (byte) -98);
                    if (var36 != null) {
                        var2 += var36.field5378;
                    }
                } else if (var45 == 54) {
                    field10348[field10357++] = arg0.field4502[var2];
                } else if (var45 == 55) {
                    field10357--;
                } else if (var45 == 66) {
                    field10348[field10357++] = field10370[var4[var2]];
                } else if (var45 == 67) {
                    field10370[var4[var2]] = field10348[--field10357];
                } else if (var45 == 68) {
                    field10357 -= 2;
                    if (field10348[field10357 + 1] != field10348[field10357]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 69) {
                    field10357 -= 2;
                    if (field10348[field10357 + 1] == field10348[field10357]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 70) {
                    field10357 -= 2;
                    if (field10348[field10357] < field10348[field10357 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 71) {
                    field10357 -= 2;
                    if (field10348[field10357] > field10348[field10357 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 72) {
                    field10357 -= 2;
                    if (field10348[field10357] <= field10348[field10357 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 73) {
                    field10357 -= 2;
                    if (field10348[field10357] >= field10348[field10357 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 86) {
                    if (field10367[--field10356] == 1) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 87) {
                    if (field10367[--field10356] == 0) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 112) {
                    field10367[field10356++] = method4140(var4[var2]);
                } else if (var45 == 113) {
                    field10367[field10356++] = method4137(var4[var2]);
                } else if (var45 == 114) {
                    field10348[field10357++] = method4134(var4[var2]);
                } else if (var45 == 115) {
                    field10361[field10345++] = method4138(var4[var2]);
                }
            }
        } catch (Exception var44) {
            if (arg0.field4506 == null) {
                StringBuffer var42 = new StringBuffer(30);
                var42.append("CS2: ").append(arg0.field4108).append(" ");
                for (int var43 = field10371 - 1; var43 >= 0; var43--) {
                    var42.append("v: ").append(field10366[var43].field1908.field4108).append(" ");
                }
                var42.append("op: ").append(var5);
                class416.method2401(1, var44, var42.toString());
            } else {
                class648.method3504(-110, 4, "Clientscript error in: " + arg0.field4506);
                StringBuffer var39 = new StringBuffer(30);
                var39.append("Clientscript error in: ").append(arg0.field4506).append("\n");
                for (int var40 = field10371 - 1; var40 >= 0; var40--) {
                    var39.append("via: ").append(field10366[var40].field1908.field4506).append("\n");
                }
                var39.append("Op: ").append(var5).append("\n");
                String var41 = var44.getMessage();
                if (var41 != null && var41.length() > 0) {
                    var39.append("Message: ").append(var41).append("\n");
                }
                class416.method2401(1, var44, var39.toString());
                class789.method4318(var39.toString(), false);
            }
        }
    }

    @OriginalMember(owner = "client!wca", name = "e", descriptor = "(I)V")
    public static final void method4142(int arg0) {
        if (arg0 == -1 || !class683.method3667(arg0, -53)) {
            return;
        }
        class391[] var1 = class647.field8259[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class391 var3 = var1[var2];
            if (var3.field5100 != null) {
                class244 var4 = new class244();
                var4.field3350 = var3;
                var4.field3349 = var3.field5100;
                method4150(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(Ljava/lang/String;I)V")
    private static final void method4143(String arg0, int arg1) {
        if (class20.field186 == 0 && !(!class227.field3073 || class731.field9576) || class776.field10593) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class659.field8591.method3589(0, -22395))) {
            var3 = 0;
            arg0 = arg0.substring(class659.field8591.method3589(0, -22395).length());
        } else if (var2.startsWith(class659.field8592.method3589(0, -22395))) {
            var3 = 1;
            arg0 = arg0.substring(class659.field8592.method3589(0, -22395).length());
        } else if (var2.startsWith(class659.field8593.method3589(0, -22395))) {
            var3 = 2;
            arg0 = arg0.substring(class659.field8593.method3589(0, -22395).length());
        } else if (var2.startsWith(class659.field8594.method3589(0, -22395))) {
            var3 = 3;
            arg0 = arg0.substring(class659.field8594.method3589(0, -22395).length());
        } else if (var2.startsWith(class659.field8595.method3589(0, -22395))) {
            var3 = 4;
            arg0 = arg0.substring(class659.field8595.method3589(0, -22395).length());
        } else if (var2.startsWith(class659.field8596.method3589(0, -22395))) {
            var3 = 5;
            arg0 = arg0.substring(class659.field8596.method3589(0, -22395).length());
        } else if (var2.startsWith(class659.field8597.method3589(0, -22395))) {
            var3 = 6;
            arg0 = arg0.substring(class659.field8597.method3589(0, -22395).length());
        } else if (var2.startsWith(class659.field8598.method3589(0, -22395))) {
            var3 = 7;
            arg0 = arg0.substring(class659.field8598.method3589(0, -22395).length());
        } else if (var2.startsWith(class659.field8599.method3589(0, -22395))) {
            var3 = 8;
            arg0 = arg0.substring(class659.field8599.method3589(0, -22395).length());
        } else if (var2.startsWith(class659.field8600.method3589(0, -22395))) {
            var3 = 9;
            arg0 = arg0.substring(class659.field8600.method3589(0, -22395).length());
        } else if (var2.startsWith(class659.field8601.method3589(0, -22395))) {
            var3 = 10;
            arg0 = arg0.substring(class659.field8601.method3589(0, -22395).length());
        } else if (var2.startsWith(class659.field8602.method3589(0, -22395))) {
            var3 = 11;
            arg0 = arg0.substring(class659.field8602.method3589(0, -22395).length());
        } else if (class496.field6338 != 0) {
            if (var2.startsWith(class659.field8591.method3589(class496.field6338, -22395))) {
                var3 = 0;
                arg0 = arg0.substring(class659.field8591.method3589(class496.field6338, -22395).length());
            } else if (var2.startsWith(class659.field8592.method3589(class496.field6338, -22395))) {
                var3 = 1;
                arg0 = arg0.substring(class659.field8592.method3589(class496.field6338, -22395).length());
            } else if (var2.startsWith(class659.field8593.method3589(class496.field6338, -22395))) {
                var3 = 2;
                arg0 = arg0.substring(class659.field8593.method3589(class496.field6338, -22395).length());
            } else if (var2.startsWith(class659.field8594.method3589(class496.field6338, -22395))) {
                var3 = 3;
                arg0 = arg0.substring(class659.field8594.method3589(class496.field6338, -22395).length());
            } else if (var2.startsWith(class659.field8595.method3589(class496.field6338, -22395))) {
                var3 = 4;
                arg0 = arg0.substring(class659.field8595.method3589(class496.field6338, -22395).length());
            } else if (var2.startsWith(class659.field8596.method3589(class496.field6338, -22395))) {
                var3 = 5;
                arg0 = arg0.substring(class659.field8596.method3589(class496.field6338, -22395).length());
            } else if (var2.startsWith(class659.field8597.method3589(class496.field6338, -22395))) {
                var3 = 6;
                arg0 = arg0.substring(class659.field8597.method3589(class496.field6338, -22395).length());
            } else if (var2.startsWith(class659.field8598.method3589(class496.field6338, -22395))) {
                var3 = 7;
                arg0 = arg0.substring(class659.field8598.method3589(class496.field6338, -22395).length());
            } else if (var2.startsWith(class659.field8599.method3589(class496.field6338, -22395))) {
                var3 = 8;
                arg0 = arg0.substring(class659.field8599.method3589(class496.field6338, -22395).length());
            } else if (var2.startsWith(class659.field8600.method3589(class496.field6338, -22395))) {
                var3 = 9;
                arg0 = arg0.substring(class659.field8600.method3589(class496.field6338, -22395).length());
            } else if (var2.startsWith(class659.field8601.method3589(class496.field6338, -22395))) {
                var3 = 10;
                arg0 = arg0.substring(class659.field8601.method3589(class496.field6338, -22395).length());
            } else if (var2.startsWith(class659.field8602.method3589(class496.field6338, -22395))) {
                var3 = 11;
                arg0 = arg0.substring(class659.field8602.method3589(class496.field6338, -22395).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class659.field8603.method3589(0, -22395))) {
            var5 = 1;
            arg0 = arg0.substring(class659.field8603.method3589(0, -22395).length());
        } else if (var4.startsWith(class659.field8604.method3589(0, -22395))) {
            var5 = 2;
            arg0 = arg0.substring(class659.field8604.method3589(0, -22395).length());
        } else if (var4.startsWith(class659.field8605.method3589(0, -22395))) {
            var5 = 3;
            arg0 = arg0.substring(class659.field8605.method3589(0, -22395).length());
        } else if (var4.startsWith(class659.field8606.method3589(0, -22395))) {
            var5 = 4;
            arg0 = arg0.substring(class659.field8606.method3589(0, -22395).length());
        } else if (var4.startsWith(class659.field8607.method3589(0, -22395))) {
            var5 = 5;
            arg0 = arg0.substring(class659.field8607.method3589(0, -22395).length());
        } else if (class496.field6338 != 0) {
            if (var4.startsWith(class659.field8603.method3589(class496.field6338, -22395))) {
                var5 = 1;
                arg0 = arg0.substring(class659.field8603.method3589(class496.field6338, -22395).length());
            } else if (var4.startsWith(class659.field8604.method3589(class496.field6338, -22395))) {
                var5 = 2;
                arg0 = arg0.substring(class659.field8604.method3589(class496.field6338, -22395).length());
            } else if (var4.startsWith(class659.field8605.method3589(class496.field6338, -22395))) {
                var5 = 3;
                arg0 = arg0.substring(class659.field8605.method3589(class496.field6338, -22395).length());
            } else if (var4.startsWith(class659.field8606.method3589(class496.field6338, -22395))) {
                var5 = 4;
                arg0 = arg0.substring(class659.field8606.method3589(class496.field6338, -22395).length());
            } else if (var4.startsWith(class659.field8607.method3589(class496.field6338, -22395))) {
                var5 = 5;
                arg0 = arg0.substring(class659.field8607.method3589(class496.field6338, -22395).length());
            }
        }
        field10373++;
        class13 var6 = class659.method3587(class68.field909, 98, class624.field7948);
        var6.field130.method1491(-129, 0);
        int var7 = var6.field130.field3133;
        var6.field130.method1491(-129, var3);
        var6.field130.method1491(-129, var5);
        class292.method1763(var6.field130, arg0, (byte) 54);
        var6.field130.method1532(var6.field130.field3133 - var7, 95);
        class116.method679(var6, 0);
    }

    @OriginalMember(owner = "client!wca", name = "f", descriptor = "(I)V")
    private static final void method4144(int arg0) {
        class391 var1 = class738.method4006(92, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class391[] var3 = class598.field7612[var2];
        if (var3 == null) {
            class391[] var4 = class647.field8259[var2];
            int var5 = var4.length;
            var3 = class598.field7612[var2] = new class391[var5];
            class642.method3474(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class642.method3474(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "()V")
    public static void method4145() {
        field10358 = null;
        field10350 = null;
        field10370 = null;
        field10343 = null;
        field10363 = null;
        field10367 = null;
        field10361 = null;
        field10348 = null;
        field10366 = null;
        field10349 = null;
        field10355 = null;
        field10354 = null;
        field10347 = null;
        field10368 = null;
        field10344 = null;
        field10360 = null;
    }

    @OriginalMember(owner = "client!wca", name = "c", descriptor = "(IZ)V")
    public static final void method4146(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!wca", name = "g", descriptor = "(I)V")
    private static final void method4147(int arg0) {
        class391 var1 = class738.method4006(124, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class391[] var3 = class598.field7612[var2];
        if (var3 == null) {
            class391[] var4 = class647.field8259[var2];
            int var5 = var4.length;
            var3 = class598.field7612[var2] = new class391[var5];
            class642.method3474(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class642.method3474(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lfn;)V")
    public static final void method4148(class244 arg0) {
        method4150(arg0, 200000);
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lwu;II)V")
    public static final void method4149(class582 arg0, int arg1, int arg2) {
        class368 var3 = class535.method2915(arg1, 1521386064, arg2, arg0);
        if (var3 == null) {
            return;
        }
        field10358 = new int[var3.field4510];
        field10350 = new String[var3.field4501];
        if (class474.field6162 == var3.field4511 || class176.field2316 == var3.field4511 || class668.field8686 == var3.field4511) {
            int var4 = 0;
            int var5 = 0;
            if (class558.field7088 != null) {
                var4 = class558.field7088.field5119;
                var5 = class558.field7088.field5003;
            }
            field10358[0] = class737.field9980.method210(0) - var4;
            field10358[1] = class737.field9980.method208(-123) - var5;
        }
        method4141(var3, 200000);
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lfn;I)V")
    private static final void method4150(class244 arg0, int arg1) {
        Object[] var2 = arg0.field3349;
        int var3 = (Integer) var2[0];
        class368 var4 = class230.method1477((byte) -79, var3);
        if (var4 == null) {
            return;
        }
        field10358 = new int[var4.field4510];
        int var5 = 0;
        field10350 = new String[var4.field4501];
        int var6 = 0;
        field10370 = new long[var4.field4504];
        int var7 = 0;
        for (int var8 = 1; var8 < var2.length; var8++) {
            if (var2[var8] instanceof Integer) {
                int var9 = (Integer) var2[var8];
                if (var9 == -2147483647) {
                    var9 = arg0.field3346;
                }
                if (var9 == -2147483646) {
                    var9 = arg0.field3358;
                }
                if (var9 == -2147483645) {
                    var9 = arg0.field3350 == null ? -1 : arg0.field3350.field5151;
                }
                if (var9 == -2147483644) {
                    var9 = arg0.field3354;
                }
                if (var9 == -2147483643) {
                    var9 = arg0.field3350 == null ? -1 : arg0.field3350.field5039;
                }
                if (var9 == -2147483642) {
                    var9 = arg0.field3352 == null ? -1 : arg0.field3352.field5151;
                }
                if (var9 == -2147483641) {
                    var9 = arg0.field3352 == null ? -1 : arg0.field3352.field5039;
                }
                if (var9 == -2147483640) {
                    var9 = arg0.field3348;
                }
                if (var9 == -2147483639) {
                    var9 = arg0.field3355;
                }
                field10358[var5++] = var9;
            } else if (var2[var8] instanceof String) {
                String var10 = (String) var2[var8];
                if (var10.equals("event_opbase")) {
                    var10 = arg0.field3353;
                }
                field10350[var6++] = var10;
            } else if (var2[var8] instanceof Long) {
                long var11 = (Long) var2[var8];
                field10370[var7++] = var11;
            }
        }
        field10374 = arg0.field3345;
        method4141(var4, arg1);
    }

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "()V")
    public static final void method4151() {
    }
}
