import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rca")
public class class419 {

    @OriginalMember(owner = "client!rca", name = "d", descriptor = "I")
    public static int field5915 = -1;

    @OriginalMember(owner = "client!rca", name = "e", descriptor = "Ljava/lang/Object;")
    public static volatile Object field5916 = null;

    @OriginalMember(owner = "client!rca", name = "b", descriptor = "I")
    public static int field5913;

    @OriginalMember(owner = "client!rca", name = "c", descriptor = "I")
    public static int field5914;

    @OriginalMember(owner = "client!rca", name = "f", descriptor = "I")
    public static int field5917;

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "Lsea;")
    public static class648 field5912;

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(IILin;I)V")
    public static final void method2431(int arg0, int arg1, class78 arg2, int arg3) {
        class581.field8188 = arg3;
        class469.field6472 = arg2;
        int var4 = -81 % ((arg1 - 15) / 47);
        field5914++;
        class139.field1976 = arg0;
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(B)V")
    public static void method2432(byte arg0) {
        field5912 = null;
        if (arg0 >= -61) {
            method2431(4, 8, null, -15);
        }
        field5916 = null;
    }
}
