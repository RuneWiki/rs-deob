import jaggl.OpenGL;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class410 {

    @OriginalMember(owner = "client!qq", name = "j", descriptor = "Lpf;")
    private class506 field6234;

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "Lad;")
    private class362 field6226;

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "I")
    public int field6229;

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "I")
    private int field6228;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "[B")
    public byte[] field6225;

    @OriginalMember(owner = "client!qq", name = "m", descriptor = "I")
    private int field6237;

    @OriginalMember(owner = "client!qq", name = "s", descriptor = "I")
    private int field6243;

    @OriginalMember(owner = "client!qq", name = "n", descriptor = "I")
    private int field6238;

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "Lea;")
    public static class474 field6227 = new class474("Loaded JACLIB", "JACLIB geladen", "JACLIB chargé", "JACLIB carregado");

    @OriginalMember(owner = "client!qq", name = "t", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field6244 = new BigInteger("bd6c259a5e2375a02e470ffef01edcdca9086b340dc25c0a09b3d321febb76415778f9013aca03534ee8f12d7916d48786afc58a87eeff3132ce3cd3ff34b431", 16);

    @OriginalMember(owner = "client!qq", name = "u", descriptor = "[I")
    public static int[] field6245 = new int[25];

    @OriginalMember(owner = "client!qq", name = "y", descriptor = "Ldb;")
    public static class272 field6249 = new class272(7, 0, 1, 1);

    @OriginalMember(owner = "client!qq", name = "w", descriptor = "F")
    public static float field6247;

    @OriginalMember(owner = "client!qq", name = "x", descriptor = "F")
    public static float field6248;

    @OriginalMember(owner = "client!qq", name = "f", descriptor = "I")
    public static int field6230;

    @OriginalMember(owner = "client!qq", name = "g", descriptor = "I")
    public static int field6231;

    @OriginalMember(owner = "client!qq", name = "h", descriptor = "I")
    public static int field6232;

    @OriginalMember(owner = "client!qq", name = "i", descriptor = "I")
    public static int field6233;

    @OriginalMember(owner = "client!qq", name = "k", descriptor = "I")
    public static int field6235;

    @OriginalMember(owner = "client!qq", name = "o", descriptor = "I")
    public static int field6239;

    @OriginalMember(owner = "client!qq", name = "p", descriptor = "I")
    public static int field6240;

    @OriginalMember(owner = "client!qq", name = "q", descriptor = "I")
    public static int field6241;

    @OriginalMember(owner = "client!qq", name = "r", descriptor = "I")
    public static int field6242;

    @OriginalMember(owner = "client!qq", name = "v", descriptor = "Ltq;")
    public static class545 field6246;

    @OriginalMember(owner = "client!qq", name = "l", descriptor = "[[Lpi;")
    private class430[][] field6236;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIII)V")
    private final void method2592(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6230++;
        if (this.field6236 == null) {
            return;
        }
        int var6 = arg4 - 1 >> 7;
        int var7 = arg4 + arg2 - 1 - 1 >> 7;
        int var8 = arg3 - 1 >> 7;
        int var9 = arg3 + arg0 - 1 - 1 >> 7;
        int var10 = var6;
        if (arg1 != -1590151225) {
            this.method2600(25, null, 53, 122);
        }
        while (var10 <= var7) {
            class430[] var11 = this.field6236[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field6384 = true;
            }
            var10++;
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(B)V")
    public static void method2593(byte arg0) {
        if (arg0 <= 52) {
            method2599((byte) 110, null);
        }
        field6227 = null;
        field6249 = null;
        field6244 = null;
        field6246 = null;
        field6245 = null;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Ljava/lang/String;Lad;BI)Lni;")
    public static final class451 method2594(String arg0, class362 arg1, byte arg2, int arg3) {
        field6242++;
        long var4 = OpenGL.glCreateShaderObjectARB(arg3);
        OpenGL.glShaderSourceARB(var4, arg0);
        OpenGL.glCompileShaderARB(var4);
        if (arg2 < 30) {
            return null;
        }
        OpenGL.glGetObjectParameterivARB(var4, 35713, class129.field1617, 0);
        if (class129.field1617[0] == 0) {
            if (class129.field1617[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class129.field1617, 1);
            if (class129.field1617[1] > 1) {
                byte[] var6 = new byte[class129.field1617[1]];
                OpenGL.glGetInfoLogARB(var4, class129.field1617[1], class129.field1617, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class129.field1617[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class451(arg1, var4, arg3);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lw;III)Z")
    public final boolean method2595(class252 arg0, int arg1, int arg2, int arg3) {
        field6241++;
        class591 var5 = (class591) arg0;
        int var6 = var5.field8490 + arg1 + 1;
        int var7 = var5.field8484 + arg3 + arg2;
        int var8 = this.field6229 * var7 + var6;
        int var9 = var5.field8480;
        int var10 = var5.field8482;
        int var11 = this.field6229 - var10;
        if (var7 <= 0) {
            int var12 = 1 - var7;
            var8 += this.field6229 * var12;
            var9 -= var12;
            var7 = 1;
        }
        if ((var7 + var9) >= this.field6228) {
            int var13 = var7 + var9 - (this.field6228 - 1);
            var9 -= var13;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var11 += var14;
            var8 += var14;
            var6 = 1;
            var10 -= var14;
        }
        if (this.field6229 <= var6 + var10) {
            int var15 = var6 + var10 + 1 - this.field6229;
            var10 -= var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field6229 + var11;
            return class611.method3537(var10, var16, -1, this.field6225, var9, var17, var8);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIII[[ZZ)V")
    public final void method2596(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4, boolean arg5) {
        this.field6226.method2326(-1254361672, false);
        field6235++;
        this.field6226.method2285(-32, false);
        this.field6226.method2286(-2, (byte) -122);
        this.field6226.method2288(1, 7681);
        this.field6226.method2327(1, (byte) -124);
        float var7 = 1.0F / (float) (this.field6226.field5349 * 128);
        if (arg0 < 95) {
            this.field6228 = 66;
        }
        if (arg5) {
            for (int var8 = 0; var8 < this.field6238; var8++) {
                int var9 = var8 << this.field6237;
                int var10 = var8 + 1 << this.field6237;
                label135: for (int var11 = 0; var11 < this.field6243; var11++) {
                    int var12 = var11 << this.field6237;
                    int var13 = var11 + 1 << this.field6237;
                    for (int var14 = var12; var14 < var13; var14++) {
                        if (-arg2 <= var14 - arg3 && var14 - arg3 <= arg2) {
                            for (int var15 = var9; var15 < var10; var15++) {
                                if ((var15 - arg1) >= (-arg2) && arg2 >= var15 - arg1 && arg4[arg2 + var14 - arg3][arg2 + var15 - arg1]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var11) / var7, (float) (-var8) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field6236[var11][var8].method2683(112);
                                    continue label135;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < this.field6238; var16++) {
                int var17 = var16 << this.field6237;
                int var18 = var16 + 1 << this.field6237;
                for (int var19 = 0; var19 < this.field6243; var19++) {
                    int var20 = 0;
                    int var21 = var19 << this.field6237;
                    int var22 = var19 + 1 << this.field6237;
                    class257 var23 = this.field6226.field5392;
                    var23.field2610 = 0;
                    for (int var24 = var17; var24 < var18; var24++) {
                        if ((-arg2) <= (var24 - arg1) && arg2 >= (var24 - arg1)) {
                            int var25 = this.field6234.field1656 * var24 + var21;
                            for (int var26 = var21; var26 < var22; var26++) {
                                if (var26 - arg3 >= -arg2 && arg2 >= (var26 - arg3) && arg4[arg2 + var26 - arg3][arg2 + var24 - arg1]) {
                                    short[] var27 = this.field6234.field7336[var25];
                                    if (var27 != null) {
                                        if (this.field6226.field5468) {
                                            for (int var28 = 0; var28 < var27.length; var28++) {
                                                var23.method1229(var27[var28] & 0xFFFF, 30364);
                                                var20++;
                                            }
                                        } else {
                                            for (int var29 = 0; var29 < var27.length; var29++) {
                                                var23.method1185(var27[var29] & 0xFFFF, 1616065864);
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
                        this.field6236[var19][var16].method2678(var23.field2622, var20, 5123, 3);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)V")
    public final void method2597(int arg0) {
        this.field6236 = new class430[this.field6243][this.field6238];
        field6240++;
        for (int var2 = 0; var2 < this.field6238; var2++) {
            for (int var4 = 0; var4 < this.field6243; var4++) {
                this.field6236[var4][var2] = new class430(this.field6226, this, this.field6234, var4, var2, this.field6237, var4 * 128 + 1, var2 * 128 + 1);
            }
        }
        int var3 = -45 / ((arg0 + 33) / 42);
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(I)V")
    public static final void method2598(int arg0) {
        field6239++;
        if (arg0 >= 85) {
            for (int var1 = 0; var1 < 100; var1++) {
                class136.field1692[var1] = true;
            }
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(BLkr;)V")
    public static final void method2599(byte arg0, class645 arg1) {
        arg1.method3668(-124);
        if (arg0 >= -119) {
            field6227 = null;
        }
        field6233++;
        int var2 = class244.field3460;
        class655 var3 = class439.field6548 = class142.field1749[var2] = new class655();
        var3.field2495 = var2;
        int var4 = arg1.method3671(30, (byte) 17);
        byte var5 = (byte) (var4 >> 28);
        int var6 = var4 >> 14 & 0x3FFF;
        int var7 = var4 & 0x3FFF;
        var3.field2515[0] = var6 - class287.field3980;
        var3.field1764 = (var3.field2515[0] << 9) + (var3.method1153(true) << 8);
        var3.field2524[0] = var7 - class250.field3549;
        var3.field1768 = (var3.field2524[0] << 9) + (var3.method1153(true) << 8);
        class226.field3179 = var3.field1757 = var5;
        if (class444.field6644[var2] != null) {
            var3.method3739(23402856, class444.field6644[var2]);
        }
        class88.field1018 = 0;
        class457.field6839[class88.field1018++] = var2;
        class262.field3727[var2] = 0;
        class368.field5557 = 0;
        for (int var8 = 1; var8 < 2048; var8++) {
            if (var2 != var8) {
                int var9 = arg1.method3671(18, (byte) 17);
                int var10 = var9 >> 16;
                int var11 = (var9 & 0xFF16) >> 8;
                int var12 = var9 & 0xFF;
                class110 var13 = class554.field7859[var8] = new class110();
                var13.field1353 = (var10 << 28) + (var11 << 14) + var12;
                var13.field1351 = -1;
                var13.field1350 = 0;
                var13.field1347 = false;
                class236.field3386[class368.field5557++] = var8;
                class262.field3727[var8] = 0;
            }
        }
        arg1.method3670(8);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILw;II)V")
    public final void method2600(int arg0, class252 arg1, int arg2, int arg3) {
        field6232++;
        class591 var5 = (class591) arg1;
        int var6 = var5.field8490 + arg0 + 1;
        int var7 = var5.field8484 + arg3 + 1;
        int var8 = this.field6229 * var7 + var6;
        if (arg2 > -125) {
            this.field6237 = -17;
        }
        int var9 = 0;
        int var10 = var5.field8480;
        int var11 = var5.field8482;
        int var12 = this.field6229 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var7 = 1;
            var10 -= var13;
            var8 += this.field6229 * var13;
            var9 += var11 * var13;
        }
        int var14 = 0;
        if (this.field6228 <= (var7 + var10)) {
            int var15 = var7 + var10 + 1 - this.field6228;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var11 -= var16;
            var12 += var16;
            var9 += var16;
            var14 += var16;
            var8 += var16;
            var6 = 1;
        }
        if (this.field6229 <= var6 + var11) {
            int var17 = var11 + var6 + 1 - this.field6229;
            var12 += var17;
            var11 -= var17;
            var14 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class618.method3559(var9, (byte) 68, var10, var11, this.field6225, var5.field8481, var12, var8, var14);
            this.method2592(var10, -1590151225, var11, var7, var6);
        }
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(Lw;III)V")
    public final void method2601(class252 arg0, int arg1, int arg2, int arg3) {
        field6231++;
        class591 var5 = (class591) arg0;
        int var6 = var5.field8484 + arg3 + 1;
        int var7 = var5.field8490 + arg2 + 1;
        int var8 = var7 + (this.field6229 * var6);
        int var9 = 0;
        int var10 = var5.field8480;
        int var11 = var5.field8482;
        int var12 = this.field6229 - var11;
        int var13 = 0;
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var6 = 1;
            var8 += this.field6229 * var14;
            var10 -= var14;
            var9 += var11 * var14;
        }
        if (var6 + var10 >= this.field6228) {
            int var15 = var6 + var10 + 1 - this.field6228;
            var10 -= var15;
        }
        if (arg1 > -106) {
            this.method2600(-16, null, 75, -69);
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var9 += var16;
            var13 += var16;
            var8 += var16;
            var11 -= var16;
            var12 += var16;
            var7 = 1;
        }
        if (var7 + var11 >= this.field6229) {
            int var17 = var7 + var11 + 1 - this.field6229;
            var11 -= var17;
            var13 += var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class238.method1592(var12, var9, var11, var5.field8481, var10, var13, this.field6225, true, var8);
            this.method2592(var10, -1590151225, var11, var6, var7);
        }
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lad;Lpf;)V")
    public class410(class362 arg0, class506 arg1) {
        this.field6234 = arg1;
        this.field6226 = arg0;
        this.field6229 = (this.field6234.field1662 * this.field6234.field1656 >> this.field6226.field5348) + 2;
        this.field6228 = (this.field6234.field1662 * this.field6234.field1660 >> this.field6226.field5348) + 2;
        this.field6225 = new byte[this.field6229 * this.field6228];
        this.field6237 = this.field6226.field5348 + 7 - this.field6234.field1663;
        this.field6243 = this.field6234.field1656 >> this.field6237;
        this.field6238 = this.field6234.field1660 >> this.field6237;
    }
}
