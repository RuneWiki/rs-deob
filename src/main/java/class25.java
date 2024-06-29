import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class25 extends class56 {

    @OriginalMember(owner = "client!lj", name = "v", descriptor = "I")
    private int field361 = 0;

    @OriginalMember(owner = "client!lj", name = "z", descriptor = "I")
    private int field365 = -32768;

    @OriginalMember(owner = "client!lj", name = "I", descriptor = "Z")
    private boolean field374 = false;

    @OriginalMember(owner = "client!lj", name = "mb", descriptor = "I")
    private int field404 = 0;

    @OriginalMember(owner = "client!lj", name = "gb", descriptor = "I")
    private int field398;

    @OriginalMember(owner = "client!lj", name = "ab", descriptor = "I")
    private int field392;

    @OriginalMember(owner = "client!lj", name = "E", descriptor = "I")
    private int field370;

    @OriginalMember(owner = "client!lj", name = "X", descriptor = "I")
    public int field389;

    @OriginalMember(owner = "client!lj", name = "W", descriptor = "I")
    public int field388;

    @OriginalMember(owner = "client!lj", name = "w", descriptor = "I")
    private int field362;

    @OriginalMember(owner = "client!lj", name = "C", descriptor = "I")
    private int field368;

    @OriginalMember(owner = "client!lj", name = "K", descriptor = "I")
    private int field376;

    @OriginalMember(owner = "client!lj", name = "y", descriptor = "I")
    public int field364;

    @OriginalMember(owner = "client!lj", name = "T", descriptor = "I")
    public int field385;

    @OriginalMember(owner = "client!lj", name = "lb", descriptor = "I")
    public int field403;

    @OriginalMember(owner = "client!lj", name = "S", descriptor = "Lde;")
    private class106 field384;

    @OriginalMember(owner = "client!lj", name = "N", descriptor = "Ljd;")
    private static class85 field379 = class221.method1499("Loaded fonts", (byte) -95);

    @OriginalMember(owner = "client!lj", name = "M", descriptor = "Ljd;")
    public static class85 field378 = class221.method1499(":duelstake:", (byte) -113);

    @OriginalMember(owner = "client!lj", name = "R", descriptor = "I")
    public static int field383 = 20;

    @OriginalMember(owner = "client!lj", name = "F", descriptor = "S")
    public static short field371 = 256;

    @OriginalMember(owner = "client!lj", name = "x", descriptor = "Ljd;")
    public static class85 field363 = field379;

    @OriginalMember(owner = "client!lj", name = "O", descriptor = "Ljd;")
    public static class85 field380 = class221.method1499("W-=hlen Sie eine Welt", (byte) -98);

    @OriginalMember(owner = "client!lj", name = "eb", descriptor = "Z")
    public static boolean field396 = true;

    @OriginalMember(owner = "client!lj", name = "db", descriptor = "J")
    public static long field395 = 0L;

    @OriginalMember(owner = "client!lj", name = "A", descriptor = "D")
    private double field366;

    @OriginalMember(owner = "client!lj", name = "D", descriptor = "D")
    private double field369;

    @OriginalMember(owner = "client!lj", name = "G", descriptor = "D")
    private double field372;

    @OriginalMember(owner = "client!lj", name = "H", descriptor = "D")
    private double field373;

    @OriginalMember(owner = "client!lj", name = "U", descriptor = "D")
    private double field386;

    @OriginalMember(owner = "client!lj", name = "bb", descriptor = "D")
    public double field393;

    @OriginalMember(owner = "client!lj", name = "jb", descriptor = "D")
    public double field401;

    @OriginalMember(owner = "client!lj", name = "kb", descriptor = "D")
    public double field402;

    @OriginalMember(owner = "client!lj", name = "u", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!lj", name = "B", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!lj", name = "J", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!lj", name = "L", descriptor = "I")
    private int field377;

    @OriginalMember(owner = "client!lj", name = "P", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!lj", name = "Q", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!lj", name = "V", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!lj", name = "Y", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!lj", name = "Z", descriptor = "I")
    public int field391;

    @OriginalMember(owner = "client!lj", name = "cb", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!lj", name = "fb", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!lj", name = "hb", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!lj", name = "ib", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "()I")
    public final int method6() {
        field375++;
        return this.field365;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V")
    public static void method161(int arg0) {
        field379 = null;
        field380 = null;
        if (arg0 != -706301625) {
            field378 = null;
        }
        field378 = null;
        field363 = null;
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(IZ)V")
    public static final void method162(int arg0, boolean arg1) {
        for (int var2 = 0; var2 < class44.field775; var2++) {
            long var3 = (long) class137.field2380[var2] << 32 | 0x20000000L;
            class17 var5 = class194.field3320[class137.field2380[var2]];
            if (var5 != null && var5.method128(arg0 ^ 0x75) && arg1 == var5.field247.field4673 && var5.field247.method1803(-127)) {
                int var6 = var5.field1042 >> 7;
                int var7 = var5.field1027 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var5.method311((byte) -38) == 1 && (var5.field1042 & 0x7F) == 64 && (var5.field1027 & 0x7F) == 64) {
                        if (class237.field4096[var6][var7] == class50.field873) {
                            continue;
                        }
                        class237.field4096[var6][var7] = class50.field873;
                    }
                    if (!var5.field247.field4696) {
                        var3 |= Long.MIN_VALUE;
                    }
                    var5.field1045 = class246.method1660(arg0 ^ 0x240235F8, var5.field1042, class116.field2066, var5.field1027);
                    class130.method876(class116.field2066, var5.field1042, var5.field1027, var5.field1045, (var5.method311((byte) 71) - 1) * 64 + 60, var5, var5.field1036, var3, var5.field1065);
                }
            }
        }
        if (arg0 != 127) {
            method165(-67);
        }
        field399++;
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(IZ)V")
    public static final void method163(int arg0, boolean arg1) {
        class252.field4360.method1267(arg0, (byte) -43);
        if (!arg1) {
            method161(-117);
        }
        field400++;
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "(II)V")
    public final void method164(int arg0, int arg1) {
        this.field401 += this.field373 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field386;
        int var3 = 94 / ((arg1 - 61) / 37);
        this.field402 += (double) arg0 * this.field372;
        this.field393 += (double) arg0 * this.field369;
        this.field386 += (double) arg0 * this.field373;
        field382++;
        this.field374 = true;
        this.field391 = (int) (Math.atan2(this.field372, this.field369) * 325.949D) + 1024 & 0x7FF;
        this.field377 = (int) (Math.atan2(this.field386, this.field366) * 325.949D) & 0x7FF;
        if (this.field384 == null) {
            return;
        }
        this.field404 += arg0;
        while (true) {
            do {
                do {
                    if (this.field404 <= this.field384.field1863[this.field361]) {
                        return;
                    }
                    this.field404 -= this.field384.field1863[this.field361];
                    this.field361++;
                } while (this.field384.field1857.length > this.field361);
                this.field361 -= this.field384.field1853;
            } while (this.field361 >= 0 && this.field361 < this.field384.field1857.length);
            this.field361 = 0;
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(I)V")
    public static final void method165(int arg0) {
        field397++;
        class11.method90(arg0 - 52515);
        class28.method199(127);
        class19.method134(5);
        if (arg0 != 27456) {
            return;
        }
        class210.method1445((byte) -124);
        class33.method227((byte) -108);
        class34.method231(114);
        class55.method369((byte) 108);
        class92.method668(-32674);
        class33.method226((byte) -77);
        class150.method983(-19493);
        class147.method960(126);
        class249.method1728(arg0 ^ 0xFFFF94BF);
        class141.method927((byte) 77);
        class64.method433((byte) 106);
        class198.field3392.method1270((byte) 107);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIII)V")
    public final void method166(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field390++;
        if (!this.field374) {
            double var6 = (double) (arg3 - this.field362);
            double var8 = (double) (arg4 - this.field370);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field402 = (double) this.field398 * var6 / var10 + (double) this.field362;
            this.field393 = (double) this.field398 * var8 / var10 + (double) this.field370;
            this.field401 = (double) this.field392;
        }
        double var12 = (double) (this.field364 + 1 - arg1);
        this.field372 = ((double) arg3 - this.field402) / var12;
        this.field369 = ((double) arg4 - this.field393) / var12;
        if (arg2 < 56) {
            this.method166(-93, -9, 85, -76, 32);
        }
        this.field366 = Math.sqrt(this.field372 * this.field372 + this.field369 * this.field369);
        if (!this.field374) {
            this.field386 = -this.field366 * Math.tan((double) this.field376 * 0.02454369D);
        }
        this.field373 = ((double) arg0 - this.field401 - (this.field386 * var12)) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method1(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field381++;
        class26 var11 = this.method168(-114);
        if (var11 != null) {
            var11.method1(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field365 = var11.method6();
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IB)V")
    public static final void method167(int arg0, byte arg1) {
        field394++;
        class171 var2 = class85.method579(3, 0, arg0);
        var2.method1141(-6456);
        int var3 = 123 % ((-arg1 - 27) / 43);
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(I)Lwb;")
    private final class26 method168(int arg0) {
        field387++;
        class71 var2 = class87.method647((byte) 18, this.field368);
        class26 var3 = var2.method497(0, this.field361);
        if (arg0 > -101) {
            this.field393 = 0.553496555484049D;
        }
        if (var3 == null) {
            return null;
        } else {
            var3.method182(this.field377);
            return var3;
        }
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class25(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field398 = arg8;
        this.field392 = arg4;
        this.field370 = arg3;
        this.field389 = arg10;
        this.field388 = arg9;
        this.field362 = arg2;
        this.field368 = arg0;
        this.field376 = arg7;
        this.field374 = false;
        this.field364 = arg6;
        this.field385 = arg1;
        this.field403 = arg5;
        int var12 = class87.method647((byte) 108, this.field368).field1329;
        if (var12 == -1) {
            this.field384 = null;
        } else {
            this.field384 = class101.method704(1, var12);
        }
    }
}
