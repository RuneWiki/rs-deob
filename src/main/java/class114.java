import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class114 extends class89 {

    @OriginalMember(owner = "client!ua", name = "U", descriptor = "I")
    private int field2013 = 20;

    @OriginalMember(owner = "client!ua", name = "X", descriptor = "I")
    private int field2016 = 0;

    @OriginalMember(owner = "client!ua", name = "Z", descriptor = "I")
    private int field2018 = 1365;

    @OriginalMember(owner = "client!ua", name = "ab", descriptor = "I")
    private int field2019 = 0;

    @OriginalMember(owner = "client!ua", name = "T", descriptor = "[J")
    public static long[] field2012 = new long[100];

    @OriginalMember(owner = "client!ua", name = "W", descriptor = "[I")
    public static int[] field2015 = new int[100];

    @OriginalMember(owner = "client!ua", name = "V", descriptor = "[Lji;")
    public static class9[] field2014 = new class9[4];

    @OriginalMember(owner = "client!ua", name = "cb", descriptor = "[I")
    public static int[] field2021 = new int[100];

    @OriginalMember(owner = "client!ua", name = "Y", descriptor = "Lpb;")
    public static class124 field2017 = class152.method1075(128);

    @OriginalMember(owner = "client!ua", name = "gb", descriptor = "Z")
    public static volatile boolean field2025 = false;

    @OriginalMember(owner = "client!ua", name = "fb", descriptor = "Lda;")
    private static class275 field2024 = class255.method1672(126, "flash3:");

    @OriginalMember(owner = "client!ua", name = "hb", descriptor = "Lda;")
    public static class275 field2026 = field2024;

    @OriginalMember(owner = "client!ua", name = "eb", descriptor = "Lda;")
    public static class275 field2023 = field2024;

    @OriginalMember(owner = "client!ua", name = "Q", descriptor = "I")
    public static int field2009;

    @OriginalMember(owner = "client!ua", name = "S", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!ua", name = "bb", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!ua", name = "db", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!ua", name = "jb", descriptor = "Lma;")
    public static class105 field2028;

    @OriginalMember(owner = "client!ua", name = "R", descriptor = "[I")
    public static int[] field2010;

    @OriginalMember(owner = "client!ua", name = "ib", descriptor = "[I")
    public static int[] field2027;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "(I)V")
    public static void method834(int arg0) {
        if (arg0 != 0) {
            field2025 = true;
        }
        field2014 = null;
        field2028 = null;
        field2012 = null;
        field2017 = null;
        field2024 = null;
        field2010 = null;
        field2021 = null;
        field2027 = null;
        field2015 = null;
        field2026 = null;
        field2023 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IZ)[I")
    public final int[] method239(int arg0, boolean arg1) {
        ++field2011;
        int[] var3 = super.field1503.method229(arg0, (byte) -69);
        if (super.field1503.field664) {
            for (int var4 = 0; var4 < class65.field1070; ++var4) {
                int var5 = (class185.field3172[var4] << 12) / this.field2018 - -this.field2019;
                int var6 = (class91.field1552[arg0] << 12) / this.field2018 - -this.field2016;
                int var7 = var5;
                int var8 = var5;
                int var9 = var6;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = 0;
                for (int var13 = var6 * var6 >> 12; ~(var11 + var13) > -16385 && var12 < this.field2013; var13 = var9 * var9 >> 12) {
                    ++var12;
                    var9 = (var8 * var9 >> 12) * 2 - -var10;
                    var8 = var7 + var11 + -var13;
                    var11 = var8 * var8 >> 12;
                }
                var3[var4] = this.field2013 + -1 <= var12 ? 0 : (var12 << 12) / this.field2013;
            }
        }
        if (arg1) {
            this.method239(81, true);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILij;I)V")
    public final void method49(int arg0, class85 arg1, int arg2) {
        ++field2020;
        if (arg0 == -20503) {
            if (~arg2 != -1) {
                if (arg2 != 1) {
                    if (arg2 != 2) {
                        if (arg2 == 3) {
                            this.field2016 = arg1.method608(127);
                        }
                    } else {
                        this.field2019 = arg1.method608(66);
                    }
                } else {
                    this.field2013 = arg1.method608(109);
                }
            } else {
                this.field2018 = arg1.method608(39);
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V")
    public class114() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "(I)Lkb;")
    public static final class259 method835(int arg0) {
        ++field2009;
        int var1 = class32.field480[0] * class152.field2662[arg0];
        byte[] var2 = class67.field1101[0];
        class259 var6;
        if (class158.field2775[0]) {
            int[] var3 = new int[var1];
            byte[] var4 = class144.field2520[0];
            for (int var5 = 0; ~var5 > ~var1; ++var5) {
                var3[var5] = class246.method1612(class270.field4695[class19.method98(255, var2[var5])], class19.method98(255, var4[var5]) << 24);
            }
            var6 = new class101(class267.field4646, class250.field4419, field2010[0], class246.field4357[0], class152.field2662[0], class32.field480[0], var3);
        } else {
            int[] var7 = new int[var1];
            for (int var8 = 0; ~var8 > ~var1; ++var8) {
                var7[var8] = class270.field4695[class19.method98(255, var2[var8])];
            }
            var6 = new class259(class267.field4646, class250.field4419, field2010[0], class246.field4357[0], class152.field2662[0], class32.field480[0], var7);
        }
        class134.method978(-105);
        return var6;
    }
}
