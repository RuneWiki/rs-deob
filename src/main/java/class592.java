import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class592 {

    @OriginalMember(owner = "client!et", name = "b", descriptor = "J")
    public long field8342;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "Lai;")
    private class597 field8341;

    @OriginalMember(owner = "client!et", name = "c", descriptor = "Lso;")
    public static class468 field8343 = new class468(6, 7);

    @OriginalMember(owner = "client!et", name = "f", descriptor = "Lof;")
    public static class620 field8346 = new class620(4);

    @OriginalMember(owner = "client!et", name = "d", descriptor = "I")
    public static int field8344;

    @OriginalMember(owner = "client!et", name = "e", descriptor = "I")
    public static int field8345;

    @OriginalMember(owner = "client!et", name = "g", descriptor = "I")
    public static int field8347;

    @OriginalMember(owner = "client!et", name = "h", descriptor = "[I")
    public static int[] field8348;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Z)V")
    public static void method3387(boolean arg0) {
        field8346 = null;
        field8343 = null;
        if (arg0) {
            field8343 = null;
        }
        field8348 = null;
    }

    @OriginalMember(owner = "client!et", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field8344++;
        this.field8341.method3401(this.field8342, (byte) 60);
        super.finalize();
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Lai;JI)V")
    public class592(class597 arg0, long arg1, int arg2) {
        this.field8342 = arg1;
        this.field8341 = arg0;
    }
}
