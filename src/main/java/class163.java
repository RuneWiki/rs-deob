import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class163 {

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "[B")
    private byte[] field2786 = new byte[4];

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "Lfb;")
    private class9 field2789;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
    private int field2793;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "J")
    private long field2790;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "Lij;")
    public static class50 field2785 = class78.method578(127, "not yet implemented");

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "Z")
    public static boolean field2783 = false;

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "I")
    public static int field2794 = 0;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "I")
    private int field2792;

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "I")
    private int field2796;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "Lfb;")
    public static class9 field2797;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field2791;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "[B")
    private byte[] field2788;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V")
    public static void method1138(byte arg0) {
        if (arg0 < 97) {
            field2797 = null;
        }
        field2797 = null;
        field2785 = null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lda;BLda;)V")
    public static final void method1139(class22 arg0, byte arg1, class22 arg2) {
        class159.field2742 = arg2;
        if (arg1 != 21) {
            field2783 = false;
        }
        field2784++;
        class45.field827 = arg0;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IZ)I")
    public static final int method1140(int arg0, boolean arg1) {
        if (arg1) {
            return 55;
        }
        field2795++;
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var3 = arg0 * 6 - 61440;
        int var4 = (arg0 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V")
    public static final void method1141(int arg0) {
        for (int var1 = arg0; var1 < class255.field4404; var1++) {
            class258 var2 = class16.method128(false, var1);
            if (var2 != null && var2.field4488 == 0) {
                class70.field1360[var1] = 0;
                class54.field968[var1] = 0;
            }
        }
        field2787++;
        class207.field3433 = new class56(16);
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)[B")
    public final byte[] method1142(int arg0) throws IOException {
        field2798++;
        if (this.field2790 < class104.method785(arg0 ^ 0xFFFFFFFD)) {
            throw new IOException("fdt");
        }
        if (this.field2793 == 0) {
            if (this.field2789.field133 == 2) {
                throw new IOException("fds");
            }
            if (this.field2789.field133 == 1) {
                this.field2793 = 1;
                this.field2791 = (DataInputStream) this.field2789.field132;
            }
        }
        if (this.field2793 == 1) {
            int var2 = this.field2791.available();
            if (var2 > 0) {
                if (this.field2796 + var2 > 4) {
                    var2 = 4 - this.field2796;
                }
                this.field2796 += this.field2791.read(this.field2786, this.field2796, var2);
                if (this.field2796 == 4) {
                    int var3 = (new class217(this.field2786)).method1466((byte) -15);
                    this.field2793 = 2;
                    this.field2788 = new byte[var3];
                }
            }
        }
        if (this.field2793 == 2) {
            int var4 = this.field2791.available();
            if (var4 > 0) {
                if (this.field2792 + var4 > this.field2788.length) {
                    var4 = this.field2788.length - this.field2792;
                }
                this.field2792 += this.field2791.read(this.field2788, this.field2792, var4);
                if (this.field2788.length == this.field2792) {
                    return this.field2788;
                }
            }
        }
        if (arg0 != 2) {
            method1138((byte) 119);
        }
        return null;
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Ln;Ljava/net/URL;)V")
    public class163(class138 arg0, URL arg1) {
        this.field2789 = arg0.method957(arg1, (byte) 110);
        this.field2793 = 0;
        this.field2790 = class104.method785(-1) + 30000L;
    }
}
