import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class205 extends class35 {

    @OriginalMember(owner = "client!ug", name = "cb", descriptor = "Lrd;")
    public static class173 field4008 = class133.method843("Nehmen", 77);

    @OriginalMember(owner = "client!ug", name = "Z", descriptor = "Lrd;")
    public static class173 field4005 = class133.method843("RuneScape wird geladen )2 bitte warten)3)3)3", 46);

    @OriginalMember(owner = "client!ug", name = "fb", descriptor = "Ls;")
    public static class179 field4011 = new class179();

    @OriginalMember(owner = "client!ug", name = "kb", descriptor = "Lrd;")
    public static class173 field4016 = class133.method843("Stufe)2", 26);

    @OriginalMember(owner = "client!ug", name = "lb", descriptor = "I")
    public static int field4017 = 0;

    @OriginalMember(owner = "client!ug", name = "mb", descriptor = "Z")
    public static boolean field4018 = false;

    @OriginalMember(owner = "client!ug", name = "ab", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!ug", name = "bb", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!ug", name = "db", descriptor = "I")
    public int field4009;

    @OriginalMember(owner = "client!ug", name = "eb", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!ug", name = "gb", descriptor = "I")
    public int field4012;

    @OriginalMember(owner = "client!ug", name = "hb", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!ug", name = "ib", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!ug", name = "jb", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!ug", name = "nb", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIII)V")
    public static final void method1361(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = arg4;
        field4015++;
        if (arg2 != -15367) {
            field4018 = false;
        }
        int var8 = arg5 * arg5;
        int var9 = arg4 * arg4;
        int var10 = var9 << 1;
        int var11 = arg4 << 1;
        int var12 = var8 << 1;
        int var13 = (1 - var11) * var8 + var10;
        int var14 = var9 - (var11 - 1) * var12;
        int var15 = var8 << 2;
        int var16 = ((var6 << 1) + 3) * var10;
        int var17 = var9 << 2;
        int var18 = (var6 + 1) * var17;
        int var19 = ((arg4 << 1) - 3) * var12;
        int var20 = (arg4 - 1) * var15;
        if (arg3 >= class37.field790 && class20.field445 >= arg3) {
            int var21 = class68.method421(arg1 + arg5, class194.field3778, -117, class96.field1766);
            int var22 = class68.method421(arg1 - arg5, class194.field3778, 122, class96.field1766);
            class51.method350(var22, arg0, (byte) -118, class107.field1998[arg3], var21);
        }
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var16;
                    var16 += var17;
                    var6++;
                    var14 += var18;
                    var18 += var17;
                }
            }
            if (var14 < 0) {
                var6++;
                var13 += var16;
                var16 += var17;
                var14 += var18;
                var18 += var17;
            }
            var13 += -var20;
            var14 += -var19;
            var20 -= var15;
            var19 -= var15;
            var7--;
            int var23 = arg3 + var7;
            int var24 = arg3 - var7;
            if (var23 >= class37.field790 && class20.field445 >= var24) {
                int var25 = class68.method421(arg1 + var6, class194.field3778, -112, class96.field1766);
                int var26 = class68.method421(arg1 - var6, class194.field3778, -39, class96.field1766);
                if (var24 >= class37.field790) {
                    class51.method350(var26, arg0, (byte) -126, class107.field1998[var24], var25);
                }
                if (class20.field445 >= var23) {
                    class51.method350(var26, arg0, (byte) -121, class107.field1998[var23], var25);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "(B)V")
    public static void method1362(byte arg0) {
        field4005 = null;
        field4016 = null;
        field4011 = null;
        if (arg0 < 40) {
            method1363(null, -74, 101, -113, 62);
        }
        field4008 = null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Led;IIII)V")
    public static final void method1363(class45 arg0, int arg1, int arg2, int arg3, int arg4) {
        field4013++;
        if (class195.field3792 >= 400) {
            return;
        }
        if (arg0.field922 != null) {
            arg0 = arg0.method318((byte) 92);
        }
        if (arg0 == null || !arg0.field918) {
            return;
        }
        class173 var5 = arg0.field943;
        if (arg0.field933 != 0) {
            var5 = class173.method1158(-3, new class173[] { var5, class207.method1371(arg0.field933, class175.field3447.field4110, 26451), class78.field1524, class52.field1073, class93.method588(arg0.field933, true), class173.field3370 });
        }
        if (arg1 < 28) {
            return;
        }
        if (class9.field166 == 1) {
            class11.field180++;
            class19.method172((byte) 123, (short) 15, (long) arg3, class20.field444, arg2, class173.method1158(-3, new class173[] { class150.field2849, class189.field3679, var5 }), arg4);
        } else if (!class182.field3582) {
            class181.field3556++;
            class173[] var6 = arg0.field930;
            if (class176.field3461) {
                var6 = class118.method716(0, var6);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && (class48.field1022 != 0 || !var6[var7].method1123(23, class60.field1174))) {
                        class159.field2969++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 29;
                        }
                        if (var7 == 1) {
                            var8 = 9;
                        }
                        if (var7 == 2) {
                            var8 = 43;
                        }
                        if (var7 == 3) {
                            var8 = 11;
                        }
                        if (var7 == 4) {
                            var8 = 12;
                        }
                        class19.method172((byte) -39, var8, (long) arg3, var6[var7], arg2, class173.method1158(-3, new class173[] { class17.field368, var5 }), arg4);
                    }
                }
            }
            if (class48.field1022 == 0 && var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method1123(-123, class60.field1174)) {
                        class147.field2798++;
                        short var10 = 0;
                        if (class175.field3447.field4110 < arg0.field933) {
                            var10 = 2000;
                        }
                        short var11 = 0;
                        if (var9 == 0) {
                            var11 = 29;
                        }
                        if (var9 == 1) {
                            var11 = 9;
                        }
                        if (var9 == 2) {
                            var11 = 43;
                        }
                        if (var9 == 3) {
                            var11 = 11;
                        }
                        if (var9 == 4) {
                            var11 = 12;
                        }
                        if (var11 != 0) {
                            var11 += var10;
                        }
                        class19.method172((byte) -30, var11, (long) arg3, var6[var9], arg2, class173.method1158(-3, new class173[] { class17.field368, var5 }), arg4);
                    }
                }
            }
            class19.method172((byte) -88, (short) 1004, (long) arg3, class167.field3233, arg2, class173.method1158(-3, new class173[] { class17.field368, var5 }), arg4);
        } else if ((class36.field780 & 0x2) == 2) {
            class7.field136++;
            class19.method172((byte) 106, (short) 14, (long) arg3, class48.field1023, arg2, class173.method1158(-3, new class173[] { class42.field868, class189.field3679, var5 }), arg4);
            return;
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(III)I")
    public static final int method1364(int arg0, int arg1, int arg2) {
        field4014++;
        int var3 = class159.method1042(true, arg2 - 1, arg0 + -1) + class159.method1042(true, arg2 + 1, arg0 + -1) + class159.method1042(true, arg2 - 1, arg0 + 1) + class159.method1042(true, arg2 - -1, arg0 + 1);
        int var4 = class159.method1042(true, arg2 - 1, arg0) + class159.method1042(true, arg2 + 1, arg0) + class159.method1042(true, arg2, arg0 - 1) + class159.method1042(true, arg2, arg0 + 1);
        int var5 = class159.method1042(true, arg2, arg0);
        return arg1 <= 83 ? 85 : var4 / 8 + var3 / 16 + var5 / 4;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BILrd;)V")
    public static final void method1365(byte arg0, int arg1, class173 arg2) {
        field4007++;
        class173 var3 = arg2.method1159(0).method1142(-98);
        boolean var4 = false;
        int var5 = 62 / ((-arg0 - 34) / 53);
        for (int var6 = 0; var6 < class18.field378; var6++) {
            class212 var7 = class183.field3600[class189.field3703[var6]];
            if (var7 != null && var7.field4097 != null && var7.field4097.method1123(-128, var3)) {
                var4 = true;
                class30.method233(1, var7.field2814[0], class175.field3447.field2814[0], var7.field2764[0], false, 2, 0, 0, class175.field3447.field2764[0], (byte) -2, 1, 0);
                if (arg1 == 1) {
                    class165.field3175.method1023(253, -21822);
                    class10.field173++;
                    class165.field3175.method762(class189.field3703[var6], true);
                } else if (arg1 == 4) {
                    class165.field3175.method1023(134, -21822);
                    class165.field3175.method769(class189.field3703[var6], 126);
                    class5.field121++;
                } else if (arg1 == 6) {
                    class188.field3670++;
                    class165.field3175.method1023(211, -21822);
                    class165.field3175.method762(class189.field3703[var6], true);
                } else if (arg1 == 7) {
                    class22.field474++;
                    class165.field3175.method1023(198, -21822);
                    class165.field3175.method769(class189.field3703[var6], 126);
                }
                break;
            }
        }
        if (!var4) {
            class166.method1074(class208.field4049, 0, class173.method1158(-3, new class173[] { class13.field275, var3 }), 99);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IJ)V")
    public static final void method1366(int arg0, long arg1) {
        field4019++;
        if (arg1 == 0L) {
            return;
        }
        if (class149.field2840 >= 100) {
            class166.method1074(class208.field4049, 0, class204.field3993, 127);
            return;
        }
        class173 var3 = class22.method185(arg0 - 1097, arg1).method1142(-98);
        for (int var4 = 0; var4 < class149.field2840; var4++) {
            if (class52.field1074[var4] == arg1) {
                class166.method1074(class208.field4049, 0, class173.method1158(arg0 ^ 0x587E, new class173[] { var3, class54.field1081 }), -65);
                return;
            }
        }
        for (int var5 = 0; var5 < class129.field2442; var5++) {
            if (class209.field4061[var5] == arg1) {
                class166.method1074(class208.field4049, 0, class173.method1158(arg0 ^ 0x587E, new class173[] { class145.field2710, var3, class171.field3315 }), 79);
                return;
            }
        }
        if (var3.method1128(false, class175.field3447.field4097)) {
            class166.method1074(class208.field4049, 0, class103.field1921, 78);
            return;
        }
        class52.field1074[class149.field2840] = arg1;
        class181.field3552++;
        class191.field3730[class149.field2840++] = class22.method185(class195.method1297(arg0, 1209), arg1);
        class189.field3692 = class34.field741;
        class165.field3175.method1023(229, arg0 ^ 0xD41);
        if (arg0 != -22653) {
            field4017 = 52;
        }
        class165.field3175.method756(arg1, 97);
    }

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "(I)Lvf;")
    public final class213 method274(int arg0) {
        if (arg0 != -32768) {
            field4016 = null;
        }
        field4010++;
        return class195.method1298(arg0 ^ 0xFFFF8667, this.field4009).method161(null, this.field4012, 234428564, 0);
    }
}
