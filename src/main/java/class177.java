import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class177 extends class59 {

    @OriginalMember(owner = "client!jg", name = "J", descriptor = "I")
    private int field2911 = 1365;

    @OriginalMember(owner = "client!jg", name = "I", descriptor = "I")
    private int field2910 = 0;

    @OriginalMember(owner = "client!jg", name = "O", descriptor = "I")
    private int field2916 = 20;

    @OriginalMember(owner = "client!jg", name = "P", descriptor = "I")
    private int field2917 = 0;

    @OriginalMember(owner = "client!jg", name = "Q", descriptor = "Lfe;")
    public static class97 field2918 = new class97(16);

    @OriginalMember(owner = "client!jg", name = "R", descriptor = "Lph;")
    public static class229 field2919 = class266.method1858("Card:", 0);

    @OriginalMember(owner = "client!jg", name = "Y", descriptor = "[[I")
    public static int[][] field2926 = new int[104][104];

    @OriginalMember(owner = "client!jg", name = "V", descriptor = "Z")
    public static boolean field2923 = false;

    @OriginalMember(owner = "client!jg", name = "ab", descriptor = "Lph;")
    public static class229 field2928 = class266.method1858("mapscene", 0);

    @OriginalMember(owner = "client!jg", name = "K", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!jg", name = "L", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!jg", name = "M", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!jg", name = "N", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!jg", name = "S", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!jg", name = "W", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!jg", name = "Z", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!jg", name = "T", descriptor = "Llj;")
    public static class26 field2921;

    @OriginalMember(owner = "client!jg", name = "U", descriptor = "[Z")
    public static boolean[] field2922;

    @OriginalMember(owner = "client!jg", name = "X", descriptor = "[[[B")
    public static byte[][][] field2925;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIZIIIII)V", line = 4)
    public static final void method1273(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!arg2) {
            field2920 = -19;
        }
        field2913++;
        if (class99.field1675) {
            int var8 = arg1 - 334;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 100) {
                var8 = 100;
            }
            int var9 = (class226.field3713 - class192.field3178) * var8 / 100 + class192.field3178;
            arg0 = arg0 * var9 >> 8;
        }
        int var10 = 0;
        int var11 = 2048 - arg6 & 0x7FF;
        int var12 = 0;
        int var13 = 2048 - arg3 & 0x7FF;
        int var14 = arg0;
        if (var13 != 0) {
            int var15 = class310.field5197[var13];
            int var16 = class310.field5199[var13];
            var10 = -arg0 * var16 >> 16;
            var14 = arg0 * var15 >> 16;
        }
        if (var11 != 0) {
            int var17 = class310.field5199[var11];
            var12 = var14 * var17 >> 16;
            int var18 = class310.field5197[var11];
            var14 = var14 * var18 >> 16;
        }
        class192.field3177 = arg5 - var12;
        class222.field3653 = arg3;
        class205.field3387 = arg7 - var10;
        class167.field2725 = arg4 - var14;
        class65.field1004 = arg6;
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "()V", line = 75)
    public class177() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(B)Lhb;", line = 79)
    public static final class164 method1274(byte arg0) {
        field2915++;
        class164 var1 = new class164(31);
        var1.method1188(-93, 8);
        var1.method1188(-114, class191.field3153);
        var1.method1188(-103, class85.field1467 ? 1 : 0);
        var1.method1188(-111, class175.field2877 ? 1 : 0);
        var1.method1188(-83, class120.field2017 ? 1 : 0);
        var1.method1188(-92, class296.field4836 ? 1 : 0);
        var1.method1188(-122, class298.field4847 ? 1 : 0);
        var1.method1188(-111, class171.field2807 ? 1 : 0);
        var1.method1188(-86, class215.field3547 ? 1 : 0);
        var1.method1188(-75, class45.field687 ? 1 : 0);
        var1.method1188(-125, class157.field2559);
        var1.method1188(-89, class88.field1483 ? 1 : 0);
        var1.method1188(-72, class281.field4661 ? 1 : 0);
        int var2 = 120 / ((arg0 - 77) / 32);
        var1.method1188(-124, class215.field3545 ? 1 : 0);
        var1.method1188(-81, class214.field3532);
        var1.method1188(-100, class143.field2313 ? 1 : 0);
        var1.method1188(-86, class265.field4462);
        var1.method1188(-85, class234.field3860);
        var1.method1188(-126, class184.field2996);
        var1.method1155(-1640531527, class156.field2540);
        var1.method1155(-1640531527, class326.field5576);
        var1.method1188(-80, class194.method1371());
        var1.method1168(class8.field99, (byte) -76);
        var1.method1188(-94, class72.field1231);
        var1.method1188(-128, class160.field2594 ? 1 : 0);
        var1.method1188(-125, class255.field4267 ? 1 : 0);
        return var1;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZI)[I", line = 120)
    public final int[] method63(boolean arg0, int arg1) {
        field2914++;
        int[] var3 = this.field846.method383(3583, arg1);
        if (this.field846.field811) {
            for (int var4 = 0; var4 < class293.field4789; var4++) {
                int var5 = (class219.field3608[var4] << 12) / this.field2911 + this.field2917;
                int var6 = var5;
                int var7 = (class269.field4504[arg1] << 12) / this.field2911 + this.field2910;
                int var8 = var7;
                int var9 = var5;
                int var10 = var7;
                int var11 = var5 * var5 >> 12;
                int var12 = var7 * var7 >> 12;
                int var13 = 0;
                while (var11 + var12 < 16384 && var13 < this.field2916) {
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var13++;
                    var9 = var11 + var6 - var12;
                    var12 = var10 * var10 >> 12;
                    var11 = var9 * var9 >> 12;
                }
                var3[var4] = var13 >= (this.field2916 - 1) ? 0 : (var13 << 12) / this.field2916;
            }
        }
        if (!arg0) {
            field2924 = -60;
        }
        return var3;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BILhb;)V", line = 175)
    public final void method67(byte arg0, int arg1, class164 arg2) {
        field2927++;
        if (arg1 == 0) {
            this.field2911 = arg2.method1161(true);
        } else if (arg1 == 1) {
            this.field2916 = arg2.method1161(true);
        } else if (arg1 == 2) {
            this.field2917 = arg2.method1161(true);
        } else if (arg1 == 3) {
            this.field2910 = arg2.method1161(true);
        }
        if (arg0 != 115) {
            field2918 = (class97) null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lvl;I)V", line = 229)
    public static final void method1275(class157 arg0, int arg1) {
        field2912++;
        class315.method2139(arg0, 200000, (byte) 127);
        if (arg1 >= -26) {
            field2928 = (class229) null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(B)V", line = 252)
    public static void method1276(byte arg0) {
        field2926 = (int[][]) null;
        field2921 = null;
        if (arg0 != 95) {
            field2923 = false;
        }
        field2922 = null;
        field2925 = (byte[][][]) null;
        field2928 = null;
        field2918 = null;
        field2919 = null;
    }
}
