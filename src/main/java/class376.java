import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class376 extends class133 {

    @OriginalMember(owner = "client!bf", name = "x", descriptor = "Lsr;")
    public class167 field5097 = new class167();

    @OriginalMember(owner = "client!bf", name = "A", descriptor = "Ltr;")
    public class194 field5100 = new class194();

    @OriginalMember(owner = "client!bf", name = "t", descriptor = "Lqm;")
    private class98 field5093;

    @OriginalMember(owner = "client!bf", name = "u", descriptor = "Lao;")
    public static class191 field5094 = new class191(54, 0);

    @OriginalMember(owner = "client!bf", name = "D", descriptor = "[Ljava/lang/String;")
    public static String[] field5103 = new String[5];

    @OriginalMember(owner = "client!bf", name = "E", descriptor = "Lao;")
    public static class191 field5104 = new class191(9, -2);

    @OriginalMember(owner = "client!bf", name = "p", descriptor = "I")
    public static int field5089;

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "I")
    public static int field5090;

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "I")
    public static int field5091;

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "I")
    public static int field5092;

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "I")
    public static int field5095;

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "I")
    public static int field5096;

    @OriginalMember(owner = "client!bf", name = "y", descriptor = "I")
    public static int field5098;

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "I")
    public static int field5099;

    @OriginalMember(owner = "client!bf", name = "B", descriptor = "I")
    public static int field5101;

    @OriginalMember(owner = "client!bf", name = "C", descriptor = "I")
    public static int field5102;

    @OriginalMember(owner = "client!bf", name = "F", descriptor = "I")
    public static int field5105;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(I)V")
    public static final void method2218(int arg0) {
        if (arg0 != -22407) {
            field5104 = null;
        }
        field5101++;
        class153.field2000++;
        class492.method2979(class237.field3154, 53);
        class106.field1443.method2444((byte) 65, class263.field3537);
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "()Lvb;")
    public final class133 method602() {
        field5105++;
        class163 var1 = (class163) this.field5097.method970(12);
        if (var1 == null) {
            return null;
        } else if (var1.field2128 == null) {
            return this.method596();
        } else {
            return var1.field2128;
        }
    }

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "()V")
    public static final void method2219() {
        class291.field3837 = 0;
        label212: for (int var0 = 0; var0 < class421.field6116; var0++) {
            class250 var1 = class508.field7354[var0];
            if (class499.field7282 != null) {
                for (int var2 = 0; var2 < class499.field7282.length; var2++) {
                    if (class499.field7282[var2] != -1000000 && (var1.field3331 <= class499.field7282[var2] || var1.field3342 <= class499.field7282[var2]) && (var1.field3328 <= class254.field3383[var2] || var1.field3343 <= class254.field3383[var2]) && (var1.field3328 >= class128.field1660[var2] || var1.field3343 >= class128.field1660[var2]) && (var1.field3339 <= class216.field2952[var2] || var1.field3338 <= class216.field2952[var2]) && (var1.field3339 >= class62.field710[var2] || var1.field3338 >= class62.field710[var2])) {
                        continue label212;
                    }
                }
            }
            if (var1.field3330 == 1) {
                int var3 = var1.field3346 + class349.field4645 - class151.field1977;
                if (var3 >= 0 && var3 <= class349.field4645 + class349.field4645) {
                    int var4 = var1.field3324 + class349.field4645 - class122.field1577;
                    if (var4 < 0) {
                        var4 = 0;
                    } else if (var4 > class349.field4645 + class349.field4645) {
                        continue;
                    }
                    int var5 = var1.field3344 + class349.field4645 - class122.field1577;
                    if (var5 > class349.field4645 + class349.field4645) {
                        var5 = class349.field4645 + class349.field4645;
                    } else if (var5 < 0) {
                        continue;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class487.field7157[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class466.field6933 - var1.field3328;
                        if (var7 > class466.field6934) {
                            var1.field3336 = 1;
                        } else {
                            if (var7 >= -class466.field6934) {
                                continue;
                            }
                            var1.field3336 = 2;
                            var7 = -var7;
                        }
                        var1.field3323 = (var1.field3339 - class14.field153 << 8) / var7;
                        var1.field3340 = (var1.field3338 - class14.field153 << 8) / var7;
                        var1.field3332 = (var1.field3331 - class272.field3637 << 8) / var7;
                        var1.field3333 = (var1.field3342 - class272.field3637 << 8) / var7;
                        class281.field3724[class291.field3837++] = var1;
                    }
                }
            } else if (var1.field3330 == 2) {
                int var8 = var1.field3324 + class349.field4645 - class122.field1577;
                if (var8 >= 0 && var8 <= class349.field4645 + class349.field4645) {
                    int var9 = var1.field3346 + class349.field4645 - class151.field1977;
                    if (var9 < 0) {
                        var9 = 0;
                    } else if (var9 > class349.field4645 + class349.field4645) {
                        continue;
                    }
                    int var10 = var1.field3325 + class349.field4645 - class151.field1977;
                    if (var10 > class349.field4645 + class349.field4645) {
                        var10 = class349.field4645 + class349.field4645;
                    } else if (var10 < 0) {
                        continue;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class487.field7157[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class14.field153 - var1.field3339;
                        if (var12 > class466.field6934) {
                            var1.field3336 = 3;
                        } else {
                            if (var12 >= -class466.field6934) {
                                continue;
                            }
                            var1.field3336 = 4;
                            var12 = -var12;
                        }
                        var1.field3347 = (var1.field3328 - class466.field6933 << 8) / var12;
                        var1.field3326 = (var1.field3343 - class466.field6933 << 8) / var12;
                        var1.field3332 = (var1.field3331 - class272.field3637 << 8) / var12;
                        var1.field3333 = (var1.field3342 - class272.field3637 << 8) / var12;
                        class281.field3724[class291.field3837++] = var1;
                    }
                }
            } else if (var1.field3330 == 4) {
                int var13 = var1.field3331 - class272.field3637;
                if (var13 > class270.field3605) {
                    int var14 = var1.field3324 + class349.field4645 - class122.field1577;
                    if (var14 < 0) {
                        var14 = 0;
                    } else if (var14 > class349.field4645 + class349.field4645) {
                        continue;
                    }
                    int var15 = var1.field3344 + class349.field4645 - class122.field1577;
                    if (var15 > class349.field4645 + class349.field4645) {
                        var15 = class349.field4645 + class349.field4645;
                    } else if (var15 < 0) {
                        continue;
                    }
                    int var16 = var1.field3346 + class349.field4645 - class151.field1977;
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (var16 > class349.field4645 + class349.field4645) {
                        continue;
                    }
                    int var17 = var1.field3325 + class349.field4645 - class151.field1977;
                    if (var17 > class349.field4645 + class349.field4645) {
                        var17 = class349.field4645 + class349.field4645;
                    } else if (var17 < 0) {
                        continue;
                    }
                    boolean var18 = false;
                    label184: for (int var19 = var16; var19 <= var17; var19++) {
                        for (int var20 = var14; var20 <= var15; var20++) {
                            if (class487.field7157[var19][var20]) {
                                var18 = true;
                                break label184;
                            }
                        }
                    }
                    if (var18) {
                        var1.field3336 = 5;
                        var1.field3347 = (var1.field3328 - class466.field6933 << 8) / var13;
                        var1.field3326 = (var1.field3343 - class466.field6933 << 8) / var13;
                        var1.field3323 = (var1.field3339 - class14.field153 << 8) / var13;
                        var1.field3340 = (var1.field3338 - class14.field153 << 8) / var13;
                        class281.field3724[class291.field3837++] = var1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "()Lvb;")
    public final class133 method596() {
        field5092++;
        class163 var1;
        do {
            var1 = (class163) this.field5097.method976((byte) -119);
            if (var1 == null) {
                return null;
            }
        } while (var1.field2128 == null);
        return var1.field2128;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "()I")
    public final int method594() {
        field5096++;
        return 0;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "([III)V")
    public final void method572(int[] arg0, int arg1, int arg2) {
        field5098++;
        this.field5100.method572(arg0, arg1, arg2);
        for (class163 var4 = (class163) this.field5097.method970(12); var4 != null; var4 = (class163) this.field5097.method976((byte) 77)) {
            if (!this.field5093.method577(var4, (byte) 98)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var5 <= var4.field2121) {
                        this.method2221(var5, var4, arg0, var6, var6 + var5, -63);
                        var4.field2121 -= var5;
                        break;
                    }
                    this.method2221(var4.field2121, var4, arg0, var6, var5 + var6, -125);
                    var5 -= var4.field2121;
                    var6 += var4.field2121;
                } while (!this.field5093.method561(var6, var4, (byte) 127, arg0, var5));
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IBII)I")
    public static final int method2220(int arg0, byte arg1, int arg2, int arg3) {
        field5091++;
        int var4 = arg3 & 0x3;
        if (arg1 > -113) {
            method2219();
        }
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 1023 - arg0;
        } else if (var4 == 2) {
            return 1023 - arg2;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)V")
    public final void method580(int arg0) {
        field5089++;
        this.field5100.method580(arg0);
        for (class163 var2 = (class163) this.field5097.method970(12); var2 != null; var2 = (class163) this.field5097.method976((byte) 121)) {
            if (!this.field5093.method577(var2, (byte) 126)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2121) {
                        this.method2222(var2, var3, -125);
                        var2.field2121 -= var3;
                        break;
                    }
                    this.method2222(var2, var2.field2121, 30);
                    var3 -= var2.field2121;
                } while (!this.field5093.method561(0, var2, (byte) 119, null, var3));
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILig;[IIII)V")
    private final void method2221(int arg0, class163 arg1, int[] arg2, int arg3, int arg4, int arg5) {
        field5090++;
        if ((this.field5093.field1286[arg1.field2139] & 0x4) != 0 && arg1.field2138 < 0) {
            int var7 = this.field5093.field1290[arg1.field2139] / class286.field3762;
            while (true) {
                int var8 = (var7 + 1048575 - arg1.field2132) / var7;
                if (var8 > arg0) {
                    arg1.field2132 += arg0 * var7;
                    break;
                }
                arg1.field2128.method572(arg2, arg3, var8);
                arg0 -= var8;
                arg1.field2132 += var7 * var8 - 1048576;
                arg3 += var8;
                int var9 = class286.field3762 / 100;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class224 var11 = arg1.field2128;
                if (this.field5093.field1302[arg1.field2139] == 0) {
                    arg1.field2128 = class224.method1409(arg1.field2125, var11.method1423(), var11.method1438(), var11.method1442());
                } else {
                    arg1.field2128 = class224.method1409(arg1.field2125, var11.method1423(), 0, var11.method1442());
                    this.field5093.method562(false, arg1.field2136.field5487[arg1.field2118] < 0, arg1);
                    arg1.field2128.method1414(var9, var11.method1438());
                }
                if (arg1.field2136.field5487[arg1.field2118] < 0) {
                    arg1.field2128.method1407(-1);
                }
                var11.method1422(var9);
                var11.method572(arg2, arg3, arg4 - arg3);
                if (var11.method1444()) {
                    this.field5100.method1110(var11);
                }
            }
        }
        if (arg5 <= -11) {
            arg1.field2128.method572(arg2, arg3, arg0);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lig;II)V")
    private final void method2222(class163 arg0, int arg1, int arg2) {
        field5099++;
        if ((this.field5093.field1286[arg0.field2139] & 0x4) != 0 && arg0.field2138 < 0) {
            int var4 = this.field5093.field1290[arg0.field2139] / class286.field3762;
            int var5 = (var4 + 1048575 - arg0.field2132) / var4;
            arg0.field2132 = arg1 * var4 + arg0.field2132 & 0xFFFFF;
            if (arg1 >= var5) {
                if (this.field5093.field1302[arg0.field2139] == 0) {
                    arg0.field2128 = class224.method1409(arg0.field2125, arg0.field2128.method1423(), arg0.field2128.method1438(), arg0.field2128.method1442());
                } else {
                    arg0.field2128 = class224.method1409(arg0.field2125, arg0.field2128.method1423(), 0, arg0.field2128.method1442());
                    this.field5093.method562(false, arg0.field2136.field5487[arg0.field2118] < 0, arg0);
                }
                if (arg0.field2136.field5487[arg0.field2118] < 0) {
                    arg0.field2128.method1407(-1);
                }
                arg1 = arg0.field2132 / var4;
            }
        }
        arg0.field2128.method580(arg1);
        int var6 = 120 / ((-arg2 - 76) / 33);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIILza;)V")
    public static final void method2223(int arg0, int arg1, int arg2, class287 arg3) {
        field5102++;
        if (arg0 < ~arg2 || arg1 < 0 || class214.field2931 == 0 || class349.field4640 == 0) {
            return;
        }
        arg3.method1221(class122.field1576, class141.field1868, class214.field2931, class349.field4640);
        arg3.method1182(class102.field1391, class527.field7741, class214.field2931, class349.field4640);
        class124 var4 = arg3.method1125();
        var4.method752(class159.field2070, class460.field6861, class482.field7115, class130.field1684, class365.field4987, class135.field1789);
        arg3.method1227(var4);
        if (class14.field152 != null) {
            int var5 = -1;
            int var6 = -1;
            int var7 = arg3.method1234();
            int var8 = (arg2 - class122.field1576) * var7 / class214.field2931;
            int var9 = (arg1 - class141.field1868) * var7 / class349.field4640;
            int var10 = arg3.method1141();
            int var11 = (arg2 - class122.field1576) * var10 / class214.field2931;
            int var12 = (arg1 - class141.field1868) * var10 / class349.field4640;
            int[] var13 = new int[] { var8, var9, var7 };
            var4.method754(var13);
            int[] var14 = new int[] { var11, var12, var10 };
            var4.method754(var14);
            float var15 = 0.0F;
            int var16 = var14[0] - var13[0];
            int var17 = var14[1] - var13[1];
            int var18 = var14[2] - var13[2];
            while (var15 < 1.0F) {
                int var19 = (int) ((float) var16 * var15 + (float) var13[0]);
                int var20 = var19 >> 7;
                int var21 = (int) ((float) var18 * var15 + (float) var13[2]);
                int var22 = var21 >> 7;
                if (var20 > 0 && var22 > 0 && class308.field4128 > var20 && var22 < class426.field6200) {
                    int var23 = class96.field1170.field3695;
                    if (var23 < 3 && (class252.field3358[1][var20][var22] & 0x2) != 0) {
                        var23++;
                    }
                    if ((float) class14.field152[var23].method216(var19, var21) < (float) var17 * var15 + (float) var13[1]) {
                        var5 = (class96.field1170.method546(24273) - 1 << 6) + var19 >> 7;
                        var6 = (class96.field1170.method546(arg0 ^ -24274) - 1 << 6) + var21 >> 7;
                        break;
                    }
                }
                var15 = (float) ((double) var15 + 0.01D);
            }
            if (var5 != -1 && var6 != -1) {
                if (class323.field4302 && (class41.field448 & 0x40) != 0) {
                    class450 var24 = class19.method108(true, class519.field7656, class235.field3143);
                    if (var24 == null) {
                        class227.method1451(4226);
                    } else {
                        class144.method878(-1, var5, 23, class48.field531, " ->", var6, class207.field2724, 0L, true, false, (byte) -119);
                    }
                } else {
                    if (class381.field5520 == class373.field5065) {
                        class144.method878(-1, var5, 15, class105.field1414.method1823(class374.field5072, (byte) -88), "", var6, -1, 0L, true, false, (byte) -108);
                    }
                    class447.field6509++;
                    class144.method878(-1, var5, 5, class465.field6918, "", var6, class125.field1621, 0L, true, false, (byte) -111);
                }
            }
        }
        class49 var25 = class249.field3320;
        for (class23 var26 = (class23) var25.method290(arg0); var26 != null; var26 = (class23) var25.method284(10748)) {
            if ((class281.field3720 || class96.field1170.field3695 == var26.field234) && var26.method136(arg1, arg2, 0, arg3)) {
                if (var26.field236 instanceof class531) {
                    class531 var27 = (class531) var26.field236;
                    int var28 = var27.method546(24273);
                    if ((var28 & 0x1) == 0 && (var27.field3704 & 0x7F) == 0 && (var27.field3694 & 0x7F) == 0 || (var28 & 0x1) == 1 && (var27.field3704 & 0x7F) == 64 && (var27.field3694 & 0x7F) == 64) {
                        int var29 = var27.field3704 - (var27.method546(arg0 ^ 0xFFFFA12E) - 1 << 6);
                        int var30 = var27.field3694 - (var27.method546(24273) - 1 << 6);
                        for (int var31 = 0; var31 < class401.field5813; var31++) {
                            class22 var38 = class339.field4484[class337.field4465[var31]];
                            if (var38 != null && class532.field7836 != var38.field1160 && var38.field1235) {
                                int var39 = var38.field3704 - (var38.field220.field2904 - 1 << 6);
                                int var40 = var38.field3694 - (var38.field220.field2904 - 1 << 6);
                                if (var29 <= var39 && var38.field220.field2904 <= (var27.method546(24273) - (var39 - var29 >> 7)) && var30 <= var40 && var38.field220.field2904 <= var27.method546(24273) - (var40 - var30 >> 7)) {
                                    class313.method1861(var38, (byte) 110, class96.field1170.field3695 != var26.field234);
                                    var38.field1160 = class532.field7836;
                                }
                            }
                        }
                        int var32 = class461.field6877;
                        int[] var33 = class342.field4589;
                        for (int var34 = 0; var34 < var32; var34++) {
                            class531 var35 = class29.field272[var33[var34]];
                            if (var35 != null && class532.field7836 != var35.field1160 && var27 != var35 && var35.field1235) {
                                int var36 = var35.field3704 - (var35.method546(arg0 + 24274) - 1 << 6);
                                int var37 = var35.field3694 - (var35.method546(24273) - 1 << 6);
                                if (var29 <= var36 && var35.method546(24273) <= var27.method546(24273) - (var36 - var29 >> 7) && var37 >= var30 && var35.method546(24273) <= var27.method546(24273) - (var37 - var30 >> 7)) {
                                    class316.method1869((byte) -122, var35, class96.field1170.field3695 != var26.field234);
                                    var35.field1160 = class532.field7836;
                                }
                            }
                        }
                    }
                    if (class532.field7836 == var27.field1160) {
                        continue;
                    }
                    class316.method1869((byte) -122, var27, class96.field1170.field3695 != var26.field234);
                    var27.field1160 = class532.field7836;
                }
                if (var26.field236 instanceof class22) {
                    class22 var41 = (class22) var26.field236;
                    if (var41.field220 != null) {
                        if ((var41.field220.field2904 & 0x1) == 0 && (var41.field3704 & 0x7F) == 0 && (var41.field3694 & 0x7F) == 0 || (var41.field220.field2904 & 0x1) == 1 && (var41.field3704 & 0x7F) == 64 && (var41.field3694 & 0x7F) == 64) {
                            int var42 = var41.field3704 - (var41.field220.field2904 - 1 << 6);
                            int var43 = var41.field3694 - (var41.field220.field2904 - 1 << 6);
                            for (int var44 = 0; var44 < class401.field5813; var44++) {
                                class22 var51 = class339.field4484[class337.field4465[var44]];
                                if (var51 != null && class532.field7836 != var51.field1160 && var41 != var51 && var51.field1235) {
                                    int var52 = var51.field3704 - (var51.field220.field2904 - 1 << 6);
                                    int var53 = var51.field3694 - (var51.field220.field2904 - 1 << 6);
                                    if (var42 <= var52 && (var41.field220.field2904 - (var52 - var42 >> 7)) >= var51.field220.field2904 && var53 >= var43 && var51.field220.field2904 <= (var41.field220.field2904 - (var53 - var43 >> 7))) {
                                        class313.method1861(var51, (byte) 110, class96.field1170.field3695 != var26.field234);
                                        var51.field1160 = class532.field7836;
                                    }
                                }
                            }
                            int var45 = class461.field6877;
                            int[] var46 = class342.field4589;
                            for (int var47 = 0; var47 < var45; var47++) {
                                class531 var48 = class29.field272[var46[var47]];
                                if (var48 != null && class532.field7836 != var48.field1160 && var48.field1235) {
                                    int var49 = var48.field3704 - (var48.method546(24273) - 1 << 6);
                                    int var50 = var48.field3694 - (var48.method546(arg0 ^ 0xFFFFA12E) - 1 << 6);
                                    if (var49 >= var42 && var48.method546(24273) <= var41.field220.field2904 - (var49 - var42 >> 7) && var50 >= var43 && var48.method546(24273) <= (var41.field220.field2904 - (var50 - var43 >> 7))) {
                                        class316.method1869((byte) -127, var48, class96.field1170.field3695 != var26.field234);
                                        var48.field1160 = class532.field7836;
                                    }
                                }
                            }
                        }
                        if (class532.field7836 == var41.field1160) {
                            continue;
                        }
                        class313.method1861(var41, (byte) 110, class96.field1170.field3695 != var26.field234);
                        var41.field1160 = class532.field7836;
                    }
                }
                if (var26.field236 instanceof class471) {
                    class166 var54 = (class166) class243.field3208.method295((long) (var26.field228 | var26.field237 << 14 | var26.field234 << 28), -109);
                    if (var54 != null) {
                        for (class364 var55 = (class364) var54.field2147.method981(116); var55 != null; var55 = (class364) var54.field2147.method972(-113)) {
                            class199 var56 = class237.field3158.method236(-18315, var55.field4971);
                            if (!class323.field4302) {
                                if (class96.field1170.field3695 == var26.field234) {
                                    String[] var58 = var56.field2655;
                                    for (int var59 = 4; var59 >= 0; var59--) {
                                        if (var58 != null && var58[var59] != null) {
                                            byte var60 = 0;
                                            if (var59 == 0) {
                                                var60 = 17;
                                            }
                                            int var61 = class105.field1416;
                                            if (var59 == 1) {
                                                var60 = 50;
                                            }
                                            if (var59 == 2) {
                                                var60 = 49;
                                            }
                                            if (var59 == 3) {
                                                var60 = 12;
                                            }
                                            if (var59 == 4) {
                                                var60 = 4;
                                            }
                                            if (var56.field2593 == var59) {
                                                var61 = var56.field2595;
                                            }
                                            if (var56.field2610 == var59) {
                                                var61 = var56.field2632;
                                            }
                                            class144.method878(-1, var26.field228, var60, var58[var59], "<col=ff9040>" + var56.field2623, var26.field237, var61, (long) var55.field4971, true, false, (byte) -57);
                                            class10.field116++;
                                        }
                                    }
                                }
                                class144.method878(-1, var26.field228, 1011, class451.field6722.method1823(class374.field5072, (byte) -88), "<col=ff9040>" + var56.field2623, var26.field237, class300.field3942, (long) var55.field4971, true, class96.field1170.field3695 != var26.field234, (byte) -64);
                                class126.field1636++;
                            } else if (class96.field1170.field3695 == var26.field234) {
                                class87 var57 = class324.field4307 == -1 ? null : class104.field1405.method449((byte) 118, class324.field4307);
                                if ((class41.field448 & 0x1) != 0 && (var57 == null || var56.method1285(477, var57.field1031, class324.field4307) != var57.field1031)) {
                                    class10.field115++;
                                    class144.method878(-1, var26.field228, 59, class48.field531, class191.field2465 + " -> <col=ff9040>" + var56.field2623, var26.field237, class207.field2724, (long) var55.field4971, true, false, (byte) -92);
                                }
                            }
                        }
                    }
                }
                if (var26.field236 instanceof class448) {
                    class448 var62 = (class448) var26.field236;
                    class70 var63 = class123.field1593.method2920(var62.method46(arg0 ^ 0x7B), 19219);
                    if (var63.field848 != null) {
                        var63 = var63.method403(-1, class52.field606);
                    }
                    if (var63 != null) {
                        if (!class323.field4302) {
                            if (class96.field1170.field3695 == var26.field234) {
                                String[] var64 = var63.field835;
                                if (var64 != null) {
                                    for (int var65 = 4; var65 >= 0; var65--) {
                                        if (var64[var65] != null) {
                                            short var66 = 0;
                                            if (var65 == 0) {
                                                var66 = 58;
                                            }
                                            int var67 = class105.field1416;
                                            if (var65 == 1) {
                                                var66 = 30;
                                            }
                                            if (var65 == 2) {
                                                var66 = 47;
                                            }
                                            if (var65 == 3) {
                                                var66 = 13;
                                            }
                                            if (var65 == 4) {
                                                var66 = 1009;
                                            }
                                            if (var63.field837 == var65) {
                                                var67 = var63.field884;
                                            }
                                            if (var63.field860 == var65) {
                                                var67 = var63.field843;
                                            }
                                            class474.field7025++;
                                            class144.method878(-1, var26.field228, var66, var64[var65], "<col=00ffff>" + var63.field841, var26.field237, var67, class254.method1576(var62, var26.field228, 7, var26.field237), true, false, (byte) -58);
                                        }
                                    }
                                }
                            }
                            class379.field5483++;
                            class144.method878(-1, var26.field228, 1002, class451.field6722.method1823(class374.field5072, (byte) -88), "<col=00ffff>" + var63.field841, var26.field237, class300.field3942, (long) var63.field834, true, class96.field1170.field3695 != var26.field234, (byte) -85);
                        } else if (class96.field1170.field3695 == var26.field234) {
                            class87 var68 = class324.field4307 == -1 ? null : class104.field1405.method449((byte) -67, class324.field4307);
                            if ((class41.field448 & 0x4) != 0 && (var68 == null || var63.method419(-29295, var68.field1031, class324.field4307) != var68.field1031)) {
                                class499.field7281++;
                                class144.method878(-1, var26.field228, 20, class48.field531, class191.field2465 + " -> <col=00ffff>" + var63.field841, var26.field237, class207.field2724, class254.method1576(var62, var26.field228, arg0 + 100, var26.field237), true, false, (byte) -106);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIII)V")
    public static final void method2224(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5095++;
        float var5 = (float) class416.field6015 / (float) class416.field6014;
        int var6 = arg1;
        int var7 = arg4;
        if ((var5 < 1.0F)) {
            var7 = (int) ((float) arg1 * var5);
        } else {
            var6 = (int) ((float) arg4 / var5);
        }
        int var8 = arg0 - (arg1 - var6) / 2;
        int var9 = arg2 - (arg4 - var7) / arg3;
        class508.field7367 = -1;
        class49.field556 = class416.field6014 * var8 / var6;
        class163.field2133 = class416.field6015 - (class416.field6015 * var9 / var7);
        class178.field2308 = -1;
        class104.method631((byte) 31);
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lqm;)V")
    public class376(class98 arg0) {
        this.field5093 = arg0;
    }

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "(I)V")
    public static void method2225(int arg0) {
        if (arg0 != 127) {
            method2220(-37, (byte) 95, 80, -32);
        }
        field5103 = null;
        field5104 = null;
        field5094 = null;
    }
}
