import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class225 {

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "Z")
    public static boolean field3200 = false;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "Lqp;")
    public static class466 field3197 = new class466("flash3:", "blinken3:", "clignotant3:", "brilho3:");

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public static int field3203 = 0;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "Lht;")
    public static class410 field3202 = new class410();

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "Lwj;")
    public static class270 field3204 = new class270(71, -2);

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "Lnj;")
    public static class162 field3205 = new class162(200);

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(FIIIZIIII)[[I")
    public static final int[][] method1395(float arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8) {
        field3199++;
        int[][] var9 = new int[arg8][arg2];
        class318 var10 = new class318();
        var10.field4360 = (int) (arg0 * 4096.0F);
        var10.field4355 = arg6;
        var10.field4362 = arg5;
        var10.field4368 = arg4;
        var10.field4365 = arg1;
        var10.method42(true);
        if (arg7 != 198) {
            method1395(-0.086341634F, 68, 91, 23, false, 103, -63, 102, -87);
        }
        class44.method412(arg8, (byte) 102, arg2);
        for (int var11 = 0; var11 < arg8; var11++) {
            var10.method1855(var11, (byte) 99, var9[var11]);
        }
        return var9;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
    public static void method1396(int arg0) {
        field3204 = null;
        field3202 = null;
        field3205 = null;
        field3197 = null;
        if (arg0 != 28657) {
            method1395(-0.3441181F, 21, -103, -81, true, 20, 31, 45, 21);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lga;ILmg;)V")
    public static final void method1397(class277 arg0, int arg1, class101 arg2) {
        class473.field6916 = arg0;
        field3198++;
        class362.field5296 = arg2;
        if (arg1 != -2074982072) {
            method1398('R', -16);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(CI)C")
    public static final char method1398(char arg0, int arg1) {
        if (arg1 != 69) {
            method1396(14);
        }
        field3201++;
        if (arg0 == 'Æ') {
            return 'E';
        } else if (arg0 == 'æ') {
            return 'e';
        } else if (arg0 == 'ß') {
            return 's';
        } else if (arg0 == 'Œ') {
            return 'E';
        } else {
            return (char) (arg0 == 'œ' ? 'e' : '\u0000');
        }
    }
}
