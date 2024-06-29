import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public abstract class class160 {

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "Lsf;")
    public static class108 field2869 = null;

    @OriginalMember(owner = "client!ej", name = "l", descriptor = "I")
    public static int field2876 = 0;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "Lsf;")
    public static class108 field2867 = class140.method973(255, "<col=00ffff>");

    @OriginalMember(owner = "client!ej", name = "m", descriptor = "I")
    public static int field2877 = 0;

    @OriginalMember(owner = "client!ej", name = "r", descriptor = "[[I")
    public static int[][] field2882 = new int[104][104];

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
    public int field2865;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
    public int field2868;

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!ej", name = "j", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!ej", name = "k", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!ej", name = "n", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!ej", name = "o", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!ej", name = "p", descriptor = "I")
    public int field2880;

    @OriginalMember(owner = "client!ej", name = "q", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V", line = 8)
    public static void method1106(int arg0) {
        field2867 = null;
        field2869 = null;
        if (arg0 != 12536) {
            field2879 = -124;
        }
        field2882 = (int[][]) null;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILik;B)[Lt;", line = 30)
    public static final class257[] method1107(int arg0, class262 arg1, byte arg2) {
        field2872++;
        int var3 = -107 % ((arg2 + 52) / 42);
        return class25.method168(-12, arg1, arg0) ? class259.method1841(-107) : null;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Z)Z", line = 45)
    public final boolean method1108(boolean arg0) {
        if (arg0) {
            field2871++;
            return (this.field2868 & 0x2) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)Z", line = 62)
    public final boolean method1109(int arg0) {
        if (arg0 == -25565) {
            field2878++;
            return (this.field2868 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IZ)V", line = 91)
    public static final void method1110(int arg0, boolean arg1) {
        field2866++;
        if (arg0 >= -109) {
            return;
        }
        byte[][] var2;
        byte var3;
        if (class231.field4051 && arg1) {
            var2 = class129.field2216;
            var3 = 1;
        } else {
            var2 = class144.field2539;
            var3 = 4;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class212.method1460((byte) -16);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class134.field2325[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x32AF3BA) >> 24;
                        if (!arg1 || var8 == 0) {
                            int var9 = (var7 & 0x7) >> 1;
                            int var10 = (var7 & 0xFFC2B4) >> 14;
                            int var11 = var7 >> 3 & 0x7FF;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class57.field838.length; var13++) {
                                if (class57.field838[var13] == var12 && var2[var13] != null) {
                                    class74.method489(8, (var10 & 0x7) * 8, var5 * 8, var6 * 8, class330.field5644, var9, var2[var13], (var11 & 0x7) * 8, arg1, var8, var4);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lik;Lik;I)V", line = 173)
    public static final void method1111(class262 arg0, class262 arg1, int arg2) {
        field2870++;
        class128.field2183 = arg0;
        if (arg2 < 115) {
            field2873 = -117;
        }
        class295.field5158 = arg1;
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "(I)Z", line = 185)
    public final boolean method1112(int arg0) {
        field2875++;
        if (arg0 <= 36) {
            return false;
        } else {
            return (this.field2868 & 0x8) != 0;
        }
    }

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "(I)Z", line = 206)
    public final boolean method1113(int arg0) {
        field2874++;
        if (arg0 != 20593) {
            this.method1112(78);
        }
        return (this.field2868 & 0x4) != 0;
    }
}
