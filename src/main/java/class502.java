import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class502 {

    @OriginalMember(owner = "client!j", name = "b", descriptor = "Llga;")
    public static class663 field6898 = new class663(128, 4);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    public static int field6897;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V", line = 14)
    public static void method2878(int arg0) {
        if (arg0 == -1) {
            field6898 = null;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lsea;B)V", line = 25)
    public static final void method2879(class648 arg0, byte arg1) {
        if (arg1 <= 114) {
            field6898 = null;
        }
        field6897++;
        class705.field9968 = 0;
        class90.field1293 = 0;
        class589.field8271 = new class693();
        class39.field458 = new class421[1024];
        class291.field4003 = new class646[class339.field4549[class139.field1970] + 1];
        class222.field3098 = 0;
        class251.field3425 = 0;
        class681.method3862((byte) 71, arg0);
        class704.method3941(arg0, false);
    }
}
