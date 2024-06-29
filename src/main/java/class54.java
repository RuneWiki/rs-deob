import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class54 {

    @OriginalMember(owner = "client!he", name = "g", descriptor = "[I")
    public static int[] field1432 = new int[2000];

    @OriginalMember(owner = "client!he", name = "f", descriptor = "Z")
    public static boolean field1431 = false;

    @OriginalMember(owner = "client!he", name = "r", descriptor = "Lkd;")
    private static class73 field1443 = class126.method1070((byte) -66, "Please enter your password)3");

    @OriginalMember(owner = "client!he", name = "a", descriptor = "Lkd;")
    public static class73 field1426 = field1443;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "[Lkd;")
    public static class73[] field1440 = new class73[500];

    @OriginalMember(owner = "client!he", name = "w", descriptor = "I")
    public static int field1448 = 0;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "I")
    private int field1435;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!he", name = "q", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!he", name = "v", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "J")
    private long field1427;

    @OriginalMember(owner = "client!he", name = "s", descriptor = "J")
    private long field1444;

    @OriginalMember(owner = "client!he", name = "t", descriptor = "Lse;")
    public static class129 field1445;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "Z")
    public boolean field1438;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "[I")
    private int[] field1429;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "[I")
    private int[] field1436;

    @OriginalMember(owner = "client!he", name = "u", descriptor = "[La;")
    public static class1[] field1446;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)I")
    public final int method430(byte arg0) {
        if (arg0 != -52) {
            this.field1429 = null;
        }
        field1442++;
        return this.field1435 == -1 ? (this.field1429[0] << 25) + (this.field1436[0] << 15) + this.field1436[1] + (this.field1436[11] << 5) + (this.field1436[8] << 10) + (this.field1429[4] << 20) : class141.method1151(this.field1435, 3920).field790 + 305419896;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ILqc;)V")
    public final void method431(int arg0, class114 arg1) {
        arg1.method956((byte) 10, this.field1438 ? 1 : 0);
        for (int var3 = 0; var3 < 7; var3++) {
            int var5 = this.field1436[class34.field958[var3]];
            if (var5 == 0) {
                arg1.method956((byte) 10, -1);
            } else {
                arg1.method956((byte) 10, var5 - 256);
            }
        }
        if (arg0 < 48) {
            field1446 = null;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg1.method956((byte) 10, this.field1429[var4]);
        }
        field1433++;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
    public static void method432(int arg0) {
        if (arg0 != 2000) {
            return;
        }
        field1440 = null;
        field1432 = null;
        field1426 = null;
        field1445 = null;
        field1446 = null;
        field1443 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BZ)V")
    public final void method433(byte arg0, boolean arg1) {
        field1439++;
        if (arg1 != this.field1438 && arg0 == -38) {
            this.method436(arg1, null, -1, 104, this.field1429);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIILf;Lf;)Lna;")
    public final class91 method434(int arg0, int arg1, int arg2, class36 arg3, class36 arg4) {
        field1437++;
        if (this.field1435 != -1) {
            return class141.method1151(this.field1435, 3920).method220(arg2, arg0, arg4, -120, arg3);
        }
        int[] var6 = this.field1436;
        long var7 = this.field1444;
        if (arg4 != null && (arg4.field971 >= 0 || arg4.field967 >= 0)) {
            var6 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var6[var9] = this.field1436[var9];
            }
            if (arg4.field971 >= 0) {
                var7 += arg4.field971 - this.field1436[5] << 8;
                var6[5] = arg4.field971;
            }
            if (arg4.field967 >= 0) {
                var7 += arg4.field967 - this.field1436[3] << 16;
                var6[3] = arg4.field967;
            }
        }
        if (arg1 >= -44) {
            this.field1429 = null;
        }
        class91 var10 = (class91) class64.field1675.method538(0, var7);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var21 = var6[var12];
                if (var21 >= 256 && var21 < 512 && !class60.method505(var21 - 256, true).method524(0)) {
                    var11 = true;
                }
                if (var21 >= 512 && !class9.method86(var21 - 512, (byte) 71).method1061(this.field1438, 119)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field1427 != -1L) {
                    var10 = (class91) class64.field1675.method538(0, this.field1427);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class67[] var13 = new class67[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var18 = var6[var15];
                    if (var18 >= 256 && var18 < 512) {
                        class67 var19 = class60.method505(var18 - 256, true).method523((byte) -103);
                        if (var19 != null) {
                            var13[var14++] = var19;
                        }
                    }
                    if (var18 >= 512) {
                        class67 var20 = class9.method86(var18 - 512, (byte) 68).method1072(this.field1438, 59);
                        if (var20 != null) {
                            var13[var14++] = var20;
                        }
                    }
                }
                class67 var16 = new class67(var13, var14);
                for (int var17 = 0; var17 < 5; var17++) {
                    if (this.field1429[var17] != 0) {
                        var16.method569(class86.field2167[var17][0], class86.field2167[var17][this.field1429[var17]]);
                        if (var17 == 1) {
                            var16.method569(class110.field2713[0], class110.field2713[this.field1429[var17]]);
                        }
                    }
                }
                var10 = var16.method566(64, 850, -30, -50, -30);
                class64.field1675.method542(var10, -901, var7);
                this.field1427 = var7;
            }
        }
        if (arg4 == null && arg3 == null) {
            return var10;
        }
        class91 var22;
        if (arg4 != null && arg3 != null) {
            var22 = arg4.method283(11611, arg3, arg0, var10, arg2);
        } else if (arg4 == null) {
            var22 = arg3.method281(var10, arg2, 0);
        } else {
            var22 = arg4.method281(var10, arg0, 0);
        }
        return var22;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IZB)V")
    public final void method435(int arg0, boolean arg1, byte arg2) {
        field1434++;
        if (arg0 == 1 && this.field1438) {
            return;
        }
        int var4 = this.field1436[class34.field958[arg0]];
        if (var4 == 0) {
            return;
        }
        var4 -= 256;
        if (arg2 <= 76) {
            this.method433((byte) -76, true);
        }
        class63 var5;
        do {
            if (arg1) {
                var4++;
                if (class72.field1822 <= var4) {
                    var4 = 0;
                }
            } else {
                var4--;
                if (var4 < 0) {
                    var4 = class72.field1822 - 1;
                }
            }
            var5 = class60.method505(var4, true);
        } while (var5 == null || var5.field1644 || (this.field1438 ? 7 : 0) + arg0 != var5.field1651);
        this.field1436[class34.field958[arg0]] = var4 + 256;
        this.method437((byte) 113);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Z[III[I)V")
    public final void method436(boolean arg0, int[] arg1, int arg2, int arg3, int[] arg4) {
        int var6 = 18 / ((35 - arg3) / 61);
        if (arg1 == null) {
            arg1 = new int[12];
            for (int var7 = 0; var7 < 7; var7++) {
                for (int var8 = 0; var8 < class72.field1822; var8++) {
                    class63 var9 = class60.method505(var8, true);
                    if (var9 != null && !var9.field1644 && (arg0 ? 7 : 0) + var7 == var9.field1651) {
                        arg1[class34.field958[var7]] = var8 + 256;
                        break;
                    }
                }
            }
        }
        this.field1438 = arg0;
        field1430++;
        this.field1435 = arg2;
        this.field1429 = arg4;
        this.field1436 = arg1;
        this.method437((byte) 113);
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(B)V")
    private final void method437(byte arg0) {
        field1447++;
        long var2 = this.field1444;
        this.field1444 = 0L;
        if (arg0 != 113) {
            return;
        }
        int var4 = this.field1436[9];
        int var5 = this.field1436[5];
        this.field1436[9] = var5;
        this.field1436[5] = var4;
        for (int var6 = 0; var6 < 12; var6++) {
            this.field1444 <<= 0x4;
            if (this.field1436[var6] >= 256) {
                this.field1444 += this.field1436[var6] - 256;
            }
        }
        if (this.field1436[0] >= 256) {
            this.field1444 += this.field1436[0] - 256 >> 4;
        }
        if (this.field1436[1] >= 256) {
            this.field1444 += this.field1436[1] - 256 >> 8;
        }
        for (int var7 = 0; var7 < 5; var7++) {
            this.field1444 <<= 0x3;
            this.field1444 += this.field1429[var7];
        }
        this.field1436[9] = var4;
        this.field1436[5] = var5;
        this.field1444 <<= 0x1;
        this.field1444 += this.field1438 ? 1 : 0;
        if (var2 != 0L && this.field1444 != var2) {
            class64.field1675.method537(var2, 109);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ZIZ)V")
    public final void method438(boolean arg0, int arg1, boolean arg2) {
        field1441++;
        int var4 = this.field1429[arg1];
        if (arg2) {
            this.method436(true, null, -54, 36, null);
        }
        if (arg0) {
            var4++;
            if (var4 >= class86.field2167[arg1].length) {
                var4 = 0;
            }
        } else {
            var4--;
            if (var4 < 0) {
                var4 = class86.field2167[arg1].length - 1;
            }
        }
        this.field1429[arg1] = var4;
        this.method437((byte) 113);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)Lje;")
    public final class67 method439(boolean arg0) {
        field1428++;
        if (this.field1435 != -1) {
            return class141.method1151(this.field1435, 3920).method226(arg0);
        }
        boolean var2 = arg0;
        for (int var3 = 0; var3 < 12; var3++) {
            int var12 = this.field1436[var3];
            if (var12 >= 256 && var12 < 512 && !class60.method505(var12 - 256, true).method526(0)) {
                var2 = true;
            }
            if (var12 >= 512 && !class9.method86(var12 - 512, (byte) 62).method1064(1, this.field1438)) {
                var2 = true;
            }
        }
        if (var2) {
            return null;
        }
        class67[] var4 = new class67[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var9 = this.field1436[var6];
            if (var9 >= 256 && var9 < 512) {
                class67 var10 = class60.method505(var9 - 256, true).method530((byte) -64);
                if (var10 != null) {
                    var4[var5++] = var10;
                }
            }
            if (var9 >= 512) {
                class67 var11 = class9.method86(var9 - 512, (byte) 61).method1073(true, this.field1438);
                if (var11 != null) {
                    var4[var5++] = var11;
                }
            }
        }
        class67 var7 = new class67(var4, var5);
        for (int var8 = 0; var8 < 5; var8++) {
            if (this.field1429[var8] != 0) {
                var7.method569(class86.field2167[var8][0], class86.field2167[var8][this.field1429[var8]]);
                if (var8 == 1) {
                    var7.method569(class110.field2713[0], class110.field2713[this.field1429[var8]]);
                }
            }
        }
        return var7;
    }
}
