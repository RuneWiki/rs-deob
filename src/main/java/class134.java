import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class134 {

    @OriginalMember(owner = "client!as", name = "g", descriptor = "Lwf;")
    private class117 field1829 = new class117(64);

    @OriginalMember(owner = "client!as", name = "i", descriptor = "Lkda;")
    private class328 field1831;

    @OriginalMember(owner = "client!as", name = "c", descriptor = "Z")
    public static boolean field1825;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!as", name = "b", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!as", name = "d", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!as", name = "e", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!as", name = "f", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!as", name = "h", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(II)Lrn;")
    public final class226 method921(int arg0, int arg1) {
        field1830++;
        class117 var3 = this.field1829;
        class226 var4;
        synchronized (this.field1829) {
            var4 = (class226) this.field1829.method842(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class328 var5 = this.field1831;
        byte[] var6;
        synchronized (this.field1831) {
            var6 = this.field1831.method1966(arg1, arg0, true);
        }
        class226 var7 = new class226();
        if (var6 != null) {
            var7.method1450(arg0 + 93, new class148(var6));
        }
        class117 var8 = this.field1829;
        synchronized (this.field1829) {
            this.field1829.method835((byte) 126, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method922(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1824++;
        int var8 = 0;
        int var9 = arg0;
        int var10 = 0;
        int var11 = arg2 - arg3;
        int var12 = arg0 - arg3;
        int var13 = arg2 * arg2;
        int var14 = arg0 * arg0;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        if (arg7 <= 82) {
            return;
        }
        int var21 = arg0 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg0 - 1) * var27;
        int var37 = var30;
        if (class3.field25 <= arg5 && arg5 <= class100.field1452) {
            int[] var38 = class604.field8993[arg5];
            int var39 = class36.method223(class130.field1801, (byte) 50, arg1 - arg2, class14.field136);
            int var40 = class36.method223(class130.field1801, (byte) 50, arg1 + arg2, class14.field136);
            int var41 = class36.method223(class130.field1801, (byte) 50, arg1 - var11, class14.field136);
            int var42 = class36.method223(class130.field1801, (byte) 50, arg1 + var11, class14.field136);
            class140.method969(var39, 15888, arg6, var41, var38);
            class140.method969(var41, 15888, arg4, var42, var38);
            class140.method969(var42, 15888, arg6, var40, var38);
        }
        int var43 = (var12 - 1) * var29;
        while (var9 > 0) {
            boolean var44 = var9 <= var12;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var37 += var30;
                        var33 += var30;
                        var10++;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var37;
                    var37 += var30;
                    var10++;
                    var33 += var30;
                }
                var26 += -var34;
                var25 += -var43;
                var34 -= var29;
                var43 -= var29;
            }
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var31 += var28;
                    var8++;
                    var35 += var28;
                }
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var31 += var28;
                var35 += var28;
                var8++;
            }
            var23 += -var36;
            var24 += -var32;
            var36 -= var27;
            var9--;
            var32 -= var27;
            int var45 = arg5 - var9;
            int var46 = arg5 + var9;
            if (var46 >= class3.field25 && class100.field1452 >= var45) {
                int var47 = class36.method223(class130.field1801, (byte) 50, arg1 + var8, class14.field136);
                int var48 = class36.method223(class130.field1801, (byte) 50, arg1 - var8, class14.field136);
                if (var44) {
                    int var49 = class36.method223(class130.field1801, (byte) 50, arg1 + var10, class14.field136);
                    int var50 = class36.method223(class130.field1801, (byte) 50, arg1 - var10, class14.field136);
                    if (class3.field25 <= var45) {
                        int[] var51 = class604.field8993[var45];
                        class140.method969(var48, 15888, arg6, var50, var51);
                        class140.method969(var50, 15888, arg4, var49, var51);
                        class140.method969(var49, 15888, arg6, var47, var51);
                    }
                    if (class100.field1452 >= var46) {
                        int[] var52 = class604.field8993[var46];
                        class140.method969(var48, 15888, arg6, var50, var52);
                        class140.method969(var50, 15888, arg4, var49, var52);
                        class140.method969(var49, 15888, arg6, var47, var52);
                    }
                } else {
                    if (class3.field25 <= var45) {
                        class140.method969(var48, 15888, arg6, var47, class604.field8993[var45]);
                    }
                    if (var46 <= class100.field1452) {
                        class140.method969(var48, 15888, arg6, var47, class604.field8993[var46]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(III[J[I)V")
    public static final void method923(int arg0, int arg1, int arg2, long[] arg3, int[] arg4) {
        if (arg2 < arg1) {
            int var5 = (arg1 + arg2) / 2;
            int var6 = arg2;
            long var7 = arg3[var5];
            arg3[var5] = arg3[arg1];
            arg3[arg1] = var7;
            int var9 = arg4[var5];
            arg4[var5] = arg4[arg1];
            arg4[arg1] = var9;
            int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
            for (int var11 = arg2; var11 < arg1; var11++) {
                if ((var7 + ((long) (var10 & var11))) > arg3[var11]) {
                    long var12 = arg3[var11];
                    arg3[var11] = arg3[var6];
                    arg3[var6] = var12;
                    int var14 = arg4[var11];
                    arg4[var11] = arg4[var6];
                    arg4[var6++] = var14;
                }
            }
            arg3[arg1] = arg3[var6];
            arg3[var6] = var7;
            arg4[arg1] = arg4[var6];
            arg4[var6] = var9;
            method923(1, var6 - 1, arg2, arg3, arg4);
            method923(arg0, arg1, var6 + 1, arg3, arg4);
        }
        if (arg0 != 1) {
            field1825 = true;
        }
        field1823++;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Z)V")
    public final void method924(boolean arg0) {
        field1827++;
        class117 var2 = this.field1829;
        synchronized (this.field1829) {
            this.field1829.method846(0);
            if (arg0) {
                this.method924(false);
            }
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(I)V")
    public final void method925(int arg0) {
        field1828++;
        class117 var2 = this.field1829;
        synchronized (this.field1829) {
            if (arg0 != 64) {
                this.field1831 = null;
            }
            this.field1829.method837(arg0 + 61);
        }
    }

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(II)V")
    public final void method926(int arg0, int arg1) {
        if (arg1 != 21103) {
            this.field1831 = null;
        }
        field1826++;
        class117 var3 = this.field1829;
        synchronized (this.field1829) {
            this.field1829.method834(arg0, 0);
        }
    }

    @OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Lbt;ILkda;)V")
    public class134(class39 arg0, int arg1, class328 arg2) {
        this.field1831 = arg2;
        this.field1831.method1975(55, 32);
    }

    static {
        new class572("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
        field1825 = false;
    }
}
