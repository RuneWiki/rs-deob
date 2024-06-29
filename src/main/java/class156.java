import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class156 extends class522 implements class41 {

    @OriginalMember(owner = "client!ue", name = "H", descriptor = "Lkn;")
    public class522 field1985;

    @OriginalMember(owner = "client!ue", name = "J", descriptor = "[I")
    public static int[] field1986 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ue", name = "O", descriptor = "B")
    public static byte field1991;

    @OriginalMember(owner = "client!ue", name = "u", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!ue", name = "v", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!ue", name = "w", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!ue", name = "x", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!ue", name = "y", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!ue", name = "z", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!ue", name = "A", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!ue", name = "B", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!ue", name = "C", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!ue", name = "D", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!ue", name = "E", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!ue", name = "F", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!ue", name = "G", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!ue", name = "K", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!ue", name = "L", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!ue", name = "M", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!ue", name = "N", descriptor = "I")
    public static int field1990;

    static {
        new class335("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(ILya;)V", line = 5)
    public final void method185(int arg0, class38 arg1) {
        if (arg0 != 15397) {
            field1986 = null;
        }
        field1989++;
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)I", line = 15)
    public final int method189(int arg0) {
        if (arg0 != 32725) {
            this.field1985 = null;
        }
        field1974++;
        return 0;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)Z", line = 27)
    public final boolean method194(byte arg0) {
        field1982++;
        return arg0 > -72;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZLya;)Llo;", line = 39)
    public final class531 method181(boolean arg0, class38 arg1) {
        field1976++;
        return arg0 ? null : null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lpc;Ljava/lang/Object;B)V", line = 51)
    public static final void method1016(class476 arg0, Object arg1, byte arg2) {
        if (arg2 > -62) {
            method1017(38, -122, 115, -65, 84, -92, 73, -101, -44, 4);
        }
        field1979++;
        if (arg0.field6904 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg0.field6904.peekEvent() != null; var3++) {
            class199.method1251(1L, (byte) -126);
        }
        if (arg1 != null) {
            arg0.field6904.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lya;I)V", line = 75)
    public final void method192(class38 arg0, int arg1) {
        if (arg1 == 1) {
            field1987++;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIIIIIII)V", line = 86)
    public static final void method1017(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1972++;
        class495 var10 = null;
        if (arg9 < 20) {
            method1018(-89);
        }
        for (class495 var11 = (class495) class223.field2817.method153(0); var11 != null; var11 = (class495) class223.field2817.method161(-59)) {
            if (var11.field7192 == arg2 && var11.field7193 == arg6 && var11.field7186 == arg8 && var11.field7182 == arg1) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class495();
            var10.field7193 = arg6;
            var10.field7192 = arg2;
            var10.field7186 = arg8;
            var10.field7182 = arg1;
            if (arg6 >= 0 && arg8 >= 0 && class452.field6526 > arg6 && arg8 < class440.field6307) {
                class22.method183(var10, (byte) 108);
            }
            class223.field2817.method163(var10, 0);
        }
        var10.field7189 = arg4;
        var10.field7194 = arg7;
        var10.field7187 = arg0;
        var10.field7199 = arg5;
        var10.field7191 = arg3;
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)V", line = 132)
    public final void method191(int arg0) {
        field1990++;
        if (arg0 != 27223) {
            field1978 = -77;
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)I", line = 144)
    public final int method187(int arg0) {
        field1980++;
        if (arg0 != 21067) {
            method1016(null, null, (byte) -81);
        }
        return 0;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(B)V", line = 155)
    public final void method180(byte arg0) {
        if (arg0 == -2) {
            field1983++;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IILya;)Lt;", line = 169)
    public final class474 method179(int arg0, int arg1, class38 arg2) {
        field1988++;
        return arg1 <= 72 ? null : null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lgg;IZIIILya;)V", line = 180)
    public final void method193(class117 arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, class38 arg6) {
        int var8 = 45 / ((27 - arg5) / 40);
        field1981++;
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(IIILkn;)V", line = 192)
    public class156(int arg0, int arg1, int arg2, class522 arg3) {
        super(arg0, arg1, arg2, false, false);
        this.field1985 = arg3;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILya;II)Z", line = 203)
    public final boolean method186(int arg0, class38 arg1, int arg2, int arg3) {
        if (arg0 <= 66) {
            this.method189(-105);
        }
        field1984++;
        return false;
    }

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "(I)V", line = 214)
    public static void method1018(int arg0) {
        field1986 = null;
        if (arg0 != 29983) {
            method1016(null, null, (byte) 7);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)I", line = 225)
    public final int method178(boolean arg0) {
        if (arg0) {
            field1973++;
            return 0;
        } else {
            return -20;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)Z", line = 246)
    public final boolean method182(int arg0) {
        field1977++;
        if (arg0 != -2286) {
            this.method186(62, null, -12, -116);
        }
        return false;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILya;)V", line = 257)
    public final void method184(int arg0, class38 arg1) {
        if (arg0 == -5534) {
            field1975++;
        }
    }
}
