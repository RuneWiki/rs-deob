import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class178 extends class247 {

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
    public int field2789;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "I")
    public static int field2787 = 1;

    @OriginalMember(owner = "client!ka", name = "q", descriptor = "Ljava/lang/String;")
    public static String field2792 = " has logged out.";

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "[I")
    public static int[] field2793 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "Ljava/lang/String;")
    public static String field2791 = "Walk here";

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "Lfc;")
    public static class213 field2788;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(I)V")
    public static void method1262(int arg0) {
        field2793 = null;
        field2792 = null;
        field2788 = null;
        field2791 = null;
        if (arg0 > -61) {
            method1263(-45, 1, 54, -119, -18, -122);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIII)V")
    public static final void method1263(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 <= 48) {
            field2792 = null;
        }
        if (arg4 <= class60.field882 && class115.field1678 <= arg5) {
            boolean var6;
            if (arg1 < class56.field816) {
                var6 = false;
                arg1 = class56.field816;
            } else if (class187.field2938 >= arg1) {
                var6 = true;
            } else {
                var6 = false;
                arg1 = class187.field2938;
            }
            boolean var7;
            if (arg0 < class56.field816) {
                var7 = false;
                arg0 = class56.field816;
            } else if (class187.field2938 < arg0) {
                var7 = false;
                arg0 = class187.field2938;
            } else {
                var7 = true;
            }
            if (arg4 >= class115.field1678) {
                class16.method97(-7, class78.field1180[arg4++], arg0, arg3, arg1);
            } else {
                arg4 = class115.field1678;
            }
            if (arg5 > class60.field882) {
                arg5 = class60.field882;
            } else {
                class16.method97(-7, class78.field1180[arg5--], arg0, arg3, arg1);
            }
            if (var6 && var7) {
                for (int var8 = arg4; var8 <= arg5; var8++) {
                    int[] var9 = class78.field1180[var8];
                    var9[arg1] = var9[arg0] = arg3;
                }
            } else if (var6) {
                for (int var11 = arg4; var11 <= arg5; var11++) {
                    class78.field1180[var11][arg1] = arg3;
                }
            } else if (var7) {
                for (int var10 = arg4; var10 <= arg5; var10++) {
                    class78.field1180[var10][arg0] = arg3;
                }
            }
        }
        field2790++;
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
    public class178() {
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(JB)Ljava/lang/String;")
    public static final String method1264(long arg0, byte arg1) {
        field2794++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if ((arg0 % 37L) == 0L) {
            return null;
        } else {
            if (arg1 != 103) {
                field2787 = -106;
            }
            int var3 = 0;
            for (long var4 = arg0; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                char var9 = class38.field467[(int) (var7 - (arg0 * 37L))];
                if (var9 == '_') {
                    var9 = ' ';
                    int var10 = var6.length() - 1;
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(I)V")
    public class178(int arg0) {
        this.field2789 = arg0;
    }
}
