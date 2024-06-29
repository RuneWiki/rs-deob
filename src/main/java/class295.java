import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gga")
public class class295 extends class760 {

    @OriginalMember(owner = "client!gga", name = "n", descriptor = "I")
    public int field4218;

    @OriginalMember(owner = "client!gga", name = "q", descriptor = "I")
    public static int field4221 = 0;

    @OriginalMember(owner = "client!gga", name = "o", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!gga", name = "p", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!gga", name = "s", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!gga", name = "t", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!gga", name = "r", descriptor = "Lhu;")
    public static class133 field4222;

    @OriginalMember(owner = "client!gga", name = "m", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field4217;

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(IC)B")
    public static final byte method1826(int arg0, char arg1) {
        if (arg0 < 6) {
            field4217 = null;
        }
        field4224++;
        byte var2;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            var2 = (byte) arg1;
        } else if (arg1 == '€') {
            var2 = -128;
        } else if (arg1 == '‚') {
            var2 = -126;
        } else if (arg1 == 'ƒ') {
            var2 = -125;
        } else if (arg1 == '„') {
            var2 = -124;
        } else if (arg1 == '…') {
            var2 = -123;
        } else if (arg1 == '†') {
            var2 = -122;
        } else if (arg1 == '‡') {
            var2 = -121;
        } else if (arg1 == 'ˆ') {
            var2 = -120;
        } else if (arg1 == '‰') {
            var2 = -119;
        } else if (arg1 == 'Š') {
            var2 = -118;
        } else if (arg1 == '‹') {
            var2 = -117;
        } else if (arg1 == 'Œ') {
            var2 = -116;
        } else if (arg1 == 'Ž') {
            var2 = -114;
        } else if (arg1 == '‘') {
            var2 = -111;
        } else if (arg1 == '’') {
            var2 = -110;
        } else if (arg1 == '“') {
            var2 = -109;
        } else if (arg1 == '”') {
            var2 = -108;
        } else if (arg1 == '•') {
            var2 = -107;
        } else if (arg1 == '–') {
            var2 = -106;
        } else if (arg1 == '—') {
            var2 = -105;
        } else if (arg1 == '˜') {
            var2 = -104;
        } else if (arg1 == '™') {
            var2 = -103;
        } else if (arg1 == 'š') {
            var2 = -102;
        } else if (arg1 == '›') {
            var2 = -101;
        } else if (arg1 == 'œ') {
            var2 = -100;
        } else if (arg1 == 'ž') {
            var2 = -98;
        } else if (arg1 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gga", name = "c", descriptor = "(B)V")
    public static void method1827(byte arg0) {
        field4217 = null;
        int var1 = 101 / ((arg0 - 30) / 58);
        field4222 = null;
    }

    @OriginalMember(owner = "client!gga", name = "<init>", descriptor = "(ILle;Lqj;III)V")
    public class295(int arg0, class311 arg1, class512 arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field4218 = arg5;
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(B)Lmha;")
    public final class419 method112(byte arg0) {
        if (arg0 != 62) {
            field4221 = 94;
        }
        field4223++;
        return class277.field3866;
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(BLbt;)V")
    public static final void method1828(byte arg0, class43 arg1) {
        if (arg0 <= 118) {
            field4217 = null;
        }
        field4219++;
        class210.field3096 = arg1;
    }
}
