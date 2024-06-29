import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class248 {

    @OriginalMember(owner = "client!uv", name = "d", descriptor = "I")
    public int field3715 = 0;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!uv", name = "c", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!uv", name = "e", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!uv", name = "f", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Z)V")
    public static final void method1620(boolean arg0) {
        field3712++;
        class519.method3072((byte) 70);
        class38.method209(45, class4.field81.field1433, 2, 22050);
        class85.field1065 = class86.method624(class268.field3914, 22050, 8950, class487.field6799, 0);
        class85.field1065.method1324(68, class424.field5978);
        class518.field7619 = class86.method624(class268.field3914, 2048, 8950, class487.field6799, 1);
        class518.field7619.method1324(61, class138.field1810);
        if (!arg0) {
            field3716 = 14;
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IILwm;)V")
    private final void method1621(int arg0, int arg1, class403 arg2) {
        if (~arg1 == arg0) {
            this.field3715 = arg2.method2338(0);
        }
        field3714++;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIILjava/lang/Class;)Leq;")
    public static final class144 method1622(int arg0, int arg1, int arg2, Class arg3) {
        class239 var4 = class268.field3910[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class134 var5 = var4.field3482; var5 != null; var5 = var5.field1755) {
            class144 var6 = var5.field1761;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field1911 == arg1 && var6.field1902 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lwm;I)V")
    public final void method1623(class403 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2357((byte) 110);
            if (var3 == 0) {
                if (arg1 != 2) {
                    this.method1623(null, 114);
                }
                field3717++;
                return;
            }
            this.method1621(arg1 - 8, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)Lbd;")
    public static final class45 method1624(byte arg0) {
        if (arg0 != -50) {
            method1620(false);
        }
        field3713++;
        class45 var1 = (class45) class156.field2349.method2119(0);
        if (var1 != null) {
            var1.method2891(arg0 ^ 0x4A);
            var1.method2132(12);
            return var1;
        }
        class45 var2;
        do {
            var2 = (class45) class408.field5775.method2119(0);
            if (var2 == null) {
                return null;
            }
            if (var2.method262(12) > class465.method2699((byte) 14)) {
                return null;
            }
            var2.method2891(40);
            var2.method2132(12);
        } while ((Long.MIN_VALUE & var2.field5164) == 0L);
        return var2;
    }
}
