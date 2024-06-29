import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class218 extends class197 implements class115 {

    @OriginalMember(owner = "client!uk", name = "P", descriptor = "S")
    private short field3127;

    @OriginalMember(owner = "client!uk", name = "p", descriptor = "Z")
    private boolean field3102;

    @OriginalMember(owner = "client!uk", name = "I", descriptor = "Z")
    private boolean field3120;

    @OriginalMember(owner = "client!uk", name = "y", descriptor = "Z")
    private boolean field3111;

    @OriginalMember(owner = "client!uk", name = "q", descriptor = "B")
    private byte field3103;

    @OriginalMember(owner = "client!uk", name = "M", descriptor = "B")
    private byte field3124;

    @OriginalMember(owner = "client!uk", name = "x", descriptor = "Z")
    private boolean field3110;

    @OriginalMember(owner = "client!uk", name = "B", descriptor = "Lr;")
    private class157 field3114;

    @OriginalMember(owner = "client!uk", name = "D", descriptor = "Lk;")
    private class485 field3116;

    @OriginalMember(owner = "client!uk", name = "m", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!uk", name = "n", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!uk", name = "o", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!uk", name = "r", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!uk", name = "t", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!uk", name = "u", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!uk", name = "w", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!uk", name = "z", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!uk", name = "A", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!uk", name = "C", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!uk", name = "E", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!uk", name = "F", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!uk", name = "G", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!uk", name = "J", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!uk", name = "K", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!uk", name = "L", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!uk", name = "O", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!uk", name = "Q", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!uk", name = "S", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!uk", name = "s", descriptor = "Lkb;")
    public static class592 field3105;

    @OriginalMember(owner = "client!uk", name = "R", descriptor = "Lnk;")
    private class611 field3129;

    @OriginalMember(owner = "client!uk", name = "N", descriptor = "[I")
    public static int[] field3125;

    @OriginalMember(owner = "client!uk", name = "v", descriptor = "[Lmc;")
    public static class114[] field3108;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)Z")
    public final boolean method747(int arg0) {
        if (arg0 != -23611) {
            this.method264(26);
        }
        ++field3106;
        return this.field3110;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZLqa;II)Lgm;")
    private final class105 method1406(boolean arg0, class207 arg1, int arg2, int arg3) {
        ++field3100;
        class364 var5 = class18.field227.method1201((byte) 107, 65535 & this.field3127);
        class174 var6;
        class174 var7;
        if (!this.field3102) {
            if (~this.field3124 <= -4) {
                var6 = null;
            } else {
                var6 = class608.field8767[this.field3124 - -1];
            }
            var7 = class608.field8767[this.field3124];
        } else {
            var6 = class608.field8767[0];
            var7 = client.field3472[this.field3124];
        }
        if (arg3 <= 21) {
            this.method746((byte) 2, (class207) null);
        }
        return var5.method2176(22, arg1, super.field2794, var7, this.field3103, arg0, super.field2791, var6, -333, super.field2799, arg2);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILqa;)V")
    public final void method751(int arg0, class207 arg1) {
        if (arg0 > 0) {
            field3105 = null;
        }
        ++field3107;
        Object var3 = null;
        class485 var5;
        if (this.field3116 == null && this.field3110) {
            class105 var4 = this.method1406(true, arg1, 262144, 23);
            var5 = var4 == null ? null : var4.field1585;
        } else {
            var5 = this.field3116;
            this.field3116 = null;
        }
        if (var5 != null) {
            class294.method1888(var5, this.field3124, super.field2794, super.field2791, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(BLqa;I)Lr;")
    private final class157 method1407(byte arg0, class207 arg1, int arg2) {
        ++field3126;
        if (this.field3114 != null && ~arg1.method1357(this.field3114.method166(), arg2) == -1) {
            return this.field3114;
        } else {
            if (arg0 != -73) {
                this.method490(false, (class207) null);
            }
            class105 var4 = this.method1406(false, arg1, arg2, 44);
            return var4 == null ? null : var4.field1580;
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)I")
    public final int method749(int arg0) {
        ++field3121;
        return arg0 != 24194 ? -47 : this.field3103;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIII)V")
    public static final void method1408(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3099;
        int var5 = -80 % ((2 - arg0) / 53);
        if (-arg3 + arg4 >= class326.field4387 && ~(arg3 + arg4) >= ~class596.field8621 && ~class264.field3687 >= ~(-arg3 + arg2) && ~class591.field8435 <= ~(arg2 - -arg3)) {
            class538.method3090((byte) -84, arg1, arg2, arg4, arg3);
        } else {
            class565.method3218(1247, arg4, arg2, arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lqa;III)Z")
    public final boolean method488(class207 arg0, int arg1, int arg2, int arg3) {
        ++field3119;
        if (arg3 != 1) {
            return true;
        } else {
            class157 var5 = this.method1407((byte) -73, arg0, 131072);
            if (var5 != null) {
                class163 var6 = arg0.method1344();
                var6.method1054(super.field2794, super.field2799, super.field2791);
                return var5.method143(arg1, arg2, var6, false);
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(BLqa;)V")
    public final void method746(byte arg0, class207 arg1) {
        ++field3128;
        Object var3 = null;
        class485 var5;
        if (this.field3116 == null && this.field3110) {
            class105 var4 = this.method1406(true, arg1, 262144, 73);
            var5 = var4 == null ? null : var4.field1585;
        } else {
            var5 = this.field3116;
            this.field3116 = null;
        }
        if (arg0 >= -50) {
            this.method750(-13);
        }
        if (var5 != null) {
            class104.method734(var5, this.field3124, super.field2794, super.field2791, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lqa;Lss;IIIIZIZ)V")
    public class218(class207 arg0, class364 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        super(arg3, arg4, arg5, arg1.field4883, arg1.field4954, arg1.field4912);
        super.field2794 = arg3;
        this.field3127 = (short) arg1.field4944;
        this.field3102 = arg6;
        this.field3120 = arg8;
        this.field3111 = ~arg1.field4881 != -1 && !arg6;
        this.field3103 = (byte) arg7;
        this.field3124 = (byte) arg2;
        super.field2791 = arg5;
        this.field3110 = arg0.method1345() && arg1.field4913 && !this.field3102 && ~class491.field6875.method1507(class103.field1570, (byte) 37) != -1;
        int var10 = 2048;
        if (this.field3120) {
            var10 |= 65536;
        }
        class105 var11 = this.method1406(this.field3110, arg0, var10, 105);
        if (var11 != null) {
            this.field3114 = var11.field1580;
            this.field3116 = var11.field1585;
            if (this.field3120) {
                this.field3114 = this.field3114.method163((byte) 0, var10, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "(I)Z")
    public final boolean method264(int arg0) {
        if (arg0 != 1) {
            method1409((class508) null, -43, -83, 126, -123, 99);
        }
        ++field3109;
        return this.field3120;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lvs;IIIII)V")
    public static final void method1409(class508 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field7093 = 0;
        label58: for (int var6 = arg2; var6 <= arg4; ++var6) {
            label56: for (int var7 = arg3; var7 <= arg5; ++var7) {
                long var8 = class217.field3091[arg1][var6][var7];
                long var10 = 0L;
                while (true) {
                    label51: while (true) {
                        if (var10 > 48L) {
                            continue label56;
                        }
                        int var12 = (int) (var8 >>> (int) var10 & 65535L);
                        if (var12 <= 0) {
                            continue label56;
                        }
                        class579 var13 = class363.field4863[var12 - 1];
                        for (int var14 = 0; var14 < arg0.field7093; ++var14) {
                            if (arg0.field7100[var14] == var13.field7959) {
                                var10 += 16L;
                                continue label51;
                            }
                        }
                        arg0.field7100[arg0.field7093++] = var13.field7959;
                        if (arg0.field7093 == 4) {
                            break label58;
                        }
                        var10 += 16L;
                    }
                }
            }
        }
        for (int var15 = arg0.field7093; var15 < 4; ++var15) {
            arg0.field7100[var15] = null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "(I)V")
    public final void method262(int arg0) {
        ++field3112;
        this.field3120 = false;
        if (this.field3114 != null) {
            this.field3114.method138(this.field3114.method166() & -65537);
        }
        if (arg0 != 1) {
            this.method1407((byte) -114, (class207) null, 22);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZLqa;)Lnk;")
    public final class611 method490(boolean arg0, class207 arg1) {
        ++field3123;
        if (arg0) {
            this.field3116 = null;
        }
        if (this.field3129 == null) {
            this.field3129 = class563.method3213(super.field2799, this.method1407((byte) -73, arg1, 0), super.field2794, super.field2791, true);
        }
        return this.field3129;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lqa;B)V")
    public final void method487(class207 arg0, byte arg1) {
        if (arg1 == 21) {
            ++field3118;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IZIILjt;ILqa;)V")
    public final void method258(int arg0, boolean arg1, int arg2, int arg3, class87 arg4, int arg5, class207 arg6) {
        if (arg2 <= 79) {
            this.method746((byte) 95, (class207) null);
        }
        ++field3115;
        if (arg4 instanceof class218) {
            class218 var8 = (class218) arg4;
            if (this.field3114 != null && var8.field3114 != null) {
                this.field3114.method147(var8.field3114, arg5, arg3, arg0, arg1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(B)V")
    public static void method1410(byte arg0) {
        field3125 = null;
        if (arg0 != -125) {
            method1408(126, 28, -102, 116, -127);
        }
        field3108 = null;
        field3105 = null;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V")
    public final void method750(int arg0) {
        if (arg0 <= 88) {
            field3105 = null;
        }
        ++field3101;
        if (this.field3114 != null) {
            this.field3114.method156();
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(ZLqa;)Lvw;")
    public final class254 method483(boolean arg0, class207 arg1) {
        ++field3122;
        if (this.field3114 == null) {
            return null;
        } else if (!arg0) {
            return null;
        } else {
            class163 var3 = arg1.method1344();
            var3.method1054(super.field2794, super.field2799, super.field2791);
            class254 var4 = null;
            if (this.field3111) {
                var4 = class110.method772(1, 1);
            }
            this.field3114.method154(var3, var4 != null ? var4.field3525[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Z)I")
    public final int method748(boolean arg0) {
        if (arg0) {
            this.method752(true);
        }
        ++field3104;
        return this.field3127 & 65535;
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(Z)I")
    public final int method752(boolean arg0) {
        ++field3117;
        if (!arg0) {
            this.field3103 = -51;
        }
        return 22;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZI)Lfh;")
    public static final class560 method1411(boolean arg0, int arg1) {
        ++field3130;
        class560 var2 = (class560) class8.field95.method1880((byte) 123, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class49.field960.method240(arg1, 0, (byte) -124);
            if (!arg0) {
                field3105 = null;
            }
            if (var3 != null && var3.length > 1) {
                class560 var4 = class491.method2850(-32598, var3);
                class8.field95.method1882((long) arg1, var4, -3028);
                return var4;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(BLqa;I)Lr;")
    public final class157 method744(byte arg0, class207 arg1, int arg2) {
        int var4 = -41 / ((arg0 - -54) / 60);
        ++field3113;
        return this.method1407((byte) -73, arg1, arg2);
    }
}
