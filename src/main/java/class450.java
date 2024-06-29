import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class450 {

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "Lmo;")
    private class482 field6485 = new class482(256);

    @OriginalMember(owner = "client!ap", name = "k", descriptor = "Lmo;")
    private class482 field6492 = new class482(256);

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "Lvo;")
    private class345 field6483;

    @OriginalMember(owner = "client!ap", name = "g", descriptor = "Lvo;")
    private class345 field6488;

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "Lct;")
    public static class479 field6484 = new class479();

    @OriginalMember(owner = "client!ap", name = "l", descriptor = "Leq;")
    public static class335 field6493 = new class335();

    @OriginalMember(owner = "client!ap", name = "m", descriptor = "I")
    public static int field6494 = 7000;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "I")
    public static int field6482;

    @OriginalMember(owner = "client!ap", name = "e", descriptor = "I")
    public static int field6486;

    @OriginalMember(owner = "client!ap", name = "f", descriptor = "I")
    public static int field6487;

    @OriginalMember(owner = "client!ap", name = "h", descriptor = "I")
    public static int field6489;

    @OriginalMember(owner = "client!ap", name = "i", descriptor = "I")
    public static int field6490;

    @OriginalMember(owner = "client!ap", name = "j", descriptor = "I")
    public static int field6491;

    @OriginalMember(owner = "client!ap", name = "n", descriptor = "Lvo;")
    public static class345 field6495;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "([IIB)Ltk;", line = 6)
    public final class95 method2619(int[] arg0, int arg1, byte arg2) {
        if (arg2 != -96) {
            this.field6485 = null;
        }
        field6486++;
        if (this.field6483.method2102(true) == 1) {
            return this.method2625(arg1, true, arg0, 0);
        } else if (this.field6483.method2098(arg2 ^ 0xFFFFFFA0, arg1) == 1) {
            return this.method2625(0, true, arg0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(CI)Z", line = 31)
    public static final boolean method2620(char arg0, int arg1) {
        if (arg1 != 5) {
            field6484 = null;
        }
        field6489++;
        return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)V", line = 49)
    public static void method2621(int arg0) {
        field6484 = null;
        if (arg0 > -66) {
            method2626(null, true);
        }
        field6493 = null;
        field6495 = null;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(BI[II)Ltk;", line = 63)
    private final class95 method2622(byte arg0, int arg1, int[] arg2, int arg3) {
        field6487++;
        int var5 = arg3 ^ (arg1 << 4 & 0xFFFA | arg1 >>> 12);
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6;
        class95 var9 = (class95) this.field6492.method2818(-22803, var7);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class146 var10 = class146.method1121(this.field6488, arg1, arg3);
            if (arg0 <= 31) {
                return null;
            } else if (var10 == null) {
                return null;
            } else {
                class95 var11 = var10.method1120();
                this.field6492.method2816(var11, var7, false);
                if (arg2 != null) {
                    arg2[0] -= var11.field1407.length;
                }
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(JI)Ljava/lang/String;", line = 104)
    public static final String method2623(long arg0, int arg1) {
        class208.field3204.setTime(new Date(arg0));
        field6482++;
        int var3 = class208.field3204.get(7);
        int var4 = class208.field3204.get(5);
        int var5 = class208.field3204.get(2);
        int var6 = class208.field3204.get(arg1);
        int var7 = class208.field3204.get(11);
        int var8 = class208.field3204.get(12);
        int var9 = class208.field3204.get(13);
        return class493.field7075[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class26.field352[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(I[II)Ltk;", line = 127)
    public final class95 method2624(int arg0, int[] arg1, int arg2) {
        field6490++;
        if (this.field6488.method2102(true) == 1) {
            return this.method2622((byte) 77, 0, arg1, arg0);
        }
        if (arg2 >= -25) {
            this.method2624(-124, null, 19);
        }
        if (this.field6488.method2098(0, arg0) != 1) {
            throw new RuntimeException();
        }
        return this.method2622((byte) 56, arg0, arg1, 0);
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Lvo;Lvo;)V", line = 263)
    public class450(class345 arg0, class345 arg1) {
        this.field6483 = arg1;
        this.field6488 = arg0;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IZ[II)Ltk;", line = 164)
    private final class95 method2625(int arg0, boolean arg1, int[] arg2, int arg3) {
        field6491++;
        if (!arg1) {
            method2621(-105);
        }
        int var5 = arg0 ^ (arg3 >>> 12 | (arg3 & 0x70000FFF) << 4);
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class95 var9 = (class95) this.field6492.method2818(-22803, var7);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class459 var10 = (class459) this.field6485.method2818(-22803, var7);
            if (var10 == null) {
                var10 = class459.method2671(this.field6483, arg3, arg0);
                if (var10 == null) {
                    return null;
                }
                this.field6485.method2816(var10, var7, false);
            }
            class95 var11 = var10.method2663(arg2);
            if (var11 == null) {
                return null;
            } else {
                var10.method2549((byte) -103);
                this.field6492.method2816(var11, var7, false);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lat;Z)V", line = 209)
    public static final void method2626(class144 arg0, boolean arg1) {
        for (int var2 = arg0.field2481; var2 <= arg0.field2483; var2++) {
            for (int var3 = arg0.field2484; var3 <= arg0.field2486; var3++) {
                class293 var4 = class541.field7946[arg0.field3158][var2][var3];
                if (var4 != null) {
                    class198 var5 = var4.field4097;
                    class198 var6 = null;
                    while (var5 != null) {
                        if (var5.field3085 == arg0) {
                            if (var6 == null) {
                                var4.field4097 = var5.field3078;
                            } else {
                                var6.field3078 = var5.field3078;
                            }
                            var5.method1393(107);
                            break;
                        }
                        var6 = var5;
                        var5 = var5.field3078;
                    }
                }
            }
        }
        if (!arg1) {
            class443.method2584(arg0);
        }
    }
}
