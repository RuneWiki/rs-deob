import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class176 {

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
    public int field2733;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
    public int field2734;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
    public int field2737;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
    public int field2732;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "[I")
    public static int[] field2735 = new int[14];

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "Lwv;")
    public static class37 field2740 = new class37(4, 4);

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "[I")
    public static int[] field2738;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIILfha;)V")
    public static final void method1278(int arg0, int arg1, int arg2, class399 arg3) {
        class46 var4 = class704.method3985(arg0, arg1, arg2);
        if (var4 == null) {
            return;
        }
        var4.field587 = arg3;
        int var5 = class774.field10642 == class208.field3219 ? 1 : 0;
        if (arg3.method909(false)) {
            if (arg3.method906(122)) {
                arg3.field5747 = class338.field4733[var5];
                class338.field4733[var5] = arg3;
                return;
            }
            arg3.field5747 = class745.field10328[var5];
            class745.field10328[var5] = arg3;
            class98.field1115 = true;
            return;
        }
        arg3.field5747 = class695.field9711[var5];
        class695.field9711[var5] = arg3;
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(IIII)V")
    public class176(int arg0, int arg1, int arg2, int arg3) {
        this.field2733 = arg1;
        this.field2734 = arg3;
        this.field2737 = arg2;
        this.field2732 = arg0;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(III)Z")
    public static final boolean method1279(int arg0, int arg1, int arg2) {
        field2739++;
        return arg2 == 0 ? (class747.method4161(arg1, (byte) -92, arg0) | (arg1 & 0x2000) != 0 | class611.method3551(true, arg1, arg0)) & class474.method2815(false, arg1, arg0) : true;
    }

    @OriginalMember(owner = "client!uh", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2736++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
    public static void method1280(int arg0) {
        if (arg0 != 1) {
            field2740 = null;
        }
        field2740 = null;
        field2735 = null;
        field2738 = null;
    }
}
