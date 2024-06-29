import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public class class592 extends class278 {

    @OriginalMember(owner = "client!tda", name = "t", descriptor = "I")
    public static int field8517 = 0;

    @OriginalMember(owner = "client!tda", name = "r", descriptor = "F")
    public static float field8515;

    @OriginalMember(owner = "client!tda", name = "o", descriptor = "I")
    public static int field8512;

    @OriginalMember(owner = "client!tda", name = "p", descriptor = "I")
    public static int field8513;

    @OriginalMember(owner = "client!tda", name = "q", descriptor = "I")
    public static int field8514;

    @OriginalMember(owner = "client!tda", name = "u", descriptor = "I")
    public static int field8518;

    @OriginalMember(owner = "client!tda", name = "v", descriptor = "I")
    public static int field8519;

    @OriginalMember(owner = "client!tda", name = "w", descriptor = "I")
    public static int field8520;

    @OriginalMember(owner = "client!tda", name = "n", descriptor = "Lf;")
    private class702 field8511;

    @OriginalMember(owner = "client!tda", name = "s", descriptor = "[Lf;")
    public static class702[] field8516;

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(IIZI)V")
    public final void method569(int arg0, int arg1, boolean arg2, int arg3) {
        class623.field9017.method108(arg1 + -2, arg3, super.field4164.field3492 - -4, super.field4164.field3491 - -2, ((class66) super.field4164).field1445, 0);
        ++field8520;
        class623.field9017.method108(arg1 + -1, arg3 + 1, super.field4164.field3492 + arg0, super.field4164.field3491, 0, 0);
    }

    @OriginalMember(owner = "client!tda", name = "d", descriptor = "(B)V")
    public static void method3376(byte arg0) {
        if (arg0 >= 19) {
            field8516 = null;
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(IIIZ)V")
    public final void method568(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg0 > -35) {
            this.method1398((byte) 103);
        }
        ++field8518;
        int var5 = this.method1839((byte) -101) * super.field4164.field3492 / 10000;
        int[] var6 = new int[4];
        class623.field9017.method131(var6);
        class623.field9017.method142(arg1, arg2 + 2, arg1 - -var5, super.field4164.field3491 + arg2);
        this.field8511.method3918(arg1, arg2 - -2, super.field4164.field3492, super.field4164.field3491);
        class623.field9017.method142(var6[0], var6[1], var6[2], var6[3]);
    }

    @OriginalMember(owner = "client!tda", name = "<init>", descriptor = "(Lom;Lom;Lu;)V")
    public class592(class344 arg0, class344 arg1, class66 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method3377(String arg0, int arg1) {
        ++field8513;
        if (!class396.field5776.field795) {
            return -1;
        } else if (class4.field464.containsKey(arg0)) {
            return 100;
        } else {
            String var2 = class366.method2318((byte) -125, arg0);
            if (var2 == null) {
                return -1;
            } else {
                String var3 = class598.field8577 + var2;
                if (!class326.field4776.method2218("", var3, arg1 ^ 60)) {
                    return -1;
                } else if (!class326.field4776.method2232(1, var3)) {
                    return class326.field4776.method2227(var3, 24383);
                } else {
                    byte[] var4 = class326.field4776.method2211(var3, 19558, "");
                    if (arg1 != -2) {
                        return -116;
                    } else {
                        Object var5 = null;
                        File var6;
                        try {
                            var6 = class567.method3278(false, var2);
                        } catch (RuntimeException var10) {
                            return -1;
                        }
                        if (var4 != null && var6 != null) {
                            boolean var7 = true;
                            byte[] var8 = class571.method3288(var6, 63);
                            if (var8 != null && ~var4.length == ~var8.length) {
                                for (int var9 = 0; ~var9 > ~var8.length; ++var9) {
                                    if (var4[var9] != var8[var9]) {
                                        var7 = false;
                                        break;
                                    }
                                }
                            } else {
                                var7 = false;
                            }
                            try {
                                if (!var7) {
                                    class396.field5776.method392(var4, true, var6);
                                }
                            } catch (Throwable var11) {
                                return -1;
                            }
                            class272.method1778((byte) 25, var6, arg0);
                            return 100;
                        } else {
                            return -1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tda", name = "b", descriptor = "(B)Z")
    public final boolean method1398(byte arg0) {
        ++field8519;
        if (arg0 < 112) {
            this.method1400((byte) -90);
        }
        return !super.method1398((byte) 115) ? false : super.field4155.method2230((byte) -105, ((class66) super.field4164).field1448);
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(B)V")
    public final void method1400(byte arg0) {
        ++field8512;
        super.method1400(arg0);
        this.field8511 = class505.method3001((byte) 71, super.field4155, ((class66) super.field4164).field1448);
    }
}
