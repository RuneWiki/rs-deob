import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class324 {

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "Lgo;")
    public static class441 field4629 = new class441(12, 0, 1, 0);

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field4630;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V")
    public static void method2009(byte arg0) {
        if (arg0 == 94) {
            field4629 = null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "()V")
    public class324() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(III)V")
    private class324(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Ldh;I[B)V")
    public final void method2010(class209 arg0, int arg1, byte[] arg2) {
        field4631++;
        if (arg0.field3036[arg0.field3037] != 31 || arg0.field3036[arg0.field3037 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field4630 == null) {
            this.field4630 = new Inflater(true);
        }
        try {
            if (arg1 < 13) {
                this.field4630 = null;
            }
            this.field4630.setInput(arg0.field3036, arg0.field3037 + 10, arg0.field3036.length + -8 + -10 + -arg0.field3037);
            this.field4630.inflate(arg2);
        } catch (Exception var4) {
            this.field4630.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field4630.reset();
    }
}
