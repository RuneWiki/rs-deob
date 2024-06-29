import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class87 extends class71 {

    @OriginalMember(owner = "client!ie", name = "N", descriptor = "Lud;")
    public static class279 field1672 = class130.method1024("Null", 255);

    @OriginalMember(owner = "client!ie", name = "O", descriptor = "Lud;")
    public static class279 field1673 = class130.method1024("Examiner", 255);

    @OriginalMember(owner = "client!ie", name = "S", descriptor = "[Z")
    public static boolean[] field1677 = new boolean[200];

    @OriginalMember(owner = "client!ie", name = "K", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!ie", name = "L", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!ie", name = "M", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!ie", name = "P", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!ie", name = "Q", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!ie", name = "R", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!ie", name = "J", descriptor = "[I")
    public static int[] field1668;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(IB)[I", line = 11)
    public final int[] method199(int arg0, byte arg1) {
        int[] var3 = this.field1390.method549(arg0, true);
        if (arg1 >= -69) {
            return (int[]) null;
        }
        field1674++;
        if (this.field1390.field1304) {
            class25.method221(var3, 0, class215.field3787, class200.field3574[arg0]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZBIIILok;)V", line = 36)
    public static final void method758(boolean arg0, byte arg1, int arg2, int arg3, int arg4, class149 arg5) {
        class181.field3310 = 1;
        class235.field4103 = 10000;
        if (arg1 != -118) {
            method763(80);
        }
        class70.field1382 = arg0;
        class243.field4322 = arg4;
        class204.field3633 = arg5;
        class103.field1937 = arg3;
        field1670++;
        class284.field5069 = arg2;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILok;)V", line = 56)
    public static final void method759(int arg0, class149 arg1) {
        if (arg0 != 26364) {
            field1668 = (int[]) null;
        }
        class266.field4790 = arg1.method1167(class209.field3681, 87);
        field1676++;
        class115.field2093 = arg1.method1167(class271.field4832, 108);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIZ)V", line = 71)
    public static final void method760(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class207.field3668 = arg1;
        class54.field1193 = arg2;
        class115.field2091 = arg3;
        class251.field4491 = new class191[arg0][class207.field3668][class54.field1193];
        class255.field4550 = new int[arg0][class207.field3668 + 1][class54.field1193 + 1];
        if (class97.field1824) {
            class215.field3786 = new class168[4][];
        }
        if (arg4) {
            class295.field5263 = new class191[1][class207.field3668][class54.field1193];
            class222.field3931 = new int[class207.field3668][class54.field1193];
            class14.field432 = new int[1][class207.field3668 + 1][class54.field1193 + 1];
            if (class97.field1824) {
                class101.field1897 = new class168[1][];
            }
        } else {
            class295.field5263 = (class191[][][]) null;
            class222.field3931 = (int[][]) null;
            class14.field432 = (int[][][]) null;
            class101.field1897 = (class168[][]) null;
        }
        class315.method2232(false);
        class37.field840 = new class195[500];
        class167.field3013 = 0;
        class77.field1495 = new class195[500];
        class222.field3933 = 0;
        class250.field4458 = new int[arg0][class207.field3668 + 1][class54.field1193 + 1];
        class180.field3264 = new class18[5000];
        class272.field4849 = 0;
        class51.field1066 = new class18[100];
        class213.field3734 = new boolean[class115.field2091 + class115.field2091 + 1][class115.field2091 + class115.field2091 + 1];
        class285.field5081 = new boolean[class115.field2091 + class115.field2091 + 2][class115.field2091 + class115.field2091 + 2];
        class52.field1082 = new byte[arg0][class207.field3668][class54.field1193];
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V", line = 112)
    public static final void method761(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class304 var20 = new class304(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class24.field619[var21][arg1][arg2] == null) {
                    class24.field619[var21][arg1][arg2] = new class191(var21, arg1, arg2);
                }
            }
            class24.field619[arg0][arg1][arg2].field3457 = var20;
        } else if (arg3 == 1) {
            class304 var22 = new class304(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class24.field619[var23][arg1][arg2] == null) {
                    class24.field619[var23][arg1][arg2] = new class191(var23, arg1, arg2);
                }
            }
            class24.field619[arg0][arg1][arg2].field3457 = var22;
        } else {
            class281 var24 = new class281(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class24.field619[var25][arg1][arg2] == null) {
                    class24.field619[var25][arg1][arg2] = new class191(var25, arg1, arg2);
                }
            }
            class24.field619[arg0][arg1][arg2].field3447 = var24;
        }
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V", line = 160)
    public class87() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(II)I", line = 165)
    public static final int method762(int arg0, int arg1) {
        field1671++;
        int var2 = ((arg1 & 0xAAAAAAAB) >>> 1) + (arg1 & 0x55555555);
        int var3 = (var2 >>> 2 & 0x73333333) + (var2 & 0x33333333);
        if (arg0 < 95) {
            return -22;
        } else {
            int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
            int var5 = (var4 >>> 8) + var4;
            int var6 = (var5 >>> 16) + var5;
            return var6 & 0xFF;
        }
    }

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "(I)V", line = 188)
    public static void method763(int arg0) {
        field1672 = null;
        if (arg0 <= -64) {
            field1668 = null;
            field1673 = null;
            field1677 = null;
        }
    }
}
