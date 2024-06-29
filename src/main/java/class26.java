import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class26 implements class134 {

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "I")
    private int field596 = 50;

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "I")
    private int field597 = 128;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "Lnh;")
    private class133 field595;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "Lnh;")
    private class133 field589;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "Loe;")
    private class139 field586;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "Ljd;")
    public static class92 field591 = class202.method1325((byte) 90, "-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

    @OriginalMember(owner = "client!ce", name = "u", descriptor = "Ljd;")
    public static class92 field602 = class202.method1325((byte) 90, "sl_flags");

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!ce", name = "s", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!ce", name = "t", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "Lud;")
    public static class192 field593;

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "[I")
    public static int[] field598;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
    public static void method160(int arg0) {
        field593 = null;
        field598 = null;
        field591 = null;
        field602 = null;
        if (arg0 != 0) {
            method160(-108);
        }
    }

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "(II)Z")
    public final boolean method161(int arg0, int arg1) {
        field588++;
        int var3 = 67 % ((8 - arg1) / 63);
        return this.method167(-90, arg0).field3848;
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(II)[I")
    public final int[] method162(int arg0, int arg1) {
        field600++;
        class70 var3 = new class70(this.field595.method899((byte) 87, 0, arg0));
        if (arg1 < 118) {
            this.method169((byte) 69);
        }
        class197 var4 = new class197(var3);
        return var4.method1306(this.field597, this, this.field589, false);
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(II)Z")
    public final boolean method163(int arg0, int arg1) {
        if (arg0 != 2583) {
            this.field586 = null;
        }
        field594++;
        return this.method167(-117, arg1).method1305(true, this, this.field589);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BI)Z")
    public final boolean method164(byte arg0, int arg1) {
        field585++;
        if (arg0 != -75) {
            this.method169((byte) -102);
        }
        return this.field597 == 64 || this.method167(58, arg1).field3838 == 64;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IZ)V")
    private final void method165(int arg0, boolean arg1) {
        for (class197 var3 = (class197) this.field586.method926(117); var3 != null; var3 = (class197) this.field586.method922(-101)) {
            if (var3.field3835) {
                var3.method1307(arg0, -31);
                var3.field3835 = false;
            }
        }
        if (!arg1) {
            field593 = null;
        }
        field592++;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIII)V")
    public static final void method166(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class163.method1040(arg2, arg3, arg1 + arg2, arg0 + arg3);
        field599++;
        class194.method1286();
        class126.field2545++;
        class176.method1156(true, true);
        class111.method754(64, true);
        class176.method1156(true, false);
        if (arg4 != 4) {
            method166(-73, -8, 74, 40, 73);
        }
        class111.method754(64, false);
        class177.method1168(86);
        class158.method1021((byte) -60);
        if (!class39.field883) {
            int var5 = class129.field2602;
            if (class79.field1614 / 256 > var5) {
                var5 = class79.field1614 / 256;
            }
            if (class32.field728[4] && class110.field2246[4] + 128 > var5) {
                var5 = class110.field2246[4] + 128;
            }
            int var6 = class93.field1874 + class9.field327 & 0x7FF;
            class114.method769(class48.field1041, 248257392, class118.method804(class15.field423.field246, class81.field1639, class15.field423.field208, arg4 ^ 0x4) - 50, var6, var5, class87.field1722, var5 * 3 + 600);
        }
        int var7;
        if (class39.field883) {
            var7 = class88.method587(-30169);
        } else {
            var7 = class69.method410((byte) -117);
        }
        int var8 = class132.field2645;
        int var9 = class124.field2511;
        int var10 = class151.field2991;
        int var11 = class18.field451;
        int var12 = class4.field268;
        for (int var13 = 0; var13 < 5; var13++) {
            if (class32.field728[var13]) {
                int var16 = (int) ((double) -class130.field2615[var13] + Math.random() * (double) (class130.field2615[var13] * 2 + 1) + Math.sin((double) class88.field1745[var13] / 100.0D * (double) class93.field1876[var13]) * (double) class110.field2246[var13]);
                if (var13 == 4) {
                    class18.field451 += var16;
                    if (class18.field451 < 128) {
                        class18.field451 = 128;
                    }
                    if (class18.field451 > 383) {
                        class18.field451 = 383;
                    }
                }
                if (var13 == 3) {
                    class4.field268 = class4.field268 + var16 & 0x7FF;
                }
                if (var13 == 2) {
                    class151.field2991 += var16;
                }
                if (var13 == 1) {
                    class124.field2511 += var16;
                }
                if (var13 == 0) {
                    class132.field2645 += var16;
                }
            }
        }
        int var14 = class29.field641;
        int var15 = class192.field3756;
        if (arg2 <= var14 && arg1 + arg2 > var14 && arg3 <= var15 && var15 < arg3 + arg0) {
            class38.field859 = class29.field641 - arg2;
            class38.field860 = true;
            class38.field858 = 0;
            class38.field865 = class192.field3756 - arg3;
        } else {
            class38.field860 = false;
            class38.field858 = 0;
        }
        class6.method42((byte) -102);
        class163.method1049(arg2, arg3, arg1, arg0, 0);
        class6.method42((byte) -110);
        class40.method258(class132.field2645, class124.field2511, class151.field2991, class18.field451, class4.field268, var7);
        class6.method42((byte) -50);
        class14.method88();
        class108.method747(arg4 - 4, arg2, arg0, arg3, arg1);
        class172.method1135(arg2, (byte) -114, arg3);
        ((class26) class194.field3786).method165(class76.field1588, true);
        class44.method278(arg0, arg3, arg1, arg2, -59);
        class4.field268 = var12;
        class132.field2645 = var8;
        class151.field2991 = var10;
        class124.field2511 = var9;
        class18.field451 = var11;
        if (class182.field3456 && class139.method929(true, 116, false) == 0) {
            class182.field3456 = false;
        }
        if (class182.field3456) {
            class163.method1049(arg2, arg3, arg1, arg0, 0);
            class15.method93((byte) -90, false, class143.field2846);
        }
        if (!class182.field3456 && !class72.field1524 && arg2 <= var14 && arg1 + arg2 > var14 && arg3 <= var15 && var15 < arg0 + arg3) {
            class7.method49(2, var14, arg3, var15, arg2);
        }
    }

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "(II)Lv;")
    private final class197 method167(int arg0, int arg1) {
        field601++;
        class197 var3 = (class197) this.field586.method930(-123, (long) arg1);
        int var4 = 46 % ((8 - arg0) / 42);
        if (var3 != null) {
            return var3;
        }
        byte[] var5 = this.field595.method899((byte) 87, 0, arg1);
        if (var5 == null) {
            return class34.method220(-1);
        } else {
            class70 var6 = new class70(var5);
            class197 var7 = new class197(var6);
            this.field586.method927(24744, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)I")
    public final int method168(int arg0, int arg1) {
        field582++;
        int var3 = 8 / ((-arg1 - 71) / 53);
        return this.method167(-76, arg0).field3852;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
    public final void method169(byte arg0) {
        this.field586 = new class139(this.field596);
        field590++;
        if (arg0 >= -54) {
            this.method165(-40, true);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(FII)[I")
    public final int[] method170(float arg0, int arg1, int arg2) {
        class197 var4 = this.method167(arg2 ^ 0xFFFFBE58, arg1);
        var4.field3835 = true;
        field587++;
        if (arg2 != 16845) {
            field602 = null;
        }
        return var4.method1310(this, this.field589, -63, arg0, this.field597);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IB)Z")
    public final boolean method171(int arg0, byte arg1) {
        field584++;
        if (arg1 > -119) {
            method160(37);
        }
        return this.method167(55, arg0).field3841;
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lnh;Lnh;II)V")
    public class26(class133 arg0, class133 arg1, int arg2, int arg3) {
        this.field596 = arg2;
        this.field595 = arg0;
        this.field597 = arg3;
        this.field589 = arg1;
        this.field586 = new class139(this.field596);
    }
}
