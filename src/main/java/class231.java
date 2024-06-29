import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class231 extends class141 {

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "I")
    private final int field3954;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    private final int field3948;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "I")
    private final int field3951;

    @OriginalMember(owner = "client!ea", name = "E", descriptor = "I")
    private final int field3965;

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "Lke;")
    private static class256 field3956 = class316.method2202("de", 27626);

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "Lke;")
    private static class256 field3953 = class316.method2202(")3fr", 27626);

    @OriginalMember(owner = "client!ea", name = "A", descriptor = "Lke;")
    private static class256 field3961 = class316.method2202("fr", 27626);

    @OriginalMember(owner = "client!ea", name = "K", descriptor = "Lke;")
    private static class256 field3971 = class316.method2202("English", 27626);

    @OriginalMember(owner = "client!ea", name = "L", descriptor = "Lke;")
    private static class256 field3972 = class316.method2202("German", 27626);

    @OriginalMember(owner = "client!ea", name = "F", descriptor = "I")
    public static int field3966 = 0;

    @OriginalMember(owner = "client!ea", name = "C", descriptor = "Lke;")
    public static class256 field3963 = class316.method2202("Choisir une option", 27626);

    @OriginalMember(owner = "client!ea", name = "M", descriptor = "Lke;")
    private static class256 field3973 = class316.method2202("en", 27626);

    @OriginalMember(owner = "client!ea", name = "B", descriptor = "Lke;")
    private static class256 field3962 = class316.method2202(")3pt", 27626);

    @OriginalMember(owner = "client!ea", name = "O", descriptor = "Lke;")
    private static class256 field3975 = class316.method2202("Portuguese", 27626);

    @OriginalMember(owner = "client!ea", name = "G", descriptor = "Lke;")
    private static class256 field3967 = class316.method2202("Unable to find ", 27626);

    @OriginalMember(owner = "client!ea", name = "H", descriptor = "Lke;")
    private static class256 field3968 = class316.method2202("pt", 27626);

    @OriginalMember(owner = "client!ea", name = "P", descriptor = "Lke;")
    private static class256 field3976 = class316.method2202(")3en", 27626);

    @OriginalMember(owner = "client!ea", name = "x", descriptor = "Lke;")
    private static class256 field3958 = class316.method2202("French", 27626);

    @OriginalMember(owner = "client!ea", name = "J", descriptor = "Lke;")
    public static class256 field3970 = field3967;

    @OriginalMember(owner = "client!ea", name = "I", descriptor = "Lke;")
    private static class256 field3969 = class316.method2202(")3de", 27626);

    @OriginalMember(owner = "client!ea", name = "D", descriptor = "[Lke;")
    public static class256[] field3964 = new class256[] { field3973, field3956, field3961, field3968 };

    @OriginalMember(owner = "client!ea", name = "N", descriptor = "[Lke;")
    private static class256[] field3974 = new class256[] { field3976, field3969, field3953, field3962 };

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "[Lke;")
    private static class256[] field3949 = new class256[] { field3971, field3972, field3958, field3975 };

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!ea", name = "y", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!ea", name = "z", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!ea", name = "Q", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "Lqh;")
    public static class31 field3950;

    @OriginalMember(owner = "client!ea", name = "R", descriptor = "Ltj;")
    public static class75 field3978;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V", line = 7)
    public static void method1565(int arg0) {
        field3971 = null;
        field3968 = null;
        field3969 = null;
        field3974 = null;
        field3964 = null;
        field3961 = null;
        field3958 = null;
        field3962 = null;
        field3967 = null;
        field3956 = null;
        field3953 = null;
        field3970 = null;
        field3975 = null;
        field3963 = null;
        field3949 = null;
        if (arg0 != 0) {
            field3968 = (class256) null;
        }
        field3972 = null;
        field3976 = null;
        field3950 = null;
        field3973 = null;
        field3978 = null;
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(IIIIIII)V", line = 44)
    public class231(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3954 = arg3;
        this.field3948 = arg2;
        this.field3951 = arg1;
        this.field3965 = arg0;
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(III)V", line = 60)
    public final void method634(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            return;
        }
        field3952++;
        int var4 = this.field3948 * arg2 >> 12;
        int var5 = this.field3965 * arg2 >> 12;
        int var6 = this.field3951 * arg0 >> 12;
        int var7 = this.field3954 * arg0 >> 12;
        class248.method1675(var4, var7, var5, this.field2485, arg1 + 25747, var6);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IBIII)V", line = 80)
    public static final void method1566(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field3957++;
        if (arg1 != 78) {
            method1568(false);
        }
        if (arg0 >= arg2) {
            class73.method550(arg1 ^ 0xFFFF8B7F, class308.field5329[arg3], arg0, arg2, arg4);
        } else {
            class73.method550(arg1 ^ 0xFFFF8B7F, class308.field5329[arg3], arg2, arg0, arg4);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)V", line = 120)
    public final void method629(int arg0, int arg1, int arg2) {
        field3955++;
        int var4 = this.field3965 * arg0 >> 12;
        int var5 = this.field3948 * arg0 >> 12;
        int var6 = this.field3954 * arg1 >> 12;
        if (arg2 == 0) {
            int var7 = this.field3951 * arg1 >> 12;
            class157.method1165(var5, var4, this.field2482, this.field2478, var7, arg2 + 1, var6);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)Lej;", line = 141)
    public static final class45 method1567(int arg0, int arg1) {
        field3960++;
        if (arg0 != -28080) {
            field3972 = (class256) null;
        }
        class45 var2 = (class45) class166.field2935.method1260(-78, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class79.field1479.method1016(26, arg0 ^ 0xFFFF9234, arg1);
        class45 var4 = new class45();
        if (var3 != null) {
            var4.method378(true, new class41(var3));
        }
        class166.field2935.method1259(var4, (long) arg1, 0);
        return var4;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(III)V", line = 166)
    public final void method630(int arg0, int arg1, int arg2) {
        field3977++;
        int var4 = this.field3965 * arg0 >> 12;
        int var5 = this.field3948 * arg0 >> 12;
        int var6 = this.field3951 * arg2 >> 12;
        if (arg1 != 15015) {
            field3973 = (class256) null;
        }
        int var7 = this.field3954 * arg2 >> 12;
        class168.method1220(this.field2478, var7, var6, var4, var5, this.field2482, this.field2485, -48);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Z)V", line = 203)
    public static final void method1568(boolean arg0) {
        if (arg0) {
            class59.field1071.method2084(120);
            field3959++;
            class80.field1487.method2084(127);
        }
    }
}
