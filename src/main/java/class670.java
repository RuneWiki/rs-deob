import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public class class670 {

    @OriginalMember(owner = "client!lca", name = "j", descriptor = "[J")
    private long[] field9731 = new long[8];

    @OriginalMember(owner = "client!lca", name = "p", descriptor = "[J")
    private long[] field9725 = new long[8];

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "[J")
    private long[] field9724 = new long[8];

    @OriginalMember(owner = "client!lca", name = "c", descriptor = "I")
    private int field9737 = 0;

    @OriginalMember(owner = "client!lca", name = "l", descriptor = "[J")
    private long[] field9734 = new long[8];

    @OriginalMember(owner = "client!lca", name = "d", descriptor = "[J")
    private long[] field9736 = new long[8];

    @OriginalMember(owner = "client!lca", name = "g", descriptor = "[B")
    private byte[] field9738 = new byte[64];

    @OriginalMember(owner = "client!lca", name = "h", descriptor = "[B")
    private byte[] field9740 = new byte[32];

    @OriginalMember(owner = "client!lca", name = "q", descriptor = "I")
    private int field9733 = 0;

    @OriginalMember(owner = "client!lca", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9741 = new String[] { method4936(method4935("0\f{n@")), method4936(method4935("%W9,")), method4936(method4935("'A4n\u007fc")), method4936(method4935("'A4n~c")), method4936(method4935("'A4n|c")), method4936(method4935("\u0007m\u0012\t~kg\u0007\u0012r\u0019")), method4936(method4935("'A4ntc")), method4936(method4935("'A4nuc")), method4936(method4935("'A4nyc")), method4936(method4935("'A4nzc")), method4936(method4935("'A4nwc")) };

    @OriginalMember(owner = "client!lca", name = "f", descriptor = "[[B")
    public static byte[][] field9739 = new byte[250][];

    @OriginalMember(owner = "client!lca", name = "k", descriptor = "I")
    public static int field9726;

    @OriginalMember(owner = "client!lca", name = "e", descriptor = "I")
    public static int field9727;

    @OriginalMember(owner = "client!lca", name = "i", descriptor = "I")
    public static int field9728;

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "I")
    public static int field9729;

    @OriginalMember(owner = "client!lca", name = "m", descriptor = "I")
    public static int field9730;

    @OriginalMember(owner = "client!lca", name = "o", descriptor = "I")
    public static int field9732;

    @OriginalMember(owner = "client!lca", name = "n", descriptor = "I")
    public static int field9735;

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(BJ[B)V", line = 3)
    public final void method4925(byte arg0, long arg1, byte[] arg2) {
        try {
            field9735++;
            int var5 = 0;
            int var6 = 8 - ((int) arg1 & 0x7) & 0x7;
            int var7 = this.field9733 & 0x7;
            long var8 = arg1;
            int var10 = 56 % ((arg0 + 54) / 38);
            int var11 = 31;
            int var12 = 0;
            while (var11 >= 0) {
                int var13 = (this.field9740[var11] & 0xFF) + ((int) var8 & 0xFF) + var12;
                this.field9740[var11] = (byte) var13;
                var8 >>>= 0x8;
                var12 = var13 >>> 8;
                var11--;
            }
            while (arg1 > 8L) {
                int var14 = arg2[var5] << var6 & 0xFF | (arg2[var5 + 1] & 0xFF) >>> 8 - var6;
                if (var14 < 0 || var14 >= 256) {
                    throw new RuntimeException(field9741[5]);
                }
                this.field9738[this.field9737] = (byte) class544.method4107(this.field9738[this.field9737], var14 >>> var7);
                this.field9733 += 8 - var7;
                this.field9737++;
                if (this.field9733 == 512) {
                    this.method4931(-63);
                    this.field9733 = this.field9737 = 0;
                }
                this.field9738[this.field9737] = (byte) class291.method2359(255, var14 << 8 - var7);
                var5++;
                this.field9733 += var7;
                arg1 -= 8L;
            }
            int var15;
            if (arg1 > 0L) {
                var15 = arg2[var5] << var6 & 0xFF;
                this.field9738[this.field9737] = (byte) class544.method4107(this.field9738[this.field9737], var15 >>> var7);
            } else {
                var15 = 0;
            }
            if (((long) var7 + arg1) < 8L) {
                this.field9733 = (int) ((long) this.field9733 + arg1);
            } else {
                this.field9737++;
                this.field9733 += 8 - var7;
                arg1 -= (8 - var7);
                if (this.field9733 == 512) {
                    this.method4931(-71);
                    this.field9733 = this.field9737 = 0;
                }
                this.field9738[this.field9737] = (byte) class291.method2359(var15 << 8 - var7, 255);
                this.field9733 += (int) arg1;
            }
        } catch (RuntimeException var17) {
            throw class759.method5498(var17, field9741[4] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field9741[1] : field9741[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(Lr;III[Z)Z", line = 90)
    public static final boolean method4926(class194 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class555.field8261 != class195.field2617) {
            int var6 = class184.field2541[arg1].method2404((byte) 110, arg2, arg3);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class294 var8 = class184.field2541[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method2404((byte) 118, arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method1501(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method1507(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(B)V", line = 125)
    public final void method4927(byte arg0) {
        try {
            field9732++;
            int var2 = 0;
            if (arg0 > 111) {
                while (var2 < 32) {
                    this.field9740[var2] = 0;
                    var2++;
                }
                this.field9733 = this.field9737 = 0;
                this.field9738[0] = 0;
                for (int var3 = 0; var3 < 8; var3++) {
                    this.field9736[var3] = 0L;
                }
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field9741[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "(I)V", line = 151)
    public static void method4928(int arg0) {
        try {
            field9739 = null;
            if (arg0 != 0) {
                field9739 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field9741[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(IIII)V", line = 162)
    public static final void method4929(int arg0, int arg1, int arg2, int arg3) {
        class96 var4 = class734.field10683[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class535 var5 = var4.field1080;
        class535 var6 = var4.field1090;
        if (var5 != null) {
            var5.field7829 = (short) (var5.field7829 * arg3 / (0x10 << class602.field8828 - 7));
            var5.field7830 = (short) (var5.field7830 * arg3 / (0x10 << class602.field8828 - 7));
        }
        if (var6 != null) {
            var6.field7829 = (short) (var6.field7829 * arg3 / (0x10 << class602.field8828 - 7));
            var6.field7830 = (short) (var6.field7830 * arg3 / (0x10 << class602.field8828 - 7));
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "([Lfs;B)V", line = 185)
    public static final void method4930(class581[] arg0, byte arg1) {
        try {
            field9726++;
            if (arg1 != -16) {
                field9739 = null;
            }
            class588.field8655 = arg0.length;
            class106.field1221 = new class581[class588.field8655 + 10];
            class749.field10906 = new int[class588.field8655 + 10];
            class467.method3554(arg0, 0, class106.field1221, 0, class588.field8655);
            for (int var2 = 0; var2 < class588.field8655; var2++) {
                class749.field10906[var2] = class106.field1221[var2].method997();
            }
            for (int var3 = class588.field8655; var3 < class106.field1221.length; var3++) {
                class749.field10906[var3] = 12;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field9741[2] + (arg0 == null ? field9741[1] : field9741[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(I)V", line = 220)
    private final void method4931(int arg0) {
        try {
            int var2 = 0;
            int var3 = 0;
            while (var2 < 8) {
                this.field9724[var2] = class416.method3233(class9.method63(255L, (long) this.field9738[var3 + 7]), class416.method3233(class416.method3233(class9.method63((long) this.field9738[var3 + 5], 255L) << 16, class416.method3233(class416.method3233(class416.method3233(class9.method63((long) this.field9738[var3 + 2] << 40, 0xFFL << 40), class416.method3233((long) this.field9738[var3] << 56, class9.method63(0xFFL << 48, (long) this.field9738[var3 + 1] << 48))), class9.method63((long) this.field9738[var3 + 3], 255L) << 32), class9.method63(0xFFL << 24, (long) this.field9738[var3 + 4] << 24))), class9.method63((long) this.field9738[var3 + 6], 255L) << 8));
                var3 += 8;
                var2++;
            }
            field9730++;
            for (int var4 = 0; var4 < 8; var4++) {
                this.field9725[var4] = class416.method3233(this.field9724[var4], this.field9734[var4] = this.field9736[var4]);
            }
            if (arg0 > -7) {
                this.field9731 = null;
            }
            for (int var5 = 1; var5 <= 10; var5++) {
                for (int var6 = 0; var6 < 8; var6++) {
                    this.field9731[var6] = 0L;
                    int var7 = 0;
                    int var8 = 56;
                    while (var7 < 8) {
                        this.field9731[var6] = class416.method3233(this.field9731[var6], class372.field5683[var7][class291.method2359((int) (this.field9734[class291.method2359(var6 - var7, 7)] >>> var8), 255)]);
                        var7++;
                        var8 -= 8;
                    }
                }
                for (int var9 = 0; var9 < 8; var9++) {
                    this.field9734[var9] = this.field9731[var9];
                }
                this.field9734[0] = class416.method3233(this.field9734[0], class372.field5679[var5]);
                for (int var10 = 0; var10 < 8; var10++) {
                    this.field9731[var10] = this.field9734[var10];
                    int var11 = 0;
                    int var12 = 56;
                    while (var11 < 8) {
                        this.field9731[var10] = class416.method3233(this.field9731[var10], class372.field5683[var11][class291.method2359(255, (int) (this.field9725[class291.method2359(var10 - var11, 7)] >>> var12))]);
                        var11++;
                        var12 -= 8;
                    }
                }
                for (int var13 = 0; var13 < 8; var13++) {
                    this.field9725[var13] = this.field9731[var13];
                }
            }
            for (int var14 = 0; var14 < 8; var14++) {
                this.field9736[var14] = class416.method3233(this.field9736[var14], class416.method3233(this.field9724[var14], this.field9725[var14]));
            }
        } catch (RuntimeException var16) {
            throw class759.method5498(var16, field9741[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(ZIIIIIIII)V", line = 335)
    public static final void method4932(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        try {
            if (arg0) {
                field9739 = null;
            }
            class340.field5291[class48.field547++] = new class367(arg1, arg4, arg6, arg8, arg8, arg6, arg7, arg3, arg3, arg7, arg2, arg2, arg5, arg5);
            field9727++;
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field9741[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(ILla;I)Lfs;", line = 351)
    public static final class581 method4933(int arg0, class476 arg1, int arg2) {
        try {
            field9728++;
            if (arg0 > -6) {
                method4929(37, 67, -115, 21);
            }
            class581 var3 = (class581) class625.field9146.method1558((byte) 96, (long) arg2);
            if (var3 == null) {
                if (class610.field8906) {
                    var3 = class610.field8913.method487(class481.method3669(arg1, arg2), true);
                } else {
                    var3 = class247.method2111(4699, arg1.method3638(117, arg2));
                }
                class625.field9146.method1556((long) arg2, var3, 1);
            }
            return var3;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field9741[3] + arg0 + ',' + (arg1 == null ? field9741[1] : field9741[0]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(BI[B)V", line = 382)
    public final void method4934(byte arg0, int arg1, byte[] arg2) {
        try {
            this.field9738[this.field9737] = (byte) class544.method4107(this.field9738[this.field9737], 0x80 >>> class291.method2359(7, this.field9733));
            field9729++;
            this.field9737++;
            if (this.field9737 > 32) {
                while (true) {
                    if (this.field9737 >= 64) {
                        this.method4931(-28);
                        this.field9737 = 0;
                        break;
                    }
                    this.field9738[this.field9737++] = 0;
                }
            }
            while (this.field9737 < 32) {
                this.field9738[this.field9737++] = 0;
            }
            class467.method3556(this.field9740, 0, this.field9738, 32, 32);
            this.method4931(-47);
            int var4 = -109 % ((14 - arg0) / 57);
            int var5 = 0;
            int var6 = arg1;
            while (var5 < 8) {
                long var7 = this.field9736[var5];
                arg2[var6] = (byte) ((int) (var7 >>> 56));
                arg2[var6 + 1] = (byte) ((int) (var7 >>> 48));
                arg2[var6 + 2] = (byte) ((int) (var7 >>> 40));
                arg2[var6 + 3] = (byte) ((int) (var7 >>> 32));
                arg2[var6 + 4] = (byte) ((int) (var7 >>> 24));
                arg2[var6 + 5] = (byte) ((int) (var7 >>> 16));
                arg2[var6 + 6] = (byte) ((int) (var7 >>> 8));
                arg2[var6 + 7] = (byte) ((int) var7);
                var6 += 8;
                var5++;
            }
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field9741[7] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field9741[1] : field9741[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!lca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4935(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4936(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 75;
                    break;
                case 1:
                    var10005 = 34;
                    break;
                case 2:
                    var10005 = 85;
                    break;
                case 3:
                    var10005 = 64;
                    break;
                default:
                    var10005 = 61;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
