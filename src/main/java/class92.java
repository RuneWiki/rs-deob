import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public class class92 extends class135 implements class407 {

    @OriginalMember(owner = "client!rda", name = "u", descriptor = "I")
    private int field1148;

    @OriginalMember(owner = "client!rda", name = "s", descriptor = "Lqp;")
    public static class586 field1146 = new class586(28, 3);

    @OriginalMember(owner = "client!rda", name = "v", descriptor = "I")
    public static int field1149 = 1405;

    @OriginalMember(owner = "client!rda", name = "y", descriptor = "Lnj;")
    public static class487 field1152 = new class487("Loading SW3D - ", "Lade SW3D - ", "Chargement SW3D - ", "Carregando SW3D - ");

    @OriginalMember(owner = "client!rda", name = "o", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!rda", name = "p", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!rda", name = "q", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!rda", name = "r", descriptor = "I")
    public static int field1145;

    @OriginalMember(owner = "client!rda", name = "t", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!rda", name = "w", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!rda", name = "x", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!rda", name = "c", descriptor = "(I)V", line = 5)
    public final void method532(int arg0) {
        if (arg0 < 10) {
            method533((class167) null, -114, -109, 44, 101, -19);
        }
        super.field1790.method2810(-29071, this);
        ++field1143;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Z)J", line = 20)
    public final long method54(boolean arg0) {
        ++field1147;
        if (!arg0) {
            field1152 = null;
        }
        return 0L;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lqa;IIIII)V", line = 31)
    public static final void method533(class167 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1150;
        arg0.method1022(arg1, arg5, arg1 - -arg2, arg4 + arg5);
        arg0.method1066((byte) 114, arg5, -16777216, arg1, arg4, arg2);
        if (class436.field6426 >= 100) {
            float var6 = (float) class113.field1439 / (float) class113.field1438;
            int var7 = arg2;
            int var8 = arg4;
            if (var6 < 1.0F) {
                var8 = (int) ((float) arg2 * var6);
            } else {
                var7 = (int) ((float) arg4 / var6);
            }
            if (arg3 != -14175) {
                method534((byte) -35);
            }
            int var9 = (-var8 + arg4) / 2 + arg5;
            int var10 = (-var7 + arg2) / 2 + arg1;
            if (class64.field747 == null || ~arg2 != ~class64.field747.method718() || arg4 != class64.field747.method721()) {
                class113.method669(class113.field1445, class113.field1439 + class113.field1434, class113.field1445 + class113.field1438, class113.field1434, var10, var9, var7 + var10, var9 - -var8);
                class113.method670(arg0);
                class64.field747 = arg0.method1040(var10, var9, var7, var8, false);
            }
            class64.field747.method723(var10, var9);
            int var11 = class73.field848 * var7 / class113.field1438;
            int var12 = class180.field2770 * var8 / class113.field1439;
            int var13 = class429.field6299 * var7 / class113.field1438 + var10;
            int var14 = var8 + var9 + -var12 - class133.field1766 * var8 / class113.field1439;
            int var15 = -1996554240;
            if (class461.field6666 == class181.field2783) {
                var15 = -1996488705;
            }
            arg0.method980(var13, var14, var11, var12, var15, 1);
            arg0.method1032(var13, var14, var11, var12, var15, 0);
            if (~class59.field710 < -1) {
                int var16;
                if (class181.field2785 > 50) {
                    var16 = -(class181.field2785 * 5) + 500;
                } else {
                    var16 = class181.field2785 * 5;
                }
                for (class385 var17 = (class385) class113.field1428.method2496((byte) -127); var17 != null; var17 = (class385) class113.field1428.method2494(54)) {
                    class42 var18 = class113.field1420.method1213(var17.field5633, arg3 + 14181);
                    if (class300.method1860(72, var18)) {
                        if (~class467.field6744 != ~var17.field5633) {
                            if (~class535.field7925 != 0 && ~class535.field7925 == ~var18.field470) {
                                int var19 = var17.field5630 * var7 / class113.field1438 + var10;
                                int var20 = (-var17.field5627 + class113.field1439) * var8 / class113.field1439 + var9;
                                arg0.method1066((byte) 69, var20 + -2, var16 << 24 | 16776960, var19 + -2, 4, 4);
                            }
                        } else {
                            int var21 = var17.field5630 * var7 / class113.field1438 + var10;
                            int var22 = (-var17.field5627 + class113.field1439) * var8 / class113.field1439 + var9;
                            arg0.method1066((byte) 124, var22 + -2, 16776960 | var16 << 24, var21 + -2, 4, 4);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rda", name = "<init>", descriptor = "(Los;I[BIZ)V", line = 129)
    public class92(class468 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field1148 = arg1;
    }

    @OriginalMember(owner = "client!rda", name = "d", descriptor = "(B)V", line = 137)
    public static void method534(byte arg0) {
        if (arg0 > 11) {
            field1146 = null;
            field1152 = null;
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(B)I", line = 148)
    public final int method50(byte arg0) {
        if (arg0 < 96) {
            return -123;
        } else {
            ++field1144;
            return this.field1148;
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(I[BII)V", line = 161)
    public final void method55(int arg0, byte[] arg1, int arg2, int arg3) {
        this.method835(arg0, 35044, arg1);
        if (arg2 != 25321) {
            this.method50((byte) 105);
        }
        ++field1142;
        this.field1148 = arg3;
    }

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "(B)I", line = 183)
    public final int method57(byte arg0) {
        int var2 = 81 / ((arg0 - 40) / 52);
        ++field1145;
        return super.field1796;
    }
}
