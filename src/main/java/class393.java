import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class393 {

    @OriginalMember(owner = "client!lq", name = "e", descriptor = "Leh;")
    public static class246 field5522 = new class246(72, 3);

    @OriginalMember(owner = "client!lq", name = "i", descriptor = "Lmt;")
    public static class276 field5526 = new class276(6, 0, 4, 2);

    @OriginalMember(owner = "client!lq", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field5527 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "I")
    public static int field5518;

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "I")
    public int field5519;

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "I")
    public static int field5520;

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "I")
    public static int field5521;

    @OriginalMember(owner = "client!lq", name = "h", descriptor = "I")
    public static int field5525;

    @OriginalMember(owner = "client!lq", name = "f", descriptor = "Lhu;")
    public class88 field5523;

    @OriginalMember(owner = "client!lq", name = "g", descriptor = "[I")
    public int[] field5524;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Ljg;Ljg;IIIIIBII)V")
    public static final void method2274(class228 arg0, class228 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9) {
        field5525++;
        int var10 = arg0.method135(-86);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class24 var12 = (class24) class168.field2443.method1088((long) var10, (byte) 67);
        if (var12 == null) {
            class506[] var13 = class506.method3021(class61.field761, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class385.field5414.method312(var13[0], true);
            class168.field2443.method1097(19627, var12, (long) var10);
        }
        class58.method478(arg1.field1899, arg5, arg1.field1896, arg4, arg2 >> 1, 0, arg1.method125((byte) -77) * 64, arg3 >> 1, arg1.field1904, 70);
        int var14 = class153.field2194[0] + arg6 - 18;
        int var15 = arg9 / 4 * 18 + var14;
        int var16 = arg8 + class153.field2194[1] - 16 - 54;
        int var17 = arg9 % 4 * 18 + var16;
        var12.method151(var15, var17);
        if (arg0 == arg1) {
            class385.field5414.method1795(var17 - 1, (byte) -77, 18, 18, -256, var15 - 1);
        }
        class77 var18 = class256.method1649(103);
        var18.field1007 = var15;
        var18.field1004 = var17;
        var18.field1005 = var15 + 16;
        var18.field1003 = arg0;
        var18.field1006 = var17 + 16;
        class363.field5198.method2753(4, var18);
        int var19 = 35 / ((arg7 + 49) / 43);
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(B)V")
    public static void method2275(byte arg0) {
        field5522 = null;
        int var1 = -112 % ((arg0 + 71) / 49);
        field5526 = null;
        field5527 = null;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(BI)V")
    public static final void method2276(byte arg0, int arg1) {
        field5520++;
        if (class453.field6348 == null) {
            class453.field6348 = new byte[4][class43.field494][class500.field7068];
        }
        if (arg1 != 26948) {
            method2275((byte) -64);
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < class43.field494; var3++) {
                for (int var4 = 0; var4 < class500.field7068; var4++) {
                    class453.field6348[var2][var3][var4] = arg0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)I")
    public static final int method2277(int arg0) {
        field5521++;
        if ((double) class245.field3555 == 3.0D) {
            return 37;
        } else if ((double) class245.field3555 == 4.0D) {
            return 50;
        } else if ((double) class245.field3555 == 6.0D) {
            return 75;
        } else if ((double) class245.field3555 == 8.0D) {
            return 100;
        } else {
            if (arg0 != 21913) {
                method2277(-82);
            }
            return 200;
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(BIZ)V")
    public static final void method2278(byte arg0, int arg1, boolean arg2) {
        field5518++;
        class167 var3 = class119.method803(arg2, arg1, 0);
        if (arg0 == -56 && var3 != null) {
            var3.method2891(-122);
        }
    }
}
