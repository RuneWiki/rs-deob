import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class255 extends class53 {

    @OriginalMember(owner = "client!r", name = "O", descriptor = "I")
    private int field4269 = 4096;

    @OriginalMember(owner = "client!r", name = "bb", descriptor = "I")
    private int field4282 = 0;

    @OriginalMember(owner = "client!r", name = "M", descriptor = "Lwa;")
    private static class75 field4267 = class66.method560("glow1:", false);

    @OriginalMember(owner = "client!r", name = "N", descriptor = "Lwa;")
    public static class75 field4268 = field4267;

    @OriginalMember(owner = "client!r", name = "R", descriptor = "Lwa;")
    public static class75 field4272 = class66.method560("m-Ochte mit Ihnen handeln)3", false);

    @OriginalMember(owner = "client!r", name = "Q", descriptor = "Lwa;")
    public static class75 field4271 = field4267;

    @OriginalMember(owner = "client!r", name = "T", descriptor = "[J")
    public static long[] field4274 = new long[100];

    @OriginalMember(owner = "client!r", name = "V", descriptor = "Lql;")
    public static class16 field4276 = new class16(5000);

    @OriginalMember(owner = "client!r", name = "P", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!r", name = "S", descriptor = "I")
    public static int field4273;

    @OriginalMember(owner = "client!r", name = "U", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!r", name = "W", descriptor = "I")
    public static int field4277;

    @OriginalMember(owner = "client!r", name = "X", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!r", name = "Y", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!r", name = "Z", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!r", name = "ab", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "(I)V", line = 10)
    public static final void method1819(int arg0) {
        field4281++;
        if (class120.method914((byte) -126) != 2 || arg0 != -1) {
            return;
        }
        byte var1 = (byte) (class190.field3167 - 4 & 0xFF);
        int var2 = class190.field3167 % 104;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                class198.field3324[var3][var2][var4] = var1;
            }
        }
        if (class67.field1174 == 3) {
            return;
        }
        for (int var5 = 0; var5 < 2; var5++) {
            class198.field3316[var5] = -1000000;
            class176.field2957[var5] = 1000000;
            class145.field2500[var5] = 0;
            class5.field59[var5] = 1000000;
            class223.field3783[var5] = 0;
        }
        if (class163.field2777 != 1) {
            int var6 = class32.method217(class245.field4120, class9.field121, true, class67.field1174);
            if ((var6 - class228.field3825) < 800 && (class204.field3459[class67.field1174][class245.field4120 >> 7][class9.field121 >> 7] & 0x4) != 0) {
                class9.method47(class9.field121 >> 7, 1, class245.field4120 >> 7, class271.field4681, false, -74);
            }
            return;
        }
        if ((class204.field3459[class67.field1174][class279.field4831.field3259 >> 7][class279.field4831.field3218 >> 7] & 0x4) != 0) {
            class9.method47(class279.field4831.field3218 >> 7, 0, class279.field4831.field3259 >> 7, class271.field4681, false, -109);
        }
        if (class232.field3931 >= 310) {
            return;
        }
        int var7 = class245.field4120 >> 7;
        int var8 = class279.field4831.field3259 >> 7;
        int var9 = class279.field4831.field3218 >> 7;
        int var10 = class9.field121 >> 7;
        int var11;
        if (var8 > var7) {
            var11 = var8 - var7;
        } else {
            var11 = var7 - var8;
        }
        int var12;
        if (var10 < var9) {
            var12 = var9 - var10;
        } else {
            var12 = var10 - var9;
        }
        if (var11 <= var12) {
            int var15 = 32768;
            int var16 = var11 * 65536 / var12;
            while (var9 != var10) {
                if (var10 < var9) {
                    var10++;
                } else if (var9 < var10) {
                    var10--;
                }
                if ((class204.field3459[class67.field1174][var7][var10] & 0x4) != 0) {
                    class9.method47(var10, 1, var7, class271.field4681, false, 68);
                    break;
                }
                var15 += var16;
                if (var15 >= 65536) {
                    if (var8 > var7) {
                        var7++;
                    } else if (var7 > var8) {
                        var7--;
                    }
                    var15 -= 65536;
                    if ((class204.field3459[class67.field1174][var7][var10] & 0x4) != 0) {
                        class9.method47(var10, 1, var7, class271.field4681, false, -61);
                        break;
                    }
                }
            }
            return;
        }
        int var13 = var12 * 65536 / var11;
        int var14 = 32768;
        while (var7 != var8) {
            if (var7 < var8) {
                var7++;
            } else if (var8 < var7) {
                var7--;
            }
            if ((class204.field3459[class67.field1174][var7][var10] & 0x4) != 0) {
                class9.method47(var10, 1, var7, class271.field4681, false, 124);
                break;
            }
            var14 += var13;
            if (var14 >= 65536) {
                if (var10 < var9) {
                    var10++;
                } else if (var10 > var9) {
                    var10--;
                }
                var14 -= 65536;
                if ((class204.field3459[class67.field1174][var7][var10] & 0x4) != 0) {
                    class9.method47(var10, 1, var7, class271.field4681, false, -77);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILja;Z)V", line = 202)
    public final void method54(int arg0, class60 arg1, boolean arg2) {
        field4277++;
        if (!arg2) {
            field4267 = (class75) null;
        }
        if (arg0 == 0) {
            this.field4282 = arg1.method485((byte) -2);
        } else if (arg0 == 1) {
            this.field4269 = arg1.method485((byte) -2);
        }
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V", line = 251)
    public class255() {
        super(1, true);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIBIII)V", line = 270)
    public static final void method1820(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        class150.method1151(7, class63.field1096[arg1], arg5 - arg4, arg0, arg4 + arg5);
        field4278++;
        int var6 = 0;
        int var7 = arg3;
        int var8 = arg3 * arg3;
        int var9 = var8 << 1;
        int var10 = arg4 * arg4;
        int var11 = var10 << 1;
        int var12 = var10 << 2;
        int var13 = ((arg3 << 1) - 3) * var11;
        int var14 = arg3 << 1;
        int var15 = ((var6 << 1) + 3) * var9;
        int var16 = (arg3 - 1) * var12;
        int var17 = (1 - var14) * var10 + var9;
        int var18 = var8 << 2;
        int var19 = (var6 + 1) * var18;
        int var20 = var8 - ((var14 - 1) * var11);
        while (var7 > 0) {
            var7--;
            int var21 = arg1 - var7;
            if (var17 < 0) {
                while (var17 < 0) {
                    var6++;
                    var17 += var15;
                    var20 += var19;
                    var19 += var18;
                    var15 += var18;
                }
            }
            if (var20 < 0) {
                var20 += var19;
                var17 += var15;
                var6++;
                var19 += var18;
                var15 += var18;
            }
            var17 += -var16;
            var20 += -var13;
            int var22 = arg1 + var7;
            var13 -= var12;
            var16 -= var12;
            int var23 = arg5 + var6;
            int var24 = arg5 - var6;
            class150.method1151(7, class63.field1096[var21], var24, arg0, var23);
            class150.method1151(7, class63.field1096[var22], var24, arg0, var23);
        }
        if (arg2 != 47) {
            method1823(-15, 0, -22);
        }
    }

    @OriginalMember(owner = "client!r", name = "h", descriptor = "(I)V", line = 357)
    public static void method1821(int arg0) {
        field4271 = null;
        field4268 = null;
        field4272 = null;
        field4274 = null;
        if (arg0 == -2) {
            field4276 = null;
            field4267 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(II)[I", line = 378)
    public final int[] method59(int arg0, int arg1) {
        field4275++;
        if (arg0 != -15196) {
            this.method59(-46, -19);
        }
        int[] var3 = this.field878.method1603(arg1, (byte) 107);
        if (this.field878.field3749) {
            int[] var4 = this.method391(0, 0, arg1);
            for (int var5 = 0; var5 < class269.field4644; var5++) {
                int var6 = var4[var5];
                var3[var5] = this.field4282 <= var6 && var6 <= this.field4269 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ZLre;III)V", line = 411)
    public static final void method1822(boolean arg0, class262 arg1, int arg2, int arg3, int arg4) {
        field4280++;
        int var5 = arg1.field4517;
        if (arg1.field4465 == 0) {
            arg1.field4517 = arg1.field4408;
        } else if (arg1.field4465 == 1) {
            arg1.field4517 = arg3 - arg1.field4408;
        } else if (arg1.field4465 == 2) {
            arg1.field4517 = arg1.field4408 * arg3 >> 14;
        } else if (arg1.field4465 == 3) {
            if (arg1.field4441 == 2) {
                arg1.field4517 = arg1.field4408 * 32 + ((arg1.field4408 - 1) * arg1.field4387);
            } else if (arg1.field4441 == 7) {
                arg1.field4517 = arg1.field4408 * 12 + ((arg1.field4408 - 1) * arg1.field4387);
            }
        }
        if (arg2 >= -41) {
            return;
        }
        int var6 = arg1.field4531;
        if (arg1.field4412 == 0) {
            arg1.field4531 = arg1.field4429;
        } else if (arg1.field4412 == 1) {
            arg1.field4531 = arg4 - arg1.field4429;
        } else if (arg1.field4412 == 2) {
            arg1.field4531 = arg1.field4429 * arg4 >> 14;
        } else if (arg1.field4412 == 3) {
            if (arg1.field4441 == 2) {
                arg1.field4531 = arg1.field4429 * 32 + ((arg1.field4429 - 1) * arg1.field4490);
            } else if (arg1.field4441 == 7) {
                arg1.field4531 = (arg1.field4429 - 1) * arg1.field4490 + arg1.field4429 * 115;
            }
        }
        if (arg1.field4412 == 4) {
            arg1.field4531 = arg1.field4517 * arg1.field4451 / arg1.field4428;
        }
        if (arg1.field4465 == 4) {
            arg1.field4517 = arg1.field4531 * arg1.field4428 / arg1.field4451;
        }
        if (class214.field3662 && (client.method1734(arg1) != 0 || arg1.field4441 == 0)) {
            if (arg1.field4517 < 5 && arg1.field4531 < 5) {
                arg1.field4531 = 5;
                arg1.field4517 = 5;
            } else {
                if (arg1.field4517 <= 0) {
                    arg1.field4517 = 5;
                }
                if (arg1.field4531 <= 0) {
                    arg1.field4531 = 5;
                }
            }
        }
        if (arg1.field4462 == 1337) {
            class176.field2960 = arg1;
        }
        if (arg0 && arg1.field4506 != null && (arg1.field4531 != var6 || arg1.field4517 != var5)) {
            class24 var7 = new class24();
            var7.field301 = arg1;
            var7.field302 = arg1.field4506;
            class237.field3992.method1251(var7, -121);
        }
    }

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(III)V", line = 518)
    public static final void method1823(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class28.field366; var3++) {
            for (int var4 = 0; var4 < class150.field2573; var4++) {
                for (int var5 = 0; var5 < class262.field4440; var5++) {
                    class242 var6 = class271.field4681[var3][var4][var5];
                    if (var6 != null) {
                        class167 var7 = var6.field4098;
                        if (var7 != null && var7.field2815.method420()) {
                            class162.method1211(var7.field2815, var3, var4, var5, 1, 1);
                            if (var7.field2809 != null && var7.field2809.method420()) {
                                class162.method1211(var7.field2809, var3, var4, var5, 1, 1);
                                var7.field2815.method447(var7.field2809, 0, 0, 0, false);
                                var7.field2809 = var7.field2809.method433(arg0, arg1, arg2);
                            }
                            var7.field2815 = var7.field2815.method433(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field4086; var8++) {
                            class285 var9 = var6.field4083[var8];
                            if (var9 != null && var9.field4898.method420()) {
                                class162.method1211(var9.field4898, var3, var4, var5, var9.field4911 + 1 - var9.field4907, var9.field4896 - var9.field4895 + 1);
                                var9.field4898 = var9.field4898.method433(arg0, arg1, arg2);
                            }
                        }
                        class217 var10 = var6.field4092;
                        if (var10 != null && var10.field3707.method420()) {
                            class147.method1131(var10.field3707, var3, var4, var5);
                            var10.field3707 = var10.field3707.method433(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }
}
