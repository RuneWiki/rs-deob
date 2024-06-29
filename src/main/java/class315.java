import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class315 implements Runnable {

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "[Lefa;")
    public volatile class531[] field4359 = new class531[2];

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "Z")
    public volatile boolean field4360 = false;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "Z")
    public volatile boolean field4361 = false;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "[Z")
    public static boolean[] field4362 = new boolean[100];

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "[Ljava/awt/Color;")
    public static Color[] field4357 = new Color[] { new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381) };

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "Lrp;")
    public class135 field4363;

    @OriginalMember(owner = "client!fk", name = "run", descriptor = "()V", line = 8)
    public final void run() {
        field4358++;
        this.field4361 = true;
        try {
            while (!this.field4360) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class531 var2 = this.field4359[var1];
                    if (var2 != null) {
                        var2.method3150((byte) 119);
                    }
                }
                class688.method3874(10L, -7375);
                class192.method1184(this.field4363, null, 25475);
            }
        } catch (Exception var9) {
            class31.method172(var9, null, 0);
        } finally {
            Object var6 = null;
            this.field4361 = false;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V", line = 42)
    public static void method2054(int arg0) {
        field4357 = null;
        if (arg0 >= -64) {
            method2054(49);
        }
        field4362 = null;
    }
}
