import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class579 {

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "Z")
    public boolean field7994 = true;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "Lnn;")
    public static class446 field7998 = new class446(10, 6);

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "Lcb;")
    public static class318 field8001 = new class318(16, 6);

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "C")
    private char field7995;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    public static int field7991;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    public static int field7992;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public static int field7993;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
    public static int field7996;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "I")
    public int field7999;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
    public static int field8000;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "Lq;")
    public static class111 field8002;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "Ljava/lang/String;")
    public String field7997;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BILdga;)V")
    private final void method3255(byte arg0, int arg1, class138 arg2) {
        if (arg1 == 1) {
            this.field7995 = class679.method3748(arg2.method950(false), -161);
        } else if (arg1 == 2) {
            this.field7999 = arg2.method943(-92);
        } else if (arg1 == 4) {
            this.field7994 = false;
        } else if (arg1 == 5) {
            this.field7997 = arg2.method907(false);
        }
        if (arg0 != 93) {
            this.method3258(-105, null);
        }
        field7996++;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IILfa;Lfca;Loa;IIII)V")
    public static final void method3256(int arg0, int arg1, class185 arg2, class188 arg3, class689 arg4, int arg5, int arg6, int arg7, int arg8) {
        field7992++;
        if (arg1 != 2) {
            return;
        }
        class679 var9 = class665.field9460.method218(arg5, (byte) 13);
        if (var9 == null || !var9.field9627 || !var9.method3747((byte) 122, class327.field4771)) {
            return;
        }
        if (var9.field9641 != null) {
            int[] var10 = new int[var9.field9641.length];
            for (int var11 = 0; var11 < var10.length / 2; var11++) {
                int var13;
                if (class42.field546 == 4) {
                    var13 = (int) class620.field8432 & 0x3FFF;
                } else {
                    var13 = (int) class620.field8432 + class254.field3506 & 0x3FFF;
                }
                int var14 = class654.field9259[var13];
                int var15 = class654.field9260[var13];
                if (class42.field546 != 4) {
                    var14 = var14 * 256 / (class461.field6281 + 256);
                    var15 = var15 * 256 / (class461.field6281 + 256);
                }
                var10[var11 * 2] = arg7 - (-(arg3.field2438 / 2) - ((var9.field9641[var11 * 2] * 4 + arg6) * var15 + (var9.field9641[var11 * 2 + 1] * 4 + arg0) * var14 >> 14));
                var10[var11 * 2 + 1] = arg3.field2371 / 2 + (arg8 - ((var9.field9641[var11 * 2 + 1] * 4 + arg0) * var15 - ((var9.field9641[var11 * 2] * 4 + arg6) * var14) >> 14));
            }
            class508.method2874(arg4, var10, var9.field9623, arg3.field2381, arg3.field2327);
            for (int var12 = 0; var12 < var10.length / 2 - 1; var12++) {
                arg4.method2000(var10[var12 * 2], var10[var12 * 2 + 1], var10[var12 * 2 + 2], var10[(var12 + 1) * 2 + 1], var9.field9632, 1, arg2, arg7, arg8);
            }
            arg4.method2000(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field9632, 1, arg2, arg7, arg8);
        }
        class424 var16 = null;
        if (var9.field9626 != -1) {
            var16 = var9.method3749(arg4, false, (byte) -102);
            if (var16 != null) {
                class331.method2118(arg0, arg6, arg7, arg8, arg2, arg3, var16, 60);
            }
        }
        if (var9.field9633 == null) {
            return;
        }
        int var17 = 0;
        if (var16 != null) {
            var17 = var16.method1154();
        }
        class301 var18 = class426.field5926;
        class598 var19 = class641.field8904;
        if (var9.field9643 == 1) {
            var19 = class278.field3769;
            var18 = class395.field5658;
        }
        if (var9.field9643 == 2) {
            var18 = class622.field8452;
            var19 = class446.field6129;
        }
        class535.method3023((byte) -110, arg6, var18, arg3, var9.field9619, var19, var9.field9633, arg8, var17, arg2, arg0, arg7);
        return;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V")
    public static void method3257(byte arg0) {
        field7998 = null;
        if (arg0 < -56) {
            field8002 = null;
            field8001 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILdga;)V")
    public final void method3258(int arg0, class138 arg1) {
        field8000++;
        while (true) {
            int var3 = arg1.method957((byte) -126);
            if (var3 == 0) {
                if (arg0 <= 105) {
                    method3257((byte) -11);
                    return;
                } else {
                    return;
                }
            }
            this.method3255((byte) 93, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)Z")
    public final boolean method3259(int arg0) {
        field7991++;
        if (arg0 >= -109) {
            this.method3255((byte) 27, 98, null);
        }
        return this.field7995 == 's';
    }
}
