import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class169 extends class261 {

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "I")
    public int field2744 = 0;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "I")
    public int field2742 = -1;

    @OriginalMember(owner = "client!ok", name = "z", descriptor = "Lmn;")
    public static class249 field2757;

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "I")
    public int field2745;

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "I")
    public int field2746;

    @OriginalMember(owner = "client!ok", name = "p", descriptor = "I")
    public int field2747;

    @OriginalMember(owner = "client!ok", name = "q", descriptor = "I")
    public int field2748;

    @OriginalMember(owner = "client!ok", name = "r", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!ok", name = "s", descriptor = "I")
    public int field2750;

    @OriginalMember(owner = "client!ok", name = "t", descriptor = "I")
    public int field2751;

    @OriginalMember(owner = "client!ok", name = "u", descriptor = "I")
    public int field2752;

    @OriginalMember(owner = "client!ok", name = "v", descriptor = "I")
    public int field2753;

    @OriginalMember(owner = "client!ok", name = "w", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!ok", name = "y", descriptor = "I")
    public int field2756;

    @OriginalMember(owner = "client!ok", name = "A", descriptor = "I")
    public int field2758;

    @OriginalMember(owner = "client!ok", name = "x", descriptor = "Lsn;")
    public static class448 field2755;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ZIIIZ)I")
    public static final int method1185(boolean arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2754++;
        class11 var5 = class271.method1714(arg1, 0, arg0);
        if (var5 == null) {
            return 0;
        }
        int var6 = arg3;
        for (int var7 = 0; var7 < var5.field151.length; var7++) {
            if (var5.field151[var7] >= 0 && var5.field151[var7] < class135.field2271.field3879) {
                class12 var8 = class135.field2271.method1636(var5.field151[var7], -105);
                int var9 = var8.method78(true, class453.field6727.method460(arg2, -18297).field3809, arg2);
                if (arg4) {
                    var6 += var5.field149[var7] * var9;
                } else {
                    var6 += var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V")
    public static void method1186(int arg0) {
        int var1 = -117 / ((arg0 + 84) / 35);
        field2755 = null;
        field2757 = null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BLha;)V")
    public static final void method1187(byte arg0, class43 arg1) {
        field2743++;
        int var2 = 0;
        if (arg0 != 43) {
            method1187((byte) -96, null);
        }
        while (class479.field7068 > var2) {
            int var3 = class522.field7575[var2];
            class366 var4 = class73.field1444[var3];
            int var5 = arg1.method1858(-3256);
            if ((var5 & 0x1) != 0) {
                var5 += arg1.method1858(arg0 ^ 0xFFFFF363) << 8;
            }
            if ((var5 & 0x400) != 0) {
                var5 += arg1.method1858(-3256) << 16;
            }
            class377.method2313(var3, var4, arg0 ^ 0xFFFFFF9E, var5, arg1);
            var2++;
        }
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(I)V")
    public static final void method1188(int arg0) {
        if (arg0 != 1024) {
            method1187((byte) 35, null);
        }
        field2749++;
        for (class252 var1 = (class252) class244.field3781.method1892(127); var1 != null; var1 = (class252) class244.field3781.method1893((byte) -2)) {
            class419 var2 = var1.field3877;
            if (var2.field6307) {
                var1.method1676(true);
                var2.method2560(0);
            } else if (class62.field1268 >= var2.field6308) {
                var2.method2563(class5.field97, (byte) -22);
                if (var2.field6307) {
                    var1.method1676(true);
                } else {
                    class234.method1538(var2, true);
                }
            }
        }
    }

    static {
        new class309("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
        field2757 = new class249(64);
    }
}
