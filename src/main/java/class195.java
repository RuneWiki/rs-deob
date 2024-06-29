import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class195 {

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "Los;")
    public static class309 field3140 = new class309("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "F")
    public static float field3141;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIZ[Lgh;I)V", line = 6)
    public static final void method1314(int arg0, int arg1, int arg2, boolean arg3, class388[] arg4, int arg5) {
        if (arg1 > -111) {
            method1314(-78, -22, -82, false, null, 68);
        }
        for (int var6 = 0; var6 < arg4.length; var6++) {
            class388 var7 = arg4[var6];
            if (var7 != null && var7.field5728 == arg2) {
                class375.method2306(arg3, arg5, arg0, 5, var7);
                class308.method1971(arg5, var7, arg0, -3804);
                if ((var7.field5721 - var7.field5745) < var7.field5782) {
                    var7.field5782 = var7.field5721 - var7.field5745;
                }
                if (var7.field5782 < 0) {
                    var7.field5782 = 0;
                }
                if (var7.field5758 - var7.field5712 < var7.field5740) {
                    var7.field5740 = var7.field5758 - var7.field5712;
                }
                if (var7.field5740 < 0) {
                    var7.field5740 = 0;
                }
                if (var7.field5784 == 0) {
                    class379.method2331(arg3, 52, var7);
                }
            }
        }
        field3139++;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V", line = 51)
    public static void method1315(int arg0) {
        field3140 = null;
        if (arg0 != 2) {
            field3138 = -69;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIIII)V", line = 67)
    public static final void method1316(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class447.method2675(arg5, -1);
        field3137++;
        int var7 = 0;
        int var8 = arg5 - arg3;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg5;
        int var10 = -arg5;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = arg6;
        if (arg1 >= class372.field5455 && class216.field3415 >= arg1) {
            int[] var15 = class316.field4797[arg1];
            int var16 = class73.method640(class43.field600, (byte) -105, class467.field6940, arg0 - arg5);
            int var17 = class73.method640(class43.field600, (byte) -88, class467.field6940, arg0 + arg5);
            int var18 = class73.method640(class43.field600, (byte) -77, class467.field6940, arg0 - var8);
            int var19 = class73.method640(class43.field600, (byte) -70, class467.field6940, arg0 + var8);
            class503.method3027(var16, (byte) 127, var18, arg2, var15);
            class503.method3027(var18, (byte) 127, var19, arg4, var15);
            class503.method3027(var19, (byte) 127, var17, arg2, var15);
        }
        while (var7 < var9) {
            var14 += 2;
            var13 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                class385.field5619[var11] = var7;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg1 - var9;
                int var21 = arg1 + var9;
                if (class372.field5455 <= var21 && var20 <= class216.field3415) {
                    if (var8 > var9) {
                        int var22 = class385.field5619[var9];
                        int var23 = class73.method640(class43.field600, (byte) -106, class467.field6940, arg0 + var7);
                        int var24 = class73.method640(class43.field600, (byte) -122, class467.field6940, arg0 - var7);
                        int var25 = class73.method640(class43.field600, (byte) -119, class467.field6940, arg0 + var22);
                        int var26 = class73.method640(class43.field600, (byte) -64, class467.field6940, arg0 - var22);
                        if (var21 <= class216.field3415) {
                            int[] var27 = class316.field4797[var21];
                            class503.method3027(var24, (byte) 127, var26, arg2, var27);
                            class503.method3027(var26, (byte) 127, var25, arg4, var27);
                            class503.method3027(var25, (byte) 127, var23, arg2, var27);
                        }
                        if (var20 >= class372.field5455) {
                            int[] var28 = class316.field4797[var20];
                            class503.method3027(var24, (byte) 127, var26, arg2, var28);
                            class503.method3027(var26, (byte) 127, var25, arg4, var28);
                            class503.method3027(var25, (byte) 127, var23, arg2, var28);
                        }
                    } else {
                        int var29 = class73.method640(class43.field600, (byte) -85, class467.field6940, arg0 + var7);
                        int var30 = class73.method640(class43.field600, (byte) -71, class467.field6940, arg0 - var7);
                        if (class216.field3415 >= var21) {
                            class503.method3027(var30, (byte) 127, var29, arg2, class316.field4797[var21]);
                        }
                        if (class372.field5455 <= var20) {
                            class503.method3027(var30, (byte) 127, var29, arg2, class316.field4797[var20]);
                        }
                    }
                }
            }
            int var31 = arg1 - var7;
            int var32 = arg1 + var7;
            if (var32 >= class372.field5455 && var31 <= class216.field3415) {
                int var33 = arg0 + var9;
                int var34 = arg0 - var9;
                if (class467.field6940 <= var33 && class43.field600 >= var34) {
                    int var35 = class73.method640(class43.field600, (byte) -68, class467.field6940, var33);
                    int var36 = class73.method640(class43.field600, (byte) -108, class467.field6940, var34);
                    if (var7 < var8) {
                        int var37 = var7 > var11 ? class385.field5619[var7] : var11;
                        int var38 = class73.method640(class43.field600, (byte) -86, class467.field6940, arg0 + var37);
                        int var39 = class73.method640(class43.field600, (byte) -74, class467.field6940, arg0 - var37);
                        if (class216.field3415 >= var32) {
                            int[] var40 = class316.field4797[var32];
                            class503.method3027(var36, (byte) 127, var39, arg2, var40);
                            class503.method3027(var39, (byte) 127, var38, arg4, var40);
                            class503.method3027(var38, (byte) 127, var35, arg2, var40);
                        }
                        if (class372.field5455 <= var31) {
                            int[] var41 = class316.field4797[var31];
                            class503.method3027(var36, (byte) 127, var39, arg2, var41);
                            class503.method3027(var39, (byte) 127, var38, arg4, var41);
                            class503.method3027(var38, (byte) 127, var35, arg2, var41);
                        }
                    } else {
                        if (class216.field3415 >= var32) {
                            class503.method3027(var36, (byte) 127, var35, arg2, class316.field4797[var32]);
                        }
                        if (var31 >= class372.field5455) {
                            class503.method3027(var36, (byte) 127, var35, arg2, class316.field4797[var31]);
                        }
                    }
                }
            }
        }
    }
}
