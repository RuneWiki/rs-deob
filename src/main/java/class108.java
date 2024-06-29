import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.security.InvalidParameterException;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class108 extends class172 {

    @OriginalMember(owner = "client!to", name = "U", descriptor = "I")
    private int field1786 = 0;

    @OriginalMember(owner = "client!to", name = "V", descriptor = "I")
    private int field1787 = -1;

    @OriginalMember(owner = "client!to", name = "X", descriptor = "Z")
    public boolean field1789 = false;

    @OriginalMember(owner = "client!to", name = "P", descriptor = "Ljb;")
    public class340 field1781;

    @OriginalMember(owner = "client!to", name = "N", descriptor = "Z")
    private boolean field1779;

    @OriginalMember(owner = "client!to", name = "M", descriptor = "Z")
    private boolean field1778;

    @OriginalMember(owner = "client!to", name = "W", descriptor = "Z")
    private boolean field1788;

    @OriginalMember(owner = "client!to", name = "L", descriptor = "Z")
    private boolean field1777;

    @OriginalMember(owner = "client!to", name = "O", descriptor = "I")
    private int field1780;

    @OriginalMember(owner = "client!to", name = "Z", descriptor = "I")
    private int field1791;

    @OriginalMember(owner = "client!to", name = "Y", descriptor = "Z")
    private boolean field1790;

    @OriginalMember(owner = "client!to", name = "Q", descriptor = "I")
    private int field1782;

    @OriginalMember(owner = "client!to", name = "S", descriptor = "I")
    private int field1784;

    @OriginalMember(owner = "client!to", name = "R", descriptor = "F")
    private float field1783;

    @OriginalMember(owner = "client!to", name = "J", descriptor = "I")
    private int field1775;

    @OriginalMember(owner = "client!to", name = "K", descriptor = "I")
    private int field1776;

    @OriginalMember(owner = "client!to", name = "I", descriptor = "[I")
    private int[] field1774;

    @OriginalMember(owner = "client!to", name = "T", descriptor = "[I")
    public static int[] field1785;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IIIIII[F)V", line = 8)
    private static final void method827(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6) {
        if (arg2 == 0 || arg2 == Integer.MIN_VALUE || !class157.method1217(-6, arg2)) {
            throw new InvalidParameterException("width must be power of 2");
        } else if (arg3 == 0 || arg3 == Integer.MIN_VALUE || !class157.method1217(5, arg3)) {
            throw new InvalidParameterException("height must be power of 2");
        } else {
            byte var7;
            if (arg4 == 6406) {
                var7 = 1;
            } else if (arg4 == 6409) {
                var7 = 1;
            } else if (arg4 == 32841) {
                var7 = 1;
            } else if (arg4 == 6410) {
                var7 = 2;
            } else if (arg4 == 6407) {
                var7 = 3;
            } else if (arg4 == 6408) {
                var7 = 4;
            } else {
                throw new InvalidParameterException("Invalid external format");
            }
            GL var8 = class42.field627;
            int var9 = 0;
            int var10 = arg2 < arg3 ? arg2 : arg3;
            int var11 = arg2 >> 1;
            int var12 = arg3 >> 1;
            float[] var13 = arg6;
            float[] var14 = new float[var11 * var12 * var7];
            while (true) {
                var8.glTexImage2D(arg0, var9, arg1, arg2, arg3, 0, arg4, 5126, FloatBuffer.wrap(var13));
                if (var10 <= 1) {
                    return;
                }
                int var15 = arg2 * var7;
                for (int var16 = 0; var16 < var7; var16++) {
                    int var17 = var16;
                    int var18 = var16;
                    int var19 = var15 + var16;
                    for (int var20 = 0; var20 < var12; var20++) {
                        for (int var21 = 0; var21 < var11; var21++) {
                            float var22 = var13[var18];
                            int var23 = var7 + var18;
                            float var24 = var13[var23] + var22;
                            var18 = var7 + var23;
                            float var25 = var13[var19] + var24;
                            int var26 = var7 + var19;
                            float var27 = var13[var26] + var25;
                            var19 = var7 + var26;
                            var14[var17] = var27 * 0.25F;
                            var17 += var7;
                        }
                        var18 += var15;
                        var19 += var15;
                    }
                }
                float[] var28 = var14;
                var14 = var13;
                var13 = var28;
                arg2 = var11;
                arg3 = var12;
                var11 >>= 0x1;
                var12 >>= 0x1;
                var10 >>= 0x1;
                var9++;
            }
        }
    }

    @OriginalMember(owner = "client!to", name = "e", descriptor = "(I)V", line = 123)
    public final void method828(int arg0) {
        if (this.field1774 == null || this.field1791 == 0 && this.field1780 == 0) {
            return;
        }
        if (field1785 == null || field1785.length < this.field1774.length) {
            field1785 = new int[this.field1774.length];
        }
        int var2 = this.field1774.length;
        int var3 = this.field1780 * arg0;
        int var4 = this.field1776 - 1;
        int var5 = this.field1776 * arg0 * this.field1791;
        int var6 = var2 - 1;
        for (int var7 = 0; var7 < var2; var7 += this.field1776) {
            int var8 = var5 + var7 & var6;
            for (int var9 = 0; var9 < this.field1776; var9++) {
                int var10 = var7 + var9;
                int var11 = (var3 + var9 & var4) + var8;
                field1785[var10] = this.field1774[var11];
            }
        }
        int[] var12 = this.field1774;
        this.field1774 = field1785;
        field1785 = var12;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IIIIII[I)V", line = 173)
    private static final void method829(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        if (arg2 == 0 || arg2 == Integer.MIN_VALUE || !class157.method1217(26, arg2)) {
            throw new InvalidParameterException("width must be power of 2");
        } else if (arg3 == 0 || arg3 == Integer.MIN_VALUE || !class157.method1217(0, arg3)) {
            throw new InvalidParameterException("height must be power of 2");
        } else if (arg4 == 32993 || arg4 == 6408) {
            GL var7 = class42.field627;
            int var8 = 0;
            int var9 = arg2 < arg3 ? arg2 : arg3;
            int var10 = arg2 >> 1;
            int var11 = arg3 >> 1;
            int[] var12 = arg6;
            int[] var13 = new int[var10 * var11];
            while (true) {
                var7.glTexImage2D(arg0, var8, arg1, arg2, arg3, 0, arg4, arg5, IntBuffer.wrap(var12));
                if (var9 <= 1) {
                    return;
                }
                int var14 = 0;
                int var15 = 0;
                int var16 = arg2 + var15;
                for (int var17 = 0; var17 < var11; var17++) {
                    for (int var18 = 0; var18 < var10; var18++) {
                        int var19 = var12[var15++];
                        int var20 = var12[var15++];
                        int var21 = var12[var16++];
                        int var22 = var12[var16++];
                        int var23 = var19 >> 24 & 0xFF;
                        int var24 = var19 >> 16 & 0xFF;
                        int var25 = var19 >> 8 & 0xFF;
                        int var26 = var19 & 0xFF;
                        int var27 = (var20 >> 24 & 0xFF) + var23;
                        int var28 = (var20 >> 16 & 0xFF) + var24;
                        int var29 = (var20 >> 8 & 0xFF) + var25;
                        int var30 = (var20 & 0xFF) + var26;
                        int var31 = (var21 >> 24 & 0xFF) + var27;
                        int var32 = (var21 >> 16 & 0xFF) + var28;
                        int var33 = (var21 >> 8 & 0xFF) + var29;
                        int var34 = (var21 & 0xFF) + var30;
                        int var35 = (var22 >> 24 & 0xFF) + var31;
                        int var36 = (var22 >> 16 & 0xFF) + var32;
                        int var37 = (var22 >> 8 & 0xFF) + var33;
                        int var38 = (var22 & 0xFF) + var34;
                        var13[var14++] = (var35 & 0x3FC) << 22 | (var36 & 0x3FC) << 14 | (var37 & 0x3FC) << 6 | (var38 & 0x3FC) >> 2;
                    }
                    var15 += arg2;
                    var16 += arg2;
                }
                int[] var39 = var13;
                var13 = var12;
                var12 = var39;
                arg2 = var10;
                arg3 = var11;
                var10 >>= 0x1;
                var11 >>= 0x1;
                var9 >>= 0x1;
                var8++;
            }
        } else {
            throw new InvalidParameterException("Invalid external format");
        }
    }

    @OriginalMember(owner = "client!to", name = "finalize", descriptor = "()V", line = 280)
    protected final void finalize() throws Throwable {
        if (this.field1787 != -1) {
            class199.method1535(this.field1787, this.field1786, this.field1775);
            this.field1787 = -1;
            this.field1786 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lla;Lth;)Z", line = 291)
    public final boolean method830(class203 arg0, class57 arg1) {
        return this.field1781.method2396((byte) -74, arg0, arg1);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lla;Lth;I)Z", line = 297)
    public final boolean method831(class203 arg0, class57 arg1, int arg2) {
        if (!this.field1781.method2396((byte) -74, arg0, arg1)) {
            return false;
        }
        GL var4 = class42.field627;
        int var5 = class250.method1944((byte) -89);
        if ((var5 & 0x1) == 0) {
            if (this.field1787 != -1 && this.field1776 == arg2) {
                class42.method273(this.field1787);
            } else {
                if (this.field1787 == -1) {
                    int[] var6 = new int[1];
                    var4.glGenTextures(1, var6, 0);
                    this.field1787 = var6[0];
                    this.field1775 = class199.field3172;
                }
                class42.method273(this.field1787);
                if (this.field1790 && class68.method578()) {
                    float[] var7 = this.field1781.method2394(-49, arg1, arg2, arg0, this.field1778, arg2);
                    if (this.field1782 == 2) {
                        method827(class119.field2003, class119.field2009, arg2, arg2, class119.field2006, class119.field2016, var7);
                        var4.glTexParameteri(3553, 10241, 9987);
                        var4.glTexParameteri(3553, 10240, 9729);
                        class199.field3173 += var7.length * 4 / 3 - this.field1786;
                        this.field1786 = var7.length * 4 / 3;
                    } else {
                        var4.glTexImage2D(3553, 0, 34842, arg2, arg2, 0, 6408, 5126, FloatBuffer.wrap(var7));
                        var4.glTexParameteri(3553, 10241, 9729);
                        var4.glTexParameteri(3553, 10240, 9729);
                        class199.field3173 += var7.length - this.field1786;
                        this.field1786 = var7.length;
                    }
                } else {
                    int var8 = class42.field625 ? 33639 : 5121;
                    int[] var9 = this.field1781.method2390(0.7D, arg1, -18510, this.field1778, arg2, arg0, arg2);
                    if (this.field1782 == 2) {
                        method829(class119.field2003, class119.field2006, arg2, arg2, class119.field2007, var8, var9);
                        var4.glTexParameteri(3553, 10241, 9987);
                        var4.glTexParameteri(3553, 10240, 9729);
                        class199.field3173 += var9.length * 4 / 3 - this.field1786;
                        this.field1786 = var9.length * 4 / 3;
                    } else if (this.field1782 == 1) {
                        int var10 = 0;
                        while (true) {
                            var4.glTexImage2D(3553, var10++, 6408, arg2, arg2, 0, 32993, var8, IntBuffer.wrap(var9));
                            arg2 >>= 0x1;
                            if (arg2 == 0) {
                                var4.glTexParameteri(3553, 10241, 9987);
                                var4.glTexParameteri(3553, 10240, 9729);
                                class199.field3173 += var9.length * 4 / 3 - this.field1786;
                                this.field1786 = var9.length * 4 / 3;
                                break;
                            }
                            var9 = this.field1781.method2390(0.7D, arg1, -18510, this.field1778, arg2, arg0, arg2);
                        }
                    } else {
                        var4.glTexImage2D(3553, 0, 6408, arg2, arg2, 0, 32993, var8, IntBuffer.wrap(var9));
                        var4.glTexParameteri(3553, 10241, 9729);
                        var4.glTexParameteri(3553, 10240, 9729);
                        class199.field3173 += var9.length - this.field1786;
                        this.field1786 = var9.length;
                    }
                }
                var4.glTexParameteri(3553, 10242, this.field1788 ? 10497 : 33071);
                var4.glTexParameteri(3553, 10243, this.field1777 ? 10497 : 33071);
                this.field1776 = arg2;
            }
        }
        if ((var5 & 0x2) == 0) {
            class42.method275(this.field1784);
        }
        if ((var5 & 0x4) == 0) {
            class42.method277(0);
        }
        if ((var5 & 0x8) == 0) {
            if (this.field1791 == 0 && this.field1780 == 0) {
                class42.method299();
            } else {
                float var11 = (float) (class42.field609 * this.field1791) / (float) this.field1776;
                float var12 = (float) (class42.field609 * this.field1780) / (float) this.field1776;
                class42.method304(var12, var11, 0.0F);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lla;Lth;Z)[I", line = 422)
    public final int[] method832(class203 arg0, class57 arg1, boolean arg2) {
        if (this.field1781.method2396((byte) -74, arg0, arg1)) {
            int var4 = arg2 ? 64 : 128;
            return this.field1781.method2389(arg0, var4, this.field1778, var4, 1.0D, false, arg1, (byte) 63);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lla;Lth;FZ)[I", line = 430)
    public final int[] method833(class203 arg0, class57 arg1, float arg2, boolean arg3) {
        if (this.field1774 == null || this.field1783 != arg2) {
            if (!this.field1781.method2396((byte) -74, arg0, arg1)) {
                return null;
            }
            this.field1776 = arg3 ? 64 : 128;
            this.field1774 = this.field1781.method2389(arg0, this.field1776, this.field1778, this.field1776, (double) arg2, true, arg1, (byte) 63);
            this.field1783 = arg2;
            if (this.field1779) {
                int[] var5 = new int[this.field1776];
                int[] var6 = new int[this.field1776];
                int[] var7 = new int[this.field1776];
                int[] var8 = new int[this.field1776 * this.field1776];
                int var9 = this.field1776;
                int var10 = this.field1776;
                int var11 = var9 - 1;
                int var12 = var10 - 1;
                int var13 = var9 * var10;
                int var14;
                int var15 = var14 = var9;
                for (int var16 = 2; var16 >= 0; var16--) {
                    for (int var17 = var11; var17 >= 0; var17--) {
                        var14--;
                        int var18 = this.field1774[var14];
                        var5[var17] += var18 >> 16 & 0xFF;
                        var6[var17] += var18 >> 8 & 0xFF;
                        var7[var17] += var18 & 0xFF;
                    }
                    if (var14 == 0) {
                        var14 = var13;
                    }
                }
                int var19 = var13;
                for (int var20 = var12; var20 >= 0; var20--) {
                    int var21 = 1;
                    int var22 = 1;
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 0;
                    for (int var26 = 2; var26 >= 0; var26--) {
                        var22--;
                        var25 += var5[var22];
                        var23 += var6[var22];
                        var24 += var7[var22];
                        if (var22 == 0) {
                            var22 = var9;
                        }
                    }
                    for (int var27 = var11; var27 >= 0; var27--) {
                        var22--;
                        var21--;
                        int var28 = var25 / 9;
                        int var29 = var23 / 9;
                        int var30 = var24 / 9;
                        var19--;
                        var8[var19] = var28 << 16 | var29 << 8 | var30;
                        var25 += var5[var22] - var5[var21];
                        var24 += var7[var22] - var7[var21];
                        var23 += var6[var22] - var6[var21];
                        if (var22 == 0) {
                            var22 = var9;
                        }
                        if (var21 == 0) {
                            var21 = var9;
                        }
                    }
                    for (int var31 = var11; var31 >= 0; var31--) {
                        var14--;
                        int var32 = this.field1774[var14];
                        var15--;
                        int var33 = this.field1774[var15];
                        var5[var31] += (var32 >> 16 & 0xFF) - (var33 >> 16 & 0xFF);
                        var6[var31] += (var32 >> 8 & 0xFF) - (var33 >> 8 & 0xFF);
                        var7[var31] += (var32 & 0xFF) - (var33 & 0xFF);
                    }
                    if (var14 == 0) {
                        var14 = var13;
                    }
                    if (var15 == 0) {
                        var15 = var13;
                    }
                }
                this.field1774 = var8;
            }
        }
        return this.field1774;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "()V", line = 582)
    public static void method834() {
        field1785 = null;
    }

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lqm;)V", line = 598)
    public class108(class227 arg0) {
        this.field1781 = new class340(arg0);
        this.field1779 = arg0.method1720((byte) -112) == 1;
        this.field1778 = arg0.method1720((byte) -101) == 1;
        this.field1788 = arg0.method1720((byte) -101) == 1;
        this.field1777 = arg0.method1720((byte) -49) == 1;
        int var2 = arg0.method1720((byte) -84) & 0x3;
        this.field1780 = arg0.method1733(0);
        this.field1791 = arg0.method1733(0);
        int var3 = arg0.method1720((byte) -107);
        arg0.method1720((byte) -38);
        this.field1790 = arg0.method1720((byte) -127) == 1;
        this.field1782 = var3 >> 4 & 0xF;
        if (var2 == 1) {
            this.field1784 = 2;
        } else if (var2 == 2) {
            this.field1784 = 3;
        } else if (var2 == 3) {
            this.field1784 = 4;
        } else {
            this.field1784 = 0;
        }
    }
}
