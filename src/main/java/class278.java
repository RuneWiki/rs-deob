import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class278 extends class390 {

    @OriginalMember(owner = "client!nm", name = "B", descriptor = "I")
    private int field3906;

    @OriginalMember(owner = "client!nm", name = "n", descriptor = "I")
    public int field3892;

    @OriginalMember(owner = "client!nm", name = "x", descriptor = "I")
    private int field3902;

    @OriginalMember(owner = "client!nm", name = "w", descriptor = "I")
    private int field3901;

    @OriginalMember(owner = "client!nm", name = "A", descriptor = "I")
    private int field3905;

    @OriginalMember(owner = "client!nm", name = "r", descriptor = "I")
    public int field3896;

    @OriginalMember(owner = "client!nm", name = "s", descriptor = "I")
    private int field3897;

    @OriginalMember(owner = "client!nm", name = "o", descriptor = "I")
    public int field3893;

    @OriginalMember(owner = "client!nm", name = "y", descriptor = "I")
    public int field3903;

    @OriginalMember(owner = "client!nm", name = "q", descriptor = "Lup;")
    public static class150 field3895 = new class150(8);

    @OriginalMember(owner = "client!nm", name = "j", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!nm", name = "k", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!nm", name = "l", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!nm", name = "m", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!nm", name = "p", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!nm", name = "t", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!nm", name = "u", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!nm", name = "z", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!nm", name = "v", descriptor = "[Lsg;")
    public static class226[] field3900;

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "(B)V")
    public static final void method1809(byte arg0) {
        if (arg0 < 107) {
            field3895 = null;
        }
        class148.field2091.method905((byte) 102);
        field3894++;
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(III)Z")
    public final boolean method1810(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            this.field3892 = 89;
        }
        field3889++;
        return arg0 >= this.field3906 && this.field3902 >= arg0 && arg2 >= this.field3901 && arg2 <= this.field3897;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lkr;)V")
    public static final void method1811(class447 arg0) {
        for (int var1 = arg0.field6261; var1 <= arg0.field6272; var1++) {
            for (int var2 = arg0.field6258; var2 <= arg0.field6264; var2++) {
                class125 var3 = class328.field4549[arg0.field6267][var1][var2];
                if (var3 != null) {
                    class123 var4 = var3.field1749;
                    class123 var5 = null;
                    while (var4 != null) {
                        if (var4.field1709 == arg0) {
                            if (var5 == null) {
                                var3.field1749 = var4.field1711;
                            } else {
                                var5.field1711 = var4.field1711;
                            }
                            var4.method833(500);
                            break;
                        }
                        var5 = var4;
                        var4 = var4.field1711;
                    }
                    var3.field1745 = 0;
                    for (class123 var6 = var3.field1749; var6 != null; var6 = var6.field1711) {
                        var3.field1745 = (byte) (var3.field1745 | var6.field1708);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "(B)V")
    public static void method1812(byte arg0) {
        field3895 = null;
        field3900 = null;
        if (arg0 != 108) {
            method1809((byte) -112);
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIZ)Z")
    public final boolean method1813(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            field3898++;
            return this.field3896 <= arg1 && this.field3903 >= arg1 && arg0 >= this.field3892 && this.field3893 >= arg0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "([IIII)V")
    public final void method1814(int[] arg0, int arg1, int arg2, int arg3) {
        arg0[1] = this.field3896 + arg3 - this.field3906;
        field3891++;
        if (arg2 == 26582) {
            arg0[2] = this.field3892 - (this.field3901 - arg1);
            arg0[0] = 0;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(BI[II)V")
    public final void method1815(byte arg0, int arg1, int[] arg2, int arg3) {
        arg2[2] = arg1 + this.field3901 - this.field3892;
        arg2[1] = this.field3906 + arg3 - this.field3896;
        arg2[0] = this.field3905;
        field3888++;
        if (arg0 != -24) {
            method1812((byte) -21);
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IZII)Z")
    public final boolean method1816(int arg0, boolean arg1, int arg2, int arg3) {
        if (!arg1) {
            method1812((byte) -18);
        }
        field3904++;
        return this.field3905 == arg2 && this.field3906 <= arg3 && this.field3902 >= arg3 && arg0 >= this.field3901 && arg0 <= this.field3897;
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(IIIIIIIII)V")
    public class278(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field3906 = arg1;
        this.field3892 = arg6;
        this.field3902 = arg3;
        this.field3901 = arg2;
        this.field3905 = arg0;
        this.field3896 = arg5;
        this.field3897 = arg4;
        this.field3893 = arg8;
        this.field3903 = arg7;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Loo;Loo;IIIIZIII)V")
    public static final void method1817(class374 arg0, class374 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        field3890++;
        int var10 = arg0.method937(1);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class226 var12 = (class226) class425.field5992.method904(false, (long) var10);
        if (var12 == null) {
            class238[] var13 = class238.method1617(class212.field2969, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class64.field949.method105(var13[0], true);
            class425.field5992.method902((long) var10, (byte) 112, var12);
        }
        class54.method441(arg1.field6266, 0, arg4, arg1.method942(!arg6) * 64, arg1.field6262, 15415, arg9 >> 1, arg2 >> 1, arg7);
        int var14 = class48.field682[0] + arg8 - 18;
        int var15 = arg3 / 4 * 18 + var14;
        if (!arg6) {
            return;
        }
        int var16 = class48.field682[1] + arg5 - 16 - 54;
        int var17 = arg3 % 4 * 18 + var16;
        var12.method1501(var15, var17);
        if (arg0 == arg1) {
            class64.field949.method2188(18, 18, var15 - 1, var17 + -1, -256, (byte) -34);
        }
        class91 var18 = class203.method1319(false);
        var18.field1277 = var15 + 16;
        var18.field1273 = var17;
        var18.field1274 = var15;
        var18.field1279 = arg0;
        var18.field1276 = var17 + 16;
        class447.field6259.method1009(var18, false);
    }
}
