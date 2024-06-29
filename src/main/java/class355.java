import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class355 extends class346 {

    @OriginalMember(owner = "client!ck", name = "I", descriptor = "Ljava/lang/String;")
    public static String field5257 = "Allocated memory";

    @OriginalMember(owner = "client!ck", name = "L", descriptor = "I")
    public static int field5259 = 0;

    @OriginalMember(owner = "client!ck", name = "K", descriptor = "Ljava/lang/String;")
    public static String field5258 = "Loading defaults - ";

    @OriginalMember(owner = "client!ck", name = "N", descriptor = "I")
    public static int field5261 = 0;

    @OriginalMember(owner = "client!ck", name = "P", descriptor = "I")
    public static int field5263 = 0;

    @OriginalMember(owner = "client!ck", name = "M", descriptor = "I")
    public static int field5260;

    @OriginalMember(owner = "client!ck", name = "O", descriptor = "I")
    public static int field5262;

    @OriginalMember(owner = "client!ck", name = "Q", descriptor = "I")
    public static int field5264;

    @OriginalMember(owner = "client!ck", name = "R", descriptor = "I")
    public static int field5265;

    @OriginalMember(owner = "client!ck", name = "S", descriptor = "I")
    public static int field5266;

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "()V")
    public class355() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(II)[I")
    public final int[] method45(int arg0, int arg1) {
        if (arg1 != 3) {
            method2334(true);
        }
        ++field5264;
        int[] var3 = super.field5152.method1409((byte) 48, arg0);
        if (super.field5152.field3004) {
            for (int var4 = 0; ~var4 > ~class134.field1753; ++var4) {
                this.method2335(var4, (byte) -41, arg0);
                int[] var5 = this.method2294((byte) 54, class264.field3888, 0);
                var3[var4] = var5[class348.field5187];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lfb;ZI)V")
    public final void method38(class341 arg0, boolean arg1, int arg2) {
        ++field5265;
        if (arg1) {
            method2334(true);
        }
        if (arg2 == 0) {
            super.field5151 = ~arg0.method2233((byte) 104) == -2;
        }
    }

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "(Z)V")
    public static void method2334(boolean arg0) {
        if (!arg0) {
            field5262 = -84;
        }
        field5257 = null;
        field5258 = null;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IBI)V")
    private final void method2335(int arg0, byte arg1, int arg2) {
        ++field5260;
        int var4 = class361.field5340[arg0];
        int var5 = class436.field6337[arg2];
        float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (var5 - 2048));
        if (arg1 == -41) {
            if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
                class264.field3888 = arg2;
                class348.field5187 = arg0;
            } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
                class348.field5187 = arg2;
                class264.field3888 = arg0;
            } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
                class264.field3888 = arg0;
                class348.field5187 = -arg2 + class134.field1753;
            } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
                class348.field5187 = arg0;
                class264.field3888 = -arg2 + class370.field5474;
            } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
                class348.field5187 = -arg0 + class134.field1753;
                class264.field3888 = -arg2 + class370.field5474;
            } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
                class264.field3888 = class370.field5474 - arg0;
                class348.field5187 = -arg2 + class134.field1753;
            } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
                class348.field5187 = arg2;
                class264.field3888 = -arg0 + class370.field5474;
            } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
                class264.field3888 = arg2;
                class348.field5187 = -arg0 + class134.field1753;
            }
            class264.field3888 &= class215.field3000;
            class348.field5187 &= class188.field2572;
        }
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(II)[[I")
    public final int[][] method287(int arg0, int arg1) {
        ++field5266;
        int[][] var3 = super.field5170.method2701(0, arg0);
        if (arg1 >= -3) {
            field5259 = -109;
        }
        if (super.field5170.field6288) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~class134.field1753 < ~var7; ++var7) {
                this.method2335(var7, (byte) -41, arg0);
                int[][] var8 = this.method2293(0, 0, class264.field3888);
                var4[var7] = var8[0][class348.field5187];
                var5[var7] = var8[1][class348.field5187];
                var6[var7] = var8[2][class348.field5187];
            }
        }
        return var3;
    }
}
