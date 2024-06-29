import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class36 {

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "I")
    public static int field540 = -1;

    @OriginalMember(owner = "client!gp", name = "e", descriptor = "I")
    public static int field542 = 1;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!gp", name = "d", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!gp", name = "f", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!gp", name = "g", descriptor = "Lhh;")
    public static class84 field544;

    @OriginalMember(owner = "client!gp", name = "h", descriptor = "[[[Lkf;")
    public static class165[][][] field545;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;", line = 4)
    public static final String method286(String arg0, String arg1, String arg2, int arg3) {
        field539++;
        int var4 = arg1.indexOf(arg0);
        if (arg3 != 0) {
            return null;
        }
        while (var4 != -1) {
            arg1 = arg1.substring(0, var4) + arg2 + arg1.substring(arg0.length() + var4);
            var4 = arg1.indexOf(arg0, arg2.length() + var4);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)V", line = 25)
    public static void method287(int arg0) {
        if (arg0 == -7989) {
            field544 = null;
            field545 = null;
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(BLjava/awt/Frame;Lci;)V", line = 47)
    public static final void method288(byte arg0, Frame arg1, class312 arg2) {
        while (true) {
            class100 var3 = arg2.method1948(arg1, false);
            while (var3.field1604 == 0) {
                class185.method1285(107, 10L);
            }
            if (var3.field1604 == 1) {
                field543++;
                arg1.setVisible(false);
                arg1.dispose();
                if (arg0 != 111) {
                    method289(-3, -43, true, 27, 55, 54, null);
                    return;
                }
                return;
            }
            class185.method1285(117, 100L);
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIZIII[B)Z", line = 74)
    public static final boolean method289(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, byte[] arg6) {
        field538++;
        if (!arg2) {
            method288((byte) 117, null, null);
        }
        int var7 = arg4 % arg3;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg3 - var7;
        }
        int var9 = -((arg5 + arg3 - 1) / arg3);
        int var10 = -((arg3 + arg4 - 1) / arg3);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg6[arg0] == 0) {
                    return true;
                }
                arg0 += arg3;
            }
            int var13 = arg0 - var8;
            if (arg6[var13 - 1] == 0) {
                return true;
            }
            arg0 = arg1 + var13;
        }
        return false;
    }
}
