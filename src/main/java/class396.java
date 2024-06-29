import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class396 {

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public static int field5470;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    public static int field5471;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "Lde;")
    public static class418 field5469;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZLgh;)I", line = 6)
    public static final int method2358(boolean arg0, class506 arg1) {
        field5470++;
        class179 var2 = arg1.field6964;
        if (var2.field2683 != null) {
            var2 = var2.method1304(class578.field8328, -25917);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field2735;
        class31 var4 = arg1.method1783(arg0);
        if (arg1.field4040 == -1 || arg1.field4109) {
            var3 = var2.field2711;
        } else if (arg1.field4040 == var4.field388 || arg1.field4040 == var4.field347 || arg1.field4040 == var4.field385 || arg1.field4040 == var4.field355) {
            var3 = var2.field2701;
        } else if (arg1.field4040 == var4.field344 || arg1.field4040 == var4.field368 || arg1.field4040 == var4.field359 || arg1.field4040 == var4.field341) {
            var3 = var2.field2728;
        }
        return var3;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V", line = 40)
    public static void method2359(int arg0) {
        int var1 = -106 / ((33 - arg0) / 61);
        field5469 = null;
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(II)V", line = 53)
    public class396(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!vb", name = "toString", descriptor = "()Ljava/lang/String;", line = 65)
    public final String toString() {
        field5471++;
        throw new IllegalStateException();
    }
}
