import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class352 {

    @OriginalMember(owner = "client!km", name = "c", descriptor = "I")
    public static int field5570 = 0;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "Ljava/lang/String;")
    public static String field5568 = "Walk here";

    @OriginalMember(owner = "client!km", name = "j", descriptor = "J")
    public static long field5577 = 0L;

    @OriginalMember(owner = "client!km", name = "b", descriptor = "I")
    public static int field5569;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "I")
    public static int field5571;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "I")
    public static int field5572;

    @OriginalMember(owner = "client!km", name = "f", descriptor = "I")
    public static int field5573;

    @OriginalMember(owner = "client!km", name = "i", descriptor = "I")
    public static int field5576;

    @OriginalMember(owner = "client!km", name = "h", descriptor = "[I")
    public static int[] field5575;

    @OriginalMember(owner = "client!km", name = "g", descriptor = "[[I")
    public static int[][] field5574;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 5)
    public static final int method2450(String arg0, int arg1) {
        if (arg1 != -6424) {
            method2455(false, -78L, 14, (int[]) null);
        }
        field5573++;
        for (int var2 = 0; var2 < class278.field4415.length; var2++) {
            if (class278.field4415[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIIIIZIIIII)V", line = 31)
    public static final void method2451(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field5572++;
        if (arg7 != 10) {
            method2454(23);
        }
        int var12 = arg2 - arg11;
        int var13 = -1;
        if (class185.field3140 > 0) {
            if (class38.field567 > 10) {
                var13 = (10 + 10 - class38.field567) * 5;
            } else {
                var13 = class38.field567 * 5;
            }
        }
        int var14 = arg9 - arg10;
        int var15 = 983040 / arg1;
        int var16 = 983040 / arg0;
        for (int var17 = -var15; var17 < var12 + var15; var17++) {
            int var18 = (var17 + 1) * arg1 + arg5 >> 16;
            int var19 = arg1 * var17 + arg5 >> 16;
            int var20 = var18 - var19;
            if (var20 > 0) {
                int var10000 = arg3 + var18;
                int var22 = var17 + arg11 >> 6;
                int var23 = arg3 + var19;
                if (var22 >= 0 && (class37.field535.length - 1) >= var22) {
                    int[][] var24 = class37.field535[var22];
                    for (int var25 = -var16; var25 < (var14 + var16); var25++) {
                        int var26 = arg4 + ((var25 + 1) * arg0) >> 16;
                        int var27 = arg0 * var25 + arg4 >> 16;
                        int var28 = var26 - var27;
                        if (var28 > 0) {
                            int var29 = arg10 + var25 >> 6;
                            var10000 = arg8 + var26;
                            int var31 = arg8 + var27;
                            if (var29 >= 0 && var29 <= (var24.length - 1) && var24[var29] != null) {
                                int var32 = ((var25 + arg10 & 0x3F) << 6) + (arg11 + var17 & 0x3F);
                                int var33 = var24[var29][var32];
                                if (var33 != 0) {
                                    class97 var34 = class92.method798((byte) 104, var33 - 1);
                                    if (!class124.field2140[var34.field1568]) {
                                        if (var13 != -1 && class189.field3182 == var34.field1568) {
                                            class41 var35 = new class41();
                                            var35.field609 = var31;
                                            var35.field613 = var23;
                                            var35.field607 = var34.field1568;
                                            class68.field1099.method2303((byte) -124, var35);
                                        } else {
                                            class83.field1330[var34.field1568].method1248(var23 - 7, var31 + -7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class41 var36 = (class41) class68.field1099.method2297(arg7 + 14194); var36 != null; var36 = (class41) class68.field1099.method2291(-82)) {
            class47.method418(var36.field613, var36.field609, 15, 16776960, var13);
            class47.method418(var36.field613, var36.field609, 13, 16776960, var13);
            class47.method418(var36.field613, var36.field609, 11, 16776960, var13);
            class47.method418(var36.field613, var36.field609, 9, 16776960, var13);
            class83.field1330[var36.field607].method1248(var36.field613 - 7, var36.field609 - 7);
        }
        class68.field1099.method2302(128);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(BLcg;)V", line = 156)
    public static final void method2452(byte arg0, class49 arg1) {
        if (arg0 < 85) {
            field5575 = (int[]) null;
        }
        field5571++;
        class212.field3577 = arg1;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(II)Ljava/lang/String;", line = 167)
    public static final String method2453(int arg0, int arg1) {
        if (arg1 != 27884) {
            method2452((byte) 62, (class49) null);
        }
        field5576++;
        return class241.field3944[arg0].length() <= 0 ? class166.field2909[arg0] : class166.field2909[arg0] + class316.field5028 + class241.field3944[arg0];
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V", line = 186)
    public static void method2454(int arg0) {
        field5568 = null;
        if (arg0 == 19736) {
            field5575 = null;
            field5574 = (int[][]) null;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ZJI[I)Ljava/lang/String;", line = 208)
    public static final String method2455(boolean arg0, long arg1, int arg2, int[] arg3) {
        field5569++;
        if (class97.field1543 != null) {
            String var5 = class97.field1543.method1115(32111, arg2, arg3, arg1);
            if (var5 != null) {
                return var5;
            }
        }
        if (!arg0) {
            field5577 = -69L;
        }
        return Long.toString(arg1);
    }
}
