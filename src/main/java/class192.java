import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class192 {

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public static int field3796 = 1;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "Ld;")
    public static class28 field3794 = new class28(5000);

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "[I")
    public static int[] field3802 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "I")
    public static int field3799 = 0;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "[I")
    public static int[] field3801 = new int[50];

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "B")
    public static byte field3800;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)V")
    public static final void method1279(int arg0, int arg1, int arg2) {
        if (arg1 != 75) {
            return;
        }
        field3795++;
        if (class194.field3827 != 0 && class194.field3827 != 3 || class165.field3424 != 1) {
            return;
        }
        int var3 = class87.field2029 - arg0 - 25;
        int var4 = class105.field2345 - arg2 - 5;
        if (var3 < 0 || var4 < 0 || var3 >= 146 || var4 >= 151) {
            return;
        }
        int var5 = class205.field4028 + class114.field2534 & 0x7FF;
        var3 -= 73;
        int var6 = class93.field2091[var5];
        var4 -= 75;
        int var7 = (class183.field3658 + 256) * var6 >> 8;
        int var8 = class93.field2110[var5];
        int var9 = (class183.field3658 + 256) * var8 >> 8;
        int var10 = var4 * var9 - var3 * var7 >> 11;
        int var11 = var3 * var9 + var4 * var7 >> 11;
        int var12 = class195.field3842.field382 - var10 >> 7;
        int var13 = class195.field3842.field406 + var11 >> 7;
        boolean var14 = class14.method81(class195.field3842.field409[0], 0, var13, class195.field3842.field391[0], true, 1, 0, 0, 0, var12, 0, 0);
        if (!var14) {
            return;
        }
        class111.field2483.method495(110, var3);
        class111.field2483.method495(104, var4);
        class111.field2483.method496(848881960, class114.field2534);
        class111.field2483.method495(arg1 ^ 0x25, 57);
        class111.field2483.method495(113, class205.field4028);
        class111.field2483.method495(123, class183.field3658);
        class111.field2483.method495(arg1 + 31, 89);
        class111.field2483.method496(848881960, class195.field3842.field406);
        class111.field2483.method496(arg1 ^ 0x3298E963, class195.field3842.field382);
        class111.field2483.method495(arg1 ^ 0x37, class56.field1424);
        class111.field2483.method495(121, 63);
        return;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IILob;)V")
    public static final void method1280(int arg0, int arg1, class127 arg2) {
        field3798++;
        if (class163.field3379 != null) {
            class163.field3379.field1620 = arg1 * 8 + 5;
            int var3 = class163.field3379.method464(arg0 ^ 0xFFFFD61B);
            int var4 = class163.field3379.method464(-36);
            arg2.method944((byte) -70, var3, var4);
            return;
        }
        if (arg0 != 10684) {
            method1282((byte) -87, -74);
        }
        class41.method305(true, 255, 0, arg0 ^ 0xAF82390C, null, (byte) 0, 255);
        class23.field491[arg1] = arg2;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
    public static void method1281(int arg0) {
        field3801 = null;
        if (arg0 != 73) {
            field3799 = -68;
        }
        field3802 = null;
        field3794 = null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BI)[B")
    public static final synchronized byte[] method1282(byte arg0, int arg1) {
        field3793++;
        if (arg0 != 17) {
            method1281(18);
        }
        if (arg1 == 100 && class28.field566 > 0) {
            byte[] var2 = class23.field498[--class28.field566];
            class23.field498[class28.field566] = null;
            return var2;
        } else if (arg1 == 5000 && class53.field1349 > 0) {
            byte[] var3 = class63.field1541[--class53.field1349];
            class63.field1541[class53.field1349] = null;
            return var3;
        } else if (arg1 == 30000 && class33.field665 > 0) {
            byte[] var4 = class52.field1327[--class33.field665];
            class52.field1327[class33.field665] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }
}
