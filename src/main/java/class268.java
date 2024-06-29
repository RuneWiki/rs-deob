import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class268 extends class74 {

    @OriginalMember(owner = "client!sa", name = "R", descriptor = "I")
    public static int field4270 = 0;

    @OriginalMember(owner = "client!sa", name = "M", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!sa", name = "N", descriptor = "I")
    public static int field4266;

    @OriginalMember(owner = "client!sa", name = "O", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!sa", name = "P", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!sa", name = "Q", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!sa", name = "S", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public static final boolean method1819(byte arg0, String arg1) {
        ++field4267;
        if (arg0 <= 71) {
            method1819((byte) -1, (String) null);
        }
        if (arg1 == null) {
            return false;
        } else {
            for (int var2 = 0; var2 < class132.field2037; ++var2) {
                if (arg1.equalsIgnoreCase(class107.field1711[var2])) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)[I")
    public final int[] method448(int arg0, int arg1) {
        ++field4269;
        int[] var3 = super.field1254.method1328((byte) -108, arg1);
        if (arg0 != 4) {
            field4270 = -13;
        }
        if (super.field1254.field3118) {
            for (int var4 = 0; ~var4 > ~class178.field2662; ++var4) {
                this.method1821(false, var4, arg1);
                int[] var5 = this.method590(0, 0, class102.field1632);
                var3[var4] = var5[class249.field3843];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method1820(int arg0, int arg1, int arg2, long arg3) {
        class23 var5 = class255.field3907[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field344 != null && var5.field344.field3564 == arg3) {
            return true;
        } else if (var5.field356 != null && var5.field356.field3820 == arg3) {
            return true;
        } else if (var5.field363 != null && var5.field363.field2686 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field360; ++var6) {
                if (var5.field358[var6].field2569 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IB)[[I")
    public final int[][] method82(int arg0, byte arg1) {
        ++field4265;
        if (arg1 > -112) {
            this.method82(116, (byte) -35);
        }
        int[][] var3 = super.field1248.method269(false, arg0);
        if (super.field1248.field550) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; class178.field2662 > var7; ++var7) {
                this.method1821(false, var7, arg0);
                int[][] var8 = this.method592(class102.field1632, 0, 116);
                var4[var7] = var8[0][class249.field3843];
                var5[var7] = var8[1][class249.field3843];
                var6[var7] = var8[2][class249.field3843];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZII)V")
    private final void method1821(boolean arg0, int arg1, int arg2) {
        ++field4268;
        if (!arg0) {
            int var4 = class224.field3522[arg1];
            int var5 = class207.field3212[arg2];
            float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (var5 + -2048));
            if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
                class249.field3843 = arg1;
                class102.field1632 = arg2;
            } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
                class102.field1632 = arg1;
                class249.field3843 = arg2;
            } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
                class249.field3843 = -arg2 + class178.field2662;
                class102.field1632 = arg1;
            } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
                class249.field3843 = arg1;
                class102.field1632 = class209.field3248 - arg2;
            } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
                class249.field3843 = class178.field2662 - arg1;
                class102.field1632 = -arg2 + class209.field3248;
            } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
                class102.field1632 = class209.field3248 - arg1;
                class249.field3843 = -arg2 + class178.field2662;
            } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
                class102.field1632 = class209.field3248 - arg1;
                class249.field3843 = arg2;
            } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
                class102.field1632 = arg2;
                class249.field3843 = -arg1 + class178.field2662;
            }
            class102.field1632 &= class218.field3419;
            class249.field3843 &= class129.field2012;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BLf;I)V")
    public final void method80(byte arg0, class37 arg1, int arg2) {
        ++field4271;
        if (~arg2 == -1) {
            super.field1245 = ~arg1.method333((byte) -59) == -2;
        }
        if (arg0 != -79) {
            method1820(-26, -7, -74, 60L);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IC)Z")
    public static final boolean method1822(int arg0, char arg1) {
        int var2 = 76 % ((6 - arg0) / 47);
        ++field4266;
        return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || ~arg1 <= -98 && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V")
    public class268() {
        super(1, false);
    }
}
