import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class147 {

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "Z")
    public boolean field2565 = true;

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "I")
    public int field2566;

    @OriginalMember(owner = "client!hi", name = "p", descriptor = "I")
    public int field2572;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
    public int field2562;

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "I")
    public int field2569;

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "I")
    public int field2570;

    @OriginalMember(owner = "client!hi", name = "o", descriptor = "I")
    public int field2571;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "Lda;")
    public static class275 field2558 = class255.method1672(96, "Stufe: ");

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "Lda;")
    private static class275 field2568 = class255.method1672(107, "Walk here");

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "Ltk;")
    public static class27 field2557 = null;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
    public static int field2563 = 7759444;

    @OriginalMember(owner = "client!hi", name = "s", descriptor = "Lda;")
    public static class275 field2575 = field2568;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!hi", name = "q", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!hi", name = "r", descriptor = "Lma;")
    public static class105 field2574;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIIBLdj;)V")
    public static final void method1043(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, class104 arg6) {
        field2560++;
        int var7 = -8 % ((arg5 - 21) / 35);
        class109.method813(arg4, (byte) -57, arg6.field1770, arg0, arg6.field1758, arg3, arg2, arg1);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IBI)Lhg;")
    public static final class184 method1044(int arg0, byte arg1, int arg2) {
        if (arg1 < 29) {
            method1046((class105) null, -39, (class105) null);
        }
        field2564++;
        class184 var3 = (class184) class201.field3447.method1871(0, (long) arg0 << 32 | (long) arg2);
        if (var3 == null) {
            var3 = new class184(arg0, arg2);
            class201.field3447.method1867(true, var3.field1707, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V")
    public static void method1045(int arg0) {
        field2557 = null;
        field2558 = null;
        if (arg0 != 3) {
            method1044(-14, (byte) -105, 94);
        }
        field2574 = null;
        field2568 = null;
        field2575 = null;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lma;ILma;)V")
    public static final void method1046(class105 arg0, int arg1, class105 arg2) {
        field2561++;
        class157.field2766 = arg2;
        if (arg1 <= 126) {
            field2557 = null;
        }
        class118.field2101 = arg0;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IB)V")
    public static final void method1047(int arg0, byte arg1) {
        int var2 = 33 % ((arg1 + 16) / 49);
        field2559++;
        class184 var3 = method1044(3, (byte) 41, arg0);
        var3.method1230(1000);
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class147(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field2566 = arg3;
        this.field2565 = arg6;
        this.field2572 = arg5;
        this.field2562 = arg2;
        this.field2569 = arg1;
        this.field2570 = arg4;
        this.field2571 = arg0;
    }
}
