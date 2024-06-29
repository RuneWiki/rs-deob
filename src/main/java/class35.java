import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class35 {

    @OriginalMember(owner = "client!gp", name = "f", descriptor = "Lhu;")
    private class76 field530 = new class76(64);

    @OriginalMember(owner = "client!gp", name = "q", descriptor = "Lhu;")
    private class76 field541 = new class76(100);

    @OriginalMember(owner = "client!gp", name = "n", descriptor = "Lr;")
    private class110 field538;

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "Lgd;")
    public static class206 field527 = new class206("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

    @OriginalMember(owner = "client!gp", name = "o", descriptor = "Lgd;")
    public static class206 field539 = new class206("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

    @OriginalMember(owner = "client!gp", name = "r", descriptor = "I")
    public static int field542 = -1;

    @OriginalMember(owner = "client!gp", name = "s", descriptor = "Lgd;")
    public static class206 field543 = new class206("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!gp", name = "d", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!gp", name = "e", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!gp", name = "g", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!gp", name = "h", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!gp", name = "i", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!gp", name = "j", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!gp", name = "k", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!gp", name = "l", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!gp", name = "p", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!gp", name = "m", descriptor = "[I")
    public static int[] field537;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(B)V", line = 6)
    public static void method260(byte arg0) {
        field543 = null;
        field537 = null;
        if (arg0 != -108) {
            method264((byte) -56);
        }
        field527 = null;
        field539 = null;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lr;Lr;Z)V", line = 19)
    public static final void method261(class110 arg0, class110 arg1, boolean arg2) {
        if (!arg2) {
            class419.field5700 = arg1;
            field528++;
            class281.field3792 = arg0;
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(ILwm;)V", line = 33)
    public static final void method262(int arg0, class364 arg1) {
        field533++;
        int var2 = class2.field40;
        int var3 = class94.field1390;
        int var4 = class97.field1419;
        int var5 = class103.field1491 - 3;
        byte var6 = 20;
        if (class271.field3614 == null || class335.field4525 == null) {
            if (class473.field6525.method700((byte) -93, class312.field4110) && class473.field6525.method700((byte) 126, class12.field163)) {
                class271.field3614 = arg1.method2050(class325.method1817(class473.field6525, class312.field4110, 0), true);
                class325 var7 = class325.method1817(class473.field6525, class12.field163, 0);
                class335.field4525 = arg1.method2050(var7, true);
                var7.method1819();
                class311.field4105 = arg1.method2050(var7, true);
            } else {
                arg1.method2003(var2, var3, var4, var6, 255 - class282.field3798 << 24 | class39.field563, 1);
            }
        }
        if (class271.field3614 != null && class335.field4525 != null) {
            int var8 = (var4 - (class335.field4525.method775() * 2)) / class271.field3614.method775();
            for (int var9 = 0; var9 < var8; var9++) {
                class271.field3614.method836(var2 + class335.field4525.method775() + class271.field3614.method775() * var9, var3);
            }
            class335.field4525.method836(var2, var3);
            class311.field4105.method836((var2 + var4) - class311.field4105.method775(), var3);
        }
        class93.field1366.method2124(var2 + 3, -1, var3 + 14, class302.field4027 | 0xFF000000, (byte) -12, class13.field180.method1176(class110.field1676, (byte) -95));
        arg1.method2003(var2, var3 + var6, var4, var5 - var6, -class282.field3798 + 255 << 24 | class39.field563, 1);
        int var10 = class34.field523.method1916((byte) -21);
        int var11 = class34.field523.method1925(50);
        int var12 = arg0;
        for (class395 var13 = (class395) class450.field6121.method652((byte) 37); var13 != null; var13 = (class395) class450.field6121.method653(arg0 + 126)) {
            int var30 = (class475.field6540 - var12 - 1) * 16 + (var3 - (-var6 - 13));
            var12++;
            if (var2 < var10 && var10 < var2 + var4 && var11 > var30 - 13 && (var30 + 4) > var11 && var13.field5470) {
                arg1.method2003(var2, var30 - 12, var4, 16, class490.field6834 | 255 - class127.field1867 << 24, 1);
            }
        }
        if ((class210.field2839 == null || class412.field5639 == null || class17.field238 == null) && class473.field6525.method700((byte) 77, class441.field5950) && class473.field6525.method700((byte) 109, class94.field1396) && class473.field6525.method700((byte) 123, class109.field1634)) {
            class325 var14 = class325.method1817(class473.field6525, class94.field1396, 0);
            class412.field5639 = arg1.method2050(var14, true);
            var14.method1819();
            class8.field112 = arg1.method2050(var14, true);
            class210.field2839 = arg1.method2050(class325.method1817(class473.field6525, class441.field5950, 0), true);
            class325 var15 = class325.method1817(class473.field6525, class109.field1634, 0);
            class17.field238 = arg1.method2050(var15, true);
            var15.method1819();
            class206.field2788 = arg1.method2050(var15, true);
        }
        int var16 = 0;
        if (class210.field2839 != null && class412.field5639 != null && class17.field238 != null) {
            int var17 = (var4 - (class17.field238.method775() * 2)) / class210.field2839.method775();
            for (int var18 = 0; var18 < var17; var18++) {
                class210.field2839.method836(class17.field238.method775() + var2 + var18 * class210.field2839.method775(), var3 + var5 - class210.field2839.method771());
            }
            int var19 = (var5 - var6 - class17.field238.method771()) / class412.field5639.method771();
            for (int var20 = 0; var20 < var19; var20++) {
                class412.field5639.method836(var2, var3 + var6 + var20 * class412.field5639.method771());
                class8.field112.method836(var4 + var2 - class8.field112.method775(), var20 * class412.field5639.method771() + var6 + var3);
            }
            class17.field238.method836(var2, var3 + var5 - class17.field238.method771());
            class206.field2788.method836(var2 + var4 - class17.field238.method775(), var5 + var3 + -class17.field238.method771());
        }
        for (class395 var21 = (class395) class450.field6121.method652((byte) 37); var21 != null; var21 = (class395) class450.field6121.method653(29)) {
            int var22 = (class475.field6540 - var16 - 1) * 16 + var3 + var6 + 13;
            int var23 = class302.field4027 | 0xFF000000;
            if (var2 < var10 && var10 < (var2 + var4) && var11 > (var22 - 13) && var11 < (var22 + 4) && var21.field5470) {
                var23 = class164.field2274 | 0xFF000000;
            }
            int[] var24 = null;
            if (class346.method2135(var21.field5469, -14)) {
                var24 = class175.field2385.method1557((int) var21.field5480, arg0 + 21992).field5960;
            } else if (var21.field5478 != -1) {
                var24 = class175.field2385.method1557(var21.field5478, 21992).field5960;
            } else if (class215.method1218(var21.field5469, -6)) {
                class121 var27 = class221.field2941[(int) var21.field5480];
                if (var27 != null) {
                    class429 var28 = var27.field1780;
                    if (var28.field5824 != null) {
                        var28 = var28.method2531(class38.field562, arg0 ^ 0xFFFFFFD8);
                    }
                    if (var28 != null) {
                        var24 = var28.field5843;
                    }
                }
            } else if (class294.method1649((byte) 100, var21.field5469)) {
                Object var25 = null;
                class88 var26;
                if (var21.field5469 == 1010) {
                    var26 = class1.field23.method935((int) var21.field5480, (byte) -92);
                } else {
                    var26 = class1.field23.method935((int) (var21.field5480 >>> 32 & 0x7FFFFFFFL), (byte) 86);
                }
                if (var26.field1269 != null) {
                    var26 = var26.method574(-123, class38.field562);
                }
                if (var26 != null) {
                    var24 = var26.field1275;
                }
            }
            String var29 = class293.method1640((byte) 90, var21);
            if (var24 != null) {
                var29 = var29 + class279.method1573((byte) -50, var24);
            }
            class93.field1366.method2128(class143.field2061, class467.field6465, var2 + 3, var29, var22, 121, 0, var23);
            var16++;
            if (var21.field5468) {
                class274.field3629.method836(var2 + class392.field5448.method2145(var29, 13938) + 5, var22 + -12);
            }
        }
        class266.method1501(class94.field1390, -128, class2.field40, class103.field1491, class97.field1419);
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(II)Lnt;", line = 231)
    public final class134 method263(int arg0, int arg1) {
        field535++;
        if (arg0 != -16777216) {
            this.field538 = null;
        }
        class76 var3 = this.field541;
        class134 var4;
        synchronized (this.field541) {
            var4 = (class134) this.field541.method493((byte) 19, (long) arg1);
            if (var4 == null) {
                var4 = new class134(arg1);
                this.field541.method505((long) arg1, var4, 29);
            }
        }
        synchronized (var4) {
            return var4.method819(arg0 + 16777216) ? var4 : null;
        }
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(B)V", line = 261)
    public static final void method264(byte arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class278.field3687[var1] = false;
        }
        field534++;
        class358.field4957 = -1;
        class26.field335 = -1;
        class464.field6420 = 0;
        if (arg0 <= 13) {
            method262(118, (class364) null);
        }
        class56.field772 = 1;
        class447.field6087 = 0;
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(II)I", line = 285)
    public static final int method265(int arg0, int arg1) {
        if (arg0 == 271298152) {
            field526++;
            return arg1 >>> 8;
        } else {
            return 19;
        }
    }

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "(II)Lnb;", line = 298)
    public final class181 method266(int arg0, int arg1) {
        field525++;
        class76 var3 = this.field530;
        class181 var4;
        synchronized (this.field530) {
            var4 = (class181) this.field530.method493((byte) 19, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field538.method702((byte) -70, class410.method2460(22384, arg1), class480.method2800(125, arg1));
        class181 var6 = new class181();
        var6.field2477 = arg1;
        var6.field2483 = this;
        if (var5 != null) {
            var6.method1065(new class32(var5), -115);
        }
        var6.method1063(arg0 - 6238);
        class76 var7 = this.field530;
        synchronized (this.field530) {
            if (arg0 != 16107) {
                method261((class110) null, (class110) null, true);
            }
            this.field530.method505((long) arg1, var6, arg0 ^ 0x3EF6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 330)
    public static final int method267(String arg0, byte arg1) {
        field536++;
        int var2 = -58 % ((arg1 + 31) / 62);
        if (arg0 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < class90.field1317; var3++) {
            if (arg0.equalsIgnoreCase(class233.field3106[var3])) {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)V", line = 364)
    public final void method268(int arg0) {
        if (arg0 >= -34) {
            this.field530 = null;
        }
        class76 var2 = this.field530;
        synchronized (this.field530) {
            this.field530.method495(-77);
        }
        field529++;
        class76 var3 = this.field541;
        synchronized (this.field541) {
            this.field541.method495(-118);
        }
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(I)V", line = 380)
    public final void method269(int arg0) {
        class76 var2 = this.field530;
        synchronized (this.field530) {
            this.field530.method502(arg0);
        }
        field531++;
        class76 var3 = this.field541;
        synchronized (this.field541) {
            this.field541.method502(arg0);
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(ZI)V", line = 397)
    public final void method270(boolean arg0, int arg1) {
        field532++;
        class76 var3 = this.field530;
        synchronized (this.field530) {
            this.field530.method496(arg1, -45);
        }
        class76 var4 = this.field541;
        synchronized (this.field541) {
            this.field541.method496(arg1, -59);
            if (!arg0) {
                this.method270(true, -8);
            }
        }
    }

    @OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Ldn;ILr;Lr;Lr;)V", line = 424)
    public class35(class329 arg0, int arg1, class110 arg2, class110 arg3, class110 arg4) {
        this.field538 = arg2;
        if (this.field538 != null) {
            int var6 = this.field538.method705((byte) -109) - 1;
            this.field538.method694(var6, (byte) 119);
        }
        class354.method2179(arg3, (byte) 115, arg4);
    }
}
