import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class119 {

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "Ljn;")
    public static class134 field1588 = new class134(95, 4);

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
    public int field1587;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
    public int field1590;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
    public int field1592;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "Z")
    public boolean field1586;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "Z")
    public boolean field1591;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V", line = 3)
    public static void method850(byte arg0) {
        if (arg0 == 99) {
            field1588 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lvt;ILjava/awt/Frame;)V", line = 29)
    public static final void method851(class768 arg0, int arg1, Frame arg2) {
        while (true) {
            class344 var3 = arg0.method4241(arg2, 73);
            while (var3.field4970 == 0) {
                class730.method4066((byte) -45, 10L);
            }
            if (var3.field4970 == 1) {
                field1593++;
                if (arg1 != -1) {
                    method851(null, -71, null);
                }
                arg2.setVisible(false);
                arg2.dispose();
                return;
            }
            class730.method4066((byte) -45, 100L);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(III)Z", line = 55)
    public static final boolean method852(int arg0, int arg1, int arg2) {
        int var3 = -105 % ((arg0 - 18) / 51);
        field1589++;
        return (class455.method2739(false, arg1, arg2) | (arg1 & 0x2000) != 0 | class726.method4041(-1, arg1, arg2)) & class341.method2165(arg2, arg1, (byte) -90);
    }
}
