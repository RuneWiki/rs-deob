import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class483 {

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
    public int field6807 = -1;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "Loo;")
    public static class652 field6802 = new class652(8);

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "[[[I")
    public static int[][][] field6811 = new int[2][][];

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
    public static int field6806;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "I")
    public static int field6809;

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "I")
    public static int field6810;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "Lfi;")
    public class581 field6805;

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "[I")
    public int[] field6808;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "[J")
    public long[] field6804;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "[Ljava/lang/String;")
    public String[] field6803;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIB)V", line = 3)
    public static final void method2886(int arg0, int arg1, byte arg2) {
        field6810++;
        if (arg2 != -57) {
            return;
        }
        class355.field4991 = arg0;
        class82.field908 = arg1;
        if (class763.field10520 == 0) {
            class549.field7896 = class470.field6593 * 2 + class82.field908;
            class194.field2992 = class250.field3700 * 2 + class355.field4991;
        } else if (class763.field10520 == 1) {
            class703.field9803 = class355.field4991 / class103.field1192 + class673.field9376 + 2;
            class422.field5771 = class82.field908 / class373.field5148 - (-class724.field10025 - 2);
            class194.field2992 = class703.field9803 * class103.field1192;
            class549.field7896 = class422.field5771 * class373.field5148;
            class470.field6593 = class549.field7896 - class82.field908 >> 1;
            class250.field3700 = class194.field2992 - class355.field4991 >> 1;
        } else if (class763.field10520 == 2) {
            class194.field2992 = class355.field4991;
            class549.field7896 = class82.field908;
            return;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V", line = 53)
    public static void method2887(int arg0) {
        field6811 = null;
        if (arg0 == 2099177217) {
            field6802 = null;
        }
    }
}
