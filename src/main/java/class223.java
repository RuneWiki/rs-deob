import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class223 {

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public int field3145 = -1;

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "I")
    public int field3154 = -1;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "[I")
    public static int[] field3148 = new int[50];

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "Lwe;")
    public static class82 field3151 = null;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "[I")
    public static int[] field3153 = new int[5];

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "[I")
    public int[] field3146;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IBLqi;)V")
    public final void method1445(int arg0, byte arg1, class216 arg2) {
        while (true) {
            int var4 = arg2.method1407(107);
            if (var4 == 0) {
                field3147++;
                if (arg1 != 70) {
                    this.method1445(-123, (byte) -119, (class216) null);
                    return;
                }
                return;
            }
            this.method1448(arg2, var4, (byte) 5, arg0);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)I")
    public static final int method1446(int arg0) {
        if (arg0 == 15) {
            field3150++;
            return 15;
        } else {
            return 75;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V")
    public static void method1447(byte arg0) {
        int var1 = -37 % ((24 - arg0) / 55);
        field3153 = null;
        field3151 = null;
        field3148 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lqi;IBI)V")
    private final void method1448(class216 arg0, int arg1, byte arg2, int arg3) {
        field3149++;
        if (arg1 == 1) {
            this.field3154 = arg0.method1380(true);
        } else if (arg1 == 2) {
            this.field3146 = new int[arg0.method1407(arg2 + 116)];
            for (int var5 = 0; var5 < this.field3146.length; var5++) {
                this.field3146[var5] = arg0.method1380(true);
            }
        } else if (arg1 == 3) {
            this.field3145 = arg0.method1407(113);
        }
        if (arg2 != 5) {
            this.field3146 = null;
        }
    }
}
