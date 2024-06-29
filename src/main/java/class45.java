import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class45 extends class95 {

    @OriginalMember(owner = "client!hc", name = "kb", descriptor = "I")
    public int field941 = 0;

    @OriginalMember(owner = "client!hc", name = "fb", descriptor = "[[B")
    private byte[][] field936 = new byte[256][];

    @OriginalMember(owner = "client!hc", name = "hb", descriptor = "Ljava/util/Random;")
    private Random field938 = new Random();

    @OriginalMember(owner = "client!hc", name = "zb", descriptor = "Z")
    private boolean field956 = false;

    @OriginalMember(owner = "client!hc", name = "yb", descriptor = "[I")
    private int[] field955;

    @OriginalMember(owner = "client!hc", name = "ob", descriptor = "[I")
    private int[] field945;

    @OriginalMember(owner = "client!hc", name = "bb", descriptor = "[I")
    private int[] field932;

    @OriginalMember(owner = "client!hc", name = "jb", descriptor = "Llc;")
    private static class69 field940 = class69.method470((byte) -128, "gr3");

    @OriginalMember(owner = "client!hc", name = "ib", descriptor = "Llc;")
    private static class69 field939 = class69.method470((byte) -111, "red");

    @OriginalMember(owner = "client!hc", name = "eb", descriptor = "Llc;")
    private static class69 field935 = class69.method470((byte) -103, "dre");

    @OriginalMember(owner = "client!hc", name = "gb", descriptor = "Llc;")
    private static class69 field937 = class69.method470((byte) -123, "gr2");

    @OriginalMember(owner = "client!hc", name = "lb", descriptor = "Llc;")
    private static class69 field942 = class69.method470((byte) -102, "lre");

    @OriginalMember(owner = "client!hc", name = "mb", descriptor = "Llc;")
    private static class69 field943 = class69.method470((byte) -126, "yel");

    @OriginalMember(owner = "client!hc", name = "nb", descriptor = "Llc;")
    private static class69 field944 = class69.method470((byte) -121, "mag");

    @OriginalMember(owner = "client!hc", name = "pb", descriptor = "Llc;")
    private static class69 field946 = class69.method470((byte) -99, "whi");

    @OriginalMember(owner = "client!hc", name = "db", descriptor = "Llc;")
    private static class69 field934 = class69.method470((byte) -107, "dbl");

    @OriginalMember(owner = "client!hc", name = "cb", descriptor = "Llc;")
    private static class69 field933 = class69.method470((byte) -127, "str");

    @OriginalMember(owner = "client!hc", name = "sb", descriptor = "Llc;")
    private static class69 field949 = class69.method470((byte) -117, "bla");

    @OriginalMember(owner = "client!hc", name = "rb", descriptor = "Llc;")
    private static class69 field948 = class69.method470((byte) -98, "or1");

    @OriginalMember(owner = "client!hc", name = "vb", descriptor = "Llc;")
    private static class69 field952 = class69.method470((byte) -106, "gr1");

    @OriginalMember(owner = "client!hc", name = "qb", descriptor = "Llc;")
    private static class69 field947 = class69.method470((byte) -123, "or2");

    @OriginalMember(owner = "client!hc", name = "wb", descriptor = "Llc;")
    private static class69 field953 = class69.method470((byte) -114, "blu");

    @OriginalMember(owner = "client!hc", name = "xb", descriptor = "Llc;")
    private static class69 field954 = class69.method470((byte) -114, "cya");

    @OriginalMember(owner = "client!hc", name = "ub", descriptor = "Llc;")
    private static class69 field951 = class69.method470((byte) -95, "or3");

    @OriginalMember(owner = "client!hc", name = "tb", descriptor = "Llc;")
    private static class69 field950 = class69.method470((byte) -125, "gre");

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Llc;)I")
    private final int method288(class69 arg0) {
        if (arg0.method463((byte) -65, field939)) {
            return 16711680;
        } else if (arg0.method463((byte) -93, field950)) {
            return 65280;
        } else if (arg0.method463((byte) -106, field953)) {
            return 255;
        } else if (arg0.method463((byte) -61, field943)) {
            return 16776960;
        } else if (arg0.method463((byte) -110, field954)) {
            return 65535;
        } else if (arg0.method463((byte) -108, field944)) {
            return 16711935;
        } else if (arg0.method463((byte) -95, field946)) {
            return 16777215;
        } else if (arg0.method463((byte) -107, field949)) {
            return 0;
        } else if (arg0.method463((byte) -106, field942)) {
            return 16748608;
        } else if (arg0.method463((byte) -84, field935)) {
            return 8388608;
        } else if (arg0.method463((byte) -74, field934)) {
            return 128;
        } else if (arg0.method463((byte) -58, field948)) {
            return 16756736;
        } else if (arg0.method463((byte) -114, field947)) {
            return 16740352;
        } else if (arg0.method463((byte) -89, field951)) {
            return 16723968;
        } else if (arg0.method463((byte) -73, field952)) {
            return 12648192;
        } else if (arg0.method463((byte) -87, field937)) {
            return 8453888;
        } else if (arg0.method463((byte) -84, field940)) {
            return 4259584;
        } else {
            if (arg0.method463((byte) -78, field933)) {
                this.field956 = true;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Llc;III)V")
    public final void method289(class69 arg0, int arg1, int arg2, int arg3) {
        this.method291(arg0, arg1 - this.method298(arg0), arg2, arg3);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Llc;IIII)V")
    public final void method290(class69 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg1 - this.method298(arg0) / 2;
        int var7 = arg2 - this.field941;
        for (int var8 = 0; var8 < arg0.field1523; var8++) {
            int var9 = arg0.field1488[var8] & 0xFF;
            if (var9 != 32) {
                this.method294(this.field936[var9], var6, this.field955[var9] + var7 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 2.0D) * 5.0D), this.field945[var9], this.field932[var9], arg3);
            }
            var6 += this.field945[var9];
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(Llc;III)V")
    public final void method291(class69 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return;
        }
        int var5 = arg2 - this.field941;
        for (int var6 = 0; var6 < arg0.field1523; var6++) {
            int var7 = arg0.field1488[var6] & 0xFF;
            if (var7 != 32) {
                this.method294(this.field936[var7], arg1, this.field955[var7] + var5, this.field945[var7], this.field932[var7], arg3);
            }
            arg1 += this.field945[var7];
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Llc;IIIZI)V")
    public final void method292(class69 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.field938.setSeed((long) arg5);
        int var7 = (this.field938.nextInt() & 0x1F) + 192;
        int var8 = arg2 - this.field941;
        for (int var9 = 0; var9 < arg0.field1523; var9++) {
            if (arg0.field1488[var9] == 64 && var9 + 4 < arg0.field1523 && arg0.field1488[var9 + 4] == 64) {
                int var10 = this.method288(arg0.method477(63, var9 + 4, var9 + 1));
                if (var10 != -1) {
                    arg3 = var10;
                }
                var9 += 4;
            } else {
                int var11 = arg0.field1488[var9] & 0xFF;
                if (var11 != 32) {
                    if (arg4) {
                        this.method293(this.field936[var11], arg1 + 1, this.field955[var11] + var8 + 1, this.field945[var11], this.field932[var11], 0, 192);
                    }
                    this.method293(this.field936[var11], arg1, this.field955[var11] + var8, this.field945[var11], this.field932[var11], arg3, var7);
                }
                arg1 += this.field945[var11];
                if ((this.field938.nextInt() & 0x3) == 0) {
                    arg1++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "([BIIIIII)V")
    private final void method293(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class95.field2117 * arg2 + arg1;
        int var9 = class95.field2117 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class95.field2114) {
            int var12 = class95.field2114 - arg2;
            arg4 -= var12;
            arg2 = class95.field2114;
            var11 += arg3 * var12;
            var8 += class95.field2117 * var12;
        }
        if (arg2 + arg4 > class95.field2116) {
            arg4 -= arg2 + arg4 - class95.field2116;
        }
        if (arg1 < class95.field2118) {
            int var13 = class95.field2118 - arg1;
            arg3 -= var13;
            arg1 = class95.field2118;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class95.field2120) {
            int var14 = arg1 + arg3 - class95.field2120;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method303(class95.field2115, arg0, arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "([BIIIII)V")
    private final void method294(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class95.field2117 * arg2 + arg1;
        int var8 = class95.field2117 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class95.field2114) {
            int var11 = class95.field2114 - arg2;
            arg4 -= var11;
            arg2 = class95.field2114;
            var10 += arg3 * var11;
            var7 += class95.field2117 * var11;
        }
        if (arg2 + arg4 > class95.field2116) {
            arg4 -= arg2 + arg4 - class95.field2116;
        }
        if (arg1 < class95.field2118) {
            int var12 = class95.field2118 - arg1;
            arg3 -= var12;
            arg1 = class95.field2118;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class95.field2120) {
            int var13 = arg1 + arg3 - class95.field2120;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method295(class95.field2115, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "([I[BIIIIIII)V")
    private final void method295(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = -(arg5 >> 2);
        int var11 = -(arg5 & 0x3);
        for (int var12 = -arg6; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
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
            for (int var14 = var11; var14 < 0; var14++) {
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

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Llc;IIIZ)V")
    public final void method296(class69 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field956 = false;
        int var6 = arg1;
        if (arg0 == null) {
            return;
        }
        int var7 = arg2 - this.field941;
        for (int var8 = 0; var8 < arg0.field1523; var8++) {
            if (arg0.field1488[var8] == 64 && var8 + 4 < arg0.field1523 && arg0.field1488[var8 + 4] == 64) {
                int var9 = this.method288(arg0.method477(63, var8 + 4, var8 + 1));
                if (var9 != -1) {
                    arg3 = var9;
                }
                var8 += 4;
            } else {
                int var10 = arg0.field1488[var8] & 0xFF;
                if (var10 != 32) {
                    if (arg4) {
                        this.method294(this.field936[var10], arg1 + 1, this.field955[var10] + var7 + 1, this.field945[var10], this.field932[var10], 0);
                    }
                    this.method294(this.field936[var10], arg1, this.field955[var10] + var7, this.field945[var10], this.field932[var10], arg3);
                }
                arg1 += this.field945[var10];
            }
        }
        if (this.field956) {
            class95.method725(var6, (int) ((double) this.field941 * 0.7D) + var7, arg1 - var6, 8388608);
        }
    }

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "()V")
    public static void method297() {
        field939 = null;
        field950 = null;
        field953 = null;
        field943 = null;
        field954 = null;
        field944 = null;
        field946 = null;
        field949 = null;
        field942 = null;
        field935 = null;
        field934 = null;
        field948 = null;
        field947 = null;
        field951 = null;
        field952 = null;
        field937 = null;
        field940 = null;
        field933 = null;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(Llc;)I")
    public final int method298(class69 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field1523; var3++) {
            var2 += this.field945[arg0.field1488[var3] & 0xFF];
        }
        return var2;
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(Llc;III)V")
    public final void method299(class69 arg0, int arg1, int arg2, int arg3) {
        this.method291(arg0, arg1 - this.method298(arg0) / 2, arg2, arg3);
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(Llc;IIII)V")
    public final void method300(class69 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg1 - this.method298(arg0) / 2;
        int var7 = arg2 - this.field941;
        for (int var8 = 0; var8 < arg0.method487((byte) -85); var8++) {
            int var9 = arg0.field1488[var8] & 0xFF;
            if (var9 != 32) {
                this.method294(this.field936[var9], var6 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 5.0D) * 5.0D), this.field955[var9] + var7 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 3.0D) * 5.0D), this.field945[var9], this.field932[var9], arg3);
            }
            var6 += this.field945[var9];
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(Llc;IIIZ)V")
    public final void method301(class69 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.method296(arg0, arg1 - this.method304(arg0) / 2, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Llc;IIIII)V")
    public final void method302(class69 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        double var7 = 7.0D - (double) arg5 / 8.0D;
        if (var7 < 0.0D) {
            var7 = 0.0D;
        }
        int var9 = arg1 - this.method298(arg0) / 2;
        int var10 = arg2 - this.field941;
        for (int var11 = 0; var11 < arg0.method487((byte) -121); var11++) {
            int var12 = arg0.field1488[var11] & 0xFF;
            if (var12 != 32) {
                this.method294(this.field936[var12], var9, this.field955[var12] + var10 + (int) (Math.sin((double) var11 / 1.5D + (double) arg4) * var7), this.field945[var12], this.field932[var12], arg3);
            }
            var9 += this.field945[var12];
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "([I[BIIIIIIII)V")
    private final void method303(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var11 = ((arg2 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg9 & 0xFF0000) >> 8;
        int var12 = 256 - arg9;
        for (int var13 = -arg6; var13 < 0; var13++) {
            for (int var14 = -arg5; var14 < 0; var14++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    int var15 = arg0[arg4];
                    arg0[arg4++] = (((var15 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * var12 & 0xFF0000) >> 8) + var11;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(Llc;)I")
    public final int method304(class69 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field1523; var3++) {
            if (arg0.field1488[var3] == 64 && var3 + 4 < arg0.field1523 && arg0.field1488[var3 + 4] == 64) {
                var3 += 4;
            } else {
                var2 += this.field945[arg0.field1488[var3] & 0xFF];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "([I[I[I[I[[B)V")
    public class45(int[] arg0, int[] arg1, int[] arg2, int[] arg3, byte[][] arg4) {
        this.field955 = arg0;
        this.field945 = arg1;
        this.field932 = arg2;
        byte var6 = 0;
        for (int var7 = 1; var7 < arg3.length; var7++) {
            if (arg3[var7] == 1) {
                var6 = (byte) var7;
            }
        }
        this.field936 = arg4;
        for (int var8 = 0; var8 < 256; var8++) {
            byte[] var9 = this.field936[var8];
            int var10 = var9.length;
            for (int var11 = 0; var11 < var10; var11++) {
                var9[var11] = (byte) (var9[var11] == var6 ? 0 : 1);
            }
        }
        this.field941 = this.field955[32] + this.field932[32];
    }
}
