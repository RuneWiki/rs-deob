import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class118 {

    @OriginalMember(owner = "client!r", name = "k", descriptor = "Lsa;")
    private class121 field2903 = new class121();

    @OriginalMember(owner = "client!r", name = "p", descriptor = "Ljf;")
    private class68 field2908 = new class68();

    @OriginalMember(owner = "client!r", name = "s", descriptor = "I")
    private int field2911;

    @OriginalMember(owner = "client!r", name = "x", descriptor = "I")
    private int field2916;

    @OriginalMember(owner = "client!r", name = "t", descriptor = "Lrd;")
    private class119 field2912;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "[[I")
    public static int[][] field2898 = new int[104][104];

    @OriginalMember(owner = "client!r", name = "d", descriptor = "Loc;")
    public static class99 field2896 = class48.method402((byte) -104, "Duell akzeptieren");

    @OriginalMember(owner = "client!r", name = "h", descriptor = "Loc;")
    public static class99 field2900 = class48.method402((byte) -104, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!r", name = "n", descriptor = "Loc;")
    public static class99 field2906 = class48.method402((byte) -104, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!r", name = "w", descriptor = "I")
    public static int field2915 = 0;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!r", name = "o", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!r", name = "r", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!r", name = "u", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!r", name = "v", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "J")
    public static long field2894;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "J")
    public static long field2901;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "Lwe;")
    public static class150 field2904;

    @OriginalMember(owner = "client!r", name = "q", descriptor = "Ldc;")
    public static class24 field2909;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BLta;)V")
    public static final void method992(byte arg0, class127 arg1) {
        field2893++;
        if (arg1.field3102 == 0) {
            arg1.field3064 = 1024;
        }
        if (arg1.field3102 == 1) {
            arg1.field3064 = 1536;
        }
        int var2 = arg1.field3119 * 64 + arg1.field3095 * 128;
        int var3 = arg1.field3074 - class101.field2444;
        if (arg1.field3102 == 2) {
            arg1.field3064 = 0;
        }
        if (arg0 >= -113) {
            field2901 = 28L;
        }
        arg1.field3077 += (var2 - arg1.field3077) / var3;
        arg1.field3118 = 0;
        int var4 = arg1.field3119 * 64 + arg1.field3063 * 128;
        if (arg1.field3102 == 3) {
            arg1.field3064 = 512;
        }
        arg1.field3115 += (var4 - arg1.field3115) / var3;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BJLsa;)V")
    public final void method993(byte arg0, long arg1, class121 arg2) {
        if (this.field2916 == 0) {
            class121 var5 = this.field2908.method600((byte) -16);
            var5.method394((byte) 84);
            var5.method1010((byte) 45);
            if (this.field2903 == var5) {
                class121 var6 = this.field2908.method600((byte) -59);
                var6.method394((byte) -43);
                var6.method1010((byte) 45);
            }
        } else {
            this.field2916--;
        }
        this.field2912.method1006(arg1, arg2, -128);
        if (arg0 != 100) {
            field2906 = null;
        }
        field2902++;
        this.field2908.method595(arg0 ^ 0xFFFFFFA0, arg2);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lpc;ILpc;)V")
    public static final void method994(class105 arg0, int arg1, class105 arg2) {
        if (arg1 == 1536) {
            field2907++;
            class47.field1156 = arg0;
            class70.field1789 = arg2;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
    public static void method995(int arg0) {
        if (arg0 > -16) {
            return;
        }
        field2909 = null;
        field2904 = null;
        field2896 = null;
        field2898 = null;
        field2900 = null;
        field2906 = null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ZII)V")
    public static final void method996(boolean arg0, int arg1, int arg2) {
        field2914++;
        int[] var3 = new int[4];
        var3[0] = arg2;
        if (!arg0) {
            field2905 = 64;
        }
        int[] var4 = new int[4];
        int var5 = 1;
        var4[0] = arg1;
        for (int var6 = 0; var6 < 4; var6++) {
            if (class127.field3061[var6] != arg2) {
                var3[var5] = class127.field3061[var6];
                var4[var5] = class86.field2141[var6];
                var5++;
            }
        }
        class127.field3061 = var3;
        class86.field2141 = var4;
        class1.method1(class5.field104, (byte) -12, class5.field104.length - 1, class127.field3061, 0, class86.field2141);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IJ)Lsa;")
    public final class121 method997(int arg0, long arg1) {
        field2897++;
        class121 var4 = (class121) this.field2912.method1001(arg1, (byte) 74);
        if (var4 != null) {
            this.field2908.method595(-30, var4);
        }
        return arg0 == -1 ? var4 : null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V")
    public final void method998(boolean arg0) {
        field2910++;
        while (true) {
            class121 var2 = this.field2908.method600((byte) 106);
            if (var2 == null) {
                this.field2916 = this.field2911;
                if (arg0) {
                    return;
                } else {
                    method992((byte) -74, null);
                    return;
                }
            }
            var2.method394((byte) 100);
            var2.method1010((byte) 45);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILve;[BI)V")
    public static final void method999(int arg0, class144 arg1, byte[] arg2, int arg3) {
        field2899++;
        class132 var4 = new class132();
        var4.field3212 = arg1;
        var4.field1138 = arg3;
        var4.field3218 = arg0;
        var4.field3219 = arg2;
        class83 var5 = class21.field510;
        synchronized (class21.field510) {
            class21.field510.method720(var4, 0);
        }
        class136.method1136((byte) -46);
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(IJ)V")
    public final void method1000(int arg0, long arg1) {
        if (arg0 > -79) {
            return;
        }
        field2913++;
        class121 var4 = (class121) this.field2912.method1001(arg1, (byte) 81);
        if (var4 != null) {
            var4.method394((byte) -42);
            var4.method1010((byte) 45);
            this.field2916++;
        }
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(I)V")
    public class118(int arg0) {
        this.field2911 = arg0;
        this.field2916 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field2912 = new class119(var2);
    }
}
