import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class266 {

    @OriginalMember(owner = "client!re", name = "f", descriptor = "[[I")
    private int[][] field3836;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "I")
    private int field3841;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    private int field3832;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field3833 = 0;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!re", name = "i", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!re", name = "l", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II)I")
    public final int method1694(int arg0, int arg1) {
        if (this.field3836 != null) {
            arg1 = (int) ((long) this.field3841 * (long) arg1 / (long) this.field3832) + 6;
        }
        field3834++;
        if (arg0 != 27074) {
            this.field3841 = -45;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIZII)V")
    public static final void method1695(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field3843++;
        if (class177.field2514 <= arg2 && class279.field4238 >= arg0 && class286.field4431 <= arg5 && arg1 <= class230.field3302) {
            if (arg3 == 1) {
                class116.method743(arg1, arg0, arg5, (byte) 28, arg2, arg6);
            } else {
                class287.method1928(arg5, arg6, arg3, arg2, arg1, arg0, 0);
            }
        } else if (arg3 == 1) {
            class23.method139(arg6, arg5, (byte) 19, arg1, arg0, arg2);
        } else {
            class108.method677(arg5, arg1, arg6, arg0, -87, arg3, arg2);
        }
        if (!arg4) {
            field3833 = 103;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B[B)[B")
    public final byte[] method1696(byte arg0, byte[] arg1) {
        if (arg0 <= 36) {
            return null;
        }
        if (this.field3836 != null) {
            int var3 = 0;
            int var4 = 0;
            int var5 = (int) ((long) arg1.length * (long) this.field3841 / (long) this.field3832) + 14;
            int[] var6 = new int[var5];
            for (int var7 = 0; var7 < arg1.length; var7++) {
                int[] var10 = this.field3836[var4];
                byte var11 = arg1[var7];
                for (int var12 = 0; var12 < 14; var12++) {
                    var6[var3 + var12] += var10[var12] * var11;
                }
                int var13 = this.field3841 + var4;
                int var14 = var13 / this.field3832;
                var3 += var14;
                var4 = var13 - this.field3832 * var14;
            }
            arg1 = new byte[var5];
            for (int var8 = 0; var8 < var5; var8++) {
                int var9 = var6[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 <= 127) {
                    arg1[var8] = (byte) var9;
                } else {
                    arg1[var8] = 127;
                }
            }
        }
        field3831++;
        return arg1;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
    public static final void method1697(int arg0) {
        if (arg0 != 2) {
            field3833 = 34;
        }
        field3837++;
        if (class280.field4251 != null) {
            class289 var1 = class280.field4251;
            synchronized (class280.field4251) {
                class280.field4251 = null;
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(CILjava/lang/StringBuffer;B)Ljava/lang/StringBuffer;")
    public static final StringBuffer method1698(char arg0, int arg1, StringBuffer arg2, byte arg3) {
        field3835++;
        if (arg3 != 97) {
            method1697(21);
        }
        int var4 = arg2.length();
        arg2.setLength(arg1);
        for (int var5 = var4; var5 < arg1; var5++) {
            arg2.setCharAt(var5, arg0);
        }
        return arg2;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lbc;I)V")
    public static final void method1699(class282 arg0, int arg1) {
        field3839++;
        int var2 = -119 % ((arg1 + 89) / 35);
        class21.field256 = arg0;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method1700(byte arg0, String arg1) {
        field3842++;
        int var2 = -41 % ((arg0 - 61) / 55);
        int var3 = class288.method1932(-1, arg1);
        if (var3 != -1) {
            int[] var4 = class173.field2480.method434(class200.field2840.field2228[var3] & 0x3FFF, (class200.field2840.field2228[var3] & 0xFFFFDEB) >> 14, -1, (class200.field2840.field2228[var3] & 0x3A8A7CB2) >> 28);
            class68.method415((byte) 2, var4[2], var4[1]);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ZI)I")
    public final int method1701(boolean arg0, int arg1) {
        if (arg0) {
            this.field3841 = -111;
        }
        if (this.field3836 != null) {
            arg1 = (int) ((long) this.field3841 * (long) arg1 / (long) this.field3832);
        }
        field3838++;
        return arg1;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIII)V")
    public static final void method1702(int arg0, int arg1, int arg2, int arg3) {
        class133 var4 = class6.field94[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class163 var5 = var4.field1920;
        if (var5 != null) {
            var5.field2333 = var5.field2333 * arg3 / 16;
            var5.field2339 = var5.field2339 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(II)V")
    public class266(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class286.method1909(arg0, 26408, arg1);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field3836 = new int[var5][14];
            this.field3841 = var4;
            this.field3832 = var5;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field3836[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var4 / (double) var5;
                while (var10 < var11) {
                    double var14 = var12;
                    double var16 = ((double) var10 - var8) * 3.141592653589793D;
                    if (var16 < -1.0E-4D || var16 > 1.0E-4D) {
                        var14 = var12 * (Math.sin(var16) / var16);
                    }
                    double var18 = var14 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
