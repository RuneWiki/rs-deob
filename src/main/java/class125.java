import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class125 extends class209 {

    @OriginalMember(owner = "client!ll", name = "y", descriptor = "[B")
    public static byte[] field1927 = new byte[520];

    @OriginalMember(owner = "client!ll", name = "w", descriptor = "Luf;")
    public static class168 field1925 = class148.method1019(-1720, " )2>");

    @OriginalMember(owner = "client!ll", name = "A", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!ll", name = "C", descriptor = "I")
    private int field1930;

    @OriginalMember(owner = "client!ll", name = "F", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!ll", name = "G", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!ll", name = "H", descriptor = "I")
    public int field1934;

    @OriginalMember(owner = "client!ll", name = "I", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!ll", name = "J", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!ll", name = "K", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!ll", name = "x", descriptor = "Lhj;")
    public static class112 field1926;

    @OriginalMember(owner = "client!ll", name = "z", descriptor = "Luf;")
    public class168 field1928;

    @OriginalMember(owner = "client!ll", name = "E", descriptor = "[[[B")
    public static byte[][][] field1931;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(BLj;)V", line = 13)
    public final void method885(byte arg0, class153 arg1) {
        while (true) {
            int var3 = arg1.method1042((byte) 84);
            if (var3 == 0) {
                field1936++;
                if (arg0 <= 74) {
                    field1937 = -35;
                }
                return;
            }
            this.method886(arg1, var3, -75);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lj;II)V", line = 31)
    private final void method886(class153 arg0, int arg1, int arg2) {
        field1932++;
        if (arg1 == 1) {
            this.field1930 = arg0.method1042((byte) -19);
        } else if (arg1 == 2) {
            this.field1934 = arg0.method1089((byte) -14);
        } else if (arg1 == 5) {
            this.field1928 = arg0.method1075(93);
        }
        if (arg2 > -69) {
            field1925 = (class168) null;
        }
    }

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "(I)V", line = 64)
    public static void method887(int arg0) {
        field1925 = null;
        field1931 = (byte[][][]) null;
        field1926 = null;
        if (arg0 != 256) {
            method887(37);
        }
        field1927 = null;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I[B)[B", line = 79)
    public static final byte[] method888(int arg0, byte[] arg1) {
        field1933++;
        class153 var2 = new class153(arg1);
        if (arg0 != 2) {
            method887(14);
        }
        int var3 = var2.method1042((byte) -86);
        int var4 = var2.method1089((byte) -14);
        if (var4 < 0 || !(class105.field1620 == 0 || class105.field1620 >= var4)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method1080(var4, (byte) -65, 0, var7);
            return var7;
        } else {
            int var5 = var2.method1089((byte) -14);
            if (var5 < 0 || class105.field1620 != 0 && class105.field1620 < var5) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class104.method782(var6, var5, arg1, var4, 9);
            } else {
                class157.field2477.method54(var6, var2, (byte) -125);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "(I)V", line = 158)
    public static final void method889(int arg0) {
        int var1 = 52 / ((arg0 - 80) / 35);
        field1929++;
        if (class203.field3339 != null && class261.field4425 != null) {
            return;
        }
        class261.field4425 = new int[256];
        class203.field3339 = new int[256];
        for (int var2 = 0; var2 < 256; var2++) {
            double var3 = (double) var2 / 255.0D * 6.283185307179586D;
            class203.field3339[var2] = (int) (Math.sin(var3) * 4096.0D);
            class261.field4425[var2] = (int) (Math.cos(var3) * 4096.0D);
        }
    }

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "(I)Z", line = 187)
    public final boolean method890(int arg0) {
        if (arg0 != 115) {
            this.method890(38);
        }
        field1935++;
        return this.field1930 == 115;
    }
}
