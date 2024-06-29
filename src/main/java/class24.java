import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ma")
public class class24 extends class15 {

    @OriginalMember(owner = "mapview!ma", name = "M", descriptor = "I")
    private int field245 = 0;

    @OriginalMember(owner = "mapview!ma", name = "S", descriptor = "[[B")
    private byte[][] field251 = new byte[256][];

    @OriginalMember(owner = "mapview!ma", name = "Z", descriptor = "[I")
    private int[] field258;

    @OriginalMember(owner = "mapview!ma", name = "ab", descriptor = "[I")
    private int[] field259;

    @OriginalMember(owner = "mapview!ma", name = "O", descriptor = "[I")
    private int[] field247;

    @OriginalMember(owner = "mapview!ma", name = "L", descriptor = "Lna;")
    private static class26 field244 = class6.method40("gr1", 48);

    @OriginalMember(owner = "mapview!ma", name = "N", descriptor = "Lna;")
    private static class26 field246 = class6.method40("whi", 48);

    @OriginalMember(owner = "mapview!ma", name = "U", descriptor = "Lna;")
    private static class26 field253 = class6.method40("or1", 48);

    @OriginalMember(owner = "mapview!ma", name = "V", descriptor = "Lna;")
    private static class26 field254 = class6.method40("gr2", 48);

    @OriginalMember(owner = "mapview!ma", name = "X", descriptor = "Lna;")
    private static class26 field256 = class6.method40("yel", 48);

    @OriginalMember(owner = "mapview!ma", name = "Q", descriptor = "Lna;")
    private static class26 field249 = class6.method40("blu", 48);

    @OriginalMember(owner = "mapview!ma", name = "bb", descriptor = "Lna;")
    private static class26 field260 = class6.method40("or3", 48);

    @OriginalMember(owner = "mapview!ma", name = "W", descriptor = "Lna;")
    private static class26 field255 = class6.method40("red", 48);

    @OriginalMember(owner = "mapview!ma", name = "cb", descriptor = "Lna;")
    private static class26 field261 = class6.method40("bla", 48);

    @OriginalMember(owner = "mapview!ma", name = "Y", descriptor = "Lna;")
    private static class26 field257 = class6.method40("lre", 48);

    @OriginalMember(owner = "mapview!ma", name = "eb", descriptor = "Lna;")
    private static class26 field263 = class6.method40("dre", 48);

    @OriginalMember(owner = "mapview!ma", name = "R", descriptor = "Lna;")
    private static class26 field250 = class6.method40("cya", 48);

    @OriginalMember(owner = "mapview!ma", name = "gb", descriptor = "Lna;")
    private static class26 field265 = class6.method40("gre", 48);

    @OriginalMember(owner = "mapview!ma", name = "fb", descriptor = "Lna;")
    private static class26 field264 = class6.method40("str", 48);

    @OriginalMember(owner = "mapview!ma", name = "P", descriptor = "Lna;")
    private static class26 field248 = class6.method40("mag", 48);

    @OriginalMember(owner = "mapview!ma", name = "T", descriptor = "Lna;")
    private static class26 field252 = class6.method40("or2", 48);

    @OriginalMember(owner = "mapview!ma", name = "db", descriptor = "Z")
    private static boolean field262 = false;

    @OriginalMember(owner = "mapview!ma", name = "hb", descriptor = "Lna;")
    private static class26 field266 = class6.method40("gr3", 48);

