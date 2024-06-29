import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class336 {

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "Z")
    public boolean field4751;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
    public int field4752;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "S")
    public short field4753;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "S")
    public short field4754;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "S")
    public short field4755;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    public int field4750;

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "I")
    public int field4757;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public int field4748;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "B")
    public byte field4745;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public int field4746;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "[I")
    public static int[] field4749 = new int[1000];

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public static int field4747;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "Z")
    public static boolean field4756;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
    public static void method2144(byte arg0) {
        field4749 = null;
        if (arg0 != -120) {
            field4756 = false;
        }
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class336(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field4751 = arg10;
        this.field4752 = arg2;
        this.field4753 = (short) arg5;
        this.field4754 = (short) arg4;
        this.field4755 = (short) arg6;
        this.field4750 = arg1;
        this.field4757 = arg3;
        this.field4748 = arg0;
        this.field4745 = (byte) arg8;
        this.field4746 = arg11;
    }
}
