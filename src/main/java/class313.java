import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class313 {

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "Ltu;")
    private static class7 field4032 = new class7();

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
    public static final void method1862(int arg0) {
        if (arg0 != 15946) {
            field4032 = null;
        }
        while (true) {
            class128 var1 = (class128) field4032.method52((byte) -123);
            if (var1 == null) {
                return;
            }
            var1.field1754.method373();
            var1.method3021(18);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lga;I)V")
    public static final synchronized void method1863(class241 arg0, int arg1) {
        int var2 = 111 % ((30 - arg1) / 43);
        class128 var3 = new class128();
        var3.field1754 = arg0;
        field4032.method42(var3, 0);
    }
}
