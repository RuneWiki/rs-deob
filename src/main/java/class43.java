import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class43 {

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "Z")
    public static boolean field541 = true;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
    public static int field545 = 0;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "F")
    public static float field543;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "Lak;")
    public static class172 field540;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIIIIII)V", line = 4)
    public static final void method215(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field547++;
        if (arg1 != 0) {
            field543 = -0.9826017F;
        }
        if (class263.method1875(35, arg5)) {
            class98.method668(arg3, arg4, arg6, arg7, arg2, arg0, -1, arg8, class221.field3547[arg5], -1);
        } else if (arg4 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class174.field2884[var9] = true;
            }
        } else {
            class174.field2884[arg4] = true;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IZLt;Lt;B)I", line = 44)
    public static final int method216(int arg0, boolean arg1, class339 arg2, class339 arg3, byte arg4) {
        field542++;
        if (arg0 == 1) {
            int var5 = arg2.field466;
            int var6 = arg3.field466;
            if (!arg1) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg0 == 2) {
            return class99.method671(arg2.method2362(122).field2877, arg4 - 7868, class8.field121, arg3.method2362(-59).field2877);
        } else if (arg0 == 3) {
            if (arg2.field5287.equals("-")) {
                if (arg3.field5287.equals("-")) {
                    return 0;
                } else if (arg1) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg3.field5287.equals("-")) {
                return arg1 ? 1 : -1;
            } else {
                return class99.method671(arg2.field5287, -7972, class8.field121, arg3.field5287);
            }
        } else if (arg0 == 4) {
            return arg2.method185((byte) -122) ? (arg3.method185((byte) 12) ? 0 : 1) : (arg3.method185((byte) -122) ? -1 : 0);
        } else {
            if (arg4 != -104) {
                method217(13, -99, -75, 82, (class157) null);
            }
            if (arg0 == 5) {
                return arg2.method186((byte) 103) ? (arg3.method186((byte) 99) ? 0 : 1) : (arg3.method186((byte) 97) ? -1 : 0);
            } else if (arg0 == 6) {
                return arg2.method182(31050) ? (arg3.method182(31050) ? 0 : 1) : (arg3.method182(31050) ? -1 : 0);
            } else if (arg0 == 7) {
                return arg2.method189(true) ? (arg3.method189(true) ? 0 : 1) : (arg3.method189(true) ? -1 : 0);
            } else {
                return arg2.field5281 - arg3.field5281;
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIILog;)V", line = 114)
    public static final void method217(int arg0, int arg1, int arg2, int arg3, class157 arg4) {
        if (arg1 != 2) {
            return;
        }
        if (class232.field3690) {
            class75.method506(arg2, arg0, arg4.field2468 + arg2, arg0 - -arg4.field2520);
        }
        field549++;
        if (client.field1658 >= 3) {
            if (class232.field3690) {
                class58 var5 = arg4.method1130(102, false);
                if (var5 != null) {
                    var5.method375(arg2, arg0);
                }
            } else {
                class59.method396(arg2, arg0, 0, arg4.field2502, arg4.field2582);
            }
        } else if (class232.field3690) {
            ((class314) class133.field2093).method2207(arg2, arg0, arg4.field2468, arg4.field2520, class133.field2093.field825 / 2, class133.field2093.field816 / 2, (int) class330.field5090, 256, (class314) arg4.method1130(-106, false));
        } else {
            ((class220) class133.field2093).method1575(arg2, arg0, arg4.field2468, arg4.field2520, class133.field2093.field825 / 2, class133.field2093.field816 / 2, (int) class330.field5090, 256, arg4.field2502, arg4.field2582);
        }
        class127.field1991[arg3] = true;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V", line = 164)
    public static final void method218(int arg0) {
        for (class155 var1 = (class155) class240.field3813.method1240(3); var1 != null; var1 = (class155) class240.field3813.method1235(false)) {
            if (var1.field2391) {
                var1.method1108(2267);
            }
        }
        field548++;
        if (arg0 <= 106) {
            field543 = -0.6262792F;
        }
        for (class155 var2 = (class155) class229.field3636.method1240(3); var2 != null; var2 = (class155) class229.field3636.method1235(false)) {
            if (var2.field2391) {
                var2.method1108(2267);
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IZIIII)V", line = 195)
    public static final void method219(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field544++;
        class97.field1385++;
        class167.method1223((byte) 37);
        if (arg1) {
            class80.method546(false, 0, false, arg2 - 113);
        } else {
            class21.method113(arg2 - 68, 0);
            class80.method546(true, 0, false, -106);
            if (class106.field1577 == 0) {
                for (int var7 = 1; var7 <= 5; var7++) {
                    class80.method546(false, var7, false, arg2 ^ 0xFFFFFFA3);
                    class80.method546(false, var7, true, 117);
                    class21.method113(-66, var7);
                }
            } else {
                for (int var6 = 1; var6 <= 5; var6++) {
                    class21.method113(-93, var6);
                    class80.method546(false, var6, false, -63);
                    class80.method546(false, var6, true, -75);
                }
            }
        }
        if (!arg1) {
            class181.method1355(arg2 + 123);
        }
        class165.method1216(0);
        if (class232.field3690) {
            class142.method1050(true, arg0, arg4, arg3, (byte) 113, arg5);
            arg5 = class229.field3657;
            arg0 = class295.field4680;
            arg3 = class340.field5289;
            arg4 = class8.field117;
        }
        if (class31.field423 == 1) {
            int var8 = (int) class97.field1386;
            if (class147.field2285 / 256 > var8) {
                var8 = class147.field2285 / 256;
            }
            if (class204.field3335[4] && class327.field5050[4] + 128 > var8) {
                var8 = class327.field5050[4] + 128;
            }
            int var9 = (int) class330.field5090 + class150.field2324 & 0x7FF;
            class117.method804(11104, class129.field2014, var8 * 3 + 600, var8, var9, class123.method889(1, class49.field698, class191.field3129.field4255, class191.field3129.field4264) - 50, arg4, class55.field772);
        } else if (class31.field423 == 5) {
            class204.method1486(arg4, arg2 ^ 0x800);
        }
        int var10 = class120.field1825;
        int var11 = class83.field1173;
        int var12 = class260.field4150;
        int var13 = class74.field1036;
        int var14 = class186.field3076;
        for (int var15 = arg2; var15 < 5; var15++) {
            if (class204.field3335[var15]) {
                int var16 = (int) ((double) (-class11.field140[var15]) + Math.random() * (double) (class11.field140[var15] * 2 + 1) + Math.sin((double) class127.field1985[var15] / 100.0D * (double) class270.field4357[var15]) * (double) class327.field5050[var15]);
                if (var15 == 2) {
                    class260.field4150 += var16;
                }
                if (var15 == 3) {
                    class186.field3076 = class186.field3076 + var16 & 0x7FF;
                }
                if (var15 == 4) {
                    class74.field1036 += var16;
                    if (class74.field1036 < 128) {
                        class74.field1036 = 128;
                    }
                    if (class74.field1036 > 383) {
                        class74.field1036 = 383;
                    }
                }
                if (var15 == 1) {
                    class83.field1173 += var16;
                }
                if (var15 == 0) {
                    class120.field1825 += var16;
                }
            }
        }
        class152.method1104(-115);
        if (class232.field3690) {
            class75.method506(arg5, arg0, arg3 + arg5, arg0 + arg4);
            float var18 = (float) class74.field1036 * 0.17578125F;
            float var19 = (float) class186.field3076 * 0.17578125F;
            if (class31.field423 == 3) {
                var19 = class333.field5185 * 360.0F / 6.2831855F;
                var18 = class330.field5137 * 360.0F / 6.2831855F;
            }
            boolean var20 = false;
            int var21;
            if (class5.field75 == 10) {
                var21 = class143.method1058(class36.field477, class149.field2311, class260.field4150 >> 10, class120.field1825 >> 10, -4);
            } else {
                var21 = class143.method1058(class36.field477, class149.field2311, class191.field3129.field4184[0] >> 3, class191.field3129.field4248[0] >> 3, -4);
            }
            if (class55.field771 >= 0) {
                class232.method1670();
                class266 var22 = class193.method1426((byte) -43, class243.field3841, class86.field1198, class89.field1238, class55.field771);
                var22.method1891(class160.field2652, arg5, arg0, arg3, arg4, class74.field1036, class186.field3076, var21);
            } else {
                class232.method1649(var21);
            }
            class232.method1655(arg5, arg0, arg3, arg4, arg3 / 2 + arg5, arg0 - -(arg4 / 2), var18, var19, class153.field2357, class153.field2357);
            class226.method1602(true, false);
            class232.method1648();
            class232.method1674(true);
            class232.method1647(true);
        } else {
            class59.method389(arg5, arg0, arg3 + arg5, arg0 + arg4);
            class170.method1250();
            if (class55.field771 < 0) {
                class59.method382(arg5, arg0, arg3, arg4, 0);
            } else {
                class266 var17 = class193.method1426((byte) -43, class243.field3841, class86.field1198, class89.field1238, class55.field771);
                var17.method1890(class160.field2652, arg5, arg0, arg3, arg4, class74.field1036, class186.field3076, 0);
            }
        }
        if (class196.field3204 || arg5 > class200.field3248 || arg5 + arg3 <= class200.field3248 || class222.field3554 < arg0 || arg0 + arg4 <= class222.field3554) {
            class158.field2620 = false;
            class194.field3174 = 0;
        } else {
            class194.field3174 = 0;
            class158.field2620 = true;
            int var23 = class74.field1050;
            int var24 = class100.field1458;
            int var25 = class99.field1443;
            class51.field734 = (var25 - var23) * (class200.field3248 - arg5) / arg3 + var23;
            int var26 = class207.field3414;
            class243.field3848 = (class222.field3554 - arg0) * (var26 - var24) / arg4 + var24;
        }
        class76.method516((byte) -51);
        byte var27 = class334.method2334((byte) -70) == 2 ? (byte) class97.field1385 : 1;
        if (class232.field3690) {
            class118.method822(class240.field3818, !class42.field535);
            class325.method2276(class120.field1825, class83.field1173, class74.field1036, (byte) 39, class260.field4150, class186.field3076);
            class232.field3701 = class240.field3818;
            class199.method1460(class120.field1825, class83.field1173, class260.field4150, class74.field1036, class186.field3076, class7.field101, class5.field78, class164.field2736, class121.field1879, class15.field193, class84.field1174, class49.field698 + 1, var27, class191.field3129.field4255 >> 7, class191.field3129.field4264 >> 7);
            class185.field3067 = true;
            class118.method828();
            class325.method2276(0, 0, 0, (byte) 33, 0, 0);
            class76.method516((byte) -51);
            class341.method2366(arg5, arg4, arg2 ^ 0xFFFFFF80, class153.field2357, arg0, class153.field2357, arg3);
            class177.method1332(arg5, arg0, class153.field2357, (byte) -108, class153.field2357, arg3, arg4);
            class58.method369();
        } else {
            class199.method1460(class120.field1825, class83.field1173, class260.field4150, class74.field1036, class186.field3076, class7.field101, class5.field78, class164.field2736, class121.field1879, class15.field193, class84.field1174, class49.field698 + 1, var27, class191.field3129.field4255 >> 7, class191.field3129.field4264 >> 7);
            class76.method516((byte) -51);
            class58.method369();
            class341.method2366(arg5, arg4, -128, 256, arg0, 256, arg3);
            class177.method1332(arg5, arg0, 256, (byte) -108, 256, arg3, arg4);
        }
        ((class130) class170.field2814).method953(1, class36.field477);
        class142.method1054(arg2 ^ 0x57, arg3, arg0, arg4, arg5);
        class260.field4150 = var12;
        class186.field3076 = var14;
        class120.field1825 = var10;
        class83.field1173 = var11;
        class74.field1036 = var13;
        if (class160.field2644 && class286.field4589.method1364(-90) == 0) {
            class160.field2644 = false;
        }
        if (class160.field2644) {
            if (class232.field3690) {
                class75.method505(arg5, arg0, arg3, arg4, 0);
            } else {
                class59.method382(arg5, arg0, arg3, arg4, 0);
            }
            class138.method1025(arg2 + 26835, false, class108.field1605);
        }
        if (!arg1 && !class160.field2644 && !class196.field3204 && class200.field3248 >= arg5 && class200.field3248 < (arg3 + arg5) && class222.field3554 >= arg0 && class222.field3554 < (arg0 + arg4)) {
            class164.method1211(arg5, 79406247, arg0, class222.field3554, class200.field3248, arg4, arg3);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V", line = 452)
    public static void method220(byte arg0) {
        if (arg0 != -115) {
            field541 = true;
        }
        field540 = null;
    }
}
