import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class525 extends class498 {

    @OriginalMember(owner = "client!fm", name = "v", descriptor = "Lus;")
    private class1 field7722;

    @OriginalMember(owner = "client!fm", name = "J", descriptor = "I")
    public int field7735;

    @OriginalMember(owner = "client!fm", name = "o", descriptor = "I")
    public int field7715;

    @OriginalMember(owner = "client!fm", name = "s", descriptor = "F")
    public float field7719;

    @OriginalMember(owner = "client!fm", name = "G", descriptor = "[I")
    private int[] field7732;

    @OriginalMember(owner = "client!fm", name = "F", descriptor = "Lih;")
    private class503 field7731;

    @OriginalMember(owner = "client!fm", name = "C", descriptor = "I")
    public int field7729;

    @OriginalMember(owner = "client!fm", name = "q", descriptor = "I")
    public int field7717;

    @OriginalMember(owner = "client!fm", name = "y", descriptor = "Len;")
    private class213 field7725;

    @OriginalMember(owner = "client!fm", name = "r", descriptor = "Ltn;")
    public static class60 field7718 = new class60(68, 1);

    @OriginalMember(owner = "client!fm", name = "n", descriptor = "I")
    public static int field7714;

    @OriginalMember(owner = "client!fm", name = "p", descriptor = "I")
    public static int field7716;

    @OriginalMember(owner = "client!fm", name = "x", descriptor = "I")
    public static int field7724;

    @OriginalMember(owner = "client!fm", name = "z", descriptor = "I")
    public static int field7726;

    @OriginalMember(owner = "client!fm", name = "A", descriptor = "I")
    public static int field7727;

    @OriginalMember(owner = "client!fm", name = "B", descriptor = "I")
    public static int field7728;

    @OriginalMember(owner = "client!fm", name = "E", descriptor = "I")
    public static int field7730;

    @OriginalMember(owner = "client!fm", name = "H", descriptor = "I")
    public static int field7733;

    @OriginalMember(owner = "client!fm", name = "I", descriptor = "I")
    public static int field7734;

    @OriginalMember(owner = "client!fm", name = "u", descriptor = "Lff;")
    private class9 field7721;

    @OriginalMember(owner = "client!fm", name = "t", descriptor = "Ljaggl/memory/NativeBuffer;")
    private NativeBuffer field7720;

    @OriginalMember(owner = "client!fm", name = "w", descriptor = "Ljaggl/memory/NativeStream;")
    private NativeStream field7723;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(BI)V", line = 4)
    public static final void method3098(byte arg0, int arg1) {
        if (arg0 != -71) {
            method3105((byte) 66, 13);
        }
        field7724++;
        class45 var2 = class354.method2094(arg1, (byte) -68, 8);
        var2.method261(4);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I[IB)V", line = 26)
    public final void method3099(int arg0, int[] arg1, byte arg2) {
        field7730++;
        int var4 = 0;
        class141 var5 = this.field7731.field7451;
        if (arg2 != -69) {
            return;
        }
        var5.field5665 = 0;
        if (this.field7731.field7340) {
            for (int var12 = 0; var12 < arg0; var12++) {
                int var13 = arg1[var12];
                short[] var14 = this.field7722.field24[var13];
                int var15 = this.field7732[var13];
                if (var15 != 0 && var14 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var17 < var14.length) {
                        if ((0x1 << var16++ & var15) == 0) {
                            var17 += 3;
                        } else {
                            var4++;
                            var5.method2372(var14[var17++] & 0xFFFF, -125);
                            var5.method2372(var14[var17++] & 0xFFFF, -127);
                            var4++;
                            var4++;
                            var5.method2372(var14[var17++] & 0xFFFF, -127);
                        }
                    }
                }
            }
        } else {
            for (int var6 = 0; var6 < arg0; var6++) {
                int var7 = arg1[var6];
                short[] var8 = this.field7722.field24[var7];
                int var9 = this.field7732[var7];
                if (var9 != 0 && var8 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var11 < var8.length) {
                        if ((var9 & 0x1 << var10++) == 0) {
                            var11 += 3;
                        } else {
                            var5.method2378(arg2 - 1784786195, var8[var11++] & 0xFFFF);
                            var4++;
                            var5.method2378(-1784786264, var8[var11++] & 0xFFFF);
                            var4++;
                            var4++;
                            var5.method2378(-1784786264, var8[var11++] & 0xFFFF);
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        this.field7725.method454(var5.field5665, (byte) 60, var5.field5663, 5123);
        this.field7731.method2939(this.field7722.field41, this.field7722.field50, arg2 ^ 0xFFFFC104, this.field7721, this.field7722.field51);
        this.field7731.method2948((this.field7722.field18 & 0x7) != 0, true, this.field7715, (this.field7722.field18 & 0x8) != 0);
        if (this.field7731.field7438) {
            this.field7731.method333(Integer.MAX_VALUE, this.field7729, this.field7735, this.field7717);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(1.0F / this.field7719, 1.0F / this.field7719, 1.0F);
        OpenGL.glMatrixMode(5888);
        this.field7731.method2939(this.field7722.field41, this.field7722.field50, 16063, this.field7721, this.field7722.field51);
        this.field7731.method2998(0, 4, this.field7725, arg2 + 157, var4);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Z)V", line = 150)
    public static void method3100(boolean arg0) {
        field7718 = null;
        if (arg0) {
            method3105((byte) -128, -16);
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)V", line = 160)
    public final void method3101(int arg0, int arg1) {
        field7733++;
        this.field7723.method2613();
        class157 var3 = this.field7731.method2985(this.field7720, 113, false, 4, arg0 * 4);
        this.field7721 = new class9(var3, 5121, 4, 0);
        this.field7723 = null;
        this.field7720 = null;
        if (arg1 != -1626213784) {
            field7718 = null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(BI)V", line = 179)
    public final void method3102(byte arg0, int arg1) {
        field7727++;
        this.field7723.method2614(arg1 * 4 + 3);
        this.field7723.method2617(arg0);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIFII)V", line = 188)
    public final void method3103(int arg0, int arg1, float arg2, int arg3, int arg4) {
        field7714++;
        if (this.field7715 != -1) {
            class222 var6 = this.field7731.field4246.method83(this.field7715, 50);
            int var7 = var6.field3201 & 0xFF;
            if (var7 != 0 && var6.field3197 != 4) {
                int var8;
                if (arg1 < 0) {
                    var8 = 0;
                } else if (arg1 <= 127) {
                    var8 = arg1 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg3 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg3 = ((var8 & 0xFF00FF) * var7 + ((arg3 & 0xFF00FF) * var10) & 0xFF00FF00) + ((arg3 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field3191 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg3 >> 16 & 0xFF) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = ((arg3 & 0xFF00) >> 8) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg3 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg3 = (var14 >> 8) + (var12 << 8 & 0xFF0025) + (var13 & 0xFF00);
            }
        }
        this.field7723.method2614(arg4 * 4);
        if (arg0 != 17439) {
            return;
        }
        if (arg2 != 1.0F) {
            int var15 = arg3 >> 16 & 0xFF;
            int var16 = (arg3 & 0xFF9B) >> 8;
            int var17 = arg3 & 0xFF;
            int var18 = (int) ((float) var15 * arg2);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            int var19 = (int) ((float) var16 * arg2);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            int var20 = (int) ((float) var17 * arg2);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg3 = var20 | var19 << 8 | var18 << 16;
        }
        this.field7723.method2617((byte) (arg3 >> 16));
        this.field7723.method2617((byte) (arg3 >> 8));
        this.field7723.method2617((byte) arg3);
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(II)V", line = 301)
    public final void method3104(int arg0, int arg1) {
        field7726++;
        this.field7720 = this.field7731.field7312.method2619(arg0 * arg1);
        this.field7723 = new NativeStream(this.field7720);
    }

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "(BI)V", line = 314)
    public static final void method3105(byte arg0, int arg1) {
        field7728++;
        class45 var2 = class354.method2094(arg1, (byte) -112, 10);
        if (arg0 != 121) {
            method3100(true);
        }
        var2.method261(4);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIII)V", line = 329)
    public final void method3106(int arg0, int arg1, int arg2, int arg3) {
        field7734++;
        if (arg3 != -22119) {
            method3105((byte) -2, -20);
        }
        this.field7732[this.field7722.field411 * arg1 + arg2] = class170.method1067(this.field7732[this.field7722.field411 * arg1 + arg2], 0x1 << arg0);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIB)V", line = 340)
    public static final void method3107(int arg0, int arg1, byte arg2) {
        field7716++;
        class45 var3 = class354.method2094(arg1, (byte) -45, 13);
        var3.method260(9188);
        var3.field504 = arg0;
        if (arg2 <= 67) {
            method3100(true);
        }
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Lus;IIIII)V", line = 358)
    public class525(class1 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field7722 = arg0;
        this.field7735 = arg4;
        this.field7715 = arg1;
        this.field7719 = arg2;
        this.field7732 = new int[this.field7722.field413 * this.field7722.field411];
        this.field7731 = this.field7722.field16;
        this.field7729 = arg3;
        this.field7717 = arg5;
        this.field7725 = new class213(this.field7731, 5123, null, 1);
    }
}
