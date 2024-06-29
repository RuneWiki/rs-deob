import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public class class539 {

    @OriginalMember(owner = "client!wba", name = "c", descriptor = "Liv;")
    public static class565 field7921 = new class565();

    @OriginalMember(owner = "client!wba", name = "f", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field7924 = new Rectangle[100];

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "I")
    public static int field7919;

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "I")
    public static int field7920;

    @OriginalMember(owner = "client!wba", name = "d", descriptor = "I")
    public static int field7922;

    @OriginalMember(owner = "client!wba", name = "e", descriptor = "I")
    public static int field7923;

    // $FF: synthetic field
    @OriginalMember(owner = "client!wba", name = "g", descriptor = "Ljava/lang/Class;")
    public static Class field7925;

    // $FF: synthetic method
    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3175(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(B)V", line = 3)
    public static void method3170(byte arg0) {
        int var1 = 103 % ((11 - arg0) / 53);
        field7924 = null;
        field7921 = null;
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(BLhw;IZI)V", line = 16)
    public static final void method3171(byte arg0, class270 arg1, int arg2, boolean arg3, int arg4) {
        field7922++;
        int var5 = arg1.field2454[0];
        if (arg3) {
            method3170((byte) -5);
        }
        int var6 = arg1.field2459[0];
        if (var5 < 0 || class430.field6136 <= var5 || var6 < 0 || var6 >= class580.field8504 || arg4 < 0 || class430.field6136 <= arg4 || arg2 < 0 || arg2 >= class580.field8504) {
            return;
        }
        int var7 = class582.method3367(class45.field609[arg1.field3158], 0, true, -4, var6, 0, class237.field3505, arg2, 120, arg4, 0, arg1.method1108(80), 0, var5, class405.field5811);
        if (var7 >= 1 && var7 <= 3) {
            for (int var8 = 0; var8 < (var7 - 1); var8++) {
                arg1.method1708(class237.field3505[var8], (byte) -3, arg0, class405.field5811[var8]);
            }
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(Lwl;B)V", line = 58)
    public static final void method3172(class131 arg0, byte arg1) {
        field7923++;
        if (class541.field7946 == null) {
            return;
        }
        class394 var2 = null;
        if (arg1 > -66) {
            field7921 = null;
        }
        if (arg0.field2135 == 0) {
            var2 = (class394) class454.method2636(arg0.field2129, arg0.field2128, arg0.field2140);
        }
        if (arg0.field2135 == 1) {
            var2 = (class394) class681.method3856(arg0.field2129, arg0.field2128, arg0.field2140);
        }
        if (arg0.field2135 == 2) {
            var2 = (class394) class31.method286(arg0.field2129, arg0.field2128, arg0.field2140, field7925 == null ? (field7925 = method3175("sw")) : field7925);
        }
        if (arg0.field2135 == 3) {
            var2 = (class394) class415.method2469(arg0.field2129, arg0.field2128, arg0.field2140);
        }
        if (var2 == null) {
            arg0.field2132 = 0;
            arg0.field2127 = 0;
            arg0.field2133 = -1;
        } else {
            arg0.field2133 = var2.method903(111);
            arg0.field2132 = var2.method907(false);
            arg0.field2127 = var2.method904(-15140);
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(IIC)I", line = 104)
    public static final int method3173(int arg0, int arg1, char arg2) {
        field7919++;
        int var3 = arg2 << 4;
        if (Character.isUpperCase(arg2) || Character.isTitleCase(arg2)) {
            char var4 = Character.toLowerCase(arg2);
            var3 = (var4 << 4) + 1;
        }
        return arg0 == -28216 ? var3 : -35;
    }

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "(B)V", line = 125)
    public static final void method3174(byte arg0) {
        field7920++;
        class355 var1 = null;
        try {
            var1 = class705.method3964((byte) -97, "2");
            class465 var2 = new class465((class453.field6522 * 6) + 3);
            var2.method2753((byte) 57, 1);
            var2.method2739((byte) -86, class453.field6522);
            for (int var3 = 0; var3 < class384.field5620.length; var3++) {
                if (class331.field4580[var3]) {
                    var2.method2739((byte) -86, var3);
                    var2.method2733(false, class384.field5620[var3]);
                }
            }
            var1.method2149(var2.field6719, var2.field6710, 0, 1);
        } catch (Exception var5) {
        }
        try {
            if (var1 != null) {
                var1.method2152(false);
            }
            if (arg0 != -103) {
                method3174((byte) 59);
            }
        } catch (Exception var4) {
        }
        class662.field9304 = class254.method1619(true);
        class609.field8751 = false;
    }
}
