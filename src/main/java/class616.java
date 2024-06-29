import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class616 {

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "B")
    public byte field8584;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "[I")
    public int[] field8581;

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "[I")
    public int[] field8588;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "B")
    public byte field8578;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "[I")
    public int[] field8583;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "S")
    public short field8580;

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "S")
    public short field8587;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "S")
    public short field8574;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "S")
    public short field8576;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "[S")
    public short[] field8585;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "[S")
    public short[] field8579;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "[S")
    public short[] field8577;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
    public static int field8582 = 0;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "Lfja;")
    public static class783 field8575 = new class783(93, 6);

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "Lpja;")
    public static class43 field8586 = new class43(8);

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
    public static void method3482(int arg0) {
        field8586 = null;
        field8575 = null;
        if (arg0 != -16612) {
            field8575 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V")
    public class616(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        this.field8584 = (byte) arg1;
        this.field8581 = new int[4];
        this.field8588 = new int[4];
        this.field8578 = (byte) arg0;
        this.field8583 = new int[4];
        this.field8581[1] = arg3;
        this.field8581[2] = arg4;
        this.field8581[3] = arg5;
        this.field8581[0] = arg2;
        this.field8583[3] = arg9;
        this.field8583[2] = arg8;
        this.field8583[1] = arg7;
        this.field8583[0] = arg6;
        this.field8588[1] = arg11;
        this.field8580 = (short) (arg2 >> class654.field9055);
        this.field8588[3] = arg13;
        this.field8588[2] = arg12;
        this.field8588[0] = arg10;
        this.field8587 = (short) (arg4 >> class654.field9055);
        this.field8574 = (short) (arg10 >> class654.field9055);
        this.field8576 = (short) (arg12 >> class654.field9055);
        this.field8585 = new short[4];
        this.field8579 = new short[4];
        this.field8577 = new short[4];
    }
}
