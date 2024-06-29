import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wea")
public class class259 {

    @OriginalMember(owner = "client!wea", name = "f", descriptor = "I")
    public int field3172;

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!wea", name = "b", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!wea", name = "c", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!wea", name = "d", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!wea", name = "e", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(IIIB)V")
    public static final void method1509(int arg0, int arg1, int arg2, byte arg3) {
        field3170++;
        class592 var4 = class61.method371(11, arg1, (byte) 120);
        int var5 = -26 % ((-arg3 - 18) / 44);
        var4.method3256((byte) 11);
        var4.field8312 = arg2;
        var4.field8314 = arg0;
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(Lfa;Ljava/awt/Canvas;B)Lr;")
    public static final class566 method1510(class526 arg0, Canvas arg1, byte arg2) {
        if (arg2 == -25) {
            field3171++;
            return new class578(arg1, arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method1511(String arg0, int arg1) {
        field3167++;
        if (arg0 == null) {
            return false;
        } else if (arg1 >= -70) {
            return true;
        } else {
            for (int var2 = 0; var2 < class66.field904; var2++) {
                if (arg0.equalsIgnoreCase(class50.field708[var2])) {
                    return true;
                }
            }
            return arg0.equalsIgnoreCase(class376.field4748.field7017);
        }
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(Lqi;Z)I")
    public static final int method1512(class514 arg0, boolean arg1) {
        field3168++;
        int var2 = arg0.field6988;
        class601 var3 = arg0.method3872(32195);
        if (arg1) {
            method1509(85, -13, 52, (byte) -42);
        }
        if (arg0.field9660) {
            var2 = arg0.field6974;
        } else if (arg0.field9744 == var3.field8426 || arg0.field9744 == var3.field8425 || arg0.field9744 == var3.field8468 || arg0.field9744 == var3.field8457) {
            var2 = arg0.field6992;
        } else if (arg0.field9744 == var3.field8428 || arg0.field9744 == var3.field8423 || arg0.field9744 == var3.field8439 || arg0.field9744 == var3.field8431) {
            var2 = arg0.field7007;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wea", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3169++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wea", name = "<init>", descriptor = "(II)V")
    public class259(int arg0, int arg1) {
        this.field3172 = arg1;
    }
}
