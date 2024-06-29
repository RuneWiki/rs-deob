import jaggl.memory.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class457 extends class517 {

    @OriginalMember(owner = "client!cm", name = "x", descriptor = "Ljaggl/memory/NativeHeap;")
    public NativeHeap field7051;

    @OriginalMember(owner = "client!cm", name = "u", descriptor = "I")
    public static int field7048 = 0;

    @OriginalMember(owner = "client!cm", name = "s", descriptor = "Lof;")
    public static class328 field7046 = new class328(50);

    @OriginalMember(owner = "client!cm", name = "t", descriptor = "I")
    public static int field7047;

    @OriginalMember(owner = "client!cm", name = "w", descriptor = "I")
    public static int field7050;

    @OriginalMember(owner = "client!cm", name = "A", descriptor = "I")
    public static int field7054;

    @OriginalMember(owner = "client!cm", name = "y", descriptor = "Lo;")
    public static class139 field7052;

    @OriginalMember(owner = "client!cm", name = "z", descriptor = "Lgl;")
    public static class440 field7053;

    @OriginalMember(owner = "client!cm", name = "v", descriptor = "Lfq;")
    public static class98 field7049;

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)V")
    public static final void method2865(int arg0) {
        field7047++;
        class231.field3825.method2187(-1);
        field7046.method2187(arg0 - 1);
        class34.field344.method2187(-1);
        if (arg0 != 0) {
            field7048 = -93;
        }
        class81.field1196.method2187(-1);
        class434.field6553.method2187(~arg0);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Z)V")
    public static void method2866(boolean arg0) {
        field7053 = null;
        field7049 = null;
        field7046 = null;
        if (!arg0) {
            method2866(true);
        }
        field7052 = null;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lhw;I)V")
    public static final void method2867(class208 arg0, int arg1) {
        field7050++;
        int var2 = -91 / ((8 - arg1) / 42);
        for (int var3 = 0; var3 < class292.field4601; var3++) {
            int var4 = arg0.method1481(false);
            int var5 = arg0.method1455(-3387);
            if (var5 == 65535) {
                var5 = -1;
            }
            if (class326.field5124[var4] != null) {
                class326.field5124[var4].field2444 = var5;
            }
        }
    }

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "(I)V")
    public final void method2868(int arg0) {
        this.field7051.method122();
        field7054++;
        if (arg0 != -7273) {
            method2866(true);
        }
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(I)V")
    public class457(int arg0) {
        this.field7051 = new NativeHeap(arg0);
    }
}
