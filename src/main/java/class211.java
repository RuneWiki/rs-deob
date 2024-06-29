import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class211 extends class151 {

    @OriginalMember(owner = "client!td", name = "kb", descriptor = "Ldc;")
    public static class37 field3952 = class185.method1233((byte) 86, "runes");

    @OriginalMember(owner = "client!td", name = "mb", descriptor = "Ldc;")
    private static class37 field3954 = class185.method1233((byte) 86, "glow2:");

    @OriginalMember(owner = "client!td", name = "gb", descriptor = "[Z")
    public static boolean[] field3948 = new boolean[100];

    @OriginalMember(owner = "client!td", name = "lb", descriptor = "Ldc;")
    public static class37 field3953 = field3954;

    @OriginalMember(owner = "client!td", name = "ob", descriptor = "Ldc;")
    public static class37 field3956 = field3954;

    @OriginalMember(owner = "client!td", name = "eb", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!td", name = "hb", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!td", name = "ib", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!td", name = "jb", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!td", name = "nb", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!td", name = "fb", descriptor = "Ldj;")
    public static class44 field3947;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "(I)V")
    public static void method1402(int arg0) {
        field3956 = null;
        field3947 = null;
        field3952 = null;
        field3953 = null;
        field3954 = null;
        if (arg0 != -29876505) {
            field3952 = null;
        }
        field3948 = null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BLce;)Lc;")
    public static final class23 method1403(byte arg0, class28 arg1) {
        ++field3946;
        arg1.method215(-1797813752);
        int var2 = arg1.method215(-1797813752);
        class23 var3 = class135.method939((byte) 93, var2);
        var3.field408 = arg1.method215(-1797813752);
        int var4 = arg1.method215(-1797813752);
        int var5 = 87 % ((arg0 - 20) / 36);
        for (int var6 = 0; var4 > var6; ++var6) {
            int var7 = arg1.method215(-1797813752);
            var3.method40(arg1, var7, 1000);
        }
        var3.method53(-21746);
        return var3;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IB)[[I")
    public final int[][] method36(int arg0, byte arg1) {
        ++field3950;
        if (arg1 != 9) {
            return null;
        } else {
            int[][] var3 = super.field398.method1522(-29659, arg0);
            if (super.field398.field4303 && this.method1035(118)) {
                int[] var4 = var3[1];
                int[] var5 = var3[0];
                int[] var6 = var3[2];
                int var7 = arg0 % super.field2852 * super.field2852;
                for (int var8 = 0; ~var8 > ~class199.field3705; ++var8) {
                    int var9 = super.field2857[var8 % super.field2864 + var7];
                    var6[var8] = class58.method449(var9 << 4, 4080);
                    var4[var8] = class58.method449(65280, var9) >> 4;
                    var5[var8] = class58.method449(var9 >> 12, 4080);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(B)V")
    public static final void method1404(byte arg0) {
        ++field3955;
        class96.field1682.method93(0);
        if (arg0 > -23) {
            field3948 = null;
        }
    }

    @OriginalMember(owner = "client!td", name = "j", descriptor = "(I)V")
    public static final void method1405(int arg0) {
        class41.field831 = new class153(arg0);
        ++field3951;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIILmf;)V")
    public static final void method1406(int arg0, int arg1, int arg2, class136 arg3) {
        ++field3949;
        if (class239.field4389 == 0 || ~class239.field4389 == -4) {
            int var4 = arg0 - arg3.field2509 / 2;
            int var5 = arg1 - arg3.field2638 / 2;
            int var6 = class82.field1454 - -class91.field1571 & 2047;
            int var7 = class169.field3220[var6];
            int var8 = (class123.field2208 + 256) * var7 >> 8;
            int var9 = class169.field3211[var6];
            int var10 = -36 / ((31 - arg2) / 40);
            int var11 = (class123.field2208 - -256) * var9 >> 8;
            int var12 = var4 * var8 + -(var5 * var11) >> 11;
            int var13 = var4 * var11 - -(var5 * var8) >> 11;
            int var14 = class238.field4382.field3505 - -var13 >> 7;
            int var15 = -var12 + class238.field4382.field3490 >> 7;
            boolean var16 = class14.method91(0, var15, 1, var14, true, false, 0, 0, class238.field4382.field3494[0], 0, class238.field4382.field3525[0], 0);
            if (var16) {
                class49.field970.method214((byte) 125, var5);
                class49.field970.method214((byte) 125, var4);
                class49.field970.method197(class82.field1454, (byte) 51);
                class49.field970.method214((byte) 107, 57);
                class49.field970.method214((byte) 127, class91.field1571);
                class49.field970.method214((byte) 103, class123.field2208);
                class49.field970.method214((byte) 112, 89);
                class49.field970.method197(class238.field4382.field3505, (byte) 51);
                class49.field970.method197(class238.field4382.field3490, (byte) 51);
                class49.field970.method214((byte) 117, class173.field3301);
                class49.field970.method214((byte) 120, 63);
            }
        }
    }
}
