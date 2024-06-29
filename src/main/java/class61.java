import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class61 {

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "Z")
    public static boolean field1410 = false;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "[Lr;")
    public static class118[] field1415 = new class118[1000];

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    public static int field1411;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "I")
    private int field1412;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!ie", name = "r", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!ie", name = "s", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!ie", name = "t", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!ie", name = "u", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!ie", name = "v", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!ie", name = "w", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "J")
    private long field1417;

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "J")
    private long field1418;

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "Lvd;")
    public static class150 field1422;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "Z")
    public boolean field1409;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "[I")
    private int[] field1416;

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "[I")
    private int[] field1420;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLpa;)V")
    public static final void method542(byte arg0, class105 arg1) {
        if (arg0 > -115) {
            method543(70, null, true);
        }
        if (class91.field2187 != null) {
            try {
                class91.field2187.method67(-1, 0L);
                class91.field2187.method65(arg1.field2405, 24, arg1.field2404, false);
            } catch (Exception var2) {
            }
        }
        field1425++;
        arg1.field2404 += 24;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILjf;Z)V")
    public static final void method543(int arg0, class68 arg1, boolean arg2) {
        field1429++;
        if (class25.field615 != null) {
            class25.field615.field2404 = arg0 * 8 + 5;
            int var3 = class25.field615.method821((byte) 64);
            int var4 = class25.field615.method821((byte) 83);
            arg1.method579(var3, var4, (byte) 93);
        } else if (!arg2) {
            class27.method234(255, true, 0, (byte) 0, 255, null, 108);
            class44.field1047[arg0] = arg1;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)Lcb;")
    public final class17 method544(boolean arg0) {
        field1414++;
        if (this.field1412 != -1) {
            return class32.method273(9, this.field1412).method872((byte) 120);
        }
        boolean var2 = false;
        for (int var3 = 0; var3 < 12; var3++) {
            int var12 = this.field1420[var3];
            if (var12 >= 256 && var12 < 512 && !class9.method66(3, var12 - 256).method975(86)) {
                var2 = true;
            }
            if (var12 >= 512 && !class131.method1013(-12582, var12 - 512).method694((byte) 40, this.field1409)) {
                var2 = true;
            }
        }
        if (var2) {
            return null;
        }
        class17[] var4 = new class17[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var9 = this.field1420[var6];
            if (var9 >= 256 && var9 < 512) {
                class17 var10 = class9.method66(3, var9 - 256).method979(256);
                if (var10 != null) {
                    var4[var5++] = var10;
                }
            }
            if (var9 >= 512) {
                class17 var11 = class131.method1013(-12582, var9 - 512).method693(100, this.field1409);
                if (var11 != null) {
                    var4[var5++] = var11;
                }
            }
        }
        if (!arg0) {
            this.field1417 = 13L;
        }
        class17 var7 = new class17(var4, var5);
        for (int var8 = 0; var8 < 5; var8++) {
            if (class137.field3096[var8].length > this.field1416[var8]) {
                var7.method155(class20.field491[var8], class137.field3096[var8][this.field1416[var8]]);
            }
            if (class120.field2780[var8].length > this.field1416[var8]) {
                var7.method155(class37.field925[var8], class120.field2780[var8][this.field1416[var8]]);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IZI)V")
    public final void method545(int arg0, boolean arg1, int arg2) {
        field1424++;
        int var4 = this.field1416[arg2];
        if (arg1) {
            var4++;
            if (class137.field3096[arg2].length <= var4) {
                var4 = 0;
            }
        } else {
            var4--;
            if (var4 < 0) {
                var4 = class137.field3096[arg2].length - 1;
            }
        }
        if (arg0 < 52) {
            this.method550(115, false, -56);
        }
        this.field1416[arg2] = var4;
        this.method547(9);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(III)V")
    public static final void method546(int arg0, int arg1, int arg2) {
        field1421++;
        if (class112.field2598 == 2) {
            class65.method571((class1.field30 - client.field524 << 7) + class54.field1279, (-class27.field646 + class36.field910 << 7) + class115.field2673, -968986480, class99.field2297 * 2);
            if (arg1 == 512 && (class146.field3261 > -1 && class65.field1479 % 20 < 10)) {
                class115.field2706[0].method1109(class146.field3261 + arg0 - 12, class46.field1105 + arg2 + -28);
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
    private final void method547(int arg0) {
        field1426++;
        long var2 = this.field1418;
        this.field1418 = 0L;
        int var4 = this.field1420[5];
        int var5 = this.field1420[9];
        this.field1420[arg0] = var4;
        this.field1420[5] = var5;
        for (int var6 = 0; var6 < 12; var6++) {
            this.field1418 <<= 0x4;
            if (this.field1420[var6] >= 256) {
                this.field1418 += this.field1420[var6] - 256;
            }
        }
        if (this.field1420[0] >= 256) {
            this.field1418 += this.field1420[0] - 256 >> 4;
        }
        if (this.field1420[1] >= 256) {
            this.field1418 += this.field1420[1] - 256 >> 8;
        }
        for (int var7 = 0; var7 < 5; var7++) {
            this.field1418 <<= 0x3;
            this.field1418 += this.field1416[var7];
        }
        this.field1420[5] = var4;
        this.field1418 <<= 0x1;
        this.field1418 += this.field1409 ? 1 : 0;
        this.field1420[9] = var5;
        if (var2 != 0L && this.field1418 != var2) {
            class23.field553.method390((byte) 99, var2);
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(Z)V")
    public static void method548(boolean arg0) {
        if (!arg0) {
            field1410 = false;
        }
        field1422 = null;
        field1415 = null;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V")
    public static final void method549(int arg0) {
        if (arg0 <= 115) {
            field1422 = null;
        }
        if (class89.field2151 != null) {
            class89.field2151.method408((byte) 123);
        }
        field1428++;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(IZI)V")
    public final void method550(int arg0, boolean arg1, int arg2) {
        field1408++;
        if (arg0 == 1 && this.field1409) {
            return;
        }
        int var4 = this.field1420[class126.field2878[arg0]];
        if (~var4 == arg2) {
            return;
        }
        var4 -= 256;
        class126 var5;
        do {
            if (arg1) {
                var4++;
                if (var4 >= class131.field2977) {
                    var4 = 0;
                }
            } else {
                var4--;
                if (var4 < 0) {
                    var4 = class131.field2977 - 1;
                }
            }
            var5 = class9.method66(arg2 + 4, var4);
        } while (var5 == null || var5.field2893 || var5.field2879 != arg0 + (this.field1409 ? 7 : 0));
        this.field1420[class126.field2878[arg0]] = var4 + 256;
        this.method547(9);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lpa;I)V")
    public final void method551(class105 arg0, int arg1) {
        field1419++;
        arg0.method800(102, this.field1409 ? 1 : 0);
        for (int var3 = 0; var3 < 7; var3++) {
            int var5 = this.field1420[class126.field2878[var3]];
            if (var5 == 0) {
                arg0.method800(-104, -1);
            } else {
                arg0.method800(-116, var5 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method800(77, this.field1416[var4]);
        }
        if (arg1 < 17) {
            this.field1409 = true;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILw;ZILw;)Lwb;")
    public final class155 method552(int arg0, class153 arg1, boolean arg2, int arg3, class153 arg4) {
        field1407++;
        if (this.field1412 != -1) {
            return class32.method273(9, this.field1412).method868(arg0, arg1, arg4, -81, arg3);
        }
        long var6 = this.field1418;
        int[] var8 = this.field1420;
        if (arg1 != null && (arg1.field3446 >= 0 || arg1.field3484 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field1420[var9];
            }
            if (arg1.field3446 >= 0) {
                var6 += arg1.field3446 - this.field1420[5] << 8;
                var8[5] = arg1.field3446;
            }
            if (arg1.field3484 >= 0) {
                var6 += arg1.field3484 - this.field1420[3] << 16;
                var8[3] = arg1.field3484;
            }
        }
        class155 var10 = (class155) class23.field553.method395((byte) -62, var6);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var21 = var8[var12];
                if (var21 >= 256 && var21 < 512 && !class9.method66(3, var21 - 256).method977(true)) {
                    var11 = true;
                }
                if (var21 >= 512 && !class131.method1013(-12582, var21 - 512).method698(127, this.field1409)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field1417 != -1L) {
                    var10 = (class155) class23.field553.method395((byte) -46, this.field1417);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class17[] var13 = new class17[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var18 = var8[var15];
                    if (var18 >= 256 && var18 < 512) {
                        class17 var19 = class9.method66(3, var18 - 256).method981(-2);
                        if (var19 != null) {
                            var13[var14++] = var19;
                        }
                    }
                    if (var18 >= 512) {
                        class17 var20 = class131.method1013(-12582, var18 - 512).method695(this.field1409, 16876);
                        if (var20 != null) {
                            var13[var14++] = var20;
                        }
                    }
                }
                class17 var16 = new class17(var13, var14);
                for (int var17 = 0; var17 < 5; var17++) {
                    if (class137.field3096[var17].length > this.field1416[var17]) {
                        var16.method155(class20.field491[var17], class137.field3096[var17][this.field1416[var17]]);
                    }
                    if (this.field1416[var17] < class120.field2780[var17].length) {
                        var16.method155(class37.field925[var17], class120.field2780[var17][this.field1416[var17]]);
                    }
                }
                var10 = var16.method168(64, 850, -30, -50, -30);
                class23.field553.method391(var10, var6, true);
                this.field1417 = var6;
            }
        }
        if (arg2) {
            field1422 = null;
        }
        if (arg1 == null && arg4 == null) {
            return var10;
        }
        class155 var22;
        if (arg1 != null && arg4 != null) {
            var22 = arg1.method1143(var10, arg0, 77, arg3, arg4);
        } else if (arg1 == null) {
            var22 = arg4.method1137(var10, arg0, -1931831664);
        } else {
            var22 = arg1.method1137(var10, arg3, -1931831664);
        }
        return var22;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)I")
    public final int method553(byte arg0) {
        if (arg0 <= 26) {
            return 72;
        } else {
            field1423++;
            return this.field1412 == -1 ? (this.field1420[8] << 10) + (this.field1420[11] << 5) + this.field1420[1] + (this.field1416[0] << 25) + (this.field1416[4] << 20) + (this.field1420[0] << 15) : 305419896 - -class32.method273(9, this.field1412).field2573;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "([II[IIZ)V")
    public final void method554(int[] arg0, int arg1, int[] arg2, int arg3, boolean arg4) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class131.field2977; var7++) {
                    class126 var8 = class9.method66(3, var7);
                    if (var8 != null && !var8.field2893 && (arg4 ? 7 : 0) + var6 == var8.field2879) {
                        arg0[class126.field2878[var6]] = var7 + 256;
                        break;
                    }
                }
            }
        }
        this.field1412 = arg3;
        field1413++;
        this.field1420 = arg0;
        this.field1409 = arg4;
        this.field1416 = arg2;
        if (arg1 >= -64) {
            this.method553((byte) 109);
        }
        this.method547(9);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZI)V")
    public final void method555(boolean arg0, int arg1) {
        int var3 = -40 % ((-arg1 - 2) / 62);
        field1411++;
        if (this.field1409 != arg0) {
            this.method554(null, -125, this.field1416, -1, arg0);
        }
    }
}
