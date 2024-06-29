import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class71 extends class264 {

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "Z")
    public boolean field881 = false;

    @OriginalMember(owner = "client!oe", name = "u", descriptor = "I")
    private int field892 = 0;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "I")
    private int field884 = 0;

    @OriginalMember(owner = "client!oe", name = "w", descriptor = "I")
    private int field894 = -1;

    @OriginalMember(owner = "client!oe", name = "E", descriptor = "I")
    private int field902 = -32768;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public int field880;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "I")
    private int field882;

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "I")
    public int field887;

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "I")
    public int field886;

    @OriginalMember(owner = "client!oe", name = "C", descriptor = "I")
    public int field900;

    @OriginalMember(owner = "client!oe", name = "A", descriptor = "I")
    public int field898;

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "Lq;")
    private class165 field885;

    @OriginalMember(owner = "client!oe", name = "v", descriptor = "[Z")
    public static boolean[] field893 = new boolean[100];

    @OriginalMember(owner = "client!oe", name = "y", descriptor = "Lj;")
    public static class209 field896 = new class209(64);

    @OriginalMember(owner = "client!oe", name = "D", descriptor = "[Lq;")
    public static class165[] field901 = new class165[14];

    @OriginalMember(owner = "client!oe", name = "F", descriptor = "I")
    public static int field903 = 0;

    @OriginalMember(owner = "client!oe", name = "H", descriptor = "Z")
    public static boolean field905 = false;

    @OriginalMember(owner = "client!oe", name = "G", descriptor = "[I")
    public static int[] field904 = new int[2];

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!oe", name = "r", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!oe", name = "t", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!oe", name = "x", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!oe", name = "z", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!oe", name = "B", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!oe", name = "s", descriptor = "Lt;")
    private class268 field890;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
    public static void method397(byte arg0) {
        if (arg0 != -104) {
            field901 = null;
        }
        field893 = null;
        field901 = null;
        field904 = null;
        field896 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "()I")
    public final int method102() {
        field888++;
        return this.field902;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIII)V")
    public final void method99(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field899++;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ljava/lang/String;ZZ)V")
    public static final void method398(String arg0, boolean arg1, boolean arg2) {
        field897++;
        String var3 = arg0.toLowerCase();
        int var4 = 0;
        int var5 = arg2 ? 32768 : 0;
        int var6 = var5 + (arg2 ? class292.field4639 : class137.field2209);
        short[] var7 = new short[16];
        for (int var8 = var5; var8 < var6; var8++) {
            class273 var11 = class155.method1065(var8, !arg1);
            if (var11.field4356 && var11.method1835(arg1).toLowerCase().indexOf(var3) != -1) {
                if (var4 >= 50) {
                    class117.field1660 = null;
                    class150.field2347 = -1;
                    return;
                }
                if (var7.length <= var4) {
                    short[] var12 = new short[var7.length * 2];
                    for (int var13 = 0; var13 < var4; var13++) {
                        var12[var13] = var7[var13];
                    }
                    var7 = var12;
                }
                var7[var4++] = (short) var8;
            }
        }
        class150.field2347 = var4;
        class117.field1660 = var7;
        class105.field1412 = 0;
        String[] var9 = new String[class150.field2347];
        if (!arg1) {
            field883 = -74;
        }
        for (int var10 = 0; var10 < class150.field2347; var10++) {
            var9[var10] = class155.method1065(var7[var10], !arg1).method1835(true);
        }
        class266.method1795((byte) -128, var9, class117.field1660);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIII)V")
    public static final void method399(int arg0, int arg1, int arg2, int arg3) {
        class246 var4 = class46.field585[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class128 var5 = var4.field4054;
        if (var5 != null) {
            var5.field2053 = var5.field2053 * arg3 / 16;
            var5.field2047 = var5.field2047 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)V")
    public final void method400(int arg0, int arg1) {
        field889++;
        if (this.field881) {
            return;
        }
        if (arg1 != 50) {
            this.field900 = 64;
        }
        this.field892 += arg0;
        while (this.field885.field2634[this.field884] < this.field892) {
            this.field892 -= this.field885.field2634[this.field884];
            this.field884++;
            if (this.field884 >= this.field885.field2624.length) {
                this.field881 = true;
                break;
            }
        }
        if (!this.field881) {
            class221.method1562(this.field884, this.field898, this.field886, this.field885, (byte) 47, false);
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(B)Lwl;")
    private final class158 method401(byte arg0) {
        field891++;
        class98 var2 = class79.method440(this.field882, (byte) 14);
        if (arg0 != 43) {
            this.field881 = false;
        }
        class158 var3;
        if (this.field881) {
            var3 = var2.method611(-1, 13294, 0, -1);
        } else {
            var3 = var2.method611(this.field894, 13294, this.field892, this.field884);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIIIIIJILt;)V")
    public final void method101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class268 arg10) {
        field895++;
        class158 var13 = this.method401((byte) 43);
        if (var13 != null) {
            var13.method101(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field890);
            this.field902 = var13.method102();
        }
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(IIIIIII)V")
    public class71(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field880 = arg4;
        this.field882 = arg0;
        this.field887 = arg1;
        this.field886 = arg2;
        this.field900 = arg5 + arg6;
        this.field898 = arg3;
        int var8 = class79.method440(this.field882, (byte) 14).field1318;
        if (var8 == -1) {
            this.field881 = true;
        } else {
            this.field881 = false;
            this.field885 = class208.method1458((byte) -90, var8);
        }
        if (this.field900 == arg6) {
            class221.method1562(this.field884, this.field898, this.field886, this.field885, (byte) 47, false);
        }
    }
}
