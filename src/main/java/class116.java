import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class116 {

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public static int field2729 = 2;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "Lid;")
    public static class60 field2730 = class11.method72("p11_full", (byte) -46);

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "Lte;")
    public static class137 field2734 = null;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "Lqd;")
    public static class115 field2733 = new class115(64);

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "Lid;")
    public static class60 field2737 = class11.method72("sl_back", (byte) 125);

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "Lid;")
    public static class60 field2735 = class11.method72(":", (byte) 114);

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "Z")
    public static boolean field2738 = false;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "[I")
    public static int[] field2739 = new int[50];

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "Ldd;")
    public static class26 field2731;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "[I")
    public static int[] field2736;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IB)Lb;")
    public static final class8 method921(int arg0, byte arg1) {
        field2732++;
        class8 var2 = (class8) class47.field1239.method918(arg1 + 9, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class141.field3217.method473((byte) 107, 16, arg0);
        class8 var4 = new class8();
        if (arg1 != -74) {
            return null;
        }
        if (var3 != null) {
            var4.method55(false, new class103(var3));
        }
        class47.field1239.method914(var4, (long) arg0, (byte) 123);
        return var4;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
    public static void method922(int arg0) {
        field2730 = null;
        field2733 = null;
        field2731 = null;
        field2739 = null;
        if (arg0 == 3) {
            field2735 = null;
            field2737 = null;
            field2736 = null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V")
    public static final void method923(byte arg0) {
        field2728++;
        int var1 = class56.field1393.method1205(false, 8);
        if (class44.field1170 > var1) {
            for (int var2 = var1; var2 < class44.field1170; var2++) {
                class141.field3213[class105.field2589++] = class121.field2781[var2];
            }
        }
        if (class44.field1170 < var1) {
            throw new RuntimeException("gppov1");
        }
        class44.field1170 = 0;
        int var3 = 0;
        if (arg0 > -42) {
            method922(107);
        }
        while (var1 > var3) {
            int var4 = class121.field2781[var3];
            class1 var5 = class81.field2016[var4];
            int var6 = class56.field1393.method1205(false, 1);
            if (var6 == 0) {
                class121.field2781[class44.field1170++] = var4;
                var5.field863 = class82.field2065;
            } else {
                int var7 = class56.field1393.method1205(false, 2);
                if (var7 == 0) {
                    class121.field2781[class44.field1170++] = var4;
                    var5.field863 = class82.field2065;
                    class19.field471[class35.field884++] = var4;
                } else if (var7 == 1) {
                    class121.field2781[class44.field1170++] = var4;
                    var5.field863 = class82.field2065;
                    int var8 = class56.field1393.method1205(false, 3);
                    var5.method259(var8, false, false);
                    int var9 = class56.field1393.method1205(false, 1);
                    if (var9 == 1) {
                        class19.field471[class35.field884++] = var4;
                    }
                } else if (var7 == 2) {
                    class121.field2781[class44.field1170++] = var4;
                    var5.field863 = class82.field2065;
                    int var10 = class56.field1393.method1205(false, 3);
                    var5.method259(var10, false, true);
                    int var11 = class56.field1393.method1205(false, 3);
                    var5.method259(var11, false, true);
                    int var12 = class56.field1393.method1205(false, 1);
                    if (var12 == 1) {
                        class19.field471[class35.field884++] = var4;
                    }
                } else if (var7 == 3) {
                    class141.field3213[class105.field2589++] = var4;
                }
            }
            var3++;
        }
    }
}
