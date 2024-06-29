import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class570 extends class30 {

    @OriginalMember(owner = "client!te", name = "z", descriptor = "I")
    private int field8090 = 4096;

    @OriginalMember(owner = "client!te", name = "J", descriptor = "I")
    private int field8100 = 4096;

    @OriginalMember(owner = "client!te", name = "I", descriptor = "I")
    private int field8099 = 4096;

    @OriginalMember(owner = "client!te", name = "E", descriptor = "Lem;")
    public static class206 field8095 = new class206(87, 3);

    @OriginalMember(owner = "client!te", name = "K", descriptor = "I")
    public static int field8101 = 0;

    @OriginalMember(owner = "client!te", name = "G", descriptor = "[Lkr;")
    public static class693[] field8097 = new class693[5];

    @OriginalMember(owner = "client!te", name = "A", descriptor = "I")
    public static int field8091;

    @OriginalMember(owner = "client!te", name = "B", descriptor = "I")
    public static int field8092;

    @OriginalMember(owner = "client!te", name = "C", descriptor = "I")
    public static int field8093;

    @OriginalMember(owner = "client!te", name = "D", descriptor = "I")
    public static int field8094;

    @OriginalMember(owner = "client!te", name = "F", descriptor = "I")
    public static int field8096;

    @OriginalMember(owner = "client!te", name = "H", descriptor = "I")
    public static int field8098;

    @OriginalMember(owner = "client!te", name = "L", descriptor = "I")
    public static int field8102;

    static {
        for (int var0 = 0; field8097.length > var0; ++var0) {
            field8097[var0] = new class693();
        }
    }

    @OriginalMember(owner = "client!te", name = "d", descriptor = "(I)V", line = 4)
    public static void method3264(int arg0) {
        field8097 = null;
        if (arg0 < -105) {
            field8095 = null;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIII)V", line = 17)
    public static final void method3265(int arg0, int arg1, int arg2, int arg3) {
        ++field8093;
        String var4 = "tele " + arg0 + "," + (arg1 >> 6) + "," + (arg3 >> 6) + "," + (arg1 & 63) + "," + (arg3 & 63);
        System.out.println(var4);
        if (arg2 == 1) {
            class453.method2573(var4, false, true, true);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BILac;)V", line = 31)
    public final void method27(byte arg0, int arg1, class501 arg2) {
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field8100 = arg2.method2845(-1);
                }
            } else {
                this.field8099 = arg2.method2845(-1);
            }
        } else {
            this.field8090 = arg2.method2845(-1);
        }
        if (arg0 < 100) {
            field8097 = null;
        }
        ++field8091;
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V", line = 257)
    public class570() {
        super(1, false);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ZI)V", line = 77)
    public static final void method3266(boolean arg0, int arg1) {
        ++field8102;
        if (arg0) {
            if (~class631.field8758 != 0) {
                class515.method2941((byte) 112, class631.field8758);
            }
            for (class685 var2 = (class685) class4.field26.method977(arg1 ^ -12236); var2 != null; var2 = (class685) class4.field26.method975(-1)) {
                if (!var2.method2339(103)) {
                    var2 = (class685) class4.field26.method977(0);
                    if (var2 == null) {
                        break;
                    }
                }
                class17.method83(true, var2, arg1 ^ 3839, false);
            }
            class631.field8758 = -1;
            class4.field26 = new class139(8);
            class568.method3252((byte) 54);
            class631.field8758 = class80.field1209;
            class546.method3075(false, arg1 + 12236);
            class314.method1905(-101);
            class97.method705(class631.field8758);
        }
        class75.field991 = false;
        if (arg1 == -12236) {
            class627.field8691 = "";
            class473.field6503 = "";
            class486.method2763(1007);
            class112.field1563 = -1;
            class267.method1626((byte) 10, class236.field3252);
            class143.field2063 = new class677();
            class143.field2063.field4042 = class401.field5620 * 512 / 2;
            class143.field2063.field1807[0] = class401.field5620 / 2;
            class143.field2063.field4047 = class257.field3508 * 512 / 2;
            class143.field2063.field1801[0] = class257.field3508 / 2;
            class11.field114 = 0;
            class666.field9335 = 0;
            if (~class203.field2863 == -3) {
                class11.field114 = class290.field3995 << 9;
                class666.field9335 = class65.field854 << 9;
            } else {
                class287.method1766(arg1 + 12236);
            }
            class127.method906(arg1 + 16332);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIIII)I", line = 138)
    public static final int method3267(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field8094;
        if (~(arg3 & 1) == -2) {
            int var7 = arg0;
            arg0 = arg6;
            arg6 = var7;
        }
        int var8 = arg1 & arg4;
        if (var8 == 0) {
            return arg2;
        } else if (var8 == 1) {
            return arg5;
        } else {
            return var8 == 2 ? -arg0 - (-1 - -arg2 - 7) : -arg5 + 7 + -arg6 + 1;
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(IB)V", line = 169)
    public static final void method3268(int arg0, byte arg1) {
        ++field8098;
        class51 var2 = class703.method3938(-1989279584, arg0, 3);
        if (arg1 != 51) {
            field8097 = null;
        }
        var2.method404(arg1 ^ 106);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IB)[[I", line = 191)
    public final int[][] method30(int arg0, byte arg1) {
        ++field8092;
        int[][] var3 = super.field377.method3683(arg0, (byte) 123);
        if (arg1 != 7) {
            method3268(-80, (byte) -119);
        }
        if (super.field377.field9085) {
            int[][] var4 = this.method292(105, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class31.field399 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (~var12 == ~var13 && ~var13 == ~var14) {
                    var8[var11] = this.field8090 * var12 >> 12;
                    var9[var11] = this.field8099 * var13 >> 12;
                    var10[var11] = this.field8100 * var14 >> 12;
                } else {
                    var8[var11] = this.field8090;
                    var9[var11] = this.field8099;
                    var10[var11] = this.field8100;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(II[ILlj;[II)Lmfa;", line = 260)
    public static final class572 method3269(int arg0, int arg1, int[] arg2, class565 arg3, int[] arg4, int arg5) {
        ++field8096;
        byte[] var6 = new byte[arg1 * arg5];
        for (int var7 = arg0; ~var7 > ~arg5; ++var7) {
            int var8 = arg1 * var7 + arg4[var7];
            for (int var9 = 0; ~arg2[var7] < ~var9; ++var9) {
                var6[var8++] = -1;
            }
        }
        return new class572(arg3, arg1, arg5, var6);
    }
}
