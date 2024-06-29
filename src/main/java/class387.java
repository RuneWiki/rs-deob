import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class387 {

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "[I")
    public static int[] field5813 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "S")
    public static short field5815 = 256;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "Lhn;")
    public static class509 field5816 = new class509(7, 4);

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    public static int field5812;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
    public static int field5814;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZB)V")
    public static final void method2419(boolean arg0, byte arg1) {
        field5812++;
        if (arg0 && class7.field80 != null) {
            class347.field5125 = class7.field80.field611;
        } else {
            class347.field5125 = -1;
        }
        class7.field80 = null;
        class34.field394 = null;
        class172.field2549 = 0;
        class401.field5962 = null;
        class7.method52();
        class7.field89.method993(109);
        if (arg1 != -1) {
            field5815 = 50;
        }
        class181.field2718 = null;
        class217.field3577 = null;
        class266.field4074 = null;
        class262.field4018 = null;
        class334.field4988 = -1;
        class59.field713 = null;
        class7.field86 = null;
        class497.field7148 = null;
        class298.field4533 = null;
        class108.field1510 = -1;
        class487.field7008 = null;
        class514.field7473 = null;
        class7.field75.method3076((byte) -126);
        class7.field74.method1056(64, 64, arg1 + 6);
        class7.field75.method3072(false, 64, 128);
        class7.field77.method2977((byte) -127, 64);
        class125.field1856.method1440(64, 1);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
    public static void method2420(int arg0) {
        field5813 = null;
        if (arg0 < 5) {
            method2420(-83);
        }
        field5816 = null;
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V")
    public static final void method2421(int arg0) {
        int var1 = -19 / ((arg0 - 3) / 63);
        field5814++;
        int[] var2 = new int[class390.field5847.field571];
        int var3 = 0;
        for (int var4 = 0; var4 < class390.field5847.field571; var4++) {
            class532 var6 = class390.field5847.method467((byte) -101, var4);
            if (var6.field7800 >= 0 || var6.field7760 >= 0) {
                var2[var3++] = var4;
            }
        }
        class435.field6433 = new int[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            class435.field6433[var5] = var2[var5];
        }
    }
}
