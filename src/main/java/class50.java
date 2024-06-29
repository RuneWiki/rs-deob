import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class50 extends class6 {

    @OriginalMember(owner = "client!vg", name = "U", descriptor = "Ljava/lang/Object;")
    private Object field635;

    @OriginalMember(owner = "client!vg", name = "ab", descriptor = "Lwl;")
    public static class452 field641 = new class452(102, 8);

    @OriginalMember(owner = "client!vg", name = "bb", descriptor = "[I")
    public static int[] field642 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!vg", name = "cb", descriptor = "Lnn;")
    public static class151 field643 = new class151("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!vg", name = "V", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!vg", name = "W", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!vg", name = "X", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!vg", name = "Y", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!vg", name = "Z", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "(B)V")
    public static void method283(byte arg0) {
        if (arg0 != 95) {
            field642 = null;
        }
        field642 = null;
        field641 = null;
        field643 = null;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Ltb;Ldh;ZLdr;Lfc;III)V")
    public static final void method284(class290 arg0, class227 arg1, boolean arg2, class261 arg3, class228 arg4, int arg5, int arg6, int arg7) {
        field639++;
        int var8 = arg1.field3441 - (arg5 / 2) - 5;
        int var9 = arg7 + 2;
        if (arg4.field3492 != 0) {
            arg3.method1615(arg5 + 10, arg4.field3492, arg0.method1795() * arg6 + (arg7 - var9) + 1, var8, var9, (byte) -119);
        }
        if (arg4.field3444 != 0) {
            arg3.method1621(arg0.method1795() * arg6 + arg7 + 1 - var9, var8, arg4.field3444, var9, -17638, arg5 + 10);
        }
        int var10 = arg4.field3464;
        if (!arg2) {
            field641 = null;
        }
        if (arg1.field3436 && arg4.field3448 != -1) {
            var10 = arg4.field3448;
        }
        for (int var11 = 0; var11 < arg6; var11++) {
            String var12 = class362.field5332[var11];
            if (arg6 - 1 > var11) {
                var12 = var12.substring(0, var12.length() - 4);
            }
            arg0.method1798(arg3, var12, arg1.field3441, arg7, var10, true);
            arg7 += arg0.method1795();
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Z)Z")
    public final boolean method53(boolean arg0) {
        field637++;
        return arg0 ? false : false;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIBI)V")
    public static final void method285(int arg0, int arg1, byte arg2, int arg3) {
        field638++;
        class451 var4 = class247.field3702[arg1][arg3];
        class186.method1133(arg0, var4 == null ? class446.field6560 : var4, 12921);
        int var5 = -69 / ((arg2 - 46) / 46);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(III)V")
    public static final void method286(int arg0, int arg1, int arg2) {
        class246.field3689++;
        if (arg0 != -17357) {
            field643 = null;
        }
        class177.method1082(class449.field6610, 0);
        field640++;
        class189.field2840.method2334(arg2, 1833667168);
        class189.field2840.method2357(arg1, (byte) -123);
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class50(Object arg0, int arg1) {
        super(arg1);
        this.field635 = arg0;
    }

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "(I)Ljava/lang/Object;")
    public final Object method54(int arg0) {
        field636++;
        return arg0 == 16 ? this.field635 : null;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lbs;Z)Z")
    public static final boolean method287(class141 arg0, boolean arg1) {
        boolean var2 = class307.field4638 == class154.field2118;
        int var3 = 0;
        arg0.method489(28155);
        if (arg0.field1895 < 0 || arg0.field1901 < 0 || arg0.field1890 >= class275.field4206 || arg0.field1889 >= class265.field4044) {
            return false;
        }
        for (int var4 = arg0.field1895; var4 <= arg0.field1890; var4++) {
            for (int var7 = arg0.field1901; var7 <= arg0.field1889; var7++) {
                class13 var8 = class230.method1395(arg0.field1902, var4, var7);
                if (var8 != null) {
                    int var9 = 0;
                    if (var4 > arg0.field1895) {
                        var9++;
                    }
                    if (var4 < arg0.field1890) {
                        var9 += 4;
                    }
                    if (var7 > arg0.field1901) {
                        var9 += 8;
                    }
                    if (var7 < arg0.field1889) {
                        var9 += 2;
                    }
                    class466 var10 = class358.method2153(arg0, (byte) -41, var9);
                    class466 var11 = var8.field151;
                    if (var11 == null) {
                        var8.field151 = var10;
                    } else {
                        while (var11.field6853 != null) {
                            var11 = var11.field6853;
                        }
                        var11.field6853 = var10;
                    }
                    var8.field141 = (byte) (var8.field141 | var9);
                }
                if (var2 && class246.field3684[var4][var7] != 0) {
                    var3 = class246.field3684[var4][var7];
                }
            }
        }
        if (var2 && var3 != 0) {
            for (int var5 = arg0.field1895; var5 <= arg0.field1890; var5++) {
                for (int var6 = arg0.field1901; var6 <= arg0.field1889; var6++) {
                    if (class246.field3684[var5][var6] == 0) {
                        class246.field3684[var5][var6] = var3;
                    }
                }
            }
        }
        if (arg1) {
            class360.field5318[class15.field190++] = arg0;
        }
        return true;
    }
}
