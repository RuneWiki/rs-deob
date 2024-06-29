import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class136 {

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "Lvc;")
    public static class310 field2018 = new class310(0, -1);

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "[I")
    public static int[] field2021;

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "[I")
    public static int[] field2020;

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!sr", name = "e", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!sr", name = "f", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!sr", name = "g", descriptor = "Lwn;")
    public static class77 field2024;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lcg;)V")
    public static final void method1016(class271 arg0) {
        if (class406.field5615 >= 255) {
            return;
        }
        class122.field1838[class406.field5615] = arg0;
        class356.field4782[class406.field5615] = false;
        class406.field5615++;
        int var1 = arg0.field3708;
        if (arg0.field3694) {
            var1 = 0;
        }
        int var2 = arg0.field3708;
        if (arg0.field3696) {
            var2 = class409.field5706 - 1;
        }
        for (int var3 = var1; var3 <= var2; var3++) {
            int var4 = 0;
            int var5 = arg0.field2212 + 64 - arg0.field2206 >> 7;
            if (var5 < 0) {
                var4 -= var5;
                var5 = 0;
            }
            int var6 = arg0.field2212 + arg0.field2206 - 64 >> 7;
            if (var6 >= class354.field4768) {
                var6 = class354.field4768 - 1;
            }
            for (int var7 = var5; var7 <= var6; var7++) {
                short var8 = arg0.field3697[var4++];
                int var9 = (var8 >>> 8) + (arg0.field2204 + 64 - arg0.field2206 >> 7);
                int var10 = (var8 & 0xFF) + var9 - 1;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var10 >= class284.field3862) {
                    var10 = class284.field3862 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    int var12 = class296.field4069[var3][var11][var7];
                    if ((var12 & 0xFF) == 0) {
                        class296.field4069[var3][var11][var7] = var12 | class406.field5615;
                    } else if ((var12 & 0xFF00) == 0) {
                        class296.field4069[var3][var11][var7] = var12 | class406.field5615 << 8;
                    } else if ((var12 & 0xFF0000) == 0) {
                        class296.field4069[var3][var11][var7] = var12 | class406.field5615 << 16;
                    } else if ((var12 & 0xFF000000) == 0) {
                        class296.field4069[var3][var11][var7] = var12 | class406.field5615 << 24;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)V")
    public static final void method1017(int arg0) {
        if (arg0 != -1) {
            method1019((byte) 53);
        }
        field2022++;
        if (class98.field1383 == 10) {
            class191.method1321(28, 40);
        }
        if (class98.field1383 == 30) {
            class191.method1321(25, 40);
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(B)V")
    public static final void method1018(byte arg0) {
        if (arg0 < 85) {
            method1019((byte) 2);
        }
        field2019++;
        for (int var1 = 0; var1 < 100; var1++) {
            class363.field4998[var1] = true;
        }
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(B)V")
    public static void method1019(byte arg0) {
        field2018 = null;
        field2021 = null;
        field2024 = null;
        field2020 = null;
        if (arg0 != -81) {
            field2024 = null;
        }
    }

    static {
        new class368("Unable to send abuse report - system busy.", "", "", "");
        field2021 = new int[16384];
        field2020 = new int[16384];
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field2021[var2] = (int) (Math.sin((double) var2 * var0) * 32768.0D);
            field2020[var2] = (int) (Math.cos((double) var2 * var0) * 32768.0D);
        }
    }
}
