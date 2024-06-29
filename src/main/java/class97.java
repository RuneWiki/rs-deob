import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public abstract class class97 {

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "Lhj;")
    private static class69 field1805 = class181.method1318("Location", (byte) -121);

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "Lhj;")
    public static class69 field1804 = field1805;

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "Lhj;")
    private static class69 field1810 = class181.method1318("wave2:", (byte) -128);

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "Lhj;")
    public static class69 field1802 = field1810;

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "Lhj;")
    public static class69 field1812 = field1810;

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "Lhj;")
    public static class69 field1806 = class181.method1318("Lade Titelbild )2 ", (byte) -124);

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "I")
    public static int field1811 = 0;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!pk", name = "m", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)Lec;")
    public abstract class23 method707(int arg0);

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(II)I")
    public abstract int method708(int arg0, int arg1);

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(II)V")
    public abstract void method709(int arg0, int arg1);

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Z)V")
    public static void method710(boolean arg0) {
        field1806 = null;
        field1805 = null;
        field1802 = null;
        field1804 = null;
        field1810 = null;
        if (arg0) {
            field1802 = null;
        }
        field1812 = null;
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(Z)V")
    private static final void method711(boolean arg0) {
        if (!arg0) {
            field1810 = null;
        }
        field1807++;
        class199.field3595.method294(!arg0);
        int var1 = class199.field3595.method305(1, 8);
        if (var1 == 0) {
            return;
        }
        int var2 = class199.field3595.method305(2, 8);
        if (var2 == 0) {
            class102.field1908[class156.field2917++] = 2047;
        } else if (var2 == 1) {
            int var3 = class199.field3595.method305(3, 8);
            class156.field2904.method1576(4, var3, false);
            int var4 = class199.field3595.method305(1, 8);
            if (var4 == 1) {
                class102.field1908[class156.field2917++] = 2047;
            }
        } else if (var2 == 2) {
            int var5 = class199.field3595.method305(3, 8);
            class156.field2904.method1576(4, var5, true);
            int var6 = class199.field3595.method305(3, 8);
            class156.field2904.method1576(4, var6, true);
            int var7 = class199.field3595.method305(1, 8);
            if (var7 == 1) {
                class102.field1908[class156.field2917++] = 2047;
            }
        } else if (var2 == 3) {
            class52.field927 = class199.field3595.method305(2, 8);
            int var8 = class199.field3595.method305(1, 8);
            int var9 = class199.field3595.method305(1, 8);
            if (var9 == 1) {
                class102.field1908[class156.field2917++] = 2047;
            }
            int var10 = class199.field3595.method305(7, 8);
            int var11 = class199.field3595.method305(7, 8);
            class156.field2904.method812(var10, 0, var8 == 1, var11);
        }
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(II)Lv;")
    public static final class146 method712(int arg0, int arg1) {
        field1808++;
        if (arg0 != 1) {
            field1810 = null;
        }
        class146 var2 = (class146) class206.field3761.method1714((long) arg1, (byte) -128);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class194.field3532.method590(arg1, 3, arg0 - 1);
        class146 var4 = new class146();
        if (var3 != null) {
            var4.method1107(new class128(var3), false);
        }
        class206.field3761.method1705((byte) 123, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "(II)[B")
    public abstract byte[] method713(int arg0, int arg1);

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "(II)Z")
    public static final boolean method714(int arg0, int arg1) {
        if (arg0 <= 74) {
            method716(-73, -7);
        }
        field1801++;
        return (arg1 >> 30 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(Z)V")
    public static final void method715(boolean arg0) {
        field1813++;
        class88.field1681 = 0;
        class156.field2917 = 0;
        method711(true);
        class207.method1502(79);
        class151.method1135((byte) 80);
        class173.method1266(113);
        for (int var1 = 0; var1 < class88.field1681; var1++) {
            int var3 = class108.field2071[var1];
            if (class180.field3272 != class35.field491[var3].field4041) {
                if (class35.field491[var3].field2041 > 0) {
                    class194.method1412(class35.field491[var3], (byte) 40);
                }
                class35.field491[var3] = null;
            }
        }
        if (class33.field451 != class199.field3595.field2379) {
            throw new RuntimeException("gpp1 pos:" + class199.field3595.field2379 + " psize:" + class33.field451);
        }
        if (arg0) {
            method716(-11, 21);
        }
        for (int var2 = 0; var2 < class98.field1856; var2++) {
            if (class35.field491[class38.field525[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class98.field1856);
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "(II)Z")
    public static final boolean method716(int arg0, int arg1) {
        field1803++;
        if (arg1 < 0) {
            return false;
        }
        int var2 = class208.field3782[arg1];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return ~var2 == arg0;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lnc;Lhj;I)Lcf;")
    public static final class91 method717(class83 arg0, class69 arg1, int arg2) {
        field1809++;
        int var3 = arg0.method589((byte) -125, arg1);
        if (var3 == -1) {
            return new class91(0);
        }
        int[] var4 = arg0.method608(-20161, var3);
        if (arg2 > -69) {
            field1806 = null;
        }
        class91 var5 = new class91(var4.length);
        for (int var6 = 0; var6 < var5.field1724; var6++) {
            class128 var7 = new class128(arg0.method590(var4[var6], var3, 0));
            var5.field1729[var6] = var7.method963(false);
            var5.field1728[var6] = var7.method950(1495791448);
            var5.field1717[var6] = (short) var7.method912(-128);
            var5.field1720[var6] = (short) var7.method912(-105);
            var5.field1730[var6] = var7.method923(true);
        }
        return var5;
    }
}
