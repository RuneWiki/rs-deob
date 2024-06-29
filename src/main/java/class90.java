import java.io.DataInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class90 {

    @OriginalMember(owner = "client!n", name = "q", descriptor = "[B")
    private byte[] field1960 = new byte[4];

    @OriginalMember(owner = "client!n", name = "k", descriptor = "Lke;")
    private class74 field1954;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "I")
    private int field1950;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "J")
    private long field1946;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "Lod;")
    public static class101 field1948 = class46.method335(83, "<col=ffffff>");

    @OriginalMember(owner = "client!n", name = "d", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1947 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!n", name = "m", descriptor = "I")
    public static volatile int field1956 = 0;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "I")
    public static int field1953 = 5063219;

    @OriginalMember(owner = "client!n", name = "p", descriptor = "I")
    public static int field1959 = 1;

    @OriginalMember(owner = "client!n", name = "n", descriptor = "I")
    public static int field1957 = 0;

    @OriginalMember(owner = "client!n", name = "t", descriptor = "Lod;")
    public static class101 field1963 = class46.method335(83, "Der Server wird gerade aktualisiert)3");

    @OriginalMember(owner = "client!n", name = "l", descriptor = "Ljava/lang/Object;")
    public static Object field1955 = new Object();

    @OriginalMember(owner = "client!n", name = "u", descriptor = "Lod;")
    public static class101 field1964 = class46.method335(105, "<br>");

    @OriginalMember(owner = "client!n", name = "v", descriptor = "[S")
    public static short[] field1965 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!n", name = "A", descriptor = "Lod;")
    private static class101 field1970 = class46.method335(81, "red:");

    @OriginalMember(owner = "client!n", name = "z", descriptor = "Lod;")
    public static class101 field1969 = field1970;

    @OriginalMember(owner = "client!n", name = "y", descriptor = "Lod;")
    public static class101 field1968 = class46.method335(-97, "Bitte warten Sie)3)3)3");

    @OriginalMember(owner = "client!n", name = "x", descriptor = "Lod;")
    public static class101 field1967 = field1970;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "I")
    private int field1944;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "I")
    private int field1952;

    @OriginalMember(owner = "client!n", name = "s", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!n", name = "w", descriptor = "Lsa;")
    public static class126 field1966;

    @OriginalMember(owner = "client!n", name = "o", descriptor = "Ljb;")
    public static class64 field1958;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field1951;

    @OriginalMember(owner = "client!n", name = "r", descriptor = "[B")
    private byte[] field1961;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
    public static void method634(int arg0) {
        if (arg0 != 23847) {
            field1964 = null;
        }
        field1964 = null;
        field1963 = null;
        field1948 = null;
        field1965 = null;
        field1947 = null;
        field1958 = null;
        field1970 = null;
        field1967 = null;
        field1968 = null;
        field1966 = null;
        field1955 = null;
        field1969 = null;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(I)[B")
    public final byte[] method635(int arg0) throws IOException {
        if (arg0 != 30000) {
            return null;
        }
        field1949++;
        if (class10.method47(18889) > this.field1946) {
            throw new IOException("fdt");
        }
        if (this.field1950 == 0) {
            if (this.field1954.field1591 == 2) {
                throw new IOException("fds");
            }
            if (this.field1954.field1591 == 1) {
                this.field1950 = 1;
                this.field1951 = (DataInputStream) this.field1954.field1590;
            }
        }
        if (this.field1950 == 1) {
            int var2 = this.field1951.available();
            if (var2 > 0) {
                if (var2 + this.field1952 > 4) {
                    var2 = 4 - this.field1952;
                }
                this.field1952 += this.field1951.read(this.field1960, this.field1952, var2);
                if (this.field1952 == 4) {
                    int var3 = (new class138(this.field1960)).method1062(1809568712);
                    this.field1950 = 2;
                    this.field1961 = new byte[var3];
                }
            }
        }
        if (this.field1950 == 2) {
            int var4 = this.field1951.available();
            if (var4 > 0) {
                if (this.field1961.length < this.field1944 + var4) {
                    var4 = this.field1961.length - this.field1944;
                }
                this.field1944 += this.field1951.read(this.field1961, this.field1944, var4);
                if (this.field1961.length == this.field1944) {
                    return this.field1961;
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Lve;Ljava/net/URL;)V")
    public class90(class151 arg0, URL arg1) {
        this.field1954 = arg0.method1173(arg1, 127);
        this.field1950 = 0;
        this.field1946 = class10.method47(18889) + 30000L;
    }
}
