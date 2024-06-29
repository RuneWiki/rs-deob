import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public abstract class class402 extends class421 {

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "S")
    public short field6075;

    @OriginalMember(owner = "client!qi", name = "r", descriptor = "S")
    public short field6082;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "B")
    public byte field6076;

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "S")
    public short field6077;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "Z")
    public boolean field6072;

    @OriginalMember(owner = "client!qi", name = "t", descriptor = "B")
    public byte field6084;

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "I")
    public int field6078;

    @OriginalMember(owner = "client!qi", name = "q", descriptor = "S")
    public short field6081;

    @OriginalMember(owner = "client!qi", name = "s", descriptor = "I")
    public int field6083;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
    public int field6073;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "I")
    public int field6074;

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "I")
    public static int field6079;

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "Lqk;")
    public static class14 field6080;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "(I)V", line = 4)
    public void method11(int arg0) {
        if (arg0 < 55) {
            field6080 = null;
        }
        field6079++;
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(B)V", line = 15)
    public static void method2508(byte arg0) {
        if (arg0 != -7) {
            field6080 = null;
        }
        field6080 = null;
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(IIIIIIIIZB)V", line = 38)
    public class402(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field6075 = (short) arg7;
        this.field6082 = (short) arg4;
        this.field6076 = arg9;
        this.field6077 = (short) arg6;
        this.field6072 = arg8;
        this.field6084 = (byte) arg0;
        this.field6078 = arg3;
        this.field6081 = (short) arg5;
        this.field6083 = arg2;
        this.field6073 = arg1;
    }

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "(I)I")
    public abstract int method8(int arg0);
}
