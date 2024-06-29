import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class519 extends class190 {

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "Lcr;")
    public static class292 field7498 = null;

    @OriginalMember(owner = "client!fl", name = "p", descriptor = "[Lli;")
    public static class484[] field7510 = null;

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "Leda;")
    public static class14 field7506 = new class14(8);

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "I")
    public static int field7499;

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "I")
    public static int field7500;

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "I")
    public static int field7502;

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "I")
    public static int field7503;

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "I")
    public static int field7504;

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "I")
    public static int field7505;

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "I")
    public static int field7507;

    @OriginalMember(owner = "client!fl", name = "n", descriptor = "I")
    public static int field7508;

    @OriginalMember(owner = "client!fl", name = "o", descriptor = "I")
    public static int field7509;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "Ljava/lang/String;")
    public static String field7501;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(I)V", line = 5)
    public static void method3093(int arg0) {
        field7498 = null;
        field7506 = null;
        int var1 = -99 / ((arg0 - 66) / 40);
        field7510 = null;
        field7501 = null;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)V", line = 17)
    public static final void method3094(int arg0, int arg1) {
        ++field7505;
        if (arg1 != 1) {
            method3096(73, -77, 86);
        }
        class14 var2 = class364.field5565;
        synchronized (class364.field5565) {
            class364.field5565.method68(-16878, arg0);
        }
        class14 var3 = class638.field8958;
        synchronized (class638.field8958) {
            class638.field8958.method68(-16878, arg0);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;", line = 34)
    public static final String method3095(String arg0, boolean arg1) {
        ++field7507;
        if (arg0 == null) {
            return null;
        } else {
            int var2 = 0;
            int var3 = arg0.length();
            while (~var3 < ~var2 && class394.method2449(arg0.charAt(var2), 25834)) {
                ++var2;
            }
            while (var3 > var2 && class394.method2449(arg0.charAt(var3 + -1), 25834)) {
                --var3;
            }
            if (arg1) {
                method3094(-42, -95);
            }
            int var4 = -var2 + var3;
            if (var4 >= 1 && var4 <= 12) {
                StringBuffer var5 = new StringBuffer(var4);
                for (int var6 = var2; ~var3 < ~var6; ++var6) {
                    char var7 = arg0.charAt(var6);
                    if (class476.method2895(0, var7)) {
                        char var8 = class41.method449(var7, 25005);
                        if (~var8 != -1) {
                            var5.append(var8);
                        }
                    }
                }
                if (var5.length() == 0) {
                    return null;
                } else {
                    return var5.toString();
                }
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(III)I", line = 98)
    public static final int method3096(int arg0, int arg1, int arg2) {
        ++field7502;
        int var3 = 1;
        while (arg2 > 1) {
            if (~(arg2 & 1) != -1) {
                var3 = arg0 * var3;
            }
            arg2 >>= 1;
            arg0 *= arg0;
        }
        if (arg1 != -1) {
            field7510 = null;
        }
        if (~arg2 == -2) {
            return arg0 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)Z", line = 124)
    public final boolean method908(int arg0) {
        ++field7499;
        if (arg0 < 37) {
            field7498 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Lrs;)V", line = 135)
    public class519(class166 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IZ)V", line = 138)
    public final void method909(int arg0, boolean arg1) {
        if (arg0 != 16450) {
            this.method914(-8, -67, (byte) -53);
        }
        ++field7508;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIB)V", line = 151)
    public final void method914(int arg0, int arg1, byte arg2) {
        if (arg2 != -122) {
            this.method914(-106, -28, (byte) 16);
        }
        ++field7503;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILnba;I)V", line = 161)
    public final void method911(int arg0, class487 arg1, int arg2) {
        super.field3195.method1306(arg1, 103);
        ++field7509;
        super.field3195.method1334(arg2, arg0);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZI)V", line = 170)
    public final void method915(boolean arg0, int arg1) {
        ++field7500;
        super.field3195.method1267(-107, true);
        if (arg1 != 0) {
            field7501 = null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Z)V", line = 181)
    public final void method910(boolean arg0) {
        super.field3195.method1267(-98, arg0);
        ++field7504;
    }
}
