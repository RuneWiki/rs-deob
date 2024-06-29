import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class108 {

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "Lau;")
    private class692 field1610 = new class692(64);

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "Lmv;")
    private class295 field1614;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "Lmv;")
    private class295 field1607;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "I")
    public static int field1618 = 0;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "[[B")
    public static byte[][] field1609;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)Lhi;")
    public static final class415 method817(int arg0) {
        field1612++;
        if (class55.field841 == null || class399.field6014 == null) {
            return null;
        }
        class399.field6014.method3702(class55.field841, -79);
        class415 var1 = (class415) class399.field6014.method3704((byte) -121);
        if (var1 == null) {
            return null;
        } else if (arg0 >= -103) {
            return null;
        } else {
            class168 var2 = class55.field834.method2757(var1.field6142, (byte) -46);
            return var2 != null && var2.field2378 && var2.method1173(class55.field836, 102) ? var1 : class175.method1200((byte) -32);
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V")
    public static void method818(int arg0) {
        field1609 = null;
        int var1 = -28 / ((-arg0 - 56) / 50);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IB)Lkq;")
    public static final class696 method819(int arg0, byte arg1) {
        field1616++;
        if (arg1 != 32) {
            method818(-1);
        }
        class696 var2 = (class696) class281.field3727.method3901((long) arg0, -54);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class48.field757.method1844(1, arg1 + 31298, arg0);
        class696 var4 = new class696();
        var4.field9802 = arg0;
        if (var3 != null) {
            var4.method3914((byte) 82, new class540(var3));
        }
        var4.method3913((byte) -125);
        if (var4.field9805 == 2 && class614.field8856.method2002((byte) -128, (long) arg0) == null) {
            class614.field8856.method2001(-90, new class258(class434.field6286), (long) arg0);
            class81.field1316[class434.field6286++] = var4;
        }
        class281.field3727.method3894(var4, (byte) 60, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IILje;I)J")
    public static final long method820(int arg0, int arg1, class83 arg2, int arg3) {
        field1613++;
        long var4 = 4194304L;
        long var6 = Long.MIN_VALUE;
        class289 var8 = class60.field965.method2596(0, arg2.method277((byte) 95));
        long var9 = (long) (arg2.method264(-5273) | 0x10000 << 14 | arg3 | arg0 << 7 | arg2.method263((byte) 91) << 20);
        if (arg1 != -1164670508) {
            field1608 = -91;
        }
        if (var8.field4250 == 0) {
            var9 |= var6;
        }
        if (var8.field4187 == 1) {
            var9 |= var4;
        }
        return var9 | (long) arg2.method277((byte) 95) << 32;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)Lab;")
    public final class579 method821(int arg0, int arg1) {
        field1615++;
        class579 var3 = (class579) this.field1610.method3901((long) arg0, -120);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 >= 32768) {
            var4 = this.field1607.method1844(0, 31330, arg0 & 0x7FFF);
        } else {
            var4 = this.field1614.method1844(0, 31330, arg0);
        }
        class579 var5 = new class579();
        if (var4 != null) {
            var5.method3329(new class540(var4), (byte) -58);
        }
        if (arg1 >= ~arg0) {
            var5.method3326(arg1 + 32769);
        }
        this.field1610.method3894(var5, (byte) 60, (long) arg0);
        return var5;
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(ILmv;Lmv;)V")
    public class108(int arg0, class295 arg1, class295 arg2) {
        this.field1614 = arg1;
        this.field1607 = arg2;
        if (this.field1614 != null) {
            this.field1614.method1845(0, true);
        }
        if (this.field1607 != null) {
            this.field1607.method1845(0, true);
        }
    }
}
