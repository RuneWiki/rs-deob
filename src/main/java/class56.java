import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class56 {

    @OriginalMember(owner = "client!i", name = "c", descriptor = "Lid;")
    private static class60 field1390 = class11.method72("Loading interfaces )2 ", (byte) -51);

    @OriginalMember(owner = "client!i", name = "b", descriptor = "Lid;")
    public static class60 field1389 = null;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "Lid;")
    public static class60 field1395 = class11.method72("Anmelde)2Limit -Uberschritten)3", (byte) 5);

    @OriginalMember(owner = "client!i", name = "m", descriptor = "Lid;")
    public static class60 field1400 = class11.method72("Update)2Liste geladen)3", (byte) -87);

    @OriginalMember(owner = "client!i", name = "k", descriptor = "Lid;")
    public static class60 field1398 = field1390;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "Lid;")
    public static class60 field1399 = class11.method72("Versteckt", (byte) 1);

    @OriginalMember(owner = "client!i", name = "j", descriptor = "I")
    public static int field1397 = 0;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "[I")
    public static int[] field1396 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!i", name = "f", descriptor = "Lwd;")
    public static class157 field1393 = new class157(5000);

    @OriginalMember(owner = "client!i", name = "r", descriptor = "Lid;")
    public static class60 field1405 = class11.method72("Ausw-=hlen", (byte) -68);

    @OriginalMember(owner = "client!i", name = "q", descriptor = "I")
    public static int field1404 = 0;

    @OriginalMember(owner = "client!i", name = "p", descriptor = "[Lid;")
    public static class60[] field1403 = new class60[100];

    @OriginalMember(owner = "client!i", name = "s", descriptor = "[I")
    public static int[] field1406 = new int[500];

    @OriginalMember(owner = "client!i", name = "u", descriptor = "Lid;")
    public static class60 field1408 = class11.method72("", (byte) 100);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!i", name = "o", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!i", name = "t", descriptor = "Lpa;")
    public static class105 field1407;

    @OriginalMember(owner = "client!i", name = "v", descriptor = "Lub;")
    public static class141 field1409;

    @OriginalMember(owner = "client!i", name = "n", descriptor = "Ljava/lang/String;")
    public static String field1401;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(JI)V")
    public static final void method401(long arg0, int arg1) {
        if (arg1 >= -83) {
            field1401 = null;
        }
        field1394++;
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class103.field2502; var3++) {
            if (class136.field3082[var3] == arg0) {
                class103.field2502--;
                for (int var4 = var3; var4 < class103.field2502; var4++) {
                    class67.field1639[var4] = class67.field1639[var4 + 1];
                    class89.field2210[var4] = class89.field2210[var4 + 1];
                    class136.field3082[var4] = class136.field3082[var4 + 1];
                    class17.field427[var4] = class17.field427[var4 + 1];
                }
                class32.field746++;
                class42.field1112 = class78.field1921;
                class22.field519.method1214(180, 0);
                class22.field519.method830(arg0, 85);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIZ)V")
    public static final void method402(int arg0, int arg1, int arg2, boolean arg3) {
        for (int var4 = 0; var4 < 8; var4++) {
            for (int var7 = 0; var7 < 8; var7++) {
                class113.field2711[arg1][arg2 + var4][arg0 + var7] = 0;
            }
        }
        if (!arg3) {
            field1403 = null;
        }
        if (arg2 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                class113.field2711[arg1][arg2][arg0 + var5] = class113.field2711[arg1][arg2 - 1][arg0 + var5];
            }
        }
        if (arg0 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                class113.field2711[arg1][arg2 + var6][arg0] = class113.field2711[arg1][arg2 + var6][arg0 - 1];
            }
        }
        field1402++;
        if (arg2 > 0 && class113.field2711[arg1][arg2 - 1][arg0] != 0) {
            class113.field2711[arg1][arg2][arg0] = class113.field2711[arg1][arg2 - 1][arg0];
        } else if (arg0 > 0 && class113.field2711[arg1][arg2][arg0 - 1] != 0) {
            class113.field2711[arg1][arg2][arg0] = class113.field2711[arg1][arg2][arg0 - 1];
        } else if (arg2 > 0 && arg0 > 0 && class113.field2711[arg1][arg2 - 1][arg0 - 1] != 0) {
            class113.field2711[arg1][arg2][arg0] = class113.field2711[arg1][arg2 - 1][arg0 - 1];
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V")
    public static void method403(byte arg0) {
        field1405 = null;
        field1401 = null;
        field1408 = null;
        field1389 = null;
        field1393 = null;
        field1399 = null;
        field1409 = null;
        field1400 = null;
        field1398 = null;
        if (arg0 != -65) {
            field1396 = null;
        }
        field1407 = null;
        field1396 = null;
        field1390 = null;
        field1403 = null;
        field1406 = null;
        field1395 = null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II[BI)Lid;")
    public static final class60 method404(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg0 > -42) {
            method402(8, -98, 18, false);
        }
        class60 var4 = new class60();
        var4.field1453 = new byte[arg1];
        field1391++;
        var4.field1474 = 0;
        for (int var5 = arg3; var5 < arg3 + arg1; var5++) {
            if (arg2[var5] != 0) {
                var4.field1453[var4.field1474++] = arg2[var5];
            }
        }
        return var4;
    }
}
