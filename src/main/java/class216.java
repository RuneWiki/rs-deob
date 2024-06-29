import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class216 {

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "Lqe;")
    public static class179 field4002 = class206.method1380("(U5", (byte) -127);

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "Ldc;")
    public static class36 field4000 = new class36();

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "Lqe;")
    public static class179 field4006 = class206.method1380("hitmarks", (byte) -30);

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "Leh;")
    public static class52 field4005;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "[Lnb;")
    public static class143[] field3999;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "[[Z")
    public static boolean[][] field4004;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lgg;B)V")
    public static final void method1414(class72 arg0, byte arg1) {
        field3998++;
        for (int var2 = 0; var2 < class50.field1071.length; var2++) {
            class50.field1071[var2] = 0;
        }
        short var3 = 256;
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) ((double) var3 * 128.0D * Math.random());
            class50.field1071[var16] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var3 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class29.field636[var15] = (class50.field1071[var15 + 1] + class50.field1071[var15 - 1] + class50.field1071[var15 + -128] + class50.field1071[var15 + 128]) / 4;
                }
            }
            int[] var13 = class50.field1071;
            class50.field1071 = class29.field636;
            class29.field636 = var13;
        }
        if (arg0 != null) {
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.field1248; var7++) {
                for (int var8 = 0; var8 < arg0.field1249; var8++) {
                    if (arg0.field1429[var6++] != 0) {
                        int var9 = arg0.field1245 + var8 + 16;
                        int var10 = arg0.field1247 + var7 + 16;
                        int var11 = (var10 << 7) + var9;
                        class50.field1071[var11] = 0;
                    }
                }
            }
        }
        if (arg1 != -101) {
            method1417(26, 62, 93, -19, 87, -110, -56);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1415(int arg0, int arg1, int arg2, int arg3) {
        if (class116.method747(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class190.method1279(var4 + 1, class30.field665[arg0][arg1][arg2] + arg3, var5 + 1) && class190.method1279(var4 + 128 - 1, class30.field665[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class190.method1279(var4 + 128 - 1, class30.field665[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class190.method1279(var4 + 1, class30.field665[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
    public static final void method1416(int arg0) {
        class87.field1661 = arg0;
        for (int var1 = 0; var1 < class39.field834; var1++) {
            for (int var2 = 0; var2 < class33.field719; var2++) {
                if (class229.field4232[arg0][var1][var2] == null) {
                    class229.field4232[arg0][var1][var2] = new class197(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1417(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4003++;
        int var7 = 0;
        int var8 = arg0 - arg1;
        if (var8 < 0) {
            var8 = 0;
        }
        class73.method464(-5833, arg0);
        int var9 = arg0;
        int var10 = var8;
        int var11 = -var8;
        int var12 = -arg0;
        int var13 = -1;
        int var14 = -1;
        if (arg2 >= class168.field3037 && arg2 <= class70.field1403) {
            int[] var15 = class14.field331[arg2];
            int var16 = class56.method391(16777215, class40.field869, class235.field4336, arg4 - arg0);
            int var17 = class56.method391(16777215, class40.field869, class235.field4336, arg0 + arg4);
            int var18 = class56.method391(16777215, class40.field869, class235.field4336, arg4 - var8);
            int var19 = class56.method391(16777215, class40.field869, class235.field4336, arg4 + var8);
            class23.method161(var18, -1, arg5, var16, var15);
            class23.method161(var19, -1, arg6, var18, var15);
            class23.method161(var17, arg3 ^ 0x7546, arg5, var19, var15);
        }
        if (arg3 != -30023) {
            method1414(null, (byte) -121);
        }
        while (var7 < var9) {
            var13 += 2;
            var12 += var13;
            var14 += 2;
            var11 += var14;
            if (var11 >= 0 && var10 >= 1) {
                var10--;
                var11 -= var10 << 1;
                class148.field2668[var10] = var7;
            }
            var7++;
            if (var12 >= 0) {
                var9--;
                var12 -= var9 << 1;
                int var20 = arg2 - var9;
                int var21 = arg2 + var9;
                if (class168.field3037 <= var21 && var20 <= class70.field1403) {
                    if (var9 >= var8) {
                        int var22 = class56.method391(16777215, class40.field869, class235.field4336, arg4 + var7);
                        int var23 = class56.method391(16777215, class40.field869, class235.field4336, arg4 - var7);
                        if (class70.field1403 >= var21) {
                            class23.method161(var22, arg3 ^ 0x7546, arg5, var23, class14.field331[var21]);
                        }
                        if (var20 >= class168.field3037) {
                            class23.method161(var22, -1, arg5, var23, class14.field331[var20]);
                        }
                    } else {
                        int var24 = class148.field2668[var9];
                        int var25 = class56.method391(arg3 + 16807238, class40.field869, class235.field4336, arg4 + var7);
                        int var26 = class56.method391(16777215, class40.field869, class235.field4336, arg4 - var7);
                        int var27 = class56.method391(16777215, class40.field869, class235.field4336, arg4 + var24);
                        int var28 = class56.method391(16777215, class40.field869, class235.field4336, arg4 - var24);
                        if (class70.field1403 >= var21) {
                            int[] var29 = class14.field331[var21];
                            class23.method161(var28, -1, arg5, var26, var29);
                            class23.method161(var27, -1, arg6, var28, var29);
                            class23.method161(var25, arg3 + 30022, arg5, var27, var29);
                        }
                        if (var20 >= class168.field3037) {
                            int[] var30 = class14.field331[var20];
                            class23.method161(var28, arg3 ^ 0x7546, arg5, var26, var30);
                            class23.method161(var27, -1, arg6, var28, var30);
                            class23.method161(var25, -1, arg5, var27, var30);
                        }
                    }
                }
            }
            int var31 = arg2 + var7;
            int var32 = arg2 - var7;
            if (var31 >= class168.field3037 && var32 <= class70.field1403) {
                int var33 = arg4 + var9;
                int var34 = arg4 - var9;
                if (var33 >= class235.field4336 && var34 <= class40.field869) {
                    int var35 = class56.method391(arg3 + 16807238, class40.field869, class235.field4336, var33);
                    int var36 = class56.method391(arg3 ^ 0xFF007546, class40.field869, class235.field4336, var34);
                    if (var8 <= var7) {
                        if (var31 <= class70.field1403) {
                            class23.method161(var35, -1, arg5, var36, class14.field331[var31]);
                        }
                        if (var32 >= class168.field3037) {
                            class23.method161(var35, arg3 + 30022, arg5, var36, class14.field331[var32]);
                        }
                    } else {
                        int var37 = var7 > var10 ? class148.field2668[var7] : var10;
                        int var38 = class56.method391(16777215, class40.field869, class235.field4336, arg4 + var37);
                        int var39 = class56.method391(16777215, class40.field869, class235.field4336, arg4 - var37);
                        if (class70.field1403 >= var31) {
                            int[] var40 = class14.field331[var31];
                            class23.method161(var39, arg3 ^ 0x7546, arg5, var36, var40);
                            class23.method161(var38, -1, arg6, var39, var40);
                            class23.method161(var35, -1, arg5, var38, var40);
                        }
                        if (var32 >= class168.field3037) {
                            int[] var41 = class14.field331[var32];
                            class23.method161(var39, -1, arg5, var36, var41);
                            class23.method161(var38, arg3 ^ 0x7546, arg6, var39, var41);
                            class23.method161(var35, -1, arg5, var38, var41);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V")
    public static void method1418(int arg0) {
        field3999 = null;
        field4006 = null;
        field4005 = null;
        field4004 = null;
        field4002 = null;
        if (arg0 != 24805) {
            field4004 = null;
        }
        field4000 = null;
    }
}
