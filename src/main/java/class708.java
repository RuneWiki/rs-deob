import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tea")
public class class708 {

    @OriginalMember(owner = "client!tea", name = "f", descriptor = "Lbo;")
    private class28 field9879 = new class28();

    @OriginalMember(owner = "client!tea", name = "m", descriptor = "Lca;")
    private class119 field9886 = new class119();

    @OriginalMember(owner = "client!tea", name = "l", descriptor = "I")
    private int field9885;

    @OriginalMember(owner = "client!tea", name = "k", descriptor = "I")
    private int field9884;

    @OriginalMember(owner = "client!tea", name = "j", descriptor = "Lbc;")
    private class9 field9883;

    @OriginalMember(owner = "client!tea", name = "d", descriptor = "I")
    public static int field9877 = -1;

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "[I")
    public static int[] field9874 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!tea", name = "b", descriptor = "I")
    public static int field9875;

    @OriginalMember(owner = "client!tea", name = "c", descriptor = "I")
    public static int field9876;

    @OriginalMember(owner = "client!tea", name = "e", descriptor = "I")
    public static int field9878;

    @OriginalMember(owner = "client!tea", name = "g", descriptor = "I")
    public static int field9880;

    @OriginalMember(owner = "client!tea", name = "h", descriptor = "I")
    public static int field9881;

    @OriginalMember(owner = "client!tea", name = "i", descriptor = "I")
    public static int field9882;

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(Lmca;)V", line = 11)
    public static final void method3876(class34 arg0) {
        for (int var1 = arg0.field497; var1 <= arg0.field501; var1++) {
            for (int var2 = arg0.field502; var2 <= arg0.field505; var2++) {
                class530 var3 = class483.field6438[arg0.field508][var1][var2];
                if (var3 != null) {
                    class571 var4 = var3.field6887;
                    class571 var5 = null;
                    while (var4 != null) {
                        if (var4.field7444 == arg0) {
                            if (var5 == null) {
                                var3.field6887 = var4.field7445;
                            } else {
                                var5.field7445 = var4.field7445;
                            }
                            var4.method3049((byte) 111);
                            break;
                        }
                        var5 = var4;
                        var4 = var4.field7445;
                    }
                    var3.field6884 = 0;
                    for (class571 var6 = var3.field6887; var6 != null; var6 = var6.field7445) {
                        var3.field6884 = (byte) (var3.field6884 | var6.field7443);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(I)V", line = 64)
    public final void method3877(int arg0) {
        if (arg0 != 2) {
            this.field9885 = 84;
        }
        this.field9886.method896(13);
        field9882++;
        this.field9883.method41(arg0 + 60);
        this.field9879 = new class28();
        this.field9885 = this.field9884;
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(FFFB)I", line = 81)
    public static final int method3878(float arg0, float arg1, float arg2, byte arg3) {
        field9875++;
        float var4 = (arg1 < 0.0F) ? -arg1 : arg1;
        if (arg3 <= 64) {
            field9877 = -88;
        }
        float var5 = arg0 < 0.0F ? -arg0 : arg0;
        float var6 = arg2 < 0.0F ? -arg2 : arg2;
        if (var4 < var5 && var5 > var6) {
            return (arg0 > 0.0F) ? 0 : 1;
        } else if (var6 > var4 && var6 > var5) {
            return (arg2 > 0.0F) ? 2 : 3;
        } else if (arg1 > 0.0F) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(Z)V", line = 125)
    public static void method3879(boolean arg0) {
        field9874 = null;
        if (!arg0) {
            field9874 = null;
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(JI)Lbo;", line = 139)
    public final class28 method3880(long arg0, int arg1) {
        field9880++;
        if (arg1 > -15) {
            return null;
        }
        class28 var4 = (class28) this.field9883.method39(arg0, 31750);
        if (var4 != null) {
            this.field9886.method890((byte) -103, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(JBLbo;)V", line = 169)
    public final void method3881(long arg0, byte arg1, class28 arg2) {
        field9876++;
        if (this.field9885 == 0) {
            class28 var5 = this.field9886.method893((byte) 112);
            var5.method2438((byte) 114);
            var5.method237((byte) -109);
            if (this.field9879 == var5) {
                class28 var6 = this.field9886.method893((byte) 127);
                var6.method2438((byte) 5);
                var6.method237((byte) -125);
            }
        } else {
            this.field9885--;
        }
        int var7 = 18 / ((arg1 - 72) / 52);
        this.field9883.method38(arg2, -127, arg0);
        this.field9886.method890((byte) -107, arg2);
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(I[BZ)Ljava/lang/Object;", line = 197)
    public static final Object method3882(int arg0, byte[] arg1, boolean arg2) {
        field9878++;
        if (arg1 == null) {
            return null;
        }
        if (arg0 > ~arg1.length && !class572.field7451) {
            try {
                class602 var3 = (class602) Class.forName("ll").getDeclaredConstructor().newInstance();
                var3.method2680(arg0 ^ 0x2FC2, arg1);
                return var3;
            } catch (Throwable var4) {
                class572.field7451 = true;
            }
        }
        return arg2 ? class71.method570(-1623, arg1) : arg1;
    }

    @OriginalMember(owner = "client!tea", name = "<init>", descriptor = "(I)V", line = 282)
    public class708(int arg0) {
        this.field9885 = arg0;
        this.field9884 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field9883 = new class9(var2);
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(Ljq;IZ)V", line = 245)
    public static final void method3883(class348 arg0, int arg1, boolean arg2) {
        field9881++;
        if (arg2 || class202.field2639 >= 50 || arg0 == null || arg0.field4461 == null || arg0.field4461.length <= arg1 || arg0.field4461[arg1] == null) {
            return;
        }
        int var3 = arg0.field4461[arg1][0];
        int var4 = var3 >> 8;
        if (arg0.field4461[arg1].length > 1) {
            int var5 = (int) (Math.random() * (double) arg0.field4461[arg1].length);
            if (var5 > 0) {
                var4 = arg0.field4461[arg1][var5];
            }
        }
        int var6 = (var3 & 0xE5) >> 5;
        if (arg0.field4455) {
            class285.method1700(var6, var4, (byte) 111, 0, false, 255);
        } else {
            class520.method2795(false, 255, var4, var6, 0);
        }
    }
}
