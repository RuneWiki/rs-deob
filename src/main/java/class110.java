import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class110 extends class259 {

    @OriginalMember(owner = "client!rg", name = "I", descriptor = "Lea;")
    public class227 field1515;

    @OriginalMember(owner = "client!rg", name = "C", descriptor = "[I")
    public static int[] field1510 = new int[5];

    @OriginalMember(owner = "client!rg", name = "F", descriptor = "Ljava/lang/String;")
    public static String field1513 = "Choose Option";

    @OriginalMember(owner = "client!rg", name = "J", descriptor = "Lvh;")
    public static class62 field1516 = new class62(4);

    @OriginalMember(owner = "client!rg", name = "K", descriptor = "I")
    public static int field1517 = 0;

    @OriginalMember(owner = "client!rg", name = "N", descriptor = "[[I")
    public static int[][] field1520 = new int[][] { new int[0], { 128, 0, 128, 128, 0, 128 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!rg", name = "A", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!rg", name = "B", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!rg", name = "D", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!rg", name = "E", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!rg", name = "G", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!rg", name = "L", descriptor = "[I")
    public static int[] field1518;

    @OriginalMember(owner = "client!rg", name = "M", descriptor = "[[[B")
    public static byte[][][] field1519;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIZLua;Lsj;ILng;I)V", line = 6)
    public static final void method710(int arg0, int arg1, boolean arg2, class103 arg3, class65 arg4, int arg5, class182 arg6, int arg7) {
        class249 var8 = null;
        field1509++;
        if (arg3.field1407 == 0) {
            if ((double) class336.field5351 == 3.0D) {
                var8 = class360.field5701;
            }
            if ((double) class336.field5351 == 4.0D) {
                var8 = class262.field4141;
            }
            if ((double) class336.field5351 == 6.0D) {
                var8 = class176.field2668;
            }
            if ((double) class336.field5351 >= 8.0D) {
                var8 = class132.field1905;
            }
        } else if (arg3.field1407 == 1) {
            if ((double) class336.field5351 == 3.0D) {
                var8 = class176.field2668;
            }
            if ((double) class336.field5351 == 4.0D) {
                var8 = class132.field1905;
            }
            if ((double) class336.field5351 == 6.0D) {
                var8 = class293.field4620;
            }
            if ((double) class336.field5351 >= 8.0D) {
                var8 = class27.field326;
            }
        } else if (arg3.field1407 == 2) {
            if ((double) class336.field5351 == 3.0D) {
                var8 = class293.field4620;
            }
            if ((double) class336.field5351 == 4.0D) {
                var8 = class27.field326;
            }
            if ((double) class336.field5351 == 6.0D) {
                var8 = class107.field1477;
            }
            if ((double) class336.field5351 >= 8.0D) {
                var8 = class55.field646;
            }
        }
        if (arg5 <= 105 || var8 == null) {
            return;
        }
        int var9 = arg3.field1394;
        if (arg6.field2748 && arg3.field1418 != -1) {
            var9 = arg3.field1418;
        }
        int var10 = class344.field5463.method1681(arg3.field1396, (int[]) null, class212.field3214);
        int var11 = arg6.field2750;
        int var12;
        if (arg2) {
            var12 = var11 - var10 * var8.method1770() / 2;
        } else {
            var12 = var11 - (arg1 - (-((var10 - 1) * var8.method1768()) - var8.method1770() / 2));
        }
        int var13 = var12 - var8.method1770();
        int var14 = var12 + var8.method1770() / 2;
        int var15 = 0;
        for (int var16 = 0; var16 < var10; var16++) {
            String var17 = class212.field3214[var16];
            if (var16 < (var10 - 1)) {
                var17 = var17.substring(0, var17.length() - 4);
            }
            int var18 = var8.method1773(var17);
            if (var15 < var18) {
                var15 = var18;
            }
        }
        arg4.field781 = arg6.field2747 + arg7 - var15 / 2;
        arg4.field777 = var15 / 2 + arg6.field2747 + arg7;
        arg4.field787 = arg0 + var13;
        arg4.field784 = arg0 + (var13 + (var10 * var8.method1768()));
        int var19 = var13 + 2;
        int var20 = arg6.field2747 - (var15 / 2) - 5;
        if (arg3.field1388 != 0) {
            class343.method2364(var20, var19, var15 + 10, -var19 + var8.method1768() * var10 + var13 + 1, arg3.field1388, arg3.field1388 >>> 24);
        }
        if (arg3.field1408 != 0) {
            class343.method2361(var20, var19, var15 + 10, -var19 + var13 + 1 + var10 * var8.method1768(), arg3.field1408, arg3.field1408 >>> 24);
        }
        for (int var21 = 0; var21 < var10; var21++) {
            String var22 = class212.field3214[var21];
            if (var10 - 1 > var21) {
                var22 = var22.substring(0, var22.length() - 4);
            }
            int var23 = var8.method1773(var22);
            if (var15 < var23) {
                var15 = var23;
            }
            var8.method1771(var22, arg6.field2747, var14, var9, true);
            var14 += var8.method1768();
        }
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(II)I", line = 156)
    public static final int method711(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(B)V", line = 170)
    public static void method712(byte arg0) {
        field1518 = null;
        field1516 = null;
        field1520 = (int[][]) null;
        if (arg0 == -109) {
            field1513 = null;
            field1510 = null;
            field1519 = (byte[][][]) null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZ)V", line = 195)
    public static final void method713(int arg0, boolean arg1) {
        field1512++;
        if (arg0 == -1 || !class296.method2104((byte) -64, arg0)) {
            return;
        }
        class323[] var2 = class232.field3512[arg0];
        int var3 = 0;
        if (!arg1) {
            return;
        }
        while (var2.length > var3) {
            class323 var4 = var2[var3];
            if (var4.field5125 != null) {
                class185 var5 = new class185();
                var5.field2793 = var4;
                var5.field2789 = var4.field5125;
                class154.method1122(-2147483644, var5, 2000000);
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(II)V", line = 237)
    public static final void method714(int arg0, int arg1) {
        if (arg1 != -11700) {
            method712((byte) 41);
        }
        field1514++;
        class279 var2 = class147.method1085(arg0, arg1 - 7743, 12);
        var2.method1996(true);
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lea;)V", line = 252)
    public class110(class227 arg0) {
        this.field1515 = arg0;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lo;III)V", line = 265)
    public static final void method715(class231 arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -14143) {
            return;
        }
        field1511++;
        if (arg0.field3807 == arg1 && arg1 != -1) {
            class111 var4 = class289.method2067((byte) -72, arg1);
            int var5 = var4.field1542;
            if (var5 == 1) {
                arg0.field3796 = arg3;
                arg0.field3717 = 1;
                arg0.field3738 = 0;
                arg0.field3739 = 0;
                arg0.field3740 = 0;
                class313.method2210(var4, arg0.field3738, 50, arg0.field3763, false, arg0.field3767);
            }
            if (var5 == 2) {
                arg0.field3739 = 0;
            }
        } else if (arg1 == -1 || arg0.field3807 == -1 || class289.method2067((byte) -117, arg1).field1521 >= class289.method2067((byte) -60, arg0.field3807).field1521) {
            arg0.field3739 = 0;
            arg0.field3738 = 0;
            arg0.field3717 = 1;
            arg0.field3807 = arg1;
            arg0.field3802 = arg0.field3789;
            arg0.field3796 = arg3;
            arg0.field3740 = 0;
            if (arg0.field3807 != -1) {
                class313.method2210(class289.method2067((byte) -106, arg0.field3807), arg0.field3738, 50, arg0.field3763, false, arg0.field3767);
            }
        }
    }
}
