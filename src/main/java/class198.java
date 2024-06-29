import java.awt.Point;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class198 {

    @OriginalMember(owner = "client!si", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field3156 = new String[5];

    @OriginalMember(owner = "client!si", name = "c", descriptor = "Lrk;")
    public static class270 field3155 = new class270(64);

    @OriginalMember(owner = "client!si", name = "i", descriptor = "Laf;")
    public static class68 field3161 = new class68(5);

    @OriginalMember(owner = "client!si", name = "j", descriptor = "Ljava/util/Random;")
    public static Random field3162 = new Random();

    @OriginalMember(owner = "client!si", name = "k", descriptor = "I")
    public static int field3163 = 0;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "Lqh;")
    public static class201 field3153;

    @OriginalMember(owner = "client!si", name = "l", descriptor = "[Lf;")
    public static class36[] field3164;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)V")
    public static final void method1341(int arg0, int arg1) {
        class41.field769 = 1000 / arg1;
        if (arg0 != 0) {
            field3156 = null;
        }
        field3158++;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIIIZI)V")
    public static final void method1342(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        class258.method1759(-112, arg3);
        int var7 = 0;
        int var8 = arg3 - arg6;
        if (var8 < 0) {
            var8 = 0;
        }
        field3159++;
        int var9 = -arg3;
        int var10 = arg3;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        if (arg5) {
            return;
        }
        int var14 = -1;
        if (class161.field2561 <= arg1 && class51.field896 >= arg1) {
            int[] var15 = class29.field452[arg1];
            int var16 = class51.method393(arg0 - arg3, 0, class255.field4055, class9.field128);
            int var17 = class51.method393(arg0 + arg3, 0, class255.field4055, class9.field128);
            int var18 = class51.method393(arg0 - var8, 0, class255.field4055, class9.field128);
            int var19 = class51.method393(arg0 + var8, 0, class255.field4055, class9.field128);
            class56.method420(var15, arg2, -7, var16, var18);
            class56.method420(var15, arg4, -7, var18, var19);
            class56.method420(var15, arg2, -7, var19, var17);
        }
        while (var7 < var10) {
            var14 += 2;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                class84.field1324[var11] = var7;
                var12 -= var11 << 1;
            }
            var13 += 2;
            var9 += var13;
            var7++;
            if (var9 >= 0) {
                var10--;
                var9 -= var10 << 1;
                int var20 = arg1 - var10;
                int var21 = arg1 + var10;
                if (var21 >= class161.field2561 && var20 <= class51.field896) {
                    if (var10 < var8) {
                        int var22 = class84.field1324[var10];
                        int var23 = class51.method393(arg0 + var7, 0, class255.field4055, class9.field128);
                        int var24 = class51.method393(arg0 - var7, 0, class255.field4055, class9.field128);
                        int var25 = class51.method393(arg0 + var22, 0, class255.field4055, class9.field128);
                        int var26 = class51.method393(arg0 - var22, 0, class255.field4055, class9.field128);
                        if (var21 <= class51.field896) {
                            int[] var27 = class29.field452[var21];
                            class56.method420(var27, arg2, -7, var24, var26);
                            class56.method420(var27, arg4, -7, var26, var25);
                            class56.method420(var27, arg2, -7, var25, var23);
                        }
                        if (var20 >= class161.field2561) {
                            int[] var28 = class29.field452[var20];
                            class56.method420(var28, arg2, -7, var24, var26);
                            class56.method420(var28, arg4, -7, var26, var25);
                            class56.method420(var28, arg2, -7, var25, var23);
                        }
                    } else {
                        int var29 = class51.method393(arg0 + var7, 0, class255.field4055, class9.field128);
                        int var30 = class51.method393(arg0 - var7, 0, class255.field4055, class9.field128);
                        if (class51.field896 >= var21) {
                            class56.method420(class29.field452[var21], arg2, -7, var30, var29);
                        }
                        if (var20 >= class161.field2561) {
                            class56.method420(class29.field452[var20], arg2, -7, var30, var29);
                        }
                    }
                }
            }
            int var31 = arg1 - var7;
            int var32 = arg1 + var7;
            if (var32 >= class161.field2561 && class51.field896 >= var31) {
                int var33 = arg0 + var10;
                int var34 = arg0 - var10;
                if (class255.field4055 <= var33 && var34 <= class9.field128) {
                    int var35 = class51.method393(var33, 0, class255.field4055, class9.field128);
                    int var36 = class51.method393(var34, 0, class255.field4055, class9.field128);
                    if (var8 <= var7) {
                        if (class51.field896 >= var32) {
                            class56.method420(class29.field452[var32], arg2, -7, var36, var35);
                        }
                        if (class161.field2561 <= var31) {
                            class56.method420(class29.field452[var31], arg2, -7, var36, var35);
                        }
                    } else {
                        int var37 = var7 > var11 ? class84.field1324[var7] : var11;
                        int var38 = class51.method393(arg0 + var37, 0, class255.field4055, class9.field128);
                        int var39 = class51.method393(arg0 - var37, 0, class255.field4055, class9.field128);
                        if (class51.field896 >= var32) {
                            int[] var40 = class29.field452[var32];
                            class56.method420(var40, arg2, -7, var36, var39);
                            class56.method420(var40, arg4, -7, var39, var38);
                            class56.method420(var40, arg2, -7, var38, var35);
                        }
                        if (class161.field2561 <= var31) {
                            int[] var41 = class29.field452[var31];
                            class56.method420(var41, arg2, -7, var36, var39);
                            class56.method420(var41, arg4, -7, var39, var38);
                            class56.method420(var41, arg2, -7, var38, var35);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)V")
    public static void method1343(boolean arg0) {
        field3155 = null;
        field3156 = null;
        if (arg0) {
            field3163 = -31;
        }
        field3164 = null;
        field3153 = null;
        field3161 = null;
        field3162 = null;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(II)V")
    public static final void method1344(int arg0, int arg1) {
        if (!class22.field379) {
            arg0 = -1;
        }
        field3154++;
        if (class29.field469 == arg0) {
            return;
        }
        if (arg0 != arg1) {
            class99 var2 = class244.method1683(arg0, arg1 ^ 0x7B);
            class37 var3 = var2.method730(-96);
            if (var3 == null) {
                arg0 = -1;
            } else {
                class105.field1684.method1137(var3.field3871, (byte) -109, var3.field3867, new Point(var2.field1631, var2.field1630), var3.method315(), class155.field2511);
                class29.field469 = arg0;
            }
        }
        if (arg0 == -1 && class29.field469 != -1) {
            class105.field1684.method1137(-1, (byte) -107, -1, new Point(), (int[]) null, class155.field2511);
            class29.field469 = -1;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ZLqh;)V")
    public static final void method1345(boolean arg0, class201 arg1) {
        class94.field1552 = arg1;
        field3157++;
        if (arg0) {
            field3153 = null;
        }
    }
}
