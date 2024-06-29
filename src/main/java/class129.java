import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class129 {

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "Ljd;")
    public static class86 field2472 = class122.method868("leuchten2:", true);

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
    public static int field2477 = 0;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "Ljd;")
    public static class86 field2476 = class122.method868(" weitere Optionen", true);

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public static int field2473 = 100;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "Lrk;")
    public static class257 field2469 = new class257();

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "Ljd;")
    public static class86 field2478 = class122.method868("0", true);

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "Lbj;")
    public static class151 field2474;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "Z")
    public static boolean field2470;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
    public static void method909(int arg0) {
        field2474 = null;
        field2472 = null;
        field2469 = null;
        field2476 = null;
        field2478 = null;
        if (arg0 != 0) {
            method910((class6) null, -128);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lwj;I)Ljd;")
    public static final class86 method910(class6 arg0, int arg1) {
        field2475++;
        if (arg1 != 32515) {
            method909(-81);
        }
        if (class86.method629(107, client.method1111(arg0)) == 0) {
            return null;
        } else if (arg0.field197 == null || arg0.field197.method588(arg1 ^ 0xFFFF80FC).method612((byte) 112) == 0) {
            return class180.field3251 ? class200.field3591 : null;
        } else {
            return arg0.field197;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method911(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class157.field2961[arg0][var8][var14] == -class2.field22) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class35.field796[arg0][arg1][arg3] + arg5;
            if (!class55.method406(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class55.method406(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class55.method406(var9, var11, var13)) {
                return false;
            } else if (class55.method406(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class230.method1600(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class55.method406(var6 + 1, class35.field796[arg0][arg1][arg3] + arg5, var7 + 1) && class55.method406(var6 + 128 - 1, class35.field796[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class55.method406(var6 + 128 - 1, class35.field796[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class55.method406(var6 + 1, class35.field796[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lsk;IIIIIIZ)V")
    public static final void method912(class110 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field2111.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var22 = arg0.field2111[var9] - class81.field1591;
            int var23 = arg0.field2109[var9] - class205.field3697;
            int var24 = arg0.field2110[var9] - class191.field3389;
            int var25 = arg3 * var24 + arg4 * var22 >> 16;
            int var26 = arg4 * var24 - arg3 * var22 >> 16;
            int var28 = arg2 * var23 - arg1 * var26 >> 16;
            int var29 = arg1 * var23 + arg2 * var26 >> 16;
            if (var29 < 50) {
                return;
            }
            if (arg0.field2107 != null) {
                class110.field2100[var9] = var25;
                class110.field2117[var9] = var28;
                class110.field2113[var9] = var29;
            }
            class110.field2116[var9] = (var25 << 9) / var29 + class145.field2752;
            class110.field2115[var9] = (var28 << 9) / var29 + class145.field2758;
        }
        class145.field2755 = 0;
        int var10 = arg0.field2112.length;
        for (int var11 = 0; var11 < var10; var11++) {
            int var12 = arg0.field2112[var11];
            int var13 = arg0.field2108[var11];
            int var14 = arg0.field2104[var11];
            int var15 = class110.field2116[var12];
            int var16 = class110.field2116[var13];
            int var17 = class110.field2116[var14];
            int var18 = class110.field2115[var12];
            int var19 = class110.field2115[var13];
            int var20 = class110.field2115[var14];
            if ((var15 - var16) * (var20 - var19) - (var17 - var16) * (var18 - var19) > 0) {
                if (class243.field4352 && class39.method326(class145.field2752 + class139.field2651, class160.field3007 + class145.field2758, var18, var19, var20, var15, var16, var17)) {
                    class38.field897 = arg5;
                    class46.field1026 = arg6;
                }
                if (!arg7) {
                    class145.field2749 = false;
                    if (var15 < 0 || var16 < 0 || var17 < 0 || var15 > class145.field2753 || var16 > class145.field2753 || var17 > class145.field2753) {
                        class145.field2749 = true;
                    }
                    if (arg0.field2107 == null || arg0.field2107[var11] == -1) {
                        if (arg0.field2106[var11] != 12345678) {
                            class145.method1041(var18, var19, var20, var15, var16, var17, arg0.field2106[var11], arg0.field2097[var11], arg0.field2102[var11]);
                        }
                    } else if (!class107.field2061) {
                        int var21 = class145.field2756.method188((byte) -103, arg0.field2107[var11]);
                        class145.method1041(var18, var19, var20, var15, var16, var17, class247.method1677(var21, arg0.field2106[var11]), class247.method1677(var21, arg0.field2097[var11]), class247.method1677(var21, arg0.field2102[var11]));
                    } else if (arg0.field2105) {
                        class145.method1037(var18, var19, var20, var15, var16, var17, arg0.field2106[var11], arg0.field2097[var11], arg0.field2102[var11], class110.field2100[0], class110.field2100[1], class110.field2100[3], class110.field2117[0], class110.field2117[1], class110.field2117[3], class110.field2113[0], class110.field2113[1], class110.field2113[3], arg0.field2107[var11]);
                    } else {
                        class145.method1037(var18, var19, var20, var15, var16, var17, arg0.field2106[var11], arg0.field2097[var11], arg0.field2102[var11], class110.field2100[var12], class110.field2100[var13], class110.field2100[var14], class110.field2117[var12], class110.field2117[var13], class110.field2117[var14], class110.field2113[var12], class110.field2113[var13], class110.field2113[var14], arg0.field2107[var11]);
                    }
                }
            }
        }
    }
}
