import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public abstract class class429 implements class113 {

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "Lbi;")
    private class449 field5892;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "Lbi;")
    public class449 field5888;

    @OriginalMember(owner = "client!sj", name = "n", descriptor = "Lvn;")
    public class288 field5899;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "Lcu;")
    public static class206 field5887 = new class206(54, 7);

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
    public static int field5886;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
    public static int field5889;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
    private int field5890;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
    public static int field5891;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "I")
    public static int field5893;

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "I")
    public static int field5894;

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "I")
    public static int field5896;

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "I")
    public static int field5897;

    @OriginalMember(owner = "client!sj", name = "o", descriptor = "I")
    public static int field5900;

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "J")
    private long field5895;

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "Lta;")
    private class200 field5898;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)Z", line = 4)
    public boolean method913(int arg0) {
        field5893++;
        boolean var2 = true;
        if (!this.field5888.method2549(this.field5899.field4074, 3015)) {
            var2 = false;
        }
        if (!this.field5892.method2549(this.field5899.field4074, 3015)) {
            var2 = false;
        }
        if (arg0 <= 13) {
            this.field5892 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(B)V", line = 33)
    public static void method2446(byte arg0) {
        int var1 = -104 % ((-arg0 - 81) / 45);
        field5887 = null;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZI)V", line = 43)
    public final void method912(boolean arg0, int arg1) {
        field5886++;
        int var3 = this.field5899.field4065.method1358(0, this.field5899.field4067, class641.field8619) + this.field5899.field4064;
        int var4 = this.field5899.field4069.method3790(this.field5899.field4075, 116, class305.field4229) + this.field5899.field4073;
        this.method1181(var4, var3, 126, arg0);
        this.method1179(arg1 ^ 0xFFFFAF47, var4, var3, arg0);
        String var5 = class2.field11.method1437((byte) -52);
        if (class681.method3802(-23600) - this.field5895 > 10000L) {
            var5 = var5 + " (" + class2.field11.method1445(115).method3070((byte) -56) + ")";
        }
        if (arg1 == -20667) {
            this.field5898.method1303(var5, var3 + (this.field5899.field4067 / 2), this.field5899.field4075 / 2 + this.field5899.field4070 + var4 + 4, this.field5899.field4066, 8364, -1);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIB)V", line = 68)
    public static final void method2447(int arg0, int arg1, byte arg2) {
        field5897++;
        class382 var3 = class396.method2276(arg2 ^ 0xFFFFFF85, 12, arg1);
        var3.method2232(125);
        if (arg2 == 55) {
            var3.field5099 = arg0;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)V", line = 83)
    public void method911(byte arg0) {
        field5900++;
        if (arg0 != -13) {
            this.field5890 = -74;
        }
        class511 var2 = class154.method1084(this.field5892, (byte) 40, this.field5899.field4074);
        this.field5898 = class10.field197.method389(var2, class500.method2769(this.field5888, this.field5899.field4074), true);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lbi;II)Lxa;", line = 98)
    public static final class468 method2448(class449 arg0, int arg1, int arg2) {
        if (arg1 != 18638) {
            field5887 = null;
        }
        field5896++;
        return class442.field6057 ? class10.field197.method440(class500.method2780(arg0, arg2), true) : class154.method1081(2, arg0.method2531(arg2, 0));
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZZ)I", line = 114)
    public static final int method2449(boolean arg0, boolean arg1) {
        field5894++;
        if (class201.field2935 == null) {
            return 0;
        } else if (arg0 || class511.field6819 == null) {
            int var2 = 0;
            for (int var3 = 0; var3 < class201.field2935.length; var3++) {
                int var4 = class201.field2935[var3];
                if (class484.field6544.method2549(var4, 3015)) {
                    var2++;
                }
                if (class172.field2652.method2549(var4, 3015)) {
                    var2++;
                }
            }
            if (arg1) {
                return -120;
            } else {
                return var2;
            }
        } else {
            return class201.field2935.length * 2;
        }
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lbi;Lbi;Lvn;)V", line = 156)
    public class429(class449 arg0, class449 arg1, class288 arg2) {
        this.field5892 = arg1;
        this.field5888 = arg0;
        this.field5899 = arg2;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)I", line = 167)
    public final int method2450(int arg0) {
        field5889++;
        if (arg0 != 7555) {
            this.method912(false, 117);
        }
        int var2 = class2.field11.method1435((byte) 108);
        int var3 = var2 * 100;
        if (this.field5890 == var2 && var2 != 0) {
            int var4 = class2.field11.method1442(arg0 ^ 0x1DE7);
            if (var2 < var4) {
                long var5 = this.field5895 - class2.field11.method1444(true);
                if (var5 > 0L) {
                    long var7 = var5 * 10000L / (long) var2 * (long) (var4 - var2);
                    long var9 = (class681.method3802(arg0 ^ 0xFFFFBE53) - this.field5895) * 10000L;
                    if (var9 >= var7) {
                        var3 = var4 * 100;
                    } else {
                        var3 = (int) ((long) (var4 - var2) * var9 * 100L / var7 + (long) (var2 * 100));
                    }
                }
            }
        } else {
            this.field5890 = var2;
            this.field5895 = class681.method3802(-23600);
        }
        return var3;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIZ)V")
    public abstract void method1179(int arg0, int arg1, int arg2, boolean arg3);

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(IIIZ)V")
    public abstract void method1181(int arg0, int arg1, int arg2, boolean arg3);
}
