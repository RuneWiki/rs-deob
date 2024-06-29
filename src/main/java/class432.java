import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class432 extends class354 {

    @OriginalMember(owner = "client!ai", name = "P", descriptor = "I")
    public static int field6573 = 0;

    @OriginalMember(owner = "client!ai", name = "K", descriptor = "I")
    public static int field6568;

    @OriginalMember(owner = "client!ai", name = "L", descriptor = "I")
    public static int field6569;

    @OriginalMember(owner = "client!ai", name = "M", descriptor = "I")
    public static int field6570;

    @OriginalMember(owner = "client!ai", name = "N", descriptor = "I")
    public static int field6571;

    @OriginalMember(owner = "client!ai", name = "O", descriptor = "I")
    public static int field6572;

    @OriginalMember(owner = "client!ai", name = "Q", descriptor = "I")
    public static int field6574;

    @OriginalMember(owner = "client!ai", name = "S", descriptor = "I")
    public static int field6576;

    @OriginalMember(owner = "client!ai", name = "R", descriptor = "Lmf;")
    public static class293 field6575;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(B)V")
    public static final void method2637(byte arg0) {
        ++field6576;
        if (!class465.field6936) {
            if (arg0 < 4) {
                method2637((byte) -83);
            }
            class498.method2968(-63, class453.field6825);
            if (class35.field516 != null) {
                class498.method2968(-30, class35.field516);
            }
            class465.field6936 = true;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lnj;II)V")
    public final void method272(class164 arg0, int arg1, int arg2) {
        if (arg2 == 1638) {
            ++field6570;
            if (~arg1 == -1) {
                super.field5466 = arg0.method1087(false) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZII)V")
    private final void method2638(boolean arg0, int arg1, int arg2) {
        ++field6574;
        if (!arg0) {
            int var4 = class195.field2616[arg1];
            int var5 = class350.field5392[arg2];
            float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (var5 + -2048));
            if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
                class111.field1559 = arg1;
                class482.field7109 = arg2;
            } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
                class111.field1559 = arg2;
                class482.field7109 = arg1;
            } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
                class111.field1559 = -arg2 + class531.field7814;
                class482.field7109 = arg1;
            } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
                class482.field7109 = -arg2 + class33.field511;
                class111.field1559 = arg1;
            } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
                class482.field7109 = class33.field511 - arg2;
                class111.field1559 = -arg1 + class531.field7814;
            } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
                class111.field1559 = -arg2 + class531.field7814;
                class482.field7109 = -arg1 + class33.field511;
            } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
                class482.field7109 = -arg1 + class33.field511;
                class111.field1559 = arg2;
            } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
                class111.field1559 = -arg1 + class531.field7814;
                class482.field7109 = arg2;
            }
            class482.field7109 &= class423.field6453;
            class111.field1559 &= class179.field2409;
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(BI)[I")
    public final int[] method270(byte arg0, int arg1) {
        ++field6569;
        int[] var3 = super.field5478.method2522(arg1, 16863);
        if (arg0 >= -74) {
            field6573 = 21;
        }
        if (super.field5478.field6213) {
            for (int var4 = 0; var4 < class531.field7814; ++var4) {
                this.method2638(false, var4, arg1);
                int[] var5 = this.method2275((byte) 115, 0, class482.field7109);
                var3[var4] = var5[class111.field1559];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IB)[[I")
    public final int[][] method354(int arg0, byte arg1) {
        ++field6568;
        int[][] var3 = super.field5474.method2414((byte) -102, arg0);
        if (super.field5474.field5870) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~var7 > ~class531.field7814; ++var7) {
                this.method2638(false, var7, arg0);
                int[][] var8 = this.method2274((byte) 84, class482.field7109, 0);
                var4[var7] = var8[0][class111.field1559];
                var5[var7] = var8[1][class111.field1559];
                var6[var7] = var8[2][class111.field1559];
            }
        }
        int var9 = 26 % ((48 - arg1) / 60);
        return var3;
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V")
    public class432() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "(I)V")
    public static void method2639(int arg0) {
        field6575 = null;
        if (arg0 >= -27) {
            method2639(119);
        }
    }
}
