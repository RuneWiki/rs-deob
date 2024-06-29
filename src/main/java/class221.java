import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class221 extends class264 {

    @OriginalMember(owner = "client!nb", name = "R", descriptor = "J")
    public static long field3190 = 0L;

    @OriginalMember(owner = "client!nb", name = "U", descriptor = "I")
    public static int field3193 = -1;

    @OriginalMember(owner = "client!nb", name = "N", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!nb", name = "O", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!nb", name = "P", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!nb", name = "Q", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!nb", name = "T", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!nb", name = "S", descriptor = "[[[J")
    public static long[][][] field3191;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(IBI)V")
    private final void method1519(int arg0, byte arg1, int arg2) {
        ++field3186;
        if (arg1 == -109) {
            int var4 = class151.field2084[arg0];
            int var5 = class379.field5216[arg2];
            float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
            if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
                class108.field1505 = arg2;
                class211.field3081 = arg0;
            } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
                class211.field3081 = arg2;
                class108.field1505 = arg0;
            } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
                class108.field1505 = arg0;
                class211.field3081 = -arg2 + class478.field6792;
            } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
                class211.field3081 = arg0;
                class108.field1505 = -arg2 + class129.field1772;
            } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
                class108.field1505 = -arg2 + class129.field1772;
                class211.field3081 = -arg0 + class478.field6792;
            } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
                class108.field1505 = -arg0 + class129.field1772;
                class211.field3081 = -arg2 + class478.field6792;
            } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
                class211.field3081 = arg2;
                class108.field1505 = class129.field1772 - arg0;
            } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
                class211.field3081 = -arg0 + class478.field6792;
                class108.field1505 = arg2;
            }
            class108.field1505 &= class301.field4265;
            class211.field3081 &= class205.field3007;
        }
    }

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "(I)V")
    public static void method1520(int arg0) {
        if (arg0 >= -110) {
            field3191 = null;
        }
        field3191 = null;
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V")
    public class221() {
        super(1, false);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BLnl;)V")
    public static final void method1521(byte arg0, class435 arg1) {
        if (arg0 != -89) {
            method1521((byte) -64, (class435) null);
        }
        ++field3187;
        class364.field5006 = arg1;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BLkk;I)V")
    public final void method7(byte arg0, class161 arg1, int arg2) {
        ++field3192;
        if (~arg2 == -1) {
            super.field3794 = arg1.method1172((byte) -126) == 1;
        }
        if (arg0 < 31) {
            method1520(-29);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)[I")
    public final int[] method90(int arg0, int arg1) {
        if (arg1 != 21034) {
            this.method90(-127, -44);
        }
        ++field3189;
        int[] var3 = super.field3808.method958((byte) 102, arg0);
        if (super.field3808.field1732) {
            for (int var4 = 0; class478.field6792 > var4; ++var4) {
                this.method1519(var4, (byte) -109, arg0);
                int[] var5 = this.method1788(class108.field1505, (byte) -55, 0);
                var3[var4] = var5[class211.field3081];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(BI)[[I")
    public final int[][] method5(byte arg0, int arg1) {
        ++field3188;
        int[][] var3 = super.field3816.method1928((byte) 52, arg1);
        if (arg0 != 116) {
            field3191 = null;
        }
        if (super.field3816.field4208) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~var7 > ~class478.field6792; ++var7) {
                this.method1519(var7, (byte) -109, arg1);
                int[][] var8 = this.method1782(class108.field1505, (byte) 123, 0);
                var4[var7] = var8[0][class211.field3081];
                var5[var7] = var8[1][class211.field3081];
                var6[var7] = var8[2][class211.field3081];
            }
        }
        return var3;
    }
}
