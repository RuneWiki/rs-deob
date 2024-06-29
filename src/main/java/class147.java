import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class147 extends class137 {

    @OriginalMember(owner = "client!mc", name = "L", descriptor = "Z")
    public boolean field2409 = false;

    @OriginalMember(owner = "client!mc", name = "T", descriptor = "I")
    private int field2417 = 0;

    @OriginalMember(owner = "client!mc", name = "R", descriptor = "I")
    private int field2415 = -1;

    @OriginalMember(owner = "client!mc", name = "W", descriptor = "Lla;")
    private class177 field2420;

    @OriginalMember(owner = "client!mc", name = "P", descriptor = "Z")
    private boolean field2413;

    @OriginalMember(owner = "client!mc", name = "y", descriptor = "Z")
    private boolean field2396;

    @OriginalMember(owner = "client!mc", name = "E", descriptor = "Z")
    private boolean field2402;

    @OriginalMember(owner = "client!mc", name = "M", descriptor = "Z")
    private boolean field2410;

    @OriginalMember(owner = "client!mc", name = "J", descriptor = "I")
    private int field2407;

    @OriginalMember(owner = "client!mc", name = "V", descriptor = "I")
    private int field2419;

    @OriginalMember(owner = "client!mc", name = "B", descriptor = "I")
    private int field2399;

    @OriginalMember(owner = "client!mc", name = "A", descriptor = "I")
    private int field2398;

    @OriginalMember(owner = "client!mc", name = "C", descriptor = "I")
    public static volatile int field2400 = -1;

    @OriginalMember(owner = "client!mc", name = "w", descriptor = "[I")
    public static int[] field2394 = new int[128];

    @OriginalMember(owner = "client!mc", name = "Q", descriptor = "Ltl;")
    public static class59 field2414 = class85.method639("welle:", 9588);

    @OriginalMember(owner = "client!mc", name = "N", descriptor = "F")
    private float field2411;

    @OriginalMember(owner = "client!mc", name = "v", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!mc", name = "x", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!mc", name = "F", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!mc", name = "H", descriptor = "I")
    private int field2405;

    @OriginalMember(owner = "client!mc", name = "I", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!mc", name = "K", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!mc", name = "O", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!mc", name = "S", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!mc", name = "U", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!mc", name = "z", descriptor = "[I")
    private int[] field2397;

    @OriginalMember(owner = "client!mc", name = "D", descriptor = "[I")
    public static int[] field2401;

    @OriginalMember(owner = "client!mc", name = "G", descriptor = "[Lma;")
    public static class263[] field2404;

    @OriginalMember(owner = "client!mc", name = "finalize", descriptor = "()V", line = 7)
    protected final void finalize() throws Throwable {
        field2412++;
        if (this.field2415 != -1) {
            class104.method785(this.field2415, this.field2417, this.field2405);
            this.field2415 = -1;
            this.field2417 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lwe;IFZLme;)[I", line = 28)
    public final int[] method1062(class54 arg0, int arg1, float arg2, boolean arg3, class295 arg4) {
        if (arg1 != -32471) {
            return (int[]) null;
        }
        field2418++;
        if (this.field2397 == null || this.field2411 != arg2) {
            if (!this.field2420.method1313(arg4, (byte) -116, arg0)) {
                return null;
            }
            int var6 = arg3 ? 64 : 128;
            this.field2397 = this.field2420.method1316(this.field2396, true, arg4, var6, var6, 119, (double) arg2, arg0);
            this.field2411 = arg2;
            if (this.field2413) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6];
                int[] var10 = new int[var6 * var6];
                int var11 = var6;
                int var12;
                int var13 = var12 = var6;
                int var14 = var6 - 1;
                int var16 = var6 - 1;
                int var17 = var6 * var6;
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var19 = var14; var19 >= 0; var19--) {
                        var12--;
                        int var20 = this.field2397[var12];
                        var7[var19] += class93.method680(16747039, var20) >> 16;
                        var8[var19] += class93.method680(var20, 65411) >> 8;
                        var9[var19] += class93.method680(var20, 255);
                    }
                    if (var12 == 0) {
                        var12 = var17;
                    }
                }
                int var21 = var17;
                for (int var22 = var16; var22 >= 0; var22--) {
                    int var23 = 1;
                    int var24 = 1;
                    int var25 = 0;
                    int var26 = 0;
                    int var27 = 0;
                    for (int var28 = 2; var28 >= 0; var28--) {
                        var23--;
                        var25 += var8[var23];
                        var27 += var7[var23];
                        var26 += var9[var23];
                        if (var23 == 0) {
                            var23 = var11;
                        }
                    }
                    for (int var29 = var14; var29 >= 0; var29--) {
                        int var30 = var25 / 9;
                        int var31 = var26 / 9;
                        int var32 = var27 / 9;
                        var24--;
                        var23--;
                        var21--;
                        var10[var21] = class239.method1677(var31, class239.method1677(var30 << 8, var32 << 16));
                        var26 += var9[var23] - var9[var24];
                        var25 += var8[var23] - var8[var24];
                        var27 += var7[var23] - var7[var24];
                        if (var24 == 0) {
                            var24 = var11;
                        }
                        if (var23 == 0) {
                            var23 = var11;
                        }
                    }
                    for (int var33 = var14; var33 >= 0; var33--) {
                        var13--;
                        int var34 = this.field2397[var13];
                        var12--;
                        int var35 = this.field2397[var12];
                        var7[var33] += -(class93.method680(16716380, var34) >> 16) + class93.method680(var35 >> 16, 255);
                        var8[var33] += -class93.method680(var34 >> 8, 255) + (class93.method680(65519, var35) >> 8);
                        var9[var33] += -class93.method680(255, var34) + class93.method680(255, var35);
                    }
                    if (var13 == 0) {
                        var13 = var17;
                    }
                    if (var12 == 0) {
                        var12 = var17;
                    }
                }
                this.field2397 = var10;
            }
        }
        return this.field2397;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IB)I", line = 189)
    public static final int method1063(int arg0, byte arg1) {
        field2395++;
        if (arg1 != 113) {
            field2416 = 17;
        }
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "(I)V", line = 204)
    public static void method1064(int arg0) {
        field2404 = null;
        field2401 = null;
        field2394 = null;
        field2414 = null;
        if (arg0 != 0) {
            field2414 = (class59) null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lme;ZBLwe;)[I", line = 220)
    public final int[] method1065(class295 arg0, boolean arg1, byte arg2, class54 arg3) {
        field2408++;
        if (this.field2420.method1313(arg0, (byte) -116, arg3)) {
            int var5 = 3 / ((-arg2 - 21) / 53);
            int var6 = arg1 ? 64 : 128;
            return this.field2420.method1316(this.field2396, false, arg0, var6, var6, 104, 1.0D, arg3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BI)V", line = 237)
    public final void method1066(byte arg0, int arg1) {
        field2406++;
        if (this.field2397 == null) {
            return;
        }
        if (this.field2419 != 0 || this.field2407 != 0) {
            if (class275.field4746 == null || this.field2397.length > class275.field4746.length) {
                class275.field4746 = new int[this.field2397.length];
            }
            int var3 = this.field2397.length == 4096 ? 64 : 128;
            int var4 = this.field2397.length;
            int var5 = var3 - 1;
            int var6 = this.field2407 * arg1;
            int var7 = arg1 * var3 * this.field2419;
            int var8 = var4 - 1;
            for (int var9 = 0; var9 < var4; var9 += var3) {
                int var10 = var8 & var7 + var9;
                for (int var11 = 0; var11 < var3; var11++) {
                    int var12 = var9 + var11;
                    int var13 = (var5 & var6 + var11) + var10;
                    class275.field4746[var12] = this.field2397[var13];
                }
            }
            int[] var14 = this.field2397;
            this.field2397 = class275.field4746;
            class275.field4746 = var14;
        }
        if (arg0 < 80) {
            this.field2411 = 0.2769518F;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZLwe;BLme;)Z", line = 299)
    public final boolean method1067(boolean arg0, class54 arg1, byte arg2, class295 arg3) {
        field2403++;
        if (!this.field2420.method1313(arg3, (byte) -116, arg1)) {
            return false;
        }
        GL var5 = class55.field812;
        int var6 = arg0 ? 64 : 128;
        int var7 = class149.method1078((byte) -119);
        if ((var7 & 0x1) == 0) {
            if (this.field2415 == -1) {
                int[] var8 = new int[1];
                var5.glGenTextures(1, var8, 0);
                this.field2405 = class104.field1712;
                this.field2415 = var8[0];
                class55.method407(this.field2415);
                ByteBuffer var9 = ByteBuffer.wrap(this.field2420.method1312(var6, arg3, arg1, var6, this.field2396, 127, 0.7D));
                if (this.field2398 == 2) {
                    GLU var10 = new GLU();
                    var10.gluBuild2DMipmaps(3553, 6408, var6, var6, 6408, 5121, var9);
                    var5.glTexParameteri(3553, 10241, 9987);
                    var5.glTexParameteri(3553, 10240, 9729);
                    class104.field1711 += var9.limit() * 4 / 3 - this.field2417;
                    this.field2417 = var9.limit() * 4 / 3;
                } else if (this.field2398 == 1) {
                    int var11 = 0;
                    while (true) {
                        var5.glTexImage2D(3553, var11++, 6408, var6, var6, 0, 6408, 5121, var9);
                        var6 >>= 0x1;
                        if (var6 == 0) {
                            var5.glTexParameteri(3553, 10241, 9987);
                            var5.glTexParameteri(3553, 10240, 9729);
                            class104.field1711 += var9.limit() * 4 / 3 - this.field2417;
                            this.field2417 = var9.limit() * 4 / 3;
                            break;
                        }
                        var9 = ByteBuffer.wrap(this.field2420.method1312(var6, arg3, arg1, var6, this.field2396, -102, 0.7D));
                    }
                } else {
                    var5.glTexImage2D(3553, 0, 6408, var6, var6, 0, 6408, 5121, var9);
                    var5.glTexParameteri(3553, 10241, 9729);
                    var5.glTexParameteri(3553, 10240, 9729);
                    class104.field1711 += var9.limit() - this.field2417;
                    this.field2417 = var9.limit();
                }
                var5.glTexParameteri(3553, 10242, this.field2402 ? 10497 : 33071);
                var5.glTexParameteri(3553, 10243, this.field2410 ? 10497 : 33071);
            } else {
                class55.method407(this.field2415);
            }
        }
        if (arg2 >= -30) {
            return false;
        }
        if ((var7 & 0x2) == 0) {
            class55.method386(this.field2399);
        }
        if ((var7 & 0x4) == 0) {
            class55.method405(0);
        }
        if ((var7 & 0x8) == 0) {
            if (this.field2419 == 0 && this.field2407 == 0) {
                class55.method414();
            } else {
                float var12 = (float) (class55.field821 * this.field2407) / (float) var6;
                float var13 = (float) (class55.field821 * this.field2419) / (float) var6;
                class55.method395(var12, var13, 0.0F);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lwe;BLme;)Z", line = 405)
    public final boolean method1068(class54 arg0, byte arg1, class295 arg2) {
        field2393++;
        if (arg1 != -94) {
            this.field2411 = -0.23052292F;
        }
        return this.field2420.method1313(arg2, (byte) -116, arg0);
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Ls;)V", line = 464)
    public class147(class170 arg0) {
        this.field2420 = new class177(arg0);
        this.field2413 = arg0.method1221(101) == 1;
        this.field2396 = arg0.method1221(79) == 1;
        this.field2402 = arg0.method1221(85) == 1;
        this.field2410 = arg0.method1221(104) == 1;
        int var2 = arg0.method1221(79) & 0x3;
        this.field2407 = arg0.method1205(-1);
        this.field2419 = arg0.method1205(-1);
        int var3 = arg0.method1221(72);
        arg0.method1221(81);
        if (var2 == 1) {
            this.field2399 = 2;
        } else if (var2 == 2) {
            this.field2399 = 3;
        } else if (var2 == 3) {
            this.field2399 = 4;
        } else {
            this.field2399 = 0;
        }
        this.field2398 = (var3 & 0xF5) >> 4;
    }
}
