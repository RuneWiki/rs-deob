import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class52 {

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public static int field1320 = 0;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public static int field1317 = 0;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "[Ltc;")
    public static class114[] field1324 = new class114[2048];

    @OriginalMember(owner = "client!id", name = "j", descriptor = "[I")
    public static int[] field1325 = new int[200];

    @OriginalMember(owner = "client!id", name = "k", descriptor = "I")
    public static int field1326 = 2;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "I")
    public static volatile int field1328 = -1;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "Lke;")
    public static class65 field1329 = class1.method17("Freunde", -123);

    @OriginalMember(owner = "client!id", name = "l", descriptor = "Lqe;")
    public static class101 field1327 = new class101();

    @OriginalMember(owner = "client!id", name = "r", descriptor = "Lke;")
    public static class65 field1333 = class1.method17("Neuer Benutzer", -113);

    @OriginalMember(owner = "client!id", name = "v", descriptor = "Lke;")
    private static class65 field1337 = class1.method17("Take", -121);

    @OriginalMember(owner = "client!id", name = "t", descriptor = "Lke;")
    public static class65 field1335 = field1337;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "I")
    public static int field1330 = 0;

    @OriginalMember(owner = "client!id", name = "s", descriptor = "Lke;")
    public static class65 field1334 = class1.method17("Ihr Spielkonto wurde deaktiviert)3", -123);

    @OriginalMember(owner = "client!id", name = "w", descriptor = "Lke;")
    private static class65 field1338 = class1.method17("This computers address has been blocked", -122);

    @OriginalMember(owner = "client!id", name = "q", descriptor = "Lke;")
    public static class65 field1332 = field1338;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "Luc;")
    public static class119 field1319;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "Lpa;")
    public static class90 field1322;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "[I")
    public static int[] field1321;

    @OriginalMember(owner = "client!id", name = "u", descriptor = "[Luc;")
    public static class119[] field1336;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V", line = 13)
    public static void method413(int arg0) {
        field1336 = null;
        field1337 = null;
        field1332 = null;
        field1327 = null;
        field1319 = null;
        field1324 = null;
        field1333 = null;
        field1338 = null;
        field1322 = null;
        field1321 = null;
        if (arg0 < -40) {
            field1334 = null;
            field1325 = null;
            field1335 = null;
            field1329 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(II[Lke;I)Lke;", line = 56)
    public static final class65 method414(int arg0, int arg1, class65[] arg2, int arg3) {
        field1331++;
        int var4 = 0;
        for (int var5 = 0; var5 < arg0; var5++) {
            if (arg2[arg1 + var5] == null) {
                arg2[arg1 + var5] = class73.field1944;
            }
            var4 += arg2[arg1 + var5].field1733;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = arg3; var8 < arg0; var8++) {
            class65 var10 = arg2[arg1 + var8];
            class68.method572(var10.field1702, 0, var6, var7, var10.field1733);
            var7 += var10.field1733;
        }
        class65 var9 = new class65();
        var9.field1702 = var6;
        var9.field1733 = var4;
        return var9;
    }
}
