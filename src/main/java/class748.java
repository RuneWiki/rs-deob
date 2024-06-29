import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class748 {

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
    public static int field10383;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IILdja;II)V")
    public static final void method4165(int arg0, int arg1, class322 arg2, int arg3, int arg4) {
        field10383++;
        if (arg3 != 22849) {
            return;
        }
        for (class315 var5 = (class315) class686.field9727.method2508((byte) -113); var5 != null; var5 = (class315) class686.field9727.method2505((byte) -55)) {
            if (var5.field4698 == arg1 && (arg0 << 9) == var5.field4704 && arg4 << 9 == var5.field4683 && var5.field4681.field4759 == arg2.field4759) {
                if (var5.field4688 != null) {
                    class229.field3307.method3439(var5.field4688);
                    var5.field4688 = null;
                }
                if (var5.field4678 != null) {
                    class229.field3307.method3439(var5.field4678);
                    var5.field4678 = null;
                }
                var5.method3117((byte) 52);
                return;
            }
        }
    }
}
