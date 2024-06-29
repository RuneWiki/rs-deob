import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class454 {

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "Lfca;")
    private class661 field5918;

    @OriginalMember(owner = "client!bs", name = "f", descriptor = "[Z")
    public static boolean[] field5919 = new boolean[100];

    @OriginalMember(owner = "client!bs", name = "h", descriptor = "Z")
    public static boolean field5921 = true;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "I")
    public static int field5914;

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "I")
    public static int field5915;

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "I")
    public static int field5916;

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "I")
    public static int field5917;

    @OriginalMember(owner = "client!bs", name = "g", descriptor = "I")
    public static int field5920;

    @OriginalMember(owner = "client!bs", name = "i", descriptor = "Lko;")
    private class337 field5922;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)Lko;", line = 3)
    public final class337 method2580(int arg0) {
        field5916++;
        class337 var2 = this.field5922;
        if (this.field5918.field8613 == var2) {
            this.field5922 = null;
            return null;
        }
        this.field5922 = var2.field4111;
        if (arg0 >= -11) {
            this.method2583((byte) -124);
        }
        return var2;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(B)V", line = 29)
    public static void method2581(byte arg0) {
        field5919 = null;
        int var1 = -64 / ((39 - arg0) / 47);
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(ILfca;)V", line = 51)
    public final void method2582(int arg0, class661 arg1) {
        this.field5918 = arg1;
        field5915++;
        if (arg0 != -30364) {
            method2581((byte) 8);
        }
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "()V", line = 64)
    public class454() {
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(B)Lko;", line = 67)
    public final class337 method2583(byte arg0) {
        field5917++;
        if (arg0 != -30) {
            this.method2583((byte) -122);
        }
        class337 var2 = this.field5918.field8613.field4111;
        if (this.field5918.field8613 == var2) {
            this.field5922 = null;
            return null;
        } else {
            this.field5922 = var2.field4111;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(Lfca;)V", line = 90)
    public class454(class661 arg0) {
        this.field5918 = arg0;
    }
}
