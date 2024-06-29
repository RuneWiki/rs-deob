import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class21 {

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "Lu;")
    public static class135 field493 = class87.method676((byte) -109, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "Lu;")
    public static class135 field487 = null;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    public static int field488 = 0;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "Lu;")
    public static class135 field490 = class87.method676((byte) -50, "Lade Eingabe)2Steuerungsprogramm)3)3)3");

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
    public static volatile int field501 = 0;

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "Lu;")
    public static class135 field503 = class87.method676((byte) -91, "backtop1");

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "I")
    public static int field499 = 0;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "Lu;")
    public static class135 field502 = class87.method676((byte) -88, "Bitte versuchen Sie)1");

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "[I")
    public static int[] field491 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "Lu;")
    public static class135 field498 = class87.method676((byte) -40, "Benutzen");

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    public int field492;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    public int field495;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    public int field497;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IB)V")
    public static final void method158(int arg0, byte arg1) {
        class93.field2199 = false;
        class126.field3001 = -1;
        class141.field3418 = 0;
        class87.field2075 = arg0;
        field500++;
        class100.field2417 = -1;
        int var2 = -88 % ((-arg1 - 86) / 34);
        class12.field290 = 1;
        class76.field1804 = null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
    public static void method159(int arg0) {
        if (arg0 != 32) {
            return;
        }
        field487 = null;
        field502 = null;
        field493 = null;
        field503 = null;
        field491 = null;
        field490 = null;
        field498 = null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
    public static final void method160(byte arg0) {
        class37.method282(true);
        class20.method155(arg0 + 4941);
        field494++;
        if (class62.field1553 == 2 || class62.field1553 == 5) {
            byte[] var41 = class49.field1175.field137;
            int[] var42 = class70.field1714;
            int var43 = var41.length;
            for (int var44 = 0; var44 < var43; var44++) {
                if (var41[var44] == 0) {
                    var42[var44] = 0;
                }
            }
            if (class62.field1553 < 3) {
                class82.field1925.method65(0, 0, 33, 33, 25, 25, class22.field550, 256, class78.field1849, class60.field1529);
            }
            class20.method152((byte) -125);
            return;
        }
        int var1 = class5.field126 + class22.field550 & 0x7FF;
        int var2 = class116.field2789.field173 / 32 + 48;
        int var3 = 464 - class116.field2789.field172 / 32;
        class96.field2336.method65(25, 5, 146, 151, var2, var3, var1, class48.field1143 + 256, class52.field1225, class50.field1188);
        for (int var4 = 0; var4 < class100.field2420; var4++) {
            int var39 = class148.field3706[var4] * 4 + 2 - class116.field2789.field172 / 32;
            int var40 = class23.field579[var4] * 4 + 2 - class116.field2789.field173 / 32;
            class59.method449(var40, class135.field3231[var4], var39, arg0 ^ 0x7D);
        }
        for (int var5 = 0; var5 < 104; var5++) {
            for (int var35 = 0; var35 < 104; var35++) {
                class23 var36 = class48.field1142[class136.field3301][var5][var35];
                if (var36 != null) {
                    int var37 = var5 * 4 + 2 - class116.field2789.field173 / 32;
                    int var38 = var35 * 4 + 2 - class116.field2789.field172 / 32;
                    class59.method449(var37, class53.field1270[0], var38, 91);
                }
            }
        }
        int var6 = 0;
        if (arg0 != -31) {
            method159(83);
        }
        while (var6 < class34.field790) {
            class111 var31 = class96.field2340[class47.field1124[var6]];
            if (var31 != null && var31.method45((byte) 55)) {
                class55 var32 = var31.field2697;
                if (var32 != null && var32.field1302 != null) {
                    var32 = var32.method418(0);
                }
                if (var32 != null && var32.field1326 && var32.field1330) {
                    int var33 = var31.field173 / 32 - class116.field2789.field173 / 32;
                    int var34 = var31.field172 / 32 - class116.field2789.field172 / 32;
                    class59.method449(var33, class53.field1270[1], var34, 75);
                }
            }
            var6++;
        }
        for (int var7 = 0; var7 < class14.field329; var7++) {
            class145 var23 = class131.field3166[class108.field2600[var7]];
            if (var23 != null && var23.method45((byte) 55)) {
                int var24 = var23.field172 / 32 - class116.field2789.field172 / 32;
                int var25 = var23.field173 / 32 - class116.field2789.field173 / 32;
                boolean var26 = false;
                long var27 = var23.field3516.method1064(-22243);
                for (int var29 = 0; var29 < class79.field1885; var29++) {
                    if (class8.field148[var29] == var27 && class94.field2281[var29] != 0) {
                        var26 = true;
                        break;
                    }
                }
                boolean var30 = false;
                if (class116.field2789.field3547 != 0 && var23.field3547 != 0 && class116.field2789.field3547 == var23.field3547) {
                    var30 = true;
                }
                if (var26) {
                    class59.method449(var25, class53.field1270[3], var24, 76);
                } else if (var30) {
                    class59.method449(var25, class53.field1270[4], var24, -71);
                } else {
                    class59.method449(var25, class53.field1270[2], var24, 91);
                }
            }
        }
        if (class60.field1509 != 0 && class126.field2998 % 20 < 10) {
            if (class60.field1509 == 1 && class145.field3529 >= 0 && class145.field3529 < class96.field2340.length) {
                class111 var8 = class96.field2340[class145.field3529];
                if (var8 != null) {
                    int var9 = var8.field173 / 32 - class116.field2789.field173 / 32;
                    int var10 = var8.field172 / 32 - class116.field2789.field172 / 32;
                    class119.method949(27, var9, class86.field2048[1], var10);
                }
            }
            if (class60.field1509 == 2) {
                int var11 = (class55.field1310 - class76.field1795) * 4 + 2 - class116.field2789.field172 / 32;
                int var12 = (class35.field826 - class126.field3010) * 4 + 2 - class116.field2789.field173 / 32;
                class119.method949(112, var12, class86.field2048[1], var11);
            }
            if (class60.field1509 == 10 && class63.field1575 >= 0 && class63.field1575 < class131.field3166.length) {
                class145 var13 = class131.field3166[class63.field1575];
                if (var13 != null) {
                    int var14 = var13.field172 / 32 - class116.field2789.field172 / 32;
                    int var15 = var13.field173 / 32 - class116.field2789.field173 / 32;
                    class119.method949(123, var15, class86.field2048[1], var14);
                }
            }
        }
        if (class86.field2062 != 0) {
            int var16 = class86.field2062 * 4 + 2 - class116.field2789.field173 / 32;
            int var17 = class128.field3093 * 4 + 2 - class116.field2789.field172 / 32;
            class59.method449(var16, class86.field2048[0], var17, arg0 + 127);
        }
        class70.method564(97, 78, 3, 3, 16777215);
        if (class62.field1553 >= 3) {
            byte[] var18 = class49.field1175.field137;
            int[] var19 = class70.field1714;
            for (int var20 = 0; var20 <= 33; var20++) {
                int var21 = class49.field1175.field132 * var20;
                for (int var22 = 0; var22 <= 33; var22++) {
                    if (var18[var21 + var22] == 0) {
                        var19[var21 + var22] = 0;
                    }
                }
            }
        } else {
            class82.field1925.method65(0, 0, 33, 33, 25, 25, class22.field550, 256, class78.field1849, class60.field1529);
        }
        class20.method152((byte) -89);
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V")
    public static final void method161(int arg0) {
        field504++;
        class79.field1879.method57(32);
        if (arg0 != 21356) {
            field503 = null;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            class143.field3496[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            client.field510[var2] = 0L;
        }
        class116.field2772 = 0;
    }
}
