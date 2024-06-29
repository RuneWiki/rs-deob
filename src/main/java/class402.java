import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class402 extends class307 {

    @OriginalMember(owner = "client!oj", name = "F", descriptor = "[Lija;")
    public static class366[] field5528 = new class366[14];

    @OriginalMember(owner = "client!oj", name = "H", descriptor = "I")
    public static int field5530 = 0;

    @OriginalMember(owner = "client!oj", name = "B", descriptor = "I")
    public static int field5524;

    @OriginalMember(owner = "client!oj", name = "D", descriptor = "I")
    public static int field5526;

    @OriginalMember(owner = "client!oj", name = "E", descriptor = "I")
    public static int field5527;

    @OriginalMember(owner = "client!oj", name = "G", descriptor = "I")
    public static int field5529;

    @OriginalMember(owner = "client!oj", name = "I", descriptor = "I")
    public static int field5531;

    @OriginalMember(owner = "client!oj", name = "J", descriptor = "I")
    public static int field5532;

    @OriginalMember(owner = "client!oj", name = "C", descriptor = "Lgca;")
    public static class265 field5525;

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(IIIIIF)V", line = 3)
    public class402(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIII)V", line = 8)
    public final void method1399(int arg0, int arg1, int arg2, int arg3) {
        ++field5532;
        super.field4213 = arg3;
        super.field4200 = arg1;
        if (arg2 != -27297) {
            method2403((byte) -126);
        }
        super.field4197 = arg0;
    }

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "(B)V", line = 22)
    public static void method2403(byte arg0) {
        field5528 = null;
        if (arg0 > 18) {
            field5525 = null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "(I)V", line = 33)
    public static final void method2404(int arg0) {
        ++class442.field5986;
        ++field5526;
        if (arg0 != -13113) {
            method2406(34);
        }
        class537 var1 = class476.method2729(class3.field36, (byte) -46, class551.field7498);
        var1.field7295.method754(class586.method3369(2), arg0 ^ -13159);
        var1.field7295.method781(124, class732.field10098);
        var1.field7295.method781(95, class108.field1697);
        var1.field7295.method754(class111.field1911.field6744.method2511((byte) 56), 110);
        class173.method1314(false, var1);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)Z", line = 51)
    public static final boolean method2405(int arg0, int arg1, int arg2) {
        if (arg2 <= 37) {
            return false;
        } else {
            ++field5531;
            return (arg0 & 52) != 0;
        }
    }

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "(I)V", line = 62)
    public static final void method2406(int arg0) {
        ++field5524;
        class328.field4463 = 1;
        class459.field6232 = arg0;
        long var1 = 0L;
        if (class245.field3476 != null) {
            class93 var3 = new class93(class265.method1735(2, class609.method3457(115, class245.field3476)));
            long var4 = var3.method770((byte) 119);
            class186.field2882 = var3.method770((byte) 89);
            class678.method3823("", (byte) -95, true, class313.method1985(var4, 13426));
        } else {
            class95.method807((byte) 87, 35);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IZ)Lwg;", line = 91)
    public static final class450 method2407(int arg0, boolean arg1) {
        ++field5527;
        class450[] var2 = class420.method2470((byte) -124);
        for (int var3 = 0; var3 < var2.length; ++var3) {
            if (var2[var3].field6169 == arg0) {
                return var2[var3];
            }
        }
        if (arg1) {
            field5530 = -75;
        }
        return null;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(BF)V", line = 115)
    public final void method1398(byte arg0, float arg1) {
        ++field5529;
        if (arg0 <= 103) {
            field5525 = null;
        }
        super.field4209 = arg1;
    }
}
