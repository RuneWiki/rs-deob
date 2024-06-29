import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class436 extends class449 {

    @OriginalMember(owner = "client!vd", name = "I", descriptor = "I")
    public static int field6202 = 0;

    @OriginalMember(owner = "client!vd", name = "y", descriptor = "Lrc;")
    public static class108 field6192 = new class108(80, 6);

    @OriginalMember(owner = "client!vd", name = "L", descriptor = "Z")
    public static boolean field6205 = false;

    @OriginalMember(owner = "client!vd", name = "O", descriptor = "Lch;")
    public static class151 field6208;

    @OriginalMember(owner = "client!vd", name = "P", descriptor = "[[S")
    public static short[][] field6209;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
    public int field6184;

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "I")
    public int field6185;

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "I")
    public int field6186;

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "I")
    public int field6187;

    @OriginalMember(owner = "client!vd", name = "u", descriptor = "I")
    public static int field6188;

    @OriginalMember(owner = "client!vd", name = "v", descriptor = "I")
    public static int field6189;

    @OriginalMember(owner = "client!vd", name = "w", descriptor = "I")
    public int field6190;

    @OriginalMember(owner = "client!vd", name = "x", descriptor = "I")
    public static int field6191;

    @OriginalMember(owner = "client!vd", name = "z", descriptor = "I")
    public static int field6193;

    @OriginalMember(owner = "client!vd", name = "A", descriptor = "I")
    public int field6194;

    @OriginalMember(owner = "client!vd", name = "B", descriptor = "I")
    public int field6195;

    @OriginalMember(owner = "client!vd", name = "C", descriptor = "I")
    public int field6196;

    @OriginalMember(owner = "client!vd", name = "D", descriptor = "I")
    public int field6197;

    @OriginalMember(owner = "client!vd", name = "E", descriptor = "I")
    public int field6198;

    @OriginalMember(owner = "client!vd", name = "F", descriptor = "I")
    public int field6199;

    @OriginalMember(owner = "client!vd", name = "G", descriptor = "I")
    public static int field6200;

    @OriginalMember(owner = "client!vd", name = "H", descriptor = "I")
    public int field6201;

    @OriginalMember(owner = "client!vd", name = "J", descriptor = "I")
    public int field6203;

    @OriginalMember(owner = "client!vd", name = "K", descriptor = "I")
    public int field6204;

    @OriginalMember(owner = "client!vd", name = "N", descriptor = "I")
    public int field6207;

    @OriginalMember(owner = "client!vd", name = "Q", descriptor = "I")
    public static int field6210;

    @OriginalMember(owner = "client!vd", name = "M", descriptor = "Lis;")
    public static class65 field6206;

    // $FF: synthetic field
    @OriginalMember(owner = "client!vd", name = "R", descriptor = "Ljava/lang/Class;")
    public static Class field6211;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(I)V")
    public static void method2662(int arg0) {
        field6192 = null;
        field6208 = null;
        if (arg0 == 26123) {
            field6209 = null;
            field6206 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILvc;I)Ln;")
    public final class468 method2663(int arg0, class89 arg1, int arg2) {
        field6188++;
        int var4 = class161.field2334[this.field6197];
        if (arg0 > -29) {
            method2662(-99);
        }
        if (var4 == 0) {
            class421 var5 = class133.method991(this.field6198, this.field6199, this.field6184);
            if (var5 instanceof class281) {
                class281 var6 = (class281) var5;
                if (var6.field4037 != null) {
                    return ((class210) var6.field4037).method76((byte) -106, arg2, arg1);
                }
            }
        } else if (var4 == 1) {
            class371 var11 = class418.method2504(this.field6198, this.field6199, this.field6184);
            if (var11 instanceof class366) {
                class366 var12 = (class366) var11;
                if (var12.field5032 != null) {
                    return ((class210) var12.field5032).method76((byte) -106, arg2, arg1);
                }
            }
        } else if (var4 == 2) {
            class325 var7 = class106.method847(this.field6198, this.field6199, this.field6184, field6211 == null ? (field6211 = method2669("dc")) : field6211);
            if (var7 instanceof class158) {
                class158 var8 = (class158) var7;
                if (var8.field2253 != null) {
                    return ((class210) var8.field2253).method76((byte) -106, arg2, arg1);
                }
            }
        } else if (var4 == 3) {
            class390 var9 = class86.method730(this.field6198, this.field6199, this.field6184);
            if (var9 instanceof class469) {
                class469 var10 = (class469) var9;
                if (var10.field6616 != null) {
                    return ((class210) var10.field6616).method76((byte) -106, arg2, arg1);
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILgf;BI)V")
    public static final void method2664(int arg0, class39 arg1, byte arg2, int arg3) {
        if (arg2 != 4) {
            method2667((byte) -119, -16);
        }
        field6191++;
        if (arg1.field5742 == arg0 && arg0 != -1) {
            class303 var4 = class386.field5289.method1856(64, arg0);
            int var5 = var4.field4289;
            if (var5 == 1) {
                arg1.field5789 = 0;
                arg1.field5781 = 1;
                arg1.field5770 = 0;
                arg1.field5800 = 0;
                arg1.field5773 = arg3;
                class178.method1275(arg1.field5789, class262.field3781 == arg1, false, arg1.field4531, arg1.field4537, var4, arg1.field4530);
            }
            if (var5 == 2) {
                arg1.field5800 = 0;
                return;
            }
        } else if (arg0 == -1 || arg1.field5742 == -1 || class386.field5289.method1856(120, arg0).field4307 >= class386.field5289.method1856(16, arg1.field5742).field4307) {
            arg1.field5781 = 1;
            arg1.field5789 = 0;
            arg1.field5742 = arg0;
            arg1.field5809 = arg1.field5810;
            arg1.field5773 = arg3;
            arg1.field5800 = 0;
            arg1.field5770 = 0;
            if (arg1.field5742 == -1) {
                return;
            }
            class178.method1275(arg1.field5789, class262.field3781 == arg1, false, arg1.field4531, arg1.field4537, class386.field5289.method1856(arg2 ^ 0x1E, arg1.field5742), arg1.field4530);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILkk;)Lol;")
    public static final class264 method2665(int arg0, class161 arg1) {
        if (arg0 >= -127) {
            field6206 = null;
        }
        arg1.method1172((byte) 110);
        field6189++;
        int var2 = arg1.method1172((byte) 115);
        class264 var3 = class480.method2832(var2, (byte) 122);
        var3.field3809 = arg1.method1172((byte) -107);
        int var4 = arg1.method1172((byte) -112);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method1172((byte) 65);
            var3.method7((byte) 36, arg1, var6);
        }
        var3.method95(-8);
        return var3;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lvc;)V")
    public static final void method2666(class89 arg0) {
        for (int var1 = class350.field4832; var1 < class310.field4398; var1++) {
            for (int var2 = 0; var2 < class310.field4401; var2++) {
                for (int var3 = 0; var3 < class97.field1374; var3++) {
                    class52 var4 = class385.field5285[var1][var2][var3];
                    if (var4 != null) {
                        class421 var5 = var4.field772;
                        class421 var6 = var4.field752;
                        if (var5 != null && var5.method68(-67)) {
                            class6.method36(arg0, var5, var1, var2, var3, 1, 1);
                            if (var6 != null && var6.method68(-93)) {
                                class6.method36(arg0, var6, var1, var2, var3, 1, 1);
                                var6.method70(false, 74, arg0, 0, 0, var5, 0);
                                var6.method75((byte) 111);
                            }
                            var5.method75((byte) 111);
                        }
                        for (class131 var7 = var4.field763; var7 != null; var7 = var7.field1796) {
                            class325 var9 = var7.field1803;
                            if (var9 != null && var9.method68(-60)) {
                                class6.method36(arg0, var9, var1, var2, var3, var9.field4526 + 1 - var9.field4535, var9.field4534 - var9.field4539 + 1);
                                var9.method75((byte) 111);
                            }
                        }
                        class390 var8 = var4.field758;
                        if (var8 != null && var8.method68(111)) {
                            class468.method2785(arg0, var8, var1, var2, var3);
                            var8.method75((byte) 111);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BI)V")
    public static final void method2667(byte arg0, int arg1) {
        class114.field1601 = new int[arg1];
        if (arg0 != 13) {
            method2666((class89) null);
        }
        class176.field2670 = new int[arg1];
        field6193++;
        class239.field3504 = new int[arg1];
        class173.field2641 = new int[arg1];
        class363.field4999 = new int[arg1];
    }

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "(I)V")
    public static final void method2668(int arg0) {
        field6200++;
        if (class347.field4787 == 10 || class347.field4787 == 28) {
            class411.method2458(class135.field1884 >> 10, class184.field2784 >> 10, 5000, (byte) 104);
        } else if (class262.field3781.field4537 >= 0 && class36.field388 * 128 > class262.field3781.field4537 && class262.field3781.field4530 >= 0 && class262.field3781.field4530 < (class68.field998 * 128)) {
            class411.method2458(class262.field3781.field5811[0] >> 3, class262.field3781.field5807[0] >> 3, 5000, (byte) 16);
        } else {
            class411.method2458(class36.field388 >> 4, class68.field998 >> 4, 5000, (byte) 29);
        }
        class344.method2142(false);
        class131.method978(-126);
        class388.method2354(arg0 ^ arg0);
        class377.method2305(arg0 ^ 0xFFFF846E);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2669(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class151("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        field6208 = new class151("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");
        field6209 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };
    }
}
