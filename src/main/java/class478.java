import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class478 extends class601 {

    @OriginalMember(owner = "client!m", name = "l", descriptor = "Lkr;")
    public static class602 field6646 = new class602(13, -1);

    @OriginalMember(owner = "client!m", name = "m", descriptor = "I")
    public static int field6647;

    @OriginalMember(owner = "client!m", name = "n", descriptor = "I")
    public static int field6648;

    @OriginalMember(owner = "client!m", name = "o", descriptor = "I")
    public static int field6649;

    @OriginalMember(owner = "client!m", name = "p", descriptor = "I")
    public static int field6650;

    @OriginalMember(owner = "client!m", name = "q", descriptor = "I")
    public static int field6651;

    @OriginalMember(owner = "client!m", name = "r", descriptor = "I")
    public static int field6652;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(B)V", line = 5)
    public static final void method2909(byte arg0) {
        while (true) {
            if (class352.field5071.method2562(class357.field5125, false) >= 15) {
                int var1 = class352.field5071.method2560(-118, 15);
                if (~var1 != -32768) {
                    boolean var2 = false;
                    class234 var3 = (class234) class372.field5245.method812(116, (long) var1);
                    if (var3 == null) {
                        class679 var4 = new class679();
                        var4.field7148 = var1;
                        var3 = new class234(var4);
                        class372.field5245.method820((long) var1, (byte) -42, var3);
                        var2 = true;
                        class757.field10568[class445.field6185++] = var3;
                    }
                    class679 var5 = var3.field3471;
                    class446.field6192[class262.field3837++] = var1;
                    var5.field7139 = class288.field4124;
                    if (var5.field9436 != null && var5.field9436.method768(arg0 + -113)) {
                        class333.method2130((byte) 122, var5);
                    }
                    int var6 = class352.field5071.method2560(-100, 5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = 4 + class352.field5071.method2560(-77, 3) << 11 & 15278;
                    int var8 = class352.field5071.method2560(arg0 + -101, 1);
                    if (~var8 == -2) {
                        class606.field8182[class456.field6315++] = var1;
                    }
                    var5.method3826(class525.field7291.method146(arg0 + -27, class352.field5071.method2560(arg0 ^ -42, 14)), 0);
                    int var9 = class352.field5071.method2560(-95, 5);
                    if (var9 > 15) {
                        var9 -= 32;
                    }
                    int var10 = class352.field5071.method2560(-48, 2);
                    int var11 = class352.field5071.method2560(-74, 1);
                    var5.method3081(var5.field9436.field1656, 32679);
                    var5.field7136 = var5.field9436.field1702 << 3;
                    if (var2) {
                        var5.method3073(true, true, var7);
                    }
                    var5.method3825(var10, var5.method662((byte) 15), class388.field5601.field7198[0] - -var9, ~var11 == -2, -7749, class388.field5601.field7197[0] + var6);
                    if (var5.field9436.method768(-101)) {
                        class38.method204((class96) null, 0, var5, var5.field7197[0], var5.field4408, -27170, (class220) null, var5.field7198[0]);
                    }
                    continue;
                }
            }
            if (arg0 != 29) {
                method2911(false);
            }
            ++field6648;
            class352.field5071.method2567(0);
            return;
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(II)V", line = 91)
    public final void method43(int arg0, int arg1) {
        ++field6647;
        int var3 = -97 / ((arg0 - 22) / 34);
        super.field8131 = arg1;
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(ILqea;)V", line = 101)
    public class478(int arg0, class339 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IB)I", line = 104)
    public final int method36(int arg0, byte arg1) {
        if (arg1 != 22) {
            this.method43(-113, -14);
        }
        ++field6652;
        return 1;
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lqea;)V", line = 118)
    public class478(class339 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)I", line = 122)
    public final int method45(int arg0) {
        if (arg0 != 8976) {
            return 71;
        } else {
            ++field6651;
            return 0;
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(I)I", line = 134)
    public final int method2910(int arg0) {
        if (arg0 != 0) {
            field6646 = null;
        }
        ++field6650;
        return super.field8131;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Z)V", line = 145)
    public static void method2911(boolean arg0) {
        field6646 = null;
        if (!arg0) {
            field6646 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V", line = 155)
    public final void method41(byte arg0) {
        if (super.field8131 < 0 || ~super.field8131 < -5) {
            super.field8131 = this.method45(8976);
        }
        int var2 = -88 % ((59 - arg0) / 33);
        ++field6649;
    }
}
