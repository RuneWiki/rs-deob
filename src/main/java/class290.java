import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class290 {

    @OriginalMember(owner = "client!dg", name = "n", descriptor = "Lgu;")
    private class417 field4307;

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "Lbt;")
    private class33 field4304;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
    public int field4299;

    @OriginalMember(owner = "client!dg", name = "t", descriptor = "I")
    private int field4313;

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "I")
    private int field4306;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "[B")
    public byte[] field4295;

    @OriginalMember(owner = "client!dg", name = "p", descriptor = "I")
    private int field4309;

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
    private int field4302;

    @OriginalMember(owner = "client!dg", name = "s", descriptor = "Ltf;")
    public static class198 field4312 = null;

    @OriginalMember(owner = "client!dg", name = "u", descriptor = "I")
    public static int field4314 = 0;

    @OriginalMember(owner = "client!dg", name = "w", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "I")
    public static int field4305;

    @OriginalMember(owner = "client!dg", name = "o", descriptor = "I")
    public static int field4308;

    @OriginalMember(owner = "client!dg", name = "r", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "Lci;")
    public static class320 field4296;

    @OriginalMember(owner = "client!dg", name = "v", descriptor = "Laa;")
    public static class343 field4315;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field4298;

    @OriginalMember(owner = "client!dg", name = "q", descriptor = "[[Lkm;")
    private class242[][] field4310;

    static {
        new class44("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
        field4316 = 1;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIZI)V", line = 4)
    private final void method1854(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field4301++;
        if (this.field4310 == null) {
            return;
        }
        int var6 = arg2 - 1 >> 7;
        int var7 = arg2 + arg4 - 1 - 1 >> 7;
        int var8 = arg1 - 1 >> 7;
        int var9 = arg1 + arg0 - 1 - 1 >> 7;
        if (!arg3) {
            return;
        }
        for (int var10 = var6; var10 <= var7; var10++) {
            class242[] var11 = this.field4310[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field3633 = true;
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZZI[[ZII)V", line = 43)
    public final void method1855(boolean arg0, boolean arg1, int arg2, boolean[][] arg3, int arg4, int arg5) {
        field4308++;
        this.field4304.method230((byte) -99, arg1);
        this.field4304.method286(-1, false);
        this.field4304.method204(-2, 1);
        this.field4304.method249(1, -2);
        this.field4304.method229(1, -112);
        float var7 = 1.0F / (float) (this.field4304.field624 * 128);
        if (arg0) {
            for (int var8 = 0; var8 < this.field4302; var8++) {
                int var9 = var8 << this.field4306;
                int var10 = var8 + 1 << this.field4306;
                label132: for (int var11 = 0; var11 < this.field4309; var11++) {
                    int var12 = var11 << this.field4306;
                    int var13 = var11 + 1 << this.field4306;
                    for (int var14 = var12; var14 < var13; var14++) {
                        if ((var14 - arg5) >= (-arg4) && arg4 >= (var14 - arg5)) {
                            for (int var15 = var9; var15 < var10; var15++) {
                                if ((var15 - arg2) >= (-arg4) && (var15 - arg2) <= arg4 && arg3[var14 + arg4 - arg5][var15 + arg4 - arg2]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var11) / var7, (float) (-var8) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field4310[var11][var8].method1599(24056);
                                    continue label132;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < this.field4302; var16++) {
                int var17 = var16 << this.field4306;
                int var18 = var16 + 1 << this.field4306;
                for (int var19 = 0; var19 < this.field4309; var19++) {
                    int var20 = 0;
                    int var21 = var19 << this.field4306;
                    int var22 = var19 + 1 << this.field4306;
                    class235 var23 = this.field4304.field719;
                    var23.field7558 = 0;
                    for (int var24 = var17; var24 < var18; var24++) {
                        if (-arg4 <= var24 - arg2 && arg4 >= var24 - arg2) {
                            int var25 = this.field4307.field347 * var24 + var21;
                            for (int var26 = var21; var26 < var22; var26++) {
                                if (var26 - arg5 >= -arg4 && var26 - arg5 <= arg4 && arg3[var26 + arg4 - arg5][var24 + arg4 - arg2]) {
                                    short[] var27 = this.field4307.field5902[var25];
                                    if (var27 != null) {
                                        if (this.field4304.field713) {
                                            for (int var29 = 0; var29 < var27.length; var29++) {
                                                var20++;
                                                var23.method3016(var27[var29] & 0xFFFF, -28);
                                            }
                                        } else {
                                            for (int var28 = 0; var28 < var27.length; var28++) {
                                                var23.method3062(var27[var28] & 0xFFFF, (byte) -53);
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
                        this.field4310[var19][var16].method1597(98, var20, var23.field7545, 5123);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IILia;B)V", line = 228)
    public final void method1856(int arg0, int arg1, class424 arg2, byte arg3) {
        if (arg3 != 26) {
            return;
        }
        field4297++;
        class37 var5 = (class37) arg2;
        int var6 = var5.field788 + arg1 + 1;
        int var7 = var5.field796 + arg0 + 1;
        int var8 = this.field4299 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field800;
        int var11 = var5.field790;
        int var12 = this.field4299 - var11;
        int var13 = 0;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var7 = 1;
            var9 += var11 * var14;
            var10 -= var14;
            var8 += this.field4299 * var14;
        }
        if (var7 + var10 >= this.field4313) {
            int var15 = var7 + var10 + 1 - this.field4313;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var6 = 1;
            var12 += var16;
            var8 += var16;
            var11 -= var16;
            var13 += var16;
            var9 += var16;
        }
        if (var6 + var11 >= this.field4299) {
            int var17 = var6 + var11 + 1 - this.field4299;
            var11 -= var17;
            var13 += var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class106.method774(var12, var8, this.field4295, var5.field786, (byte) -53, var9, var13, var11, var10);
            this.method1854(var10, var7, var6, true, var11);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V", line = 306)
    public static void method1857(int arg0) {
        field4315 = null;
        field4296 = null;
        field4312 = null;
        if (arg0 < -21) {
            field4298 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IILia;I)Z", line = 320)
    public final boolean method1858(int arg0, int arg1, class424 arg2, int arg3) {
        field4300++;
        class37 var5 = (class37) arg2;
        int var6 = var5.field788 + arg0 + 1;
        int var7 = var5.field796 + arg1 + 1;
        int var8 = var6 + (this.field4299 * var7);
        int var9 = var5.field800;
        int var10 = var5.field790;
        int var11 = this.field4299 - var10;
        if (var7 <= 0) {
            int var12 = 1 - var7;
            var8 += this.field4299 * var12;
            var7 = 1;
            var9 -= var12;
        }
        if (this.field4313 <= (var7 + var9)) {
            int var13 = var7 + var9 + 1 - this.field4313;
            var9 -= var13;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var11 += var14;
            var10 -= var14;
            var8 += var14;
            var6 = 1;
        }
        if ((var6 + var10) >= this.field4299) {
            int var15 = var6 - (-var10 - 1) - this.field4299;
            var11 += var15;
            var10 -= var15;
        }
        if (~var10 < arg3 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field4299 + var11;
            return class528.method3134(var9, var8, var10, var16, this.field4295, arg3, var17);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Luc;I)V", line = 391)
    public static final void method1859(class23 arg0, int arg1) {
        if (arg1 != 1) {
            method1857(-45);
        }
        field4294++;
        if ((arg0 instanceof class279)) {
            class279 var3 = (class279) arg0;
            if (var3.field4157 == null) {
                return;
            }
            class175.method1222(0, var3, class364.field5293.field6956 != var3.field6956);
        } else if (arg0 instanceof class510) {
            class510 var2 = (class510) arg0;
            class190.method1294(false, class364.field5293.field6956 != var2.field6956, var2);
            return;
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(IILia;I)V", line = 431)
    public final void method1860(int arg0, int arg1, class424 arg2, int arg3) {
        field4303++;
        class37 var5 = (class37) arg2;
        int var6 = var5.field796 + arg0 + 1;
        int var7 = var5.field788 + arg3 + 1;
        int var8 = this.field4299 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field800;
        int var11 = var5.field790;
        int var12 = this.field4299 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var8 += this.field4299 * var13;
            var10 -= var13;
            var9 += var11 * var13;
            var6 = 1;
        }
        int var14 = 0;
        if (arg1 <= 11) {
            return;
        }
        if (var6 + var10 >= this.field4313) {
            int var15 = var6 + var10 + 1 - this.field4313;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var9 += var16;
            var11 -= var16;
            var8 += var16;
            var14 += var16;
            var7 = 1;
            var12 += var16;
        }
        if ((var7 + var11) >= this.field4299) {
            int var17 = var7 + var11 + 1 - this.field4299;
            var12 += var17;
            var11 -= var17;
            var14 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class285.method1837(var14, (byte) 29, var11, var10, this.field4295, var5.field786, var12, var8, var9);
            this.method1854(var10, var6, var7, true, var11);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Z)V", line = 506)
    public final void method1861(boolean arg0) {
        field4311++;
        this.field4310 = new class242[this.field4309][this.field4302];
        for (int var2 = 0; var2 < this.field4302; var2++) {
            for (int var3 = 0; var3 < this.field4309; var3++) {
                this.field4310[var3][var2] = new class242(this.field4304, this, this.field4307, var3, var2, this.field4306, var3 * 128 + 1, var2 * 128 + 1);
            }
        }
        if (!arg0) {
            this.field4302 = 66;
        }
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lbt;Lgu;)V", line = 545)
    public class290(class33 arg0, class417 arg1) {
        this.field4307 = arg1;
        this.field4304 = arg0;
        this.field4299 = (this.field4307.field347 * this.field4307.field346 >> this.field4304.field622) + 2;
        this.field4313 = (this.field4307.field350 * this.field4307.field346 >> this.field4304.field622) + 2;
        this.field4306 = this.field4304.field622 + 7 - this.field4307.field345;
        this.field4295 = new byte[this.field4313 * this.field4299];
        this.field4309 = this.field4307.field347 >> this.field4306;
        this.field4302 = this.field4307.field350 >> this.field4306;
    }
}
