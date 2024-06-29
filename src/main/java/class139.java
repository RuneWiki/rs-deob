import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class139 {

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "Ltg;")
    public static class181 field2410 = null;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "Lcf;")
    public static class93 field2414 = class147.method1066("<col=ff9040>", -48);

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "[I")
    public static int[] field2421 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "Lcf;")
    public static class93 field2419 = class147.method1066("leuchten3:", -48);

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
    public int field2413;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "I")
    private int field2420;

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "I")
    public int field2423;

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)Lnf;")
    public final class158 method1011(byte arg0) {
        class158 var2 = (class158) class120.field2131.method302((long) this.field2420, 0);
        field2417++;
        if (arg0 >= -107) {
            return null;
        } else if (var2 == null) {
            class158 var3 = class278.method1862(class257.field4636, this.field2420, 0, 8);
            if (var3 != null) {
                class120.field2131.method297((long) this.field2420, var3, 10414);
            }
            return var3;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BI)V")
    public static final void method1012(byte arg0, int arg1) {
        if (arg1 == -1 && !class254.field4599) {
            class138.method1007(0);
        } else if (arg1 != -1 && (class164.field2894 != arg1 || !class51.method283(24)) && class195.field3552 != 0 && !class254.field4599) {
            class37.method217(2, class189.field3468, arg1, false, 25097, class195.field3552, 0);
        }
        if (arg0 <= 117) {
            method1015(-17, (class177) null);
        }
        field2412++;
        class164.field2894 = arg1;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILcf;Lhg;)Lqi;")
    public static final class129 method1013(int arg0, class93 arg1, class177 arg2) {
        field2425++;
        int var3 = arg2.method1277(arg1, (byte) 74);
        if (var3 == -1) {
            return new class129(0);
        }
        int[] var4 = arg2.method1260(var3, 0);
        class129 var5 = new class129(var4.length);
        for (int var6 = 0; var6 < var5.field2273; var6++) {
            class280 var7 = new class280(arg2.method1271(var3, -2154, var4[var6]));
            var5.field2260[var6] = var7.method1889((byte) -67);
            var5.field2259[var6] = var7.method1925(true);
            var5.field2277[var6] = (short) var7.method1891(-111);
            var5.field2265[var6] = (short) var7.method1891(-128);
            var5.field2276[var6] = var7.method1872(103);
        }
        return arg0 < 6 ? null : var5;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Z)V")
    public static void method1014(boolean arg0) {
        field2419 = null;
        field2410 = null;
        if (arg0) {
            field2421 = null;
            field2414 = null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILhg;)V")
    public static final void method1015(int arg0, class177 arg1) {
        if (arg0 != -1) {
            method1012((byte) -104, 22);
        }
        field2424++;
        class78.field1447 = arg1.method1277(class174.field3033, (byte) 74);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V")
    public static final void method1016(int arg0) {
        class285.field5105.method1568(121, (byte) 53);
        class259.field4662++;
        class285.field5105.method1908(-114, class180.field3177);
        field2416++;
        if (arg0 != 2) {
            method1015(77, (class177) null);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lee;II)V")
    public final void method1017(class280 arg0, int arg1, int arg2) {
        while (true) {
            int var4 = arg0.method1907(16832);
            if (var4 == 0) {
                field2415++;
                if (arg2 != -3) {
                    method1014(true);
                    return;
                }
                return;
            }
            this.method1018(var4, arg0, arg1, false);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILee;IZ)V")
    private final void method1018(int arg0, class280 arg1, int arg2, boolean arg3) {
        if (arg0 == 1) {
            this.field2420 = arg1.method1891(-128);
        } else if (arg0 == 2) {
            this.field2423 = arg1.method1907(16832);
            this.field2413 = arg1.method1907(16832);
        }
        if (arg3) {
            this.field2423 = 14;
        }
        field2418++;
    }
}
