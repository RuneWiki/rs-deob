import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public abstract class class146 {

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "Lqf;")
    private static class117 field3563 = class72.method514(107, "Unexpected server response");

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "Lqf;")
    public static class117 field3564 = class72.method514(114, "Null");

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "Lqf;")
    public static class117 field3565 = class72.method514(103, "Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <lt>AUS<gt>");

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "[I")
    public static int[] field3567 = new int[5];

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    public static int field3568 = 0;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "Lqf;")
    public static class117 field3570 = field3563;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "Z")
    public static boolean field3569 = false;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "[Lqf;")
    public static class117[] field3573 = new class117[1000];

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "Lqf;")
    public static class117 field3571 = null;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
    public static int field3574 = 0;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "Lqf;")
    private static class117 field3576 = class72.method514(109, "Username: ");

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "Lqf;")
    public static class117 field3566 = field3576;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "Lla;")
    public static class77 field3575;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
    public abstract void method536(int arg0);

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V")
    public static void method1171(byte arg0) {
        field3570 = null;
        field3573 = null;
        field3567 = null;
        if (arg0 < 81) {
            return;
        }
        field3565 = null;
        field3575 = null;
        field3576 = null;
        field3563 = null;
        field3566 = null;
        field3571 = null;
        field3564 = null;
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(B)V")
    public abstract void method537(byte arg0);

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)V")
    public static final void method1172(int arg0) {
        for (int var1 = -1; var1 < class66.field1387; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class20.field326[var1];
            }
            class21 var3 = class149.field3709[var2];
            if (var3 != null) {
                class124.method988(1, (byte) -90, var3);
            }
        }
        if (arg0 != 2047) {
            field3569 = true;
        }
        field3577++;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(III)I")
    public abstract int method535(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lnf;ZIII)V")
    public static final void method1173(class96 arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field3572++;
        if (class71.field1515 >= 50 || class27.field527 == 0 || (arg0.field2324 == null || arg0.field2324.length <= arg2)) {
            return;
        }
        int var5 = arg0.field2324[arg2];
        if (var5 == 0) {
            return;
        }
        int var6 = var5 >> 8;
        class41.field814[class71.field1515] = var6;
        int var7 = var5 & 0xF;
        int var8 = var5 >> 4 & 0x7;
        class150.field3719[class71.field1515] = var8;
        int var9 = (arg4 - 64) / 128;
        if (arg1) {
            field3567 = null;
        }
        class95.field2289[class71.field1515] = 0;
        int var10 = (arg3 - 64) / 128;
        class115.field2720[class71.field1515] = null;
        class124.field2923[class71.field1515] = (var9 << 8) + (var10 << 16) + var7;
        class71.field1515++;
    }
}
