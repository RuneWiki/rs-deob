import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class639 extends class89 {

    @OriginalMember(owner = "client!mg", name = "z", descriptor = "Ljava/lang/Object;")
    private Object field9270;

    @OriginalMember(owner = "client!mg", name = "B", descriptor = "Z")
    public static boolean field9272 = false;

    @OriginalMember(owner = "client!mg", name = "C", descriptor = "J")
    public static long field9273 = -1L;

    @OriginalMember(owner = "client!mg", name = "J", descriptor = "I")
    public static int field9279 = 1;

    @OriginalMember(owner = "client!mg", name = "K", descriptor = "[I")
    public static int[] field9280 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!mg", name = "D", descriptor = "Lcb;")
    public static class78 field9274 = new class78(8);

    @OriginalMember(owner = "client!mg", name = "A", descriptor = "I")
    public static int field9271;

    @OriginalMember(owner = "client!mg", name = "E", descriptor = "I")
    public static int field9275;

    @OriginalMember(owner = "client!mg", name = "F", descriptor = "I")
    public static int field9276;

    @OriginalMember(owner = "client!mg", name = "G", descriptor = "I")
    public static int field9277;

    @OriginalMember(owner = "client!mg", name = "H", descriptor = "I")
    public static int field9278;

    @OriginalMember(owner = "client!mg", name = "y", descriptor = "Liaa;")
    public static class469 field9269;

    static {
        new class567("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)Ljava/lang/Object;", line = 6)
    public final Object method798(int arg0) {
        if (arg0 > -25) {
            method3686(-112);
        }
        field9278++;
        return this.field9270;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(B)Z", line = 23)
    public final boolean method800(byte arg0) {
        if (arg0 == -26) {
            field9275++;
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "(I)V", line = 35)
    public static void method3686(int arg0) {
        if (arg0 != -48) {
            field9280 = null;
        }
        field9274 = null;
        field9269 = null;
        field9280 = null;
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 48)
    public class639(Object arg0, int arg1) {
        super(arg1);
        this.field9270 = arg0;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)V", line = 59)
    public static final void method3687(int arg0, int arg1) {
        class454.field6570 = arg0;
        class47.field663 = -1;
        if (arg1 != 28625) {
            field9280 = null;
        }
        class62.field856 = 3;
        class608.field8634 = 100;
        field9277++;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIILjava/lang/String;I)V", line = 73)
    public static final void method3688(int arg0, int arg1, int arg2, String arg3, int arg4) {
        field9271++;
        class549 var5 = class547.method3061(4096, arg2, arg0);
        if (var5 == null) {
            return;
        }
        if (var5.field7754 != null) {
            class526 var6 = new class526();
            var6.field7318 = arg4;
            var6.field7312 = arg3;
            var6.field7315 = var5;
            var6.field7314 = var5.field7754;
            class30.method277(var6);
        }
        if (class64.field893 != 9 || !client.method3530(var5).method3056(arg4 - 1, 1)) {
            return;
        }
        if (arg4 == 1) {
            class401.field5999++;
            class624.method3537(-93, class52.field765);
            class244.method1550(var5.field7703, arg0, 0, arg2);
        }
        if (arg4 == 2) {
            class582.field8311++;
            class624.method3537(-84, class227.field3389);
            class244.method1550(var5.field7703, arg0, arg1 ^ 0xFFFFF901, arg2);
        }
        if (arg4 == 3) {
            class567.field8098++;
            class624.method3537(-122, class605.field8612);
            class244.method1550(var5.field7703, arg0, 0, arg2);
        }
        if (arg4 == 4) {
            class555.field7847++;
            class624.method3537(arg1 ^ 0x695, class516.field7187);
            class244.method1550(var5.field7703, arg0, 0, arg2);
        }
        if (arg4 == 5) {
            class426.field6219++;
            class624.method3537(-88, class433.field6375);
            class244.method1550(var5.field7703, arg0, 0, arg2);
        }
        if (arg4 == 6) {
            class624.method3537(-96, class262.field3810);
            class247.field3589++;
            class244.method1550(var5.field7703, arg0, 0, arg2);
        }
        if (arg4 == 7) {
            class441.field6428++;
            class624.method3537(-95, class34.field460);
            class244.method1550(var5.field7703, arg0, arg1 + 1791, arg2);
        }
        if (arg1 != -1791) {
            method3686(19);
        }
        if (arg4 == 8) {
            class624.method3537(-99, class31.field430);
            class115.field1895++;
            class244.method1550(var5.field7703, arg0, 0, arg2);
        }
        if (arg4 == 9) {
            class624.method3537(-110, class581.field8283);
            class383.field5693++;
            class244.method1550(var5.field7703, arg0, 0, arg2);
        }
        if (arg4 == 10) {
            class561.field7988++;
            class624.method3537(-116, class114.field1880);
            class244.method1550(var5.field7703, arg0, arg1 + 1791, arg2);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;", line = 191)
    public static final String method3689(String arg0, byte arg1) {
        field9276++;
        StringBuffer var2 = new StringBuffer();
        int var3 = arg0.length();
        for (int var4 = 0; var4 < var3; var4++) {
            char var5 = arg0.charAt(var4);
            if (var5 == '%' && var3 > var4 + 2) {
                char var6 = arg0.charAt(var4 + 1);
                boolean var7 = false;
                int var8;
                if (var6 >= '0' && var6 <= '9') {
                    var8 = var6 - 48;
                } else if (var6 >= 'a' && var6 <= 'f') {
                    var8 = var6 + 10 - 'a';
                } else {
                    if (var6 < 'A' || var6 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var8 = var6 + '\n' - 65;
                }
                int var9 = var8 * 16;
                char var10 = arg0.charAt(var4 + 2);
                int var11;
                if (var10 >= '0' && var10 <= '9') {
                    var11 = var10 + var9 - 48;
                } else if (var10 >= 'a' && var10 <= 'f') {
                    var11 = var10 + var9 - 87;
                } else {
                    if (var10 < 'A' || var10 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var11 = var10 + var9 + 10 - 65;
                }
                if (var11 != 0 && class439.method2600((byte) var11, (byte) -124)) {
                    var2.append(class149.method1074((byte) var11, -9345));
                }
                var4 += 2;
            } else if (var5 == '+') {
                var2.append(' ');
            } else {
                var2.append(var5);
            }
        }
        if (arg1 <= 18) {
            method3689(null, (byte) -65);
        }
        return var2.toString();
    }
}
