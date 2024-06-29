import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!efa")
public class class324 {

    @OriginalMember(owner = "client!efa", name = "d", descriptor = "I")
    public int field4507;

    @OriginalMember(owner = "client!efa", name = "e", descriptor = "Lqda;")
    private class689 field4508;

    @OriginalMember(owner = "client!efa", name = "c", descriptor = "I")
    private int field4506;

    @OriginalMember(owner = "client!efa", name = "b", descriptor = "I")
    public int field4505;

    @OriginalMember(owner = "client!efa", name = "f", descriptor = "Lefa;")
    public static class324 field4509 = new class324(0, 3, class689.field9775);

    @OriginalMember(owner = "client!efa", name = "g", descriptor = "Lefa;")
    public static class324 field4510 = new class324(1, 3, class689.field9775);

    @OriginalMember(owner = "client!efa", name = "i", descriptor = "Lefa;")
    public static class324 field4512 = new class324(2, 4, class689.field9771);

    @OriginalMember(owner = "client!efa", name = "j", descriptor = "Lefa;")
    public static class324 field4513 = new class324(3, 1, class689.field9775);

    @OriginalMember(owner = "client!efa", name = "k", descriptor = "Lefa;")
    public static class324 field4514 = new class324(4, 2, class689.field9775);

    @OriginalMember(owner = "client!efa", name = "l", descriptor = "Lefa;")
    public static class324 field4515 = new class324(5, 3, class689.field9775);

    @OriginalMember(owner = "client!efa", name = "m", descriptor = "Lefa;")
    public static class324 field4516 = new class324(6, 4, class689.field9775);

    @OriginalMember(owner = "client!efa", name = "n", descriptor = "I")
    public static int field4517 = class122.method983(16, -257);

    @OriginalMember(owner = "client!efa", name = "p", descriptor = "Z")
    public static boolean field4519 = false;

    @OriginalMember(owner = "client!efa", name = "o", descriptor = "I")
    public static int field4518 = 0;

    @OriginalMember(owner = "client!efa", name = "r", descriptor = "I")
    public static int field4521 = -1;

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!efa", name = "h", descriptor = "I")
    public static int field4511;

    @OriginalMember(owner = "client!efa", name = "q", descriptor = "[I")
    public static int[] field4520;

    @OriginalMember(owner = "client!efa", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4504++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(IB)Lefa;")
    public static final class324 method1938(int arg0, byte arg1) {
        field4511++;
        if (arg1 < 37) {
            method1939(-116);
        }
        if (arg0 == 0) {
            return field4509;
        } else if (arg0 == 1) {
            return field4510;
        } else if (arg0 == 2) {
            return field4512;
        } else if (arg0 == 3) {
            return field4513;
        } else if (arg0 == 4) {
            return field4514;
        } else if (arg0 == 5) {
            return field4515;
        } else if (arg0 == 6) {
            return field4516;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(I)V")
    public static void method1939(int arg0) {
        field4516 = null;
        field4509 = null;
        field4510 = null;
        field4513 = null;
        if (arg0 != -17345) {
            method1939(-7);
        }
        field4520 = null;
        field4512 = null;
        field4515 = null;
        field4514 = null;
    }

    @OriginalMember(owner = "client!efa", name = "<init>", descriptor = "(IILqda;)V")
    private class324(int arg0, int arg1, class689 arg2) {
        this.field4507 = arg0;
        this.field4508 = arg2;
        this.field4506 = arg1;
        this.field4505 = this.field4508.field9764 * this.field4506;
        if (this.field4507 >= 16) {
            throw new RuntimeException();
        }
    }
}
