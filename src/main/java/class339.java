import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class339 {

    @OriginalMember(owner = "client!dh", name = "q", descriptor = "Ldl;")
    private class67 field5530;

    @OriginalMember(owner = "client!dh", name = "p", descriptor = "Lvf;")
    private class159 field5523;

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
    public int field5520;

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "I")
    private int field5524;

    @OriginalMember(owner = "client!dh", name = "o", descriptor = "[B")
    public byte[] field5527;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    private int field5528;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
    private int field5517;

    @OriginalMember(owner = "client!dh", name = "n", descriptor = "I")
    private int field5519;

    @OriginalMember(owner = "client!dh", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5533 = new String[] { method2862(method2861("\"YI\u0012\u001d")), method2862(method2861("=\u001fI}H")), method2862(method2861("\"YI\u0014\u001d")), method2862(method2861("(D\u000b?")), method2862(method2861("\"YIo\\(X\u0013m\u001d")), method2862(method2861("\"YI\u0017\u001d")), method2862(method2861("\"YI\u0010\u001d")), method2862(method2861("\"YI\u0016\u001d")), method2862(method2861("\"YI\u0015\u001d")), method2862(method2861("\"YI\u0011\u001d")) };

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "[[Z")
    public static boolean[][] field5531 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "Lpe;")
    public static class636 field5522 = new class636(2, 4, 4, 0);

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "Lega;")
    public static class742 field5532 = new class742();

    @OriginalMember(owner = "client!dh", name = "m", descriptor = "I")
    public static int field5515;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
    public static int field5516;

    @OriginalMember(owner = "client!dh", name = "l", descriptor = "I")
    public static int field5518;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public static int field5521;

    @OriginalMember(owner = "client!dh", name = "r", descriptor = "I")
    public static int field5526;

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "I")
    public static int field5529;

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "[[Ljl;")
    private class283[][] field5525;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IILr;I)Z")
    public final boolean method2854(int arg0, int arg1, class192 arg2, int arg3) {
        try {
            field5518++;
            class669 var5 = (class669) arg2;
            arg3 += var5.field9504 + 1;
            arg1 += var5.field9513 + arg0;
            int var6 = arg1 + (this.field5520 * arg3);
            int var7 = var5.field9508;
            int var8 = var5.field9505;
            int var9 = this.field5520 - var8;
            if (arg3 <= 0) {
                int var10 = 1 - arg3;
                var6 += this.field5520 * var10;
                var7 -= var10;
                arg3 = 1;
            }
            if ((arg3 + var7) >= this.field5524) {
                int var11 = arg3 + var7 + 1 - this.field5524;
                var7 -= var11;
            }
            if (arg1 <= 0) {
                int var12 = 1 - arg1;
                arg1 = 1;
                var6 += var12;
                var9 += var12;
                var8 -= var12;
            }
            if (this.field5520 <= arg1 + var8) {
                int var13 = arg1 + var8 + 1 - this.field5520;
                var8 -= var13;
                var9 += var13;
            }
            if (var8 > 0 && var7 > 0) {
                byte var14 = 8;
                int var15 = (var14 - 1) * this.field5520 + var9;
                return class732.method5313(var15, var6, var8, this.field5527, (byte) 40, var7, var14);
            } else {
                return false;
            }
        } catch (RuntimeException var17) {
            throw class590.method4333(var17, field5533[9] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field5533[3] : field5533[1]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V")
    public final void method2855(byte arg0) {
        try {
            field5521++;
            this.field5525 = new class283[this.field5517][this.field5519];
            int var2 = 0;
            if (arg0 < -119) {
                while (var2 < this.field5519) {
                    for (int var3 = 0; var3 < this.field5517; var3++) {
                        this.field5525[var3][var2] = new class283(this.field5523, this, this.field5530, var3, var2, this.field5528, var3 * 128 + 1, var2 * 128 + 1);
                    }
                    var2++;
                }
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field5533[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIB)V")
    private final void method2856(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        try {
            field5515++;
            if (this.field5525 != null) {
                int var6 = arg1 - 1 >> 7;
                if (arg4 < 125) {
                    this.method2858(false, (byte) -41, null, 76, -26, 77);
                }
                int var7 = arg1 + arg2 - 1 - 1 >> 7;
                int var8 = arg0 - 1 >> 7;
                int var9 = arg0 + arg3 - 1 - 1 >> 7;
                for (int var10 = var6; var10 <= var7; var10++) {
                    class283[] var11 = this.field5525[var10];
                    for (int var12 = var8; var12 <= var9; var12++) {
                        var11[var12].field4591 = true;
                    }
                }
            }
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field5533[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lr;III)V")
    public final void method2857(class192 arg0, int arg1, int arg2, int arg3) {
        try {
            field5526++;
            class669 var5 = (class669) arg0;
            arg1 += var5.field9513 + 1;
            arg2 += var5.field9504 + 1;
            int var6 = this.field5520 * arg2 + arg1;
            int var7 = 0;
            int var8 = var5.field9508;
            int var9 = var5.field9505;
            int var10 = this.field5520 - var9;
            int var11 = 0;
            if (arg2 <= 0) {
                int var12 = 1 - arg2;
                arg2 = 1;
                var7 += var9 * var12;
                var6 += this.field5520 * var12;
                var8 -= var12;
            }
            if (this.field5524 <= (arg2 + var8)) {
                int var13 = arg2 + var8 + (1 - this.field5524);
                var8 -= var13;
            }
            if (arg3 <= -91) {
                if (arg1 <= 0) {
                    int var14 = 1 - arg1;
                    var6 += var14;
                    var10 += var14;
                    var7 += var14;
                    arg1 = 1;
                    var11 += var14;
                    var9 -= var14;
                }
                if (this.field5520 <= (arg1 + var9)) {
                    int var15 = arg1 + var9 + 1 - this.field5520;
                    var10 += var15;
                    var11 += var15;
                    var9 -= var15;
                }
                if (var9 > 0 && var8 > 0) {
                    class117.method1161(var8, 87, this.field5527, var11, var6, var9, var5.field9511, var7, var10);
                    this.method2856(arg2, arg1, var9, var8, (byte) 126);
                }
            }
        } catch (RuntimeException var17) {
            throw class590.method4333(var17, field5533[2] + (arg0 == null ? field5533[3] : field5533[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZB[[ZIII)V")
    public final void method2858(boolean arg0, byte arg1, boolean[][] arg2, int arg3, int arg4, int arg5) {
        try {
            field5516++;
            if (arg1 > 120) {
                this.field5523.method1474(false, (byte) 90);
                this.field5523.method1489(-19225, false);
                this.field5523.method1447(-2, 20014);
                this.field5523.method1425((byte) 35, 1);
                this.field5523.method1482(13370, 1);
                float var7 = 1.0F / (float) (this.field5523.field2389 * 128);
                if (arg0) {
                    for (int var8 = 0; var8 < this.field5519; var8++) {
                        int var9 = var8 << this.field5528;
                        int var10 = var8 + 1 << this.field5528;
                        label161: for (int var11 = 0; var11 < this.field5517; var11++) {
                            int var12 = var11 << this.field5528;
                            int var13 = var11 + 1 << this.field5528;
                            for (int var14 = var12; var14 < var13; var14++) {
                                if ((-arg5) <= (var14 - arg4) && arg5 >= var14 - arg4) {
                                    for (int var15 = var9; var15 < var10; var15++) {
                                        if (var15 - arg3 >= -arg5 && var15 - arg3 <= arg5 && arg2[arg5 + var14 - arg4][var15 + arg5 - arg3]) {
                                            OpenGL.glMatrixMode(5890);
                                            OpenGL.glLoadIdentity();
                                            OpenGL.glScalef(var7, var7, 1.0F);
                                            OpenGL.glTranslatef((float) (-var11) / var7, (float) (-var8) / var7, 1.0F);
                                            OpenGL.glMatrixMode(5888);
                                            this.field5525[var11][var8].method2414(106);
                                            continue label161;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var16 = 0; var16 < this.field5519; var16++) {
                        int var17 = var16 << this.field5528;
                        int var18 = var16 + 1 << this.field5528;
                        for (int var19 = 0; var19 < this.field5517; var19++) {
                            int var20 = 0;
                            int var21 = var19 << this.field5528;
                            int var22 = var19 + 1 << this.field5528;
                            class647 var23 = this.field5523.field2453;
                            var23.field2799 = 0;
                            for (int var24 = var17; var24 < var18; var24++) {
                                if ((-arg5) <= (var24 - arg3) && arg5 >= (var24 - arg3)) {
                                    int var25 = this.field5530.field4704 * var24 + var21;
                                    for (int var26 = var21; var26 < var22; var26++) {
                                        if ((var26 - arg4) >= (-arg5) && arg5 >= var26 - arg4 && arg2[var26 + arg5 - arg4][var24 + arg5 - arg3]) {
                                            short[] var27 = this.field5530.field918[var25];
                                            if (var27 != null) {
                                                if (this.field5523.field2500) {
                                                    for (int var28 = 0; var28 < var27.length; var28++) {
                                                        var23.method1650((byte) -95, var27[var28] & 0xFFFF);
                                                        var20++;
                                                    }
                                                } else {
                                                    for (int var29 = 0; var29 < var27.length; var29++) {
                                                        var23.method1633(var27[var29] & 0xFFFF, -24955);
                                                        var20++;
                                                    }
                                                }
                                            }
                                        }
                                        var25++;
                                    }
                                }
                            }
                            if (var20 > 0) {
                                OpenGL.glMatrixMode(5890);
                                OpenGL.glLoadIdentity();
                                OpenGL.glScalef(var7, var7, 1.0F);
                                OpenGL.glTranslatef((float) (-var19) / var7, (float) (-var16) / var7, 1.0F);
                                OpenGL.glMatrixMode(5888);
                                this.field5525[var19][var16].method2412(var20, 5123, false, var23.field2805);
                            }
                        }
                    }
                }
                OpenGL.glMatrixMode(5890);
                OpenGL.glLoadIdentity();
                OpenGL.glMatrixMode(5888);
            }
        } catch (RuntimeException var31) {
            throw class590.method4333(var31, field5533[5] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field5533[3] : field5533[1]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIILr;)V")
    public final void method2859(int arg0, int arg1, int arg2, class192 arg3) {
        try {
            field5529++;
            class669 var5 = (class669) arg3;
            arg0 += var5.field9504 + 1;
            arg2 += var5.field9513 + 1;
            int var6 = this.field5520 * arg0 + arg2;
            int var7 = 0;
            int var8 = var5.field9508;
            int var9 = var5.field9505;
            int var10 = this.field5520 - var9;
            if (arg0 <= arg1) {
                int var11 = 1 - arg0;
                var6 += this.field5520 * var11;
                var8 -= var11;
                arg0 = 1;
                var7 += var9 * var11;
            }
            int var12 = 0;
            if (this.field5524 <= arg0 + var8) {
                int var13 = arg0 + var8 + 1 - this.field5524;
                var8 -= var13;
            }
            if (arg2 <= 0) {
                int var14 = 1 - arg2;
                arg2 = 1;
                var9 -= var14;
                var7 += var14;
                var6 += var14;
                var10 += var14;
                var12 += var14;
            }
            if (this.field5520 <= (arg2 + var9)) {
                int var15 = var9 + arg2 + 1 - this.field5520;
                var12 += var15;
                var10 += var15;
                var9 -= var15;
            }
            if (var9 > 0 && var8 > 0) {
                class135.method1267(var5.field9511, var7, var6, var10, -18265, var12, var8, this.field5527, var9);
                this.method2856(arg0, arg2, var9, var8, (byte) 127);
            }
        } catch (RuntimeException var17) {
            throw class590.method4333(var17, field5533[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field5533[3] : field5533[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
    public static void method2860(int arg0) {
        try {
            field5532 = null;
            field5522 = null;
            if (arg0 != 1) {
                field5532 = null;
            }
            field5531 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field5533[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Lvf;Ldl;)V")
    public class339(class159 arg0, class67 arg1) {
        try {
            this.field5530 = arg1;
            this.field5523 = arg0;
            this.field5520 = (this.field5530.field4704 * this.field5530.field4702 >> this.field5523.field2390) + 2;
            this.field5524 = (this.field5530.field4702 * this.field5530.field4697 >> this.field5523.field2390) + 2;
            this.field5527 = new byte[this.field5524 * this.field5520];
            this.field5528 = this.field5523.field2390 + 7 - this.field5530.field4706;
            this.field5517 = this.field5530.field4704 >> this.field5528;
            this.field5519 = this.field5530.field4697 >> this.field5528;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field5533[4] + (arg0 == null ? field5533[3] : field5533[1]) + ',' + (arg1 == null ? field5533[3] : field5533[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!dh", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2861(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x35);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dh", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2862(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 70;
                    break;
                case 1:
                    var10005 = 49;
                    break;
                case 2:
                    var10005 = 103;
                    break;
                case 3:
                    var10005 = 83;
                    break;
                default:
                    var10005 = 53;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
