import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class139 {

    @OriginalMember(owner = "client!o", name = "d", descriptor = "Z")
    public static boolean field2674 = true;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "[I")
    public static int[] field2672 = new int[5];

    @OriginalMember(owner = "client!o", name = "e", descriptor = "Lob;")
    public static class141 field2675 = class175.method1195(40, "Abbrechen");

    @OriginalMember(owner = "client!o", name = "a", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "[I")
    public static int[] field2676;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lpe;ILpe;Lpe;Lpe;)V")
    public static final void method891(class154 arg0, int arg1, class154 arg2, class154 arg3, class154 arg4) {
        if (arg1 != 0) {
            method895(100, -46, -104, 19, 82, -73);
        }
        class185.field3605 = arg0;
        class162.field3134 = arg2;
        class168.field3234 = arg3;
        field2678++;
        class206.field3930 = arg4;
        class224.field4232 = new class170[class168.field3234.method1063(-3853)][];
        class69.field1363 = new boolean[class168.field3234.method1063(-3853)];
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILud;)V")
    public static final void method892(int arg0, class203 arg1) {
        arg1.field3876 = false;
        field2677++;
        if (arg1.field3828 != -1) {
            class26 var2 = class114.method736(arg0 + 15620, arg1.field3828);
            if (var2 == null || var2.field499 == null) {
                arg1.field3828 = -1;
            } else {
                arg1.field3873++;
                if (var2.field499.length > arg1.field3887 && arg1.field3873 > var2.field496[arg1.field3887]) {
                    arg1.field3873 = 1;
                    arg1.field3887++;
                    class9.method60(arg1.field3889, var2, false, arg1.field3887, class114.field2176 == arg1, arg1.field3854);
                }
                if (arg1.field3887 >= var2.field499.length) {
                    arg1.field3873 = 0;
                    arg1.field3887 = 0;
                    class9.method60(arg1.field3889, var2, false, arg1.field3887, class114.field2176 == arg1, arg1.field3854);
                }
            }
        }
        if (arg1.field3827 != -1 && arg1.field3894 <= class20.field344) {
            if (arg1.field3883 < 0) {
                arg1.field3883 = 0;
            }
            int var3 = class111.method730(arg1.field3827, arg0 - 51).field2049;
            if (var3 == -1) {
                arg1.field3827 = -1;
            } else {
                class26 var4 = class114.method736(15619, var3);
                if (var4 == null || var4.field499 == null) {
                    arg1.field3827 = -1;
                } else {
                    arg1.field3838++;
                    if (arg1.field3883 < var4.field499.length && var4.field496[arg1.field3883] < arg1.field3838) {
                        arg1.field3883++;
                        arg1.field3838 = 1;
                        class9.method60(arg1.field3889, var4, false, arg1.field3883, class114.field2176 == arg1, arg1.field3854);
                    }
                    if (arg1.field3883 >= var4.field499.length) {
                        arg1.field3827 = -1;
                    }
                }
            }
        }
        if (arg1.field3851 != -1 && arg1.field3861 <= 1) {
            class26 var5 = class114.method736(15619, arg1.field3851);
            if (var5.field495 == 1 && arg1.field3893 > 0 && arg1.field3843 <= class20.field344 && class20.field344 > arg1.field3881) {
                arg1.field3861 = 1;
                return;
            }
        }
        if (arg1.field3851 != -1 && arg1.field3861 == 0) {
            class26 var6 = class114.method736(15619, arg1.field3851);
            if (var6 == null || var6.field499 == null) {
                arg1.field3851 = -1;
            } else {
                arg1.field3841++;
                if (var6.field499.length > arg1.field3875 && arg1.field3841 > var6.field496[arg1.field3875]) {
                    arg1.field3841 = 1;
                    arg1.field3875++;
                    class9.method60(arg1.field3889, var6, false, arg1.field3875, class114.field2176 == arg1, arg1.field3854);
                }
                if (var6.field499.length <= arg1.field3875) {
                    arg1.field3875 -= var6.field494;
                    arg1.field3862++;
                    if (var6.field504 <= arg1.field3862) {
                        arg1.field3851 = -1;
                    } else if (arg1.field3875 >= 0 && var6.field499.length > arg1.field3875) {
                        class9.method60(arg1.field3889, var6, false, arg1.field3875, class114.field2176 == arg1, arg1.field3854);
                    } else {
                        arg1.field3851 = -1;
                    }
                }
                arg1.field3876 = var6.field502;
            }
        }
        if (arg0 > ~arg1.field3861) {
            arg1.field3861--;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V")
    public static void method893(byte arg0) {
        field2672 = null;
        field2676 = null;
        field2675 = null;
        if (arg0 != 72) {
            field2675 = null;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)V")
    public static final void method894(boolean arg0) {
        if (arg0) {
            method892(-94, null);
        }
        field2671++;
        class76.field1541.method1385(9946);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIII)V")
    public static final void method895(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 != 4243) {
            method892(-49, null);
        }
        int var9 = arg0 + 1;
        class180.method1217(arg1, (byte) 52, arg5, arg4, class41.field805[arg0]);
        int var10 = arg2 - 1;
        class180.method1217(arg1, (byte) 52, arg5, arg4, class41.field805[arg2]);
        field2673++;
        for (int var6 = var9; var6 <= var10; var6++) {
            int[] var7 = class41.field805[var6];
            var7[arg5] = var7[arg1] = arg4;
        }
    }
}
