import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class34 extends class44 {

    @OriginalMember(owner = "client!fc", name = "Qb", descriptor = "Z")
    public boolean field914 = true;

    @OriginalMember(owner = "client!fc", name = "Ab", descriptor = "I")
    public int field898 = -1;

    @OriginalMember(owner = "client!fc", name = "Ob", descriptor = "I")
    public int field912 = -1;

    @OriginalMember(owner = "client!fc", name = "Xb", descriptor = "I")
    public int field921 = 0;

    @OriginalMember(owner = "client!fc", name = "xb", descriptor = "I")
    public static int field895 = 0;

    @OriginalMember(owner = "client!fc", name = "tb", descriptor = "La;")
    public static class1 field891 = class113.method934(-11538, "Zu viele Anmelde)2Versuche von Ihrer Adresse");

    @OriginalMember(owner = "client!fc", name = "sb", descriptor = "La;")
    private static class1 field890 = class113.method934(-11538, "Malformed login packet)3");

    @OriginalMember(owner = "client!fc", name = "Fb", descriptor = "La;")
    public static class1 field903 = class113.method934(-11538, "-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

    @OriginalMember(owner = "client!fc", name = "zb", descriptor = "I")
    public static int field897 = 0;

    @OriginalMember(owner = "client!fc", name = "Db", descriptor = "La;")
    public static class1 field901 = field890;

    @OriginalMember(owner = "client!fc", name = "Bb", descriptor = "[[[B")
    public static byte[][][] field899 = new byte[4][104][104];

    @OriginalMember(owner = "client!fc", name = "Gb", descriptor = "I")
    public static int field904 = -1;

    @OriginalMember(owner = "client!fc", name = "Lb", descriptor = "[[[I")
    public static int[][][] field909 = new int[4][13][13];

    @OriginalMember(owner = "client!fc", name = "Wb", descriptor = "J")
    public static volatile long field920 = 0L;

    @OriginalMember(owner = "client!fc", name = "ub", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!fc", name = "vb", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!fc", name = "wb", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!fc", name = "yb", descriptor = "I")
    public int field896;

    @OriginalMember(owner = "client!fc", name = "Eb", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!fc", name = "Hb", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!fc", name = "Ib", descriptor = "I")
    public int field906;

    @OriginalMember(owner = "client!fc", name = "Jb", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!fc", name = "Kb", descriptor = "I")
    public int field908;

    @OriginalMember(owner = "client!fc", name = "Mb", descriptor = "I")
    public int field910;

    @OriginalMember(owner = "client!fc", name = "Pb", descriptor = "I")
    public int field913;

    @OriginalMember(owner = "client!fc", name = "Rb", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!fc", name = "Sb", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!fc", name = "Tb", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!fc", name = "Ub", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!fc", name = "Vb", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!fc", name = "Yb", descriptor = "I")
    public int field922;

    @OriginalMember(owner = "client!fc", name = "Zb", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!fc", name = "ac", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!fc", name = "Cb", descriptor = "[I")
    public static int[] field900;

    @OriginalMember(owner = "client!fc", name = "Nb", descriptor = "[[[B")
    public static byte[][][] field911;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BILba;)V", line = 14)
    public final void method394(byte arg0, int arg1, class8 arg2) {
        while (true) {
            int var4 = arg2.method145(false);
            if (var4 == 0) {
                if (arg0 < 1) {
                    field901 = null;
                }
                field924++;
                return;
            }
            this.method397(arg1, arg2, var4, (byte) -117);
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)V", line = 56)
    public static void method395(byte arg0) {
        field911 = null;
        field899 = null;
        field909 = null;
        field891 = null;
        field890 = null;
        field903 = null;
        field901 = null;
        field900 = null;
        int var1 = -25 % ((arg0 - 68) / 49);
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(B)V", line = 90)
    public final void method396(byte arg0) {
        if (this.field912 != -1) {
            this.method402(this.field912, 121);
            this.field906 = this.field896;
            this.field922 = this.field913;
            this.field910 = this.field908;
        }
        this.method402(this.field921, 126);
        field893++;
        if (arg0 != 64) {
            method400(39, 9);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILba;IB)V", line = 112)
    private final void method397(int arg0, class8 arg1, int arg2, byte arg3) {
        if (arg3 != -117) {
            this.method397(-71, null, 83, (byte) -117);
        }
        field917++;
        if (arg2 == 1) {
            this.field921 = arg1.method165(true);
        } else if (arg2 == 2) {
            this.field898 = arg1.method145(false);
        } else if (arg2 == 5) {
            this.field914 = false;
        } else if (arg2 == 7) {
            this.field912 = arg1.method165(true);
            return;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)V", line = 153)
    public static final void method398(int arg0, int arg1) {
        class85.method752(0, 0, false, null, arg0);
        if (arg1 != 17098) {
            method398(-14, 72);
        }
        field905++;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILa;IIIILa;)V", line = 174)
    public static final void method399(int arg0, class1 arg1, int arg2, int arg3, int arg4, int arg5, class1 arg6) {
        if (~class42.field1105 > arg3) {
            if (arg6.method10(-3136) <= 0) {
                class102.field2589[class42.field1105] = arg1;
            } else {
                class102.field2589[class42.field1105] = class116.method959(-77, new class1[] { arg1, class93.field2340, arg6 });
            }
            class79.field1935[class42.field1105] = arg5;
            class72.field1773[class42.field1105] = arg0;
            class37.field995[class42.field1105] = arg4;
            class117.field2928[class42.field1105] = arg2;
            class42.field1105++;
        }
        field915++;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(II)V", line = 201)
    public static final void method400(int arg0, int arg1) {
        int var2 = -26 % (-arg1 / 44);
        field892++;
        if (class103.field2602 == arg0) {
            return;
        }
        if (class103.field2602 == 0) {
            class5.method109(12433);
        }
        if (arg0 == 20 || arg0 == 40) {
            client.field578 = 0;
            field897 = 0;
            class22.field694 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && class67.field1695 != null) {
            class67.field1695.method1018(-106);
            class67.field1695 = null;
        }
        if (class103.field2602 == 25 || class103.field2602 == 40) {
            class131.method1031((byte) 123);
            class111.method923();
        }
        if (class103.field2602 == 25) {
            class78.field1925 = 0;
            class36.field949 = 1;
            class95.field2361 = 0;
            class54.field1444 = 1;
            class134.field3304 = 0;
        }
        if (arg0 == 0 || arg0 == 35) {
            class52.method528(-40);
            class79.method725((byte) -73);
            if (class4.field188 == null) {
                class4.field188 = class104.method878(503, 765, class122.field3052, -4875);
            }
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            class4.field188 = null;
            class52.method528(-69);
            class59.method571(class122.field3052, true, class62.field1545, class42.field1088);
        }
        if (arg0 == 25 || arg0 == 30 || arg0 == 40) {
            class4.field188 = null;
            class79.method725((byte) -98);
            class19.method298(class122.field3052, (byte) -128, class42.field1088);
        }
        class103.field2602 = arg0;
        class97.field2405 = true;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILjd;II)V", line = 285)
    public static final void method401(int arg0, class58 arg1, int arg2, int arg3) {
        field902++;
        int var4 = arg0 * arg0 + arg3 * arg3;
        if (var4 > 4225 && var4 < 90000) {
            int var5 = class86.field2161 + class113.field2800 & 0x7FF;
            int var6 = class91.field2259[var5];
            int var7 = class91.field2261[var5];
            int var8 = var6 * 256 / (class103.field2592 + 256);
            int var9 = var7 * 256 / (class103.field2592 + 256);
            int var10 = arg3 * var9 - arg0 * var8 >> 16;
            int var11 = arg0 * var9 + arg3 * var8 >> 16;
            double var12 = Math.atan2((double) var11, (double) var10);
            int var14 = (int) (Math.sin(var12) * 63.0D);
            int var15 = (int) (Math.cos(var12) * 57.0D);
            class28.field785.method562(var14 + 4 + 94 - 10, -var15 + 83 + -20, 20, 20, 15, 15, var12, 256);
        } else {
            class32.method388(arg3, arg0, arg1, (byte) 66);
        }
        int var16 = -95 / ((arg2 + 37) / 32);
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(II)V", line = 326)
    private final void method402(int arg0, int arg1) {
        field919++;
        int var3 = 71 % ((64 - arg1) / 53);
        double var4 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var6 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var8 = (double) (arg0 & 0xFF) / 256.0D;
        double var10 = var4;
        if (var6 < var4) {
            var10 = var6;
        }
        if (var10 > var8) {
            var10 = var8;
        }
        double var12 = var4;
        if (var6 > var4) {
            var12 = var6;
        }
        double var14 = 0.0D;
        double var16 = 0.0D;
        if (var8 > var12) {
            var12 = var8;
        }
        double var18 = (var10 + var12) / 2.0D;
        if (var10 != var12) {
            if (var18 < 0.5D) {
                var16 = (var12 - var10) / (var10 + var12);
            }
            if (var18 >= 0.5D) {
                var16 = (var12 - var10) / (2.0D - var12 - var10);
            }
            if (var4 == var12) {
                var14 = (var6 - var8) / (var12 - var10);
            } else if (var6 == var12) {
                var14 = (var8 - var4) / (var12 - var10) + 2.0D;
            } else if (var8 == var12) {
                var14 = (var4 - var6) / (-var10 + var12) + 4.0D;
            }
        }
        double var20 = var14 / 6.0D;
        this.field908 = (int) (var20 * 256.0D);
        this.field896 = (int) (var18 * 256.0D);
        this.field913 = (int) (var16 * 256.0D);
        if (this.field913 < 0) {
            this.field913 = 0;
        } else if (this.field913 > 255) {
            this.field913 = 255;
        }
        if (this.field896 < 0) {
            this.field896 = 0;
        } else if (this.field896 > 255) {
            this.field896 = 255;
        }
    }
}
