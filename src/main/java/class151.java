import java.io.IOException;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public abstract class class151 {

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    public int field2587 = 4;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "[S")
    private short[] field2594 = new short[512];

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    private int field2589 = 4;

    @OriginalMember(owner = "client!ki", name = "o", descriptor = "I")
    private int field2600 = 4;

    @OriginalMember(owner = "client!ki", name = "u", descriptor = "I")
    private int field2606 = 4;

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
    private int field2595 = 0;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public static int field2586 = 99;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "I")
    public static int field2592 = 0;

    @OriginalMember(owner = "client!ki", name = "t", descriptor = "Z")
    public static boolean field2605 = false;

    @OriginalMember(owner = "client!ki", name = "q", descriptor = "Lwa;")
    public static class75 field2602 = class66.method560("gelb:", false);

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "Z")
    public static boolean field2599 = true;

    @OriginalMember(owner = "client!ki", name = "p", descriptor = "Li;")
    public static class203 field2601 = new class203(64);

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "F")
    public static float field2591;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!ki", name = "r", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "Lbi;")
    public static class77 field2597;

    @OriginalMember(owner = "client!ki", name = "s", descriptor = "Lbi;")
    public static class77 field2604;

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "[S")
    private short[] field2598;

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(IIIII)V", line = 1315)
    public class151(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2595 = arg0;
        this.field2606 = arg3;
        this.field2587 = arg1;
        this.field2600 = arg4;
        this.field2589 = arg2;
        this.method1155(-125);
        this.method1160(0);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V", line = 17)
    private final void method1155(int arg0) {
        if (arg0 >= -78) {
            this.method573(-45);
        }
        this.field2598 = new short[this.field2587];
        for (int var2 = 0; var2 < this.field2587; var2++) {
            this.field2598[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
        field2593++;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V", line = 56)
    public static final void method1156(byte arg0) {
        field2590++;
        if (class154.field2647 > 1) {
            class66.field1155 = class187.field3128;
            class154.field2647--;
        }
        if (class26.field346 > 0) {
            class26.field346--;
        }
        if (class167.field2825) {
            class167.field2825 = false;
            class10.method50(arg0 + 30);
            return;
        }
        for (int var1 = 0; var1 < 100 && class3.method17(93); var1++) {
        }
        if (class118.field2003 != 30) {
            return;
        }
        class72.method601(160, (byte) -122, class89.field1470);
        Object var2 = class287.field4939.field4947;
        synchronized (class287.field4939.field4947) {
            if (!class75.field1277) {
                class287.field4939.field4957 = 0;
            } else if (class87.field1435 != 0 || class287.field4939.field4957 >= 40) {
                class89.field1470.method87(arg0 ^ 0xFFFF00E3, 187);
                class89.field1470.method518(101, 0);
                class40.field624++;
                int var3 = class89.field1470.field1012;
                int var4 = 0;
                for (int var5 = 0; var5 < class287.field4939.field4957 && class89.field1470.field1012 - var3 < 240; var5++) {
                    var4++;
                    int var6 = class287.field4939.field4958[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    boolean var7 = false;
                    int var8 = class287.field4939.field4959[var5];
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 65534) {
                        var8 = 65534;
                    }
                    if (class287.field4939.field4959[var5] == -1 && class287.field4939.field4958[var5] == -1) {
                        var6 = -1;
                        var7 = true;
                        var8 = -1;
                    }
                    if (class291.field4995 != var6 || class139.field2386 != var8) {
                        int var9 = var6 - class291.field4995;
                        class291.field4995 = var6;
                        int var10 = var8 - class139.field2386;
                        class139.field2386 = var8;
                        if (class216.field3692 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class89.field1470.method503(-597878072, (class216.field3692 << 12) + (var9 << 6) + var10);
                            class216.field3692 = 0;
                        } else if (class216.field3692 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            class89.field1470.method518(113, class216.field3692 + 128);
                            var10 += 128;
                            var9 += 128;
                            class89.field1470.method503(-597878072, (var9 << 8) + var10);
                            class216.field3692 = 0;
                        } else if (class216.field3692 >= 32) {
                            class89.field1470.method503(arg0 ^ 0x23A2E52B, class216.field3692 + 57344);
                            if (var7) {
                                class89.field1470.method510(Integer.MIN_VALUE, arg0 ^ 0xFFFFFFB5);
                            } else {
                                class89.field1470.method510(var8 << 16 | var6, arg0 + 148);
                            }
                            class216.field3692 = 0;
                        } else {
                            class89.field1470.method518(121, class216.field3692 + 192);
                            if (var7) {
                                class89.field1470.method510(Integer.MIN_VALUE, arg0 + 150);
                            } else {
                                class89.field1470.method510(var6 | var8 << 16, arg0 ^ 0x4F);
                            }
                            class216.field3692 = 0;
                        }
                    } else if (class216.field3692 < 2047) {
                        class216.field3692++;
                    }
                }
                class89.field1470.method520(class89.field1470.field1012 - var3, -1);
                if (var4 < class287.field4939.field4957) {
                    class287.field4939.field4957 -= var4;
                    for (int var11 = 0; var11 < class287.field4939.field4957; var11++) {
                        class287.field4939.field4958[var11] = class287.field4939.field4958[var11 + var4];
                        class287.field4939.field4959[var11] = class287.field4939.field4959[var4 + var11];
                    }
                } else {
                    class287.field4939.field4957 = 0;
                }
            }
        }
        if (class87.field1435 != 0) {
            class89.field1471++;
            long var13 = (class173.field2931 - class152.field2613) / 50L;
            if (var13 > 32767L) {
                var13 = 32767L;
            }
            class152.field2613 = class173.field2931;
            int var15 = class271.field4685;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            int var16 = class39.field595;
            byte var17 = 0;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            if (class87.field1435 == 2) {
                var17 = 1;
            }
            class89.field1470.method87(65280, 33);
            int var18 = (int) var13;
            class89.field1470.method493(var17 << 15 | var18, (byte) 76);
            class89.field1470.method486((byte) 127, var15 << 16 | var16);
        }
        if (class197.field3304 > 0) {
            class197.field3304--;
        }
        if (class163.field2767[96] || class163.field2767[97] || class163.field2767[98] || class163.field2767[99]) {
            class261.field4376 = true;
        }
        if (class261.field4376 && class197.field3304 <= 0) {
            class197.field3304 = 20;
            class26.field335++;
            class261.field4376 = false;
            class89.field1470.method87(arg0 ^ 0xFFFF00E3, 251);
            class89.field1470.method503(-597878072, class95.field1547);
            class89.field1470.method493(class290.field4981, (byte) 82);
        }
        if (class310.field5294 && !class69.field1189) {
            class69.field1189 = true;
            class310.field5273++;
            class89.field1470.method87(65280, 132);
            class89.field1470.method518(101, 1);
        }
        if (!class310.field5294 && class69.field1189) {
            class69.field1189 = false;
            class89.field1470.method87(65280, 132);
            class89.field1470.method518(105, 0);
            class310.field5273++;
        }
        if (!class120.field2014) {
            class306.field5230++;
            class89.field1470.method87(arg0 ^ 0xFFFF00E3, 197);
            class89.field1470.method527(107, class242.method1760(arg0 - 1150223646));
            class120.field2014 = true;
        }
        class30.method206(false);
        if (class118.field2003 != 30) {
            return;
        }
        class214.method1572(1513);
        class158.method1196(-13095);
        class111.field1895++;
        if (class111.field1895 > 750) {
            class10.method50(1);
            return;
        }
        class113.method873((byte) 123);
        class218.method1597(0);
        class259.method1849((byte) -6);
        if (class175.field2935 != null) {
            class221.method1621(13676);
        }
        for (int var19 = class185.method1397(true, 19232); var19 != -1; var19 = class185.method1397(false, arg0 ^ 0xFFFFB4C3)) {
            class17.method98(var19, (byte) 108);
            class133.field2287[class235.method1710(31, class11.field144++)] = var19;
        }
        for (class156 var20 = class178.method1310(0); var20 != null; var20 = class178.method1310(0)) {
            int var21 = var20.method1182(-892555168);
            int var22 = var20.method1180((byte) -127);
            if (var21 == 1) {
                class72.field1218[var22] = var20.field2665;
                class59.field993[class235.method1710(31, class17.field233++)] = var22;
            } else if (var21 == 2) {
                class69.field1190[var22] = var20.field2685;
                class152.field2610[class235.method1710(class78.field1339++, 31)] = var22;
            } else if (var21 == 3) {
                class262 var42 = class51.method374(-38, var22);
                if (!var20.field2685.method660(var42.field4396, 22)) {
                    var42.field4396 = var20.field2685;
                    class291.method2027(var42, 14580);
                }
            } else if (var21 == 4) {
                class262 var39 = class51.method374(114, var22);
                int var40 = var20.field2665;
                int var41 = var20.field2680;
                if (var39.field4467 != var40 || var39.field4535 != var41) {
                    var39.field4535 = var41;
                    var39.field4467 = var40;
                    class291.method2027(var39, 14580);
                }
            } else if (var21 == 5) {
                class262 var38 = class51.method374(-100, var22);
                if (var20.field2665 != var38.field4447 || var20.field2665 == -1) {
                    var38.field4447 = var20.field2665;
                    var38.field4406 = 0;
                    var38.field4505 = 0;
                    class291.method2027(var38, 14580);
                }
            } else if (var21 == 6) {
                int var23 = var20.field2665;
                int var24 = var23 & 0x1F;
                class262 var25 = class51.method374(-125, var22);
                int var26 = var23 >> 5 & 0x1F;
                int var27 = var23 >> 10 & 0x1F;
                int var28 = (var27 << 19) + (var24 << 3) + (var26 << 11);
                if (var25.field4497 != var28) {
                    var25.field4497 = var28;
                    class291.method2027(var25, arg0 ^ 0xFFFFC717);
                }
            } else if (var21 == 7) {
                class262 var36 = class51.method374(111, var22);
                boolean var37 = var20.field2665 == 1;
                if (var36.field4491 != var37) {
                    var36.field4491 = var37;
                    class291.method2027(var36, 14580);
                }
            } else if (var21 == 8) {
                class262 var35 = class51.method374(arg0 ^ 0x6, var22);
                if (var20.field2665 != var35.field4477 || var20.field2680 != var35.field4390 || var20.field2674 != var35.field4463) {
                    var35.field4390 = var20.field2680;
                    var35.field4463 = var20.field2674;
                    var35.field4477 = var20.field2665;
                    if (var35.field4445 != -1) {
                        if (var35.field4381 > 0) {
                            var35.field4463 = var35.field4463 * 32 / var35.field4381;
                        } else if (var35.field4429 > 0) {
                            var35.field4463 = var35.field4463 * 32 / var35.field4429;
                        }
                    }
                    class291.method2027(var35, 14580);
                }
            } else if (var21 == 9) {
                class262 var34 = class51.method374(arg0 ^ 0xFFFFFF8E, var22);
                if (var20.field2665 != var34.field4445 || var20.field2680 != var34.field4495) {
                    var34.field4445 = var20.field2665;
                    var34.field4495 = var20.field2680;
                    class291.method2027(var34, 14580);
                }
            } else if (var21 == 10) {
                class262 var29 = class51.method374(arg0 - 56, var22);
                if (var20.field2665 != var29.field4392 || var20.field2680 != var29.field4536 || var20.field2674 != var29.field4395) {
                    var29.field4395 = var20.field2674;
                    var29.field4536 = var20.field2680;
                    var29.field4392 = var20.field2665;
                    class291.method2027(var29, 14580);
                }
            } else if (var21 == 11) {
                class262 var30 = class51.method374(123, var22);
                var30.field4539 = 0;
                var30.field4439 = var30.field4500 = var20.field2680;
                var30.field4521 = var30.field4486 = var20.field2665;
                var30.field4379 = 0;
                class291.method2027(var30, 14580);
            } else if (var21 == 12) {
                class262 var31 = class51.method374(-120, var22);
                int var32 = var20.field2665;
                if (var31 != null && var31.field4441 == 0) {
                    if (var31.field4384 - var31.field4517 < var32) {
                        var32 = var31.field4384 - var31.field4517;
                    }
                    if (var32 < 0) {
                        var32 = 0;
                    }
                    if (var31.field4501 != var32) {
                        var31.field4501 = var32;
                        class291.method2027(var31, 14580);
                    }
                }
            } else if (var21 == 13) {
                class262 var33 = class51.method374(-106, var22);
                var33.field4436 = var20.field2665;
            }
        }
        class250.field4208++;
        if (class99.field1642 != 0) {
            class89.field1468 += 20;
            if (class89.field1468 >= 400) {
                class99.field1642 = 0;
            }
        }
        if (class54.field896 != null) {
            class170.field2867++;
            if (class170.field2867 >= 15) {
                class291.method2027(class54.field896, 14580);
                class54.field896 = null;
            }
        }
        if (class299.field5120 != null) {
            class291.method2027(class299.field5120, 14580);
            if ((class266.field4588 + 5) < class66.field1135 || class266.field4588 - 5 > class66.field1135 || class26.field351 > class90.field1483 + 5 || class26.field351 < class90.field1483 - 5) {
                class87.field1444 = true;
            }
            class170.field2860++;
            if (class61.field1066 == 0) {
                if (class87.field1444 && class170.field2860 >= 5) {
                    if (class299.field5120 == class180.field3019 && class272.field4701 != class20.field277) {
                        class281.field4852++;
                        byte var43 = 0;
                        class262 var44 = class299.field5120;
                        if (class95.field1540 == 1 && var44.field4462 == 206) {
                            var43 = 1;
                        }
                        if (var44.field4410[class20.field277] <= 0) {
                            var43 = 0;
                        }
                        if (class16.method93((byte) -89, client.method1734(var44))) {
                            int var45 = class20.field277;
                            int var46 = class272.field4701;
                            var44.field4410[var45] = var44.field4410[var46];
                            var44.field4496[var45] = var44.field4496[var46];
                            var44.field4410[var46] = -1;
                            var44.field4496[var46] = 0;
                        } else if (var43 == 1) {
                            int var47 = class272.field4701;
                            int var48 = class20.field277;
                            while (var47 != var48) {
                                if (var48 < var47) {
                                    var44.method1870((byte) -80, var47, var47 - 1);
                                    var47--;
                                } else if (var48 > var47) {
                                    var44.method1870((byte) -35, var47, var47 + 1);
                                    var47++;
                                }
                            }
                        } else {
                            var44.method1870((byte) -51, class272.field4701, class20.field277);
                        }
                        class89.field1470.method87(65280, 19);
                        class89.field1470.method493(class272.field4701, (byte) 79);
                        class89.field1470.method529(var43, (byte) 116);
                        class89.field1470.method513((byte) 96, class20.field277);
                        class89.field1470.method527(127, class299.field5120.field4418);
                    }
                } else if ((class275.field4735 == 1 || class10.method48(class126.field2188 - 1, true)) && class126.field2188 > 2) {
                    class35.method235(true);
                } else if (class126.field2188 > 0) {
                    class19.method127(11078);
                }
                class170.field2867 = 10;
                class299.field5120 = null;
                class87.field1435 = 0;
            }
        }
        class235.field3966 = false;
        class260.field4356 = false;
        class262 var49 = class168.field2835;
        class168.field2835 = null;
        class66.field1154 = 0;
        class262 var50 = class61.field1065;
        class61.field1065 = null;
        class171.field2879 = null;
        while (class50.method370((byte) -23) && class66.field1154 < 128) {
            class230.field3911[class66.field1154] = class152.field2617;
            class104.field1776[class66.field1154] = class78.field1340;
            class66.field1154++;
        }
        class175.field2935 = null;
        if (class81.field1361 != -1) {
            class283.method2006(0, class81.field1361, 0, class188.field3141, 0, class244.field4111, 0, (byte) 108);
        }
        class187.field3128++;
        while (true) {
            class24 var51;
            class262 var52;
            class262 var53;
            do {
                var51 = (class24) class172.field2902.method1258(50);
                if (var51 == null) {
                    while (true) {
                        class24 var54;
                        class262 var55;
                        class262 var56;
                        do {
                            var54 = (class24) class60.field1006.method1258(50);
                            if (var54 == null) {
                                while (true) {
                                    class24 var57;
                                    class262 var58;
                                    class262 var59;
                                    do {
                                        var57 = (class24) class237.field3992.method1258(50);
                                        if (var57 == null) {
                                            if (class120.field2025 && class175.field2935 == null) {
                                                class120.field2025 = false;
                                            }
                                            if (class270.field4675 != null) {
                                                class286.method2012((byte) -112);
                                            }
                                            if (class250.field4201 > 0 && class163.field2767[82] && class163.field2767[81] && class127.field2200 != 0) {
                                                int var60 = class67.field1174 - class127.field2200;
                                                if (var60 < 0) {
                                                    var60 = 0;
                                                } else if (var60 > 3) {
                                                    var60 = 3;
                                                }
                                                class178.method1315(var60, class279.field4831.field3205[0] + class175.field2939, class275.field4737 - -class279.field4831.field3236[0], 1);
                                            }
                                            if (class232.field3930 != -1) {
                                                int var61 = class195.field3283;
                                                int var62 = class232.field3930;
                                                if (class250.field4201 > 0 && class163.field2767[82] && class163.field2767[81]) {
                                                    class178.method1315(class67.field1174, class175.field2939 + var61, class275.field4737 - -var62, 1);
                                                } else if (class144.field2480) {
                                                    class270.field4670++;
                                                    class89.field1470.method87(65280, 221);
                                                    class89.field1470.method480((byte) -50, class275.field4737 + var62);
                                                    class89.field1470.method503(-597878072, class206.field3482);
                                                    class89.field1470.method510(class29.field405, -79);
                                                    class89.field1470.method503(-597878072, class175.field2939 + var61);
                                                    class213.field3625 = class271.field4685;
                                                    class213.field3624 = class39.field595;
                                                    class89.field1468 = 0;
                                                    class99.field1642 = 1;
                                                } else {
                                                    boolean var63 = class112.method870(0, class279.field4831.field3236[0], (byte) 121, 0, true, 0, 0, 0, var62, 0, class279.field4831.field3205[0], var61);
                                                    if (var63) {
                                                        class213.field3625 = class271.field4685;
                                                        class213.field3624 = class39.field595;
                                                        class99.field1642 = 1;
                                                        class89.field1468 = 0;
                                                    }
                                                }
                                                class232.field3930 = -1;
                                                class144.field2480 = false;
                                            }
                                            class51.method372((byte) -106);
                                            if (class61.field1065 != var50) {
                                                if (var50 != null) {
                                                    class291.method2027(var50, 14580);
                                                }
                                                if (class61.field1065 != null) {
                                                    class291.method2027(class61.field1065, 14580);
                                                }
                                            }
                                            if (arg0 != -29) {
                                                method1158((long[]) null, (Object[]) null, true);
                                            }
                                            if (class168.field2835 != var49 && class270.field4673 == class219.field3735) {
                                                if (var49 != null) {
                                                    class291.method2027(var49, 14580);
                                                }
                                                if (class168.field2835 != null) {
                                                    class291.method2027(class168.field2835, 14580);
                                                }
                                            }
                                            if (class168.field2835 == null) {
                                                if (class270.field4673 > 0) {
                                                    class270.field4673--;
                                                }
                                            } else if (class219.field3735 > class270.field4673) {
                                                class270.field4673++;
                                                if (class270.field4673 == class219.field3735) {
                                                    class291.method2027(class168.field2835, 14580);
                                                }
                                            }
                                            if (class163.field2777 == 1) {
                                                class11.method58(-16567);
                                            } else if (class163.field2777 == 2) {
                                                class78.method670(arg0 ^ 0x60);
                                            } else {
                                                class70.method590(17020);
                                            }
                                            for (int var64 = 0; var64 < 5; var64++) {
                                                int var10002 = class270.field4655[var64]++;
                                            }
                                            int var65 = class17.method105(2);
                                            int var66 = class136.method1045(-17444);
                                            if (var65 > 4500 && var66 > 4500) {
                                                class301.field5150++;
                                                class26.field346 = 250;
                                                class108.method838(87, 4000);
                                                class89.field1470.method87(65280, 225);
                                            }
                                            if (field2604 != null && field2604.field1330 == 1) {
                                                if (field2604.field1329 != null) {
                                                    class302.method2078(-103, class298.field5096, class187.field3122);
                                                }
                                                field2604 = null;
                                                class298.field5096 = null;
                                                class187.field3122 = false;
                                            }
                                            class32.field472++;
                                            class310.field5293++;
                                            class176.field2963++;
                                            if (class176.field2963 > 500) {
                                                int var67 = (int) (Math.random() * 8.0D);
                                                class176.field2963 = 0;
                                                if ((var67 & 0x1) == 1) {
                                                    class153.field2638 += class162.field2753;
                                                }
                                                if ((var67 & 0x4) == 4) {
                                                    class155.field2656 += class108.field1803;
                                                }
                                                if ((var67 & 0x2) == 2) {
                                                    class238.field4004 += class85.field1403;
                                                }
                                            }
                                            if (class32.field472 > 500) {
                                                int var68 = (int) (Math.random() * 8.0D);
                                                if ((var68 & 0x1) == 1) {
                                                    class249.field4191 += class286.field4921;
                                                }
                                                if ((var68 & 0x2) == 2) {
                                                    class14.field191 += class182.field3033;
                                                }
                                                class32.field472 = 0;
                                            }
                                            if (class155.field2656 < -40) {
                                                class108.field1803 = 1;
                                            }
                                            if (class153.field2638 < -50) {
                                                class162.field2753 = 2;
                                            }
                                            if (class249.field4191 < -60) {
                                                class286.field4921 = 2;
                                            }
                                            if (class153.field2638 > 50) {
                                                class162.field2753 = -2;
                                            }
                                            if (class238.field4004 < -55) {
                                                class85.field1403 = 2;
                                            }
                                            if (class155.field2656 > 40) {
                                                class108.field1803 = -1;
                                            }
                                            if (class238.field4004 > 55) {
                                                class85.field1403 = -2;
                                            }
                                            if (class14.field191 < -20) {
                                                class182.field3033 = 1;
                                            }
                                            if (class249.field4191 > 60) {
                                                class286.field4921 = -2;
                                            }
                                            if (class14.field191 > 10) {
                                                class182.field3033 = -1;
                                            }
                                            if (class310.field5293 > 50) {
                                                class89.field1470.method87(65280, 199);
                                                class94.field1525++;
                                            }
                                            if (class271.field4679) {
                                                class6.method36(-23562);
                                                class271.field4679 = false;
                                            }
                                            try {
                                                if (class35.field513 != null && class89.field1470.field1012 > 0) {
                                                    class35.field513.method2043(class89.field1470.field997, class89.field1470.field1012, 0, arg0 ^ 0x7B2B);
                                                    class310.field5293 = 0;
                                                    class89.field1470.field1012 = 0;
                                                }
                                            } catch (IOException var70) {
                                                class10.method50(1);
                                            }
                                            return;
                                        }
                                        var58 = var57.field301;
                                        if (var58.field4382 < 0) {
                                            break;
                                        }
                                        var59 = class51.method374(-96, var58.field4446);
                                    } while (var59 == null || var59.field4532 == null || var58.field4382 >= var59.field4532.length || var59.field4532[var58.field4382] != var58);
                                    class204.method1515(var57, (byte) 9);
                                }
                            }
                            var55 = var54.field301;
                            if (var55.field4382 < 0) {
                                break;
                            }
                            var56 = class51.method374(103, var55.field4446);
                        } while (var56 == null || var56.field4532 == null || var55.field4382 >= var56.field4532.length || var56.field4532[var55.field4382] != var55);
                        class204.method1515(var54, (byte) 9);
                    }
                }
                var52 = var51.field301;
                if (var52.field4382 < 0) {
                    break;
                }
                var53 = class51.method374(arg0 ^ 0xFFFFFF9A, var52.field4446);
            } while (var53 == null || var53.field4532 == null || var53.field4532.length <= var52.field4382 || var53.field4532[var52.field4382] != var52);
            class204.method1515(var51, (byte) 9);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIII)V", line = 1050)
    public final void method1157(int arg0, int arg1, int arg2, int arg3) {
        field2596++;
        int[] var5 = new int[arg2];
        for (int var6 = 0; var6 < arg2; var6++) {
            var5[var6] = (var6 << 12) / arg2;
        }
        int[] var7 = new int[arg0];
        int[] var8 = new int[arg3];
        for (int var9 = 0; var9 < arg3; var9++) {
            var8[var9] = (var9 << 12) / arg3;
        }
        for (int var10 = arg1; var10 < arg0; var10++) {
            var7[var10] = (var10 << 12) / arg0;
        }
        this.method564((byte) -31);
        for (int var11 = 0; var11 < arg0; var11++) {
            for (int var12 = 0; var12 < arg3; var12++) {
                for (int var13 = 0; var13 < arg2; var13++) {
                    for (int var14 = 0; var14 < this.field2587; var14++) {
                        int var15 = this.field2598[var14] << 12;
                        int var16 = this.field2600 * var15 >> 12;
                        int var17 = var8[var12] * var15 >> 12;
                        int var18 = var5[var13] * var15 >> 12;
                        int var19 = this.field2589 * var15 >> 12;
                        int var20 = this.field2606 * var17;
                        int var21 = this.field2606 * var15 >> 12;
                        int var22 = this.field2589 * var18;
                        int var23 = var22 >> 12;
                        int var24 = var20 >> 12;
                        int var25 = var20 & 0xFFF;
                        int var26 = var25 - 4096;
                        int var27 = var7[var11] * var15 >> 12;
                        int var28 = this.field2600 * var27;
                        int var29 = var28 >> 12;
                        int var30 = var29 + 1;
                        int var31;
                        if (var16 <= var30) {
                            var31 = 0;
                        } else {
                            var31 = var30 & 0xFF;
                        }
                        int var32 = var29 & 0xFF;
                        short var33 = this.field2594[var32];
                        int var34 = var28 & 0xFFF;
                        int var35 = class291.field4986[var25];
                        int var36 = var23 + 1;
                        int var37 = var23 & 0xFF;
                        int var38;
                        if (var19 > var36) {
                            var38 = var36 & 0xFF;
                        } else {
                            var38 = 0;
                        }
                        short var39 = this.field2594[var31];
                        int var40 = class291.field4986[var34];
                        int var41 = var34 - 4096;
                        int var42 = var22 & 0xFFF;
                        int var43 = class291.field4986[var42];
                        int var44 = var24 + 1;
                        int var45;
                        if (var21 <= var44) {
                            var45 = 0;
                        } else {
                            var45 = var44 & 0xFF;
                        }
                        short var46 = this.field2594[var33 + var45];
                        int var47 = var42 - 4096;
                        short var48 = this.field2594[var39 + var45];
                        int var49 = var24 & 0xFF;
                        short var50 = this.field2594[var39 + var49];
                        short var51 = this.field2594[var33 + var49];
                        int var52 = class109.method858(var25, var42, this.field2594[var37 + var51], var34, 9);
                        int var53 = class109.method858(var25, var47, this.field2594[var38 + var51], var34, arg1 ^ 0x9);
                        int var54 = var52 + ((var53 - var52) * var43 >> 12);
                        int var55 = class109.method858(var26, var42, this.field2594[var37 + var46], var34, 9);
                        int var56 = class109.method858(var26, var47, this.field2594[var38 + var46], var34, 9);
                        int var57 = ((var56 - var55) * var43 >> 12) + var55;
                        int var58 = var54 + ((var57 - var54) * var35 >> 12);
                        int var59 = class109.method858(var25, var42, this.field2594[var37 + var50], var41, 9);
                        int var60 = class109.method858(var25, var47, this.field2594[var38 + var50], var41, 9);
                        int var61 = ((var60 - var59) * var43 >> 12) + var59;
                        int var62 = class109.method858(var26, var42, this.field2594[var37 + var48], var41, arg1 ^ 0x9);
                        int var63 = class109.method858(var26, var47, this.field2594[var38 + var48], var41, 9);
                        int var64 = var62 + ((var63 - var62) * var43 >> 12);
                        int var65 = var61 + ((var64 - var61) * var35 >> 12);
                        this.method570(var58 + ((var65 - var58) * var40 >> 12), (byte) -109, var14);
                    }
                    this.method573(arg1 ^ 0x0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "([J[Ljava/lang/Object;Z)V", line = 1214)
    public static final void method1158(long[] arg0, Object[] arg1, boolean arg2) {
        field2603++;
        if (arg2) {
            method1158((long[]) null, (Object[]) null, true);
        }
        class53.method386(arg0, arg1, 3, arg0.length - 1, 0);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z)V", line = 1229)
    public static void method1159(boolean arg0) {
        field2597 = null;
        field2602 = null;
        field2601 = null;
        field2604 = null;
        if (!arg0) {
            field2592 = 32;
        }
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(I)V", line = 1260)
    private final void method1160(int arg0) {
        field2588++;
        Random var2 = new Random((long) this.field2595);
        for (int var3 = arg0; var3 < 255; var3++) {
            this.field2594[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class29.method197(var2, true, var5);
            short var7 = this.field2594[var6];
            this.field2594[var6] = this.field2594[var5];
            this.field2594[var5] = this.field2594[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)V")
    public abstract void method573(int arg0);

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(B)V")
    public abstract void method564(byte arg0);

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IBI)V")
    public abstract void method570(int arg0, byte arg1, int arg2);
}
