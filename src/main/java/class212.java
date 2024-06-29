import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class212 {

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "[B")
    private byte[] field3625 = new byte[4];

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "Lbd;")
    private class22 field3622;

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "I")
    private int field3634;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "J")
    private long field3627;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "[I")
    public static int[] field3624 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "Z")
    public static boolean field3620 = false;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public static int field3618 = 0;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "[S")
    public static short[] field3630 = new short[500];

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "I")
    private int field3628;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
    private int field3633;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "Lac;")
    public static class188 field3626;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field3632;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "[B")
    private byte[] field3619;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)[B")
    public final byte[] method1419(boolean arg0) throws IOException {
        field3623++;
        if (class164.method1183((byte) 80) > this.field3627) {
            throw new IOException("fdt");
        }
        if (this.field3634 == 0) {
            if (this.field3622.field445 == 2) {
                throw new IOException("fds");
            }
            if (this.field3622.field445 == 1) {
                this.field3632 = (DataInputStream) this.field3622.field447;
                this.field3634 = 1;
            }
        }
        if (this.field3634 == 1) {
            int var2 = this.field3632.available();
            if (var2 > 0) {
                if (this.field3628 + var2 > 4) {
                    var2 = 4 - this.field3628;
                }
                this.field3628 += this.field3632.read(this.field3625, this.field3628, var2);
                if (this.field3628 == 4) {
                    int var3 = (new class216(this.field3625)).method1442(-1330139880);
                    this.field3634 = 2;
                    this.field3619 = new byte[var3];
                }
            }
        }
        if (arg0) {
            return null;
        }
        if (this.field3634 == 2) {
            int var4 = this.field3632.available();
            if (var4 > 0) {
                if (this.field3619.length < (this.field3633 + var4)) {
                    var4 = this.field3619.length - this.field3633;
                }
                this.field3633 += this.field3632.read(this.field3619, this.field3633, var4);
                if (this.field3619.length == this.field3633) {
                    return this.field3619;
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(Z)V")
    public static void method1420(boolean arg0) {
        field3626 = null;
        if (arg0) {
            field3624 = null;
            field3630 = null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BLtg;)V")
    public static final void method1421(byte arg0, class75 arg1) {
        int var2 = -66 / ((arg0 + 12) / 51);
        field3629++;
        class174.field3037 = arg1;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILtg;Ltg;)V")
    public static final void method1422(int arg0, class75 arg1, class75 arg2) {
        class103.field1825 = arg1;
        field3631++;
        class220.field3801 = arg2;
        if (arg0 > -71) {
            field3630 = null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Lkh;Ljava/net/URL;)V")
    public class212(class5 arg0, URL arg1) {
        this.field3622 = arg0.method34((byte) -127, arg1);
        this.field3634 = 0;
        this.field3627 = class164.method1183((byte) 80) + 30000L;
    }
}
