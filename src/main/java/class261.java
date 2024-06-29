import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public abstract class class261 extends class408 {

    @OriginalMember(owner = "client!fc", name = "A", descriptor = "I")
    public int field3712;

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "Z")
    public static boolean field3710 = false;

    @OriginalMember(owner = "client!fc", name = "B", descriptor = "[I")
    public static int[] field3713 = new int[500];

    @OriginalMember(owner = "client!fc", name = "C", descriptor = "Z")
    public static boolean field3714 = false;

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)Z")
    public abstract boolean method936(int arg0);

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(I)V")
    public class261(int arg0) {
        this.field3712 = arg0;
    }

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "(I)V")
    public static void method1690(int arg0) {
        if (arg0 == 27389) {
            field3713 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)Ljava/lang/Object;")
    public abstract Object method938(boolean arg0);

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIII)V")
    public static final void method1691(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class63.field916.field10184.method2268(17503) * arg2 >> 8;
        int var5 = -5 / ((arg0 - 30) / 63);
        field3711++;
        if (var4 == 0 || arg3 == -1) {
            return;
        }
        if (!class202.field3022 && class9.field142 != -1 && class426.method2662(-122) && !class548.method3203(0)) {
            class407.field6148 = class280.method1782((byte) 110);
            class336 var6 = class280.method1783(class407.field6148, 52);
            class35.method180(var6, -39, true);
        }
        class187.method1308(var4, class79.field1115, 0, false, arg3, 0);
        class22.method118((byte) 115, 255, -1);
        class202.field3022 = true;
    }
}
