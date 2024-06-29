import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class336 {

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "I")
    public static int field5032 = 0;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "Lo;")
    public static class332 field5031 = new class332("green:", "grün:", "vert:", "verde:");

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "I")
    public static int field5033 = 0;

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "I")
    public static int field5035 = 0;

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "Lo;")
    public static class332 field5034 = new class332("glow2:", "leuchten2:", "brillant2:", "brilho2:");

    @OriginalMember(owner = "client!sq", name = "f", descriptor = "Ltq;")
    public static class63 field5036;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)V")
    public static void method2062(byte arg0) {
        field5036 = null;
        field5034 = null;
        if (arg0 == 122) {
            field5031 = null;
        }
    }
}
