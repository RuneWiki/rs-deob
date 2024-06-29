import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class246 {

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public int field3433 = -1;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public int field3436 = -1;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "[I")
    public int[] field3435;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Ltl;I)V", line = 5)
    public final void method1629(class91 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method618((byte) 100);
            if (var3 == 0) {
                if (arg1 >= -66) {
                    return;
                }
                field3437++;
                return;
            }
            this.method1631(arg0, var3, 20131);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V", line = 26)
    public static final void method1630(int arg0) {
        class109.field1536.method1120(class193.field2741, class205.field2895, class333.field5148);
        field3438++;
        if (arg0 != 1711) {
            method1630(-88);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Ltl;II)V", line = 45)
    private final void method1631(class91 arg0, int arg1, int arg2) {
        if (arg2 != 20131) {
            this.method1629(null, 106);
        }
        field3434++;
        if (arg1 == 1) {
            this.field3436 = arg0.method631(10494);
        } else if (arg1 == 2) {
            this.field3435 = new int[arg0.method618((byte) 100)];
            for (int var4 = 0; var4 < this.field3435.length; var4++) {
                this.field3435[var4] = arg0.method631(class41.method323(arg2, 26205));
            }
        } else if (arg1 == 3) {
            this.field3433 = arg0.method618((byte) 100);
            return;
        }
    }
}
