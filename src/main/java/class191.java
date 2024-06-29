import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class191 {

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
    public static int field3491 = 99;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "Lke;")
    public static class256 field3493 = class316.method2202("0", 27626);

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "[Lj;")
    public static class227[] field3495;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(III)V", line = 79)
    public static final void method1384(int arg0, int arg1, int arg2) {
        if (class30.field444 > 0) {
            class148.method1081((byte) 86, class30.field444);
            class30.field444 = 0;
        }
        field3494++;
        if (arg0 != -256) {
            field3491 = 70;
        }
        int var3 = 0;
        short var4 = 256;
        int var5 = class178.field3140 * arg2;
        int var6 = 0;
        for (int var7 = 1; var7 < (var4 - 1); var7++) {
            int var8 = (var4 - var7) * class207.field3751[var7] / var4;
            if (var8 < 0) {
                var8 = 0;
            }
            var6 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = class178.field3146[arg1 + (var5++)];
                int var11 = class313.field5392[var6++];
                if (var11 == 0) {
                    class40.field733.field3921[var3++] = var10;
                } else {
                    int var12 = var11 + 18;
                    if (var12 > 255) {
                        var12 = 255;
                    }
                    int var13 = 256 - var11 - 18;
                    int var14 = class192.field3502[var11];
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    class40.field733.field3921[var3++] = class150.method1123(var13 * class150.method1123(65280, var10) + var12 * class150.method1123(65280, var14), 16711680) + class150.method1123(class150.method1123(var14, 16711935) * var12 + var13 * class150.method1123(16711935, var10), -16711936) >> 8;
                }
            }
            for (int var15 = 0; var15 < var8; var15++) {
                class40.field733.field3921[var3++] = class178.field3146[arg1 + (var5++)];
            }
            var5 += class178.field3140 - 128;
        }
        if (class253.field4323) {
            class60.method476(class40.field733.field3921, arg1, arg2, class40.field733.field2343, class40.field733.field2348);
        } else {
            class40.field733.method646(arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)[B", line = 226)
    public static final byte[] method1385(int arg0, int arg1) {
        field3492++;
        class7 var2 = (class7) class159.field2830.method1260(-61, (long) arg0);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class64.method494(var7, arg1 ^ 0xFFFF81AB, var4);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class7(var3);
            class159.field2830.method1259(var2, (long) arg0, arg1 + 32341);
        }
        if (arg1 != -32341) {
            method1385(21, -18);
        }
        return var2.field102;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V", line = 285)
    public static void method1386(int arg0) {
        field3495 = null;
        if (arg0 == 16711935) {
            field3493 = null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IB)Lke;", line = 338)
    public static final class256 method1387(int arg0, byte arg1) {
        if (arg1 != -104) {
            field3493 = (class256) null;
        }
        field3498++;
        return class130.field2271[arg0].method1799(127) > 0 ? class30.method214(new class256[] { class261.field4510[arg0], class238.field4055, class130.field2271[arg0] }, 29784) : class261.field4510[arg0];
    }
}
