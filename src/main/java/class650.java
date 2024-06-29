import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class650 extends class408 {

    @OriginalMember(owner = "client!lc", name = "A", descriptor = "Ldf;")
    public class402 field9154;

    @OriginalMember(owner = "client!lc", name = "C", descriptor = "Lmia;")
    public static class63 field9155 = new class63(64, -1);

    @OriginalMember(owner = "client!lc", name = "F", descriptor = "Lqe;")
    public static class469 field9158 = new class469(26, -2);

    @OriginalMember(owner = "client!lc", name = "H", descriptor = "I")
    public static int field9160 = 0;

    @OriginalMember(owner = "client!lc", name = "E", descriptor = "F")
    public static float field9157;

    @OriginalMember(owner = "client!lc", name = "y", descriptor = "I")
    public static int field9152;

    @OriginalMember(owner = "client!lc", name = "z", descriptor = "I")
    public static int field9153;

    @OriginalMember(owner = "client!lc", name = "D", descriptor = "I")
    public static int field9156;

    @OriginalMember(owner = "client!lc", name = "G", descriptor = "I")
    public static int field9159;

    // $FF: synthetic field
    @OriginalMember(owner = "client!lc", name = "I", descriptor = "Ljava/lang/Class;")
    public static Class field9161;

    // $FF: synthetic method
    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3777(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V", line = 5)
    public static void method3772(int arg0) {
        field9158 = null;
        field9155 = null;
        if (arg0 != -42) {
            method3773(-24, -37, (byte) 42, -20);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIBI)Z", line = 16)
    public static final boolean method3773(int arg0, int arg1, byte arg2, int arg3) {
        field9159++;
        class721 var4 = (class721) class608.method3529(arg0, arg1, arg3);
        boolean var5 = true;
        if (var4 != null) {
            var5 &= class133.method937(0, var4);
        }
        class721 var6 = (class721) class755.method4208(arg0, arg1, arg3, field9161 == null ? (field9161 = method3777("jn")) : field9161);
        if (var6 != null) {
            var5 &= class133.method937(0, var6);
        }
        class721 var7 = (class721) class577.method3340(arg0, arg1, arg3);
        if (var7 != null) {
            var5 &= class133.method937(0, var7);
        }
        if (arg2 < 67) {
            field9160 = -30;
        }
        return var5;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IZI)Lc;", line = 46)
    public static final class187 method3774(int arg0, boolean arg1, int arg2) {
        field9153++;
        if (arg0 < 90) {
            method3773(-114, -115, (byte) 2, -92);
        }
        class243[] var3 = class373.field5546;
        synchronized (class373.field5546) {
            class187 var4;
            if (class373.field5546.length <= arg2 || class373.field5546[arg2].method1627(1)) {
                var4 = new class187();
                var4.field2851 = new class102[arg2];
                for (int var5 = 0; var5 < arg2; var5++) {
                    var4.field2851[var5] = new class102();
                }
            } else {
                var4 = (class187) class373.field5546[arg2].method1617(false);
                var4.method385((byte) -28);
                int var10002 = class430.field6436[arg2]--;
            }
            var4.field2849 = arg1;
            return var4;
        }
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Ldf;)V", line = 89)
    public class650(class402 arg0) {
        this.field9154 = arg0;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lha;I)V", line = 97)
    public static final void method3775(class60 arg0, int arg1) {
        field9152++;
        int var2 = 0;
        int var3 = 0;
        if (class419.field6265) {
            var2 = class210.method1422(true);
            var3 = class407.method2589((byte) -45);
        }
        int var4 = class642.field9012 + var2;
        int var5 = class177.field2747 + var3;
        int var6 = class624.field8741;
        int var7 = class338.field4919 - 3;
        byte var8 = 20;
        class194.method1349((byte) -119, class430.field6394.method2679(field9160, -62), arg0, class177.field2747 + var3, class642.field9012 + var2, class338.field4919, var8, class624.field8741);
        int var9 = var2 + class632.field8840.method2697(4212);
        int var10 = var3 + class632.field8840.method2698(0);
        if (class325.field4650) {
            int var14 = 0;
            for (class567 var15 = (class567) class673.field9386.method3508(-2); var15 != null; var15 = (class567) class673.field9386.method3507(-125)) {
                int var28 = var14 * 16 + var5 + var8 + 13;
                if (var9 > class642.field9012 + var2 && (class642.field9012 + var2 + class624.field8741) > var9 && var28 - 13 < var10 && var10 < var28 + 4 && (var15.field8052 > 1 || ((class342) var15.field8055.field8521.field6156).field4960)) {
                    arg0.method516(class642.field9012 + var2, var28 - 12, class624.field8741, 16, class290.field4153 | 255 - class149.field2332 << 24, 1);
                }
                var14++;
            }
            if (class218.field3211 != null) {
                class194.method1349((byte) -106, class218.field3211.field8054, arg0, class304.field4300, class582.field8289, class128.field1706, var8, class600.field8491);
                int var16 = 0;
                for (class342 var17 = (class342) class218.field3211.field8055.method3508(-2); var17 != null; var17 = (class342) class218.field3211.field8055.method3507(-63)) {
                    int var18 = var16 * 16 + class304.field4300 + var8 + 13;
                    if (var9 > class582.field8289 && var9 < (class600.field8491 + class582.field8289) && var10 > var18 - 13 && var18 + 4 > var10 && var17.field4960) {
                        arg0.method516(class582.field8289, var18 - 12, class600.field8491, 16, class290.field4153 | 255 - class149.field2332 << 24, 1);
                    }
                    var16++;
                }
                class559.method3265(true, class600.field8491, arg0, class582.field8289, class304.field4300, class128.field1706, var8);
            }
        } else {
            int var11 = 0;
            for (class342 var12 = (class342) class748.field10459.method1195(0); var12 != null; var12 = (class342) class748.field10459.method1201(2)) {
                int var13 = (class68.field969 - var11 - 1) * 16 + var5 + var8 + 13;
                if ((class642.field9012 + var2) < var9 && class642.field9012 + var2 + class624.field8741 > var9 && var13 - 13 < var10 && var10 < var13 + 4 && var12.field4960) {
                    arg0.method516(class642.field9012 + var2, var13 + -12, class624.field8741, 16, 255 - class149.field2332 << 24 | class290.field4153, 1);
                }
                var11++;
            }
        }
        class559.method3265(true, class624.field8741, arg0, class642.field9012 + var2, class177.field2747 - -var3, class338.field4919, var8);
        if (class325.field4650) {
            int var22 = 0;
            for (class567 var23 = (class567) class673.field9386.method3508(-2); var23 != null; var23 = (class567) class673.field9386.method3507(-92)) {
                int var27 = class177.field2747 + (var22 * 16) + var3 + var8 + 13;
                var22++;
                if (var23.field8052 == 1) {
                    class517.method3051((class342) var23.field8055.field8521.field6156, (byte) -95, var9, class177.field2747 + var3, class346.field4999 | 0xFF000000, var10, class338.field4919, var27, arg0, class624.field8741, class642.field9012 + var2, class433.field6447 | 0xFF000000);
                } else {
                    class505.method3000(class624.field8741, var23, class642.field9012 + var2, arg0, var9, 3, class177.field2747 + var3, class338.field4919, var10, var27, class346.field4999 | 0xFF000000, class433.field6447 | 0xFF000000);
                }
            }
            if (class218.field3211 != null) {
                int var24 = 0;
                for (class342 var25 = (class342) class218.field3211.field8055.method3508(-2); var25 != null; var25 = (class342) class218.field3211.field8055.method3507(-10)) {
                    int var26 = var24 * 16 + var8 + class304.field4300 + 13;
                    var24++;
                    class517.method3051(var25, (byte) -115, var9, class304.field4300, class346.field4999 | 0xFF000000, var10, class128.field1706, var26, arg0, class600.field8491, class582.field8289, class433.field6447 | 0xFF000000);
                }
                class595.method3468(class582.field8289, -121, class304.field4300, class600.field8491, class128.field1706);
            }
        } else {
            int var19 = 0;
            for (class342 var20 = (class342) class748.field10459.method1195(0); var20 != null; var20 = (class342) class748.field10459.method1201(2)) {
                int var21 = var5 + 13 - (-var8 - (class68.field969 - (var19 + 1)) * 16);
                class517.method3051(var20, (byte) -122, var9, var5, class346.field4999 | 0xFF000000, var10, var7, var21, arg0, var6, var4, class433.field6447 | 0xFF000000);
                var19++;
            }
        }
        class595.method3468(class642.field9012 + var2, -95, class177.field2747 + var3, class624.field8741, class338.field4919);
        if (arg1 >= -4) {
            field9158 = null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IB)V", line = 274)
    public static final void method3776(int arg0, byte arg1) {
        field9156++;
        class150 var2 = class676.method3885(1000, 7, arg0);
        var2.method1115(true);
        if (arg1 != -114) {
            field9155 = null;
        }
    }
}
