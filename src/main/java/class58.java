import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class58 extends class108 {

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "Z")
    public static boolean field897 = false;

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "Lul;")
    public static class51 field899 = new class51(50);

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "Ljava/lang/String;")
    public static String field902 = "";

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BIIIIIIII)V", line = 6)
    public static final void method524(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = 0;
        int var10 = 113 % ((arg0 - 13) / 61);
        while (class222.field3708.field4814 > var9) {
            if (class222.field3708.method2095(24454, var9)) {
                int[] var11 = class38.field552.method2253(class222.field3708.field4822[var9] & 0x3FFF, (class222.field3708.field4822[var9] & 0xFFFDED9) >> 14, (class222.field3708.field4822[var9] & 0x35A0830D) >> 28, 76);
                if (var11 != null) {
                    int var12 = var11[1] - class341.field5444;
                    int var13 = class304.field4825 - (var11[2] + -class259.field4201) - 1;
                    int var14 = (arg5 - arg1) * (var12 - arg8) / (arg2 - arg8) + arg1;
                    int var15 = arg7 + ((var13 - arg4) * (arg3 - arg7) / (arg6 - arg4));
                    int var16 = 16777215;
                    class61 var17 = null;
                    int var18 = class222.field3708.method2093(var9, 3);
                    if (var18 == 0) {
                        if ((double) class185.field3143 == 3.0D) {
                            var17 = class91.field1438;
                        }
                        if ((double) class185.field3143 == 4.0D) {
                            var17 = class84.field1358;
                        }
                        if ((double) class185.field3143 == 6.0D) {
                            var17 = class168.field2931;
                        }
                        if ((double) class185.field3143 >= 8.0D) {
                            var17 = class195.field3306;
                        }
                    }
                    if (var18 == 1) {
                        if ((double) class185.field3143 == 3.0D) {
                            var17 = class168.field2931;
                        }
                        if ((double) class185.field3143 == 4.0D) {
                            var17 = class195.field3306;
                        }
                        if ((double) class185.field3143 == 6.0D) {
                            var17 = class246.field3991;
                        }
                        if ((double) class185.field3143 >= 8.0D) {
                            var17 = class105.field1756;
                        }
                    }
                    if (var18 == 2) {
                        if ((double) class185.field3143 == 3.0D) {
                            var17 = class246.field3991;
                        }
                        var16 = 16755200;
                        if ((double) class185.field3143 == 4.0D) {
                            var17 = class105.field1756;
                        }
                        if ((double) class185.field3143 == 6.0D) {
                            var17 = class282.field4466;
                        }
                        if ((double) class185.field3143 >= 8.0D) {
                            var17 = class287.field4581;
                        }
                    }
                    if (class222.field3708.field4816[var9] != -1) {
                        var16 = class222.field3708.field4816[var9];
                    }
                    if (var17 != null) {
                        int var19 = class99.field1605.method2235(class222.field3708.field4819[var9], (int[]) null, class221.field3688);
                        int var20 = var15 - (var19 - 1) * var17.method560() / 2;
                        int var21 = var20 + var17.method559() / 2;
                        for (int var22 = 0; var22 < var19; var22++) {
                            String var23 = class221.field3688[var22];
                            if ((var19 - 1) > var22) {
                                var23 = var23.substring(0, var23.length() - 4);
                            }
                            var17.method561(var23, var14, var21, var16, true);
                            var21 += var17.method560();
                        }
                    }
                }
            }
            var9++;
        }
        field896++;
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "(I)Lwb;", line = 131)
    public static final class171 method525(int arg0) {
        field898++;
        if (arg0 > -62) {
            return (class171) null;
        }
        int var1 = class39.field585[0] * class123.field2138[0];
        byte[] var2 = class191.field3205[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class40.field600[class36.method319(255, var2[var4])];
        }
        class171 var5;
        if (class43.field680) {
            var5 = new class157(class308.field4901, class4.field58, class352.field5575[0], class104.field1743[0], class39.field585[0], class123.field2138[0], var3);
        } else {
            var5 = new class309(class308.field4901, class4.field58, class352.field5575[0], class104.field1743[0], class39.field585[0], class123.field2138[0], var3);
        }
        class15.method151(0);
        return var5;
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(II)V", line = 164)
    public static final void method526(int arg0, int arg1) {
        class38.field567 = 20;
        if (arg1 != 0) {
            method528((class59) null, 104, (Frame) null);
        }
        class185.field3140 = 3;
        class189.field3182 = arg0;
        field895++;
    }

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "(I)V", line = 182)
    public static void method527(int arg0) {
        if (arg0 != 26) {
            method528((class59) null, 27, (Frame) null);
        }
        field899 = null;
        field902 = null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lwe;ILjava/awt/Frame;)V", line = 196)
    public static final void method528(class59 arg0, int arg1, Frame arg2) {
        while (true) {
            class45 var3 = arg0.method547(arg2, -69);
            while (var3.field709 == 0) {
                class142.method1149(10L, (byte) 125);
            }
            if (var3.field709 == 1) {
                field900++;
                arg2.setVisible(false);
                arg2.dispose();
                if (arg1 != 15270) {
                    method528((class59) null, 43, (Frame) null);
                }
                return;
            }
            class142.method1149(100L, (byte) 124);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZLtl;I)V", line = 225)
    public static final void method529(boolean arg0, class228 arg1, int arg2) {
        field894++;
        int var3 = arg1.field3833;
        int var4 = (int) arg1.field5062;
        arg1.method2195(-1);
        if (arg0) {
            class329.method2281(1023, var3);
        }
        class91.method793((byte) -49, var3);
        class137 var5 = class146.method1167(1169843632, var4);
        if (var5 != null) {
            class258.method1793(var5, 0);
        }
        int var6 = class293.field4708;
        if (arg2 != 50) {
            field901 = 113;
        }
        for (int var7 = 0; var7 < var6; var7++) {
            if (class17.method171((byte) -114, class276.field4401[var7])) {
                class172.method1351(var7, (byte) -65);
            }
        }
        if (class293.field4708 == 1) {
            class207.field3515 = false;
            class33.method300(class292.field4678, arg2 ^ 0x2C00, class42.field621, class68.field1114, class213.field3590);
        } else {
            class33.method300(class292.field4678, arg2 + 11264, class42.field621, class68.field1114, class213.field3590);
            int var8 = class177.field3014.method2223(class5.field74);
            for (int var9 = 0; var9 < class293.field4708; var9++) {
                int var10 = class177.field3014.method2223(class352.method2453(var9, 27884));
                if (var10 > var8) {
                    var8 = var10;
                }
            }
            class292.field4678 = (class177.field3007 ? 26 : 22) + class293.field4708 * 15;
            class68.field1114 = var8 + 8;
        }
        if (class311.field4933 != -1) {
            class291.method1991(class311.field4933, -28554, 1);
        }
    }
}
