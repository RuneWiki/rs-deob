import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class332 {

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public static int field4970 = 0;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "Ltq;")
    public static class427 field4974 = null;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static int field4971;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    public static int field4973;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "Lbn;")
    public static class295 field4975;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "[[Ltq;")
    public static class427[][] field4972;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)V")
    public static final void method2062(int arg0, int arg1, int arg2) {
        field4971++;
        int var3 = class512.field7764.method2349(class14.field152.method2473(class406.field5898, -75), 0);
        for (class2 var4 = (class2) class329.field4932.method8((byte) -98); var4 != null; var4 = (class2) class329.field4932.method17((byte) 44)) {
            int var8 = class183.method1146((byte) 55, var4);
            if (var3 < var8) {
                var3 = var8;
            }
        }
        var3 += 8;
        int var5 = class330.field4948 * arg0 + 21;
        int var6 = arg2 - var3 / 2;
        if ((var3 + var6) > class482.field7368) {
            var6 = class482.field7368 - var3;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > class147.field2384) {
            var7 = class147.field2384 - var5;
        }
        class170.field2647 = var6;
        if (var7 < 0) {
            var7 = 0;
        }
        class120.field2001 = var7;
        class381.field5555 = true;
        class218.field3358 = var3;
        class481.field7344 = class330.field4948 * 16 + (class504.field7624 ? 26 : 22);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IB)V")
    public static final void method2063(int arg0, byte arg1) {
        field4973++;
        if (arg1 <= -63) {
            class191.field3039 = arg0;
            class336.field5043.method1761(-106);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
    public static void method2064(byte arg0) {
        field4974 = null;
        field4972 = null;
        field4975 = null;
        int var1 = 124 % ((-arg0 - 29) / 46);
    }
}
