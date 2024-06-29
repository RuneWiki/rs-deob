import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class327 {

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "[I")
    public int[] field4839 = new int[4];

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "B")
    public byte field4835;

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "[I")
    public int[] field4846;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "[I")
    public int[] field4840;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "B")
    public byte field4834;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "S")
    public short field4842;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "S")
    public short field4837;

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "S")
    public short field4849;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "[S")
    public short[] field4838;

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "[S")
    public short[] field4845;

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "[S")
    public short[] field4847;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "S")
    public short field4843;

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "[Ljava/awt/Color;")
    public static Color[] field4844 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "Z")
    public static boolean field4848 = false;

    @OriginalMember(owner = "client!vh", name = "r", descriptor = "Lnea;")
    public static class664 field4851 = new class664(24, -2);

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
    public static int field4836;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!vh", name = "q", descriptor = "[I")
    public static int[] field4850;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V", line = 4)
    public static void method2059(int arg0) {
        if (arg0 != -16404) {
            field4851 = null;
        }
        field4850 = null;
        field4844 = null;
        field4851 = null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)Z", line = 19)
    public static final boolean method2060(int arg0, int arg1) {
        if (arg1 != 24) {
            method2059(-113);
        }
        field4836++;
        return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V", line = 46)
    public class327(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        this.field4835 = (byte) arg0;
        this.field4846 = new int[4];
        this.field4840 = new int[4];
        this.field4834 = (byte) arg1;
        this.field4846[0] = arg2;
        this.field4846[1] = arg3;
        this.field4846[3] = arg5;
        this.field4846[2] = arg4;
        this.field4839[1] = arg7;
        this.field4839[3] = arg9;
        this.field4839[2] = arg8;
        this.field4839[0] = arg6;
        this.field4840[1] = arg11;
        this.field4842 = (short) (arg2 >> class310.field4593);
        this.field4840[0] = arg10;
        this.field4840[2] = arg12;
        this.field4840[3] = arg13;
        this.field4837 = (short) (arg4 >> class310.field4593);
        this.field4849 = (short) (arg10 >> class310.field4593);
        this.field4838 = new short[4];
        this.field4845 = new short[4];
        this.field4847 = new short[4];
        this.field4843 = (short) (arg12 >> class310.field4593);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)B", line = 79)
    public static final byte method2061(int arg0, int arg1, int arg2) {
        field4841++;
        if (arg0 != 9) {
            return 0;
        } else if (arg2 <= 61) {
            return 18;
        } else {
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        }
    }
}
