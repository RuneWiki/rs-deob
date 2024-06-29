import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ow")
public class class289 extends class82 {

    @OriginalMember(owner = "client!ow", name = "S", descriptor = "I")
    private int field3753 = 4096;

    @OriginalMember(owner = "client!ow", name = "P", descriptor = "I")
    private int field3750 = 4096;

    @OriginalMember(owner = "client!ow", name = "L", descriptor = "I")
    private int field3746 = 4096;

    @OriginalMember(owner = "client!ow", name = "O", descriptor = "[I")
    public static int[] field3749 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ow", name = "T", descriptor = "Z")
    public static boolean field3754 = false;

    @OriginalMember(owner = "client!ow", name = "W", descriptor = "Let;")
    public static class509 field3757 = null;

    @OriginalMember(owner = "client!ow", name = "Q", descriptor = "Lbg;")
    public static class393 field3751 = new class393();

    @OriginalMember(owner = "client!ow", name = "Y", descriptor = "F")
    public static float field3759 = 0.0F;

    @OriginalMember(owner = "client!ow", name = "M", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!ow", name = "N", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!ow", name = "R", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!ow", name = "U", descriptor = "I")
    public static int field3755;

    @OriginalMember(owner = "client!ow", name = "V", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!ow", name = "X", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!ow", name = "Z", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!ow", name = "ab", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!ow", name = "b", descriptor = "(II)[[I")
    public final int[][] method481(int arg0, int arg1) {
        ++field3756;
        int[][] var3 = super.field992.method3178(arg1, 0);
        if (arg0 != 1000) {
            return null;
        } else {
            if (super.field992.field7962) {
                int[][] var4 = this.method488(0, arg1, 1);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; class629.field9033 > var11; ++var11) {
                    int var12 = var5[var11];
                    int var13 = var7[var11];
                    int var14 = var6[var11];
                    if (~var12 == ~var13 && var13 == var14) {
                        var8[var11] = this.field3746 * var12 >> 12;
                        var9[var11] = this.field3753 * var13 >> 12;
                        var10[var11] = this.field3750 * var14 >> 12;
                    } else {
                        var8[var11] = this.field3746;
                        var9[var11] = this.field3753;
                        var10[var11] = this.field3750;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(IILos;)V")
    public final void method198(int arg0, int arg1, class374 arg2) {
        ++field3755;
        int var4 = 9 / ((arg1 - -69) / 42);
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field3750 = arg2.method2136(false);
                }
            } else {
                this.field3753 = arg2.method2136(false);
            }
        } else {
            this.field3746 = arg2.method2136(false);
        }
    }

    @OriginalMember(owner = "client!ow", name = "e", descriptor = "(III)I")
    public static final int method1625(int arg0, int arg1, int arg2) {
        ++field3758;
        int var3 = arg1 * 57 + arg2;
        if (arg0 != 2) {
            method1626((String) null, 64, 54);
        }
        int var4 = var3 ^ var3 << 13;
        int var5 = Integer.MAX_VALUE & (var4 * var4 * 15731 - -789221) * var4 + 1376312589;
        return (var5 & 133767857) >> 19;
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(Ljava/lang/String;II)Z")
    public static final boolean method1626(String arg0, int arg1, int arg2) {
        ++field3747;
        if (~class165.field2028 != -4) {
            class237.field2960 = new class220();
            class237.field2960.field2715 = arg1;
            class237.field2960.field2713 = arg0;
            if (class507.field7033 != class36.field282) {
                class237.field2960.field2710 = class237.field2960.field2715 + 40000;
                class237.field2960.field2711 = class237.field2960.field2715 + 50000;
            }
            if (class544.field7971.length > arg1 && class544.field7971[arg1] != null) {
                class641.field9242 = class544.field7971[arg1].field137;
            }
            return true;
        } else {
            String var3 = "";
            if (class507.field7033 != class36.field282) {
                var3 = ":" + (arg1 - -7000);
            }
            String var4 = "";
            if (class22.field153 != null) {
                var4 = "/p=" + class22.field153;
            }
            if (arg2 <= 47) {
                field3757 = null;
            }
            String var5 = "http://" + arg0 + var3 + "/l=" + class31.field247 + "/a=" + class95.field1177 + var4 + "/j" + (!class545.field8022 ? "0" : "1") + ",o" + (class199.field2396 ? "1" : "0") + ",a2";
            try {
                class216.field2633.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var6) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ow", name = "<init>", descriptor = "()V")
    public class289() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(B)V")
    public static void method1627(byte arg0) {
        if (arg0 >= 109) {
            field3751 = null;
            field3749 = null;
            field3757 = null;
        }
    }
}
