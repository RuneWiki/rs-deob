import jaggl.OpenGL;
import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class377 {

    @OriginalMember(owner = "client!we", name = "m", descriptor = "Lck;")
    private class733 field4614;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "Llc;")
    private class455 field4602;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "I")
    public int field4616;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    private int field4603;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "I")
    private int field4611;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "[B")
    public byte[] field4604;

    @OriginalMember(owner = "client!we", name = "q", descriptor = "I")
    private int field4618;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "I")
    private int field4612;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "Ljava/lang/String;")
    public static String field4615;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "Ljava/lang/String;")
    public static String field4606;

    @OriginalMember(owner = "client!we", name = "s", descriptor = "Luaa;")
    public static class391 field4620;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!we", name = "t", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!we", name = "v", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "Lpu;")
    public static class772 field4617;

    @OriginalMember(owner = "client!we", name = "r", descriptor = "[Ldf;")
    public static class646[] field4619;

    @OriginalMember(owner = "client!we", name = "u", descriptor = "[[Lhba;")
    private class201[][] field4622;

    static {
        String var0 = "Unknown";
        try {
            var0 = System.getProperty("java.vendor").toLowerCase();
        } catch (Exception var11) {
        }
        var0.toLowerCase();
        String var1 = "Unknown";
        try {
            var1 = System.getProperty("java.version").toLowerCase();
        } catch (Exception var10) {
        }
        var1.toLowerCase();
        String var2 = "Unknown";
        try {
            var2 = System.getProperty("os.name").toLowerCase();
        } catch (Exception var9) {
        }
        field4615 = var2.toLowerCase();
        String var3 = "Unknown";
        try {
            var3 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var8) {
        }
        field4606 = var3.toLowerCase();
        String var4 = "Unknown";
        try {
            var4 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var7) {
        }
        var4.toLowerCase();
        String var5 = "~/";
        try {
            var5 = System.getProperty("user.home").toLowerCase();
        } catch (Exception var6) {
        }
        new File(var5);
        field4620 = null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V", line = 3)
    public static void method2155(int arg0) {
        field4617 = null;
        field4606 = null;
        int var1 = 98 % ((-arg0 - 9) / 45);
        field4615 = null;
        field4619 = null;
        field4620 = null;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V", line = 16)
    public static final void method2156(int arg0) {
        class294.field3738.method2919(0);
        field4608++;
        class282.field3656.method2919(0);
        class781.field10682.method2919(arg0 ^ arg0);
        class615.field7807.method2919(0);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IILr;I)V", line = 27)
    public final void method2157(int arg0, int arg1, class736 arg2, int arg3) {
        field4623++;
        class474 var5 = (class474) arg2;
        int var6 = var5.field6164 + arg1 + 1;
        if (arg0 != -7740) {
            field4617 = null;
        }
        int var7 = var5.field6171 + arg3 + 1;
        int var8 = this.field4616 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field6165;
        int var11 = var5.field6170;
        int var12 = this.field4616 - var11;
        int var13 = 0;
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var6 = 1;
            var9 += var11 * var14;
            var10 -= var14;
            var8 += this.field4616 * var14;
        }
        if (var6 + var10 >= this.field4603) {
            int var15 = var10 + var6 + 1 - this.field4603;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var8 += var16;
            var9 += var16;
            var13 += var16;
            var12 += var16;
            var7 = 1;
            var11 -= var16;
        }
        if (this.field4616 <= var7 + var11) {
            int var17 = var7 + var11 + 1 - this.field4616;
            var13 += var17;
            var11 -= var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class689.method3682(var10, var8, arg0 + 7743, var13, var5.field6163, this.field4604, var12, var11, var9);
            this.method2158(var6, (byte) -122, var10, var11, var7);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IBIII)V", line = 98)
    private final void method2158(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field4609++;
        if (this.field4622 == null) {
            return;
        }
        int var6 = arg4 - 1 >> 7;
        int var7 = arg3 + arg4 - 1 - 1 >> 7;
        int var8 = arg0 - 1 >> 7;
        if (arg1 > -110) {
            this.method2160(false, 23, -43, null, -35, -64);
        }
        int var9 = arg0 + arg2 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class201[] var11 = this.field4622[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field2788 = true;
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V", line = 140)
    public final void method2159(byte arg0) {
        if (arg0 != -91) {
            this.field4622 = null;
        }
        field4613++;
        this.field4622 = new class201[this.field4618][this.field4612];
        for (int var2 = 0; var2 < this.field4612; var2++) {
            for (int var3 = 0; var3 < this.field4618; var3++) {
                this.field4622[var3][var2] = new class201(this.field4614, this, this.field4602, var3, var2, this.field4611, var3 * 128 + 1, var2 * 128 + 1);
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ZII[[ZII)V", line = 170)
    public final void method2160(boolean arg0, int arg1, int arg2, boolean[][] arg3, int arg4, int arg5) {
        field4610++;
        this.field4614.method3974(false, 5);
        this.field4614.method3986((byte) -124, false);
        this.field4614.method3935(-2, (byte) -42);
        this.field4614.method3979((byte) -91, 1);
        this.field4614.method3920(arg1, 9770);
        float var7 = 1.0F / (float) (this.field4614.field9805 * 128);
        if (arg0) {
            for (int var8 = 0; var8 < this.field4612; var8++) {
                int var9 = var8 << this.field4611;
                int var10 = var8 + 1 << this.field4611;
                label132: for (int var11 = 0; var11 < this.field4618; var11++) {
                    int var12 = var11 << this.field4611;
                    int var13 = var11 + 1 << this.field4611;
                    for (int var14 = var12; var14 < var13; var14++) {
                        if ((-arg4) <= (var14 - arg2) && var14 - arg2 <= arg4) {
                            for (int var15 = var9; var15 < var10; var15++) {
                                if ((var15 - arg5) >= (-arg4) && var15 - arg5 <= arg4 && arg3[arg4 + var14 - arg2][var15 + arg4 - arg5]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var11) / var7, (float) (-var8) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field4622[var11][var8].method1374(21665);
                                    continue label132;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < this.field4612; var16++) {
                int var17 = var16 << this.field4611;
                int var18 = var16 + 1 << this.field4611;
                for (int var19 = 0; var19 < this.field4618; var19++) {
                    int var20 = 0;
                    int var21 = var19 << this.field4611;
                    int var22 = var19 + 1 << this.field4611;
                    class333 var23 = this.field4614.field9928;
                    var23.field3133 = 0;
                    for (int var24 = var17; var24 < var18; var24++) {
                        if ((-arg4) <= (var24 - arg5) && arg4 >= (var24 - arg5)) {
                            int var25 = this.field4602.field4366 * var24 + var21;
                            for (int var26 = var21; var26 < var22; var26++) {
                                if (-arg4 <= var26 - arg2 && arg4 >= (var26 - arg2) && arg3[arg4 + var26 - arg2][arg4 + var24 - arg5]) {
                                    short[] var27 = this.field4602.field5928[var25];
                                    if (var27 != null) {
                                        if (this.field4614.field9865) {
                                            for (int var29 = 0; var29 < var27.length; var29++) {
                                                var20++;
                                                var23.method1541(374, var27[var29] & 0xFFFF);
                                            }
                                        } else {
                                            for (int var28 = 0; var28 < var27.length; var28++) {
                                                var23.method1514(var27[var28] & 0xFFFF, (byte) -59);
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
                        this.field4622[var19][var16].method1372(5123, var23.field3193, (byte) 52, var20);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILr;II)Z", line = 354)
    public final boolean method2161(int arg0, class736 arg1, int arg2, int arg3) {
        field4605++;
        class474 var5 = (class474) arg1;
        int var6 = var5.field6164 + arg3 + 1;
        int var7 = var5.field6171 + arg0 + 1;
        int var8 = -44 / ((arg2 - 56) / 49);
        int var9 = this.field4616 * var6 + var7;
        int var10 = var5.field6165;
        int var11 = var5.field6170;
        int var12 = this.field4616 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var6 = 1;
            var10 -= var13;
            var9 += this.field4616 * var13;
        }
        if (this.field4603 <= var6 + var10) {
            int var14 = var6 + var10 + 1 - this.field4603;
            var10 -= var14;
        }
        if (var7 <= 0) {
            int var15 = 1 - var7;
            var12 += var15;
            var7 = 1;
            var9 += var15;
            var11 -= var15;
        }
        if (this.field4616 <= var7 + var11) {
            int var16 = var7 + var11 + 1 - this.field4616;
            var11 -= var16;
            var12 += var16;
        }
        if (var11 > 0 && var10 > 0) {
            byte var17 = 8;
            int var18 = (var17 - 1) * this.field4616 + var12;
            return class299.method1779(var18, var9, var10, var17, var11, 2, this.field4604);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(IILr;I)V", line = 426)
    public final void method2162(int arg0, int arg1, class736 arg2, int arg3) {
        int var5 = -42 / ((arg1 - 22) / 36);
        field4607++;
        class474 var6 = (class474) arg2;
        int var7 = var6.field6164 + arg3 + 1;
        int var8 = var6.field6171 + arg0 + 1;
        int var9 = this.field4616 * var7 + var8;
        int var10 = 0;
        int var11 = var6.field6165;
        int var12 = var6.field6170;
        int var13 = this.field4616 - var12;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var11 -= var14;
            var7 = 1;
            var9 += this.field4616 * var14;
            var10 += var12 * var14;
        }
        int var15 = 0;
        if ((var7 + var11) >= this.field4603) {
            int var16 = var7 + var11 + 1 - this.field4603;
            var11 -= var16;
        }
        if (var8 <= 0) {
            int var17 = 1 - var8;
            var8 = 1;
            var13 += var17;
            var10 += var17;
            var15 += var17;
            var12 -= var17;
            var9 += var17;
        }
        if (this.field4616 <= (var8 + var12)) {
            int var18 = var8 + var12 + 1 - this.field4616;
            var13 += var18;
            var12 -= var18;
            var15 += var18;
        }
        if (var12 > 0 && var11 > 0) {
            class386.method2221((byte) -78, var10, this.field4604, var9, var12, var11, var13, var15, var6.field6163);
            this.method2158(var7, (byte) -123, var11, var12, var8);
        }
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lck;Llc;)V", line = 560)
    public class377(class733 arg0, class455 arg1) {
        this.field4614 = arg0;
        this.field4602 = arg1;
        this.field4616 = (this.field4602.field4369 * this.field4602.field4366 >> this.field4614.field9804) + 2;
        this.field4603 = (this.field4602.field4371 * this.field4602.field4369 >> this.field4614.field9804) + 2;
        this.field4611 = this.field4614.field9804 + 7 - this.field4602.field4372;
        this.field4604 = new byte[this.field4616 * this.field4603];
        this.field4618 = this.field4602.field4366 >> this.field4611;
        this.field4612 = this.field4602.field4371 >> this.field4611;
    }
}
