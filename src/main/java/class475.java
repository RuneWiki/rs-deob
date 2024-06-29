import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public class class475 {

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "I")
    public static int field7251;

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "I")
    public static int field7252;

    @OriginalMember(owner = "client!hw", name = "d", descriptor = "I")
    public static int field7254;

    @OriginalMember(owner = "client!hw", name = "c", descriptor = "Lha;")
    public static class116 field7253;

    static {
        new class487("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(Z)V", line = 9)
    public static void method2889(boolean arg0) {
        if (!arg0) {
            field7253 = null;
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIIIIIZIIIIIII)V", line = 19)
    public static final void method2890(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        field7251++;
        if (class235.field3455 == null) {
            return;
        }
        class86 var14 = null;
        if (arg5 < 0) {
            int var15 = -arg5 - 1;
            if (class404.field5807 == var15) {
                var14 = class239.field3493;
            } else {
                var14 = class383.field5604[var15];
            }
        } else {
            int var16 = arg5 - 1;
            class234 var17 = (class234) class627.field9185.method1333((long) var16, arg6);
            if (var17 != null) {
                var14 = var17.field3443;
            }
        }
        if (var14 == null) {
            return;
        }
        class158 var18 = class312.field4690.method2004(arg6, arg11);
        int var19;
        int var20;
        if (arg3 == 1 || arg3 == 3) {
            var19 = var18.field2014;
            var20 = var18.field2017;
        } else {
            var19 = var18.field2017;
            var20 = var18.field2014;
        }
        int var21 = (var19 >> 1) + arg0;
        int var22 = (var19 + 1 >> 1) + arg0;
        int var23 = (var20 >> 1) + arg13;
        int var24 = (var20 + 1 >> 1) + arg13;
        class543 var25 = class235.field3455[arg8];
        int var26 = var25.method1319(var21, var23) + (var25.method1319(var22, var23) - (-var25.method1319(var21, var24) - var25.method1319(var22, var24))) >> 2;
        class452 var27 = new class452();
        if (arg6) {
            field7254 = 76;
        }
        var27.field6592 = arg11;
        var27.field6602 = arg0;
        var27.field6601 = arg3;
        var27.field6596 = arg7;
        var27.field6597 = arg13;
        var27.field6608 = class576.field8505 + arg9;
        if (arg2 < arg10) {
            int var28 = arg10;
            arg10 = arg2;
            arg2 = var28;
        }
        var27.field6605 = var14.field3457;
        var27.field6598 = class576.field8505 + arg1;
        var27.field6600 = arg0 + arg10;
        if (arg4 > arg12) {
            int var29 = arg4;
            arg4 = arg12;
            arg12 = var29;
        }
        var27.field6595 = arg0 + arg2;
        var27.field6594 = arg12 + arg13;
        var27.field6606 = var26;
        var27.field6599 = (var27.field6602 << 7) + (var19 << 6);
        var27.field6603 = (var27.field6597 << 7) + (var20 << 6);
        var27.field6604 = arg13 + arg4;
        class541.field8102.method2492(var27, (byte) 35);
        var14.field1095 = var27;
    }
}
