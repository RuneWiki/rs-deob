import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class176 extends class431 {

    @OriginalMember(owner = "client!rh", name = "v", descriptor = "Llk;")
    private class417 field2619;

    @OriginalMember(owner = "client!rh", name = "u", descriptor = "I")
    public int field2618;

    @OriginalMember(owner = "client!rh", name = "x", descriptor = "[I")
    private int[] field2621;

    @OriginalMember(owner = "client!rh", name = "C", descriptor = "F")
    public float field2626;

    @OriginalMember(owner = "client!rh", name = "I", descriptor = "Lkd;")
    private class188 field2632;

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "I")
    public int field2610;

    @OriginalMember(owner = "client!rh", name = "G", descriptor = "I")
    public int field2630;

    @OriginalMember(owner = "client!rh", name = "r", descriptor = "I")
    public int field2615;

    @OriginalMember(owner = "client!rh", name = "z", descriptor = "Lfj;")
    private class469 field2623;

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!rh", name = "o", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!rh", name = "p", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!rh", name = "s", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!rh", name = "w", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!rh", name = "y", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!rh", name = "A", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!rh", name = "E", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!rh", name = "F", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!rh", name = "H", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "Lti;")
    public static class307 field2608;

    @OriginalMember(owner = "client!rh", name = "D", descriptor = "Lul;")
    public static class406 field2627;

    @OriginalMember(owner = "client!rh", name = "B", descriptor = "Lgi;")
    private class481 field2625;

    @OriginalMember(owner = "client!rh", name = "q", descriptor = "Ljaggl/memory/NativeBuffer;")
    private NativeBuffer field2614;

    @OriginalMember(owner = "client!rh", name = "t", descriptor = "Ljaggl/memory/NativeStream;")
    private NativeStream field2617;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I[II)V")
    public final void method1173(int arg0, int[] arg1, int arg2) {
        field2622++;
        int var4 = 0;
        class23 var5 = this.field2632.field3055;
        var5.field3556 = 0;
        if (arg2 != -1) {
            field2613 = 44;
        }
        if (this.field2632.field3141) {
            for (int var12 = 0; var12 < arg0; var12++) {
                int var13 = arg1[var12];
                short[] var14 = this.field2619.field6228[var13];
                int var15 = this.field2621[var13];
                if (var15 != 0 && var14 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var17 < var14.length) {
                        if ((0x1 << var16++ & var15) == 0) {
                            var17 += 3;
                        } else {
                            var5.method1542(var14[var17++] & 0xFFFF, arg2 - 2755);
                            var4++;
                            var4++;
                            var5.method1542(var14[var17++] & 0xFFFF, -2756);
                            var5.method1542(var14[var17++] & 0xFFFF, -2756);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var6 = 0; var6 < arg0; var6++) {
                int var7 = arg1[var6];
                int var8 = this.field2621[var7];
                short[] var9 = this.field2619.field6228[var7];
                if (var8 != 0 && var9 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var11 < var9.length) {
                        if ((var8 & 0x1 << var10++) == 0) {
                            var11 += 3;
                        } else {
                            var4++;
                            var5.method1504((byte) 104, var9[var11++] & 0xFFFF);
                            var5.method1504((byte) 104, var9[var11++] & 0xFFFF);
                            var4++;
                            var5.method1504((byte) 104, var9[var11++] & 0xFFFF);
                            var4++;
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        this.field2623.method153(var5.field3556, 5123, (byte) -62, var5.field3572);
        this.field2632.method1267(this.field2619.field6251, this.field2619.field6246, (byte) -56, this.field2619.field6252, this.field2625);
        this.field2632.method1257(this.field2630, (this.field2619.field6238 & 0x7) != 0, 96, (this.field2619.field6238 & 0x8) != 0);
        if (this.field2632.field3092) {
            this.field2632.method342(Integer.MAX_VALUE, this.field2610, this.field2615, this.field2618);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(1.0F / this.field2626, 1.0F / this.field2626, 1.0F);
        OpenGL.glMatrixMode(5888);
        this.field2632.method1267(this.field2619.field6251, this.field2619.field6246, (byte) -35, this.field2619.field6252, this.field2625);
        this.field2632.method1270(this.field2623, var4, 0, 4, -2);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZI)V")
    public final void method1174(boolean arg0, int arg1) {
        if (arg0) {
            field2629 = 77;
        }
        field2620++;
        this.field2614 = this.field2632.field3029.method2727(arg1 * 4);
        this.field2617 = new NativeStream(this.field2614);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
    public static void method1175(int arg0) {
        field2608 = null;
        field2627 = null;
        if (arg0 != -7107) {
            field2627 = null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)V")
    public final void method1176(int arg0, int arg1) {
        this.field2617.method2721(arg0 * 4 + 3);
        int var3 = 108 / ((arg1 + 70) / 38);
        field2628++;
        this.field2617.method2720(-1);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILul;)V")
    public static final void method1177(int arg0, class406 arg1) {
        field2616++;
        class20.field250 = arg1;
        if (arg0 != 19431) {
            method1175(-108);
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(ZI)V")
    public final void method1178(boolean arg0, int arg1) {
        if (!arg0) {
            return;
        }
        this.field2617.method2724();
        field2631++;
        class253 var3 = this.field2632.method1302(false, (byte) -121, 4, this.field2614, arg1 * 4);
        this.field2625 = new class481(var3, 5121, 4, 0);
        this.field2614 = null;
        this.field2617 = null;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIFZ)V")
    public final void method1179(int arg0, int arg1, int arg2, float arg3, boolean arg4) {
        field2609++;
        if (!arg4) {
            method1175(-111);
        }
        if (this.field2630 != -1) {
            class281 var6 = this.field2632.field524.method584(true, this.field2630);
            int var7 = var6.field4273 & 0xFF;
            if (var7 != 0 && var6.field4261 != 4) {
                int var8;
                if (arg2 < 0) {
                    var8 = 0;
                } else if (arg2 <= 127) {
                    var8 = arg2 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg0 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg0 = ((var8 & 0xFF00) * var7 + ((arg0 & 0xFF00) * var10) & 0xFF0000) + ((var8 & 0xFF00FF) * var7 + ((arg0 & 0xFF00FF) * var10) & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field4271 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg0 >> 16 & 0xFF) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = (arg0 >> 8 & 0xFF) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg0 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg0 = ((var12 & 0xA000FF00) << 8) + (var14 >> 8) + (var13 & 0xFF00);
            }
        }
        if (arg3 != 1.0F) {
            int var15 = (arg0 & 0xFF1AF3) >> 16;
            int var16 = arg0 >> 8 & 0xFF;
            int var17 = arg0 & 0xFF;
            int var18 = (int) ((float) var15 * arg3);
            int var19 = (int) ((float) var16 * arg3);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            int var20 = (int) ((float) var17 * arg3);
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
            arg0 = var18 << 16 | var19 << 8 | var20;
        }
        this.field2617.method2721(arg1 * 4);
        this.field2617.method2720((byte) (arg0 >> 16));
        this.field2617.method2720((byte) (arg0 >> 8));
        this.field2617.method2720((byte) arg0);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIII)V")
    public final void method1180(int arg0, int arg1, int arg2, int arg3) {
        field2624++;
        this.field2621[this.field2619.field2207 * arg2 + arg1] = class264.method1763(this.field2621[this.field2619.field2207 * arg2 + arg1], 0x1 << arg0);
        if (arg3 != 0) {
            this.method1176(18, 108);
        }
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Llk;IIIII)V")
    public class176(class417 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2619 = arg0;
        this.field2618 = arg5;
        this.field2621 = new int[this.field2619.field2211 * this.field2619.field2207];
        this.field2626 = arg2;
        this.field2632 = this.field2619.field6239;
        this.field2610 = arg3;
        this.field2630 = arg1;
        this.field2615 = arg4;
        this.field2623 = new class469(this.field2632, 5123, null, 1);
    }
}
