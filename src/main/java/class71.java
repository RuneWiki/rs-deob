import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class71 extends class138 {

    @OriginalMember(owner = "client!rc", name = "K", descriptor = "Laf;")
    public class42 field1112;

    @OriginalMember(owner = "client!rc", name = "J", descriptor = "Lck;")
    private static class119 field1111 = class298.method1987((byte) 38, "Please wait)3)3)3");

    @OriginalMember(owner = "client!rc", name = "D", descriptor = "Lck;")
    public static class119 field1106 = class298.method1987((byte) 107, "m-Ochte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!rc", name = "L", descriptor = "[I")
    public static int[] field1113 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!rc", name = "H", descriptor = "[I")
    public static int[] field1110 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };

    @OriginalMember(owner = "client!rc", name = "E", descriptor = "Lck;")
    public static class119 field1107 = field1111;

    @OriginalMember(owner = "client!rc", name = "F", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!rc", name = "G", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!rc", name = "M", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!rc", name = "N", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!rc", name = "O", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)V", line = 5)
    public static final void method508(int arg0) {
        field1115++;
        class75.field1177++;
        class6.field149.method966(0, 85);
        int var1 = -128 % ((arg0 + 43) / 45);
        for (class288 var2 = (class288) class206.field3268.method1325(-31); var2 != null; var2 = (class288) class206.field3268.method1332(-71)) {
            if (var2.field4734 == 0) {
                class252.method1623(var2, true, 8848);
            }
        }
        if (class191.field3064 != null) {
            class26.method194(class191.field3064, -90);
            class191.field3064 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(Z)V", line = 34)
    public static void method509(boolean arg0) {
        field1107 = null;
        field1111 = null;
        field1106 = null;
        field1113 = null;
        field1110 = null;
        if (!arg0) {
            method510(5);
        }
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(I)V", line = 51)
    public static final void method510(int arg0) {
        if (arg0 != 7) {
            method509(true);
        }
        class154.field2469.method486((byte) 93);
        field1116++;
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Laf;)V", line = 63)
    public class71(class42 arg0) {
        this.field1112 = arg0;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IBIIIII)V", line = 74)
    public static final void method511(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg4 + arg5;
        int var8 = arg2 - arg4;
        field1109++;
        int var9 = arg4 + arg6;
        if (arg1 <= 121) {
            return;
        }
        for (int var10 = arg5; var10 < var7; var10++) {
            class36.method282(arg3, arg6, arg0, class256.field4113[var10], 26175);
        }
        for (int var11 = arg2; var11 > var8; var11--) {
            class36.method282(arg3, arg6, arg0, class256.field4113[var11], 26175);
        }
        int var12 = arg3 - arg4;
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class256.field4113[var13];
            class36.method282(var9, arg6, arg0, var14, 26175);
            class36.method282(arg3, var12, arg0, var14, 26175);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lml;B)Lck;", line = 137)
    public static final class119 method512(class134 arg0, byte arg1) {
        field1108++;
        if (class98.method661(arg1 ^ 0xFFFFFF8D, client.method620(arg0)) == 0) {
            return null;
        }
        if (arg1 != -115) {
            field1111 = (class119) null;
        }
        if (arg0.field2117 == null || arg0.field2117.method787((byte) 25).method776((byte) -89) == 0) {
            return class106.field1626 ? class210.field3348 : null;
        } else {
            return arg0.field2117;
        }
    }
}
