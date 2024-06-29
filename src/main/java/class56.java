import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class56 {

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
    public static int field1444 = 0;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
    public static int field1447 = -1;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "Lgd;")
    public static class40 field1443 = class14.method90(false, "Verbindung mit Freunde)2Server)3)3)3");

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "[B")
    public static byte[] field1449 = new byte[520];

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "Lgd;")
    private static class40 field1451 = class14.method90(false, "shake:");

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "Lgd;")
    public static class40 field1453 = class14.method90(false, " Sekunde(Xn(Y -Ubertragen)3");

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
    public static int field1455 = 500;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "Lgd;")
    public static class40 field1450 = field1451;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "Lgd;")
    private static class40 field1448 = class14.method90(false, "Add friend");

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "Lgd;")
    private static class40 field1457 = class14.method90(false, "flash3:");

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "Lgd;")
    public static class40 field1452 = field1448;

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "Lgd;")
    public static class40 field1456 = field1457;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public static int field1446 = 0;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(II[Lq;[BIII)V", line = 3)
    public static final void method418(int arg0, int arg1, class99[] arg2, byte[] arg3, int arg4, int arg5, int arg6) {
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var12 = 0; var12 < 64; var12++) {
                for (int var13 = 0; var13 < 64; var13++) {
                    if (arg5 + var12 > 0 && arg5 + var12 < 103 && arg1 + var13 > 0 && arg1 + var13 < 103) {
                        arg2[var7].field2367[arg5 + var12][arg1 + var13] = class101.method709(arg2[var7].field2367[arg5 + var12][arg1 + var13], -16777217);
                    }
                }
            }
        }
        field1445++;
        if (arg4 != -14009) {
            return;
        }
        class104 var8 = new class104(arg3);
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < 64; var10++) {
                for (int var11 = 0; var11 < 64; var11++) {
                    class114.method885((byte) -73, var8, arg5 + var10, arg0, arg6, arg1 + var11, 0, var9);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V", line = 82)
    public static void method419(byte arg0) {
        field1443 = null;
        field1456 = null;
        field1451 = null;
        field1453 = null;
        field1457 = null;
        int var1 = 123 / ((-arg0 - 49) / 34);
        field1450 = null;
        field1448 = null;
        field1452 = null;
        field1449 = null;
    }
}
