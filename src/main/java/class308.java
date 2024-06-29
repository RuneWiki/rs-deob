import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class308 extends class34 {

    @OriginalMember(owner = "client!ge", name = "I", descriptor = "Z")
    public boolean field5298 = false;

    @OriginalMember(owner = "client!ge", name = "db", descriptor = "I")
    private int field5319 = -1;

    @OriginalMember(owner = "client!ge", name = "T", descriptor = "I")
    private int field5309 = 0;

    @OriginalMember(owner = "client!ge", name = "W", descriptor = "Lek;")
    private class210 field5312;

    @OriginalMember(owner = "client!ge", name = "cb", descriptor = "Z")
    private boolean field5318;

    @OriginalMember(owner = "client!ge", name = "U", descriptor = "Z")
    private boolean field5310;

    @OriginalMember(owner = "client!ge", name = "N", descriptor = "Z")
    private boolean field5303;

    @OriginalMember(owner = "client!ge", name = "Y", descriptor = "Z")
    private boolean field5314;

    @OriginalMember(owner = "client!ge", name = "L", descriptor = "I")
    private int field5301;

    @OriginalMember(owner = "client!ge", name = "X", descriptor = "I")
    private int field5313;

    @OriginalMember(owner = "client!ge", name = "M", descriptor = "I")
    private int field5302;

    @OriginalMember(owner = "client!ge", name = "Q", descriptor = "I")
    private int field5306;

    @OriginalMember(owner = "client!ge", name = "G", descriptor = "[[[B")
    public static byte[][][] field5296 = new byte[4][104][104];

    @OriginalMember(owner = "client!ge", name = "R", descriptor = "[I")
    public static int[] field5307 = new int[1000];

    @OriginalMember(owner = "client!ge", name = "gb", descriptor = "Lug;")
    public static class238 field5322 = new class238(5000);

    @OriginalMember(owner = "client!ge", name = "mb", descriptor = "Lke;")
    private static class256 field5328 = class316.method2202("Please wait)3)3)3", 27626);

    @OriginalMember(owner = "client!ge", name = "hb", descriptor = "Lke;")
    public static class256 field5323 = field5328;

    @OriginalMember(owner = "client!ge", name = "lb", descriptor = "Lke;")
    public static class256 field5327 = class316.method2202(")3", 27626);

    @OriginalMember(owner = "client!ge", name = "pb", descriptor = "[Z")
    public static boolean[] field5331 = new boolean[100];

    @OriginalMember(owner = "client!ge", name = "ib", descriptor = "Lke;")
    public static class256 field5324 = class316.method2202("k", 27626);

    @OriginalMember(owner = "client!ge", name = "qb", descriptor = "Lke;")
    public static class256 field5332 = class316.method2202(" s(West d-Bconnect-B)3", 27626);

    @OriginalMember(owner = "client!ge", name = "bb", descriptor = "F")
    private float field5317;

    @OriginalMember(owner = "client!ge", name = "H", descriptor = "I")
    public static int field5297;

    @OriginalMember(owner = "client!ge", name = "J", descriptor = "I")
    public static int field5299;

    @OriginalMember(owner = "client!ge", name = "K", descriptor = "I")
    private int field5300;

    @OriginalMember(owner = "client!ge", name = "O", descriptor = "I")
    public static int field5304;

    @OriginalMember(owner = "client!ge", name = "P", descriptor = "I")
    public static int field5305;

    @OriginalMember(owner = "client!ge", name = "V", descriptor = "I")
    public static int field5311;

    @OriginalMember(owner = "client!ge", name = "Z", descriptor = "I")
    public static int field5315;

    @OriginalMember(owner = "client!ge", name = "ab", descriptor = "I")
    public static int field5316;

    @OriginalMember(owner = "client!ge", name = "eb", descriptor = "I")
    public static int field5320;

    @OriginalMember(owner = "client!ge", name = "fb", descriptor = "I")
    public static int field5321;

    @OriginalMember(owner = "client!ge", name = "jb", descriptor = "I")
    public static int field5325;

    @OriginalMember(owner = "client!ge", name = "kb", descriptor = "I")
    public static int field5326;

    @OriginalMember(owner = "client!ge", name = "S", descriptor = "[I")
    private int[] field5308;

    @OriginalMember(owner = "client!ge", name = "ob", descriptor = "[I")
    private static int[] field5330;

    @OriginalMember(owner = "client!ge", name = "nb", descriptor = "[[I")
    public static int[][] field5329;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILng;ZLlb;)Z", line = 7)
    public final boolean method2138(int arg0, class138 arg1, boolean arg2, class228 arg3) {
        field5320++;
        if (!this.field5312.method1482(arg0, arg3, arg1)) {
            return false;
        }
        GL var5 = class253.field4319;
        int var6 = arg2 ? 64 : 128;
        int var7 = class311.method2152((byte) 82);
        if ((var7 & 0x1) == 0) {
            if (this.field5319 == -1) {
                int[] var8 = new int[1];
                var5.glGenTextures(1, var8, 0);
                this.field5300 = class221.field3871;
                this.field5319 = var8[0];
                class253.method1714(this.field5319);
                ByteBuffer var9 = ByteBuffer.wrap(this.field5312.method1479(7569, 0.7D, var6, arg3, this.field5310, arg1, var6));
                if (this.field5302 == 2) {
                    GLU var10 = new GLU();
                    var10.gluBuild2DMipmaps(3553, 6408, var6, var6, 6408, 5121, var9);
                    var5.glTexParameteri(3553, 10241, 9987);
                    var5.glTexParameteri(3553, 10240, 9729);
                    class221.field3869 += var9.limit() * 4 / 3 - this.field5309;
                    this.field5309 = var9.limit() * 4 / 3;
                } else if (this.field5302 == 1) {
                    int var11 = 0;
                    while (true) {
                        var5.glTexImage2D(3553, var11++, 6408, var6, var6, 0, 6408, 5121, var9);
                        var6 >>= 0x1;
                        if (var6 == 0) {
                            var5.glTexParameteri(3553, 10241, 9987);
                            var5.glTexParameteri(3553, 10240, 9729);
                            class221.field3869 += var9.limit() * 4 / 3 - this.field5309;
                            this.field5309 = var9.limit() * 4 / 3;
                            break;
                        }
                        var9 = ByteBuffer.wrap(this.field5312.method1479(arg0 + 7569, 0.7D, var6, arg3, this.field5310, arg1, var6));
                    }
                } else {
                    var5.glTexImage2D(3553, 0, 6408, var6, var6, 0, 6408, 5121, var9);
                    var5.glTexParameteri(3553, 10241, 9729);
                    var5.glTexParameteri(3553, 10240, 9729);
                    class221.field3869 += var9.limit() - this.field5309;
                    this.field5309 = var9.limit();
                }
                var5.glTexParameteri(3553, 10242, this.field5303 ? 10497 : 33071);
                var5.glTexParameteri(3553, 10243, this.field5314 ? 10497 : 33071);
            } else {
                class253.method1714(this.field5319);
            }
        }
        if ((var7 & 0x2) == 0) {
            class253.method1704(this.field5306);
        }
        if ((var7 & 0x4) == 0) {
            class253.method1731(0);
        }
        if ((var7 & 0x8) == 0) {
            if (this.field5313 == 0 && this.field5301 == 0) {
                class253.method1737();
            } else {
                float var12 = (float) (class253.field4326 * this.field5313) / (float) var6;
                float var13 = (float) (class253.field4326 * this.field5301) / (float) var6;
                class253.method1723(var13, var12, 0.0F);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(Z)V", line = 117)
    public static void method2139(boolean arg0) {
        field5307 = null;
        field5323 = null;
        field5296 = (byte[][][]) null;
        field5324 = null;
        field5328 = null;
        field5327 = null;
        if (!arg0) {
            field5327 = (class256) null;
        }
        field5330 = null;
        field5332 = null;
        field5322 = null;
        field5329 = (int[][]) null;
        field5331 = null;
    }

    @OriginalMember(owner = "client!ge", name = "finalize", descriptor = "()V", line = 142)
    protected final void finalize() throws Throwable {
        field5304++;
        if (this.field5319 != -1) {
            class221.method1524(this.field5319, this.field5309, this.field5300);
            this.field5319 = -1;
            this.field5309 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILng;Llb;)Z", line = 164)
    public final boolean method2140(int arg0, class138 arg1, class228 arg2) {
        field5321++;
        if (arg0 != 128) {
            this.method2142((class138) null, 30, (class228) null, true);
        }
        return this.field5312.method1482(0, arg2, arg1);
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(III)J", line = 192)
    public static final long method2141(int arg0, int arg1, int arg2) {
        class271 var3 = class41.field790[arg0][arg1][arg2];
        return var3 == null || var3.field4639 == null ? 0L : var3.field4639.field3601;
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lra;)V", line = 477)
    public class308(class41 arg0) {
        this.field5312 = new class210(arg0);
        this.field5318 = arg0.method357(false) == 1;
        this.field5310 = arg0.method357(false) == 1;
        this.field5303 = arg0.method357(false) == 1;
        this.field5314 = arg0.method357(false) == 1;
        int var2 = arg0.method357(false) & 0x3;
        this.field5301 = arg0.method323(9092);
        this.field5313 = arg0.method323(9092);
        int var3 = arg0.method357(false);
        arg0.method357(false);
        this.field5302 = var3 >> 4 & 0xF;
        if (var2 == 1) {
            this.field5306 = 2;
        } else if (var2 == 2) {
            this.field5306 = 3;
        } else if (var2 == 3) {
            this.field5306 = 4;
        } else {
            this.field5306 = 0;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lng;ILlb;Z)[I", line = 209)
    public final int[] method2142(class138 arg0, int arg1, class228 arg2, boolean arg3) {
        field5315++;
        if (arg1 != -3486) {
            this.field5300 = 125;
        }
        if (this.field5312.method1482(0, arg2, arg0)) {
            int var5 = arg3 ? 64 : 128;
            return this.field5312.method1481(1.0D, 0, var5, var5, this.field5310, arg0, false, arg2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(B)V", line = 225)
    public static final void method2143(byte arg0) {
        class17.field225.method2076(109);
        if (arg0 != -64) {
            field5324 = (class256) null;
        }
        field5305++;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BI)V", line = 236)
    public final void method2144(byte arg0, int arg1) {
        field5299++;
        if (this.field5308 == null) {
            return;
        }
        if (this.field5313 != 0 || this.field5301 != 0) {
            if (field5330 == null || this.field5308.length > field5330.length) {
                field5330 = new int[this.field5308.length];
            }
            int var3 = this.field5308.length == 4096 ? 64 : 128;
            int var4 = this.field5308.length;
            int var5 = this.field5301 * arg1;
            int var6 = var3 - 1;
            int var7 = arg1 * var3 * this.field5313;
            int var8 = var4 - 1;
            for (int var9 = 0; var9 < var4; var9 += var3) {
                int var10 = var8 & var7 + var9;
                for (int var11 = 0; var11 < var3; var11++) {
                    int var12 = (var6 & var5 + var11) + var10;
                    int var13 = var9 + var11;
                    field5330[var13] = this.field5308[var12];
                }
            }
            int[] var14 = this.field5308;
            this.field5308 = field5330;
            field5330 = var14;
        }
        if (arg0 >= -89) {
            method2141(6, 75, -15);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZIFLng;Llb;)[I", line = 301)
    public final int[] method2145(boolean arg0, int arg1, float arg2, class138 arg3, class228 arg4) {
        field5311++;
        if (this.field5308 == null || this.field5317 != arg2) {
            if (!this.field5312.method1482(0, arg4, arg3)) {
                return null;
            }
            int var6 = arg0 ? 64 : 128;
            this.field5308 = this.field5312.method1481((double) arg2, 0, var6, var6, this.field5310, arg3, true, arg4);
            this.field5317 = arg2;
            if (this.field5318) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6];
                int[] var10 = new int[var6 * var6];
                int var11 = var6;
                int var12;
                int var13 = var12 = var6;
                int var15 = var6 - 1;
                int var16 = var6 * var6;
                int var17 = var6 - 1;
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var19 = var17; var19 >= 0; var19--) {
                        var12--;
                        int var20 = this.field5308[var12];
                        var7[var19] += class150.method1123(255, var20 >> 16);
                        var8[var19] += class150.method1123(var20, 65321) >> 8;
                        var9[var19] += class150.method1123(255, var20);
                    }
                    if (var12 == 0) {
                        var12 = var16;
                    }
                }
                int var21 = var16;
                for (int var22 = var15; var22 >= 0; var22--) {
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 0;
                    int var26 = 1;
                    int var27 = 1;
                    for (int var28 = 2; var28 >= 0; var28--) {
                        var27--;
                        var23 += var8[var27];
                        var25 += var7[var27];
                        var24 += var9[var27];
                        if (var27 == 0) {
                            var27 = var11;
                        }
                    }
                    for (int var29 = var17; var29 >= 0; var29--) {
                        var26--;
                        var27--;
                        int var30 = var25 / 9;
                        int var31 = var24 / 9;
                        int var32 = var23 / 9;
                        var21--;
                        var10[var21] = class100.method721(class100.method721(var30 << 16, var32 << 8), var31);
                        var24 += var9[var27] - var9[var26];
                        var23 += var8[var27] - var8[var26];
                        var25 += var7[var27] - var7[var26];
                        if (var27 == 0) {
                            var27 = var11;
                        }
                        if (var26 == 0) {
                            var26 = var11;
                        }
                    }
                    for (int var33 = var17; var33 >= 0; var33--) {
                        var12--;
                        int var34 = this.field5308[var12];
                        var13--;
                        int var35 = this.field5308[var13];
                        var7[var33] += (class150.method1123(16721709, var34) >> 16) - class150.method1123(var35 >> 16, 255);
                        var8[var33] += -(class150.method1123(65313, var35) >> 8) + (class150.method1123(65333, var34) >> 8);
                        var9[var33] += class150.method1123(255, var34) - class150.method1123(255, var35);
                    }
                    if (var12 == 0) {
                        var12 = var16;
                    }
                    if (var13 == 0) {
                        var13 = var16;
                    }
                }
                this.field5308 = var10;
            }
        }
        if (arg1 != 0) {
            this.field5302 = -22;
        }
        return this.field5308;
    }
}
