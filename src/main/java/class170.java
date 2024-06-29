import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class170 extends class291 {

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
    public static int field2473 = 0;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "Ltn;")
    public static class60 field2469 = new class60(5, 4);

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "[I")
    public static int[] field2477 = new int[14];

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "I")
    public static int field2476 = -1;

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "I")
    public static int field2478 = 1403;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
    public int field2471;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
    public int field2472;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
    public int field2474;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "Lge;")
    public class510 field2470;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "[Lwp;")
    public class122[] field2475;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)V", line = 4)
    public static void method1066(boolean arg0) {
        field2469 = null;
        field2477 = null;
        if (!arg0) {
            method1066(false);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)I", line = 22)
    public static int method1067(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILza;II)Z", line = 30)
    public final boolean method1068(int arg0, class290 arg1, int arg2, int arg3) {
        field2467++;
        if (this.field2475 != null) {
            for (int var5 = 0; var5 < this.field2475.length; var5++) {
                if (this.field2475[var5].method811(arg0, arg2) && this.field2470.method129(3, arg0, arg1, arg2)) {
                    return true;
                }
            }
        }
        int var6 = -22 % ((arg3 - 7) / 53);
        return false;
    }
}
