import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class72 {

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public static int field1124 = -1;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public static int field1126 = 0;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "Lck;")
    public static class119 field1128 = class298.method1987((byte) 27, "; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public int field1117;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public int field1119;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public int field1120;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public int field1122;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "Lwi;")
    public static class23 field1118;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Z)V", line = 5)
    public static void method513(boolean arg0) {
        field1128 = null;
        if (!arg0) {
            method515(106, -102, -90, -70);
        }
        field1118 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V", line = 33)
    public static final void method514(byte arg0) {
        if (arg0 != 112) {
            field1128 = (class119) null;
        }
        System.out.println("Usage: worldid, <live/office/local>, <live/rc/wip>, <software/hardware>, <free/members>, <english/german>, <game0/game1> [safemode]");
        field1125++;
        System.exit(1);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIII)I", line = 48)
    public static final int method515(int arg0, int arg1, int arg2, int arg3) {
        field1121++;
        int var4 = arg3 & 0x3;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 1023 - arg1;
        } else {
            if (arg2 != -1) {
                field1126 = -71;
            }
            return 1023 - arg0;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)V", line = 79)
    public static final void method516(int arg0, int arg1, int arg2) {
        class4.field121 = true;
        class161.field2556 = arg0;
        class49.field761 = arg1;
        class241.field3874 = arg2;
        class56.field917 = -1;
        class110.field1682 = -1;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 88)
    public static final void method517(Component arg0, int arg1) {
        field1123++;
        arg0.removeKeyListener(class242.field3888);
        arg0.removeFocusListener(class242.field3888);
        class119.field1833 = -1;
        if (arg1 != 1730) {
            method516(-89, 47, -95);
        }
    }
}
