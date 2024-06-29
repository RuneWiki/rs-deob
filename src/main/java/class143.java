import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class143 {

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "Ln;")
    private class229 field2284;

    @OriginalMember(owner = "client!bl", name = "m", descriptor = "Ltl;")
    private class252 field2287;

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "Laa;")
    private class43 field2279;

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "I")
    public static int field2276 = 0;

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "Lmh;")
    private static class62 field2280 = class201.method1405(true, "shake:");

    @OriginalMember(owner = "client!bl", name = "o", descriptor = "Lmh;")
    public static class62 field2289 = field2280;

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "Lmh;")
    public static class62 field2281 = class201.method1405(true, "<col=ff3000>");

    @OriginalMember(owner = "client!bl", name = "n", descriptor = "Lmh;")
    public static class62 field2288 = field2280;

    @OriginalMember(owner = "client!bl", name = "r", descriptor = "I")
    public static int field2292 = 0;

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "Lmh;")
    public static class62 field2285 = class201.method1405(true, "Benutzeroberfl-=che geladen)3");

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!bl", name = "p", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!bl", name = "q", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!bl", name = "s", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!bl", name = "t", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!bl", name = "u", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "Lmi;")
    private class92 field2286;

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "[Lfh;")
    private class112[] field2277;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "[S")
    public static short[] field2275;

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "[[[I")
    public static int[][][] field2283;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;", line = 11)
    public static final Class method1052(String arg0, int arg1) throws ClassNotFoundException {
        field2278++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        }
        if (arg1 <= 30) {
            field2281 = (class62) null;
        }
        if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else if (arg0.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg0);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)Z", line = 63)
    public final boolean method1053(byte arg0) {
        field2295++;
        if (this.field2286 != null) {
            return true;
        }
        if (this.field2279 == null) {
            if (this.field2287.method1760((byte) -112)) {
                return false;
            }
            this.field2279 = this.field2287.method1749(true, 255, (byte) 0, 255, -4);
        }
        if (this.field2279.field1706) {
            return false;
        }
        if (arg0 <= 43) {
            this.method1058((class177) null, 82, false, 83, (class177) null);
        }
        this.field2286 = new class92(this.field2279.method288(true));
        this.field2277 = new class112[(this.field2286.field1495.length - 5) / 8];
        return true;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILna;III)V", line = 96)
    public static final void method1054(int arg0, class153 arg1, int arg2, int arg3, int arg4) {
        field2282++;
        if (class268.field4551 == arg1 || class195.field3293 >= 400) {
            return;
        }
        class62 var5;
        if (arg1.field2432 == 0) {
            var5 = class254.method1772(new class62[] { arg1.method1105((byte) 105), class262.method1811(3040, arg1.field2441, class268.field4551.field2441), class260.field4374, class91.field1460, class42.method284(arg1.field2441, -117), class101.field1667 }, 0);
        } else {
            var5 = class254.method1772(new class62[] { arg1.method1105((byte) 105), class260.field4374, class245.field4174, class42.method284(arg1.field2432, -117), class101.field1667 }, 0);
        }
        if (class263.field4429 == 1) {
            class103.field1693++;
            class39.method268(true, arg2, arg4, class73.field1113, (short) 41, (long) arg0, class254.method1772(new class62[] { class216.field3671, class163.field2650, var5 }, arg3 ^ 0x0));
        } else if (!class106.field1728) {
            for (int var6 = 7; var6 >= 0; var6--) {
                if (class205.field3473[var6] != null) {
                    class260.field4380++;
                    boolean var7 = false;
                    short var8 = 0;
                    if (class131.field2132 == 0 && class205.field3473[var6].method436(class102.field1679, 32)) {
                        if (class268.field4551.field2441 < arg1.field2441) {
                            var8 = 2000;
                        }
                        if (class268.field4551.field2446 != 0 && arg1.field2446 != 0) {
                            if (class268.field4551.field2446 == arg1.field2446) {
                                var8 = 2000;
                            } else {
                                var8 = 0;
                            }
                        }
                    } else if (class291.field4945[var6]) {
                        var8 = 2000;
                    }
                    short var9 = class296.field5060[var6];
                    short var10 = (short) (var8 + var9);
                    class39.method268(true, arg2, arg4, class205.field3473[var6], var10, (long) arg0, class254.method1772(new class62[] { class16.field141, var5 }, 0));
                }
            }
        } else if ((class141.field2271 & 0x8) == 8) {
            class201.field3405++;
            class39.method268(true, arg2, arg4, class121.field2015, (short) 11, (long) arg0, class254.method1772(new class62[] { class281.field4805, class163.field2650, var5 }, 0));
        }
        for (int var11 = arg3; var11 < class195.field3293; var11++) {
            if (class286.field4892[var11] == 5) {
                class244.field4151[var11] = class254.method1772(new class62[] { class16.field141, var5 }, 0);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z)V", line = 194)
    public final void method1055(boolean arg0) {
        field2291++;
        if (this.field2277 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field2277.length; var2++) {
            if (this.field2277[var2] != null) {
                this.field2277[var2].method872(-23);
            }
        }
        int var3 = 0;
        if (arg0) {
            return;
        }
        while (this.field2277.length > var3) {
            if (this.field2277[var3] != null) {
                this.field2277[var3].method871((byte) 121);
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILpb;Lpb;B)Lfh;", line = 249)
    public final class112 method1056(int arg0, class177 arg1, class177 arg2, byte arg3) {
        field2290++;
        if (arg3 != 0) {
            this.method1053((byte) -124);
        }
        return this.method1058(arg1, arg0, true, 5, arg2);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(III)Lbk;", line = 262)
    public static final class54 method1057(int arg0, int arg1, int arg2) {
        class166 var3 = class256.field4320[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2706;
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Ltl;Ln;)V", line = 272)
    public class143(class252 arg0, class229 arg1) {
        this.field2284 = arg1;
        this.field2287 = arg0;
        if (!this.field2287.method1760((byte) -114)) {
            this.field2279 = this.field2287.method1749(true, 255, (byte) 0, 255, -4);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lpb;IZILpb;)Lfh;", line = 289)
    private final class112 method1058(class177 arg0, int arg1, boolean arg2, int arg3, class177 arg4) {
        field2294++;
        if (this.field2286 == null) {
            throw new RuntimeException();
        }
        this.field2286.field1476 = arg1 * 8 + arg3;
        if (this.field2286.field1495.length <= this.field2286.field1476) {
            throw new RuntimeException();
        } else if (this.field2277[arg1] == null) {
            int var6 = this.field2286.method704(1509947792);
            int var7 = this.field2286.method704(arg3 ^ 0x59FFF995);
            class112 var8 = new class112(arg1, arg0, arg4, this.field2287, this.field2284, var6, var7, arg2);
            this.field2277[arg1] = var8;
            return var8;
        } else {
            return this.field2277[arg1];
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V", line = 332)
    public static void method1059(int arg0) {
        field2285 = null;
        field2283 = (int[][][]) null;
        int var1 = -82 % ((67 - arg0) / 35);
        field2288 = null;
        field2281 = null;
        field2280 = null;
        field2275 = null;
        field2289 = null;
    }
}
