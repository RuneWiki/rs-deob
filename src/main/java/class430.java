import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class430 extends class83 {

    @OriginalMember(owner = "client!oh", name = "Q", descriptor = "I")
    private int field6314 = 3072;

    @OriginalMember(owner = "client!oh", name = "N", descriptor = "I")
    private int field6311 = 1024;

    @OriginalMember(owner = "client!oh", name = "U", descriptor = "I")
    private int field6318 = 2048;

    @OriginalMember(owner = "client!oh", name = "M", descriptor = "[[I")
    public static int[][] field6310 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!oh", name = "L", descriptor = "I")
    public static int field6309 = 0;

    @OriginalMember(owner = "client!oh", name = "K", descriptor = "I")
    public static int field6308;

    @OriginalMember(owner = "client!oh", name = "O", descriptor = "I")
    public static int field6312;

    @OriginalMember(owner = "client!oh", name = "P", descriptor = "I")
    public static int field6313;

    @OriginalMember(owner = "client!oh", name = "R", descriptor = "I")
    public static int field6315;

    @OriginalMember(owner = "client!oh", name = "S", descriptor = "I")
    public static int field6316;

    @OriginalMember(owner = "client!oh", name = "V", descriptor = "I")
    public static int field6319;

    @OriginalMember(owner = "client!oh", name = "W", descriptor = "I")
    public static int field6320;

    @OriginalMember(owner = "client!oh", name = "T", descriptor = "Lam;")
    public static class286 field6317;

    @OriginalMember(owner = "client!oh", name = "X", descriptor = "[[[B")
    public static byte[][][] field6321;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IBLtq;)V", line = 3)
    public final void method35(int arg0, byte arg1, class250 arg2) {
        ++field6315;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    super.field924 = ~arg2.method1350(31351) == -2;
                }
            } else {
                this.field6314 = arg2.method1374(-2);
            }
        } else {
            this.field6311 = arg2.method1374(-2);
        }
        int var5 = -15 % ((-27 - arg1) / 50);
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "()V", line = 48)
    public class430() {
        super(1, false);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)[I", line = 56)
    public final int[] method37(int arg0, int arg1) {
        ++field6312;
        int[] var3 = super.field916.method1813(arg1, (byte) 120);
        if (super.field916.field4174) {
            int[] var4 = this.method451(0, arg0 ^ 119, arg1);
            for (int var5 = 0; class420.field6139 > var5; ++var5) {
                var3[var5] = (var4[var5] * this.field6318 >> 12) + this.field6311;
            }
        }
        if (arg0 != 2) {
            field6310 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IC)C", line = 92)
    public static final char method2658(int arg0, char arg1) {
        ++field6308;
        if (arg1 == 198) {
            return 'E';
        } else if (~arg1 == -231) {
            return 'e';
        } else {
            if (arg0 != -126574868) {
                method2658(24, (char) 65490);
            }
            if (arg1 == 223) {
                return 's';
            } else if (~arg1 == -339) {
                return 'E';
            } else {
                return (char) (arg1 == 339 ? 'e' : '\u0000');
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lfd;I)Ljava/lang/String;", line = 120)
    public static final String method2659(class194 arg0, int arg1) {
        ++field6313;
        if (~client.method1410(arg0).method1180((byte) 88) == -1) {
            return null;
        } else {
            if (arg1 != 9) {
                method2659((class194) null, -40);
            }
            if (arg0.field2467 != null && arg0.field2467.trim().length() != 0) {
                return arg0.field2467;
            } else {
                return class318.field4237 ? "Hidden-use" : null;
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(Z)V", line = 161)
    public final void method120(boolean arg0) {
        if (arg0) {
            method2658(-95, ':');
        }
        ++field6320;
        this.field6318 = -this.field6311 + this.field6314;
    }

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "(B)V", line = 173)
    public static void method2660(byte arg0) {
        if (arg0 != -124) {
            field6316 = -116;
        }
        field6310 = null;
        field6321 = null;
        field6317 = null;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZI)[[I", line = 185)
    public final int[][] method21(boolean arg0, int arg1) {
        ++field6319;
        int[][] var3 = super.field927.method1774((byte) 106, arg1);
        if (super.field927.field4104) {
            int[][] var4 = this.method449(0, true, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class420.field6139 < ~var11; ++var11) {
                var8[var11] = (var5[var11] * this.field6318 >> 12) + this.field6311;
                var9[var11] = (var6[var11] * this.field6318 >> 12) + this.field6311;
                var10[var11] = (var7[var11] * this.field6318 >> 12) + this.field6311;
            }
        }
        return !arg0 ? null : var3;
    }
}
