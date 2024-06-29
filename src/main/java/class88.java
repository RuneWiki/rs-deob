import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class88 extends class390 {

    @OriginalMember(owner = "client!hq", name = "r", descriptor = "Lfq;")
    private class111 field1232;

    @OriginalMember(owner = "client!hq", name = "p", descriptor = "I")
    private int field1230;

    @OriginalMember(owner = "client!hq", name = "q", descriptor = "I")
    private int field1231;

    @OriginalMember(owner = "client!hq", name = "n", descriptor = "F")
    private float field1228;

    @OriginalMember(owner = "client!hq", name = "o", descriptor = "[I")
    private int[] field1229;

    @OriginalMember(owner = "client!hq", name = "m", descriptor = "I")
    private int field1227;

    @OriginalMember(owner = "client!hq", name = "l", descriptor = "Ltb;")
    private class227 field1226;

    @OriginalMember(owner = "client!hq", name = "j", descriptor = "Lsr;")
    private class136 field1224;

    @OriginalMember(owner = "client!hq", name = "k", descriptor = "Lq;")
    private class246 field1225;

    @OriginalMember(owner = "client!hq", name = "s", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1233;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIIBF)V", line = 5)
    public final void method619(int arg0, int arg1, int arg2, byte arg3, float arg4) {
        if (this.field1227 != -1) {
            class454 var6 = this.field1226.field3186.method469(this.field1227, (byte) -109);
            int var7 = var6.field6493 & 0xFF;
            if (var7 != 0 && var6.field6471 != 4) {
                int var8;
                if (arg0 < 0) {
                    var8 = 0;
                } else if (arg0 <= 127) {
                    var8 = arg0 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg2 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg2 = ((arg2 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) + ((arg2 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field6474 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = ((arg2 & 0xFF0000) >> 16) * var11;
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
                arg2 = (var12 << 8 & 0xFF00D3) + (var14 >> 8) + (var13 & 0xFF00);
            }
        }
        this.field1233.position(arg1 * 4);
        if (arg4 != 1.0F) {
            int var15 = (arg2 & 0xFFDC2C) >> 16;
            int var16 = arg2 >> 8 & 0xFF;
            int var17 = (int) ((float) var15 * arg4);
            int var18 = arg2 & 0xFF;
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
            arg2 = var20 | var19 << 8 | var17 << 16;
        }
        this.field1233.put((byte) (arg2 >> 16));
        this.field1233.put((byte) (arg2 >> 8));
        this.field1233.put((byte) arg2);
        if (arg3 < 67) {
            this.method622(-55, -56);
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IB)V", line = 119)
    public final void method620(int arg0, byte arg1) {
        this.field1233.position(arg0 * 4 + 3);
        this.field1233.put((byte) -1);
        if (arg1 != 31) {
            this.method619(-43, -73, -126, (byte) 50, 0.7110345F);
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(II[I)V", line = 133)
    public final void method621(int arg0, int arg1, int[] arg2) {
        int var4 = 0;
        class11 var5 = class111.field1604;
        var5.field191 = 0;
        if (arg1 != 5888) {
            this.field1231 = -97;
        }
        if (this.field1226.field3229) {
            for (int var6 = 0; var6 < arg0; var6++) {
                int var7 = arg2[var6];
                int var8 = this.field1229[var7];
                short[] var9 = this.field1232.field1600[var7];
                if (var8 != 0 && var9 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var11 < var9.length) {
                        if ((var8 & 0x1 << var10++) == 0) {
                            var11 += 3;
                        } else {
                            var4++;
                            var5.method191(var9[var11++] & 0xFFFF, -114);
                            var4++;
                            var5.method191(var9[var11++] & 0xFFFF, -77);
                            var5.method191(var9[var11++] & 0xFFFF, -77);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var12 = 0; var12 < arg0; var12++) {
                int var13 = arg2[var12];
                short[] var14 = this.field1232.field1600[var13];
                int var15 = this.field1229[var13];
                if (var15 != 0 && var14 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var17 < var14.length) {
                        if ((var15 & 0x1 << var16++) == 0) {
                            var17 += 3;
                        } else {
                            var4++;
                            var5.method210(var14[var17++] & 0xFFFF, arg1 ^ 0x220B);
                            var4++;
                            var5.method210(var14[var17++] & 0xFFFF, 13579);
                            var5.method210(var14[var17++] & 0xFFFF, 13579);
                            var4++;
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        opengl var18 = this.field1226.field3184;
        this.field1226.method1515(this.field1227, (this.field1232.field1602 & 0x7) != 0, (this.field1232.field1602 & 0x8) != 0);
        if (this.field1226.field3265) {
            this.field1226.method57(Integer.MAX_VALUE, this.field1231, this.field1230);
        }
        this.field1224.method390(5123, var5.field230, var5.field191);
        var18.glMatrixMode(5890);
        var18.glPushMatrix();
        var18.glScalef(1.0F / this.field1228, 1.0F / this.field1228, 1.0F);
        var18.glMatrixMode(5888);
        this.field1226.method1513(this.field1232.field1618, this.field1232.field1614, this.field1225, this.field1232.field1625);
        this.field1226.method1567(this.field1224, 4, 0, var4);
        var18.glMatrixMode(5890);
        var18.glPopMatrix();
        var18.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(II)V", line = 254)
    public final void method622(int arg0, int arg1) {
        if (arg1 < 11) {
            this.method620(3, (byte) 116);
        }
        this.field1233 = ByteBuffer.allocateDirect(arg0 * 4);
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(ZI)V", line = 265)
    public final void method623(boolean arg0, int arg1) {
        this.field1233.position(arg1 * 4);
        this.field1233.flip();
        class122 var3 = this.field1226.method1537(0, this.field1233, false);
        if (arg0) {
            this.field1225 = new class246(this.field1226, var3, 5121, 4, 0);
            this.field1233 = null;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIII)V", line = 284)
    public final void method624(int arg0, int arg1, int arg2, int arg3) {
        this.field1229[this.field1232.field3434 * arg2 + arg1] = class393.method2487(this.field1229[this.field1232.field3434 * arg2 + arg1], 0x1 << arg3);
        if (arg0 != 0) {
            this.method622(7, -45);
        }
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lfq;IIII)V", line = 292)
    public class88(class111 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1232 = arg0;
        this.field1230 = arg4;
        this.field1231 = arg3;
        this.field1228 = (float) arg2;
        this.field1229 = new int[this.field1232.field3434 * this.field1232.field3433];
        this.field1227 = arg1;
        this.field1226 = this.field1232.field1601;
        this.field1224 = new class136(this.field1226, 5123, (byte[]) null, 1);
    }
}
