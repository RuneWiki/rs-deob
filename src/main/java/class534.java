import java.awt.Color;
import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class534 extends OutputStream {

    @OriginalMember(owner = "client!at", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field7454 = new String[200];

    @OriginalMember(owner = "client!at", name = "f", descriptor = "Liu;")
    public static class517 field7459 = new class517(85, 1);

    @OriginalMember(owner = "client!at", name = "g", descriptor = "I")
    public static int field7460 = 0;

    @OriginalMember(owner = "client!at", name = "h", descriptor = "[Ljava/awt/Color;")
    public static Color[] field7461 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!at", name = "b", descriptor = "I")
    public static int field7455;

    @OriginalMember(owner = "client!at", name = "c", descriptor = "I")
    public static int field7456;

    @OriginalMember(owner = "client!at", name = "d", descriptor = "I")
    public static int field7457;

    @OriginalMember(owner = "client!at", name = "e", descriptor = "I")
    public static int field7458;

    static {
        new class567("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Z)V", line = 3)
    public static void method3016(boolean arg0) {
        field7459 = null;
        if (arg0) {
            field7460 = 108;
        }
        field7461 = null;
        field7454 = null;
    }

    @OriginalMember(owner = "client!at", name = "write", descriptor = "(I)V", line = 15)
    public final void write(int arg0) throws IOException {
        field7458++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(B)V", line = 25)
    public static final void method3017(byte arg0) {
        class395 var1 = class461.field6670;
        synchronized (class461.field6670) {
            class461.field6670.method2404((byte) -79);
        }
        field7457++;
        class395 var2 = class496.field6946;
        synchronized (class496.field6946) {
            class496.field6946.method2404((byte) -44);
            int var3 = 23 / ((arg0 + 52) / 46);
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(IIBIIII)V", line = 40)
    public static final void method3018(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field7456++;
        if (arg4 >= class183.field2638 && arg0 <= class268.field3911 && class222.field3350 <= arg6 && arg3 <= class409.field6071) {
            if (arg5 == 1) {
                class325.method2013(arg1, arg6, -453907455, arg4, arg0, arg3);
            } else {
                class611.method3468(arg2 ^ 0xFFFFFFD6, arg5, arg4, arg1, arg3, arg0, arg6);
            }
        } else if (arg5 == 1) {
            class156.method1102(56, arg3, arg6, arg4, arg1, arg0);
        } else {
            class77.method732(50, arg6, arg4, arg3, arg5, arg1, arg0);
        }
        if (arg2 != 80) {
            field7454 = null;
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(III)I", line = 86)
    public static final int method3019(int arg0, int arg1, int arg2) {
        field7455++;
        if (arg0 == arg2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        } else {
            int var3 = (arg2 & 0x7F) * arg1 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }
}
