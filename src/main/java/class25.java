import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class25 extends class43 {

    @OriginalMember(owner = "client!ap", name = "r", descriptor = "Lef;")
    private class377 field293;

    @OriginalMember(owner = "client!ap", name = "o", descriptor = "I")
    private int field290;

    @OriginalMember(owner = "client!ap", name = "l", descriptor = "I")
    private int field287;

    @OriginalMember(owner = "client!ap", name = "p", descriptor = "[I")
    private int[] field291;

    @OriginalMember(owner = "client!ap", name = "m", descriptor = "Lh;")
    private class327 field288;

    @OriginalMember(owner = "client!ap", name = "s", descriptor = "I")
    private int field294;

    @OriginalMember(owner = "client!ap", name = "t", descriptor = "F")
    private float field295;

    @OriginalMember(owner = "client!ap", name = "q", descriptor = "Lid;")
    private class155 field292;

    @OriginalMember(owner = "client!ap", name = "k", descriptor = "Lig;")
    private class205 field286;

    @OriginalMember(owner = "client!ap", name = "n", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field289;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IB)V")
    public final void method157(int arg0, byte arg1) {
        this.field289.position(arg0 * 4);
        this.field289.flip();
        if (arg1 >= -61) {
            this.method162(4, -76, 35, 11);
        }
        class415 var3 = this.field288.method2073(0, this.field289, false);
        this.field286 = new class205(this.field288, var3, 5121, 4, 0);
        this.field289 = null;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IFZII)V")
    public final void method158(int arg0, float arg1, boolean arg2, int arg3, int arg4) {
        if (!arg2) {
            this.method160((byte) -20, (int[]) null, 109);
        }
        if (this.field294 != -1) {
            class358 var6 = this.field288.field4355.method960(this.field294, (byte) -40);
            int var7 = var6.field4861 & 0xFF;
            if (var7 != 0 && var6.field4859 != 4) {
                int var8;
                if (arg0 < 0) {
                    var8 = 0;
                } else if (arg0 <= 127) {
                    var8 = arg0 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg3 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg3 = ((var8 & 0xFF00) * var7 + ((arg3 & 0xFF00) * var10) & 0xFF0000) + ((arg3 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field4869 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = ((arg3 & 0xFF0000) >> 16) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = ((arg3 & 0xFF00) >> 8) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg3 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg3 = (var14 >> 8) + (((var12 & 0xBC00FF00) << 8) + (var13 & 0xFF00));
            }
        }
        this.field289.position(arg4 * 4);
        if (arg1 != 1.0F) {
            int var15 = arg3 >> 16 & 0xFF;
            int var16 = arg3 >> 8 & 0xFF;
            int var17 = arg3 & 0xFF;
            int var18 = (int) ((float) var15 * arg1);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            int var19 = (int) ((float) var16 * arg1);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            int var20 = (int) ((float) var17 * arg1);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg3 = var18 << 16 | var19 << 8 | var20;
        }
        this.field289.put((byte) (arg3 >> 16));
        this.field289.put((byte) (arg3 >> 8));
        this.field289.put((byte) arg3);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(BI)V")
    public final void method159(byte arg0, int arg1) {
        if (arg0 > 122) {
            this.field289 = ByteBuffer.allocateDirect(arg1 * 4);
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(B[II)V")
    public final void method160(byte arg0, int[] arg1, int arg2) {
        int var4 = 0;
        class242 var5 = class377.field5098;
        if (arg0 <= 125) {
            this.method158(96, -1.3881823F, true, 68, 75);
        }
        var5.field3211 = 0;
        if (this.field288.field4448) {
            for (int var6 = 0; var6 < arg2; var6++) {
                int var7 = arg1[var6];
                int var8 = this.field291[var7];
                short[] var9 = this.field293.field5109[var7];
                if (var8 != 0 && var9 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var9.length > var11) {
                        if ((0x1 << var10++ & var8) == 0) {
                            var11 += 3;
                        } else {
                            var5.method1573(-6266, var9[var11++] & 0xFFFF);
                            var4++;
                            var4++;
                            var5.method1573(-6266, var9[var11++] & 0xFFFF);
                            var5.method1573(-6266, var9[var11++] & 0xFFFF);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var12 = 0; var12 < arg2; var12++) {
                int var13 = arg1[var12];
                short[] var14 = this.field293.field5109[var13];
                int var15 = this.field291[var13];
                if (var15 != 0 && var14 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var14.length > var17) {
                        if ((0x1 << var16++ & var15) == 0) {
                            var17 += 3;
                        } else {
                            var5.method1540(true, var14[var17++] & 0xFFFF);
                            var4++;
                            var5.method1540(true, var14[var17++] & 0xFFFF);
                            var4++;
                            var5.method1540(true, var14[var17++] & 0xFFFF);
                            var4++;
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        opengl var18 = this.field288.field4363;
        this.field288.method2100(this.field294, (this.field293.field5097 & 0x7) != 0, (this.field293.field5097 & 0x8) != 0);
        if (this.field288.field4487) {
            this.field288.method712(Integer.MAX_VALUE, this.field287, this.field290);
        }
        this.field292.method116(5123, var5.field3188, var5.field3211);
        var18.glMatrixMode(5890);
        var18.glPushMatrix();
        var18.glScalef(1.0F / this.field295, 1.0F / this.field295, 1.0F);
        var18.glMatrixMode(5888);
        this.field288.method2070(this.field293.field5118, this.field293.field5129, this.field286, this.field293.field5124);
        this.field288.method2053(this.field292, 4, 0, var4);
        var18.glMatrixMode(5890);
        var18.glPopMatrix();
        var18.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(II)V")
    public final void method161(int arg0, int arg1) {
        if (arg0 == -1) {
            this.field289.position(arg1 * 4 + 3);
            this.field289.put((byte) -1);
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIII)V")
    public final void method162(int arg0, int arg1, int arg2, int arg3) {
        this.field291[this.field293.field3612 * arg3 + arg0] = class213.method1307(this.field291[this.field293.field3612 * arg3 + arg0], arg2 << arg1);
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Lef;IIII)V")
    public class25(class377 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field293 = arg0;
        this.field290 = arg4;
        this.field287 = arg3;
        this.field291 = new int[this.field293.field3612 * this.field293.field3611];
        this.field288 = this.field293.field5103;
        this.field294 = arg1;
        this.field295 = (float) arg2;
        this.field292 = new class155(this.field288, 5123, (byte[]) null, 1);
    }
}
