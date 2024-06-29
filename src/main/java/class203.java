import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class203 {

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "Led;")
    public static class43 field3957 = class191.method1219(")1p", false);

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "Led;")
    public static class43 field3959 = class191.method1219("Fallen lassen", false);

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
    public static int field3962 = -1;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
    public static int field3965 = -1;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "[I")
    public static int[] field3961 = new int[500];

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "Z")
    public static boolean field3964 = false;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field3958;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lmf;I)V")
    public static final void method1311(class115 arg0, int arg1) {
        class138.method892(200000, arg0, 25969);
        field3963++;
        if (arg1 != 3538) {
            field3964 = false;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
    public static void method1312(int arg0) {
        if (arg0 < 113) {
            field3966 = -4;
        }
        field3957 = null;
        field3959 = null;
        field3961 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIII)V")
    public static final void method1313(int arg0, int arg1, int arg2, int arg3) {
        class41.method228((byte) -116);
        field3958++;
        class168.method1044(arg2, arg1, class142.field2931.field3574 + arg2, arg1 - -class142.field2931.field3576);
        if (arg0 != 2047) {
            field3959 = null;
        }
        if (class118.field2307 == 2 || class118.field2307 == 5) {
            class168.method1056(arg2 + 25, arg1 + 5, 0, class188.field3685, class90.field1801);
        } else {
            int var4 = class204.field3967 + class142.field2933 & 0x7FF;
            int var5 = class67.field1348.field2347 / 32 + 48;
            int var6 = 464 - class67.field1348.field2328 / 32;
            class9.field161.method789(arg2 + 25, arg1 + 5, 146, 151, var5, var6, var4, class54.field1091 + 256, class188.field3685, class90.field1801);
            for (int var7 = 0; var7 < class38.field717; var7++) {
                int var37 = class142.field2934[var7] * 4 + 2 - class67.field1348.field2347 / 32;
                int var38 = class144.field2969[var7] * 4 + 2 - class67.field1348.field2328 / 32;
                class174.method1096(var38, class107.field2057[var7], arg2, arg1, var37, 2755);
            }
            for (int var8 = 0; var8 < 104; var8++) {
                for (int var33 = 0; var33 < 104; var33++) {
                    class118 var34 = class46.field922[class93.field1839][var8][var33];
                    if (var34 != null) {
                        int var35 = var8 * 4 + 2 - class67.field1348.field2347 / 32;
                        int var36 = var33 * 4 + 2 - class67.field1348.field2328 / 32;
                        class174.method1096(var36, class186.field3658[0], arg2, arg1, var35, 2755);
                    }
                }
            }
            for (int var9 = 0; var9 < class95.field1864; var9++) {
                class77 var29 = class172.field3433[class158.field3202[var9]];
                if (var29 != null && var29.method4(arg0 - 2020)) {
                    class59 var30 = var29.field1539;
                    if (var30 != null && var30.field1209 != null) {
                        var30 = var30.method372((byte) -82);
                    }
                    if (var30 != null && var30.field1205 && var30.field1190) {
                        int var31 = var29.field2347 / 32 - class67.field1348.field2347 / 32;
                        int var32 = var29.field2328 / 32 - class67.field1348.field2328 / 32;
                        class174.method1096(var32, class186.field3658[1], arg2, arg1, var31, 2755);
                    }
                }
            }
            for (int var10 = 0; var10 < class170.field3399; var10++) {
                class1 var21 = class12.field183[class125.field2472[var10]];
                if (var21 != null && var21.method4(arg0 - 2118)) {
                    int var22 = var21.field2347 / 32 - class67.field1348.field2347 / 32;
                    boolean var23 = false;
                    int var24 = var21.field2328 / 32 - class67.field1348.field2328 / 32;
                    long var25 = var21.field23.method249(arg0 ^ 0xFFFFF82F);
                    for (int var27 = 0; var27 < class40.field778; var27++) {
                        if (class117.field2286[var27] == var25 && class80.field1585[var27] != 0) {
                            var23 = true;
                            break;
                        }
                    }
                    boolean var28 = false;
                    if (class67.field1348.field10 != 0 && var21.field10 != 0 && class67.field1348.field10 == var21.field10) {
                        var28 = true;
                    }
                    if (var23) {
                        class174.method1096(var24, class186.field3658[3], arg2, arg1, var22, 2755);
                    } else if (var28) {
                        class174.method1096(var24, class186.field3658[4], arg2, arg1, var22, 2755);
                    } else {
                        class174.method1096(var24, class186.field3658[2], arg2, arg1, var22, 2755);
                    }
                }
            }
            if (class7.field147 != 0 && client.field559 % 20 < 10) {
                if (class7.field147 == 1 && class171.field3417 >= 0 && class171.field3417 < class172.field3433.length) {
                    class77 var11 = class172.field3433[class171.field3417];
                    if (var11 != null) {
                        int var12 = var11.field2347 / 32 - class67.field1348.field2347 / 32;
                        int var13 = var11.field2328 / 32 - class67.field1348.field2328 / 32;
                        class118.method746(arg2, var12, arg1, class137.field2837[1], var13, true);
                    }
                }
                if (class7.field147 == 2) {
                    int var14 = (class116.field2269 - class170.field3393) * 4 + 2 - class67.field1348.field2347 / 32;
                    int var15 = (class142.field2941 - class83.field1641) * 4 + 2 - class67.field1348.field2328 / 32;
                    class118.method746(arg2, var14, arg1, class137.field2837[1], var15, true);
                }
                if (class7.field147 == 10 && class164.field3279 >= 0 && class164.field3279 < class12.field183.length) {
                    class1 var16 = class12.field183[class164.field3279];
                    if (var16 != null) {
                        int var17 = var16.field2347 / 32 - class67.field1348.field2347 / 32;
                        int var18 = var16.field2328 / 32 - class67.field1348.field2328 / 32;
                        class118.method746(arg2, var17, arg1, class137.field2837[1], var18, true);
                    }
                }
            }
            if (class124.field2457 != 0) {
                int var19 = class124.field2457 * 4 + 2 - class67.field1348.field2347 / 32;
                int var20 = class35.field631 * 4 + 2 - class67.field1348.field2328 / 32;
                class174.method1096(var20, class137.field2837[0], arg2, arg1, var19, 2755);
            }
            class168.method1046(arg2 + 97, arg1 + -4 - -82, 3, 3, 16777215);
        }
        if (class118.field2307 >= 3) {
            class168.method1056(arg2, arg1, 0, class83.field1628, class171.field3429);
        } else {
            class107.field2044.method789(arg2, arg1, 33, 33, 25, 25, class142.field2933, 256, class83.field1628, class171.field3429);
        }
        if (class9.field165[arg3]) {
            class142.field2931.method1163(arg2, arg1);
        }
        class21.field355[arg3] = true;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)V")
    public static final void method1314(int arg0) {
        if (arg0 != -1) {
            method1313(62, -117, 54, -99);
        }
        if (class102.field1942 != null) {
            class107 var1 = class102.field1942;
            synchronized (class102.field1942) {
                class102.field1942 = null;
            }
        }
        field3960++;
    }
}
