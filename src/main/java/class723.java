import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class723 {

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "[I")
    public int[] field10066 = new int[4];

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "B")
    public byte field10059;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "[I")
    public int[] field10063;

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "[I")
    public int[] field10067;

    @OriginalMember(owner = "client!cj", name = "p", descriptor = "B")
    public byte field10073;

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "S")
    public short field10071;

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "S")
    public short field10069;

    @OriginalMember(owner = "client!cj", name = "o", descriptor = "S")
    public short field10072;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "S")
    public short field10058;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "[S")
    public short[] field10060;

    @OriginalMember(owner = "client!cj", name = "q", descriptor = "[S")
    public short[] field10074;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "[S")
    public short[] field10064;

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "[I")
    public static int[] field10070 = new int[2];

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "F")
    public static float field10068;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "I")
    public static int field10065;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "Lega;")
    public static class740 field10061;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "[Lor;")
    public static class668[] field10062;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)V", line = 9)
    public static void method4028(byte arg0) {
        field10070 = null;
        if (arg0 != -33) {
            field10068 = 0.22274645F;
        }
        field10062 = null;
        field10061 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)V", line = 21)
    public static final void method4029(String arg0, String arg1, int arg2, int arg3) {
        if (arg3 >= 73) {
            field10065++;
            class39.field623 = arg2;
            class397.field5830 = 2;
            class187.method1298(arg0, false, 0, arg1, false);
        }
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V", line = 52)
    public class723(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        this.field10059 = (byte) arg0;
        this.field10063 = new int[4];
        this.field10067 = new int[4];
        this.field10073 = (byte) arg1;
        this.field10066[3] = arg5;
        this.field10066[2] = arg4;
        this.field10066[1] = arg3;
        this.field10066[0] = arg2;
        this.field10067[0] = arg6;
        this.field10067[2] = arg8;
        this.field10067[3] = arg9;
        this.field10067[1] = arg7;
        this.field10063[2] = arg12;
        this.field10071 = (short) (arg2 >> class26.field388);
        this.field10063[1] = arg11;
        this.field10063[3] = arg13;
        this.field10063[0] = arg10;
        this.field10069 = (short) (arg4 >> class26.field388);
        this.field10072 = (short) (arg10 >> class26.field388);
        this.field10058 = (short) (arg12 >> class26.field388);
        this.field10060 = new short[4];
        this.field10074 = new short[4];
        this.field10064 = new short[4];
    }
}
