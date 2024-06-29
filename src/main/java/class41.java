import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class41 extends class222 {

    @OriginalMember(owner = "client!wf", name = "ab", descriptor = "Lsb;")
    public static class98 field672 = class47.method368(")3", 0);

    @OriginalMember(owner = "client!wf", name = "fb", descriptor = "Lef;")
    public static class169 field677 = new class169(0, 0);

    @OriginalMember(owner = "client!wf", name = "hb", descriptor = "Z")
    public static boolean field679 = true;

    @OriginalMember(owner = "client!wf", name = "Y", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!wf", name = "Z", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!wf", name = "bb", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!wf", name = "cb", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!wf", name = "db", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!wf", name = "eb", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!wf", name = "ib", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!wf", name = "jb", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!wf", name = "kb", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!wf", name = "X", descriptor = "Lac;")
    public static class188 field669;

    @OriginalMember(owner = "client!wf", name = "W", descriptor = "Ltg;")
    public static class75 field668;

    @OriginalMember(owner = "client!wf", name = "gb", descriptor = "Ltg;")
    public static class75 field678;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Llj;I)V")
    public static final void method330(class216 arg0, int arg1) {
        if (class144.field2534 != null) {
            try {
                class144.field2534.method342(4, 0L);
                class144.field2534.method340(arg0.field3728, 7559, arg0.field3706, 24);
            } catch (Exception var2) {
            }
        }
        arg0.field3728 += 24;
        ++field674;
        if (arg1 > -108) {
            field682 = 47;
        }
    }

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "(B)V")
    public static void method331(byte arg0) {
        field677 = null;
        field672 = null;
        field668 = null;
        field669 = null;
        if (arg0 <= 98) {
            method333((class177) null, 112);
        }
        field678 = null;
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V")
    public class41() {
        super(1, true);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IZZBILac;I)V")
    public static final void method332(int arg0, boolean arg1, boolean arg2, byte arg3, int arg4, class188 arg5, int arg6) {
        ++field671;
        long var7 = (long) ((arg4 << 16) + arg0);
        class33 var9 = (class33) class97.field1664.method1511((byte) -126, var7);
        if (var9 == null) {
            class33 var10 = (class33) class72.field1179.method1511((byte) -123, var7);
            if (var10 == null) {
                class33 var11 = (class33) class53.field861.method1511((byte) -127, var7);
                if (var11 != null) {
                    if (arg1) {
                        var11.method1368((byte) 3);
                        class97.field1664.method1513(var7, var11, -1);
                        ++class101.field1788;
                        --class116.field2086;
                    }
                } else {
                    if (!arg1) {
                        class33 var12 = (class33) class28.field529.method1511((byte) -124, var7);
                        if (var12 != null) {
                            return;
                        }
                    }
                    class33 var13 = new class33();
                    var13.field574 = arg6;
                    if (!arg2) {
                        method334(35, 63);
                    }
                    var13.field581 = arg3;
                    var13.field580 = arg5;
                    if (arg1) {
                        class97.field1664.method1513(var7, var13, -1);
                        ++class101.field1788;
                    } else {
                        class117.field2095.method128(16, var13);
                        class53.field861.method1513(var7, var13, -1);
                        ++class116.field2086;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Ldk;I)V")
    public static final void method333(class177 arg0, int arg1) {
        class144.field2535 = arg0;
        ++field681;
        if (arg1 != 0) {
            field669 = null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "(II)Lle;")
    public static final class103 method334(int arg0, int arg1) {
        ++field673;
        if (arg1 != -11831) {
            return null;
        } else {
            class103 var2 = (class103) class67.field1074.method1307((byte) -69, (long) arg0);
            if (var2 != null) {
                return var2;
            } else {
                byte[] var3 = class235.field4062.method571(11, arg0, arg1 ^ 11867);
                class103 var4 = new class103();
                if (var3 != null) {
                    var4.method792(new class216(var3), -5009);
                }
                class67.field1074.method1312(true, var4, (long) arg0);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        if (arg0 < 35) {
            field679 = true;
        }
        ++field676;
        int[] var3 = super.field3844.method22(0, arg1);
        if (super.field3844.field61) {
            int[][] var4 = this.method1531(arg1, 0, 124);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; ~class13.field253 < ~var8; ++var8) {
                var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
            }
        }
        return var3;
    }
}
