import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class176 extends class59 {

    @OriginalMember(owner = "client!rb", name = "w", descriptor = "I")
    public static int field2851 = 0;

    @OriginalMember(owner = "client!rb", name = "B", descriptor = "[[Z")
    public static boolean[][] field2856 = new boolean[][] { new boolean[0], { true, false, true }, { true, false, false, true }, { false, false, true, true }, { true, true, false }, { false, true, true }, { true, false, false, true }, { false, false, false, true, true }, { false, true, true }, { true, false, true, true, true }, { false, true, true, true, true }, { false, true, true, true, true, false } };

    @OriginalMember(owner = "client!rb", name = "A", descriptor = "I")
    public static int field2855 = 0;

    @OriginalMember(owner = "client!rb", name = "D", descriptor = "Lok;")
    public static class41 field2857 = class137.method956("<col=00ff80>", 45);

    @OriginalMember(owner = "client!rb", name = "I", descriptor = "Lok;")
    private static class41 field2862 = class137.method956("Attack", 45);

    @OriginalMember(owner = "client!rb", name = "E", descriptor = "Lok;")
    public static class41 field2858 = class137.method956("Stufe: ", 45);

    @OriginalMember(owner = "client!rb", name = "L", descriptor = "Lok;")
    public static class41 field2864 = field2862;

    @OriginalMember(owner = "client!rb", name = "P", descriptor = "Lok;")
    public static class41 field2868 = class137.method956("www)2wtrc", 45);

    @OriginalMember(owner = "client!rb", name = "v", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!rb", name = "x", descriptor = "I")
    public int field2852;

    @OriginalMember(owner = "client!rb", name = "y", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!rb", name = "z", descriptor = "I")
    public int field2854;

    @OriginalMember(owner = "client!rb", name = "F", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!rb", name = "G", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!rb", name = "H", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!rb", name = "K", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!rb", name = "M", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!rb", name = "N", descriptor = "I")
    public int field2866;

    @OriginalMember(owner = "client!rb", name = "O", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BIII)Lbb;", line = 21)
    public static final class187 method1257(byte arg0, int arg1, int arg2, int arg3) {
        class187 var4 = new class187();
        var4.field3053 = arg3;
        field2860++;
        var4.field3052 = arg2;
        class113.field1658.method610(77, var4, (long) arg1);
        class181.method1299((byte) -49, arg2);
        class302 var5 = class165.method1157(false, arg1);
        if (var5 != null) {
            class18.method91(28515, var5);
        }
        if (arg0 >= -54) {
            field2865 = 119;
        }
        if (class109.field1526 != null) {
            class18.method91(28515, class109.field1526);
            class109.field1526 = null;
        }
        int var6 = class98.field1432;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class88.method624(class296.field4780[var7], 3)) {
                class201.method1429(255, var7);
            }
        }
        if (class98.field1432 == 1) {
            class251.field3993 = false;
            class67.method492(false, class109.field1528, class239.field3833, class117.field1717, class228.field3637);
        } else {
            class67.method492(false, class109.field1528, class239.field3833, class117.field1717, class228.field3637);
            int var8 = class140.field2165.method1794(class51.field773);
            for (int var9 = 0; var9 < class98.field1432; var9++) {
                int var10 = class140.field2165.method1794(class129.method901(var9, 3975));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class117.field1717 = var8 + 8;
            class228.field3637 = class98.field1432 * 15 + 22;
        }
        if (var5 != null) {
            class148.method1027(var5, (byte) -118, false);
        }
        class83.method587(arg2, 8981);
        if (class136.field2015 != -1) {
            class228.method1635(1, class136.field2015, 23);
        }
        return var4;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZB)V", line = 99)
    public static final void method1258(boolean arg0, byte arg1) {
        field2861++;
        if (arg1 != -101) {
            method1258(true, (byte) -38);
        }
        for (class149 var2 = (class149) class236.field3796.method1495(-312); var2 != null; var2 = (class149) class236.field3796.method1501(-127)) {
            if (var2.field2305 != null) {
                class225.field3596.method1421(var2.field2305);
                var2.field2305 = null;
            }
            if (var2.field2314 != null) {
                class225.field3596.method1421(var2.field2314);
                var2.field2314 = null;
            }
            var2.method418(6971);
        }
        if (!arg0) {
            return;
        }
        for (class149 var3 = (class149) class140.field2149.method1495(-312); var3 != null; var3 = (class149) class140.field2149.method1501(92)) {
            if (var3.field2305 != null) {
                class225.field3596.method1421(var3.field2305);
                var3.field2305 = null;
            }
            var3.method418(6971);
        }
        for (class149 var4 = (class149) class283.field4599.method609(111); var4 != null; var4 = (class149) class283.field4599.method616(-14)) {
            if (var4.field2305 != null) {
                class225.field3596.method1421(var4.field2305);
                var4.field2305 = null;
            }
            var4.method418(6971);
        }
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(I)V", line = 167)
    public static void method1259(int arg0) {
        if (arg0 != -1) {
            return;
        }
        field2856 = (boolean[][]) null;
        field2857 = null;
        field2862 = null;
        field2858 = null;
        field2864 = null;
        field2868 = null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)V", line = 182)
    public static final void method1260(int arg0, int arg1) {
        field2853++;
        int var2 = -85 % ((48 - arg0) / 51);
        class110.field1565 = arg1;
        class296.field4788 = -1;
        class296.field4788 = -1;
        class317.method2188(-1);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(III)V", line = 211)
    public static final void method1261(int arg0, int arg1, int arg2) {
        class85 var3 = class14.method63(17511, arg2);
        int var4 = var3.field1227;
        field2850++;
        if (arg0 < 1) {
            method1259(-102);
        }
        int var5 = var3.field1237;
        int var6 = var3.field1244;
        int var7 = class306.field5120[var5 - var6];
        if (arg1 < 0 || var7 < arg1) {
            arg1 = 0;
        }
        int var8 = var7 << var6;
        class15.method69(var4, arg1 << var6 & var8 | class60.field885[var4] & ~var8, -10);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BLok;)V", line = 260)
    public static final void method1262(byte arg0, class41 arg1) {
        if (arg0 <= 78) {
            field2857 = (class41) null;
        }
        class57.method401((byte) 101);
        class212.method1493(arg1, 27565);
        field2859++;
    }
}
