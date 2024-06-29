import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class54 extends class29 {

    @OriginalMember(owner = "client!ie", name = "F", descriptor = "I")
    private int field762 = 0;

    @OriginalMember(owner = "client!ie", name = "X", descriptor = "I")
    private int field779 = -1;

    @OriginalMember(owner = "client!ie", name = "Y", descriptor = "Z")
    public boolean field780 = false;

    @OriginalMember(owner = "client!ie", name = "A", descriptor = "Lbj;")
    private class228 field757;

    @OriginalMember(owner = "client!ie", name = "H", descriptor = "Z")
    private boolean field764;

    @OriginalMember(owner = "client!ie", name = "J", descriptor = "Z")
    private boolean field766;

    @OriginalMember(owner = "client!ie", name = "G", descriptor = "Z")
    private boolean field763;

    @OriginalMember(owner = "client!ie", name = "R", descriptor = "Z")
    private boolean field773;

    @OriginalMember(owner = "client!ie", name = "T", descriptor = "I")
    private int field775;

    @OriginalMember(owner = "client!ie", name = "S", descriptor = "I")
    private int field774;

    @OriginalMember(owner = "client!ie", name = "Z", descriptor = "I")
    private int field781;

    @OriginalMember(owner = "client!ie", name = "O", descriptor = "I")
    private int field770;

    @OriginalMember(owner = "client!ie", name = "M", descriptor = "Lph;")
    private static class229 field768 = class266.method1858(" from your friend list first)3", 0);

    @OriginalMember(owner = "client!ie", name = "bb", descriptor = "Lph;")
    public static class229 field783 = field768;

    @OriginalMember(owner = "client!ie", name = "V", descriptor = "Lnm;")
    public static class179 field777 = class288.method1977(-124);

    @OriginalMember(owner = "client!ie", name = "cb", descriptor = "Lph;")
    public static class229 field784 = class266.method1858(" de votre liste noire)3", 0);

    @OriginalMember(owner = "client!ie", name = "db", descriptor = "Z")
    public static boolean field785 = false;

    @OriginalMember(owner = "client!ie", name = "ab", descriptor = "F")
    private float field782;

    @OriginalMember(owner = "client!ie", name = "B", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!ie", name = "C", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!ie", name = "D", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!ie", name = "E", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!ie", name = "L", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!ie", name = "N", descriptor = "I")
    private int field769;

    @OriginalMember(owner = "client!ie", name = "P", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!ie", name = "Q", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!ie", name = "U", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!ie", name = "eb", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!ie", name = "I", descriptor = "Lsi;")
    public static class66 field765;

    @OriginalMember(owner = "client!ie", name = "W", descriptor = "[I")
    private int[] field778;

    @OriginalMember(owner = "client!ie", name = "finalize", descriptor = "()V", line = 24)
    protected final void finalize() throws Throwable {
        if (this.field779 != -1) {
            class274.method1895(this.field779, this.field762, this.field769);
            this.field779 = -1;
            this.field762 = 0;
        }
        field772++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILsi;Lin;)Z", line = 48)
    public final boolean method365(int arg0, class66 arg1, class106 arg2) {
        if (arg0 != -22752) {
            this.method368(false, (class66) null, (class106) null, 43);
        }
        field767++;
        return this.field757.method1589(arg1, arg2, -5726);
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lhb;)V", line = 487)
    public class54(class164 arg0) {
        this.field757 = new class228(arg0);
        this.field764 = arg0.method1178(8) == 1;
        this.field766 = arg0.method1178(8) == 1;
        this.field763 = arg0.method1178(8) == 1;
        this.field773 = arg0.method1178(8) == 1;
        int var2 = arg0.method1178(8) & 0x3;
        this.field775 = arg0.method1163(864348104);
        this.field774 = arg0.method1163(864348104);
        int var3 = arg0.method1178(8);
        arg0.method1178(8);
        if (var2 == 1) {
            this.field781 = 2;
        } else if (var2 == 2) {
            this.field781 = 3;
        } else if (var2 == 3) {
            this.field781 = 4;
        } else {
            this.field781 = 0;
        }
        this.field770 = var3 >> 4 & 0xF;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lsi;IZLin;)Z", line = 63)
    public final boolean method366(class66 arg0, int arg1, boolean arg2, class106 arg3) {
        field761++;
        if (!this.field757.method1589(arg0, arg3, -5726)) {
            return false;
        }
        GL var5 = class99.field1682;
        int var6 = class72.method561(28770);
        int var7 = arg2 ? 64 : 128;
        if ((var6 & 0x1) == 0) {
            if (this.field779 == -1) {
                int[] var8 = new int[1];
                var5.glGenTextures(1, var8, 0);
                this.field779 = var8[0];
                this.field769 = class274.field4577;
                class99.method749(this.field779);
                ByteBuffer var9 = ByteBuffer.wrap(this.field757.method1591(this.field766, 2, var7, var7, 0.7D, arg0, arg3));
                if (this.field770 == 2) {
                    GLU var11 = new GLU();
                    var11.gluBuild2DMipmaps(3553, 6408, var7, var7, 6408, 5121, var9);
                    var5.glTexParameteri(3553, 10241, 9987);
                    var5.glTexParameteri(3553, 10240, 9729);
                    class274.field4578 += var9.limit() * 4 / 3 - this.field762;
                    this.field762 = var9.limit() * 4 / 3;
                } else if (this.field770 == 1) {
                    int var10 = 0;
                    while (true) {
                        var5.glTexImage2D(3553, var10++, 6408, var7, var7, 0, 6408, 5121, var9);
                        var7 >>= 0x1;
                        if (var7 == 0) {
                            var5.glTexParameteri(3553, 10241, 9987);
                            var5.glTexParameteri(3553, 10240, 9729);
                            class274.field4578 += var9.limit() * 4 / 3 - this.field762;
                            this.field762 = var9.limit() * 4 / 3;
                            break;
                        }
                        var9 = ByteBuffer.wrap(this.field757.method1591(this.field766, 2, var7, var7, 0.7D, arg0, arg3));
                    }
                } else {
                    var5.glTexImage2D(3553, 0, 6408, var7, var7, 0, 6408, 5121, var9);
                    var5.glTexParameteri(3553, 10241, 9729);
                    var5.glTexParameteri(3553, 10240, 9729);
                    class274.field4578 += var9.limit() - this.field762;
                    this.field762 = var9.limit();
                }
                var5.glTexParameteri(3553, 10242, this.field763 ? 10497 : 33071);
                var5.glTexParameteri(3553, 10243, this.field773 ? 10497 : 33071);
            } else {
                class99.method749(this.field779);
            }
        }
        if ((var6 & 0x2) == 0) {
            class99.method758(this.field781);
        }
        if ((arg1 & var6) == 0) {
            class99.method765(0);
        }
        if ((var6 & 0x8) == 0) {
            if (this.field774 == 0 && this.field775 == 0) {
                class99.method750();
            } else {
                float var12 = (float) (class99.field1671 * this.field774) / (float) var7;
                float var13 = (float) (class99.field1671 * this.field775) / (float) var7;
                class99.method760(var13, var12, 0.0F);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(FZLsi;ILin;)[I", line = 167)
    public final int[] method367(float arg0, boolean arg1, class66 arg2, int arg3, class106 arg4) {
        field758++;
        if (arg3 != 255) {
            return (int[]) null;
        }
        if (this.field778 == null || this.field782 != arg0) {
            if (!this.field757.method1589(arg2, arg4, arg3 - 5981)) {
                return null;
            }
            int var6 = arg1 ? 64 : 128;
            this.field778 = this.field757.method1585((byte) -86, arg2, var6, true, arg4, this.field766, var6, (double) arg0);
            this.field782 = arg0;
            if (this.field764) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6 * var6];
                int[] var10 = new int[var6];
                int var11 = var6;
                int var13;
                int var14 = var13 = var6;
                int var15 = var6 - 1;
                int var16 = var6 - 1;
                int var17 = var6 * var6;
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var19 = var16; var19 >= 0; var19--) {
                        var13--;
                        int var20 = this.field778[var13];
                        var10[var19] += class243.method1696(var20 >> 16, 255);
                        var8[var19] += class243.method1696(255, var20 >> 8);
                        var7[var19] += class243.method1696(var20, 255);
                    }
                    if (var13 == 0) {
                        var13 = var17;
                    }
                }
                int var21 = var17;
                for (int var22 = var15; var22 >= 0; var22--) {
                    int var23 = 1;
                    int var24 = 1;
                    int var25 = 0;
                    int var26 = 0;
                    int var27 = 0;
                    for (int var28 = 2; var28 >= 0; var28--) {
                        var24--;
                        var26 += var7[var24];
                        var25 += var8[var24];
                        var27 += var10[var24];
                        if (var24 == 0) {
                            var24 = var11;
                        }
                    }
                    for (int var29 = var16; var29 >= 0; var29--) {
                        int var30 = var27 / 9;
                        int var31 = var25 / 9;
                        var23--;
                        int var32 = var26 / 9;
                        var21--;
                        var9[var21] = class201.method1410(var32, class201.method1410(var31 << 8, var30 << 16));
                        var24--;
                        var25 += var8[var24] - var8[var23];
                        var26 += var7[var24] - var7[var23];
                        var27 += var10[var24] - var10[var23];
                        if (var24 == 0) {
                            var24 = var11;
                        }
                        if (var23 == 0) {
                            var23 = var11;
                        }
                    }
                    for (int var33 = var16; var33 >= 0; var33--) {
                        var14--;
                        int var34 = this.field778[var14];
                        var13--;
                        int var35 = this.field778[var13];
                        var10[var33] += -(class243.method1696(var34, 16746763) >> 16) + class243.method1696(var35 >> 16, 255);
                        var8[var33] += -class243.method1696(var34 >> 8, 255) + class243.method1696(var35 >> 8, 255);
                        var7[var33] += class243.method1696(255, var35) - class243.method1696(var34, 255);
                    }
                    if (var14 == 0) {
                        var14 = var17;
                    }
                    if (var13 == 0) {
                        var13 = var17;
                    }
                }
                this.field778 = var9;
            }
        }
        return this.field778;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZLsi;Lin;I)[I", line = 332)
    public final int[] method368(boolean arg0, class66 arg1, class106 arg2, int arg3) {
        if (arg3 != -1689) {
            this.method368(false, (class66) null, (class106) null, -101);
        }
        field776++;
        if (this.field757.method1589(arg1, arg2, -5726)) {
            int var5 = arg0 ? 64 : 128;
            return this.field757.method1585((byte) -115, arg1, var5, false, arg2, this.field766, var5, 1.0D);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "(I)I", line = 359)
    public static final int method369(int arg0) {
        if (arg0 == 2) {
            field760++;
            return 2;
        } else {
            return 16;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)V", line = 370)
    public final void method370(int arg0, int arg1) {
        field771++;
        if (this.field778 == null || this.field774 == arg1 && this.field775 == 0) {
            return;
        }
        if (class332.field5648 == null || class332.field5648.length < this.field778.length) {
            class332.field5648 = new int[this.field778.length];
        }
        int var3 = this.field775 * arg0;
        int var4 = this.field778.length == 4096 ? 64 : 128;
        int var5 = this.field778.length;
        int var6 = var4 - 1;
        int var7 = this.field774 * var4 * arg0;
        int var8 = var5 - 1;
        for (int var9 = 0; var9 < var5; var9 += var4) {
            int var10 = var8 & var9 + var7;
            for (int var11 = 0; var11 < var4; var11++) {
                int var12 = var9 + var11;
                int var13 = (var6 & var3 + var11) + var10;
                class332.field5648[var12] = this.field778[var13];
            }
        }
        int[] var14 = this.field778;
        this.field778 = class332.field5648;
        class332.field5648 = var14;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(II)V", line = 433)
    public static final void method371(int arg0, int arg1) {
        field759++;
        if (arg1 == 37) {
            class263.field4394 = 3.0F;
        } else if (arg1 == 50) {
            class263.field4394 = 4.0F;
        } else if (arg1 == 75) {
            class263.field4394 = 6.0F;
        } else {
            class263.field4394 = 8.0F;
        }
        if (arg0 != -15443) {
            method371(0, -45);
        }
        class205.field3380 = -1;
        class205.field3380 = -1;
    }

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "(I)V", line = 472)
    public static void method372(int arg0) {
        field765 = null;
        field784 = null;
        field768 = null;
        field777 = null;
        field783 = null;
        int var1 = 22 % ((arg0 - 68) / 43);
    }
}