    @OriginalMember(owner = "mapview!ma", name = "ib", descriptor = "Lna;")
    private static class26 field267 = class6.method40("dbl", 48);

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(Lna;III)V", line = 3)
    public final void method137(class26 arg0, int arg1, int arg2, int arg3) {
        this.method144(arg0, arg1 - this.method138(arg0) / 2, arg2, arg3);
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(Lna;)I", line = 34)
    public final int method138(class26 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field375; var3++) {
            var2 += this.field259[arg0.field371[var3] & 0xFF];
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!ma", name = "b", descriptor = "(Lna;III)V", line = 54)
    public final void method139(class26 arg0, int arg1, int arg2, int arg3) {
        this.method144(arg0, arg1 - this.method138(arg0), arg2, arg3);
    }

    @OriginalMember(owner = "mapview!ma", name = "<init>", descriptor = "([I[I[I[I[[B)V", line = 403)
    public class24(int[] arg0, int[] arg1, int[] arg2, int[] arg3, byte[][] arg4) {
        new Random();
        this.field258 = arg0;
        this.field259 = arg1;
        this.field247 = arg2;
        byte var6 = 0;
        for (int var7 = 1; var7 < arg3.length; var7++) {
            if (arg3[var7] == 1) {
                var6 = (byte) var7;
            }
        }
        this.field251 = arg4;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field258[var10] < var8 && this.field247[var10] != 0) {
                var8 = this.field258[var10];
            }
            if (this.field258[var10] + this.field247[var10] > var9) {
                var9 = this.field258[var10] + this.field247[var10];
            }
            byte[] var11 = this.field251[var10];
            int var12 = var11.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11[var13] = (byte) (var11[var13] == var6 ? 0 : 1);
            }
        }
        this.field245 = this.field258[32] + this.field247[32];
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "([BIIIII)V", line = 89)
    private static final void method140(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = class15.field175 * arg2 + arg1;
        int var7 = class15.field175 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < class15.field173) {
            int var10 = class15.field173 - arg2;
            arg4 -= var10;
            arg2 = class15.field173;
            var9 += arg3 * var10;
            var6 += class15.field175 * var10;
        }
        if (arg2 + arg4 > class15.field171) {
            arg4 -= arg2 + arg4 - class15.field171;
        }
        if (arg1 < class15.field174) {
            int var11 = class15.field174 - arg1;
            arg3 -= var11;
            arg1 = class15.field174;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > class15.field176) {
            int var12 = arg1 + arg3 - class15.field176;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method141(class15.field172, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "([I[BIIIIIII)V", line = 159)
    private static final void method141(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        for (int var11 = -arg6; var11 < 0; var11++) {
            for (int var12 = var9; var12 < 0; var12++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
            }
            for (int var13 = var10; var13 < 0; var13++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "b", descriptor = "(Lna;)I", line = 236)
    private final int method142(class26 arg0) {
        if (arg0.method179((byte) -17, field255)) {
            return 16711680;
        } else if (arg0.method179((byte) -17, field265)) {
            return 65280;
        } else if (arg0.method179((byte) -17, field249)) {
            return 255;
        } else if (arg0.method179((byte) -17, field256)) {
            return 16776960;
        } else if (arg0.method179((byte) -17, field250)) {
            return 65535;
        } else if (arg0.method179((byte) -17, field248)) {
            return 16711935;
        } else if (arg0.method179((byte) -17, field246)) {
            return 16777215;
        } else if (arg0.method179((byte) -17, field261)) {
            return 0;
        } else if (arg0.method179((byte) -17, field257)) {
            return 16748608;
        } else if (arg0.method179((byte) -17, field263)) {
            return 8388608;
        } else if (arg0.method179((byte) -17, field267)) {
            return 128;
        } else if (arg0.method179((byte) -17, field253)) {
            return 16756736;
        } else if (arg0.method179((byte) -17, field252)) {
            return 16740352;
        } else if (arg0.method179((byte) -17, field260)) {
            return 16723968;
        } else if (arg0.method179((byte) -17, field244)) {
            return 12648192;
        } else if (arg0.method179((byte) -17, field254)) {
            return 8453888;
        } else if (arg0.method179((byte) -17, field266)) {
            return 4259584;
        } else {
            if (arg0.method179((byte) -17, field264)) {
                field262 = true;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(Lna;IIIZ)V", line = 303)
    public final void method143(class26 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field262 = false;
        int var6 = arg1;
        if (arg0 == null) {
            return;
        }
        int var7 = arg2 - this.field245;
        for (int var8 = 0; var8 < arg0.field375; var8++) {
            if (arg0.field371[var8] == 64 && var8 + 4 < arg0.field375 && arg0.field371[var8 + 4] == 64) {
                int var9 = this.method142(arg0.method184((byte) 89, var8 + 1, var8 + 4));
                if (var9 != -1) {
                    arg3 = var9;
                }
                var8 += 4;
            } else {
                int var10 = arg0.field371[var8] & 0xFF;
                if (var10 != 32) {
                    if (arg4) {
                        method140(this.field251[var10], arg1 + 1, this.field258[var10] + var7 + 1, this.field259[var10], this.field247[var10], 0);
                    }
                    method140(this.field251[var10], arg1, this.field258[var10] + var7, this.field259[var10], this.field247[var10], arg3);
                }
                arg1 += this.field259[var10];
            }
        }
        if (field262) {
            class15.method98(var6, (int) ((double) this.field245 * 0.7D) + var7, arg1 - var6, 8388608);
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "c", descriptor = "(Lna;III)V", line = 351)
    public final void method144(class26 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return;
        }
        int var5 = arg2 - this.field245;
        for (int var6 = 0; var6 < arg0.field375; var6++) {
            int var7 = arg0.field371[var6] & 0xFF;
            if (var7 != 32) {
                method140(this.field251[var7], arg1, this.field258[var7] + var5, this.field259[var7], this.field247[var7], arg3);
            }
            arg1 += this.field259[var7];
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "c", descriptor = "()V", line = 372)
    public static void method145() {
        field264 = null;
        field255 = null;
        field265 = null;
        field249 = null;
        field256 = null;
        field250 = null;
        field248 = null;
        field246 = null;
        field261 = null;
        field257 = null;
        field263 = null;
        field267 = null;
        field253 = null;
        field252 = null;
        field260 = null;
        field244 = null;
        field254 = null;
        field266 = null;
    }
}
