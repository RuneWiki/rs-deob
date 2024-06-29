import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class159 extends class291 {

    @OriginalMember(owner = "client!e", name = "Ib", descriptor = "Lwm;")
    private static class152 field2520 = class157.method1048("May", 103);

    @OriginalMember(owner = "client!e", name = "Qb", descriptor = "Lwm;")
    private static class152 field2528 = class157.method1048("Jan", 95);

    @OriginalMember(owner = "client!e", name = "Mb", descriptor = "Lwm;")
    private static class152 field2524 = class157.method1048("Sep", 123);

    @OriginalMember(owner = "client!e", name = "Sb", descriptor = "Lwm;")
    private static class152 field2530 = class157.method1048("Feb", 125);

    @OriginalMember(owner = "client!e", name = "Rb", descriptor = "Lwm;")
    private static class152 field2529 = class157.method1048("Jul", 113);

    @OriginalMember(owner = "client!e", name = "Kb", descriptor = "Lwm;")
    private static class152 field2522 = class157.method1048("Apr", 110);

    @OriginalMember(owner = "client!e", name = "Tb", descriptor = "Lwm;")
    private static class152 field2531 = class157.method1048("Aug", 95);

    @OriginalMember(owner = "client!e", name = "fc", descriptor = "Lwm;")
    private static class152 field2543 = class157.method1048("Mar", 93);

    @OriginalMember(owner = "client!e", name = "Nb", descriptor = "Lwm;")
    private static class152 field2525 = class157.method1048("Nov", 106);

    @OriginalMember(owner = "client!e", name = "cc", descriptor = "Lwm;")
    private static class152 field2540 = class157.method1048("Dec", 96);

    @OriginalMember(owner = "client!e", name = "Wb", descriptor = "S")
    public static short field2534 = 1;

    @OriginalMember(owner = "client!e", name = "gc", descriptor = "Lwm;")
    private static class152 field2544 = class157.method1048("Oct", 117);

    @OriginalMember(owner = "client!e", name = "Xb", descriptor = "Lwm;")
    private static class152 field2535 = class157.method1048("Jun", 119);

    @OriginalMember(owner = "client!e", name = "Eb", descriptor = "[Lwm;")
    public static class152[] field2516 = new class152[] { field2528, field2530, field2543, field2522, field2520, field2535, field2529, field2531, field2524, field2544, field2525, field2540 };

    @OriginalMember(owner = "client!e", name = "Fb", descriptor = "I")
    private int field2517;

    @OriginalMember(owner = "client!e", name = "Gb", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!e", name = "Hb", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!e", name = "Jb", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!e", name = "Lb", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!e", name = "Ob", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!e", name = "Pb", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!e", name = "Ub", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!e", name = "Vb", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!e", name = "Yb", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!e", name = "ac", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!e", name = "bc", descriptor = "I")
    public static int field2539;

    @OriginalMember(owner = "client!e", name = "dc", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!e", name = "ec", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!e", name = "hc", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!e", name = "Zb", descriptor = "Lgl;")
    private class191 field2537;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(Z)V", line = 3)
    public static final void method1062(boolean arg0) {
        if (arg0) {
            class287.field4857 = class194.field3102;
            class65.field984 = class231.field3779;
            class65.field983 = class137.field2103;
        } else {
            class287.field4857 = class202.field3271;
            class65.field984 = class123.field1728;
            class65.field983 = class27.field472;
        }
        class17.field248 = class287.field4857.length;
    }

    @OriginalMember(owner = "client!e", name = "l", descriptor = "(B)V", line = 26)
    public static void method1063(byte arg0) {
        field2529 = null;
        field2543 = null;
        field2535 = null;
        field2528 = null;
        field2530 = null;
        field2540 = null;
        field2531 = null;
        field2516 = null;
        field2522 = null;
        field2520 = null;
        int var1 = 76 / ((arg0 + 77) / 42);
        field2525 = null;
        field2544 = null;
        field2524 = null;
    }

    @OriginalMember(owner = "client!e", name = "s", descriptor = "(I)V", line = 52)
    public final void method1064(int arg0) {
        field2523++;
        this.field4946 = (this.field2517 + 7) / 8;
        if (arg0 != 4) {
            field2543 = (class152) null;
        }
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(I)V", line = 65)
    public class159(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!e", name = "k", descriptor = "(II)V", line = 77)
    public final void method1065(int arg0, int arg1) {
        this.field4950[this.field4946++] = (byte) (this.field2537.method1268(3534) + arg0);
        int var3 = -112 % ((arg1 - 85) / 38);
        field2533++;
    }

    @OriginalMember(owner = "client!e", name = "e", descriptor = "(Z)V", line = 87)
    public static final void method1066(boolean arg0) {
        field2538++;
        class270.field4603.method1613(-22696);
        if (arg0) {
            field2522 = (class152) null;
        }
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(IB)I", line = 99)
    public final int method1067(int arg0, byte arg1) {
        field2545++;
        if (arg1 < 70) {
            this.method1068(-27);
        }
        return arg0 * 8 - this.field2517;
    }

    @OriginalMember(owner = "client!e", name = "t", descriptor = "(I)V", line = 113)
    public final void method1068(int arg0) {
        field2518++;
        this.field2517 = this.field4946 * arg0;
    }

    @OriginalMember(owner = "client!e", name = "u", descriptor = "(I)V", line = 127)
    public static final void method1069(int arg0) {
        int var1 = class312.method2173((byte) 115);
        field2532++;
        if (arg0 != 16560) {
            field2522 = (class152) null;
        }
        if (var1 == 0) {
            class122.field1720 = (byte[][][]) null;
            class146.method916((byte) -102, 0);
        } else if (var1 == 1) {
            class117.method771(115, (byte) 0);
            class146.method916((byte) -116, 512);
            class235.method1616((byte) -13);
        } else {
            class117.method771(arg0 ^ 0x40EE, (byte) (class252.field4338 - 4 & 0xFF));
            class146.method916((byte) -68, 2);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BIIII)V", line = 160)
    public static final void method1070(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class217.field3516) {
            class13.method76(arg2, arg1, arg2 + arg3, arg1 + arg4);
            class13.method78(arg2, arg1, arg3, arg4, 0);
        } else {
            class96.method634(arg2, arg1, arg2 + arg3, arg1 - -arg4);
            class96.method635(arg2, arg1, arg3, arg4, 0);
        }
        field2542++;
        if (class37.field616 < 100) {
            return;
        }
        if (class206.field3369 == null || class206.field3369.field3281 != arg3 || class206.field3369.field3284 != arg4) {
            class109 var5 = new class109(arg3, arg4);
            class96.method638(var5.field1552, arg3, arg4);
            class163.method1089(1, class239.field3921, 0, 0, arg3, 0, arg4, 0, class26.field446);
            if (class217.field3516) {
                class206.field3369 = new class68(var5);
            } else {
                class206.field3369 = var5;
            }
            if (class217.field3516) {
                class96.field1376 = null;
            } else {
                class311.field5322.method883(true);
            }
        }
        class206.field3369.method435(arg2, arg1);
        int var6 = class173.field2775 * arg3 / class239.field3921 + arg2;
        int var7 = class313.field5435 * arg4 / class26.field446 + arg1;
        if (arg0 != -8) {
            return;
        }
        int var8 = 16711680;
        if (class256.field4410 == 1) {
            var8 = 16777215;
        }
        int var9 = class82.field1149 * arg4 / class26.field446;
        int var10 = class148.field2292 * arg3 / class239.field3921;
        if (class217.field3516) {
            class13.method74(var6, var7, var10, var9, var8, 128);
            class13.method68(var6, var7, var10, var9, var8);
        } else {
            class96.method644(var6, var7, var10, var9, var8, 128);
            class96.method648(var6, var7, var10, var9, var8);
        }
        if (class302.field5206 <= 0) {
            return;
        }
        int var11;
        if (class41.field665 <= 10) {
            var11 = class41.field665 * 25;
        } else {
            var11 = (20 - class41.field665) * 25;
        }
        for (class89 var12 = (class89) class260.field4446.method1221((byte) 45); var12 != null; var12 = (class89) class260.field4446.method1223(arg0 + 97)) {
            if (class197.field3154 == var12.field1247) {
                int var13 = arg2 + (var12.field1245 * arg3 / class239.field3921);
                int var14 = var12.field1249 * arg4 / class26.field446 + arg1;
                if (class217.field3516) {
                    class13.method74(var13 - 2, var14 + -2, 4, 4, 16776960, var11);
                } else {
                    class96.method644(var13 - 2, var14 - 2, 4, 4, 16776960, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "l", descriptor = "(II)V", line = 259)
    public static final void method1071(int arg0, int arg1) {
        field2536++;
        if (arg0 == -1 || !class197.method1315(71, arg0)) {
            return;
        }
        class127[] var2 = class215.field3501[arg0];
        if (arg1 != 1416) {
            return;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class127 var4 = var2[var3];
            if (var4.field1904 != null) {
                class320 var5 = new class320();
                var5.field5569 = var4;
                var5.field5581 = var4.field1904;
                class195.method1304(var5, 2000000, (byte) 95);
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Z[I)V", line = 298)
    public final void method1072(boolean arg0, int[] arg1) {
        if (arg0) {
            field2535 = (class152) null;
        }
        field2519++;
        this.field2537 = new class191(arg1);
    }

    @OriginalMember(owner = "client!e", name = "v", descriptor = "(I)I", line = 313)
    public static final int method1073(int arg0) {
        if (arg0 != 2) {
            method1071(-58, -49);
        }
        field2526++;
        return class306.field5255 && class216.field3515[81] && class160.field2556 > 2 ? class83.field1156[class160.field2556 - 2] : class83.field1156[class160.field2556 - 1];
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(III[B)V", line = 339)
    public final void method1074(int arg0, int arg1, int arg2, byte[] arg3) {
        field2539++;
        if (arg2 == -27992) {
            for (int var5 = 0; var5 < arg1; var5++) {
                arg3[arg0 + var5] = (byte) (this.field4950[this.field4946++] - this.field2537.method1268(3534));
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(ZI)I", line = 357)
    public final int method1075(boolean arg0, int arg1) {
        if (arg0) {
            return 96;
        }
        int var3 = this.field2517 >> 3;
        int var4 = 8 - (this.field2517 & 0x7);
        this.field2517 += arg1;
        int var5 = 0;
        field2527++;
        while (var4 < arg1) {
            var5 += (class11.field139[var4] & this.field4950[var3++]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg1 == var4) {
            var6 = (this.field4950[var3] & class11.field139[var4]) + var5;
        } else {
            var6 = (this.field4950[var3] >> var4 - arg1 & class11.field139[arg1]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!e", name = "m", descriptor = "(B)I", line = 413)
    public final int method1076(byte arg0) {
        int var2 = 89 % ((arg0 - 53) / 58);
        field2541++;
        return this.field4950[this.field4946++] - this.field2537.method1268(3534) & 0xFF;
    }
}
