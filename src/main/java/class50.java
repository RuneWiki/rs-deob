import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class50 {

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public static int field581 = -1;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
    public static int field585 = 0;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "Ltt;")
    public static class338 field582 = new class338(31, -1);

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "[Lci;")
    public static class152[] field584;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILjava/io/File;)[B")
    public static final byte[] method264(int arg0, File arg1) {
        if (arg0 < 22) {
            method266(114, 10, 119);
        }
        field587++;
        return class166.method1020(arg1, false, (int) arg1.length());
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IILmk;III)V")
    public static final void method265(int arg0, int arg1, class502 arg2, int arg3, int arg4, int arg5) {
        field583++;
        if (arg2.field6894 == -1 && arg2.field6918 == null) {
            return;
        }
        int var6 = 0;
        if (arg1 > arg2.field6904) {
            var6 += arg1 - arg2.field6904;
        } else if (arg2.field6919 > arg1) {
            var6 += arg2.field6919 - arg1;
        }
        int var7 = class602.field8408.field4329 * arg2.field6914 >> 8;
        if (arg5 > arg2.field6891) {
            var6 += arg5 - arg2.field6891;
        } else if (arg5 < arg2.field6907) {
            var6 += arg2.field6907 - arg5;
        }
        if (arg2.field6902 == arg0 || arg2.field6902 < var6 - 256 || class602.field8408.field4329 == 0 || arg2.field6898 != arg3) {
            if (arg2.field6915 != null) {
                class126.field1759.method1345(arg2.field6915);
                arg2.field6915 = null;
                arg2.field6917 = null;
                arg2.field6910 = null;
            }
            if (arg2.field6893 != null) {
                class126.field1759.method1345(arg2.field6893);
                arg2.field6901 = null;
                arg2.field6899 = null;
                arg2.field6893 = null;
            }
            return;
        }
        var6 -= 256;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg2.field6902 - var6) * var7 / arg2.field6902;
        if (arg2.field6915 != null) {
            arg2.field6915.method3734(var8);
        } else if (arg2.field6894 >= 0) {
            if (arg2.field6922) {
                if (arg2.field6917 == null) {
                    arg2.field6917 = class577.method3185(class56.field728, arg2.field6894);
                }
                if (arg2.field6917 != null) {
                    if (arg2.field6910 == null) {
                        arg2.field6910 = arg2.field6917.method3188(new int[] { 22050 });
                    }
                    if (arg2.field6910 != null) {
                        class655 var12 = class655.method3722(arg2.field6910, 100, var8);
                        var12.method3727(-1);
                        class126.field1759.method1341(var12);
                        arg2.field6915 = var12;
                    }
                }
            } else {
                class486 var9 = class486.method2791(class3.field8, arg2.field6894, 0);
                if (var9 != null) {
                    class161 var10 = var9.method2792().method993(class383.field5057);
                    class655 var11 = class655.method3722(var10, 100, var8);
                    var11.method3727(-1);
                    class126.field1759.method1341(var11);
                    arg2.field6915 = var11;
                }
            }
        }
        if (arg2.field6893 != null) {
            arg2.field6893.method3734(var8);
            if (!arg2.field6893.method241(true)) {
                arg2.field6901 = null;
                arg2.field6899 = null;
                arg2.field6893 = null;
                return;
            }
            return;
        }
        if (arg2.field6918 == null || (arg2.field6913 -= arg4) > 0) {
            return;
        }
        if (!arg2.field6906) {
            int var15 = (int) (Math.random() * (double) arg2.field6918.length);
            class486 var16 = class486.method2791(class3.field8, arg2.field6918[var15], 0);
            if (var16 == null) {
                return;
            }
            class161 var17 = var16.method2792().method993(class383.field5057);
            class655 var18 = class655.method3722(var17, 100, var8);
            var18.method3727(0);
            class126.field1759.method1341(var18);
            arg2.field6893 = var18;
            arg2.field6913 = arg2.field6911 + ((int) (Math.random() * (double) (arg2.field6916 - arg2.field6911)));
            return;
        }
        if (arg2.field6899 == null) {
            int var13 = (int) ((double) arg2.field6918.length * Math.random());
            arg2.field6899 = class577.method3185(class56.field728, arg2.field6918[var13]);
        }
        if (arg2.field6899 == null) {
            return;
        }
        if (arg2.field6901 == null) {
            arg2.field6901 = arg2.field6899.method3188(new int[] { 22050 });
        }
        if (arg2.field6901 == null) {
            return;
        }
        class655 var14 = class655.method3722(arg2.field6901, 100, var8);
        var14.method3727(0);
        class126.field1759.method1341(var14);
        arg2.field6913 = (int) (Math.random() * (double) (arg2.field6916 - arg2.field6911)) + arg2.field6911;
        arg2.field6893 = var14;
        return;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(III)Llt;")
    public static final class271 method266(int arg0, int arg1, int arg2) {
        class207 var3 = class153.field2168[arg0][arg1][arg2];
        return var3 == null || var3.field2765 == null ? null : var3.field2765;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V")
    public static void method267(int arg0) {
        field584 = null;
        if (arg0 == -10463) {
            field582 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)I")
    public static int method268(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lio;I)Lob;")
    public static final class421 method269(class157 arg0, int arg1) {
        if (arg1 != -256) {
            field582 = null;
        }
        field586++;
        class689 var2 = class423.method2389(arg0, 1);
        int var3 = arg0.method908(false);
        int var4 = arg0.method908(false);
        return new class421(var2.field9726, var2.field9729, var2.field9731, var2.field9736, var2.field9733, var2.field9743, var2.field9744, var2.field9727, var2.field9740, var3, var4);
    }
}
