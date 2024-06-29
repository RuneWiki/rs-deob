import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ffa")
public class class601 {

    @OriginalMember(owner = "client!ffa", name = "c", descriptor = "Z")
    public boolean field8351;

    @OriginalMember(owner = "client!ffa", name = "j", descriptor = "[J")
    public static long[] field8358 = new long[32];

    @OriginalMember(owner = "client!ffa", name = "i", descriptor = "I")
    public static int field8357 = -1;

    @OriginalMember(owner = "client!ffa", name = "e", descriptor = "I")
    public static int field8353;

    @OriginalMember(owner = "client!ffa", name = "f", descriptor = "I")
    public static int field8354;

    @OriginalMember(owner = "client!ffa", name = "h", descriptor = "I")
    public static int field8356;

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "Lru;")
    public class246 field8349;

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "Lru;")
    public class246 field8350;

    @OriginalMember(owner = "client!ffa", name = "g", descriptor = "Z")
    public boolean field8355;

    @OriginalMember(owner = "client!ffa", name = "d", descriptor = "[I")
    public static int[] field8352;

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(II)I", line = 3)
    public static final int method3309(int arg0, int arg1) {
        if (arg1 <= 93) {
            method3309(-73, -71);
        }
        field8353++;
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var3 = arg0 * 6 - 61440;
        int var4 = (arg0 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(I)Z", line = 25)
    public final boolean method3310(int arg0) {
        if (arg0 >= -38) {
            field8352 = null;
        }
        field8354++;
        return this.field8355 && !this.field8351;
    }

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "(I)V", line = 36)
    public final void method3311(int arg0) {
        if (arg0 != -1036605908) {
            this.field8349 = null;
        }
        field8356++;
        if (this.field8349 != null) {
            this.field8349.method474(-126);
        }
        this.field8355 = false;
    }

    @OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "(Z)V", line = 56)
    public class601(boolean arg0) {
        this.field8351 = arg0;
    }

    @OriginalMember(owner = "client!ffa", name = "c", descriptor = "(I)V", line = 70)
    public static void method3312(int arg0) {
        if (arg0 == -61440) {
            field8352 = null;
            field8358 = null;
        }
    }
}
