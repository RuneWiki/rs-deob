import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class207 extends class115 {

    @OriginalMember(owner = "client!ck", name = "W", descriptor = "I")
    private int field3004 = 32768;

    @OriginalMember(owner = "client!ck", name = "P", descriptor = "Z")
    public static boolean field2997 = false;

    @OriginalMember(owner = "client!ck", name = "U", descriptor = "Ljava/lang/String;")
    public static String field3002 = null;

    @OriginalMember(owner = "client!ck", name = "M", descriptor = "[S")
    public static short[] field2994 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!ck", name = "J", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!ck", name = "K", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!ck", name = "L", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!ck", name = "N", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!ck", name = "O", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!ck", name = "Q", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!ck", name = "R", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!ck", name = "S", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!ck", name = "T", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!ck", name = "V", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(II)[[I")
    public final int[][] method235(int arg0, int arg1) {
        ++field2999;
        int[][] var3 = super.field1716.method6(arg1, (byte) 11);
        if (super.field1716.field23) {
            int[] var4 = this.method797(1, arg1, 116);
            int[] var5 = this.method797(2, arg1, 105);
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            int[] var8 = var3[0];
            for (int var9 = 0; class77.field1178 > var9; ++var9) {
                int var10 = 255 & var4[var9] * 255 >> 12;
                int var11 = var5[var9] * this.field3004 >> 12;
                int var12 = class124.field1788[var10] * var11 >> 12;
                int var13 = class32.field471[var10] * var11 >> 12;
                int var14 = (var12 >> 12) + var9 & field2992;
                int var15 = arg1 - -(var13 >> 12) & class5.field136;
                int[][] var16 = this.method798(0, 0, var15);
                var8[var9] = var16[0][var14];
                var6[var9] = var16[1][var14];
                var7[var9] = var16[2][var14];
            }
        }
        if (arg0 >= -33) {
            field3002 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "(B)V")
    public static void method1333(byte arg0) {
        field2994 = null;
        field3002 = null;
        if (arg0 > -97) {
            field2992 = 109;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(BJ)Ljava/lang/String;")
    public static final String method1334(byte arg0, long arg1) {
        class103.field1534.setTime(new Date(arg1));
        ++field2998;
        int var3 = class103.field1534.get(7);
        int var4 = class103.field1534.get(5);
        int var5 = class103.field1534.get(2);
        if (arg0 != 93) {
            field2994 = null;
        }
        int var6 = class103.field1534.get(1);
        int var7 = class103.field1534.get(11);
        int var8 = class103.field1534.get(12);
        int var9 = class103.field1534.get(13);
        return class203.field2945[var3 + -1] + ", " + var4 / 10 + var4 % 10 + "-" + class192.field2751[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(B)V")
    public final void method170(byte arg0) {
        class276.method1856((byte) 48);
        int var2 = 127 / ((arg0 - 78) / 42);
        ++field2993;
    }

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "(II)[I")
    public final int[] method116(int arg0, int arg1) {
        if (arg0 != 242152972) {
            this.method235(52, -112);
        }
        ++field3001;
        int[] var3 = super.field1705.method463(arg1, false);
        if (super.field1705.field1072) {
            int[] var4 = this.method797(1, arg1, -104);
            int[] var5 = this.method797(2, arg1, 125);
            for (int var6 = 0; ~var6 > ~class77.field1178; ++var6) {
                int var7 = (var4[var6] & 4089) >> 4;
                int var8 = var5[var6] * this.field3004 >> 12;
                int var9 = class32.field471[var7] * var8 >> 12;
                int var10 = class124.field1788[var7] * var8 >> 12;
                int var11 = (var9 >> 12) + arg1 & class5.field136;
                int var12 = field2992 & (var10 >> 12) + var6;
                int[] var13 = this.method797(0, var11, arg0 + -242153062);
                var3[var6] = var13[var12];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILkl;I)V")
    public final void method168(int arg0, class114 arg1, int arg2) {
        if (arg0 != -1) {
            field3002 = null;
        }
        if (arg2 != 0) {
            if (arg2 == 1) {
                super.field1713 = arg1.method760(false) == 1;
            }
        } else {
            this.field3004 = arg1.method756(arg0 + -29900) << 4;
        }
        ++field3003;
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "()V")
    public class207() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(IIII)I")
    public static final int method1335(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 3;
        ++field2996;
        if (arg2 == var4) {
            return arg0;
        } else if (var4 == 1) {
            return arg1;
        } else {
            return ~var4 == -3 ? -arg0 + 7 : -arg1 + 7;
        }
    }

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "(II)I")
    public static final int method1336(int arg0, int arg1) {
        ++field3000;
        if (arg0 >= -20) {
            field2997 = true;
        }
        return arg1 >>> 10;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIII)V")
    public static final void method1337(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 101 / ((24 - arg1) / 45);
        ++field2991;
        if (arg0 == arg2) {
            class55.method374(arg4, arg3, arg5, false, arg0);
        } else if (~class93.field1412 >= ~(-arg0 + arg5) && class142.field2061 >= arg0 + arg5 && class93.field1418 <= arg4 - arg2 && class254.field3857 >= arg2 + arg4) {
            class25.method184(arg0, arg2, -18357, arg4, arg5, arg3);
        } else {
            class146.method981(arg0, arg4, arg3, arg5, (byte) 104, arg2);
        }
    }
}
