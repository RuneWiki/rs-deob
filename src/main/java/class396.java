import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public abstract class class396 {

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "I")
    public int field5448;

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "I")
    public int field5449;

    @OriginalMember(owner = "client!ku", name = "d", descriptor = "I")
    public int field5451;

    @OriginalMember(owner = "client!ku", name = "c", descriptor = "I")
    public static int field5450;

    @OriginalMember(owner = "client!ku", name = "d", descriptor = "(III)I", line = 11)
    public static final int method2446(int arg0, int arg1, int arg2) {
        field5450++;
        if (arg2 == -2) {
            return 12345678;
        }
        int var3 = 63 % ((arg0 + 73) / 48);
        if (arg2 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        }
        int var4 = (arg2 & 0x7F) * arg1 >> 7;
        if (var4 < 2) {
            var4 = 2;
        } else if (var4 > 126) {
            var4 = 126;
        }
        return (arg2 & 0xFF80) + var4;
    }

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(III)V", line = 47)
    public class396(int arg0, int arg1, int arg2) {
        this.field5448 = arg1;
        this.field5449 = arg2;
        this.field5451 = arg0;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(III)V")
    public abstract void method1584(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(III)V")
    public abstract void method1580(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ku", name = "c", descriptor = "(III)V")
    public abstract void method1583(int arg0, int arg1, int arg2);
}
