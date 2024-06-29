import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class105 implements class88 {

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "I")
    public static int field1560 = 0;

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)[Lqg;")
    public static final class271[] method747(byte arg0) {
        field1561++;
        int var1 = 76 % ((arg0 + 24) / 48);
        return new class271[] { class43.field644, class637.field9158, class476.field6820 };
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(B[ILcq;J)Ljava/lang/String;")
    public final String method497(byte arg0, int[] arg1, class273 arg2, long arg3) {
        if (arg0 < 67) {
            return null;
        }
        field1562++;
        if (class104.field1553 == arg2) {
            class237 var6 = class553.field8131.method1797(arg1[0], -14715);
            return var6.method1461(99, (int) arg3);
        } else if (class206.field2812 == arg2 || class30.field513 == arg2) {
            class390 var7 = class259.field3355.method2382((int) arg3, (byte) 28);
            return var7.field5869;
        } else if (class606.field8762 == arg2 || class684.field9652 == arg2 || class50.field783 == arg2) {
            return class553.field8131.method1797(arg1[0], -14715).method1461(100, (int) arg3);
        } else {
            return null;
        }
    }
}
