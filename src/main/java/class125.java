import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class125 extends class29 {

    @OriginalMember(owner = "client!qf", name = "u", descriptor = "[I")
    public static int[] field2243 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!qf", name = "v", descriptor = "I")
    public static int field2244 = 0;

    @OriginalMember(owner = "client!qf", name = "z", descriptor = "I")
    public static int field2248 = -2;

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "[[I")
    public static int[][] field2239 = new int[5][5000];

    @OriginalMember(owner = "client!qf", name = "r", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!qf", name = "t", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!qf", name = "x", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!qf", name = "y", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!qf", name = "w", descriptor = "Lfl;")
    public static class192 field2245;

    @OriginalMember(owner = "client!qf", name = "s", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field2241;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lvf;IZ)V")
    public static final void method837(class265 arg0, int arg1, boolean arg2) {
        field2246++;
        class178 var3 = class188.method1282(arg1, 2, 261360480);
        var3.method1162(arg2);
        var3.field3181 = arg0;
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(I)V")
    public static void method838(int arg0) {
        if (arg0 != 4) {
            method838(-126);
        }
        field2245 = null;
        field2241 = null;
        field2243 = null;
        field2239 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)Lrj;")
    public static final class15 method839(int arg0, int arg1) {
        field2247++;
        class15 var2 = (class15) class43.field957.method1887(127, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        if (arg1 != -2) {
            field2239 = null;
        }
        byte[] var3 = class103.field1838.method1332(true, arg0, 3);
        class15 var4 = new class15();
        if (var3 != null) {
            var4.method114(-1, new class135(var3));
        }
        class43.field957.method1892(var4, (long) arg0, (byte) -127);
        return var4;
    }
}
