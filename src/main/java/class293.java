import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public abstract class class293 extends class631 {

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "S")
    public short field3920;

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "B")
    public byte field3925;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "B")
    public byte field3926;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "S")
    public short field3921;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "S")
    public short field3928;

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "I")
    public int field3930;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public int field3917;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "Z")
    public boolean field3918;

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "I")
    public int field3929;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "S")
    public short field3923;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "Lcb;")
    public static class318 field3915 = new class318(61, 11);

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "[I")
    public static int[] field3916 = new int[2];

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "[I")
    public static int[] field3922 = new int[14];

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
    public int field3924;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)V", line = 27)
    public void method233(byte arg0) {
        int var2 = 53 / ((arg0 + 7) / 55);
        field3919++;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)I", line = 37)
    public static final int method1739(int arg0, int arg1, int arg2) {
        int var3 = 29 % ((arg2 - 19) / 50);
        field3927++;
        return arg1 == 1 || arg1 == 3 ? class52.field692[arg0 & 0x3] : class228.field2984[arg0 & 0x3];
    }

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "(I)V", line = 51)
    public static void method1740(int arg0) {
        if (arg0 == 29182) {
            field3922 = null;
            field3915 = null;
            field3916 = null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(IIIIIIIIZB)V", line = 63)
    public class293(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field3920 = (short) arg6;
        this.field3925 = (byte) arg0;
        this.field3926 = arg9;
        this.field3921 = (short) arg4;
        this.field3928 = (short) arg5;
        this.field3930 = arg2;
        this.field3917 = arg3;
        this.field3918 = arg8;
        this.field3929 = arg1;
        this.field3923 = (short) arg7;
    }

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "(I)I")
    public abstract int method1738(int arg0);
}
