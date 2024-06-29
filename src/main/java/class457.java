import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class457 {

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "Z")
    public static boolean field6527 = true;

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "[[I")
    public static int[][] field6528 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "Lvt;")
    public static class344 field6529 = new class344("flash2:", "blinken2:", "clignotant2:", "flash2:");

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(I)V")
    public static void method2658(int arg0) {
        int var1 = -82 % ((arg0 + 72) / 38);
        field6529 = null;
        field6528 = null;
    }
}
