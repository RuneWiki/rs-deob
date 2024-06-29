import java.awt.Canvas;
import java.awt.event.FocusListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class240 extends Canvas implements FocusListener {

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "Lcc;")
    public static class327 field3488 = new class327(64);

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "Lic;")
    public static class329 field3489 = new class329(32);

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "Lwa;")
    public static class177 field3490 = new class177(5000);

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "[[Lih;")
    public static class70[][] field3491;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V", line = 7)
    public static void method1703(byte arg0) {
        field3490 = null;
        field3488 = null;
        field3491 = (class70[][]) null;
        field3489 = null;
        if (arg0 != 25) {
            field3488 = (class327) null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(III)I", line = 20)
    public static final int method1704(int arg0, int arg1, int arg2) {
        field3483++;
        if (arg1 != 20244) {
            method1705(-33);
        }
        int var3 = arg2 >>> 31;
        return (arg2 + var3) / arg0 - var3;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)Z", line = 44)
    public static final boolean method1705(int arg0) {
        if (arg0 != 4) {
            return false;
        }
        field3482++;
        if (class49.field658) {
            try {
                class200.method1469(class157.field2216.field883, -18278, "showVideoAd");
                return true;
            } catch (Throwable var2) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)V", line = 90)
    public static final void method1706(int arg0, int arg1) {
        field3485++;
        class211.field2982 = arg1;
        class270.method1840(false, arg0);
        class270.method1840(false, 4);
    }
}
