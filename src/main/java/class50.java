import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public abstract class class50 {

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public static int field978 = 0;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "Lmh;")
    public static class128 field984 = class22.method156(127, " loggt sich ein)3");

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "Lvf;")
    public static class296 field979 = new class296();

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "I")
    public static int field986 = 99;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "Ls;")
    public static class261 field985 = new class261(32);

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "Lmh;")
    public static class128 field988 = class22.method156(126, "Ausw-=hlen");

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "Lgk;")
    public static class6 field989 = new class6();

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "I")
    public static volatile int field991 = 0;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
    public static int field992 = 0;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V", line = 4)
    public static final void method337(int arg0) {
        field977++;
        if (class203.field3583 == 0) {
            return;
        }
        if (arg0 < 5) {
            method344((class236) null, -98);
        }
        try {
            if (++class252.field4362 > 1500) {
                if (class121.field2041 != null) {
                    class121.field2041.method1229(false);
                    class121.field2041 = null;
                }
                if (class148.field2556 >= 1) {
                    class77.field1413 = -5;
                    class203.field3583 = 0;
                    return;
                }
                class148.field2556++;
                if (class182.field3195 == class17.field485) {
                    class17.field485 = class236.field4059;
                } else {
                    class17.field485 = class182.field3195;
                }
                class203.field3583 = 1;
                class252.field4362 = 0;
            }
            if (class203.field3583 == 1) {
                class118.field1994 = class288.field4925.method1902(118, class163.field2801, class17.field485);
                class203.field3583 = 2;
            }
            if (class203.field3583 == 2) {
                if (class118.field1994.field560 == 2) {
                    throw new IOException();
                }
                if (class118.field1994.field560 != 1) {
                    return;
                }
                class121.field2041 = new class180((Socket) class118.field1994.field562, class288.field4925);
                class118.field1994 = null;
                class121.field2041.method1228(class71.field1320.field3417, 0, false, class71.field1320.field3380);
                if (class257.field4412 != null) {
                    class257.field4412.method1676(-6244);
                }
                if (class310.field5264 != null) {
                    class310.field5264.method1676(-6244);
                }
                int var1 = class121.field2041.method1231(-1);
                if (class257.field4412 != null) {
                    class257.field4412.method1676(-6244);
                }
                if (class310.field5264 != null) {
                    class310.field5264.method1676(-6244);
                }
                if (var1 != 101) {
                    class203.field3583 = 0;
                    class77.field1413 = var1;
                    class121.field2041.method1229(false);
                    class121.field2041 = null;
                    return;
                }
                class203.field3583 = 3;
            }
            if (class203.field3583 == 3) {
                if (class121.field2041.method1230((byte) 22) >= 2) {
                    int var2 = class121.field2041.method1231(-1) << 8 | class121.field2041.method1231(-1);
                    class309.method2103(-1, var2);
                    class203.field3583 = 0;
                    if (class105.field1793 == -1) {
                        class105.field1793 = class222.field3899;
                    }
                    class121.field2041.method1229(false);
                    class121.field2041 = null;
                    class313.method2133(124);
                    return;
                }
                return;
            }
        } catch (IOException var4) {
            if (class121.field2041 != null) {
                class121.field2041.method1229(false);
                class121.field2041 = null;
            }
            if (class148.field2556 >= 1) {
                class77.field1413 = -4;
                class203.field3583 = 0;
            } else {
                class252.field4362 = 0;
                class148.field2556++;
                class203.field3583 = 1;
                if (class182.field3195 == class17.field485) {
                    class17.field485 = class236.field4059;
                } else {
                    class17.field485 = class182.field3195;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Z)V", line = 155)
    public static void method339(boolean arg0) {
        field984 = null;
        if (arg0) {
            method342((byte) 73, -4);
        }
        field989 = null;
        field979 = null;
        field985 = null;
        field988 = null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)Z", line = 175)
    public static final boolean method340(byte arg0) {
        field981++;
        if (class52.field1023 == 0) {
            int var1 = 5 / ((-arg0 - 63) / 39);
            return class263.field4567.method1165(-30862);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZLib;)V", line = 191)
    public static final void method341(int arg0, boolean arg1, class88 arg2) {
        field980++;
        int var3 = arg2.field1510;
        int var4 = (int) arg2.field4915;
        arg2.method1978((byte) -110);
        if (arg1) {
            class144.method958((byte) 121, var3);
        }
        if (arg0 <= 122) {
            return;
        }
        class93.method583(var3, (byte) -113);
        class10 var5 = class233.method1606(true, var4);
        if (var5 != null) {
            class7.method48(var5, 0);
        }
        int var6 = class275.field4769;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class99.method621(4089, class117.field1979[var7])) {
                class64.method434(var7, (byte) -63);
            }
        }
        if (class275.field4769 == 1) {
            class271.field4721 = false;
            class118.method710(class226.field3946, class219.field3864, class292.field5005, (byte) -124, class309.field5242);
        } else {
            class118.method710(class226.field3946, class219.field3864, class292.field5005, (byte) -127, class309.field5242);
            int var8 = client.field4159.method2070(class301.field5112);
            for (int var9 = 0; var9 < class275.field4769; var9++) {
                int var10 = client.field4159.method2070(method342((byte) 46, var9));
                if (var10 > var8) {
                    var8 = var10;
                }
            }
            class219.field3864 = class275.field4769 * 15 + 22;
            class292.field5005 = var8 + 8;
        }
        if (class196.field3433 != -1) {
            class309.method2105(class196.field3433, (byte) 92, 1);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BI)Lmh;", line = 260)
    public static final class128 method342(byte arg0, int arg1) {
        if (arg0 == 46) {
            field982++;
            return class210.field3725[arg1].method865((byte) -68) > 0 ? class28.method177((byte) -120, new class128[] { class283.field4868[arg1], class47.field954, class210.field3725[arg1] }) : class283.field4868[arg1];
        } else {
            return (class128) null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lf;I)V", line = 286)
    public static final void method344(class236 arg0, int arg1) {
        field983++;
        if (arg1 >= -9) {
            return;
        }
        long var2 = 0L;
        int var4 = -1;
        if (arg0.field4049 == 0) {
            var2 = class201.method1402(arg0.field4060, arg0.field4055, arg0.field4053);
        }
        if (arg0.field4049 == 1) {
            var2 = class84.method537(arg0.field4060, arg0.field4055, arg0.field4053);
        }
        if (arg0.field4049 == 2) {
            var2 = class16.method125(arg0.field4060, arg0.field4055, arg0.field4053);
        }
        if (arg0.field4049 == 3) {
            var2 = class240.method1633(arg0.field4060, arg0.field4055, arg0.field4053);
        }
        int var5 = 0;
        int var6 = 0;
        if (var2 != 0L) {
            var6 = (int) var2 >> 14 & 0x1F;
            var5 = ((int) var2 & 0x344F65) >> 20;
            var4 = Integer.MAX_VALUE & (int) (var2 >>> 32);
        }
        arg0.field4050 = var6;
        arg0.field4061 = var5;
        arg0.field4054 = var4;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)I")
    public abstract int method338(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)V")
    public abstract void method343(byte arg0);
}
