import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nfa")
public class class637 extends class615 {

    @OriginalMember(owner = "client!nfa", name = "T", descriptor = "I")
    private int field8585 = -1;

    @OriginalMember(owner = "client!nfa", name = "P", descriptor = "[I")
    public static int[] field8581 = new int[8];

    @OriginalMember(owner = "client!nfa", name = "R", descriptor = "F")
    public static float field8583;

    @OriginalMember(owner = "client!nfa", name = "F", descriptor = "I")
    public static int field8572;

    @OriginalMember(owner = "client!nfa", name = "G", descriptor = "I")
    public static int field8573;

    @OriginalMember(owner = "client!nfa", name = "H", descriptor = "I")
    public static int field8574;

    @OriginalMember(owner = "client!nfa", name = "I", descriptor = "I")
    public static int field8575;

    @OriginalMember(owner = "client!nfa", name = "J", descriptor = "I")
    public static int field8576;

    @OriginalMember(owner = "client!nfa", name = "L", descriptor = "I")
    public static int field8578;

    @OriginalMember(owner = "client!nfa", name = "M", descriptor = "I")
    public int field8579;

    @OriginalMember(owner = "client!nfa", name = "O", descriptor = "I")
    public static int field8580;

    @OriginalMember(owner = "client!nfa", name = "Q", descriptor = "I")
    public int field8582;

    @OriginalMember(owner = "client!nfa", name = "S", descriptor = "I")
    public static int field8584;

    @OriginalMember(owner = "client!nfa", name = "K", descriptor = "[I")
    public int[] field8577;

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IBI)Z")
    public static final boolean method3517(int arg0, byte arg1, int arg2) {
        int var3 = -124 % ((47 - arg1) / 48);
        ++field8573;
        return ~(393216 & arg0) != -1 | class462.method2621(arg2, arg0, false) || class304.method1843(arg0, -6515, arg2);
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(II)[[I")
    public int[][] method223(int arg0, int arg1) {
        if (arg0 != 2) {
            this.field8582 = -56;
        }
        ++field8580;
        int[][] var3 = super.field8129.method2654(false, arg1);
        if (super.field8129.field6315 && this.method3521(true)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = this.field8582 * (class471.field6301 != this.field8579 ? this.field8579 * arg1 / class471.field6301 : arg1);
            if (class505.field6740 == this.field8582) {
                for (int var8 = 0; var8 < class505.field6740; ++var8) {
                    int var9 = this.field8577[var7++];
                    var6[var8] = class571.method3139(4080, var9 << 4);
                    var5[var8] = class571.method3139(65280, var9) >> 4;
                    var4[var8] = class571.method3139(16711680, var9) >> 12;
                }
            } else {
                for (int var10 = 0; ~class505.field6740 < ~var10; ++var10) {
                    int var11 = this.field8582 * var10 / class505.field6740;
                    int var12 = this.field8577[var7 - -var11];
                    var6[var10] = class571.method3139(255, var12) << 4;
                    var5[var10] = class571.method3139(4080, var12 >> 4);
                    var4[var10] = class571.method3139(var12 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(ILii;)[Lnga;")
    public static final class480[] method3518(int arg0, class519 arg1) {
        ++field8575;
        if (!arg1.method2893(arg0 ^ 8080)) {
            return new class480[0];
        } else {
            class192 var2 = arg1.method2902(108);
            while (~var2.field2816 == -1) {
                class486.method2722(0, 10L);
            }
            if (var2.field2816 == 2) {
                return new class480[0];
            } else {
                if (arg0 != -8114) {
                    field8581 = null;
                }
                int[] var3 = (int[]) var2.field2820;
                class480[] var4 = new class480[var3.length >> 2];
                for (int var5 = 0; var5 < var4.length; ++var5) {
                    class480 var6 = new class480();
                    var4[var5] = var6;
                    var6.field6403 = var3[var5 << 2];
                    var6.field6410 = var3[(var5 << 2) - -1];
                    var6.field6401 = var3[(var5 << 2) - -2];
                    var6.field6406 = var3[(var5 << 2) + 3];
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!nfa", name = "b", descriptor = "(I)I")
    public final int method3365(int arg0) {
        if (arg0 != -1) {
            this.method15((byte) 119, 117, (class335) null);
        }
        ++field8572;
        return this.field8585;
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Lgba;I)Lgba;")
    public static final class625 method3519(class625 arg0, int arg1) {
        ++field8584;
        if (arg0.field8288 != -1) {
            return class153.method1078(65535, arg0.field8288);
        } else if (arg1 != 2122911660) {
            return null;
        } else {
            int var2 = arg0.field8327 >>> 16;
            class53 var3 = new class53(class264.field3667);
            for (class140 var4 = (class140) var3.method357(-1337); var4 != null; var4 = (class140) var3.method358(-1)) {
                if (~var4.field2256 == ~var2) {
                    return class153.method1078(65535, (int) var4.field6724);
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(B)V")
    public final void method3144(byte arg0) {
        ++field8574;
        super.method3144(arg0);
        this.field8577 = null;
    }

    @OriginalMember(owner = "client!nfa", name = "<init>", descriptor = "()V")
    public class637() {
        super(0, false);
    }

    @OriginalMember(owner = "client!nfa", name = "f", descriptor = "(I)V")
    public static void method3520(int arg0) {
        field8581 = null;
        if (arg0 != 16711680) {
            field8583 = 0.38784888F;
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(BILeh;)V")
    public final void method15(byte arg0, int arg1, class335 arg2) {
        if (~arg1 == -1) {
            this.field8585 = arg2.method2001((byte) -83);
        }
        if (arg0 >= 44) {
            ++field8578;
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Z)Z")
    public final boolean method3521(boolean arg0) {
        ++field8576;
        if (!arg0) {
            method3518(-88, (class519) null);
        }
        if (this.field8577 != null) {
            return true;
        } else if (~this.field8585 <= -1) {
            class500 var2 = class551.field7338 >= 0 ? class500.method2770(class541.field7122, class551.field7338, this.field8585) : class500.method2780(class541.field7122, this.field8585);
            var2.method2773();
            this.field8577 = var2.method2771();
            this.field8579 = var2.field6700;
            this.field8582 = var2.field6698;
            return true;
        } else {
            return false;
        }
    }
}
