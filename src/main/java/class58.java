import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class58 {

    @OriginalMember(owner = "client!gv", name = "d", descriptor = "[[I")
    public static int[][] field697 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!gv", name = "f", descriptor = "Lob;")
    public static class521 field699 = new class521(12, 4);

    @OriginalMember(owner = "client!gv", name = "i", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!gv", name = "j", descriptor = "F")
    public static float field703;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!gv", name = "e", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!gv", name = "g", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!gv", name = "h", descriptor = "Ljava/awt/Font;")
    public static Font field701;

    static {
        new class234("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
        field702 = 1400;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)V", line = 5)
    public static final void method519(int arg0) {
        if (arg0 < 85) {
            method520(null, null, null, 88, -76, 53, (byte) -13, null);
        }
        field698++;
        for (class155 var1 = (class155) class483.field6941.method1004((byte) -54); var1 != null; var1 = (class155) class483.field6941.method996(1)) {
            if (var1.field2295 == -1) {
                var1.field2309 = 0;
                if (var1.field2306 >= 0 && var1.field2302 >= 0 && var1.field2306 < class69.field976 && var1.field2302 < class285.field4328) {
                    class425.method2654(var1, (byte) 120);
                }
            } else {
                var1.method2677(-22491);
            }
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Lwt;Lkn;Lya;IIIBLql;)V", line = 36)
    public static final void method520(class205 arg0, class523 arg1, class38 arg2, int arg3, int arg4, int arg5, byte arg6, class519 arg7) {
        field694++;
        int var8 = arg1.field7646 - arg3 / 2 - 5;
        int var9 = arg5 + 2;
        if (arg7.field7564 != 0) {
            arg2.method364(var9, 1, arg7.field7564, arg3 + 10, var8, arg0.method1427() * arg4 + (arg5 - var9) + 1);
        }
        if (arg6 != 107) {
            field701 = null;
        }
        if (arg7.field7589 != 0) {
            arg2.method276(arg7.field7589, var8, arg6 - 106, arg3 + 10, var9, arg4 * arg0.method1427() + arg5 + 1 - var9);
        }
        int var10 = arg7.field7566;
        if (arg1.field7650 && arg7.field7563 != -1) {
            var10 = arg7.field7563;
        }
        for (int var11 = 0; var11 < arg4; var11++) {
            String var12 = class227.field3697[var11];
            if (arg4 - 1 > var11) {
                var12 = var12.substring(0, var12.length() - 4);
            }
            arg0.method1426(arg2, var12, arg1.field7646, arg5, var10, true);
            arg5 += arg0.method1427();
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(B)V", line = 80)
    public static void method521(byte arg0) {
        if (arg0 >= -42) {
            field702 = -43;
        }
        field701 = null;
        field699 = null;
        field697 = null;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(II)I", line = 110)
    public static final int method522(int arg0, int arg1) {
        if (arg0 != -35) {
            field697 = null;
        }
        field700++;
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Ljava/lang/String;I)J", line = 124)
    public static final long method523(String arg0, int arg1) {
        field696++;
        int var2 = arg0.length();
        long var3 = (long) arg1;
        for (int var5 = 0; var5 < var2; var5++) {
            var3 = (var3 << 5) + ((long) arg0.charAt(var5)) - var3;
        }
        return var3;
    }
}
