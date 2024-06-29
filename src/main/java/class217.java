import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public abstract class class217 extends class674 {

    @OriginalMember(owner = "client!fw", name = "C", descriptor = "S")
    public short field3072;

    @OriginalMember(owner = "client!fw", name = "D", descriptor = "I")
    public static int field3073 = -2;

    @OriginalMember(owner = "client!fw", name = "y", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!fw", name = "z", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!fw", name = "A", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!fw", name = "B", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!fw", name = "E", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!fw", name = "F", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!fw", name = "G", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!fw", name = "H", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!fw", name = "I", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(I[Lkb;)I")
    public final int method344(int arg0, class757[] arg1) {
        ++field3068;
        int var3 = super.field9490 >> class509.field7106;
        int var4 = super.field9489 >> class509.field7106;
        int var5 = -109 / ((35 - arg0) / 58);
        int var6 = 0;
        if (~class126.field1717 != ~var3) {
            if (var3 > class126.field1717) {
                var6 += 2;
            }
        } else {
            ++var6;
        }
        if (~class157.field2139 == ~var4) {
            var6 += 3;
        } else if (~var4 > ~class157.field2139) {
            var6 += 6;
        }
        int var7 = class736.field10300[var6];
        if ((this.field3072 & var7) != 0) {
            return this.method3864(var4, arg1, var3, 0);
        } else if (~this.field3072 == -2 && ~var3 < -1) {
            return this.method3864(var4, arg1, var3 + -1, 0);
        } else if (this.field3072 == 4 && class485.field6556 >= var3) {
            return this.method3864(var4, arg1, var3 + 1, 0);
        } else if (~this.field3072 == -9 && var4 > 0) {
            return this.method3864(var4 + -1, arg1, var3, 0);
        } else if (this.field3072 == 2 && var4 <= class314.field4059) {
            return this.method3864(var4 - -1, arg1, var3, 0);
        } else if (this.field3072 == 16 && var3 > 0 && class314.field4059 >= var4) {
            return this.method3864(var4 - -1, arg1, var3 - 1, 0);
        } else if (~this.field3072 == -33 && var3 <= class485.field6556 && class314.field4059 >= var4) {
            return this.method3864(var4 + 1, arg1, var3 + 1, 0);
        } else if (~this.field3072 == -129 && ~var3 < -1 && ~var4 < -1) {
            return this.method3864(var4 - 1, arg1, var3 - 1, 0);
        } else if (~this.field3072 == -65 && var3 <= class485.field6556 && ~var4 < -1) {
            return this.method3864(var4 - 1, arg1, var3 + 1, 0);
        } else {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "(Z)Z")
    public final boolean method342(boolean arg0) {
        ++field3070;
        return arg0 ? false : class359.field4594[(super.field9490 >> class509.field7106) + -class126.field1717 + class707.field9874][(super.field9489 >> class509.field7106) - -class707.field9874 + -class157.field2139];
    }

    @OriginalMember(owner = "client!fw", name = "l", descriptor = "(I)V")
    public static final void method1419(int arg0) {
        class593.field8546.method1385((byte) -97);
        ++field3075;
        int var1 = -25 / ((arg0 - -61) / 48);
        class632.field9003.method661(false);
        class644.field9138.method661(false);
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(III)V")
    public static final void method1420(int arg0, int arg1, int arg2) {
        if (arg2 != -6248) {
            method1422(113, -23, 67, -64, -63);
        }
        ++field3076;
        if (class393.method2393(arg0, -1)) {
            class736.method4085(arg1, class491.field6599[arg0], 0);
        }
    }

    @OriginalMember(owner = "client!fw", name = "c", descriptor = "(Lha;I)V")
    public static final void method1421(class545 arg0, int arg1) {
        if (class484.field6549) {
            class379.method2310(arg0, 56);
        } else {
            class479.method2831(arg0, 4);
        }
        ++field3069;
        if (arg1 != 1) {
            method1420(-74, -78, 42);
        }
    }

    @OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(IIIIII)V")
    public class217(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super.field9489 = arg2;
        super.field9502 = arg1;
        super.field9501 = (byte) arg3;
        super.field9490 = arg0;
        this.field3072 = (short) arg5;
        super.field9495 = (byte) arg4;
    }

    @OriginalMember(owner = "client!fw", name = "i", descriptor = "(I)Z")
    public final boolean method339(int arg0) {
        if (arg0 != 32188) {
            method1421((class545) null, 48);
        }
        ++field3074;
        return class455.method2736(super.field9489 >> class509.field7106, super.field9495, false, this, super.field9490 >> class509.field7106);
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(IIIII)V")
    public static final void method1422(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3078;
        if (class589.field8461 == 1) {
            int var5 = arg3 / class61.field829;
            int var6 = arg0 / class61.field829;
            int var7 = arg4 / class459.field6317;
            int var8 = arg1 / class459.field6317;
            if (var5 < class209.field2976 && ~var6 <= -1 && class446.field6100 > var7 && ~var8 <= -1) {
                if (arg2 > -89) {
                    field3073 = -37;
                }
                if (~var7 > -1) {
                    var7 = 0;
                }
                if (class209.field2976 <= var6) {
                    var6 = class209.field2976 - 1;
                }
                if (~var8 <= ~class446.field6100) {
                    var8 = class446.field6100 + -1;
                }
                if (var5 < 0) {
                    var5 = 0;
                }
                for (int var9 = var7; var9 <= var8; ++var9) {
                    int var10 = class611.method3569(2439, class11.field136 + var9, class446.field6100) * class209.field2976;
                    for (int var11 = var5; ~var6 <= ~var11; ++var11) {
                        int var12 = class611.method3569(2439, class717.field10140 + var11, class209.field2976) + var10;
                        class38.field530[var12] = class677.field9538;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(III[BII)V")
    public static final void method1423(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        ++field3077;
        if (~arg4 > ~arg0) {
            int var6 = arg4 + arg5;
            int var7 = -arg4 + arg0 >> 2;
            while (true) {
                --var7;
                if (~var7 > -1) {
                    if (arg1 > -82) {
                        method1421((class545) null, 83);
                    }
                    int var8 = -arg4 + arg0 & 3;
                    while (true) {
                        --var8;
                        if (~var8 > -1) {
                            return;
                        }
                        arg3[var6++] = 1;
                    }
                }
                arg3[var6++] = 1;
                arg3[var6++] = 1;
                arg3[var6++] = 1;
                arg3[var6++] = 1;
            }
        }
    }
}
