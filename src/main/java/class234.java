import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class234 extends class167 {

    @OriginalMember(owner = "client!gj", name = "Q", descriptor = "Ljh;")
    public class54 field4175;

    @OriginalMember(owner = "client!gj", name = "K", descriptor = "[Le;")
    public static class191[] field4169 = new class191[100];

    @OriginalMember(owner = "client!gj", name = "L", descriptor = "Le;")
    public static class191 field4170 = class54.method368(" zuerst von Ihrer Ignorieren)2Liste(Q", 2047);

    @OriginalMember(owner = "client!gj", name = "M", descriptor = "Le;")
    public static class191 field4171 = class54.method368("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q", 2047);

    @OriginalMember(owner = "client!gj", name = "R", descriptor = "Le;")
    private static class191 field4176 = class54.method368("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3", 2047);

    @OriginalMember(owner = "client!gj", name = "S", descriptor = "Le;")
    public static class191 field4177 = field4176;

    @OriginalMember(owner = "client!gj", name = "N", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!gj", name = "O", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!gj", name = "P", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "(I)V")
    public static void method1653(int arg0) {
        field4171 = null;
        field4176 = null;
        if (arg0 != 1) {
            field4170 = null;
        }
        field4170 = null;
        field4169 = null;
        field4177 = null;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Ljava/lang/Object;Lt;I)V")
    public static final void method1654(Object arg0, class247 arg1, int arg2) {
        field4174++;
        if (arg1.field4380 == null) {
            return;
        }
        int var3 = -59 % ((-arg2 - 79) / 32);
        for (int var4 = 0; var4 < 50 && arg1.field4380.peekEvent() != null; var4++) {
            class18.method142(true, 1L);
        }
        if (arg0 != null) {
            arg1.field4380.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Z)V")
    public static final void method1655(boolean arg0) {
        class269.field4743.method985(0);
        field4172++;
        if (!arg0) {
            field4169 = null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Ljh;)V")
    public class234(class54 arg0) {
        this.field4175 = arg0;
    }
}
