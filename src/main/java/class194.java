import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public class class194 {

    @OriginalMember(owner = "client!vda", name = "e", descriptor = "B")
    public byte field2521;

    @OriginalMember(owner = "client!vda", name = "q", descriptor = "[Ljava/lang/String;")
    public static String[] field2533 = new String[100];

    @OriginalMember(owner = "client!vda", name = "d", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!vda", name = "f", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!vda", name = "h", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!vda", name = "j", descriptor = "Lvda;")
    public class194 field2526;

    @OriginalMember(owner = "client!vda", name = "g", descriptor = "Liga;")
    public class481 field2523;

    @OriginalMember(owner = "client!vda", name = "k", descriptor = "Liga;")
    public class481 field2527;

    @OriginalMember(owner = "client!vda", name = "i", descriptor = "Llda;")
    public class511 field2525;

    @OriginalMember(owner = "client!vda", name = "m", descriptor = "Lmd;")
    public class569 field2529;

    @OriginalMember(owner = "client!vda", name = "o", descriptor = "Lmd;")
    public class569 field2531;

    @OriginalMember(owner = "client!vda", name = "c", descriptor = "Lcf;")
    public class629 field2519;

    @OriginalMember(owner = "client!vda", name = "p", descriptor = "Lf;")
    public class787 field2532;

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "S")
    public short field2517;

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "S")
    public short field2518;

    @OriginalMember(owner = "client!vda", name = "l", descriptor = "S")
    public short field2528;

    @OriginalMember(owner = "client!vda", name = "n", descriptor = "S")
    public short field2530;

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "()V")
    public static final void method1281() {
        for (int var0 = class455.field6519; var0 < class504.field7090; var0++) {
            for (int var1 = 0; var1 < class196.field2540; var1++) {
                for (int var2 = 0; var2 < class247.field3229; var2++) {
                    class194 var3 = class443.field6387[var0][var1][var2];
                    if (var3 != null) {
                        class481 var4 = var3.field2527;
                        class481 var5 = var3.field2523;
                        if (var4 != null && var4.method126((byte) -34)) {
                            class278.method1825(var4, var0, var1, var2, 1, 1);
                            if (var5 != null && var5.method126((byte) -34)) {
                                class278.method1825(var5, var0, var1, var2, 1, 1);
                                var5.method129(0, var4, (byte) -103, 0, 0, class34.field372, false);
                                var5.method127(-13127);
                            }
                            var4.method127(-13127);
                        }
                        for (class511 var6 = var3.field2525; var6 != null; var6 = var6.field7127) {
                            class539 var8 = var6.field7126;
                            if (var8 != null && var8.method126((byte) -34)) {
                                class278.method1825(var8, var0, var1, var2, var8.field7455 + 1 - var8.field7466, var8.field7453 - var8.field7467 + 1);
                                var8.method127(-13127);
                            }
                        }
                        class629 var7 = var3.field2519;
                        if (var7 != null && var7.method126((byte) -34)) {
                            class610.method3393(var7, var0, var1, var2);
                            var7.method127(-13127);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(I)V")
    public class194(int arg0) {
        this.field2521 = (byte) arg0;
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(I)V")
    public static void method1282(int arg0) {
        if (arg0 >= -89) {
            field2520 = 2;
        }
        field2533 = null;
    }

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "(I)V")
    public final void method1283(int arg0) {
        while (this.field2525 != null) {
            class511 var2 = this.field2525.field7127;
            this.field2525.method2986((byte) 67);
            this.field2525 = var2;
        }
        field2522++;
        if (arg0 > -59) {
            this.field2528 = 108;
        }
    }
}
