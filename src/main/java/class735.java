import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eja")
public class class735 extends class476 {

    @OriginalMember(owner = "client!eja", name = "m", descriptor = "I")
    public int field10161;

    @OriginalMember(owner = "client!eja", name = "w", descriptor = "I")
    public int field10171;

    @OriginalMember(owner = "client!eja", name = "n", descriptor = "I")
    public int field10162;

    @OriginalMember(owner = "client!eja", name = "p", descriptor = "I")
    public int field10164;

    @OriginalMember(owner = "client!eja", name = "t", descriptor = "I")
    public int field10168;

    @OriginalMember(owner = "client!eja", name = "v", descriptor = "I")
    public int field10170;

    @OriginalMember(owner = "client!eja", name = "l", descriptor = "I")
    public static int field10160 = -1;

    @OriginalMember(owner = "client!eja", name = "r", descriptor = "I")
    public static int field10166 = 0;

    @OriginalMember(owner = "client!eja", name = "o", descriptor = "I")
    public static int field10163;

    @OriginalMember(owner = "client!eja", name = "q", descriptor = "I")
    public static int field10165;

    @OriginalMember(owner = "client!eja", name = "s", descriptor = "I")
    public static int field10167;

    @OriginalMember(owner = "client!eja", name = "u", descriptor = "I")
    public static int field10169;

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "(Lck;ILka;III)V")
    public static final void method4107(class642 arg0, int arg1, class475 arg2, int arg3, int arg4, int arg5) {
        field10167++;
        if (arg2 != null) {
            arg0.method3524(arg1, (byte) 47, arg2.method211(), arg2.method205(), arg2.method148(), arg2.method175(), arg2.method209(), arg2.method180(), arg5, arg3, arg2.method217());
            int var6 = 86 % ((arg4 - 22) / 54);
        }
    }

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "(B)Lmha;")
    public class419 method112(byte arg0) {
        if (arg0 != 62) {
            method4107(null, -39, null, 95, -115, -103);
        }
        field10165++;
        return class257.field3523;
    }

    @OriginalMember(owner = "client!eja", name = "<init>", descriptor = "(Lle;Lqj;IIIIIIIIIIIII)V")
    public class735(class311 arg0, class512 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field10161 = arg14;
        this.field10171 = arg12;
        this.field10162 = arg13;
        this.field10164 = arg11;
        this.field10168 = arg9;
        this.field10170 = arg10;
    }

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "(ZI)Z")
    public static final boolean method4108(boolean arg0, int arg1) {
        if (arg0) {
            return true;
        } else {
            field10169++;
            return arg1 >= 12 && arg1 <= 17;
        }
    }
}
