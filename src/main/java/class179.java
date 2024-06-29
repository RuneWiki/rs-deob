import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class179 extends class35 {

    @OriginalMember(owner = "client!ki", name = "x", descriptor = "Ljava/lang/String;")
    public String field2880;

    @OriginalMember(owner = "client!ki", name = "r", descriptor = "Lkl;")
    public static class68 field2874 = null;

    @OriginalMember(owner = "client!ki", name = "p", descriptor = "Ljava/lang/String;")
    public static String field2872 = "shake:";

    @OriginalMember(owner = "client!ki", name = "v", descriptor = "Ljava/lang/String;")
    public static String field2878 = "flash3:";

    @OriginalMember(owner = "client!ki", name = "y", descriptor = "Lab;")
    public static class279 field2881 = new class279(20);

    @OriginalMember(owner = "client!ki", name = "o", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!ki", name = "q", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!ki", name = "s", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!ki", name = "t", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!ki", name = "u", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!ki", name = "w", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(Z)V", line = 10)
    public static void method1124(boolean arg0) {
        field2874 = null;
        field2878 = null;
        if (!arg0) {
            field2874 = (class68) null;
        }
        field2872 = null;
        field2881 = null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(BII[Ljava/lang/String;)Ljava/lang/String;", line = 25)
    public static final String method1125(byte arg0, int arg1, int arg2, String[] arg3) {
        field2877++;
        if (arg1 == 0) {
            return "";
        } else if (arg1 == 1) {
            String var11 = arg3[arg2];
            return var11 == null ? "null" : var11.toString();
        } else {
            int var4 = arg1 + arg2;
            if (arg0 > -49) {
                return (String) null;
            }
            int var5 = 0;
            for (int var6 = arg2; var6 < var4; var6++) {
                String var7 = arg3[var6];
                if (var7 == null) {
                    var5 += 4;
                } else {
                    var5 += var7.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var5);
            for (int var9 = arg2; var9 < var4; var9++) {
                String var10 = arg3[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z[Lfd;Lbm;)V", line = 87)
    public static final void method1126(boolean arg0, class206[] arg1, class307 arg2) {
        class106.field1834 = arg1;
        field2873++;
        class45.field937 = arg2;
        class18.field326 = new boolean[class106.field1834.length];
        class50.field1013.method302((byte) 124);
        int var3 = class45.field937.method2052("details", arg0);
        int[] var4 = class45.field937.method2055(var3, 0);
        for (int var5 = 0; var5 < var4.length; var5++) {
            class50.field1013.method310((long) var4[var5], class64.method490(var4[var5], new class202(class45.field937.method2036(var3, var4[var5], (byte) 62)), 22953), 25357);
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(ZI)Lra;", line = 111)
    public static final class177 method1127(boolean arg0, int arg1) {
        field2875++;
        class177 var2 = (class177) class213.field3422.method1881(true, (long) arg1);
        if (arg0) {
            method1124(false);
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class335.field5144.method2036(1, arg1, (byte) 64);
        class177 var4 = new class177();
        if (var3 != null) {
            var4.method1113(arg1, false, new class202(var3));
        }
        class213.field3422.method1880(var4, (long) arg1, 67);
        return var4;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIIIIIIII)V", line = 141)
    public static final void method1128(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg1 != -6191) {
            field2878 = (String) null;
        }
        field2879++;
        if (arg7 == arg8 && arg0 == arg6 && arg2 == arg3 && arg4 == arg9) {
            class186.method1190(arg8, arg1 ^ 0x1869, arg2, arg5, arg0, arg9);
            return;
        }
        int var10 = arg0;
        int var11 = arg8;
        int var12 = arg0 * 3;
        int var13 = arg8 * 3;
        int var14 = arg6 * 3;
        int var15 = arg3 * 3;
        int var16 = arg7 * 3;
        int var17 = var13 + var15 - (var16 - -var16);
        int var18 = arg2 + var16 - var15 - arg8;
        int var19 = arg4 * 3;
        int var20 = var14 + arg9 - arg0 - var19;
        int var21 = var19 + var12 - var14 - var14;
        int var22 = var16 - var13;
        int var23 = var14 - var12;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var18 * var26;
            int var28 = var20 * var26;
            int var29 = var22 * var24;
            int var30 = var17 * var25;
            int var31 = var21 * var25;
            int var32 = var23 * var24;
            int var33 = arg0 + (var28 + var31 + var32 >> 12);
            int var34 = (var29 + var30 + var27 >> 12) + arg8;
            class186.method1190(var11, -118, var34, arg5, var10, var33);
            var11 = var34;
            var10 = var33;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIII)I", line = 221)
    public static final int method1129(int arg0, int arg1, int arg2, int arg3) {
        field2876++;
        int var4 = arg2 & 0x3;
        int var5 = -2 % ((arg0 - 9) / 54);
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 1023 - arg3;
        } else if (var4 == 2) {
            return 1023 - arg1;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIZ)I", line = 246)
    public static final int method1130(int arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg1 & 0x3;
        field2871++;
        if (arg3) {
            return 4;
        } else if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return 7 - arg0;
        }
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "()V", line = 267)
    public class179() {
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 269)
    public class179(String arg0) {
        this.field2880 = arg0;
    }
}
