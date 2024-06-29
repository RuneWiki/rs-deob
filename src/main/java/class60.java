import java.awt.Font;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class60 {

    @OriginalMember(owner = "client!k", name = "p", descriptor = "Z")
    public boolean field1433 = true;

    @OriginalMember(owner = "client!k", name = "n", descriptor = "I")
    public int field1431;

    @OriginalMember(owner = "client!k", name = "m", descriptor = "I")
    public int field1430;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    public int field1418;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "I")
    public int field1423;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "I")
    public int field1422;

    @OriginalMember(owner = "client!k", name = "o", descriptor = "I")
    public int field1432;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "I")
    public static int field1424 = 2;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "Lva;")
    public static class121 field1419 = class107.method797("null", -10983);

    @OriginalMember(owner = "client!k", name = "h", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1425 = new CRC32();

    @OriginalMember(owner = "client!k", name = "s", descriptor = "[I")
    public static int[] field1436 = new int[] { 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800 };

    @OriginalMember(owner = "client!k", name = "u", descriptor = "I")
    public static int field1438 = 0;

    @OriginalMember(owner = "client!k", name = "v", descriptor = "[[I")
    public static int[][] field1439 = new int[104][104];

    @OriginalMember(owner = "client!k", name = "w", descriptor = "Z")
    public static volatile boolean field1440 = false;

    @OriginalMember(owner = "client!k", name = "t", descriptor = "Lpa;")
    public static class91 field1437 = new class91(5000);

    @OriginalMember(owner = "client!k", name = "B", descriptor = "Lva;")
    private static class121 field1445 = class107.method797("Take", -10983);

    @OriginalMember(owner = "client!k", name = "C", descriptor = "I")
    public static int field1446 = 0;

    @OriginalMember(owner = "client!k", name = "y", descriptor = "Lva;")
    public static class121 field1442 = field1445;

    @OriginalMember(owner = "client!k", name = "A", descriptor = "I")
    public static int field1444 = 0;

    @OriginalMember(owner = "client!k", name = "F", descriptor = "Lva;")
    private static class121 field1449 = class107.method797("Connecting to update server", -10983);

    @OriginalMember(owner = "client!k", name = "z", descriptor = "Lva;")
    public static class121 field1443 = field1449;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!k", name = "q", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!k", name = "E", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "Lub;")
    public static class117 field1426;

    @OriginalMember(owner = "client!k", name = "r", descriptor = "Lbe;")
    public static class12 field1435;

    @OriginalMember(owner = "client!k", name = "x", descriptor = "Ljava/awt/Font;")
    public static Font field1441;

    @OriginalMember(owner = "client!k", name = "D", descriptor = "[I")
    public static int[] field1447;

    @OriginalMember(owner = "client!k", name = "G", descriptor = "[Lbc;")
    public static class10[] field1450;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(BI)V", line = 21)
    public static final void method437(byte arg0, int arg1) {
        field1427++;
        if (class14.field253 == arg1) {
            return;
        }
        if (class14.field253 == 0) {
            class120.method931((byte) -8);
        }
        if (arg1 == 20 || arg1 == 40) {
            class45.field1056 = 0;
            class120.field2765 = 0;
            class82.field1915 = 0;
        }
        if (arg1 != 20 && arg1 != 40 && class48.field1146 != null) {
            class48.field1146.method293(-2);
        }
        if (class14.field253 == 25 || class14.field253 == 40) {
            class53.method379(-126);
            class55.method395();
        }
        if (class14.field253 == 25) {
            class79.field1845 = 0;
            class69.field1645 = 0;
            class71.field1675 = 0;
            class61.field1454 = 1;
            class12.field227 = 1;
        }
        if (arg1 == 0 || arg1 == 35) {
            class67.method478((byte) -14);
            class54.method392(arg0 ^ 0xFFFFFFCB);
            if (class119.field2731 == null) {
                class119.field2731 = class11.method86(class46.field1079, 503, 765, false);
            }
        }
        if (arg1 == 5 || arg1 == 10 || arg1 == 20) {
            class119.field2731 = null;
            class67.method478((byte) -24);
            class126.method985(class128.field2936, (byte) 122, class46.field1079, class75.field1721);
        }
        if (arg0 != 67) {
            return;
        }
        if (arg1 == 25 || arg1 == 30 || arg1 == 40) {
            class119.field2731 = null;
            class54.method392(arg0 - 193);
            class113.method859(class75.field1721, class46.field1079, (byte) -23);
        }
        class48.field1149 = true;
        class14.field253 = arg1;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IBI)Z", line = 100)
    public static final boolean method438(int arg0, byte arg1, int arg2) {
        field1434++;
        if (arg1 != -45) {
            method438(33, (byte) -29, -108);
        }
        if (arg2 == 0 && class8.field114 == arg0) {
            return true;
        } else if (arg2 == 1 && class42.field985 == arg0) {
            return true;
        } else {
            return (arg2 == 2 || arg2 == 3) && class90.field2047 == arg0;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V", line = 127)
    public static void method439(byte arg0) {
        field1449 = null;
        field1425 = null;
        field1435 = null;
        field1437 = null;
        field1441 = null;
        field1450 = null;
        field1442 = null;
        field1447 = null;
        field1443 = null;
        field1445 = null;
        field1419 = null;
        field1436 = null;
        int var1 = -45 % ((arg0 - 76) / 47);
        field1439 = null;
        field1426 = null;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Z)I", line = 149)
    public static final int method440(boolean arg0) {
        field1429++;
        return arg0 ? -41 : class115.field2612++;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIII)V", line = 172)
    public static final void method441(int arg0, int arg1, int arg2, int arg3) {
        field1421++;
        if (arg3 < 128 || arg2 < 128 || arg3 > 13056 || arg2 > 13056) {
            class47.field1133 = -1;
            class40.field910 = -1;
            return;
        }
        int var4 = class47.method340(arg3, -6, class121.field2807, arg2) - arg0;
        if (arg1 < 79) {
            field1426 = null;
        }
        int var5 = arg2 - class37.field860;
        int var6 = arg3 - class15.field304;
        int var7 = class102.field2321[class91.field2066];
        int var8 = var4 - class116.field2645;
        int var9 = class102.field2323[class91.field2066];
        int var10 = class102.field2321[class48.field1152];
        int var11 = class102.field2323[class48.field1152];
        int var12 = var5 * var10 + var6 * var11 >> 16;
        int var13 = var5 * var11 - var6 * var10 >> 16;
        int var15 = var8 * var9 - var7 * var13 >> 16;
        int var16 = var7 * var8 + var9 * var13 >> 16;
        if (var16 >= 50) {
            class40.field910 = (var15 << 9) / var16 + 167;
            class47.field1133 = (var12 << 9) / var16 + 256;
        } else {
            class47.field1133 = -1;
            class40.field910 = -1;
        }
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(IIIIIIZ)V", line = 236)
    public class60(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field1431 = arg1;
        this.field1430 = arg0;
        this.field1418 = arg4;
        this.field1433 = arg6;
        this.field1423 = arg3;
        this.field1422 = arg2;
        this.field1432 = arg5;
    }
}
