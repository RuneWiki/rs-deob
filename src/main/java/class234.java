import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class234 extends class22 {

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "I")
    private final int field4080;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
    private final int field4074;

    @OriginalMember(owner = "client!nd", name = "y", descriptor = "I")
    private final int field4081;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "I")
    private final int field4070;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
    public static int field4069 = 0;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "Lsc;")
    private static class181 field4072 = class149.method967(255, "Loading sprites )2 ");

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "Lsc;")
    public static class181 field4079 = class149.method967(255, "Lade Titelbild )2 ");

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "Lsc;")
    public static class181 field4078 = field4072;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
    public static int field4075 = -2;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!nd", name = "z", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!nd", name = "A", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!nd", name = "B", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!nd", name = "C", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZI)Lmd;")
    public static final class68 method1607(boolean arg0, int arg1) {
        class68 var2 = (class68) class87.field1376.method1794(-1, (long) arg1);
        ++field4073;
        if (!arg0) {
            method1610(false);
        }
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class85.field1360.method89(arg1, 16, 104);
            class68 var4 = new class68();
            if (var3 != null) {
                var4.method475(-1, new class230(var3));
            }
            class87.field1376.method1795(14177, (long) arg1, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)V")
    public static final void method1608(int arg0) {
        if (arg0 != -2104841812) {
            method1607(true, -23);
        }
        ++field4082;
        if (class199.field3446 != null) {
            class199.field3446.method313(111);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)V")
    public final void method199(int arg0, int arg1, int arg2) {
        int var4 = this.field4080 * arg1 >> 12;
        ++field4077;
        int var5 = this.field4074 * arg2 >> 12;
        if (arg0 != -6474) {
            field4084 = 35;
        }
        int var6 = this.field4070 * arg2 >> 12;
        int var7 = this.field4081 * arg1 >> 12;
        class32.method255(super.field389, var7, var5, super.field387, super.field393, var4, var6, (byte) 116);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
    public static final void method1609(byte arg0) {
        class255.field4457 = null;
        class32.field517 = null;
        if (arg0 >= -92) {
            method1608(-2);
        }
        ++field4085;
        class155.field2586 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IBI)V")
    public final void method200(int arg0, byte arg1, int arg2) {
        ++field4071;
        int var4 = this.field4080 * arg2 >> 12;
        if (arg1 > -97) {
            this.method199(-43, 9, 25);
        }
        int var5 = this.field4081 * arg2 >> 12;
        int var6 = this.field4074 * arg0 >> 12;
        int var7 = this.field4070 * arg0 >> 12;
        class137.method884(-28282, var5, var6, var4, var7, super.field387);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)V")
    public static void method1610(boolean arg0) {
        field4072 = null;
        field4079 = null;
        field4078 = null;
        if (!arg0) {
            field4075 = -48;
        }
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(IIIIIII)V")
    public class234(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4080 = arg0;
        this.field4074 = arg3;
        this.field4081 = arg2;
        this.field4070 = arg1;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(III)V")
    public final void method202(int arg0, int arg1, int arg2) {
        ++field4068;
        if (arg1 != -1) {
            field4079 = null;
        }
    }
}
