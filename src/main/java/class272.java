import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class272 extends class86 {

    @OriginalMember(owner = "client!w", name = "u", descriptor = "I")
    private int field4100 = -1;

    @OriginalMember(owner = "client!w", name = "x", descriptor = "Z")
    public boolean field4103 = false;

    @OriginalMember(owner = "client!w", name = "w", descriptor = "I")
    private int field4102 = 0;

    @OriginalMember(owner = "client!w", name = "H", descriptor = "Lij;")
    private class83 field4113;

    @OriginalMember(owner = "client!w", name = "O", descriptor = "Z")
    private boolean field4120;

    @OriginalMember(owner = "client!w", name = "B", descriptor = "Z")
    private boolean field4107;

    @OriginalMember(owner = "client!w", name = "A", descriptor = "Z")
    private boolean field4106;

    @OriginalMember(owner = "client!w", name = "F", descriptor = "Z")
    private boolean field4111;

    @OriginalMember(owner = "client!w", name = "I", descriptor = "I")
    private int field4114;

    @OriginalMember(owner = "client!w", name = "P", descriptor = "I")
    private int field4121;

    @OriginalMember(owner = "client!w", name = "S", descriptor = "I")
    private int field4124;

    @OriginalMember(owner = "client!w", name = "y", descriptor = "I")
    private int field4104;

    @OriginalMember(owner = "client!w", name = "E", descriptor = "[B")
    public static byte[] field4110 = new byte[32896];

    @OriginalMember(owner = "client!w", name = "J", descriptor = "S")
    public static short field4115;

    @OriginalMember(owner = "client!w", name = "N", descriptor = "Ljava/lang/String;")
    public static String field4119;

    @OriginalMember(owner = "client!w", name = "Q", descriptor = "[Le;")
    public static class160[] field4122;

    @OriginalMember(owner = "client!w", name = "C", descriptor = "F")
    private float field4108;

    @OriginalMember(owner = "client!w", name = "t", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!w", name = "z", descriptor = "I")
    private int field4105;

    @OriginalMember(owner = "client!w", name = "D", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!w", name = "G", descriptor = "I")
    public static int field4112;

    @OriginalMember(owner = "client!w", name = "K", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!w", name = "L", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!w", name = "R", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!w", name = "T", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!w", name = "U", descriptor = "[I")
    private int[] field4126;

    @OriginalMember(owner = "client!w", name = "M", descriptor = "[[[B")
    public static byte[][][] field4118;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ILba;)V", line = 11)
    public static final void method1889(int arg0, class167 arg1) {
        if (arg0 != 1) {
            method1889(-30, (class167) null);
        }
        class305.method2129(arg1, 200000, (byte) 125);
        field4116++;
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lhb;)V", line = 615)
    public class272(class35 arg0) {
        this.field4113 = new class83(arg0);
        this.field4120 = arg0.method273(65280) == 1;
        this.field4107 = arg0.method273(65280) == 1;
        this.field4106 = arg0.method273(65280) == 1;
        this.field4111 = arg0.method273(65280) == 1;
        int var2 = arg0.method273(65280) & 0x3;
        this.field4114 = arg0.method242((byte) -93);
        this.field4121 = arg0.method242((byte) -93);
        int var3 = arg0.method273(65280);
        arg0.method273(65280);
        if (var2 == 1) {
            this.field4124 = 2;
        } else if (var2 == 2) {
            this.field4124 = 3;
        } else if (var2 == 3) {
            this.field4124 = 4;
        } else {
            this.field4124 = 0;
        }
        this.field4104 = (var3 & 0xFC) >> 4;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V", line = 32)
    public static void method1890(int arg0) {
        if (arg0 != 64) {
            field4110 = (byte[]) null;
        }
        field4119 = null;
        field4110 = null;
        field4122 = null;
        field4118 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Ltk;ZBLlb;)[I", line = 45)
    public final int[] method1891(class251 arg0, boolean arg1, byte arg2, class211 arg3) {
        field4112++;
        if (this.field4113.method680(arg0, true, arg3)) {
            int var5 = -8 / ((arg2 - 24) / 42);
            int var6 = arg1 ? 64 : 128;
            return this.field4113.method685(var6, false, -24, 1.0D, arg3, var6, this.field4107, arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(BLtk;Llb;Z)Z", line = 65)
    public final boolean method1892(byte arg0, class251 arg1, class211 arg2, boolean arg3) {
        field4099++;
        if (!this.field4113.method680(arg1, true, arg2)) {
            return false;
        }
        GL var5 = class36.field518;
        int var6 = arg3 ? 64 : 128;
        if (arg0 <= 18) {
            this.field4104 = -115;
        }
        int var7 = class110.method874((byte) -110);
        if ((var7 & 0x1) == 0) {
            if (this.field4100 == -1) {
                int[] var8 = new int[1];
                var5.glGenTextures(1, var8, 0);
                this.field4105 = class166.field2498;
                this.field4100 = var8[0];
                class36.method310(this.field4100);
                ByteBuffer var9 = ByteBuffer.wrap(this.field4113.method687(var6, arg1, (byte) 111, this.field4107, var6, 0.7D, arg2));
                if (this.field4104 == 2) {
                    GLU var10 = new GLU();
                    var10.gluBuild2DMipmaps(3553, 6408, var6, var6, 6408, 5121, var9);
                    var5.glTexParameteri(3553, 10241, 9987);
                    var5.glTexParameteri(3553, 10240, 9729);
                    class166.field2499 += var9.limit() * 4 / 3 - this.field4102;
                    this.field4102 = var9.limit() * 4 / 3;
                } else if (this.field4104 == 1) {
                    int var11 = 0;
                    while (true) {
                        var5.glTexImage2D(3553, var11++, 6408, var6, var6, 0, 6408, 5121, var9);
                        var6 >>= 0x1;
                        if (var6 == 0) {
                            var5.glTexParameteri(3553, 10241, 9987);
                            var5.glTexParameteri(3553, 10240, 9729);
                            class166.field2499 += var9.limit() * 4 / 3 - this.field4102;
                            this.field4102 = var9.limit() * 4 / 3;
                            break;
                        }
                        var9 = ByteBuffer.wrap(this.field4113.method687(var6, arg1, (byte) 119, this.field4107, var6, 0.7D, arg2));
                    }
                } else {
                    var5.glTexImage2D(3553, 0, 6408, var6, var6, 0, 6408, 5121, var9);
                    var5.glTexParameteri(3553, 10241, 9729);
                    var5.glTexParameteri(3553, 10240, 9729);
                    class166.field2499 += var9.limit() - this.field4102;
                    this.field4102 = var9.limit();
                }
                var5.glTexParameteri(3553, 10242, this.field4106 ? 10497 : 33071);
                var5.glTexParameteri(3553, 10243, this.field4111 ? 10497 : 33071);
            } else {
                class36.method310(this.field4100);
            }
        }
        if ((var7 & 0x2) == 0) {
            class36.method313(this.field4124);
        }
        if ((var7 & 0x4) == 0) {
            class36.method314(0);
        }
        if ((var7 & 0x8) == 0) {
            if (this.field4121 == 0 && this.field4114 == 0) {
                class36.method320();
            } else {
                float var12 = (float) (class36.field514 * this.field4121) / (float) var6;
                float var13 = (float) (class36.field514 * this.field4114) / (float) var6;
                class36.method322(var13, var12, 0.0F);
            }
        }
        return true;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field4110[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field4115 = 320;
        field4119 = "Choose Option";
        field4122 = new class160[14];
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(FILtk;ZLlb;)[I", line = 213)
    public final int[] method1893(float arg0, int arg1, class251 arg2, boolean arg3, class211 arg4) {
        int var6 = 123 % ((80 - arg1) / 38);
        field4101++;
        if (this.field4126 == null || this.field4108 != arg0) {
            if (!this.field4113.method680(arg2, true, arg4)) {
                return null;
            }
            int var7 = arg3 ? 64 : 128;
            this.field4126 = this.field4113.method685(var7, true, -102, (double) arg0, arg4, var7, this.field4107, arg2);
            this.field4108 = arg0;
            if (this.field4120) {
                int[] var8 = new int[var7];
                int[] var9 = new int[var7];
                int[] var10 = new int[var7];
                int[] var11 = new int[var7 * var7];
                int var12 = var7;
                int var13;
                int var14 = var13 = var7;
                int var16 = var7 - 1;
                int var17 = var7 - 1;
                int var18 = var7 * var7;
                for (int var19 = 2; var19 >= 0; var19--) {
                    for (int var20 = var16; var20 >= 0; var20--) {
                        var13--;
                        int var21 = this.field4126[var13];
                        var8[var20] += class142.method1078(255, var21 >> 16);
                        var10[var20] += class142.method1078(255, var21 >> 8);
                        var9[var20] += class142.method1078(var21, 255);
                    }
                    if (var13 == 0) {
                        var13 = var18;
                    }
                }
                int var22 = var18;
                for (int var23 = var17; var23 >= 0; var23--) {
                    int var24 = 0;
                    int var25 = 0;
                    int var26 = 0;
                    int var27 = 1;
                    int var28 = 1;
                    for (int var29 = 2; var29 >= 0; var29--) {
                        var28--;
                        var25 += var9[var28];
                        var24 += var10[var28];
                        var26 += var8[var28];
                        if (var28 == 0) {
                            var28 = var12;
                        }
                    }
                    for (int var30 = var16; var30 >= 0; var30--) {
                        int var31 = var24 / 9;
                        var27--;
                        var28--;
                        int var32 = var26 / 9;
                        int var33 = var25 / 9;
                        var22--;
                        var11[var22] = class147.method1098(var33, class147.method1098(var32 << 16, var31 << 8));
                        var26 += var8[var28] - var8[var27];
                        var25 += var9[var28] - var9[var27];
                        var24 += var10[var28] - var10[var27];
                        if (var27 == 0) {
                            var27 = var12;
                        }
                        if (var28 == 0) {
                            var28 = var12;
                        }
                    }
                    for (int var34 = var16; var34 >= 0; var34--) {
                        var14--;
                        int var35 = this.field4126[var14];
                        var13--;
                        int var36 = this.field4126[var13];
                        var8[var34] += -(class142.method1078(16734857, var35) >> 16) + class142.method1078(var36 >> 16, 255);
                        var10[var34] += -class142.method1078(var35 >> 8, 255) + (class142.method1078(var36, 65428) >> 8);
                        var9[var34] += -class142.method1078(var35, 255) + class142.method1078(255, var36);
                    }
                    if (var14 == 0) {
                        var14 = var18;
                    }
                    if (var13 == 0) {
                        var13 = var18;
                    }
                }
                this.field4126 = var11;
            }
        }
        return this.field4126;
    }

    @OriginalMember(owner = "client!w", name = "finalize", descriptor = "()V", line = 380)
    protected final void finalize() throws Throwable {
        field4125++;
        if (this.field4100 != -1) {
            class166.method1219(this.field4100, this.field4102, this.field4105);
            this.field4100 = -1;
            this.field4102 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(BLlb;Ltk;)Z", line = 395)
    public final boolean method1894(byte arg0, class211 arg1, class251 arg2) {
        if (arg0 != -65) {
            method1890(15);
        }
        field4117++;
        return this.field4113.method680(arg2, true, arg1);
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(IB)V", line = 407)
    public final void method1895(int arg0, byte arg1) {
        field4109++;
        if (this.field4126 == null) {
            return;
        }
        if (this.field4121 != 0 || this.field4114 != 0) {
            if (class184.field2919 == null || this.field4126.length > class184.field2919.length) {
                class184.field2919 = new int[this.field4126.length];
            }
            int var3 = this.field4126.length;
            int var4 = this.field4126.length == 4096 ? 64 : 128;
            int var5 = this.field4114 * arg0;
            int var6 = var4 - 1;
            int var7 = arg0 * var4 * this.field4121;
            int var8 = var3 - 1;
            for (int var9 = 0; var9 < var3; var9 += var4) {
                int var10 = var8 & var7 + var9;
                for (int var11 = 0; var11 < var4; var11++) {
                    int var12 = var9 + var11;
                    int var13 = (var5 + var11 & var6) + var10;
                    class184.field2919[var12] = this.field4126[var13];
                }
            }
            int[] var14 = this.field4126;
            this.field4126 = class184.field2919;
            class184.field2919 = var14;
        }
        if (arg1 != 9) {
            this.field4120 = true;
        }
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V", line = 485)
    public static final void method1896(int arg0) {
        for (int var1 = 0; var1 < class111.field1754; var1++) {
            int var10002 = class15.field179[var1]--;
            if (class15.field179[var1] >= -10) {
                class229 var2 = class302.field4721[var1];
                if (var2 == null) {
                    var2 = class229.method1627(class232.field3582, class54.field817[var1], 0);
                    if (var2 == null) {
                        continue;
                    }
                    class15.field179[var1] += var2.method1625();
                    class302.field4721[var1] = var2;
                }
                if (class15.field179[var1] < 0) {
                    int var3;
                    if (class133.field2096[var1] == 0) {
                        var3 = class261.field3874;
                    } else {
                        int var4 = class133.field2096[var1] >> 16 & 0xFF;
                        int var5 = (class133.field2096[var1] & 0xFF) * 128;
                        int var6 = var4 * 128 + 64 - class235.field3602.field4507;
                        int var7 = (class133.field2096[var1] & 0xFFCA) >> 8;
                        int var8 = var7 * 128 + 64 - class235.field3602.field4496;
                        if (var6 < 0) {
                            var6 = -var6;
                        }
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var6 + var8 - 128;
                        if (var9 > var5) {
                            class15.field179[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var3 = (var5 - var9) * class238.field3618 / var5;
                    }
                    if (var3 > 0) {
                        class259 var10 = var2.method1624().method1798(class293.field4599);
                        class82 var11 = class82.method671(var10, 100, var3);
                        var11.method639(class142.field2199[var1] - 1);
                        class200.field3165.method2156(var11);
                    }
                    class15.field179[var1] = -100;
                }
            } else {
                class111.field1754--;
                for (int var12 = var1; var12 < class111.field1754; var12++) {
                    class54.field817[var12] = class54.field817[var12 + 1];
                    class302.field4721[var12] = class302.field4721[var12 + 1];
                    class142.field2199[var12] = class142.field2199[var12 + 1];
                    class15.field179[var12] = class15.field179[var12 + 1];
                    class133.field2096[var12] = class133.field2096[var12 + 1];
                }
                var1--;
            }
        }
        field4123++;
        if (class213.field3386 && !class59.method527((byte) 127)) {
            if (class170.field2536 != 0 && class287.field4422 != -1) {
                class197.method1435(class287.field4422, class178.field2663, class170.field2536, 0, false, 20140);
            }
            class213.field3386 = false;
        } else if (class170.field2536 != 0 && class287.field4422 != -1 && !class59.method527((byte) 75)) {
            class159.field2372.method59(129, (byte) 73);
            class159.field2372.method259(-15195, class287.field4422);
            class278.field4266++;
            class287.field4422 = -1;
        }
        if (arg0 != 1645664360) {
            method1890(-54);
        }
    }
}
