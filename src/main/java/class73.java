import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public abstract class class73 extends class134 {

    @OriginalMember(owner = "client!u", name = "j", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "Z")
    public static boolean field769;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIBILefa;)V", line = 4)
    public static final void method529(int arg0, int arg1, byte arg2, int arg3, class183 arg4) {
        field768++;
        int var5 = arg4.field7187[0];
        int var6 = arg4.field7193[0];
        if (var5 < 0 || class489.field6976 <= var5 || var6 < 0 || class153.field1677 <= var6 || arg1 < 0 || class489.field6976 <= arg1 || arg0 < 0 || class153.field1677 <= arg0) {
            return;
        }
        int var7 = class627.method3593(class286.field3490, arg0, var5, arg1, var6, class205.field2430[arg4.field4628], 0, 0, true, 0, 0, -4, class274.field3365, 0, arg4.method1128(-1));
        if (var7 < 1 || var7 > 3) {
            return;
        }
        for (int var8 = 0; var8 < (var7 - 1); var8++) {
            arg4.method1127(class286.field3490[var8], -1, class274.field3365[var8], arg2);
        }
        if (arg3 >= -32) {
            field769 = true;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(III)V", line = 41)
    public static final void method531(int arg0, int arg1, int arg2) {
        field767++;
        if (class656.field9363 < class656.field9370) {
            class656.field9363 = (float) ((double) class656.field9363 / 30.0D + (double) class656.field9363);
            if (class656.field9363 > class656.field9370) {
                class656.field9363 = class656.field9370;
            }
            class674.method3838(-1);
            class656.field9366 = (int) class656.field9363 >> 1;
            class656.field9368 = class389.method2399(class656.field9366, (byte) -29);
        } else if (class656.field9363 > class656.field9370) {
            class656.field9363 = (float) ((double) class656.field9363 - (double) class656.field9363 / 30.0D);
            if (class656.field9370 > class656.field9363) {
                class656.field9363 = class656.field9370;
            }
            class674.method3838(-1);
            class656.field9366 = (int) class656.field9363 >> 1;
            class656.field9368 = class389.method2399(class656.field9366, (byte) -29);
        }
        if (arg2 != 30514) {
            field769 = false;
        }
        if (class99.field1035 != -1 && class469.field6702 != -1) {
            int var3 = class99.field1035 - class30.field352;
            if (var3 < 2 || var3 > 2) {
                var3 /= 8;
            }
            int var4 = class469.field6702 - class116.field1211;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            class30.field352 += var3;
            if (var3 == 0 && var4 == 0) {
                class469.field6702 = -1;
                class99.field1035 = -1;
            }
            class116.field1211 += var4;
            class674.method3838(arg2 ^ 0xFFFF88CD);
        }
        if (class303.field3790 > 0) {
            class233.field2750--;
            if (class233.field2750 == 0) {
                class303.field3790--;
                class233.field2750 = 100;
            }
        } else {
            class699.field9857 = -1;
            class22.field197 = -1;
        }
        if (!class652.field9312 || class685.field9680 == null) {
            return;
        }
        for (class385 var5 = (class385) class685.field9680.method1719(65280); var5 != null; var5 = (class385) class685.field9680.method1723(-20665)) {
            class228 var6 = class656.field9360.method2054(36, var5.field5365.field2252);
            if (var5.method2389(arg1, arg0, 128)) {
                if (var6.field2598 != null) {
                    if (var6.field2598[4] != null) {
                        class723.method4030((long) var5.field5365.field2252, false, -1, false, (long) var5.field5365.field2252, false, 1006, var6.field2598[4], 0, var6.field2640, true, -1, var6.field2619);
                    }
                    if (var6.field2598[3] != null) {
                        class723.method4030((long) var5.field5365.field2252, false, -1, false, (long) var5.field5365.field2252, false, 1007, var6.field2598[3], 0, var6.field2640, true, -1, var6.field2619);
                    }
                    if (var6.field2598[2] != null) {
                        class723.method4030((long) var5.field5365.field2252, false, -1, false, (long) var5.field5365.field2252, false, 1008, var6.field2598[2], 0, var6.field2640, true, -1, var6.field2619);
                    }
                    if (var6.field2598[1] != null) {
                        class723.method4030((long) var5.field5365.field2252, false, -1, false, (long) var5.field5365.field2252, false, 1001, var6.field2598[1], 0, var6.field2640, true, -1, var6.field2619);
                    }
                    if (var6.field2598[0] != null) {
                        class723.method4030((long) var5.field5365.field2252, false, -1, false, (long) var5.field5365.field2252, false, 1012, var6.field2598[0], 0, var6.field2640, true, -1, var6.field2619);
                    }
                }
                if (!var5.field5365.field2255) {
                    var5.field5365.field2255 = true;
                    class133.method853(class15.field137, var5.field5365.field2252, var6.field2640);
                }
                if (var5.field5365.field2255) {
                    class133.method853(class451.field6503, var5.field5365.field2252, var6.field2640);
                }
            } else if (var5.field5365.field2255) {
                var5.field5365.field2255 = false;
                class133.method853(class4.field29, var5.field5365.field2252, var6.field2640);
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)I")
    public abstract int method530(int arg0);

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(I)I")
    public abstract int method532(int arg0);

    @OriginalMember(owner = "client!u", name = "f", descriptor = "(I)I")
    public abstract int method533(int arg0);

    @OriginalMember(owner = "client!u", name = "g", descriptor = "(I)J")
    public abstract long method534(int arg0);

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)I")
    public abstract int method535(byte arg0);
}
