import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class539 {

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "Lfc;")
    public static class262 field7308 = new class262(4);

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "[I")
    public static int[] field7310 = new int[13];

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field7307;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field7309;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
    public static void method2964(byte arg0) {
        field7310 = null;
        if (arg0 != -53) {
            method2964((byte) 8);
        }
        field7308 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BI)Ljha;")
    public static final class695 method2965(byte arg0, int arg1) {
        field7307++;
        if (class314.field4239 && arg1 >= class159.field2005 && arg1 <= class278.field3715) {
            if (arg0 <= 112) {
                field7309 = 95;
            }
            return class318.field4284[arg1 - class159.field2005];
        } else {
            return null;
        }
    }
}
