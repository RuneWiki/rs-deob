import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class155 {

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "Lso;")
    private class330 field2024 = new class330();

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    private int field2020;

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "I")
    private int field2039;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "Lqh;")
    private class50 field2029;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "Lao;")
    public static class191 field2022 = new class191(90, -1);

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "[Z")
    public static boolean[] field2040 = new boolean[8];

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!jd", name = "v", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "Lad;")
    public static class294 field2027;

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field2033;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)I", line = 11)
    public final int method918(byte arg0) {
        field2038++;
        int var2 = -118 % ((arg0 + 36) / 58);
        return this.field2039;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lfr;BLjava/lang/Object;)V", line = 21)
    public final void method919(class284 arg0, byte arg1, Object arg2) {
        if (arg1 < 25) {
            field2022 = null;
        }
        this.method926(1, 0, arg0, arg2);
        field2041++;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)V", line = 35)
    public final void method920(byte arg0) {
        this.field2024.method1933(-2);
        field2028++;
        this.field2029.method293((byte) 74);
        this.field2039 = this.field2020;
        if (arg0 != 14) {
            this.method918((byte) 39);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lfr;B)Ljava/lang/Object;", line = 48)
    public final Object method921(class284 arg0, byte arg1) {
        field2025++;
        long var3 = arg0.method1030(true);
        for (class95 var5 = (class95) this.field2029.method295(var3, -116); var5 != null; var5 = (class95) this.field2029.method297((byte) 126)) {
            if (var5.field1145.method1029(arg0, (byte) 105)) {
                Object var6 = var5.method531((byte) 26);
                if (var6 != null) {
                    if (var5.method532(0)) {
                        class372 var7 = new class372(arg0, var6, var5.field1141);
                        this.field2029.method291(var5.field6348, var7, -98);
                        this.field2024.method1938(true, var7);
                        var7.field7348 = 0L;
                        var5.method2674(true);
                        var5.method3022((byte) 54);
                    } else {
                        this.field2024.method1938(true, var5);
                        var5.field7348 = 0L;
                    }
                    return var6;
                }
                var5.method2674(true);
                var5.method3022((byte) 54);
                this.field2039 += var5.field1141;
            }
        }
        if (arg1 != -109) {
            field2033 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILfr;)V", line = 101)
    private final void method922(int arg0, class284 arg1) {
        field2023++;
        long var3 = arg1.method1030(true);
        class95 var5 = (class95) this.field2029.method295(var3, -95);
        int var6 = -19 / ((-arg0 - 2) / 33);
        while (var5 != null) {
            if (var5.field1145.method1029(arg1, (byte) 105)) {
                this.method924((byte) 103, var5);
                return;
            }
            var5 = (class95) this.field2029.method297((byte) 126);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V", line = 128)
    public static void method923(int arg0) {
        field2022 = null;
        field2027 = null;
        field2040 = null;
        if (arg0 != -3652) {
            field2026 = 4;
        }
        field2033 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BLhc;)V", line = 149)
    private final void method924(byte arg0, class95 arg1) {
        if (arg0 <= 73) {
            return;
        }
        field2036++;
        if (arg1 != null) {
            arg1.method2674(true);
            arg1.method3022((byte) 54);
            this.field2039 += arg1.field1141;
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V", line = 166)
    public final void method925(int arg0) {
        field2034++;
        for (class95 var2 = (class95) this.field2024.method1937(false); var2 != null; var2 = (class95) this.field2024.method1932(-2)) {
            if (var2.method532(0)) {
                var2.method2674(true);
                var2.method3022((byte) 54);
                this.field2039 += var2.field1141;
            }
        }
        if (arg0 != 2000) {
            this.method921(null, (byte) 7);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IILfr;Ljava/lang/Object;)V", line = 192)
    private final void method926(int arg0, int arg1, class284 arg2, Object arg3) {
        field2032++;
        if (this.field2020 < arg0) {
            throw new IllegalStateException("s>cs");
        }
        this.method922(-51, arg2);
        this.field2039 -= arg0;
        while (this.field2039 < 0) {
            class95 var6 = (class95) this.field2024.method1934((byte) -47);
            this.method924((byte) 101, var6);
        }
        class372 var5 = new class372(arg2, arg3, arg0);
        this.field2029.method291(arg2.method1030(true), var5, arg1 ^ 0xFFFFFFAE);
        this.field2024.method1938(true, var5);
        var5.field7348 = arg1;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IB)V", line = 219)
    public final void method927(int arg0, byte arg1) {
        if (class237.field3159 != null) {
            for (class95 var3 = (class95) this.field2024.method1937(false); var3 != null; var3 = (class95) this.field2024.method1932(-2)) {
                if (var3.method532(0)) {
                    if (var3.method531((byte) 26) == null) {
                        var3.method2674(true);
                        var3.method3022((byte) 54);
                        this.field2039 += var3.field1141;
                    }
                } else if (++var3.field7348 > (long) arg0) {
                    class95 var4 = class237.field3159.method1124((byte) 39, var3);
                    this.field2029.method291(var3.field6348, var4, -73);
                    class445.method2748(var3, var4, 29359);
                    var3.method2674(true);
                    var3.method3022((byte) 54);
                }
            }
        }
        if (arg1 >= -46) {
            this.field2020 = 53;
        }
        field2030++;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(CII)C", line = 275)
    public static final char method928(char arg0, int arg1, int arg2) {
        field2031++;
        if (arg0 >= 'À' && arg0 <= 'ÿ') {
            if (arg0 >= 'À' && arg0 <= 'Æ') {
                return 'A';
            }
            if (arg0 == 'Ç') {
                return 'C';
            }
            if (arg0 >= 'È' && arg0 <= 'Ë') {
                return 'E';
            }
            if (arg0 >= 'Ì' && arg0 <= 'Ï') {
                return 'I';
            }
            if (arg0 == 'Ñ' && arg2 != 0) {
                return 'N';
            }
            if (arg0 >= 'Ò' && arg0 <= 'Ö') {
                return 'O';
            }
            if (arg0 >= 'Ù' && arg0 <= 'Ü') {
                return 'U';
            }
            if (arg0 == 'Ý') {
                return 'Y';
            }
            if (arg0 == 'ß') {
                return 's';
            }
            if (arg0 >= 'à' && arg0 <= 'æ') {
                return 'a';
            }
            if (arg0 == 'ç') {
                return 'c';
            }
            if (arg0 >= 'è' && arg0 <= 'ë') {
                return 'e';
            }
            if (arg0 >= 'ì' && arg0 <= 'ï') {
                return 'i';
            }
            if (arg0 == 'ñ' && arg2 != 0) {
                return 'n';
            }
            if (arg0 >= 'ò' && arg0 <= 'ö') {
                return 'o';
            }
            if (arg0 >= 'ù' && arg0 <= 'ü') {
                return 'u';
            }
            if (arg0 == 'ý' || arg0 == 'ÿ') {
                return 'y';
            }
        }
        if (arg0 == 'Œ') {
            return 'O';
        } else if (arg0 == 'œ') {
            return 'o';
        } else if (arg0 == 'Ÿ') {
            return 'Y';
        } else {
            if (arg1 <= 27) {
                method923(-27);
            }
            return arg0;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lfo;I)V", line = 359)
    public static final void method929(class361 arg0, int arg1) {
        if (arg1 != -247) {
            field2026 = 106;
        }
        class35.field351 = arg0;
        field2021++;
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(B)I", line = 370)
    public final int method930(byte arg0) {
        int var2 = -108 / ((arg0 + 54) / 58);
        field2035++;
        return this.field2020;
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(I)V", line = 385)
    public class155(int arg0) {
        this.field2020 = arg0;
        this.field2039 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field2029 = new class50(var2);
    }
}
