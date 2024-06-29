import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class519 {

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "Lht;")
    private class410 field7650;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "Ljm;")
    public static class485 field7645;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "Luf;")
    public static class310 field7646;

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "Lbj;")
    public static class159 field7647;

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "[S")
    public static short[] field7651;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "I")
    public static int field7642;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
    public static int field7643;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
    public static int field7644;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "I")
    public static int field7648;

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "Led;")
    private class497 field7649;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Ldw;Ldw;FI)Z")
    public final boolean method3053(class503 arg0, class503 arg1, float arg2, int arg3) {
        if (arg3 > -52) {
            field7646 = null;
        }
        field7648++;
        if (!this.method3057(35632)) {
            return false;
        }
        class527 var5 = this.field7650.field5958;
        class62 var6 = new class62(this.field7650, 6408, arg0.field7387, arg0.field7390);
        this.field7650.method2434(-86, var5);
        boolean var7 = false;
        var5.method3090(0, var6, 0);
        if (var5.method3096((byte) 123)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, arg0.field7387, arg0.field7390);
            OpenGL.glUseProgramObjectARB(this.field7649.field7320);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field7649.field7320, "heightMap"), 0);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field7649.field7320, "rcpRelief"), 1.0F / arg2);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field7649.field7320, "sampleSize"), 1.0F / (float) arg1.field7387, 1.0F / (float) arg1.field7390);
            for (int var8 = 0; var8 < arg0.field7391; var8++) {
                float var9 = (float) var8 / (float) arg0.field7391;
                this.field7650.method2412((byte) 4, arg1);
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
                arg0.method2957(0, 0, arg0.field7387, 96, 0, arg0.field7390, var8, 0);
            }
            OpenGL.glUseProgramObjectARB(0L);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            var7 = true;
            OpenGL.glPopMatrix();
        }
        var5.method3095(0, (byte) -17);
        this.field7650.method2425(var5, -89);
        return var7;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V")
    public static void method3054(byte arg0) {
        field7651 = null;
        field7646 = null;
        field7645 = null;
        if (arg0 < 97) {
            method3054((byte) 50);
        }
        field7647 = null;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZBLtf;)V")
    public static final void method3055(boolean arg0, byte arg1, class192 arg2) {
        field7642++;
        if (class370.field5198 >= 400) {
            return;
        }
        if (class75.field1089 != arg2) {
            String var9;
            if (arg2.field2708 == 0) {
                boolean var3 = true;
                if (class75.field1089.field2721 != -1 && arg2.field2721 != -1) {
                    int var4 = arg2.field2722 >= class75.field1089.field2722 ? arg2.field2722 : class75.field1089.field2722;
                    int var5 = arg2.field2721 <= class75.field1089.field2721 ? arg2.field2721 : class75.field1089.field2721;
                    int var6 = var4 * 10 / 100 + var5 + 5;
                    int var7 = class75.field1089.field2722 - arg2.field2722;
                    if (var7 < 0) {
                        var7 = -var7;
                    }
                    if (var7 > var6) {
                        var3 = false;
                    }
                }
                String var8 = class341.field4700 == class288.field3885 ? class330.field4498.method590(class105.field1434, -22602) : class279.field3769.method590(class105.field1434, -22602);
                if (arg2.field2740 > arg2.field2722) {
                    var9 = arg2.method1157(-1, true) + (var3 ? class213.method1278(class75.field1089.field2722, -76, arg2.field2722) : "<col=ffffff>") + " (" + var8 + arg2.field2722 + "+" + (arg2.field2740 - arg2.field2722) + ")";
                } else {
                    var9 = arg2.method1157(-1, true) + (var3 ? class213.method1278(class75.field1089.field2722, -47, arg2.field2722) : "<col=ffffff>") + " (" + var8 + arg2.field2722 + ")";
                }
            } else {
                var9 = arg2.method1157(-1, true) + " (" + class149.field2108.method590(class105.field1434, -22602) + arg2.field2708 + ")";
            }
            if (class297.field4101) {
                if (!arg0 && (class450.field6497 & 0x8) != 0) {
                    class125.field1704++;
                    class376.method2167(0, 0, (long) arg2.field297, 21, class327.field4483, (byte) -90, -1, false, class526.field7728 + " -> <col=ffffff>" + var9, class344.field4734, true);
                }
            } else if (arg0) {
                class376.method2167(0, 0, 0L, -1, -1, (byte) -90, 0, true, "", "<col=cccccc>" + var9, false);
            } else {
                for (int var10 = 7; var10 >= 0; var10--) {
                    if (class422.field6158[var10] != null) {
                        short var13 = 0;
                        if (class341.field4700 == class166.field2348 && class422.field6158[var10].equalsIgnoreCase(class477.field6978.method590(class105.field1434, -22602))) {
                            if (class75.field1089.field2722 < arg2.field2722) {
                                var13 = 2000;
                            }
                            if (class75.field1089.field2703 != 0 && arg2.field2703 != 0) {
                                if (class75.field1089.field2703 == arg2.field2703) {
                                    var13 = 2000;
                                } else {
                                    var13 = 0;
                                }
                            }
                        } else if (class495.field7292[var10]) {
                            var13 = 2000;
                        }
                        short var14 = (short) (class120.field1646[var10] + var13);
                        int var15 = class361.field4950[var10] == -1 ? class118.field1593 : class361.field4950[var10];
                        class376.method2167(0, 0, (long) arg2.field297, var14, var15, (byte) -90, -1, false, "<col=ffffff>" + var9, class422.field6158[var10], true);
                        class210.field2968++;
                    }
                }
            }
            if (!arg0) {
                for (class149 var11 = (class149) class260.field3585.method3072((byte) 97); var11 != null; var11 = (class149) class260.field3585.method3066(2)) {
                    if (var11.field2102 == 8) {
                        var11.field2097 = "<col=ffffff>" + var9;
                        break;
                    }
                }
            }
            int var12 = 122 / ((6 - arg1) / 38);
        } else if (class297.field4101 && (class450.field6497 & 0x10) != 0) {
            class376.method2167(0, 0, 0L, 51, class327.field4483, (byte) -90, -1, false, class526.field7728 + " -> <col=ffffff>" + class426.field6235.method590(class105.field1434, -22602), class344.field4734, true);
            class103.field1407++;
        }
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Lht;)V")
    public class519(class410 arg0) {
        this.field7650 = arg0;
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(B)I")
    public static final int method3056(byte arg0) {
        field7643++;
        if (class292.field3914 == null) {
            if (!class9.field86 && class370.field5198 > 0) {
                if (class483.field7095 && class488.field7125.method1212(-1, 81) && class370.field5198 > 2) {
                    return ((class149) class260.field3585.field7697.field7339.field7339).field2098;
                }
                return ((class149) class260.field3585.field7697.field7339).field2098;
            }
            int var1 = class332.field4528.method54(100);
            int var2 = class332.field4528.method55((byte) -87);
            int var3 = class267.field3662;
            int var4 = class217.field3071;
            int var5 = class312.field4293;
            if (var1 > var3 && (var3 + var5) > var1) {
                int var6 = -1;
                for (int var7 = 0; var7 < class370.field5198; var7++) {
                    if (class205.field2910) {
                        int var12 = var4 + ((-1 - var7 + class370.field5198) * 16) + 33;
                        if (var2 > (var12 - 13) && var12 + 3 >= var2) {
                            var6 = var7;
                        }
                    } else {
                        int var11 = var4 + ((class370.field5198 - var7 + -1) * 16) + 31;
                        if ((var11 - 13) < var2 && var11 + 3 >= var2) {
                            var6 = var7;
                        }
                    }
                }
                if (var6 != -1) {
                    int var8 = 0;
                    class384 var9 = new class384(class260.field3585);
                    for (class149 var10 = (class149) var9.method2203(false); var10 != null; var10 = (class149) var9.method2205(arg0 ^ 0xB17BFCA3)) {
                        if (var8++ == var6) {
                            return var10.field2098;
                        }
                    }
                }
            }
        }
        return arg0 == -61 ? -1 : -83;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)Z")
    public final boolean method3057(int arg0) {
        if (arg0 != 35632) {
            return false;
        }
        field7644++;
        if (this.field7650.field5897 && this.field7650.field5918 && this.field7649 == null) {
            class528 var2 = class516.method3030("uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", this.field7650, 35632, (byte) -49);
            if (var2 != null) {
                this.field7649 = class441.method2631(this.field7650, new class528[] { var2 }, 16);
            }
        }
        return this.field7649 != null;
    }

    static {
        new class83("From", "Von:", "De", "De");
        field7645 = new class485(35, 3);
        field7646 = new class310(74, 4);
        field7647 = new class159(8);
        field7651 = new short[] { -10304, 9104, -1, -1, -1 };
    }
}
