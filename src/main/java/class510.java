import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lea")
public class class510 {

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "I")
    public static int field7196 = 0;

    @OriginalMember(owner = "client!lea", name = "d", descriptor = "I")
    public int field7198;

    @OriginalMember(owner = "client!lea", name = "f", descriptor = "I")
    public static int field7200;

    @OriginalMember(owner = "client!lea", name = "c", descriptor = "Lq;")
    public static class151 field7197;

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "Lmn;")
    public class212 field7195;

    @OriginalMember(owner = "client!lea", name = "e", descriptor = "Lmv;")
    public static class295 field7199;

    @OriginalMember(owner = "client!lea", name = "g", descriptor = "[I")
    public int[] field7201;

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lgk;I)Lts;")
    public static final class35 method2894(class540 arg0, int arg1) {
        if (arg1 == 0) {
            field7200++;
            return new class35(arg0.method3129(126), arg0.method3129(67), arg0.method3129(arg1 ^ 0x7A), arg0.method3129(90), arg0.method3154((byte) -59), arg0.method3154((byte) -71), arg0.method3115(29871));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(B)V")
    public static void method2895(byte arg0) {
        field7199 = null;
        if (arg0 >= 52) {
            field7197 = null;
        }
    }
}
