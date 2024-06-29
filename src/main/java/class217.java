import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class217 extends class499 {

    @OriginalMember(owner = "client!lf", name = "v", descriptor = "I")
    public int field3565;

    @OriginalMember(owner = "client!lf", name = "s", descriptor = "I")
    public int field3562;

    @OriginalMember(owner = "client!lf", name = "x", descriptor = "Z")
    public static boolean field3567 = false;

    @OriginalMember(owner = "client!lf", name = "w", descriptor = "Ltw;")
    public static class187 field3566 = new class187();

    @OriginalMember(owner = "client!lf", name = "t", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!lf", name = "u", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)Leu;")
    public final class444 method1247(int arg0) {
        if (arg0 != 3848) {
            method1623(33);
        }
        field3564++;
        return class89.field1075;
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Lja;Lmea;IIIIIIIII)V")
    public class217(class254 arg0, class395 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field3565 = arg9;
        this.field3562 = arg10;
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)V")
    public static void method1623(int arg0) {
        if (arg0 != -1) {
            field3566 = null;
        }
        field3566 = null;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)V")
    public static final void method1624(int arg0, int arg1) {
        if (arg0 >= -11) {
            field3566 = null;
        }
        if (!class17.field282.field4851) {
            arg1 = -1;
        }
        field3563++;
        if (class70.field890 == arg1) {
            return;
        }
        if (arg1 != -1) {
            class131 var2 = class489.field7154.method1806(arg1, (byte) 81);
            class284 var3 = var2.method1139(false);
            if (var3 == null) {
                arg1 = -1;
            } else {
                class402.field6207.method3177(0, new Point(var2.field2141, var2.field2152), var3.method2030(), var3.method2024(), var3.method2025(), class271.field4377);
                class70.field890 = arg1;
            }
        }
        if (arg1 == -1 && class70.field890 != -1) {
            class402.field6207.method3177(0, new Point(), null, -1, -1, class271.field4377);
            class70.field890 = -1;
        }
    }
}
