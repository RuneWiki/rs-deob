import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public class class27 {

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "[I")
    public static int[] field742 = new int[13];

    @OriginalMember(owner = "client!qaa", name = "b", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field743 = new Rectangle[100];

    @OriginalMember(owner = "client!qaa", name = "c", descriptor = "Lqv;")
    public static class447 field744;

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field743[var0] = new Rectangle();
        }
        field744 = new class447();
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(B)V", line = 14)
    public static void method392(byte arg0) {
        field744 = null;
        field742 = null;
        field743 = null;
        if (arg0 != -43) {
            field743 = null;
        }
    }
}
