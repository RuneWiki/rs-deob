import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class100 {

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "Lkl;")
    public static class56 field1425 = new class56("WTRC", 1);

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "Lkh;")
    public static class13 field1426 = new class13(50);

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "Lak;")
    public static class234 field1427 = new class234("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado");

    @OriginalMember(owner = "client!ct", name = "e", descriptor = "I")
    public static int field1428 = 0;

    @OriginalMember(owner = "client!ct", name = "g", descriptor = "[I")
    public static int[] field1430 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!ct", name = "h", descriptor = "Loe;")
    public static class137 field1431 = new class137();

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!ct", name = "i", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!ct", name = "f", descriptor = "Ll;")
    public static class16 field1429;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(BIIIZLkd;I[B)Loi;", line = 6)
    public static final class53 method806(byte arg0, int arg1, int arg2, int arg3, boolean arg4, class188 arg5, int arg6, byte[] arg7) {
        if (arg0 != -102) {
            field1431 = null;
        }
        field1424++;
        if (!arg5.field3077 && (!class474.method2851(arg1, (byte) -22) || !class474.method2851(arg3, (byte) 126))) {
            return arg5.field3051 ? new class53(arg5, 34037, arg2, arg1, arg3, arg4, arg7, arg6) : new class53(arg5, arg2, arg1, arg3, class396.method2493((byte) 66, arg1), class396.method2493((byte) 66, arg3), arg7, arg6);
        } else {
            return new class53(arg5, 3553, arg2, arg1, arg3, arg4, arg7, arg6);
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(B)V", line = 26)
    public static void method807(byte arg0) {
        field1431 = null;
        field1429 = null;
        field1427 = null;
        if (arg0 > -120) {
            method807((byte) 13);
        }
        field1426 = null;
        field1425 = null;
        field1430 = null;
    }
}
