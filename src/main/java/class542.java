import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public class class542 {

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "Llg;")
    public static class32 field7574 = new class32();

    @OriginalMember(owner = "client!baa", name = "c", descriptor = "Luv;")
    public static class3 field7576 = new class3(26, 12);

    @OriginalMember(owner = "client!baa", name = "b", descriptor = "I")
    public static int field7575;

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(IILkr;I)Lhd;")
    public static final class270 method3006(int arg0, int arg1, class329 arg2, int arg3) {
        field7575++;
        class551 var4 = new class551(arg2.method2054(true, arg0, arg1));
        class270 var5 = new class270(arg1, var4.method3077(arg3 - 20739), var4.method3077(-20739), var4.method3048(-4), var4.method3048(arg3 - 4), var4.method3045(arg3 - 127) == 1, var4.method3045(-127), var4.method3045(-128));
        int var6 = var4.method3045(arg3 ^ 0xFFFFFF81);
        for (int var7 = arg3; var7 < var6; var7++) {
            var5.field3444.method3181(new class444(var4.method3045(-128), var4.method3090(-86), var4.method3090(-115), var4.method3090(-93), var4.method3090(-97), var4.method3090(-110), var4.method3090(-88), var4.method3090(-78), var4.method3090(-110)), true);
        }
        var5.method1652(54);
        return var5;
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(B)V")
    public static void method3007(byte arg0) {
        if (arg0 == 121) {
            field7576 = null;
            field7574 = null;
        }
    }
}
