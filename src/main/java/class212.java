import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class212 {

    @OriginalMember(owner = "client!te", name = "c", descriptor = "I")
    public int field3959;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "I")
    public int field3965;

    @OriginalMember(owner = "client!te", name = "m", descriptor = "I")
    public int field3969;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "I")
    public int field3962;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "Ldc;")
    public static class37 field3961 = class185.method1233((byte) 86, " (X");

    @OriginalMember(owner = "client!te", name = "d", descriptor = "I")
    public static int field3960 = 2;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "I")
    public static int field3963 = 0;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!te", name = "j", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!te", name = "k", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!te", name = "l", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "Lmf;")
    public static class136 field3964;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "Ldj;")
    public static class44 field3958;

    @OriginalMember(owner = "client!te", name = "n", descriptor = "[[[I")
    public static int[][][] field3970;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IBLdc;)V")
    public static final void method1407(int arg0, byte arg1, class37 arg2) {
        if (arg1 >= -9) {
            method1407(50, (byte) 124, null);
        }
        class37 var3 = arg2.method308((byte) -107).method317((byte) 59);
        boolean var4 = false;
        for (int var5 = 0; var5 < class76.field1342; var5++) {
            class123 var6 = class8.field107[class9.field122[var5]];
            if (var6 != null && var6.field2187 != null && var6.field2187.method303(var3, 40)) {
                var4 = true;
                class14.method91(0, var6.field3525[0], 2, var6.field3494[0], false, false, 0, 0, class238.field4382.field3494[0], 1, class238.field4382.field3525[0], 1);
                if (arg0 == 1) {
                    class49.field970.method1503(185, 2976);
                    class166.field3167++;
                    class49.field970.method181(class9.field122[var5], -1371695448);
                } else if (arg0 == 4) {
                    class191.field3575++;
                    class49.field970.method1503(228, 2976);
                    class49.field970.method181(class9.field122[var5], -1371695448);
                } else if (arg0 == 6) {
                    class183.field3382++;
                    class49.field970.method1503(245, 2976);
                    class49.field970.method197(class9.field122[var5], (byte) 51);
                } else if (arg0 == 7) {
                    class49.field970.method1503(52, 2976);
                    class49.field970.method184(class9.field122[var5], 14982);
                    class180.field3365++;
                }
                break;
            }
        }
        field3966++;
        if (!var4) {
            class215.method1418(0, -1, class80.method548(new class37[] { class81.field1433, var3 }, -79), class243.field4462);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIII)V")
    public static final void method1408(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class164.field3109 < 100) {
            class112.method777(96);
        }
        class48.method408(arg4, arg2, arg1 + arg4, arg2 + arg3);
        class169.method1128();
        class48.method420(arg4, arg2, arg1, arg3, 0);
        field3968++;
        if (class164.field3109 < 100) {
            byte var5 = 20;
            int var6 = arg1 / 2 + arg4;
            int var7 = arg3 / 2 + arg2 - var5 - 18;
            class48.method413(var6 - 152, var7, 304, 34, 9179409);
            class48.method413(var6 - 151, var7 + 1, 302, 32, 0);
            class48.method420(var6 - 150, var7 - -2, class164.field3109 * 3, 30, 9179409);
            class48.method420(class164.field3109 * 3 + var6 - 150, var7 + 2, 300 - class164.field3109 * 3, 30, 0);
            class32.field633.method621(class83.field1469, var6, var7 + var5, 16777215, -1);
            return;
        }
        class74.field1315 = class240.field4412 - (int) ((double) arg1 / class244.field4471);
        class63.field1159 = (int) ((double) (arg1 * 2) / class244.field4471);
        class70.field1267 = class20.field338 - (int) ((double) arg3 / class244.field4471);
        class138.field2687 = (int) ((double) (arg3 * 2) / class244.field4471);
        int var8 = 127 % ((-arg0 - 31) / 36);
        int var9 = class20.field338 - (int) ((double) arg3 / class244.field4471);
        int var10 = class240.field4412 - (int) ((double) arg1 / class244.field4471);
        int var11 = (int) ((double) arg1 / class244.field4471) + class240.field4412;
        int var12 = (int) ((double) arg3 / class244.field4471) + class20.field338;
        class155.method1051(arg2, var9, arg1 + arg4, 1, var10, var11, arg4, var12, arg2 + arg3);
        class12.method82(var12, arg4, arg2, var11, var10, -3, var9, arg1 + arg4, arg2 - -arg3);
        if (class13.field189 > 0) {
            class13.field189--;
        }
        if (!class183.field3378) {
            return;
        }
        int var13 = arg4 + arg1 - 5;
        int var14 = arg2 + arg3 - 8;
        class190.field3468.method623(class80.method548(new class37[] { class120.field2155, class151.method1034((byte) -9, class3.field25) }, -108), var13, var14, 16776960, -1);
        int var18 = var14 - 15;
        Runtime var15 = Runtime.getRuntime();
        int var16 = (int) ((var15.totalMemory() - var15.freeMemory()) / 1024L);
        int var17 = 16776960;
        if (var16 > 32768 && class16.field259) {
            var17 = 16711680;
        }
        if (var16 > 65536 && !class16.field259) {
            var17 = 16711680;
        }
        class190.field3468.method623(class80.method548(new class37[] { class64.field1160, class151.method1034((byte) -9, var16), class61.field1125 }, -52), var13, var18, var17, -1);
        var14 = var18 - 15;
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V")
    public class212() {
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V")
    public static void method1409(byte arg0) {
        field3970 = null;
        field3964 = null;
        field3961 = null;
        if (arg0 != -73) {
            field3960 = 51;
        }
        field3958 = null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IZ)[B")
    public static final byte[] method1410(int arg0, boolean arg1) {
        field3967++;
        if (!arg1) {
            method1407(-56, (byte) 16, null);
        }
        class7 var2 = (class7) class99.field1734.method87(117, (long) arg0);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class97.method646(12402, var4, var7);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class7(var3);
            class99.field1734.method92((long) arg0, var2, arg1);
        }
        return var2.field81;
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lte;)V")
    public class212(class212 arg0) {
        this.field3959 = arg0.field3959;
        this.field3965 = arg0.field3965;
        this.field3969 = arg0.field3969;
        this.field3962 = arg0.field3962;
    }
}
