import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class142 {

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "I")
    public static int field2145 = 0;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "Lub;")
    public static class15 field2146 = new class15(30);

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "J")
    public static long field2156 = 0L;

    @OriginalMember(owner = "client!uk", name = "m", descriptor = "I")
    public static int field2157 = 0;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
    public int field2147;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "I")
    public int field2148;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "I")
    public int field2149;

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "I")
    public int field2150;

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "I")
    public int field2152;

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!uk", name = "k", descriptor = "I")
    public int field2155;

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "Ltj;")
    public static class108 field2151;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IILhl;)V", line = 10)
    public static final void method1066(int arg0, int arg1, class311 arg2) {
        if (arg1 != 11008) {
            field2157 = -46;
        }
        field2153++;
        int var3 = -1;
        int var4 = 0;
        if (arg2.field4562 > class34.field434) {
            class26.method137((byte) 120, arg2);
        } else if (arg2.field4521 < class34.field434) {
            class435.method2715(arg2, (byte) 19, false);
            var3 = class21.field274;
            var4 = class73.field946;
        } else {
            class87.method523((byte) 108, arg2);
        }
        if (arg2.field4463 < 128 || arg2.field4466 < 128 || arg2.field4463 >= ((class80.field1034 - 1) * 128) || arg2.field4466 >= (class381.field5414 * 128 - 128)) {
            arg2.field4578 = -1;
            arg2.field4521 = 0;
            arg2.field4562 = 0;
            arg2.field4558 = -1;
            arg2.field4463 = arg2.field4595[0] * 128 + (arg2.method773((byte) 104) * 64);
            arg2.field4466 = arg2.field4601[0] * 128 + (arg2.method773((byte) 102) * 64);
            arg2.method2081((byte) -14);
        }
        if (class181.field2555 == arg2 && (arg2.field4463 < 1536 || arg2.field4466 < 1536 || ((class80.field1034 - 12) * 128) <= arg2.field4463 || class381.field5414 * 128 - 1536 <= arg2.field4466)) {
            arg2.field4578 = -1;
            arg2.field4558 = -1;
            arg2.field4521 = 0;
            arg2.field4562 = 0;
            arg2.field4463 = arg2.field4595[0] * 128 + arg2.method773((byte) 67) * 64;
            arg2.field4466 = arg2.field4601[0] * 128 + arg2.method773((byte) 22) * 64;
            arg2.method2081((byte) -14);
        }
        int var5 = class177.method1266((byte) 14, arg2);
        class232.method1608(arg2, var4, var3, var5, arg1 - 10894);
        class240.method1632(arg2, arg1 - 11008);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(BI)I", line = 75)
    public static final int method1067(byte arg0, int arg1) {
        field2154++;
        double var2 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) ((arg1 & 0xFF15) >> 8) / 256.0D;
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
        int var8 = 7 / ((-arg0 - 53) / 61);
        double var9 = var2;
        if (var4 < var2) {
            var9 = var4;
        }
        if (var9 > var6) {
            var9 = var6;
        }
        double var11 = var2;
        if (var4 > var2) {
            var11 = var4;
        }
        if (var6 > var11) {
            var11 = var6;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
            if (var2 == var11) {
                var13 = (var4 - var6) / (var11 - var9);
            } else if (var4 == var11) {
                var13 = (var6 - var2) / (var11 - var9) + 2.0D;
            } else if (var6 == var11) {
                var13 = (var2 - var4) / (var11 - var9) + 4.0D;
            }
        }
        double var19 = var13 / 6.0D;
        int var21 = (int) (var19 * 256.0D);
        int var22 = (int) (var15 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = (int) (var17 * 256.0D);
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        if (var23 > 243) {
            var22 >>= 0x4;
        } else if (var23 > 217) {
            var22 >>= 0x3;
        } else if (var23 > 192) {
            var22 >>= 0x2;
        } else if (var23 > 179) {
            var22 >>= 0x1;
        }
        return (var22 >> 5 << 7) + (((var21 >> 2 & 0x3F) << 10) + (var23 >> 1));
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)V", line = 176)
    public static void method1068(byte arg0) {
        field2151 = null;
        field2146 = null;
        if (arg0 < 101) {
            field2146 = null;
        }
    }
}
