import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vga")
public class class85 extends class289 {

    @OriginalMember(owner = "client!vga", name = "i", descriptor = "Lqfa;")
    public static class98 field1051 = new class98(94, 8);

    @OriginalMember(owner = "client!vga", name = "g", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!vga", name = "h", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(I)V", line = 8)
    public static void method645(int arg0) {
        field1051 = null;
        if (arg0 >= -57) {
            method646(28, 90, -46, 49);
        }
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(IIII)V", line = 18)
    public static final void method646(int arg0, int arg1, int arg2, int arg3) {
        field1049++;
        class592 var4 = class682.method3825(-652872096, 9, arg0);
        var4.method3351(0);
        var4.field8343 = arg2;
        var4.field8337 = arg1;
        if (arg3 != -4847) {
            field1051 = null;
        }
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(IIIZ)V", line = 40)
    public static final void method647(int arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg2 * class557.field7812.field6547.method3029(arg3) >> 8;
        field1050++;
        if (var4 == 0 || arg1 == -1) {
            return;
        }
        if (!class105.field1268 && class118.field1431 != -1 && class70.method576(-21552) && !class457.method2719(true)) {
            class79.field1006 = class195.method1205(92);
            class223 var5 = class509.method3011(class79.field1006, (byte) 9);
            class29.method168(true, (byte) -114, var5);
        }
        class658.method3616(var4, arg1, 0, false, class120.field1447, 0);
        class123.method834(0, -1, 255);
        class105.field1268 = true;
    }
}
