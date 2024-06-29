import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class252 extends class12 implements class267 {

    @OriginalMember(owner = "client!kf", name = "z", descriptor = "Z")
    private boolean field4076;

    @OriginalMember(owner = "client!kf", name = "I", descriptor = "Z")
    private boolean field4085;

    @OriginalMember(owner = "client!kf", name = "K", descriptor = "B")
    private byte field4087;

    @OriginalMember(owner = "client!kf", name = "B", descriptor = "B")
    private byte field4078;

    @OriginalMember(owner = "client!kf", name = "J", descriptor = "S")
    private short field4086;

    @OriginalMember(owner = "client!kf", name = "v", descriptor = "Z")
    private boolean field4072;

    @OriginalMember(owner = "client!kf", name = "M", descriptor = "Z")
    private boolean field4089;

    @OriginalMember(owner = "client!kf", name = "Q", descriptor = "Le;")
    private class536 field4092;

    @OriginalMember(owner = "client!kf", name = "S", descriptor = "Li;")
    private class521 field4094;

    @OriginalMember(owner = "client!kf", name = "C", descriptor = "I")
    public static int field4079 = 0;

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!kf", name = "u", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!kf", name = "w", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!kf", name = "x", descriptor = "I")
    public static int field4074;

    @OriginalMember(owner = "client!kf", name = "y", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!kf", name = "A", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!kf", name = "D", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!kf", name = "E", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!kf", name = "F", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!kf", name = "G", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!kf", name = "H", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!kf", name = "L", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!kf", name = "N", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!kf", name = "O", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!kf", name = "R", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!kf", name = "T", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!kf", name = "U", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!kf", name = "V", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1736(int arg0, byte arg1, int arg2) {
        if (arg1 > -59) {
            field4075 = 82;
        }
        ++field4082;
        return ~(arg0 & 2048) != -1;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)V")
    public final void method100(boolean arg0) {
        ++field4081;
        if (this.field4092 != null) {
            this.field4092.method303();
        }
        if (arg0) {
            this.method938(-82, (class497) null, 54, true, (byte) 31, -15, (class484) null);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lza;ZII)Loh;")
    private final class445 method1737(class497 arg0, boolean arg1, int arg2, int arg3) {
        ++field4090;
        class156 var5 = class454.field7029.method3002(-1, 65535 & this.field4086);
        class223 var6;
        class223 var7;
        if (!this.field4085) {
            var6 = class244.field3956[this.field4078];
            if (this.field4078 < 3) {
                var7 = class244.field3956[this.field4078 + 1];
            } else {
                var7 = null;
            }
        } else {
            var6 = class103.field1520[this.field4078];
            var7 = class244.field3956[0];
        }
        if (arg2 < 12) {
            this.method107(true, (class497) null, 1);
        }
        return var5.method958(arg1, super.field126, super.field120, arg3, var7, 22, super.field129, (byte) -106, var6, arg0, this.field4087);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)I")
    public final int method96(byte arg0) {
        if (arg0 <= 87) {
            field4079 = -123;
        }
        ++field4070;
        return 65535 & this.field4086;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BIIII)V")
    public static final void method1738(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4071;
        int var5 = 0;
        int var6 = arg3;
        int var7 = -69 % ((arg0 - -39) / 62);
        int var8 = -arg3;
        int var9 = -1;
        int var10 = class405.method2598(class460.field7096, class178.field2609, arg3 + arg4, (byte) 109);
        int var11 = class405.method2598(class460.field7096, class178.field2609, -arg3 + arg4, (byte) 97);
        class280.method1888(var11, var10, (byte) 82, class103.field1521[arg2], arg1);
        while (var5 < var6) {
            var9 += 2;
            var8 += var9;
            if (~var8 < -1) {
                --var6;
                var8 -= var6 << 1;
                int var12 = -var6 + arg2;
                int var13 = arg2 + var6;
                if (~var13 <= ~class462.field7105 && var12 <= class222.field3750) {
                    int var14 = class405.method2598(class460.field7096, class178.field2609, arg4 + var5, (byte) 79);
                    int var15 = class405.method2598(class460.field7096, class178.field2609, -var5 + arg4, (byte) 100);
                    if (var13 <= class222.field3750) {
                        class280.method1888(var15, var14, (byte) 82, class103.field1521[var13], arg1);
                    }
                    if (var12 >= class462.field7105) {
                        class280.method1888(var15, var14, (byte) 82, class103.field1521[var12], arg1);
                    }
                }
            }
            ++var5;
            int var16 = -var5 + arg2;
            int var17 = arg2 + var5;
            if (~var17 <= ~class462.field7105 && ~var16 >= ~class222.field3750) {
                int var18 = class405.method2598(class460.field7096, class178.field2609, arg4 + var6, (byte) 91);
                int var19 = class405.method2598(class460.field7096, class178.field2609, arg4 - var6, (byte) 91);
                if (var17 <= class222.field3750) {
                    class280.method1888(var19, var18, (byte) 82, class103.field1521[var17], arg1);
                }
                if (var16 >= class462.field7105) {
                    class280.method1888(var19, var18, (byte) 82, class103.field1521[var16], arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(ILza;)V")
    public final void method102(int arg0, class497 arg1) {
        if (arg0 == -1) {
            ++field4074;
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)V")
    public final void method934(int arg0) {
        ++field4069;
        if (arg0 != 287) {
            this.field4076 = false;
        }
        this.field4076 = false;
        if (this.field4092 != null) {
            this.field4092.method290(this.field4092.method308() & -65537);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILza;IZBILbm;)V")
    public final void method938(int arg0, class497 arg1, int arg2, boolean arg3, byte arg4, int arg5, class484 arg6) {
        ++field4083;
        int var8 = -17 / ((27 - arg4) / 32);
        if (arg6 instanceof class252) {
            class252 var9 = (class252) arg6;
            if (this.field4092 != null && var9.field4092 != null) {
                this.field4092.method268(var9.field4092, arg5, arg0, arg2, arg3);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)Z")
    public final boolean method103(int arg0) {
        ++field4088;
        return arg0 >= -95 ? true : this.field4089;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lza;Loq;IIIIZIZ)V")
    public class252(class497 arg0, class156 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        super(arg3, arg4, arg5, arg1.field2120, arg1.field2106, arg1.field2086);
        this.field4076 = arg8;
        this.field4085 = arg6;
        this.field4087 = (byte) arg7;
        this.field4078 = (byte) arg2;
        this.field4086 = (short) arg1.field2082;
        this.field4072 = ~arg1.field2079 != -1 && !arg6;
        super.field120 = arg5;
        super.field129 = arg3;
        this.field4089 = arg0.method1279() && arg1.field2122 && !this.field4085 && class141.field1911.method2603((byte) 90, class452.field7013) != 0;
        int var10 = 2048;
        if (this.field4076) {
            var10 |= 65536;
        }
        class445 var11 = this.method1737(arg0, this.field4089, 120, var10);
        if (var11 != null) {
            this.field4092 = var11.field6911;
            this.field4094 = var11.field6913;
            if (this.field4076) {
                this.field4092 = this.field4092.method329((byte) 0, var10, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(B)I")
    public final int method106(byte arg0) {
        if (arg0 != 18) {
            return 32;
        } else {
            ++field4097;
            return this.field4087;
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(ILza;)Lon;")
    public final class514 method108(int arg0, class497 arg1) {
        ++field4093;
        if (this.field4092 == null) {
            return null;
        } else {
            class205 var3 = arg1.method1231();
            if (arg0 != 2) {
                return null;
            } else {
                var3.method158(super.field129, super.field126, super.field120);
                class514 var4 = null;
                if (this.field4072) {
                    var4 = class104.method706(0, 1);
                }
                this.field4092.method295(var3, var4 != null ? var4.field7629[0] : null, 0);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZLza;I)Le;")
    public final class536 method107(boolean arg0, class497 arg1, int arg2) {
        if (arg0) {
            this.field4076 = false;
        }
        ++field4073;
        return this.method1739(arg2, arg1, (byte) -19);
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(Z)Z")
    public final boolean method936(boolean arg0) {
        if (arg0) {
            return true;
        } else {
            ++field4091;
            return this.field4076;
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(B)I")
    public final int method99(byte arg0) {
        if (arg0 < 53) {
            return -86;
        } else {
            ++field4084;
            return 22;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIILza;)Z")
    public final boolean method105(int arg0, int arg1, int arg2, class497 arg3) {
        ++field4077;
        class536 var5 = this.method1739(131072, arg3, (byte) -19);
        if (var5 != null) {
            class205 var6 = arg3.method1231();
            var6.method158(super.field129, super.field126, super.field120);
            return var5.method298(arg0, arg2, var6, false);
        } else {
            if (arg1 != 32689) {
                this.method1739(59, (class497) null, (byte) -47);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILza;B)Le;")
    private final class536 method1739(int arg0, class497 arg1, byte arg2) {
        ++field4096;
        if (this.field4092 != null && ~arg1.method1299(this.field4092.method308(), arg0) == -1) {
            return this.field4092;
        } else if (arg2 != -19) {
            return null;
        } else {
            class445 var4 = this.method1737(arg1, false, arg2 ^ -73, arg0);
            return var4 == null ? null : var4.field6911;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILza;)V")
    public final void method97(int arg0, class497 arg1) {
        ++field4080;
        Object var3 = null;
        class521 var5;
        if (this.field4094 == null && this.field4089) {
            class445 var4 = this.method1737(arg1, true, 123, 262144);
            var5 = var4 == null ? null : var4.field6913;
        } else {
            var5 = this.field4094;
            this.field4094 = null;
        }
        if (arg0 == -6682) {
            if (var5 != null) {
                class174.method1090(var5, this.field4078, super.field129, super.field120, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lza;I)V")
    public final void method104(class497 arg0, int arg1) {
        ++field4095;
        if (arg1 != 26768) {
            this.method936(true);
        }
        Object var3 = null;
        class521 var5;
        if (this.field4094 == null && this.field4089) {
            class445 var4 = this.method1737(arg0, true, 110, 262144);
            var5 = var4 == null ? null : var4.field6913;
        } else {
            var5 = this.field4094;
            this.field4094 = null;
        }
        if (var5 != null) {
            class220.method1611(var5, this.field4078, super.field129, super.field120, (boolean[]) null);
        }
    }
}
