import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class267 {

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
    public static int field4600 = 1;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "Lok;")
    public static class146 field4604 = class235.method1724(-12908, ":chalreq:");

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "Lok;")
    public static class146 field4606 = class235.method1724(-12908, " de votre liste noire)3");

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
    public static int field4602 = -1;

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "Lok;")
    public static class146 field4608 = class235.method1724(-12908, "gr-Un:");

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
    public static int field4597;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public static int field4598;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    public static int field4599;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public static int field4601;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
    public static int field4603;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!bh", name = "n", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IJ)Lok;", line = 10)
    public static final class146 method1938(int arg0, long arg1) {
        field4603++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            if (arg0 <= 9) {
                field4604 = (class146) null;
            }
            long var3 = arg1;
            int var5 = 0;
            while (var3 != 0L) {
                var3 /= 37L;
                var5++;
            }
            byte[] var6 = new byte[var5];
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                var5--;
                var6[var5] = class273.field4705[(int) (var7 - (arg1 * 37L))];
            }
            class146 var9 = new class146();
            var9.field2462 = var6;
            var9.field2461 = var6.length;
            return var9;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V", line = 51)
    public static void method1939(byte arg0) {
        field4606 = null;
        field4604 = null;
        if (arg0 <= 62) {
            field4606 = (class146) null;
        }
        field4608 = null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILtd;)I", line = 63)
    public static final int method1940(int arg0, class234 arg1) {
        field4597++;
        if (arg0 != 0) {
            method1939((byte) 28);
        }
        int var2 = arg1.field3901;
        if (arg1.field5429 == arg1.field5398) {
            var2 = arg1.field3897;
        } else if (arg1.field5439 == arg1.field5429) {
            var2 = arg1.field3921;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIZIIIIII)V", line = 84)
    public static final void method1941(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (class151.field2564 <= arg2 && class126.field2058 >= arg2 && arg6 >= class151.field2564 && arg6 <= class126.field2058 && class151.field2564 <= arg1 && arg1 <= class126.field2058 && arg7 >= class151.field2564 && class126.field2058 >= arg7 && arg9 >= class123.field2008 && arg9 <= class318.field5394 && class123.field2008 <= arg5 && class318.field5394 >= arg5 && arg4 >= class123.field2008 && class318.field5394 >= arg4 && class123.field2008 <= arg8 && class318.field5394 >= arg8) {
            class78.method561(3, arg2, arg5, arg6, arg0, arg1, arg9, arg7, arg4, arg8);
        } else {
            class96.method663(arg4, arg0, arg1, arg9, arg2, arg5, arg6, arg7, arg8, (byte) -115);
        }
        field4609++;
        if (!arg3) {
            method1945((byte) 19);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(JB)V", line = 104)
    public static final void method1942(long arg0, byte arg1) {
        field4601++;
        if (arg0 == 0L) {
            return;
        }
        if (!(class226.field3772 < 100 || class248.field4119) || class226.field3772 >= 200) {
            class316.method2209(false, class303.field5196, 0, class161.field2740);
            return;
        }
        class146 var3 = method1938(80, arg0).method1104((byte) -53);
        for (int var4 = 0; var4 < class226.field3772; var4++) {
            if (class144.field2417[var4] == arg0) {
                class316.method2209(false, class112.method758(-27, new class146[] { var3, class189.field3134 }), 0, class161.field2740);
                return;
            }
        }
        int var5 = 0;
        if (arg1 < 74) {
            return;
        }
        while (class102.field1653 > var5) {
            if (class106.field1715[var5] == arg0) {
                class316.method2209(false, class112.method758(-64, new class146[] { class102.field1649, var3, class192.field3197 }), 0, class161.field2740);
                return;
            }
            var5++;
        }
        if (var3.method1100((byte) -122, class102.field1639.field3891)) {
            class316.method2209(false, class119.field1937, 0, class161.field2740);
            return;
        }
        class44.field759++;
        class303.field5198[class226.field3772] = var3;
        class144.field2417[class226.field3772] = arg0;
        class137.field2282[class226.field3772] = 0;
        class36.field666[class226.field3772] = class161.field2740;
        class168.field2842[class226.field3772] = 0;
        class217.field3574[class226.field3772] = false;
        class150.field2550 = class13.field253;
        class226.field3772++;
        class47.field820.method1656(1, 16);
        class47.field820.method359(arg0, 128);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IBILr;)V", line = 175)
    public static final void method1943(int arg0, byte arg1, int arg2, class264 arg3) {
        if (arg1 >= -66) {
            method1941(63, 88, -120, false, 105, 40, -112, -99, 41, -109);
        }
        if (arg3.field4425 == 0) {
            arg3.field4424 = arg3.field4534;
        } else if (arg3.field4425 == 1) {
            arg3.field4424 = (arg0 - arg3.field4381) / 2 + arg3.field4534;
        } else if (arg3.field4425 == 2) {
            arg3.field4424 = arg0 - arg3.field4381 - arg3.field4534;
        } else if (arg3.field4425 == 3) {
            arg3.field4424 = arg3.field4534 * arg0 >> 14;
        } else if (arg3.field4425 == 4) {
            arg3.field4424 = (arg3.field4534 * arg0 >> 14) + (arg0 - arg3.field4381) / 2;
        } else {
            arg3.field4424 = arg0 - arg3.field4381 - (arg3.field4534 * arg0 >> 14);
        }
        field4607++;
        if (arg3.field4455 == 0) {
            arg3.field4434 = arg3.field4408;
        } else if (arg3.field4455 == 1) {
            arg3.field4434 = (arg2 - arg3.field4393) / 2 + arg3.field4408;
        } else if (arg3.field4455 == 2) {
            arg3.field4434 = arg2 - arg3.field4408 - arg3.field4393;
        } else if (arg3.field4455 == 3) {
            arg3.field4434 = arg3.field4408 * arg2 >> 14;
        } else if (arg3.field4455 == 4) {
            arg3.field4434 = (arg3.field4408 * arg2 >> 14) + (arg2 - arg3.field4393) / 2;
        } else {
            arg3.field4434 = arg2 - arg3.field4393 - (arg3.field4408 * arg2 >> 14);
        }
        if (!class128.field2096 || !(client.method1789(arg3) != 0 || arg3.field4536 == 0)) {
            return;
        }
        if (arg3.field4424 < 0) {
            arg3.field4424 = 0;
        } else if ((arg3.field4424 + arg3.field4381) > arg0) {
            arg3.field4424 = arg0 - arg3.field4381;
        }
        if (arg3.field4434 < 0) {
            arg3.field4434 = 0;
        } else if (arg2 < (arg3.field4434 + arg3.field4393)) {
            arg3.field4434 = arg2 - arg3.field4393;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IZ)V", line = 247)
    public static final void method1944(int arg0, boolean arg1) {
        if (arg1) {
            method1944(-121, true);
        }
        field4598++;
        class177.field3000.method794(-17435, arg0);
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(B)V", line = 259)
    public static final void method1945(byte arg0) {
        field4610++;
        class37 var1 = class66.field1117;
        synchronized (class66.field1117) {
            if (arg0 <= 49) {
                method1943(-94, (byte) 69, 81, (class264) null);
            }
            class14.field272 = class35.field652;
            class232.field3875 = class66.field1120;
            class75.field1217++;
            class316.field5368 = class140.field2326;
            class251.field4203 = class3.field25;
            class120.field1974 = class217.field3580;
            class215.field3542 = class118.field1893;
            class31.field583 = class321.field5488;
            class3.field25 = 0;
        }
    }
}
