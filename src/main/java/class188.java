import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class188 extends class51 {

    @OriginalMember(owner = "client!ug", name = "jb", descriptor = "I")
    private int field3692 = 32768;

    @OriginalMember(owner = "client!ug", name = "hb", descriptor = "Z")
    public static boolean field3690 = false;

    @OriginalMember(owner = "client!ug", name = "eb", descriptor = "I")
    public static int field3687 = -1;

    @OriginalMember(owner = "client!ug", name = "Z", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!ug", name = "ab", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!ug", name = "bb", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!ug", name = "db", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!ug", name = "fb", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!ug", name = "gb", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!ug", name = "ib", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!ug", name = "kb", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!ug", name = "cb", descriptor = "[I")
    public static int[] field3685;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IB)[[I")
    public final int[][] method99(int arg0, byte arg1) {
        int[][] var3 = super.field1027.method1087(arg0, -2);
        if (super.field1027.field3428) {
            int[] var4 = this.method314(1, (byte) -46, arg0);
            int[] var5 = this.method314(2, (byte) -39, arg0);
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            int[] var8 = var3[1];
            for (int var9 = 0; class122.field2442 > var9; ++var9) {
                int var10 = (1047565 & var4[var9] * 255) >> 12;
                int var11 = var5[var9] * this.field3692 >> 12;
                int var12 = class122.field2451[var10] * var11 >> 12;
                int var13 = class49.field981[var10] * var11 >> 12;
                int var14 = (var12 >> 12) + var9 & class108.field2080;
                int var15 = class71.field1407 & (var13 >> 12) + arg0;
                int[][] var16 = this.method306(0, var15, 0);
                var6[var9] = var16[0][var14];
                var8[var9] = var16[1][var14];
                var7[var9] = var16[2][var14];
            }
        }
        ++field3689;
        return arg1 != -94 ? null : var3;
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V")
    public class188() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "(I)V")
    public static void method1198(int arg0) {
        field3685 = null;
        if (arg0 <= 82) {
            method1199(-19, (class193) null);
        }
    }

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "(I)V")
    public final void method64(int arg0) {
        ++field3683;
        class159.method999((byte) 13);
        if (arg0 > -83) {
            this.method64(117);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)[I")
    public final int[] method27(int arg0, int arg1) {
        if (arg0 != 16) {
            this.method64(-91);
        }
        ++field3693;
        int[] var3 = super.field1025.method39(arg1, (byte) 39);
        if (super.field1025.field154) {
            int[] var4 = this.method314(1, (byte) -122, arg1);
            int[] var5 = this.method314(2, (byte) -78, arg1);
            for (int var6 = 0; class122.field2442 > var6; ++var6) {
                int var7 = (4088 & var4[var6]) >> 4;
                int var8 = var5[var6] * this.field3692 >> 12;
                int var9 = class49.field981[var7] * var8 >> 12;
                int var10 = arg1 - -(var9 >> 12) & class71.field1407;
                int var11 = class122.field2451[var7] * var8 >> 12;
                int var12 = (var11 >> 12) + var6 & class108.field2080;
                int[] var13 = this.method314(0, (byte) -109, var10);
                var3[var6] = var13[var12];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILvc;)V")
    public static final void method1199(int arg0, class193 arg1) {
        ++field3684;
        if (~class185.field3649 == -2) {
            short var2 = 280;
            if (var2 <= class41.field814 && ~class41.field814 >= ~(var2 + 14) && ~class187.field3673 <= -5 && ~class187.field3673 >= -19) {
                class142.method905(0, 0, true);
                return;
            }
            if (~(var2 + 15) >= ~class41.field814 && ~(var2 + 80) <= ~class41.field814 && class187.field3673 >= 4 && class187.field3673 <= 18) {
                class142.method905(0, 1, true);
                return;
            }
            short var3 = 390;
            if (~var3 >= ~class41.field814 && ~class41.field814 >= ~(var3 - -14) && class187.field3673 >= 4 && ~class187.field3673 >= -19) {
                class142.method905(1, 0, true);
                return;
            }
            if (var3 + 15 <= class41.field814 && class41.field814 <= var3 - -80 && class187.field3673 >= 4 && ~class187.field3673 >= -19) {
                class142.method905(1, 1, true);
                return;
            }
            short var4 = 500;
            if (~class41.field814 <= ~var4 && var4 + 14 >= class41.field814 && ~class187.field3673 <= -5 && ~class187.field3673 >= -19) {
                class142.method905(2, 0, true);
                return;
            }
            if (class41.field814 >= var4 + 15 && var4 + 80 >= class41.field814 && class187.field3673 >= 4 && class187.field3673 <= 18) {
                class142.method905(2, 1, true);
                return;
            }
            short var5 = 610;
            if (class41.field814 >= var5 && var5 - -14 >= class41.field814 && ~class187.field3673 <= -5 && ~class187.field3673 >= -19) {
                class142.method905(3, 0, true);
                return;
            }
            if (~(var5 + 15) >= ~class41.field814 && ~class41.field814 >= ~(var5 + 80) && class187.field3673 >= 4 && class187.field3673 <= 18) {
                class142.method905(3, 1, true);
                return;
            }
            if (class41.field814 >= 708 && class187.field3673 >= 4 && class41.field814 <= 758 && ~class187.field3673 >= -21) {
                class5.field112 = false;
                class191.field3725.method785(0, 0);
                class182.field3604.method785(382, 0);
                class29.field537.method1163(-(class29.field537.field3574 / 2) + 382, 18);
                return;
            }
            if (class89.field1784 != -1) {
                class173 var6 = class107.field2058[class89.field1784];
                if (var6.field3452 != !class200.field3938) {
                    byte[] var7 = class167.method1036(new class43[] { var6.field3454, class185.field3652 }, true).method259((byte) -97);
                    class30.field571 = new String(var7, 0, var7.length);
                    class5.field112 = false;
                    if (~class81.field1612 != -1) {
                        class81.field1612 = 0;
                        class87.field1691 = 43594;
                        class53.field1070 = 43594;
                        class147.field3013 = 443;
                    }
                    class95.field1859 = var6.field3458;
                    class191.field3725.method785(0, 0);
                    class182.field3604.method785(382, 0);
                    class29.field537.method1163(-(class29.field537.field3574 / 2) + 382, 18);
                    return;
                }
                class43 var8 = class167.method1036(new class43[] { class52.field1058, var6.field3454, class185.field3652, class110.field2119, class121.field2412, class30.method161(!class9.field163 ? 0 : 1, 10), class203.field3957, class30.method161(class104.field1994, 10), class154.field3123, class30.method161(class57.field1114, 10) }, true);
                try {
                    arg1.getAppletContext().showDocument(var8.method258((byte) 21), "_self");
                } catch (Exception var9) {
                }
            }
        }
        if (arg0 != 24137) {
            field3685 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljg;II)V")
    public final void method24(class89 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 == -2) {
                super.field1029 = arg0.method538((byte) 123) == 1;
            }
        } else {
            this.field3692 = arg0.method555(-1113627096) << 4;
        }
        if (arg1 == 0) {
            ++field3688;
        }
    }
}
