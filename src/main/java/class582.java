import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class582 extends class577 {

    @OriginalMember(owner = "client!ws", name = "G", descriptor = "I")
    public static int field8137 = -1;

    @OriginalMember(owner = "client!ws", name = "B", descriptor = "Lwp;")
    public static class453 field8132 = new class453(91, 10);

    @OriginalMember(owner = "client!ws", name = "H", descriptor = "F")
    public static float field8138;

    @OriginalMember(owner = "client!ws", name = "D", descriptor = "I")
    public static int field8134;

    @OriginalMember(owner = "client!ws", name = "E", descriptor = "I")
    public static int field8135;

    @OriginalMember(owner = "client!ws", name = "F", descriptor = "I")
    public static int field8136;

    @OriginalMember(owner = "client!ws", name = "J", descriptor = "Ljava/awt/Frame;")
    public static Frame field8140;

    @OriginalMember(owner = "client!ws", name = "C", descriptor = "[B")
    private byte[] field8133;

    @OriginalMember(owner = "client!ws", name = "I", descriptor = "[[[Lvf;")
    public static class75[][][] field8139;

    @OriginalMember(owner = "client!ws", name = "e", descriptor = "(I)V", line = 4)
    public static void method3208(int arg0) {
        field8132 = null;
        field8140 = null;
        if (arg0 >= -5) {
            field8138 = -0.12919146F;
        }
        field8139 = null;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(II)Z", line = 16)
    public static final boolean method3209(int arg0, int arg1) {
        if (arg0 != 5) {
            method3208(1);
        }
        field8136++;
        return arg1 == 3 || arg1 == 5 || arg1 == 6;
    }

    @OriginalMember(owner = "client!ws", name = "<init>", descriptor = "()V", line = 28)
    public class582() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(IIII)[B", line = 36)
    public final byte[] method3210(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 12743) {
            this.field8133 = null;
        }
        field8134++;
        this.field8133 = new byte[arg1 * arg2 * arg3 * 2];
        this.method831((byte) 122, arg1, arg3, arg2);
        return this.field8133;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(IBB)V", line = 57)
    public final void method2041(int arg0, byte arg1, byte arg2) {
        field8135++;
        int var4 = arg0 * 2;
        byte var5 = (byte) ((arg2 >> 1 & 0x7F) + 127);
        if (arg1 != -76) {
            field8132 = null;
        }
        this.field8133[var4++] = var5;
        this.field8133[var4] = var5;
    }
}
