import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class653 extends class286 {

    @OriginalMember(owner = "client!dq", name = "Q", descriptor = "Ljd;")
    public static class216 field8904 = new class216(0, 1);

    @OriginalMember(owner = "client!dq", name = "S", descriptor = "I")
    public static int field8906 = 0;

    @OriginalMember(owner = "client!dq", name = "T", descriptor = "Ljava/util/Random;")
    public static Random field8907 = new Random();

    @OriginalMember(owner = "client!dq", name = "B", descriptor = "I")
    public static int field8901;

    @OriginalMember(owner = "client!dq", name = "O", descriptor = "I")
    public static int field8902;

    @OriginalMember(owner = "client!dq", name = "P", descriptor = "Lpfa;")
    public static class275 field8903;

    @OriginalMember(owner = "client!dq", name = "R", descriptor = "Lhe;")
    public static class345 field8905;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IB)[[I")
    public final int[][] method23(int arg0, byte arg1) {
        ++field8902;
        int[][] var3 = super.field4850.method2566(-27346, arg0);
        int var4 = -112 % ((31 - arg1) / 42);
        if (super.field4850.field5843 && this.method1723(-126)) {
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            int var8 = arg0 % super.field3628 * super.field3628;
            for (int var9 = 0; ~class528.field6661 < ~var9; ++var9) {
                int var10 = super.field3623[var9 % super.field3627 + var8];
                var7[var9] = class109.method762(4080, var10 << 4);
                var6[var9] = class109.method762(var10 >> 4, 4080);
                var5[var9] = class109.method762(var10, 16711680) >> 12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dq", name = "g", descriptor = "(I)V")
    public static void method3655(int arg0) {
        if (arg0 > -34) {
            field8906 = -8;
        }
        field8907 = null;
        field8903 = null;
        field8904 = null;
        field8905 = null;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(CI)C")
    public static final char method3656(char arg0, int arg1) {
        ++field8901;
        if (arg1 != -25244) {
            return (char) 65472;
        } else if (~arg0 != -33 && arg0 != 160 && arg0 != '_' && ~arg0 != -46) {
            if (arg0 != '[' && ~arg0 != -94 && ~arg0 != -36) {
                if (arg0 != 224 && arg0 != 225 && arg0 != 226 && ~arg0 != -229 && ~arg0 != -228 && arg0 != 192 && ~arg0 != -194 && ~arg0 != -195 && arg0 != 196 && ~arg0 != -196) {
                    if (arg0 != 232 && arg0 != 233 && ~arg0 != -235 && ~arg0 != -236 && ~arg0 != -201 && ~arg0 != -202 && arg0 != 202 && ~arg0 != -204) {
                        if (arg0 != 237 && ~arg0 != -239 && ~arg0 != -240 && ~arg0 != -206 && ~arg0 != -207 && arg0 != 207) {
                            if (~arg0 != -243 && ~arg0 != -244 && arg0 != 244 && arg0 != 246 && ~arg0 != -246 && arg0 != 210 && ~arg0 != -212 && arg0 != 212 && arg0 != 214 && ~arg0 != -214) {
                                if (arg0 != 249 && ~arg0 != -251 && ~arg0 != -252 && ~arg0 != -253 && arg0 != 217 && arg0 != 218 && arg0 != 219 && ~arg0 != -221) {
                                    if (~arg0 != -232 && ~arg0 != -200) {
                                        if (arg0 != 255 && ~arg0 != -377) {
                                            if (~arg0 != -242 && arg0 != 209) {
                                                return ~arg0 == -224 ? 'b' : Character.toLowerCase(arg0);
                                            } else {
                                                return 'n';
                                            }
                                        } else {
                                            return 'y';
                                        }
                                    } else {
                                        return 'c';
                                    }
                                } else {
                                    return 'u';
                                }
                            } else {
                                return 'o';
                            }
                        } else {
                            return 'i';
                        }
                    } else {
                        return 'e';
                    }
                } else {
                    return 'a';
                }
            } else {
                return arg0;
            }
        } else {
            return '_';
        }
    }
}
