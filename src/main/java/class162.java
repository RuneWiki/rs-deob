import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class162 extends class304 {

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "[I")
    public static int[] field2324 = new int[25];

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "Lcs;")
    public static class351 field2321 = new class351(13, 8);

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "[I")
    public static int[] field2333 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "C")
    public char field2330;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
    public int field2319;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "I")
    public int field2331;

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "J")
    public long field2329;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "Lmb;")
    public class162 field2323;

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "Z")
    public boolean field2325;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lkm;I)V", line = 8)
    public static final void method983(class487 arg0, int arg1) {
        field2328++;
        arg0.method1094(0, 0, class67.field987, 350);
        arg0.method1107(0, 0, class67.field987, 350, class214.field3034 << 24 | 0x332277, 1);
        for (int var2 = 0; var2 < 100; var2++) {
            int var14 = class77.field1168[var2];
            int var15 = class456.field6318[var2];
            arg0.method1107(var14, var15, 2, 2, class347.field4754[var2] << 24 | 0xFFFFFF, 1);
        }
        int var3 = 350 / class27.field454;
        if (class389.field5490 > 0) {
            int var4 = 346 - class27.field454 - 4;
            int var5 = var3 * var4 / (class389.field5490 + var3 - 1);
            int var6 = 4;
            if (class389.field5490 > 1) {
                var6 += (class389.field5490 - class240.field3381 - 1) * (var4 - var5) / (class389.field5490 - 1);
            }
            arg0.method1107(class67.field987 - 16, var6, 12, var5, class214.field3034 << 24 | 0x332277, 2);
            for (int var7 = class240.field3381; var7 < (class240.field3381 + var3) && var7 < class389.field5490; var7++) {
                String[] var8 = class326.method1958((byte) 126, class345.field4714[var7], '\b');
                int var9 = (class67.field987 - 16 - 8) / var8.length;
                for (int var10 = 0; var10 < var8.length; var10++) {
                    int var11 = (var9 * var10) + 8;
                    arg0.method1094(var11, 0, var9 + var11 - 8, 350);
                    class262.field3662.method2835(350 - class437.field5993.field1148 - class241.field3410 - ((-class240.field3381 + var7) * class27.field454) - 2, var8[var10], -1, -16777216, (byte) 49, var11);
                }
            }
        }
        arg0.method1094(0, 0, class67.field987, 350);
        arg0.method2859(class67.field987, (byte) -6, 0, -1, 350 - class241.field3410);
        class211.field2981.method2835(350 - class328.field4531.field1148 - 1, "--> " + class228.field3232, -1, -16777216, (byte) 122, 10);
        int var12 = -1;
        if ((class356.field4972 % 30) > 15) {
            var12 = 16777215;
        }
        arg0.method2864(0, var12, class328.field4531.method522(-104, "--> " + class228.field3232.substring(0, class327.field4510)) + 10, 12, 350 - class328.field4531.field1148 - 11);
        int var13 = -54 / ((arg1 - 37) / 37);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(JZ)V", line = 84)
    public static final void method984(long arg0, boolean arg1) {
        field2332++;
        if (class455.field6293 != null) {
            if (class375.field5312 == 1 || class375.field5312 == 5) {
                class81.method562(-10372, arg0);
            } else if (class375.field5312 == 4) {
                class131.method792(arg0, -31970);
            }
        }
        class254.method1575(arg1, class338.field4636, (long) class356.field4972);
        if (class182.field2652 != -1) {
            class82.method565(-1, class182.field2652);
        }
        for (int var3 = 0; var3 < class417.field5736; var3++) {
            if (class127.field1809[var3]) {
                class258.field3607[var3] = true;
            }
            class180.field2613[var3] = class127.field1809[var3];
            class127.field1809[var3] = false;
        }
        class287.field3913 = class356.field4972;
        if (class338.field4636.method1092()) {
            class485.field6852 = true;
        }
        if (class182.field2652 != -1) {
            class417.field5736 = 0;
            class33.method254(1);
        }
        class338.field4636.method1137();
        class77.method534(13521, class338.field4636);
        int var4 = class336.method2002(7353);
        if (var4 == -1) {
            var4 = class326.field4500;
        }
        class478.method2812(arg1, var4);
        class407.method2393(64, class42.field717, class2.field21.field6746, class2.field21.field6766, class2.field21.field6765);
        class42.field717 = 0;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)I", line = 144)
    public final int method985(byte arg0) {
        field2327++;
        int var2 = 110 % ((arg0 - 58) / 62);
        return this.field2319;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(B)Z", line = 165)
    public final boolean method986(byte arg0) {
        int var2 = -61 % ((arg0 + 65) / 56);
        field2326++;
        return this.field2325;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)C", line = 177)
    public final char method987(int arg0) {
        if (arg0 > -31) {
            this.field2319 = 30;
        }
        field2317++;
        return this.field2330;
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)V", line = 189)
    public static void method988(int arg0) {
        field2321 = null;
        field2324 = null;
        if (arg0 != 1792106936) {
            field2321 = null;
        }
        field2333 = null;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)V", line = 204)
    public static final void method989(int arg0, int arg1) {
        field2320++;
        if (arg0 <= 84) {
            method989(80, 72);
        }
        class265 var2 = class440.method2554(arg1, 2, 12);
        var2.method1677(21748);
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)I", line = 219)
    public final int method990(int arg0) {
        field2318++;
        if (arg0 != 0) {
            method988(45);
        }
        return this.field2331;
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)J", line = 230)
    public final long method991(int arg0) {
        if (arg0 <= 85) {
            return 125L;
        } else {
            field2322++;
            return this.field2329;
        }
    }
}
