import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class201 extends class130 {

    @OriginalMember(owner = "client!bs", name = "v", descriptor = "I")
    public int field3012 = (int) (class450.method2719((byte) 127) / 1000L);

    @OriginalMember(owner = "client!bs", name = "u", descriptor = "Ljava/lang/String;")
    public String field3011;

    @OriginalMember(owner = "client!bs", name = "r", descriptor = "S")
    public short field3008;

    @OriginalMember(owner = "client!bs", name = "s", descriptor = "Ljava/lang/String;")
    public static String field3009 = "";

    @OriginalMember(owner = "client!bs", name = "p", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!bs", name = "q", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!bs", name = "t", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!bs", name = "w", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "(B)V", line = 5)
    public static final void method1301(byte arg0) {
        field3010++;
        class277.field4064 = 0;
        int var1 = class271.field4010.method2600(-53);
        if (arg0 > -31) {
            return;
        }
        int var2 = class271.field4010.method2620(75);
        boolean var3 = class271.field4010.method2574((byte) 100) == 1;
        int var4 = class271.field4010.method2616(72);
        class41.method209(255);
        class203.method1312(var1, 4);
        int var5 = (class425.field6072 - class271.field4010.field6221) / 16;
        class69.field787 = new int[var5][4];
        for (int var6 = 0; var6 < var5; var6++) {
            for (int var10 = 0; var10 < 4; var10++) {
                class69.field787[var6][var10] = class271.field4010.method2589(-11179);
            }
        }
        class184.field2800 = null;
        class382.field5584 = new int[var5];
        class162.field2164 = new byte[var5][];
        class370.field5345 = new int[var5];
        class370.field5354 = null;
        class268.field3984 = new byte[var5][];
        class256.field3741 = new int[var5];
        class347.field5052 = new int[var5];
        class546.field8156 = new byte[var5][];
        class62.field727 = new int[var5];
        class142.field1853 = new byte[var5][];
        int var7 = 0;
        for (int var8 = (var4 - (class35.field399 >> 4)) / 8; var8 <= ((class35.field399 >> 4) + var4) / 8; var8++) {
            for (int var9 = (var2 - (class382.field5586 >> 4)) / 8; var9 <= ((class382.field5586 >> 4) + var2) / 8; var9++) {
                class256.field3741[var7] = (var8 << 8) + var9;
                class347.field5052[var7] = class594.field8766.method3478(-1, "m" + var8 + "_" + var9);
                class62.field727[var7] = class594.field8766.method3478(-1, "l" + var8 + "_" + var9);
                class382.field5584[var7] = class594.field8766.method3478(-1, "um" + var8 + "_" + var9);
                class370.field5345[var7] = class594.field8766.method3478(-1, "ul" + var8 + "_" + var9);
                var7++;
            }
        }
        class11.method53(var3, var2, -5762, 10, var4);
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(ILwca;)Lwca;", line = 81)
    public static final class311 method1302(int arg0, class311 arg1) {
        field3006++;
        class311 var2 = client.method3603(arg1);
        if (arg0 >= -66) {
            method1301((byte) -104);
        }
        if (var2 == null) {
            var2 = arg1.field4633;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Z)V", line = 100)
    public static void method1303(boolean arg0) {
        field3009 = null;
        if (arg0) {
            method1301((byte) 31);
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(BIII)V", line = 113)
    public static final void method1304(byte arg0, int arg1, int arg2, int arg3) {
        field3013++;
        if (arg0 == -38) {
            class278 var4 = class468.field6812[arg3][arg2];
            class228.method1491(arg1, -91, var4 == null ? class136.field1806 : var4);
        }
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(BI)V", line = 131)
    public static final void method1305(byte arg0, int arg1) {
        if (class481.field7293 == null || arg1 > class481.field7293.length) {
            class481.field7293 = new int[arg1];
        }
        field3007++;
        if (arg0 >= -127) {
            method1302(-44, null);
        }
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 146)
    public class201(String arg0, int arg1) {
        this.field3011 = arg0;
        this.field3008 = (short) arg1;
    }
}
