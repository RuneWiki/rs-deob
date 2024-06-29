import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class529 {

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "I")
    public static int field7312;

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "Lga;")
    public static class332 field7313;

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "Ljava/awt/Frame;")
    public static Frame field7314;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(B)J", line = 3)
    public static final synchronized long method2982(byte arg0) {
        field7312++;
        if (arg0 != -69) {
            return -69L;
        }
        long var1 = System.currentTimeMillis();
        if (class447.field5915 > var1) {
            class123.field1690 += class447.field5915 - var1;
        }
        class447.field5915 = var1;
        return class123.field1690 + var1;
    }

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "(B)V", line = 27)
    public static void method2983(byte arg0) {
        field7313 = null;
        if (arg0 <= 16) {
            field7313 = null;
        }
        field7314 = null;
    }
}
