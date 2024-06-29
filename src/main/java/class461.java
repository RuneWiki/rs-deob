import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class461 {

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "[I")
    public static int[] field6381 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
    public static int field6379;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
    public static int field6380;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
    public static int field6382;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "Lat;")
    public static class380 field6378;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "([Lufa;I)V")
    public static final void method2565(class680[] arg0, int arg1) {
        class194.field2321 = arg0.length;
        field6380++;
        class587.field8211 = new class680[class194.field2321 + 10];
        class385.field5414 = new int[class194.field2321 + 10];
        class373.method2192(arg0, 0, class587.field8211, arg1, class194.field2321);
        for (int var2 = 0; var2 < class194.field2321; var2++) {
            class385.field5414[var2] = class587.field8211[var2].method663();
        }
        for (int var3 = class194.field2321; var3 < class587.field8211.length; var3++) {
            class385.field5414[var3] = 12;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IILjava/lang/String;II)V")
    public static final void method2566(int arg0, int arg1, String arg2, int arg3, int arg4) {
        field6382++;
        class218 var5 = class408.method2359((byte) 72, arg4, arg1);
        if (var5 == null) {
            return;
        }
        if (var5.field2804 != null) {
            class404 var6 = new class404();
            var6.field5709 = var5.field2804;
            var6.field5714 = var5;
            var6.field5712 = arg0;
            var6.field5706 = arg2;
            class498.method2775(var6);
        }
        if (class713.field9949 != 10 || !client.method1835(var5).method3965((byte) -72, arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            class473.field6553++;
            class103 var7 = class752.method4186(260, class312.field4232, class449.field6285);
            class471.method2650(arg1, -21568, arg4, var5.field2771, var7);
            class27.method104(false, var7);
        }
        if (arg0 == 2) {
            class436.field6116++;
            class103 var8 = class752.method4186(260, class133.field1706, class449.field6285);
            class471.method2650(arg1, -21568, arg4, var5.field2771, var8);
            class27.method104(false, var8);
        }
        if (arg0 == 3) {
            class364.field4810++;
            class103 var9 = class752.method4186(260, class756.field10555, class449.field6285);
            class471.method2650(arg1, -21568, arg4, var5.field2771, var9);
            class27.method104(false, var9);
        }
        if (arg0 == 4) {
            class610.field8516++;
            class103 var10 = class752.method4186(260, class591.field8247, class449.field6285);
            class471.method2650(arg1, -21568, arg4, var5.field2771, var10);
            class27.method104(false, var10);
        }
        if (arg0 == 5) {
            class729.field10179++;
            class103 var11 = class752.method4186(260, class487.field6678, class449.field6285);
            class471.method2650(arg1, -21568, arg4, var5.field2771, var11);
            class27.method104(false, var11);
        }
        if (arg3 > -114) {
            method2566(-106, 15, null, 96, 60);
        }
        if (arg0 == 6) {
            class312.field4229++;
            class103 var12 = class752.method4186(260, class388.field5471, class449.field6285);
            class471.method2650(arg1, -21568, arg4, var5.field2771, var12);
            class27.method104(false, var12);
        }
        if (arg0 == 7) {
            class726.field10134++;
            class103 var13 = class752.method4186(260, class465.field6441, class449.field6285);
            class471.method2650(arg1, -21568, arg4, var5.field2771, var13);
            class27.method104(false, var13);
        }
        if (arg0 == 8) {
            class354.field4719++;
            class103 var14 = class752.method4186(260, class116.field1533, class449.field6285);
            class471.method2650(arg1, -21568, arg4, var5.field2771, var14);
            class27.method104(false, var14);
        }
        if (arg0 == 9) {
            class386.field5432++;
            class103 var15 = class752.method4186(260, class30.field256, class449.field6285);
            class471.method2650(arg1, -21568, arg4, var5.field2771, var15);
            class27.method104(false, var15);
        }
        if (arg0 == 10) {
            class11.field62++;
            class103 var16 = class752.method4186(260, class380.field5266, class449.field6285);
            class471.method2650(arg1, -21568, arg4, var5.field2771, var16);
            class27.method104(false, var16);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V")
    public static void method2567(int arg0) {
        field6378 = null;
        field6381 = null;
        if (arg0 != 10) {
            field6381 = null;
        }
    }
}
