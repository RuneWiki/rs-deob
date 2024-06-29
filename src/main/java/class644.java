import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class644 extends RuntimeException {

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "Ljava/lang/String;")
    public String field8567;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "Ljava/lang/Throwable;")
    public Throwable field8565;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public static int field8564 = 500;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public static int field8563;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public static int field8566;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIII[B)V", line = 3)
    public static final void method3530(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6) {
        field8566++;
        if (arg3 > 0 && !class538.method2993(arg3, -31218)) {
            throw new IllegalArgumentException("");
        }
        if (arg0 != -23712) {
            field8564 = -98;
        }
        if (arg1 > 0 && !class538.method2993(arg1, arg0 - 7506)) {
            throw new IllegalArgumentException("");
        }
        int var7 = class131.method1023(arg5, (byte) -92);
        int var8 = 0;
        int var9 = arg1 <= arg3 ? arg1 : arg3;
        int var10 = arg3 >> 1;
        int var11 = arg1 >> 1;
        byte[] var12 = arg6;
        byte[] var13 = new byte[var7 * var10 * var11];
        while (true) {
            OpenGL.glTexImage2Dub(arg4, var8, arg2, arg3, arg1, 0, arg5, 5121, var12, 0);
            if (var9 <= 1) {
                return;
            }
            int var14 = arg3 * var7;
            for (int var15 = 0; var15 < var7; var15++) {
                int var17 = var15;
                int var18 = var15;
                int var19 = var14 + var15;
                for (int var20 = 0; var20 < var11; var20++) {
                    for (int var21 = 0; var21 < var10; var21++) {
                        byte var22 = var12[var18];
                        int var23 = var7 + var18;
                        int var24 = var12[var23] + var22;
                        var18 = var7 + var23;
                        int var25 = var12[var19] + var24;
                        int var26 = var7 + var19;
                        int var27 = var12[var26] + var25;
                        var19 = var7 + var26;
                        var13[var17] = (byte) (var27 >> 2);
                        var17 += var7;
                    }
                    var18 += var14;
                    var19 += var14;
                }
            }
            byte[] var16 = var13;
            var13 = var12;
            arg1 = var11;
            var12 = var16;
            arg3 = var10;
            var8++;
            var9 >>= 0x1;
            var11 >>= 0x1;
            var10 >>= 0x1;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I[BILjava/lang/String;II)I", line = 101)
    public static final int method3531(int arg0, byte[] arg1, int arg2, String arg3, int arg4, int arg5) {
        field8563++;
        int var6 = arg4 - arg0;
        for (int var7 = 0; var7 < var6; var7++) {
            char var9 = arg3.charAt(arg0 + var7);
            if (var9 > '\u0000' && var9 < '\u0080' || var9 >= ' ' && var9 <= 'ÿ') {
                arg1[arg5 + var7] = (byte) var9;
            } else if (var9 == '€') {
                arg1[arg5 + var7] = -128;
            } else if (var9 == '‚') {
                arg1[arg5 + var7] = -126;
            } else if (var9 == 'ƒ') {
                arg1[arg5 + var7] = -125;
            } else if (var9 == '„') {
                arg1[arg5 + var7] = -124;
            } else if (var9 == '…') {
                arg1[arg5 + var7] = -123;
            } else if (var9 == '†') {
                arg1[arg5 + var7] = -122;
            } else if (var9 == '‡') {
                arg1[arg5 + var7] = -121;
            } else if (var9 == 'ˆ') {
                arg1[arg5 + var7] = -120;
            } else if (var9 == '‰') {
                arg1[arg5 + var7] = -119;
            } else if (var9 == 'Š') {
                arg1[arg5 + var7] = -118;
            } else if (var9 == '‹') {
                arg1[arg5 + var7] = -117;
            } else if (var9 == 'Œ') {
                arg1[arg5 + var7] = -116;
            } else if (var9 == 'Ž') {
                arg1[arg5 + var7] = -114;
            } else if (var9 == '‘') {
                arg1[arg5 + var7] = -111;
            } else if (var9 == '’') {
                arg1[arg5 + var7] = -110;
            } else if (var9 == '“') {
                arg1[arg5 + var7] = -109;
            } else if (var9 == '”') {
                arg1[arg5 + var7] = -108;
            } else if (var9 == '•') {
                arg1[arg5 + var7] = -107;
            } else if (var9 == '–') {
                arg1[arg5 + var7] = -106;
            } else if (var9 == '—') {
                arg1[arg5 + var7] = -105;
            } else if (var9 == '˜') {
                arg1[arg5 + var7] = -104;
            } else if (var9 == '™') {
                arg1[arg5 + var7] = -103;
            } else if (var9 == 'š') {
                arg1[arg5 + var7] = -102;
            } else if (var9 == '›') {
                arg1[arg5 + var7] = -101;
            } else if (var9 == 'œ') {
                arg1[arg5 + var7] = -100;
            } else if (var9 == 'ž') {
                arg1[arg5 + var7] = -98;
            } else if (var9 == 'Ÿ') {
                arg1[arg5 + var7] = -97;
            } else {
                arg1[arg5 + var7] = 63;
            }
        }
        int var8 = -19 / ((arg2 - 20) / 63);
        return var6;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 243)
    public class644(Throwable arg0, String arg1) {
        this.field8567 = arg1;
        this.field8565 = arg0;
    }
}
