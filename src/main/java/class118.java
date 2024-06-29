import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class118 {

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public static int field1983 = -1;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "S")
    public static short field1989 = 256;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "I")
    public static int field1990 = 0;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZLhg;)V")
    public static final void method894(boolean arg0, class207 arg1) {
        class207 var2 = class85.method603(arg1, 115);
        if (!arg0) {
            field1985 = 103;
        }
        field1988++;
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class155.field2567;
            var4 = class182.field2901;
        } else {
            var4 = var2.field3481;
            var3 = var2.field3484;
        }
        class133.method991(var3, arg1, false, (byte) -113, var4);
        client.method729(var3, arg1, -95, var4);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V")
    public static final void method895(int arg0) {
        field1986++;
        if (!class302.field4918) {
            return;
        }
        if (arg0 < 24) {
            field1984 = -71;
        }
        class207 var1 = class107.method798(class173.field2785, class42.field646, (byte) -71);
        if (var1 != null && var1.field3383 != null) {
            class303 var2 = new class303();
            var2.field4935 = var1.field3383;
            var2.field4931 = var1;
            class269.method1893(-3725, var2);
        }
        class221.field3718 = -1;
        class302.field4918 = false;
        class206.method1441(0, var1);
    }
}
