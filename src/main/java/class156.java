import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class156 {

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "Lcc;")
    public static class209 field2853 = class95.method669(122, " s(West connect-B)3");

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "Lcc;")
    public static class209 field2856 = class95.method669(90, "Librairie 3D d-Bmarr-Be");

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "Lji;")
    public static class42 field2855;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field2851;

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "()V")
    public class156() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
    public static void method1091(int arg0) {
        field2856 = null;
        if (arg0 <= 79) {
            field2854 = 11;
        }
        field2855 = null;
        field2853 = null;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Ltf;[BI)V")
    public final void method1092(class106 arg0, byte[] arg1, int arg2) {
        field2852++;
        if (arg0.field2108[arg0.field2085] != 31 || arg0.field2108[arg0.field2085 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field2851 == null) {
            this.field2851 = new Inflater(true);
        }
        if (arg2 > -1) {
            return;
        }
        try {
            this.field2851.setInput(arg0.field2108, arg0.field2085 + 10, arg0.field2108.length - (arg0.field2085 + 10 - -8));
            this.field2851.inflate(arg1);
        } catch (Exception var4) {
            this.field2851.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field2851.reset();
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(III)V")
    private class156(int arg0, int arg1, int arg2) {
    }
}
