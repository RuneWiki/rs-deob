import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class484 extends class238 {

    @OriginalMember(owner = "client!wo", name = "o", descriptor = "Lag;")
    private class445 field6811;

    @OriginalMember(owner = "client!wo", name = "r", descriptor = "I")
    public int field6814;

    @OriginalMember(owner = "client!wo", name = "t", descriptor = "I")
    public int field6816;

    @OriginalMember(owner = "client!wo", name = "l", descriptor = "F")
    public float field6808;

    @OriginalMember(owner = "client!wo", name = "u", descriptor = "I")
    public int field6817;

    @OriginalMember(owner = "client!wo", name = "m", descriptor = "[I")
    private int[] field6809;

    @OriginalMember(owner = "client!wo", name = "s", descriptor = "Lmi;")
    private class315 field6815;

    @OriginalMember(owner = "client!wo", name = "v", descriptor = "I")
    public int field6818;

    @OriginalMember(owner = "client!wo", name = "n", descriptor = "Lig;")
    private class147 field6810;

    @OriginalMember(owner = "client!wo", name = "q", descriptor = "Lga;")
    private class254 field6813;

    @OriginalMember(owner = "client!wo", name = "p", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field6812;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IBII)V")
    public final void method2825(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 == -77) {
            this.field6809[this.field6811.field5967 * arg0 + arg3] = class248.method1549(this.field6809[this.field6811.field5967 * arg0 + arg3], 0x1 << arg2);
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(BI)V")
    public final void method2826(byte arg0, int arg1) {
        if (arg0 > -18) {
            this.field6817 = 120;
        }
        this.field6812.position(arg1 * 4);
        this.field6812.flip();
        class378 var3 = this.field6815.method2007(0, this.field6812, false);
        this.field6813 = new class254(this.field6815, var3, 5121, 4, 0);
        this.field6812 = null;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IZ)V")
    public final void method2827(int arg0, boolean arg1) {
        this.field6812.position(arg0 * 4 + 3);
        if (arg1) {
            this.field6812.put((byte) -1);
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(II)V")
    public final void method2828(int arg0, int arg1) {
        this.field6812 = ByteBuffer.allocateDirect(arg1 * 4);
        if (arg0 != 0) {
            this.method2830(-110, (int[]) null, 104);
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIIFI)V")
    public final void method2829(int arg0, int arg1, int arg2, float arg3, int arg4) {
        if (this.field6817 != -1) {
            class279 var6 = this.field6815.field4432.method703(12095, this.field6817);
            int var7 = var6.field4122 & 0xFF;
            if (var7 != 0 && var6.field4105 != 4) {
                int var8;
                if (arg2 < 0) {
                    var8 = 0;
                } else if (arg2 <= 127) {
                    var8 = arg2 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg4 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg4 = ((arg4 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) + ((arg4 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field4110 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = ((arg4 & 0xFF0000) >> 16) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = (arg4 >> 8 & 0xFF) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg4 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg4 = (var14 >> 8) + (((var12 & 0xD500FF00) << 8) + (var13 & 0xFF00));
            }
        }
        if (arg3 != 1.0F) {
            int var15 = (arg4 & 0xFFA7A3) >> 16;
            int var16 = (arg4 & 0xFF89) >> 8;
            int var17 = arg4 & 0xFF;
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
            arg4 = var20 | var18 << 16 | var19 << 8;
        }
        if (arg1 == -3482) {
            this.field6812.position(arg0 * 4);
            this.field6812.put((byte) (arg4 >> 16));
            this.field6812.put((byte) (arg4 >> 8));
            this.field6812.put((byte) arg4);
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(I[II)V")
    public final void method2830(int arg0, int[] arg1, int arg2) {
        if (arg2 < 21) {
            return;
        }
        int var4 = 0;
        class276 var5 = class445.field6143;
        var5.field4021 = 0;
        if (this.field6815.field4514) {
            for (int var6 = 0; var6 < arg0; var6++) {
                int var7 = arg1[var6];
                int var8 = this.field6809[var7];
                short[] var9 = this.field6811.field6150[var7];
                if (var8 != 0 && var9 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var9.length > var11) {
                        if ((0x1 << var10++ & var8) == 0) {
                            var11 += 3;
                        } else {
                            var4++;
                            var5.method1711(false, var9[var11++] & 0xFFFF);
                            var4++;
                            var5.method1711(false, var9[var11++] & 0xFFFF);
                            var5.method1711(false, var9[var11++] & 0xFFFF);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var12 = 0; var12 < arg0; var12++) {
                int var13 = arg1[var12];
                short[] var14 = this.field6811.field6150[var13];
                int var15 = this.field6809[var13];
                if (var15 != 0 && var14 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var14.length > var17) {
                        if ((0x1 << var16++ & var15) == 0) {
                            var17 += 3;
                        } else {
                            var5.method1691(var14[var17++] & 0xFFFF, (byte) -74);
                            var4++;
                            var5.method1691(var14[var17++] & 0xFFFF, (byte) -105);
                            var4++;
                            var4++;
                            var5.method1691(var14[var17++] & 0xFFFF, (byte) -122);
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        opengl var18 = this.field6815.field4445;
        this.field6810.method930(5123, var5.field4064, var5.field4021);
        this.field6815.method2008(this.field6811.field6165, this.field6811.field6168, this.field6813, this.field6811.field6159);
        this.field6815.method1964(this.field6817, (this.field6811.field6152 & 0x7) != 0, (this.field6811.field6152 & 0x8) != 0);
        if (this.field6815.field4505) {
            this.field6815.method631(Integer.MAX_VALUE, this.field6816, this.field6814, this.field6818);
        }
        var18.glMatrixMode(5890);
        var18.glPushMatrix();
        var18.glScalef(1.0F / this.field6808, 1.0F / this.field6808, 1.0F);
        var18.glMatrixMode(5888);
        this.field6815.method2008(this.field6811.field6165, this.field6811.field6168, this.field6813, this.field6811.field6159);
        this.field6815.method1998(this.field6810, 4, 0, var4);
        var18.glMatrixMode(5890);
        var18.glPopMatrix();
        var18.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lag;IIIII)V")
    public class484(class445 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6811 = arg0;
        this.field6814 = arg4;
        this.field6816 = arg3;
        this.field6808 = (float) arg2;
        this.field6817 = arg1;
        this.field6809 = new int[this.field6811.field5970 * this.field6811.field5967];
        this.field6815 = this.field6811.field6158;
        this.field6818 = arg5;
        this.field6810 = new class147(this.field6815, 5123, (byte[]) null, 1);
    }
}
