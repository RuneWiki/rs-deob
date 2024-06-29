import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class70 {

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "Lcm;")
    private class678 field1469 = new class678();

    @OriginalMember(owner = "client!kl", name = "n", descriptor = "Lcba;")
    private class513 field1481 = new class513();

    @OriginalMember(owner = "client!kl", name = "m", descriptor = "I")
    private int field1480;

    @OriginalMember(owner = "client!kl", name = "o", descriptor = "I")
    private int field1482;

    @OriginalMember(owner = "client!kl", name = "l", descriptor = "Lsl;")
    private class427 field1479;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "[I")
    public static int[] field1468 = new int[2];

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "Lkj;")
    public static class527 field1473 = new class527(2, 16);

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "Lqfa;")
    public static class85 field1478 = new class85(98, -1);

    @OriginalMember(owner = "client!kl", name = "p", descriptor = "Laj;")
    public static class287 field1483 = new class287(10);

    @OriginalMember(owner = "client!kl", name = "q", descriptor = "I")
    public static int field1484 = 0;

    @OriginalMember(owner = "client!kl", name = "r", descriptor = "Lsb;")
    public static class266 field1485 = new class266(17, 7);

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!kl", name = "s", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)I")
    public static final int method778(int arg0, int arg1) {
        return class125.field2257 == null ? 0 : class125.field2257[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(F[FFIIIIIIIFII)V")
    public static final void method779(float arg0, float[] arg1, float arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, float arg10, int arg11, int arg12) {
        int var13 = arg8 - arg6;
        field1475++;
        int var14 = arg4 - arg11;
        int var15 = arg12 - arg3;
        float var16 = arg1[2] * (float) var13 + arg1[0] * (float) var15 + arg1[1] * (float) var14;
        float var17 = arg1[5] * (float) var13 + arg1[4] * (float) var14 + arg1[3] * (float) var15;
        if (arg9 != -5503) {
            field1483 = null;
        }
        float var18 = arg1[8] * (float) var13 + arg1[6] * (float) var15 + arg1[7] * (float) var14;
        float var19;
        float var20;
        if (arg5 == 0) {
            var19 = arg2 + var16 + 0.5F;
            var20 = arg10 + 0.5F - var18;
        } else if (arg5 == 1) {
            var19 = arg2 + var16 + 0.5F;
            var20 = arg10 + var18 + 0.5F;
        } else if (arg5 == 2) {
            var19 = arg2 + 0.5F - var16;
            var20 = arg0 + 0.5F - var17;
        } else if (arg5 == 3) {
            var19 = arg2 + var16 + 0.5F;
            var20 = arg0 + 0.5F - var17;
        } else if (arg5 == 4) {
            var20 = arg0 + 0.5F - var17;
            var19 = arg10 + var18 + 0.5F;
        } else {
            var20 = arg0 + 0.5F - var17;
            var19 = arg10 + 0.5F - var18;
        }
        if (arg7 == 1) {
            float var21 = var19;
            var19 = -var20;
            var20 = var21;
        } else if (arg7 == 2) {
            var20 = -var20;
            var19 = -var19;
        } else if (arg7 == 3) {
            float var22 = var19;
            var19 = var20;
            var20 = -var22;
        }
        class163.field2742 = var20;
        class236.field3514 = var19;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(JBLcm;)V")
    public final void method780(long arg0, byte arg1, class678 arg2) {
        if (arg1 > -75) {
            method778(84, -91);
        }
        field1471++;
        if (this.field1482 == 0) {
            class678 var5 = this.field1481.method3027(0);
            var5.method2588(300);
            var5.method3813(-96);
            if (this.field1469 == var5) {
                class678 var6 = this.field1481.method3027(0);
                var6.method2588(300);
                var6.method3813(-95);
            }
        } else {
            this.field1482--;
        }
        this.field1479.method2598(arg2, arg0, (byte) 8);
        this.field1481.method3023((byte) 106, arg2);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V")
    public static void method781(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field1485 = null;
        field1478 = null;
        field1468 = null;
        field1483 = null;
        field1473 = null;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Z)V")
    public final void method782(boolean arg0) {
        field1476++;
        this.field1481.method3021(-28912);
        if (arg0) {
            method781(-102);
        }
        this.field1479.method2600((byte) -114);
        this.field1469 = new class678();
        this.field1482 = this.field1480;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IJ)Lcm;")
    public final class678 method783(int arg0, long arg1) {
        field1474++;
        int var4 = 106 / ((arg0 + 40) / 35);
        class678 var5 = (class678) this.field1479.method2596(arg1, 52);
        if (var5 != null) {
            this.field1481.method3023((byte) 91, var5);
        }
        return var5;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIBII)V")
    public static final void method784(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field1470++;
        if (arg3 != -88) {
            method781(16);
        }
        for (int var6 = arg1; var6 <= arg2; var6++) {
            class705.method3938(arg4, arg5, 30336, arg0, class582.field8429[var6]);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "([FII)[F")
    public static final float[] method785(float[] arg0, int arg1, int arg2) {
        field1472++;
        float[] var3 = new float[arg1];
        class692.method3877(arg0, 0, var3, 0, arg1);
        return arg2 == -25709 ? var3 : null;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I[Ljfa;Lus;)Ltaa;")
    public static final class377 method786(int arg0, class264[] arg1, class1 arg2) {
        field1477++;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (arg1[var3] == null || arg1[var3].field3865 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; var6 < arg1.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg1[var6].field3865);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class122.field2221, 0);
        if (class122.field2221[arg0] == 0) {
            if (class122.field2221[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class122.field2221, 1);
            if (class122.field2221[1] > 1) {
                byte[] var7 = new byte[class122.field2221[1]];
                OpenGL.glGetInfoLogARB(var4, class122.field2221[1], class122.field2221, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class122.field2221[0] == 0) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg1[var8].field3865);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class377(arg2, var4, arg1);
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(I)V")
    public class70(int arg0) {
        this.field1480 = arg0;
        this.field1482 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field1479 = new class427(var2);
    }
}
