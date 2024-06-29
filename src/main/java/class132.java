import jaggl.OpenGL;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class132 {

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "Z")
    private boolean field2162 = true;

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "I")
    private int field2170 = -1;

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "I")
    private int field2169;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    private int field2155;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    private int field2159;

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "I")
    private int field2168;

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "[Llc;")
    private class600[] field2164;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "[Llc;")
    private class600[] field2153;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "Llc;")
    private class600 field2163;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
    public static int field2156 = 0;

    @OriginalMember(owner = "client!pj", name = "v", descriptor = "[I")
    public static int[] field2174 = new int[4096];

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "I")
    private int field2161;

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!pj", name = "s", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!pj", name = "t", descriptor = "I")
    private int field2172;

    @OriginalMember(owner = "client!pj", name = "u", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "Lf;")
    private class702 field2165;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "Lri;")
    public static class97 field2157;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lr;IB)Z", line = 4)
    public final boolean method1144(class167 arg0, int arg1, byte arg2) {
        field2173++;
        if (this.field2170 != arg1) {
            this.field2170 = arg1;
            int var4 = class638.method3708(false, arg1);
            if (var4 > 512) {
                var4 = 512;
            }
            if (var4 <= 0) {
                var4 = 1;
            }
            if (this.field2161 != var4) {
                this.field2165 = null;
                this.field2161 = var4;
            }
            if (this.field2164 != null) {
                this.field2172 = 0;
                int[] var5 = new int[this.field2164.length];
                for (int var6 = 0; var6 < this.field2164.length; var6++) {
                    class600 var7 = this.field2164[var6];
                    if (var7.method3502(this.field2155, this.field2169, this.field2168, this.field2170)) {
                        var5[this.field2172] = var7.field8543;
                        this.field2153[this.field2172++] = var7;
                    }
                }
                class224.method1650((byte) 75, this.field2172 - 1, this.field2153, 0, var5);
            }
            this.field2162 = true;
        }
        boolean var8 = false;
        if (this.field2162) {
            this.field2162 = false;
            for (int var9 = this.field2172 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field2153[var9].method3504(arg0, this.field2163);
                var8 |= var10;
                this.field2162 |= !var10;
            }
        }
        if (arg2 != 80) {
            this.field2161 = 16;
        }
        return var8;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILbea;[Ldg;)Lmd;", line = 85)
    public static final class504 method1145(int arg0, class205 arg1, class379[] arg2) {
        if (arg0 > -64) {
            field2174 = null;
        }
        field2160++;
        for (int var3 = 0; var3 < arg2.length; var3++) {
            if (arg2[var3] == null || arg2[var3].field5909 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; var6 < arg2.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg2[var6].field5909);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class340.field5506, 0);
        if (class340.field5506[0] == 0) {
            if (class340.field5506[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class340.field5506, 1);
            if (class340.field5506[1] > 1) {
                byte[] var7 = new byte[class340.field5506[1]];
                OpenGL.glGetInfoLogARB(var4, class340.field5506[1], class340.field5506, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class340.field5506[0] == 0) {
                for (int var8 = 0; var8 < arg2.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg2[var8].field5909);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class504(arg1, var4, arg2);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V", line = 156)
    public static void method1146(int arg0) {
        if (arg0 == 16903) {
            field2174 = null;
            field2157 = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IBILr;IIIIII)V", line = 168)
    public final void method1147(int arg0, byte arg1, int arg2, class167 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var11 = arg5 + arg6 & 0x3FFF;
        field2158++;
        if (this.field2159 == -1 || this.field2161 == 0) {
            arg3.method335(arg9, arg4, arg8, arg7, arg0, 0);
        } else {
            class258 var12 = class27.field425.method1610(18904, this.field2159);
            if (this.field2165 == null && class27.field425.method1608(-20340, this.field2159)) {
                int[] var13 = var12.field4119 ? class27.field425.method1609(0.7F, false, this.field2159, (byte) -65, this.field2161, this.field2161) : class27.field425.method1607(this.field2161, this.field2159, -20490, false, this.field2161, 0.7F);
                this.field2165 = arg3.method306(var13, 0, this.field2161, this.field2161, this.field2161);
            }
            if (var12.field4119) {
                arg3.method335(arg9, arg4, arg8, arg7, arg0, 0);
            }
            if (this.field2165 != null) {
                int var14 = var12.field4119 ? 1 : 0;
                int var15 = arg2 * arg7 / -4096;
                int var16;
                for (var16 = arg7 * var11 / 4096 + (arg8 - arg7) / 2; var16 > arg7; var16 -= arg7) {
                }
                while (var16 < 0) {
                    var16 += arg7;
                }
                while (var15 > arg7) {
                    var15 -= arg7;
                }
                while (var15 < 0) {
                    var15 += arg7;
                }
                for (int var17 = var16 - arg7; var17 < arg8; var17 += arg7) {
                    for (int var18 = var15 - arg7; var18 < arg7; var18 += arg7) {
                        this.field2165.method3954(arg9 + var17, arg4 + var18, arg7, arg7, 1, 0, var14);
                    }
                }
            }
        }
        if (arg1 >= -64) {
            method1149(33, '\b');
        }
        for (int var19 = this.field2172 - 1; var19 >= 0; var19--) {
            this.field2153[var19].method3508(arg3, arg9, arg4, arg8, arg7, arg2, var11);
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)V", line = 246)
    public final void method1148(int arg0) {
        if (this.field2164 != null) {
            for (int var2 = 0; var2 < this.field2164.length; var2++) {
                this.field2164[var2].method3505();
            }
        }
        field2154++;
        this.field2165 = null;
        if (arg0 != 0) {
            this.field2172 = -18;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IC)B", line = 270)
    public static final byte method1149(int arg0, char arg1) {
        field2167++;
        if (arg0 != -256) {
            field2157 = null;
        }
        byte var2;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            var2 = (byte) arg1;
        } else if (arg1 == '€') {
            var2 = -128;
        } else if (arg1 == '‚') {
            var2 = -126;
        } else if (arg1 == 'ƒ') {
            var2 = -125;
        } else if (arg1 == '„') {
            var2 = -124;
        } else if (arg1 == '…') {
            var2 = -123;
        } else if (arg1 == '†') {
            var2 = -122;
        } else if (arg1 == '‡') {
            var2 = -121;
        } else if (arg1 == 'ˆ') {
            var2 = -120;
        } else if (arg1 == '‰') {
            var2 = -119;
        } else if (arg1 == 'Š') {
            var2 = -118;
        } else if (arg1 == '‹') {
            var2 = -117;
        } else if (arg1 == 'Œ') {
            var2 = -116;
        } else if (arg1 == 'Ž') {
            var2 = -114;
        } else if (arg1 == '‘') {
            var2 = -111;
        } else if (arg1 == '’') {
            var2 = -110;
        } else if (arg1 == '“') {
            var2 = -109;
        } else if (arg1 == '”') {
            var2 = -108;
        } else if (arg1 == '•') {
            var2 = -107;
        } else if (arg1 == '–') {
            var2 = -106;
        } else if (arg1 == '—') {
            var2 = -105;
        } else if (arg1 == '˜') {
            var2 = -104;
        } else if (arg1 == '™') {
            var2 = -103;
        } else if (arg1 == 'š') {
            var2 = -102;
        } else if (arg1 == '›') {
            var2 = -101;
        } else if (arg1 == 'œ') {
            var2 = -100;
        } else if (arg1 == 'ž') {
            var2 = -98;
        } else if (arg1 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        return var2;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZI)I", line = 401)
    public static final int method1150(boolean arg0, int arg1) {
        field2166++;
        double var2 = (double) ((arg1 & 0xFF1651) >> 16) / 256.0D;
        double var4 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var2 > var4) {
            var8 = var4;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var10 = var2;
        if (var2 < var4) {
            var10 = var4;
        }
        if (arg0) {
            method1149(63, (char) 65417);
        }
        if (var10 < var6) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        int var22 = (int) (var16 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var21 >>= 0x4;
        } else if (var22 > 217) {
            var21 >>= 0x3;
        } else if (var22 > 192) {
            var21 >>= 0x2;
        } else if (var22 > 179) {
            var21 >>= 0x1;
        }
        return (var21 >> 5 << 7) + ((var20 >> 2 & 0x3F) << 10) + (var22 >> 1);
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(I[Llc;IIII)V", line = 558)
    public class132(int arg0, class600[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2169 = arg4;
        this.field2155 = arg3;
        this.field2159 = arg0;
        this.field2168 = arg5;
        this.field2164 = arg1;
        if (arg1 == null) {
            this.field2153 = null;
            this.field2163 = null;
        } else {
            this.field2153 = new class600[arg1.length];
            this.field2163 = arg2 < 0 ? null : arg1[arg2];
        }
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(I)V", line = 515)
    public static final void method1151(int arg0) throws IOException {
        if (arg0 != 0) {
            return;
        }
        if (class499.field7329 != null && class154.field2629 > 0) {
            int var1 = 0;
            while (true) {
                class165 var2 = (class165) class500.field7340.method3465((byte) 118);
                if (var2 == null) {
                    class159.field2722 = 0;
                    class71.field899 += var1;
                    break;
                }
                class499.field7329.method592(var2.field2776.field96, var2.field2767, arg0 + 8, 0);
                class154.field2629 -= var2.field2767;
                var1 += var2.field2767;
                var2.method707((byte) -41);
                var2.field2776.method74((byte) -95);
                var2.method1337(~arg0);
            }
        }
        field2171++;
    }
}
