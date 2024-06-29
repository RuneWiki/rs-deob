import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class225 extends class43 {

    @OriginalMember(owner = "client!va", name = "cb", descriptor = "Lmb;")
    private static class132 field4077 = class166.method1092("OFF", 114);

    @OriginalMember(owner = "client!va", name = "W", descriptor = "Lmb;")
    public static class132 field4071 = field4077;

    @OriginalMember(owner = "client!va", name = "X", descriptor = "Ljava/util/Random;")
    public static Random field4072 = new Random();

    @OriginalMember(owner = "client!va", name = "db", descriptor = "I")
    public static int field4078 = 0;

    @OriginalMember(owner = "client!va", name = "fb", descriptor = "Lmb;")
    private static class132 field4080 = class166.method1092("Connecting to update server", 124);

    @OriginalMember(owner = "client!va", name = "gb", descriptor = "Lmb;")
    public static class132 field4081 = field4080;

    @OriginalMember(owner = "client!va", name = "T", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!va", name = "U", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!va", name = "V", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!va", name = "Y", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!va", name = "Z", descriptor = "I")
    public static int field4074;

    @OriginalMember(owner = "client!va", name = "ab", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!va", name = "bb", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!va", name = "eb", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V")
    public class225() {
        super(1, false);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IBLkd;)V")
    public final void method200(int arg0, byte arg1, class112 arg2) {
        if (arg1 != -73) {
            this.method64(-107, -92);
        }
        ++field4075;
        if (arg0 == 0) {
            super.field746 = ~arg2.method716(-1308) == -2;
        }
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(Z)V")
    public static void method1437(boolean arg0) {
        field4081 = null;
        field4072 = null;
        field4071 = null;
        field4080 = null;
        if (arg0) {
            method1439(-59, 17, -6, 96, -45, -42);
        }
        field4077 = null;
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(III)V")
    private final void method1438(int arg0, int arg1, int arg2) {
        ++field4073;
        int var4 = class156.field2849[arg2];
        int var5 = class2.field35[arg1];
        float var6 = (float) Math.atan2((double) (arg0 + var4), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class243.field4429 = arg1;
            class208.field3785 = arg2;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class243.field4429 = arg2;
            class208.field3785 = arg1;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class243.field4429 = arg2;
            class208.field3785 = -arg1 + class131.field2427;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class208.field3785 = arg2;
            class243.field4429 = -arg1 + class42.field689;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class208.field3785 = class131.field2427 - arg2;
            class243.field4429 = -arg1 + class42.field689;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class208.field3785 = -arg1 + class131.field2427;
            class243.field4429 = -arg2 + class42.field689;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class208.field3785 = arg1;
            class243.field4429 = -arg2 + class42.field689;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class208.field3785 = -arg2 + class131.field2427;
            class243.field4429 = arg1;
        }
        class243.field4429 &= class185.field3423;
        class208.field3785 &= class90.field1593;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIIII)V")
    public static final void method1439(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 >= class135.field2542 && ~class168.field3083 <= ~arg2 && class169.field3161 <= arg3 && ~class17.field254 <= ~arg4) {
            class81.method498(arg2, (byte) 57, arg4, arg1, arg3, arg5);
        } else {
            class47.method312(4, arg5, arg2, arg4, arg1, arg3);
        }
        ++field4068;
        if (arg0 < 71) {
            field4081 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II)[[I")
    public final int[][] method203(int arg0, int arg1) {
        ++field4069;
        if (arg0 != -1893) {
            method1440(-61, (byte) 10);
        }
        int[][] var3 = super.field764.method1350((byte) 125, arg1);
        if (super.field764.field3960) {
            int[] var4 = var3[2];
            int[] var5 = var3[1];
            int[] var6 = var3[0];
            for (int var7 = 0; var7 < class131.field2427; ++var7) {
                this.method1438(-2048, arg1, var7);
                int[][] var8 = this.method301(class243.field4429, (byte) 58, 0);
                var6[var7] = var8[0][class208.field3785];
                var5[var7] = var8[1][class208.field3785];
                var4[var7] = var8[2][class208.field3785];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IB)I")
    public static final int method1440(int arg0, byte arg1) {
        if (arg1 != -72) {
            return -53;
        } else {
            ++field4074;
            return arg0 >>> 10;
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(II)[I")
    public final int[] method64(int arg0, int arg1) {
        ++field4076;
        int[] var3 = super.field768.method1123(arg1, arg0);
        if (super.field768.field3219) {
            for (int var4 = 0; ~var4 > ~class131.field2427; ++var4) {
                this.method1438(-2048, arg0, var4);
                int[] var5 = this.method300(-126, 0, class243.field4429);
                var3[var4] = var5[class208.field3785];
            }
        }
        return var3;
    }
}
