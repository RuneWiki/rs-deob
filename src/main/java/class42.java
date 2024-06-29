import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class42 extends class307 {

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
    public static int field608 = 0;

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "I")
    public static int field614 = 0;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "I")
    public int field604;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "I")
    public int field609;

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "I")
    public int field616;

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!wc", name = "A", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "J")
    public long field613;

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "Lnq;")
    public static class268 field610;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)I")
    public final int method383(int arg0) {
        if (arg0 == 6) {
            field611++;
            return this.field616;
        } else {
            return 14;
        }
    }

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "(I)I")
    public final int method384(int arg0) {
        if (arg0 != 3) {
            field615 = -91;
        }
        field606++;
        return this.field604;
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(B)J")
    public final long method385(byte arg0) {
        if (arg0 < 105) {
            return -65L;
        } else {
            field612++;
            return this.field613;
        }
    }

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "(I)V")
    public static void method386(int arg0) {
        int var1 = -51 % ((arg0 + 60) / 38);
        field610 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILkm;)V")
    public static final void method387(int arg0, class198 arg1) {
        field605++;
        if (class90.field1260 >= 400) {
            return;
        }
        class327 var2 = arg1.field2737;
        if (arg0 != 30529) {
            method387(37, (class198) null);
        }
        if (var2.field4475 != null) {
            var2 = var2.method2108(true);
            if (var2 == null) {
                return;
            }
        }
        if (!var2.field4506) {
            return;
        }
        String var3 = var2.field4507;
        if (var2.field4473 != 0) {
            String var4 = class129.field1827 == 1 ? class329.field4564.method2763(-89, class210.field2935) : class239.field3394.method2763(arg0 ^ 0x7770, class210.field2935);
            var3 = var3 + class188.method1221(-54, var2.field4473, class412.field5841.field1946) + " (" + var4 + var2.field4473 + ")";
        }
        if (class327.field4511) {
            class116 var5 = class192.field2650 == -1 ? null : class44.method396((byte) 63, class192.field2650);
            if ((class319.field4354 & 0x2) != 0) {
                if (var5 == null || var2.method2099(class192.field2650, (byte) -28, var5.field1668) != var5.field1668) {
                    class66.method514(0, 0, 22, class416.field5913 + " -> <col=ffff00>" + var3, (byte) -16, class92.field1289, (long) arg1.field5294, class249.field3519);
                    class375.field5350++;
                }
                return;
            }
            return;
        }
        String[] var6 = var2.field4498;
        if (class360.field4982) {
            var6 = class442.method2769(var6, (byte) -119);
        }
        if (var6 != null) {
            for (int var7 = 4; var7 >= 0; var7--) {
                if (var6[var7] != null && (class129.field1827 != 0 || !var6[var7].equalsIgnoreCase(class212.field2956.method2763(125, class210.field2935)))) {
                    byte var8 = 0;
                    int var9 = class341.field4666;
                    if (var7 == 0) {
                        var8 = 4;
                    }
                    if (var7 == 1) {
                        var8 = 11;
                    }
                    if (var7 == 2) {
                        var8 = 15;
                    }
                    if (var7 == 3) {
                        var8 = 58;
                    }
                    if (var7 == 4) {
                        var8 = 45;
                    }
                    if (var2.field4468 == var7) {
                        var9 = var2.field4529;
                    }
                    if (var2.field4479 == var7) {
                        var9 = var2.field4517;
                    }
                    class66.method514(0, 0, var8, "<col=ffff00>" + var3, (byte) -16, var9, (long) arg1.field5294, var6[var7]);
                    class63.field866++;
                }
            }
        }
        if (class129.field1827 == 0 && var6 != null) {
            for (int var10 = 4; var10 >= 0; var10--) {
                if (var6[var10] != null && var6[var10].equalsIgnoreCase(class212.field2956.method2763(arg0 - 30436, class210.field2935))) {
                    short var11 = 0;
                    if (class412.field5841.field1946 < var2.field4473) {
                        var11 = 2000;
                    }
                    short var12 = 0;
                    if (var10 == 0) {
                        var12 = 4;
                    }
                    if (var10 == 1) {
                        var12 = 11;
                    }
                    if (var10 == 2) {
                        var12 = 15;
                    }
                    if (var10 == 3) {
                        var12 = 58;
                    }
                    if (var10 == 4) {
                        var12 = 45;
                    }
                    if (var12 != 0) {
                        var12 += var11;
                    }
                    class349.field4804++;
                    class66.method514(0, 0, var12, "<col=ffff00>" + var3, (byte) -16, var2.field4526, (long) arg1.field5294, var6[var10]);
                }
            }
        }
        class299.field4162++;
        class66.method514(0, 0, 1010, "<col=ffff00>" + var3, (byte) -16, class160.field2241, (long) arg1.field5294, class218.field3019.method2763(arg0 - 30477, class210.field2935));
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)I")
    public final int method388(int arg0) {
        if (arg0 <= 55) {
            this.method388(90);
        }
        field607++;
        return this.field609;
    }
}
