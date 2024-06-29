import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class85 {

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "Lsg;")
    public static class203 field1496 = new class203();

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "Loa;")
    public static class153 field1499 = new class153(8);

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "Ldc;")
    private static class37 field1502 = class185.method1233((byte) 86, " has logged out)3");

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "Ldc;")
    public static class37 field1500 = field1502;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "[I")
    public static int[] field1501 = new int[99];

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "[Z")
    public static boolean[] field1505;

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "Ldc;")
    private static class37 field1507;

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "Ldc;")
    public static class37 field1504;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "Loa;")
    public static class153 field1506;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Z)V")
    public static final void method577(boolean arg0) {
        int var1 = class32.field633.method606(class135.field2505);
        for (int var2 = 0; var2 < class97.field1701; var2++) {
            int var6 = class32.field633.method606(class194.method1295(var2, arg0));
            if (var1 < var6) {
                var1 = var6;
            }
        }
        class118.field2114 = true;
        field1498++;
        class225.field4164 = class97.field1701 * 15 + 22;
        int var3 = class97.field1701 * 15 + 21;
        int var4 = class200.field3745;
        if (class103.field1770 < var3 + var4) {
            var4 = class103.field1770 - var3;
        }
        var1 += 8;
        int var5 = class205.field3805 - var1 / 2;
        if (arg0) {
            field1506 = null;
        }
        if (var1 + var5 > class115.field2063) {
            var5 = class115.field2063 - var1;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        class10.field141 = var4;
        class246.field4491 = var5;
        class149.field2826 = var1;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IB)Z")
    public static final boolean method578(int arg0, byte arg1) {
        if (arg1 < 121) {
            return true;
        } else {
            field1495++;
            return (arg0 >> 21 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V")
    public static void method579(byte arg0) {
        if (arg0 != 87) {
            return;
        }
        field1496 = null;
        field1507 = null;
        field1502 = null;
        field1504 = null;
        field1506 = null;
        field1501 = null;
        field1500 = null;
        field1499 = null;
        field1505 = null;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIB[B)I")
    public static final int method580(int arg0, int arg1, byte arg2, byte[] arg3) {
        field1494++;
        int var4 = -1;
        int var5 = 75 % ((arg2 + 61) / 35);
        for (int var6 = arg0; var6 < arg1; var6++) {
            var4 = var4 >>> 8 ^ class7.field79[(var4 ^ arg3[var6]) & 0xFF];
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(BII)V")
    public static final void method581(byte arg0, int arg1, int arg2) {
        if (class52.field1050 != 0 && arg2 != -1) {
            class167.method1118(arg2, class18.field298, 1, 0, class52.field1050, false);
            class238.field4376 = true;
        }
        field1497++;
        if (arg0 <= 84) {
            method579((byte) -105);
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field1501[var1] = var0 / 4;
        }
        field1503 = 0;
        field1505 = new boolean[100];
        field1507 = class185.method1233((byte) 86, " seconds)3");
        field1504 = field1507;
    }
}
