import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class360 extends class747 {

    @OriginalMember(owner = "client!hs", name = "J", descriptor = "I")
    private int field5153 = 2048;

    @OriginalMember(owner = "client!hs", name = "G", descriptor = "I")
    private int field5150 = 3072;

    @OriginalMember(owner = "client!hs", name = "F", descriptor = "I")
    private int field5149 = 1024;

    @OriginalMember(owner = "client!hs", name = "L", descriptor = "Lkr;")
    public static class602 field5155 = new class602(104, 0);

    @OriginalMember(owner = "client!hs", name = "N", descriptor = "Lkr;")
    public static class602 field5157 = new class602(35, -2);

    @OriginalMember(owner = "client!hs", name = "Q", descriptor = "Z")
    public static boolean field5160 = false;

    @OriginalMember(owner = "client!hs", name = "E", descriptor = "I")
    public static int field5148;

    @OriginalMember(owner = "client!hs", name = "H", descriptor = "I")
    public static int field5151;

    @OriginalMember(owner = "client!hs", name = "I", descriptor = "I")
    public static int field5152;

    @OriginalMember(owner = "client!hs", name = "K", descriptor = "I")
    public static int field5154;

    @OriginalMember(owner = "client!hs", name = "M", descriptor = "I")
    public static int field5156;

    @OriginalMember(owner = "client!hs", name = "O", descriptor = "I")
    public static int field5158;

    @OriginalMember(owner = "client!hs", name = "P", descriptor = "I")
    public static int field5159;

    @OriginalMember(owner = "client!hs", name = "S", descriptor = "I")
    public static int field5162;

    @OriginalMember(owner = "client!hs", name = "R", descriptor = "Llv;")
    public static class356 field5161;

    @OriginalMember(owner = "client!hs", name = "T", descriptor = "Lqw;")
    public static class387 field5163;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(ZI)V")
    public static final void method2293(boolean arg0, int arg1) {
        ++field5152;
        if (arg0) {
            if (~class544.field7545 != 0) {
                class634.method3553((byte) -94, class544.field7545);
            }
            for (class654 var2 = (class654) class259.field3747.method821((byte) 122); var2 != null; var2 = (class654) class259.field3747.method818(72)) {
                if (!var2.method550(false)) {
                    var2 = (class654) class259.field3747.method821((byte) 110);
                    if (var2 == null) {
                        break;
                    }
                }
                class39.method217((byte) 110, var2, true, false);
            }
            class544.field7545 = -1;
            class259.field3747 = new class130(8);
            class540.method3196(-27179);
            class544.field7545 = class211.field2789;
            class304.method2002(false, 24615);
            class235.method1566(16349);
            class546.method3232(class544.field7545);
        }
        if (arg1 != 24023) {
            method2293(false, -57);
        }
        class701.field9775 = true;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(BZLjava/lang/String;)V")
    public static final void method2294(byte arg0, boolean arg1, String arg2) {
        ++field5151;
        if (arg2 != null) {
            if (class97.field1370 >= 100) {
                class75.method566(4, true, class155.field2158.method978(class120.field1576, (byte) -128));
            } else {
                if (arg0 != -46) {
                    method2293(false, 39);
                }
                String var3 = class673.method3805(1, arg2);
                if (var3 != null) {
                    for (int var4 = 0; ~class97.field1370 < ~var4; ++var4) {
                        String var9 = class673.method3805(1, class438.field6108[var4]);
                        if (var9 != null && var9.equals(var3)) {
                            class75.method566(4, true, arg2 + class155.field2159.method978(class120.field1576, (byte) -110));
                            return;
                        }
                        if (class747.field10288[var4] != null) {
                            String var10 = class673.method3805(1, class747.field10288[var4]);
                            if (var10 != null && var10.equals(var3)) {
                                class75.method566(4, true, arg2 + class155.field2159.method978(class120.field1576, (byte) -114));
                                return;
                            }
                        }
                    }
                    for (int var5 = 0; ~class239.field3558 < ~var5; ++var5) {
                        String var7 = class673.method3805(arg0 ^ -45, class193.field2627[var5]);
                        if (var7 != null && var7.equals(var3)) {
                            class75.method566(4, true, class155.field2164.method978(class120.field1576, (byte) -116) + arg2 + class155.field2165.method978(class120.field1576, (byte) -111));
                            return;
                        }
                        if (class342.field4854[var5] != null) {
                            String var8 = class673.method3805(1, class342.field4854[var5]);
                            if (var8 != null && var8.equals(var3)) {
                                class75.method566(4, true, class155.field2164.method978(class120.field1576, (byte) -117) + arg2 + class155.field2165.method978(class120.field1576, (byte) -125));
                                return;
                            }
                        }
                    }
                    if (class673.method3805(arg0 + 47, class388.field5601.field1313).equals(var3)) {
                        class75.method566(4, true, class155.field2161.method978(class120.field1576, (byte) -108));
                    } else {
                        ++class22.field254;
                        class583 var6 = class54.method400(class213.field2800, (byte) -90, class529.field7335);
                        var6.field7963.method444(class712.method4007(arg2, 4927) + 1, arg0 + 174);
                        var6.field7963.method510(arg2, (byte) 61);
                        var6.field7963.method444(!arg1 ? 0 : 1, 128);
                        class463.method2838(var6, (byte) 122);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(I)V")
    public final void method184(int arg0) {
        this.field5153 = -this.field5149 + this.field5150;
        if (arg0 == -2) {
            ++field5158;
        }
    }

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "(Z)V")
    public static void method2295(boolean arg0) {
        field5157 = null;
        field5163 = null;
        field5161 = null;
        if (!arg0) {
            method2296(true, (byte) 17);
        }
        field5155 = null;
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(II)[[I")
    public final int[][] method688(int arg0, int arg1) {
        ++field5154;
        int[][] var3 = super.field10289.method2200(0, arg1);
        if (super.field10289.field4906) {
            int[][] var4 = this.method4158(0, arg1, 2);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class73.field1095; ++var11) {
                var8[var11] = (var5[var11] * this.field5153 >> 12) + this.field5149;
                var9[var11] = this.field5149 - -(var6[var11] * this.field5153 >> 12);
                var10[var11] = (var7[var11] * this.field5153 >> 12) + this.field5149;
            }
        }
        int var12 = -98 % ((35 - arg0) / 58);
        return var3;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Ldc;II)V")
    public final void method183(class63 arg0, int arg1, int arg2) {
        ++field5159;
        if (arg1 != 11608) {
            this.field5149 = -1;
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    super.field10281 = arg0.method505((byte) -119) == 1;
                }
            } else {
                this.field5150 = arg0.method482(-772591672);
            }
        } else {
            this.field5149 = arg0.method482(-772591672);
        }
    }

    @OriginalMember(owner = "client!hs", name = "<init>", descriptor = "()V")
    public class360() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(II)[I")
    public final int[] method182(int arg0, int arg1) {
        if (arg1 > -89) {
            return null;
        } else {
            ++field5148;
            int[] var3 = super.field10279.method3479(true, arg0);
            if (super.field10279.field8263) {
                int[] var4 = this.method4156(33, arg0, 0);
                for (int var5 = 0; class73.field1095 > var5; ++var5) {
                    var3[var5] = (var4[var5] * this.field5153 >> 12) + this.field5149;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(ZB)V")
    public static final void method2296(boolean arg0, byte arg1) {
        if (arg1 > -73) {
            field5160 = true;
        }
        ++field5156;
        int var2 = class17.field171;
        int var3 = class504.field7008;
        if (arg0 && class301.field4261) {
            var2 <<= 1;
            var3 = -var2;
        }
        class129.field1802.method1511(var3, var2);
    }
}
