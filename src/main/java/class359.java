import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class359 extends class393 {

    @OriginalMember(owner = "client!re", name = "q", descriptor = "Lms;")
    private class448 field5256;

    @OriginalMember(owner = "client!re", name = "r", descriptor = "I")
    private int field5257;

    @OriginalMember(owner = "client!re", name = "u", descriptor = "Lih;")
    private class330 field5260;

    @OriginalMember(owner = "client!re", name = "t", descriptor = "F")
    private float field5259;

    @OriginalMember(owner = "client!re", name = "s", descriptor = "I")
    private int field5258;

    @OriginalMember(owner = "client!re", name = "p", descriptor = "[I")
    private int[] field5255;

    @OriginalMember(owner = "client!re", name = "o", descriptor = "I")
    private int field5254;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "Lam;")
    private class287 field5252;

    @OriginalMember(owner = "client!re", name = "n", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field5253;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(II)V", line = 5)
    public final void method2356(int arg0, int arg1) {
        this.field5253.position(arg1 * 4 + 3);
        if (arg0 < -71) {
            this.field5253.put((byte) -1);
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(IIII)V", line = 16)
    public final void method2357(int arg0, int arg1, int arg2, int arg3) {
        this.field5255[this.field5256.field4978 * arg3 + arg2] = class128.method871(this.field5255[this.field5256.field4978 * arg3 + arg2], arg0 << arg1);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "([III)V", line = 26)
    public final void method2358(int[] arg0, int arg1, int arg2) {
        if (arg2 != 21873) {
            this.method2356(17, 88);
        }
        class448.field6524.field3915 = 0;
        int var4 = 0;
        if (this.field5260.field4797) {
            for (int var5 = 0; var5 < arg1; var5++) {
                int var6 = arg0[var5];
                int var7 = this.field5255[var6];
                short[] var8 = this.field5256.field6542[var6];
                if (var7 != 0 && var8 != null) {
                    int var9 = 0;
                    int var10 = 0;
                    while (var8.length > var10) {
                        if ((0x1 << var9++ & var7) == 0) {
                            var10 += 3;
                        } else {
                            var4++;
                            class448.field6524.method1693(var8[var10++], (byte) 60);
                            class448.field6524.method1693(var8[var10++], (byte) 98);
                            var4++;
                            class448.field6524.method1693(var8[var10++], (byte) 38);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var11 = 0; var11 < arg1; var11++) {
                int var12 = arg0[var11];
                short[] var13 = this.field5256.field6542[var12];
                int var14 = this.field5255[var12];
                if (var14 != 0 && var13 != null) {
                    int var15 = 0;
                    int var16 = 0;
                    while (var13.length > var16) {
                        if ((var14 & 0x1 << var15++) == 0) {
                            var16 += 3;
                        } else {
                            class448.field6524.method1715(677910600, var13[var16++]);
                            var4++;
                            class448.field6524.method1715(677910600, var13[var16++]);
                            var4++;
                            var4++;
                            class448.field6524.method1715(677910600, var13[var16++]);
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        opengl var17 = this.field5260.field4741;
        this.field5260.method2175(this.field5254, (this.field5256.field6523 & 0x7) != 0, (this.field5256.field6523 & 0x8) != 0);
        if (this.field5260.field4799) {
            this.field5260.method2041(Integer.MAX_VALUE, this.field5258, this.field5257);
        }
        this.field5260.field4867.method1354(5123, class448.field6524.field3879, class448.field6524.field3915);
        var17.glMatrixMode(5890);
        var17.glPushMatrix();
        var17.glScalef(1.0F / this.field5259, 1.0F / this.field5259, 1.0F);
        var17.glMatrixMode(5888);
        this.field5260.method2087(this.field5256.field6554, this.field5256.field6548, this.field5252, this.field5256.field6545);
        this.field5260.method2100(this.field5260.field4867, 4, 0, var4);
        var17.glMatrixMode(5890);
        var17.glPopMatrix();
        var17.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(II)V", line = 147)
    public final void method2359(int arg0, int arg1) {
        if (arg1 != 65535) {
            this.field5258 = -87;
        }
        this.field5253 = ByteBuffer.allocateDirect(arg0 * 4);
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(II)V", line = 159)
    public final void method2360(int arg0, int arg1) {
        this.field5253.position(arg0 * 4);
        this.field5253.flip();
        if (arg1 > 107) {
            class182 var3 = this.field5260.method2043(0, this.field5253, false);
            this.field5252 = new class287(this.field5260, var3, 5121, 4, 0);
            this.field5253 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIF)V", line = 174)
    public final void method2361(int arg0, int arg1, int arg2, int arg3, float arg4) {
        if (this.field5254 != -1) {
            class175 var6 = this.field5260.field4740.method1760(-19907, this.field5254);
            int var7 = var6.field2287 & 0xFF;
            if (var7 != 0 && var6.field2293 != 4) {
                int var8;
                if (arg0 < 0) {
                    var8 = 0;
                } else if (arg0 > 127) {
                    var8 = 16777215;
                } else {
                    var8 = arg0 * 131586;
                }
                if (var7 == 256) {
                    arg3 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg3 = ((arg3 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) + ((arg3 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field2294 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = ((arg3 & 0xFF0000) >> 16) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = (arg3 >> 8 & 0xFF) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg3 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg3 = (var14 >> 8) + ((var12 & 0xB000FF00) << 8) + (var13 & 0xFF00);
            }
        }
        if (arg4 != 1.0F) {
            int var15 = arg3 >> 16 & 0xFF;
            int var16 = arg3 >> 8 & 0xFF;
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
        this.field5253.position(arg2 * 4);
        this.field5253.put((byte) (arg3 >> 16));
        int var21 = 6 / ((arg1 - 26) / 42);
        this.field5253.put((byte) (arg3 >> 8));
        this.field5253.put((byte) arg3);
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lms;IIII)V", line = 284)
    public class359(class448 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5256 = arg0;
        this.field5257 = arg4;
        this.field5260 = this.field5256.field6521;
        this.field5259 = (float) arg2;
        this.field5258 = arg3;
        this.field5255 = new int[this.field5256.field4978 * this.field5256.field4970];
        this.field5254 = arg1;
    }
}
