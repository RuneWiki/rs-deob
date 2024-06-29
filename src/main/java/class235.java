import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class235 {

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "[I")
    private int[] field3129;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "[Z")
    public static boolean[] field3128 = new boolean[100];

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "[I")
    public static int[] field3135 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "([I)V")
    public class235(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field3129 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field3129[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field3129[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field3129[var5 + var5] = arg0[var4];
            this.field3129[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V")
    public static void method1405(int arg0) {
        field3135 = null;
        field3128 = null;
        if (arg0 != -16777216) {
            method1411((byte) 54, (class405) null);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILlm;Llm;)V")
    public static final void method1406(int arg0, class347 arg1, class347 arg2) {
        if (arg0 == -1) {
            field3132++;
            class328.field4777 = arg1;
            class1.field19 = arg2;
        }
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(I)V")
    public static final void method1407(int arg0) {
        field3133++;
        for (class413 var1 = (class413) class407.field6039.method997(false); var1 != null; var1 = (class413) class407.field6039.method997(false)) {
            class44.method320(arg0 ^ 0x46D1, var1);
        }
        client.method1537();
        client.method1542();
        client.method1530();
        client.method1529();
        if (arg0 == 1) {
            client.method1543();
            client.method1540();
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IB)I")
    public final int method1408(int arg0, byte arg1) {
        field3137++;
        int var3 = (this.field3129.length >> 1) - 1;
        int var4 = var3 & arg0;
        if (arg1 != -56) {
            this.field3129 = null;
        }
        while (true) {
            int var5 = this.field3129[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field3129[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lps;ZB)V")
    public static final void method1409(class394 arg0, boolean arg1, byte arg2) {
        field3130++;
        int var3 = arg0.field5657 == 0 ? arg0.field5773 : arg0.field5657;
        int var4 = arg0.field5771 == 0 ? arg0.field5672 : arg0.field5771;
        class38.method277(class365.field5292[arg0.field5698 >> 16], arg0.field5698, arg1, arg2 + 10853, var3, var4);
        if (arg0.field5820 != null) {
            class38.method277(arg0.field5820, arg0.field5698, arg1, 10743, var3, var4);
        }
        class169 var5 = (class169) class99.field1377.method384((long) arg0.field5698, true);
        if (arg2 != -110) {
            method1412(101, (class405) null);
        }
        if (var5 != null) {
            class181.method1103(arg1, var4, var3, -1, var5.field2275);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IILlm;I)Lwp;")
    public static final class245 method1410(int arg0, int arg1, class347 arg2, int arg3) {
        field3136++;
        byte[] var4 = arg2.method2261(arg3, arg1, 97);
        if (arg0 != -7137) {
            field3128 = null;
        }
        return var4 == null ? null : new class245(var4);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BLii;)V")
    public static final void method1411(byte arg0, class405 arg1) {
        field3131++;
        int var2 = class99.field1385;
        int var3 = class435.field6395;
        int var4 = class390.field5616;
        int var5 = class183.field2485;
        int var6 = -10660793;
        arg1.method2610(var5, var6, true, var4, var2, var3);
        arg1.method2610(16, -16777216, true, var4 - 2, var2 - -1, var3 + 1);
        arg1.method2616(var5 - 19, 1, var2 + 1, var4 + -2, -16777216, var3 + 18);
        if (arg0 != 89) {
            method1406(-66, (class347) null, (class347) null);
        }
        class422.field6227.method1878(var3 + 14, -1, var6, class435.field6401, (byte) 10, var2 + 3);
        int var7 = class124.field1728;
        int var8 = class323.field4747;
        int var9 = 0;
        for (class212 var10 = (class212) class321.field4726.method332(-2130841184); var10 != null; var10 = (class212) class321.field4726.method343((byte) -114)) {
            int var11 = var3 + ((class212.field2844 - var9 - 1) * 16) + 31;
            short var12 = -1;
            if (var7 > var2 && var7 < var2 + var4 && var8 > (var11 - 13) && var11 + 3 > var8) {
                var12 = -256;
            }
            int[] var13 = null;
            if (class355.method2331(arg0 ^ 0xFFFFFFDF, var10.field2836)) {
                var13 = class9.method74((int) var10.field2830, (byte) -95).field1140;
            } else if (class56.method386(var10.field2836, (byte) 67)) {
                class43 var14 = class306.field4496[(int) var10.field2830];
                if (var14 != null) {
                    var13 = var14.field606.field3388;
                }
            } else if (class379.method2462(var10.field2836, (byte) 44)) {
                if (var10.field2836 == 1008) {
                    var13 = class329.method2190((byte) 63, (int) var10.field2830).field1484;
                } else {
                    var13 = class329.method2190((byte) 63, (int) (var10.field2830 >>> 32 & 0x7FFFFFFFL)).field1484;
                }
            }
            String var15 = class397.method2556((byte) 114, var10);
            if (var13 != null) {
                var15 = var15 + class110.method727(false, var13);
            }
            class422.field6227.method1889(var12, var2 + 3, arg0 + -189, var11, class223.field2948, var15, class363.field5240, 0);
            var9++;
        }
        class162.method996((byte) -50, class183.field2485, class99.field1385, class435.field6395, class390.field5616);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILii;)V")
    public static final void method1412(int arg0, class405 arg1) {
        field3134++;
        if (class397.field5909.method339(arg0 ^ 0x503B) == 0) {
            return;
        }
        if (class373.field5422 == 0 || class373.field5422 == 2) {
            for (class430 var4 = (class430) class397.field5909.method332(-2130841184); var4 != null; var4 = (class430) class397.field5909.method343((byte) -83)) {
                class339.method2219(var4.field6320, var4.field6318, arg1, var4.field6311, class294.field4209, var4.field6323 ? class227.field2988.field341 : null, arg1, false, false, var4.field6312, arg0 + 20578, var4.field6326);
                var4.method322(11);
            }
            class145.method927(0);
        } else {
            if (class385.field5588 == null) {
                Canvas var2 = new Canvas();
                var2.setSize(36, 32);
                class385.field5588 = class405.method2611(arg0 + 30981, var2, class328.field4780, class76.field1085, 0, 0);
                class304.field4461 = class385.field5588.method1683(class271.method1868(arg0 + 20678, class156.field2117, 0, class291.field4169), class441.method2779(class362.field5227, class156.field2117, 0), true);
            }
            for (class430 var3 = (class430) class397.field5909.method332(-2130841184); var3 != null; var3 = (class430) class397.field5909.method343((byte) -76)) {
                class339.method2219(var3.field6320, var3.field6318, arg1, var3.field6311, class304.field4461, var3.field6323 ? class227.field2988.field341 : null, class385.field5588, false, false, var3.field6312, -1, var3.field6326);
                var3.method322(11);
            }
        }
        if (arg0 != -20579) {
            field3135 = null;
        }
    }
}
