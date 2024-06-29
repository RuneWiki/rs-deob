import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class111 extends class5 {

    @OriginalMember(owner = "client!uk", name = "v", descriptor = "[[B")
    public static byte[][] field1671 = new byte[250][];

    @OriginalMember(owner = "client!uk", name = "A", descriptor = "I")
    public static int field1676 = 20;

    @OriginalMember(owner = "client!uk", name = "H", descriptor = "I")
    public static int field1683 = 0;

    @OriginalMember(owner = "client!uk", name = "x", descriptor = "I")
    public static int field1673 = 0;

    @OriginalMember(owner = "client!uk", name = "G", descriptor = "[S")
    public static short[] field1682 = new short[] { 28, 15, 36, 3, 41, 46, 35, 17 };

    @OriginalMember(owner = "client!uk", name = "u", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!uk", name = "w", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!uk", name = "B", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!uk", name = "E", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!uk", name = "F", descriptor = "I")
    public int field1681;

    @OriginalMember(owner = "client!uk", name = "I", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!uk", name = "J", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!uk", name = "M", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!uk", name = "N", descriptor = "I")
    public int field1688;

    @OriginalMember(owner = "client!uk", name = "O", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!uk", name = "D", descriptor = "Ljn;")
    public static class327 field1679;

    @OriginalMember(owner = "client!uk", name = "y", descriptor = "[I")
    public int[] field1674;

    @OriginalMember(owner = "client!uk", name = "C", descriptor = "[I")
    public int[] field1678;

    @OriginalMember(owner = "client!uk", name = "P", descriptor = "[I")
    public int[] field1690;

    @OriginalMember(owner = "client!uk", name = "t", descriptor = "[Lch;")
    public class208[] field1669;

    @OriginalMember(owner = "client!uk", name = "K", descriptor = "[Lch;")
    public class208[] field1686;

    @OriginalMember(owner = "client!uk", name = "z", descriptor = "[[[B")
    public byte[][][] field1675;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIIII)V", line = 6)
    public static final void method847(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1677++;
        if (arg1 == arg4) {
            class275.method1912(arg3, (byte) -67, arg0, arg5, arg1);
        } else if (arg2 == 23655) {
            if ((arg3 - arg1) >= class234.field3569 && class322.field4965 >= (arg1 + arg3) && class212.field3261 <= (arg5 - arg4) && class182.field2888 >= (arg5 + arg4)) {
                class339.method2363(-82, arg0, arg3, arg5, arg1, arg4);
            } else {
                class52.method385(arg5, arg3, arg4, -22812, arg1, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(B)V", line = 39)
    public static void method848(byte arg0) {
        field1682 = null;
        field1679 = null;
        if (arg0 != -58) {
            method854(-61, (int[]) null);
        }
        field1671 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIII)V", line = 56)
    public static final void method849(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1680++;
        class188 var5 = class147.method1111(-49, arg0, 10);
        var5.method1392((byte) -48);
        if (arg4 >= -114) {
            field1673 = -86;
        }
        var5.field2959 = arg1;
        var5.field2954 = arg2;
        var5.field2955 = arg3;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 71)
    public static final int method850(String arg0, byte arg1) {
        field1670++;
        if (class228.field3489 == null || arg0.length() == 0) {
            return -1;
        }
        int var2 = 0;
        if (arg1 > -16) {
            method847(-85, 38, -69, 96, -49, 4);
        }
        while (var2 < class228.field3489.field291) {
            if (class76.method599(111, class225.method1602(class228.field3489.field283[var2], 0, " ", "<br>"), arg0)) {
                return var2;
            }
            var2++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)Li;", line = 102)
    public static final class21 method851(int arg0, int arg1) {
        field1684++;
        class21 var2 = (class21) class270.field4207.method730((long) arg0, (byte) 90);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class207.field3172.method696(arg0, (byte) 125, arg1);
        class21 var4 = new class21();
        if (var3 != null) {
            var4.method167(-1099860570, new class254(var3));
        }
        class270.field4207.method734((byte) -14, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Z)V", line = 127)
    public static final void method852(boolean arg0) {
        if (arg0) {
            return;
        }
        class204.field3136.method1136(-91);
        field1689++;
        int var1 = class204.field3136.method1132(1, 126);
        if (var1 == 0) {
            return;
        }
        int var2 = class204.field3136.method1132(2, 126);
        if (var2 == 0) {
            class219.field3351[class67.field970++] = 2047;
        } else if (var2 == 1) {
            int var11 = class204.field3136.method1132(3, 124);
            class39.field575.method2091(1, var11, false);
            int var12 = class204.field3136.method1132(1, 110);
            if (var12 == 1) {
                class219.field3351[class67.field970++] = 2047;
            }
        } else if (var2 == 2) {
            if (class204.field3136.method1132(1, 123) == 1) {
                int var4 = class204.field3136.method1132(3, 124);
                class39.field575.method2091(2, var4, false);
                int var5 = class204.field3136.method1132(3, 119);
                class39.field575.method2091(2, var5, arg0);
            } else {
                int var3 = class204.field3136.method1132(3, 126);
                class39.field575.method2091(0, var3, arg0);
            }
            int var6 = class204.field3136.method1132(1, 113);
            if (var6 == 1) {
                class219.field3351[class67.field970++] = 2047;
            }
        } else if (var2 == 3) {
            int var7 = class204.field3136.method1132(1, 110);
            if (var7 == 1) {
                class219.field3351[class67.field970++] = 2047;
            }
            int var8 = class204.field3136.method1132(7, 115);
            int var9 = class204.field3136.method1132(7, 111);
            int var10 = class204.field3136.method1132(1, 126);
            class265.field4112 = class204.field3136.method1132(2, 112);
            class39.field575.method1893(var10 == 1, var9, (byte) -46, var8);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(CLjava/lang/String;I)I", line = 213)
    public static final int method853(char arg0, String arg1, int arg2) {
        int var3 = arg2;
        field1687++;
        int var4 = arg1.length();
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg0 == arg1.charAt(var5)) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I[I)[I", line = 239)
    public static final int[] method854(int arg0, int[] arg1) {
        field1672++;
        if (arg1 == null) {
            return null;
        } else {
            int var2 = 44 / ((arg0 + 42) / 38);
            int[] var3 = new int[arg1.length];
            class126.method944(arg1, 0, var3, 0, arg1.length);
            return var3;
        }
    }
}
