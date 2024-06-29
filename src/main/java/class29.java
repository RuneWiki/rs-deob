import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class29 {

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "Lrc;")
    public static class105 field652 = class43.method374("und haben es deaktiviert)3 Benutzen Sie die", 0);

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "Lle;")
    public static class71 field656 = new class71(64);

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "Lrc;")
    private static class105 field664 = class43.method374("Try again in 60 secs)3)3)3", 0);

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "Lrc;")
    public static class105 field663 = class43.method374("@yel@*V", 0);

    @OriginalMember(owner = "client!ed", name = "t", descriptor = "Lrc;")
    private static class105 field667 = class43.method374("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ", 0);

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "Lrc;")
    public static class105 field659 = field667;

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "Lrc;")
    public static class105 field666 = field664;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "Lrc;")
    public static class105 field661 = null;

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "Lrc;")
    public static class105 field669 = class43.method374("Schrifts-=tze geladen)3", 0);

    @OriginalMember(owner = "client!ed", name = "w", descriptor = "Z")
    public static boolean field670 = false;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    public static int field657 = -1;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "Lbd;")
    public static class11 field660;

    @OriginalMember(owner = "client!ed", name = "u", descriptor = "[I")
    public static int[] field668;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)Z", line = 5)
    public static final boolean method273(int arg0, int arg1) {
        field665++;
        if (class73.field1611[arg0]) {
            return true;
        } else if (class96.field2219.method755(arg0, 0)) {
            int var2 = class96.field2219.method749(0, arg0);
            if (var2 == 0) {
                class73.field1611[arg0] = true;
                return true;
            }
            if (class14.field282[arg0] == null) {
                class14.field282[arg0] = new class119[var2];
            }
            int var3 = 0;
            if (arg1 <= 9) {
                field668 = null;
            }
            while (var2 > var3) {
                if (class14.field282[arg0][var3] == null) {
                    byte[] var4 = class96.field2219.method766(var3, (byte) -45, arg0);
                    if (var4 != null) {
                        class14.field282[arg0][var3] = new class119();
                        class14.field282[arg0][var3].field2867 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            class14.field282[arg0][var3].method967(new class7(var4), false);
                        } else {
                            class14.field282[arg0][var3].method966(new class7(var4), -65536);
                        }
                    }
                }
                var3++;
            }
            class73.field1611[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZII)I", line = 79)
    public static final int method274(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg2 > 179) {
            arg3 /= 2;
        }
        if (arg2 > 192) {
            arg3 /= 2;
        }
        field654++;
        if (arg2 > 217) {
            arg3 /= 2;
        }
        if (arg1) {
            field663 = null;
        }
        if (arg2 > 243) {
            arg3 /= 2;
        }
        return arg2 / 2 + (arg0 / 4 << 10) + (arg3 / 32 << 7);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lpb;Lpb;Lpb;I)V", line = 107)
    public static final void method275(class92 arg0, class92 arg1, class92 arg2, int arg3) {
        class96.field2219 = arg2;
        class89.field2050 = arg0;
        class43.field976 = arg1;
        class14.field282 = new class119[class96.field2219.method754(arg3 - 29609)][];
        class73.field1611 = new boolean[class96.field2219.method754(46)];
        field658++;
        if (arg3 != 29655) {
            field660 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(II)Z", line = 135)
    public static final boolean method276(int arg0, int arg1) {
        field651++;
        if (arg0 >= 97 && arg0 <= 122) {
            return true;
        } else if (arg0 >= 65 && arg0 <= 90) {
            return true;
        } else if (arg0 >= 48 && arg0 <= 57) {
            return true;
        } else {
            if (arg1 != 30952) {
                method278(true, false, -112);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lpb;Z)V", line = 176)
    public static final void method277(class92 arg0, boolean arg1) {
        if (!arg1) {
            field648++;
            class127.field3101 = arg0;
            class111.field2575 = class127.field3101.method749(0, 16);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZZI)I", line = 188)
    public static final int method278(boolean arg0, boolean arg1, int arg2) {
        if (arg2 != 17752) {
            return 105;
        }
        int var3 = 0;
        field649++;
        if (arg1) {
            var3 += class61.field1347 + class110.field2526;
        }
        if (arg0) {
            var3 += class12.field240 + class10.field209;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)V", line = 219)
    public static final void method279(boolean arg0) {
        class125.field3043.method602((byte) -70);
        class118.field2766.method602((byte) -70);
        if (!arg0) {
            field653++;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V", line = 235)
    public static void method280(byte arg0) {
        field656 = null;
        field661 = null;
        field659 = null;
        field652 = null;
        if (arg0 > -111) {
            method278(true, false, 79);
        }
        field668 = null;
        field663 = null;
        field660 = null;
        field664 = null;
        field669 = null;
        field667 = null;
        field666 = null;
    }
}
