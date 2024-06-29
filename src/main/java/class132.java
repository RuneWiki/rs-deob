import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class132 {

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "Lqa;")
    public class73 field1903 = null;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "Z")
    public boolean field1905 = false;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
    public int field1907 = -1;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "Z")
    public boolean field1902 = false;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "[S")
    public short[] field1899;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "[S")
    public short[] field1911;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "[S")
    public short[] field1897;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "[S")
    public short[] field1900;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "[S")
    public short[] field1908;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "[B")
    public byte[] field1898;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "[S")
    private static short[] field1904 = new short[500];

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "[B")
    private static byte[] field1906 = new byte[500];

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "[S")
    private static short[] field1901 = new short[500];

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "[S")
    private static short[] field1910 = new short[500];

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "[S")
    private static short[] field1909 = new short[500];

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "[S")
    private static short[] field1912 = new short[500];

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "()V")
    public static void method864() {
        field1901 = null;
        field1909 = null;
        field1910 = null;
        field1912 = null;
        field1904 = null;
        field1906 = null;
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "([BLqa;)V")
    public class132(byte[] arg0, class73 arg1) {
        this.field1903 = arg1;
        class216 var3 = new class216(arg0);
        class216 var4 = new class216(arg0);
        var3.field3021 = 2;
        int var5 = var3.method1407(127);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field3021 = var3.field3021 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var11 = this.field1903.field876[var9];
            if (var11 == 0) {
                var7 = var9;
            }
            int var12 = var3.method1407(123);
            if (var12 > 0) {
                if (var11 == 0) {
                    var8 = var9;
                }
                field1901[var6] = (short) var9;
                short var13 = 0;
                if (var11 == 3) {
                    var13 = 128;
                }
                if ((var12 & 0x1) == 0) {
                    field1909[var6] = var13;
                } else {
                    field1909[var6] = (short) var4.method1408(false);
                }
                if ((var12 & 0x2) == 0) {
                    field1910[var6] = var13;
                } else {
                    field1910[var6] = (short) var4.method1408(false);
                }
                if ((var12 & 0x4) == 0) {
                    field1912[var6] = var13;
                } else {
                    field1912[var6] = (short) var4.method1408(false);
                }
                field1906[var6] = (byte) (var12 >>> 3 & 0x3);
                if (var11 == 2) {
                    field1909[var6] = (short) (((field1909[var6] & 0xFF) << 3) + (field1909[var6] >> 8 & 0x7));
                    field1910[var6] = (short) (((field1910[var6] & 0xFF) << 3) + (field1910[var6] >> 8 & 0x7));
                    field1912[var6] = (short) (((field1912[var6] & 0xFF) << 3) + (field1912[var6] >> 8 & 0x7));
                }
                field1904[var6] = -1;
                if (var11 == 1 || var11 == 2 || var11 == 3) {
                    if (var7 > var8) {
                        field1904[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var11 == 5) {
                    this.field1902 = true;
                } else if (var11 == 7) {
                    this.field1905 = true;
                }
                var6++;
            }
        }
        if (arg0.length != var4.field3021) {
            throw new RuntimeException();
        }
        this.field1907 = var6;
        this.field1899 = new short[var6];
        this.field1911 = new short[var6];
        this.field1897 = new short[var6];
        this.field1900 = new short[var6];
        this.field1908 = new short[var6];
        this.field1898 = new byte[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field1899[var10] = field1901[var10];
            this.field1911[var10] = field1909[var10];
            this.field1897[var10] = field1910[var10];
            this.field1900[var10] = field1912[var10];
            this.field1908[var10] = field1904[var10];
            this.field1898[var10] = field1906[var10];
        }
    }
}
