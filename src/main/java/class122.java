import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class122 {

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
    public int field1669 = 1;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "Lgca;")
    public static class209 field1670 = new class209(8);

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "Lrq;")
    public static class482 field1672 = new class482();

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "Lju;")
    public static class102 field1673 = new class102(38, 8);

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "C")
    public char field1666;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "Lnga;")
    public static class672 field1667;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Z)V", line = 3)
    public static void method787(boolean arg0) {
        field1673 = null;
        field1670 = null;
        field1667 = null;
        field1672 = null;
        if (!arg0) {
            field1670 = null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lvj;B)V", line = 18)
    public final void method788(class26 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method194((byte) 119);
            if (var3 == 0) {
                if (arg1 > -21) {
                    return;
                }
                field1671++;
                return;
            }
            this.method789(arg0, var3, 8);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lvj;II)V", line = 45)
    private final void method789(class26 arg0, int arg1, int arg2) {
        if (arg2 != 8) {
            return;
        }
        field1668++;
        if (arg1 == 1) {
            this.field1666 = class503.method3005(true, arg0.method195(128));
        } else if (arg1 == 2) {
            this.field1669 = 0;
            return;
        }
    }
}
