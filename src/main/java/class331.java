import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hfa")
public class class331 {

    @OriginalMember(owner = "client!hfa", name = "b", descriptor = "Lnj;")
    public static class415 field4303 = new class415(58, 4);

    @OriginalMember(owner = "client!hfa", name = "g", descriptor = "I")
    public static int field4308 = 64;

    @OriginalMember(owner = "client!hfa", name = "e", descriptor = "Lra;")
    public static class361 field4306 = new class361(93, 3);

    @OriginalMember(owner = "client!hfa", name = "i", descriptor = "I")
    public static int field4310 = 0;

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!hfa", name = "d", descriptor = "I")
    public static int field4305;

    @OriginalMember(owner = "client!hfa", name = "f", descriptor = "Lpe;")
    public static class615 field4307;

    @OriginalMember(owner = "client!hfa", name = "h", descriptor = "Lpe;")
    public static class615 field4309;

    @OriginalMember(owner = "client!hfa", name = "c", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field4304;

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(III)Lgn;", line = 7)
    public static final class530 method1910(int arg0, int arg1, int arg2) {
        if (class483.field6438[arg0][arg1][arg2] == null) {
            boolean var3 = class483.field6438[0][arg1][arg2] != null && class483.field6438[0][arg1][arg2].field6898 != null;
            if (var3 && arg0 >= class20.field223 - 1) {
                return null;
            }
            class35.method277(arg0, arg1, arg2);
        }
        return class483.field6438[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Z[B)[B", line = 20)
    public final byte[] method1911(boolean arg0, byte[] arg1) {
        field4302++;
        if (arg0) {
            this.field4304 = null;
        }
        class418 var3 = new class418(arg1);
        var3.field5367 = arg1.length - 4;
        int var4 = var3.method2348(-58);
        byte[] var5 = new byte[var4];
        var3.field5367 = 0;
        this.method1912(var3, var5, (byte) 51);
        return var5;
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Lfd;[BB)V", line = 44)
    public final void method1912(class418 arg0, byte[] arg1, byte arg2) {
        field4305++;
        if (arg0.field5393[arg0.field5367] != 31 || arg0.field5393[arg0.field5367 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field4304 == null) {
            this.field4304 = new Inflater(true);
        }
        try {
            this.field4304.setInput(arg0.field5393, arg0.field5367 + 10, -arg0.field5367 + -10 - (8 - arg0.field5393.length));
            if (arg2 != 51) {
                return;
            }
            this.field4304.inflate(arg1);
        } catch (Exception var4) {
            this.field4304.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field4304.reset();
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(I)V", line = 70)
    public static void method1913(int arg0) {
        field4309 = null;
        if (arg0 == -10) {
            field4303 = null;
            field4307 = null;
            field4306 = null;
        }
    }

    @OriginalMember(owner = "client!hfa", name = "<init>", descriptor = "()V", line = 87)
    public class331() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!hfa", name = "<init>", descriptor = "(III)V", line = 97)
    private class331(int arg0, int arg1, int arg2) {
    }
}
