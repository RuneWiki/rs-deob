import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class87 {

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    public int field1127 = -1;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public int field1126 = -1;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "[I")
    public static int[] field1134;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "[[I")
    public static int[][] field1132;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "[I")
    public int[] field1131;

    static {
        new class349((String) null, "die kürzlich gesprochen oder gehandelt haben.", (String) null, (String) null);
        field1134 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };
        field1132 = new int[128][128];
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II[BI)I", line = 3)
    public static final int method518(int arg0, int arg1, byte[] arg2, int arg3) {
        field1133++;
        if (arg0 > -42) {
            method521(11);
        }
        int var4 = -1;
        for (int var5 = arg1; var5 < arg3; var5++) {
            var4 = var4 >>> 8 ^ class301.field4381[(var4 ^ arg2[var5]) & 0xFF];
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V", line = 27)
    public static void method519(byte arg0) {
        field1134 = null;
        field1132 = null;
        if (arg0 > -27) {
            field1129 = -37;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IILlf;)V", line = 38)
    public final void method520(int arg0, int arg1, class130 arg2) {
        while (true) {
            int var4 = arg2.method837(true);
            if (var4 == 0) {
                field1124++;
                if (arg1 <= 101) {
                    method522(18, 92);
                    return;
                }
                return;
            }
            this.method524(-3, arg0, var4, arg2);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V", line = 67)
    public static final void method521(int arg0) {
        field1128++;
        int var1 = class253.method1759(-128);
        int var2 = 33 % ((14 - arg0) / 52);
        if (var1 == 0) {
            class32.field398 = null;
            class56.method370(0, (byte) 42);
        } else if (var1 == 1) {
            class445.method2771((byte) 0, -112);
            class56.method370(512, (byte) 109);
            if (class320.field4692 != null) {
                class205.method1432(512);
            }
        } else {
            class445.method2771((byte) (class265.field3897 - 4 & 0xFF), -87);
            class56.method370(2, (byte) -111);
        }
        class431.field6176 = class158.field2302;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)V", line = 101)
    public static final void method522(int arg0, int arg1) {
        field1136++;
        class276 var2 = class264.method1816((byte) -123, arg1, 7);
        var2.method1870((byte) 126);
        if (arg0 != -3) {
            method523((byte) 25, (class311) null);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BLhl;)V", line = 137)
    public static final void method523(byte arg0, class311 arg1) {
        field1125++;
        boolean var2 = false;
        if (class34.field434 == arg1.field4521 || arg1.field4558 == -1 || arg1.field4535 != 0) {
            var2 = true;
        } else {
            class183 var3 = class110.method671(-21965, arg1.field4558);
            if (var3.field2595 || var3.field2600[arg1.field4566] < (arg1.field4547 + 1)) {
                var2 = true;
            }
        }
        if (var2) {
            int var4 = arg1.field4521 - arg1.field4562;
            int var5 = class34.field434 - arg1.field4562;
            int var6 = arg1.field4504 * 128 + arg1.method773((byte) 49) * 64;
            int var7 = arg1.field4580 * 128 + arg1.method773((byte) 72) * 64;
            int var8 = arg1.field4538 * 128 + arg1.method773((byte) 109) * 64;
            int var9 = arg1.field4524 * 128 + (arg1.method773((byte) 99) * 64);
            arg1.field4463 = ((var4 - var5) * var6 + var5 * var8) / var4;
            arg1.field4466 = ((var4 - var5) * var7 + var5 * var9) / var4;
        }
        arg1.field4604 = 0;
        if (arg1.field4567 == 0) {
            arg1.method2092(8192, 0);
        }
        if (arg1.field4567 == 1) {
            arg1.method2092(12288, 0);
        }
        if (arg1.field4567 == 2) {
            arg1.method2092(0, 0);
        }
        if (arg0 >= 94 && arg1.field4567 == 3) {
            arg1.method2092(4096, 0);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIILlf;)V", line = 198)
    private final void method524(int arg0, int arg1, int arg2, class130 arg3) {
        if (arg0 != -3) {
            return;
        }
        field1135++;
        if (arg2 == 1) {
            this.field1127 = arg3.method798(false);
        } else if (arg2 == 2) {
            this.field1131 = new int[arg3.method837(true)];
            for (int var5 = 0; var5 < this.field1131.length; var5++) {
                this.field1131[var5] = arg3.method798(false);
            }
        } else if (arg2 == 3) {
            this.field1126 = arg3.method837(true);
            return;
        }
    }
}
