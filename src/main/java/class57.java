import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class57 extends class320 {

    @OriginalMember(owner = "client!lm", name = "H", descriptor = "I")
    public int field891;

    @OriginalMember(owner = "client!lm", name = "F", descriptor = "I")
    public int field889;

    @OriginalMember(owner = "client!lm", name = "r", descriptor = "Z")
    public static boolean field875 = true;

    @OriginalMember(owner = "client!lm", name = "n", descriptor = "[I")
    public static int[] field871 = new int[14];

    @OriginalMember(owner = "client!lm", name = "G", descriptor = "Z")
    public static volatile boolean field890 = true;

    @OriginalMember(owner = "client!lm", name = "y", descriptor = "Lul;")
    public static class51 field882 = new class51(260);

    @OriginalMember(owner = "client!lm", name = "l", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!lm", name = "m", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!lm", name = "o", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!lm", name = "p", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!lm", name = "q", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!lm", name = "s", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!lm", name = "t", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!lm", name = "u", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!lm", name = "v", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!lm", name = "w", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!lm", name = "x", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!lm", name = "z", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!lm", name = "A", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!lm", name = "B", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!lm", name = "C", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!lm", name = "D", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!lm", name = "E", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!lm", name = "I", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!lm", name = "J", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V", line = 4)
    public static final void method506(byte arg0) {
        field870++;
        if (arg0 > -7) {
            method519(-119);
        }
        for (class249 var1 = (class249) class178.field3018.method2297(14204); var1 != null; var1 = (class249) class178.field3018.method2291(96)) {
            class219 var2 = var1.field4039;
            if (class205.field3497 != var2.field3652 || var2.field3672 < class181.field3045) {
                var1.method2195(-1);
            } else if (var2.field3655 <= class181.field3045) {
                if (var2.field3656 > 0) {
                    class278 var3 = class320.field5071[var2.field3656 - 1];
                    if (var3 != null && var3.field2036 >= 0 && var3.field2036 < 13312 && var3.field1985 >= 0 && var3.field1985 < 13312) {
                        var2.method1611(class181.field3045, var3.field2036, 103, class223.method1627((byte) -128, var3.field1985, var3.field2036, var2.field3652) - var2.field3648, var3.field1985);
                    }
                }
                if (var2.field3656 < 0) {
                    int var4 = -var2.field3656 - 1;
                    class205 var5;
                    if (class316.field5010 == var4) {
                        var5 = class218.field3632;
                    } else {
                        var5 = class135.field2359[var4];
                    }
                    if (var5 != null && var5.field2036 >= 0 && var5.field2036 < 13312 && var5.field1985 >= 0 && var5.field1985 < 13312) {
                        var2.method1611(class181.field3045, var5.field2036, -121, class223.method1627((byte) -127, var5.field1985, var5.field2036, var2.field3652) - var2.field3648, var5.field1985);
                    }
                }
                var2.method1610(119, class31.field446);
                class243.method1702(class205.field3497, (int) var2.field3670, (int) var2.field3647, (int) var2.field3677, 60, var2, var2.field3661, -1L, false);
            }
        }
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(I)V", line = 60)
    public static final void method507(int arg0) {
        field872++;
        class160.field2823.method466(-1);
        if (arg0 != 1) {
            field890 = true;
        }
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(Z)Z", line = 74)
    public final boolean method508(boolean arg0) {
        field877++;
        if (!arg0) {
            this.field891 = -76;
        }
        return ((this.field891 & 0x35AF66) >> 21) != 0;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)Z", line = 86)
    public final boolean method509(int arg0, int arg1) {
        field888++;
        if (arg0 != 2966) {
            field871 = (int[]) null;
        }
        return (this.field891 >> arg1 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(B)Z", line = 98)
    public final boolean method510(byte arg0) {
        if (arg0 > -91) {
            return true;
        } else {
            field883++;
            return (this.field891 & 0x72BF21) >> 22 != 0;
        }
    }

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "(I)V", line = 110)
    public static final void method511(int arg0) {
        class258.method1793(class204.field3473, arg0 ^ arg0);
        field886++;
        class42.field617++;
        if (class212.field3576 && class332.field5288) {
            int var1 = class284.field4508;
            int var2 = class258.field4182;
            int var3 = class204.field3473.field2374;
            int var4 = var2 - class242.field3958;
            int var5 = var1 - class291.field4653;
            if (class228.field3831 > var4) {
                var4 = class228.field3831;
            }
            if ((class204.field3473.field2515 + var4) > (class228.field3831 + class272.field4343.field2515)) {
                var4 = class228.field3831 + class272.field4343.field2515 - class204.field3473.field2515;
            }
            int var6 = var4 - class327.field5202;
            int var7 = var4 + class272.field4343.field2531 - class228.field3831;
            if (class317.field5030 > var5) {
                var5 = class317.field5030;
            }
            if ((class204.field3473.field2533 + var5) > (class317.field5030 + class272.field4343.field2533)) {
                var5 = class317.field5030 + class272.field4343.field2533 - class204.field3473.field2533;
            }
            int var8 = var5 - class50.field779;
            if (class204.field3473.field2504 < class42.field617 && (var3 < var8 || (-var3) > var8 || var6 > var3 || -var3 > var6)) {
                class170.field2956 = true;
            }
            int var9 = var5 + class272.field4343.field2477 - class317.field5030;
            if (class204.field3473.field2527 != null && class170.field2956) {
                class258 var10 = new class258();
                var10.field4168 = class204.field3473;
                var10.field4181 = var9;
                var10.field4169 = var7;
                var10.field4173 = class204.field3473.field2527;
                class179.method1376(var10, false);
            }
            if (class204.field3467 == 0) {
                if (class170.field2956) {
                    if (class204.field3473.field2537 != null) {
                        class258 var11 = new class258();
                        var11.field4169 = var7;
                        var11.field4181 = var9;
                        var11.field4168 = class204.field3473;
                        var11.field4189 = class240.field3920;
                        var11.field4173 = class204.field3473.field2537;
                        class179.method1376(var11, false);
                    }
                    if (class240.field3920 != null && client.method1895(class204.field3473) != null) {
                        class243.field3963++;
                        class341.field5443.method26(36, 7);
                        class341.field5443.method2324(class240.field3920.field2462, true);
                        class341.field5443.method2366(-42, class204.field3473.field2434);
                        class341.field5443.method2320(arg0 - 6144, class204.field3473.field2462);
                        class341.field5443.method2334((byte) 2, class240.field3920.field2434);
                    }
                } else if ((class38.field554 == 1 || class316.method2172(-2001, class293.field4708 - 1)) && class293.field4708 > 2) {
                    class64.method607(-74);
                } else if (class293.field4708 > 0) {
                    class79.method728(1);
                }
                class204.field3473 = null;
            }
        } else if (class42.field617 > 1) {
            class204.field3473 = null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(B)Z", line = 235)
    public final boolean method512(byte arg0) {
        if (arg0 <= 9) {
            this.field889 = 106;
        }
        field873++;
        return (this.field891 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "(I)Z", line = 246)
    public final boolean method513(int arg0) {
        field876++;
        if (arg0 != 1) {
            this.method523((byte) -124);
        }
        return (this.field891 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I[B)[B", line = 262)
    public static final byte[] method514(int arg0, byte[] arg1) {
        field892++;
        if (arg1 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg1.length];
            int var3 = 111 % ((-arg0 - 53) / 32);
            class345.method2417(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIBII)V", line = 278)
    public static final void method515(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field880++;
        int var6 = (arg0 - 32) * arg0 / arg5;
        if (var6 < 8) {
            var6 = 8;
        }
        if (arg3 != 115) {
            return;
        }
        class328.field5222[0].method1596(arg2, arg1);
        int var7 = (arg0 - var6 - 32) * arg4 / (arg5 - arg0);
        class328.field5222[1].method1596(arg2, arg0 + arg1 - 16);
        if (!class43.field680) {
            class47.method422(arg2, arg1 + 16, 16, arg0 - 32, class90.field1436);
            class47.method422(arg2, arg1 + var7 + 16, 16, var6, class99.field1611);
            class47.method409(arg2, arg1 + var7 + 16, var6, class44.field707);
            class47.method409(arg2 + 1, arg1 - -var7 + 16, var6, class44.field707);
            class47.method412(arg2, arg1 + var7 + 16, 16, class44.field707);
            class47.method412(arg2, arg1 + var7 + 17, 16, class44.field707);
            class47.method409(arg2 + 15, arg1 + 16 + var7, var6, class114.field1910);
            class47.method409(arg2 + 14, arg1 + 17 + var7, var6 - 1, class114.field1910);
            class47.method412(arg2, arg1 + 15 - (-var6 + -var7), 16, class114.field1910);
            class47.method412(arg2 + 1, var6 + var7 + 14 + arg1, 15, class114.field1910);
            return;
        }
        class169.method1337(arg2, arg1 + 16, 16, arg0 - 32, class90.field1436);
        class169.method1337(arg2, arg1 + var7 + 16, 16, var6, class99.field1611);
        class169.method1328(arg2, var7 + arg1 + 16, var6, class44.field707);
        class169.method1328(arg2 + 1, arg1 + 16 + var7, var6, class44.field707);
        class169.method1323(arg2, arg1 + var7 + 16, 16, class44.field707);
        class169.method1323(arg2, arg1 - (-var7 - 17), 16, class44.field707);
        class169.method1328(arg2 + 15, arg1 + var7 + 16, var6, class114.field1910);
        class169.method1328(arg2 + 14, arg1 + var7 + 17, var6 - 1, class114.field1910);
        class169.method1323(arg2, var6 + var7 + arg1 + 15, 16, class114.field1910);
        class169.method1323(arg2 + 1, arg1 + var7 + var6 + 14, 15, class114.field1910);
    }

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "(I)V", line = 333)
    public static final void method516(int arg0) {
        class269.field4306 = null;
        class286.field4563 = null;
        field885++;
        class148.field2663 = null;
        class78.field1265 = null;
        class15.field233 = null;
        class51.field806 = null;
        class271.field4319 = (byte[][][]) null;
        class224.field3745 = (byte[][][]) null;
        class226.field3798 = (int[][][]) null;
        class310.field4912 = (byte[][][]) null;
        class193.field3230 = (byte[][][]) null;
        if (arg0 != 31732) {
            field871 = (int[]) null;
        }
        class175.field2993 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(II)I", line = 355)
    public static final int method517(int arg0, int arg1) {
        field893++;
        return arg1 == 532943050 ? arg0 >>> 10 : 0;
    }

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "(B)Z", line = 370)
    public final boolean method518(byte arg0) {
        if (arg0 != 73) {
            field882 = (class51) null;
        }
        field887++;
        return ((this.field891 & 0x3B1566C3) >> 29) != 0;
    }

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "(I)V", line = 384)
    public static void method519(int arg0) {
        field871 = null;
        field882 = null;
        if (arg0 != 80) {
            field890 = false;
        }
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(Z)I", line = 395)
    public final int method520(boolean arg0) {
        field881++;
        if (arg0) {
            this.field891 = -23;
        }
        return (this.field891 & 0x1F721E) >> 18;
    }

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "(I)Z", line = 406)
    public final boolean method521(int arg0) {
        field869++;
        int var2 = 103 / ((28 - arg0) / 43);
        return ((this.field891 & 0x69AAE34B) >> 30) != 0;
    }

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "(B)Z", line = 418)
    public final boolean method522(byte arg0) {
        if (arg0 >= -117) {
            method511(105);
        }
        field884++;
        return (this.field891 >> 28 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "(B)I", line = 431)
    public final int method523(byte arg0) {
        field879++;
        return arg0 == -48 ? class250.method1752(true, this.field891) : 11;
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(II)V", line = 448)
    public class57(int arg0, int arg1) {
        this.field891 = arg0;
        this.field889 = arg1;
    }
}
