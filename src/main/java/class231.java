import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class231 {

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "Loc;")
    public static class151 field4117 = class137.method873(2, "Anmelde)2Limit -Uberschritten)3");

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "Loc;")
    private static class151 field4115 = class137.method873(2, "flash1:");

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "Loc;")
    public static class151 field4120 = field4115;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "Loc;")
    private static class151 field4121 = field4115;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "Loc;")
    public static class151 field4124 = class137.method873(2, "und die Schaltfl-=che (WSpielkonto erstellen(W am");

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "[Z")
    public static boolean[] field4125 = new boolean[112];

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "Lsd;")
    public static class192 field4127;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "Luf;")
    public static class214 field4126;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "Lwd;")
    public static class232 field4116;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "[[[I")
    public static int[][][] field4122;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V")
    public static final void method1507(int arg0) {
        class165.method1066(class36.field751, class202.field3602, (byte) 103, class31.field652);
        field4123++;
        if (arg0 != 0) {
            method1510(-111, -12, -63, -57, -30, -122, -11, 107);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V")
    public static void method1508(byte arg0) {
        field4124 = null;
        field4120 = null;
        if (arg0 != -104) {
            method1510(-75, 119, 61, -115, -72, 126, 30, 94);
        }
        field4116 = null;
        field4121 = null;
        field4122 = null;
        field4125 = null;
        field4117 = null;
        field4126 = null;
        field4115 = null;
        field4127 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IILvf;)V")
    public static final void method1509(int arg0, int arg1, class224 arg2) {
        Object[] var3 = arg2.field3895;
        field4118++;
        int var4 = (Integer) var3[0];
        class16 var5 = class19.method167(var4, 0);
        if (var5 == null) {
            return;
        }
        class51.field1037 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        int[] var9 = var5.field379;
        byte var10 = -1;
        int[] var11 = var5.field386;
        try {
            class169.field3077 = new int[var5.field366];
            class174.field3153 = new class151[var5.field369];
            int var12 = 0;
            int var13 = 0;
            int var14 = 9 % ((arg1 - 73) / 50);
            for (int var15 = 1; var15 < var3.length; var15++) {
                if (var3[var15] instanceof Integer) {
                    int var16 = (Integer) var3[var15];
                    if (var16 == -2147483647) {
                        var16 = arg2.field3900;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg2.field3897;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg2.field3905 == null ? -1 : arg2.field3905.field4261;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg2.field3894;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg2.field3905 == null ? -1 : arg2.field3905.field4174;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg2.field3907 == null ? -1 : arg2.field3907.field4261;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg2.field3907 == null ? -1 : arg2.field3907.field4174;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg2.field3893;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg2.field3899;
                    }
                    class169.field3077[var13++] = var16;
                } else if (var3[var15] instanceof class151) {
                    class151 var17 = (class151) var3[var15];
                    if (var17.method976(48, class36.field756)) {
                        var17 = arg2.field3906;
                    }
                    class174.field3153[var12++] = var17;
                }
            }
            int var18 = 0;
            label2417: while (true) {
                var18++;
                if (arg0 < var18) {
                    throw new RuntimeException("slow");
                }
                var8++;
                int var366 = var9[var8];
                if (var366 < 100) {
                    if (var366 == 0) {
                        class16.field381[var6++] = var11[var8];
                        continue;
                    }
                    if (var366 == 1) {
                        int var19 = var11[var8];
                        class16.field381[var6++] = class156.field2836[var19];
                        continue;
                    }
                    if (var366 == 2) {
                        int var20 = var11[var8];
                        var6--;
                        class156.field2836[var20] = class16.field381[var6];
                        continue;
                    }
                    if (var366 == 3) {
                        class222.field3848[var7++] = var5.field385[var8];
                        continue;
                    }
                    if (var366 == 6) {
                        var8 += var11[var8];
                        continue;
                    }
                    if (var366 == 7) {
                        var6 -= 2;
                        if (class16.field381[var6 + 1] != class16.field381[var6]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var366 == 8) {
                        var6 -= 2;
                        if (class16.field381[var6 + 1] == class16.field381[var6]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var366 == 9) {
                        var6 -= 2;
                        if (class16.field381[var6] < class16.field381[var6 + 1]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var366 == 10) {
                        var6 -= 2;
                        if (class16.field381[var6 + 1] < class16.field381[var6]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var366 == 21) {
                        if (class51.field1037 == 0) {
                            return;
                        }
                        class227 var21 = class106.field1882[--class51.field1037];
                        var5 = var21.field3966;
                        var8 = var21.field3951;
                        var11 = var5.field386;
                        var9 = var5.field379;
                        class169.field3077 = var21.field3952;
                        class174.field3153 = var21.field3950;
                        continue;
                    }
                    if (var366 == 25) {
                        int var22 = var11[var8];
                        class16.field381[var6++] = class181.method1140(var22, (byte) -122);
                        continue;
                    }
                    if (var366 == 27) {
                        int var23 = var11[var8];
                        var6--;
                        class168.method1089(var23, class16.field381[var6], 0);
                        continue;
                    }
                    if (var366 == 31) {
                        var6 -= 2;
                        if (class16.field381[var6] <= class16.field381[var6 + 1]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var366 == 32) {
                        var6 -= 2;
                        if (class16.field381[var6 + 1] <= class16.field381[var6]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var366 == 33) {
                        class16.field381[var6++] = class169.field3077[var11[var8]];
                        continue;
                    }
                    int var10001;
                    if (var366 == 34) {
                        var10001 = var11[var8];
                        var6--;
                        class169.field3077[var10001] = class16.field381[var6];
                        continue;
                    }
                    if (var366 == 35) {
                        class222.field3848[var7++] = class174.field3153[var11[var8]];
                        continue;
                    }
                    if (var366 == 36) {
                        var10001 = var11[var8];
                        var7--;
                        class174.field3153[var10001] = class222.field3848[var7];
                        continue;
                    }
                    if (var366 == 37) {
                        int var24 = var11[var8];
                        var7 -= var24;
                        class151 var25 = class142.method919(class222.field3848, true, var7, var24);
                        class222.field3848[var7++] = var25;
                        continue;
                    }
                    if (var366 == 38) {
                        var6--;
                        continue;
                    }
                    if (var366 == 39) {
                        var7--;
                        continue;
                    }
                    if (var366 == 40) {
                        int var26 = var11[var8];
                        class16 var27 = class19.method167(var26, 0);
                        int[] var28 = new int[var27.field366];
                        class151[] var29 = new class151[var27.field369];
                        for (int var30 = 0; var30 < var27.field376; var30++) {
                            var28[var30] = class16.field381[var6 + var30 - var27.field376];
                        }
                        for (int var31 = 0; var31 < var27.field380; var31++) {
                            var29[var31] = class222.field3848[var7 + var31 - var27.field380];
                        }
                        var6 -= var27.field376;
                        var7 -= var27.field380;
                        class227 var32 = new class227();
                        var32.field3951 = var8;
                        var32.field3966 = var5;
                        var32.field3952 = class169.field3077;
                        var32.field3950 = class174.field3153;
                        if (class106.field1882.length <= class51.field1037) {
                            throw new RuntimeException();
                        }
                        var5 = var27;
                        var8 = -1;
                        class106.field1882[class51.field1037++] = var32;
                        var9 = var27.field379;
                        class174.field3153 = var29;
                        class169.field3077 = var28;
                        var11 = var27.field386;
                        continue;
                    }
                    if (var366 == 42) {
                        class16.field381[var6++] = class104.field1865[var11[var8]];
                        continue;
                    }
                    if (var366 == 43) {
                        var10001 = var11[var8];
                        var6--;
                        class104.field1865[var10001] = class16.field381[var6];
                        continue;
                    }
                    if (var366 == 44) {
                        int var33 = var11[var8] >> 16;
                        int var34 = var11[var8] & 0xFFFF;
                        var6--;
                        int var35 = class16.field381[var6];
                        if (var35 >= 0 && var35 <= 5000) {
                            class160.field2890[var33] = var35;
                            byte var36 = -1;
                            if (var34 == 105) {
                                var36 = 0;
                            }
                            int var37 = 0;
                            while (true) {
                                if (var35 <= var37) {
                                    continue label2417;
                                }
                                class229.field4063[var33][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var366 == 45) {
                        int var38 = var11[var8];
                        var6--;
                        int var39 = class16.field381[var6];
                        if (var39 >= 0 && class160.field2890[var38] > var39) {
                            class16.field381[var6++] = class229.field4063[var38][var39];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var366 == 46) {
                        var6 -= 2;
                        int var40 = var11[var8];
                        int var41 = class16.field381[var6];
                        if (var41 >= 0 && class160.field2890[var40] > var41) {
                            class229.field4063[var40][var41] = class16.field381[var6 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var366 == 47) {
                        class151 var42 = class99.field1790[var11[var8]];
                        if (var42 == null) {
                            var42 = class55.field1107;
                        }
                        class222.field3848[var7++] = var42;
                        continue;
                    }
                    if (var366 == 48) {
                        var10001 = var11[var8];
                        var7--;
                        class99.field1790[var10001] = class222.field3848[var7];
                        continue;
                    }
                    if (var366 == 51) {
                        class236 var43 = var5.field377[var11[var8]];
                        var6--;
                        class170 var44 = (class170) var43.method1538((long) class16.field381[var6], (byte) 127);
                        if (var44 != null) {
                            var8 += var44.field3098;
                        }
                        continue;
                    }
                }
                boolean var45;
                if (var11[var8] == 1) {
                    var45 = true;
                } else {
                    var45 = false;
                }
                if (var366 < 300) {
                    if (var366 == 100) {
                        var6 -= 3;
                        int var46 = class16.field381[var6 + 1];
                        int var47 = class16.field381[var6];
                        int var48 = class16.field381[var6 + 2];
                        if (var46 == 0) {
                            throw new RuntimeException();
                        }
                        class232 var49 = class175.method1115(-22192, var47);
                        if (var49.field4239 == null) {
                            var49.field4239 = new class232[var48 + 1];
                        }
                        if (var49.field4239.length <= var48) {
                            class232[] var50 = new class232[var48 + 1];
                            for (int var51 = 0; var51 < var49.field4239.length; var51++) {
                                var50[var51] = var49.field4239[var51];
                            }
                            var49.field4239 = var50;
                        }
                        if (var48 > 0 && var49.field4239[var48 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var48 - 1));
                        }
                        class232 var52 = new class232();
                        var52.field4237 = true;
                        var52.field4174 = var48;
                        var52.field4173 = var46;
                        var52.field4156 = var52.field4261 = var49.field4261;
                        var49.field4239[var48] = var52;
                        if (var45) {
                            class99.field1786 = var52;
                        } else {
                            class16.field388 = var52;
                        }
                        class27.method208(true, var49);
                        continue;
                    }
                    if (var366 == 101) {
                        class232 var53 = var45 ? class99.field1786 : class16.field388;
                        if (var53.field4174 == -1) {
                            if (!var45) {
                                throw new RuntimeException("Tried to cc_delete static active-component!");
                            }
                            throw new RuntimeException("Tried to .cc_delete static .active-component!");
                        }
                        class232 var54 = class175.method1115(-22192, var53.field4261);
                        var54.field4239[var53.field4174] = null;
                        class27.method208(true, var54);
                        continue;
                    }
                    if (var366 == 102) {
                        var6--;
                        class232 var55 = class175.method1115(-22192, class16.field381[var6]);
                        var55.field4239 = null;
                        class27.method208(true, var55);
                        continue;
                    }
                    if (var366 == 200) {
                        var6 -= 2;
                        int var56 = class16.field381[var6];
                        int var57 = class16.field381[var6 + 1];
                        class232 var58 = class197.method1235(-111, var56, var57);
                        if (var58 != null && var57 != -1) {
                            class16.field381[var6++] = 1;
                            if (var45) {
                                class99.field1786 = var58;
                            } else {
                                class16.field388 = var58;
                            }
                            continue;
                        }
                        class16.field381[var6++] = 0;
                        continue;
                    }
                    if (var366 == 201) {
                        var6--;
                        int var59 = class16.field381[var6];
                        class232 var60 = class175.method1115(-22192, var59);
                        if (var60 == null) {
                            class16.field381[var6++] = 0;
                        } else {
                            class16.field381[var6++] = 1;
                            if (var45) {
                                class99.field1786 = var60;
                            } else {
                                class16.field388 = var60;
                            }
                        }
                        continue;
                    }
                } else if (var366 < 500) {
                    if (var366 == 403) {
                        var6 -= 2;
                        int var356 = class16.field381[var6];
                        if (var356 >= 7) {
                            var356 -= 7;
                        }
                        int var357 = class16.field381[var6 + 1];
                        class228.field3975.field439.method313((byte) 111, var356, var357);
                        continue;
                    }
                    if (var366 == 404) {
                        var6 -= 2;
                        int var358 = class16.field381[var6 + 1];
                        int var359 = class16.field381[var6];
                        class228.field3975.field439.method312(-1117581470, var359, var358);
                        continue;
                    }
                    if (var366 == 410) {
                        var6--;
                        boolean var360 = class16.field381[var6] != 0;
                        class228.field3975.field439.method315(0, var360);
                        continue;
                    }
                } else if (var366 >= 1000 && var366 < 1100 || !(var366 < 2000 || var366 >= 2100)) {
                    class232 var354;
                    if (var366 >= 2000) {
                        var366 -= 1000;
                        var6--;
                        var354 = class175.method1115(-22192, class16.field381[var6]);
                    } else {
                        var354 = var45 ? class99.field1786 : class16.field388;
                    }
                    if (var366 == 1000) {
                        var354.field4246 = 0;
                        var6 -= 2;
                        var354.field4191 = var354.field4210 = class16.field381[var6];
                        var354.field4136 = 0;
                        var354.field4154 = var354.field4131 = class16.field381[var6 + 1];
                        class27.method208(true, var354);
                        continue;
                    }
                    if (var366 == 1001) {
                        var354.field4147 = 0;
                        var6 -= 2;
                        var354.field4215 = var354.field4252 = class16.field381[var6];
                        var354.field4225 = 0;
                        var354.field4141 = 0;
                        var354.field4216 = var354.field4205 = class16.field381[var6 + 1];
                        var354.field4178 = 0;
                        class27.method208(true, var354);
                        if (var354.field4173 == 0) {
                            class110.method665(var354, (byte) -123);
                        }
                        continue;
                    }
                    if (var366 == 1003) {
                        var6--;
                        boolean var355 = class16.field381[var6] == 1;
                        if (var355 != var354.field4235) {
                            var354.field4235 = var355;
                            class27.method208(true, var354);
                        }
                        continue;
                    }
                } else if (var366 >= 1100 && var366 < 1200 || var366 >= 2100 && var366 < 2200) {
                    class232 var351;
                    if (var366 < 2000) {
                        var351 = var45 ? class99.field1786 : class16.field388;
                    } else {
                        var366 -= 1000;
                        var6--;
                        var351 = class175.method1115(-22192, class16.field381[var6]);
                    }
                    if (var366 == 1100) {
                        var6 -= 2;
                        var351.field4137 = class16.field381[var6];
                        if (var351.field4244 - var351.field4215 < var351.field4137) {
                            var351.field4137 = var351.field4244 - var351.field4215;
                        }
                        if (var351.field4137 < 0) {
                            var351.field4137 = 0;
                        }
                        var351.field4195 = class16.field381[var6 + 1];
                        if (var351.field4194 - var351.field4216 < var351.field4195) {
                            var351.field4195 = var351.field4194 - var351.field4216;
                        }
                        if (var351.field4195 < 0) {
                            var351.field4195 = 0;
                        }
                        class27.method208(true, var351);
                        continue;
                    }
                    if (var366 == 1101) {
                        var6--;
                        var351.field4243 = class16.field381[var6];
                        class27.method208(true, var351);
                        continue;
                    }
                    if (var366 == 1102) {
                        var6--;
                        var351.field4144 = class16.field381[var6] == 1;
                        class27.method208(true, var351);
                        continue;
                    }
                    if (var366 == 1103) {
                        var6--;
                        var351.field4271 = class16.field381[var6];
                        class27.method208(true, var351);
                        continue;
                    }
                    if (var366 == 1104) {
                        var6--;
                        var351.field4180 = class16.field381[var6];
                        class27.method208(true, var351);
                        continue;
                    }
                    if (var366 == 1105) {
                        var6--;
                        var351.field4206 = class16.field381[var6];
                        class27.method208(true, var351);
                        continue;
                    }
                    if (var366 == 1106) {
                        var6--;
                        var351.field4258 = class16.field381[var6];
                        class27.method208(true, var351);
                        continue;
                    }
                    if (var366 == 1107) {
                        var6--;
                        var351.field4257 = class16.field381[var6] == 1;
                        class27.method208(true, var351);
                        continue;
                    }
                    if (var366 == 1108) {
                        var351.field4149 = 1;
                        var6--;
                        var351.field4165 = class16.field381[var6];
                        class27.method208(true, var351);
                        continue;
                    }
                    if (var366 == 1109) {
                        var6 -= 6;
                        var351.field4213 = class16.field381[var6];
                        var351.field4130 = class16.field381[var6 + 1];
                        var351.field4251 = class16.field381[var6 + 2];
                        var351.field4269 = class16.field381[var6 + 3];
                        var351.field4230 = class16.field381[var6 + 4];
                        var351.field4249 = class16.field381[var6 + 5];
                        class27.method208(true, var351);
                        continue;
                    }
                    if (var366 == 1110) {
                        var6--;
                        int var352 = class16.field381[var6];
                        if (var351.field4270 != var352) {
                            var351.field4171 = 0;
                            var351.field4270 = var352;
                            var351.field4150 = 0;
                            class27.method208(true, var351);
                        }
                        continue;
                    }
                    if (var366 == 1111) {
                        var6--;
                        var351.field4132 = class16.field381[var6] == 1;
                        class27.method208(true, var351);
                        continue;
                    }
                    if (var366 == 1112) {
                        var7--;
                        class151 var353 = class222.field3848[var7];
                        if (!var353.method976(48, var351.field4182)) {
                            var351.field4182 = var353;
                            class27.method208(true, var351);
                        }
                        continue;
                    }
                    if (var366 == 1113) {
                        var6--;
                        var351.field4170 = class16.field381[var6];
                        class27.method208(true, var351);
                        continue;
                    }
                    if (var366 == 1114) {
                        var6 -= 3;
                        var351.field4265 = class16.field381[var6];
                        var351.field4140 = class16.field381[var6 + 1];
                        var351.field4241 = class16.field381[var6 + 2];
                        class27.method208(true, var351);
                        continue;
                    }
                    if (var366 == 1115) {
                        var6--;
                        var351.field4135 = class16.field381[var6] == 1;
                        class27.method208(true, var351);
                        continue;
                    }
                    if (var366 == 1116) {
                        var6--;
                        var351.field4231 = class16.field381[var6];
                        class27.method208(true, var351);
                        continue;
                    }
                    if (var366 == 1117) {
                        var6--;
                        var351.field4260 = class16.field381[var6];
                        class27.method208(true, var351);
                        continue;
                    }
                    if (var366 == 1118) {
                        var6--;
                        var351.field4223 = class16.field381[var6] == 1;
                        class27.method208(true, var351);
                        continue;
                    }
                    if (var366 == 1119) {
                        var6--;
                        var351.field4214 = class16.field381[var6] == 1;
                        class27.method208(true, var351);
                        continue;
                    }
                    if (var366 == 1120) {
                        var6 -= 2;
                        var351.field4244 = class16.field381[var6];
                        var351.field4194 = class16.field381[var6 + 1];
                        class27.method208(true, var351);
                        if (var351.field4173 == 0) {
                            class110.method665(var351, (byte) -127);
                        }
                        continue;
                    }
                } else if (var366 >= 1200 && var366 < 1300 || var366 >= 2200 && var366 < 2300) {
                    class232 var61;
                    if (var366 >= 2000) {
                        var366 -= 1000;
                        var6--;
                        var61 = class175.method1115(-22192, class16.field381[var6]);
                    } else {
                        var61 = var45 ? class99.field1786 : class16.field388;
                    }
                    class27.method208(true, var61);
                    if (var366 == 1200 || var366 == 1205) {
                        var6 -= 2;
                        int var62 = class16.field381[var6 + 1];
                        int var63 = class16.field381[var6];
                        if (var63 == -1) {
                            var61.field4165 = -1;
                            var61.field4149 = 1;
                            var61.field4129 = -1;
                        } else {
                            var61.field4129 = var63;
                            var61.field4186 = var62;
                            class12 var64 = class43.method311(var63, 0);
                            var61.field4130 = var64.field257;
                            if (var366 == 1205) {
                                var61.field4179 = false;
                            } else {
                                var61.field4179 = true;
                            }
                            var61.field4269 = var64.field258;
                            var61.field4249 = var64.field256;
                            if (var61.field4225 > 0) {
                                var61.field4249 = var61.field4249 * 32 / var61.field4225;
                            } else if (var61.field4252 > 0) {
                                var61.field4249 = var61.field4249 * 32 / var61.field4252;
                            }
                            var61.field4251 = var64.field271;
                            var61.field4213 = var64.field233;
                            var61.field4230 = var64.field225;
                        }
                        continue;
                    }
                    if (var366 == 1201) {
                        var61.field4149 = 2;
                        var6--;
                        var61.field4165 = class16.field381[var6];
                        continue;
                    }
                    if (var366 == 1202) {
                        var61.field4149 = 3;
                        var61.field4165 = class228.field3975.field439.method306(173319001);
                        continue;
                    }
                    if (var366 == 1203) {
                        var61.field4149 = 6;
                        var6--;
                        var61.field4165 = class16.field381[var6];
                        continue;
                    }
                    if (var366 == 1204) {
                        var61.field4149 = 5;
                        var6--;
                        var61.field4165 = class16.field381[var6];
                        continue;
                    }
                } else if (var366 >= 1300 && var366 < 1400 || var366 >= 2300 && var366 < 2400) {
                    class232 var347;
                    if (var366 < 2000) {
                        var347 = var45 ? class99.field1786 : class16.field388;
                    } else {
                        var366 -= 1000;
                        var6--;
                        var347 = class175.method1115(-22192, class16.field381[var6]);
                    }
                    if (var366 == 1300) {
                        var6--;
                        int var348 = class16.field381[var6] - 1;
                        if (var348 >= 0 && var348 <= 9) {
                            var7--;
                            var347.method1512(var348, class222.field3848[var7], 111);
                            continue;
                        }
                        var7--;
                        continue;
                    }
                    if (var366 == 1301) {
                        var6 -= 2;
                        int var349 = class16.field381[var6];
                        int var350 = class16.field381[var6 + 1];
                        var347.field4276 = class197.method1235(-15, var349, var350);
                        continue;
                    }
                    if (var366 == 1302) {
                        var6--;
                        var347.field4280 = class16.field381[var6] == 1;
                        continue;
                    }
                    if (var366 == 1303) {
                        var6--;
                        var347.field4164 = class16.field381[var6];
                        continue;
                    }
                    if (var366 == 1304) {
                        var6--;
                        var347.field4157 = class16.field381[var6];
                        continue;
                    }
                    if (var366 == 1305) {
                        var7--;
                        var347.field4181 = class222.field3848[var7];
                        continue;
                    }
                    if (var366 == 1306) {
                        var7--;
                        var347.field4151 = class222.field3848[var7];
                        continue;
                    }
                    if (var366 == 1307) {
                        var347.field4278 = null;
                        continue;
                    }
                } else {
                    if (var366 >= 1400 && var366 < 1500 || var366 >= 2400 && var366 < 2500) {
                        class232 var340;
                        if (var366 >= 2000) {
                            var6--;
                            var340 = class175.method1115(-22192, class16.field381[var6]);
                            var366 -= 1000;
                        } else {
                            var340 = var45 ? class99.field1786 : class16.field388;
                        }
                        var7--;
                        class151 var341 = class222.field3848[var7];
                        int[] var342 = null;
                        if (var341.method988(-1) > 0 && var341.method979(var341.method988(-1) - 1, (byte) 20) == 89) {
                            var6--;
                            int var343 = class16.field381[var6];
                            if (var343 > 0) {
                                var342 = new int[var343];
                                while (var343-- > 0) {
                                    var6--;
                                    var342[var343] = class16.field381[var6];
                                }
                            }
                            var341 = var341.method987((byte) 118, var341.method988(-1) - 1, 0);
                        }
                        Object[] var344 = new Object[var341.method988(-1) + 1];
                        for (int var345 = var344.length - 1; var345 >= 1; var345--) {
                            if (var341.method979(var345 - 1, (byte) -128) == 115) {
                                var7--;
                                var344[var345] = class222.field3848[var7];
                            } else {
                                var6--;
                                var344[var345] = Integer.valueOf(class16.field381[var6]);
                            }
                        }
                        var6--;
                        int var346 = class16.field381[var6];
                        if (var346 == -1) {
                            var344 = null;
                        } else {
                            var344[0] = Integer.valueOf(var346);
                        }
                        if (var366 == 1415) {
                            var340.field4172 = var342;
                            var340.field4139 = var344;
                        }
                        if (var366 == 1421) {
                            var340.field4196 = var344;
                        }
                        if (var366 == 1420) {
                            var340.field4192 = var344;
                        }
                        if (var366 == 1403) {
                            var340.field4142 = var344;
                        }
                        if (var366 == 1414) {
                            var340.field4253 = var342;
                            var340.field4177 = var344;
                        }
                        if (var366 == 1412) {
                            var340.field4167 = var344;
                        }
                        if (var366 == 1419) {
                            var340.field4143 = var344;
                        }
                        if (var366 == 1423) {
                            var340.field4268 = var344;
                        }
                        if (var366 == 1411) {
                            var340.field4250 = var344;
                        }
                        if (var366 == 1424) {
                            var340.field4152 = var344;
                        }
                        var340.field4217 = true;
                        if (var366 == 1416) {
                            var340.field4185 = var344;
                        }
                        if (var366 == 1425) {
                            var340.field4134 = var344;
                        }
                        if (var366 == 1422) {
                            var340.field4266 = var344;
                        }
                        if (var366 == 1408) {
                            var340.field4197 = var344;
                        }
                        if (var366 == 1409) {
                            var340.field4226 = var344;
                        }
                        if (var366 == 1418) {
                            var340.field4245 = var344;
                        }
                        if (var366 == 1406) {
                            var340.field4159 = var344;
                        }
                        if (var366 == 1404) {
                            var340.field4236 = var344;
                        }
                        if (var366 == 1400) {
                            var340.field4200 = var344;
                        }
                        if (var366 == 1407) {
                            var340.field4240 = var342;
                            var340.field4190 = var344;
                        }
                        if (var366 == 1410) {
                            var340.field4221 = var344;
                        }
                        if (var366 == 1405) {
                            var340.field4228 = var344;
                        }
                        if (var366 == 1417) {
                            var340.field4166 = var344;
                        }
                        if (var366 == 1402) {
                            var340.field4161 = var344;
                        }
                        if (var366 == 1401) {
                            var340.field4254 = var344;
                        }
                        continue;
                    }
                    if (var366 < 1600) {
                        class232 var339 = var45 ? class99.field1786 : class16.field388;
                        if (var366 == 1500) {
                            class16.field381[var6++] = var339.field4191;
                            continue;
                        }
                        if (var366 == 1501) {
                            class16.field381[var6++] = var339.field4154;
                            continue;
                        }
                        if (var366 == 1502) {
                            class16.field381[var6++] = var339.field4215;
                            continue;
                        }
                        if (var366 == 1503) {
                            class16.field381[var6++] = var339.field4216;
                            continue;
                        }
                        if (var366 == 1504) {
                            class16.field381[var6++] = var339.field4235 ? 1 : 0;
                            continue;
                        }
                        if (var366 == 1505) {
                            class16.field381[var6++] = var339.field4156;
                            continue;
                        }
                    } else if (var366 < 1700) {
                        class232 var65 = var45 ? class99.field1786 : class16.field388;
                        if (var366 == 1600) {
                            class16.field381[var6++] = var65.field4137;
                            continue;
                        }
                        if (var366 == 1601) {
                            class16.field381[var6++] = var65.field4195;
                            continue;
                        }
                        if (var366 == 1602) {
                            class222.field3848[var7++] = var65.field4182;
                            continue;
                        }
                        if (var366 == 1603) {
                            class16.field381[var6++] = var65.field4244;
                            continue;
                        }
                        if (var366 == 1604) {
                            class16.field381[var6++] = var65.field4194;
                            continue;
                        }
                        if (var366 == 1605) {
                            class16.field381[var6++] = var65.field4249;
                            continue;
                        }
                        if (var366 == 1606) {
                            class16.field381[var6++] = var65.field4251;
                            continue;
                        }
                        if (var366 == 1607) {
                            class16.field381[var6++] = var65.field4230;
                            continue;
                        }
                        if (var366 == 1608) {
                            class16.field381[var6++] = var65.field4269;
                            continue;
                        }
                        if (var366 == 1609) {
                            class16.field381[var6++] = var65.field4271;
                            continue;
                        }
                    } else if (var366 < 1800) {
                        class232 var66 = var45 ? class99.field1786 : class16.field388;
                        if (var366 == 1700) {
                            class16.field381[var6++] = var66.field4129;
                            continue;
                        }
                        if (var366 == 1701) {
                            if (var66.field4129 == -1) {
                                class16.field381[var6++] = 0;
                            } else {
                                class16.field381[var6++] = var66.field4186;
                            }
                            continue;
                        }
                        if (var366 == 1702) {
                            class16.field381[var6++] = var66.field4174;
                            continue;
                        }
                    } else if (var366 < 1900) {
                        class232 var67 = var45 ? class99.field1786 : class16.field388;
                        if (var366 == 1800) {
                            class16.field381[var6++] = class122.method739(class174.method1110(true, var67), 258072555);
                            continue;
                        }
                        if (var366 == 1801) {
                            var6--;
                            int var68 = class16.field381[var6];
                            int var367 = var68 - 1;
                            if (var67.field4278 != null && var67.field4278.length > var367 && var67.field4278[var367] != null) {
                                class222.field3848[var7++] = var67.field4278[var367];
                                continue;
                            }
                            class222.field3848[var7++] = class45.field928;
                            continue;
                        }
                        if (var366 == 1802) {
                            if (var67.field4181 == null) {
                                class222.field3848[var7++] = class45.field928;
                            } else {
                                class222.field3848[var7++] = var67.field4181;
                            }
                            continue;
                        }
                    } else if (var366 < 2600) {
                        var6--;
                        class232 var338 = class175.method1115(-22192, class16.field381[var6]);
                        if (var366 == 2500) {
                            class16.field381[var6++] = var338.field4191;
                            continue;
                        }
                        if (var366 == 2501) {
                            class16.field381[var6++] = var338.field4154;
                            continue;
                        }
                        if (var366 == 2502) {
                            class16.field381[var6++] = var338.field4215;
                            continue;
                        }
                        if (var366 == 2503) {
                            class16.field381[var6++] = var338.field4216;
                            continue;
                        }
                        if (var366 == 2504) {
                            class16.field381[var6++] = var338.field4235 ? 1 : 0;
                            continue;
                        }
                        if (var366 == 2505) {
                            class16.field381[var6++] = var338.field4156;
                            continue;
                        }
                    } else if (var366 < 2700) {
                        var6--;
                        class232 var337 = class175.method1115(-22192, class16.field381[var6]);
                        if (var366 == 2600) {
                            class16.field381[var6++] = var337.field4137;
                            continue;
                        }
                        if (var366 == 2601) {
                            class16.field381[var6++] = var337.field4195;
                            continue;
                        }
                        if (var366 == 2602) {
                            class222.field3848[var7++] = var337.field4182;
                            continue;
                        }
                        if (var366 == 2603) {
                            class16.field381[var6++] = var337.field4244;
                            continue;
                        }
                        if (var366 == 2604) {
                            class16.field381[var6++] = var337.field4194;
                            continue;
                        }
                        if (var366 == 2605) {
                            class16.field381[var6++] = var337.field4249;
                            continue;
                        }
                        if (var366 == 2606) {
                            class16.field381[var6++] = var337.field4251;
                            continue;
                        }
                        if (var366 == 2607) {
                            class16.field381[var6++] = var337.field4230;
                            continue;
                        }
                        if (var366 == 2608) {
                            class16.field381[var6++] = var337.field4269;
                            continue;
                        }
                        if (var366 == 2609) {
                            class16.field381[var6++] = var337.field4271;
                            continue;
                        }
                    } else if (var366 < 2800) {
                        if (var366 == 2700) {
                            var6--;
                            class232 var69 = class175.method1115(-22192, class16.field381[var6]);
                            class16.field381[var6++] = var69.field4129;
                            continue;
                        }
                        if (var366 == 2701) {
                            var6--;
                            class232 var70 = class175.method1115(-22192, class16.field381[var6]);
                            if (var70.field4129 == -1) {
                                class16.field381[var6++] = 0;
                            } else {
                                class16.field381[var6++] = var70.field4186;
                            }
                            continue;
                        }
                        if (var366 == 2702) {
                            var6--;
                            int var71 = class16.field381[var6];
                            class147 var72 = (class147) class227.field3961.method1538((long) var71, (byte) 127);
                            if (var72 == null) {
                                class16.field381[var6++] = 0;
                            } else {
                                class16.field381[var6++] = 1;
                            }
                            continue;
                        }
                        if (var366 == 2703) {
                            var6--;
                            class232 var73 = class175.method1115(-22192, class16.field381[var6]);
                            if (var73.field4239 == null) {
                                class16.field381[var6++] = 0;
                                continue;
                            }
                            int var74 = var73.field4239.length;
                            for (int var75 = 0; var75 < var73.field4239.length; var75++) {
                                if (var73.field4239[var75] == null) {
                                    var74 = var75;
                                    break;
                                }
                            }
                            class16.field381[var6++] = var74;
                            continue;
                        }
                        if (var366 == 2704 || var366 == 2705) {
                            var6 -= 2;
                            int var76 = class16.field381[var6 + 1];
                            int var77 = class16.field381[var6];
                            class147 var78 = (class147) class227.field3961.method1538((long) var77, (byte) 127);
                            if (var78 != null && var78.field2631 == var76) {
                                class16.field381[var6++] = 1;
                                continue;
                            }
                            class16.field381[var6++] = 0;
                            continue;
                        }
                    } else if (var366 < 2900) {
                        var6--;
                        class232 var79 = class175.method1115(-22192, class16.field381[var6]);
                        if (var366 == 2800) {
                            class16.field381[var6++] = class122.method739(class174.method1110(true, var79), 258072555);
                            continue;
                        }
                        if (var366 == 2801) {
                            var6--;
                            int var80 = class16.field381[var6];
                            int var368 = var80 - 1;
                            if (var79.field4278 != null && var368 < var79.field4278.length && var79.field4278[var368] != null) {
                                class222.field3848[var7++] = var79.field4278[var368];
                                continue;
                            }
                            class222.field3848[var7++] = class45.field928;
                            continue;
                        }
                        if (var366 == 2802) {
                            if (var79.field4181 == null) {
                                class222.field3848[var7++] = class45.field928;
                            } else {
                                class222.field3848[var7++] = var79.field4181;
                            }
                            continue;
                        }
                    } else if (var366 < 3200) {
                        if (var366 == 3100) {
                            var7--;
                            class151 var322 = class222.field3848[var7];
                            client.method246(0, (byte) -127, class45.field928, var322);
                            continue;
                        }
                        if (var366 == 3101) {
                            var6 -= 2;
                            class149.method946((byte) -96, class16.field381[var6 + 1], class228.field3975, class16.field381[var6]);
                            continue;
                        }
                        if (var366 == 3103) {
                            class178.method1130(-116);
                            continue;
                        }
                        if (var366 == 3104) {
                            var7--;
                            class151 var323 = class222.field3848[var7];
                            int var324 = 0;
                            class134.field2448++;
                            if (var323.method977(-30333)) {
                                var324 = var323.method960(127);
                            }
                            class48.field984.method650(-13721, 104);
                            class48.field984.method1461(var324, (byte) 99);
                            continue;
                        }
                        if (var366 == 3105) {
                            class72.field1399++;
                            var7--;
                            class151 var325 = class222.field3848[var7];
                            class48.field984.method650(-13721, 179);
                            class48.field984.method1458((byte) 115, var325.method981(false));
                            continue;
                        }
                        if (var366 == 3106) {
                            class81.field1557++;
                            var7--;
                            class151 var326 = class222.field3848[var7];
                            class48.field984.method650(-13721, 88);
                            class48.field984.method1447(-1, var326.method988(-1) + 1);
                            class48.field984.method1479(var326, 165744536);
                            continue;
                        }
                        if (var366 == 3107) {
                            var6--;
                            int var327 = class16.field381[var6];
                            var7--;
                            class151 var328 = class222.field3848[var7];
                            class111.method668(var328, var327, (byte) 62);
                            continue;
                        }
                        if (var366 == 3108) {
                            var6 -= 3;
                            int var329 = class16.field381[var6];
                            int var330 = class16.field381[var6 + 1];
                            int var331 = class16.field381[var6 + 2];
                            class232 var332 = class175.method1115(-22192, var331);
                            class194.method1218(var329, var332, var330, 2048);
                            continue;
                        }
                        if (var366 == 3109) {
                            var6 -= 2;
                            int var333 = class16.field381[var6 + 1];
                            class232 var334 = var45 ? class99.field1786 : class16.field388;
                            int var335 = class16.field381[var6];
                            class194.method1218(var335, var334, var333, 2048);
                            continue;
                        }
                        if (var366 == 3110) {
                            class63.field1236++;
                            var6--;
                            int var336 = class16.field381[var6];
                            class48.field984.method650(-13721, 180);
                            class48.field984.method1463(-111, var336);
                            continue;
                        }
                    } else if (var366 < 3300) {
                        if (var366 == 3200) {
                            var6 -= 3;
                            class211.method1323(24597, class16.field381[var6], class16.field381[var6 + 1], class16.field381[var6 + 2]);
                            continue;
                        }
                        if (var366 == 3201) {
                            var6--;
                            class134.method822(class16.field381[var6], 0);
                            continue;
                        }
                        if (var366 == 3202) {
                            var6 -= 2;
                            class15.method129((byte) -100, class16.field381[var6], class16.field381[var6 + 1]);
                            continue;
                        }
                    } else if (var366 < 3400) {
                        if (var366 == 3300) {
                            class16.field381[var6++] = class200.field3541;
                            continue;
                        }
                        if (var366 == 3301) {
                            var6 -= 2;
                            int var81 = class16.field381[var6];
                            int var82 = class16.field381[var6 + 1];
                            class16.field381[var6++] = class22.method187(var82, var81, true);
                            continue;
                        }
                        if (var366 == 3302) {
                            var6 -= 2;
                            int var83 = class16.field381[var6 + 1];
                            int var84 = class16.field381[var6];
                            class16.field381[var6++] = class195.method1222(74, var84, var83);
                            continue;
                        }
                        if (var366 == 3303) {
                            var6 -= 2;
                            int var85 = class16.field381[var6];
                            int var86 = class16.field381[var6 + 1];
                            class16.field381[var6++] = class28.method211((byte) -23, var85, var86);
                            continue;
                        }
                        if (var366 == 3304) {
                            var6--;
                            int var87 = class16.field381[var6];
                            class16.field381[var6++] = class175.method1119(var87, (byte) -93).field3179;
                            continue;
                        }
                        if (var366 == 3305) {
                            var6--;
                            int var88 = class16.field381[var6];
                            class16.field381[var6++] = class137.field2501[var88];
                            continue;
                        }
                        if (var366 == 3306) {
                            var6--;
                            int var89 = class16.field381[var6];
                            class16.field381[var6++] = class130.field2388[var89];
                            continue;
                        }
                        if (var366 == 3307) {
                            var6--;
                            int var90 = class16.field381[var6];
                            class16.field381[var6++] = class40.field814[var90];
                            continue;
                        }
                        if (var366 == 3308) {
                            int var91 = class234.field4325;
                            int var92 = (class228.field3975.field3976 >> 7) + class232.field4188;
                            int var93 = (class228.field3975.field4029 >> 7) + class64.field1255;
                            class16.field381[var6++] = (var92 << 14) + (var91 << 28) + var93;
                            continue;
                        }
                        if (var366 == 3309) {
                            var6--;
                            int var94 = class16.field381[var6];
                            class16.field381[var6++] = class26.method206(268430455, var94) >> 14;
                            continue;
                        }
                        if (var366 == 3310) {
                            var6--;
                            int var95 = class16.field381[var6];
                            class16.field381[var6++] = var95 >> 28;
                            continue;
                        }
                        if (var366 == 3311) {
                            var6--;
                            int var96 = class16.field381[var6];
                            class16.field381[var6++] = class26.method206(16383, var96);
                            continue;
                        }
                        if (var366 == 3312) {
                            class16.field381[var6++] = class15.field347 ? 1 : 0;
                            continue;
                        }
                        if (var366 == 3313) {
                            var6 -= 2;
                            int var97 = class16.field381[var6 + 1];
                            int var98 = class16.field381[var6] + 32768;
                            class16.field381[var6++] = class22.method187(var97, var98, true);
                            continue;
                        }
                        if (var366 == 3314) {
                            var6 -= 2;
                            int var99 = class16.field381[var6] + 32768;
                            int var100 = class16.field381[var6 + 1];
                            class16.field381[var6++] = class195.method1222(117, var99, var100);
                            continue;
                        }
                        if (var366 == 3315) {
                            var6 -= 2;
                            int var101 = class16.field381[var6 + 1];
                            int var102 = class16.field381[var6] + 32768;
                            class16.field381[var6++] = class28.method211((byte) -23, var102, var101);
                            continue;
                        }
                        if (var366 == 3316) {
                            if (class150.field2683 < 2) {
                                class16.field381[var6++] = 0;
                            } else {
                                class16.field381[var6++] = class150.field2683;
                            }
                            continue;
                        }
                        if (var366 == 3317) {
                            class16.field381[var6++] = class55.field1123;
                            continue;
                        }
                        if (var366 == 3318) {
                            class16.field381[var6++] = class13.field296;
                            continue;
                        }
                        if (var366 == 3321) {
                            class16.field381[var6++] = class37.field778;
                            continue;
                        }
                        if (var366 == 3322) {
                            class16.field381[var6++] = class51.field1026;
                            continue;
                        }
                        if (var366 == 3323) {
                            if (class228.field4005 >= 5 && class228.field4005 <= 9) {
                                class16.field381[var6++] = 1;
                                continue;
                            }
                            class16.field381[var6++] = 0;
                            continue;
                        }
                        if (var366 == 3324) {
                            if (class228.field4005 >= 5 && class228.field4005 <= 9) {
                                class16.field381[var6++] = class228.field4005;
                                continue;
                            }
                            class16.field381[var6++] = 0;
                            continue;
                        }
                        if (var366 == 3325) {
                            if (class64.field1246 > 0) {
                                class16.field381[var6++] = 1;
                            } else {
                                class16.field381[var6++] = 0;
                            }
                            continue;
                        }
                        if (var366 == 3326) {
                            class16.field381[var6++] = class228.field3975.field435;
                            continue;
                        }
                        if (var366 == 3327) {
                            class16.field381[var6++] = class228.field3975.field439.field896 ? 1 : 0;
                            continue;
                        }
                    } else if (var366 < 3500) {
                        if (var366 == 3400) {
                            var6 -= 2;
                            int var314 = class16.field381[var6];
                            int var315 = class16.field381[var6 + 1];
                            class55 var316 = class33.method241(var314, (byte) -33);
                            class222.field3848[var7++] = var316.method376((byte) 126, var315);
                            continue;
                        }
                        if (var366 == 3408) {
                            var6 -= 4;
                            int var317 = class16.field381[var6];
                            int var318 = class16.field381[var6 + 3];
                            int var319 = class16.field381[var6 + 2];
                            int var320 = class16.field381[var6 + 1];
                            class55 var321 = class33.method241(var319, (byte) -74);
                            if (var321.field1117 == var317 && var321.field1111 == var320) {
                                if (var320 == 115) {
                                    class222.field3848[var7++] = var321.method376((byte) 126, var318);
                                } else {
                                    class16.field381[var6++] = var321.method381(false, var318);
                                }
                                continue;
                            }
                            if (var320 == 115) {
                                class222.field3848[var7++] = class55.field1107;
                            } else {
                                class16.field381[var6++] = 0;
                            }
                            continue;
                        }
                    } else if (var366 < 3700) {
                        if (var366 == 3600) {
                            if (class195.field3473 == 0) {
                                class16.field381[var6++] = -2;
                            } else if (class195.field3473 == 1) {
                                class16.field381[var6++] = -1;
                            } else {
                                class16.field381[var6++] = class36.field758;
                            }
                            continue;
                        }
                        if (var366 == 3601) {
                            var6--;
                            int var103 = class16.field381[var6];
                            if (class195.field3473 == 2 && class36.field758 > var103) {
                                class222.field3848[var7++] = class146.field2616[var103];
                                continue;
                            }
                            class222.field3848[var7++] = class45.field928;
                            continue;
                        }
                        if (var366 == 3602) {
                            var6--;
                            int var104 = class16.field381[var6];
                            if (class195.field3473 == 2 && var104 < class36.field758) {
                                class16.field381[var6++] = class9.field138[var104];
                                continue;
                            }
                            class16.field381[var6++] = 0;
                            continue;
                        }
                        if (var366 == 3603) {
                            var6--;
                            int var105 = class16.field381[var6];
                            if (class195.field3473 == 2 && class36.field758 > var105) {
                                class16.field381[var6++] = class50.field1014[var105];
                                continue;
                            }
                            class16.field381[var6++] = 0;
                            continue;
                        }
                        if (var366 == 3604) {
                            var7--;
                            class151 var106 = class222.field3848[var7];
                            var6--;
                            int var107 = class16.field381[var6];
                            class110.method662(var107, false, var106);
                            continue;
                        }
                        if (var366 == 3605) {
                            var7--;
                            class151 var108 = class222.field3848[var7];
                            class54.method372(0, var108.method981(false));
                            continue;
                        }
                        if (var366 == 3606) {
                            var7--;
                            class151 var109 = class222.field3848[var7];
                            class218.method1353(var109.method981(false), 0);
                            continue;
                        }
                        if (var366 == 3607) {
                            var7--;
                            class151 var110 = class222.field3848[var7];
                            class146.method926(var110.method981(false), -67);
                            continue;
                        }
                        if (var366 == 3608) {
                            var7--;
                            class151 var111 = class222.field3848[var7];
                            class170.method1095(var111.method981(false), 89);
                            continue;
                        }
                        if (var366 == 3609) {
                            var7--;
                            class151 var112 = class222.field3848[var7];
                            if (var112.method978(class203.field3607, (byte) 80) || var112.method978(class59.field1173, (byte) 80)) {
                                var112 = var112.method989(7, (byte) -62);
                            }
                            class16.field381[var6++] = class108.method653(var112, 1) ? 1 : 0;
                            continue;
                        }
                        if (var366 == 3610) {
                            var6--;
                            int var113 = class16.field381[var6];
                            if (class195.field3473 == 2 && var113 < class36.field758) {
                                class222.field3848[var7++] = class57.field1147[var113];
                                continue;
                            }
                            class222.field3848[var7++] = class45.field928;
                            continue;
                        }
                        if (var366 == 3611) {
                            if (class191.field3370 == null) {
                                class222.field3848[var7++] = class45.field928;
                            } else {
                                class222.field3848[var7++] = class191.field3370.method994(-108);
                            }
                            continue;
                        }
                        if (var366 == 3612) {
                            if (class191.field3370 == null) {
                                class16.field381[var6++] = 0;
                            } else {
                                class16.field381[var6++] = class64.field1253;
                            }
                            continue;
                        }
                        if (var366 == 3613) {
                            var6--;
                            int var114 = class16.field381[var6];
                            if (class191.field3370 != null && var114 < class64.field1253) {
                                class222.field3848[var7++] = class28.field585[var114].field1660.method994(-103);
                                continue;
                            }
                            class222.field3848[var7++] = class45.field928;
                            continue;
                        }
                        if (var366 == 3614) {
                            var6--;
                            int var115 = class16.field381[var6];
                            if (class191.field3370 != null && class64.field1253 > var115) {
                                class16.field381[var6++] = class28.field585[var115].field1663;
                                continue;
                            }
                            class16.field381[var6++] = 0;
                            continue;
                        }
                        if (var366 == 3615) {
                            var6--;
                            int var116 = class16.field381[var6];
                            if (class191.field3370 != null && var116 < class64.field1253) {
                                class16.field381[var6++] = class28.field585[var116].field1662;
                                continue;
                            }
                            class16.field381[var6++] = 0;
                            continue;
                        }
                        if (var366 == 3616) {
                            class16.field381[var6++] = class91.field1673;
                            continue;
                        }
                        if (var366 == 3617) {
                            var7--;
                            class151 var117 = class222.field3848[var7];
                            class223.method1397(var117, 101);
                            continue;
                        }
                        if (var366 == 3618) {
                            class16.field381[var6++] = class33.field675;
                            continue;
                        }
                        if (var366 == 3619) {
                            var7--;
                            class151 var118 = class222.field3848[var7];
                            class128.method776(var118.method981(false), (byte) 53);
                            continue;
                        }
                        if (var366 == 3620) {
                            class204.method1293((byte) 65);
                            continue;
                        }
                        if (var366 == 3621) {
                            if (class195.field3473 == 0) {
                                class16.field381[var6++] = -1;
                            } else {
                                class16.field381[var6++] = class32.field658;
                            }
                            continue;
                        }
                        if (var366 == 3622) {
                            var6--;
                            int var119 = class16.field381[var6];
                            if (class195.field3473 != 0 && class32.field658 > var119) {
                                class222.field3848[var7++] = class155.method1016(0, class224.field3909[var119]).method994(-95);
                                continue;
                            }
                            class222.field3848[var7++] = class45.field928;
                            continue;
                        }
                        if (var366 == 3623) {
                            var7--;
                            class151 var120 = class222.field3848[var7];
                            if (var120.method978(class203.field3607, (byte) 80) || var120.method978(class59.field1173, (byte) 80)) {
                                var120 = var120.method989(7, (byte) -62);
                            }
                            class16.field381[var6++] = class152.method1004(var120, 25252) ? 1 : 0;
                            continue;
                        }
                        if (var366 == 3624) {
                            var6--;
                            int var121 = class16.field381[var6];
                            if (class28.field585 != null && class64.field1253 > var121 && class28.field585[var121].field1660.method995((byte) -22, class228.field3975.field416)) {
                                class16.field381[var6++] = 1;
                                continue;
                            }
                            class16.field381[var6++] = 0;
                            continue;
                        }
                        if (var366 == 3625) {
                            if (class55.field1122 == null) {
                                class222.field3848[var7++] = class45.field928;
                            } else {
                                class222.field3848[var7++] = class55.field1122.method994(-124);
                            }
                            continue;
                        }
                        if (var366 == 3626) {
                            var6--;
                            int var122 = class16.field381[var6];
                            if (class191.field3370 != null && class64.field1253 > var122) {
                                class222.field3848[var7++] = class28.field585[var122].field1666;
                                continue;
                            }
                            class222.field3848[var7++] = class45.field928;
                            continue;
                        }
                    } else if (var366 < 4000) {
                        if (var366 == 3903) {
                            var6--;
                            int var123 = class16.field381[var6];
                            class16.field381[var6++] = class126.field2263[var123].method178(-121);
                            continue;
                        }
                        if (var366 == 3904) {
                            var6--;
                            int var124 = class16.field381[var6];
                            class16.field381[var6++] = class126.field2263[var124].field464;
                            continue;
                        }
                        if (var366 == 3905) {
                            var6--;
                            int var125 = class16.field381[var6];
                            class16.field381[var6++] = class126.field2263[var125].field457;
                            continue;
                        }
                        if (var366 == 3906) {
                            var6--;
                            int var126 = class16.field381[var6];
                            class16.field381[var6++] = class126.field2263[var126].field468;
                            continue;
                        }
                        if (var366 == 3907) {
                            var6--;
                            int var127 = class16.field381[var6];
                            class16.field381[var6++] = class126.field2263[var127].field463;
                            continue;
                        }
                        if (var366 == 3908) {
                            var6--;
                            int var128 = class16.field381[var6];
                            class16.field381[var6++] = class126.field2263[var128].field455;
                            continue;
                        }
                        if (var366 == 3910) {
                            var6--;
                            int var129 = class16.field381[var6];
                            int var130 = class126.field2263[var129].method183(104);
                            class16.field381[var6++] = var130 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var366 == 3911) {
                            var6--;
                            int var131 = class16.field381[var6];
                            int var132 = class126.field2263[var131].method183(124);
                            class16.field381[var6++] = var132 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var366 == 3912) {
                            var6--;
                            int var133 = class16.field381[var6];
                            int var134 = class126.field2263[var133].method183(42);
                            class16.field381[var6++] = var134 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var366 == 3913) {
                            var6--;
                            int var135 = class16.field381[var6];
                            int var136 = class126.field2263[var135].method183(96);
                            class16.field381[var6++] = var136 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var366 < 4100) {
                        if (var366 == 4000) {
                            var6 -= 2;
                            int var137 = class16.field381[var6];
                            int var138 = class16.field381[var6 + 1];
                            class16.field381[var6++] = var137 + var138;
                            continue;
                        }
                        if (var366 == 4001) {
                            var6 -= 2;
                            int var139 = class16.field381[var6 + 1];
                            int var140 = class16.field381[var6];
                            class16.field381[var6++] = var140 - var139;
                            continue;
                        }
                        if (var366 == 4002) {
                            var6 -= 2;
                            int var141 = class16.field381[var6 + 1];
                            int var142 = class16.field381[var6];
                            class16.field381[var6++] = var141 * var142;
                            continue;
                        }
                        if (var366 == 4003) {
                            var6 -= 2;
                            int var143 = class16.field381[var6];
                            int var144 = class16.field381[var6 + 1];
                            class16.field381[var6++] = var143 / var144;
                            continue;
                        }
                        if (var366 == 4004) {
                            var6--;
                            int var145 = class16.field381[var6];
                            class16.field381[var6++] = (int) (Math.random() * (double) var145);
                            continue;
                        }
                        if (var366 == 4005) {
                            var6--;
                            int var146 = class16.field381[var6];
                            class16.field381[var6++] = (int) (Math.random() * (double) (var146 + 1));
                            continue;
                        }
                        if (var366 == 4006) {
                            var6 -= 5;
                            int var147 = class16.field381[var6];
                            int var148 = class16.field381[var6 + 1];
                            int var149 = class16.field381[var6 + 3];
                            int var150 = class16.field381[var6 + 2];
                            int var151 = class16.field381[var6 + 4];
                            class16.field381[var6++] = (var151 - var150) * (-var147 + var148) / (var149 - var150) + var147;
                            continue;
                        }
                        if (var366 == 4007) {
                            var6 -= 2;
                            long var152 = (long) class16.field381[var6];
                            long var154 = (long) class16.field381[var6 + 1];
                            class16.field381[var6++] = (int) (var152 * var154 / 100L + var152);
                            continue;
                        }
                        if (var366 == 4008) {
                            var6 -= 2;
                            int var156 = class16.field381[var6];
                            int var157 = class16.field381[var6 + 1];
                            class16.field381[var6++] = class73.method479(0x1 << var157, var156);
                            continue;
                        }
                        if (var366 == 4009) {
                            var6 -= 2;
                            int var158 = class16.field381[var6];
                            int var159 = class16.field381[var6 + 1];
                            class16.field381[var6++] = class26.method206(var158, -(0x1 << var159) - 1);
                            continue;
                        }
                        if (var366 == 4010) {
                            var6 -= 2;
                            int var160 = class16.field381[var6 + 1];
                            int var161 = class16.field381[var6];
                            class16.field381[var6++] = class26.method206(var161, 0x1 << var160) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var366 == 4011) {
                            var6 -= 2;
                            int var162 = class16.field381[var6];
                            int var163 = class16.field381[var6 + 1];
                            class16.field381[var6++] = var162 % var163;
                            continue;
                        }
                        if (var366 == 4012) {
                            var6 -= 2;
                            int var164 = class16.field381[var6];
                            int var165 = class16.field381[var6 + 1];
                            if (var164 == 0) {
                                class16.field381[var6++] = 0;
                            } else {
                                class16.field381[var6++] = (int) Math.pow((double) var164, (double) var165);
                            }
                            continue;
                        }
                        if (var366 == 4013) {
                            var6 -= 2;
                            int var166 = class16.field381[var6];
                            int var167 = class16.field381[var6 + 1];
                            if (var166 == 0) {
                                class16.field381[var6++] = 0;
                            } else if (var167 == 0) {
                                class16.field381[var6++] = Integer.MAX_VALUE;
                            } else {
                                class16.field381[var6++] = (int) Math.pow((double) var166, 1.0D / (double) var167);
                            }
                            continue;
                        }
                        if (var366 == 4014) {
                            var6 -= 2;
                            int var168 = class16.field381[var6 + 1];
                            int var169 = class16.field381[var6];
                            class16.field381[var6++] = class26.method206(var168, var169);
                            continue;
                        }
                        if (var366 == 4015) {
                            var6 -= 2;
                            int var170 = class16.field381[var6];
                            int var171 = class16.field381[var6 + 1];
                            class16.field381[var6++] = class73.method479(var170, var171);
                            continue;
                        }
                        if (var366 == 4016) {
                            var6 -= 2;
                            int var172 = class16.field381[var6];
                            int var173 = class16.field381[var6 + 1];
                            class16.field381[var6++] = var173 > var172 ? var172 : var173;
                            continue;
                        }
                        if (var366 == 4017) {
                            var6 -= 2;
                            int var174 = class16.field381[var6];
                            int var175 = class16.field381[var6 + 1];
                            class16.field381[var6++] = var174 > var175 ? var174 : var175;
                            continue;
                        }
                        if (var366 == 4018) {
                            var6 -= 3;
                            long var176 = (long) class16.field381[var6 + 1];
                            long var178 = (long) class16.field381[var6 + 2];
                            long var180 = (long) class16.field381[var6];
                            class16.field381[var6++] = (int) (var178 * var180 / var176);
                            continue;
                        }
                    } else if (var366 < 4200) {
                        if (var366 == 4100) {
                            var7--;
                            class151 var182 = class222.field3848[var7];
                            var6--;
                            int var183 = class16.field381[var6];
                            class222.field3848[var7++] = class126.method761(new class151[] { var182, class137.method874(var183, false) }, 10260);
                            continue;
                        }
                        if (var366 == 4101) {
                            var7 -= 2;
                            class151 var184 = class222.field3848[var7 + 1];
                            class151 var185 = class222.field3848[var7];
                            class222.field3848[var7++] = class126.method761(new class151[] { var185, var184 }, 10260);
                            continue;
                        }
                        if (var366 == 4102) {
                            var7--;
                            class151 var186 = class222.field3848[var7];
                            var6--;
                            int var187 = class16.field381[var6];
                            class222.field3848[var7++] = class126.method761(new class151[] { var186, class126.method759(-1304, true, var187) }, 10260);
                            continue;
                        }
                        if (var366 == 4103) {
                            var7--;
                            class151 var188 = class222.field3848[var7];
                            class222.field3848[var7++] = var188.method993((byte) -122);
                            continue;
                        }
                        if (var366 == 4104) {
                            var6--;
                            int var189 = class16.field381[var6];
                            long var190 = (long) var189 * 86400000L + 1014768000000L;
                            class78.field1516.setTime(new Date(var190));
                            int var192 = class78.field1516.get(5);
                            int var193 = class78.field1516.get(2);
                            int var194 = class78.field1516.get(1);
                            class222.field3848[var7++] = class126.method761(new class151[] { class137.method874(var192, false), class2.field69, class137.field2489[var193], class2.field69, class137.method874(var194, false) }, 10260);
                            continue;
                        }
                        if (var366 == 4105) {
                            var7 -= 2;
                            class151 var195 = class222.field3848[var7];
                            class151 var196 = class222.field3848[var7 + 1];
                            if (class228.field3975.field439 != null && class228.field3975.field439.field896) {
                                class222.field3848[var7++] = var196;
                                continue;
                            }
                            class222.field3848[var7++] = var195;
                            continue;
                        }
                        if (var366 == 4106) {
                            var6--;
                            int var197 = class16.field381[var6];
                            class222.field3848[var7++] = class137.method874(var197, false);
                            continue;
                        }
                        if (var366 == 4107) {
                            var7 -= 2;
                            class16.field381[var6++] = class222.field3848[var7].method996(69, class222.field3848[var7 + 1]);
                            continue;
                        }
                        if (var366 == 4108) {
                            var6 -= 2;
                            int var198 = class16.field381[var6];
                            var7--;
                            class151 var199 = class222.field3848[var7];
                            int var200 = class16.field381[var6 + 1];
                            byte[] var201 = class36.field755.method1208(0, (byte) -92, var200);
                            class105 var202 = new class105(var201);
                            var202.method1271(class160.field2882, null);
                            class16.field381[var6++] = var202.method1274(var199, var198);
                            continue;
                        }
                        if (var366 == 4109) {
                            var6 -= 2;
                            var7--;
                            class151 var203 = class222.field3848[var7];
                            int var204 = class16.field381[var6 + 1];
                            int var205 = class16.field381[var6];
                            byte[] var206 = class36.field755.method1208(0, (byte) 96, var204);
                            class105 var207 = new class105(var206);
                            var207.method1271(class160.field2882, null);
                            class16.field381[var6++] = var207.method1258(var203, var205);
                            continue;
                        }
                        if (var366 == 4110) {
                            var7 -= 2;
                            class151 var208 = class222.field3848[var7];
                            class151 var209 = class222.field3848[var7 + 1];
                            var6--;
                            if (class16.field381[var6] == 1) {
                                class222.field3848[var7++] = var208;
                            } else {
                                class222.field3848[var7++] = var209;
                            }
                            continue;
                        }
                        if (var366 == 4111) {
                            var7--;
                            class151 var210 = class222.field3848[var7];
                            class222.field3848[var7++] = class201.method1278(var210);
                            continue;
                        }
                        if (var366 == 4112) {
                            var7--;
                            class151 var211 = class222.field3848[var7];
                            var6--;
                            int var212 = class16.field381[var6];
                            if (var212 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class222.field3848[var7++] = var211.method968(var212, 0);
                            continue;
                        }
                        if (var366 == 4113) {
                            var6--;
                            int var213 = class16.field381[var6];
                            class16.field381[var6++] = class67.method452(var213, (byte) 120) ? 1 : 0;
                            continue;
                        }
                        if (var366 == 4114) {
                            var6--;
                            int var214 = class16.field381[var6];
                            class16.field381[var6++] = class211.method1315(var214, 17346) ? 1 : 0;
                            continue;
                        }
                        if (var366 == 4115) {
                            var6--;
                            int var215 = class16.field381[var6];
                            class16.field381[var6++] = class78.method506(false, var215) ? 1 : 0;
                            continue;
                        }
                        if (var366 == 4116) {
                            var6--;
                            int var216 = class16.field381[var6];
                            class16.field381[var6++] = class48.method346(var216, false) ? 1 : 0;
                            continue;
                        }
                        if (var366 == 4117) {
                            var7--;
                            class151 var217 = class222.field3848[var7];
                            if (var217 == null) {
                                class16.field381[var6++] = 0;
                            } else {
                                class16.field381[var6++] = var217.method988(-1);
                            }
                            continue;
                        }
                        if (var366 == 4118) {
                            var6 -= 2;
                            int var218 = class16.field381[var6];
                            int var219 = class16.field381[var6 + 1];
                            var7--;
                            class151 var220 = class222.field3848[var7];
                            class222.field3848[var7++] = var220.method987((byte) 122, var219, var218);
                            continue;
                        }
                        if (var366 == 4119) {
                            var7--;
                            class151 var221 = class222.field3848[var7];
                            class151 var222 = class196.method1228(var221.method988(-1), -70);
                            boolean var223 = false;
                            for (int var224 = 0; var221.method988(-1) > var224; var224++) {
                                int var225 = var221.method979(var224, (byte) -125);
                                if (var225 == 60) {
                                    var223 = true;
                                } else if (var225 == 62) {
                                    var223 = false;
                                } else if (!var223) {
                                    var222.method974(-2171, var225);
                                }
                            }
                            var222.method975(-63);
                            class222.field3848[var7++] = var222;
                            continue;
                        }
                        if (var366 == 4120) {
                            var6 -= 2;
                            int var226 = class16.field381[var6];
                            var7--;
                            class151 var227 = class222.field3848[var7];
                            int var228 = class16.field381[var6 + 1];
                            class16.field381[var6++] = var227.method952((byte) 12, var226, var228);
                            continue;
                        }
                        if (var366 == 4121) {
                            var7 -= 2;
                            class151 var229 = class222.field3848[var7];
                            var6--;
                            int var230 = class16.field381[var6];
                            class151 var231 = class222.field3848[var7 + 1];
                            class16.field381[var6++] = var229.method959(var230, -1, var231);
                            continue;
                        }
                        if (var366 == 4122) {
                            var6--;
                            int var232 = class16.field381[var6];
                            class16.field381[var6++] = class73.method478(156, var232);
                            continue;
                        }
                        if (var366 == 4123) {
                            var6--;
                            int var233 = class16.field381[var6];
                            class16.field381[var6++] = class148.method940(false, var233);
                            continue;
                        }
                    } else if (var366 < 4300) {
                        if (var366 == 4200) {
                            var6--;
                            int var298 = class16.field381[var6];
                            class222.field3848[var7++] = class43.method311(var298, 0).field241;
                            continue;
                        }
                        if (var366 == 4201) {
                            var6 -= 2;
                            int var299 = class16.field381[var6];
                            int var300 = class16.field381[var6 + 1];
                            class12 var301 = class43.method311(var299, 0);
                            if (var300 >= 1 && var300 <= 5 && var301.field269[var300 - 1] != null) {
                                class222.field3848[var7++] = var301.field269[var300 - 1];
                                continue;
                            }
                            class222.field3848[var7++] = class45.field928;
                            continue;
                        }
                        if (var366 == 4202) {
                            var6 -= 2;
                            int var302 = class16.field381[var6];
                            int var303 = class16.field381[var6 + 1];
                            class12 var304 = class43.method311(var302, 0);
                            if (var303 >= 1 && var303 <= 5 && var304.field243[var303 - 1] != null) {
                                class222.field3848[var7++] = var304.field243[var303 - 1];
                                continue;
                            }
                            class222.field3848[var7++] = class45.field928;
                            continue;
                        }
                        if (var366 == 4203) {
                            var6--;
                            int var305 = class16.field381[var6];
                            class16.field381[var6++] = class43.method311(var305, 0).field221;
                            continue;
                        }
                        if (var366 == 4204) {
                            var6--;
                            int var306 = class16.field381[var6];
                            class16.field381[var6++] = class43.method311(var306, 0).field266 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var366 == 4205) {
                            var6--;
                            int var307 = class16.field381[var6];
                            class12 var308 = class43.method311(var307, 0);
                            if (var308.field237 == -1 && var308.field226 >= 0) {
                                class16.field381[var6++] = var308.field226;
                                continue;
                            }
                            class16.field381[var6++] = var307;
                            continue;
                        }
                        if (var366 == 4206) {
                            var6--;
                            int var309 = class16.field381[var6];
                            class12 var310 = class43.method311(var309, 0);
                            if (var310.field237 >= 0 && var310.field226 >= 0) {
                                class16.field381[var6++] = var310.field226;
                                continue;
                            }
                            class16.field381[var6++] = var309;
                            continue;
                        }
                        if (var366 == 4207) {
                            var6--;
                            int var311 = class16.field381[var6];
                            class16.field381[var6++] = class43.method311(var311, 0).field253 ? 1 : 0;
                            continue;
                        }
                        if (var366 == 4210) {
                            var6--;
                            int var312 = class16.field381[var6];
                            var7--;
                            class151 var313 = class222.field3848[var7];
                            class139.method901(var312 == 1, false, var313);
                            class16.field381[var6++] = class226.field3933;
                            continue;
                        }
                        if (var366 == 4211) {
                            if (client.field695 != null && class64.field1256 < class226.field3933) {
                                class16.field381[var6++] = class26.method206(65535, client.field695[class64.field1256++]);
                                continue;
                            }
                            class16.field381[var6++] = -1;
                            continue;
                        }
                        if (var366 == 4212) {
                            class64.field1256 = 0;
                            continue;
                        }
                    } else if (var366 < 5100) {
                        if (var366 == 5000) {
                            class16.field381[var6++] = class90.field1657;
                            continue;
                        }
                        if (var366 == 5001) {
                            var6 -= 3;
                            class5.field100++;
                            class90.field1657 = class16.field381[var6];
                            class206.field3652 = class16.field381[var6 + 1];
                            class118.field2130 = class16.field381[var6 + 2];
                            class48.field984.method650(-13721, 44);
                            class48.field984.method1447(-1, class90.field1657);
                            class48.field984.method1447(-1, class206.field3652);
                            class48.field984.method1447(-1, class118.field2130);
                            continue;
                        }
                        if (var366 == 5002) {
                            class168.field3049++;
                            var6 -= 2;
                            var7--;
                            class151 var237 = class222.field3848[var7];
                            int var238 = class16.field381[var6];
                            int var239 = class16.field381[var6 + 1];
                            class48.field984.method650(-13721, 135);
                            class48.field984.method1458((byte) 106, var237.method981(false));
                            class48.field984.method1447(-1, var238 - 1);
                            class48.field984.method1447(-1, var239);
                            continue;
                        }
                        if (var366 == 5003) {
                            var6--;
                            int var240 = class16.field381[var6];
                            class151 var241 = null;
                            if (var240 < 100) {
                                var241 = class31.field644[var240];
                            }
                            if (var241 == null) {
                                var241 = class45.field928;
                            }
                            class222.field3848[var7++] = var241;
                            continue;
                        }
                        if (var366 == 5004) {
                            var6--;
                            int var242 = class16.field381[var6];
                            int var243 = -1;
                            if (var242 < 100 && class31.field644[var242] != null) {
                                var243 = class50.field1003[var242];
                            }
                            class16.field381[var6++] = var243;
                            continue;
                        }
                        if (var366 == 5005) {
                            class16.field381[var6++] = class206.field3652;
                            continue;
                        }
                        if (var366 == 5008) {
                            var7--;
                            class151 var244 = class222.field3848[var7];
                            if (var244.method978(class153.field2776, (byte) 80)) {
                                class93.method590((byte) 88, var244);
                            } else {
                                class151 var245 = var244.method993((byte) -105);
                                byte var246 = 0;
                                if (var245.method978(class14.field322, (byte) 80)) {
                                    var246 = 0;
                                    var244 = var244.method989(class14.field322.method988(-1), (byte) -62);
                                } else if (var245.method978(class116.field2083, (byte) 80)) {
                                    var246 = 1;
                                    var244 = var244.method989(class116.field2083.method988(-1), (byte) -62);
                                } else if (var245.method978(class196.field3505, (byte) 80)) {
                                    var244 = var244.method989(class196.field3505.method988(-1), (byte) -62);
                                    var246 = 2;
                                } else if (var245.method978(class162.field2926, (byte) 80)) {
                                    var246 = 3;
                                    var244 = var244.method989(class162.field2926.method988(-1), (byte) -62);
                                } else if (var245.method978(class161.field2917, (byte) 80)) {
                                    var246 = 4;
                                    var244 = var244.method989(class161.field2917.method988(-1), (byte) -62);
                                } else if (var245.method978(class159.field2861, (byte) 80)) {
                                    var246 = 5;
                                    var244 = var244.method989(class159.field2861.method988(-1), (byte) -62);
                                } else if (var245.method978(field4121, (byte) 80)) {
                                    var244 = var244.method989(field4121.method988(-1), (byte) -62);
                                    var246 = 6;
                                } else if (var245.method978(class112.field1966, (byte) 80)) {
                                    var246 = 7;
                                    var244 = var244.method989(class112.field1966.method988(-1), (byte) -62);
                                } else if (var245.method978(class131.field2401, (byte) 80)) {
                                    var246 = 8;
                                    var244 = var244.method989(class131.field2401.method988(-1), (byte) -62);
                                } else if (var245.method978(class162.field2921, (byte) 80)) {
                                    var246 = 9;
                                    var244 = var244.method989(class162.field2921.method988(-1), (byte) -62);
                                } else if (var245.method978(class204.field3620, (byte) 80)) {
                                    var246 = 10;
                                    var244 = var244.method989(class204.field3620.method988(-1), (byte) -62);
                                } else if (var245.method978(class45.field934, (byte) 80)) {
                                    var246 = 11;
                                    var244 = var244.method989(class45.field934.method988(-1), (byte) -62);
                                } else if (class123.field2212 != 0) {
                                    if (var245.method978(class14.field329, (byte) 80)) {
                                        var244 = var244.method989(class14.field329.method988(-1), (byte) -62);
                                        var246 = 0;
                                    } else if (var245.method978(class116.field2087, (byte) 80)) {
                                        var246 = 1;
                                        var244 = var244.method989(class116.field2087.method988(-1), (byte) -62);
                                    } else if (var245.method978(class196.field3483, (byte) 80)) {
                                        var246 = 2;
                                        var244 = var244.method989(class196.field3483.method988(-1), (byte) -62);
                                    } else if (var245.method978(class162.field2930, (byte) 80)) {
                                        var246 = 3;
                                        var244 = var244.method989(class162.field2930.method988(-1), (byte) -62);
                                    } else if (var245.method978(class161.field2914, (byte) 80)) {
                                        var244 = var244.method989(class161.field2914.method988(-1), (byte) -62);
                                        var246 = 4;
                                    } else if (var245.method978(class159.field2860, (byte) 80)) {
                                        var246 = 5;
                                        var244 = var244.method989(class159.field2860.method988(-1), (byte) -62);
                                    } else if (var245.method978(field4120, (byte) 80)) {
                                        var244 = var244.method989(field4120.method988(-1), (byte) -62);
                                        var246 = 6;
                                    } else if (var245.method978(class112.field1975, (byte) 80)) {
                                        var244 = var244.method989(class112.field1975.method988(-1), (byte) -62);
                                        var246 = 7;
                                    } else if (var245.method978(class131.field2407, (byte) 80)) {
                                        var246 = 8;
                                        var244 = var244.method989(class131.field2407.method988(-1), (byte) -62);
                                    } else if (var245.method978(class162.field2929, (byte) 80)) {
                                        var244 = var244.method989(class162.field2929.method988(-1), (byte) -62);
                                        var246 = 9;
                                    } else if (var245.method978(class204.field3616, (byte) 80)) {
                                        var246 = 10;
                                        var244 = var244.method989(class204.field3616.method988(-1), (byte) -62);
                                    } else if (var245.method978(class45.field938, (byte) 80)) {
                                        var244 = var244.method989(class45.field938.method988(-1), (byte) -62);
                                        var246 = 11;
                                    }
                                }
                                class151 var247 = var244.method993((byte) -103);
                                class134.field2444++;
                                byte var248 = 0;
                                if (var247.method978(class117.field2101, (byte) 80)) {
                                    var244 = var244.method989(class117.field2101.method988(-1), (byte) -62);
                                    var248 = 1;
                                } else if (var247.method978(class163.field2945, (byte) 80)) {
                                    var248 = 2;
                                    var244 = var244.method989(class163.field2945.method988(-1), (byte) -62);
                                } else if (var247.method978(class176.field3190, (byte) 80)) {
                                    var248 = 3;
                                    var244 = var244.method989(class176.field3190.method988(-1), (byte) -62);
                                } else if (var247.method978(class89.field1627, (byte) 80)) {
                                    var244 = var244.method989(class89.field1627.method988(-1), (byte) -62);
                                    var248 = 4;
                                } else if (var247.method978(class178.field3212, (byte) 80)) {
                                    var248 = 5;
                                    var244 = var244.method989(class178.field3212.method988(-1), (byte) -62);
                                } else if (class123.field2212 != 0) {
                                    if (var247.method978(class117.field2104, (byte) 80)) {
                                        var248 = 1;
                                        var244 = var244.method989(class117.field2104.method988(-1), (byte) -62);
                                    } else if (var247.method978(class163.field2947, (byte) 80)) {
                                        var244 = var244.method989(class163.field2947.method988(-1), (byte) -62);
                                        var248 = 2;
                                    } else if (var247.method978(class176.field3184, (byte) 80)) {
                                        var248 = 3;
                                        var244 = var244.method989(class176.field3184.method988(-1), (byte) -62);
                                    } else if (var247.method978(class89.field1620, (byte) 80)) {
                                        var248 = 4;
                                        var244 = var244.method989(class89.field1620.method988(-1), (byte) -62);
                                    } else if (var247.method978(class178.field3214, (byte) 80)) {
                                        var244 = var244.method989(class178.field3214.method988(-1), (byte) -62);
                                        var248 = 5;
                                    }
                                }
                                class48.field984.method650(-13721, 69);
                                class48.field984.method1447(-1, 0);
                                int var249 = class48.field984.field4101;
                                class48.field984.method1447(-1, var246);
                                class48.field984.method1447(-1, var248);
                                class16.method132(var244, -111, class48.field984);
                                class48.field984.method1434(-104, class48.field984.field4101 - var249);
                            }
                            continue;
                        }
                        if (var366 == 5009) {
                            class32.field664++;
                            var7 -= 2;
                            class151 var250 = class222.field3848[var7 + 1];
                            class151 var251 = class222.field3848[var7];
                            class48.field984.method650(-13721, 219);
                            class48.field984.method1447(-1, 0);
                            int var252 = class48.field984.field4101;
                            class48.field984.method1458((byte) 119, var251.method981(false));
                            class16.method132(var250, -112, class48.field984);
                            class48.field984.method1434(-105, class48.field984.field4101 - var252);
                            continue;
                        }
                        if (var366 == 5010) {
                            var6--;
                            int var253 = class16.field381[var6];
                            class151 var254 = null;
                            if (var253 < 100) {
                                var254 = class148.field2644[var253];
                            }
                            if (var254 == null) {
                                var254 = class45.field928;
                            }
                            class222.field3848[var7++] = var254;
                            continue;
                        }
                        if (var366 == 5011) {
                            var6--;
                            int var255 = class16.field381[var6];
                            class151 var256 = null;
                            if (var255 < 100) {
                                var256 = class16.field391[var255];
                            }
                            if (var256 == null) {
                                var256 = class45.field928;
                            }
                            class222.field3848[var7++] = var256;
                            continue;
                        }
                        if (var366 == 5012) {
                            var6--;
                            int var257 = class16.field381[var6];
                            int var258 = -1;
                            if (var257 < 100) {
                                var258 = class101.field1829[var257];
                            }
                            class16.field381[var6++] = var258;
                            continue;
                        }
                        if (var366 == 5015) {
                            class151 var259;
                            if (class228.field3975 == null || class228.field3975.field416 == null) {
                                var259 = class160.field2899;
                            } else {
                                var259 = class228.field3975.field416;
                            }
                            class222.field3848[var7++] = var259;
                            continue;
                        }
                        if (var366 == 5016) {
                            class16.field381[var6++] = class118.field2130;
                            continue;
                        }
                        if (var366 == 5017) {
                            class16.field381[var6++] = class177.field3201;
                            continue;
                        }
                        if (var366 == 5050) {
                            var6--;
                            int var260 = class16.field381[var6];
                            class222.field3848[var7++] = class138.method883(var260, 121).field768;
                            continue;
                        }
                        if (var366 == 5051) {
                            var6--;
                            int var261 = class16.field381[var6];
                            class37 var262 = class138.method883(var261, 99);
                            if (var262.field771 == null) {
                                class16.field381[var6++] = 0;
                            } else {
                                class16.field381[var6++] = var262.field771.length;
                            }
                            continue;
                        }
                        if (var366 == 5052) {
                            var6 -= 2;
                            int var263 = class16.field381[var6];
                            int var264 = class16.field381[var6 + 1];
                            class16.field381[var6++] = class138.method883(var263, 112).field771[var264];
                            continue;
                        }
                        if (var366 == 5053) {
                            var6--;
                            int var265 = class16.field381[var6];
                            class37 var266 = class138.method883(var265, 117);
                            if (var266.field760 == null) {
                                class16.field381[var6++] = 0;
                            } else {
                                class16.field381[var6++] = var266.field760.length;
                            }
                            continue;
                        }
                        if (var366 == 5054) {
                            var6 -= 2;
                            int var267 = class16.field381[var6];
                            int var268 = class16.field381[var6 + 1];
                            class16.field381[var6++] = class138.method883(var267, 126).field760[var268];
                            continue;
                        }
                        if (var366 == 5055) {
                            var6--;
                            int var269 = class16.field381[var6];
                            class222.field3848[var7++] = class15.method124(-1, var269).method1405(false);
                            continue;
                        }
                        if (var366 == 5056) {
                            var6--;
                            int var270 = class16.field381[var6];
                            class223 var271 = class15.method124(-1, var270);
                            if (var271.field3886 == null) {
                                class16.field381[var6++] = 0;
                            } else {
                                class16.field381[var6++] = var271.field3886.length;
                            }
                            continue;
                        }
                        if (var366 == 5057) {
                            var6 -= 2;
                            int var272 = class16.field381[var6];
                            int var273 = class16.field381[var6 + 1];
                            class16.field381[var6++] = class15.method124(-1, var272).field3886[var273];
                            continue;
                        }
                        if (var366 == 5058) {
                            class114.field2037 = new class161();
                            var6--;
                            class114.field2037.field2901 = class16.field381[var6];
                            class114.field2037.field2916 = class15.method124(-1, class114.field2037.field2901);
                            class114.field2037.field2912 = new int[class114.field2037.field2916.method1402(true)];
                            continue;
                        }
                        if (var366 == 5059) {
                            class48.field984.method650(-13721, 241);
                            class48.field984.method1447(-1, 0);
                            class56.field1128++;
                            int var274 = class48.field984.field4101;
                            class48.field984.method1447(-1, 0);
                            class48.field984.method1463(-33, class114.field2037.field2901);
                            class114.field2037.field2916.method1400((byte) 107, class114.field2037.field2912, class48.field984);
                            class48.field984.method1434(-82, class48.field984.field4101 - var274);
                            continue;
                        }
                        if (var366 == 5060) {
                            var7--;
                            class151 var275 = class222.field3848[var7];
                            class85.field1594++;
                            class48.field984.method650(-13721, 207);
                            class48.field984.method1447(-1, 0);
                            int var276 = class48.field984.field4101;
                            class48.field984.method1458((byte) 84, var275.method981(false));
                            class48.field984.method1463(-67, class114.field2037.field2901);
                            class114.field2037.field2916.method1400((byte) 122, class114.field2037.field2912, class48.field984);
                            class48.field984.method1434(-47, class48.field984.field4101 - var276);
                            continue;
                        }
                        if (var366 == 5061) {
                            class48.field984.method650(-13721, 241);
                            class56.field1128++;
                            class48.field984.method1447(-1, 0);
                            int var277 = class48.field984.field4101;
                            class48.field984.method1447(-1, 1);
                            class48.field984.method1463(-57, class114.field2037.field2901);
                            class114.field2037.field2916.method1400((byte) 124, class114.field2037.field2912, class48.field984);
                            class48.field984.method1434(-80, class48.field984.field4101 - var277);
                            continue;
                        }
                        if (var366 == 5062) {
                            var6 -= 2;
                            int var278 = class16.field381[var6];
                            int var279 = class16.field381[var6 + 1];
                            class16.field381[var6++] = class138.method883(var278, 114).field763[var279];
                            continue;
                        }
                        if (var366 == 5063) {
                            var6 -= 2;
                            int var280 = class16.field381[var6];
                            int var281 = class16.field381[var6 + 1];
                            class16.field381[var6++] = class138.method883(var280, -72).field769[var281];
                            continue;
                        }
                        if (var366 == 5064) {
                            var6 -= 2;
                            int var282 = class16.field381[var6];
                            int var283 = class16.field381[var6 + 1];
                            if (var283 == -1) {
                                class16.field381[var6++] = -1;
                            } else {
                                class16.field381[var6++] = class138.method883(var282, 117).method276(var283, (byte) 104);
                            }
                            continue;
                        }
                        if (var366 == 5065) {
                            var6 -= 2;
                            int var284 = class16.field381[var6];
                            int var285 = class16.field381[var6 + 1];
                            if (var285 == -1) {
                                class16.field381[var6++] = -1;
                            } else {
                                class16.field381[var6++] = class138.method883(var284, -90).method274(var285, (byte) -26);
                            }
                            continue;
                        }
                        if (var366 == 5066) {
                            var6--;
                            int var286 = class16.field381[var6];
                            class16.field381[var6++] = class15.method124(-1, var286).method1402(true);
                            continue;
                        }
                        if (var366 == 5067) {
                            var6 -= 2;
                            int var287 = class16.field381[var6];
                            int var288 = class16.field381[var6 + 1];
                            int var289 = class15.method124(-1, var287).method1403(var288, 0);
                            System.out.println("chatphrase_getdynamiccommand=" + var289);
                            class16.field381[var6++] = var289;
                            continue;
                        }
                        if (var366 == 5068) {
                            var6 -= 2;
                            int var290 = class16.field381[var6];
                            int var291 = class16.field381[var6 + 1];
                            class114.field2037.field2912[var290] = var291;
                            continue;
                        }
                        if (var366 == 5069) {
                            var6 -= 2;
                            int var292 = class16.field381[var6 + 1];
                            int var293 = class16.field381[var6];
                            class114.field2037.field2912[var293] = var292;
                            continue;
                        }
                        if (var366 == 5070) {
                            var6 -= 3;
                            int var294 = class16.field381[var6 + 2];
                            int var295 = class16.field381[var6 + 1];
                            int var296 = class16.field381[var6];
                            class223 var297 = class15.method124(-1, var296);
                            if (var297.method1403(var295, 0) != 0) {
                                throw new RuntimeException("bad command");
                            }
                            class16.field381[var6++] = var297.method1399(-1848, var295, var294);
                            continue;
                        }
                    } else if (var366 < 5200) {
                        if (var366 == 5100) {
                            if (field4125[86]) {
                                class16.field381[var6++] = 1;
                            } else {
                                class16.field381[var6++] = 0;
                            }
                            continue;
                        }
                        if (var366 == 5101) {
                            if (field4125[82]) {
                                class16.field381[var6++] = 1;
                            } else {
                                class16.field381[var6++] = 0;
                            }
                            continue;
                        }
                        if (var366 == 5102) {
                            if (field4125[81]) {
                                class16.field381[var6++] = 1;
                            } else {
                                class16.field381[var6++] = 0;
                            }
                            continue;
                        }
                    } else if (var366 < 5300) {
                        if (var366 == 5200) {
                            var6--;
                            class178.method1128(21303, class16.field381[var6]);
                            continue;
                        }
                        if (var366 == 5201) {
                            class16.field381[var6++] = class210.method1311(-112);
                            continue;
                        }
                        if (var366 == 5202) {
                            var6--;
                            class211.method1319(class16.field381[var6], false);
                            continue;
                        }
                        if (var366 == 5203) {
                            var7--;
                            class42.method298(10, class222.field3848[var7]);
                            continue;
                        }
                        if (var366 == 5204) {
                            class222.field3848[var7 - 1] = class161.method1045(class222.field3848[var7 - 1], 127);
                            continue;
                        }
                        if (var366 == 5205) {
                            var7--;
                            class162.method1047(0, class222.field3848[var7]);
                            continue;
                        }
                    } else if (var366 >= 5400 && var366 < 5500 && var366 == 5400) {
                        class29.field620++;
                        var7 -= 2;
                        var6--;
                        int var234 = class16.field381[var6];
                        class151 var235 = class222.field3848[var7 + 1];
                        class151 var236 = class222.field3848[var7];
                        class48.field984.method650(-13721, 178);
                        class48.field984.method1447(-1, class65.method431(var236, 1) + class65.method431(var235, 1) + 1);
                        class48.field984.method1479(var236, 165744536);
                        class48.field984.method1479(var235, 165744536);
                        class48.field984.method1447(-1, var234);
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var365) {
            if (var5.field384 == null) {
                if (class115.field2052 != 0) {
                    client.method246(0, (byte) -127, class45.field928, class11.field206);
                }
                class123.method746(var365, "CS2 - scr:" + var5.field1881 + " op:" + var10, -12134);
            } else {
                class151 var362 = class196.method1228(30, -102);
                var362.method980(class153.field2781, (byte) 96).method980(var5.field384, (byte) -100);
                for (int var363 = class51.field1037 - 1; var363 >= 0; var363--) {
                    var362.method980(class212.field3722, (byte) -64).method980(class106.field1882[var363].field3966.field384, (byte) -89);
                }
                if (var10 == 40) {
                    int var364 = var11[var8];
                    var362.method980(class176.field3187, (byte) 85).method980(class137.method874(var364, false), (byte) 79);
                }
                if (class115.field2052 != 0) {
                    client.method246(0, (byte) -113, class45.field928, class126.method761(new class151[] { class194.field3465, var5.field384 }, 10260));
                }
                class123.method746(var365, "CS2 - scr:" + var5.field1881 + " op:" + var10 + new String(var362.method958((byte) 100)), -12134);
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method1510(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Loc;BLoc;Lsd;)[Lhh;")
    public static final class84[] method1511(class151 arg0, byte arg1, class151 arg2, class192 arg3) {
        int var4 = arg3.method1198(arg1 + 25067, arg2);
        int var5 = arg3.method1202(arg0, var4, 95);
        if (arg1 != 61) {
            field4121 = null;
        }
        field4119++;
        return class16.method136(var5, (byte) -122, arg3, var4);
    }
}
