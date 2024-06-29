import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class184 {

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "Lh;")
    public static class572 field2761 = new class572("Examine", "Untersuchen", "Examiner", "Examinar");

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "Lada;")
    public static class144 field2769 = new class144(22, -1);

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "[B")
    public byte[] field2762;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "[S")
    public short[] field2764;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "[S")
    public short[] field2767;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "[S")
    public short[] field2768;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lkda;Lkda;I)I")
    public static final int method1279(class328 arg0, class328 arg1, int arg2) {
        if (arg2 != 1) {
            field2761 = null;
        }
        field2765++;
        int var3 = 0;
        if (arg1.method1981(true, class210.field3105)) {
            var3++;
        }
        if (arg1.method1981(true, class38.field464)) {
            var3++;
        }
        if (arg1.method1981(true, class279.field3913)) {
            var3++;
        }
        if (arg0.method1981(true, class210.field3105)) {
            var3++;
        }
        if (arg0.method1981(true, class38.field464)) {
            var3++;
        }
        if (arg0.method1981(true, class279.field3913)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BI)V")
    public static final void method1280(byte arg0, int arg1) {
        int var2 = 94 % ((arg0 - 55) / 32);
        class396.field5453.method834(arg1, 0);
        field2763++;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
    public static void method1281(int arg0) {
        field2761 = null;
        field2769 = null;
        if (arg0 <= 30) {
            field2769 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lica;[IB[I[I)V")
    public static final void method1282(class571 arg0, int[] arg1, byte arg2, int[] arg3, int[] arg4) {
        int var5 = -58 % ((-arg2 - 17) / 49);
        field2760++;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6];
            int var8 = arg1[var6];
            int var9 = arg4[var6];
            for (int var10 = 0; var8 != 0 && arg0.field1917.length > var10; var10++) {
                if ((var8 & 0x1) != 0) {
                    if (var7 == -1) {
                        arg0.field1917[var10] = null;
                    } else {
                        class78 var11 = class463.field6521.method2983(var7, -108);
                        int var12 = var11.field1056;
                        class46 var13 = arg0.field1917[var10];
                        if (var13 != null) {
                            if (var13.field554 == var7) {
                                if (var12 == 0) {
                                    var13 = arg0.field1917[var10] = null;
                                } else if (var12 == 1) {
                                    var13.field558 = 0;
                                    var13.field552 = 0;
                                    var13.field551 = 0;
                                    var13.field550 = var9;
                                    var13.field547 = 1;
                                    class163.method1179(-1721201176, arg0.field8496, var11, false, arg0.field8501, arg0.field8500, 0);
                                } else if (var12 == 2) {
                                    var13.field552 = 0;
                                }
                            } else if (var11.field1042 >= class463.field6521.method2983(var13.field554, -103).field1042) {
                                var13 = arg0.field1917[var10] = null;
                            }
                        }
                        if (var13 == null) {
                            class46 var14 = arg0.field1917[var10] = new class46();
                            var14.field552 = 0;
                            var14.field554 = var7;
                            var14.field558 = 0;
                            var14.field547 = 1;
                            var14.field551 = 0;
                            var14.field550 = var9;
                            class163.method1179(-1721201176, arg0.field8496, var11, false, arg0.field8501, arg0.field8500, 0);
                        }
                    }
                }
                var8 >>>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)Z")
    public static final boolean method1283(int arg0, int arg1) {
        if (arg0 != 3) {
            field2769 = null;
        }
        field2766++;
        return arg1 == 3 || arg1 == 4;
    }
}
