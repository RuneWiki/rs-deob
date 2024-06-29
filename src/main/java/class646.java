import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class646 extends class530 {

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "[[I")
    public static int[][] field9153 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!hf", name = "r", descriptor = "I")
    public static int field9162 = 1406;

    @OriginalMember(owner = "client!hf", name = "u", descriptor = "I")
    public static int field9165 = -50;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public static int field9151;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
    public static int field9152;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "I")
    public static int field9155;

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "I")
    public static int field9156;

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "I")
    public static int field9157;

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "I")
    public static int field9158;

    @OriginalMember(owner = "client!hf", name = "o", descriptor = "I")
    public static int field9159;

    @OriginalMember(owner = "client!hf", name = "q", descriptor = "I")
    public static int field9161;

    @OriginalMember(owner = "client!hf", name = "s", descriptor = "I")
    public static int field9163;

    @OriginalMember(owner = "client!hf", name = "t", descriptor = "I")
    public static int field9164;

    @OriginalMember(owner = "client!hf", name = "p", descriptor = "Lha;")
    public static class545 field9160;

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "[I")
    public static int[] field9154;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)I")
    public final int method74(int arg0) {
        if (arg0 != 0) {
            field9153 = null;
        }
        ++field9157;
        return 0;
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(II)Z")
    public static final boolean method3743(int arg0, int arg1) {
        if (arg0 <= 83) {
            field9153 = null;
        }
        ++field9158;
        return arg1 != 1 && arg1 != 7;
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)I")
    public final int method3744(int arg0) {
        ++field9155;
        if (arg0 != 0) {
            field9153 = null;
        }
        return super.field7419;
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(Z)Z")
    public final boolean method3745(boolean arg0) {
        if (!arg0) {
            field9162 = 56;
        }
        ++field9161;
        return class712.method4009((byte) -89, super.field7418.field5158.method1006(0));
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lah;)V")
    public class646(class374 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(ILah;)V")
    public class646(int arg0, class374 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lha;I)V")
    public static final void method3746(class545 arg0, int arg1) {
        ++field9164;
        int var2 = 0;
        int var3 = 0;
        if (class264.field3595) {
            var2 = class468.method2788(false);
            var3 = class142.method934((byte) -88);
        }
        arg0.method2097(var2, var3, class58.field807 + var2, var3 + 350);
        arg0.method2194(var2, var3, class58.field807, 350, class622.field8846 << 24 | 3351159, 1);
        class217.method1422(class58.field807 + var2, var3 + 350, -96, var2, var3);
        int var4 = 350 / class69.field980;
        if (class30.field436 > 0) {
            int var5 = -class69.field980 + 342;
            int var6 = var4 * var5 / (class30.field436 + var4 + -1);
            int var7 = 4;
            if (class30.field436 > 1) {
                var7 += (class30.field436 + -1 + -class196.field2824) * (-var6 + var5) / (class30.field436 - 1);
            }
            arg0.method2194(var2 + -16 + class58.field807, var3 + var7, 12, var6, 3351159 | class622.field8846 << 24, 2);
            for (int var8 = class196.field2824; var8 < class196.field2824 + var4 && ~var8 > ~class30.field436; ++var8) {
                String[] var9 = class498.method2984(class688.field9646[var8], '\b', -97);
                int var10 = (class58.field807 + -8 - 16) / var9.length;
                for (int var11 = 0; ~var9.length < ~var11; ++var11) {
                    int var12 = var10 * var11 + 8;
                    arg0.method2097(var2 + var12, var3, var2 + var10 - -var12 + -8, var3 + 350);
                    class339.field4345.method2427(648, var2 - -var12, class233.method1492(var9[var11], 81), -class90.field1217 - 2 + var3 + -class442.field6064.field10338 + 350 + -((-class196.field2824 + var8) * class69.field980), -1, -16777216);
                }
            }
        }
        class140.field1926.method2422(-1, var2 - 25 + class58.field807, -16777216, var3 + -20 + 350, 18127, "Build: 631");
        arg0.method2097(var2, var3, class58.field807 + var2, var3 - -350);
        arg0.method3264(var3 + 350 - class90.field1217, (byte) 120, -1, var2, class58.field807);
        if (arg1 == -16) {
            class743.field10354.method2427(648, var2 + 10, "--> " + class233.method1492(class577.field8263, 71), -class514.field7181.field10338 + 350 + -1 + var3, -1, -16777216);
            if (class614.field8741) {
                int var13 = -1;
                if (~(class245.field3409 % 30) < -16) {
                    var13 = 16777215;
                }
                arg0.method3260(-98, class514.field7181.method4134((byte) 56, "--> " + class233.method1492(class577.field8263, 67).substring(0, class718.field10149)) + var2 + 10, var13, 12, var3 - 11 + -class514.field7181.field10338 + 350);
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(II)V")
    public final void method70(int arg0, int arg1) {
        ++field9152;
        super.field7419 = arg0;
        if (arg1 > -38) {
            field9153 = null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(I)V")
    public static void method3747(int arg0) {
        if (arg0 == 1) {
            field9154 = null;
            field9153 = null;
            field9160 = null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)V")
    public final void method73(boolean arg0) {
        if (arg0) {
            ++field9151;
            if (super.field7418.field5158.method1005(-127) && !class712.method4009((byte) -126, super.field7418.field5158.method1006(0))) {
                super.field7419 = 0;
            }
            if (super.field7419 < 0 || super.field7419 > 1) {
                super.field7419 = this.method74(0);
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)I")
    public final int method75(int arg0, int arg1) {
        int var3 = 74 % ((63 - arg1) / 60);
        ++field9159;
        return !class712.method4009((byte) 126, super.field7418.field5158.method1006(0)) ? 3 : 1;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BLwu;)V")
    public static final void method3748(byte arg0, class557 arg1) {
        class242.field3376 = arg1;
        if (arg0 <= 77) {
            method3747(-14);
        }
        ++field9163;
    }
}
