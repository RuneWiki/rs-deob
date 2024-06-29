import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class411 implements class541 {

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "Lhe;")
    private class372 field6177 = new class372(128);

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "[I")
    private int[] field6182 = new int[class538.field7691.field2876];

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "[I")
    public int[] field6176 = new int[class538.field7691.field2876];

    @OriginalMember(owner = "client!rm", name = "m", descriptor = "[I")
    public static int[] field6188 = new int[8];

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
    public static int field6178;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "I")
    public static int field6179;

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "I")
    public static int field6180;

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
    public static int field6181;

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "I")
    public static int field6183;

    @OriginalMember(owner = "client!rm", name = "i", descriptor = "I")
    public static int field6184;

    @OriginalMember(owner = "client!rm", name = "j", descriptor = "I")
    public static int field6185;

    @OriginalMember(owner = "client!rm", name = "k", descriptor = "I")
    public static int field6186;

    @OriginalMember(owner = "client!rm", name = "n", descriptor = "I")
    public static int field6189;

    @OriginalMember(owner = "client!rm", name = "o", descriptor = "I")
    public static int field6190;

    @OriginalMember(owner = "client!rm", name = "l", descriptor = "Lvd;")
    public static class39 field6187;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZI)I", line = 6)
    public final int method2605(boolean arg0, int arg1) {
        field6183++;
        class72 var3 = class665.field9346.method3008(99, arg1);
        int var4 = var3.field1009;
        int var5 = var3.field1013;
        if (arg0) {
            return 10;
        } else {
            int var6 = var3.field1019;
            int var7 = class500.field7107[var6 - var5];
            return this.field6176[var4] >> var5 & var7;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)V", line = 27)
    public static final void method2606(byte arg0) {
        if (arg0 != 36) {
            field6187 = null;
        }
        field6190++;
        if (class727.field10146 == null) {
            return;
        }
        if (class727.field10146.field2986 == 1) {
            class727.field10146 = null;
            return;
        }
        if (class727.field10146.field2986 == 2) {
            class690.method3924(-3, class279.field3948, class246.field3583, 2);
            class727.field10146 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(III)V", line = 56)
    public final void method2607(int arg0, int arg1, int arg2) {
        field6186++;
        class72 var4 = class665.field9346.method3008(118, arg0);
        int var5 = var4.field1009;
        int var6 = var4.field1013;
        int var7 = var4.field1019;
        if (arg1 != 8) {
            return;
        }
        int var8 = class500.field7107[var7 - var6];
        if (arg2 < 0 || var8 < arg2) {
            arg2 = 0;
        }
        int var9 = var8 << var6;
        this.method2614(this.field6176[var5] & ~var9 | arg2 << var6 & var9, -25068, var5);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IZ)I", line = 84)
    public final int method2608(int arg0, boolean arg1) {
        field6189++;
        long var3 = class524.method3075(18);
        if (arg0 != -18952) {
            return 54;
        }
        for (class22 var5 = arg1 ? (class22) this.field6177.method2283(false) : (class22) this.field6177.method2282((byte) 44); var5 != null; var5 = (class22) this.field6177.method2282((byte) 74)) {
            if ((var5.field228 & 0x3FFFFFFFFFFFFFFFL) < var3) {
                if ((var5.field228 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field2810;
                    this.field6176[var6] = this.field6182[var6];
                    var5.method1304((byte) 7);
                    return var6;
                }
                var5.method1304((byte) 7);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(B)V", line = 127)
    public static void method2609(byte arg0) {
        if (arg0 <= 77) {
            method2606((byte) 11);
        }
        field6187 = null;
        field6188 = null;
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(III)V", line = 146)
    public final void method2610(int arg0, int arg1, int arg2) {
        field6184++;
        class72 var4 = class665.field9346.method3008(127, arg1);
        int var5 = var4.field1009;
        int var6 = var4.field1013;
        int var7 = var4.field1019;
        int var8 = class500.field7107[var7 - var6];
        if (arg0 > arg2 || arg2 > var8) {
            arg2 = 0;
        }
        int var9 = var8 << var6;
        this.method2613(arg2 << var6 & var9 | this.field6182[var5] & ~var9, var5, (byte) -14);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(II)I", line = 170)
    public final int method2611(int arg0, int arg1) {
        field6185++;
        return arg0 == -16346 ? this.field6176[arg1] : 37;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V", line = 183)
    public final void method2612(int arg0) {
        if (arg0 != -14537) {
            field6187 = null;
        }
        field6181++;
        for (int var2 = 0; var2 < class538.field7691.field2876; var2++) {
            class638 var3 = class538.field7691.method1319(var2, (byte) 57);
            if (var3 != null && var3.field8952 == 0) {
                this.field6182[var2] = 0;
                this.field6176[var2] = 0;
            }
        }
        this.field6177 = new class372(128);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIB)V", line = 210)
    public final void method2613(int arg0, int arg1, byte arg2) {
        int var4 = -24 % ((arg2 + 67) / 43);
        field6180++;
        this.field6182[arg1] = arg0;
        class22 var5 = (class22) this.field6177.method2287((long) arg1, (byte) -117);
        if (var5 == null) {
            class22 var6 = new class22(4611686018427387905L);
            this.field6177.method2278((byte) -105, (long) arg1, var6);
        } else if (var5.field228 != 4611686018427387905L) {
            var5.field228 = class524.method3075(18) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "(III)V", line = 240)
    public final void method2614(int arg0, int arg1, int arg2) {
        this.field6176[arg2] = arg0;
        field6178++;
        class22 var4 = (class22) this.field6177.method2287((long) arg2, (byte) -117);
        if (var4 == null) {
            class22 var5 = new class22(class524.method3075(arg1 ^ 0xFFFF9E06) + 500L);
            this.field6177.method2278((byte) -59, (long) arg2, var5);
        } else {
            var4.field228 = class524.method3075(arg1 + 25086) + 500L;
        }
        if (arg1 != -25068) {
            this.method2610(64, 116, 77);
        }
    }
}
