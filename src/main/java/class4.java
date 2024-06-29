import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class4 extends class249 {

    @OriginalMember(owner = "client!qc", name = "Dc", descriptor = "I")
    public static int field68 = 3353893;

    @OriginalMember(owner = "client!qc", name = "Bc", descriptor = "[I")
    public static int[] field66 = new int[14];

    @OriginalMember(owner = "client!qc", name = "Ac", descriptor = "Lwm;")
    public static class152 field65 = class157.method1048("::shiftclick", 125);

    @OriginalMember(owner = "client!qc", name = "vc", descriptor = "I")
    public static int field60 = 0;

    @OriginalMember(owner = "client!qc", name = "Ic", descriptor = "Lwm;")
    private static class152 field73 = class157.method1048(" has logged in)3", 96);

    @OriginalMember(owner = "client!qc", name = "Jc", descriptor = "Lwm;")
    public static class152 field74 = field73;

    @OriginalMember(owner = "client!qc", name = "uc", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!qc", name = "wc", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!qc", name = "xc", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!qc", name = "yc", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!qc", name = "zc", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!qc", name = "Cc", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!qc", name = "Ec", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!qc", name = "Fc", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!qc", name = "Gc", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!qc", name = "Kc", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!qc", name = "Lc", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!qc", name = "Hc", descriptor = "Lfe;")
    public class242 field72;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lfe;I)V", line = 6)
    public final void method15(class242 arg0, int arg1) {
        if (arg1 != 0) {
            field74 = (class152) null;
        }
        field61++;
        this.field72 = arg0;
        if (this.field4175 != null) {
            this.field4175.method326();
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(Z)I", line = 25)
    public final int method16(boolean arg0) {
        if (!arg0) {
            field67 = -67;
        }
        field70++;
        if (class256.field4410 != 0 && this.field72.field4011 != null) {
            class242 var2 = this.field72.method1650(4);
            if (var2 != null && var2.field3982 != -1) {
                return var2.field3982;
            }
        }
        return this.field4171;
    }

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "(I)V", line = 55)
    public static void method17(int arg0) {
        field73 = null;
        field65 = null;
        if (arg0 != 0) {
            field66 = (int[]) null;
        }
        field66 = null;
        field74 = null;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)Z", line = 69)
    public final boolean method18(int arg0) {
        field59++;
        int var2 = -57 % ((arg0 + 16) / 49);
        return this.field72 != null;
    }

    @OriginalMember(owner = "client!qc", name = "finalize", descriptor = "()V", line = 85)
    protected final void finalize() {
        field76++;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IJ)V", line = 92)
    public static final void method19(int arg0, long arg1) {
        field69++;
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == (long) arg0) {
            class227.method1561(arg1 - 1L, 1073741823);
            class227.method1561(1L, 1073741823);
        } else {
            class227.method1561(arg1, arg0 + 1073741823);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIII)V", line = 110)
    public final void method20(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field62++;
        if (this.field72 == null) {
            ;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIIIIIJILmf;)V", line = 130)
    public final void method21(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class47 arg10) {
        field71++;
        if (this.field72 == null) {
            return;
        }
        class141 var13 = this.field4240 != -1 && this.field4216 == 0 ? class133.method851(this.field4240, 123) : null;
        class141 var14 = this.field4224 == -1 || this.field4224 == this.method1706((byte) 70).field4310 && var13 != null ? null : class133.method851(this.field4224, 107);
        class271 var15 = this.field72.method1651(this.field4163, this.field4199, this.field4174, this.field4183, var14, -30, this.field4258, this.field4257, this.field4218, var13);
        if (var15 == null) {
            return;
        }
        this.field4198 = var15.method22();
        class242 var16 = this.field72;
        if (var16.field4011 != null) {
            var16 = var16.method1650(4);
        }
        if (class33.field539 && var16.field4012) {
            class271 var17 = class305.method2129(this.field72.field3963, this.field4231, this.field72.field3961, var14 == null ? this.field4258 : this.field4183, this.field4185, this.field4162, var14 == null ? var13 : var14, arg0, var15, this.field72.field4007, this.field72.field3984, this.field72.field3974, this.field4236, 0);
            if (class217.field3516) {
                float var18 = class217.method1466();
                float var19 = class217.method1489();
                class217.method1479();
                class217.method1465(var18, var19 - 150.0F);
                var17.method21(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field4175);
                class217.method1461();
                class217.method1465(var18, var19);
            } else {
                var17.method21(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field4175);
            }
        }
        this.method1707(var15, (byte) 117);
        this.method1705(22686, var15, arg0);
        class271 var20 = null;
        if (this.field4182 != -1 && this.field4233 != -1) {
            class299 var21 = class189.method1255(this.field4182, (byte) 84);
            var20 = var21.method2093(-30505, this.field4242, this.field4196, this.field4233);
            if (var20 != null) {
                var20.method139(0, -this.field4205, 0);
                if (var21.field5168) {
                    if (class212.field3444 != 0) {
                        var20.method141(class212.field3444);
                    }
                    if (class108.field1551 != 0) {
                        var20.method148(class108.field1551);
                    }
                    if (class314.field5447 != 0) {
                        var20.method139(0, class314.field5447, 0);
                    }
                }
            }
        }
        if (!class217.field3516) {
            if (var20 != null) {
                var15 = ((class21) var15).method155(var20);
            }
            if (this.field72.field3984 == 1) {
                var15.field4630 = true;
            }
            var15.method21(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4175);
            return;
        }
        if (this.field72.field3984 == 1) {
            var15.field4630 = true;
        }
        var15.method21(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4175);
        if (var20 != null) {
            if (this.field72.field3984 == 1) {
                var20.field4630 = true;
            }
            var20.method21(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4175);
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "()I", line = 247)
    public final int method22() {
        field75++;
        return this.field4198;
    }
}
