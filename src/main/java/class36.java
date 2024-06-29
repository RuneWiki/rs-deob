import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public class class36 {

    @OriginalMember(owner = "client!wca", name = "h", descriptor = "I")
    public static int field566 = 0;

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!wca", name = "c", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!wca", name = "d", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!wca", name = "e", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!wca", name = "f", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!wca", name = "g", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!wca", name = "i", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!wca", name = "j", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field560;

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(I[B)[B", line = 7)
    public final byte[] method211(int arg0, byte[] arg1) {
        field561++;
        class540 var3 = new class540(arg1);
        var3.field7956 = arg1.length - 4;
        int var4 = var3.method3152(-420259288);
        if (arg0 != 7397) {
            this.field560 = null;
        }
        byte[] var5 = new byte[var4];
        var3.field7956 = 0;
        this.method215(var3, (byte) 115, var5);
        return var5;
    }

    @OriginalMember(owner = "client!wca", name = "<init>", descriptor = "()V", line = 33)
    public class36() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(IC)Z", line = 36)
    public static final boolean method212(int arg0, char arg1) {
        if (arg0 == -28476) {
            field563++;
            return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(IILjava/lang/String;)V", line = 50)
    public static final void method213(int arg0, int arg1, String arg2) {
        class46.method275("", arg1, arg2, "", 255, "", arg0);
        field564++;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(BI)C", line = 61)
    public static final char method214(byte arg0, int arg1) {
        field568++;
        int var2 = arg0 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (~var2 <= arg1 && var2 < 160) {
            char var3 = class330.field4795[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lgk;B[B)V", line = 87)
    public final void method215(class540 arg0, byte arg1, byte[] arg2) {
        field562++;
        if (arg1 < 82) {
            method214((byte) -99, 69);
        }
        if (arg0.field7952[arg0.field7956] != 31 || arg0.field7952[arg0.field7956 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field560 == null) {
            this.field560 = new Inflater(true);
        }
        try {
            this.field560.setInput(arg0.field7952, arg0.field7956 + 10, arg0.field7952.length + -arg0.field7956 - 10 + -8);
            this.field560.inflate(arg2);
        } catch (Exception var4) {
            this.field560.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field560.reset();
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(III)I", line = 113)
    public static final int method216(int arg0, int arg1, int arg2) {
        int var3 = (arg2 & arg0) * arg1 >> 7;
        field565++;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!wca", name = "<init>", descriptor = "(III)V", line = 135)
    private class36(int arg0, int arg1, int arg2) {
    }
}
