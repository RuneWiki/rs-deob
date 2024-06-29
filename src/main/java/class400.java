import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public abstract class class400 {

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "Lnj;")
    public static class162 field5877 = new class162(8);

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
    public static int field5879 = 0;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "Ll;")
    public static class16 field5878;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)V", line = 10)
    public static void method2417(byte arg0) {
        field5877 = null;
        field5878 = null;
        if (arg0 != -85) {
            method2417((byte) 13);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Ljp;B)Ljp;")
    public abstract class237 method2366(class237 arg0, byte arg1);
}
