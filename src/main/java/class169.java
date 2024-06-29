import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class169 extends class83 {

    @OriginalMember(owner = "client!mj", name = "M", descriptor = "I")
    public static int field2133 = 2;

    @OriginalMember(owner = "client!mj", name = "L", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!mj", name = "N", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!mj", name = "O", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!mj", name = "P", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!mj", name = "R", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!mj", name = "S", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!mj", name = "T", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!mj", name = "K", descriptor = "Z")
    public static boolean field2131;

    @OriginalMember(owner = "client!mj", name = "Q", descriptor = "[I")
    public static int[] field2137;

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "()V")
    public class169() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IBLtq;)V")
    public final void method35(int arg0, byte arg1, class250 arg2) {
        ++field2139;
        if (~arg0 == -1) {
            super.field924 = ~arg2.method1350(31351) == -2;
        }
        int var4 = -77 / ((-27 - arg1) / 50);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)[I")
    public final int[] method37(int arg0, int arg1) {
        ++field2134;
        if (arg0 != 2) {
            this.method21(true, 98);
        }
        int[] var3 = super.field916.method1813(arg1, (byte) 24);
        if (super.field916.field4174) {
            for (int var4 = 0; var4 < class420.field6139; ++var4) {
                this.method895(-2048, arg1, var4);
                int[] var5 = this.method451(0, 75, class430.field6309);
                var3[var4] = var5[class384.field5481];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "(I)V")
    public static final void method893(int arg0) {
        class114 var1 = class333.field4426;
        synchronized (class333.field4426) {
            class333.field4426.method613(true);
        }
        ++field2135;
        if (arg0 != 2) {
            field2133 = 66;
        }
        class114 var2 = class131.field1689;
        synchronized (class131.field1689) {
            class131.field1689.method613(true);
        }
    }

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "(B)V")
    public static void method894(byte arg0) {
        field2137 = null;
        if (arg0 != 61) {
            field2131 = true;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method21(boolean arg0, int arg1) {
        ++field2138;
        if (!arg0) {
            field2133 = -11;
        }
        int[][] var3 = super.field927.method1774((byte) 108, arg1);
        if (super.field927.field4104) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; class420.field6139 > var7; ++var7) {
                this.method895(-2048, arg1, var7);
                int[][] var8 = this.method449(0, true, class430.field6309);
                var4[var7] = var8[0][class384.field5481];
                var5[var7] = var8[1][class384.field5481];
                var6[var7] = var8[2][class384.field5481];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "(III)V")
    private final void method895(int arg0, int arg1, int arg2) {
        ++field2136;
        int var4 = class402.field5863[arg2];
        int var5 = class225.field3036[arg1];
        float var6 = (float) Math.atan2((double) (arg0 + var4), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class430.field6309 = arg1;
            class384.field5481 = arg2;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class430.field6309 = arg2;
            class384.field5481 = arg1;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class430.field6309 = arg2;
            class384.field5481 = class420.field6139 - arg1;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class430.field6309 = -arg1 + class91.field1047;
            class384.field5481 = arg2;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class430.field6309 = class91.field1047 - arg1;
            class384.field5481 = -arg2 + class420.field6139;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class384.field5481 = -arg1 + class420.field6139;
            class430.field6309 = -arg2 + class91.field1047;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class384.field5481 = arg1;
            class430.field6309 = -arg2 + class91.field1047;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class430.field6309 = arg1;
            class384.field5481 = -arg2 + class420.field6139;
        }
        class384.field5481 &= class213.field2881;
        class430.field6309 &= class109.field1348;
    }
}
