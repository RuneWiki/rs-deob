import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class58 {

    @OriginalMember(owner = "client!qr", name = "e", descriptor = "Lui;")
    private class194 field723;

    @OriginalMember(owner = "client!qr", name = "d", descriptor = "I")
    public int field722;

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "I")
    private int field721;

    @OriginalMember(owner = "client!qr", name = "i", descriptor = "I")
    public int field727;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "Lqr;")
    public static class58 field719 = new class58(0, 3, class194.field2878);

    @OriginalMember(owner = "client!qr", name = "j", descriptor = "Lqr;")
    public static class58 field728 = new class58(1, 3, class194.field2878);

    @OriginalMember(owner = "client!qr", name = "k", descriptor = "Lqr;")
    public static class58 field729 = new class58(2, 4, class194.field2874);

    @OriginalMember(owner = "client!qr", name = "m", descriptor = "Lqr;")
    public static class58 field731 = new class58(3, 1, class194.field2878);

    @OriginalMember(owner = "client!qr", name = "n", descriptor = "Lqr;")
    public static class58 field732 = new class58(4, 2, class194.field2878);

    @OriginalMember(owner = "client!qr", name = "o", descriptor = "Lqr;")
    public static class58 field733 = new class58(5, 3, class194.field2878);

    @OriginalMember(owner = "client!qr", name = "p", descriptor = "Lqr;")
    private static class58 field734 = new class58(6, 4, class194.field2878);

    @OriginalMember(owner = "client!qr", name = "q", descriptor = "I")
    public static int field735 = class136.method950((byte) 73, 16);

    @OriginalMember(owner = "client!qr", name = "s", descriptor = "[I")
    public static int[] field737 = new int[1];

    @OriginalMember(owner = "client!qr", name = "u", descriptor = "J")
    public static long field739 = 0L;

    @OriginalMember(owner = "client!qr", name = "r", descriptor = "Lada;")
    public static class144 field736 = new class144(54, -2);

    @OriginalMember(owner = "client!qr", name = "v", descriptor = "[I")
    public static int[] field740 = new int[500];

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!qr", name = "f", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!qr", name = "g", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!qr", name = "h", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!qr", name = "l", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!qr", name = "t", descriptor = "Lqa;")
    public static class208 field738;

    @OriginalMember(owner = "client!qr", name = "w", descriptor = "[[B")
    public static byte[][] field741;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)[Lqr;", line = 10)
    public static final class58[] method386(int arg0) {
        if (arg0 != -3034) {
            method388(17, -89);
        }
        field724++;
        return new class58[] { field719, field728, field729, field731, field732, field733, field734 };
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(BIBILks;)V", line = 24)
    public static final void method387(byte arg0, int arg1, byte arg2, int arg3, class373 arg4) {
        field730++;
        if (arg2 <= 108) {
            return;
        }
        int var5 = arg4.field1957[0];
        int var6 = arg4.field1955[0];
        if (var5 < 0 || var5 >= class146.field2125 || var6 < 0 || class410.field5609 <= var6 || arg1 < 0 || class146.field2125 <= arg1 || arg3 < 0 || class410.field5609 <= arg3) {
            return;
        }
        int var7 = class245.method1555(0, arg3, 0, arg1, var6, class394.field5418, 0, 44, true, class127.field1774[arg4.field8501], -4, 0, var5, class343.field4739, arg4.method940(-1));
        if (var7 >= 1 && var7 <= 3) {
            for (int var8 = 0; var8 < (var7 - 1); var8++) {
                arg4.method2226(class343.field4739[var8], class394.field5418[var8], (byte) 103, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(II)V", line = 61)
    public static final void method388(int arg0, int arg1) {
        field720++;
        class221 var2 = class65.method413(14, arg0, (byte) 105);
        var2.method1432(arg1);
    }

    @OriginalMember(owner = "client!qr", name = "toString", descriptor = "()Ljava/lang/String;", line = 71)
    public final String toString() {
        field726++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(I)V", line = 81)
    public static void method389(int arg0) {
        field736 = null;
        field740 = null;
        int var1 = -58 % ((arg0 + 69) / 54);
        field728 = null;
        field719 = null;
        field734 = null;
        field741 = null;
        field737 = null;
        field731 = null;
        field732 = null;
        field738 = null;
        field733 = null;
        field729 = null;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(B)V", line = 106)
    public static final void method390(byte arg0) {
        class151.field2294 = null;
        if (arg0 != -64) {
            method388(-1, -27);
        }
        field725++;
        class244.field3486 = null;
    }

    @OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(IILui;)V", line = 125)
    private class58(int arg0, int arg1, class194 arg2) {
        this.field723 = arg2;
        this.field722 = arg0;
        this.field721 = arg1;
        this.field727 = this.field723.field2870 * this.field721;
        if (this.field722 >= 16) {
            throw new RuntimeException();
        }
    }
}
