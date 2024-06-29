import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class158 {

    @OriginalMember(owner = "client!we", name = "c", descriptor = "[B")
    private byte[] field3619 = new byte[4];

    @OriginalMember(owner = "client!we", name = "b", descriptor = "Lie;")
    private class61 field3618;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    private int field3620;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "J")
    private long field3625;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "Lsc;")
    public static class128 field3622 = class129.method1017(false, "headicons_hint");

    @OriginalMember(owner = "client!we", name = "e", descriptor = "Lsc;")
    public static class128 field3621 = class129.method1017(false, "title)3jpg");

    @OriginalMember(owner = "client!we", name = "h", descriptor = "Lsc;")
    private static class128 field3624 = class129.method1017(false, "Username: ");

    @OriginalMember(owner = "client!we", name = "k", descriptor = "Lsc;")
    public static class128 field3627 = class129.method1017(false, "cross");

    @OriginalMember(owner = "client!we", name = "n", descriptor = "Lsc;")
    public static class128 field3630 = field3624;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "Lsc;")
    public static class128 field3632 = class129.method1017(false, "ams");

    @OriginalMember(owner = "client!we", name = "j", descriptor = "Lje;")
    public static class67 field3626 = new class67(5000);

    @OriginalMember(owner = "client!we", name = "t", descriptor = "Lsc;")
    public static class128 field3636 = class129.method1017(false, ":assist:");

    @OriginalMember(owner = "client!we", name = "s", descriptor = "Lsc;")
    public static class128 field3635 = class129.method1017(false, ":duelreq:");

    @OriginalMember(owner = "client!we", name = "u", descriptor = "I")
    public static int field3637 = 0;

    @OriginalMember(owner = "client!we", name = "v", descriptor = "Lsc;")
    public static class128 field3638 = class129.method1017(false, "mapedge");

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "I")
    private int field3628;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "I")
    private int field3631;

    @OriginalMember(owner = "client!we", name = "r", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field3623;

    @OriginalMember(owner = "client!we", name = "q", descriptor = "[B")
    private byte[] field3633;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)[B")
    public final byte[] method1229(int arg0) throws IOException {
        if (arg0 > -55) {
            return null;
        }
        field3617++;
        if (this.field3625 < class68.method516(false)) {
            throw new IOException("fdt");
        }
        if (this.field3620 == 0) {
            if (this.field3618.field1320 == 2) {
                throw new IOException("fds");
            }
            if (this.field3618.field1320 == 1) {
                this.field3623 = (DataInputStream) this.field3618.field1319;
                this.field3620 = 1;
            }
        }
        if (this.field3620 == 1) {
            int var2 = this.field3623.available();
            if (var2 > 0) {
                if (this.field3628 + var2 > 4) {
                    var2 = 4 - this.field3628;
                }
                this.field3628 += this.field3623.read(this.field3619, this.field3628, var2);
                if (this.field3628 == 4) {
                    int var3 = (new class86(this.field3619)).method666(1183700424);
                    this.field3620 = 2;
                    this.field3633 = new byte[var3];
                }
            }
        }
        if (this.field3620 == 2) {
            int var4 = this.field3623.available();
            if (var4 > 0) {
                if (this.field3631 + var4 > this.field3633.length) {
                    var4 = this.field3633.length - this.field3631;
                }
                this.field3631 += this.field3623.read(this.field3633, this.field3631, var4);
                if (this.field3633.length == this.field3631) {
                    return this.field3633;
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V")
    public static void method1230(byte arg0) {
        field3621 = null;
        field3626 = null;
        field3638 = null;
        field3635 = null;
        field3627 = null;
        if (arg0 != 24) {
            return;
        }
        field3624 = null;
        field3632 = null;
        field3622 = null;
        field3630 = null;
        field3636 = null;
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lbb;Ljava/net/URL;)V")
    public class158(class10 arg0, URL arg1) {
        this.field3618 = arg0.method85(arg1, 0);
        this.field3620 = 0;
        this.field3625 = class68.method516(false) + 30000L;
    }
}
