import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class173 extends RuntimeException {

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "Ljava/lang/String;")
    public String field2811;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "Ljava/lang/Throwable;")
    public Throwable field2808;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "[I")
    public static int[] field2810 = new int[4096];

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "Lok;")
    public static class41 field2815 = class137.method956("tbrefresh", 45);

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "Lok;")
    private static class41 field2814 = class137.method956("flash2:", 45);

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "Lok;")
    public static class41 field2813 = field2814;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "Lok;")
    public static class41 field2817 = field2814;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "Lmh;")
    public static class65 field2807;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "[I")
    public static int[] field2812;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V", line = 6)
    public static final void method1238(int arg0) {
        class65.field974.method131(-2);
        field2809++;
        if (arg0 <= 124) {
            method1240((class65) null, 15);
        }
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 22)
    public class173(Throwable arg0, String arg1) {
        this.field2811 = arg1;
        this.field2808 = arg0;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lnm;IIIIIIZ)V", line = 34)
    public static final void method1239(class170 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field2722.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var10 = arg0.field2722[var9] - class140.field2155;
            int var11 = arg0.field2714[var9] - class299.field4843;
            int var12 = arg0.field2708[var9] - class302.field5027;
            int var13 = arg3 * var12 + arg4 * var10 >> 16;
            int var14 = arg4 * var12 - arg3 * var10 >> 16;
            int var16 = arg2 * var11 - arg1 * var14 >> 16;
            int var17 = arg1 * var11 + arg2 * var14 >> 16;
            if (var17 < 50) {
                return;
            }
            if (arg0.field2710 != null) {
                class170.field2720[var9] = var13;
                class170.field2711[var9] = var16;
                class170.field2704[var9] = var17;
            }
            class170.field2716[var9] = (var13 << 9) / var17 + class31.field452;
            class170.field2701[var9] = (var16 << 9) / var17 + class31.field446;
        }
        class31.field454 = 0;
        int var19 = arg0.field2712.length;
        for (int var20 = 0; var20 < var19; var20++) {
            int var21 = arg0.field2712[var20];
            int var22 = arg0.field2709[var20];
            int var23 = arg0.field2717[var20];
            int var24 = class170.field2716[var21];
            int var25 = class170.field2716[var22];
            int var26 = class170.field2716[var23];
            int var27 = class170.field2701[var21];
            int var28 = class170.field2701[var22];
            int var29 = class170.field2701[var23];
            if ((var24 - var25) * (var29 - var28) - (var26 - var25) * (var27 - var28) > 0) {
                if (class272.field4429 && class143.method994(class48.field750 + class31.field452, class95.field1407 + class31.field446, var27, var28, var29, var24, var25, var26)) {
                    class159.field2493 = arg5;
                    class307.field5181 = arg6;
                }
                if (!class166.field2625 && !arg7) {
                    class31.field456 = false;
                    if (var24 < 0 || var25 < 0 || var26 < 0 || var24 > class31.field453 || var25 > class31.field453 || var26 > class31.field453) {
                        class31.field456 = true;
                    }
                    if (arg0.field2710 == null || arg0.field2710[var20] == -1) {
                        if (arg0.field2706[var20] != 12345678) {
                            class31.method199(var27, var28, var29, var24, var25, var26, arg0.field2706[var20], arg0.field2707[var20], arg0.field2702[var20]);
                        }
                    } else if (!class241.field3863) {
                        int var30 = class31.field461.method693(2, arg0.field2710[var20]);
                        class31.method199(var27, var28, var29, var24, var25, var26, class52.method357(var30, arg0.field2706[var20]), class52.method357(var30, arg0.field2707[var20]), class52.method357(var30, arg0.field2702[var20]));
                    } else if (arg0.field2705) {
                        class31.method210(var27, var28, var29, var24, var25, var26, arg0.field2706[var20], arg0.field2707[var20], arg0.field2702[var20], class170.field2720[0], class170.field2720[1], class170.field2720[3], class170.field2711[0], class170.field2711[1], class170.field2711[3], class170.field2704[0], class170.field2704[1], class170.field2704[3], arg0.field2710[var20]);
                    } else {
                        class31.method210(var27, var28, var29, var24, var25, var26, arg0.field2706[var20], arg0.field2707[var20], arg0.field2702[var20], class170.field2720[var21], class170.field2720[var22], class170.field2720[var23], class170.field2711[var21], class170.field2711[var22], class170.field2711[var23], class170.field2704[var21], class170.field2704[var22], class170.field2704[var23], arg0.field2710[var20]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lmh;I)V", line = 150)
    public static final void method1240(class65 arg0, int arg1) {
        field2816++;
        if (arg1 < 64) {
            method1238(16);
        }
        if (class307.field5180) {
            return;
        }
        if (class166.field2625) {
            class190.method1358();
        } else {
            class54.method386();
        }
        class136.field2028 = class80.method575(4080, class245.field3929, arg0);
        int var2 = class14.field182;
        int var3 = var2 * 956 / 503;
        class136.field2028.method80((class188.field3055 - var3) / 2, 0, var3, var2);
        class68.field1024 = class81.method578(4, arg0, class165.field2609);
        class68.field1024.method44(class188.field3055 / 2 - (class68.field1024.field5306 / 2), 18);
        class307.field5180 = true;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)V", line = 195)
    public static void method1241(byte arg0) {
        int var1 = 33 % ((44 - arg0) / 39);
        field2813 = null;
        field2817 = null;
        field2814 = null;
        field2815 = null;
        field2812 = null;
        field2810 = null;
        field2807 = null;
    }
}
