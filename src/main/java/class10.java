import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class10 {

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "[[I")
    private int[][] field200;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "I")
    private int field204;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
    private int field203;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "Ljava/lang/String;")
    public static String field206 = " is already on your ignore list.";

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "Ljava/lang/String;")
    public static String field205 = "Please remove ";

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "Lth;")
    public static class112 field199;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "Lfl;")
    public static class248 field196;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)I")
    public final int method110(int arg0, int arg1) {
        if (arg0 < 61) {
            this.method113((byte[]) null, 100);
        }
        if (this.field200 != null) {
            arg1 = (int) ((long) this.field203 * (long) arg1 / (long) this.field204);
        }
        field195++;
        return arg1;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(II)I")
    public final int method111(int arg0, int arg1) {
        if (this.field200 != null) {
            arg0 = (int) ((long) this.field203 * (long) arg0 / (long) this.field204) + 6;
        }
        if (arg1 != 6) {
            this.field200 = null;
        }
        field198++;
        return arg0;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V")
    public static void method112(byte arg0) {
        field205 = null;
        field196 = null;
        field199 = null;
        int var1 = 67 % ((arg0 - 36) / 32);
        field206 = null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "([BI)[B")
    public final byte[] method113(byte[] arg0, int arg1) {
        field201++;
        if (arg1 != 21132) {
            this.field203 = -57;
        }
        if (this.field200 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field203 / (long) this.field204) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field200[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field203 + var6;
                int var14 = var13 / this.field204;
                var5 += var14;
                var6 = var13 - this.field204 * var14;
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

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BI)[B")
    public static final byte[] method114(byte arg0, int arg1) {
        if (arg0 != -64) {
            field205 = null;
        }
        field207++;
        class36 var2 = (class36) class86.field1409.method1701(false, (long) arg1);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class167.method1104(var7, (byte) -86, var4);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class36(var3);
            class86.field1409.method1704((long) arg1, var2, true);
        }
        return var2.field579;
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(II)V")
    public class10(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class17.method158((byte) 64, arg0, arg1);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field200 = new int[var4][14];
            this.field204 = var4;
            this.field203 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field200[var6];
                double var8 = (double) var5 / (double) var4;
                double var10 = (double) var6 / (double) var4 + 6.0D;
                int var12 = (int) Math.floor(var10 + 1.0D - 7.0D);
                int var13 = (int) Math.ceil(var10 + 7.0D);
                if (var12 < 0) {
                    var12 = 0;
                }
                if (var13 > 14) {
                    var13 = 14;
                }
                while (var12 < var13) {
                    double var14 = ((double) var12 - var10) * 3.141592653589793D;
                    double var16 = var8;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var8 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var12 - var10) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var12] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var12++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method115(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field202++;
        if (arg0 == arg7) {
            class235.method1580(arg7, arg5, -100, arg6, arg4, arg2, arg1);
            return;
        }
        if (class75.field1265 <= (arg2 - arg7) && (arg2 + arg7) <= class261.field4025 && class271.field4289 <= (arg6 - arg0) && class113.field1779 >= (arg6 + arg0)) {
            class32.method257(arg0, arg7, arg6, arg2, arg3 ^ 0x295268DD, arg4, arg5, arg1);
        } else {
            class5.method62(arg7, arg5, arg2, arg6, arg1, arg4, (byte) 100, arg0);
        }
        if (arg3 != 693266594) {
            method115(75, 42, -123, -29, -115, -30, -121, 38);
        }
    }
}
