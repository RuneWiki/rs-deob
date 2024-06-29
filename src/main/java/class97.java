import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class97 extends class105 {

    @OriginalMember(owner = "client!eb", name = "T", descriptor = "I")
    private int field1707 = 4096;

    @OriginalMember(owner = "client!eb", name = "R", descriptor = "Lfd;")
    public static class207 field1705 = new class207(16);

    @OriginalMember(owner = "client!eb", name = "U", descriptor = "Lvf;")
    public static class265 field1708 = class87.method582(-46, "_labels");

    @OriginalMember(owner = "client!eb", name = "X", descriptor = "Z")
    public static boolean field1711 = false;

    @OriginalMember(owner = "client!eb", name = "Z", descriptor = "Lvf;")
    public static class265 field1713 = class87.method582(-46, "showingVideoAd");

    @OriginalMember(owner = "client!eb", name = "cb", descriptor = "Lvf;")
    public static class265 field1716 = class87.method582(-46, "Schlie-8en");

    @OriginalMember(owner = "client!eb", name = "db", descriptor = "Lvf;")
    public static class265 field1717 = class87.method582(-46, "Cabbage");

    @OriginalMember(owner = "client!eb", name = "bb", descriptor = "Lvf;")
    public static class265 field1715 = class87.method582(-46, "Vous ne pouvez pas ajouter votre nom -9 votre liste noire)3");

    @OriginalMember(owner = "client!eb", name = "V", descriptor = "Lvf;")
    private static class265 field1709 = class87.method582(-46, "Loaded textures");

    @OriginalMember(owner = "client!eb", name = "Y", descriptor = "Lvf;")
    public static class265 field1712 = field1709;

    @OriginalMember(owner = "client!eb", name = "W", descriptor = "Lwk;")
    public static class148 field1710 = new class148();

    @OriginalMember(owner = "client!eb", name = "fb", descriptor = "I")
    public static int field1719 = 0;

    @OriginalMember(owner = "client!eb", name = "M", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!eb", name = "N", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!eb", name = "O", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!eb", name = "P", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!eb", name = "Q", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!eb", name = "S", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!eb", name = "eb", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!eb", name = "ab", descriptor = "[Lka;")
    public static class160[] field1714;

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V")
    public class97() {
        super(1, true);
    }

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "(I)V")
    public static void method646(int arg0) {
        field1708 = null;
        field1715 = null;
        field1713 = null;
        if (arg0 > 47) {
            field1710 = null;
            field1705 = null;
            field1717 = null;
            field1712 = null;
            field1716 = null;
            field1709 = null;
            field1714 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)[I")
    public final int[] method16(int arg0, int arg1) {
        ++field1706;
        if (arg0 != 8055) {
            return null;
        } else {
            int[] var3 = super.field1862.method458(arg1, false);
            if (super.field1862.field1236) {
                int[] var4 = this.method705(arg1 + -1 & class11.field377, (byte) -115, 0);
                int[] var5 = this.method705(arg1, (byte) -105, 0);
                int[] var6 = this.method705(class11.field377 & arg1 + 1, (byte) -117, 0);
                for (int var7 = 0; ~var7 > ~class94.field1668; ++var7) {
                    int var8 = (var5[class1.field20 & var7 + 1] + -var5[class1.field20 & var7 + -1]) * this.field1707;
                    int var9 = (var6[var7] + -var4[var7]) * this.field1707;
                    int var10 = var8 >> 12;
                    int var11 = var10 * var10 >> 12;
                    int var12 = var9 >> 12;
                    int var13 = var12 * var12 >> 12;
                    int var14 = (int) (Math.sqrt((double) ((float) (var13 + 4096 + var11) / 4096.0F)) * 4096.0D);
                    int var15 = ~var14 != -1 ? 16777216 / var14 : 0;
                    var3[var7] = -var15 + 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(IZ)Z")
    public static final boolean method647(int arg0, boolean arg1) {
        if (arg1) {
            field1719 = 42;
        }
        ++field1700;
        return ~(arg0 & 1) != -1;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(B)V")
    public static final void method648(byte arg0) {
        ++field1701;
        if (arg0 == -26) {
            while (~class207.field3730.method1858(class221.field3966, 107) <= -28) {
                int var1 = class207.field3730.method1867(15, 8);
                if (~var1 == -32768) {
                    break;
                }
                boolean var2 = false;
                if (class4.field67[var1] == null) {
                    var2 = true;
                    class4.field67[var1] = new class23();
                }
                class23 var3 = class4.field67[var1];
                class93.field1646[class48.field1027++] = var1;
                var3.field2542 = class93.field1655;
                if (var3.field681 != null && var3.field681.method1827(arg0 ^ -105)) {
                    class72.method511((byte) -77, var3);
                }
                int var4 = class207.field3730.method1867(5, 8);
                int var5 = class207.field3730.method1867(1, 8);
                if (~var5 == -2) {
                    class279.field4928[class131.field2376++] = var1;
                }
                int var6 = class207.field3730.method1867(1, 8);
                if (~var4 < -16) {
                    var4 -= 32;
                }
                int var7 = class154.field2854[class207.field3730.method1867(3, 8)];
                if (var2) {
                    var3.field2580 = var3.field2563 = var7;
                }
                var3.method223((byte) -101, class98.method654(class207.field3730.method1867(14, 8), -1));
                int var8 = class207.field3730.method1867(5, 8);
                if (~var8 < -16) {
                    var8 -= 32;
                }
                var3.method965((byte) -116, var3.field681.field4713);
                var3.field2558 = var3.field681.field4768;
                var3.field2562 = var3.field681.field4751;
                var3.field2576 = var3.field681.field4777;
                var3.field2553 = var3.field681.field4736;
                var3.field2606 = var3.field681.field4727;
                var3.field2577 = var3.field681.field4771;
                var3.field2601 = var3.field681.field4765;
                var3.field2588 = var3.field681.field4742;
                if (~var3.field2553 == -1) {
                    var3.field2563 = 0;
                }
                var3.method968(var6 == 1, 52, var3.method822(2), class214.field3827.field2536[0] + var8, class214.field3827.field2575[0] + var4);
                if (var3.field681.method1827(-119)) {
                    class10.method75(0, var3.field2536[0], var3.field2575[0], false, class216.field3902, var3, (class130) null, (class122) null);
                }
            }
            class207.field3730.method1862((byte) 124);
        }
    }

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "(I)V")
    public static final void method649(int arg0) {
        ++field1702;
        class270.field4818.method193(arg0 ^ arg0);
        class216.field3899 = 1;
        class125.field2245 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IILng;)V")
    public final void method12(int arg0, int arg1, class135 arg2) {
        if (~arg0 == -1) {
            this.field1707 = arg2.method927(126);
        }
        ++field1703;
        if (arg1 != 255) {
            field1715 = null;
        }
    }
}
