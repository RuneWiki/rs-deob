import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public class class295 extends Exception {

    @OriginalMember(owner = "client!saa", name = "e", descriptor = "I")
    public static int field3874 = 0;

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!saa", name = "b", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!saa", name = "c", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!saa", name = "d", descriptor = "[Lwv;")
    public static class32[] field3873;

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(I)V")
    public static void method1676(int arg0) {
        field3873 = null;
        int var1 = 8 % ((arg0 - 30) / 53);
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(ZB[B)V")
    public static final void method1677(boolean arg0, byte arg1, byte[] arg2) {
        if (arg1 <= 102) {
            return;
        }
        if (class653.field9328 == null) {
            class653.field9328 = new class452(20000);
        }
        field3872++;
        class653.field9328.method2514(arg2.length, arg2, -27824, 0);
        if (!arg0) {
            return;
        }
        class410.method2222(class653.field9328.field6209, true);
        class520.field7448 = new class620[class212.field2565];
        int var3 = 0;
        for (int var4 = class309.field4009; var4 <= class87.field931; var4++) {
            class620 var5 = class383.method2108((byte) 93, var4);
            if (var5 != null) {
                class520.field7448[var3++] = var5;
            }
        }
        class415.field5504 = false;
        class690.field9742 = class641.method3604(false);
        class653.field9328 = null;
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(B)V")
    public static final void method1678(byte arg0) {
        if (arg0 != -66) {
            field3873 = null;
        }
        field3870++;
        int var1 = (int) ((double) class399.field5338 * 34.46D);
        int var2 = var1 << 2;
        if (class453.field6284.method377()) {
            var2 += 512;
        }
        class453.field6284.method342(200, var2);
    }
}
