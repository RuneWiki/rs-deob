import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rca")
public class class478 {

    @OriginalMember(owner = "client!rca", name = "g", descriptor = "[I")
    public int[] field6711 = new int[4];

    @OriginalMember(owner = "client!rca", name = "d", descriptor = "B")
    public byte field6708;

    @OriginalMember(owner = "client!rca", name = "p", descriptor = "B")
    public byte field6720;

    @OriginalMember(owner = "client!rca", name = "m", descriptor = "[I")
    public int[] field6717;

    @OriginalMember(owner = "client!rca", name = "h", descriptor = "[I")
    public int[] field6712;

    @OriginalMember(owner = "client!rca", name = "f", descriptor = "S")
    public short field6710;

    @OriginalMember(owner = "client!rca", name = "n", descriptor = "S")
    public short field6718;

    @OriginalMember(owner = "client!rca", name = "k", descriptor = "S")
    public short field6715;

    @OriginalMember(owner = "client!rca", name = "c", descriptor = "[S")
    public short[] field6707;

    @OriginalMember(owner = "client!rca", name = "i", descriptor = "[S")
    public short[] field6713;

    @OriginalMember(owner = "client!rca", name = "e", descriptor = "S")
    public short field6709;

    @OriginalMember(owner = "client!rca", name = "o", descriptor = "[S")
    public short[] field6719;

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "I")
    public static int field6705;

    @OriginalMember(owner = "client!rca", name = "b", descriptor = "I")
    public static int field6706;

    @OriginalMember(owner = "client!rca", name = "j", descriptor = "I")
    public static int field6714;

    @OriginalMember(owner = "client!rca", name = "l", descriptor = "I")
    public static int field6716;

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(IZ)I")
    public static final int method2852(int arg0, boolean arg1) {
        field6714++;
        int var2 = class763.field10520;
        if (var2 == 0) {
            return arg1 ? 0 : class387.field5362;
        } else if (var2 == 1) {
            return class387.field5362;
        } else if (var2 == 2) {
            return 0;
        } else if (arg0 <= 51) {
            return -26;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(I)V")
    public static final void method2853(int arg0) {
        field6716++;
        if (class16.field299 != null) {
            class16.field299.method2199(18052);
        }
        if (class443.field6038 != null) {
            class443.field6038.method2199(18052);
        }
        if (arg0 != 2) {
            method2853(117);
        }
    }

    @OriginalMember(owner = "client!rca", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V")
    public class478(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        this.field6708 = (byte) arg0;
        this.field6720 = (byte) arg1;
        this.field6717 = new int[4];
        this.field6712 = new int[4];
        this.field6712[3] = arg5;
        this.field6712[1] = arg3;
        this.field6712[0] = arg2;
        this.field6712[2] = arg4;
        this.field6711[3] = arg9;
        this.field6711[0] = arg6;
        this.field6711[1] = arg7;
        this.field6711[2] = arg8;
        this.field6710 = (short) (arg2 >> class645.field9018);
        this.field6717[3] = arg13;
        this.field6717[0] = arg10;
        this.field6717[1] = arg11;
        this.field6717[2] = arg12;
        this.field6718 = (short) (arg4 >> class645.field9018);
        this.field6715 = (short) (arg10 >> class645.field9018);
        this.field6707 = new short[4];
        this.field6713 = new short[4];
        this.field6709 = (short) (arg12 >> class645.field9018);
        this.field6719 = new short[4];
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method2854(String arg0, byte arg1) {
        System.out.println("Error: " + class744.method4146("\n", "%0a", arg1, arg0));
        field6705++;
    }
}
