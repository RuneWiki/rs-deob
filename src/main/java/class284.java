import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public abstract class class284 extends class200 {

    @OriginalMember(owner = "client!nn", name = "y", descriptor = "Z")
    public volatile boolean field4053 = true;

    @OriginalMember(owner = "client!nn", name = "w", descriptor = "Lan;")
    public static class20 field4051 = new class20(16);

    @OriginalMember(owner = "client!nn", name = "z", descriptor = "[Z")
    public static boolean[] field4054 = new boolean[200];

    @OriginalMember(owner = "client!nn", name = "A", descriptor = "Lop;")
    public static class124 field4055 = new class124("WTRC", 1);

    @OriginalMember(owner = "client!nn", name = "v", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!nn", name = "x", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!nn", name = "C", descriptor = "I")
    public static int field4057;

    @OriginalMember(owner = "client!nn", name = "u", descriptor = "Z")
    public boolean field4049;

    @OriginalMember(owner = "client!nn", name = "B", descriptor = "Z")
    public boolean field4056;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Z)V")
    public static final void method1808(boolean arg0) {
        field4052++;
        try {
            if (arg0) {
                field4050 = -12;
            }
            if (class289.field4118 == 1) {
                int var1 = class315.field4741.method2792(104);
                if (var1 > 0 && class315.field4741.method2818(105)) {
                    int var2 = var1 - class431.field6417;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class315.field4741.method2822(15, var2);
                } else {
                    class315.field4741.method2824(-31449);
                    class315.field4741.method2796((byte) 40);
                    class511.field7536 = null;
                    class90.field1563 = null;
                    if (class488.field7226 == null) {
                        class289.field4118 = 0;
                    } else {
                        class289.field4118 = 2;
                    }
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class315.field4741.method2824(-31449);
            class90.field1563 = null;
            class511.field7536 = null;
            class289.field4118 = 0;
            class488.field7226 = null;
        }
    }

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "(I)I")
    public abstract int method1451(int arg0);

    @OriginalMember(owner = "client!nn", name = "f", descriptor = "(I)V")
    public static void method1809(int arg0) {
        field4055 = null;
        field4054 = null;
        if (arg0 != 200) {
            method1808(true);
        }
        field4051 = null;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(B)[B")
    public abstract byte[] method1445(byte arg0);
}
