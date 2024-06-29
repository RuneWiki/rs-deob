import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class93 {

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "Lnga;")
    private class510 field1623 = new class510(64);

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "Lnga;")
    private class510 field1632 = new class510(100);

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "Leq;")
    private class209 field1619;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "Lqe;")
    public static class465 field1620 = new class465(18, -2);

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
    public static int field1630 = 1;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "Lgv;")
    public static class81 field1631;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)V")
    public static final void method850(int arg0, int arg1) {
        class613.field8875 = 3;
        class495.field7063 = -1;
        field1628++;
        class170.field2485 = arg1;
        class617.field8922 = arg0;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(II)Lhn;")
    public final class718 method851(int arg0, int arg1) {
        field1626++;
        class510 var3 = this.field1623;
        class718 var4;
        synchronized (this.field1623) {
            var4 = (class718) this.field1623.method3054((byte) -92, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class209 var5 = this.field1619;
        byte[] var6;
        synchronized (this.field1619) {
            var6 = this.field1619.method1453(class379.method2374(arg0, 121), -121, class283.method1845(arg0, 2));
        }
        class718 var7 = new class718();
        var7.field10068 = arg0;
        var7.field10058 = this;
        if (var6 != null) {
            var7.method4008(new class35(var6), 24914);
        }
        var7.method4006(arg1 ^ arg1);
        class510 var8 = this.field1623;
        synchronized (this.field1623) {
            this.field1623.method3047(false, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
    public static void method852(int arg0) {
        field1631 = null;
        field1620 = null;
        if (arg0 >= -27) {
            field1620 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V")
    public final void method853(byte arg0) {
        class510 var2 = this.field1623;
        synchronized (this.field1623) {
            this.field1623.method3048(false);
        }
        if (arg0 != -55) {
            this.method855(76);
        }
        field1621++;
        class510 var3 = this.field1632;
        synchronized (this.field1632) {
            this.field1632.method3048(false);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IB)V")
    public final void method854(int arg0, byte arg1) {
        if (arg1 != -53) {
            this.method856(125, -68);
        }
        field1625++;
        class510 var3 = this.field1623;
        synchronized (this.field1623) {
            this.field1623.method3049(arg0, (byte) 127);
        }
        class510 var4 = this.field1632;
        synchronized (this.field1632) {
            this.field1632.method3049(arg0, (byte) 127);
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V")
    public final void method855(int arg0) {
        class510 var2 = this.field1623;
        synchronized (this.field1623) {
            this.field1623.method3050(false);
        }
        field1624++;
        class510 var3 = this.field1632;
        synchronized (this.field1632) {
            if (arg0 > -61) {
                field1629 = -14;
            }
            this.field1632.method3050(false);
        }
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(II)Leca;")
    public final class755 method856(int arg0, int arg1) {
        if (arg1 != 2) {
            this.method851(122, 96);
        }
        field1627++;
        class510 var3 = this.field1632;
        synchronized (this.field1632) {
            class755 var4 = (class755) this.field1632.method3054((byte) -98, (long) arg0);
            if (var4 == null) {
                var4 = new class755(arg0);
                this.field1632.method3047(false, var4, (long) arg0);
            }
            return var4.method4190((byte) -117) ? var4 : null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lcw;ILeq;Leq;Leq;)V")
    public class93(class179 arg0, int arg1, class209 arg2, class209 arg3, class209 arg4) {
        this.field1619 = arg2;
        if (this.field1619 != null) {
            int var6 = this.field1619.method1454(-1) - 1;
            this.field1619.method1477(0, var6);
        }
        class284.method1855(2, arg3, 86, arg4);
    }
}
