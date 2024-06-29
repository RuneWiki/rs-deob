import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class113 extends class128 {

    @OriginalMember(owner = "client!in", name = "w", descriptor = "B")
    public byte field1466 = 5;

    @OriginalMember(owner = "client!in", name = "o", descriptor = "I")
    public static int field1458 = 99;

    @OriginalMember(owner = "client!in", name = "r", descriptor = "[I")
    public static int[] field1461 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

    @OriginalMember(owner = "client!in", name = "q", descriptor = "Ljava/lang/String;")
    public static String field1460 = " has logged in.";

    @OriginalMember(owner = "client!in", name = "u", descriptor = "[I")
    public static int[] field1464 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!in", name = "v", descriptor = "[Ljava/lang/String;")
    public static String[] field1465 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!in", name = "A", descriptor = "Z")
    public static boolean field1470 = true;

    @OriginalMember(owner = "client!in", name = "y", descriptor = "[Lul;")
    public static class255[] field1468 = new class255[14];

    @OriginalMember(owner = "client!in", name = "n", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!in", name = "p", descriptor = "I")
    public int field1459;

    @OriginalMember(owner = "client!in", name = "s", descriptor = "I")
    public int field1462;

    @OriginalMember(owner = "client!in", name = "t", descriptor = "I")
    public int field1463;

    @OriginalMember(owner = "client!in", name = "x", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!in", name = "z", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!in", name = "B", descriptor = "I")
    public int field1471;

    @OriginalMember(owner = "client!in", name = "C", descriptor = "I")
    public int field1472;

    @OriginalMember(owner = "client!in", name = "D", descriptor = "I")
    public int field1473;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Ljava/lang/String;BLir;Z)Lnr;")
    public static final class269 method834(String arg0, byte arg1, class185 arg2, boolean arg3) {
        field1457++;
        int var4 = arg2.method1220(arg0, 0);
        if (var4 == -1) {
            return new class269(0);
        }
        int[] var5 = arg2.method1208(var4, (byte) 110);
        if (arg1 != 66) {
            field1470 = true;
        }
        class269 var6 = new class269(var5.length);
        int var7 = 0;
        int var8 = 0;
        while (true) {
            while (var6.field3983 > var7) {
                class341 var9 = new class341(arg2.method1235(var4, false, var5[var8++]));
                int var10 = var9.method2232(-68);
                int var11 = var9.method2239(arg1 ^ 0xBFDA10CA);
                int var12 = var9.method2233((byte) 104);
                if (!arg3 && var12 == 1) {
                    var6.field3983--;
                } else {
                    var6.field3984[var7] = var10;
                    var6.field3979[var7] = var11;
                    var7++;
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IB)Lrm;")
    public static final class25 method835(int arg0, byte arg1) {
        field1467++;
        class25 var2 = (class25) class90.field1227.method378((byte) 28, (long) arg0);
        if (var2 != null) {
            return var2;
        } else if (arg1 == -60) {
            byte[] var3 = class432.field6276.method1235(31, false, arg0);
            class25 var4 = new class25();
            if (var3 != null) {
                var4.method220(arg0, new class341(var3), arg1 - 271);
            }
            class90.field1227.method367((long) arg0, var4, true);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!in", name = "c", descriptor = "(I)V")
    public static void method836(int arg0) {
        if (arg0 != 64) {
            field1465 = null;
        }
        field1464 = null;
        field1460 = null;
        field1468 = null;
        field1465 = null;
        field1461 = null;
    }
}
