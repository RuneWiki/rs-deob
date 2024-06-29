import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class326 extends class12 {

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "Ljava/lang/String;")
    public static String field4580 = "glow1:";

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "Ljava/lang/String;")
    public static String field4582 = "Choose Option";

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "[I")
    public static int[] field4583 = new int[14];

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "I")
    public int field4579;

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "I")
    public int field4581;

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "I")
    public static int field4584;

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!gh", name = "s", descriptor = "I")
    public int field4587;

    @OriginalMember(owner = "client!gh", name = "t", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!gh", name = "u", descriptor = "I")
    public int field4589;

    @OriginalMember(owner = "client!gh", name = "v", descriptor = "I")
    public static int field4590;

    @OriginalMember(owner = "client!gh", name = "w", descriptor = "I")
    public int field4591;

    @OriginalMember(owner = "client!gh", name = "r", descriptor = "Ljava/lang/String;")
    public String field4586;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(I)V")
    public static void method2006(int arg0) {
        if (arg0 != 8308) {
            method2009(21, (byte) 127);
        }
        field4580 = null;
        field4583 = null;
        field4582 = null;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lnj;Z)V")
    public static final void method2007(class133 arg0, boolean arg1) {
        field4588++;
        if (arg1) {
            field4582 = null;
        }
        class81 var2 = (class81) class201.field2777.method1204((byte) -97, (long) arg0.field6279);
        if (var2 == null) {
            class349.method2224(arg0.field6351[0], arg0.field6350[0], arg0, (class327) null, 0, 128, class410.field5931, (class358) null);
        } else {
            var2.method451(11);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IBIII)V")
    public static final void method2008(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field4584++;
        if (arg1 > -66) {
            field4583 = null;
        }
        if (arg4 < arg3) {
            class105.method564(arg2, arg4, 0, class318.field4522[arg0], arg3);
        } else {
            class105.method564(arg2, arg3, 0, class318.field4522[arg0], arg4);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IB)V")
    public static final void method2009(int arg0, byte arg1) {
        if (!class8.field97) {
            arg0 = -1;
        }
        field4590++;
        if (class330.field4717 == arg0) {
            return;
        }
        if (arg0 != -1) {
            class123 var2 = class23.method150(arg0, true);
            class145 var3 = var2.method697(true);
            if (var3 == null) {
                arg0 = -1;
            } else {
                class323.field4554.method2394(-105, var3.method863(), class348.field5096, new Point(var2.field1635, var2.field1636), var3.method853(), var3.method861());
                class330.field4717 = arg0;
            }
        }
        if (arg0 == -1 && class330.field4717 != -1) {
            class323.field4554.method2394(-121, -1, class348.field5096, new Point(), -1, (int[]) null);
            class330.field4717 = -1;
        }
        if (arg1 > -10) {
            field4580 = null;
        }
    }
}
