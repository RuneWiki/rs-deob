import jaggl.OpenGL;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class707 extends class682 {

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "Lpr;")
    private class445 field9974;

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "Lan;")
    private class23 field9973;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
    public static int field9962;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    public static int field9963;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
    public static int field9964;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "I")
    public static int field9965;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "I")
    public static int field9966;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
    public static int field9967;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "I")
    public static int field9969;

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "I")
    public static int field9971;

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "I")
    public static int field9972;

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "I")
    public static int field9975;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "Lqha;")
    private class102 field9968;

    @OriginalMember(owner = "client!ge", name = "u", descriptor = "Lg;")
    public static class155 field9976;

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "[I")
    public static int[] field9970;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(IZ)V")
    public static final void method3960(int arg0, boolean arg1) {
        ++field9971;
        class654.field9334.method3924(true, class654.field9334.field9870, 0);
        class654.field9334.method3924(true, class654.field9334.field9858, 0);
        class654.field9334.method3924(true, class654.field9334.field9833, 1);
        class654.field9334.method3924(true, class654.field9334.field9834, 1);
        class654.field9334.method3924(true, class654.field9334.field9855, 0);
        class654.field9334.method3924(true, class654.field9334.field9848, 0);
        class654.field9334.method3924(true, class654.field9334.field9845, 0);
        class654.field9334.method3924(true, class654.field9334.field9878, 0);
        class654.field9334.method3924(true, class654.field9334.field9847, 0);
        int var2 = 69 % ((arg0 - 61) / 62);
        class654.field9334.method3924(true, class654.field9334.field9869, 0);
        class654.field9334.method3924(true, class654.field9334.field9856, 0);
        class654.field9334.method3924(true, class654.field9334.field9836, 0);
        class654.field9334.method3924(true, class654.field9334.field9844, 0);
        class654.field9334.method3924(true, class654.field9334.field9837, 0);
        class654.field9334.method3924(true, class654.field9334.field9866, 0);
        class654.field9334.method3924(true, class654.field9334.field9852, 0);
        class654.field9334.method3924(true, class654.field9334.field9851, 0);
        class654.field9334.method3924(true, class654.field9334.field9863, 0);
        class654.field9334.method3924(true, class654.field9334.field9826, 0);
        class444.method2756(10441);
        class654.field9334.method3924(true, class654.field9334.field9849, 2);
        class654.field9334.method3924(true, class654.field9334.field9875, 1);
        class598.method3406((byte) -47);
        class341.method2026(9349);
        class698.field9825 = true;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IBI)V")
    public final void method289(int arg0, byte arg1, int arg2) {
        ++field9975;
        if ((1 & arg0) != 1) {
            if (!this.field9974.field6443) {
                super.field9647.method2621(-2, this.field9974.field6444[0]);
            } else {
                super.field9647.method2621(-2, this.field9974.field6452);
                class286.field3492[1] = 0.0F;
                class286.field3492[0] = 0.0F;
                class286.field3492[2] = 0.0F;
                class286.field3492[3] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class286.field3492, 0);
            }
        } else if (this.field9974.field6443) {
            super.field9647.method2621(-2, this.field9974.field6452);
            class286.field3492[1] = 0.0F;
            class286.field3492[2] = 0.0F;
            class286.field3492[3] = (float) (super.field9647.field5919 % 4000) / 4000.0F;
            class286.field3492[0] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class286.field3492, 0);
        } else {
            int var4 = super.field9647.field5919 % 4000 * 16 / 4000;
            super.field9647.method2621(-2, this.field9974.field6444[var4]);
        }
        if (arg1 <= 72) {
            this.method292((class292) null, 77, -39);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)V")
    public static void method3961(byte arg0) {
        if (arg0 == 98) {
            field9970 = null;
            field9976 = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)Z")
    public final boolean method286(boolean arg0) {
        ++field9967;
        if (!arg0) {
            field9970 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method3962(int arg0, Throwable arg1) throws IOException {
        ++field9963;
        String var3;
        if (arg1 instanceof class432) {
            class432 var2 = (class432) arg1;
            arg1 = var2.field6334;
            var3 = var2.field6333 + " | ";
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                if (arg0 < 64) {
                    return null;
                }
                return var3 + "| " + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (~var10 == 0) {
                var12 = var9;
            } else {
                var12 = var9.substring(0, var10);
            }
            String var13 = var12.trim();
            String var14 = var13.substring(var13.lastIndexOf(32) - -1);
            String var15 = var14.substring(1 + var14.lastIndexOf(9));
            String var16 = var3 + var15;
            if (var10 != -1 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (~var17 <= -1) {
                    var16 = var16 + var9.substring(var17 - -5, var11);
                }
            }
            var3 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)V")
    private final void method3963(int arg0) {
        ++field9965;
        this.field9968 = new class102(super.field9647, 2);
        this.field9968.method705(0, (byte) -53);
        super.field9647.method2545(32886, 1);
        super.field9647.method2558(7681, 0, 260);
        super.field9647.method2626(8960, 768, 0, 34168);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        super.field9647.method2545(32886, 0);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field9974.field6443) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field9968.method711(22972);
        this.field9968.method705(1, (byte) 110);
        super.field9647.method2545(32886, 1);
        super.field9647.method2558(8448, 0, 8448);
        super.field9647.method2626(8960, 768, 0, 5890);
        if (arg0 >= -78) {
            field9970 = null;
        }
        OpenGL.glDisable(3168);
        super.field9647.method2545(32886, 0);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field9974.field6443) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field9968.method711(22972);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZ)V")
    public final void method287(int arg0, boolean arg1) {
        super.field9647.method2558(260, 0, 8448);
        if (arg0 > 111) {
            ++field9964;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BZ)V")
    public final void method285(byte arg0, boolean arg1) {
        ++field9969;
        if (~super.field9647.field6012 < -1) {
            float var3 = -0.5F / (float) super.field9647.field6012;
            super.field9647.method2545(32886, 1);
            class286.field3492[1] = 0.0F;
            class286.field3492[2] = var3;
            class286.field3492[0] = 0.0F;
            class286.field3492[3] = super.field9647.field6009 * var3 + 0.25F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class286.field3492, 0);
            OpenGL.glPopMatrix();
            super.field9647.method2553(-21816, (float) super.field9647.field6012, 0.5F);
            super.field9647.method2621(-2, this.field9973);
            super.field9647.method2545(arg0 ^ 32834, 0);
        }
        this.field9968.method712('\u0000', 1);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(0.25F, 0.25F, 1.0F);
        OpenGL.glMatrixMode(5888);
        if (arg0 != 52) {
            this.field9973 = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lnv;Lpr;)V")
    public class707(class417 arg0, class445 arg1) {
        super(arg0);
        this.field9974 = arg1;
        this.method3963(-101);
        this.field9973 = new class23(super.field9647, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field9973.method102(false, 125);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
    public final void method288(int arg0) {
        ++field9962;
        this.field9968.method712('\u0001', 1);
        if (super.field9647.field6012 > 0) {
            super.field9647.method2545(32886, 1);
            super.field9647.method2621(-2, (class292) null);
            super.field9647.method2553(-21816, 0.0F, 1.0F);
            super.field9647.method2545(arg0 ^ 32886, 0);
        }
        super.field9647.method2558(8448, arg0, 8448);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ltha;II)V")
    public final void method292(class292 arg0, int arg1, int arg2) {
        ++field9966;
        if (arg2 != -16997) {
            method3960(42, false);
        }
    }
}
