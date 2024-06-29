import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaa")
public class class745 {

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "S")
    public short field10408;

    @OriginalMember(owner = "client!jaa", name = "c", descriptor = "B")
    public byte field10409;

    @OriginalMember(owner = "client!jaa", name = "d", descriptor = "B")
    public byte field10410;

    @OriginalMember(owner = "client!jaa", name = "g", descriptor = "Llca;")
    public class52 field10413;

    @OriginalMember(owner = "client!jaa", name = "f", descriptor = "[I")
    public static int[] field10412 = new int[] { 1, 4, 1, 2 };

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "I")
    public static int field10407;

    @OriginalMember(owner = "client!jaa", name = "e", descriptor = "I")
    public static int field10411;

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIIIILha;II)V", line = 8)
    public static final void method4157(int arg0, int arg1, int arg2, int arg3, int arg4, class543 arg5, int arg6, int arg7) {
        field10407++;
        arg5.method3263((byte) -83, arg6, arg1, arg7, arg2, arg3);
        if (arg4 != 26965) {
            field10412 = null;
        }
        arg5.method3263((byte) -101, arg6 + 1, 16, arg7 - 2, arg2 - -1, arg0);
        arg5.method3261(arg6 + 1, arg2 + 18, -21307, arg1 - 19, arg7 + -2, arg0);
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IILka;IILro;)V", line = 23)
    public static final void method4158(int arg0, int arg1, class282 arg2, int arg3, int arg4, class522 arg5) {
        field10411++;
        if (arg2 != null) {
            int var6 = -41 % ((arg4 + 41) / 37);
            arg5.method3178(arg2.method522(), arg2.method539(), arg2.method542(), arg2.method514(), arg2.method534(), arg2.method519(), arg0, arg2.method511(), (byte) 126, arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "<init>", descriptor = "(Llca;III)V", line = 41)
    public class745(class52 arg0, int arg1, int arg2, int arg3) {
        this.field10408 = (short) arg1;
        this.field10409 = (byte) arg2;
        this.field10410 = (byte) arg3;
        this.field10413 = arg0;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(I)V", line = 56)
    public static void method4159(int arg0) {
        field10412 = null;
        if (arg0 != -2) {
            field10412 = null;
        }
    }
}
