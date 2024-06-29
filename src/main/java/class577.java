import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class577 {

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "[I")
    public static int[] field8130 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!lq", name = "k", descriptor = "I")
    public static int field8137 = -1;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "I")
    public static int field8127 = 1407;

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "I")
    public static int field8129;

    @OriginalMember(owner = "client!lq", name = "f", descriptor = "I")
    public static int field8132;

    @OriginalMember(owner = "client!lq", name = "h", descriptor = "I")
    public static int field8134;

    @OriginalMember(owner = "client!lq", name = "i", descriptor = "I")
    public static int field8135;

    @OriginalMember(owner = "client!lq", name = "j", descriptor = "I")
    public static int field8136;

    @OriginalMember(owner = "client!lq", name = "g", descriptor = "J")
    public long field8133;

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "Llq;")
    public class577 field8128;

    @OriginalMember(owner = "client!lq", name = "e", descriptor = "Llq;")
    public class577 field8131;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(B)Z")
    public final boolean method3386(byte arg0) {
        if (arg0 <= 48) {
            field8135 = 87;
        }
        field8132++;
        return this.field8128 != null;
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(B)V")
    public final void method3387(byte arg0) {
        field8136++;
        if (this.field8128 == null) {
            return;
        }
        this.field8128.field8131 = this.field8131;
        this.field8131.field8128 = this.field8128;
        int var2 = -126 / ((49 - arg0) / 57);
        this.field8128 = null;
        this.field8131 = null;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(BLwia;Lwia;Lwia;Lwia;)V")
    public static final void method3388(byte arg0, class791 arg1, class791 arg2, class791 arg3, class791 arg4) {
        field8129++;
        class191.field2946 = arg2;
        class384.field5285 = arg3;
        class428.field5819 = arg1;
        if (arg0 != 17) {
            method3389(93);
        }
        class787.field10812 = new class451[class428.field5819.method4332((byte) -28)][];
        class505.field7173 = new boolean[class428.field5819.method4332((byte) -91)];
    }

    @OriginalMember(owner = "client!lq", name = "f", descriptor = "(I)V")
    public static void method3389(int arg0) {
        if (arg0 == -25713) {
            field8130 = null;
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(II)Lru;")
    public static final class204 method3390(int arg0, int arg1) {
        field8134++;
        if (arg0 != 2) {
            method3388((byte) 24, null, null, null, null);
        }
        return class30.field418 && arg1 >= class693.field9664 && arg1 <= class734.field10151 ? class266.field3888[arg1 - class693.field9664] : null;
    }
}
