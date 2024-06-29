import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class647 {

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
    public int field8751;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "Lcga;")
    public static class449 field8752 = new class449(69, 3);

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
    public static int field8753;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
    public static int field8754;

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
    public static int field8756;

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "Z")
    public static boolean field8755;

    @OriginalMember(owner = "client!hg", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8753++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)V")
    public static void method3612(byte arg0) {
        field8752 = null;
        if (arg0 != -32) {
            field8752 = null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BLrr;)V")
    public static final void method3613(byte arg0, class337 arg1) {
        field8754++;
        if (!class37.field542) {
            return;
        }
        class276.field3523++;
        if (arg1.field4225 != null) {
            class337 var2 = class680.method3758(true, class168.field1978, class112.field1383);
            if (var2 != null) {
                class402 var3 = new class402();
                var3.field5153 = arg1.field4225;
                var3.field5154 = arg1;
                var3.field5152 = var2;
                class620.method3450(var3);
            }
        }
        class124 var4 = class336.method1924(class357.field4597, class636.field8620, (byte) -103);
        var4.field1516.method3061(arg1.field4172, (byte) 115);
        var4.field1516.method3073(1520, class168.field1978);
        var4.field1516.method3051(true, class194.field2290);
        var4.field1516.method3067(1370571624, class112.field1383);
        var4.field1516.method3080((byte) -128, arg1.field4310);
        var4.field1516.method3080((byte) -69, arg1.field4252);
        class197.method1156((byte) 125, var4);
        if (arg0 < 104) {
            method3612((byte) -27);
        }
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(I)V")
    public class647(int arg0) {
        this.field8751 = arg0;
    }
}
