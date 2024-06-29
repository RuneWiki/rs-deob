import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class206 extends class362 {

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "Luh;")
    public class168 field2961 = new class168();

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "Z")
    public static boolean field2960 = false;

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILqo;)V", line = 5)
    public static final void method1426(int arg0, class22 arg1) {
        field2962++;
        if (class716.field9751 == null) {
            class659 var2 = new class659();
            byte[] var3 = var2.method3711(128, 128, (byte) 121, 16);
            class716.field9751 = class727.method4021(var3, false, (byte) 81);
        }
        if (class516.field7191 == null) {
            class78 var4 = new class78();
            byte[] var5 = var4.method723(128, (byte) 111, 16, 128);
            class516.field7191 = class727.method4021(var5, false, (byte) 103);
        }
        if (arg0 != 8) {
            method1427(-39, null);
        }
        class567 var6 = arg1.field558;
        if (var6.method3282(35632) && class605.field8307 == null) {
            byte[] var7 = class608.method3455(128, -1922, 8, 0.6F, 128, 4.0F, 4.0F, 0.5F, 16.0F, new class453(419684), 16);
            class605.field8307 = class727.method4021(var7, false, (byte) 78);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILcea;)Ltf;", line = 48)
    public static final class297 method1427(int arg0, class215 arg1) {
        field2959++;
        arg1.method1535(255);
        int var2 = arg1.method1535(255);
        class297 var3 = class520.method3025(var2, (byte) -84);
        var3.field4169 = arg1.method1535(255);
        int var4 = arg1.method1535(255);
        if (arg0 < 123) {
            return null;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method1535(255);
            var3.method17(arg1, var6, 31015);
        }
        var3.method711(120);
        return var3;
    }
}
