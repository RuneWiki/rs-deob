import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class117 extends class338 {

    @OriginalMember(owner = "client!oi", name = "q", descriptor = "Lge;")
    private class103 field1461;

    @OriginalMember(owner = "client!oi", name = "t", descriptor = "I")
    private int field1464;

    @OriginalMember(owner = "client!oi", name = "s", descriptor = "Lql;")
    private class346 field1463;

    @OriginalMember(owner = "client!oi", name = "p", descriptor = "I")
    private int field1460;

    @OriginalMember(owner = "client!oi", name = "r", descriptor = "I")
    private int field1462;

    @OriginalMember(owner = "client!oi", name = "n", descriptor = "[I")
    private int[] field1458;

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "F")
    private float field1457;

    @OriginalMember(owner = "client!oi", name = "u", descriptor = "Lbb;")
    private class135 field1465;

    @OriginalMember(owner = "client!oi", name = "o", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1459;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIFI)V", line = 5)
    public final void method633(int arg0, int arg1, int arg2, float arg3, int arg4) {
        if (arg1 != -29677) {
            return;
        }
        if (this.field1460 != -1) {
            class75 var6 = this.field1463.field4699.method1660(this.field1460, (byte) -104);
            int var7 = var6.field841 & 0xFF;
            if (var7 != 0 && var6.field824 != 4) {
                int var8;
                if (arg2 < 0) {
                    var8 = 0;
                } else if (arg2 > 127) {
                    var8 = 16777215;
                } else {
                    var8 = arg2 * 131586;
                }
                if (var7 == 256) {
                    arg0 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg0 = ((arg0 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) + ((arg0 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field836 & 0xFF;
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
                arg0 = (var14 >> 8) + ((var12 & 0xD700FF00) << 8) + (var13 & 0xFF00);
            }
        }
        this.field1459.position(arg4 * 4);
        if (arg3 != 1.0F) {
            int var15 = (arg0 & 0xFF0811) >> 16;
            int var16 = arg0 >> 8 & 0xFF;
            int var17 = arg0 & 0xFF;
            int var18 = (int) ((float) var15 * arg3);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            int var19 = (int) ((float) var16 * arg3);
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
            arg0 = var20 | var19 << 8 | var18 << 16;
        }
        this.field1459.put((byte) (arg0 >> 16));
        this.field1459.put((byte) (arg0 >> 8));
        this.field1459.put((byte) arg0);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)V", line = 113)
    public final void method634(int arg0, int arg1) {
        this.field1459 = ByteBuffer.allocateDirect(arg0 * arg1);
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(II)V", line = 120)
    public final void method635(int arg0, int arg1) {
        this.field1459.position(arg1 * 4);
        int var3 = -69 % ((2 - arg0) / 52);
        this.field1459.flip();
        class49 var4 = this.field1463.method2036(0, this.field1459, false);
        this.field1465 = new class135(this.field1463, var4, 5121, 4, 0);
        this.field1459 = null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIII)V", line = 135)
    public final void method636(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 0) {
            this.field1460 = -115;
        }
        this.field1458[this.field1461.field556 * arg3 + arg2] = class392.method2441(this.field1458[this.field1461.field556 * arg3 + arg2], 0x1 << arg1);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "([III)V", line = 146)
    public final void method637(int[] arg0, int arg1, int arg2) {
        if (arg1 != 255) {
            return;
        }
        class103.field1246.field3389 = 0;
        int var4 = 0;
        if (this.field1463.field4736) {
            for (int var5 = 0; var5 < arg2; var5++) {
                int var6 = arg0[var5];
                int var7 = this.field1458[var6];
                short[] var8 = this.field1461.field1243[var6];
                if (var7 != 0 && var8 != null) {
                    int var9 = 0;
                    int var10 = 0;
                    while (var10 < var8.length) {
                        if ((0x1 << var9++ & var7) == 0) {
                            var10 += 3;
                        } else {
                            var4++;
                            class103.field1246.method1346(126, var8[var10++]);
                            var4++;
                            class103.field1246.method1346(arg1 ^ 0x89, var8[var10++]);
                            var4++;
                            class103.field1246.method1346(127, var8[var10++]);
                        }
                    }
                }
            }
        } else {
            for (int var11 = 0; var11 < arg2; var11++) {
                int var12 = arg0[var11];
                int var13 = this.field1458[var12];
                short[] var14 = this.field1461.field1243[var12];
                if (var13 != 0 && var14 != null) {
                    int var15 = 0;
                    int var16 = 0;
                    while (var16 < var14.length) {
                        if ((var13 & 0x1 << var15++) == 0) {
                            var16 += 3;
                        } else {
                            class103.field1246.method1370((byte) -36, var14[var16++]);
                            var4++;
                            class103.field1246.method1370((byte) -36, var14[var16++]);
                            var4++;
                            var4++;
                            class103.field1246.method1370((byte) -36, var14[var16++]);
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        opengl var17 = this.field1463.field4697;
        this.field1463.method2085(this.field1460, (this.field1461.field1250 & 0x7) != 0, (this.field1461.field1250 & 0x8) != 0);
        if (this.field1463.field4735) {
            this.field1463.method1630(Integer.MAX_VALUE, this.field1464, this.field1462);
        }
        this.field1463.field4761.method791(5123, class103.field1246.field3406, class103.field1246.field3389);
        var17.glMatrixMode(5890);
        var17.glPushMatrix();
        var17.glScalef(1.0F / this.field1457, 1.0F / this.field1457, 1.0F);
        var17.glMatrixMode(5888);
        this.field1463.method2082(this.field1465);
        this.field1463.method2037(this.field1461.field1258);
        this.field1463.method2105(0, this.field1461.field1269);
        if ((this.field1461.field1250 & 0x7) == 0) {
            this.field1463.method2094(false);
        } else {
            this.field1463.method2070(this.field1461.field1265);
            this.field1463.method2094(true);
        }
        if (this.field1461.field1270 != null) {
            this.field1463.method2105(1, this.field1461.field1270);
        }
        this.field1463.method2088();
        this.field1463.method2041(this.field1463.field4761, 4, 0, var4);
        var17.glMatrixMode(5890);
        var17.glPopMatrix();
        var17.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(BI)V", line = 281)
    public final void method638(byte arg0, int arg1) {
        if (arg0 == -103) {
            this.field1459.position(arg1 * 4 + 3);
            this.field1459.put((byte) -1);
        }
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lge;IIII)V", line = 296)
    public class117(class103 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1461 = arg0;
        this.field1464 = arg3;
        this.field1463 = this.field1461.field1240;
        this.field1460 = arg1;
        this.field1462 = arg4;
        this.field1458 = new int[this.field1461.field556 * this.field1461.field550];
        this.field1457 = (float) arg2;
    }
}
