import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class87 {

    @OriginalMember(owner = "client!i", name = "a", descriptor = "[I")
    public static int[] field1659 = new int[5];

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public static int field1661 = 0;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "Ls;")
    public static class194 field1664 = new class194(64);

    @OriginalMember(owner = "client!i", name = "i", descriptor = "[S")
    public static short[] field1667 = new short[256];

    @OriginalMember(owner = "client!i", name = "j", descriptor = "Lqe;")
    public static class179 field1668 = class206.method1380("_", (byte) 22);

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "Leb;")
    public static class46 field1663;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "Leh;")
    public static class52 field1666;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)Lae;")
    public static final class6 method580(int arg0, int arg1) {
        if (arg1 <= 36) {
            field1659 = null;
        }
        int var2 = arg0 >> 16;
        field1660++;
        int var3 = arg0 & 0xFFFF;
        if (class199.field3710[var2] == null || class199.field3710[var2][var3] == null) {
            boolean var4 = class152.method976(true, var2);
            if (!var4) {
                return null;
            }
        }
        return class199.field3710[var2][var3];
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method581(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class112 var10 = (class112) class58.field1253.method242(16711680);
        class112 var11 = null;
        field1665++;
        while (var10 != null) {
            if (var10.field2099 == arg3 && var10.field2104 == arg8 && var10.field2102 == arg1 && var10.field2095 == arg0) {
                var11 = var10;
                break;
            }
            var10 = (class112) class58.field1253.method237(10);
        }
        if (var11 == null) {
            var11 = new class112();
            var11.field2104 = arg8;
            var11.field2095 = arg0;
            var11.field2099 = arg3;
            var11.field2102 = arg1;
            class74.method468(84, var11);
            class58.field1253.method235(-96, var11);
        }
        if (arg2 <= 62) {
            method582(70);
        }
        var11.field2103 = arg4;
        var11.field2096 = arg6;
        var11.field2093 = arg7;
        var11.field2098 = arg5;
        var11.field2112 = arg9;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)Lfc;")
    public static final class58 method582(int arg0) {
        field1662++;
        if (arg0 != -5837) {
            method580(-70, 39);
        }
        class72 var1 = new class72(class22.field544, class9.field257, class31.field674[0], class143.field2611[0], class187.field3493[0], class150.field2703[0], class173.field3102[0], class175.field3185);
        class17.method129((byte) -78);
        return var1;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V")
    public static void method583(byte arg0) {
        field1659 = null;
        field1667 = null;
        field1663 = null;
        field1664 = null;
        field1666 = null;
        if (arg0 == 14) {
            field1668 = null;
        }
    }
}
