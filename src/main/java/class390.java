import java.awt.Color;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class390 {

    @OriginalMember(owner = "client!el", name = "d", descriptor = "I")
    public static int field5481 = 0;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "[Ljava/awt/Color;")
    public static Color[] field5482 = new Color[] { new Color(16777215), new Color(16777215) };

    @OriginalMember(owner = "client!el", name = "b", descriptor = "I")
    public static int field5479;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "I")
    public static int field5480;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "I")
    public static int field5483;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "Loi;")
    public static class53 field5478;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "Loi;")
    public static class53 field5484;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "[[B")
    public static byte[][] field5485;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lnt;Ljava/awt/Frame;B)V")
    public static final void method2259(class151 arg0, Frame arg1, byte arg2) {
        field5480++;
        while (true) {
            class370 var3 = arg0.method962((byte) 89, arg1);
            while (var3.field5277 == 0) {
                class52.method411(10L, (byte) 110);
            }
            if (var3.field5277 == 1) {
                arg1.setVisible(false);
                if (arg2 >= -118) {
                    field5478 = null;
                }
                arg1.dispose();
                return;
            }
            class52.method411(100L, (byte) 111);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(B)V")
    public static void method2260(byte arg0) {
        field5485 = null;
        field5484 = null;
        field5482 = null;
        field5478 = null;
        if (arg0 != -84) {
            field5478 = null;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IB)Z")
    public static final boolean method2261(int arg0, byte arg1) {
        field5479++;
        if (arg1 != 108) {
            method2260((byte) -76);
        }
        return arg0 == 3 || arg0 == 4;
    }
}
