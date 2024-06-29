import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class436 {

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field6442 = new String[100];

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "I")
    public static int field6438;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
    public static int field6439;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
    public static int field6441;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "I")
    public static int field6443;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "Lmg;")
    public static class103 field6440;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
    public static final void method2697(int arg0) {
        field6439++;
        class233.method1631(2, class193.field3258.field7246, 22050, (byte) -87);
        class101.field1434 = new class291();
        class101.field1434.method1873(1046, 128, 9);
        class532.field7841 = class32.method225(0, class360.field5349, false, class111.field1557, 22050);
        if (arg0 > -70) {
            field6442 = null;
        }
        class532.field7841.method1071(true, class101.field1434);
        class419.method2621(class338.field5040, class341.field5069, class101.field1434, class409.field6102, 1);
        class98.field1401 = class32.method225(1, class360.field5349, false, class111.field1557, 2048);
        class359.field5328 = new class41();
        class98.field1401.method1071(true, class359.field5328);
        class180.field2705 = new class333(22050, class40.field540);
        class408.field6097 = class313.field4720.method2537("scape main", -44);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Z)V")
    public static final void method2698(boolean arg0) {
        if (arg0) {
            field6442 = null;
        }
        field6438++;
        class1.field3.method993(112);
        for (class295 var1 = (class295) class456.field6644.method1004((byte) -92); var1 != null; var1 = (class295) class456.field6644.method996(1)) {
            if (var1.field4498 < 1000) {
                var1.method2677(-22491);
                class1.field3.method994(var1, -3610);
            }
        }
        class1.field3.method995((byte) 92, class456.field6644);
        int var2 = -1;
        class28 var3 = (class28) class102.field1459.method1004((byte) -86);
        if (var3 != null) {
            var2 = var3.method190(16711680);
        }
        if (!class307.field4631) {
            if (var2 == 0 && (class154.field2289 == 1 && class382.field5752 > 2 || class2.method5(-2001))) {
                var2 = 2;
            }
            if (var2 == 2 && class382.field5752 > 0 && var3 != null) {
                if (class116.field1752 == null && class76.field1102 == 0) {
                    class503.method2989(var3.method194(2170), 26, var3.method195((byte) 90));
                } else {
                    class398.field5956 = 2;
                }
            }
            if (var2 == 0 && class382.field5752 > 0) {
                class530.method3138(-106);
            }
            if (class116.field1752 == null && class76.field1102 == 0) {
                class524.field7661 = null;
                class398.field5956 = 0;
                return;
            }
            return;
        }
        if (var2 == -1) {
            int var4 = class184.field2800.method542(false);
            int var5 = class184.field2800.method543(true);
            if ((class521.field7630 - 10) > var4 || (class521.field7630 + class498.field7158 + 10) < var4 || var5 < class397.field5941 - 10 || var5 > (class397.field5941 + class267.field4085 + 10)) {
                class270.method1785(10);
            }
        }
        if (var2 != 0) {
            return;
        }
        int var6 = class521.field7630;
        int var7 = class397.field5941;
        int var8 = class498.field7158;
        int var9 = var3.method195((byte) 109);
        int var10 = var3.method194(2170);
        int var11 = -1;
        for (int var12 = 0; var12 < class382.field5752; var12++) {
            if (class432.field6402) {
                int var17 = (class382.field5752 - var12 - 1) * 16 + var7 + 33;
                if (var9 > var6 && var9 < (var6 + var8) && var17 - 13 < var10 && (var17 + 4) > var10) {
                    var11 = var12;
                }
            } else {
                int var16 = (class382.field5752 - var12 - 1) * 16 + (var7 + 31);
                if (var6 < var9 && var6 + var8 > var9 && var10 > (var16 - 13) && (var16 + 3) > var10) {
                    var11 = var12;
                }
            }
        }
        if (var11 != -1) {
            int var13 = 0;
            class249 var14 = new class249(class456.field6644);
            for (class295 var15 = (class295) var14.method1679(-128); var15 != null; var15 = (class295) var14.method1682((byte) -87)) {
                if (var11 == var13) {
                    class153.method1055(var9, var10, 1, var15);
                }
                var13++;
            }
        }
        class270.method1785(10);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)V")
    public static void method2699(byte arg0) {
        if (arg0 != 43) {
            field6442 = null;
        }
        field6442 = null;
        field6440 = null;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIILjt;Z)V")
    public static final void method2700(int arg0, int arg1, int arg2, class69 arg3, boolean arg4) {
        field6441++;
        if (arg4) {
            field6442 = null;
        }
        for (class101 var5 = (class101) class251.field3891.method1004((byte) -55); var5 != null; var5 = (class101) class251.field3891.method996(1)) {
            if (var5.field1440 == arg1 && (arg0 << 7) == var5.field1451 && (arg2 << 7) == var5.field1433 && var5.field1447.field964 == arg3.field964) {
                if (var5.field1443 != null) {
                    class359.field5328.method385(var5.field1443);
                    var5.field1443 = null;
                }
                if (var5.field1454 != null) {
                    class359.field5328.method385(var5.field1454);
                    var5.field1454 = null;
                }
                var5.method2677(-22491);
                return;
            }
        }
    }
}
