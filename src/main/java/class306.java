import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class306 {

    @OriginalMember(owner = "client!lv", name = "r", descriptor = "Lsi;")
    private class390 field4688;

    @OriginalMember(owner = "client!lv", name = "e", descriptor = "Lvj;")
    private class303 field4675;

    @OriginalMember(owner = "client!lv", name = "d", descriptor = "I")
    public int field4674;

    @OriginalMember(owner = "client!lv", name = "f", descriptor = "I")
    private int field4676;

    @OriginalMember(owner = "client!lv", name = "p", descriptor = "[B")
    public byte[] field4686;

    @OriginalMember(owner = "client!lv", name = "g", descriptor = "I")
    private int field4677;

    @OriginalMember(owner = "client!lv", name = "s", descriptor = "I")
    private int field4689;

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "I")
    private int field4672;

    @OriginalMember(owner = "client!lv", name = "k", descriptor = "I")
    public static int field4681 = 1;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!lv", name = "h", descriptor = "I")
    public static int field4678;

    @OriginalMember(owner = "client!lv", name = "i", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!lv", name = "j", descriptor = "I")
    public static int field4680;

    @OriginalMember(owner = "client!lv", name = "l", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!lv", name = "m", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!lv", name = "n", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!lv", name = "c", descriptor = "Liv;")
    public static class64 field4673;

    @OriginalMember(owner = "client!lv", name = "q", descriptor = "Lil;")
    public static class7 field4687;

    @OriginalMember(owner = "client!lv", name = "o", descriptor = "[[Ldr;")
    private class504[][] field4685;

    static {
        new class342("Your friendlist is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(B)V", line = 8)
    public static void method2004(byte arg0) {
        field4687 = null;
        field4673 = null;
        if (arg0 != 10) {
            method2004((byte) -62);
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(Lj;IIB)Z", line = 20)
    public final boolean method2005(class377 arg0, int arg1, int arg2, byte arg3) {
        field4671++;
        class76 var5 = (class76) arg0;
        int var6 = var5.field1269 + arg1 + 1;
        int var7 = var5.field1266 + arg2 + 1;
        int var8 = this.field4674 * var6 + var7;
        int var9 = var5.field1265;
        int var10 = var5.field1268;
        if (arg3 < 24) {
            this.method2005(null, 127, -73, (byte) -8);
        }
        int var11 = this.field4674 - var10;
        if (var6 <= 0) {
            int var12 = 1 - var6;
            var9 -= var12;
            var6 = 1;
            var8 += this.field4674 * var12;
        }
        if (this.field4676 <= var6 + var9) {
            int var13 = var6 + var9 - (this.field4676 + -1);
            var9 -= var13;
        }
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var8 += var14;
            var10 -= var14;
            var7 = 1;
            var11 += var14;
        }
        if (this.field4674 <= var7 + var10) {
            int var15 = var10 + var7 + 1 - this.field4674;
            var11 += var15;
            var10 -= var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field4674 + var11;
            return class425.method2557(var9, var17, var8, var10, var16, this.field4686, 6484);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(IIZZ[[ZI)V", line = 97)
    public final void method2006(int arg0, int arg1, boolean arg2, boolean arg3, boolean[][] arg4, int arg5) {
        this.field4675.method1941(false, 21282);
        field4683++;
        if (!arg2) {
            this.method2007(false, 68, 3, -4, 29);
        }
        this.field4675.method1984(112, false);
        this.field4675.method1970(7, -2);
        this.field4675.method1989(-24145, 1);
        this.field4675.method1934(1, arg2);
        float var7 = 1.0F / (float) (this.field4675.field4495 * 128);
        if (arg3) {
            for (int var8 = 0; var8 < this.field4672; var8++) {
                int var9 = var8 << this.field4677;
                int var10 = var8 + 1 << this.field4677;
                label135: for (int var11 = 0; var11 < this.field4689; var11++) {
                    int var12 = var11 << this.field4677;
                    int var13 = var11 + 1 << this.field4677;
                    for (int var14 = var12; var14 < var13; var14++) {
                        if ((var14 - arg5) >= (-arg1) && var14 - arg5 <= arg1) {
                            for (int var15 = var9; var15 < var10; var15++) {
                                if ((var15 - arg0) >= (-arg1) && arg1 >= var15 - arg0 && arg4[arg1 + var14 - arg5][var15 + arg1 - arg0]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var11) / var7, (float) (-var8) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field4685[var11][var8].method3016(-13660);
                                    continue label135;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < this.field4672; var16++) {
                int var17 = var16 << this.field4677;
                int var18 = var16 + 1 << this.field4677;
                for (int var19 = 0; var19 < this.field4689; var19++) {
                    int var20 = 0;
                    int var21 = var19 << this.field4677;
                    int var22 = var19 + 1 << this.field4677;
                    class145 var23 = class494.field7307;
                    var23.field2289 = 0;
                    for (int var24 = var17; var24 < var18; var24++) {
                        if (-arg1 <= var24 - arg0 && arg1 >= (var24 - arg0)) {
                            int var25 = this.field4688.field673 * var24 + var21;
                            for (int var26 = var21; var26 < var22; var26++) {
                                if (var26 - arg5 >= -arg1 && var26 - arg5 <= arg1 && arg4[var26 + arg1 - arg5][var24 + arg1 - arg0]) {
                                    short[] var27 = this.field4688.field5889[var25];
                                    if (var27 != null) {
                                        if (this.field4675.field4599) {
                                            for (int var29 = 0; var29 < var27.length; var29++) {
                                                var23.method1094(1618659784, var27[var29] & 0xFFFF);
                                                var20++;
                                            }
                                        } else {
                                            for (int var28 = 0; var28 < var27.length; var28++) {
                                                var20++;
                                                var23.method1066(-2012325976, var27[var28] & 0xFFFF);
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
                        this.field4685[var19][var16].method3020(5123, -118, var23.field2270, var20);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(ZIIII)V", line = 281)
    private final void method2007(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field4678++;
        if (this.field4685 == null) {
            return;
        }
        int var6 = arg2 - 1 >> 7;
        int var7 = arg2 + arg4 - 2 >> 7;
        int var8 = arg1 - 1 >> 7;
        int var9 = arg1 - (1 - arg3) - 1 >> 7;
        if (arg0) {
            return;
        }
        for (int var10 = var6; var10 <= var7; var10++) {
            class504[] var11 = this.field4685[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field7448 = true;
            }
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(IILj;I)V", line = 320)
    public final void method2008(int arg0, int arg1, class377 arg2, int arg3) {
        field4679++;
        class76 var5 = (class76) arg2;
        int var6 = var5.field1266 + arg3 + 1;
        int var7 = var5.field1269 + arg1 + 1;
        int var8 = this.field4674 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field1265;
        int var11 = var5.field1268;
        int var12 = this.field4674 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var8 += this.field4674 * var13;
            var7 = 1;
            var10 -= var13;
            var9 += var11 * var13;
        }
        int var14 = 0;
        if ((var7 + var10) >= this.field4676) {
            int var15 = var7 + var10 + 1 - this.field4676;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var8 += var16;
            var9 += var16;
            var11 -= var16;
            var14 += var16;
            var12 += var16;
            var6 = 1;
        }
        if (this.field4674 <= (var6 + var11)) {
            int var17 = var6 + var11 + 1 - this.field4674;
            var11 -= var17;
            var12 += var17;
            var14 += var17;
        }
        if (var11 > arg0 && var10 > 0) {
            class170.method1244(var12, var10, var11, (byte) -76, this.field4686, var14, var8, var5.field1267, var9);
            this.method2007(false, var7, var6, var10, var11);
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(I)V", line = 390)
    public final void method2009(int arg0) {
        field4680++;
        this.field4685 = new class504[this.field4689][this.field4672];
        if (arg0 != 128) {
            return;
        }
        for (int var2 = 0; var2 < this.field4672; var2++) {
            for (int var3 = 0; var3 < this.field4689; var3++) {
                this.field4685[var3][var2] = new class504(this.field4675, this, this.field4688, var3, var2, this.field4677, var3 * 128 + 1, var2 * 128 + 1);
            }
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(Lj;III)V", line = 432)
    public final void method2010(class377 arg0, int arg1, int arg2, int arg3) {
        field4684++;
        class76 var5 = (class76) arg0;
        int var6 = var5.field1266 + arg1 + 1;
        int var7 = var5.field1269 + arg3 + arg2;
        int var8 = this.field4674 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field1265;
        int var11 = var5.field1268;
        int var12 = this.field4674 - var11;
        int var13 = 0;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var10 -= var14;
            var8 += this.field4674 * var14;
            var7 = 1;
            var9 += var11 * var14;
        }
        if ((var7 + var10) >= this.field4676) {
            int var15 = var10 + var7 + 1 - this.field4676;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var11 -= var16;
            var8 += var16;
            var12 += var16;
            var13 += var16;
            var6 = 1;
            var9 += var16;
        }
        if (this.field4674 <= (var6 + var11)) {
            int var17 = var6 + var11 + 1 - this.field4674;
            var13 += var17;
            var11 -= var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class321.method2094(var9, var5.field1267, var8, var12, 72, this.field4686, var11, var10, var13);
            this.method2007(false, var7, var6, var10, var11);
        }
    }

    @OriginalMember(owner = "client!lv", name = "<init>", descriptor = "(Lvj;Lsi;)V", line = 503)
    public class306(class303 arg0, class390 arg1) {
        this.field4688 = arg1;
        this.field4675 = arg0;
        this.field4674 = (this.field4688.field676 * this.field4688.field673 >> this.field4675.field4492) + 2;
        this.field4676 = (this.field4688.field678 * this.field4688.field676 >> this.field4675.field4492) + 2;
        this.field4686 = new byte[this.field4676 * this.field4674];
        this.field4677 = this.field4675.field4492 + 7 - this.field4688.field679;
        this.field4689 = this.field4688.field673 >> this.field4677;
        this.field4672 = this.field4688.field678 >> this.field4677;
    }
}
