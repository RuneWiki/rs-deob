import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class319 {

    @OriginalMember(owner = "client!t", name = "b", descriptor = "Ljj;")
    public static class156 field4606 = new class156(32);

    @OriginalMember(owner = "client!t", name = "j", descriptor = "I")
    public static int field4614 = 0;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "Lce;")
    public static class345 field4613 = new class345(16);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "I")
    public int field4605;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "I")
    public int field4608;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "I")
    public int field4611;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!t", name = "k", descriptor = "I")
    public int field4615;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(B)V")
    public static final void method2134(byte arg0) {
        class273.field4110 = null;
        class387.field5545 = null;
        class210.field3088 = null;
        if (arg0 < 88) {
            method2135((String) null, (byte) -117);
        }
        class121.field1899 = null;
        class52.field856 = null;
        class277.field4169 = null;
        field4610++;
        class139.field2210 = null;
        class6.field56 = null;
        class171.field2548 = null;
        class140.field2223 = null;
        class250.field3620 = null;
        class179.field2669 = null;
        class200.field2924 = null;
        class333.field4784 = null;
        class186.field2739 = null;
        class443.field6423 = null;
        class107.field1763 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method2135(String arg0, byte arg1) {
        if (class137.field2192 == null) {
            class59.method456(false);
        }
        field4607++;
        String[] var2 = class169.method1289(arg0, '\n', 26329);
        for (int var3 = 0; var3 < var2.length; var3++) {
            for (int var5 = class137.field2192.length - 1; var5 > 0; var5--) {
                class137.field2192[var5] = class137.field2192[var5 - 1];
            }
            class137.field2192[0] = var2[var3];
        }
        int var4 = 50 % ((-arg1 - 14) / 55);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lhs;)V")
    public static final void method2136(class420 arg0) {
        if (class336.field4811 >= 255) {
            return;
        }
        class115.field1834[class336.field4811] = arg0;
        class354.field5034[class336.field4811] = false;
        class336.field4811++;
        int var1 = arg0.field6124;
        if (arg0.field6123) {
            var1 = 0;
        }
        int var2 = arg0.field6124;
        if (arg0.field6119) {
            var2 = class13.field218 - 1;
        }
        for (int var3 = var1; var3 <= var2; var3++) {
            int var4 = 0;
            int var5 = arg0.field945 + 64 - arg0.field943 >> 7;
            if (var5 < 0) {
                var4 -= var5;
                var5 = 0;
            }
            int var6 = arg0.field945 + arg0.field943 - 64 >> 7;
            if (var6 >= class436.field6353) {
                var6 = class436.field6353 - 1;
            }
            for (int var7 = var5; var7 <= var6; var7++) {
                short var8 = arg0.field6138[var4++];
                int var9 = (var8 >>> 8) + (arg0.field942 + 64 - arg0.field943 >> 7);
                int var10 = (var8 & 0xFF) + var9 - 1;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var10 >= class139.field2209) {
                    var10 = class139.field2209 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    int var12 = class450.field6537[var3][var11][var7];
                    if ((var12 & 0xFF) == 0) {
                        class450.field6537[var3][var11][var7] = var12 | class336.field4811;
                    } else if ((var12 & 0xFF00) == 0) {
                        class450.field6537[var3][var11][var7] = var12 | class336.field4811 << 8;
                    } else if ((var12 & 0xFF0000) == 0) {
                        class450.field6537[var3][var11][var7] = var12 | class336.field4811 << 16;
                    } else if ((var12 & 0xFF000000) == 0) {
                        class450.field6537[var3][var11][var7] = var12 | class336.field4811 << 24;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
    public static final void method2137(int arg0) {
        field4612++;
        class44.field654.method106((byte) -118);
        if (arg0 != 19805) {
            method2137(0);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)V")
    public static void method2138(boolean arg0) {
        field4613 = null;
        if (arg0) {
            field4606 = null;
        }
    }
}
