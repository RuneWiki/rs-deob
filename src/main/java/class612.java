import jaggl.OpenGL;
import java.awt.Point;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class612 extends class312 {

    @OriginalMember(owner = "client!id", name = "h", descriptor = "I")
    private int field8207 = 0;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "Z")
    private boolean field8212 = false;

    @OriginalMember(owner = "client!id", name = "B", descriptor = "I")
    private int field8227 = 0;

    @OriginalMember(owner = "client!id", name = "E", descriptor = "I")
    private int field8229 = 0;

    @OriginalMember(owner = "client!id", name = "t", descriptor = "I")
    private int field8219 = 0;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "Lwg;")
    private class449 field8213;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    private int field8208;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    private int field8200;

    @OriginalMember(owner = "client!id", name = "r", descriptor = "Lada;")
    private class175 field8217;

    @OriginalMember(owner = "client!id", name = "G", descriptor = "Z")
    private boolean field8231;

    @OriginalMember(owner = "client!id", name = "u", descriptor = "Z")
    private boolean field8220;

    @OriginalMember(owner = "client!id", name = "F", descriptor = "Z")
    private boolean field8230;

    @OriginalMember(owner = "client!id", name = "A", descriptor = "Z")
    private boolean field8226;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public static int field8201;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public static int field8202;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    public static int field8203;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public static int field8204;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    public static int field8205;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    public static int field8206;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    public static int field8209;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "I")
    public static int field8210;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "I")
    public static int field8211;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "I")
    public static int field8215;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "I")
    public static int field8216;

    @OriginalMember(owner = "client!id", name = "s", descriptor = "I")
    public static int field8218;

    @OriginalMember(owner = "client!id", name = "v", descriptor = "I")
    public static int field8221;

    @OriginalMember(owner = "client!id", name = "w", descriptor = "I")
    public static int field8222;

    @OriginalMember(owner = "client!id", name = "x", descriptor = "I")
    public static int field8223;

    @OriginalMember(owner = "client!id", name = "y", descriptor = "I")
    public static int field8224;

    @OriginalMember(owner = "client!id", name = "C", descriptor = "I")
    public static int field8228;

    @OriginalMember(owner = "client!id", name = "H", descriptor = "I")
    public static int field8232;

    @OriginalMember(owner = "client!id", name = "z", descriptor = "Ljava/io/FileOutputStream;")
    public static FileOutputStream field8225;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "[I")
    public static int[] field8214;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IILaa;II)V", line = 3)
    public final void method238(int arg0, int arg1, class513 arg2, int arg3, int arg4) {
        field8203++;
        class478 var6 = (class478) arg2;
        class175 var7 = var6.field6631;
        int var8 = this.field8219 + arg1;
        int var9 = this.field8207 + arg0;
        this.field8217.method1439(class450.field6370, -22);
        this.field8213.method2645(20439);
        this.field8213.method2643(-2, this.field8217);
        this.field8213.method2699((byte) 14, 1);
        this.field8213.method2649((byte) 126, 1);
        class256 var10 = this.field8213.method2652(-17);
        var10.method1529((float) this.field8200, 0.0F, (float) this.field8208, (byte) 85);
        var10.method131(var9, var8, 0);
        this.field8213.method2688(0);
        class256 var11 = this.field8213.method2710(-118);
        var11.method1529(this.field8217.method1200((byte) -109, (float) this.field8200), 1.0F, this.field8217.method1196(-23865, (float) this.field8208), (byte) 88);
        this.field8213.method2720(class326.field4040, (byte) 105);
        this.field8213.method2691(false, 1);
        this.field8213.method2643(-2, var7);
        this.field8213.method2716(class269.field3180, 60, class75.field1039);
        this.field8213.method2694((byte) -49, 0, class616.field8291);
        class256 var12 = this.field8213.method2710(-59);
        var12.method1529(var7.method1200((byte) -121, (float) this.field8200), 1.0F, var7.method1196(-23865, (float) this.field8208), (byte) 107);
        var12.method1538(var7.method1200((byte) -122, (float) (var8 - arg4)), 0.0F, var7.method1196(-23865, (float) (var9 - arg3)), -2360);
        this.field8213.method2720(class326.field4040, (byte) 63);
        this.field8213.method2692(2);
        this.field8213.method2671(88);
        this.field8213.method2694((byte) -49, 0, class507.field7214);
        this.field8213.method2716(class269.field3180, 58, class269.field3180);
        this.field8213.method2643(-2, null);
        this.field8213.method2691(false, 0);
        this.field8213.method2671(95);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(III)V", line = 53)
    public final void method233(int arg0, int arg1, int arg2) {
        field8218++;
        int[] var4 = this.field8213.method87(arg0, arg1, this.field8208, this.field8200);
        int[] var5 = new int[this.field8208 * this.field8200];
        this.field8217.method1193(0, 0, 0, this.field8208, var5, (byte) 69, this.field8200);
        if (arg2 == 0) {
            for (int var15 = 0; var15 < this.field8200; var15++) {
                int var16 = this.field8208 * var15;
                for (int var17 = 0; var17 < this.field8208; var17++) {
                    var5[var16 + var17] = class5.method105(class296.method1733(16777215, var5[var16 + var17]), class296.method1733(2080309248, var4[var16 + var17]) << 8);
                }
            }
        } else if (arg2 == 1) {
            for (int var12 = 0; var12 < this.field8200; var12++) {
                int var13 = this.field8208 * var12;
                for (int var14 = 0; var14 < this.field8208; var14++) {
                    var5[var13 + var14] = class5.method105(class296.method1733(16777215, var5[var13 + var14]), class296.method1733(var4[var13 + var14], 1119092480) << 16);
                }
            }
        } else if (arg2 == 2) {
            for (int var6 = 0; var6 < this.field8200; var6++) {
                int var7 = this.field8208 * var6;
                for (int var8 = 0; var8 < this.field8208; var8++) {
                    var5[var7 + var8] = class5.method105(class296.method1733(var5[var7 + var8], 16777215), class296.method1733(var4[var7 + var8], -470568961) << 24);
                }
            }
        } else if (arg2 == 3) {
            for (int var9 = 0; var9 < this.field8200; var9++) {
                int var10 = this.field8208 * var9;
                for (int var11 = 0; var11 < this.field8208; var11++) {
                    var5[var10 + var11] = class5.method105(var4[var10 + var11] == 0 ? 0 : -16777216, class296.method1733(var5[var10 + var11], 16777215));
                }
            }
        }
        this.method3463(0, 0, this.field8208, this.field8200, var5, 0, this.field8208);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIII[III)V", line = 163)
    private final void method3463(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        this.field8217.method1194(arg2, arg5, arg0, arg3, arg4, arg6, (byte) -96, arg1);
        field8205++;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIII)V", line = 171)
    public final void method240(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field8204++;
        class256 var6 = this.field8213.method2652(-17);
        class256 var7 = this.field8213.method2710(-62);
        int var8 = this.field8219 + arg1;
        int var9 = this.field8207 + arg0;
        this.field8217.method1439(class450.field6370, -88);
        this.field8213.method2645(20439);
        this.field8213.method2643(-2, this.field8217);
        this.field8213.method2699((byte) 14, arg4);
        this.field8213.method2649((byte) 126, arg2);
        this.field8213.method2694((byte) -49, 1, class555.field7718);
        this.field8213.method2703(class555.field7718, (byte) 102, 1);
        this.field8213.method2673(arg3, 127);
        var6.method1529((float) this.field8200, 0.0F, (float) this.field8208, (byte) 119);
        var6.method131(var9, var8, 0);
        var7.method1529(this.field8217.method1200((byte) -126, (float) this.field8200), 1.0F, this.field8217.method1196(-23865, (float) this.field8208), (byte) 94);
        this.field8213.method2720(class326.field4040, (byte) 96);
        this.field8213.method2688(0);
        this.field8213.method2692(2);
        this.field8213.method2671(86);
        this.field8213.method2694((byte) -49, 1, class616.field8291);
        this.field8213.method2703(class616.field8291, (byte) 65, 1);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "([I)V", line = 202)
    public final void method1633(int[] arg0) {
        arg0[0] = this.field8207;
        arg0[1] = this.field8219;
        arg0[2] = this.field8227;
        arg0[3] = this.field8229;
        field8216++;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "()I", line = 215)
    public final int method1637() {
        field8221++;
        return this.field8200;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(FFFFFFILaa;II)V", line = 228)
    public final void method1641(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class513 arg7, int arg8, int arg9) {
        field8224++;
        class256 var11 = this.field8213.method2652(-17);
        class256 var12 = this.field8213.method2710(-100);
        class478 var13 = (class478) arg7;
        class175 var14 = var13.field6631;
        this.field8217.method1439(this.field8231 || this.field8220 || (arg6 & 0x1) == 0 ? class450.field6370 : class140.field1751, -128);
        this.field8213.method2645(20439);
        this.field8213.method2643(-2, this.field8217);
        this.field8213.method2699((byte) 14, 1);
        this.field8213.method2649((byte) 126, 1);
        if (this.field8212) {
            float var15 = (float) this.field8208 / (float) this.method1634();
            float var16 = (float) this.field8200 / (float) this.method1636();
            var11.method1533(0.0F, (arg5 - arg1) * var16, 0.0F, (arg3 - arg1) * var15, 0.0F, 1.0F, 0.0F, -29923, (arg4 - arg0) * var16, (arg2 - arg0) * var15);
            var11.method1538(((float) this.field8219 + arg1) * var16, 0.0F, ((float) this.field8207 + arg0) * var15, -2360);
        } else {
            var11.method1533(0.0F, arg5 - arg1, 0.0F, arg3 - arg1, 0.0F, 1.0F, 0.0F, -29923, arg4 - arg0, -arg0 + arg2);
            var11.method1538(arg1, 0.0F, arg0, -2360);
        }
        var12.method1529(this.field8217.method1200((byte) 83, (float) this.field8200), 1.0F, this.field8217.method1196(-23865, (float) this.field8208), (byte) 116);
        this.field8213.method2720(class326.field4040, (byte) 63);
        this.field8213.method2691(false, 1);
        this.field8213.method2643(-2, var14);
        this.field8213.method2716(class269.field3180, 96, class75.field1039);
        this.field8213.method2694((byte) -49, 0, class616.field8291);
        class256 var17 = this.field8213.method2710(-107);
        var17.method141(var11);
        var17.method131(-arg8, -arg9, 0);
        var17.method1542(var14.method1200((byte) -116, 1.0F), 0, var14.method1196(-23865, 1.0F), 1.0F);
        this.field8213.method2720(class326.field4040, (byte) 64);
        this.field8213.method2688(0);
        this.field8213.method2692(2);
        this.field8213.method2671(106);
        this.field8213.method2694((byte) -49, 0, class507.field7214);
        this.field8213.method2716(class269.field3180, 98, class269.field3180);
        this.field8213.method2643(-2, null);
        this.field8213.method2691(false, 0);
        this.field8213.method2671(95);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I[Lpj;Lnv;)Lct;", line = 288)
    public static final class157 method3464(int arg0, class158[] arg1, class439 arg2) {
        field8210++;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (arg1[var3] == null || arg1[var3].field1967 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; var6 < arg1.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg1[var6].field1967);
        }
        OpenGL.glLinkProgramARB(var4);
        if (arg0 != 1) {
            return null;
        }
        OpenGL.glGetObjectParameterivARB(var4, 35714, class661.field9068, 0);
        if (class661.field9068[0] == 0) {
            if (class661.field9068[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class661.field9068, 1);
            if (class661.field9068[1] > 1) {
                byte[] var7 = new byte[class661.field9068[1]];
                OpenGL.glGetInfoLogARB(var4, class661.field9068[1], class661.field9068, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class661.field9068[0] == 0) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg1[var8].field1967);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class157(arg2, var4, arg1);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lde;I)Z", line = 361)
    public static final boolean method3465(class558 arg0, int arg1) {
        field8206++;
        if (arg1 == 1) {
            return class454.field6402 == arg0 || class553.field7698 == arg0 || class18.field342 == arg0 || class393.field5089 == arg0 || class769.field10571 == arg0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Lwg;IIZ)V", line = 553)
    public class612(class449 arg0, int arg1, int arg2, boolean arg3) {
        this.field8213 = arg0;
        this.field8208 = arg1;
        this.field8200 = arg2;
        this.field8217 = arg0.method3(class748.field10384, arg1, arg3 ? class141.field1759 : class574.field7863, (byte) 75, arg2);
        this.field8217.method1198(true, true, (byte) 82);
        this.field8231 = this.field8217.method1199(-31) != arg1;
        this.field8220 = this.field8217.method1197(7676) != arg2;
        this.field8230 = !this.field8231 && this.field8217.method1192(-92);
        this.field8226 = !this.field8220 && this.field8217.method1192(-82);
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Lwg;II[III)V", line = 812)
    public class612(class449 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field8208 = arg1;
        this.field8213 = arg0;
        this.field8200 = arg2;
        this.field8217 = arg0.method83(arg1, arg4, arg2, arg5, false, false, arg3);
        this.field8217.method1198(true, true, (byte) -123);
        this.field8231 = this.field8217.method1199(79) != arg1;
        this.field8220 = this.field8217.method1197(7676) != arg2;
        this.field8230 = !this.field8231 && this.field8217.method1192(-116);
        this.field8226 = !this.field8220 && this.field8217.method1192(-89);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V", line = 379)
    public static void method3466(int arg0) {
        field8214 = null;
        if (arg0 != -1) {
            method3465(null, 17);
        }
        field8225 = null;
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "()I", line = 394)
    public final int method1634() {
        field8202++;
        return this.field8208 + this.field8207 + this.field8227;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IB)V", line = 403)
    public static final void method3467(int arg0, byte arg1) {
        if (arg1 != 24) {
            method3464(67, null, null);
        }
        field8215++;
        if (class118.field1503.field10670.method3721(arg1 - 24) == 0) {
            arg0 = -1;
        }
        if (class287.field3360 == arg0) {
            return;
        }
        if (arg0 != -1) {
            class31 var2 = class5.field63.method2465(arg0, false);
            class600 var3 = var2.method296(-19);
            if (var3 == null) {
                arg0 = -1;
            } else {
                class521.field7389.method3794(var3.method3425(), 5, class109.field1370, new Point(var2.field489, var2.field492), var3.method3430(), var3.method3420());
                class287.field3360 = arg0;
            }
        }
        if (arg0 == -1 && class287.field3360 != -1) {
            class521.field7389.method3794(null, arg1 ^ 0x1D, class109.field1370, new Point(), -1, -1);
            class287.field3360 = -1;
        }
    }

    @OriginalMember(owner = "client!id", name = "d", descriptor = "()I", line = 445)
    public final int method1640() {
        field8209++;
        return this.field8208;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(IIII)V", line = 453)
    public final void method1632(int arg0, int arg1, int arg2, int arg3) {
        this.field8227 = arg2;
        this.field8229 = arg3;
        this.field8207 = arg0;
        this.field8219 = arg1;
        field8232++;
        this.field8212 = this.field8207 != 0 || this.field8219 != 0 || this.field8227 != 0 || this.field8229 != 0;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(FFFFFFIIII)V", line = 476)
    public final void method1638(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        field8211++;
        class256 var11 = this.field8213.method2652(-17);
        class256 var12 = this.field8213.method2710(-110);
        this.field8217.method1439(this.field8231 || this.field8220 || (arg9 & 0x1) == 0 ? class450.field6370 : class140.field1751, -68);
        this.field8213.method2645(20439);
        this.field8213.method2643(-2, this.field8217);
        this.field8213.method2699((byte) 14, arg8);
        this.field8213.method2649((byte) 126, arg6);
        this.field8213.method2694((byte) -49, 1, class555.field7718);
        this.field8213.method2703(class555.field7718, (byte) -89, 1);
        this.field8213.method2673(arg7, -75);
        if (this.field8212) {
            float var13 = (float) this.method1634();
            float var14 = (float) this.method1636();
            float var15 = (arg2 - arg0) / var13;
            float var16 = (arg3 - arg1) / var13;
            float var17 = (arg4 - arg0) / var14;
            float var18 = (arg5 - arg1) / var14;
            float var19 = (float) this.field8219 * var17;
            float var20 = (float) this.field8219 * var18;
            float var21 = (float) this.field8207 * var15;
            float var22 = (float) this.field8207 * var16;
            float var23 = (float) this.field8227 * -var15;
            float var24 = (float) this.field8227 * -var16;
            float var25 = (float) this.field8229 * -var17;
            arg4 = arg4 + var21 + var25;
            float var26 = (float) this.field8229 * -var18;
            arg3 = arg3 + var24 + var20;
            arg1 = arg1 + var22 + var20;
            arg0 = arg0 + var21 + var19;
            arg2 = arg2 + var23 + var19;
            arg5 = arg5 + var22 + var26;
        }
        var11.method1533(0.0F, arg5 - arg1, 0.0F, arg3 - arg1, 0.0F, 1.0F, 0.0F, -29923, arg4 - arg0, -arg0 + arg2);
        var11.method1538(arg1, 0.0F, arg0, -2360);
        var12.method1529(this.field8217.method1200((byte) -127, (float) this.field8200), 1.0F, this.field8217.method1196(-23865, (float) this.field8208), (byte) 93);
        this.field8213.method2720(class326.field4040, (byte) 123);
        this.field8213.method2688(0);
        this.field8213.method2692(2);
        this.field8213.method2671(114);
        this.field8213.method2694((byte) -49, 1, class616.field8291);
        this.field8213.method2703(class616.field8291, (byte) -96, 1);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "()I", line = 543)
    public final int method1636() {
        field8223++;
        return this.field8219 + this.field8200 + this.field8229;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIIII)V", line = 569)
    public final void method1635(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field8228++;
        class256 var8 = this.field8213.method2652(-17);
        class256 var9 = this.field8213.method2710(-90);
        this.field8217.method1439(class450.field6370, -60);
        this.field8213.method2645(20439);
        this.field8213.method2643(-2, this.field8217);
        this.field8213.method2699((byte) 14, arg6);
        this.field8213.method2649((byte) 126, arg4);
        this.field8213.method2694((byte) -49, 1, class555.field7718);
        this.field8213.method2703(class555.field7718, (byte) 46, 1);
        this.field8213.method2673(arg5, -23);
        boolean var10 = this.field8226 && this.field8219 == 0 && this.field8229 == 0;
        boolean var11 = this.field8230 && this.field8207 == 0 && this.field8227 == 0;
        if (var10 & var11) {
            var9.method1529(this.field8217.method1200((byte) 106, (float) arg3), 1.0F, this.field8217.method1196(-23865, (float) arg2), (byte) 105);
            var8.method1529((float) arg3, 0.0F, (float) arg2, (byte) 79);
            var8.method131(arg0, arg1, 0);
            this.field8213.method2720(class326.field4040, (byte) 63);
            this.field8213.method2688(0);
            this.field8213.method2692(2);
        } else if (var11) {
            int var30 = arg1 + arg3;
            int var31 = this.method1636();
            var9.method1529(this.field8217.method1200((byte) -118, (float) this.field8200), 1.0F, this.field8217.method1196(-23865, (float) arg2), (byte) 127);
            this.field8213.method2720(class326.field4040, (byte) 102);
            int var32 = this.field8219 + arg1;
            int var33 = this.field8200 + var32;
            while (var30 >= var33) {
                var8.method1529((float) this.field8200, 0.0F, (float) arg2, (byte) 78);
                var8.method131(arg0, var32, 0);
                this.field8213.method2688(0);
                var33 += var31;
                this.field8213.method2692(2);
                var32 += var31;
            }
            if (var32 < var30) {
                int var34 = var30 - var32;
                var9.method1529(this.field8217.method1200((byte) 27, (float) var34), 1.0F, this.field8217.method1196(-23865, (float) arg2), (byte) 98);
                this.field8213.method2720(class326.field4040, (byte) 119);
                var8.method1529((float) var34, 0.0F, (float) arg2, (byte) 109);
                var8.method131(arg0, var32, 0);
                this.field8213.method2688(0);
                this.field8213.method2692(2);
            }
        } else if (var10) {
            int var12 = arg0 + arg2;
            int var13 = this.method1634();
            var9.method1529(this.field8217.method1200((byte) -126, (float) arg3), 1.0F, this.field8217.method1196(-23865, (float) this.field8208), (byte) 97);
            this.field8213.method2720(class326.field4040, (byte) 72);
            int var14 = this.field8207 + arg0;
            int var15 = var14 + this.field8208;
            while (var12 >= var15) {
                var8.method1529((float) arg3, 0.0F, (float) this.field8208, (byte) 75);
                var8.method131(var14, arg1, 0);
                this.field8213.method2688(0);
                this.field8213.method2692(2);
                var15 += var13;
                var14 += var13;
            }
            if (var14 < var12) {
                int var16 = var12 - var14;
                var9.method1529(this.field8217.method1200((byte) -128, (float) arg3), 1.0F, this.field8217.method1196(-23865, (float) var16), (byte) 113);
                this.field8213.method2720(class326.field4040, (byte) 77);
                var8.method1529((float) arg3, 0.0F, (float) var16, (byte) 76);
                var8.method131(var14, arg1, 0);
                this.field8213.method2688(0);
                this.field8213.method2692(2);
            }
        } else {
            int var17 = arg1 + arg3;
            int var18 = arg0 + arg2;
            int var19 = this.method1634();
            int var20 = this.method1636();
            int var21 = arg1 + this.field8219;
            for (int var22 = this.field8200 + var21; var22 <= var17; var22 += var20) {
                var9.method1529(this.field8217.method1200((byte) 104, (float) this.field8200), 1.0F, this.field8217.method1196(-23865, (float) this.field8208), (byte) 109);
                this.field8213.method2720(class326.field4040, (byte) 122);
                int var27 = this.field8207 + arg0;
                for (int var28 = this.field8208 + var27; var28 <= var18; var28 += var19) {
                    var8.method1529((float) this.field8200, 0.0F, (float) this.field8208, (byte) 98);
                    var8.method131(var27, var21, 0);
                    this.field8213.method2688(0);
                    var27 += var19;
                    this.field8213.method2692(2);
                }
                if (var18 > var27) {
                    int var29 = var18 - var27;
                    var9.method1529(this.field8217.method1200((byte) 87, (float) this.field8200), 1.0F, this.field8217.method1196(-23865, (float) var29), (byte) 93);
                    this.field8213.method2720(class326.field4040, (byte) 118);
                    var8.method1529((float) this.field8200, 0.0F, (float) var29, (byte) 74);
                    var8.method131(var27, var21, 0);
                    this.field8213.method2688(0);
                    this.field8213.method2692(2);
                }
                var21 += var20;
            }
            if (var21 < var17) {
                int var23 = var17 - var21;
                var9.method1529(this.field8217.method1200((byte) 84, (float) var23), 1.0F, this.field8217.method1196(-23865, (float) this.field8208), (byte) 80);
                this.field8213.method2720(class326.field4040, (byte) 58);
                int var24 = this.field8207 + arg0;
                int var25 = var24 + this.field8208;
                while (var18 >= var25) {
                    var8.method1529((float) var23, 0.0F, (float) this.field8208, (byte) 81);
                    var8.method131(var24, var21, 0);
                    this.field8213.method2688(0);
                    var24 += var19;
                    var25 += var19;
                    this.field8213.method2692(2);
                }
                if (var24 < var18) {
                    int var26 = var18 - var24;
                    var9.method1529(this.field8217.method1200((byte) -108, (float) var23), 1.0F, this.field8217.method1196(-23865, (float) var26), (byte) 85);
                    this.field8213.method2720(class326.field4040, (byte) 52);
                    var8.method1529((float) var23, 0.0F, (float) var26, (byte) 94);
                    var8.method131(var24, var21, 0);
                    this.field8213.method2688(0);
                    this.field8213.method2692(2);
                }
            }
        }
        this.field8213.method2671(123);
        this.field8213.method2694((byte) -49, 1, class616.field8291);
        this.field8213.method2703(class616.field8291, (byte) -119, 1);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIIIII)V", line = 776)
    public final void method234(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field8201++;
        class256 var9 = this.field8213.method2652(-17);
        class256 var10 = this.field8213.method2710(-39);
        this.field8217.method1439(this.field8231 || this.field8220 || (arg7 & 0x1) == 0 ? class450.field6370 : class140.field1751, -67);
        this.field8213.method2645(20439);
        this.field8213.method2643(-2, this.field8217);
        this.field8213.method2699((byte) 14, arg6);
        this.field8213.method2649((byte) 126, arg4);
        this.field8213.method2694((byte) -49, 1, class555.field7718);
        this.field8213.method2703(class555.field7718, (byte) -108, 1);
        this.field8213.method2673(arg5, -103);
        var10.method1529(this.field8217.method1200((byte) 38, (float) this.field8200), 1.0F, this.field8217.method1196(-23865, (float) this.field8208), (byte) 74);
        if (this.field8212) {
            arg2 = this.field8208 * arg2 / this.method1634();
            arg3 = this.field8200 * arg3 / this.method1636();
            arg0 += this.field8207 * arg2 / this.field8208;
            arg1 += this.field8219 * arg3 / this.field8200;
        }
        var9.method1529((float) arg3, 0.0F, (float) arg2, (byte) 121);
        var9.method131(arg0, arg1, 0);
        this.field8213.method2720(class326.field4040, (byte) 88);
        this.field8213.method2688(0);
        this.field8213.method2692(2);
        this.field8213.method2671(98);
        this.field8213.method2694((byte) -49, 1, class616.field8291);
        this.field8213.method2703(class616.field8291, (byte) 8, 1);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIII)V", line = 828)
    public final void method239(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field8222++;
        int[] var7 = this.field8213.method87(arg4, arg5, arg2, arg3);
        if (var7 != null) {
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = class5.method105(var7[var8], -16777216);
            }
            this.method3463(arg0, arg1, arg2, arg3, var7, 0, arg2);
        }
    }
}
