import jaggl.OpenGL;
import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class317 {

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "Lsb;")
    private class244 field4353;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "Lte;")
    private class527 field4352;

    @OriginalMember(owner = "client!ku", name = "o", descriptor = "I")
    public int field4366;

    @OriginalMember(owner = "client!ku", name = "e", descriptor = "I")
    private int field4356;

    @OriginalMember(owner = "client!ku", name = "l", descriptor = "[B")
    public byte[] field4363;

    @OriginalMember(owner = "client!ku", name = "j", descriptor = "I")
    private int field4361;

    @OriginalMember(owner = "client!ku", name = "d", descriptor = "I")
    private int field4355;

    @OriginalMember(owner = "client!ku", name = "n", descriptor = "I")
    private int field4365;

    @OriginalMember(owner = "client!ku", name = "g", descriptor = "Llu;")
    public static class610 field4358 = new class610(81, 8);

    @OriginalMember(owner = "client!ku", name = "s", descriptor = "Lwf;")
    public static class117 field4370 = new class117(200);

    @OriginalMember(owner = "client!ku", name = "t", descriptor = "Lada;")
    public static class144 field4371 = new class144(30, 1);

    @OriginalMember(owner = "client!ku", name = "v", descriptor = "I")
    public static int field4373 = 10;

    @OriginalMember(owner = "client!ku", name = "u", descriptor = "[[I")
    public static int[][] field4372 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!ku", name = "f", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!ku", name = "h", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!ku", name = "i", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!ku", name = "k", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!ku", name = "m", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!ku", name = "p", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!ku", name = "q", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!ku", name = "r", descriptor = "I")
    public static int field4369;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ku", name = "w", descriptor = "Ljava/lang/Class;")
    public static Class field4374;

    @OriginalMember(owner = "client!ku", name = "c", descriptor = "[[Ljm;")
    private class592[][] field4354;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1923(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(B)V", line = 3)
    public final void method1915(byte arg0) {
        field4359++;
        this.field4354 = new class592[this.field4355][this.field4365];
        int var2 = 0;
        if (arg0 >= -30) {
            this.field4355 = 125;
        }
        while (this.field4365 > var2) {
            for (int var3 = 0; var3 < this.field4355; var3++) {
                this.field4354[var3][var2] = new class592(this.field4352, this, this.field4353, var3, var2, this.field4361, var3 * 128 + 1, var2 * 128 + 1);
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IILk;I)V", line = 32)
    public final void method1916(int arg0, int arg1, class485 arg2, int arg3) {
        field4368++;
        class198 var5 = (class198) arg2;
        int var6 = var5.field2923 + arg0 + 1;
        int var7 = var5.field2916 + arg1 + 1;
        int var8 = var6 + (this.field4366 * var7);
        int var9 = 0;
        int var10 = var5.field2917;
        int var11 = var5.field2918;
        int var12 = this.field4366 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var8 += this.field4366 * var13;
            var9 += var11 * var13;
            var10 -= var13;
            var7 = 1;
        }
        int var14 = 0;
        if (var7 + var10 >= this.field4356) {
            int var15 = var7 + var10 + 1 - this.field4356;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var9 += var16;
            var12 += var16;
            var14 += var16;
            var11 -= var16;
            var8 += var16;
            var6 = 1;
        }
        if ((var6 + var11) >= this.field4366) {
            int var17 = var11 + var6 + 1 - this.field4366;
            var12 += var17;
            var11 -= var17;
            var14 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class307.method1875(var12, var10, -61, var11, var9, var8, var14, this.field4363, var5.field2914);
            this.method1920(var11, var7, var6, 1, var10);
            int var18 = 121 % ((-arg3 - 16) / 44);
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "([[ZIIIBZ)V", line = 105)
    public final void method1917(boolean[][] arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        field4364++;
        this.field4352.method3184(true, false);
        this.field4352.method3142(false, (byte) 105);
        this.field4352.method3123(-2, false);
        this.field4352.method3121(-27745, 1);
        this.field4352.method3105(1, 2);
        float var7 = 1.0F / (float) (this.field4352.field7746 * 128);
        if (arg5) {
            for (int var8 = 0; var8 < this.field4365; var8++) {
                int var9 = var8 << this.field4361;
                int var10 = var8 + 1 << this.field4361;
                label136: for (int var11 = 0; var11 < this.field4355; var11++) {
                    int var12 = var11 << this.field4361;
                    int var13 = var11 + 1 << this.field4361;
                    for (int var14 = var12; var14 < var13; var14++) {
                        if ((-arg3) <= (var14 - arg1) && arg3 >= var14 - arg1) {
                            for (int var15 = var9; var15 < var10; var15++) {
                                if ((-arg3) <= (var15 - arg2) && arg3 >= (var15 - arg2) && arg0[arg3 + var14 - arg1][arg3 + var15 - arg2]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var11) / var7, (float) (-var8) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field4354[var11][var8].method3511(-128);
                                    continue label136;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < this.field4365; var16++) {
                int var17 = var16 << this.field4361;
                int var18 = var16 + 1 << this.field4361;
                for (int var19 = 0; var19 < this.field4355; var19++) {
                    int var20 = 0;
                    int var21 = var19 << this.field4361;
                    int var22 = var19 + 1 << this.field4361;
                    class247 var23 = this.field4352.field7836;
                    var23.field2177 = 0;
                    for (int var24 = var17; var24 < var18; var24++) {
                        if ((-arg3) <= (var24 - arg2) && var24 - arg2 <= arg3) {
                            int var25 = this.field4353.field2697 * var24 + var21;
                            for (int var26 = var21; var26 < var22; var26++) {
                                if ((-arg3) <= (var26 - arg1) && arg3 >= var26 - arg1 && arg0[var26 + arg3 - arg1][arg3 + var24 - arg2]) {
                                    short[] var27 = this.field4353.field3479[var25];
                                    if (var27 != null) {
                                        if (this.field4352.field7842) {
                                            for (int var29 = 0; var29 < var27.length; var29++) {
                                                var20++;
                                                var23.method1027(255, var27[var29] & 0xFFFF);
                                            }
                                        } else {
                                            for (int var28 = 0; var28 < var27.length; var28++) {
                                                var23.method1057(var27[var28] & 0xFFFF, (byte) 85);
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
                        this.field4354[var19][var16].method3513(true, 5123, var20, var23.field2146);
                    }
                }
            }
        }
        if (arg4 >= -79) {
            field4358 = null;
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IBILk;)Z", line = 293)
    public final boolean method1918(int arg0, byte arg1, int arg2, class485 arg3) {
        field4369++;
        if (arg1 != -60) {
            field4372 = null;
        }
        class198 var5 = (class198) arg3;
        int var6 = var5.field2923 + arg0 + 1;
        int var7 = var5.field2916 + arg2 + 1;
        int var8 = var6 + (this.field4366 * var7);
        int var9 = var5.field2917;
        int var10 = var5.field2918;
        if (var7 <= 0) {
            int var11 = 1 - var7;
            var7 = 1;
            var8 += this.field4366 * var11;
            var9 -= var11;
        }
        int var12 = this.field4366 - var10;
        if (var7 + var9 >= this.field4356) {
            int var13 = var9 + var7 + 1 - this.field4356;
            var9 -= var13;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var6 = 1;
            var10 -= var14;
            var12 += var14;
            var8 += var14;
        }
        if (this.field4366 <= (var6 + var10)) {
            int var15 = var10 + var6 + 1 - this.field4366;
            var10 -= var15;
            var12 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field4366 + var12;
            return class110.method804(var16, this.field4363, var8, var9, var10, (byte) -110, var17);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;)Z", line = 374)
    public static final boolean method1919(String arg0, int arg1, Class arg2) {
        field4360++;
        Class var3 = (Class) class50.field582.get(arg0);
        if (var3 != null) {
            return var3.getClassLoader() == arg2.getClassLoader();
        } else if (arg1 == 13282) {
            Object var4 = null;
            File var5 = (File) class485.field6909.get(arg0);
            if (var5 != null) {
                try {
                    var5 = new File(var5.getCanonicalPath());
                    Class var6 = Class.forName("java.lang.Runtime");
                    Class var7 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var8 = var7.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    Method var9 = var6.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
                    var8.invoke(var9, Boolean.TRUE);
                    var9.invoke(Runtime.getRuntime(), arg2, var5.getPath());
                    var8.invoke(var9, Boolean.FALSE);
                    class50.field582.put(arg0, arg2);
                    return true;
                } catch (NoSuchMethodException var10) {
                    System.load(var5.getPath());
                    class50.field582.put(arg0, field4374 == null ? (field4374 = method1923("fu")) : field4374);
                    return true;
                } catch (Throwable var11) {
                }
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IIIII)V", line = 439)
    private final void method1920(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4367++;
        if (this.field4354 == null) {
            return;
        }
        int var6 = arg2 - 1 >> 7;
        int var7 = arg2 - (arg3 + 1 - arg0) >> 7;
        int var8 = arg1 - 1 >> 7;
        int var9 = arg1 + arg4 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class592[] var11 = this.field4354[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field8751 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Lte;Lsb;)V", line = 478)
    public class317(class527 arg0, class244 arg1) {
        this.field4353 = arg1;
        this.field4352 = arg0;
        this.field4366 = (this.field4353.field2697 * this.field4353.field2694 >> this.field4352.field7742) + 2;
        this.field4356 = (this.field4353.field2694 * this.field4353.field2693 >> this.field4352.field7742) + 2;
        this.field4363 = new byte[this.field4366 * this.field4356];
        this.field4361 = this.field4352.field7742 + 7 - this.field4353.field2695;
        this.field4355 = this.field4353.field2697 >> this.field4361;
        this.field4365 = this.field4353.field2693 >> this.field4361;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(ILk;BI)V", line = 498)
    public final void method1921(int arg0, class485 arg1, byte arg2, int arg3) {
        field4362++;
        class198 var5 = (class198) arg1;
        int var6 = var5.field2923 + arg3 + 1;
        int var7 = var5.field2916 + arg0 + 1;
        int var8 = var6 + (this.field4366 * var7);
        int var9 = 0;
        int var10 = var5.field2917;
        int var11 = var5.field2918;
        int var12 = this.field4366 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var7 = 1;
            var9 += var11 * var13;
            var8 += this.field4366 * var13;
            var10 -= var13;
        }
        int var14 = 0;
        if (this.field4356 <= (var7 + var10)) {
            int var15 = var7 - this.field4356 - (-var10 + -1);
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var8 += var16;
            var11 -= var16;
            var6 = 1;
            var14 += var16;
            var9 += var16;
            var12 += var16;
        }
        if (this.field4366 <= var6 + var11) {
            int var17 = var6 + var11 + 1 - this.field4366;
            var14 += var17;
            var11 -= var17;
            var12 += var17;
        }
        if (arg2 != -36) {
            this.field4356 = 126;
        }
        if (var11 > 0 && var10 > 0) {
            class557.method3359(var10, var5.field2914, var14, var11, this.field4363, var12, var8, var9, 14687);
            this.method1920(var11, var7, var6, arg2 ^ 0xFFFFFFDD, var10);
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Z)V", line = 572)
    public static void method1922(boolean arg0) {
        if (arg0) {
            method1919(null, 95, null);
        }
        field4370 = null;
        field4371 = null;
        field4372 = null;
        field4358 = null;
    }
}
