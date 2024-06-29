import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class478 extends class401 {

    @OriginalMember(owner = "client!dn", name = "k", descriptor = "J")
    public long field6584;

    @OriginalMember(owner = "client!dn", name = "j", descriptor = "I")
    public static int field6583;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lin;I)V")
    public static final void method2695(class78 arg0, int arg1) {
        if (arg1 > -103) {
            return;
        }
        field6583++;
        if (class128.field1835 != arg0.field1109) {
            return;
        }
        if (class143.field2063.field9693 == null) {
            arg0.field1114 = 0;
            arg0.field1127 = 0;
            return;
        }
        arg0.field1097 = 150;
        arg0.field1163 = (int) (Math.sin((double) class186.field2697 / 40.0D) * 256.0D) & 0x7FF;
        arg0.field1114 = class409.field5813;
        arg0.field1084 = 5;
        arg0.field1127 = class79.method623((byte) -47, class143.field2063.field9693);
        arg0.field1028 = class143.field2063.field1761;
        arg0.field1037 = class143.field2063.field1781;
        arg0.field1045 = class143.field2063.field1698;
        arg0.field1176 = 0;
        class403 var2 = arg0.field1028 == -1 ? null : class192.field2727.method3090(-107, arg0.field1028);
        if (var2 != null) {
            class623.method3463(var2, arg0.field1037, (byte) 36);
        }
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "()V")
    public class478() {
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(J)V")
    public class478(long arg0) {
        this.field6584 = arg0;
    }
}
