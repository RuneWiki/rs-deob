import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class103 extends class132 {

    @OriginalMember(owner = "client!kg", name = "t", descriptor = "I")
    public int field1885;

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "I")
    private int field1879;

    @OriginalMember(owner = "client!kg", name = "w", descriptor = "[[I")
    public int[][] field1888;

    @OriginalMember(owner = "client!kg", name = "z", descriptor = "[Z")
    private boolean[] field1891;

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "[I")
    public int[] field1877;

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "[J")
    public static long[] field1878 = new long[100];

    @OriginalMember(owner = "client!kg", name = "r", descriptor = "Ltg;")
    private static class184 field1883 = class135.method812("Prepared sound engine", 3);

    @OriginalMember(owner = "client!kg", name = "o", descriptor = "Ltg;")
    private static class184 field1880 = class135.method812("Please try again)3", 3);

    @OriginalMember(owner = "client!kg", name = "p", descriptor = "[I")
    public static int[] field1881 = new int[2048];

    @OriginalMember(owner = "client!kg", name = "q", descriptor = "Ltg;")
    public static class184 field1882 = class135.method812(": ", 3);

    @OriginalMember(owner = "client!kg", name = "u", descriptor = "Ltg;")
    public static class184 field1886 = field1883;

    @OriginalMember(owner = "client!kg", name = "y", descriptor = "Ltg;")
    private static class184 field1890 = class135.method812("Login server offline)3", 3);

    @OriginalMember(owner = "client!kg", name = "C", descriptor = "Ltg;")
    public static class184 field1894 = class135.method812("Ihr Spielkonto wird bereits benutzt)3", 3);

    @OriginalMember(owner = "client!kg", name = "A", descriptor = "Ltg;")
    public static class184 field1892 = field1880;

    @OriginalMember(owner = "client!kg", name = "v", descriptor = "Ltg;")
    public static class184 field1887 = field1890;

    @OriginalMember(owner = "client!kg", name = "s", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!kg", name = "x", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!kg", name = "B", descriptor = "J")
    public static long field1893;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(B)V")
    public static void method636(byte arg0) {
        field1880 = null;
        field1886 = null;
        field1892 = null;
        field1890 = null;
        int var1 = -33 % ((67 - arg0) / 47);
        field1894 = null;
        field1881 = null;
        field1887 = null;
        field1878 = null;
        field1882 = null;
        field1883 = null;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Ljava/lang/Object;ZB)[B")
    public static final byte[] method637(Object arg0, boolean arg1, byte arg2) {
        field1889++;
        if (arg0 == null) {
            return null;
        }
        if (arg2 != -98) {
            field1884 = 75;
        }
        if (arg0 instanceof byte[]) {
            byte[] var3 = (byte[]) arg0;
            return arg1 ? class29.method181(var3, 32768000) : var3;
        } else if (arg0 instanceof class198) {
            class198 var4 = (class198) arg0;
            return var4.method908(500);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(I[B)V")
    public class103(int arg0, byte[] arg1) {
        this.field1885 = arg0;
        class97 var3 = new class97(arg1);
        this.field1879 = var3.method588((byte) -121);
        this.field1888 = new int[this.field1879][];
        this.field1891 = new boolean[this.field1879];
        this.field1877 = new int[this.field1879];
        for (int var4 = 0; var4 < this.field1879; var4++) {
            this.field1877[var4] = var3.method588((byte) -51);
        }
        for (int var5 = 0; var5 < this.field1879; var5++) {
            this.field1891[var5] = var3.method588((byte) -96) == 1;
        }
        for (int var6 = 0; var6 < this.field1879; var6++) {
            this.field1888[var6] = new int[var3.method588((byte) -41)];
        }
        for (int var7 = 0; var7 < this.field1879; var7++) {
            for (int var8 = 0; var8 < this.field1888[var7].length; var8++) {
                this.field1888[var7][var8] = var3.method588((byte) -81);
            }
        }
    }
}
