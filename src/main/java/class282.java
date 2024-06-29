import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class282 {

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "Ljava/lang/String;")
    private String field3575 = "";

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
    public int field3583 = 70;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    private int field3571 = -1;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
    public int field3580 = -1;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
    private int field3582 = -1;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    private int field3574 = -1;

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "I")
    public int field3590 = 16777215;

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "I")
    public int field3588 = -1;

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "I")
    public int field3584 = -1;

    @OriginalMember(owner = "client!sd", name = "x", descriptor = "I")
    public int field3594 = 0;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    private int field3572 = -1;

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "I")
    public int field3589 = 0;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
    public int field3586 = 0;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!sd", name = "v", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!sd", name = "w", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!sd", name = "y", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!sd", name = "z", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "Lsg;")
    public class461 field3577;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ltn;I)V")
    public final void method1688(class179 arg0, int arg1) {
        if (arg1 != -18431) {
            return;
        }
        field3576++;
        while (true) {
            int var3 = arg0.method1094(255);
            if (var3 == 0) {
                return;
            }
            this.method1689(var3, arg0, -1);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILtn;I)V")
    private final void method1689(int arg0, class179 arg1, int arg2) {
        if (arg2 != -1) {
            this.field3588 = -16;
        }
        if (arg0 == 1) {
            this.field3584 = arg1.method1107(false);
        } else if (arg0 == 2) {
            this.field3590 = arg1.method1114(91);
        } else if (arg0 == 3) {
            this.field3572 = arg1.method1107(false);
        } else if (arg0 == 4) {
            this.field3582 = arg1.method1107(false);
        } else if (arg0 == 5) {
            this.field3571 = arg1.method1107(false);
        } else if (arg0 == 6) {
            this.field3574 = arg1.method1107(false);
        } else if (arg0 == 7) {
            this.field3594 = arg1.method1137((byte) -84);
        } else if (arg0 == 8) {
            this.field3575 = arg1.method1109(112);
        } else if (arg0 == 9) {
            this.field3583 = arg1.method1107(false);
        } else if (arg0 == 10) {
            this.field3586 = arg1.method1137((byte) -127);
        } else if (arg0 == 11) {
            this.field3588 = 0;
        } else if (arg0 == 12) {
            this.field3580 = arg1.method1094(255);
        } else if (arg0 == 13) {
            this.field3589 = arg1.method1137((byte) -97);
        } else if (arg0 == 14) {
            this.field3588 = arg1.method1107(false);
        }
        field3581++;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1690(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3596++;
        if (arg1 != 0) {
            method1690(1, -88, -74, 18, -10, 32, 99);
        }
        int var7 = arg5 - arg6;
        int var8 = arg0 + arg6;
        for (int var9 = arg0; var9 < var8; var9++) {
            class284.method1709(class15.field220[var9], arg3, -8251, arg4, arg2);
        }
        int var10 = arg4 + arg6;
        int var11 = arg3 - arg6;
        for (int var12 = arg5; var12 > var7; var12--) {
            class284.method1709(class15.field220[var12], arg3, arg1 - 8251, arg4, arg2);
        }
        for (int var13 = var8; var13 <= var7; var13++) {
            int[] var14 = class15.field220[var13];
            class284.method1709(var14, var10, -8251, arg4, arg2);
            class284.method1709(var14, arg3, arg1 - 8251, var11, arg2);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BLha;)Lac;")
    public final class712 method1691(byte arg0, class454 arg1) {
        field3587++;
        if (this.field3574 < 0) {
            return null;
        }
        class712 var3 = (class712) this.field3577.field6644.method778((long) this.field3574, 82);
        if (var3 == null) {
            this.method1696((byte) 101, arg1);
            var3 = (class712) this.field3577.field6644.method778((long) this.field3574, -95);
        }
        int var4 = -100 / ((35 - arg0) / 46);
        return var3;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(BLha;)Lac;")
    public final class712 method1692(byte arg0, class454 arg1) {
        if (arg0 >= -45) {
            this.field3584 = -77;
        }
        field3592++;
        if (this.field3571 < 0) {
            return null;
        }
        class712 var3 = (class712) this.field3577.field6644.method778((long) this.field3571, -118);
        if (var3 == null) {
            this.method1696((byte) 101, arg1);
            var3 = (class712) this.field3577.field6644.method778((long) this.field3571, -51);
        }
        return var3;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILha;)Lac;")
    public final class712 method1693(int arg0, class454 arg1) {
        if (arg0 != 1196) {
            return null;
        }
        field3593++;
        if (this.field3582 < 0) {
            return null;
        }
        class712 var3 = (class712) this.field3577.field6644.method778((long) this.field3582, -111);
        if (var3 == null) {
            this.method1696((byte) 101, arg1);
            var3 = (class712) this.field3577.field6644.method778((long) this.field3582, -38);
        }
        return var3;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZI)Ljava/lang/String;")
    public final String method1694(boolean arg0, int arg1) {
        field3595++;
        String var3 = this.field3575;
        if (arg0) {
            this.method1688(null, 100);
        }
        while (true) {
            int var4 = var3.indexOf("%1");
            if (var4 < 0) {
                return var3;
            }
            var3 = var3.substring(0, var4) + class73.method538(arg1, false, (byte) 14) + var3.substring(var4 + 2);
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(Ltn;I)Lcm;")
    public static final class642 method1695(class179 arg0, int arg1) {
        field3578++;
        if (arg1 != 1) {
            method1698(-123, 88, 116, -77, (byte) 30, -90);
        }
        class619 var2 = class505.method2921(arg1 ^ 0x47EC, arg0);
        int var3 = arg0.method1095((byte) 115);
        int var4 = arg0.method1095((byte) 118);
        return new class642(var2.field8672, var2.field8662, var2.field8674, var2.field8675, var2.field8673, var2.field8665, var2.field8667, var2.field8663, var2.field8669, var3, var4);
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(BLha;)V")
    private final void method1696(byte arg0, class454 arg1) {
        if (arg0 != 101) {
            this.method1696((byte) 102, null);
        }
        field3579++;
        class687 var3 = this.field3577.field6642;
        if (this.field3572 >= 0 && this.field3577.field6644.method778((long) this.field3572, 102) == null && var3.method3827(this.field3572, (byte) 73)) {
            class196 var4 = class196.method1223(var3, this.field3572);
            this.field3577.field6644.method774((long) this.field3572, arg0 - 197, arg1.method60(var4, true));
        }
        if (this.field3571 >= 0 && this.field3577.field6644.method778((long) this.field3571, 84) == null && var3.method3827(this.field3571, (byte) 76)) {
            class196 var5 = class196.method1223(var3, this.field3571);
            this.field3577.field6644.method774((long) this.field3571, -34, arg1.method60(var5, true));
        }
        if (this.field3582 >= 0 && this.field3577.field6644.method778((long) this.field3582, 125) == null && var3.method3827(this.field3582, (byte) 69)) {
            class196 var6 = class196.method1223(var3, this.field3582);
            this.field3577.field6644.method774((long) this.field3582, 90, arg1.method60(var6, true));
        }
        if (this.field3574 >= 0 && this.field3577.field6644.method778((long) this.field3574, arg0 + 13) == null && var3.method3827(this.field3574, (byte) 77)) {
            class196 var7 = class196.method1223(var3, this.field3574);
            this.field3577.field6644.method774((long) this.field3574, -96, arg1.method60(var7, true));
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lha;I)Lac;")
    public final class712 method1697(class454 arg0, int arg1) {
        field3591++;
        if (arg1 < ~this.field3572) {
            return null;
        }
        class712 var3 = (class712) this.field3577.field6644.method778((long) this.field3572, -66);
        if (var3 == null) {
            this.method1696((byte) 101, arg0);
            var3 = (class712) this.field3577.field6644.method778((long) this.field3572, 78);
        }
        return var3;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIBI)V")
    public static final void method1698(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field3585++;
        int var6 = 0;
        int var7 = arg0;
        int var8 = arg3 * arg3;
        int var9 = arg0 * arg0;
        int var10 = var9 << 1;
        if (arg4 != -75) {
            return;
        }
        int var11 = var8 << 1;
        int var12 = arg0 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg0 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        if (class112.field1386 <= arg1 && class328.field4190 >= arg1) {
            int var20 = class711.method3927(arg3 + arg5, -122, class592.field8242, class108.field1334);
            int var21 = class711.method3927(arg5 - arg3, -116, class592.field8242, class108.field1334);
            class284.method1709(class15.field220[arg1], var20, -8251, var21, arg2);
        }
        int var22 = (arg0 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var19;
                    var13 += var17;
                    var17 += var16;
                    var19 += var16;
                    var6++;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var13 += var17;
                var6++;
                var19 += var16;
                var17 += var16;
            }
            var13 += -var22;
            var14 += -var18;
            var22 -= var15;
            var18 -= var15;
            var7--;
            int var23 = arg1 - var7;
            int var24 = arg1 + var7;
            if (class112.field1386 <= var24 && class328.field4190 >= var23) {
                int var25 = class711.method3927(arg5 + var6, -125, class592.field8242, class108.field1334);
                int var26 = class711.method3927(arg5 - var6, -120, class592.field8242, class108.field1334);
                if (class112.field1386 <= var23) {
                    class284.method1709(class15.field220[var23], var25, -8251, var26, arg2);
                }
                if (var24 <= class328.field4190) {
                    class284.method1709(class15.field220[var24], var25, arg4 - 8176, var26, arg2);
                }
            }
        }
    }
}
