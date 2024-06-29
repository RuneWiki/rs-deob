import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class291 {

    @OriginalMember(owner = "client!eo", name = "m", descriptor = "Lco;")
    private class210 field4337 = new class210(64);

    @OriginalMember(owner = "client!eo", name = "n", descriptor = "Lco;")
    public class210 field4338 = new class210(2);

    @OriginalMember(owner = "client!eo", name = "f", descriptor = "Lg;")
    public class470 field4330;

    @OriginalMember(owner = "client!eo", name = "h", descriptor = "Lg;")
    private class470 field4332;

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "Lec;")
    public static class40 field4326 = new class40("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

    @OriginalMember(owner = "client!eo", name = "i", descriptor = "Lec;")
    public static class40 field4333 = new class40("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

    @OriginalMember(owner = "client!eo", name = "o", descriptor = "Lsd;")
    public static class74 field4339 = new class74(83, 5);

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!eo", name = "e", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!eo", name = "g", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!eo", name = "j", descriptor = "I")
    public static int field4334;

    @OriginalMember(owner = "client!eo", name = "k", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!eo", name = "l", descriptor = "Lg;")
    public static class470 field4336;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Z)V", line = 4)
    public final void method1828(boolean arg0) {
        class210 var2 = this.field4337;
        synchronized (this.field4337) {
            this.field4337.method1169(1076);
        }
        field4331++;
        class210 var3 = this.field4338;
        synchronized (this.field4338) {
            this.field4338.method1169(1076);
            if (arg0) {
                field4333 = null;
            }
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(BI)V", line = 21)
    public final void method1829(byte arg0, int arg1) {
        field4334++;
        if (arg0 < 109) {
            this.method1833((byte) 20);
        }
        class210 var3 = this.field4337;
        synchronized (this.field4337) {
            this.field4337.method1166(arg1, (byte) -52);
        }
        class210 var4 = this.field4338;
        synchronized (this.field4338) {
            this.field4338.method1166(arg1, (byte) -52);
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)V", line = 44)
    public static void method1830(int arg0) {
        field4326 = null;
        field4333 = null;
        if (arg0 == 0) {
            field4336 = null;
            field4339 = null;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIIII)V", line = 64)
    public static final void method1831(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class304.field4494 != 0 && arg2 != 0 && class221.field3084 < 50 && arg1 != -1) {
            class342.field4898[class221.field3084] = arg1;
            class58.field729[class221.field3084] = arg2;
            class79.field943[class221.field3084] = arg0;
            class305.field4511[class221.field3084] = null;
            class169.field2004[class221.field3084] = 0;
            class73.field881[class221.field3084] = arg4;
            class221.field3084++;
        }
        if (arg3 <= 122) {
            method1830(10);
        }
        field4325++;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IZ)Lfd;", line = 90)
    public final class212 method1832(int arg0, boolean arg1) {
        field4327++;
        if (!arg1) {
            return null;
        }
        class210 var3 = this.field4337;
        class212 var4;
        synchronized (this.field4337) {
            var4 = (class212) this.field4337.method1163((byte) 122, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field4332.method2768(-20472, arg0, 33);
        class212 var6 = new class212();
        var6.field2925 = this;
        if (var5 != null) {
            var6.method1181(2, new class179(var5));
        }
        class210 var7 = this.field4337;
        synchronized (this.field4337) {
            this.field4337.method1172((long) arg0, 1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)V", line = 119)
    public final void method1833(byte arg0) {
        if (arg0 < 32) {
            return;
        }
        class210 var2 = this.field4337;
        synchronized (this.field4337) {
            this.field4337.method1165((byte) 118);
        }
        field4329++;
        class210 var3 = this.field4338;
        synchronized (this.field4338) {
            this.field4338.method1165((byte) 118);
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIIIIIILpe;III)Z", line = 137)
    public static final boolean method1834(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class424 arg7, int arg8, int arg9, int arg10) {
        field4328++;
        int var11 = arg6;
        int var12 = arg2;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg6 - var13;
        int var16 = arg2 - var14;
        class223.field3095[var13][var14] = 99;
        class172.field2071[var13][var14] = 0;
        int var17 = -114 % ((arg5 - 57) / 59);
        byte var18 = 0;
        class334.field4807[var18] = arg6;
        int var19 = 0;
        byte var10001 = var18;
        int var27 = var18 + 1;
        class413.field5887[var10001] = arg2;
        int[][] var20 = arg7.field6118;
        while (var27 != var19) {
            var11 = class334.field4807[var19];
            var12 = class413.field5887[var19];
            var19 = var19 + 1 & 0xFFF;
            int var21 = var12 - var16;
            int var22 = var11 - var15;
            int var23 = var11 - arg7.field6116;
            int var24 = var12 - arg7.field6121;
            if (arg1 == -4) {
                if (arg3 == var11 && arg8 == var12) {
                    class312.field4564 = var11;
                    class356.field5113 = var12;
                    return true;
                }
            } else if (arg1 == -3) {
                if (class390.method2348(arg10, arg3, var11, arg8, var12, arg4, 2, 90, 2)) {
                    class312.field4564 = var11;
                    class356.field5113 = var12;
                    return true;
                }
            } else if (arg1 == -2) {
                if (arg7.method2529(-101, arg4, 2, arg0, arg8, var12, arg10, var11, arg3, 2)) {
                    class356.field5113 = var12;
                    class312.field4564 = var11;
                    return true;
                }
            } else if (arg1 == -1) {
                if (arg7.method2530(var11, arg8, 2, var12, arg0, arg3, arg4, 107, arg10)) {
                    class312.field4564 = var11;
                    class356.field5113 = var12;
                    return true;
                }
            } else if (arg1 == 0 || arg1 == 1 || arg1 == 2 || arg1 == 3 || arg1 == 9) {
                if (arg7.method2526(arg9, var12, arg8, arg1, false, arg3, 2, var11)) {
                    class356.field5113 = var12;
                    class312.field4564 = var11;
                    return true;
                }
            } else if (arg7.method2527(var11, arg8, arg9, arg3, (byte) -120, var12, 2, arg1)) {
                class312.field4564 = var11;
                class356.field5113 = var12;
                return true;
            }
            int var26 = class172.field2071[var22][var21] + 1;
            if (var22 > 0 && class223.field3095[var22 - 1][var21] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][var24 + 1] & 0x4E240000) == 0) {
                class334.field4807[var27] = var11 - 1;
                class413.field5887[var27] = var12;
                class223.field3095[var22 - 1][var21] = 2;
                var27 = var27 + 1 & 0xFFF;
                class172.field2071[var22 - 1][var21] = var26;
            }
            if (var22 < 126 && class223.field3095[var22 + 1][var21] == 0 && (var20[var23 + 2][var24] & 0x60E40000) == 0 && (var20[var23 + 2][var24 + 1] & 0x78240000) == 0) {
                class334.field4807[var27] = var11 + 1;
                class413.field5887[var27] = var12;
                var27 = var27 + 1 & 0xFFF;
                class223.field3095[var22 + 1][var21] = 8;
                class172.field2071[var22 + 1][var21] = var26;
            }
            if (var21 > 0 && class223.field3095[var22][var21 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[var23 + 1][var24 - 1] & 0x60E40000) == 0) {
                class334.field4807[var27] = var11;
                class413.field5887[var27] = var12 - 1;
                class223.field3095[var22][var21 - 1] = 1;
                var27 = var27 + 1 & 0xFFF;
                class172.field2071[var22][var21 - 1] = var26;
            }
            if (var21 < 126 && class223.field3095[var22][var21 + 1] == 0 && (var20[var23][var24 + 2] & 0x4E240000) == 0 && (var20[var23 + 1][var24 + 2] & 0x78240000) == 0) {
                class334.field4807[var27] = var11;
                class413.field5887[var27] = var12 + 1;
                var27 = var27 + 1 & 0xFFF;
                class223.field3095[var22][var21 + 1] = 4;
                class172.field2071[var22][var21 + 1] = var26;
            }
            if (var22 > 0 && var21 > 0 && class223.field3095[var22 - 1][var21 - 1] == 0 && (var20[var23 - 1][var24] & 0x4FA40000) == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0 && (var20[var23][var24 - 1] & 0x63E40000) == 0) {
                class334.field4807[var27] = var11 - 1;
                class413.field5887[var27] = var12 - 1;
                var27 = var27 + 1 & 0xFFF;
                class223.field3095[var22 - 1][var21 - 1] = 3;
                class172.field2071[var22 - 1][var21 - 1] = var26;
            }
            if (var22 < 126 && var21 > 0 && class223.field3095[var22 + 1][var21 - 1] == 0 && (var20[var23 + 1][var24 - 1] & 0x63E40000) == 0 && (var20[var23 + 2][var24 - 1] & 0x60E40000) == 0 && (var20[var23 + 2][var24] & 0x78E40000) == 0) {
                class334.field4807[var27] = var11 + 1;
                class413.field5887[var27] = var12 - 1;
                var27 = var27 + 1 & 0xFFF;
                class223.field3095[var22 + 1][var21 - 1] = 9;
                class172.field2071[var22 + 1][var21 - 1] = var26;
            }
            if (var22 > 0 && var21 < 126 && class223.field3095[var22 - 1][var21 + 1] == 0 && (var20[var23 - 1][var24 + 1] & 0x4FA40000) == 0 && (var20[var23 - 1][var24 + 2] & 0x4E240000) == 0 && (var20[var23][var24 + 2] & 0x7E240000) == 0) {
                class334.field4807[var27] = var11 - 1;
                class413.field5887[var27] = var12 + 1;
                class223.field3095[var22 - 1][var21 + 1] = 6;
                var27 = var27 + 1 & 0xFFF;
                class172.field2071[var22 - 1][var21 + 1] = var26;
            }
            if (var22 < 126 && var21 < 126 && class223.field3095[var22 + 1][var21 + 1] == 0 && (var20[var23 + 1][var24 + 2] & 0x7E240000) == 0 && (var20[var23 + 2][var24 + 2] & 0x78240000) == 0 && (var20[var23 + 2][var24 + 1] & 0x78E40000) == 0) {
                class334.field4807[var27] = var11 + 1;
                class413.field5887[var27] = var12 + 1;
                class223.field3095[var22 + 1][var21 + 1] = 12;
                var27 = var27 + 1 & 0xFFF;
                class172.field2071[var22 + 1][var21 + 1] = var26;
            }
        }
        class312.field4564 = var11;
        class356.field5113 = var12;
        return false;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(ZLcr;Ljava/lang/String;Z)V", line = 482)
    public static final void method1835(boolean arg0, class206 arg1, String arg2, boolean arg3) {
        field4335++;
        byte var4 = 4;
        int var5 = var4 + 6;
        int var6 = var4 + 6;
        int var7 = class451.field6384.method2425((byte) 75, 250, (class395[]) null, arg2);
        int var8 = class451.field6384.method2418((class395[]) null, arg2, 250, -1) * 13;
        class231.field3205.method1483(var5 - var4, var6 - var4, var4 + var7 + var4, var8 - -var4 - -var4, -16777216, 0);
        class231.field3205.method1459(var5 - var4, var6 - var4, var4 + var7 + var4, var4 + var8 + var4, -1, 0);
        arg1.method1139(1, (class313) null, var6, (int[]) null, 1, 0, var7, 0, 0, (class395[]) null, var5, arg2, -1, 0, var8, -1);
        class343.method2084(true, var5 - var4, var7 - (-var4 + -var4), var6 - var4, var4 + var4 + var8);
        if (arg3) {
            field4333 = null;
        }
        if (arg0) {
            class231.field3205.method1477();
        }
    }

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Lci;ILg;Lg;)V", line = 525)
    public class291(class421 arg0, int arg1, class470 arg2, class470 arg3) {
        this.field4330 = arg3;
        this.field4332 = arg2;
        this.field4332.method2755(-120, 33);
    }
}
