import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class372 {

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "I")
    public static int field5446 = -1;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "[I")
    public static int[] field5445 = new int[50];

    @OriginalMember(owner = "client!pt", name = "l", descriptor = "I")
    public static int field5456 = 0;

    @OriginalMember(owner = "client!pt", name = "m", descriptor = "[I")
    public static int[] field5457 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!pt", name = "k", descriptor = "I")
    public static int field5455 = 0;

    @OriginalMember(owner = "client!pt", name = "o", descriptor = "I")
    public static int field5459 = 0;

    @OriginalMember(owner = "client!pt", name = "n", descriptor = "[I")
    public static int[] field5458 = new int[64];

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "I")
    public static int field5447;

    @OriginalMember(owner = "client!pt", name = "d", descriptor = "I")
    public int field5448;

    @OriginalMember(owner = "client!pt", name = "e", descriptor = "I")
    public static int field5449;

    @OriginalMember(owner = "client!pt", name = "f", descriptor = "I")
    public int field5450;

    @OriginalMember(owner = "client!pt", name = "g", descriptor = "I")
    public int field5451;

    @OriginalMember(owner = "client!pt", name = "h", descriptor = "I")
    public static int field5452;

    @OriginalMember(owner = "client!pt", name = "i", descriptor = "I")
    public static int field5453;

    @OriginalMember(owner = "client!pt", name = "j", descriptor = "I")
    public static int field5454;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)V")
    public static void method2282(int arg0) {
        field5458 = null;
        if (arg0 != 23867) {
            field5457 = null;
        }
        field5457 = null;
        field5445 = null;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IZI)I")
    public static final int method2283(int arg0, boolean arg1, int arg2) {
        field5452++;
        if (arg0 == -1) {
            return 12345678;
        }
        int var3 = (arg0 & 0x7F) * arg2 >> 7;
        if (!arg1) {
            method2284('+', true);
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(CZ)Z")
    public static final boolean method2284(char arg0, boolean arg1) {
        field5454++;
        if (arg1) {
            field5458 = null;
        }
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2285(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        for (class69 var7 = (class69) class4.field81.method533((byte) -58); var7 != null; var7 = (class69) class4.field81.method536(75)) {
            if (var7.field1391 <= class62.field1268) {
                var7.method2352((byte) 118);
            } else {
                class49.method467(-5206, var7.field1399, (var7.field1398 << 7) + 64, var7.field1397 * 2, arg5 >> 1, arg2, arg3 >> 1, (var7.field1392 << 7) + 64, arg0);
                class356.field5232.method2010(class60.field1240[0] + arg1, var7.field1394, var7.field1390 | 0xFF000000, class60.field1240[1] + arg6, 0, 99);
            }
        }
        field5447++;
        int var8 = -108 / ((arg4 - 68) / 55);
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(B)V")
    public static final void method2286(byte arg0) {
        field5453++;
        if (class186.field2990.method1781(class133.field2236, 123) != 2) {
            return;
        }
        byte var1 = (byte) (class184.field2958 - 4 & 0xFF);
        int var2 = class184.field2958 % class339.field5099;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < class484.field7129; var16++) {
                class249.field3848[var3][var2][var16] = var1;
            }
        }
        if (arg0 >= -101) {
            field5445 = null;
        }
        if (class211.field3371 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class50.field1008[var4] = -1000000;
            class321.field4904[var4] = 1000000;
            class403.field6086[var4] = 0;
            class322.field4925[var4] = 1000000;
            class464.field6884[var4] = 0;
        }
        if (class510.field7435 != 1) {
            int var5 = class483.method2899(class211.field3371, class509.field7427, class432.field6435, false);
            if (var5 - class428.field6406 < 800 && (class22.field333[class211.field3371][class509.field7427 >> 7][class432.field6435 >> 7] & 0x4) != 0) {
                class324.method2066(class432.field6435 >> 7, class518.field7511, false, 1, true, class509.field7427 >> 7);
                return;
            }
            return;
        }
        if ((class22.field333[class211.field3371][class15.field266.field6073 >> 7][class15.field266.field6078 >> 7] & 0x4) != 0) {
            class324.method2066(class15.field266.field6078 >> 7, class518.field7511, false, 0, true, class15.field266.field6073 >> 7);
        }
        if (class41.field577 >= 2560) {
            return;
        }
        int var6 = class509.field7427 >> 7;
        int var7 = class432.field6435 >> 7;
        int var8 = class15.field266.field6073 >> 7;
        int var9 = class15.field266.field6078 >> 7;
        int var10;
        if (var6 < var8) {
            var10 = var8 - var6;
        } else {
            var10 = var6 - var8;
        }
        int var11;
        if (var9 > var7) {
            var11 = var9 - var7;
        } else {
            var11 = var7 - var9;
        }
        if (var10 == 0 && var11 == 0 || var10 <= -class339.field5099 || class339.field5099 <= var10 || -class484.field7129 >= var11 || class484.field7129 <= var11) {
            class486.method2913("RC: " + var6 + "," + var7 + " " + var8 + "," + var9 + " " + class496.field7292 + "," + class212.field3378, null, (byte) -112);
            return;
        }
        if (var10 <= var11) {
            int var12 = var10 * 65536 / var11;
            int var13 = 32768;
            while (var7 != var9) {
                if (var9 > var7) {
                    var7++;
                } else if (var9 < var7) {
                    var7--;
                }
                if ((class22.field333[class211.field3371][var6][var7] & 0x4) != 0) {
                    class324.method2066(var7, class518.field7511, false, 1, true, var6);
                    return;
                }
                var13 += var12;
                if (var13 >= 65536) {
                    var13 -= 65536;
                    if (var6 < var8) {
                        var6++;
                    } else if (var8 < var6) {
                        var6--;
                    }
                    if ((class22.field333[class211.field3371][var6][var7] & 0x4) != 0) {
                        class324.method2066(var7, class518.field7511, false, 1, true, var6);
                        return;
                    }
                }
            }
            return;
        }
        int var14 = var11 * 65536 / var10;
        int var15 = 32768;
        while (var6 != var8) {
            if (var6 < var8) {
                var6++;
            } else if (var6 > var8) {
                var6--;
            }
            if ((class22.field333[class211.field3371][var6][var7] & 0x4) != 0) {
                class324.method2066(var7, class518.field7511, false, 1, true, var6);
                return;
            }
            var15 += var14;
            if (var15 >= 65536) {
                var15 -= 65536;
                if (var7 < var9) {
                    var7++;
                } else if (var9 < var7) {
                    var7--;
                }
                if ((class22.field333[class211.field3371][var6][var7] & 0x4) != 0) {
                    class324.method2066(var7, class518.field7511, false, 1, true, var6);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(ILl;ILjava/awt/Canvas;Llt;B)Lza;")
    public static final class288 method2287(int arg0, class16 arg1, int arg2, Canvas arg3, class480 arg4, byte arg5) {
        field5449++;
        if (arg5 <= 58) {
            method2285(116, -82, -114, -122, -93, -86, -17);
        }
        return new class44(arg2, arg3, arg1, arg0, arg4);
    }
}
