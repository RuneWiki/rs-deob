import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class193 {

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "Lli;")
    public static class185 field3565 = class245.method1649(" (X", 123);

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "[B")
    public static byte[] field3560 = new byte[32896];

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "Lli;")
    public static class185 field3566;

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "Lli;")
    public static class185 field3567;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "Lhi;")
    public static class250 field3563;

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "[Lcg;")
    public static class34[] field3570;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
    public static final void method1390(int arg0) {
        if (arg0 != -7925) {
            field3570 = null;
        }
        field3557++;
        class80.field1402.method86(0);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(III)V")
    public static final void method1391(int arg0, int arg1, int arg2) {
        field3555++;
        class269.field4752[arg2] = arg0;
        class92 var3 = (class92) class155.field2930.method195(60, (long) arg2);
        if (var3 == null) {
            class92 var4 = new class92(4611686018427387905L);
            class155.field2930.method190(var4, (byte) -119, (long) arg2);
        } else if (var3.field1764 != 4611686018427387905L) {
            var3.field1764 = class244.method1644((byte) -72) + 500L | 0x4000000000000000L;
        }
        int var5 = 17 / ((-arg1 - 6) / 61);
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)V")
    public static final void method1392(int arg0) {
        if (arg0 != 16595) {
            method1390(122);
        }
        int var1 = 0;
        field3558++;
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class149.method1056(var1, (byte) 119, true, var3, class153.field2896, var2)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)V")
    public static void method1393(int arg0) {
        field3566 = null;
        field3565 = null;
        field3570 = null;
        field3560 = null;
        if (arg0 < -71) {
            field3567 = null;
            field3563 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILua;Lua;)V")
    public static final void method1394(int arg0, class73 arg1, class73 arg2) {
        if (arg1.field1273 != null) {
            arg1.method476(85);
        }
        field3556++;
        if (arg0 != 2) {
            method1395(-13);
        }
        arg1.field1273 = arg2.field1273;
        arg1.field1269 = arg2;
        arg1.field1273.field1269 = arg1;
        arg1.field1269.field1273 = arg1;
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "(I)V")
    public static final void method1395(int arg0) {
        class99.field1824.method86(0);
        class130.field2338.method86(arg0 ^ arg0);
        field3561++;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IILp;ILdd;II)V")
    public static final void method1396(int arg0, int arg1, class82 arg2, int arg3, class211 arg4, int arg5, int arg6) {
        field3562++;
        if (arg4 == null) {
            return;
        }
        int var7 = class92.field1765 + class191.field3543 & 0x7FF;
        int var8 = Math.max(arg2.field1505 / 2, arg2.field1498 / 2) + 10;
        int var9 = arg1 * arg1 + arg3 * arg3;
        if (var9 > var8 * var8) {
            return;
        }
        int var10 = class167.field3112[var7];
        int var11 = var10 * 256 / (class239.field4270 + 256);
        int var12 = class167.field3110[var7];
        int var13 = var12 * 256 / (class239.field4270 + 256);
        int var14 = arg3 * var11 - (arg1 * var13) >> 16;
        int var15 = arg1 * var11 + arg3 * var13 >> 16;
        ((class101) arg4).method700(arg2.field1505 / 2 + (arg0 - arg4.field3859 / 2) + var15, arg6 - -(arg2.field1498 / 2) + -(arg4.field3852 / arg5) + -var14, arg2.field1621, arg2.field1609);
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field3560[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + (var1 * var1 + 65535)) / 65535.0F))));
            }
        }
        field3566 = class245.method1649("hitbar_default", -111);
        field3568 = 255;
        field3567 = class245.method1649("unzap", -57);
    }
}
