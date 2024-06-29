import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class35 extends class115 {

    @OriginalMember(owner = "client!hb", name = "C", descriptor = "Z")
    public static boolean field788 = false;

    @OriginalMember(owner = "client!hb", name = "F", descriptor = "[I")
    public static int[] field791 = new int[32];

    @OriginalMember(owner = "client!hb", name = "O", descriptor = "[I")
    public static int[] field800 = new int[128];

    @OriginalMember(owner = "client!hb", name = "K", descriptor = "Lud;")
    public static class279 field796 = class130.method1024(":tradereq:", 255);

    @OriginalMember(owner = "client!hb", name = "A", descriptor = "I")
    public int field787;

    @OriginalMember(owner = "client!hb", name = "H", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!hb", name = "J", descriptor = "I")
    public int field795;

    @OriginalMember(owner = "client!hb", name = "L", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!hb", name = "M", descriptor = "I")
    public int field798;

    @OriginalMember(owner = "client!hb", name = "P", descriptor = "I")
    public int field801;

    @OriginalMember(owner = "client!hb", name = "Q", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!hb", name = "T", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!hb", name = "U", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!hb", name = "N", descriptor = "Lud;")
    public class279 field799;

    @OriginalMember(owner = "client!hb", name = "E", descriptor = "[I")
    public static int[] field790;

    @OriginalMember(owner = "client!hb", name = "G", descriptor = "[I")
    public int[] field792;

    @OriginalMember(owner = "client!hb", name = "I", descriptor = "[I")
    public int[] field794;

    @OriginalMember(owner = "client!hb", name = "R", descriptor = "[Lud;")
    public class279[] field803;

    @OriginalMember(owner = "client!hb", name = "D", descriptor = "[Lcd;")
    public class69[] field789;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIII)V", line = 11)
    public static final void method308(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var8 = arg3 + 1;
        class152.method1208(arg2, arg4, arg1, class182.field3348[arg3], -7);
        int var9 = arg5 - 1;
        class152.method1208(arg2, arg4, arg1, class182.field3348[arg5], -7);
        if (arg0 != -6302) {
            method313(false, -91, true, (byte) -19, false, -87, 97, -50);
        }
        for (int var6 = var8; var6 <= var9; var6++) {
            int[] var7 = class182.field3348[var6];
            var7[arg2] = var7[arg1] = arg4;
        }
        field805++;
    }

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "(B)V", line = 34)
    public static final void method309(byte arg0) {
        field797++;
        if (arg0 < 28) {
            field790 = (int[]) null;
        }
        if (class120.field2163 != null) {
            class120.field2163.method743(false);
        }
        if (class80.field1537 != null) {
            class80.field1537.method743(false);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V", line = 59)
    public static final void method310(int arg0) {
        int var1 = 53 / ((10 - arg0) / 60);
        field802++;
        if (class252.field4504 == 0) {
            return;
        }
        try {
            if ((++class265.field4772) > 1500) {
                if (class202.field3603 != null) {
                    class202.field3603.method2024(-1);
                    class202.field3603 = null;
                }
                if (class196.field3532 >= 1) {
                    class279.field4943 = -5;
                    class252.field4504 = 0;
                    return;
                }
                class196.field3532++;
                class265.field4772 = 0;
                class252.field4504 = 1;
                if (class247.field4386 == class117.field2134) {
                    class117.field2134 = class202.field3606;
                } else {
                    class117.field2134 = class247.field4386;
                }
            }
            if (class252.field4504 == 1) {
                class181.field3300 = class110.field2022.method2164(0, class301.field5361, class117.field2134);
                class252.field4504 = 2;
            }
            if (class252.field4504 == 2) {
                if (class181.field3300.field3655 == 2) {
                    throw new IOException();
                }
                if (class181.field3300.field3655 != 1) {
                    return;
                }
                class202.field3603 = new class280((Socket) class181.field3300.field3657, class110.field2022);
                class181.field3300 = null;
                class202.field3603.method2021(class314.field5534.field1142, class314.field5534.field1168, 0, 3);
                if (class80.field1537 != null) {
                    class80.field1537.method747(2512);
                }
                if (class120.field2163 != null) {
                    class120.field2163.method747(2512);
                }
                int var2 = class202.field3603.method2022((byte) -121);
                if (class80.field1537 != null) {
                    class80.field1537.method747(2512);
                }
                if (class120.field2163 != null) {
                    class120.field2163.method747(2512);
                }
                if (var2 != 101) {
                    class279.field4943 = var2;
                    class252.field4504 = 0;
                    class202.field3603.method2024(-1);
                    class202.field3603 = null;
                    return;
                }
                class252.field4504 = 3;
            }
            if (class252.field4504 == 3) {
                if (class202.field3603.method2023(116) < 2) {
                    return;
                }
                int var3 = class202.field3603.method2022((byte) -106) << 8 | class202.field3603.method2022((byte) -116);
                class86.method754(75, var3);
                if (class12.field386 == -1) {
                    class252.field4504 = 0;
                    class279.field4943 = 6;
                    class202.field3603.method2024(-1);
                    class202.field3603 = null;
                    return;
                }
                class252.field4504 = 0;
                class202.field3603.method2024(-1);
                class202.field3603 = null;
                class176.method1367(-32140);
                return;
            }
        } catch (IOException var5) {
            if (class202.field3603 != null) {
                class202.field3603.method2024(-1);
                class202.field3603 = null;
            }
            if (class196.field3532 < 1) {
                if (class247.field4386 == class117.field2134) {
                    class117.field2134 = class202.field3606;
                } else {
                    class117.field2134 = class247.field4386;
                }
                class252.field4504 = 1;
                class265.field4772 = 0;
                class196.field3532++;
            } else {
                class279.field4943 = -4;
                class252.field4504 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIII)V", line = 212)
    public static final void method311(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 32) {
            method309((byte) 29);
        }
        for (int var5 = 0; var5 < class14.field434; var5++) {
            if ((class115.field2100[var5] + class191.field3434[var5]) > arg2 && arg1 + arg2 > class115.field2100[var5] && (class249.field4436[var5] + class102.field1900[var5]) > arg3 && (arg3 + arg0) > class102.field1900[var5]) {
                class71.field1398[var5] = true;
            }
        }
        field793++;
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V", line = 240)
    public static void method312(int arg0) {
        field790 = null;
        if (arg0 <= -57) {
            field800 = null;
            field791 = null;
            field796 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZIZBZIII)Lom;", line = 259)
    public static final class70 method313(boolean arg0, int arg1, boolean arg2, byte arg3, boolean arg4, int arg5, int arg6, int arg7) {
        int var8 = 118 / ((-arg3 - 35) / 51);
        field804++;
        class157 var9 = class220.method1612(-2254, arg6);
        if (arg5 > 1 && var9.field2866 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg5 >= var9.field2813[var11] && var9.field2813[var11] != 0) {
                    var10 = var9.field2866[var11];
                }
            }
            if (var10 != -1) {
                var9 = class220.method1612(-2254, var10);
            }
        }
        class242 var12 = var9.method1232((byte) 113);
        if (var12 == null) {
            return null;
        }
        class66 var13 = null;
        if (var9.field2884 != -1) {
            var13 = (class66) method313(true, 0, false, (byte) 107, true, 10, var9.field2855, 1);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2867 != -1) {
            var13 = (class66) method313(false, arg1, false, (byte) -90, true, arg5, var9.field2889, arg7);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = class146.field2637;
        int var15 = class146.field2639;
        int var16 = class146.field2635;
        int[] var17 = new int[4];
        class146.method1129(var17);
        class66 var18 = new class66(36, 32);
        class146.method1116(var18.field1323, 36, 32);
        class27.method252();
        class27.method237(16, 16);
        int var19 = var9.field2821;
        if (arg0) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg7 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        class27.field653 = false;
        int var20 = class27.field654[var9.field2833] * var19 >> 16;
        int var21 = class27.field642[var9.field2833] * var19 >> 16;
        var12.method161(0, var9.field2888, var9.field2864, var9.field2833, var9.field2882, var20 + var9.field2879 - (var12.method184() / 2), var21 - -var9.field2879, -1L);
        if (arg7 >= 1) {
            var18.method580(1);
            if (arg7 >= 2) {
                var18.method580(16777215);
            }
            class146.method1116(var18.field1323, 36, 32);
        }
        if (arg1 != 0) {
            var18.method569(arg1);
        }
        if (var9.field2884 != -1) {
            var13.method584(0, 0);
        } else if (var9.field2867 != -1) {
            class146.method1116(var13.field1323, 36, 32);
            var18.method584(0, 0);
            var18 = var13;
        }
        if (arg2 && (var9.field2848 == 1 || arg5 != 1) && arg5 != -1) {
            class217.field3846.method419(class301.method2140(arg5, (byte) -45), 0, 9, 16776960, 1);
        }
        class146.method1116(var14, var15, var16);
        class146.method1114(var17);
        class27.method252();
        class27.field653 = true;
        return class97.field1824 && !arg4 ? new class203(var18) : var18;
    }
}
