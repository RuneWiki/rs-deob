import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.security.InvalidParameterException;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class114 extends class259 {

    @OriginalMember(owner = "client!sl", name = "C", descriptor = "I")
    private int field1579 = 0;

    @OriginalMember(owner = "client!sl", name = "J", descriptor = "I")
    private int field1586 = -1;

    @OriginalMember(owner = "client!sl", name = "M", descriptor = "Z")
    public boolean field1589 = false;

    @OriginalMember(owner = "client!sl", name = "L", descriptor = "Lkd;")
    public class87 field1588;

    @OriginalMember(owner = "client!sl", name = "z", descriptor = "Z")
    private boolean field1576;

    @OriginalMember(owner = "client!sl", name = "E", descriptor = "Z")
    private boolean field1581;

    @OriginalMember(owner = "client!sl", name = "K", descriptor = "Z")
    private boolean field1587;

    @OriginalMember(owner = "client!sl", name = "G", descriptor = "Z")
    private boolean field1583;

    @OriginalMember(owner = "client!sl", name = "B", descriptor = "I")
    private int field1578;

    @OriginalMember(owner = "client!sl", name = "P", descriptor = "I")
    private int field1592;

    @OriginalMember(owner = "client!sl", name = "N", descriptor = "Z")
    private boolean field1590;

    @OriginalMember(owner = "client!sl", name = "Q", descriptor = "I")
    private int field1593;

    @OriginalMember(owner = "client!sl", name = "A", descriptor = "I")
    private int field1577;

    @OriginalMember(owner = "client!sl", name = "F", descriptor = "F")
    private float field1582;

    @OriginalMember(owner = "client!sl", name = "D", descriptor = "I")
    private int field1580;

    @OriginalMember(owner = "client!sl", name = "O", descriptor = "I")
    private int field1591;

    @OriginalMember(owner = "client!sl", name = "H", descriptor = "[I")
    private int[] field1584;

    @OriginalMember(owner = "client!sl", name = "I", descriptor = "[I")
    public static int[] field1585;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "()V", line = 6)
    public static void method734() {
        field1585 = null;
    }

    @OriginalMember(owner = "client!sl", name = "finalize", descriptor = "()V", line = 9)
    protected final void finalize() throws Throwable {
        if (this.field1586 != -1) {
            class1.method4(this.field1586, this.field1579, this.field1580);
            this.field1586 = -1;
            this.field1579 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIIII[I)V", line = 20)
    private static final void method735(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        if (arg2 == 0 || arg2 == Integer.MIN_VALUE || !class181.method1250(arg2, -4)) {
            throw new InvalidParameterException("width must be power of 2");
        } else if (arg3 == 0 || arg3 == Integer.MIN_VALUE || !class181.method1250(arg3, -4)) {
            throw new InvalidParameterException("height must be power of 2");
        } else if (arg4 == 32993 || arg4 == 6408) {
            GL var7 = class272.field4310;
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

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lce;Lnk;Z)[I", line = 123)
    public final int[] method736(class275 arg0, class16 arg1, boolean arg2) {
        if (this.field1588.method550(arg1, arg0, -100)) {
            int var4 = arg2 ? 64 : 128;
            return this.field1588.method559(this.field1581, var4, false, arg1, 1.0D, 1102507408, arg0, var4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Llf;)V", line = 484)
    public class114(class143 arg0) {
        this.field1588 = new class87(arg0);
        this.field1576 = arg0.method1043(true) == 1;
        this.field1581 = arg0.method1043(true) == 1;
        this.field1587 = arg0.method1043(true) == 1;
        this.field1583 = arg0.method1043(true) == 1;
        int var2 = arg0.method1043(true) & 0x3;
        this.field1578 = arg0.method1028(79030408);
        this.field1592 = arg0.method1028(79030408);
        int var3 = arg0.method1043(true);
        arg0.method1043(true);
        this.field1590 = arg0.method1043(true) == 1;
        this.field1593 = var3 >> 4 & 0xF;
        if (var2 == 1) {
            this.field1577 = 2;
        } else if (var2 == 2) {
            this.field1577 = 3;
        } else if (var2 == 3) {
            this.field1577 = 4;
        } else {
            this.field1577 = 0;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lce;Lnk;)Z", line = 141)
    public final boolean method737(class275 arg0, class16 arg1) {
        return this.field1588.method550(arg1, arg0, -92);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lce;Lnk;FZ)[I", line = 153)
    public final int[] method738(class275 arg0, class16 arg1, float arg2, boolean arg3) {
        if (this.field1584 == null || this.field1582 != arg2) {
            if (!this.field1588.method550(arg1, arg0, -128)) {
                return null;
            }
            this.field1591 = arg3 ? 64 : 128;
            this.field1584 = this.field1588.method559(this.field1581, this.field1591, true, arg1, (double) arg2, 1102507408, arg0, this.field1591);
            this.field1582 = arg2;
            if (this.field1576) {
                int[] var5 = new int[this.field1591];
                int[] var6 = new int[this.field1591];
                int[] var7 = new int[this.field1591];
                int[] var8 = new int[this.field1591 * this.field1591];
                int var9 = this.field1591;
                int var10 = this.field1591;
                int var11 = var9 - 1;
                int var12 = var10 - 1;
                int var13 = var9 * var10;
                int var14;
                int var15 = var14 = var9;
                for (int var16 = 2; var16 >= 0; var16--) {
                    for (int var17 = var11; var17 >= 0; var17--) {
                        var14--;
                        int var18 = this.field1584[var14];
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
                        int var32 = this.field1584[var14];
                        var15--;
                        int var33 = this.field1584[var15];
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
                this.field1584 = var8;
            }
        }
        return this.field1584;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lce;Lnk;I)Z", line = 306)
    public final boolean method739(class275 arg0, class16 arg1, int arg2) {
        if (!this.field1588.method550(arg1, arg0, -118)) {
            return false;
        }
        GL var4 = class272.field4310;
        int var5 = class277.method1978(true);
        if ((var5 & 0x1) == 0) {
            if (this.field1586 != -1 && this.field1591 == arg2) {
                class272.method1965(this.field1586);
            } else {
                if (this.field1586 == -1) {
                    int[] var6 = new int[1];
                    var4.glGenTextures(1, var6, 0);
                    this.field1586 = var6[0];
                    this.field1580 = class1.field3;
                }
                class272.method1965(this.field1586);
                if (this.field1590 && class152.method1116()) {
                    float[] var7 = this.field1588.method553(-14895, arg1, arg0, arg2, arg2, this.field1581);
                    if (this.field1593 == 2) {
                        method741(class66.field791, class66.field797, arg2, arg2, class66.field794, class66.field804, var7);
                        var4.glTexParameteri(3553, 10241, 9987);
                        var4.glTexParameteri(3553, 10240, 9729);
                        class1.field2 += var7.length * 4 / 3 - this.field1579;
                        this.field1579 = var7.length * 4 / 3;
                    } else {
                        var4.glTexImage2D(3553, 0, 34842, arg2, arg2, 0, 6408, 5126, FloatBuffer.wrap(var7));
                        var4.glTexParameteri(3553, 10241, 9729);
                        var4.glTexParameteri(3553, 10240, 9729);
                        class1.field2 += var7.length - this.field1579;
                        this.field1579 = var7.length;
                    }
                } else {
                    int var8 = class272.field4318 ? 33639 : 5121;
                    int[] var9 = this.field1588.method555(94, arg0, arg1, this.field1581, 0.7D, arg2, arg2);
                    if (this.field1593 == 2) {
                        method735(class66.field791, class66.field794, arg2, arg2, class66.field795, var8, var9);
                        var4.glTexParameteri(3553, 10241, 9987);
                        var4.glTexParameteri(3553, 10240, 9729);
                        class1.field2 += var9.length * 4 / 3 - this.field1579;
                        this.field1579 = var9.length * 4 / 3;
                    } else if (this.field1593 == 1) {
                        int var10 = 0;
                        while (true) {
                            var4.glTexImage2D(3553, var10++, 6408, arg2, arg2, 0, 32993, var8, IntBuffer.wrap(var9));
                            arg2 >>= 0x1;
                            if (arg2 == 0) {
                                var4.glTexParameteri(3553, 10241, 9987);
                                var4.glTexParameteri(3553, 10240, 9729);
                                class1.field2 += var9.length * 4 / 3 - this.field1579;
                                this.field1579 = var9.length * 4 / 3;
                                break;
                            }
                            var9 = this.field1588.method555(102, arg0, arg1, this.field1581, 0.7D, arg2, arg2);
                        }
                    } else {
                        var4.glTexImage2D(3553, 0, 6408, arg2, arg2, 0, 32993, var8, IntBuffer.wrap(var9));
                        var4.glTexParameteri(3553, 10241, 9729);
                        var4.glTexParameteri(3553, 10240, 9729);
                        class1.field2 += var9.length - this.field1579;
                        this.field1579 = var9.length;
                    }
                }
                var4.glTexParameteri(3553, 10242, this.field1587 ? 10497 : 33071);
                var4.glTexParameteri(3553, 10243, this.field1583 ? 10497 : 33071);
                this.field1591 = arg2;
            }
        }
        if ((var5 & 0x2) == 0) {
            class272.method1961(this.field1577);
        }
        if ((var5 & 0x4) == 0) {
            class272.method1947(0);
        }
        if ((var5 & 0x8) == 0) {
            if (this.field1592 == 0 && this.field1578 == 0) {
                class272.method1926();
            } else {
                float var11 = (float) (class272.field4280 * this.field1592) / (float) this.field1591;
                float var12 = (float) (class272.field4280 * this.field1578) / (float) this.field1591;
                class272.method1959(var12, var11, 0.0F);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "(I)V", line = 432)
    public final void method740(int arg0) {
        if (this.field1584 == null || this.field1592 == 0 && this.field1578 == 0) {
            return;
        }
        if (field1585 == null || field1585.length < this.field1584.length) {
            field1585 = new int[this.field1584.length];
        }
        int var2 = this.field1584.length;
        int var3 = this.field1578 * arg0;
        int var4 = this.field1591 - 1;
        int var5 = this.field1591 * arg0 * this.field1592;
        int var6 = var2 - 1;
        for (int var7 = 0; var7 < var2; var7 += this.field1591) {
            int var8 = var5 + var7 & var6;
            for (int var9 = 0; var9 < this.field1591; var9++) {
                int var10 = var7 + var9;
                int var11 = (var3 + var9 & var4) + var8;
                field1585[var10] = this.field1584[var11];
            }
        }
        int[] var12 = this.field1584;
        this.field1584 = field1585;
        field1585 = var12;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIIII[F)V", line = 518)
    private static final void method741(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6) {
        if (arg2 == 0 || arg2 == Integer.MIN_VALUE || !class181.method1250(arg2, -4)) {
            throw new InvalidParameterException("width must be power of 2");
        } else if (arg3 == 0 || arg3 == Integer.MIN_VALUE || !class181.method1250(arg3, -4)) {
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
            GL var8 = class272.field4310;
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
}
