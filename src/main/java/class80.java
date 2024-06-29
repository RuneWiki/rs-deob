import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class80 {

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "Z")
    public static volatile boolean field1417 = true;

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "I")
    public static int field1422 = 0;

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "Lkb;")
    public static class93 field1425 = class76.method390("<col=80ff00>", 0);

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "Lkb;")
    public static class93 field1427 = class76.method390("Der Server wird gerade aktualisiert)3", 0);

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "Lkb;")
    public static class93 field1428 = class76.method390("Regeln versto-8en hat)3", 0);

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
    public static int field1421 = 0;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "Lhg;")
    public static class72 field1419 = new class72(0, 0);

    @OriginalMember(owner = "client!ig", name = "q", descriptor = "Lkb;")
    private static class93 field1431 = class76.method390("Invalid username or password)3", 0);

    @OriginalMember(owner = "client!ig", name = "r", descriptor = "Lkb;")
    public static class93 field1432 = field1431;

    @OriginalMember(owner = "client!ig", name = "s", descriptor = "Lkb;")
    private static class93 field1433 = class76.method390("red:", 0);

    @OriginalMember(owner = "client!ig", name = "t", descriptor = "Lkb;")
    public static class93 field1434 = field1433;

    @OriginalMember(owner = "client!ig", name = "u", descriptor = "Lkb;")
    public static class93 field1435 = field1433;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
    public int field1416;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
    public int field1420;

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "I")
    public int field1429;

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "I")
    public int field1430;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "Lh;")
    public static class65 field1418;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "Lkb;")
    public class93 field1423;

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "Z")
    public boolean field1424;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
    public static void method401(int arg0) {
        field1427 = null;
        field1434 = null;
        field1419 = null;
        field1418 = null;
        field1433 = null;
        field1425 = null;
        field1435 = null;
        field1431 = null;
        field1432 = null;
        if (arg0 != 16260) {
            field1425 = null;
        }
        field1428 = null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lrd;IIIIIII)V")
    public static final void method402(class158 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg7 != 21165) {
            return;
        }
        if (arg2 >= 0 && arg2 < 104 && arg1 >= 0 && arg1 < 104) {
            class136.field2637[arg3][arg2][arg1] = 0;
            while (true) {
                int var8 = arg0.method1054(arg7 ^ 0x522D);
                if (var8 == 0) {
                    if (arg3 == 0) {
                        class151.field2935[0][arg2][arg1] = -class21.method128(arg5 + arg1 + 556238, arg6 + 932731 - -arg2, -104) * 8;
                    } else {
                        class151.field2935[arg3][arg2][arg1] = class151.field2935[arg3 - 1][arg2][arg1] - 240;
                    }
                    break;
                }
                if (var8 == 1) {
                    int var9 = arg0.method1054(128);
                    if (var9 == 1) {
                        var9 = 0;
                    }
                    if (arg3 == 0) {
                        class151.field2935[0][arg2][arg1] = -var9 * 8;
                    } else {
                        class151.field2935[arg3][arg2][arg1] = class151.field2935[arg3 - 1][arg2][arg1] - var9 * 8;
                    }
                    break;
                }
                if (var8 <= 49) {
                    class195.field3784[arg3][arg2][arg1] = arg0.method1066(true);
                    class68.field1266[arg3][arg2][arg1] = (byte) ((var8 - 2) / 4);
                    class70.field1287[arg3][arg2][arg1] = (byte) class91.method479(arg4 + var8 - 2, 3);
                } else if (var8 <= 81) {
                    class136.field2637[arg3][arg2][arg1] = (byte) (var8 - 49);
                } else {
                    class35.field571[arg3][arg2][arg1] = (byte) (var8 - 81);
                }
            }
        } else {
            while (true) {
                int var10 = arg0.method1054(arg7 - 21037);
                if (var10 == 0) {
                    break;
                }
                if (var10 == 1) {
                    arg0.method1054(128);
                    break;
                }
                if (var10 <= 49) {
                    arg0.method1054(128);
                }
            }
        }
        field1415++;
    }
}
