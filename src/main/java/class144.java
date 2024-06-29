import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class144 {

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "Lsc;")
    private static class128 field3359 = class129.method1017(false, " has logged out)3");

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "Lsc;")
    public static class128 field3357 = field3359;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "Lsc;")
    private static class128 field3361 = class129.method1017(false, "Bad session id)3");

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "[I")
    public static int[] field3362 = new int[50];

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public static int field3355 = 0;

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "Lsc;")
    private static class128 field3363 = class129.method1017(false, " more options");

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "Lsc;")
    public static class128 field3356 = field3363;

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "Lsc;")
    public static class128 field3365 = field3361;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "Lbb;")
    public static class10 field3353;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "Lhe;")
    public static class54 field3358;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIII)V")
    public static final void method1168(int arg0, int arg1, int arg2, int arg3) {
        if (~class50.field967 != arg1 && arg0 != 0 && class55.field1232 < 50) {
            field3362[class55.field1232] = arg3;
            class60.field1301[class55.field1232] = arg0;
            class64.field1401[class55.field1232] = arg2;
            class93.field2132[class55.field1232] = null;
            class110.field2490[class55.field1232] = 0;
            class55.field1232++;
        }
        field3360++;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
    public static final void method1169(int arg0) {
        class158.field3626.method508(104);
        field3354++;
        int var1 = class158.field3626.method512(8, (byte) -78);
        if (class41.field767 > var1) {
            for (int var2 = var1; var2 < class41.field767; var2++) {
                class124.field2799[class97.field2260++] = class68.field1528[var2];
            }
        }
        if (var1 > class41.field767) {
            throw new RuntimeException("gnpov1");
        }
        class41.field767 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var5 = class68.field1528[var3];
            class51 var6 = class92.field2104[var5];
            int var7 = class158.field3626.method512(1, (byte) -78);
            if (var7 == 0) {
                class68.field1528[class41.field767++] = var5;
                var6.field1006 = class29.field554;
            } else {
                int var8 = class158.field3626.method512(2, (byte) -78);
                if (var8 == 0) {
                    class68.field1528[class41.field767++] = var5;
                    var6.field1006 = class29.field554;
                    class55.field1228[class124.field2802++] = var5;
                } else if (var8 == 1) {
                    class68.field1528[class41.field767++] = var5;
                    var6.field1006 = class29.field554;
                    int var9 = class158.field3626.method512(3, (byte) -78);
                    var6.method386(-128, false, var9);
                    int var10 = class158.field3626.method512(1, (byte) -78);
                    if (var10 == 1) {
                        class55.field1228[class124.field2802++] = var5;
                    }
                } else if (var8 == 2) {
                    class68.field1528[class41.field767++] = var5;
                    var6.field1006 = class29.field554;
                    int var11 = class158.field3626.method512(3, (byte) -78);
                    var6.method386(-79, true, var11);
                    int var12 = class158.field3626.method512(3, (byte) -78);
                    var6.method386(-124, true, var12);
                    int var13 = class158.field3626.method512(1, (byte) -78);
                    if (var13 == 1) {
                        class55.field1228[class124.field2802++] = var5;
                    }
                } else if (var8 == 3) {
                    class124.field2799[class97.field2260++] = var5;
                }
            }
        }
        int var4 = 61 % ((-arg0 - 76) / 37);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lsf;Lsf;ILsf;Lsf;)V")
    public static final void method1170(class131 arg0, class131 arg1, int arg2, class131 arg3, class131 arg4) {
        field3366++;
        class64.field1406 = arg0;
        if (arg2 > -87) {
            return;
        }
        class105.field2386 = arg1;
        class154.field3527 = arg4;
        class153.field3521 = arg3;
        class123.field2791 = new class54[class153.field3521.method1044(-7)][];
        class64.field1393 = new boolean[class153.field3521.method1044(-7)];
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V")
    public static void method1171(byte arg0) {
        field3362 = null;
        field3353 = null;
        if (arg0 > -57) {
            field3361 = null;
        }
        field3356 = null;
        field3365 = null;
        field3363 = null;
        field3361 = null;
        field3359 = null;
        field3357 = null;
        field3358 = null;
    }
}
