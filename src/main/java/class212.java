import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public class class212 {

    @OriginalMember(owner = "client!vv", name = "g", descriptor = "Lff;")
    public static class9 field2886 = new class9(75, 8);

    @OriginalMember(owner = "client!vv", name = "k", descriptor = "[S")
    public static short[] field2890 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "I")
    public int field2880;

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "I")
    public int field2881;

    @OriginalMember(owner = "client!vv", name = "c", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!vv", name = "d", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!vv", name = "e", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!vv", name = "f", descriptor = "I")
    public int field2885;

    @OriginalMember(owner = "client!vv", name = "h", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!vv", name = "i", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!vv", name = "j", descriptor = "Z")
    public boolean field2889;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(Lbi;IIIII)V", line = 3)
    public static final void method1339(class334 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field4383 = 0;
        for (int var6 = 0; var6 < 4; var6++) {
            if (arg0.field4380[var6] != null) {
                arg0.field4383++;
            }
        }
        label50: for (int var7 = 0; var7 < arg0.field4383; var7++) {
            long var8 = class203.field2818[arg1][arg2][arg3];
            while (var8 != 0L) {
                class360 var14 = class37.field586[(int) ((var8 & 0xFFFFL) - 1L)];
                var8 >>>= 0x10;
                if (arg0.field4380[var7] == var14.field4867) {
                    continue label50;
                }
            }
            long var10 = class203.field2818[arg1][arg4][arg5];
            while (var10 != 0L) {
                class360 var13 = class37.field586[(int) ((var10 & 0xFFFFL) - 1L)];
                var10 >>>= 0x10;
                if (arg0.field4380[var7] == var13.field4867) {
                    continue label50;
                }
            }
            for (int var12 = var7; var12 < arg0.field4383 - 1; var12++) {
                arg0.field4380[var12] = arg0.field4380[var12 + 1];
            }
            arg0.field4383--;
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(I)V", line = 58)
    public static void method1340(int arg0) {
        field2886 = null;
        field2890 = null;
        int var1 = 0 % ((6 - arg0) / 37);
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(B)V", line = 74)
    public static final void method1341(byte arg0) {
        field2887++;
        try {
            if (arg0 > -33) {
                method1340(-26);
            }
            if (class342.field4520 == 1) {
                int var1 = class399.field5369.method1950(-47);
                if (var1 > 0 && class399.field5369.method1960(-11366)) {
                    int var2 = var1 - class108.field1575;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class399.field5369.method1932((byte) 127, var2);
                } else {
                    class399.field5369.method1951((byte) 103);
                    class399.field5369.method1959((byte) 100);
                    class20.field331 = null;
                    if (class60.field943 == null) {
                        class342.field4520 = 0;
                    } else {
                        class342.field4520 = 2;
                    }
                    class387.field5263 = null;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class399.field5369.method1951((byte) 113);
            class60.field943 = null;
            class387.field5263 = null;
            class20.field331 = null;
            class342.field4520 = 0;
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(Lpc;ILjb;Lpc;Lpc;)Z", line = 120)
    public static final boolean method1342(class473 arg0, int arg1, class340 arg2, class473 arg3, class473 arg4) {
        class378.field5113 = arg3;
        class406.field5586 = arg4;
        field2883++;
        class120.field1752 = arg0;
        if (arg1 != 8741) {
            field2888 = -5;
        }
        class399.field5369 = arg2;
        return true;
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(II)I", line = 140)
    public static final int method1343(int arg0, int arg1) {
        field2884++;
        if (class304.field4004 != null) {
            class304.field4004.method1886(-1);
            class304.field4004 = null;
        }
        class309.field4069++;
        if (class309.field4069 > 4) {
            class290.field3802 = 0;
            class309.field4069 = 0;
            return arg1;
        }
        if (class231.field3112 == class203.field2817) {
            class231.field3112 = class330.field4351;
        } else {
            class231.field3112 = class203.field2817;
        }
        class290.field3802 = arg0;
        return -1;
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "([[II)V", line = 179)
    public static final void method1344(int[][] arg0, int arg1) {
        class457.field6299 = arg0;
        field2882++;
        if (arg1 != 1) {
            method1342(null, 17, null, null, null);
        }
    }
}
