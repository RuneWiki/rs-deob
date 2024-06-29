import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class330 extends class529 {

    @OriginalMember(owner = "client!bp", name = "q", descriptor = "I")
    public int field5185;

    @OriginalMember(owner = "client!bp", name = "l", descriptor = "Lgi;")
    public static class437 field5180 = null;

    @OriginalMember(owner = "client!bp", name = "o", descriptor = "Lss;")
    public static class213 field5183 = new class213("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

    @OriginalMember(owner = "client!bp", name = "r", descriptor = "S")
    public static short field5186 = 1;

    @OriginalMember(owner = "client!bp", name = "p", descriptor = "F")
    public static float field5184;

    @OriginalMember(owner = "client!bp", name = "m", descriptor = "I")
    public static int field5181;

    @OriginalMember(owner = "client!bp", name = "n", descriptor = "I")
    public static int field5182;

    @OriginalMember(owner = "client!bp", name = "s", descriptor = "I")
    public static int field5187;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V")
    public static void method2207(int arg0) {
        if (arg0 == -23939) {
            field5180 = null;
            field5183 = null;
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIII)V")
    public static final void method2208(int arg0, int arg1, int arg2, int arg3) {
        field5187++;
        String var4 = "tele " + arg2 + "," + (arg1 >> 6) + "," + (arg3 >> 6) + "," + (arg1 & 0x3F) + "," + (arg3 & 0x3F);
        if (arg0 < 106) {
            field5180 = null;
        }
        System.out.println(var4);
        class311.method2091(-17516, var4, false, true);
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lza;Ll;I)V")
    public static final void method2209(class497 arg0, class199 arg1, int arg2) {
        field5182++;
        if (class194.field2863 == null) {
            return;
        }
        if (class213.field3643 < 10) {
            if (!class194.field2868.method1001((byte) -56, class194.field2863.field4169)) {
                class213.field3643 = class52.field706.method1003(class194.field2863.field4169, 0) / 10;
                return;
            }
            class94.method646((byte) 81);
            class213.field3643 = 10;
        }
        if (class213.field3643 == 10) {
            class194.field2883 = class194.field2863.field4168 >> 6 << 6;
            class194.field2900 = class194.field2863.field4158 >> 6 << 6;
            class194.field2891 = (class194.field2863.field4177 >> 6 << 6) + 64 - class194.field2883;
            class194.field2894 = (class194.field2863.field4175 >> 6 << 6) + 64 - class194.field2900;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class194.field2863.method1757(0, (class358.field5565.field6410 >> 7) + class126.field1718, (class358.field5565.field6417 >> 7) + class453.field7018, class358.field5565.field6419, var3)) {
                var5 = var3[2] - class194.field2900;
                var4 = var3[1] - class194.field2883;
            }
            if (!class244.field3958 && var4 >= 0 && class194.field2891 > var4 && var5 >= 0 && class194.field2894 > var5) {
                int var6 = var4 + ((int) (Math.random() * 10.0D) - 5);
                int var7 = var5 + (int) (Math.random() * 10.0D) - 5;
                class297.field4679 = var7;
                class201.field3060 = var6;
            } else if (class257.field4156 == -1 || class122.field1663 == -1) {
                class194.field2863.method1763((byte) 69, class194.field2863.field4172 & 0x3FFF, class194.field2863.field4172 >> 14 & 0x3FFF, var3);
                class201.field3060 = var3[1] - class194.field2883;
                class297.field4679 = var3[2] - class194.field2900;
            } else {
                class194.field2863.method1763((byte) -91, class122.field1663, class257.field4156, var3);
                class244.field3958 = false;
                class122.field1663 = -1;
                class257.field4156 = -1;
                if (var3 != null) {
                    class201.field3060 = var3[1] - class194.field2883;
                    class297.field4679 = var3[2] - class194.field2900;
                }
            }
            if (class194.field2863.field4165 == 37) {
                class194.field2877 = 3.0F;
                class194.field2875 = 3.0F;
            } else if (class194.field2863.field4165 == 50) {
                class194.field2877 = 4.0F;
                class194.field2875 = 4.0F;
            } else if (class194.field2863.field4165 == 75) {
                class194.field2877 = 6.0F;
                class194.field2875 = 6.0F;
            } else if (class194.field2863.field4165 == 100) {
                class194.field2877 = 8.0F;
                class194.field2875 = 8.0F;
            } else if (class194.field2863.field4165 == 200) {
                class194.field2877 = 16.0F;
                class194.field2875 = 16.0F;
            } else {
                class194.field2877 = 8.0F;
                class194.field2875 = 8.0F;
            }
            class194.field2873 = (int) class194.field2877 >> 1;
            class194.field2872 = class482.method2971((byte) -47, class194.field2873);
            class100.method676(-122);
            class194.method1215();
            class541.field7908 = new class317();
            class194.field2880 += (int) (Math.random() * 5.0D) - 2;
            if (class194.field2880 < -8) {
                class194.field2880 = -8;
            }
            if (class194.field2880 > 8) {
                class194.field2880 = 8;
            }
            class194.field2881 += (int) (Math.random() * 5.0D) - 2;
            if (class194.field2881 < -16) {
                class194.field2881 = -16;
            }
            if (class194.field2881 > 16) {
                class194.field2881 = 16;
            }
            class194.method1213(arg1, class194.field2880 >> 2 << 10, class194.field2881 >> 1);
            class194.field2866.method661(256, 1024, 2);
            class194.field2869.method2743(256, 256, (byte) -126);
            class194.field2871.method3006(4096, 64);
            class197.field3037.method764((byte) 107, 256);
            class213.field3643 = 20;
        } else if (class213.field3643 == 20) {
            class337.method2240(true, arg2 - 64);
            class194.method1217(arg0, class194.field2880, class194.field2881);
            class213.field3643 = 60;
            class337.method2240(true, 0);
            class68.method485(0);
        } else if (class213.field3643 == 60) {
            if (class194.field2868.method1007(1, class194.field2863.field4169 + "_staticelements")) {
                if (!class194.field2868.method1001((byte) -56, class194.field2863.field4169 + "_staticelements")) {
                    return;
                }
                class194.field2874 = class481.method2967(false, class194.field2863.field4169 + "_staticelements", class153.field2049, class194.field2868);
            } else {
                class194.field2874 = new class218(0);
            }
            class194.method1210();
            class213.field3643 = 70;
            class337.method2240(true, 0);
            class68.method485(0);
        } else if (class213.field3643 == 70) {
            class416.field6308 = new class29(arg0, 11, true, class320.field4980);
            class213.field3643 = 73;
            class337.method2240(true, 0);
            class68.method485(0);
        } else if (class213.field3643 == 73) {
            class526.field7755 = new class29(arg0, 12, true, class320.field4980);
            class213.field3643 = 76;
            class337.method2240(true, 0);
            class68.method485(0);
        } else if (class213.field3643 == 76) {
            class350.field5418 = new class29(arg0, 14, true, class320.field4980);
            class213.field3643 = 79;
            class337.method2240(true, 0);
            class68.method485(arg2 ^ 0x40);
        } else if (class213.field3643 == 79) {
            class399.field6037 = new class29(arg0, 17, true, class320.field4980);
            class213.field3643 = 82;
            class337.method2240(true, 0);
            class68.method485(0);
        } else if (class213.field3643 == 82) {
            class523.field7736 = new class29(arg0, 19, true, class320.field4980);
            class213.field3643 = 85;
            class337.method2240(true, 0);
            class68.method485(0);
        } else if (class213.field3643 == 85) {
            class39.field386 = new class29(arg0, 22, true, class320.field4980);
            class213.field3643 = 88;
            class337.method2240(true, arg2 ^ 0x40);
            class68.method485(0);
        } else if (class213.field3643 == 88) {
            class85.field1245 = new class29(arg0, 26, true, class320.field4980);
            class213.field3643 = 91;
            class337.method2240(true, 0);
            class68.method485(arg2 ^ 0x40);
        } else {
            class236.field3870 = new class29(arg0, 30, true, class320.field4980);
            if (arg2 != 64) {
                field5180 = null;
            }
            class213.field3643 = 100;
            class337.method2240(true, 0);
            class68.method485(0);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)V")
    public static final void method2210(byte arg0) {
        field5181++;
        if (arg0 < 92) {
            method2210((byte) 31);
        }
        if (!class284.field4476) {
            return;
        }
        while (true) {
            while (class471.field7209.length > class249.field4044) {
                class68 var1 = class471.field7209[class249.field4044];
                if (var1 != null && var1.field1034 == -1) {
                    if (class418.field6338 == null) {
                        class418.field6338 = class128.field1738.method2428((byte) -102, var1.field1032);
                    }
                    int var2 = class418.field6338.field1908;
                    if (var2 == -1) {
                        return;
                    }
                    class249.field4044++;
                    var1.field1034 = var2;
                    class418.field6338 = null;
                } else {
                    class249.field4044++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "()V")
    public class330() {
    }

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(I)V")
    public class330(int arg0) {
        this.field5185 = arg0;
    }
}
