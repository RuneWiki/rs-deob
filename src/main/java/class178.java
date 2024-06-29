import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class178 extends class376 {

    @OriginalMember(owner = "client!hs", name = "t", descriptor = "Ldl;")
    private class39 field2497;

    @OriginalMember(owner = "client!hs", name = "r", descriptor = "I")
    private int field2495;

    @OriginalMember(owner = "client!hs", name = "n", descriptor = "I")
    private int field2491;

    @OriginalMember(owner = "client!hs", name = "o", descriptor = "F")
    private float field2492;

    @OriginalMember(owner = "client!hs", name = "p", descriptor = "Lhj;")
    private class338 field2493;

    @OriginalMember(owner = "client!hs", name = "q", descriptor = "I")
    private int field2494;

    @OriginalMember(owner = "client!hs", name = "m", descriptor = "[I")
    private int[] field2490;

    @OriginalMember(owner = "client!hs", name = "u", descriptor = "Lio;")
    private class251 field2498;

    @OriginalMember(owner = "client!hs", name = "v", descriptor = "Lln;")
    private class212 field2499;

    @OriginalMember(owner = "client!hs", name = "s", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2496;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(I[II)V")
    public final void method1183(int arg0, int[] arg1, int arg2) {
        int var4 = -113 % ((2 - arg2) / 39);
        int var5 = 0;
        class371 var6 = class39.field577;
        var6.field5273 = 0;
        if (this.field2493.field4640) {
            for (int var13 = 0; var13 < arg0; var13++) {
                int var14 = arg1[var13];
                int var15 = this.field2490[var14];
                short[] var16 = this.field2497.field589[var14];
                if (var15 != 0 && var16 != null) {
                    int var17 = 0;
                    int var18 = 0;
                    while (var18 < var16.length) {
                        if ((var15 & 0x1 << var17++) == 0) {
                            var18 += 3;
                        } else {
                            var6.method2416(22064, var16[var18++] & 0xFFFF);
                            var5++;
                            var5++;
                            var6.method2416(22064, var16[var18++] & 0xFFFF);
                            var5++;
                            var6.method2416(22064, var16[var18++] & 0xFFFF);
                        }
                    }
                }
            }
        } else {
            for (int var7 = 0; var7 < arg0; var7++) {
                int var8 = arg1[var7];
                short[] var9 = this.field2497.field589[var8];
                int var10 = this.field2490[var8];
                if (var10 != 0 && var9 != null) {
                    int var11 = 0;
                    int var12 = 0;
                    while (var9.length > var12) {
                        if ((var10 & 0x1 << var11++) == 0) {
                            var12 += 3;
                        } else {
                            var6.method2426(-1882601528, var9[var12++] & 0xFFFF);
                            var5++;
                            var6.method2426(-1882601528, var9[var12++] & 0xFFFF);
                            var5++;
                            var5++;
                            var6.method2426(-1882601528, var9[var12++] & 0xFFFF);
                        }
                    }
                }
            }
        }
        if (var5 <= 0) {
            return;
        }
        opengl var19 = this.field2493.field4607;
        this.field2493.method2111(this.field2491, (this.field2497.field584 & 0x7) != 0, (this.field2497.field584 & 0x8) != 0);
        if (this.field2493.field4661) {
            this.field2493.method1766(Integer.MAX_VALUE, this.field2494, this.field2495);
        }
        this.field2498.method743(5123, var6.field5258, var6.field5273);
        var19.glMatrixMode(5890);
        var19.glPushMatrix();
        var19.glScalef(1.0F / this.field2492, 1.0F / this.field2492, 1.0F);
        var19.glMatrixMode(5888);
        this.field2493.method2158(this.field2497.field605, this.field2497.field596, this.field2499, this.field2497.field597);
        this.field2493.method2160(this.field2498, 4, 0, var5);
        var19.glMatrixMode(5890);
        var19.glPopMatrix();
        var19.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(II)V")
    public final void method1184(int arg0, int arg1) {
        this.field2496 = ByteBuffer.allocateDirect(arg1 * 4);
        if (arg0 != -729) {
            this.field2493 = (class338) null;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IB)V")
    public final void method1185(int arg0, byte arg1) {
        this.field2496.position(arg0 * 4);
        this.field2496.flip();
        class226 var3 = this.field2493.method2114(0, this.field2496, false);
        this.field2499 = new class212(this.field2493, var3, 5121, 4, 0);
        this.field2496 = null;
        if (arg1 != -66) {
            this.field2490 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(II)V")
    public final void method1186(int arg0, int arg1) {
        this.field2496.position(arg0 * 4 + 3);
        if (arg1 <= -52) {
            this.field2496.put((byte) -1);
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIII)V")
    public final void method1187(int arg0, int arg1, int arg2, int arg3) {
        this.field2490[this.field2497.field2207 * arg0 + arg2] = class311.method1970(this.field2490[this.field2497.field2207 * arg0 + arg2], arg1 << arg3);
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IZIFI)V")
    public final void method1188(int arg0, boolean arg1, int arg2, float arg3, int arg4) {
        if (this.field2491 != -1) {
            class164 var6 = this.field2493.field4611.method607(false, this.field2491);
            int var7 = var6.field2312 & 0xFF;
            if (var7 != 0 && var6.field2299 != 4) {
                int var8;
                if (arg4 < 0) {
                    var8 = 0;
                } else if (arg4 > 127) {
                    var8 = 16777215;
                } else {
                    var8 = arg4 * 131586;
                }
                if (var7 == 256) {
                    arg2 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg2 = ((arg2 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) + ((arg2 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field2313 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg2 >> 16 & 0xFF) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = (arg2 >> 8 & 0xFF) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg2 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg2 = (var13 & 0xFF00) + (var14 >> 8) + (var12 << 8 & 0xFF009F);
            }
        }
        if (arg3 != 1.0F) {
            int var15 = arg2 >> 16 & 0xFF;
            int var16 = (arg2 & 0xFF85) >> 8;
            int var17 = (int) ((float) var15 * arg3);
            int var18 = arg2 & 0xFF;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            int var19 = (int) ((float) var16 * arg3);
            int var20 = (int) ((float) var18 * arg3);
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
            arg2 = var19 << 8 | var17 << 16 | var20;
        }
        this.field2496.position(arg0 * 4);
        if (arg1) {
            this.field2496.put((byte) (arg2 >> 16));
            this.field2496.put((byte) (arg2 >> 8));
            this.field2496.put((byte) arg2);
        }
    }

    @OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(Ldl;IIII)V")
    public class178(class39 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2497 = arg0;
        this.field2495 = arg4;
        this.field2491 = arg1;
        this.field2492 = (float) arg2;
        this.field2493 = this.field2497.field575;
        this.field2494 = arg3;
        this.field2490 = new int[this.field2497.field2215 * this.field2497.field2207];
        this.field2498 = new class251(this.field2493, 5123, (byte[]) null, 1);
    }
}
