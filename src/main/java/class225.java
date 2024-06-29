import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class225 {

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "[B")
    private byte[] field3877 = new byte[4];

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "Lni;")
    private class118 field3874;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    private int field3878;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "J")
    private long field3881;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
    public static int field3883 = 0;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "Lsc;")
    public static class181 field3879 = class149.method967(255, "(U5");

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "Lsc;")
    public static class181 field3880 = class149.method967(255, "::rebuild");

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
    private int field3885;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
    private int field3886;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field3884;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "[B")
    private byte[] field3875;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)[B")
    public final byte[] method1482(boolean arg0) throws IOException {
        field3876++;
        if (!arg0) {
            return null;
        } else if (class213.method1414(-9292) > this.field3881) {
            throw new IOException("fdt");
        } else {
            if (this.field3878 == 0) {
                if (this.field3874.field1933 == 2) {
                    throw new IOException("fds");
                }
                if (this.field3874.field1933 == 1) {
                    this.field3878 = 1;
                    this.field3884 = (DataInputStream) this.field3874.field1935;
                }
            }
            if (this.field3878 == 1) {
                int var2 = this.field3884.available();
                if (var2 > 0) {
                    if (this.field3885 + var2 > 4) {
                        var2 = 4 - this.field3885;
                    }
                    this.field3885 += this.field3884.read(this.field3877, this.field3885, var2);
                    if (this.field3885 == 4) {
                        int var3 = (new class230(this.field3877)).method1529(-32494);
                        this.field3875 = new byte[var3];
                        this.field3878 = 2;
                    }
                }
            }
            if (this.field3878 == 2) {
                int var4 = this.field3884.available();
                if (var4 > 0) {
                    if (this.field3875.length < (var4 + this.field3886)) {
                        var4 = this.field3875.length - this.field3886;
                    }
                    this.field3886 += this.field3884.read(this.field3875, this.field3886, var4);
                    if (this.field3875.length == this.field3886) {
                        return this.field3875;
                    }
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V")
    public static void method1483(byte arg0) {
        field3880 = null;
        if (arg0 <= -72) {
            field3879 = null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lej;Ljava/net/URL;)V")
    public class225(class142 arg0, URL arg1) {
        this.field3874 = arg0.method912(arg1, true);
        this.field3878 = 0;
        this.field3881 = class213.method1414(-9292) + 30000L;
    }
}
