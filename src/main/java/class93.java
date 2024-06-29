import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public abstract class class93 {

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "[Lti;")
    public static class188[] field1774 = new class188[2048];

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "I")
    public static int field1777 = -1;

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "[S")
    public static short[] field1778 = new short[256];

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "[I")
    public static int[] field1781 = new int[100];

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "Lli;")
    public static class185 field1782 = class245.method1649("blinken2:", -29);

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "Ldl;")
    public static class31 field1775;

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "[[Z")
    public static boolean[][] field1776;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZZ)V")
    public static final void method603(boolean arg0, boolean arg1) {
        if (!arg1) {
            method603(true, false);
        }
        for (int var2 = 0; var2 < class108.field1943; var2++) {
            class71 var3 = class87.field1712[class97.field1811[var2]];
            long var4 = (long) class97.field1811[var2] << 32 | 0x20000000L;
            if (var3 != null && var3.method463(true) && var3.field1236.field1474 == arg0 && var3.field1236.method528(-113)) {
                int var6 = var3.field2694 >> 7;
                int var7 = var3.field2687 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var3.method1014(-1) == 1 && (var3.field2694 & 0x7F) == 64 && (var3.field2687 & 0x7F) == 64) {
                        if (class210.field3830[var6][var7] == class252.field4478) {
                            continue;
                        }
                        class210.field3830[var6][var7] = class252.field4478;
                    }
                    if (!var3.field1236.field1436) {
                        var4 |= Long.MIN_VALUE;
                    }
                    var3.field2711 = class236.method1606(61, var3.field2687, var3.field2694, class265.field4703);
                    class136.method977(class265.field4703, var3.field2694, var3.field2687, var3.field2711, (var3.method1014(-1) - 1) * 64 + 60, var3, var3.field2695, var4, var3.field2690);
                }
            }
        }
        field1780++;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method604(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1779++;
        int var9 = arg0 - arg5;
        if (arg6 <= 37) {
            method603(false, false);
        }
        int var10 = arg7 - arg8;
        int var11 = (arg1 - arg2 << 16) / var10;
        int var12 = (arg4 - arg3 << 16) / var9;
        class94.method610(-498370640, arg3, arg0, 0, arg7, var11, arg2, var12, arg5, 0, arg8);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)[B")
    public abstract byte[] method605(int arg0);

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)V")
    public static void method606(byte arg0) {
        field1782 = null;
        field1776 = null;
        field1778 = null;
        field1774 = null;
        if (arg0 != -5) {
            field1776 = null;
        }
        field1775 = null;
        field1781 = null;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "([BB)V")
    public abstract void method607(byte[] arg0, byte arg1);
}
