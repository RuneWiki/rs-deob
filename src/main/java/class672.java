import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public class class672 {

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "I")
    public static int field9163;

    @OriginalMember(owner = "client!kaa", name = "b", descriptor = "I")
    public static int field9164;

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Z)[Lga;", line = 3)
    public static final class70[] method3624(boolean arg0) {
        if (arg0) {
            return null;
        } else {
            field9163++;
            return new class70[] { class171.field2248, class389.field5423, class172.field2258, class462.field6702, class20.field257, class323.field4115 };
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lpg;BI)V", line = 16)
    public static final void method3625(class711 arg0, byte arg1, int arg2) {
        if (class121.field1457) {
            class121.field1457 = false;
            arg2 = 0;
        }
        field9164++;
        if (arg1 != 5 || class439.field6167 != null && class439.field6167.method3925(arg0, (byte) 4)) {
            return;
        }
        class439.field6167 = arg0;
        class400.field5538 = class97.method654((byte) 71);
        class127.field1537 = arg2;
        class522.field7393 = arg2;
        if (class522.field7393 != 0) {
            class387.field5386 = class200.field2563;
            class349.field4522 = class238.field3075;
            class348.field4508 = class306.field3937;
            class220.field2794 = class402.field5571;
            class404.field5703 = class669.field9153;
            class673.field9170 = class192.field2514;
            class283.field3614 = class244.field3139;
            class117.field1425 = class154.field1868;
            class529.field7465 = class156.field1977;
            class294.field3830 = class153.field1857;
            return;
        }
        class379.method2296(13298);
    }
}
