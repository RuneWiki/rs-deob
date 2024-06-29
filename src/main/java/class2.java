import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class2 extends class144 {

    @OriginalMember(owner = "client!qk", name = "J", descriptor = "I")
    private int field24 = 4;

    @OriginalMember(owner = "client!qk", name = "M", descriptor = "I")
    private int field26 = 4;

    @OriginalMember(owner = "client!qk", name = "Q", descriptor = "I")
    public static int field30 = 99;

    @OriginalMember(owner = "client!qk", name = "U", descriptor = "[I")
    public static int[] field34 = new int[5];

    @OriginalMember(owner = "client!qk", name = "I", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!qk", name = "K", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!qk", name = "N", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!qk", name = "O", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!qk", name = "P", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!qk", name = "R", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!qk", name = "S", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!qk", name = "T", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(BI)[[I")
    public final int[][] method8(byte arg0, int arg1) {
        ++field25;
        if (arg0 != 5) {
            return null;
        } else {
            int[][] var3 = super.field2053.method1542(98, arg1);
            if (super.field2053.field3408) {
                int var4 = class104.field1411 / this.field24;
                int var5 = class257.field3727 / this.field26;
                int[][] var6;
                if (~var5 >= -1) {
                    var6 = this.method927(0, true, 0);
                } else {
                    int var7 = arg1 % var5;
                    var6 = this.method927(class257.field3727 * var7 / var5, true, 0);
                }
                int[] var8 = var6[0];
                int[] var9 = var6[1];
                int[] var10 = var6[2];
                int[] var11 = var3[0];
                int[] var12 = var3[2];
                int[] var13 = var3[1];
                for (int var14 = 0; var14 < class104.field1411; ++var14) {
                    int var15;
                    if (~var4 >= -1) {
                        var15 = 0;
                    } else {
                        int var16 = var14 % var4;
                        var15 = class104.field1411 * var16 / var4;
                    }
                    var11[var14] = var8[var15];
                    var13[var14] = var9[var15];
                    var12[var14] = var10[var15];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILqi;I)V")
    public final void method9(int arg0, class216 arg1, int arg2) {
        ++field33;
        if (arg0 != 0) {
            if (~arg0 == -2) {
                this.field26 = arg1.method1407(arg2 + -20525);
            }
        } else {
            this.field24 = arg1.method1407(103);
        }
        if (arg2 != 20630) {
            method10((class129) null, (byte) -105);
        }
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "()V")
    public class2() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lnb;B)V")
    public static final void method10(class129 arg0, byte arg1) {
        if (arg1 != -91) {
            field31 = 98;
        }
        class95.field1267 = arg0;
        ++field29;
    }

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "(I)V")
    public static void method11(int arg0) {
        field34 = null;
        if (arg0 != 128) {
            method13(false, -37, (class290) null);
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(II)[I")
    public final int[] method12(int arg0, int arg1) {
        ++field28;
        int[] var3 = super.field2069.method425(true, arg0);
        if (super.field2069.field820) {
            int var4 = class104.field1411 / this.field24;
            int var5 = class257.field3727 / this.field26;
            int[] var7;
            if (var5 > 0) {
                int var6 = arg0 % var5;
                var7 = this.method934(-18877, 0, class257.field3727 * var6 / var5);
            } else {
                var7 = this.method934(arg1 ^ -18756, 0, 0);
            }
            for (int var8 = 0; ~class104.field1411 < ~var8; ++var8) {
                if (~var4 >= -1) {
                    var3[var8] = var7[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class104.field1411 * var9 / var4];
                }
            }
        }
        if (arg1 != 255) {
            this.method12(48, 19);
        }
        return var3;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZILlc;)V")
    public static final void method13(boolean arg0, int arg1, class290 arg2) {
        ++field27;
        if (arg2.field4564 > class198.field2819) {
            class60.method369(49, arg2);
        } else if (arg2.field4515 < class198.field2819) {
            class233.method1521((byte) -49, arg2);
        } else {
            class189.method1242(arg2, (byte) 84);
        }
        if (arg0) {
            method10((class129) null, (byte) -57);
        }
        if (~arg2.field4563 > -129 || arg2.field4553 < 128 || arg2.field4563 >= 13184 || ~arg2.field4553 <= -13185) {
            arg2.field4592 = -1;
            arg2.field4515 = 0;
            arg2.field4564 = 0;
            arg2.field4590 = -1;
            arg2.field4563 = arg2.field4597[0] * 128 - -(arg2.method1556(3888) * 64);
            arg2.field4553 = arg2.field4585[0] * 128 - -(64 * arg2.method1556(3888));
            arg2.method1948(-15536);
        }
        if (class177.field2507 == arg2 && (arg2.field4563 < 1536 || ~arg2.field4553 > -1537 || ~arg2.field4563 <= -11777 || ~arg2.field4553 <= -11777)) {
            arg2.field4592 = -1;
            arg2.field4564 = 0;
            arg2.field4515 = 0;
            arg2.field4590 = -1;
            arg2.field4563 = arg2.field4597[0] * 128 - -(64 * arg2.method1556(3888));
            arg2.field4553 = arg2.field4585[0] * 128 - -(arg2.method1556(3888) * 64);
            arg2.method1948(-15536);
        }
        class35.method217((byte) 17, arg2);
        class14.method88((byte) 5, arg2);
    }
}
