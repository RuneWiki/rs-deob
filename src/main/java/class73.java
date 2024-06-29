import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class73 {

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "Lod;")
    public static class101 field1576 = class46.method335(120, "mapscene");

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    public static int field1579 = 0;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "[I")
    public static int[] field1580 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "Lod;")
    public static class101 field1581 = class46.method335(68, " Sekunde(Xn(Y -Ubertragen)3");

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "Lod;")
    public static class101 field1584 = class46.method335(-52, "Bitte benutzen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "Lod;")
    public static class101 field1587 = class46.method335(-78, "sl_button");

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "Lod;")
    public static class101 field1583 = class46.method335(117, "Zu viele Anmelde)2Versuche von Ihrer Adresse");

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "I")
    public static int field1588 = 0;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "Lod;")
    private static class101 field1578 = class46.method335(119, "Loaded fonts");

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "Lod;")
    public static class101 field1577 = field1578;

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "[I")
    public static int[] field1586 = new int[32768];

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)I")
    public static final int method510(int arg0, int arg1) {
        class158 var2 = class15.method111((byte) -41, arg1);
        int var3 = -70 % ((80 - arg0) / 46);
        int var4 = var2.field3641;
        int var5 = var2.field3642;
        int var6 = var2.field3634;
        int var7 = class82.field1800[var5 - var6];
        field1582++;
        return var7 & class63.field1388[var4] >> var6;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
    public static final void method511(int arg0) {
        class153.field3488.method135(0);
        field1585++;
        if (arg0 < 59) {
            method510(-5, -66);
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V")
    public static void method512(int arg0) {
        field1586 = null;
        field1577 = null;
        field1580 = null;
        field1581 = null;
        if (arg0 != 22107) {
            method513(-40, -46, -114);
        }
        field1587 = null;
        field1584 = null;
        field1576 = null;
        field1578 = null;
        field1583 = null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)I")
    public static final int method513(int arg0, int arg1, int arg2) {
        field1589++;
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg1 & 0x7F) * arg0 / 128;
            if (arg2 <= 77) {
                field1583 = null;
            }
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg1 & 0xFF80) + var3;
        }
    }
}
