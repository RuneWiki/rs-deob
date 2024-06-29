import java.awt.Rectangle;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class682 extends class386 {

    @OriginalMember(owner = "client!qp", name = "G", descriptor = "Z")
    public static boolean field9117 = false;

    @OriginalMember(owner = "client!qp", name = "I", descriptor = "I")
    public static int field9119 = 0;

    @OriginalMember(owner = "client!qp", name = "L", descriptor = "Lkw;")
    public static class263 field9122 = new class263("stellardawn", 1);

    @OriginalMember(owner = "client!qp", name = "E", descriptor = "I")
    public static int field9115;

    @OriginalMember(owner = "client!qp", name = "H", descriptor = "I")
    public static int field9118;

    @OriginalMember(owner = "client!qp", name = "J", descriptor = "I")
    public static int field9120;

    @OriginalMember(owner = "client!qp", name = "K", descriptor = "I")
    public static int field9121;

    @OriginalMember(owner = "client!qp", name = "F", descriptor = "Ljava/lang/String;")
    public static String field9116;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIIII)V")
    public static final void method3741(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = arg0; ~var5 > ~class689.field9209; ++var5) {
            Rectangle var6 = class561.field7691[var5];
            if (~arg2 > ~(var6.x + var6.width) && ~(arg2 + arg3) < ~var6.x && ~(var6.y - -var6.height) < ~arg4 && ~(arg1 + arg4) < ~var6.y) {
                class753.field10199[var5] = true;
            }
        }
        ++field9121;
        class199.method1300(arg4, arg2 - -arg3, 8963, arg2, arg1 + arg4);
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIBII)V")
    public final void method2402(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        ++field9118;
        int var6 = super.field5617.method343();
        int var7 = 86 / ((-37 - arg2) / 48);
        int var8 = ((class709) super.field7476).field9697 * class733.method4043(96) / 10 % var6;
        super.field5617.method978(arg1 - -var8 + -var6, arg4, -var8 + var6 + arg3, arg0);
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Z)V")
    public static void method3742(boolean arg0) {
        field9122 = null;
        if (arg0) {
            field9119 = -103;
        }
        field9116 = null;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Ljava/lang/String;ILec;I)Lth;")
    public static final class621 method3743(String arg0, int arg1, class248 arg2, int arg3) {
        ++field9120;
        if (arg3 == 0) {
            return arg2.method1548(arg0, 11383);
        } else if (arg1 != 2) {
            return null;
        } else if (arg3 == 1) {
            try {
                class376.method2360(new Object[] { (new URL(class552.field7624.getCodeBase(), arg0)).toString() }, "openjs", class552.field7624, true);
                class621 var4 = new class621();
                var4.field8405 = 1;
                return var4;
            } catch (Throwable var10) {
                class621 var5 = new class621();
                var5.field8405 = 2;
                return var5;
            }
        } else if (~arg3 == -3) {
            try {
                class552.field7624.getAppletContext().showDocument(new URL(class552.field7624.getCodeBase(), arg0), "_blank");
                class621 var6 = new class621();
                var6.field8405 = 1;
                return var6;
            } catch (Exception var11) {
                class621 var7 = new class621();
                var7.field8405 = 2;
                return var7;
            }
        } else if (arg3 == 3) {
            try {
                class376.method2358(class552.field7624, arg1 ^ 3862, "loggedout");
            } catch (Throwable var13) {
            }
            try {
                class552.field7624.getAppletContext().showDocument(new URL(class552.field7624.getCodeBase(), arg0), "_top");
                class621 var8 = new class621();
                var8.field8405 = 1;
                return var8;
            } catch (Exception var12) {
                class621 var9 = new class621();
                var9.field8405 = 2;
                return var9;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Luq;Luq;Lar;)V")
    public class682(class172 arg0, class172 arg1, class709 arg2) {
        super(arg0, arg1, arg2);
    }
}
