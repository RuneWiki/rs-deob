import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class277 extends class130 {

    @OriginalMember(owner = "client!wg", name = "R", descriptor = "Z")
    public boolean field4775 = false;

    @OriginalMember(owner = "client!wg", name = "z", descriptor = "I")
    private int field4758 = -1;

    @OriginalMember(owner = "client!wg", name = "O", descriptor = "I")
    private int field4773 = 0;

    @OriginalMember(owner = "client!wg", name = "W", descriptor = "Lbi;")
    private class77 field4780;

    @OriginalMember(owner = "client!wg", name = "bb", descriptor = "Z")
    private boolean field4785;

    @OriginalMember(owner = "client!wg", name = "L", descriptor = "Z")
    private boolean field4770;

    @OriginalMember(owner = "client!wg", name = "J", descriptor = "Z")
    private boolean field4768;

    @OriginalMember(owner = "client!wg", name = "B", descriptor = "Z")
    private boolean field4760;

    @OriginalMember(owner = "client!wg", name = "X", descriptor = "I")
    private int field4781;

    @OriginalMember(owner = "client!wg", name = "T", descriptor = "I")
    private int field4777;

    @OriginalMember(owner = "client!wg", name = "w", descriptor = "I")
    private int field4755;

    @OriginalMember(owner = "client!wg", name = "C", descriptor = "I")
    private int field4761;

    @OriginalMember(owner = "client!wg", name = "y", descriptor = "S")
    public static short field4757 = 32767;

    @OriginalMember(owner = "client!wg", name = "Q", descriptor = "I")
    public static int field4774 = 0;

    @OriginalMember(owner = "client!wg", name = "H", descriptor = "I")
    public static int field4766 = 0;

    @OriginalMember(owner = "client!wg", name = "E", descriptor = "Lcd;")
    public static class64 field4763 = class44.method335((byte) 71, "Titelbild ge-Offnet)3");

    @OriginalMember(owner = "client!wg", name = "V", descriptor = "I")
    public static volatile int field4779 = 0;

    @OriginalMember(owner = "client!wg", name = "U", descriptor = "I")
    public static int field4778 = 0;

    @OriginalMember(owner = "client!wg", name = "F", descriptor = "F")
    private float field4764;

    @OriginalMember(owner = "client!wg", name = "x", descriptor = "I")
    private int field4756;

    @OriginalMember(owner = "client!wg", name = "A", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!wg", name = "D", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!wg", name = "G", descriptor = "I")
    public static int field4765;

    @OriginalMember(owner = "client!wg", name = "I", descriptor = "I")
    public static int field4767;

    @OriginalMember(owner = "client!wg", name = "K", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!wg", name = "M", descriptor = "I")
    public static int field4771;

    @OriginalMember(owner = "client!wg", name = "Y", descriptor = "I")
    public static int field4782;

    @OriginalMember(owner = "client!wg", name = "Z", descriptor = "I")
    public static int field4783;

    @OriginalMember(owner = "client!wg", name = "ab", descriptor = "I")
    public static int field4784;

    @OriginalMember(owner = "client!wg", name = "cb", descriptor = "I")
    public static int field4786;

    @OriginalMember(owner = "client!wg", name = "N", descriptor = "Lqm;")
    public static class222 field4772;

    @OriginalMember(owner = "client!wg", name = "S", descriptor = "[I")
    private int[] field4776;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)V", line = 7)
    public static final void method1918(boolean arg0) {
        field4786++;
        class141.field2487.method1187(0);
        if (arg0) {
            method1923(20);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)V", line = 19)
    public final void method1919(int arg0, int arg1) {
        if (arg0 != 21437) {
            return;
        }
        field4765++;
        if (this.field4776 == null || this.field4777 == 0 && this.field4781 == 0) {
            return;
        }
        if (class131.field2318 == null || this.field4776.length > class131.field2318.length) {
            class131.field2318 = new int[this.field4776.length];
        }
        int var3 = this.field4776.length;
        int var4 = this.field4776.length == 4096 ? 64 : 128;
        int var5 = var4 - 1;
        int var6 = this.field4781 * arg1;
        int var7 = arg1 * var4 * this.field4777;
        int var8 = var3 - 1;
        for (int var9 = 0; var9 < var3; var9 += var4) {
            int var10 = var7 + var9 & var8;
            for (int var11 = 0; var11 < var4; var11++) {
                int var12 = var9 + var11;
                int var13 = var10 + (var5 & var11 + var6);
                class131.field2318[var12] = this.field4776[var13];
            }
        }
        int[] var14 = this.field4776;
        this.field4776 = class131.field2318;
        class131.field2318 = var14;
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(Z)V", line = 102)
    public static final void method1920(boolean arg0) {
        if (arg0) {
            method1918(true);
        }
        class70.field1357.method1187(0);
        class301.field5173.method1187(0);
        class130.field2311.method1187(0);
        field4771++;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Luk;FLqm;ZZ)[I", line = 120)
    public final int[] method1921(class86 arg0, float arg1, class222 arg2, boolean arg3, boolean arg4) {
        if (arg4) {
            return (int[]) null;
        }
        field4762++;
        if (this.field4776 == null || this.field4764 != arg1) {
            if (!this.field4780.method608(arg0, arg2, -41)) {
                return null;
            }
            int var6 = arg3 ? 64 : 128;
            this.field4776 = this.field4780.method610((double) arg1, arg2, var6, this.field4770, 255, var6, true, arg0);
            this.field4764 = arg1;
            if (this.field4785) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6];
                int[] var10 = new int[var6 * var6];
                int var11 = var6;
                int var13 = var6 - 1;
                int var14;
                int var15 = var14 = var6;
                int var16 = var6 * var6;
                int var17 = var6 - 1;
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var19 = var13; var19 >= 0; var19--) {
                        var14--;
                        int var20 = this.field4776[var14];
                        var7[var19] += class224.method1614(16717304, var20) >> 16;
                        var8[var19] += class224.method1614(var20 >> 8, 255);
                        var9[var19] += class224.method1614(255, var20);
                    }
                    if (var14 == 0) {
                        var14 = var16;
                    }
                }
                int var21 = var16;
                for (int var22 = var17; var22 >= 0; var22--) {
                    int var23 = 1;
                    int var24 = 1;
                    int var25 = 0;
                    int var26 = 0;
                    int var27 = 0;
                    for (int var28 = 2; var28 >= 0; var28--) {
                        var24--;
                        var27 += var7[var24];
                        var26 += var9[var24];
                        var25 += var8[var24];
                        if (var24 == 0) {
                            var24 = var11;
                        }
                    }
                    for (int var29 = var13; var29 >= 0; var29--) {
                        int var30 = var27 / 9;
                        int var31 = var25 / 9;
                        var23--;
                        var24--;
                        int var32 = var26 / 9;
                        var21--;
                        var10[var21] = class11.method91(class11.method91(var30 << 16, var31 << 8), var32);
                        var27 += var7[var24] - var7[var23];
                        var26 += var9[var24] - var9[var23];
                        var25 += var8[var24] - var8[var23];
                        if (var23 == 0) {
                            var23 = var11;
                        }
                        if (var24 == 0) {
                            var24 = var11;
                        }
                    }
                    for (int var33 = var13; var33 >= 0; var33--) {
                        var14--;
                        int var34 = this.field4776[var14];
                        var15--;
                        int var35 = this.field4776[var15];
                        var7[var33] += (class224.method1614(16756165, var34) >> 16) - (class224.method1614(var35, 16731616) >> 16);
                        var8[var33] += -(class224.method1614(65348, var35) >> 8) + (class224.method1614(65517, var34) >> 8);
                        var9[var33] += class224.method1614(var34, 255) - class224.method1614(255, var35);
                    }
                    if (var14 == 0) {
                        var14 = var16;
                    }
                    if (var15 == 0) {
                        var15 = var16;
                    }
                }
                this.field4776 = var10;
            }
        }
        return this.field4776;
    }

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "(I)V", line = 284)
    public static void method1922(int arg0) {
        if (arg0 != -26547) {
            field4766 = -16;
        }
        field4772 = null;
        field4763 = null;
    }

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "(I)Z", line = 298)
    public static final boolean method1923(int arg0) {
        field4783++;
        if (arg0 != -29554) {
            method1918(true);
        }
        if (class224.field3814) {
            try {
                return !(Boolean) class216.field3613.method530(0, class228.field3876.field4845);
            } catch (Throwable var2) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILuk;Lqm;)Z", line = 317)
    public final boolean method1924(int arg0, class86 arg1, class222 arg2) {
        field4769++;
        if (arg0 != 16045) {
            method1920(true);
        }
        return this.field4780.method608(arg1, arg2, arg0 ^ 0xFFFFC11B);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Luk;ZLqm;Z)Z", line = 328)
    public final boolean method1925(class86 arg0, boolean arg1, class222 arg2, boolean arg3) {
        field4759++;
        if (!this.field4780.method608(arg0, arg2, 122)) {
            return false;
        }
        GL var5 = class123.field2212;
        int var6 = class75.method600(106);
        int var7 = arg1 ? 64 : 128;
        if ((var6 & 0x1) == 0) {
            if (this.field4758 == -1) {
                int[] var8 = new int[1];
                var5.glGenTextures(1, var8, 0);
                this.field4756 = class285.field4893;
                this.field4758 = var8[0];
                class123.method867(this.field4758);
                ByteBuffer var9 = ByteBuffer.wrap(this.field4780.method607(var7, this.field4770, 0.7D, arg0, (byte) -111, arg2, var7));
                if (this.field4755 == 2) {
                    GLU var11 = new GLU();
                    var11.gluBuild2DMipmaps(3553, 6408, var7, var7, 6408, 5121, var9);
                    var5.glTexParameteri(3553, 10241, 9987);
                    var5.glTexParameteri(3553, 10240, 9729);
                    class285.field4891 += var9.limit() * 4 / 3 - this.field4773;
                    this.field4773 = var9.limit() * 4 / 3;
                } else if (this.field4755 == 1) {
                    int var10 = 0;
                    while (true) {
                        var5.glTexImage2D(3553, var10++, 6408, var7, var7, 0, 6408, 5121, var9);
                        var7 >>= 0x1;
                        if (var7 == 0) {
                            var5.glTexParameteri(3553, 10241, 9987);
                            var5.glTexParameteri(3553, 10240, 9729);
                            class285.field4891 += var9.limit() * 4 / 3 - this.field4773;
                            this.field4773 = var9.limit() * 4 / 3;
                            break;
                        }
                        var9 = ByteBuffer.wrap(this.field4780.method607(var7, this.field4770, 0.7D, arg0, (byte) -114, arg2, var7));
                    }
                } else {
                    var5.glTexImage2D(3553, 0, 6408, var7, var7, 0, 6408, 5121, var9);
                    var5.glTexParameteri(3553, 10241, 9729);
                    var5.glTexParameteri(3553, 10240, 9729);
                    class285.field4891 += var9.limit() - this.field4773;
                    this.field4773 = var9.limit();
                }
                var5.glTexParameteri(3553, 10242, this.field4768 ? 10497 : 33071);
                var5.glTexParameteri(3553, 10243, this.field4760 ? 10497 : 33071);
            } else {
                class123.method867(this.field4758);
            }
        }
        if ((var6 & 0x2) == 0) {
            class123.method894(this.field4761);
        }
        if ((var6 & 0x4) == 0) {
            class123.method881(0);
        }
        if (!arg3) {
            this.field4768 = false;
        }
        if ((var6 & 0x8) == 0) {
            if (this.field4777 == 0 && this.field4781 == 0) {
                class123.method885();
            } else {
                float var12 = (float) (class123.field2226 * this.field4781) / (float) var7;
                float var13 = (float) (class123.field2226 * this.field4777) / (float) var7;
                class123.method873(var12, var13, 0.0F);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!wg", name = "finalize", descriptor = "()V", line = 436)
    protected final void finalize() throws Throwable {
        if (this.field4758 != -1) {
            class285.method1979(this.field4758, this.field4773, this.field4756);
            this.field4773 = 0;
            this.field4758 = -1;
        }
        super.finalize();
        field4784++;
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lkh;)V", line = 502)
    public class277(class13 arg0) {
        this.field4780 = new class77(arg0);
        this.field4785 = arg0.method152((byte) -101) == 1;
        this.field4770 = arg0.method152((byte) -78) == 1;
        this.field4768 = arg0.method152((byte) -77) == 1;
        this.field4760 = arg0.method152((byte) -127) == 1;
        int var2 = arg0.method152((byte) -85) & 0x3;
        this.field4781 = arg0.method150((byte) 114);
        this.field4777 = arg0.method150((byte) 107);
        int var3 = arg0.method152((byte) -115);
        arg0.method152((byte) -107);
        this.field4755 = (var3 & 0xFC) >> 4;
        if (var2 == 1) {
            this.field4761 = 2;
        } else if (var2 == 2) {
            this.field4761 = 3;
        } else if (var2 == 3) {
            this.field4761 = 4;
        } else {
            this.field4761 = 0;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lqm;BZLuk;)[I", line = 483)
    public final int[] method1926(class222 arg0, byte arg1, boolean arg2, class86 arg3) {
        if (arg1 != 91) {
            return (int[]) null;
        }
        field4782++;
        if (this.field4780.method608(arg3, arg0, -107)) {
            int var5 = arg2 ? 64 : 128;
            return this.field4780.method610(1.0D, arg0, var5, this.field4770, 255, var5, false, arg3);
        } else {
            return null;
        }
    }
}
