import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class118 {

    @OriginalMember(owner = "client!kj", name = "p", descriptor = "[B")
    private byte[] field2120 = new byte[4];

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "Lmb;")
    private class132 field2106;

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "I")
    private int field2111;

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "J")
    private long field2113;

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "Z")
    public static boolean field2114 = false;

    @OriginalMember(owner = "client!kj", name = "s", descriptor = "Ldc;")
    private static class37 field2123 = class185.method1233((byte) 86, "Loaded update list");

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "Ldc;")
    public static class37 field2110 = field2123;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
    private int field2108;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!kj", name = "r", descriptor = "I")
    private int field2122;

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "Lji;")
    public static class106 field2115;

    @OriginalMember(owner = "client!kj", name = "q", descriptor = "Lwa;")
    public static class238 field2121;

    @OriginalMember(owner = "client!kj", name = "n", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field2118;

    @OriginalMember(owner = "client!kj", name = "o", descriptor = "[B")
    private byte[] field2119;

    @OriginalMember(owner = "client!kj", name = "m", descriptor = "[[B")
    public static byte[][] field2117;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)[B")
    public final byte[] method815(int arg0) throws IOException {
        field2105++;
        if (class214.method1416(22624) > this.field2113) {
            throw new IOException("fdt");
        }
        if (this.field2111 == 0) {
            if (this.field2106.field2461 == 2) {
                throw new IOException("fds");
            }
            if (this.field2106.field2461 == 1) {
                this.field2111 = 1;
                this.field2118 = (DataInputStream) this.field2106.field2465;
            }
        }
        if (this.field2111 == 1) {
            int var2 = this.field2118.available();
            if (var2 > 0) {
                if (var2 + this.field2122 > 4) {
                    var2 = 4 - this.field2122;
                }
                this.field2122 += this.field2118.read(this.field2120, this.field2122, var2);
                if (this.field2122 == 4) {
                    int var3 = (new class28(this.field2120)).method226(108);
                    this.field2119 = new byte[var3];
                    this.field2111 = 2;
                }
            }
        }
        if (arg0 < 14) {
            field2114 = false;
        }
        if (this.field2111 == 2) {
            int var4 = this.field2118.available();
            if (var4 > 0) {
                if (this.field2119.length < var4 + this.field2108) {
                    var4 = this.field2119.length - this.field2108;
                }
                this.field2108 += this.field2118.read(this.field2119, this.field2108, var4);
                if (this.field2119.length == this.field2108) {
                    return this.field2119;
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Z)V")
    public static void method816(boolean arg0) {
        field2117 = null;
        field2115 = null;
        field2110 = null;
        if (arg0) {
            field2123 = null;
            field2121 = null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILdc;)V")
    public static final void method817(int arg0, class37 arg1) {
        field2116++;
        if (class92.field1582 >= 2) {
            if (arg1.method303(class194.field3612, 40)) {
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class215.method1418(0, -1, class80.method548(new class37[] { class81.field1432, class151.method1034((byte) -9, var4), class120.field2142 }, -96), null);
            }
            if (arg1.method303(class31.field627, 40)) {
                class101.method665(-104);
            }
            if (arg1.method303(class92.field1589, 40)) {
                class183.field3378 = true;
            }
            if (arg1.method303(class62.field1129, 40)) {
                class183.field3378 = false;
            }
            arg1.method303(class157.field2989, 40);
            arg1.method303(class67.field1196, 40);
            if (arg1.method303(class131.field2455, 40)) {
                for (int var5 = 0; var5 < 4; var5++) {
                    for (int var6 = 1; var6 < 103; var6++) {
                        for (int var7 = 1; var7 < 103; var7++) {
                            class11.field143[var5].field3080[var6][var7] = 0;
                        }
                    }
                }
            }
            if (arg1.method339(class64.field1165, (byte) -127) && class50.field1018 != 0) {
                class63.method474(1000, arg1.method301((byte) 70, 6).method305(true));
            }
            if (arg1.method303(class158.field2993, 40) && class50.field1018 == 2) {
                throw new RuntimeException();
            }
            if (arg1.method339(class127.field2357, (byte) -95)) {
                class122.field2175 = arg1.method301((byte) 74, 12).method332(123).method305(true);
                class215.method1418(0, -1, class80.method548(new class37[] { class147.field2806, class151.method1034((byte) -9, class122.field2175) }, -54), null);
            }
            if (arg1.method303(class106.field1850, 40)) {
                class168.field3198 = true;
            }
        }
        int var8 = 71 / ((93 - arg0) / 32);
        class133.field2473++;
        class49.field970.method1503(46, 2976);
        class49.field970.method214((byte) 111, arg1.method334(-61) - 1);
        class49.field970.method200(arg1.method301((byte) 106, 2), -124);
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Lbi;Ljava/net/URL;)V")
    public class118(class21 arg0, URL arg1) {
        this.field2106 = arg0.method139(arg1, 119);
        this.field2111 = 0;
        this.field2113 = class214.method1416(22624) + 30000L;
    }
}
