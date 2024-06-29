import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class14 {

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "[[I")
    private int[][] field210;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    private int field206;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    private int field204;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "Led;")
    public static class43 field203 = class191.method1219("RuneScape wird geladen )2 bitte warten)3)3)3", false);

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
    public static int field208 = 127;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "[[S")
    public static short[][] field211 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "Led;")
    private static class43 field215 = class191.method1219("purple:", false);

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "Led;")
    public static class43 field205 = field215;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "Led;")
    public static class43 field207 = field215;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)I")
    public final int method57(int arg0, int arg1) {
        field212++;
        if (this.field210 != null) {
            arg1 = (int) ((long) this.field206 * (long) arg1 / (long) this.field204);
        }
        return arg0 == -11339 ? arg1 : 73;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(II)I")
    public final int method58(int arg0, int arg1) {
        field209++;
        if (this.field210 != null) {
            arg1 = (int) ((long) this.field206 * (long) arg1 / (long) this.field204) + 6;
        }
        return arg0 == -21957 ? arg1 : -25;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
    public static void method59(byte arg0) {
        if (arg0 != -87) {
            field211 = null;
        }
        field205 = null;
        field207 = null;
        field215 = null;
        field203 = null;
        field211 = null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "([BI)[B")
    public final byte[] method60(byte[] arg0, int arg1) {
        if (this.field210 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field206 / (long) this.field204) + 14;
            int var4 = 0;
            int[] var5 = new int[var3];
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field210[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var5[var4 + var12] += var11[var12] * var10;
                }
                int var13 = this.field206 + var6;
                int var14 = var13 / this.field204;
                var4 += var14;
                var6 = var13 - this.field204 * var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var5[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 > 127) {
                    arg0[var8] = 127;
                } else {
                    arg0[var8] = (byte) var9;
                }
            }
        }
        if (arg1 != 3673) {
            field211 = null;
        }
        field213++;
        return arg0;
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(II)V")
    public class14(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class136.method879(arg1, (byte) -92, arg0);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field210 = new int[var4][14];
            this.field206 = var5;
            this.field204 = var4;
            for (int var6 = 0; var6 < var4; var6++) {
                double var7 = (double) var6 / (double) var4 + 6.0D;
                int[] var9 = this.field210[var6];
                int var10 = (int) Math.floor(var7 + 1.0D - 7.0D);
                double var11 = (double) var5 / (double) var4;
                if (var10 < 0) {
                    var10 = 0;
                }
                int var13 = (int) Math.ceil(var7 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                while (var10 < var13) {
                    double var14 = ((double) var10 - var7) * 3.141592653589793D;
                    double var16 = var11;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var11 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var7) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var9[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIII)V")
    public static final void method61(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 18819) {
            field215 = null;
        }
        field214++;
        for (class16 var5 = (class16) class1.field31.method753(-26703); var5 != null; var5 = (class16) class1.field31.method755((byte) 122)) {
            if (var5.field245 != -1 || var5.field262 != null) {
                int var6 = 0;
                if (arg2 > var5.field243) {
                    var6 += arg2 - var5.field243;
                } else if (var5.field269 > arg2) {
                    var6 += var5.field269 - arg2;
                }
                if (var5.field242 < arg1) {
                    var6 += arg1 - var5.field242;
                } else if (arg1 < var5.field238) {
                    var6 += var5.field238 - arg1;
                }
                if (var6 - 64 > var5.field263 || class116.field2277 == 0 || var5.field247 != arg0) {
                    if (var5.field259 != null) {
                        class185.field3638.method1181(var5.field259);
                        var5.field259 = null;
                    }
                    if (var5.field265 != null) {
                        class185.field3638.method1181(var5.field265);
                        var5.field265 = null;
                    }
                } else {
                    var6 -= 64;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    int var7 = (var5.field263 - var6) * class116.field2277 / var5.field263;
                    if (var5.field259 != null) {
                        var5.field259.method1273(var7);
                    } else if (var5.field245 >= 0) {
                        class8 var8 = class8.method46(class182.field3597, var5.field245, 0);
                        if (var8 != null) {
                            class62 var9 = var8.method44().method388(class103.field1955);
                            class195 var10 = class195.method1258(var9, 100, var7);
                            var10.method1266(-1);
                            class185.field3638.method1183(var10);
                            var5.field259 = var10;
                        }
                    }
                    if (var5.field265 != null) {
                        var5.field265.method1273(var7);
                        if (!var5.field265.method418(-76)) {
                            var5.field265 = null;
                        }
                    } else if (var5.field262 != null && (var5.field266 -= arg4) <= 0) {
                        int var11 = (int) ((double) var5.field262.length * Math.random());
                        class8 var12 = class8.method46(class182.field3597, var5.field262[var11], 0);
                        if (var12 != null) {
                            class62 var13 = var12.method44().method388(class103.field1955);
                            class195 var14 = class195.method1258(var13, 100, var7);
                            var14.method1266(0);
                            class185.field3638.method1183(var14);
                            var5.field266 = var5.field267 + (int) (Math.random() * (double) (var5.field249 - var5.field267));
                            var5.field265 = var14;
                        }
                    }
                }
            }
        }
    }
}
