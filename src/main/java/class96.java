import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class96 extends class90 {

    @OriginalMember(owner = "client!pm", name = "C", descriptor = "Z")
    public boolean field1380 = true;

    @OriginalMember(owner = "client!pm", name = "I", descriptor = "Lsh;")
    public static class472 field1386 = new class472(40, 12);

    @OriginalMember(owner = "client!pm", name = "M", descriptor = "[Lsc;")
    public static class250[] field1390 = new class250[5];

    @OriginalMember(owner = "client!pm", name = "u", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!pm", name = "v", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!pm", name = "w", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!pm", name = "x", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!pm", name = "y", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!pm", name = "z", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!pm", name = "A", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!pm", name = "B", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!pm", name = "E", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!pm", name = "F", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!pm", name = "G", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!pm", name = "H", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!pm", name = "J", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!pm", name = "L", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!pm", name = "N", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!pm", name = "t", descriptor = "[I")
    private int[] field1371;

    @OriginalMember(owner = "client!pm", name = "D", descriptor = "[I")
    public int[] field1381;

    @OriginalMember(owner = "client!pm", name = "s", descriptor = "[Ljava/lang/String;")
    private String[] field1370;

    @OriginalMember(owner = "client!pm", name = "K", descriptor = "[[I")
    private int[][] field1388;

    static {
        for (int var0 = 0; var0 < field1390.length; var0++) {
            field1390[var0] = new class250();
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IILtq;B)V", line = 4)
    public static final void method746(int arg0, int arg1, class63 arg2, byte arg3) {
        field1382++;
        if (arg1 < 0 || arg0 < 0 || class17.field231 == 0 || class367.field5544 == 0) {
            return;
        }
        arg2.method516(class84.field1191, class48.field694, class17.field231, class367.field5544);
        arg2.method500(class184.field2802, class199.field3008, class17.field231, class367.field5544);
        class315 var4 = arg2.method580();
        var4.method484(class454.field6459, class142.field2026, class418.field6009, class305.field4550, class309.field4650, class82.field1148);
        arg2.method544(var4);
        if (class483.field6781 != null) {
            int var5 = -1;
            int var6 = -1;
            int var7 = arg2.method534();
            int var8 = (arg1 - class84.field1191) * var7 / class17.field231;
            int var9 = (arg0 - class48.field694) * var7 / class367.field5544;
            int var10 = arg2.method535();
            int var11 = (arg1 - class84.field1191) * var10 / class17.field231;
            int var12 = (arg0 - class48.field694) * var10 / class367.field5544;
            int[] var13 = new int[] { var8, var9, var7 };
            var4.method479(var13);
            int[] var14 = new int[] { var11, var12, var10 };
            var4.method479(var14);
            float var15 = 0.0F;
            int var16 = var14[0] - var13[0];
            int var17 = var14[1] - var13[1];
            int var18 = var14[2] - var13[2];
            while (var15 < 1.0F) {
                int var19 = (int) ((float) var16 * var15 + (float) var13[0]);
                int var20 = var19 >> 7;
                int var21 = (int) ((float) var18 * var15 + (float) var13[2]);
                int var22 = var21 >> 7;
                if (var20 > 0 && var22 > 0 && var20 < class379.field5642 && var22 < class456.field6477) {
                    int var23 = class472.field6622.field4545;
                    if (var23 < 3 && (class246.field3532[1][var20][var22] & 0x2) != 0) {
                        var23++;
                    }
                    if ((float) class483.field6781[var23].method204(var19, var21) < (float) var17 * var15 + (float) var13[1]) {
                        var5 = -(-(class472.field6622.method1705((byte) 65) * 64) - var19) - 64 >> 7;
                        var6 = var21 + (class472.field6622.method1705((byte) 65) * 64 - 64) >> 7;
                        break;
                    }
                }
                var15 = (float) ((double) var15 + 0.01D);
            }
            if (var5 != -1 && var6 != -1) {
                if (class432.field6152 && (class197.field2960 & 0x40) != 0) {
                    class178 var24 = class331.method2032(class65.field898, class467.field6570, arg3 ^ 0x35);
                    if (var24 == null) {
                        class110.method809((byte) -123);
                    } else {
                        class344.method2117(0L, 4, true, class186.field2830, " ->", class184.field2803, -8, var5, -1, false, var6);
                    }
                } else {
                    if (class77.field1088 == class124.field1710) {
                        class344.method2117(0L, 19, true, -1, "", class335.field5001.method2036(class4.field85, (byte) -21), arg3 ^ 0x32, var5, -1, false, var6);
                    }
                    class484.field6786++;
                    class344.method2117(0L, 51, true, -1, "", class200.field3036, arg3 + 46, var5, -1, false, var6);
                }
            }
        }
        class250 var25 = class453.field6428;
        if (arg3 != -54) {
            return;
        }
        for (class123 var26 = (class123) var25.method1594(16); var26 != null; var26 = (class123) var25.method1596(true)) {
            if (class472.field6622.field4545 == var26.field1693 && var26.method862(arg1, (byte) 123, arg2, arg0)) {
                if (var26.field1696 instanceof class257) {
                    class257 var27 = (class257) var26.field1696;
                    int var28 = var27.method1705((byte) 65);
                    if ((var28 & 0x1) == 0 && (var27.field4543 & 0x7F) == 0 && (var27.field4538 & 0x7F) == 0 || (var28 & 0x1) == 1 && (var27.field4543 & 0x7F) == 64 && (var27.field4538 & 0x7F) == 64) {
                        int var29 = var27.field4543 + 64 - (var27.method1705((byte) 65) * 64);
                        int var30 = var27.field4538 - ((var27.method1705((byte) 65) - 1) * 64);
                        for (int var31 = 0; var31 < class256.field3797; var31++) {
                            class349 var38 = class18.field241[class236.field3441[var31]];
                            if (var38 != null && class452.field6418 != var38.field4657 && var38.field4644) {
                                int var39 = var38.field4543 - ((var38.field5309.field4147 - 1) * 64);
                                int var40 = var38.field4538 - ((var38.field5309.field4147 - 1) * 64);
                                if (var39 >= var29 && var38.field5309.field4147 <= (var27.method1705((byte) 65) - (var39 - var29 >> 7)) && var30 <= var40 && var38.field5309.field4147 <= var27.method1705((byte) 65) - (var40 - var30 >> 7)) {
                                    class287.method1835(var38, class472.field6622.field4545 != var26.field1693, 125);
                                    var38.field4657 = class452.field6418;
                                }
                            }
                        }
                        int var32 = class299.field4466;
                        int[] var33 = class161.field2218;
                        for (int var34 = 0; var34 < var32; var34++) {
                            class257 var35 = class40.field565[var33[var34]];
                            if (var35 != null && class452.field6418 != var35.field4657 && var27 != var35 && var35.field4644) {
                                int var36 = var35.field4543 - (var35.method1705((byte) 65) - 1) * 64;
                                int var37 = var35.field4538 + 64 - (var35.method1705((byte) 65) * 64);
                                if (var36 >= var29 && var35.method1705((byte) 65) <= var27.method1705((byte) 65) - (var36 - var29 >> 7) && var30 <= var37 && var35.method1705((byte) 65) <= var27.method1705((byte) 65) - (var37 - var30 >> 7)) {
                                    class294.method1848(var35, class472.field6622.field4545 != var26.field1693, -95);
                                    var35.field4657 = class452.field6418;
                                }
                            }
                        }
                    }
                    if (class452.field6418 == var27.field4657) {
                        continue;
                    }
                    class294.method1848(var27, class472.field6622.field4545 != var26.field1693, -114);
                    var27.field4657 = class452.field6418;
                }
                if (var26.field1696 instanceof class349) {
                    class349 var41 = (class349) var26.field1696;
                    if (var41.field5309 != null) {
                        if ((var41.field5309.field4147 & 0x1) == 0 && (var41.field4543 & 0x7F) == 0 && (var41.field4538 & 0x7F) == 0 || (var41.field5309.field4147 & 0x1) == 1 && (var41.field4543 & 0x7F) == 64 && (var41.field4538 & 0x7F) == 64) {
                            int var42 = var41.field4543 + 64 - (var41.field5309.field4147 * 64);
                            int var43 = var41.field4538 - ((var41.field5309.field4147 - 1) * 64);
                            for (int var44 = 0; var44 < class256.field3797; var44++) {
                                class349 var51 = class18.field241[class236.field3441[var44]];
                                if (var51 != null && class452.field6418 != var51.field4657 && var41 != var51 && var51.field4644) {
                                    int var52 = var51.field4543 - (var51.field5309.field4147 - 1) * 64;
                                    int var53 = var51.field4538 + 64 - (var51.field5309.field4147 * 64);
                                    if (var52 >= var42 && var41.field5309.field4147 - (var52 - var42 >> 7) >= var51.field5309.field4147 && var43 <= var53 && var51.field5309.field4147 <= (var41.field5309.field4147 - (var53 - var43 >> 7))) {
                                        class287.method1835(var51, class472.field6622.field4545 != var26.field1693, 127);
                                        var51.field4657 = class452.field6418;
                                    }
                                }
                            }
                            int var45 = class299.field4466;
                            int[] var46 = class161.field2218;
                            for (int var47 = 0; var47 < var45; var47++) {
                                class257 var48 = class40.field565[var46[var47]];
                                if (var48 != null && class452.field6418 != var48.field4657 && var48.field4644) {
                                    int var49 = var48.field4543 - (var48.method1705((byte) 65) - 1) * 64;
                                    int var50 = var48.field4538 - (var48.method1705((byte) 65) - 1) * 64;
                                    if (var49 >= var42 && var48.method1705((byte) 65) <= (var41.field5309.field4147 - (var49 - var42 >> 7)) && var50 >= var43 && var48.method1705((byte) 65) <= (var41.field5309.field4147 - (var50 - var43 >> 7))) {
                                        class294.method1848(var48, class472.field6622.field4545 != var26.field1693, -86);
                                        var48.field4657 = class452.field6418;
                                    }
                                }
                            }
                        }
                        if (class452.field6418 == var41.field4657) {
                            continue;
                        }
                        class287.method1835(var41, class472.field6622.field4545 != var26.field1693, 119);
                        var41.field4657 = class452.field6418;
                    }
                }
                if (var26.field1696 instanceof class263) {
                    class31 var54 = (class31) class491.field6897.method2305((long) (var26.field1692 | var26.field1693 << 28 | var26.field1697 << 14), (byte) 123);
                    if (var54 != null) {
                        for (class267 var55 = (class267) var54.field407.method2454((byte) 121); var55 != null; var55 = (class267) var54.field407.method2451((byte) -96)) {
                            class184 var56 = class23.field309.method2364((byte) 118, var55.field3963);
                            if (!class432.field6152) {
                                if (class472.field6622.field4545 == var26.field1693) {
                                    String[] var58 = var56.field2801;
                                    for (int var59 = 4; var59 >= 0; var59--) {
                                        if (var58 != null && var58[var59] != null) {
                                            byte var60 = 0;
                                            if (var59 == 0) {
                                                var60 = 60;
                                            }
                                            int var61 = class162.field2235;
                                            if (var59 == 1) {
                                                var60 = 11;
                                            }
                                            if (var59 == 2) {
                                                var60 = 48;
                                            }
                                            if (var59 == 3) {
                                                var60 = 20;
                                            }
                                            if (var56.field2799 == var59) {
                                                var61 = var56.field2733;
                                            }
                                            if (var59 == 4) {
                                                var60 = 47;
                                            }
                                            if (var56.field2747 == var59) {
                                                var61 = var56.field2774;
                                            }
                                            class378.field5619++;
                                            class344.method2117((long) var55.field3963, var60, true, var61, "<col=ff9040>" + var56.field2722, var58[var59], arg3 + 46, var26.field1692, -1, false, var26.field1697);
                                        }
                                    }
                                }
                                class344.method2117((long) var55.field3963, 1009, true, class365.field5524, "<col=ff9040>" + var56.field2722, class402.field5868.method2036(class4.field85, (byte) -21), -8, var26.field1692, -1, class472.field6622.field4545 != var26.field1693, var26.field1697);
                                class69.field937++;
                            } else if (class472.field6622.field4545 == var26.field1693) {
                                class170 var57 = class25.field323 == -1 ? null : class237.field3463.method1398(arg3 ^ 0x6E, class25.field323);
                                if ((class197.field2960 & 0x1) != 0 && (var57 == null || var56.method1268((byte) 127, var57.field2419, class25.field323) != var57.field2419)) {
                                    class344.method2117((long) var55.field3963, 22, true, class186.field2830, class357.field5428 + " -> <col=ff9040>" + var56.field2722, class184.field2803, -8, var26.field1692, -1, false, var26.field1697);
                                    class345.field5258++;
                                }
                            }
                        }
                    }
                }
                if (var26.field1696 instanceof class218) {
                    class218 var62 = (class218) var26.field1696;
                    class271 var63 = class206.field3124.method338((byte) 119, var62.method257(false));
                    if (var63.field4015 != null) {
                        var63 = var63.method1759(class315.field4736, true);
                    }
                    if (var63 != null) {
                        if (!class432.field6152) {
                            if (class472.field6622.field4545 == var26.field1693) {
                                String[] var65 = var63.field4005;
                                if (var65 != null) {
                                    for (int var66 = 4; var66 >= 0; var66--) {
                                        if (var65[var66] != null) {
                                            short var67 = 0;
                                            if (var66 == 0) {
                                                var67 = 2;
                                            }
                                            int var68 = class162.field2235;
                                            if (var66 == 1) {
                                                var67 = 12;
                                            }
                                            if (var66 == 2) {
                                                var67 = 17;
                                            }
                                            if (var66 == 3) {
                                                var67 = 9;
                                            }
                                            if (var66 == 4) {
                                                var67 = 1002;
                                            }
                                            if (var63.field4049 == var66) {
                                                var68 = var63.field4061;
                                            }
                                            if (var63.field4078 == var66) {
                                                var68 = var63.field4068;
                                            }
                                            class303.field4510++;
                                            class344.method2117(class491.method2860(var26.field1692, var26.field1697, (byte) 99, var62), var67, true, var68, "<col=00ffff>" + var63.field4041, var65[var66], arg3 + 46, var26.field1692, -1, false, var26.field1697);
                                        }
                                    }
                                }
                            }
                            class204.field3100++;
                            class344.method2117((long) var63.field4043, 1008, true, class365.field5524, "<col=00ffff>" + var63.field4041, class402.field5868.method2036(class4.field85, (byte) -21), arg3 ^ 0x32, var26.field1692, -1, class472.field6622.field4545 != var26.field1693, var26.field1697);
                        } else if (class472.field6622.field4545 == var26.field1693) {
                            class170 var64 = class25.field323 == -1 ? null : class237.field3463.method1398(arg3 ^ 0x69, class25.field323);
                            if ((class197.field2960 & 0x4) != 0 && (var64 == null || var63.method1765(var64.field2419, class25.field323, 37) != var64.field2419)) {
                                class400.field5846++;
                                class344.method2117(class491.method2860(var26.field1692, var26.field1697, (byte) 99, var62), 59, true, class186.field2830, class357.field5428 + " -> <col=00ffff>" + var63.field4041, class184.field2803, -8, var26.field1692, -1, false, var26.field1697);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lre;II)V", line = 461)
    private final void method747(class446 arg0, int arg1, int arg2) {
        field1377++;
        if (arg1 == 1) {
            this.field1370 = class3.method17(arg0.method2582((byte) -124), 11205, '<');
        } else if (arg1 == 2) {
            int var4 = arg0.method2628(49152);
            this.field1381 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1381[var5] = arg0.method2631(2530);
            }
        } else if (arg1 == 3) {
            int var6 = arg0.method2628(49152);
            this.field1388 = new int[var6][];
            this.field1371 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg0.method2631(2530);
                this.field1371[var7] = var8;
                this.field1388[var7] = new int[class237.field3462[var8]];
                for (int var9 = 0; var9 < class237.field3462[var8]; var9++) {
                    this.field1388[var7][var9] = arg0.method2631(2530);
                }
            }
        } else if (arg1 == 4) {
            this.field1380 = false;
        }
        if (arg2 != 1) {
            field1386 = null;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lre;I)V", line = 526)
    public final void method748(class446 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2628(49152);
            if (var3 == 0) {
                field1379++;
                if (arg1 != 21322) {
                    method751(-69, -77, (byte) 77, (class484) null);
                    return;
                }
                return;
            }
            this.method747(arg0, var3, 1);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lfc;IILlk;Ltq;IBLgu;)V", line = 547)
    public static final void method749(class239 arg0, int arg1, int arg2, class290 arg3, class63 arg4, int arg5, byte arg6, class94 arg7) {
        field1374++;
        int var8 = arg3.field4402 - (arg2 / 2) - 5;
        int var9 = arg5 + 2;
        if (arg7.field1305 != 0) {
            arg4.method530((arg5 + (arg0.method1549() * arg1)) + 1 - var9, arg7.field1305, var9, (byte) 108, var8, arg2 + 10);
        }
        if (arg7.field1302 != 0) {
            arg4.method584((byte) -111, arg2 + 10, -var9 + arg0.method1549() * arg1 + (arg5 - -1), var8, arg7.field1302, var9);
        }
        int var10 = arg7.field1335;
        if (arg3.field4403 && arg7.field1292 != -1) {
            var10 = arg7.field1292;
        }
        if (arg6 != 112) {
            field1386 = null;
        }
        for (int var11 = 0; var11 < arg1; var11++) {
            String var12 = class247.field3590[var11];
            if (var11 < arg1 - 1) {
                var12 = var12.substring(0, var12.length() - 4);
            }
            arg0.method1553(arg4, var12, arg3.field4402, arg5, var10, true);
            arg5 += arg0.method1549();
        }
    }

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "(I)V", line = 590)
    public final void method750(int arg0) {
        if (arg0 != -1) {
            this.field1370 = null;
        }
        if (this.field1381 != null) {
            for (int var2 = 0; var2 < this.field1381.length; var2++) {
                this.field1381[var2] = class347.method2139(this.field1381[var2], 32768);
            }
        }
        field1383++;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIBLnd;)V", line = 610)
    public static final void method751(int arg0, int arg1, byte arg2, class484 arg3) {
        class401.field5864[arg0][arg1] = arg3;
        field1375++;
        if (arg2 <= 18) {
            method760(-25);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)I", line = 621)
    public final int method752(int arg0, int arg1) {
        if (arg1 != -1) {
            this.field1371 = null;
        }
        field1385++;
        return this.field1371 == null || arg0 < 0 || this.field1371.length < arg0 ? -1 : this.field1371[arg0];
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILtf;IIIIIIIII)Z", line = 637)
    public static final boolean method753(int arg0, class491 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field1372++;
        int var11 = arg8;
        int var12 = arg3;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg8 - var13;
        if (arg2 != 29379) {
            return true;
        }
        class401.field5859[var13][var14] = 99;
        int var16 = arg3 - var14;
        class309.field4648[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        class398.field5832[var17] = arg8;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class40.field562[var10001] = arg3;
        int[][] var19 = arg1.field6890;
        while (var26 != var18) {
            var12 = class40.field562[var18];
            var11 = class398.field5832[var18];
            var18 = var18 + 1 & 0xFFF;
            int var20 = var11 - var15;
            int var21 = var12 - arg1.field6904;
            int var22 = var12 - var16;
            int var23 = var11 - arg1.field6898;
            if (arg9 == -4) {
                if (arg7 == var11 && arg6 == var12) {
                    class379.field5639 = var12;
                    class270.field4001 = var11;
                    return true;
                }
            } else if (arg9 == -3) {
                if (class146.method992(arg10, 1, arg7, 1, var11, var12, arg6, arg4, false)) {
                    class270.field4001 = var11;
                    class379.field5639 = var12;
                    return true;
                }
            } else if (arg9 == -2) {
                if (arg1.method2876(arg4, 1, var11, 1, var12, arg6, (byte) -38, arg5, arg10, arg7)) {
                    class379.field5639 = var12;
                    class270.field4001 = var11;
                    return true;
                }
            } else if (arg9 == -1) {
                if (arg1.method2874(arg4, arg5, arg10, arg7, var11, arg6, var12, 1, -25971)) {
                    class270.field4001 = var11;
                    class379.field5639 = var12;
                    return true;
                }
            } else if (arg9 == 0 || arg9 == 1 || arg9 == 2 || arg9 == 3 || arg9 == 9) {
                if (arg1.method2866(arg7, arg6, arg9, arg0, var12, 2883848, var11, 1)) {
                    class379.field5639 = var12;
                    class270.field4001 = var11;
                    return true;
                }
            } else if (arg1.method2861(arg7, 26021, 1, arg9, var12, arg6, var11, arg0)) {
                class379.field5639 = var12;
                class270.field4001 = var11;
                return true;
            }
            int var25 = class309.field4648[var20][var22] + 1;
            if (var20 > 0 && class401.field5859[var20 - 1][var22] == 0 && (var19[var23 - 1][var21] & 0x42240000) == 0) {
                class398.field5832[var26] = var11 - 1;
                class40.field562[var26] = var12;
                class401.field5859[var20 - 1][var22] = 2;
                var26 = var26 + 1 & 0xFFF;
                class309.field4648[var20 - 1][var22] = var25;
            }
            if (var20 < 127 && class401.field5859[var20 + 1][var22] == 0 && (var19[var23 + 1][var21] & 0x60240000) == 0) {
                class398.field5832[var26] = var11 + 1;
                class40.field562[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class401.field5859[var20 + 1][var22] = 8;
                class309.field4648[var20 + 1][var22] = var25;
            }
            if (var22 > 0 && class401.field5859[var20][var22 - 1] == 0 && (var19[var23][var21 - 1] & 0x40A40000) == 0) {
                class398.field5832[var26] = var11;
                class40.field562[var26] = var12 - 1;
                class401.field5859[var20][var22 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class309.field4648[var20][var22 - 1] = var25;
            }
            if (var22 < 127 && class401.field5859[var20][var22 + 1] == 0 && (var19[var23][var21 + 1] & 0x48240000) == 0) {
                class398.field5832[var26] = var11;
                class40.field562[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class401.field5859[var20][var22 + 1] = 4;
                class309.field4648[var20][var22 + 1] = var25;
            }
            if (var20 > 0 && var22 > 0 && class401.field5859[var20 - 1][var22 - 1] == 0 && (var19[var23 - 1][var21 - 1] & 0x43A40000) == 0 && (var19[var23 - 1][var21] & 0x42240000) == 0 && (var19[var23][var21 - 1] & 0x40A40000) == 0) {
                class398.field5832[var26] = var11 - 1;
                class40.field562[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class401.field5859[var20 - 1][var22 - 1] = 3;
                class309.field4648[var20 - 1][var22 - 1] = var25;
            }
            if (var20 < 127 && var22 > 0 && class401.field5859[var20 + 1][var22 - 1] == 0 && (var19[var23 + 1][var21 - 1] & 0x60E40000) == 0 && (var19[var23 + 1][var21] & 0x60240000) == 0 && (var19[var23][var21 - 1] & 0x40A40000) == 0) {
                class398.field5832[var26] = var11 + 1;
                class40.field562[var26] = var12 - 1;
                class401.field5859[var20 + 1][var22 - 1] = 9;
                var26 = var26 + 1 & 0xFFF;
                class309.field4648[var20 + 1][var22 - 1] = var25;
            }
            if (var20 > 0 && var22 < 127 && class401.field5859[var20 - 1][var22 + 1] == 0 && (var19[var23 - 1][var21 + 1] & 0x4E240000) == 0 && (var19[var23 - 1][var21] & 0x42240000) == 0 && (var19[var23][var21 + 1] & 0x48240000) == 0) {
                class398.field5832[var26] = var11 - 1;
                class40.field562[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class401.field5859[var20 - 1][var22 + 1] = 6;
                class309.field4648[var20 - 1][var22 + 1] = var25;
            }
            if (var20 < 127 && var22 < 127 && class401.field5859[var20 + 1][var22 + 1] == 0 && (var19[var23 + 1][var21 + 1] & 0x78240000) == 0 && (var19[var23 + 1][var21] & 0x60240000) == 0 && (var19[var23][var21 + 1] & 0x48240000) == 0) {
                class398.field5832[var26] = var11 + 1;
                class40.field562[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class401.field5859[var20 + 1][var22 + 1] = 12;
                class309.field4648[var20 + 1][var22 + 1] = var25;
            }
        }
        class379.field5639 = var12;
        class270.field4001 = var11;
        return false;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(BLre;)Ljava/lang/String;", line = 886)
    public final String method754(byte arg0, class446 arg1) {
        field1384++;
        if (arg0 != 94) {
            method755((byte) 49, true);
        }
        StringBuffer var3 = new StringBuffer(80);
        if (this.field1371 != null) {
            for (int var4 = 0; var4 < this.field1371.length; var4++) {
                var3.append(this.field1370[var4]);
                var3.append(class475.method2768(this.field1371[var4], this.field1388[var4], arg1.method2625(-111, class4.field76[this.field1371[var4]]), (byte) -126));
            }
        }
        var3.append(this.field1370[this.field1370.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(BZ)V", line = 915)
    public static final void method755(byte arg0, boolean arg1) {
        field1391++;
        if (class134.field1954 == null) {
            class134.field1954 = new byte[4][class379.field5642][class456.field6477];
        }
        if (!arg1) {
            field1390 = null;
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < class379.field5642; var3++) {
                for (int var4 = 0; var4 < class456.field6477; var4++) {
                    class134.field1954[var2][var3][var4] = arg0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z)Ljava/lang/String;", line = 952)
    public final String method756(boolean arg0) {
        field1389++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field1370 == null) {
            return "";
        }
        var2.append(this.field1370[0]);
        if (!arg0) {
            return null;
        }
        for (int var3 = 1; var3 < this.field1370.length; var3++) {
            var2.append("...");
            var2.append(this.field1370[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "(I)I", line = 985)
    public final int method757(int arg0) {
        if (arg0 <= 95) {
            this.field1371 = null;
        }
        field1373++;
        return this.field1371 == null ? 0 : this.field1371.length;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lre;I[I)V", line = 1007)
    public final void method758(class446 arg0, int arg1, int[] arg2) {
        field1378++;
        if (this.field1371 == null) {
            return;
        }
        int var4 = -16 / ((arg1 - 57) / 50);
        for (int var5 = 0; var5 < this.field1371.length; var5++) {
            if (var5 >= arg2.length) {
                return;
            }
            int var6 = class410.field5939[this.method752(var5, -1)];
            if (var6 > 0) {
                arg0.method2599(var6, (byte) 28, (long) arg2[var5]);
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(III)I", line = 1034)
    public static final int method759(int arg0, int arg1, int arg2) {
        if (arg1 != 29313) {
            method755((byte) -26, true);
        }
        field1387++;
        int var3 = 1;
        while (arg2 > 1) {
            if ((arg2 & 0x1) != 0) {
                var3 = arg0 * var3;
            }
            arg2 >>= 0x1;
            arg0 *= arg0;
        }
        if (arg2 == 1) {
            return arg0 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "(I)V", line = 1063)
    public static void method760(int arg0) {
        field1386 = null;
        if (arg0 != 0) {
            method749((class239) null, 20, -76, (class290) null, (class63) null, 58, (byte) -61, (class94) null);
        }
        field1390 = null;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIB)I", line = 1077)
    public final int method761(int arg0, int arg1, byte arg2) {
        if (arg2 >= -21) {
            this.field1388 = null;
        }
        field1376++;
        if (this.field1371 == null || arg1 < 0 || this.field1371.length < arg1) {
            return -1;
        } else if (this.field1388[arg1] == null || arg0 < 0 || arg0 > this.field1388[arg1].length) {
            return -1;
        } else {
            return this.field1388[arg1][arg0];
        }
    }
}
