import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class157 extends class4 {

    @OriginalMember(owner = "client!gk", name = "E", descriptor = "[B")
    public byte[] field2547;

    @OriginalMember(owner = "client!gk", name = "A", descriptor = "Lad;")
    public static class252 field2544 = new class252();

    @OriginalMember(owner = "client!gk", name = "C", descriptor = "[I")
    public static int[] field2546 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!gk", name = "G", descriptor = "I")
    public static int field2548 = -1;

    @OriginalMember(owner = "client!gk", name = "x", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!gk", name = "y", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!gk", name = "z", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!gk", name = "B", descriptor = "Lqh;")
    public static class201 field2545;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method1099(Component arg0, int arg1) {
        field2541++;
        arg0.addMouseListener(class12.field234);
        arg0.addMouseMotionListener(class12.field234);
        if (arg1 == 5926) {
            arg0.addFocusListener(class12.field234);
        }
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(Z)V")
    public static void method1100(boolean arg0) {
        field2546 = null;
        field2545 = null;
        field2544 = null;
        if (arg0) {
            method1100(false);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lqh;BLqh;)V")
    public static final void method1101(class201 arg0, byte arg1, class201 arg2) {
        class214.field3507 = arg0;
        field2543++;
        int var3 = (int) (Math.random() * 21.0D) - 10;
        class199.field3185 = arg2;
        class199.field3185.method1361(34, -96);
        int var4 = (int) (Math.random() * 21.0D) - 10;
        int var5 = (int) (Math.random() * 21.0D) - 10;
        if (arg1 >= 15) {
            int var6 = (int) (Math.random() * 41.0D) - 20;
            class128.field2065 = var4 + var6;
            class209.field3422 = var3 + var6;
            class112.field1856 = var5 + var6;
        }
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "([B)V")
    public class157(byte[] arg0) {
        this.field2547 = arg0;
    }
}
