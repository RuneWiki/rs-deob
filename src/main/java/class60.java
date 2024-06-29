import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class60 {

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "Luf;")
    public static class168 field781 = class148.method1019(-1720, "0(U");

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "[[I")
    public static int[][] field777 = new int[5][5000];

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "S")
    public static short field778 = 1;

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "Luf;")
    public static class168 field784 = class148.method1019(-1720, "scape main");

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "I")
    public static int field785 = 0;

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "Luf;")
    public static class168 field786 = class148.method1019(-1720, "AUS");

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "Luf;")
    public static class168 field782 = class148.method1019(-1720, "::rect_debug");

    @OriginalMember(owner = "client!mh", name = "m", descriptor = "Luf;")
    public static class168 field788 = class148.method1019(-1720, "mapflag");

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!mh", name = "n", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!mh", name = "o", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "Lek;")
    public static class244 field780;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Z)V", line = 23)
    public static final void method334(boolean arg0) {
        field789++;
        class71.field951.method1431((byte) 123);
        if (arg0) {
            method338(50, -109, -127, (int[][]) ((int[][]) null), (float[][]) ((float[][]) null), -37, (class291) null, (float[][]) ((float[][]) null), (class220) null, (float[][]) ((float[][]) null), (int[]) null);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZB)I", line = 44)
    public static final int method335(boolean arg0, byte arg1) {
        field783++;
        if (arg1 >= 65 && arg1 <= 90) {
            return arg1 - 65;
        } else if (arg1 >= 97 && arg1 <= 122) {
            return arg1 + 26 - 97;
        } else if (arg1 >= 48 && arg1 <= 57) {
            return arg1 + 52 - 48;
        } else if (arg1 == 43) {
            return 62;
        } else if (arg1 == 42) {
            return 62;
        } else if (arg1 == 47) {
            return 63;
        } else if (arg1 == 45) {
            return 63;
        } else if (arg0) {
            return 101;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BI)Lrl;", line = 101)
    public static final class299 method336(byte arg0, int arg1) {
        field776++;
        class299 var2 = (class299) class197.field3252.method185(-1, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        int var3 = 7 % ((arg0 - 35) / 49);
        byte[] var4 = class40.field510.method1647(arg1, (byte) 121, 0);
        if (var4 == null) {
            return null;
        }
        class299 var5 = new class299();
        class153 var6 = new class153(var4);
        var6.field2367 = var6.field2359.length - 2;
        int var7 = var6.method1069(76);
        int var8 = var6.field2359.length - var7 - 2 - 12;
        var6.field2367 = var8;
        int var9 = var6.method1089((byte) -14);
        var5.field5070 = var6.method1069(38);
        var5.field5067 = var6.method1069(51);
        var5.field5073 = var6.method1069(94);
        var5.field5077 = var6.method1069(40);
        int var10 = var6.method1042((byte) -86);
        if (var10 > 0) {
            var5.field5059 = new class80[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                int var12 = var6.method1069(120);
                class80 var13 = new class80(class180.method1294(true, var12));
                var5.field5059[var11] = var13;
                while (var12-- > 0) {
                    int var14 = var6.method1089((byte) -14);
                    int var15 = var6.method1089((byte) -14);
                    var13.method490(new class69(var15), (long) var14, true);
                }
            }
        }
        var6.field2367 = 0;
        var5.field5063 = var6.method1083(0);
        var5.field5065 = new int[var9];
        var5.field5071 = new class168[var9];
        var5.field5068 = new int[var9];
        int var16 = 0;
        while (var8 > var6.field2367) {
            int var17 = var6.method1069(33);
            if (var17 == 3) {
                var5.field5071[var16] = var6.method1075(100);
            } else if (var17 >= 100 || var17 == 21 || var17 == 38 || var17 == 39) {
                var5.field5065[var16] = var6.method1042((byte) -88);
            } else {
                var5.field5065[var16] = var6.method1089((byte) -14);
            }
            var5.field5068[var16++] = var17;
        }
        class197.field3252.method187(var5, (long) arg1, (byte) 10);
        return var5;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V", line = 191)
    public static void method337(int arg0) {
        field788 = null;
        field781 = null;
        field784 = null;
        field786 = null;
        if (arg0 != 1) {
            field787 = 85;
        }
        field777 = (int[][]) null;
        field780 = null;
        field782 = null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(III[[I[[FILlf;[[FLkl;[[F[I)V", line = 210)
    public static final void method338(int arg0, int arg1, int arg2, int[][] arg3, float[][] arg4, int arg5, class291 arg6, float[][] arg7, class220 arg8, float[][] arg9, int[] arg10) {
        field779++;
        int[] var11 = new int[arg10.length / 2];
        int var12 = 0;
        if (arg2 != 1) {
            method335(false, (byte) 70);
        }
        while (var11.length > var12) {
            int var13 = arg10[var12 + var12 + 1];
            int var14 = arg10[var12 + var12];
            if (arg1 == 1) {
                int var15 = var14;
                var14 = var13;
                var13 = 128 - var15;
            } else if (arg1 == 2) {
                var13 = 128 - var13;
                var14 = 128 - var14;
            } else if (arg1 == 3) {
                int var16 = var14;
                var14 = 128 - var13;
                var13 = var16;
            }
            float var17;
            float var18;
            float var19;
            if (var14 == 0 && var13 == 0) {
                var17 = arg9[arg0][arg5];
                var18 = arg7[arg0][arg5];
                var19 = arg4[arg0][arg5];
            } else if (var14 == 128 && var13 == 0) {
                var18 = arg7[arg0 + 1][arg5];
                var19 = arg4[arg0 + 1][arg5];
                var17 = arg9[arg0 + 1][arg5];
            } else if (var14 == 128 && var13 == 128) {
                var19 = arg4[arg0 + 1][arg5 + 1];
                var17 = arg9[arg0 + 1][arg5 + 1];
                var18 = arg7[arg0 + 1][arg5 + 1];
            } else if (var14 == 0 && var13 == 128) {
                var17 = arg9[arg0][arg5 + 1];
                var19 = arg4[arg0][arg5 + 1];
                var18 = arg7[arg0][arg5 + 1];
            } else {
                float var20 = arg7[arg0][arg5];
                float var21 = arg4[arg0][arg5];
                float var22 = arg9[arg0][arg5];
                float var23 = (float) var14 / 128.0F;
                float var24 = (arg9[arg0 + 1][arg5] - var22) * var23 + var22;
                float var25 = (arg4[arg0 + 1][arg5] - var21) * var23 + var21;
                float var26 = arg9[arg0][arg5 + 1];
                float var27 = (arg9[arg0 + 1][arg5 + 1] - var26) * var23 + var26;
                float var28 = (arg7[arg0 + 1][arg5] - var20) * var23 + var20;
                float var29 = (float) var13 / 128.0F;
                var17 = (var27 - var24) * var29 + var24;
                float var30 = arg7[arg0][arg5 + 1];
                float var31 = (arg7[arg0 + 1][arg5 + 1] - var30) * var23 + var30;
                var18 = (var31 - var28) * var29 + var28;
                float var32 = arg4[arg0][arg5 + 1];
                float var33 = (arg4[arg0 + 1][arg5 + 1] - var32) * var23 + var32;
                var19 = (var33 - var25) * var29 + var25;
            }
            int var34 = (arg0 << 7) + var14;
            int var35 = (arg5 << 7) + var13;
            int var36 = class121.method868(arg5, var14, var13, arg3, 0, arg0);
            var11[var12] = arg8.method1522(arg6, var34, var36, var35, var17, var19, var18);
            var12++;
        }
        arg8.method1523(var11);
    }
}
