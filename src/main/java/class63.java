import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class63 extends class282 {

    @OriginalMember(owner = "client!bk", name = "V", descriptor = "I")
    private int field1073 = 0;

    @OriginalMember(owner = "client!bk", name = "T", descriptor = "Z")
    public boolean field1071 = false;

    @OriginalMember(owner = "client!bk", name = "sb", descriptor = "I")
    private int field1096 = -1;

    @OriginalMember(owner = "client!bk", name = "lb", descriptor = "Lgl;")
    private class193 field1089;

    @OriginalMember(owner = "client!bk", name = "qb", descriptor = "Z")
    private boolean field1094;

    @OriginalMember(owner = "client!bk", name = "O", descriptor = "Z")
    private boolean field1066;

    @OriginalMember(owner = "client!bk", name = "Y", descriptor = "Z")
    private boolean field1076;

    @OriginalMember(owner = "client!bk", name = "Z", descriptor = "Z")
    private boolean field1077;

    @OriginalMember(owner = "client!bk", name = "R", descriptor = "I")
    private int field1069;

    @OriginalMember(owner = "client!bk", name = "N", descriptor = "I")
    private int field1065;

    @OriginalMember(owner = "client!bk", name = "bb", descriptor = "I")
    private int field1079;

    @OriginalMember(owner = "client!bk", name = "ob", descriptor = "I")
    private int field1092;

    @OriginalMember(owner = "client!bk", name = "U", descriptor = "I")
    public static int field1072 = 0;

    @OriginalMember(owner = "client!bk", name = "jb", descriptor = "Ljf;")
    public static class229 field1087 = class212.method1457((byte) 103, "<col=ffb000>");

    @OriginalMember(owner = "client!bk", name = "fb", descriptor = "[S")
    public static short[] field1083 = new short[256];

    @OriginalMember(owner = "client!bk", name = "hb", descriptor = "I")
    public static int field1085 = -1;

    @OriginalMember(owner = "client!bk", name = "nb", descriptor = "I")
    public static int field1091 = -1;

    @OriginalMember(owner = "client!bk", name = "kb", descriptor = "Ljf;")
    public static class229 field1088 = class212.method1457((byte) 77, "(U4");

    @OriginalMember(owner = "client!bk", name = "gb", descriptor = "I")
    public static int field1084 = 20;

    @OriginalMember(owner = "client!bk", name = "X", descriptor = "Ljf;")
    public static class229 field1075 = class212.method1457((byte) 85, "Fps:");

    @OriginalMember(owner = "client!bk", name = "Q", descriptor = "F")
    private float field1068;

    @OriginalMember(owner = "client!bk", name = "M", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!bk", name = "P", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!bk", name = "S", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!bk", name = "W", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!bk", name = "ab", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!bk", name = "db", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!bk", name = "eb", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!bk", name = "ib", descriptor = "I")
    private int field1086;

    @OriginalMember(owner = "client!bk", name = "mb", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!bk", name = "pb", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!bk", name = "rb", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!bk", name = "cb", descriptor = "[I")
    private int[] field1080;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(FBLek;Lwj;Z)[I", line = 10)
    public final int[] method468(float arg0, byte arg1, class185 arg2, class219 arg3, boolean arg4) {
        if (arg1 != -55) {
            field1083 = (short[]) null;
        }
        field1095++;
        if (this.field1080 == null || this.field1068 != arg0) {
            if (!this.field1089.method1317(arg3, arg2, true)) {
                return null;
            }
            int var6 = arg4 ? 64 : 128;
            this.field1080 = this.field1089.method1322(arg2, this.field1066, true, var6, arg1 ^ 0xFFFFA291, arg3, var6, (double) arg0);
            this.field1068 = arg0;
            if (this.field1094) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6 * var6];
                int[] var10 = new int[var6];
                int var11 = var6;
                int var12;
                int var13 = var12 = var6;
                int var15 = var6 - 1;
                int var16 = var6 * var6;
                int var17 = var6 - 1;
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var19 = var17; var19 >= 0; var19--) {
                        var12--;
                        int var20 = this.field1080[var12];
                        var8[var19] += class305.method2086(var20, 16753208) >> 16;
                        var7[var19] += class305.method2086(var20 >> 8, 255);
                        var10[var19] += class305.method2086(255, var20);
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
                    for (int var27 = 2; var27 >= 0; var27--) {
                        var26--;
                        var23 += var7[var26];
                        var24 += var10[var26];
                        var25 += var8[var26];
                        if (var26 == 0) {
                            var26 = var11;
                        }
                    }
                    int var28 = 1;
                    for (int var29 = var17; var29 >= 0; var29--) {
                        int var30 = var24 / 9;
                        var28--;
                        var26--;
                        int var31 = var23 / 9;
                        int var32 = var25 / 9;
                        var21--;
                        var9[var21] = class97.method665(class97.method665(var32 << 16, var31 << 8), var30);
                        var25 += var8[var26] - var8[var28];
                        var23 += var7[var26] - var7[var28];
                        var24 += var10[var26] - var10[var28];
                        if (var28 == 0) {
                            var28 = var11;
                        }
                        if (var26 == 0) {
                            var26 = var11;
                        }
                    }
                    for (int var33 = var17; var33 >= 0; var33--) {
                        var13--;
                        int var34 = this.field1080[var13];
                        var12--;
                        int var35 = this.field1080[var12];
                        var8[var33] += (class305.method2086(var35, 16771985) >> 16) - (class305.method2086(16734948, var34) >> 16);
                        var7[var33] += (class305.method2086(var35, 65313) >> 8) - class305.method2086(255, var34 >> 8);
                        var10[var33] += -class305.method2086(255, var34) + class305.method2086(var35, 255);
                    }
                    if (var13 == 0) {
                        var13 = var16;
                    }
                    if (var12 == 0) {
                        var12 = var16;
                    }
                }
                this.field1080 = var9;
            }
        }
        return this.field1080;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lek;ZLwj;Z)[I", line = 180)
    public final int[] method469(class185 arg0, boolean arg1, class219 arg2, boolean arg3) {
        field1093++;
        if (this.field1089.method1317(arg2, arg0, arg3)) {
            int var5 = arg1 ? 64 : 128;
            return this.field1089.method1322(arg0, this.field1066, false, var5, 23896, arg2, var5, 1.0D);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Lkh;)V", line = 543)
    public class63(class14 arg0) {
        this.field1089 = new class193(arg0);
        this.field1094 = arg0.method93(false) == 1;
        this.field1066 = arg0.method93(false) == 1;
        this.field1076 = arg0.method93(false) == 1;
        this.field1077 = arg0.method93(false) == 1;
        int var2 = arg0.method93(false) & 0x3;
        this.field1069 = arg0.method98(true);
        this.field1065 = arg0.method98(true);
        int var3 = arg0.method93(false);
        arg0.method93(false);
        if (var2 == 1) {
            this.field1079 = 2;
        } else if (var2 == 2) {
            this.field1079 = 3;
        } else if (var2 == 3) {
            this.field1079 = 4;
        } else {
            this.field1079 = 0;
        }
        this.field1092 = (var3 & 0xF4) >> 4;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IZLek;Lwj;)Z", line = 214)
    public final boolean method470(int arg0, boolean arg1, class185 arg2, class219 arg3) {
        field1081++;
        if (!this.field1089.method1317(arg3, arg2, true)) {
            return false;
        }
        GL var5 = class108.field1899;
        if (arg0 != 3) {
            field1088 = (class229) null;
        }
        int var6 = arg1 ? 64 : 128;
        int var7 = class323.method2177(arg0 ^ 0xFFFFFFD8);
        if ((var7 & 0x1) == 0) {
            if (this.field1096 == -1) {
                int[] var8 = new int[1];
                var5.glGenTextures(1, var8, 0);
                this.field1086 = class263.field4547;
                this.field1096 = var8[0];
                class108.method736(this.field1096);
                ByteBuffer var9 = ByteBuffer.wrap(this.field1089.method1318(var6, arg2, this.field1066, (byte) -59, arg3, var6, 0.7D));
                if (this.field1092 == 2) {
                    GLU var10 = new GLU();
                    var10.gluBuild2DMipmaps(3553, 6408, var6, var6, 6408, 5121, var9);
                    var5.glTexParameteri(3553, 10241, 9987);
                    var5.glTexParameteri(3553, 10240, 9729);
                    class263.field4549 += var9.limit() * 4 / 3 - this.field1073;
                    this.field1073 = var9.limit() * 4 / 3;
                } else if (this.field1092 == 1) {
                    int var11 = 0;
                    while (true) {
                        var5.glTexImage2D(3553, var11++, 6408, var6, var6, 0, 6408, 5121, var9);
                        var6 >>= 0x1;
                        if (var6 == 0) {
                            var5.glTexParameteri(3553, 10241, 9987);
                            var5.glTexParameteri(3553, 10240, 9729);
                            class263.field4549 += var9.limit() * 4 / 3 - this.field1073;
                            this.field1073 = var9.limit() * 4 / 3;
                            break;
                        }
                        var9 = ByteBuffer.wrap(this.field1089.method1318(var6, arg2, this.field1066, (byte) -124, arg3, var6, 0.7D));
                    }
                } else {
                    var5.glTexImage2D(3553, 0, 6408, var6, var6, 0, 6408, 5121, var9);
                    var5.glTexParameteri(3553, 10241, 9729);
                    var5.glTexParameteri(3553, 10240, 9729);
                    class263.field4549 += var9.limit() - this.field1073;
                    this.field1073 = var9.limit();
                }
                var5.glTexParameteri(3553, 10242, this.field1076 ? 10497 : 33071);
                var5.glTexParameteri(3553, 10243, this.field1077 ? 10497 : 33071);
            } else {
                class108.method736(this.field1096);
            }
        }
        if ((var7 & 0x2) == 0) {
            class108.method766(this.field1079);
        }
        if ((var7 & 0x4) == 0) {
            class108.method765(0);
        }
        if ((var7 & 0x8) == 0) {
            if (this.field1065 == 0 && this.field1069 == 0) {
                class108.method764();
            } else {
                float var12 = (float) (class108.field1905 * this.field1065) / (float) var6;
                float var13 = (float) (class108.field1905 * this.field1069) / (float) var6;
                class108.method739(var13, var12, 0.0F);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IILek;I)[Lsm;", line = 320)
    public static final class159[] method471(int arg0, int arg1, class185 arg2, int arg3) {
        field1070++;
        if (arg1 != 1) {
            method471(-33, -68, (class185) null, 41);
        }
        return class208.method1444(arg3, arg1 - 28237, arg0, arg2) ? class44.method379((byte) 64) : null;
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(II)V", line = 334)
    public final void method472(int arg0, int arg1) {
        field1067++;
        if (this.field1080 == null) {
            return;
        }
        if (arg1 != 4096) {
            this.field1073 = 32;
        }
        if (this.field1065 == 0 && this.field1069 == 0) {
            return;
        }
        if (class260.field4525 == null || class260.field4525.length < this.field1080.length) {
            class260.field4525 = new int[this.field1080.length];
        }
        int var3 = this.field1080.length == 4096 ? 64 : 128;
        int var4 = this.field1069 * arg0;
        int var5 = this.field1080.length;
        int var6 = var5 - 1;
        int var7 = var3 - 1;
        int var8 = arg0 * var3 * this.field1065;
        for (int var9 = 0; var9 < var5; var9 += var3) {
            int var10 = var6 & var8 + var9;
            for (int var11 = 0; var11 < var3; var11++) {
                int var12 = (var4 + var11 & var7) + var10;
                int var13 = var9 + var11;
                class260.field4525[var13] = this.field1080[var12];
            }
        }
        int[] var14 = this.field1080;
        this.field1080 = class260.field4525;
        class260.field4525 = var14;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIB[Ljf;)Ljf;", line = 395)
    public static final class229 method473(int arg0, int arg1, byte arg2, class229[] arg3) {
        field1082++;
        int var4 = 0;
        if (arg2 > -89) {
            field1084 = -35;
        }
        for (int var5 = 0; var5 < arg0; var5++) {
            if (arg3[arg1 + var5] == null) {
                arg3[arg1 + var5] = class102.field1775;
            }
            var4 += arg3[arg1 + var5].field3973;
        }
        int var6 = 0;
        byte[] var7 = new byte[var4];
        for (int var8 = 0; var8 < arg0; var8++) {
            class229 var9 = arg3[arg1 + var8];
            class36.method321(var9.field3944, 0, var7, var6, var9.field3973);
            var6 += var9.field3973;
        }
        class229 var10 = new class229();
        var10.field3973 = var4;
        var10.field3944 = var7;
        return var10;
    }

    @OriginalMember(owner = "client!bk", name = "finalize", descriptor = "()V", line = 445)
    protected final void finalize() throws Throwable {
        if (this.field1096 != -1) {
            class263.method1864(this.field1096, this.field1073, this.field1086);
            this.field1073 = 0;
            this.field1096 = -1;
        }
        super.finalize();
        field1074++;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B[I)[I", line = 470)
    public static final int[] method474(byte arg0, int[] arg1) {
        field1090++;
        if (arg0 != -17) {
            return (int[]) null;
        } else if (arg1 == null) {
            return null;
        } else {
            int[] var2 = new int[arg1.length];
            class36.method320(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "(B)V", line = 508)
    public static void method475(byte arg0) {
        if (arg0 != -36) {
            method473(-19, 52, (byte) 98, (class229[]) null);
        }
        field1087 = null;
        field1075 = null;
        field1083 = null;
        field1088 = null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lek;Lwj;B)Z", line = 526)
    public final boolean method476(class185 arg0, class219 arg1, byte arg2) {
        field1064++;
        return arg2 == -12 ? this.field1089.method1317(arg1, arg0, true) : true;
    }
}
