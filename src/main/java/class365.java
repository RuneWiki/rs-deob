import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class365 extends class168 implements class704 {

    @OriginalMember(owner = "client!rr", name = "w", descriptor = "[I")
    public static int[] field4705 = new int[13];

    @OriginalMember(owner = "client!rr", name = "o", descriptor = "Lhg;")
    public static class693 field4697 = new class693(47, 2);

    @OriginalMember(owner = "client!rr", name = "y", descriptor = "Lhg;")
    public static class693 field4707 = new class693(58, -1);

    @OriginalMember(owner = "client!rr", name = "z", descriptor = "I")
    public static int field4708 = -1;

    @OriginalMember(owner = "client!rr", name = "B", descriptor = "I")
    public static int field4710 = 0;

    @OriginalMember(owner = "client!rr", name = "A", descriptor = "Lhg;")
    public static class693 field4709 = new class693(83, -1);

    @OriginalMember(owner = "client!rr", name = "s", descriptor = "C")
    public char field4701;

    @OriginalMember(owner = "client!rr", name = "j", descriptor = "I")
    public static int field4692;

    @OriginalMember(owner = "client!rr", name = "k", descriptor = "I")
    public static int field4693;

    @OriginalMember(owner = "client!rr", name = "l", descriptor = "I")
    public static int field4694;

    @OriginalMember(owner = "client!rr", name = "m", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!rr", name = "n", descriptor = "I")
    public int field4696;

    @OriginalMember(owner = "client!rr", name = "p", descriptor = "I")
    public int field4698;

    @OriginalMember(owner = "client!rr", name = "q", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!rr", name = "r", descriptor = "I")
    public static int field4700;

    @OriginalMember(owner = "client!rr", name = "u", descriptor = "I")
    public static int field4703;

    @OriginalMember(owner = "client!rr", name = "v", descriptor = "I")
    public static int field4704;

    @OriginalMember(owner = "client!rr", name = "x", descriptor = "I")
    public int field4706;

    @OriginalMember(owner = "client!rr", name = "t", descriptor = "J")
    public long field4702;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lha;I)V", line = 4)
    public static final void method2104(class60 arg0, int arg1) {
        class517.field7241 = new class270[class628.field8647.length];
        field4699++;
        if (arg1 != 13) {
            method2112(29, 72, -25, -27, (byte) -45, -63, 52);
        }
        for (int var2 = 0; var2 < class628.field8647.length; var2++) {
            int var3 = class628.field8647[var2];
            class274 var4 = class335.method1930(var3, (byte) -72, class596.field8307);
            class61 var5 = arg0.method500(var4, class728.method4058(class640.field8890, var3), true);
            class517.field7241[var2] = new class270(var5, var4);
        }
    }

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "(I)I", line = 35)
    public final int method2105(int arg0) {
        if (arg0 == 23046) {
            field4693++;
            return this.field4698;
        } else {
            return 28;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)C", line = 46)
    public final char method2106(int arg0) {
        field4703++;
        if (arg0 != -3733) {
            field4710 = 11;
        }
        return this.field4701;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)I", line = 59)
    public final int method2107(byte arg0) {
        field4695++;
        int var2 = -33 % ((arg0 - 34) / 54);
        return this.field4696;
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(B)I", line = 69)
    public final int method2108(byte arg0) {
        field4692++;
        if (arg0 <= 49) {
            this.method2110(-84);
        }
        return this.field4706;
    }

    @OriginalMember(owner = "client!rr", name = "e", descriptor = "(I)V", line = 81)
    public static void method2109(int arg0) {
        if (arg0 != 2) {
            method2111(71, (byte) -59, -107);
        }
        field4707 = null;
        field4697 = null;
        field4709 = null;
        field4705 = null;
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)J", line = 97)
    public final long method2110(int arg0) {
        if (arg0 < 16) {
            return 22L;
        } else {
            field4700++;
            return this.field4702;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IBI)Z", line = 108)
    public static final boolean method2111(int arg0, byte arg1, int arg2) {
        if (arg1 > -49) {
            field4705 = null;
        }
        field4704++;
        return class14.method103(arg0, false, arg2) & ((arg2 & 0x2000) != 0 | class745.method4142(arg0, arg2, (byte) 101) | class751.method4180(arg0, -76, arg2));
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIIIBII)V", line = 120)
    public static final void method2112(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field4694++;
        int var7 = 114 % ((40 - arg4) / 33);
        if ((arg5 - arg0) >= class667.field9373 && (arg0 + arg5) <= class225.field2994 && arg1 - arg0 >= class546.field7619 && arg0 + arg1 <= class760.field10606) {
            class453.method2543((byte) 108, arg2, arg5, arg6, arg3, arg1, arg0);
        } else {
            class101.method811(arg0, arg2, arg3, arg1, arg6, arg5, 3317);
        }
    }
}
