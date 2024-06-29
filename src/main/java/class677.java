import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class677 {

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "Z")
    public boolean field9073;

    @OriginalMember(owner = "client!rs", name = "j", descriptor = "I")
    public int field9081;

    @OriginalMember(owner = "client!rs", name = "h", descriptor = "I")
    public int field9079;

    @OriginalMember(owner = "client!rs", name = "l", descriptor = "I")
    public int field9083;

    @OriginalMember(owner = "client!rs", name = "m", descriptor = "B")
    public byte field9084;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "S")
    public short field9072;

    @OriginalMember(owner = "client!rs", name = "g", descriptor = "S")
    public short field9078;

    @OriginalMember(owner = "client!rs", name = "f", descriptor = "I")
    public int field9077;

    @OriginalMember(owner = "client!rs", name = "e", descriptor = "I")
    public int field9076;

    @OriginalMember(owner = "client!rs", name = "i", descriptor = "S")
    public short field9080;

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "Z")
    public static boolean field9075 = false;

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "Lfga;")
    public static class269 field9074 = new class269();

    @OriginalMember(owner = "client!rs", name = "k", descriptor = "I")
    public static int field9082;

    @OriginalMember(owner = "client!rs", name = "n", descriptor = "Luq;")
    public static class172 field9085;

    @OriginalMember(owner = "client!rs", name = "o", descriptor = "Luq;")
    public static class172 field9086;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)V", line = 10)
    public static void method3730(int arg0) {
        field9085 = null;
        field9086 = null;
        if (arg0 == -20912) {
            field9074 = null;
        }
    }

    @OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(IIIIIIIIIZZI)V", line = 37)
    public class677(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field9073 = arg10;
        this.field9081 = arg11;
        this.field9079 = arg2;
        this.field9083 = arg1;
        this.field9084 = (byte) arg8;
        this.field9072 = (short) arg6;
        this.field9078 = (short) arg5;
        this.field9077 = arg3;
        this.field9076 = arg0;
        this.field9080 = (short) arg4;
    }
}
