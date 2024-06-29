import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class454 {

    @OriginalMember(owner = "client!sq", name = "o", descriptor = "I")
    private int field6272 = 0;

    @OriginalMember(owner = "client!sq", name = "k", descriptor = "I")
    public int field6268;

    @OriginalMember(owner = "client!sq", name = "j", descriptor = "[Lag;")
    public class180[] field6267;

    @OriginalMember(owner = "client!sq", name = "h", descriptor = "Lcs;")
    public static class351 field6265 = new class351(20, 8);

    @OriginalMember(owner = "client!sq", name = "p", descriptor = "Z")
    public static boolean field6273 = false;

    @OriginalMember(owner = "client!sq", name = "t", descriptor = "Lfn;")
    public static class52 field6277 = new class52(67, 0);

    @OriginalMember(owner = "client!sq", name = "u", descriptor = "[I")
    public static int[] field6278 = new int[250];

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "I")
    public static int field6258;

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "I")
    public static int field6260;

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "I")
    public static int field6261;

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "I")
    public static int field6262;

    @OriginalMember(owner = "client!sq", name = "f", descriptor = "I")
    public static int field6263;

    @OriginalMember(owner = "client!sq", name = "g", descriptor = "I")
    public static int field6264;

    @OriginalMember(owner = "client!sq", name = "i", descriptor = "I")
    public static int field6266;

    @OriginalMember(owner = "client!sq", name = "l", descriptor = "I")
    public static int field6269;

    @OriginalMember(owner = "client!sq", name = "n", descriptor = "I")
    public static int field6271;

    @OriginalMember(owner = "client!sq", name = "s", descriptor = "I")
    public static int field6276;

    @OriginalMember(owner = "client!sq", name = "m", descriptor = "J")
    private long field6270;

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "Lag;")
    private class180 field6259;

    @OriginalMember(owner = "client!sq", name = "q", descriptor = "Lag;")
    private class180 field6274;

    @OriginalMember(owner = "client!sq", name = "r", descriptor = "Lfc;")
    public static class343 field6275;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(JI)Lag;")
    public final class180 method2614(long arg0, int arg1) {
        field6271++;
        this.field6270 = arg0;
        int var4 = 18 / ((-arg1 - 25) / 51);
        class180 var5 = this.field6267[(int) (arg0 & (long) (this.field6268 - 1))];
        for (this.field6259 = var5.field2610; this.field6259 != var5; this.field6259 = this.field6259.field2610) {
            if (this.field6259.field2608 == arg0) {
                class180 var6 = this.field6259;
                this.field6259 = this.field6259.field2610;
                return var6;
            }
        }
        this.field6259 = null;
        return null;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)Lag;")
    public final class180 method2615(byte arg0) {
        if (arg0 != -18) {
            this.method2621(-34);
        }
        field6269++;
        this.field6272 = 0;
        return this.method2619((byte) -98);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Z)Lag;")
    public final class180 method2616(boolean arg0) {
        field6258++;
        if (this.field6259 == null) {
            return null;
        }
        class180 var2 = this.field6267[(int) ((long) (this.field6268 - 1) & this.field6270)];
        if (arg0) {
            return null;
        }
        while (this.field6259 != var2) {
            if (this.field6259.field2608 == this.field6270) {
                class180 var3 = this.field6259;
                this.field6259 = this.field6259.field2610;
                return var3;
            }
            this.field6259 = this.field6259.field2610;
        }
        this.field6259 = null;
        return null;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)I")
    public final int method2617(int arg0) {
        if (arg0 == 1032) {
            field6262++;
            return this.field6268;
        } else {
            return 127;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "([Lag;I)I")
    public final int method2618(class180[] arg0, int arg1) {
        field6276++;
        if (arg1 != -1) {
            this.method2618((class180[]) null, 7);
        }
        int var3 = 0;
        for (int var4 = 0; var4 < this.field6268; var4++) {
            class180 var5 = this.field6267[var4];
            for (class180 var6 = var5.field2610; var6 != var5; var6 = var6.field2610) {
                arg0[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(B)Lag;")
    public final class180 method2619(byte arg0) {
        field6263++;
        if (this.field6272 > 0 && this.field6267[this.field6272 - 1] != this.field6274) {
            class180 var2 = this.field6274;
            this.field6274 = var2.field2610;
            return var2;
        } else if (arg0 == -98) {
            while (this.field6268 > this.field6272) {
                class180 var3 = this.field6267[this.field6272++].field2610;
                if (this.field6267[this.field6272 - 1] != var3) {
                    this.field6274 = var3.field2610;
                    return var3;
                }
            }
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(JLag;Z)V")
    public final void method2620(long arg0, class180 arg1, boolean arg2) {
        if (arg2) {
            this.method2620(-49L, (class180) null, true);
        }
        if (arg1.field2609 != null) {
            arg1.method1182(28818);
        }
        field6261++;
        class180 var5 = this.field6267[(int) (arg0 & (long) (this.field6268 - 1))];
        arg1.field2609 = var5.field2609;
        arg1.field2610 = var5;
        arg1.field2609.field2610 = arg1;
        arg1.field2610.field2609 = arg1;
        arg1.field2608 = arg0;
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(I)I")
    public final int method2621(int arg0) {
        field6266++;
        int var2 = 0;
        if (arg0 != -1) {
            this.method2616(false);
        }
        for (int var3 = 0; var3 < this.field6268; var3++) {
            class180 var4 = this.field6267[var3];
            class180 var5 = var4.field2610;
            while (var4 != var5) {
                var5 = var5.field2610;
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IBI)V")
    public static final void method2622(int arg0, byte arg1, int arg2) {
        field6260++;
        if (arg1 > 94) {
            class265 var3 = class440.method2554(arg2, 2, 16);
            var3.method1675(false);
            var3.field3698 = arg0;
        }
    }

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "(B)V")
    public final void method2623(byte arg0) {
        field6264++;
        int var2 = 122 % ((arg0 - 37) / 38);
        for (int var3 = 0; var3 < this.field6268; var3++) {
            class180 var4 = this.field6267[var3];
            while (true) {
                class180 var5 = var4.field2610;
                if (var4 == var5) {
                    break;
                }
                var5.method1182(28818);
            }
        }
        this.field6274 = null;
        this.field6259 = null;
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(I)V")
    public class454(int arg0) {
        this.field6268 = arg0;
        this.field6267 = new class180[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class180 var3 = this.field6267[var2] = new class180();
            var3.field2609 = var3;
            var3.field2610 = var3;
        }
    }

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "(I)V")
    public static void method2624(int arg0) {
        field6278 = null;
        field6277 = null;
        field6265 = null;
        if (arg0 != 0) {
            field6265 = null;
        }
        field6275 = null;
    }
}
