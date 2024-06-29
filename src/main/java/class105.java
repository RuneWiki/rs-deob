import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class105 extends class24 {

    @OriginalMember(owner = "client!qu", name = "w", descriptor = "I")
    private int field1444;

    @OriginalMember(owner = "client!qu", name = "x", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!qu", name = "y", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!qu", name = "z", descriptor = "I")
    private int field1447;

    @OriginalMember(owner = "client!qu", name = "A", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!qu", name = "B", descriptor = "I")
    private int field1449;

    @OriginalMember(owner = "client!qu", name = "C", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!qu", name = "E", descriptor = "I")
    private int field1451;

    @OriginalMember(owner = "client!qu", name = "F", descriptor = "Lda;")
    public static class66 field1452;

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(ILjp;)V", line = 5)
    public final void method191(int arg0, class376 arg1) {
        this.field1449 = arg1.method2384(27);
        field1448++;
        this.field1451 = arg1.method2384(51);
        if (arg0 <= -56) {
            this.field1447 = arg1.method2398(-1372747256);
            this.field1444 = arg1.method2398(-1372747256);
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lke;I)V", line = 20)
    public final void method190(class625 arg0, int arg1) {
        field1450++;
        arg0.method3441(this.field1449, this.field1451, this.field1444, true, this.field1447);
        if (arg1 != 5) {
            this.field1451 = -89;
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(I)V", line = 34)
    public static final void method804(int arg0) {
        field1445++;
        if (class712.field9959.field1313.method1949(68) != 2) {
            return;
        }
        byte var1 = (byte) (class320.field4604 - 4 & 0xFF);
        int var2 = class320.field4604 % class597.field8132;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var18 = 0; var18 < class628.field8800; var18++) {
                class625.field8439[var3][var2][var18] = var1;
            }
        }
        if (class610.field8296 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class778.field10683[var4] = -1000000;
            class121.field1768[var4] = 1000000;
            class364.field5305[var4] = 0;
            class597.field8135[var4] = 1000000;
            class5.field53[var4] = 0;
        }
        int var5 = class551.field7456.field2257;
        int var6 = class551.field7456.field2259;
        if (arg0 < 34) {
            method806(-87);
        }
        if (class502.field6938 != 1 && class518.field7072 == -1) {
            int var7 = class783.method4338(class610.field8296, class634.field8856, -12040, class350.field5138);
            if (var7 - class405.field5867 < 3200 && (class66.field931[class610.field8296][class634.field8856 >> 9][class350.field5138 >> 9] & 0x4) != 0) {
                class718.method4012(1, false, class350.field5138 >> 9, 118, class626.field8501, class634.field8856 >> 9);
                return;
            }
            return;
        }
        if (class502.field6938 != 1) {
            var5 = class518.field7072;
            var6 = class704.field9868;
        }
        if ((class66.field931[class610.field8296][var5 >> 9][var6 >> 9] & 0x4) != 0) {
            class718.method4012(0, false, var6 >> 9, 114, class626.field8501, var5 >> 9);
        }
        if (class253.field3733 >= 2560) {
            return;
        }
        int var8 = class634.field8856 >> 9;
        int var9 = class350.field5138 >> 9;
        int var10 = var5 >> 9;
        int var11 = var6 >> 9;
        int var12;
        if (var10 <= var8) {
            var12 = var8 - var10;
        } else {
            var12 = var10 - var8;
        }
        int var13;
        if (var9 < var11) {
            var13 = var11 - var9;
        } else {
            var13 = var9 - var11;
        }
        if (var12 == 0 && var13 == 0 || var12 <= -class597.field8132 || var12 >= class597.field8132 || (-class628.field8800) >= var13 || class628.field8800 <= var13) {
            class664.method3681((byte) -23, "RC: " + var8 + "," + var9 + " " + var10 + "," + var11 + " " + class121.field1765 + "," + class230.field3147, null);
            return;
        }
        if (var13 >= var12) {
            int var14 = var12 * 65536 / var13;
            int var15 = 32768;
            while (var9 != var11) {
                if (var9 < var11) {
                    var9++;
                } else if (var9 > var11) {
                    var9--;
                }
                if ((class66.field931[class610.field8296][var8][var9] & 0x4) != 0) {
                    class718.method4012(1, false, var9, 120, class626.field8501, var8);
                    return;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    var15 -= 65536;
                    if (var10 > var8) {
                        var8++;
                    } else if (var10 < var8) {
                        var8--;
                    }
                    if ((class66.field931[class610.field8296][var8][var9] & 0x4) != 0) {
                        class718.method4012(1, false, var9, 121, class626.field8501, var8);
                        return;
                    }
                }
            }
            return;
        }
        int var16 = var13 * 65536 / var12;
        int var17 = 32768;
        while (var8 != var10) {
            if (var8 < var10) {
                var8++;
            } else if (var10 < var8) {
                var8--;
            }
            if ((class66.field931[class610.field8296][var8][var9] & 0x4) != 0) {
                class718.method4012(1, false, var9, 122, class626.field8501, var8);
                return;
            }
            var17 += var16;
            if (var17 >= 65536) {
                if (var11 > var9) {
                    var9++;
                } else if (var11 < var9) {
                    var9--;
                }
                var17 -= 65536;
                if ((class66.field931[class610.field8296][var8][var9] & 0x4) != 0) {
                    class718.method4012(1, false, var9, 107, class626.field8501, var8);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "(I)V", line = 242)
    public static final void method805(int arg0) {
        field1446++;
        if (class674.field9468 == 0 || class674.field9468 == 10) {
            return;
        }
        try {
            short var1;
            if (class113.field1541 == 0) {
                var1 = 250;
            } else {
                var1 = 2000;
            }
            if (class57.field801 && class674.field9468 >= 6) {
                var1 = 6000;
            }
            if (++class12.field180 > var1) {
                if (class457.field6340 != null) {
                    class457.field6340.method3027(arg0 + 19575);
                    class457.field6340 = null;
                }
                if (class113.field1541 >= 3) {
                    class674.field9468 = 0;
                    class624.method3415(-5, 2);
                    return;
                }
                if (class397.field5830 == 2) {
                    class369.field5359.method680(arg0 ^ 0xFFFF19C1);
                } else {
                    class691.field9698.method680(43594);
                }
                class12.field180 = 0;
                class113.field1541++;
                class674.field9468 = 1;
            }
            if (class674.field9468 == 1) {
                if (class397.field5830 == 2) {
                    class434.field6144 = class369.field5359.method677((byte) 104, class730.field10124);
                } else {
                    class434.field6144 = class691.field9698.method677((byte) 104, class730.field10124);
                }
                class674.field9468 = 2;
            }
            if (class674.field9468 == 2) {
                if (class434.field6144.field8321 == 2) {
                    throw new IOException();
                }
                if (class434.field6144.field8321 != 1) {
                    return;
                }
                class457.field6340 = class754.method4202(103, (Socket) class434.field6144.field8318, 15000);
                class434.field6144 = null;
                class645.method3582(1);
                class267 var2 = class731.method4058(77);
                if (class57.field801) {
                    var2.field3938.method2380(65280, class628.field8797.field4282);
                    var2.field3938.method2415(false, 0);
                    int var3 = var2.field3938.field5459;
                    var2.field3938.method2354(649, (byte) 124);
                    if (class397.field5830 == 2) {
                        var2.field3938.method2380(65280, class458.field6355 == 13 ? 1 : 0);
                    }
                    class376 var4 = class52.method384((byte) -68);
                    var4.method2380(arg0 + 84853, class450.field6276);
                    var4.method2415(false, (int) (Math.random() * 9.9999999E7D));
                    var4.method2380(arg0 + 84853, class38.field589);
                    var4.method2354(class444.field6231, (byte) 97);
                    for (int var5 = 0; var5 < 6; var5++) {
                        var4.method2354((int) (Math.random() * 9.9999999E7D), (byte) 99);
                    }
                    var4.method2369(arg0 + 19570, class177.field2365);
                    var4.method2380(65280, class21.field332.field4207);
                    var4.method2380(arg0 + 84853, (int) (Math.random() * 9.9999999E7D));
                    var4.method2367(class46.field696, class384.field5620, (byte) 90);
                    var2.field3938.method2403(var4.field5518, var4.field5459, 128, 0);
                    var2.field3938.method2395(var2.field3938.field5459 - var3, arg0 ^ 0xFFFFB38B);
                } else {
                    var2.field3938.method2380(65280, class628.field8782.field4282);
                }
                class617.method3392(var2, true);
                class101.method793((byte) -40);
                class674.field9468 = 3;
            }
            if (class674.field9468 == 3) {
                if (!class457.field6340.method3025(1, 55)) {
                    return;
                }
                class457.field6340.method3028(-87, 1, class89.field1233.field5518, 0);
                int var6 = class89.field1233.field5518[0] & 0xFF;
                if (var6 != 0) {
                    class674.field9468 = 0;
                    class624.method3415(var6, 2);
                    class457.field6340.method3027(2);
                    class457.field6340 = null;
                    class389.method2463(116);
                    return;
                }
                if (class57.field801) {
                    class674.field9468 = 4;
                } else {
                    class674.field9468 = 8;
                }
            }
            if (class674.field9468 == 4) {
                if (!class457.field6340.method3025(2, arg0 + 19628)) {
                    return;
                }
                class457.field6340.method3028(-116, 2, class89.field1233.field5518, 0);
                class89.field1233.field5459 = 0;
                class89.field1233.field5459 = class89.field1233.method2359(-1);
                class674.field9468 = 5;
            }
            if (class674.field9468 == 5) {
                if (!class457.field6340.method3025(class89.field1233.field5459, 55)) {
                    return;
                }
                class457.field6340.method3028(-85, class89.field1233.field5459, class89.field1233.field5518, 0);
                class89.field1233.method2386(class47.field712, (byte) 87);
                class89.field1233.field5459 = 0;
                String var7 = class89.field1233.method2350(0);
                class89.field1233.field5459 = 0;
                String var8 = "opensn";
                if (!class299.field4335 || class155.method1130((byte) 7, var7, class730.field10124, var8, 1).field8321 == 2) {
                    class700.method3898(arg0 ^ 0xFFFFB38B, true, class730.field10124, var8, var7, class712.field9959.field1270.method4293(7) == 1);
                }
                class674.field9468 = 6;
            }
            if (class674.field9468 == 6) {
                if (!class457.field6340.method3025(1, 55)) {
                    return;
                }
                class457.field6340.method3028(arg0 + 19677, 1, class89.field1233.field5518, 0);
                if ((class89.field1233.field5518[0] & 0xFF) == 1) {
                    class674.field9468 = 7;
                }
            }
            if (class674.field9468 == 7) {
                if (!class457.field6340.method3025(16, 55)) {
                    return;
                }
                class457.field6340.method3028(101, 16, class89.field1233.field5518, 0);
                class89.field1233.field5459 = 16;
                class89.field1233.method2386(class47.field712, (byte) 93);
                class89.field1233.field5459 = 0;
                class83.field1175 = class652.field9041 = class667.method3693(arg0 + 5559, class89.field1233.method2366(true));
                class170.field2269 = class89.field1233.method2366(true);
                class674.field9468 = 8;
            }
            if (arg0 != -19573) {
                field1452 = null;
            }
            if (class674.field9468 == 8) {
                class89.field1233.field5459 = 0;
                class645.method3582(1);
                class267 var9 = class731.method4058(arg0 + 19649);
                class315 var10 = var9.field3938;
                if (class397.field5830 == 2) {
                    class295 var15;
                    if (class57.field801) {
                        var15 = class628.field8798;
                    } else {
                        var15 = class628.field8788;
                    }
                    var10.method2380(arg0 ^ 0xFFFF4C8B, var15.field4282);
                    var10.method2415(false, 0);
                    int var16 = var10.field5459;
                    int var17 = var10.field5459;
                    if (!class57.field801) {
                        var10.method2354(649, (byte) 54);
                        var10.method2380(arg0 ^ 0xFFFF4C8B, class458.field6355 == 13 ? 1 : 0);
                        int var18 = var10.field5459;
                        class376 var19 = class7.method54((byte) 69);
                        var10.method2403(var19.field5518, var19.field5459, arg0 ^ 0xFFFFB30B, 0);
                        var17 = var10.field5459;
                        var10.method2349(102, class83.field1175);
                    }
                    var10.method2380(65280, class39.field623);
                    var10.method2380(65280, class485.method2816(-99));
                    var10.method2415(false, class593.field8019);
                    var10.method2415(false, class140.field2048);
                    var10.method2380(65280, class712.field9959.field1271.method2880(115));
                    class379.method2420(24, var10);
                    var10.method2349(103, class251.field3720);
                    var10.method2354(class444.field6231, (byte) 115);
                    class376 var20 = class712.field9959.method734((byte) -10);
                    var10.method2380(65280, var20.field5459);
                    var10.method2403(var20.field5518, var20.field5459, arg0 ^ 0xFFFFB30B, 0);
                    class747.field10301 = true;
                    class376 var21 = new class376(class693.field9717.method240(115));
                    class693.field9717.method239(var21, -112);
                    var10.method2403(var21.field5518, var21.field5518.length, 128, 0);
                    var10.method2415(false, class599.field8150);
                    var10.method2369(-3, class287.field4232);
                    var10.method2380(arg0 + 84853, class609.field8288 == null ? 0 : 1);
                    if (class609.field8288 != null) {
                        var10.method2349(arg0 + 19693, class609.field8288);
                    }
                    var10.method2380(65280, class463.method2749("jagtheora", (byte) -118) ? 1 : 0);
                    var10.method2380(arg0 ^ 0xFFFF4C8B, class299.field4335 ? 1 : 0);
                    class421.method2594(var10, -91);
                    var10.method2353(arg0 + 19432, var10.field5459, var17, class47.field712);
                    var10.method2395(var10.field5459 - var16, 0);
                } else {
                    class295 var11;
                    if (class57.field801) {
                        var11 = class628.field8798;
                    } else {
                        var11 = class628.field8790;
                    }
                    var10.method2380(65280, var11.field4282);
                    var10.method2415(false, 0);
                    int var12 = var10.field5459;
                    int var13 = var10.field5459;
                    if (!class57.field801) {
                        var10.method2354(649, (byte) 121);
                        class376 var14 = class7.method54((byte) 69);
                        var10.method2403(var14.field5518, var14.field5459, 128, 0);
                        var13 = var10.field5459;
                        var10.method2349(92, class83.field1175);
                    }
                    var10.method2380(65280, class21.field332.field4207);
                    var10.method2380(65280, class38.field589);
                    class379.method2420(24, var10);
                    var10.method2349(69, class251.field3720);
                    var10.method2354(class444.field6231, (byte) 115);
                    class421.method2594(var10, -81);
                    var10.method2353(-141, var10.field5459, var13, class47.field712);
                    var10.method2395(var10.field5459 - var12, 0);
                }
                class617.method3392(var9, true);
                class101.method793((byte) -90);
                class269.field3966 = new class317(class47.field712);
                for (int var22 = 0; var22 < 4; var22++) {
                    class47.field712[var22] += 50;
                }
                class89.field1233.method1982((byte) 119, class47.field712);
                class47.field712 = null;
                class674.field9468 = 9;
            }
            if (class674.field9468 == 9) {
                if (!class457.field6340.method3025(1, 55)) {
                    return;
                }
                class457.field6340.method3028(91, 1, class89.field1233.field5518, 0);
                int var23 = class89.field1233.field5518[0] & 0xFF;
                if (var23 == 21) {
                    class674.field9468 = 12;
                } else if (var23 == 29) {
                    class674.field9468 = 18;
                } else if (var23 == 1) {
                    class674.field9468 = 10;
                    class624.method3415(var23, arg0 ^ 0xFFFFB389);
                    return;
                } else if (var23 == 2) {
                    class674.field9468 = 13;
                } else if (var23 == 15) {
                    class206.field2700 = -2;
                    class674.field9468 = 19;
                } else if (var23 == 23 && class113.field1541 < 3) {
                    class674.field9468 = 1;
                    class113.field1541++;
                    class12.field180 = 0;
                    class457.field6340.method3027(2);
                    class457.field6340 = null;
                    return;
                } else if (!class506.field6998 || class57.field801 || class450.field6276 == -1 || var23 != 35) {
                    class674.field9468 = 0;
                    class624.method3415(var23, arg0 + 19575);
                    class457.field6340.method3027(2);
                    class457.field6340 = null;
                    class389.method2463(96);
                    return;
                } else {
                    class57.field801 = true;
                    class674.field9468 = 1;
                    class12.field180 = 0;
                    class457.field6340.method3027(2);
                    class457.field6340 = null;
                    return;
                }
            }
            if (class674.field9468 == 11) {
                class645.method3582(1);
                class267 var24 = class731.method4058(-57);
                class315 var25 = var24.field3938;
                var25.method1988(class269.field3966, -7860);
                var25.method1983(103, class628.field8794.field4282);
                class617.method3392(var24, true);
                class101.method793((byte) 88);
                class674.field9468 = 9;
            } else if (class674.field9468 == 12) {
                if (class457.field6340.method3025(1, arg0 ^ 0xFFFFB3BC)) {
                    class457.field6340.method3028(arg0 ^ 0xFFFFB3E3, 1, class89.field1233.field5518, 0);
                    int var26 = class89.field1233.field5518[0] & 0xFF;
                    class674.field9468 = 0;
                    class10.field164 = var26 * 50;
                    class624.method3415(21, 2);
                    class457.field6340.method3027(2);
                    class457.field6340 = null;
                    class389.method2463(115);
                }
            } else if (class674.field9468 == 18) {
                if (class457.field6340.method3025(1, 55)) {
                    class457.field6340.method3028(-83, 1, class89.field1233.field5518, 0);
                    class624.field8383 = class89.field1233.field5518[0] & 0xFF;
                    class674.field9468 = 0;
                    class624.method3415(29, 2);
                    class457.field6340.method3027(arg0 ^ 0xFFFFB389);
                    class457.field6340 = null;
                    class389.method2463(68);
                }
            } else if (class674.field9468 != 13) {
                if (class674.field9468 == 14) {
                    class315 var27 = class89.field1233;
                    if (class397.field5830 == 2) {
                        if (!class457.field6340.method3025(class574.field7718, 55)) {
                            return;
                        }
                        class457.field6340.method3028(arg0 + 19501, class574.field7718, var27.field5518, 0);
                        var27.field5459 = 0;
                        class712.field9963 = var27.method2398(-1372747256);
                        class546.field7403 = var27.method2398(-1372747256);
                        class739.field10205 = var27.method2398(-1372747256) == 1;
                        class635.field8858 = var27.method2398(-1372747256) == 1;
                        class298.field4324 = var27.method2398(-1372747256) == 1;
                        class546.field7401 = var27.method2398(-1372747256) == 1;
                        class363.field5292 = var27.method2359(-1);
                        class238.field3212 = var27.method2398(-1372747256) == 1;
                        class357.field5225 = var27.method2377(-122);
                        class196.field2619 = var27.method2398(-1372747256) == 1;
                        class350.field5132.method3737(79, class196.field2619);
                        class770.field10602.method2466(class196.field2619, (byte) -23);
                        class364.field5309.method3346((byte) 102, class196.field2619);
                    } else if (class457.field6340.method3025(class574.field7718, 55)) {
                        class457.field6340.method3028(-68, class574.field7718, var27.field5518, 0);
                        var27.field5459 = 0;
                        class712.field9963 = var27.method2398(arg0 - 1372727683);
                        class546.field7403 = var27.method2398(-1372747256);
                        class739.field10205 = var27.method2398(arg0 ^ 0x51D23983) == 1;
                        class635.field8858 = var27.method2398(-1372747256) == 1;
                        class298.field4324 = var27.method2398(-1372747256) == 1;
                        class737.field10194 = var27.method2366(true);
                        class466.field6470 = class737.field10194 - (class302.method1910(0) + var27.method2388((byte) -125));
                        int var28 = var27.method2398(arg0 ^ 0x51D23983);
                        class238.field3212 = (var28 & 0x1) != 0;
                        class158.field2174 = (var28 & 0x2) != 0;
                        class643.field8928 = var27.method2384(110);
                        class432.field6130 = var27.method2359(-1);
                        class20.field288 = var27.method2359(arg0 ^ 0x4C74);
                        class139.field2036 = var27.method2359(arg0 ^ 0x4C74);
                        class160.field2199 = var27.method2384(36);
                        class132.field1949 = class730.field10124.method615((byte) -123, class160.field2199);
                        class73.field1059 = var27.method2398(-1372747256);
                        class126.field1903 = var27.method2359(-1);
                        class370.field5367 = var27.method2359(-1);
                        class174.field2338 = var27.method2398(-1372747256) == 1;
                        class551.field7456.field1020 = class551.field7456.field1038 = class566.field7571 = var27.method2350(0);
                        class78.field1120 = var27.method2398(-1372747256);
                        class391.field5688 = var27.method2384(124);
                        class262.field3885 = var27.method2398(arg0 ^ 0x51D23983) == 1;
                        class245.field3315 = new class80();
                        class245.field3315.field1148 = var27.method2359(-1);
                        if (class245.field3315.field1148 == 65535) {
                            class245.field3315.field1148 = -1;
                        }
                        class245.field3315.field1141 = var27.method2350(0);
                        if (class731.field10141 != class197.field2634) {
                            class245.field3315.field1143 = class245.field3315.field1148 + 50000;
                            class245.field3315.field1139 = class245.field3315.field1148 + 40000;
                        }
                        if (class731.field10141 != class324.field4724 && (class731.field10141 != class469.field6504 || class712.field9963 < 2) && (class369.field5359.method679(class370.field5372, arg0 ^ 0x4C07) || class369.field5359.method679(class235.field3190, 64))) {
                            class627.method3529(arg0 ^ 0xFFFFB3BB);
                        }
                    } else {
                        return;
                    }
                    if ((!class739.field10205 || class298.field4324) && !class238.field3212) {
                        try {
                            class623.method3414(class735.field10183, "unzap", (byte) 116);
                        } catch (Throwable var33) {
                        }
                    } else {
                        try {
                            class623.method3414(class735.field10183, "zap", (byte) 123);
                        } catch (Throwable var35) {
                            if (class468.field6494) {
                                try {
                                    class735.field10183.getAppletContext().showDocument(new URL(class735.field10183.getCodeBase(), "blank.ws"), "tbi");
                                } catch (Exception var34) {
                                }
                            }
                        }
                    }
                    if (class731.field10141 == class197.field2634) {
                        try {
                            class623.method3414(class735.field10183, "loggedin", (byte) 122);
                        } catch (Throwable var32) {
                        }
                    }
                    if (class397.field5830 != 2) {
                        class674.field9468 = 0;
                        class624.method3415(2, arg0 ^ 0xFFFFB389);
                        class2.method6((byte) 118);
                        class300.method1901(7, 2);
                        class434.field6143 = null;
                        return;
                    }
                    class674.field9468 = 16;
                }
                if (class674.field9468 == 16) {
                    if (!class457.field6340.method3025(3, 55)) {
                        return;
                    }
                    class457.field6340.method3028(-93, 3, class89.field1233.field5518, 0);
                    class674.field9468 = 17;
                }
                if (class674.field9468 == 17) {
                    class315 var29 = class89.field1233;
                    var29.field5459 = 0;
                    if (var29.method1985(92)) {
                        if (!class457.field6340.method3025(1, arg0 + 19628)) {
                            return;
                        }
                        class457.field6340.method3028(87, 1, var29.field5518, 3);
                    }
                    class434.field6143 = class496.method2872(arg0 + 19460)[var29.method1987(99)];
                    class206.field2700 = var29.method2359(-1);
                    class674.field9468 = 15;
                }
                if (class674.field9468 == 15) {
                    if (class457.field6340.method3025(class206.field2700, 55)) {
                        class457.field6340.method3028(-122, class206.field2700, class89.field1233.field5518, 0);
                        class89.field1233.field5459 = 0;
                        int var30 = class206.field2700;
                        class674.field9468 = 0;
                        class624.method3415(2, 2);
                        class417.method2571(0);
                        class283.method1817(class89.field1233, false);
                        class474.field6604 = -1;
                        if (class434.field6143 == class383.field5607) {
                            class379.method2422(true);
                        } else {
                            class298.method1889(arg0 ^ 0x9676B763);
                        }
                        if (class89.field1233.field5459 != var30) {
                            throw new RuntimeException("lswp pos:" + class89.field1233.field5459 + " psize:" + var30);
                        }
                        class434.field6143 = null;
                    }
                } else if (class674.field9468 == 19) {
                    if (class206.field2700 == -2) {
                        if (!class457.field6340.method3025(2, 55)) {
                            return;
                        }
                        class457.field6340.method3028(arg0 + 19522, 2, class89.field1233.field5518, 0);
                        class89.field1233.field5459 = 0;
                        class206.field2700 = class89.field1233.method2359(arg0 ^ 0x4C74);
                    }
                    if (class457.field6340.method3025(class206.field2700, 55)) {
                        class457.field6340.method3028(96, class206.field2700, class89.field1233.field5518, 0);
                        class89.field1233.field5459 = 0;
                        int var31 = class206.field2700;
                        class674.field9468 = 0;
                        class624.method3415(15, 2);
                        class167.method1204((byte) 16);
                        class283.method1817(class89.field1233, false);
                        if (class89.field1233.field5459 != var31) {
                            throw new RuntimeException("lswpr pos:" + class89.field1233.field5459 + " psize:" + var31);
                        }
                        class434.field6143 = null;
                    }
                }
            } else if (class457.field6340.method3025(1, 55)) {
                class457.field6340.method3028(-67, 1, class89.field1233.field5518, 0);
                class574.field7718 = class89.field1233.field5518[0] & 0xFF;
                class674.field9468 = 14;
            }
        } catch (IOException var36) {
            if (class457.field6340 != null) {
                class457.field6340.method3027(2);
                class457.field6340 = null;
            }
            if (class113.field1541 >= 3) {
                class674.field9468 = 0;
                class624.method3415(-4, 2);
                class389.method2463(88);
            } else {
                if (class397.field5830 == 2) {
                    class369.field5359.method680(43594);
                } else {
                    class691.field9698.method680(43594);
                }
                class113.field1541++;
                class12.field180 = 0;
                class674.field9468 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!qu", name = "d", descriptor = "(I)V", line = 964)
    public static void method806(int arg0) {
        int var1 = 109 % ((-arg0 - 1) / 63);
        field1452 = null;
    }
}
