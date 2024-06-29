import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class62 {

    @OriginalMember(owner = "client!rv", name = "g", descriptor = "[I")
    private int[] field840;

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "[Lrj;")
    public static class747[] field836 = new class747[14];

    @OriginalMember(owner = "client!rv", name = "f", descriptor = "Lsea;")
    public static class399 field839 = new class399();

    @OriginalMember(owner = "client!rv", name = "h", descriptor = "Lmq;")
    public static class78 field841 = new class78(25, -1);

    @OriginalMember(owner = "client!rv", name = "j", descriptor = "I")
    public static int field843 = -2;

    @OriginalMember(owner = "client!rv", name = "i", descriptor = "Lus;")
    public static class328 field842 = new class328(65, 3);

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!rv", name = "d", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!rv", name = "e", descriptor = "I")
    public static int field838;

    // $FF: synthetic field
    @OriginalMember(owner = "client!rv", name = "k", descriptor = "Ljava/lang/Class;")
    public static Class field844;

    // $FF: synthetic method
    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method483(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Llea;I)I", line = 4)
    public static final int method478(class546 arg0, int arg1) {
        field838++;
        int var2 = arg0.field7659;
        class459 var3 = arg0.method249(arg1 ^ 0x5B);
        if (arg0.field332 == arg1 || arg0.field313) {
            var2 = arg0.field7693;
        } else if (arg0.field332 == var3.field6425 || arg0.field332 == var3.field6459 || arg0.field332 == var3.field6418 || arg0.field332 == var3.field6430) {
            var2 = arg0.field7701;
        } else if (arg0.field332 == var3.field6447 || arg0.field332 == var3.field6463 || arg0.field332 == var3.field6450 || arg0.field332 == var3.field6415) {
            var2 = arg0.field7657;
        }
        return var2;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(ILqb;)V", line = 30)
    public static final void method479(int arg0, class63 arg1) {
        field837++;
        if (class495.field7002 == null) {
            return;
        }
        class559 var2 = null;
        if (arg1.field846 == 0) {
            var2 = (class559) class548.method3123(arg1.field857, arg1.field856, arg1.field848);
        }
        if (arg1.field846 == 1) {
            var2 = (class559) class457.method2676(arg1.field857, arg1.field856, arg1.field848);
        }
        if (arg1.field846 == 2) {
            var2 = (class559) class730.method4079(arg1.field857, arg1.field856, arg1.field848, field844 == null ? (field844 = method483("op")) : field844);
        }
        if (arg1.field846 == 3) {
            var2 = (class559) class315.method1848(arg1.field857, arg1.field856, arg1.field848);
        }
        if (arg0 >= -124) {
            return;
        }
        if (var2 == null) {
            arg1.field859 = 0;
            arg1.field853 = -1;
            arg1.field858 = 0;
        } else {
            arg1.field853 = var2.method735(24123);
            arg1.field858 = var2.method741(81);
            arg1.field859 = var2.method731(-78);
        }
    }

    @OriginalMember(owner = "client!rv", name = "<init>", descriptor = "([I)V", line = 80)
    public class62(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= arg0.length + (arg0.length >> 1); var2 <<= 0x1) {
        }
        this.field840 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field840[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field840[var5 - (-var5 - 1)] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field840[var5 + var5] = arg0[var4];
            this.field840[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(III)I", line = 115)
    public static final int method480(int arg0, int arg1, int arg2) {
        field835++;
        int var3 = arg1;
        while (arg2 > 0) {
            var3 = arg0 & 0x1 | var3 << 1;
            arg2--;
            arg0 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(B)V", line = 132)
    public static void method481(byte arg0) {
        if (arg0 != 74) {
            field836 = null;
        }
        field841 = null;
        field842 = null;
        field839 = null;
        field836 = null;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IB)I", line = 151)
    public final int method482(int arg0, byte arg1) {
        field834++;
        int var3 = (this.field840.length >> 1) - 1;
        int var4 = 42 / ((47 - arg1) / 63);
        int var5 = arg0 & var3;
        while (true) {
            int var6 = this.field840[var5 + var5 + 1];
            if (var6 == -1) {
                return -1;
            }
            if (this.field840[var5 + var5] == arg0) {
                return var6;
            }
            var5 = var3 & var5 + 1;
        }
    }
}
