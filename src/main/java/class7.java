import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class7 extends class247 {

    @OriginalMember(owner = "client!gf", name = "M", descriptor = "Ljava/lang/Object;")
    private Object field175;

    @OriginalMember(owner = "client!gf", name = "I", descriptor = "I")
    public static int field171 = 0;

    @OriginalMember(owner = "client!gf", name = "K", descriptor = "Lcd;")
    public static class64 field173 = class44.method335((byte) 71, "Fps:");

    @OriginalMember(owner = "client!gf", name = "L", descriptor = "I")
    public static int field174 = 0;

    @OriginalMember(owner = "client!gf", name = "O", descriptor = "[Lcd;")
    public static class64[] field177 = new class64[100];

    @OriginalMember(owner = "client!gf", name = "G", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!gf", name = "H", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!gf", name = "J", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!gf", name = "N", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(Z)Ljava/lang/Object;", line = 12)
    public final Object method71(boolean arg0) {
        if (arg0) {
            field169 = -100;
        }
        field172++;
        return this.field175;
    }

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "(I)Z", line = 24)
    public final boolean method72(int arg0) {
        field176++;
        if (arg0 > -60) {
            field174 = 70;
        }
        return false;
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(B)V", line = 39)
    public static void method73(byte arg0) {
        field177 = null;
        field173 = null;
        if (arg0 >= -78) {
            method73((byte) -53);
        }
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 58)
    public class7(Object arg0) {
        this.field175 = arg0;
    }
}
