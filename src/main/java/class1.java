import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class1 {

    @OriginalMember(owner = "client!a", name = "f", descriptor = "J")
    public static long field6 = 0L;

    @OriginalMember(owner = "client!a", name = "w", descriptor = "Lsg;")
    public static class169 field23 = class165.method1060(")4slr)3ws?order=LPWM", 1536);

    @OriginalMember(owner = "client!a", name = "q", descriptor = "Lsg;")
    public static class169 field17 = class165.method1060("Lade Texturen )2 ", 1536);

    @OriginalMember(owner = "client!a", name = "z", descriptor = "Lsg;")
    public static class169 field26 = class165.method1060("headicons_pk", 1536);

    @OriginalMember(owner = "client!a", name = "j", descriptor = "Lsg;")
    public static class169 field10 = class165.method1060("Hier wechseln", 1536);

    @OriginalMember(owner = "client!a", name = "k", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!a", name = "m", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!a", name = "p", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!a", name = "r", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!a", name = "s", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!a", name = "t", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!a", name = "u", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!a", name = "x", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "I")
    private int field3;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!a", name = "A", descriptor = "J")
    private long field27;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "J")
    private long field7;

    @OriginalMember(owner = "client!a", name = "y", descriptor = "Lga;")
    public static class57 field25;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field4;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "Z")
    public boolean field8;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "[I")
    public static int[] field1;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "[I")
    public static int[] field12;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "[I")
    private int[] field14;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "[I")
    private int[] field2;

    @OriginalMember(owner = "client!a", name = "v", descriptor = "[I")
    public static int[] field22;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I[II[IZ)V")
    public final void method1(int arg0, int[] arg1, int arg2, int[] arg3, boolean arg4) {
        field9++;
        if (arg0 != 3) {
            field12 = null;
        }
        if (arg3 == null) {
            arg3 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class11.field271; var7++) {
                    class180 var8 = class195.method1287(false, var7);
                    if (var8 != null && !var8.field3516 && var6 + (arg4 ? 7 : 0) == var8.field3494) {
                        arg3[class58.field1090[var6]] = var7 + 256;
                        break;
                    }
                }
            }
        }
        this.field2 = arg3;
        this.field3 = arg2;
        this.field14 = arg1;
        this.field8 = arg4;
        this.method3((byte) 92);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)I")
    public final int method2(int arg0) {
        if (arg0 < 18) {
            this.field14 = null;
        }
        field5++;
        return this.field3 == -1 ? (this.field2[11] << 5) + this.field2[1] + (this.field14[4] << 20) + (this.field2[8] << 10) + (this.field2[0] << 15) + (this.field14[0] << 25) : class149.method974(this.field3, 9).field3404 + 305419896;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
    private final void method3(byte arg0) {
        field20++;
        long var2 = this.field7;
        int var4 = this.field2[5];
        this.field7 = 0L;
        int var5 = this.field2[9];
        this.field2[9] = var4;
        this.field2[5] = var5;
        if (arg0 != 92) {
            this.method7(null, 111);
        }
        for (int var6 = 0; var6 < 12; var6++) {
            this.field7 <<= 0x4;
            if (this.field2[var6] >= 256) {
                this.field7 += this.field2[var6] - 256;
            }
        }
        if (this.field2[0] >= 256) {
            this.field7 += this.field2[0] - 256 >> 4;
        }
        if (this.field2[1] >= 256) {
            this.field7 += this.field2[1] - 256 >> 8;
        }
        for (int var7 = 0; var7 < 5; var7++) {
            this.field7 <<= 0x3;
            this.field7 += this.field14[var7];
        }
        this.field7 <<= 0x1;
        this.field2[9] = var5;
        this.field7 += this.field8 ? 1 : 0;
        this.field2[5] = var4;
        if (var2 != 0L && this.field7 != var2) {
            class163.field3132.method1204(var2, arg0 ^ 0x5C);
        }
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(B)V")
    public static void method4(byte arg0) {
        field10 = null;
        field23 = null;
        field26 = null;
        field22 = null;
        field12 = null;
        field17 = null;
        field4 = null;
        if (arg0 > -93) {
            field12 = null;
        }
        field25 = null;
        field1 = null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IZB)V")
    public final void method5(int arg0, boolean arg1, byte arg2) {
        field21++;
        if (arg0 == 1 && this.field8) {
            return;
        }
        int var4 = this.field2[class58.field1090[arg0]];
        int var5 = -46 / (-arg2 / 60);
        if (var4 == 0) {
            return;
        }
        var4 -= 256;
        class180 var6;
        do {
            if (arg1) {
                var4++;
                if (var4 >= class11.field271) {
                    var4 = 0;
                }
            } else {
                var4--;
                if (var4 < 0) {
                    var4 = class11.field271 - 1;
                }
            }
            var6 = class195.method1287(false, var4);
        } while (var6 == null || var6.field3516 || var6.field3494 != arg0 + (this.field8 ? 7 : 0));
        this.field2[class58.field1090[arg0]] = var4 + 256;
        this.method3((byte) 92);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ltc;IB)Lcd;")
    public final class24 method6(class174 arg0, int arg1, byte arg2) {
        field13++;
        if (this.field3 != -1) {
            return class149.method974(this.field3, 9).method1177(-10, arg1, arg0);
        }
        class24 var4 = (class24) class151.field2915.method1206(this.field7, -24742);
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var15 = this.field2[var6];
                if (var15 >= 256 && var15 < 512 && !class195.method1287(false, var15 - 256).method1195((byte) 17)) {
                    var5 = true;
                }
                if (var15 >= 512 && !class180.method1196(var15 - 512, 0).method452(arg2 ^ 0xFFFFFFD2, this.field8)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            class52[] var7 = new class52[12];
            int var8 = 0;
            for (int var9 = 0; var9 < 12; var9++) {
                int var12 = this.field2[var9];
                if (var12 >= 256 && var12 < 512) {
                    class52 var13 = class195.method1287(false, var12 - 256).method1197((byte) 121);
                    if (var13 != null) {
                        var7[var8++] = var13;
                    }
                }
                if (var12 >= 512) {
                    class52 var14 = class180.method1196(var12 - 512, 0).method448(this.field8, 54);
                    if (var14 != null) {
                        var7[var8++] = var14;
                    }
                }
            }
            class52 var10 = new class52(var7, var8);
            for (int var11 = 0; var11 < 5; var11++) {
                if (class70.field1310[var11].length > this.field14[var11]) {
                    var10.method324(class161.field3057[var11], class70.field1310[var11][this.field14[var11]]);
                }
                if (this.field14[var11] < class80.field1474[var11].length) {
                    var10.method324(class6.field116[var11], class80.field1474[var11][this.field14[var11]]);
                }
            }
            var4 = var10.method325(64, 768, -50, -10, -50, true, true);
            class151.field2915.method1208(this.field7, 112, var4);
        }
        if (arg2 == 102) {
            if (arg0 != null) {
                var4 = arg0.method1158(arg1, var4, arg2 ^ 0xFF99);
            }
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Loa;I)V")
    public final void method7(class127 arg0, int arg1) {
        if (arg1 != 4) {
            this.method9((byte) 67, -128, null, null, 23);
        }
        arg0.method821(this.field8 ? 1 : 0, 64);
        field15++;
        for (int var3 = 0; var3 < 7; var3++) {
            int var5 = this.field2[class58.field1090[var3]];
            if (var5 == 0) {
                arg0.method821(-1, 64);
            } else {
                arg0.method821(var5 - 256, 64);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method821(this.field14[var4], 64);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IJ)V")
    public static final void method8(int arg0, long arg1) {
        field24++;
        if (arg1 == 0L) {
            return;
        }
        if (class206.field4052 >= 100) {
            class199.method1307((byte) 126, class45.field838, class139.field2580, 0);
            return;
        }
        class169 var3 = class123.method762(89, arg1).method1127((byte) -125);
        for (int var4 = arg0; var4 < class206.field4052; var4++) {
            if (class82.field1513[var4] == arg1) {
                class199.method1307((byte) 126, class45.field838, class165.method1058(0, new class169[] { var3, class112.field2057 }), 0);
                return;
            }
        }
        for (int var5 = 0; var5 < class57.field1064; var5++) {
            if (class142.field2640[var5] == arg1) {
                class199.method1307((byte) 120, class45.field838, class165.method1058(0, new class169[] { class114.field2071, var3, class118.field2190 }), 0);
                return;
            }
        }
        if (var3.method1121(class4.field79.field3856, 82)) {
            class199.method1307((byte) 126, class45.field838, class188.field3654, 0);
            return;
        }
        class4.field77++;
        class82.field1513[class206.field4052] = arg1;
        class197.field3874[class206.field4052++] = class123.method762(81, arg1);
        class8.field215 = class58.field1078;
        class141.field2621.method1024(216, (byte) -94);
        class141.field2621.method816(arg1, -16701);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BILtc;Ltc;I)Lcd;")
    public final class24 method9(byte arg0, int arg1, class174 arg2, class174 arg3, int arg4) {
        field16++;
        if (this.field3 != -1) {
            return class149.method974(this.field3, 9).method1172(arg3, arg1, arg4, -118, arg2);
        }
        long var6 = this.field7;
        int[] var8 = this.field2;
        if (arg3 != null && (arg3.field3381 >= 0 || arg3.field3383 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field2[var9];
            }
            if (arg3.field3381 >= 0) {
                var6 += arg3.field3381 - this.field2[5] << 8;
                var8[5] = arg3.field3381;
            }
            if (arg3.field3383 >= 0) {
                var6 += arg3.field3383 - this.field2[3] << 16;
                var8[3] = arg3.field3383;
            }
        }
        if (arg0 < 89) {
            this.field27 = 110L;
        }
        class24 var10 = (class24) class163.field3132.method1206(var6, -24742);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var21 = var8[var12];
                if (var21 >= 256 && var21 < 512 && !class195.method1287(false, var21 - 256).method1200(18327)) {
                    var11 = true;
                }
                if (var21 >= 512 && !class180.method1196(var21 - 512, 0).method451(this.field8, 125)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field27 != -1L) {
                    var10 = (class24) class163.field3132.method1206(this.field27, -24742);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class52[] var13 = new class52[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var18 = var8[var15];
                    if (var18 >= 256 && var18 < 512) {
                        class52 var19 = class195.method1287(false, var18 - 256).method1201((byte) 43);
                        if (var19 != null) {
                            var13[var14++] = var19;
                        }
                    }
                    if (var18 >= 512) {
                        class52 var20 = class180.method1196(var18 - 512, 0).method450(67, this.field8);
                        if (var20 != null) {
                            var13[var14++] = var20;
                        }
                    }
                }
                class52 var16 = new class52(var13, var14);
                for (int var17 = 0; var17 < 5; var17++) {
                    if (class70.field1310[var17].length > this.field14[var17]) {
                        var16.method324(class161.field3057[var17], class70.field1310[var17][this.field14[var17]]);
                    }
                    if (this.field14[var17] < class80.field1474[var17].length) {
                        var16.method324(class6.field116[var17], class80.field1474[var17][this.field14[var17]]);
                    }
                }
                var10 = var16.method325(64, 850, -30, -50, -30, true, true);
                class163.field3132.method1208(var6, -82, var10);
                this.field27 = var6;
            }
        }
        if (arg3 == null && arg2 == null) {
            return var10;
        }
        class24 var22;
        if (arg3 != null && arg2 != null) {
            var22 = arg3.method1160(var10, arg4, 29426, arg2, arg1);
        } else if (arg3 == null) {
            var22 = arg2.method1167(-102, arg4, var10);
        } else {
            var22 = arg3.method1167(-124, arg1, var10);
        }
        return var22;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ZZI)V")
    public final void method10(boolean arg0, boolean arg1, int arg2) {
        field11++;
        if (!arg0) {
            this.method7(null, 112);
        }
        int var4 = this.field14[arg2];
        if (arg1) {
            var4++;
            if (class70.field1310[arg2].length <= var4) {
                var4 = 0;
            }
        } else {
            var4--;
            if (var4 < 0) {
                var4 = class70.field1310[arg2].length - 1;
            }
        }
        this.field14[arg2] = var4;
        this.method3((byte) 92);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IZ)V")
    public final void method11(int arg0, boolean arg1) {
        field19++;
        if (arg1 != this.field8 && arg0 == 21845) {
            this.method1(3, this.field14, -1, null, arg1);
        }
    }
}
