import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class223 extends class78 {

    @OriginalMember(owner = "client!kf", name = "M", descriptor = "I")
    private int field3575 = -1;

    @OriginalMember(owner = "client!kf", name = "O", descriptor = "I")
    private int field3577 = 0;

    @OriginalMember(owner = "client!kf", name = "T", descriptor = "Z")
    public boolean field3582 = false;

    @OriginalMember(owner = "client!kf", name = "S", descriptor = "Lce;")
    private class248 field3581;

    @OriginalMember(owner = "client!kf", name = "K", descriptor = "Z")
    private boolean field3573;

    @OriginalMember(owner = "client!kf", name = "Q", descriptor = "Z")
    private boolean field3579;

    @OriginalMember(owner = "client!kf", name = "W", descriptor = "Z")
    private boolean field3585;

    @OriginalMember(owner = "client!kf", name = "P", descriptor = "Z")
    private boolean field3578;

    @OriginalMember(owner = "client!kf", name = "N", descriptor = "I")
    private int field3576;

    @OriginalMember(owner = "client!kf", name = "R", descriptor = "I")
    private int field3580;

    @OriginalMember(owner = "client!kf", name = "gb", descriptor = "I")
    private int field3595;

    @OriginalMember(owner = "client!kf", name = "bb", descriptor = "I")
    private int field3590;

    @OriginalMember(owner = "client!kf", name = "F", descriptor = "I")
    public static int field3569 = 0;

    @OriginalMember(owner = "client!kf", name = "cb", descriptor = "I")
    public static int field3591 = 0;

    @OriginalMember(owner = "client!kf", name = "V", descriptor = "F")
    private float field3584;

    @OriginalMember(owner = "client!kf", name = "G", descriptor = "I")
    private int field3570;

    @OriginalMember(owner = "client!kf", name = "I", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!kf", name = "J", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!kf", name = "L", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!kf", name = "U", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!kf", name = "X", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!kf", name = "Y", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!kf", name = "Z", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!kf", name = "db", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!kf", name = "eb", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!kf", name = "fb", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!kf", name = "ab", descriptor = "[I")
    private int[] field3589;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)V", line = 14)
    public final void method1619(int arg0, int arg1) {
        field3571++;
        if (arg0 != 14530) {
            this.field3581 = (class248) null;
        }
        if (this.field3589 == null || this.field3580 == 0 && this.field3576 == 0) {
            return;
        }
        if (class202.field3179 == null || class202.field3179.length < this.field3589.length) {
            class202.field3179 = new int[this.field3589.length];
        }
        int var3 = this.field3589.length == 4096 ? 64 : 128;
        int var4 = this.field3589.length;
        int var5 = var3 - 1;
        int var6 = this.field3576 * arg1;
        int var7 = arg1 * var3 * this.field3580;
        int var8 = var4 - 1;
        for (int var9 = 0; var9 < var4; var9 += var3) {
            int var10 = var9 + var7 & var8;
            for (int var11 = 0; var11 < var3; var11++) {
                int var12 = var9 + var11;
                int var13 = var10 + (var5 & var6 + var11);
                class202.field3179[var12] = this.field3589[var13];
            }
        }
        int[] var14 = this.field3589;
        this.field3589 = class202.field3179;
        class202.field3179 = var14;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lha;Lja;IZ)Z", line = 74)
    public final boolean method1620(class304 arg0, class64 arg1, int arg2, boolean arg3) {
        field3592++;
        if (!this.field3581.method1761(arg2 ^ arg2, arg1, arg0)) {
            return false;
        }
        GL var5 = class265.field4099;
        int var6 = class230.method1665((byte) -117);
        int var7 = arg3 ? 64 : 128;
        if ((var6 & 0x1) == 0) {
            if (this.field3575 == -1) {
                int[] var8 = new int[1];
                var5.glGenTextures(1, var8, 0);
                this.field3575 = var8[0];
                this.field3570 = class214.field3409;
                class265.method1889(this.field3575);
                ByteBuffer var9 = ByteBuffer.wrap(this.field3581.method1759((byte) 113, var7, this.field3579, arg0, arg1, var7, 0.7D));
                if (this.field3590 == 2) {
                    GLU var11 = new GLU();
                    var11.gluBuild2DMipmaps(3553, 6408, var7, var7, 6408, 5121, var9);
                    var5.glTexParameteri(3553, 10241, 9987);
                    var5.glTexParameteri(3553, 10240, 9729);
                    class214.field3410 += var9.limit() * 4 / 3 - this.field3577;
                    this.field3577 = var9.limit() * 4 / 3;
                } else if (this.field3590 == 1) {
                    int var10 = 0;
                    while (true) {
                        var5.glTexImage2D(3553, var10++, 6408, var7, var7, 0, 6408, 5121, var9);
                        var7 >>= 0x1;
                        if (var7 == 0) {
                            var5.glTexParameteri(3553, 10241, 9987);
                            var5.glTexParameteri(3553, 10240, 9729);
                            class214.field3410 += var9.limit() * 4 / 3 - this.field3577;
                            this.field3577 = var9.limit() * 4 / 3;
                            break;
                        }
                        var9 = ByteBuffer.wrap(this.field3581.method1759((byte) 114, var7, this.field3579, arg0, arg1, var7, 0.7D));
                    }
                } else {
                    var5.glTexImage2D(3553, 0, 6408, var7, var7, 0, 6408, 5121, var9);
                    var5.glTexParameteri(3553, 10241, 9729);
                    var5.glTexParameteri(3553, 10240, 9729);
                    class214.field3410 += var9.limit() - this.field3577;
                    this.field3577 = var9.limit();
                }
                var5.glTexParameteri(3553, 10242, this.field3585 ? 10497 : 33071);
                var5.glTexParameteri(3553, 10243, this.field3578 ? 10497 : 33071);
            } else {
                class265.method1889(this.field3575);
            }
        }
        if ((var6 & 0x2) == 0) {
            class265.method1899(this.field3595);
        }
        if ((var6 & 0x4) == 0) {
            class265.method1898(0);
        }
        if ((var6 & 0x8) == 0) {
            if (this.field3580 == 0 && this.field3576 == 0) {
                class265.method1910();
            } else {
                float var12 = (float) (class265.field4118 * this.field3576) / (float) var7;
                float var13 = (float) (class265.field4118 * this.field3580) / (float) var7;
                class265.method1906(var12, var13, 0.0F);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILja;Lha;)Z", line = 180)
    public final boolean method1621(int arg0, class64 arg1, class304 arg2) {
        field3574++;
        if (arg0 > -97) {
            this.field3589 = (int[]) null;
        }
        return this.field3581.method1761(0, arg1, arg2);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BLha;Lja;Z)[I", line = 191)
    public final int[] method1622(byte arg0, class304 arg1, class64 arg2, boolean arg3) {
        if (arg0 < 13) {
            return (int[]) null;
        }
        field3583++;
        if (this.field3581.method1761(0, arg2, arg1)) {
            int var5 = arg3 ? 64 : 128;
            return this.field3581.method1760(1.0D, false, true, this.field3579, arg1, arg2, var5, var5);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lpe;)V", line = 450)
    public class223(class101 arg0) {
        this.field3581 = new class248(arg0);
        this.field3573 = arg0.method741(68) == 1;
        this.field3579 = arg0.method741(33) == 1;
        this.field3585 = arg0.method741(61) == 1;
        this.field3578 = arg0.method741(118) == 1;
        int var2 = arg0.method741(103) & 0x3;
        this.field3576 = arg0.method727((byte) 113);
        this.field3580 = arg0.method727((byte) 119);
        int var3 = arg0.method741(122);
        arg0.method741(21);
        if (var2 == 1) {
            this.field3595 = 2;
        } else if (var2 == 2) {
            this.field3595 = 3;
        } else if (var2 == 3) {
            this.field3595 = 4;
        } else {
            this.field3595 = 0;
        }
        this.field3590 = var3 >> 4 & 0xF;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lpe;Z)Lla;", line = 235)
    public static final class139 method1623(class101 arg0, boolean arg1) {
        if (!arg1) {
            field3593 = -26;
        }
        field3588++;
        return new class139(arg0.method780(-17432), arg0.method780(-17432), arg0.method780(-17432), arg0.method780(-17432), arg0.method780(-17432), arg0.method780(-17432), arg0.method780(-17432), arg0.method780(-17432), arg0.method776(-1574267376), arg0.method741(33));
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(FLja;BZLha;)[I", line = 246)
    public final int[] method1624(float arg0, class64 arg1, byte arg2, boolean arg3, class304 arg4) {
        field3572++;
        if (arg2 != 95) {
            this.field3590 = -126;
        }
        if (this.field3589 == null || this.field3584 != arg0) {
            if (!this.field3581.method1761(0, arg1, arg4)) {
                return null;
            }
            int var6 = arg3 ? 64 : 128;
            this.field3589 = this.field3581.method1760((double) arg0, true, true, this.field3579, arg4, arg1, var6, var6);
            this.field3584 = arg0;
            if (this.field3573) {
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
                        int var20 = this.field3589[var13];
                        var7[var19] += class280.method2001(255, var20 >> 16);
                        var10[var19] += class280.method2001(255, var20 >> 8);
                        var8[var19] += class280.method2001(var20, 255);
                    }
                    if (var13 == 0) {
                        var13 = var17;
                    }
                }
                int var21 = var17;
                for (int var22 = var15; var22 >= 0; var22--) {
                    int var23 = 1;
                    int var24 = 0;
                    int var25 = 0;
                    int var26 = 0;
                    int var27 = 1;
                    for (int var28 = 2; var28 >= 0; var28--) {
                        var27--;
                        var24 += var10[var27];
                        var25 += var8[var27];
                        var26 += var7[var27];
                        if (var27 == 0) {
                            var27 = var11;
                        }
                    }
                    for (int var29 = var16; var29 >= 0; var29--) {
                        int var30 = var24 / 9;
                        var27--;
                        var23--;
                        int var31 = var25 / 9;
                        int var32 = var26 / 9;
                        var21--;
                        var9[var21] = class94.method673(var31, class94.method673(var30 << 8, var32 << 16));
                        var24 += var10[var27] - var10[var23];
                        var25 += var8[var27] - var8[var23];
                        var26 += var7[var27] - var7[var23];
                        if (var27 == 0) {
                            var27 = var11;
                        }
                        if (var23 == 0) {
                            var23 = var11;
                        }
                    }
                    for (int var33 = var16; var33 >= 0; var33--) {
                        var13--;
                        int var34 = this.field3589[var13];
                        var14--;
                        int var35 = this.field3589[var14];
                        var7[var33] += -class280.method2001(var35 >> 16, 255) + (class280.method2001(16760726, var34) >> 16);
                        var10[var33] += class280.method2001(var34 >> 8, 255) - (class280.method2001(65341, var35) >> 8);
                        var8[var33] += class280.method2001(255, var34) - class280.method2001(var35, 255);
                    }
                    if (var14 == 0) {
                        var14 = var17;
                    }
                    if (var13 == 0) {
                        var13 = var17;
                    }
                }
                this.field3589 = var9;
            }
        }
        return this.field3589;
    }

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "(I)V", line = 408)
    public static final void method1625(int arg0) {
        field3586++;
        if (arg0 == -2526) {
            class139.field2209.method1837(-9);
            class9.field132.method1837(-116);
            class123.field1965.method1837(12);
        }
    }

    @OriginalMember(owner = "client!kf", name = "finalize", descriptor = "()V", line = 426)
    protected final void finalize() throws Throwable {
        if (this.field3575 != -1) {
            class214.method1553(this.field3575, this.field3577, this.field3570);
            this.field3575 = -1;
            this.field3577 = 0;
        }
        super.finalize();
        field3587++;
    }
}
