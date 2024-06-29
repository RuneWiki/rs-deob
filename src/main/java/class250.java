import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class250 {

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "[I")
    public static int[] field4496 = new int[2000];

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "Z")
    public static boolean field4497 = false;

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "I")
    public static int field4506 = 0;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "[I")
    public static int[] field4500 = new int[256];

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
    public static int field4501 = -1;

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "Lhc;")
    public static class228 field4504 = new class228(5000);

    @OriginalMember(owner = "client!fj", name = "m", descriptor = "Lcf;")
    private static class93 field4508 = class147.method1066("Fps:", -48);

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    public static int field4499;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
    public static int field4502;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V")
    public static final void method1695(int arg0) {
        field4503++;
        class77.field1443.method294(0);
        if (arg0 != 19371) {
            field4496 = null;
        }
        class151.field2644.method294(0);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIII)V")
    public static final void method1696(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class144.field2499 < 100) {
            class61.method384(false);
        }
        field4499++;
        class75.method507(arg0, arg3, arg0 + arg4, arg1 + arg3);
        if (class144.field2499 < 100) {
            byte var5 = 20;
            int var6 = arg1 / 2 + arg3 - (var5 + 18);
            int var7 = arg4 / 2 + arg0;
            class75.method517(arg0, arg3, arg4, arg1, 0);
            class75.method513(var7 - 152, var6, 304, 34, 9179409);
            class75.method513(var7 - 151, var6 + 1, 302, 32, 0);
            class75.method517(var7 - 150, var6 + 2, class144.field2499 * 3, 30, 9179409);
            class75.method517(var7 + (class144.field2499 * 3) - 150, var6 + 2, 300 - (class144.field2499 * 3), 30, 0);
            class183.field3383.method1836(class1.field9, var7, var5 + var6, 16777215, -1);
            return;
        }
        class70.field1268 = class154.field2700 - (int) ((float) arg1 / class105.field1823);
        class133.field2331 = class71.field1287 - ((int) ((float) arg4 / class105.field1823));
        class29.field406 = (int) ((float) (arg4 * 2) / class105.field1823);
        class8.field107 = (int) ((float) (arg1 * 2) / class105.field1823);
        int var8 = class71.field1287 - ((int) ((float) arg4 / class105.field1823));
        int var9 = class154.field2700 - ((int) ((float) arg1 / class105.field1823));
        int var10 = (int) ((float) arg4 / class105.field1823) + class71.field1287;
        int var11 = class154.field2700 + ((int) ((float) arg1 / class105.field1823));
        class171.method1227(arg1 + arg3, arg0 - -arg4, (byte) -109, arg3, var11, arg0, var9, var8, var10);
        class151.method1084(arg1 + arg3, var9, arg0 + arg4, arg3, var8, var10, arg0, 0, var11);
        class253.method1713(true, arg0 + arg4, var10, arg3, var9, arg1 + arg3, arg0, var11, var8);
        if (class19.field258 > 0) {
            class48.field780--;
            if (class48.field780 == 0) {
                class48.field780 = 20;
                class19.field258--;
            }
        }
        if (class43.field673) {
            int var12 = arg4 + arg0 - 5;
            int var13 = arg3 + arg1 - 8;
            class140.field2436.method1833(class130.method949((byte) -77, new class93[] { field4508, class148.method1067(-7015, class156.field2765) }), var12, var13, 16776960, -1);
            int var18 = var13 - 15;
            Runtime var14 = Runtime.getRuntime();
            int var15 = 16776960;
            int var16 = (int) ((var14.totalMemory() - var14.freeMemory()) / 1024L);
            if (var16 > 65536) {
                var15 = 16711680;
            }
            class140.field2436.method1833(class130.method949((byte) -77, new class93[] { class150.field2630, class148.method1067(-7015, var16), class82.field1512 }), var12, var18, var15, -1);
            var13 = var18 - 15;
        }
        int var17 = 57 / ((29 - arg2) / 57);
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(I)V")
    public static void method1697(int arg0) {
        field4496 = null;
        field4508 = null;
        field4504 = null;
        int var1 = 76 % ((-arg0 - 51) / 60);
        field4500 = null;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(JZ)V")
    public static final void method1698(long arg0, boolean arg1) {
        field4507++;
        if (arg0 == 0L) {
            return;
        }
        if (class284.field5098 >= 100) {
            class263.method1764(0, (byte) -116, class178.field3144, class181.field3338);
            return;
        }
        class93 var3 = class205.method1454((byte) -25, arg0).method687(-96);
        for (int var4 = 0; var4 < class284.field5098; var4++) {
            if (class223.field4025[var4] == arg0) {
                class263.method1764(0, (byte) -116, class178.field3144, class130.method949((byte) -77, new class93[] { var3, class76.field1420 }));
                return;
            }
        }
        if (!arg1) {
            field4497 = true;
        }
        for (int var5 = 0; var5 < class145.field2567; var5++) {
            if (class284.field5095[var5] == arg0) {
                class263.method1764(0, (byte) -116, class178.field3144, class130.method949((byte) -77, new class93[] { class183.field3380, var3, class48.field781 }));
                return;
            }
        }
        if (var3.method667(class166.field2927.field4247, (byte) -128)) {
            class263.method1764(0, (byte) -116, class178.field3144, class5.field69);
            return;
        }
        class253.field4572++;
        class223.field4025[class284.field5098] = arg0;
        class164.field2889[class284.field5098++] = class205.method1454((byte) -93, arg0);
        class9.field128 = class193.field3542;
        class285.field5105.method1568(23, (byte) 90);
        class285.field5105.method1882(arg0, (byte) -126);
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(I)I")
    public static final int method1699(int arg0) {
        field4505++;
        if (arg0 > -92) {
            method1696(-41, -47, 60, 77, -82);
        }
        return 6;
    }
}
