import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class780 {

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "[Lcf;")
    public static class631[] field10754 = new class631[0];

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "I")
    public static int field10755;

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "I")
    public static int field10757;

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field10756;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "([BB)[B")
    public final byte[] method4326(byte[] arg0, byte arg1) {
        field10757++;
        class403 var3 = new class403(arg0);
        var3.field5262 = arg0.length - 4;
        if (arg1 <= 86) {
            return null;
        }
        int var4 = var3.method2405(271044080);
        byte[] var5 = new byte[var4];
        var3.field5262 = 0;
        this.method4327(var3, var5, (byte) -122);
        return var5;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Les;[BB)V")
    public final void method4327(class403 arg0, byte[] arg1, byte arg2) {
        field10755++;
        if (arg0.field5275[arg0.field5262] != 31 || arg0.field5275[arg0.field5262 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field10756 == null) {
            this.field10756 = new Inflater(true);
        }
        try {
            this.field10756.setInput(arg0.field5275, arg0.field5262 + 10, -arg0.field5262 + -18 + arg0.field5275.length);
            this.field10756.inflate(arg1);
        } catch (Exception var4) {
            this.field10756.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        if (arg2 == -122) {
            this.field10756.reset();
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)V")
    public static void method4328(int arg0) {
        if (arg0 == 0) {
            field10754 = null;
        }
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "()V")
    public class780() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(III)V")
    private class780(int arg0, int arg1, int arg2) {
    }
}
