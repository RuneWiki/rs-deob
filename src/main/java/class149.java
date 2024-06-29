import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class149 {

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "[I")
    public static int[] field3348 = new int[128];

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "Lr;")
    public static class118 field3351 = class153.method1136(124, "<col=ffffff> )4 ");

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "Lr;")
    public static class118 field3355 = class153.method1136(94, " )2> <col=ffff00>");

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "Lr;")
    public static class118 field3357 = class153.method1136(113, "blinken3:");

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "I")
    public static int field3361 = 0;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "Lr;")
    private static class118 field3352 = class153.method1136(125, "slide:");

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "Lr;")
    public static class118 field3356 = field3352;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "Lr;")
    public static class118 field3347 = field3352;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "Lr;")
    public static class118 field3359 = class153.method1136(102, "Bitte benutzen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    public static int field3353 = 0;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "Lff;")
    public static class42 field3360;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field3346;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "[I")
    public static int[] field3349;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "[Ln;")
    public static class90[] field3350;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
    public static void method1092(int arg0) {
        field3360 = null;
        field3355 = null;
        field3349 = null;
        field3348 = null;
        field3356 = null;
        field3347 = null;
        field3352 = null;
        field3357 = null;
        field3350 = null;
        field3359 = null;
        field3351 = null;
        if (arg0 != 18) {
            method1092(84);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lpa;I[B)V")
    public final void method1093(class105 arg0, int arg1, byte[] arg2) {
        field3358++;
        if (arg0.field2405[arg0.field2404] != 31 || arg0.field2405[arg0.field2404 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field3346 == null) {
            this.field3346 = new Inflater(true);
        }
        try {
            if (arg1 != -7810) {
                this.method1093(null, -1, null);
            }
            this.field3346.setInput(arg0.field2405, arg0.field2404 + 10, arg0.field2405.length - (arg0.field2404 + 18));
            this.field3346.inflate(arg2);
        } catch (Exception var4) {
            this.field3346.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field3346.reset();
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)V")
    public static final void method1094(int arg0) {
        class142.field3213.method394(12693);
        if (arg0 != 128) {
            field3357 = null;
        }
        field3362++;
        class72.field1676.method394(arg0 + 12565);
        class67.field1518.method394(12693);
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V")
    public class149() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(III)V")
    private class149(int arg0, int arg1, int arg2) {
    }
}
