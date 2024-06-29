import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class49 extends class56 {

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "Z")
    public static boolean field1007 = true;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "Lql;")
    public static class87 field1006;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V", line = 11)
    public static final void method372(byte arg0) {
        if (arg0 != 39) {
            method372((byte) -125);
        }
        field1005++;
        class141.field2335 = null;
        class207.method1405();
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B[B)[B", line = 24)
    public static final byte[] method373(byte arg0, byte[] arg1) {
        field1008++;
        if (arg1 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg1.length];
            class129.method851(arg1, 0, var2, 0, arg1.length);
            return arg0 <= 95 ? (byte[]) null : var2;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(III)I", line = 53)
    public static final int method374(int arg0, int arg1, int arg2) {
        field1003++;
        if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg1 & arg2) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)V", line = 89)
    public static void method375(int arg0) {
        if (arg0 != 126) {
            field1007 = true;
        }
        field1006 = null;
    }
}
