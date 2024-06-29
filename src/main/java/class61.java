import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class61 {

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "[B")
    private byte[] field1246 = new byte[4];

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "Lha;")
    private class65 field1248;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
    private int field1251;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "J")
    private long field1250;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "Lb;")
    public static class11 field1243 = new class11(64);

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "Lsd;")
    public static class166 field1253 = class135.method935("Art", 0);

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "Lsd;")
    public static class166 field1254 = class135.method935("Ung-Ultiges Anmelde)2Paket)3", 0);

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "Lsd;")
    private static class166 field1255 = class135.method935("flash3:", 0);

    @OriginalMember(owner = "client!gf", name = "q", descriptor = "Lsd;")
    public static class166 field1257 = field1255;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "Lsd;")
    public static class166 field1249 = field1255;

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "Lsd;")
    public static class166 field1258 = class135.method935("headicons_pk", 0);

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
    private int field1252;

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "I")
    private int field1256;

    @OriginalMember(owner = "client!gf", name = "s", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "Lf;")
    public static class47 field1241;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field1244;

    @OriginalMember(owner = "client!gf", name = "t", descriptor = "[B")
    private byte[] field1260;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)[B")
    public final byte[] method512(byte arg0) throws IOException {
        field1259++;
        if (class100.method748((byte) 35) > this.field1250) {
            throw new IOException("fdt");
        }
        if (this.field1251 == 0) {
            if (this.field1248.field1351 == 2) {
                throw new IOException("fds");
            }
            if (this.field1248.field1351 == 1) {
                this.field1244 = (DataInputStream) this.field1248.field1352;
                this.field1251 = 1;
            }
        }
        if (this.field1251 == 1) {
            int var2 = this.field1244.available();
            if (var2 > 0) {
                if (this.field1256 + var2 > 4) {
                    var2 = 4 - this.field1256;
                }
                this.field1256 += this.field1244.read(this.field1246, this.field1256, var2);
                if (this.field1256 == 4) {
                    int var3 = (new class53(this.field1246)).method419(-4);
                    this.field1260 = new byte[var3];
                    this.field1251 = 2;
                }
            }
        }
        if (this.field1251 == 2) {
            int var4 = this.field1244.available();
            if (var4 > 0) {
                if (this.field1252 + var4 > this.field1260.length) {
                    var4 = this.field1260.length - this.field1252;
                }
                this.field1252 += this.field1244.read(this.field1260, this.field1252, var4);
                if (this.field1260.length == this.field1252) {
                    return this.field1260;
                }
            }
        }
        if (arg0 < 81) {
            method513((byte) 47);
        }
        return null;
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(B)V")
    public static void method513(byte arg0) {
        field1258 = null;
        if (arg0 != -74) {
            method513((byte) 127);
        }
        field1255 = null;
        field1249 = null;
        field1257 = null;
        field1243 = null;
        field1253 = null;
        field1241 = null;
        field1254 = null;
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lih;Ljava/net/URL;)V")
    public class61(class80 arg0, URL arg1) {
        this.field1248 = arg0.method657(arg1, (byte) 113);
        this.field1251 = 0;
        this.field1250 = class100.method748((byte) 35) + 30000L;
    }
}
