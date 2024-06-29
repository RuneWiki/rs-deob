import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class67 {

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "Lsa;")
    public static class162 field1570 = new class162(30);

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
    public static int field1574 = 0;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "Lcd;")
    private static class23 field1575 = class54.method414("This world is full)3", -1);

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "Lcd;")
    public static class23 field1578 = field1575;

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "I")
    public static int field1580 = 0;

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "Lcd;")
    public static class23 field1582 = class54.method414("Zu viele Verbindungen von Ihrer Adresse)3", -1);

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "I")
    public static int field1583 = 0;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "I")
    public static int field1584 = 0;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "Lsa;")
    public static class162 field1576 = new class162(260);

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "Ldd;")
    public static class32 field1579;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "[[I")
    public static int[][] field1577;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
    public static void method491(byte arg0) {
        field1575 = null;
        field1577 = null;
        if (arg0 >= -96) {
            return;
        }
        field1578 = null;
        field1570 = null;
        field1576 = null;
        field1579 = null;
        field1582 = null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)I")
    public static final int method492(int arg0, int arg1) {
        field1573++;
        if (arg1 != -1425314293) {
            field1584 = 94;
        }
        return arg0 >> 11 & 0x3F;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIII)V")
    public static final void method493(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = arg0; var5 < class5.field92; var5++) {
            if (class78.field1718[var5] + class112.field2372[var5] > arg4 && class78.field1718[var5] < arg4 + arg1 && arg2 < class179.field3558[var5] + class121.field2504[var5] && arg2 + arg3 > class121.field2504[var5]) {
                class193.field3821[var5] = true;
            }
        }
        field1571++;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method494(Component arg0, int arg1) {
        field1569++;
        arg0.removeMouseListener(class160.field3194);
        arg0.removeMouseMotionListener(class160.field3194);
        arg0.removeFocusListener(class160.field3194);
        class145.field2966 = arg1;
    }
}
