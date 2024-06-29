import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class235 {

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    public int field3390;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    private int field3395;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field3389 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    public static int field3394 = 0;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "Lfc;")
    public static class235 field3388 = new class235(112, -1);

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "Lfc;")
    public static class235 field3397 = new class235(56, 6);

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z[Ljava/lang/Object;[J)V")
    public static final void method1480(boolean arg0, Object[] arg1, long[] arg2) {
        field3387++;
        class460.method2653(arg2.length - 1, 0, arg2, arg1, 73);
        if (!arg0) {
            method1482(74, 74, null);
        }
    }

    @OriginalMember(owner = "client!fc", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3386++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)I")
    public final int method1481(boolean arg0) {
        if (arg0) {
            field3389 = null;
        }
        field3392++;
        return this.field3395;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method1482(int arg0, int arg1, String arg2) {
        class250.method1549("", "", -1, "", arg0, arg2, 0);
        field3393++;
        if (arg1 != 24658) {
            field3396 = -72;
        }
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(II)V")
    public class235(int arg0, int arg1) {
        this.field3390 = arg1;
        this.field3395 = arg0;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(Z)V")
    public static void method1483(boolean arg0) {
        field3389 = null;
        if (!arg0) {
            field3388 = null;
        }
        field3397 = null;
        field3388 = null;
    }
}
