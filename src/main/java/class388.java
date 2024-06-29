import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class388 {

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "Lbd;")
    private class37 field5856;

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "[I")
    public static int[] field5849 = new int[25];

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "Ljava/lang/String;")
    public static String field5854 = "Loading sprites - ";

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
    public static int field5848;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "I")
    public static int field5851;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "I")
    public static int field5852;

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
    public static int field5853;

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "I")
    public static int field5855;

    @OriginalMember(owner = "client!pl", name = "k", descriptor = "I")
    public static int field5858;

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "Ltf;")
    private class161 field5857;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "[Lgl;")
    public static class356[] field5850;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIIB)V", line = 9)
    public static final void method2454(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field5848++;
        class211 var5 = class281.method1921(10, arg3, (byte) -107);
        var5.method1490((byte) 117);
        var5.field3376 = arg2;
        var5.field3383 = arg0;
        var5.field3379 = arg1;
        if (arg4 <= 43) {
            method2456(false);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lbd;I)V", line = 26)
    public final void method2455(class37 arg0, int arg1) {
        this.field5856 = arg0;
        if (arg1 != 1) {
            method2456(false);
        }
        field5851++;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Z)V", line = 37)
    public static void method2456(boolean arg0) {
        field5854 = null;
        field5849 = null;
        field5850 = null;
        if (arg0) {
            field5854 = null;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIB)V", line = 52)
    public static final void method2457(int arg0, int arg1, byte arg2) {
        if (arg2 != 56) {
            field5858 = 114;
        }
        field5855++;
        int var3 = class261.field4201.field1906[0];
        int var4 = class261.field4201.field1916[0];
        if (class61.field787 == 1) {
            if (!class231.method1643(-2, 1, arg0, 0, false, 0, var4, -1, var3, 1, arg1)) {
                class231.method1643(-3, 1, arg0, 0, false, 0, var4, -1, var3, 1, arg1);
            }
        } else if (!class231.method1643(-3, 1, arg0, 0, false, 0, var4, -1, var3, 1, arg1)) {
            class231.method1643(-2, 1, arg0, 0, false, 0, var4, -1, var3, 1, arg1);
        }
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(Z)Ltf;", line = 85)
    public final class161 method2458(boolean arg0) {
        field5853++;
        class161 var2 = this.field5856.field459.field2537;
        if (this.field5856.field459 == var2) {
            this.field5857 = null;
            return null;
        } else {
            this.field5857 = var2.field2537;
            return arg0 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)Ltf;", line = 116)
    public final class161 method2459(int arg0) {
        field5852++;
        class161 var2 = this.field5857;
        if (arg0 <= 81) {
            field5849 = null;
        }
        if (this.field5856.field459 == var2) {
            this.field5857 = null;
            return null;
        } else {
            this.field5857 = var2.field2537;
            return var2;
        }
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "()V", line = 137)
    public class388() {
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lbd;)V", line = 139)
    public class388(class37 arg0) {
        this.field5856 = arg0;
    }
}
