import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class137 {

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
    public int field2242;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
    public int field2246;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public int field2240;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public int field2238;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field2235 = 0;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "Lsc;")
    public static class181 field2241 = class149.method967(255, "::tele ");

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public static int field2236 = 0;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public static int field2237 = 0;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
    public static int field2249 = 0;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "Lsc;")
    public static class181 field2244 = class149.method967(255, "::gc");

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "[I")
    public static int[] field2252 = new int[100];

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "Lsc;")
    public static class181 field2251 = class149.method967(255, " steht bereits auf Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "J")
    public static long field2250;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "Ljb;")
    public static class11 field2239;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "Ljb;")
    public static class11 field2245;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
    public static final void method882(byte arg0) {
        field2247++;
        int var1 = 50 / ((arg0 + 27) / 46);
        class198.field3434.method1790(0);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)I")
    public static final int method883(int arg0, int arg1) {
        field2234++;
        if (!(arg0 < 65 || arg0 > 90) || !(arg0 < 192 || arg0 > 222 || arg0 == 215)) {
            return arg0 + 32;
        }
        if (arg1 != 19284) {
            method884(12, -70, 36, 98, -4, 103);
        }
        if (arg0 == 159) {
            return 255;
        } else if (arg0 == 140) {
            return 156;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIIII)V")
    public static final void method884(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2243++;
        if (arg0 != -28282) {
            field2252 = null;
        }
        if (arg1 == arg2) {
            class239.method1634(arg4, 1, arg5, arg1, arg3);
        } else if (class11.field219 <= arg3 - arg1 && arg1 + arg3 <= class124.field2032 && (arg4 - arg2) >= class23.field408 && class125.field2056 >= (arg2 + arg4)) {
            class31.method251(arg2, 101, arg3, arg1, arg4, arg5);
        } else {
            class160.method1072(arg5, arg2, (byte) 117, arg4, arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IZJ[I)Lsc;")
    public static final class181 method885(int arg0, boolean arg1, long arg2, int[] arg3) {
        field2248++;
        if (class201.field3467 != null) {
            class181 var5 = class201.field3467.method285(arg2, arg0, 6, arg3);
            if (var5 != null) {
                return var5;
            }
        }
        if (!arg1) {
            field2237 = -54;
        }
        return arg0 == 5 ? class19.method184(-26890, arg2).method1223((byte) -57) : class222.method1471(arg2, (byte) -92);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)V")
    public static void method886(boolean arg0) {
        field2239 = null;
        field2252 = null;
        field2241 = null;
        field2251 = null;
        field2245 = null;
        field2244 = null;
        if (arg0) {
            field2251 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V")
    public class137() {
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lsb;)V")
    public class137(class137 arg0) {
        this.field2242 = arg0.field2242;
        this.field2246 = arg0.field2246;
        this.field2240 = arg0.field2240;
        this.field2238 = arg0.field2238;
    }
}
