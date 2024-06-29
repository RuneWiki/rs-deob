import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class626 {

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "Lmr;")
    private class221 field8844;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "J")
    public long field8842;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "Z")
    public static volatile boolean field8845 = false;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "[[Z")
    public static boolean[][] field8846 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "Lce;")
    public static class445 field8849 = new class445(7500);

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
    public static int field8843;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
    public static int field8847;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "J")
    public static long field8848;

    @OriginalMember(owner = "client!uj", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field8847++;
        this.field8844.method1324(this.field8842, 55);
        super.finalize();
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V")
    public static void method3520(byte arg0) {
        field8849 = null;
        if (arg0 > -92) {
            field8849 = null;
        }
        field8846 = null;
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(Lmr;J[Lsi;)V")
    public class626(class221 arg0, long arg1, class141[] arg2) {
        this.field8844 = arg0;
        this.field8842 = arg1;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZII)V")
    public static final void method3521(boolean arg0, int arg1, int arg2) {
        field8843++;
        class628 var3 = class555.method3150(arg2, 0, arg0);
        if (arg1 >= -12) {
            field8848 = -66L;
        }
        if (var3 != null) {
            var3.method1922(93);
        }
    }
}
