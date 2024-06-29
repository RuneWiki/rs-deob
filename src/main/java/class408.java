import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public abstract class class408 {

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field5870 = -1;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "Lhj;")
    public static class109 field5869 = null;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "Z")
    public static boolean field5877 = false;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "Lrs;")
    public static class246 field5876 = null;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field5868;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field5872;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public static int field5873;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    public static int field5875;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "Lct;")
    public static class104 field5871;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "Lcb;")
    public static class399 field5874;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)Z")
    public abstract boolean method2457(int arg0);

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)J")
    public abstract long method2460(int arg0);

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)I")
    public abstract int method2461(int arg0);

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "(I)V")
    public static final void method2535(int arg0) {
        field5872++;
        if (arg0 != -1) {
            field5877 = true;
        }
        for (class392 var1 = (class392) class26.field383.method2478(1603); var1 != null; var1 = (class392) class26.field383.method2486((byte) -82)) {
            class305 var2 = var1.field5702;
            if (class423.field6117 != var2.field4960 || class388.field5665 > var2.field4478) {
                var1.method1820(-25246);
                var2.method2032((byte) 93);
            } else if (class388.field5665 >= var2.field4494) {
                if (var2.field4471 > 0) {
                    class26 var3 = class364.field5260[var2.field4471 - 1];
                    if (var3 != null && var3.field4954 >= 0 && class195.field2745 * 128 > var3.field4954 && var3.field4951 >= 0 && (class78.field984 * 128) > var3.field4951) {
                        var2.method2033(class388.field5665, var3.field4951, -24296, class133.method889(var2.field4960, var3.field4954, var3.field4951, false) - var2.field4467, var3.field4954);
                    }
                }
                if (var2.field4471 < 0) {
                    int var4 = -var2.field4471 - 1;
                    class380 var5;
                    if (class420.field6085 == var4) {
                        var5 = class187.field2619;
                    } else {
                        var5 = class455.field6731[var4];
                    }
                    if (var5 != null && var5.field4954 >= 0 && var5.field4954 < (class195.field2745 * 128) && var5.field4951 >= 0 && class78.field984 * 128 > var5.field4951) {
                        var2.method2033(class388.field5665, var5.field4951, -24296, class133.method889(var2.field4960, var5.field4954, var5.field4951, false) - var2.field4467, var5.field4954);
                    }
                }
                var2.method2034(class286.field4180, 84);
                class404.method2525(var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "(I)V")
    public static void method2536(int arg0) {
        field5871 = null;
        if (arg0 >= -101) {
            method2537((class104) null, true, (class104) null);
        }
        field5874 = null;
        field5869 = null;
        field5876 = null;
    }

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "(I)I")
    public abstract int method2459(int arg0);

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)C")
    public abstract char method2456(byte arg0);

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lct;ZLct;)V")
    public static final void method2537(class104 arg0, boolean arg1, class104 arg2) {
        class332.field4928 = arg0;
        field5871 = arg2;
        field5868++;
        if (arg1) {
            method2538((byte) 22);
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)I")
    public static final int method2538(byte arg0) {
        field5875++;
        if (arg0 != 102) {
            method2539(46, (class58) null);
        }
        if (class157.field2113 == null) {
            if (!class286.field4210 && class237.field3532 > 0) {
                if (class103.field1332 && class436.field6368.method256(-99, 81) && class237.field3532 > 2) {
                    return ((class375) class138.field1885.field5735.field3908.field3908).field5474;
                }
                return ((class375) class138.field1885.field5735.field3908).field5474;
            }
            int var1 = class223.field3295.method411(arg0 ^ 0x66);
            int var2 = class223.field3295.method415(-125);
            int var3 = class427.field6215;
            int var4 = class441.field6420;
            int var5 = class466.field6860;
            if (var1 > var3 && (var3 + var5) > var1) {
                int var6 = -1;
                for (int var7 = 0; var7 < class237.field3532; var7++) {
                    if (class92.field1144) {
                        int var11 = (class237.field3532 - var7 - 1) * 16 + var4 + 33;
                        if (var2 > (var11 - 13) && var2 <= var11 + 3) {
                            var6 = var7;
                        }
                    } else {
                        int var12 = (class237.field3532 - var7 - 1) * 16 + var4 + 31;
                        if (var12 - 13 < var2 && var2 <= var12 + 3) {
                            var6 = var7;
                        }
                    }
                }
                if (var6 != -1) {
                    int var8 = 0;
                    class145 var9 = new class145(class138.field1885);
                    for (class375 var10 = (class375) var9.method1005(0); var10 != null; var10 = (class375) var9.method1006((byte) -25)) {
                        if (var6 == (var8++)) {
                            return var10.field5474;
                        }
                    }
                }
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILva;)I")
    public static final int method2539(int arg0, class58 arg1) {
        field5873++;
        if (arg1.field769 == 0) {
            return 0;
        }
        if (arg1.field709 != arg0) {
            class58 var2 = null;
            if (arg1.field709 < 32768) {
                var2 = class364.field5260[arg1.field709];
            } else if (arg1.field709 >= 32768) {
                var2 = class455.field6731[arg1.field709 - 32768];
            }
            if (var2 != null) {
                int var3 = arg1.field4954 - var2.field4954;
                int var4 = arg1.field4951 - var2.field4951;
                if (var3 != 0 || var4 != 0) {
                    arg1.method442((int) (Math.atan2((double) var3, (double) var4) * 2607.5945876176133D) & 0x3FFF, true);
                }
            }
        }
        if ((arg1 instanceof class380)) {
            class380 var8 = (class380) arg1;
            if (var8.field5568 != -1 && (var8.field790 == 0 || var8.field789 > 0)) {
                var8.method442(var8.field5568, true);
                var8.field5568 = -1;
            }
        } else if (arg1 instanceof class26) {
            class26 var5 = (class26) arg1;
            if (var5.field373 != -1 && (var5.field790 == 0 || var5.field789 > 0)) {
                int var6 = var5.field4954 - ((var5.field373 - (class28.field399 + class28.field399)) * 64);
                int var7 = var5.field4951 - ((var5.field372 - class134.field1846 - class134.field1846) * 64);
                if (var6 != 0 || var7 != 0) {
                    var5.method442((int) (Math.atan2((double) var6, (double) var7) * 2607.5945876176133D) & 0x3FFF, true);
                }
                var5.field373 = -1;
            }
        }
        return arg1.method438(true);
    }
}
