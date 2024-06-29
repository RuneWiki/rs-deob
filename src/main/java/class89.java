import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public abstract class class89 {

    @OriginalMember(owner = "client!o", name = "b", descriptor = "Lae;")
    private static class6 field2119 = class64.method474(124, "Login");

    @OriginalMember(owner = "client!o", name = "i", descriptor = "Lae;")
    public static class6 field2126 = class64.method474(111, "Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

    @OriginalMember(owner = "client!o", name = "k", descriptor = "I")
    public static int field2128 = 0;

    @OriginalMember(owner = "client!o", name = "r", descriptor = "I")
    public static int field2135 = 0;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "Lae;")
    public static class6 field2122 = field2119;

    @OriginalMember(owner = "client!o", name = "n", descriptor = "I")
    public static int field2131 = 0;

    @OriginalMember(owner = "client!o", name = "u", descriptor = "Lae;")
    private static class6 field2138 = class64.method474(116, "Continue");

    @OriginalMember(owner = "client!o", name = "d", descriptor = "Lae;")
    public static class6 field2121 = field2138;

    @OriginalMember(owner = "client!o", name = "v", descriptor = "Lae;")
    private static class6 field2139 = class64.method474(125, "Off");

    @OriginalMember(owner = "client!o", name = "l", descriptor = "Lae;")
    private static class6 field2129 = class64.method474(117, "shake:");

    @OriginalMember(owner = "client!o", name = "w", descriptor = "I")
    public static int field2140 = 0;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "Lae;")
    public static class6 field2120 = class64.method474(103, "Regelversto-8 melden");

    @OriginalMember(owner = "client!o", name = "m", descriptor = "Lae;")
    public static class6 field2130 = field2139;

    @OriginalMember(owner = "client!o", name = "p", descriptor = "[I")
    public static int[] field2133 = new int[128];

    @OriginalMember(owner = "client!o", name = "g", descriptor = "Lae;")
    public static class6 field2124 = field2129;

    @OriginalMember(owner = "client!o", name = "x", descriptor = "Lae;")
    private static class6 field2141 = class64.method474(119, "Existing user");

    @OriginalMember(owner = "client!o", name = "f", descriptor = "Lae;")
    public static class6 field2123 = field2141;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!o", name = "o", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!o", name = "q", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!o", name = "s", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!o", name = "t", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!o", name = "y", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V", line = 7)
    public static void method749(int arg0) {
        field2139 = null;
        field2122 = null;
        field2138 = null;
        field2119 = null;
        field2121 = null;
        field2141 = null;
        field2123 = null;
        field2133 = null;
        field2130 = null;
        if (arg0 >= -63) {
            method754((byte) 57);
        }
        field2120 = null;
        field2129 = null;
        field2124 = null;
        field2126 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "([Lh;I[BBIII)V", line = 58)
    public static final void method750(class47[] arg0, int arg1, byte[] arg2, byte arg3, int arg4, int arg5, int arg6) {
        field2137++;
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var12 = 0; var12 < 64; var12++) {
                for (int var13 = 0; var13 < 64; var13++) {
                    if (arg4 + var12 > 0 && arg4 + var12 < 103 && arg1 + var13 > 0 && arg1 + var13 < 103) {
                        arg0[var7].field1051[arg4 + var12][arg1 + var13] = class60.method451(arg0[var7].field1051[arg4 + var12][arg1 + var13], -16777217);
                    }
                }
            }
        }
        class77 var8 = new class77(arg2);
        if (arg3 <= 59) {
            return;
        }
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < 64; var10++) {
                for (int var11 = 0; var11 < 64; var11++) {
                    class95.method790((byte) 33, var8, 0, arg6, var11 + arg1, arg5, arg4 + var10, var9);
                }
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)V", line = 136)
    public static final void method751(int arg0, int arg1) {
        field2127++;
        if (arg1 != 64 || !class88.method745((byte) -62)) {
            return;
        }
        if (class50.field1128) {
            class130.field3162 = arg0;
        } else {
            class92.method767(arg0, (byte) 99);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V", line = 155)
    public static final void method752(byte arg0) {
        if (arg0 >= 0) {
            method754((byte) -40);
        }
        for (int var1 = 0; var1 < class92.field2205; var1++) {
            int var2 = class87.field2081[var1];
            class66 var3 = class20.field387[var2];
            int var4 = class85.field2051.method620((byte) -8);
            if ((var4 & 0x80) != 0) {
                var4 += class85.field2051.method620((byte) -8) << 8;
            }
            class109.method923(var3, (byte) 60, var2, var4);
        }
        field2132++;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILbf;)V", line = 186)
    public static final void method753(int arg0, class14 arg1) {
        class50.field1127 = arg1;
        field2118++;
        if (arg0 > 20) {
            class107.field2514 = class50.field1127.method153(16, (byte) -4);
        }
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(B)V", line = 207)
    public static final void method754(byte arg0) {
        try {
            Graphics var1 = class70.field1564.getGraphics();
            class37.field852.method1(-54, var1, 4, 4);
            if (arg0 != -103) {
                field2121 = null;
            }
        } catch (Exception var2) {
            class70.field1564.repaint();
        }
        field2125++;
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(B)V", line = 225)
    public static final void method755(byte arg0) {
        if (arg0 != -77) {
            field2138 = null;
        }
        field2142++;
        class87.method737(0, false, null, false);
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(I)V")
    public abstract void method436(int arg0);

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(B)V")
    public abstract void method435(byte arg0);

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(III)I")
    public abstract int method432(int arg0, int arg1, int arg2);
}
