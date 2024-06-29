import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class157 {

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "Le;")
    public static class170 field2400 = new class170(0, -1);

    @OriginalMember(owner = "client!ab", name = "y", descriptor = "[J")
    public static long[] field2424 = new long[100];

    @OriginalMember(owner = "client!ab", name = "A", descriptor = "I")
    public static int field2426 = 0;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public int field2402;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    public int field2403;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public int field2404;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    public int field2405;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
    public int field2406;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    public int field2407;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
    public int field2408;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "I")
    public int field2409;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
    public int field2410;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
    public int field2411;

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "I")
    public int field2412;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
    public int field2413;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
    public int field2414;

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
    public int field2415;

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "I")
    public int field2416;

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "I")
    public int field2417;

    @OriginalMember(owner = "client!ab", name = "s", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!ab", name = "t", descriptor = "I")
    public int field2419;

    @OriginalMember(owner = "client!ab", name = "u", descriptor = "I")
    public int field2420;

    @OriginalMember(owner = "client!ab", name = "w", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!ab", name = "x", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!ab", name = "z", descriptor = "[Ln;")
    public static class298[] field2425;

    @OriginalMember(owner = "client!ab", name = "v", descriptor = "[[Lkd;")
    public static class83[][] field2421;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IZ)V", line = 13)
    public static final void method1088(int arg0, boolean arg1) {
        field2418++;
        if (arg0 == 0) {
            return;
        }
        if (arg0 == 1) {
            class154.method1075((byte) -40);
        } else if (arg0 == 2) {
            class302.method2109(true);
        } else if (arg0 == 3) {
            class112.method776(0);
        } else {
            throw new RuntimeException();
        }
        if (!arg1) {
            field2422 = -68;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIIIIII)V", line = 50)
    public static final void method1089(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = arg0 - arg6;
        field2401++;
        int var10 = arg3 - arg8;
        int var11 = (arg4 - arg7 << 16) / var9;
        int var12 = (arg5 - arg1 << 16) / var10;
        if (arg2 == -29904368) {
            class90.method647(arg3, arg8, arg7, 0, var12, (byte) 73, arg1, var11, 0, arg6, arg0);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V", line = 82)
    public static void method1090(byte arg0) {
        field2424 = null;
        field2425 = null;
        field2421 = (class83[][]) null;
        int var1 = -45 / ((arg0 + 59) / 39);
        field2400 = null;
    }
}
