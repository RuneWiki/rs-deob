import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class26 extends class211 {

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "I")
    public static int field342 = 0;

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "I")
    public int field338;

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "I")
    public int field339;

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "I")
    public int field343;

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "I")
    public int field345;

    @OriginalMember(owner = "client!ud", name = "s", descriptor = "I")
    public int field346;

    @OriginalMember(owner = "client!ud", name = "t", descriptor = "I")
    public int field347;

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "Ljava/lang/String;")
    public String field341;

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "[Ltq;")
    public static class427[] field340;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)V", line = 14)
    public static void method135(byte arg0) {
        field340 = null;
        int var1 = -94 / ((arg0 - 4) / 39);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIILus;)V", line = 27)
    public static final void method136(int arg0, int arg1, int arg2, int arg3, class1 arg4) {
        field344++;
        long var5 = (long) (arg0 | arg3 << 28 | arg2 << 14);
        class163 var7 = (class163) class252.field3845.method2409(false, var5);
        if (var7 == null) {
            class163 var8 = new class163();
            class252.field3845.method2413(var5, -1, var8);
            var8.field2536.method4(1, arg4);
            return;
        }
        class182 var9 = class288.field4362.method3030((byte) 91, arg4.field1);
        if (arg1 > -9) {
            method136(-34, -110, 61, -87, null);
        }
        int var10 = var9.field2833;
        if (var9.field2886 == 1) {
            var10 = (arg4.field3 + 1) * var10;
        }
        for (class1 var11 = (class1) var7.field2536.method8((byte) -98); var11 != null; var11 = (class1) var7.field2536.method17((byte) 68)) {
            class182 var12 = class288.field4362.method3030((byte) 84, var11.field1);
            int var13 = var12.field2833;
            if (var12.field2886 == 1) {
                var13 = (var11.field3 + 1) * var13;
            }
            if (var10 > var13) {
                class18.method97(arg4, 1839, var11);
                return;
            }
        }
        var7.field2536.method4(1, arg4);
    }
}
