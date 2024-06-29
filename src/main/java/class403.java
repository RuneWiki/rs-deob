import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class403 extends class42 {

    @OriginalMember(owner = "client!gi", name = "L", descriptor = "[I")
    public static int[] field5869 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!gi", name = "O", descriptor = "Z")
    public static boolean field5872 = false;

    @OriginalMember(owner = "client!gi", name = "P", descriptor = "[[I")
    public static int[][] field5873 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!gi", name = "M", descriptor = "Ljava/lang/String;")
    public static String field5870 = "K";

    @OriginalMember(owner = "client!gi", name = "J", descriptor = "I")
    public static int field5867;

    @OriginalMember(owner = "client!gi", name = "K", descriptor = "I")
    public static int field5868;

    @OriginalMember(owner = "client!gi", name = "N", descriptor = "I")
    public static int field5871;

    @OriginalMember(owner = "client!gi", name = "Q", descriptor = "I")
    public static int field5874;

    @OriginalMember(owner = "client!gi", name = "S", descriptor = "I")
    public static int field5876;

    @OriginalMember(owner = "client!gi", name = "R", descriptor = "Lrj;")
    public static class352 field5875;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZLqj;)V", line = 5)
    public static final void method2597(boolean arg0, class296 arg1) {
        field5871++;
        if (arg0) {
            class163.field2292 = arg1;
            class249.field3452 = class163.field2292.method1911(0, 4);
        }
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(II)V", line = 17)
    public static final void method2598(int arg0, int arg1) {
        class190 var2 = class154.field2168;
        synchronized (class154.field2168) {
            class154.field2168.method1254(arg0, 123);
        }
        field5876++;
        class190 var3 = class229.field3061;
        synchronized (class229.field3061) {
            class229.field3061.method1254(arg0, 122);
            if (arg1 != 0) {
                field5872 = false;
            }
        }
        class190 var4 = class68.field1058;
        synchronized (class68.field1058) {
            class68.field1058.method1254(arg0, 119);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIIIIII)V", line = 39)
    public static final void method2599(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field5867++;
        if (class77.method545(true, arg3)) {
            if (arg6 != 2) {
                method2598(-55, 12);
            }
            class213.method1372(arg2, arg8, arg4, -87, arg5, -1, arg1, arg0, class333.field4511[arg3], arg7);
        } else if (arg2 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class259.field3553[var9] = true;
            }
        } else {
            class259.field3553[arg2] = true;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Z)V", line = 72)
    public static void method2600(boolean arg0) {
        field5870 = null;
        field5873 = null;
        field5869 = null;
        if (!arg0) {
            field5875 = null;
        }
    }
}
