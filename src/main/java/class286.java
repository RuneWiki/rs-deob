import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class286 {

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "Lf;")
    public static class227 field4551 = new class227(128);

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
    public static int field4557 = 0;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "[I")
    public static int[] field4555 = new int[50];

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
    public static int field4556 = -1;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
    public static int field4554 = 0;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)V")
    public static void method1914(byte arg0) {
        field4551 = null;
        field4555 = null;
        if (arg0 != 117) {
            method1914((byte) -100);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lpb;IIIBII)Lpb;")
    public static final class168 method1915(class168 arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field4552++;
        if (arg4 < 84) {
            method1914((byte) 39);
        }
        long var7 = (long) arg2;
        class168 var9 = (class168) class61.field1037.method1155(var7, true);
        if (var9 == null) {
            class264 var10 = class264.method1779(class197.field3219, arg2, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1786(64, 768, -50, -10, -50);
            class61.field1037.method1161(var9, (byte) -128, var7);
        }
        int var11 = arg0.method337();
        int var12 = arg0.method359();
        int var13 = arg0.method360();
        int var14 = arg0.method342();
        class168 var15 = var9.method336(true, true, true);
        if (arg3 != 0) {
            var15.method347(arg3);
        }
        class41 var16 = (class41) var15;
        if (class218.method1450(arg5 + var13, arg6 + var11, true, class92.field1448) != arg1 || arg1 != class218.method1450(arg5 + var14, arg6 + var12, true, class92.field1448)) {
            for (int var17 = 0; var17 < var16.field702; var17++) {
                var16.field694[var17] += class218.method1450(var16.field714[var17] + arg5, var16.field700[var17] + arg6, true, class92.field1448) - arg1;
            }
            var16.field715 = false;
        }
        return var15;
    }
}
