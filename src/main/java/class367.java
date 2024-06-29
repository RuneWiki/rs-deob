import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class367 {

    @OriginalMember(owner = "client!ao", name = "k", descriptor = "I")
    private int field5119 = 0;

    @OriginalMember(owner = "client!ao", name = "n", descriptor = "I")
    private int field5122 = -1;

    @OriginalMember(owner = "client!ao", name = "l", descriptor = "Lbv;")
    private class568 field5120 = new class568();

    @OriginalMember(owner = "client!ao", name = "s", descriptor = "Z")
    public boolean field5127 = false;

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "I")
    private int field5110;

    @OriginalMember(owner = "client!ao", name = "m", descriptor = "I")
    private int field5121;

    @OriginalMember(owner = "client!ao", name = "i", descriptor = "[Luba;")
    private class629[] field5117;

    @OriginalMember(owner = "client!ao", name = "h", descriptor = "[[I")
    private int[][] field5116;

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "Lim;")
    public static class353 field5112 = new class353(30, 12);

    @OriginalMember(owner = "client!ao", name = "o", descriptor = "Ldh;")
    public static class321 field5123 = new class321("", 11);

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "I")
    public static int field5109;

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "I")
    public static int field5114;

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "I")
    public static int field5115;

    @OriginalMember(owner = "client!ao", name = "j", descriptor = "I")
    public static int field5118;

    @OriginalMember(owner = "client!ao", name = "p", descriptor = "I")
    public static int field5124;

    @OriginalMember(owner = "client!ao", name = "r", descriptor = "I")
    public static int field5126;

    @OriginalMember(owner = "client!ao", name = "q", descriptor = "Lwa;")
    public static class605 field5125;

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "Z")
    public static boolean field5111;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(BZZ)V")
    public static final void method2250(byte arg0, boolean arg1, boolean arg2) {
        if (arg2) {
            class370.field5159++;
            class562.method3156((byte) -71);
        }
        if (arg0 != 94) {
            return;
        }
        field5126++;
        if (arg1) {
            class132.field1628++;
            class66.method383(3);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V")
    public static final void method2251(int arg0) {
        for (class72 var1 = (class72) class244.field3084.method3188((byte) -100); var1 != null; var1 = (class72) class244.field3084.method3182((byte) -116)) {
            if (var1.field987) {
                var1.method421(arg0 + 30769);
            }
        }
        field5118++;
        for (class72 var2 = (class72) class453.field6416.method3188((byte) -100); var2 != null; var2 = (class72) class453.field6416.method3182((byte) -109)) {
            if (var2.field987) {
                var2.method421(30896);
            }
        }
        if (arg0 != 127) {
            field5112 = null;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(II)[I")
    public final int[] method2252(int arg0, int arg1) {
        field5109++;
        if (arg1 != 11) {
            this.method2252(-71, -58);
        }
        if (this.field5121 == this.field5110) {
            this.field5127 = this.field5117[arg0] == null;
            this.field5117[arg0] = class394.field5450;
            return this.field5116[arg0];
        } else if (this.field5110 == 1) {
            this.field5127 = this.field5122 != arg0;
            this.field5122 = arg0;
            return this.field5116[0];
        } else {
            class629 var3 = this.field5117[arg0];
            if (var3 == null) {
                this.field5127 = true;
                if (this.field5110 > this.field5119) {
                    var3 = new class629(arg0, this.field5119);
                    this.field5119++;
                } else {
                    class629 var4 = (class629) this.field5120.method3185(8);
                    var3 = new class629(arg0, var4.field9177);
                    this.field5117[var4.field9178] = null;
                    var4.method589(-8880);
                }
                this.field5117[arg0] = var3;
            } else {
                this.field5127 = false;
            }
            this.field5120.method3187(var3, (byte) -128);
            return this.field5116[var3.field9177];
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIILjq;)V")
    public static final void method2253(int arg0, int arg1, int arg2, class447 arg3) {
        class307.field3935 = arg1;
        if (arg0 != 5) {
            method2256((byte) 115);
        }
        class99.field1325 = arg2;
        field5115++;
        class18.field208 = arg3;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IZ)V")
    public static final void method2254(int arg0, boolean arg1) {
        field5114++;
        while (class342.field4758.method381(122, class262.field3333) >= 15) {
            int var2 = class342.field4758.method377(arg0 - 32308, 15);
            if (var2 == 32767) {
                break;
            }
            boolean var3 = false;
            class480 var4 = (class480) class131.field1619.method3476((long) var2, (byte) 28);
            if (var4 == null) {
                class585 var5 = new class585();
                var5.field366 = var2;
                var4 = new class480(var5);
                class131.field1619.method3475(-99, var4, (long) var2);
                var3 = true;
                class179.field2310[class604.field8710++] = var4;
            }
            class585 var6 = var4.field6729;
            class286.field3739[class551.field7652++] = var2;
            var6.field372 = class7.field61;
            if (var6.field8478 != null && var6.field8478.method3615((byte) -102)) {
                class640.method3689(var6, 2015625216);
            }
            int var7 = class342.field4758.method377(8, 1);
            var6.method3374(-89, class579.field8053.method3623(class342.field4758.method377(arg0 - 32308, 14), (byte) 42));
            int var8 = (class342.field4758.method377(8, 3) + 4 & 0xBE800007) << 11;
            int var9 = class342.field4758.method377(8, 2);
            int var10 = class342.field4758.method377(8, 1);
            if (var10 == 1) {
                class214.field2749[class387.field5383++] = var2;
            }
            int var11;
            if (arg1) {
                var11 = class342.field4758.method377(arg0 ^ 0x7E34, 8);
                if (var11 > 127) {
                    var11 -= 256;
                }
            } else {
                var11 = class342.field4758.method377(8, 5);
                if (var11 > 15) {
                    var11 -= 32;
                }
            }
            int var12;
            if (arg1) {
                var12 = class342.field4758.method377(8, 8);
                if (var12 > 127) {
                    var12 -= 256;
                }
            } else {
                var12 = class342.field4758.method377(8, 5);
                if (var12 > 15) {
                    var12 -= 32;
                }
            }
            var6.method137(var6.field8478.field9094, 98);
            var6.field334 = var6.field8478.field9080 << 3;
            if (var3) {
                var6.method131(true, var8, true);
            }
            var6.method3380(class147.field1899.field419[0] + var12, class147.field1899.field417[0] - -var11, 0, var7 == 1, var6.method104((byte) -92), var9);
            if (var6.field8478.method3615((byte) -107)) {
                class318.method1980(var6.field6358, (byte) -125, 0, var6, var6.field417[0], null, null, var6.field419[0]);
            }
        }
        if (arg0 != 32316) {
            method2251(-71);
        }
        class342.field4758.method378(7);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)[[I")
    public final int[][] method2255(byte arg0) {
        field5113++;
        if (this.field5121 != this.field5110) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = -105 % ((arg0 + 49) / 52);
        for (int var3 = 0; var3 < this.field5110; var3++) {
            this.field5117[var3] = class394.field5450;
        }
        return this.field5116;
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(B)V")
    public static void method2256(byte arg0) {
        if (arg0 != 118) {
            method2253(-72, 41, 50, null);
        }
        field5125 = null;
        field5123 = null;
        field5112 = null;
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)V")
    public final void method2257(int arg0) {
        for (int var2 = 0; var2 < this.field5110; var2++) {
            this.field5116[var2] = null;
        }
        field5124++;
        this.field5116 = null;
        this.field5117 = null;
        this.field5120.method3178(-8299);
        this.field5120 = null;
        if (arg0 > -119) {
            field5111 = true;
        }
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(III)V")
    public class367(int arg0, int arg1, int arg2) {
        this.field5110 = arg0;
        this.field5121 = arg1;
        this.field5117 = new class629[this.field5121];
        this.field5116 = new int[this.field5110][arg2];
    }
}
