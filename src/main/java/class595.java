import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class595 {

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public static int field8569;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public static int field8570;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public static int field8571;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public static int field8572;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
    public static final void method3525(Canvas arg0, byte arg1) {
        if (arg1 != 2) {
            field8572 = 51;
        }
        field8569++;
        Dimension var2 = arg0.getSize();
        class259.method1613((byte) -21, var2.width, var2.height);
        if (class589.field8461 == 1) {
            class410.field5731.method2224(arg0, class577.field8260, class647.field9167);
        } else {
            class410.field5731.method2224(arg0, class45.field658, class54.field756);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)Z")
    public static final boolean method3526(int arg0) {
        field8570++;
        class503 var1 = (class503) class136.field1828.method3118((byte) 73);
        if (var1 == null) {
            return false;
        }
        if (arg0 != 768) {
            field8572 = -81;
        }
        for (int var2 = 0; var2 < var1.field7026; var2++) {
            if (var1.field7032[var2] != null && var1.field7032[var2].field5975 == 0) {
                return false;
            }
            if (var1.field7024[var2] != null && var1.field7024[var2].field5975 == 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIBIIILha;)Lka;")
    public static final class283 method3527(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, class545 arg6) {
        field8571++;
        long var7 = (long) arg1;
        class283 var9 = (class283) class308.field3976.method3200(var7, -19983);
        short var10 = 2055;
        if (arg2 != -119) {
            field8572 = -5;
        }
        if (var9 == null) {
            class64 var11 = class86.method524(class547.field7709, arg1, -66, 0);
            if (var11 == null) {
                return null;
            }
            if (var11.field873 < 13) {
                var11.method412(96, 2);
            }
            var9 = arg6.method2222(var11, var10, class687.field9633, 64, 768);
            class308.field3976.method3199((byte) 78, var9, var7);
        }
        class283 var12 = var9.method1147((byte) 2, var10, true);
        if (arg5 != 0) {
            var12.method1133(arg5);
        }
        if (arg3 != 0) {
            var12.method1165(arg3);
        }
        if (arg0 != 0) {
            var12.method1167(arg0);
        }
        if (arg4 != 0) {
            var12.method1117(0, arg4, 0);
        }
        return var12;
    }
}
