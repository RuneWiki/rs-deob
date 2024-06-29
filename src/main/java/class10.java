import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class10 {

    @OriginalMember(owner = "client!b", name = "t", descriptor = "[B")
    private byte[] field205 = new byte[4];

    @OriginalMember(owner = "client!b", name = "z", descriptor = "Ldd;")
    private class32 field211;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "I")
    private int field192;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "J")
    private long field193;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "Lcd;")
    private static class23 field190 = class54.method414("Please enter your password)3", -1);

    @OriginalMember(owner = "client!b", name = "l", descriptor = "[[B")
    public static byte[][] field197 = new byte[250][];

    @OriginalMember(owner = "client!b", name = "j", descriptor = "Lcd;")
    private static class23 field195 = class54.method414("Loaded textures", -1);

    @OriginalMember(owner = "client!b", name = "n", descriptor = "Lcd;")
    public static class23 field199 = class54.method414(":trade:", -1);

    @OriginalMember(owner = "client!b", name = "k", descriptor = "I")
    public static int field196 = 0;

    @OriginalMember(owner = "client!b", name = "r", descriptor = "[[I")
    public static int[][] field203 = new int[104][104];

    @OriginalMember(owner = "client!b", name = "c", descriptor = "Lcd;")
    public static class23 field188 = field190;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "Lcd;")
    private static class23 field186 = class54.method414("Connecting to update server", -1);

    @OriginalMember(owner = "client!b", name = "s", descriptor = "Lcd;")
    public static class23 field204 = field195;

    @OriginalMember(owner = "client!b", name = "x", descriptor = "Lcd;")
    public static class23 field209 = field186;

    @OriginalMember(owner = "client!b", name = "y", descriptor = "Lcf;")
    public static class25 field210 = new class25();

    @OriginalMember(owner = "client!b", name = "b", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "I")
    private int field194;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!b", name = "p", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!b", name = "w", descriptor = "I")
    private int field208;

    @OriginalMember(owner = "client!b", name = "q", descriptor = "Lva;")
    public static class189 field202;

    @OriginalMember(owner = "client!b", name = "v", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field207;

    @OriginalMember(owner = "client!b", name = "u", descriptor = "[B")
    private byte[] field206;

    @OriginalMember(owner = "client!b", name = "o", descriptor = "[Loe;")
    public static class130[] field200;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V")
    public static final void method57(byte arg0) {
        class200.field3955++;
        field198++;
        class159.field3190.method631(83, -1);
        for (class115 var1 = (class115) class31.field665.method264(96); var1 != null; var1 = (class115) class31.field665.method259(-31)) {
            if (var1.field2400 == 0 || var1.field2400 == 3) {
                class51.method400(var1, 69, true);
            }
        }
        if (class72.field1644 != null) {
            class3.method12(class72.field1644, false);
            class72.field1644 = null;
        }
        int var2 = 36 % ((arg0 - 44) / 58);
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(B)[B")
    public final byte[] method58(byte arg0) throws IOException {
        field191++;
        if (this.field193 < class30.method224((byte) 95)) {
            throw new IOException("fdt");
        }
        if (this.field192 == 0) {
            if (this.field211.field686 == 2) {
                throw new IOException("fds");
            }
            if (this.field211.field686 == 1) {
                this.field207 = (DataInputStream) this.field211.field683;
                this.field192 = 1;
            }
        }
        if (arg0 != -86) {
            this.field192 = -32;
        }
        if (this.field192 == 1) {
            int var2 = this.field207.available();
            if (var2 > 0) {
                if (this.field194 + var2 > 4) {
                    var2 = 4 - this.field194;
                }
                this.field194 += this.field207.read(this.field205, this.field194, var2);
                if (this.field194 == 4) {
                    int var3 = (new class189(this.field205)).method1190(-4);
                    this.field192 = 2;
                    this.field206 = new byte[var3];
                }
            }
        }
        if (this.field192 == 2) {
            int var4 = this.field207.available();
            if (var4 > 0) {
                if (this.field208 + var4 > this.field206.length) {
                    var4 = this.field206.length - this.field208;
                }
                this.field208 += this.field207.read(this.field206, this.field208, var4);
                if (this.field206.length == this.field208) {
                    return this.field206;
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)I")
    public static final int method59(int arg0) {
        field189++;
        int var1 = class203.method1330((byte) -88, class115.field2404, class119.field2452, class59.field1385);
        if (var1 - class122.field2530 >= 800 || (class53.field1253[class59.field1385][class119.field2452 >> 7][class115.field2404 >> 7] & 0x4) == 0) {
            if (arg0 >= -5) {
                method62(23);
            }
            return 3;
        } else {
            return class59.field1385;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(II)Z")
    public static final boolean method60(int arg0, int arg1) {
        field201++;
        if (arg1 == -91) {
            return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(I)V")
    public static void method61(int arg0) {
        field200 = null;
        field204 = null;
        field197 = null;
        if (arg0 != 19177) {
            return;
        }
        field209 = null;
        field203 = null;
        field195 = null;
        field199 = null;
        field190 = null;
        field210 = null;
        field186 = null;
        field202 = null;
        field188 = null;
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(I)Loe;")
    public static final class130 method62(int arg0) {
        field187++;
        class130 var1 = new class130();
        int var2 = -45 / ((75 - arg0) / 35);
        var1.field2703 = class194.field3836;
        var1.field2700 = class107.field2287[0];
        var1.field2706 = class72.field1652[0];
        var1.field2699 = class15.field329[0];
        var1.field2701 = class109.field2311[0];
        var1.field2702 = class129.field2698[0];
        var1.field2704 = class133.field2756;
        var1.field2705 = class167.field3328;
        class175.method1101(-113);
        return var1;
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lpc;Ljava/net/URL;)V")
    public class10(class137 arg0, URL arg1) {
        this.field211 = arg0.method876(4, arg1);
        this.field192 = 0;
        this.field193 = class30.method224((byte) 95) + 30000L;
    }
}
