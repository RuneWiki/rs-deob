import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public abstract class class60 extends class107 {

    @OriginalMember(owner = "client!k", name = "Z", descriptor = "I")
    public int field1328 = 1000;

    @OriginalMember(owner = "client!k", name = "db", descriptor = "Lrc;")
    public static class105 field1332 = class43.method374("Bitte versuchen Sie es in ", 0);

    @OriginalMember(owner = "client!k", name = "kb", descriptor = "Lrc;")
    public static class105 field1339 = class43.method374("_", 0);

    @OriginalMember(owner = "client!k", name = "hb", descriptor = "I")
    public static int field1336 = 0;

    @OriginalMember(owner = "client!k", name = "lb", descriptor = "Lle;")
    public static class71 field1340 = new class71(128);

    @OriginalMember(owner = "client!k", name = "mb", descriptor = "I")
    public static int field1341 = 127;

    @OriginalMember(owner = "client!k", name = "ab", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!k", name = "bb", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!k", name = "cb", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!k", name = "eb", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!k", name = "fb", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!k", name = "ib", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!k", name = "jb", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!k", name = "gb", descriptor = "Lpb;")
    public static class92 field1335;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILte;IIIIIII)V", line = 6)
    public static final void method481(int arg0, class119 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg7 != -2) {
            method483(-128, -97, 73);
        }
        if (class35.field818) {
            class134.field3289 = 32;
        } else {
            class134.field3289 = 0;
        }
        class35.field818 = false;
        field1333++;
        if (arg3 <= arg6 && arg6 < arg3 + 16 && arg5 <= arg8 && arg8 < arg5 + 16) {
            if (arg4 == 2 || arg4 == 3) {
                class90.field2064 = true;
            }
            if (arg4 == 1) {
                class80.field1805 = true;
            }
            arg1.field2838 -= class59.field1312 * 4;
        } else if (arg6 >= arg3 && arg6 < arg3 + 16 && arg5 + arg2 - 16 <= arg8 && arg8 < arg2 + arg5) {
            arg1.field2838 += class59.field1312 * 4;
            if (arg4 == 2 || arg4 == 3) {
                class90.field2064 = true;
            }
            if (arg4 == 1) {
                class80.field1805 = true;
                return;
            }
        } else if (arg6 >= arg3 - class134.field3289 && arg3 + class134.field3289 + 16 > arg6 && arg8 >= arg5 + 16 && arg5 + arg2 - 16 > arg8 && class59.field1312 > 0) {
            if (arg4 == 1) {
                class80.field1805 = true;
            }
            if (arg4 == 2 || arg4 == 3) {
                class90.field2064 = true;
            }
            class35.field818 = true;
            int var9 = (arg2 - 32) * arg2 / arg0;
            if (var9 < 8) {
                var9 = 8;
            }
            int var10 = arg2 - var9 - 32;
            int var11 = arg8 - var9 / 2 - arg5 - 16;
            arg1.field2838 = (arg0 - arg2) * var11 / var10;
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!k", name = "f", descriptor = "(I)Ljb;", line = 85)
    public class56 method168(int arg0) {
        field1329++;
        return arg0 <= 6 ? null : null;
    }

    @OriginalMember(owner = "client!k", name = "g", descriptor = "(I)V", line = 106)
    public static void method482(int arg0) {
        field1335 = null;
        field1339 = null;
        field1332 = null;
        field1340 = null;
        if (arg0 != 0) {
            method481(95, null, -109, -32, -118, -118, -84, -100, 26);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIIIIIII)V", line = 120)
    public void method440(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1330++;
        class56 var10 = this.method168(35);
        if (var10 != null) {
            this.field1328 = var10.field1328;
            var10.method440(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(III)V", line = 145)
    public static final void method483(int arg0, int arg1, int arg2) {
        field1337++;
        int var3 = arg2;
        for (int var4 = 0; var4 < 100; var4++) {
            if (class37.field856[var4] != null) {
                int var5 = class122.field3008 + 70 + 4 - var3 * 14;
                int var6 = class120.field2896[var4];
                if (var5 < -20) {
                    break;
                }
                if (var6 == 0) {
                    var3++;
                }
                class105 var7 = class92.field2116[var4];
                if (var7 != null && var7.method848(class80.field1796, 0)) {
                    var7 = var7.method862(5, (byte) 105);
                }
                if (var7 != null && var7.method848(class43.field998, 0)) {
                    var7 = var7.method862(5, (byte) 90);
                }
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || class17.field370 == 0 || class17.field370 == 1 && class74.method627(var7, arg2 ^ 0x5))) {
                    var3++;
                    if (var5 - 14 < arg1 && arg1 <= var5 && !var7.method829(true, class119.field2842.field300)) {
                        class102.field2298++;
                        class18.field385++;
                        if (class110.field2560 >= 1) {
                            class105.method832(17, 0, 0, (byte) 123, class108.method878(new class105[] { class90.field2060, var7 }, 2867), class3.field31, 0);
                            class28.field633++;
                        }
                        class105.method832(41, 0, 0, (byte) 122, class108.method878(new class105[] { class90.field2060, var7 }, 2867), class64.field1435, 0);
                        class105.method832(50, 0, 0, (byte) 124, class108.method878(new class105[] { class90.field2060, var7 }, 2867), class39.field889, 0);
                    }
                }
                if ((var6 == 3 || var6 == 7) && class39.field893 == 0 && (var6 == 7 || class134.field3270 == 0 || class134.field3270 == 1 && class74.method627(var7, -121))) {
                    var3++;
                    if (arg1 > var5 - 14 && arg1 <= var5) {
                        class18.field385++;
                        if (class110.field2560 >= 1) {
                            class105.method832(17, 0, 0, (byte) 125, class108.method878(new class105[] { class90.field2060, var7 }, 2867), class3.field31, 0);
                            class28.field633++;
                        }
                        class105.method832(41, 0, 0, (byte) 124, class108.method878(new class105[] { class90.field2060, var7 }, 2867), class64.field1435, 0);
                        class102.field2298++;
                        class105.method832(50, 0, 0, (byte) 125, class108.method878(new class105[] { class90.field2060, var7 }, 2867), class39.field889, 0);
                    }
                }
                if (var6 == 4 && (class55.field1106 == 0 || class55.field1106 == 1 && class74.method627(var7, -117))) {
                    var3++;
                    if (arg1 > var5 - 14 && arg1 <= var5) {
                        class9.field169++;
                        class105.method832(42, 0, 0, (byte) 126, class108.method878(new class105[] { class90.field2060, var7 }, 2867), class64.field1430, 0);
                    }
                }
                if ((var6 == 5 || var6 == 6) && class39.field893 == 0 && class134.field3270 < 2) {
                    var3++;
                }
                if (var6 == 8 && (class55.field1106 == 0 || class55.field1106 == 1 && class74.method627(var7, -115))) {
                    var3++;
                    if (arg1 > var5 - 14 && var5 >= arg1) {
                        class105.method832(11, 0, 0, (byte) 126, class108.method878(new class105[] { class90.field2060, var7 }, 2867), class58.field1258, 0);
                        class75.field1666++;
                    }
                }
            }
        }
    }
}
