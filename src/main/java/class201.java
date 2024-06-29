import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class201 {

    @OriginalMember(owner = "client!t", name = "d", descriptor = "I")
    public static int field3197 = 1;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "[I")
    public static int[] field3198 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2 };

    @OriginalMember(owner = "client!t", name = "a", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "Lwi;")
    public static class23 field3195;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(III)Lk;", line = 5)
    public static final class199 method1277(int arg0, int arg1, int arg2) {
        class104 var3 = class150.field2390[arg0][arg1][arg2];
        return var3 == null || var3.field1598 == null ? null : var3.field1598;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(III)Z", line = 19)
    public static final boolean method1278(int arg0, int arg1, int arg2) {
        field3194++;
        if (arg1 <= 17) {
            field3195 = (class23) null;
        }
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        class291 var3 = class291.method1939(0, arg2);
        return var3.method1936(65535, arg0);
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(III)Lod;", line = 46)
    public static final class146 method1279(int arg0, int arg1, int arg2) {
        class104 var3 = class150.field2390[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class146 var4 = var3.field1593;
            var3.field1593 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)V", line = 61)
    public static void method1280(boolean arg0) {
        field3198 = null;
        if (arg0) {
            method1280(false);
        }
        field3195 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I", line = 72)
    public static final int method1281(int arg0, KeyEvent arg1) {
        field3196++;
        if (arg0 != 5) {
            return -12;
        }
        int var2 = arg1.getKeyChar();
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }
}
