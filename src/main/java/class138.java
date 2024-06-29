import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class138 extends class64 {

    @OriginalMember(owner = "client!pd", name = "Q", descriptor = "Lcd;")
    public static class23 field2845 = class54.method414("(U1", -1);

    @OriginalMember(owner = "client!pd", name = "S", descriptor = "I")
    public static int field2847 = 0;

    @OriginalMember(owner = "client!pd", name = "V", descriptor = "I")
    public static int field2850 = 0;

    @OriginalMember(owner = "client!pd", name = "U", descriptor = "B")
    public static byte field2849 = 0;

    @OriginalMember(owner = "client!pd", name = "X", descriptor = "Lcd;")
    public static class23 field2852 = class54.method414("", -1);

    @OriginalMember(owner = "client!pd", name = "P", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!pd", name = "R", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!pd", name = "W", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!pd", name = "Y", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!pd", name = "Z", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!pd", name = "ab", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!pd", name = "T", descriptor = "Lea;")
    public static class38 field2848;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BI[Lcd;I)Lcd;")
    public static final class23 method878(byte arg0, int arg1, class23[] arg2, int arg3) {
        ++field2851;
        if (arg0 >= -59) {
            field2849 = 105;
        }
        int var4 = 0;
        for (int var5 = 0; arg3 > var5; ++var5) {
            if (arg2[arg1 + var5] == null) {
                arg2[arg1 + var5] = class177.field3517;
            }
            var4 += arg2[arg1 + var5].field473;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; arg3 > var8; ++var8) {
            class23 var10 = arg2[arg1 + var8];
            class93.method611(var10.field480, 0, var6, var7, var10.field473);
            var7 += var10.field473;
        }
        class23 var9 = new class23();
        var9.field480 = var6;
        var9.field473 = var4;
        return var9;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILgb;III)V")
    public static final void method879(int arg0, class57 arg1, int arg2, int arg3, int arg4) {
        ++field2844;
        if (arg4 != -26615) {
            field2852 = null;
        }
        if (class134.field2790 != arg1) {
            if (class49.field1171 < 400) {
                class23 var5;
                if (arg1.field1320 == 0) {
                    var5 = class3.method14(true, new class23[] { arg1.field1345, class165.method1011(-1, class134.field2790.field1341, arg1.field1341), class55.field1297, class150.field3005, class184.method1132(-1, arg1.field1341), class182.field3594 });
                } else {
                    var5 = class3.method14(true, new class23[] { arg1.field1345, class55.field1297, class111.field2355, class184.method1132(-1, arg1.field1320), class182.field3594 });
                }
                if (class47.field1013 == 1) {
                    class162.method993(arg0, arg2, 21, class170.field3390, arg4 ^ -32572, class3.method14(true, new class23[] { class183.field3609, class155.field3103, var5 }), arg3);
                    ++class132.field2730;
                } else if (class73.field1660) {
                    if (~(8 & class166.field3312) == -9) {
                        ++class80.field1744;
                        class162.method993(arg0, arg2, 11, class124.field2550, arg4 ^ -32572, class3.method14(true, new class23[] { class136.field2819, class155.field3103, var5 }), arg3);
                    }
                } else {
                    for (int var6 = 7; var6 >= 0; --var6) {
                        if (class109.field2320[var6] != null) {
                            short var8 = 0;
                            ++class160.field3198;
                            if (!class109.field2320[var6].method146(arg4 + 26540, class134.field2792)) {
                                if (class98.field2095[var6]) {
                                    var8 = 2000;
                                }
                            } else {
                                if (~class134.field2790.field1341 > ~arg1.field1341) {
                                    var8 = 2000;
                                }
                                if (~class134.field2790.field1335 != -1 && arg1.field1335 != 0) {
                                    if (~class134.field2790.field1335 != ~arg1.field1335) {
                                        var8 = 0;
                                    } else {
                                        var8 = 2000;
                                    }
                                }
                            }
                            boolean var9 = false;
                            int var10 = class53.field1257[var6] + var8;
                            class162.method993(arg0, arg2, var10, class109.field2320[var6], 6349, class3.method14(true, new class23[] { class202.field3998, var5 }), arg3);
                        }
                    }
                }
                for (int var7 = 0; class49.field1171 > var7; ++var7) {
                    if (class103.field2201[var7] == 39) {
                        class81.field1771[var7] = class3.method14(true, new class23[] { class202.field3998, var5 });
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
    public class138() {
        super(1, true);
    }

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "(I)V")
    public static void method880(int arg0) {
        field2852 = null;
        field2848 = null;
        field2845 = null;
        if (arg0 != 0) {
            method881(111, (Component) null);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field2853;
        int[] var3 = super.field1513.method1033(-116, arg0);
        if (arg1 != -9421) {
            return null;
        } else {
            if (super.field1513.field3368) {
                int[][] var4 = this.method482(0, arg0, (byte) -125);
                int[] var5 = var4[1];
                int[] var6 = var4[2];
                int[] var7 = var4[0];
                for (int var8 = 0; class168.field3367 > var8; ++var8) {
                    var3[var8] = (var7[var8] - -var6[var8] + var5[var8]) / 3;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method881(int arg0, Component arg1) {
        arg1.removeKeyListener(class176.field3499);
        ++field2846;
        arg1.removeFocusListener(class176.field3499);
        class66.field1560 = arg0;
    }
}
