import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class167 extends class8 {

    @OriginalMember(owner = "client!ba", name = "S", descriptor = "Z")
    public static volatile boolean field2654 = true;

    @OriginalMember(owner = "client!ba", name = "L", descriptor = "Lng;")
    public static class76 field2647 = new class76(5000);

    @OriginalMember(owner = "client!ba", name = "U", descriptor = "Z")
    public static boolean field2656 = false;

    @OriginalMember(owner = "client!ba", name = "W", descriptor = "I")
    public static int field2658 = 0;

    @OriginalMember(owner = "client!ba", name = "V", descriptor = "[Lwd;")
    public static class22[] field2657 = new class22[4];

    @OriginalMember(owner = "client!ba", name = "Y", descriptor = "[I")
    public static int[] field2660 = new int[25];

    @OriginalMember(owner = "client!ba", name = "X", descriptor = "I")
    public static int field2659 = 0;

    @OriginalMember(owner = "client!ba", name = "I", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!ba", name = "J", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!ba", name = "K", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!ba", name = "M", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!ba", name = "N", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!ba", name = "O", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!ba", name = "P", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!ba", name = "Q", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!ba", name = "R", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!ba", name = "T", descriptor = "Lbl;")
    public static class33 field2655;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IB)[[I")
    public final int[][] method65(int arg0, byte arg1) {
        int var3 = -31 / ((-48 - arg1) / 46);
        int[][] var4 = super.field93.method248(arg0, 17416);
        ++field2649;
        if (super.field93.field470) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; var8 < class231.field3798; ++var8) {
                this.method1151(arg0, var8, 125);
                int[][] var9 = this.method60(class81.field1280, 0, 93);
                var5[var8] = var9[0][class144.field2314];
                var6[var8] = var9[1][class144.field2314];
                var7[var8] = var9[2][class144.field2314];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BLbl;)V")
    public static final void method1148(byte arg0, class33 arg1) {
        ++field2648;
        if (arg0 < 16) {
            field2659 = -37;
        }
        class97 var2 = (class97) class220.field3593.method1400(class74.method522((byte) -120, arg1.field525), true);
        if (var2 != null) {
            if (var2.field1596 != null) {
                class195.field3123.method1707(var2.field1596);
                var2.field1596 = null;
            }
            var2.method1388(83);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method1149(String arg0, int arg1) {
        if (arg1 != 16013) {
            method1152(81);
        }
        ++field2650;
        return class154.method1068((byte) -43, 10, arg0, true);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BLog;I)V")
    public final void method64(byte arg0, class221 arg1, int arg2) {
        if (arg0 < 62) {
            method1152(-108);
        }
        ++field2644;
        if (~arg2 == -1) {
            super.field115 = ~arg1.method1517((byte) -96) == -2;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lqh;I)V")
    public static final void method1150(class201 arg0, int arg1) {
        ++field2652;
        if (arg1 >= -74) {
            method1152(123);
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(II)[I")
    public final int[] method44(int arg0, int arg1) {
        if (arg0 != 3) {
            field2647 = null;
        }
        int[] var3 = super.field110.method1585(0, arg1);
        if (super.field110.field3734) {
            for (int var4 = 0; class231.field3798 > var4; ++var4) {
                this.method1151(arg1, var4, arg0 ^ 117);
                int[] var5 = this.method61(class81.field1280, 120, 0);
                var3[var4] = var5[class144.field2314];
            }
        }
        ++field2653;
        return var3;
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(III)V")
    private final void method1151(int arg0, int arg1, int arg2) {
        ++field2651;
        int var4 = class182.field2864[arg0];
        if (arg2 < 114) {
            this.method44(76, -60);
        }
        int var5 = class176.field2776[arg1];
        float var6 = (float) Math.atan2((double) (var5 - 2048), (double) (var4 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class144.field2314 = arg1;
            class81.field1280 = arg0;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class144.field2314 = arg0;
            class81.field1280 = arg1;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class81.field1280 = arg1;
            class144.field2314 = class231.field3798 - arg0;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class81.field1280 = -arg0 + class259.field4118;
            class144.field2314 = arg1;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class144.field2314 = -arg1 + class231.field3798;
            class81.field1280 = class259.field4118 - arg0;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class81.field1280 = -arg1 + class259.field4118;
            class144.field2314 = class231.field3798 - arg0;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class144.field2314 = arg0;
            class81.field1280 = class259.field4118 - arg1;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class144.field2314 = class231.field3798 - arg1;
            class81.field1280 = arg0;
        }
        class144.field2314 &= class287.field4537;
        class81.field1280 &= class92.field1523;
    }

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "(I)V")
    public static void method1152(int arg0) {
        field2647 = null;
        field2660 = null;
        if (arg0 != -6558) {
            method1154(19, (byte) 63, 61);
        }
        field2655 = null;
        field2657 = null;
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V")
    public class167() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "(B)V")
    public static final void method1153(byte arg0) {
        ++field2645;
        int var1 = class23.field386;
        int var2 = class279.field4404;
        int var3 = class68.field1134;
        int var4 = class145.field2322;
        if (class118.field1940 == null || class128.field2071 == null) {
            if (class222.field3687.method1353(-90, class8.field94) && class222.field3687.method1353(-35, class240.field3885)) {
                class118.field1940 = class280.method1888(0, 14, class8.field94, class222.field3687);
                class128.field2071 = class280.method1888(0, 14, class240.field3885, class222.field3687);
            } else {
                class2.method23(var2, var1, var3, 20, class264.field4214, -class109.field1799 + 256);
            }
        }
        if (class118.field1940 != null && class128.field2071 != null) {
            int var5 = var3 / class118.field1940.field3873;
            for (int var6 = 0; var5 > var6; ++var6) {
                class118.field1940.method332(var2 - -(class118.field1940.field3873 * var6), var1);
            }
            class128.field2071.method332(var2, var1);
            class128.field2071.method321(var2 + var3 - class128.field2071.field3873, var1);
        }
        class262.field4165.method1811(class47.field849, var2 + 3, var1 + 14, class142.field2300, -1);
        class2.method23(var2, var1 + 20, var3, var4 + -20, class264.field4214, -class109.field1799 + 256);
        int var7 = class241.field3898;
        int var8 = class109.field1801;
        for (int var9 = 0; var9 < class205.field3291; ++var9) {
            int var17 = (-var9 + class205.field3291 + -1) * 15 + var1 + 35;
            if (var7 > var2 && ~var7 > ~(var2 + var3) && ~var8 < ~(var17 + -13) && ~var8 > ~(var17 + 3)) {
                class2.method23(var2, var17 - 13, var3, 16, class90.field1488, -class106.field1700 + 256);
            }
        }
        if ((class199.field3177 == null || class262.field4157 == null || class94.field1538 == null) && class222.field3687.method1353(-93, class213.field3490) && class222.field3687.method1353(-12, class194.field3106) && class222.field3687.method1353(-121, class155.field2508)) {
            class199.field3177 = class280.method1888(0, 14, class213.field3490, class222.field3687);
            class262.field4157 = class280.method1888(0, 14, class194.field3106, class222.field3687);
            class94.field1538 = class280.method1888(0, 14, class155.field2508, class222.field3687);
        }
        if (class199.field3177 != null && class262.field4157 != null && class94.field1538 != null) {
            int var10 = var3 / class199.field3177.field3873;
            for (int var11 = 0; var10 > var11; ++var11) {
                class199.field3177.method332(var2 - -(class199.field3177.field3873 * var11), -class199.field3177.field3864 + var4 + var1);
            }
            int var12 = (var4 + -20) / class262.field4157.field3864;
            for (int var13 = 0; ~var12 < ~var13; ++var13) {
                class262.field4157.method332(var2, var1 - -(class262.field4157.field3864 * var13) + 20);
                class262.field4157.method321(-class262.field4157.field3873 + var3 + var2, class262.field4157.field3864 * var13 + var1 + 20);
            }
            class94.field1538.method332(var2, var1 - -var4 + -class94.field1538.field3864);
            class94.field1538.method321(var2 - -var3 + -class94.field1538.field3873, var1 + var4 + -class94.field1538.field3864);
        }
        if (arg0 >= -48) {
            field2654 = false;
        }
        for (int var14 = 0; class205.field3291 > var14; ++var14) {
            int var15 = (class205.field3291 + -1 + -var14) * 15 + 35 + var1;
            int var16 = class142.field2300;
            if (var7 > var2 && ~var7 > ~(var2 + var3) && ~(var15 + -13) > ~var8 && var15 - -3 > var8) {
                var16 = class14.field248;
            }
            class262.field4165.method1811(class141.method978(-93, var14), var2 - -3, var15, var16, 0);
        }
        class274.method1849((byte) -106, class68.field1134, class279.field4404, class145.field2322, class23.field386);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IBI)V")
    public static final void method1154(int arg0, byte arg1, int arg2) {
        class129.field2090 = class210.field3428 + -1 - (-class223.field3692 + arg2);
        ++field2646;
        if (arg1 != 93) {
            field2659 = -120;
        }
        class182.field2866 = arg0 - class161.field2568;
        int var3 = -((int) ((float) class286.field4525.field642 / class221.field3668)) + class182.field2866;
        int var4 = -((int) ((float) class286.field4525.field676 / class221.field3668)) + class129.field2090;
        int var5 = (int) ((float) class286.field4525.field642 / class221.field3668) + class182.field2866;
        if (var3 < 0) {
            class182.field2866 = (int) ((float) class286.field4525.field642 / class221.field3668);
        }
        if (~var5 < ~class1.field17) {
            class182.field2866 = -((int) ((float) class286.field4525.field642 / class221.field3668)) + class1.field17;
        }
        int var6 = (int) ((float) class286.field4525.field676 / class221.field3668) + class129.field2090;
        if (~var4 > -1) {
            class129.field2090 = (int) ((float) class286.field4525.field676 / class221.field3668);
        }
        if (~class210.field3428 > ~var6) {
            class129.field2090 = class210.field3428 - (int) ((float) class286.field4525.field676 / class221.field3668);
        }
    }
}
