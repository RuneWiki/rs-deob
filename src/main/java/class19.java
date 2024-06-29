import jaggl.OpenGL;
import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class19 {

    @OriginalMember(owner = "client!qo", name = "g", descriptor = "Lef;")
    private class338 field251;

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "Lwj;")
    public static class270 field248 = new class270(68, 1);

    @OriginalMember(owner = "client!qo", name = "i", descriptor = "[C")
    public static char[] field253 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!qo", name = "f", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!qo", name = "h", descriptor = "Lbt;")
    private class33 field252;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)Z", line = 4)
    public final boolean method116(byte arg0) {
        if (this.field251.field4798 && this.field251.field4773 && this.field252 == null) {
            class432 var2 = class153.method1031(this.field251, 35632, 1, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
            if (var2 != null) {
                this.field252 = class209.method1294(new class432[] { var2 }, (byte) 3, this.field251);
            }
        }
        int var3 = -120 / ((arg0 - 19) / 55);
        field245++;
        return this.field252 != null;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Z)V", line = 29)
    public static final void method117(boolean arg0) {
        field250++;
        if (class147.field2140 != null) {
            return;
        }
        Container var1;
        if (class367.field5383 == null) {
            var1 = class202.field2840.field7425;
        } else {
            var1 = class367.field5383;
        }
        class105.field1586 = var1.getSize().width;
        class480.field7020 = var1.getSize().height;
        if (class367.field5383 == var1) {
            Insets var2 = class367.field5383.getInsets();
            class480.field7020 -= var2.top + var2.bottom;
            class105.field1586 -= var2.right + var2.left;
        }
        if (class50.method445(-8) == 1) {
            class195.field2780 = (class105.field1586 - class320.field4381) / 2;
            class445.field6563 = 0;
            class27.field359 = class512.field7598;
            class117.field1754 = class320.field4381;
        } else if (class261.field3627 < 96 && class152.field2332 == 0) {
            int var3 = class105.field1586 > 1024 ? 1024 : class105.field1586;
            int var4 = class480.field7020 <= 768 ? class480.field7020 : 768;
            class195.field2780 = (class105.field1586 - var3) / 2;
            class117.field1754 = var3;
            class445.field6563 = 0;
            class27.field359 = var4;
        } else {
            class445.field6563 = 0;
            class195.field2780 = 0;
            class27.field359 = class480.field7020;
            class117.field1754 = class105.field1586;
        }
        if (class404.field5937 != class373.field5469) {
            boolean var10000;
            if (class117.field1754 < 1024 && class27.field359 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (!arg0) {
            return;
        }
        class426.field6248.setSize(class117.field1754, class27.field359);
        if (class269.field3721 != null) {
            class269.field3721.method239(class426.field6248);
        }
        if (class367.field5383 == var1) {
            Insets var5 = class367.field5383.getInsets();
            class426.field6248.setLocation(class195.field2780 + var5.left, class445.field6563 + var5.top);
        } else {
            class426.field6248.setLocation(class195.field2780, class445.field6563);
        }
        if (class188.field2723 != -1) {
            class210.method1298(-124, true);
        }
        class57.method469((byte) 127);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lmd;Lmd;FB)Z", line = 124)
    public final boolean method118(class380 arg0, class380 arg1, float arg2, byte arg3) {
        field247++;
        if (!this.method116((byte) -47)) {
            return false;
        }
        class276 var5 = this.field251.field4776;
        class362 var6 = new class362(this.field251, 6408, arg1.field5550, arg1.field5551);
        this.field251.method1939(var5, (byte) 78);
        boolean var7 = false;
        if (arg3 != 72) {
            field253 = null;
        }
        var5.method1636(0, arg3 ^ 0x4FDE, var6);
        if (var5.method1631(arg3 + 35981)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg1.field5550, arg1.field5551);
            OpenGL.glUseProgramObjectARB(this.field252.field439);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field252.field439, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field252.field439, "rcpRelief"), 1.0F / arg2);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field252.field439, "sampleSize"), 1.0F / (float) arg0.field5550, 1.0F / (float) arg0.field5551);
            for (int var8 = 0; var8 < arg1.field5556; var8++) {
                float var9 = (float) var8 / (float) arg1.field5556;
                this.field251.method1996(2, arg0);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord3f(0.0F, 0.0F, var9);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3f(1.0F, 0.0F, var9);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3f(1.0F, 1.0F, var9);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3f(0.0F, 1.0F, var9);
                OpenGL.glVertex2f(0.0F, 1.0F);
                OpenGL.glEnd();
                arg1.method2256(arg1.field5550, 0, arg1.field5551, 0, var8, 0, 0, (byte) 77);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            var7 = true;
            OpenGL.glPopMatrix();
        }
        var5.method1637(arg3 ^ 0xD, 0);
        this.field251.method2009(var5, 0);
        return var7;
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(B)V", line = 193)
    public static final void method119(byte arg0) {
        if (arg0 > -57) {
            field253 = null;
        }
        field246++;
        for (class434 var1 = (class434) class53.field641.method2818((byte) 122); var1 != null; var1 = (class434) class53.field641.method2820((byte) -58)) {
            class285 var2 = var1.field6360;
            if (class436.field6379 != var2.field1738 || class441.field6516 > var2.field3931) {
                var1.method1565(0);
                var2.method1699(110);
            } else if (class441.field6516 >= var2.field3933) {
                if (var2.field3937 > 0) {
                    class502 var3 = class378.field5533[var2.field3937 - 1];
                    if (var3 != null && var3.field1732 >= 0 && var3.field1732 < (class527.field7799 * 128) && var3.field1735 >= 0 && var3.field1735 < (class422.field6182 * 128)) {
                        var2.method1696(var3.field1732, var3.field1735, (byte) 111, class441.field6516, class242.method1465(124, var2.field1738, var3.field1735, var3.field1732) - var2.field3943);
                    }
                }
                if (var2.field3937 < 0) {
                    int var4 = -var2.field3937 - 1;
                    class438 var5;
                    if (class152.field2335 == var4) {
                        var5 = class316.field4324;
                    } else {
                        var5 = class12.field182[var4];
                    }
                    if (var5 != null && var5.field1732 >= 0 && var5.field1732 < class527.field7799 * 128 && var5.field1735 >= 0 && var5.field1735 < class422.field6182 * 128) {
                        var2.method1696(var5.field1732, var5.field1735, (byte) 125, class441.field6516, class242.method1465(116, var2.field1738, var5.field1735, var5.field1732) - var2.field3943);
                    }
                }
                var2.method1700(class193.field2758, false);
                class51.method449(var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZI)Z", line = 260)
    public static final boolean method120(boolean arg0, int arg1) {
        field249++;
        if (!arg0) {
            method121(8, 51, 70);
        }
        return arg1 == 9 || arg1 == 57 || arg1 == 1003 || arg1 == 15 || arg1 == 4;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(III)V", line = 274)
    public static final void method121(int arg0, int arg1, int arg2) {
        boolean var3 = class89.field1305[0][arg1][arg2] != null && class89.field1305[0][arg1][arg2].field7112 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class89.field1305[var4][arg1][arg2] == null) {
                class486 var5 = class89.field1305[var4][arg1][arg2] = new class486(var4, arg1, arg2);
                if (var3) {
                    var5.field7101++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)V", line = 300)
    public static void method122(int arg0) {
        field248 = null;
        int var1 = -37 / ((arg0 - 25) / 44);
        field253 = null;
    }

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lef;)V", line = 315)
    public class19(class338 arg0) {
        this.field251 = arg0;
    }
}
