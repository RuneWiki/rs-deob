import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class15 extends class32 {

    @OriginalMember(owner = "client!we", name = "k", descriptor = "Loh;")
    public static class263 field367 = class253.method1681(-120, "Ablegen");

    @OriginalMember(owner = "client!we", name = "j", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II)Z")
    public static final boolean method113(int arg0, int arg1) {
        if (arg0 >= -2) {
            field367 = null;
        }
        field368++;
        return (arg1 >> 22 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(I)V")
    public static void method114(int arg0) {
        field367 = null;
        if (arg0 != -1651179393) {
            field367 = null;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(III)I")
    public static final int method115(int arg0, int arg1, int arg2) {
        field369++;
        if (arg2 == -1) {
            int var3 = arg0 >>> 31;
            return (arg0 + var3) / arg1 - var3;
        } else {
            return 71;
        }
    }
}
