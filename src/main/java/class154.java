import java.awt.Component;
import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class154 {

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "Z")
    public static boolean field2748 = true;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
    public static int field2749 = 0;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "[I")
    public static int[] field2752;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "[I")
    public static int[] field2753;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
    public static final void method1175(int arg0) {
        if (arg0 != 95) {
            return;
        }
        if (class133.field2414 != null) {
            class133.field2414.method1073(arg0 + 18);
        }
        field2751++;
        if (class92.field1659 != null) {
            class92.field1659.method1073(113);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method1176(int arg0, Component arg1) {
        arg1.removeMouseListener(class22.field431);
        if (arg0 == -6392) {
            arg1.removeMouseMotionListener(class22.field431);
            arg1.removeFocusListener(class22.field431);
            field2754++;
            class218.field3758 = 0;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Ljava/lang/Throwable;BLjava/lang/String;)V")
    public static final void method1177(Throwable arg0, byte arg1, String arg2) {
        field2750++;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class206.method1447((byte) -28, arg0);
            }
            if (arg2 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class238.field4109.field2320 != null) {
                if (arg1 > -42) {
                    field2749 = 103;
                }
                class193 var8 = class238.field4109.method1021((byte) 60, new URL(class238.field4109.field2320.getCodeBase(), "clienterror.ws?c=" + class37.field705 + "&u=" + class17.field381 + "&v1=" + class129.field2324 + "&v2=" + class129.field2323 + "&e=" + var7));
                while (var8.field3421 == 0) {
                    class52.method417((byte) -115, 1L);
                }
                if (var8.field3421 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field3423;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V")
    public static void method1178(byte arg0) {
        if (arg0 > 89) {
            field2752 = null;
            field2753 = null;
        }
    }
}
