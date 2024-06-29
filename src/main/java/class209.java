import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class209 extends class311 {

    @OriginalMember(owner = "client!qi", name = "w", descriptor = "Leb;")
    private class384 field2930;

    @OriginalMember(owner = "client!qi", name = "s", descriptor = "I")
    private int field2926;

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "F")
    private float field2923;

    @OriginalMember(owner = "client!qi", name = "x", descriptor = "[I")
    private int[] field2931;

    @OriginalMember(owner = "client!qi", name = "q", descriptor = "Lmm;")
    private class357 field2924;

    @OriginalMember(owner = "client!qi", name = "r", descriptor = "I")
    private int field2925;

    @OriginalMember(owner = "client!qi", name = "v", descriptor = "I")
    private int field2929;

    @OriginalMember(owner = "client!qi", name = "t", descriptor = "Laq;")
    private class234 field2927;

    @OriginalMember(owner = "client!qi", name = "y", descriptor = "Lvl;")
    private class376 field2932;

    @OriginalMember(owner = "client!qi", name = "u", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2928;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(II)V")
    public final void method1403(int arg0, int arg1) {
        this.field2928.position(arg0 * 4);
        this.field2928.flip();
        class205 var3 = this.field2924.method2150(0, this.field2928, false);
        this.field2932 = new class376(this.field2924, var3, 5121, 4, 0);
        if (arg1 != 65280) {
            this.field2923 = -0.24788469F;
        }
        this.field2928 = null;
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(II)V")
    public final void method1404(int arg0, int arg1) {
        this.field2928.position(arg0 * arg1 + 3);
        this.field2928.put((byte) -1);
    }

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "(II)V")
    public final void method1405(int arg0, int arg1) {
        this.field2928 = ByteBuffer.allocateDirect(arg0 * arg1);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II[I)V")
    public final void method1406(int arg0, int arg1, int[] arg2) {
        int var4 = 0;
        if (arg0 != 16711935) {
            return;
        }
        class366 var5 = class384.field5279;
        var5.field5048 = 0;
        if (this.field2924.field4829) {
            for (int var6 = 0; var6 < arg1; var6++) {
                int var7 = arg2[var6];
                short[] var8 = this.field2930.field5281[var7];
                int var9 = this.field2931[var7];
                if (var9 != 0 && var8 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var11 < var8.length) {
                        if ((var9 & 0x1 << var10++) == 0) {
                            var11 += 3;
                        } else {
                            var4++;
                            var5.method2275(123, var8[var11++] & 0xFFFF);
                            var4++;
                            var5.method2275(arg0 - 16711815, var8[var11++] & 0xFFFF);
                            var5.method2275(arg0 ^ 0xFF00FF33, var8[var11++] & 0xFFFF);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var12 = 0; var12 < arg1; var12++) {
                int var13 = arg2[var12];
                int var14 = this.field2931[var13];
                short[] var15 = this.field2930.field5281[var13];
                if (var14 != 0 && var15 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var17 < var15.length) {
                        if ((var14 & 0x1 << var16++) == 0) {
                            var17 += 3;
                        } else {
                            var4++;
                            var5.method2271(arg0 - 16712051, var15[var17++] & 0xFFFF);
                            var4++;
                            var5.method2271(arg0 - 16712050, var15[var17++] & 0xFFFF);
                            var4++;
                            var5.method2271(-99, var15[var17++] & 0xFFFF);
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        opengl var18 = this.field2924.field4794;
        this.field2924.method2172(this.field2925, (this.field2930.field5278 & 0x7) != 0, (this.field2930.field5278 & 0x8) != 0);
        if (this.field2924.field4879) {
            this.field2924.method229(Integer.MAX_VALUE, this.field2926, this.field2929);
        }
        this.field2927.method1531(5123, var5.field5076, var5.field5048);
        var18.glMatrixMode(5890);
        var18.glPushMatrix();
        var18.glScalef(1.0F / this.field2923, 1.0F / this.field2923, 1.0F);
        var18.glMatrixMode(5888);
        this.field2924.method2143(this.field2930.field5300, this.field2930.field5308, this.field2932, this.field2930.field5297);
        this.field2924.method2176(this.field2927, 4, 0, var4);
        var18.glMatrixMode(5890);
        var18.glPopMatrix();
        var18.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIBFI)V")
    public final void method1407(int arg0, int arg1, byte arg2, float arg3, int arg4) {
        if (arg2 != -72) {
            this.field2931 = (int[]) null;
        }
        if (this.field2925 != -1) {
            class55 var6 = this.field2924.field4797.method1366(this.field2925, -11039);
            int var7 = var6.field716 & 0xFF;
            if (var7 != 0 && var6.field707 != 4) {
                int var8;
                if (arg1 < 0) {
                    var8 = 0;
                } else if (arg1 <= 127) {
                    var8 = arg1 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg4 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg4 = ((var8 & 0xFF00) * var7 + ((arg4 & 0xFF00) * var10) & 0xFF0000) + ((arg4 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field715 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg4 >> 16 & 0xFF) * var11;
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
                arg4 = (var12 << 8 & 0xFF00E5) + ((var13 & 0xFF00) + (var14 >> 8));
            }
        }
        if (arg3 != 1.0F) {
            int var15 = arg4 >> 16 & 0xFF;
            int var16 = arg4 >> 8 & 0xFF;
            int var17 = arg4 & 0xFF;
            int var18 = (int) ((float) var15 * arg3);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            int var19 = (int) ((float) var16 * arg3);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            int var20 = (int) ((float) var17 * arg3);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg4 = var19 << 8 | var18 << 16 | var20;
        }
        this.field2928.position(arg0 * 4);
        this.field2928.put((byte) (arg4 >> 16));
        this.field2928.put((byte) (arg4 >> 8));
        this.field2928.put((byte) arg4);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIII)V")
    public final void method1408(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 65535) {
            this.field2931[this.field2930.field4384 * arg0 + arg3] = class431.method2655(this.field2931[this.field2930.field4384 * arg0 + arg3], 0x1 << arg1);
        }
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Leb;IIII)V")
    public class209(class384 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2930 = arg0;
        this.field2926 = arg3;
        this.field2923 = (float) arg2;
        this.field2931 = new int[this.field2930.field4384 * this.field2930.field4382];
        this.field2924 = this.field2930.field5277;
        this.field2925 = arg1;
        this.field2929 = arg4;
        this.field2927 = new class234(this.field2924, 5123, (byte[]) null, 1);
    }
}
