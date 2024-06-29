import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mga")
public class class29 implements class630 {

    @OriginalMember(owner = "client!mga", name = "c", descriptor = "I")
    public int field373;

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!mga", name = "b", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!mga", name = "d", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(I)Lag;")
    public final class214 method210(int arg0) {
        field374++;
        if (arg0 != 7288) {
            method211(null, true);
        }
        return class523.field7343;
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(Lkp;Z)V")
    public static final void method211(class480 arg0, boolean arg1) {
        field371++;
        arg0.method1706((byte) 79);
        boolean var2 = false;
        for (class480 var3 = (class480) class314.field4033.method667(arg1); var3 != null; var3 = (class480) class314.field4033.method662((byte) -118)) {
            if (class46.method310(var3.method2834((byte) 126), arg0.method2834((byte) 122), 100)) {
                var2 = true;
                class245.method1558(arg0, -126, var3);
                break;
            }
        }
        if (!var2) {
            class314.field4033.method666(8192, arg0);
        }
    }

    @OriginalMember(owner = "client!mga", name = "<init>", descriptor = "(I)V")
    public class29(int arg0) {
        this.field373 = arg0;
    }
}
