import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class209 {

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "[I")
    public int[] field2948 = new int[4];

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "[I")
    public int[] field2944 = new int[4];

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "[I")
    public int[] field2947 = new int[4];

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "B")
    public byte field2952;

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "B")
    public byte field2954;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "S")
    public short field2940;

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "S")
    public short field2953;

    @OriginalMember(owner = "client!ui", name = "t", descriptor = "S")
    public short field2958;

    @OriginalMember(owner = "client!ui", name = "r", descriptor = "[S")
    public short[] field2956;

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "[S")
    public short[] field2950;

    @OriginalMember(owner = "client!ui", name = "q", descriptor = "S")
    public short field2955;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "[S")
    public short[] field2951;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "[I")
    public static int[] field2943 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "[F")
    public static float[] field2939 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "Luh;")
    public static class150 field2949 = null;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "Llh;")
    public static class487 field2941 = new class487(31, 8);

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!ui", name = "s", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V", line = 5)
    public static void method1355(int arg0) {
        if (arg0 == 5) {
            field2943 = null;
            field2949 = null;
            field2939 = null;
            field2941 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)V", line = 40)
    public static final void method1356(int arg0, int arg1, int arg2) {
        field2945++;
        class51 var3 = class703.method3938(-1989279584, arg0, 16);
        if (arg1 != 1) {
            field2946 = -29;
        }
        var3.method402((byte) 48);
        var3.field603 = arg2;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(BLac;I)V", line = 58)
    public static final void method1357(byte arg0, class501 arg1, int arg2) {
        int var3 = 22 / ((-arg0 - 40) / 56);
        if (class523.field7100 != null) {
            try {
                class523.field7100.method1347(true, 0L);
                class523.field7100.method1345(arg2, arg1.field6855, 24, (byte) -12);
            } catch (Exception var4) {
            }
        }
        field2942++;
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V", line = 82)
    public class209(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        this.field2952 = (byte) arg0;
        this.field2954 = (byte) arg1;
        this.field2947[2] = arg4;
        this.field2947[0] = arg2;
        this.field2947[1] = arg3;
        this.field2947[3] = arg5;
        this.field2948[3] = arg9;
        this.field2948[2] = arg8;
        this.field2948[1] = arg7;
        this.field2948[0] = arg6;
        this.field2944[3] = arg13;
        this.field2944[1] = arg11;
        this.field2944[2] = arg12;
        this.field2940 = (short) (arg2 >> class588.field8259);
        this.field2944[0] = arg10;
        this.field2953 = (short) (arg4 >> class588.field8259);
        this.field2958 = (short) (arg10 >> class588.field8259);
        this.field2956 = new short[4];
        this.field2950 = new short[4];
        this.field2955 = (short) (arg12 >> class588.field8259);
        this.field2951 = new short[4];
    }
}
