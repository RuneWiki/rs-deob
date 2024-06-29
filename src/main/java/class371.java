import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class371 {

    @OriginalMember(owner = "client!ts", name = "k", descriptor = "Lui;")
    private class151 field5000;

    @OriginalMember(owner = "client!ts", name = "i", descriptor = "Lbo;")
    private class511 field4998;

    @OriginalMember(owner = "client!ts", name = "r", descriptor = "I")
    public int field5007;

    @OriginalMember(owner = "client!ts", name = "n", descriptor = "I")
    private int field5003;

    @OriginalMember(owner = "client!ts", name = "d", descriptor = "[B")
    public byte[] field4993;

    @OriginalMember(owner = "client!ts", name = "h", descriptor = "I")
    private int field4997;

    @OriginalMember(owner = "client!ts", name = "p", descriptor = "I")
    private int field5005;

    @OriginalMember(owner = "client!ts", name = "l", descriptor = "I")
    private int field5001;

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "I")
    public static int field4991 = 0;

    @OriginalMember(owner = "client!ts", name = "f", descriptor = "I")
    public static int field4995 = 0;

    @OriginalMember(owner = "client!ts", name = "q", descriptor = "Ljava/lang/String;")
    public static String field5006 = "";

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "I")
    public static int field4992;

    @OriginalMember(owner = "client!ts", name = "e", descriptor = "I")
    public static int field4994;

    @OriginalMember(owner = "client!ts", name = "g", descriptor = "I")
    public static int field4996;

    @OriginalMember(owner = "client!ts", name = "j", descriptor = "I")
    public static int field4999;

    @OriginalMember(owner = "client!ts", name = "m", descriptor = "I")
    public static int field5002;

    @OriginalMember(owner = "client!ts", name = "o", descriptor = "I")
    public static int field5004;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "[[Llq;")
    private class385[][] field4990;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IBILj;)V", line = 3)
    public final void method2144(int arg0, byte arg1, int arg2, class377 arg3) {
        field4994++;
        class292 var5 = (class292) arg3;
        int var6 = var5.field3829 + arg0 + 1;
        int var7 = var5.field3838 + arg2 + 1;
        int var8 = var6 + (this.field5007 * var7);
        int var9 = 0;
        int var10 = var5.field3827;
        int var11 = var5.field3835;
        int var12 = this.field5007 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var9 += var11 * var13;
            var7 = 1;
            var10 -= var13;
            var8 += this.field5007 * var13;
        }
        int var14 = 0;
        int var15 = -50 % ((arg1 + 46) / 52);
        if (this.field5003 <= (var7 + var10)) {
            int var16 = var7 + var10 + 1 - this.field5003;
            var10 -= var16;
        }
        if (var6 <= 0) {
            int var17 = 1 - var6;
            var14 += var17;
            var11 -= var17;
            var12 += var17;
            var8 += var17;
            var9 += var17;
            var6 = 1;
        }
        if (this.field5007 <= var6 + var11) {
            int var18 = var6 - (-var11 - 1) - this.field5007;
            var11 -= var18;
            var12 += var18;
            var14 += var18;
        }
        if (var11 > 0 && var10 > 0) {
            class21.method196(var10, this.field4993, var5.field3828, var9, var12, var14, var11, var8, 44);
            this.method2148(var10, var7, var6, 1, var11);
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(ILj;IB)V", line = 75)
    public final void method2145(int arg0, class377 arg1, int arg2, byte arg3) {
        field5002++;
        class292 var5 = (class292) arg1;
        int var6 = var5.field3829 + arg2 + 1;
        int var7 = var5.field3838 + arg0 + 1;
        int var8 = this.field5007 * var7 + var6;
        int var9 = 117 % ((arg3 + 12) / 58);
        int var10 = 0;
        int var11 = var5.field3827;
        int var12 = var5.field3835;
        int var13 = this.field5007 - var12;
        int var14 = 0;
        if (var7 <= 0) {
            int var15 = 1 - var7;
            var8 += this.field5007 * var15;
            var7 = 1;
            var11 -= var15;
            var10 += var12 * var15;
        }
        if (this.field5003 <= (var7 + var11)) {
            int var16 = var7 + var11 + 1 - this.field5003;
            var11 -= var16;
        }
        if (var6 <= 0) {
            int var17 = 1 - var6;
            var6 = 1;
            var12 -= var17;
            var8 += var17;
            var14 += var17;
            var10 += var17;
            var13 += var17;
        }
        if (this.field5007 <= var6 + var12) {
            int var18 = var6 + var12 + 1 - this.field5007;
            var14 += var18;
            var13 += var18;
            var12 -= var18;
        }
        if (var12 > 0 && var11 > 0) {
            class273.method1624(var10, var8, var12, var14, this.field4993, 1906915842, var5.field3828, var11, var13);
            this.method2148(var11, var7, var6, 1, var12);
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lj;III)Z", line = 150)
    public final boolean method2146(class377 arg0, int arg1, int arg2, int arg3) {
        field4992++;
        class292 var5 = (class292) arg0;
        int var6 = var5.field3838 + arg2 + 1;
        int var7 = var5.field3829 + arg1 + 1;
        int var8 = this.field5007 * var6 + var7;
        if (arg3 > -29) {
            return true;
        }
        int var9 = var5.field3827;
        int var10 = var5.field3835;
        if (var6 <= 0) {
            int var11 = 1 - var6;
            var8 += this.field5007 * var11;
            var6 = 1;
            var9 -= var11;
        }
        int var12 = this.field5007 - var10;
        if (this.field5003 <= (var6 + var9)) {
            int var13 = var6 + var9 + 1 - this.field5003;
            var9 -= var13;
        }
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var12 += var14;
            var7 = 1;
            var10 -= var14;
            var8 += var14;
        }
        if (this.field5007 <= (var7 + var10)) {
            int var15 = var7 + var10 + 1 - this.field5007;
            var10 -= var15;
            var12 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field5007 + var12;
            return class22.method203((byte) 118, var9, var8, var17, var16, this.field4993, var10);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)V", line = 230)
    public static void method2147(int arg0) {
        field5006 = null;
        if (arg0 >= -110) {
            method2147(-88);
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIIII)V", line = 243)
    private final void method2148(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5004++;
        if (this.field4990 == null) {
            return;
        }
        int var6 = arg2 - 1 >> 7;
        int var7 = arg2 + arg4 - 1 - 1 >> 7;
        int var8 = arg1 - 1 >> 7;
        int var9 = arg1 - (arg3 - arg0) - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class385[] var11 = this.field4990[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field5241 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIII)V", line = 285)
    public static final void method2149(int arg0, int arg1, int arg2, int arg3) {
        class409 var4 = class497.field6886[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class11 var5 = var4.field5625;
        class11 var6 = var4.field5628;
        if (var5 != null) {
            var5.field233 = var5.field233 * arg3 / (0x10 << class530.field7813 - 7);
            var5.field235 = var5.field235 * arg3 / (0x10 << class530.field7813 - 7);
        }
        if (var6 != null) {
            var6.field233 = var6.field233 * arg3 / (0x10 << class530.field7813 - 7);
            var6.field235 = var6.field235 * arg3 / (0x10 << class530.field7813 - 7);
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IBZI[[ZI)V", line = 307)
    public final void method2150(int arg0, byte arg1, boolean arg2, int arg3, boolean[][] arg4, int arg5) {
        field4996++;
        this.field4998.method2969(false, 4940);
        this.field4998.method2951(false, 34018);
        this.field4998.method2935(47, -2);
        this.field4998.method2976((byte) 70, 1);
        this.field4998.method2978(1, (byte) -48);
        float var7 = 1.0F / (float) (this.field4998.field7401 * 128);
        if (arg2) {
            for (int var8 = 0; var8 < this.field5001; var8++) {
                int var9 = var8 << this.field4997;
                int var10 = var8 + 1 << this.field4997;
                label132: for (int var11 = 0; var11 < this.field5005; var11++) {
                    int var12 = var11 << this.field4997;
                    int var13 = var11 + 1 << this.field4997;
                    for (int var14 = var12; var14 < var13; var14++) {
                        if ((var14 - arg0) >= (-arg5) && arg5 >= (var14 - arg0)) {
                            for (int var15 = var9; var15 < var10; var15++) {
                                if ((-arg5) <= (var15 - arg3) && (var15 - arg3) <= arg5 && arg4[arg5 + var14 - arg0][arg5 + var15 - arg3]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var11) / var7, (float) (-var8) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field4990[var11][var8].method2276((byte) 0);
                                    continue label132;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < this.field5001; var16++) {
                int var18 = var16 << this.field4997;
                int var19 = var16 + 1 << this.field4997;
                for (int var20 = 0; var20 < this.field5005; var20++) {
                    int var21 = 0;
                    int var22 = var20 << this.field4997;
                    int var23 = var20 + 1 << this.field4997;
                    class379 var24 = class109.field1579;
                    var24.field5173 = 0;
                    for (int var25 = var18; var25 < var19; var25++) {
                        if ((var25 - arg3) >= (-arg5) && arg5 >= var25 - arg3) {
                            int var26 = this.field5000.field557 * var25 + var22;
                            for (int var27 = var22; var27 < var23; var27++) {
                                if ((var27 - arg0) >= (-arg5) && var27 - arg0 <= arg5 && arg4[var27 + arg5 - arg0][var25 + arg5 - arg3]) {
                                    short[] var28 = this.field5000.field2152[var26];
                                    if (var28 != null) {
                                        if (this.field4998.field7493) {
                                            for (int var30 = 0; var30 < var28.length; var30++) {
                                                var21++;
                                                var24.method2246(var28[var30] & 0xFFFF, (byte) -115);
                                            }
                                        } else {
                                            for (int var29 = 0; var29 < var28.length; var29++) {
                                                var24.method2215(var28[var29] & 0xFFFF, (byte) 88);
                                                var21++;
                                            }
                                        }
                                    }
                                }
                                var26++;
                            }
                        }
                    }
                    if (var21 > 0) {
                        OpenGL.glMatrixMode(5890);
                        OpenGL.glLoadIdentity();
                        OpenGL.glScalef(var7, var7, 1.0F);
                        OpenGL.glTranslatef((float) (-var20) / var7, (float) (-var16) / var7, 1.0F);
                        OpenGL.glMatrixMode(5888);
                        this.field4990[var20][var16].method2275(var24.field5152, 5123, var21, -106);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        int var17 = 118 % ((-arg1 - 32) / 46);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(Z)V", line = 494)
    public final void method2151(boolean arg0) {
        if (!arg0) {
            this.field4990 = null;
        }
        field4999++;
        this.field4990 = new class385[this.field5005][this.field5001];
        for (int var2 = 0; var2 < this.field5001; var2++) {
            for (int var3 = 0; var3 < this.field5005; var3++) {
                this.field4990[var3][var2] = new class385(this.field4998, this, this.field5000, var3, var2, this.field4997, var3 * 128 + 1, var2 * 128 + 1);
            }
        }
    }

    @OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(Lbo;Lui;)V", line = 527)
    public class371(class511 arg0, class151 arg1) {
        this.field5000 = arg1;
        this.field4998 = arg0;
        this.field5007 = (this.field5000.field557 * this.field5000.field555 >> this.field4998.field7403) + 2;
        this.field5003 = (this.field5000.field559 * this.field5000.field555 >> this.field4998.field7403) + 2;
        this.field4993 = new byte[this.field5007 * this.field5003];
        this.field4997 = this.field4998.field7403 + 7 - this.field5000.field558;
        this.field5005 = this.field5000.field557 >> this.field4997;
        this.field5001 = this.field5000.field559 >> this.field4997;
    }
}
