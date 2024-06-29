import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class61 {

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "Luf;")
    public static class168 field791 = class148.method1019(-1720, "(R");

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "Luf;")
    private static class168 field795 = class148.method1019(-1720, " is already on your ignore list)3");

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "I")
    public static int field803 = 0;

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "[S")
    public static short[] field804 = new short[500];

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "[J")
    public static long[] field793 = new long[200];

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "Luf;")
    public static class168 field805 = field795;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "Z")
    public static boolean field796 = true;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "I")
    public static int field798 = -1;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public static int field794;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!ci", name = "p", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!ci", name = "q", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "Ldk;")
    public static class241 field799;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "Lfj;")
    public static class283 field792;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V", line = 7)
    public static void method339(int arg0) {
        field805 = null;
        field791 = null;
        field792 = null;
        field804 = null;
        field793 = null;
        field799 = null;
        field795 = null;
        if (arg0 != 25) {
            field793 = (long[]) null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Z)V", line = 30)
    public static final void method340(boolean arg0) {
        field794++;
        class100.method753(104, 104);
        class224.method1540(class276.field4644, field792, arg0);
        class245.method1688((byte) -127, field792);
        if (class193.field3143 == 10) {
            class109.method810(28, 8858);
        }
        if (class193.field3143 == 30) {
            class109.method810(25, 8858);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIJI)Z", line = 54)
    public static final boolean method341(int arg0, int arg1, long arg2, int arg3) {
        field802++;
        int var5 = ((int) arg2 & 0x7D99B) >> 14;
        int var6 = ((int) arg2 & 0x371A70) >> 20;
        int var7 = Integer.MAX_VALUE & (int) (arg2 >>> 32);
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class161 var8 = class15.method64(var7, false);
            int var9;
            int var10;
            if (var6 == 0 || var6 == 2) {
                var9 = var8.field2558;
                var10 = var8.field2559;
            } else {
                var9 = var8.field2559;
                var10 = var8.field2558;
            }
            int var11 = var8.field2584;
            if (var6 != 0) {
                var11 = (var11 >> 4 - var6) + (var11 << var6 & 0xF);
            }
            class240.method1623(2, true, (byte) 80, class266.field4489.field3020[0], 0, arg1, var10, 0, class266.field4489.field3033[0], var11, var9, arg3);
        } else {
            class240.method1623(2, true, (byte) 80, class266.field4489.field3020[0], var5 + 1, arg1, 0, var6, class266.field4489.field3033[0], 0, 0, arg3);
        }
        class60.field785 = 2;
        class296.field5010 = class206.field3384;
        class264.field4467 = 0;
        class288.field4854 = class83.field1244;
        if (arg0 != 104) {
            method346((byte) 102, (short[]) null, (class168[]) null);
        }
        return true;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "([Ljava/lang/Object;[JIII)V", line = 103)
    public static final void method342(Object[] arg0, long[] arg1, int arg2, int arg3, int arg4) {
        field801++;
        if (arg2 < arg4) {
            int var5 = (arg2 + arg4) / 2;
            long var6 = arg1[var5];
            int var8 = arg2;
            arg1[var5] = arg1[arg4];
            arg1[arg4] = var6;
            Object var9 = arg0[var5];
            arg0[var5] = arg0[arg4];
            arg0[arg4] = var9;
            for (int var10 = arg2; var10 < arg4; var10++) {
                if (arg1[var10] < ((long) (var10 & 0x1) + var6)) {
                    long var11 = arg1[var10];
                    arg1[var10] = arg1[var8];
                    arg1[var8] = var11;
                    Object var13 = arg0[var10];
                    arg0[var10] = arg0[var8];
                    arg0[var8++] = var13;
                }
            }
            arg1[arg4] = arg1[var8];
            arg1[var8] = var6;
            arg0[arg4] = arg0[var8];
            arg0[var8] = var9;
            method342(arg0, arg1, arg2, 2, var8 - 1);
            method342(arg0, arg1, var8 + 1, arg3 ^ 0x0, arg4);
        }
        if (arg3 != 2) {
            method340(false);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIIIBII)V", line = 158)
    public static final void method343(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        if (arg5 != 8) {
            return;
        }
        field806++;
        if (arg0 == arg7) {
            class107.method793(arg1, arg4, arg3, arg2, 115, arg0, arg6);
        } else if (arg3 - arg0 >= class150.field2331 && (arg0 + arg3) <= class65.field874 && class9.field112 <= arg6 - arg7 && class44.field538 >= (arg6 + arg7)) {
            class159.method1118(arg0, arg7, arg6, arg4, arg3, arg2, 105, arg1);
        } else {
            class167.method1166(arg3, arg1, 11550, arg2, arg6, arg7, arg4, arg0);
        }
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(I)V", line = 191)
    public static final void method344(int arg0) {
        for (int var1 = 0; var1 < class85.field1330; var1++) {
            class287 var2 = class195.method1372(-32, var1);
            if (var2 != null && var2.field4841 == 0) {
                class261.field4423[var1] = 0;
                class122.field1891[var1] = 0;
            }
        }
        class209.field3458 = new class80(16);
        field807++;
        if (arg0 != 20980) {
            field799 = (class241) null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(I)V", line = 228)
    public static final void method345(int arg0) {
        field800++;
        if (arg0 > -81) {
            method339(-7);
        }
        class78.field1066.method1431((byte) 125);
        class71.field956.method1431((byte) 126);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B[S[Luf;)V", line = 241)
    public static final void method346(byte arg0, short[] arg1, class168[] arg2) {
        int var3 = 96 % ((arg0 + 40) / 59);
        field797++;
        class224.method1541(arg2, 0, false, arg1, arg2.length - 1);
    }
}
