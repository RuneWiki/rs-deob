import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class3 {

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "[B")
    private byte[] field39 = new byte[4];

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "Lp;")
    private class163 field43;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
    private int field36;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "J")
    private long field37;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "Li;")
    public static class88 field27 = class208.method1425(105, "Die Adresse dieses Computers wurde gesperrt)1");

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "Li;")
    public static class88 field34 = class208.method1425(105, "null");

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public static int field26 = 5063219;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "Li;")
    public static class88 field40 = class208.method1425(105, "(Z");

    @OriginalMember(owner = "client!ab", name = "t", descriptor = "Li;")
    private static class88 field45 = class208.method1425(105, "Please enter your username)3");

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "Li;")
    public static class88 field38 = field45;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    private int field29;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
    private int field41;

    @OriginalMember(owner = "client!ab", name = "s", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "Lcc;")
    public static class26 field30;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field33;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "[B")
    private byte[] field35;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "[I")
    public static int[] field32;

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "[[I")
    public static int[][] field42;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)[B")
    public final byte[] method12(boolean arg0) throws IOException {
        field44++;
        if (this.field37 < class206.method1420(!arg0)) {
            throw new IOException("fdt");
        }
        if (!arg0) {
            method14(-86);
        }
        if (this.field36 == 0) {
            if (this.field43.field3136 == 2) {
                throw new IOException("fds");
            }
            if (this.field43.field3136 == 1) {
                this.field36 = 1;
                this.field33 = (DataInputStream) this.field43.field3131;
            }
        }
        if (this.field36 == 1) {
            int var2 = this.field33.available();
            if (var2 > 0) {
                if (var2 + this.field29 > 4) {
                    var2 = 4 - this.field29;
                }
                this.field29 += this.field33.read(this.field39, this.field29, var2);
                if (this.field29 == 4) {
                    int var3 = (new class46(this.field39)).method323((byte) -118);
                    this.field36 = 2;
                    this.field35 = new byte[var3];
                }
            }
        }
        if (this.field36 == 2) {
            int var4 = this.field33.available();
            if (var4 > 0) {
                if (this.field35.length < this.field41 + var4) {
                    var4 = this.field35.length - this.field41;
                }
                this.field41 += this.field33.read(this.field35, this.field41, var4);
                if (this.field35.length == this.field41) {
                    return this.field35;
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
    public static final void method13(byte arg0) {
        field31++;
        class231.field4333.method671(117);
        if (arg0 < -2) {
            class106.field1925.method134(50);
            class141.field2608.method134(50);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
    public static void method14(int arg0) {
        field34 = null;
        field32 = null;
        field42 = null;
        field27 = null;
        if (arg0 != -5) {
            method15(null, true, null, null);
        }
        field40 = null;
        field30 = null;
        field45 = null;
        field38 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Li;ZLi;Lnb;)[Lpf;")
    public static final class169[] method15(class88 arg0, boolean arg1, class88 arg2, class144 arg3) {
        field28++;
        if (arg1) {
            field27 = null;
        }
        int var4 = arg3.method966(arg0, (byte) -3);
        int var5 = arg3.method968(arg2, var4, 75);
        return class239.method1585(var5, arg3, var4, 1);
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lqg;Ljava/net/URL;)V")
    public class3(class181 arg0, URL arg1) {
        this.field43 = arg0.method1295(false, arg1);
        this.field36 = 0;
        this.field37 = class206.method1420(false) + 30000L;
    }
}
