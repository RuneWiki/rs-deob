import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class638 {

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "I")
    public int field8952 = 0;

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "I")
    public static int field8953;

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "I")
    public static int field8954;

    @OriginalMember(owner = "client!sp", name = "d", descriptor = "I")
    public static int field8955;

    @OriginalMember(owner = "client!sp", name = "f", descriptor = "I")
    public static int field8957;

    @OriginalMember(owner = "client!sp", name = "e", descriptor = "Ltj;")
    public static class197 field8956;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(FFIBF)F", line = 4)
    public static final float method3664(float arg0, float arg1, int arg2, byte arg3, float arg4) {
        field8955++;
        if (arg3 != -51) {
            field8956 = null;
        }
        float[] var5 = class677.field9417[arg2];
        return var5[2] * arg4 + var5[1] * arg1 + var5[0] * arg0;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lrg;B)V", line = 18)
    public final void method3665(class645 arg0, byte arg1) {
        field8953++;
        int var3 = -105 % ((40 - arg1) / 58);
        while (true) {
            int var4 = arg0.method3745(-6314);
            if (var4 == 0) {
                return;
            }
            this.method3666(var4, 2, arg0);
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IILrg;)V", line = 45)
    private final void method3666(int arg0, int arg1, class645 arg2) {
        if (arg1 != 2) {
            this.field8952 = -30;
        }
        if (arg0 == 5) {
            this.field8952 = arg2.method3712((byte) 92);
        }
        field8957++;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(I)V", line = 64)
    public static void method3667(int arg0) {
        field8956 = null;
        if (arg0 != -6) {
            field8956 = null;
        }
    }
}
