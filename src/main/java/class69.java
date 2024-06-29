import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class69 {

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "Lkg;")
    public static class275 field970 = new class275(82, 5);

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "Lhg;")
    public static class693 field971 = new class693(13, 3);

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
    public static int field973 = 0;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "[Ljava/awt/Color;")
    public static Color[] field972 = new Color[] { new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381) };

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "Lfia;")
    public static class577 field974 = new class577(11, 0, 1, 2);

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "[[I")
    public static int[][] field975 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)Z", line = 3)
    public static final boolean method627(int arg0, int arg1, int arg2) {
        field967++;
        if (arg2 != 0) {
            method629(96, null, 0, 84, false, false, null);
        }
        return (arg1 & 0x20) != 0;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIB)V", line = 20)
    public static final void method628(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        class667.field9373 = arg3;
        class225.field2994 = arg0;
        class546.field7619 = arg1;
        class760.field10606 = arg2;
        field969++;
        if (arg4 != -5) {
            field975 = null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILnd;IIZZLcea;)V", line = 36)
    public static final void method629(int arg0, class547 arg1, int arg2, int arg3, boolean arg4, boolean arg5, class216 arg6) {
        field968++;
        class393.method2216(arg5, arg0, arg1, 0, arg2, arg3);
        if (!arg4) {
            client.field3977 = arg6;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V", line = 50)
    public static void method630(int arg0) {
        if (arg0 != 0) {
            field975 = null;
        }
        field975 = null;
        field971 = null;
        field970 = null;
        field972 = null;
        field974 = null;
    }
}
