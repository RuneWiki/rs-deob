import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class546 extends class544 {

    @OriginalMember(owner = "client!or", name = "z", descriptor = "Lae;")
    private class209 field8038;

    @OriginalMember(owner = "client!or", name = "s", descriptor = "Lmh;")
    private class537 field8031;

    @OriginalMember(owner = "client!or", name = "x", descriptor = "I")
    public int field8036;

    @OriginalMember(owner = "client!or", name = "v", descriptor = "F")
    public float field8034;

    @OriginalMember(owner = "client!or", name = "A", descriptor = "I")
    public int field8039;

    @OriginalMember(owner = "client!or", name = "m", descriptor = "I")
    public int field8025;

    @OriginalMember(owner = "client!or", name = "q", descriptor = "I")
    public int field8029;

    @OriginalMember(owner = "client!or", name = "H", descriptor = "[I")
    private int[] field8046;

    @OriginalMember(owner = "client!or", name = "B", descriptor = "Lwm;")
    private class482 field8040;

    @OriginalMember(owner = "client!or", name = "w", descriptor = "Lvj;")
    public static class373 field8035 = new class373(23, 12);

    @OriginalMember(owner = "client!or", name = "C", descriptor = "Lbk;")
    public static class314 field8041 = new class314();

    @OriginalMember(owner = "client!or", name = "n", descriptor = "I")
    public static int field8026;

    @OriginalMember(owner = "client!or", name = "o", descriptor = "I")
    public static int field8027;

    @OriginalMember(owner = "client!or", name = "p", descriptor = "I")
    public static int field8028;

    @OriginalMember(owner = "client!or", name = "r", descriptor = "I")
    public static int field8030;

    @OriginalMember(owner = "client!or", name = "u", descriptor = "I")
    public static int field8033;

    @OriginalMember(owner = "client!or", name = "y", descriptor = "I")
    public static int field8037;

    @OriginalMember(owner = "client!or", name = "G", descriptor = "I")
    public static int field8045;

    @OriginalMember(owner = "client!or", name = "I", descriptor = "I")
    public static int field8047;

    @OriginalMember(owner = "client!or", name = "t", descriptor = "Lro;")
    private class2 field8032;

    @OriginalMember(owner = "client!or", name = "F", descriptor = "Ljaclib/memory/Stream;")
    private Stream field8044;

    @OriginalMember(owner = "client!or", name = "E", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field8043;

    @OriginalMember(owner = "client!or", name = "D", descriptor = "[Lts;")
    public static class455[] field8042;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Z)V")
    public static final void method3200(boolean arg0) {
        if (arg0) {
            class383.field5070 = class292.field3786;
            class128.field1574 = class370.field4884;
        } else {
            class383.field5070 = class593.field8615;
            class128.field1574 = class90.field1114;
        }
        client.field3216 = class383.field5070.length;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(B[II)V")
    public final void method3201(byte arg0, int[] arg1, int arg2) {
        field8027++;
        int var4 = 0;
        class385 var5 = this.field8031.field7852;
        if (arg0 != 26) {
            this.method3209(80, 20);
        }
        var5.field4966 = 0;
        if (this.field8031.field7754) {
            for (int var12 = 0; var12 < arg2; var12++) {
                int var13 = arg1[var12];
                short[] var14 = this.field8038.field2510[var13];
                int var15 = this.field8046[var13];
                if (var15 != 0 && var14 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var17 < var14.length) {
                        if ((0x1 << var16++ & var15) == 0) {
                            var17 += 3;
                        } else {
                            var5.method2115(var14[var17++] & 0xFFFF, 3324);
                            var4++;
                            var5.method2115(var14[var17++] & 0xFFFF, 3324);
                            var4++;
                            var4++;
                            var5.method2115(var14[var17++] & 0xFFFF, 3324);
                        }
                    }
                }
            }
        } else {
            for (int var6 = 0; var6 < arg2; var6++) {
                int var7 = arg1[var6];
                int var8 = this.field8046[var7];
                short[] var9 = this.field8038.field2510[var7];
                if (var8 != 0 && var9 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var9.length > var11) {
                        if ((var8 & 0x1 << var10++) == 0) {
                            var11 += 3;
                        } else {
                            var4++;
                            var5.method2097(arg0 - 1011, var9[var11++] & 0xFFFF);
                            var4++;
                            var5.method2097(arg0 - 1011, var9[var11++] & 0xFFFF);
                            var4++;
                            var5.method2097(arg0 ^ 0xFFFFFC3D, var9[var11++] & 0xFFFF);
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        this.field8040.method1862(-32036, var5.field4966, var5.field4929, 5123);
        this.field8031.method3131(this.field8038.field2547, this.field8032, (byte) -127, this.field8038.field2556, this.field8038.field2550);
        this.field8031.method3067(-27210, this.field8029, (this.field8038.field2516 & 0x7) != 0, (this.field8038.field2516 & 0x8) != 0);
        if (this.field8031.field7811) {
            this.field8031.method1159(Integer.MAX_VALUE, this.field8036, this.field8039, this.field8025);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(1.0F / this.field8034, 1.0F / this.field8034, 1.0F);
        OpenGL.glMatrixMode(5888);
        this.field8031.method3131(this.field8038.field2547, this.field8032, (byte) -125, this.field8038.field2556, this.field8038.field2550);
        this.field8031.method3120(arg0 - 5753, var4, 4, this.field8040, 0);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(B)V")
    public static void method3202(byte arg0) {
        if (arg0 != 50) {
            field8035 = null;
        }
        field8041 = null;
        field8035 = null;
        field8042 = null;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(I[[[Ldg;)V")
    public static final void method3203(int arg0, class349[][][] arg1) {
        for (int var2 = arg0; var2 < arg1.length; var2++) {
            class349[][] var3 = arg1[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class349 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field4506 instanceof class269) {
                            ((class269) var6.field4506).method339((byte) -125);
                        }
                        if (var6.field4507 instanceof class269) {
                            ((class269) var6.field4507).method339((byte) -115);
                        }
                        if (var6.field4498 instanceof class269) {
                            ((class269) var6.field4498).method339((byte) -126);
                        }
                        if (var6.field4496 instanceof class269) {
                            ((class269) var6.field4496).method339((byte) -116);
                        }
                        if (var6.field4497 instanceof class269) {
                            ((class269) var6.field4497).method339((byte) -122);
                        }
                        for (class61 var7 = var6.field4499; var7 != null; var7 = var7.field595) {
                            class598 var8 = var7.field589;
                            if (var8 instanceof class269) {
                                ((class269) var8).method339((byte) -121);
                            }
                        }
                    }
                }
            }
        }
        field8045++;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IZIIIIIIZ)Z")
    public static final boolean method3204(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        field8033++;
        int var9 = class103.field1265.field6483[0];
        int var10 = class103.field1265.field6491[0];
        if (var9 < 0 || var9 >= class106.field1289 || var10 < 0 || var10 >= class422.field5452) {
            return false;
        } else if (arg4 >= 0 && class106.field1289 > arg4 && arg5 >= 0 && arg5 < class422.field5452) {
            int var11 = class279.method1591(class103.field1265.method2694(28146), var9, class545.field7996, arg7, arg2, var10, class309.field3939[class103.field1265.field8660], class602.field8696, arg5, arg3, -64, arg4, arg0, arg6, arg8);
            if (var11 < 1) {
                return false;
            }
            class469.field6549 = class602.field8696[var11 - 1];
            class136.field1666 = class545.field7996[var11 - 1];
            class251.field3235 = false;
            class351.method1956(-9046);
            if (!arg1) {
                method3200(false);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(II)V")
    public final void method3205(int arg0, int arg1) {
        this.field8043 = this.field8031.field7733.method3336(arg0 * 4, true);
        field8037++;
        if (arg1 >= -4) {
            this.method3207(73, 93, true, -57);
        }
        this.field8044 = new Stream(this.field8043);
    }

    @OriginalMember(owner = "client!or", name = "c", descriptor = "(II)V")
    public final void method3206(int arg0, int arg1) {
        field8026++;
        this.field8044.method3338(arg1 * 4 + arg0);
        this.field8044.method3337(-1);
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IIZI)V")
    public final void method3207(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            this.method3201((byte) 16, null, -124);
        }
        field8028++;
        this.field8046[this.field8038.field2116 * arg1 + arg0] = class42.method223(this.field8046[this.field8038.field2116 * arg1 + arg0], 0x1 << arg3);
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(FIIII)V")
    public final void method3208(float arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field8029 != -1) {
            class217 var6 = this.field8031.field2481.method119(arg2 - 122, this.field8029);
            int var7 = var6.field2656 & 0xFF;
            if (var7 != 0 && var6.field2657 != 4) {
                int var8;
                if (arg4 < 0) {
                    var8 = 0;
                } else if (arg4 <= 127) {
                    var8 = arg4 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg3 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg3 = ((arg3 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) + ((arg3 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field2644 & 0xFF;
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
                arg3 = (var13 & 0xFF00) + ((var12 & 0xAE00FF00) << 8) + (var14 >> 8);
            }
        }
        field8047++;
        if (arg2 != 0) {
            this.field8040 = null;
        }
        this.field8044.method3338(arg1 * 4);
        if (arg0 != 1.0F) {
            int var15 = arg3 >> 16 & 0xFF;
            int var16 = (arg3 & 0xFF91) >> 8;
            int var17 = arg3 & 0xFF;
            int var18 = (int) ((float) var15 * arg0);
            int var19 = (int) ((float) var16 * arg0);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            int var20 = (int) ((float) var17 * arg0);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg3 = var18 << 16 | var19 << 8 | var20;
        }
        this.field8044.method3337((byte) (arg3 >> 16));
        this.field8044.method3337((byte) (arg3 >> 8));
        this.field8044.method3337((byte) arg3);
    }

    @OriginalMember(owner = "client!or", name = "d", descriptor = "(II)V")
    public final void method3209(int arg0, int arg1) {
        field8030++;
        this.field8044.method3342();
        if (arg1 < 19) {
            this.method3206(-62, -113);
        }
        class21 var3 = this.field8031.method3086(arg0 * 4, (byte) -62, false, this.field8043, 4);
        this.field8032 = new class2(var3, 5121, 4, 0);
        this.field8044 = null;
        this.field8043 = null;
    }

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lae;IIIII)V")
    public class546(class209 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field8038 = arg0;
        this.field8031 = this.field8038.field2527;
        this.field8036 = arg3;
        this.field8034 = arg2;
        this.field8039 = arg4;
        this.field8025 = arg5;
        this.field8029 = arg1;
        this.field8046 = new int[this.field8038.field2116 * this.field8038.field2114];
        this.field8040 = new class482(this.field8031, 5123, null, 1);
    }
}
