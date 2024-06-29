import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class40 extends class126 {

    @OriginalMember(owner = "client!we", name = "lb", descriptor = "Ljava/lang/Object;")
    private Object field925;

    @OriginalMember(owner = "client!we", name = "X", descriptor = "Lvf;")
    public static class265 field911 = class87.method582(-46, " s(West d-Bconnect-B)3");

    @OriginalMember(owner = "client!we", name = "fb", descriptor = "Lvf;")
    public static class265 field919 = class87.method582(-46, ":allyreq:");

    @OriginalMember(owner = "client!we", name = "Z", descriptor = "I")
    public static int field913 = 5063219;

    @OriginalMember(owner = "client!we", name = "jb", descriptor = "Lvf;")
    private static class265 field923 = class87.method582(-46, "Loaded world list data");

    @OriginalMember(owner = "client!we", name = "kb", descriptor = "[Lvf;")
    public static class265[] field924 = new class265[500];

    @OriginalMember(owner = "client!we", name = "ib", descriptor = "Lvf;")
    public static class265 field922 = field923;

    @OriginalMember(owner = "client!we", name = "V", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!we", name = "W", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!we", name = "Y", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!we", name = "ab", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!we", name = "bb", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!we", name = "cb", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!we", name = "db", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!we", name = "eb", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!we", name = "gb", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!we", name = "hb", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "(B)V")
    public static void method333(byte arg0) {
        field924 = null;
        field911 = null;
        field923 = null;
        field919 = null;
        field922 = null;
        if (arg0 < 125) {
            method334(88, 82);
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(II)V")
    public static final void method334(int arg0, int arg1) {
        int var2 = 100 % ((4 - arg0) / 63);
        field917++;
        if (arg1 >= 0 && class246.field4282.length > arg1) {
            class246.field4282[arg1] = !class246.field4282[arg1];
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ZD)V")
    public static final void method335(boolean arg0, double arg1) {
        if (arg0) {
            return;
        }
        if (class19.field508 != arg1) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
                class172.field3109[var3] = var4 <= 255 ? var4 : 255;
            }
            class19.field508 = arg1;
        }
        field921++;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IILng;)Lvf;")
    public static final class265 method336(int arg0, int arg1, class135 arg2) {
        field912++;
        try {
            class265 var3 = new class265();
            var3.field4640 = arg2.method947(27126);
            if (var3.field4640 > arg0) {
                var3.field4640 = arg0;
            }
            var3.field4643 = new byte[var3.field4640];
            arg2.field2449 += class265.field4656.method1239(arg2.field2483, false, var3.field4643, var3.field4640, arg1, arg2.field2449);
            return var3;
        } catch (Exception var4) {
            return class97.field1717;
        }
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "(I)Z")
    public final boolean method337(int arg0) {
        field915++;
        if (arg0 != 710) {
            field913 = 18;
        }
        return false;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lfg;IZ)V")
    public static final void method338(class181 arg0, int arg1, boolean arg2) {
        int var3 = arg0.field3217;
        field916++;
        int var4 = (int) arg0.field393;
        arg0.method97(arg1 + 160);
        if (arg2) {
            class108.method716(var3, true);
        }
        class7.method52(118, var3);
        class6 var5 = class21.method204(var4, -16257);
        if (var5 != null) {
            class176.method1145((byte) -35, var5);
        }
        int var6 = class120.field2129;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class117.method786((byte) 69, class118.field2079[var7])) {
                class43.method362(-121, var7);
            }
        }
        if (~class120.field2129 == arg1) {
            class50.field1049 = false;
            class169.method1117(-98, class172.field3103, class182.field3227, class130.field2335, class279.field4926);
        } else {
            class169.method1117(-94, class172.field3103, class182.field3227, class130.field2335, class279.field4926);
            int var8 = class205.field3692.method754(class103.field1833);
            for (int var9 = 0; var9 < class120.field2129; var9++) {
                int var10 = class205.field3692.method754(class118.method798(var9, 1927674668));
                if (var10 > var8) {
                    var8 = var10;
                }
            }
            class279.field4926 = var8 + 8;
            class172.field3103 = class120.field2129 * 15 + (class97.field1711 ? 26 : 22);
        }
        if (class8.field271 != -1) {
            class93.method637(1, class8.field271, arg1 + 106);
        }
    }

    @OriginalMember(owner = "client!we", name = "e", descriptor = "(B)V")
    public static final void method339(byte arg0) {
        field918++;
        for (class142 var1 = (class142) class53.field1105.method789((byte) -102); var1 != null; var1 = (class142) class53.field1105.method787((byte) -76)) {
            if (var1.field2640 == -1) {
                var1.field2627 = 0;
                class225.method1523(-5366, var1);
            } else {
                var1.method97(158);
            }
        }
        if (arg0 != 68) {
            field919 = null;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILbl;III)V")
    public static final void method340(int arg0, class268 arg1, int arg2, int arg3, int arg4) {
        field909++;
        if (class120.field2129 >= 400) {
            return;
        }
        if (arg1.field4755 != null) {
            arg1 = arg1.method1825(20656);
        }
        if (arg1 == null || !arg1.field4775) {
            return;
        }
        class265 var5 = arg1.field4770;
        if (arg2 != 4) {
            return;
        }
        if (arg1.field4729 != 0) {
            class265 var6 = class229.field4051 == 1 ? class8.field276 : class237.field4144;
            var5 = class148.method1022(10, new class265[] { var5, class45.method379(arg1.field4729, class214.field3827.field2177, 16777215), class163.field2974, var6, class241.method1609(true, arg1.field4729), class176.field3142 });
        }
        if (class282.field4969 == 1) {
            class228.field4044++;
            class182.method1213(false, class205.field3694, (short) 57, class148.method1022(10, new class265[] { class9.field305, class207.field3728, var5 }), class104.field1846, arg0, (long) arg3, arg4);
        } else if (!class25.field695) {
            class36.field852++;
            class265[] var7 = arg1.field4772;
            if (class225.field3998) {
                var7 = class172.method1134(var7, -97);
            }
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && (class229.field4051 != 0 || !var7[var8].method1791(class171.field3093, (byte) -98))) {
                        byte var9 = 0;
                        class125.field2240++;
                        int var10 = -1;
                        if (var8 == 0) {
                            var9 = 39;
                        }
                        if (var8 == 1) {
                            var9 = 60;
                        }
                        if (arg1.field4747 == var8) {
                            var10 = arg1.field4757;
                        }
                        if (var8 == 2) {
                            var9 = 34;
                        }
                        if (var8 == 3) {
                            var9 = 30;
                        }
                        if (var8 == 4) {
                            var9 = 41;
                        }
                        if (arg1.field4732 == var8) {
                            var10 = arg1.field4741;
                        }
                        class182.method1213(false, var7[var8], var9, class148.method1022(10, new class265[] { class147.field2753, var5 }), var10, arg0, (long) arg3, arg4);
                    }
                }
            }
            if (class229.field4051 == 0 && var7 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var7[var11] != null && var7[var11].method1791(class171.field3093, (byte) -98)) {
                        class267.field4708++;
                        short var12 = 0;
                        if (class214.field3827.field2177 < arg1.field4729) {
                            var12 = 2000;
                        }
                        short var13 = 0;
                        if (var11 == 0) {
                            var13 = 39;
                        }
                        if (var11 == 1) {
                            var13 = 60;
                        }
                        if (var11 == 2) {
                            var13 = 34;
                        }
                        if (var11 == 3) {
                            var13 = 30;
                        }
                        if (var11 == 4) {
                            var13 = 41;
                        }
                        if (var13 != 0) {
                            var13 += var12;
                        }
                        class182.method1213(false, var7[var11], var13, class148.method1022(arg2 + 6, new class265[] { class147.field2753, var5 }), arg1.field4749, arg0, (long) arg3, arg4);
                    }
                }
            }
            class182.method1213(false, class72.field1379, (short) 1007, class148.method1022(10, new class265[] { class147.field2753, var5 }), class277.field4885, arg0, (long) arg3, arg4);
        } else if ((class38.field874 & 0x2) == 2) {
            class182.method1213(false, class239.field4170, (short) 21, class148.method1022(10, new class265[] { class130.field2286, class207.field3728, var5 }), -1, arg0, (long) arg3, arg4);
            class110.field1926++;
            return;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)Ljava/lang/Object;")
    public final Object method341(boolean arg0) {
        if (arg0) {
            this.method337(123);
        }
        field914++;
        return this.field925;
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class40(Object arg0) {
        this.field925 = arg0;
    }
}
