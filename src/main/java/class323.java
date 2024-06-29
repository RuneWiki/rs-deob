import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nha")
public class class323 {

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "Z")
    public boolean field4606 = true;

    @OriginalMember(owner = "client!nha", name = "f", descriptor = "Lqe;")
    public static class469 field4611 = new class469(74, 6);

    @OriginalMember(owner = "client!nha", name = "c", descriptor = "C")
    private char field4608;

    @OriginalMember(owner = "client!nha", name = "b", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!nha", name = "e", descriptor = "I")
    public int field4610;

    @OriginalMember(owner = "client!nha", name = "h", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!nha", name = "i", descriptor = "I")
    public static int field4614;

    @OriginalMember(owner = "client!nha", name = "j", descriptor = "I")
    public static int field4615;

    @OriginalMember(owner = "client!nha", name = "d", descriptor = "Lvd;")
    public static class39 field4609;

    @OriginalMember(owner = "client!nha", name = "g", descriptor = "Ljava/lang/String;")
    public String field4612;

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(ZLrg;)V", line = 9)
    public final void method2053(boolean arg0, class645 arg1) {
        if (!arg0) {
            return;
        }
        while (true) {
            int var3 = arg1.method3745(-6314);
            if (var3 == 0) {
                field4613++;
                return;
            }
            this.method2056(var3, arg1, -125);
        }
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(B)V", line = 30)
    public static void method2054(byte arg0) {
        field4609 = null;
        field4611 = null;
        if (arg0 != 4) {
            method2057(-49, -115, null, null, 122, -30, -89, null, null, -18, 62, 118, -96);
        }
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(I)Z", line = 44)
    public final boolean method2055(int arg0) {
        if (arg0 != 6) {
            method2057(41, -117, null, null, 3, 94, -14, null, null, 2, -20, 18, -108);
        }
        field4615++;
        return this.field4608 == 's';
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(ILrg;I)V", line = 60)
    private final void method2056(int arg0, class645 arg1, int arg2) {
        field4607++;
        if (arg2 > -121) {
            return;
        }
        if (arg0 == 1) {
            this.field4608 = class33.method166(false, arg1.method3743(true));
        } else if (arg0 == 2) {
            this.field4610 = arg1.method3720(-19541);
        } else if (arg0 == 4) {
            this.field4606 = false;
        } else if (arg0 == 5) {
            this.field4612 = arg1.method3752(-2);
            return;
        }
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(II[I[IIII[F[FIIII)V", line = 93)
    public static final void method2057(int arg0, int arg1, int[] arg2, int[] arg3, int arg4, int arg5, int arg6, float[] arg7, float[] arg8, int arg9, int arg10, int arg11, int arg12) {
        field4614++;
        int var13 = arg0 * arg12 + arg10;
        if (arg11 <= 115) {
            field4609 = null;
        }
        int var14 = arg4 * arg6 + arg5;
        int var15 = arg0 - arg9;
        int var16 = arg4 - arg9;
        if (arg2 == null) {
            for (int var17 = 0; var17 < arg1; var17++) {
                int var18 = arg9 + var13;
                while (var13 < var18) {
                    arg8[var14++] = arg7[var13++];
                }
                var13 += var15;
                var14 += var16;
            }
        } else if (arg7 == null) {
            for (int var21 = 0; var21 < arg1; var21++) {
                int var22 = var13 + arg9;
                while (var22 > var13) {
                    arg3[var14++] = arg2[var13++];
                }
                var13 += var15;
                var14 += var16;
            }
        } else {
            for (int var19 = 0; var19 < arg1; var19++) {
                int var20 = arg9 + var13;
                while (var13 < var20) {
                    arg3[var14] = arg2[var13];
                    arg8[var14++] = arg7[var13++];
                }
                var14 += var16;
                var13 += var15;
            }
        }
    }
}
