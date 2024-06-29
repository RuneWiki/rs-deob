import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class172 {

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
    public static int field2733 = 0;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "[I")
    public static int[] field2735 = new int[14];

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "J")
    public long field2734;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "Lwk;")
    public class172 field2737;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "Lwk;")
    public class172 field2740;

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "[Z")
    public static boolean[] field2744;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "[[B")
    public static byte[][] field2732;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IB)I", line = 9)
    public static final int method1354(int arg0, byte arg1) {
        field2743++;
        if (arg1 > -111) {
            method1358(36);
        }
        int var2 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAB) >>> 1);
        int var3 = (var2 >>> 2 & 0xB3333333) + (var2 & 0x33333333);
        int var4 = var3 + (var3 >>> 4) & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)I", line = 27)
    public static final int method1355(int arg0, int arg1) {
        field2741++;
        return arg0 == -22845 ? arg1 >>> 7 : 107;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIILf;I)V", line = 40)
    public static final void method1356(int arg0, int arg1, int arg2, class212 arg3, int arg4) {
        field2736++;
        for (class160 var5 = (class160) class188.field2954.method2244((byte) -127); var5 != null; var5 = (class160) class188.field2954.method2241(-1)) {
            if (var5.field2540 == arg0 && arg1 * 128 == var5.field2556 && arg4 * 128 == var5.field2564 && var5.field2561.field3334 == arg3.field3334) {
                if (var5.field2563 != null) {
                    class19.field316.method109(var5.field2563);
                    var5.field2563 = null;
                }
                if (var5.field2546 != null) {
                    class19.field316.method109(var5.field2546);
                    var5.field2546 = null;
                }
                var5.method1357(947647010);
                return;
            }
        }
        if (arg2 >= -119) {
            method1359(-68, -78, 12);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V", line = 77)
    public final void method1357(int arg0) {
        field2738++;
        if (this.field2740 == null) {
            return;
        }
        this.field2740.field2737 = this.field2737;
        this.field2737.field2740 = this.field2740;
        this.field2737 = null;
        if (arg0 != 947647010) {
            this.method1357(66);
        }
        this.field2740 = null;
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)V", line = 99)
    public static void method1358(int arg0) {
        field2744 = null;
        if (arg0 == -1378791256) {
            field2732 = (byte[][]) null;
            field2735 = null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(III)V", line = 113)
    public static final void method1359(int arg0, int arg1, int arg2) {
        int var3 = class239.field3720 * arg2 >> 8;
        field2739++;
        if (arg1 == -1 && !class212.field3331) {
            class286.method2070(-126);
        } else if (arg1 != -1 && (class327.field5039 != arg1 || !class221.method1656((byte) -117)) && var3 != 0 && !class212.field3331) {
            class345.method2431(2, (byte) 115, class155.field2504, arg1, var3, false, 0);
        }
        int var4 = 3 % ((-arg0 - 76) / 47);
        class327.field5039 = arg1;
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(I)Z", line = 148)
    public final boolean method1360(int arg0) {
        int var2 = -5 % ((arg0 + 66) / 33);
        field2742++;
        return this.field2740 != null;
    }
}
