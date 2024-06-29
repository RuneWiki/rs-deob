import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class120 extends class228 {

    @OriginalMember(owner = "client!dh", name = "V", descriptor = "I")
    private int field2116 = 4;

    @OriginalMember(owner = "client!dh", name = "bb", descriptor = "I")
    private int field2122 = 4;

    @OriginalMember(owner = "client!dh", name = "X", descriptor = "Lwk;")
    public static class273 field2118 = new class273(20);

    @OriginalMember(owner = "client!dh", name = "Z", descriptor = "Loa;")
    public static class99 field2120 = class221.method1463(2844, "Hidden)2");

    @OriginalMember(owner = "client!dh", name = "cb", descriptor = "Z")
    public static boolean field2123 = true;

    @OriginalMember(owner = "client!dh", name = "eb", descriptor = "Loa;")
    public static class99 field2125 = class221.method1463(2844, "k");

    @OriginalMember(owner = "client!dh", name = "S", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!dh", name = "T", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!dh", name = "U", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!dh", name = "W", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!dh", name = "Y", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!dh", name = "ab", descriptor = "Lvb;")
    public static class60 field2121;

    @OriginalMember(owner = "client!dh", name = "db", descriptor = "[Lvd;")
    public static class4[] field2124;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Led;IIB)V")
    public static final void method801(class183 arg0, int arg1, int arg2, byte arg3) {
        if (arg3 >= -68) {
            field2118 = null;
        }
        ++field2114;
        if (~arg0.field1284 == ~arg2 && ~arg2 != 0) {
            class270 var4 = class38.method297(132, arg2);
            int var5 = var4.field4746;
            if (var5 == 1) {
                arg0.field1321 = 0;
                arg0.field1297 = arg1;
                arg0.field1303 = 0;
                arg0.field1266 = 0;
                class250.method1621(arg0.field1325, arg0.field1321, arg0.field1301, 60, class168.field3006 == arg0, var4);
            }
            if (var5 == 2) {
                arg0.field1266 = 0;
                return;
            }
        } else if (~arg2 == 0 || ~arg0.field1284 == 0 || class38.method297(132, arg2).field4742 >= class38.method297(132, arg0.field1284).field4742) {
            arg0.field1297 = arg1;
            arg0.field1303 = 0;
            arg0.field1326 = arg0.field1323;
            arg0.field1284 = arg2;
            arg0.field1266 = 0;
            arg0.field1321 = 0;
            if (arg0.field1284 == -1) {
                return;
            }
            class250.method1621(arg0.field1325, arg0.field1321, arg0.field1301, 23, class168.field3006 == arg0, class38.method297(132, arg0.field1284));
        }
    }

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "(Z)V")
    public static void method802(boolean arg0) {
        field2121 = null;
        field2125 = null;
        field2120 = null;
        field2124 = null;
        if (arg0) {
            method801((class183) null, 25, 74, (byte) -25);
        }
        field2118 = null;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(BI)[[I")
    public final int[][] method19(byte arg0, int arg1) {
        int[][] var3 = super.field3948.method1797(arg1, (byte) -124);
        if (super.field3948.field4791) {
            int var4 = class179.field3122 / this.field2116;
            int var5 = class234.field4046 / this.field2122;
            int[][] var6;
            if (var4 <= 0) {
                var6 = this.method1502(255, 0, 0);
            } else {
                int var7 = arg1 % var4;
                var6 = this.method1502(255, class179.field3122 * var7 / var4, 0);
            }
            int[] var8 = var6[1];
            int[] var9 = var3[0];
            int[] var10 = var6[2];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            int[] var13 = var6[0];
            for (int var14 = 0; class234.field4046 > var14; ++var14) {
                int var15;
                if (~var5 >= -1) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var5;
                    var15 = class234.field4046 * var16 / var5;
                }
                var9[var14] = var13[var15];
                var11[var14] = var8[var15];
                var12[var14] = var10[var15];
            }
        }
        ++field2115;
        if (arg0 != -27) {
            field2125 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "()V")
    public class120() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILik;I)V")
    public final void method18(int arg0, class261 arg1, int arg2) {
        if (arg2 != -7618) {
            method802(false);
        }
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                this.field2116 = arg1.method1693((byte) 76);
            }
        } else {
            this.field2122 = arg1.method1693((byte) -94);
        }
        ++field2119;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)[I")
    public final int[] method106(int arg0, int arg1) {
        ++field2113;
        if (arg1 != -3) {
            method803(70);
        }
        int[] var3 = super.field3952.method1262(arg0, 7492);
        if (super.field3952.field3276) {
            int var4 = class179.field3122 / this.field2116;
            int var5 = class234.field4046 / this.field2122;
            int[] var6;
            if (var4 <= 0) {
                var6 = this.method1500(0, 0, (byte) 113);
            } else {
                int var7 = arg0 % var4;
                var6 = this.method1500(class179.field3122 * var7 / var4, 0, (byte) 124);
            }
            for (int var8 = 0; ~class234.field4046 < ~var8; ++var8) {
                if (~var5 < -1) {
                    int var9 = var8 % var5;
                    var3[var8] = var6[class234.field4046 * var9 / var5];
                } else {
                    var3[var8] = var6[0];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "(I)V")
    public static final void method803(int arg0) {
        class185.field3280 = new class76();
        if (arg0 != -1) {
            field2118 = null;
        }
        ++field2117;
    }
}
