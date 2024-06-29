import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public class class692 {

    @OriginalMember(owner = "client!rda", name = "d", descriptor = "I")
    public int field9712;

    @OriginalMember(owner = "client!rda", name = "f", descriptor = "I")
    public static int field9714 = -1;

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "I")
    public static int field9709;

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "I")
    public static int field9710;

    @OriginalMember(owner = "client!rda", name = "c", descriptor = "I")
    public static int field9711;

    @OriginalMember(owner = "client!rda", name = "e", descriptor = "I")
    public static int field9713;

    @OriginalMember(owner = "client!rda", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9710++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(IIILha;IIII)V")
    public static final void method3834(int arg0, int arg1, int arg2, class65 arg3, int arg4, int arg5, int arg6, int arg7) {
        class86.field1200 = arg3;
        field9711++;
        class298.field4325 = class86.field1200.method472();
        class198.field2650 = class86.field1200.method472();
        if (arg4 <= 15) {
            method3834(23, -37, 18, null, -51, -32, -98, -64);
        }
        class468.field6495 = class86.field1200.method472();
        class669.field9399 = 1;
        class781.field10707 = 0;
        class405.field5877 = 0;
        class639.field8876 = arg1;
        class645.field8956 = arg7;
        class462.field6403 = arg5;
        class269.field3968 = null;
        class265.field3925 = arg2;
        class403.method2515(arg0, (byte) 115, arg6);
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(III)Z")
    public static final boolean method3835(int arg0, int arg1, int arg2) {
        field9713++;
        if (arg1 < 32) {
            return true;
        } else {
            boolean var3 = (arg0 & 0x37) == 0 ? class647.method3617(arg2, arg0, (byte) -49) : class633.method3550(arg0, (byte) -113, arg2);
            return (arg2 & 0x10000) != 0 | class27.method204((byte) -110, arg2, arg0) | var3;
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Z)I")
    public final int method3836(boolean arg0) {
        field9709++;
        if (arg0) {
            this.toString();
        }
        return this.field9712;
    }

    @OriginalMember(owner = "client!rda", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class692(String arg0, int arg1) {
        this.field9712 = arg1;
    }
}
