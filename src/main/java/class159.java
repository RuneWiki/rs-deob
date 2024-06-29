import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class159 {

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "Lsf;")
    public static class108 field2854 = class140.method973(255, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!sm", name = "h", descriptor = "Lrm;")
    public static class249 field2861 = new class249(new byte[5000]);

    @OriginalMember(owner = "client!sm", name = "j", descriptor = "[Lqd;")
    public static class45[] field2863 = new class45[32768];

    @OriginalMember(owner = "client!sm", name = "k", descriptor = "Lsf;")
    public static class108 field2864 = class140.method973(255, "<col=ffff00>");

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "I")
    public int field2855;

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
    public int field2856;

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "I")
    public int field2858;

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!sm", name = "i", descriptor = "Lik;")
    public static class262 field2862;

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "[I")
    public static int[] field2859;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V", line = 5)
    public static final void method1102(byte arg0) {
        class186.field3423 &= 0x7FF;
        field2857++;
        if (class176.field3207 < 128) {
            class176.field3207 = 128;
        }
        int var1 = class198.field3567 >> 7;
        if (class176.field3207 > 383) {
            class176.field3207 = 383;
        }
        int var2 = class43.field570 >> 7;
        int var3 = class45.method321(110, class43.field570, class198.field3567, class295.field5159);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= (var1 + 4); var5++) {
                for (int var6 = var2 - 4; var6 <= (var2 + 4); var6++) {
                    int var7 = class295.field5159;
                    if (var7 < 3 && (class166.field2980[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = ((class311.field5382[var7][var5][var6] & 0xFF) * 8) + var3 - class278.field4883[var7][var5][var6];
                    if (var4 < var8) {
                        var4 = var8;
                    }
                }
            }
        }
        int var9 = var4 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (class203.field3659 < var9) {
            class203.field3659 += (var9 - class203.field3659) / 24;
        } else if (var9 < class203.field3659) {
            class203.field3659 += (var9 - class203.field3659) / 80;
        }
        if (arg0 != 85) {
            field2854 = (class108) null;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V", line = 83)
    public static void method1103(int arg0) {
        if (arg0 != -10497) {
            method1103(52);
        }
        field2862 = null;
        field2864 = null;
        field2863 = null;
        field2861 = null;
        field2854 = null;
        field2859 = null;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IB)Z", line = 104)
    public static final boolean method1104(int arg0, byte arg1) {
        field2860++;
        int var2 = -53 % ((arg1 + 11) / 42);
        return (arg0 >> 29 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(III)Lwj;", line = 118)
    public static final class220 method1105(int arg0, int arg1, int arg2) {
        class74 var3 = class99.field1759[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class220 var4 = var3.field1124;
            var3.field1124 = null;
            return var4;
        }
    }
}
