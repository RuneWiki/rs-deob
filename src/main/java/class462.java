import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class462 extends class552 implements class624 {

    @OriginalMember(owner = "client!sl", name = "ib", descriptor = "Z")
    private boolean field6355 = false;

    @OriginalMember(owner = "client!sl", name = "J", descriptor = "Ljh;")
    public class161 field6330;

    @OriginalMember(owner = "client!sl", name = "cb", descriptor = "Z")
    private boolean field6349;

    @OriginalMember(owner = "client!sl", name = "O", descriptor = "I")
    public static int field6335 = 0;

    @OriginalMember(owner = "client!sl", name = "S", descriptor = "J")
    public static volatile long field6339 = 0L;

    @OriginalMember(owner = "client!sl", name = "U", descriptor = "I")
    public static int field6341 = 2;

    @OriginalMember(owner = "client!sl", name = "Z", descriptor = "Lufa;")
    public static class681 field6346 = new class681();

    @OriginalMember(owner = "client!sl", name = "mb", descriptor = "[I")
    public static int[] field6359 = new int[5];

    @OriginalMember(owner = "client!sl", name = "lb", descriptor = "Z")
    public static boolean field6358 = false;

    @OriginalMember(owner = "client!sl", name = "I", descriptor = "I")
    public static int field6329;

    @OriginalMember(owner = "client!sl", name = "K", descriptor = "I")
    public static int field6331;

    @OriginalMember(owner = "client!sl", name = "N", descriptor = "I")
    public static int field6334;

    @OriginalMember(owner = "client!sl", name = "P", descriptor = "I")
    public static int field6336;

    @OriginalMember(owner = "client!sl", name = "Q", descriptor = "I")
    public static int field6337;

    @OriginalMember(owner = "client!sl", name = "R", descriptor = "I")
    public static int field6338;

    @OriginalMember(owner = "client!sl", name = "T", descriptor = "I")
    public static int field6340;

    @OriginalMember(owner = "client!sl", name = "V", descriptor = "I")
    public static int field6342;

    @OriginalMember(owner = "client!sl", name = "W", descriptor = "I")
    public static int field6343;

    @OriginalMember(owner = "client!sl", name = "X", descriptor = "I")
    public static int field6344;

    @OriginalMember(owner = "client!sl", name = "Y", descriptor = "I")
    public static int field6345;

    @OriginalMember(owner = "client!sl", name = "ab", descriptor = "I")
    public static int field6347;

    @OriginalMember(owner = "client!sl", name = "bb", descriptor = "I")
    public static int field6348;

    @OriginalMember(owner = "client!sl", name = "db", descriptor = "I")
    public static int field6350;

    @OriginalMember(owner = "client!sl", name = "eb", descriptor = "I")
    public static int field6351;

    @OriginalMember(owner = "client!sl", name = "fb", descriptor = "I")
    public static int field6352;

    @OriginalMember(owner = "client!sl", name = "gb", descriptor = "I")
    public static int field6353;

    @OriginalMember(owner = "client!sl", name = "hb", descriptor = "I")
    public static int field6354;

    @OriginalMember(owner = "client!sl", name = "jb", descriptor = "I")
    public static int field6356;

    @OriginalMember(owner = "client!sl", name = "kb", descriptor = "I")
    public static int field6357;

    @OriginalMember(owner = "client!sl", name = "M", descriptor = "Lwb;")
    public static class334 field6333;

    @OriginalMember(owner = "client!sl", name = "L", descriptor = "Lck;")
    private class642 field6332;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)Z")
    public final boolean method1761(int arg0) {
        ++field6354;
        return arg0 != -28823 ? false : this.field6330.method1151((byte) -128);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Z)V")
    public final void method1754(boolean arg0) {
        ++field6334;
        if (!arg0) {
            this.field6355 = true;
        }
    }

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "(B)I")
    public final int method791(byte arg0) {
        ++field6352;
        if (arg0 < 81) {
            this.method792((class59) null, (byte) 34);
        }
        return this.field6330.method1150(-1);
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(ILha;)Lww;")
    public final class733 method800(int arg0, class59 arg1) {
        ++field6336;
        class475 var3 = this.field6330.method1152(arg1, true, 2048, -21385, false);
        if (var3 == null) {
            return null;
        } else {
            class333 var4 = arg1.method451();
            var4.method1727(super.field3505, super.field3510, super.field3502);
            class733 var5 = class397.method2338(this.field6349, (byte) 120, 1);
            int var6 = super.field3505 >> 9;
            int var7 = super.field3502 >> 9;
            this.field6330.method1160(false, var7, var4, var6, var3, arg1, var6, var7, true);
            if (!class540.field7159) {
                var3.method155(var4, var5.field10150[0], 0);
            } else {
                var3.method160(var4, var5.field10150[0], class100.field1358, 0);
            }
            if (arg0 != -1) {
                return null;
            } else {
                if (this.field6330.field2423 != null) {
                    class388 var8 = this.field6330.field2423.method131();
                    if (class540.field7159) {
                        arg1.method407(var8, class100.field1358);
                    } else {
                        arg1.method508(var8);
                    }
                }
                this.field6355 = var3.method159() || this.field6330.field2423 != null;
                if (this.field6332 != null) {
                    class735.method4107(this.field6332, super.field3510, var3, super.field3502, -101, super.field3505);
                } else {
                    this.field6332 = class549.method3072(super.field3502, super.field3505, super.field3510, 544, var3);
                }
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(B)I")
    public final int method1752(byte arg0) {
        if (arg0 != -111) {
            field6358 = false;
        }
        ++field6353;
        return this.field6330.field2437;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(BLha;)Lck;")
    public final class642 method808(byte arg0, class59 arg1) {
        if (arg0 >= -86) {
            this.method800(-66, (class59) null);
        }
        ++field6345;
        return this.field6332;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(B)I")
    public final int method1759(byte arg0) {
        ++field6337;
        if (arg0 <= 63) {
            field6333 = null;
        }
        return this.field6330.field2404;
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Lha;Lqfa;IIIIIZII)V")
    public class462(class59 arg0, class100 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field1310);
        this.field6330 = new class161(arg0, arg1, 22, arg8, arg2, arg3, this, arg7, arg9);
        this.field6349 = ~arg1.field1363 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "(B)Z")
    public final boolean method806(byte arg0) {
        int var2 = 87 % ((arg0 - 14) / 57);
        ++field6351;
        return false;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ZLha;)V")
    public final void method1756(boolean arg0, class59 arg1) {
        if (arg0) {
            ++field6329;
            this.field6330.method1159((byte) 39, arg1);
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lbk;B)V")
    public final void method2623(class379 arg0, byte arg1) {
        if (arg1 <= -89) {
            this.field6330.method1157(arg0, 0);
            ++field6356;
        }
    }

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "(B)I")
    public final int method1757(byte arg0) {
        int var2 = 4 / ((-57 - arg0) / 53);
        ++field6340;
        return this.field6330.field2405;
    }

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "(I)Z")
    public final boolean method798(int arg0) {
        int var2 = 127 % ((53 - arg0) / 45);
        ++field6344;
        return false;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ILha;)V")
    public final void method1758(int arg0, class59 arg1) {
        if (arg0 != 6120) {
            field6358 = true;
        }
        this.field6330.method1148(arg1, 20087);
        ++field6357;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IB)V")
    public static final void method2624(int arg0, byte arg1) {
        ++field6331;
        int var2 = -34 % ((-76 - arg1) / 44);
        class127 var3 = class760.method4231(arg0, -874792672, 2);
        var3.method1002(-116);
    }

    @OriginalMember(owner = "client!sl", name = "h", descriptor = "(I)I")
    public final int method789(int arg0) {
        if (arg0 != -32768) {
            return 96;
        } else {
            ++field6350;
            return this.field6330.method1154(1);
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lha;B)V")
    public final void method792(class59 arg0, byte arg1) {
        if (arg1 <= 121) {
            method2625(false);
        }
        ++field6348;
        class475 var3 = this.field6330.method1152(arg0, true, 262144, -21385, true);
        if (var3 != null) {
            int var4 = super.field3505 >> 9;
            int var5 = super.field3502 >> 9;
            class333 var6 = arg0.method451();
            var6.method1727(super.field3505, super.field3510, super.field3502);
            this.field6330.method1160(false, var5, var6, var4, var3, arg0, var4, var5, false);
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lha;IIB)Z")
    public final boolean method790(class59 arg0, int arg1, int arg2, byte arg3) {
        ++field6343;
        if (arg3 != 103) {
            field6341 = 60;
        }
        class475 var5 = this.field6330.method1152(arg0, false, 131072, -21385, false);
        if (var5 == null) {
            return false;
        } else {
            class333 var6 = arg0.method451();
            var6.method1727(super.field3505, super.field3510, super.field3502);
            return !class540.field7159 ? var5.method158(arg2, arg1, var6, false, 0) : var5.method203(arg2, arg1, var6, false, 0, class100.field1358);
        }
    }

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "(Z)V")
    public static void method2625(boolean arg0) {
        field6333 = null;
        if (arg0) {
            field6346 = null;
        }
        field6346 = null;
        field6359 = null;
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(Z)Z")
    public final boolean method801(boolean arg0) {
        ++field6347;
        if (arg0) {
            this.field6332 = null;
        }
        return this.field6355;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lkf;Lha;IIIZI)V")
    public final void method807(class256 arg0, class59 arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        ++field6338;
        if (arg3 < 109) {
            field6341 = 48;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "(I)V")
    public final void method803(int arg0) {
        if (arg0 == 131072) {
            ++field6342;
            throw new IllegalStateException();
        }
    }
}
