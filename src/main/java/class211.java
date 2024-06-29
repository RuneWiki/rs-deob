import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class211 extends class478 {

    @OriginalMember(owner = "client!se", name = "B", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!se", name = "C", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!se", name = "F", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!se", name = "G", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!se", name = "E", descriptor = "Lke;")
    public static class486 field2553;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILnp;I)V")
    public final void method33(int arg0, class115 arg1, int arg2) {
        if (arg2 == 0) {
            super.field6881 = ~arg1.method620((byte) -127) == -2;
        }
        if (arg0 != 255) {
            this.method104(false, 74);
        }
        ++field2555;
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V")
    public class211() {
        super(1, false);
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(III)V")
    private final void method1256(int arg0, int arg1, int arg2) {
        ++field2552;
        int var4 = class684.field9645[arg1];
        int var5 = class695.field9740[arg2];
        float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class87.field872 = arg1;
            class563.field8046 = arg2;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class563.field8046 = arg1;
            class87.field872 = arg2;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class563.field8046 = arg1;
            class87.field872 = -arg2 + class436.field6154;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class563.field8046 = class407.field5435 - arg2;
            class87.field872 = arg1;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class563.field8046 = -arg2 + class407.field5435;
            class87.field872 = -arg1 + class436.field6154;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class87.field872 = -arg2 + class436.field6154;
            class563.field8046 = class407.field5435 - arg1;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class563.field8046 = -arg1 + class407.field5435;
            class87.field872 = arg2;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class87.field872 = -arg1 + class436.field6154;
            class563.field8046 = arg2;
        }
        class563.field8046 &= class156.field1746;
        class87.field872 &= class204.field2414;
        if (arg0 != 23492) {
            method1257(-108);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method104(boolean arg0, int arg1) {
        ++field2551;
        int[][] var3 = super.field6889.method2091(-118, arg1);
        if (super.field6889.field4765) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~var7 > ~class436.field6154; ++var7) {
                this.method1256(23492, var7, arg1);
                int[][] var8 = this.method2753(0, class563.field8046, (byte) 11);
                var4[var7] = var8[0][class87.field872];
                var5[var7] = var8[1][class87.field872];
                var6[var7] = var8[2][class87.field872];
            }
        }
        if (!arg0) {
            field2553 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field2554;
        if (arg1 != -11323) {
            this.method104(true, -118);
        }
        int[] var3 = super.field6886.method789(arg0, (byte) 127);
        if (super.field6886.field1592) {
            for (int var4 = 0; class436.field6154 > var4; ++var4) {
                this.method1256(23492, var4, arg0);
                int[] var5 = this.method2752(class563.field8046, -124, 0);
                var3[var4] = var5[class87.field872];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(I)V")
    public static void method1257(int arg0) {
        if (arg0 != 7574) {
            method1257(93);
        }
        field2553 = null;
    }
}
