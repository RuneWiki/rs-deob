import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class96 extends class624 {

    @OriginalMember(owner = "client!bm", name = "A", descriptor = "Lhb;")
    public static class629 field1133 = new class629(13, 3);

    @OriginalMember(owner = "client!bm", name = "B", descriptor = "Lig;")
    public static class206 field1134 = new class206(95, 1);

    @OriginalMember(owner = "client!bm", name = "E", descriptor = "I")
    public static int field1137 = 0;

    @OriginalMember(owner = "client!bm", name = "F", descriptor = "[F")
    public static float[] field1138 = new float[4];

    @OriginalMember(owner = "client!bm", name = "D", descriptor = "Lig;")
    public static class206 field1136 = new class206(91, 4);

    @OriginalMember(owner = "client!bm", name = "w", descriptor = "B")
    public byte field1129;

    @OriginalMember(owner = "client!bm", name = "u", descriptor = "I")
    public int field1127;

    @OriginalMember(owner = "client!bm", name = "v", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!bm", name = "y", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!bm", name = "z", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!bm", name = "x", descriptor = "Lrt;")
    public class194 field1130;

    @OriginalMember(owner = "client!bm", name = "C", descriptor = "[Lxa;")
    public static class433[] field1135;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(B)I")
    public final int method600(byte arg0) {
        ++field1132;
        if (this.field1130 == null) {
            return 0;
        } else {
            if (arg0 != 54) {
                field1136 = null;
            }
            return this.field1130.field2610 * 100 / (this.field1130.field2622.length + -this.field1129);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Loa;IILq;III[[[B[I[I[I[I[IIBIIZ)V")
    public static final void method601(class605 arg0, int arg1, int arg2, class364 arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, byte arg14, int arg15, int arg16, boolean arg17) {
        class103.field1228 = arg0;
        class452.field6741 = arg1;
        class59.field678 = arg3;
        class59.field681 = class103.field1228.method324() > 0;
        class550.field7844 = arg4 >> class465.field6917;
        class650.field9385 = arg6 >> class465.field6917;
        class625.field9043 = arg4;
        class560.field7982 = arg6;
        class603.field8813 = arg5;
        class371.field5674 = class550.field7844 - class224.field3164;
        if (class371.field5674 < 0) {
            class479.field7046 = -class371.field5674;
            class371.field5674 = 0;
        } else {
            class479.field7046 = 0;
        }
        class82.field926 = class650.field9385 - class224.field3164;
        if (class82.field926 < 0) {
            class322.field4660 = -class82.field926;
            class82.field926 = 0;
        } else {
            class322.field4660 = 0;
        }
        class38.field420 = class550.field7844 + class224.field3164;
        if (class38.field420 > class588.field8441) {
            class38.field420 = class588.field8441;
        }
        class465.field6912 = class650.field9385 + class224.field3164;
        if (class465.field6912 > class91.field1047) {
            class465.field6912 = class91.field1047;
        }
        for (int var18 = 0; var18 < class224.field3164 + class224.field3164 + 2; ++var18) {
            for (int var23 = 0; var23 < class224.field3164 + class224.field3164 + 2; ++var23) {
                int var24 = class550.field7844 - class224.field3164 + var18;
                int var25 = class650.field9385 - class224.field3164 + var23;
                if (var24 >= 0 && var25 >= 0 && var24 < class588.field8441 && var25 < class91.field1047) {
                    int var26 = var24 << class465.field6917;
                    int var27 = var25 << class465.field6917;
                    int var28 = class544.field7780[class544.field7780.length - 1].method259(var24, var25) - (1000 << class465.field6917 - 7);
                    int var29 = class492.field7164 != null ? class492.field7164[0].method259(var24, var25) + class193.field2559 : class544.field7780[0].method259(var24, var25) + class193.field2559;
                    class270.field3789[var18][var23] = class103.field1228.method295(var26, var28, var27, var26, var29, var27);
                } else {
                    class270.field3789[var18][var23] = false;
                }
            }
        }
        for (int var19 = 0; var19 < class224.field3164 + class224.field3164 + 1; ++var19) {
            for (int var22 = 0; var22 < class224.field3164 + class224.field3164 + 1; ++var22) {
                class437.field6505[var19][var22] = class270.field3789[var19][var22] || class270.field3789[var19 + 1][var22] || class270.field3789[var19][var22 + 1] || class270.field3789[var19 + 1][var22 + 1];
            }
        }
        class595.field8695 = arg8;
        class595.field8692 = arg9;
        class368.field5561 = arg10;
        class426.field6343 = arg11;
        class299.field4415 = arg12;
        class98.method610();
        class172.method989(false, class103.field1228);
        for (class630 var20 = (class630) class24.field266.method3297((byte) 117); var20 != null; var20 = (class630) class24.field266.method3296((byte) -111)) {
            var20.method3488(false);
            class426.method2664(-201, var20);
        }
        if (class59.field681) {
            for (int var21 = 0; var21 < class351.field5007; ++var21) {
                class48.field512[var21].method276(arg17, (byte) -61, arg1);
            }
        }
        if (arg2 > 1) {
            class103.field1228.method296(0);
            if (class453.field6777 == null || class453.field6777 instanceof class119) {
                class453.field6777 = new class213();
            }
        } else if (class453.field6777 == null || class453.field6777 instanceof class213) {
            class453.field6777 = new class119();
        }
        class453.field6777.method738(arg2, true);
        class453.field6777.method734(false);
        if (class327.field4722 != null) {
            class199.method1266(true);
            class453.field6777.method741(5000, 22);
            class395.method2538(arg2, (byte[][][]) null, 0, (byte) 0, arg15, arg16);
            class453.field6777.method734(false);
            class453.field6777.method741(5000, 23);
            class199.method1266(false);
        }
        class395.method2538(arg2, arg7, arg13, arg14, arg15, arg16);
        class453.field6777.method734(false);
        class453.field6777.method739(false);
        class453.field6777.method734(false);
        if (arg2 > 1) {
            class103.field1228.method345(0);
        }
        class103.field1228.method340(0, (class321[]) null);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(III)V")
    public static final void method602(int arg0, int arg1, int arg2) {
        ++field1131;
        class212.field2909 = -class182.field2273 + arg0;
        int var3 = -114 % ((-25 - arg1) / 36);
        class59.field682 = arg2 - class182.field2267;
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(B)[B")
    public final byte[] method603(byte arg0) {
        ++field1128;
        if (!super.field9009 && this.field1130.field2610 >= this.field1130.field2622.length + -this.field1129) {
            return arg0 <= 101 ? null : this.field1130.field2622;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "(B)V")
    public static void method604(byte arg0) {
        field1136 = null;
        field1134 = null;
        field1135 = null;
        field1138 = null;
        if (arg0 > -77) {
            field1133 = null;
        }
        field1133 = null;
    }
}
