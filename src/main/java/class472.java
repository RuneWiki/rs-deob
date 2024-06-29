import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class472 extends class82 {

    @OriginalMember(owner = "client!ii", name = "N", descriptor = "Lrg;")
    public static class548 field6606 = new class548(75, -1);

    @OriginalMember(owner = "client!ii", name = "P", descriptor = "Ljava/lang/String;")
    public static String field6608 = null;

    @OriginalMember(owner = "client!ii", name = "Q", descriptor = "I")
    public static int field6609 = 0;

    @OriginalMember(owner = "client!ii", name = "L", descriptor = "I")
    public static int field6604;

    @OriginalMember(owner = "client!ii", name = "M", descriptor = "I")
    public static int field6605;

    @OriginalMember(owner = "client!ii", name = "O", descriptor = "I")
    public static int field6607;

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "(I)V", line = 4)
    public static void method2751(int arg0) {
        if (arg0 != 0) {
            method2751(-118);
        }
        field6606 = null;
        field6608 = null;
    }

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "(I)V", line = 18)
    public static final void method2752(int arg0) {
        ++field6604;
        class279.method1589(77);
        if (arg0 != 57) {
            field6608 = null;
        }
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "()V", line = 30)
    public class472() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(II)[I", line = 33)
    public final int[] method201(int arg0, int arg1) {
        if (arg1 != 12218) {
            field6606 = null;
        }
        ++field6605;
        int[] var3 = super.field990.method1566((byte) 116, arg0);
        if (super.field990.field3641) {
            int var4 = class85.field1036[arg0];
            for (int var5 = 0; class629.field9033 > var5; ++var5) {
                var3[var5] = this.method2753(var4, 109, class366.field4817[var5]) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "(III)I", line = 66)
    private final int method2753(int arg0, int arg1, int arg2) {
        ++field6607;
        if (arg1 < 94) {
            return -75;
        } else {
            int var4 = arg0 * 57 + arg2;
            int var5 = var4 ^ var4 << 1;
            return -((Integer.MAX_VALUE & (var5 * var5 * 15731 + 789221) * var5 + 1376312589) / 262144) + 4096;
        }
    }
}
