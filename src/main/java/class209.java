import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class209 {

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "[I")
    public static int[] field3047 = new int[32];

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "Lfg;")
    public static class18 field3044 = new class18(20);

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "Ljava/lang/String;")
    public static String field3051 = null;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "Lrc;")
    public class100 field3048;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "Lsr;")
    public class135 field3046;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V", line = 3)
    public static void method1575(int arg0) {
        field3044 = null;
        field3051 = null;
        field3047 = null;
        if (arg0 != 1913281025) {
            field3041 = 114;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BII)I", line = 25)
    public static final int method1576(byte arg0, int arg1, int arg2) {
        if (arg0 != -40) {
            field3044 = null;
        }
        if (arg2 > arg1) {
            int var3 = arg1;
            arg1 = arg2;
            arg2 = var3;
        }
        field3049++;
        while (arg2 != 0) {
            int var4 = arg1 % arg2;
            arg1 = arg2;
            arg2 = var4;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V", line = 57)
    public static final void method1577(int arg0) {
        class18 var1 = class310.field4521;
        synchronized (class310.field4521) {
            class310.field4521.method106((byte) -103);
            if (arg0 < 49) {
                method1577(-77);
            }
        }
        field3042++;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIIII)V", line = 70)
    public static final void method1578(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class115.method982(arg1, -11);
        field3050++;
        int var7 = 0;
        int var8 = arg1 - arg2;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        int var10 = -arg1;
        int var11 = var8;
        int var12 = -var8;
        if (arg3 != 2) {
            return;
        }
        int var13 = -1;
        int var14 = -1;
        if (arg5 >= class308.field4507 && class383.field5497 >= arg5) {
            int[] var15 = class286.field4283[arg5];
            int var16 = class102.method843(arg6 - arg1, class278.field4184, class185.field2727, arg3 - 2);
            int var17 = class102.method843(arg1 + arg6, class278.field4184, class185.field2727, 0);
            int var18 = class102.method843(arg6 - var8, class278.field4184, class185.field2727, 0);
            int var19 = class102.method843(arg6 + var8, class278.field4184, class185.field2727, 0);
            class47.method379(var18, (byte) 123, arg4, var15, var16);
            class47.method379(var19, (byte) 90, arg0, var15, var18);
            class47.method379(var17, (byte) 115, arg4, var15, var19);
        }
        while (var9 > var7) {
            var14 += 2;
            var13 += 2;
            var10 += var13;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                var12 -= var11 << 1;
                class355.field5054[var11] = var7;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg5 - var9;
                int var21 = arg5 + var9;
                if (class308.field4507 <= var21 && var20 <= class383.field5497) {
                    if (var8 <= var9) {
                        int var22 = class102.method843(arg6 + var7, class278.field4184, class185.field2727, 0);
                        int var23 = class102.method843(arg6 - var7, class278.field4184, class185.field2727, 0);
                        if (class383.field5497 >= var21) {
                            class47.method379(var22, (byte) 109, arg4, class286.field4283[var21], var23);
                        }
                        if (class308.field4507 <= var20) {
                            class47.method379(var22, (byte) 90, arg4, class286.field4283[var20], var23);
                        }
                    } else {
                        int var24 = class355.field5054[var9];
                        int var25 = class102.method843(arg6 + var7, class278.field4184, class185.field2727, arg3 ^ 0x2);
                        int var26 = class102.method843(arg6 - var7, class278.field4184, class185.field2727, 0);
                        int var27 = class102.method843(arg6 + var24, class278.field4184, class185.field2727, 0);
                        int var28 = class102.method843(arg6 - var24, class278.field4184, class185.field2727, 0);
                        if (class383.field5497 >= var21) {
                            int[] var29 = class286.field4283[var21];
                            class47.method379(var28, (byte) 59, arg4, var29, var26);
                            class47.method379(var27, (byte) 92, arg0, var29, var28);
                            class47.method379(var25, (byte) 114, arg4, var29, var27);
                        }
                        if (class308.field4507 <= var20) {
                            int[] var30 = class286.field4283[var20];
                            class47.method379(var28, (byte) 71, arg4, var30, var26);
                            class47.method379(var27, (byte) 93, arg0, var30, var28);
                            class47.method379(var25, (byte) 103, arg4, var30, var27);
                        }
                    }
                }
            }
            int var31 = arg5 - var7;
            int var32 = arg5 + var7;
            if (var32 >= class308.field4507 && class383.field5497 >= var31) {
                int var33 = arg6 + var9;
                int var34 = arg6 - var9;
                if (var33 >= class185.field2727 && var34 <= class278.field4184) {
                    int var35 = class102.method843(var33, class278.field4184, class185.field2727, 0);
                    int var36 = class102.method843(var34, class278.field4184, class185.field2727, 0);
                    if (var8 > var7) {
                        int var37 = var11 >= var7 ? var11 : class355.field5054[var7];
                        int var38 = class102.method843(arg6 + var37, class278.field4184, class185.field2727, 0);
                        int var39 = class102.method843(arg6 - var37, class278.field4184, class185.field2727, 0);
                        if (class383.field5497 >= var32) {
                            int[] var40 = class286.field4283[var32];
                            class47.method379(var39, (byte) 81, arg4, var40, var36);
                            class47.method379(var38, (byte) 61, arg0, var40, var39);
                            class47.method379(var35, (byte) 122, arg4, var40, var38);
                        }
                        if (var31 >= class308.field4507) {
                            int[] var41 = class286.field4283[var31];
                            class47.method379(var39, (byte) 92, arg4, var41, var36);
                            class47.method379(var38, (byte) 62, arg0, var41, var39);
                            class47.method379(var35, (byte) 81, arg4, var41, var38);
                        }
                    } else {
                        if (var32 <= class383.field5497) {
                            class47.method379(var35, (byte) 107, arg4, class286.field4283[var32], var36);
                        }
                        if (class308.field4507 <= var31) {
                            class47.method379(var35, (byte) 80, arg4, class286.field4283[var31], var36);
                        }
                    }
                }
            }
        }
    }
}
