import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class232 {

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
    public int field3507;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
    public int field3506;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    public int field3500;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    public int field3502;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public static int field3499 = 0;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "[C")
    public static char[] field3509 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lsb;I)Lsg;", line = 5)
    public static final class225 method1720(class190 arg0, int arg1) {
        field3508++;
        class225 var2 = new class225();
        var2.field3390 = arg0.method1317((byte) 8);
        if (arg1 > -78) {
            return (class225) null;
        } else {
            var2.field3394 = class192.method1385(8, var2.field3390);
            return var2;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZI)I", line = 30)
    public static final int method1721(boolean arg0, int arg1) {
        field3503++;
        int var2 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            arg1 >>>= 0x10;
            var2 += 16;
        }
        if (arg1 >= 256) {
            var2 += 8;
            arg1 >>>= 0x8;
        }
        if (!arg0) {
            return 25;
        }
        if (arg1 >= 16) {
            arg1 >>>= 0x4;
            var2 += 4;
        }
        if (arg1 >= 4) {
            var2 += 2;
            arg1 >>>= 0x2;
        }
        if (arg1 >= 1) {
            arg1 >>>= 0x1;
            var2++;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)V", line = 76)
    public static void method1722(boolean arg0) {
        field3509 = null;
        if (!arg0) {
            method1722(true);
        }
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V", line = 91)
    public class232() {
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lkb;)V", line = 98)
    public class232(class232 arg0) {
        this.field3507 = arg0.field3507;
        this.field3506 = arg0.field3506;
        this.field3500 = arg0.field3500;
        this.field3502 = arg0.field3502;
    }
}
