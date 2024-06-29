import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class57 extends class285 {

    @OriginalMember(owner = "client!wc", name = "bb", descriptor = "I")
    private int field806 = 2048;

    @OriginalMember(owner = "client!wc", name = "O", descriptor = "I")
    private int field793 = 12288;

    @OriginalMember(owner = "client!wc", name = "W", descriptor = "I")
    private int field801 = 0;

    @OriginalMember(owner = "client!wc", name = "cb", descriptor = "I")
    private int field807 = 8192;

    @OriginalMember(owner = "client!wc", name = "db", descriptor = "I")
    private int field808 = 0;

    @OriginalMember(owner = "client!wc", name = "U", descriptor = "I")
    private int field799 = 4096;

    @OriginalMember(owner = "client!wc", name = "V", descriptor = "I")
    private int field800 = 2048;

    @OriginalMember(owner = "client!wc", name = "P", descriptor = "Ljava/lang/String;")
    public static String field794 = "Please remove ";

    @OriginalMember(owner = "client!wc", name = "fb", descriptor = "Lhh;")
    public static class169 field810 = new class169();

    @OriginalMember(owner = "client!wc", name = "gb", descriptor = "Ljava/lang/String;")
    public static String field811 = "purple:";

    @OriginalMember(owner = "client!wc", name = "hb", descriptor = "I")
    public static int field812 = 1;

    @OriginalMember(owner = "client!wc", name = "Q", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!wc", name = "R", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!wc", name = "S", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!wc", name = "T", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!wc", name = "X", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!wc", name = "Z", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!wc", name = "ab", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!wc", name = "eb", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!wc", name = "Y", descriptor = "Z")
    public static boolean field803;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZLjj;I)V", line = 22)
    public final void method63(boolean arg0, class44 arg1, int arg2) {
        if (arg2 == 0) {
            this.field806 = arg1.method271(21081);
        } else if (arg2 == 1) {
            this.field808 = arg1.method271(21081);
        } else if (arg2 == 2) {
            this.field801 = arg1.method271(21081);
        } else if (arg2 == 3) {
            this.field800 = arg1.method271(21081);
        } else if (arg2 == 4) {
            this.field793 = arg1.method271(21081);
        } else if (arg2 == 5) {
            this.field799 = arg1.method271(21081);
        } else if (arg2 == 6) {
            this.field807 = arg1.method271(21081);
        }
        field805++;
        if (!arg0) {
            field811 = (String) null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "(I)V", line = 90)
    public final void method361(int arg0) {
        int var2 = -57 / ((arg0 - 42) / 36);
        class208.method1511((byte) -99);
        field796++;
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V", line = 98)
    public class57() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIZII)V", line = 102)
    public static final void method362(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field802++;
        int var7 = arg1 + arg3;
        int var8 = arg0 - arg3;
        int var9 = arg3 + arg5;
        int var10 = arg2 - arg3;
        if (!arg4) {
            method362(103, 25, -128, -66, false, 21, -77);
        }
        for (int var11 = arg1; var11 < var7; var11++) {
            class80.method545(arg6, -79, arg2, arg5, class281.field4523[var11]);
        }
        for (int var12 = arg0; var12 > var8; var12--) {
            class80.method545(arg6, -70, arg2, arg5, class281.field4523[var12]);
        }
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class281.field4523[var13];
            class80.method545(arg6, -62, var9, arg5, var14);
            class80.method545(arg6, -62, arg2, var10, var14);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)Z", line = 147)
    private final boolean method363(int arg0, int arg1, int arg2) {
        field809++;
        int var4 = (arg0 - arg1) * this.field793 >> 12;
        int var5 = class51.field731[(var4 * 255 & 0xFF0F9) >> 12];
        int var6 = (var5 << 12) / this.field793;
        if (arg2 > -101) {
            this.method363(106, -57, 15);
        }
        int var7 = (var6 << 12) / this.field807;
        int var8 = this.field799 * var7 >> 12;
        return var8 > arg0 + arg1 && (-var8) < (arg0 + arg1);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZI)[I", line = 171)
    public final int[] method60(boolean arg0, int arg1) {
        field797++;
        int[] var3 = this.field4573.method1116(111, arg1);
        if (this.field4573.field2420) {
            int var4 = class27.field382[arg1] - 2048;
            for (int var5 = 0; var5 < class287.field4599; var5++) {
                int var6 = class48.field669[var5] - 2048;
                int var7 = this.field808 + var4;
                int var8 = var7 >= -2048 ? var7 : var7 + 4096;
                int var9 = this.field801 + var6;
                int var10 = this.field806 + var6;
                int var11 = var9 < -2048 ? var9 + 4096 : var9;
                int var12 = var8 > 2048 ? var8 - 4096 : var8;
                int var13 = var11 > 2048 ? var11 - 4096 : var11;
                int var14 = this.field800 + var4;
                int var15 = var10 >= -2048 ? var10 : var10 + 4096;
                int var16 = var15 > 2048 ? var15 - 4096 : var15;
                int var17 = var14 >= -2048 ? var14 : var14 + 4096;
                int var18 = var17 > 2048 ? var17 - 4096 : var17;
                var3[var5] = this.method363(var12, var16, -122) || this.method364(var13, var18, 0) ? 4096 : 0;
            }
        }
        if (!arg0) {
            this.field793 = 36;
        }
        return var3;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(III)Z", line = 222)
    private final boolean method364(int arg0, int arg1, int arg2) {
        field798++;
        int var4 = (arg1 + arg0) * this.field793 >> 12;
        int var5 = class51.field731[var4 * 255 >> 12 & 0xFF];
        int var6 = (var5 << 12) / this.field793;
        int var7 = (var6 << 12) / this.field807;
        int var8 = this.field799 * var7 >> 12;
        if (arg2 == 0) {
            return var8 > (arg1 - arg0) && (-var8) < (arg1 - arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "(I)V", line = 244)
    public static void method365(int arg0) {
        field811 = null;
        field810 = null;
        if (arg0 != 19569) {
            field811 = (String) null;
        }
        field794 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZBLkh;)V", line = 263)
    public static final void method366(boolean arg0, byte arg1, class251 arg2) {
        field795++;
        if (class232.field3690 || arg0) {
            int var3 = class20.field276;
            int var4 = var3 * 956 / 503;
            class129.field2022.method376((class133.field2095 - var4) / 2, 0, var4, var3);
            class302.field4749.method1856(class133.field2095 / 2 - class302.field4749.field4163 / 2, 18);
        }
        if (arg1 != 122) {
            field811 = (String) null;
        }
        arg2.method1796(class217.field3519, class133.field2095 / 2, class20.field276 / 2 - 26, 16777215, -1);
        int var5 = class20.field276 / 2 - 18;
        if (class232.field3690) {
            class75.method507(class133.field2095 / 2 - 152, var5, 304, 34, 9179409);
            class75.method507(class133.field2095 / 2 - 151, var5 + 1, 302, 32, 0);
            class75.method505(class133.field2095 / 2 - 150, var5 - -2, class213.field3483 * 3, 30, 9179409);
            class75.method505(class133.field2095 / 2 + class213.field3483 * 3 - 150, var5 - -2, 300 - (class213.field3483 * 3), 30, 0);
        } else {
            class59.method390(class133.field2095 / 2 - 152, var5, 304, 34, 9179409);
            class59.method390(class133.field2095 / 2 - 151, var5 + 1, 302, 32, 0);
            class59.method382(class133.field2095 / 2 - 150, var5 + 2, class213.field3483 * 3, 30, 9179409);
            class59.method382(class213.field3483 * 3 + (class133.field2095 / 2 - 150), var5 + 2, 300 - (class213.field3483 * 3), 30, 0);
        }
        arg2.method1796(class339.field5278, class133.field2095 / 2, class20.field276 / 2 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IILak;)Lbf;", line = 311)
    public static final class58 method367(int arg0, int arg1, class172 arg2) {
        if (arg1 > -15) {
            method365(60);
        }
        field804++;
        return class284.method2041(arg2, -102, arg0) ? class200.method1464(true) : null;
    }
}
