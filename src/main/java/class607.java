import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class607 extends class601 {

    @OriginalMember(owner = "client!iq", name = "H", descriptor = "I")
    private int field7989 = 4096;

    @OriginalMember(owner = "client!iq", name = "D", descriptor = "Z")
    private boolean field7986 = true;

    @OriginalMember(owner = "client!iq", name = "C", descriptor = "I")
    public static int field7985;

    @OriginalMember(owner = "client!iq", name = "G", descriptor = "I")
    public static int field7988;

    @OriginalMember(owner = "client!iq", name = "I", descriptor = "I")
    public static int field7990;

    @OriginalMember(owner = "client!iq", name = "J", descriptor = "I")
    public static int field7991;

    @OriginalMember(owner = "client!iq", name = "K", descriptor = "I")
    public static int field7992;

    @OriginalMember(owner = "client!iq", name = "F", descriptor = "Lon;")
    public static class340 field7987;

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(IZ)[[I", line = 7)
    public final int[][] method7(int arg0, boolean arg1) {
        ++field7985;
        int[][] var3 = super.field7890.method3963(1, arg0);
        if (super.field7890.field9769) {
            int[] var4 = this.method3266((byte) 64, class112.field1855 & arg0 + -1, 0);
            int[] var5 = this.method3266((byte) 64, arg0, 0);
            int[] var6 = this.method3266((byte) 64, class112.field1855 & arg0 + 1, 0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; class171.field2624 > var10; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field7989;
                int var12 = (var5[var10 + 1 & class445.field6116] + -var5[var10 + -1 & class445.field6116]) * this.field7989;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var16 + 4096 + var15) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 != 0) {
                    var18 = var12 / var17;
                    var19 = 16777216 / var17;
                    var20 = var11 / var17;
                } else {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                }
                if (this.field7986) {
                    var18 = 2048 - -(var18 >> 1);
                    var20 = (var20 >> 1) + 2048;
                    var19 = 2048 - -(var19 >> 1);
                }
                var7[var10] = var18;
                var8[var10] = var20;
                var9[var10] = var19;
            }
        }
        if (!arg1) {
            this.field7986 = false;
        }
        return var3;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(ZB)I", line = 89)
    public static final int method3296(boolean arg0, byte arg1) {
        ++field7992;
        int var2 = -20 % ((arg1 - -16) / 52);
        if (class595.field7748 == null) {
            return 0;
        } else if (!arg0 && class68.field833 != null) {
            return class595.field7748.length * 2;
        } else {
            int var3 = 0;
            for (int var4 = 0; class595.field7748.length > var4; ++var4) {
                int var5 = class595.field7748[var4];
                if (class517.field6905.method2216(var5, 96)) {
                    ++var3;
                }
                if (class629.field8381.method2216(var5, 62)) {
                    ++var3;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!iq", name = "e", descriptor = "(I)V", line = 126)
    public static void method3297(int arg0) {
        field7987 = null;
        if (arg0 > -91) {
            field7987 = null;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IBII)Lpf;", line = 136)
    public static final class583 method3298(int arg0, byte arg1, int arg2, int arg3) {
        ++field7991;
        class583 var4 = null;
        if (~arg0 == -1) {
            var4 = class381.method2246(1, class128.field2105, class660.field8712);
            ++class612.field8148;
        }
        if (~arg0 == -2) {
            var4 = class381.method2246(arg1 ^ 27, class128.field2105, class631.field8404);
            ++class11.field178;
        }
        var4.field7637.method3780(class334.field4757 + arg2, arg1 + 36);
        var4.field7637.method3814((byte) 109, !class153.field2345.method2313(true, 82) ? 0 : 1);
        var4.field7637.method3780(class503.field6752 + arg3, arg1 + 93);
        class359.field5044 = arg3;
        class102.field1421 = arg2;
        class376.field5231 = false;
        if (arg1 != 26) {
            return null;
        } else {
            class140.method1075(false);
            return var4;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(BLjava/lang/String;I)Z", line = 169)
    public static final boolean method3299(byte arg0, String arg1, int arg2) {
        ++field7990;
        if (class66.field828.field2892) {
            class284.field4030 = new class557();
            class284.field4030.field7333 = arg1;
            class284.field4030.field7338 = arg2;
            if (class508.field6778 != class304.field4326) {
                class284.field4030.field7345 = class284.field4030.field7338 + 40000;
                class284.field4030.field7342 = class284.field4030.field7338 + 50000;
            }
            for (int var3 = 0; ~var3 > ~class721.field10045.length; ++var3) {
                if (~class721.field10045[var3].field8653 == ~arg2) {
                    class36.field519 = class721.field10045[var3].field6194;
                }
            }
            return true;
        } else {
            int var4 = -124 / ((arg0 - 19) / 55);
            String var5 = "";
            if (class508.field6778 != class304.field4326) {
                var5 = ":" + (arg2 + 7000);
            }
            String var6 = "";
            if (class686.field9560 != null) {
                var6 = "/p=" + class686.field9560;
            }
            String var7 = "http://" + arg1 + var5 + "/l=" + class713.field9854 + "/a=" + class236.field3316 + var6 + "/j" + (!class358.field4998 ? "0" : "1") + ",o" + (class343.field4824 ? "1" : "0") + ",a2";
            try {
                class243.field3401.getAppletContext().showDocument(new URL(var7), "_self");
                return true;
            } catch (Exception var8) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "()V", line = 225)
    public class607() {
        super(1, false);
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lee;BI)V", line = 232)
    public final void method6(class677 arg0, byte arg1, int arg2) {
        if (arg1 != -61) {
            this.method6((class677) null, (byte) -16, 34);
        }
        if (arg2 != 0) {
            if (arg2 == 1) {
                this.field7986 = arg0.method3821((byte) -37) == 1;
            }
        } else {
            this.field7989 = arg0.method3807(arg1 + 60);
        }
        ++field7988;
    }
}
