import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class300 extends class361 {

    @OriginalMember(owner = "client!li", name = "B", descriptor = "Ltr;")
    public class196 field4389;

    @OriginalMember(owner = "client!li", name = "w", descriptor = "Ltn;")
    public static class60 field4385 = new class60(78, -1);

    @OriginalMember(owner = "client!li", name = "x", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!li", name = "y", descriptor = "I")
    public static int field4387;

    @OriginalMember(owner = "client!li", name = "z", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(BI)V", line = 3)
    public static final void method1834(byte arg0, int arg1) {
        if (arg0 > -68) {
            method1835(null, null, 113);
        }
        class145.field1917 = 1000 / arg1;
        field4388++;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Loi;Lza;I)V", line = 15)
    public static final void method1835(class53 arg0, class290 arg1, int arg2) {
        field4386++;
        if (class389.field5474) {
            return;
        }
        arg1.method347(0);
        class33.field381 = arg1.method312(class506.method3020(arg0, class10.field143), true);
        class33.field381.method151((class147.field1956 - class33.field381.method145()) / 2, (class273.field4048 - class33.field381.method157()) / 2);
        class273.field4047 = arg1.method312(class506.method3020(arg0, class380.field5369), true);
        class273.field4047.method151((class147.field1956 - class273.field4047.method145()) / arg2, 18);
        class389.field5474 = true;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lza;Lge;III)V", line = 32)
    public static final void method1836(class290 arg0, class510 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < class6.field109) {
            class239 var5 = class268.field3910[arg2][arg3 + 1][arg4];
            if (var5 != null && var5.field3493 != null && var5.field3493.method118((byte) 102)) {
                arg1.method128(-115, arg0, 0, var5.field3493, class169.field2463, true, 0);
            }
        }
        if (arg4 < class6.field109) {
            class239 var6 = class268.field3910[arg2][arg3][arg4 + 1];
            if (var6 != null && var6.field3493 != null && var6.field3493.method118((byte) 102)) {
                arg1.method128(-93, arg0, 0, var6.field3493, 0, true, class169.field2463);
            }
        }
        if (arg3 < class6.field109 && arg4 < class272.field4032) {
            class239 var7 = class268.field3910[arg2][arg3 + 1][arg4 + 1];
            if (var7 != null && var7.field3493 != null && var7.field3493.method118((byte) 102)) {
                arg1.method128(-105, arg0, 0, var7.field3493, class169.field2463, true, class169.field2463);
            }
        }
        if (arg3 < class6.field109 && arg4 > 0) {
            class239 var8 = class268.field3910[arg2][arg3 + 1][arg4 - 1];
            if (var8 != null && var8.field3493 != null && var8.field3493.method118((byte) 102)) {
                arg1.method128(-77, arg0, 0, var8.field3493, class169.field2463, true, -class169.field2463);
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Ltr;)V", line = 88)
    public class300(class196 arg0) {
        this.field4389 = arg0;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V", line = 96)
    public static void method1837(int arg0) {
        field4385 = null;
        if (arg0 != 0) {
            method1835(null, null, 53);
        }
    }
}
