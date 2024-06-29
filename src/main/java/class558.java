import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class558 {

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "Lvh;")
    private class328 field7528 = new class328(64);

    @OriginalMember(owner = "client!pe", name = "t", descriptor = "Lvh;")
    public class328 field7544 = new class328(50);

    @OriginalMember(owner = "client!pe", name = "w", descriptor = "Ldca;")
    public class160 field7547 = new class160(250);

    @OriginalMember(owner = "client!pe", name = "x", descriptor = "Lmfa;")
    private class564 field7548 = new class564();

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "Lpj;")
    private class132 field7540;

    @OriginalMember(owner = "client!pe", name = "A", descriptor = "Lqba;")
    private class371 field7551;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "Lpj;")
    public class132 field7532;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "Z")
    private boolean field7535;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public int field7525;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    public int field7533;

    @OriginalMember(owner = "client!pe", name = "y", descriptor = "[Ljava/lang/String;")
    private String[] field7549;

    @OriginalMember(owner = "client!pe", name = "z", descriptor = "[Ljava/lang/String;")
    private String[] field7550;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "Lkh;")
    public static class15 field7527 = new class15();

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "Liv;")
    public static class84 field7530 = new class84();

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    public static int field7526;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field7529;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    public static int field7531;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
    public static int field7534;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
    public static int field7536;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
    public static int field7537;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "I")
    public static int field7538;

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "I")
    public static int field7539;

    @OriginalMember(owner = "client!pe", name = "q", descriptor = "I")
    public static int field7541;

    @OriginalMember(owner = "client!pe", name = "r", descriptor = "I")
    public static int field7542;

    @OriginalMember(owner = "client!pe", name = "s", descriptor = "I")
    public static int field7543;

    @OriginalMember(owner = "client!pe", name = "v", descriptor = "I")
    public static int field7546;

    @OriginalMember(owner = "client!pe", name = "B", descriptor = "I")
    public int field7552;

    @OriginalMember(owner = "client!pe", name = "u", descriptor = "[Lpd;")
    public static class233[] field7545;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ln;IILoa;IIII)Lxa;", line = 3)
    public final class461 method3050(class17 arg0, int arg1, int arg2, class638 arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 != 64) {
            return null;
        }
        this.field7548.field7607 = arg3.field9051;
        this.field7548.field7615 = arg7;
        this.field7548.field7617 = arg5;
        this.field7548.field7616 = arg4;
        this.field7548.field7613 = arg1;
        this.field7548.field7610 = arg0 != null;
        field7526++;
        this.field7548.field7619 = arg6;
        return (class461) this.field7547.method1109((byte) 125, this.field7548);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZI)V", line = 21)
    public final void method3051(boolean arg0, int arg1) {
        field7546++;
        if (arg1 != 9826) {
            this.field7532 = null;
        }
        if (arg0 != this.field7535) {
            this.field7535 = arg0;
            this.method3059(30586);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)V", line = 36)
    public final void method3052(int arg0, int arg1) {
        field7534++;
        class328 var3 = this.field7528;
        synchronized (this.field7528) {
            this.field7528.method1989(arg1, (byte) 121);
        }
        class328 var4 = this.field7544;
        synchronized (this.field7544) {
            this.field7544.method1989(arg1, (byte) 107);
        }
        if (arg0 != 250) {
            this.field7550 = null;
        }
        class160 var5 = this.field7547;
        synchronized (this.field7547) {
            this.field7547.method1105(0, arg1);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V", line = 56)
    public final void method3053(int arg0) {
        class160 var2 = this.field7547;
        synchronized (this.field7547) {
            this.field7547.method1106((byte) 34);
            if (arg0 <= 122) {
                this.field7552 = 76;
            }
        }
        field7538++;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V", line = 69)
    public final void method3054(int arg0) {
        class328 var2 = this.field7544;
        synchronized (this.field7544) {
            this.field7544.method1997(1);
        }
        field7543++;
        if (arg0 < 105) {
            this.method3064(-61, 24);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILjava/lang/String;Z)V", line = 82)
    public static final void method3055(int arg0, String arg1, boolean arg2) {
        field7537++;
        if (arg1 == null) {
            return;
        }
        if (class261.field3711 >= 100) {
            class235.method1482(4, 24658, class9.field173.method42(class666.field9377, 19572));
            return;
        }
        String var3 = class200.method1347((byte) -109, arg1);
        if (var3 == null) {
            return;
        }
        if (arg0 != 36) {
            method3058(-66, 28);
        }
        for (int var4 = 0; var4 < class261.field3711; var4++) {
            String var8 = class200.method1347((byte) -125, client.field3854[var4]);
            if (var8 != null && var8.equals(var3)) {
                class235.method1482(4, 24658, arg1 + class9.field174.method42(class666.field9377, 19572));
                return;
            }
            if (class325.field4809[var4] != null) {
                String var9 = class200.method1347((byte) -128, class325.field4809[var4]);
                if (var9 != null && var9.equals(var3)) {
                    class235.method1482(4, arg0 + 24622, arg1 + class9.field174.method42(class666.field9377, 19572));
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class372.field5293; var5++) {
            String var6 = class200.method1347((byte) -110, class129.field1779[var5]);
            if (var6 != null && var6.equals(var3)) {
                class235.method1482(4, 24658, class9.field179.method42(class666.field9377, 19572) + arg1 + class9.field180.method42(class666.field9377, 19572));
                return;
            }
            if (class460.field6515[var5] != null) {
                String var7 = class200.method1347((byte) -118, class460.field6515[var5]);
                if (var7 != null && var7.equals(var3)) {
                    class235.method1482(4, 24658, class9.field179.method42(class666.field9377, 19572) + arg1 + class9.field180.method42(class666.field9377, arg0 ^ 0x4C50));
                    return;
                }
            }
        }
        if (class200.method1347((byte) -106, class253.field3576.field3975).equals(var3)) {
            class235.method1482(4, 24658, class9.field176.method42(class666.field9377, 19572));
            return;
        }
        class681.field9591++;
        class1.method5(1, class624.field8696);
        class288.field4014.method746((byte) -121, class499.method2790(arg1, 113) + 1);
        class288.field4014.method708(-126, arg1);
        class288.field4014.method746((byte) -103, arg2 ? 1 : 0);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lta;IIIILn;Loa;ILoa;ZZZ)Lxa;", line = 178)
    public final class461 method3056(class194 arg0, int arg1, int arg2, int arg3, int arg4, class17 arg5, class638 arg6, int arg7, class638 arg8, boolean arg9, boolean arg10, boolean arg11) {
        field7539++;
        class461 var13 = this.method3050(arg5, arg2, 64, arg6, arg1, arg7, arg4, arg3);
        if (var13 != null) {
            return var13;
        }
        class257 var14 = this.method3064(arg7, -111);
        if (arg3 > 1 && var14.field3633 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (arg3 >= var14.field3650[var16] && var14.field3650[var16] != 0) {
                    var15 = var14.field3633[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method3064(var15, -106);
            }
        }
        if (arg10) {
            return null;
        }
        int[] var17 = var14.method1584(arg2, arg9, arg8, (byte) 52, arg0, arg5, arg6, arg1, arg3, arg4);
        if (var17 == null) {
            return null;
        }
        class461 var18;
        if (arg11) {
            var18 = arg8.method452(var17, 0, 36, 36, 32);
        } else {
            var18 = arg6.method452(var17, 0, 36, 36, 32);
        }
        if (!arg11) {
            class564 var19 = new class564();
            var19.field7615 = arg3;
            var19.field7613 = arg2;
            var19.field7616 = arg1;
            var19.field7610 = arg5 != null;
            var19.field7619 = arg4;
            var19.field7607 = arg6.field9051;
            var19.field7617 = arg7;
            this.field7547.method1111(var18, (byte) -83, var19);
        }
        return var18;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V", line = 244)
    public static void method3057(byte arg0) {
        if (arg0 >= -59) {
            field7545 = null;
        }
        field7527 = null;
        field7545 = null;
        field7530 = null;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(II)I", line = 256)
    public static final int method3058(int arg0, int arg1) {
        return class326.field4815 == null ? 0 : class326.field4815[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)V", line = 267)
    public final void method3059(int arg0) {
        class328 var2 = this.field7528;
        synchronized (this.field7528) {
            this.field7528.method1997(1);
        }
        field7536++;
        class328 var3 = this.field7544;
        synchronized (this.field7544) {
            this.field7544.method1997(1);
        }
        class160 var4 = this.field7547;
        synchronized (this.field7547) {
            this.field7547.method1106((byte) 34);
        }
        if (arg0 != 30586) {
            this.field7551 = null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(II)V", line = 290)
    public final void method3060(int arg0, int arg1) {
        field7531++;
        this.field7552 = arg0;
        class328 var3 = this.field7544;
        synchronized (this.field7544) {
            if (arg1 != -16810) {
                this.field7548 = null;
            }
            this.field7544.method1997(arg1 ^ 0xFFFFBE57);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)V", line = 310)
    public final void method3061(boolean arg0) {
        field7529++;
        class328 var2 = this.field7528;
        synchronized (this.field7528) {
            this.field7528.method1987(-31085);
            if (!arg0) {
                this.method3056(null, -51, 8, -79, -79, null, null, 33, null, false, true, false);
            }
        }
        class328 var3 = this.field7544;
        synchronized (this.field7544) {
            this.field7544.method1987(-31085);
        }
        class160 var4 = this.field7547;
        synchronized (this.field7547) {
            this.field7547.method1110(18438);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZ)V", line = 329)
    public static final void method3062(int arg0, boolean arg1) {
        field7541++;
        class74.method592(0);
        if (!class601.method3330(-67, class340.field4947)) {
            return;
        }
        class668.field9401++;
        if (class668.field9401 < 50 && !arg1) {
            return;
        }
        class668.field9401 = 0;
        if (!class421.field5950 && class53.field758 != null) {
            class222.field3203++;
            class1.method5(1, class200.field2951);
            try {
                class53.field758.method3126(class288.field4014.field1316, false, class288.field4014.field1301, 0);
                class288.field4014.field1301 = 0;
            } catch (IOException var2) {
                class421.field5950 = true;
            }
        }
        if (arg0 != -23356) {
            field7530 = null;
        }
        class74.method592(0);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIII)Z", line = 367)
    public static final boolean method3063(int arg0, int arg1, int arg2, int arg3) {
        if (!class308.method1898(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << class627.field8753;
        int var5 = arg2 << class627.field8753;
        int var6 = class144.field2149[arg0].method273(arg1, arg2) - 1;
        int var7 = var6 - (0x78 << class627.field8753 - 7);
        int var8 = var6 - (0xE6 << class627.field8753 - 7);
        int var9 = var6 - (0xEE << class627.field8753 - 7);
        if (arg3 == 1) {
            if (var4 > class7.field76) {
                if (!class680.method3754(var4, var6, var5)) {
                    return false;
                }
                if (!class680.method3754(var4, var6, class634.field8905 + var5)) {
                    return false;
                }
                if (!class680.method3754(var4, var6, class658.field9268 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class680.method3754(var4, var7, var5)) {
                    return false;
                }
                if (!class680.method3754(var4, var7, class634.field8905 + var5)) {
                    return false;
                }
                if (!class680.method3754(var4, var7, class658.field9268 + var5)) {
                    return false;
                }
            }
            if (!class680.method3754(var4, var8, var5)) {
                return false;
            } else if (class680.method3754(var4, var8, class634.field8905 + var5)) {
                return class680.method3754(var4, var8, class658.field9268 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 2) {
            if (var5 < class247.field3511) {
                if (!class680.method3754(var4, var6, class658.field9268 + var5)) {
                    return false;
                }
                if (!class680.method3754(class634.field8905 + var4, var6, class658.field9268 + var5)) {
                    return false;
                }
                if (!class680.method3754(class658.field9268 + var4, var6, class658.field9268 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class680.method3754(var4, var7, class658.field9268 + var5)) {
                    return false;
                }
                if (!class680.method3754(class634.field8905 + var4, var7, class658.field9268 + var5)) {
                    return false;
                }
                if (!class680.method3754(class658.field9268 + var4, var7, class658.field9268 + var5)) {
                    return false;
                }
            }
            if (!class680.method3754(var4, var8, class658.field9268 + var5)) {
                return false;
            } else if (class680.method3754(class634.field8905 + var4, var8, class658.field9268 + var5)) {
                return class680.method3754(class658.field9268 + var4, var8, class658.field9268 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 4) {
            if (var4 < class7.field76) {
                if (!class680.method3754(class658.field9268 + var4, var6, var5)) {
                    return false;
                }
                if (!class680.method3754(class658.field9268 + var4, var6, class634.field8905 + var5)) {
                    return false;
                }
                if (!class680.method3754(class658.field9268 + var4, var6, class658.field9268 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class680.method3754(class658.field9268 + var4, var7, var5)) {
                    return false;
                }
                if (!class680.method3754(class658.field9268 + var4, var7, class634.field8905 + var5)) {
                    return false;
                }
                if (!class680.method3754(class658.field9268 + var4, var7, class658.field9268 + var5)) {
                    return false;
                }
            }
            if (!class680.method3754(class658.field9268 + var4, var8, var5)) {
                return false;
            } else if (class680.method3754(class658.field9268 + var4, var8, class634.field8905 + var5)) {
                return class680.method3754(class658.field9268 + var4, var8, class658.field9268 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 8) {
            if (var5 > class247.field3511) {
                if (!class680.method3754(var4, var6, var5)) {
                    return false;
                }
                if (!class680.method3754(class634.field8905 + var4, var6, var5)) {
                    return false;
                }
                if (!class680.method3754(class658.field9268 + var4, var6, var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class680.method3754(var4, var7, var5)) {
                    return false;
                }
                if (!class680.method3754(class634.field8905 + var4, var7, var5)) {
                    return false;
                }
                if (!class680.method3754(class658.field9268 + var4, var7, var5)) {
                    return false;
                }
            }
            if (!class680.method3754(var4, var8, var5)) {
                return false;
            } else if (class680.method3754(class634.field8905 + var4, var8, var5)) {
                return class680.method3754(class658.field9268 + var4, var8, var5);
            } else {
                return false;
            }
        } else if (!class680.method3754(class634.field8905 + var4, var9, class634.field8905 + var5)) {
            return false;
        } else if (arg3 == 16) {
            return class680.method3754(var4, var8, class658.field9268 + var5);
        } else if (arg3 == 32) {
            return class680.method3754(class658.field9268 + var4, var8, class658.field9268 + var5);
        } else if (arg3 == 64) {
            return class680.method3754(class658.field9268 + var4, var8, var5);
        } else if (arg3 == 128) {
            return class680.method3754(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "(II)Lol;", line = 586)
    public final class257 method3064(int arg0, int arg1) {
        field7542++;
        class328 var3 = this.field7528;
        class257 var4;
        synchronized (this.field7528) {
            var4 = (class257) this.field7528.method1986((byte) -99, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class132 var5 = this.field7540;
        byte[] var6;
        synchronized (this.field7540) {
            var6 = this.field7540.method940(class419.method2389(arg0, 118), class144.method1015(arg0, -104), 0);
        }
        class257 var7 = new class257();
        var7.field3678 = arg0;
        var7.field3641 = this;
        var7.field3654 = new String[] { null, null, class9.field94.method42(this.field7525, 19572), null, null };
        var7.field3652 = new String[] { null, null, null, null, class9.field95.method42(this.field7525, 19572) };
        if (var6 != null) {
            var7.method1583(0, new class96(var6));
        }
        var7.method1589(106);
        if (var7.field3648 != -1) {
            var7.method1579(this.method3064(var7.field3625, -75), this.method3064(var7.field3648, -34), (byte) 77);
        }
        if (var7.field3670 != -1) {
            var7.method1577(49, this.method3064(var7.field3670, -20), this.method3064(var7.field3667, -55));
        }
        if (!this.field7535 && var7.field3611) {
            var7.field3655 = class9.field92.method42(this.field7525, 19572);
            var7.field3617 = false;
            var7.field3654 = this.field7549;
            var7.field3607 = 0;
            var7.field3610 = null;
            var7.field3652 = this.field7550;
            if (var7.field3682 != null) {
                boolean var8 = false;
                for (class539 var9 = var7.field3682.method2066(false); var9 != null; var9 = var7.field3682.method2062(-19704)) {
                    class374 var10 = this.field7551.method2171((byte) -80, (int) var9.field7311);
                    if (var10.field5306) {
                        var9.method2971(1);
                    } else {
                        var8 = true;
                    }
                }
                if (!var8) {
                    var7.field3682 = null;
                }
            }
        }
        class328 var11 = this.field7528;
        synchronized (this.field7528) {
            if (arg1 >= -1) {
                return null;
            } else {
                this.field7528.method1985(var7, (long) arg0, (byte) -102);
                return var7;
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Ldd;IZLqba;Lpj;Lpj;)V", line = 682)
    public class558(class647 arg0, int arg1, boolean arg2, class371 arg3, class132 arg4, class132 arg5) {
        this.field7540 = arg4;
        this.field7551 = arg3;
        this.field7532 = arg5;
        this.field7535 = arg2;
        this.field7525 = arg1;
        if (this.field7540 == null) {
            this.field7533 = 0;
        } else {
            int var7 = this.field7540.method917((byte) -74) - 1;
            this.field7533 = this.field7540.method936(var7, -123) + var7 * 256;
        }
        this.field7549 = new String[] { null, null, class9.field94.method42(this.field7525, 19572), null, null };
        this.field7550 = new String[] { null, null, null, null, class9.field95.method42(this.field7525, 19572) };
    }
}
