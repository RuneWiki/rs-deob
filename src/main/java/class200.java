import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public class class200 {

    @OriginalMember(owner = "client!sba", name = "d", descriptor = "I")
    public static int field3106 = 0;

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "F")
    public static float field3103;

    @OriginalMember(owner = "client!sba", name = "b", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!sba", name = "c", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!sba", name = "e", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(BI)V")
    public static final void method1427(byte arg0, int arg1) {
        class198.field3096 = arg1;
        field3107++;
        class70.field1483.method1913(true);
        int var2 = 94 % ((arg0 - 83) / 39);
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(IIILlk;)V")
    public static final void method1428(int arg0, int arg1, int arg2, class545 arg3) {
        field3104++;
        class619 var4 = arg3.method3144(125, class623.field9017);
        if (var4 == null) {
            return;
        }
        class623.field9017.method142(arg2, arg0, arg3.field7718 + arg2, arg3.field7652 + arg0);
        if (class694.field9774 < 3) {
            class311.field4630.method3913((float) arg3.field7718 / 2.0F + (float) arg2, (float) arg3.field7652 / 2.0F + (float) arg0, 4096, (int) (-class591.field8509) & 0x3FFF << 2, var4, arg2, arg0);
        } else {
            class623.field9017.method120(-16777216, var4, arg2, arg0);
        }
        int var5 = 101 % ((arg1 - 62) / 46);
    }
}
