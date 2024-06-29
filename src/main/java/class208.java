import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class208 {

    @OriginalMember(owner = "client!su", name = "a", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!su", name = "b", descriptor = "I")
    public int field2728;

    @OriginalMember(owner = "client!su", name = "c", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!su", name = "d", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!su", name = "e", descriptor = "I")
    public int field2731;

    @OriginalMember(owner = "client!su", name = "f", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!su", name = "g", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!su", name = "i", descriptor = "I")
    private int field2735;

    @OriginalMember(owner = "client!su", name = "j", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!su", name = "k", descriptor = "I")
    public static int field2737;

    @OriginalMember(owner = "client!su", name = "h", descriptor = "Lbw;")
    public class687 field2734;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(I)V")
    public static final void method1272(int arg0) {
        field2727++;
        int var1 = class757.field10521 * 512 + 256;
        int var2 = class582.field8203 * 512 + 256;
        int var3 = class469.method2798(arg0 ^ 0xFFFFFF73, var2, class526.field7430, var1) - class726.field10160;
        if (class438.field6243 < 100) {
            if (class511.field7303 < var1) {
                class511.field7303 += (var1 - class511.field7303) * class438.field6243 / 1000 + class619.field8641;
                if (class511.field7303 > var1) {
                    class511.field7303 = var1;
                }
            }
            if (class155.field2169 < var3) {
                class155.field2169 += (var3 - class155.field2169) * class438.field6243 / 1000 + class619.field8641;
                if (class155.field2169 > var3) {
                    class155.field2169 = var3;
                }
            }
            if (class511.field7303 > var1) {
                class511.field7303 -= (class511.field7303 - var1) * class438.field6243 / 1000 + class619.field8641;
                if (var1 > class511.field7303) {
                    class511.field7303 = var1;
                }
            }
            if (class32.field426 < var2) {
                class32.field426 += (var2 - class32.field426) * class438.field6243 / 1000 + class619.field8641;
                if (class32.field426 > var2) {
                    class32.field426 = var2;
                }
            }
            if (var3 < class155.field2169) {
                class155.field2169 -= (class155.field2169 - var3) * class438.field6243 / 1000 + class619.field8641;
                if (var3 > class155.field2169) {
                    class155.field2169 = var3;
                }
            }
            if (var2 < class32.field426) {
                class32.field426 -= (class32.field426 - var2) * class438.field6243 / 1000 + class619.field8641;
                if (var2 > class32.field426) {
                    class32.field426 = var2;
                }
            }
        } else {
            class511.field7303 = class757.field10521 * 512 + 256;
            class32.field426 = class582.field8203 * 512 + 256;
            class155.field2169 = class469.method2798(121, class32.field426, class526.field7430, class511.field7303) - class726.field10160;
        }
        int var4 = class623.field8674 * 512 - arg0;
        int var5 = class622.field8671 * 512 + 256;
        int var6 = class469.method2798(84, var5, class526.field7430, var4) - class401.field5697;
        int var7 = var4 - class511.field7303;
        int var8 = var6 - class155.field2169;
        int var9 = var5 - class32.field426;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        int var12 = (int) (Math.atan2((double) var7, (double) var9) * -2607.5945876176133D) & 0x3FFF;
        if (var11 < 1024) {
            var11 = 1024;
        }
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (var11 > class187.field2514) {
            class187.field2514 += (var11 - class187.field2514 >> 3) * class291.field4105 / 1000 + class577.field8152 << 3;
            if (var11 < class187.field2514) {
                class187.field2514 = var11;
            }
        }
        if (var11 < class187.field2514) {
            class187.field2514 -= class577.field8152 + ((class187.field2514 - var11 >> 3) * class291.field4105 / 1000) << 3;
            if (var11 > class187.field2514) {
                class187.field2514 = var11;
            }
        }
        int var13 = var12 - class720.field9994;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class720.field9994 += class291.field4105 * var14 / 1000 + class577.field8152 << 3;
            class720.field9994 &= 0x3FFF;
        }
        if (var14 < 0) {
            class720.field9994 -= -var14 * class291.field4105 / 1000 + class577.field8152 << 3;
            class720.field9994 &= 0x3FFF;
        }
        int var15 = var12 - class720.field9994;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class720.field9994 = var12;
        }
        class707.field9813 = 0;
    }

    @OriginalMember(owner = "client!su", name = "b", descriptor = "(I)Ldga;")
    public final synchronized class204 method1273(int arg0) {
        field2737++;
        class204 var2 = (class204) this.field2734.field9394.method4022((long) this.field2735, (byte) 79);
        if (arg0 != 1757380419) {
            return null;
        } else if (var2 == null) {
            class204 var3 = class204.method1237(this.field2734.field9388, this.field2735, 0);
            if (var3 != null) {
                this.field2734.field9394.method4018((byte) 127, var3, (long) this.field2735);
            }
            return var3;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Lee;I)V")
    public final void method1274(class675 arg0, int arg1) {
        if (arg1 != 3) {
            this.field2735 = -58;
        }
        field2736++;
        while (true) {
            int var3 = arg0.method3750((byte) 35);
            if (var3 == 0) {
                return;
            }
            this.method1275(var3, arg1 ^ 0xFFFF83DB, arg0);
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IILee;)V")
    private final void method1275(int arg0, int arg1, class675 arg2) {
        if (arg0 == 1) {
            this.field2735 = arg2.method3757((byte) -65);
        } else if (arg0 == 2) {
            this.field2731 = arg2.method3750((byte) 35);
            this.field2728 = arg2.method3750((byte) 35);
        }
        if (arg1 != -31784) {
            this.field2735 = 101;
        }
        field2729++;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IIZI[BII)Z")
    public static final boolean method1276(int arg0, int arg1, boolean arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        field2733++;
        if (arg2) {
            field2732 = 79;
        }
        int var7 = arg0 % arg6;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg6 - var7;
        }
        int var9 = -((arg1 - (1 - arg6)) / arg6);
        int var10 = -((arg6 + arg0 - 1) / arg6);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg4[arg5] == 0) {
                    return true;
                }
                arg5 += arg6;
            }
            int var13 = arg5 - var8;
            if (arg4[var13 - 1] == 0) {
                return true;
            }
            arg5 = arg3 + var13;
        }
        return false;
    }
}
