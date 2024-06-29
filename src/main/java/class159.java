import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class159 {

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "Lgj;")
    private class220 field2723 = new class220();

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "Lmh;")
    public static class128 field2721 = class22.method156(123, " ");

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "Lmh;")
    public static class128 field2726 = class22.method156(127, "::rebuild");

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "Lmh;")
    public static class128 field2718 = class22.method156(127, "event_opbase");

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!dh", name = "m", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!dh", name = "n", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!dh", name = "o", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!dh", name = "p", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!dh", name = "q", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!dh", name = "r", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!dh", name = "s", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!dh", name = "t", descriptor = "Lgj;")
    private class220 field2735;

    @OriginalMember(owner = "client!dh", name = "l", descriptor = "[I")
    public static int[] field2727;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILgj;)V", line = 11)
    public final void method1046(int arg0, class220 arg1) {
        if (arg1.field3880 != null) {
            arg1.method1521(arg0 ^ 0xFFFFF11E);
        }
        arg1.field3880 = this.field2723.field3880;
        field2720++;
        arg1.field3881 = this.field2723;
        if (arg0 != 0) {
            method1059((byte) 42);
        }
        arg1.field3880.field3881 = arg1;
        arg1.field3881.field3880 = arg1;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)Lgj;", line = 29)
    public final class220 method1047(byte arg0) {
        field2730++;
        class220 var2 = this.field2723.field3881;
        if (this.field2723 == var2) {
            return null;
        }
        var2.method1521(-3810);
        if (arg0 >= -26) {
            this.method1051((byte) -26);
        }
        return var2;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZIIIII)V", line = 51)
    public static final void method1048(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2716++;
        int var6 = arg5;
        if (!arg0) {
            while (var6 <= arg3) {
                class314.method2138(arg2, true, arg4, class219.field3850[var6], arg1);
                var6++;
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIII)V", line = 70)
    public static final void method1049(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if ((arg0 - arg3) >= class193.field3335 && class43.field875 >= arg0 + arg3 && class70.field1315 <= arg1 - arg3 && arg1 + arg3 <= class181.field3173) {
            class225.method1550(arg3, arg1, arg0, (byte) 123, arg4);
        } else {
            class219.method1513(arg0, arg1, arg3, arg4, 0);
        }
        field2719++;
        if (arg2 != 14804) {
            method1052(87, (byte[]) null, true);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V", line = 93)
    public static void method1050(int arg0) {
        if (arg0 == 10628) {
            field2727 = null;
            field2718 = null;
            field2721 = null;
            field2726 = null;
        }
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(B)Lgj;", line = 108)
    public final class220 method1051(byte arg0) {
        class220 var2 = this.field2735;
        field2724++;
        if (this.field2723 == var2) {
            this.field2735 = null;
            return null;
        } else {
            this.field2735 = var2.field3881;
            int var3 = -62 / ((arg0 + 43) / 36);
            return var2;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I[BZ)Ljava/lang/Object;", line = 128)
    public static final Object method1052(int arg0, byte[] arg1, boolean arg2) {
        field2733++;
        if (arg1 == null) {
            return null;
        }
        if (arg1.length > 136 && !class7.field163) {
            try {
                class110 var3 = (class110) Class.forName("bb").getDeclaredConstructor().newInstance();
                var3.method542(arg1, 6592);
                return var3;
            } catch (Throwable var5) {
                class7.field163 = true;
            }
        }
        if (arg0 >= -62) {
            return (Object) null;
        } else if (arg2) {
            return class38.method259((byte) -119, arg1);
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "(B)Lgj;", line = 164)
    public final class220 method1053(byte arg0) {
        class220 var2 = this.field2723.field3881;
        if (arg0 > -18) {
            method1057(false, -89);
        }
        field2731++;
        if (this.field2723 == var2) {
            this.field2735 = null;
            return null;
        } else {
            this.field2735 = var2.field3881;
            return var2;
        }
    }

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "(B)V", line = 197)
    public final void method1054(byte arg0) {
        while (true) {
            class220 var2 = this.field2723.field3881;
            if (this.field2723 == var2) {
                if (arg0 >= -44) {
                    return;
                }
                field2734++;
                this.field2735 = null;
                return;
            }
            var2.method1521(-3810);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILcf;II)V", line = 216)
    public static final void method1055(int arg0, class123 arg1, int arg2, int arg3) {
        if (arg1.field451 == arg0 && arg0 != -1) {
            class1 var4 = class167.method1091(-72, arg0);
            int var5 = var4.field5;
            if (var5 == 1) {
                arg1.field430 = 0;
                arg1.field470 = 0;
                arg1.field463 = arg3;
                arg1.field461 = 0;
                class171.method1143(arg1.field418, 118, var4, class163.field2796 == arg1, arg1.field461, arg1.field478);
            }
            if (var5 == 2) {
                arg1.field470 = 0;
            }
        } else if (arg0 == -1 || arg1.field451 == -1 || class167.method1091(-101, arg0).field34 >= class167.method1091(122, arg1.field451).field34) {
            arg1.field461 = 0;
            arg1.field463 = arg3;
            arg1.field442 = arg1.field414;
            arg1.field470 = 0;
            arg1.field430 = 0;
            arg1.field451 = arg0;
            if (arg1.field451 != -1) {
                class171.method1143(arg1.field418, 121, class167.method1091(85, arg1.field451), class163.field2796 == arg1, arg1.field461, arg1.field478);
            }
        }
        if (arg2 == 17446) {
            field2722++;
        }
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)V", line = 264)
    public static final void method1056(int arg0) {
        if (!class271.field4721) {
            class117.field1979[0] = 1003;
            class275.field4769 = 1;
            class283.field4868[0] = class137.field2359;
            class210.field3725[0] = class273.field4733;
            if (class173.field3069 != 0) {
                class252.field4359 = class104.field1790;
                class178.field3129 = class288.field4927;
            } else if (class103.field1767 == 0) {
                class178.field3129 = class77.field1411;
                class252.field4359 = class275.field4760;
            } else {
                class252.field4359 = class45.field915;
                class178.field3129 = class241.field4129;
            }
        }
        field2732++;
        if (class196.field3433 != -1) {
            class211.method1455(class196.field3433, -15843);
        }
        for (int var1 = 0; var1 < class257.field4424; var1++) {
            if (class26.field581[var1]) {
                class199.field3468[var1] = true;
            }
            class253.field4366[var1] = class26.field581[var1];
            class26.field581[var1] = false;
        }
        class185.field3223 = null;
        class264.field4581 = -1;
        class66.field1273 = class293.field5011;
        class165.field2843 = -1;
        if (class247.field4247) {
            class226.field3947 = true;
        }
        if (class196.field3433 != -1) {
            class257.field4424 = 0;
            class142.method950(class199.field3465, class16.field420, 0, -13238, -1, 0, class196.field3433, 0, 0);
        }
        if (arg0 != -137) {
            method1048(false, -1, -70, -128, -42, 50);
        }
        if (class247.field4247) {
            class269.method1879();
        } else {
            class213.method1472();
        }
        class161.method1063(107);
        if (class271.field4721) {
            class222.method1531(-5154);
        } else if (class165.field2843 != -1) {
            class106.method652(class165.field2843, false, class264.field4581);
        }
        if (class226.field3954 == 3) {
            for (int var2 = 0; var2 < class257.field4424; var2++) {
                if (class253.field4366[var2]) {
                    if (class247.field4247) {
                        class269.method1876(class120.field2037[var2], class275.field4762[var2], class32.field711[var2], class313.field5281[var2], 16711935, 128);
                    } else {
                        class213.method1479(class120.field2037[var2], class275.field4762[var2], class32.field711[var2], class313.field5281[var2], 16711935, 128);
                    }
                } else if (class199.field3468[var2]) {
                    if (class247.field4247) {
                        class269.method1876(class120.field2037[var2], class275.field4762[var2], class32.field711[var2], class313.field5281[var2], 16711680, 128);
                    } else {
                        class213.method1479(class120.field2037[var2], class275.field4762[var2], class32.field711[var2], class313.field5281[var2], 16711680, 128);
                    }
                }
            }
        }
        class229.method1567(class163.field2796.field418, class133.field2315, class50.field992, true, class163.field2796.field478);
        class50.field992 = 0;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZI)V", line = 388)
    public static final void method1057(boolean arg0, int arg1) {
        field2729++;
        byte[][] var2;
        if (class247.field4247 && arg0) {
            var2 = class52.field1025;
        } else {
            var2 = class38.field810;
        }
        int var3 = -128 % ((-arg1 - 44) / 35);
        int var4 = class8.field183.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var6 = var2[var5];
            if (var6 != null) {
                int var7 = (class226.field3949[var5] & 0xFF) * 64 - class4.field72;
                int var8 = (class226.field3949[var5] >> 8) * 64 - class221.field3889;
                class218.method1503(false);
                class301.method2050(var6, 2, arg0, class180.field3158, var7, var8);
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "(B)I", line = 429)
    public final int method1058(byte arg0) {
        field2717++;
        int var2 = 0;
        if (arg0 >= -68) {
            this.field2723 = (class220) null;
        }
        for (class220 var3 = this.field2723.field3881; var3 != this.field2723; var3 = var3.field3881) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "(B)V", line = 450)
    public static final void method1059(byte arg0) {
        class201.field3559.method1832((byte) 54);
        field2725++;
        int var1 = -31 % ((arg0 + 20) / 47);
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "()V", line = 470)
    public class159() {
        this.field2723.field3881 = this.field2723;
        this.field2723.field3880 = this.field2723;
    }
}
