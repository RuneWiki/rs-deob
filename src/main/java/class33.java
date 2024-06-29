import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class33 extends class476 {

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "Lmr;")
    private class163 field498;

    @OriginalMember(owner = "client!wf", name = "A", descriptor = "I")
    public int field513;

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "I")
    public int field503;

    @OriginalMember(owner = "client!wf", name = "x", descriptor = "I")
    public int field510;

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "[I")
    private int[] field507;

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "Lpg;")
    private class333 field499;

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "F")
    public float field501;

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "I")
    public int field505;

    @OriginalMember(owner = "client!wf", name = "v", descriptor = "Ltd;")
    private class379 field508;

    @OriginalMember(owner = "client!wf", name = "w", descriptor = "Lgs;")
    public static class439 field509 = new class439();

    @OriginalMember(owner = "client!wf", name = "B", descriptor = "[B")
    public static byte[] field514 = new byte[520];

    @OriginalMember(owner = "client!wf", name = "D", descriptor = "Z")
    public static boolean field516 = false;

    @OriginalMember(owner = "client!wf", name = "F", descriptor = "Los;")
    public static class387 field518 = null;

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!wf", name = "y", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!wf", name = "z", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!wf", name = "C", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "Lhf;")
    private class475 field502;

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "Ljaggl/memory/NativeBuffer;")
    private NativeBuffer field497;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "Ljaggl/memory/NativeStream;")
    private NativeStream field495;

    @OriginalMember(owner = "client!wf", name = "E", descriptor = "[Ljava/lang/String;")
    public static String[] field517;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(BI[I)V")
    public final void method240(byte arg0, int arg1, int[] arg2) {
        field511++;
        int var4 = 0;
        class504 var5 = this.field499.field4789;
        var5.field4360 = 0;
        if (arg0 != -70) {
            return;
        }
        if (this.field499.field4796) {
            for (int var12 = 0; var12 < arg1; var12++) {
                int var13 = arg2[var12];
                short[] var14 = this.field498.field2445[var13];
                int var15 = this.field507[var13];
                if (var15 != 0 && var14 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var17 < var14.length) {
                        if ((var15 & 0x1 << var16++) == 0) {
                            var17 += 3;
                        } else {
                            var5.method1857(561746448, var14[var17++] & 0xFFFF);
                            var4++;
                            var4++;
                            var5.method1857(561746448, var14[var17++] & 0xFFFF);
                            var5.method1857(561746448, var14[var17++] & 0xFFFF);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var6 = 0; var6 < arg1; var6++) {
                int var7 = arg2[var6];
                short[] var8 = this.field498.field2445[var7];
                int var9 = this.field507[var7];
                if (var9 != 0 && var8 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var8.length > var11) {
                        if ((0x1 << var10++ & var9) == 0) {
                            var11 += 3;
                        } else {
                            var4++;
                            var5.method1829(arg0 ^ 0xFFFFFFBA, var8[var11++] & 0xFFFF);
                            var4++;
                            var5.method1829(arg0 ^ 0xFFFFFFBA, var8[var11++] & 0xFFFF);
                            var4++;
                            var5.method1829(arg0 ^ 0xFFFFFFBA, var8[var11++] & 0xFFFF);
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        this.field508.method2052(5123, var5.field4360, arg0 + 16804, var5.field4336);
        this.field499.method1973(this.field498.field2492, this.field498.field2491, this.field502, this.field498.field2482, 32888);
        this.field499.method1975((this.field498.field2466 & 0x7) != 0, arg0 - 23317, (this.field498.field2466 & 0x8) != 0, this.field510);
        if (this.field499.field4769) {
            this.field499.method482(Integer.MAX_VALUE, this.field503, this.field513, this.field505);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(1.0F / this.field501, 1.0F / this.field501, 1.0F);
        OpenGL.glMatrixMode(5888);
        this.field499.method1973(this.field498.field2492, this.field498.field2491, this.field502, this.field498.field2482, 32888);
        this.field499.method1964(0, (byte) -90, this.field508, 4, var4);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IB)V")
    public final void method241(int arg0, byte arg1) {
        field504++;
        this.field495.method2854();
        if (arg1 <= 88) {
            this.field503 = -61;
        }
        class171 var3 = this.field499.method2021((byte) 87, arg0 * 4, 4, false, this.field497);
        this.field502 = new class475(var3, 5121, 4, 0);
        this.field495 = null;
        this.field497 = null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)V")
    public final void method242(int arg0, int arg1) {
        field512++;
        this.field497 = this.field499.field4730.method2846(arg0 * arg1);
        this.field495 = new NativeStream(this.field497);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIBI)V")
    public final void method243(int arg0, int arg1, byte arg2, int arg3) {
        field496++;
        this.field507[this.field498.field125 * arg1 + arg0] = class219.method1367(this.field507[this.field498.field125 * arg1 + arg0], 0x1 << arg3);
        int var5 = 85 % ((arg2 - 23) / 43);
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V")
    public static void method244(int arg0) {
        if (arg0 == 1) {
            field514 = null;
            field517 = null;
            field509 = null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIIF)V")
    public final void method245(int arg0, int arg1, int arg2, int arg3, float arg4) {
        if (this.field510 != -1) {
            class249 var6 = this.field499.field3988.method914(false, this.field510);
            int var7 = var6.field3393 & 0xFF;
            if (var7 != 0 && var6.field3382 != 4) {
                int var8;
                if (arg0 < 0) {
                    var8 = 0;
                } else if (arg0 <= 127) {
                    var8 = arg0 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg3 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg3 = ((arg3 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) + ((arg3 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field3387 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = ((arg3 & 0xFF0000) >> 16) * var11;
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
                arg3 = (var13 & 0xFF00) + (var14 >> 8) + (var12 << 8 & 0xFF00E1);
            }
        }
        field500++;
        this.field495.method2853(arg2 * 4);
        if (arg4 != 1.0F) {
            int var15 = arg3 >> 16 & 0xFF;
            int var16 = (arg3 & 0xFFFB) >> 8;
            int var17 = (int) ((float) var15 * arg4);
            int var18 = arg3 & 0xFF;
            int var19 = (int) ((float) var16 * arg4);
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            int var20 = (int) ((float) var18 * arg4);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg3 = var19 << 8 | var17 << 16 | var20;
        }
        this.field495.method2851((byte) (arg3 >> 16));
        this.field495.method2851((byte) (arg3 >> 8));
        this.field495.method2851((byte) arg3);
        if (arg1 > -74) {
            field516 = false;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(BI)V")
    public final void method246(byte arg0, int arg1) {
        field506++;
        this.field495.method2853(arg1 * 4 + 3);
        this.field495.method2851(-1);
        if (arg0 != -41) {
            this.method243(4, 105, (byte) -106, 44);
        }
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lmr;IIIII)V")
    public class33(class163 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field498 = arg0;
        this.field513 = arg4;
        this.field503 = arg3;
        this.field510 = arg1;
        this.field507 = new int[this.field498.field125 * this.field498.field124];
        this.field499 = this.field498.field2441;
        this.field501 = arg2;
        this.field505 = arg5;
        this.field508 = new class379(this.field499, 5123, null, 1);
    }
}
