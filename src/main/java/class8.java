import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class8 {

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "Z")
    public static boolean field94 = false;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    public static int field93 = 0;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "Lsf;")
    private static class108 field101 = class140.method973(255, "Loaded interfaces");

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "Lsf;")
    public static class108 field99 = field101;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "[I")
    public static int[] field100;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V", line = 13)
    public static void method43(byte arg0) {
        if (arg0 < 33) {
            method44((class108) null, (byte) 5, -29, 92, -82);
        }
        field101 = null;
        field100 = null;
        field99 = null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lsf;BIII)V", line = 31)
    public static final void method44(class108 arg0, byte arg1, int arg2, int arg3, int arg4) {
        class98 var5 = class45.method324(arg3, arg2, (byte) 77);
        field96++;
        if (var5 == null) {
            return;
        }
        int var6 = -107 % ((-arg1 - 68) / 37);
        if (var5.field1657 != null) {
            class286 var7 = new class286();
            var7.field4993 = var5.field1657;
            var7.field5006 = var5;
            var7.field5005 = arg4;
            var7.field4991 = arg0;
            class287.method2053(var7, 6);
        }
        boolean var8 = true;
        if (var5.field1698 > 0) {
            var8 = class34.method240(250, var5);
        }
        if (!var8 || !class212.method1462((byte) -115, arg4 - 1, client.method1815(var5))) {
            return;
        }
        if (arg4 == 1) {
            class256.field4471.method1427(198, 0);
            class24.field363++;
            class256.field4471.method1741(arg2, -1580277072);
            class256.field4471.method1724(false, arg3);
        }
        if (arg4 == 2) {
            class93.field1483++;
            class256.field4471.method1427(248, 0);
            class256.field4471.method1741(arg2, -1580277072);
            class256.field4471.method1724(false, arg3);
        }
        if (arg4 == 3) {
            class147.field2644++;
            class256.field4471.method1427(247, 0);
            class256.field4471.method1741(arg2, -1580277072);
            class256.field4471.method1724(false, arg3);
        }
        if (arg4 == 4) {
            class256.field4471.method1427(90, 0);
            class256.field4471.method1741(arg2, -1580277072);
            class256.field4471.method1724(false, arg3);
            class315.field5421++;
        }
        if (arg4 == 5) {
            class256.field4471.method1427(200, 0);
            class302.field5248++;
            class256.field4471.method1741(arg2, -1580277072);
            class256.field4471.method1724(false, arg3);
        }
        if (arg4 == 6) {
            class256.field4471.method1427(137, 0);
            class157.field2827++;
            class256.field4471.method1741(arg2, -1580277072);
            class256.field4471.method1724(false, arg3);
        }
        if (arg4 == 7) {
            class311.field5383++;
            class256.field4471.method1427(47, 0);
            class256.field4471.method1741(arg2, -1580277072);
            class256.field4471.method1724(false, arg3);
        }
        if (arg4 == 8) {
            class256.field4471.method1427(166, 0);
            class256.field4471.method1741(arg2, -1580277072);
            class62.field996++;
            class256.field4471.method1724(false, arg3);
        }
        if (arg4 == 9) {
            class256.field4471.method1427(157, 0);
            class256.field4471.method1741(arg2, -1580277072);
            class277.field4840++;
            class256.field4471.method1724(false, arg3);
        }
        if (arg4 == 10) {
            class256.field4471.method1427(88, 0);
            class206.field3702++;
            class256.field4471.method1741(arg2, -1580277072);
            class256.field4471.method1724(false, arg3);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)Lse;", line = 171)
    public static final class12 method45(int arg0) {
        if (arg0 != -17289) {
            return (class12) null;
        }
        field95++;
        int var1 = class273.field4795[0] * class155.field2780[0];
        byte[] var2 = class94.field1512[0];
        class12 var5;
        if (class236.field4142[0]) {
            byte[] var6 = class39.field542[0];
            int[] var7 = new int[var1];
            for (int var8 = 0; var8 < var1; var8++) {
                var7[var8] = class242.method1674(class162.method1118(var6[var8], 255) << 24, class321.field5494[class162.method1118(255, var2[var8])]);
            }
            var5 = new class82(class95.field1519, class197.field3560, class154.field2775[0], class88.field1383[0], class155.field2780[0], class273.field4795[0], var7);
        } else {
            int[] var3 = new int[var1];
            for (int var4 = 0; var4 < var1; var4++) {
                var3[var4] = class321.field5494[class162.method1118(var2[var4], 255)];
            }
            var5 = new class12(class95.field1519, class197.field3560, class154.field2775[0], class88.field1383[0], class155.field2780[0], class273.field4795[0], var3);
        }
        class15.method100(1);
        return var5;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILjava/lang/String;)Lsf;", line = 220)
    public static final class108 method46(int arg0, String arg1) {
        field97++;
        byte[] var2;
        try {
            var2 = arg1.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var2 = arg1.getBytes();
        }
        class108 var4 = new class108();
        var4.field1884 = var2;
        if (arg0 != 2754) {
            field94 = true;
        }
        var4.field1870 = 0;
        for (int var5 = 0; var5 < var2.length; var5++) {
            if (var2[var5] != 0) {
                var2[var4.field1870++] = var2[var5];
            }
        }
        return var4;
    }
}
