import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class136 implements class243 {

    @OriginalMember(owner = "client!vr", name = "p", descriptor = "I")
    public int field1554;

    @OriginalMember(owner = "client!vr", name = "k", descriptor = "Lcu;")
    public class219 field1549;

    @OriginalMember(owner = "client!vr", name = "g", descriptor = "I")
    public int field1545;

    @OriginalMember(owner = "client!vr", name = "o", descriptor = "I")
    public int field1553;

    @OriginalMember(owner = "client!vr", name = "n", descriptor = "I")
    public int field1552;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "Z")
    public boolean field1539;

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "Lkda;")
    public class388 field1540;

    @OriginalMember(owner = "client!vr", name = "m", descriptor = "I")
    public int field1551;

    @OriginalMember(owner = "client!vr", name = "j", descriptor = "I")
    public int field1548;

    @OriginalMember(owner = "client!vr", name = "f", descriptor = "I")
    public int field1544;

    @OriginalMember(owner = "client!vr", name = "e", descriptor = "I")
    public int field1543;

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "[I")
    public static int[] field1542 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!vr", name = "l", descriptor = "Z")
    public static boolean field1550 = false;

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!vr", name = "h", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!vr", name = "i", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(III)V", line = 18)
    public static final void method871(int arg0, int arg1, int arg2) {
        if (arg2 <= -100) {
            field1541++;
            class47 var3 = class258.method1546(12, arg0, (byte) 121);
            var3.method271((byte) 124);
            var3.field507 = arg1;
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)Lhs;", line = 38)
    public final class325 method777(int arg0) {
        field1547++;
        if (arg0 >= -8) {
            this.field1549 = null;
        }
        return class709.field9994;
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(I)V", line = 56)
    public static void method872(int arg0) {
        field1542 = null;
        if (arg0 != 13154) {
            field1550 = false;
        }
    }

    @OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(ILkda;Lcu;IIIIIIIZ)V", line = 68)
    public class136(int arg0, class388 arg1, class219 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        this.field1554 = arg5;
        this.field1549 = arg2;
        this.field1545 = arg9;
        this.field1553 = arg0;
        this.field1552 = arg6;
        this.field1539 = arg10;
        this.field1540 = arg1;
        this.field1551 = arg8;
        this.field1548 = arg4;
        this.field1544 = arg7;
        this.field1543 = arg3;
    }
}
