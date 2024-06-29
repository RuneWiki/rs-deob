import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class148 {

    @OriginalMember(owner = "client!mh", name = "n", descriptor = "[B")
    private byte[] field2755 = new byte[4];

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "Lue;")
    private class86 field2744;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "I")
    private int field2747;

    @OriginalMember(owner = "client!mh", name = "q", descriptor = "J")
    private long field2758;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "Lhj;")
    public static class69 field2742 = class181.method1318("VOLL", (byte) -106);

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "Lhj;")
    private static class69 field2748 = class181.method1318("Tue", (byte) -113);

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "Lhj;")
    private static class69 field2749 = class181.method1318("Wed", (byte) -108);

    @OriginalMember(owner = "client!mh", name = "m", descriptor = "Lhj;")
    public static class69 field2754 = class181.method1318("; Expires=", (byte) -116);

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "[I")
    public static int[] field2745 = new int[2];

    @OriginalMember(owner = "client!mh", name = "s", descriptor = "Lhj;")
    private static class69 field2760 = class181.method1318("Mon", (byte) -124);

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "I")
    public static int field2746 = 5063219;

    @OriginalMember(owner = "client!mh", name = "p", descriptor = "Lhj;")
    private static class69 field2757 = class181.method1318("Fri", (byte) -125);

    @OriginalMember(owner = "client!mh", name = "w", descriptor = "Lhj;")
    private static class69 field2764 = class181.method1318("Thu", (byte) -119);

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "Lhj;")
    public static class69 field2751 = class181.method1318("titlebg", (byte) -127);

    @OriginalMember(owner = "client!mh", name = "o", descriptor = "Lhj;")
    private static class69 field2756 = class181.method1318("Sat", (byte) -127);

    @OriginalMember(owner = "client!mh", name = "r", descriptor = "Lhj;")
    private static class69 field2759 = class181.method1318("Sun", (byte) -127);

    @OriginalMember(owner = "client!mh", name = "z", descriptor = "I")
    public static int field2767 = 0;

    @OriginalMember(owner = "client!mh", name = "u", descriptor = "[Lhj;")
    public static class69[] field2762 = new class69[] { field2759, field2760, field2748, field2749, field2764, field2757, field2756 };

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "I")
    private int field2752;

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!mh", name = "t", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!mh", name = "v", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!mh", name = "A", descriptor = "I")
    private int field2768;

    @OriginalMember(owner = "client!mh", name = "y", descriptor = "J")
    public static long field2766;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field2743;

    @OriginalMember(owner = "client!mh", name = "x", descriptor = "[B")
    private byte[] field2765;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)[B")
    public final byte[] method1117(byte arg0) throws IOException {
        field2761++;
        if (arg0 != 46) {
            field2742 = null;
        }
        if (this.field2758 < class223.method1584(-25392)) {
            throw new IOException("fdt");
        }
        if (this.field2747 == 0) {
            if (this.field2744.field1663 == 2) {
                throw new IOException("fds");
            }
            if (this.field2744.field1663 == 1) {
                this.field2743 = (DataInputStream) this.field2744.field1666;
                this.field2747 = 1;
            }
        }
        if (this.field2747 == 1) {
            int var2 = this.field2743.available();
            if (var2 > 0) {
                if (this.field2752 + var2 > 4) {
                    var2 = 4 - this.field2752;
                }
                this.field2752 += this.field2743.read(this.field2755, this.field2752, var2);
                if (this.field2752 == 4) {
                    int var3 = (new class128(this.field2755)).method923(true);
                    this.field2765 = new byte[var3];
                    this.field2747 = 2;
                }
            }
        }
        if (this.field2747 == 2) {
            int var4 = this.field2743.available();
            if (var4 > 0) {
                if (this.field2765.length < (this.field2768 + var4)) {
                    var4 = this.field2765.length - this.field2768;
                }
                this.field2768 += this.field2743.read(this.field2765, this.field2768, var4);
                if (this.field2765.length == this.field2768) {
                    return this.field2765;
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V")
    public static void method1118(int arg0) {
        field2751 = null;
        field2759 = null;
        field2754 = null;
        field2748 = null;
        field2742 = null;
        field2762 = null;
        field2764 = null;
        field2745 = null;
        field2756 = null;
        field2757 = null;
        field2749 = null;
        field2760 = null;
        if (arg0 != 5063219) {
            field2751 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Lsd;Ljava/net/URL;)V")
    public class148(class42 arg0, URL arg1) {
        this.field2744 = arg0.method238(arg1, 6330);
        this.field2747 = 0;
        this.field2758 = class223.method1584(-25392) + 30000L;
    }
}
