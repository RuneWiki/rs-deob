import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class358 extends class418 {

    @OriginalMember(owner = "client!ep", name = "s", descriptor = "Lsb;")
    private class153 field5307;

    @OriginalMember(owner = "client!ep", name = "r", descriptor = "I")
    private int field5306;

    @OriginalMember(owner = "client!ep", name = "n", descriptor = "F")
    private float field5302;

    @OriginalMember(owner = "client!ep", name = "l", descriptor = "[I")
    private int[] field5300;

    @OriginalMember(owner = "client!ep", name = "o", descriptor = "I")
    private int field5303;

    @OriginalMember(owner = "client!ep", name = "p", descriptor = "Lse;")
    private class282 field5304;

    @OriginalMember(owner = "client!ep", name = "q", descriptor = "I")
    private int field5305;

    @OriginalMember(owner = "client!ep", name = "m", descriptor = "Lkr;")
    private class26 field5301;

    @OriginalMember(owner = "client!ep", name = "k", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field5299;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(BI)V")
    public final void method2352(byte arg0, int arg1) {
        this.field5299.position(arg1 * 4 + 3);
        if (arg0 == -84) {
            this.field5299.put((byte) -1);
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IFIII)V")
    public final void method2353(int arg0, float arg1, int arg2, int arg3, int arg4) {
        if (this.field5303 != -1) {
            class3 var6 = this.field5304.field4150.method1962(this.field5303, -11999);
            int var7 = var6.field33 & 0xFF;
            if (var7 != 0 && var6.field45 != 4) {
                int var8;
                if (arg0 < 0) {
                    var8 = 0;
                } else if (arg0 <= 127) {
                    var8 = arg0 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg4 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg4 = ((var8 & 0xFF00) * var7 + ((arg4 & 0xFF00) * var10) & 0xFF0000) + ((arg4 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field40 & 0xFF;
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
                arg4 = (var14 >> 8) + ((var12 << 8 & 0xFF00EC) + (var13 & 0xFF00));
            }
        }
        this.field5299.position(arg3 * 4);
        if (arg1 != 1.0F) {
            int var15 = (arg4 & 0xFF0F17) >> 16;
            int var16 = (arg4 & 0xFF62) >> 8;
            int var17 = arg4 & 0xFF;
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
            arg4 = var18 << 16 | var19 << 8 | var20;
        }
        this.field5299.put((byte) (arg4 >> 16));
        this.field5299.put((byte) (arg4 >> 8));
        this.field5299.put((byte) arg4);
        if (arg2 != 23016) {
            this.method2356(30, -105, 73, 56);
        }
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(II)V")
    public final void method2354(int arg0, int arg1) {
        this.field5299 = ByteBuffer.allocateDirect(arg0 * 4);
        if (arg1 != 19320) {
            this.method2356(-37, 37, -14, -51);
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "([III)V")
    public final void method2355(int[] arg0, int arg1, int arg2) {
        int var4 = 0;
        class153.field1922.field5049 = 0;
        if (arg1 != 1) {
            this.method2355((int[]) null, -13, 43);
        }
        if (this.field5304.field4232) {
            for (int var5 = 0; var5 < arg2; var5++) {
                int var6 = arg0[var5];
                short[] var7 = this.field5307.field1931[var6];
                int var8 = this.field5300[var6];
                if (var8 != 0 && var7 != null) {
                    int var9 = 0;
                    int var10 = 0;
                    while (var10 < var7.length) {
                        if ((0x1 << var9++ & var8) == 0) {
                            var10 += 3;
                        } else {
                            var4++;
                            class153.field1922.method2250(false, var7[var10++]);
                            var4++;
                            class153.field1922.method2250(false, var7[var10++]);
                            class153.field1922.method2250(false, var7[var10++]);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var11 = 0; var11 < arg2; var11++) {
                int var12 = arg0[var11];
                short[] var13 = this.field5307.field1931[var12];
                int var14 = this.field5300[var12];
                if (var14 != 0 && var13 != null) {
                    int var15 = 0;
                    int var16 = 0;
                    while (var16 < var13.length) {
                        if ((0x1 << var15++ & var14) == 0) {
                            var16 += 3;
                        } else {
                            class153.field1922.method2206(78, var13[var16++]);
                            var4++;
                            var4++;
                            class153.field1922.method2206(39, var13[var16++]);
                            var4++;
                            class153.field1922.method2206(arg1 ^ 0x35, var13[var16++]);
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        opengl var17 = this.field5304.field4140;
        this.field5304.method1919(this.field5303, (this.field5307.field1924 & 0x7) != 0, (this.field5307.field1924 & 0x8) != 0);
        if (this.field5304.field4225) {
            this.field5304.method450(Integer.MAX_VALUE, this.field5305, this.field5306);
        }
        this.field5304.field4181.method2126(5123, class153.field1922.field5042, class153.field1922.field5049);
        var17.glMatrixMode(5890);
        var17.glPushMatrix();
        var17.glScalef(1.0F / this.field5302, 1.0F / this.field5302, 1.0F);
        var17.glMatrixMode(5888);
        this.field5304.method1902(this.field5301);
        this.field5304.method1883(this.field5307.field1948);
        this.field5304.method1878(0, this.field5307.field1949);
        if ((this.field5307.field1924 & 0x7) == 0) {
            this.field5304.method1931(false);
        } else {
            this.field5304.method1886(this.field5307.field1944);
            this.field5304.method1931(true);
        }
        if (this.field5307.field1953 != null) {
            this.field5304.method1878(1, this.field5307.field1953);
        }
        this.field5304.method1930();
        this.field5304.method1891(this.field5304.field4181, 4, 0, var4);
        var17.glMatrixMode(5890);
        var17.glPopMatrix();
        var17.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIII)V")
    public final void method2356(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -11059) {
            this.field5302 = -1.2797606F;
        }
        this.field5300[this.field5307.field2681 * arg0 + arg3] = class258.method1708(this.field5300[this.field5307.field2681 * arg0 + arg3], 0x1 << arg1);
    }

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "(II)V")
    public final void method2357(int arg0, int arg1) {
        this.field5299.position(arg1 * 4);
        if (arg0 > 20) {
            this.field5299.flip();
            class89 var3 = this.field5304.method1904(0, this.field5299, false);
            this.field5301 = new class26(this.field5304, var3, 5121, 4, 0);
            this.field5299 = null;
        }
    }

    @OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Lsb;IIII)V")
    public class358(class153 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5307 = arg0;
        this.field5306 = arg4;
        this.field5302 = (float) arg2;
        this.field5300 = new int[this.field5307.field2685 * this.field5307.field2681];
        this.field5303 = arg1;
        this.field5304 = this.field5307.field1920;
        this.field5305 = arg3;
    }
}
