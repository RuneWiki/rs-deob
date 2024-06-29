import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class422 {

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "Lmh;")
    private class537 field5447;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "J")
    public long field5446;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "Lvj;")
    public static class373 field5449 = new class373(69, -1);

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "Lrg;")
    public static class548 field5450 = new class548(0, 4);

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "I")
    public static int field5452 = 104;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
    public static int field5445;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
    public static int field5448;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "[[B")
    public static byte[][] field5451;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BII)Z")
    public static final boolean method2391(byte arg0, int arg1, int arg2) {
        if (arg0 != 62) {
            method2391((byte) 103, 51, -66);
        }
        field5448++;
        return false;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V")
    public static void method2392(int arg0) {
        if (arg0 == -1) {
            field5449 = null;
            field5451 = null;
            field5450 = null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field5445++;
        this.field5447.method3088(this.field5446, 0);
        super.finalize();
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lmh;J[Lnt;)V")
    public class422(class537 arg0, long arg1, class187[] arg2) {
        this.field5447 = arg0;
        this.field5446 = arg1;
    }
}
