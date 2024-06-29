import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class6 {

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
    private int field55;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "I")
    private int field53;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "[[I")
    private int[][] field52;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
    public static int field50 = 0;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "[[B")
    public static byte[][] field56 = new byte[50][];

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "Ljava/lang/String;")
    public static String field47;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z[B)[B")
    public final byte[] method20(boolean arg0, byte[] arg1) {
        if (this.field52 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field55 / (long) this.field53) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                int[] var10 = this.field52[var5];
                byte var11 = arg1[var7];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var6 + var12] += var10[var12] * var11;
                }
                int var13 = this.field55 + var5;
                int var14 = var13 / this.field53;
                var6 += var14;
                var5 = var13 - this.field53 * var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 > 127) {
                    arg1[var8] = 127;
                } else {
                    arg1[var8] = (byte) var9;
                }
            }
        }
        if (arg0) {
            this.method24(-87, 53);
        }
        field49++;
        return arg1;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)I")
    public final int method21(int arg0, int arg1) {
        if (this.field52 != null) {
            arg1 = (int) ((long) this.field55 * (long) arg1 / (long) this.field53) + 6;
        }
        if (arg0 == 5) {
            field45++;
            return arg1;
        } else {
            return 104;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lec;B)Z")
    public static final boolean method22(class178 arg0, byte arg1) {
        field54++;
        if (arg1 != -23) {
            method23(121, 127, 53, 80, (byte) 85);
        }
        if (arg0.field2994 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg0.field2994.length; var2++) {
            int var3 = class132.method803(arg0, var2, false);
            int var4 = arg0.field3124[var2];
            if (arg0.field2994[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg0.field2994[var2] == 3) {
                if (var3 <= var4) {
                    return false;
                }
            } else if (arg0.field2994[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIB)V")
    public static final void method23(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 != 10) {
            return;
        }
        class55.method296(arg1, arg3, arg1 + arg2, arg3 - -arg0);
        class55.method295(arg1, arg3, arg2, arg0, 0);
        field46++;
        if (class252.field4463 < 100) {
            return;
        }
        if (class17.field185 == null || class17.field185.field491 != arg2 || class17.field185.field488 != arg0) {
            class233 var5 = new class233(arg2, arg0);
            class55.method292(var5.field4151, arg2, arg0);
            class62.method393(class144.field2221, 0, -119, class83.field1213, arg2, 0, arg0, 0, 0);
            class17.field185 = var5;
            class43.field490.method896((byte) -63);
        }
        class17.field185.method226(arg1, arg3);
        int var6 = class221.field3991 * arg2 / class144.field2221 + arg1;
        int var7 = class42.field481 * arg2 / class144.field2221;
        int var8 = class132.field1885 * arg0 / class83.field1213;
        int var9 = class172.field2891 * arg0 / class83.field1213 + arg3;
        class55.method299(var6, var9, var7, var8, 16711680, 128);
        class55.method302(var6, var9, var7, var8, 16711680);
        if (class235.field4182 <= 0 || class235.field4182 % 10 >= 5) {
            return;
        }
        for (class50 var10 = (class50) class65.field900.method1651((byte) -10); var10 != null; var10 = (class50) class65.field900.method1656(-41)) {
            if (class48.field573 == var10.field596) {
                int var11 = var10.field597 * arg2 / class144.field2221 + arg1;
                int var12 = var10.field598 * arg0 / class83.field1213 + arg3;
                class55.method295(var11 - 2, var12 + -2, 4, 4, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(II)I")
    public final int method24(int arg0, int arg1) {
        field51++;
        if (arg0 >= -84) {
            field48 = -67;
        }
        if (this.field52 != null) {
            arg1 = (int) ((long) this.field55 * (long) arg1 / (long) this.field53);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(II)V")
    public class6(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class94.method579(arg0, arg1, false);
            int var4 = arg1 / var3;
            this.field55 = var4;
            int var5 = arg0 / var3;
            this.field53 = var5;
            this.field52 = new int[var5][14];
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field52[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                double var10 = (double) var4 / (double) var5;
                int var12 = (int) Math.floor(var8 + 1.0D - 7.0D);
                int var13 = (int) Math.ceil(var8 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                if (var12 < 0) {
                    var12 = 0;
                }
                while (var12 < var13) {
                    double var14 = ((double) var12 - var8) * 3.141592653589793D;
                    double var16 = var10;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var10 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var12 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var12] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var12++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V")
    public static void method25(byte arg0) {
        field56 = null;
        if (arg0 != -74) {
            field56 = null;
        }
        field47 = null;
    }
}
