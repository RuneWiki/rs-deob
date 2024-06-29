import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class19 extends class95 {

    @OriginalMember(owner = "client!ga", name = "V", descriptor = "I")
    private int field275 = -1;

    @OriginalMember(owner = "client!ga", name = "gb", descriptor = "Z")
    public boolean field285 = false;

    @OriginalMember(owner = "client!ga", name = "fb", descriptor = "I")
    private int field284 = 0;

    @OriginalMember(owner = "client!ga", name = "ab", descriptor = "Lre;")
    private class281 field279;

    @OriginalMember(owner = "client!ga", name = "X", descriptor = "Z")
    private boolean field276;

    @OriginalMember(owner = "client!ga", name = "jb", descriptor = "Z")
    private boolean field288;

    @OriginalMember(owner = "client!ga", name = "bb", descriptor = "Z")
    private boolean field280;

    @OriginalMember(owner = "client!ga", name = "L", descriptor = "Z")
    private boolean field265;

    @OriginalMember(owner = "client!ga", name = "I", descriptor = "I")
    private int field263;

    @OriginalMember(owner = "client!ga", name = "kb", descriptor = "I")
    private int field289;

    @OriginalMember(owner = "client!ga", name = "ib", descriptor = "I")
    private int field287;

    @OriginalMember(owner = "client!ga", name = "S", descriptor = "I")
    private int field272;

    @OriginalMember(owner = "client!ga", name = "M", descriptor = "J")
    public static long field266 = 0L;

    @OriginalMember(owner = "client!ga", name = "cb", descriptor = "Z")
    public static boolean field281 = false;

    @OriginalMember(owner = "client!ga", name = "J", descriptor = "Lsf;")
    public static class108 field264 = class140.method973(255, ")3runescape)3com)4l=");

    @OriginalMember(owner = "client!ga", name = "U", descriptor = "I")
    public static volatile int field274 = 0;

    @OriginalMember(owner = "client!ga", name = "Z", descriptor = "Lsf;")
    private static class108 field278 = class140.method973(255, " is already on your ignore list)3");

    @OriginalMember(owner = "client!ga", name = "hb", descriptor = "Lsf;")
    public static class108 field286 = field278;

    @OriginalMember(owner = "client!ga", name = "Y", descriptor = "F")
    private float field277;

    @OriginalMember(owner = "client!ga", name = "H", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!ga", name = "N", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!ga", name = "O", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!ga", name = "P", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!ga", name = "Q", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!ga", name = "T", descriptor = "I")
    private int field273;

    @OriginalMember(owner = "client!ga", name = "eb", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!ga", name = "lb", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!ga", name = "mb", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!ga", name = "nb", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!ga", name = "R", descriptor = "[I")
    private int[] field271;

    @OriginalMember(owner = "client!ga", name = "db", descriptor = "[I")
    public static int[] field282;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILfj;ZLik;)[I", line = 7)
    public final int[] method126(int arg0, class243 arg1, boolean arg2, class262 arg3) {
        field290++;
        if (arg0 != -10038) {
            return (int[]) null;
        } else if (this.field279.method2019(arg1, arg3, 0)) {
            int var5 = arg2 ? 64 : 128;
            return this.field279.method2026(1.0D, false, (byte) 3, this.field288, var5, arg1, arg3, var5);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lfj;BLik;)Z", line = 42)
    public final boolean method127(class243 arg0, byte arg1, class262 arg2) {
        int var4 = -83 % ((arg1 - 50) / 59);
        field270++;
        return this.field279.method2019(arg0, arg2, 0);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)I", line = 58)
    public static final int method128(int arg0, int arg1, int arg2) {
        if (arg1 != 128) {
            method128(82, -16, -73);
        }
        field262++;
        if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg2 & 0x7F) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lik;Lik;I)I", line = 92)
    public static final int method129(class262 arg0, class262 arg1, int arg2) {
        field292++;
        int var3 = -106 / ((60 - arg2) / 63);
        int var4 = 0;
        if (arg0.method1861(class147.field2637, 126)) {
            var4++;
        }
        if (arg0.method1861(class72.field1091, 110)) {
            var4++;
        }
        if (arg0.method1861(class175.field3190, 121)) {
            var4++;
        }
        if (arg1.method1861(class147.field2637, 111)) {
            var4++;
        }
        if (arg1.method1861(class72.field1091, 107)) {
            var4++;
        }
        if (arg1.method1861(class175.field3190, 109)) {
            var4++;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lrm;)V", line = 531)
    public class19(class249 arg0) {
        this.field279 = new class281(arg0);
        this.field276 = arg0.method1731(true) == 1;
        this.field288 = arg0.method1731(true) == 1;
        this.field280 = arg0.method1731(true) == 1;
        this.field265 = arg0.method1731(true) == 1;
        int var2 = arg0.method1731(true) & 0x3;
        this.field263 = arg0.method1721((byte) 78);
        this.field289 = arg0.method1721((byte) 44);
        int var3 = arg0.method1731(true);
        arg0.method1731(true);
        if (var2 == 1) {
            this.field287 = 2;
        } else if (var2 == 2) {
            this.field287 = 3;
        } else if (var2 == 3) {
            this.field287 = 4;
        } else {
            this.field287 = 0;
        }
        this.field272 = var3 >> 4 & 0xF;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lfj;ZFBLik;)[I", line = 139)
    public final int[] method130(class243 arg0, boolean arg1, float arg2, byte arg3, class262 arg4) {
        field291++;
        if (arg3 != -19) {
            this.method130((class243) null, false, -1.1380236F, (byte) 32, (class262) null);
        }
        if (this.field271 == null || this.field277 != arg2) {
            if (!this.field279.method2019(arg0, arg4, 0)) {
                return null;
            }
            int var6 = arg1 ? 64 : 128;
            this.field271 = this.field279.method2026((double) arg2, true, (byte) 3, this.field288, var6, arg0, arg4, var6);
            this.field277 = arg2;
            if (this.field276) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6 * var6];
                int[] var10 = new int[var6];
                int var11 = var6;
                int var12;
                int var13 = var12 = var6;
                int var14 = var6 - 1;
                int var16 = var6 - 1;
                int var17 = var6 * var6;
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var19 = var14; var19 >= 0; var19--) {
                        var12--;
                        int var20 = this.field271[var12];
                        var7[var19] += class162.method1118(var20 >> 16, 255);
                        var10[var19] += class162.method1118(65532, var20) >> 8;
                        var8[var19] += class162.method1118(var20, 255);
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
                        var27 += var7[var23];
                        var25 += var10[var23];
                        var26 += var8[var23];
                        if (var23 == 0) {
                            var23 = var11;
                        }
                    }
                    for (int var29 = var14; var29 >= 0; var29--) {
                        var23--;
                        var24--;
                        int var30 = var27 / 9;
                        int var31 = var26 / 9;
                        int var32 = var25 / 9;
                        var21--;
                        var9[var21] = class242.method1674(class242.method1674(var30 << 16, var32 << 8), var31);
                        var26 += var8[var23] - var8[var24];
                        var27 += var7[var23] - var7[var24];
                        var25 += var10[var23] - var10[var24];
                        if (var23 == 0) {
                            var23 = var11;
                        }
                        if (var24 == 0) {
                            var24 = var11;
                        }
                    }
                    for (int var33 = var14; var33 >= 0; var33--) {
                        var12--;
                        int var34 = this.field271[var12];
                        var13--;
                        int var35 = this.field271[var13];
                        var7[var33] += -(class162.method1118(var35, 16758002) >> 16) + (class162.method1118(16742718, var34) >> 16);
                        var10[var33] += -(class162.method1118(var35, 65376) >> 8) + class162.method1118(255, var34 >> 8);
                        var8[var33] += -class162.method1118(255, var35) + class162.method1118(var34, 255);
                    }
                    if (var12 == 0) {
                        var12 = var17;
                    }
                    if (var13 == 0) {
                        var13 = var17;
                    }
                }
                this.field271 = var9;
            }
        }
        return this.field271;
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "(B)V", line = 317)
    public static void method131(byte arg0) {
        field264 = null;
        field282 = null;
        if (arg0 >= -119) {
            field274 = 6;
        }
        field286 = null;
        field278 = null;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lik;BLfj;Z)Z", line = 330)
    public final boolean method132(class262 arg0, byte arg1, class243 arg2, boolean arg3) {
        field267++;
        if (!this.field279.method2019(arg2, arg0, 0)) {
            return false;
        }
        GL var5 = class231.field4052;
        int var6 = class81.method547(true);
        if (arg1 > -52) {
            method129((class262) null, (class262) null, -15);
        }
        int var7 = arg3 ? 64 : 128;
        if ((var6 & 0x1) == 0) {
            if (this.field275 == -1) {
                int[] var8 = new int[1];
                var5.glGenTextures(1, var8, 0);
                this.field273 = class124.field2099;
                this.field275 = var8[0];
                class231.method1597(this.field275);
                ByteBuffer var9 = ByteBuffer.wrap(this.field279.method2021(0.7D, this.field288, -126, arg0, arg2, var7, var7));
                if (this.field272 == 2) {
                    GLU var11 = new GLU();
                    var11.gluBuild2DMipmaps(3553, 6408, var7, var7, 6408, 5121, var9);
                    var5.glTexParameteri(3553, 10241, 9987);
                    var5.glTexParameteri(3553, 10240, 9729);
                    class124.field2103 += var9.limit() * 4 / 3 - this.field284;
                    this.field284 = var9.limit() * 4 / 3;
                } else if (this.field272 == 1) {
                    int var10 = 0;
                    while (true) {
                        var5.glTexImage2D(3553, var10++, 6408, var7, var7, 0, 6408, 5121, var9);
                        var7 >>= 0x1;
                        if (var7 == 0) {
                            var5.glTexParameteri(3553, 10241, 9987);
                            var5.glTexParameteri(3553, 10240, 9729);
                            class124.field2103 += var9.limit() * 4 / 3 - this.field284;
                            this.field284 = var9.limit() * 4 / 3;
                            break;
                        }
                        var9 = ByteBuffer.wrap(this.field279.method2021(0.7D, this.field288, -128, arg0, arg2, var7, var7));
                    }
                } else {
                    var5.glTexImage2D(3553, 0, 6408, var7, var7, 0, 6408, 5121, var9);
                    var5.glTexParameteri(3553, 10241, 9729);
                    var5.glTexParameteri(3553, 10240, 9729);
                    class124.field2103 += var9.limit() - this.field284;
                    this.field284 = var9.limit();
                }
                var5.glTexParameteri(3553, 10242, this.field280 ? 10497 : 33071);
                var5.glTexParameteri(3553, 10243, this.field265 ? 10497 : 33071);
            } else {
                class231.method1597(this.field275);
            }
        }
        if ((var6 & 0x2) == 0) {
            class231.method1589(this.field287);
        }
        if ((var6 & 0x4) == 0) {
            class231.method1572(0);
        }
        if ((var6 & 0x8) == 0) {
            if (this.field289 == 0 && this.field263 == 0) {
                class231.method1580();
            } else {
                float var12 = (float) (class231.field4050 * this.field289) / (float) var7;
                float var13 = (float) (class231.field4050 * this.field263) / (float) var7;
                class231.method1584(var13, var12, 0.0F);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ga", name = "finalize", descriptor = "()V", line = 440)
    protected final void finalize() throws Throwable {
        field268++;
        if (this.field275 != -1) {
            class124.method864(this.field275, this.field284, this.field273);
            this.field275 = -1;
            this.field284 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(II)V", line = 466)
    public final void method133(int arg0, int arg1) {
        int var3 = -8 / ((-arg1 - 67) / 51);
        field269++;
        if (this.field271 == null || this.field289 == 0 && this.field263 == 0) {
            return;
        }
        if (class13.field142 == null || this.field271.length > class13.field142.length) {
            class13.field142 = new int[this.field271.length];
        }
        int var4 = this.field271.length == 4096 ? 64 : 128;
        int var5 = this.field271.length;
        int var6 = this.field263 * arg0;
        int var7 = var4 - 1;
        int var8 = this.field289 * arg0 * var4;
        int var9 = var5 - 1;
        for (int var10 = 0; var10 < var5; var10 += var4) {
            int var11 = var8 + var10 & var9;
            for (int var12 = 0; var12 < var4; var12++) {
                int var13 = var10 + var12;
                int var14 = (var6 + var12 & var7) + var11;
                class13.field142[var13] = this.field271[var14];
            }
        }
        int[] var15 = this.field271;
        this.field271 = class13.field142;
        class13.field142 = var15;
    }
}
