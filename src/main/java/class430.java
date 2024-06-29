import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public abstract class class430 extends class577 {

    @OriginalMember(owner = "client!rm", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field5833 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!rm", name = "l", descriptor = "I")
    public static int field5831;

    @OriginalMember(owner = "client!rm", name = "m", descriptor = "I")
    public static int field5832;

    @OriginalMember(owner = "client!rm", name = "p", descriptor = "I")
    public static int field5835;

    @OriginalMember(owner = "client!rm", name = "o", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field5834;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIZB)V", line = 8)
    public static final void method2582(int arg0, int arg1, int arg2, boolean arg3, byte arg4) {
        field5831++;
        if (class21.field353.field10098.method1588(-16) == 0) {
            class92.method681((byte) -84, false);
        } else {
            class703.field9810 = class21.field353.field10098.method1588(-58);
            class9.method61(0, true, (byte) -40);
        }
        class74.field843 = arg3;
        if (arg4 != -99) {
            method2583(-7, (byte) -127, 75, 30, -76, 106, 0);
        }
        class204.field3177 = arg0;
        class694.field9688 = arg2;
        class117.method885(arg1);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IBIIIII)I", line = 33)
    public static final int method2583(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5832++;
        int var7 = arg0 & 0x3;
        if ((arg5 & 0x1) == 1) {
            int var8 = arg3;
            arg3 = arg2;
            arg2 = var8;
        }
        if (var7 == 0) {
            return arg4;
        }
        int var9 = -45 / ((arg1 + 92) / 34);
        if (var7 == 1) {
            return 7 + 1 - arg6 - arg3;
        } else if (var7 == 2) {
            return 7 + 1 - arg4 - arg2;
        } else {
            return arg6;
        }
    }

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "(I)V", line = 62)
    public static void method2584(int arg0) {
        field5833 = null;
        if (arg0 == -6982) {
            field5834 = null;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIB)V", line = 77)
    public static final void method2585(int arg0, int arg1, byte arg2) {
        class768.method4241(arg1, arg0, (byte) 71);
        if (arg2 == -28) {
            field5835++;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)I")
    public abstract int method991(int arg0);

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(I)I")
    public abstract int method993(int arg0);

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "(B)I")
    public abstract int method994(byte arg0);

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "(I)J")
    public abstract long method995(int arg0);

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "(B)I")
    public abstract int method992(byte arg0);
}
