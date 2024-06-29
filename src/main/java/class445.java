import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class445 extends class281 {

    @OriginalMember(owner = "client!ep", name = "B", descriptor = "I")
    public int field6242 = 0;

    @OriginalMember(owner = "client!ep", name = "x", descriptor = "I")
    public static int field6238;

    @OriginalMember(owner = "client!ep", name = "y", descriptor = "I")
    public static int field6239;

    @OriginalMember(owner = "client!ep", name = "z", descriptor = "I")
    public static int field6240;

    @OriginalMember(owner = "client!ep", name = "A", descriptor = "I")
    public static int field6241;

    @OriginalMember(owner = "client!ep", name = "C", descriptor = "I")
    public static int field6243;

    @OriginalMember(owner = "client!ep", name = "D", descriptor = "I")
    public static int field6244;

    @OriginalMember(owner = "client!ep", name = "E", descriptor = "Ldl;")
    public static class69 field6245;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILjp;)V", line = 3)
    public final void method2668(int arg0, class376 arg1) {
        while (true) {
            int var3 = arg1.method2398(-1372747256);
            if (var3 == 0) {
                if (arg0 != 0) {
                    this.method2673(null, 38, -19);
                }
                field6239++;
                return;
            }
            this.method2673(arg1, var3, 74);
        }
    }

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "(B)Lds;", line = 23)
    public static final class16 method2669(byte arg0) {
        field6238++;
        if (arg0 <= 113) {
            field6245 = null;
        }
        class16 var1 = (class16) class124.field1798.method697(0);
        if (var1 != null) {
            var1.method792((byte) -109);
            var1.method1811(28064);
            return var1;
        }
        class16 var2;
        do {
            var2 = (class16) class695.field9727.method697(0);
            if (var2 == null) {
                return null;
            }
            if (var2.method117(7) > class302.method1910(0)) {
                return null;
            }
            var2.method792((byte) -125);
            var2.method1811(28064);
        } while ((var2.field4141 & Long.MIN_VALUE) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIIIIIIB)V", line = 74)
    public static final void method2670(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field6244++;
        int var8 = arg4 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class10.field166 - class492.field6820) * var8 / 100 + class492.field6820;
        int var10 = arg6 * var9 >> 8;
        class330.field4773 = class330.field4772 * var9 >> 8;
        int var11 = 16384 - arg3 & 0x3FFF;
        int var12 = 16384 - arg1 & 0x3FFF;
        int var13 = 0;
        int var14 = 0;
        if (arg7 != 87) {
            method2669((byte) 57);
        }
        int var15 = var10;
        if (var11 != 0) {
            var14 = class749.field10324[var11] * -var10 >> 14;
            var15 = class749.field10316[var11] * var10 >> 14;
        }
        if (var12 != 0) {
            var13 = class749.field10324[var12] * var15 >> 14;
            var15 = class749.field10316[var12] * var15 >> 14;
        }
        class634.field8856 = arg5 - var13;
        class405.field5867 = arg2 - var14;
        class718.field10019 = arg1;
        class162.field2209 = 0;
        class253.field3733 = arg3;
        class350.field5138 = arg0 - var15;
    }

    @OriginalMember(owner = "client!ep", name = "e", descriptor = "(B)V", line = 128)
    public static void method2671(byte arg0) {
        if (arg0 != -112) {
            field6245 = null;
        }
        field6245 = null;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IILhj;III)V", line = 138)
    public static final void method2672(int arg0, int arg1, class596 arg2, int arg3, int arg4, int arg5) {
        field6243++;
        if (arg3 != 9288) {
            method2672(44, -127, null, -27, -55, 88);
        }
        class139 var6 = null;
        for (class139 var7 = (class139) class583.field7785.method2551((byte) -108); var7 != null; var7 = (class139) class583.field7785.method2542(arg3 ^ 0xFFFFDBD7)) {
            if (var7.field2018 == arg5 && var7.field2034 == arg1 && var7.field2033 == arg0 && var7.field2029 == arg4) {
                var6 = var7;
                break;
            }
        }
        if (var6 == null) {
            var6 = new class139();
            var6.field2033 = arg0;
            var6.field2029 = arg4;
            var6.field2018 = arg5;
            var6.field2034 = arg1;
            class583.field7785.method2545(-127, var6);
        }
        var6.field2020 = false;
        var6.field2023 = true;
        var6.field2025 = arg2;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Ljp;II)V", line = 183)
    private final void method2673(class376 arg0, int arg1, int arg2) {
        if (arg2 < 25) {
            this.field6242 = -73;
        }
        if (arg1 == 2) {
            this.field6242 = arg0.method2359(-1);
        }
        field6240++;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIIBIILha;)Lka;", line = 200)
    public static final class500 method2674(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, class65 arg6) {
        field6241++;
        long var7 = (long) arg4;
        class500 var9 = (class500) class754.field10432.method1541(-10, var7);
        short var10 = 2055;
        int var11 = 62 / ((arg3 + 3) / 53);
        if (var9 == null) {
            class782 var12 = class558.method3142(2085750768, class237.field3203, arg4, 0);
            if (var12 == null) {
                return null;
            }
            if (var12.field10787 < 13) {
                var12.method4317(17496, 2);
            }
            var9 = arg6.method510(var12, var10, class379.field5541, 64, 768);
            class754.field10432.method1544(true, var9, var7);
        }
        class500 var13 = var9.method298((byte) 2, var10, true);
        if (arg5 != 0) {
            var13.method329(arg5);
        }
        if (arg1 != 0) {
            var13.method331(arg1);
        }
        if (arg2 != 0) {
            var13.method336(arg2);
        }
        if (arg0 != 0) {
            var13.method313(0, arg0, 0);
        }
        return var13;
    }
}
