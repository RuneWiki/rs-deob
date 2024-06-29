import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aga")
public abstract class class663 {

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "I")
    public static int field9322;

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(IIIII)V", line = 4)
    public static final void method3728(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field9322++;
        class354 var5 = class501.method3012(arg2, arg3, 2145997216);
        var5.method2222(-63);
        var5.field4979 = arg0;
        var5.field4980 = arg4;
        var5.field4990 = arg1;
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(I)J")
    public abstract long method1796(int arg0);
}
