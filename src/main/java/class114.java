import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class114 extends class44 {

    @OriginalMember(owner = "client!t", name = "Nb", descriptor = "[Lo;")
    public class84[] field2828;

    @OriginalMember(owner = "client!t", name = "sb", descriptor = "La;")
    public static class1 field2807 = class113.method934(-11538, "Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

    @OriginalMember(owner = "client!t", name = "wb", descriptor = "[I")
    public static int[] field2811 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!t", name = "Ab", descriptor = "La;")
    public static class1 field2815 = class113.method934(-11538, " Sekunde(Xn(Y -Ubertragen)3");

    @OriginalMember(owner = "client!t", name = "zb", descriptor = "I")
    public static int field2814 = 0;

    @OriginalMember(owner = "client!t", name = "Bb", descriptor = "I")
    public static int field2816 = 0;

    @OriginalMember(owner = "client!t", name = "xb", descriptor = "I")
    public static int field2812 = 0;

    @OriginalMember(owner = "client!t", name = "Hb", descriptor = "[I")
    public static int[] field2822 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!t", name = "Gb", descriptor = "La;")
    public static class1 field2821 = class113.method934(-11538, "sideicons");

    @OriginalMember(owner = "client!t", name = "Db", descriptor = "Z")
    public static boolean field2818 = false;

    @OriginalMember(owner = "client!t", name = "Jb", descriptor = "La;")
    private static class1 field2824 = class113.method934(-11538, "Friends");

    @OriginalMember(owner = "client!t", name = "Lb", descriptor = "La;")
    private static class1 field2826 = class113.method934(-11538, "Examine");

    @OriginalMember(owner = "client!t", name = "Fb", descriptor = "La;")
    public static class1 field2820 = field2824;

    @OriginalMember(owner = "client!t", name = "Mb", descriptor = "La;")
    public static class1 field2827 = class113.method934(-11538, "Ihr Charakter)2Profil wird in:");

    @OriginalMember(owner = "client!t", name = "Kb", descriptor = "I")
    public static int field2825 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!t", name = "tb", descriptor = "La;")
    public static class1 field2808 = field2826;

    @OriginalMember(owner = "client!t", name = "Cb", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!t", name = "Eb", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!t", name = "Ib", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!t", name = "yb", descriptor = "Lbd;")
    public static class11 field2813;

    @OriginalMember(owner = "client!t", name = "ub", descriptor = "Le;")
    public static class25 field2809;

    @OriginalMember(owner = "client!t", name = "vb", descriptor = "[Le;")
    public static class25[] field2810;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "(I)V", line = 21)
    public static void method938(int arg0) {
        field2826 = null;
        field2809 = null;
        field2824 = null;
        field2810 = null;
        field2811 = null;
        int var1 = -41 % ((32 - arg0) / 40);
        field2821 = null;
        field2807 = null;
        field2813 = null;
        field2822 = null;
        field2827 = null;
        field2820 = null;
        field2815 = null;
        field2808 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(BI)Z", line = 51)
    public static final boolean method939(byte arg0, int arg1) {
        field2817++;
        if (arg1 >= 97 && arg1 <= 122) {
            return true;
        } else if (arg1 >= 65 && arg1 <= 90) {
            return true;
        } else if (arg1 >= 48 && arg1 <= 57) {
            return true;
        } else {
            if (arg0 != -37) {
                method938(31);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ZLnb;)V", line = 75)
    public static final void method940(boolean arg0, class80 arg1) {
        field2823++;
        arg1.field1982 = false;
        if (arg1.field1954 != -1) {
            class47 var2 = class4.method104(arg1.field1954, 2);
            if (var2 == null || var2.field1244 == null) {
                arg1.field1954 = -1;
            } else {
                arg1.field1997++;
                if (arg1.field1993 < var2.field1244.length && var2.field1225[arg1.field1993] < arg1.field1997) {
                    arg1.field1993++;
                    arg1.field1997 = 1;
                }
                if (var2.field1244.length <= arg1.field1993) {
                    arg1.field1993 = 0;
                    arg1.field1997 = 0;
                }
            }
        }
        if (arg1.field1968 != -1 && arg1.field1970 <= class82.field2066) {
            if (arg1.field2017 < 0) {
                arg1.field2017 = 0;
            }
            int var3 = class78.method716(arg1.field1968, 13).field787;
            if (var3 == -1) {
                arg1.field1968 = -1;
            } else {
                class47 var4 = class4.method104(var3, 2);
                if (var4 == null || var4.field1244 == null) {
                    arg1.field1968 = -1;
                } else {
                    arg1.field2006++;
                    if (var4.field1244.length > arg1.field2017 && arg1.field2006 > var4.field1225[arg1.field2017]) {
                        arg1.field2006 = 1;
                        arg1.field2017++;
                    }
                    if (var4.field1244.length <= arg1.field2017 && (arg1.field2017 < 0 || var4.field1244.length <= arg1.field2017)) {
                        arg1.field1968 = -1;
                    }
                }
            }
        }
        if (!arg0) {
            return;
        }
        if (arg1.field2018 != -1 && arg1.field1999 <= 1) {
            class47 var5 = class4.method104(arg1.field2018, 2);
            if (var5.field1229 == 1 && arg1.field1971 > 0 && arg1.field1989 <= class82.field2066 && arg1.field1984 < class82.field2066) {
                arg1.field1999 = 1;
                return;
            }
        }
        if (arg1.field2018 != -1 && arg1.field1999 == 0) {
            class47 var6 = class4.method104(arg1.field2018, 2);
            if (var6 == null || var6.field1244 == null) {
                arg1.field2018 = -1;
            } else {
                arg1.field1992++;
                if (var6.field1244.length > arg1.field1981 && var6.field1225[arg1.field1981] < arg1.field1992) {
                    arg1.field1981++;
                    arg1.field1992 = 1;
                }
                if (var6.field1244.length <= arg1.field1981) {
                    arg1.field1981 -= var6.field1256;
                    arg1.field1972++;
                    if (var6.field1254 <= arg1.field1972) {
                        arg1.field2018 = -1;
                    }
                    if (arg1.field1981 < 0 || arg1.field1981 >= var6.field1244.length) {
                        arg1.field2018 = -1;
                    }
                }
                arg1.field1982 = var6.field1255;
            }
        }
        if (arg1.field1999 > 0) {
            arg1.field1999--;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II)Z", line = 229)
    public final boolean method941(int arg0, int arg1) {
        int var3 = 104 % ((58 - arg1) / 61);
        field2819++;
        return this.field2828[arg0].field2126;
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lbd;Lbd;IZ)V", line = 276)
    public class114(class11 arg0, class11 arg1, int arg2, boolean arg3) {
        class92 var5 = new class92();
        int var6 = arg0.method236(arg2, (byte) 16);
        this.field2828 = new class84[var6];
        int[] var7 = arg0.method238(arg2, true);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method218(var7[var8], 111, arg2);
            class127 var10 = null;
            int var11 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
            for (class127 var12 = (class127) var5.method805((byte) -90); var12 != null; var12 = (class127) var5.method812(-4)) {
                if (var12.field3117 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method228(var11, -122, 0);
                } else {
                    var13 = arg1.method228(0, -16, var11);
                }
                var10 = new class127(var11, var13);
                var5.method807(var10, 60);
            }
            this.field2828[var7[var8]] = new class84(var9, var10);
        }
    }
}
