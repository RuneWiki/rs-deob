import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class216 {

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "I")
    private int field3711;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
    private int field3708;

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "[[I")
    private int[][] field3718;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "[[I")
    public static int[][] field3705 = new int[104][104];

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "Lmb;")
    public static class96 field3714 = class243.method1708("Okay", (byte) 103);

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "Lwd;")
    public static class100 field3710 = null;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "Lmb;")
    public static class96 field3719 = class243.method1708("", (byte) 117);

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "Lac;")
    public static class198 field3707 = new class198();

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "I")
    public static int field3721;

    @OriginalMember(owner = "client!pf", name = "r", descriptor = "Lic;")
    public static class263 field3722;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z[Lsi;[BIBIII)V")
    public static final void method1494(boolean arg0, class207[] arg1, byte[] arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field3716++;
        byte var8;
        if (arg0) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        if (!arg0) {
            for (int var9 = 0; var9 < 4; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        if (arg5 + var10 > 0 && arg5 + var10 < 103 && arg7 + var11 > 0 && arg7 + var11 < 103) {
                            arg1[var9].field3566[arg5 + var10][arg7 + var11] = class130.method985(arg1[var9].field3566[arg5 + var10][arg7 + var11], -16777217);
                        }
                    }
                }
            }
        }
        class239 var12 = new class239(arg2);
        if (arg4 >= -76) {
            field3722 = null;
        }
        for (int var13 = 0; var13 < var8; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    class251.method1749(0, arg7 + var15, arg3, var13, var14 + arg5, arg0, -73, var12, arg6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
    public static void method1495(int arg0) {
        field3719 = null;
        field3722 = null;
        field3707 = null;
        if (arg0 <= -105) {
            field3714 = null;
            field3705 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)I")
    public final int method1496(int arg0, int arg1) {
        field3721++;
        if (this.field3718 != null) {
            arg1 = (int) ((long) this.field3711 * (long) arg1 / (long) this.field3708);
        }
        return arg0 == 0 ? arg1 : 26;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B[B)[B")
    public final byte[] method1497(byte arg0, byte[] arg1) {
        if (arg0 != 60) {
            method1494(false, (class207[]) null, (byte[]) null, -43, (byte) -49, -124, 121, 23);
        }
        field3720++;
        if (this.field3718 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field3711 / (long) this.field3708) + 14;
            int var4 = 0;
            int var5 = 0;
            int[] var6 = new int[var3];
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field3718[var4];
                for (int var12 = 0; var12 < 14; var12++) {
                    var6[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field3711 + var4;
                int var14 = var13 / this.field3708;
                var5 += var14;
                var4 = var13 - this.field3708 * var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
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
        return arg1;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method1498(byte arg0, String arg1) {
        System.out.println("Bad " + arg1 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(1);
        int var2 = 34 % ((arg0 - 23) / 60);
        field3715++;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(II)I")
    public final int method1499(int arg0, int arg1) {
        if (arg1 != -65) {
            this.method1499(-100, 12);
        }
        field3713++;
        if (this.field3718 != null) {
            arg0 = (int) ((long) this.field3711 * (long) arg0 / (long) this.field3708) + 6;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(II)V")
    public class216(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class128.method976(arg1, (byte) 117, arg0);
            int var4 = arg1 / var3;
            this.field3711 = var4;
            int var5 = arg0 / var3;
            this.field3708 = var5;
            this.field3718 = new int[var5][14];
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field3718[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                int var11 = (int) Math.ceil(var8 + 7.0D);
                double var12 = (double) var4 / (double) var5;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 > 14) {
                    var11 = 14;
                }
                while (var11 > var10) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
