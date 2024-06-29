import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class34 {

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "Lei;")
    public static class162 field500 = new class162("stellardawn", 1);

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field501 = new String[8];

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public static int field502 = -1;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V", line = 4)
    public static final void method463(byte arg0) {
        if (arg0 <= 90) {
            field502 = -127;
        }
        field499++;
        class598.field8488 = null;
        class23.method379((byte) 62, class528.field7706, class56.field732, -1, 0, 0, 0, 0, class259.field4147);
        if (class598.field8488 != null) {
            class331.method2217(class259.field4147, class409.field6303.field9412, class655.field9152, 0, class56.field732, class472.field6982, class598.field8488, -1412584499, false, 0);
            class598.field8488 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(B)V", line = 28)
    public static void method464(byte arg0) {
        field500 = null;
        if (arg0 != 74) {
            field500 = null;
        }
        field501 = null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)V", line = 39)
    public static final void method465(int arg0, int arg1) {
        if (arg1 != 95) {
            method465(46, 98);
        }
        field498++;
        class413 var2 = class674.method3852(6, arg0, 127);
        var2.method2634(1065768928);
    }
}
