import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class400 extends class383 {

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "I")
    public int field5707;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "I")
    public int field5703;

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "[I")
    public static int[] field5708;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "I")
    public static int field5702;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "I")
    public static int field5704;

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
    public static int field5705;

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "I")
    public static int field5706;

    static {
        new class335("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        new class335("Adventurer", "Abenteurer", "Aventurier", "Aventureira");
        field5708 = new int[500];
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V", line = 4)
    public static final void method2370(int arg0) {
        if (arg0 >= 60) {
            class248.field3187.method2642(0);
            field5702++;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IZIZI)V", line = 16)
    public static final void method2371(int arg0, boolean arg1, int arg2, boolean arg3, int arg4) {
        field5704++;
        if (!arg1 && class75.field963 == arg4 && class169.field2170 == arg2 && class415.field5926 == class276.field3488 || class407.field5817.method580(class377.field4959, (byte) -35)) {
            return;
        }
        class75.field963 = arg4;
        class415.field5926 = class276.field3488;
        class169.field2170 = arg2;
        if (class407.field5817.method580(class377.field4959, (byte) -35)) {
            class415.field5926 = 0;
        }
        class284.method1677(-20429, arg0);
        class151.method990(class460.field6579, (byte) 42, class101.field1225.method1936(-26539, class11.field177), true);
        int var5 = class441.field6317;
        class441.field6317 = (class75.field963 - (class452.field6526 >> 4)) * 8;
        int var6 = class320.field4064;
        class320.field4064 = (class169.field2170 - (class440.field6307 >> 4)) * 8;
        class443.field6361 = class241.method1455(class75.field963 * 8, class169.field2170 * 8);
        class452.field6528 = null;
        int var7 = class441.field6317 - var5;
        int var8 = class320.field4064 - var6;
        if (arg0 == 10) {
            for (int var9 = 0; var9 < 32768; var9++) {
                class295 var10 = class187.field2446[var9];
                if (var10 != null) {
                    for (int var11 = 0; var11 < 10; var11++) {
                        var10.field4944[var11] -= var7;
                        var10.field4936[var11] -= var8;
                    }
                    var10.field2677 -= var8 * 128;
                    var10.field2666 -= var7 * 128;
                }
            }
        } else {
            class489.field7114 = 0;
            int var12 = (class452.field6526 - 1) * 128;
            int var13 = class440.field6307 * 128 - 128;
            for (int var14 = 0; var14 < 32768; var14++) {
                class295 var22 = class187.field2446[var14];
                if (var22 != null) {
                    var22.field2677 -= var8 * 128;
                    var22.field2666 -= var7 * 128;
                    if (var22.field2666 >= 0 && var12 >= var22.field2666 && var22.field2677 >= 0 && var13 >= var22.field2677) {
                        boolean var23 = true;
                        for (int var24 = 0; var24 < 10; var24++) {
                            var22.field4944[var24] -= var7;
                            var22.field4936[var24] -= var8;
                            if (var22.field4944[var24] < 0 || var22.field4944[var24] >= class452.field6526 || var22.field4936[var24] < 0 || class440.field6307 <= var22.field4936[var24]) {
                                var23 = false;
                            }
                        }
                        if (var23) {
                            class403.field5735[class489.field7114++] = var14;
                        } else {
                            class187.field2446[var14].method1731(-16385, null);
                            class187.field2446[var14] = null;
                        }
                    } else {
                        class187.field2446[var14].method1731(-16385, null);
                        class187.field2446[var14] = null;
                    }
                }
            }
        }
        for (int var15 = 0; var15 < 2048; var15++) {
            class223 var20 = class387.field5107[var15];
            if (var20 != null) {
                for (int var21 = 0; var21 < 10; var21++) {
                    var20.field4944[var21] -= var7;
                    var20.field4936[var21] -= var8;
                }
                var20.field2677 -= var8 * 128;
                var20.field2666 -= var7 * 128;
            }
        }
        class277[] var16 = class147.field1869;
        for (int var17 = 0; var17 < var16.length; var17++) {
            class277 var19 = var16[var17];
            if (var19 != null) {
                var19.field3507 -= var7 * 128;
                var19.field3503 -= var8 * 128;
            }
        }
        class94.method724(false, var7, var8);
        for (class495 var18 = (class495) class223.field2817.method153(0); var18 != null; var18 = (class495) class223.field2817.method161(-105)) {
            var18.field7186 -= var8;
            var18.field7193 -= var7;
            if (class387.field5108 != 3 && (var18.field7193 < 0 || var18.field7186 < 0 || var18.field7193 >= class452.field6526 || class440.field6307 <= var18.field7186)) {
                var18.method2165(16225);
            }
        }
        if (class274.field3441 != 0) {
            class247.field3176 -= var8;
            class274.field3441 -= var7;
        }
        class292.method1712((byte) -124);
        if (arg0 != 10) {
            class450.field6452 -= var8;
            class212.field2731 -= var7;
            class445.field6382 -= var7;
            class193.field2500 -= var8 * 128;
            class310.field3971 -= var7 * 128;
            class253.field3222 -= var8;
            if (Math.abs(var7) > class452.field6526 || Math.abs(var8) > class440.field6307) {
                class38.method340(-21936);
            }
        } else if (class142.field1835 == 4) {
            class238.field3047 -= var7 * 128;
            class119.field1603 -= var7 * 128;
            class527.field7783 -= var8 * 128;
            class56.field740 -= var8 * 128;
        } else {
            class142.field1835 = 1;
        }
        class489.method2967(0);
        class2.method5(arg3);
        class418.field5939.method154(7491);
        class529.field7799.method154(7491);
        class214.field2754.method2095(87);
        class491.method2975(-1);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V", line = 240)
    public static void method2372(byte arg0) {
        field5708 = null;
        if (arg0 != 98) {
            field5708 = null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIFILhs;FFFIF)[B", line = 250)
    public static final byte[] method2373(int arg0, int arg1, int arg2, float arg3, int arg4, class215 arg5, float arg6, float arg7, float arg8, int arg9, float arg10) {
        if (arg0 == 128) {
            field5705++;
            byte[] var11 = new byte[arg1 * arg2 * arg4];
            class443.method2617(arg5, arg3, -3495, arg7, arg10, 0, arg6, arg8, arg4, var11, arg1, arg2, arg9);
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)Lrh;", line = 271)
    public static final class174 method2374(int arg0, int arg1) {
        int var2 = -48 % ((14 - arg0) / 37);
        field5706++;
        class174 var3 = (class174) class498.field7218.method2647(-101, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class261.field3307.method481(1, arg1, -114);
        class174 var5 = new class174();
        var5.field2260 = arg1;
        if (var4 != null) {
            var5.method1117((byte) 109, new class463(var4));
        }
        var5.method1114(-25173);
        if (var5.field2252 == 2 && class40.field509.method2022(-1, (long) arg1) == null) {
            class40.field509.method2019((byte) -128, new class101(class436.field6241), (long) arg1);
            class423.field5989[class436.field6241++] = var5;
        }
        class498.field7218.method2635((long) arg1, -26591, var5);
        return var5;
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(II)V", line = 314)
    public class400(int arg0, int arg1) {
        this.field5707 = arg1;
        this.field5703 = arg0;
    }
}
