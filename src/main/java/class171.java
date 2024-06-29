import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class171 {

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
    public static int field2543 = 0;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "I")
    public static int field2546 = 0;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2542 = "level: ";

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "I")
    public static int field2549 = 0;

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "Ljava/lang/String;")
    public static String field2551 = "purple:";

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "Luf;")
    public static class176 field2547;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "[Lqd;")
    public static class3[] field2545;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(BI)V")
    public static final void method1132(byte arg0, int arg1) {
        class121.field1862 = new int[arg1];
        class163.field2487 = new int[arg1];
        class126.field1986 = new int[arg1];
        class259.field3958 = new int[arg1];
        field2550++;
        class23.field335 = new int[arg1];
        if (arg0 > -47) {
            field2547 = null;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIIIZIIIIII)V")
    public static final void method1133(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field2544++;
        int var12 = arg10 - arg7;
        int var13 = arg1 - arg0;
        int var14 = -1;
        if (class217.field3414 > 0) {
            if (class242.field3748 <= 10) {
                var14 = class242.field3748 * 5;
            } else {
                var14 = (10 + 10 - class242.field3748) * 5;
            }
        }
        if (arg11 != 4032) {
            field2545 = null;
        }
        int var15 = 983040 / arg4;
        int var16 = 983040 / arg2;
        for (int var17 = -var15; var17 < (var12 + var15); var17++) {
            int var19 = arg4 * var17 + arg9 >> 16;
            int var20 = (var17 + 1) * arg4 + arg9 >> 16;
            int var21 = var20 - var19;
            if (var21 > 0) {
                int var10000 = arg6 + var20;
                int var23 = arg6 + var19;
                int var24 = arg7 + var17 >> 6;
                if (var24 >= 0 && var24 <= class39.field654.length - 1) {
                    int[][] var25 = class39.field654[var24];
                    for (int var26 = -var16; var26 < var13 + var16; var26++) {
                        int var27 = (var26 + 1) * arg2 + arg8 >> 16;
                        int var28 = arg2 * var26 + arg8 >> 16;
                        int var29 = var27 - var28;
                        if (var29 > 0) {
                            var10000 = arg3 + var27;
                            int var31 = arg0 + var26 >> 6;
                            int var32 = arg3 + var28;
                            if (var31 >= 0 && (var25.length - 1) >= var31 && var25[var31] != null) {
                                int var33 = (arg0 + var26 & 0x3F << 6) + (var17 + arg7 & 0x3F);
                                int var34 = var25[var31][var33];
                                if (var34 != 0) {
                                    class73 var35 = class85.method690(2276, var34 - 1);
                                    if (!class214.field3309[var35.field1183]) {
                                        if (var14 != -1 && class36.field578 == var35.field1183) {
                                            class26 var36 = new class26();
                                            var36.field395 = var23;
                                            var36.field402 = var35.field1183;
                                            var36.field404 = var32;
                                            class77.field1289.method1013(arg11 + 312987572, var36);
                                        } else {
                                            class262.field4096[var35.field1183].method45(var23 - 7, var32 - 7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class26 var18 = (class26) class77.field1289.method1010(113); var18 != null; var18 = (class26) class77.field1289.method1008((byte) 88)) {
            class201.method1350(var18.field395, var18.field404, 15, 16776960, var14);
            class201.method1350(var18.field395, var18.field404, 13, 16776960, var14);
            class201.method1350(var18.field395, var18.field404, 11, 16776960, var14);
            class201.method1350(var18.field395, var18.field404, 9, 16776960, var14);
            class262.field4096[var18.field402].method45(var18.field395 - 7, var18.field404 + -7);
        }
        class77.field1289.method1016(false);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V")
    public static void method1134(int arg0) {
        field2542 = null;
        field2545 = null;
        if (arg0 != -30277) {
            method1132((byte) 68, 7);
        }
        field2547 = null;
        field2551 = null;
    }
}
