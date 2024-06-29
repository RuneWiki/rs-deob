import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class57 {

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "Lkfa;")
    private class382 field841;

    @OriginalMember(owner = "client!oi", name = "u", descriptor = "Lfw;")
    private class636 field859;

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "I")
    public int field849;

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "I")
    private int field851;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "[B")
    public byte[] field842;

    @OriginalMember(owner = "client!oi", name = "r", descriptor = "I")
    private int field856;

    @OriginalMember(owner = "client!oi", name = "v", descriptor = "I")
    private int field860;

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "I")
    private int field848;

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "Lvh;")
    public static class125 field846 = new class125(78, -1);

    @OriginalMember(owner = "client!oi", name = "s", descriptor = "Ljava/lang/String;")
    public static String field857 = null;

    @OriginalMember(owner = "client!oi", name = "q", descriptor = "[I")
    public static int[] field855 = new int[2048];

    @OriginalMember(owner = "client!oi", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field854 = new String[100];

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!oi", name = "o", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!oi", name = "t", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!oi", name = "w", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!oi", name = "n", descriptor = "Lvo;")
    public static class345 field852;

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "[[Lfl;")
    private class104[][] field845;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IZIII[[Z)V")
    public final void method490(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean[][] arg5) {
        this.field841.method2272(false, (byte) -9);
        field847++;
        this.field841.method2275(false, 89);
        this.field841.method2321(-1111, -2);
        this.field841.method2270(1, (byte) 110);
        this.field841.method2325(1, (byte) 45);
        if (arg0 >= -31) {
            field854 = null;
        }
        float var7 = 1.0F / (float) (this.field841.field5459 * 128);
        if (arg1) {
            for (int var8 = 0; var8 < this.field848; var8++) {
                int var9 = var8 << this.field856;
                int var10 = var8 + 1 << this.field856;
                label135: for (int var11 = 0; var11 < this.field860; var11++) {
                    int var12 = var11 << this.field856;
                    int var13 = var11 + 1 << this.field856;
                    for (int var14 = var12; var14 < var13; var14++) {
                        if (-arg2 <= var14 - arg4 && (var14 - arg4) <= arg2) {
                            for (int var15 = var9; var15 < var10; var15++) {
                                if (var15 - arg3 >= -arg2 && arg2 >= var15 - arg3 && arg5[var14 + arg2 - arg4][arg2 + var15 - arg3]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var11) / var7, (float) (-var8) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field845[var11][var8].method872((byte) -2);
                                    continue label135;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < this.field848; var16++) {
                int var17 = var16 << this.field856;
                int var18 = var16 + 1 << this.field856;
                for (int var19 = 0; var19 < this.field860; var19++) {
                    int var20 = 0;
                    int var21 = var19 << this.field856;
                    int var22 = var19 + 1 << this.field856;
                    class351 var23 = this.field841.field5537;
                    var23.field6710 = 0;
                    for (int var24 = var17; var24 < var18; var24++) {
                        if (var24 - arg3 >= -arg2 && arg2 >= (var24 - arg3)) {
                            int var25 = this.field859.field9706 * var24 + var21;
                            for (int var26 = var21; var26 < var22; var26++) {
                                if ((-arg2) <= (var26 - arg4) && var26 - arg4 <= arg2 && arg5[var26 - (arg4 - arg2)][arg2 + var24 - arg3]) {
                                    short[] var27 = this.field859.field9026[var25];
                                    if (var27 != null) {
                                        if (this.field841.field5558) {
                                            for (int var29 = 0; var29 < var27.length; var29++) {
                                                var23.method2739((byte) -86, var27[var29] & 0xFFFF);
                                                var20++;
                                            }
                                        } else {
                                            for (int var28 = 0; var28 < var27.length; var28++) {
                                                var23.method2742(var27[var28] & 0xFFFF, -1557853240);
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
                        this.field845[var19][var16].method876(5123, 32768, var23.field6719, var20);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IZ)V")
    public static final void method491(int arg0, boolean arg1) {
        field861++;
        int var2 = class148.field2508 - class583.field8548;
        if (var2 >= 100) {
            class76.field1181 = -1;
            class294.field4104 = -1;
            class40.field544 = 1;
        } else if (arg1) {
            int var3 = (int) class636.field9031;
            if ((class487.field6964 >> 8) > var3) {
                var3 = class487.field6964 >> 8;
            }
            if (class73.field1162[4] && var3 < (class528.field7759[4] + 128)) {
                var3 = class528.field7759[4] + 128;
            }
            int var4 = (int) class473.field6790 + class137.field2215 & 0x3FFF;
            class211.method1446((byte) 79, var4, arg0, class603.method3433(class103.field1708.field3154, class416.field5926, class103.field1708.field3155, -128) - 200, (var3 >> 3) * 3 + 600 << 2, var3, class392.field5704, class606.field8728);
            float var5 = 1.0F - (float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F;
            class551.field8078 = (int) ((float) (class551.field8078 - class307.field4274) * var5 + (float) class307.field4274);
            class277.field3933 = (int) ((float) (class277.field3933 - class424.field6053) * var5 + (float) class424.field6053);
            class322.field4478 = (int) ((float) (class322.field4478 - class225.field3368) * var5 + (float) class225.field3368);
            class666.field9366 = (int) ((float) (class666.field9366 - class29.field405) * var5 + (float) class29.field405);
            int var6 = class432.field6220 - class698.field9896;
            if (var6 > 8192) {
                var6 -= 16384;
            } else if (var6 < -8192) {
                var6 += 16384;
            }
            class432.field6220 = (int) ((float) var6 * var5 + (float) class698.field9896);
            class432.field6220 &= 0x3FFF;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lha;III)V")
    public final void method492(class427 arg0, int arg1, int arg2, int arg3) {
        field844++;
        class134 var5 = (class134) arg0;
        int var6 = var5.field2161 + arg3 + 1;
        int var7 = var5.field2159 + arg1 + 1;
        int var8 = var6 + (this.field849 * var7);
        int var9 = 0;
        if (arg2 != 23958) {
            method491(-26, false);
        }
        int var10 = var5.field2165;
        int var11 = var5.field2168;
        int var12 = this.field849 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var8 += this.field849 * var13;
            var10 -= var13;
            var7 = 1;
            var9 += var11 * var13;
        }
        int var14 = 0;
        if ((var7 + var10) >= this.field851) {
            int var15 = var7 + var10 - (-1 - -this.field851);
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var11 -= var16;
            var12 += var16;
            var6 = 1;
            var9 += var16;
            var8 += var16;
            var14 += var16;
        }
        if (var6 + var11 >= this.field849) {
            int var17 = var11 + var6 + 1 - this.field849;
            var14 += var17;
            var12 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            class616.method3485(var14, 16, var11, var5.field2162, var9, var12, this.field842, var8, var10);
            this.method495(-102, var11, var6, var10, var7);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Z)V")
    public final void method493(boolean arg0) {
        field843++;
        this.field845 = new class104[this.field860][this.field848];
        int var2 = 0;
        if (!arg0) {
            this.method496(-86, (byte) 99, null, -56);
        }
        while (this.field848 > var2) {
            for (int var3 = 0; var3 < this.field860; var3++) {
                this.field845[var3][var2] = new class104(this.field841, this, this.field859, var3, var2, this.field856, var3 * 128 + 1, var2 * 128 + 1);
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method494(String arg0, byte arg1) {
        field853++;
        if (arg0 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg0.length();
        while (var3 > var2 && class450.method2620(arg0.charAt(var2), 5)) {
            var2++;
        }
        if (arg1 <= 67) {
            return null;
        }
        while (var3 > var2 && class450.method2620(arg0.charAt(var3 - 1), 5)) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg0.charAt(var6);
            if (class113.method917(var7, 0)) {
                char var8 = class617.method3490(false, var7);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
        }
        if (var5.length() == 0) {
            return null;
        } else {
            return var5.toString();
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIII)V")
    private final void method495(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field840++;
        if (this.field845 == null) {
            return;
        }
        if (arg0 > -90) {
            this.field860 = 44;
        }
        int var6 = arg2 - 1 >> 7;
        int var7 = arg1 + arg2 - 1 - 1 >> 7;
        int var8 = arg4 - 1 >> 7;
        int var9 = arg3 + arg4 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class104[] var11 = this.field845[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field1720 = true;
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IBLha;I)V")
    public final void method496(int arg0, byte arg1, class427 arg2, int arg3) {
        field839++;
        class134 var5 = (class134) arg2;
        int var6 = var5.field2161 + arg3 + 1;
        int var7 = var5.field2159 + arg0 + 1;
        int var8 = this.field849 * var7 + var6;
        int var9 = 0;
        if (arg1 <= 74) {
            this.field859 = null;
        }
        int var10 = var5.field2165;
        int var11 = var5.field2168;
        int var12 = this.field849 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var10 -= var13;
            var7 = 1;
            var8 += this.field849 * var13;
            var9 += var11 * var13;
        }
        int var14 = 0;
        if ((var7 + var10) >= this.field851) {
            int var15 = var7 + var10 + 1 - this.field851;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var8 += var16;
            var14 += var16;
            var9 += var16;
            var6 = 1;
            var11 -= var16;
            var12 += var16;
        }
        if (this.field849 <= var6 + var11) {
            int var17 = var6 + var11 + 1 - this.field849;
            var11 -= var17;
            var14 += var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class662.method3721(var8, var9, var11, (byte) -103, this.field842, var14, var10, var5.field2162, var12);
            this.method495(-92, var11, var6, var10, var7);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V")
    public static void method497(int arg0) {
        field852 = null;
        if (arg0 != -30491) {
            field855 = null;
        }
        field855 = null;
        field854 = null;
        field846 = null;
        field857 = null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IILha;I)Z")
    public final boolean method498(int arg0, int arg1, class427 arg2, int arg3) {
        field858++;
        class134 var5 = (class134) arg2;
        int var6 = var5.field2159 + arg0 + arg1;
        int var7 = var5.field2161 + arg3 + 1;
        int var8 = var7 + (this.field849 * var6);
        int var9 = var5.field2165;
        int var10 = var5.field2168;
        if (var6 <= 0) {
            int var11 = 1 - var6;
            var9 -= var11;
            var6 = 1;
            var8 += this.field849 * var11;
        }
        int var12 = this.field849 - var10;
        if (this.field851 <= (var6 + var9)) {
            int var13 = var6 + var9 + 1 - this.field851;
            var9 -= var13;
        }
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var12 += var14;
            var7 = 1;
            var10 -= var14;
            var8 += var14;
        }
        if (this.field849 <= var7 + var10) {
            int var15 = var7 + var10 + 1 - this.field849;
            var10 -= var15;
            var12 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field849 + var12;
            return class366.method2200(var9, 0, var10, var8, this.field842, var17, var16);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lkfa;Lfw;)V")
    public class57(class382 arg0, class636 arg1) {
        this.field841 = arg0;
        this.field859 = arg1;
        this.field849 = (this.field859.field9709 * this.field859.field9706 >> this.field841.field5457) + 2;
        this.field851 = (this.field859.field9709 * this.field859.field9703 >> this.field841.field5457) + 2;
        this.field842 = new byte[this.field851 * this.field849];
        this.field856 = this.field841.field5457 + 7 - this.field859.field9707;
        this.field860 = this.field859.field9706 >> this.field856;
        this.field848 = this.field859.field9703 >> this.field856;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lek;I)Lcda;")
    public static final class533 method499(class465 arg0, int arg1) {
        field850++;
        class567 var2 = class105.method883(1, arg0);
        if (arg1 == -10768) {
            int var3 = arg0.method2691((byte) -67);
            int var4 = arg0.method2691((byte) -67);
            return new class533(var2.field8302, var2.field8299, var2.field8301, var2.field8295, var2.field8300, var2.field8291, var2.field8293, var2.field8294, var2.field8297, var3, var4);
        } else {
            return null;
        }
    }
}
