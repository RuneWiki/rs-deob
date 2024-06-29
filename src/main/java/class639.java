import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class639 extends class316 {

    @OriginalMember(owner = "client!te", name = "r", descriptor = "Lip;")
    public static class735 field8962 = new class735();

    @OriginalMember(owner = "client!te", name = "u", descriptor = "Lbu;")
    public static class21 field8965 = new class21(44, 2);

    @OriginalMember(owner = "client!te", name = "q", descriptor = "I")
    public static int field8961;

    @OriginalMember(owner = "client!te", name = "s", descriptor = "I")
    public static int field8963;

    @OriginalMember(owner = "client!te", name = "v", descriptor = "Ljd;")
    public static class241 field8966;

    @OriginalMember(owner = "client!te", name = "p", descriptor = "Luca;")
    public static class537 field8960;

    @OriginalMember(owner = "client!te", name = "t", descriptor = "Ljava/lang/String;")
    private String field8964;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(B)V")
    public static void method3652(byte arg0) {
        field8960 = null;
        field8962 = null;
        field8966 = null;
        field8965 = null;
        if (arg0 <= 63) {
            method3652((byte) -43);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BLmda;)V")
    public final void method152(byte arg0, class276 arg1) {
        arg1.field4018 = this.field8964;
        field8961++;
        if (arg0 <= 80) {
            field8960 = null;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILso;)V")
    public final void method148(int arg0, class494 arg1) {
        field8963++;
        this.field8964 = arg1.method2996(110);
        arg1.method2976(-124);
        if (arg0 != -1001) {
            this.field8964 = null;
        }
    }
}
