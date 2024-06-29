import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uba")
public class class628 {

    @OriginalMember(owner = "client!uba", name = "b", descriptor = "Lnj;")
    public static class487 field9195 = new class487("flash3:", "blinken3:", "clignotant3:", "brilho3:");

    @OriginalMember(owner = "client!uba", name = "c", descriptor = "I")
    public static int field9196;

    @OriginalMember(owner = "client!uba", name = "e", descriptor = "I")
    public static int field9198;

    @OriginalMember(owner = "client!uba", name = "g", descriptor = "[B")
    public byte[] field9200;

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "[S")
    public short[] field9194;

    @OriginalMember(owner = "client!uba", name = "d", descriptor = "[S")
    public short[] field9197;

    @OriginalMember(owner = "client!uba", name = "f", descriptor = "[S")
    public short[] field9199;

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(I)V")
    public static void method3664(int arg0) {
        field9195 = null;
        if (arg0 != -6366) {
            method3665(47);
        }
    }

    @OriginalMember(owner = "client!uba", name = "b", descriptor = "(I)Ljava/lang/String;")
    public static final String method3665(int arg0) {
        field9198++;
        if (class139.field1826 || class281.field4172 == null) {
            return "";
        } else {
            if (arg0 != -22829) {
                method3666(-17, null);
            }
            return class281.field4172.field8162;
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(ILwca;)V")
    public static final void method3666(int arg0, class311 arg1) {
        field9196++;
        if (arg0 < 109) {
            field9195 = null;
        }
        class311 var2 = class272.method1723(-1, arg1);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class522.field7735;
            var4 = class337.field4944;
        } else {
            var4 = var2.field4620;
            var3 = var2.field4543;
        }
        class16.method76(-1117, arg1, false, var4, var3);
        class157.method908(var3, var4, (byte) 94, arg1);
    }
}
