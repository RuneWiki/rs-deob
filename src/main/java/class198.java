import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class198 {

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "J")
    public long field2753 = 0L;

    @OriginalMember(owner = "client!gg", name = "p", descriptor = "B")
    public static byte field2759;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
    public int field2745;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    public int field2746;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
    public int field2747;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
    public int field2748;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
    public int field2750;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "I")
    public int field2757;

    @OriginalMember(owner = "client!gg", name = "q", descriptor = "I")
    public int field2760;

    @OriginalMember(owner = "client!gg", name = "r", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!gg", name = "s", descriptor = "I")
    public int field2762;

    @OriginalMember(owner = "client!gg", name = "t", descriptor = "I")
    public int field2763;

    @OriginalMember(owner = "client!gg", name = "u", descriptor = "I")
    public int field2764;

    @OriginalMember(owner = "client!gg", name = "v", descriptor = "I")
    public int field2765;

    @OriginalMember(owner = "client!gg", name = "w", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "Lsa;")
    public class268 field2752;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "[I")
    public static int[] field2749;

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "[[[I")
    public static int[][][] field2758;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V")
    public static final void method1263(byte arg0) {
        field2755++;
        int var1 = 0;
        if (arg0 >= -81) {
            method1263((byte) -36);
        }
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class269.method1779(1, true, var1, class194.field2682, var3, var2)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIIIIIZ)V")
    public static final void method1264(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        field2744++;
        if (class52.method328(19031, arg6)) {
            if (!arg7) {
                field2749 = null;
            }
            client.method1044(class158.field2208[arg6], -1, arg3, arg1, arg2, arg4, arg5, arg0);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILse;II)V")
    public static final void method1265(int arg0, class211 arg1, int arg2, int arg3) {
        field2761++;
        if (class68.field925 < 2 && class141.field1963 == 0 && !class11.field113) {
            return;
        }
        int var4 = -48 / ((arg3 - 3) / 49);
        String var5 = class292.method1954(-102);
        if (arg1 == null) {
            int var6 = class54.field787.method837(var5, arg0 + 4, arg2 + 15, 16777215, 0, class48.field696, class122.field1702);
            class238.method1595((byte) 30, arg0 + 4, 15, class54.field787.method824(var5) + var6, arg2);
            return;
        }
        class126 var7 = arg1.method1366(class169.field2346, false);
        if (var7 == null) {
            var7 = class54.field787;
        }
        var7.method827(var5, arg0, arg2, arg1.field3112, arg1.field3166, arg1.field3152, arg1.field3053, arg1.field3135, arg1.field3007, class48.field696, class122.field1702, class30.field405);
        class238.method1595((byte) 30, class30.field405[0], class30.field405[3], class30.field405[2], class30.field405[1]);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIIILnj;Z)Lke;")
    public static final class110 method1266(int arg0, int arg1, int arg2, int arg3, int arg4, class144 arg5, boolean arg6) {
        field2754++;
        int var8 = (arg0 << 17) + (arg6 ? 65536 : 0) + (arg2 - -(arg3 << 19));
        if (arg1 != 3869) {
            method1263((byte) 9);
        }
        long var9 = (long) arg4 * 3147483667L + (long) var8 * 3849834839L;
        class110 var11 = (class110) class179.field2505.method540((byte) -125, var9);
        if (var11 != null) {
            return var11;
        }
        class90.field1266 = false;
        class110 var12 = class212.method1387(arg0, 10552, false, false, arg3, arg5, arg2, arg6, arg4);
        if (var12 != null && !class90.field1266) {
            class179.field2505.method543(var12, var9, 858993459);
        }
        return var12;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V")
    public static void method1267(int arg0) {
        if (arg0 != 22581) {
            field2756 = -78;
        }
        field2749 = null;
        field2758 = null;
    }
}
