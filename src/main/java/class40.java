import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class40 {

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "Lmc;")
    private static class75 field948 = class30.method234(true, "Try again in 60 secs)3)3)3");

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public static int field947 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "Lmc;")
    public static class75 field950 = class30.method234(true, "(U(Y");

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "Lmc;")
    public static class75 field951 = class30.method234(true, "Lade Konfig )2 ");

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "[Lv;")
    public static class122[] field957 = new class122[2048];

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "Lmc;")
    public static class75 field959 = field948;

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "Lmc;")
    private static class75 field961 = class30.method234(true, "Enter name of player to delete from list");

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "Lmc;")
    public static class75 field952 = field961;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "Lfa;")
    public static class32 field949 = new class32();

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "I")
    public static int field964 = 2;

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "Lmc;")
    private static class75 field963 = class30.method234(true, "wave2:");

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "Lmc;")
    private static class75 field968 = class30.method234(true, "Please wait )2 attempting to reestablish");

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "Lmc;")
    public static class75 field966 = field968;

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "[Z")
    public static boolean[] field965 = new boolean[5];

    @OriginalMember(owner = "client!gd", name = "B", descriptor = "Lmc;")
    private static class75 field971 = class30.method234(true, "Connecting to update server");

    @OriginalMember(owner = "client!gd", name = "A", descriptor = "Lmc;")
    public static class75 field970 = field963;

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "Lmc;")
    public static class75 field962 = field971;

    @OriginalMember(owner = "client!gd", name = "C", descriptor = "Lmc;")
    public static class75 field972 = class30.method234(true, "@cya@");

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "Llb;")
    public static class68 field969;

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "Lp;")
    public static class90 field967;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "Lpb;")
    public static class92 field958;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)I", line = 12)
    public static final int method303(byte arg0) {
        field955++;
        if (arg0 < 31) {
            method308(80);
        }
        return 5;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIII)I", line = 29)
    public static final int method304(int arg0, int arg1, int arg2, int arg3) {
        field946++;
        if ((class74.field1836[arg1][arg2][arg3] & 0x8) == 0) {
            if (arg0 != -32245) {
                method311((byte) -13);
            }
            return arg1 <= 0 || (class74.field1836[1][arg2][arg3] & 0x2) == 0 ? arg1 : arg1 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)Lqc;", line = 56)
    public static final class99 method305(int arg0, int arg1) {
        field954++;
        int var2 = arg1 >> 16;
        int var3 = arg0 & arg1;
        if (class74.field1854[var2] == null || class74.field1854[var2][var3] == null) {
            boolean var4 = class129.method1013(var2, -1);
            if (!var4) {
                return null;
            }
        }
        return class74.field1854[var2][var3];
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)La;", line = 88)
    public static final class1 method306(Throwable arg0, String arg1) {
        field953++;
        class1 var2;
        if (arg0 instanceof class1) {
            var2 = (class1) arg0;
            var2.field25 = var2.field25 + ' ' + arg1;
        } else {
            var2 = new class1(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)V", line = 106)
    public static final void method307(byte arg0) {
        class61.field1572.method553((byte) -106);
        field960++;
        class127.field3103.method553((byte) 115);
        if (arg0 <= 17) {
            method305(66, -42);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V", line = 137)
    public static final void method308(int arg0) {
        field956++;
        class21.field411.method553((byte) 1);
        if (arg0 != 24057) {
            method309(-16);
        }
        class50.field1203.method553((byte) 113);
        class34.field816.method553((byte) 113);
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V", line = 165)
    public static final void method309(int arg0) {
        for (int var1 = 0; var1 < class110.field2790; var1++) {
            int var2 = class118.field2929[var1];
            class97 var3 = class12.field231[var2];
            if (var3 != null) {
                class15.method97(var3.field2447.field767, (byte) -78, var3);
            }
        }
        if (arg0 != -16) {
            method307((byte) -55);
        }
        field945++;
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)V", line = 193)
    public static final void method310(int arg0) {
        try {
            Graphics var1 = class108.field2738.getGraphics();
            class101.field2617.method403(550, (byte) 74, var1, 4);
        } catch (Exception var2) {
            class108.field2738.repaint();
        }
        if (arg0 <= -82) {
            field944++;
        }
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(B)V", line = 223)
    public static void method311(byte arg0) {
        if (arg0 < 11) {
            return;
        }
        field968 = null;
        field967 = null;
        field969 = null;
        field966 = null;
        field958 = null;
        field963 = null;
        field959 = null;
        field948 = null;
        field962 = null;
        field949 = null;
        field961 = null;
        field950 = null;
        field952 = null;
        field965 = null;
        field972 = null;
        field970 = null;
        field957 = null;
        field971 = null;
        field951 = null;
    }
}
