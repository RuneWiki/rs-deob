import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public abstract class class284 extends class209 {

    @OriginalMember(owner = "client!wa", name = "J", descriptor = "Luf;")
    private static class168 field4812 = class148.method1019(-1720, "Discard");

    @OriginalMember(owner = "client!wa", name = "G", descriptor = "Luf;")
    public static class168 field4809 = class148.method1019(-1720, ":duelfriend:");

    @OriginalMember(owner = "client!wa", name = "L", descriptor = "[I")
    public static int[] field4814 = new int[2];

    @OriginalMember(owner = "client!wa", name = "Q", descriptor = "Luf;")
    public static class168 field4818 = class148.method1019(-1720, "<col=ff7000>");

    @OriginalMember(owner = "client!wa", name = "S", descriptor = "I")
    public static int field4820 = -1;

    @OriginalMember(owner = "client!wa", name = "A", descriptor = "Luf;")
    public static class168 field4803 = field4812;

    @OriginalMember(owner = "client!wa", name = "w", descriptor = "I")
    public static int field4799;

    @OriginalMember(owner = "client!wa", name = "x", descriptor = "I")
    public static int field4800;

    @OriginalMember(owner = "client!wa", name = "y", descriptor = "I")
    public int field4801;

    @OriginalMember(owner = "client!wa", name = "z", descriptor = "I")
    public static int field4802;

    @OriginalMember(owner = "client!wa", name = "B", descriptor = "I")
    public int field4804;

    @OriginalMember(owner = "client!wa", name = "C", descriptor = "I")
    public int field4805;

    @OriginalMember(owner = "client!wa", name = "D", descriptor = "I")
    public static int field4806;

    @OriginalMember(owner = "client!wa", name = "E", descriptor = "I")
    public int field4807;

    @OriginalMember(owner = "client!wa", name = "F", descriptor = "I")
    public int field4808;

    @OriginalMember(owner = "client!wa", name = "I", descriptor = "I")
    public static int field4811;

    @OriginalMember(owner = "client!wa", name = "N", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!wa", name = "P", descriptor = "I")
    public int field4817;

    @OriginalMember(owner = "client!wa", name = "K", descriptor = "Ldk;")
    public static class241 field4813;

    @OriginalMember(owner = "client!wa", name = "M", descriptor = "[I")
    public static int[] field4815;

    @OriginalMember(owner = "client!wa", name = "R", descriptor = "[Lwa;")
    public static class284[] field4819;

    @OriginalMember(owner = "client!wa", name = "H", descriptor = "[[I")
    public static int[][] field4810;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "(B)V", line = 8)
    public static void method1959(byte arg0) {
        field4809 = null;
        if (arg0 < 13) {
            method1963((byte) 86, 26);
        }
        field4810 = (int[][]) null;
        field4815 = null;
        field4819 = null;
        field4814 = null;
        field4813 = null;
        field4803 = null;
        field4818 = null;
        field4812 = null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)V", line = 28)
    public static final void method1960(int arg0, int arg1, int arg2) {
        field4802++;
        if (arg1 == 4 && !client.field4939) {
            arg0 = 2;
            arg1 = 2;
        }
        if (arg2 != 15) {
            field4820 = -29;
        }
        if (class238.field3865 != arg1) {
            if (class8.field105) {
                return;
            }
            if (class238.field3865 != 0) {
                class155.field2456[class238.field3865].method50();
            }
            if (arg1 != 0) {
                class13 var3 = class155.field2456[arg1];
                var3.method49();
                var3.method47(arg0);
            }
            class138.field2133 = arg0;
            class238.field3865 = arg1;
        } else if (arg1 != 0 && class138.field2133 != arg0) {
            class155.field2456[arg1].method47(arg0);
            class138.field2133 = arg0;
        }
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(III)V", line = 94)
    public static final void method1961(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class300.field5087; var3++) {
            for (int var4 = 0; var4 < class117.field1821; var4++) {
                for (int var5 = 0; var5 < class244.field4160; var5++) {
                    class127 var6 = class92.field1424[var3][var4][var5];
                    if (var6 != null) {
                        class28 var7 = var6.field1981;
                        if (var7 != null && var7.field358.method670()) {
                            class303.method2062(var7.field358, var3, var4, var5, 1, 1);
                            if (var7.field361 != null && var7.field361.method670()) {
                                class303.method2062(var7.field361, var3, var4, var5, 1, 1);
                                var7.field358.method702(var7.field361, 0, 0, 0, false);
                                var7.field361 = var7.field361.method667(arg0, arg1, arg2);
                            }
                            var7.field358 = var7.field358.method667(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field1970; var8++) {
                            class91 var9 = var6.field1971[var8];
                            if (var9 != null && var9.field1408.method670()) {
                                class303.method2062(var9.field1408, var3, var4, var5, var9.field1406 + 1 - var9.field1410, var9.field1400 - var9.field1412 + 1);
                                var9.field1408 = var9.field1408.method667(arg0, arg1, arg2);
                            }
                        }
                        class292 var10 = var6.field1969;
                        if (var10 != null && var10.field4919.method670()) {
                            class283.method1953(var10.field4919, var3, var4, var5);
                            var10.field4919 = var10.field4919.method667(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IZ)Z", line = 167)
    public static final boolean method1962(int arg0, boolean arg1) {
        field4799++;
        if (arg0 < 0) {
            return false;
        }
        int var2 = class61.field804[arg0];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        if (!arg1) {
            field4809 = (class168) null;
        }
        return var2 == 1003;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BI)Lqj;", line = 196)
    public static final class238 method1963(byte arg0, int arg1) {
        field4806++;
        class238 var2 = (class238) class261.field4427.method1424((long) arg1, (byte) 120);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class70.field927.method1647(class194.method1366(arg1, (byte) 38), (byte) 127, class293.method2019(arg1, 20251));
        class238 var4 = new class238();
        int var5 = 111 % ((arg0 - 25) / 63);
        var4.field3873 = arg1;
        if (var3 != null) {
            var4.method1612(new class153(var3), (byte) -71);
        }
        var4.method1609(105);
        if (var4.field3811 != -1) {
            var4.method1611(method1963((byte) -82, var4.field3861), -1125, method1963((byte) 104, var4.field3811));
        }
        if (var4.field3855 != -1) {
            var4.method1610(method1963((byte) -128, var4.field3855), 2, method1963((byte) 114, var4.field3821));
        }
        if (!class259.field4397 && var4.field3858) {
            var4.field3875 = 0;
            var4.field3833 = class118.field1838;
            var4.field3867 = false;
            var4.field3868 = null;
            var4.field3849 = null;
        }
        class261.field4427.method1430(var4, (long) arg1, 13487);
        return var4;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I[Luf;BI)Luf;", line = 247)
    public static final class168 method1964(int arg0, class168[] arg1, byte arg2, int arg3) {
        field4816++;
        int var4 = 0;
        for (int var5 = 0; var5 < arg3; var5++) {
            if (arg1[arg0 + var5] == null) {
                arg1[arg0 + var5] = class63.field833;
            }
            var4 += arg1[arg0 + var5].field2692;
        }
        int var6 = 25 / ((28 - arg2) / 48);
        int var7 = 0;
        byte[] var8 = new byte[var4];
        for (int var9 = 0; var9 < arg3; var9++) {
            class168 var10 = arg1[arg0 + var9];
            class185.method1308(var10.field2716, 0, var8, var7, var10.field2692);
            var7 += var10.field2692;
        }
        class168 var11 = new class168();
        var11.field2692 = var4;
        var11.field2716 = var8;
        return var11;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(IIIII)V", line = 300)
    public final void method1965(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = this.field4817 << 3;
        int var7 = this.field4804 << 3;
        if (arg1 == 9183) {
            field4811++;
            int var8 = (arg2 << 4) + (var6 & 0xF);
            int var9 = (arg4 << 4) + (var7 & 0xF);
            this.method272(var6, var7, var8, var9, arg3, arg0);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIII)V")
    public abstract void method272(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)V")
    public abstract void method151(int arg0, int arg1);

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(III)V")
    public abstract void method268(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIII)V")
    public abstract void method262(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIII)V")
    public abstract void method264(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(II)V")
    public abstract void method152(int arg0, int arg1);

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(IIII)V")
    public abstract void method265(int arg0, int arg1, int arg2, int arg3);
}
