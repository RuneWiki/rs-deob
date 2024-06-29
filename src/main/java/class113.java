import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public abstract class class113 extends class102 {

    @OriginalMember(owner = "client!hu", name = "m", descriptor = "I")
    public int field1598;

    @OriginalMember(owner = "client!hu", name = "k", descriptor = "I")
    public int field1596;

    @OriginalMember(owner = "client!hu", name = "i", descriptor = "I")
    public int field1594;

    @OriginalMember(owner = "client!hu", name = "j", descriptor = "I")
    public int field1595;

    @OriginalMember(owner = "client!hu", name = "h", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!hu", name = "l", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!hu", name = "n", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!hu", name = "o", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Ljava/lang/String;ZJB)V", line = 3)
    public static final void method821(String arg0, boolean arg1, long arg2, byte arg3) {
        field1599++;
        if (arg1) {
            class110.method807(false);
            if (class20.field200.equals("")) {
                class593.field8768 = 39;
                return;
            }
        }
        class148 var5 = new class148(576);
        var5.method1049(-1, 10);
        var5.method1027(255, (int) (Math.random() * 65535.0D));
        var5.method1025(-496560248, arg2);
        int var6 = 9 % ((arg3 + 58) / 59);
        var5.method1027(255, arg1 ? class52.field610 : class476.field6747);
        var5.method1058(602643080, (int) (Math.random() * 9.9999999E7D));
        var5.method1050((byte) 32, arg0);
        var5.method1058(602643080, (int) (Math.random() * 9.9999999E7D));
        if (arg1) {
            var5.method1025(-496560248, class42.method270(class20.field200, 40));
            try {
                var5.method1025(-496560248, Long.parseLong(class303.field4171));
            } catch (Exception var7) {
                class593.field8768 = 39;
                return;
            }
        } else {
            var5.method1058(602643080, (int) (Math.random() * 9.9999999E7D));
            var5.method1058(602643080, (int) (Math.random() * 9.9999999E7D));
            var5.method1058(602643080, (int) (Math.random() * 9.9999999E7D));
            var5.method1058(602643080, (int) (Math.random() * 9.9999999E7D));
        }
        var5.method1058(602643080, (int) (Math.random() * 9.9999999E7D));
        var5.method1020(class289.field4019, class389.field5349, false);
        class112.field1589.field2177 = 0;
        class112.field1589.method1049(-1, arg1 ? class204.field3020.field6526 : class204.field3017.field6526);
        class112.field1589.method1027(255, var5.field2177 + 28);
        class112.field1589.method1027(255, 609);
        class112.field1589.method1049(-1, class63.field795);
        class112.field1589.method1049(-1, class348.field4768.field470);
        class507.method3014(class112.field1589, -99);
        class112.field1589.method1030(var5.field2146, var5.field2177, (byte) -3, 0);
        class593.field8768 = -3;
        class536.field7972 = 0;
        class467.field6580 = 1;
        class111.field1587 = 0;
    }

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "(III)Z", line = 67)
    public static final boolean method822(int arg0, int arg1, int arg2) {
        field1600++;
        if (arg2 >= -106) {
            return true;
        } else {
            return class638.method3697(arg0, (byte) -125, arg1) | (arg1 & 0x70000) != 0 || class647.method3728(arg1, arg0, (byte) -9);
        }
    }

    @OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(IIII)V", line = 84)
    public class113(int arg0, int arg1, int arg2, int arg3) {
        this.field1598 = arg2;
        this.field1596 = arg1;
        this.field1594 = arg0;
        this.field1595 = arg3;
    }
}
