import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class357 extends class45 {

    @OriginalMember(owner = "client!md", name = "m", descriptor = "Lkk;")
    private class371 field5164;

    @OriginalMember(owner = "client!md", name = "r", descriptor = "I")
    private int field5169;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "I")
    private int field5162;

    @OriginalMember(owner = "client!md", name = "s", descriptor = "F")
    private float field5170;

    @OriginalMember(owner = "client!md", name = "o", descriptor = "Lnf;")
    private class256 field5166;

    @OriginalMember(owner = "client!md", name = "p", descriptor = "[I")
    private int[] field5167;

    @OriginalMember(owner = "client!md", name = "q", descriptor = "I")
    private int field5168;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "Lgm;")
    private class336 field5163;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field5165;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "([IIB)V", line = 10)
    public final void method2339(int[] arg0, int arg1, byte arg2) {
        int var4 = 0;
        int var5 = 31 % ((arg2 + 12) / 50);
        class371.field5379.field3029 = 0;
        if (this.field5166.field3663) {
            for (int var12 = 0; var12 < arg1; var12++) {
                int var13 = arg0[var12];
                short[] var14 = this.field5164.field5374[var13];
                int var15 = this.field5167[var13];
                if (var15 != 0 && var14 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var17 < var14.length) {
                        if ((0x1 << var16++ & var15) == 0) {
                            var17 += 3;
                        } else {
                            class371.field5379.method1326(var14[var17++], -105);
                            var4++;
                            class371.field5379.method1326(var14[var17++], -53);
                            var4++;
                            var4++;
                            class371.field5379.method1326(var14[var17++], -106);
                        }
                    }
                }
            }
        } else {
            for (int var6 = 0; var6 < arg1; var6++) {
                int var7 = arg0[var6];
                short[] var8 = this.field5164.field5374[var7];
                int var9 = this.field5167[var7];
                if (var9 != 0 && var8 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var11 < var8.length) {
                        if ((0x1 << var10++ & var9) == 0) {
                            var11 += 3;
                        } else {
                            var4++;
                            class371.field5379.method1359((byte) -116, var8[var11++]);
                            var4++;
                            class371.field5379.method1359((byte) -127, var8[var11++]);
                            class371.field5379.method1359((byte) -101, var8[var11++]);
                            var4++;
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        opengl var18 = this.field5166.field3634;
        this.field5166.method1775(this.field5168, (this.field5164.field5388 & 0x7) != 0, (this.field5164.field5388 & 0x8) != 0);
        if (this.field5166.field3708) {
            this.field5166.method1685(Integer.MAX_VALUE, this.field5162, this.field5169);
        }
        this.field5166.field3757.method141(5123, class371.field5379.field3040, class371.field5379.field3029);
        var18.glMatrixMode(5890);
        var18.glPushMatrix();
        var18.glScalef(1.0F / this.field5170, 1.0F / this.field5170, 1.0F);
        var18.glMatrixMode(5888);
        this.field5166.method1635(this.field5163);
        this.field5166.method1668(this.field5166.field3757, 4, 0, var4);
        var18.glMatrixMode(5890);
        var18.glPopMatrix();
        var18.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BI)V", line = 128)
    public final void method2340(byte arg0, int arg1) {
        if (arg0 < 68) {
            this.field5167 = (int[]) null;
        }
        this.field5165 = ByteBuffer.allocateDirect(arg1 * 4);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IFIIZ)V", line = 139)
    public final void method2341(int arg0, float arg1, int arg2, int arg3, boolean arg4) {
        if (this.field5168 != -1) {
            class444 var6 = this.field5166.field3631.method186(this.field5168, -9590);
            int var7 = var6.field6495 & 0xFF;
            if (var7 != 0 && var6.field6506 != 4) {
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
                    arg0 = ((arg0 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) + ((arg0 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field6512 & 0xFF;
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
                arg0 = (var13 & 0xFF00) + ((var12 & 0x4800FF00) << 8) + (var14 >> 8);
            }
        }
        if (arg1 != 1.0F) {
            int var15 = arg0 >> 16 & 0xFF;
            int var16 = arg0 >> 8 & 0xFF;
            int var17 = arg0 & 0xFF;
            int var18 = (int) ((float) var15 * arg1);
            int var19 = (int) ((float) var16 * arg1);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
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
            arg0 = var18 << 16 | var19 << 8 | var20;
        }
        this.field5165.position(arg3 * 4);
        this.field5165.put((byte) (arg0 >> 16));
        if (arg4) {
            this.field5169 = -29;
        }
        this.field5165.put((byte) (arg0 >> 8));
        this.field5165.put((byte) arg0);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II)V", line = 250)
    public final void method2342(int arg0, int arg1) {
        this.field5165.position(arg0 * 4);
        this.field5165.flip();
        if (arg1 != 3) {
            this.method2340((byte) -48, 45);
        }
        class50 var3 = this.field5166.method1629(0, this.field5165, false);
        this.field5163 = new class336(this.field5166, var3, 5121, 4, 0);
        this.field5165 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIII)V", line = 265)
    public final void method2343(int arg0, int arg1, int arg2, int arg3) {
        this.field5167[this.field5164.field5084 * arg2 + arg0] = class351.method2313(this.field5167[this.field5164.field5084 * arg2 + arg0], 0x1 << arg3);
        if (arg1 != 27616) {
            this.field5167 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(II)V", line = 278)
    public final void method2344(int arg0, int arg1) {
        this.field5165.position(arg1 * 4 + 3);
        this.field5165.put((byte) -1);
        int var3 = -94 % ((2 - arg0) / 38);
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lkk;IIII)V", line = 286)
    public class357(class371 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5164 = arg0;
        this.field5169 = arg4;
        this.field5162 = arg3;
        this.field5170 = (float) arg2;
        this.field5166 = this.field5164.field5383;
        this.field5167 = new int[this.field5164.field5085 * this.field5164.field5084];
        this.field5168 = arg1;
    }
}
