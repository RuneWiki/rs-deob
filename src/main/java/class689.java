import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class689 {

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "Lgk;")
    public static class616 field9697 = new class616();

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "[Z")
    public static boolean[] field9699 = new boolean[5];

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
    public static int field9700 = 0;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "I")
    public static int field9702 = 64;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
    public static int field9693;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    public static int field9694;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    public static int field9696;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "I")
    public static int field9698;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "I")
    public static int field9701;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "Lel;")
    public static class184 field9695;

    @OriginalMember(owner = "client!nd", name = "toString", descriptor = "()Ljava/lang/String;", line = 4)
    public final String toString() {
        field9694++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZLwn;)V", line = 12)
    public static final void method3809(boolean arg0, class236 arg1) {
        field9693++;
        if (!arg0) {
            method3809(false, null);
        }
        class273 var2 = (class273) class79.field800.method3669((long) arg1.field9434, -1);
        if (var2 == null) {
            return;
        }
        if (var2.field3406 != null) {
            class209.field2471.method3885(var2.field3406);
            var2.field3406 = null;
        }
        var2.method1922(96);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V", line = 38)
    public static void method3810(int arg0) {
        field9697 = null;
        field9699 = null;
        if (arg0 != 5) {
            field9698 = -18;
        }
        field9695 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lwj;I)V", line = 50)
    public static final void method3811(class315 arg0, int arg1) {
        field9696++;
        arg0.field3914 = null;
        int var2 = arg0.field3912.length;
        for (int var3 = arg1; var3 < var2; var3++) {
            arg0.field3912[var3].field5087 = false;
        }
        class287[] var4 = class594.field8381;
        synchronized (class594.field8381) {
            if (var2 < class594.field8381.length && class436.field6146[var2] < 200) {
                class594.field8381[var2].method1670((byte) -109, arg0);
                int var10002 = class436.field6146[var2]++;
            }
        }
    }
}
