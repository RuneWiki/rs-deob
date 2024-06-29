import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class413 {

    @OriginalMember(owner = "client!ht", name = "k", descriptor = "[I")
    public int[] field5477 = new int[3];

    @OriginalMember(owner = "client!ht", name = "i", descriptor = "[I")
    public int[] field5475 = new int[2];

    @OriginalMember(owner = "client!ht", name = "h", descriptor = "[I")
    public int[] field5474 = new int[2];

    @OriginalMember(owner = "client!ht", name = "g", descriptor = "[I")
    public int[] field5473 = new int[3];

    @OriginalMember(owner = "client!ht", name = "e", descriptor = "[S")
    public short[] field5471;

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "[S")
    public short[] field5469;

    @OriginalMember(owner = "client!ht", name = "j", descriptor = "Lrn;")
    public static class633 field5476 = new class633(57, -1);

    @OriginalMember(owner = "client!ht", name = "l", descriptor = "Lrn;")
    public static class633 field5478 = new class633(46, 15);

    @OriginalMember(owner = "client!ht", name = "m", descriptor = "[I")
    public static int[] field5479 = new int[8];

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "I")
    public static int field5467;

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "I")
    public static int field5468;

    @OriginalMember(owner = "client!ht", name = "d", descriptor = "I")
    public static int field5470;

    @OriginalMember(owner = "client!ht", name = "f", descriptor = "I")
    public static int field5472;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(B)J")
    public static final long method2391(byte arg0) {
        field5467++;
        if (arg0 != -74) {
            field5470 = 47;
        }
        return class259.field3487.method839(-25);
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)V")
    public static void method2392(int arg0) {
        if (arg0 != -3160) {
            method2393((byte) 20, -102);
        }
        field5479 = null;
        field5478 = null;
        field5476 = null;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(BI)V")
    public static final void method2393(byte arg0, int arg1) {
        field5468++;
        if (class748.field10207 == arg1) {
            return;
        }
        class240.field3280 = class276.field3602 = class595.field7564[arg1];
        if (arg0 < 56) {
            method2391((byte) 38);
        }
        class259.method1653((byte) -102);
        class788.field10788 = new int[4][class240.field3280 >> 3][class276.field3602 >> 3];
        class562.field7136 = new int[class240.field3280][class276.field3602];
        class310.field3885 = new int[class240.field3280][class276.field3602];
        for (int var2 = 0; var2 < 4; var2++) {
            class179.field2391[var2] = class266.method1677((byte) -78, class276.field3602, class240.field3280);
        }
        class561.field7133 = new byte[4][class240.field3280][class276.field3602];
        class731.method3903(class240.field3280, -26518, 4, class276.field3602);
        class762.method4155(class576.field7320, class240.field3280 >> 3, (byte) -80, class276.field3602 >> 3);
        class748.field10207 = arg1;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(II)Lgh;")
    public static final class54 method2394(int arg0, int arg1) {
        field5472++;
        class54[] var2 = class186.method1312(true);
        for (int var3 = 0; var3 < var2.length; var3++) {
            if (var2[var3].field701 == arg1) {
                return var2[var3];
            }
        }
        if (arg0 != 14506) {
            method2393((byte) -18, 100);
        }
        return null;
    }

    @OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(Lmv;)V")
    public class413(class48 arg0) {
        this.field5473[0] = arg0.field566;
        this.field5473[1] = arg0.field609;
        this.field5473[2] = arg0.field594;
        this.field5477[1] = arg0.field593;
        this.field5477[2] = arg0.field631;
        this.field5477[0] = arg0.field604;
        this.field5474[1] = arg0.field556;
        this.field5474[0] = arg0.field569;
        this.field5475[1] = arg0.field639;
        this.field5475[0] = arg0.field597;
        if (arg0.field612 != null) {
            this.field5471 = new short[arg0.field612.length];
            class642.method3473(arg0.field612, 0, this.field5471, 0, this.field5471.length);
        }
        if (arg0.field557 != null) {
            this.field5469 = new short[arg0.field557.length];
            class642.method3473(arg0.field557, 0, this.field5469, 0, this.field5469.length);
        }
    }
}
