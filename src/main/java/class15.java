import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class15 {

    @OriginalMember(owner = "client!qr", name = "e", descriptor = "Ljava/lang/String;")
    public static String field230 = "flash2:";

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!qr", name = "f", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!qr", name = "d", descriptor = "[[Z")
    public static boolean[][] field229;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(B)V")
    public static void method91(byte arg0) {
        if (arg0 == -27) {
            field229 = null;
            field230 = null;
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(BI[B)I")
    public static final int method92(byte arg0, int arg1, byte[] arg2) {
        if (arg0 == 85) {
            field228++;
            return class360.method2310((byte) 124, arg1, arg2, 0);
        } else {
            return -121;
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lec;I)Lsg;")
    public static final class265 method93(class37 arg0, int arg1) {
        field227++;
        class265 var2 = new class265();
        var2.field3984 = arg0.method320((byte) -87);
        var2.field3978 = class56.method439(var2.field3984, true);
        if (arg1 != 31731) {
            field229 = null;
        }
        return var2;
    }
}
