import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class134 {

    @OriginalMember(owner = "client!ct", name = "f", descriptor = "Lmga;")
    private class666 field2190 = new class666(16);

    @OriginalMember(owner = "client!ct", name = "h", descriptor = "Lbi;")
    private class449 field2192;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!ct", name = "e", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!ct", name = "g", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!ct", name = "i", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IIIII)V", line = 6)
    public static final void method1002(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class597 var5 = (class597) class6.field182.method3257(-77); var5 != null; var5 = (class597) class6.field182.method3263((byte) -83)) {
            class108.method807(arg4, arg1, arg3, var5, arg0, arg2 ^ 0x56);
        }
        field2185++;
        if (arg2 != 1) {
            return;
        }
        for (class597 var6 = (class597) class665.field9431.method3257(-96); var6 != null; var6 = (class597) class665.field9431.method3263((byte) -79)) {
            byte var11 = 1;
            class543 var12 = var6.field7905.method2353(-1);
            if (var6.field7905.field5609) {
                var11 = 0;
            } else if (var6.field7905.field5584 == var12.field7186 || var6.field7905.field5584 == var12.field7136 || var6.field7905.field5584 == var12.field7174 || var6.field7905.field5584 == var12.field7147) {
                var11 = 2;
            } else if (var6.field7905.field5584 == var12.field7155 || var6.field7905.field5584 == var12.field7153 || var6.field7905.field5584 == var12.field7156 || var6.field7905.field5584 == var12.field7163) {
                var11 = 3;
            }
            if (var6.field7897 != var11) {
                int var13 = class611.method3350(var6.field7905, (byte) 78);
                class419 var14 = var6.field7905.field4052;
                if (var14.field5753 != null) {
                    var14 = var14.method2401(false, class80.field1261);
                }
                if (var14 == null || var13 == -1) {
                    var6.field7901 = false;
                    var6.field7902 = -1;
                } else if (var6.field7902 != var13 || var6.field7901 != var14.field5758) {
                    if (var6.field7914 != null) {
                        class639.field8604.method164(var6.field7914);
                        var6.field7914 = null;
                    }
                    var6.field7901 = var14.field5758;
                    var6.field7902 = var13;
                    var6.field7904 = null;
                    var6.field7911 = null;
                }
                var6.field7897 = var11;
            }
            var6.field7907 = var6.field7905.field8620;
            var6.field7900 = var6.field7905.field8620 + (var6.field7905.method2317((byte) 40) << 8);
            var6.field7918 = var6.field7905.field8612;
            var6.field7917 = var6.field7905.field8612 + (var6.field7905.method2317((byte) 40) << 8);
            class108.method807(arg4, arg1, arg3, var6, arg0, 62);
        }
        for (class597 var7 = (class597) class526.field7004.method2915(96); var7 != null; var7 = (class597) class526.field7004.method2912((byte) 98)) {
            byte var8 = 1;
            class543 var9 = var7.field7899.method2353(-1);
            if (var7.field7899.field5609) {
                var8 = 0;
            } else if (var7.field7899.field5584 == var9.field7186 || var7.field7899.field5584 == var9.field7136 || var7.field7899.field5584 == var9.field7174 || var7.field7899.field5584 == var9.field7147) {
                var8 = 2;
            } else if (var7.field7899.field5584 == var9.field7155 || var7.field7899.field5584 == var9.field7153 || var7.field7899.field5584 == var9.field7156 || var7.field7899.field5584 == var9.field7163) {
                var8 = 3;
            }
            if (var7.field7897 != var8) {
                int var10 = class346.method2079(12610, var7.field7899);
                if (var7.field7902 != var10 || var7.field7901 != var7.field7899.field5377) {
                    if (var7.field7914 != null) {
                        class639.field8604.method164(var7.field7914);
                        var7.field7914 = null;
                    }
                    var7.field7901 = var7.field7899.field5377;
                    var7.field7902 = var10;
                    var7.field7904 = null;
                    var7.field7911 = null;
                }
                var7.field7897 = var8;
            }
            var7.field7907 = var7.field7899.field8620;
            var7.field7900 = var7.field7899.field8620 + (var7.field7899.method2317((byte) 40) << 8);
            var7.field7918 = var7.field7899.field8612;
            var7.field7917 = var7.field7899.field8612 + (var7.field7899.method2317((byte) 40) << 8);
            class108.method807(arg4, arg1, arg3, var7, arg0, arg2 ^ 0x3C);
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(ZI)Lhe;", line = 139)
    private final class344 method1003(boolean arg0, int arg1) {
        field2187++;
        class666 var3 = this.field2190;
        class344 var4;
        synchronized (this.field2190) {
            var4 = (class344) this.field2190.method3750((long) arg1, false);
        }
        if (var4 != null) {
            return var4;
        }
        if (!arg0) {
            this.field2192 = null;
        }
        class449 var5 = this.field2192;
        byte[] var6;
        synchronized (this.field2192) {
            var6 = this.field2192.method2537(!arg0, 29, arg1);
        }
        class344 var7 = new class344();
        if (var6 != null) {
            var7.method2069(new class335(var6), 54);
        }
        class666 var8 = this.field2190;
        synchronized (this.field2190) {
            this.field2190.method3745(1, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IIZILfu;I)Lop;", line = 168)
    public final class177 method1004(int arg0, int arg1, boolean arg2, int arg3, class362 arg4, int arg5) {
        if (!arg2) {
            this.method1008((byte) -38);
        }
        field2189++;
        class596[] var7 = null;
        class344 var8 = this.method1003(arg2, arg1);
        if (var8.field4714 != null) {
            var7 = new class596[var8.field4714.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class264 var10 = arg4.method2137(var8.field4714[var9], 28803);
                var7[var9] = new class596(var10.field3666, var10.field3668, var10.field3660, var10.field3665, var10.field3664, var10.field3657, var10.field3669, var10.field3661);
            }
        }
        return new class177(var8.field4720, var7, var8.field4719, arg0, arg5, arg3);
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(BI)V", line = 200)
    public final void method1005(byte arg0, int arg1) {
        class666 var3 = this.field2190;
        synchronized (this.field2190) {
            this.field2190.method3740((byte) 60, arg1);
        }
        field2193++;
        int var4 = 7 / ((-arg0 - 71) / 33);
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)V", line = 214)
    public final void method1006(int arg0) {
        if (arg0 != -2) {
            return;
        }
        field2191++;
        class666 var2 = this.field2190;
        synchronized (this.field2190) {
            this.field2190.method3739(0);
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IIILjv;)Lwm;", line = 227)
    public static final class529 method1007(int arg0, int arg1, int arg2, class73 arg3) {
        field2188++;
        int var4 = arg2 << 10 | arg3.field1135;
        if (arg0 != -2038878256) {
            return null;
        }
        class529 var5 = (class529) class549.field7323.method1642(-1717, (long) var4 << 16);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class666.field9455.method2531(class666.field9455.method2557(var4, 127), 0);
        if (var6 == null) {
            int var8 = arg1 + 65536 << 10 | arg3.field1135;
            class529 var9 = (class529) class549.field7323.method1642(-1717, (long) var8 << 16);
            if (var9 != null) {
                return var9;
            }
            byte[] var10 = class666.field9455.method2531(class666.field9455.method2557(var8, 94), arg0 + 2038878256);
            if (var10 == null) {
                int var12 = arg3.field1135 | 0x3FFFC00;
                class529 var13 = (class529) class549.field7323.method1642(arg0 ^ 0x7986D69B, (long) var12 << 16);
                if (var13 != null) {
                    return var13;
                }
                byte[] var14 = class666.field9455.method2531(class666.field9455.method2557(var12, arg0 ^ 0x86792F89), 0);
                if (var14 == null) {
                    return null;
                } else if (var14.length <= 1) {
                    return null;
                } else {
                    class529 var15 = class169.method1151(-40, var14);
                    var15.field7054 = arg3;
                    class549.field7323.method1643(var15, 13642, (long) var12 << 16);
                    return var15;
                }
            } else if (var10.length <= 1) {
                return null;
            } else {
                class529 var11 = class169.method1151(arg0 ^ 0x7986D008, var10);
                var11.field7054 = arg3;
                class549.field7323.method1643(var11, 13642, (long) var8 << 16);
                return var11;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class529 var7 = class169.method1151(arg0 ^ 0x7986D008, var6);
            var7.field7054 = arg3;
            class549.field7323.method1643(var7, 13642, (long) var4 << 16);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(B)V", line = 306)
    public final void method1008(byte arg0) {
        field2186++;
        class666 var2 = this.field2190;
        synchronized (this.field2190) {
            int var3 = 35 / ((-arg0 - 11) / 51);
            this.field2190.method3748(6);
        }
    }

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lpca;ILbi;)V", line = 321)
    public class134(class671 arg0, int arg1, class449 arg2) {
        this.field2192 = arg2;
        this.field2192.method2527(0, 29);
    }
}
