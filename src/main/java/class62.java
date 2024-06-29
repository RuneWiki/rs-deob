import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class62 {

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    private int field814;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    private int field817;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "[[I")
    private int[][] field811;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "[[Z")
    public static boolean[][] field816 = new boolean[][] { { true, true, true }, { false, false }, { false, true }, { true, false }, { false, true, true }, { true, false, true }, { false, true, false }, { true, false, false } };

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "Luf;")
    public static class168 field819 = class148.method1019(-1720, "Spielwelt erstellt)3");

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "Lch;")
    public static class95 field810 = new class95(5000);

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "I")
    public static int field824 = 0;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "Lig;")
    public static class139 field812;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "Lfj;")
    public static class283 field822;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "[S")
    public static short[] field823;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)I", line = 8)
    public final int method347(int arg0, int arg1) {
        field815++;
        if (this.field811 != null) {
            arg1 = ((int) ((long) this.field817 * (long) arg1 / (long) this.field814)) + 6;
        }
        if (arg0 != 18445) {
            this.method347(-12, -80);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BI)I", line = 22)
    public final int method348(byte arg0, int arg1) {
        if (this.field811 != null) {
            arg1 = (int) ((long) this.field817 * (long) arg1 / (long) this.field814);
        }
        field818++;
        return arg0 == -121 ? arg1 : -13;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIII)I", line = 37)
    public static final int method349(int arg0, int arg1, int arg2, int arg3) {
        field821++;
        int var4 = arg3 >> 7;
        int var5 = arg2 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg1;
        int var7 = arg3 & 0x7F;
        int var8 = arg2 & 0x7F;
        if (arg1 < 3 && (class159.field2520[1][var4][var5] & 0x2) == 2) {
            var6 = arg1 + 1;
        }
        int var9 = (128 - var7) * class227.field3686[var6][var4][var5] + (class227.field3686[var6][var4 + 1][var5] * var7) >> 7;
        int var10 = (arg0 - var7) * class227.field3686[var6][var4][var5 + 1] + class227.field3686[var6][var4 + 1][var5 + 1] * var7 >> 7;
        return (128 - var8) * var9 + var8 * var10 >> 7;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "([BI)[B", line = 69)
    public final byte[] method350(byte[] arg0, int arg1) {
        if (this.field811 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field817 / (long) this.field814) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                int[] var8 = this.field811[var6];
                byte var9 = arg0[var7];
                for (int var10 = 0; var10 < 14; var10++) {
                    var4[var5 + var10] += var8[var10] * var9;
                }
                int var11 = this.field817 + var6;
                int var12 = var11 / this.field814;
                var5 += var12;
                var6 = var11 - this.field814 * var12;
            }
            arg0 = new byte[var3];
            for (int var13 = 0; var13 < var3; var13++) {
                int var14 = var4[var13] + 32768 >> 16;
                if (var14 < -128) {
                    arg0[var13] = -128;
                } else if (var14 > 127) {
                    arg0[var13] = 127;
                } else {
                    arg0[var13] = (byte) var14;
                }
            }
        }
        field808++;
        if (arg1 > -26) {
            field822 = (class283) null;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lg;I)Luf;", line = 137)
    public static final class168 method351(class242 arg0, int arg1) {
        field809++;
        if (~class54.method298(client.method2015(arg0), arg1 + 169717420) == arg1) {
            return null;
        } else if (arg0.field4017 == null || arg0.field4017.method1195(false).method1167(false) == 0) {
            return class245.field4165 ? class196.field3229 : null;
        } else {
            return arg0.field4017;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V", line = 167)
    public static void method352(int arg0) {
        field816 = (boolean[][]) null;
        field819 = null;
        field812 = null;
        field823 = null;
        if (arg0 != -13139) {
            method349(-114, 16, 88, -113);
        }
        field822 = null;
        field810 = null;
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(II)V", line = 184)
    public class62(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class207.method1442(arg1, (byte) 54, arg0);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field814 = var5;
            this.field817 = var4;
            this.field811 = new int[var5][14];
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field811[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                double var12 = (double) var4 / (double) var5;
                if (var11 > 14) {
                    var11 = 14;
                }
                while (var10 < var11) {
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
