import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class27 {

    @OriginalMember(owner = "client!de", name = "b", descriptor = "Lic;")
    public static class59 field699 = class59.method433(0, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!de", name = "e", descriptor = "Lic;")
    private static class59 field702 = class59.method433(0, "FULL");

    @OriginalMember(owner = "client!de", name = "g", descriptor = "Lic;")
    private static class59 field704 = class59.method433(0, "Ok");

    @OriginalMember(owner = "client!de", name = "f", descriptor = "Lic;")
    public static class59 field703 = field702;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "Lic;")
    public static class59 field705 = class59.method433(0, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!de", name = "i", descriptor = "Lic;")
    public static class59 field706 = class59.method433(0, "huffman");

    @OriginalMember(owner = "client!de", name = "j", descriptor = "Lic;")
    public static class59 field707 = field704;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "[I")
    public static int[] field698;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method205(int arg0, int arg1) {
        if (arg1 != 24453) {
            field699 = null;
        }
        field701++;
        if (arg0 == 100 && class137.field3047 > 0) {
            byte[] var2 = class46.field1168[--class137.field3047];
            class46.field1168[class137.field3047] = null;
            return var2;
        } else if (arg0 == 5000 && class42.field1079 > 0) {
            byte[] var3 = class34.field900[--class42.field1079];
            class34.field900[class42.field1079] = null;
            return var3;
        } else if (arg0 == 30000 && class47.field1191 > 0) {
            byte[] var4 = class158.field3522[--class47.field1191];
            class158.field3522[class47.field1191] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
    public static void method206(int arg0) {
        field704 = null;
        field707 = null;
        field705 = null;
        field702 = null;
        field703 = null;
        field699 = null;
        field706 = null;
        if (arg0 < -29) {
            field698 = null;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method207(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field700++;
        if (arg1 > 87 && class114.method923(arg5, (byte) -128)) {
            class32.method252(arg4, 0, arg6, arg7, -1, arg0, arg3, arg2, class46.field1173[arg5]);
        }
    }
}
