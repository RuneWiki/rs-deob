import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public abstract class class252 extends class183 {

    @OriginalMember(owner = "client!a", name = "u", descriptor = "I")
    public static int field3614 = 0;

    @OriginalMember(owner = "client!a", name = "w", descriptor = "I")
    public static int field3616 = 0;

    @OriginalMember(owner = "client!a", name = "y", descriptor = "I")
    public static int field3618 = 0;

    @OriginalMember(owner = "client!a", name = "z", descriptor = "Ljava/lang/String;")
    public static String field3619 = "K";

    @OriginalMember(owner = "client!a", name = "m", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!a", name = "q", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!a", name = "s", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!a", name = "t", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!a", name = "v", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!a", name = "x", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!a", name = "A", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!a", name = "B", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!a", name = "C", descriptor = "Lmh;")
    public static class20 field3622;

    @OriginalMember(owner = "client!a", name = "r", descriptor = "Ljava/lang/String;")
    public static String field3611;

    @OriginalMember(owner = "client!a", name = "p", descriptor = "Z")
    public boolean field3609;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(I)Z", line = 8)
    public final boolean method1712(int arg0) {
        if (arg0 == -1) {
            field3608++;
            return this.field3609;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BZLkm;Lkm;)V", line = 21)
    public static final void method1713(byte arg0, boolean arg1, class133 arg2, class133 arg3) {
        field3617++;
        class266.field3868 = arg3;
        class271.field4048 = arg1;
        if (arg0 != 114) {
            field3622 = (class20) null;
        }
        class45.field556 = arg2;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V", line = 37)
    public static void method1715(boolean arg0) {
        if (!arg0) {
            field3619 = null;
            field3611 = null;
            field3622 = null;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIZZIIIILcg;IZI)V", line = 51)
    public static final void method1716(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, class316 arg8, int arg9, boolean arg10, int arg11) {
        if (arg4 >= 0 && arg4 < 104 && arg7 >= 0 && arg7 < 104) {
            if (!arg10 && !arg2) {
                class240.field3406[arg11][arg4][arg7] = 0;
            }
            while (true) {
                int var12 = arg8.method2219(16448);
                if (var12 == 0) {
                    if (arg10) {
                        class333.field5020[0][arg1 + arg4][arg7 + arg9] = class269.field3994[0][arg1 + arg4][arg7 + arg9];
                    } else if (arg11 == 0) {
                        class333.field5020[0][arg4 + arg1][arg7 + arg9] = -class278.method1927(arg5 + 932731, arg6 + 556238, 98) * 8;
                    } else {
                        class333.field5020[arg11][arg4 + arg1][arg7 + arg9] = class333.field5020[arg11 - 1][arg1 + arg4][arg7 + arg9] - 240;
                    }
                    break;
                }
                if (var12 == 1) {
                    int var13 = arg8.method2219(16448);
                    if (arg10) {
                        class333.field5020[0][arg1 + arg4][arg7 + arg9] = var13 * 8 + class269.field3994[0][arg1 + arg4][arg7 + arg9];
                    } else {
                        if (var13 == 1) {
                            var13 = 0;
                        }
                        if (arg11 == 0) {
                            class333.field5020[0][arg4 + arg1][arg7 + arg9] = -var13 * 8;
                        } else {
                            class333.field5020[arg11][arg4 + arg1][arg7 + arg9] = class333.field5020[arg11 - 1][arg1 + arg4][arg7 + arg9] - (var13 * 8);
                        }
                    }
                    break;
                }
                if (var12 > 49) {
                    if (var12 <= 81) {
                        if (!arg10 && !arg2) {
                            class240.field3406[arg11][arg4][arg7] = (byte) (var12 - 49);
                        }
                    } else if (!arg2) {
                        class247.field3565[arg11][arg4][arg7] = (byte) (var12 - 81);
                    }
                } else if (arg2) {
                    arg8.method2219(16448);
                } else {
                    class221.field3164[arg11][arg4][arg7] = arg8.method2192(3);
                    class232.field3277[arg11][arg4][arg7] = (byte) ((var12 - 2) / 4);
                    class108.field1463[arg11][arg4][arg7] = (byte) class47.method303(var12 + arg0 - 2, 3);
                }
            }
        } else {
            while (true) {
                int var14 = arg8.method2219(16448);
                if (var14 == 0) {
                    break;
                }
                if (var14 == 1) {
                    arg8.method2219(16448);
                    break;
                }
                if (var14 <= 49) {
                    arg8.method2219(16448);
                }
            }
        }
        if (arg3) {
            field3606++;
        }
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(I)I", line = 166)
    public final int method1717(int arg0) {
        field3607++;
        if (arg0 > -42) {
            field3619 = (String) null;
        }
        return 1;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "()I", line = 179)
    public int method1718() {
        field3621++;
        return 0;
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(I)Z", line = 188)
    public final boolean method1719(int arg0) {
        field3612++;
        if (arg0 != 0) {
            field3619 = (String) null;
        }
        return false;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIIIBII)V", line = 205)
    public static final void method1720(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9) {
        field3615++;
        class238 var10 = (class238) class53.field706.method1335(1);
        if (arg7 < 5) {
            method1716(83, 73, true, false, 73, 81, 108, -114, (class316) null, 43, true, 2);
        }
        class238 var11 = null;
        while (var10 != null) {
            if (var10.field3379 == arg8 && var10.field3384 == arg3 && var10.field3370 == arg1 && var10.field3372 == arg0) {
                var11 = var10;
                break;
            }
            var10 = (class238) class53.field706.method1336(3);
        }
        if (var11 == null) {
            var11 = new class238();
            var11.field3372 = arg0;
            var11.field3379 = arg8;
            var11.field3370 = arg1;
            var11.field3384 = arg3;
            class63.method421(25127, var11);
            class53.field706.method1339((byte) 7, var11);
        }
        var11.field3375 = arg6;
        var11.field3380 = arg5;
        var11.field3373 = arg9;
        var11.field3377 = arg4;
        var11.field3376 = arg2;
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(B)Z", line = 257)
    public final boolean method1723(byte arg0) {
        if (arg0 >= -94) {
            return false;
        } else {
            field3610++;
            return false;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lkm;I)I", line = 268)
    public static final int method1724(class133 arg0, int arg1) {
        field3613++;
        int var2 = 0;
        if (arg0.method961(class45.field550, (byte) -128)) {
            var2++;
        }
        if (arg0.method961(class68.field940, (byte) -128)) {
            var2++;
        }
        if (arg0.method961(class240.field3404, (byte) -128)) {
            var2++;
        }
        if (arg0.method961(class79.field1138, (byte) -128)) {
            var2++;
        }
        if (arg0.method961(class343.field5150, (byte) -128)) {
            var2++;
        }
        if (arg0.method961(class272.field4080, (byte) -128)) {
            var2++;
        }
        if (arg0.method961(class161.field2216, (byte) -128)) {
            var2++;
        }
        if (arg0.method961(class314.field4739, (byte) -128)) {
            var2++;
        }
        if (arg0.method961(class17.field241, (byte) -128)) {
            var2++;
        }
        if (arg0.method961(class115.field1558, (byte) -128)) {
            var2++;
        }
        if (arg0.method961(class157.field2169, (byte) -128)) {
            var2++;
        }
        if (arg1 > -76) {
            method1716(-7, 15, false, true, -96, 46, 7, 107, (class316) null, -1, true, 17);
        }
        if (arg0.method961(class266.field3872, (byte) -128)) {
            var2++;
        }
        if (arg0.method961(class232.field3281, (byte) -128)) {
            var2++;
        }
        if (arg0.method961(class70.field949, (byte) -128)) {
            var2++;
        }
        if (arg0.method961(class188.field2597, (byte) -128)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(I)V", line = 333)
    public static final void method1726(int arg0) {
        class327.field4938.method717((byte) 99);
        field3620++;
        int var1 = 75 / ((arg0 + 12) / 56);
        class289.field4294.method717((byte) 84);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
    public abstract void method1710(int arg0);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "()Z")
    public abstract boolean method1711();

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIII)V")
    public abstract void method1714(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)V")
    public abstract void method1721(int arg0, int arg1);

    @OriginalMember(owner = "client!a", name = "c", descriptor = "()Z")
    public abstract boolean method1722();

    @OriginalMember(owner = "client!a", name = "d", descriptor = "()V")
    public abstract void method1725();
}
