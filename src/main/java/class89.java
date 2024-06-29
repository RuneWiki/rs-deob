import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class89 {

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    public static int field2149 = 3353893;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "Lwb;")
    public static class130 field2154 = class26.method212("Schlie-8en", -32376);

    @OriginalMember(owner = "client!oe", name = "z", descriptor = "Lwb;")
    public static class130 field2170 = class26.method212("lila:", -32376);

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public int field2145;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public int field2146;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public int field2147;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public int field2150;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public int field2151;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
    public int field2152;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public int field2153;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "I")
    public int field2158;

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "I")
    public int field2160;

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "I")
    public static int field2161;

    @OriginalMember(owner = "client!oe", name = "r", descriptor = "I")
    public int field2162;

    @OriginalMember(owner = "client!oe", name = "s", descriptor = "I")
    public int field2163;

    @OriginalMember(owner = "client!oe", name = "t", descriptor = "I")
    public int field2164;

    @OriginalMember(owner = "client!oe", name = "u", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!oe", name = "v", descriptor = "I")
    public int field2166;

    @OriginalMember(owner = "client!oe", name = "w", descriptor = "I")
    public int field2167;

    @OriginalMember(owner = "client!oe", name = "x", descriptor = "I")
    public int field2168;

    @OriginalMember(owner = "client!oe", name = "y", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!oe", name = "A", descriptor = "I")
    public int field2171;

    @OriginalMember(owner = "client!oe", name = "C", descriptor = "I")
    public int field2172;

    @OriginalMember(owner = "client!oe", name = "D", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!oe", name = "E", descriptor = "I")
    public int field2174;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(JB)V", line = 8)
    public static final void method657(long arg0, byte arg1) {
        if (arg1 != -33) {
            method658(null, null);
        }
        field2159++;
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class35.field993; var3++) {
            if (class4.field164[var3] == arg0) {
                class35.field993--;
                class20.field585 = true;
                class23.field662++;
                for (int var4 = var3; var4 < class35.field993; var4++) {
                    class79.field1915[var4] = class79.field1915[var4 + 1];
                    class14.field410[var4] = class14.field410[var4 + 1];
                    class4.field164[var4] = class4.field164[var4 + 1];
                }
                class14.field406.method727(139, -102);
                class14.field406.method344(arg0, arg1 - 1652311735);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Leb;", line = 55)
    public static final class27 method658(Throwable arg0, String arg1) {
        field2169++;
        class27 var2;
        if (arg0 instanceof class27) {
            var2 = (class27) arg0;
            var2.field783 = var2.field783 + ' ' + arg1;
        } else {
            var2 = new class27(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V", line = 86)
    public static final void method659(int arg0) {
        class14.field411 = 0;
        if (arg0 != -3119) {
            method662(99);
        }
        field2165++;
        int var1 = (class42.field1179.field2071 >> 7) + class129.field3045;
        int var2 = (class42.field1179.field2128 >> 7) + class42.field1172;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class14.field411 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class14.field411 = 1;
        }
        if (class14.field411 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class14.field411 = 0;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lk;Lk;ILk;)V", line = 111)
    public static final void method660(class60 arg0, class60 arg1, int arg2, class60 arg3) {
        class22.field645 = arg1;
        class99.field2384 = arg0;
        field2173++;
        class51.field1346 = arg3;
        class105.field2549 = new class3[class22.field645.method493(56)][];
        class45.field1211 = new boolean[class22.field645.method493(118)];
        int var4 = -18 / ((-arg2 - 74) / 51);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIB)I", line = 126)
    public static final int method661(int arg0, int arg1, int arg2, byte arg3) {
        field2155++;
        if (arg2 > 179) {
            arg1 /= 2;
        }
        if (arg2 > 192) {
            arg1 /= 2;
        }
        if (arg2 > 217) {
            arg1 /= 2;
        }
        if (arg2 > 243) {
            arg1 /= 2;
        }
        if (arg3 != -32) {
            method658(null, null);
        }
        return (arg1 / 32 << 7) + (arg0 / 4 << 10) + arg2 / 2;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)V", line = 165)
    public static void method662(int arg0) {
        field2154 = null;
        field2170 = null;
        if (arg0 != 31782) {
            method661(27, 74, -118, (byte) 5);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IB)Lo;", line = 184)
    public static final class84 method663(int arg0, byte arg1) {
        field2157++;
        class84 var2 = (class84) class123.field2985.method402((long) arg0, -120);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class22.field639.method508(arg0, 0, 9);
        class84 var4 = new class84();
        var4.field2009 = arg0;
        if (var3 != null) {
            var4.method636(new class36(var3), 0);
        }
        var4.method631((byte) 7);
        if (arg1 == -6) {
            class123.field2985.method403((long) arg0, var4, (byte) -101);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IILk;I)Lec;", line = 226)
    public static final class28 method664(int arg0, int arg1, class60 arg2, int arg3) {
        field2161++;
        if (class24.method210(arg2, (byte) 125, arg0, arg3)) {
            return arg1 < 38 ? null : class96.method717(2);
        } else {
            return null;
        }
    }
}
