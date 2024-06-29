import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class89 implements class121 {

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "Lp;")
    public static class280 field1435 = class18.method140((byte) -118, " est d-Bj-9 dans votre liste noire)3");

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    public static int field1437 = 0;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    public static int field1440 = 0;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "Lti;")
    public static class5 field1434 = null;

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "Lp;")
    public static class280 field1452 = class18.method140((byte) -121, "<col=ffffff>");

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "Lp;")
    public static class280 field1449 = class18.method140((byte) -120, ")1 ");

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "Lp;")
    public static class280 field1451 = class18.method140((byte) -120, "Regarder dans cette direction");

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "Lp;")
    public static class280 field1444 = class18.method140((byte) -126, ":tradereq:");

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "[[B")
    public static byte[][] field1438;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
    public static void method630(int arg0) {
        field1444 = null;
        if (arg0 != 1) {
            return;
        }
        field1438 = null;
        field1451 = null;
        field1435 = null;
        field1434 = null;
        field1452 = null;
        field1449 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I[I[III)V")
    public static final void method631(int arg0, int[] arg1, int[] arg2, int arg3, int arg4) {
        if (arg3 < arg0) {
            int var5 = (arg0 + arg3) / 2;
            int var6 = arg3;
            int var7 = arg2[var5];
            arg2[var5] = arg2[arg0];
            arg2[arg0] = var7;
            int var8 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var8;
            for (int var9 = arg3; var9 < arg0; var9++) {
                if (arg2[var9] > ((var9 & 0x1) + var7)) {
                    int var10 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6] = var10;
                    int var11 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6++] = var11;
                }
            }
            arg2[arg0] = arg2[var6];
            arg2[var6] = var7;
            arg1[arg0] = arg1[var6];
            arg1[var6] = var8;
            method631(var6 - 1, arg1, arg2, arg3, arg4);
            method631(arg0, arg1, arg2, var6 + 1, 5430);
        }
        field1442++;
        if (arg4 != 5430) {
            method636(-79, -104);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)I")
    public static final int method632(int arg0, int arg1, int arg2) {
        class201 var3 = (class201) class103.field1708.method150((long) arg2, -109);
        field1445++;
        if (var3 == null) {
            return -1;
        } else if (~arg1 <= arg0 && arg1 < var3.field3511.length) {
            return var3.field3511[arg1];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V")
    public static final void method633(int arg0) {
        if (arg0 != 128) {
            method637(-34, 36, -26);
        }
        field1450++;
        for (class155 var1 = (class155) class224.field3880.method651(12916); var1 != null; var1 = (class155) class224.field3880.method643(arg0 + 10938)) {
            if (var1.field2709 == -1) {
                var1.field2711 = 0;
                class79.method583(-128, var1);
            } else {
                var1.method1146(arg0 + 26031);
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I[IBJ)Lp;")
    public final class280 method634(int arg0, int[] arg1, byte arg2, long arg3) {
        field1448++;
        if (arg0 == 0) {
            class283 var6 = class267.method1793(arg2 ^ 0x36, arg1[0]);
            return var6.method1923(-2005222424, (int) arg3);
        } else if (arg0 == 1 || arg0 == 10) {
            class220 var7 = class23.method177((byte) -83, (int) arg3);
            return var7.field3818;
        } else if (arg2 == 54) {
            return arg0 == 6 || arg0 == 7 || arg0 == 11 ? class267.method1793(arg2 - 54, arg1[0]).method1923(arg2 - 2005222478, (int) arg3) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BIIII)V")
    public static final void method635(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field1441++;
        if (class36.field654 <= arg4 && arg4 <= class249.field4360) {
            int var5 = class76.method564(field1440, arg0 ^ 0x7A, arg1, class12.field249);
            int var6 = class76.method564(field1440, -119, arg2, class12.field249);
            class73.method540(arg4, var6, arg0 ^ 0xC33, arg3, var5);
        }
        if (arg0 != -2) {
            field1449 = null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)V")
    public static final void method636(int arg0, int arg1) {
        if (arg0 == 25473) {
            class93.field1510.method1478(arg1, 114);
            field1447++;
            class264.field4653.method1478(arg1, 79);
            class162.field2856.method1478(arg1, 109);
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(III)Z")
    public static final boolean method637(int arg0, int arg1, int arg2) {
        int var3 = class3.field98[arg0][arg1][arg2];
        if (-class183.field3221 == var3) {
            return false;
        } else if (class183.field3221 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class269.method1804(var4 + 1, class145.field2529[arg0][arg1][arg2], var5 + 1) && class269.method1804(var4 + 128 - 1, class145.field2529[arg0][arg1 + 1][arg2], var5 + 1) && class269.method1804(var4 + 128 - 1, class145.field2529[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class269.method1804(var4 + 1, class145.field2529[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class3.field98[arg0][arg1][arg2] = class183.field3221;
                return true;
            } else {
                class3.field98[arg0][arg1][arg2] = -class183.field3221;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(II)V")
    public static final void method638(int arg0, int arg1) {
        field1443++;
        if (class48.method356(-664, arg0)) {
            class257.method1743(class251.field4394[arg0], (byte) -105, -1);
            if (arg1 != 32588) {
                method637(-97, 40, 39);
            }
        }
    }
}
