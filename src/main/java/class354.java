import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class354 extends class45 {

    @OriginalMember(owner = "client!ej", name = "s", descriptor = "[I")
    public int[] field5617 = new int[] { -1 };

    @OriginalMember(owner = "client!ej", name = "x", descriptor = "[I")
    public int[] field5622 = new int[] { 0 };

    @OriginalMember(owner = "client!ej", name = "r", descriptor = "[I")
    public static int[] field5616 = new int[99];

    @OriginalMember(owner = "client!ej", name = "y", descriptor = "I")
    public static int field5623;

    @OriginalMember(owner = "client!ej", name = "B", descriptor = "I")
    public static int field5626;

    @OriginalMember(owner = "client!ej", name = "C", descriptor = "I")
    public static int field5627;

    @OriginalMember(owner = "client!ej", name = "D", descriptor = "Lci;")
    public static class327 field5628;

    @OriginalMember(owner = "client!ej", name = "o", descriptor = "I")
    public static int field5613;

    @OriginalMember(owner = "client!ej", name = "p", descriptor = "I")
    public static int field5614;

    @OriginalMember(owner = "client!ej", name = "q", descriptor = "I")
    public static int field5615;

    @OriginalMember(owner = "client!ej", name = "t", descriptor = "I")
    public static int field5618;

    @OriginalMember(owner = "client!ej", name = "u", descriptor = "I")
    public static int field5619;

    @OriginalMember(owner = "client!ej", name = "v", descriptor = "I")
    public static int field5620;

    @OriginalMember(owner = "client!ej", name = "w", descriptor = "I")
    public static int field5621;

    @OriginalMember(owner = "client!ej", name = "z", descriptor = "I")
    public static int field5624;

    @OriginalMember(owner = "client!ej", name = "A", descriptor = "I")
    public static int field5625;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)V", line = 5)
    public static final void method2503(int arg0) {
        int var1 = -5 / ((arg0 + 2) / 59);
        class87.field1490.method2326(-4);
        field5613++;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lth;I)V", line = 16)
    public static final void method2504(class57 arg0, int arg1) {
        if (arg1 >= -27) {
            field5616 = (int[]) null;
        }
        field5618++;
        class44.field691 = arg0;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIII)V", line = 29)
    public static final void method2505(int arg0, int arg1, int arg2, int arg3) {
        field5621++;
        if (arg0 != 19929) {
            field5626 = 2;
        }
        class321 var4 = class46.method370(11, (byte) -106, arg2);
        var4.method2265(false);
        var4.field5112 = arg3;
        var4.field5109 = arg1;
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "(I)V", line = 49)
    public static void method2506(int arg0) {
        if (arg0 > -32) {
            method2505(-83, 106, -30, -58);
        }
        field5616 = null;
        field5628 = null;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIBZ)V", line = 61)
    public static final void method2507(int arg0, int arg1, int arg2, byte arg3, boolean arg4) {
        if (arg3 != -22) {
            method2506(-54);
        }
        field5614++;
        if (class278.method2058(arg0, (byte) 4)) {
            class182.method1425(arg4, -1, arg1, 0, arg2, class163.field2587[arg0]);
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field5616[var1] = var0 / 4;
        }
        field5623 = 0;
        field5626 = -1;
        field5627 = 0;
        field5628 = new class327();
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IZ)V", line = 100)
    public static final void method2508(int arg0, boolean arg1) {
        field5620++;
        if (arg0 != 28844) {
            method2506(-10);
        }
        if (class92.field1558 != arg1) {
            class92.field1558 = arg1;
            class176.method1384((byte) -76);
        }
    }
}
