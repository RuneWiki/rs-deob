import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class152 {

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "Z")
    public static boolean field2458 = false;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
    public static int field2461 = 0;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
    public static int field2460;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "Ld;")
    public static class238 field2459;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field2462;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "[I")
    public static int[] field2464;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)I")
    public static final int method1060(int arg0, int arg1) {
        field2463++;
        if (arg0 != 8) {
            field2464 = null;
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V")
    public static void method1061(int arg0) {
        field2459 = null;
        field2464 = null;
        int var1 = -1 / ((arg0 - 22) / 39);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Log;I[B)V")
    public final void method1062(class221 arg0, int arg1, byte[] arg2) {
        field2466++;
        if (arg0.field3653[arg0.field3655] != 31 || arg0.field3653[arg0.field3655 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field2462 == null) {
            this.field2462 = new Inflater(true);
        }
        try {
            this.field2462.setInput(arg0.field3653, arg0.field3655 + 10, arg0.field3653.length - (arg0.field3655 - -10 + 8));
            this.field2462.inflate(arg2);
        } catch (Exception var4) {
            this.field2462.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        if (arg1 != -7494) {
            field2458 = true;
        }
        this.field2462.reset();
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(III)V")
    private class152(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V")
    public class152() {
        this(-1, 1000000, 1000000);
    }
}
