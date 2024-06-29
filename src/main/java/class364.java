import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class364 extends class435 {

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "I")
    public int field4971;

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "I")
    public int field4974;

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "[B")
    public static byte[] field4973 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "I")
    public static int field4972;

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "I")
    public static int field4975;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V")
    public static void method2168(byte arg0) {
        field4973 = null;
        if (arg0 != 0) {
            method2168((byte) -87);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(III)V")
    public static final void method2169(int arg0, int arg1, int arg2) {
        field4975++;
        class6 var3 = class275.field3657[arg0][arg2];
        if (arg1 >= -3) {
            field4972 = 90;
        }
        if (var3 != null) {
            class419.field6090 = var3.field66;
            class229.field3082 = var3.field64;
            class70.field818 = var3.field71;
        }
        class337.method1963((byte) -113);
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(II)V")
    public class364(int arg0, int arg1) {
        this.field4971 = arg0;
        this.field4974 = arg1;
    }
}
