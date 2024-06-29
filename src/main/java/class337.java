import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class337 {

    @OriginalMember(owner = "client!dp", name = "o", descriptor = "[I")
    private int[] field5285 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!dp", name = "s", descriptor = "[I")
    public static int[] field5289 = new int[14];

    @OriginalMember(owner = "client!dp", name = "u", descriptor = "Z")
    public static boolean field5291;

    @OriginalMember(owner = "client!dp", name = "t", descriptor = "Lfr;")
    public static class231 field5290;

    @OriginalMember(owner = "client!dp", name = "v", descriptor = "Llo;")
    public static class306 field5292;

    @OriginalMember(owner = "client!dp", name = "w", descriptor = "Llo;")
    public static class306 field5293;

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "I")
    public static int field5272;

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "I")
    public static int field5273;

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "I")
    public static int field5274;

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "I")
    public static int field5275;

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!dp", name = "g", descriptor = "I")
    public static int field5277;

    @OriginalMember(owner = "client!dp", name = "h", descriptor = "I")
    public static int field5278;

    @OriginalMember(owner = "client!dp", name = "k", descriptor = "I")
    public static int field5281;

    @OriginalMember(owner = "client!dp", name = "l", descriptor = "I")
    public static int field5282;

    @OriginalMember(owner = "client!dp", name = "n", descriptor = "I")
    public static int field5284;

    @OriginalMember(owner = "client!dp", name = "p", descriptor = "I")
    public static int field5286;

    @OriginalMember(owner = "client!dp", name = "j", descriptor = "Lkg;")
    public class217 field5280;

    @OriginalMember(owner = "client!dp", name = "q", descriptor = "[I")
    private int[] field5287;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "[S")
    private short[] field5271;

    @OriginalMember(owner = "client!dp", name = "i", descriptor = "[S")
    private short[] field5279;

    @OriginalMember(owner = "client!dp", name = "m", descriptor = "[S")
    private short[] field5283;

    @OriginalMember(owner = "client!dp", name = "r", descriptor = "[S")
    private short[] field5288;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)Z")
    public final boolean method2119(int arg0) {
        field5277++;
        boolean var2 = true;
        class496 var3 = this.field5280.field3774;
        synchronized (this.field5280.field3774) {
            if (arg0 <= 118) {
                return false;
            }
            for (int var5 = 0; var5 < 5; var5++) {
                if (this.field5285[var5] != -1 && !this.field5280.field3774.method2928(this.field5285[var5], false, 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(ZLza;)V")
    public static final void method2120(boolean arg0, class491 arg1) {
        field5275++;
        int var2 = class508.field7390;
        int var3 = class265.field4428;
        int var4 = class134.field2262;
        int var5 = class128.field2195;
        int var6 = -10660793;
        arg1.method2864(var3, (byte) 13, var4, var2, var5, var6);
        arg1.method2864(var3 + 1, (byte) 13, var4 - 2, var2 + 1, 16, -16777216);
        arg1.method2859(var4 - 2, -16777216, -110, var5 - 19, var3 - -18, var2 + 1);
        class127.field2188.method1903(-1, var2 + 3, var3 + 14, 0, var6, class467.field6930.method1954(class300.field4813, -30366));
        int var7 = class333.field5233.method1660(2766);
        int var8 = class333.field5233.method1655(-100);
        int var9 = 0;
        class162 var10 = (class162) class108.field1934.method2538(-3);
        if (arg0) {
            return;
        }
        while (var10 != null) {
            int var11 = var3 + ((class480.field7080 + -1 - var9) * 16) + 31;
            short var12 = -1;
            if (var7 > var2 && var2 + var4 > var7 && var8 > var11 - 13 && var8 < (var11 + 3) && var10.field2569) {
                var12 = -256;
            }
            int[] var13 = null;
            if (class420.method2579(var10.field2576, (byte) -116)) {
                var13 = class20.field218.method2221((int) var10.field2578, -1).field1732;
            } else if (var10.field2585 != -1) {
                var13 = class20.field218.method2221(var10.field2585, -1).field1732;
            } else if (class63.method416(var10.field2576, true)) {
                class505 var14 = (class505) class147.field2396.method2516((long) ((int) var10.field2578), -1);
                if (var14 != null) {
                    class265 var15 = var14.field7355;
                    class510 var16 = var15.field4430;
                    if (var16.field7448 != null) {
                        var16 = var16.method3000(1, class327.field5160);
                    }
                    if (var16 != null) {
                        var13 = var16.field7476;
                    }
                }
            } else if (class479.method2823(var10.field2576, -30256)) {
                Object var17 = null;
                class39 var18;
                if (var10.field2576 == 1011) {
                    var18 = class61.field928.method791((int) var10.field2578, true);
                } else {
                    var18 = class61.field928.method791((int) (var10.field2578 >>> 32 & 0x7FFFFFFFL), !arg0);
                }
                if (var18.field575 != null) {
                    var18 = var18.method296(-1008, class327.field5160);
                }
                if (var18 != null) {
                    var13 = var18.field632;
                }
            }
            String var19 = class209.method1367(var10, (byte) 43);
            if (var13 != null) {
                var19 = var19 + class367.method2331(-125, var13);
            }
            class127.field2188.method1904(var12, class315.field4961, var2 + 3, class491.field7177, 0, var19, var11, (byte) 66);
            if (var10.field2577) {
                class387.field5966.method1039(class84.field1467.method2085((byte) -104, var19) + var2 + 5, var11 + -12);
            }
            var9++;
            var10 = (class162) class108.field1934.method2535((byte) -68);
        }
        class419.method2577(class128.field2195, class508.field7390, 63, class265.field4428, class134.field2262);
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(I)Lko;")
    public final class227 method2121(int arg0) {
        field5284++;
        class227[] var2 = new class227[arg0];
        int var3 = 0;
        class496 var4 = this.field5280.field3774;
        synchronized (this.field5280.field3774) {
            int var5 = 0;
            while (true) {
                if (var5 >= 5) {
                    break;
                }
                if (this.field5285[var5] != -1) {
                    var2[var3++] = class280.method1839(arg0 - 3, 0, this.field5280.field3774, this.field5285[var5]);
                }
                var5++;
            }
        }
        for (int var6 = 0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field3936 < 13) {
                var2[var6].method1571(arg0 ^ 0xFFFFE76D, 0);
            }
        }
        class227 var7 = new class227(var2, var3);
        if (this.field5271 != null) {
            for (int var8 = 0; var8 < this.field5271.length; var8++) {
                var7.method1580(this.field5279[var8], this.field5271[var8], (byte) -98);
            }
        }
        if (this.field5283 != null) {
            for (int var9 = 0; var9 < this.field5283.length; var9++) {
                var7.method1578((byte) 98, this.field5288[var9], this.field5283[var9]);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "(I)V")
    public static void method2122(int arg0) {
        field5292 = null;
        field5289 = null;
        field5293 = null;
        field5290 = null;
        int var1 = -102 / ((59 - arg0) / 42);
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IILia;)V")
    private final void method2123(int arg0, int arg1, class23 arg2) {
        if (arg0 != 0) {
            this.field5271 = null;
        }
        if (arg1 == 1) {
            arg2.method126((byte) -118);
        } else if (arg1 == 2) {
            int var4 = arg2.method126((byte) -77);
            this.field5287 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5287[var5] = arg2.method132(class53.method369(arg0, 34));
            }
        } else if (arg1 != 3) {
            if (arg1 == 40) {
                int var6 = arg2.method126((byte) -106);
                this.field5279 = new short[var6];
                this.field5271 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field5271[var7] = (short) arg2.method132(23);
                    this.field5279[var7] = (short) arg2.method132(arg0 + 78);
                }
            } else if (arg1 == 41) {
                int var8 = arg2.method126((byte) -117);
                this.field5288 = new short[var8];
                this.field5283 = new short[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field5283[var9] = (short) arg2.method132(94);
                    this.field5288[var9] = (short) arg2.method132(120);
                }
            } else if (arg1 >= 60 && arg1 < 70) {
                this.field5285[arg1 - 60] = arg2.method132(class53.method369(arg0, 113));
            }
        }
        field5272++;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Ljava/lang/String;CI)I")
    public static final int method2124(String arg0, char arg1, int arg2) {
        field5278++;
        int var3 = 0;
        int var4 = arg0.length();
        int var5 = -94 % ((-arg2 - 66) / 35);
        for (int var6 = 0; var6 < var4; var6++) {
            if (arg1 == arg0.charAt(var6)) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(B)Z")
    public final boolean method2125(byte arg0) {
        field5274++;
        if (this.field5287 == null) {
            return true;
        }
        boolean var2 = true;
        class496 var3 = this.field5280.field3774;
        synchronized (this.field5280.field3774) {
            if (arg0 < 115) {
                this.field5271 = null;
            }
            for (int var4 = 0; var4 < this.field5287.length; var4++) {
                if (!this.field5280.field3774.method2928(this.field5287[var4], false, 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "(I)V")
    public static final void method2126(int arg0) {
        class231 var1 = class322.field5060;
        synchronized (class322.field5060) {
            class322.field5060.method1604(4);
        }
        field5282++;
        class231 var2 = class241.field4158;
        synchronized (class241.field4158) {
            int var3 = 86 / ((arg0 - 68) / 52);
            class241.field4158.method1604(4);
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Z)Lko;")
    public final class227 method2127(boolean arg0) {
        field5286++;
        if (this.field5287 == null) {
            return null;
        }
        class227[] var2 = new class227[this.field5287.length];
        if (!arg0) {
            return null;
        }
        class496 var3 = this.field5280.field3774;
        synchronized (this.field5280.field3774) {
            int var4 = 0;
            while (true) {
                if (var4 >= this.field5287.length) {
                    break;
                }
                var2[var4] = class280.method1839(2, 0, this.field5280.field3774, this.field5287[var4]);
                var4++;
            }
        }
        for (int var5 = 0; var5 < this.field5287.length; var5++) {
            if (var2[var5].field3936 < 13) {
                var2[var5].method1571(-6296, 0);
            }
        }
        class227 var6;
        if (var2.length == 1) {
            var6 = var2[0];
        } else {
            var6 = new class227(var2, var2.length);
        }
        if (var6 == null) {
            return null;
        }
        if (this.field5271 != null) {
            for (int var7 = 0; var7 < this.field5271.length; var7++) {
                var6.method1580(this.field5279[var7], this.field5271[var7], (byte) -90);
            }
        }
        if (this.field5283 != null) {
            for (int var8 = 0; var8 < this.field5283.length; var8++) {
                var6.method1578((byte) 98, this.field5288[var8], this.field5283[var8]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(CBI)C")
    public static final char method2128(char arg0, byte arg1, int arg2) {
        field5276++;
        if (arg1 >= -14) {
            method2131();
        }
        if (arg0 >= 'À' && arg0 <= 'ÿ') {
            if (arg0 >= 'À' && arg0 <= 'Æ') {
                return 'A';
            }
            if (arg0 == 'Ç') {
                return 'C';
            }
            if (arg0 >= 'È' && arg0 <= 'Ë') {
                return 'E';
            }
            if (arg0 >= 'Ì' && arg0 <= 'Ï') {
                return 'I';
            }
            if (arg0 == 'Ñ' && arg2 != 0) {
                return 'N';
            }
            if (arg0 >= 'Ò' && arg0 <= 'Ö') {
                return 'O';
            }
            if (arg0 >= 'Ù' && arg0 <= 'Ü') {
                return 'U';
            }
            if (arg0 == 'Ý') {
                return 'Y';
            }
            if (arg0 == 'ß') {
                return 's';
            }
            if (arg0 >= 'à' && arg0 <= 'æ') {
                return 'a';
            }
            if (arg0 == 'ç') {
                return 'c';
            }
            if (arg0 >= 'è' && arg0 <= 'ë') {
                return 'e';
            }
            if (arg0 >= 'ì' && arg0 <= 'ï') {
                return 'i';
            }
            if (arg0 == 'ñ' && arg2 != 0) {
                return 'n';
            }
            if (arg0 >= 'ò' && arg0 <= 'ö') {
                return 'o';
            }
            if (arg0 >= 'ù' && arg0 <= 'ü') {
                return 'u';
            }
            if (arg0 == 'ý' || arg0 == 'ÿ') {
                return 'y';
            }
        }
        if (arg0 == 'Œ') {
            return 'O';
        } else if (arg0 == 'œ') {
            return 'o';
        } else if (arg0 == 'Ÿ') {
            return 'Y';
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(BC)Z")
    public static final boolean method2129(byte arg0, char arg1) {
        field5273++;
        if (arg1 >= ' ' && arg1 <= '~') {
            return true;
        }
        if (arg0 != 102) {
            method2129((byte) -100, (char) 65412);
        }
        if (arg1 >= ' ' && arg1 <= 'ÿ') {
            return true;
        } else {
            return arg1 == '€' || arg1 == 'Œ' || arg1 == '—' || arg1 == 'œ' || arg1 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lia;B)V")
    public final void method2130(class23 arg0, byte arg1) {
        if (arg1 != -128) {
            return;
        }
        while (true) {
            int var3 = arg0.method126((byte) -86);
            if (var3 == 0) {
                field5281++;
                return;
            }
            this.method2123(arg1 + 128, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "()V")
    public static final void method2131() {
        if (class417.field6321 != null) {
            for (int var0 = 0; var0 < class417.field6321.length; var0++) {
                for (int var1 = 0; var1 < class236.field4089; var1++) {
                    for (int var2 = 0; var2 < class276.field4537; var2++) {
                        if (class417.field6321[var0][var1][var2] != null) {
                            class417.field6321[var0][var1][var2].method2765(-91);
                        }
                        class417.field6321[var0][var1][var2] = null;
                    }
                }
            }
        }
        class417.field6321 = null;
        class511.field7488 = null;
        if (class213.field3395 != null) {
            for (int var3 = 0; var3 < class213.field3395.length; var3++) {
                for (int var4 = 0; var4 < class236.field4089; var4++) {
                    for (int var5 = 0; var5 < class276.field4537; var5++) {
                        if (class213.field3395[var3][var4][var5] != null) {
                            class213.field3395[var3][var4][var5].method2765(91);
                        }
                        class213.field3395[var3][var4][var5] = null;
                    }
                }
            }
        }
        class213.field3395 = null;
        class320.field5039 = null;
        class66.field977 = null;
        class360.field5592 = null;
        class244.field4189 = 0;
        if (class252.field4299 != null) {
            for (int var6 = 0; var6 < class244.field4189; var6++) {
                class252.field4299[var6] = null;
            }
        }
        if (class271.field4497 != null) {
            for (int var7 = 0; var7 < class510.field7453; var7++) {
                class271.field4497[var7] = null;
            }
            class510.field7453 = 0;
        }
        if (class435.field6486 != null) {
            for (int var8 = 0; var8 < class38.field572; var8++) {
                class435.field6486[var8] = null;
            }
            for (int var9 = 0; var9 < class76.field1315; var9++) {
                for (int var10 = 0; var10 < class236.field4089; var10++) {
                    for (int var11 = 0; var11 < class276.field4537; var11++) {
                        class355.field5541[var9][var10][var11] = 0L;
                    }
                }
            }
            class38.field572 = 0;
        }
        class76.field1314 = null;
        class394.method2465(-22670);
        class20.field221.method566(true);
        class374.field5819 = null;
        class526.field7761 = null;
        class495.field7234 = null;
        class424.field6390 = null;
        class475.field7038 = null;
        class81.field1439 = null;
    }

    static {
        new class306("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
        field5291 = false;
        field5290 = new class231(200);
        field5292 = new class306("M", "M", "M", "M");
        field5293 = new class306(" more options", " weitere Optionen", " autres options", " mais opções");
    }
}
