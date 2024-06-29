import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public class class573 {

    @OriginalMember(owner = "client!oca", name = "f", descriptor = "F")
    public static float field7462;

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "I")
    public static int field7457;

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "I")
    public static int field7458;

    @OriginalMember(owner = "client!oca", name = "c", descriptor = "I")
    public static int field7459;

    @OriginalMember(owner = "client!oca", name = "d", descriptor = "I")
    public static int field7460;

    @OriginalMember(owner = "client!oca", name = "e", descriptor = "I")
    public static int field7461;

    @OriginalMember(owner = "client!oca", name = "g", descriptor = "I")
    public static int field7463;

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(B)V", line = 4)
    public static final void method3055(byte arg0) {
        class311.field4034.method3656((byte) 0);
        field7460++;
        if (arg0 != 59) {
            field7462 = -0.32970127F;
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(Lpe;I[ILpe;)V", line = 15)
    public static final void method3056(class615 arg0, int arg1, int[] arg2, class615 arg3) {
        class284.field3695 = arg3;
        class169.field2101 = arg0;
        if (arg2 != null) {
            class220.field2886 = arg2;
        }
        field7459++;
        int var4 = 11 % ((70 - arg1) / 42);
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(III)Ldda;", line = 37)
    public static final class367 method3057(int arg0, int arg1, int arg2) {
        field7457++;
        class367 var3 = (class367) class491.field6509.method39((long) arg1 | (long) arg0 << 32, 31750);
        if (var3 == null) {
            var3 = new class367(arg0, arg1);
            class491.field6509.method38(var3, arg2 + 60, var3.field5499);
        }
        return arg2 == 2 ? var3 : null;
    }

    @OriginalMember(owner = "client!oca", name = "toString", descriptor = "()Ljava/lang/String;", line = 57)
    public final String toString() {
        field7463++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(I)I", line = 67)
    public static final int method3058(int arg0) {
        field7461++;
        if (arg0 != 10294) {
            field7462 = 2.584762F;
        }
        return class698.field9646;
    }

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "(III)I", line = 79)
    public final int method3059(int arg0, int arg1, int arg2) {
        field7458++;
        int var4 = class461.field6047 > arg1 ? class461.field6047 : arg1;
        if (class581.field7910 == this) {
            return 0;
        } else if (class233.field3110 == this) {
            return var4 - arg0;
        } else {
            if (arg2 > -99) {
                field7462 = 1.3829881F;
            }
            return class106.field1386 == this ? (var4 - arg0) / 2 : 0;
        }
    }
}
