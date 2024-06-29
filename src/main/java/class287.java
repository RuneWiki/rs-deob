import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class287 {

    @OriginalMember(owner = "client!le", name = "b", descriptor = "Lsv;")
    public static class617 field3637 = new class617();

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public static int field3638;

    // $FF: synthetic field
    @OriginalMember(owner = "client!le", name = "d", descriptor = "Ljava/lang/Class;")
    public static Class field3639;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field3636;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
    public static void method1726(int arg0) {
        field3637 = null;
        if (arg0 != -6830) {
            field3637 = null;
        }
        field3636 = null;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V")
    public static final void method1727(int arg0) {
        field3638++;
        for (class605 var1 = (class605) class170.field1992.method1909(true); var1 != null; var1 = (class605) class170.field1992.method1916((byte) 94)) {
            if (class407.field5237 == null) {
                var1.method1566(-73);
            } else if (class665.field9027 >= var1.field8146) {
                int var2 = class158.field1876[var1.field8155];
                if (var2 == 0) {
                    class567 var3 = class593.method3281(var1.field8158, var1.field8157, var1.field8141);
                    if (var3 instanceof class21) {
                        class82.method628(var1.field8158, var1.field8157, var1.field8141);
                        class21 var4 = (class21) var3;
                        if (var4.field226 != null) {
                            class437.method2405(var1.field8158, var1.field8157, var1.field8141, var4.field226, null);
                        }
                    }
                } else if (var2 == 1) {
                    class539 var9 = class546.method2924(var1.field8158, var1.field8157, var1.field8141);
                    if (var9 instanceof class322) {
                        class305.method1817(var1.field8158, var1.field8157, var1.field8141);
                        class322 var10 = (class322) var9;
                        if (var10.field4004 != null) {
                            class8.method32(var1.field8158, var1.field8157, var1.field8141, var10.field4004, null);
                        }
                    }
                } else if (var2 == 2) {
                    class597 var5 = class513.method2796(var1.field8158, var1.field8157, var1.field8141, field3639 == null ? (field3639 = method1728("pba")) : field3639);
                    if (var5 instanceof class484) {
                        class288.method1731(var1.field8158, var1.field8157, var1.field8141, field3639 == null ? (field3639 = method1728("pba")) : field3639);
                        class484 var6 = (class484) var5;
                        if (var6.field6007 != null) {
                            class223.method1332(var6.field6007, false);
                        }
                    }
                } else if (var2 == 3) {
                    class445 var7 = class618.method3444(var1.field8158, var1.field8157, var1.field8141);
                    if (var7 instanceof class471) {
                        class167.method1014(var1.field8158, var1.field8157, var1.field8141);
                        class471 var8 = (class471) var7;
                        if (var8.field5820 != null) {
                            class331.method1898(var1.field8158, var1.field8157, var1.field8141, var8.field5820);
                        }
                    }
                }
                var1.method1566(-59);
            } else if (class665.field9027 == var1.field8153) {
                int var11 = class158.field1876[var1.field8155];
                if (var11 == 0) {
                    class567 var21 = class593.method3281(var1.field8158, var1.field8157, var1.field8141);
                    if (var21 instanceof class21) {
                        var1.method1566(-56);
                    } else if (class229.method1382(var1.field8158, var1.field8157, var1.field8141) == null) {
                        class21 var22 = new class21(var1.field8155, var1.field8147, var1.field8142, var1.field8150, var1.field8156, var21);
                        class437.method2405(var1.field8158, var1.field8157, var1.field8141, var22, null);
                    } else {
                        var1.method1566(-63);
                    }
                } else if (var11 == 1) {
                    class539 var12 = class546.method2924(var1.field8158, var1.field8157, var1.field8141);
                    if (var12 instanceof class322) {
                        var1.method1566(-101);
                    } else if (class180.method1065(var1.field8158, var1.field8157, var1.field8141) == null) {
                        class322 var13 = new class322(var1.field8155, var1.field8147, var1.field8142, var1.field8150, var1.field8156, var12);
                        class8.method32(var1.field8158, var1.field8157, var1.field8141, var13, null);
                    } else {
                        var1.method1566(-104);
                    }
                } else if (var11 == 2) {
                    class597 var16 = class513.method2796(var1.field8158, var1.field8157, var1.field8141, field3639 == null ? (field3639 = method1728("pba")) : field3639);
                    if (var16 instanceof class484) {
                        var1.method1566(arg0 - 98);
                    } else {
                        class288.method1731(var1.field8158, var1.field8157, var1.field8141, field3639 == null ? (field3639 = method1728("pba")) : field3639);
                        class687 var17 = class232.field3017.method2358(0, var1.field8154);
                        int var18;
                        int var19;
                        if (var1.field8147 == 1 || var1.field8147 == 3) {
                            var19 = var17.field9395;
                            var18 = var17.field9459;
                        } else {
                            var18 = var17.field9395;
                            var19 = var17.field9459;
                        }
                        class484 var20 = new class484(var1.field8155, var1.field8147, var1.field8158, var1.field8142, var1.field8150, var1.field8156, var1.field8157, var19 + var1.field8157 - 1, var1.field8141, var1.field8141 + var18 - 1, var16);
                        class223.method1332(var20, false);
                    }
                } else if (var11 == 3) {
                    class445 var14 = class618.method3444(var1.field8158, var1.field8157, var1.field8141);
                    if (var14 instanceof class471) {
                        var1.method1566(-51);
                    } else {
                        class471 var15 = new class471(var1.field8142, var1.field8150, var1.field8156, var14);
                        class331.method1898(var1.field8158, var1.field8157, var1.field8141, var15);
                    }
                }
            }
        }
        if (arg0 != 2) {
            method1726(-76);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1728(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
