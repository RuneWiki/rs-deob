import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class47 {

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
    private int field664 = 0;

    @OriginalMember(owner = "client!rh", name = "w", descriptor = "I")
    private int field682 = 0;

    @OriginalMember(owner = "client!rh", name = "o", descriptor = "I")
    private int field674;

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "I")
    private int field672;

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "[[I")
    public int[][] field673;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "I")
    public static int field662 = 0;

    @OriginalMember(owner = "client!rh", name = "r", descriptor = "Loh;")
    public static class281 field677 = new class281(30);

    @OriginalMember(owner = "client!rh", name = "B", descriptor = "Z")
    public static boolean field687 = false;

    @OriginalMember(owner = "client!rh", name = "C", descriptor = "I")
    public static int field688 = 0;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!rh", name = "p", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!rh", name = "q", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!rh", name = "s", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!rh", name = "t", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!rh", name = "v", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!rh", name = "x", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!rh", name = "y", descriptor = "Led;")
    public static class186 field684;

    @OriginalMember(owner = "client!rh", name = "A", descriptor = "Lbk;")
    public static class21 field686;

    @OriginalMember(owner = "client!rh", name = "z", descriptor = "Ljava/awt/Frame;")
    public static Frame field685;

    @OriginalMember(owner = "client!rh", name = "u", descriptor = "[Lul;")
    public static class192[] field680;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IZ)V")
    public static final void method335(int arg0, boolean arg1) {
        field676++;
        byte[][] var2 = class249.field4024;
        int var3 = class90.field1573.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class230.field3653[var4] & 0xFF) * 64 - class260.field4162;
                int var7 = (class230.field3653[var4] >> 8) * 64 - class46.field656;
                class230.method1534(false);
                class296.method1978(var6, var5, arg1, class176.field2765, var7, (byte) -26);
            }
        }
        if (arg0 != -17604) {
            field662 = -77;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)V")
    public static final void method336(byte arg0) {
        int var1 = -80 % ((arg0 + 66) / 51);
        class11.field192 = null;
        class185.field2866 = null;
        field671++;
        class109.field1787 = null;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IZIZZII)V")
    public final void method337(int arg0, boolean arg1, int arg2, boolean arg3, boolean arg4, int arg5, int arg6) {
        int var8 = arg0 - this.field664;
        int var9 = arg6 - this.field682;
        if (arg2 == 0) {
            if (arg5 == 0) {
                this.method342(var8, var9, 128, -99);
                this.method342(var8 - 1, var9, 8, -114);
            }
            if (arg5 == 1) {
                this.method342(var8, var9, 2, -126);
                this.method342(var8, var9 + 1, 32, -57);
            }
            if (arg5 == 2) {
                this.method342(var8, var9, 8, -93);
                this.method342(var8 + 1, var9, 128, -108);
            }
            if (arg5 == 3) {
                this.method342(var8, var9, 32, -87);
                this.method342(var8, var9 - 1, 2, -71);
            }
        }
        field666++;
        if (arg2 == 1 || arg2 == 3) {
            if (arg5 == 0) {
                this.method342(var8, var9, 1, -88);
                this.method342(var8 - 1, var9 + 1, 16, -58);
            }
            if (arg5 == 1) {
                this.method342(var8, var9, 4, -70);
                this.method342(var8 + 1, var9 + 1, 64, -95);
            }
            if (arg5 == 2) {
                this.method342(var8, var9, 16, -94);
                this.method342(var8 + 1, var9 + -1, 1, -88);
            }
            if (arg5 == 3) {
                this.method342(var8, var9, 64, -107);
                this.method342(var8 - 1, var9 + -1, 4, -111);
            }
        }
        if (arg2 == 2) {
            if (arg5 == 0) {
                this.method342(var8, var9, 130, -126);
                this.method342(var8 - 1, var9, 8, -106);
                this.method342(var8, var9 + 1, 32, -85);
            }
            if (arg5 == 1) {
                this.method342(var8, var9, 10, -68);
                this.method342(var8, var9 + 1, 32, -99);
                this.method342(var8 + 1, var9, 128, -66);
            }
            if (arg5 == 2) {
                this.method342(var8, var9, 40, -109);
                this.method342(var8 + 1, var9, 128, -124);
                this.method342(var8, var9 - 1, 2, -79);
            }
            if (arg5 == 3) {
                this.method342(var8, var9, 160, -82);
                this.method342(var8, var9 - 1, 2, -121);
                this.method342(var8 - 1, var9, 8, -90);
            }
        }
        if (arg1) {
            field687 = true;
        }
        if (arg4) {
            if (arg2 == 0) {
                if (arg5 == 0) {
                    this.method342(var8, var9, 65536, -99);
                    this.method342(var8 - 1, var9, 4096, -77);
                }
                if (arg5 == 1) {
                    this.method342(var8, var9, 1024, -73);
                    this.method342(var8, var9 + 1, 16384, -125);
                }
                if (arg5 == 2) {
                    this.method342(var8, var9, 4096, -122);
                    this.method342(var8 + 1, var9, 65536, -68);
                }
                if (arg5 == 3) {
                    this.method342(var8, var9, 16384, -116);
                    this.method342(var8, var9 - 1, 1024, -58);
                }
            }
            if (arg2 == 1 || arg2 == 3) {
                if (arg5 == 0) {
                    this.method342(var8, var9, 512, -64);
                    this.method342(var8 - 1, var9 + 1, 8192, -58);
                }
                if (arg5 == 1) {
                    this.method342(var8, var9, 2048, -95);
                    this.method342(var8 + 1, var9 - -1, 32768, -72);
                }
                if (arg5 == 2) {
                    this.method342(var8, var9, 8192, -73);
                    this.method342(var8 + 1, var9 + -1, 512, -110);
                }
                if (arg5 == 3) {
                    this.method342(var8, var9, 32768, -114);
                    this.method342(var8 - 1, var9 + -1, 2048, -59);
                }
            }
            if (arg2 == 2) {
                if (arg5 == 0) {
                    this.method342(var8, var9, 66560, -89);
                    this.method342(var8 - 1, var9, 4096, -94);
                    this.method342(var8, var9 + 1, 16384, -100);
                }
                if (arg5 == 1) {
                    this.method342(var8, var9, 5120, -75);
                    this.method342(var8, var9 + 1, 16384, -117);
                    this.method342(var8 + 1, var9, 65536, -92);
                }
                if (arg5 == 2) {
                    this.method342(var8, var9, 20480, -84);
                    this.method342(var8 + 1, var9, 65536, -116);
                    this.method342(var8, var9 - 1, 1024, -108);
                }
                if (arg5 == 3) {
                    this.method342(var8, var9, 81920, -105);
                    this.method342(var8, var9 - 1, 1024, -126);
                    this.method342(var8 - 1, var9, 4096, -78);
                }
            }
        }
        if (!arg3) {
            return;
        }
        if (arg2 == 0) {
            if (arg5 == 0) {
                this.method342(var8, var9, 536870912, -70);
                this.method342(var8 - 1, var9, 33554432, -86);
            }
            if (arg5 == 1) {
                this.method342(var8, var9, 8388608, -104);
                this.method342(var8, var9 + 1, 134217728, -68);
            }
            if (arg5 == 2) {
                this.method342(var8, var9, 33554432, -108);
                this.method342(var8 + 1, var9, 536870912, -113);
            }
            if (arg5 == 3) {
                this.method342(var8, var9, 134217728, -105);
                this.method342(var8, var9 - 1, 8388608, -124);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg5 == 0) {
                this.method342(var8, var9, 4194304, -64);
                this.method342(var8 - 1, var9 + 1, 67108864, -127);
            }
            if (arg5 == 1) {
                this.method342(var8, var9, 16777216, -106);
                this.method342(var8 + 1, var9 + 1, 268435456, -111);
            }
            if (arg5 == 2) {
                this.method342(var8, var9, 67108864, -127);
                this.method342(var8 + 1, var9 + -1, 4194304, -95);
            }
            if (arg5 == 3) {
                this.method342(var8, var9, 268435456, -92);
                this.method342(var8 - 1, var9 + -1, 16777216, -81);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method342(var8, var9, 545259520, -100);
            this.method342(var8 - 1, var9, 33554432, -57);
            this.method342(var8, var9 + 1, 134217728, -107);
        }
        if (arg5 == 1) {
            this.method342(var8, var9, 41943040, -82);
            this.method342(var8, var9 + 1, 134217728, -89);
            this.method342(var8 + 1, var9, 536870912, -117);
        }
        if (arg5 == 2) {
            this.method342(var8, var9, 167772160, -114);
            this.method342(var8 + 1, var9, 536870912, -91);
            this.method342(var8, var9 - 1, 8388608, -68);
        }
        if (arg5 == 3) {
            this.method342(var8, var9, 671088640, -83);
            this.method342(var8, var9 - 1, 8388608, -116);
            this.method342(var8 - 1, var9, 33554432, -107);
            return;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
    public static final void method338(int arg0) {
        int var1 = 63 % ((10 - arg0) / 35);
        if (class106.field1759 == null || class197.field3112 == null) {
            class106.field1759 = new int[256];
            class197.field3112 = new int[256];
            for (int var2 = 0; var2 < 256; var2++) {
                double var3 = (double) var2 / 255.0D * 6.283185307179586D;
                class106.field1759[var2] = (int) (Math.sin(var3) * 4096.0D);
                class197.field3112[var2] = (int) (Math.cos(var3) * 4096.0D);
            }
        }
        field663++;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IZIZIILa;IZ)Led;")
    public static final class186 method339(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5, class49 arg6, int arg7, boolean arg8) {
        class72 var9 = class85.method602(false, arg7);
        if (arg0 > 1 && var9.field1158 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (var9.field1182[var11] <= arg0 && var9.field1182[var11] != 0) {
                    var10 = var9.field1158[var11];
                }
            }
            if (var10 != -1) {
                var9 = class85.method602(false, var10);
            }
        }
        class54 var12 = var9.method521(arg6, (byte) 6);
        field660++;
        if (var12 == null) {
            return null;
        }
        class276 var13 = null;
        if (var9.field1168 != -1) {
            var13 = (class276) method339(10, true, 0, false, 1, 36, arg6, var9.field1217, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1191 != -1) {
            var13 = (class276) method339(arg0, false, arg2, false, arg4, 36, arg6, var9.field1185, true);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = class211.field3275;
        int var15 = class211.field3279;
        int var16 = class211.field3273;
        int[] var17 = new int[4];
        class211.method1428(var17);
        class276 var18 = new class276(arg5, 32);
        class211.method1433(var18.field4393, 36, 32);
        class195.method1331();
        class195.method1336(16, 16);
        int var19 = var9.field1153;
        if (arg1) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg4 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        class195.field3079 = false;
        int var20 = class195.field3089[var9.field1206] * var19 >> 16;
        int var21 = class195.field3091[var9.field1206] * var19 >> 16;
        var12.method73(0, var9.field1165, var9.field1174, var9.field1206, var9.field1204, var9.field1210 + var21 - (var12.method102() / 2), var9.field1210 + var20, -1L);
        if (arg4 >= 1) {
            var18.method1855(1);
            if (arg4 >= 2) {
                var18.method1855(16777215);
            }
            class211.method1433(var18.field4393, 36, 32);
        }
        if (arg2 != 0) {
            var18.method1861(arg2);
        }
        if (var9.field1168 != -1) {
            var13.method856(0, 0);
        } else if (var9.field1191 != -1) {
            class211.method1433(var13.field4393, 36, 32);
            var18.method856(0, 0);
            var18 = var13;
        }
        if (arg3 && (var9.field1201 == 1 || arg0 != 1) && arg0 != -1) {
            class94.field1604.method1676(class136.method927(true, arg0), 0, 9, 16776960, 1);
        }
        class211.method1433(var14, var15, var16);
        class211.method1430(var17);
        class195.method1331();
        class195.field3079 = true;
        return var18;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIZIZII)V")
    public final void method340(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field675++;
        int var9 = arg0 - this.field682;
        if (arg7 == 1 || arg7 == 3) {
            int var10 = arg6;
            arg6 = arg1;
            arg1 = var10;
        }
        int var11 = arg2 - this.field664;
        int var12 = 256;
        if (arg3) {
            var12 |= 0x20000;
        }
        if (arg5) {
            var12 |= 0x40000000;
        }
        for (int var13 = var11; var13 < (arg6 + var11); var13++) {
            if (var13 >= 0 && var13 < this.field672) {
                for (int var14 = var9; var14 < var9 + arg1; var14++) {
                    if (var14 >= 0 && this.field674 > var14) {
                        this.method344(var12, var13, 70, var14);
                    }
                }
            }
        }
        if (arg4 < 62) {
            field686 = null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(III)V")
    public final void method341(int arg0, int arg1, int arg2) {
        if (arg2 != 23954) {
            this.field672 = -98;
        }
        int var4 = arg0 - this.field682;
        int var5 = arg1 - this.field664;
        this.field673[var5][var4] = class55.method420(this.field673[var5][var4], -262145);
        field668++;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIII)V")
    private final void method342(int arg0, int arg1, int arg2, int arg3) {
        this.field673[arg0][arg1] = class45.method330(this.field673[arg0][arg1], arg2);
        if (arg3 >= -55) {
            this.method337(34, false, -110, false, true, 16, 13);
        }
        field669++;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)V")
    public static void method343(int arg0) {
        field684 = null;
        field677 = null;
        field685 = null;
        field680 = null;
        field686 = null;
        if (arg0 != 0) {
            method348(false, (class235) null);
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(IIII)V")
    private final void method344(int arg0, int arg1, int arg2, int arg3) {
        field665++;
        if (arg2 < 44) {
            field684 = null;
        }
        this.field673[arg1][arg3] = class55.method420(this.field673[arg1][arg3], ~arg0);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIB)V")
    public final void method345(int arg0, int arg1, byte arg2) {
        if (arg2 >= -101) {
            method338(57);
        }
        field681++;
        int var4 = arg0 - this.field664;
        int var5 = arg1 - this.field682;
        this.field673[var4][var5] = class45.method330(this.field673[var4][var5], 262144);
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(I)V")
    public final void method346(int arg0) {
        for (int var2 = 0; var2 < this.field672; var2++) {
            for (int var3 = 0; var3 < this.field674; var3++) {
                if (var2 == 0 || var3 == 0 || (this.field672 - 5) <= var2 || var3 >= (this.field674 - 5)) {
                    this.field673[var2][var3] = 16777215;
                } else {
                    this.field673[var2][var3] = 2097152;
                }
            }
        }
        field670++;
        if (arg0 != 32) {
            this.field682 = 96;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IZIIZII)V")
    public final void method347(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        int var8 = arg2 - this.field682;
        int var9 = arg5 - this.field664;
        if (arg6 == 0) {
            if (arg0 == 0) {
                this.method344(128, var9, 55, var8);
                this.method344(8, var9 - 1, arg3 + -1930, var8);
            }
            if (arg0 == 1) {
                this.method344(2, var9, 48, var8);
                this.method344(32, var9, 118, var8 + 1);
            }
            if (arg0 == 2) {
                this.method344(8, var9, 45, var8);
                this.method344(128, var9 + 1, arg3 ^ 0x845, var8);
            }
            if (arg0 == 3) {
                this.method344(32, var9, 81, var8);
                this.method344(2, var9, 91, var8 - 1);
            }
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg0 == 0) {
                this.method344(1, var9, 47, var8);
                this.method344(16, var9 - 1, arg3 + -1951, var8 + 1);
            }
            if (arg0 == 1) {
                this.method344(4, var9, 107, var8);
                this.method344(64, var9 + 1, 52, var8 + 1);
            }
            if (arg0 == 2) {
                this.method344(16, var9, 119, var8);
                this.method344(1, var9 + 1, arg3 ^ 0x844, var8 - 1);
            }
            if (arg0 == 3) {
                this.method344(64, var9, 71, var8);
                this.method344(4, var9 - 1, 105, var8 - 1);
            }
        }
        field679++;
        if (arg6 == 2) {
            if (arg0 == 0) {
                this.method344(130, var9, 116, var8);
                this.method344(8, var9 - 1, arg3 ^ 0x864, var8);
                this.method344(32, var9, 117, var8 + 1);
            }
            if (arg0 == 1) {
                this.method344(10, var9, 97, var8);
                this.method344(32, var9, 102, var8 + 1);
                this.method344(128, var9 + 1, arg3 + -1955, var8);
            }
            if (arg0 == 2) {
                this.method344(40, var9, arg3 - 1965, var8);
                this.method344(128, var9 + 1, 70, var8);
                this.method344(2, var9, arg3 ^ 0x86A, var8 - 1);
            }
            if (arg0 == 3) {
                this.method344(160, var9, 55, var8);
                this.method344(2, var9, arg3 - 1939, var8 - 1);
                this.method344(8, var9 - 1, 77, var8);
            }
        }
        if (arg1) {
            if (arg6 == 0) {
                if (arg0 == 0) {
                    this.method344(65536, var9, 79, var8);
                    this.method344(4096, var9 - 1, 61, var8);
                }
                if (arg0 == 1) {
                    this.method344(1024, var9, 64, var8);
                    this.method344(16384, var9, arg3 ^ 0x858, var8 + 1);
                }
                if (arg0 == 2) {
                    this.method344(4096, var9, 62, var8);
                    this.method344(65536, var9 + 1, 104, var8);
                }
                if (arg0 == 3) {
                    this.method344(16384, var9, arg3 - 1957, var8);
                    this.method344(1024, var9, arg3 - 1927, var8 + -1);
                }
            }
            if (arg6 == 1 || arg6 == 3) {
                if (arg0 == 0) {
                    this.method344(512, var9, arg3 - 1952, var8);
                    this.method344(8192, var9 - 1, arg3 ^ 0x853, var8 + 1);
                }
                if (arg0 == 1) {
                    this.method344(2048, var9, arg3 - 1936, var8);
                    this.method344(32768, var9 + 1, 54, var8 + 1);
                }
                if (arg0 == 2) {
                    this.method344(8192, var9, 69, var8);
                    this.method344(512, var9 + 1, 67, var8 - 1);
                }
                if (arg0 == 3) {
                    this.method344(32768, var9, arg3 - 1964, var8);
                    this.method344(2048, var9 - 1, 70, var8 - 1);
                }
            }
            if (arg6 == 2) {
                if (arg0 == 0) {
                    this.method344(66560, var9, arg3 - 1957, var8);
                    this.method344(4096, var9 - 1, arg3 ^ 0x854, var8);
                    this.method344(16384, var9, 69, var8 + 1);
                }
                if (arg0 == 1) {
                    this.method344(5120, var9, 92, var8);
                    this.method344(16384, var9, 78, var8 + 1);
                    this.method344(65536, var9 + 1, 73, var8);
                }
                if (arg0 == 2) {
                    this.method344(20480, var9, 107, var8);
                    this.method344(65536, var9 + 1, 89, var8);
                    this.method344(1024, var9, arg3 - 1938, var8 - 1);
                }
                if (arg0 == 3) {
                    this.method344(81920, var9, arg3 - 1987, var8);
                    this.method344(1024, var9, 69, var8 - 1);
                    this.method344(4096, var9 - 1, 52, var8);
                }
            }
        }
        if (arg3 != 2048) {
            field680 = null;
        }
        if (!arg4) {
            return;
        }
        if (arg6 == 0) {
            if (arg0 == 0) {
                this.method344(536870912, var9, 107, var8);
                this.method344(33554432, var9 - 1, 115, var8);
            }
            if (arg0 == 1) {
                this.method344(8388608, var9, 90, var8);
                this.method344(134217728, var9, 97, var8 + 1);
            }
            if (arg0 == 2) {
                this.method344(33554432, var9, 76, var8);
                this.method344(536870912, var9 + 1, 101, var8);
            }
            if (arg0 == 3) {
                this.method344(134217728, var9, 124, var8);
                this.method344(8388608, var9, arg3 - 1993, var8 + -1);
            }
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg0 == 0) {
                this.method344(4194304, var9, 47, var8);
                this.method344(67108864, var9 - 1, arg3 ^ 0x859, var8 + 1);
            }
            if (arg0 == 1) {
                this.method344(16777216, var9, arg3 - 1956, var8);
                this.method344(268435456, var9 + 1, 88, var8 + 1);
            }
            if (arg0 == 2) {
                this.method344(67108864, var9, arg3 ^ 0x86D, var8);
                this.method344(4194304, var9 + 1, arg3 ^ 0x837, var8 - 1);
            }
            if (arg0 == 3) {
                this.method344(268435456, var9, 110, var8);
                this.method344(16777216, var9 - 1, 109, var8 - 1);
            }
        }
        if (arg6 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method344(545259520, var9, 74, var8);
            this.method344(33554432, var9 - 1, 79, var8);
            this.method344(134217728, var9, 98, var8 + 1);
        }
        if (arg0 == 1) {
            this.method344(41943040, var9, arg3 ^ 0x83C, var8);
            this.method344(134217728, var9, arg3 ^ 0x84B, var8 + 1);
            this.method344(536870912, var9 + 1, 55, var8);
        }
        if (arg0 == 2) {
            this.method344(167772160, var9, 115, var8);
            this.method344(536870912, var9 + 1, arg3 ^ 0x837, var8);
            this.method344(8388608, var9, 92, var8 - 1);
        }
        if (arg0 == 3) {
            this.method344(671088640, var9, 101, var8);
            this.method344(8388608, var9, 124, var8 - 1);
            this.method344(33554432, var9 - 1, arg3 + -1989, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZLhc;)Z")
    public static final boolean method348(boolean arg0, class235 arg1) {
        if (!arg0) {
            method339(-16, true, 107, true, 11, -83, (class49) null, -15, true);
        }
        field683++;
        return arg1.method1613(false, class98.field1649);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIZZIB)V")
    public final void method349(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5, byte arg6) {
        field678++;
        int var8 = arg1 - this.field682;
        int var9 = arg5 - this.field664;
        int var10 = 256;
        if (arg4) {
            var10 |= 0x20000;
        }
        if (arg3) {
            var10 |= 0x40000000;
        }
        for (int var11 = var9; var11 < (arg2 + var9); var11++) {
            if (var11 >= 0 && var11 < this.field672) {
                for (int var12 = var8; var12 < (arg0 + var8); var12++) {
                    if (var12 >= 0 && this.field674 > var12) {
                        this.method342(var11, var12, var10, -66);
                    }
                }
            }
        }
        if (arg6 != -53) {
            field677 = null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IBI)V")
    public final void method350(int arg0, byte arg1, int arg2) {
        int var4 = 86 / ((-arg1 - 19) / 42);
        field661++;
        int var5 = arg2 - this.field664;
        int var6 = arg0 - this.field682;
        this.field673[var5][var6] = class45.method330(this.field673[var5][var6], 2097152);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Ljava/lang/String;II)I")
    public static final int method351(String arg0, int arg1, int arg2) {
        field667++;
        return arg1 == 1 ? class18.method173(arg2, (byte) 68, arg0, true) : 63;
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(II)V")
    public class47(int arg0, int arg1) {
        this.field674 = arg1;
        this.field672 = arg0;
        this.field673 = new int[this.field672][this.field674];
        this.method346(32);
    }
}
