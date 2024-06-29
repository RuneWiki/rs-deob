import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class356 extends Canvas {

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "Ljava/awt/Component;")
    private Component field5176;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public static int field5172;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field5173;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field5175;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    public static int field5177;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public static int field5178;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "[I")
    public static int[] field5174;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
    public static void method2271(int arg0) {
        field5174 = null;
        if (arg0 != 0) {
            method2271(-103);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IB[B)I")
    public static final int method2272(int arg0, byte arg1, byte[] arg2) {
        field5175++;
        if (arg1 <= 28) {
            method2272(-35, (byte) -114, (byte[]) null);
        }
        return client.method1810(arg0, 2022, 0, arg2);
    }

    @OriginalMember(owner = "client!ce", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field5172++;
        this.field5176.paint(arg0);
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class356(Component arg0) {
        this.field5176 = arg0;
    }

    @OriginalMember(owner = "client!ce", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field5176.update(arg0);
        field5177++;
    }
}
