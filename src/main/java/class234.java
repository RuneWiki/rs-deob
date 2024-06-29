import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class234 extends class276 {

    @OriginalMember(owner = "client!bh", name = "N", descriptor = "I")
    private int field3881;

    @OriginalMember(owner = "client!bh", name = "O", descriptor = "I")
    public static int field3882 = 0;

    @OriginalMember(owner = "client!bh", name = "U", descriptor = "Z")
    public static boolean field3888 = false;

    @OriginalMember(owner = "client!bh", name = "M", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!bh", name = "P", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!bh", name = "Q", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!bh", name = "S", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!bh", name = "T", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!bh", name = "R", descriptor = "[Ljava/lang/String;")
    public static String[] field3885;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(B)V")
    public static final void method1549(byte arg0) {
        ++field3887;
        int var1 = class144.field2469;
        int var2 = class22.field340;
        int var3 = class127.field2244 + -3;
        int var4 = class95.field1641;
        byte var5 = 20;
        if (class35.field502 == null || class136.field2387 == null) {
            if (class33.field471.method727(class78.field1301, (byte) -95) && class33.field471.method727(class227.field3833, (byte) -120)) {
                class35.field502 = class149.method1030(class78.field1301, 0, class33.field471, (byte) 117);
                class136.field2387 = class149.method1030(class227.field3833, 0, class33.field471, (byte) 118);
            } else {
                class283.method1853(var1, var2, var4, var5, class186.field3014, 256 - class37.field550);
            }
        }
        if (class35.field502 != null && class136.field2387 != null) {
            int var6 = (-(class136.field2387.field1218 * 2) + var4) / class35.field502.field1218;
            for (int var7 = 0; var6 > var7; ++var7) {
                class35.field502.method447(class136.field2387.field1218 - -(class35.field502.field1218 * var7) + var1, var2);
            }
            class136.field2387.method447(var1, var2);
            class136.field2387.method457(var1 + var4 - class136.field2387.field1218, var2);
        }
        class290.field4636.method1626(class240.field3949, var1 - -3, var2 + 14, class102.field1797, -1);
        class283.method1853(var1, var2 - -var5, var4, -var5 + var3, class186.field3014, -class37.field550 + 256);
        int var8 = class48.field839;
        int var9 = class256.field4182;
        for (int var10 = 0; ~class275.field4399 < ~var10; ++var10) {
            int var18 = (class275.field4399 + -1 + -var10) * 15 + var5 - -13 + var2;
            if (~var8 < ~var1 && ~var8 > ~(var1 + var4) && ~var9 < ~(var18 + -13) && ~(var18 + 3) < ~var9) {
                class283.method1853(var1, var18 + -12, var4, 15, class205.field3353, -class182.field2971 + 256);
            }
        }
        if ((class136.field2376 == null || class9.field118 == null || class73.field1199 == null) && class33.field471.method727(class205.field3347, (byte) -89) && class33.field471.method727(class90.field1597, (byte) -124) && class33.field471.method727(class110.field1986, (byte) -108)) {
            class136.field2376 = class149.method1030(class205.field3347, 0, class33.field471, (byte) 122);
            class9.field118 = class149.method1030(class90.field1597, 0, class33.field471, (byte) 13);
            class73.field1199 = class149.method1030(class110.field1986, 0, class33.field471, (byte) 118);
        }
        if (class136.field2376 != null && class9.field118 != null && class73.field1199 != null) {
            int var11 = (-(class73.field1199.field1218 * 2) + var4) / class136.field2376.field1218;
            for (int var12 = 0; ~var11 < ~var12; ++var12) {
                class136.field2376.method447(var1 - (-class73.field1199.field1218 - class136.field2376.field1218 * var12), var2 - -var3 - class136.field2376.field1229);
            }
            int var13 = (var3 - class73.field1199.field1229 + -var5) / class9.field118.field1229;
            for (int var14 = 0; var14 < var13; ++var14) {
                class9.field118.method447(var1, class9.field118.field1229 * var14 + var5 + var2);
                class9.field118.method457(var1 - -var4 + -class9.field118.field1218, var2 + var5 - -(class9.field118.field1229 * var14));
            }
            class73.field1199.method447(var1, var2 - -var3 + -class73.field1199.field1229);
            class73.field1199.method457(-class73.field1199.field1218 + var4 + var1, var2 + var3 + -class73.field1199.field1229);
        }
        if (arg0 <= 97) {
            field3882 = 68;
        }
        for (int var15 = 0; ~class275.field4399 < ~var15; ++var15) {
            int var16 = class102.field1797;
            int var17 = (class275.field4399 - (1 - -var15)) * 15 + var2 + 13 + var5;
            if (~var1 > ~var8 && var8 < var1 - -var4 && ~var9 < ~(var17 + -13) && var17 - -3 > var9) {
                var16 = class196.field3162;
            }
            class290.field4636.method1626(class245.method1639((byte) 16, var15), var1 + 3, var17, var16, 0);
        }
        class237.method1573(class127.field2244, class95.field1641, class22.field340, (byte) -23, class144.field2469);
    }

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "(I)V")
    public static void method1550(int arg0) {
        if (arg0 != 20160) {
            field3882 = -118;
        }
        field3885 = null;
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(I)V")
    public class234(int arg0) {
        super(0, true);
        this.field3881 = 4096;
        this.field3881 = arg0;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "([BIBI)Ljava/lang/String;")
    public static final String method1551(byte[] arg0, int arg1, byte arg2, int arg3) {
        ++field3883;
        int var4 = 0;
        char[] var5 = new char[arg3];
        int var6 = 0;
        if (arg2 >= -28) {
            field3888 = false;
        }
        while (var6 < arg3) {
            int var7 = 255 & arg0[arg1 + var6];
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class104.field1828[var7 + -128];
                    if (var8 == 0) {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var5[var4++] = (char) var7;
            }
            ++var6;
        }
        return new String(var5, 0, var4);
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(III)V")
    public static final void method1552(int arg0, int arg1, int arg2) {
        class125.field2202 = true;
        class74.field1219 = arg0;
        class203.field3326 = arg1;
        class3.field29 = arg2;
        class31.field457 = -1;
        class65.field1099 = -1;
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V")
    public class234() {
        this(4096);
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "(II)I")
    public static final int method1553(int arg0, int arg1) {
        ++field3886;
        if (arg0 != 255) {
            field3885 = null;
        }
        return arg1 & 255;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)[I")
    public final int[] method23(int arg0, int arg1) {
        if (arg0 <= 39) {
            method1550(-100);
        }
        ++field3884;
        int[] var3 = super.field4425.method992(17118, arg1);
        if (super.field4425.field2448) {
            class235.method1560(var3, 0, class53.field929, this.field3881);
        }
        return var3;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILeh;B)V")
    public final void method21(int arg0, class101 arg1, byte arg2) {
        ++field3880;
        if (arg2 == -1) {
            if (~arg0 == -1) {
                this.field3881 = (arg1.method669((byte) 36) << 12) / 255;
            }
        }
    }
}
