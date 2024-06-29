import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class103 extends class312 {

    @OriginalMember(owner = "client!pm", name = "m", descriptor = "Lhv;")
    public static class150 field1592;

    @OriginalMember(owner = "client!pm", name = "r", descriptor = "Lpn;")
    public static class49 field1597;

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "I")
    public int field1587;

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "I")
    public int field1589;

    @OriginalMember(owner = "client!pm", name = "k", descriptor = "I")
    public int field1590;

    @OriginalMember(owner = "client!pm", name = "l", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!pm", name = "n", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!pm", name = "o", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!pm", name = "p", descriptor = "I")
    public int field1595;

    @OriginalMember(owner = "client!pm", name = "s", descriptor = "I")
    public int field1598;

    @OriginalMember(owner = "client!pm", name = "t", descriptor = "I")
    public int field1599;

    @OriginalMember(owner = "client!pm", name = "v", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!pm", name = "q", descriptor = "Lum;")
    public static class83 field1596;

    @OriginalMember(owner = "client!pm", name = "u", descriptor = "Ljava/lang/String;")
    public String field1600;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(III)Z")
    public static final boolean method829(int arg0, int arg1, int arg2) {
        if (arg1 != 65536) {
            method831(78, 117, -17);
        }
        field1588++;
        return (arg2 & 0x10000) != 0;
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(B)V")
    public static final void method830(byte arg0) {
        field1593++;
        class249.field3884.method1630(-40);
        int var1 = -57 % ((arg0 - 33) / 62);
        class190.field2910.method1630(-85);
        class498.field7250.method1630(-83);
        class49.field761.method1630(-108);
        class136.field2070.method1630(-116);
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(III)Z")
    public static final boolean method831(int arg0, int arg1, int arg2) {
        field1594++;
        if (arg0 < 81) {
            method833(-75, null, 106, 17, null, 53, 106, -89, 112, -19);
        }
        return class541.method3179(arg2, (byte) -86, arg1) & class34.method204(24448, arg1, arg2);
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(B)V")
    public static void method832(byte arg0) {
        field1592 = null;
        field1597 = null;
        field1596 = null;
        int var1 = -113 % ((-arg0 - 42) / 55);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILwl;IILwl;IIIII)V")
    public static final void method833(int arg0, class521 arg1, int arg2, int arg3, class521 arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1591++;
        int var10 = arg1.method312((byte) 127);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class363 var12 = (class363) class90.field1445.method1634((long) var10, 64);
        if (var12 == null) {
            class309[] var13 = class309.method2045(class510.field7431, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class376.field5542.method574(var13[0], true);
            class90.field1445.method1623((long) var10, 17621, var12);
        }
        class193.method1331(arg2, arg6 >> 1, 0, arg4.field1274, (byte) 69, arg8 >> 1, arg0, arg4.field1279, arg4.method3045(0) * 64, arg4.field1275);
        int var14 = class370.field5458[0] + arg3 - 18;
        int var15 = arg5 / 4 * 18 + var14;
        int var16 = class370.field5458[1] + arg7 - 70;
        if (arg9 >= -69) {
            method829(94, 20, 43);
        }
        int var17 = arg5 % 4 * 18 + var16;
        var12.method2316(var15, var17);
        if (arg1 == arg4) {
            class376.field5542.method1992(var15 - 1, (byte) 86, var17 - 1, 18, 18, -256);
        }
        class327 var18 = class190.method1311((byte) 43);
        var18.field4939 = var15;
        var18.field4941 = var17 + 16;
        var18.field4956 = var15 + 16;
        var18.field4951 = arg1;
        var18.field4943 = var17;
        class354.field5247.method1082(var18, -115);
    }

    static {
        new class179("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
        field1592 = new class150();
        field1597 = new class49(26, -1);
    }
}
