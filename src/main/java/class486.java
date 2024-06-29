import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class486 {

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "Z")
    public boolean field6724 = true;

    @OriginalMember(owner = "client!sl", name = "h", descriptor = "Ljw;")
    public static class581 field6730 = new class581(41, 3);

    @OriginalMember(owner = "client!sl", name = "j", descriptor = "[I")
    public static int[] field6732 = new int[13];

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "C")
    private char field6729;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
    public static int field6723;

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "I")
    public static int field6725;

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "I")
    public static int field6726;

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "I")
    public int field6728;

    @OriginalMember(owner = "client!sl", name = "i", descriptor = "I")
    public static int field6731;

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "Ljava/lang/String;")
    public String field6727;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Ljp;I)V", line = 3)
    public final void method2823(class376 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2398(-1372747256);
            if (var3 == 0) {
                field6726++;
                if (arg1 != -23621) {
                    this.method2827(null, -25, -98);
                    return;
                }
                return;
            }
            this.method2827(arg0, 125, var3);
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IZII)I", line = 34)
    public static final int method2824(int arg0, boolean arg1, int arg2, int arg3) {
        field6723++;
        class166 var4 = class389.method2461((byte) 103, arg3, arg1);
        if (var4 == null) {
            return 0;
        } else if (arg0 >= arg2 && arg0 < var4.field2237.length) {
            return var4.field2237[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)Z", line = 53)
    public final boolean method2825(int arg0) {
        field6725++;
        if (arg0 != 0) {
            this.field6724 = false;
        }
        return this.field6729 == 's';
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(I)V", line = 70)
    public static void method2826(int arg0) {
        field6730 = null;
        if (arg0 != 0) {
            method2826(-55);
        }
        field6732 = null;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Ljp;II)V", line = 81)
    private final void method2827(class376 arg0, int arg1, int arg2) {
        if (arg1 < 96) {
            this.method2827(null, -111, 76);
        }
        if (arg2 == 1) {
            this.field6729 = class682.method3796((byte) 42, arg0.method2387((byte) -85));
        } else if (arg2 == 2) {
            this.field6728 = arg0.method2384(125);
        } else if (arg2 == 4) {
            this.field6724 = false;
        } else if (arg2 == 5) {
            this.field6727 = arg0.method2379((byte) 85);
        }
        field6731++;
    }
}
