import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class262 {

    @OriginalMember(owner = "client!l", name = "d", descriptor = "Lof;")
    public class422 field3518 = new class422();

    @OriginalMember(owner = "client!l", name = "k", descriptor = "I")
    public static int field3525 = 0;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "Lof;")
    private class422 field3523;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "Lkb;")
    public static class80 field3517;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)Lof;", line = 4)
    public final class422 method1682(int arg0) {
        if (arg0 != -32687) {
            this.method1687(36);
        }
        field3522++;
        class422 var2 = this.field3523;
        if (this.field3518 == var2) {
            this.field3523 = null;
            return null;
        } else {
            this.field3523 = var2.field5911;
            return var2;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lof;I)V", line = 24)
    public final void method1683(class422 arg0, int arg1) {
        if (arg0.field5906 != null) {
            arg0.method2601(7);
        }
        if (arg1 != -17086) {
            return;
        }
        field3519++;
        arg0.field5911 = this.field3518;
        arg0.field5906 = this.field3518.field5906;
        arg0.field5906.field5911 = arg0;
        arg0.field5911.field5906 = arg0;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V", line = 42)
    public static void method1684(int arg0) {
        if (arg0 > 107) {
            field3517 = null;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ZJ)Ljava/lang/String;", line = 55)
    public static final String method1685(boolean arg0, long arg1) {
        field3515++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else if (arg0) {
            int var3 = 0;
            long var4 = arg1;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                var6.append(class19.field376[(int) (var7 - arg1 * 37L)]);
            }
            return var6.reverse().toString();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IBIIIIII)V", line = 94)
    public static final void method1686(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3521++;
        int var8 = 26 % ((53 - arg1) / 51);
        if (arg2 == arg7) {
            class75.method647(arg4, arg0, arg6, arg5, -26812, arg7, arg3);
        } else if ((arg6 - arg7) >= class433.field6144 && (arg6 + arg7) <= class69.field1047 && class39.field595 <= arg4 - arg2 && arg4 + arg2 <= class134.field1917) {
            class193.method1385(arg7, arg6, arg3, arg5, arg2, arg4, 114, arg0);
        } else {
            class42.method403(arg3, arg4, 1016544257, arg2, arg6, arg7, arg5, arg0);
        }
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(I)Lof;", line = 122)
    public final class422 method1687(int arg0) {
        field3526++;
        class422 var2 = this.field3518.field5911;
        if (arg0 != -32591) {
            field3525 = -91;
        }
        if (this.field3518 == var2) {
            this.field3523 = null;
            return null;
        } else {
            this.field3523 = var2.field5911;
            return var2;
        }
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V", line = 212)
    public class262() {
        this.field3518.field5906 = this.field3518;
        this.field3518.field5911 = this.field3518;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)I", line = 156)
    public static final int method1688(byte arg0) {
        field3520++;
        return arg0 >= -50 ? -46 : ((class148.field2284 == 0 ? 0 : 1) << 21) + ((class177.field2610 ? 1 : 0) << 19) + (class41.field630 << 17) + ((class130.field1846 ? 1 : 0) << 16) + ((class385.field5429 ? 1 : 0) << 13) + ((class179.field2633 & 0x3) << 11) + ((class109.field1580 ? 1 : 0) << 8) + ((class416.field5823 ? 1 : 0) << 6) + ((class162.field2401 ? 1 : 0) << 5) + ((class173.field2554 ? 1 : 0) << 4) + ((class73.field1095 & 0x7) - -((class215.field2978 ? 1 : 0) << 3)) + (((class40.field626 == 0 ? 0 : 1) << 20) + ((class331.field4504 == 0 ? 0 : 1) << 22) + (class170.method1275(false) << 23) + (class275.field3703 << 25) + ((class26.field467 ? 1 : 0) << 27) - -(class447.field6440 << 28)) - (-((class441.field6352 ? 1 : 0) << 9) - ((class61.field952 ? 1 : 0) << 10) - ((class223.field3086 ? 1 : 0) << 15));
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(B)V", line = 167)
    public final void method1689(byte arg0) {
        while (true) {
            class422 var2 = this.field3518.field5911;
            if (this.field3518 == var2) {
                field3516++;
                this.field3523 = null;
                int var3 = -65 % ((arg0 + 64) / 38);
                return;
            }
            var2.method2601(7);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lrk;BI)Lqe;", line = 187)
    public static final class148 method1690(class427 arg0, byte arg1, int arg2) {
        field3524++;
        byte[] var3 = arg0.method2656(arg1 + 120, arg2);
        if (arg1 == -20) {
            return var3 == null ? null : new class148(var3);
        } else {
            return null;
        }
    }
}
