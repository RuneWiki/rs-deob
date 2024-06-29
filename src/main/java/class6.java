import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class6 extends class627 {

    @OriginalMember(owner = "client!ps", name = "j", descriptor = "[B")
    public byte[] field64;

    @OriginalMember(owner = "client!ps", name = "l", descriptor = "Lqi;")
    public static class669 field66 = new class669(7, 2);

    @OriginalMember(owner = "client!ps", name = "n", descriptor = "Z")
    public static boolean field68 = false;

    @OriginalMember(owner = "client!ps", name = "o", descriptor = "[Z")
    public static boolean[] field69 = new boolean[100];

    @OriginalMember(owner = "client!ps", name = "k", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!ps", name = "m", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "([B)V", line = 5)
    public class6(byte[] arg0) {
        this.field64 = arg0;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)V", line = 13)
    public static void method28(int arg0) {
        if (arg0 != -1) {
            method30(-79, 114, false);
        }
        field66 = null;
        field69 = null;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(BLgba;ILbh;IIILqca;Lha;)V", line = 24)
    public static final void method29(byte arg0, class499 arg1, int arg2, class429 arg3, int arg4, int arg5, int arg6, class351 arg7, class454 arg8) {
        field65++;
        if (arg0 != -59) {
            return;
        }
        int var9 = arg6 - (arg5 / 2) - 5;
        int var10 = arg4 + 2;
        if (arg7.field4583 != 0) {
            arg8.method2668(var10, false, arg5 + 10, arg4 + 1 - (-(arg2 * arg3.method2558()) - -var10), var9, arg7.field4583);
        }
        if (arg7.field4584 != 0) {
            arg8.method2659(arg5 + 10, var9, arg4 + (arg3.method2558() * arg2) + 1 - var10, arg0 ^ 0xFFFFFFC5, arg7.field4584, var10);
        }
        int var11 = arg7.field4616;
        if (arg1.field7052 && arg7.field4595 != -1) {
            var11 = arg7.field4595;
        }
        for (int var12 = 0; var12 < arg2; var12++) {
            String var13 = class405.field5714[var12];
            if (var12 < arg2 - 1) {
                var13 = var13.substring(0, var13.length() - 4);
            }
            arg3.method2556(arg8, var13, arg6, arg4, var11, true);
            arg4 += arg3.method2558();
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IIZ)Lrl;", line = 66)
    public static final class685 method30(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            return null;
        }
        field67++;
        class685 var3 = new class685();
        var3.field9685 = -1;
        var3.field9694 = arg1 + 6;
        var3.field9681 = arg0 + 1 + 5;
        var3.field9679 = -1;
        var3.field9700 = new int[var3.field9681][var3.field9694];
        var3.method3794(-29);
        return var3;
    }
}
