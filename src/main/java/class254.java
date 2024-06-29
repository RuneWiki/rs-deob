import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class254 extends class171 {

    @OriginalMember(owner = "client!ui", name = "I", descriptor = "Lei;")
    public class144 field4456;

    @OriginalMember(owner = "client!ui", name = "C", descriptor = "Lha;")
    public static class46 field4450 = class271.method1828("::serverjs5drop", -46);

    @OriginalMember(owner = "client!ui", name = "B", descriptor = "Lha;")
    public static class46 field4449 = class271.method1828("::noclip", -46);

    @OriginalMember(owner = "client!ui", name = "H", descriptor = "[I")
    public static int[] field4455 = new int[99];

    @OriginalMember(owner = "client!ui", name = "D", descriptor = "I")
    public static int field4451;

    @OriginalMember(owner = "client!ui", name = "E", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!ui", name = "F", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!ui", name = "G", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!ui", name = "K", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!ui", name = "J", descriptor = "Ljava/lang/String;")
    public static String field4457;

    @OriginalMember(owner = "client!ui", name = "L", descriptor = "[Lue;")
    public static class197[] field4459;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "(I)V")
    public static final void method1713(int arg0) {
        if (arg0 != 2047) {
            return;
        }
        for (int var1 = -1; var1 < class156.field2783; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class129.field2373[var1];
            }
            class81 var3 = class1.field6[var2];
            if (var3 != null) {
                class156.method1155(arg0 - 2094, var3.method642(104), var3);
            }
        }
        field4451++;
    }

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "(I)V")
    public static void method1714(int arg0) {
        field4457 = null;
        field4455 = null;
        if (arg0 != 4) {
            method1713(20);
        }
        field4449 = null;
        field4450 = null;
        field4459 = null;
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lei;)V")
    public class254(class144 arg0) {
        this.field4456 = arg0;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field4455[var1] = var0 / 4;
        }
    }
}
