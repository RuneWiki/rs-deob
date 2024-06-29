import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class356 {

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
    public static int field5645 = 0;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "[I")
    public static int[] field5647 = new int[128];

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "Lpa;")
    public static class296 field5648 = new class296();

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    public static int field5644;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
    public static int field5646;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;", line = 5)
    public static final String[] method2515(int arg0, String[] arg1) {
        field5644++;
        String[] var2 = new String[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
        }
        if (arg0 != 1) {
            field5645 = -74;
        }
        return var2;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILwf;IB)V", line = 62)
    public static final void method2516(int arg0, class250 arg1, int arg2, byte arg3) {
        field5646++;
        if (class104.field1683 < 2 && class16.field186 == 0 && !class227.field3789) {
            return;
        }
        if (arg3 != -17) {
            method2516(-70, (class250) null, 113, (byte) -14);
        }
        String var4 = class57.method485(arg3 ^ 0x11);
        if (arg1 == null) {
            int var5 = class109.field1792.method1347(var4, arg0 + 4, arg2 - -15, 16777215, 0, class204.field3221, class250.field4163);
            class56.method441(arg0 + 4, -96, arg2, class109.field1792.method1338(var4) + var5, 15);
            return;
        }
        class171 var6 = arg1.method1941(class34.field504, 65535);
        if (var6 == null) {
            var6 = class109.field1792;
        }
        var6.method1326(var4, arg0, arg2, arg1.field4081, arg1.field4157, arg1.field4068, arg1.field4125, arg1.field4123, arg1.field4209, class204.field3221, class250.field4163, class173.field2762);
        class56.method441(class173.field2762[0], arg3 ^ 0x24, class173.field2762[1], class173.field2762[2], class173.field2762[3]);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V", line = 96)
    public static void method2517(int arg0) {
        field5648 = null;
        field5647 = null;
        if (arg0 != 5888) {
            field5645 = 36;
        }
    }
}
