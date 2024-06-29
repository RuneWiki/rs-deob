import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class308 extends class306 {

    @OriginalMember(owner = "client!re", name = "P", descriptor = "[[B")
    public static byte[][] field4787 = new byte[250][];

    @OriginalMember(owner = "client!re", name = "H", descriptor = "I")
    public static int field4779 = 1;

    @OriginalMember(owner = "client!re", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field4788 = "M";

    @OriginalMember(owner = "client!re", name = "G", descriptor = "I")
    public static int field4778;

    @OriginalMember(owner = "client!re", name = "I", descriptor = "I")
    public static int field4780;

    @OriginalMember(owner = "client!re", name = "J", descriptor = "I")
    public static int field4781;

    @OriginalMember(owner = "client!re", name = "L", descriptor = "I")
    public static int field4783;

    @OriginalMember(owner = "client!re", name = "N", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!re", name = "O", descriptor = "I")
    public static int field4786;

    @OriginalMember(owner = "client!re", name = "R", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!re", name = "K", descriptor = "Lnk;")
    public static class16 field4782;

    @OriginalMember(owner = "client!re", name = "M", descriptor = "[Lem;")
    private class14[] field4784;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "([[IB)V", line = 5)
    private final void method2167(int[][] arg0, byte arg1) {
        field4786++;
        int var3 = class31.field367;
        int var4 = class99.field1344;
        class238.method1649(arg0, -1184675184);
        class4.method27(-1234757663, class311.field4878, 0, class56.field663, 0);
        int var5 = 107 / ((43 - arg1) / 35);
        if (this.field4784 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field4784.length; var6++) {
            class14 var7 = this.field4784[var6];
            int var8 = var7.field146;
            int var9 = var7.field151;
            if (var8 < 0) {
                if (var9 >= 0) {
                    var7.method84(var4, var3, 9432);
                }
            } else if (var9 >= 0) {
                var7.method89((byte) -74, var3, var4);
            } else {
                var7.method82((byte) -120, var4, var3);
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILlf;I)V", line = 61)
    public final void method45(int arg0, class143 arg1, int arg2) {
        if (arg2 == 0) {
            this.field4784 = new class14[arg1.method1043(true)];
            for (int var4 = 0; var4 < this.field4784.length; var4++) {
                int var5 = arg1.method1043(true);
                if (var5 == 0) {
                    this.field4784[var4] = class100.method636(arg1, (byte) 71);
                } else if (var5 == 1) {
                    this.field4784[var4] = class130.method896(-161, arg1);
                } else if (var5 == 2) {
                    this.field4784[var4] = class109.method706(arg1, class60.method368(arg0, -8574));
                } else if (var5 == 3) {
                    this.field4784[var4] = class207.method1451(arg1, false);
                }
            }
        } else if (arg2 == 1) {
            this.field4759 = arg1.method1043(true) == 1;
        }
        field4789++;
        if (arg0 != -15334) {
            field4779 = -47;
        }
    }

    @OriginalMember(owner = "client!re", name = "e", descriptor = "(I)V", line = 135)
    public static void method2168(int arg0) {
        if (arg0 == 0) {
            field4782 = null;
            field4788 = null;
            field4787 = (byte[][]) null;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(III)Ldj;", line = 148)
    public static final class360 method2169(int arg0, int arg1, int arg2) {
        class196 var3 = class194.field2947[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class360 var4 = var3.field3003;
            var3.field3003 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(III)I", line = 160)
    public static final int method2170(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            return -74;
        }
        if (arg2 < arg1) {
            int var3 = arg2;
            arg2 = arg1;
            arg1 = var3;
        }
        while (arg1 != 0) {
            int var4 = arg2 % arg1;
            arg2 = arg1;
            arg1 = var4;
        }
        field4781++;
        return arg2;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II)[I", line = 202)
    public final int[] method47(int arg0, int arg1) {
        if (arg1 != -1546337535) {
            method2170(59, -97, 123);
        }
        int[] var3 = this.field4757.method903(arg0, -54);
        if (this.field4757.field1898) {
            this.method2167(this.field4757.method899(81), (byte) 120);
        }
        field4778++;
        return var3;
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(II)V", line = 226)
    public static final void method2171(int arg0, int arg1) {
        field4780++;
        short var2 = 256;
        if (arg0 > var2) {
            arg0 = var2;
        }
        if (arg0 > 10) {
            arg0 = 10;
        }
        class315.field4947 += arg0 * 128;
        if (class117.field1619.length < class315.field4947) {
            int var3 = (int) (Math.random() * 12.0D);
            class315.field4947 -= class117.field1619.length;
            class266.method1874(-21999, class95.field1314[var3]);
        }
        int var4 = 0;
        int var5 = arg0 * 128;
        int var6 = (var2 - arg0) * 128;
        for (int var7 = 0; var7 < var6; var7++) {
            int var8 = class77.field1012[var4 + var5] - (class117.field1619[class117.field1619.length - 1 & class315.field4947 + var4] * arg0 / 6);
            if (var8 < 0) {
                var8 = 0;
            }
            class77.field1012[var4++] = var8;
        }
        if (arg1 < 69) {
            method2169(8, -73, 70);
        }
        for (int var9 = var2 - arg0; var9 < var2; var9++) {
            int var10 = var9 * 128;
            for (int var11 = 0; var11 < 128; var11++) {
                int var12 = (int) (Math.random() * 100.0D);
                if (var12 < 50 && var11 > 10 && var11 < 118) {
                    class77.field1012[var11 + var10] = 255;
                } else {
                    class77.field1012[var11 + var10] = 0;
                }
            }
        }
        for (int var13 = 0; var13 < var2 - arg0; var13++) {
            class187.field2822[var13] = class187.field2822[var13 + arg0];
        }
        for (int var14 = var2 - arg0; var14 < var2; var14++) {
            class187.field2822[var14] = (int) (Math.sin((double) class112.field1568 / 14.0D) * 16.0D + Math.sin((double) class112.field1568 / 15.0D) * 14.0D + Math.sin((double) class112.field1568 / 16.0D) * 12.0D);
            class112.field1568++;
        }
        class170.field2597 += arg0;
        int var15 = (arg0 + (class102.field1381 & 0x1)) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < class170.field2597; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            class77.field1012[(var18 << 7) + var17] = 192;
        }
        class170.field2597 = 0;
        for (int var19 = 0; var19 < var2; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var22 + var15 < 128) {
                    var20 += class77.field1012[var15 + var21 + var22];
                }
                if (-var15 - (1 - var22) >= 0) {
                    var20 -= class77.field1012[var22 + var21 - var15 - 1];
                }
                if (var22 >= 0) {
                    class138.field2069[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var2; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var2) {
                    var24 += class138.field2069[var15 * 128 + var26 + var23];
                }
                if (var25 - var15 - 1 >= 0) {
                    var24 -= class138.field2069[var23 + var26 - (var15 - -1) * 128];
                }
                if (var25 >= 0) {
                    class77.field1012[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V", line = 400)
    public class308() {
        super(0, true);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IB)[[I", line = 412)
    public final int[][] method681(int arg0, byte arg1) {
        field4785++;
        if (arg1 != -119) {
            this.method681(124, (byte) -115);
        }
        int[][] var3 = this.field4752.method1866(arg0, 0);
        if (this.field4752.field4179) {
            int var4 = class31.field367;
            int var5 = class99.field1344;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = this.field4752.method1868((byte) -80);
            this.method2167(var6, (byte) -32);
            for (int var8 = 0; var8 < class99.field1344; var8++) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[1];
                int[] var12 = var10[2];
                int[] var13 = var10[0];
                for (int var14 = 0; var14 < class31.field367; var14++) {
                    int var15 = var9[var14];
                    var12[var14] = class261.method1840(var15, 255) << 4;
                    var11[var14] = class261.method1840(4080, var15 >> 4);
                    var13[var14] = class261.method1840(var15 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ZB)C", line = 475)
    public static final char method2172(boolean arg0, byte arg1) {
        field4783++;
        int var2 = arg1 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class293.field4609[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        if (!arg0) {
            field4788 = (String) null;
        }
        return (char) var2;
    }
}
