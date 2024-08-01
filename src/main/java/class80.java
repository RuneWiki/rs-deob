import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ib")
public class class80 {

    @OriginalMember(owner = "ib", name = "b", descriptor = "[B")
    private byte[] field1572 = new byte[4];

    @OriginalMember(owner = "ib", name = "o", descriptor = "Lda;")
    private class32 field1585;

    @OriginalMember(owner = "ib", name = "p", descriptor = "I")
    private int field1586;

    @OriginalMember(owner = "ib", name = "n", descriptor = "J")
    private long field1584;

    @OriginalMember(owner = "ib", name = "g", descriptor = "[I")
    public static int[] field1577 = new int[5];

    @OriginalMember(owner = "ib", name = "l", descriptor = "Llf;")
    public static class109 field1582 = class35.method275("<col=00ffff>", 2);

    @OriginalMember(owner = "ib", name = "m", descriptor = "[I")
    public static int[] field1583 = new int[128];

    @OriginalMember(owner = "ib", name = "f", descriptor = "I")
    public static int field1576 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "ib", name = "r", descriptor = "Llf;")
    public static class109 field1588 = class35.method275("Zu viele Verbindungen von Ihrer Adresse)3", 2);

    @OriginalMember(owner = "ib", name = "s", descriptor = "Z")
    public static volatile boolean field1589 = true;

    @OriginalMember(owner = "ib", name = "i", descriptor = "Llf;")
    private static class109 field1579 = class35.method275("You can(Wt add yourself to your own ignore list)3", 2);

    @OriginalMember(owner = "ib", name = "d", descriptor = "Llf;")
    public static class109 field1574 = field1579;

    @OriginalMember(owner = "ib", name = "c", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "ib", name = "h", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "ib", name = "j", descriptor = "I")
    private int field1580;

    @OriginalMember(owner = "ib", name = "k", descriptor = "I")
    private int field1581;

    @OriginalMember(owner = "ib", name = "q", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "ib", name = "a", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field1571;

    @OriginalMember(owner = "ib", name = "e", descriptor = "[B")
    private byte[] field1575;

    @OriginalMember(owner = "ib", name = "a", descriptor = "(I)V")
    public static final void method511(int arg0) {
        int var1 = 87 / ((-arg0 - 20) / 49);
        field1573++;
        if (class99.field1995.toLowerCase().indexOf("microsoft") != -1) {
            class107.field2126[188] = 71;
            class107.field2126[186] = 57;
            class107.field2126[222] = 59;
            class107.field2126[190] = 72;
            class107.field2126[191] = 73;
            class107.field2126[220] = 74;
            class107.field2126[223] = 28;
            class107.field2126[221] = 43;
            class107.field2126[192] = 58;
            class107.field2126[187] = 27;
            class107.field2126[189] = 26;
            class107.field2126[219] = 42;
            return;
        }
        class107.field2126[44] = 71;
        class107.field2126[93] = 43;
        class107.field2126[92] = 74;
        class107.field2126[47] = 73;
        if (class99.field2005 == null) {
            class107.field2126[192] = 58;
            class107.field2126[222] = 59;
        } else {
            class107.field2126[520] = 59;
            class107.field2126[192] = 28;
            class107.field2126[222] = 58;
        }
        class107.field2126[59] = 57;
        class107.field2126[61] = 27;
        class107.field2126[45] = 26;
        class107.field2126[46] = 72;
        class107.field2126[91] = 42;
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(BII)I")
    public static final int method512(byte arg0, int arg1, int arg2) {
        field1578++;
        if (arg0 < 89) {
            return 63;
        }
        int var3 = 1;
        while (arg2 > 1) {
            if ((arg2 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg1 *= arg1;
            arg2 >>= 0x1;
        }
        if (arg2 == 1) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "ib", name = "b", descriptor = "(I)[B")
    public final byte[] method513(int arg0) throws IOException {
        field1587++;
        if (this.field1584 < class123.method880(false)) {
            throw new IOException("fdt");
        }
        if (this.field1586 == 0) {
            if (this.field1585.field746 == 2) {
                throw new IOException("fds");
            }
            if (this.field1585.field746 == 1) {
                this.field1586 = 1;
                this.field1571 = (DataInputStream) this.field1585.field748;
            }
        }
        if (this.field1586 == arg0) {
            int var2 = this.field1571.available();
            if (var2 > 0) {
                if (this.field1581 + var2 > 4) {
                    var2 = 4 - this.field1581;
                }
                this.field1581 += this.field1571.read(this.field1572, this.field1581, var2);
                if (this.field1581 == 4) {
                    int var3 = (new class86(this.field1572)).method582(15);
                    this.field1575 = new byte[var3];
                    this.field1586 = 2;
                }
            }
        }
        if (this.field1586 == 2) {
            int var4 = this.field1571.available();
            if (var4 > 0) {
                if (this.field1580 + var4 > this.field1575.length) {
                    var4 = this.field1575.length - this.field1580;
                }
                this.field1580 += this.field1571.read(this.field1575, this.field1580, var4);
                if (this.field1575.length == this.field1580) {
                    return this.field1575;
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "ib", name = "c", descriptor = "(I)V")
    public static void method514(int arg0) {
        field1582 = null;
        field1583 = null;
        field1579 = null;
        if (arg0 != -9855) {
            method511(-26);
        }
        field1574 = null;
        field1577 = null;
        field1588 = null;
    }

    @OriginalMember(owner = "ib", name = "<init>", descriptor = "(Lke;Ljava/net/URL;)V")
    public class80(class99 arg0, URL arg1) {
        this.field1585 = arg0.method699(arg1, -896798992);
        this.field1586 = 0;
        this.field1584 = class123.method880(false) + 30000L;
    }
}
