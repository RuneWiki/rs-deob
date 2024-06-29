import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class62 extends class22 {

    @OriginalMember(owner = "client!kb", name = "x", descriptor = "[Lkd;")
    public class64[] field1487 = new class64[5];

    @OriginalMember(owner = "client!kb", name = "cb", descriptor = "I")
    public int field1518 = 0;

    @OriginalMember(owner = "client!kb", name = "P", descriptor = "[I")
    public int[] field1505 = new int[5];

    @OriginalMember(owner = "client!kb", name = "Y", descriptor = "I")
    public int field1514;

    @OriginalMember(owner = "client!kb", name = "N", descriptor = "I")
    public int field1503;

    @OriginalMember(owner = "client!kb", name = "y", descriptor = "I")
    public int field1488;

    @OriginalMember(owner = "client!kb", name = "J", descriptor = "I")
    public int field1499;

    @OriginalMember(owner = "client!kb", name = "w", descriptor = "Ltc;")
    public static class113 field1486 = new class113(new byte[5000]);

    @OriginalMember(owner = "client!kb", name = "R", descriptor = "[I")
    public static int[] field1507 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!kb", name = "W", descriptor = "Lva;")
    public static class121 field1512 = class107.method797(" @gre@", -10983);

    @OriginalMember(owner = "client!kb", name = "U", descriptor = "Lva;")
    private static class121 field1510 = class107.method797("K", -10983);

    @OriginalMember(owner = "client!kb", name = "Q", descriptor = "Lva;")
    public static class121 field1506 = field1510;

    @OriginalMember(owner = "client!kb", name = "ab", descriptor = "Lva;")
    public static class121 field1516 = field1510;

    @OriginalMember(owner = "client!kb", name = "db", descriptor = "Lva;")
    private static class121 field1519 = class107.method797("Loaded input handler", -10983);

    @OriginalMember(owner = "client!kb", name = "Z", descriptor = "Lva;")
    public static class121 field1515 = field1519;

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!kb", name = "C", descriptor = "I")
    public int field1492;

    @OriginalMember(owner = "client!kb", name = "D", descriptor = "I")
    public int field1493;

    @OriginalMember(owner = "client!kb", name = "H", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!kb", name = "I", descriptor = "I")
    public int field1498;

    @OriginalMember(owner = "client!kb", name = "M", descriptor = "I")
    public int field1502;

    @OriginalMember(owner = "client!kb", name = "O", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!kb", name = "V", descriptor = "I")
    public int field1511;

    @OriginalMember(owner = "client!kb", name = "bb", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!kb", name = "eb", descriptor = "I")
    public int field1520;

    @OriginalMember(owner = "client!kb", name = "B", descriptor = "Lsb;")
    public class107 field1491;

    @OriginalMember(owner = "client!kb", name = "S", descriptor = "Lga;")
    public class38 field1508;

    @OriginalMember(owner = "client!kb", name = "T", descriptor = "Lac;")
    public class4 field1509;

    @OriginalMember(owner = "client!kb", name = "G", descriptor = "Lk;")
    public class60 field1496;

    @OriginalMember(owner = "client!kb", name = "X", descriptor = "Lkb;")
    public class62 field1513;

    @OriginalMember(owner = "client!kb", name = "E", descriptor = "Lme;")
    public static class77 field1494;

    @OriginalMember(owner = "client!kb", name = "L", descriptor = "Lob;")
    public class86 field1501;

    @OriginalMember(owner = "client!kb", name = "K", descriptor = "Loe;")
    public class89 field1500;

    @OriginalMember(owner = "client!kb", name = "z", descriptor = "Z")
    public boolean field1489;

    @OriginalMember(owner = "client!kb", name = "A", descriptor = "Z")
    public boolean field1490;

    @OriginalMember(owner = "client!kb", name = "F", descriptor = "Z")
    public boolean field1495;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lva;Lva;IZ)V", line = 13)
    public static final void method448(class121 arg0, class121 arg1, int arg2, boolean arg3) {
        field1517++;
        if (class90.field2038 == -1) {
            class9.field140 = true;
        }
        if (arg2 == 0 && class118.field2676 != -1) {
            class21.field568 = 0;
            class64.field1544 = arg1;
        }
        for (int var4 = 99; var4 > 0; var4--) {
            class61.field1479[var4] = class61.field1479[var4 - 1];
            class58.field1354[var4] = class58.field1354[var4 - 1];
            class47.field1098[var4] = class47.field1098[var4 - 1];
        }
        class61.field1479[0] = arg2;
        class58.field1354[0] = arg0;
        if (arg3) {
            method449(15L, 71);
        }
        class47.field1098[0] = arg1;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(JI)V", line = 47)
    public static final void method449(long arg0, int arg1) {
        field1497++;
        if (arg0 == 0L) {
            return;
        }
        if (class97.field2169 >= 100) {
            method448(class18.field415, class86.field1989, 0, false);
            return;
        }
        if (arg1 != 7159) {
            method451(true);
        }
        class121 var3 = class95.method636(-3, arg0).method963(arg1 ^ 0xFFFFDDA6);
        for (int var4 = 0; var4 < class97.field2169; var4++) {
            if (class69.field1650[var4] == arg0) {
                method448(class18.field415, class113.method866((byte) -82, new class121[] { var3, class120.field2771 }), 0, false);
                return;
            }
        }
        for (int var5 = 0; var5 < class8.field119; var5++) {
            if (class92.field2092[var5] == arg0) {
                method448(class18.field415, class113.method866((byte) -126, new class121[] { class19.field511, var3, class21.field554 }), 0, false);
                return;
            }
        }
        if (var3.method954(field1494.field1766, 17706)) {
            return;
        }
        class69.field1650[class97.field2169++] = arg0;
        class97.field2168 = true;
        class60.field1437.method622(117, true);
        class48.field1138++;
        class60.field1437.method835(false, arg0);
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(III)V", line = 108)
    public class62(int arg0, int arg1, int arg2) {
        this.field1514 = arg1;
        this.field1503 = arg2;
        this.field1499 = this.field1488 = arg0;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILed;)V", line = 141)
    public static final void method450(int arg0, class29 arg1) {
        int var2 = arg1.field726 - class115.field2614;
        if (arg1.field748 == 0) {
            arg1.field725 = 1024;
        }
        if (arg1.field748 == 1) {
            arg1.field725 = 1536;
        }
        field1485++;
        arg1.field729 = 0;
        if (arg1.field748 == 2) {
            arg1.field725 = 0;
        }
        if (arg1.field748 == 3) {
            arg1.field725 = 512;
        }
        int var3 = arg1.field786 * arg0 + arg1.field764 * 128;
        arg1.field750 += (var3 - arg1.field750) / var2;
        int var4 = arg1.field786 * 64 + arg1.field745 * 128;
        arg1.field742 += (var4 - arg1.field742) / var2;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)V", line = 207)
    public static void method451(boolean arg0) {
        field1516 = null;
        field1494 = null;
        field1519 = null;
        field1510 = null;
        field1515 = null;
        field1486 = null;
        field1506 = null;
        field1507 = null;
        field1512 = null;
        if (!arg0) {
            method448(null, null, -127, false);
        }
    }
}
