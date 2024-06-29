import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class168 extends class161 {

    @OriginalMember(owner = "client!vn", name = "r", descriptor = "Lkg;")
    private class147 field2664;

    @OriginalMember(owner = "client!vn", name = "l", descriptor = "[I")
    private int[] field2658;

    @OriginalMember(owner = "client!vn", name = "m", descriptor = "I")
    private int field2659;

    @OriginalMember(owner = "client!vn", name = "o", descriptor = "I")
    private int field2661;

    @OriginalMember(owner = "client!vn", name = "n", descriptor = "Lsq;")
    private class96 field2660;

    @OriginalMember(owner = "client!vn", name = "u", descriptor = "F")
    private float field2667;

    @OriginalMember(owner = "client!vn", name = "t", descriptor = "I")
    private int field2666;

    @OriginalMember(owner = "client!vn", name = "p", descriptor = "Lso;")
    private class274 field2662;

    @OriginalMember(owner = "client!vn", name = "q", descriptor = "Lqd;")
    private class259 field2663;

    @OriginalMember(owner = "client!vn", name = "s", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2665;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(BI)V", line = 5)
    public final void method1173(byte arg0, int arg1) {
        this.field2665.position(arg1 * 4 + 3);
        this.field2665.put((byte) -1);
        if (arg0 != 89) {
            this.field2662 = (class274) null;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "([IIZ)V", line = 21)
    public final void method1174(int[] arg0, int arg1, boolean arg2) {
        int var4 = 0;
        class186 var5 = class147.field2302;
        var5.field3044 = 0;
        if (arg2) {
            return;
        }
        if (this.field2660.field1280) {
            for (int var6 = 0; var6 < arg1; var6++) {
                int var7 = arg0[var6];
                short[] var8 = this.field2664.field2292[var7];
                int var9 = this.field2658[var7];
                if (var9 != 0 && var8 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var11 < var8.length) {
                        if ((0x1 << var10++ & var9) == 0) {
                            var11 += 3;
                        } else {
                            var5.method1283(8, var8[var11++] & 0xFFFF);
                            var4++;
                            var4++;
                            var5.method1283(8, var8[var11++] & 0xFFFF);
                            var4++;
                            var5.method1283(8, var8[var11++] & 0xFFFF);
                        }
                    }
                }
            }
        } else {
            for (int var12 = 0; var12 < arg1; var12++) {
                int var13 = arg0[var12];
                int var14 = this.field2658[var13];
                short[] var15 = this.field2664.field2292[var13];
                if (var14 != 0 && var15 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var17 < var15.length) {
                        if ((0x1 << var16++ & var14) == 0) {
                            var17 += 3;
                        } else {
                            var5.method1319(-128, var15[var17++] & 0xFFFF);
                            var4++;
                            var4++;
                            var5.method1319(-51, var15[var17++] & 0xFFFF);
                            var5.method1319(-123, var15[var17++] & 0xFFFF);
                            var4++;
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        opengl var18 = this.field2660.field1156;
        this.field2660.method587(this.field2661, (this.field2664.field2293 & 0x7) != 0, (this.field2664.field2293 & 0x8) != 0);
        if (this.field2660.field1286) {
            this.field2660.method659(Integer.MAX_VALUE, this.field2659, this.field2666);
        }
        this.field2662.method1696(5123, var5.field3066, var5.field3044);
        var18.glMatrixMode(5890);
        var18.glPushMatrix();
        var18.glScalef(1.0F / this.field2667, 1.0F / this.field2667, 1.0F);
        var18.glMatrixMode(5888);
        this.field2660.method607(this.field2664.field2315, this.field2664.field2320, this.field2663, this.field2664.field2316);
        this.field2660.method646(this.field2662, 4, 0, var4);
        var18.glMatrixMode(5890);
        var18.glPopMatrix();
        var18.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IB)V", line = 142)
    public final void method1175(int arg0, byte arg1) {
        int var3 = -69 / ((arg1 + 14) / 49);
        this.field2665 = ByteBuffer.allocateDirect(arg0 * 4);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)V", line = 151)
    public final void method1176(int arg0, int arg1) {
        this.field2665.position(arg0 * 4);
        this.field2665.flip();
        class371 var3 = this.field2660.method564(0, this.field2665, false);
        this.field2663 = new class259(this.field2660, var3, 5121, arg1, 0);
        this.field2665 = null;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IFIBI)V", line = 163)
    public final void method1177(int arg0, float arg1, int arg2, byte arg3, int arg4) {
        if (this.field2661 != -1) {
            class266 var6 = this.field2660.field1161.method989(this.field2661, (byte) 64);
            int var7 = var6.field4285 & 0xFF;
            if (var7 != 0 && var6.field4279 != 4) {
                int var8;
                if (arg4 < 0) {
                    var8 = 0;
                } else if (arg4 > 127) {
                    var8 = 16777215;
                } else {
                    var8 = arg4 * 131586;
                }
                if (var7 == 256) {
                    arg0 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg0 = ((arg0 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) + ((arg0 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field4281 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = ((arg0 & 0xFF0000) >> 16) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = ((arg0 & 0xFF00) >> 8) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg0 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg0 = (var12 << 8 & 0xFF00A2) + (var13 & 0xFF00) + (var14 >> 8);
            }
        }
        if (arg1 != 1.0F) {
            int var15 = (arg0 & 0xFF0E54) >> 16;
            int var16 = arg0 >> 8 & 0xFF;
            int var17 = arg0 & 0xFF;
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
            arg0 = var19 << 8 | var18 << 16 | var20;
        }
        if (arg3 == 105) {
            this.field2665.position(arg2 * 4);
            this.field2665.put((byte) (arg0 >> 16));
            this.field2665.put((byte) (arg0 >> 8));
            this.field2665.put((byte) arg0);
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIZ)V", line = 277)
    public final void method1178(int arg0, int arg1, int arg2, boolean arg3) {
        if (!arg3) {
            this.field2666 = -31;
        }
        this.field2658[this.field2664.field2036 * arg1 + arg0] = class35.method227(this.field2658[this.field2664.field2036 * arg1 + arg0], 0x1 << arg2);
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Lkg;IIII)V", line = 287)
    public class168(class147 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2664 = arg0;
        this.field2658 = new int[this.field2664.field2040 * this.field2664.field2036];
        this.field2659 = arg3;
        this.field2661 = arg1;
        this.field2660 = this.field2664.field2307;
        this.field2667 = (float) arg2;
        this.field2666 = arg4;
        this.field2662 = new class274(this.field2660, 5123, (byte[]) null, 1);
    }
}
