import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class152 extends class210 {

    @OriginalMember(owner = "client!q", name = "v", descriptor = "Ljd;")
    private static class92 field3014 = class202.method1325((byte) 90, " has logged in)3");

    @OriginalMember(owner = "client!q", name = "y", descriptor = "Ljd;")
    public static class92 field3017 = class202.method1325((byte) 90, " Sekunde(Xn(Y -Ubertragen)3");

    @OriginalMember(owner = "client!q", name = "w", descriptor = "[I")
    public static int[] field3015 = new int[128];

    @OriginalMember(owner = "client!q", name = "F", descriptor = "Ljd;")
    public static class92 field3024 = field3014;

    @OriginalMember(owner = "client!q", name = "s", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!q", name = "z", descriptor = "I")
    public int field3018;

    @OriginalMember(owner = "client!q", name = "C", descriptor = "I")
    public int field3021;

    @OriginalMember(owner = "client!q", name = "E", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!q", name = "x", descriptor = "Lnh;")
    public static class133 field3016;

    @OriginalMember(owner = "client!q", name = "D", descriptor = "Lnh;")
    public static class133 field3022;

    @OriginalMember(owner = "client!q", name = "A", descriptor = "Lrf;")
    public static class167 field3019;

    @OriginalMember(owner = "client!q", name = "r", descriptor = "Ltd;")
    public static class183 field3010;

    @OriginalMember(owner = "client!q", name = "q", descriptor = "[I")
    public int[] field3009;

    @OriginalMember(owner = "client!q", name = "B", descriptor = "[I")
    public int[] field3020;

    @OriginalMember(owner = "client!q", name = "G", descriptor = "[I")
    public int[] field3025;

    @OriginalMember(owner = "client!q", name = "t", descriptor = "[Ltd;")
    public class183[] field3012;

    @OriginalMember(owner = "client!q", name = "u", descriptor = "[Ltd;")
    public class183[] field3013;

    @OriginalMember(owner = "client!q", name = "p", descriptor = "[[[B")
    public byte[][][] field3008;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IZLjava/lang/Object;)[B")
    public static final byte[] method973(int arg0, boolean arg1, Object arg2) {
        if (arg0 != 25829) {
            field3019 = null;
        }
        field3023++;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg1 ? class55.method327(var3, 30000) : var3;
        } else if (arg2 instanceof class104) {
            class104 var4 = (class104) arg2;
            return var4.method712(arg0 ^ 0x6499);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "([[II)V")
    public static final void method974(int[][] arg0, int arg1) {
        field3011++;
        if (arg1 != -21347) {
            field3015 = null;
        }
    }

    @OriginalMember(owner = "client!q", name = "d", descriptor = "(B)V")
    public static void method975(byte arg0) {
        field3015 = null;
        field3016 = null;
        field3024 = null;
        field3017 = null;
        field3022 = null;
        field3010 = null;
        field3019 = null;
        if (arg0 != 112) {
            method973(-77, false, null);
        }
        field3014 = null;
    }
}
