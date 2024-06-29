import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class232 extends class157 {

    @OriginalMember(owner = "client!um", name = "B", descriptor = "[I")
    private int[] field3617 = new int[this.field2423];

    @OriginalMember(owner = "client!um", name = "x", descriptor = "I")
    public static int field3613 = 0;

    @OriginalMember(owner = "client!um", name = "F", descriptor = "I")
    public static int field3621 = 0;

    @OriginalMember(owner = "client!um", name = "O", descriptor = "I")
    public static int field3630 = 0;

    @OriginalMember(owner = "client!um", name = "H", descriptor = "Ljava/lang/String;")
    public static String field3623 = "Choose Option";

    @OriginalMember(owner = "client!um", name = "P", descriptor = "I")
    public static int field3631 = 0;

    @OriginalMember(owner = "client!um", name = "w", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!um", name = "y", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!um", name = "C", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!um", name = "E", descriptor = "I")
    private int field3620;

    @OriginalMember(owner = "client!um", name = "G", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!um", name = "I", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!um", name = "J", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!um", name = "L", descriptor = "I")
    private int field3627;

    @OriginalMember(owner = "client!um", name = "M", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!um", name = "K", descriptor = "Luj;")
    public static class169 field3626;

    @OriginalMember(owner = "client!um", name = "z", descriptor = "Ldk;")
    public static class226 field3615;

    @OriginalMember(owner = "client!um", name = "D", descriptor = "[B")
    private byte[] field3619;

    @OriginalMember(owner = "client!um", name = "A", descriptor = "[I")
    public static int[] field3616;

    @OriginalMember(owner = "client!um", name = "N", descriptor = "[[[I")
    public static int[][][] field3629;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IB)V", line = 9)
    public void method697(int arg0, byte arg1) {
        field3614++;
        this.field3619[this.field3620++] = (byte) ((class333.method2319(255, arg1) >> 1) + 127);
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(I)V", line = 19)
    public final void method1135(int arg0) {
        this.field3627 = Math.abs(this.field3627);
        field3624++;
        if (this.field3627 >= 4096) {
            this.field3627 = 4095;
        }
        this.method697(this.field3620++, (byte) (this.field3627 >> 4));
        this.field3627 = arg0;
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(B)V", line = 35)
    public static void method1671(byte arg0) {
        field3626 = null;
        if (arg0 > 14) {
            field3629 = (int[][][]) null;
            field3616 = null;
            field3623 = null;
            field3615 = null;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(III)V", line = 59)
    public final void method1143(int arg0, int arg1, int arg2) {
        field3622++;
        if (arg0 != -9140) {
            this.method1143(90, 2, -111);
        }
        this.field3627 += this.field3617[arg1] * arg2 >> 12;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IIZIIIIIII)V", line = 74)
    public static final void method1672(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3618++;
        int var10 = arg9 - arg8;
        if (arg5 < 66) {
            method1671((byte) -96);
        }
        int var11 = arg6 - arg3;
        int var12 = (arg0 - arg7 << 16) / var10;
        int var13 = (arg4 - arg1 << 16) / var11;
        class184.method1358(arg1, -932450224, arg3, arg2, 0, arg7, arg9, var12, arg6, 0, arg8, var13);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(B)V", line = 95)
    public final void method1137(byte arg0) {
        if (arg0 >= -3) {
            field3623 = (String) null;
        }
        this.field3627 = 0;
        this.field3620 = 0;
        field3628++;
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "(IIIIIF)V", line = 116)
    public class232(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < this.field2423; var7++) {
            this.field3617[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }
}
