import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class204 {

    @OriginalMember(owner = "client!wf", name = "A", descriptor = "I")
    private int field4028 = 0;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "[Lmb;")
    private class110[] field4004;

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "I")
    private int field4018;

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "Leh;")
    public static class47 field4011 = class195.method1282((byte) -4, "Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "Leh;")
    public static class47 field4012 = class195.method1282((byte) -4, "(U3");

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "Leh;")
    public static class47 field4016 = class195.method1282((byte) -4, "Ein kostenloses Spielkonto erstellen)3");

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "Lpa;")
    public static class136 field4014 = new class136(100);

    @OriginalMember(owner = "client!wf", name = "x", descriptor = "Leh;")
    public static class47 field4025 = class195.method1282((byte) -4, "<)4col>");

    @OriginalMember(owner = "client!wf", name = "B", descriptor = "Z")
    public static boolean field4029 = false;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
    public static int field4005;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!wf", name = "v", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!wf", name = "w", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!wf", name = "y", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!wf", name = "z", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "J")
    private long field4010;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "Lmb;")
    private class110 field4008;

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "Lmb;")
    private class110 field4022;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "Lhd;")
    public static class68 field4006;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "Lhg;")
    public static class71 field4013;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V")
    public static void method1334(byte arg0) {
        field4013 = null;
        field4016 = null;
        field4012 = null;
        field4006 = null;
        if (arg0 != -8) {
            field4006 = null;
        }
        field4014 = null;
        field4025 = null;
        field4011 = null;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(B)V")
    public static final void method1335(byte arg0) {
        if (!class80.field1726) {
            class166.field3224[0] = class123.field2487;
            class80.field1731[0] = class181.field3472;
            class25.field478[0] = 1003;
            class95.field1971 = 1;
        }
        field4021++;
        if (arg0 != -31) {
            field4006 = null;
        }
        if (class202.field3924 != -1) {
            class108.method871(class202.field3924, (byte) -47);
        }
        for (int var1 = 0; var1 < class3.field39; var1++) {
            if (class158.field3077[var1]) {
                class137.field2679[var1] = true;
            }
            class159.field3094[var1] = class158.field3077[var1];
            class158.field3077[var1] = false;
        }
        class190.field3683 = class18.field362;
        class195.field3797 = -1;
        class95.field1972 = -1;
        class19.field375 = null;
        if (class202.field3924 != -1) {
            class3.field39 = 0;
            class180.method1197(503, class202.field3924, -1, 0, true, 0, 0, 0, 765);
        }
        class169.method1148();
        class67.method558(false);
        if (class80.field1726) {
            class69.method618(6238);
        } else if (class195.field3797 != -1) {
            class67.method559(class95.field1972, true, class195.field3797);
        }
        if (class135.field2651 == 3) {
            for (int var2 = 0; var2 < class3.field39; var2++) {
                if (class159.field3094[var2]) {
                    class169.method1142(client.field550[var2], class75.field1629[var2], class90.field1899[var2], class191.field3713[var2], 16711935, 128);
                } else if (class137.field2679[var2]) {
                    class169.method1142(client.field550[var2], class75.field1629[var2], class90.field1899[var2], class191.field3713[var2], 16711680, 128);
                }
            }
        }
        class160.method1099(114, class123.field2489.field3291, class196.field3827, class123.field2489.field3281, class190.field3677);
        class190.field3677 = 0;
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(B)I")
    public final int method1336(byte arg0) {
        int var2 = 0;
        field4027++;
        for (int var3 = 0; var3 < this.field4018; var3++) {
            class110 var4 = this.field4004[var3];
            for (class110 var5 = var4.field2280; var5 != var4; var5 = var5.field2280) {
                var2++;
            }
        }
        if (arg0 != -84) {
            method1334((byte) -118);
        }
        return var2;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIIZIIIIIBI)Z")
    public static final boolean method1337(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, byte arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var36 = 0; var36 < 104; var36++) {
                class189.field3662[var12][var36] = 0;
                class126.field2535[var12][var36] = 99999999;
            }
        }
        int var13 = arg1;
        field4005++;
        int var14 = arg6;
        class189.field3662[arg1][arg6] = 99;
        class126.field2535[arg1][arg6] = 0;
        byte var15 = 0;
        class121.field2437[var15] = arg1;
        int var37 = var15 + 1;
        class115.field2347[var15] = arg6;
        boolean var16 = false;
        int var17 = 0;
        int var18 = class121.field2437.length;
        int[][] var19 = class54.field1043[class196.field3827].field741;
        while (var37 != var17) {
            var14 = class115.field2347[var17];
            var13 = class121.field2437[var17];
            var17 = (var17 + 1) % var18;
            if (arg5 == var13 && arg9 == var14) {
                var16 = true;
                break;
            }
            if (arg0 != 0) {
                if ((arg0 < 5 || arg0 == 10) && class54.field1043[class196.field3827].method315(var14, arg5, arg0 - 1, 65, arg9, arg11, var13)) {
                    var16 = true;
                    break;
                }
                if (arg0 < 10 && class54.field1043[class196.field3827].method324(arg11, arg0 - 1, var14, var13, arg9, arg5, (byte) -83)) {
                    var16 = true;
                    break;
                }
            }
            if (arg2 != 0 && arg3 != 0 && class54.field1043[class196.field3827].method311(arg9, false, arg3, var14, arg5, var13, arg2, arg7)) {
                var16 = true;
                break;
            }
            int var35 = class126.field2535[var13][var14] + 1;
            if (var13 > 0 && class189.field3662[var13 - 1][var14] == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0) {
                class121.field2437[var37] = var13 - 1;
                class115.field2347[var37] = var14;
                class189.field3662[var13 - 1][var14] = 2;
                var37 = (var37 + 1) % var18;
                class126.field2535[var13 - 1][var14] = var35;
            }
            if (var13 < 103 && class189.field3662[var13 + 1][var14] == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0) {
                class121.field2437[var37] = var13 + 1;
                class115.field2347[var37] = var14;
                var37 = (var37 + 1) % var18;
                class189.field3662[var13 + 1][var14] = 8;
                class126.field2535[var13 + 1][var14] = var35;
            }
            if (var14 > 0 && class189.field3662[var13][var14 - 1] == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                class121.field2437[var37] = var13;
                class115.field2347[var37] = var14 - 1;
                class189.field3662[var13][var14 - 1] = 1;
                var37 = (var37 + 1) % var18;
                class126.field2535[var13][var14 - 1] = var35;
            }
            if (var14 < 103 && class189.field3662[var13][var14 + 1] == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                class121.field2437[var37] = var13;
                class115.field2347[var37] = var14 + 1;
                var37 = (var37 + 1) % var18;
                class189.field3662[var13][var14 + 1] = 4;
                class126.field2535[var13][var14 + 1] = var35;
            }
            if (var13 > 0 && var14 > 0 && class189.field3662[var13 - 1][var14 - 1] == 0 && (var19[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                class121.field2437[var37] = var13 - 1;
                class115.field2347[var37] = var14 - 1;
                var37 = (var37 + 1) % var18;
                class189.field3662[var13 - 1][var14 - 1] = 3;
                class126.field2535[var13 - 1][var14 - 1] = var35;
            }
            if (var13 < 103 && var14 > 0 && class189.field3662[var13 + 1][var14 - 1] == 0 && (var19[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                class121.field2437[var37] = var13 + 1;
                class115.field2347[var37] = var14 - 1;
                class189.field3662[var13 + 1][var14 - 1] = 9;
                var37 = (var37 + 1) % var18;
                class126.field2535[var13 + 1][var14 - 1] = var35;
            }
            if (var13 > 0 && var14 < 103 && class189.field3662[var13 - 1][var14 + 1] == 0 && (var19[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                class121.field2437[var37] = var13 - 1;
                class115.field2347[var37] = var14 + 1;
                class189.field3662[var13 - 1][var14 + 1] = 6;
                var37 = (var37 + 1) % var18;
                class126.field2535[var13 - 1][var14 + 1] = var35;
            }
            if (var13 < 103 && var14 < 103 && class189.field3662[var13 + 1][var14 + 1] == 0 && (var19[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                class121.field2437[var37] = var13 + 1;
                class115.field2347[var37] = var14 + 1;
                var37 = (var37 + 1) % var18;
                class189.field3662[var13 + 1][var14 + 1] = 12;
                class126.field2535[var13 + 1][var14 + 1] = var35;
            }
        }
        class180.field3461 = 0;
        if (!var16) {
            if (!arg4) {
                return false;
            }
            int var20 = 100;
            int var21 = 1000;
            byte var22 = 10;
            for (int var23 = arg5 - var22; var23 <= arg5 + var22; var23++) {
                for (int var24 = arg9 - var22; var24 <= arg9 + var22; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class126.field2535[var23][var24] < 100) {
                        int var25 = 0;
                        int var26 = 0;
                        if (var23 < arg5) {
                            var25 = arg5 - var23;
                        } else if (arg2 + arg5 - 1 < var23) {
                            var25 = var23 + 1 - arg5 - arg2;
                        }
                        if (var24 < arg9) {
                            var26 = arg9 - var24;
                        } else if (arg3 + arg9 - 1 < var24) {
                            var26 = var24 + 1 - arg3 - arg9;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var21 > var27 || var21 == var27 && class126.field2535[var23][var24] < var20) {
                            var21 = var27;
                            var13 = var23;
                            var14 = var24;
                            var20 = class126.field2535[var23][var24];
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg1 == var13 && arg6 == var14) {
                return false;
            }
            class180.field3461 = 1;
        }
        byte var28 = 0;
        if (arg10 <= 45) {
            method1338(null, (byte) 81);
        }
        class121.field2437[var28] = var13;
        int var38 = var28 + 1;
        class115.field2347[var28] = var14;
        int var29;
        int var30 = var29 = class189.field3662[var13][var14];
        while (arg1 != var13 || arg6 != var14) {
            if (var29 != var30) {
                var29 = var30;
                class121.field2437[var38] = var13;
                class115.field2347[var38++] = var14;
            }
            if ((var30 & 0x1) != 0) {
                var14++;
            } else if ((var30 & 0x4) != 0) {
                var14--;
            }
            if ((var30 & 0x2) != 0) {
                var13++;
            } else if ((var30 & 0x8) != 0) {
                var13--;
            }
            var30 = class189.field3662[var13][var14];
        }
        if (var38 > 0) {
            int var31 = var38--;
            int var32 = class121.field2437[var38];
            int var33 = class115.field2347[var38];
            if (var31 > 25) {
                var31 = 25;
            }
            if (arg8 == 0) {
                class60.field1174.method657(28182, 198);
                class5.field80++;
                class60.field1174.method609(var31 + var31 + 3, (byte) -117);
            }
            if (arg8 == 1) {
                class60.field1174.method657(28182, 249);
                class141.field2770++;
                class60.field1174.method609(var31 + var31 + 3 + 14, (byte) -104);
            }
            if (arg8 == 2) {
                class182.field3486++;
                class60.field1174.method657(28182, 95);
                class60.field1174.method609(var31 + var31 + 3, (byte) -109);
            }
            class60.field1174.method573(19634, var33 + class34.field649);
            class60.field1174.method583(-68041368, class127.field2536 + var32);
            class25.field488 = class121.field2437[0];
            class47.field926 = class115.field2347[0];
            for (int var34 = 1; var34 < var31; var34++) {
                var38--;
                class60.field1174.method582(class121.field2437[var38] - var32, -120);
                class60.field1174.method582(class115.field2347[var38] - var33, -91);
            }
            class60.field1174.method609(class90.field1892[82] ? 1 : 0, (byte) -106);
            return true;
        } else if (arg8 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lah;B)V")
    public static final void method1338(class9 arg0, byte arg1) {
        field4002++;
        class26.field512 = arg0;
        if (arg1 <= 85) {
            field4014 = null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "([Lmb;B)I")
    public final int method1339(class110[] arg0, byte arg1) {
        field4017++;
        int var3 = 0;
        if (arg1 != -31) {
            return -16;
        }
        for (int var4 = 0; var4 < this.field4018; var4++) {
            class110 var5 = this.field4004[var4];
            for (class110 var6 = var5.field2280; var6 != var5; var6 = var6.field2280) {
                arg0[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Z)Lmb;")
    public final class110 method1340(boolean arg0) {
        if (arg0) {
            return null;
        }
        field4020++;
        if (this.field4028 > 0 && this.field4004[this.field4028 - 1] != this.field4022) {
            class110 var2 = this.field4022;
            this.field4022 = var2.field2280;
            return var2;
        }
        while (this.field4018 > this.field4028) {
            class110 var3 = this.field4004[this.field4028++].field2280;
            if (this.field4004[this.field4028 - 1] != var3) {
                this.field4022 = var3.field2280;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IJLmb;)V")
    public final void method1341(int arg0, long arg1, class110 arg2) {
        field4026++;
        if (arg2.field2287 != null) {
            arg2.method885(3);
        }
        class110 var5 = this.field4004[(int) (arg1 & (long) (this.field4018 - 1))];
        arg2.field2283 = arg1;
        arg2.field2280 = var5;
        if (arg0 > -40) {
            this.method1343(-31);
        }
        arg2.field2287 = var5.field2287;
        arg2.field2287.field2280 = arg2;
        arg2.field2280.field2287 = arg2;
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(I)V")
    public class204(int arg0) {
        this.field4004 = new class110[arg0];
        this.field4018 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class110 var3 = this.field4004[var2] = new class110();
            var3.field2280 = var3;
            var3.field2287 = var3;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(JB)Lmb;")
    public final class110 method1342(long arg0, byte arg1) {
        field4007++;
        this.field4010 = arg0;
        if (arg1 != -20) {
            return null;
        }
        class110 var4 = this.field4004[(int) (arg0 & (long) (this.field4018 - 1))];
        for (this.field4008 = var4.field2280; this.field4008 != var4; this.field4008 = this.field4008.field2280) {
            if (this.field4008.field2283 == arg0) {
                class110 var5 = this.field4008;
                this.field4008 = this.field4008.field2280;
                return var5;
            }
        }
        this.field4008 = null;
        return null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)Lmb;")
    public final class110 method1343(int arg0) {
        field4003++;
        if (this.field4008 == null) {
            return null;
        }
        class110 var2 = this.field4004[(int) ((long) (this.field4018 - 1) & this.field4010)];
        while (this.field4008 != var2) {
            if (this.field4008.field2283 == this.field4010) {
                class110 var3 = this.field4008;
                this.field4008 = this.field4008.field2280;
                return var3;
            }
            this.field4008 = this.field4008.field2280;
        }
        this.field4008 = null;
        if (arg0 != 1) {
            this.method1336((byte) 51);
        }
        return null;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(Z)Lmb;")
    public final class110 method1344(boolean arg0) {
        if (arg0) {
            method1335((byte) -123);
        }
        this.field4028 = 0;
        field4019++;
        return this.method1340(arg0);
    }
}
