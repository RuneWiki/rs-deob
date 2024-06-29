import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class680 {

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "I")
    public int field9716 = 1;

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "C")
    public char field9714;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "I")
    public static int field9713;

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "I")
    public static int field9715;

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "I")
    public static int field9717;

    @OriginalMember(owner = "client!bo", name = "f", descriptor = "I")
    public static int field9718;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILac;)V", line = 5)
    public final void method3857(int arg0, class501 arg1) {
        field9718++;
        if (arg0 < 2) {
            return;
        }
        while (true) {
            int var3 = arg1.method2874((byte) -75);
            if (var3 == 0) {
                return;
            }
            this.method3858(arg1, var3, (byte) 111);
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lac;IB)V", line = 27)
    private final void method3858(class501 arg0, int arg1, byte arg2) {
        int var4 = -90 % ((arg2 + 6) / 44);
        if (arg1 == 1) {
            this.field9714 = class435.method2490(-128, arg0.method2863(109));
        } else if (arg1 == 2) {
            this.field9716 = 0;
        }
        field9717++;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lac;B)Lnga;", line = 47)
    public static final class475 method3859(class501 arg0, byte arg1) {
        if (arg1 >= -5) {
            return null;
        } else {
            field9715++;
            return new class475(arg0.method2875(false), arg0.method2875(false), arg0.method2875(false), arg0.method2875(false), arg0.method2819((byte) 72), arg0.method2819((byte) 72), arg0.method2874((byte) -75));
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)Z", line = 58)
    public static final boolean method3860(int arg0, int arg1) {
        if (arg0 == 8) {
            field9713++;
            return arg1 == 7 || arg1 == 8 || arg1 == 9;
        } else {
            return false;
        }
    }
}
