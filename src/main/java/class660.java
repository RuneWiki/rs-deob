import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class660 extends class260 {

    @OriginalMember(owner = "client!am", name = "p", descriptor = "I")
    public static int field9129 = -1;

    @OriginalMember(owner = "client!am", name = "h", descriptor = "I")
    public static int field9121;

    @OriginalMember(owner = "client!am", name = "i", descriptor = "I")
    public static int field9122;

    @OriginalMember(owner = "client!am", name = "j", descriptor = "I")
    public static int field9123;

    @OriginalMember(owner = "client!am", name = "k", descriptor = "I")
    public static int field9124;

    @OriginalMember(owner = "client!am", name = "l", descriptor = "I")
    public static int field9125;

    @OriginalMember(owner = "client!am", name = "m", descriptor = "I")
    public static int field9126;

    @OriginalMember(owner = "client!am", name = "n", descriptor = "I")
    public static int field9127;

    @OriginalMember(owner = "client!am", name = "o", descriptor = "I")
    public static int field9128;

    @OriginalMember(owner = "client!am", name = "q", descriptor = "Leu;")
    public static class508 field9130;

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(ILfca;)V")
    public class660(int arg0, class92 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)V")
    public final void method2(boolean arg0) {
        if (this.method3655((byte) 109)) {
            if (super.field3867.field1270.method4291(8192) && !class32.method231(-54, super.field3867.field1270.method4293(12))) {
                super.field3868 = 1;
            }
            if (super.field3867.field1279.method1299(96) == 1) {
                super.field3868 = 1;
            }
        }
        ++field9122;
        if (~super.field3868 == -4) {
            super.field3868 = 2;
        }
        if (~super.field3868 > -1 || ~super.field3868 < -4) {
            super.field3868 = this.method8((byte) 4);
        }
        if (arg0) {
            this.method3655((byte) 113);
        }
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(I)I")
    public final int method3651(int arg0) {
        if (arg0 <= 3) {
            this.method8((byte) 62);
        }
        ++field9125;
        return super.field3868;
    }

    @OriginalMember(owner = "client!am", name = "c", descriptor = "(I)V")
    public static void method3652(int arg0) {
        field9130 = null;
        if (arg0 < 87) {
            field9130 = null;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Lda;Lha;Leia;ZILjava/lang/String;)V")
    public static final void method3653(class66 arg0, class65 arg1, class255 arg2, boolean arg3, int arg4, String arg5) {
        ++field9127;
        boolean var6 = !class27.field407 || client.method2012(-26);
        if (arg4 > -64) {
            method3652(-17);
        }
        if (var6) {
            if (class27.field407 && var6) {
                class255 var7 = class500.field6899;
                class66 var8 = arg1.method545(var7, class341.field4928, true);
                int var9 = var7.method1701((byte) -121, arg5, 250, (class147[]) null);
                int var10 = var7.method1704(true, 250, arg5, (class147[]) null, var7.field3796);
                int var11 = class37.field576.field7017;
                int var12 = var11 + 4;
                int var13 = var12 * 2 + var9;
                int var14 = var12 * 2 + var10;
                if (class321.field4620 > var14) {
                    var14 = class321.field4620;
                }
                if (var13 < class126.field1894) {
                    var13 = class126.field1894;
                }
                int var15 = class328.field4760.method3160(var13, class124.field1786, (byte) -91) - -class207.field2707;
                int var16 = class764.field10569.method3543(0, class710.field9945, var14) + class156.field2123;
                if (class130.field1934) {
                    var15 += class550.method3117(99);
                    var16 += class621.method3410(-2);
                }
                arg1.method477(class488.field6756, false).method1095(field9130.field7017 + var15, field9130.field7014 + var16, -(field9130.field7017 * 2) + var13, var14 - field9130.field7014 * 2, 1, 0, 0);
                arg1.method477(field9130, true).method1102(var15, var16);
                field9130.method2942();
                arg1.method477(field9130, true).method1102(-var11 + var13 + var15, var16);
                field9130.method2949();
                arg1.method477(field9130, true).method1102(var13 + var15 + -var11, var16 - var11 + var14);
                field9130.method2942();
                arg1.method477(field9130, true).method1102(var15, var14 + var16 - var11);
                field9130.method2949();
                arg1.method477(class37.field576, true).method1111(var15, field9130.field7014 + var16, var11, -(field9130.field7014 * 2) + var14);
                class37.field576.method2948();
                arg1.method477(class37.field576, true).method1111(field9130.field7017 + var15, var16, var13 - field9130.field7017 * 2, var11);
                class37.field576.method2948();
                arg1.method477(class37.field576, true).method1111(var13 + var15 + -var11, field9130.field7014 + var16, var11, var14 - field9130.field7014 * 2);
                class37.field576.method2948();
                arg1.method477(class37.field576, true).method1111(field9130.field7017 + var15, var14 + var16 + -var11, -(field9130.field7017 * 2) + var13, var11);
                class37.field576.method2948();
                var8.method574(arg5, 0, 0, (class147[]) null, var12 + var15, -1, -16777216 | class570.field7588, 1, -(var12 * 2) + var13, -(var12 * 2) + var14, 0, 1, -1, (class514) null, (int[]) null, var16 - -var12);
                class38.method270(-2409, var15, var14, var16, var13);
            } else {
                int var17 = arg2.method1701((byte) -121, arg5, 250, (class147[]) null);
                int var18 = 13 * arg2.method1697(-50, (class147[]) null, arg5, 250);
                byte var19 = 4;
                int var20 = var19 + 6;
                int var21 = var19 + 6;
                arg1.method563(-var19 + var20, var21 - var19, var17 + var19 + var19, var18 + var19 - -var19, -16777216, 0);
                arg1.method538(-var19 + var20, var21 - var19, var17 + var19 + var19, var18 + var19 + var19, -1, 0);
                arg0.method574(arg5, 0, 0, (class147[]) null, var20, -1, -1, 1, var17, var18, 0, 1, -1, (class514) null, (int[]) null, var21);
                class38.method270(-2409, -var19 + var20, var18 - -var19 - -var19, var21 - var19, var17 - (-var19 + -var19));
            }
            if (arg3) {
                try {
                    if (class130.field1934) {
                        class184.method1278((byte) 113);
                    } else {
                        arg1.method548((byte) -91);
                    }
                } catch (class566 var22) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(IB)V")
    public final void method9(int arg0, byte arg1) {
        if (arg1 == -107) {
            super.field3868 = arg0;
            ++field9124;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(B)I")
    public final int method8(byte arg0) {
        if (arg0 != 4) {
            this.method8((byte) -54);
        }
        ++field9128;
        return 0;
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lfca;)V")
    public class660(class92 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IB)I")
    public final int method4(int arg0, byte arg1) {
        ++field9121;
        int var3 = 68 / ((arg1 - -53) / 50);
        if (class490.method2848((byte) -43, arg0)) {
            if (super.field3867.field1270.method4291(8192) && !class32.method231(-50, super.field3867.field1270.method4293(25))) {
                return 3;
            }
            if (~super.field3867.field1279.method1299(119) == -2) {
                return 3;
            }
        }
        if (~arg0 == -4) {
            return 3;
        } else {
            return class490.method2848((byte) -54, arg0) ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!am", name = "d", descriptor = "(I)Z")
    public final boolean method3654(int arg0) {
        int var2 = 103 % ((arg0 - 56) / 53);
        ++field9123;
        return true;
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(B)Z")
    public final boolean method3655(byte arg0) {
        int var2 = -116 / ((-24 - arg0) / 34);
        ++field9126;
        return class490.method2848((byte) -32, super.field3868);
    }
}
