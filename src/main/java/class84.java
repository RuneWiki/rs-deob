import java.awt.Frame;
import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class84 {

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public int field1671 = -1;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public static int field1669 = 99;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "Lcc;")
    public static class209 field1670 = class95.method669(96, "loc");

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "Lcc;")
    public static class209 field1672 = class95.method669(89, "T");

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
    public static int field1675 = -1;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "[I")
    public static int[] field1678 = new int[200];

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "Z")
    public static boolean field1681 = true;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
    public static int field1680 = 0;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "Lhl;")
    public static class39 field1677 = new class39(5000);

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "Lkj;")
    public class144 field1679;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "Lsb;")
    public static class224 field1668;

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "Ljava/awt/Frame;")
    public static Frame field1682;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "[I")
    public int[] field1667;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "[Lcc;")
    public class209[] field1676;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
    public static void method605(int arg0) {
        field1668 = null;
        field1682 = null;
        field1677 = null;
        field1670 = null;
        field1678 = null;
        if (arg0 != 200) {
            field1668 = null;
        }
        field1672 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;B)I")
    public static final int method606(KeyEvent arg0, byte arg1) {
        field1674++;
        int var2 = arg0.getKeyChar();
        if (arg1 <= 45) {
            return -29;
        } else if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }
}
