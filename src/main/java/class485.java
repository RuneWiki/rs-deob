import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class485 extends class397 implements class433 {

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
    private int field7048;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "Lad;")
    public static class11 field7052 = new class11(4);

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "[I")
    public static int[] field7054 = new int[6];

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public static int field7046;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    public static int field7047;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
    public static int field7049;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "I")
    public static int field7050;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "I")
    public static int field7051;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
    public static int field7053;

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "I")
    public static int field7055;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(I)I", line = 3)
    public final int method2065(int arg0) {
        if (arg0 != -13703) {
            return -62;
        } else {
            ++field7050;
            return 0;
        }
    }

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "(I)V", line = 17)
    public static void method2901(int arg0) {
        field7052 = null;
        field7054 = null;
        if (arg0 != -1) {
            field7054 = null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)I", line = 29)
    public final int method2067(int arg0) {
        if (arg0 != -14964) {
            this.method2065(92);
        }
        ++field7053;
        return this.field7048;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)J", line = 40)
    public final long method2066(int arg0) {
        if (arg0 > -117) {
            this.method2066(-77);
        }
        ++field7051;
        return super.field5288.method2840();
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lqt;B)I", line = 51)
    public static final int method2902(class295 arg0, byte arg1) {
        ++field7046;
        if (arg1 != 74) {
            method2902((class295) null, (byte) -81);
        }
        class10 var2 = arg0.field3831;
        if (var2.field111 != null) {
            var2 = var2.method63(false, class198.field2555);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field98;
        class371 var4 = arg0.method2347((byte) -121);
        if (arg0.field5196) {
            var3 = var2.field170;
        } else if (~arg0.field5174 != ~var4.field4808 && arg0.field5174 != var4.field4813 && arg0.field5174 != var4.field4783 && ~arg0.field5174 != ~var4.field4807) {
            if (~arg0.field5174 == ~var4.field4816 || arg0.field5174 == var4.field4790 || ~arg0.field5174 == ~var4.field4792 || arg0.field5174 == var4.field4785) {
                var3 = var2.field161;
            }
        } else {
            var3 = var2.field109;
        }
        return var3;
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lgk;I[BI)V", line = 89)
    public class485(class463 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field7048 = arg1;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "([BBII)V", line = 100)
    public final void method2062(byte[] arg0, byte arg1, int arg2, int arg3) {
        if (arg1 <= 8) {
            field7054 = null;
        }
        this.method2366(arg0, arg2);
        ++field7049;
        this.field7048 = arg3;
    }

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "(I)I", line = 123)
    public static final int method2903(int arg0) {
        if (arg0 != 32478) {
            field7054 = null;
        }
        ++field7047;
        if (class465.field6838 == null) {
            if (!class450.field6267 && ~class271.field3433 < -1) {
                if (class354.field4549 && class439.field6113.method1488((byte) 81, 81) && class271.field3433 > 2) {
                    return ((class502) class103.field1421.field64.field7455.field7455).field7376;
                }
                return ((class502) class103.field1421.field64.field7455).field7376;
            }
            int var1 = class268.field3397.method717((byte) 82);
            int var2 = class268.field3397.method721((byte) 74);
            int var3 = class115.field1574;
            int var4 = class44.field642;
            int var5 = class98.field1374;
            if (~var1 < ~var3 && ~var1 > ~(var3 + var5)) {
                int var6 = -1;
                for (int var7 = 0; ~class271.field3433 < ~var7; ++var7) {
                    if (!class419.field5575) {
                        int var11 = (class271.field3433 - 1 - var7) * 16 + var4 + 31;
                        if (~(var11 + -13) > ~var2 && var2 <= var11 - -3) {
                            var6 = var7;
                        }
                    } else {
                        int var12 = (class271.field3433 + -1 - var7) * 16 + 33 + var4;
                        if (~(var12 + -13) > ~var2 && ~(var12 - -3) <= ~var2) {
                            var6 = var7;
                        }
                    }
                }
                if (~var6 != 0) {
                    int var8 = 0;
                    class81 var9 = new class81(class103.field1421);
                    for (class502 var10 = (class502) var9.method465(false); var10 != null; var10 = (class502) var9.method466(-257)) {
                        if (var8++ == var6) {
                            return var10.field7376;
                        }
                    }
                }
            }
        }
        return -1;
    }
}
