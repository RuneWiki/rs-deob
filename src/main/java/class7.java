import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public abstract class class7 extends class108 {

    @OriginalMember(owner = "client!sda", name = "j", descriptor = "Lim;")
    public static class353 field59 = new class353(64, 12);

    @OriginalMember(owner = "client!sda", name = "l", descriptor = "I")
    public static int field61 = 0;

    @OriginalMember(owner = "client!sda", name = "k", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(III)I")
    public static final int method26(int arg0, int arg1, int arg2) {
        field60++;
        if (arg1 == -1) {
            return 12345678;
        } else if (arg0 == 0) {
            int var3 = (arg1 & 0x7F) * arg2 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg1 & 0xFF80) + var3;
        } else {
            return 48;
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(I)I")
    public abstract int method27(int arg0);

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(Z)V")
    public static void method28(boolean arg0) {
        field59 = null;
        if (!arg0) {
            field61 = 18;
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(B)I")
    public abstract int method29(byte arg0);

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "(B)I")
    public abstract int method30(byte arg0);

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "(I)J")
    public abstract long method31(int arg0);

    @OriginalMember(owner = "client!sda", name = "c", descriptor = "(I)I")
    public abstract int method32(int arg0);

    static {
        new class344(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
    }
}
