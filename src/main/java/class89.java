import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oia")
public class class89 extends class362 {

    @OriginalMember(owner = "client!oia", name = "q", descriptor = "S")
    public short field1575;

    @OriginalMember(owner = "client!oia", name = "p", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!oia", name = "o", descriptor = "Lin;")
    public static class91 field1573;

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(I)V", line = 5)
    public static void method834(int arg0) {
        field1573 = null;
        if (arg0 != -4587) {
            method834(-101);
        }
    }

    @OriginalMember(owner = "client!oia", name = "<init>", descriptor = "()V", line = 16)
    public class89() {
    }

    @OriginalMember(owner = "client!oia", name = "<init>", descriptor = "(S)V", line = 18)
    public class89(short arg0) {
        this.field1575 = arg0;
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(Lin;ZLd;)V", line = 26)
    public static final void method835(class91 arg0, boolean arg1, class152 arg2) {
        class680.field9215 = arg0;
        field1574++;
        class515.field7178 = arg2;
        if (arg1) {
            method835(null, false, null);
        }
    }
}
