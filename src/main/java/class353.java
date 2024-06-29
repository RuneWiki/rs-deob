import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class353 {

    @OriginalMember(owner = "client!jo", name = "x", descriptor = "I")
    private int field4974 = 0;

    @OriginalMember(owner = "client!jo", name = "q", descriptor = "[Llq;")
    public class577[] field4967;

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "I")
    public int field4954;

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "I")
    public static int field4955 = 0;

    @OriginalMember(owner = "client!jo", name = "l", descriptor = "I")
    public static int field4962 = 0;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "I")
    public static int field4951;

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "I")
    public static int field4952;

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!jo", name = "f", descriptor = "I")
    public static int field4956;

    @OriginalMember(owner = "client!jo", name = "g", descriptor = "I")
    public static int field4957;

    @OriginalMember(owner = "client!jo", name = "i", descriptor = "I")
    public static int field4959;

    @OriginalMember(owner = "client!jo", name = "j", descriptor = "I")
    public static int field4960;

    @OriginalMember(owner = "client!jo", name = "k", descriptor = "I")
    public static int field4961;

    @OriginalMember(owner = "client!jo", name = "m", descriptor = "I")
    public static int field4963;

    @OriginalMember(owner = "client!jo", name = "o", descriptor = "I")
    public static int field4965;

    @OriginalMember(owner = "client!jo", name = "r", descriptor = "I")
    public static int field4968;

    @OriginalMember(owner = "client!jo", name = "s", descriptor = "I")
    public static int field4969;

    @OriginalMember(owner = "client!jo", name = "v", descriptor = "I")
    public static int field4972;

    @OriginalMember(owner = "client!jo", name = "w", descriptor = "I")
    public static int field4973;

    @OriginalMember(owner = "client!jo", name = "y", descriptor = "I")
    public static int field4975;

    @OriginalMember(owner = "client!jo", name = "h", descriptor = "J")
    private long field4958;

    @OriginalMember(owner = "client!jo", name = "p", descriptor = "Lso;")
    public static class494 field4966;

    @OriginalMember(owner = "client!jo", name = "t", descriptor = "Llq;")
    private class577 field4970;

    @OriginalMember(owner = "client!jo", name = "u", descriptor = "Llq;")
    private class577 field4971;

    @OriginalMember(owner = "client!jo", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field4964;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(II)I", line = 4)
    public static final int method2239(int arg0, int arg1) {
        field4960++;
        if (arg0 != -1950670936) {
            field4975 = -55;
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V", line = 16)
    public final void method2240(int arg0) {
        for (int var2 = 0; var2 < this.field4954; var2++) {
            class577 var4 = this.field4967[var2];
            while (true) {
                class577 var5 = var4.field8131;
                if (var4 == var5) {
                    break;
                }
                var5.method3387((byte) 119);
            }
        }
        int var3 = 4 / ((arg0 + 31) / 52);
        field4959++;
        this.field4970 = null;
        this.field4971 = null;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IJLlq;)V", line = 48)
    public final void method2241(int arg0, long arg1, class577 arg2) {
        field4973++;
        if (arg2.field8128 != null) {
            arg2.method3387((byte) -14);
        }
        class577 var5 = this.field4967[(int) (arg1 & (long) (this.field4954 - 1))];
        arg2.field8128 = var5.field8128;
        arg2.field8131 = var5;
        arg2.field8128.field8131 = arg2;
        arg2.field8131.field8128 = arg2;
        int var6 = 53 / ((-arg0 - 6) / 33);
        arg2.field8133 = arg1;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(JI)Llq;", line = 67)
    public final class577 method2242(long arg0, int arg1) {
        this.field4958 = arg0;
        field4972++;
        class577 var4 = this.field4967[(int) (arg0 & (long) (this.field4954 + arg1))];
        for (this.field4970 = var4.field8131; this.field4970 != var4; this.field4970 = this.field4970.field8131) {
            if (this.field4970.field8133 == arg0) {
                class577 var5 = this.field4970;
                this.field4970 = this.field4970.field8131;
                return var5;
            }
        }
        this.field4970 = null;
        return null;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(B)Llq;", line = 95)
    public final class577 method2243(byte arg0) {
        if (arg0 != 100) {
            this.field4954 = 103;
        }
        this.field4974 = 0;
        field4963++;
        return this.method2248(-15690);
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Z)I", line = 108)
    public final int method2244(boolean arg0) {
        if (arg0) {
            return 66;
        }
        field4961++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field4954; var3++) {
            class577 var4 = this.field4967[var3];
            for (class577 var5 = var4.field8131; var5 != var4; var5 = var5.field8131) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lws;Lfba;B)Leo;", line = 141)
    public static final class312 method2245(class377 arg0, class27 arg1, byte arg2) {
        field4965++;
        class312 var3 = class414.method2521(0);
        var3.field4442 = arg1.field395;
        var3.field4441 = arg1;
        if (var3.field4442 == -1) {
            var3.field4445 = new class349(260);
        } else if (var3.field4442 == -2) {
            var3.field4445 = new class349(10000);
        } else if (var3.field4442 <= 18) {
            var3.field4445 = new class349(20);
        } else if (var3.field4442 <= 98) {
            var3.field4445 = new class349(100);
        } else {
            var3.field4445 = new class349(260);
        }
        if (arg2 <= 12) {
            return null;
        } else {
            var3.field4445.method2213((byte) -105, arg0);
            var3.field4445.method2210(-125, var3.field4441.method244(0));
            var3.field4444 = 0;
            return var3;
        }
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(I)V", line = 184)
    public static void method2246(int arg0) {
        field4964 = null;
        field4966 = null;
        if (arg0 != -2534) {
            field4975 = -123;
        }
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(II)V", line = 197)
    public static final void method2247(int arg0, int arg1) {
        field4951++;
        class720.field9964.method3741(arg0, arg1 + arg1);
    }

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "(I)Llq;", line = 205)
    public final class577 method2248(int arg0) {
        field4952++;
        if (this.field4974 > 0 && this.field4967[this.field4974 - 1] != this.field4971) {
            class577 var2 = this.field4971;
            this.field4971 = var2.field8131;
            return var2;
        }
        while (this.field4954 > this.field4974) {
            class577 var3 = this.field4967[this.field4974++].field8131;
            if (this.field4967[this.field4974 - 1] != var3) {
                this.field4971 = var3.field8131;
                return var3;
            }
        }
        return arg0 == -15690 ? null : null;
    }

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "(I)V", line = 240)
    public static final void method2249(int arg0) {
        if (arg0 == -1950670936) {
            field4968++;
            class756.field10433 = class238.method1593(35, 8, 0.4F, arg0 + 1950673102, 4, 8, 2048, true);
        }
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(Z)Llq;", line = 254)
    public final class577 method2250(boolean arg0) {
        field4957++;
        if (this.field4970 == null) {
            return null;
        }
        class577 var2 = this.field4967[(int) (this.field4958 & (long) (this.field4954 - 1))];
        if (!arg0) {
            this.method2241(-79, -56L, null);
        }
        while (this.field4970 != var2) {
            if (this.field4970.field8133 == this.field4958) {
                class577 var3 = this.field4970;
                this.field4970 = this.field4970.field8131;
                return var3;
            }
            this.field4970 = this.field4970.field8131;
        }
        this.field4970 = null;
        return null;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(I[Llq;)I", line = 286)
    public final int method2251(int arg0, class577[] arg1) {
        field4956++;
        if (arg0 >= -50) {
            this.method2243((byte) 125);
        }
        int var3 = 0;
        for (int var4 = 0; var4 < this.field4954; var4++) {
            class577 var5 = this.field4967[var4];
            for (class577 var6 = var5.field8131; var6 != var5; var6 = var6.field8131) {
                arg1[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "(I)I", line = 319)
    public final int method2252(int arg0) {
        if (arg0 != -1) {
            this.method2242(-122L, -49);
        }
        field4953++;
        return this.field4954;
    }

    @OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(I)V", line = 336)
    public class353(int arg0) {
        this.field4967 = new class577[arg0];
        this.field4954 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class577 var3 = this.field4967[var2] = new class577();
            var3.field8128 = var3;
            var3.field8131 = var3;
        }
    }
}
