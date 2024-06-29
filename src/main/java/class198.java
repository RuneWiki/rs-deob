import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class198 extends class264 {

    @OriginalMember(owner = "client!dh", name = "p", descriptor = "Ldl;")
    private class207 field2788;

    @OriginalMember(owner = "client!dh", name = "r", descriptor = "I")
    private int field2790;

    @OriginalMember(owner = "client!dh", name = "t", descriptor = "I")
    private int field2792;

    @OriginalMember(owner = "client!dh", name = "w", descriptor = "I")
    private int field2795;

    @OriginalMember(owner = "client!dh", name = "u", descriptor = "[I")
    private int[] field2793;

    @OriginalMember(owner = "client!dh", name = "v", descriptor = "F")
    private float field2794;

    @OriginalMember(owner = "client!dh", name = "q", descriptor = "Lks;")
    private class173 field2789;

    @OriginalMember(owner = "client!dh", name = "y", descriptor = "Let;")
    private class261 field2797;

    @OriginalMember(owner = "client!dh", name = "s", descriptor = "Lpa;")
    private class352 field2791;

    @OriginalMember(owner = "client!dh", name = "x", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2796;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IBFII)V")
    public final void method1372(int arg0, byte arg1, float arg2, int arg3, int arg4) {
        if (arg1 != -22) {
            return;
        }
        if (this.field2795 != -1) {
            class17 var6 = this.field2789.field2260.method468((byte) -37, this.field2795);
            int var7 = var6.field276 & 0xFF;
            if (var7 != 0 && var6.field279 != 4) {
                int var8;
                if (arg3 < 0) {
                    var8 = 0;
                } else if (arg3 <= 127) {
                    var8 = arg3 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg0 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg0 = ((arg0 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) + ((var8 & 0xFF00) * var7 + ((arg0 & 0xFF00) * var10) & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field270 & 0xFF;
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
                arg0 = ((var12 & 0xC200FF00) << 8) + (var14 >> 8) + (var13 & 0xFF00);
            }
        }
        this.field2796.position(arg4 * 4);
        if (arg2 != 1.0F) {
            int var15 = (arg0 & 0xFFD096) >> 16;
            int var16 = (arg0 & 0xFFC9) >> 8;
            int var17 = (int) ((float) var15 * arg2);
            int var18 = arg0 & 0xFF;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            int var19 = (int) ((float) var16 * arg2);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            int var20 = (int) ((float) var18 * arg2);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg0 = var20 | var17 << 16 | var19 << 8;
        }
        this.field2796.put((byte) (arg0 >> 16));
        this.field2796.put((byte) (arg0 >> 8));
        this.field2796.put((byte) arg0);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)V")
    public final void method1373(int arg0, int arg1) {
        this.field2796 = ByteBuffer.allocateDirect(arg0 * arg1);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(BI)V")
    public final void method1374(byte arg0, int arg1) {
        this.field2796.position(arg1 * 4);
        this.field2796.flip();
        class340 var3 = this.field2789.method1168(0, this.field2796, false);
        if (arg0 == 19) {
            this.field2791 = new class352(this.field2789, var3, 5121, 4, 0);
            this.field2796 = null;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIII)V")
    public final void method1375(int arg0, int arg1, int arg2, int arg3) {
        this.field2793[this.field2788.field5538 * arg3 + arg2] = class259.method1785(this.field2793[this.field2788.field5538 * arg3 + arg2], arg1 << arg0);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(BI[I)V")
    public final void method1376(byte arg0, int arg1, int[] arg2) {
        int var4 = 0;
        class256 var5 = class207.field2905;
        var5.field3762 = 0;
        if (arg0 >= -95) {
            this.field2792 = 15;
        }
        if (this.field2789.field2296) {
            for (int var6 = 0; var6 < arg1; var6++) {
                int var7 = arg2[var6];
                short[] var8 = this.field2788.field2892[var7];
                int var9 = this.field2793[var7];
                if (var9 != 0 && var8 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var11 < var8.length) {
                        if ((0x1 << var10++ & var9) == 0) {
                            var11 += 3;
                        } else {
                            var5.method1750((byte) 0, var8[var11++] & 0xFFFF);
                            var4++;
                            var4++;
                            var5.method1750((byte) 0, var8[var11++] & 0xFFFF);
                            var4++;
                            var5.method1750((byte) 0, var8[var11++] & 0xFFFF);
                        }
                    }
                }
            }
        } else {
            for (int var12 = 0; var12 < arg1; var12++) {
                int var13 = arg2[var12];
                short[] var14 = this.field2788.field2892[var13];
                int var15 = this.field2793[var13];
                if (var15 != 0 && var14 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var14.length > var17) {
                        if ((var15 & 0x1 << var16++) == 0) {
                            var17 += 3;
                        } else {
                            var5.method1731(-101, var14[var17++] & 0xFFFF);
                            var4++;
                            var4++;
                            var5.method1731(-101, var14[var17++] & 0xFFFF);
                            var4++;
                            var5.method1731(-128, var14[var17++] & 0xFFFF);
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        opengl var18 = this.field2789.field2253;
        this.field2789.method1183(this.field2795, (this.field2788.field2900 & 0x7) != 0, (this.field2788.field2900 & 0x8) != 0);
        if (this.field2789.field2297) {
            this.field2789.method74(Integer.MAX_VALUE, this.field2792, this.field2790);
        }
        this.field2797.method51(5123, var5.field3764, var5.field3762);
        var18.glMatrixMode(5890);
        var18.glPushMatrix();
        var18.glScalef(1.0F / this.field2794, 1.0F / this.field2794, 1.0F);
        var18.glMatrixMode(5888);
        this.field2789.method1192(this.field2788.field2911, this.field2788.field2925, this.field2791, this.field2788.field2909);
        this.field2789.method1136(this.field2797, 4, 0, var4);
        var18.glMatrixMode(5890);
        var18.glPopMatrix();
        var18.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(BI)V")
    public final void method1377(byte arg0, int arg1) {
        this.field2796.position(arg1 * 4 + 3);
        if (arg0 == 42) {
            this.field2796.put((byte) -1);
        }
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Ldl;IIII)V")
    public class198(class207 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2788 = arg0;
        this.field2790 = arg4;
        this.field2792 = arg3;
        this.field2795 = arg1;
        this.field2793 = new int[this.field2788.field5540 * this.field2788.field5538];
        this.field2794 = (float) arg2;
        this.field2789 = this.field2788.field2896;
        this.field2797 = new class261(this.field2789, 5123, (byte[]) null, 1);
    }
}
