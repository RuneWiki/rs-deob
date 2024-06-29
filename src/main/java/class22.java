import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class22 {

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "[I")
    public static int[] field562 = new int[500];

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "Lad;")
    public static class5 field560 = class88.method674("oberen Rand der Webseite ausw-=hlen)3", -99);

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "[[[Ldd;")
    public static class23[][][] field559 = new class23[4][104][104];

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    public static int field564 = 0;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "Lad;")
    public static class5 field566 = class88.method674("Name des Gegenstands eingeben:", 39);

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "I")
    public static int field571 = 1;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "Lad;")
    public static class5 field568 = class88.method674("Privater Chat", -106);

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
    public static int field570 = 0;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V", line = 21)
    public static void method170(byte arg0) {
        field559 = null;
        field566 = null;
        field568 = null;
        if (arg0 > -105) {
            method172((byte) 15);
        }
        field560 = null;
        field562 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lrd;ZILrd;)V", line = 37)
    public static final void method171(class106 arg0, boolean arg1, int arg2, class106 arg3) {
        if (arg2 != -24637) {
            method174(99, 109, 54, 33, -116, null, 127, 95, (byte) 101);
        }
        class102.field2502 = arg3;
        class13.field389 = arg0;
        field569++;
        class42.field1066 = arg1;
        class39.field1008 = class13.field389.method869(arg2 ^ 0xFFFFC90D, 10);
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(B)V", line = 57)
    public static final void method172(byte arg0) {
        field561++;
        try {
            Graphics var1 = class9.field305.getGraphics();
            class101.field2470.method253(4, var1, false, 0);
            class82.field1927.method253(357, var1, false, 0);
            class42.field1067.method253(4, var1, false, 722);
            class27.field678.method253(205, var1, false, 743);
            class103.field2510.method253(0, var1, false, 0);
            class78.field1847.method253(4, var1, false, 516);
            class52.field1317.method253(205, var1, false, 516);
            if (arg0 != 89) {
                field559 = null;
            }
            class78.field1856.method253(357, var1, false, 496);
            class102.field2501.method253(338, var1, false, 0);
        } catch (Exception var2) {
            class9.field305.repaint();
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V", line = 85)
    public static final void method173(int arg0) {
        field563++;
        class49.field1258.method101((byte) -88);
        class75.field1791.method101((byte) -95);
        class108.field2711.method101((byte) -85);
        if (arg0 != -9852) {
            field571 = -88;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIILrc;IIB)V", line = 125)
    public static final void method174(int arg0, int arg1, int arg2, int arg3, int arg4, class105 arg5, int arg6, int arg7, byte arg8) {
        int var9 = 49 / ((-arg8 - 2) / 51);
        if (class121.field3009) {
            class129.field3133 = 32;
        } else {
            class129.field3133 = 0;
        }
        class121.field3009 = false;
        if (arg2 <= arg6 && arg6 < arg2 + 16 && arg3 >= arg4 && arg4 + 16 > arg3) {
            if (arg0 == 1) {
                class43.field1086 = true;
            }
            if (arg0 == 2 || arg0 == 3) {
                class99.field2384 = true;
            }
            arg5.field2547 -= class8.field281 * 4;
        } else if (arg6 >= arg2 && arg6 < arg2 + 16 && arg3 >= arg4 + arg1 - 16 && arg4 + arg1 > arg3) {
            arg5.field2547 += class8.field281 * 4;
            if (arg0 == 2 || arg0 == 3) {
                class99.field2384 = true;
            }
            if (arg0 == 1) {
                class43.field1086 = true;
            }
        } else if (arg2 - class129.field3133 <= arg6 && arg6 < class129.field3133 + arg2 + 16 && arg3 >= arg4 + 16 && arg4 + arg1 - 16 > arg3 && class8.field281 > 0) {
            if (arg0 == 1) {
                class43.field1086 = true;
            }
            class121.field3009 = true;
            if (arg0 == 2 || arg0 == 3) {
                class99.field2384 = true;
            }
            int var10 = (arg1 - 32) * arg1 / arg7;
            if (var10 < 8) {
                var10 = 8;
            }
            int var11 = arg1 - var10 - 32;
            int var12 = arg3 - arg4 - var10 / 2 - 16;
            arg5.field2547 = (arg7 - arg1) * var12 / var11;
        }
        field565++;
    }
}
