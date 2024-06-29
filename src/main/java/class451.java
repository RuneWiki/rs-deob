import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class451 extends class76 implements class161 {

    @OriginalMember(owner = "client!sa", name = "D", descriptor = "Laa;")
    public class76 field6699;

    @OriginalMember(owner = "client!sa", name = "S", descriptor = "[I")
    public static int[] field6713;

    @OriginalMember(owner = "client!sa", name = "T", descriptor = "[Ljava/lang/String;")
    public static String[] field6714;

    @OriginalMember(owner = "client!sa", name = "U", descriptor = "Lmo;")
    public static class271 field6715;

    @OriginalMember(owner = "client!sa", name = "y", descriptor = "I")
    public static int field6695;

    @OriginalMember(owner = "client!sa", name = "z", descriptor = "I")
    public static int field6696;

    @OriginalMember(owner = "client!sa", name = "A", descriptor = "I")
    public static int field6697;

    @OriginalMember(owner = "client!sa", name = "C", descriptor = "I")
    public static int field6698;

    @OriginalMember(owner = "client!sa", name = "E", descriptor = "I")
    public static int field6700;

    @OriginalMember(owner = "client!sa", name = "F", descriptor = "I")
    public static int field6701;

    @OriginalMember(owner = "client!sa", name = "G", descriptor = "I")
    public static int field6702;

    @OriginalMember(owner = "client!sa", name = "H", descriptor = "I")
    public static int field6703;

    @OriginalMember(owner = "client!sa", name = "I", descriptor = "I")
    public static int field6704;

    @OriginalMember(owner = "client!sa", name = "J", descriptor = "I")
    public static int field6705;

    @OriginalMember(owner = "client!sa", name = "K", descriptor = "I")
    public static int field6706;

    @OriginalMember(owner = "client!sa", name = "L", descriptor = "I")
    public static int field6707;

    @OriginalMember(owner = "client!sa", name = "M", descriptor = "I")
    public static int field6708;

    @OriginalMember(owner = "client!sa", name = "N", descriptor = "I")
    public static int field6709;

    @OriginalMember(owner = "client!sa", name = "O", descriptor = "I")
    public static int field6710;

    @OriginalMember(owner = "client!sa", name = "Q", descriptor = "I")
    public static int field6711;

    @OriginalMember(owner = "client!sa", name = "R", descriptor = "Lum;")
    public static class83 field6712;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)I")
    public final int method101(boolean arg0) {
        field6705++;
        return arg0 ? 110 : 0;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILza;)V")
    public final void method98(int arg0, class299 arg1) {
        field6702++;
        if (arg0 != 31203) {
            this.method100((byte) -33, null);
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)I")
    public final int method103(int arg0) {
        if (arg0 > -10) {
            field6715 = null;
        }
        field6696++;
        return 0;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lza;IIILps;IZ)V")
    public final void method102(class299 arg0, int arg1, int arg2, int arg3, class352 arg4, int arg5, boolean arg6) {
        if (arg3 != -750) {
            field6715 = null;
        }
        field6706++;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BLza;)V")
    public final void method100(byte arg0, class299 arg1) {
        field6703++;
        if (arg0 != 51) {
            field6715 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "(I)V")
    public static void method2766(int arg0) {
        field6714 = null;
        field6713 = null;
        if (arg0 != 2) {
            method2767(82, 75, -26, -8, null, null, false, 113, null);
        }
        field6715 = null;
        field6712 = null;
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(B)Z")
    public final boolean method104(byte arg0) {
        field6698++;
        int var2 = 67 % ((-arg0 - 41) / 38);
        return false;
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(IIIIIIIIIILaa;)V")
    public class451(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class76 arg10) {
        super(arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, class331.method2162(2, arg1, arg0));
        this.field6699 = arg10;
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)V")
    public final void method106(int arg0) {
        field6704++;
        if (arg0 != -19159) {
            this.method103(-111);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lza;B)V")
    public final void method96(class299 arg0, byte arg1) {
        if (arg1 < 78) {
            field6712 = null;
        }
        field6697++;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIILza;Lfi;ZILta;)V")
    public static final void method2767(int arg0, int arg1, int arg2, int arg3, class299 arg4, class38 arg5, boolean arg6, int arg7, class340 arg8) {
        if (arg6) {
            return;
        }
        field6695++;
        class30 var9 = class455.field6765.method2182(arg0, (byte) -42);
        if (var9 == null || !var9.field343 || !var9.method184(126, class288.field4476)) {
            return;
        }
        if (var9.field371 != null) {
            int[] var10 = new int[var9.field371.length];
            for (int var11 = 0; var11 < (var10.length / 2); var11++) {
                int var13;
                if (class33.field401 == 4) {
                    var13 = (int) class434.field6466 & 0x3FFF;
                } else {
                    var13 = (int) class434.field6466 + class484.field7096 & 0x3FFF;
                }
                int var14 = class58.field891[var13];
                int var15 = class58.field889[var13];
                if (class33.field401 != 4) {
                    var14 = var14 * 256 / (class195.field3064 + 256);
                    var15 = var15 * 256 / (class195.field3064 + 256);
                }
                var10[var11 * 2] = ((var9.field371[var11 * 2] * 4 + arg1) * var15 + (var9.field371[var11 * 2 + 1] * 4 + arg7) * var14 >> 15) + arg5.field629 / 2 + arg2;
                var10[var11 * 2 + 1] = arg5.field591 / 2 + arg3 - ((var9.field371[var11 * 2 + 1] * 4 + arg7) * var15 - (var9.field371[var11 * 2] * 4 + arg1) * var14 >> 15);
            }
            class137.method1009(arg4, var10, var9.field353, arg5.field645, arg5.field525);
            for (int var12 = 0; var12 < var10.length / 2 - 1; var12++) {
                arg4.method533(var10[var12 * 2], var10[var12 * 2 + 1], var10[var12 * 2 + 2], var10[(var12 + 1) * 2 + 1], var9.field335, 1, arg8, arg2, arg3);
            }
            arg4.method533(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field335, 1, arg8, arg2, arg3);
        }
        class363 var16 = null;
        if (var9.field331 != -1) {
            var16 = var9.method176(false, 0, arg4);
            if (var16 != null) {
                class408.method2574(arg8, arg1, -32068, arg3, var16, arg2, arg5, arg7);
            }
        }
        if (var9.field337 == null) {
            return;
        }
        int var17 = 0;
        if (var16 != null) {
            var17 = var16.method399();
        }
        class310 var18 = class532.field7770;
        class29 var19 = class258.field4149;
        if (var9.field351 == 1) {
            var18 = class54.field833;
            var19 = class114.field1755;
        }
        if (var9.field351 == 2) {
            var19 = class447.field6643;
            var18 = class441.field6573;
        }
        class338.method2192(arg5, arg8, (byte) -16, var17, arg1, arg3, var19, var9.field327, var18, var9.field337, arg2, arg7);
        return;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lza;III)Z")
    public final boolean method109(class299 arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 23) {
            this.method109(null, -56, -113, 59);
        }
        field6708++;
        return false;
    }

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "(I)V")
    public final void method108(int arg0) {
        field6707++;
        int var2 = 4 % ((48 - arg0) / 37);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)I")
    public final int method97(int arg0) {
        field6700++;
        return arg0 < 82 ? -37 : 0;
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(ILza;)Lhp;")
    public final class293 method110(int arg0, class299 arg1) {
        field6710++;
        return arg0 == 0 ? null : null;
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(B)Z")
    public final boolean method107(byte arg0) {
        if (arg0 != -88) {
            field6712 = null;
        }
        field6701++;
        return false;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lza;IZ)Le;")
    public final class289 method111(class299 arg0, int arg1, boolean arg2) {
        field6709++;
        if (!arg2) {
            method2767(46, -6, -40, 7, null, null, true, 59, null);
        }
        return null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)I")
    public final int method99(byte arg0) {
        if (arg0 != -107) {
            this.method101(false);
        }
        field6711++;
        return 0;
    }

    static {
        new class179("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
        field6713 = new int[13];
        field6714 = new String[100];
        field6715 = new class271(6, 3);
    }
}
