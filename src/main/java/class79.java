import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class79 {

    @OriginalMember(owner = "client!l", name = "k", descriptor = "[B")
    private byte[] field1919 = new byte[4];

    @OriginalMember(owner = "client!l", name = "m", descriptor = "Lcf;")
    private class21 field1921;

    @OriginalMember(owner = "client!l", name = "s", descriptor = "I")
    private int field1927;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "J")
    private long field1924;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "I")
    public static int field1913 = 0;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "Lja;")
    public static class62 field1909 = class30.method243(43, "");

    @OriginalMember(owner = "client!l", name = "u", descriptor = "[[S")
    public static short[][] field1929 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!l", name = "w", descriptor = "Lja;")
    public static class62 field1931 = class30.method243(43, "<br>");

    @OriginalMember(owner = "client!l", name = "t", descriptor = "Lja;")
    public static class62 field1928 = class30.method243(43, "(U3");

    @OriginalMember(owner = "client!l", name = "b", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "I")
    private int field1917;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!l", name = "n", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!l", name = "r", descriptor = "I")
    private int field1926;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "Lea;")
    public static class29 field1923;

    @OriginalMember(owner = "client!l", name = "q", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field1925;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "[B")
    private byte[] field1912;

    @OriginalMember(owner = "client!l", name = "v", descriptor = "[[[B")
    public static byte[][][] field1930;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V")
    public static void method626(byte arg0) {
        if (arg0 != 29) {
            field1923 = null;
        }
        field1929 = null;
        field1928 = null;
        field1923 = null;
        field1930 = null;
        field1931 = null;
        field1909 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)I")
    public static final int method627(int arg0, int arg1) {
        field1922++;
        int var2 = 53 % ((-arg0 - 18) / 48);
        return arg1 >> 11 & 0x3F;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IBII)V")
    public static final void method628(int arg0, byte arg1, int arg2, int arg3) {
        field1916++;
        if (arg0 < 128 || arg3 < 128 || arg0 > 13056 || arg3 > 13056) {
            class68.field1688 = -1;
            class119.field2729 = -1;
            return;
        }
        int var4 = class111.method908(128, arg0, arg3, class155.field3598) - arg2;
        int var5 = arg0 - class81.field1959;
        int var6 = class66.field1647[class143.field3351];
        int var7 = class66.field1658[class20.field433];
        int var8 = arg3 - class140.field3248;
        int var9 = class66.field1658[class143.field3351];
        int var10 = var5 * var9 + var6 * var8 >> 16;
        int var11 = var4 - class115.field2649;
        int var12 = class66.field1647[class20.field433];
        int var13 = var8 * var9 - var5 * var6 >> 16;
        int var15 = var7 * var11 - var12 * var13 >> 16;
        int var16 = var7 * var13 + var11 * var12 >> 16;
        if (arg1 != 69) {
            return;
        }
        if (var16 >= 50) {
            class68.field1688 = (var15 << 9) / var16 + 167;
            class119.field2729 = (var10 << 9) / var16 + 256;
        } else {
            class68.field1688 = -1;
            class119.field2729 = -1;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lja;B)I")
    public static final int method629(class62 arg0, byte arg1) {
        field1910++;
        if (class52.field1189 == 1) {
            return 7;
        } else if (arg0.method450(class68.field1696, (byte) -111)) {
            return 1;
        } else {
            if (arg1 > -43) {
                field1915 = 103;
            }
            if (arg0.method450(class115.field2665, (byte) -116)) {
                return 1;
            } else if (arg0.method450(class31.field754, (byte) -93)) {
                return 2;
            } else if (arg0.method450(class144.field3358, (byte) -63)) {
                return 2;
            } else if (arg0.method450(class132.field3031, (byte) -96)) {
                return 3;
            } else if (arg0.method450(class28.field682, (byte) -116)) {
                return 4;
            } else if (arg0.method450(class71.field1806, (byte) -74)) {
                return 4;
            } else if (arg0.method450(class81.field1967, (byte) -73)) {
                return 5;
            } else if (arg0.method450(class136.field3137, (byte) -126)) {
                return 6;
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)[B")
    public final byte[] method630(int arg0) throws IOException {
        field1920++;
        if (class26.method209((byte) -29) > this.field1924) {
            throw new IOException("fdt");
        }
        if (this.field1927 == 0) {
            if (this.field1921.field471 == 2) {
                throw new IOException("fds");
            }
            if (this.field1921.field471 == 1) {
                this.field1925 = (DataInputStream) this.field1921.field473;
                this.field1927 = 1;
            }
        }
        if (this.field1927 == 1) {
            int var2 = this.field1925.available();
            if (var2 > 0) {
                if (this.field1917 + var2 > 4) {
                    var2 = 4 - this.field1917;
                }
                this.field1917 += this.field1925.read(this.field1919, this.field1917, var2);
                if (this.field1917 == 4) {
                    int var3 = (new class128(this.field1919)).method1037(18834);
                    this.field1927 = 2;
                    this.field1912 = new byte[var3];
                }
            }
        }
        if (arg0 != -11188) {
            method627(121, -37);
        }
        if (this.field1927 == 2) {
            int var4 = this.field1925.available();
            if (var4 > 0) {
                if (this.field1912.length < this.field1926 + var4) {
                    var4 = this.field1912.length - this.field1926;
                }
                this.field1926 += this.field1925.read(this.field1912, this.field1926, var4);
                if (this.field1912.length == this.field1926) {
                    return this.field1912;
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lfe;Ljava/net/URL;)V")
    public class79(class41 arg0, URL arg1) {
        this.field1921 = arg0.method306(arg1, (byte) -48);
        this.field1927 = 0;
        this.field1924 = class26.method209((byte) 120) + 30000L;
    }
}
