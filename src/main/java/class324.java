import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class324 {

    @OriginalMember(owner = "client!bv", name = "h", descriptor = "S")
    public short field4721;

    @OriginalMember(owner = "client!bv", name = "d", descriptor = "B")
    public byte field4717;

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "B")
    public byte field4715;

    @OriginalMember(owner = "client!bv", name = "i", descriptor = "S")
    public short field4722;

    @OriginalMember(owner = "client!bv", name = "g", descriptor = "I")
    public int field4720;

    @OriginalMember(owner = "client!bv", name = "f", descriptor = "I")
    public int field4719;

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "Z")
    public boolean field4714;

    @OriginalMember(owner = "client!bv", name = "e", descriptor = "S")
    public short field4718;

    @OriginalMember(owner = "client!bv", name = "j", descriptor = "Ljw;")
    public static class581 field4723 = new class581(12, 6);

    @OriginalMember(owner = "client!bv", name = "k", descriptor = "Lib;")
    public static class164 field4724 = new class164("LOCAL", "", "local", 4);

    @OriginalMember(owner = "client!bv", name = "l", descriptor = "[I")
    public static int[] field4725 = new int[4096];

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "I")
    public static int field4716;

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(I)V", line = 4)
    public static void method2060(int arg0) {
        field4724 = null;
        field4725 = null;
        field4723 = null;
        if (arg0 >= -33) {
            field4725 = null;
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IZ)I", line = 17)
    public static final int method2061(int arg0, boolean arg1) {
        if (arg1) {
            field4716++;
            return arg0 >>> 8;
        } else {
            return 104;
        }
    }

    @OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(IIIIIIIIIZI)V", line = 41)
    public class324(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        this.field4721 = (short) arg6;
        this.field4717 = (byte) arg7;
        this.field4715 = (byte) arg8;
        this.field4722 = (short) arg4;
        this.field4720 = arg0;
        this.field4719 = arg10;
        this.field4714 = arg9;
        this.field4718 = (short) arg5;
    }
}
