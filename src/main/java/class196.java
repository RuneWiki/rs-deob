import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class196 {

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
    private int field3745;

    @OriginalMember(owner = "client!tg", name = "p", descriptor = "I")
    private int field3757;

    @OriginalMember(owner = "client!tg", name = "o", descriptor = "[[I")
    private int[][] field3756;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
    public static int field3742 = 0;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "Lob;")
    private static class141 field3746 = class175.method1195(40, " ");

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "Lob;")
    public static class141 field3748 = class175.method1195(40, " loggt sich aus)3");

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "Lob;")
    public static class141 field3752 = field3746;

    @OriginalMember(owner = "client!tg", name = "q", descriptor = "I")
    public static int field3758 = 0;

    @OriginalMember(owner = "client!tg", name = "r", descriptor = "Lob;")
    public static class141 field3759 = class175.method1195(40, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "I")
    public static int field3754;

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "I")
    public static int field3755;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "([BI)[B")
    public final byte[] method1318(byte[] arg0, int arg1) {
        if (arg1 != 32767) {
            return null;
        }
        field3751++;
        if (this.field3756 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field3745 / (long) this.field3757) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field3756[var5];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var6 + var12] += var11[var12] * var10;
                }
                int var13 = this.field3745 + var5;
                int var14 = var13 / this.field3757;
                var5 = var13 - this.field3757 * var14;
                var6 += var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 <= 127) {
                    arg0[var8] = (byte) var9;
                } else {
                    arg0[var8] = 127;
                }
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)I")
    public final int method1319(int arg0, int arg1) {
        if (arg0 != 6) {
            return 40;
        }
        field3747++;
        if (this.field3756 != null) {
            arg1 = (int) ((long) this.field3745 * (long) arg1 / (long) this.field3757);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIILhi;II)V")
    public static final void method1320(int arg0, int arg1, int arg2, int arg3, class79 arg4, int arg5, int arg6) {
        field3753++;
        long var7 = 0L;
        if (arg5 == 0) {
            var7 = class224.method1442(arg1, arg3, arg6);
        }
        if (arg0 != 1177) {
            return;
        }
        boolean var9 = false;
        if (arg5 == 1) {
            var7 = class113.method732(arg1, arg3, arg6);
        }
        if (arg5 == 2) {
            var7 = class40.method263(arg1, arg3, arg6);
        }
        boolean var10 = false;
        if (arg5 == 3) {
            var7 = class177.method1206(arg1, arg3, arg6);
        }
        boolean var11 = true;
        if (var7 == 0L) {
            return;
        }
        int var12 = (int) var7 >> 14 & 0x1F;
        int var13 = (int) var7 >> 20 & 0x3;
        int var14 = (int) (var7 >>> 32) & Integer.MAX_VALUE;
        class54 var15 = class175.method1198(-14098, var14);
        if (arg5 == 0) {
            class50.method327(arg1, arg3, arg6);
            if (var15.field1061 != 0) {
                arg4.method557(arg6, var13, true, var12, var15.field1036, arg3);
            }
        }
        if (arg5 == 1) {
            class90.method617(arg1, arg3, arg6);
        }
        if (arg5 == 2) {
            class124.method802(arg1, arg3, arg6);
            if (var15.field1061 != 0 && arg3 + var15.field1079 < 104 && var15.field1079 + arg6 < 104 && var15.field1073 + arg3 < 104 && var15.field1073 + arg6 < 104) {
                arg4.method550(arg6, var15.field1036, arg3, true, var15.field1079, var15.field1073, var13);
            }
        }
        if (arg5 != 3) {
            return;
        }
        class98.method654(arg1, arg3, arg6);
        if (var15.field1061 == 1) {
            arg4.method556(arg0 ^ 0x7E85, arg3, arg6);
            return;
        }
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(II)I")
    public final int method1321(int arg0, int arg1) {
        if (arg1 != 6) {
            return 36;
        }
        field3754++;
        if (this.field3756 != null) {
            arg0 = (int) ((long) this.field3745 * (long) arg0 / (long) this.field3757) + 6;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1322(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3755++;
        if (arg5 < 20) {
            method1323(1);
        }
        class66 var10 = null;
        for (class66 var11 = (class66) class216.field4115.method1103((byte) -9); var11 != null; var11 = (class66) class216.field4115.method1106((byte) 91)) {
            if (var11.field1276 == arg8 && var11.field1285 == arg1 && var11.field1290 == arg7 && var11.field1292 == arg4) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class66();
            var10.field1276 = arg8;
            var10.field1290 = arg7;
            var10.field1292 = arg4;
            var10.field1285 = arg1;
            class187.method1246(8, var10);
            class216.field4115.method1098(0, var10);
        }
        var10.field1291 = arg2;
        var10.field1293 = arg3;
        var10.field1272 = arg0;
        var10.field1277 = arg9;
        var10.field1271 = arg6;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
    public static void method1323(int arg0) {
        field3746 = null;
        if (arg0 != -1) {
            field3746 = null;
        }
        field3748 = null;
        field3752 = null;
        field3759 = null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILpe;ZIIII)V")
    public static final void method1324(int arg0, class154 arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        class22.field398 = arg6;
        class202.field3820 = 1;
        class182.field3585 = arg2;
        class53.field1006 = arg4;
        field3750++;
        class54.field1041 = arg3;
        class119.field2322 = arg1;
        class180.field3542 = arg0;
        if (arg5 != 0) {
            field3748 = null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(II)V")
    public class196(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = client.method217(490, arg1, arg0);
            int var4 = arg1 / var3;
            this.field3745 = var4;
            int var5 = arg0 / var3;
            this.field3757 = var5;
            this.field3756 = new int[var5][14];
            for (int var6 = 0; var6 < var5; var6++) {
                double var7 = (double) var6 / (double) var5 + 6.0D;
                int[] var9 = this.field3756[var6];
                int var10 = (int) Math.floor(var7 + 1.0D - 7.0D);
                double var11 = (double) var4 / (double) var5;
                int var13 = (int) Math.ceil(var7 + 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var13 > 14) {
                    var13 = 14;
                }
                while (var13 > var10) {
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
}
