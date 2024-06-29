import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class666 {

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public int field9362;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "Lvh;")
    public static class125 field9359 = new class125(46, -1);

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "Ljda;")
    public static class77 field9361 = new class77("", 10);

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field9358;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field9360;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
    public static int field9363;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "I")
    public static int field9364;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
    public static int field9365;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "I")
    public static int field9366;

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "Llq;")
    public static class292 field9367;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "[I")
    public static int[] field9357;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "([III[ILnh;I)Ljg;", line = 6)
    public static final class685 method3750(int[] arg0, int arg1, int arg2, int[] arg3, class495 arg4, int arg5) {
        int var6 = -14 % ((-arg5 - 49) / 44);
        field9358++;
        if (!arg4.method91(class665.field9353, 16674, class689.field9771)) {
            int[] var7 = new int[arg1 * arg2];
            for (int var8 = 0; var8 < arg1; var8++) {
                int var9 = arg2 * var8 + arg0[var8];
                for (int var10 = 0; var10 < arg3[var8]; var10++) {
                    var7[var9++] = -16777216;
                }
            }
            return new class685(arg4, arg2, arg1, var7);
        }
        byte[] var11 = new byte[arg1 * arg2];
        for (int var12 = 0; var12 < arg1; var12++) {
            int var13 = arg2 * var12 + arg0[var12];
            for (int var14 = 0; var14 < arg3[var12]; var14++) {
                var11[var13++] = -1;
            }
        }
        return new class685(arg4, arg2, arg1, var11);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V", line = 62)
    public static final void method3751(int arg0) {
        if (arg0 == 0) {
            if (class34.field487 == 2) {
                class355.field4980[0].method1309(class254.field3674[0]);
                class355.field4980[1].method1309(class254.field3674[1]);
            } else if (class34.field487 == 3) {
                class355.field4980[0].method1309(class254.field3674[0]);
                class355.field4980[1].method1309(class254.field3674[1]);
                class355.field4980[2].method1309(class254.field3674[2]);
            } else {
                class355.field4980[0].method1309(class254.field3674[0]);
                class355.field4980[1].method1309(class254.field3674[1]);
                class355.field4980[2].method1309(class254.field3674[2]);
                class355.field4980[3].method1309(class254.field3674[3]);
            }
        } else if (arg0 == 1) {
            if (class34.field487 == 2) {
                class355.field4980[0].method1309(class254.field3674[2]);
            } else if (class34.field487 == 3) {
                class355.field4980[0].method1309(class254.field3674[3]);
                class355.field4980[1].method1309(class254.field3674[4]);
            } else {
                class355.field4980[0].method1309(class254.field3674[4]);
                class355.field4980[1].method1309(class254.field3674[5]);
                class355.field4980[2].method1309(class254.field3674[6]);
            }
        } else if (arg0 == 2) {
            if (class34.field487 == 2) {
                class355.field4980[0].method1309(class254.field3674[3]);
                return;
            }
            if (class34.field487 == 3) {
                class355.field4980[0].method1309(class254.field3674[5]);
                return;
            }
            class355.field4980[0].method1309(class254.field3674[7]);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IILis;)I", line = 132)
    public static final int method3752(int arg0, int arg1, class101 arg2) {
        if (arg0 != -2949) {
            return 112;
        }
        field9364++;
        if (!client.method707(arg2).method1954(arg1, true) && arg2.field1648 == null) {
            return -1;
        } else if (arg2.field1501 == null || arg1 >= arg2.field1501.length) {
            return -1;
        } else {
            return arg2.field1501[arg1];
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "([Lvj;II)V", line = 149)
    public static final void method3753(class204[] arg0, int arg1, int arg2) {
        if (arg1 >= arg2) {
            return;
        }
        int var3 = (arg1 + arg2) / 2;
        int var4 = arg1;
        class204 var5 = arg0[var3];
        arg0[var3] = arg0[arg2];
        arg0[arg2] = var5;
        int var6 = var5.field3164;
        for (int var7 = arg1; var7 < arg2; var7++) {
            if (arg0[var7].field3164 < (var7 & 0x1) + var6) {
                class204 var8 = arg0[var7];
                arg0[var7] = arg0[var4];
                arg0[var4++] = var8;
            }
        }
        arg0[arg2] = arg0[var4];
        arg0[var4] = var5;
        method3753(arg0, arg1, var4 - 1);
        method3753(arg0, var4 + 1, arg2);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)Z", line = 190)
    public static final boolean method3754(int arg0, int arg1, int arg2) {
        field9365++;
        if (!class324.field4519) {
            return false;
        } else if (arg1 == 1009) {
            int var3 = arg2 >> 16;
            int var4 = arg2 & 0xFFFF;
            if (class265.field3806[var3] == null || class265.field3806[var3][var4] == null) {
                return false;
            }
            class101 var5 = class265.field3806[var3][var4];
            if (arg0 == -1 && var5.field1584 == 0) {
                for (class673 var6 = (class673) class150.field2533.method3905(arg1 - 1129); var6 != null; var6 = (class673) class150.field2533.method3899(arg1 ^ 0x3F1)) {
                    if (var6.field9544 == 10 || var6.field9544 == 1009 || var6.field9544 == 23 || var6.field9544 == 13 || var6.field9544 == 44) {
                        for (class101 var7 = class271.method1711(var6.field9551, arg1 + 22718); var7 != null; var7 = class210.method1444(0, var7)) {
                            if (var5.field1577 == var7.field1577) {
                                return true;
                            }
                        }
                    }
                }
            } else {
                for (class673 var8 = (class673) class150.field2533.method3905(arg1 ^ 0xFFFFFC65); var8 != null; var8 = (class673) class150.field2533.method3899(0)) {
                    if (var8.field9540 == arg0 && var5.field1577 == var8.field9551 && (var8.field9544 == 10 || var8.field9544 == 1009 || var8.field9544 == 23 || var8.field9544 == 13 || var8.field9544 == 44)) {
                        return true;
                    }
                }
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jb", name = "toString", descriptor = "()Ljava/lang/String;", line = 263)
    public final String toString() {
        field9360++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V", line = 282)
    public static void method3755(int arg0) {
        field9359 = null;
        if (arg0 != 1) {
            method3754(120, -120, -44);
        }
        field9367 = null;
        field9357 = null;
        field9361 = null;
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(I)V", line = 294)
    public class666(int arg0) {
        this.field9362 = arg0;
    }
}
