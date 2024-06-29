import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public class class145 {

    @OriginalMember(owner = "client!gw", name = "g", descriptor = "Z")
    public boolean field1604 = false;

    @OriginalMember(owner = "client!gw", name = "e", descriptor = "I")
    public static int field1602 = 0;

    @OriginalMember(owner = "client!gw", name = "c", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!gw", name = "d", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!gw", name = "f", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!gw", name = "h", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!gw", name = "i", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!gw", name = "j", descriptor = "I")
    public int field1607;

    @OriginalMember(owner = "client!gw", name = "k", descriptor = "I")
    public int field1608;

    @OriginalMember(owner = "client!gw", name = "l", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!gw", name = "m", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "J")
    public static long field1598;

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "Lel;")
    public class184 field1599;

    @OriginalMember(owner = "client!gw", name = "n", descriptor = "[Lfr;")
    public static class656[] field1611;

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(BII)Z")
    public static final boolean method795(byte arg0, int arg1, int arg2) {
        field1610++;
        if (arg0 >= -69) {
            field1611 = null;
        }
        return class620.method3459(-116, arg1, arg2) & class508.method2904(arg2, arg1, 0);
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lnp;I)V")
    public final void method796(class115 arg0, int arg1) {
        field1601++;
        if (arg1 != -21187) {
            field1598 = 30L;
        }
        while (true) {
            int var3 = arg0.method620((byte) -128);
            if (var3 == 0) {
                return;
            }
            this.method799(arg0, (byte) -122, var3);
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)V")
    public static void method797(int arg0) {
        if (arg0 < 90) {
            field1611 = null;
        }
        field1611 = null;
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(ZLr;IB)Lf;")
    public final class534 method798(boolean arg0, class564 arg1, int arg2, byte arg3) {
        field1600++;
        long var5 = (long) (arg1.field8053 << 19 | (arg0 ? 262144 : 0) | this.field1608 | arg2 << 16);
        if (arg3 != -33) {
            return null;
        }
        class534 var7 = (class534) this.field1599.field2070.method78(0, var5);
        if (var7 != null) {
            return var7;
        } else if (this.field1599.field2063.method3849(this.field1608, false)) {
            class550 var8 = class550.method3122(this.field1599.field2063, this.field1608, 0);
            if (var8 != null) {
                var8.field7874 = var8.field7870 = var8.field7875 = var8.field7867 = 0;
                if (arg0) {
                    var8.method3114();
                }
                for (int var9 = 0; var9 < arg2; var9++) {
                    var8.method3124();
                }
            }
            class534 var10 = arg1.method1041(var8, true);
            if (var10 != null) {
                this.field1599.field2070.method92(arg3 ^ 0xFFFFFFDE, var5, var10);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lnp;BI)V")
    private final void method799(class115 arg0, byte arg1, int arg2) {
        field1605++;
        if (arg1 != -122) {
            field1602 = 103;
        }
        if (arg2 == 1) {
            this.field1608 = arg0.method643((byte) -77);
        } else if (arg2 == 2) {
            this.field1607 = arg0.method675(-127);
        } else if (arg2 == 3) {
            this.field1604 = true;
        } else if (arg2 == 4) {
            this.field1608 = -1;
            return;
        }
    }

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "(I)Z")
    public final boolean method800(int arg0) {
        field1609++;
        return arg0 == 0 ? this.field1599.field2063.method3849(this.field1608, false) : true;
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(IIZI)Ltf;")
    public static final class701 method801(int arg0, int arg1, boolean arg2, int arg3) {
        field1606++;
        if (arg1 != 1000000) {
            method801(-69, 48, true, -84);
        }
        class585 var4 = null;
        if (class36.field374 != null) {
            var4 = new class585(arg3, class36.field374, class363.field4862[arg3], 1000000);
        }
        class578.field8187[arg3] = class228.field2831.method2859((byte) -101, arg3, class476.field6860, var4);
        class578.field8187[arg3].method1157(arg1 ^ 0xFFF0BED6);
        return new class701(class578.field8187[arg3], arg2, arg0);
    }
}
