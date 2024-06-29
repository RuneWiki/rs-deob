import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public class class350 {

    @OriginalMember(owner = "client!pba", name = "k", descriptor = "I")
    private int field5402 = 0;

    @OriginalMember(owner = "client!pba", name = "d", descriptor = "Z")
    public boolean field5398 = true;

    @OriginalMember(owner = "client!pba", name = "p", descriptor = "I")
    public int field5401 = 512;

    @OriginalMember(owner = "client!pba", name = "g", descriptor = "Z")
    public boolean field5411 = true;

    @OriginalMember(owner = "client!pba", name = "o", descriptor = "I")
    public int field5412 = -1;

    @OriginalMember(owner = "client!pba", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5414 = new String[] { method2881(method2880("o\t%#")), method2881(method2880("zRgaD")), method2881(method2880("q\u001e(a|)")), method2881(method2880("q\u001e(a{)")), method2881(method2880("q\u001e(a~)")), method2881(method2880("q\u001e(aq)")), method2881(method2880("q\u001e(ax)")), method2881(method2880("q\u001e(a})")), method2881(method2880("q\u001e(az)")), method2881(method2880("q\u001e(a\u007f)")) };

    @OriginalMember(owner = "client!pba", name = "i", descriptor = "I")
    public static int field5397;

    @OriginalMember(owner = "client!pba", name = "n", descriptor = "I")
    public static int field5399;

    @OriginalMember(owner = "client!pba", name = "q", descriptor = "I")
    public static int field5400;

    @OriginalMember(owner = "client!pba", name = "e", descriptor = "I")
    public static int field5403;

    @OriginalMember(owner = "client!pba", name = "j", descriptor = "I")
    public static int field5404;

    @OriginalMember(owner = "client!pba", name = "f", descriptor = "I")
    public int field5405;

    @OriginalMember(owner = "client!pba", name = "c", descriptor = "I")
    public int field5406;

    @OriginalMember(owner = "client!pba", name = "l", descriptor = "I")
    public static int field5407;

    @OriginalMember(owner = "client!pba", name = "m", descriptor = "I")
    public int field5408;

    @OriginalMember(owner = "client!pba", name = "b", descriptor = "I")
    public int field5409;

    @OriginalMember(owner = "client!pba", name = "h", descriptor = "I")
    public static int field5410;

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "I")
    public static int field5413;

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(ILib;)V")
    public final void method2872(int arg0, class163 arg1) {
        try {
            field5403++;
            while (true) {
                int var3 = arg1.method1455((byte) 62);
                if (var3 == 0) {
                    if (arg0 == 0) {
                        return;
                    } else {
                        this.field5398 = false;
                        return;
                    }
                }
                this.method2875(var3, 6, arg1);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field5414[2] + arg0 + ',' + (arg1 == null ? field5414[0] : field5414[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(IIIBII)V")
    public static final void method2873(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        try {
            if (arg5 >= class200.field3119 && class676.field9797 >= arg1 && arg2 >= class676.field9807 && class381.field5786 >= arg4) {
                class753.method5471(arg0, arg5, 1024, arg1, arg4, arg2);
            } else {
                class680.method4983(arg4, arg5, arg1, true, arg0, arg2);
            }
            if (arg3 == 111) {
                field5399++;
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field5414[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(BI)V")
    private final void method2874(byte arg0, int arg1) {
        try {
            field5404++;
            double var3 = (double) ((arg1 & 0xFFE3CC) >> 16) / 256.0D;
            double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
            double var7 = (double) (arg1 & 0xFF) / 256.0D;
            double var9 = var3;
            if (var3 > var5) {
                var9 = var5;
            }
            if (var7 < var9) {
                var9 = var7;
            }
            double var11 = var3;
            if (var5 > var3) {
                var11 = var5;
            }
            if (var11 < var7) {
                var11 = var7;
            }
            double var13 = 0.0D;
            double var15 = 0.0D;
            double var17 = (var9 + var11) / 2.0D;
            if (var9 != var11) {
                if (var17 < 0.5D) {
                    var15 = (var11 - var9) / (var9 + var11);
                }
                if (var3 == var11) {
                    var13 = (var5 - var7) / (var11 - var9);
                } else if (var5 == var11) {
                    var13 = (var7 - var3) / (var11 - var9) + 2.0D;
                } else if (var7 == var11) {
                    var13 = (var3 - var5) / (var11 - var9) + 4.0D;
                }
                if (var17 >= 0.5D) {
                    var15 = (var11 - var9) / (2.0D - var11 - var9);
                }
            }
            this.field5409 = (int) (var15 * 256.0D);
            this.field5405 = (int) (var17 * 256.0D);
            double var19 = var13 / 6.0D;
            if (this.field5409 < 0) {
                this.field5409 = 0;
            } else if (this.field5409 > 255) {
                this.field5409 = 255;
            }
            if (var17 > 0.5D) {
                this.field5406 = (int) ((1.0D - var17) * var15 * 512.0D);
            } else {
                this.field5406 = (int) (var15 * var17 * 512.0D);
            }
            if (this.field5405 < 0) {
                this.field5405 = 0;
            } else if (this.field5405 > 255) {
                this.field5405 = 255;
            }
            int var21 = -69 / ((arg0 - 73) / 38);
            if (this.field5406 < 1) {
                this.field5406 = 1;
            }
            this.field5408 = (int) ((double) this.field5406 * var19);
        } catch (RuntimeException var23) {
            throw class759.method5498(var23, field5414[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(IILib;)V")
    private final void method2875(int arg0, int arg1, class163 arg2) {
        try {
            if (arg0 == 1) {
                this.field5402 = arg2.method1436((byte) 60);
                this.method2874((byte) -68, this.field5402);
            } else if (arg0 == 2) {
                this.field5412 = arg2.method1445((byte) 124);
                if (this.field5412 == 65535) {
                    this.field5412 = -1;
                }
            } else if (arg0 == 3) {
                this.field5401 = arg2.method1445((byte) 125) << 2;
            } else if (arg0 == 4) {
                this.field5411 = false;
            } else if (arg0 == 5) {
                this.field5398 = false;
            }
            field5410++;
            int var4 = -15 % ((-arg1 - 44) / 39);
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field5414[8] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field5414[0] : field5414[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(IILla;)Llq;")
    public static final class578 method2876(int arg0, int arg1, class476 arg2) {
        try {
            field5397++;
            if (arg0 == 7) {
                byte[] var3 = arg2.method3638(-37, arg1);
                return var3 == null ? null : new class578(var3);
            } else {
                return null;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field5414[3] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field5414[0] : field5414[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(ZIIIFFFI)[F")
    public static final float[] method2877(boolean arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6, int arg7) {
        try {
            field5400++;
            float[] var8 = new float[9];
            float[] var9 = new float[9];
            float var10 = (float) Math.cos((double) ((float) arg7 * 0.024543693F));
            float var11 = (float) Math.sin((double) ((float) arg7 * 0.024543693F));
            if (arg0) {
                method2879((byte) 72, 68, -24);
            }
            var8[8] = var10;
            var8[7] = 0.0F;
            float var12 = 1.0F - var10;
            var8[0] = var10;
            var8[1] = 0.0F;
            var8[2] = var11;
            var8[5] = 0.0F;
            var8[3] = 0.0F;
            var8[4] = 1.0F;
            var8[6] = -var11;
            float[] var13 = new float[9];
            float var14 = 1.0F;
            float var15 = 0.0F;
            float var16 = (float) arg1 / 32767.0F;
            float var17 = -((float) Math.sqrt((double) (1.0F - var16 * var16)));
            float var18 = 1.0F - var16;
            float var19 = (float) Math.sqrt((double) (arg2 * arg2 + arg3 * arg3));
            if (var19 == 0.0F && var16 == 0.0F) {
                var9 = var8;
            } else {
                if (var19 != 0.0F) {
                    var14 = (float) (-arg2) / var19;
                    var15 = (float) arg3 / var19;
                }
                var13[5] = var14 * var17;
                var13[3] = -var15 * var17;
                var13[4] = var16;
                var13[1] = var15 * var17;
                var13[2] = var14 * var15 * var18;
                var13[6] = var14 * var15 * var18;
                var13[7] = -var14 * var17;
                var13[0] = var14 * var14 * var18 + var16;
                var13[8] = var15 * var15 * var18 + var16;
                var9[0] = var8[2] * var13[6] + var8[0] * var13[0] + var8[1] * var13[3];
                var9[1] = var8[2] * var13[7] + var8[0] * var13[1] + var8[1] * var13[4];
                var9[2] = var8[2] * var13[8] + var8[1] * var13[5] + var8[0] * var13[2];
                var9[3] = var8[5] * var13[6] + var8[3] * var13[0] + var8[4] * var13[3];
                var9[4] = var8[5] * var13[7] + var8[3] * var13[1] + var8[4] * var13[4];
                var9[6] = var8[8] * var13[6] + var8[7] * var13[3] + var8[6] * var13[0];
                var9[5] = var8[5] * var13[8] + var8[3] * var13[2] + var8[4] * var13[5];
                var9[7] = var8[8] * var13[7] + var8[7] * var13[4] + var8[6] * var13[1];
                var9[8] = var8[8] * var13[8] + var8[6] * var13[2] + var8[7] * var13[5];
            }
            var9[1] *= arg5;
            var9[5] *= arg4;
            var9[4] *= arg4;
            var9[8] *= arg6;
            var9[6] *= arg6;
            var9[3] *= arg4;
            var9[7] *= arg6;
            var9[2] *= arg5;
            var9[0] *= arg5;
            return var9;
        } catch (RuntimeException var21) {
            throw class759.method5498(var21, field5414[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(Ljava/lang/String;CB)[Ljava/lang/String;")
    public static final String[] method2878(String arg0, char arg1, byte arg2) {
        try {
            if (arg2 <= 71) {
                method2878(null, (char) 65435, (byte) 124);
            }
            field5413++;
            int var3 = class781.method5646(arg1, arg0, (byte) 48);
            String[] var4 = new String[var3 + 1];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < var3; var7++) {
                int var8;
                for (var8 = var6; arg1 != arg0.charAt(var8); var8++) {
                }
                var4[var5++] = arg0.substring(var6, var8);
                var6 = var8 + 1;
            }
            var4[var3] = arg0.substring(var6);
            return var4;
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field5414[5] + (arg0 == null ? field5414[0] : field5414[1]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(BII)Z")
    public static final boolean method2879(byte arg0, int arg1, int arg2) {
        try {
            field5407++;
            boolean var3 = (arg1 & 0x37) == 0 ? class454.method3477(arg2, arg1, arg0 ^ 0x49) : class170.method1510(arg2, arg1, (byte) 115);
            if (arg0 != -82) {
                method2878(null, (char) 65509, (byte) 89);
            }
            return var3 | class65.method464((byte) -74, arg1, arg2) | (arg2 & 0x10000) != 0;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field5414[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!pba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2880(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x39);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2881(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 1;
                    break;
                case 1:
                    var10005 = 124;
                    break;
                case 2:
                    var10005 = 73;
                    break;
                case 3:
                    var10005 = 79;
                    break;
                default:
                    var10005 = 57;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
