import java.awt.Component;
import java.lang.reflect.Method;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class11 {

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public static int field294 = -1;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "Lqe;")
    private static class179 field299 = class206.method1380("Existing User", (byte) 8);

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "[I")
    public static int[] field296 = new int[5];

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "Lqe;")
    public static class179 field298 = field299;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "Ls;")
    public static class194 field295 = new class194(64);

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
    public static int field303 = -1;

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "I")
    public static int field304 = 0;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method74(int arg0, Component arg1) {
        Method var2 = class1.field15;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        if (arg0 != -3911) {
            field303 = 17;
        }
        arg1.addKeyListener(class98.field1828);
        arg1.addFocusListener(class98.field1828);
        field301++;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
    public static void method75(int arg0) {
        field299 = null;
        int var1 = 77 / ((arg0 + 8) / 63);
        field296 = null;
        field298 = null;
        field295 = null;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lbh;II)V")
    public static final void method76(class19 arg0, int arg1, int arg2) {
        field293++;
        Object[] var3 = arg0.field491;
        int var4 = (Integer) var3[0];
        class138 var5 = class98.method625(0, var4);
        if (var5 == null) {
            return;
        }
        class175.field3155 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        int[] var9 = var5.field2555;
        byte var10 = -1;
        int[] var11 = var5.field2553;
        try {
            class28.field614 = new class179[var5.field2552];
            if (arg2 > -56) {
                method80(-114, 23, -117, -114, 119, null, 92);
            }
            class59.field1265 = new int[var5.field2544];
            int var12 = 0;
            int var13 = 0;
            for (int var14 = 1; var14 < var3.length; var14++) {
                if (var3[var14] instanceof Integer) {
                    int var15 = (Integer) var3[var14];
                    if (var15 == -2147483647) {
                        var15 = arg0.field496;
                    }
                    if (var15 == -2147483646) {
                        var15 = arg0.field489;
                    }
                    if (var15 == -2147483645) {
                        var15 = arg0.field499 == null ? -1 : arg0.field499.field173;
                    }
                    if (var15 == -2147483644) {
                        var15 = arg0.field493;
                    }
                    if (var15 == -2147483643) {
                        var15 = arg0.field499 == null ? -1 : arg0.field499.field130;
                    }
                    if (var15 == -2147483642) {
                        var15 = arg0.field487 == null ? -1 : arg0.field487.field173;
                    }
                    if (var15 == -2147483641) {
                        var15 = arg0.field487 == null ? -1 : arg0.field487.field130;
                    }
                    if (var15 == -2147483640) {
                        var15 = arg0.field497;
                    }
                    if (var15 == -2147483639) {
                        var15 = arg0.field495;
                    }
                    class59.field1265[var12++] = var15;
                } else if (var3[var14] instanceof class179) {
                    class179 var16 = (class179) var3[var14];
                    if (var16.method1142(class212.field3951, (byte) -25)) {
                        var16 = arg0.field490;
                    }
                    class28.field614[var13++] = var16;
                }
            }
            int var17 = 0;
            label2424: while (true) {
                var17++;
                if (var17 > arg1) {
                    throw new RuntimeException("slow");
                }
                var8++;
                int var365 = var9[var8];
                if (var365 < 100) {
                    if (var365 == 0) {
                        class98.field1833[var7++] = var11[var8];
                        continue;
                    }
                    if (var365 == 1) {
                        int var18 = var11[var8];
                        class98.field1833[var7++] = class14.field355[var18];
                        continue;
                    }
                    if (var365 == 2) {
                        int var19 = var11[var8];
                        var7--;
                        class14.field355[var19] = class98.field1833[var7];
                        continue;
                    }
                    if (var365 == 3) {
                        class78.field1529[var6++] = var5.field2545[var8];
                        continue;
                    }
                    if (var365 == 6) {
                        var8 += var11[var8];
                        continue;
                    }
                    if (var365 == 7) {
                        var7 -= 2;
                        if (class98.field1833[var7 + 1] != class98.field1833[var7]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var365 == 8) {
                        var7 -= 2;
                        if (class98.field1833[var7 + 1] == class98.field1833[var7]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var365 == 9) {
                        var7 -= 2;
                        if (class98.field1833[var7 + 1] > class98.field1833[var7]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var365 == 10) {
                        var7 -= 2;
                        if (class98.field1833[var7 + 1] < class98.field1833[var7]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var365 == 21) {
                        if (class175.field3155 == 0) {
                            return;
                        }
                        class22 var20 = class136.field2522[--class175.field3155];
                        var5 = var20.field549;
                        class28.field614 = var20.field545;
                        var9 = var5.field2555;
                        var8 = var20.field543;
                        var11 = var5.field2553;
                        class59.field1265 = var20.field550;
                        continue;
                    }
                    if (var365 == 25) {
                        int var21 = var11[var8];
                        class98.field1833[var7++] = class225.method1473(-13545, var21);
                        continue;
                    }
                    if (var365 == 27) {
                        int var22 = var11[var8];
                        var7--;
                        class148.method945(var22, 3405, class98.field1833[var7]);
                        continue;
                    }
                    if (var365 == 31) {
                        var7 -= 2;
                        if (class98.field1833[var7 + 1] >= class98.field1833[var7]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var365 == 32) {
                        var7 -= 2;
                        if (class98.field1833[var7 + 1] <= class98.field1833[var7]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var365 == 33) {
                        class98.field1833[var7++] = class59.field1265[var11[var8]];
                        continue;
                    }
                    int var10001;
                    if (var365 == 34) {
                        var10001 = var11[var8];
                        var7--;
                        class59.field1265[var10001] = class98.field1833[var7];
                        continue;
                    }
                    if (var365 == 35) {
                        class78.field1529[var6++] = class28.field614[var11[var8]];
                        continue;
                    }
                    if (var365 == 36) {
                        var10001 = var11[var8];
                        var6--;
                        class28.field614[var10001] = class78.field1529[var6];
                        continue;
                    }
                    if (var365 == 37) {
                        int var23 = var11[var8];
                        var6 -= var23;
                        class179 var24 = class223.method1447(var23, 16736, var6, class78.field1529);
                        class78.field1529[var6++] = var24;
                        continue;
                    }
                    if (var365 == 38) {
                        var7--;
                        continue;
                    }
                    if (var365 == 39) {
                        var6--;
                        continue;
                    }
                    if (var365 == 40) {
                        int var25 = var11[var8];
                        class138 var26 = class98.method625(0, var25);
                        int[] var27 = new int[var26.field2544];
                        class179[] var28 = new class179[var26.field2552];
                        for (int var29 = 0; var29 < var26.field2540; var29++) {
                            var27[var29] = class98.field1833[var7 + var29 - var26.field2540];
                        }
                        for (int var30 = 0; var30 < var26.field2549; var30++) {
                            var28[var30] = class78.field1529[var6 + var30 - var26.field2549];
                        }
                        var7 -= var26.field2540;
                        var6 -= var26.field2549;
                        class22 var31 = new class22();
                        var31.field543 = var8;
                        var31.field549 = var5;
                        var31.field550 = class59.field1265;
                        var31.field545 = class28.field614;
                        if (class136.field2522.length <= class175.field3155) {
                            throw new RuntimeException();
                        }
                        class136.field2522[class175.field3155++] = var31;
                        var5 = var26;
                        class59.field1265 = var27;
                        var8 = -1;
                        var11 = var26.field2553;
                        var9 = var26.field2555;
                        class28.field614 = var28;
                        continue;
                    }
                    if (var365 == 42) {
                        class98.field1833[var7++] = class233.field4300[var11[var8]];
                        continue;
                    }
                    if (var365 == 43) {
                        var10001 = var11[var8];
                        var7--;
                        class233.field4300[var10001] = class98.field1833[var7];
                        continue;
                    }
                    if (var365 == 44) {
                        int var32 = var11[var8] >> 16;
                        var7--;
                        int var33 = class98.field1833[var7];
                        int var34 = var11[var8] & 0xFFFF;
                        if (var33 >= 0 && var33 <= 5000) {
                            byte var35 = -1;
                            class87.field1659[var32] = var33;
                            if (var34 == 105) {
                                var35 = 0;
                            }
                            int var36 = 0;
                            while (true) {
                                if (var36 >= var33) {
                                    continue label2424;
                                }
                                class176.field3207[var32][var36] = var35;
                                var36++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var365 == 45) {
                        int var37 = var11[var8];
                        var7--;
                        int var38 = class98.field1833[var7];
                        if (var38 >= 0 && var38 < class87.field1659[var37]) {
                            class98.field1833[var7++] = class176.field3207[var37][var38];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var365 == 46) {
                        var7 -= 2;
                        int var39 = class98.field1833[var7];
                        int var40 = var11[var8];
                        if (var39 >= 0 && class87.field1659[var40] > var39) {
                            class176.field3207[var40][var39] = class98.field1833[var7 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var365 == 47) {
                        class179 var41 = class174.field3128[var11[var8]];
                        if (var41 == null) {
                            var41 = class43.field937;
                        }
                        class78.field1529[var6++] = var41;
                        continue;
                    }
                    if (var365 == 48) {
                        var10001 = var11[var8];
                        var6--;
                        class174.field3128[var10001] = class78.field1529[var6];
                        continue;
                    }
                    if (var365 == 51) {
                        class144 var42 = var5.field2554[var11[var8]];
                        var7--;
                        class43 var43 = (class43) var42.method909(-1, (long) class98.field1833[var7]);
                        if (var43 != null) {
                            var8 += var43.field931;
                        }
                        continue;
                    }
                }
                boolean var44;
                if (var11[var8] == 1) {
                    var44 = true;
                } else {
                    var44 = false;
                }
                if (var365 < 300) {
                    if (var365 == 100) {
                        var7 -= 3;
                        int var345 = class98.field1833[var7];
                        int var346 = class98.field1833[var7 + 1];
                        int var347 = class98.field1833[var7 + 2];
                        if (var346 == 0) {
                            throw new RuntimeException();
                        }
                        class6 var348 = class87.method580(var345, 124);
                        if (var348.field206 == null) {
                            var348.field206 = new class6[var347 + 1];
                        }
                        if (var347 >= var348.field206.length) {
                            class6[] var349 = new class6[var347 + 1];
                            for (int var350 = 0; var350 < var348.field206.length; var350++) {
                                var349[var350] = var348.field206[var350];
                            }
                            var348.field206 = var349;
                        }
                        if (var347 > 0 && var348.field206[var347 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var347 - 1));
                        }
                        class6 var351 = new class6();
                        var351.field108 = true;
                        var351.field131 = var351.field173 = var348.field173;
                        var351.field128 = var346;
                        var351.field130 = var347;
                        var348.field206[var347] = var351;
                        if (var44) {
                            class33.field723 = var351;
                        } else {
                            class207.field3861 = var351;
                        }
                        class139.method880(var348, 108);
                        continue;
                    }
                    if (var365 == 101) {
                        class6 var352 = var44 ? class33.field723 : class207.field3861;
                        if (var352.field130 == -1) {
                            if (var44) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class6 var353 = class87.method580(var352.field173, 90);
                        var353.field206[var352.field130] = null;
                        class139.method880(var353, 122);
                        continue;
                    }
                    if (var365 == 102) {
                        var7--;
                        class6 var354 = class87.method580(class98.field1833[var7], 77);
                        var354.field206 = null;
                        class139.method880(var354, 113);
                        continue;
                    }
                    if (var365 == 200) {
                        var7 -= 2;
                        int var355 = class98.field1833[var7];
                        int var356 = class98.field1833[var7 + 1];
                        class6 var357 = class227.method1485(var356, var355, (byte) 124);
                        if (var357 != null && var356 != -1) {
                            class98.field1833[var7++] = 1;
                            if (var44) {
                                class33.field723 = var357;
                            } else {
                                class207.field3861 = var357;
                            }
                            continue;
                        }
                        class98.field1833[var7++] = 0;
                        continue;
                    }
                    if (var365 == 201) {
                        var7--;
                        int var358 = class98.field1833[var7];
                        class6 var359 = class87.method580(var358, 89);
                        if (var359 == null) {
                            class98.field1833[var7++] = 0;
                        } else {
                            class98.field1833[var7++] = 1;
                            if (var44) {
                                class33.field723 = var359;
                            } else {
                                class207.field3861 = var359;
                            }
                        }
                        continue;
                    }
                } else if (var365 < 500) {
                    if (var365 == 403) {
                        var7 -= 2;
                        int var340 = class98.field1833[var7];
                        if (var340 >= 7) {
                            var340 -= 7;
                        }
                        int var341 = class98.field1833[var7 + 1];
                        class61.field1298.field2167.method641(var341, var340, 22558);
                        continue;
                    }
                    if (var365 == 404) {
                        var7 -= 2;
                        int var342 = class98.field1833[var7 + 1];
                        int var343 = class98.field1833[var7];
                        class61.field1298.field2167.method634(var342, var343, (byte) -97);
                        continue;
                    }
                    if (var365 == 410) {
                        var7--;
                        boolean var344 = class98.field1833[var7] != 0;
                        class61.field1298.field2167.method637((byte) 31, var344);
                        continue;
                    }
                } else if (var365 >= 1000 && var365 < 1100 || var365 >= 2000 && var365 < 2100) {
                    class6 var45;
                    if (var365 >= 2000) {
                        var7--;
                        var45 = class87.method580(class98.field1833[var7], 68);
                        var365 -= 1000;
                    } else {
                        var45 = var44 ? class33.field723 : class207.field3861;
                    }
                    if (var365 == 1000) {
                        var7 -= 2;
                        var45.field90 = 0;
                        var45.field166 = var45.field75 = class98.field1833[var7];
                        var45.field213 = 0;
                        var45.field83 = var45.field110 = class98.field1833[var7 + 1];
                        class139.method880(var45, 120);
                        continue;
                    }
                    if (var365 == 1001) {
                        var45.field162 = 0;
                        var7 -= 2;
                        var45.field169 = var45.field89 = class98.field1833[var7];
                        var45.field216 = 0;
                        var45.field151 = 0;
                        var45.field73 = var45.field86 = class98.field1833[var7 + 1];
                        var45.field160 = 0;
                        class139.method880(var45, 111);
                        if (var45.field128 == 0) {
                            class54.method380(var45, (byte) 25);
                        }
                        continue;
                    }
                    if (var365 == 1003) {
                        var7--;
                        boolean var46 = class98.field1833[var7] == 1;
                        if (var46 != var45.field226) {
                            var45.field226 = var46;
                            class139.method880(var45, 100);
                        }
                        continue;
                    }
                } else if (var365 >= 1100 && var365 < 1200 || !(var365 < 2100 || var365 >= 2200)) {
                    class6 var337;
                    if (var365 >= 2000) {
                        var365 -= 1000;
                        var7--;
                        var337 = class87.method580(class98.field1833[var7], 93);
                    } else {
                        var337 = var44 ? class33.field723 : class207.field3861;
                    }
                    if (var365 == 1100) {
                        var7 -= 2;
                        var337.field70 = class98.field1833[var7];
                        if (var337.field70 > var337.field152 - var337.field169) {
                            var337.field70 = var337.field152 - var337.field169;
                        }
                        if (var337.field70 < 0) {
                            var337.field70 = 0;
                        }
                        var337.field119 = class98.field1833[var7 + 1];
                        if (var337.field119 > var337.field97 - var337.field73) {
                            var337.field119 = var337.field97 - var337.field73;
                        }
                        if (var337.field119 < 0) {
                            var337.field119 = 0;
                        }
                        class139.method880(var337, 112);
                        continue;
                    }
                    if (var365 == 1101) {
                        var7--;
                        var337.field193 = class98.field1833[var7];
                        class139.method880(var337, 114);
                        continue;
                    }
                    if (var365 == 1102) {
                        var7--;
                        var337.field100 = class98.field1833[var7] == 1;
                        class139.method880(var337, 125);
                        continue;
                    }
                    if (var365 == 1103) {
                        var7--;
                        var337.field148 = class98.field1833[var7];
                        class139.method880(var337, 109);
                        continue;
                    }
                    if (var365 == 1104) {
                        var7--;
                        var337.field120 = class98.field1833[var7];
                        class139.method880(var337, 124);
                        continue;
                    }
                    if (var365 == 1105) {
                        var7--;
                        var337.field205 = class98.field1833[var7];
                        class139.method880(var337, 125);
                        continue;
                    }
                    if (var365 == 1106) {
                        var7--;
                        var337.field212 = class98.field1833[var7];
                        class139.method880(var337, 107);
                        continue;
                    }
                    if (var365 == 1107) {
                        var7--;
                        var337.field200 = class98.field1833[var7] == 1;
                        class139.method880(var337, 115);
                        continue;
                    }
                    if (var365 == 1108) {
                        var337.field218 = 1;
                        var7--;
                        var337.field147 = class98.field1833[var7];
                        class139.method880(var337, 98);
                        continue;
                    }
                    if (var365 == 1109) {
                        var7 -= 6;
                        var337.field149 = class98.field1833[var7];
                        var337.field219 = class98.field1833[var7 + 1];
                        var337.field163 = class98.field1833[var7 + 2];
                        var337.field199 = class98.field1833[var7 + 3];
                        var337.field153 = class98.field1833[var7 + 4];
                        var337.field143 = class98.field1833[var7 + 5];
                        class139.method880(var337, 123);
                        continue;
                    }
                    if (var365 == 1110) {
                        var7--;
                        int var338 = class98.field1833[var7];
                        if (var337.field184 != var338) {
                            var337.field139 = 0;
                            var337.field195 = 0;
                            var337.field184 = var338;
                            class139.method880(var337, 96);
                        }
                        continue;
                    }
                    if (var365 == 1111) {
                        var7--;
                        var337.field161 = class98.field1833[var7] == 1;
                        class139.method880(var337, 106);
                        continue;
                    }
                    if (var365 == 1112) {
                        var6--;
                        class179 var339 = class78.field1529[var6];
                        if (!var339.method1142(var337.field113, (byte) -122)) {
                            var337.field113 = var339;
                            class139.method880(var337, 106);
                        }
                        continue;
                    }
                    if (var365 == 1113) {
                        var7--;
                        var337.field77 = class98.field1833[var7];
                        class139.method880(var337, 111);
                        continue;
                    }
                    if (var365 == 1114) {
                        var7 -= 3;
                        var337.field136 = class98.field1833[var7];
                        var337.field194 = class98.field1833[var7 + 1];
                        var337.field135 = class98.field1833[var7 + 2];
                        class139.method880(var337, 99);
                        continue;
                    }
                    if (var365 == 1115) {
                        var7--;
                        var337.field127 = class98.field1833[var7] == 1;
                        class139.method880(var337, 109);
                        continue;
                    }
                    if (var365 == 1116) {
                        var7--;
                        var337.field208 = class98.field1833[var7];
                        class139.method880(var337, 115);
                        continue;
                    }
                    if (var365 == 1117) {
                        var7--;
                        var337.field197 = class98.field1833[var7];
                        class139.method880(var337, 99);
                        continue;
                    }
                    if (var365 == 1118) {
                        var7--;
                        var337.field165 = class98.field1833[var7] == 1;
                        class139.method880(var337, 113);
                        continue;
                    }
                    if (var365 == 1119) {
                        var7--;
                        var337.field177 = class98.field1833[var7] == 1;
                        class139.method880(var337, 98);
                        continue;
                    }
                    if (var365 == 1120) {
                        var7 -= 2;
                        var337.field152 = class98.field1833[var7];
                        var337.field97 = class98.field1833[var7 + 1];
                        class139.method880(var337, 111);
                        if (var337.field128 == 0) {
                            class54.method380(var337, (byte) 25);
                        }
                        continue;
                    }
                } else if (var365 >= 1200 && var365 < 1300 || var365 >= 2200 && var365 < 2300) {
                    class6 var333;
                    if (var365 < 2000) {
                        var333 = var44 ? class33.field723 : class207.field3861;
                    } else {
                        var365 -= 1000;
                        var7--;
                        var333 = class87.method580(class98.field1833[var7], 116);
                    }
                    class139.method880(var333, 104);
                    if (var365 == 1200 || var365 == 1205) {
                        var7 -= 2;
                        int var334 = class98.field1833[var7];
                        int var335 = class98.field1833[var7 + 1];
                        if (var334 == -1) {
                            var333.field218 = 1;
                            var333.field172 = -1;
                            var333.field147 = -1;
                        } else {
                            var333.field188 = var335;
                            var333.field172 = var334;
                            class15 var336 = class131.method835((byte) -20, var334);
                            var333.field219 = var336.field385;
                            var333.field149 = var336.field380;
                            var333.field199 = var336.field424;
                            var333.field153 = var336.field387;
                            var333.field143 = var336.field368;
                            if (var333.field216 > 0) {
                                var333.field143 = var333.field143 * 32 / var333.field216;
                            } else if (var333.field89 > 0) {
                                var333.field143 = var333.field143 * 32 / var333.field89;
                            }
                            if (var365 == 1205) {
                                var333.field170 = false;
                            } else {
                                var333.field170 = true;
                            }
                            var333.field163 = var336.field403;
                        }
                        continue;
                    }
                    if (var365 == 1201) {
                        var333.field218 = 2;
                        var7--;
                        var333.field147 = class98.field1833[var7];
                        continue;
                    }
                    if (var365 == 1202) {
                        var333.field218 = 3;
                        var333.field147 = class61.field1298.field2167.method631(11);
                        continue;
                    }
                    if (var365 == 1203) {
                        var333.field218 = 6;
                        var7--;
                        var333.field147 = class98.field1833[var7];
                        continue;
                    }
                    if (var365 == 1204) {
                        var333.field218 = 5;
                        var7--;
                        var333.field147 = class98.field1833[var7];
                        continue;
                    }
                } else if ((var365 < 1300 || var365 >= 1400) && (var365 < 2300 || var365 >= 2400)) {
                    if (var365 >= 1400 && var365 < 1500 || var365 >= 2400 && var365 < 2500) {
                        class6 var51;
                        if (var365 < 2000) {
                            var51 = var44 ? class33.field723 : class207.field3861;
                        } else {
                            var365 -= 1000;
                            var7--;
                            var51 = class87.method580(class98.field1833[var7], 96);
                        }
                        var6--;
                        class179 var52 = class78.field1529[var6];
                        int[] var53 = null;
                        if (var52.method1168(true) > 0 && var52.method1161(var52.method1168(true) - 1, (byte) -38) == 89) {
                            var7--;
                            int var54 = class98.field1833[var7];
                            if (var54 > 0) {
                                var53 = new int[var54];
                                while (var54-- > 0) {
                                    var7--;
                                    var53[var54] = class98.field1833[var7];
                                }
                            }
                            var52 = var52.method1156(-5684, var52.method1168(true) - 1, 0);
                        }
                        Object[] var55 = new Object[var52.method1168(true) + 1];
                        for (int var56 = var55.length - 1; var56 >= 1; var56--) {
                            if (var52.method1161(var56 - 1, (byte) 105) == 115) {
                                var6--;
                                var55[var56] = class78.field1529[var6];
                            } else {
                                var7--;
                                var55[var56] = Integer.valueOf(class98.field1833[var7]);
                            }
                        }
                        var7--;
                        int var57 = class98.field1833[var7];
                        if (var57 == -1) {
                            var55 = null;
                        } else {
                            var55[0] = Integer.valueOf(var57);
                        }
                        if (var365 == 1407) {
                            var51.field122 = var55;
                            var51.field121 = var53;
                        }
                        if (var365 == 1424) {
                            var51.field146 = var55;
                        }
                        if (var365 == 1406) {
                            var51.field227 = var55;
                        }
                        if (var365 == 1417) {
                            var51.field180 = var55;
                        }
                        if (var365 == 1408) {
                            var51.field106 = var55;
                        }
                        var51.field171 = true;
                        if (var365 == 1410) {
                            var51.field214 = var55;
                        }
                        if (var365 == 1409) {
                            var51.field155 = var55;
                        }
                        if (var365 == 1425) {
                            var51.field190 = var55;
                        }
                        if (var365 == 1419) {
                            var51.field203 = var55;
                        }
                        if (var365 == 1401) {
                            var51.field183 = var55;
                        }
                        if (var365 == 1422) {
                            var51.field210 = var55;
                        }
                        if (var365 == 1418) {
                            var51.field93 = var55;
                        }
                        if (var365 == 1404) {
                            var51.field202 = var55;
                        }
                        if (var365 == 1423) {
                            var51.field178 = var55;
                        }
                        if (var365 == 1402) {
                            var51.field79 = var55;
                        }
                        if (var365 == 1403) {
                            var51.field118 = var55;
                        }
                        if (var365 == 1405) {
                            var51.field201 = var55;
                        }
                        if (var365 == 1412) {
                            var51.field91 = var55;
                        }
                        if (var365 == 1420) {
                            var51.field196 = var55;
                        }
                        if (var365 == 1421) {
                            var51.field104 = var55;
                        }
                        if (var365 == 1400) {
                            var51.field215 = var55;
                        }
                        if (var365 == 1411) {
                            var51.field217 = var55;
                        }
                        if (var365 == 1414) {
                            var51.field144 = var55;
                            var51.field140 = var53;
                        }
                        if (var365 == 1416) {
                            var51.field96 = var55;
                        }
                        if (var365 == 1415) {
                            var51.field209 = var55;
                            var51.field150 = var53;
                        }
                        continue;
                    }
                    if (var365 < 1600) {
                        class6 var332 = var44 ? class33.field723 : class207.field3861;
                        if (var365 == 1500) {
                            class98.field1833[var7++] = var332.field166;
                            continue;
                        }
                        if (var365 == 1501) {
                            class98.field1833[var7++] = var332.field83;
                            continue;
                        }
                        if (var365 == 1502) {
                            class98.field1833[var7++] = var332.field169;
                            continue;
                        }
                        if (var365 == 1503) {
                            class98.field1833[var7++] = var332.field73;
                            continue;
                        }
                        if (var365 == 1504) {
                            class98.field1833[var7++] = var332.field226 ? 1 : 0;
                            continue;
                        }
                        if (var365 == 1505) {
                            class98.field1833[var7++] = var332.field131;
                            continue;
                        }
                    } else if (var365 < 1700) {
                        class6 var58 = var44 ? class33.field723 : class207.field3861;
                        if (var365 == 1600) {
                            class98.field1833[var7++] = var58.field70;
                            continue;
                        }
                        if (var365 == 1601) {
                            class98.field1833[var7++] = var58.field119;
                            continue;
                        }
                        if (var365 == 1602) {
                            class78.field1529[var6++] = var58.field113;
                            continue;
                        }
                        if (var365 == 1603) {
                            class98.field1833[var7++] = var58.field152;
                            continue;
                        }
                        if (var365 == 1604) {
                            class98.field1833[var7++] = var58.field97;
                            continue;
                        }
                        if (var365 == 1605) {
                            class98.field1833[var7++] = var58.field143;
                            continue;
                        }
                        if (var365 == 1606) {
                            class98.field1833[var7++] = var58.field163;
                            continue;
                        }
                        if (var365 == 1607) {
                            class98.field1833[var7++] = var58.field153;
                            continue;
                        }
                        if (var365 == 1608) {
                            class98.field1833[var7++] = var58.field199;
                            continue;
                        }
                        if (var365 == 1609) {
                            class98.field1833[var7++] = var58.field148;
                            continue;
                        }
                    } else if (var365 < 1800) {
                        class6 var331 = var44 ? class33.field723 : class207.field3861;
                        if (var365 == 1700) {
                            class98.field1833[var7++] = var331.field172;
                            continue;
                        }
                        if (var365 == 1701) {
                            if (var331.field172 == -1) {
                                class98.field1833[var7++] = 0;
                            } else {
                                class98.field1833[var7++] = var331.field188;
                            }
                            continue;
                        }
                        if (var365 == 1702) {
                            class98.field1833[var7++] = var331.field130;
                            continue;
                        }
                    } else if (var365 < 1900) {
                        class6 var329 = var44 ? class33.field723 : class207.field3861;
                        if (var365 == 1800) {
                            class98.field1833[var7++] = class226.method1479(102, class159.method1026(var329, -1493540320));
                            continue;
                        }
                        if (var365 == 1801) {
                            var7--;
                            int var330 = class98.field1833[var7];
                            int var367 = var330 - 1;
                            if (var329.field159 != null && var329.field159.length > var367 && var329.field159[var367] != null) {
                                class78.field1529[var6++] = var329.field159[var367];
                                continue;
                            }
                            class78.field1529[var6++] = class91.field1735;
                            continue;
                        }
                        if (var365 == 1802) {
                            if (var329.field198 == null) {
                                class78.field1529[var6++] = class91.field1735;
                            } else {
                                class78.field1529[var6++] = var329.field198;
                            }
                            continue;
                        }
                    } else if (var365 < 2600) {
                        var7--;
                        class6 var59 = class87.method580(class98.field1833[var7], 92);
                        if (var365 == 2500) {
                            class98.field1833[var7++] = var59.field166;
                            continue;
                        }
                        if (var365 == 2501) {
                            class98.field1833[var7++] = var59.field83;
                            continue;
                        }
                        if (var365 == 2502) {
                            class98.field1833[var7++] = var59.field169;
                            continue;
                        }
                        if (var365 == 2503) {
                            class98.field1833[var7++] = var59.field73;
                            continue;
                        }
                        if (var365 == 2504) {
                            class98.field1833[var7++] = var59.field226 ? 1 : 0;
                            continue;
                        }
                        if (var365 == 2505) {
                            class98.field1833[var7++] = var59.field131;
                            continue;
                        }
                    } else if (var365 < 2700) {
                        var7--;
                        class6 var60 = class87.method580(class98.field1833[var7], 77);
                        if (var365 == 2600) {
                            class98.field1833[var7++] = var60.field70;
                            continue;
                        }
                        if (var365 == 2601) {
                            class98.field1833[var7++] = var60.field119;
                            continue;
                        }
                        if (var365 == 2602) {
                            class78.field1529[var6++] = var60.field113;
                            continue;
                        }
                        if (var365 == 2603) {
                            class98.field1833[var7++] = var60.field152;
                            continue;
                        }
                        if (var365 == 2604) {
                            class98.field1833[var7++] = var60.field97;
                            continue;
                        }
                        if (var365 == 2605) {
                            class98.field1833[var7++] = var60.field143;
                            continue;
                        }
                        if (var365 == 2606) {
                            class98.field1833[var7++] = var60.field163;
                            continue;
                        }
                        if (var365 == 2607) {
                            class98.field1833[var7++] = var60.field153;
                            continue;
                        }
                        if (var365 == 2608) {
                            class98.field1833[var7++] = var60.field199;
                            continue;
                        }
                        if (var365 == 2609) {
                            class98.field1833[var7++] = var60.field148;
                            continue;
                        }
                    } else if (var365 < 2800) {
                        if (var365 == 2700) {
                            var7--;
                            class6 var319 = class87.method580(class98.field1833[var7], 41);
                            class98.field1833[var7++] = var319.field172;
                            continue;
                        }
                        if (var365 == 2701) {
                            var7--;
                            class6 var320 = class87.method580(class98.field1833[var7], 122);
                            if (var320.field172 == -1) {
                                class98.field1833[var7++] = 0;
                            } else {
                                class98.field1833[var7++] = var320.field188;
                            }
                            continue;
                        }
                        if (var365 == 2702) {
                            var7--;
                            int var321 = class98.field1833[var7];
                            class98 var322 = (class98) class36.field797.method909(-1, (long) var321);
                            if (var322 == null) {
                                class98.field1833[var7++] = 0;
                            } else {
                                class98.field1833[var7++] = 1;
                            }
                            continue;
                        }
                        if (var365 == 2703) {
                            var7--;
                            class6 var323 = class87.method580(class98.field1833[var7], 93);
                            if (var323.field206 == null) {
                                class98.field1833[var7++] = 0;
                                continue;
                            }
                            int var324 = var323.field206.length;
                            for (int var325 = 0; var325 < var323.field206.length; var325++) {
                                if (var323.field206[var325] == null) {
                                    var324 = var325;
                                    break;
                                }
                            }
                            class98.field1833[var7++] = var324;
                            continue;
                        }
                        if (var365 == 2704 || var365 == 2705) {
                            var7 -= 2;
                            int var326 = class98.field1833[var7];
                            int var327 = class98.field1833[var7 + 1];
                            class98 var328 = (class98) class36.field797.method909(-1, (long) var326);
                            if (var328 != null && var328.field1831 == var327) {
                                class98.field1833[var7++] = 1;
                                continue;
                            }
                            class98.field1833[var7++] = 0;
                            continue;
                        }
                    } else if (var365 < 2900) {
                        var7--;
                        class6 var61 = class87.method580(class98.field1833[var7], 58);
                        if (var365 == 2800) {
                            class98.field1833[var7++] = class226.method1479(84, class159.method1026(var61, -1493540320));
                            continue;
                        }
                        if (var365 == 2801) {
                            var7--;
                            int var62 = class98.field1833[var7];
                            int var366 = var62 - 1;
                            if (var61.field159 != null && var366 < var61.field159.length && var61.field159[var366] != null) {
                                class78.field1529[var6++] = var61.field159[var366];
                                continue;
                            }
                            class78.field1529[var6++] = class91.field1735;
                            continue;
                        }
                        if (var365 == 2802) {
                            if (var61.field198 == null) {
                                class78.field1529[var6++] = class91.field1735;
                            } else {
                                class78.field1529[var6++] = var61.field198;
                            }
                            continue;
                        }
                    } else if (var365 < 3200) {
                        if (var365 == 3100) {
                            var6--;
                            class179 var63 = class78.field1529[var6];
                            class189.method1276(0, (byte) 1, var63, class91.field1735);
                            continue;
                        }
                        if (var365 == 3101) {
                            var7 -= 2;
                            class78.method503(class98.field1833[var7 + 1], (byte) 89, class98.field1833[var7], class61.field1298);
                            continue;
                        }
                        if (var365 == 3103) {
                            class212.method1403(42);
                            continue;
                        }
                        if (var365 == 3104) {
                            int var64 = 0;
                            class214.field3979++;
                            var6--;
                            class179 var65 = class78.field1529[var6];
                            if (var65.method1147(-21185)) {
                                var64 = var65.method1139(10);
                            }
                            class81.field1564.method70((byte) -62, 132);
                            class81.field1564.method1229((byte) -71, var64);
                            continue;
                        }
                        if (var365 == 3105) {
                            class100.field1874++;
                            var6--;
                            class179 var66 = class78.field1529[var6];
                            class81.field1564.method70((byte) -62, 65);
                            class81.field1564.method1232(var66.method1137(83), (byte) 124);
                            continue;
                        }
                        if (var365 == 3106) {
                            class214.field3969++;
                            var6--;
                            class179 var67 = class78.field1529[var6];
                            class81.field1564.method70((byte) -62, 173);
                            class81.field1564.method1230((byte) -94, var67.method1168(true) + 1);
                            class81.field1564.method1212((byte) 0, var67);
                            continue;
                        }
                        if (var365 == 3107) {
                            var7--;
                            int var68 = class98.field1833[var7];
                            var6--;
                            class179 var69 = class78.field1529[var6];
                            class39.method251(var68, var69, 0);
                            continue;
                        }
                        if (var365 == 3108) {
                            var7 -= 3;
                            int var70 = class98.field1833[var7];
                            int var71 = class98.field1833[var7 + 1];
                            int var72 = class98.field1833[var7 + 2];
                            class6 var73 = class87.method580(var72, 65);
                            class46.method304(var73, var71, var70, -1446);
                            continue;
                        }
                        if (var365 == 3109) {
                            var7 -= 2;
                            int var74 = class98.field1833[var7 + 1];
                            int var75 = class98.field1833[var7];
                            class6 var76 = var44 ? class33.field723 : class207.field3861;
                            class46.method304(var76, var74, var75, -1446);
                            continue;
                        }
                        if (var365 == 3110) {
                            var7--;
                            int var77 = class98.field1833[var7];
                            class81.field1564.method70((byte) -62, 20);
                            class165.field2977++;
                            class81.field1564.method1222((byte) -104, var77);
                            continue;
                        }
                    } else if (var365 < 3300) {
                        if (var365 == 3200) {
                            var7 -= 3;
                            class121.method777(class98.field1833[var7], class98.field1833[var7 + 1], class98.field1833[var7 + 2], -110);
                            continue;
                        }
                        if (var365 == 3201) {
                            var7--;
                            class187.method1267(class98.field1833[var7], -1);
                            continue;
                        }
                        if (var365 == 3202) {
                            var7 -= 2;
                            class42.method280(class98.field1833[var7], class98.field1833[var7 + 1], -31770);
                            continue;
                        }
                    } else if (var365 < 3400) {
                        if (var365 == 3300) {
                            class98.field1833[var7++] = class13.field322;
                            continue;
                        }
                        if (var365 == 3301) {
                            var7 -= 2;
                            int var297 = class98.field1833[var7 + 1];
                            int var298 = class98.field1833[var7];
                            class98.field1833[var7++] = class187.method1264(var297, (byte) 104, var298);
                            continue;
                        }
                        if (var365 == 3302) {
                            var7 -= 2;
                            int var299 = class98.field1833[var7];
                            int var300 = class98.field1833[var7 + 1];
                            class98.field1833[var7++] = class207.method1382(var300, var299, (byte) -126);
                            continue;
                        }
                        if (var365 == 3303) {
                            var7 -= 2;
                            int var301 = class98.field1833[var7];
                            int var302 = class98.field1833[var7 + 1];
                            class98.field1833[var7++] = class180.method1173(true, var301, var302);
                            continue;
                        }
                        if (var365 == 3304) {
                            var7--;
                            int var303 = class98.field1833[var7];
                            class98.field1833[var7++] = class86.method578((byte) 63, var303).field4175;
                            continue;
                        }
                        if (var365 == 3305) {
                            var7--;
                            int var304 = class98.field1833[var7];
                            class98.field1833[var7++] = class69.field1393[var304];
                            continue;
                        }
                        if (var365 == 3306) {
                            var7--;
                            int var305 = class98.field1833[var7];
                            class98.field1833[var7++] = class178.field3237[var305];
                            continue;
                        }
                        if (var365 == 3307) {
                            var7--;
                            int var306 = class98.field1833[var7];
                            class98.field1833[var7++] = class136.field2517[var306];
                            continue;
                        }
                        if (var365 == 3308) {
                            int var307 = (class61.field1298.field3198 >> 7) + class141.field2582;
                            int var308 = (class61.field1298.field3159 >> 7) + class2.field26;
                            int var309 = class49.field1038;
                            class98.field1833[var7++] = (var308 << 14) + (var309 << 28) + var307;
                            continue;
                        }
                        if (var365 == 3309) {
                            var7--;
                            int var310 = class98.field1833[var7];
                            class98.field1833[var7++] = class107.method696(16383, var310 >> 14);
                            continue;
                        }
                        if (var365 == 3310) {
                            var7--;
                            int var311 = class98.field1833[var7];
                            class98.field1833[var7++] = var311 >> 28;
                            continue;
                        }
                        if (var365 == 3311) {
                            var7--;
                            int var312 = class98.field1833[var7];
                            class98.field1833[var7++] = class107.method696(16383, var312);
                            continue;
                        }
                        if (var365 == 3312) {
                            class98.field1833[var7++] = class134.field2444 ? 1 : 0;
                            continue;
                        }
                        if (var365 == 3313) {
                            var7 -= 2;
                            int var313 = class98.field1833[var7 + 1];
                            int var314 = class98.field1833[var7] + 32768;
                            class98.field1833[var7++] = class187.method1264(var313, (byte) 80, var314);
                            continue;
                        }
                        if (var365 == 3314) {
                            var7 -= 2;
                            int var315 = class98.field1833[var7] + 32768;
                            int var316 = class98.field1833[var7 + 1];
                            class98.field1833[var7++] = class207.method1382(var316, var315, (byte) -126);
                            continue;
                        }
                        if (var365 == 3315) {
                            var7 -= 2;
                            int var317 = class98.field1833[var7] + 32768;
                            int var318 = class98.field1833[var7 + 1];
                            class98.field1833[var7++] = class180.method1173(true, var317, var318);
                            continue;
                        }
                        if (var365 == 3316) {
                            if (class178.field3233 >= 2) {
                                class98.field1833[var7++] = class178.field3233;
                            } else {
                                class98.field1833[var7++] = 0;
                            }
                            continue;
                        }
                        if (var365 == 3317) {
                            class98.field1833[var7++] = class149.field2681;
                            continue;
                        }
                        if (var365 == 3318) {
                            class98.field1833[var7++] = class136.field2515;
                            continue;
                        }
                        if (var365 == 3321) {
                            class98.field1833[var7++] = class132.field2392;
                            continue;
                        }
                        if (var365 == 3322) {
                            class98.field1833[var7++] = class36.field802;
                            continue;
                        }
                        if (var365 == 3323) {
                            if (class172.field3088 >= 5 && class172.field3088 <= 9) {
                                class98.field1833[var7++] = 1;
                                continue;
                            }
                            class98.field1833[var7++] = 0;
                            continue;
                        }
                        if (var365 == 3324) {
                            if (class172.field3088 >= 5 && class172.field3088 <= 9) {
                                class98.field1833[var7++] = class172.field3088;
                                continue;
                            }
                            class98.field1833[var7++] = 0;
                            continue;
                        }
                        if (var365 == 3325) {
                            if (class132.field2394 <= 0) {
                                class98.field1833[var7++] = 0;
                            } else {
                                class98.field1833[var7++] = 1;
                            }
                            continue;
                        }
                        if (var365 == 3326) {
                            class98.field1833[var7++] = class61.field1298.field2161;
                            continue;
                        }
                        if (var365 == 3327) {
                            class98.field1833[var7++] = class61.field1298.field2167.field1851 ? 1 : 0;
                            continue;
                        }
                    } else if (var365 < 3500) {
                        if (var365 == 3400) {
                            var7 -= 2;
                            int var289 = class98.field1833[var7];
                            int var290 = class98.field1833[var7 + 1];
                            class8 var291 = class106.method693(-128, var289);
                            class78.field1529[var6++] = var291.method55(var290, 0);
                            continue;
                        }
                        if (var365 == 3408) {
                            var7 -= 4;
                            int var292 = class98.field1833[var7];
                            int var293 = class98.field1833[var7 + 1];
                            int var294 = class98.field1833[var7 + 2];
                            int var295 = class98.field1833[var7 + 3];
                            class8 var296 = class106.method693(-128, var294);
                            if (var296.field248 == var292 && var296.field246 == var293) {
                                if (var293 == 115) {
                                    class78.field1529[var6++] = var296.method55(var295, 0);
                                } else {
                                    class98.field1833[var7++] = var296.method50(var295, (byte) -57);
                                }
                                continue;
                            }
                            if (var293 == 115) {
                                class78.field1529[var6++] = class43.field937;
                            } else {
                                class98.field1833[var7++] = 0;
                            }
                            continue;
                        }
                    } else if (var365 < 3700) {
                        if (var365 == 3600) {
                            if (class241.field4432 == 0) {
                                class98.field1833[var7++] = -2;
                            } else if (class241.field4432 == 1) {
                                class98.field1833[var7++] = -1;
                            } else {
                                class98.field1833[var7++] = class202.field3741;
                            }
                            continue;
                        }
                        if (var365 == 3601) {
                            var7--;
                            int var78 = class98.field1833[var7];
                            if (class241.field4432 == 2 && var78 < class202.field3741) {
                                class78.field1529[var6++] = class152.field2743[var78];
                                continue;
                            }
                            class78.field1529[var6++] = class91.field1735;
                            continue;
                        }
                        if (var365 == 3602) {
                            var7--;
                            int var79 = class98.field1833[var7];
                            if (class241.field4432 == 2 && var79 < class202.field3741) {
                                class98.field1833[var7++] = class10.field288[var79];
                                continue;
                            }
                            class98.field1833[var7++] = 0;
                            continue;
                        }
                        if (var365 == 3603) {
                            var7--;
                            int var80 = class98.field1833[var7];
                            if (class241.field4432 == 2 && var80 < class202.field3741) {
                                class98.field1833[var7++] = class139.field2569[var80];
                                continue;
                            }
                            class98.field1833[var7++] = 0;
                            continue;
                        }
                        if (var365 == 3604) {
                            var6--;
                            class179 var81 = class78.field1529[var6];
                            var7--;
                            int var82 = class98.field1833[var7];
                            class95.method612(10074, var82, var81);
                            continue;
                        }
                        if (var365 == 3605) {
                            var6--;
                            class179 var83 = class78.field1529[var6];
                            class46.method313((byte) -118, var83.method1137(78));
                            continue;
                        }
                        if (var365 == 3606) {
                            var6--;
                            class179 var84 = class78.field1529[var6];
                            class237.method1539((byte) -116, var84.method1137(113));
                            continue;
                        }
                        if (var365 == 3607) {
                            var6--;
                            class179 var85 = class78.field1529[var6];
                            class64.method425(var85.method1137(71), (byte) 12);
                            continue;
                        }
                        if (var365 == 3608) {
                            var6--;
                            class179 var86 = class78.field1529[var6];
                            class113.method725(0, var86.method1137(109));
                            continue;
                        }
                        if (var365 == 3609) {
                            var6--;
                            class179 var87 = class78.field1529[var6];
                            if (var87.method1155(class44.field954, -1721) || var87.method1155(class6.field92, -1721)) {
                                var87 = var87.method1162((byte) 110, 7);
                            }
                            class98.field1833[var7++] = class155.method991(var87, 127) ? 1 : 0;
                            continue;
                        }
                        if (var365 == 3610) {
                            var7--;
                            int var88 = class98.field1833[var7];
                            if (class241.field4432 == 2 && var88 < class202.field3741) {
                                class78.field1529[var6++] = class237.field4372[var88];
                                continue;
                            }
                            class78.field1529[var6++] = class91.field1735;
                            continue;
                        }
                        if (var365 == 3611) {
                            if (class117.field2202 == null) {
                                class78.field1529[var6++] = class91.field1735;
                            } else {
                                class78.field1529[var6++] = class117.field2202.method1140((byte) 32);
                            }
                            continue;
                        }
                        if (var365 == 3612) {
                            if (class117.field2202 == null) {
                                class98.field1833[var7++] = 0;
                            } else {
                                class98.field1833[var7++] = class162.field2924;
                            }
                            continue;
                        }
                        if (var365 == 3613) {
                            var7--;
                            int var89 = class98.field1833[var7];
                            if (class117.field2202 != null && class162.field2924 > var89) {
                                class78.field1529[var6++] = class155.field2786[var89].field4433.method1140((byte) 32);
                                continue;
                            }
                            class78.field1529[var6++] = class91.field1735;
                            continue;
                        }
                        if (var365 == 3614) {
                            var7--;
                            int var90 = class98.field1833[var7];
                            if (class117.field2202 != null && class162.field2924 > var90) {
                                class98.field1833[var7++] = class155.field2786[var90].field4437;
                                continue;
                            }
                            class98.field1833[var7++] = 0;
                            continue;
                        }
                        if (var365 == 3615) {
                            var7--;
                            int var91 = class98.field1833[var7];
                            if (class117.field2202 != null && class162.field2924 > var91) {
                                class98.field1833[var7++] = class155.field2786[var91].field4425;
                                continue;
                            }
                            class98.field1833[var7++] = 0;
                            continue;
                        }
                        if (var365 == 3616) {
                            class98.field1833[var7++] = class199.field3711;
                            continue;
                        }
                        if (var365 == 3617) {
                            var6--;
                            class179 var92 = class78.field1529[var6];
                            class46.method312(121, var92);
                            continue;
                        }
                        if (var365 == 3618) {
                            class98.field1833[var7++] = class198.field3692;
                            continue;
                        }
                        if (var365 == 3619) {
                            var6--;
                            class179 var93 = class78.field1529[var6];
                            class44.method294(var93.method1137(120), (byte) 71);
                            continue;
                        }
                        if (var365 == 3620) {
                            class60.method404(106);
                            continue;
                        }
                        if (var365 == 3621) {
                            if (class241.field4432 == 0) {
                                class98.field1833[var7++] = -1;
                            } else {
                                class98.field1833[var7++] = class98.field1840;
                            }
                            continue;
                        }
                        if (var365 == 3622) {
                            var7--;
                            int var94 = class98.field1833[var7];
                            if (class241.field4432 != 0 && class98.field1840 > var94) {
                                class78.field1529[var6++] = class12.method82(4, class237.field4358[var94]).method1140((byte) 32);
                                continue;
                            }
                            class78.field1529[var6++] = class91.field1735;
                            continue;
                        }
                        if (var365 == 3623) {
                            var6--;
                            class179 var95 = class78.field1529[var6];
                            if (var95.method1155(class44.field954, -1721) || var95.method1155(class6.field92, -1721)) {
                                var95 = var95.method1162((byte) 121, 7);
                            }
                            class98.field1833[var7++] = class7.method49(var95, 0) ? 1 : 0;
                            continue;
                        }
                        if (var365 == 3624) {
                            var7--;
                            int var96 = class98.field1833[var7];
                            if (class155.field2786 != null && var96 < class162.field2924 && class155.field2786[var96].field4433.method1138(false, class61.field1298.field2168)) {
                                class98.field1833[var7++] = 1;
                                continue;
                            }
                            class98.field1833[var7++] = 0;
                            continue;
                        }
                        if (var365 == 3625) {
                            if (class46.field1016 == null) {
                                class78.field1529[var6++] = class91.field1735;
                            } else {
                                class78.field1529[var6++] = class46.field1016.method1140((byte) 32);
                            }
                            continue;
                        }
                        if (var365 == 3626) {
                            var7--;
                            int var97 = class98.field1833[var7];
                            if (class117.field2202 != null && class162.field2924 > var97) {
                                class78.field1529[var6++] = class155.field2786[var97].field4426;
                                continue;
                            }
                            class78.field1529[var6++] = class91.field1735;
                            continue;
                        }
                    } else if (var365 < 4000) {
                        if (var365 == 3903) {
                            var7--;
                            int var275 = class98.field1833[var7];
                            class98.field1833[var7++] = class85.field1640[var275].method882(2);
                            continue;
                        }
                        if (var365 == 3904) {
                            var7--;
                            int var276 = class98.field1833[var7];
                            class98.field1833[var7++] = class85.field1640[var276].field2571;
                            continue;
                        }
                        if (var365 == 3905) {
                            var7--;
                            int var277 = class98.field1833[var7];
                            class98.field1833[var7++] = class85.field1640[var277].field2558;
                            continue;
                        }
                        if (var365 == 3906) {
                            var7--;
                            int var278 = class98.field1833[var7];
                            class98.field1833[var7++] = class85.field1640[var278].field2563;
                            continue;
                        }
                        if (var365 == 3907) {
                            var7--;
                            int var279 = class98.field1833[var7];
                            class98.field1833[var7++] = class85.field1640[var279].field2561;
                            continue;
                        }
                        if (var365 == 3908) {
                            var7--;
                            int var280 = class98.field1833[var7];
                            class98.field1833[var7++] = class85.field1640[var280].field2565;
                            continue;
                        }
                        if (var365 == 3910) {
                            var7--;
                            int var281 = class98.field1833[var7];
                            int var282 = class85.field1640[var281].method881(-87);
                            class98.field1833[var7++] = var282 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var365 == 3911) {
                            var7--;
                            int var283 = class98.field1833[var7];
                            int var284 = class85.field1640[var283].method881(-49);
                            class98.field1833[var7++] = var284 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var365 == 3912) {
                            var7--;
                            int var285 = class98.field1833[var7];
                            int var286 = class85.field1640[var285].method881(-112);
                            class98.field1833[var7++] = var286 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var365 == 3913) {
                            var7--;
                            int var287 = class98.field1833[var7];
                            int var288 = class85.field1640[var287].method881(-34);
                            class98.field1833[var7++] = var288 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var365 < 4100) {
                        if (var365 == 4000) {
                            var7 -= 2;
                            int var98 = class98.field1833[var7];
                            int var99 = class98.field1833[var7 + 1];
                            class98.field1833[var7++] = var98 + var99;
                            continue;
                        }
                        if (var365 == 4001) {
                            var7 -= 2;
                            int var100 = class98.field1833[var7];
                            int var101 = class98.field1833[var7 + 1];
                            class98.field1833[var7++] = var100 - var101;
                            continue;
                        }
                        if (var365 == 4002) {
                            var7 -= 2;
                            int var102 = class98.field1833[var7];
                            int var103 = class98.field1833[var7 + 1];
                            class98.field1833[var7++] = var102 * var103;
                            continue;
                        }
                        if (var365 == 4003) {
                            var7 -= 2;
                            int var104 = class98.field1833[var7];
                            int var105 = class98.field1833[var7 + 1];
                            class98.field1833[var7++] = var104 / var105;
                            continue;
                        }
                        if (var365 == 4004) {
                            var7--;
                            int var106 = class98.field1833[var7];
                            class98.field1833[var7++] = (int) ((double) var106 * Math.random());
                            continue;
                        }
                        if (var365 == 4005) {
                            var7--;
                            int var107 = class98.field1833[var7];
                            class98.field1833[var7++] = (int) ((double) (var107 + 1) * Math.random());
                            continue;
                        }
                        if (var365 == 4006) {
                            var7 -= 5;
                            int var108 = class98.field1833[var7 + 2];
                            int var109 = class98.field1833[var7];
                            int var110 = class98.field1833[var7 + 1];
                            int var111 = class98.field1833[var7 + 3];
                            int var112 = class98.field1833[var7 + 4];
                            class98.field1833[var7++] = (var112 - var108) * (-var109 + var110) / (var111 - var108) + var109;
                            continue;
                        }
                        if (var365 == 4007) {
                            var7 -= 2;
                            long var113 = (long) class98.field1833[var7 + 1];
                            long var115 = (long) class98.field1833[var7];
                            class98.field1833[var7++] = (int) (var113 * var115 / 100L + var115);
                            continue;
                        }
                        if (var365 == 4008) {
                            var7 -= 2;
                            int var117 = class98.field1833[var7];
                            int var118 = class98.field1833[var7 + 1];
                            class98.field1833[var7++] = class125.method790(var117, 0x1 << var118);
                            continue;
                        }
                        if (var365 == 4009) {
                            var7 -= 2;
                            int var119 = class98.field1833[var7];
                            int var120 = class98.field1833[var7 + 1];
                            class98.field1833[var7++] = class107.method696(var119, -(0x1 << var120) - 1);
                            continue;
                        }
                        if (var365 == 4010) {
                            var7 -= 2;
                            int var121 = class98.field1833[var7];
                            int var122 = class98.field1833[var7 + 1];
                            class98.field1833[var7++] = class107.method696(var121, 0x1 << var122) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var365 == 4011) {
                            var7 -= 2;
                            int var123 = class98.field1833[var7 + 1];
                            int var124 = class98.field1833[var7];
                            class98.field1833[var7++] = var124 % var123;
                            continue;
                        }
                        if (var365 == 4012) {
                            var7 -= 2;
                            int var125 = class98.field1833[var7];
                            int var126 = class98.field1833[var7 + 1];
                            if (var125 == 0) {
                                class98.field1833[var7++] = 0;
                            } else {
                                class98.field1833[var7++] = (int) Math.pow((double) var125, (double) var126);
                            }
                            continue;
                        }
                        if (var365 == 4013) {
                            var7 -= 2;
                            int var127 = class98.field1833[var7];
                            int var128 = class98.field1833[var7 + 1];
                            if (var127 == 0) {
                                class98.field1833[var7++] = 0;
                            } else if (var128 == 0) {
                                class98.field1833[var7++] = Integer.MAX_VALUE;
                            } else {
                                class98.field1833[var7++] = (int) Math.pow((double) var127, 1.0D / (double) var128);
                            }
                            continue;
                        }
                        if (var365 == 4014) {
                            var7 -= 2;
                            int var129 = class98.field1833[var7];
                            int var130 = class98.field1833[var7 + 1];
                            class98.field1833[var7++] = class107.method696(var130, var129);
                            continue;
                        }
                        if (var365 == 4015) {
                            var7 -= 2;
                            int var131 = class98.field1833[var7 + 1];
                            int var132 = class98.field1833[var7];
                            class98.field1833[var7++] = class125.method790(var131, var132);
                            continue;
                        }
                        if (var365 == 4016) {
                            var7 -= 2;
                            int var133 = class98.field1833[var7];
                            int var134 = class98.field1833[var7 + 1];
                            class98.field1833[var7++] = var133 >= var134 ? var134 : var133;
                            continue;
                        }
                        if (var365 == 4017) {
                            var7 -= 2;
                            int var135 = class98.field1833[var7];
                            int var136 = class98.field1833[var7 + 1];
                            class98.field1833[var7++] = var135 <= var136 ? var136 : var135;
                            continue;
                        }
                        if (var365 == 4018) {
                            var7 -= 3;
                            long var137 = (long) class98.field1833[var7];
                            long var139 = (long) class98.field1833[var7 + 1];
                            long var141 = (long) class98.field1833[var7 + 2];
                            class98.field1833[var7++] = (int) (var137 * var141 / var139);
                            continue;
                        }
                    } else if (var365 < 4200) {
                        if (var365 == 4100) {
                            var6--;
                            class179 var143 = class78.field1529[var6];
                            var7--;
                            int var144 = class98.field1833[var7];
                            class78.field1529[var6++] = class78.method502((byte) -104, new class179[] { var143, class148.method949((byte) -14, var144) });
                            continue;
                        }
                        if (var365 == 4101) {
                            var6 -= 2;
                            class179 var145 = class78.field1529[var6];
                            class179 var146 = class78.field1529[var6 + 1];
                            class78.field1529[var6++] = class78.method502((byte) -108, new class179[] { var145, var146 });
                            continue;
                        }
                        if (var365 == 4102) {
                            var6--;
                            class179 var147 = class78.field1529[var6];
                            var7--;
                            int var148 = class98.field1833[var7];
                            class78.field1529[var6++] = class78.method502((byte) -100, new class179[] { var147, class44.method291(112, var148, true) });
                            continue;
                        }
                        if (var365 == 4103) {
                            var6--;
                            class179 var149 = class78.field1529[var6];
                            class78.field1529[var6++] = var149.method1170(40);
                            continue;
                        }
                        if (var365 == 4104) {
                            var7--;
                            int var150 = class98.field1833[var7];
                            long var151 = (long) var150 * 86400000L + 1014768000000L;
                            class52.field1142.setTime(new Date(var151));
                            int var153 = class52.field1142.get(5);
                            int var154 = class52.field1142.get(2);
                            int var155 = class52.field1142.get(1);
                            class78.field1529[var6++] = class78.method502((byte) -95, new class179[] { class148.method949((byte) -14, var153), class215.field3984, class90.field1706[var154], class215.field3984, class148.method949((byte) -14, var155) });
                            continue;
                        }
                        if (var365 == 4105) {
                            var6 -= 2;
                            class179 var156 = class78.field1529[var6];
                            class179 var157 = class78.field1529[var6 + 1];
                            if (class61.field1298.field2167 != null && class61.field1298.field2167.field1851) {
                                class78.field1529[var6++] = var157;
                                continue;
                            }
                            class78.field1529[var6++] = var156;
                            continue;
                        }
                        if (var365 == 4106) {
                            var7--;
                            int var158 = class98.field1833[var7];
                            class78.field1529[var6++] = class148.method949((byte) -14, var158);
                            continue;
                        }
                        if (var365 == 4107) {
                            var6 -= 2;
                            class98.field1833[var7++] = class78.field1529[var6].method1124(class78.field1529[var6 + 1], false);
                            continue;
                        }
                        if (var365 == 4108) {
                            var6--;
                            class179 var159 = class78.field1529[var6];
                            var7 -= 2;
                            int var160 = class98.field1833[var7 + 1];
                            int var161 = class98.field1833[var7];
                            byte[] var162 = class86.field1648.method342(0, var160, (byte) 88);
                            class65 var163 = new class65(var162);
                            var163.method1001(class202.field3748, null);
                            class98.field1833[var7++] = var163.method997(var159, var161);
                            continue;
                        }
                        if (var365 == 4109) {
                            var6--;
                            class179 var164 = class78.field1529[var6];
                            var7 -= 2;
                            int var165 = class98.field1833[var7];
                            int var166 = class98.field1833[var7 + 1];
                            byte[] var167 = class86.field1648.method342(0, var166, (byte) -89);
                            class65 var168 = new class65(var167);
                            var168.method1001(class202.field3748, null);
                            class98.field1833[var7++] = var168.method1010(var164, var165);
                            continue;
                        }
                        if (var365 == 4110) {
                            var6 -= 2;
                            class179 var169 = class78.field1529[var6 + 1];
                            class179 var170 = class78.field1529[var6];
                            var7--;
                            if (class98.field1833[var7] == 1) {
                                class78.field1529[var6++] = var170;
                            } else {
                                class78.field1529[var6++] = var169;
                            }
                            continue;
                        }
                        if (var365 == 4111) {
                            var6--;
                            class179 var171 = class78.field1529[var6];
                            class78.field1529[var6++] = class156.method1013(var171);
                            continue;
                        }
                        if (var365 == 4112) {
                            var7--;
                            int var172 = class98.field1833[var7];
                            var6--;
                            class179 var173 = class78.field1529[var6];
                            if (var172 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class78.field1529[var6++] = var173.method1141((byte) -125, var172);
                            continue;
                        }
                        if (var365 == 4113) {
                            var7--;
                            int var174 = class98.field1833[var7];
                            class98.field1833[var7++] = class85.method574(true, var174) ? 1 : 0;
                            continue;
                        }
                        if (var365 == 4114) {
                            var7--;
                            int var175 = class98.field1833[var7];
                            class98.field1833[var7++] = class124.method782(var175, false) ? 1 : 0;
                            continue;
                        }
                        if (var365 == 4115) {
                            var7--;
                            int var176 = class98.field1833[var7];
                            class98.field1833[var7++] = class100.method636((byte) 0, var176) ? 1 : 0;
                            continue;
                        }
                        if (var365 == 4116) {
                            var7--;
                            int var177 = class98.field1833[var7];
                            class98.field1833[var7++] = class215.method1413(0, var177) ? 1 : 0;
                            continue;
                        }
                        if (var365 == 4117) {
                            var6--;
                            class179 var178 = class78.field1529[var6];
                            if (var178 == null) {
                                class98.field1833[var7++] = 0;
                            } else {
                                class98.field1833[var7++] = var178.method1168(true);
                            }
                            continue;
                        }
                        if (var365 == 4118) {
                            var7 -= 2;
                            var6--;
                            class179 var179 = class78.field1529[var6];
                            int var180 = class98.field1833[var7];
                            int var181 = class98.field1833[var7 + 1];
                            class78.field1529[var6++] = var179.method1156(-5684, var181, var180);
                            continue;
                        }
                        if (var365 == 4119) {
                            var6--;
                            class179 var182 = class78.field1529[var6];
                            boolean var183 = false;
                            class179 var184 = class117.method752(var182.method1168(true), 0);
                            for (int var185 = 0; var185 < var182.method1168(true); var185++) {
                                int var186 = var182.method1161(var185, (byte) -111);
                                if (var186 == 60) {
                                    var183 = true;
                                } else if (var186 == 62) {
                                    var183 = false;
                                } else if (!var183) {
                                    var184.method1149((byte) 126, var186);
                                }
                            }
                            var184.method1150(0);
                            class78.field1529[var6++] = var184;
                            continue;
                        }
                        if (var365 == 4120) {
                            var6--;
                            class179 var187 = class78.field1529[var6];
                            var7 -= 2;
                            int var188 = class98.field1833[var7 + 1];
                            int var189 = class98.field1833[var7];
                            class98.field1833[var7++] = var187.method1122(var188, var189, -1);
                            continue;
                        }
                        if (var365 == 4121) {
                            var6 -= 2;
                            class179 var190 = class78.field1529[var6 + 1];
                            class179 var191 = class78.field1529[var6];
                            var7--;
                            int var192 = class98.field1833[var7];
                            class98.field1833[var7++] = var191.method1125(var190, 99, var192);
                            continue;
                        }
                        if (var365 == 4122) {
                            var7--;
                            int var193 = class98.field1833[var7];
                            class98.field1833[var7++] = class171.method1083(-223, var193);
                            continue;
                        }
                        if (var365 == 4123) {
                            var7--;
                            int var194 = class98.field1833[var7];
                            class98.field1833[var7++] = class131.method839(107, var194);
                            continue;
                        }
                    } else if (var365 < 4300) {
                        if (var365 == 4200) {
                            var7--;
                            int var195 = class98.field1833[var7];
                            class78.field1529[var6++] = class131.method835((byte) -20, var195).field418;
                            continue;
                        }
                        if (var365 == 4201) {
                            var7 -= 2;
                            int var196 = class98.field1833[var7];
                            int var197 = class98.field1833[var7 + 1];
                            class15 var198 = class131.method835((byte) -20, var196);
                            if (var197 >= 1 && var197 <= 5 && var198.field392[var197 - 1] != null) {
                                class78.field1529[var6++] = var198.field392[var197 - 1];
                                continue;
                            }
                            class78.field1529[var6++] = class91.field1735;
                            continue;
                        }
                        if (var365 == 4202) {
                            var7 -= 2;
                            int var199 = class98.field1833[var7];
                            int var200 = class98.field1833[var7 + 1];
                            class15 var201 = class131.method835((byte) -20, var199);
                            if (var200 >= 1 && var200 <= 5 && var201.field381[var200 - 1] != null) {
                                class78.field1529[var6++] = var201.field381[var200 - 1];
                                continue;
                            }
                            class78.field1529[var6++] = class91.field1735;
                            continue;
                        }
                        if (var365 == 4203) {
                            var7--;
                            int var202 = class98.field1833[var7];
                            class98.field1833[var7++] = class131.method835((byte) -20, var202).field406;
                            continue;
                        }
                        if (var365 == 4204) {
                            var7--;
                            int var203 = class98.field1833[var7];
                            class98.field1833[var7++] = class131.method835((byte) -20, var203).field430 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var365 == 4205) {
                            var7--;
                            int var204 = class98.field1833[var7];
                            class15 var205 = class131.method835((byte) -20, var204);
                            if (var205.field431 == -1 && var205.field370 >= 0) {
                                class98.field1833[var7++] = var205.field370;
                                continue;
                            }
                            class98.field1833[var7++] = var204;
                            continue;
                        }
                        if (var365 == 4206) {
                            var7--;
                            int var206 = class98.field1833[var7];
                            class15 var207 = class131.method835((byte) -20, var206);
                            if (var207.field431 >= 0 && var207.field370 >= 0) {
                                class98.field1833[var7++] = var207.field370;
                                continue;
                            }
                            class98.field1833[var7++] = var206;
                            continue;
                        }
                        if (var365 == 4207) {
                            var7--;
                            int var208 = class98.field1833[var7];
                            class98.field1833[var7++] = class131.method835((byte) -20, var208).field408 ? 1 : 0;
                            continue;
                        }
                        if (var365 == 4210) {
                            var6--;
                            class179 var209 = class78.field1529[var6];
                            var7--;
                            int var210 = class98.field1833[var7];
                            class151.method962(var210 == 1, var209, (byte) -91);
                            class98.field1833[var7++] = class110.field2055;
                            continue;
                        }
                        if (var365 == 4211) {
                            if (class162.field2928 != null && class236.field4343 < class110.field2055) {
                                class98.field1833[var7++] = class107.method696(65535, class162.field2928[class236.field4343++]);
                                continue;
                            }
                            class98.field1833[var7++] = -1;
                            continue;
                        }
                        if (var365 == 4212) {
                            class236.field4343 = 0;
                            continue;
                        }
                    } else if (var365 < 5100) {
                        if (var365 == 5000) {
                            class98.field1833[var7++] = class108.field2020;
                            continue;
                        }
                        if (var365 == 5001) {
                            class131.field2390++;
                            var7 -= 3;
                            class108.field2020 = class98.field1833[var7];
                            class95.field1784 = class98.field1833[var7 + 1];
                            class42.field876 = class98.field1833[var7 + 2];
                            class81.field1564.method70((byte) -62, 38);
                            class81.field1564.method1230((byte) -96, class108.field2020);
                            class81.field1564.method1230((byte) -70, class95.field1784);
                            class81.field1564.method1230((byte) -51, class42.field876);
                            continue;
                        }
                        if (var365 == 5002) {
                            class237.field4374++;
                            var7 -= 2;
                            var6--;
                            class179 var214 = class78.field1529[var6];
                            int var215 = class98.field1833[var7];
                            int var216 = class98.field1833[var7 + 1];
                            class81.field1564.method70((byte) -62, 27);
                            class81.field1564.method1232(var214.method1137(122), (byte) 124);
                            class81.field1564.method1230((byte) -127, var215 - 1);
                            class81.field1564.method1230((byte) -78, var216);
                            continue;
                        }
                        if (var365 == 5003) {
                            var7--;
                            int var217 = class98.field1833[var7];
                            class179 var218 = null;
                            if (var217 < 100) {
                                var218 = class36.field795[var217];
                            }
                            if (var218 == null) {
                                var218 = class91.field1735;
                            }
                            class78.field1529[var6++] = var218;
                            continue;
                        }
                        if (var365 == 5004) {
                            var7--;
                            int var219 = class98.field1833[var7];
                            int var220 = -1;
                            if (var219 < 100 && class36.field795[var219] != null) {
                                var220 = class96.field1813[var219];
                            }
                            class98.field1833[var7++] = var220;
                            continue;
                        }
                        if (var365 == 5005) {
                            class98.field1833[var7++] = class95.field1784;
                            continue;
                        }
                        if (var365 == 5008) {
                            var6--;
                            class179 var221 = class78.field1529[var6];
                            if (var221.method1155(class10.field282, -1721)) {
                                class219.method1428((byte) 38, var221);
                            } else {
                                class160.field2901++;
                                byte var222 = 0;
                                byte var223 = 0;
                                class179 var224 = var221.method1170(40);
                                if (var224.method1155(class180.field3318, -1721)) {
                                    var221 = var221.method1162((byte) 119, class180.field3318.method1168(true));
                                    var223 = 0;
                                } else if (var224.method1155(class197.field3673, -1721)) {
                                    var223 = 1;
                                    var221 = var221.method1162((byte) 127, class197.field3673.method1168(true));
                                } else if (var224.method1155(class6.field101, -1721)) {
                                    var223 = 2;
                                    var221 = var221.method1162((byte) 105, class6.field101.method1168(true));
                                } else if (var224.method1155(class155.field2776, -1721)) {
                                    var221 = var221.method1162((byte) 118, class155.field2776.method1168(true));
                                    var223 = 3;
                                } else if (var224.method1155(class33.field722, -1721)) {
                                    var221 = var221.method1162((byte) 106, class33.field722.method1168(true));
                                    var223 = 4;
                                } else if (var224.method1155(class147.field2663, -1721)) {
                                    var221 = var221.method1162((byte) 111, class147.field2663.method1168(true));
                                    var223 = 5;
                                } else if (var224.method1155(class192.field3577, -1721)) {
                                    var221 = var221.method1162((byte) 99, class192.field3577.method1168(true));
                                    var223 = 6;
                                } else if (var224.method1155(class236.field4355, -1721)) {
                                    var223 = 7;
                                    var221 = var221.method1162((byte) 125, class236.field4355.method1168(true));
                                } else if (var224.method1155(class116.field2186, -1721)) {
                                    var223 = 8;
                                    var221 = var221.method1162((byte) 98, class116.field2186.method1168(true));
                                } else if (var224.method1155(class110.field2051, -1721)) {
                                    var221 = var221.method1162((byte) 96, class110.field2051.method1168(true));
                                    var223 = 9;
                                } else if (var224.method1155(class241.field4435, -1721)) {
                                    var221 = var221.method1162((byte) 121, class241.field4435.method1168(true));
                                    var223 = 10;
                                } else if (var224.method1155(class211.field3931, -1721)) {
                                    var223 = 11;
                                    var221 = var221.method1162((byte) 127, class211.field3931.method1168(true));
                                } else if (class113.field2129 != 0) {
                                    if (var224.method1155(class180.field3302, -1721)) {
                                        var221 = var221.method1162((byte) 119, class180.field3302.method1168(true));
                                        var223 = 0;
                                    } else if (var224.method1155(class197.field3654, -1721)) {
                                        var221 = var221.method1162((byte) 109, class197.field3654.method1168(true));
                                        var223 = 1;
                                    } else if (var224.method1155(class6.field185, -1721)) {
                                        var221 = var221.method1162((byte) 93, class6.field185.method1168(true));
                                        var223 = 2;
                                    } else if (var224.method1155(class155.field2788, -1721)) {
                                        var221 = var221.method1162((byte) 117, class155.field2788.method1168(true));
                                        var223 = 3;
                                    } else if (var224.method1155(class33.field720, -1721)) {
                                        var223 = 4;
                                        var221 = var221.method1162((byte) 126, class33.field720.method1168(true));
                                    } else if (var224.method1155(class147.field2662, -1721)) {
                                        var223 = 5;
                                        var221 = var221.method1162((byte) 99, class147.field2662.method1168(true));
                                    } else if (var224.method1155(class192.field3578, -1721)) {
                                        var223 = 6;
                                        var221 = var221.method1162((byte) 117, class192.field3578.method1168(true));
                                    } else if (var224.method1155(class236.field4347, -1721)) {
                                        var223 = 7;
                                        var221 = var221.method1162((byte) 118, class236.field4347.method1168(true));
                                    } else if (var224.method1155(class116.field2187, -1721)) {
                                        var223 = 8;
                                        var221 = var221.method1162((byte) 103, class116.field2187.method1168(true));
                                    } else if (var224.method1155(class110.field2057, -1721)) {
                                        var221 = var221.method1162((byte) 95, class110.field2057.method1168(true));
                                        var223 = 9;
                                    } else if (var224.method1155(class241.field4428, -1721)) {
                                        var221 = var221.method1162((byte) 101, class241.field4428.method1168(true));
                                        var223 = 10;
                                    } else if (var224.method1155(class211.field3942, -1721)) {
                                        var223 = 11;
                                        var221 = var221.method1162((byte) 99, class211.field3942.method1168(true));
                                    }
                                }
                                class179 var225 = var221.method1170(40);
                                if (var225.method1155(class7.field235, -1721)) {
                                    var221 = var221.method1162((byte) 98, class7.field235.method1168(true));
                                    var222 = 1;
                                } else if (var225.method1155(class100.field1850, -1721)) {
                                    var222 = 2;
                                    var221 = var221.method1162((byte) 103, class100.field1850.method1168(true));
                                } else if (var225.method1155(class159.field2898, -1721)) {
                                    var222 = 3;
                                    var221 = var221.method1162((byte) 124, class159.field2898.method1168(true));
                                } else if (var225.method1155(class191.field3556, -1721)) {
                                    var221 = var221.method1162((byte) 94, class191.field3556.method1168(true));
                                    var222 = 4;
                                } else if (var225.method1155(class8.field241, -1721)) {
                                    var222 = 5;
                                    var221 = var221.method1162((byte) 103, class8.field241.method1168(true));
                                } else if (class113.field2129 != 0) {
                                    if (var225.method1155(class7.field234, -1721)) {
                                        var221 = var221.method1162((byte) 106, class7.field234.method1168(true));
                                        var222 = 1;
                                    } else if (var225.method1155(class100.field1872, -1721)) {
                                        var221 = var221.method1162((byte) 98, class100.field1872.method1168(true));
                                        var222 = 2;
                                    } else if (var225.method1155(class159.field2897, -1721)) {
                                        var222 = 3;
                                        var221 = var221.method1162((byte) 127, class159.field2897.method1168(true));
                                    } else if (var225.method1155(class191.field3566, -1721)) {
                                        var221 = var221.method1162((byte) 114, class191.field3566.method1168(true));
                                        var222 = 4;
                                    } else if (var225.method1155(class8.field254, -1721)) {
                                        var222 = 5;
                                        var221 = var221.method1162((byte) 93, class8.field254.method1168(true));
                                    }
                                }
                                class81.field1564.method70((byte) -62, 51);
                                class81.field1564.method1230((byte) -55, 0);
                                int var226 = class81.field1564.field3432;
                                class81.field1564.method1230((byte) -102, var223);
                                class81.field1564.method1230((byte) -68, var222);
                                class150.method957(class81.field1564, -22313, var221);
                                class81.field1564.method1238(Integer.MAX_VALUE, class81.field1564.field3432 - var226);
                            }
                            continue;
                        }
                        if (var365 == 5009) {
                            var6 -= 2;
                            class115.field2160++;
                            class179 var227 = class78.field1529[var6 + 1];
                            class179 var228 = class78.field1529[var6];
                            class81.field1564.method70((byte) -62, 31);
                            class81.field1564.method1230((byte) -95, 0);
                            int var229 = class81.field1564.field3432;
                            class81.field1564.method1232(var228.method1137(112), (byte) 124);
                            class150.method957(class81.field1564, -22313, var227);
                            class81.field1564.method1238(Integer.MAX_VALUE, class81.field1564.field3432 - var229);
                            continue;
                        }
                        if (var365 == 5010) {
                            var7--;
                            int var230 = class98.field1833[var7];
                            class179 var231 = null;
                            if (var230 < 100) {
                                var231 = class113.field2122[var230];
                            }
                            if (var231 == null) {
                                var231 = class91.field1735;
                            }
                            class78.field1529[var6++] = var231;
                            continue;
                        }
                        if (var365 == 5011) {
                            var7--;
                            int var232 = class98.field1833[var7];
                            class179 var233 = null;
                            if (var232 < 100) {
                                var233 = class13.field327[var232];
                            }
                            if (var233 == null) {
                                var233 = class91.field1735;
                            }
                            class78.field1529[var6++] = var233;
                            continue;
                        }
                        if (var365 == 5012) {
                            var7--;
                            int var234 = class98.field1833[var7];
                            int var235 = -1;
                            if (var234 < 100) {
                                var235 = class10.field291[var234];
                            }
                            class98.field1833[var7++] = var235;
                            continue;
                        }
                        if (var365 == 5015) {
                            class179 var236;
                            if (class61.field1298 == null || class61.field1298.field2168 == null) {
                                var236 = class232.field4286;
                            } else {
                                var236 = class61.field1298.field2168;
                            }
                            class78.field1529[var6++] = var236;
                            continue;
                        }
                        if (var365 == 5016) {
                            class98.field1833[var7++] = class42.field876;
                            continue;
                        }
                        if (var365 == 5017) {
                            class98.field1833[var7++] = class241.field4424;
                            continue;
                        }
                        if (var365 == 5050) {
                            var7--;
                            int var237 = class98.field1833[var7];
                            class78.field1529[var6++] = class117.method751(var237, true).field1274;
                            continue;
                        }
                        if (var365 == 5051) {
                            var7--;
                            int var238 = class98.field1833[var7];
                            class59 var239 = class117.method751(var238, true);
                            if (var239.field1261 == null) {
                                class98.field1833[var7++] = 0;
                            } else {
                                class98.field1833[var7++] = var239.field1261.length;
                            }
                            continue;
                        }
                        if (var365 == 5052) {
                            var7 -= 2;
                            int var240 = class98.field1833[var7 + 1];
                            int var241 = class98.field1833[var7];
                            class98.field1833[var7++] = class117.method751(var241, true).field1261[var240];
                            continue;
                        }
                        if (var365 == 5053) {
                            var7--;
                            int var242 = class98.field1833[var7];
                            class59 var243 = class117.method751(var242, true);
                            if (var243.field1268 == null) {
                                class98.field1833[var7++] = 0;
                            } else {
                                class98.field1833[var7++] = var243.field1268.length;
                            }
                            continue;
                        }
                        if (var365 == 5054) {
                            var7 -= 2;
                            int var244 = class98.field1833[var7];
                            int var245 = class98.field1833[var7 + 1];
                            class98.field1833[var7++] = class117.method751(var244, true).field1268[var245];
                            continue;
                        }
                        if (var365 == 5055) {
                            var7--;
                            int var246 = class98.field1833[var7];
                            class78.field1529[var6++] = class238.method1543(83, var246).method838(-20316);
                            continue;
                        }
                        if (var365 == 5056) {
                            var7--;
                            int var247 = class98.field1833[var7];
                            class131 var248 = class238.method1543(36, var247);
                            if (var248.field2368 == null) {
                                class98.field1833[var7++] = 0;
                            } else {
                                class98.field1833[var7++] = var248.field2368.length;
                            }
                            continue;
                        }
                        if (var365 == 5057) {
                            var7 -= 2;
                            int var249 = class98.field1833[var7];
                            int var250 = class98.field1833[var7 + 1];
                            class98.field1833[var7++] = class238.method1543(68, var249).field2368[var250];
                            continue;
                        }
                        if (var365 == 5058) {
                            class109.field2045 = new class183();
                            var7--;
                            class109.field2045.field3375 = class98.field1833[var7];
                            class109.field2045.field3377 = class238.method1543(92, class109.field2045.field3375);
                            class109.field2045.field3379 = new int[class109.field2045.field3377.method834(-21868)];
                            continue;
                        }
                        if (var365 == 5059) {
                            class81.field1564.method70((byte) -62, 119);
                            class5.field64++;
                            class81.field1564.method1230((byte) -55, 0);
                            int var251 = class81.field1564.field3432;
                            class81.field1564.method1230((byte) -50, 0);
                            class81.field1564.method1222((byte) -81, class109.field2045.field3375);
                            class109.field2045.field3377.method842(class81.field1564, class109.field2045.field3379, (byte) -18);
                            class81.field1564.method1238(Integer.MAX_VALUE, class81.field1564.field3432 - var251);
                            continue;
                        }
                        if (var365 == 5060) {
                            class160.field2902++;
                            var6--;
                            class179 var252 = class78.field1529[var6];
                            class81.field1564.method70((byte) -62, 208);
                            class81.field1564.method1230((byte) -97, 0);
                            int var253 = class81.field1564.field3432;
                            class81.field1564.method1232(var252.method1137(97), (byte) 124);
                            class81.field1564.method1222((byte) -76, class109.field2045.field3375);
                            class109.field2045.field3377.method842(class81.field1564, class109.field2045.field3379, (byte) -18);
                            class81.field1564.method1238(Integer.MAX_VALUE, class81.field1564.field3432 - var253);
                            continue;
                        }
                        if (var365 == 5061) {
                            class81.field1564.method70((byte) -62, 119);
                            class81.field1564.method1230((byte) -73, 0);
                            class5.field64++;
                            int var254 = class81.field1564.field3432;
                            class81.field1564.method1230((byte) -63, 1);
                            class81.field1564.method1222((byte) -117, class109.field2045.field3375);
                            class109.field2045.field3377.method842(class81.field1564, class109.field2045.field3379, (byte) -18);
                            class81.field1564.method1238(Integer.MAX_VALUE, class81.field1564.field3432 - var254);
                            continue;
                        }
                        if (var365 == 5062) {
                            var7 -= 2;
                            int var255 = class98.field1833[var7];
                            int var256 = class98.field1833[var7 + 1];
                            class98.field1833[var7++] = class117.method751(var255, true).field1260[var256];
                            continue;
                        }
                        if (var365 == 5063) {
                            var7 -= 2;
                            int var257 = class98.field1833[var7 + 1];
                            int var258 = class98.field1833[var7];
                            class98.field1833[var7++] = class117.method751(var258, true).field1259[var257];
                            continue;
                        }
                        if (var365 == 5064) {
                            var7 -= 2;
                            int var259 = class98.field1833[var7];
                            int var260 = class98.field1833[var7 + 1];
                            if (var260 == -1) {
                                class98.field1833[var7++] = -1;
                            } else {
                                class98.field1833[var7++] = class117.method751(var259, true).method400(var260, false);
                            }
                            continue;
                        }
                        if (var365 == 5065) {
                            var7 -= 2;
                            int var261 = class98.field1833[var7 + 1];
                            int var262 = class98.field1833[var7];
                            if (var261 == -1) {
                                class98.field1833[var7++] = -1;
                            } else {
                                class98.field1833[var7++] = class117.method751(var262, true).method403(9612, var261);
                            }
                            continue;
                        }
                        if (var365 == 5066) {
                            var7--;
                            int var263 = class98.field1833[var7];
                            class98.field1833[var7++] = class238.method1543(78, var263).method834(-21868);
                            continue;
                        }
                        if (var365 == 5067) {
                            var7 -= 2;
                            int var264 = class98.field1833[var7];
                            int var265 = class98.field1833[var7 + 1];
                            int var266 = class238.method1543(126, var264).method843((byte) 122, var265);
                            System.out.println("chatphrase_getdynamiccommand=" + var266);
                            class98.field1833[var7++] = var266;
                            continue;
                        }
                        if (var365 == 5068) {
                            var7 -= 2;
                            int var267 = class98.field1833[var7 + 1];
                            int var268 = class98.field1833[var7];
                            class109.field2045.field3379[var268] = var267;
                            continue;
                        }
                        if (var365 == 5069) {
                            var7 -= 2;
                            int var269 = class98.field1833[var7];
                            int var270 = class98.field1833[var7 + 1];
                            class109.field2045.field3379[var269] = var270;
                            continue;
                        }
                        if (var365 == 5070) {
                            var7 -= 3;
                            int var271 = class98.field1833[var7 + 1];
                            int var272 = class98.field1833[var7 + 2];
                            int var273 = class98.field1833[var7];
                            class131 var274 = class238.method1543(116, var273);
                            if (var274.method843((byte) 123, var271) != 0) {
                                throw new RuntimeException("bad command");
                            }
                            class98.field1833[var7++] = var274.method836(var272, var271, 127);
                            continue;
                        }
                    } else if (var365 < 5200) {
                        if (var365 == 5100) {
                            if (class84.field1618[86]) {
                                class98.field1833[var7++] = 1;
                            } else {
                                class98.field1833[var7++] = 0;
                            }
                            continue;
                        }
                        if (var365 == 5101) {
                            if (class84.field1618[82]) {
                                class98.field1833[var7++] = 1;
                            } else {
                                class98.field1833[var7++] = 0;
                            }
                            continue;
                        }
                        if (var365 == 5102) {
                            if (class84.field1618[81]) {
                                class98.field1833[var7++] = 1;
                            } else {
                                class98.field1833[var7++] = 0;
                            }
                            continue;
                        }
                    } else if (var365 < 5300) {
                        if (var365 == 5200) {
                            var7--;
                            class222.method1439(18934, class98.field1833[var7]);
                            continue;
                        }
                        if (var365 == 5201) {
                            class98.field1833[var7++] = class240.method1558(109);
                            continue;
                        }
                        if (var365 == 5202) {
                            var7--;
                            class233.method1521(true, class98.field1833[var7]);
                            continue;
                        }
                        if (var365 == 5203) {
                            var6--;
                            class121.method776(91, class78.field1529[var6]);
                            continue;
                        }
                        if (var365 == 5204) {
                            class78.field1529[var6 - 1] = class199.method1326(class78.field1529[var6 - 1], true);
                            continue;
                        }
                        if (var365 == 5205) {
                            var6--;
                            class236.method1532(class78.field1529[var6], 21380);
                            continue;
                        }
                    } else if (var365 >= 5400) {
                        if (var365 < 5500) {
                            if (var365 == 5400) {
                                var6 -= 2;
                                class179 var211 = class78.field1529[var6];
                                class78.field1535++;
                                class179 var212 = class78.field1529[var6 + 1];
                                var7--;
                                int var213 = class98.field1833[var7];
                                class81.field1564.method70((byte) -62, 195);
                                class81.field1564.method1230((byte) -83, class192.method1290(var211, (byte) 52) + class192.method1290(var212, (byte) -85) + 1);
                                class81.field1564.method1212((byte) 0, var211);
                                class81.field1564.method1212((byte) 0, var212);
                                class81.field1564.method1230((byte) -83, var213);
                                continue;
                            }
                            if (var365 == 5401) {
                                var7 -= 2;
                                class134.field2435[class98.field1833[var7]] = (short) class163.method1044(4686, class98.field1833[var7 + 1]);
                                continue;
                            }
                        }
                    } else if (var365 == 5304) {
                        class98.field1833[var7++] = 0;
                        continue;
                    }
                } else {
                    class6 var47;
                    if (var365 >= 2000) {
                        var7--;
                        var47 = class87.method580(class98.field1833[var7], 80);
                        var365 -= 1000;
                    } else {
                        var47 = var44 ? class33.field723 : class207.field3861;
                    }
                    if (var365 == 1300) {
                        var7--;
                        int var48 = class98.field1833[var7] - 1;
                        if (var48 >= 0 && var48 <= 9) {
                            var6--;
                            var47.method36(20069, class78.field1529[var6], var48);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var365 == 1301) {
                        var7 -= 2;
                        int var49 = class98.field1833[var7];
                        int var50 = class98.field1833[var7 + 1];
                        var47.field109 = class227.method1485(var50, var49, (byte) 124);
                        continue;
                    }
                    if (var365 == 1302) {
                        var7--;
                        var47.field186 = class98.field1833[var7] == 1;
                        continue;
                    }
                    if (var365 == 1303) {
                        var7--;
                        var47.field102 = class98.field1833[var7];
                        continue;
                    }
                    if (var365 == 1304) {
                        var7--;
                        var47.field154 = class98.field1833[var7];
                        continue;
                    }
                    if (var365 == 1305) {
                        var6--;
                        var47.field198 = class78.field1529[var6];
                        continue;
                    }
                    if (var365 == 1306) {
                        var6--;
                        var47.field221 = class78.field1529[var6];
                        continue;
                    }
                    if (var365 == 1307) {
                        var47.field159 = null;
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var364) {
            if (var5.field2542 == null) {
                if (class240.field4411 != 0) {
                    class189.method1276(0, (byte) 1, class70.field1402, class91.field1735);
                }
                class214.method1406("CS2 - scr:" + var5.field1694 + " op:" + var10, true, var364);
            } else {
                class179 var361 = class117.method752(30, 0);
                var361.method1157(class15.field384, (byte) 120).method1157(var5.field2542, (byte) 62);
                for (int var362 = class175.field3155 - 1; var362 >= 0; var362--) {
                    var361.method1157(class232.field4276, (byte) 61).method1157(class136.field2522[var362].field549.field2542, (byte) 75);
                }
                if (var10 == 40) {
                    int var363 = var11[var8];
                    var361.method1157(class180.field3334, (byte) 86).method1157(class148.method949((byte) -14, var363), (byte) 94);
                }
                if (class240.field4411 != 0) {
                    class189.method1276(0, (byte) 1, class78.method502((byte) -114, new class179[] { class67.field1355, var5.field2542 }), class91.field1735);
                }
                class214.method1406("CS2 - scr:" + var5.field1694 + " op:" + var10 + new String(var361.method1158(29570)), true, var364);
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZLeh;ILfj;Leh;)V")
    public static final void method77(boolean arg0, class52 arg1, int arg2, class65 arg3, class52 arg4) {
        class33.field715 = arg4;
        class44.field958 = arg1;
        class175.field3131 = arg0;
        int var5 = class44.field958.method339(113) - 1;
        field302++;
        class59.field1266 = class44.field958.method336((byte) 62, var5) + var5 * 256;
        class64.field1327 = arg3;
        if (arg2 != 2) {
            method79(-34, (byte) -114);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIIII)V")
    public static final void method78(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var9 = arg5 + 1;
        class23.method161(arg1, -1, arg4, arg3, class14.field331[arg5]);
        if (arg0 != -2) {
            field294 = -45;
        }
        int var8 = arg2 - 1;
        class23.method161(arg1, -1, arg4, arg3, class14.field331[arg2]);
        for (int var6 = var9; var6 <= var8; var6++) {
            int[] var7 = class14.field331[var6];
            var7[arg3] = var7[arg1] = arg4;
        }
        field297++;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IB)V")
    public static final void method79(int arg0, byte arg1) {
        field300++;
        class177 var2 = (class177) class155.field2777.method909(-1, (long) arg0);
        if (var2 != null && arg1 == 37) {
            var2.method592((byte) -128);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIIILgj;I)Lgj;")
    public static final class75 method80(int arg0, int arg1, int arg2, int arg3, int arg4, class75 arg5, int arg6) {
        field292++;
        long var7 = (long) arg4;
        class75 var9 = (class75) class168.field3031.method1332(var7, 0);
        if (var9 == null) {
            class224 var10 = class224.method1458(class183.field3381, arg4, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1461(64, 768, -50, -10, -50);
            class168.field3031.method1340(var7, false, var9);
        }
        if (arg0 != 3616) {
            return null;
        }
        int var11 = arg5.method481();
        int var12 = arg5.method490();
        int var13 = arg5.method482();
        int var14 = arg5.method483();
        class75 var15 = var9.method476(true);
        if (arg1 != 0) {
            var15.method486(arg1);
        }
        class203 var16 = (class203) var15;
        if (arg6 != class202.method1341(-56, arg2 + var11, class49.field1038, arg3 + var13) || class202.method1341(-66, arg2 + var12, class49.field1038, arg3 + var14) != arg6) {
            for (int var17 = 0; var17 < var16.field3769; var17++) {
                var16.field3781[var17] += class202.method1341(-65, var16.field3752[var17] + arg2, class49.field1038, var16.field3764[var17] + arg3) - arg6;
            }
            var16.field3760 = false;
        }
        return var15;
    }
}
