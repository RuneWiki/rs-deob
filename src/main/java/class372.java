import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class372 extends class656 {

    @OriginalMember(owner = "client!om", name = "Q", descriptor = "[I")
    public static int[] field4753 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!om", name = "P", descriptor = "Lbga;")
    public static class356 field4752 = new class356();

    @OriginalMember(owner = "client!om", name = "R", descriptor = "I")
    public static int field4754;

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(I)V")
    public static void method2163(int arg0) {
        field4752 = null;
        field4753 = null;
        int var1 = -14 / ((arg0 + 11) / 58);
    }

    @OriginalMember(owner = "client!om", name = "d", descriptor = "(I)V")
    public static final void method2164(int arg0) {
        field4754++;
        class313.method1860(true, arg0);
        class254.method1516((byte) 95);
        System.gc();
    }
}
