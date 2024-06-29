import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class339 {

    @OriginalMember(owner = "client!me", name = "i", descriptor = "J")
    public long field5406 = 0L;

    @OriginalMember(owner = "client!me", name = "n", descriptor = "I")
    public static int field5411 = 0;

    @OriginalMember(owner = "client!me", name = "o", descriptor = "[[[I")
    public static int[][][] field5412 = new int[2][][];

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public int field5398;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public int field5399;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    public int field5401;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public static int field5402;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    public int field5403;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "I")
    public int field5404;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "I")
    public int field5405;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "I")
    public static int field5407;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "I")
    public static int field5408;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "I")
    public static int field5409;

    @OriginalMember(owner = "client!me", name = "p", descriptor = "I")
    public static int field5413;

    @OriginalMember(owner = "client!me", name = "q", descriptor = "I")
    public static int field5414;

    @OriginalMember(owner = "client!me", name = "r", descriptor = "I")
    public int field5415;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "Lhd;")
    public class161 field5400;

    @OriginalMember(owner = "client!me", name = "m", descriptor = "Lhd;")
    public class161 field5410;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V", line = 11)
    public static final void method2380(byte arg0) {
        int var1 = -25 / ((arg0 - 43) / 57);
        class36.field535.method1686(-110);
        class152.field2417 = 1;
        field5414++;
        class135.field2259 = null;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V", line = 23)
    public static void method2381(int arg0) {
        if (arg0 >= -14) {
            field5411 = -35;
        }
        field5412 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ZB)V", line = 37)
    public static final void method2382(boolean arg0, byte arg1) {
        if (arg1 > -79) {
            return;
        }
        for (class170 var2 = (class170) class314.field4984.method2300((byte) 118); var2 != null; var2 = (class170) class314.field4984.method2306(-23)) {
            if (var2.field2713 != null) {
                class245.field4030.method2163(var2.field2713);
                var2.field2713 = null;
            }
            if (var2.field2698 != null) {
                class245.field4030.method2163(var2.field2698);
                var2.field2698 = null;
            }
            var2.method330(15);
        }
        field5408++;
        if (!arg0) {
            return;
        }
        for (class170 var3 = (class170) class103.field1673.method2300((byte) 118); var3 != null; var3 = (class170) class103.field1673.method2306(-23)) {
            if (var3.field2713 != null) {
                class245.field4030.method2163(var3.field2713);
                var3.field2713 = null;
            }
            var3.method330(15);
        }
        for (class170 var4 = (class170) class243.field3995.method1265(124); var4 != null; var4 = (class170) class243.field3995.method1277((byte) -118)) {
            if (var4.field2713 != null) {
                class245.field4030.method2163(var4.field2713);
                var4.field2713 = null;
            }
            var4.method330(15);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIB)V", line = 115)
    public static final void method2383(int arg0, int arg1, byte arg2) {
        field5407++;
        class321 var3 = class46.method370(1, (byte) -106, arg0);
        if (arg2 != 25) {
            field5411 = 112;
        }
        var3.method2265(false);
        var3.field5112 = arg1;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V", line = 134)
    public static final void method2384(int arg0) {
        field5402++;
        if (class186.field2991 == class101.field1658) {
            return;
        }
        if (class177.method1400((byte) 80, class186.field2991)) {
            class101.field1658 = class186.field2991;
        }
        if (arg0 != 0) {
            method2383(-35, 20, (byte) 53);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ILfc;II)V", line = 155)
    public static final void method2385(int arg0, class288 arg1, int arg2, int arg3) {
        field5413++;
        if (arg3 < 81) {
            field5411 = -86;
        }
        if (arg1.field3547 == arg2 && arg2 != -1) {
            class43 var4 = class198.method1524(arg2, -109);
            int var5 = var4.field668;
            if (var5 == 1) {
                arg1.field3531 = 0;
                arg1.field3517 = 0;
                arg1.field3559 = arg0;
                arg1.field3558 = 0;
                arg1.field3576 = 1;
                class334.method2338(false, arg1.field3577, arg1.field3511, arg1.field3517, (byte) -13, var4);
            }
            if (var5 == 2) {
                arg1.field3531 = 0;
            }
        } else if (arg2 == -1 || arg1.field3547 == -1 || class198.method1524(arg2, -103).field660 >= class198.method1524(arg1.field3547, 89).field660) {
            arg1.field3559 = arg0;
            arg1.field3531 = 0;
            arg1.field3547 = arg2;
            arg1.field3558 = 0;
            arg1.field3576 = 1;
            arg1.field3491 = arg1.field3503;
            arg1.field3517 = 0;
            if (arg1.field3547 != -1) {
                class334.method2338(false, arg1.field3577, arg1.field3511, arg1.field3517, (byte) -13, class198.method1524(arg1.field3547, 122));
            }
        }
    }
}
