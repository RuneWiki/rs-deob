import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class7 extends class17 {

    @OriginalMember(owner = "client!ba", name = "J", descriptor = "I")
    public int field142;

    @OriginalMember(owner = "client!ba", name = "y", descriptor = "I")
    private int field131;

    @OriginalMember(owner = "client!ba", name = "E", descriptor = "[[I")
    public int[][] field137;

    @OriginalMember(owner = "client!ba", name = "K", descriptor = "[I")
    public int[] field143;

    @OriginalMember(owner = "client!ba", name = "z", descriptor = "Lke;")
    private static class65 field132 = class1.method17("wishes to trade with you)3", -116);

    @OriginalMember(owner = "client!ba", name = "x", descriptor = "[I")
    public static int[] field130 = new int[50];

    @OriginalMember(owner = "client!ba", name = "D", descriptor = "Lke;")
    public static class65 field136 = field132;

    @OriginalMember(owner = "client!ba", name = "C", descriptor = "[I")
    public static int[] field135 = new int[500];

    @OriginalMember(owner = "client!ba", name = "F", descriptor = "Lqd;")
    public static class100 field138 = new class100(100);

    @OriginalMember(owner = "client!ba", name = "L", descriptor = "I")
    public static int field144 = 0;

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!ba", name = "A", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!ba", name = "B", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!ba", name = "G", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!ba", name = "H", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!ba", name = "I", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!ba", name = "N", descriptor = "Ljd;")
    public static class58 field145;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(ILjd;)V", line = 35)
    public static final void method49(int arg0, class58 arg1) {
        class6.field107 = arg1;
        field141++;
        class55.field1415 = class6.field107.method479((byte) 47, 16);
        if (arg0 != -4) {
            field138 = null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IZLjd;Ljd;)V", line = 47)
    public static final void method50(int arg0, boolean arg1, class58 arg2, class58 arg3) {
        class33.field852 = arg3;
        class114.field2876 = arg2;
        class5.field93 = arg1;
        if (arg0 < 8) {
            method52(-41);
        }
        field133++;
        class94.field2496 = class33.field852.method479((byte) 57, 10);
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(I)V", line = 61)
    public static final void method51(int arg0) {
        if (class46.field1215 == 1) {
            if (class1.field42 >= 6 && class1.field42 <= 106 && class115.field2901 >= 467 && class115.field2901 <= 499) {
                class32.field832++;
                class60.field1611 = true;
                class39.field996 = true;
                class6.field108 = (class6.field108 + 1) % 4;
                class56.field1453.method642(164, false);
                class56.field1453.method305(false, class6.field108);
                class56.field1453.method305(false, class114.field2865);
                class56.field1453.method305(false, class93.field2442);
            }
            if (class1.field42 >= 135 && class1.field42 <= 235 && class115.field2901 >= 467 && class115.field2901 <= 499) {
                class60.field1611 = true;
                class32.field832++;
                class114.field2865 = (class114.field2865 + 1) % 3;
                class39.field996 = true;
                class56.field1453.method642(164, false);
                class56.field1453.method305(false, class6.field108);
                class56.field1453.method305(false, class114.field2865);
                class56.field1453.method305(false, class93.field2442);
            }
            if (class1.field42 >= 273 && class1.field42 <= 373 && class115.field2901 >= 467 && class115.field2901 <= 499) {
                class39.field996 = true;
                class32.field832++;
                class93.field2442 = (class93.field2442 + 1) % 3;
                class60.field1611 = true;
                class56.field1453.method642(164, false);
                class56.field1453.method305(false, class6.field108);
                class56.field1453.method305(false, class114.field2865);
                class56.field1453.method305(false, class93.field2442);
            }
            if (class1.field42 >= 412 && class1.field42 <= 512 && class115.field2901 >= 467 && class115.field2901 <= 499) {
                if (class93.field2472 == -1) {
                    class13.method79((byte) -86);
                    if (class20.field493 != -1) {
                        class100.field2599 = class100.field2591;
                        class53.field1345 = class93.field2472 = class20.field493;
                        class78.field2088 = false;
                    }
                } else {
                    class101.method841(class39.field1036, 0, class100.field2591, arg0 + 13863);
                }
            }
        }
        if (arg0 != -3112) {
            method52(-77);
        }
        field134++;
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(I[B)V", line = 147)
    public class7(int arg0, byte[] arg1) {
        this.field142 = arg0;
        class39 var3 = new class39(arg1);
        this.field131 = var3.method334(124);
        this.field137 = new int[this.field131][];
        this.field143 = new int[this.field131];
        for (int var4 = 0; var4 < this.field131; var4++) {
            this.field143[var4] = var3.method334(120);
        }
        for (int var5 = 0; var5 < this.field131; var5++) {
            this.field137[var5] = new int[var3.method334(107)];
        }
        for (int var6 = 0; var6 < this.field131; var6++) {
            for (int var7 = 0; var7 < this.field137[var6].length; var7++) {
                this.field137[var6][var7] = var3.method334(102);
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "(I)V", line = 194)
    public static final void method52(int arg0) {
        class97.method815(65535);
        field139++;
        if (class51.field1294 == 1) {
            class125.field3046[class60.field1618 / 100].method507(class66.field1773 - 12, class130.field3135 - 8 + -4);
        }
        if (class51.field1294 == 2) {
            class125.field3046[class60.field1618 / 100 + 4].method507(class66.field1773 - 8 - 4, class130.field3135 + -4 + -8);
        }
        if (class57.field1521 != arg0) {
            class17.method127(class57.field1521, 125);
            class6.method44(512, 0, 0, class57.field1521, -1, 0, 0, 4, 334);
        }
        if (class93.field2472 != -1) {
            class17.method127(class93.field2472, 116);
            class6.method44(512, 0, 0, class93.field2472, -1, 0, ~arg0, 0, 334);
        }
        class1.method6((byte) 123);
        if (!class24.field614) {
            class84.method758(-65);
            class75.method671(true);
        } else if (class10.field215 == 0) {
            class28.method234(18);
        }
        if (class81.field2144 == 1) {
            client.field405.method507(472, 296);
        }
        if (class12.field253) {
            short var1 = 507;
            byte var2 = 20;
            int var3 = 16776960;
            if (class31.field822 < 30 && class41.field1065) {
                var3 = 16711680;
            }
            if (class31.field822 < 20 && !class41.field1065) {
                var3 = 16711680;
            }
            class55.field1422.method112(class21.method172(-59, new class65[] { class39.field984, class39.method320(class31.field822, (byte) -36) }), var1, var2, var3);
            Runtime var4 = Runtime.getRuntime();
            int var5 = 16776960;
            int var6 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
            if (var6 > 32768 && class41.field1065) {
                var5 = 16711680;
            }
            int var10 = var2 + 15;
            if (var6 > 65536 && !class41.field1065) {
                var5 = 16711680;
            }
            class55.field1422.method112(class21.method172(-114, new class65[] { class43.field1128, class39.method320(var6, (byte) -36), class81.field2143 }), var1, var10, var5);
            var10 += 15;
            if (class89.field2363) {
                class55.field1422.method112(class83.field2187, var1, var10, 16711680);
                var10 += 15;
                class89.field2363 = false;
            }
            if (class24.field596) {
                class55.field1422.method112(class75.field2016, var1, var10, 16711680);
                var10 += 15;
                class24.field596 = false;
            }
            if (class62.field1644) {
                class55.field1422.method112(class113.field2820, var1, var10, 16711680);
                class62.field1644 = false;
                var10 += 15;
            }
        }
        if (class126.field3057 == 0) {
            return;
        }
        int var7 = class126.field3057 / 50;
        int var8 = var7 / 60;
        int var9 = var7 % 60;
        if (var9 < 10) {
            class55.field1422.method109(class21.method172(-122, new class65[] { class78.field2063, class39.method320(var8, (byte) -36), class102.field2652, class39.method320(var9, (byte) -36) }), 4, 329, 16776960);
        } else {
            class55.field1422.method109(class21.method172(-108, new class65[] { class78.field2063, class39.method320(var8, (byte) -36), class12.field249, class39.method320(var9, (byte) -36) }), 4, 329, 16776960);
        }
    }

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "(B)V", line = 312)
    public static void method53(byte arg0) {
        field135 = null;
        field136 = null;
        field130 = null;
        field145 = null;
        field132 = null;
        int var1 = 0 % ((-arg0 - 92) / 33);
        field138 = null;
    }
}
