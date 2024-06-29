import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class526 extends class216 {

    @OriginalMember(owner = "client!wa", name = "C", descriptor = "Ljava/lang/Object;")
    private Object field7526;

    @OriginalMember(owner = "client!wa", name = "D", descriptor = "Ljc;")
    public static class374 field7527 = new class374();

    @OriginalMember(owner = "client!wa", name = "E", descriptor = "Lh;")
    public static class572 field7528 = new class572(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

    @OriginalMember(owner = "client!wa", name = "F", descriptor = "Lgf;")
    public static class232 field7529 = new class232();

    @OriginalMember(owner = "client!wa", name = "H", descriptor = "Lmo;")
    public static class638 field7530 = new class638();

    @OriginalMember(owner = "client!wa", name = "I", descriptor = "Lada;")
    public static class144 field7531 = new class144(33, 3);

    @OriginalMember(owner = "client!wa", name = "J", descriptor = "[I")
    public static int[] field7532 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!wa", name = "K", descriptor = "I")
    public static int field7533 = -1;

    @OriginalMember(owner = "client!wa", name = "y", descriptor = "I")
    public static int field7522;

    @OriginalMember(owner = "client!wa", name = "z", descriptor = "I")
    public static int field7523;

    @OriginalMember(owner = "client!wa", name = "A", descriptor = "I")
    public static int field7524;

    @OriginalMember(owner = "client!wa", name = "B", descriptor = "I")
    public static int field7525;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public final Object method855(int arg0) {
        if (arg0 > -46) {
            return null;
        } else {
            field7525++;
            return this.field7526;
        }
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class526(Object arg0, int arg1) {
        super(arg1);
        this.field7526 = arg0;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)Z")
    public final boolean method854(byte arg0) {
        if (arg0 == 125) {
            field7523++;
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIILlca;)V")
    public static final void method3099(int arg0, int arg1, int arg2, int arg3, class553 arg4) {
        class205 var5 = class441.method2562(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        arg4.field8235 = (arg1 << class115.field1626) + class402.field5500;
        arg4.field8237 = arg3;
        arg4.field8232 = (arg2 << class115.field1626) + class402.field5500;
        for (class636 var7 = var5.field3029; var7 != null; var7 = var7.field9302) {
            if (var7.field9299.field8495) {
                int var8 = var7.field9299.method177((byte) 40);
                if (var8 != -32768 && var8 < var6) {
                    var6 = var8;
                }
            }
        }
        if (var6 < 0) {
            arg4.field8237 += var6;
            arg4.field8238 = true;
        } else if (var5.field3045 != null) {
            arg4.field8237 -= var5.field3045.field3428;
        }
        var5.field3043 = arg4;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lwca;I)I")
    public static final int method3100(class583 arg0, int arg1) {
        field7522++;
        String var2 = class632.method3679(arg0, (byte) -34);
        int[] var3 = null;
        if (class397.method2359(arg0.field8566, (byte) -30)) {
            var3 = class150.field2242.method3606((byte) 89, (int) arg0.field8564).field8051;
        } else if (arg0.field8558 != -1) {
            var3 = class150.field2242.method3606((byte) -19, arg0.field8558).field8051;
        } else if (class555.method3354(-52, arg0.field8566)) {
            class505 var6 = (class505) class510.field7260.method2799((long) ((int) arg0.field8564), true);
            if (var6 != null) {
                class571 var7 = var6.field7148;
                class87 var8 = var7.field8405;
                if (var8.field1314 != null) {
                    var8 = var8.method655((byte) 108, class556.field8280);
                }
                if (var8 != null) {
                    var3 = var8.field1267;
                }
            }
        } else if (class513.method3044(arg0.field8566, 1012)) {
            Object var4 = null;
            class145 var5;
            if (arg0.field8566 == 1012) {
                var5 = class216.field3172.method1505(-24044, (int) arg0.field8564);
            } else {
                var5 = class216.field3172.method1505(-24044, (int) (arg0.field8564 >>> 32 & 0x7FFFFFFFL));
            }
            if (var5.field2028 != null) {
                var5 = var5.method991(class556.field8280, true);
            }
            if (var5 != null) {
                var3 = var5.field2023;
            }
        }
        if (var3 != null) {
            var2 = var2 + class540.method3280((byte) -88, var3);
        }
        int var9 = class470.field6636.method2124(var2, 115, class352.field4793);
        if (arg1 == 8359) {
            if (arg0.field8552) {
                var9 += class580.field8536.method325() + 4;
            }
            return var9;
        } else {
            return -84;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I[II[II)V")
    public static final void method3101(int arg0, int[] arg1, int arg2, int[] arg3, int arg4) {
        if (arg0 != 242145824) {
            method3102(107);
        }
        field7524++;
        if (arg2 >= arg4) {
            return;
        }
        int var5 = (arg2 + arg4) / 2;
        int var6 = arg2;
        int var7 = arg1[var5];
        arg1[var5] = arg1[arg4];
        arg1[arg4] = var7;
        int var8 = arg3[var5];
        arg3[var5] = arg3[arg4];
        arg3[arg4] = var8;
        int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
        for (int var10 = arg2; var10 < arg4; var10++) {
            if (((var9 & var10) + var7) > arg1[var10]) {
                int var11 = arg1[var10];
                arg1[var10] = arg1[var6];
                arg1[var6] = var11;
                int var12 = arg3[var10];
                arg3[var10] = arg3[var6];
                arg3[var6++] = var12;
            }
        }
        arg1[arg4] = arg1[var6];
        arg1[var6] = var7;
        arg3[arg4] = arg3[var6];
        arg3[var6] = var8;
        method3101(242145824, arg1, arg2, arg3, var6 - 1);
        method3101(arg0, arg1, var6 + 1, arg3, arg4);
    }

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "(I)V")
    public static void method3102(int arg0) {
        field7528 = null;
        field7531 = null;
        field7532 = null;
        field7530 = null;
        field7527 = null;
        if (arg0 != 3) {
            field7528 = null;
        }
        field7529 = null;
    }
}
