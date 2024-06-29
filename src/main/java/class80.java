import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class80 extends class35 {

    @OriginalMember(owner = "client!np", name = "s", descriptor = "Llg;")
    private class22 field1129;

    @OriginalMember(owner = "client!np", name = "t", descriptor = "F")
    public float field1130;

    @OriginalMember(owner = "client!np", name = "v", descriptor = "I")
    public int field1132;

    @OriginalMember(owner = "client!np", name = "o", descriptor = "I")
    public int field1125;

    @OriginalMember(owner = "client!np", name = "q", descriptor = "Lnm;")
    private class254 field1127;

    @OriginalMember(owner = "client!np", name = "n", descriptor = "I")
    public int field1124;

    @OriginalMember(owner = "client!np", name = "m", descriptor = "[I")
    private int[] field1123;

    @OriginalMember(owner = "client!np", name = "p", descriptor = "I")
    public int field1126;

    @OriginalMember(owner = "client!np", name = "u", descriptor = "Lbb;")
    private class289 field1131;

    @OriginalMember(owner = "client!np", name = "r", descriptor = "Ljt;")
    private class377 field1128;

    @OriginalMember(owner = "client!np", name = "l", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1122;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(BI)V")
    public final void method661(byte arg0, int arg1) {
        this.field1122.position(arg1 * 4 + 3);
        if (arg0 >= -85) {
            this.field1122 = (ByteBuffer) null;
        }
        this.field1122.put((byte) -1);
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IIIFI)V")
    public final void method662(int arg0, int arg1, int arg2, float arg3, int arg4) {
        if (this.field1132 != -1) {
            class85 var6 = this.field1127.field871.method1331(9386, this.field1132);
            int var7 = var6.field1215 & 0xFF;
            if (var7 != 0 && var6.field1218 != 4) {
                int var8;
                if (arg1 < 0) {
                    var8 = 0;
                } else if (arg1 <= 127) {
                    var8 = arg1 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg0 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg0 = ((arg0 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) + ((arg0 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field1211 & 0xFF;
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
                arg0 = (var14 >> 8) + ((var12 & 0x6500FF00) << 8) + (var13 & 0xFF00);
            }
        }
        this.field1122.position(arg2 * 4);
        if (arg3 != 1.0F) {
            int var15 = arg0 >> 16 & 0xFF;
            int var16 = (arg0 & 0xFFB4) >> 8;
            int var17 = (int) ((float) var15 * arg3);
            int var18 = arg0 & 0xFF;
            int var19 = (int) ((float) var16 * arg3);
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
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
            arg0 = var19 << 8 | var17 << 16 | var20;
        }
        this.field1122.put((byte) (arg0 >> 16));
        int var21 = -70 % ((-arg4) / 46);
        this.field1122.put((byte) (arg0 >> 8));
        this.field1122.put((byte) arg0);
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IIBI)V")
    public final void method663(int arg0, int arg1, byte arg2, int arg3) {
        this.field1123[this.field1129.field686 * arg3 + arg1] = class347.method2139(this.field1123[this.field1129.field686 * arg3 + arg1], 0x1 << arg0);
        if (arg2 != -56) {
            this.field1125 = -81;
        }
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(BI)V")
    public final void method664(byte arg0, int arg1) {
        int var3 = -105 / ((-arg0 - 5) / 51);
        this.field1122.position(arg1 * 4);
        this.field1122.flip();
        class101 var4 = this.field1127.method1618(0, this.field1122, false);
        this.field1128 = new class377(this.field1127, var4, 5121, 4, 0);
        this.field1122 = null;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(II)V")
    public final void method665(int arg0, int arg1) {
        this.field1122 = ByteBuffer.allocateDirect(arg0 * arg1);
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I[IZ)V")
    public final void method666(int arg0, int[] arg1, boolean arg2) {
        if (arg2) {
            this.field1122 = (ByteBuffer) null;
        }
        int var4 = 0;
        class446 var5 = class22.field280;
        var5.field6315 = 0;
        if (this.field1127.field3742) {
            for (int var6 = 0; var6 < arg0; var6++) {
                int var7 = arg1[var6];
                int var8 = this.field1123[var7];
                short[] var9 = this.field1129.field283[var7];
                if (var8 != 0 && var9 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var11 < var9.length) {
                        if ((var8 & 0x1 << var10++) == 0) {
                            var11 += 3;
                        } else {
                            var4++;
                            var5.method2592(var9[var11++] & 0xFFFF, (byte) -97);
                            var5.method2592(var9[var11++] & 0xFFFF, (byte) -121);
                            var4++;
                            var5.method2592(var9[var11++] & 0xFFFF, (byte) -113);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var12 = 0; var12 < arg0; var12++) {
                int var13 = arg1[var12];
                short[] var14 = this.field1129.field283[var13];
                int var15 = this.field1123[var13];
                if (var15 != 0 && var14 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var17 < var14.length) {
                        if ((0x1 << var16++ & var15) == 0) {
                            var17 += 3;
                        } else {
                            var5.method2623(var14[var17++] & 0xFFFF, (byte) -55);
                            var4++;
                            var5.method2623(var14[var17++] & 0xFFFF, (byte) -87);
                            var4++;
                            var4++;
                            var5.method2623(var14[var17++] & 0xFFFF, (byte) -63);
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        opengl var18 = this.field1127.field3648;
        this.field1131.method1528(5123, var5.field6316, var5.field6315);
        this.field1127.method1674(this.field1129.field300, this.field1129.field298, this.field1128, this.field1129.field296);
        this.field1127.method1666(this.field1132, (this.field1129.field269 & 0x7) != 0, (this.field1129.field269 & 0x8) != 0);
        if (this.field1127.field3775) {
            this.field1127.method570(Integer.MAX_VALUE, this.field1124, this.field1126, this.field1125);
        }
        var18.glMatrixMode(5890);
        var18.glPushMatrix();
        var18.glScalef(1.0F / this.field1130, 1.0F / this.field1130, 1.0F);
        var18.glMatrixMode(5888);
        this.field1127.method1674(this.field1129.field300, this.field1129.field298, this.field1128, this.field1129.field296);
        this.field1127.method1664(this.field1131, 4, 0, var4);
        var18.glMatrixMode(5890);
        var18.glPopMatrix();
        var18.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!np", name = "<init>", descriptor = "(Llg;IIIII)V")
    public class80(class22 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1129 = arg0;
        this.field1130 = (float) arg2;
        this.field1132 = arg1;
        this.field1125 = arg5;
        this.field1127 = this.field1129.field264;
        this.field1124 = arg3;
        this.field1123 = new int[this.field1129.field690 * this.field1129.field686];
        this.field1126 = arg4;
        this.field1131 = new class289(this.field1127, 5123, (byte[]) null, 1);
    }
}
