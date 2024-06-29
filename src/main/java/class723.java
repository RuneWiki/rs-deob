import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pea")
public class class723 {

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "I")
    public static int field9805;

    @OriginalMember(owner = "client!pea", name = "b", descriptor = "I")
    public static int field9806;

    @OriginalMember(owner = "client!pea", name = "c", descriptor = "I")
    public static int field9807;

    @OriginalMember(owner = "client!pea", name = "d", descriptor = "I")
    public static int field9808;

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(B)V", line = 11)
    public static final void method4008(byte arg0) {
        field9808++;
        class124.field2128.method999(arg0 - 62);
        class493.field6825.method999(0);
        class94.field1657.method999(0);
        if (arg0 != 62) {
            method4008((byte) 43);
        }
        class566.field7800.method999(0);
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(I)I", line = 26)
    public static final int method4009(int arg0) {
        if (class693.field9368.field4462.method3702(arg0 - 3690) == 0) {
            for (int var1 = 0; var1 < class634.field8719; var1++) {
                if (class749.field10381[var1].method2329((byte) 31) == 's' || class749.field10381[var1].method2329((byte) 71) == 'S') {
                    class693.field9368.method2065((byte) 74, class693.field9368.field4462, 1);
                    class169.field2651 = true;
                    break;
                }
            }
        }
        field9807++;
        if (class594.field8134 == class120.field2030) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class554.method3190(arg0 + 28559);
            if (class217.field3143 == 0L) {
                class217.field3143 = var4;
            }
            if (var3 > 16384 && (var4 - class217.field3143) < 5000L) {
                if (var4 - class742.field9988 > 1000L) {
                    System.gc();
                    class742.field9988 = var4;
                }
                return 0;
            }
        }
        if (class594.field8134 == class120.field2035) {
            if (class195.field2886 == null) {
                class195.field2886 = new class626(class235.field3411, class428.field6145, class684.field9255, class594.field8131);
            }
            if (!class195.field2886.method3577(7)) {
                return 0;
            }
            class734.method4050(null, 0, true, 0);
            class87.field1560 = !class423.method2591((byte) -63);
            class87.field1548 = class605.method3443(false, class87.field1560 ? 34 : 32, (byte) -23, 1);
            class268.field3787 = class605.method3443(false, 33, (byte) -23, 1);
            class416.field6026 = class605.method3443(false, 13, (byte) -23, 1);
        }
        if (class594.field8134 == class120.field2036) {
            boolean var6 = class268.field3787.method854(89);
            int var7 = class633.field8705[33].method433(1);
            int var8 = var7 + class633.field8705[class87.field1560 ? 34 : 32].method433(1);
            int var9 = var8 + class633.field8705[13].method433(1);
            int var10 = var9 + (var6 ? 100 : class268.field3787.method851((byte) -31));
            if (var10 != 400) {
                return var10 / 4;
            }
            class498.field6967 = class87.field1548.method842(77);
            class746.field10333 = class268.field3787.method842(arg0 + 28561);
            class62.method658(class87.field1548, 0);
            int var11 = class693.field9368.field4454.method886(arg0 ^ 0x11AE);
            class453.field6393 = new class398(class582.field7970, class607.field8336, class268.field3787);
            int[] var12 = class453.field6393.method2492(var11, 0);
            if (var12.length == 0) {
                var12 = class453.field6393.method2492(0, 0);
            }
            class62 var13 = new class62(class87.field1548, class416.field6026);
            if (var12.length > 0) {
                class117.field1990 = new class178[var12.length];
                for (int var14 = 0; var14 < class117.field1990.length; var14++) {
                    class117.field1990[var14] = new class637(class453.field6393.method2489(var12[var14], (byte) 102), var13);
                }
            }
        }
        if (class594.field8134 == class120.field2038) {
            class587.method3354(class416.field6026, -81, class311.method2023(1084489728), class87.field1548);
        }
        if (class594.field8134 == class120.field2039) {
            int var15 = class568.method3288(0);
            int var16 = class187.method1361(2);
            if (var15 < var16) {
                return var15 * 100 / var16;
            }
        }
        if (class594.field8134 == class120.field2040) {
            if (class117.field1990 != null && class117.field1990.length > 0) {
                if (class117.field1990[0].method560(-19079) < 100) {
                    return 0;
                }
                if (class117.field1990.length > 1 && class453.field6393.method2490(86) && class117.field1990[1].method560(arg0 + 9581) < 100) {
                    return 0;
                }
            }
            class96.method900(5139, class272.field3822);
            class140.method1121(class272.field3822, 4);
            class215.method1527(2, 1);
        }
        if (class594.field8134 == class120.field2041) {
            for (int var17 = 0; var17 < 4; var17++) {
                class19.field295[var17] = class232.method1620(class175.field2711, 1, class376.field5325);
            }
        }
        if (class594.field8134 == class120.field2042) {
            class569.field7819 = class605.method3443(false, 8, (byte) -23, 1);
            class89.field1573 = class605.method3443(false, 0, (byte) -23, 1);
            class463.field6504 = class605.method3443(false, 1, (byte) -23, 1);
            class471.field6600 = class605.method3443(false, 2, (byte) -23, 1);
            class113.field1949 = class605.method3443(false, 3, (byte) -23, 1);
            class417.field6035 = class605.method3443(false, 4, (byte) -23, 1);
            class171.field2666 = class605.method3443(true, 5, (byte) -23, 1);
            class78.field1399 = class605.method3443(true, 6, (byte) -23, 1);
            class301.field4202 = class605.method3443(false, 7, (byte) -23, 1);
            class605.field8304 = class605.method3443(false, 9, (byte) -23, 1);
            class313.field4344 = class605.method3443(false, 10, (byte) -23, 1);
            class72.field1324 = class605.method3443(false, 11, (byte) -23, 1);
            class536.field7417 = class605.method3443(false, 12, (byte) -23, 1);
            class107.field1877 = class605.method3443(false, 14, (byte) -23, 1);
            class744.field9998 = class605.method3443(false, 15, (byte) -23, 1);
            class660.field9034 = class605.method3443(false, 16, (byte) -23, 1);
            class34.field857 = class605.method3443(false, 17, (byte) -23, 1);
            class194.field2863 = class605.method3443(false, 18, (byte) -23, 1);
            class558.field7731 = class605.method3443(false, 19, (byte) -23, 1);
            class28.field745 = class605.method3443(false, 20, (byte) -23, 1);
            class18.field286 = class605.method3443(false, 21, (byte) -23, 1);
            class12.field196 = class605.method3443(false, 22, (byte) -23, 1);
            class77.field1395 = class605.method3443(true, 23, (byte) -23, 1);
            class491.field6803 = class605.method3443(false, 24, (byte) -23, 1);
            class549.field7554 = class605.method3443(false, 25, (byte) -23, 1);
            class663.field9075 = class605.method3443(true, 26, (byte) -23, 1);
            class212.field3014 = class605.method3443(false, 27, (byte) -23, 1);
            class79.field1420 = class605.method3443(true, 28, (byte) -23, 1);
            class168.field2631 = class605.method3443(false, 29, (byte) -23, 1);
            class646.field8886 = class605.method3443(true, 30, (byte) -23, 1);
            class419.field6065 = class605.method3443(true, 31, (byte) -23, 1);
            class499.field6973 = class605.method3443(true, 36, (byte) -23, 2);
        }
        if (class594.field8134 == class120.field2043) {
            int var18 = 0;
            for (int var19 = 0; var19 < 37; var19++) {
                if (class633.field8705[var19] != null) {
                    var18 += class633.field8705[var19].method433(arg0 + 28661) * class436.field6233[var19] / 100;
                }
            }
            if (var18 != 100) {
                if (class521.field7229 < 0) {
                    class521.field7229 = var18;
                }
                return (var18 - class521.field7229) * 100 / (100 - class521.field7229);
            }
            class700.method3914((byte) -109, class569.field7819);
            class587.method3354(class416.field6026, -124, class311.method2023(arg0 ^ -1084518388), class569.field7819);
        }
        if (class594.field8134 == class120.field2044) {
            if (class488.field6755 == -1) {
                class488.field6755 = class78.field1399.method870("scape main", 0);
            }
            class261.method1757(56);
            class215.method1527(2, 2);
        }
        if (class594.field8134 == class120.field2045) {
            class132.method1092(class646.field8886, class689.field9299, (byte) 95);
        }
        if (class594.field8134 == class120.field2046) {
            int var20 = class656.method3704((byte) -25);
            if (var20 < 100) {
                return var20;
            }
            class245.method1688(class79.field1420.method868((byte) 73, 1), (byte) 112);
            class274.method1810(class79.field1420.method868((byte) 73, 3), (byte) -111);
        }
        if (arg0 != -28660) {
            return 2;
        }
        if (class594.field8134 == class120.field2047) {
            if (class498.field6966 != -1 && !class301.field4202.method873(-10499, class498.field6966, 0)) {
                return 99;
            }
            class528.field7303 = new class638(class663.field9075, class605.field8304, class569.field7819);
            class495.field6863 = new class5(class582.field7970, class607.field8336, class471.field6600);
            class624.field8505 = new class210(class582.field7970, class607.field8336, class471.field6600);
            class212.field3015 = new class730(class582.field7970, class607.field8336, class471.field6600, class569.field7819);
            class54.field1112 = new class529(class582.field7970, class607.field8336, class34.field857);
            class732.field9888 = new class521(class582.field7970, class607.field8336, class471.field6600);
            class130.field2186 = new class468(class582.field7970, class607.field8336, class471.field6600);
            class192.field2850 = new class293(class582.field7970, class607.field8336, class471.field6600, class569.field7819);
            class57.field1143 = new class738(class582.field7970, class607.field8336, class471.field6600, class301.field4202);
            class422.field6085 = new class126(class582.field7970, class607.field8336, class471.field6600);
            class669.field9130 = new class681(class582.field7970, class607.field8336, class471.field6600);
            class76.field1366 = new class245(class582.field7970, class607.field8336, true, class660.field9034, class301.field4202);
            class72.field1322 = new class337(class582.field7970, class607.field8336, class471.field6600, class569.field7819);
            class351.field4888 = new class119(class582.field7970, class607.field8336, class471.field6600, class569.field7819);
            class510.field7099 = new class183(class582.field7970, class607.field8336, true, class194.field2863, class301.field4202);
            class721.field9801 = new class20(class582.field7970, class607.field8336, true, class495.field6863, class558.field7731, class301.field4202);
            class72.field1327 = new class186(class582.field7970, class607.field8336, class471.field6600);
            class456.field6436 = new class116(class582.field7970, class607.field8336, class28.field745, class89.field1573, class463.field6504);
            class132.field2230 = new class645(class582.field7970, class607.field8336, class471.field6600);
            class744.field9996 = new class160(class582.field7970, class607.field8336, class471.field6600);
            class104.field1840 = new class516(class582.field7970, class607.field8336, class18.field286, class301.field4202);
            class419.field6056 = new class690(class582.field7970, class607.field8336, class471.field6600);
            class430.field6160 = new class549(class582.field7970, class607.field8336, class471.field6600);
            class394.field5790 = new class318(class582.field7970, class607.field8336, class471.field6600);
            class732.field9890 = new class603(class582.field7970, class607.field8336, class12.field196);
            class537.field7423 = new class111(class582.field7970, class607.field8336, class471.field6600);
            class690.method3858(class416.field6026, (byte) -100, class113.field1949, class569.field7819, class301.field4202);
            class355.method2223(0, class168.field2631);
            class455.field6415 = new class69(class607.field8336, class491.field6803, class549.field7554);
            class621.field8455 = new class382(class607.field8336, class491.field6803, class549.field7554, new class133());
            class738.method4055(0);
            class76.field1366.method1683(arg0 + 28539, class693.field9368.field4458.method3022(arg0 + -3690) == 0);
            class390.field5635 = new class96();
            class297.method1947(-1);
            class274.method1809(arg0 + 29684, class212.field3014);
            class89.method835(class301.field4202, false, class528.field7303);
            class639 var21 = new class639(class313.field4344.method844("huffman", "", -29832));
            class745.method4125(var21, (byte) 13);
            try {
                jagmisc.init();
            } catch (Throwable var29) {
            }
            class272.field3828 = class732.method4043(false);
            class270.field3807 = new class235(true, class689.field9299);
        }
        if (class594.field8134 == class120.field2049) {
            int var22 = class751.method4200(22388, class569.field7819) + class665.method3728(2012104999, true);
            int var23 = class427.method2608(-30477) + class187.method1361(2);
            if (var22 < var23) {
                return var22 * 100 / var23;
            }
        }
        if (class594.field8134 == class120.field2050) {
            class489.method2880(class77.field1395, class732.field9888, class130.field2186, class76.field1366, class72.field1322, class351.field4888, class390.field5635);
        }
        if (class594.field8134 == class120.field2051) {
            class377.field5346 = new int[class394.field5790.field4391];
            class269.field3797 = new boolean[class394.field5790.field4391];
            class429.field6149 = new String[class430.field6160.field7559];
            for (int var24 = 0; var24 < class394.field5790.field4391; var24++) {
                if (class394.field5790.method2049(var24, arg0 ^ 0xFFFF903F).field5290 == 0) {
                    class269.field3797[var24] = true;
                    class14.field245++;
                }
                class377.field5346[var24] = -1;
            }
            class304.method1994(1);
            class539.field7449 = class113.field1949.method870("loginscreen", arg0 ^ 0xFFFF900C);
            class452.field6376 = class113.field1949.method870("lobbyscreen", 0);
            class171.field2666.method857(0, true, false);
            class78.field1399.method857(0, true, true);
            class569.field7819.method857(arg0 + 28660, true, true);
            class416.field6026.method857(0, true, true);
            class313.field4344.method857(0, true, true);
            class113.field1949.method857(0, true, true);
            class471.field6600.field1592 = 2;
            class516.field7194 = true;
            class34.field857.field1592 = 2;
            class660.field9034.field1592 = 2;
            class194.field2863.field1592 = 2;
            class558.field7731.field1592 = 2;
            class28.field745.field1592 = 2;
            class18.field286.field1592 = 2;
        }
        if (class594.field8134 == class120.field2052) {
            if (!class722.method4007(class539.field7449, (byte) 84)) {
                return 0;
            }
            boolean var25 = true;
            for (int var26 = 0; var26 < class396.field5798[class539.field7449].length; var26++) {
                class378 var27 = class396.field5798[class539.field7449][var26];
                if (var27.field5450 == 5 && var27.field5432 != -1 && !class569.field7819.method873(-10499, var27.field5432, 0)) {
                    var25 = false;
                }
            }
            if (!var25) {
                return 0;
            }
        }
        if (class594.field8134 == class120.field2053) {
            class21.method170(true, (byte) -45);
        }
        if (class594.field8134 == class120.field2054) {
            class99.field1732.method1712((byte) -56);
            try {
                class77.field1391.join();
            } catch (InterruptedException var28) {
                return 0;
            }
            class453.field6393 = null;
            class268.field3787 = null;
            class99.field1732 = null;
            class117.field1990 = null;
            class77.field1391 = null;
            class87.field1548 = null;
            class745.method4118(arg0 + 28556);
            class72.field1329 = class693.field9368.field4462.method3702(-32350) == 1;
            class693.field9368.method2065((byte) 74, class693.field9368.field4462, 1);
            if (class72.field1329) {
                class693.field9368.method2065((byte) 74, class693.field9368.field4448, 0);
            } else if (class693.field9368.field4448.field2258 && class270.field3807.field3419 < 512 && class270.field3807.field3419 != 0) {
                class693.field9368.method2065((byte) 74, class693.field9368.field4448, 0);
            }
            class310.method2019(arg0 ^ 0xFFFF9029);
            if (class72.field1329) {
                class171.method1284(false, (byte) 108, 0);
            } else {
                class171.method1284(false, (byte) 102, class693.field9368.field4448.method1099(-32350));
            }
            class486.method2864(class693.field9368.field4424.method3495(-32350), -1, (byte) 102, false, -1);
            class96.method900(5139, class272.field3822);
            class140.method1121(class272.field3822, arg0 ^ 0xFFFF9008);
            class20.method155(class569.field7819, class272.field3822, true);
            class661.method3716(class536.field7418, 515880227);
        }
        return class525.method3041(false);
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(ZI[Ljava/lang/String;I)Ljava/lang/String;", line = 473)
    public static final String method4010(boolean arg0, int arg1, String[] arg2, int arg3) {
        field9805++;
        if (arg1 == 0) {
            return "";
        } else if (arg1 == 1) {
            String var4 = arg2[arg3];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg1 + arg3;
            int var6 = 0;
            for (int var7 = arg3; var7 < var5; var7++) {
                String var11 = arg2[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg3; var9 < var5; var9++) {
                String var10 = arg2[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            if (!arg0) {
                method4008((byte) -20);
            }
            return var8.toString();
        }
    }
}
