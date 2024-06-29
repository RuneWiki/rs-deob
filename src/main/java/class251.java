import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class251 {

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "Z")
    public static boolean field4174 = false;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "Ltl;")
    private static class59 field4184 = class85.method639("Please wait)3)3)3", 9588);

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "Ltl;")
    public static class59 field4182 = class85.method639("hitbar_default", 9588);

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "Ltl;")
    public static class59 field4177 = field4184;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "Ltl;")
    public static class59 field4188 = class85.method639(" <col=00ff80>", 9588);

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "Lgb;")
    public static class212 field4185 = new class212(64);

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field4175;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public static int field4176;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    public static int field4183;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
    public static int field4186;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "Lvj;")
    public static class95 field4187;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)Z", line = 9)
    public static final boolean method1751(int arg0) {
        field4176++;
        class306 var1 = class236.field3916;
        synchronized (class236.field3916) {
            if (class59.field882 == class303.field5163) {
                return false;
            }
            class291.field4979 = class295.field5066[class303.field5163];
            class18.field225 = class72.field1128[class303.field5163];
            class303.field5163 = class303.field5163 + 1 & 0x7F;
            if (arg0 != 3368) {
                field4185 = (class212) null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIILme;)Loj;", line = 29)
    public static final class260 method1752(int arg0, int arg1, int arg2, class295 arg3) {
        field4183++;
        if (arg1 != 256) {
            field4189 = 50;
        }
        return class33.method222(6, arg2, arg0, arg3) ? class254.method1771((byte) 65) : null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V", line = 47)
    public static final void method1753(byte arg0) {
        field4175++;
        if (class238.field3977 == 0) {
            return;
        }
        if (arg0 != -122) {
            field4182 = (class59) null;
        }
        try {
            if ((++class265.field4576) > 2000) {
                if (class21.field284 != null) {
                    class21.field284.method1257(1185568552);
                    class21.field284 = null;
                }
                if (class165.field2678 >= 1) {
                    class90.field1405 = -5;
                    class238.field3977 = 0;
                    return;
                }
                class238.field3977 = 1;
                class265.field4576 = 0;
                class165.field2678++;
                if (class299.field5109 == class131.field2170) {
                    class131.field2170 = class146.field2391;
                } else {
                    class131.field2170 = class299.field5109;
                }
            }
            if (class238.field3977 == 1) {
                class179.field2936 = class308.field5222.method1293(class124.field2056, (byte) 82, class131.field2170);
                class238.field3977 = 2;
            }
            if (class238.field3977 == 2) {
                if (class179.field2936.field4256 == 2) {
                    throw new IOException();
                }
                if (class179.field2936.field4256 != 1) {
                    return;
                }
                class21.field284 = new class171((Socket) class179.field2936.field4255, class308.field5222);
                class179.field2936 = null;
                class21.field284.method1267(class234.field3888.field2758, class234.field3888.field2787, 0, (byte) 56);
                if (class227.field3652 != null) {
                    class227.field3652.method558(-106);
                }
                if (class237.field3934 != null) {
                    class237.field3934.method558(arg0 + 247);
                }
                int var1 = class21.field284.method1258(arg0 + 7);
                if (class227.field3652 != null) {
                    class227.field3652.method558(arg0 ^ 0xFFFFFFE0);
                }
                if (class237.field3934 != null) {
                    class237.field3934.method558(-81);
                }
                if (var1 != 21) {
                    class238.field3977 = 0;
                    class90.field1405 = var1;
                    class21.field284.method1257(1185568552);
                    class21.field284 = null;
                    return;
                }
                class238.field3977 = 3;
            }
            if (class238.field3977 == 3) {
                if (class21.field284.method1256(25) < 1) {
                    return;
                }
                class247.field4123 = new class59[class21.field284.method1258(arg0 + 22)];
                class238.field3977 = 4;
            }
            if (class238.field3977 == 4) {
                if (class21.field284.method1256(100) < class247.field4123.length * 8) {
                    return;
                }
                class18.field236.field2787 = 0;
                class21.field284.method1268(false, class18.field236.field2758, class247.field4123.length * 8, 0);
                for (int var2 = 0; var2 < class247.field4123.length; var2++) {
                    class247.field4123[var2] = class151.method1085(1, class18.field236.method1218(-1904132320));
                }
                class90.field1405 = 21;
                class238.field3977 = 0;
                class21.field284.method1257(1185568552);
                class21.field284 = null;
                return;
            }
        } catch (IOException var4) {
            if (class21.field284 != null) {
                class21.field284.method1257(1185568552);
                class21.field284 = null;
            }
            if (class165.field2678 >= 1) {
                class238.field3977 = 0;
                class90.field1405 = -4;
            } else {
                class238.field3977 = 1;
                if (class299.field5109 == class131.field2170) {
                    class131.field2170 = class146.field2391;
                } else {
                    class131.field2170 = class299.field5109;
                }
                class165.field2678++;
                class265.field4576 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIILma;IIB)V", line = 202)
    public static final void method1754(int arg0, int arg1, int arg2, class263 arg3, int arg4, int arg5, byte arg6) {
        field4179++;
        if (arg6 >= -26) {
            field4188 = (class59) null;
        }
        int var7 = arg0 * arg0 + arg2 * arg2;
        if (var7 > 360000) {
            return;
        }
        int var8 = Math.min(arg3.field4420 / 2, arg3.field4467 / 2);
        if ((var8 * var8) >= var7) {
            class7.method57(2, arg4, arg0, arg2, class93.field1448[arg1], arg3, arg5);
            return;
        }
        var8 -= 10;
        int var9 = class64.field983 + class213.field3489 & 0x7FF;
        int var10 = class298.field5094[var9];
        int var11 = class298.field5095[var9];
        int var12 = var10 * 256 / (class45.field731 + 256);
        int var13 = var11 * 256 / (class45.field731 + 256);
        int var14 = arg0 * var13 + arg2 * var12 >> 16;
        int var15 = arg0 * var12 - (arg2 * var13) >> 16;
        double var16 = Math.atan2((double) var14, (double) var15);
        int var18 = (int) ((double) var8 * Math.sin(var16));
        int var19 = (int) ((double) var8 * Math.cos(var16));
        if (class55.field815) {
            ((class122) client.field623[arg1]).method907(240, 240, (arg3.field4420 / 2 + arg4 + var18) * 16, (arg3.field4467 / 2 + arg5 - var19) * 16, (int) (var16 * 10430.378D), 4096);
        } else {
            ((class47) client.field623[arg1]).method350(arg3.field4420 / 2 + arg4 + var18 - 10, arg3.field4467 / 2 + -var19 + -10 + arg5, 20, 20, 15, 15, var16, 256);
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)V", line = 249)
    public static final void method1755(byte arg0) {
        class289.field4963.method1482((byte) 30);
        field4178++;
        class124.field2054.method1482((byte) 30);
        if (arg0 >= -119) {
            method1754(3, 78, 116, (class263) null, -26, 6, (byte) 59);
        }
        class67.field1015.method1482((byte) 30);
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V", line = 277)
    public static void method1756(int arg0) {
        field4188 = null;
        field4187 = null;
        field4184 = null;
        field4185 = null;
        field4182 = null;
        if (arg0 == -14630) {
            field4177 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIII)V", line = 331)
    public static final void method1757(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4181++;
        class186 var5 = class67.method561(arg3 ^ 0x20, arg4, 10);
        var5.method1380(3293);
        var5.field3117 = arg2;
        var5.field3114 = arg1;
        if (arg3 != 0) {
            method1752(112, -57, -102, (class295) null);
        }
        var5.field3123 = arg0;
    }
}
