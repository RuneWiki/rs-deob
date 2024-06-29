import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class565 extends class243 {

    @OriginalMember(owner = "client!wm", name = "F", descriptor = "[J")
    public static long[] field7977 = new long[10];

    @OriginalMember(owner = "client!wm", name = "D", descriptor = "I")
    public static int field7976;

    @OriginalMember(owner = "client!wm", name = "H", descriptor = "I")
    public static int field7979;

    @OriginalMember(owner = "client!wm", name = "I", descriptor = "I")
    public static int field7980;

    @OriginalMember(owner = "client!wm", name = "J", descriptor = "I")
    public static int field7981;

    @OriginalMember(owner = "client!wm", name = "K", descriptor = "I")
    public static int field7982;

    @OriginalMember(owner = "client!wm", name = "L", descriptor = "I")
    public static int field7983;

    @OriginalMember(owner = "client!wm", name = "G", descriptor = "Lni;")
    public static class522 field7978;

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "(I)V")
    public static void method3180(int arg0) {
        field7977 = null;
        if (arg0 != 0) {
            field7978 = null;
        }
        field7978 = null;
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(II)[[I")
    public final int[][] method2(int arg0, int arg1) {
        ++field7981;
        int[][] var3 = super.field3156.method3306(arg1, 0);
        if (arg0 >= -76) {
            field7978 = null;
        }
        if (super.field3156.field8335) {
            int[][] var4 = this.method1457(arg1, 24431, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class687.field9628 < ~var11; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var9[var11] = -var6[var11] + 4096;
                var10[var11] = -var7[var11] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "()V")
    public class565() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lrl;BII)J")
    public static final long method3181(class722 arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != 113) {
            return 76L;
        } else {
            ++field7976;
            long var4 = 4194304L;
            long var6 = Long.MIN_VALUE;
            class685 var8 = class707.field9894.method4109(arg0.method680(30472), (byte) 119);
            long var9 = (long) (arg0.method686((byte) 20) << 14 | arg3 << 7 | arg2 | arg0.method685(arg1 ^ 4672) << 20 | 1073741824);
            if (var8.field9610 == 0) {
                var9 |= var6;
            }
            if (var8.field9585 == 1) {
                var9 |= var4;
            }
            return var9 | (long) arg0.method680(arg1 ^ 30585) << 32;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(II)[I")
    public final int[] method5(int arg0, int arg1) {
        ++field7979;
        int[] var3 = super.field3164.method3742((byte) 98, arg1);
        if (arg0 != 255) {
            method3181((class722) null, (byte) 69, -45, -45);
        }
        if (super.field3164.field9250) {
            int[] var4 = this.method1462(arg1, 0, 0);
            for (int var5 = 0; ~var5 > ~class687.field9628; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(BLha;IIII)V")
    public static final void method3182(byte arg0, class60 arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7980;
        int var6 = 21 % ((-59 - arg0) / 48);
        class603.field8409 = arg1;
        class527.field7074 = class603.field8409.method454();
        class725.field10127 = class603.field8409.method454();
        class545.field7704 = class603.field8409.method454();
        class381.field5338 = null;
        class648.field9008 = arg5;
        class459.field6352 = arg4;
        class624.field8731 = null;
        class392.field5553 = 0;
        class702.method3957(arg2, arg3, 2);
        class689.field9653 = -1;
        class582.field8158 = -1;
        class581.field8134 = -1;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILji;B)V")
    public final void method1(int arg0, class611 arg1, byte arg2) {
        if (arg2 < -92) {
            ++field7982;
            if (~arg0 == -1) {
                super.field3159 = arg1.method3428((byte) 84) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IB)Ljava/lang/String;")
    public static final String method3183(int arg0, byte arg1) {
        if (arg1 >= -11) {
            return null;
        } else {
            ++field7983;
            return (arg0 >> 24 & 255) + "." + (255 & arg0 >> 16) + "." + (arg0 >> 8 & 255) + "." + (255 & arg0);
        }
    }
}
