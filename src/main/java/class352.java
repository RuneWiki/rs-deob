import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class352 extends class390 {

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "S")
    public short field4816;

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "[I")
    public static int[] field4819 = new int[99];

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "[Lkg;")
    public static class148[] field4818 = new class148[6];

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "I")
    public static int field4820 = -1;

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "[I")
    public static int[] field4823;

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "[S")
    public static short[] field4821;

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "Lkn;")
    public static class442 field4824;

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "[Ljava/lang/String;")
    public static String[] field4825;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "Lbo;")
    public static class435 field4822;

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "()V")
    public class352() {
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IILms;I)V")
    public static final void method2225(int arg0, int arg1, class453 arg2, int arg3) {
        field4817++;
        if (class432.field6109 != null || class271.field3762 || arg2 == null || class410.method2565(arg2, (byte) 100) == null) {
            return;
        }
        class432.field6109 = arg2;
        client.field2275 = class410.method2565(arg2, (byte) 114);
        class5.field92 = false;
        class388.field5573 = arg0;
        class73.field1048 = arg3;
        class243.field3451 = arg1;
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(B)V")
    public static void method2226(byte arg0) {
        field4819 = null;
        field4825 = null;
        field4823 = null;
        field4818 = null;
        if (arg0 >= -92) {
            field4822 = null;
        }
        field4822 = null;
        field4824 = null;
        field4821 = null;
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(S)V")
    public class352(short arg0) {
        this.field4816 = arg0;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field4819[var1] = var0 / 4;
        }
        field4823 = new int[13];
        field4821 = new short[] { -4160, -4163, -8256, -8259, 22461 };
        field4824 = new class442("Hidden", "Versteckt", "Caché", "Oculto");
        field4825 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
    }
}
