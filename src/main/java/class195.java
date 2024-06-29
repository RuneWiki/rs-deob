import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class195 {

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "[Z")
    public static boolean[] field3430 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "Lc;")
    public static class105 field3420 = new class105(128);

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "Lqk;")
    public static class207 field3434 = class24.method212(255, "zap");

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "Lqk;")
    public static class207 field3436 = class24.method212(255, " est d-Bj-9 dans votre liste noire)3");

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public int field3421;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public int field3424;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
    public int field3426;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
    public int field3427;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
    public int field3429;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "I")
    public int field3433;

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "Lgh;")
    public static class24 field3437;

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "[Z")
    public static boolean[] field3435;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IBZI)I")
    public static final int method1353(int arg0, byte arg1, boolean arg2, int arg3) {
        class40 var4 = (class40) class177.field3194.method1867((long) arg0, true);
        field3432++;
        if (var4 == null) {
            return 0;
        }
        if (arg1 < 116) {
            method1358(true);
        }
        int var5 = 0;
        for (int var6 = 0; var6 < var4.field810.length; var6++) {
            if (var4.field810[var6] >= 0 && var4.field810[var6] < class227.field4178) {
                class173 var7 = class117.method829(var4.field810[var6], (byte) 83);
                if (var7.field3060 != null) {
                    class178 var8 = (class178) var7.field3060.method1867((long) arg3, true);
                    if (var8 != null) {
                        if (arg2) {
                            var5 += var4.field804[var6] * var8.field3212;
                        } else {
                            var5 += var8.field3212;
                        }
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IBIIIII)V")
    public static final void method1354(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3431++;
        int var7 = arg6 - arg0;
        int var8 = arg0 + arg4;
        int var9 = arg2 - arg0;
        int var10 = arg0 + arg5;
        if (arg1 > -62) {
            field3437 = null;
        }
        for (int var11 = arg5; var11 < var10; var11++) {
            class215.method1544(arg4, arg2, class15.field238[var11], arg3, -20);
        }
        for (int var12 = arg6; var12 > var7; var12--) {
            class215.method1544(arg4, arg2, class15.field238[var12], arg3, 106);
        }
        for (int var13 = var10; var13 <= var7; var13++) {
            int[] var14 = class15.field238[var13];
            class215.method1544(arg4, var8, var14, arg3, -91);
            class215.method1544(var9, arg2, var14, arg3, 86);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILqk;)Z")
    public static final boolean method1355(int arg0, class207 arg1) {
        field3423++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class54.field1013; var2++) {
            if (arg1.method1462(class234.field4335[var2], true)) {
                return true;
            }
        }
        int var3 = 48 % ((arg0 - 20) / 38);
        return false;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
    public static void method1356(int arg0) {
        field3437 = null;
        if (arg0 != 0) {
            return;
        }
        field3420 = null;
        field3430 = null;
        field3434 = null;
        field3435 = null;
        field3436 = null;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V")
    public static final void method1357(int arg0) {
        class92.field1640 = -3;
        class149.field2625 = arg0;
        field3428++;
        class8.field111 = 0;
        class167.field2930 = false;
        class138.field2396 = -1;
        class198.field3472 = 0;
        class123.field2131 = 0;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)V")
    public static final void method1358(boolean arg0) {
        field3422++;
        class231.field4239.method1382(31346);
        if (arg0) {
            field3434 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)V")
    public static final void method1359(int arg0) {
        if (arg0 == 0) {
            class48.field951.method1870((byte) -109);
            class277.field4861.method394(true);
            class174.field3129.method394(true);
            field3425++;
        }
    }
}
