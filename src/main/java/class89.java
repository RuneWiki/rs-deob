import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class89 extends class59 {

    @OriginalMember(owner = "client!rg", name = "H", descriptor = "Ljava/lang/String;")
    private String field1342 = "null";

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "[Ljava/lang/String;")
    public static String[] field1334 = new String[5];

    @OriginalMember(owner = "client!rg", name = "F", descriptor = "[I")
    public static int[] field1340 = new int[32];

    @OriginalMember(owner = "client!rg", name = "y", descriptor = "Z")
    public static boolean field1333 = true;

    @OriginalMember(owner = "client!rg", name = "K", descriptor = "Z")
    public static boolean field1345 = true;

    @OriginalMember(owner = "client!rg", name = "C", descriptor = "B")
    public static byte field1337;

    @OriginalMember(owner = "client!rg", name = "I", descriptor = "C")
    public char field1343;

    @OriginalMember(owner = "client!rg", name = "N", descriptor = "C")
    public char field1348;

    @OriginalMember(owner = "client!rg", name = "x", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!rg", name = "B", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!rg", name = "D", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!rg", name = "E", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!rg", name = "G", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!rg", name = "J", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!rg", name = "L", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!rg", name = "M", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!rg", name = "O", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!rg", name = "P", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!rg", name = "Q", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!rg", name = "R", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!rg", name = "S", descriptor = "I")
    private int field1353;

    @OriginalMember(owner = "client!rg", name = "T", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!rg", name = "A", descriptor = "Lac;")
    public class153 field1335;

    @OriginalMember(owner = "client!rg", name = "U", descriptor = "Lac;")
    private class153 field1355;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ZI)I")
    public final int method595(boolean arg0, int arg1) {
        field1339++;
        if (this.field1335 == null) {
            return this.field1353;
        }
        class178 var3 = (class178) this.field1335.method1064(-1, (long) arg1);
        if (!arg0) {
            method599(30);
        }
        return var3 == null ? this.field1353 : var3.field2789;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)Z")
    public final boolean method596(int arg0, int arg1) {
        field1346++;
        if (this.field1335 == null) {
            return false;
        }
        if (this.field1355 == null) {
            this.method606((byte) -58);
        }
        class178 var3 = (class178) this.field1355.method1064(-1, (long) arg1);
        if (var3 == null) {
            return false;
        } else {
            return arg0 == 4;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILim;)V")
    public final void method597(int arg0, class170 arg1) {
        if (arg0 >= -39) {
            method598(4, -90, 32, 13);
        }
        while (true) {
            int var3 = arg1.method1218(-110);
            if (var3 == 0) {
                field1341++;
                return;
            }
            this.method602(arg1, 0, var3);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIII)V")
    public static final void method598(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 <= 23) {
            method598(-1, -47, -109, -109);
        }
        field1338++;
        class181 var4 = class95.method652(9, (byte) 34, arg1);
        var4.method1285((byte) 64);
        var4.field2845 = arg2;
        var4.field2847 = arg0;
    }

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(I)V")
    public static void method599(int arg0) {
        field1340 = null;
        field1334 = null;
        if (arg0 != 22717) {
            field1350 = -68;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public final boolean method600(byte arg0, String arg1) {
        field1336++;
        if (this.field1335 == null) {
            return false;
        }
        if (this.field1355 == null) {
            this.method603(21324);
        }
        int var3 = 68 % ((arg0 - 33) / 37);
        for (class235 var4 = (class235) this.field1355.method1064(-1, class234.method1650(arg1, 69)); var4 != null; var4 = (class235) this.field1355.method1067(-1)) {
            if (var4.field3791.equals(arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BI)Ljava/lang/String;")
    public final String method601(byte arg0, int arg1) {
        field1352++;
        if (this.field1335 == null) {
            return this.field1342;
        }
        class135 var3 = (class135) this.field1335.method1064(arg0 - 46, (long) arg1);
        if (var3 == null) {
            return this.field1342;
        } else {
            if (arg0 != 45) {
                this.method606((byte) 124);
            }
            return var3.field1950;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lim;II)V")
    private final void method602(class170 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field1343 = class226.method1595((byte) -62, arg0.method1215(128));
        } else if (arg2 == 2) {
            this.field1348 = class226.method1595((byte) 119, arg0.method1215(128));
        } else if (arg2 == 3) {
            this.field1342 = arg0.method1195(-1);
        } else if (arg2 == 4) {
            this.field1353 = arg0.method1190(6345);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg0.method1186((byte) -106);
            this.field1335 = new class153(class297.method1997(67, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method1190(6345);
                class247 var7;
                if (arg2 == 5) {
                    var7 = new class135(arg0.method1195(-1));
                } else {
                    var7 = new class178(arg0.method1190(6345));
                }
                this.field1335.method1054(arg1 - 3510, var7, (long) var6);
            }
        }
        field1344++;
        if (arg1 != 0) {
            this.field1335 = null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "(I)V")
    private final void method603(int arg0) {
        if (arg0 != 21324) {
            field1333 = false;
        }
        field1351++;
        this.field1355 = new class153(this.field1335.method1068(arg0 - 21323));
        for (class135 var2 = (class135) this.field1335.method1065((byte) -59); var2 != null; var2 = (class135) this.field1335.method1066(-127)) {
            class235 var3 = new class235(var2.field1950, (int) var2.field4018);
            this.field1355.method1054(-3510, var3, class234.method1650(var2.field1950, arg0 - 21427));
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B[B)[B")
    public static final byte[] method604(byte arg0, byte[] arg1) {
        field1347++;
        int var2 = arg1.length;
        if (arg0 < 93) {
            field1345 = true;
        }
        byte[] var3 = new byte[var2];
        class103.method689(arg1, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(Z)V")
    public static final void method605(boolean arg0) {
        if (arg0) {
            class184.field2892 = class100.field1496;
            class8.field114 = class79.field1192;
        } else {
            class184.field2892 = class212.field3297;
            class8.field114 = class285.field4613;
        }
        class312.field5002 = class184.field2892.length;
    }

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(B)V")
    private final void method606(byte arg0) {
        field1354++;
        this.field1355 = new class153(this.field1335.method1068(1));
        int var2 = 49 % ((arg0 - 32) / 43);
        for (class178 var3 = (class178) this.field1335.method1065((byte) -59); var3 != null; var3 = (class178) this.field1335.method1066(-128)) {
            class178 var4 = new class178((int) var3.field4018);
            this.field1355.method1054(-3510, var4, (long) var3.field2789);
        }
    }
}
