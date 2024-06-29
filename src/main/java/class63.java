import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class63 {

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
    public static int field850 = 2;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    public int field851;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    public int field852;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
    public int field855;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "Ls;")
    public static class98 field849;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)V")
    public static final void method389(int arg0, int arg1) {
        class245 var2 = class96.field1379;
        synchronized (class96.field1379) {
            class182.field2768 = arg1;
        }
        int var3 = -64 / ((arg0 + 85) / 40);
        field854++;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILnh;)V")
    public static final void method390(int arg0, class305 arg1) {
        int var2 = -25 % ((-arg0 - 48) / 44);
        field856++;
        class82.field1125 = arg1;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lsk;IIIII)V")
    public static final void method391(class202 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class150.field2077 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class207.field3086) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class265.field4271 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class91 var14 = class246.field3856[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class185.field2812[var11][var12 + 1][var13] + class185.field2812[var11][var12][var13] + class185.field2812[var11][var12][var13 + 1] + class185.field2812[var11][var12 + 1][var13 + 1]) / 4 - (class185.field2812[arg1][arg2 + 1][arg3] + class185.field2812[arg1][arg2][arg3] + class185.field2812[arg1][arg2][arg3 + 1] + class185.field2812[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class180 var16 = var14.field1334;
                                    if (var16 != null) {
                                        if (var16.field2735.method1013()) {
                                            arg0.method1029(var16.field2735, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field2729 != null && var16.field2729.method1013()) {
                                            arg0.method1029(var16.field2729, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field1343; var17++) {
                                        class160 var18 = var14.field1339[var17];
                                        if (var18 != null && var18.field2230.method1013() && (var18.field2234 == var12 || var7 == var12) && (var18.field2229 == var13 || var9 == var13)) {
                                            int var19 = var18.field2224 + 1 - var18.field2234;
                                            int var20 = var18.field2228 + 1 - var18.field2229;
                                            arg0.method1029(var18.field2230, (var18.field2234 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field2229 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)V")
    public static void method392(boolean arg0) {
        field849 = null;
        if (arg0) {
            method393(55, 122, -89, -20);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIII)V")
    public static final void method393(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 1004) {
            class234.method1536(arg3, 63, 10, arg0);
        } else if (arg1 == 1006) {
            class234.method1536(arg3, 111, 11, arg0);
        } else if (arg1 == 1010) {
            class234.method1536(arg3, 49, 12, arg0);
        } else if (arg1 == 1007) {
            class234.method1536(arg3, 56, 13, arg0);
        } else if (arg1 == 1012) {
            class234.method1536(arg3, arg2 + 27852, 14, arg0);
        }
        if (arg2 == -27756) {
            field853++;
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(Z)V")
    public static final void method394(boolean arg0) {
        field857++;
        class274.field4354 = 0;
        class157.field2168 = 0;
        class176.field2485 = arg0;
        class141.field1939 = 0;
        class249.field3897 = 0;
    }
}
