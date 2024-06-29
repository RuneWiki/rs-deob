import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public abstract class class16 {

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "Lap;")
    public class435 field141;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "Lkfa;")
    public static class549 field143 = new class549(66, 4);

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)Z")
    public abstract boolean method52(int arg0);

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIZ)V")
    public abstract void method42(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZB)V")
    public abstract void method50(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)V")
    public abstract void method48(byte arg0);

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)V")
    public static void method67(boolean arg0) {
        if (!arg0) {
            field143 = null;
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(B)V")
    public static final void method68(byte arg0) {
        field142++;
        try {
            if (class636.field9006 == 1) {
                int var1 = class112.field1304.method631((byte) -30);
                if (var1 > 0 && class112.field1304.method649((byte) 116)) {
                    int var2 = var1 - class602.field8542;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class112.field1304.method663(var2, 7);
                    return;
                }
                class112.field1304.method648(0);
                class112.field1304.method641(-7060);
                class332.field4299 = null;
                if (class692.field9747 == null) {
                    class636.field9006 = 0;
                } else {
                    class636.field9006 = 2;
                }
                class373.field4840 = null;
            }
            int var3 = 28 % ((-arg0 - 61) / 55);
        } catch (Exception var5) {
            var5.printStackTrace();
            class112.field1304.method648(0);
            class373.field4840 = null;
            class692.field9747 = null;
            class332.field4299 = null;
            class636.field9006 = 0;
        }
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Lap;)V")
    public class16(class435 arg0) {
        this.field141 = arg0;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(BZ)V")
    public abstract void method46(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IILuda;)V")
    public abstract void method44(int arg0, int arg1, class412 arg2);
}
