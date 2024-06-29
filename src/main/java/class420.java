import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class420 {

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "Ljava/lang/String;")
    public static String field5726 = null;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    public int field5722;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    public static int field5723;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    public int field5724;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public static int field5725;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
    public static int field5728;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
    public int field5729;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "Ltba;")
    public static class174 field5727;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)I")
    public static final int method2467(int arg0, int arg1) {
        if (arg0 == 127) {
            field5728++;
            return arg1 & 0x7F;
        } else {
            return 106;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V")
    public static final void method2468(byte arg0) {
        class573.field8161 = -1;
        if (arg0 != 8) {
            method2469(47);
        }
        class435.field5918 = null;
        field5725++;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
    public static void method2469(int arg0) {
        field5726 = null;
        if (arg0 != 20939) {
            method2470((byte) 74);
        }
        field5727 = null;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(B)[Lwg;")
    public static final class450[] method2470(byte arg0) {
        if (arg0 >= -114) {
            method2469(115);
        }
        field5723++;
        return new class450[] { class320.field4374, class235.field3372, class127.field2240, class198.field2998, class711.field9786, class339.field4578, class578.field8187, class172.field2743, class594.field8345, class665.field9235, class426.field5813, class528.field7163, class57.field803, class169.field2714 };
    }
}
