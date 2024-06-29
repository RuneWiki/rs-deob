import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class91 extends class130 {

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "Lrd;")
    private class344 field1470;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "Ljk;")
    private class134 field1455;

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "Ltt;")
    private class249 field1461;

    @OriginalMember(owner = "client!ha", name = "J", descriptor = "I")
    private int field1480;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
    private int field1456;

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "I")
    private int field1464;

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "I")
    private int field1462;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "[[F")
    private float[][] field1457;

    @OriginalMember(owner = "client!ha", name = "B", descriptor = "[[F")
    private float[][] field1472;

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "[[F")
    private float[][] field1466;

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "Lfh;")
    private class194 field1463;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "Lsd;")
    private class268 field1459;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "Lvg;")
    private class56 field1458;

    @OriginalMember(owner = "client!ha", name = "F", descriptor = "Lfp;")
    private class440 field1476;

    @OriginalMember(owner = "client!ha", name = "G", descriptor = "Lql;")
    private class121 field1477;

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "Lpp;")
    private class387 field1468;

    @OriginalMember(owner = "client!ha", name = "D", descriptor = "Lpp;")
    private class387 field1474;

    @OriginalMember(owner = "client!ha", name = "E", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "I")
    private int field1465;

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!ha", name = "I", descriptor = "I")
    private int field1479;

    static {
        new class179("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
        field1475 = 0;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IBII[[Z)V", line = 6)
    public final void method779(int arg0, byte arg1, int arg2, int arg3, boolean[][] arg4) {
        field1467++;
        if (this.field1476 == null || this.field1480 > arg0 + arg2 || this.field1456 < (arg2 - arg0) || arg0 + arg3 < this.field1464 || this.field1462 < arg3 - arg0) {
            return;
        }
        for (int var6 = this.field1464; var6 <= this.field1462; var6++) {
            for (int var7 = this.field1480; var7 <= this.field1456; var7++) {
                int var8 = var7 - arg2;
                int var9 = var6 - arg3;
                if (-arg0 < var8 && arg0 > var8 && -arg0 < var9 && var9 < arg0 && arg4[var8 + arg0][arg0 + var9]) {
                    this.field1461.method1745((int) (this.field1470.method2211(-128) * 255.0F) << 24, 2);
                    this.field1461.method1748(this.field1474, null, null, 0, this.field1468);
                    this.field1461.method1762(0, this.field1476, (byte) 122, 4, this.field1479);
                    return;
                }
            }
        }
        if (arg1 >= -108) {
            this.field1463 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[BZ)Ljava/lang/Object;", line = 69)
    public static final Object method780(int arg0, byte[] arg1, boolean arg2) {
        field1460++;
        int var3 = -117 / ((6 - arg0) / 34);
        if (arg1 == null) {
            return null;
        }
        if (arg1.length > 136 && !class71.field1132) {
            try {
                class199 var4 = (class199) Class.forName("bd").getDeclaredConstructor().newInstance();
                var4.method1026(-97, arg1);
                return var4;
            } catch (Throwable var5) {
                class71.field1132 = true;
            }
        }
        return arg2 ? class86.method766(arg1, (byte) 122) : arg1;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIBII)V", line = 105)
    private final void method781(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field1478++;
        long var8 = -1L;
        int var10 = (arg3 << this.field1455.field123) + arg5;
        int var11 = arg6 + (arg0 << this.field1455.field123);
        int var12 = this.field1455.method68(var10, var11);
        if ((arg5 & 0x7F) == 0 || (arg6 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | ((long) var11 & 0xFFFFL) << 16;
            class130 var13 = this.field1458.method358((byte) 69, var8);
            if (var13 != null) {
                this.method783(((class483) var13).field7074, -77);
                return;
            }
        }
        short var14 = (short) (this.field1465++);
        if (var8 != -1L) {
            this.field1458.method357(new class483(var14), 1, var8);
        }
        float var15;
        float var16;
        float var17;
        if (arg5 == 0 && arg6 == 0) {
            var15 = this.field1466[arg2][arg1];
            var16 = this.field1472[arg2][arg1];
            var17 = this.field1457[arg2][arg1];
        } else if (this.field1455.field127 == arg5 && arg6 == 0) {
            var15 = this.field1466[arg2 + 1][arg1];
            var16 = this.field1472[arg2 + 1][arg1];
            var17 = this.field1457[arg2 + 1][arg1];
        } else if (this.field1455.field127 == arg5 && this.field1455.field127 == arg6) {
            var15 = this.field1466[arg2 + 1][arg1 + 1];
            var16 = this.field1472[arg2 + 1][arg1 + 1];
            var17 = this.field1457[arg2 + 1][arg1 + 1];
        } else if (arg5 == 0 && this.field1455.field127 == arg6) {
            var16 = this.field1472[arg2][arg1 + 1];
            var17 = this.field1457[arg2][arg1 + 1];
            var15 = this.field1466[arg2][arg1 + 1];
        } else {
            float var18 = (float) arg5 / (float) this.field1455.field127;
            float var19 = (float) arg6 / (float) this.field1455.field127;
            float var20 = this.field1472[arg2][arg1];
            float var21 = this.field1457[arg2][arg1];
            float var22 = this.field1466[arg2][arg1];
            float var23 = this.field1472[arg2 + 1][arg1];
            float var24 = this.field1457[arg2 + 1][arg1];
            float var25 = (this.field1472[arg2][arg1 + 1] - var20) * var18 + var20;
            float var26 = (this.field1457[arg2][arg1 + 1] - var21) * var18 + var21;
            float var27 = this.field1466[arg2 + 1][arg1];
            float var28 = (this.field1466[arg2][arg1 + 1] - var22) * var18 + var22;
            float var29 = (this.field1457[arg2 + 1][arg1 + 1] - var24) * var18 + var24;
            float var30 = (this.field1472[arg2 + 1][arg1 + 1] - var23) * var18 + var23;
            float var31 = (this.field1466[arg2 + 1][arg1 + 1] - var27) * var18 + var27;
            var16 = (var30 - var25) * var19 + var25;
            var17 = (var29 - var26) * var19 + var26;
            var15 = (var31 - var28) * var19 + var28;
        }
        float var32 = (float) (this.field1470.method2214((byte) 118) - var10);
        float var33 = (float) (this.field1470.method2217(true) - var12);
        float var34 = (float) (this.field1470.method2216(-1) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var34 * var36;
        float var38 = var32 * var36;
        float var39 = var33 * var36;
        float var40 = var35 / (float) this.field1470.method2218(arg4 ^ 0xFFFFFC48);
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        if (arg4 != -47) {
            this.method783((short) 83, -122);
        }
        float var42 = var15 * var37 + var16 * var38 + var17 * var39;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field1470.method2212(-1);
        int var45 = (int) ((float) ((var44 & 0xFF9004) >> 16) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) (var44 >> 8 & 0xFF) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field1461.field3990) {
            this.field1459.method1857(false, (float) var10);
            this.field1459.method1857(false, (float) var12);
            this.field1459.method1857(false, (float) var11);
        } else {
            this.field1459.method1859((float) var10, 0);
            this.field1459.method1859((float) var12, 0);
            this.field1459.method1859((float) var11, arg4 + 47);
        }
        this.field1459.method1381(var45, (byte) 83);
        this.field1459.method1381(var46, (byte) 106);
        this.field1459.method1381(var47, (byte) 114);
        this.field1459.method1381(255, (byte) 100);
        this.method783(var14, -116);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([Lds;BLtt;)Lbr;", line = 286)
    public static final class147 method782(class279[] arg0, byte arg1, class249 arg2) {
        field1469++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (arg0[var3] == null || arg0[var3].field4353 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        if (arg1 > -114) {
            field1475 = 82;
        }
        for (int var6 = 0; var6 < arg0.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg0[var6].field4353);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class509.field7408, 0);
        if (class509.field7408[0] == 0) {
            if (class509.field7408[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class509.field7408, 1);
            if (class509.field7408[1] > 1) {
                byte[] var7 = new byte[class509.field7408[1]];
                OpenGL.glGetInfoLogARB(var4, class509.field7408[1], class509.field7408, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class509.field7408[0] == 0) {
                for (int var8 = 0; var8 < arg0.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg0[var8].field4353);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class147(arg2, var4, arg0);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(SI)V", line = 357)
    private final void method783(short arg0, int arg1) {
        if (this.field1461.field3990) {
            this.field1463.method1364(arg0, true);
        } else {
            this.field1463.method1366(true, arg0);
        }
        field1473++;
        this.field1479++;
        int var3 = 43 / ((2 - arg1) / 57);
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Ltt;Ljk;Lrd;[I)V", line = 381)
    public class91(class249 arg0, class134 arg1, class344 arg2, int[] arg3) {
        this.field1470 = arg2;
        this.field1455 = arg1;
        this.field1461 = arg0;
        int var5 = this.field1470.method2218(921) - (arg1.field127 >> 1);
        this.field1480 = this.field1470.method2214((byte) 118) - var5 >> arg1.field123;
        this.field1456 = this.field1470.method2214((byte) 111) + var5 >> arg1.field123;
        this.field1464 = this.field1470.method2216(-1) - var5 >> arg1.field123;
        this.field1462 = var5 + this.field1470.method2216(-1) >> arg1.field123;
        int var6 = this.field1456 + 1 - this.field1480;
        int var7 = this.field1462 + 1 - this.field1464;
        this.field1457 = new float[var6 + 1][var7 + 1];
        this.field1472 = new float[var6 + 1][var7 + 1];
        this.field1466 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var24 = this.field1464 + var8;
            if (var24 > 0 && var24 < (this.field1455.field122 - 1)) {
                for (int var25 = 0; var25 <= var6; var25++) {
                    int var26 = var25 + this.field1480;
                    if (var26 > 0 && this.field1455.field124 - 1 > var26) {
                        int var27 = arg1.method56(var26 + 1, var24) - arg1.method56(var26 - 1, var24);
                        int var28 = arg1.method56(var26, var24 + 1) - arg1.method56(var26, var24 - 1);
                        float var29 = (float) (1.0D / Math.sqrt((double) (var27 * var27 + var28 * var28 + 65536)));
                        this.field1472[var25][var8] = (float) var27 * var29;
                        this.field1457[var25][var8] = var29 * -256.0F;
                        this.field1466[var25][var8] = (float) var28 * var29;
                    }
                }
            }
        }
        int var9 = 0;
        int var10 = 0;
        for (int var11 = this.field1464; var11 <= this.field1462; var11++) {
            if (var11 >= 0 && var11 < arg1.field122) {
                for (int var21 = this.field1480; var21 <= this.field1456; var21++) {
                    if (var21 >= 0 && arg1.field124 > var21) {
                        int var22 = arg3[var10];
                        int[] var23 = arg1.field1972[var21][var11];
                        if (var23 != null && var22 != 0) {
                            if (var22 == 1) {
                                var9 += var23.length;
                            } else {
                                var9 += 3;
                            }
                        }
                    }
                    var10++;
                }
            } else {
                var10 += this.field1456 - this.field1480;
            }
        }
        if (var9 > 0) {
            this.field1463 = new class194(var9 * 2);
            this.field1459 = new class268(var9 * 16);
            this.field1458 = new class56(class46.method307((byte) -62, var9));
            int var12 = 0;
            int var13 = 0;
            for (int var14 = this.field1464; var14 <= this.field1462; var14++) {
                if (var14 >= 0 && arg1.field122 > var14) {
                    int var15 = 0;
                    for (int var16 = this.field1480; var16 <= this.field1456; var16++) {
                        if (var16 >= 0 && var16 < arg1.field124) {
                            int var17 = arg3[var12];
                            int[] var18 = arg1.field1972[var16][var14];
                            int[] var19 = arg1.field1967[var16][var14];
                            if (var18 != null && var17 != 0) {
                                if (var17 == 1) {
                                    for (int var20 = 0; var20 < var18.length; var20++) {
                                        this.method781(var14, var13, var15, var16, (byte) -47, var18[var20], var19[var20]);
                                    }
                                } else if (var17 == 3) {
                                    this.method781(var14, var13, var15, var16, (byte) -47, 0, 0);
                                    this.method781(var14, var13, var15, var16, (byte) -47, arg1.field127, 0);
                                    this.method781(var14, var13, var15, var16, (byte) -47, 0, arg1.field127);
                                } else if (var17 == 2) {
                                    this.method781(var14, var13, var15, var16, (byte) -47, arg1.field127, 0);
                                    this.method781(var14, var13, var15, var16, (byte) -47, arg1.field127, arg1.field127);
                                    this.method781(var14, var13, var15, var16, (byte) -47, 0, 0);
                                } else if (var17 == 5) {
                                    this.method781(var14, var13, var15, var16, (byte) -47, arg1.field127, arg1.field127);
                                    this.method781(var14, var13, var15, var16, (byte) -47, 0, arg1.field127);
                                    this.method781(var14, var13, var15, var16, (byte) -47, arg1.field127, 0);
                                } else if (var17 == 4) {
                                    this.method781(var14, var13, var15, var16, (byte) -47, 0, arg1.field127);
                                    this.method781(var14, var13, var15, var16, (byte) -47, 0, 0);
                                    this.method781(var14, var13, var15, var16, (byte) -47, arg1.field127, arg1.field127);
                                }
                            }
                        }
                        var15++;
                        var12++;
                    }
                } else {
                    var12 += this.field1456 - this.field1480;
                }
                var13++;
            }
            this.field1476 = this.field1461.method1761(this.field1463.field2982, false, 5123, (byte) -121, this.field1463.field2973);
            this.field1477 = this.field1461.method1735(this.field1459.field2973, false, 16, this.field1459.field2982, 32);
            this.field1468 = new class387(this.field1477, 5126, 3, 0);
            this.field1474 = new class387(this.field1477, 5121, 4, 12);
        } else {
            this.field1468 = null;
            this.field1476 = null;
            this.field1477 = null;
            this.field1474 = null;
        }
        this.field1463 = null;
        this.field1459 = null;
        this.field1472 = this.field1457 = this.field1466 = null;
        this.field1458 = null;
    }
}
