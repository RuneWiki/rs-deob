import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class90 implements Runnable {

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "[Lmg;")
    public volatile class123[] field1770 = new class123[2];

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "Z")
    public volatile boolean field1765 = false;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "Z")
    public volatile boolean field1764 = false;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "[[I")
    public static int[][] field1775 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "Ljd;")
    public static class92 field1776 = class202.method1325((byte) 90, "gelb:");

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "Ljd;")
    public static class92 field1774 = class202.method1325((byte) 90, "gr-Un:");

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "I")
    public static int field1769 = 0;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "[Ljd;")
    public static class92[] field1773 = new class92[8];

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "Ljd;")
    private static class92 field1772 = class202.method1325((byte) 90, "OFF");

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "Ljd;")
    public static class92 field1771 = field1772;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "Lrh;")
    public class169 field1766;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "Lsc;")
    public static class173 field1762;

    @OriginalMember(owner = "client!jb", name = "run", descriptor = "()V")
    public final void run() {
        this.field1764 = true;
        field1763++;
        try {
            while (!this.field1765) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class123 var2 = this.field1770[var1];
                    if (var2 != null) {
                        var2.method825(4);
                    }
                }
                class58.method357(-24534, 10L);
                class137.method917(112, null, this.field1766);
            }
        } catch (Exception var9) {
            class164.method1059(null, var9, 77);
        } finally {
            Object var6 = null;
            this.field1764 = false;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)I")
    public static final int method595(int arg0, int arg1, int arg2) {
        if (arg2 != 4851) {
            return -34;
        }
        int var3 = 0;
        field1768++;
        while (arg1 > 0) {
            var3 = arg0 & 0x1 | var3 << 1;
            arg0 >>>= 0x1;
            arg1--;
        }
        return var3;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
    public static void method596(int arg0) {
        field1774 = null;
        field1771 = null;
        field1776 = null;
        field1775 = null;
        field1773 = null;
        field1772 = null;
        if (arg0 != 1) {
            method595(-39, -55, 90);
        }
        field1762 = null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method597(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class81.field1643[arg0][var8][var14] == -class96.field1931) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class158.field3146[arg0][arg1][arg3] + arg5;
            if (!class80.method543(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class80.method543(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class80.method543(var9, var11, var13)) {
                return false;
            } else if (class80.method543(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class15.method92(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class80.method543(var6 + 1, class158.field3146[arg0][arg1][arg3] + arg5, var7 + 1) && class80.method543(var6 + 128 - 1, class158.field3146[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class80.method543(var6 + 128 - 1, class158.field3146[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class80.method543(var6 + 1, class158.field3146[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIILtg;IJIIII)Z")
    public static final boolean method598(int arg0, int arg1, int arg2, int arg3, class186 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class118.method807(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IB)I")
    public static final int method599(int arg0, byte arg1) {
        if (arg1 >= -13) {
            method598(89, -77, 58, 104, null, -57, 93L, 106, -58, 125, -99);
        }
        field1777++;
        return arg0 >>> 7;
    }
}
