import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kga")
public class class545 {

    @OriginalMember(owner = "client!kga", name = "d", descriptor = "Z")
    public static boolean field7514 = false;

    @OriginalMember(owner = "client!kga", name = "c", descriptor = "Lks;")
    public static class440 field7513;

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "Lks;")
    public static class440 field7511 = field7513 = new class440(false);

    @OriginalMember(owner = "client!kga", name = "e", descriptor = "Lria;")
    public static class287 field7515 = new class287();

    @OriginalMember(owner = "client!kga", name = "f", descriptor = "Loaa;")
    public static class290 field7516 = new class290(11, 0, 1, 2);

    @OriginalMember(owner = "client!kga", name = "g", descriptor = "[Z")
    public static boolean[] field7517 = new boolean[8];

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "I")
    public static int field7512;

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(Z)V", line = 5)
    public static void method3148(boolean arg0) {
        field7515 = null;
        field7511 = null;
        field7513 = null;
        field7517 = null;
        if (!arg0) {
            field7515 = null;
        }
        field7516 = null;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIBLkda;I)V", line = 23)
    public static final void method3149(int arg0, int arg1, byte arg2, class390 arg3, int arg4) {
        if (arg2 < 60) {
            method3148(true);
        }
        field7512++;
        class399 var5 = arg3.method2445((byte) 72);
        int var6 = arg3.field5708 - arg3.field5643.field3338 & 0x3FFF;
        if (arg0 == -1) {
            if (var6 != 0 || arg3.field5673 > 25) {
                if (arg1 < 0 && var5.field5860 != -1) {
                    arg3.field5639 = false;
                    arg3.field5694 = var5.field5860;
                } else if (arg1 <= 0 || var5.field5866 == -1) {
                    arg3.field5694 = var5.field5895;
                } else {
                    arg3.field5694 = var5.field5866;
                }
                arg3.field5639 = false;
            } else if (!arg3.field5639 || !var5.method2500(arg3.field5694, -118)) {
                arg3.field5694 = var5.method2498((byte) 37);
                arg3.field5639 = arg3.field5694 != -1;
            }
        } else if (arg3.field5701 != -1 && var6 >= 10240 || var6 <= 2048) {
            int var7 = class456.field6432[arg4] - arg3.field5643.field3338 & 0x3FFF;
            if (arg0 == 2 && var5.field5863 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field5893 != -1) {
                    arg3.field5694 = var5.field5893;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field5858 != -1) {
                    arg3.field5694 = var5.field5858;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field5864 == -1) {
                    arg3.field5694 = var5.field5863;
                } else {
                    arg3.field5694 = var5.field5864;
                }
            } else if (arg0 == 0 && var5.field5884 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field5891 != -1) {
                    arg3.field5694 = var5.field5891;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field5902 != -1) {
                    arg3.field5694 = var5.field5902;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field5868 == -1) {
                    arg3.field5694 = var5.field5884;
                } else {
                    arg3.field5694 = var5.field5868;
                }
            } else if (var7 > 2048 && var7 <= 6144 && var5.field5898 != -1) {
                arg3.field5694 = var5.field5898;
            } else if (var7 >= 10240 && var7 < 14336 && var5.field5881 != -1) {
                arg3.field5694 = var5.field5881;
            } else if (var7 <= 6144 || var7 >= 10240 || var5.field5882 == -1) {
                arg3.field5694 = var5.field5895;
            } else {
                arg3.field5694 = var5.field5882;
            }
            arg3.field5639 = false;
        } else if (var6 == 0 && arg3.field5673 <= 25) {
            if (arg0 == 2 && var5.field5863 != -1) {
                arg3.field5694 = var5.field5863;
            } else if (arg0 == 0 && var5.field5884 != -1) {
                arg3.field5694 = var5.field5884;
            } else {
                arg3.field5694 = var5.field5895;
            }
            arg3.field5639 = false;
        } else {
            if (arg0 == 2 && var5.field5863 != -1) {
                if (arg1 < 0 && var5.field5849 != -1) {
                    arg3.field5694 = var5.field5849;
                } else if (arg1 <= 0 || var5.field5855 == -1) {
                    arg3.field5694 = var5.field5863;
                } else {
                    arg3.field5694 = var5.field5855;
                }
            } else if (arg0 == 0 && var5.field5884 != -1) {
                if (arg1 < 0 && var5.field5852 != -1) {
                    arg3.field5694 = var5.field5852;
                } else if (arg1 <= 0 || var5.field5871 == -1) {
                    arg3.field5694 = var5.field5884;
                } else {
                    arg3.field5694 = var5.field5871;
                }
            } else if (arg1 < 0 && var5.field5878 != -1) {
                arg3.field5694 = var5.field5878;
            } else if (arg1 <= 0 || var5.field5897 == -1) {
                arg3.field5694 = var5.field5895;
            } else {
                arg3.field5694 = var5.field5897;
            }
            arg3.field5639 = false;
        }
    }
}
