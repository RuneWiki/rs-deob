import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fda")
public class class291 {

    @OriginalMember(owner = "client!fda", name = "m", descriptor = "S")
    public short field4008;

    @OriginalMember(owner = "client!fda", name = "e", descriptor = "I")
    public int field4000;

    @OriginalMember(owner = "client!fda", name = "j", descriptor = "Z")
    public boolean field4005;

    @OriginalMember(owner = "client!fda", name = "k", descriptor = "I")
    public int field4006;

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "S")
    public short field3996;

    @OriginalMember(owner = "client!fda", name = "l", descriptor = "I")
    public int field4007;

    @OriginalMember(owner = "client!fda", name = "g", descriptor = "S")
    public short field4002;

    @OriginalMember(owner = "client!fda", name = "b", descriptor = "I")
    public int field3997;

    @OriginalMember(owner = "client!fda", name = "i", descriptor = "I")
    public int field4004;

    @OriginalMember(owner = "client!fda", name = "d", descriptor = "B")
    public byte field3999;

    @OriginalMember(owner = "client!fda", name = "f", descriptor = "Lem;")
    public static class206 field4001 = new class206(86, -2);

    @OriginalMember(owner = "client!fda", name = "c", descriptor = "F")
    public static float field3998;

    @OriginalMember(owner = "client!fda", name = "h", descriptor = "[Loa;")
    public static class646[] field4003;

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(I)V")
    public static void method1787(int arg0) {
        field4003 = null;
        if (arg0 != 12775) {
            field3998 = 0.26583228F;
        }
        field4001 = null;
    }

    @OriginalMember(owner = "client!fda", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class291(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field4008 = (short) arg4;
        this.field4000 = arg3;
        this.field4005 = arg10;
        this.field4006 = arg2;
        this.field3996 = (short) arg5;
        this.field4007 = arg0;
        this.field4002 = (short) arg6;
        this.field3997 = arg1;
        this.field4004 = arg11;
        this.field3999 = (byte) arg8;
    }
}
