import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class248 extends class121 {

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
    public static int field3723 = 0;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field3724 = null;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3722 = "Checking for updates - ";

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "Z")
    public static volatile boolean field3729 = false;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
    public static int field3721;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method1632(String arg0, int arg1, int arg2) {
        field3730++;
        String var3 = class206.method1326((byte) 116, class266.method1766(12093, arg0));
        boolean var4 = false;
        if (arg2 != 14) {
            return;
        }
        for (int var5 = 0; var5 < class193.field2770; var5++) {
            class53 var6 = class194.field2777[class110.field1589[var5]];
            if (var6 != null && var6.field766 != null && var6.field766.equalsIgnoreCase(var3)) {
                var4 = true;
                class193.method1241(class55.field847.field50[0], var6.field119[0], 1, 1, false, class55.field847.field119[0], false, 0, 2, 0, var6.field50[0], 0);
                if (arg1 == 1) {
                    class149.field2125++;
                    class95.field1451.method522(128, arg2 + 28713);
                    class95.field1451.method794(class110.field1589[var5], (byte) -63);
                } else if (arg1 == 4) {
                    class54.field805++;
                    class95.field1451.method522(250, 28727);
                    class95.field1451.method794(class110.field1589[var5], (byte) -119);
                } else if (arg1 == 5) {
                    class95.field1451.method522(153, arg2 + 28713);
                    class226.field3389++;
                    class95.field1451.method794(class110.field1589[var5], (byte) -74);
                } else if (arg1 == 6) {
                    class95.field1451.method522(49, 28727);
                    class95.field1451.method761(-124, class110.field1589[var5]);
                    class272.field4314++;
                } else if (arg1 == 7) {
                    class95.field1451.method522(178, arg2 ^ 0x7039);
                    class95.field1451.method784(true, class110.field1589[var5]);
                    class166.field2418++;
                }
                break;
            }
        }
        if (!var4) {
            class255.method1712((byte) 72, class96.field1454 + var3, 0, "");
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method1633(byte arg0, String arg1) {
        if (arg0 != 58) {
            field3726 = -51;
        }
        field3727++;
        System.out.println("Error: " + class235.method1546(arg1, "%0a", "\n", -40));
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
    public static final void method1634(int arg0) {
        field3725++;
        if (arg0 != -10440) {
            field3723 = -104;
        }
        int var1 = class200.field2896;
        int var2 = class52.field763;
        int var3 = 6116423;
        int var4 = class218.field3225;
        int var5 = class178.field2544;
        class144.method955(var1, var5, var2, var4, var3);
        class144.method955(var1 + 1, var5 - -1, var2 - 2, 16, 0);
        class144.method951(var1 + 1, var5 + 18, var2 - 2, var4 + -19, 0);
        class179.field2556.method1270(class253.field3848, var1 + 3, var5 + 14, var3, -1);
        int var6 = class25.field345;
        int var7 = class190.field2688;
        for (int var8 = 0; var8 < class283.field4508; var8++) {
            int var9 = var5 + ((class283.field4508 - 1 + -var8) * 15) + 31;
            int var10 = 16777215;
            if (var6 > var1 && var6 < (var1 + var2) && var9 - 13 < var7 && var7 < var9 + 3) {
                var10 = 16776960;
            }
            class179.field2556.method1270(class274.method1849((byte) 98, var8), var1 + 3, var9, var10, 0);
        }
        class275.method1853(class52.field763, (byte) 88, class178.field2544, class218.field3225, class200.field2896);
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)V")
    public static final void method1635(int arg0) {
        class218.field3224.method257(false);
        if (arg0 < -15) {
            field3728++;
        }
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(I)V")
    public static void method1636(int arg0) {
        field3724 = null;
        if (arg0 == 17470) {
            field3722 = null;
        }
    }
}
