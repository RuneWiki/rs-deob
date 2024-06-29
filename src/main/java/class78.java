import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class78 extends class51 {

    @OriginalMember(owner = "client!id", name = "cb", descriptor = "I")
    private int field1548;

    @OriginalMember(owner = "client!id", name = "bb", descriptor = "Led;")
    private static class43 field1547 = class191.method1219("Loading title screen )2 ", false);

    @OriginalMember(owner = "client!id", name = "Z", descriptor = "[I")
    public static int[] field1545 = new int[200];

    @OriginalMember(owner = "client!id", name = "db", descriptor = "Led;")
    public static class43 field1549 = class191.method1219("Die Adresse dieses Computers wurde gesperrt)1", false);

    @OriginalMember(owner = "client!id", name = "ab", descriptor = "[J")
    public static long[] field1546 = new long[100];

    @OriginalMember(owner = "client!id", name = "hb", descriptor = "Led;")
    public static class43 field1553 = field1547;

    @OriginalMember(owner = "client!id", name = "ib", descriptor = "Led;")
    public static class43 field1554 = class191.method1219("(U0a )2 via: ", false);

    @OriginalMember(owner = "client!id", name = "eb", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!id", name = "fb", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!id", name = "jb", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!id", name = "kb", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!id", name = "gb", descriptor = "Lga;")
    public static class58 field1552;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "(I)V")
    public static void method478(int arg0) {
        if (arg0 != 60) {
            method479((byte) 82, 88, -117);
        }
        field1554 = null;
        field1547 = null;
        field1549 = null;
        field1545 = null;
        field1546 = null;
        field1552 = null;
        field1553 = null;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(BII)I")
    public static final int method479(byte arg0, int arg1, int arg2) {
        if (arg0 >= -105) {
            field1554 = null;
        }
        ++field1551;
        int var3 = class117.method742(4, arg1 - -91923, (byte) 127, arg2 + 45365) - 128 - -(class117.method742(2, arg1 + 37821, (byte) 124, arg2 - -10294) + -128 >> 1) - -(-128 + class117.method742(1, arg1, (byte) 127, arg2) >> 2);
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(I)V")
    private class78(int arg0) {
        super(0, true);
        this.field1548 = 4096;
        this.field1548 = arg0;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "([BZ)[B")
    public static final byte[] method480(byte[] arg0, boolean arg1) {
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        ++field1550;
        if (!arg1) {
            return null;
        } else {
            class42.method234(arg0, 0, var3, 0, var2);
            return var3;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Ljg;II)V")
    public final void method24(class89 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field1548 = (arg0.method538((byte) -104) << 12) / 255;
        }
        ++field1555;
        if (arg1 != 0) {
            method478(-128);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(II)[I")
    public final int[] method27(int arg0, int arg1) {
        ++field1556;
        int[] var3 = super.field1025.method39(arg1, (byte) 39);
        if (arg0 != 16) {
            field1545 = null;
        }
        if (super.field1025.field154) {
            class42.method233(var3, 0, class122.field2442, this.field1548);
        }
        return var3;
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V")
    public class78() {
        this(4096);
    }
}
