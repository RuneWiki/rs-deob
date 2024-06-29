import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class128 {

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "Lpp;")
    private class508 field1596 = new class508();

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "Lje;")
    private class265 field1599 = new class265();

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "I")
    private int field1600;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
    private int field1601;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "Lil;")
    private class68 field1603;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "Lwp;")
    public static class453 field1602 = new class453(39, 12);

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "[I")
    public static int[] field1607 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "[Lf;")
    public static class536[] field1606;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V")
    public static void method679(byte arg0) {
        field1606 = null;
        if (arg0 == -67) {
            field1607 = null;
            field1602 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IB)V")
    public static final void method680(int arg0, byte arg1) {
        field1605++;
        class565.field7888 = arg0;
        class450 var2 = class19.field290;
        synchronized (class19.field290) {
            class19.field290.method2406(18385);
        }
        if (arg1 < 8) {
            method682(-95);
        }
        class450 var3 = class190.field2377;
        synchronized (class190.field2377) {
            class190.field2377.method2406(18385);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lpp;ZJ)V")
    public final void method681(class508 arg0, boolean arg1, long arg2) {
        field1608++;
        if (this.field1601 == 0) {
            class508 var5 = this.field1599.method1537(-21957);
            var5.method1871(-51);
            var5.method2744((byte) -79);
            if (this.field1596 == var5) {
                class508 var6 = this.field1599.method1537(-21957);
                var6.method1871(-81);
                var6.method2744((byte) -105);
            }
        } else {
            this.field1601--;
        }
        this.field1603.method402(arg0, (byte) -90, arg2);
        if (arg1) {
            this.field1599 = null;
        }
        this.field1599.method1541(75, arg0);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
    public static final void method682(int arg0) {
        field1598++;
        class103.field1390 = new class507[class351.field4485.method3342((byte) -107)][];
        class688.field9760 = new class507[class351.field4485.method3342((byte) -107)][];
        class236.field2954 = new boolean[class351.field4485.method3342((byte) -107)];
        if (arg0 != 1) {
            method683(112, -42, 108);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(III)Lvf;")
    public static final class75 method683(int arg0, int arg1, int arg2) {
        if (class270.field3423[arg0][arg1][arg2] == null) {
            boolean var3 = class270.field3423[0][arg1][arg2] != null && class270.field3423[0][arg1][arg2].field1023 != null;
            if (var3 && arg0 >= class391.field4927 - 1) {
                return null;
            }
            class182.method1135(arg0, arg1, arg2);
        }
        return class270.field3423[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BJ)Lpp;")
    public final class508 method684(byte arg0, long arg1) {
        int var4 = 101 % ((arg0 - 41) / 38);
        field1597++;
        class508 var5 = (class508) this.field1603.method399(-32748, arg1);
        if (var5 != null) {
            this.field1599.method1541(75, var5);
        }
        return var5;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(B)V")
    public final void method685(byte arg0) {
        this.field1599.method1540(1252027233);
        if (arg0 != 69) {
            this.field1600 = 66;
        }
        field1604++;
        this.field1603.method398(true);
        this.field1596 = new class508();
        this.field1601 = this.field1600;
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(I)V")
    public class128(int arg0) {
        this.field1600 = arg0;
        this.field1601 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field1603 = new class68(var2);
    }
}
