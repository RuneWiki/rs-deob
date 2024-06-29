import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class234 {

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public static int field3729 = 0;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Llm;I)V", line = 5)
    public static final void method1678(class55 arg0, int arg1) {
        field3731++;
        if (arg1 >= 14) {
            class147.field2198 = arg0;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lkb;IIBLkb;)Lml;", line = 16)
    public static final class143 method1679(class39 arg0, int arg1, int arg2, byte arg3, class39 arg4) {
        field3730++;
        int var5 = 119 % ((-arg3 - 30) / 63);
        return class288.method2026(arg2, arg1, arg4, -52) ? class233.method1675(arg0.method250(true, arg2, arg1), 127) : null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)Lkm;", line = 31)
    public static final class341 method1680(int arg0, int arg1) {
        if (arg1 != 0) {
            return (class341) null;
        }
        field3732++;
        class341 var2 = (class341) class324.field5065.method1619((long) arg0, 51);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class148.field2210.method250(true, class129.method886((byte) 116, arg0), class90.method648(arg0, (byte) 7));
        class341 var4 = new class341();
        if (var3 != null) {
            var4.method2353(new class192(var3), (byte) -76);
        }
        class324.field5065.method1621((long) arg0, -128, var4);
        return var4;
    }
}
