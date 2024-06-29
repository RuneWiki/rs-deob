import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class523 extends class439 {

    @OriginalMember(owner = "client!kr", name = "z", descriptor = "Lpp;")
    private class267 field7690;

    @OriginalMember(owner = "client!kr", name = "D", descriptor = "I")
    public int field7694;

    @OriginalMember(owner = "client!kr", name = "s", descriptor = "F")
    public float field7683;

    @OriginalMember(owner = "client!kr", name = "u", descriptor = "I")
    public int field7685;

    @OriginalMember(owner = "client!kr", name = "H", descriptor = "I")
    public int field7698;

    @OriginalMember(owner = "client!kr", name = "q", descriptor = "[I")
    private int[] field7681;

    @OriginalMember(owner = "client!kr", name = "G", descriptor = "I")
    public int field7697;

    @OriginalMember(owner = "client!kr", name = "y", descriptor = "Lqg;")
    private class321 field7689;

    @OriginalMember(owner = "client!kr", name = "n", descriptor = "Lvq;")
    private class320 field7678;

    @OriginalMember(owner = "client!kr", name = "A", descriptor = "Lko;")
    public static class348 field7691 = new class348();

    @OriginalMember(owner = "client!kr", name = "F", descriptor = "Lao;")
    public static class188 field7696 = new class188(20, 8);

    @OriginalMember(owner = "client!kr", name = "J", descriptor = "Lao;")
    public static class188 field7699 = new class188(49, -1);

    @OriginalMember(owner = "client!kr", name = "o", descriptor = "I")
    public static int field7679;

    @OriginalMember(owner = "client!kr", name = "r", descriptor = "I")
    public static int field7682;

    @OriginalMember(owner = "client!kr", name = "t", descriptor = "I")
    public static int field7684;

    @OriginalMember(owner = "client!kr", name = "v", descriptor = "I")
    public static int field7686;

    @OriginalMember(owner = "client!kr", name = "x", descriptor = "I")
    public static int field7688;

    @OriginalMember(owner = "client!kr", name = "C", descriptor = "I")
    public static int field7693;

    @OriginalMember(owner = "client!kr", name = "E", descriptor = "I")
    public static int field7695;

    @OriginalMember(owner = "client!kr", name = "w", descriptor = "Lwt;")
    private class202 field7687;

    @OriginalMember(owner = "client!kr", name = "p", descriptor = "Ljaggl/memory/NativeBuffer;")
    private NativeBuffer field7680;

    @OriginalMember(owner = "client!kr", name = "B", descriptor = "Ljaggl/memory/NativeStream;")
    private NativeStream field7692;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(BI)V")
    public final void method3086(byte arg0, int arg1) {
        field7679++;
        this.field7680 = this.field7689.field4783.method2658(arg1 * 4);
        if (arg0 <= 59) {
            this.field7687 = null;
        }
        this.field7692 = new NativeStream(this.field7680);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IILqg;Ljava/lang/String;)Lwe;")
    public static final class279 method3087(int arg0, int arg1, class321 arg2, String arg3) {
        field7688++;
        long var4 = OpenGL.glCreateShaderObjectARB(arg1);
        OpenGL.glShaderSourceARB(var4, arg3);
        OpenGL.glCompileShaderARB(var4);
        if (arg0 != 22476) {
            return null;
        }
        OpenGL.glGetObjectParameterivARB(var4, 35713, class248.field3580, 0);
        if (class248.field3580[0] == 0) {
            if (class248.field3580[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class248.field3580, 1);
            if (class248.field3580[1] > 1) {
                byte[] var6 = new byte[class248.field3580[1]];
                OpenGL.glGetInfoLogARB(var4, class248.field3580[1], class248.field3580, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class248.field3580[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class279(arg2, var4, arg1);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IB)V")
    public final void method3088(int arg0, byte arg1) {
        this.field7692.method2653(arg0 * 4 + 3);
        if (arg1 == 55) {
            field7686++;
            this.field7692.method2655(-1);
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IFIII)V")
    public final void method3089(int arg0, float arg1, int arg2, int arg3, int arg4) {
        if (this.field7694 != -1) {
            class216 var6 = this.field7689.field2449.method935(this.field7694, -8037);
            int var7 = var6.field3116 & 0xFF;
            if (var7 != 0 && var6.field3109 != 4) {
                int var8;
                if (arg3 < 0) {
                    var8 = 0;
                } else if (arg3 <= 127) {
                    var8 = arg3 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg4 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg4 = ((arg4 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) + ((arg4 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field3099 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = ((arg4 & 0xFF0000) >> 16) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = ((arg4 & 0xFF00) >> 8) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg4 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg4 = (var14 >> 8) + ((var12 << 8 & 0xFF00FA) + (var13 & 0xFF00));
            }
        }
        field7693++;
        this.field7692.method2653(arg0 * 4);
        if (arg1 != 1.0F) {
            int var15 = arg4 >> 16 & 0xFF;
            int var16 = arg4 >> 8 & 0xFF;
            int var17 = arg4 & 0xFF;
            int var18 = (int) ((float) var15 * arg1);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            int var19 = (int) ((float) var16 * arg1);
            int var20 = (int) ((float) var17 * arg1);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg4 = var20 | var18 << 16 | var19 << 8;
        }
        this.field7692.method2655((byte) (arg4 >> 16));
        if (arg2 != 131586) {
            this.method3088(-66, (byte) 107);
        }
        this.field7692.method2655((byte) (arg4 >> 8));
        this.field7692.method2655((byte) arg4);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(II)V")
    public final void method3090(int arg0, int arg1) {
        this.field7692.method2656();
        field7684++;
        class243 var3 = this.field7689.method2023(false, this.field7680, 17999, 4, arg1 * 4);
        this.field7687 = new class202(var3, 5121, 4, 0);
        this.field7680 = null;
        if (arg0 >= 110) {
            this.field7692 = null;
        }
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(B)V")
    public static void method3091(byte arg0) {
        field7691 = null;
        if (arg0 != -128) {
            field7691 = null;
        }
        field7699 = null;
        field7696 = null;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIIZ)V")
    public final void method3092(int arg0, int arg1, int arg2, boolean arg3) {
        field7682++;
        if (!arg3) {
            method3087(25, 99, null, null);
        }
        this.field7681[this.field7690.field532 * arg2 + arg0] = class29.method239(this.field7681[this.field7690.field532 * arg2 + arg0], 0x1 << arg1);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(II[I)V")
    public final void method3093(int arg0, int arg1, int[] arg2) {
        field7695++;
        if (arg1 >= -112) {
            return;
        }
        int var4 = 0;
        class303 var5 = class356.field5381;
        var5.field4333 = 0;
        if (this.field7689.field4850) {
            for (int var6 = 0; var6 < arg0; var6++) {
                int var7 = arg2[var6];
                int var8 = this.field7681[var7];
                short[] var9 = this.field7690.field3879[var7];
                if (var8 != 0 && var9 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var11 < var9.length) {
                        if ((var8 & 0x1 << var10++) == 0) {
                            var11 += 3;
                        } else {
                            var5.method1874(var9[var11++] & 0xFFFF, (byte) -110);
                            var4++;
                            var4++;
                            var5.method1874(var9[var11++] & 0xFFFF, (byte) -110);
                            var5.method1874(var9[var11++] & 0xFFFF, (byte) -110);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var12 = 0; var12 < arg0; var12++) {
                int var13 = arg2[var12];
                short[] var14 = this.field7690.field3879[var13];
                int var15 = this.field7681[var13];
                if (var15 != 0 && var14 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var17 < var14.length) {
                        if ((0x1 << var16++ & var15) == 0) {
                            var17 += 3;
                        } else {
                            var5.method1863((byte) -124, var14[var17++] & 0xFFFF);
                            var4++;
                            var4++;
                            var5.method1863((byte) -106, var14[var17++] & 0xFFFF);
                            var5.method1863((byte) -118, var14[var17++] & 0xFFFF);
                            var4++;
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        this.field7678.method760(var5.field4326, 5123, 113, var5.field4333);
        this.field7689.method2085(this.field7690.field3897, this.field7690.field3894, this.field7690.field3890, -29066, this.field7687);
        this.field7689.method2037(this.field7694, (this.field7690.field3870 & 0x8) != 0, (byte) -96, (this.field7690.field3870 & 0x7) != 0);
        if (this.field7689.field4807) {
            this.field7689.method536(Integer.MAX_VALUE, this.field7698, this.field7697, this.field7685);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(1.0F / this.field7683, 1.0F / this.field7683, 1.0F);
        OpenGL.glMatrixMode(5888);
        this.field7689.method2085(this.field7690.field3897, this.field7690.field3894, this.field7690.field3890, -29066, this.field7687);
        this.field7689.method2086(var4, this.field7678, 0, 4, 0);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Lpp;IIIII)V")
    public class523(class267 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field7690 = arg0;
        this.field7694 = arg1;
        this.field7683 = arg2;
        this.field7685 = arg5;
        this.field7698 = arg3;
        this.field7681 = new int[this.field7690.field532 * this.field7690.field531];
        this.field7697 = arg4;
        this.field7689 = this.field7690.field3883;
        this.field7678 = new class320(this.field7689, 5123, null, 1);
    }
}
