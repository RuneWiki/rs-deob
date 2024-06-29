import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class81 {

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "[B")
    private byte[] field1451 = new byte[4];

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "Lk;")
    private class96 field1454;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    private int field1446;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "J")
    private long field1443;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public static volatile int field1441 = 0;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "Ltg;")
    public static class184 field1445 = class135.method812("Benutzen Sie die (WPasswort -=ndern(W Option", 3);

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "Lah;")
    public static class9 field1455 = new class9(4096);

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "Ltg;")
    private static class184 field1456 = class135.method812("Try again in 60 secs)3)3)3", 3);

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "Ltg;")
    public static class184 field1458 = field1456;

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "Ltg;")
    public static class184 field1457 = class135.method812("Ung-Ultige Verbindung mit einem Anmelde)2Server)3", 3);

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "Ltg;")
    private static class184 field1459 = class135.method812("Loading )2 please wait)3", 3);

    @OriginalMember(owner = "client!ib", name = "t", descriptor = "Ltg;")
    public static class184 field1460 = field1459;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
    private int field1452;

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "I")
    private int field1453;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field1442;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "[B")
    private byte[] field1444;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "[I")
    public static int[] field1449;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZI)Z")
    public static final boolean method453(boolean arg0, int arg1) {
        field1448++;
        if (arg1 < 0) {
            return false;
        }
        int var2 = class54.field960[arg1];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        if (arg0) {
            return false;
        } else {
            return var2 == 1003;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)Lqf;")
    public static final class156 method454(int arg0, int arg1) {
        field1447++;
        class156 var2 = (class156) class170.field3227.method773((long) arg0, 1);
        if (var2 != null) {
            return var2;
        } else if (arg1 == 4) {
            byte[] var3 = class145.field2621.method1249((byte) 123, arg0, 1);
            class156 var4 = new class156();
            if (var3 != null) {
                var4.method947(arg0, arg1 ^ 0x53C8, new class97(var3));
            }
            class170.field3227.method776(var4, (long) arg0, (byte) 85);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)[B")
    public final byte[] method455(byte arg0) throws IOException {
        field1450++;
        if (class24.method165(128) > this.field1443) {
            throw new IOException("fdt");
        }
        if (arg0 <= 97) {
            method456((byte) -53);
        }
        if (this.field1446 == 0) {
            if (this.field1454.field1765 == 2) {
                throw new IOException("fds");
            }
            if (this.field1454.field1765 == 1) {
                this.field1446 = 1;
                this.field1442 = (DataInputStream) this.field1454.field1767;
            }
        }
        if (this.field1446 == 1) {
            int var2 = this.field1442.available();
            if (var2 > 0) {
                if (var2 + this.field1452 > 4) {
                    var2 = 4 - this.field1452;
                }
                this.field1452 += this.field1442.read(this.field1451, this.field1452, var2);
                if (this.field1452 == 4) {
                    int var3 = (new class97(this.field1451)).method599(-16003);
                    this.field1446 = 2;
                    this.field1444 = new byte[var3];
                }
            }
        }
        if (this.field1446 == 2) {
            int var4 = this.field1442.available();
            if (var4 > 0) {
                if (this.field1444.length < this.field1453 + var4) {
                    var4 = this.field1444.length - this.field1453;
                }
                this.field1453 += this.field1442.read(this.field1444, this.field1453, var4);
                if (this.field1444.length == this.field1453) {
                    return this.field1444;
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)V")
    public static void method456(byte arg0) {
        field1445 = null;
        field1457 = null;
        field1458 = null;
        field1460 = null;
        field1456 = null;
        field1455 = null;
        field1459 = null;
        if (arg0 == -87) {
            field1449 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lpf;Ljava/net/URL;)V")
    public class81(class147 arg0, URL arg1) {
        this.field1454 = arg0.method901((byte) 123, arg1);
        this.field1446 = 0;
        this.field1443 = class24.method165(128) + 30000L;
    }
}
