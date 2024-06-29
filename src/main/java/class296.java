import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class296 {

    @OriginalMember(owner = "client!fm", name = "k", descriptor = "B")
    private byte field4982;

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "I")
    public int field4980;

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "I")
    public int field4978;

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "I")
    public int field4974;

    @OriginalMember(owner = "client!fm", name = "n", descriptor = "I")
    public int field4985;

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "I")
    public int field4977;

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "[I")
    public static int[] field4979 = new int[256];

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "[Z")
    public static boolean[] field4975 = new boolean[100];

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "Lma;")
    public static class5 field4976 = class12.method119("::noclip", (byte) 87);

    @OriginalMember(owner = "client!fm", name = "o", descriptor = "F")
    public static float field4986;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "I")
    public static int field4972;

    @OriginalMember(owner = "client!fm", name = "j", descriptor = "I")
    public static int field4981;

    @OriginalMember(owner = "client!fm", name = "l", descriptor = "I")
    public static int field4983;

    @OriginalMember(owner = "client!fm", name = "m", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!fm", name = "p", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!fm", name = "q", descriptor = "I")
    public static int field4988;

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "J")
    public static long field4973;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V", line = 4)
    public static void method1990(int arg0) {
        if (arg0 == -15550) {
            field4979 = null;
            field4975 = null;
            field4976 = null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIII)V", line = 21)
    public static final void method1991(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class284.field4811 = class139.field2066 * arg4 / arg0;
        field4987++;
        if (arg3 <= 115) {
            method1993(-59L, -75);
        }
        class14.field269 = class97.field1460 * arg1 / arg2;
        class171.field2634 = -1;
        class153.field2240 = -1;
        class113.method747((byte) -32);
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(I)I", line = 36)
    public final int method1992(int arg0) {
        field4981++;
        int var2 = -18 % ((arg0 - 33) / 52);
        return this.field4982 & 0x7;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(JI)V", line = 46)
    public static final void method1993(long arg0, int arg1) {
        field4988++;
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class275.field4698; var3++) {
            if (class168.field2565[var3] == arg0) {
                class189.field2956++;
                class275.field4698--;
                for (int var4 = var3; var4 < class275.field4698; var4++) {
                    class244.field4048[var4] = class244.field4048[var4 + 1];
                    class49.field771[var4] = class49.field771[var4 + 1];
                    class127.field1912[var4] = class127.field1912[var4 + 1];
                    class168.field2565[var4] = class168.field2565[var4 + 1];
                    class91.field1376[var4] = class91.field1376[var4 + 1];
                    class33.field516[var4] = class33.field516[var4 + 1];
                }
                class228.field3777 = class303.field5107;
                class147.field2127.method1389((byte) -39, 48);
                class147.field2127.method1548(false, arg0);
                break;
            }
        }
        if (arg1 != 23297) {
            field4979 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "(I)I", line = 94)
    public final int method1994(int arg0) {
        field4984++;
        if (arg0 != 2) {
            field4973 = 53L;
        }
        return (this.field4982 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "(I)I", line = 125)
    public static final int method1995(int arg0) {
        field4972++;
        int var1 = -114 / ((arg0 - 53) / 33);
        return class106.field1581;
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "()V", line = 146)
    public class296() {
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Lii;)V", line = 148)
    public class296(class221 arg0) {
        this.field4982 = arg0.method1543(false);
        this.field4980 = arg0.method1524((byte) 55);
        this.field4978 = arg0.method1517((byte) -112);
        this.field4974 = arg0.method1517((byte) -111);
        this.field4985 = arg0.method1517((byte) -125);
        this.field4977 = arg0.method1517((byte) -120);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIII)Z", line = 162)
    public static final boolean method1996(int arg0, int arg1, int arg2, int arg3) {
        if (!class24.method188(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class208.field3304[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class211.field3365) {
                    if (!class232.method1653(var4, var6, var5)) {
                        return false;
                    }
                    if (!class232.method1653(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class232.method1653(var4, var7, var5)) {
                        return false;
                    }
                    if (!class232.method1653(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class232.method1653(var4, var8, var5)) {
                    return false;
                }
                if (!class232.method1653(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class57.field898) {
                    if (!class232.method1653(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class232.method1653(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class232.method1653(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class232.method1653(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class232.method1653(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class232.method1653(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class211.field3365) {
                    if (!class232.method1653(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class232.method1653(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class232.method1653(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class232.method1653(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class232.method1653(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class232.method1653(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class57.field898) {
                    if (!class232.method1653(var4, var6, var5)) {
                        return false;
                    }
                    if (!class232.method1653(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class232.method1653(var4, var7, var5)) {
                        return false;
                    }
                    if (!class232.method1653(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class232.method1653(var4, var8, var5)) {
                    return false;
                }
                if (!class232.method1653(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class232.method1653(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class232.method1653(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class232.method1653(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class232.method1653(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class232.method1653(var4, var8, var5);
        } else {
            return true;
        }
    }
}
