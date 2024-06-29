import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class2 extends class525 {

    @OriginalMember(owner = "client!ro", name = "C", descriptor = "I")
    public int field2 = 0;

    @OriginalMember(owner = "client!ro", name = "D", descriptor = "Lrj;")
    public static class430 field3 = new class430("WTWIP", 3);

    @OriginalMember(owner = "client!ro", name = "E", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!ro", name = "F", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!ro", name = "A", descriptor = "Ll;")
    public static class16 field1;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(ILwn;)V", line = 5)
    public final void method5(int arg0, class519 arg1) {
        while (true) {
            int var3 = arg1.method3072((byte) -127);
            if (var3 == 0) {
                field4++;
                int var4 = -41 / ((20 - arg0) / 50);
                return;
            }
            this.method7(arg1, var3, false);
        }
    }

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "(I)V", line = 28)
    public static void method6(int arg0) {
        field1 = null;
        field3 = null;
        if (arg0 >= -123) {
            field3 = null;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lwn;IZ)V", line = 46)
    private final void method7(class519 arg0, int arg1, boolean arg2) {
        if (arg1 == 2) {
            this.field2 = arg0.method3018(566990904);
        }
        if (arg2) {
            this.field2 = -29;
        }
        field5++;
    }
}
