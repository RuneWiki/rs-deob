import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class244 {

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "Lvq;")
    public static class22 field3549 = new class22();

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "Lvq;")
    public static class22 field3550 = new class22();

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "[[I")
    public static int[][] field3547;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(B)V", line = 7)
    public static void method1776(byte arg0) {
        field3547 = null;
        field3549 = null;
        field3550 = null;
        int var1 = -60 % ((arg0 + 1) / 48);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)V", line = 23)
    public static final void method1777(int arg0) {
        class107.method947(true, class273.field4109);
        field3548++;
        class135.field2164++;
        if (class282.field4229 && class239.field3451) {
            int var1 = class129.field2111;
            int var2 = class291.field4327;
            int var3 = var1 - class174.field2567;
            int var4 = var2 - class197.field2877;
            if (var3 < class278.field4187) {
                var3 = class278.field4187;
            }
            if ((class273.field4109.field3764 + var3) > (class278.field4187 + class276.field4156.field3764)) {
                var3 = class278.field4187 + class276.field4156.field3764 - class273.field4109.field3764;
            }
            if (class452.field6584 > var4) {
                var4 = class452.field6584;
            }
            if ((class452.field6584 + class276.field4156.field3758) < (var4 + class273.field4109.field3758)) {
                var4 = class452.field6584 + class276.field4156.field3758 - class273.field4109.field3758;
            }
            int var5 = var3 - class415.field6005;
            if (arg0 != 24120) {
                field3547 = null;
            }
            int var6 = var4 - class441.field6411;
            int var7 = class273.field4109.field3898;
            if (class273.field4109.field3845 < class135.field2164 && (var5 > var7 || -var7 > var5 || var6 > var7 || (-var7) > var6)) {
                class243.field3542 = true;
            }
            int var8 = class276.field4156.field3791 + var3 - class278.field4187;
            int var9 = var4 + class276.field4156.field3900 - class452.field6584;
            if (class273.field4109.field3836 != null && class243.field3542) {
                class254 var10 = new class254();
                var10.field3683 = class273.field4109.field3836;
                var10.field3668 = var8;
                var10.field3680 = var9;
                var10.field3678 = class273.field4109;
                class216.method1636(var10);
            }
            if (class408.field5943 == 0) {
                if (class243.field3542) {
                    if (class273.field4109.field3826 != null) {
                        class254 var11 = new class254();
                        var11.field3684 = class135.field2162;
                        var11.field3683 = class273.field4109.field3826;
                        var11.field3680 = var9;
                        var11.field3678 = class273.field4109;
                        var11.field3668 = var8;
                        class216.method1636(var11);
                    }
                    if (class135.field2162 != null && client.method1819(class273.field4109) != null) {
                        class13.field216.method2781(false, 59);
                        class398.field5862++;
                        class13.field216.method275(class273.field4109.field3854, 1414495172);
                        class13.field216.method305(1981122392, class135.field2162.field3854);
                        class13.field216.method283((byte) 119, class273.field4109.field3860);
                        class13.field216.method260(class135.field2162.field3860, (byte) -68);
                    }
                } else if ((class60.field963 == 1 || class133.method1102(-2001)) && class389.field5591 > 2) {
                    class238.method1732(2, -93);
                } else if (class19.method121(76)) {
                    class238.method1732(1, arg0 - 24237);
                }
                class273.field4109 = null;
            }
        } else if (class135.field2164 > 1) {
            class273.field4109 = null;
        }
    }
}
