import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class104 extends class129 {

    @OriginalMember(owner = "client!ke", name = "v", descriptor = "I")
    public int field1928;

    @OriginalMember(owner = "client!ke", name = "x", descriptor = "I")
    private int field1930;

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "[[I")
    public int[][] field1925;

    @OriginalMember(owner = "client!ke", name = "B", descriptor = "[I")
    public int[] field1934;

    @OriginalMember(owner = "client!ke", name = "w", descriptor = "[Z")
    private boolean[] field1929;

    @OriginalMember(owner = "client!ke", name = "y", descriptor = "Lrd;")
    public static class173 field1931 = class133.method843(" )2> <col=00ffff>", 109);

    @OriginalMember(owner = "client!ke", name = "A", descriptor = "[I")
    public static int[] field1933 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!ke", name = "z", descriptor = "I")
    public static int field1932 = 0;

    @OriginalMember(owner = "client!ke", name = "t", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!ke", name = "C", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!ke", name = "u", descriptor = "Lbc;")
    public static class14 field1927;

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "Lqf;")
    public static class165 field1924;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIII)V")
    public static final void method643(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class82.field1604[0].method291(arg2, arg4);
        field1926++;
        class82.field1604[1].method291(arg2, arg4 + arg3 - 16);
        int var6 = (arg3 - 32) * arg3 / arg1;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg3 - var6 - 32) * arg0 / (arg1 - arg3);
        class27.method219(arg2, arg4 + 16, 16, arg3 - 32, class20.field454);
        class27.method219(arg2, arg4 + var7 + 16, 16, var6, class179.field3523);
        class27.method217(arg2, arg4 + var7 + 16, var6, class29.field597);
        class27.method217(arg2 + arg5, arg4 + 16 + var7, var6, class29.field597);
        class27.method216(arg2, arg4 + var7 + 16, 16, class29.field597);
        class27.method216(arg2, var7 + arg4 + 17, 16, class29.field597);
        class27.method217(arg2 + 15, arg4 + var7 - -16, var6, class107.field2005);
        class27.method217(arg2 + 14, arg4 + var7 + 17, var6 - 1, class107.field2005);
        class27.method216(arg2, arg4 + var7 + var6 + 15, 16, class107.field2005);
        class27.method216(arg2 + 1, arg4 + 14 + var6 + var7, 15, class107.field2005);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIIILdd;IJ)Z")
    public static final boolean method644(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class35 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class177.method1184(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(B)V")
    public static void method645(byte arg0) {
        field1931 = null;
        field1927 = null;
        field1924 = null;
        if (arg0 > -19) {
            field1932 = -125;
        }
        field1933 = null;
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(I[B)V")
    public class104(int arg0, byte[] arg1) {
        this.field1928 = arg0;
        class121 var3 = new class121(arg1);
        this.field1930 = var3.method751((byte) -93);
        this.field1925 = new int[this.field1930][];
        this.field1934 = new int[this.field1930];
        this.field1929 = new boolean[this.field1930];
        for (int var4 = 0; var4 < this.field1930; var4++) {
            this.field1934[var4] = var3.method751((byte) 97);
        }
        for (int var5 = 0; var5 < this.field1930; var5++) {
            this.field1929[var5] = var3.method751((byte) 86) == 1;
        }
        for (int var6 = 0; var6 < this.field1930; var6++) {
            this.field1925[var6] = new int[var3.method751((byte) 127)];
        }
        for (int var7 = 0; var7 < this.field1930; var7++) {
            for (int var8 = 0; var8 < this.field1925[var7].length; var8++) {
                this.field1925[var7][var8] = var3.method751((byte) 117);
            }
        }
    }
}
