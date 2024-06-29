import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class405 extends class325 {

    @OriginalMember(owner = "client!ge", name = "H", descriptor = "I")
    public int field5999;

    @OriginalMember(owner = "client!ge", name = "I", descriptor = "I")
    public static int field6000 = 0;

    @OriginalMember(owner = "client!ge", name = "L", descriptor = "I")
    public static int field6003 = 0;

    @OriginalMember(owner = "client!ge", name = "G", descriptor = "I")
    public static int field5998;

    @OriginalMember(owner = "client!ge", name = "J", descriptor = "I")
    public static int field6001;

    @OriginalMember(owner = "client!ge", name = "K", descriptor = "I")
    public static int field6002;

    @OriginalMember(owner = "client!ge", name = "M", descriptor = "I")
    public static int field6004;

    @OriginalMember(owner = "client!ge", name = "N", descriptor = "I")
    public static int field6005;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)Z", line = 3)
    public static final boolean method2496(int arg0, int arg1, int arg2) {
        field6005++;
        if (arg1 == 0) {
            return class505.method3055(arg2, arg0, (byte) -45) | (arg2 & 0x60000) != 0 || class368.method2355(-11, arg2, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lnha;Ljn;IIIIIIIIIIIIII)V", line = 14)
    public class405(class686 arg0, class322 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);
        this.field5999 = arg15;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IBI)Z", line = 22)
    public static final boolean method2497(int arg0, byte arg1, int arg2) {
        if (arg1 < 66) {
            return false;
        } else {
            field5998++;
            return (arg2 & 0x800) != 0;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)Lvj;", line = 40)
    public final class26 method117(int arg0) {
        field6002++;
        if (arg0 != 1) {
            this.field5999 = -106;
        }
        return class119.field1827;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILfc;Ljava/lang/String;ZZ)V", line = 54)
    public static final void method2498(int arg0, class731 arg1, String arg2, boolean arg3, boolean arg4) {
        field6001++;
        if (arg0 != 3) {
            method2496(-65, 64, 25);
        }
        if (!arg3) {
            class569.method3300(arg2, arg0 + 107, 3, arg1);
            return;
        }
        if (class731.field10269.startsWith("win") && arg1.field10270) {
            String var5 = null;
            if (class351.field5138 != null) {
                var5 = class351.field5138.getParameter("haveie6");
            }
            if (var5 == null || !var5.equals("1")) {
                class162 var6 = class569.method3300(arg2, 104, 0, arg1);
                class372.field5643 = var6;
                class733.field10316 = arg1;
                class304.field4629 = arg2;
                return;
            }
        }
        if (class731.field10269.startsWith("mac")) {
            String var7 = null;
            if (class351.field5138 != null) {
                var7 = class351.field5138.getParameter("havefirefox");
            }
            if (var7 != null && var7.equals("1") && arg4) {
                class569.method3300(arg2, arg0 ^ 0x50, 1, arg1);
                return;
            }
        }
        class569.method3300(arg2, 115, 2, arg1);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lla;Ljava/awt/Canvas;IIBLd;)Lha;", line = 125)
    public static final class544 method2499(class422 arg0, Canvas arg1, int arg2, int arg3, byte arg4, class267 arg5) {
        field6004++;
        int var6 = 0;
        if (arg4 > -18) {
            field6000 = 118;
        }
        int var7 = 0;
        if (arg1 != null) {
            Dimension var8 = arg1.getSize();
            var6 = var8.width;
            var7 = var8.height;
        }
        return class544.method3186(arg3, arg2, var7, arg1, false, arg5, var6, arg0);
    }
}
