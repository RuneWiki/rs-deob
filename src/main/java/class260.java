import java.awt.Canvas;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class260 {

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "[F")
    public static float[] field3624 = new float[16384];

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "[F")
    public static float[] field3625 = new float[16384];

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "Z")
    public static boolean field3627;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "Lhda;")
    public static class752 field3628;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "[I")
    public static int[] field3630;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "Ljava/io/FileOutputStream;")
    public static FileOutputStream field3626;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
    public static void method1577(int arg0) {
        field3625 = null;
        if (arg0 == 0) {
            field3626 = null;
            field3628 = null;
            field3630 = null;
            field3624 = null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Ld;ZILjava/awt/Canvas;)Lha;")
    public static final class59 method1578(class152 arg0, boolean arg1, int arg2, Canvas arg3) {
        if (arg1) {
            method1578(null, true, -20, null);
        }
        field3623++;
        return new class663(arg3, arg0, arg2);
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field3625[var2] = (float) Math.sin((double) var2 * var0);
            field3624[var2] = (float) Math.cos((double) var2 * var0);
        }
        field3627 = false;
        field3628 = new class752(93, 10);
        field3629 = 0;
        field3630 = new int[] { 32, 39, 44, 47 };
    }
}
