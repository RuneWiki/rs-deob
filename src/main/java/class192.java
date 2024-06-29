import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class192 {

    @OriginalMember(owner = "client!pt", name = "p", descriptor = "I")
    public static int field2743 = 0;

    @OriginalMember(owner = "client!pt", name = "j", descriptor = "[I")
    public static int[] field2737 = new int[99];

    @OriginalMember(owner = "client!pt", name = "x", descriptor = "Lfn;")
    public static class52 field2751;

    @OriginalMember(owner = "client!pt", name = "A", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "B")
    public byte field2729;

    @OriginalMember(owner = "client!pt", name = "d", descriptor = "B")
    public byte field2731;

    @OriginalMember(owner = "client!pt", name = "f", descriptor = "B")
    public byte field2733;

    @OriginalMember(owner = "client!pt", name = "n", descriptor = "B")
    public byte field2741;

    @OriginalMember(owner = "client!pt", name = "o", descriptor = "B")
    public byte field2742;

    @OriginalMember(owner = "client!pt", name = "t", descriptor = "B")
    public byte field2747;

    @OriginalMember(owner = "client!pt", name = "u", descriptor = "B")
    public byte field2748;

    @OriginalMember(owner = "client!pt", name = "m", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!pt", name = "y", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!pt", name = "z", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!pt", name = "v", descriptor = "Laq;")
    public static class385 field2749;

    @OriginalMember(owner = "client!pt", name = "w", descriptor = "Laq;")
    public static class385 field2750;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "Lwq;")
    public static class54 field2728;

    @OriginalMember(owner = "client!pt", name = "e", descriptor = "S")
    public short field2732;

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "Z")
    public boolean field2730;

    @OriginalMember(owner = "client!pt", name = "g", descriptor = "Z")
    public boolean field2734;

    @OriginalMember(owner = "client!pt", name = "h", descriptor = "Z")
    public boolean field2735;

    @OriginalMember(owner = "client!pt", name = "i", descriptor = "Z")
    public boolean field2736;

    @OriginalMember(owner = "client!pt", name = "k", descriptor = "Z")
    public boolean field2738;

    @OriginalMember(owner = "client!pt", name = "l", descriptor = "Z")
    public boolean field2739;

    @OriginalMember(owner = "client!pt", name = "q", descriptor = "Z")
    public boolean field2744;

    @OriginalMember(owner = "client!pt", name = "r", descriptor = "Z")
    public boolean field2745;

    @OriginalMember(owner = "client!pt", name = "s", descriptor = "Z")
    public boolean field2746;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field2737[var1] = var0 / 4;
        }
        field2751 = new class52(37, 5);
        field2754 = 2;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IIIILwm;)V", line = 7)
    public static final void method1234(int arg0, int arg1, int arg2, int arg3, class242 arg4) {
        class406 var5 = class11.method105(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        arg4.field3419 = (arg1 << class259.field3616) + class411.field5703;
        arg4.field3420 = arg3;
        arg4.field3424 = (arg2 << class259.field3616) + class411.field5703;
        for (class146 var7 = var5.field5613; var7 != null; var7 = var7.field2066) {
            if (var7.field2062.field6762) {
                int var8 = var7.field2062.method205((byte) 114);
                if (var8 != -32768 && var8 < var6) {
                    var6 = var8;
                }
            }
        }
        if (var6 < 0) {
            arg4.field3420 += var6;
            arg4.field3427 = true;
        }
        var5.field5614 = arg4;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(BI)Lni;", line = 44)
    public static final class33 method1235(byte arg0, int arg1) {
        field2740++;
        if (arg0 >= -55) {
            method1236(-78);
        }
        class33 var2 = (class33) class241.field3415.method1209(false, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class451.field6193.method2029(arg1, 0, 0);
        if (var3 == null || var3.length <= 1) {
            return null;
        } else {
            class33 var4 = class10.method102((byte) 30, var3);
            class241.field3415.method1207(-1, (long) arg1, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)V", line = 85)
    public static void method1236(int arg0) {
        field2728 = null;
        if (arg0 != 5) {
            method1235((byte) -8, -103);
        }
        field2749 = null;
        field2737 = null;
        field2750 = null;
        field2751 = null;
    }
}
