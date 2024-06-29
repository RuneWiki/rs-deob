import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class232 extends class398 {

    @OriginalMember(owner = "client!aq", name = "K", descriptor = "I")
    private int field3085 = 1365;

    @OriginalMember(owner = "client!aq", name = "M", descriptor = "I")
    private int field3087 = 0;

    @OriginalMember(owner = "client!aq", name = "S", descriptor = "I")
    private int field3093 = 20;

    @OriginalMember(owner = "client!aq", name = "T", descriptor = "I")
    private int field3094 = 0;

    @OriginalMember(owner = "client!aq", name = "N", descriptor = "I")
    public static int field3088 = 0;

    @OriginalMember(owner = "client!aq", name = "J", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!aq", name = "L", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!aq", name = "O", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!aq", name = "P", descriptor = "I")
    public static int field3090;

    @OriginalMember(owner = "client!aq", name = "Q", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!aq", name = "R", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Llm;Llm;B)I", line = 3)
    public static final int method1390(class347 arg0, class347 arg1, byte arg2) {
        int var3 = -114 / ((-72 - arg2) / 40);
        ++field3086;
        int var4 = 0;
        if (arg1.method2257(true, class156.field2117)) {
            ++var4;
        }
        if (arg1.method2257(true, class377.field5493)) {
            ++var4;
        }
        if (arg1.method2257(true, class201.field2694)) {
            ++var4;
        }
        if (arg0.method2257(true, class156.field2117)) {
            ++var4;
        }
        if (arg0.method2257(true, class377.field5493)) {
            ++var4;
        }
        if (arg0.method2257(true, class201.field2694)) {
            ++var4;
        }
        return var4;
    }

    @OriginalMember(owner = "client!aq", name = "<init>", descriptor = "()V", line = 36)
    public class232() {
        super(0, true);
    }

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "(II)V", line = 41)
    public static final void method1391(int arg0, int arg1) {
        ++field3090;
        if (~class70.field932 != ~arg1) {
            if (class70.field932 == 0) {
                class173.method1068(arg0 + 153);
            }
            if (arg1 == 40) {
                class26.method187(21274);
            }
            if (arg1 != 40 && class435.field6400 != null) {
                class435.field6400.method1398((byte) -106);
                class435.field6400 = null;
            }
            if (~class70.field932 == -26 || ~class70.field932 == -29) {
                class130.field1798.field5018 = 2;
                class169.field2272.field5018 = 2;
                class349.field5056.field5018 = 2;
                class93.field1339.field5018 = 2;
                class181.field2390.field5018 = 2;
                class393.field5629.field5018 = 2;
                class432.field6348.field5018 = 2;
            }
            if (arg1 == 25 || arg1 == 28) {
                class181.field2397 = 0;
                class351.field5088 = 0;
                class143.field1954 = 1;
                class267.field3851 = 0;
                class161.field2155 = 1;
                class245.method1471(false, true);
                class130.field1798.field5018 = 1;
                class169.field2272.field5018 = 1;
                class349.field5056.field5018 = 1;
                class93.field1339.field5018 = 1;
                class181.field2390.field5018 = 1;
                class393.field5629.field5018 = 1;
                class432.field6348.field5018 = 1;
            }
            if (~arg1 == arg0 || arg1 == 10) {
                class267.method1826((byte) -126);
            }
            if (~arg1 != -6) {
                client.method1539(-113);
            } else {
                class88.method619(false, class61.field807, class362.field5227);
            }
            boolean var2 = arg1 == 5 || ~arg1 == -11 || ~arg1 == -29;
            boolean var3 = class70.field932 == 5 || class70.field932 == 10 || class70.field932 == 28;
            if (!var2 != !var3) {
                if (var2) {
                    class196.field2626 = class40.field551;
                    if (~class400.field5969 != -1) {
                        class435.method2747(class385.field5583, 1, 2, 255, class40.field551, false, 0);
                    } else {
                        class449.method2819(2, -95);
                    }
                    class182.field2480.method2798(false, (byte) -2);
                } else {
                    class449.method2819(2, -128);
                    class182.field2480.method2798(true, (byte) -2);
                    if (class130.field1795 != null) {
                        class130.field1795.method395((byte) -100);
                        class130.field1795 = null;
                    }
                }
            }
            if (~arg1 == -26 || arg1 == 28 || ~arg1 == -41) {
                class61.field807.method1744();
            }
            class70.field932 = arg1;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(II)[I", line = 141)
    public final int[] method95(int arg0, int arg1) {
        ++field3084;
        int[] var3 = super.field5927.method305(arg0, (byte) 116);
        if (arg1 != 0) {
            this.field3093 = 61;
        }
        if (super.field5927.field591) {
            for (int var4 = 0; class140.field1922 > var4; ++var4) {
                int var5 = (class375.field5448[var4] << 12) / this.field3085 - -this.field3094;
                int var6 = (class84.field1206[arg0] << 12) / this.field3085 + this.field3087;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (var11 + var12 < 16384 && ~var13 > ~this.field3093) {
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = -var12 + var7 + var11;
                    var12 = var10 * var10 >> 12;
                    ++var13;
                    var11 = var9 * var9 >> 12;
                }
                var3[var4] = this.field3093 + -1 <= var13 ? 0 : (var13 << 12) / this.field3093;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "(B)V", line = 198)
    public static final void method1392(byte arg0) {
        ++field3089;
        if (class422.field6221 >= 0) {
            long var1 = class114.method735(116);
            class422.field6221 = (int) ((long) class422.field6221 - (-class423.field6234 + var1));
            if (class422.field6221 > 0) {
                int var3 = (class422.field6221 << 8) / class315.field4605;
                int var4 = 255 - var3;
                float var5 = (float) var3 / 255.0F;
                float var6 = 1.0F - var5;
                class262.field3806 = ((65280 & class100.field1397) * var3 + (class48.field679.field6428 & 65280) * var4 & 16711680) + (-16711936 & (16711935 & class100.field1397) * var3 + (16711935 & class48.field679.field6428) * var4) >>> 8;
                class166.field2234 = (class48.field679.field6418 - class181.field2404) * var6 + class181.field2404;
                class227.field2977 = (-class410.field6065 + class48.field679.field6430) * var6 + class410.field6065;
                class166.field2233 = (class48.field679.field6417 - class320.field4690) * var6 + class320.field4690;
                class379.field5527 = (class48.field679.field6422 - class173.field2317) * var6 + class173.field2317;
                class104.field1487 = ((65280 & class94.field1349) * var3 + (65280 & class48.field679.field6423) * var4 & 16711680) + ((class94.field1349 & 16711935) * var3 + (class48.field679.field6423 & 16711935) * var4 & -16711936) >>> 8;
                class167.field2261 = (class48.field679.field6413 - class211.field2825) * var6 + class211.field2825;
                class382.field5541 = class76.field1084 * var3 + class48.field679.field6410 * var4 >> 8;
                class181.field2400 = (-class139.field1914 + class48.field679.field6412) * var6 + class139.field1914;
                if (class380.field5535 != class48.field679.field6414) {
                    class243.field3241 = class69.field894.method1681(class380.field5535, class48.field679.field6414, var6, class243.field3241);
                }
            } else {
                class166.field2233 = class48.field679.field6417;
                class104.field1487 = class48.field679.field6423;
                class181.field2400 = class48.field679.field6412;
                class243.field3241 = class48.field679.field6414;
                class227.field2977 = class48.field679.field6430;
                class422.field6221 = -1;
                class167.field2261 = class48.field679.field6413;
                class382.field5541 = class48.field679.field6410;
                class166.field2234 = class48.field679.field6418;
                class379.field5527 = class48.field679.field6422;
                class262.field3806 = class48.field679.field6428;
            }
            class423.field6234 = var1;
        }
        if (arg0 >= -75) {
            field3088 = -67;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lnj;II)V", line = 266)
    public final void method208(class228 arg0, int arg1, int arg2) {
        ++field3092;
        if (arg2 == -13132) {
            if (~arg1 != -1) {
                if (arg1 != 1) {
                    if (arg1 != 2) {
                        if (~arg1 == -4) {
                            this.field3087 = arg0.method1343(255);
                        }
                    } else {
                        this.field3094 = arg0.method1343(255);
                    }
                } else {
                    this.field3093 = arg0.method1343(arg2 + 13387);
                }
            } else {
                this.field3085 = arg0.method1343(arg2 + 13387);
            }
        }
    }
}
