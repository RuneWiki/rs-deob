import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class171 {

    @OriginalMember(owner = "client!se", name = "b", descriptor = "Z")
    public static boolean field2263 = false;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "Lcja;")
    public static class83 field2262 = new class83();

    @OriginalMember(owner = "client!se", name = "e", descriptor = "Lrn;")
    public static class633 field2266 = new class633(14, -1);

    @OriginalMember(owner = "client!se", name = "d", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "Lwm;")
    public static class30 field2264;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V", line = 9)
    public static void method1079(byte arg0) {
        if (arg0 == 40) {
            field2262 = null;
            field2266 = null;
            field2264 = null;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V", line = 21)
    public static final void method1080(int arg0) {
        field2265++;
        int var1 = class356.field4337.method1522(13763);
        class449.field5854 = class356.field4337.method1511(128);
        int var2 = class356.field4337.method1531((byte) -2);
        int var3 = class356.field4337.method1531((byte) -2);
        boolean var4 = class356.field4337.method1522(arg0 - 51747) == 1;
        class333.method1925(0);
        class413.method2393((byte) 72, var1);
        class356.field4337.method4021((byte) 48);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var20 = 0; var20 < class240.field3280 >> 3; var20++) {
                for (int var21 = 0; var21 < class276.field3602 >> 3; var21++) {
                    int var22 = class356.field4337.method4023(true, 1);
                    if (var22 == 1) {
                        class788.field10788[var5][var20][var21] = class356.field4337.method4023(true, 26);
                    } else {
                        class788.field10788[var5][var20][var21] = -1;
                    }
                }
            }
        }
        class356.field4337.method4030(false);
        int var6 = (class199.field2766 - class356.field4337.field3133) / 16;
        class382.field4782 = new int[var6][4];
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var19 = 0; var19 < 4; var19++) {
                class382.field4782[var7][var19] = class356.field4337.method1497((byte) 124);
            }
        }
        class644.field8240 = new int[var6];
        class92.field1263 = new byte[var6][];
        if (arg0 != 65510) {
            method1079((byte) 9);
        }
        class55.field712 = null;
        class448.field5848 = new int[var6];
        class195.field2709 = new int[var6];
        class279.field3625 = new byte[var6][];
        class439.field5768 = null;
        class702.field9287 = new byte[var6][];
        class459.field5994 = new int[var6];
        class256.field3474 = new byte[var6][];
        class484.field6249 = new int[var6];
        int var8 = 0;
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < (class240.field3280 >> 3); var10++) {
                for (int var11 = 0; var11 < class276.field3602 >> 3; var11++) {
                    int var12 = class788.field10788[var9][var10][var11];
                    if (var12 != -1) {
                        int var13 = (var12 & 0xFFFC96) >> 14;
                        int var14 = (var12 & 0x3FFE) >> 3;
                        int var15 = (var13 / 8 << 8) + var14 / 8;
                        for (int var16 = 0; var16 < var8; var16++) {
                            if (class644.field8240[var16] == var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (var15 != -1) {
                            class644.field8240[var8] = var15;
                            int var17 = (var15 & 0xFFE6) >> 8;
                            int var18 = var15 & 0xFF;
                            class195.field2709[var8] = class650.field8282.method135(0, "m" + var17 + "_" + var18);
                            class459.field5994[var8] = class650.field8282.method135(0, "l" + var17 + "_" + var18);
                            class448.field5848[var8] = class650.field8282.method135(0, "um" + var17 + "_" + var18);
                            class484.field6249[var8] = class650.field8282.method135(0, "ul" + var17 + "_" + var18);
                            var8++;
                        }
                    }
                }
            }
        }
        class166.method1057(var2, var4, var3, 11, 101);
    }
}
