import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class104 extends class44 {

    @OriginalMember(owner = "client!rb", name = "xb", descriptor = "[J")
    public static long[] field2621 = new long[100];

    @OriginalMember(owner = "client!rb", name = "Cb", descriptor = "[Lpa;")
    public static class91[] field2626 = new class91[4];

    @OriginalMember(owner = "client!rb", name = "Eb", descriptor = "[I")
    public static int[] field2628 = new int[128];

    @OriginalMember(owner = "client!rb", name = "yb", descriptor = "B")
    public byte field2622;

    @OriginalMember(owner = "client!rb", name = "vb", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!rb", name = "wb", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!rb", name = "zb", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!rb", name = "Bb", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!rb", name = "Db", descriptor = "I")
    public int field2627;

    @OriginalMember(owner = "client!rb", name = "ub", descriptor = "Lu;")
    public class120 field2618;

    @OriginalMember(owner = "client!rb", name = "Ab", descriptor = "Laa;")
    public static class2 field2624;

    @OriginalMember(owner = "client!rb", name = "Fb", descriptor = "Ljd;")
    public static class58 field2629;

    @OriginalMember(owner = "client!rb", name = "sb", descriptor = "Lba;")
    public static class8 field2616;

    @OriginalMember(owner = "client!rb", name = "tb", descriptor = "[Le;")
    public static class25[] field2617;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IILjava/awt/Component;I)Lwc;", line = 3)
    public static final class134 method878(int arg0, int arg1, Component arg2, int arg3) {
        field2620++;
        if (arg3 != -4875) {
            field2629 = null;
        }
        try {
            Class var4 = Class.forName("qe");
            class134 var5 = (class134) var4.getDeclaredConstructor().newInstance();
            var5.method107(13, arg1, arg2, arg0);
            return var5;
        } catch (Throwable var7) {
            class4 var6 = new class4();
            var6.method107(44, arg1, arg2, arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZI)V", line = 37)
    public static final void method879(boolean arg0, int arg1) {
        class92.field2296 = arg1;
        if (arg0) {
            field2623++;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)V", line = 49)
    public static final void method880(int arg0, int arg1) {
        field2619++;
        if (class9.field312 == null) {
            return;
        }
        if (class62.field1551 == 0) {
            if (class122.field3033 >= 0) {
                class122.field3033 = arg1;
                class9.field312.method303((byte) -111, arg1, 0);
            }
        } else if (class2.field79 != null) {
            class36.field976 = arg1;
        }
        if (arg0 != 22741) {
            method881((byte) 61);
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(B)V", line = 105)
    public static final void method881(byte arg0) {
        field2625++;
        int var1 = 72 / ((arg0 - 64) / 52);
        for (class22 var2 = (class22) class92.field2287.method805((byte) -90); var2 != null; var2 = (class22) class92.field2287.method812(-4)) {
            if (var2.field693 > 0) {
                var2.field693--;
            }
            if (var2.field693 != 0) {
                if (var2.field695 > 0) {
                    var2.field695--;
                }
                if (var2.field695 == 0 && var2.field701 >= 1 && var2.field700 >= 1 && var2.field701 <= 102 && var2.field700 <= 102 && (var2.field679 < 0 || class82.method744(var2.field692, var2.field679, (byte) 106))) {
                    class105.method885(var2.field700, var2.field679, var2.field701, var2.field692, var2.field697, 103, var2.field689, var2.field680);
                    var2.field695 = -1;
                    if (var2.field690 == var2.field679 && var2.field690 == -1) {
                        var2.method742(-1);
                    } else if (var2.field690 == var2.field679 && var2.field697 == var2.field687 && var2.field698 == var2.field692) {
                        var2.method742(-1);
                    }
                }
            } else if (var2.field690 < 0 || class82.method744(var2.field698, var2.field690, (byte) 103)) {
                class105.method885(var2.field700, var2.field690, var2.field701, var2.field698, var2.field687, 103, var2.field689, var2.field680);
                var2.method742(-1);
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "(I)V", line = 184)
    public static void method882(int arg0) {
        field2628 = null;
        field2616 = null;
        field2624 = null;
        field2626 = null;
        field2629 = null;
        if (arg0 != -1) {
            field2629 = null;
        }
        field2621 = null;
        field2617 = null;
    }
}
