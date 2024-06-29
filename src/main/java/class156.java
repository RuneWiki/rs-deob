import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class156 extends class177 {

    @OriginalMember(owner = "client!gi", name = "p", descriptor = "Lid;")
    public static class149 field2874 = class60.method382("p11_full", (byte) 79);

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "S")
    public static short field2871 = 320;

    @OriginalMember(owner = "client!gi", name = "q", descriptor = "Lid;")
    public static class149 field2875 = class60.method382("http:)4)4", (byte) 74);

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "Lid;")
    public static class149 field2870 = class60.method382("hitbar_default", (byte) 30);

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "I")
    public static int field2872 = 0;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!gi", name = "o", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!gi", name = "r", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!gi", name = "s", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!gi", name = "t", descriptor = "Lnc;")
    public static class85 field2878;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZLid;)V")
    public static final void method1120(boolean arg0, class149 arg1) {
        field2868++;
        class159.field2927 = arg1;
        if (class272.field4900.field436 == null || arg0) {
            return;
        }
        try {
            class149 var2 = class110.field1899.method1045(class272.field4900.field436, 31365);
            class149 var3 = class135.field2453.method1045(class272.field4900.field436, 31365);
            class149 var4 = class237.method1603(new class149[] { var2, class13.field179, arg1, class270.field4859, var3 }, -104);
            class149 var5;
            if (arg1.method1053((byte) 63) == 0) {
                var5 = class237.method1603(new class149[] { var4, class16.field223 }, -127);
            } else {
                var5 = class237.method1603(new class149[] { var4, class93.field1645, class157.method1133(0, class81.method608(19644) + 94608000000L), class278.field4975, class78.method594(-1, 94608000L) }, -112);
            }
            class237.method1603(new class149[] { class275.field4923, var5, class55.field984 }, -124).method1049(class272.field4900.field436, -23731);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)I")
    public static final int method1121(int arg0) {
        int var1 = 112 / ((arg0 - 34) / 62);
        field2869++;
        if ((double) class199.field3616 == 3.0D) {
            return 37;
        } else if ((double) class199.field3616 == 4.0D) {
            return 50;
        } else if ((double) class199.field3616 == 6.0D) {
            return 75;
        } else if ((double) class199.field3616 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "([BI)[B")
    public static final byte[] method1122(byte[] arg0, int arg1) {
        field2876++;
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        class209.method1428(arg0, arg1, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILaj;)Lid;")
    public static final class149 method1123(int arg0, class47 arg1) {
        if (arg0 != 320) {
            field2871 = -60;
        }
        field2877++;
        if (client.method1104(arg1).method1178(-1) == 0) {
            return null;
        } else if (arg1.field724 == null || arg1.field724.method1037(32).method1053((byte) 109) == 0) {
            return class38.field563 ? class200.field3634 : null;
        } else {
            return arg1.field724;
        }
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(I)V")
    public static void method1124(int arg0) {
        field2878 = null;
        field2874 = null;
        field2875 = null;
        if (arg0 < 118) {
            field2874 = null;
        }
        field2870 = null;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILal;ZI)Lrh;")
    public static final class46 method1125(int arg0, class230 arg1, boolean arg2, int arg3) {
        if (arg2) {
            return null;
        } else {
            field2867++;
            return class59.method371((byte) -77, arg0, arg3, arg1) ? class100.method718(255) : null;
        }
    }
}
