import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tea")
public abstract class class589 {

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "[I")
    public static int[] field7471 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!tea", name = "e", descriptor = "[Lvj;")
    public static class28[] field7475 = new class28[8];

    @OriginalMember(owner = "client!tea", name = "b", descriptor = "Ldg;")
    public static class20 field7472 = new class20();

    @OriginalMember(owner = "client!tea", name = "c", descriptor = "I")
    public static int field7473;

    @OriginalMember(owner = "client!tea", name = "d", descriptor = "I")
    public static int field7474;

    @OriginalMember(owner = "client!tea", name = "f", descriptor = "Lju;")
    public static class108 field7476;

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(ZI)V")
    public static final void method3167(boolean arg0, int arg1) {
        field7473++;
        if (arg0) {
            if (client.field6070 != -1) {
                class70.method422(arg1 ^ 0x1, client.field6070);
            }
            for (class278 var2 = (class278) class149.field1895.method2610((byte) -113); var2 != null; var2 = (class278) class149.field1895.method2620(arg1 - 1)) {
                if (!var2.method1942(27475)) {
                    var2 = (class278) class149.field1895.method2610((byte) -31);
                    if (var2 == null) {
                        break;
                    }
                }
                class24.method107((byte) -90, var2, true, false);
            }
            client.field6070 = -1;
            class149.field1895 = new class467(8);
            class55.method337(-25572);
            client.field6070 = class251.field3425;
            class575.method3093(false, (byte) 99);
            class135.method783(0);
            class760.method4142(client.field6070);
        }
        class614.field7750 = "";
        class506.field6471 = "";
        class435.field5717 = false;
        class773.method4222((byte) -12);
        class20.field185 = -1;
        class681.method3660(class32.field314, -1);
        class422.field5564 = new class33();
        class422.field5564.field2896 = class240.field3280 * 512 / 2;
        class422.field5564.field4767[0] = class240.field3280 / 2;
        class422.field5564.field2900 = class276.field3602 * 512 / 2;
        class422.field5564.field4758[0] = class276.field3602 / 2;
        class148.field1890 = 0;
        class97.field1309 = 0;
        if (class507.field6476 == 2) {
            class148.field1890 = class270.field3557 << 9;
            class97.field1309 = class746.field10193 << 9;
        } else {
            class83.method527(3);
        }
        class193.method1346((byte) -80);
        if (arg1 != 1) {
            field7472 = null;
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(DI)V")
    public static final void method3168(double arg0, int arg1) {
        if (arg1 >= -19) {
            method3168(-0.10607009651231275D, 42);
        }
        class58.field765.method468(class467.field6041);
        field7474++;
        class58.field765.method450(0, 0, (int) arg0);
        class699.field9263.method991(class58.field765);
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(B)V")
    public static void method3169(byte arg0) {
        if (arg0 != -50) {
            field7472 = null;
        }
        field7476 = null;
        field7471 = null;
        field7475 = null;
        field7472 = null;
    }
}
