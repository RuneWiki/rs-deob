import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class125 {

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "Z")
    public boolean field1889 = false;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    public int field1885 = -1;

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "Z")
    public boolean field1895 = false;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "Ld;")
    public class244 field1887 = null;

    @OriginalMember(owner = "client!dl", name = "n", descriptor = "[S")
    public short[] field1898;

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "[S")
    public short[] field1896;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "[S")
    public short[] field1893;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "[S")
    public short[] field1891;

    @OriginalMember(owner = "client!dl", name = "o", descriptor = "[S")
    public short[] field1899;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "[B")
    public byte[] field1886;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "[S")
    private static short[] field1890 = new short[500];

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "[S")
    private static short[] field1888 = new short[500];

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "[S")
    private static short[] field1892 = new short[500];

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "[S")
    private static short[] field1894 = new short[500];

    @OriginalMember(owner = "client!dl", name = "p", descriptor = "[B")
    private static byte[] field1900 = new byte[500];

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "[S")
    private static short[] field1897 = new short[500];

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "()V")
    public static void method790() {
        field1892 = null;
        field1890 = null;
        field1888 = null;
        field1894 = null;
        field1897 = null;
        field1900 = null;
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "([BLd;)V")
    public class125(byte[] arg0, class244 arg1) {
        this.field1887 = arg1;
        class248 var3 = new class248(arg0);
        class248 var4 = new class248(arg0);
        var3.field3748 = 2;
        int var5 = var3.method1593((byte) 27);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field3748 = var3.field3748 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var11 = this.field1887.field3652[var9];
            if (var11 == 0) {
                var7 = var9;
            }
            int var12 = var3.method1593((byte) 27);
            if (var12 > 0) {
                if (var11 == 0) {
                    var8 = var9;
                }
                field1892[var6] = (short) var9;
                short var13 = 0;
                if (var11 == 3) {
                    var13 = 128;
                }
                if ((var12 & 0x1) == 0) {
                    field1890[var6] = var13;
                } else {
                    field1890[var6] = (short) var4.method1609(false);
                }
                if ((var12 & 0x2) == 0) {
                    field1888[var6] = var13;
                } else {
                    field1888[var6] = (short) var4.method1609(false);
                }
                if ((var12 & 0x4) == 0) {
                    field1894[var6] = var13;
                } else {
                    field1894[var6] = (short) var4.method1609(false);
                }
                field1900[var6] = (byte) (var12 >>> 3 & 0x3);
                if (var11 == 2) {
                    field1890[var6] = (short) (((field1890[var6] & 0xFF) << 3) + (field1890[var6] >> 8 & 0x7));
                    field1888[var6] = (short) (((field1888[var6] & 0xFF) << 3) + (field1888[var6] >> 8 & 0x7));
                    field1894[var6] = (short) (((field1894[var6] & 0xFF) << 3) + (field1894[var6] >> 8 & 0x7));
                }
                field1897[var6] = -1;
                if (var11 == 1 || var11 == 2 || var11 == 3) {
                    if (var7 > var8) {
                        field1897[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var11 == 5) {
                    this.field1895 = true;
                } else if (var11 == 7) {
                    this.field1889 = true;
                }
                var6++;
            }
        }
        if (arg0.length != var4.field3748) {
            throw new RuntimeException();
        }
        this.field1885 = var6;
        this.field1898 = new short[var6];
        this.field1896 = new short[var6];
        this.field1893 = new short[var6];
        this.field1891 = new short[var6];
        this.field1899 = new short[var6];
        this.field1886 = new byte[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field1898[var10] = field1892[var10];
            this.field1896[var10] = field1890[var10];
            this.field1893[var10] = field1888[var10];
            this.field1891[var10] = field1894[var10];
            this.field1899[var10] = field1897[var10];
            this.field1886[var10] = field1900[var10];
        }
    }
}
