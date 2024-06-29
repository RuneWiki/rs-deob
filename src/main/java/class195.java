import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class195 extends class178 {

    @OriginalMember(owner = "client!sg", name = "M", descriptor = "[Lla;")
    public class119[] field3472;

    @OriginalMember(owner = "client!sg", name = "N", descriptor = "I")
    public static int field3473 = 0;

    @OriginalMember(owner = "client!sg", name = "P", descriptor = "Loc;")
    public static class151 field3475 = class137.method873(2, "Bitte starten Sie eine Mitgliedschaft");

    @OriginalMember(owner = "client!sg", name = "L", descriptor = "Loc;")
    public static class151 field3471 = class137.method873(2, "Passwort: ");

    @OriginalMember(owner = "client!sg", name = "K", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!sg", name = "Q", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!sg", name = "S", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!sg", name = "T", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!sg", name = "V", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!sg", name = "U", descriptor = "Ljb;")
    public static class99 field3480;

    @OriginalMember(owner = "client!sg", name = "O", descriptor = "Z")
    public static boolean field3474;

    @OriginalMember(owner = "client!sg", name = "R", descriptor = "[I")
    public static int[] field3477;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(II)Z")
    public final boolean method1221(int arg0, int arg1) {
        if (arg0 > -59) {
            return true;
        } else {
            field3476++;
            return this.field3472[arg1].field2143;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(III)I")
    public static final int method1222(int arg0, int arg1, int arg2) {
        if (arg0 < 64) {
            method1222(-48, 36, -75);
        }
        class110 var3 = (class110) class166.field3032.method1538((long) arg1, (byte) 127);
        field3470++;
        if (var3 == null) {
            return 0;
        } else if (arg2 >= 0 && arg2 < var3.field1953.length) {
            return var3.field1953[arg2];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(I)V")
    public static void method1223(int arg0) {
        field3475 = null;
        field3480 = null;
        field3471 = null;
        if (arg0 != 127) {
            method1223(43);
        }
        field3477 = null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIII)V")
    public static final void method1224(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class53.field1081[0].method229(arg3, arg1);
        field3478++;
        class53.field1081[1].method229(arg3, arg1 + arg0 - 16);
        int var6 = (arg0 - 32) * arg0 / arg5;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg0 - var6 - 32) * arg2 / (arg5 - arg0);
        class221.method1375(arg3, arg1 + 16, 16, arg0 - 32, class233.field4288);
        class221.method1375(arg3, arg1 + var7 + 16, 16, var6, class237.field4415);
        class221.method1392(arg3, arg1 + var7 + 16, var6, class133.field2430);
        class221.method1392(arg3 + 1, arg1 + var7 + 16, var6, class133.field2430);
        class221.method1373(arg3, arg1 + var7 + 16, 16, class133.field2430);
        class221.method1373(arg3, var7 + arg1 + 17, 16, class133.field2430);
        if (arg4 != -1885) {
            field3471 = null;
        }
        class221.method1392(arg3 + 15, arg1 - -16 + var7, var6, class178.field3208);
        class221.method1392(arg3 + 14, arg1 - -17 + var7, var6 - 1, class178.field3208);
        class221.method1373(arg3, arg1 + var6 + var7 + 15, 16, class178.field3208);
        class221.method1373(arg3 + 1, arg1 + 14 + var6 - -var7, 15, class178.field3208);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIB)I")
    public static final int method1225(int arg0, int arg1, int arg2, byte arg3) {
        field3481++;
        int var4 = arg0 >> 7;
        int var5 = arg2 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1;
        if (arg1 < 3 && (class122.field2191[1][var4][var5] & 0x2) == 2) {
            var7 = arg1 + 1;
        }
        int var8 = arg2 & 0x7F;
        if (arg3 == -118) {
            int var9 = (128 - var6) * class104.field1872[var7][var4][var5] + class104.field1872[var7][var4 + 1][var5] * var6 >> 7;
            int var10 = (128 - var6) * class104.field1872[var7][var4][var5 - -1] + class104.field1872[var7][var4 + 1][var5 + 1] * var6 >> 7;
            return (128 - var8) * var9 + var8 * var10 >> 7;
        } else {
            return -39;
        }
    }

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "(I)V")
    public static final void method1226(int arg0) {
        int var1 = class19.field403.method1259(class170.field3094);
        for (int var2 = 0; var2 < class117.field2108; var2++) {
            int var6 = class19.field403.method1259(class149.method947(var2, true));
            if (var1 < var6) {
                var1 = var6;
            }
        }
        field3479++;
        var1 += 8;
        class225.field3917 = true;
        class222.field3856 = class117.field2108 * 15 + 22;
        int var3 = class117.field2108 * 15 + 21;
        int var4 = class2.field61 - var1 / 2;
        class79.field1522 = var1;
        if (class202.field3602 < var1 + var4) {
            var4 = class202.field3602 - var1;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        class55.field1109 = var4;
        int var5 = class209.field3677;
        if (arg0 <= 85) {
            field3477 = null;
        }
        if (var3 + var5 > class36.field751) {
            var5 = class36.field751 - var3;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        class224.field3908 = var5;
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lsd;Lsd;IZ)V")
    public class195(class192 arg0, class192 arg1, int arg2, boolean arg3) {
        class218 var5 = new class218();
        int var6 = arg0.method1210(true, arg2);
        this.field3472 = new class119[var6];
        int[] var7 = arg0.method1190(false, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method1208(var7[var8], (byte) 27, arg2);
            class171 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class171 var12 = (class171) var5.method1358(-29726); var12 != null; var12 = (class171) var5.method1360(true)) {
                if (var12.field3112 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1204(-1, var11, 0);
                } else {
                    var13 = arg1.method1204(-1, 0, var11);
                }
                var10 = new class171(var11, var13);
                var5.method1361(var10, (byte) 71);
            }
            this.field3472[var7[var8]] = new class119(var9, var10);
        }
    }
}
