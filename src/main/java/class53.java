import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class53 {

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public int field1111 = -1;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "[[S")
    public static short[][] field1110 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "Ljd;")
    public static class92 field1114 = class202.method1325((byte) 90, "sch-Utteln:");

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field1109 = -1;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "Lmd;")
    public class120 field1113;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "[I")
    public int[] field1106;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "[I")
    public static int[] field1108;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "[Lsc;")
    public static class173[] field1112;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "[Ljd;")
    public class92[] field1115;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
    public static void method313(int arg0) {
        field1114 = null;
        field1108 = null;
        field1110 = null;
        field1112 = null;
        if (arg0 != -27322) {
            field1114 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIII)Z")
    public static final boolean method314(int arg0, int arg1, int arg2, int arg3) {
        if (!class15.method92(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class158.field3146[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class129.field2601) {
                    if (!class80.method543(var4, var6, var5)) {
                        return false;
                    }
                    if (!class80.method543(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class80.method543(var4, var7, var5)) {
                        return false;
                    }
                    if (!class80.method543(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class80.method543(var4, var8, var5)) {
                    return false;
                }
                if (!class80.method543(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class92.field1829) {
                    if (!class80.method543(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class80.method543(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class80.method543(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class80.method543(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class80.method543(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class80.method543(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class129.field2601) {
                    if (!class80.method543(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class80.method543(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class80.method543(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class80.method543(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class80.method543(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class80.method543(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class92.field1829) {
                    if (!class80.method543(var4, var6, var5)) {
                        return false;
                    }
                    if (!class80.method543(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class80.method543(var4, var7, var5)) {
                        return false;
                    }
                    if (!class80.method543(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class80.method543(var4, var8, var5)) {
                    return false;
                }
                if (!class80.method543(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class80.method543(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class80.method543(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class80.method543(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class80.method543(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class80.method543(var4, var8, var5);
        } else {
            return true;
        }
    }
}
