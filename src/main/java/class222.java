import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class222 {

    @OriginalMember(owner = "client!cu", name = "k", descriptor = "B")
    public byte field2972;

    @OriginalMember(owner = "client!cu", name = "j", descriptor = "[I")
    public int[] field2971;

    @OriginalMember(owner = "client!cu", name = "g", descriptor = "[I")
    public int[] field2968;

    @OriginalMember(owner = "client!cu", name = "e", descriptor = "B")
    public byte field2966;

    @OriginalMember(owner = "client!cu", name = "m", descriptor = "[I")
    public int[] field2974;

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "S")
    public short field2964;

    @OriginalMember(owner = "client!cu", name = "i", descriptor = "S")
    public short field2970;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "S")
    public short field2962;

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "S")
    public short field2963;

    @OriginalMember(owner = "client!cu", name = "h", descriptor = "[S")
    public short[] field2969;

    @OriginalMember(owner = "client!cu", name = "d", descriptor = "[S")
    public short[] field2965;

    @OriginalMember(owner = "client!cu", name = "o", descriptor = "[S")
    public short[] field2976;

    @OriginalMember(owner = "client!cu", name = "f", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!cu", name = "l", descriptor = "Lnd;")
    public static class547 field2973;

    @OriginalMember(owner = "client!cu", name = "n", descriptor = "[I")
    public static int[] field2975;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(BII)Z")
    public static final boolean method1441(byte arg0, int arg1, int arg2) {
        field2967++;
        if (arg0 != -126) {
            return true;
        } else if ((class374.method2149(1, arg1, arg2) | (arg1 & 0x10000) != 0) || class461.method2623(arg2, arg1, false)) {
            return true;
        } else {
            return (arg2 & 0x37) == 0 && class688.method3867(arg1, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(B)V")
    public static void method1442(byte arg0) {
        field2973 = null;
        if (arg0 != -54) {
            field2975 = null;
        }
        field2975 = null;
    }

    @OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V")
    public class222(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        this.field2972 = (byte) arg0;
        this.field2971 = new int[4];
        this.field2968 = new int[4];
        this.field2966 = (byte) arg1;
        this.field2974 = new int[4];
        this.field2968[0] = arg2;
        this.field2968[2] = arg4;
        this.field2968[1] = arg3;
        this.field2968[3] = arg5;
        this.field2971[1] = arg7;
        this.field2971[3] = arg9;
        this.field2971[2] = arg8;
        this.field2971[0] = arg6;
        this.field2974[2] = arg12;
        this.field2974[3] = arg13;
        this.field2974[0] = arg10;
        this.field2964 = (short) (arg2 >> class480.field6531);
        this.field2974[1] = arg11;
        this.field2970 = (short) (arg4 >> class480.field6531);
        this.field2962 = (short) (arg10 >> class480.field6531);
        this.field2963 = (short) (arg12 >> class480.field6531);
        this.field2969 = new short[4];
        this.field2965 = new short[4];
        this.field2976 = new short[4];
    }
}
