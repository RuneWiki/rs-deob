import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class138 extends class79 {

    @OriginalMember(owner = "client!ok", name = "y", descriptor = "[I")
    public static int[] field2215 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!ok", name = "A", descriptor = "Lck;")
    public static class119 field2217 = class298.method1987((byte) 47, "");

    @OriginalMember(owner = "client!ok", name = "z", descriptor = "Lck;")
    public static class119 field2216 = class298.method1987((byte) 19, ")4a=");

    @OriginalMember(owner = "client!ok", name = "x", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!ok", name = "C", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!ok", name = "v", descriptor = "J")
    public long field2212;

    @OriginalMember(owner = "client!ok", name = "w", descriptor = "Lok;")
    public class138 field2213;

    @OriginalMember(owner = "client!ok", name = "B", descriptor = "Lok;")
    public class138 field2218;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)V", line = 4)
    public static void method910(int arg0) {
        field2215 = null;
        if (arg0 != 160) {
            field2217 = (class119) null;
        }
        field2217 = null;
        field2216 = null;
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(B)V", line = 17)
    public final void method911(byte arg0) {
        field2214++;
        if (this.field2213 == null) {
            return;
        }
        this.field2213.field2218 = this.field2218;
        this.field2218.field2213 = this.field2213;
        this.field2218 = null;
        this.field2213 = null;
        if (arg0 <= 74) {
            this.method911((byte) 59);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 43)
    public static final void method912(Component arg0, byte arg1) {
        field2219++;
        arg0.addMouseListener(class299.field5049);
        arg0.addMouseMotionListener(class299.field5049);
        if (arg1 == -50) {
            arg0.addFocusListener(class299.field5049);
        }
    }
}
