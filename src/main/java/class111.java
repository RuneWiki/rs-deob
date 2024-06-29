import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class111 extends class180 {

    @OriginalMember(owner = "client!tt", name = "q", descriptor = "Lch;")
    private class223 field1563;

    @OriginalMember(owner = "client!tt", name = "u", descriptor = "I")
    public int field1567;

    @OriginalMember(owner = "client!tt", name = "p", descriptor = "F")
    public float field1562;

    @OriginalMember(owner = "client!tt", name = "w", descriptor = "I")
    public int field1569;

    @OriginalMember(owner = "client!tt", name = "s", descriptor = "[I")
    private int[] field1565;

    @OriginalMember(owner = "client!tt", name = "x", descriptor = "Lqi;")
    private class458 field1570;

    @OriginalMember(owner = "client!tt", name = "o", descriptor = "I")
    public int field1561;

    @OriginalMember(owner = "client!tt", name = "r", descriptor = "I")
    public int field1564;

    @OriginalMember(owner = "client!tt", name = "v", descriptor = "Lkb;")
    private class57 field1568;

    @OriginalMember(owner = "client!tt", name = "t", descriptor = "Luk;")
    private class143 field1566;

    @OriginalMember(owner = "client!tt", name = "y", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1571;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIIIF)V")
    public final void method689(int arg0, int arg1, int arg2, int arg3, float arg4) {
        if (this.field1564 != -1) {
            class192 var6 = this.field1570.field6863.method1218(this.field1564, false);
            int var7 = var6.field2733 & 0xFF;
            if (var7 != 0 && var6.field2729 != 4) {
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
                    arg0 = ((arg0 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) + ((arg0 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field2742 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg0 >> 16 & 0xFF) * var11;
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
                arg0 = (var14 >> 8) + (var12 << 8 & 0xFF008A) + (var13 & 0xFF00);
            }
        }
        if (arg4 != 1.0F) {
            int var15 = (arg0 & 0xFF7D5B) >> 16;
            int var16 = arg0 >> 8 & 0xFF;
            int var17 = (int) ((float) var15 * arg4);
            int var18 = arg0 & 0xFF;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            int var19 = (int) ((float) var16 * arg4);
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
            arg0 = var20 | var17 << 16 | var19 << 8;
        }
        this.field1571.position(arg3 * 4);
        this.field1571.put((byte) (arg0 >> 16));
        if (arg1 < 20) {
            this.method691(false, -70);
        }
        this.field1571.put((byte) (arg0 >> 8));
        this.field1571.put((byte) arg0);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIII)V")
    public final void method690(int arg0, int arg1, int arg2, int arg3) {
        this.field1565[this.field1563.field3729 * arg2 + arg3] = class366.method2215(this.field1565[this.field1563.field3729 * arg2 + arg3], 0x1 << arg0);
        if (arg1 < 68) {
            this.field1566 = (class143) null;
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZI)V")
    public final void method691(boolean arg0, int arg1) {
        this.field1571.position(arg1 * 4);
        if (!arg0) {
            this.method693(1, -18);
        }
        this.field1571.flip();
        class220 var3 = this.field1570.method2679(0, this.field1571, false);
        this.field1566 = new class143(this.field1570, var3, 5121, 4, 0);
        this.field1571 = null;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(I[IB)V")
    public final void method692(int arg0, int[] arg1, byte arg2) {
        int var4 = 0;
        class425 var5 = class223.field3137;
        var5.field5830 = 0;
        if (this.field1570.field6400) {
            for (int var6 = 0; var6 < arg0; var6++) {
                int var7 = arg1[var6];
                short[] var8 = this.field1563.field3141[var7];
                int var9 = this.field1565[var7];
                if (var9 != 0 && var8 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var8.length > var11) {
                        if ((var9 & 0x1 << var10++) == 0) {
                            var11 += 3;
                        } else {
                            var5.method2462(var8[var11++] & 0xFFFF, (byte) -123);
                            var4++;
                            var4++;
                            var5.method2462(var8[var11++] & 0xFFFF, (byte) -123);
                            var5.method2462(var8[var11++] & 0xFFFF, (byte) -123);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var12 = 0; var12 < arg0; var12++) {
                int var13 = arg1[var12];
                short[] var14 = this.field1563.field3141[var13];
                int var15 = this.field1565[var13];
                if (var15 != 0 && var14 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var17 < var14.length) {
                        if ((var15 & 0x1 << var16++) == 0) {
                            var17 += 3;
                        } else {
                            var5.method2506(var14[var17++] & 0xFFFF, (byte) 60);
                            var4++;
                            var4++;
                            var5.method2506(var14[var17++] & 0xFFFF, (byte) 121);
                            var5.method2506(var14[var17++] & 0xFFFF, (byte) 99);
                            var4++;
                        }
                    }
                }
            }
        }
        if (var4 > 0) {
            opengl var18 = this.field1570.field6330;
            this.field1568.method233(5123, var5.field5886, var5.field5830);
            this.field1570.method2658(this.field1563.field3172, this.field1563.field3166, this.field1566, this.field1563.field3168);
            this.field1570.method2684(this.field1564, (this.field1563.field3155 & 0x7) != 0, (this.field1563.field3155 & 0x8) != 0);
            if (this.field1570.field6380) {
                this.field1570.method1075(Integer.MAX_VALUE, this.field1569, this.field1567, this.field1561);
            }
            var18.glMatrixMode(5890);
            var18.glPushMatrix();
            var18.glScalef(1.0F / this.field1562, 1.0F / this.field1562, 1.0F);
            var18.glMatrixMode(5888);
            this.field1570.method2658(this.field1563.field3172, this.field1563.field3166, this.field1566, this.field1563.field3168);
            this.field1570.method2673(this.field1568, 4, 0, var4);
            var18.glMatrixMode(5890);
            var18.glPopMatrix();
            var18.glMatrixMode(5888);
        }
        if (arg2 != -87) {
            this.method694(72, -91);
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(II)V")
    public final void method693(int arg0, int arg1) {
        this.field1571 = ByteBuffer.allocateDirect(arg0 * 4);
        if (arg1 != -25645) {
            this.field1563 = (class223) null;
        }
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(II)V")
    public final void method694(int arg0, int arg1) {
        this.field1571.position(arg0 * arg1 + 3);
        this.field1571.put((byte) -1);
    }

    @OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(Lch;IIIII)V")
    public class111(class223 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1563 = arg0;
        this.field1567 = arg4;
        this.field1562 = (float) arg2;
        this.field1569 = arg3;
        this.field1565 = new int[this.field1563.field3729 * this.field1563.field3728];
        this.field1570 = this.field1563.field3158;
        this.field1561 = arg5;
        this.field1564 = arg1;
        this.field1568 = new class57(this.field1570, 5123, (byte[]) null, 1);
    }
}
