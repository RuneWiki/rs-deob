import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class17 {

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "[I")
    public static int[] field414 = new int[32];

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field408 = 0;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "[I")
    public static int[] field420 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "[I")
    public static int[] field427 = new int[200];

    @OriginalMember(owner = "client!cb", name = "w", descriptor = "Lid;")
    private static class60 field429 = class11.method72("as it was used to break our rules)3", (byte) -100);

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "Lid;")
    public static class60 field419 = class11.method72("m", (byte) 104);

    @OriginalMember(owner = "client!cb", name = "B", descriptor = "I")
    public static int field434 = 1;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "Lid;")
    public static class60 field407 = field429;

    @OriginalMember(owner = "client!cb", name = "D", descriptor = "Lid;")
    private static class60 field436 = class11.method72("flash1:", (byte) -36);

    @OriginalMember(owner = "client!cb", name = "E", descriptor = "Lid;")
    public static class60 field437 = field436;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "Lid;")
    public static class60 field417 = field436;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!cb", name = "x", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!cb", name = "y", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!cb", name = "z", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!cb", name = "C", descriptor = "I")
    private int field435;

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "J")
    private long field428;

    @OriginalMember(owner = "client!cb", name = "A", descriptor = "J")
    private long field433;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "Lkd;")
    public static class73 field418;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "Z")
    public boolean field412;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "[I")
    private int[] field409;

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "[I")
    private int[] field425;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IZZ)V")
    public final void method133(int arg0, boolean arg1, boolean arg2) {
        field432++;
        if (!arg2) {
            method142(-113, false, null);
        }
        int var4 = this.field409[arg0];
        if (arg1) {
            var4++;
            if (class152.field3401[arg0].length <= var4) {
                var4 = 0;
            }
        } else {
            var4--;
            if (var4 < 0) {
                var4 = class152.field3401[arg0].length - 1;
            }
        }
        this.field409[arg0] = var4;
        this.method139((byte) -118);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILof;)V")
    public final void method134(int arg0, class103 arg1) {
        arg1.method818(false, this.field412 ? 1 : 0);
        if (arg0 != -3975) {
            return;
        }
        field421++;
        for (int var3 = 0; var3 < 7; var3++) {
            int var5 = this.field425[class56.field1396[var3]];
            if (var5 == 0) {
                arg1.method818(false, -1);
            } else {
                arg1.method818(false, var5 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg1.method818(false, this.field409[var4]);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZII)V")
    public final void method135(boolean arg0, int arg1, int arg2) {
        field410++;
        if (arg1 == 1 && this.field412) {
            return;
        }
        int var4 = this.field425[class56.field1396[arg1]];
        if (arg2 == var4) {
            return;
        }
        var4 -= 256;
        class42 var5;
        do {
            if (arg0) {
                var4++;
                if (var4 >= class136.field3096) {
                    var4 = 0;
                }
            } else {
                var4--;
                if (var4 < 0) {
                    var4 = class136.field3096 - 1;
                }
            }
            var5 = class121.method944(-20816, var4);
        } while (var5 == null || var5.field1127 || (this.field412 ? 7 : 0) + arg1 != var5.field1129);
        this.field425[class56.field1396[arg1]] = var4 + 256;
        this.method139((byte) 36);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lgd;IILgd;I)Lka;")
    public final class70 method136(class46 arg0, int arg1, int arg2, class46 arg3, int arg4) {
        field431++;
        if (this.field435 != -1) {
            return class73.method562(this.field435, (byte) 103).method1176(arg4, -126, arg0, arg1, arg3);
        }
        if (arg2 != 1) {
            this.method137(false);
        }
        int[] var6 = this.field425;
        long var7 = this.field428;
        if (arg3 != null && (arg3.field1224 >= 0 || arg3.field1221 >= 0)) {
            var6 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var6[var9] = this.field425[var9];
            }
            if (arg3.field1224 >= 0) {
                var7 += arg3.field1224 - this.field425[5] << 8;
                var6[5] = arg3.field1224;
            }
            if (arg3.field1221 >= 0) {
                var7 += arg3.field1221 - this.field425[3] << 16;
                var6[3] = arg3.field1221;
            }
        }
        class70 var10 = (class70) class32.field752.method918(arg2 ^ 0x64, var7);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var21 = var6[var12];
                if (var21 >= 256 && var21 < 512 && !class121.method944(-20816, var21 - 256).method334(-27)) {
                    var11 = true;
                }
                if (var21 >= 512 && !class85.method710(var21 - 512, 10).method701((byte) 102, this.field412)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field433 != -1L) {
                    var10 = (class70) class32.field752.method918(97, this.field433);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class96[] var13 = new class96[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var18 = var6[var15];
                    if (var18 >= 256 && var18 < 512) {
                        class96 var19 = class121.method944(arg2 - 20817, var18 + -256).method330(5884);
                        if (var19 != null) {
                            var13[var14++] = var19;
                        }
                    }
                    if (var18 >= 512) {
                        class96 var20 = class85.method710(var18 - 512, arg2 ^ 0xB).method698(this.field412, 9010);
                        if (var20 != null) {
                            var13[var14++] = var20;
                        }
                    }
                }
                class96 var16 = new class96(var13, var14);
                for (int var17 = 0; var17 < 5; var17++) {
                    if (this.field409[var17] < class152.field3401[var17].length) {
                        var16.method754(class61.field1532[var17], class152.field3401[var17][this.field409[var17]]);
                    }
                    if (this.field409[var17] < class59.field1424[var17].length) {
                        var16.method754(class89.field2208[var17], class59.field1424[var17][this.field409[var17]]);
                    }
                }
                var10 = var16.method749(64, 850, -30, -50, -30);
                class32.field752.method914(var10, var7, (byte) 116);
                this.field433 = var7;
            }
        }
        if (arg3 == null && arg0 == null) {
            return var10;
        }
        class70 var22;
        if (arg3 != null && arg0 != null) {
            var22 = arg3.method365(arg1, arg4, (byte) 68, var10, arg0);
        } else if (arg3 == null) {
            var22 = arg0.method357(65535, arg4, var10);
        } else {
            var22 = arg3.method357(arg2 + 65534, arg1, var10);
        }
        return var22;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)Lnf;")
    public final class96 method137(boolean arg0) {
        field426++;
        if (this.field435 != -1) {
            return class73.method562(this.field435, (byte) 103).method1180(5871);
        }
        boolean var2 = arg0;
        for (int var3 = 0; var3 < 12; var3++) {
            int var12 = this.field425[var3];
            if (var12 >= 256 && var12 < 512 && !class121.method944(-20816, var12 - 256).method329(73)) {
                var2 = true;
            }
            if (var12 >= 512 && !class85.method710(var12 - 512, 10).method705(-75, this.field412)) {
                var2 = true;
            }
        }
        if (var2) {
            return null;
        }
        class96[] var4 = new class96[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var9 = this.field425[var6];
            if (var9 >= 256 && var9 < 512) {
                class96 var10 = class121.method944(-20816, var9 - 256).method327(true);
                if (var10 != null) {
                    var4[var5++] = var10;
                }
            }
            if (var9 >= 512) {
                class96 var11 = class85.method710(var9 - 512, 10).method700((byte) -125, this.field412);
                if (var11 != null) {
                    var4[var5++] = var11;
                }
            }
        }
        class96 var7 = new class96(var4, var5);
        for (int var8 = 0; var8 < 5; var8++) {
            if (class152.field3401[var8].length > this.field409[var8]) {
                var7.method754(class61.field1532[var8], class152.field3401[var8][this.field409[var8]]);
            }
            if (this.field409[var8] < class59.field1424[var8].length) {
                var7.method754(class89.field2208[var8], class59.field1424[var8][this.field409[var8]]);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)I")
    public final int method138(int arg0) {
        field424++;
        if (arg0 != 16448869) {
            this.method138(22);
        }
        return this.field435 == -1 ? (this.field425[0] << 15) + (this.field409[4] << 20) + (this.field409[0] << 25) + (this.field425[8] << 10) + (this.field425[11] << 5) + this.field425[1] : class73.method562(this.field435, (byte) 103).field3465 + 305419896;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V")
    private final void method139(byte arg0) {
        field415++;
        long var2 = this.field428;
        this.field428 = 0L;
        int var4 = this.field425[5];
        int var5 = this.field425[9];
        int var6 = -45 % ((arg0 + 49) / 50);
        this.field425[9] = var4;
        this.field425[5] = var5;
        for (int var7 = 0; var7 < 12; var7++) {
            this.field428 <<= 0x4;
            if (this.field425[var7] >= 256) {
                this.field428 += this.field425[var7] - 256;
            }
        }
        if (this.field425[0] >= 256) {
            this.field428 += this.field425[0] - 256 >> 4;
        }
        if (this.field425[1] >= 256) {
            this.field428 += this.field425[1] - 256 >> 8;
        }
        for (int var8 = 0; var8 < 5; var8++) {
            this.field428 <<= 0x3;
            this.field428 += this.field409[var8];
        }
        this.field425[5] = var4;
        this.field428 <<= 0x1;
        this.field428 += this.field412 ? 1 : 0;
        this.field425[9] = var5;
        if (var2 != 0L && this.field428 != var2) {
            class32.field752.method915(-123, var2);
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
    public static void method140(int arg0) {
        if (arg0 <= 31) {
            return;
        }
        field407 = null;
        field436 = null;
        field414 = null;
        field418 = null;
        field417 = null;
        field437 = null;
        field419 = null;
        field429 = null;
        field420 = null;
        field427 = null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BI)Lid;")
    public static final class60 method141(byte arg0, int arg1) {
        field422++;
        if (arg0 < 89) {
            return null;
        } else if (class80.field1995[arg1].method447((byte) 39) > 0) {
            return class104.method853(-83, new class60[] { class64.field1590[arg1], class103.field2515, class80.field1995[arg1] });
        } else {
            return class64.field1590[arg1];
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IZLof;)Lid;")
    public static final class60 method142(int arg0, boolean arg1, class103 arg2) {
        field430++;
        try {
            class60 var3 = new class60();
            var3.field1474 = arg2.method835(-24298);
            if (arg0 < var3.field1474) {
                var3.field1474 = arg0;
            }
            if (!arg1) {
                field434 = 10;
            }
            var3.field1453 = new byte[var3.field1474];
            arg2.field2501 += class109.field2662.method258(6116423, 0, var3.field1453, arg2.field2501, var3.field1474, arg2.field2498);
            return var3;
        } catch (Exception var4) {
            return class102.field2478;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II[I[IZ)V")
    public final void method143(int arg0, int arg1, int[] arg2, int[] arg3, boolean arg4) {
        if (arg2 == null) {
            arg2 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class136.field3096; var7++) {
                    class42 var8 = class121.method944(-20816, var7);
                    if (var8 != null && !var8.field1127 && (arg4 ? 7 : 0) + var6 == var8.field1129) {
                        arg2[class56.field1396[var6]] = var7 + 256;
                        break;
                    }
                }
            }
        }
        this.field435 = arg1;
        if (arg0 > -40) {
            this.method138(-56);
        }
        this.field425 = arg2;
        field423++;
        this.field412 = arg4;
        this.field409 = arg3;
        this.method139((byte) -117);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZI)V")
    public final void method144(boolean arg0, int arg1) {
        field413++;
        if (arg0 != this.field412) {
            if (arg1 >= -56) {
                this.method138(71);
            }
            this.method143(-96, -1, null, this.field409, arg0);
        }
    }
}
