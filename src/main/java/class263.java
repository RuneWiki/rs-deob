import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class263 {

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "Ljava/lang/Object;")
    public static Object field3328;

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field3329;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Liaa;[BB)V")
    public final void method1492(class452 arg0, byte[] arg1, byte arg2) {
        field3326++;
        if (arg0.field6209[arg0.field6215] != 31 || arg0.field6209[arg0.field6215 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field3329 == null) {
            this.field3329 = new Inflater(true);
        }
        try {
            this.field3329.setInput(arg0.field6209, arg0.field6215 + 10, -8 - (arg0.field6215 + 10 - arg0.field6209.length));
            this.field3329.inflate(arg1);
            int var4 = 96 / ((57 - arg2) / 41);
        } catch (Exception var5) {
            this.field3329.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field3329.reset();
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)V")
    public static void method1493(byte arg0) {
        if (arg0 != -67) {
            method1494((byte) -81, 55);
        }
        field3328 = null;
    }

    @OriginalMember(owner = "client!tr", name = "<init>", descriptor = "()V")
    public class263() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(BI)V")
    public static final void method1494(byte arg0, int arg1) {
        if (arg0 >= 105) {
            field3327++;
            class530 var2 = class242.method1402(-128, 16, arg1);
            var2.method3027((byte) -69);
        }
    }

    @OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(III)V")
    private class263(int arg0, int arg1, int arg2) {
    }
}
