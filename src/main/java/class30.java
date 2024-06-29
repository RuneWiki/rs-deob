import jaggl.OpenGL;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class30 extends class297 {

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "Lri;")
    private class73 field497;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "Lpa;")
    private class248 field499;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "Lvj;")
    public static class304 field500 = new class304("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "Z")
    public static boolean field506 = false;

    @OriginalMember(owner = "client!vd", name = "u", descriptor = "J")
    public static volatile long field507 = 0L;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "Liq;")
    private class429 field504;

    @OriginalMember(owner = "client!vd", name = "v", descriptor = "Loa;")
    public static class489 field508;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Z)Z")
    public final boolean method240(boolean arg0) {
        ++field505;
        return !arg0;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZI)V")
    public final void method241(boolean arg0, int arg1) {
        if (arg1 != -30965) {
            method249((byte) 87, 42, -13);
        }
        super.field3881.method3002((byte) -73, 260, 8448);
        ++field493;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(B)V")
    private final void method242(byte arg0) {
        ++field502;
        this.field504 = new class429(super.field3881, 2);
        this.field504.method2482(0, -25);
        super.field3881.method3003(1, 58);
        super.field3881.method3002((byte) -71, 7681, 260);
        super.field3881.method2953(0, (byte) 89, 768, 34168);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        super.field3881.method3003(0, 83);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (arg0 <= 36) {
            this.method245(false, 17, 106);
        }
        if (this.field497.field1096) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field504.method2479(-16981);
        this.field504.method2482(1, -93);
        super.field3881.method3003(1, 25);
        super.field3881.method3002((byte) -77, 8448, 8448);
        super.field3881.method2953(0, (byte) 109, 768, 5890);
        OpenGL.glDisable(3168);
        super.field3881.method3003(0, 55);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field497.field1096) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field504.method2479(-16981);
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V")
    public static void method243(int arg0) {
        field500 = null;
        int var1 = -34 % ((-39 - arg0) / 49);
        field508 = null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IZ)V")
    public final void method244(int arg0, boolean arg1) {
        if (~super.field3881.field7526 < -1) {
            float var3 = -0.5F / (float) super.field3881.field7526;
            super.field3881.method3003(1, arg0 ^ 7);
            class474.field6554[0] = 0.0F;
            class474.field6554[1] = 0.0F;
            class474.field6554[3] = super.field3881.field7452 * var3 + 0.25F;
            class474.field6554[2] = var3;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class474.field6554, 0);
            OpenGL.glPopMatrix();
            super.field3881.method2943((float) super.field3881.field7526, 0.5F, false);
            super.field3881.method2980(this.field499, 111);
            super.field3881.method3003(0, 27);
        }
        ++field492;
        this.field504.method2480('\u0000', -1);
        if (arg0 != 0) {
            this.field497 = null;
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(0.25F, 0.25F, 1.0F);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Lbo;Lri;)V")
    public class30(class511 arg0, class73 arg1) {
        super(arg0);
        this.field497 = arg1;
        this.method242((byte) 111);
        this.field499 = new class248(super.field3881, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field499.method1502(false, true);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZII)V")
    public final void method245(boolean arg0, int arg1, int arg2) {
        if (~(1 & arg2) == -2) {
            if (this.field497.field1096) {
                super.field3881.method2980(this.field497.field1101, 119);
                class474.field6554[0] = 0.0F;
                class474.field6554[2] = 0.0F;
                class474.field6554[1] = 0.0F;
                class474.field6554[3] = (float) (super.field3881.field7404 % 4000) / 4000.0F;
                OpenGL.glTexGenfv(8194, 9473, class474.field6554, 0);
            } else {
                int var4 = super.field3881.field7404 % 4000 * 16 / 4000;
                super.field3881.method2980(this.field497.field1097[var4], 117);
            }
        } else if (!this.field497.field1096) {
            super.field3881.method2980(this.field497.field1097[0], 124);
        } else {
            super.field3881.method2980(this.field497.field1101, 109);
            class474.field6554[0] = 0.0F;
            class474.field6554[2] = 0.0F;
            class474.field6554[3] = 0.0F;
            class474.field6554[1] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class474.field6554, 0);
        }
        ++field494;
        if (!arg0) {
            field507 = -90L;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
    public final void method246(int arg0) {
        if (arg0 == 6) {
            this.field504.method2480('\u0001', -1);
            ++field503;
            if (~super.field3881.field7526 < -1) {
                super.field3881.method3003(1, 83);
                super.field3881.method2980((class501) null, 109);
                super.field3881.method2943(0.0F, 1.0F, false);
                super.field3881.method3003(0, 29);
            }
            super.field3881.method3002((byte) -51, 8448, 8448);
            OpenGL.glMatrixMode(5890);
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)Z")
    public static final boolean method247(int arg0, int arg1, int arg2) {
        if (arg2 != 5888) {
            return true;
        } else {
            ++field498;
            return ~(arg0 & 256) != -1;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lnk;II)V")
    public final void method248(class501 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.method242((byte) -68);
        }
        ++field495;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BII)Z")
    public static final boolean method249(byte arg0, int arg1, int arg2) {
        if (arg0 != 115) {
            method243(-125);
        }
        ++field501;
        return ~(52 & arg1) != -1;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method250(int arg0, Throwable arg1) throws IOException {
        ++field496;
        String var2;
        if (!(arg1 instanceof class123)) {
            var2 = "";
        } else {
            class123 var3 = (class123) arg1;
            var2 = var3.field1806 + " | ";
            arg1 = var3.field1810;
        }
        if (arg0 != 3030) {
            field500 = null;
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
                return var2 + "| " + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (var10 != -1) {
                var12 = var9.substring(0, var10);
            } else {
                var12 = var9;
            }
            String var13 = var12.trim();
            String var14 = var13.substring(1 + var13.lastIndexOf(32));
            String var15 = var14.substring(var14.lastIndexOf(9) - -1);
            String var16 = var2 + var15;
            if (var10 != -1 && ~var11 != 0) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 - -5, var11);
                }
            }
            var2 = var16 + ' ';
        }
    }
}
