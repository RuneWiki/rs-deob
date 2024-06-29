import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class45 {

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "[I")
    private int[] field859;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public static volatile int field854 = 0;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "Ltg;")
    private static class184 field856 = class135.method812("You can(Wt add yourself to your own friend list)3", 3);

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "Ltg;")
    public static class184 field857 = class135.method812("Bitte versuchen Sie es erneut)3", 3);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "Ltg;")
    public static class184 field852 = field856;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "[S")
    public static short[] field858 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "Lvb;")
    public static class197 field860;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "Lvb;")
    public static class197 field863;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
    public static void method262(int arg0) {
        field858 = null;
        field856 = null;
        if (arg0 == 31355) {
            field852 = null;
            field863 = null;
            field857 = null;
            field860 = null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "([I)V")
    public class45(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field859 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field859[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field859[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field859[var5 + var5] = arg0[var4];
            this.field859[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)V")
    public static final void method263(boolean arg0) {
        field862++;
        if (class175.field3324 > 0) {
            class175.field3324--;
        }
        if (class119.field2146 > 1) {
            class119.field2146--;
        }
        if (class107.field1941) {
            class107.field1941 = false;
            class167.method1042(40);
            return;
        }
        for (int var1 = 0; var1 < 100 && class195.method1241(64); var1++) {
        }
        if (class127.field2281 != 30) {
            return;
        }
        class175.method1081(117, class117.field2122, -112);
        Object var2 = class43.field825.field1927;
        synchronized (class43.field825.field1927) {
            if (!class47.field884) {
                class43.field825.field1930 = 0;
            } else if (class133.field2410 != 0 || class43.field825.field1930 >= 40) {
                class110.field1988++;
                class117.field2122.method106(96, 85);
                class117.field2122.method583((byte) 14, 0);
                int var3 = 0;
                int var4 = class117.field2122.field1834;
                for (int var5 = 0; var5 < class43.field825.field1930 && class117.field2122.field1834 - var4 < 240; var5++) {
                    var3++;
                    int var6 = class43.field825.field1932[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 502) {
                        var6 = 502;
                    }
                    int var7 = class43.field825.field1931[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 764) {
                        var7 = 764;
                    }
                    int var8 = var6 * 765 + var7;
                    if (class43.field825.field1932[var5] == -1 && class43.field825.field1931[var5] == -1) {
                        var7 = -1;
                        var6 = -1;
                        var8 = 524287;
                    }
                    if (class175.field3330 != var7 || class85.field1565 != var6) {
                        int var9 = var7 - class175.field3330;
                        int var10 = var6 - class85.field1565;
                        class85.field1565 = var6;
                        class175.field3330 = var7;
                        if (class164.field2952 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class117.field2122.method589((byte) -61, (var9 << 6) + ((class164.field2952 << 12) + var10));
                            class164.field2952 = 0;
                        } else if (class164.field2952 < 8) {
                            class117.field2122.method595(65280, (class164.field2952 << 19) + (var8 + 8388608));
                            class164.field2952 = 0;
                        } else {
                            class117.field2122.method580((class164.field2952 << 19) + var8 - 1073741824, false);
                            class164.field2952 = 0;
                        }
                    } else if (class164.field2952 < 2047) {
                        class164.field2952++;
                    }
                }
                class117.field2122.method593(108, class117.field2122.field1834 - var4);
                if (class43.field825.field1930 <= var3) {
                    class43.field825.field1930 = 0;
                } else {
                    class43.field825.field1930 -= var3;
                    for (int var11 = 0; var11 < class43.field825.field1930; var11++) {
                        class43.field825.field1931[var11] = class43.field825.field1931[var3 + var11];
                        class43.field825.field1932[var11] = class43.field825.field1932[var11 + var3];
                    }
                }
            }
        }
        if (class133.field2410 != 0) {
            class144.field2601++;
            long var12 = (class158.field2833 - class158.field2828) / 50L;
            int var14 = class158.field2823;
            if (var12 > 4095L) {
                var12 = 4095L;
            }
            int var15 = class134.field2429;
            int var16 = (int) var12;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 502) {
                var15 = 502;
            }
            class158.field2828 = class158.field2833;
            byte var17 = 0;
            if (class133.field2410 == 2) {
                var17 = 1;
            }
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 764) {
                var14 = 764;
            }
            class117.field2122.method106(25, 92);
            int var18 = var15 * 765 + var14;
            class117.field2122.method585((var16 << 20) + (var17 << 19) + var18, -1);
        }
        if (class82.field1468 > 0) {
            class82.field1468--;
        }
        if (class120.field2163[96] || class120.field2163[97] || class120.field2163[98] || class120.field2163[99]) {
            class157.field2817 = true;
        }
        if (class157.field2817 && class82.field1468 <= 0) {
            class82.field1468 = 20;
            class157.field2817 = false;
            class117.field2122.method106(48, -121);
            class117.field2122.method570(-601443768, class24.field439);
            class117.field2122.method570(-601443768, class38.field716);
            class135.field2454++;
        }
        if (class125.field2255 && !class90.field1665) {
            class90.field1665 = true;
            class117.field2122.method106(210, -127);
            class82.field1464++;
            class117.field2122.method583((byte) 14, 1);
        }
        if (!class125.field2255 && class90.field1665) {
            class82.field1464++;
            class90.field1665 = false;
            class117.field2122.method106(210, -119);
            class117.field2122.method583((byte) 14, 0);
        }
        class155.method941(1);
        if (class127.field2281 != 30) {
            return;
        }
        class106.method661(31387);
        class37.method223((byte) -60);
        class79.field1436++;
        if (class79.field1436 > 750) {
            class167.method1042(40);
            return;
        }
        class136.method819(102);
        class195.method1240(-719);
        class138.method851((byte) 96);
        if (class24.field437 != 0) {
            class196.field3806 += 20;
            if (class196.field3806 >= 400) {
                class24.field437 = 0;
            }
        }
        class170.field3231++;
        if (class204.field3934 != null) {
            class146.field2636++;
            if (class146.field2636 >= 15) {
                class57.method305(-126, class204.field3934);
                class204.field3934 = null;
            }
        }
        if (class31.field535 != null) {
            class57.method305(-126, class31.field535);
            if (class143.field2574 + 5 < class39.field736 || class39.field736 < class143.field2574 - 5 || class182.field3514 + 5 < class195.field3793 || class182.field3514 - 5 > class195.field3793) {
                class78.field1407 = true;
            }
            class184.field3542++;
            if (class1.field12 == 0) {
                if (class78.field1407 && class184.field3542 >= 5) {
                    if (class44.field845 == class31.field535 && class200.field3878 != class185.field3580) {
                        class36.field670++;
                        class167 var19 = class31.field535;
                        byte var20 = 0;
                        if (class162.field2915 == 1 && var19.field3101 == 206) {
                            var20 = 1;
                        }
                        if (var19.field3130[class200.field3878] <= 0) {
                            var20 = 0;
                        }
                        if (class179.method1097(-90, class188.method1191((byte) -36, var19))) {
                            int var23 = class185.field3580;
                            int var24 = class200.field3878;
                            var19.field3130[var24] = var19.field3130[var23];
                            var19.field3056[var24] = var19.field3056[var23];
                            var19.field3130[var23] = -1;
                            var19.field3056[var23] = 0;
                        } else if (var20 == 1) {
                            int var21 = class200.field3878;
                            int var22 = class185.field3580;
                            while (var21 != var22) {
                                if (var21 < var22) {
                                    var19.method1044(var22, var22 - 1, (byte) 115);
                                    var22--;
                                } else if (var22 < var21) {
                                    var19.method1044(var22, var22 + 1, (byte) -63);
                                    var22++;
                                }
                            }
                        } else {
                            var19.method1044(class185.field3580, class200.field3878, (byte) -97);
                        }
                        class117.field2122.method106(105, -127);
                        class117.field2122.method609((byte) -56, class31.field535.field3069);
                        class117.field2122.method592(118, var20);
                        class117.field2122.method570(-601443768, class200.field3878);
                        class117.field2122.method589((byte) -126, class185.field3580);
                    }
                } else if ((class43.field822 == 1 || class81.method453(arg0, class133.field2404 - 1)) && class133.field2404 > 2) {
                    class113.method698(2);
                } else if (class133.field2404 > 0) {
                    class43.method249(!arg0, class133.field2404 - 1);
                }
                class146.field2636 = 10;
                class133.field2410 = 0;
                class31.field535 = null;
            }
        }
        class18.field328 = false;
        class94.field1717 = null;
        class167 var25 = class68.field1305;
        class208.field3997 = arg0;
        class68.field1305 = null;
        class79.field1430 = 0;
        class167 var26 = class59.field1102;
        class59.field1102 = null;
        while (class64.method368(0) && class79.field1430 < 128) {
            class18.field336[class79.field1430] = class3.field58;
            class191.field3725[class79.field1430] = class16.field299;
            class79.field1430++;
        }
        if (class110.field1986 != -1) {
            class190.method1209(503, 115, class110.field1986, 0, 0, 0, 0, 765);
        }
        class136.field2471++;
        while (true) {
            class5 var27;
            class167 var28;
            class167 var29;
            do {
                var27 = (class5) class71.field1339.method411((byte) -48);
                if (var27 == null) {
                    while (true) {
                        class5 var30;
                        class167 var31;
                        class167 var32;
                        do {
                            var30 = (class5) class18.field342.method411((byte) -48);
                            if (var30 == null) {
                                while (true) {
                                    class5 var33;
                                    class167 var34;
                                    class167 var35;
                                    do {
                                        var33 = (class5) class44.field842.method411((byte) -48);
                                        if (var33 == null) {
                                            if (class34.field591 != null) {
                                                class37.method221(427130092);
                                            }
                                            if (class208.field3996 != -1) {
                                                int var36 = class208.field3996;
                                                int var37 = class173.field3272;
                                                boolean var38 = class157.method952(19661184, true, 0, 0, 0, 0, class46.field872.field644[0], var36, class46.field872.field615[0], var37, 0, 0);
                                                if (var38) {
                                                    class196.field3806 = 0;
                                                    class24.field437 = 1;
                                                    class21.field409 = class134.field2429;
                                                    class129.field2346 = class158.field2823;
                                                }
                                                class208.field3996 = -1;
                                            }
                                            class131.method795(74);
                                            if (class68.field1305 != var25) {
                                                if (var25 != null) {
                                                    class57.method305(-126, var25);
                                                }
                                                if (class68.field1305 != null) {
                                                    class57.method305(-123, class68.field1305);
                                                }
                                            }
                                            if (class59.field1102 != var26 && class85.field1577 == class117.field2110) {
                                                if (var26 != null) {
                                                    class57.method305(-127, var26);
                                                }
                                                if (class59.field1102 != null) {
                                                    class57.method305(-124, class59.field1102);
                                                }
                                            }
                                            if (class59.field1102 == null) {
                                                if (class117.field2110 > 0) {
                                                    class117.field2110--;
                                                }
                                            } else if (class117.field2110 < class85.field1577) {
                                                class117.field2110++;
                                                if (class85.field1577 == class117.field2110) {
                                                    class57.method305(-120, class59.field1102);
                                                }
                                            }
                                            class187.method1182(2);
                                            if (class209.field4012) {
                                                class143.method880(23995);
                                            }
                                            for (int var39 = 0; var39 < 5; var39++) {
                                                int var10002 = class108.field1958[var39]++;
                                            }
                                            int var40 = class57.method306(-19);
                                            int var41 = class120.method726(1);
                                            if (var40 > 4500 && var41 > 4500) {
                                                class14.field267++;
                                                class175.field3324 = 250;
                                                class195.method1237(4000, -1075125499);
                                                class117.field2122.method106(171, 23);
                                            }
                                            class179.field3423++;
                                            class134.field2446++;
                                            class58.field1089++;
                                            if (class134.field2446 > 500) {
                                                class134.field2446 = 0;
                                                int var42 = (int) (Math.random() * 8.0D);
                                                if ((var42 & 0x2) == 2) {
                                                    class97.field1804 += class9.field160;
                                                }
                                                if ((var42 & 0x1) == 1) {
                                                    class50.field929 += class174.field3307;
                                                }
                                                if ((var42 & 0x4) == 4) {
                                                    class1.field5 += class7.field134;
                                                }
                                            }
                                            if (class1.field5 < -40) {
                                                class7.field134 = 1;
                                            }
                                            if (class50.field929 < -50) {
                                                class174.field3307 = 2;
                                            }
                                            if (class179.field3423 > 500) {
                                                int var43 = (int) (Math.random() * 8.0D);
                                                if ((var43 & 0x1) == 1) {
                                                    class2.field39 += class186.field3603;
                                                }
                                                class179.field3423 = 0;
                                                if ((var43 & 0x2) == 2) {
                                                    class182.field3491 += class44.field849;
                                                }
                                            }
                                            if (class97.field1804 < -55) {
                                                class9.field160 = 2;
                                            }
                                            if (class1.field5 > 40) {
                                                class7.field134 = -1;
                                            }
                                            if (class182.field3491 < -20) {
                                                class44.field849 = 1;
                                            }
                                            if (class50.field929 > 50) {
                                                class174.field3307 = -2;
                                            }
                                            if (class97.field1804 > 55) {
                                                class9.field160 = -2;
                                            }
                                            if (class182.field3491 > 10) {
                                                class44.field849 = -1;
                                            }
                                            if (class2.field39 < -60) {
                                                class186.field3603 = 2;
                                            }
                                            if (class2.field39 > 60) {
                                                class186.field3603 = -2;
                                            }
                                            if (class58.field1089 > 50) {
                                                class117.field2122.method106(33, 26);
                                                class57.field1013++;
                                            }
                                            try {
                                                if (class180.field3435 != null && class117.field2122.field1834 > 0) {
                                                    class180.field3435.method514(class117.field2122.field1834, 0, class117.field2122.field1809, -23422);
                                                    class117.field2122.field1834 = 0;
                                                    class58.field1089 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var44) {
                                                class167.method1042(40);
                                                return;
                                            }
                                        }
                                        var34 = var33.field101;
                                        if (var34.field2989 < 0) {
                                            break;
                                        }
                                        var35 = class44.method255(var34.field3001, 10583);
                                    } while (var35 == null || var35.field3097 == null || var35.field3097.length <= var34.field2989 || var35.field3097[var34.field2989] != var34);
                                    class54.method293(var33, 36);
                                }
                            }
                            var31 = var30.field101;
                            if (var31.field2989 < 0) {
                                break;
                            }
                            var32 = class44.method255(var31.field3001, 10583);
                        } while (var32 == null || var32.field3097 == null || var31.field2989 >= var32.field3097.length || var32.field3097[var31.field2989] != var31);
                        class54.method293(var30, 99);
                    }
                }
                var28 = var27.field101;
                if (var28.field2989 < 0) {
                    break;
                }
                var29 = class44.method255(var28.field3001, 10583);
            } while (var29 == null || var29.field3097 == null || var28.field2989 >= var29.field3097.length || var29.field3097[var28.field2989] != var28);
            class54.method293(var27, 125);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZ)I")
    public final int method264(int arg0, boolean arg1) {
        int var3 = (this.field859.length >> 1) - 1;
        field855++;
        if (!arg1) {
            field858 = null;
        }
        int var4 = arg0 & var3;
        while (true) {
            int var5 = this.field859[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field859[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }
}
