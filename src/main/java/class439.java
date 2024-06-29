import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class439 {

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "Z")
    public static boolean field6395 = true;

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "Lao;")
    public static class188 field6397 = new class188(77, 3);

    @OriginalMember(owner = "client!oo", name = "f", descriptor = "Llh;")
    public static class364 field6400 = new class364(4);

    @OriginalMember(owner = "client!oo", name = "l", descriptor = "Lao;")
    public static class188 field6406 = new class188(42, 1);

    @OriginalMember(owner = "client!oo", name = "m", descriptor = "I")
    public static int field6407 = 0;

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "I")
    public static int field6398;

    @OriginalMember(owner = "client!oo", name = "g", descriptor = "I")
    public static int field6401;

    @OriginalMember(owner = "client!oo", name = "j", descriptor = "I")
    public static int field6404;

    @OriginalMember(owner = "client!oo", name = "k", descriptor = "I")
    public static int field6405;

    @OriginalMember(owner = "client!oo", name = "e", descriptor = "J")
    public long field6399;

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "Loo;")
    public class439 field6396;

    @OriginalMember(owner = "client!oo", name = "i", descriptor = "Loo;")
    public class439 field6403;

    @OriginalMember(owner = "client!oo", name = "h", descriptor = "[[[I")
    public static int[][][] field6402;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(B)V", line = 5)
    public static void method2662(byte arg0) {
        field6400 = null;
        if (arg0 != 103) {
            field6397 = null;
        }
        field6402 = null;
        field6406 = null;
        field6397 = null;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)V", line = 19)
    public final void method2663(int arg0) {
        field6401++;
        if (arg0 >= -106) {
            this.field6403 = null;
        }
        if (this.field6396 != null) {
            this.field6396.field6403 = this.field6403;
            this.field6403.field6396 = this.field6396;
            this.field6403 = null;
            this.field6396 = null;
        }
    }

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "(I)Z", line = 39)
    public final boolean method2664(int arg0) {
        if (arg0 <= 34) {
            method2665(true);
        }
        field6404++;
        return this.field6396 != null;
    }

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "(Z)V", line = 67)
    public static final void method2665(boolean arg0) {
        if (!arg0) {
            if (class312.field4479 != 3) {
                class255.field3681 = -1;
            }
            field6398++;
        }
    }
}
