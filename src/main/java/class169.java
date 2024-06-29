import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public abstract class class169 {

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "[I")
    public static int[] field2821 = new int[2];

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "Ljl;")
    public static class101 field2820;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "Ljl;")
    public static class101 field2825;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "Lhd;")
    public static class288 field2818;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method198(int arg0, Component arg1);

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
    public static void method1129(int arg0) {
        if (arg0 <= 98) {
            field2820 = null;
        }
        field2825 = null;
        field2818 = null;
        field2821 = null;
        field2820 = null;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V")
    public static final void method1130(int arg0) {
        class280.field4949.method1409(92);
        if (arg0 != 29499) {
            field2825 = null;
        }
        field2822++;
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)V")
    public static final void method1131(int arg0) {
        class219.field3762++;
        class273.field4778.method1697(89, 106);
        field2819++;
        for (class190 var1 = (class190) class120.field2022.method993(arg0 - 15314); var1 != null; var1 = (class190) class120.field2022.method988(4586)) {
            if (var1.field3270 == 0) {
                class256.method1746(var1, true, (byte) 76);
            }
        }
        if (class224.field3840 != null) {
            class121.method856(24665, class224.field3840);
            class224.field3840 = null;
        }
        if (arg0 != -8) {
            field2820 = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)V")
    public static final void method1132(int arg0, int arg1) {
        if (arg0 != 6) {
            method1129(109);
        }
        class187.field3184.method1402((byte) -43, arg1);
        class273.field4790.method1402((byte) -23, arg1);
        field2823++;
        class160.field2669.method1402((byte) -113, arg1);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILeg;B)V")
    public static final void method1133(int arg0, class37 arg1, byte arg2) {
        field2817++;
        class37 var3 = arg1.method229(-58).method227(arg2 ^ 0xFFFFFF89);
        boolean var4 = false;
        int var5 = 0;
        if (arg2 != 23) {
            return;
        }
        while (class138.field2360 > var5) {
            class188 var6 = class98.field1526[class285.field5020[var5]];
            if (var6 != null && var6.field3235 != null && var6.field3235.method256(true, var3)) {
                class139.method980(0, false, var6.field1780[0], 1, class82.field1285.field1780[0], 2, 0, 1, 0, true, class82.field1285.field1812[0], var6.field1812[0]);
                if (arg0 == 1) {
                    class273.field4778.method1697(59, 105);
                    class273.field4778.method1262(52, class285.field5020[var5]);
                    class22.field290++;
                } else if (arg0 == 4) {
                    class186.field3118++;
                    class273.field4778.method1697(184, arg2 + 84);
                    class273.field4778.method1262(62, class285.field5020[var5]);
                } else if (arg0 == 5) {
                    class273.field4778.method1697(93, 106);
                    class249.field4469++;
                    class273.field4778.method1265(class285.field5020[var5], -23132);
                } else if (arg0 == 6) {
                    class102.field1607++;
                    class273.field4778.method1697(135, 114);
                    class273.field4778.method1291(true, class285.field5020[var5]);
                } else if (arg0 == 7) {
                    class273.field4778.method1697(119, 117);
                    class134.field2323++;
                    class273.field4778.method1294(class285.field5020[var5], -26655);
                }
                var4 = true;
                break;
            }
            var5++;
        }
        if (!var4) {
            class274.method1839((byte) -77, 0, class179.field2989, class156.method1061((byte) -82, new class37[] { class21.field276, var3 }));
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)I")
    public abstract int method197(byte arg0);

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method196(int arg0, Component arg1);
}
