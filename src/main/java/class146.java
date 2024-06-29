import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class146 {

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "[J")
    private long[] field2097 = new long[8];

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "[J")
    private long[] field2094 = new long[8];

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "[B")
    private byte[] field2096 = new byte[32];

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "[B")
    private byte[] field2103 = new byte[64];

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
    private int field2098 = 0;

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "[J")
    private long[] field2107 = new long[8];

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "[J")
    private long[] field2106 = new long[8];

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "I")
    private int field2108 = 0;

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "[J")
    private long[] field2109 = new long[8];

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field2105 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "J")
    public static long field2102;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V", line = 6)
    public static final void method1008(int arg0) {
        class213.field2813 = 0;
        class686.field9381 = new class104[500];
        if (arg0 != -1) {
            return;
        }
        class731.field10217 = class586.field8250;
        field2095++;
        class615.field8612 = new int[class634.field8744][class492.field6939 + 1][class365.field5171 + 1];
        class642.field8800 = new class104[2000];
        class21.field319 = new class104[1000];
        class626.field8702 = 0;
        class196.field2608 = false;
        class477.field6771 = class586.field8250;
        class556.field7801 = 0;
        class593.field8350 = 0;
        class491.field6930 = new class104[500];
        if ((class362.field5135 instanceof class693)) {
            class734.field10226 = false;
        } else {
            class734.field10226 = true;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lee;B)Lwc;", line = 44)
    public static final class66 method1009(class675 arg0, byte arg1) {
        field2092++;
        return arg1 <= 88 ? null : new class66(arg0.method3706((byte) 47), arg0.method3706((byte) -114), arg0.method3706((byte) 83), arg0.method3706((byte) -81), arg0.method3756(false), arg0.method3750((byte) 35));
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V", line = 60)
    public static final void method1010(byte arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class52.field596[var1] = false;
        }
        field2099++;
        class44.field532 = -1;
        class97.field1168 = 5;
        class218.field2850 = -1;
        class419.field5919 = -1;
        class107.field1306 = class187.field2514;
        class361.field5123 = class740.field10285;
        class647.field8901 = class155.field2169;
        class577.field8152 = 0;
        class727.field10176 = class511.field7303;
        class150.field2124 = -1;
        class291.field4105 = 0;
        class72.field961 = class720.field9994;
        if (arg0 > -59) {
            field2105 = null;
        }
        class473.field6699 = class32.field426;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BJ[B)V", line = 91)
    public final void method1011(byte arg0, long arg1, byte[] arg2) {
        field2101++;
        int var5 = 0;
        if (arg0 >= -34) {
            return;
        }
        int var6 = 8 - ((int) arg1 & 0x7) & 0x7;
        int var7 = this.field2098 & 0x7;
        long var8 = arg1;
        int var10 = 31;
        int var11 = 0;
        while (var10 >= 0) {
            int var16 = (this.field2096[var10] & 0xFF) + ((int) var8 & 0xFF) + var11;
            this.field2096[var10] = (byte) var16;
            var8 >>>= 0x8;
            var11 = var16 >>> 8;
            var10--;
        }
        while (arg1 > 8L) {
            int var15 = arg2[var5] << var6 & 0xFF | (arg2[var5 + 1] & 0xFF) >>> 8 - var6;
            if (var15 < 0 || var15 >= 256) {
                throw new RuntimeException("LOGIC ERROR");
            }
            this.field2103[this.field2108] = (byte) class325.method2116(this.field2103[this.field2108], var15 >>> var7);
            this.field2098 += 8 - var7;
            this.field2108++;
            if (this.field2098 == 512) {
                this.method1016((byte) 112);
                this.field2098 = this.field2108 = 0;
            }
            this.field2103[this.field2108] = (byte) class286.method1877(255, var15 << 8 - var7);
            this.field2098 += var7;
            arg1 -= 8L;
            var5++;
        }
        int var12;
        if (arg1 <= 0L) {
            var12 = 0;
        } else {
            var12 = arg2[var5] << var6 & 0xFF;
            this.field2103[this.field2108] = (byte) class325.method2116(this.field2103[this.field2108], var12 >>> var7);
        }
        if (((long) var7 + arg1) < 8L) {
            this.field2098 = (int) ((long) this.field2098 + arg1);
            return;
        }
        this.field2108++;
        this.field2098 += 8 - var7;
        long var13 = arg1 - (long) (8 - var7);
        if (this.field2098 == 512) {
            this.method1016((byte) 109);
            this.field2098 = this.field2108 = 0;
        }
        this.field2103[this.field2108] = (byte) class286.method1877(255, var12 << 8 - var7);
        this.field2098 += (int) var13;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILha;IIBI)V", line = 180)
    public static final void method1012(int arg0, class58 arg1, int arg2, int arg3, byte arg4, int arg5) {
        arg1.method469(arg0, arg3, arg0 + arg5, arg2 + arg3);
        field2100++;
        arg1.method417(-16777216, arg0, arg3, (byte) 119, arg2, arg5);
        if (class725.field10122 < 100) {
            return;
        }
        float var6 = (float) class678.field9300 / (float) class678.field9285;
        int var7 = arg5;
        int var8 = arg2;
        if ((var6 < 1.0F)) {
            var8 = (int) ((float) arg5 * var6);
        } else {
            var7 = (int) ((float) arg2 / var6);
        }
        int var9 = -13 % ((arg4 + 27) / 57);
        int var10 = (arg2 - var8) / 2 + arg3;
        int var11 = (arg5 - var7) / 2 + arg0;
        if (class145.field2087 == null || class145.field2087.method657() != arg5 || class145.field2087.method663() != arg2) {
            class678.method3786(class678.field9294, class678.field9304 + class678.field9300, class678.field9294 + class678.field9285, class678.field9304, var11, var10, var11 + var7, var10 - -var8);
            class678.method3778(arg1);
            class145.field2087 = arg1.method386(var11, var10, var7, var8, false);
        }
        class145.field2087.method658(var11, var10);
        int var12 = class739.field10284 * var7 / class678.field9285;
        int var13 = class753.field10478 * var8 / class678.field9300;
        int var14 = class102.field1215 * var7 / class678.field9285 + var11;
        int var15 = var10 + var8 - (class144.field2061 * var8 / class678.field9300) - var13;
        int var16 = -1996554240;
        if (class724.field10102 == class633.field8733) {
            var16 = -1996488705;
        }
        arg1.method431(var14, var15, var12, var13, var16, 1);
        arg1.method445(var14, var15, var12, var13, var16, 0);
        if (class236.field3170 <= 0) {
            return;
        }
        int var17;
        if (class322.field4447 <= 50) {
            var17 = class322.field4447 * 5;
        } else {
            var17 = (100 - class322.field4447) * 5;
        }
        for (class507 var18 = (class507) class678.field9278.method2765(-12261); var18 != null; var18 = (class507) class678.field9278.method2759(-15361)) {
            class344 var19 = class678.field9273.method3088((byte) -80, var18.field7257);
            if (class82.method637(81, var19)) {
                if (class515.field7342 == var18.field7257) {
                    int var20 = var18.field7263 * var7 / class678.field9285 + var11;
                    int var21 = (class678.field9300 - var18.field7262) * var8 / class678.field9300 + var10;
                    arg1.method417(var17 << 24 | 0xFFFF00, var20 - 2, var21 - 2, (byte) 98, 4, 4);
                } else if (class106.field1270 != -1 && class106.field1270 == var19.field4807) {
                    int var22 = var11 + (var18.field7263 * var7 / class678.field9285);
                    int var23 = var10 + ((class678.field9300 - var18.field7262) * var8 / class678.field9300);
                    arg1.method417(var17 << 24 | 0xFFFF00, var22 - 2, var23 + -2, (byte) 74, 4, 4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)V", line = 276)
    public static void method1013(int arg0) {
        if (arg0 != 512) {
            field2102 = 30L;
        }
        field2105 = null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II[B)V", line = 299)
    public final void method1014(int arg0, int arg1, byte[] arg2) {
        if (arg0 <= 82) {
            return;
        }
        this.field2103[this.field2108] = (byte) class325.method2116(this.field2103[this.field2108], 0x80 >>> class286.method1877(7, this.field2098));
        field2104++;
        this.field2108++;
        if (this.field2108 > 32) {
            while (this.field2108 < 64) {
                this.field2103[this.field2108++] = 0;
            }
            this.method1016((byte) 117);
            this.field2108 = 0;
        }
        while (this.field2108 < 32) {
            this.field2103[this.field2108++] = 0;
        }
        class255.method1690(this.field2096, 0, this.field2103, 32, 32);
        this.method1016((byte) 86);
        int var4 = 0;
        int var5 = arg1;
        while (var4 < 8) {
            long var6 = this.field2106[var4];
            arg2[var5] = (byte) ((int) (var6 >>> 56));
            arg2[var5 + 1] = (byte) ((int) (var6 >>> 48));
            arg2[var5 + 2] = (byte) ((int) (var6 >>> 40));
            arg2[var5 + 3] = (byte) ((int) (var6 >>> 32));
            arg2[var5 + 4] = (byte) ((int) (var6 >>> 24));
            arg2[var5 + 5] = (byte) ((int) (var6 >>> 16));
            arg2[var5 + 6] = (byte) ((int) (var6 >>> 8));
            arg2[var5 + 7] = (byte) ((int) var6);
            var5 += 8;
            var4++;
        }
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(I)V", line = 349)
    public final void method1015(int arg0) {
        if (arg0 != -2) {
            return;
        }
        field2093++;
        for (int var2 = 0; var2 < 32; var2++) {
            this.field2096[var2] = 0;
        }
        this.field2098 = this.field2108 = 0;
        this.field2103[0] = 0;
        for (int var3 = 0; var3 < 8; var3++) {
            this.field2106[var3] = 0L;
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)V", line = 380)
    private final void method1016(byte arg0) {
        int var2 = 0;
        int var3 = 0;
        while (var2 < 8) {
            this.field2097[var2] = class166.method1085(class166.method1085(class21.method132(255L, (long) this.field2103[var3 + 6]) << 8, class166.method1085(class166.method1085(class21.method132(0xFFL << 24, (long) this.field2103[var3 + 4] << 24), class166.method1085(class21.method132((long) this.field2103[var3 + 3] << 32, 0xFFL << 32), class166.method1085(class166.method1085((long) this.field2103[var3] << 56, class21.method132(0xFFL << 48, (long) this.field2103[var3 + 1] << 48)), class21.method132(0xFFL << 40, (long) this.field2103[var3 + 2] << 40)))), class21.method132((long) this.field2103[var3 + 5], 255L) << 16)), class21.method132((long) this.field2103[var3 + 7], 255L));
            var3 += 8;
            var2++;
        }
        field2091++;
        for (int var4 = 0; var4 < 8; var4++) {
            this.field2094[var4] = class166.method1085(this.field2097[var4], this.field2109[var4] = this.field2106[var4]);
        }
        for (int var5 = 1; var5 <= 10; var5++) {
            for (int var7 = 0; var7 < 8; var7++) {
                this.field2107[var7] = 0L;
                int var13 = 0;
                int var14 = 56;
                while (var13 < 8) {
                    this.field2107[var7] = class166.method1085(this.field2107[var7], class278.field3931[var13][class286.method1877((int) (this.field2109[class286.method1877(7, var7 - var13)] >>> var14), 255)]);
                    var13++;
                    var14 -= 8;
                }
            }
            for (int var8 = 0; var8 < 8; var8++) {
                this.field2109[var8] = this.field2107[var8];
            }
            this.field2109[0] = class166.method1085(this.field2109[0], class278.field3934[var5]);
            for (int var9 = 0; var9 < 8; var9++) {
                this.field2107[var9] = this.field2109[var9];
                int var11 = 0;
                int var12 = 56;
                while (var11 < 8) {
                    this.field2107[var9] = class166.method1085(this.field2107[var9], class278.field3931[var11][class286.method1877(255, (int) (this.field2094[class286.method1877(var9 - var11, 7)] >>> var12))]);
                    var12 -= 8;
                    var11++;
                }
            }
            for (int var10 = 0; var10 < 8; var10++) {
                this.field2094[var10] = this.field2107[var10];
            }
        }
        if (arg0 >= 81) {
            for (int var6 = 0; var6 < 8; var6++) {
                this.field2106[var6] = class166.method1085(this.field2106[var6], class166.method1085(this.field2097[var6], this.field2094[var6]));
            }
        }
    }
}
