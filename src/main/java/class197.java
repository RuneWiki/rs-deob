import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public abstract class class197 extends class204 {

    @OriginalMember(owner = "client!bda", name = "x", descriptor = "S")
    public short field3077;

    @OriginalMember(owner = "client!bda", name = "s", descriptor = "I")
    public static int field3072;

    @OriginalMember(owner = "client!bda", name = "t", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!bda", name = "u", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!bda", name = "v", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!bda", name = "w", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!bda", name = "k", descriptor = "(I)V")
    public static final void method1387(int arg0) {
        if (arg0 == 0) {
            ++field3072;
            if (class653.field9220.field9983 && ~class491.field7053.field4294 != 0) {
                class173.method1275(class491.field7053.field4294, class491.field7053.field4286, arg0 ^ 654776389);
            }
        }
    }

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "(B)Z")
    public final boolean method587(byte arg0) {
        if (arg0 >= -22) {
            return false;
        } else {
            ++field3076;
            return class678.field9661[(super.field3155 >> class49.field637) + -class371.field5135 + class668.field9389][(super.field3154 >> class49.field637) + class668.field9389 - class22.field303];
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(I[Lam;)I")
    public final int method591(int arg0, class289[] arg1) {
        ++field3074;
        int var3 = super.field3155 >> class49.field637;
        int var4 = super.field3154 >> class49.field637;
        int var5 = 0;
        if (~class371.field5135 == ~var3) {
            ++var5;
        } else if (~class371.field5135 > ~var3) {
            var5 += 2;
        }
        if (~class22.field303 == ~var4) {
            var5 += 3;
        } else if (var4 < class22.field303) {
            var5 += 6;
        }
        int var6 = class370.field5122[var5];
        if (~(var6 & this.field3077) != arg0) {
            return this.method1413(var4, -6813, var3, arg1);
        } else if (~this.field3077 == -2 && var3 > 0) {
            return this.method1413(var4, -6813, var3 + -1, arg1);
        } else if (~this.field3077 == -5 && ~var3 >= ~class33.field474) {
            return this.method1413(var4, -6813, var3 + 1, arg1);
        } else if (~this.field3077 == -9 && var4 > 0) {
            return this.method1413(var4 + -1, arg0 + -6812, var3, arg1);
        } else if (~this.field3077 == -3 && ~class687.field9758 <= ~var4) {
            return this.method1413(var4 + 1, -6813, var3, arg1);
        } else if (this.field3077 == 16 && ~var3 < -1 && var4 <= class687.field9758) {
            return this.method1413(var4 + 1, -6813, var3 - 1, arg1);
        } else if (this.field3077 == 32 && var3 <= class33.field474 && class687.field9758 >= var4) {
            return this.method1413(var4 - -1, -6813, var3 + 1, arg1);
        } else if (this.field3077 == 128 && ~var3 < -1 && var4 > 0) {
            return this.method1413(var4 + -1, arg0 ^ 6812, var3 + -1, arg1);
        } else if (this.field3077 == 64 && class33.field474 >= var3 && ~var4 < -1) {
            return this.method1413(var4 + -1, -6813, var3 + 1, arg1);
        } else {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!bda", name = "f", descriptor = "(I)Z")
    public final boolean method588(int arg0) {
        ++field3073;
        if (arg0 != 0) {
            this.field3077 = 11;
        }
        return class684.method3864(super.field3155 >> class49.field637, this, super.field3154 >> class49.field637, arg0 + -79, super.field3163);
    }

    @OriginalMember(owner = "client!bda", name = "d", descriptor = "(Z)V")
    public static final void method1388(boolean arg0) {
        class550.field8070 = 0;
        class591.field8601 = 0;
        ++field3075;
        class8.method35(65);
        class59.method508(false);
        class542.method3189(arg0);
        boolean var1 = false;
        for (int var2 = 0; class591.field8601 > var2; ++var2) {
            int var4 = class417.field5940[var2];
            class6 var5 = (class6) class314.field4359.method2818(-22803, (long) var4);
            class88 var6 = var5.field49;
            if (class324.field4519 && class232.method1529(arg0, var4)) {
                class586.method3380((byte) -95);
            }
            if (~class148.field2508 != ~var6.field2431) {
                if (var6.field1309.method3113((byte) -125)) {
                    class295.method1808(var6, -24290);
                }
                var6.method661(true, (class528) null);
                var5.method2549((byte) -39);
                var1 = true;
            }
        }
        if (var1) {
            class392.field5702 = class314.field4359.method2813((byte) -100);
            class314.field4359.method2817((byte) 118, class82.field1259);
        }
        if (~class99.field1481 != ~class376.field5209.field6710) {
            throw new RuntimeException("gnp1 pos:" + class376.field5209.field6710 + " psize:" + class99.field1481);
        } else {
            for (int var3 = 0; class310.field4304 > var3; ++var3) {
                if (class314.field4359.method2818(-22803, (long) class253.field3667[var3]) == null) {
                    throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class310.field4304);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bda", name = "<init>", descriptor = "(IIIIII)V")
    public class197(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super.field3155 = arg0;
        this.field3077 = (short) arg5;
        super.field3158 = (byte) arg3;
        super.field3154 = arg2;
        super.field3160 = arg1;
        super.field3163 = (byte) arg4;
    }
}
