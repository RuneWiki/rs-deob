import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mha")
public class class436 {

    @OriginalMember(owner = "client!mha", name = "b", descriptor = "I")
    public static int field5747;

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "Lwb;")
    public static class350 field5746;

    @OriginalMember(owner = "client!mha", name = "c", descriptor = "Lkfa;")
    public static class629 field5748;

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "([BI)V", line = 3)
    public static final void method2575(byte[] arg0, int arg1) {
        field5747++;
        class403 var2 = new class403(arg0);
        while (true) {
            while (true) {
                int var3 = var2.method2396((byte) 75);
                if (var3 == 0) {
                    if (arg1 > -68) {
                        method2576(120);
                        return;
                    }
                    return;
                }
                if (var3 == 1) {
                    int[] var4 = class434.field5725 = new int[6];
                    var4[0] = var2.method2390((byte) 38);
                    var4[1] = var2.method2390((byte) 70);
                    var4[2] = var2.method2390((byte) -122);
                    var4[3] = var2.method2390((byte) -114);
                    var4[4] = var2.method2390((byte) 18);
                    var4[5] = var2.method2390((byte) 103);
                } else if (var3 == 4) {
                    int var7 = var2.method2396((byte) 50);
                    class612.field8214 = new int[var7];
                    for (int var8 = 0; var8 < var7; var8++) {
                        class612.field8214[var8] = var2.method2390((byte) -124);
                        if (class612.field8214[var8] == 65535) {
                            class612.field8214[var8] = -1;
                        }
                    }
                } else if (var3 == 5) {
                    int var5 = var2.method2396((byte) 80);
                    class359.field4454 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        class359.field4454[var6] = var2.method2390((byte) 58);
                        if (class359.field4454[var6] == 65535) {
                            class359.field4454[var6] = -1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(I)V", line = 78)
    public static void method2576(int arg0) {
        field5748 = null;
        if (arg0 == 6) {
            field5746 = null;
        }
    }
}
