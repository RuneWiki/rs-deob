import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class44 extends class178 {

    @OriginalMember(owner = "client!nn", name = "u", descriptor = "Ljava/lang/String;")
    public static String field696 = "";

    @OriginalMember(owner = "client!nn", name = "s", descriptor = "Lgd;")
    public static class325 field694 = new class325(64);

    @OriginalMember(owner = "client!nn", name = "v", descriptor = "I")
    public static int field697 = 0;

    @OriginalMember(owner = "client!nn", name = "x", descriptor = "[Ljava/lang/String;")
    public static String[] field699 = null;

    @OriginalMember(owner = "client!nn", name = "y", descriptor = "I")
    public static int field700 = 0;

    @OriginalMember(owner = "client!nn", name = "w", descriptor = "Lwn;")
    public static class30 field698 = new class30();

    @OriginalMember(owner = "client!nn", name = "p", descriptor = "I")
    public int field691;

    @OriginalMember(owner = "client!nn", name = "q", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!nn", name = "r", descriptor = "Ljava/lang/String;")
    public String field693;

    @OriginalMember(owner = "client!nn", name = "t", descriptor = "Ljava/lang/String;")
    public String field695;

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "(B)Ldi;", line = 17)
    public final class161 method386(byte arg0) {
        int var2 = -10 / ((arg0 - 36) / 63);
        field692++;
        return class104.field1715[this.field2836];
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lbc;IIIIIIZ)V", line = 28)
    public static final void method387(class127 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field2029.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var10 = arg0.field2029[var9] - class104.field1720;
            int var11 = arg0.field2038[var9] - class237.field3561;
            int var12 = arg0.field2030[var9] - class339.field5231;
            int var13 = arg3 * var12 + arg4 * var10 >> 16;
            int var14 = arg4 * var12 - arg3 * var10 >> 16;
            int var16 = arg2 * var11 - arg1 * var14 >> 16;
            int var17 = arg1 * var11 + arg2 * var14 >> 16;
            if (var17 < 50) {
                return;
            }
            if (arg0.field2033 != null) {
                class127.field2025[var9] = var13;
                class127.field2032[var9] = var16;
                class127.field2045[var9] = var17;
            }
            class127.field2039[var9] = (var13 << 9) / var17 + class40.field616;
            class127.field2040[var9] = (var16 << 9) / var17 + class40.field610;
        }
        class40.field607 = 0;
        int var19 = arg0.field2028.length;
        for (int var20 = 0; var20 < var19; var20++) {
            int var21 = arg0.field2028[var20];
            int var22 = arg0.field2042[var20];
            int var23 = arg0.field2044[var20];
            int var24 = class127.field2039[var21];
            int var25 = class127.field2039[var22];
            int var26 = class127.field2039[var23];
            int var27 = class127.field2040[var21];
            int var28 = class127.field2040[var22];
            int var29 = class127.field2040[var23];
            if ((var24 - var25) * (var29 - var28) - (var26 - var25) * (var27 - var28) > 0) {
                if (class30.field480 && class85.method674(class40.field616 + class257.field3809, class40.field610 + class243.field3638, var27, var28, var29, var24, var25, var26)) {
                    class289.field4552 = arg5;
                    class184.field2923 = arg6;
                }
                if (!class162.field2623 && !arg7) {
                    class40.field603 = false;
                    if (var24 < 0 || var25 < 0 || var26 < 0 || var24 > class40.field615 || var25 > class40.field615 || var26 > class40.field615) {
                        class40.field603 = true;
                    }
                    if (arg0.field2033 == null || arg0.field2033[var20] == -1) {
                        if (arg0.field2043[var20] != 12345678) {
                            class40.method359(var27, var28, var29, var24, var25, var26, arg0.field2043[var20], arg0.field2046[var20], arg0.field2036[var20]);
                        }
                    } else if (!class109.field1777) {
                        int var30 = class40.field614.method251(false, arg0.field2033[var20]);
                        class40.method359(var27, var28, var29, var24, var25, var26, class143.method1102(var30, arg0.field2043[var20]), class143.method1102(var30, arg0.field2046[var20]), class143.method1102(var30, arg0.field2036[var20]));
                    } else if (arg0.field2035) {
                        class40.method364(var27, var28, var29, var24, var25, var26, arg0.field2043[var20], arg0.field2046[var20], arg0.field2036[var20], class127.field2025[0], class127.field2025[1], class127.field2025[3], class127.field2032[0], class127.field2032[1], class127.field2032[3], class127.field2045[0], class127.field2045[1], class127.field2045[3], arg0.field2033[var20]);
                    } else {
                        class40.method364(var27, var28, var29, var24, var25, var26, arg0.field2043[var20], arg0.field2046[var20], arg0.field2036[var20], class127.field2025[var21], class127.field2025[var22], class127.field2025[var23], class127.field2032[var21], class127.field2032[var22], class127.field2032[var23], class127.field2045[var21], class127.field2045[var22], class127.field2045[var23], arg0.field2033[var20]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "(I)V", line = 152)
    public static void method388(int arg0) {
        int var1 = 101 / ((-arg0 - 6) / 56);
        field694 = null;
        field698 = null;
        field696 = null;
        field699 = null;
    }
}
