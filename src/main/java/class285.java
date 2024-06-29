import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class285 extends class217 {

    @OriginalMember(owner = "client!j", name = "D", descriptor = "Z")
    public static boolean field4395 = false;

    @OriginalMember(owner = "client!j", name = "h", descriptor = "I")
    public int field4373;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!j", name = "j", descriptor = "I")
    public int field4375;

    @OriginalMember(owner = "client!j", name = "l", descriptor = "I")
    public int field4377;

    @OriginalMember(owner = "client!j", name = "m", descriptor = "I")
    public int field4378;

    @OriginalMember(owner = "client!j", name = "n", descriptor = "I")
    public int field4379;

    @OriginalMember(owner = "client!j", name = "o", descriptor = "I")
    public int field4380;

    @OriginalMember(owner = "client!j", name = "p", descriptor = "I")
    public int field4381;

    @OriginalMember(owner = "client!j", name = "q", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!j", name = "s", descriptor = "I")
    public int field4384;

    @OriginalMember(owner = "client!j", name = "t", descriptor = "I")
    public static int field4385;

    @OriginalMember(owner = "client!j", name = "v", descriptor = "I")
    public int field4387;

    @OriginalMember(owner = "client!j", name = "w", descriptor = "I")
    public int field4388;

    @OriginalMember(owner = "client!j", name = "x", descriptor = "I")
    public int field4389;

    @OriginalMember(owner = "client!j", name = "y", descriptor = "I")
    public int field4390;

    @OriginalMember(owner = "client!j", name = "z", descriptor = "I")
    public int field4391;

    @OriginalMember(owner = "client!j", name = "A", descriptor = "I")
    public int field4392;

    @OriginalMember(owner = "client!j", name = "B", descriptor = "I")
    public int field4393;

    @OriginalMember(owner = "client!j", name = "C", descriptor = "I")
    public int field4394;

    @OriginalMember(owner = "client!j", name = "F", descriptor = "I")
    public int field4397;

    @OriginalMember(owner = "client!j", name = "E", descriptor = "Lhh;")
    public class210 field4396;

    @OriginalMember(owner = "client!j", name = "k", descriptor = "Lik;")
    public class259 field4376;

    @OriginalMember(owner = "client!j", name = "u", descriptor = "Lbf;")
    public class329 field4386;

    @OriginalMember(owner = "client!j", name = "r", descriptor = "Lwa;")
    public class82 field4383;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(IIII)I", line = 14)
    public static final int method2000(int arg0, int arg1, int arg2, int arg3) {
        field4382++;
        if (arg0 == arg1) {
            return arg1;
        } else {
            int var4 = arg2 - arg3;
            int var5 = ((-16711936 & arg1) >>> 7) * var4 + (arg0 >>> 7 & 0x1FE01FE) * arg3 & 0xFF00FF00;
            int var6 = (arg0 & 0xFF00FF) * arg3 + (arg1 & 0xFF00FF) * var4 & 0xFF00FF00;
            return (var6 >> 7) + var5;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IBIZII)V", line = 40)
    public static final void method2001(int arg0, byte arg1, int arg2, boolean arg3, int arg4, int arg5) {
        class255.field3812++;
        class197.method1439(10944);
        if (arg3) {
            class31.method216(15198, false, 0, false);
        } else {
            class104.method804(115, 0);
            class31.method216(15198, false, 0, true);
            if (class190.field3038 == 0) {
                for (int var6 = 1; var6 <= 5; var6++) {
                    class31.method216(15198, false, var6, false);
                    class31.method216(arg1 + 15214, true, var6, false);
                    class104.method804(arg1 ^ 0xFFFFFFA6, var6);
                }
            } else {
                for (int var7 = 1; var7 <= 5; var7++) {
                    class104.method804(15, var7);
                    class31.method216(15198, false, var7, false);
                    class31.method216(15198, true, var7, false);
                }
            }
        }
        if (!arg3) {
            class41.method363((byte) -108);
        }
        class292.method2062(9);
        if (class36.field534) {
            class252.method1754(true, arg5, false, arg0, arg2, arg4);
            arg2 = class250.field3754;
            arg0 = class270.field4068;
            arg5 = class34.field418;
            arg4 = class138.field2157;
        }
        if (class78.field1104 == 1) {
            int var8 = class80.field1125;
            int var9 = class315.field4906 + class136.field2125 & 0x7FF;
            if (class260.field3859 / 256 > var8) {
                var8 = class260.field3859 / 256;
            }
            if (class268.field4041[4] && var8 < class152.field2291[4] + 128) {
                var8 = class152.field2291[4] + 128;
            }
            class105.method812(var8, var9, class294.method2080(arg1 ^ -909, class235.field3602.field4496, class235.field3602.field4507, class50.field775) - 50, arg2, class99.field1473, var8 * 3 + 600, class147.field2245, true);
        }
        field4385++;
        int var10 = class294.field4628;
        int var11 = class311.field4845;
        int var12 = class203.field3227;
        int var13 = class89.field1299;
        int var14 = class220.field3455;
        for (int var15 = 0; var15 < 5; var15++) {
            if (class268.field4041[var15]) {
                int var16 = (int) ((double) (-class235.field3604[var15]) + (double) (class235.field3604[var15] * 2 + 1) * Math.random() + Math.sin((double) class230.field3552[var15] / 100.0D * (double) class71.field1033[var15]) * (double) class152.field2291[var15]);
                if (var15 == 1) {
                    class294.field4628 += var16;
                }
                if (var15 == 0) {
                    class220.field3455 += var16;
                }
                if (var15 == 2) {
                    class311.field4845 += var16;
                }
                if (var15 == 3) {
                    class203.field3227 = class203.field3227 + var16 & 0x7FF;
                }
                if (var15 == 4) {
                    class89.field1299 += var16;
                    if (class89.field1299 < 128) {
                        class89.field1299 = 128;
                    }
                    if (class89.field1299 > 383) {
                        class89.field1299 = 383;
                    }
                }
            }
        }
        class64.method552(arg1 ^ 0xFFFFF5EA);
        if (class36.field534) {
            class194.method1416(arg0, arg5, arg0 + arg4, arg2 + arg5);
            float var17 = (float) class89.field1299 * 0.17578125F;
            float var18 = (float) class203.field3227 * 0.17578125F;
            if (class78.field1104 == 3) {
                var18 = class37.field541 * 360.0F / 6.2831855F;
                var17 = class268.field4039 * 360.0F / 6.2831855F;
            }
            class36.method323(arg0, arg5, arg4, arg2, arg4 / 2 + arg0, arg5 - -(arg2 / 2), var17, var18, class135.field2103, class135.field2103);
        } else {
            class168.method1234(arg0, arg5, arg0 + arg4, arg5 - -arg2);
            class56.method505();
        }
        if (class67.field982 || arg0 > class322.field5002 || (arg0 + arg4) <= class322.field5002 || arg5 > class199.field3151 || class199.field3151 >= arg2 + arg5) {
            class152.field2287 = false;
            class49.field763 = 0;
        } else {
            class152.field2287 = true;
            class49.field763 = 0;
            int var19 = class288.field4476;
            int var20 = class307.field4796;
            int var21 = class257.field3834;
            class77.field1092 = (class322.field5002 - arg0) * (var20 - var19) / arg4 + var19;
            int var22 = class142.field2202;
            class15.field177 = (class199.field3151 - arg5) * (var22 - var21) / arg2 + var21;
        }
        client.method1774(-127);
        byte var23 = class281.method1978((byte) 75) == 2 ? (byte) class255.field3812 : 1;
        if (class36.field534) {
            class36.method311();
            class36.method318(true);
            class36.method333(true);
            boolean var24 = false;
            int var25;
            if (class305.field4771 == 10) {
                var25 = class149.method1108(class317.field4926, class220.field3455 >> 10, class88.field1297, class311.field4845 >> 10, 65536);
            } else {
                var25 = class149.method1108(class317.field4926, class235.field3602.field4477[0] >> 3, class88.field1297, class235.field3602.field4470[0] >> 3, 65536);
            }
            class286.method2013(class312.field4852, !class38.field581);
            class36.method324(var25);
            class38.method349(class203.field3227, class220.field3455, class311.field4845, (byte) 99, class294.field4628, class89.field1299);
            class36.field514 = class312.field4852;
            class37.method344(class220.field3455, class294.field4628, class311.field4845, class89.field1299, class203.field3227, class183.field2773, class31.field401, class321.field4991, class100.field1496, class105.field1609, class39.field584, class50.field775 + 1, var23, class235.field3602.field4507 >> 7, class235.field3602.field4496 >> 7);
            class142.field2186 = true;
            class286.method2010();
            class38.method349(0, 0, 0, (byte) 99, 0, 0);
            client.method1774(-127);
            class250.method1733();
            class209.method1490(arg0, 48, arg5, arg4, arg2, class135.field2103, class135.field2103);
            class292.method2059(arg4, -12, arg5, arg2, class135.field2103, class135.field2103, arg0);
        } else {
            class168.method1224(arg0, arg5, arg4, arg2, 0);
            class37.method344(class220.field3455, class294.field4628, class311.field4845, class89.field1299, class203.field3227, class183.field2773, class31.field401, class321.field4991, class100.field1496, class105.field1609, class39.field584, class50.field775 + 1, var23, class235.field3602.field4507 >> 7, class235.field3602.field4496 >> 7);
            client.method1774(-123);
            class250.method1733();
            class209.method1490(arg0, 9, arg5, arg4, arg2, 256, 256);
            class292.method2059(arg4, -12, arg5, arg2, 256, 256, arg0);
        }
        ((class262) class56.field829).method1802(24556, class88.field1297);
        if (arg1 != -16) {
            field4395 = true;
        }
        class265.method1834(arg5, arg4, arg0, arg2, true);
        class203.field3227 = var12;
        class311.field4845 = var11;
        class220.field3455 = var14;
        class294.field4628 = var10;
        class89.field1299 = var13;
        if (class10.field108 && class110.field1746.method52(arg1 + 16) == 0) {
            class10.field108 = false;
        }
        if (class10.field108) {
            if (class36.field534) {
                class194.method1413(arg0, arg5, arg4, arg2, 0);
            } else {
                class168.method1224(arg0, arg5, arg4, arg2, 0);
            }
            class47.method421(class107.field1646, false, (byte) 106);
        }
        if (!arg3 && !class10.field108 && !class67.field982 && class322.field5002 >= arg0 && arg0 + arg4 > class322.field5002 && class199.field3151 >= arg5 && class199.field3151 < arg2 + arg5) {
            class143.method1080(class199.field3151, arg5, 785066493, arg0, arg4, class322.field5002, arg2);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)V", line = 294)
    public final void method2002(boolean arg0) {
        this.field4386 = null;
        this.field4376 = null;
        this.field4383 = null;
        this.field4396 = null;
        field4374++;
        if (arg0) {
            method2000(-46, -74, 106, 11);
        }
    }
}
