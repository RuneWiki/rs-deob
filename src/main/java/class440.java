import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public abstract class class440 extends class410 {

    @OriginalMember(owner = "client!maa", name = "I", descriptor = "Lem;")
    public static class610 field6178 = new class610(4);

    @OriginalMember(owner = "client!maa", name = "J", descriptor = "Lfq;")
    public static class141 field6179 = new class141(12, 0, 1, 0);

    @OriginalMember(owner = "client!maa", name = "K", descriptor = "I")
    public static int field6180 = 0;

    @OriginalMember(owner = "client!maa", name = "L", descriptor = "[I")
    public static int[] field6181 = new int[4];

    @OriginalMember(owner = "client!maa", name = "z", descriptor = "I")
    public static int field6169;

    @OriginalMember(owner = "client!maa", name = "A", descriptor = "I")
    public static int field6170;

    @OriginalMember(owner = "client!maa", name = "B", descriptor = "I")
    public static int field6171;

    @OriginalMember(owner = "client!maa", name = "C", descriptor = "I")
    public static int field6172;

    @OriginalMember(owner = "client!maa", name = "D", descriptor = "I")
    public static int field6173;

    @OriginalMember(owner = "client!maa", name = "E", descriptor = "I")
    public static int field6174;

    @OriginalMember(owner = "client!maa", name = "F", descriptor = "I")
    public static int field6175;

    @OriginalMember(owner = "client!maa", name = "G", descriptor = "I")
    public static int field6176;

    @OriginalMember(owner = "client!maa", name = "H", descriptor = "I")
    public static int field6177;

    @OriginalMember(owner = "client!maa", name = "M", descriptor = "Lac;")
    public static class712 field6182;

    @OriginalMember(owner = "client!maa", name = "<init>", descriptor = "(IIIII)V", line = 2)
    public class440(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super.field5792 = (byte) arg4;
        super.field5784 = arg2;
        super.field5779 = (byte) arg3;
        super.field5790 = arg0;
        super.field5791 = arg1;
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(I[Lpk;)I", line = 14)
    public final int method933(int arg0, class621[] arg1) {
        ++field6177;
        if (arg0 != 16) {
            field6181 = null;
        }
        return this.method2425(super.field5790 >> class455.field6383, super.field5784 >> class455.field6383, true, arg1);
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(B)V", line = 26)
    public static final void method2594(byte arg0) {
        ++field6173;
        if (arg0 != 96) {
            field6180 = 14;
        }
        int var1 = class677.field9198.length;
        for (int var2 = 0; ~var2 > ~var1; ++var2) {
            if (class677.field9198[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; ~class475.field6797 < ~var4; ++var4) {
                    if (class248.field3162[var2] == class23.field310[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (~var3 == 0) {
                    class23.field310[class475.field6797] = class248.field3162[var2];
                    var3 = class475.field6797++;
                }
                class179 var5 = new class179(class677.field9198[var2]);
                int var6 = 0;
                while (~var5.field2354 > ~class677.field9198[var2].length && var6 < 511 && class443.field6200 < 1023) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method1107(false);
                    int var9 = var8 >> 14;
                    int var10 = var8 >> 7 & 63;
                    int var11 = 63 & var8;
                    int var12 = (class248.field3162[var2] >> 8) * 64 - class63.field851 + var10;
                    int var13 = (255 & class248.field3162[var2]) * 64 + var11 + -class753.field10509;
                    class155 var14 = class598.field8304.method1452(var5.method1107(false), arg0 + -32);
                    class247 var15 = (class247) class563.field7875.method3248((long) var7, 0);
                    if (var15 == null && ~(var14.field1940 & 1) < -1 && class553.field7772 == var9 && var12 >= 0 && ~(var14.field1928 + var12) > ~class613.field8591 && var13 >= 0 && ~(var14.field1928 + var13) > ~class1.field3) {
                        class124 var16 = new class124();
                        var16.field354 = var7;
                        class247 var17 = new class247(var16);
                        class563.field7875.method3249((long) var7, var17, (byte) -82);
                        class38.field559[class676.field9195++] = var17;
                        class61.field832[class443.field6200++] = var7;
                        var16.field352 = class266.field3368;
                        var16.method803(-92, var14);
                        var16.method254(var16.field1486.field1928, (byte) -84);
                        var16.field335 = var16.field1486.field1966 << 3;
                        var16.method270(120, (1885339655 & var16.field1486.field1955 - -4) << 11, true);
                        var16.method807(true, var13, arg0 + -237433528, var16.method253((byte) -27), var9, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!maa", name = "e", descriptor = "(I)V", line = 126)
    public final void method523(int arg0) {
        if (arg0 == 0) {
            ++field6169;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(IIZZ)V", line = 138)
    public static final void method2595(int arg0, int arg1, boolean arg2, boolean arg3) {
        if (arg3) {
            ++field6174;
            if (arg1 >= 8000 && ~arg1 >= -48001) {
                class554.field7780 = arg1;
                class692.field9813 = arg0;
                class48.field709 = arg2;
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!maa", name = "b", descriptor = "(Z)V", line = 156)
    public static void method2596(boolean arg0) {
        field6181 = null;
        field6182 = null;
        field6178 = null;
        if (arg0) {
            method2596(false);
        }
        field6179 = null;
    }

    @OriginalMember(owner = "client!maa", name = "i", descriptor = "(I)Z", line = 169)
    public final boolean method936(int arg0) {
        ++field6176;
        return arg0 >= -85 ? true : class376.field5266[(super.field5790 >> class455.field6383) + -class337.field4349 + class267.field3381][(super.field5784 >> class455.field6383) + -class561.field7852 + class267.field3381];
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(I)V", line = 182)
    public static final void method2597(int arg0) {
        if (arg0 != 8000) {
            method2595(127, 10, false, false);
        }
        ++field6171;
        class190.field2493.method3593(false);
    }

    @OriginalMember(owner = "client!maa", name = "b", descriptor = "(ILha;)Z", line = 194)
    public final boolean method935(int arg0, class454 arg1) {
        if (arg0 < 64) {
            return true;
        } else {
            ++field6170;
            class456 var3 = class761.method4234(super.field5779, super.field5790 >> class455.field6383, super.field5784 >> class455.field6383);
            return var3 != null && var3.field6384.field6329 ? class477.method2792((byte) -114, var3.field6384.method247(0) + this.method247(0), super.field5790 >> class455.field6383, super.field5784 >> class455.field6383, super.field5779) : class432.method2572(super.field5779, super.field5790 >> class455.field6383, 1, super.field5784 >> class455.field6383);
        }
    }

    @OriginalMember(owner = "client!maa", name = "c", descriptor = "(B)Z", line = 212)
    public final boolean method516(byte arg0) {
        if (arg0 >= -67) {
            field6180 = 81;
        }
        ++field6172;
        return false;
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(ZILmb;Lha;III)V", line = 223)
    public final void method514(boolean arg0, int arg1, class410 arg2, class454 arg3, int arg4, int arg5, int arg6) {
        if (arg1 == 12473) {
            ++field6175;
            throw new IllegalStateException();
        }
    }
}
