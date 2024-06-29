import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class68 extends class2 {

    @OriginalMember(owner = "client!gh", name = "cb", descriptor = "Z")
    public boolean field1334 = false;

    @OriginalMember(owner = "client!gh", name = "jb", descriptor = "I")
    private int field1341 = 0;

    @OriginalMember(owner = "client!gh", name = "eb", descriptor = "I")
    private int field1336 = -32768;

    @OriginalMember(owner = "client!gh", name = "ub", descriptor = "I")
    private int field1352 = 0;

    @OriginalMember(owner = "client!gh", name = "nb", descriptor = "I")
    public int field1345;

    @OriginalMember(owner = "client!gh", name = "Y", descriptor = "I")
    public int field1330;

    @OriginalMember(owner = "client!gh", name = "P", descriptor = "I")
    public int field1321;

    @OriginalMember(owner = "client!gh", name = "ob", descriptor = "I")
    private int field1346;

    @OriginalMember(owner = "client!gh", name = "bb", descriptor = "I")
    public int field1333;

    @OriginalMember(owner = "client!gh", name = "db", descriptor = "I")
    public int field1335;

    @OriginalMember(owner = "client!gh", name = "Z", descriptor = "Lce;")
    private class26 field1331;

    @OriginalMember(owner = "client!gh", name = "R", descriptor = "I")
    public static int field1323 = 0;

    @OriginalMember(owner = "client!gh", name = "X", descriptor = "Lob;")
    public static class141 field1329 = class175.method1195(40, "cross");

    @OriginalMember(owner = "client!gh", name = "Q", descriptor = "Lob;")
    public static class141 field1322 = class175.method1195(40, "Untersuchen");

    @OriginalMember(owner = "client!gh", name = "hb", descriptor = "I")
    public static int field1339 = 0;

    @OriginalMember(owner = "client!gh", name = "lb", descriptor = "Lob;")
    public static class141 field1343 = class175.method1195(40, "cookieprefix");

    @OriginalMember(owner = "client!gh", name = "ab", descriptor = "[I")
    public static int[] field1332 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!gh", name = "mb", descriptor = "[I")
    public static int[] field1344 = new int[25];

    @OriginalMember(owner = "client!gh", name = "kb", descriptor = "Lob;")
    public static class141 field1342 = class175.method1195(40, "Der Anmelde)2Server ist offline)3");

    @OriginalMember(owner = "client!gh", name = "W", descriptor = "Lob;")
    private static class141 field1328 = class175.method1195(40, "This world is full)3");

    @OriginalMember(owner = "client!gh", name = "U", descriptor = "Lob;")
    public static class141 field1326 = field1328;

    @OriginalMember(owner = "client!gh", name = "T", descriptor = "Lob;")
    private static class141 field1325 = class175.method1195(40, "Invalid username or password)3");

    @OriginalMember(owner = "client!gh", name = "rb", descriptor = "Lob;")
    public static class141 field1349 = class175.method1195(40, "::fps ");

    @OriginalMember(owner = "client!gh", name = "S", descriptor = "Lob;")
    public static class141 field1324 = field1325;

    @OriginalMember(owner = "client!gh", name = "tb", descriptor = "Lob;")
    public static class141 field1351 = class175.method1195(40, "Bitte geben Sie Ihr Passwort ein)3");

    @OriginalMember(owner = "client!gh", name = "gb", descriptor = "Lob;")
    public static class141 field1338 = class175.method1195(40, "hitmarks");

    @OriginalMember(owner = "client!gh", name = "O", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!gh", name = "V", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!gh", name = "fb", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!gh", name = "ib", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!gh", name = "qb", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!gh", name = "sb", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!gh", name = "pb", descriptor = "J")
    public static long field1347;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(B)Lfe;")
    private final class56 method448(byte arg0) {
        field1340++;
        if (arg0 > -52) {
            this.method450(-19, true);
        }
        class107 var2 = class111.method730(this.field1346, -89);
        class56 var3;
        if (this.field1334) {
            var3 = var2.method708(13557, -1);
        } else {
            var3 = var2.method708(13557, this.field1341);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(BI)I")
    public static final int method449(byte arg0, int arg1) {
        if (arg0 != -104) {
            field1324 = null;
        }
        field1327++;
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IZ)V")
    public final void method450(int arg0, boolean arg1) {
        if (arg1) {
            this.method448((byte) 60);
        }
        field1350++;
        if (this.field1334) {
            return;
        }
        this.field1352 += arg0;
        while (this.field1352 > this.field1331.field496[this.field1341]) {
            this.field1352 -= this.field1331.field496[this.field1341];
            this.field1341++;
            if (this.field1341 >= this.field1331.field499.length) {
                this.field1334 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "()I")
    public final int method16() {
        field1348++;
        return this.field1336;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method451(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        class87 var8 = new class87();
        var8.field1727 = arg2 / 128;
        var8.field1723 = arg3 / 128;
        var8.field1732 = arg4 / 128;
        var8.field1733 = arg5 / 128;
        var8.field1734 = arg1;
        var8.field1720 = arg2;
        var8.field1728 = arg3;
        var8.field1719 = arg4;
        var8.field1740 = arg5;
        var8.field1718 = arg6;
        var8.field1749 = arg7;
        class160.field3093[arg0][class160.field3089[arg0]++] = var8;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        class56 var11 = this.method448((byte) -55);
        field1320++;
        if (var11 != null) {
            var11.method10(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field1336 = var11.method16();
        }
    }

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "(I)V")
    public static void method452(int arg0) {
        field1329 = null;
        field1338 = null;
        field1326 = null;
        field1343 = null;
        field1324 = null;
        field1349 = null;
        field1322 = null;
        field1342 = null;
        if (arg0 <= 117) {
            method452(97);
        }
        field1332 = null;
        field1328 = null;
        field1325 = null;
        field1344 = null;
        field1351 = null;
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(IIIIIII)V")
    public class68(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1345 = arg5 + arg6;
        this.field1330 = arg1;
        this.field1321 = arg4;
        this.field1346 = arg0;
        this.field1333 = arg3;
        this.field1335 = arg2;
        int var8 = class111.method730(this.field1346, -49).field2049;
        if (var8 == -1) {
            this.field1334 = true;
        } else {
            this.field1334 = false;
            this.field1331 = class114.method736(15619, var8);
        }
    }
}
