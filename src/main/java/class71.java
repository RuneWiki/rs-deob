import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class71 {

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
    private int field1020 = 0;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "Lii;")
    private class250 field1013;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
    public static int field1016 = 1;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "Lec;")
    public static class99 field1018 = new class99(2);

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "I")
    public static int field1019 = 0;

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
    public static int field1022 = 127;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "Lec;")
    public static class99 field1021 = new class99(4);

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "Lma;")
    private class5 field1010;

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "Ljd;")
    public static class95 field1023;

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "[[[I")
    public static int[][][] field1024;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lpa;Lpa;IIZ)I", line = 6)
    public static final int method501(class163 arg0, class163 arg1, int arg2, int arg3, boolean arg4) {
        field1015++;
        if (arg2 == 1) {
            int var6 = arg1.field2731;
            int var7 = arg0.field2731;
            if (!arg4) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var7 == -1) {
                    var7 = 2001;
                }
            }
            return var6 - var7;
        } else if (arg2 == 2) {
            return class299.method2063(arg0.method1223(0).field4818, -1, arg1.method1223(0).field4818, class81.field1197);
        } else if (arg2 == 3) {
            if (arg1.field2639.equals("-")) {
                if (arg0.field2639.equals("-")) {
                    return 0;
                } else if (arg4) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg0.field2639.equals("-")) {
                return arg4 ? 1 : -1;
            } else {
                return class299.method2063(arg0.field2639, -1, arg1.field2639, class81.field1197);
            }
        } else if (arg2 == 4) {
            return arg1.method1279(8) ? (arg0.method1279(8) ? 0 : 1) : (arg0.method1279(8) ? -1 : 0);
        } else if (arg2 == 5) {
            return arg1.method1282((byte) 31) ? (arg0.method1282((byte) 45) ? 0 : 1) : (arg0.method1282((byte) 92) ? -1 : 0);
        } else {
            int var5 = -36 / ((-arg3 - 21) / 54);
            if (arg2 == 6) {
                return arg1.method1280(27494) ? (arg0.method1280(27494) ? 0 : 1) : (arg0.method1280(27494) ? -1 : 0);
            } else if (arg2 == 7) {
                return arg1.method1283(25247) ? (arg0.method1283(25247) ? 0 : 1) : (arg0.method1283(25247) ? -1 : 0);
            } else {
                return arg1.field2647 - arg0.field2647;
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V", line = 74)
    public static final void method502(int arg0) {
        class241.method1673();
        field1014++;
        for (int var1 = arg0; var1 < 4; var1++) {
            class91.field1323[var1].method2386(12908);
        }
        System.gc();
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)I", line = 94)
    public static final int method503(int arg0, int arg1) {
        field1012++;
        if (arg0 < 0) {
            return 0;
        }
        class130 var2 = (class130) class29.field355.method1716(-1, (long) arg0);
        if (var2 == null) {
            return class96.method720(true, arg0).field581;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2.field1995.length; var4++) {
            if (var2.field1995[var4] == -1) {
                var3++;
            }
        }
        if (arg1 == 782) {
            return var3 + (class96.method720(true, arg0).field581 - var2.field1995.length);
        } else {
            return -14;
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)Lma;", line = 130)
    public final class5 method504(int arg0) {
        if (arg0 != -1) {
            method502(-52);
        }
        this.field1020 = 0;
        field1017++;
        return this.method507(true);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)V", line = 142)
    public static void method505(boolean arg0) {
        field1021 = null;
        field1023 = null;
        field1024 = (int[][][]) null;
        if (arg0) {
            field1019 = 87;
        }
        field1018 = null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ICI)C", line = 159)
    public static final char method506(int arg0, char arg1, int arg2) {
        field1009++;
        if ((char) arg2 <= arg1 && arg1 <= 'ÿ') {
            if (arg1 >= 'À' && arg1 <= 'Æ') {
                return 'A';
            }
            if (arg1 == 'Ç') {
                return 'C';
            }
            if (arg1 >= 'È' && arg1 <= 'Ë') {
                return 'E';
            }
            if (arg1 >= 'Ì' && arg1 <= 'Ï') {
                return 'I';
            }
            if (arg1 == 'Ñ' && arg0 != 0) {
                return 'N';
            }
            if (arg1 >= 'Ò' && arg1 <= 'Ö') {
                return 'O';
            }
            if (arg1 >= 'Ù' && arg1 <= 'Ü') {
                return 'U';
            }
            if (arg1 == 'Ý') {
                return 'Y';
            }
            if (arg1 == 'ß') {
                return 's';
            }
            if (arg1 >= 'à' && arg1 <= 'æ') {
                return 'a';
            }
            if (arg1 == 'ç') {
                return 'c';
            }
            if (arg1 >= 'è' && arg1 <= 'ë') {
                return 'e';
            }
            if (arg1 >= 'ì' && arg1 <= 'ï') {
                return 'i';
            }
            if (arg1 == 'ñ' && arg0 != 0) {
                return 'n';
            }
            if (arg1 >= 'ò' && arg1 <= 'ö') {
                return 'o';
            }
            if (arg1 >= 'ù' && arg1 <= 'ü') {
                return 'u';
            }
            if (arg1 == 'ý' || arg1 == 'ÿ') {
                return 'y';
            }
        }
        if (arg1 == 'Œ') {
            return 'O';
        } else if (arg1 == 'œ') {
            return 'o';
        } else if (arg1 == 'Ÿ') {
            return 'Y';
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(Z)Lma;", line = 243)
    public final class5 method507(boolean arg0) {
        if (!arg0) {
            return (class5) null;
        }
        field1011++;
        if (this.field1020 > 0 && this.field1013.field3779[this.field1020 - 1] != this.field1010) {
            class5 var2 = this.field1010;
            this.field1010 = var2.field81;
            return var2;
        }
        class5 var3;
        do {
            if (this.field1013.field3776 <= this.field1020) {
                return null;
            }
            var3 = this.field1013.field3779[this.field1020++].field81;
        } while (this.field1013.field3779[this.field1020 - 1] == var3);
        this.field1010 = var3.field81;
        return var3;
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lii;)V", line = 293)
    public class71(class250 arg0) {
        this.field1013 = arg0;
    }
}
