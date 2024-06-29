import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class153 {

    @OriginalMember(owner = "client!w", name = "i", descriptor = "Lja;")
    public static class62 field3569 = class30.method243(43, "gelb:");

    @OriginalMember(owner = "client!w", name = "m", descriptor = "Lja;")
    public static class62 field3573 = class30.method243(43, "Startseite auf (WSpielkonto wiederherstellen(W)3");

    @OriginalMember(owner = "client!w", name = "c", descriptor = "Lja;")
    private static class62 field3563 = class30.method243(43, "Error loading your profile)3");

    @OriginalMember(owner = "client!w", name = "h", descriptor = "Lja;")
    private static class62 field3568 = class30.method243(43, "Bad session id)3");

    @OriginalMember(owner = "client!w", name = "b", descriptor = "[I")
    public static int[] field3562 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!w", name = "f", descriptor = "Lja;")
    public static class62 field3566 = field3568;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "Lja;")
    public static class62 field3567 = class30.method243(43, "Verbinde mit Server)3)3)3");

    @OriginalMember(owner = "client!w", name = "n", descriptor = "Lja;")
    public static class62 field3574 = class30.method243(43, "http:)4)4");

    @OriginalMember(owner = "client!w", name = "a", descriptor = "Lja;")
    public static class62 field3561 = field3563;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "I")
    public static int field3570 = 0;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "I")
    public static volatile int field3564 = -1;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "Lja;")
    public static class62 field3576 = class30.method243(43, "");

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!w", name = "o", descriptor = "[I")
    public static int[] field3575;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(BILja;)V")
    public static final void method1190(byte arg0, int arg1, class62 arg2) {
        class24.field599++;
        if (arg0 > 22) {
            field3571++;
            class136.field3140.method810(-2, 85);
            class136.field3140.method993(arg1, -90);
            class136.field3140.method994(arg2.method448(37), 99);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lpd;Lpd;Z)V")
    public static final void method1191(class108 arg0, class108 arg1, boolean arg2) {
        field3565++;
        class149.field3515 = arg0;
        class15.field361 = arg1;
        if (!arg2) {
            method1192((byte) -47);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V")
    public static void method1192(byte arg0) {
        field3574 = null;
        field3573 = null;
        field3568 = null;
        field3569 = null;
        field3563 = null;
        field3576 = null;
        field3567 = null;
        field3566 = null;
        field3561 = null;
        field3575 = null;
        int var1 = -101 / ((arg0 + 56) / 38);
        field3562 = null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I[B[Lwe;ZILka;)V")
    public static final void method1193(int arg0, byte[] arg1, class155[] arg2, boolean arg3, int arg4, class69 arg5) {
        field3572++;
        if (arg3) {
            method1190((byte) 53, -61, null);
        }
        class128 var6 = new class128(arg1);
        int var7 = -1;
        while (true) {
            int var8 = var6.method1001((byte) -112);
            if (var8 == 0) {
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method1001((byte) -79);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = var9 >> 6 & 0x3F;
                int var13 = var9 >> 12;
                int var14 = var6.method1025(255);
                int var15 = var14 & 0x3;
                int var16 = arg4 + var12;
                int var17 = arg0 + var11;
                int var18 = var14 >> 2;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var19 = var13;
                    class155 var20 = null;
                    if ((class155.field3581[1][var16][var17] & 0x2) == 2) {
                        var19 = var13 - 1;
                    }
                    if (var19 >= 0) {
                        var20 = arg2[var19];
                    }
                    class26.method208(var13, 76, var20, var17, var16, var15, var7, arg5, var18);
                }
            }
        }
    }
}
