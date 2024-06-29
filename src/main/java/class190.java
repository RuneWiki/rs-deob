import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public class class190 {

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "[I")
    public static int[] field2759 = new int[4];

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "I")
    public int field2758;

    @OriginalMember(owner = "client!hba", name = "c", descriptor = "I")
    public int field2760;

    @OriginalMember(owner = "client!hba", name = "d", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!hba", name = "e", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!hba", name = "f", descriptor = "I")
    public int field2763;

    @OriginalMember(owner = "client!hba", name = "g", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!hba", name = "h", descriptor = "I")
    public int field2765;

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(BII)Z", line = 3)
    public static final boolean method1262(byte arg0, int arg1, int arg2) {
        if (arg0 != -23) {
            method1262((byte) 104, 102, 29);
        }
        field2762++;
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(IBIII[III)Z", line = 26)
    public static final boolean method1263(int arg0, byte arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7) {
        field2764++;
        int var8 = -33 % ((arg1 + 63) / 47);
        if (arg7 < 0) {
            arg7 = 0;
        }
        if (arg2 > class102.field1460) {
            arg2 = class102.field1460;
        }
        if (arg2 <= arg7) {
            return true;
        }
        int var9 = arg0 * arg7 + arg4;
        int var10 = arg7 + arg3 - 1;
        int var11 = arg2 - arg7 >> 2;
        if (class209.field2969 == 1) {
            class129.field1762 += var11;
            while (true) {
                var11--;
                int var10000;
                if (var11 < 0) {
                    int var12 = arg2 - arg7 & 0x3;
                    while (true) {
                        var12--;
                        if (var12 < 0) {
                            return true;
                        }
                        var10000 = ~var9;
                        var10++;
                        if (var10000 > ~arg5[var10]) {
                            arg5[var10] = var9;
                        }
                        var9 += arg0;
                    }
                }
                var10000 = ~var9;
                var10++;
                if (var10000 > ~arg5[var10]) {
                    arg5[var10] = var9;
                }
                int var13 = arg0 + var9;
                var10++;
                if (arg5[var10] > var13) {
                    arg5[var10] = var13;
                }
                int var14 = arg0 + var13;
                var10++;
                if (var14 < arg5[var10]) {
                    arg5[var10] = var14;
                }
                int var15 = arg0 + var14;
                var10++;
                if (arg5[var10] > var15) {
                    arg5[var10] = var15;
                }
                var9 = arg0 + var15;
            }
        } else {
            int var16 = var9 - 38400;
            while (true) {
                var11--;
                if (var11 < 0) {
                    int var17 = arg2 - arg7 & 0x3;
                    while (true) {
                        var17--;
                        if (var17 < 0) {
                            return true;
                        }
                        var10++;
                        if (arg5[var10] > var16) {
                            return false;
                        }
                        var16 += arg0;
                    }
                }
                var10++;
                if (arg5[var10] > var16) {
                    return false;
                }
                int var18 = arg0 + var16;
                var10++;
                if (arg5[var10] > var18) {
                    return false;
                }
                int var19 = arg0 + var18;
                var10++;
                if (arg5[var10] > var19) {
                    return false;
                }
                int var20 = arg0 + var19;
                var10++;
                if (var20 < arg5[var10]) {
                    return false;
                }
                var16 = arg0 + var20;
            }
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(I)V", line = 121)
    public static void method1264(int arg0) {
        if (arg0 != -1) {
            field2761 = 39;
        }
        field2759 = null;
    }
}
