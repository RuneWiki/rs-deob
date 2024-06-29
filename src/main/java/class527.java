import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nha")
public class class527 extends class392 {

    @OriginalMember(owner = "client!nha", name = "k", descriptor = "Lsaa;")
    public static class657 field7355 = new class657();

    @OriginalMember(owner = "client!nha", name = "o", descriptor = "[I")
    public static int[] field7359 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!nha", name = "u", descriptor = "Lin;")
    public static class380 field7365 = new class380(22, -2);

    @OriginalMember(owner = "client!nha", name = "g", descriptor = "I")
    public static int field7351;

    @OriginalMember(owner = "client!nha", name = "h", descriptor = "I")
    public static int field7352;

    @OriginalMember(owner = "client!nha", name = "i", descriptor = "I")
    public static int field7353;

    @OriginalMember(owner = "client!nha", name = "j", descriptor = "I")
    public static int field7354;

    @OriginalMember(owner = "client!nha", name = "l", descriptor = "I")
    public static int field7356;

    @OriginalMember(owner = "client!nha", name = "m", descriptor = "I")
    public static int field7357;

    @OriginalMember(owner = "client!nha", name = "n", descriptor = "I")
    public static int field7358;

    @OriginalMember(owner = "client!nha", name = "p", descriptor = "I")
    public static int field7360;

    @OriginalMember(owner = "client!nha", name = "r", descriptor = "I")
    public static int field7362;

    @OriginalMember(owner = "client!nha", name = "s", descriptor = "I")
    public static int field7363;

    @OriginalMember(owner = "client!nha", name = "t", descriptor = "I")
    public static int field7364;

    @OriginalMember(owner = "client!nha", name = "v", descriptor = "I")
    public static int field7366;

    @OriginalMember(owner = "client!nha", name = "q", descriptor = "[I")
    public static int[] field7361;

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(Lea;I)V", line = 4)
    public static final void method3078(class21 arg0, int arg1) {
        ++field7357;
        class421 var2 = (class421) class221.field3243.method4253((long) arg0.field4051, -1);
        if (var2 != null) {
            var2.method2485(-84);
        } else {
            class616.method3542((class506) null, arg0, 0, arg0.field4136[0], (class416) null, (byte) 127, arg0.field10361, arg0.field4142[0]);
        }
        if (arg1 != 0) {
            field7359 = null;
        }
    }

    @OriginalMember(owner = "client!nha", name = "b", descriptor = "(II)I", line = 23)
    public final int method290(int arg0, int arg1) {
        ++field7366;
        if (arg1 >= -124) {
            return 0;
        } else if (super.field5454.method3775(-70) == class448.field6175) {
            if (super.field5454.method3782((byte) -42)) {
                return 3;
            } else {
                return arg0 != 0 && ~super.field5454.field9454.method4010(17539) != -2 ? 2 : 1;
            }
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!nha", name = "b", descriptor = "(Z)V", line = 49)
    public final void method291(boolean arg0) {
        if (super.field5454.method3775(-73) != class448.field6175) {
            super.field5452 = 1;
        } else if (super.field5454.method3782((byte) -26)) {
            super.field5452 = 0;
        }
        ++field7360;
        if (~super.field5452 != -1 && ~super.field5452 != -2) {
            super.field5452 = this.method292(true);
        }
        if (arg0) {
            method3084(10, 89, 112);
        }
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(BI)V", line = 70)
    public final void method286(byte arg0, int arg1) {
        ++field7362;
        int var3 = -113 % ((-80 - arg0) / 38);
        super.field5452 = arg1;
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(Z)I", line = 82)
    public final int method292(boolean arg0) {
        if (!arg0) {
            this.method3082(-2);
        }
        ++field7363;
        return 1;
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(B)V", line = 93)
    public static void method3079(byte arg0) {
        field7365 = null;
        field7361 = null;
        field7355 = null;
        field7359 = null;
        if (arg0 != -7) {
            method3078((class21) null, -38);
        }
    }

    @OriginalMember(owner = "client!nha", name = "b", descriptor = "(I)V", line = 107)
    public static final void method3080(int arg0) {
        ++field7352;
        if (class373.field5243 == 5) {
            class373.field5243 = 6;
            if (arg0 != -16978) {
                method3083(104, -19, 116);
            }
        }
    }

    @OriginalMember(owner = "client!nha", name = "c", descriptor = "(I)I", line = 122)
    public final int method3081(int arg0) {
        ++field7356;
        if (arg0 != 17539) {
            field7361 = null;
        }
        return super.field5452;
    }

    @OriginalMember(owner = "client!nha", name = "<init>", descriptor = "(ILw;)V", line = 133)
    public class527(int arg0, class675 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!nha", name = "<init>", descriptor = "(Lw;)V", line = 140)
    public class527(class675 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!nha", name = "d", descriptor = "(I)Z", line = 145)
    public final boolean method3082(int arg0) {
        ++field7354;
        if (super.field5454.method3775(-100) == class448.field6175) {
            return !super.field5454.method3782((byte) 108);
        } else {
            return arg0 != 0;
        }
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(III)I", line = 167)
    public static final int method3083(int arg0, int arg1, int arg2) {
        ++field7364;
        if (arg2 < arg1) {
            int var3 = arg2;
            arg2 = arg1;
            arg1 = var3;
        }
        while (~arg1 != -1) {
            int var4 = arg2 % arg1;
            arg2 = arg1;
            arg1 = var4;
        }
        return arg0 != -1 ? -127 : arg2;
    }

    @OriginalMember(owner = "client!nha", name = "b", descriptor = "(III)Z", line = 200)
    public static final boolean method3084(int arg0, int arg1, int arg2) {
        if (arg1 != 5616) {
            return false;
        } else {
            ++field7358;
            return ~(arg0 & 2048) != -1;
        }
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(IZI)Luh;", line = 211)
    public static final class162 method3085(int arg0, boolean arg1, int arg2) {
        ++field7351;
        class271[] var3 = class648.field9193;
        synchronized (class648.field9193) {
            if (arg2 != 0) {
                return null;
            } else {
                class162 var5;
                if (arg0 < class648.field9193.length && !class648.field9193[arg0].method1733(-11523)) {
                    var5 = (class162) class648.field9193[arg0].method1728(-117);
                    var5.method781(5555);
                    int var10002 = class697.field9797[arg0]--;
                } else {
                    var5 = new class162();
                    var5.field2500 = new class749[arg0];
                    for (int var6 = 0; arg0 > var6; ++var6) {
                        var5.field2500[var6] = new class749();
                    }
                }
                var5.field2497 = arg1;
                return var5;
            }
        }
    }
}
