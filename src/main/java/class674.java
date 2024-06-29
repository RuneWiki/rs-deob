import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class674 {

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "Lcb;")
    public static class631 field9527 = new class631(24, 6);

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
    public static int field9528;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
    public static int field9529;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
    public static int field9530;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "I")
    public static int field9531;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "Lsda;")
    public class749 field9532;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIBIILha;)V", line = 3)
    public static final void method3760(int arg0, int arg1, byte arg2, int arg3, int arg4, class544 arg5) {
        field9529++;
        class13.field119 = arg5;
        class377.field5673 = class13.field119.method414();
        class118.field1823 = class13.field119.method414();
        class418.field6153 = class13.field119.method414();
        class554.field7897 = 0;
        class694.field9852 = arg4;
        if (arg2 != -125) {
            field9527 = null;
        }
        class693.field9827 = null;
        class146.field2300 = arg1;
        class70.field1087 = null;
        class447.method2753(arg3, arg0, (byte) 62);
        class478.field6939 = -1;
        class221.field3592 = -1;
        class607.field8569 = -1;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIB)B", line = 26)
    public static final byte method3761(int arg0, int arg1, byte arg2) {
        field9528++;
        if (arg2 < 55) {
            field9530 = -58;
        }
        if (arg1 == 9) {
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(BIII)I", line = 45)
    public static final int method3762(byte arg0, int arg1, int arg2, int arg3) {
        field9531++;
        if (arg0 != -74) {
            method3760(54, 46, (byte) -55, -104, 80, null);
        }
        int var4 = 255 - arg3;
        int var5 = ((arg1 & 0xFF00) * arg3 & 0xFF0000 | (arg1 & 0xFF00FF) * arg3 & 0xFF00FF00) >>> 8;
        return (((arg2 & 0xFF00FF) * var4 & 0xFF00FF00 | (arg2 & 0xFF00) * var4 & 0xFF0000) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V", line = 68)
    public static void method3763(int arg0) {
        if (arg0 > -39) {
            field9527 = null;
        }
        field9527 = null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)V", line = 82)
    public static final void method3764(int arg0, int arg1) {
        class114 var2 = class488.field7062[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class114 var4 = class488.field7062[var3][arg0][arg1] = class488.field7062[var3 + 1][arg0][arg1];
            if (var4 != null) {
                for (class291 var5 = var4.field1772; var5 != null; var5 = var5.field4479) {
                    class559 var6 = var5.field4482;
                    if (var6.field7927 == arg0 && var6.field7930 == arg1) {
                        var6.field9470--;
                    }
                }
                if (var4.field1768 != null) {
                    var4.field1768.field9470--;
                }
                if (var4.field1762 != null) {
                    var4.field1762.field9470--;
                }
                if (var4.field1764 != null) {
                    var4.field1764.field9470--;
                }
                if (var4.field1767 != null) {
                    var4.field1767.field9470--;
                }
                if (var4.field1777 != null) {
                    var4.field1777.field9470--;
                }
            }
        }
        if (class488.field7062[0][arg0][arg1] == null) {
            class488.field7062[0][arg0][arg1] = new class114(0);
            class488.field7062[0][arg0][arg1].field1766 = 1;
        }
        class488.field7062[0][arg0][arg1].field1776 = var2;
        class488.field7062[3][arg0][arg1] = null;
    }
}
