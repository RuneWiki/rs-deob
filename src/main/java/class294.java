import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class294 extends class137 {

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "Lbm;")
    public class281 field5013;

    @OriginalMember(owner = "client!qa", name = "y", descriptor = "[Ltl;")
    public static class59[] field5015 = new class59[500];

    @OriginalMember(owner = "client!qa", name = "F", descriptor = "Ltl;")
    public static class59 field5021 = class85.method639("<br>(X100(U(Y", 9588);

    @OriginalMember(owner = "client!qa", name = "D", descriptor = "Ltl;")
    public static class59 field5019 = class85.method639(" (X", 9588);

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "I")
    public static int field5018 = 0;

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "I")
    public static int field5012;

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "I")
    public static int field5014;

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "I")
    public static int field5016;

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "I")
    public static int field5017;

    @OriginalMember(owner = "client!qa", name = "E", descriptor = "I")
    public static int field5020;

    @OriginalMember(owner = "client!qa", name = "H", descriptor = "I")
    public static int field5022;

    @OriginalMember(owner = "client!qa", name = "I", descriptor = "I")
    public static int field5023;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "(I)V", line = 4)
    public static void method2026(int arg0) {
        field5021 = null;
        field5015 = null;
        field5019 = null;
        if (arg0 != -1) {
            method2031(82, 31, 113, 65, 26);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)V", line = 24)
    public static final void method2027(int arg0, int arg1) {
        field5014++;
        class132.method966(arg1 ^ 0x74);
        class223.method1541(-83);
        int var2 = class65.method540(arg0, (byte) 123).field2293;
        if (var2 == 0) {
            return;
        }
        int var3 = class116.field1915[arg0];
        if (~var2 == arg1) {
            class197.field3252 = var3;
        }
        if (var2 == 5) {
            class281.field4842 = var3;
        }
        if (var2 == 6) {
            class50.field765 = var3;
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(ZLma;)V", line = 66)
    public static final void method2028(boolean arg0, class263 arg1) {
        field5022++;
        int var2 = arg1.field4472;
        if (var2 == 324) {
            if (class229.field3737 == -1) {
                class125.field2071 = arg1.field4522;
                class229.field3737 = arg1.field4408;
            }
            if (class40.field601.field3103) {
                arg1.field4408 = class229.field3737;
            } else {
                arg1.field4408 = class125.field2071;
            }
        } else if (var2 == 325) {
            if (class229.field3737 == -1) {
                class125.field2071 = arg1.field4522;
                class229.field3737 = arg1.field4408;
            }
            if (class40.field601.field3103) {
                arg1.field4408 = class125.field2071;
            } else {
                arg1.field4408 = class229.field3737;
            }
        } else if (var2 == 327) {
            arg1.field4393 = 150;
            arg1.field4426 = (int) (Math.sin((double) class30.field420 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field4438 = -1;
            arg1.field4412 = 5;
        } else {
            if (arg0) {
                field5019 = (class59) null;
            }
            if (var2 == 328) {
                if (class286.field4920.field1663 == null) {
                    arg1.field4438 = 0;
                } else {
                    arg1.field4393 = 150;
                    arg1.field4426 = (int) (Math.sin((double) class30.field420 / 40.0D) * 256.0D) & 0x7FF;
                    arg1.field4412 = 5;
                    arg1.field4438 = ((int) class286.field4920.field1663.method488((byte) 124) << 11) + 2047;
                    arg1.field4431 = class286.field4920.field1746;
                    arg1.field4457 = class286.field4920.field1767;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ltl;I)I", line = 149)
    public static final int method2029(class59 arg0, int arg1) {
        int var2 = 81 % ((arg1 + 2) / 55);
        field5016++;
        if (arg0 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < class293.field5001; var3++) {
            if (arg0.method472(class88.field1380[var3], 90)) {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IZIIZII)V", line = 173)
    public static final void method2030(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field5020++;
        int var7 = -73 % ((36 - arg0) / 46);
        if (arg2 <= arg3) {
            return;
        }
        int var8 = (arg3 + arg2) / 2;
        int var9 = arg3;
        class231 var10 = class53.field782[var8];
        class53.field782[var8] = class53.field782[arg2];
        class53.field782[arg2] = var10;
        for (int var11 = arg3; var11 < arg2; var11++) {
            if (class283.method1984(arg6, 100, class53.field782[var11], var10, arg5, arg1, arg4) <= 0) {
                class231 var12 = class53.field782[var11];
                class53.field782[var11] = class53.field782[var9];
                class53.field782[var9++] = var12;
            }
        }
        class53.field782[arg2] = class53.field782[var9];
        class53.field782[var9] = var10;
        method2030(-47, arg1, var9 - 1, arg3, arg4, arg5, arg6);
        method2030(117, arg1, arg2, var9 + 1, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Lbm;)V", line = 225)
    public class294(class281 arg0) {
        this.field5013 = arg0;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIII)V", line = 246)
    public static final void method2031(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5012++;
        int var5 = 0;
        int var6 = arg2;
        int var7 = -arg2;
        int var8 = -1;
        int var9 = class262.method1808(arg1 + arg2, class69.field1061, 0, class153.field2504);
        int var10 = class262.method1808(arg1 - arg2, class69.field1061, 0, class153.field2504);
        class174.method1283(7, arg4, class163.field2662[arg0], var10, var9);
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                int var11 = arg0 + var6;
                int var12 = arg0 - var6;
                var7 -= var6 << 1;
                if (class28.field369 <= var11 && class62.field957 >= var12) {
                    int var13 = class262.method1808(arg1 + var5, class69.field1061, 0, class153.field2504);
                    int var14 = class262.method1808(arg1 - var5, class69.field1061, 0, class153.field2504);
                    if (class62.field957 >= var11) {
                        class174.method1283(7, arg4, class163.field2662[var11], var14, var13);
                    }
                    if (class28.field369 <= var12) {
                        class174.method1283(7, arg4, class163.field2662[var12], var14, var13);
                    }
                }
            }
            var5++;
            int var15 = arg0 - var5;
            int var16 = arg0 + var5;
            if (var16 >= class28.field369 && var15 <= class62.field957) {
                int var17 = class262.method1808(arg1 + var6, class69.field1061, 0, class153.field2504);
                int var18 = class262.method1808(arg1 - var6, class69.field1061, 0, class153.field2504);
                if (class62.field957 >= var16) {
                    class174.method1283(7, arg4, class163.field2662[var16], var18, var17);
                }
                if (class28.field369 <= var15) {
                    class174.method1283(7, arg4, class163.field2662[var15], var18, var17);
                }
            }
        }
        if (arg3 < 23) {
            field5015 = (class59[]) null;
        }
    }
}
