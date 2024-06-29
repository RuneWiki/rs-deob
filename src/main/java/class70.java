import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class70 {

    @OriginalMember(owner = "client!hb", name = "z", descriptor = "Z")
    public boolean field1356 = true;

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "I")
    public int field1340;

    @OriginalMember(owner = "client!hb", name = "A", descriptor = "I")
    public int field1357;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
    public int field1337;

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
    public int field1343;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
    public int field1335;

    @OriginalMember(owner = "client!hb", name = "F", descriptor = "I")
    public int field1362;

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "Lij;")
    public static class50 field1341 = class78.method578(127, "Angreifen");

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "Lij;")
    public static class50 field1332 = class78.method578(122, ":");

    @OriginalMember(owner = "client!hb", name = "B", descriptor = "Lij;")
    private static class50 field1358 = class78.method578(121, "green:");

    @OriginalMember(owner = "client!hb", name = "r", descriptor = "Lij;")
    public static class50 field1348 = field1358;

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "Z")
    public static boolean field1344 = true;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "S")
    public static short field1331 = 1;

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "Lij;")
    public static class50 field1350 = field1358;

    @OriginalMember(owner = "client!hb", name = "D", descriptor = "[I")
    public static int[] field1360 = new int[2000];

    @OriginalMember(owner = "client!hb", name = "x", descriptor = "I")
    public static int field1354 = 0;

    @OriginalMember(owner = "client!hb", name = "E", descriptor = "I")
    public static int field1361 = 50;

    @OriginalMember(owner = "client!hb", name = "w", descriptor = "[Lij;")
    public static class50[] field1353 = new class50[field1361];

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "[I")
    public static int[] field1345 = new int[field1361];

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "[I")
    public static int[] field1336 = new int[field1361];

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "[I")
    public static int[] field1338 = new int[field1361];

    @OriginalMember(owner = "client!hb", name = "y", descriptor = "[I")
    public static int[] field1355 = new int[field1361];

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "[I")
    public static int[] field1347 = new int[field1361];

    @OriginalMember(owner = "client!hb", name = "v", descriptor = "[I")
    public static int[] field1352 = new int[field1361];

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "[I")
    public static int[] field1346 = new int[field1361];

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!hb", name = "s", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!hb", name = "u", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!hb", name = "C", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V")
    public static void method530(byte arg0) {
        field1336 = null;
        field1347 = null;
        field1360 = null;
        field1348 = null;
        field1352 = null;
        if (arg0 != -57) {
            return;
        }
        field1341 = null;
        field1358 = null;
        field1355 = null;
        field1338 = null;
        field1332 = null;
        field1346 = null;
        field1350 = null;
        field1353 = null;
        field1345 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lij;II)V")
    public static final void method531(class50 arg0, int arg1, int arg2) {
        field1342++;
        class57.field1023++;
        class190.field3141.method1598((byte) -108, arg2);
        class190.field3141.method1485(124, arg1);
        class190.field3141.method1464(arg0.method368((byte) -103), 867341416);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)V")
    public static final void method532(int arg0, int arg1) {
        field1359++;
        class99 var2 = (class99) class90.field1716.method443((long) arg1, (byte) -97);
        if (var2 != null && arg0 == 50) {
            for (int var3 = 0; var3 < var2.field1829.length; var3++) {
                var2.field1829[var3] = -1;
                var2.field1822[var3] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IBI)I")
    public static final int method533(int arg0, byte arg1, int arg2) {
        field1333++;
        class99 var3 = (class99) class90.field1716.method443((long) arg2, (byte) 115);
        if (var3 == null) {
            return 0;
        } else if (arg0 >= 0 && var3.field1822.length > arg0) {
            int var4 = -49 / (-arg1 / 51);
            return var3.field1822[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(II)V")
    public static final void method534(int arg0, int arg1) {
        class155.field2697.method770(true, arg1);
        if (arg0 < 87) {
            method532(28, 46);
        }
        field1351++;
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class70(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field1340 = arg1;
        this.field1357 = arg4;
        this.field1337 = arg0;
        this.field1343 = arg3;
        this.field1356 = arg6;
        this.field1335 = arg5;
        this.field1362 = arg2;
    }
}
