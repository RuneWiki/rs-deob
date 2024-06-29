import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class71 extends RuntimeException {

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "Ljava/lang/Throwable;")
    public Throwable field1807;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "Ljava/lang/String;")
    public String field1802;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "Lc;")
    public static class18 field1800 = new class18(500);

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "Lja;")
    public static class62 field1803 = class30.method243(43, "Registrierter Benutzer");

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "Lja;")
    public static class62 field1806 = class30.method243(43, "me");

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
    public static volatile int field1811 = 0;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "[I")
    public static int[] field1804 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "Lja;")
    private static class62 field1808 = class30.method243(43, "You can(Wt add yourself to your own friend list");

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "Lja;")
    public static class62 field1805 = field1808;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "Lja;")
    private static class62 field1809 = class30.method243(43, "go back to the main RuneScape webpage");

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "Lja;")
    public static class62 field1810 = field1809;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "Lhe;")
    public static class54 field1812;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILja;)Z")
    public static final boolean method599(int arg0, class62 arg1) {
        field1813++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = arg0; var2 < class54.field1334; var2++) {
            if (arg1.method461(25064, class155.field3597[var2])) {
                return true;
            }
        }
        return arg1.method461(25064, class40.field936.field2653);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)V")
    public static final void method600(int arg0, int arg1, int arg2) {
        if (arg2 != 89) {
            field1800 = null;
        }
        field1801++;
        if (class15.field362 != 0 && class15.field362 != 3 || class70.field1792 != 1) {
            return;
        }
        int var3 = class29.field713 - arg0 - 25;
        int var4 = class4.field56 - arg1 - 5;
        if (var3 < 0 || var4 < 0 || var3 >= 146 || var4 >= 151) {
            return;
        }
        var3 -= 73;
        var4 -= 75;
        int var5 = class62.field1495 + class50.field1162 & 0x7FF;
        int var6 = class66.field1658[var5];
        int var7 = class66.field1647[var5];
        int var8 = (class128.field2909 + 256) * var6 >> 8;
        int var9 = (class128.field2909 + 256) * var7 >> 8;
        int var10 = var4 * var8 - var3 * var9 >> 11;
        int var11 = var3 * var8 + var4 * var9 >> 11;
        int var12 = class40.field936.field134 - var10 >> 7;
        int var13 = class40.field936.field136 + var11 >> 7;
        boolean var14 = class75.method615(class40.field936.field193[0], var12, var13, (byte) 98, 0, 1, true, 0, 0, class40.field936.field144[0], 0, 0);
        if (!var14) {
            return;
        }
        class136.field3140.method1010(var3, arg2 ^ 0x8059);
        class136.field3140.method1010(var4, arg2 ^ 0x8059);
        class136.field3140.method1039(class62.field1495, 305662280);
        class136.field3140.method1010(57, arg2 ^ 0x8059);
        class136.field3140.method1010(class50.field1162, arg2 ^ 0x8059);
        class136.field3140.method1010(class128.field2909, 32768);
        class136.field3140.method1010(89, 32768);
        class136.field3140.method1039(class40.field936.field136, arg2 + 305662191);
        class136.field3140.method1039(class40.field936.field134, 305662280);
        class136.field3140.method1010(class43.field1003, 32768);
        class136.field3140.method1010(63, 32768);
        return;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZIZ)I")
    public static final int method601(boolean arg0, int arg1, boolean arg2) {
        int var3 = 0;
        if (arg2) {
            var3 += class18.field401 + class1.field8;
        }
        if (arg0) {
            var3 += class5.field66 + class155.field3603;
        }
        field1799++;
        if (arg1 != 2047) {
            method602((byte) -28);
        }
        return var3;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V")
    public static void method602(byte arg0) {
        field1809 = null;
        field1808 = null;
        if (arg0 != -74) {
            field1811 = -78;
        }
        field1800 = null;
        field1805 = null;
        field1804 = null;
        field1803 = null;
        field1810 = null;
        field1812 = null;
        field1806 = null;
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class71(Throwable arg0, String arg1) {
        this.field1807 = arg0;
        this.field1802 = arg1;
    }
}
