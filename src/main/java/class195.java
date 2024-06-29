import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public abstract class class195 {

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "I")
    public static int field3229 = 0;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "Z")
    public static boolean field3232;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "[I")
    public static int[] field3230;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)I", line = 19)
    public static final int method1416(int arg0, int arg1) {
        field3231++;
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var3 = arg0 * 6 - 61440;
        int var4 = (arg0 * var3 >> 12) + 40960;
        if (arg1 >= -92) {
            method1416(117, -90);
        }
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(B)V", line = 63)
    public static void method1419(byte arg0) {
        if (arg0 != -52) {
            method1416(45, 38);
        }
        field3230 = null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method1417(int arg0, Component arg1);

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)I")
    public abstract int method1418(byte arg0);

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method1420(Component arg0, int arg1);
}
