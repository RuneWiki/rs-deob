import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class3 extends class35 {

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "Lwh;")
    private class312 field22;

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "Lge;")
    private class104 field24;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
    private int field17;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "I")
    private int field20;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "I")
    private int field16;

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "F")
    private float field23;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "[I")
    private int[] field19;

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "Ljm;")
    private class160 field21;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field18;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IB)V")
    public final void method10(int arg0, byte arg1) {
        int var3 = 58 % ((19 - arg1) / 46);
        this.field18.position(arg0 * 4 + 3);
        this.field18.put((byte) -1);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I[IB)V")
    public final void method11(int arg0, int[] arg1, byte arg2) {
        class312.field4540.field565 = 0;
        int var4 = 0;
        if (this.field24.field1727) {
            for (int var11 = 0; var11 < arg0; var11++) {
                int var12 = arg1[var11];
                int var13 = this.field19[var12];
                short[] var14 = this.field22.field4557[var12];
                if (var13 != 0 && var14 != null) {
                    int var15 = 0;
                    int var16 = 0;
                    while (var14.length > var16) {
                        if ((0x1 << var15++ & var13) == 0) {
                            var16 += 3;
                        } else {
                            var4++;
                            class312.field4540.method324(var14[var16++], -79);
                            var4++;
                            class312.field4540.method324(var14[var16++], -32);
                            class312.field4540.method324(var14[var16++], -28);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var5 = 0; var5 < arg0; var5++) {
                int var6 = arg1[var5];
                int var7 = this.field19[var6];
                short[] var8 = this.field22.field4557[var6];
                if (var7 != 0 && var8 != null) {
                    int var9 = 0;
                    int var10 = 0;
                    while (var10 < var8.length) {
                        if ((0x1 << var9++ & var7) == 0) {
                            var10 += 3;
                        } else {
                            var4++;
                            class312.field4540.method301((byte) 30, var8[var10++]);
                            var4++;
                            class312.field4540.method301((byte) 124, var8[var10++]);
                            class312.field4540.method301((byte) 122, var8[var10++]);
                            var4++;
                        }
                    }
                }
            }
        }
        int var17 = -24 / ((70 - arg2) / 42);
        if (var4 <= 0) {
            return;
        }
        opengl var18 = this.field24.field1604;
        this.field24.method924(this.field20, (this.field22.field4548 & 0x7) != 0, (this.field22.field4548 & 0x8) != 0);
        if (this.field24.field1657) {
            this.field24.method717(Integer.MAX_VALUE, this.field17, this.field16);
        }
        this.field24.field1675.method979(5123, class312.field4540.field578, class312.field4540.field565);
        var18.glMatrixMode(5890);
        var18.glPushMatrix();
        var18.glScalef(1.0F / this.field23, 1.0F / this.field23, 1.0F);
        var18.glMatrixMode(5888);
        this.field24.method854(this.field21);
        this.field24.method902(this.field22.field4573);
        this.field24.method905(0, this.field22.field4561);
        if ((this.field22.field4548 & 0x7) == 0) {
            this.field24.method911(false);
        } else {
            this.field24.method925(this.field22.field4565);
            this.field24.method911(true);
        }
        if (this.field22.field4568 != null) {
            this.field24.method905(1, this.field22.field4568);
        }
        this.field24.method876();
        this.field24.method878(this.field24.field1675, 4, 0, var4);
        var18.glMatrixMode(5890);
        var18.glPopMatrix();
        var18.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(II)V")
    public final void method12(int arg0, int arg1) {
        this.field18.position(arg0 * 4);
        this.field18.flip();
        class233 var3 = this.field24.method931(0, this.field18, false);
        this.field21 = new class160(this.field24, var3, 5121, 4, arg1);
        this.field18 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZIIIF)V")
    public final void method13(boolean arg0, int arg1, int arg2, int arg3, float arg4) {
        if (this.field20 != -1) {
            class200 var6 = this.field24.field1606.method1412(this.field20, (byte) -83);
            int var7 = var6.field2917 & 0xFF;
            if (var7 != 0 && var6.field2930 != 4) {
                int var8;
                if (arg3 < 0) {
                    var8 = 0;
                } else if (arg3 > 127) {
                    var8 = 16777215;
                } else {
                    var8 = arg3 * 131586;
                }
                if (var7 == 256) {
                    arg1 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg1 = ((arg1 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) + ((arg1 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field2934 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = ((arg1 & 0xFF0000) >> 16) * var11;
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
                arg1 = (var13 & 0xFF00) + ((var12 & 0xE600FF00) << 8) + (var14 >> 8);
            }
        }
        if (arg4 != 1.0F) {
            int var15 = arg1 >> 16 & 0xFF;
            int var16 = arg1 >> 8 & 0xFF;
            int var17 = (int) ((float) var15 * arg4);
            int var18 = arg1 & 0xFF;
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
            arg1 = var19 << 8 | var17 << 16 | var20;
        }
        if (!arg0) {
            this.field24 = (class104) null;
        }
        this.field18.position(arg2 * 4);
        this.field18.put((byte) (arg1 >> 16));
        this.field18.put((byte) (arg1 >> 8));
        this.field18.put((byte) arg1);
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(II)V")
    public final void method14(int arg0, int arg1) {
        int var3 = 98 % ((20 - arg1) / 50);
        this.field18 = ByteBuffer.allocateDirect(arg0 * 4);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIII)V")
    public final void method15(int arg0, int arg1, int arg2, int arg3) {
        this.field19[this.field22.field2037 * arg2 + arg1] = class439.method2744(this.field19[this.field22.field2037 * arg2 + arg1], arg0 << arg3);
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lwh;IIII)V")
    public class3(class312 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field22 = arg0;
        this.field24 = this.field22.field4544;
        this.field17 = arg3;
        this.field20 = arg1;
        this.field16 = arg4;
        this.field23 = (float) arg2;
        this.field19 = new int[this.field22.field2045 * this.field22.field2037];
    }
}
