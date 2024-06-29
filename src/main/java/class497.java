import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class497 extends class276 {

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "Lgk;")
    private class412 field7282;

    @OriginalMember(owner = "client!pg", name = "A", descriptor = "I")
    public int field7290;

    @OriginalMember(owner = "client!pg", name = "D", descriptor = "[I")
    private int[] field7293;

    @OriginalMember(owner = "client!pg", name = "B", descriptor = "Lih;")
    private class214 field7291;

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "I")
    public int field7277;

    @OriginalMember(owner = "client!pg", name = "w", descriptor = "I")
    public int field7286;

    @OriginalMember(owner = "client!pg", name = "z", descriptor = "I")
    public int field7289;

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "F")
    public float field7278;

    @OriginalMember(owner = "client!pg", name = "v", descriptor = "Lac;")
    private class498 field7285;

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "Z")
    public static boolean field7279 = false;

    @OriginalMember(owner = "client!pg", name = "J", descriptor = "I")
    public static int field7298;

    @OriginalMember(owner = "client!pg", name = "K", descriptor = "Lvv;")
    public static class313 field7299;

    @OriginalMember(owner = "client!pg", name = "L", descriptor = "S")
    public static short field7300;

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "I")
    public static int field7280;

    @OriginalMember(owner = "client!pg", name = "r", descriptor = "I")
    public static int field7281;

    @OriginalMember(owner = "client!pg", name = "t", descriptor = "I")
    public static int field7283;

    @OriginalMember(owner = "client!pg", name = "C", descriptor = "I")
    public static int field7292;

    @OriginalMember(owner = "client!pg", name = "E", descriptor = "I")
    public static int field7294;

    @OriginalMember(owner = "client!pg", name = "G", descriptor = "I")
    public static int field7296;

    @OriginalMember(owner = "client!pg", name = "H", descriptor = "I")
    public static int field7297;

    @OriginalMember(owner = "client!pg", name = "F", descriptor = "Lo;")
    public static class138 field7295;

    @OriginalMember(owner = "client!pg", name = "y", descriptor = "Lnn;")
    private class45 field7288;

    @OriginalMember(owner = "client!pg", name = "x", descriptor = "Ljaggl/memory/NativeBuffer;")
    private NativeBuffer field7287;

    @OriginalMember(owner = "client!pg", name = "u", descriptor = "Ljaggl/memory/NativeStream;")
    private NativeStream field7284;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIFI)V")
    public final void method2945(int arg0, int arg1, int arg2, float arg3, int arg4) {
        field7296++;
        if (this.field7289 != -1) {
            class320 var6 = this.field7291.field7179.method195(this.field7289, (byte) -105);
            int var7 = var6.field5029 & 0xFF;
            if (var7 != 0 && var6.field5026 != 4) {
                int var8;
                if (arg0 < 0) {
                    var8 = 0;
                } else if (arg0 > 127) {
                    var8 = 16777215;
                } else {
                    var8 = arg0 * 131586;
                }
                if (var7 == 256) {
                    arg2 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg2 = ((arg2 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) + ((arg2 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field5035 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = ((arg2 & 0xFF0000) >> 16) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = ((arg2 & 0xFF00) >> 8) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg2 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg2 = ((var12 & 0x4800FF00) << 8) + (var14 >> 8) + (var13 & 0xFF00);
            }
        }
        if (arg3 != 1.0F) {
            int var15 = (arg2 & 0xFFF21A) >> 16;
            int var16 = arg2 >> 8 & 0xFF;
            int var17 = (int) ((float) var15 * arg3);
            int var18 = arg2 & 0xFF;
            int var19 = (int) ((float) var16 * arg3);
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            int var20 = (int) ((float) var18 * arg3);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg2 = var20 | var19 << 8 | var17 << 16;
        }
        this.field7284.method97(arg4 * 4);
        this.field7284.method102((byte) (arg2 >> 16));
        if (arg1 != 255) {
            this.field7291 = null;
        }
        this.field7284.method102((byte) (arg2 >> 8));
        this.field7284.method102((byte) arg2);
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(II)V")
    public final void method2946(int arg0, int arg1) {
        this.field7287 = this.field7291.field3603.method105(arg0 * arg1);
        field7297++;
        this.field7284 = new NativeStream(this.field7287);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BI)V")
    public final void method2947(byte arg0, int arg1) {
        field7280++;
        this.field7284.method97(arg1 * 4 + 3);
        this.field7284.method102(-1);
        if (arg0 != -111) {
            this.field7284 = null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(BI)V")
    public final void method2948(byte arg0, int arg1) {
        int var3 = 70 / ((57 - arg0) / 63);
        this.field7284.method99();
        field7294++;
        class92 var4 = this.field7291.method1423(4, -32527, arg1 * 4, false, this.field7287);
        this.field7288 = new class45(var4, 5121, 4, 0);
        this.field7284 = null;
        this.field7287 = null;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(IIII)V")
    public final void method2949(int arg0, int arg1, int arg2, int arg3) {
        field7292++;
        this.field7293[this.field7282.field3801 * arg2 + arg0] = class338.method2141(this.field7293[this.field7282.field3801 * arg2 + arg0], 0x1 << arg1);
        int var5 = -116 % ((arg3 + 74) / 37);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I[II)V")
    public final void method2950(int arg0, int[] arg1, int arg2) {
        field7281++;
        int var4 = 0;
        if (arg2 != 65535) {
            return;
        }
        class364 var5 = this.field7291.field3656;
        var5.field301 = 0;
        if (this.field7291.field3708) {
            for (int var6 = 0; var6 < arg0; var6++) {
                int var7 = arg1[var6];
                int var8 = this.field7293[var7];
                short[] var9 = this.field7282.field6243[var7];
                if (var8 != 0 && var9 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var11 < var9.length) {
                        if ((0x1 << var10++ & var8) == 0) {
                            var11 += 3;
                        } else {
                            var5.method182(var9[var11++] & 0xFFFF, -128);
                            var4++;
                            var4++;
                            var5.method182(var9[var11++] & 0xFFFF, 18);
                            var5.method182(var9[var11++] & 0xFFFF, 95);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var12 = 0; var12 < arg0; var12++) {
                int var13 = arg1[var12];
                int var14 = this.field7293[var13];
                short[] var15 = this.field7282.field6243[var13];
                if (var14 != 0 && var15 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var15.length > var17) {
                        if ((var14 & 0x1 << var16++) == 0) {
                            var17 += 3;
                        } else {
                            var4++;
                            var5.method154(var15[var17++] & 0xFFFF, -857932536);
                            var5.method154(var15[var17++] & 0xFFFF, -857932536);
                            var4++;
                            var4++;
                            var5.method154(var15[var17++] & 0xFFFF, -857932536);
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        this.field7285.method314(5123, arg2 - 65446, var5.field302, var5.field301);
        this.field7291.method1406(arg2 - 32647, this.field7282.field6276, this.field7282.field6274, this.field7288, this.field7282.field6267);
        this.field7291.method1424((this.field7282.field6234 & 0x8) != 0, false, (this.field7282.field6234 & 0x7) != 0, this.field7289);
        if (this.field7291.field3693) {
            this.field7291.method826(Integer.MAX_VALUE, this.field7290, this.field7277, this.field7286);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(1.0F / this.field7278, 1.0F / this.field7278, 1.0F);
        OpenGL.glMatrixMode(5888);
        this.field7291.method1406(32888, this.field7282.field6276, this.field7282.field6274, this.field7288, this.field7282.field6267);
        this.field7291.method1407(var4, (byte) -49, 4, this.field7285, 0);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
    public static void method2951(int arg0) {
        field7299 = null;
        field7295 = null;
        if (arg0 != 16773658) {
            method2951(69);
        }
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lgk;IIIII)V")
    public class497(class412 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field7282 = arg0;
        this.field7290 = arg3;
        this.field7293 = new int[this.field7282.field3801 * this.field7282.field3797];
        this.field7291 = this.field7282.field6242;
        this.field7277 = arg4;
        this.field7286 = arg5;
        this.field7289 = arg1;
        this.field7278 = arg2;
        this.field7285 = new class498(this.field7291, 5123, null, 1);
    }

    static {
        new class306("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
        field7298 = 0;
        field7299 = new class313(84, 0);
        field7300 = 1;
    }
}
