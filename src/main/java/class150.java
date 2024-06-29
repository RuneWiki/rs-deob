import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class150 extends class139 {

    @OriginalMember(owner = "client!qb", name = "bb", descriptor = "I")
    private int field3083 = 0;

    @OriginalMember(owner = "client!qb", name = "Y", descriptor = "I")
    private int field3080 = 1024;

    @OriginalMember(owner = "client!qb", name = "Z", descriptor = "I")
    private int field3081 = 81;

    @OriginalMember(owner = "client!qb", name = "ab", descriptor = "I")
    private int field3082 = 409;

    @OriginalMember(owner = "client!qb", name = "hb", descriptor = "I")
    private int field3089 = 1024;

    @OriginalMember(owner = "client!qb", name = "ib", descriptor = "I")
    private int field3090 = 204;

    @OriginalMember(owner = "client!qb", name = "T", descriptor = "I")
    private int field3075 = 4;

    @OriginalMember(owner = "client!qb", name = "U", descriptor = "I")
    private int field3076 = 8;

    @OriginalMember(owner = "client!qb", name = "W", descriptor = "Lrf;")
    public static class163 field3078 = class53.method392(-58, "Benutzen Sie bitte eine andere Welt)3");

    @OriginalMember(owner = "client!qb", name = "pb", descriptor = "Lrf;")
    private static class163 field3097 = class53.method392(-100, "Connection timed out)3");

    @OriginalMember(owner = "client!qb", name = "mb", descriptor = "Lrf;")
    public static class163 field3094 = field3097;

    @OriginalMember(owner = "client!qb", name = "qb", descriptor = "Lge;")
    public static class65 field3098 = new class65(4096);

    @OriginalMember(owner = "client!qb", name = "ub", descriptor = "I")
    public static int field3102 = 0;

    @OriginalMember(owner = "client!qb", name = "xb", descriptor = "Lrf;")
    public static class163 field3105 = class53.method392(-75, "Spieler");

    @OriginalMember(owner = "client!qb", name = "yb", descriptor = "Lrf;")
    public static class163 field3106 = class53.method392(-40, " (X");

    @OriginalMember(owner = "client!qb", name = "zb", descriptor = "Lrf;")
    public static class163 field3107 = class53.method392(-126, ":");

    @OriginalMember(owner = "client!qb", name = "vb", descriptor = "Lrf;")
    public static class163 field3103 = class53.method392(81, "null");

    @OriginalMember(owner = "client!qb", name = "wb", descriptor = "I")
    public static int field3104 = 0;

    @OriginalMember(owner = "client!qb", name = "V", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!qb", name = "X", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!qb", name = "cb", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!qb", name = "eb", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!qb", name = "fb", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!qb", name = "gb", descriptor = "I")
    private int field3088;

    @OriginalMember(owner = "client!qb", name = "jb", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!qb", name = "kb", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!qb", name = "nb", descriptor = "I")
    private int field3095;

    @OriginalMember(owner = "client!qb", name = "rb", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!qb", name = "sb", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!qb", name = "tb", descriptor = "I")
    private int field3101;

    @OriginalMember(owner = "client!qb", name = "Ab", descriptor = "Ldh;")
    public static class39 field3108;

    @OriginalMember(owner = "client!qb", name = "ob", descriptor = "[I")
    private int[] field3096;

    @OriginalMember(owner = "client!qb", name = "db", descriptor = "[[I")
    private int[][] field3085;

    @OriginalMember(owner = "client!qb", name = "lb", descriptor = "[[I")
    private int[][] field3093;

    @OriginalMember(owner = "client!qb", name = "Bb", descriptor = "[[Z")
    public static boolean[][] field3109;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "(I)V")
    public static final void method968(int arg0) {
        while (true) {
            if (~class105.field2195.method332(class74.field1554, arg0 + 111) <= -28) {
                int var1 = class105.field2195.method331(15, -2055311549);
                if (~var1 != -32768) {
                    boolean var2 = false;
                    if (class187.field3723[var1] == null) {
                        class187.field3723[var1] = new class70();
                        var2 = true;
                    }
                    class70 var3 = class187.field3723[var1];
                    class170.field3459[class93.field2013++] = var1;
                    var3.field711 = class51.field1023;
                    int var4 = class105.field2195.method331(1, -2055311549);
                    if (var4 == 1) {
                        class52.field1088[class181.field3638++] = var1;
                    }
                    int var5 = class105.field2195.method331(5, -2055311549);
                    var3.field1482 = class43.method262(18354, class105.field2195.method331(14, arg0 + -2055311564));
                    int var6 = class58.field1176[class105.field2195.method331(3, -2055311549)];
                    if (var2) {
                        var3.field737 = var3.field727 = var6;
                    }
                    int var7 = class105.field2195.method331(1, arg0 ^ -2055311540);
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var8 = class105.field2195.method331(5, -2055311549);
                    var3.field681 = var3.field1482.field2653;
                    var3.field721 = var3.field1482.field2650;
                    var3.field719 = var3.field1482.field2669;
                    var3.field717 = var3.field1482.field2681;
                    if (~var3.field717 == -1) {
                        var3.field727 = 0;
                    }
                    var3.field707 = var3.field1482.field2671;
                    var3.field725 = var3.field1482.field2648;
                    var3.field732 = var3.field1482.field2663;
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    var3.field684 = var3.field1482.field2644;
                    var3.field709 = var3.field1482.field2659;
                    var3.method225(class56.field1136.field718[0] + var8, class56.field1136.field692[0] + var5, -71, ~var7 == -2);
                    continue;
                }
            }
            if (arg0 != 15) {
                method974((byte[]) null, (byte) -112);
            }
            ++field3087;
            class105.field2195.method334(arg0 ^ -10);
            return;
        }
    }

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "(I)V")
    private final void method969(int arg0) {
        ++field3077;
        Random var2 = new Random((long) this.field3076);
        this.field3093 = new int[this.field3076][this.field3075 + 1];
        this.field3088 = arg0 / this.field3075;
        this.field3101 = 4096 / this.field3076;
        this.field3096 = new int[this.field3076 + 1];
        this.field3096[0] = 0;
        this.field3085 = new int[this.field3076][this.field3075];
        int var3 = this.field3088 / 2;
        int var4 = this.field3101 / 2;
        this.field3095 = this.field3081 / 2;
        for (int var5 = 0; ~var5 > ~this.field3076; ++var5) {
            if (~var5 < -1) {
                int var6 = this.field3101;
                int var7 = (class170.method1149(true, 4096, var2) + -2048) * this.field3090 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field3096[var5] = this.field3096[var5 - 1] + var8;
            }
            this.field3093[var5][0] = 0;
            for (int var9 = 0; ~this.field3075 < ~var9; ++var9) {
                if (var9 > 0) {
                    int var10 = this.field3088;
                    int var11 = (-2048 + class170.method1149(true, 4096, var2)) * this.field3082 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field3093[var5][var9] = this.field3093[var5][var9 + -1] + var12;
                }
                this.field3085[var5][var9] = this.field3080 > 0 ? -class170.method1149(true, this.field3080, var2) + 4096 : 4096;
            }
            this.field3093[var5][this.field3075] = 4096;
        }
        this.field3096[this.field3076] = 4096;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BIIIIIIII)V")
    public static final void method970(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field3092;
        if (class114.method781(arg8, (byte) -121)) {
            class134.field2775 = null;
            if (arg0 < 8) {
                method968(-92);
            }
            class71.method505(arg2, arg1, arg4, class84.field1798[arg8], arg6, arg3, -111, arg7, arg5, -1);
            if (class134.field2775 != null) {
                class71.method505(arg2, arg1, arg4, class134.field2775, class92.field2005, class102.field2129, -124, arg7, arg5, -1412584499);
                class134.field2775 = null;
            }
        } else if (~arg7 != 0) {
            class181.field3631[arg7] = true;
        } else {
            for (int var9 = 0; var9 < 100; ++var9) {
                class181.field3631[var9] = true;
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "(II)I")
    public static int method971(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "(B)V")
    public static void method972(byte arg0) {
        field3105 = null;
        field3094 = null;
        field3097 = null;
        field3109 = null;
        field3078 = null;
        field3107 = null;
        field3103 = null;
        if (arg0 <= 3) {
            field3108 = null;
        }
        field3106 = null;
        field3108 = null;
        field3098 = null;
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)V")
    public final void method127(int arg0) {
        ++field3084;
        this.method969(4096);
        if (arg0 != 0) {
            field3105 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V")
    public class150() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "(B)V")
    public static final void method973(byte arg0) {
        ++field3091;
        Object var1 = class40.field814;
        synchronized (class40.field814) {
            if (class105.field2197 != 0) {
                class105.field2197 = 1;
                try {
                    class40.field814.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
        int var2 = -82 % ((-44 - arg0) / 35);
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        if (arg1 != 7451) {
            this.field3089 = -13;
        }
        ++field3079;
        int[] var3 = super.field2859.method1319(-112, arg0);
        if (super.field2859.field3966) {
            int var4 = 0;
            int var5;
            for (var5 = class180.field3607[arg0] + this.field3083; ~var5 > -1; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (var4 < this.field3076 && ~var5 <= ~this.field3096[var4]) {
                ++var4;
            }
            float var6 = (float) this.field3096[var4];
            float var7 = (float) this.field3096[var4 + -1];
            if ((float) var5 > (float) this.field3095 + var7 && (float) (-this.field3095) + var6 > (float) var5) {
                for (int var8 = 0; ~class23.field402 < ~var8; ++var8) {
                    int var9 = 0;
                    int var10 = ~(var4 % 2) != -1 ? -this.field3089 : this.field3089;
                    int var11;
                    for (var11 = class189.field3772[var8] - -(this.field3088 * var10 >> 12); ~var11 > -1; var11 += 4096) {
                    }
                    while (var11 > 4096) {
                        var11 -= 4096;
                    }
                    while (this.field3075 > var9 && var11 >= this.field3093[var4 - 1][var9]) {
                        ++var9;
                    }
                    float var12 = (float) this.field3093[var4 + -1][var9 + -1];
                    float var13 = (float) this.field3093[var4 + -1][var9];
                    if ((float) this.field3095 + var12 < (float) var11 && (float) var11 < (float) (-this.field3095) + var13) {
                        var3[var8] = this.field3085[var4 + -1][var9 + -1];
                    } else {
                        var3[var8] = 0;
                    }
                }
            } else {
                class123.method827(var3, 0, class23.field402, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IILfa;)V")
    public final void method64(int arg0, int arg1, class52 arg2) {
        ++field3086;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (~arg0 != -7) {
                                    if (arg0 == 7) {
                                        this.field3080 = arg2.method390((byte) 101);
                                    }
                                } else {
                                    this.field3081 = arg2.method390((byte) 122);
                                }
                            } else {
                                this.field3083 = arg2.method390((byte) 108);
                            }
                        } else {
                            this.field3089 = arg2.method390((byte) 120);
                        }
                    } else {
                        this.field3090 = arg2.method390((byte) 120);
                    }
                } else {
                    this.field3082 = arg2.method390((byte) 108);
                }
            } else {
                this.field3076 = arg2.method344(255);
            }
        } else {
            this.field3075 = arg2.method344(arg1 + 234);
        }
        if (arg1 != 21) {
            field3098 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "([BB)[B")
    public static final byte[] method974(byte[] arg0, byte arg1) {
        ++field3100;
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        class123.method830(arg0, 0, var3, 0, var2);
        return arg1 >= -8 ? null : var3;
    }
}
