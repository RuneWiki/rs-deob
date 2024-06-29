import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class279 {

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "Lbd;")
    private static class162 field4691 = class17.method142(0, "Checking for updates )2 ");

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
    public static int field4693 = -1;

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "[I")
    public static int[] field4697 = new int[5];

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "[I")
    public static int[] field4698 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "Lbd;")
    public static class162 field4696 = field4691;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "[I")
    public static int[] field4694 = new int[99];

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "Lbd;")
    public static class162 field4700;

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "Lbd;")
    public static class162 field4699;

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "I")
    public static int field4702;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
    public static int field4692;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "I")
    public static int field4703;

    @OriginalMember(owner = "client!fk", name = "p", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "Lob;")
    public static class78 field4704;

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "Ljava/awt/Font;")
    public static Font field4701;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)I", line = 4)
    public static final int method1915(int arg0) {
        if (arg0 != 2) {
            field4702 = -21;
        }
        field4692++;
        return 2;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(BIII)V", line = 19)
    public static final void method1916(byte arg0, int arg1, int arg2, int arg3) {
        class63 var4 = class46.method332(9, arg3, -12770);
        field4690++;
        var4.method430(false);
        var4.field971 = arg1;
        if (arg0 <= 16) {
            field4701 = (Font) null;
        }
        var4.field980 = arg2;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field4694[var1] = var0 / 4;
        }
        field4700 = class17.method142(0, "welle2:");
        field4699 = class17.method142(0, "Spielwelt erstellt)3");
        field4702 = 0;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(BS)Z", line = 51)
    public static final boolean method1917(byte arg0, short arg1) {
        field4695++;
        if (arg1 == 19 || arg1 == 57 || arg1 == 59 || arg1 == 51 || arg1 == 47 || arg1 == 15 || arg1 == 9 || arg1 == 24) {
            return true;
        }
        if (arg0 >= -11) {
            field4694 = (int[]) null;
        }
        if (arg1 == 29 || arg1 == 8 || arg1 == 1004 || arg1 == 1003) {
            return true;
        } else if (arg1 == 6 || arg1 == 7 || arg1 == 28 || arg1 == 37 || arg1 == 25) {
            return true;
        } else {
            return arg1 == 23 || arg1 == 10 || arg1 == 5 || arg1 == 32 || arg1 == 36 || arg1 == 41;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V", line = 78)
    public static void method1918(byte arg0) {
        field4699 = null;
        field4694 = null;
        if (arg0 != -82) {
            return;
        }
        field4701 = null;
        field4691 = null;
        field4700 = null;
        field4696 = null;
        field4704 = null;
        field4698 = null;
        field4697 = null;
    }
}
