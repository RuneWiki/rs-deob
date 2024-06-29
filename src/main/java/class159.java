import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class159 {

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "[Lha;")
    public static class52[] field1922;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lfu;)V", line = 5)
    public static final void method873(class328 arg0) {
        if (class460.field6344 >= 65535) {
            return;
        }
        class469 var1 = arg0.field4282;
        class602.field8699[class460.field6344] = arg0;
        class175.field2125[class460.field6344] = false;
        class460.field6344++;
        int var2 = arg0.field4274;
        if (arg0.field4278) {
            var2 = 0;
        }
        int var3 = arg0.field4274;
        if (arg0.field4284) {
            var3 = client.field3216 - 1;
        }
        for (int var4 = var2; var4 <= var3; var4++) {
            int var5 = 0;
            int var6 = var1.method2737((byte) -86) + class410.field5342 - var1.method2735((byte) 85) >> class362.field4756;
            if (var6 < 0) {
                var5 -= var6;
                var6 = 0;
            }
            int var7 = var1.method2737((byte) -86) + var1.method2735((byte) 86) - class410.field5342 >> class362.field4756;
            if (var7 >= class548.field8061) {
                var7 = class548.field8061 - 1;
            }
            for (int var8 = var6; var8 <= var7; var8++) {
                short var9 = arg0.field4271[var5++];
                int var10 = (var1.method2731((byte) -96) + class410.field5342 - var1.method2735((byte) 108) >> class362.field4756) + (var9 >>> 8);
                int var11 = (var9 & 0xFF) + var10 - 1;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 >= class238.field2985) {
                    var11 = class238.field2985 - 1;
                }
                for (int var12 = var10; var12 <= var11; var12++) {
                    long var13 = class209.field2558[var4][var12][var8];
                    if ((var13 & 0xFFFFL) == 0L) {
                        class209.field2558[var4][var12][var8] = var13 | (long) class460.field6344;
                    } else if ((var13 & 0xFFFF0000L) == 0L) {
                        class209.field2558[var4][var12][var8] = var13 | (long) class460.field6344 << 16;
                    } else if ((var13 & 0xFFFF00000000L) == 0L) {
                        class209.field2558[var4][var12][var8] = var13 | (long) class460.field6344 << 32;
                    } else if ((var13 & 0xFFFF000000000000L) == 0L) {
                        class209.field2558[var4][var12][var8] = var13 | (long) class460.field6344 << 48;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)V", line = 100)
    public static void method874(int arg0) {
        field1922 = null;
        int var1 = -112 % ((-arg0 - 59) / 45);
    }
}
