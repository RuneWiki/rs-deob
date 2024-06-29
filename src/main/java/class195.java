import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class195 {

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "Lada;")
    public static class144 field2885 = new class144(90, 5);

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    private int field2888;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "I")
    public int field2891;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "Lkda;")
    public static class328 field2890;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)V", line = 3)
    public final void method1315(int arg0, int arg1) {
        this.field2891 = arg1;
        this.field2888 = 0;
        field2887++;
        if (arg0 <= 28) {
            this.method1318(-45);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIII)Z", line = 15)
    public final boolean method1316(int arg0, int arg1, int arg2, int arg3) {
        field2886++;
        int var5 = this.field2888;
        if (this.field2891 == arg3 && this.field2888 == 0) {
            return false;
        }
        boolean var6;
        if (~this.field2888 == arg0) {
            if (this.field2891 < arg3 && (this.field2891 + arg1) >= arg3 || this.field2891 > arg3 && (this.field2891 - arg1) <= arg3) {
                this.field2891 = arg3;
                return false;
            }
            var6 = true;
        } else if (this.field2888 > 0 && arg3 > this.field2891) {
            int var7 = this.field2888 * this.field2888 / (arg1 * 2);
            int var8 = this.field2891 + var7;
            if (arg3 > var8 && var8 >= this.field2891) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else if (this.field2888 < 0 && arg3 < this.field2891) {
            int var9 = this.field2888 * this.field2888 / (arg1 * 2);
            int var10 = this.field2891 - var9;
            if (var10 > arg3 && this.field2891 >= var10) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else {
            var6 = false;
        }
        if (var6) {
            if (arg3 <= this.field2891) {
                this.field2888 -= arg1;
                if (arg2 != 0 && -arg2 > this.field2888) {
                    this.field2888 = -arg2;
                }
            } else {
                this.field2888 += arg1;
                if (arg2 != 0 && this.field2888 > arg2) {
                    this.field2888 = arg2;
                }
            }
            if (this.field2888 != var5) {
                int var11 = this.field2888 * this.field2888 / (arg1 * 2);
                if (arg3 <= this.field2891) {
                    if (arg3 < this.field2891 && arg3 > (this.field2891 - var11)) {
                        this.field2888 = var5;
                    }
                } else if (this.field2891 + var11 > arg3) {
                    this.field2888 = var5;
                }
            }
        } else if (this.field2888 > 0) {
            this.field2888 -= arg1;
            if (this.field2888 < 0) {
                this.field2888 = 0;
            }
        } else {
            this.field2888 += arg1;
            if (this.field2888 > 0) {
                this.field2888 = 0;
            }
        }
        this.field2891 += this.field2888 + var5 >> 1;
        return var6;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIII[III)V", line = 153)
    public static final void method1317(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7) {
        field2882++;
        if (arg0 > 0 && !class452.method2749(arg0, false)) {
            throw new IllegalArgumentException("");
        } else if (arg4 > 0 && !class452.method2749(arg4, false)) {
            throw new IllegalArgumentException("");
        } else if (arg6 == 32993) {
            if (arg2 != -4090) {
                method1320(-23);
            }
            int var8 = 0;
            int var9 = arg0 < arg4 ? arg0 : arg4;
            int var10 = arg0 >> 1;
            int var11 = arg4 >> 1;
            int[] var12 = arg5;
            int[] var13 = new int[var10 * var11];
            while (true) {
                OpenGL.glTexImage2Di(arg7, var8, arg3, arg0, arg4, 0, arg6, arg1, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = 0;
                int var15 = 0;
                int var16 = arg0 + var15;
                for (int var17 = 0; var17 < var11; var17++) {
                    for (int var19 = 0; var19 < var10; var19++) {
                        int var20 = var12[var15++];
                        int var21 = var12[var15++];
                        int var22 = var12[var16++];
                        int var23 = var12[var16++];
                        int var24 = var20 & 0xFF;
                        int var25 = var20 >> 16 & 0xFF;
                        int var26 = var20 >> 24 & 0xFF;
                        int var27 = var20 >> 8 & 0xFF;
                        int var28 = ((var21 & 0xFFEC) >> 8) + var27;
                        int var29 = (var21 >> 16 & 0xFF) + var25;
                        int var30 = (var21 >> 24 & 0xFF) + var26;
                        int var31 = (var21 & 0xFF) + var24;
                        int var32 = (var22 & 0xFF) + var31;
                        int var33 = ((var22 & 0xFF94AB) >> 16) + var29;
                        int var34 = (var22 >> 24 & 0xFF) + var30;
                        int var35 = (var22 >> 8 & 0xFF) + var28;
                        int var36 = (var23 >> 24 & 0xFF) + var34;
                        int var37 = ((var23 & 0xFFB0) >> 8) + var35;
                        int var38 = ((var23 & 0xFF6FC7) >> 16) + var33;
                        int var39 = (var23 & 0xFF) + var32;
                        var13[var14++] = class473.method2847(class37.method245(255, var39 >> 2), class473.method2847(class37.method245(65280, var37 << 6), class473.method2847(class37.method245(1020, var38) << 14, class37.method245(1020, var36) << 22)));
                    }
                    var15 += arg0;
                    var16 += arg0;
                }
                int[] var18 = var13;
                var13 = var12;
                arg0 = var10;
                var12 = var18;
                arg4 = var11;
                var11 >>= 0x1;
                var10 >>= 0x1;
                var8++;
                var9 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)I", line = 259)
    public final int method1318(int arg0) {
        field2889++;
        if (arg0 != 16383) {
            method1320(125);
        }
        return this.field2891 & 0x3FFF;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)V", line = 270)
    public final void method1319(boolean arg0) {
        this.field2891 &= 0x3FFF;
        if (arg0) {
            this.method1318(56);
        }
        field2884++;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V", line = 287)
    public static void method1320(int arg0) {
        if (arg0 <= 78) {
            method1320(-25);
        }
        field2890 = null;
        field2885 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIB)V", line = 302)
    public static final void method1321(int arg0, int arg1, byte arg2) {
        if (arg2 > -13) {
            field2890 = null;
        }
        field2883++;
        class261 var3 = class491.field6998[arg0][arg1];
        if (var3 != null) {
            class595.field8782 = var3.field3735;
            class533.field7941 = var3.field3721;
            class442.field5895 = var3.field3731;
        }
        class89.method666(117);
    }
}
