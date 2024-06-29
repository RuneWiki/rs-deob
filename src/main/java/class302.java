import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class302 extends class449 {

    @OriginalMember(owner = "client!ul", name = "A", descriptor = "Lka;")
    private class140 field4276;

    @OriginalMember(owner = "client!ul", name = "v", descriptor = "I")
    public int field4271;

    @OriginalMember(owner = "client!ul", name = "z", descriptor = "Lfu;")
    private class42 field4275;

    @OriginalMember(owner = "client!ul", name = "s", descriptor = "[I")
    private int[] field4268;

    @OriginalMember(owner = "client!ul", name = "r", descriptor = "I")
    public int field4267;

    @OriginalMember(owner = "client!ul", name = "u", descriptor = "F")
    public float field4270;

    @OriginalMember(owner = "client!ul", name = "w", descriptor = "I")
    public int field4272;

    @OriginalMember(owner = "client!ul", name = "x", descriptor = "I")
    public int field4273;

    @OriginalMember(owner = "client!ul", name = "y", descriptor = "Lbr;")
    private class351 field4274;

    @OriginalMember(owner = "client!ul", name = "q", descriptor = "Lfm;")
    private class170 field4266;

    @OriginalMember(owner = "client!ul", name = "t", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4269;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BI)V", line = 9)
    public final void method1939(byte arg0, int arg1) {
        if (arg0 != -77) {
            this.field4273 = 112;
        }
        this.field4269.position(arg1 * 4 + 3);
        this.field4269.put((byte) -1);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IZ[I)V", line = 24)
    public final void method1940(int arg0, boolean arg1, int[] arg2) {
        if (arg1) {
            this.method1941(26, (byte) -92, -40, -78);
        }
        int var4 = 0;
        class161 var5 = class140.field1940;
        var5.field2298 = 0;
        if (this.field4275.field622) {
            for (int var6 = 0; var6 < arg0; var6++) {
                int var7 = arg2[var6];
                int var8 = this.field4268[var7];
                short[] var9 = this.field4276.field1948[var7];
                if (var8 != 0 && var9 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var9.length > var11) {
                        if ((var8 & 0x1 << var10++) == 0) {
                            var11 += 3;
                        } else {
                            var4++;
                            var5.method1173(var9[var11++] & 0xFFFF, (byte) 117);
                            var5.method1173(var9[var11++] & 0xFFFF, (byte) 118);
                            var4++;
                            var5.method1173(var9[var11++] & 0xFFFF, (byte) 118);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var12 = 0; var12 < arg0; var12++) {
                int var13 = arg2[var12];
                short[] var14 = this.field4276.field1948[var13];
                int var15 = this.field4268[var13];
                if (var15 != 0 && var14 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var17 < var14.length) {
                        if ((var15 & 0x1 << var16++) == 0) {
                            var17 += 3;
                        } else {
                            var4++;
                            var5.method1196(var14[var17++] & 0xFFFF, (byte) -115);
                            var4++;
                            var5.method1196(var14[var17++] & 0xFFFF, (byte) -55);
                            var5.method1196(var14[var17++] & 0xFFFF, (byte) -59);
                            var4++;
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        opengl var18 = this.field4275.field557;
        this.field4274.method1034(5123, var5.field2262, var5.field2298);
        this.field4275.method406(this.field4276.field1967, this.field4276.field1954, this.field4266, this.field4276.field1961);
        this.field4275.method440(this.field4271, (this.field4276.field1931 & 0x7) != 0, (this.field4276.field1931 & 0x8) != 0);
        if (this.field4275.field604) {
            this.field4275.method423(Integer.MAX_VALUE, this.field4267, this.field4272, this.field4273);
        }
        var18.glMatrixMode(5890);
        var18.glPushMatrix();
        var18.glScalef(1.0F / this.field4270, 1.0F / this.field4270, 1.0F);
        var18.glMatrixMode(5888);
        this.field4275.method406(this.field4276.field1967, this.field4276.field1954, this.field4266, this.field4276.field1961);
        this.field4275.method312(this.field4274, 4, 0, var4);
        var18.glMatrixMode(5890);
        var18.glPopMatrix();
        var18.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IBII)V", line = 148)
    public final void method1941(int arg0, byte arg1, int arg2, int arg3) {
        this.field4268[this.field4276.field3518 * arg0 + arg3] = class142.method1024(this.field4268[this.field4276.field3518 * arg0 + arg3], 0x1 << arg2);
        if (arg1 >= -43) {
            this.method1939((byte) -56, 48);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIFIB)V", line = 159)
    public final void method1942(int arg0, int arg1, float arg2, int arg3, byte arg4) {
        if (this.field4271 != -1) {
            class308 var6 = this.field4275.field1250.method1224((byte) 110, this.field4271);
            int var7 = var6.field4369 & 0xFF;
            if (var7 != 0 && var6.field4368 != 4) {
                int var8;
                if (arg0 < 0) {
                    var8 = 0;
                } else if (arg0 > 127) {
                    var8 = 16777215;
                } else {
                    var8 = arg0 * 131586;
                }
                if (var7 == 256) {
                    arg1 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg1 = ((var8 & 0xFF00FF) * var7 + ((arg1 & 0xFF00FF) * var10) & 0xFF00FF00) + ((arg1 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field4364 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg1 >> 16 & 0xFF) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = (arg1 >> 8 & 0xFF) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg1 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg1 = (var13 & 0xFF00) + ((var12 & 0xFF00 << 8) + (var14 >> 8));
            }
        }
        if (arg2 != 1.0F) {
            int var15 = arg1 >> 16 & 0xFF;
            int var16 = arg1 >> 8 & 0xFF;
            int var17 = (int) ((float) var15 * arg2);
            int var18 = arg1 & 0xFF;
            int var19 = (int) ((float) var16 * arg2);
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            int var20 = (int) ((float) var18 * arg2);
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
            arg1 = var20 | var17 << 16 | var19 << 8;
        }
        if (arg4 > -42) {
            this.field4276 = (class140) null;
        }
        this.field4269.position(arg3 * 4);
        this.field4269.put((byte) (arg1 >> 16));
        this.field4269.put((byte) (arg1 >> 8));
        this.field4269.put((byte) arg1);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IB)V", line = 275)
    public final void method1943(int arg0, byte arg1) {
        this.field4269 = ByteBuffer.allocateDirect(arg0 * 4);
        if (arg1 <= 30) {
            this.method1939((byte) -90, -52);
        }
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lka;IIIII)V", line = 283)
    public class302(class140 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4276 = arg0;
        this.field4271 = arg1;
        this.field4275 = this.field4276.field1933;
        this.field4268 = new int[this.field4276.field3518 * this.field4276.field3517];
        this.field4267 = arg3;
        this.field4270 = (float) arg2;
        this.field4272 = arg4;
        this.field4273 = arg5;
        this.field4274 = new class351(this.field4275, 5123, (byte[]) null, 1);
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(IB)V", line = 300)
    public final void method1944(int arg0, byte arg1) {
        if (arg1 != 0) {
            return;
        }
        this.field4269.position(arg0 * 4);
        this.field4269.flip();
        class171 var3 = this.field4275.method434(0, this.field4269, false);
        this.field4266 = new class170(this.field4275, var3, 5121, 4, 0);
        this.field4269 = null;
    }
}
