import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class439 {

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "I")
    public int field6533 = 8;

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "I")
    public int field6534 = 16777215;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "J")
    public static volatile long field6525 = 0L;

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "Z")
    public static boolean field6531 = false;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public int field6519;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    public static int field6520;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    public static int field6521;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public static int field6522;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    public int field6523;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    public static int field6524;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
    public static int field6526;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    public int field6527;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "I")
    public static int field6529;

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
    public int field6530;

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "I")
    public int field6532;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "Ll;")
    public static class16 field6528;

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "Z")
    public boolean field6535;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILiv;B)V", line = 6)
    private final void method2684(int arg0, class65 arg1, byte arg2) {
        field6520++;
        if (arg0 == 1) {
            this.field6533 = arg1.method623((byte) -59);
        } else if (arg0 == 2) {
            this.field6535 = true;
        } else if (arg0 == 3) {
            this.field6532 = arg1.method599((byte) 1);
            this.field6527 = arg1.method599((byte) 1);
            this.field6530 = arg1.method599((byte) 1);
        } else if (arg0 == 4) {
            this.field6519 = arg1.method577(255);
        } else if (arg0 == 5) {
            this.field6523 = arg1.method623((byte) 117);
        } else if (arg0 == 6) {
            this.field6534 = arg1.method580((byte) 29);
        }
        int var4 = 111 / ((arg2 + 44) / 39);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Liv;B)V", line = 58)
    public final void method2685(class65 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method577(255);
            if (var3 == 0) {
                field6526++;
                if (arg1 > -13) {
                    method2687((byte) 114);
                    return;
                }
                return;
            }
            this.method2684(var3, arg0, (byte) -116);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BII)Z", line = 79)
    public static final boolean method2686(byte arg0, int arg1, int arg2) {
        field6524++;
        if (arg0 == 101) {
            return (arg1 & 0x34) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V", line = 93)
    public static void method2687(byte arg0) {
        if (arg0 == 34) {
            field6528 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Luu;ZLuu;)V", line = 106)
    public static final void method2688(class188 arg0, boolean arg1, class188 arg2) {
        class32.method258(-110, class405.field6034);
        field6522++;
        class130.field1873++;
        class472.field6970.method618(arg0.field2678, (byte) -76);
        if (!arg1) {
            method2688(null, true, null);
        }
        class472.field6970.method583((byte) -57, arg0.field2773);
        class472.field6970.method619(arg2.field2678, 690087856);
        class472.field6970.method583((byte) -87, arg2.field2773);
        class472.field6970.method581(arg2.field2617, (byte) 121);
        class472.field6970.method581(arg0.field2617, (byte) 98);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BILpe;)Lag;", line = 125)
    public static final class480 method2689(byte arg0, int arg1, class431 arg2) {
        field6521++;
        class480 var3;
        if (class75.field1018 == null) {
            var3 = new class480();
        } else {
            var3 = class75.field1018;
            class75.field1018 = class75.field1018.field7058;
            var3.field7058 = null;
            class215.field3098--;
        }
        var3.field7054 = arg2;
        var3.field7061 = arg1;
        int var4 = -56 / ((69 - arg0) / 36);
        return var3;
    }
}
