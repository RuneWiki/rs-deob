import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class157 extends class17 {

    @OriginalMember(owner = "client!mg", name = "mb", descriptor = "I")
    private int field2834 = 0;

    @OriginalMember(owner = "client!mg", name = "nb", descriptor = "I")
    private int field2835 = 4096;

    @OriginalMember(owner = "client!mg", name = "db", descriptor = "Lsf;")
    private static class108 field2825 = class140.method973(255, "Loaded update list");

    @OriginalMember(owner = "client!mg", name = "gb", descriptor = "Lsf;")
    public static class108 field2828 = field2825;

    @OriginalMember(owner = "client!mg", name = "hb", descriptor = "Lhe;")
    public static class94 field2829 = new class94(500);

    @OriginalMember(owner = "client!mg", name = "pb", descriptor = "I")
    public static int field2837 = 500;

    @OriginalMember(owner = "client!mg", name = "qb", descriptor = "I")
    public static int field2838 = -1;

    @OriginalMember(owner = "client!mg", name = "rb", descriptor = "Lsf;")
    public static class108 field2839 = class140.method973(255, "cross");

    @OriginalMember(owner = "client!mg", name = "tb", descriptor = "Lsf;")
    public static class108 field2841 = class140.method973(255, ")4a=");

    @OriginalMember(owner = "client!mg", name = "ub", descriptor = "Lsf;")
    public static class108 field2842 = class140.method973(255, ":clan:");

    @OriginalMember(owner = "client!mg", name = "ob", descriptor = "I")
    public static int field2836 = 0;

    @OriginalMember(owner = "client!mg", name = "sb", descriptor = "Lsf;")
    public static class108 field2840 = class140.method973(255, "Lade Titelbild )2 ");

    @OriginalMember(owner = "client!mg", name = "ab", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!mg", name = "bb", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!mg", name = "cb", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!mg", name = "eb", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!mg", name = "fb", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!mg", name = "ib", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!mg", name = "kb", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!mg", name = "lb", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!mg", name = "vb", descriptor = "Lik;")
    public static class262 field2843;

    @OriginalMember(owner = "client!mg", name = "jb", descriptor = "[Lwf;")
    public static class59[] field2831;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(Z)V", line = 11)
    public static void method1093(boolean arg0) {
        field2828 = null;
        field2841 = null;
        field2825 = null;
        field2839 = null;
        field2831 = null;
        field2829 = null;
        field2840 = null;
        if (arg0) {
            field2843 = null;
            field2842 = null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZLlj;)V", line = 29)
    public static final void method1094(boolean arg0, class51 arg1) {
        field2823++;
        class299 var2 = (class299) class36.field494.method1676(arg1.field757.method743(false), (byte) -81);
        if (!arg0) {
            return;
        }
        if (var2 == null) {
            class290.method2072(arg1.field4482[0], 0, (class60) null, class295.field5159, arg1, 128, arg1.field4498[0], (class45) null);
        } else {
            var2.method2110(126);
        }
    }

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "(II)[I", line = 59)
    public final int[] method120(int arg0, int arg1) {
        if (arg0 > -95) {
            field2825 = (class108) null;
        }
        int[] var3 = this.field217.method1698(-102, arg1);
        if (this.field217.field4295) {
            int[] var4 = this.method124(57, 0, arg1);
            for (int var5 = 0; var5 < class116.field2008; var5++) {
                int var6 = var4[var5];
                var3[var5] = var6 >= this.field2834 && var6 <= this.field2835 ? 4096 : 0;
            }
        }
        field2833++;
        return var3;
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V", line = 92)
    public class157() {
        super(1, true);
    }

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "(I)V", line = 104)
    public static final void method1095(int arg0) {
        class62.field991 = class191.method1355(8, 4, 8, 35, 2048, true, (byte) 116, 0.4F);
        field2826++;
        if (arg0 != 1) {
            field2842 = (class108) null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BI)V", line = 116)
    public static final void method1096(byte arg0, int arg1) {
        field2824++;
        int var2 = 114 / ((arg0 - 56) / 55);
        class120 var3 = class248.method1704(3, 91, arg1);
        var3.method843((byte) 28);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IZI)I", line = 129)
    public static final int method1097(int arg0, boolean arg1, int arg2) {
        field2822++;
        if (arg2 == -1) {
            return 12345678;
        }
        int var3 = (arg2 & 0x7F) * arg0 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return arg1 ? (arg2 & 0xFF80) + var3 : 39;
    }

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "(II)V", line = 159)
    public static final void method1098(int arg0, int arg1) {
        field2830++;
        if (arg1 != 0) {
            method1096((byte) -9, -127);
        }
        class322.field5516.method637(arg0, 119);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BLrm;I)V", line = 183)
    public final void method114(byte arg0, class249 arg1, int arg2) {
        field2832++;
        if (arg2 == 0) {
            this.field2834 = arg1.method1712(arg0 + 113);
        } else if (arg2 == 1) {
            this.field2835 = arg1.method1712(-1);
        }
        if (arg0 != -114) {
            method1096((byte) -69, -39);
        }
    }
}
