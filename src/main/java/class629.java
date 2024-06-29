import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class629 extends class687 {

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "I")
    public int field8821;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
    public static int field8818 = -1;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "[I")
    public static int[] field8817 = new int[120];

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "Z")
    public static volatile boolean field8822;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    public static int field8813;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    public static int field8814;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "I")
    public static int field8815;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "I")
    public static int field8816;

    @OriginalMember(owner = "client!cf", name = "t", descriptor = "I")
    public static int field8823;

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "Len;")
    public static class337 field8820;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field8819;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZII)Z")
    public static final boolean method3603(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            field8819 = null;
        }
        field8816++;
        return class25.method238((byte) -78, arg2, arg1) | (arg1 & 0x60000) != 0 || class346.method2194(arg2, arg1, (byte) -126) || class575.method3375(true, arg2, arg1);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
    public static void method3604(byte arg0) {
        field8819 = null;
        field8820 = null;
        if (arg0 != -59) {
            field8818 = 74;
        }
        field8817 = null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)Lsaa;")
    public final class345 method1656(int arg0) {
        if (arg0 != 0) {
            method3604((byte) -7);
        }
        field8813++;
        return class463.field6534;
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(ILin;Lti;III)V")
    public class629(int arg0, class97 arg1, class463 arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field8821 = arg5;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method3605(String arg0, int arg1) {
        field8814++;
        if (class762.field10501 == null) {
            return;
        }
        class521.field7363++;
        if (arg1 != 4) {
            field8822 = true;
        }
        class312 var2 = class353.method2245(class87.field971, class81.field900, (byte) 115);
        var2.field4445.method2952(0, class348.method2204((byte) -120, arg0));
        var2.field4445.method2953(arg0, -28136);
        class208.method1440(var2, 106);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method3606(int arg0, String arg1) {
        field8815++;
        if (arg0 != 14717) {
            method3604((byte) -89);
        }
        class788.method4313("", (byte) 51, "", arg1, 0, 0, "");
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 120; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field8817[var1] = var0 / 4;
        }
        field8822 = false;
    }
}
