import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class267 extends class409 {

    @OriginalMember(owner = "client!ek", name = "B", descriptor = "Lfi;")
    public class166 field3595 = new class166();

    @OriginalMember(owner = "client!ek", name = "I", descriptor = "Lnp;")
    public class207 field3601 = new class207();

    @OriginalMember(owner = "client!ek", name = "p", descriptor = "Lka;")
    private class407 field3583;

    @OriginalMember(owner = "client!ek", name = "w", descriptor = "Z")
    public static boolean field3590 = false;

    @OriginalMember(owner = "client!ek", name = "G", descriptor = "Ljava/lang/String;")
    public static String field3599 = "";

    @OriginalMember(owner = "client!ek", name = "F", descriptor = "I")
    public static int field3598 = 0;

    @OriginalMember(owner = "client!ek", name = "L", descriptor = "[Lap;")
    public static class289[] field3604 = new class289[2048];

    @OriginalMember(owner = "client!ek", name = "q", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!ek", name = "r", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!ek", name = "s", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!ek", name = "t", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!ek", name = "u", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!ek", name = "v", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!ek", name = "x", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!ek", name = "y", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!ek", name = "z", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!ek", name = "A", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!ek", name = "D", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!ek", name = "E", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!ek", name = "H", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!ek", name = "J", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!ek", name = "K", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIIBI)V")
    public static final void method1713(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field3597++;
        if (arg4 != -50) {
            field3590 = true;
        }
        int var6 = (arg2 - 32) * arg2 / arg3;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg2 - var6 - 32) * arg1 / (arg3 - arg2);
        class15.field124[0].method722(arg5, arg0);
        class15.field124[1].method722(arg5, arg2 + arg0 - 16);
        class249.field3415.method2414(arg0 + 16, arg5, arg2 - 32, true, 16, class179.field2629);
        class249.field3415.method2414(arg0 + var7 + 16, arg5, var6, true, 16, class243.field3347);
        class249.field3415.method2410(class273.field3669, arg5, var6, (byte) 0, arg0 - (-var7 - 16));
        class249.field3415.method2410(class273.field3669, arg5 + 1, var6, (byte) -68, arg0 + var7 + 16);
        class249.field3415.method2411(arg5, 16, var7 + arg0 + 16, class273.field3669, true);
        class249.field3415.method2411(arg5, 16, var7 + arg0 + 17, class273.field3669, true);
        class249.field3415.method2410(class71.field1075, arg5 + 15, var6, (byte) 120, arg0 + var7 + 16);
        class249.field3415.method2410(class71.field1075, arg5 + 14, var6 - 1, (byte) -109, var7 + arg0 + 17);
        class249.field3415.method2411(arg5, 16, arg0 + var7 + var6 + 15, class71.field1075, true);
        class249.field3415.method2411(arg5 + 1, 15, arg0 + var6 - (-var7 + -14), class71.field1075, true);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "()Lmi;")
    public final class409 method690() {
        field3584++;
        class236 var1;
        do {
            var1 = (class236) this.field3595.method1245(1);
            if (var1 == null) {
                return null;
            }
        } while (var1.field3263 == null);
        return var1.field3263;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lw;[IIIII)V")
    private final void method1714(class236 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 != 19720) {
            return;
        }
        if ((this.field3583.field5705[arg0.field3274] & 0x4) != 0 && arg0.field3260 < 0) {
            int var7 = this.field3583.field5657[arg0.field3274] / class413.field5774;
            while (true) {
                int var8 = (var7 + 1048575 - arg0.field3269) / var7;
                if (var8 > arg4) {
                    arg0.field3269 += arg4 * var7;
                    break;
                }
                arg0.field3263.method713(arg1, arg5, var8);
                arg0.field3269 += var7 * var8 - 1048576;
                arg5 += var8;
                arg4 -= var8;
                int var9 = class413.field5774 / 100;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class79 var11 = arg0.field3263;
                if (this.field3583.field5663[arg0.field3274] == 0) {
                    arg0.field3263 = class79.method701(arg0.field3257, var11.method705(), var11.method715(), var11.method682());
                } else {
                    arg0.field3263 = class79.method701(arg0.field3257, var11.method705(), 0, var11.method682());
                    this.field3583.method2502(arg0.field3277.field2275[arg0.field3279] < 0, arg3 ^ 0xFFFFB2DC, arg0);
                    arg0.field3263.method716(var9, var11.method715());
                }
                if (arg0.field3277.field2275[arg0.field3279] < 0) {
                    arg0.field3263.method686(-1);
                }
                var11.method717(var9);
                var11.method713(arg1, arg5, arg2 - arg5);
                if (var11.method704()) {
                    this.field3601.method1428(var11);
                }
            }
        }
        field3592++;
        arg0.field3263.method713(arg1, arg5, arg4);
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "()Lmi;")
    public final class409 method708() {
        field3593++;
        class236 var1 = (class236) this.field3595.method1240((byte) -121);
        if (var1 == null) {
            return null;
        } else if (var1.field3263 == null) {
            return this.method690();
        } else {
            return var1.field3263;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "([BIII)Ljava/lang/String;")
    public static final String method1715(byte[] arg0, int arg1, int arg2, int arg3) {
        field3594++;
        if (arg3 <= 66) {
            field3598 = -59;
        }
        char[] var4 = new char[arg1];
        int var5 = 0;
        for (int var6 = 0; var6 < arg1; var6++) {
            int var7 = arg0[arg2 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class43.field645[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(III)V")
    public static final void method1716(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            field3599 = null;
        }
        field3585++;
        class414.field5782[arg1] = arg2;
        class60 var3 = (class60) class184.field2671.method614(-123, (long) arg1);
        if (var3 == null) {
            class60 var4 = new class60(class108.method902((byte) -93) + 500L);
            class184.field2671.method612((long) arg1, arg0 - 1, var4);
        } else {
            var3.field937 = class108.method902((byte) -93) + 500L;
        }
    }

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(I)V")
    public static void method1717(int arg0) {
        if (arg0 < -109) {
            field3599 = null;
            field3604 = null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILw;B)V")
    private final void method1718(int arg0, class236 arg1, byte arg2) {
        if ((this.field3583.field5705[arg1.field3274] & 0x4) != 0 && arg1.field3260 < 0) {
            int var4 = this.field3583.field5657[arg1.field3274] / class413.field5774;
            int var5 = (var4 + 1048575 - arg1.field3269) / var4;
            arg1.field3269 = arg0 * var4 + arg1.field3269 & 0xFFFFF;
            if (arg0 >= var5) {
                if (this.field3583.field5663[arg1.field3274] == 0) {
                    arg1.field3263 = class79.method701(arg1.field3257, arg1.field3263.method705(), arg1.field3263.method715(), arg1.field3263.method682());
                } else {
                    arg1.field3263 = class79.method701(arg1.field3257, arg1.field3263.method705(), 0, arg1.field3263.method682());
                    this.field3583.method2502(arg1.field3277.field2275[arg1.field3279] < 0, -60, arg1);
                }
                if (arg1.field3277.field2275[arg1.field3279] < 0) {
                    arg1.field3263.method686(-1);
                }
                arg0 = arg1.field3269 / var4;
            }
        }
        int var6 = -39 % ((46 - arg2) / 38);
        field3603++;
        arg1.field3263.method683(arg0);
    }

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "(I)V")
    public static final void method1719(int arg0) {
        int var1 = -94 / ((arg0 + 28) / 58);
        class316.field4288 = null;
        class102.field1508 = null;
        field3586++;
    }

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "(I)V")
    public static final void method1720(int arg0) {
        class387.field5450.method211(((float) class73.field1095 * 0.1F + 0.7F) * 1.1523438F);
        if (arg0 == 2070) {
            field3596++;
            class387.field5450.method151(class124.field1731, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
            class387.field5450.method100(class194.field2783, -1);
            class387.field5450.method170(class6.field41);
        }
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)V")
    public final void method683(int arg0) {
        field3591++;
        this.field3601.method683(arg0);
        for (class236 var2 = (class236) this.field3595.method1240((byte) -90); var2 != null; var2 = (class236) this.field3595.method1245(1)) {
            if (!this.field3583.method2503(true, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field3276 >= var3) {
                        this.method1718(var3, var2, (byte) -109);
                        var2.field3276 -= var3;
                        break;
                    }
                    this.method1718(var2.field3276, var2, (byte) 113);
                    var3 -= var2.field3276;
                } while (!this.field3583.method2491(var3, 0, 14843, var2, (int[]) null));
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method1721(String arg0, byte arg1) {
        if (arg1 != -80) {
            return null;
        }
        field3589++;
        String var2 = class40.method392(class14.method70((byte) 127, arg0), (byte) 111);
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "()I")
    public final int method687() {
        field3600++;
        return 0;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lrk;ILpg;)V")
    public static final void method1722(class427 arg0, int arg1, class112 arg2) {
        int var3 = -57 % ((arg1 + 48) / 42);
        class370.field5129 = arg2;
        class88.field1308 = arg0;
        field3588++;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BI)[B")
    public static final byte[] method1723(byte arg0, int arg1) {
        field3587++;
        class153 var2 = (class153) class443.field6388.method361((long) arg1, (byte) 92);
        if (arg0 != 99) {
            method1715((byte[]) null, -15, -71, 78);
        }
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class283.method1785((byte) 23, var7, var4);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class153(var3);
            class443.field6388.method360(false, var2, (long) arg1);
        }
        return var2.field2325;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "([III)V")
    public final void method713(int[] arg0, int arg1, int arg2) {
        field3602++;
        this.field3601.method713(arg0, arg1, arg2);
        for (class236 var4 = (class236) this.field3595.method1240((byte) -122); var4 != null; var4 = (class236) this.field3595.method1245(1)) {
            if (!this.field3583.method2503(true, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3276) {
                        this.method1714(var4, arg0, var5 + var6, 19720, var6, var5);
                        var4.field3276 -= var6;
                        break;
                    }
                    this.method1714(var4, arg0, var5 + var6, 19720, var4.field3276, var5);
                    var6 -= var4.field3276;
                    var5 += var4.field3276;
                } while (!this.field3583.method2491(var6, var5, 14843, var4, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lka;)V")
    public class267(class407 arg0) {
        this.field3583 = arg0;
    }
}
