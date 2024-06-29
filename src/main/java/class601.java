import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bha")
public class class601 {

    @OriginalMember(owner = "client!bha", name = "d", descriptor = "I")
    public int field8398;

    @OriginalMember(owner = "client!bha", name = "e", descriptor = "I")
    private int field8399;

    @OriginalMember(owner = "client!bha", name = "g", descriptor = "Lso;")
    private class497 field8401;

    @OriginalMember(owner = "client!bha", name = "b", descriptor = "I")
    public int field8396;

    @OriginalMember(owner = "client!bha", name = "f", descriptor = "Lbha;")
    public static class601 field8400 = new class601(0, 3, class497.field6803);

    @OriginalMember(owner = "client!bha", name = "h", descriptor = "Lbha;")
    public static class601 field8402 = new class601(1, 3, class497.field6803);

    @OriginalMember(owner = "client!bha", name = "i", descriptor = "Lbha;")
    public static class601 field8403 = new class601(2, 4, class497.field6799);

    @OriginalMember(owner = "client!bha", name = "j", descriptor = "Lbha;")
    public static class601 field8404 = new class601(3, 1, class497.field6803);

    @OriginalMember(owner = "client!bha", name = "k", descriptor = "Lbha;")
    public static class601 field8405 = new class601(4, 2, class497.field6803);

    @OriginalMember(owner = "client!bha", name = "l", descriptor = "Lbha;")
    public static class601 field8406 = new class601(5, 3, class497.field6803);

    @OriginalMember(owner = "client!bha", name = "m", descriptor = "Lbha;")
    public static class601 field8407 = new class601(6, 4, class497.field6803);

    @OriginalMember(owner = "client!bha", name = "n", descriptor = "I")
    public static int field8408 = class750.method4165(255, 16);

    @OriginalMember(owner = "client!bha", name = "o", descriptor = "Lfja;")
    public static class783 field8409 = new class783(12, -2);

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "I")
    public static int field8395;

    @OriginalMember(owner = "client!bha", name = "c", descriptor = "I")
    public static int field8397;

    @OriginalMember(owner = "client!bha", name = "p", descriptor = "Lrh;")
    public static class280 field8410;

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(B)V")
    public static void method3407(byte arg0) {
        field8403 = null;
        field8410 = null;
        field8400 = null;
        field8405 = null;
        field8402 = null;
        field8406 = null;
        field8404 = null;
        if (arg0 <= 92) {
            method3407((byte) 96);
        }
        field8407 = null;
        field8409 = null;
    }

    @OriginalMember(owner = "client!bha", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8395++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(II)Lbha;")
    public static final class601 method3408(int arg0, int arg1) {
        field8397++;
        if (arg0 != 3) {
            method3408(-113, -47);
        }
        if (arg1 == 0) {
            return field8400;
        } else if (arg1 == 1) {
            return field8402;
        } else if (arg1 == 2) {
            return field8403;
        } else if (arg1 == 3) {
            return field8404;
        } else if (arg1 == 4) {
            return field8405;
        } else if (arg1 == 5) {
            return field8406;
        } else if (arg1 == 6) {
            return field8407;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bha", name = "<init>", descriptor = "(IILso;)V")
    private class601(int arg0, int arg1, class497 arg2) {
        this.field8398 = arg0;
        this.field8399 = arg1;
        this.field8401 = arg2;
        this.field8396 = this.field8401.field6795 * this.field8399;
        if (this.field8398 >= 16) {
            throw new RuntimeException();
        }
    }
}
