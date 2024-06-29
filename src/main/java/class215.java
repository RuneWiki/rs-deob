import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class215 {

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "I")
    public static int field3441 = 0;

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
    public static int field3438 = 0;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "[Lrn;")
    public static class294[] field3437 = new class294[14];

    @OriginalMember(owner = "client!qm", name = "h", descriptor = "[I")
    public static int[] field3444 = new int[100];

    @OriginalMember(owner = "client!qm", name = "i", descriptor = "I")
    public static int field3445 = -1;

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "[I")
    public static int[] field3439 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!qm", name = "g", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!qm", name = "j", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!qm", name = "k", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!qm", name = "l", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V", line = 10)
    public static void method1442(int arg0) {
        field3437 = null;
        field3444 = null;
        field3439 = null;
        if (arg0 < 120) {
            method1446((class124) null, (byte) -50, (Object) null);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(II)V", line = 26)
    public static final void method1443(int arg0, int arg1) {
        if (arg0 != 1001) {
            return;
        }
        field3448++;
        class281 var2 = (class281) class21.field449.method303((long) arg1, (byte) 111);
        if (var2 != null) {
            var2.method278((byte) -105);
        }
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)V", line = 47)
    public static final void method1444(int arg0) {
        class147.field2415.method1877(arg0 - 29651);
        field3440++;
        if (arg0 != -51) {
            method1446((class124) null, (byte) 37, (Object) null);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILag;)Lcf;", line = 75)
    public static final class70 method1445(int arg0, class202 arg1) {
        if (arg0 != -1) {
            method1443(101, -123);
        }
        field3446++;
        return new class70(arg1.method1356(false), arg1.method1356(false), arg1.method1356(false), arg1.method1356(false), arg1.method1352((byte) -109), arg1.method1317((byte) -103));
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lte;BLjava/lang/Object;)V", line = 91)
    public static final void method1446(class124 arg0, byte arg1, Object arg2) {
        field3443++;
        if (arg0.field2143 == null || arg1 != -105) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg0.field2143.peekEvent() != null; var3++) {
            class127.method843(arg1 + 62, 1L);
        }
        if (arg2 != null) {
            arg0.field2143.postEvent(new ActionEvent(arg2, 1001, "dummy"));
        }
    }
}
