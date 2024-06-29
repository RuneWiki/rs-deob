import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public class class501 extends class580 {

    @OriginalMember(owner = "client!lba", name = "G", descriptor = "I")
    public static int field7217 = 100;

    @OriginalMember(owner = "client!lba", name = "F", descriptor = "Lpr;")
    public static class407 field7216 = new class407(9, 6);

    @OriginalMember(owner = "client!lba", name = "E", descriptor = "B")
    public byte field7215;

    @OriginalMember(owner = "client!lba", name = "C", descriptor = "I")
    public static int field7213;

    @OriginalMember(owner = "client!lba", name = "D", descriptor = "I")
    public static int field7214;

    @OriginalMember(owner = "client!lba", name = "I", descriptor = "I")
    public int field7219;

    @OriginalMember(owner = "client!lba", name = "J", descriptor = "I")
    public static int field7220;

    @OriginalMember(owner = "client!lba", name = "L", descriptor = "I")
    public static int field7221;

    @OriginalMember(owner = "client!lba", name = "M", descriptor = "I")
    public static int field7222;

    @OriginalMember(owner = "client!lba", name = "H", descriptor = "Liaa;")
    public class452 field7218;

    @OriginalMember(owner = "client!lba", name = "B", descriptor = "[I")
    public static int[] field7212;

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "(I)[B", line = 6)
    public final byte[] method750(int arg0) {
        ++field7220;
        int var2 = 9 / ((arg0 - 8) / 58);
        if (!super.field8252 && ~(this.field7218.field6209.length + -this.field7215) >= ~this.field7218.field6215) {
            return this.field7218.field6209;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!lba", name = "d", descriptor = "(I)V", line = 26)
    public static void method2883(int arg0) {
        field7216 = null;
        field7212 = null;
        if (arg0 != 0) {
            field7212 = null;
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(BI)Lfv;", line = 37)
    public static final class108 method2884(byte arg0, int arg1) {
        ++field7214;
        class108[] var2 = class542.method3079(arg0 ^ 19538);
        for (int var3 = 0; var2.length > var3; ++var3) {
            if (~var2[var3].field1254 == ~arg1) {
                return var2[var3];
            }
        }
        if (arg0 != -52) {
            field7217 = 70;
        }
        return null;
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(IIIIZ)V", line = 62)
    public static final void method2885(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (~class150.field1711 == -1) {
            class526.method2994(32130, false);
        } else {
            class190.field2301 = class150.field1711;
            class466.method2646(arg1 + 30933, 0);
        }
        ++field7221;
        class503.field7243 = arg4;
        class107.field1246 = arg3;
        if (arg1 != -22933) {
            field7216 = null;
        }
        class176.field2124 = arg0;
        class637.method3581(arg2);
    }

    @OriginalMember(owner = "client!lba", name = "c", descriptor = "(I)I", line = 96)
    public final int method749(int arg0) {
        ++field7213;
        if (this.field7218 == null) {
            return 0;
        } else {
            return arg0 != 30849 ? -41 : this.field7218.field6215 * 100 / (this.field7218.field6209.length - this.field7215);
        }
    }
}
