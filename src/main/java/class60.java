import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class60 extends class3 {

    @OriginalMember(owner = "client!gm", name = "G", descriptor = "I")
    private int field861 = 0;

    @OriginalMember(owner = "client!gm", name = "O", descriptor = "I")
    private int field869 = -1;

    @OriginalMember(owner = "client!gm", name = "ab", descriptor = "Z")
    public boolean field880 = false;

    @OriginalMember(owner = "client!gm", name = "T", descriptor = "Lnd;")
    private class312 field873;

    @OriginalMember(owner = "client!gm", name = "X", descriptor = "Z")
    private boolean field877;

    @OriginalMember(owner = "client!gm", name = "V", descriptor = "Z")
    private boolean field875;

    @OriginalMember(owner = "client!gm", name = "Q", descriptor = "Z")
    private boolean field870;

    @OriginalMember(owner = "client!gm", name = "N", descriptor = "Z")
    private boolean field868;

    @OriginalMember(owner = "client!gm", name = "M", descriptor = "I")
    private int field867;

    @OriginalMember(owner = "client!gm", name = "mb", descriptor = "I")
    private int field892;

    @OriginalMember(owner = "client!gm", name = "J", descriptor = "I")
    private int field864;

    @OriginalMember(owner = "client!gm", name = "L", descriptor = "I")
    private int field866;

    @OriginalMember(owner = "client!gm", name = "R", descriptor = "I")
    public static int field871 = 0;

    @OriginalMember(owner = "client!gm", name = "H", descriptor = "Lak;")
    public static class20 field862 = new class20(260);

    @OriginalMember(owner = "client!gm", name = "fb", descriptor = "[I")
    public static int[] field885 = new int[2000];

    @OriginalMember(owner = "client!gm", name = "jb", descriptor = "[Ln;")
    public static class233[] field889 = new class233[4];

    @OriginalMember(owner = "client!gm", name = "lb", descriptor = "F")
    private float field891;

    @OriginalMember(owner = "client!gm", name = "F", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!gm", name = "I", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!gm", name = "K", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!gm", name = "S", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!gm", name = "U", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!gm", name = "W", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!gm", name = "Z", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!gm", name = "bb", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!gm", name = "cb", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!gm", name = "db", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!gm", name = "gb", descriptor = "I")
    private int field886;

    @OriginalMember(owner = "client!gm", name = "eb", descriptor = "Lmh;")
    public static class65 field884;

    @OriginalMember(owner = "client!gm", name = "ib", descriptor = "Z")
    public static boolean field888;

    @OriginalMember(owner = "client!gm", name = "Y", descriptor = "[I")
    private int[] field878;

    @OriginalMember(owner = "client!gm", name = "kb", descriptor = "[Laf;")
    public static class72[] field890;

    @OriginalMember(owner = "client!gm", name = "hb", descriptor = "[[B")
    public static byte[][] field887;

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "(I)V", line = 8)
    public static void method423(int arg0) {
        field890 = null;
        field885 = null;
        field862 = null;
        field884 = null;
        field887 = (byte[][]) null;
        field889 = null;
        if (arg0 < 28) {
            field885 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "(B)Lqa;", line = 25)
    public static final class79 method424(byte arg0) {
        if (arg0 != 21) {
            method424((byte) -58);
        }
        field882++;
        return class181.field2930 < class184.field3006.length ? class184.field3006[class181.field2930++] : null;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lse;ILmh;ZF)[I", line = 46)
    public final int[] method425(class96 arg0, int arg1, class65 arg2, boolean arg3, float arg4) {
        field874++;
        if (arg1 != 0) {
            method423(8);
        }
        if (this.field878 == null || this.field891 != arg4) {
            if (!this.field873.method2166(arg1 ^ 0x78, arg0, arg2)) {
                return null;
            }
            int var6 = arg3 ? 64 : 128;
            this.field878 = this.field873.method2161(this.field875, var6, var6, arg2, ~arg1, arg0, (double) arg4, true);
            this.field891 = arg4;
            if (this.field877) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6 * var6];
                int[] var9 = new int[var6];
                int var10 = var6;
                int var11;
                int var12 = var11 = var6;
                int var14 = var6 - 1;
                int var15 = var6 - 1;
                int var16 = var6 * var6;
                int[] var17 = new int[var6];
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var19 = var14; var19 >= 0; var19--) {
                        var11--;
                        int var20 = this.field878[var11];
                        var17[var19] += class217.method1563(var20 >> 16, 255);
                        var7[var19] += class217.method1563(65337, var20) >> 8;
                        var9[var19] += class217.method1563(var20, 255);
                    }
                    if (var11 == 0) {
                        var11 = var16;
                    }
                }
                int var21 = var16;
                for (int var22 = var15; var22 >= 0; var22--) {
                    int var23 = 1;
                    int var24 = 1;
                    int var25 = 0;
                    int var26 = 0;
                    int var27 = 0;
                    for (int var28 = 2; var28 >= 0; var28--) {
                        var23--;
                        var26 += var9[var23];
                        var25 += var7[var23];
                        var27 += var17[var23];
                        if (var23 == 0) {
                            var23 = var10;
                        }
                    }
                    for (int var29 = var14; var29 >= 0; var29--) {
                        var23--;
                        int var30 = var26 / 9;
                        var24--;
                        int var31 = var25 / 9;
                        int var32 = var27 / 9;
                        var21--;
                        var8[var21] = class255.method1813(var30, class255.method1813(var32 << 16, var31 << 8));
                        var26 += var9[var23] - var9[var24];
                        var27 += var17[var23] - var17[var24];
                        var25 += var7[var23] - var7[var24];
                        if (var23 == 0) {
                            var23 = var10;
                        }
                        if (var24 == 0) {
                            var24 = var10;
                        }
                    }
                    for (int var33 = var14; var33 >= 0; var33--) {
                        var12--;
                        int var34 = this.field878[var12];
                        var11--;
                        int var35 = this.field878[var11];
                        var17[var33] += -class217.method1563(255, var34 >> 16) + (class217.method1563(var35, 16734535) >> 16);
                        var7[var33] += -(class217.method1563(var34, 65304) >> 8) + class217.method1563(255, var35 >> 8);
                        var9[var33] += -class217.method1563(var34, 255) + class217.method1563(255, var35);
                    }
                    if (var11 == 0) {
                        var11 = var16;
                    }
                    if (var12 == 0) {
                        var12 = var16;
                    }
                }
                this.field878 = var8;
            }
        }
        return this.field878;
    }

    @OriginalMember(owner = "client!gm", name = "finalize", descriptor = "()V", line = 207)
    protected final void finalize() throws Throwable {
        if (this.field869 != -1) {
            class103.method715(this.field869, this.field861, this.field886);
            this.field861 = 0;
            this.field869 = -1;
        }
        super.finalize();
        field876++;
    }

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "(I)V", line = 226)
    public static final void method426(int arg0) {
        if (arg0 != 4) {
            method424((byte) -107);
        }
        field883++;
        class274.method1934(0, 0, (byte) -107);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(BI)V", line = 248)
    public final void method427(byte arg0, int arg1) {
        int var3 = -96 / ((arg0 + 27) / 37);
        field860++;
        if (this.field878 == null || this.field892 == 0 && this.field867 == 0) {
            return;
        }
        if (class1.field12 == null || this.field878.length > class1.field12.length) {
            class1.field12 = new int[this.field878.length];
        }
        int var4 = this.field878.length == 4096 ? 64 : 128;
        int var5 = this.field867 * arg1;
        int var6 = arg1 * var4 * this.field892;
        int var7 = var4 - 1;
        int var8 = this.field878.length;
        int var9 = var8 - 1;
        for (int var10 = 0; var10 < var8; var10 += var4) {
            int var11 = var9 & var6 + var10;
            for (int var12 = 0; var12 < var4; var12++) {
                int var13 = var10 + var12;
                int var14 = (var5 + var12 & var7) + var11;
                class1.field12[var13] = this.field878[var14];
            }
        }
        int[] var15 = this.field878;
        this.field878 = class1.field12;
        class1.field12 = var15;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZZLse;Lmh;)Z", line = 306)
    public final boolean method428(boolean arg0, boolean arg1, class96 arg2, class65 arg3) {
        if (!arg0) {
            field884 = (class65) null;
        }
        field863++;
        if (!this.field873.method2166(89, arg2, arg3)) {
            return false;
        }
        GL var5 = class166.field2648;
        int var6 = arg1 ? 64 : 128;
        int var7 = class51.method354((byte) -53);
        if ((var7 & 0x1) == 0) {
            if (this.field869 == -1) {
                int[] var8 = new int[1];
                var5.glGenTextures(1, var8, 0);
                this.field869 = var8[0];
                this.field886 = class103.field1460;
                class166.method1182(this.field869);
                ByteBuffer var9 = ByteBuffer.wrap(this.field873.method2167(var6, this.field875, arg3, var6, arg2, (byte) -79, 0.7D));
                if (this.field866 == 2) {
                    GLU var11 = new GLU();
                    var11.gluBuild2DMipmaps(3553, 6408, var6, var6, 6408, 5121, var9);
                    var5.glTexParameteri(3553, 10241, 9987);
                    var5.glTexParameteri(3553, 10240, 9729);
                    class103.field1457 += var9.limit() * 4 / 3 - this.field861;
                    this.field861 = var9.limit() * 4 / 3;
                } else if (this.field866 == 1) {
                    int var10 = 0;
                    while (true) {
                        var5.glTexImage2D(3553, var10++, 6408, var6, var6, 0, 6408, 5121, var9);
                        var6 >>= 0x1;
                        if (var6 == 0) {
                            var5.glTexParameteri(3553, 10241, 9987);
                            var5.glTexParameteri(3553, 10240, 9729);
                            class103.field1457 += var9.limit() * 4 / 3 - this.field861;
                            this.field861 = var9.limit() * 4 / 3;
                            break;
                        }
                        var9 = ByteBuffer.wrap(this.field873.method2167(var6, this.field875, arg3, var6, arg2, (byte) -73, 0.7D));
                    }
                } else {
                    var5.glTexImage2D(3553, 0, 6408, var6, var6, 0, 6408, 5121, var9);
                    var5.glTexParameteri(3553, 10241, 9729);
                    var5.glTexParameteri(3553, 10240, 9729);
                    class103.field1457 += var9.limit() - this.field861;
                    this.field861 = var9.limit();
                }
                var5.glTexParameteri(3553, 10242, this.field870 ? 10497 : 33071);
                var5.glTexParameteri(3553, 10243, this.field868 ? 10497 : 33071);
            } else {
                class166.method1182(this.field869);
            }
        }
        if ((var7 & 0x2) == 0) {
            class166.method1160(this.field864);
        }
        if ((var7 & 0x4) == 0) {
            class166.method1177(0);
        }
        if ((var7 & 0x8) == 0) {
            if (this.field892 == 0 && this.field867 == 0) {
                class166.method1173();
            } else {
                float var12 = (float) (class166.field2630 * this.field892) / (float) var6;
                float var13 = (float) (class166.field2630 * this.field867) / (float) var6;
                class166.method1185(var13, var12, 0.0F);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Llb;)V", line = 518)
    public class60(class112 arg0) {
        this.field873 = new class312(arg0);
        this.field877 = arg0.method792(2) == 1;
        this.field875 = arg0.method792(2) == 1;
        this.field870 = arg0.method792(2) == 1;
        this.field868 = arg0.method792(2) == 1;
        int var2 = arg0.method792(2) & 0x3;
        this.field867 = arg0.method785((byte) -122);
        this.field892 = arg0.method785((byte) -100);
        int var3 = arg0.method792(2);
        arg0.method792(2);
        if (var2 == 1) {
            this.field864 = 2;
        } else if (var2 == 2) {
            this.field864 = 3;
        } else if (var2 == 3) {
            this.field864 = 4;
        } else {
            this.field864 = 0;
        }
        this.field866 = var3 >> 4 & 0xF;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(BLmh;Lse;)Z", line = 441)
    public final boolean method429(byte arg0, class65 arg1, class96 arg2) {
        field881++;
        int var4 = 12 % ((arg0 - 48) / 59);
        return this.field873.method2166(83, arg2, arg1);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIII)V", line = 453)
    public static final void method430(int arg0, int arg1, int arg2, int arg3) {
        field865++;
        if (arg2 != 255) {
            field885 = (int[]) null;
        }
        class302 var4 = class79.method567(-128, arg3, arg0);
        if (var4 != null && var4.field4896 != null) {
            class73 var5 = new class73();
            var5.field1083 = var4.field4896;
            var5.field1079 = var4;
            class161.method1141(var5, true);
        }
        class75.field1119 = arg0;
        class3.field44 = arg3;
        class128.field1901 = true;
        class193.field3108 = arg1;
        class18.method91(28515, var4);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZLse;Lmh;I)[I", line = 483)
    public final int[] method431(boolean arg0, class96 arg1, class65 arg2, int arg3) {
        field879++;
        if (this.field873.method2166(56, arg1, arg2)) {
            int var5 = -13 / ((arg3 + 63) / 37);
            int var6 = arg0 ? 64 : 128;
            return this.field873.method2161(this.field875, var6, var6, arg2, -1, arg1, 1.0D, false);
        } else {
            return null;
        }
    }
}
