import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class15 {

    @OriginalMember(owner = "client!ae", name = "C", descriptor = "I")
    public int field177 = -1;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "[Luf;")
    public static class168[] field162 = new class168[200];

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "Luf;")
    public static class168 field161 = class148.method1019(-1720, "sl_arrows");

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "Luf;")
    public static class168 field169 = class148.method1019(-1720, "loginscreen");

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "I")
    public static int field167 = 7759444;

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "Luf;")
    private static class168 field168 = class148.method1019(-1720, "Hidden");

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "Luf;")
    public static class168 field174 = field168;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "F")
    public static float field149;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public int field150;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public int field151;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public int field152;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public int field153;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    public int field156;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
    public int field157;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
    public int field158;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!ae", name = "w", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!ae", name = "x", descriptor = "I")
    public int field172;

    @OriginalMember(owner = "client!ae", name = "y", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!ae", name = "A", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!ae", name = "B", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!ae", name = "D", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "Lrk;")
    public static class195 field170;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "Lg;")
    public static class242 field163;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)V", line = 8)
    public static final void method57(int arg0, int arg1) {
        class256.field4359.method1428(arg1, 29946);
        field175++;
        class291.field4883.method1428(arg1, 29946);
        if (arg0 != 4) {
            field168 = (class168) null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V", line = 33)
    public static void method58(int arg0) {
        field163 = null;
        if (arg0 != 1) {
            method61(59, 31, -3);
        }
        field174 = null;
        field168 = null;
        field170 = null;
        field161 = null;
        field162 = null;
        field169 = null;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(II)Lid;", line = 49)
    public static final class102 method59(int arg0, int arg1) {
        if (arg0 != 10294) {
            method66(-44, (long[]) null, (Object[]) null);
        }
        class102 var2 = (class102) class71.field956.method1424((long) arg1, (byte) 105);
        field165++;
        if (var2 != null) {
            return var2;
        }
        class102 var3 = class55.method309(0, arg1, false, class52.field643, class52.field638);
        if (var3 != null) {
            class71.field956.method1430(var3, (long) arg1, arg0 ^ 0x1C99);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZI)I", line = 70)
    public static final int method60(boolean arg0, int arg1) {
        field155++;
        int var2 = 0;
        if (arg0) {
            field170 = (class195) null;
        }
        if (arg1 < 0 || arg1 >= 65536) {
            var2 += 16;
            arg1 >>>= 0x10;
        }
        if (arg1 >= 256) {
            var2 += 8;
            arg1 >>>= 0x8;
        }
        if (arg1 >= 16) {
            arg1 >>>= 0x4;
            var2 += 4;
        }
        if (arg1 >= 4) {
            arg1 >>>= 0x2;
            var2 += 2;
        }
        if (arg1 >= 1) {
            arg1 >>>= 0x1;
            var2++;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)I", line = 117)
    public static final int method61(int arg0, int arg1, int arg2) {
        if (arg0 >= -65) {
            field161 = (class168) null;
        }
        field178++;
        int var3 = (class241.method1631(arg2 + 91923, arg1 + 45365, (byte) -82, 4) + (class241.method1631(arg2 + 37821, arg1 + 10294, (byte) -82, 2) - 128 >> 1) + (class241.method1631(arg2, arg1, (byte) -82, 1) - 128 >> 2)) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IILg;I)V", line = 161)
    public static final void method62(int arg0, int arg1, class242 arg2, int arg3) {
        field159++;
        if (arg2.field4111 == 0) {
            arg2.field4108 = arg2.field4094;
        } else if (arg2.field4111 == 1) {
            arg2.field4108 = (arg0 - arg2.field4057) / 2 + arg2.field4094;
        } else if (arg2.field4111 == 2) {
            arg2.field4108 = arg0 - arg2.field4057 - arg2.field4094;
        } else if (arg2.field4111 == 3) {
            arg2.field4108 = arg2.field4094 * arg0 >> 14;
        } else if (arg2.field4111 == 4) {
            arg2.field4108 = (arg2.field4094 * arg0 >> 14) + (arg0 - arg2.field4057) / 2;
        } else {
            arg2.field4108 = arg0 - (arg2.field4094 * arg0 >> 14) - arg2.field4057;
        }
        if (~arg2.field4069 == arg1) {
            arg2.field3988 = arg2.field4031;
        } else if (arg2.field4069 == 1) {
            arg2.field3988 = (arg3 - arg2.field3989) / 2 + arg2.field4031;
        } else if (arg2.field4069 == 2) {
            arg2.field3988 = arg3 - arg2.field3989 - arg2.field4031;
        } else if (arg2.field4069 == 3) {
            arg2.field3988 = arg2.field4031 * arg3 >> 14;
        } else if (arg2.field4069 == 4) {
            arg2.field3988 = (arg2.field4031 * arg3 >> 14) + (arg3 - arg2.field3989) / 2;
        } else {
            arg2.field3988 = arg3 - (arg2.field4031 * arg3 >> 14) - arg2.field3989;
        }
        if (!class245.field4165 || !(client.method2015(arg2) != 0 || arg2.field4073 == 0)) {
            return;
        }
        if (arg2.field3988 < 0) {
            arg2.field3988 = 0;
        } else if (arg3 < (arg2.field3989 + arg2.field3988)) {
            arg2.field3988 = arg3 - arg2.field3989;
        }
        if (arg2.field4108 < 0) {
            arg2.field4108 = 0;
        } else if (arg2.field4108 + arg2.field4057 > arg0) {
            arg2.field4108 = arg0 - arg2.field4057;
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)V", line = 229)
    public static final void method63(int arg0) {
        field160++;
        int[] var1 = new int[class101.field1572];
        int var2 = 0;
        if (arg0 != 21698) {
            return;
        }
        for (int var3 = 0; var3 < class101.field1572; var3++) {
            class238 var4 = class284.method1963((byte) 110, var3);
            if (var4.field3805 >= 0 || var4.field3815 >= 0) {
                var1[var2++] = var3;
            }
        }
        class139.field2144 = new int[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            class139.field2144[var5] = var1[var5];
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZ)Ljg;", line = 269)
    public static final class161 method64(int arg0, boolean arg1) {
        field176++;
        class161 var2 = (class161) class91.field1395.method1424((long) arg0, (byte) 103);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class99.field1550.method1647(class139.method958(arg0, 1242436072), (byte) 121, class28.method147(255, arg0));
        class161 var4 = new class161();
        var4.field2579 = arg0;
        if (arg1) {
            method62(53, -65, (class242) null, -63);
        }
        if (var3 != null) {
            var4.method1129(new class153(var3), -123);
        }
        var4.method1137((byte) -116);
        if (!class25.field299 && var4.field2587) {
            var4.field2591 = null;
        }
        if (var4.field2567) {
            var4.field2568 = false;
            var4.field2571 = 0;
        }
        class91.field1395.method1430(var4, (long) arg0, 13487);
        return var4;
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)V", line = 306)
    public static final void method65(int arg0) {
        class121.field1883 = null;
        if (arg0 > -97) {
            method65(-76);
        }
        class44.field535 = null;
        field173++;
        class38.field472 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I[J[Ljava/lang/Object;)V", line = 335)
    public static final void method66(int arg0, long[] arg1, Object[] arg2) {
        field166++;
        class61.method342(arg2, arg1, 0, arg0 - 2, arg1.length + -1);
        if (arg0 != 4) {
            field168 = (class168) null;
        }
    }
}
