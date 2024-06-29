import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class11 {

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field190 = 2;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "I")
    public static int field193 = 0;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIB)V")
    public static final void method90(int arg0, int arg1, int arg2, byte arg3) {
        field192++;
        if (class106.field1405 == null) {
            return;
        }
        if (arg3 != 97) {
            method91((byte) 96);
        }
        long var4 = (long) (arg1 | arg0 << 28 | arg2 << 14);
        class171 var6 = (class171) class267.field3962.method2826(false, var4);
        if (var6 == null) {
            class423.method2659(arg0, arg1, arg2);
            return;
        }
        class223 var7 = (class223) var6.field2345.method1575(0);
        if (var7 == null) {
            class423.method2659(arg0, arg1, arg2);
            return;
        }
        class278 var8 = (class278) class423.method2659(arg0, arg1, arg2);
        if (var8 == null) {
            var8 = new class278();
        } else {
            var8.field4078 = var8.field4082 = -1;
        }
        var8.field4081 = var7.field3072;
        var8.field4071 = var7.field3069;
        label48: while (true) {
            class223 var9 = (class223) var6.field2345.method1573((byte) -128);
            if (var9 == null) {
                break;
            }
            if (var8.field4081 != var9.field3072) {
                var8.field4078 = var9.field3072;
                var8.field4076 = var9.field3069;
                while (true) {
                    class223 var10 = (class223) var6.field2345.method1573((byte) -128);
                    if (var10 == null) {
                        break label48;
                    }
                    if (var8.field4081 != var10.field3072 && var8.field4078 != var10.field3072) {
                        var8.field4079 = var10.field3069;
                        var8.field4082 = var10.field3072;
                    }
                }
            }
        }
        int var11 = class248.method1621((arg1 << 7) + 64, (arg2 << 7) + 64, -13853, arg0);
        class254.method1645(arg0, arg1, arg2, var11, var8);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V")
    public static final void method91(byte arg0) {
        field189++;
        if (class87.field1203 > 0) {
            class163.method1101(0);
            return;
        }
        class160.field2080 = class290.field4380;
        if (arg0 >= -21) {
            field190 = 103;
        }
        class290.field4380 = null;
        class63.method558(40, true);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IILqr;IB)V")
    public static final void method92(int arg0, int arg1, class212 arg2, int arg3, byte arg4) {
        field191++;
        for (class144 var5 = (class144) class436.field6330.method1575(0); var5 != null; var5 = (class144) class436.field6330.method1573((byte) -128)) {
            if (var5.field1837 == arg1 && arg3 * 128 == var5.field1828 && arg0 * 128 == var5.field1846 && var5.field1838.field2942 == arg2.field2942) {
                if (var5.field1840 != null) {
                    class40.field602.method249(var5.field1840);
                    var5.field1840 = null;
                }
                if (var5.field1822 != null) {
                    class40.field602.method249(var5.field1822);
                    var5.field1822 = null;
                }
                var5.method2632(true);
                return;
            }
        }
        if (arg4 < 87) {
            field190 = 120;
        }
    }
}
