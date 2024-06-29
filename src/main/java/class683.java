import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tfa")
public abstract class class683 {

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "I")
    public int field9679;

    @OriginalMember(owner = "client!tfa", name = "c", descriptor = "I")
    public int field9680;

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "I")
    public int field9678;

    @OriginalMember(owner = "client!tfa", name = "<init>", descriptor = "(III)V", line = 12)
    public class683(int arg0, int arg1, int arg2) {
        this.field9679 = arg1;
        this.field9680 = arg2;
        this.field9678 = arg0;
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IIIILdc;)V", line = 23)
    public static final void method3870(int arg0, int arg1, int arg2, int arg3, class336 arg4) {
        class172 var5 = class134.method1114(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        arg4.field10347 = (arg1 << class679.field9600) + class358.field5076;
        arg4.field10358 = arg3;
        arg4.field10350 = (arg2 << class679.field9600) + class358.field5076;
        var5.field2603 = arg4;
        int var6 = class678.field9594 == class454.field6207 ? 1 : 0;
        if (arg4.method1170(16383)) {
            if (arg4.method1175((byte) 52)) {
                arg4.field10360 = class277.field3997[var6];
                class277.field3997[var6] = arg4;
                return;
            }
            arg4.field10360 = class5.field74[var6];
            class5.field74[var6] = arg4;
            class87.field1297 = true;
            return;
        }
        arg4.field10360 = class407.field5602[var6];
        class407.field5602[var6] = arg4;
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(III)V")
    public abstract void method267(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IZI)V")
    public abstract void method269(int arg0, boolean arg1, int arg2);

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(ZII)V")
    public abstract void method268(boolean arg0, int arg1, int arg2);
}
