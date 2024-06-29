import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class32 {

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "[B")
    private byte[] field580 = new byte[4];

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "Lg;")
    private class43 field583;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
    private int field573;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "J")
    private long field575;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "Lje;")
    public static class67 field570 = class85.method592(255, "::qa_op_test");

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "Lje;")
    public static class67 field571 = class85.method592(255, "compass");

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
    public static int field574 = 0;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "[I")
    public static int[] field572 = new int[32];

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "Lje;")
    public static class67 field566 = class85.method592(255, "Verbindung konnte nicht hergestellt werden)3");

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "Lje;")
    public static class67 field565 = class85.method592(255, "Bitte versuchen Sie es in ");

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "Lje;")
    public static class67 field577 = class85.method592(255, "Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "Lje;")
    public static class67 field582 = class85.method592(255, "rot:");

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
    private int field581;

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "I")
    private int field584;

    @OriginalMember(owner = "client!ec", name = "u", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field568;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "[B")
    private byte[] field576;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "[S")
    public static short[] field567;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)[B")
    public final byte[] method203(int arg0) throws IOException {
        if (arg0 != 4) {
            method204(true);
        }
        field579++;
        if (this.field575 < class150.method1148(-85808345)) {
            throw new IOException("fdt");
        }
        if (this.field573 == 0) {
            if (this.field583.field806 == 2) {
                throw new IOException("fds");
            }
            if (this.field583.field806 == 1) {
                this.field568 = (DataInputStream) this.field583.field808;
                this.field573 = 1;
            }
        }
        if (this.field573 == 1) {
            int var2 = this.field568.available();
            if (var2 > 0) {
                if (this.field581 + var2 > 4) {
                    var2 = 4 - this.field581;
                }
                this.field581 += this.field568.read(this.field580, this.field581, var2);
                if (this.field581 == 4) {
                    int var3 = (new class91(this.field580)).method631(-123);
                    this.field576 = new byte[var3];
                    this.field573 = 2;
                }
            }
        }
        if (this.field573 == 2) {
            int var4 = this.field568.available();
            if (var4 > 0) {
                if (this.field576.length < this.field584 + var4) {
                    var4 = this.field576.length - this.field584;
                }
                this.field584 += this.field568.read(this.field576, this.field584, var4);
                if (this.field576.length == this.field584) {
                    return this.field576;
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)V")
    public static void method204(boolean arg0) {
        field571 = null;
        field566 = null;
        field567 = null;
        field572 = null;
        field570 = null;
        if (arg0) {
            method204(false);
        }
        field577 = null;
        field582 = null;
        field565 = null;
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Lq;Ljava/net/URL;)V")
    public class32(class111 arg0, URL arg1) {
        this.field583 = arg0.method882(arg1, 108);
        this.field573 = 0;
        this.field575 = class150.method1148(-85808345) + 30000L;
    }
}
