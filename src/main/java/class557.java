import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class557 {

    @OriginalMember(owner = "client!pt", name = "i", descriptor = "B")
    public byte field7742;

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "B")
    public byte field7736;

    @OriginalMember(owner = "client!pt", name = "m", descriptor = "[I")
    public int[] field7746;

    @OriginalMember(owner = "client!pt", name = "k", descriptor = "[I")
    public int[] field7744;

    @OriginalMember(owner = "client!pt", name = "h", descriptor = "[I")
    public int[] field7741;

    @OriginalMember(owner = "client!pt", name = "e", descriptor = "S")
    public short field7738;

    @OriginalMember(owner = "client!pt", name = "g", descriptor = "S")
    public short field7740;

    @OriginalMember(owner = "client!pt", name = "l", descriptor = "S")
    public short field7745;

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "[S")
    public short[] field7735;

    @OriginalMember(owner = "client!pt", name = "d", descriptor = "S")
    public short field7737;

    @OriginalMember(owner = "client!pt", name = "f", descriptor = "[S")
    public short[] field7739;

    @OriginalMember(owner = "client!pt", name = "n", descriptor = "[S")
    public short[] field7747;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "I")
    public static int field7734;

    @OriginalMember(owner = "client!pt", name = "j", descriptor = "Lpga;")
    public static class561 field7743;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)V")
    public static void method3250(int arg0) {
        if (arg0 != 0) {
            method3250(7);
        }
        field7743 = null;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(BIIIIIII)V")
    public static final void method3251(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field7734++;
        int var8 = arg5 + arg6;
        int var9 = arg7 - arg6;
        for (int var10 = arg5; var10 < var8; var10++) {
            class455.method2755(arg2, class4.field49[var10], (byte) 30, arg3, arg4);
        }
        if (arg0 != 92) {
            field7743 = null;
        }
        int var11 = arg3 - arg6;
        for (int var12 = arg7; var12 > var9; var12--) {
            class455.method2755(arg2, class4.field49[var12], (byte) 86, arg3, arg4);
        }
        int var13 = arg4 + arg6;
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class4.field49[var14];
            class455.method2755(arg2, var15, (byte) 54, var13, arg4);
            class455.method2755(arg1, var15, (byte) 81, var11, var13);
            class455.method2755(arg2, var15, (byte) 64, arg3, var11);
        }
    }

    @OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V")
    public class557(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        this.field7742 = (byte) arg0;
        this.field7736 = (byte) arg1;
        this.field7746 = new int[4];
        this.field7744 = new int[4];
        this.field7741 = new int[4];
        this.field7744[1] = arg3;
        this.field7744[3] = arg5;
        this.field7744[0] = arg2;
        this.field7744[2] = arg4;
        this.field7746[0] = arg6;
        this.field7746[1] = arg7;
        this.field7746[2] = arg8;
        this.field7746[3] = arg9;
        this.field7738 = (short) (arg2 >> class714.field10017);
        this.field7741[1] = arg11;
        this.field7741[0] = arg10;
        this.field7741[2] = arg12;
        this.field7741[3] = arg13;
        this.field7740 = (short) (arg4 >> class714.field10017);
        this.field7745 = (short) (arg10 >> class714.field10017);
        this.field7735 = new short[4];
        this.field7737 = (short) (arg12 >> class714.field10017);
        this.field7739 = new short[4];
        this.field7747 = new short[4];
    }
}
